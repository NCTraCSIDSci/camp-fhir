CREATE TABLE ACT_FHIR_MAPPING  ( 
	TABLE_CD       	VARCHAR2(50) NULL,
	COLUMN_CD      	VARCHAR2(50) NULL,
	LOCAL_IN_CD    	VARCHAR2(50) NULL,
	FHIR_OUT_CD    	VARCHAR2(50) NULL,
	FHIR_OUT_CHAR  	VARCHAR2(100) NULL,
	COMMENTS       	VARCHAR2(200) NULL,
	FHIR_OUT_COLUMN	VARCHAR2(50) NULL,
	FHIR_SYSTEM    	VARCHAR2(200) NULL 
	)
-- Patient mappings 

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PATIENT_DIMENSION', 'SEX_CD', 'DEM|SEX:M', 'male', 'Male', NULL, 'PNT_GENDER', 'https://hl7.org/fhir/STU3/valueset-administrative-gender.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PATIENT_DIMENSION', 'SEX_CD', 'DEM|SEX:F', 'female', 'Female', NULL, 'PNT_GENDER', 'https://hl7.org/fhir/STU3/valueset-administrative-gender.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PATIENT_DIMENSION', 'SEX_CD', 'DEM|SEX:NI', 'unknown', 'Unknown', NULL, 'PNT_GENDER', 'https://hl7.org/fhir/STU3/valueset-administrative-gender.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PATIENT_DIMENSION', 'SEX_CD', 'DEM|SEX:A', 'other', 'Other', NULL, 'PNT_GENDER', 'https://hl7.org/fhir/STU3/valueset-administrative-gender.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PATIENT_DIMENSION', 'SEX_CD', 'DEM|SEX:O', 'unknown', 'Unknown', NULL, 'PNT_GENDER', 'https://hl7.org/fhir/STU3/valueset-administrative-gender.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('PATIENT_DIMENSION', 'ETHNICITY_CD', 'DEM|HISP:Y', '2135-2', 'Hispanic or Latino', NULL, 'PNT_ETHNICITY', 'https://www.hl7.org/fhir/v3/Ethnicity/cs.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('PATIENT_DIMENSION', 'ETHNICITY_CD', 'DEM|HISP:N', '2186-5', 'Not Hispanic or Latino', NULL, 'PNT_ETHNICITY', 'https://www.hl7.org/fhir/v3/Ethnicity/cs.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('PATIENT_DIMENSION', 'ETHNICITY_CD', 'DEM|HISP:NI', NULL, NULL, 'No Mapping for No Info', 'PNT_ETHNICITY', 'https://www.hl7.org/fhir/v3/Ethnicity/cs.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('PATIENT_DIMENSION', 'RACE_CD', 'DEM|RACE:NA', '1002-5', 'American Indian or Alaska Native', NULL, 'PNT_RACE', 'https://www.hl7.org/fhir/v3/Race/cs.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('PATIENT_DIMENSION', 'RACE_CD', 'DEM|RACE:AS', '2028-9', 'Asian', NULL, 'PNT_RACE', 'https://www.hl7.org/fhir/v3/Race/cs.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('PATIENT_DIMENSION', 'RACE_CD', 'DEM|RACE:B', '2054-5', 'Black or African American', NULL, 'PNT_RACE', 'https://www.hl7.org/fhir/v3/Race/cs.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('PATIENT_DIMENSION', 'RACE_CD', 'DEM|RACE:M', NULL, NULL, 'No Mapping for Multiple Races', 'PNT_RACE', 'https://www.hl7.org/fhir/v3/Race/cs.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('PATIENT_DIMENSION', 'RACE_CD', 'DEM|RACE:H', '2076-8', 'Native Hawaiian or Other Pacific Islander', NULL, 'PNT_RACE', 'https://www.hl7.org/fhir/v3/Race/cs.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('PATIENT_DIMENSION', 'RACE_CD', 'DEM|RACE:NI', '2131-1', 'Other', 'No Mapping for No Information', 'PNT_RACE', 'https://www.hl7.org/fhir/v3/Race/cs.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('PATIENT_DIMENSION', 'RACE_CD', 'DEM|RACE:W', '2106-3', 'White', NULL, 'PNT_RACE', 'https://www.hl7.org/fhir/v3/Race/cs.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('PATIENT_DIMENSION', 'RACE_CD', 'DEM|RACE:O', '2131-1', 'Other',NULL, 'PNT_RACE', 'https://www.hl7.org/fhir/v3/Race/cs.html');


INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('PATIENT_DIMENSION', 'VITAL_STATUS_CD', 'DEM|VITAL STATUS:D', '1', NULL, NULL, 'PNT_DECEASED', 'https://www.hl7.org/fhir/patient-definitions.html#Patient.deceased_x_');
--Patient Mappings if Ethnicity is store in Observation Fact
INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'DEM|HISP:Y', '2135-2', 'Hispanic or Latino', NULL, 'PNT_ETHNICITY', 'https://www.hl7.org/fhir/v3/Ethnicity/cs.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'DEM|HISP:N', '2186-5', 'Not Hispanic or Latino', NULL, 'PNT_ETHNICITY', 'https://www.hl7.org/fhir/v3/Ethnicity/cs.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'DEM|HISP:NI', NULL, NULL, 'No Mapping for No Info', 'PNT_ETHNICITY', 'https://www.hl7.org/fhir/v3/Ethnicity/cs.html');
--ACT Visit Mappings

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('VISIT_DIMENSION', 'RACE_CD', 'DEM|RACE:W', '2106-3', NULL, 'White', 'PNT_RACE', 'https://www.hl7.org/fhir/v3/Race/cs.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('VISIT_DIMENSION', 'INOUT_CD', 'O', 'AMB', 'ambulatory', NULL, 'ENC_CLASS_CODE', 'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('VISIT_DIMENSION', 'INOUT_CD', 'E', 'EMER', 'emergency', NULL, 'ENC_CLASS_CODE', 'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('VISIT_DIMENSION', 'INOUT_CD', 'EI', 'IMP', 'impatient encounter', 'imperfect match', 'ENC_CLASS_CODE', 'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('VISIT_DIMENSION', 'INOUT_CD', 'I', 'IMP', 'impatient encounter', NULL, 'ENC_CLASS_CODE', 'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('VISIT_DIMENSION', 'INOUT_CD', 'NA', 'NONAC', 'impatient non-acute', NULL, 'ENC_CLASS_CODE', 'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('VISIT_DIMENSION', 'INOUT_CD', 'X', 'AMB', 'ambulatory', NULL, 'ENC_CLASS_CODE', 'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('VISIT_DIMENSION', 'INOUT_CD', 'N', NULL, NULL,'No Mapping for Unknown', 'ENC_CLASS_CODE', 'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'MODIFIER_CD', 'ACT|DIAG_PRIORITY:P', 1, NULL,'Imperfect Match', 'ENC_DIAG_RANK', 'https://www.hl7.org/fhir/encounter-definitions.html#Encounter.diagnosis.rank');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'MODIFIER_CD', 'ACT|DIAG_PRIORITY:S', 2, NULL,'Imperfect Match', 'ENC_DIAG_RANK', 'https://www.hl7.org/fhir/encounter-definitions.html#Encounter.diagnosis.rank');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'MODIFIER_CD', 'ACT|DIAG_PRIORITY:NI', NULL, NULL,'No mapping for unknown', 'ENC_DIAG_RANK', 'https://www.hl7.org/fhir/encounter-definitions.html#Encounter.diagnosis.rank');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'MODIFIER_CD', '@', NULL, NULL,'No priority information provided', 'ENC_DIAG_RANK', 'https://www.hl7.org/fhir/encounter-definitions.html#Encounter.diagnosis.rank');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'TVAL_CHAR', 'E', '=', 'Equal' ,NULL, 'OBS_VALUEQUANTITY_COMPARATOR', 'https://www.hl7.org/fhir/v3/RelationalOperator/cs.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'TVAL_CHAR', 'GE', '>=', 'Greater than or Equal' ,NULL, 'OBS_VALUEQUANTITY_COMPARATOR', 'https://www.hl7.org/fhir/v3/RelationalOperator/cs.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'TVAL_CHAR', 'G', '>', 'Greater than' ,NULL, 'OBS_VALUEQUANTITY_COMPARATOR', 'https://www.hl7.org/fhir/v3/RelationalOperator/cs.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'TVAL_CHAR', 'LE', '<=', 'Less than or equal' ,NULL, 'OBS_VALUEQUANTITY_COMPARATOR', 'https://www.hl7.org/fhir/v3/RelationalOperator/cs.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'TVAL_CHAR', 'L', '<', 'Less than' ,NULL, 'OBS_VALUEQUANTITY_COMPARATOR', 'https://www.hl7.org/fhir/v3/RelationalOperator/cs.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'TVAL_CHAR', 'TX', NULL, NULL ,'No mapping for text entries', 'OBS_VALUEQUANTITY_COMPARATOR', 'https://www.hl7.org/fhir/v3/RelationalOperator/cs.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'VALUEFLAG_CD', 'H', 'H', 'High' ,NULL, 'OBS_INTERPRETATION_CODE', 'http://hl7.org/fhir/ValueSet/observation-interpretation');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'VALUEFLAG_CD', 'L', 'L', 'Low' ,NULL, 'OBS_INTERPRETATION_CODE', 'http://hl7.org/fhir/ValueSet/observation-interpretation');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'VALUEFLAG_CD', 'N', 'N', 'Normal' ,NULL, 'OBS_INTERPRETATION_CODE', 'http://hl7.org/fhir/ValueSet/observation-interpretation');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'VALUEFLAG_CD', '@', 'N', NULL ,'UNKNOWN MAPS TO NORMAL', 'OBS_INTERPRETATION_CODE', 'http://hl7.org/fhir/ValueSet/observation-interpretation');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'MODIFIER_CD', 'ACT|MED_TYPE:O', 'in-progress', 'In Progress' ,'Imperfect Match', 'OBS_MED_DISP_STS', 'http://hl7.org/fhir/DSTU2/valueset-medication-dispense-status.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'MODIFIER_CD', 'ACT|MED_TYPE:D', 'completed', 'Completed' ,'Imperfect Match', 'OBS_MED_DISP_STS', 'http://hl7.org/fhir/DSTU2/valueset-medication-dispense-status.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'MODIFIER_CD', 'ACT|MED_TYPE:A', NULL, NULL ,'No Mappings for Medicine Administration', 'OBS_MED_DISP_STS', 'http://hl7.org/fhir/DSTU2/valueset-medication-dispense-status.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PROVIDER_DIMENSION', 'SEX_CD', 'DEM|SEX:M', 'male', 'Male', NULL, 'PRACT_GENDER', 'https://hl7.org/fhir/STU3/valueset-administrative-gender.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PROVIDER_DIMENSION', 'SEX_CD', 'DEM|SEX:F', 'female', 'Female', NULL, 'PRACT_GENDER', 'https://hl7.org/fhir/STU3/valueset-administrative-gender.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PROVIDER_DIMENSION', 'SEX_CD', 'DEM|SEX:NI', 'unknown', 'Unknown', NULL, 'PRACT_GENDER', 'https://hl7.org/fhir/STU3/valueset-administrative-gender.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PROVIDER_DIMENSION', 'SEX_CD', 'DEM|SEX:A', 'other', 'Other', NULL, 'PRACT_GENDER', 'https://hl7.org/fhir/STU3/valueset-administrative-gender.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PROVIDER_DIMENSION', 'SEX_CD', 'DEM|SEX:O', 'unknown', 'Unknown', NULL, 'PRACT_GENDER', 'https://hl7.org/fhir/STU3/valueset-administrative-gender.html');

