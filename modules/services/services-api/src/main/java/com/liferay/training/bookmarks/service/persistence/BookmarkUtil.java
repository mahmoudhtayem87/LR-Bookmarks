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

package com.liferay.training.bookmarks.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.bookmarks.model.Bookmark;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the bookmark service. This utility wraps <code>com.liferay.training.bookmarks.service.persistence.impl.BookmarkPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BookmarkPersistence
 * @generated
 */
public class BookmarkUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Bookmark bookmark) {
		getPersistence().clearCache(bookmark);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Bookmark> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Bookmark> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Bookmark> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Bookmark> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Bookmark> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Bookmark update(Bookmark bookmark) {
		return getPersistence().update(bookmark);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Bookmark update(
		Bookmark bookmark, ServiceContext serviceContext) {

		return getPersistence().update(bookmark, serviceContext);
	}

	/**
	 * Returns all the bookmarks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching bookmarks
	 */
	public static List<Bookmark> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the bookmarks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookmarkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bookmarks
	 * @param end the upper bound of the range of bookmarks (not inclusive)
	 * @return the range of matching bookmarks
	 */
	public static List<Bookmark> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the bookmarks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookmarkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bookmarks
	 * @param end the upper bound of the range of bookmarks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bookmarks
	 */
	public static List<Bookmark> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Bookmark> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bookmarks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookmarkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of bookmarks
	 * @param end the upper bound of the range of bookmarks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bookmarks
	 */
	public static List<Bookmark> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Bookmark> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first bookmark in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark
	 * @throws NoSuchBookmarkException if a matching bookmark could not be found
	 */
	public static Bookmark findByUuid_First(
			String uuid, OrderByComparator<Bookmark> orderByComparator)
		throws com.liferay.training.bookmarks.exception.
			NoSuchBookmarkException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first bookmark in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public static Bookmark fetchByUuid_First(
		String uuid, OrderByComparator<Bookmark> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last bookmark in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark
	 * @throws NoSuchBookmarkException if a matching bookmark could not be found
	 */
	public static Bookmark findByUuid_Last(
			String uuid, OrderByComparator<Bookmark> orderByComparator)
		throws com.liferay.training.bookmarks.exception.
			NoSuchBookmarkException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last bookmark in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public static Bookmark fetchByUuid_Last(
		String uuid, OrderByComparator<Bookmark> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the bookmarks before and after the current bookmark in the ordered set where uuid = &#63;.
	 *
	 * @param bookmarkId the primary key of the current bookmark
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bookmark
	 * @throws NoSuchBookmarkException if a bookmark with the primary key could not be found
	 */
	public static Bookmark[] findByUuid_PrevAndNext(
			long bookmarkId, String uuid,
			OrderByComparator<Bookmark> orderByComparator)
		throws com.liferay.training.bookmarks.exception.
			NoSuchBookmarkException {

		return getPersistence().findByUuid_PrevAndNext(
			bookmarkId, uuid, orderByComparator);
	}

	/**
	 * Removes all the bookmarks where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of bookmarks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching bookmarks
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the bookmark where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchBookmarkException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching bookmark
	 * @throws NoSuchBookmarkException if a matching bookmark could not be found
	 */
	public static Bookmark findByUUID_G(String uuid, long groupId)
		throws com.liferay.training.bookmarks.exception.
			NoSuchBookmarkException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the bookmark where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public static Bookmark fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the bookmark where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public static Bookmark fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the bookmark where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the bookmark that was removed
	 */
	public static Bookmark removeByUUID_G(String uuid, long groupId)
		throws com.liferay.training.bookmarks.exception.
			NoSuchBookmarkException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of bookmarks where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching bookmarks
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the bookmarks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching bookmarks
	 */
	public static List<Bookmark> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the bookmarks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookmarkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of bookmarks
	 * @param end the upper bound of the range of bookmarks (not inclusive)
	 * @return the range of matching bookmarks
	 */
	public static List<Bookmark> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the bookmarks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookmarkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of bookmarks
	 * @param end the upper bound of the range of bookmarks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bookmarks
	 */
	public static List<Bookmark> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Bookmark> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bookmarks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookmarkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of bookmarks
	 * @param end the upper bound of the range of bookmarks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bookmarks
	 */
	public static List<Bookmark> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Bookmark> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first bookmark in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark
	 * @throws NoSuchBookmarkException if a matching bookmark could not be found
	 */
	public static Bookmark findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Bookmark> orderByComparator)
		throws com.liferay.training.bookmarks.exception.
			NoSuchBookmarkException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first bookmark in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public static Bookmark fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Bookmark> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last bookmark in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark
	 * @throws NoSuchBookmarkException if a matching bookmark could not be found
	 */
	public static Bookmark findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Bookmark> orderByComparator)
		throws com.liferay.training.bookmarks.exception.
			NoSuchBookmarkException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last bookmark in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public static Bookmark fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Bookmark> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the bookmarks before and after the current bookmark in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param bookmarkId the primary key of the current bookmark
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bookmark
	 * @throws NoSuchBookmarkException if a bookmark with the primary key could not be found
	 */
	public static Bookmark[] findByUuid_C_PrevAndNext(
			long bookmarkId, String uuid, long companyId,
			OrderByComparator<Bookmark> orderByComparator)
		throws com.liferay.training.bookmarks.exception.
			NoSuchBookmarkException {

		return getPersistence().findByUuid_C_PrevAndNext(
			bookmarkId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the bookmarks where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of bookmarks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching bookmarks
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the bookmarks where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching bookmarks
	 */
	public static List<Bookmark> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns a range of all the bookmarks where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookmarkModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of bookmarks
	 * @param end the upper bound of the range of bookmarks (not inclusive)
	 * @return the range of matching bookmarks
	 */
	public static List<Bookmark> findByUserId(long userId, int start, int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the bookmarks where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookmarkModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of bookmarks
	 * @param end the upper bound of the range of bookmarks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bookmarks
	 */
	public static List<Bookmark> findByUserId(
		long userId, int start, int end,
		OrderByComparator<Bookmark> orderByComparator) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bookmarks where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookmarkModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of bookmarks
	 * @param end the upper bound of the range of bookmarks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bookmarks
	 */
	public static List<Bookmark> findByUserId(
		long userId, int start, int end,
		OrderByComparator<Bookmark> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first bookmark in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark
	 * @throws NoSuchBookmarkException if a matching bookmark could not be found
	 */
	public static Bookmark findByUserId_First(
			long userId, OrderByComparator<Bookmark> orderByComparator)
		throws com.liferay.training.bookmarks.exception.
			NoSuchBookmarkException {

		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first bookmark in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public static Bookmark fetchByUserId_First(
		long userId, OrderByComparator<Bookmark> orderByComparator) {

		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last bookmark in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark
	 * @throws NoSuchBookmarkException if a matching bookmark could not be found
	 */
	public static Bookmark findByUserId_Last(
			long userId, OrderByComparator<Bookmark> orderByComparator)
		throws com.liferay.training.bookmarks.exception.
			NoSuchBookmarkException {

		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last bookmark in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public static Bookmark fetchByUserId_Last(
		long userId, OrderByComparator<Bookmark> orderByComparator) {

		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the bookmarks before and after the current bookmark in the ordered set where userId = &#63;.
	 *
	 * @param bookmarkId the primary key of the current bookmark
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bookmark
	 * @throws NoSuchBookmarkException if a bookmark with the primary key could not be found
	 */
	public static Bookmark[] findByUserId_PrevAndNext(
			long bookmarkId, long userId,
			OrderByComparator<Bookmark> orderByComparator)
		throws com.liferay.training.bookmarks.exception.
			NoSuchBookmarkException {

		return getPersistence().findByUserId_PrevAndNext(
			bookmarkId, userId, orderByComparator);
	}

	/**
	 * Removes all the bookmarks where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of bookmarks where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching bookmarks
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Returns all the bookmarks where bookmarkId = &#63;.
	 *
	 * @param bookmarkId the bookmark ID
	 * @return the matching bookmarks
	 */
	public static List<Bookmark> findByBookmarkId(long bookmarkId) {
		return getPersistence().findByBookmarkId(bookmarkId);
	}

	/**
	 * Returns a range of all the bookmarks where bookmarkId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookmarkModelImpl</code>.
	 * </p>
	 *
	 * @param bookmarkId the bookmark ID
	 * @param start the lower bound of the range of bookmarks
	 * @param end the upper bound of the range of bookmarks (not inclusive)
	 * @return the range of matching bookmarks
	 */
	public static List<Bookmark> findByBookmarkId(
		long bookmarkId, int start, int end) {

		return getPersistence().findByBookmarkId(bookmarkId, start, end);
	}

	/**
	 * Returns an ordered range of all the bookmarks where bookmarkId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookmarkModelImpl</code>.
	 * </p>
	 *
	 * @param bookmarkId the bookmark ID
	 * @param start the lower bound of the range of bookmarks
	 * @param end the upper bound of the range of bookmarks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bookmarks
	 */
	public static List<Bookmark> findByBookmarkId(
		long bookmarkId, int start, int end,
		OrderByComparator<Bookmark> orderByComparator) {

		return getPersistence().findByBookmarkId(
			bookmarkId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bookmarks where bookmarkId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookmarkModelImpl</code>.
	 * </p>
	 *
	 * @param bookmarkId the bookmark ID
	 * @param start the lower bound of the range of bookmarks
	 * @param end the upper bound of the range of bookmarks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching bookmarks
	 */
	public static List<Bookmark> findByBookmarkId(
		long bookmarkId, int start, int end,
		OrderByComparator<Bookmark> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByBookmarkId(
			bookmarkId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first bookmark in the ordered set where bookmarkId = &#63;.
	 *
	 * @param bookmarkId the bookmark ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark
	 * @throws NoSuchBookmarkException if a matching bookmark could not be found
	 */
	public static Bookmark findByBookmarkId_First(
			long bookmarkId, OrderByComparator<Bookmark> orderByComparator)
		throws com.liferay.training.bookmarks.exception.
			NoSuchBookmarkException {

		return getPersistence().findByBookmarkId_First(
			bookmarkId, orderByComparator);
	}

	/**
	 * Returns the first bookmark in the ordered set where bookmarkId = &#63;.
	 *
	 * @param bookmarkId the bookmark ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public static Bookmark fetchByBookmarkId_First(
		long bookmarkId, OrderByComparator<Bookmark> orderByComparator) {

		return getPersistence().fetchByBookmarkId_First(
			bookmarkId, orderByComparator);
	}

	/**
	 * Returns the last bookmark in the ordered set where bookmarkId = &#63;.
	 *
	 * @param bookmarkId the bookmark ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark
	 * @throws NoSuchBookmarkException if a matching bookmark could not be found
	 */
	public static Bookmark findByBookmarkId_Last(
			long bookmarkId, OrderByComparator<Bookmark> orderByComparator)
		throws com.liferay.training.bookmarks.exception.
			NoSuchBookmarkException {

		return getPersistence().findByBookmarkId_Last(
			bookmarkId, orderByComparator);
	}

	/**
	 * Returns the last bookmark in the ordered set where bookmarkId = &#63;.
	 *
	 * @param bookmarkId the bookmark ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public static Bookmark fetchByBookmarkId_Last(
		long bookmarkId, OrderByComparator<Bookmark> orderByComparator) {

		return getPersistence().fetchByBookmarkId_Last(
			bookmarkId, orderByComparator);
	}

	/**
	 * Removes all the bookmarks where bookmarkId = &#63; from the database.
	 *
	 * @param bookmarkId the bookmark ID
	 */
	public static void removeByBookmarkId(long bookmarkId) {
		getPersistence().removeByBookmarkId(bookmarkId);
	}

	/**
	 * Returns the number of bookmarks where bookmarkId = &#63;.
	 *
	 * @param bookmarkId the bookmark ID
	 * @return the number of matching bookmarks
	 */
	public static int countByBookmarkId(long bookmarkId) {
		return getPersistence().countByBookmarkId(bookmarkId);
	}

	/**
	 * Caches the bookmark in the entity cache if it is enabled.
	 *
	 * @param bookmark the bookmark
	 */
	public static void cacheResult(Bookmark bookmark) {
		getPersistence().cacheResult(bookmark);
	}

	/**
	 * Caches the bookmarks in the entity cache if it is enabled.
	 *
	 * @param bookmarks the bookmarks
	 */
	public static void cacheResult(List<Bookmark> bookmarks) {
		getPersistence().cacheResult(bookmarks);
	}

	/**
	 * Creates a new bookmark with the primary key. Does not add the bookmark to the database.
	 *
	 * @param bookmarkId the primary key for the new bookmark
	 * @return the new bookmark
	 */
	public static Bookmark create(long bookmarkId) {
		return getPersistence().create(bookmarkId);
	}

	/**
	 * Removes the bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookmarkId the primary key of the bookmark
	 * @return the bookmark that was removed
	 * @throws NoSuchBookmarkException if a bookmark with the primary key could not be found
	 */
	public static Bookmark remove(long bookmarkId)
		throws com.liferay.training.bookmarks.exception.
			NoSuchBookmarkException {

		return getPersistence().remove(bookmarkId);
	}

	public static Bookmark updateImpl(Bookmark bookmark) {
		return getPersistence().updateImpl(bookmark);
	}

	/**
	 * Returns the bookmark with the primary key or throws a <code>NoSuchBookmarkException</code> if it could not be found.
	 *
	 * @param bookmarkId the primary key of the bookmark
	 * @return the bookmark
	 * @throws NoSuchBookmarkException if a bookmark with the primary key could not be found
	 */
	public static Bookmark findByPrimaryKey(long bookmarkId)
		throws com.liferay.training.bookmarks.exception.
			NoSuchBookmarkException {

		return getPersistence().findByPrimaryKey(bookmarkId);
	}

	/**
	 * Returns the bookmark with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bookmarkId the primary key of the bookmark
	 * @return the bookmark, or <code>null</code> if a bookmark with the primary key could not be found
	 */
	public static Bookmark fetchByPrimaryKey(long bookmarkId) {
		return getPersistence().fetchByPrimaryKey(bookmarkId);
	}

	/**
	 * Returns all the bookmarks.
	 *
	 * @return the bookmarks
	 */
	public static List<Bookmark> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the bookmarks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookmarkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bookmarks
	 * @param end the upper bound of the range of bookmarks (not inclusive)
	 * @return the range of bookmarks
	 */
	public static List<Bookmark> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the bookmarks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookmarkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bookmarks
	 * @param end the upper bound of the range of bookmarks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bookmarks
	 */
	public static List<Bookmark> findAll(
		int start, int end, OrderByComparator<Bookmark> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the bookmarks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BookmarkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bookmarks
	 * @param end the upper bound of the range of bookmarks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bookmarks
	 */
	public static List<Bookmark> findAll(
		int start, int end, OrderByComparator<Bookmark> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the bookmarks from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of bookmarks.
	 *
	 * @return the number of bookmarks
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BookmarkPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BookmarkPersistence, BookmarkPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(BookmarkPersistence.class);

		ServiceTracker<BookmarkPersistence, BookmarkPersistence>
			serviceTracker =
				new ServiceTracker<BookmarkPersistence, BookmarkPersistence>(
					bundle.getBundleContext(), BookmarkPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}