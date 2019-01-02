--PATIENT
--PNT_IDENTIFIER maps to Patient / identifier
--PNT_GENDER maps to Patient / gender
--PNT_BIRTHDATE maps to Patient / birthDate
--PNT_MARITAL_STATUS_CODE  maps to Patient / maritalStatus / coding / code
--PNT_MARITAL_STATUS_SYSTEM maps to Patient / maritalStatus / coding / system
--PNT_RACE maps to Patient / extension / race / coding / code
--PNT_ETHNICITY maps to Patient / extension / ethnicity / coding / code
--PNT_ADDRESS_EXT_LAT_VALUE maps to Patient / address / extension / latitude / value
--PNT_ADDRESS_EXT_LONG_VALUE maps to Patient / address / extension / longitude / value
create or replace view PCORNET_PATIENT_2FHIR as (
SELECT
    dem.PATID as PNT_IDENTIFIER, 
    nvl(tcc1.fhir_out_cd, null) as PNT_GENDER,
    BIRTH_DATE as PNT_BIRTHDATE,
    null as PNT_MARITAL_STATUS_CODE , 
    null as PNT_MARITAL_STATUS_SYSTEM,
    nvl(tcc3.fhir_out_cd, null) as PNT_RACE,
    nvl(tcc4.fhir_out_cd, null) as PNT_ETHNICITY,
    null as PNT_ADDRESS_EXT_LAT_VALUE,
    null as PNT_ADDRESS_EXT_LONG_VALUE
FROM 
    DEMOGRAPHIC dem
    left join PCORNET_FHIR_MAPPING tcc1 on tcc1.column_cd='SEX' and dem.SEX=tcc1.local_in_cd
    left join PCORNET_FHIR_MAPPING tcc3 on tcc3.column_cd='RACE' and dem.RACE=tcc3.local_in_cd
    left join PCORNET_FHIR_MAPPING tcc4 on tcc4.column_cd='HISPANIC' and dem.HISPANIC=tcc4.local_in_cd
)
GO

--ENCOUNTER
--ENC_IDENTIFIER maps to Encounter / identifier
--ENC_SUBJECT_REFERENCE maps to Encounter / subject / reference
--ENC_PARTICIPANT_INDIV_REF maps to Encountner / participant / individual / reference
--ENC_CLASS_SYST maps to Encounter / class / coding / system
--ENC_CLASS_CODE maps to Encounter / class / coding / code
--ENC_CLASS_DISPLAY maps to Encounter / class / coding / display
--ENC_PERIOD_START maps to Encounter / period / start
--ENC_PERIOD_END maps to Encounter / period / end
--ENC_HOSP_DISDISP_CODING_SYST maps to Encounter / hospitalization / dischargeDisposition / coding / system
--ENC_HOSP_DISDISP_CODING_CODE maps to Encounter / hospitalization / dischargeDisposition / coding / code
--ENC_HOSP_DISDISP_TEXT maps to Encounter / hospitalization / dischargeDisposition / text
--ENC_HOSP_ADMSRC_CODING_CODE maps to Encounter / hospitalization / admitSource / coding / code
--ENC_HOSP_ADMSRC_TEXT maps to Encounter / hospitalization / admitSource / text
--ENC_DIAGN_CON_REF maps to Encounter / diagnosis / condition / reference
--ENC_DIAGN_ROLE_CODING_CODE maps to Encounter / diagnosis / role / coding / code
--ENC_DIAGN_ROLE_SYST maps to Encounter / diagnosis / role / coding / system
--ENC_DIAGN_RANK  maps to Encounter / diagnosis / rank
create or replace view PCORNET_ENCOUNTER_2FHIR as (
select
        enc.ENCOUNTERID as ENC_IDENTIFIER,
        'Patient/'||enc.PATID as ENC_SUBJECT_REFERENCE,
	    case 
	        when enc.PROVIDERID is null then null else 'Practitioner/'||enc.PROVIDERID 
	    end as ENC_PARTICIPANT_INDIV_REF, 
        'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode' as ENC_CLASS_SYST,
        nvl(tcc1.fhir_out_cd, null) as ENC_CLASS_CODE,
        nvl(tcc1.fhir_out_char, null) as ENC_CLASS_DISPLAY,
        enc.ADMIT_DATE as ENC_PERIOD_START,
        enc.DISCHARGE_DATE as ENC_PERIOD_END,
        'http://hl7.org/fhir/ValueSet/encounter-discharge-disposition' as ENC_HOSP_DISDISP_CODING_SYST,
        nvl(tcc2.fhir_out_cd, null) as ENC_HOSP_DISDISP_CODING_CODE,
        nvl(tcc2.fhir_out_char, null) as ENC_HOSP_DISDISP_TEXT,
        nvl(tcc3.fhir_out_cd, null) as ENC_HOSP_ADMSRC_CODING_CODE, 
        nvl(tcc3.fhir_out_char, null) as ENC_HOSP_ADMSRC_TEXT, 
        case
            when dx.DIAGNOSISID is null then null else 'Condition/'||dx.DIAGNOSISID 
        end as ENC_DIAGN_CON_REF, 
        case
            when dx.DIAGNOSISID is null then null else 'DD' 
        end as ENC_DIAGN_ROLE_CODING_CODE, 
        case
            when dx.DIAGNOSISID is null then null else 'https://www.hl7.org/fhir/valueset-diagnosis-role.html' 
        end as ENC_DIAGN_ROLE_SYST, 
        case
            when dx.DIAGNOSISID is null then null else 1 
        end as ENC_DIAGN_RANK 
from 
	ENCOUNTER enc
	    left join diagnosis dx on enc.ENCOUNTERID = dx.ENCOUNTERID and dx.pdx = 'P' and dx.DX_SOURCE = 'DI' --only supporting primary discharge dx for now
        left join pcornet_fhir_mapping tcc1 on tcc1.column_cd='ENC_TYPE' and enc.enc_type=tcc1.local_in_cd
        left join pcornet_fhir_mapping tcc2 on tcc2.column_cd='DISCHARGE_STATUS' and enc.discharge_status=tcc2.local_in_cd
        left join pcornet_fhir_mapping tcc3 on tcc3.column_cd='ADMITTING_SOURCE' and enc.admitting_source=tcc3.local_in_cd
)
GO

