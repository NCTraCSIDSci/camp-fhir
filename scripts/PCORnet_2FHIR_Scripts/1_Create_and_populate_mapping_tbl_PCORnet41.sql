CREATE TABLE pcornet_fhir_mapping  ( 
	TABLE_CD       	VARCHAR2(50) NULL,
	COLUMN_CD      	VARCHAR2(50) NULL,
	LOCAL_IN_CD    	VARCHAR2(50) NULL,
	FHIR_OUT_CD    	VARCHAR2(50) NULL,
	FHIR_OUT_CHAR  	VARCHAR2(100) NULL,
	COMMENTS       	VARCHAR2(200) NULL,
	FHIR_OUT_COLUMN	VARCHAR2(50) NULL,
	FHIR_SYSTEM    	VARCHAR2(200) NULL 
	)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PROVIDER', 'PROVIDER_SEX', 'OT', 'other', NULL, NULL, 'PRACT_GENDER', 'https://www.hl7.org/fhir/valueset-administrative-gender.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'SEX', 'M', 'male', 'Male', NULL, 'PNT_GENDER', 'https://www.hl7.org/fhir/valueset-administrative-gender')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'SEX', 'F', 'female', 'Female', NULL, 'PNT_GENDER', 'https://www.hl7.org/fhir/valueset-administrative-gender')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'SEX', 'UN', 'unknown', 'Unknown', NULL, 'PNT_GENDER', 'https://www.hl7.org/fhir/valueset-administrative-gender')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'SEX', 'A', 'other', 'Other', NULL, 'PNT_GENDER', 'https://www.hl7.org/fhir/valueset-administrative-gender')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'SEX', 'NI', 'unknown', 'Unknown', NULL, 'PNT_GENDER', 'https://www.hl7.org/fhir/valueset-administrative-gender')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'SEX', 'OT', 'other', 'Other', NULL, 'PNT_GENDER', 'https://www.hl7.org/fhir/valueset-administrative-gender')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'RACE', '01', '1002-5', 'American Indian or Alaska Native', NULL, 'PNT_RACE', 'http://hl7.org/fhir/v3/Race')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'RACE', '02', '2028-9', 'Asian', NULL, 'PNT_RACE', 'http://hl7.org/fhir/v3/Race')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'RACE', '03', '2054-5', 'Black or African American', NULL, 'PNT_RACE', 'http://hl7.org/fhir/v3/Race')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'RACE', '04', '2076-8', 'Native Hawaiian or Other Pacific Islander', NULL, 'PNT_RACE', 'http://hl7.org/fhir/v3/Race')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'RACE', '05', '2106-3', 'White', NULL, 'PNT_RACE', 'http://hl7.org/fhir/v3/Race')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'RACE', '06', '2131-1', 'Other', 'Have to map multiple race to Other ', 'PNT_RACE', 'http://hl7.org/fhir/v3/Race')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'RACE', '07', NULL, NULL, 'No mapping for unknown', 'PNT_RACE', 'http://hl7.org/fhir/v3/Race')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'RACE', 'NI', NULL, NULL, 'No mapping for unknown', 'PNT_RACE', 'http://hl7.org/fhir/v3/Race')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'RACE', 'UN', NULL, NULL, 'No mapping for unknown', 'PNT_RACE', 'http://hl7.org/fhir/v3/Race')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'RACE', 'OT', '2131-1', 'Other', 'Other is valid but deprecated in FHIR', 'PNT_RACE', 'http://hl7.org/fhir/v3/Race')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'HISPANIC', 'Y', '2135-2', 'Hispanic or Latino', NULL, 'PNT_ETHNICITY', 'http://hl7.org/fhir/v3/Ethnicity')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'HISPANIC', 'N', '2186-5', 'Not Hispanic or Latino', NULL, 'PNT_ETHNICITY', 'http://hl7.org/fhir/v3/Ethnicity')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'HISPANIC', 'R', NULL, NULL, 'No mapping for unknown', 'PNT_ETHNICITY', 'http://hl7.org/fhir/v3/Ethnicity')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'HISPANIC', 'NI', NULL, NULL, 'No mapping for unknown', 'PNT_ETHNICITY', 'http://hl7.org/fhir/v3/Ethnicity')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'HISPANIC', 'UN', NULL, NULL, 'No mapping for unknown', 'PNT_ETHNICITY', 'http://hl7.org/fhir/v3/Ethnicity')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('DEMOGRAPHIC', 'HISPANIC', 'OT', NULL, NULL, 'No mapping for unknown', 'PNT_ETHNICITY', 'http://hl7.org/fhir/v3/Ethnicity')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ENC_TYPE', 'AV', 'AMB', 'ambulatory', NULL, 'ENC_CLASS_CODE', 'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ENC_TYPE', 'ED', 'EMER', 'emergency', NULL, 'ENC_CLASS_CODE', 'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ENC_TYPE', 'EI', 'IMP', 'inpatient encounter', 'imperfect match', 'ENC_CLASS_CODE', 'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ENC_TYPE', 'IP', 'IMP', 'inpatient encounter', NULL, 'ENC_CLASS_CODE', 'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ENC_TYPE', 'IS', 'NONAC', 'inpatient non-acute', NULL, 'ENC_CLASS_CODE', 'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ENC_TYPE', 'OS', 'SS', 'short stay', 'imperfect match', 'ENC_CLASS_CODE', 'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ENC_TYPE', 'IC', 'IMP', 'inpatient encounter', 'imperfect match', 'ENC_CLASS_CODE', 'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ENC_TYPE', 'OA', 'AMB', 'ambulatory', NULL, 'ENC_CLASS_CODE', 'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ENC_TYPE', 'NI', NULL, NULL, 'No mapping for unknown', 'ENC_CLASS_CODE', 'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ENC_TYPE', 'UN', NULL, NULL, 'No mapping for unknown', 'ENC_CLASS_CODE', 'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ENC_TYPE', 'OT', NULL, NULL, 'No mapping for other', 'ENC_CLASS_CODE', 'http://hl7.org/fhir/ValueSet/v3-ActEncounterCode')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'DISCHARGE_STATUS', 'AF', 'oth', 'Other', 'imperfect match', 'ENC_HOSP_DISDISP_CODING_CODE', 'http://hl7.org/fhir/ValueSet/encounter-discharge-disposition')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'DISCHARGE_STATUS', 'AL', 'oth', 'Other', 'imperfect match', 'ENC_HOSP_DISDISP_CODING_CODE', 'http://hl7.org/fhir/ValueSet/encounter-discharge-disposition')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'DISCHARGE_STATUS', 'AM', 'aadvice', 'Left against advice', NULL, 'ENC_HOSP_DISDISP_CODING_CODE', 'http://hl7.org/fhir/ValueSet/encounter-discharge-disposition')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'DISCHARGE_STATUS', 'AW', 'oth', 'Other', 'imperfect match', 'ENC_HOSP_DISDISP_CODING_CODE', 'http://hl7.org/fhir/ValueSet/encounter-discharge-disposition')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'DISCHARGE_STATUS', 'EX', 'exp', 'Expired', NULL, 'ENC_HOSP_DISDISP_CODING_CODE', 'http://hl7.org/fhir/ValueSet/encounter-discharge-disposition')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'DISCHARGE_STATUS', 'HH', 'oth', 'Other', 'imperfect match', 'ENC_HOSP_DISDISP_CODING_CODE', 'http://hl7.org/fhir/ValueSet/encounter-discharge-disposition')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'DISCHARGE_STATUS', 'HO', 'home', 'Home', NULL, 'ENC_HOSP_DISDISP_CODING_CODE', 'http://hl7.org/fhir/ValueSet/encounter-discharge-disposition')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'DISCHARGE_STATUS', 'HS', 'hosp', 'Hospice', NULL, 'ENC_HOSP_DISDISP_CODING_CODE', 'http://hl7.org/fhir/ValueSet/encounter-discharge-disposition')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'DISCHARGE_STATUS', 'IP', 'other-hcf', 'Other healthcare facility', NULL, 'ENC_HOSP_DISDISP_CODING_CODE', 'http://hl7.org/fhir/ValueSet/encounter-discharge-disposition')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'DISCHARGE_STATUS', 'NH', 'long', 'Long-term care', 'imperfect match', 'ENC_HOSP_DISDISP_CODING_CODE', 'http://hl7.org/fhir/ValueSet/encounter-discharge-disposition')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'DISCHARGE_STATUS', 'RH', 'rehab', 'Rehabilitation', NULL, 'ENC_HOSP_DISDISP_CODING_CODE', 'http://hl7.org/fhir/ValueSet/encounter-discharge-disposition')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'DISCHARGE_STATUS', 'RS', 'long', 'Long-term care', 'imperfect match', 'ENC_HOSP_DISDISP_CODING_CODE', 'http://hl7.org/fhir/ValueSet/encounter-discharge-disposition')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'DISCHARGE_STATUS', 'SH', 'oth', 'Other', 'imperfect match', 'ENC_HOSP_DISDISP_CODING_CODE', 'http://hl7.org/fhir/ValueSet/encounter-discharge-disposition')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'DISCHARGE_STATUS', 'SN', 'snf', 'Skilled nursing facility', NULL, 'ENC_HOSP_DISDISP_CODING_CODE', 'http://hl7.org/fhir/ValueSet/encounter-discharge-disposition')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'DISCHARGE_STATUS', 'NI', NULL, NULL, 'No mapping for unknown', 'ENC_HOSP_DISDISP_CODING_CODE', 'http://hl7.org/fhir/ValueSet/encounter-discharge-disposition')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'DISCHARGE_STATUS', 'UN', NULL, NULL, 'No mapping for unknown', 'ENC_HOSP_DISDISP_CODING_CODE', 'http://hl7.org/fhir/ValueSet/encounter-discharge-disposition')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'DISCHARGE_STATUS', 'OT', 'oth', 'Other', NULL, 'ENC_HOSP_DISDISP_CODING_CODE', 'http://hl7.org/fhir/ValueSet/encounter-discharge-disposition')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ADMITTING_SOURCE', 'AF', 'oth', 'Other', 'imperfect match', 'ENC_HOSP_ADMSRC_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ADMITTING_SOURCE', 'AL', 'oth', 'Other', 'imperfect match', 'ENC_HOSP_ADMSRC_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ADMITTING_SOURCE', 'AV', 'outp', 'From outpatient department', NULL, 'ENC_HOSP_ADMSRC_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ADMITTING_SOURCE', 'ED', 'emd', 'From accident/emergency department', NULL, 'ENC_HOSP_ADMSRC_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ADMITTING_SOURCE', 'HH', 'oth', 'Other', 'imperfect match', 'ENC_HOSP_ADMSRC_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ADMITTING_SOURCE', 'HO', 'oth', 'Other', 'imperfect match', 'ENC_HOSP_ADMSRC_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ADMITTING_SOURCE', 'HS', 'oth', 'Other', 'imperfect match', 'ENC_HOSP_ADMSRC_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ADMITTING_SOURCE', 'IP', 'hosp-trans', 'Transferred from other hospital', NULL, 'ENC_HOSP_ADMSRC_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ADMITTING_SOURCE', 'NH', 'nursing', 'From nursing home', NULL, 'ENC_HOSP_ADMSRC_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ADMITTING_SOURCE', 'RH', 'rehab', 'From rehabilitation facility', NULL, 'ENC_HOSP_ADMSRC_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ADMITTING_SOURCE', 'RS', 'oth', 'Other', 'imperfect match', 'ENC_HOSP_ADMSRC_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ADMITTING_SOURCE', 'SN', 'oth', 'Other', 'imperfect match', 'ENC_HOSP_ADMSRC_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ADMITTING_SOURCE', 'IH', 'oth', 'Other', 'imperfect match', 'ENC_HOSP_ADMSRC_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ADMITTING_SOURCE', 'NI', NULL, NULL, 'No mapping for unknown', 'ENC_HOSP_ADMSRC_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ADMITTING_SOURCE', 'UN', NULL, NULL, 'No mapping for unknown', 'ENC_HOSP_ADMSRC_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('ENCOUNTER', 'ADMITTING_SOURCE', 'OT', 'oth', 'Other', NULL, 'ENC_HOSP_ADMSRC_CODING_CODE', 'https://www.hl7.org/fhir/valueset-encounter-admit-source.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('VITALS', 'SMOKING', '01', '449868002', 'Current every day smoker', NULL, 'OBS_CODE_CODING_CODE', 'http://snomed.info/sct')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('VITALS', 'SMOKING', '02', '428041000124106', 'Current some day smoke', NULL, 'OBS_CODE_CODING_CODE', 'http://snomed.info/sct')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('VITALS', 'SMOKING', '03', '8517006', 'Former smoker', NULL, 'OBS_CODE_CODING_CODE', 'http://snomed.info/sct')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('VITALS', 'SMOKING', '04', '266919005', 'Never smoker', NULL, 'OBS_CODE_CODING_CODE', 'http://snomed.info/sct')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('VITALS', 'SMOKING', '05', '77176002', 'Smoker, current status unknown', NULL, 'OBS_CODE_CODING_CODE', 'http://snomed.info/sct')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('VITALS', 'SMOKING', '06', '266927001', 'Unknown if ever smoked', NULL, 'OBS_CODE_CODING_CODE', 'http://snomed.info/sct')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('VITALS', 'SMOKING', '07', '428071000124103', 'Current Heavy tobacco smoker', NULL, 'OBS_CODE_CODING_CODE', 'http://snomed.info/sct')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('VITALS', 'SMOKING', '08', '428061000124105', 'Current Light tobacco smoker', NULL, 'OBS_CODE_CODING_CODE', 'http://snomed.info/sct')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('VITALS', 'SMOKING', 'NI', NULL, NULL, 'No mapping for null', 'OBS_CODE_CODING_CODE', 'http://snomed.info/sct')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('VITALS', 'SMOKING', 'UN', '266927001', 'Unknown if ever smoked', NULL, 'OBS_CODE_CODING_CODE', 'http://snomed.info/sct')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('VITALS', 'SMOKING', 'OT', NULL, NULL, 'No mapping for other', 'OBS_CODE_CODING_CODE', 'http://snomed.info/sct')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'RESULT_MODIFIER', 'EQ', NULL, NULL, NULL, 'OBS_VALUEQUANTITY_COMPARATOR', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'RESULT_MODIFIER', 'GE', '>=', NULL, NULL, 'OBS_VALUEQUANTITY_COMPARATOR', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'RESULT_MODIFIER', 'GT', '>', NULL, NULL, 'OBS_VALUEQUANTITY_COMPARATOR', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'RESULT_MODIFIER', 'LE', '<=', NULL, NULL, 'OBS_VALUEQUANTITY_COMPARATOR', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'RESULT_MODIFIER', 'LT', '<', NULL, NULL, 'OBS_VALUEQUANTITY_COMPARATOR', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'RESULT_MODIFIER', 'TX', NULL, NULL, NULL, 'OBS_VALUEQUANTITY_COMPARATOR', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'RESULT_MODIFIER', 'NI', NULL, NULL, 'No mapping for unknown', 'OBS_VALUEQUANTITY_COMPARATOR', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'RESULT_MODIFIER', 'UN', NULL, NULL, 'No mapping for unknown', 'OBS_VALUEQUANTITY_COMPARATOR', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'RESULT_MODIFIER', 'OT', NULL, NULL, 'No mapping for other', 'OBS_VALUEQUANTITY_COMPARATOR', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'ABN_IND', 'AB', 'A', 'Abnormal', NULL, 'OBS_INTERPRETATION', 'https://www.hl7.org/fhir/valueset-observation-interpretation.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'ABN_IND', 'AH', 'H', 'High', NULL, 'OBS_INTERPRETATION', 'https://www.hl7.org/fhir/valueset-observation-interpretation.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'ABN_IND', 'AL', 'L', 'Low', NULL, 'OBS_INTERPRETATION', 'https://www.hl7.org/fhir/valueset-observation-interpretation.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'ABN_IND', 'CH', 'HH', 'Critically high', NULL, 'OBS_INTERPRETATION', 'https://www.hl7.org/fhir/valueset-observation-interpretation.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'ABN_IND', 'CL', 'LL', 'Critically low', NULL, 'OBS_INTERPRETATION', 'https://www.hl7.org/fhir/valueset-observation-interpretation.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'ABN_IND', 'CR', 'AA', 'Critical', NULL, 'OBS_INTERPRETATION', 'https://www.hl7.org/fhir/valueset-observation-interpretation.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'ABN_IND', 'IN', 'IND', 'Indeterminate', NULL, 'OBS_INTERPRETATION', 'https://www.hl7.org/fhir/valueset-observation-interpretation.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'ABN_IND', 'NL', 'N', 'Normal', NULL, 'OBS_INTERPRETATION', 'https://www.hl7.org/fhir/valueset-observation-interpretation.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'ABN_IND', 'NI', NULL, NULL, 'No mapping for unknown', 'OBS_INTERPRETATION', 'https://www.hl7.org/fhir/valueset-observation-interpretation.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'ABN_IND', 'UN', NULL, NULL, 'No mapping for unknown', 'OBS_INTERPRETATION', 'https://www.hl7.org/fhir/valueset-observation-interpretation.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('LAB_RESULT_CM', 'ABN_IND', 'OT', NULL, NULL, 'No mapping for other', 'OBS_INTERPRETATION', 'https://www.hl7.org/fhir/valueset-observation-interpretation.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('CONDITION', 'CONDITION_STATUS', 'AC', 'active', 'Active', NULL, 'CON_CLINICALSTAT', 'https://www.hl7.org/fhir/valueset-condition-clinical.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('CONDITION', 'CONDITION_STATUS', 'RS', 'resolved', 'Resolved', NULL, 'CON_CLINICALSTAT', 'https://www.hl7.org/fhir/valueset-condition-clinical.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('CONDITION', 'CONDITION_STATUS', 'IN', 'inactive', 'Inactive', NULL, 'CON_CLINICALSTAT', 'https://www.hl7.org/fhir/valueset-condition-clinical.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('CONDITION', 'CONDITION_STATUS', 'NI', NULL, NULL, 'No mapping for unknown', 'CON_CLINICALSTAT', 'https://www.hl7.org/fhir/valueset-condition-clinical.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('CONDITION', 'CONDITION_STATUS', 'UN', NULL, NULL, 'No mapping for unknown', 'CON_CLINICALSTAT', 'https://www.hl7.org/fhir/valueset-condition-clinical.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('CONDITION', 'CONDITION_STATUS', 'OT', NULL, NULL, 'No mapping for other', 'CON_CLINICALSTAT', 'https://www.hl7.org/fhir/valueset-condition-clinical.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PRESCRIBING', 'RX_PRN_FLAG', 'Y', 'true', 'true', NULL, 'MED_DOSINSTX_ASNDBOOL', 'https://www.hl7.org/fhir/dosage.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PRESCRIBING', 'RX_PRN_FLAG', 'N', 'false', 'false', NULL, 'MED_DOSINSTX_ASNDBOOL', 'https://www.hl7.org/fhir/dosage.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PRESCRIBING', 'RX_DISPENSE_AS_WRITTEN', 'Y', 'true', 'true', NULL, 'MED_SUBSTITU_ALLOWED', 'https://www.hl7.org/fhir/medicationrequest.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PRESCRIBING', 'RX_DISPENSE_AS_WRITTEN', 'N', 'false', 'false', NULL, 'MED_SUBSTITU_ALLOWED', 'https://www.hl7.org/fhir/medicationrequest.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PRESCRIBING', 'RX_FREQUENCY', '01', 'Every day', NULL, NULL, 'MED_DOSINSTX_TEXT', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PRESCRIBING', 'RX_FREQUENCY', '02', 'Two times a day (BID)', NULL, NULL, 'MED_DOSINSTX_TEXT', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PRESCRIBING', 'RX_FREQUENCY', '03', 'Three times a day (TID)', NULL, NULL, 'MED_DOSINSTX_TEXT', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PRESCRIBING', 'RX_FREQUENCY', '04', 'Four times a day (QID)', NULL, NULL, 'MED_DOSINSTX_TEXT', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PRESCRIBING', 'RX_FREQUENCY', '05', 'Every morning', NULL, NULL, 'MED_DOSINSTX_TEXT', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PRESCRIBING', 'RX_FREQUENCY', '06', 'Every afternoon', NULL, NULL, 'MED_DOSINSTX_TEXT', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PRESCRIBING', 'RX_FREQUENCY', '07', 'Before meals', NULL, NULL, 'MED_DOSINSTX_TEXT', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PRESCRIBING', 'RX_FREQUENCY', '08', 'After meals', NULL, NULL, 'MED_DOSINSTX_TEXT', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PRESCRIBING', 'RX_FREQUENCY', '10', 'Every evening', NULL, NULL, 'MED_DOSINSTX_TEXT', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PRESCRIBING', 'RX_FREQUENCY', '11', 'Once', NULL, NULL, 'MED_DOSINSTX_TEXT', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PRESCRIBING', 'RX_FREQUENCY', 'NI', NULL, NULL, 'No mapping for unknown', 'MED_DOSINSTX_TEXT', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PRESCRIBING', 'RX_FREQUENCY', 'UN', NULL, NULL, 'No mapping for unknown', 'MED_DOSINSTX_TEXT', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PRESCRIBING', 'RX_FREQUENCY', 'OT', NULL, NULL, 'No mapping for other', 'MED_DOSINSTX_TEXT', NULL)
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PROVIDER', 'PROVIDER_SEX', 'A', 'other', NULL, NULL, 'PRACT_GENDER', 'https://www.hl7.org/fhir/valueset-administrative-gender.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PROVIDER', 'PROVIDER_SEX', 'F', 'female', NULL, NULL, 'PRACT_GENDER', 'https://www.hl7.org/fhir/valueset-administrative-gender.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PROVIDER', 'PROVIDER_SEX', 'M', 'male', NULL, NULL, 'PRACT_GENDER', 'https://www.hl7.org/fhir/valueset-administrative-gender.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PROVIDER', 'PROVIDER_SEX', 'NI', 'unknown', NULL, NULL, 'PRACT_GENDER', 'https://www.hl7.org/fhir/valueset-administrative-gender.html')
GO
INSERT INTO pcornet_fhir_mapping(TABLE_CD, COLUMN_CD, LOCAL_IN_CD, FHIR_OUT_CD, FHIR_OUT_CHAR, COMMENTS, FHIR_OUT_COLUMN, FHIR_SYSTEM)
  VALUES('PROVIDER', 'PROVIDER_SEX', 'UN', 'unknown', NULL, NULL, 'PRACT_GENDER', 'https://www.hl7.org/fhir/valueset-administrative-gender.html')
GO
