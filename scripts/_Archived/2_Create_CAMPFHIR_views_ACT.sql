--PATIENT
--PNT_IDENTIFIER maps to Patient / identifier  (An Identifier for this Patient)
--PNT_GENDER maps to Patient / gender (male | female | other | unknown)
--PNT_BIRTHDATE maps to Patient / birthDate (The date of birth for the individual [YYYY-MM-DD])
--PNT_MARITAL_STATUS_CODE  maps to Patient / maritalStatus / coding / code (Code for marital status of Patient)
--PNT_RACE maps to Patient / extension / race / coding / code (HL7 v3 Code System for race)
--PNT_ETHNICITY maps to Patient / extension / ethnicity / coding / code (HL7 v3 Code system for Race)
--PNT_ADDRESS_EXT_LAT_VALUE maps to Patient / address / extension / latitude / value (Position element using Latitude in the WGS84 datum)
--PNT_ADDRESS_EXT_LONG_VALUE maps to Patient / address / extension / longitude / value (Position element using Longitude in the WGS84 datum)
CREATE OR REPLACE VIEW ACT_PATIENT_2FHIR AS (
--If patient ethnicity table has been transfered into patient dimension the following code can be used:
SELECT DISTINCT
    TO_CHAR(PATDEM.PATIENT_NUM) AS PNT_IDENTIFIER, 
    NVL(TCC1.FHIR_OUT_CD, NULL) AS PNT_GENDER,
    (PATDEM.BIRTH_DATE) AS PNT_BIRTHDATE,
    PATDEM.MARITAL_STATUS_CD AS PNT_MARITAL_STATUS_CODE , 
    NVL(TCC3.FHIR_OUT_CD, NULL) AS PNT_RACE,
    NVL(TCC4.FHIR_OUT_CD, NULL) AS PNT_ETHNICITY,
    NULL AS PNT_ADDRESS_EXT_LAT_VALUE,
    NULL AS PNT_ADDRESS_EXT_LONG_VALUE
FROM 
    PATIENT_DIMENSION PATDEM
    LEFT JOIN ACT_FHIR_MAPPING TCC1 ON TCC1.COLUMN_CD='SEX_CD' AND PATDEM.SEX_CD=TCC1.LOCAL_IN_CD AND TCC1.TABLE_CD ='PATIENT_DIMENSION'
    LEFT JOIN ACT_FHIR_MAPPING TCC3 ON TCC3.COLUMN_CD='RACE_CD' AND PATDEM.RACE_CD=TCC3.LOCAL_IN_CD 
    LEFT JOIN ACT_FHIR_MAPPING TCC4 ON TCC4.COLUMN_CD='ETHNICITY_CD' AND PATDEM.ETHNICITY_CD=TCC4.LOCAL_IN_CD AND TCC4.TABLE_CD ='PATIENT_DIMENSION'
    --IF Patient Ethnicity data is stored in the CONCEPT_CD column of OBSERVATION_FACT table use this code instead of the above line
--    left join OBS_FCT_DEM obsfct on obsfct.patient_num = patdem.patient_num
--    left join ACT_FHIR_MAPPING tcc3 on tcc3.column_cd='CONCEPT_CD' and obsfct.concept_cd=tcc3.local_in_cd

);
--ENCOUNTER
--ENC_IDENTIFIER maps to Encounter / identifier (Identifier by which the encounter is known)
--ENC_STATUS maps to Encounter / status
--ENC_SUBJECT_REFERENCE maps to Encounter / subject / reference (The paitent present at the encounter)
--ENC_PARTICIPANT_INDIV_REF maps to Encountner / participant / individual / reference 
--                                                      (reference to persons involved in the encounter other than the patient)
--ENC_CLASS_SYST maps to Encounter / class / coding / system (system for describing the classification of patient encounter)
--ENC_CLASS_CODE maps to Encounter / class / coding / code (code for classification of patient encounter)
--ENC_CLASS_DISPLAY maps to Encounter / class / coding / display (description of encoded classification of patient encounter)
--ENC_PERIOD_START maps to Encounter / period / start (start time of the encounter)
--ENC_PERIOD_END maps to Encounter / period / end (end time of the encounter)
--ENC_HOSP_DISDISP_CODING_CODE maps to Encounter / hospitalization / dischargeDisposition / coding / code 
--                                                                      (Code for Category or kind of location after discharge)
--ENC_HOSP_DISDISP_TEXT maps to Encounter / hospitalization / dischargeDisposition / text 
--                                                                 (Description for Category or kind of location after discharge)
--ENC_HOSP_ADMSRC_CODING_CODE maps to Encounter / hospitalization / admitSource / coding / code (Code for from where the patient was admitted)
--ENC_HOSP_ADMSRC_TEXT maps to Encounter / hospitalization / admitSource / text (Descriptive text describing from where the patient was admitted)
--ENC_DIAGN_CON_REF maps to Encounter / diagnosis / condition / reference (Diagnosis or procedure relevant to this encounter)
--ENC_DIAGN_ROLE_CODING_CODE maps to Encounter / diagnosis / use / DiagnosisRole / coding / code (Role that this diagnosis has within the encounter [e.g. admission, billing, discharge …])
--ENC_DIAGN_RANK  maps to Encounter / diagnosis / rank (Ranking of the diagnosis)
CREATE OR REPLACE VIEW ACT_ENCOUNTER_2FHIR AS (
SELECT DISTINCT
        VISIT.ENCOUNTER_NUM AS ENC_IDENTIFIER,
        'unknown' AS ENC_STATUS,
        'Patient/'||VISIT.PATIENT_NUM AS ENC_SUBJECT_REFERENCE,
	    CASE 
	        WHEN DX.PROVIDER_ID IS NULL THEN NULL ELSE 'Practitioner/'||DX.PROVIDER_ID 
	    END AS ENC_PARTICIPANT_INDIV_REF, 
        'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode' AS ENC_CLASS_SYST,
        NVL(TCC1.FHIR_OUT_CD, NULL) AS ENC_CLASS_CODE,
        NVL(TCC1.FHIR_OUT_CHAR, NULL) AS ENC_CLASS_DISPLAY,
        VISIT.START_DATE AS ENC_PERIOD_START,
        VISIT.END_DATE AS ENC_PERIOD_END,
        NULL AS ENC_HOSP_DISDISP_CODING_CODE,
        NULL AS ENC_HOSP_DISDISP_TEXT,
        NULL AS ENC_HOSP_ADMSRC_CODING_CODE, 
        NULL AS ENC_HOSP_ADMSRC_TEXT, 
        NULL AS ENC_DIAGN_CON_REF,
        NULL AS ENC_DIAGN_ROLE_CODING_CODE,
        NULL AS ENC_DIAGN_RANK
        -- the following code can be used in the case where data on the diagnosis role (Discharge diagnosis, Billing, Admission 
        --diagnosis, etc.) and data on diagnosis rank (Primary, secondary, etc.) is provided (currently unsupported by ACT) 
        -- you must use join to narrow data to only primary discharge diagnosis  and provide mappings for this data 
        --(see tcc4 (Rank) and  tcc5(Role)) before using this code

--        case
--            when dx.CONCEPT_CD is null then null else 'Condition/'||dx.CONCEPT_CD 
--        end as ENC_DIAGN_CON_REF, 
--        nvl(tcc5.fhir_out_cd,null) as ENC_DIAGN_ROLE_CODING_CODE 
--        nvl(tcc4.fhir_out_cd,null) as ENC_DIAGN_RANK 

FROM 
	(VISIT_DIMENSION VISIT
        LEFT JOIN OBSERVATION_FACT_DIAGNOSIS DX ON DX.ENCOUNTER_NUM = VISIT.ENCOUNTER_NUM AND DX.PATIENT_NUM = VISIT.PATIENT_NUM
        LEFT JOIN ACT_FHIR_MAPPING TCC1 ON TCC1.COLUMN_CD='INOUT_CD' AND VISIT.INOUT_CD=TCC1.LOCAL_IN_CD)
        
     
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
CREATE OR REPLACE VIEW ACT_CONDITION_2FHIR AS (
SELECT DISTINCT
	DX.PATIENT_NUM || '~'
    || CASE WHEN DX.ENCOUNTER_NUM IS NULL THEN '' ELSE DX.ENCOUNTER_NUM || '~') END
    || DX.CONCEPT_CD || '~'
    || TO_CHAR(DX.START_DATE,'YYYYMMDD')|| '000000'
    AS CON_IDENTIFIER, 
	'Patient/' || DX.PATIENT_NUM AS CON_SUBJECT_REFERENCE,
	'Encounter/' || DX.ENCOUNTER_NUM AS CON_CONTEXT_REFERENCE,
	CASE WHEN DX.PROVIDER_ID IS NULL OR DX.PROVIDER_ID = '----' THEN NULL ELSE 'Practitioner/'||DX.PROVIDER_ID END AS CON_ASSERTER_REFERENCE, 
	CASE
		WHEN DX.CONCEPT_CD LIKE 'ICD9CM:%' THEN	'http://hl7.org/fhir/sid/icd-9-cm'
		WHEN DX.CONCEPT_CD LIKE 'ICD10CM:%' THEN 'http://hl7.org/fhir/sid/icd-10-cm'
		WHEN DX.CONCEPT_CD LIKE 'ICD11CM:%' THEN 'http://hl7.org/fhir/sid/icd-11-cm'
        WHEN DX.CONCEPT_CD LIKE 'SM:%' THEN 'http://snomed.info/sct'
		ELSE NULL
	END AS CON_CODE_CODING_SYST,
    CASE
		WHEN DX.CONCEPT_CD IS NOT NULL THEN SUBSTR(DX.CONCEPT_CD,INSTR(DX.CONCEPT_CD,':')+1,LENGTH(DX.CONCEPT_CD)-INSTR(DX.CONCEPT_CD,':'))
		ELSE NULL
    END AS CON_CODE_CODING_CODE,
	'https://www.hl7.org/fhir/valueset-condition-category' AS CON_CATEGORY_CODING_SYST,
	'encounter-diagnosis' AS CON_CATEGORY_CODING_CODE,
	TO_CHAR(DX.START_DATE, 'YYYY-MM-DD') AS CON_ASSERT_DATE,
	'active' AS CON_CLINSTATUS, 
	NULL AS CON_ABATEDATE, 
	NULL AS CON_ONSETDATE 
FROM
	OBSERVATION_FACT_DIAGNOSIS DX
);