--CONDITION
--CON_IDENTIFIER maps to Condition / identifier
--CON_SUBJECT_REFERENCE maps to Condition / subject / reference
--CON_CONTEXT_REFERENCE maps to Condition / context / reference
--CON_ASSERTER_REFERENCE maps to Condition / asserter / reference
--CON_CODE_CODING_SYST maps to Condition / code / coding / system
--CON_CODE_CODING_CODE maps to Condition / code / coding / code
--CON_CATEGORY_CODING_SYST maps to Condition / category / coding / system
--CON_CATEGORY_CODING_CODE maps to Condition / category / coding / code
--CON_ASSERT_DATE maps to Condition / assertedDate
--CON_CLINSTATUS maps to Condition / clinicalStatus
--CON_ABATEDATE maps to Condition / abatementDateTime
--CON_ONSETDATE maps to Condition / onsetDateTime
create or replace view PCORNET_DXS_2FHIR as (
select distinct
	dx.DIAGNOSISID as CON_IDENTIFIER,
	'Patient/' || dx.PATID as CON_SUBJECT_REFERENCE,
	'Encounter/' || dx.ENCOUNTERID as CON_CONTEXT_REFERENCE,
	case when dx.PROVIDERID is null then null else 'Practitioner/'||dx.PROVIDERID end as CON_ASSERTER_REFERENCE, 
	case
		when dx.DX_TYPE = '09' then	'http://hl7.org/fhir/sid/icd-9-cm'
		when dx.DX_TYPE = '10' then 'http://hl7.org/fhir/sid/icd-10-cm'
		when dx.DX_TYPE = '11' then 'http://hl7.org/fhir/sid/icd-11-cm'
		when dx.DX_TYPE = 'SM' then 'http://snomed.info/sct'
		else null
	end as CON_CODE_CODING_SYST,
	dx.DX as CON_CODE_CODING_CODE,
	'https://www.hl7.org/fhir/valueset-condition-category' as CON_CATEGORY_CODING_SYST,
	'encounter-diagnosis' as CON_CATEGORY_CODING_CODE,
	to_char(dx.admit_date, 'YYYY-MM-DD') as CON_ASSERT_DATE,
	null as CON_CLINSTATUS, 
	null as CON_ABATEDATE, 
	null as CON_ONSETDATE 
from
	diagnosis dx

UNION

select distinct
	cond.CONDITIONID as CON_IDENTIFIER,
	'Patient/' || cond.PATID as CON_SUBJECT_REFERENCE,
	case
	    when cond.ENCOUNTERID is null then null
	    else 'Encounter/' || cond.ENCOUNTERID 
	end as CON_CONTEXT_REFERENCE,
	null as CON_ASSERTER_REFERENCE, 
	case
		when cond.CONDITION_TYPE = '09' then	'http://hl7.org/fhir/sid/icd-9-cm'
		when cond.CONDITION_TYPE = '10' then 'http://hl7.org/fhir/sid/icd-10-cm'
		when cond.CONDITION_TYPE = '11' then 'http://hl7.org/fhir/sid/icd-11-cm'
		when cond.CONDITION_TYPE = 'SM' then 'http://snomed.info/sct'
		when cond.CONDITION_TYPE = 'HP' then 'https://hpo.jax.org/app/'
		else null
	end as CON_CODE_CODING_SYST,
	cond.CONDITION as CON_CODE_CODING_CODE,
	'https://www.hl7.org/fhir/valueset-condition-category' as CON_CATEGORY_CODING_SYST,
	'problem-list-item' as CON_CATEGORY_CODING_CODE,
	to_char(cond.REPORT_DATE, 'YYYY-MM-DD') as CON_ASSERT_DATE,
	nvl(tcc1.FHIR_OUT_CD,null) as CON_CLINSTATUS, 
	to_char(cond.RESOLVE_DATE, 'YYYY-MM-DD') as CON_ABATEDATE, 
	to_char(cond.ONSET_DATE, 'YYYY-MM-DD') as CON_ONSETDATE 
from
	condition cond
	left join pcornet_fhir_mapping tcc1 on tcc1.column_cd='CONDITION_STATUS' and cond.CONDITION_STATUS=tcc1.local_in_cd
where
    cond.CONDITION_SOURCE = 'HC' --limit to problem list items only
)
GO


