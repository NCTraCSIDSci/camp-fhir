-- Table: public.Patient

-- DROP TABLE public."Patient";

CREATE TABLE IF NOT EXISTS public."Patient"
(
    "PNT_IDENTIFIER" text COLLATE pg_catalog."default",
    "PNT_ACTIVE" text COLLATE pg_catalog."default",
    "PNT_TELECOM" text COLLATE pg_catalog."default",
    "PNT_NAME" text COLLATE pg_catalog."default",
    "PNT_GENDER" text COLLATE pg_catalog."default",
    "PNT_BIRTHDATE" text COLLATE pg_catalog."default",
    "PNT_DECEASEDBOOLEAN" text COLLATE pg_catalog."default",
    "PNT_DECEASEDDATETIME" text COLLATE pg_catalog."default",
    "PNT_ADDRESS" text COLLATE pg_catalog."default",
    "PNT_MARITAL_STATUS_CODE" text COLLATE pg_catalog."default",
    "PNT_MULTIPLE_BIRTH_BOOLEAN" text COLLATE pg_catalog."default",
    "PNT_MULTIPLE_BIRTH_INTEGER" text COLLATE pg_catalog."default",
    "PNT_PHOTO" text COLLATA pg_catalog."default",
    "PNT_CONTACT" text COLLATA pg_catalog."default",
    "PNT_CONTACT_RELATIONSHIP" text COLLATA pg_catalog."default",
    "PNT_CONTACT_NAME" text COLLATA pg_catalog."default",
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