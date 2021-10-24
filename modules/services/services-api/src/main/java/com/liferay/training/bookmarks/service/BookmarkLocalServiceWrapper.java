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
 * Provides a wrapper for {@link BookmarkLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BookmarkLocalService
 * @generated
 */
public class BookmarkLocalServiceWrapper
	implements BookmarkLocalService, ServiceWrapper<BookmarkLocalService> {

	public BookmarkLocalServiceWrapper(
		BookmarkLocalService bookmarkLocalService) {

		_bookmarkLocalService = bookmarkLocalService;
	}

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
	@Override
	public com.liferay.training.bookmarks.model.Bookmark addBookmark(
		com.liferay.training.bookmarks.model.Bookmark bookmark) {

		return _bookmarkLocalService.addBookmark(bookmark);
	}

	@Override
	public com.liferay.training.bookmarks.model.Bookmark addBookmark(
			long groupId, String title, String description, String url,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookmarkLocalService.addBookmark(
			groupId, title, description, url, serviceContext);
	}

	/**
	 * Creates a new bookmark with the primary key. Does not add the bookmark to the database.
	 *
	 * @param bookmarkId the primary key for the new bookmark
	 * @return the new bookmark
	 */
	@Override
	public com.liferay.training.bookmarks.model.Bookmark createBookmark(
		long bookmarkId) {

		return _bookmarkLocalService.createBookmark(bookmarkId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookmarkLocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public com.liferay.training.bookmarks.model.Bookmark deleteBookmark(
		com.liferay.training.bookmarks.model.Bookmark bookmark) {

		return _bookmarkLocalService.deleteBookmark(bookmark);
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
	@Override
	public com.liferay.training.bookmarks.model.Bookmark deleteBookmark(
			long bookmarkId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookmarkLocalService.deleteBookmark(bookmarkId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookmarkLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bookmarkLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _bookmarkLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _bookmarkLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _bookmarkLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _bookmarkLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _bookmarkLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.bookmarks.model.Bookmark fetchBookmark(
		long bookmarkId) {

		return _bookmarkLocalService.fetchBookmark(bookmarkId);
	}

	/**
	 * Returns the bookmark matching the UUID and group.
	 *
	 * @param uuid the bookmark's UUID
	 * @param groupId the primary key of the group
	 * @return the matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	@Override
	public com.liferay.training.bookmarks.model.Bookmark
		fetchBookmarkByUuidAndGroupId(String uuid, long groupId) {

		return _bookmarkLocalService.fetchBookmarkByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _bookmarkLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the bookmark with the primary key.
	 *
	 * @param bookmarkId the primary key of the bookmark
	 * @return the bookmark
	 * @throws PortalException if a bookmark with the primary key could not be found
	 */
	@Override
	public com.liferay.training.bookmarks.model.Bookmark getBookmark(
			long bookmarkId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookmarkLocalService.getBookmark(bookmarkId);
	}

	/**
	 * Returns the bookmark matching the UUID and group.
	 *
	 * @param uuid the bookmark's UUID
	 * @param groupId the primary key of the group
	 * @return the matching bookmark
	 * @throws PortalException if a matching bookmark could not be found
	 */
	@Override
	public com.liferay.training.bookmarks.model.Bookmark
			getBookmarkByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookmarkLocalService.getBookmarkByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<com.liferay.training.bookmarks.model.Bookmark>
		getBookmarks(int start, int end) {

		return _bookmarkLocalService.getBookmarks(start, end);
	}

	/**
	 * Returns all the bookmarks matching the UUID and company.
	 *
	 * @param uuid the UUID of the bookmarks
	 * @param companyId the primary key of the company
	 * @return the matching bookmarks, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.training.bookmarks.model.Bookmark>
		getBookmarksByUuidAndCompanyId(String uuid, long companyId) {

		return _bookmarkLocalService.getBookmarksByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.liferay.training.bookmarks.model.Bookmark>
		getBookmarksByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.bookmarks.model.Bookmark>
					orderByComparator) {

		return _bookmarkLocalService.getBookmarksByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of bookmarks.
	 *
	 * @return the number of bookmarks
	 */
	@Override
	public int getBookmarksCount() {
		return _bookmarkLocalService.getBookmarksCount();
	}

	@Override
	public java.util.List<com.liferay.training.bookmarks.model.Bookmark>
		getBookmarksForCurrentUser(
			com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _bookmarkLocalService.getBookmarksForCurrentUser(serviceContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _bookmarkLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _bookmarkLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _bookmarkLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookmarkLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public void removeBookmarkById(
		long bookmarkId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		_bookmarkLocalService.removeBookmarkById(bookmarkId, serviceContext);
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
	@Override
	public com.liferay.training.bookmarks.model.Bookmark updateBookmark(
		com.liferay.training.bookmarks.model.Bookmark bookmark) {

		return _bookmarkLocalService.updateBookmark(bookmark);
	}

	@Override
	public BookmarkLocalService getWrappedService() {
		return _bookmarkLocalService;
	}

	@Override
	public void setWrappedService(BookmarkLocalService bookmarkLocalService) {
		_bookmarkLocalService = bookmarkLocalService;
	}

	private BookmarkLocalService _bookmarkLocalService;

}