--PROCEDURE
--PCD_IDENTIFIER maps to Procedure / identifier
--PCD_SUBJECT_REFERENCE maps to Procedure / subject / reference
--PCD_CONTEXT_REFERENCE maps to Procedure / context / reference
--PCD_PERF_ACTOR_REF maps to Procedure / performer / actor / reference
--PCD_CODE_CODING_SYST maps to Procedure / code / coding / system
--PCD_CODE_CODING_CODE maps to Procedure / code / coding / code
--PCD_PERFORMED_PDT maps to Procedure / performed / performedDateTime
create or replace view PCORNET_PXS_2FHIR as (
select distinct
	px.PROCEDURESID as PCD_IDENTIFIER,
	'Patient/' || px.PATID as PCD_SUBJECT_REFERENCE,
	'Encounter/' || px.ENCOUNTERID as PCD_CONTEXT_REFERENCE,
	case 
	    when px.PROVIDERID is null then null else 'Practitioner/'||px.PROVIDERID 
	end as PCD_PERF_ACTOR_REF, 
	case
		when px.PX_TYPE = '09' then	'http://hl7.org/fhir/sid/icd-9-cm/'
		when px.PX_TYPE = '10' then 'http://hl7.org/fhir/sid/icd-10-cm/'
		when px.PX_TYPE = '11' then 'http://hl7.org/fhir/sid/icd-11-cm/'
		when px.PX_TYPE = 'CH' then 'http://www.ama-assn.org/go/cpt/'
		when px.PX_TYPE = 'LC' then 'http://loinc.org/'
		when px.PX_TYPE = 'ND' then 'http://hl7.org/fhir/sid/ndc/'
		else null
	end as PCD_CODE_CODING_SYST,
	px.PX as PCD_CODE_CODING_CODE,
	px.PX_DATE as PCD_PERFORMED_PDT
from
	procedures px
)
GO

