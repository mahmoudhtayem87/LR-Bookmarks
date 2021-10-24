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
 * Provides the local service utility for Bookmark. This utility wraps
 * <code>com.liferay.training.bookmarks.service.impl.BookmarkLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see BookmarkLocalService
 * @generated
 */
public class BookmarkLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.bookmarks.service.impl.BookmarkLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the bookmark to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BookmarkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bookmark the bookmark
	 * @return the bookmark that was added
	 */
	public static com.liferay.training.bookmarks.model.Bookmark addBookmark(
		com.liferay.training.bookmarks.model.Bookmark bookmark) {

		return getService().addBookmark(bookmark);
	}

	public static com.liferay.training.bookmarks.model.Bookmark addBookmark(
			long groupId, String title, String description, String url,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addBookmark(
			groupId, title, description, url, serviceContext);
	}

	/**
	 * Creates a new bookmark with the primary key. Does not add the bookmark to the database.
	 *
	 * @param bookmarkId the primary key for the new bookmark
	 * @return the new bookmark
	 */
	public static com.liferay.training.bookmarks.model.Bookmark createBookmark(
		long bookmarkId) {

		return getService().createBookmark(bookmarkId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the bookmark from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BookmarkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bookmark the bookmark
	 * @return the bookmark that was removed
	 */
	public static com.liferay.training.bookmarks.model.Bookmark deleteBookmark(
		com.liferay.training.bookmarks.model.Bookmark bookmark) {

		return getService().deleteBookmark(bookmark);
	}

	/**
	 * Deletes the bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BookmarkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bookmarkId the primary key of the bookmark
	 * @return the bookmark that was removed
	 * @throws PortalException if a bookmark with the primary key could not be found
	 */
	public static com.liferay.training.bookmarks.model.Bookmark deleteBookmark(
			long bookmarkId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteBookmark(bookmarkId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.bookmarks.model.impl.BookmarkModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.bookmarks.model.impl.BookmarkModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.training.bookmarks.model.Bookmark fetchBookmark(
		long bookmarkId) {

		return getService().fetchBookmark(bookmarkId);
	}

	/**
	 * Returns the bookmark matching the UUID and group.
	 *
	 * @param uuid the bookmark's UUID
	 * @param groupId the primary key of the group
	 * @return the matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public static com.liferay.training.bookmarks.model.Bookmark
		fetchBookmarkByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchBookmarkByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the bookmark with the primary key.
	 *
	 * @param bookmarkId the primary key of the bookmark
	 * @return the bookmark
	 * @throws PortalException if a bookmark with the primary key could not be found
	 */
	public static com.liferay.training.bookmarks.model.Bookmark getBookmark(
			long bookmarkId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getBookmark(bookmarkId);
	}

	/**
	 * Returns the bookmark matching the UUID and group.
	 *
	 * @param uuid the bookmark's UUID
	 * @param groupId the primary key of the group
	 * @return the matching bookmark
	 * @throws PortalException if a matching bookmark could not be found
	 */
	public static com.liferay.training.bookmarks.model.Bookmark
			getBookmarkByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getBookmarkByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the bookmarks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.bookmarks.model.impl.BookmarkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bookmarks
	 * @param end the upper bound of the range of bookmarks (not inclusive)
	 * @return the range of bookmarks
	 */
	public static java.util.List<com.liferay.training.bookmarks.model.Bookmark>
		getBookmarks(int start, int end) {

		return getService().getBookmarks(start, end);
	}

	/**
	 * Returns all the bookmarks matching the UUID and company.
	 *
	 * @param uuid the UUID of the bookmarks
	 * @param companyId the primary key of the company
	 * @return the matching bookmarks, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.training.bookmarks.model.Bookmark>
		getBookmarksByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getBookmarksByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of bookmarks matching the UUID and company.
	 *
	 * @param uuid the UUID of the bookmarks
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of bookmarks
	 * @param end the upper bound of the range of bookmarks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching bookmarks, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.training.bookmarks.model.Bookmark>
		getBookmarksByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.bookmarks.model.Bookmark>
					orderByComparator) {

		return getService().getBookmarksByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of bookmarks.
	 *
	 * @return the number of bookmarks
	 */
	public static int getBookmarksCount() {
		return getService().getBookmarksCount();
	}

	public static java.util.List<com.liferay.training.bookmarks.model.Bookmark>
		getBookmarksForCurrentUser(
			com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().getBookmarksForCurrentUser(serviceContext);
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static void removeBookmarkById(
		long bookmarkId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		getService().removeBookmarkById(bookmarkId, serviceContext);
	}

	/**
	 * Updates the bookmark in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BookmarkLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bookmark the bookmark
	 * @return the bookmark that was updated
	 */
	public static com.liferay.training.bookmarks.model.Bookmark updateBookmark(
		com.liferay.training.bookmarks.model.Bookmark bookmark) {

		return getService().updateBookmark(bookmark);
	}

	public static BookmarkLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BookmarkLocalService, BookmarkLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(BookmarkLocalService.class);

		ServiceTracker<BookmarkLocalService, BookmarkLocalService>
			serviceTracker =
				new ServiceTracker<BookmarkLocalService, BookmarkLocalService>(
					bundle.getBundleContext(), BookmarkLocalService.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}