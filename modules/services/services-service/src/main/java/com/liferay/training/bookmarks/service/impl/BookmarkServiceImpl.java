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
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.training.bookmarks.model.Bookmark;
import com.liferay.training.bookmarks.service.base.BookmarkServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * The implementation of the bookmark remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.training.bookmarks.service.BookmarkService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BookmarkServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=bookmark",
		"json.web.service.context.path=Bookmark"
	},
	service = AopService.class
)
public class BookmarkServiceImpl extends BookmarkServiceBaseImpl {

	public Bookmark addBookmark(long groupId, String title, String description, String url
			, ServiceContext serviceContext) throws PortalException {
		return bookmarkLocalService.addBookmark
				(groupId,title,description,url,serviceContext);
	}
	public void removeBookmarkById(long bookmarkId,ServiceContext serviceContext)
	{
		bookmarkLocalService.removeBookmarkById(bookmarkId,serviceContext);
	}
	public List<Bookmark> getBookmarksForCurrentUser(ServiceContext serviceContext)
	{
		return bookmarkLocalService.getBookmarksForCurrentUser(serviceContext);
	}
}