--OBSERVATION (VITALS AND SMOKING)
--OBS_IDENTIFIER maps to Observation / identifier
--OBS_SUBJECT_REFERENCE maps to Observation / subject / reference
--OBS_CONTEXT_REFERENCE maps to Observation / context / reference
--OBS_CATEGORY_SYST maps to Observation / category / coding / system
--OBS_CATEGORY_CODE maps to Observation / category / coding / code
--OBS_CATEGORY_DISPLAY maps to Observation / category / coding / display
--OBS_CODE_CODING_SYST maps to Observation / code / coding / system
--OBS_CODE_CODING_CODE maps to Observation / code / coding / code
--OBS_CODE_CODING_DISPLAY maps to Observation / code / coding / display
--OBS_VALUEQUANTITY_VALUE maps to Observation / valueQuantity / value
--OBS_VALUEQUANTITY_CODE maps to Observation / valueQuantity / code
--OBS_VALUEQUANTITY_COMPARATOR maps to Observation / valueQuantity / comparator
--OBS_VALUESTRING maps to Observation / valueString
--OBS_EFFECTIVEDATETIME maps to Observation / effectiveDateTime
create or replace view PCORNET_VITALS_2FHIR as (
select distinct
    vit.VITALID as OBS_IDENTIFIER, 
    'Patient/'||vit.PATID as OBS_SUBJECT_REFERENCE, 
    'Encounter/'||vit.ENCOUNTERID as OBS_CONTEXT_REFERENCE,
    'http://hl7.org/fhir/ValueSet/observation-category' as OBS_CATEGORY_SYST,
    'vital-signs' as OBS_CATEGORY_CODE,
    'Vital Signs' as OBS_CATEGORY_DISPLAY,
     'http://loinc.org/' as OBS_CODE_CODING_SYST,
     case
        when vit.HT is not null then '8302-2'
        when vit.WT is not null then '29463-7'
        when vit.DIASTOLIC is not null then '8462-4'
        when vit.SYSTOLIC is not null then '8480-6'
        when vit.ORIGINAL_BMI is not null then '36156-5'
     end as OBS_CODE_CODING_CODE,
     case
        when vit.HT is not null then 'Body height'
        when vit.WT is not null then 'Body weight'
        when vit.DIASTOLIC is not null then 'Diastolic blood pressure'
        when vit.SYSTOLIC is not null then 'Systolic blood pressure'
        when vit.ORIGINAL_BMI is not null then 'Body mass index' 
     end as OBS_CODE_CODING_DISPLAY,
     case when vit.HT is not null then vit.HT
        when vit.WT is not null then vit.WT
        when vit.DIASTOLIC is not null then vit.DIASTOLIC
        when vit.SYSTOLIC is not null then vit.SYSTOLIC
        when vit.ORIGINAL_BMI is not null then vit.ORIGINAL_BMI
     end as OBS_VALUEQUANTITY_VALUE,
     case when vit.HT is not null then '[in_i]'
        when vit.WT is not null then '[lb_av]'
        when vit.DIASTOLIC is not null then 'mm[Hg]'
        when vit.SYSTOLIC is not null then 'mm[Hg]'
        when vit.ORIGINAL_BMI is not null then 'kg/m2'
     end as OBS_VALUEQUANTITY_CODE,
     null as OBS_VALUEQUANTITY_COMPARATOR,
	 null as OBS_VALUESTRING,
    vit.MEASURE_DATE as OBS_EFFECTIVEDATETIME 
from
    vital vit
where
    vit.SMOKING is null
    and vit.TOBACCO is null
    
UNION

select distinct
    vit.VITALID as OBS_IDENTIFIER, 
    'Patient/'||vit.PATID as OBS_SUBJECT_REFERENCE, 
    'Encounter/'||vit.ENCOUNTERID as OBS_CONTEXT_REFERENCE,
    'http://hl7.org/fhir/ValueSet/observation-category' as OBS_CATEGORY_SYST,
    'social-history' as OBS_CATEGORY_CODE,
    'Social History' as OBS_CATEGORY_DISPLAY,
     'http://snomed.info/sct/' as OBS_CODE_CODING_SYST,
     nvl(tcc1.fhir_out_cd, null) as OBS_CODE_CODING_CODE,
     nvl(tcc1.fhir_out_char, null) as OBS_CODE_CODING_DISPLAY,
     null as OBS_VALUEQUANTITY_VALUE,
     null as OBS_VALUEQUANTITY_CODE,
     null as OBS_VALUEQUANTITY_COMPARATOR,
	 null as OBS_VALUESTRING,
     vit.MEASURE_DATE as OBS_EFFECTIVEDATETIME 
from
    vital vit
    left join pcornet_fhir_mapping tcc1 on tcc1.column_cd='SMOKING' and vit.SMOKING=tcc1.local_in_cd
where
    vit.SMOKING is not null
)
GO

