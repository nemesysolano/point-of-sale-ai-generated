--------------------------------------------------------
--  DDL for Table POS_PRODUCT_SUB_CATEGORIES
--------------------------------------------------------

  CREATE TABLE "POS_PRODUCT_SUB_CATEGORIES" ("SUB_CATEGORY_ID" NUMBER(15,0), "CATEGORY_ID" NUMBER(15,0), "SHORT_NAME" VARCHAR2(30 CHAR) COLLATE "USING_NLS_COMP", "NAME" VARCHAR2(200 CHAR) COLLATE "USING_NLS_COMP", "DESCRIPTION" VARCHAR2(4000 CHAR) COLLATE "USING_NLS_COMP", "ENABLED_FLAG" VARCHAR2(1 CHAR) COLLATE "USING_NLS_COMP", "START_DATE" DATE, "END_DATE" DATE, "CREATED_BY" NUMBER(10,0), "CREATION_DATE" DATE, "LAST_UPDATED_BY" NUMBER(10,0), "LAST_UPDATE_DATE" DATE, "OBJECT_VERSION_ID" NUMBER)  DEFAULT COLLATION "USING_NLS_COMP"
