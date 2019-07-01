--PATIENT
--PNT_IDENTIFIER maps to Patient / identifier  (An Identifier for this Patient)
--PNT_GENDER maps to Patient / gender (male | female | other | unknown)
--PNT_BIRTHDATE maps to Patient / birthDate (The date of birth for the individual [YYYY-MM-DD])
--PNT_MARITAL_STATUS_CODE  maps to Patient / maritalStatus / coding / code (Code for marital status of Patient)
--PNT_MARITAL_STATUS_SYSTEM maps to Patient / maritalStatus / coding / system (System for coding marital status of patient)
--PNT_RACE maps to Patient / extension / race / coding / code (HL7 v3 Code System for race)
--PNT_ETHNICITY maps to Patient / extension / ethnicity / coding / code (HL7 v3 Code system for Race)
--PNT_ADDRESS_EXT_LAT_VALUE maps to Patient / address / extension / latitude / value (Position element using Latitude in the WGS84 datum)
--PNT_ADDRESS_EXT_LONG_VALUE maps to Patient / address / extension / longitude / value (Position element using Longitude in the WGS84 datum)
create or replace view ACT_PATIENT_2FHIR as (
--If patient ethnicity table has been transfered into patient dimension the following code can be used:
SELECT DISTINCT
    TO_CHAR(patdem.PATIENT_NUM) as PNT_IDENTIFIER, 
    nvl(tcc1.fhir_out_cd, null) as PNT_GENDER,
    (patdem.BIRTH_DATE) as PNT_BIRTHDATE,
    patdem.MARITAL_STATUS_CD as PNT_MARITAL_STATUS_CODE , 
    case 
        when patdem.MARITAL_STATUS_CD is null then null else 'https://www.hl7.org/fhir/valueset-marital-status.html'
    end as PNT_MARITAL_STATUS_SYSTEM,
    nvl(tcc3.fhir_out_cd, null) as PNT_RACE,
    nvl(tcc4.fhir_out_cd, null) as PNT_ETHNICITY,
    null as PNT_ADDRESS_EXT_LAT_VALUE,
    null as PNT_ADDRESS_EXT_LONG_VALUE
FROM 
    patient_dimension patdem
    left join ACT_FHIR_MAPPING tcc1 on tcc1.column_cd='SEX_CD' and patdem.SEX_CD=tcc1.local_in_cd and tcc1.table_cd ='PATIENT_DIMENSION'
    left join ACT_FHIR_MAPPING tcc3 on tcc3.column_cd='RACE_CD' and patdem.RACE_CD=tcc3.local_in_cd and tcc3.table_cd = 'PATIENT_DIMENSION'
    left join ACT_FHIR_MAPPING tcc4 on tcc4.column_cd='ETHNICITY_CD' and patdem.ETHNICITY_CD=tcc4.local_in_cd and tcc4.table_cd ='PATIENT_DIMENSION'
    --IF Patient Ethnicity data is stored in the CONCEPT_CD column of OBSERVATION_FACT table use this code instead of the above line
--    left join OBS_FCT_DEM obsfct on obsfct.patient_num = patdem.patient_num
--    left join ACT_FHIR_MAPPING tcc3 on tcc3.column_cd='CONCEPT_CD' and obsfct.concept_cd=tcc3.local_in_cd

);
--ENCOUNTER
--ENC_IDENTIFIER maps to Encounter / identifier (Identifier by which the encounter is known)
--ENC_SUBJECT_REFERENCE maps to Encounter / subject / reference (The paitent present at the encounter)
--ENC_PARTICIPANT_INDIV_REF maps to Encountner / participant / individual / reference 
--                                                      (reference to persons involved in the encounter other than the patient)
--ENC_CLASS_SYST maps to Encounter / class / coding / system (system for describing the classification of patient encounter)
--ENC_CLASS_CODE maps to Encounter / class / coding / code (code for classification of patient encounter)
--ENC_CLASS_DISPLAY maps to Encounter / class / coding / display (description of encoded classification of patient encounter)
--ENC_PERIOD_START maps to Encounter / period / start (start time of the encounter)
--ENC_PERIOD_END maps to Encounter / period / end (end time of the encounter)
--ENC_HOSP_DISDISP_CODING_SYST maps to Encounter / hospitalization / dischargeDisposition / coding / system 
--                                                    (System for clssification of category or kind of location after discharge)
--ENC_HOSP_DISDISP_CODING_CODE maps to Encounter / hospitalization / dischargeDisposition / coding / code 
--                                                                      (Code for Category or kind of location after discharge)
--ENC_HOSP_DISDISP_TEXT maps to Encounter / hospitalization / dischargeDisposition / text 
--                                                                 (Description for Category or kind of location after discharge)
--ENC_HOSP_ADMSRC_CODING_CODE maps to Encounter / hospitalization / admitSource / coding / code (Code for from where the patient was admitted)
--ENC_HOSP_ADMSRC_TEXT maps to Encounter / hospitalization / admitSource / text (Descriptive text describing from where the patient was admitted)
--ENC_DIAGN_CON_REF maps to Encounter / diagnosis / condition / reference (Diagnosis or procedure relevant to this encounter)
--ENC_DIAGN_ROLE_CODING_CODE maps to Encounter / diagnosis / use / DiagnosisRole / coding / code (Role that this diagnosis has within the encounter [e.g. admission, billing, discharge …])
--ENC_DIAGN_ROLE_SYST maps to Encounter / diagnosis/ use / DiagnosisRole / coding / system (System used to describe the role that a diagnosis has w/in encounter)
--ENC_DIAGN_RANK  maps to Encounter / diagnosis / rank (Ranking of the diagnosis)
create or replace view ACT_ENCOUNTER_2FHIR as (
select distinct
        TO_CHAR(visit.encounter_num) as ENC_IDENTIFIER,
        'Patient/'||visit.PATIENT_NUM as ENC_SUBJECT_REFERENCE,
--	    case 
--	        when dx.PROVIDER_ID is null then null else 'Practitioner/'||dx.PROVIDER_ID 
--	    end 
        null as ENC_PARTICIPANT_INDIV_REF, --Validation data is entirly null however the above line could be used to include physician id
        'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode' as ENC_CLASS_SYST,
        nvl(tcc1.fhir_out_cd, null) as ENC_CLASS_CODE,
        nvl(tcc1.fhir_out_char, null) as ENC_CLASS_DISPLAY,
        visit.START_DATE as ENC_PERIOD_START,
        visit.END_DATE as ENC_PERIOD_END,
        'http://hl7.org/fhir/ValueSet/encounter-discharge-disposition' as ENC_HOSP_DISDISP_CODING_SYST, 
        null as ENC_HOSP_DISDISP_CODING_CODE,
        null as ENC_HOSP_DISDISP_TEXT,
        null as ENC_HOSP_ADMSRC_CODING_CODE, 
        null as ENC_HOSP_ADMSRC_TEXT, 
        null as ENC_DIAGN_CON_REF,
        null as ENC_DIAGN_ROLE_CODING_CODE,
        null as ENC_DIAGN_ROLE_SYST,
        null as ENC_DIAGN_RANK
        -- the following code can be used in the case where data on the diagnosis role (Discharge diagnosis, Billing, Admission 
        --diagnosis, etc.) and data on diagnosis rank (Primary, secondary, etc.) is provided (currently unsupported by ACT) 
        -- you must use join to narrow data to only primary discharge diagnosis  and provide mappings for this data 
        --(see tcc4 (Rank) and  tcc5(Role)) before using this code

--        case
--            when dx.CONCEPT_CD is null then null else 'Condition/'||dx.CONCEPT_CD 
--        end as ENC_DIAGN_CON_REF, 
--        nvl(tcc5.fhir_out_cd,null) as ENC_DIAGN_ROLE_CODING_CODE
--        nvl(tcc5.fhir_system,null) as ENC_DIAGN_ROLE_SYST, 
--        nvl(tcc4.fhir_out_cd,null) as ENC_DIAGN_RANK 

from 
	VISIT_DIMENSION visit
        left join OBS_FCT_DX dx on dx.ENCOUNTER_NUM = visit.ENCOUNTER_NUM and dx.patient_num = visit.patient_num
        left join ACT_fhir_mapping tcc1 on tcc1.column_cd='INOUT_CD' and visit.inout_cd=tcc1.local_in_cd and tcc1.table_cd = 'VISIT_DIMENSION'
        
        -- use in conjunction with the joins below to include the codes of the hospital admissions and discharge codings if data
        -- for these elements is available
--        nvl(tcc2.fhir_out_cd, null) as ENC_HOSP_DISDISP_CODING_CODE,
--        nvl(tcc2.fhir_out_char, null) as ENC_HOSP_DISDISP_TEXT,
--        nvl(tcc3.fhir_out_cd, null) as ENC_HOSP_ADMSRC_CODING_CODE, 
--        nvl(tcc3.fhir_out_char, null) as ENC_HOSP_ADMSRC_TEXT, 
         
        --left join ACT_FHIR_MAPPING tcc4 on tcc4.column_cd='MODIFIER_CD' and visit.modifier_cd = tcc4.local_in_cd
        --if Hospital Discharge Disposition data is avaiable use this to select primary discharge diagnosis 
        -- you will need to provide the local diagnosis role coding corresponding to discharge in the place of DD as well as the
        -- local column where disagnosis roles are stored

--        left join OBS_FCT_DX dx on enc.ENCOUNTER_NUM = dx.ENCOUNTER_NUM and dx.MODIFIER_CD = 'ACT|DIAG_PRIORITY:P' and dx.DIAG_ROLE = 'DD' --only supporting primary discharge dx for now

        --Include this code to include mappings for ENC_HOSP_DISDISP_CODING_CODE,ENC_HOSP_ADMSRC_CODING_CODE, and/or ENC_DIAGN_ROLE_CODING_CODE
        --include the following code if data is available on discharge disposition, admitance disposition and/or diagnosis role
        --you will need to provide local codes (local_in_cd) in ACT_FHIR_MAPPING table and replace column names with local column 
        --names for these elements if they differ from given column names 

--        left join ACT_fhir_mapping tcc2 on tcc2.column_cd = 'HOSP_DISDISP_CD' and dx.HOSP_DISDISP_CD = tcc2.local_in_cd
--        left join ACT_FHIR_mapping tcc3 on tcc3.column_cd = 'HOSP_ADMDISP_CD' and dx.HOSP_ADMDISP_CD = tcc3.local_in_cd
--        left join ACT_FHIR_mapping tcc5 on tcc5.column_cd = 'DIAG_ROLE' and dx.DIAG_ROLE=tcc5.local_in_cd
);

