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

package com.liferay.training.bookmarks.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Bookmark}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Bookmark
 * @generated
 */
public class BookmarkWrapper
	extends BaseModelWrapper<Bookmark>
	implements Bookmark, ModelWrapper<Bookmark> {

	public BookmarkWrapper(Bookmark bookmark) {
		super(bookmark);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("bookmarkId", getBookmarkId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("url", getUrl());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long bookmarkId = (Long)attributes.get("bookmarkId");

		if (bookmarkId != null) {
			setBookmarkId(bookmarkId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}
	}

	/**
	 * Returns the bookmark ID of this bookmark.
	 *
	 * @return the bookmark ID of this bookmark
	 */
	@Override
	public long getBookmarkId() {
		return model.getBookmarkId();
	}

	/**
	 * Returns the company ID of this bookmark.
	 *
	 * @return the company ID of this bookmark
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this bookmark.
	 *
	 * @return the create date of this bookmark
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this bookmark.
	 *
	 * @return the description of this bookmark
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the group ID of this bookmark.
	 *
	 * @return the group ID of this bookmark
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this bookmark.
	 *
	 * @return the modified date of this bookmark
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this bookmark.
	 *
	 * @return the primary key of this bookmark
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the title of this bookmark.
	 *
	 * @return the title of this bookmark
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the url of this bookmark.
	 *
	 * @return the url of this bookmark
	 */
	@Override
	public String getUrl() {
		return model.getUrl();
	}

	/**
	 * Returns the user ID of this bookmark.
	 *
	 * @return the user ID of this bookmark
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this bookmark.
	 *
	 * @return the user name of this bookmark
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this bookmark.
	 *
	 * @return the user uuid of this bookmark
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this bookmark.
	 *
	 * @return the uuid of this bookmark
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the bookmark ID of this bookmark.
	 *
	 * @param bookmarkId the bookmark ID of this bookmark
	 */
	@Override
	public void setBookmarkId(long bookmarkId) {
		model.setBookmarkId(bookmarkId);
	}

	/**
	 * Sets the company ID of this bookmark.
	 *
	 * @param companyId the company ID of this bookmark
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this bookmark.
	 *
	 * @param createDate the create date of this bookmark
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this bookmark.
	 *
	 * @param description the description of this bookmark
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the group ID of this bookmark.
	 *
	 * @param groupId the group ID of this bookmark
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this bookmark.
	 *
	 * @param modifiedDate the modified date of this bookmark
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this bookmark.
	 *
	 * @param primaryKey the primary key of this bookmark
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the title of this bookmark.
	 *
	 * @param title the title of this bookmark
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	/**
	 * Sets the url of this bookmark.
	 *
	 * @param url the url of this bookmark
	 */
	@Override
	public void setUrl(String url) {
		model.setUrl(url);
	}

	/**
	 * Sets the user ID of this bookmark.
	 *
	 * @param userId the user ID of this bookmark
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this bookmark.
	 *
	 * @param userName the user name of this bookmark
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this bookmark.
	 *
	 * @param userUuid the user uuid of this bookmark
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this bookmark.
	 *
	 * @param uuid the uuid of this bookmark
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected BookmarkWrapper wrap(Bookmark bookmark) {
		return new BookmarkWrapper(bookmark);
	}

}