
CREATE OR REPLACE VIEW PCORNET_CDM.CAMPFHIR_VIEW_ENCOUNTER ( ENC_ID, ENC_STATUS, ENC_STATUSHISTORY, ENC_STATUSHISTORY_STATUS, ENC_STATUSHISTORY_PERIOD, ENC_CLASS, ENC_CLASSHISTORY, ENC_CLASSHISTORY_CLASS, ENC_CLASSHISTORY_PERIOD, ENC_TYPE, ENC_SERVICETYPE, ENC_SUBJECT_REF, ENC_EPISODEOFCARE_REF, ENC_BASEDON_REF, ENC_PARTICIPANT, ENC_PARTICIPANT_TYPE, ENC_PARTICIPANT_PERIOD_ST, ENC_PARTICIPANT_PERIOD_END, ENC_PARTICIPANT_INDIVIDUAL_REF, ENC_PARTICIPANT_APPT_REF, ENC_PERIOD, ENC_LENGTH, ENC_REASONCODE, ENC_REASONREFERENCE, ENC_DIAGNOSIS, ENC_DIAGNOSIS_CONDITION_REF, ENC_DIAGNOSIS_USE, ENC_DIAGNOSIS_RANK, ENC_HSPTLZTN, ENC_HSPTLZTN_PREADMISSION_ID, ENC_HSPTLZTN_ORIGIN_REF, ENC_HSPTLZTN_ADMITSOURCE_REF, ENC_HSPTLZTN_READMISSION_REF, ENC_HSPTLZTN_DIETPREF_REF, ENC_HSPTLZTN_SPCLCOURTESY_REF, ENC_HSPTLZTN_SPCLARRNGMNT_REF, ENC_HSPTLZTN_DESTINATION_REF, ENC_HSPTLZTN_DISCHRGEDDISP_REF, ENC_LOCATION, ENC_LOCATION_STATUS, ENC_LOCATION_PHYSICALTYPE, ENC_LOCATION_PERIOD, ENC_SERVICEPROVIDER_REF, ENC_PARTOF_REF )
BEQUEATH DEFINER AS
select distinct
enc.ENCOUNTERID as ENC_ID,
null as ENC_STATUS,
null as ENC_STATUSHISTORY,
null as ENC_STATUSHISTORY_STATUS,
null as ENC_STATUSHISTORY_PERIOD,
-- NESTcc request
-- this can be linked to mapping table, links PCORNET codes to FHIR codes, not display. can be added.
-- case
--     when enc.ENC_TYPE = 'AV' then 'AMB'
--     when enc.ENC_TYPE = 'ED' then 'EMER'
--     when enc.ENC_TYPE = 'EI' then 'IMP'
--     when enc.ENC_TYPE = 'IP' then 'IMP'
--     when enc.ENC_TYPE = 'IS' then 'NONAC'
--     when enc.ENC_TYPE = 'OS' then 'SS'
--     when enc.ENC_TYPE = 'IC' then 'IMP'
--     when enc.ENC_TYPE = 'OA' then 'AMB'
--     else null
-- end as ENC_CLASS,
nvl(tcc1.fhir_out_cd, null) as ENC_CLASS,
null as ENC_CLASSHISTORY,
null as ENC_CLASSHISTORY_CLASS,
null as ENC_CLASSHISTORY_PERIOD,
-- This is a codeable concept that needs to be examined when dummy data is available. FHIR only has 4 options,
-- curious what is listed in PCORnet, or if more data points are allowed.
enc.ENC_TYPE as ENC_TYPE,
-- NESTcc request
-- Codeable concept
null as ENC_SERVICETYPE,
-- NESTcc request
-- Codeable concept
--case
   -- when lr.PRIORITY = 'R' then 'R - routine'
  --  when lr.PRIORITY = 'S' then 'S - stat'
   -- when lr.PRIORITY = 'E' then 'RR - rush reporting'
   -- else null