--Vitals MAppings
INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'TVAL_CHAR', 'LA18976-3', '449868002', 'Current every day smoker', 'LOINC:72166-2 Answer List conversion to Snomed' , 'OBS_CODE_CODING_CODE', 'http://snomed.info/sct');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'TVAL_CHAR', 'LA18977-1', '428041000124106', 'Current some day smoker', 'LOINC:72166-2 Answer List conversion to Snomed', 'OBS_CODE_CODING_CODE', 'http://snomed.info/sct');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'TVAL_CHAR', 'LA15920-4', '8517006', 'Former smoker', 'LOINC:72166-2 Answer List conversion to Snomed', 'OBS_CODE_CODING_CODE', 'http://snomed.info/sct');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'TVAL_CHAR', 'LA18978-9', '266919005', 'Never smoker', 'LOINC:72166-2 Answer List conversion to Snomed', 'OBS_CODE_CODING_CODE', 'http://snomed.info/sct');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'TVAL_CHAR', 'LA18979-7', '77176002', 'Smoker, current status unknown', 'LOINC:72166-2 Answer List conversion to Snomed', 'OBS_CODE_CODING_CODE', 'http://snomed.info/sct');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'TVAL_CHAR', 'LA18980-5', '266927001', 'Unknown if ever smoked', 'LOINC:72166-2 Answer List conversion to Snomed', 'OBS_CODE_CODING_CODE', 'http://snomed.info/sct');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'TVAL_CHAR', 'LA18981-3', '428071000124103', 'Current Heavy tobacco smoker', 'LOINC:72166-2 Answer List conversion to Snomed', 'OBS_CODE_CODING_CODE', 'http://snomed.info/sct');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'TVAL_CHAR', 'LA18982-1', '428061000124105', 'Current Light tobacco smoker', 'LOINC:72166-2 Answer List conversion to Snomed', 'OBS_CODE_CODING_CODE', 'http://snomed.info/sct');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'ICD10:Z72.0', '77176002', 'Smoker (finding)', 'ICD10:Z72.0', 'OBS_CODE_CODING_CODE', 'http://hl7.org/fhir/icd.html') ;
--Provider Mappings

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PROVIDER_DIMENSION', 'SEX_CD', 'DEM|SEX:M', 'male', 'Male', NULL, 'PROVIDER_SEX', 'https://hl7.org/fhir/STU3/valueset-administrative-gender.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PROVIDER_DIMENSION', 'SEX_CD', 'DEM|SEX:F', 'female', 'Female', NULL, 'PROVIDER_SEX', 'https://hl7.org/fhir/STU3/valueset-administrative-gender.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PROVIDER_DIMENSION', 'SEX_CD', 'DEM|SEX:NI', 'unknown', 'Unknown', NULL, 'PROVIDER_SEX', 'https://hl7.org/fhir/STU3/valueset-administrative-gender.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PROVIDER_DIMENSION', 'SEX_CD', 'DEM|SEX:A', 'other', 'Other', NULL, 'PROVIDER_SEX', 'https://hl7.org/fhir/STU3/valueset-administrative-gender.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PROVIDER_DIMENSION', 'SEX_CD', 'DEM|SEX:O', 'unknown', 'Unknown', NULL, 'PROVIDER_SEX', 'https://hl7.org/fhir/STU3/valueset-administrative-gender.html');
--Mappings for Elements in FHIR that are currently unsupported by ACT data model
--Unsupported Mappings related to Encounter Resource

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'home', 'Home', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-discharge-disposition.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'alt-home', 'Alternative Home', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-discharge-disposition.html'); 

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'other-hcf', 'Other Healthcare Facility', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-discharge-disposition.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'hosp', 'Hospice', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-discharge-disposition.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'long', 'Long-term care', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-discharge-disposition.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'aadvice', 'Left against advice', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-discharge-disposition.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'exp', 'Expired', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-discharge-disposition.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'psy', 'Psychiatric hospital', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-discharge-disposition.html');  

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'rehab', 'Rehabilitation', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-discharge-disposition.html');  

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'snf', 'Skilled nursing facility', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-discharge-disposition.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'other', 'Other', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-discharge-disposition.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'hosp-trans', 'Transferred from other hospital', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'emd', 'From accident/emergency department', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'outp', 'From outpatient department', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'born', 'Born in hospital', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'gp', 'General Practitioner Referral', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'mp', 'Medical Practitioner/physician referral', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'nursing', 'From nursing home', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'psych', 'From psychiatric hospital', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'rehab', 'From rehabilitation facility', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'other', 'Other', 'This FHIR Spec currently has no analog in ACT', 'ENC_HOSP_DISDISP_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'AD', 'Admission Diagnosis', 'This FHIR Spec currently has no analog in ACT', 'ENC_DIAGN_ROLE_CODING_CODE', 'https://www.hl7.org/fhir/valueset-diagnosis-role.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'DD', 'Discharge Diagnosis', 'This FHIR Spec currently has no analog in ACT', 'ENC_DIAGN_ROLE_CODING_CODE', 'https://www.hl7.org/fhir/valueset-diagnosis-role.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'CC', 'Cheif Complaint', 'This FHIR Spec currently has no analog in ACT', 'ENC_DIAGN_ROLE_CODING_CODE', 'https://www.hl7.org/fhir/valueset-diagnosis-role.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'CM', 'Comorbidity Diagnosis', 'This FHIR Spec currently has no analog in ACT', 'ENC_DIAGN_ROLE_CODING_CODE', 'https://www.hl7.org/fhir/valueset-diagnosis-role.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'pre-op', 'pre-op diagnosis', 'This FHIR Spec currently has no analog in ACT', 'ENC_DIAGN_ROLE_CODING_CODE', 'https://www.hl7.org/fhir/valueset-diagnosis-role.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'post-op', 'post-op diagnosis', 'This FHIR Spec currently has no analog in ACT', 'ENC_DIAGN_ROLE_CODING_CODE', 'https://www.hl7.org/fhir/valueset-diagnosis-role.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'billing', 'Billing', 'This FHIR Spec currently has no analog in ACT', 'ENC_DIAGN_ROLE_CODING_CODE', 'https://www.hl7.org/fhir/valueset-diagnosis-role.html');
--Unsupported Mappings related to Medication Request Resource

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'inpatient', 'Inpatient', 'This FHIR Spec currently has no analog in ACT', 'MED_CAT_CODING_CODE', 'https://www.hl7.org/fhir/STU3/valueset-medication-request-catery.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'outpatient', 'Outpatient', 'This FHIR Spec currently has no analog in ACT', 'MED_CAT_CODING_CODE', 'https://www.hl7.org/fhir/STU3/valueset-medication-request-catery.html');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'Local Codeset Unavailable (Unsupported by ACT)', 'community', 'Community', 'This FHIR Spec currently has no analog in ACT', 'MED_CAT_CODING_CODE', 'https://www.hl7.org/fhir/STU3/valueset-medication-request-catery.html');
--Unsupported Mappings related to Vitals and Smoking

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'LOINC:8302-2', 'vital-signs', 'Vital Signs', 'Body Height FHIR Catery Mapping','OBS_CATERY_CODE','http://hl7.org/fhir/ValueSet/observation-catery');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'LOINC:8302-2', '8302-2', 'Body Height', 'Body Height FHIR Code Mapping','OBS_CODE_CODING_CODE','https://loinc.org');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'LOINC:29463-7', 'vital-signs', 'Vital Signs', 'Body Weight FHIR Catery Mapping','OBS_CATERY_CODE','http://hl7.org/fhir/ValueSet/observation-catery');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'LOINC:29463-7', '29463-7', 'Body weight', 'Body Weight FHIR Code Mapping','OBS_CODE_CODING_CODE','https://loinc.org');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'LOINC:8462-4', 'vital-signs', 'Vital Signs', 'Diastolic Blood Pressure FHIR Catery Mapping','OBS_CATERY_CODE','http://hl7.org/fhir/ValueSet/observation-catery');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'LOINC:8462-4', '8462-4', 'Diastolic Blood Pressure', 'Diastolic Blood Pressure FHIR Code Mapping','OBS_CODE_CODING_CODE','https://loinc.org');  
  
INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'LOINC:8460-6', 'vital-signs', 'Vital Signs', 'Systolic blood pressure FHIR Catery Mapping','OBS_CATERY_CODE','http://hl7.org/fhir/ValueSet/observation-catery');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'LOINC:8460-6', '8460-6', 'Systolic blood pressure', 'Systolic blood pressure FHIR Code Mapping','OBS_CODE_CODING_CODE','https://loinc.org');  
 
INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'LOINC:36156-5', 'vital-signs', 'Vital Signs', 'Body Mass Index FHIR Catery Mapping','OBS_CATERY_CODE','http://hl7.org/fhir/ValueSet/observation-catery');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'LOINC:36156-5', '36156-5', 'Body Mass Index', 'Body Mass Index FHIR Code Mapping','OBS_CODE_CODING_CODE','https://loinc.org');  
 
INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'LOINC:72166-2', 'social-history', 'Social History', 'Tobacco smoking status FHIR Catery Mapping','OBS_CATERY_CODE','http://hl7.org/fhir/ValueSet/observation-catery');

INSERT INTO ACT_FHIR_MAPPING(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('OBSERVATION_FACT', 'CONCEPT_CD', 'LOINC:72166-2', '72166-2', 'Tobacco smoking status', 'Tobacco smoking status FHIR Code Mapping','OBS_CODE_CODING_CODE','https://loinc.org');    