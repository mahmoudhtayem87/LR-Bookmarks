/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.bookmarks.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.training.bookmarks.model.Bookmark;
import com.liferay.training.bookmarks.service.base.BookmarkLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.awt.print.Book;
import java.util.Date;
import java.util.List;

/**
 * The implementation of the bookmark local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.training.bookmarks.service.BookmarkLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BookmarkLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.training.bookmarks.model.Bookmark",
	service = AopService.class
)
public class BookmarkLocalServiceImpl extends BookmarkLocalServiceBaseImpl {

	public Bookmark addBookmark(long groupId,String title, String description, String url
			,ServiceContext serviceContext) throws PortalException {
		Group group = groupLocalService.getGroup(groupId);
		long userId = serviceContext.getUserId();
		User user = userLocalService.getUser(userId);
		// Generate primary key for the bookmark.
		long bookmarkId = counterLocalService.increment(Bookmark.class.getName());
		Bookmark toBeCreated = createBookmark(bookmarkId);
		toBeCreated.setGroupId(groupId);
		toBeCreated.setUserId(userId);
		toBeCreated.setUserName(user.getScreenName());
		toBeCreated.setCreateDate(serviceContext.getCreateDate(new Date()));
		toBeCreated.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		toBeCreated.setTitle(title);
		toBeCreated.setDescription(description);
		toBeCreated.setUrl(url);
		return super.addBookmark(toBeCreated);
	}
	public void removeBookmarkById(long bookmarkId,ServiceContext serviceContext)
	{
		bookmarkPersistence.removeByBookmarkId(bookmarkId);
	}
	public List<Bookmark> getBookmarksForCurrentUser(ServiceContext serviceContext)
	{
		List<Bookmark> result =
				bookmarkPersistence.findByUserId(serviceContext.getUserId());
		return result;
	}
}