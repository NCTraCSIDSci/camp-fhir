-- Generates a RDBMS view of the 'Condition' FHIR resource.
-- This relies on data in PCORNET CDM format and a populated PCORNET_FHIR_MAPPING table

create or replace view CAMPFHIR_VIEW_CONDITION as
(

select distinct
    null as CON_ID,
    -- Patient who has the condition
    'Patient/' || cond.PATID as CON_SUBJECT_REF,
    -- Encounter associated with the condition
	case
	    when cond.ENCOUNTERID is null then null
	    else 'Encounter/' || cond.ENCOUNTERID
	end as CON_ENCOUNTER_REF,
	null as CON_ASSERTER_REFERENCE,
	case
		when cond.CONDITION_TYPE = '09' then 'http://hl7.org/fhir/sid/icd-9-cm'
		when cond.CONDITION_TYPE = '10' then 'http://hl7.org/fhir/sid/icd-10-cm'
		when cond.CONDITION_TYPE = '11' then 'http://hl7.org/fhir/sid/icd-11-cm'
		when cond.CONDITION_TYPE = 'SM' then 'http://snomed.info/sct'
		when cond.CONDITION_TYPE = 'HP' then 'https://hpo.jax.org/app/'
	end as CON_CODE_CODING_SYST,
	cond.CONDITION as CON_CODE,
	'https://www.hl7.org/fhir/valueset-condition-category' as CON_CATEGORY_CODING_SYST,
	null as CON_CATEGORY_CODING_CODE,
	to_char(cond.REPORT_DATE, 'YYYY-MM-DD') as CON_ASSERT_DATE,
    -- Connects to mapping table. Will be ACTIVE, RESOLVED, INACTIVE, or NULL
    nvl(tcc1.fhir_out_cd, null) as CON_CLINICALSTATUS,
    null as CON_ABATEDATE,
    null as CON_ONSETDATE,
    null as CON_VERIFICAIONSTATUS,
    null as CON_CATEGORY,
    null as CON_SEVERITY,
    null as CON_BODYSITE,
    -- This section is a requirement for the NESTcc request. THey are interested in the start of the condition.
    -- FHIR resources treat the '_x' as a choice, so the date time will go into the CON_ONSET_X json node.
    null as CON_ONSET_X,
    to_char(cond.ONSET_DATE, 'YYYY-MM-DD') as CON_ONSETDATETIME,
    null as CON_ONSETAGE,
    null as CON_ONSETPERIOD_ST,
    null as CON_ONSETRANGE,
    null as CON_ONSETSTRING,
    -- This section is a requirement for the NESTcc request. They are interested in the stop of the condition.
    -- FHIR resources treat the '_x' as a choice, so the date time will go into the CON_ABATEMENT_X json node.
    null as CON_ABATEMENT_X,
    to_char(cond.RESOLVE_DATE, 'YYYY-MM-DD') as CON_ABATEMENTDATETIME,
    null as CON_ABATEMENTAGE,
    null as CON_ABATEMENTPERIOD,
    null as CON_ABATEMENTRANGE,
    null as CON_ABATEMENTSTRING,
    null as CON_RECORDEDDATE,
    null as CON_RECORDER_REF,
    null as CON_ASSERTER_REF,
    null as CON_STAGE,
    null as CON_STAGE_SUMMARY,
    null as CON_STAGE_ASSESSMENT_REF,
    null as CON_TYPE,
    null as CON_EVIDENCE,
    null as CON_EVIDENCE_CODE,
    null as CON_EVIDENCE_DETAIL_REF,
    -- Text description of the condition.
    'Note: ' || cond.RAW_CONDITION as CON_NOTE

from
	PCORNET_CDM.condition cond
	left join pcornet_fhir_mapping tcc1 on tcc1.column_cd='CONDITION_STATUS' and cond.CONDITION_STATUS=tcc1.local_in_cd

UNION

 select distinct
    dx.DIAGNOSISID as CON_ID,
    'Patient/' || dx.PATID as CON_SUBJECT_REF,
	'Encounter/' || dx.ENCOUNTERID as CON_ENCOUNTER_REF,
	case when dx.PROVIDERID is null then null else 'Practitioner/'||dx.PROVIDERID end as CON_ASSERTER_REFERENCE,
	case
		when dx.DX_TYPE = '09' then	'http://hl7.org/fhir/sid/icd-9-cm'
		when dx.DX_TYPE = '10' then 'http://hl7.org/fhir/sid/icd-10-cm'
		when dx.DX_TYPE = '11' then 'http://hl7.org/fhir/sid/icd-11-cm'
		when dx.DX_TYPE = 'SM' then 'http://snomed.info/sct'
	end as CON_CODE_CODING_SYST,
	dx.DX as CON_CODE,
	'https://www.hl7.org/fhir/valueset-condition-category' as CON_CATEGORY_CODING_SYST,
	'encounter-diagnosis' as CON_CATEGORY_CODING_CODE,
	to_char(dx.admit_date, 'YYYY-MM-DD') as CON_ASSERT_DATE,
    null as CON_CLINICALSTATUS,
    null as CON_ABATEDATE,
    null as CON_ONSETDATE,
    null as CON_VERIFICAIONSTATUS,
    null as CON_CATEGORY,
    null as CON_SEVERITY,
    null as CON_BODYSITE,
    null as CON_ONSET_X,
    null as CON_ONSETDATETIME,
    null as CON_ONSETAGE,
    null as CON_ONSETPERIOD_ST,
    null as CON_ONSETRANGE,
    null as CON_ONSETSTRING,
    null as CON_ABATEMENT_X,
    null as CON_ABATEMENTDATETIME,
    null as CON_ABATEMENTAGE,
    null as CON_ABATEMENTPERIOD,
    null as CON_ABATEMENTRANGE,
    null as CON_ABATEMENTSTRING,
    null as CON_RECORDEDDATE,
    null as CON_RECORDER_REF,
    null as CON_ASSERTER_REF,
    null as CON_STAGE,
    null as CON_STAGE_SUMMARY,
    null as CON_STAGE_ASSESSMENT_REF,
    null as CON_TYPE,
    null as CON_EVIDENCE,
    null as CON_EVIDENCE_CODE,
    null as CON_EVIDENCE_DETAIL_REF,
    'Note: ' || dx.RAW_DX as CON_NOTE

from PCORNET_CDM.DIAGNOSIS  dx
)
/
