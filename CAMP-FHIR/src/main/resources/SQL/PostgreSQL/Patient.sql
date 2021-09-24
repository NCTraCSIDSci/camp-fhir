-- Table: public.Patient

-- DROP TABLE public."Patient";

CREATE TABLE IF NOT EXISTS public."Patient"
(
    "PNT_IDENTIFIER" text COLLATE pg_catalog."default",
    "PNT_GENDER" text COLLATE pg_catalog."default",
    "PNT_BIRTHDATE" text COLLATE pg_catalog."default",
    "PNT_MARITAL_STATUS_CODE" text COLLATE pg_catalog."default",
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