--end as ENC_PRIORITY,
-- NESTcc request
'Subject: ' || enc.PATID as ENC_SUBJECT_REF,
null as ENC_EPISODEOFCARE_REF,
null as ENC_BASEDON_REF,
null as ENC_PARTICIPANT,
null as ENC_PARTICIPANT_TYPE,
-- NESTcc Request
-- to_char(enc.ADMIT_DATE, 'YYYY-MM-DD') || '-' || to_char(enc.DISCHARGE_DATE, 'YYYY-MM-DD') as ENC_PARTICIPANT_PERIOD,
-- Extra JSON nodes! FHIR uses a period, PCORNET uses admit date and discharge date, these can be deleted
-- if above solution is acceptable
to_char(enc.ADMIT_DATE, 'YYYY-MM-DD') as ENC_PARTICIPANT_PERIOD_ST,
to_char(enc.DISCHARGE_DATE, 'YYYY-MM-DD') as ENC_PARTICIPANT_PERIOD_END,
null as ENC_PARTICIPANT_INDIVIDUAL_REF,
null as ENC_PARTICIPANT_APPT_REF,
null as ENC_PERIOD,
null as ENC_LENGTH,
-- NESTcc request
-- Codeable concept, uses SNOMED. 4000 concepts
null as ENC_REASONCODE,
null as ENC_REASONREFERENCE,
--NESTcc request
-- work on this, it references condition.
-- join diagnosis on ENCOUNTER ID!
-- This might be a stretch and not feasible, especially considering datatypes. 
dx.DX as ENC_DIAGNOSIS,
con.ENCOUNTERID as ENC_DIAGNOSIS_CONDITION_REF,
null as ENC_DIAGNOSIS_USE,
null as ENC_DIAGNOSIS_RANK,
-- not sure if this is appropriate, need dummy data to determine if correct mapping.
--enc.PAYER_TYPE_PRIMARY || 'and' || enc.PAYER_TYPE_SECONDARY as ENC_ACCOUNT_REF,
null as ENC_HSPTLZTN,
null as ENC_HSPTLZTN_PREADMISSION_ID,
null as ENC_HSPTLZTN_ORIGIN_REF,
null as ENC_HSPTLZTN_ADMITSOURCE_REF,
null as ENC_HSPTLZTN_READMISSION_REF,
null as ENC_HSPTLZTN_DIETPREF_REF,
null as ENC_HSPTLZTN_SPCLCOURTESY_REF,
null as ENC_HSPTLZTN_SPCLARRNGMNT_REF,
null as ENC_HSPTLZTN_DESTINATION_REF,
-- examine with dummy data when available.
-- can be linked to the mapping table. good example of multiple PCORnet values mapping to a single FHIR code.
case
    when enc.DISCHARGE_DISPOSITION = 'AF' then 'oth'
    when enc.DISCHARGE_DISPOSITION = 'AL' then 'oth'
    when enc.DISCHARGE_DISPOSITION = 'AM' then 'aadvice'
    when enc.DISCHARGE_DISPOSITION = 'AW' then 'oth'
    when enc.DISCHARGE_DISPOSITION = 'EX' then 'exp'
    when enc.DISCHARGE_DISPOSITION = 'HH' then 'oth'
    when enc.DISCHARGE_DISPOSITION = 'HO' then 'home'
    when enc.DISCHARGE_DISPOSITION = 'HS' then 'hosp'
    when enc.DISCHARGE_DISPOSITION = 'AF' then 'oth'
    when enc.DISCHARGE_DISPOSITION = 'IP' then 'other-HCF'
    when enc.DISCHARGE_DISPOSITION = 'NH' then 'long'
    when enc.DISCHARGE_DISPOSITION = 'RH' then 'rehab'
    when enc.DISCHARGE_DISPOSITION = 'RS' then 'long'
    when enc.DISCHARGE_DISPOSITION = 'SH' then 'oth'
    when enc.DISCHARGE_DISPOSITION = 'SN' then 'snf'
    when enc.DISCHARGE_DISPOSITION = 'OT' then 'oth'
    else null
end as ENC_HSPTLZTN_DISCHRGEDDISP_REF,
null as ENC_LOCATION,
-- 'Facility Location: ' || enc.FACILITY_LOCATION as ENC_LOCATION_LOCATION_REF,
null as ENC_LOCATION_STATUS,
null as ENC_LOCATION_PHYSICALTYPE,
null as ENC_LOCATION_PERIOD,
'Service Provider (Facility) ID: ' || enc.FACILITYID as ENC_SERVICEPROVIDER_REF,
null as ENC_PARTOF_REF
from encounter enc
left join DIAGNOSIS dx on enc.ENCOUNTERID = dx.ENCOUNTERID
left join CONDITION con on enc.ENCOUNTERID = con.ENCOUNTERID
left join CF_FHIR_MAPPING tcc1 on tcc1.column_cd='ENC_TYPE' and enc.ENC_TYPE=tcc1.local_in_cd
/