--OBSERVATION (LABS)
--OBS_IDENTIFIER maps to Observation / identifier 
--OBS_SUBJECT_REFERENCE maps to Observation / subject / reference
--OBS_CONTEXT_REFERENCE maps to Observation / context / reference
--OBS_CATEGORY_SYST maps to Observation / category / coding / system
--OBS_CATEGORY_CODE maps to Observation / category / coding / code
--OBS_CATEGORY_DISPLAY maps to Observation / category / coding / display
--OBS_CODE_CODING_SYST maps to Observation / code / coding / system
--OBS_CODE_CODING_CODE maps to Observation / code / coding / code
--OBS_CODE_CODING_DISPLAY maps to Observation / code / coding / display
--OBS_VALUEQUANTITY_VALUE maps to Observation / valueQuantity / value
--OBS_VALUEQUANTITY_COMPARATOR maps to Observation / valueQuantity / comparator
--OBS_VALUEQUANTITY_CODE maps to Observation / valueQuantity / code
--OBS_VALUESTRING maps to Observation / valueString
--OBS_ISSUED maps to Observation / issued
--OBS_EFFECTIVEDATETIME maps to Observation / effectiveDateTime
--OBS_REFRANGE_LOW maps to Observation / referenceRange / low
--OBS_REFRANGE_HIGH maps to Observation / referenceRange / high
--OBS_INTERPRETATION  maps to Observation / interpretation / coding / code
--OBS_INTERPRETATION_SYST maps to Observation / interpretation / coding / system
create or replace view PCORNET_LABS_2FHIR as (
select distinct
    labs.LAB_RESULT_CM_ID as OBS_IDENTIFIER, 
    'Patient/'||labs.PATID as OBS_SUBJECT_REFERENCE, 
    'Encounter/'||labs.ENCOUNTERID as OBS_CONTEXT_REFERENCE,
    'http://hl7.org/fhir/ValueSet/observation-category' as OBS_CATEGORY_SYST,
    'laboratory' as OBS_CATEGORY_CODE,
    'Laboratory' as OBS_CATEGORY_DISPLAY,
    'http://loinc.org' as OBS_CODE_CODING_SYST,
    LAB_LOINC as OBS_CODE_CODING_CODE,
    null as OBS_CODE_CODING_DISPLAY,
    labs.RESULT_NUM as OBS_VALUEQUANTITY_VALUE,
    nvl(tcc1.FHIR_OUT_CD,null) as OBS_VALUEQUANTITY_COMPARATOR,
    case  
        when labs.RESULT_UNIT = 'NI' then null
        else labs.RESULT_UNIT
    end as OBS_VALUEQUANTITY_CODE,
    case
        when labs.RESULT_QUAL = 'NI' then null
        else nvl(labs.RESULT_QUAL,labs.RAW_RESULT) 
    end as OBS_VALUESTRING,
    labs.RESULT_DATE as OBS_ISSUED, 
    nvl(labs.SPECIMEN_DATE,labs.LAB_ORDER_DATE) as OBS_EFFECTIVEDATETIME,
    case 
        when labs.NORM_MODIFIER_LOW IN ('EQ','GE','GT','NO') then labs.NORM_MODIFIER_LOW||' '||labs.NORM_RANGE_LOW
        else labs.NORM_RANGE_LOW
    end as OBS_REFRANGE_LOW, 
    case 
        when labs.NORM_MODIFIER_HIGH IN ('EQ','GE','GT','NO') then labs.NORM_MODIFIER_HIGH||' '||labs.NORM_RANGE_HIGH
        else labs.NORM_RANGE_HIGH
    end as OBS_REFRANGE_HIGH, 
    nvl(tcc2.FHIR_OUT_CD,null) as OBS_INTERPRETATION_CODE, 
    'http://hl7.org/fhir/ValueSet/observation-interpretation' as OBS_INTERPRETATION_SYST 
from
    lab_result_cm labs
    left join PCORNET_FHIR_MAPPING tcc1 on tcc1.column_cd='RESULT_MODIFIER' and labs.RESULT_MODIFIER=tcc1.local_in_cd
    left join PCORNET_FHIR_MAPPING tcc2 on tcc2.column_cd='ABN_IND' and labs.ABN_IND=tcc2.local_in_cd
)
GO


