-- Table: public.Patient

-- DROP TABLE public."Patient";

CREATE TABLE IF NOT EXISTS public."patient"
(
    "pnt_identifier" text collate pg_catalog."default",
    "pnt_active" text collate pg_catalog."default",
    "pnt_name" text collate pg_catalog."default",
    "pnt_name_humanname_use" text collate pg_catalog."default",
    "pnt_name_humanname_text" text collate pg_catalog."default",
    "pnt_name_humanname_family" text collate pg_catalog."default",
    "pnt_name_humanname_given" text collate pg_catalog."default",
    "pnt_name_humanname_prefix" text collate pg_catalog."default",
    "pnt_name_humanname_suffix" text collate pg_catalog."default",
    "pnt_name_humanname_period" text collate pg_catalog."default",
    "pnt_telecom" text collate pg_catalog."default",
    "pnt_telecom_contactpoint_system" text collate pg_catalog."default",
    "pnt_telecom_contactpoint_value" text collate pg_catalog."default",
    "pnt_telecom_contactpoint_use" text collate pg_catalog."default",
    "pnt_telecom_contactpoint_rank" text collate pg_catalog."default",
    "pnt_telecom_contactpoint_period" text collate pg_catalog."default",
    "pnt_gender" text collate pg_catalog."default",
    "pnt_birthdate" text collate pg_catalog."default",
    "pnt_deceasedboolean" text collate pg_catalog."default",
    "pnt_deceaseddatetime" text collate pg_catalog."default",
    "pnt_address" text collate pg_catalog."default",
    "pnt_marital_status_code" text collate pg_catalog."default",
    "pnt_multiple_birth_boolean" text collate pg_catalog."default",
    "pnt_multiple_birth_integer" text collate pg_catalog."default",
    "pnt_photo" text collate pg_catalog."default",
    "pnt_contact" text collate pg_catalog."default",
    "pnt_contact_relationship" text collate pg_catalog."default",
    "pnt_contact_name" text collate pg_catalog."default",
    "pnt_contact_telecom" text collate pg_catalog."default",
    "pnt_contact_address" text collate pg_catalog."default",
    "pnt_contact_gender" text collate pg_catalog."default",
    "pnt_contact_organization" text collate pg_catalog."default",
    "pnt_race" text collate pg_catalog."default",
    "pnt_race_disp" text collate pg_catalog."default",
    "pnt_ethnicity" text collate pg_catalog."default",
    "pnt_ethnicity_disp" text collate pg_catalog."default",
    "pnt_address_ext_lat_value" text collate pg_catalog."default",
    "pnt_address_ext_long_value" text collate pg_catalog."default"
)

TABLESPACE pg_default;

ALTER TABLE public."patient"
    OWNER to postgres; 
