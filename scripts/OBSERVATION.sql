-- Generates a RDBMS view of the 'Observation' FHIR resource
-- This relies on data in PCORNET CDM format and a populated PCORNET_FHIR_MAPPING table

create or replace view CAMPFHIR_VIEW_OBSERVATION as
(
select distinct
    -- The patient involved in the observation
    'Patient: ' || enc.PATID as OBS_SUBJECT_REF,
    null as CON_BASEDON_REF,
    null as OBS_PARTOF_REF,
    null as OBS_STATUS,
    null as OBS_CATEGORY,
    null as OBS_CODE,
    null as OBS_FOCUS_REF,
    'Encounter: ' || enc.ENCOUNTERID as OBS_ENCOUNTER_REF,
    -- The date of the observation
    -- FHIR resources treat the next as a choice, will eventually go into the OBS_EFFECTIVE_X json node.
    null as OBS_EFFECTIVE_X,
    to_char(enc.ADMIT_DATE, 'YYYY-MM-DD') as OBS_EFFECTIVEDATETIME,
    null as OBS_EFFECTIVEPERIOD,
    null as OBS_EFFECTIVETIMING,
    null as OBS_EFFECTIVEINSTANT,
    null as OBS_ISSUED,
    'Performer: ' || enc.PROVIDERID as OBS_PERFORMER_REF,
    null as OBS_VALUE_X,
    null as OBS_VALUEQUANTITY,
    null as OBS_VALUECODEABLECONCEPT,
    null as OBS_VALUESTRING,
    null as OBS_VALUEBOOLEAN,
    null as OBS_VALUEINTEGER,
    null as OBS_VALUERANGE,
    null as OBS_VALUERATIO,
    null as OBS_VALUESAMPLEDDATA,
    null as OBS_VALUETIME,
    null as OBS_VALUEDATETIME,
    null as OBS_VALUEPERIOD,
    null as OBS_DATAABSENTREASON,
    null as OBS_INTERPRETATION,
    null as OBS_NOTE,
    null as OBS_BODYSITE,
    null as OBS_METHOD,
    null as OBS_SPECIMEN_REF,
    null as OBS_DEVICE_REF,
    null as OBS_REFERENCERANGE,
    null as OBS_REFERENCERANGE_LOW,
    null as OBS_REFERENCERANGE_HIGH,
    null as OBS_REFERENCERANGE_TYPE,
    null as OBS_REFERENCERANGE_APPLIESTO,
    null as OBS_REFERENCERANGE_AGE,
    null as OBS_REFERENCERANGE_TEXT,
    null as OBS_HASMEMBER_REF,
    null as OBS_DERIVEDFROM_REF,
    null as OBS_COMPONENT,
    null as OBS_COMPONENT_CODE,
    null as OBS_COMPONENT_VALUE_X,
    null as OBS_COMPONENT_VALUEQUANTITY,
    null as OBS_COMPONENT_VALUECODE,
    null as OBS_COMPONENT_VALUESTRING,
    null as OBS_COMPONENT_VALUEBOOLEAN,
    null as OBS_COMPONENT_VALUEINTEGER,
    null as OBS_COMPONENT_VALUERANGE,
    null as OBS_COMPONENT_VALUERATIO,
    null as OBS_COMPONENT_VALUESAMPLEDDATA,
    null as OBS_COMPONENT_VALUETIME,
    null as OBS_COMPONENT_VALUEDATETIME,
    null as OBS_COMPONENT_VALUEPERIOD,
    null as OBS_COMPONENT_DATAABSENTREASON,
    null as OBS_COMPONENT_INTERPRETATION,
    null as OBS_COMPONENT_REFERENCERANGE

from ENCOUNTER enc
        )
/
