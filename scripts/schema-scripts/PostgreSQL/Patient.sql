-- Table: public.Patient

-- DROP TABLE public."Patient";

CREATE TABLE IF NOT EXISTS public."Patient"
(
    "PNT_IDENTIFIER" text COLLATE pg_catalog."default",
    "PNT_ACTIVE" text COLLATE pg_catalog."default",
    "PNT_NAME" text COLLATE pg_catalog."default",
    "PNT_NAME_HUMANNAME_USE" text COLLATE pg_catalog."default",
    "PNT_NAME_HUMANNAME_TEXT" text COLLATE pg_catalog."default",
    "PNT_NAME_HUMANNAME_FAMILY" text COLLATE pg_catalog."default",
    "PNT_NAME_HUMANNAME_GIVEN" text COLLATE pg_catalog."default",
    "PNT_NAME_HUMANNAME_PREFIX" text COLLATE pg_catalog."default",
    "PNT_NAME_HUMANNAME_SUFFIX" text COLLATE pg_catalog."default",
    "PNT_NAME_HUMANNAME_PERIOD" text COLLATE pg_catalog."default",
    "PNT_TELECOM" text COLLATE pg_catalog."default",
    "PNT_TELECOM_CONTACTPOINT_SYSTEM" text COLLATE pg_catalog."default",
    "PNT_TELECOM_CONTACTPOINT_VALUE" text COLLATE pg_catalog."default",
    "PNT_TELECOM_CONTACTPOINT_USE" text COLLATE pg_catalog."default",
    "PNT_TELECOM_CONTACTPOINT_RANK" text COLLATE pg_catalog."default",
    "PNT_TELECOM_CONTACTPOINT_PERIOD" text COLLATE pg_catalog."default",
    "PNT_GENDER" text COLLATE pg_catalog."default",
    "PNT_BIRTHDATE" text COLLATE pg_catalog."default",
    "PNT_DECEASEDBOOLEAN" text COLLATE pg_catalog."default",
    "PNT_DECEASEDDATETIME" text COLLATE pg_catalog."default",
    "PNT_ADDRESS" text COLLATE pg_catalog."default",
    "PNT_ADDRESS_USE" text COLLATE pg_catalog."default",
    "PNT_ADDRESS_TYPE" text COLLATE pg_catalog."default",
    "PNT_ADDRESS_TEXT" text COLLATE pg_catalog."default",
    "PNT_ADDRESS_LINE" text COLLATE pg_catalog."default",
    "PNT_ADDRESS_CITY" text COLLATE pg_catalog."default",
    "PNT_ADDRESS_DISTRICT" text COLLATE pg_catalog."default",
    "PNT_ADDRESS_STATE" text COLLATE pg_catalog."default",
    "PNT_ADDRESS_POSTAL_CODE" text COLLATE pg_catalog."default",
    "PNT_ADDRESS_COUNTRY" text COLLATE pg_catalog."default",
    "PNT_ADDRESS_PERIOD" text COLLATE pg_catalog."default",
    "PNT_MARITAL_STATUS_CODE" text COLLATE pg_catalog."default",
    "PNT_MULTIPLE_BIRTH_BOOLEAN" text COLLATE pg_catalog."default",
    "PNT_MULTIPLE_BIRTH_INTEGER" text COLLATE pg_catalog."default",
    "PNT_PHOTO" text COLLATA pg_catalog."default",
    "PNT_PHOTO_ATTACHMENT_CONTENT_TYPE" text COLLATA pg_catalog."default",
    "PNT_PHOTO_ATTACHMENT_LANGUAGE" text COLLATA pg_catalog."default",
    "PNT_PHOTO_ATTACHMENT_DATA" text COLLATA pg_catalog."default",
    "PNT_PHOTO_ATTACHMENT_URL" text COLLATA pg_catalog."default",
    "PNT_PHOTO_ATTACHMENT_SIZE" text COLLATA pg_catalog."default",
    "PNT_PHOTO_ATTACHMENT_HASH" text COLLATA pg_catalog."default",
    "PNT_PHOTO_ATTACHMENT_TITLE" text COLLATA pg_catalog."default",
    "PNT_PHOTO_ATTACHMENT_CREATION" text COLLATA pg_catalog."default",
    "PNT_CONTACT" text COLLATA pg_catalog."default",
    "PNT_CONTACT_RELATIONSHIP" text COLLATA pg_catalog."default",
    "PNT_CONTACT_NAME" text COLLATA pg_catalog."default",
    "PNT_CONTACT_TELECOM" text COLLATA pg_catalog."default",
    "PNT_CONTACT_ADDRESS" text COLLATA pg_catalog."default",
    "PNT_CONTACT_GENDER" text COLLATA pg_catalog."default",
    "PNT_CONTACT_ORGANIZATION" text COLLATA pg_catalog."default",
    "PNT_RACE" text COLLATE pg_catalog."default",
    "PNT_RACE_DISP" text COLLATE pg_catalog."default",
    "PNT_ETHNICITY" text COLLATE pg_catalog."default",
    "PNT_ETHNICITY_DISP" text COLLATE pg_catalog."default",
    "PNT_ADDRESS_EXT_LAT_VALUE" text COLLATE pg_catalog."default",
    "PNT_ADDRESS_EXT_LONG_VALUE" text COLLATE pg_catalog."default"
)

TABLESPACE pg_default;

ALTER TABLE public."Patient"
    OWNER to postgres;