--PROCEDURE
--PCD_IDENTIFIER maps to Procedure / identifier (External ID for Procedure)
--PCD_STATUS maps to Procedure / status
--PCD_SUBJECT_REFERENCE maps to Procedure / subject / reference (who the procdure was performed on)
--PCD_CONTEXT_REFERENCE maps to Procedure / encounter / reference (encounter created as part of procedure)
--PCD_PERF_ACTOR_REF maps to Procedure / performer / actor / reference (reference to practitioner)
--PCD_CODE_CODING_SYST maps to Procedure / code / coding / system (system used to identify procedures (SNOMED is standard))
--PCD_CODE_CODING_CODE maps to Procedure / code / coding / code (Identification of procedure)
--PCD_PERFORMED_PDT maps to Procedure / performed / performedDateTime (when the procedure was performed)
CREATE OR REPLACE VIEW ACT_PROCEDURE_2FHIR AS (
SELECT DISTINCT
	PX.PATIENT_NUM || '~'
    || PX.ENCOUNTER_NUM || '~'
    || CASE
		WHEN PX.CONCEPT_CD LIKE 'ICD9PROC:%' THEN 'ICD9:' || SUBSTR(PX.CONCEPT_CD,INSTR(PX.CONCEPT_CD,':')+1,LENGTH(PX.CONCEPT_CD)-INSTR(PX.CONCEPT_CD,':'))
		WHEN PX.CONCEPT_CD LIKE 'ICD10PCS:%' THEN 'ICD10:' || SUBSTR(PX.CONCEPT_CD,INSTR(PX.CONCEPT_CD,':')+1,LENGTH(PX.CONCEPT_CD)-INSTR(PX.CONCEPT_CD,':'))
        WHEN PX.CONCEPT_CD LIKE 'CPT4:%' THEN 'CPT:' || SUBSTR(PX.CONCEPT_CD,INSTR(PX.CONCEPT_CD,':')+1,LENGTH(PX.CONCEPT_CD)-INSTR(PX.CONCEPT_CD,':'))
        WHEN PX.CONCEPT_CD LIKE 'HCPCS:%' THEN PX.CONCEPT_CD
		ELSE NULL
	END || '~'
    || TO_CHAR(PX.START_DATE,'YYYYMMDD')|| '000000.0' || '~'
    || PX.PROVIDER_ID AS PCD_IDENTIFIER,
    'unknown' AS PCD_STATUS,
	'Patient/' || PX.PATIENT_NUM AS PCD_SUBJECT_REFERENCE,
	'Encounter/' || PX.ENCOUNTER_NUM AS PCD_CONTEXT_REFERENCE,
	CASE 
	    WHEN PX.PROVIDER_ID IS NULL THEN NULL ELSE 'Practitioner/'||PX.PROVIDER_ID 
	END AS PCD_PERF_ACTOR_REF, 
	CASE
		WHEN PX.CONCEPT_CD LIKE 'ICD9PROC:%' THEN	'http://hl7.org/fhir/sid/icd-9-cm/'
		WHEN PX.CONCEPT_CD LIKE 'ICD10PCS:%' THEN 'http://hl7.org/fhir/sid/icd-10-cm/'
        WHEN PX.CONCEPT_CD LIKE 'CPT4:%' AND (SUBSTR(PX.CONCEPT_CD,INSTR(PX.CONCEPT_CD,':')+1,LENGTH(PX.CONCEPT_CD)-INSTR(PX.CONCEPT_CD,':')) != '99999') THEN 'http://www.ama-assn.org/go/cpt/'
        WHEN PX.CONCEPT_CD LIKE 'HCPCS:%' THEN 'http://www.ama-assn.org/go/cpt/' -- THIS CODESET IS BASED ON THE CPT CODESET
        WHEN PX.CONCEPT_CD LIKE 'LC:%' THEN 'http://loinc.org/'
		WHEN PX.CONCEPT_CD LIKE 'ND:%' THEN 'http://hl7.org/fhir/sid/ndc/'
        ELSE NULL
	END AS PCD_CODE_CODING_SYST,
    CASE
		WHEN PX.CONCEPT_CD IS NOT NULL THEN SUBSTR(PX.CONCEPT_CD,INSTR(PX.CONCEPT_CD,':')+1,LENGTH(PX.CONCEPT_CD)-INSTR(PX.CONCEPT_CD,':'))
		ELSE NULL
	END AS PCD_CODE_CODING_CODE,
	PX.START_DATE AS PCD_PERFORMED_PDT
FROM
	OBERVATION_FACT_PROCEDURE PX

);


