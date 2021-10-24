create index IX_84CCD57F on BOOKMARK_Bookmark (userId);
create index IX_E1B5ECF9 on BOOKMARK_Bookmark (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A3975DBB on BOOKMARK_Bookmark (uuid_[$COLUMN_LENGTH:75$], groupId);