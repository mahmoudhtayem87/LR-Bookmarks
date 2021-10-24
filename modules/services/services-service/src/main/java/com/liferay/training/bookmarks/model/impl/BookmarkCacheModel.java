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

package com.liferay.training.bookmarks.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.training.bookmarks.model.Bookmark;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Bookmark in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BookmarkCacheModel
	implements CacheModel<Bookmark>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BookmarkCacheModel)) {
			return false;
		}

		BookmarkCacheModel bookmarkCacheModel = (BookmarkCacheModel)object;

		if (bookmarkId == bookmarkCacheModel.bookmarkId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, bookmarkId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", bookmarkId=");
		sb.append(bookmarkId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", url=");
		sb.append(url);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Bookmark toEntityModel() {
		BookmarkImpl bookmarkImpl = new BookmarkImpl();

		if (uuid == null) {
			bookmarkImpl.setUuid("");
		}
		else {
			bookmarkImpl.setUuid(uuid);
		}

		bookmarkImpl.setBookmarkId(bookmarkId);
		bookmarkImpl.setGroupId(groupId);
		bookmarkImpl.setCompanyId(companyId);
		bookmarkImpl.setUserId(userId);

		if (userName == null) {
			bookmarkImpl.setUserName("");
		}
		else {
			bookmarkImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			bookmarkImpl.setCreateDate(null);
		}
		else {
			bookmarkImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			bookmarkImpl.setModifiedDate(null);
		}
		else {
			bookmarkImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (title == null) {
			bookmarkImpl.setTitle("");
		}
		else {
			bookmarkImpl.setTitle(title);
		}

		if (description == null) {
			bookmarkImpl.setDescription("");
		}
		else {
			bookmarkImpl.setDescription(description);
		}

		if (url == null) {
			bookmarkImpl.setUrl("");
		}
		else {
			bookmarkImpl.setUrl(url);
		}

		bookmarkImpl.resetOriginalValues();

		return bookmarkImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		bookmarkId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		title = objectInput.readUTF();
		description = objectInput.readUTF();
		url = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(bookmarkId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (url == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(url);
		}
	}

	public String uuid;
	public long bookmarkId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String title;
	public String description;
	public String url;

}