--CONDITION
--CON_IDENTIFIER maps to Condition / identifier (external ID for this condition)
--CON_SUBJECT_REFERENCE maps to Condition / subject / reference (indicates the patient who the condition record is associated with)
--CON_CONTEXT_REFERENCE maps to Condition / context / reference (encounter during which the condition was first asserted)
--CON_ASSERTER_REFERENCE maps to Condition / asserter / reference (person who asserts this condition)
--CON_CODE_CODING_SYST maps to Condition / code / coding / system (system used to identify the condition, problem, or diagnosis)
--CON_CODE_CODING_CODE maps to Condition / code / coding / code (code used to identify the condition, problem or diagnosis)
--CON_CATEGORY_CODING_SYST maps to Condition / category / coding / system (system used to assign category to condition)
--CON_CATEGORY_CODING_CODE maps to Condition / category / coding / code (category assigned to condition (problem-list-item|encounter-diagnosis)
--CON_ASSERT_DATE maps to Condition / assertedDate (Date on which the Condition was first asserted or acknowledged)
--CON_CLINSTATUS maps to Condition / clinicalStatus (Clinical Status of condition (active | recurrence | inactive | remission | resolved)
--CON_ABATEDATE maps to Condition / abatementDateTime (Date that condition was resolved or went in to remission)
--CON_ONSETDATE maps to Condition / onsetDateTime (Date when the condition began)
create or replace view ACT_CONDITION_2FHIR as (
select distinct
	dx.patient_num || '~'
    || case when dx.encounter_num is null then '' else (nvl(dx.encounter_num , null) || '~') end
    || dx.concept_cd || '~'
    || to_char(dx.start_date,'YYYYMMDD')|| '000000'
    as CON_IDENTIFIER, 
	'Patient/' || dx.patient_num as CON_SUBJECT_REFERENCE,
	'Encounter/' || dx.encounter_num  as CON_CONTEXT_REFERENCE,
	case when dx.provider_id is null then null else 'Practitioner/'||dx.provider_id end as CON_ASSERTER_REFERENCE, 
	case
		when dx.concept_cd LIKE 'ICD9CM:%' then	'http://hl7.org/fhir/sid/icd-9-cm'
		when dx.concept_cd LIKE 'ICD10CM:%' then 'http://hl7.org/fhir/sid/icd-10-cm'
		when dx.concept_cd LIKE 'ICD11CM:%' then 'http://hl7.org/fhir/sid/icd-11-cm'
		else null
	end as CON_CODE_CODING_SYST,
    case
		when dx.concept_cd is not null then SUBSTR(dx.concept_cd,INSTR(dx.concept_cd,':')+1,LENGTH(dx.concept_cd)-INSTR(dx.concept_cd,':'))
		else null
    end as CON_CODE_CODING_CODE,
	'https://www.hl7.org/fhir/valueset-condition-category' as CON_CATEGORY_CODING_SYST,
	'encounter-diagnosis' as CON_CATEGORY_CODING_CODE,
	to_char(dx.start_date, 'YYYY-MM-DD') as CON_ASSERT_DATE,
	null as CON_CLINSTATUS, 
	null as CON_ABATEDATE, 
	null as CON_ONSETDATE 
from
	obs_fct_dx dx
where 
    (dx.concept_cd LIKE 'ICD9CM:%' OR dx.concept_cd LIKE 'ICD10CM:%' OR dx.concept_cd LIKE 'ICD11CM:%')
);

--PROCEDURE
--PCD_IDENTIFIER maps to Procedure / identifier (External ID for Procedure)
--PCD_SUBJECT_REFERENCE maps to Procedure / subject / reference (who the procdure was performed on)
--PCD_CONTEXT_REFERENCE maps to Procedure / encounter / reference (encounter created as part of procedure)
--PCD_PERF_ACTOR_REF maps to Procedure / performer / actor / reference (reference to practitioner)
--PCD_CODE_CODING_SYST maps to Procedure / code / coding / system (system used to identify procedures (SNOMED is standard))
--PCD_CODE_CODING_CODE maps to Procedure / code / coding / code (Identification of procedure)
--PCD_PERFORMED_PDT maps to Procedure / performed / performedDateTime (when the procedure was performed)
create or replace view ACT_PROCEDURE_2FHIR as (
select distinct
	px.patient_num || '~'
    || px.encounter_num || '~'
    || case
		when px.concept_cd LIKE 'ICD9PROC:%' then 'ICD9:' || SUBSTR(px.concept_cd,INSTR(px.concept_cd,':')+1,LENGTH(px.concept_cd)-INSTR(px.concept_cd,':'))
		when px.concept_cd LIKE 'ICD10PCS:%' then 'ICD10:' || SUBSTR(px.concept_cd,INSTR(px.concept_cd,':')+1,LENGTH(px.concept_cd)-INSTR(px.concept_cd,':'))
        when px.concept_cd LIKE 'CPT4:%' then 'CPT:' || SUBSTR(px.concept_cd,INSTR(px.concept_cd,':')+1,LENGTH(px.concept_cd)-INSTR(px.concept_cd,':'))
        when px.concept_cd LIKE 'HCPCS:%' then PX.CONCEPT_CD
		else null
	end || '~'
    || to_char(px.start_date,'YYYYMMDD')|| '000000.0' || '~'
    || px.provider_id as PCD_IDENTIFIER,
	'Patient/' || px.patient_num as PCD_SUBJECT_REFERENCE,
	'Encounter/' || px.encounter_num  as PCD_CONTEXT_REFERENCE,
	case 
	    when px.provider_id is null then null else 'Practitioner/'||px.provider_id 
	end as PCD_PERF_ACTOR_REF, 
	case
		when px.concept_cd LIKE 'ICD9PROC:%' then	'http://hl7.org/fhir/sid/icd-9-cm'
		when px.concept_cd LIKE 'ICD10PCS:%' then 'http://hl7.org/fhir/sid/icd-10-cm/'
        when px.concept_cd LIKE 'CPT4:%' AND (SUBSTR(px.concept_cd,INSTR(px.concept_cd,':')+1,LENGTH(px.concept_cd)-INSTR(px.concept_cd,':')) != '99999') then 'http://www.ama-assn.org/go/cpt/'
        when px.concept_cd LIKE 'HCPCS:%' then 'http://www.ama-assn.org/go/cpt/' -- this codeset is based on the CPT codeset
		else null
	end as PCD_CODE_CODING_SYST,
    case
		when px.concept_cd is not null then SUBSTR(px.concept_cd,INSTR(px.concept_cd,':')+1,LENGTH(px.concept_cd)-INSTR(px.concept_cd,':'))
		else null
	end as PCD_CODE_CODING_CODE,
	px.start_date as PCD_PERFORMED_PDT
from
	obs_fct_pcd px
where
    (px.concept_cd LIKE 'ICD9PROC:%' OR px.concept_cd LIKE 'ICD10PCS:%' OR px.concept_cd LIKE 'CPT4:%' OR px.concept_cd LIKE 'HCPCS:%')    
);


--OBSERVATION (LABS)
--OBS_IDENTIFIER maps to Observation / identifier  (Buisness ID for observation)
--OBS_SUBJECT_REFERENCE maps to Observation / subject / reference (Who or what the observation is about)
--OBS_CONTEXT_REFERENCE maps to Observation / context / reference (Healthcare event during which observation is made)
--OBS_CATEGORY_SYST maps to Observation / category / coding / system (system for assigning observation category)
--OBS_CATEGORY_CODE maps to Observation / category / coding / code (code that classifies the general type of observation being made)
--OBS_CATEGORY_DISPLAY maps to Observation / category / coding / display (text describing the type of observation being made)
--OBS_CODE_CODING_SYST maps to Observation / code / coding / system (system for decribing what was observed (LOINC codes))
--OBS_CODE_CODING_CODE maps to Observation / code / coding / code (Describe what was observed (observation "name"))
--OBS_CODE_CODING_DISPLAY maps to Observation / code / coding / display (text that describes the observation code)
--OBS_VALUEQUANTITY_VALUE maps to Observation / valueQuantity / value (Numerical value of the observation)
--OBS_VALUEQUANTITY_COMPARATOR maps to Observation / valueQuantity / comparator (how to undertand value of observation (greater than, equal to, etc.))
--OBS_VALUEQUANTITY_CODE maps to Observation / valueQuantity / code (coded form of unit for the value of the observation)
--OBS_VALUESTRING maps to Observation / valueString  (String representing result of observation)
--OBS_ISSUED maps to Observation / issued (Date on which the observation was made available to providers)
--OBS_EFFECTIVEDATETIME maps to Observation / effectiveDateTime (time that the specimen is collected)
--OBS_REFRANGE_LOW maps to Observation / referenceRange / low (lower bound of range used to illistrate what values are considered normal)
--OBS_REFRANGE_HIGH maps to Observation / referenceRange / high (upper bound used to provide guidence on how to interpret value based on normal range)
--OBS_INTERPRETATION  maps to Observation / interpretation / coding / code (asessment made based on result (high,low, normal, etc.))
--OBS_INTERPRETATION_SYST maps to Observation / interpretation / coding / system (system used for assessment made based on result)
create or replace view ACT_OBSLABS_2FHIR as (
select distinct
    labs.encounter_num || '~' || labs.concept_cd || '~' || to_char(labs.start_date,'YYYYMMDD')|| '000000.1' || '~' ||  labs.provider_id   as OBS_IDENTIFIER, 
    'Patient/'||labs.patient_num as OBS_SUBJECT_REFERENCE, 
    'Encounter/'||labs.encounter_num as OBS_CONTEXT_REFERENCE,
    'http://hl7.org/fhir/ValueSet/observation-category' as OBS_CATEGORY_SYST,
    'laboratory' as OBS_CATEGORY_CODE,
    'Laboratory' as OBS_CATEGORY_DISPLAY,
    'http://loinc.org' as OBS_CODE_CODING_SYST,
    SUBSTR(labs.concept_cd,INSTR(labs.concept_cd,':')+1,LENGTH(labs.concept_cd)-INSTR(labs.concept_cd,':')) as OBS_CODE_CODING_CODE,
    null as OBS_CODE_CODING_DISPLAY,
    case 
        when labs.valtype_cd = 'T' then null
        else labs.NVAL_NUM
    end as OBS_VALUEQUANTITY_VALUE,
    case
        when labs.valtype_cd = 'T' then null
        when labs.tval_char IN ('GE','G','LE','L') then nvl(tcc1.FHIR_OUT_CD,null)
        else null
    end as OBS_VALUEQUANTITY_COMPARATOR,
    case  
        when labs.valtype_cd = 'T' then null
        else labs.UNITS_CD
    end as OBS_VALUEQUANTITY_CODE,
    case
        when labs.VALTYPE_CD = 'N' then null 
        else labs.TVAL_CHAR
    end as OBS_VALUESTRING,
    labs.START_DATE as OBS_ISSUED, 
    null as OBS_EFFECTIVEDATETIME,
    null as OBS_REFRANGE_LOW,
    null as OBS_REFRANGE_HIGH,
    nvl(tcc2.FHIR_OUT_CD,null) as OBS_INTERPRETATION_CODE, 
    nvl(tcc2.FHIR_SYSTEM,null) as OBS_INTERPRETATION_SYST 
from
    obs_fct_lab labs
    left join act_fhir_mapping tcc1 on tcc1.column_cd='TVAL_CHAR' and labs.TVAL_CHAR=tcc1.local_in_cd and tcc1.table_cd = 'OBSERVATION_FACT'
    left join act_fhir_mapping tcc2 on tcc2.column_cd='VALUEFLAG_CD' and labs.VALUEFLAG_CD=tcc2.local_in_cd and tcc2.table_cd = 'OBSERVATION_FACT'
where 
    px.concept_cd LIKE 'LOINC:%'
);

--TODO: Pull referance range from CONCEPT_DIMENSION metadata
--    case 
--        when labs.TVAL_CHAR IN ('EQ','GE','GT') then labs.TVAL_CHAR||' '||labs.NVAL_NUM
--        else labs.NVAL_NUM
--    end as OBS_REFRANGE_LOW, 
--    case 
--        when labs.TVAL_CHAR IN ('EQ','LE','L') then labs.NORM_MODIFIER_HIGH||' '||labs.NORM_RANGE_HIGH
--        else labs.NORM_RANGE_HIGH
--    end as OBS_REFRANGE_HIGH, 


--MEDICATION REQUEST
--MED_IDENTIFIER maps to MedicationRequest / identifier  (external ID for medication request)
--MED_SUBJECT_REFERENCE maps to MedicationRequest / subject / reference (who the medication request is for)
--MED_CONTEXT_REFERENCE maps to MedicationRequest / context / reference (link to encounter that identifies occurance)
--MED_MEDREF_REFERENCE maps to MedicationRequest / medicationReference / reference (Identifies the medication being requested)
--MED_AUTHORED_ON maps to MedicationRequest / authoredOn (when the request was initially authored)
--MED_DISPREQ_PERIOD_START maps to MedicationRequest / dispenseRequest / validityPeriod / start (start of time period supply is authorized for)
--MED_DISPREQ_PERIOD_END maps to MedicationRequest / dispenseRequest / validityPeriod / end (end of time period supply is authorized for)
--MED_REQ_AGENT_REFERENCE maps to MedicationRequest / agent / reference (who ordered the initial medication)
--MED_INTENT_CODE maps to MedicationRequest / intent (kind of medication request (proposal/plan/order))
--MED_CAT_CODING_SYS maps to MedicationRequest / category / coding / system (system used to identify category)
--MED_CAT_CODING_CODE maps to MedicationRequest / category / coding / code (indicates type of medication order (inpatient|outpatient|community)
--MED_CAT_CODING_DISPLAY maps to MedicationRequest / category / coding / display (text associated with category of medication request)
--MED_DOSINSTX_DOSEQUANT_VAL maps to MedicationRequest / dosageInstruction / doseQuantity / value  (amount of medication per dose)
--MED_DOSINSTX_DOSEQUANT_UNIT maps to MedicationRequest / dosageInstruction / doseQuantity / unit (unit of measurement for dosage)
--MED_DISPREQ_QUANT maps to MedicationRequest / dispenseRequest / quantity (amount of medication to supply per dispense)
--MED_DISPREQ_NUMREPS maps to MedicationRequest / dispenseRequest / numberOfRepeatsAllowed (number of refills authorized)
--MED_DISPREQ_EXPSUPP maps to MedicationRequest / dispenseRequest / expectedSupplyDuration (number of days supply per dispense)
--MED_DOSINSTX_TEXT maps to MedicationRequest / dosageInstruction / text (free text of dosage instructions)
--MED_DOSINSTX_ASNDBOOL maps to MedicationRequest / dosageInstruction / asNeededBoolean (boolean representing taking "as needed")
--MED_DOSINSTX_ROUTE maps to MedicationRequest / dosageInstruction / route (how the drug should enter the body)
--MED_SUBSTITU_ALLOWED maps to MedicationRequest / substitution / allowed (whether or not subsitution is allowed or not)
create or replace view ACT_MEDREQ_2FHIR as (
select distinct 
   med.encounter_num || '~' || med.concept_cd || '' || '~' || to_char(med.start_date,'YYYYMMDD')|| '000000.1' || '~' ||  med.provider_id    as MED_IDENTIFIER, 
    'Patient/'||med.PATIENT_NUM as MED_SUBJECT_REFERENCE, 
    'Encounter/'||med.encounter_num as MED_CONTEXT_REFERENCE, 
    'Medication/'||SUBSTR(med.concept_cd,INSTR(med.concept_cd,':')+1,LENGTH(med.concept_cd)-INSTR(med.concept_cd,':')) as MED_MEDREF_REFERENCE, 
    med.START_DATE as MED_AUTHORED_ON, 
    ' ' as MED_DISPREQ_PERIOD_START,
    ' ' as MED_DISPREQ_PERIOD_END, 
    case 
	    when med.PROVIDER_ID is null then null else 'Practitioner/'||med.PROVIDER_ID 
	end as MED_REQ_AGENT_REFERENCE,
    'order' as MED_INTENT_CODE,
    null as MED_CAT_CODING_SYS,
    null as MED_CAT_CODING_CODE,
    null as MED_CAT_CODING_DISPLAY,    
    null as MED_DOSINSTX_DOSEQUANT_VAL,
    null as MED_DOSINSTX_DOSEQUANT_UNIT, 
    null as MED_DISPREQ_QUANT, 
    null as MED_DISPREQ_NUMREPS, 
    null as MED_DISPREQ_EXPSUPP, 
    nvl(tcc1.FHIR_OUT_CD,null) as MED_DOSINSTX_TEXT, 
    null as MED_DOSINSTX_ASNDBOOL, 
    null as MED_DOSINSTX_ROUTE, 
    null as MED_SUBSTITU_ALLOWED 
from 
    OBS_FCT_MED med
    left join act_fhir_mapping tcc1 on tcc1.column_cd='MODIFIER_CD' and med.MODIFIER_CD=tcc1.local_in_cd and tcc1.table_cd = 'OBSERVATION_FACT'
where 
    med.concept_cd LIKE 'MDCTN:%' 
    -- Include this data related to MED_CAT_CODING_CODE are available (must also include join that includes this codeset)
    --    nvl(tcc2.fhir_system,null) as MED_CAT_CODING_SYS,
    --    nvl(tcc2.fhir_out_cd) as MED_CAT_CODING_CODE,
    --    nvl(tcc2.fhir_out_char) as MED_CAT_CODING_DISPLAY,
    -- Include this code to include codeset related to MED_CAT_CODING_CODE 
    -- You must provide the column name that stores your local medication request categories (assumed to be MED_CAT_CD in this case)
    -- and you must alter the local_in_cd and column_cd cells of ACT_to_FHIR_Mapping table to match your local mappings
    
--  left join act_fhir_mapping tcc2 on tcc2.column_cd='MED_CAT_CD' and med.MED_CAT_CD = tcc2.local_in_cd    
);

--PRACTITIONER 
--PRACT_IDENTIFIER maps to Practitioner / identifier
--PRACT_GENDER maps to Practitioner / gender
create or replace view ACT_PRACTITIONER_2FHIR as (
select 
    --Provider ID as practioner ID
    prov.PROVIDER_ID as PRACT_IDENTIFIER,
    null as PRACT_GENDER
from 
    provider_dimension prov
    --include to add in provider gender mappings should the data become available
    -- left join act_fhir_mapping tcc1 on tcc1.column_cd='SEX_CD' and prov.SEX_CD = tcc2.local_in_cd
);

--------------------------------------Vitals and Smoking are not currently supported by ACT-------------------------------------
--As specific vitals concepts are not recorded in the current version of ACT, therefore, 
--Vital Data has been extracted using the LOINC Codes for each measure however this table is mostly 
--unused for the purposes of ACT


--OBSERVATION (VITALS AND SMOKING)
--OBS_IDENTIFIER maps to Observation / identifier (Buisness ID for observation)
--OBS_SUBJECT_REFERENCE maps to Observation / subject / reference (Who or what the observation is about)
--OBS_CONTEXT_REFERENCE maps to Observation / context / reference (Healthcare event during which observation is made)
--OBS_CATEGORY_SYST maps to Observation / category / coding / system (system for assigning observation category)
--OBS_CATEGORY_CODE maps to Observation / category / coding / code (code that classifies the general type of observation being made)
--OBS_CATEGORY_DISPLAY maps to Observation / category / coding / display (text describing the type of observation being made)
--OBS_CODE_CODING_SYST maps to Observation / code / coding / system (system for decribing what was observed (LOINC codes))
--OBS_CODE_CODING_CODE maps to Observation / code / coding / code (Describe what was observed (observation "name"))
--OBS_CODE_CODING_DISPLAY maps to Observation / code / coding / display (text that describes the observation code)
--OBS_VALUEQUANTITY_VALUE maps to Observation / valueQuantity / value (Numerical value of the observation)
--OBS_VALUEQUANTITY_COMPARATOR maps to Observation / valueQuantity / comparator (how to undertand value of observation (greater than, equal to, etc.))
--OBS_VALUEQUANTITY_CODE maps to Observation / valueQuantity / code (coded form of unit for the value of the observation)
--OBS_VALUESTRING maps to Observation / valueString  (String representing result of observation)
--OBS_EFFECTIVEDATETIME maps to Observation / effectiveDateTime (time that the specimen is collected)
create or replace view ACT_OBSVITALS_2FHIR as (
--Body Height Vitals Measurement
select distinct
    lab.encounter_num as OBS_IDENTIFIER, 
    'Patient/'||lab.patient_num as OBS_SUBJECT_REFERENCE, 
    'Encounter/'||lab.encounter_num as OBS_CONTEXT_REFERENCE,
    nvl(tcc1.fhir_system,null) as OBS_CATEGORY_SYST,
    nvl(tcc1.fhir_out_cd,null) as OBS_CATEGORY_CODE,
    nvl(tcc1.fhir_out_char,null)as OBS_CATEGORY_DISPLAY,
    nvl(tcc2.fhir_system,null) as OBS_CODE_CODING_SYST,
    SUBSTR(lab.concept_cd,INSTR(lab.concept_cd,':')+1,LENGTH(lab.concept_cd)-INSTR(lab.concept_cd,':')) as OBS_CODE_CODING_CODE,
    nvl(tcc2.fhir_out_char,null) as OBS_CODE_CODING_DISPLAY,
    case
        when lab.concept_cd = 'LOINC:8302-2' then lab.nval_num
        else NULL
    end as OBS_VALUEQUANTITY_VALUE,
    null as OBS_VALUEQUANTITY_COMPARATOR,
    '[in_i]' as OBS_VALUEQUANTITY_CODE,
    null as OBS_VALUESTRING,
    lab.START_DATE  as OBS_ISSUED,
    null as OBS_EFFECTIVEDATETIME,
    null as OBS_REFRANGE_LOW,
    null as OBS_REFRANGE_HIGH,
    null as OBS_INTERPRETATION_CODE,
    null as OBS_INTERPRETATION_SYST
from
    OBS_FCT_LAB lab 
    left join ACT_fhir_mapping tcc1 on tcc1.column_cd='CONCEPT_CD' and lab.concept_cd=tcc1.local_in_cd and tcc1.comments='Body Height FHIR Category Mapping'
    left join ACT_fhir_mapping tcc2 on tcc2.column_cd='CONCEPT_CD' and lab.concept_cd=tcc2.local_in_cd and tcc2.comments='Body Height FHIR Code Mapping'
where
    lab.concept_cd = 'LOINC:8302-2'
    
UNION
--Body Weight Vitals
select distinct
    lab.encounter_num as OBS_IDENTIFIER, 
    'Patient/'||lab.patient_num as OBS_SUBJECT_REFERENCE, 
    'Encounter/'||lab.encounter_num as OBS_CONTEXT_REFERENCE,
    nvl(tcc1.fhir_system,null) as OBS_CATEGORY_SYST,
    nvl(tcc1.fhir_out_cd,null) as OBS_CATEGORY_CODE,
    nvl(tcc1.fhir_out_char,null)as OBS_CATEGORY_DISPLAY,
    nvl(tcc2.fhir_system,null) as OBS_CODE_CODING_SYST,
    SUBSTR(lab.concept_cd,INSTR(lab.concept_cd,':')+1,LENGTH(lab.concept_cd)-INSTR(lab.concept_cd,':')) as OBS_CODE_CODING_CODE,
     nvl(tcc2.fhir_out_char,null) as OBS_CODE_CODING_DISPLAY,
    case
        when lab.concept_cd = 'LOINC:29463-7' then lab.nval_num
        else NULL
    end as OBS_VALUEQUANTITY_VALUE,
    null as OBS_VALUEQUANTITY_COMPARATOR,
    '[lb_av]' as OBS_VALUEQUANTITY_CODE,
    null as OBS_VALUESTRING,
    lab.START_DATE as OBS_ISSUED,
    null as OBS_EFFECTIVEDATETIME,
    null as OBS_REFRANGE_LOW,
    null as OBS_REFRANGE_HIGH,
    null as OBS_INTERPRETATION_CODE,
    null as OBS_INTERPRETATION_SYST
from
    OBS_FCT_LAB lab 
    left join ACT_fhir_mapping tcc1 on tcc1.column_cd='CONCEPT_CD' and lab.concept_cd=tcc1.local_in_cd and tcc1.comments='Body Weight FHIR Category Mapping'
    left join ACT_fhir_mapping tcc2 on tcc2.column_cd='CONCEPT_CD' and lab.concept_cd=tcc2.local_in_cd and tcc2.comments='Body Weight FHIR Code Mapping'
where
    lab.concept_cd = 'LOINC:29463-7'
    
UNION
--Diastolic Blood PRessure Vitals
select distinct
    lab.encounter_num as OBS_IDENTIFIER, 
    'Patient/'||lab.patient_num as OBS_SUBJECT_REFERENCE, 
    'Encounter/'||lab.encounter_num as OBS_CONTEXT_REFERENCE,
    nvl(tcc1.fhir_system,null) as OBS_CATEGORY_SYST,
    nvl(tcc1.fhir_out_cd,null) as OBS_CATEGORY_CODE,
    nvl(tcc1.fhir_out_char,null)as OBS_CATEGORY_DISPLAY,
    nvl(tcc2.fhir_system,null) as OBS_CODE_CODING_SYST,
    SUBSTR(lab.concept_cd,INSTR(lab.concept_cd,':')+1,LENGTH(lab.concept_cd)-INSTR(lab.concept_cd,':')) as OBS_CODE_CODING_CODE,
     nvl(tcc2.fhir_out_char,null) as OBS_CODE_CODING_DISPLAY,
     case
        when lab.concept_cd = 'LOINC:8462-4' then lab.nval_num
        else NULL
     end as OBS_VALUEQUANTITY_VALUE,
     null as OBS_VALUEQUANTITY_COMPARATOR,
     'mm[Hg]' as OBS_VALUEQUANTITY_CODE,
	 null as OBS_VALUESTRING,
	 null as OBS_ISSUED,
    lab.START_DATE as OBS_EFFECTIVEDATETIME,
    null as OBS_REFRANGE_LOW,
    null as OBS_REFRANGE_HIGH,
    null as OBS_INTERPRETATION_CODE,
    null as OBS_INTERPRETATION_SYST
from
    OBS_FCT_LAB lab  
    left join ACT_fhir_mapping tcc1 on tcc1.column_cd='CONCEPT_CD' and lab.concept_cd=tcc1.local_in_cd and tcc1.comments='Diastolic Blood Pressure FHIR Category Mapping'
    left join ACT_fhir_mapping tcc2 on tcc2.column_cd='CONCEPT_CD' and lab.concept_cd=tcc2.local_in_cd and tcc2.comments='Diastolic Blood Pressure FHIR Code Mapping'
where
    lab.concept_cd = 'LOINC:8462-4'
    
UNION
--Systollic Blood Pressure Vitals
select distinct
    lab.encounter_num as OBS_IDENTIFIER, 
    'Patient/'||lab.patient_num as OBS_SUBJECT_REFERENCE, 
    'Encounter/'||lab.encounter_num as OBS_CONTEXT_REFERENCE,
    nvl(tcc1.fhir_system,null) as OBS_CATEGORY_SYST,
    nvl(tcc1.fhir_out_cd,null) as OBS_CATEGORY_CODE,
    nvl(tcc1.fhir_out_char,null)as OBS_CATEGORY_DISPLAY,
    nvl(tcc2.fhir_system,null) as OBS_CODE_CODING_SYST,
    SUBSTR(lab.concept_cd,INSTR(lab.concept_cd,':')+1,LENGTH(lab.concept_cd)-INSTR(lab.concept_cd,':')) as OBS_CODE_CODING_CODE,
     nvl(tcc2.fhir_out_char,null) as OBS_CODE_CODING_DISPLAY,
     case
        when lab.concept_cd = 'LOINC:8480-6' then lab.nval_num
        else NULL
     end as OBS_VALUEQUANTITY_VALUE,
     null as OBS_VALUEQUANTITY_COMPARATOR,
     'mm[Hg]' as OBS_VALUEQUANTITY_CODE,
	 null as OBS_VALUESTRING,
	 null as OBS_ISSUED,
    lab.START_DATE as OBS_EFFECTIVEDATETIME,
    null as OBS_REFRANGE_LOW,
    null as OBS_REFRANGE_HIGH,
    null as OBS_INTERPRETATION_CODE,
    null as OBS_INTERPRETATION_SYST
from
    OBS_FCT_LAB lab  
    left join ACT_fhir_mapping tcc1 on tcc1.column_cd='CONCEPT_CD' and lab.concept_cd=tcc1.local_in_cd and tcc1.comments='Systolic blood pressure FHIR Category Mapping'
    left join ACT_fhir_mapping tcc2 on tcc2.column_cd='CONCEPT_CD' and lab.concept_cd=tcc2.local_in_cd and tcc2.comments='Systolic blood pressure FHIR Code Mapping'
where
    lab.concept_cd = 'LOINC:8480-6'
    
UNION
--Body Mass Index Vitals 
select distinct
    lab.encounter_num as OBS_IDENTIFIER, 
    'Patient/'||lab.patient_num as OBS_SUBJECT_REFERENCE, 
    'Encounter/'||lab.encounter_num as OBS_CONTEXT_REFERENCE,
    nvl(tcc1.fhir_system,null) as OBS_CATEGORY_SYST,
    nvl(tcc1.fhir_out_cd,null) as OBS_CATEGORY_CODE,
    nvl(tcc1.fhir_out_char,null)as OBS_CATEGORY_DISPLAY,
    nvl(tcc2.fhir_system,null) as OBS_CODE_CODING_SYST,
    SUBSTR(lab.concept_cd,INSTR(lab.concept_cd,':')+1,LENGTH(lab.concept_cd)-INSTR(lab.concept_cd,':')) as OBS_CODE_CODING_CODE,
    nvl(tcc2.fhir_out_char,null) as OBS_CODE_CODING_DISPLAY,
     case
        when lab.concept_cd = 'LOINC:36156-5' then lab.nval_num
        else NULL
     end as OBS_VALUEQUANTITY_VALUE,
     null as OBS_VALUEQUANTITY_COMPARATOR,
     'kg/m2' as OBS_VALUEQUANTITY_CODE,
	 null as OBS_VALUESTRING,
	 null as OBS_ISSUED,
    lab.START_DATE as OBS_EFFECTIVEDATETIME,
    null as OBS_REFRANGE_LOW,
    null as OBS_REFRANGE_HIGH,
    null as OBS_INTERPRETATION_CODE,
    null as OBS_INTERPRETATION_SYST
from
    OBS_FCT_LAB lab  
    left join ACT_fhir_mapping tcc1 on tcc1.column_cd='CONCEPT_CD' and lab.concept_cd=tcc1.local_in_cd and tcc1.comments='Body Mass Index FHIR Category Mapping'
    left join ACT_fhir_mapping tcc2 on tcc2.column_cd='CONCEPT_CD' and lab.concept_cd=tcc2.local_in_cd and tcc2.comments='Body Mass Index FHIR Code Mapping'
where
    lab.concept_cd like 'LOINC:36156-5'
    
UNION
--Smoking Status
select distinct
    lab.encounter_num as OBS_IDENTIFIER, 
    'Patient/'||lab.patient_num as OBS_SUBJECT_REFERENCE, 
    'Encounter/'||lab.encounter_num as OBS_CONTEXT_REFERENCE,
     nvl(tcc1.fhir_system,null) as OBS_CATEGORY_SYST,
     nvl(tcc1.fhir_out_cd,null) as OBS_CATEGORY_CODE,
     nvl(tcc1.fhir_out_char,null)as OBS_CATEGORY_DISPLAY,
     nvl(tcc2.fhir_system,null) as OBS_CODE_CODING_SYST,
     SUBSTR(lab.concept_cd,INSTR(lab.concept_cd,':')+1,LENGTH(lab.concept_cd)-INSTR(lab.concept_cd,':')) as OBS_CODE_CODING_CODE,
     nvl(tcc2.fhir_out_char,null) as OBS_CODE_CODING_DISPLAY,
     null as OBS_VALUEQUANTITY_VALUE,
     null as OBS_VALUEQUANTITY_COMPARATOR,
     null as OBS_VALUEQUANTITY_CODE,
	 nvl(tcc3.fhir_out_char, null) as OBS_VALUESTRING,
	 null as OBS_ISSUED,
     lab.start_date as OBS_EFFECTIVEDATETIME,
     null as OBS_REFRANGE_LOW,
     null as OBS_REFRANGE_HIGH,
     null as OBS_INTERPRETATION_CODE,
     null as OBS_INTERPRETATION_SYST
from
    OBS_FCT_LAB lab
    left join ACT_fhir_mapping tcc1 on tcc1.column_cd='CONCEPT_CD' and lab.concept_cd=tcc1.local_in_cd and tcc1.comments='Body Mass Index FHIR Category Mapping'
    left join ACT_fhir_mapping tcc2 on tcc2.column_cd='CONCEPT_CD' and lab.concept_cd=tcc2.local_in_cd and tcc2.comments='Body Mass Index FHIR Code Mapping'
    left join act_fhir_mapping tcc3 on tcc3.column_cd='TVAL_CHAR' and lab.tval_char=tcc3.local_in_cd
where
    lab.concept_cd = 'LOINC:72166-2'
    
);