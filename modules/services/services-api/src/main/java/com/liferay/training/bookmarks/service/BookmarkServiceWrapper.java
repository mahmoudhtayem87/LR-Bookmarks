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

package com.liferay.training.bookmarks.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BookmarkService}.
 *
 * @author Brian Wing Shun Chan
 * @see BookmarkService
 * @generated
 */
public class BookmarkServiceWrapper
	implements BookmarkService, ServiceWrapper<BookmarkService> {

	public BookmarkServiceWrapper(BookmarkService bookmarkService) {
		_bookmarkService = bookmarkService;
	}

	@Override
	public com.liferay.training.bookmarks.model.Bookmark addBookmark(
			long groupId, String title, String description, String url,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookmarkService.addBookmark(
			groupId, title, description, url, serviceContext);
	}

	@Override
	public java.util.List<com.liferay.training.bookmarks.model.Bookmark>
		getBookmarksForCurrentUser(
			com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _bookmarkService.getBookmarksForCurrentUser(serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _bookmarkService.getOSGiServiceIdentifier();
	}

	@Override
	public void removeBookmarkById(
		long bookmarkId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		_bookmarkService.removeBookmarkById(bookmarkId, serviceContext);
	}

	@Override
	public BookmarkService getWrappedService() {
		return _bookmarkService;
	}

	@Override
	public void setWrappedService(BookmarkService bookmarkService) {
		_bookmarkService = bookmarkService;
	}

	private BookmarkService _bookmarkService;

}