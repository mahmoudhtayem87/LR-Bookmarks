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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.training.bookmarks.exception.NoSuchBookmarkException;
import com.liferay.training.bookmarks.model.Bookmark;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the bookmark service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BookmarkUtil
 * @generated
 */
@ProviderType
public interface BookmarkPersistence extends BasePersistence<Bookmark> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BookmarkUtil} to access the bookmark persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the bookmarks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching bookmarks
	 */
	public java.util.List<Bookmark> findByUuid(String uuid);

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
	public java.util.List<Bookmark> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Bookmark> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
			orderByComparator);

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
	public java.util.List<Bookmark> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first bookmark in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark
	 * @throws NoSuchBookmarkException if a matching bookmark could not be found
	 */
	public Bookmark findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
				orderByComparator)
		throws NoSuchBookmarkException;

	/**
	 * Returns the first bookmark in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public Bookmark fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
			orderByComparator);

	/**
	 * Returns the last bookmark in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark
	 * @throws NoSuchBookmarkException if a matching bookmark could not be found
	 */
	public Bookmark findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
				orderByComparator)
		throws NoSuchBookmarkException;

	/**
	 * Returns the last bookmark in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public Bookmark fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
			orderByComparator);

	/**
	 * Returns the bookmarks before and after the current bookmark in the ordered set where uuid = &#63;.
	 *
	 * @param bookmarkId the primary key of the current bookmark
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bookmark
	 * @throws NoSuchBookmarkException if a bookmark with the primary key could not be found
	 */
	public Bookmark[] findByUuid_PrevAndNext(
			long bookmarkId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
				orderByComparator)
		throws NoSuchBookmarkException;

	/**
	 * Removes all the bookmarks where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of bookmarks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching bookmarks
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the bookmark where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchBookmarkException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching bookmark
	 * @throws NoSuchBookmarkException if a matching bookmark could not be found
	 */
	public Bookmark findByUUID_G(String uuid, long groupId)
		throws NoSuchBookmarkException;

	/**
	 * Returns the bookmark where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public Bookmark fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the bookmark where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public Bookmark fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the bookmark where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the bookmark that was removed
	 */
	public Bookmark removeByUUID_G(String uuid, long groupId)
		throws NoSuchBookmarkException;

	/**
	 * Returns the number of bookmarks where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching bookmarks
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the bookmarks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching bookmarks
	 */
	public java.util.List<Bookmark> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Bookmark> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Bookmark> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
			orderByComparator);

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
	public java.util.List<Bookmark> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first bookmark in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark
	 * @throws NoSuchBookmarkException if a matching bookmark could not be found
	 */
	public Bookmark findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
				orderByComparator)
		throws NoSuchBookmarkException;

	/**
	 * Returns the first bookmark in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public Bookmark fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
			orderByComparator);

	/**
	 * Returns the last bookmark in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark
	 * @throws NoSuchBookmarkException if a matching bookmark could not be found
	 */
	public Bookmark findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
				orderByComparator)
		throws NoSuchBookmarkException;

	/**
	 * Returns the last bookmark in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public Bookmark fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
			orderByComparator);

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
	public Bookmark[] findByUuid_C_PrevAndNext(
			long bookmarkId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
				orderByComparator)
		throws NoSuchBookmarkException;

	/**
	 * Removes all the bookmarks where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of bookmarks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching bookmarks
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the bookmarks where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching bookmarks
	 */
	public java.util.List<Bookmark> findByUserId(long userId);

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
	public java.util.List<Bookmark> findByUserId(
		long userId, int start, int end);

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
	public java.util.List<Bookmark> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
			orderByComparator);

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
	public java.util.List<Bookmark> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first bookmark in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark
	 * @throws NoSuchBookmarkException if a matching bookmark could not be found
	 */
	public Bookmark findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
				orderByComparator)
		throws NoSuchBookmarkException;

	/**
	 * Returns the first bookmark in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public Bookmark fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
			orderByComparator);

	/**
	 * Returns the last bookmark in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark
	 * @throws NoSuchBookmarkException if a matching bookmark could not be found
	 */
	public Bookmark findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
				orderByComparator)
		throws NoSuchBookmarkException;

	/**
	 * Returns the last bookmark in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public Bookmark fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
			orderByComparator);

	/**
	 * Returns the bookmarks before and after the current bookmark in the ordered set where userId = &#63;.
	 *
	 * @param bookmarkId the primary key of the current bookmark
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bookmark
	 * @throws NoSuchBookmarkException if a bookmark with the primary key could not be found
	 */
	public Bookmark[] findByUserId_PrevAndNext(
			long bookmarkId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
				orderByComparator)
		throws NoSuchBookmarkException;

	/**
	 * Removes all the bookmarks where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of bookmarks where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching bookmarks
	 */
	public int countByUserId(long userId);

	/**
	 * Returns all the bookmarks where bookmarkId = &#63;.
	 *
	 * @param bookmarkId the bookmark ID
	 * @return the matching bookmarks
	 */
	public java.util.List<Bookmark> findByBookmarkId(long bookmarkId);

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
	public java.util.List<Bookmark> findByBookmarkId(
		long bookmarkId, int start, int end);

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
	public java.util.List<Bookmark> findByBookmarkId(
		long bookmarkId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
			orderByComparator);

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
	public java.util.List<Bookmark> findByBookmarkId(
		long bookmarkId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first bookmark in the ordered set where bookmarkId = &#63;.
	 *
	 * @param bookmarkId the bookmark ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark
	 * @throws NoSuchBookmarkException if a matching bookmark could not be found
	 */
	public Bookmark findByBookmarkId_First(
			long bookmarkId,
			com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
				orderByComparator)
		throws NoSuchBookmarkException;

	/**
	 * Returns the first bookmark in the ordered set where bookmarkId = &#63;.
	 *
	 * @param bookmarkId the bookmark ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public Bookmark fetchByBookmarkId_First(
		long bookmarkId,
		com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
			orderByComparator);

	/**
	 * Returns the last bookmark in the ordered set where bookmarkId = &#63;.
	 *
	 * @param bookmarkId the bookmark ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark
	 * @throws NoSuchBookmarkException if a matching bookmark could not be found
	 */
	public Bookmark findByBookmarkId_Last(
			long bookmarkId,
			com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
				orderByComparator)
		throws NoSuchBookmarkException;

	/**
	 * Returns the last bookmark in the ordered set where bookmarkId = &#63;.
	 *
	 * @param bookmarkId the bookmark ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookmark, or <code>null</code> if a matching bookmark could not be found
	 */
	public Bookmark fetchByBookmarkId_Last(
		long bookmarkId,
		com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
			orderByComparator);

	/**
	 * Removes all the bookmarks where bookmarkId = &#63; from the database.
	 *
	 * @param bookmarkId the bookmark ID
	 */
	public void removeByBookmarkId(long bookmarkId);

	/**
	 * Returns the number of bookmarks where bookmarkId = &#63;.
	 *
	 * @param bookmarkId the bookmark ID
	 * @return the number of matching bookmarks
	 */
	public int countByBookmarkId(long bookmarkId);

	/**
	 * Caches the bookmark in the entity cache if it is enabled.
	 *
	 * @param bookmark the bookmark
	 */
	public void cacheResult(Bookmark bookmark);

	/**
	 * Caches the bookmarks in the entity cache if it is enabled.
	 *
	 * @param bookmarks the bookmarks
	 */
	public void cacheResult(java.util.List<Bookmark> bookmarks);

	/**
	 * Creates a new bookmark with the primary key. Does not add the bookmark to the database.
	 *
	 * @param bookmarkId the primary key for the new bookmark
	 * @return the new bookmark
	 */
	public Bookmark create(long bookmarkId);

	/**
	 * Removes the bookmark with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookmarkId the primary key of the bookmark
	 * @return the bookmark that was removed
	 * @throws NoSuchBookmarkException if a bookmark with the primary key could not be found
	 */
	public Bookmark remove(long bookmarkId) throws NoSuchBookmarkException;

	public Bookmark updateImpl(Bookmark bookmark);

	/**
	 * Returns the bookmark with the primary key or throws a <code>NoSuchBookmarkException</code> if it could not be found.
	 *
	 * @param bookmarkId the primary key of the bookmark
	 * @return the bookmark
	 * @throws NoSuchBookmarkException if a bookmark with the primary key could not be found
	 */
	public Bookmark findByPrimaryKey(long bookmarkId)
		throws NoSuchBookmarkException;

	/**
	 * Returns the bookmark with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bookmarkId the primary key of the bookmark
	 * @return the bookmark, or <code>null</code> if a bookmark with the primary key could not be found
	 */
	public Bookmark fetchByPrimaryKey(long bookmarkId);

	/**
	 * Returns all the bookmarks.
	 *
	 * @return the bookmarks
	 */
	public java.util.List<Bookmark> findAll();

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
	public java.util.List<Bookmark> findAll(int start, int end);

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
	public java.util.List<Bookmark> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
			orderByComparator);

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
	public java.util.List<Bookmark> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bookmark>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the bookmarks from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of bookmarks.
	 *
	 * @return the number of bookmarks
	 */
	public int countAll();

}