--MEDICATION REQUEST
--MED_IDENTIFIER maps to MedicationRequest / identifier
--MED_SUBJECT_REFERENCE maps to MedicationRequest / subject / reference
--MED_MEDREF_REFERENCE maps to MedicationRequest / medicationReference / reference
--MED_AUTHORED_ON maps to MedicationRequest / authoredOn
--MED_DISPREQ_PERIOD_START maps to MedicationRequest / dispenseRequest / validityPeriod / start
--MED_DISPREQ_PERIOD_END maps to MedicationRequest / dispenseRequest / validityPeriod / end
--MED_REQ_AGENT_REFERENCE maps to MedicationRequest / agent / reference
--MED_INTENT_CODE maps to MedicationRequest / intent
--MED_CAT_CODING_SYS maps to MedicationRequest / category / coding / system
--MED_CAT_CODING_CODE maps to MedicationRequest / category / coding / code
--MED_CAT_CODING_DISPLAY maps to MedicationRequest / category / coding / display
--MED_DOSINSTX_DOSEQUANT_VAL maps to MedicationRequest / dosageInstruction / doseQuantity / value
--MED_DOSINSTX_DOSEQUANT_UNIT maps to MedicationRequest / dosageInstruction / doseQuantity / unit
--MED_DISPREQ_QUANT maps to MedicationRequest / dispenseRequest / quantity
--MED_DISPREQ_NUMREPS maps to MedicationRequest / dispenseRequest / numberOfRepeatsAllowed
--MED_DISPREQ_EXPSUPP maps to MedicationRequest / dispenseRequest / expectedSupplyDuration
--MED_DOSINSTX_TEXT maps to MedicationRequest / dosageInstruction / text
--MED_DOSINSTX_ASNDBOOL maps to MedicationRequest / dosageInstruction / asNeededBoolean
--MED_DOSINSTX_ROUTE maps to MedicationRequest / dosageInstruction / route
--MED_SUBSTITU_ALLOWED maps to MedicationRequest / substitution / allowed
create or replace view PCORNET_MEDREQ_2FHIR as (
select distinct 
    med.PRESCRIBINGID as MED_IDENTIFIER, 
    'Patient/'||med.PATID as MED_SUBJECT_REFERENCE, 
    'Encounter/'||med.ENCOUNTERID as MED_CONTEXT_REFERENCE, 
    'Medication/'||med.RXNORM_CUI as MED_MEDREF_REFERENCE, 
    med.RX_ORDER_DATE as MED_AUTHORED_ON, 
    med.RX_START_DATE as MED_DISPREQ_PERIOD_START,
    med.RX_END_DATE as MED_DISPREQ_PERIOD_END, 
    case 
	    when med.RX_PROVIDERID is null then null else 'Practitioner/'||med.RX_PROVIDERID 
	end as MED_REQ_AGENT_REFERENCE,
    'order' as MED_INTENT_CODE,
    null as MED_CAT_CODING_SYS,
    null as MED_CAT_CODING_CODE,
    null as MED_CAT_CODING_DISPLAY,
    med.RX_DOSE_ORDERED as MED_DOSINSTX_DOSEQUANT_VAL, 
    med.RX_DOSE_ORDERED_UNIT as MED_DOSINSTX_DOSEQUANT_UNIT, 
    med.RX_QUANTITY as MED_DISPREQ_QUANT, 
    med.RX_REFILLS as MED_DISPREQ_NUMREPS, 
    med.RX_DAYS_SUPPLY as MED_DISPREQ_EXPSUPP, 
    nvl(tcc1.FHIR_OUT_CD,null) as MED_DOSINSTX_TEXT, 
    nvl(tcc2.FHIR_OUT_CD,null) as MED_DOSINSTX_ASNDBOOL, 
    med.RX_ROUTE as MED_DOSINSTX_ROUTE, 
    nvl(tcc3.FHIR_OUT_CD,null) as MED_SUBSTITU_ALLOWED 
from 
    PRESCRIBING med
    left join PCORNET_FHIR_MAPPING tcc1 on tcc1.column_cd='RX_FREQUENCY' and med.RX_FREQUENCY=tcc1.local_in_cd
    left join PCORNET_FHIR_MAPPING tcc2 on tcc2.column_cd='RX_PRN_FLAG' and med.RX_PRN_FLAG=tcc2.local_in_cd
    left join PCORNET_FHIR_MAPPING tcc3 on tcc3.column_cd='RX_DISPENSE_AS_WRITTEN' and med.RX_DISPENSE_AS_WRITTEN=tcc3.local_in_cd
)
GO


--PRACTITIONER 
--PRACT_IDENTIFIER maps to Practitioner / identifier
--PRACT_GENDER maps to Practitioner / gender
create or replace view PCORNET_PRACT_2FHIR as (
select 
    prov.PROVIDERID as PRACT_IDENTIFIER,
    nvl(tcc1.FHIR_OUT_CD,null) as PRACT_GENDER
from 
    provider prov
    left join PCORNET_FHIR_MAPPING tcc1 on tcc1.column_cd='PROVIDER_SEX' and prov.PROVIDER_SEX=tcc1.local_in_cd
)
GO