--OBSERVATION (LABS)
--OBS_IDENTIFIER maps to Observation / identifier  (Buisness ID for observation)
--OBS_STATUS maps to Observation / status
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
CREATE OR REPLACE VIEW ACT_OBSLABS_2FHIR AS (
SELECT DISTINCT
    LABS.ENCOUNTER_NUM || '~' || LABS.CONCEPT_CD || '~' || TO_CHAR(LABS.START_DATE,'YYYYMMDD')|| '000000.1' || '~' ||  LABS.PROVIDER_ID   AS OBS_IDENTIFIER, 
    'final' AS OBS_STATUS,
    'Patient/'||LABS.PATIENT_NUM AS OBS_SUBJECT_REFERENCE, 
    'Encounter/'||LABS.ENCOUNTER_NUM AS OBS_CONTEXT_REFERENCE,
    'http://hl7.org/fhir/ValueSet/observation-category' AS OBS_CATEGORY_SYST,
    'laboratory' AS OBS_CATEGORY_CODE,
    'Laboratory' AS OBS_CATEGORY_DISPLAY,
    'http://loinc.org' AS OBS_CODE_CODING_SYST,
    SUBSTR(LABS.CONCEPT_CD,INSTR(LABS.CONCEPT_CD,':')+1,LENGTH(LABS.CONCEPT_CD)-INSTR(LABS.CONCEPT_CD,':')) AS OBS_CODE_CODING_CODE,
    NULL AS OBS_CODE_CODING_DISPLAY,
    CASE 
        WHEN LABS.VALTYPE_CD = 'T' THEN NULL
        ELSE LABS.NVAL_NUM
    END AS OBS_VALUEQUANTITY_VALUE,
    CASE
        WHEN LABS.VALTYPE_CD = 'T' THEN NULL
        WHEN LABS.TVAL_CHAR IN ('GE','G','LE','L') THEN NVL(TCC1.FHIR_OUT_CD,NULL)
        ELSE NULL
    END AS OBS_VALUEQUANTITY_COMPARATOR,
    CASE  
        WHEN LABS.VALTYPE_CD = 'T' THEN NULL
        ELSE LABS.UNITS_CD
    END AS OBS_VALUEQUANTITY_CODE,
    CASE
        WHEN LABS.VALTYPE_CD = 'N' THEN NULL 
        ELSE LABS.TVAL_CHAR
    END AS OBS_VALUESTRING,
    LABS.START_DATE AS OBS_ISSUED, 
    NULL AS OBS_EFFECTIVEDATETIME,
    NULL AS OBS_REFRANGE_LOW,
    NULL AS OBS_REFRANGE_HIGH,
    NVL(TCC2.FHIR_OUT_CD,NULL) AS OBS_INTERPRETATION_CODE, 
    'http://hl7.org/fhir/ValueSet/observation-interpretation' AS OBS_INTERPRETATION_SYST 
FROM
    OBSERVATION_FACT_LAB LABS
    LEFT JOIN ACT_FHIR_MAPPING TCC1 ON TCC1.COLUMN_CD='TVAL_CHAR' AND LABS.TVAL_CHAR=TCC1.LOCAL_IN_CD
    LEFT JOIN ACT_FHIR_MAPPING TCC2 ON TCC2.COLUMN_CD='VALUEFLAG_CD' AND LABS.VALUEFLAG_CD=TCC2.LOCAL_IN_CD 
);

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
CREATE OR REPLACE VIEW ACT_MEDREQ_2FHIR AS (
SELECT DISTINCT 
    MED.ENCOUNTER_NUM || '~' || MED.CONCEPT_CD || '' || '~' || TO_CHAR(MED.START_DATE,'YYYYMMDD')|| '000000.1' || '~' ||  MED.PROVIDER_ID    AS MED_IDENTIFIER, 
    'Patient/'||MED.PATIENT_NUM AS MED_SUBJECT_REFERENCE, 
    'Encounter/'||MED.ENCOUNTER_NUM AS MED_CONTEXT_REFERENCE, 
    'Medication/'||SUBSTR(MED.CONCEPT_CD,INSTR(MED.CONCEPT_CD,':')+1,LENGTH(MED.CONCEPT_CD)-INSTR(MED.CONCEPT_CD,':')) AS MED_MEDREF_REFERENCE, 
    MED.START_DATE AS MED_AUTHORED_ON, 
    NULL AS MED_DISPREQ_PERIOD_START,
    NULL AS MED_DISPREQ_PERIOD_END, 
    CASE 
	    WHEN MED.PROVIDER_ID IS NULL THEN NULL ELSE 'Practitioner/'||MED.PROVIDER_ID 
	END AS MED_REQ_AGENT_REFERENCE,
    'order' AS MED_INTENT_CODE,
    NULL AS MED_CAT_CODING_SYS,
    NULL AS MED_CAT_CODING_CODE,
    NULL AS MED_CAT_CODING_DISPLAY,    
    NULL AS MED_DOSINSTX_DOSEQUANT_VAL,
    NULL AS MED_DOSINSTX_DOSEQUANT_UNIT, 
    NULL AS MED_DISPREQ_QUANT, 
    NULL AS MED_DISPREQ_NUMREPS, 
    NULL AS MED_DISPREQ_EXPSUPP, 
    NVL(TCC1.FHIR_OUT_CD,NULL) AS MED_DOSINSTX_TEXT, 
    NULL AS MED_DOSINSTX_ASNDBOOL, 
    NULL AS MED_DOSINSTX_ROUTE, 
    NULL AS MED_SUBSTITU_ALLOWED 
FROM 
    OBSERVATION_FACT_MEDICATION MED
    LEFT JOIN ACT_FHIR_MAPPING TCC1 ON TCC1.COLUMN_CD='MODIFIER_CD' AND MED.MODIFIER_CD=TCC1.LOCAL_IN_CD
    
   
   
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
CREATE OR REPLACE VIEW ACT_PRACTITIONER_2FHIR AS (
SELECT 
    --Provider ID as practioner ID
    PROV.PROVIDER_ID AS PRACT_IDENTIFIER,
    --Provider ID as NPI identifier
    -- SUBSTR(prov.NAME_CHAR,INSTR(prov.NAME_CHAR,':')+1,LENGTH(prov.NAME_CHAR)-INSTR(prov.NAME_CHAR,':')) as PRACT_IDENTIFIER,
    NULL AS PRACT_GENDER
FROM 
    PROVIDER_DIMENSION PROV
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
CREATE OR REPLACE VIEW ACT_OBSVITALS_2FHIR AS (
--Body Height Vitals Measurement
SELECT DISTINCT
    LAB.ENCOUNTER_NUM AS OBS_IDENTIFIER, 
    'PATIENT/'||LAB.PATIENT_NUM AS OBS_SUBJECT_REFERENCE, 
    'ENCOUNTER/'||LAB.ENCOUNTER_NUM AS OBS_CONTEXT_REFERENCE,
    NVL(TCC1.FHIR_SYSTEM,NULL) AS OBS_CATEGORY_SYST,
    NVL(TCC1.FHIR_OUT_CD,NULL) AS OBS_CATEGORY_CODE,
    NVL(TCC1.FHIR_OUT_CHAR,NULL)AS OBS_CATEGORY_DISPLAY,
    NVL(TCC2.FHIR_SYSTEM,NULL) AS OBS_CODE_CODING_SYST,
    SUBSTR(LAB.CONCEPT_CD,INSTR(LAB.CONCEPT_CD,':')+1,LENGTH(LAB.CONCEPT_CD)-INSTR(LAB.CONCEPT_CD,':')) AS OBS_CODE_CODING_CODE,
    NVL(TCC2.FHIR_OUT_CHAR,NULL) AS OBS_CODE_CODING_DISPLAY,
    CASE
        WHEN LAB.CONCEPT_CD = 'LOINC:8302-2' THEN LAB.NVAL_NUM
        ELSE NULL
    END AS OBS_VALUEQUANTITY_VALUE,
    NULL AS OBS_VALUEQUANTITY_COMPARATOR,
    '[IN_I]' AS OBS_VALUEQUANTITY_CODE,
    NULL AS OBS_VALUESTRING,
    LAB.START_DATE  AS OBS_ISSUED,
    NULL AS OBS_EFFECTIVEDATETIME,
    NULL AS OBS_REFRANGE_LOW,
    NULL AS OBS_REFRANGE_HIGH,
    NULL AS OBS_INTERPRETATION_CODE,
    NULL AS OBS_INTERPRETATION_SYST
FROM
    OBS_FCT_LAB LAB 
    LEFT JOIN ACT_FHIR_MAPPING TCC1 ON TCC1.COLUMN_CD='CONCEPT_CD' AND LAB.CONCEPT_CD=TCC1.LOCAL_IN_CD AND TCC1.COMMENTS='BODY HEIGHT FHIR CATEGORY MAPPING'
    LEFT JOIN ACT_FHIR_MAPPING TCC2 ON TCC2.COLUMN_CD='CONCEPT_CD' AND LAB.CONCEPT_CD=TCC2.LOCAL_IN_CD AND TCC2.COMMENTS='BODY HEIGHT FHIR CODE MAPPING'
WHERE
    LAB.CONCEPT_CD = 'LOINC:8302-2'
    
UNION
--BODY WEIGHT VITALS
SELECT DISTINCT
    LAB.ENCOUNTER_NUM AS OBS_IDENTIFIER, 
    'PATIENT/'||LAB.PATIENT_NUM AS OBS_SUBJECT_REFERENCE, 
    'ENCOUNTER/'||LAB.ENCOUNTER_NUM AS OBS_CONTEXT_REFERENCE,
    NVL(TCC1.FHIR_SYSTEM,NULL) AS OBS_CATEGORY_SYST,
    NVL(TCC1.FHIR_OUT_CD,NULL) AS OBS_CATEGORY_CODE,
    NVL(TCC1.FHIR_OUT_CHAR,NULL)AS OBS_CATEGORY_DISPLAY,
    NVL(TCC2.FHIR_SYSTEM,NULL) AS OBS_CODE_CODING_SYST,
    SUBSTR(LAB.CONCEPT_CD,INSTR(LAB.CONCEPT_CD,':')+1,LENGTH(LAB.CONCEPT_CD)-INSTR(LAB.CONCEPT_CD,':')) AS OBS_CODE_CODING_CODE,
     NVL(TCC2.FHIR_OUT_CHAR,NULL) AS OBS_CODE_CODING_DISPLAY,
    CASE
        WHEN LAB.CONCEPT_CD = 'LOINC:29463-7' THEN LAB.NVAL_NUM
        ELSE NULL
    END AS OBS_VALUEQUANTITY_VALUE,
    NULL AS OBS_VALUEQUANTITY_COMPARATOR,
    '[LB_AV]' AS OBS_VALUEQUANTITY_CODE,
    NULL AS OBS_VALUESTRING,
    LAB.START_DATE AS OBS_ISSUED,
    NULL AS OBS_EFFECTIVEDATETIME,
    NULL AS OBS_REFRANGE_LOW,
    NULL AS OBS_REFRANGE_HIGH,
    NULL AS OBS_INTERPRETATION_CODE,
    NULL AS OBS_INTERPRETATION_SYST
FROM
    OBS_FCT_LAB LAB 
    LEFT JOIN ACT_FHIR_MAPPING TCC1 ON TCC1.COLUMN_CD='CONCEPT_CD' AND LAB.CONCEPT_CD=TCC1.LOCAL_IN_CD AND TCC1.COMMENTS='BODY WEIGHT FHIR CATEGORY MAPPING'
    LEFT JOIN ACT_FHIR_MAPPING TCC2 ON TCC2.COLUMN_CD='CONCEPT_CD' AND LAB.CONCEPT_CD=TCC2.LOCAL_IN_CD AND TCC2.COMMENTS='BODY WEIGHT FHIR CODE MAPPING'
WHERE
    LAB.CONCEPT_CD = 'LOINC:29463-7'
    
UNION
--DIASTOLIC BLOOD PRESSURE VITALS
SELECT DISTINCT
    LAB.ENCOUNTER_NUM AS OBS_IDENTIFIER, 
    'PATIENT/'||LAB.PATIENT_NUM AS OBS_SUBJECT_REFERENCE, 
    'ENCOUNTER/'||LAB.ENCOUNTER_NUM AS OBS_CONTEXT_REFERENCE,
    NVL(TCC1.FHIR_SYSTEM,NULL) AS OBS_CATEGORY_SYST,
    NVL(TCC1.FHIR_OUT_CD,NULL) AS OBS_CATEGORY_CODE,
    NVL(TCC1.FHIR_OUT_CHAR,NULL)AS OBS_CATEGORY_DISPLAY,
    NVL(TCC2.FHIR_SYSTEM,NULL) AS OBS_CODE_CODING_SYST,
    SUBSTR(LAB.CONCEPT_CD,INSTR(LAB.CONCEPT_CD,':')+1,LENGTH(LAB.CONCEPT_CD)-INSTR(LAB.CONCEPT_CD,':')) AS OBS_CODE_CODING_CODE,
     NVL(TCC2.FHIR_OUT_CHAR,NULL) AS OBS_CODE_CODING_DISPLAY,
     CASE
        WHEN LAB.CONCEPT_CD = 'LOINC:8462-4' THEN LAB.NVAL_NUM
        ELSE NULL
     END AS OBS_VALUEQUANTITY_VALUE,
     NULL AS OBS_VALUEQUANTITY_COMPARATOR,
     'MM[HG]' AS OBS_VALUEQUANTITY_CODE,
	 NULL AS OBS_VALUESTRING,
	 NULL AS OBS_ISSUED,
    LAB.START_DATE AS OBS_EFFECTIVEDATETIME,
    NULL AS OBS_REFRANGE_LOW,
    NULL AS OBS_REFRANGE_HIGH,
    NULL AS OBS_INTERPRETATION_CODE,
    NULL AS OBS_INTERPRETATION_SYST
FROM
    OBS_FCT_LAB LAB  
    LEFT JOIN ACT_FHIR_MAPPING TCC1 ON TCC1.COLUMN_CD='CONCEPT_CD' AND LAB.CONCEPT_CD=TCC1.LOCAL_IN_CD AND TCC1.COMMENTS='DIASTOLIC BLOOD PRESSURE FHIR CATEGORY MAPPING'
    LEFT JOIN ACT_FHIR_MAPPING TCC2 ON TCC2.COLUMN_CD='CONCEPT_CD' AND LAB.CONCEPT_CD=TCC2.LOCAL_IN_CD AND TCC2.COMMENTS='DIASTOLIC BLOOD PRESSURE FHIR CODE MAPPING'
WHERE
    LAB.CONCEPT_CD = 'LOINC:8462-4'
    
UNION
--SYSTOLLIC BLOOD PRESSURE VITALS
SELECT DISTINCT
    LAB.ENCOUNTER_NUM AS OBS_IDENTIFIER, 
    'PATIENT/'||LAB.PATIENT_NUM AS OBS_SUBJECT_REFERENCE, 
    'ENCOUNTER/'||LAB.ENCOUNTER_NUM AS OBS_CONTEXT_REFERENCE,
    NVL(TCC1.FHIR_SYSTEM,NULL) AS OBS_CATEGORY_SYST,
    NVL(TCC1.FHIR_OUT_CD,NULL) AS OBS_CATEGORY_CODE,
    NVL(TCC1.FHIR_OUT_CHAR,NULL)AS OBS_CATEGORY_DISPLAY,
    NVL(TCC2.FHIR_SYSTEM,NULL) AS OBS_CODE_CODING_SYST,
    SUBSTR(LAB.CONCEPT_CD,INSTR(LAB.CONCEPT_CD,':')+1,LENGTH(LAB.CONCEPT_CD)-INSTR(LAB.CONCEPT_CD,':')) AS OBS_CODE_CODING_CODE,
     NVL(TCC2.FHIR_OUT_CHAR,NULL) AS OBS_CODE_CODING_DISPLAY,
     CASE
        WHEN LAB.CONCEPT_CD = 'LOINC:8480-6' THEN LAB.NVAL_NUM
        ELSE NULL
     END AS OBS_VALUEQUANTITY_VALUE,
     NULL AS OBS_VALUEQUANTITY_COMPARATOR,
     'MM[HG]' AS OBS_VALUEQUANTITY_CODE,
	 NULL AS OBS_VALUESTRING,
	 NULL AS OBS_ISSUED,
    LAB.START_DATE AS OBS_EFFECTIVEDATETIME,
    NULL AS OBS_REFRANGE_LOW,
    NULL AS OBS_REFRANGE_HIGH,
    NULL AS OBS_INTERPRETATION_CODE,
    NULL AS OBS_INTERPRETATION_SYST
FROM
    OBS_FCT_LAB LAB  
    LEFT JOIN ACT_FHIR_MAPPING TCC1 ON TCC1.COLUMN_CD='CONCEPT_CD' AND LAB.CONCEPT_CD=TCC1.LOCAL_IN_CD AND TCC1.COMMENTS='SYSTOLIC BLOOD PRESSURE FHIR CATEGORY MAPPING'
    LEFT JOIN ACT_FHIR_MAPPING TCC2 ON TCC2.COLUMN_CD='CONCEPT_CD' AND LAB.CONCEPT_CD=TCC2.LOCAL_IN_CD AND TCC2.COMMENTS='SYSTOLIC BLOOD PRESSURE FHIR CODE MAPPING'
WHERE
    LAB.CONCEPT_CD = 'LOINC:8480-6'
    
UNION
--BODY MASS INDEX VITALS 
SELECT DISTINCT
    LAB.ENCOUNTER_NUM AS OBS_IDENTIFIER, 
    'PATIENT/'||LAB.PATIENT_NUM AS OBS_SUBJECT_REFERENCE, 
    'ENCOUNTER/'||LAB.ENCOUNTER_NUM AS OBS_CONTEXT_REFERENCE,
    NVL(TCC1.FHIR_SYSTEM,NULL) AS OBS_CATEGORY_SYST,
    NVL(TCC1.FHIR_OUT_CD,NULL) AS OBS_CATEGORY_CODE,
    NVL(TCC1.FHIR_OUT_CHAR,NULL)AS OBS_CATEGORY_DISPLAY,
    NVL(TCC2.FHIR_SYSTEM,NULL) AS OBS_CODE_CODING_SYST,
    SUBSTR(LAB.CONCEPT_CD,INSTR(LAB.CONCEPT_CD,':')+1,LENGTH(LAB.CONCEPT_CD)-INSTR(LAB.CONCEPT_CD,':')) AS OBS_CODE_CODING_CODE,
    NVL(TCC2.FHIR_OUT_CHAR,NULL) AS OBS_CODE_CODING_DISPLAY,
     CASE
        WHEN LAB.CONCEPT_CD = 'LOINC:36156-5' THEN LAB.NVAL_NUM
        ELSE NULL
     END AS OBS_VALUEQUANTITY_VALUE,
     NULL AS OBS_VALUEQUANTITY_COMPARATOR,
     'KG/M2' AS OBS_VALUEQUANTITY_CODE,
	 NULL AS OBS_VALUESTRING,
	 NULL AS OBS_ISSUED,
    LAB.START_DATE AS OBS_EFFECTIVEDATETIME,
    NULL AS OBS_REFRANGE_LOW,
    NULL AS OBS_REFRANGE_HIGH,
    NULL AS OBS_INTERPRETATION_CODE,
    NULL AS OBS_INTERPRETATION_SYST
FROM
    OBS_FCT_LAB LAB  
    LEFT JOIN ACT_FHIR_MAPPING TCC1 ON TCC1.COLUMN_CD='CONCEPT_CD' AND LAB.CONCEPT_CD=TCC1.LOCAL_IN_CD AND TCC1.COMMENTS='BODY MASS INDEX FHIR CATEGORY MAPPING'
    LEFT JOIN ACT_FHIR_MAPPING TCC2 ON TCC2.COLUMN_CD='CONCEPT_CD' AND LAB.CONCEPT_CD=TCC2.LOCAL_IN_CD AND TCC2.COMMENTS='BODY MASS INDEX FHIR CODE MAPPING'
WHERE
    LAB.CONCEPT_CD LIKE 'LOINC:36156-5'
    
UNION
--SMOKING STATUS
SELECT DISTINCT
    LAB.ENCOUNTER_NUM AS OBS_IDENTIFIER, 
    'PATIENT/'||LAB.PATIENT_NUM AS OBS_SUBJECT_REFERENCE, 
    'ENCOUNTER/'||LAB.ENCOUNTER_NUM AS OBS_CONTEXT_REFERENCE,
     NVL(TCC1.FHIR_SYSTEM,NULL) AS OBS_CATEGORY_SYST,
     NVL(TCC1.FHIR_OUT_CD,NULL) AS OBS_CATEGORY_CODE,
     NVL(TCC1.FHIR_OUT_CHAR,NULL)AS OBS_CATEGORY_DISPLAY,
     NVL(TCC2.FHIR_SYSTEM,NULL) AS OBS_CODE_CODING_SYST,
     SUBSTR(LAB.CONCEPT_CD,INSTR(LAB.CONCEPT_CD,':')+1,LENGTH(LAB.CONCEPT_CD)-INSTR(LAB.CONCEPT_CD,':')) AS OBS_CODE_CODING_CODE,
     NVL(TCC2.FHIR_OUT_CHAR,NULL) AS OBS_CODE_CODING_DISPLAY,
     NULL AS OBS_VALUEQUANTITY_VALUE,
     NULL AS OBS_VALUEQUANTITY_COMPARATOR,
     NULL AS OBS_VALUEQUANTITY_CODE,
	 NVL(TCC3.FHIR_OUT_CHAR, NULL) AS OBS_VALUESTRING,
	 NULL AS OBS_ISSUED,
     LAB.START_DATE AS OBS_EFFECTIVEDATETIME,
     NULL AS OBS_REFRANGE_LOW,
     NULL AS OBS_REFRANGE_HIGH,
     NULL AS OBS_INTERPRETATION_CODE,
     NULL AS OBS_INTERPRETATION_SYST
FROM
    OBS_FCT_LAB LAB
    LEFT JOIN ACT_FHIR_MAPPING TCC1 ON TCC1.COLUMN_CD='CONCEPT_CD' AND LAB.CONCEPT_CD=TCC1.LOCAL_IN_CD AND TCC1.COMMENTS='BODY MASS INDEX FHIR CATEGORY MAPPING'
    LEFT JOIN ACT_FHIR_MAPPING TCC2 ON TCC2.COLUMN_CD='CONCEPT_CD' AND LAB.CONCEPT_CD=TCC2.LOCAL_IN_CD AND TCC2.COMMENTS='BODY MASS INDEX FHIR CODE MAPPING'
    LEFT JOIN ACT_FHIR_MAPPING TCC3 ON TCC3.COLUMN_CD='TVAL_CHAR' AND LAB.TVAL_CHAR=TCC3.LOCAL_IN_CD
WHERE
    LAB.CONCEPT_CD = 'LOINC:72166-2'
    
);