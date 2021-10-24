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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Bookmark. This utility wraps
 * <code>com.liferay.training.bookmarks.service.impl.BookmarkServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see BookmarkService
 * @generated
 */
public class BookmarkServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.bookmarks.service.impl.BookmarkServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.training.bookmarks.model.Bookmark addBookmark(
			long groupId, String title, String description, String url,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addBookmark(
			groupId, title, description, url, serviceContext);
	}

	public static java.util.List<com.liferay.training.bookmarks.model.Bookmark>
		getBookmarksForCurrentUser(
			com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().getBookmarksForCurrentUser(serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static void removeBookmarkById(
		long bookmarkId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		getService().removeBookmarkById(bookmarkId, serviceContext);
	}

	public static BookmarkService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BookmarkService, BookmarkService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(BookmarkService.class);

		ServiceTracker<BookmarkService, BookmarkService> serviceTracker =
			new ServiceTracker<BookmarkService, BookmarkService>(
				bundle.getBundleContext(), BookmarkService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}