-- Generates a RDBMS view of the 'Procedure' FHIR resource
-- This relies on data in PCORNET CDM format and a populated PCORNET_FHIR_MAPPING table

create or replace view CAMPFHIR_VIEW_PROCEDURE as
select distinct
-- NESTcc Request
'Procedure ID: ' || px.PROCEDURESID as PRO_ID,
null as PRO_INSTANTIATESCANONICAL,
null as PRO_INSTANTIATESURI,
null as PRO_BASEDON_REF,
null as PRO_PARTOF_REF,
null as PRO_STATUS,
null as PRO_STATUSREASON,
-- NESTcc Request
-- Look into this, not a perfect match. FHIR only has a few options
px.ENC_TYPE as PRO_CATEGORY,
--NESTcc request
-- Uses >1000 SNOMED codes.
-- Look into this! Need dummy data.
px.PX as PRO_CODE,
-- NESTcc Request
'Patient: ' || px.PATID as PRO_SUBJECT_REF,
-- NESTcc request
'Encounter: ' || px.ENCOUNTERID as PRO_ENCOUNTER_REF,
null as PRO_PERFORMED_X,
-- NESTcc request
to_char(px.ADMIT_DATE, 'YYYY-MM-DD') as PRO_PERFORMEDDATETIME,
null as PRO_PERFORMEDPERIOD,
null as PRO_PERFORMEDSTRING,
null as PRO_PERFORMEDAGE,
null as PRO_PERFORMEDRANGE,
null as PRO_RECORDER_REF,
null as PRO_ASSERTER_REF,
null as PRO_PERFORMER,
null as PRO_PERFORMER_FUNCTION,
'Performer: ' || px.PROVIDERID as PRO_PERFORMER_ACTOR_REF,
null as PRO_PERFORMER_ONBEHALFOF_REF,
null as PRO_LOCATION_REF,
-- NESTcc Request
-- Uess >2000 SNOMED codes
null as PRO_REASONCODE,
null as PRO_REASONREFERENCE_REF,
-- NESTcc Request
-- This is mappable, but nothing in the PCORNET_Procedures table is a direct match.
-- Might need to add a join to include encounter.
null as PRO_BODYSITE,
-- NESTcc Request
-- Codeable concept with 'Successful, Unsuccessful, and Partrially Successful.' no direct match in PCORNET_Procedures
-- Might need to incorporate PRO_CM (patient-reported-outcomes) table for this...
case
    when LOWER(pro.PRO_RESPONSE_TEXT) = 'successful' then 'Successful'
    when LOWER(pro.PRO_RESPONSE_TEXT) = 'unsuccessful' then 'Unsuccessful'
    when LOWER(pro.PRO_RESPONSE_TEXT) = 'partially successful' then 'Partially Successful'
    else null
    end as PRO_OUTCOME,
pro.PRO_CM_ID as PRO_REPORT_REF,
-- NESTcc Request
-- 1000+ snomed codes
con.CONDITION as PRO_COMPLICATION,
null as PRO_COMPLICATIONDETAIL_REF,
null as PRO_FOLLOWUP,
null as PRO_NOTE,
null as PRO_FOCALDEVICE,
null as PRO_FOCALDEVICE_ACTION,
null as PRO_FOCALDEVICE_MNPLTD_REF,
null as PRO_USEDREFERENCE_REF,
null as PRO_USEDCODE
from PROCEDURES px
left join PRO_CM pro on px.ENCOUNTERID = pro.ENCOUNTERID
left join CONDITION con on px.ENCOUNTERID = con.ENCOUNTERID
/
