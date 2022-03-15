CREATE VIEW CAMPFHIR_VIEW_OBSERVATION ( OBS_SUBJECT_REF, CON_BASEDON_REF, OBS_PARTOF_REF, OBS_STATUS, OBS_CATEGORY, OBS_CODE, OBS_FOCUS_REF, OBS_ENCOUNTER_REF, OBS_EFFECTIVE_X, OBS_EFFECTIVEDATETIME, OBS_EFFECTIVEPERIOD, OBS_EFFECTIVETIMING, OBS_EFFECTIVEINSTANT, OBS_ISSUED, OBS_PERFORMER_REF, OBS_VALUE_X, OBS_VALUEQUANTITY, OBS_VALUECODEABLECONCEPT, OBS_VALUESTRING, OBS_VALUEBOOLEAN, OBS_VALUEINTEGER, OBS_VALUERANGE, OBS_VALUERATIO, OBS_VALUESAMPLEDDATA, OBS_VALUETIME, OBS_VALUEDATETIME, OBS_VALUEPERIOD, OBS_DATAABSENTREASON, OBS_INTERPRETATION, OBS_NOTE, OBS_BODYSITE, OBS_METHOD, OBS_SPECIMEN_REF, OBS_DEVICE_REF, OBS_REFERENCERANGE, OBS_REFERENCERANGE_LOW, OBS_REFERENCERANGE_HIGH, OBS_REFERENCERANGE_TYPE, OBS_REFERENCERANGE_APPLIESTO, OBS_REFERENCERANGE_AGE, OBS_REFERENCERANGE_TEXT, OBS_HASMEMBER_REF, OBS_DERIVEDFROM_REF, OBS_COMPONENT, OBS_COMPONENT_CODE, OBS_COMPONENT_VALUE_X, OBS_COMPONENT_VALUEQUANTITY, OBS_COMPONENT_VALUECODE, OBS_COMPONENT_VALUESTRING, OBS_COMPONENT_VALUEBOOLEAN, OBS_COMPONENT_VALUEINTEGER, OBS_COMPONENT_VALUERANGE, OBS_COMPONENT_VALUERATIO, OBS_COMPONENT_VALUESAMPLEDDATA, OBS_COMPONENT_VALUETIME, OBS_COMPONENT_VALUEDATETIME, OBS_COMPONENT_VALUEPERIOD, OBS_COMPONENT_DATAABSENTREASON, OBS_COMPONENT_INTERPRETATION, OBS_COMPONENT_REFERENCERANGE )
BEQUEATH DEFINER AS
(
select distinct
    -- The patient involved in the observation
    'Patient/' || enc.PATID as OBS_SUBJECT_REF,
    null as CON_BASEDON_REF,
    null as OBS_PARTOF_REF,
    null as OBS_STATUS,
    null as OBS_CATEGORY,
    null as OBS_CODE,
    null as OBS_FOCUS_REF,
    'Encounter/' || enc.ENCOUNTERID as OBS_ENCOUNTER_REF,
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
CREATE VIEW CAMPFHIR_VIEW_OBSERVATION_LABS ( ID, OBS_BASEDON, OBS_BODYSITE_CODING_CODE, OBS_BODYSITE_CODING_DISPLAY, OBS_BODYSITE_CODING_SYSTEM, OBS_BODYSITE_CODING_USRSLT, OBS_BODYSITE_CODING_VERSION, OBS_BODYSITE_TEXT, OBS_CATEGORY_CODING_CODE, OBS_CATEGORY_CODING_DISPLAY, OBS_CATEGORY_CODING_SYSTEM, OBS_CATEGORY_CODING_USRSLT, OBS_CATEGORY_CODING_VERSION, OBS_CATEGORY_TEXT, OBS_CODE_CODING_CODE, OBS_CODE_CODING_DISPLAY, OBS_CODE_CODING_SYSTEM, OBS_CODE_CODING_USRSLT, OBS_CODE_CODING_VERSION, OBS_CODE_TEXT, OBS_COMPONENT_CODE_CODING_CODE, OBS_COMPONENT_CODE_CODING_DISPLAY, OBS_COMPONENT_CODE_CODING_SYSTEM, OBS_COMPONENT_CODE_CODING_USRSLT, OBS_COMPONENT_CODE_CODING_VERSION, OBS_COMPONENT_CODE_TEXT, OBS_COMPONENT_DATAABSENTREASON_CODING_CODE, OBS_COMPONENT_DATAABSENTREASON_CODING_DISPLAY, OBS_COMPONENT_DATAABSENTREASON_CODING_SYSTEM, OBS_COMPONENT_DATAABSENTREASON_CODING_USRSLT, OBS_COMPONENT_DATAABSENTREASON_CODING_VERSION, OBS_COMPONENT_DATAABSENTREASON_TEXT, OBS_COMPONENT_INTERPRETATION_CODING_CODE, OBS_COMPONENT_INTERPRETATION_CODING_DISPLAY, OBS_COMPONENT_INTERPRETATION_CODING_SYSTEM, OBS_COMPONENT_INTERPRETATION_CODING_USRSLT, OBS_COMPONENT_INTERPRETATION_CODING_VERSION, OBS_COMPONENT_INTERPRETATION_TEXT, OBS_COMPONENT_REFERENCERANGE_AGE_HIGH_CODE, OBS_COMPONENT_REFERENCERANGE_AGE_HIGH_COMPARTR_CODE, OBS_COMPONENT_REFERENCERANGE_AGE_HIGH_SYSTEM, OBS_COMPONENT_REFERENCERANGE_AGE_HIGH_UNIT, OBS_COMPONENT_REFERENCERANGE_AGE_HIGH_VALUE, OBS_COMPONENT_REFERENCERANGE_AGE_LOW_CODE, OBS_COMPONENT_REFERENCERANGE_AGE_LOW_COMPARTR_CODE, OBS_COMPONENT_REFERENCERANGE_AGE_LOW_SYSTEM, OBS_COMPONENT_REFERENCERANGE_AGE_LOW_UNIT, OBS_COMPONENT_REFERENCERANGE_AGE_LOW_VALUE, OBS_COMPONENT_REFERENCERANGE_APPLIESTO_CODING_CODE, OBS_COMPONENT_REFERENCERANGE_APPLIESTO_CODING_DISPLAY, OBS_COMPONENT_REFERENCERANGE_APPLIESTO_CODING_SYSTEM, OBS_COMPONENT_REFERENCERANGE_APPLIESTO_CODING_USRSLT, OBS_COMPONENT_REFERENCERANGE_APPLIESTO_CODING_VERSION, OBS_COMPONENT_REFERENCERANGE_APPLIESTO_TEXT, OBS_COMPONENT_REFERENCERANGE_HIGH_CODE, OBS_COMPONENT_REFERENCERANGE_HIGH_COMPARTR_CODE, OBS_COMPONENT_REFERENCERANGE_HIGH_SYSTEM, OBS_COMPONENT_REFERENCERANGE_HIGH_UNIT, OBS_COMPONENT_REFERENCERANGE_HIGH_VALUE, OBS_COMPONENT_REFERENCERANGE_LOW_CODE, OBS_COMPONENT_REFERENCERANGE_LOW_COMPARTR_CODE, OBS_COMPONENT_REFERENCERANGE_LOW_SYSTEM, OBS_COMPONENT_REFERENCERANGE_LOW_UNIT, OBS_COMPONENT_REFERENCERANGE_LOW_VALUE, OBS_COMPONENT_REFERENCERANGE_TEXT, OBS_COMPONENT_REFERENCERANGE_TYPE_CODING_CODE, OBS_COMPONENT_REFERENCERANGE_TYPE_CODING_DISPLAY, OBS_COMPONENT_REFERENCERANGE_TYPE_CODING_SYSTEM, OBS_COMPONENT_REFERENCERANGE_TYPE_CODING_USRSLT, OBS_COMPONENT_REFERENCERANGE_TYPE_CODING_VERSION, OBS_COMPONENT_REFERENCERANGE_TYPE_TEXT, OBSERVATION_COMPONENT_VALUEBOOLEAN, OBS_COMPONENT_VALUE_CODEABLECONCEPT_CODING_CODE, OBS_COMPONENT_VALUE_CODEABLECONCEPT_CODING_DISPLAY, OBS_COMPONENT_VALUE_CODEABLECONCEPT_CODING_SYSTEM, OBS_COMPONENT_VALUE_CODEABLECONCEPT_CODING_USRSLT, OBS_COMPONENT_VALUE_CODEABLECONCEPT_CODING_VERSION, OBS_COMPONENT_VALUE_CODEABLECONCEPT_TEXT, OBSERVATION_COMPONENT_VALUEDATETIME, OBSERVATION_COMPONENT_VALUEINTEGER, OBS_COMPONENT_VALUE_PERIOD_END, OBS_COMPONENT_VALUE_PERIOD_START, OBS_COMPONENT_VALUE_QUANTITY_CODE, OBS_COMPONENT_VALUE_QUANTITY_COMPARTR_CODE, OBS_COMPONENT_VALUE_QUANTITY_SYSTEM, OBS_COMPONENT_VALUE_QUANTITY_UNIT, OBS_COMPONENT_VALUE_QUANTITY_VALUE, OBS_COMPONENT_VALUE_RANGE_HIGH_CODE, OBS_COMPONENT_VALUE_RANGE_HIGH_COMPARTR_CODE, OBS_COMPONENT_VALUE_RANGE_HIGH_SYSTEM, OBS_COMPONENT_VALUE_RANGE_HIGH_UNIT, OBS_COMPONENT_VALUE_RANGE_HIGH_VALUE, OBS_COMPONENT_VALUE_RANGE_LOW_CODE, OBS_COMPONENT_VALUE_RANGE_LOW_COMPARTR_CODE, OBS_COMPONENT_VALUE_RANGE_LOW_SYSTEM, OBS_COMPONENT_VALUE_RANGE_LOW_UNIT, OBS_COMPONENT_VALUE_RANGE_LOW_VALUE, OBS_COMPONENT_VALUE_RATIO_DENOM_CODE, OBS_COMPONENT_VALUE_RATIO_DENOM_COMPARTR_CODE, OBS_COMPONENT_VALUE_RATIO_DENOM_SYSTEM, OBS_COMPONENT_VALUE_RATIO_DENOM_UNIT, OBS_COMPONENT_VALUE_RATIO_DENOM_VALUE, OBS_COMPONENT_VALUE_RATIO_NUMERATOR_CODE, OBS_COMPONENT_VALUE_RATIO_NUMERATOR_COMPARTR_CODE, OBS_COMPONENT_VALUE_RATIO_NUMERATOR_SYSTEM, OBS_COMPONENT_VALUE_RATIO_NUMERATOR_UNIT, OBS_COMPONENT_VALUE_RATIO_NUMERATOR_VALUE, OBS_COMPONENT_VALUE_SAMPLEDDATA_DATA, OBS_COMPONENT_VALUE_SAMPLEDDATA_DIMENSIONS, OBS_COMPONENT_VALUE_SAMPLEDDATA_FACTOR, OBS_COMPONENT_VALUE_SAMPLEDDATA_LOWERLIMIT, OBS_COMPONENT_VALUE_SAMPLEDDATA_ORIGIN_CODE, OBS_COMPONENT_VALUE_SAMPLEDDATA_ORIGIN_COMPARTR_CODE, OBS_COMPONENT_VALUE_SAMPLEDDATA_ORIGIN_SYSTEM, OBS_COMPONENT_VALUE_SAMPLEDDATA_ORIGIN_UNIT, OBS_COMPONENT_VALUE_SAMPLEDDATA_ORIGIN_VALUE, OBS_COMPONENT_VALUE_SAMPLEDDATA_PERIOD, OBS_COMPONENT_VALUE_SAMPLEDDATA_UPPERLIMIT, OBSERVATION_COMPONENT_VALUESTRING, OBSERVATION_COMPONENT_VALUETIME, OBS_DATAABSENTREASON_CODING_CODE, OBS_DATAABSENTREASON_CODING_DISPLAY, OBS_DATAABSENTREASON_CODING_SYSTEM, OBS_DATAABSENTREASON_CODING_USRSLT, OBS_DATAABSENTREASON_CODING_VERSION, OBS_DATAABSENTREASON_TEXT, OBS_DERIVEDFROM, OBS_DEVICE, OBSERVATION_EFFECTIVEDATETIME, OBSERVATION_EFFECTIVEINSTANT, OBS_EFFECTIVE_PERIOD_END, OBS_EFFECTIVE_PERIOD_START, OBS_EFFECTIVE_TIMING_CODE_CODING_CODE, OBS_EFFECTIVE_TIMING_CODE_CODING_DISPLAY, OBS_EFFECTIVE_TIMING_CODE_CODING_SYSTEM, OBS_EFFECTIVE_TIMING_CODE_CODING_USRSLT, OBS_EFFECTIVE_TIMING_CODE_CODING_VERSION, OBS_EFFECTIVE_TIMING_CODE_TEXT, OBS_EFFECTIVE_TIMING_EVENT, OBS_EFFECTIVE_TIMING_REPEAT_BOUNDS_DURATION_CODE, OBS_EFFECTIVE_TIMING_REPEAT_BOUNDS_DURATION_COMPARTR_CODE, OBS_EFFECTIVE_TIMING_REPEAT_BOUNDS_DURATION_SYSTEM, OBS_EFFECTIVE_TIMING_REPEAT_BOUNDS_DURATION_UNIT, OBS_EFFECTIVE_TIMING_REPEAT_BOUNDS_DURATION_VALUE, OBS_EFFECTIVE_TIMING_REPEAT_BOUNDS_PERIOD_END, OBS_EFFECTIVE_TIMING_REPEAT_BOUNDS_PERIOD_START, OBS_EFFECTIVE_TIMING_REPEAT_BOUNDS_RANGE_HIGH_CODE, OBS_EFFECTIVE_TIMING_REPEAT_BOUNDS_RANGE_HIGH_COMPARTR_CODE, OBS_EFFECTIVE_TIMING_REPEAT_BOUNDS_RANGE_HIGH_SYSTEM, OBS_EFFECTIVE_TIMING_REPEAT_BOUNDS_RANGE_HIGH_UNIT, OBS_EFFECTIVE_TIMING_REPEAT_BOUNDS_RANGE_HIGH_VALUE, OBS_EFFECTIVE_TIMING_REPEAT_BOUNDS_RANGE_LOW_CODE, OBS_EFFECTIVE_TIMING_REPEAT_BOUNDS_RANGE_LOW_COMPARTR_CODE, OBS_EFFECTIVE_TIMING_REPEAT_BOUNDS_RANGE_LOW_SYSTEM, OBS_EFFECTIVE_TIMING_REPEAT_BOUNDS_RANGE_LOW_UNIT, OBS_EFFECTIVE_TIMING_REPEAT_BOUNDS_RANGE_LOW_VALUE, OBS_EFFECTIVE_TIMING_REPEAT_COUNT, OBS_EFFECTIVE_TIMING_REPEAT_COUNTMAX, OBS_EFFECTIVE_TIMING_REPEAT_DAYOFWEEK_CODE, OBS_EFFECTIVE_TIMING_REPEAT_DURATION, OBS_EFFECTIVE_TIMING_REPEAT_DURATIONMAX, OBS_EFFECTIVE_TIMING_REPEAT_DURATIONUNIT_CODE, OBS_EFFECTIVE_TIMING_REPEAT_FREQUENCY, OBS_EFFECTIVE_TIMING_REPEAT_FREQUENCYMAX, OBS_EFFECTIVE_TIMING_REPEAT_OFF, OBS_EFFECTIVE_TIMING_REPEAT_PERIOD, OBS_EFFECTIVE_TIMING_REPEAT_PERIODMAX, OBS_EFFECTIVE_TIMING_REPEAT_PERIODUNIT_CODE, OBS_EFFECTIVE_TIMING_REPEAT_TIMEOFDAY, OBS_EFFECTIVE_TIMING_REPEAT_WHEN_CODE, OBS_ENC, OBS_FOCUS, OBS_HASMEMBER, OBS_ID_ASSIGNER, OBS_ID_PERIOD_END, OBS_ID_PERIOD_START, OBS_ID_SYSTEM, OBS_ID_TYPE_CODING_CODE, OBS_ID_TYPE_CODING_DISPLAY, OBS_ID_TYPE_CODING_SYSTEM, OBS_ID_TYPE_CODING_USRSLT, OBS_ID_TYPE_CODING_VERSION, OBS_ID_TYPE_TEXT, OBS_ID_USE_CODE, OBS_ID_VALUE, OBS_INTERPRETATION_CODING_CODE, OBS_INTERPRETATION_CODING_DISPLAY, OBS_INTERPRETATION_CODING_SYSTEM, OBS_INTERPRETATION_CODING_USRSLT, OBS_INTERPRETATION_CODING_VERSION, OBS_INTERPRETATION_TEXT, OBS_ISSUED, OBS_METHOD_CODING_CODE, OBS_METHOD_CODING_DISPLAY, OBS_METHOD_CODING_SYSTEM, OBS_METHOD_CODING_USRSLT, OBS_METHOD_CODING_VERSION, OBS_METHOD_TEXT, OBSERVATION_NOTE_AUTHORREFERENCE, OBSERVATION_NOTE_AUTHORSTRING, OBS_NOTE_TEXT, OBS_NOTE_TIME, OBS_PARTOF, OBS_PERFORMER, OBS_REFERENCERANGE_AGE_HIGH_CODE, OBS_REFERENCERANGE_AGE_HIGH_COMPARTR_CODE, OBS_REFERENCERANGE_AGE_HIGH_SYSTEM, OBS_REFERENCERANGE_AGE_HIGH_UNIT, OBS_REFERENCERANGE_AGE_HIGH_VALUE, OBS_REFERENCERANGE_AGE_LOW_CODE, OBS_REFERENCERANGE_AGE_LOW_COMPARTR_CODE, OBS_REFERENCERANGE_AGE_LOW_SYSTEM, OBS_REFERENCERANGE_AGE_LOW_UNIT, OBS_REFERENCERANGE_AGE_LOW_VALUE, OBS_REFERENCERANGE_APPLIESTO_CODING_CODE, OBS_REFERENCERANGE_APPLIESTO_CODING_DISPLAY, OBS_REFERENCERANGE_APPLIESTO_CODING_SYSTEM, OBS_REFERENCERANGE_APPLIESTO_CODING_USRSLT, OBS_REFERENCERANGE_APPLIESTO_CODING_VERSION, OBS_REFERENCERANGE_APPLIESTO_TEXT, OBS_REFERENCERANGE_HIGH_CODE, OBS_REFERENCERANGE_HIGH_COMPARTR_CODE, OBS_REFERENCERANGE_HIGH_SYSTEM, OBS_REFERENCERANGE_HIGH_UNIT, OBS_REFERENCERANGE_HIGH_VALUE, OBS_REFERENCERANGE_LOW_CODE, OBS_REFERENCERANGE_LOW_COMPARTR_CODE, OBS_REFERENCERANGE_LOW_SYSTEM, OBS_REFERENCERANGE_LOW_UNIT, OBS_REFERENCERANGE_LOW_VALUE, OBS_REFERENCERANGE_TEXT, OBS_REFERENCERANGE_TYPE_CODING_CODE, OBS_REFERENCERANGE_TYPE_CODING_DISPLAY, OBS_REFERENCERANGE_TYPE_CODING_SYSTEM, OBS_REFERENCERANGE_TYPE_CODING_USRSLT, OBS_REFERENCERANGE_TYPE_CODING_VERSION, OBS_REFERENCERANGE_TYPE_TEXT, OBS_SPECIMEN, OBS_STATUS_CODE, OBS_SUBJECT, OBSERVATION_VALUEBOOLEAN, OBS_VALUE_CODEABLECONCEPT_CODING_CODE, OBS_VALUE_CODEABLECONCEPT_CODING_DISPLAY, OBS_VALUE_CODEABLECONCEPT_CODING_SYSTEM, OBS_VALUE_CODEABLECONCEPT_CODING_USRSLT, OBS_VALUE_CODEABLECONCEPT_CODING_VERSION, OBS_VALUE_CODEABLECONCEPT_TEXT, OBSERVATION_VALUEDATETIME, OBSERVATION_VALUEINTEGER, OBS_VALUE_PERIOD_END, OBS_VALUE_PERIOD_START, OBS_VALUE_QUANTITY_CODE, OBS_VALUE_QUANTITY_COMPARTR_CODE, OBS_VALUE_QUANTITY_SYSTEM, OBS_VALUE_QUANTITY_UNIT, OBS_VALUE_QUANTITY_VALUE, OBS_VALUE_RANGE_HIGH_CODE, OBS_VALUE_RANGE_HIGH_COMPARTR_CODE, OBS_VALUE_RANGE_HIGH_SYSTEM, OBS_VALUE_RANGE_HIGH_UNIT, OBS_VALUE_RANGE_HIGH_VALUE, OBS_VALUE_RANGE_LOW_CODE, OBS_VALUE_RANGE_LOW_COMPARTR_CODE, OBS_VALUE_RANGE_LOW_SYSTEM, OBS_VALUE_RANGE_LOW_UNIT, OBS_VALUE_RANGE_LOW_VALUE, OBS_VALUE_RATIO_DENOM_CODE, OBS_VALUE_RATIO_DENOM_COMPARTR_CODE, OBS_VALUE_RATIO_DENOM_SYSTEM, OBS_VALUE_RATIO_DENOM_UNIT, OBS_VALUE_RATIO_DENOM_VALUE, OBS_VALUE_RATIO_NUMERATOR_CODE, OBS_VALUE_RATIO_NUMERATOR_COMPARTR_CODE, OBS_VALUE_RATIO_NUMERATOR_SYSTEM, OBS_VALUE_RATIO_NUMERATOR_UNIT, OBS_VALUE_RATIO_NUMERATOR_VALUE, OBS_VALUE_SAMPLEDDATA_DATA, OBS_VALUE_SAMPLEDDATA_DIMENSIONS, OBS_VALUE_SAMPLEDDATA_FACTOR, OBS_VALUE_SAMPLEDDATA_LOWERLIMIT, OBS_VALUE_SAMPLEDDATA_ORIGIN_CODE, OBS_VALUE_SAMPLEDDATA_ORIGIN_COMPARTR_CODE, OBS_VALUE_SAMPLEDDATA_ORIGIN_SYSTEM, OBS_VALUE_SAMPLEDDATA_ORIGIN_UNIT, OBS_VALUE_SAMPLEDDATA_ORIGIN_VALUE, OBS_VALUE_SAMPLEDDATA_PERIOD, OBS_VALUE_SAMPLEDDATA_UPPERLIMIT, OBSERVATION_VALUESTRING, OBSERVATION_VALUETIME )
BEQUEATH DEFINER AS
(
select distinct
    labs.LAB_RESULT_CM_ID as id
,	null	AS	Obs_BasedOn
,	null	AS	Obs_BodySite_Coding_Code
,	null	AS	Obs_BodySite_Coding_Display
,	null	AS	Obs_BodySite_Coding_System
,	null	AS	Obs_BodySite_Coding_Usrslt
,	null	AS	Obs_BodySite_Coding_Version
,	null	AS	Obs_BodySite_Text
,	'laboratory'	AS	Obs_Category_Coding_Code
,	'Laboratory'	AS	Obs_Category_Coding_Display
,	'http://hl7.org/fhir/ValueSet/observation-category'	AS	Obs_Category_Coding_System
,	null	AS	Obs_Category_Coding_Usrslt
,	null	AS	Obs_Category_Coding_Version
,	null	AS	Obs_Category_Text
,	labs.LAB_LOINC	AS	Obs_Code_Coding_Code
,	labs.RAW_LAB_NAME	AS	Obs_Code_Coding_Display
,	'http://loinc.org'	AS	Obs_Code_Coding_System
,	null	AS	Obs_Code_Coding_Usrslt
,	null	AS	Obs_Code_Coding_Version
,	null	AS	Obs_Code_Text
,	null	AS	Obs_Component_Code_Coding_Code
,	null	AS	Obs_Component_Code_Coding_Display
,	null	AS	Obs_Component_Code_Coding_System
,	null	AS	Obs_Component_Code_Coding_Usrslt
,	null	AS	Obs_Component_Code_Coding_Version
,	null	AS	Obs_Component_Code_Text
,	null	AS	Obs_Component_DataAbsentReason_Coding_Code
,	null	AS	Obs_Component_DataAbsentReason_Coding_Display
,	null	AS	Obs_Component_DataAbsentReason_Coding_System
,	null	AS	Obs_Component_DataAbsentReason_Coding_Usrslt
,	null	AS	Obs_Component_DataAbsentReason_Coding_Version
,	null	AS	Obs_Component_DataAbsentReason_Text
,	null	AS	Obs_Component_Interpretation_Coding_Code
,	null	AS	Obs_Component_Interpretation_Coding_Display
,	null	AS	Obs_Component_Interpretation_Coding_System
,	null	AS	Obs_Component_Interpretation_Coding_Usrslt
,	null	AS	Obs_Component_Interpretation_Coding_Version
,	null	AS	Obs_Component_Interpretation_Text
,	null	AS	Obs_Component_ReferenceRange_Age_High_Code
,	null	AS	Obs_Component_ReferenceRange_Age_High_Compartr_Code
,	null	AS	Obs_Component_ReferenceRange_Age_High_System
,	null	AS	Obs_Component_ReferenceRange_Age_High_Unit
,	null	AS	Obs_Component_ReferenceRange_Age_High_Value
,	null	AS	Obs_Component_ReferenceRange_Age_Low_Code
,	null	AS	Obs_Component_ReferenceRange_Age_Low_Compartr_Code
,	null	AS	Obs_Component_ReferenceRange_Age_Low_System
,	null	AS	Obs_Component_ReferenceRange_Age_Low_Unit
,	null	AS	Obs_Component_ReferenceRange_Age_Low_Value
,	null	AS	Obs_Component_ReferenceRange_AppliesTo_Coding_Code
,	null	AS	Obs_Component_ReferenceRange_AppliesTo_Coding_Display
,	null	AS	Obs_Component_ReferenceRange_AppliesTo_Coding_System
,	null	AS	Obs_Component_ReferenceRange_AppliesTo_Coding_Usrslt
,	null	AS	Obs_Component_ReferenceRange_AppliesTo_Coding_Version
,	null	AS	Obs_Component_ReferenceRange_AppliesTo_Text
,	null	AS	Obs_Component_ReferenceRange_High_Code
,	null	AS	Obs_Component_ReferenceRange_High_Compartr_Code
,	null	AS	Obs_Component_ReferenceRange_High_System
,	null	AS	Obs_Component_ReferenceRange_High_Unit
,	null	AS	Obs_Component_ReferenceRange_High_Value
,	null	AS	Obs_Component_ReferenceRange_Low_Code
,	null	AS	Obs_Component_ReferenceRange_Low_Compartr_Code
,	null	AS	Obs_Component_ReferenceRange_Low_System
,	null	AS	Obs_Component_ReferenceRange_Low_Unit
,	null	AS	Obs_Component_ReferenceRange_Low_Value
,	null	AS	Obs_Component_ReferenceRange_Text
,	null	AS	Obs_Component_ReferenceRange_Type_Coding_Code
,	null	AS	Obs_Component_ReferenceRange_Type_Coding_Display
,	null	AS	Obs_Component_ReferenceRange_Type_Coding_System
,	null	AS	Obs_Component_ReferenceRange_Type_Coding_Usrslt
,	null	AS	Obs_Component_ReferenceRange_Type_Coding_Version
,	null	AS	Obs_Component_ReferenceRange_Type_Text
,	null	AS	Observation_Component_ValueBoolean
,	null	AS	Obs_Component_Value_CodeableConcept_Coding_Code
,	null	AS	Obs_Component_Value_CodeableConcept_Coding_Display
,	null	AS	Obs_Component_Value_CodeableConcept_Coding_System
,	null	AS	Obs_Component_Value_CodeableConcept_Coding_Usrslt
,	null	AS	Obs_Component_Value_CodeableConcept_Coding_Version
,	null	AS	Obs_Component_Value_CodeableConcept_Text
,	null	AS	Observation_Component_ValueDateTime
,	null	AS	Observation_Component_ValueInteger
,	null	AS	Obs_Component_Value_Period_End
,	null	AS	Obs_Component_Value_Period_Start
,	null	AS	Obs_Component_Value_Quantity_Code
,	null	AS	Obs_Component_Value_Quantity_Compartr_Code
,	null	AS	Obs_Component_Value_Quantity_System
,	null	AS	Obs_Component_Value_Quantity_Unit
,	null	AS	Obs_Component_Value_Quantity_Value
,	null	AS	Obs_Component_Value_Range_High_Code
,	null	AS	Obs_Component_Value_Range_High_Compartr_Code
,	null	AS	Obs_Component_Value_Range_High_System
,	null	AS	Obs_Component_Value_Range_High_Unit
,	null	AS	Obs_Component_Value_Range_High_Value
,	null	AS	Obs_Component_Value_Range_Low_Code
,	null	AS	Obs_Component_Value_Range_Low_Compartr_Code
,	null	AS	Obs_Component_Value_Range_Low_System
,	null	AS	Obs_Component_Value_Range_Low_Unit
,	null	AS	Obs_Component_Value_Range_Low_Value
,	null	AS	Obs_Component_Value_Ratio_Denom_Code
,	null	AS	Obs_Component_Value_Ratio_Denom_Compartr_Code
,	null	AS	Obs_Component_Value_Ratio_Denom_System
,	null	AS	Obs_Component_Value_Ratio_Denom_Unit
,	null	AS	Obs_Component_Value_Ratio_Denom_Value
,	null	AS	Obs_Component_Value_Ratio_Numerator_Code
,	null	AS	Obs_Component_Value_Ratio_Numerator_Compartr_Code
,	null	AS	Obs_Component_Value_Ratio_Numerator_System
,	null	AS	Obs_Component_Value_Ratio_Numerator_Unit
,	null	AS	Obs_Component_Value_Ratio_Numerator_Value
,	null	AS	Obs_Component_Value_SampledData_Data
,	null	AS	Obs_Component_Value_SampledData_Dimensions
,	null	AS	Obs_Component_Value_SampledData_Factor
,	null	AS	Obs_Component_Value_SampledData_LowerLimit
,	null	AS	Obs_Component_Value_SampledData_Origin_Code
,	null	AS	Obs_Component_Value_SampledData_Origin_Compartr_Code
,	null	AS	Obs_Component_Value_SampledData_Origin_System
,	null	AS	Obs_Component_Value_SampledData_Origin_Unit
,	null	AS	Obs_Component_Value_SampledData_Origin_Value
,	null	AS	Obs_Component_Value_SampledData_Period
,	null	AS	Obs_Component_Value_SampledData_UpperLimit
,	null	AS	Observation_Component_ValueString
,	null	AS	Observation_Component_ValueTime
,	null	AS	Obs_DataAbsentReason_Coding_Code
,	null	AS	Obs_DataAbsentReason_Coding_Display
,	null	AS	Obs_DataAbsentReason_Coding_System
,	null	AS	Obs_DataAbsentReason_Coding_Usrslt
,	null	AS	Obs_DataAbsentReason_Coding_Version
,	null	AS	Obs_DataAbsentReason_Text
,	null	AS	Obs_DerivedFrom
,	null	AS	Obs_Device
,	to_char(nvl(labs.SPECIMEN_DATE,labs.LAB_ORDER_DATE), 'YYYY-MM-DD')	AS	Observation_EffectiveDateTime
,	null	AS	Observation_EffectiveInstant
,	null	AS	Obs_Effective_Period_End
,	null	AS	Obs_Effective_Period_Start
,	null	AS	Obs_Effective_Timing_Code_Coding_Code
,	null	AS	Obs_Effective_Timing_Code_Coding_Display
,	null	AS	Obs_Effective_Timing_Code_Coding_System
,	null	AS	Obs_Effective_Timing_Code_Coding_Usrslt
,	null	AS	Obs_Effective_Timing_Code_Coding_Version
,	null	AS	Obs_Effective_Timing_Code_Text
,	null	AS	Obs_Effective_Timing_Event
,	null	AS	Obs_Effective_Timing_Repeat_Bounds_Duration_Code
,	null	AS	Obs_Effective_Timing_Repeat_Bounds_Duration_Compartr_Code
,	null	AS	Obs_Effective_Timing_Repeat_Bounds_Duration_System
,	null	AS	Obs_Effective_Timing_Repeat_Bounds_Duration_Unit
,	null	AS	Obs_Effective_Timing_Repeat_Bounds_Duration_Value
,	null	AS	Obs_Effective_Timing_Repeat_Bounds_Period_End
,	null	AS	Obs_Effective_Timing_Repeat_Bounds_Period_Start
,	null	AS	Obs_Effective_Timing_Repeat_Bounds_Range_High_Code
,	null	AS	Obs_Effective_Timing_Repeat_Bounds_Range_High_Compartr_Code
,	null	AS	Obs_Effective_Timing_Repeat_Bounds_Range_High_System
,	null	AS	Obs_Effective_Timing_Repeat_Bounds_Range_High_Unit
,	null	AS	Obs_Effective_Timing_Repeat_Bounds_Range_High_Value
,	null	AS	Obs_Effective_Timing_Repeat_Bounds_Range_Low_Code
,	null	AS	Obs_Effective_Timing_Repeat_Bounds_Range_Low_Compartr_Code
,	null	AS	Obs_Effective_Timing_Repeat_Bounds_Range_Low_System
,	null	AS	Obs_Effective_Timing_Repeat_Bounds_Range_Low_Unit
,	null	AS	Obs_Effective_Timing_Repeat_Bounds_Range_Low_Value
,	null	AS	Obs_Effective_Timing_Repeat_Count
,	null	AS	Obs_Effective_Timing_Repeat_CountMax
,	null	AS	Obs_Effective_Timing_Repeat_DayOfWeek_Code
,	null	AS	Obs_Effective_Timing_Repeat_Duration
,	null	AS	Obs_Effective_Timing_Repeat_DurationMax
,	null	AS	Obs_Effective_Timing_Repeat_DurationUnit_Code
,	null	AS	Obs_Effective_Timing_Repeat_Frequency
,	null	AS	Obs_Effective_Timing_Repeat_FrequencyMax
,	null	AS	Obs_Effective_Timing_Repeat_Off
,	null	AS	Obs_Effective_Timing_Repeat_Period
,	null	AS	Obs_Effective_Timing_Repeat_PeriodMax
,	null	AS	Obs_Effective_Timing_Repeat_PeriodUnit_Code
,	null	AS	Obs_Effective_Timing_Repeat_TimeOfDay
,	null	AS	Obs_Effective_Timing_Repeat_When_Code
,	'Encounter/'||labs.ENCOUNTERID	AS	Obs_Enc
,	null	AS	Obs_Focus
,	null	AS	Obs_HasMember
,	null	AS	Obs_Id_Assigner
,	null	AS	Obs_Id_Period_End
,	null	AS	Obs_Id_Period_Start
,	null	AS	Obs_Id_System
,	null	AS	Obs_Id_Type_Coding_Code
,	null	AS	Obs_Id_Type_Coding_Display
,	null	AS	Obs_Id_Type_Coding_System
,	null	AS	Obs_Id_Type_Coding_Usrslt
,	null	AS	Obs_Id_Type_Coding_Version
,	null	AS	Obs_Id_Type_Text
,	'secondary'	AS	Obs_Id_Use_Code
,	labs.LAB_RESULT_CM_ID	AS	Obs_Id_Value
,	nvl(cmv2.FHIR_OUT_CODE,null)	AS	Obs_Interpretation_Coding_Code
,	nvl(cmv2.FHIR_OUT_CHAR,null)	AS	Obs_Interpretation_Coding_Display
,	nvl(cmv2.FHIR_SYSTEM,null)	AS	Obs_Interpretation_Coding_System
,	null	AS	Obs_Interpretation_Coding_Usrslt
,	null	AS	Obs_Interpretation_Coding_Version
,	null	AS	Obs_Interpretation_Text
,	to_char(labs.RESULT_DATE, 'YYYY-MM-DD')	AS	Obs_Issued
,	null	AS	Obs_Method_Coding_Code
,	null	AS	Obs_Method_Coding_Display
,	null	AS	Obs_Method_Coding_System
,	null	AS	Obs_Method_Coding_Usrslt
,	null	AS	Obs_Method_Coding_Version
,	null	AS	Obs_Method_Text
,	null	AS	Observation_Note_AuthorReference
,	null	AS	Observation_Note_AuthorString
,	null	AS	Obs_Note_Text
,	null	AS	Obs_Note_Time
,	null	AS	Obs_PartOf
,	null	AS	Obs_Performer
,	null	AS	Obs_ReferenceRange_Age_High_Code
,	null	AS	Obs_ReferenceRange_Age_High_Compartr_Code
,	null	AS	Obs_ReferenceRange_Age_High_System
,	null	AS	Obs_ReferenceRange_Age_High_Unit
,	null	AS	Obs_ReferenceRange_Age_High_Value
,	null	AS	Obs_ReferenceRange_Age_Low_Code
,	null	AS	Obs_ReferenceRange_Age_Low_Compartr_Code
,	null	AS	Obs_ReferenceRange_Age_Low_System
,	null	AS	Obs_ReferenceRange_Age_Low_Unit
,	labs.NORM_RANGE_LOW 	AS	Obs_ReferenceRange_Age_Low_Value
,	null	AS	Obs_ReferenceRange_AppliesTo_Coding_Code
,	null	AS	Obs_ReferenceRange_AppliesTo_Coding_Display
,	null	AS	Obs_ReferenceRange_AppliesTo_Coding_System
,	null	AS	Obs_ReferenceRange_AppliesTo_Coding_Usrslt
,	null	AS	Obs_ReferenceRange_AppliesTo_Coding_Version
,	null	AS	Obs_ReferenceRange_AppliesTo_Text
,	null	AS	Obs_ReferenceRange_High_Code
,	null	AS	Obs_ReferenceRange_High_Compartr_Code
,	null	AS	Obs_ReferenceRange_High_System
,	null	AS	Obs_ReferenceRange_High_Unit
,	labs.NORM_RANGE_HIGH	AS	Obs_ReferenceRange_High_Value
,	null	AS	Obs_ReferenceRange_Low_Code
,	null	AS	Obs_ReferenceRange_Low_Compartr_Code
,	null	AS	Obs_ReferenceRange_Low_System
,	null	AS	Obs_ReferenceRange_Low_Unit
,	null	AS	Obs_ReferenceRange_Low_Value
,	null	AS	Obs_ReferenceRange_Text
,	null	AS	Obs_ReferenceRange_Type_Coding_Code
,	null	AS	Obs_ReferenceRange_Type_Coding_Display
,	null	AS	Obs_ReferenceRange_Type_Coding_System
,	null	AS	Obs_ReferenceRange_Type_Coding_Usrslt
,	null	AS	Obs_ReferenceRange_Type_Coding_Version
,	null	AS	Obs_ReferenceRange_Type_Text
,	null	AS	Obs_Specimen
,	null	AS	Obs_Status_Code
,	'Patient/'||labs.PATID	AS	Obs_Subject
,	null	AS	Observation_ValueBoolean
,	null	AS	Obs_Value_CodeableConcept_Coding_Code
,	null	AS	Obs_Value_CodeableConcept_Coding_Display
,	null	AS	Obs_Value_CodeableConcept_Coding_System
,	null	AS	Obs_Value_CodeableConcept_Coding_Usrslt
,	null	AS	Obs_Value_CodeableConcept_Coding_Version
,	null	AS	Obs_Value_CodeableConcept_Text
,	null	AS	Observation_ValueDateTime
,	null	AS	Observation_ValueInteger
,	null	AS	Obs_Value_Period_End
,	null	AS	Obs_Value_Period_Start
,	case
    when labs.RESULT_UNIT = 'NI' then null
    else labs.RESULT_UNIT
    end  	AS	Obs_Value_Quantity_Code
,	nvl(cmv1.FHIR_OUT_CODE,null)	AS	Obs_Value_Quantity_Compartr_Code
,	null	AS	Obs_Value_Quantity_System
,	null	AS	Obs_Value_Quantity_Unit
,	labs.RESULT_NUM	AS	Obs_Value_Quantity_Value
,	null	AS	Obs_Value_Range_High_Code
,	null	AS	Obs_Value_Range_High_Compartr_Code
,	null	AS	Obs_Value_Range_High_System
,	null	AS	Obs_Value_Range_High_Unit
,	null	AS	Obs_Value_Range_High_Value
,	null	AS	Obs_Value_Range_Low_Code
,	null	AS	Obs_Value_Range_Low_Compartr_Code
,	null	AS	Obs_Value_Range_Low_System
,	null	AS	Obs_Value_Range_Low_Unit
,	null	AS	Obs_Value_Range_Low_Value
,	null	AS	Obs_Value_Ratio_Denom_Code
,	null	AS	Obs_Value_Ratio_Denom_Compartr_Code
,	null	AS	Obs_Value_Ratio_Denom_System
,	null	AS	Obs_Value_Ratio_Denom_Unit
,	null	AS	Obs_Value_Ratio_Denom_Value
,	null	AS	Obs_Value_Ratio_Numerator_Code
,	null	AS	Obs_Value_Ratio_Numerator_Compartr_Code
,	null	AS	Obs_Value_Ratio_Numerator_System
,	null	AS	Obs_Value_Ratio_Numerator_Unit
,	null	AS	Obs_Value_Ratio_Numerator_Value
,	null	AS	Obs_Value_SampledData_Data
,	null	AS	Obs_Value_SampledData_Dimensions
,	null	AS	Obs_Value_SampledData_Factor
,	null	AS	Obs_Value_SampledData_LowerLimit
,	null	AS	Obs_Value_SampledData_Origin_Code
,	null	AS	Obs_Value_SampledData_Origin_Compartr_Code
,	null	AS	Obs_Value_SampledData_Origin_System
,	null	AS	Obs_Value_SampledData_Origin_Unit
,	null	AS	Obs_Value_SampledData_Origin_Value
,	null	AS	Obs_Value_SampledData_Period
,	null	AS	Obs_Value_SampledData_UpperLimit
,	case
    when labs.RESULT_QUAL = 'NI' then null
    else nvl(labs.RESULT_QUAL,labs.RAW_RESULT)
    end 	AS	Observation_ValueString
,	null	AS	Observation_ValueTime


from
lab_result_cm labs
left join CAMPFHIR_MAPPING_VALUESET cmv1 on cmv1.local_column='RESULT_MODIFIER' and labs.RESULT_MODIFIER=cmv1.local_in_code
left join CAMPFHIR_MAPPING_VALUESET cmv2 on cmv2.local_column='ABN_IND' and labs.ABN_IND=cmv2.local_in_code
)
/
CREATE VIEW CAMPFHIR_VIEW_DOCUMENTREFERENCE ( ID, DOCUMENTREFERENCE_AUTHENTICATOR, DOCUMENTREFERENCE_AUTHOR, DOCUMENTREFERENCE_CATEGORY_CODING_CODE, DOCUMENTREFERENCE_CATEGORY_CODING_DISPLAY, DOCUMENTREFERENCE_CATEGORY_CODING_SYSTEM, DOCUMENTREFERENCE_CATEGORY_CODING_USRSLT, DOCUMENTREFERENCE_CATEGORY_CODING_VERSION, DOCUMENTREFERENCE_CATEGORY_TEXT, DOCUMENTREFERENCE_CONTENT_ATTACHMENT_CONTENTTYPE, DOCUMENTREFERENCE_CONTENT_ATTACHMENT_CREATION, DOCUMENTREFERENCE_CONTENT_ATTACHMENT_DATA, DOCUMENTREFERENCE_CONTENT_ATTACHMENT_HASH, DOCUMENTREFERENCE_CONTENT_ATTACHMENT_LANG, DOCUMENTREFERENCE_CONTENT_ATTACHMENT_SIZE, DOCUMENTREFERENCE_CONTENT_ATTACHMENT_TITLE, DOCUMENTREFERENCE_CONTENT_ATTACHMENT_URL, DOCUMENTREFERENCE_CONTENT_FORMAT_CODE, DOCUMENTREFERENCE_CONTENT_FORMAT_DISPLAY, DOCUMENTREFERENCE_CONTENT_FORMAT_SYSTEM, DOCUMENTREFERENCE_CONTENT_FORMAT_USRSLT, DOCUMENTREFERENCE_CONTENT_FORMAT_VERSION, DOCUMENTREFERENCE_CONTEXT_ENC, DOCUMENTREFERENCE_CONTEXT_EVENT_CODING_CODE, DOCUMENTREFERENCE_CONTEXT_EVENT_CODING_DISPLAY, DOCUMENTREFERENCE_CONTEXT_EVENT_CODING_SYSTEM, DOCUMENTREFERENCE_CONTEXT_EVENT_CODING_USRSLT, DOCUMENTREFERENCE_CONTEXT_EVENT_CODING_VERSION, DOCUMENTREFERENCE_CONTEXT_EVENT_TEXT, DOCUMENTREFERENCE_CONTEXT_FACILITYTYPE_CODING_CODE, DOCUMENTREFERENCE_CONTEXT_FACILITYTYPE_CODING_DISPLAY, DOCUMENTREFERENCE_CONTEXT_FACILITYTYPE_CODING_SYSTEM, DOCUMENTREFERENCE_CONTEXT_FACILITYTYPE_CODING_USRSLT, DOCUMENTREFERENCE_CONTEXT_FACILITYTYPE_CODING_VERSION, DOCUMENTREFERENCE_CONTEXT_FACILITYTYPE_TEXT, DOCUMENTREFERENCE_CONTEXT_PERIOD_END, DOCUMENTREFERENCE_CONTEXT_PERIOD_START, DOCUMENTREFERENCE_CONTEXT_PRACTICESETTING_CODING_CODE, DOCUMENTREFERENCE_CONTEXT_PRACTICESETTING_CODING_DISPLAY, DOCUMENTREFERENCE_CONTEXT_PRACTICESETTING_CODING_SYSTEM, DOCUMENTREFERENCE_CONTEXT_PRACTICESETTING_CODING_USRSLT, DOCUMENTREFERENCE_CONTEXT_PRACTICESETTING_CODING_VERSION, DOCUMENTREFERENCE_CONTEXT_PRACTICESETTING_TEXT, DOCUMENTREFERENCE_CONTEXT_RELATED, DOCUMENTREFERENCE_CONTEXT_SOURCEPATIENTINFO, DOCUMENTREFERENCE_CUSTODIAN, DOCUMENTREFERENCE_DATE, DOCUMENTREFERENCE_DESCRIPTION, DOCUMENTREFERENCE_DOCSTATUS_CODE, DOCUMENTREFERENCE_ID_ASSIGNER, DOCUMENTREFERENCE_ID_PERIOD_END, DOCUMENTREFERENCE_ID_PERIOD_START, DOCUMENTREFERENCE_ID_SYSTEM, DOCUMENTREFERENCE_ID_TYPE_CODING_CODE, DOCUMENTREFERENCE_ID_TYPE_CODING_DISPLAY, DOCUMENTREFERENCE_ID_TYPE_CODING_SYSTEM, DOCUMENTREFERENCE_ID_TYPE_CODING_USRSLT, DOCUMENTREFERENCE_ID_TYPE_CODING_VERSION, DOCUMENTREFERENCE_ID_TYPE_TEXT, DOCUMENTREFERENCE_ID_USE_CODE, DOCUMENTREFERENCE_ID_VALUE, DOCUMENTREFERENCE_MASTERID_ASSIGNER, DOCUMENTREFERENCE_MASTERID_PERIOD_END, DOCUMENTREFERENCE_MASTERID_PERIOD_START, DOCUMENTREFERENCE_MASTERID_SYSTEM, DOCUMENTREFERENCE_MASTERID_TYPE_CODING_CODE, DOCUMENTREFERENCE_MASTERID_TYPE_CODING_DISPLAY, DOCUMENTREFERENCE_MASTERID_TYPE_CODING_SYSTEM, DOCUMENTREFERENCE_MASTERID_TYPE_CODING_USRSLT, DOCUMENTREFERENCE_MASTERID_TYPE_CODING_VERSION, DOCUMENTREFERENCE_MASTERID_TYPE_TEXT, DOCUMENTREFERENCE_MASTERID_USE_CODE, DOCUMENTREFERENCE_MASTERID_VALUE, DOCUMENTREFERENCE_RELATESTO_CODE_CODE, DOCUMENTREFERENCE_RELATESTO_, DOCUMENTREFERENCE_SECURITYLABEL_CODING_CODE, DOCUMENTREFERENCE_SECURITYLABEL_CODING_DISPLAY, DOCUMENTREFERENCE_SECURITYLABEL_CODING_SYSTEM, DOCUMENTREFERENCE_SECURITYLABEL_CODING_USRSLT, DOCUMENTREFERENCE_SECURITYLABEL_CODING_VERSION, DOCUMENTREFERENCE_SECURITYLABEL_TEXT, DOCUMENTREFERENCE_STATUS_CODE, DOCUMENTREFERENCE_SUBJECT, DOCUMENTREFERENCE_TYPE_CODING_CODE, DOCUMENTREFERENCE_TYPE_CODING_DISPLAY, DOCUMENTREFERENCE_TYPE_CODING_SYSTEM, DOCUMENTREFERENCE_TYPE_CODING_USRSLT, DOCUMENTREFERENCE_TYPE_CODING_VERSION, DOCUMENTREFERENCE_TYPE_TEXT )
BEQUEATH DEFINER AS
(
SELECT 
	null	AS	id
,	null	AS	Documentreference_Authenticator
,	null	AS	Documentreference_Author
,	null	AS	Documentreference_Category_Coding_Code
,	null	AS	Documentreference_Category_Coding_Display
,	null	AS	Documentreference_Category_Coding_System
,	null	AS	Documentreference_Category_Coding_Usrslt
,	null	AS	Documentreference_Category_Coding_Version
,	null	AS	Documentreference_Category_Text
,	null	AS	Documentreference_Content_Attachment_ContentType
,	null	AS	Documentreference_Content_Attachment_Creation
,	null	AS	Documentreference_Content_Attachment_Data
,	null	AS	Documentreference_Content_Attachment_Hash
,	null	AS	Documentreference_Content_Attachment_Lang
,	null	AS	Documentreference_Content_Attachment_Size
,	null	AS	Documentreference_Content_Attachment_Title
,	null	AS	Documentreference_Content_Attachment_Url
,	null	AS	Documentreference_Content_Format_Code
,	null	AS	Documentreference_Content_Format_Display
,	null	AS	Documentreference_Content_Format_System
,	null	AS	Documentreference_Content_Format_Usrslt
,	null	AS	Documentreference_Content_Format_Version
,	null	AS	Documentreference_Context_Enc
,	null	AS	Documentreference_Context_Event_Coding_Code
,	null	AS	Documentreference_Context_Event_Coding_Display
,	null	AS	Documentreference_Context_Event_Coding_System
,	null	AS	Documentreference_Context_Event_Coding_Usrslt
,	null	AS	Documentreference_Context_Event_Coding_Version
,	null	AS	Documentreference_Context_Event_Text
,	null	AS	Documentreference_Context_FacilityType_Coding_Code
,	null	AS	Documentreference_Context_FacilityType_Coding_Display
,	null	AS	Documentreference_Context_FacilityType_Coding_System
,	null	AS	Documentreference_Context_FacilityType_Coding_Usrslt
,	null	AS	Documentreference_Context_FacilityType_Coding_Version
,	null	AS	Documentreference_Context_FacilityType_Text
,	null	AS	Documentreference_Context_Period_End
,	null	AS	Documentreference_Context_Period_Start
,	null	AS	Documentreference_Context_PracticeSetting_Coding_Code
,	null	AS	Documentreference_Context_PracticeSetting_Coding_Display
,	null	AS	Documentreference_Context_PracticeSetting_Coding_System
,	null	AS	Documentreference_Context_PracticeSetting_Coding_Usrslt
,	null	AS	Documentreference_Context_PracticeSetting_Coding_Version
,	null	AS	Documentreference_Context_PracticeSetting_Text
,	null	AS	Documentreference_Context_Related
,	null	AS	Documentreference_Context_SourcePatientInfo
,	null	AS	Documentreference_Custodian
,	null	AS	Documentreference_Date
,	null	AS	Documentreference_Description
,	null	AS	Documentreference_DocStatus_Code
,	null	AS	Documentreference_Id_Assigner
,	null	AS	Documentreference_Id_Period_End
,	null	AS	Documentreference_Id_Period_Start
,	null	AS	Documentreference_Id_System
,	null	AS	Documentreference_Id_Type_Coding_Code
,	null	AS	Documentreference_Id_Type_Coding_Display
,	null	AS	Documentreference_Id_Type_Coding_System
,	null	AS	Documentreference_Id_Type_Coding_Usrslt
,	null	AS	Documentreference_Id_Type_Coding_Version
,	null	AS	Documentreference_Id_Type_Text
,	null	AS	Documentreference_Id_Use_Code
,	null	AS	Documentreference_Id_Value
,	null	AS	Documentreference_MasterId_Assigner
,	null	AS	Documentreference_MasterId_Period_End
,	null	AS	Documentreference_MasterId_Period_Start
,	null	AS	Documentreference_MasterId_System
,	null	AS	Documentreference_MasterId_Type_Coding_Code
,	null	AS	Documentreference_MasterId_Type_Coding_Display
,	null	AS	Documentreference_MasterId_Type_Coding_System
,	null	AS	Documentreference_MasterId_Type_Coding_Usrslt
,	null	AS	Documentreference_MasterId_Type_Coding_Version
,	null	AS	Documentreference_MasterId_Type_Text
,	null	AS	Documentreference_MasterId_Use_Code
,	null	AS	Documentreference_MasterId_Value
,	null	AS	Documentreference_RelatesTo_Code_Code
,	null	AS	Documentreference_RelatesTo_
,	null	AS	Documentreference_SecurityLabel_Coding_Code
,	null	AS	Documentreference_SecurityLabel_Coding_Display
,	null	AS	Documentreference_SecurityLabel_Coding_System
,	null	AS	Documentreference_SecurityLabel_Coding_Usrslt
,	null	AS	Documentreference_SecurityLabel_Coding_Version
,	null	AS	Documentreference_SecurityLabel_Text
,	null	AS	Documentreference_Status_Code
,	null	AS	Documentreference_Subject
,	null	AS	Documentreference_Type_Coding_Code
,	null	AS	Documentreference_Type_Coding_Display
,	null	AS	Documentreference_Type_Coding_System
,	null	AS	Documentreference_Type_Coding_Usrslt
,	null	AS	Documentreference_Type_Coding_Version
,	null	AS	Documentreference_Type_Text

FROM DUAL
)
/
CREATE VIEW CAMPFHIR_VIEW_PATIENT ( ID, PATIENT_ACTIVE, PATIENT_ADDRESS_CITY, PATIENT_ADDRESS_COUNTRY, PATIENT_ADDRESS_DISTRICT, PATIENT_ADDRESS_LINE, PATIENT_ADDRESS_PERIOD_END, PATIENT_ADDRESS_PERIOD_START, PATIENT_ADDRESS_POSTALCODE, PATIENT_ADDRESS_STATE, PATIENT_ADDRESS_TEXT, PATIENT_ADDRESS_TYPE_CODE, PATIENT_ADDRESS_USE_CODE, PATIENT_BIRTHDATE, PATIENT_COMMN_LANG_CODING_CODE, PATIENT_COMMN_LANG_CODING_DISPLAY, PATIENT_COMMN_LANG_CODING_SYSTEM, PATIENT_COMMN_LANG_CODING_USRSLT, PATIENT_COMMN_LANG_CODING_VERSION, PATIENT_COMMN_LANG_TEXT, PATIENT_COMMN_PREFERRED, PATIENT_CONTACT_ADDRESS_CITY, PATIENT_CONTACT_ADDRESS_COUNTRY, PATIENT_CONTACT_ADDRESS_DISTRICT, PATIENT_CONTACT_ADDRESS_LINE, PATIENT_CONTACT_ADDRESS_PERIOD_END, PATIENT_CONTACT_ADDRESS_PERIOD_START, PATIENT_CONTACT_ADDRESS_POSTALCODE, PATIENT_CONTACT_ADDRESS_STATE, PATIENT_CONTACT_ADDRESS_TEXT, PATIENT_CONTACT_ADDRESS_TYPE_CODE, PATIENT_CONTACT_ADDRESS_USE_CODE, PATIENT_CONTACT_GENDER_CODE, PATIENT_CONTACT_NAME_FAMILY, PATIENT_CONTACT_NAME_GIVEN, PATIENT_CONTACT_NAME_PERIOD_END, PATIENT_CONTACT_NAME_PERIOD_START, PATIENT_CONTACT_NAME_PREFIX, PATIENT_CONTACT_NAME_SUFFIX, PATIENT_CONTACT_NAME_TEXT, PATIENT_CONTACT_NAME_USE_CODE, PATIENT_CONTACT_ORGANIZATION, PATIENT_CONTACT_PERIOD_END, PATIENT_CONTACT_PERIOD_START, PATIENT_CONTACT_RELATIONSHIP_CODING_CODE, PATIENT_CONTACT_RELATIONSHIP_CODING_DISPLAY, PATIENT_CONTACT_RELATIONSHIP_CODING_SYSTEM, PATIENT_CONTACT_RELATIONSHIP_CODING_USRSLT, PATIENT_CONTACT_RELATIONSHIP_CODING_VERSION, PATIENT_CONTACT_RELATIONSHIP_TEXT, PATIENT_CONTACT_TELECOM_PERIOD_END, PATIENT_CONTACT_TELECOM_PERIOD_START, PATIENT_CONTACT_TELECOM_RANK, PATIENT_CONTACT_TELECOM_SYSTEM_CODE, PATIENT_CONTACT_TELECOM_USE_CODE, PATIENT_CONTACT_TELECOM_VALUE, PATIENT_DECEASEDBOOLEAN, PATIENT_DECEASEDDATETIME, PATIENT_GENDER_CODE, PATIENT_GENERALPRACT, PATIENT_ID_ASSIGNER, PATIENT_ID_PERIOD_END, PATIENT_ID_PERIOD_START, PATIENT_ID_SYSTEM, PATIENT_ID_TYPE_CODING_CODE, PATIENT_ID_TYPE_CODING_DISPLAY, PATIENT_ID_TYPE_CODING_SYSTEM, PATIENT_ID_TYPE_CODING_USRSLT, PATIENT_ID_TYPE_CODING_VERSION, PATIENT_ID_TYPE_TEXT, PATIENT_ID_USE_CODE, PATIENT_ID_VALUE, PATIENT_LINK_OTHER, PATIENT_LINK_TYPE_CODE, PATIENT_MANAGINGORGANIZATION, PATIENT_MARITALSTATUS_CODING_CODE, PATIENT_MARITALSTATUS_CODING_DISPLAY, PATIENT_MARITALSTATUS_CODING_SYSTEM, PATIENT_MARITALSTATUS_CODING_USRSLT, PATIENT_MARITALSTATUS_CODING_VERSION, PATIENT_MARITALSTATUS_TEXT, PATIENT_MULTIPLEBIRTHBOOLEAN, PATIENT_MULTIPLEBIRTHINTEGER, PATIENT_NAME_FAMILY, PATIENT_NAME_GIVEN, PATIENT_NAME_PERIOD_END, PATIENT_NAME_PERIOD_START, PATIENT_NAME_PREFIX, PATIENT_NAME_SUFFIX, PATIENT_NAME_TEXT, PATIENT_NAME_USE_CODE, PATIENT_PHOTO_CONTENTTYPE, PATIENT_PHOTO_CREATION, PATIENT_PHOTO_DATA, PATIENT_PHOTO_HASH, PATIENT_PHOTO_LANG, PATIENT_PHOTO_SIZE, PATIENT_PHOTO_TITLE, PATIENT_PHOTO_URL, PATIENT_TELECOM_PERIOD_END, PATIENT_TELECOM_PERIOD_START, PATIENT_TELECOM_RANK, PATIENT_TELECOM_SYSTEM_CODE, PATIENT_TELECOM_USE_CODE, PATIENT_TELECOM_VALUE, PATIENT_RACE_CODE, PATIENT_RACE_SYSTEM, PATIENT_RACE_DISPLAY, PATIENT_ETHNICITY_CODE, PATIENT_ETHNICITY_SYSTEM, PATIENT_ETHNICITY_DISPLAY )
BEQUEATH DEFINER AS
(

select distinct
dem.PATID as id,
null as Patient_Active,
null as Patient_Address_City,
null as Patient_Address_Country,
null as Patient_Address_District,
null as Patient_Address_Line,
null as Patient_Address_Period_End,
null as Patient_Address_Period_Start,
null as Patient_Address_PostalCode,
null as Patient_Address_State,
null as Patient_Address_Text,
null as Patient_Address_Type_Code,
null as Patient_Address_Use_Code,
to_char(dem.BIRTH_DATE, 'YYYY-MM-DD') as Patient_BirthDate,
nvl(cmv5.FHIR_OUT_CODE, null) as Patient_Commn_Lang_Coding_Code,
nvl(cmv5.fhir_out_char, null) as Patient_Commn_Lang_Coding_Display,
nvl(cmv5.FHIR_SYSTEM, null) as Patient_Commn_Lang_Coding_System,
null as Patient_Commn_Lang_Coding_Usrslt,
null as Patient_Commn_Lang_Coding_Version,
null as Patient_Commn_Lang_Text,
null as Patient_Commn_Preferred,
null as Patient_Contact_Address_City,
null as Patient_Contact_Address_Country,
null as Patient_Contact_Address_District,
null as Patient_Contact_Address_Line,
null as Patient_Contact_Address_Period_End,
null as Patient_Contact_Address_Period_Start,
null as Patient_Contact_Address_PostalCode,
null as Patient_Contact_Address_State,
null as Patient_Contact_Address_Text,
null as Patient_Contact_Address_Type_Code,
null as Patient_Contact_Address_Use_Code,
null as Patient_Contact_Gender_Code,
null as Patient_Contact_Name_Family,
null as Patient_Contact_Name_Given,
null as Patient_Contact_Name_Period_End,
null as Patient_Contact_Name_Period_Start,
null as Patient_Contact_Name_Prefix,
null as Patient_Contact_Name_Suffix,
null as Patient_Contact_Name_Text,
null as Patient_Contact_Name_Use_Code,
null as Patient_Contact_Organization,
null as Patient_Contact_Period_End,
null as Patient_Contact_Period_Start,
null as Patient_Contact_Relationship_Coding_Code,
null as Patient_Contact_Relationship_Coding_Display,
null as Patient_Contact_Relationship_Coding_System,
null as Patient_Contact_Relationship_Coding_Usrslt,
null as Patient_Contact_Relationship_Coding_Version,
null as Patient_Contact_Relationship_Text,
null as Patient_Contact_Telecom_Period_End,
null as Patient_Contact_Telecom_Period_Start,
null as Patient_Contact_Telecom_Rank,
null as Patient_Contact_Telecom_System_Code,
null as Patient_Contact_Telecom_Use_Code,
null as Patient_Contact_Telecom_Value,
case when D.PATID is not null and d.DEATH_DATE is null then 'true' end as Patient_DeceasedBoolean,
to_char(d.DEATH_DATE, 'YYYY-MM-DD') as Patient_DeceasedDateTime,
nvl(cmv1.FHIR_OUT_CODE, null) as Patient_Gender_Code,
null as Patient_GeneralPract,
null as Patient_Id_Assigner,
null as Patient_Id_Period_End,
null as Patient_Id_Period_Start,
null as Patient_Id_System,
null as Patient_Id_Type_Coding_Code,
null as Patient_Id_Type_Coding_Display,
null as Patient_Id_Type_Coding_System,
null as Patient_Id_Type_Coding_Usrslt,
null as Patient_Id_Type_Coding_Version,
null as Patient_Id_Type_Text,
'secondary' as Patient_Id_Use_Code,
dem.PATID as Patient_Id_Value,
null as Patient_Link_Other,
null as Patient_Link_Type_Code,
null as Patient_ManagingOrganization,
null as Patient_MaritalStatus_Coding_Code,
null as Patient_MaritalStatus_Coding_Display,
null as Patient_MaritalStatus_Coding_System,
null as Patient_MaritalStatus_Coding_Usrslt,
null as Patient_MaritalStatus_Coding_Version,
null as Patient_MaritalStatus_Text,
null as Patient_MultipleBirthBoolean,
null as Patient_MultipleBirthInteger,
null as Patient_Name_Family,
null as Patient_Name_Given,
null as Patient_Name_Period_End,
null as Patient_Name_Period_Start,
null as Patient_Name_Prefix,
null as Patient_Name_Suffix,
null as Patient_Name_Text,
null as Patient_Name_Use_Code,
null as Patient_Photo_ContentType,
null as Patient_Photo_Creation,
null as Patient_Photo_Data,
null as Patient_Photo_Hash,
null as Patient_Photo_Lang,
null as Patient_Photo_Size,
null as Patient_Photo_Title,
null as Patient_Photo_Url,
null as Patient_Telecom_Period_End,
null as Patient_Telecom_Period_Start,
null as Patient_Telecom_Rank,
null as Patient_Telecom_System_Code,
null as Patient_Telecom_Use_Code,
null as Patient_Telecom_Value,
nvl(cmv3.FHIR_OUT_CODE, null) as Patient_Race_Code,
nvl(cmv3.FHIR_URN_OID_SYSTEM, null) as Patient_Race_System,
nvl(cmv3.fhir_out_char, null) as Patient_Race_Display,
nvl(cmv4.FHIR_OUT_CODE, null) as Patient_Ethnicity_Code,
nvl(cmv4.FHIR_URN_OID_SYSTEM, null) as Patient_Ethnicity_System,
nvl(cmv4.fhir_out_char, null) as Patient_Ethnicity_Display


from DEMOGRAPHIC dem
left join DEATH D on dem.PATID = D.PATID
left join CAMPFHIR_MAPPING_VALUESET cmv1 on cmv1.local_column='SEX' and dem.SEX=cmv1.local_in_code
left join CAMPFHIR_MAPPING_VALUESET cmv3 on cmv3.local_column='RACE' and dem.RACE=cmv3.local_in_code
left join CAMPFHIR_MAPPING_VALUESET cmv4 on cmv4.local_column='HISPANIC' and dem.HISPANIC=cmv4.local_in_code
left join CAMPFHIR_MAPPING_VALUESET cmv5 on cmv5.local_column='PAT_PREF_LANGUAGE_SPOKEN' and dem.PAT_PREF_LANGUAGE_SPOKEN=cmv5.local_in_code

)
/
CREATE VIEW CAMPFHIR_VIEW_ENCOUNTER ( ID, ENC_ACCOUNT, ENC_APPOINTMENT, ENC_BASEDON, ENC_CLASSHISTORY_CLASS__CODE, ENC_CLASSHISTORY_CLASS__DISPLAY, ENC_CLASSHISTORY_CLASS__SYSTEM, ENC_CLASSHISTORY_CLASS__USRSLT, ENC_CLASSHISTORY_CLASS__VERSION, ENC_CLASSHISTORY_PERIOD_END, ENC_CLASSHISTORY_PERIOD_START, ENC_CLASS__CODE, ENC_CLASS__DISPLAY, ENC_CLASS__SYSTEM, ENC_CLASS__USRSLT, ENC_CLASS__VERSION, ENC_DIAGNOSIS_CONDITION, ENC_DIAGNOSIS_RANK, ENC_DIAGNOSIS_USE_CODING_CODE, ENC_DIAGNOSIS_USE_CODING_DISPLAY, ENC_DIAGNOSIS_USE_CODING_SYSTEM, ENC_DIAGNOSIS_USE_CODING_USRSLT, ENC_DIAGNOSIS_USE_CODING_VERSION, ENC_DIAGNOSIS_USE_TEXT, ENC_EPISODEOFCARE, ENC_HOSPITALIZATION_ADMITSOURCE_CODING_CODE, ENC_HOSPITALIZATION_ADMITSOURCE_CODING_DISPLAY, ENC_HOSPITALIZATION_ADMITSOURCE_CODING_SYSTEM, ENC_HOSPITALIZATION_ADMITSOURCE_CODING_USRSLT, ENC_HOSPITALIZATION_ADMITSOURCE_CODING_VERSION, ENC_HOSPITALIZATION_ADMITSOURCE_TEXT, ENC_HOSPITALIZATION_DESTINATION, ENC_HOSPITALIZATION_DIETPREFERENCE_CODING_CODE, ENC_HOSPITALIZATION_DIETPREFERENCE_CODING_DISPLAY, ENC_HOSPITALIZATION_DIETPREFERENCE_CODING_SYSTEM, ENC_HOSPITALIZATION_DIETPREFERENCE_CODING_USRSLT, ENC_HOSPITALIZATION_DIETPREFERENCE_CODING_VERSION, ENC_HOSPITALIZATION_DIETPREFERENCE_TEXT, ENC_HOSPITALIZATION_DISCHARGEDISPOSITION_CODING_CODE, ENC_HOSPITALIZATION_DISCHARGEDISPOSITION_CODING_DISPLAY, ENC_HOSPITALIZATION_DISCHARGEDISPOSITION_CODING_SYSTEM, ENC_HOSPITALIZATION_DISCHARGEDISPOSITION_CODING_USRSLT, ENC_HOSPITALIZATION_DISCHARGEDISPOSITION_CODING_VERSION, ENC_HOSPITALIZATION_DISCHARGEDISPOSITION_TEXT, ENC_HOSPITALIZATION_ORIGIN, ENC_HOSPITALIZATION_PREADMISSIONID_ASSIGNER, ENC_HOSPITALIZATION_PREADMISSIONID_PERIOD_END, ENC_HOSPITALIZATION_PREADMISSIONID_PERIOD_START, ENC_HOSPITALIZATION_PREADMISSIONID_SYSTEM, ENC_HOSPITALIZATION_PREADMISSIONID_TYPE_CODING_CODE, ENC_HOSPITALIZATION_PREADMISSIONID_TYPE_CODING_DISPLAY, ENC_HOSPITALIZATION_PREADMISSIONID_TYPE_CODING_SYSTEM, ENC_HOSPITALIZATION_PREADMISSIONID_TYPE_CODING_USRSLT, ENC_HOSPITALIZATION_PREADMISSIONID_TYPE_CODING_VERSION, ENC_HOSPITALIZATION_PREADMISSIONID_TYPE_TEXT, ENC_HOSPITALIZATION_PREADMISSIONID_USE_CODE, ENC_HOSPITALIZATION_PREADMISSIONID_VALUE, ENC_HOSPITALIZATION_READMISSION_CODING_CODE, ENC_HOSPITALIZATION_READMISSION_CODING_DISPLAY, ENC_HOSPITALIZATION_READMISSION_CODING_SYSTEM, ENC_HOSPITALIZATION_READMISSION_CODING_USRSLT, ENC_HOSPITALIZATION_READMISSION_CODING_VERSION, ENC_HOSPITALIZATION_READMISSION_TEXT, ENC_HOSPITALIZATION_SPECIALARRANGEMENT_CODING_CODE, ENC_HOSPITALIZATION_SPECIALARRANGEMENT_CODING_DISPLAY, ENC_HOSPITALIZATION_SPECIALARRANGEMENT_CODING_SYSTEM, ENC_HOSPITALIZATION_SPECIALARRANGEMENT_CODING_USRSLT, ENC_HOSPITALIZATION_SPECIALARRANGEMENT_CODING_VERSION, ENC_HOSPITALIZATION_SPECIALARRANGEMENT_TEXT, ENC_HOSPITALIZATION_SPECIALCOURTESY_CODING_CODE, ENC_HOSPITALIZATION_SPECIALCOURTESY_CODING_DISPLAY, ENC_HOSPITALIZATION_SPECIALCOURTESY_CODING_SYSTEM, ENC_HOSPITALIZATION_SPECIALCOURTESY_CODING_USRSLT, ENC_HOSPITALIZATION_SPECIALCOURTESY_CODING_VERSION, ENC_HOSPITALIZATION_SPECIALCOURTESY_TEXT, ENC_ID_ASSIGNER, ENC_ID_PERIOD_END, ENC_ID_PERIOD_START, ENC_ID_SYSTEM, ENC_ID_TYPE_CODING_CODE, ENC_ID_TYPE_CODING_DISPLAY, ENC_ID_TYPE_CODING_SYSTEM, ENC_ID_TYPE_CODING_USRSLT, ENC_ID_TYPE_CODING_VERSION, ENC_ID_TYPE_TEXT, ENC_ID_USE_CODE, ENC_ID_VALUE, ENC_LENGTH, ENC_LOCATION_LOCATION, ENC_LOCATION_PERIOD_END, ENC_LOCATION_PERIOD_START, ENC_LOCATION_PHYSICALTYPE_CODING_CODE, ENC_LOCATION_PHYSICALTYPE_CODING_DISPLAY, ENC_LOCATION_PHYSICALTYPE_CODING_SYSTEM, ENC_LOCATION_PHYSICALTYPE_CODING_USRSLT, ENC_LOCATION_PHYSICALTYPE_CODING_VERSION, ENC_LOCATION_PHYSICALTYPE_TEXT, ENC_LOCATION_STATUS_CODE, ENC_PARTOF, ENC_PARTICIPANT_INDIVIDUAL, ENC_PARTICIPANT_PERIOD_END, ENC_PARTICIPANT_PERIOD_START, ENC_PARTICIPANT_TYPE_CODING_CODE, ENC_PARTICIPANT_TYPE_CODING_DISPLAY, ENC_PARTICIPANT_TYPE_CODING_SYSTEM, ENC_PARTICIPANT_TYPE_CODING_USRSLT, ENC_PARTICIPANT_TYPE_CODING_VERSION, ENC_PARTICIPANT_TYPE_TEXT, ENC_PERIOD_END, ENC_PERIOD_START, ENC_PRIORITY_CODING_CODE, ENC_PRIORITY_CODING_DISPLAY, ENC_PRIORITY_CODING_SYSTEM, ENC_PRIORITY_CODING_USRSLT, ENC_PRIORITY_CODING_VERSION, ENC_PRIORITY_TEXT, ENC_REASONCODE_CODING_CODE, ENC_REASONCODE_CODING_DISPLAY, ENC_REASONCODE_CODING_SYSTEM, ENC_REASONCODE_CODING_USRSLT, ENC_REASONCODE_CODING_VERSION, ENC_REASONCODE_TEXT, ENC_REASONREFERENCE, ENC_SERVICEPROVIDER, ENC_SERVICETYPE_CODING_CODE, ENC_SERVICETYPE_CODING_DISPLAY, ENC_SERVICETYPE_CODING_SYSTEM, ENC_SERVICETYPE_CODING_USRSLT, ENC_SERVICETYPE_CODING_VERSION, ENC_SERVICETYPE_TEXT, ENC_STATUS_CODE, ENC_STATUSHISTORY_PERIOD_END, ENC_STATUSHISTORY_PERIOD_START, ENC_STATUSHISTORY_STATUS_CODE, ENC_SUBJECT, ENC_TYPE_CODING_CODE, ENC_TYPE_CODING_DISPLAY, ENC_TYPE_CODING_SYSTEM, ENC_TYPE_CODING_USRSLT, ENC_TYPE_CODING_VERSION, ENC_TYPE_TEXT, ENCOUNTER_TYPE_CODING_CODE, ENCOUNTER_TYPE_CODING_DISPLAY, ENCOUNTER_TYPE_CODING_SYSTEM, ENCOUNTER_TYPE_CODING_USERSELECTED, ENCOUNTER_TYPE_CODING_VERSION )
BEQUEATH DEFINER AS
(

select distinct

enc.encounterid as id,
null as Enc_Account,
null as Enc_Appointment,
null as Enc_BasedOn,
null as Enc_ClassHistory_Class__Code,
null as Enc_ClassHistory_Class__Display,
null as Enc_ClassHistory_Class__System,
null as Enc_ClassHistory_Class__Usrslt,
null as Enc_ClassHistory_Class__Version,
null as Enc_ClassHistory_Period_End,
null as Enc_ClassHistory_Period_Start,
nvl(cmv1.FHIR_OUT_CODE, null)	 as Enc_Class__Code,
nvl(cmv1.fhir_out_char, null) as Enc_Class__Display,
nvl(cmv1.FHIR_SYSTEM, null) as Enc_Class__System,
null as Enc_Class__Usrslt,
null as Enc_Class__Version,
con.ENCOUNTERID as Enc_Diagnosis_Condition,
null as Enc_Diagnosis_Rank,
dx.DX as Enc_Diagnosis_Use_Coding_Code,
dx.RAW_DX as Enc_Diagnosis_Use_Coding_Display,
case
		when dx.DX_TYPE = '09' then	'http://hl7.org/fhir/sid/icd-9-cm'
		when dx.DX_TYPE = '10' then 'http://hl7.org/fhir/sid/icd-10-cm'
		when dx.DX_TYPE = '11' then 'http://hl7.org/fhir/sid/icd-11-cm'
		when dx.DX_TYPE = 'SM' then 'http://snomed.info/sct'
	  end as Enc_Diagnosis_Use_Coding_System,
null as Enc_Diagnosis_Use_Coding_Usrslt,
null as Enc_Diagnosis_Use_Coding_Version,
null as Enc_Diagnosis_Use_Text,
null as Enc_EpisodeOfCare,
null as Enc_Hospitalization_AdmitSource_Coding_Code,
null as Enc_Hospitalization_AdmitSource_Coding_Display,
null as Enc_Hospitalization_AdmitSource_Coding_System,
null as Enc_Hospitalization_AdmitSource_Coding_Usrslt,
null as Enc_Hospitalization_AdmitSource_Coding_Version,
null as Enc_Hospitalization_AdmitSource_Text,
null as Enc_Hospitalization_Destination,
null as Enc_Hospitalization_DietPreference_Coding_Code,
null as Enc_Hospitalization_DietPreference_Coding_Display,
null as Enc_Hospitalization_DietPreference_Coding_System,
null as Enc_Hospitalization_DietPreference_Coding_Usrslt,
null as Enc_Hospitalization_DietPreference_Coding_Version,
null as Enc_Hospitalization_DietPreference_Text,
nvl(cmv2.FHIR_OUT_CODE, null) as Enc_Hospitalization_DischargeDisposition_Coding_Code,
nvl(cmv2.fhir_out_char, null) as Enc_Hospitalization_DischargeDisposition_Coding_Display,
nvl(cmv2.FHIR_SYSTEM, null) as Enc_Hospitalization_DischargeDisposition_Coding_System,
null as Enc_Hospitalization_DischargeDisposition_Coding_Usrslt,
null as Enc_Hospitalization_DischargeDisposition_Coding_Version,
null as Enc_Hospitalization_DischargeDisposition_Text,
null as Enc_Hospitalization_Origin,
null as Enc_Hospitalization_PreAdmissionId_Assigner,
null as Enc_Hospitalization_PreAdmissionId_Period_End,
null as Enc_Hospitalization_PreAdmissionId_Period_Start,
null as Enc_Hospitalization_PreAdmissionId_System,
null as Enc_Hospitalization_PreAdmissionId_Type_Coding_Code,
null as Enc_Hospitalization_PreAdmissionId_Type_Coding_Display,
null as Enc_Hospitalization_PreAdmissionId_Type_Coding_System,
null as Enc_Hospitalization_PreAdmissionId_Type_Coding_Usrslt,
null as Enc_Hospitalization_PreAdmissionId_Type_Coding_Version,
null as Enc_Hospitalization_PreAdmissionId_Type_Text,
null as Enc_Hospitalization_PreAdmissionId_Use_Code,
null as Enc_Hospitalization_PreAdmissionId_Value,
null as Enc_Hospitalization_ReAdmission_Coding_Code,
null as Enc_Hospitalization_ReAdmission_Coding_Display,
null as Enc_Hospitalization_ReAdmission_Coding_System,
null as Enc_Hospitalization_ReAdmission_Coding_Usrslt,
null as Enc_Hospitalization_ReAdmission_Coding_Version,
null as Enc_Hospitalization_ReAdmission_Text,
null as Enc_Hospitalization_SpecialArrangement_Coding_Code,
null as Enc_Hospitalization_SpecialArrangement_Coding_Display,
null as Enc_Hospitalization_SpecialArrangement_Coding_System,
null as Enc_Hospitalization_SpecialArrangement_Coding_Usrslt,
null as Enc_Hospitalization_SpecialArrangement_Coding_Version,
null as Enc_Hospitalization_SpecialArrangement_Text,
null as Enc_Hospitalization_SpecialCourtesy_Coding_Code,
null as Enc_Hospitalization_SpecialCourtesy_Coding_Display,
null as Enc_Hospitalization_SpecialCourtesy_Coding_System,
null as Enc_Hospitalization_SpecialCourtesy_Coding_Usrslt,
null as Enc_Hospitalization_SpecialCourtesy_Coding_Version,
null as Enc_Hospitalization_SpecialCourtesy_Text,
null as Enc_Id_Assigner,
null as Enc_Id_Period_End,
null as Enc_Id_Period_Start,
null as Enc_Id_System,
null as Enc_Id_Type_Coding_Code,
null as Enc_Id_Type_Coding_Display,
null as Enc_Id_Type_Coding_System,
null as Enc_Id_Type_Coding_Usrslt,
null as Enc_Id_Type_Coding_Version,
null as Enc_Id_Type_Text,
'secondary' as Enc_Id_Use_Code,
enc.encounterid  as Enc_Id_Value,
null as Enc_Length,
null as Enc_Location_Location,
null as Enc_Location_Period_End,
null as Enc_Location_Period_Start,
null as Enc_Location_PhysicalType_Coding_Code,
null as Enc_Location_PhysicalType_Coding_Display,
null as Enc_Location_PhysicalType_Coding_System,
null as Enc_Location_PhysicalType_Coding_Usrslt,
null as Enc_Location_PhysicalType_Coding_Version,
null as Enc_Location_PhysicalType_Text,
null as Enc_Location_Status_Code,
null as Enc_PartOf,
null as Enc_Participant_Individual,
null as Enc_Participant_Period_End,
null as Enc_Participant_Period_Start,
null as Enc_Participant_Type_Coding_Code,
null as Enc_Participant_Type_Coding_Display,
null as Enc_Participant_Type_Coding_System,
null as Enc_Participant_Type_Coding_Usrslt,
null as Enc_Participant_Type_Coding_Version,
null as Enc_Participant_Type_Text,
null as Enc_Period_End,
null as Enc_Period_Start,
null as Enc_Priority_Coding_Code,
null as Enc_Priority_Coding_Display,
null as Enc_Priority_Coding_System,
null as Enc_Priority_Coding_Usrslt,
null as Enc_Priority_Coding_Version,
null as Enc_Priority_Text,
null as Enc_ReasonCode_Coding_Code,
null as Enc_ReasonCode_Coding_Display,
null as Enc_ReasonCode_Coding_System,
null as Enc_ReasonCode_Coding_Usrslt,
null as Enc_ReasonCode_Coding_Version,
null as Enc_ReasonCode_Text,
null as Enc_ReasonReference,
null as Enc_ServiceProvider,
null as Enc_ServiceType_Coding_Code,
null as Enc_ServiceType_Coding_Display,
null as Enc_ServiceType_Coding_System,
null as Enc_ServiceType_Coding_Usrslt,
null as Enc_ServiceType_Coding_Version,
null as Enc_ServiceType_Text,
null as Enc_Status_Code,
null as Enc_StatusHistory_Period_End,
null as Enc_StatusHistory_Period_Start,
null as Enc_StatusHistory_Status_Code,
null as Enc_Subject,
null as Enc_Type_Coding_Code,
null as Enc_Type_Coding_Display,
null as Enc_Type_Coding_System,
null as Enc_Type_Coding_Usrslt,
null as Enc_Type_Coding_Version,
null as Enc_Type_Text,
/*Encounter Tyoe in FHIR is for specific valueset*/
null as Encounter_Type_Coding_Code,
null as Encounter_Type_Coding_Display,
null as Encounter_Type_Coding_System,
null as Encounter_Type_Coding_UserSelected,
null as Encounter_Type_Coding_Version

from encounter enc
left join DIAGNOSIS dx on enc.ENCOUNTERID = dx.ENCOUNTERID
left join CONDITION con on enc.ENCOUNTERID = con.ENCOUNTERID
left join CAMPFHIR_MAPPING_VALUESET cmv1 on cmv1.local_column='ENC_TYPE' and enc.ENC_TYPE=cmv1.local_in_code
left join CAMPFHIR_MAPPING_VALUESET cmv2 on cmv2.local_column='DISCHARGE_STATUS' and enc.DISCHARGE_STATUS=cmv2.local_in_code

)
/
CREATE VIEW CAMPFHIR_VIEW_MEDREQ ( ID, MEDREQ_AUTHOREDON, MEDREQ_BASEDON, MEDREQ_CATEGORY_CODING_CODE, MEDREQ_CATEGORY_CODING_DISPLAY, MEDREQ_CATEGORY_CODING_SYSTEM, MEDREQ_CATEGORY_CODING_USRSLT, MEDREQ_CATEGORY_CODING_VERSION, MEDREQ_CATEGORY_TEXT, MEDREQ_COURSEOFTHERAPYTYPE_CODING_CODE, MEDREQ_COURSEOFTHERAPYTYPE_CODING_DISPLAY, MEDREQ_COURSEOFTHERAPYTYPE_CODING_SYSTEM, MEDREQ_COURSEOFTHERAPYTYPE_CODING_USRSLT, MEDREQ_COURSEOFTHERAPYTYPE_CODING_VERSION, MEDREQ_COURSEOFTHERAPYTYPE_TEXT, MEDREQ_DETECTEDISSUE, MEDREQ_DISPENSEREQUEST_DISPENSEINTERVAL, MEDREQ_DISPENSEREQUEST_EXPECTEDSUPPLYDURATION, MEDREQ_DISPENSEREQUEST_INITIALFILL_DURATION, MEDREQ_DISPENSEREQUEST_INITIALFILL_QUANTITY_CODE, MEDREQ_DISPENSEREQUEST_INITIALFILL_QUANTITY_COMPARTR_CODE, MEDREQ_DISPENSEREQUEST_INITIALFILL_QUANTITY_SYSTEM, MEDREQ_DISPENSEREQUEST_INITIALFILL_QUANTITY_UNIT, MEDREQ_DISPENSEREQUEST_INITIALFILL_QUANTITY_VALUE, MEDREQ_DISPENSEREQUEST_NUMBEROFREPEATSALLOWED, MEDREQ_DISPENSEREQUEST_PERFORMER, MEDREQ_DISPENSEREQUEST_QUANTITY_CODE, MEDREQ_DISPENSEREQUEST_QUANTITY_COMPARTR_CODE, MEDREQ_DISPENSEREQUEST_QUANTITY_SYSTEM, MEDREQ_DISPENSEREQUEST_QUANTITY_UNIT, MEDREQ_DISPENSEREQUEST_QUANTITY_VALUE, MEDREQ_DISPENSEREQUEST_VALIDITYPERIOD_END, MEDREQ_DISPENSEREQUEST_VALIDITYPERIOD_START, MEDREQ_DONOTPERFORM, MEDREQ_DOSEINS_ADDITIONALINSTRUCTION_CODING_CODE, MEDREQ_DOSEINS_ADDITIONALINSTRUCTION_CODING_DISPLAY, MEDREQ_DOSEINS_ADDITIONALINSTRUCTION_CODING_SYSTEM, MEDREQ_DOSEINS_ADDITIONALINSTRUCTION_CODING_USRSLT, MEDREQ_DOSEINS_ADDITIONALINSTRUCTION_CODING_VERSION, MEDREQ_DOSEINS_ADDITIONALINSTRUCTION_TEXT, MEDICATIONREQUEST_DOSAGEINSTRUCTION_ASNEEDEDBOOLEAN, MEDREQ_DOSEINS_ASNEEDED_CODEABLECONCEPT_CODING_CODE, MEDREQ_DOSEINS_ASNEEDED_CODEABLECONCEPT_CODING_DISPLAY, MEDREQ_DOSEINS_ASNEEDED_CODEABLECONCEPT_CODING_SYSTEM, MEDREQ_DOSEINS_ASNEEDED_CODEABLECONCEPT_CODING_USRSLT, MEDREQ_DOSEINS_ASNEEDED_CODEABLECONCEPT_CODING_VERSION, MEDREQ_DOSEINS_ASNEEDED_CODEABLECONCEPT_TEXT, MEDREQ_DOSEINS_DOSEANDRATE_DOSE_QUANTITY_CODE, MEDREQ_DOSEINS_DOSEANDRATE_DOSE_QUANTITY_COMPARTR_CODE, MEDREQ_DOSEINS_DOSEANDRATE_DOSE_QUANTITY_SYSTEM, MEDREQ_DOSEINS_DOSEANDRATE_DOSE_QUANTITY_UNIT, MEDREQ_DOSEINS_DOSEANDRATE_DOSE_QUANTITY_VALUE, MEDREQ_DOSEINS_DOSEANDRATE_DOSE_RANGE_HIGH_CODE, MEDREQ_DOSEINS_DOSEANDRATE_DOSE_RANGE_HIGH_COMPARTR_CODE, MEDREQ_DOSEINS_DOSEANDRATE_DOSE_RANGE_HIGH_SYSTEM, MEDREQ_DOSEINS_DOSEANDRATE_DOSE_RANGE_HIGH_UNIT, MEDREQ_DOSEINS_DOSEANDRATE_DOSE_RANGE_HIGH_VALUE, MEDREQ_DOSEINS_DOSEANDRATE_DOSE_RANGE_LOW_CODE, MEDREQ_DOSEINS_DOSEANDRATE_DOSE_RANGE_LOW_COMPARTR_CODE, MEDREQ_DOSEINS_DOSEANDRATE_DOSE_RANGE_LOW_SYSTEM, MEDREQ_DOSEINS_DOSEANDRATE_DOSE_RANGE_LOW_UNIT, MEDREQ_DOSEINS_DOSEANDRATE_DOSE_RANGE_LOW_VALUE, MEDREQ_DOSEINS_DOSEANDRATE_RATE_QUANTITY_CODE, MEDREQ_DOSEINS_DOSEANDRATE_RATE_QUANTITY_COMPARTR_CODE, MEDREQ_DOSEINS_DOSEANDRATE_RATE_QUANTITY_SYSTEM, MEDREQ_DOSEINS_DOSEANDRATE_RATE_QUANTITY_UNIT, MEDREQ_DOSEINS_DOSEANDRATE_RATE_QUANTITY_VALUE, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RANGE_HIGH_CODE, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RANGE_HIGH_COMPARTR_CODE, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RANGE_HIGH_SYSTEM, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RANGE_HIGH_UNIT, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RANGE_HIGH_VALUE, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RANGE_LOW_CODE, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RANGE_LOW_COMPARTR_CODE, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RANGE_LOW_SYSTEM, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RANGE_LOW_UNIT, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RANGE_LOW_VALUE, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RATIO_DENOM_CODE, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RATIO_DENOM_COMPARTR_CODE, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RATIO_DENOM_SYSTEM, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RATIO_DENOM_UNIT, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RATIO_DENOM_VALUE, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RATIO_NUMERATOR_CODE, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RATIO_NUMERATOR_COMPARTR_CODE, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RATIO_NUMERATOR_SYSTEM, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RATIO_NUMERATOR_UNIT, MEDREQ_DOSEINS_DOSEANDRATE_RATE_RATIO_NUMERATOR_VALUE, MEDREQ_DOSEINS_DOSEANDRATE_TYPE_CODING_CODE, MEDREQ_DOSEINS_DOSEANDRATE_TYPE_CODING_DISPLAY, MEDREQ_DOSEINS_DOSEANDRATE_TYPE_CODING_SYSTEM, MEDREQ_DOSEINS_DOSEANDRATE_TYPE_CODING_USRSLT, MEDREQ_DOSEINS_DOSEANDRATE_TYPE_CODING_VERSION, MEDREQ_DOSEINS_DOSEANDRATE_TYPE_TEXT, MEDREQ_DOSEINS_MAXDOSEPERADMINISTRATION_CODE, MEDREQ_DOSEINS_MAXDOSEPERADMINISTRATION_COMPARTR_CODE, MEDREQ_DOSEINS_MAXDOSEPERADMINISTRATION_SYSTEM, MEDREQ_DOSEINS_MAXDOSEPERADMINISTRATION_UNIT, MEDREQ_DOSEINS_MAXDOSEPERADMINISTRATION_VALUE, MEDREQ_DOSEINS_MAXDOSEPERLIFETIME_CODE, MEDREQ_DOSEINS_MAXDOSEPERLIFETIME_COMPARTR_CODE, MEDREQ_DOSEINS_MAXDOSEPERLIFETIME_SYSTEM, MEDREQ_DOSEINS_MAXDOSEPERLIFETIME_UNIT, MEDREQ_DOSEINS_MAXDOSEPERLIFETIME_VALUE, MEDREQ_DOSEINS_MAXDOSEPERPERIOD_DENOM_CODE, MEDREQ_DOSEINS_MAXDOSEPERPERIOD_DENOM_COMPARTR_CODE, MEDREQ_DOSEINS_MAXDOSEPERPERIOD_DENOM_SYSTEM, MEDREQ_DOSEINS_MAXDOSEPERPERIOD_DENOM_UNIT, MEDREQ_DOSEINS_MAXDOSEPERPERIOD_DENOM_VALUE, MEDREQ_DOSEINS_MAXDOSEPERPERIOD_NUMERATOR_CODE, MEDREQ_DOSEINS_MAXDOSEPERPERIOD_NUMERATOR_COMPARTR_CODE, MEDREQ_DOSEINS_MAXDOSEPERPERIOD_NUMERATOR_SYSTEM, MEDREQ_DOSEINS_MAXDOSEPERPERIOD_NUMERATOR_UNIT, MEDREQ_DOSEINS_MAXDOSEPERPERIOD_NUMERATOR_VALUE, MEDREQ_DOSEINS_METHOD_CODING_CODE, MEDREQ_DOSEINS_METHOD_CODING_DISPLAY, MEDREQ_DOSEINS_METHOD_CODING_SYSTEM, MEDREQ_DOSEINS_METHOD_CODING_USRSLT, MEDREQ_DOSEINS_METHOD_CODING_VERSION, MEDREQ_DOSEINS_METHOD_TEXT, MEDREQ_DOSEINS_PATIENTINSTRUCTION, MEDREQ_DOSEINS_ROUTE_CODING_CODE, MEDREQ_DOSEINS_ROUTE_CODING_DISPLAY, MEDREQ_DOSEINS_ROUTE_CODING_SYSTEM, MEDREQ_DOSEINS_ROUTE_CODING_USRSLT, MEDREQ_DOSEINS_ROUTE_CODING_VERSION, MEDREQ_DOSEINS_ROUTE_TEXT, MEDREQ_DOSEINS_SEQUENCE, MEDREQ_DOSEINS_SITE_CODING_CODE, MEDREQ_DOSEINS_SITE_CODING_DISPLAY, MEDREQ_DOSEINS_SITE_CODING_SYSTEM, MEDREQ_DOSEINS_SITE_CODING_USRSLT, MEDREQ_DOSEINS_SITE_CODING_VERSION, MEDREQ_DOSEINS_SITE_TEXT, MEDREQ_DOSEINS_TEXT, MEDREQ_DOSEINS_TIMING_CODE_CODING_CODE, MEDREQ_DOSEINS_TIMING_CODE_CODING_DISPLAY, MEDREQ_DOSEINS_TIMING_CODE_CODING_SYSTEM, MEDREQ_DOSEINS_TIMING_CODE_CODING_USRSLT, MEDREQ_DOSEINS_TIMING_CODE_CODING_VERSION, MEDREQ_DOSEINS_TIMING_CODE_TEXT, MEDREQ_DOSEINS_TIMING_EVENT, MEDREQ_DOSEINS_TIMING_REPEAT_BOUNDS_DURATION_CODE, MEDREQ_DOSEINS_TIMING_REPEAT_BOUNDS_DURATION_COMPARTR_CODE, MEDREQ_DOSEINS_TIMING_REPEAT_BOUNDS_DURATION_SYSTEM, MEDREQ_DOSEINS_TIMING_REPEAT_BOUNDS_DURATION_UNIT, MEDREQ_DOSEINS_TIMING_REPEAT_BOUNDS_DURATION_VALUE, MEDREQ_DOSEINS_TIMING_REPEAT_BOUNDS_PERIOD_END, MEDREQ_DOSEINS_TIMING_REPEAT_BOUNDS_PERIOD_START, MEDREQ_DOSEINS_TIMING_REPEAT_BOUNDS_RANGE_HIGH_CODE, MEDREQ_DOSEINS_TIMING_REPEAT_BOUNDS_RANGE_HIGH_COMPARTR_CODE, MEDREQ_DOSEINS_TIMING_REPEAT_BOUNDS_RANGE_HIGH_SYSTEM, MEDREQ_DOSEINS_TIMING_REPEAT_BOUNDS_RANGE_HIGH_UNIT, MEDREQ_DOSEINS_TIMING_REPEAT_BOUNDS_RANGE_HIGH_VALUE, MEDREQ_DOSEINS_TIMING_REPEAT_BOUNDS_RANGE_LOW_CODE, MEDREQ_DOSEINS_TIMING_REPEAT_BOUNDS_RANGE_LOW_COMPARTR_CODE, MEDREQ_DOSEINS_TIMING_REPEAT_BOUNDS_RANGE_LOW_SYSTEM, MEDREQ_DOSEINS_TIMING_REPEAT_BOUNDS_RANGE_LOW_UNIT, MEDREQ_DOSEINS_TIMING_REPEAT_BOUNDS_RANGE_LOW_VALUE, MEDREQ_DOSEINS_TIMING_REPEAT_COUNT, MEDREQ_DOSEINS_TIMING_REPEAT_COUNTMAX, MEDREQ_DOSEINS_TIMING_REPEAT_DAYOFWEEK_CODE, MEDREQ_DOSEINS_TIMING_REPEAT_DURATION, MEDREQ_DOSEINS_TIMING_REPEAT_DURATIONMAX, MEDREQ_DOSEINS_TIMING_REPEAT_DURATIONUNIT_CODE, MEDREQ_DOSEINS_TIMING_REPEAT_FREQUENCY, MEDREQ_DOSEINS_TIMING_REPEAT_FREQUENCYMAX, MEDREQ_DOSEINS_TIMING_REPEAT_OFF, MEDREQ_DOSEINS_TIMING_REPEAT_PERIOD, MEDREQ_DOSEINS_TIMING_REPEAT_PERIODMAX, MEDREQ_DOSEINS_TIMING_REPEAT_PERIODUNIT_CODE, MEDREQ_DOSEINS_TIMING_REPEAT_TIMEOFDAY, MEDREQ_DOSEINS_TIMING_REPEAT_WHEN_CODE, MEDREQ_ENC, MEDREQ_EVENTHISTORY, MEDREQ_GROUPID_ASSIGNER, MEDREQ_GROUPID_PERIOD_END, MEDREQ_GROUPID_PERIOD_START, MEDREQ_GROUPID_SYSTEM, MEDREQ_GROUPID_TYPE_CODING_CODE, MEDREQ_GROUPID_TYPE_CODING_DISPLAY, MEDREQ_GROUPID_TYPE_CODING_SYSTEM, MEDREQ_GROUPID_TYPE_CODING_USRSLT, MEDREQ_GROUPID_TYPE_CODING_VERSION, MEDREQ_GROUPID_TYPE_TEXT, MEDREQ_GROUPID_USE_CODE, MEDREQ_GROUPID_VALUE, MEDREQ_ID_ASSIGNER, MEDREQ_ID_PERIOD_END, MEDREQ_ID_PERIOD_START, MEDREQ_ID_SYSTEM, MEDREQ_ID_TYPE_CODING_CODE, MEDREQ_ID_TYPE_CODING_DISPLAY, MEDREQ_ID_TYPE_CODING_SYSTEM, MEDREQ_ID_TYPE_CODING_USRSLT, MEDREQ_ID_TYPE_CODING_VERSION, MEDREQ_ID_TYPE_TEXT, MEDREQ_ID_USE_CODE, MEDREQ_ID_VALUE, MEDREQ_INSTANTIATESCANONICAL, MEDREQ_INSTANTIATESURI, MEDREQ_INSURANCE, MEDREQ_INTENT_CODE, MEDREQ_MEDICATION_CODEABLECONCEPT_CODING_CODE, MEDREQ_MEDICATION_CODEABLECONCEPT_CODING_DISPLAY, MEDREQ_MEDICATION_CODEABLECONCEPT_CODING_SYSTEM, MEDREQ_MEDICATION_CODEABLECONCEPT_CODING_USRSLT, MEDREQ_MEDICATION_CODEABLECONCEPT_CODING_VERSION, MEDREQ_MEDICATION_CODEABLECONCEPT_TEXT, MEDICATIONREQUEST_MEDICATIONREFERENCE, MEDICATIONREQUEST_NOTE_AUTHORREFERENCE, MEDICATIONREQUEST_NOTE_AUTHORSTRING, MEDREQ_NOTE_TEXT, MEDREQ_NOTE_TIME, MEDREQ_PERFORMER, MEDREQ_PERFORMERTYPE_CODING_CODE, MEDREQ_PERFORMERTYPE_CODING_DISPLAY, MEDREQ_PERFORMERTYPE_CODING_SYSTEM, MEDREQ_PERFORMERTYPE_CODING_USRSLT, MEDREQ_PERFORMERTYPE_CODING_VERSION, MEDREQ_PERFORMERTYPE_TEXT, MEDREQ_PRIORPRESCRIPTION, MEDREQ_PRIORITY_CODE, MEDREQ_REASONCODE_CODING_CODE, MEDREQ_REASONCODE_CODING_DISPLAY, MEDREQ_REASONCODE_CODING_SYSTEM, MEDREQ_REASONCODE_CODING_USRSLT, MEDREQ_REASONCODE_CODING_VERSION, MEDREQ_REASONCODE_TEXT, MEDREQ_REASONREFERENCE, MEDREQ_RECORDER, MEDICATIONREQUEST_REPORTEDBOOLEAN, MEDICATIONREQUEST_REPORTEDREFERENCE, MEDREQ_REQUESTER, MEDREQ_STATUS_CODE, MEDREQ_STATUSREASON_CODING_CODE, MEDREQ_STATUSREASON_CODING_DISPLAY, MEDREQ_STATUSREASON_CODING_SYSTEM, MEDREQ_STATUSREASON_CODING_USRSLT, MEDREQ_STATUSREASON_CODING_VERSION, MEDREQ_STATUSREASON_TEXT, MEDREQ_SUBJECT, MEDICATIONREQUEST_SUBSTITUTION_ALLOWEDBOOLEAN, MEDREQ_SUBSTITUTION_ALLOWED_CODEABLECONCEPT_CODING_CODE, MEDREQ_SUBSTITUTION_ALLOWED_CODEABLECONCEPT_CODING_DISPLAY, MEDREQ_SUBSTITUTION_ALLOWED_CODEABLECONCEPT_CODING_SYSTEM, MEDREQ_SUBSTITUTION_ALLOWED_CODEABLECONCEPT_CODING_USRSLT, MEDREQ_SUBSTITUTION_ALLOWED_CODEABLECONCEPT_CODING_VERSION, MEDREQ_SUBSTITUTION_ALLOWED_CODEABLECONCEPT_TEXT, MEDREQ_SUBSTITUTION_REASON_CODING_CODE, MEDREQ_SUBSTITUTION_REASON_CODING_DISPLAY, MEDREQ_SUBSTITUTION_REASON_CODING_SYSTEM, MEDREQ_SUBSTITUTION_REASON_CODING_USRSLT, MEDREQ_SUBSTITUTION_REASON_CODING_VERSION, MEDREQ_SUBSTITUTION_REASON_TEXT, MEDREQ_SUPPORTINGINFORMATION )
BEQUEATH DEFINER AS
(
select distinct 

 	med.PRESCRIBINGID	AS	id
,	to_char(med.RX_ORDER_DATE, 'YYYY-MM-DD')	AS	Medreq_AuthoredOn
,	null	AS	Medreq_BasedOn
,	null	AS	Medreq_Category_Coding_Code
,	null	AS	Medreq_Category_Coding_Display
,	null	AS	Medreq_Category_Coding_System
,	null	AS	Medreq_Category_Coding_Usrslt
,	null	AS	Medreq_Category_Coding_Version
,	null	AS	Medreq_Category_Text
,	null	AS	Medreq_CourseOfTherapyType_Coding_Code
,	null	AS	Medreq_CourseOfTherapyType_Coding_Display
,	null	AS	Medreq_CourseOfTherapyType_Coding_System
,	null	AS	Medreq_CourseOfTherapyType_Coding_Usrslt
,	null	AS	Medreq_CourseOfTherapyType_Coding_Version
,	null	AS	Medreq_CourseOfTherapyType_Text
,	null	AS	Medreq_DetectedIssue
,	null	AS	Medreq_DispenseRequest_DispenseInterval
,	med.RX_DAYS_SUPPLY	AS	Medreq_DispenseRequest_ExpectedSupplyDuration
,	null	AS	Medreq_DispenseRequest_InitialFill_Duration
,	null	AS	Medreq_DispenseRequest_InitialFill_Quantity_Code
,	null	AS	Medreq_DispenseRequest_InitialFill_Quantity_Compartr_Code
,	null	AS	Medreq_DispenseRequest_InitialFill_Quantity_System
,	null	AS	Medreq_DispenseRequest_InitialFill_Quantity_Unit
,	null	AS	Medreq_DispenseRequest_InitialFill_Quantity_Value
,	med.RX_REFILLS	AS	Medreq_DispenseRequest_NumberOfRepeatsAllowed
,	null	AS	Medreq_DispenseRequest_Performer
,	null	AS	Medreq_DispenseRequest_Quantity_Code
,	null	AS	Medreq_DispenseRequest_Quantity_Compartr_Code
,	null	AS	Medreq_DispenseRequest_Quantity_System
,	null	AS	Medreq_DispenseRequest_Quantity_Unit
,	med.RX_QUANTITY	AS	Medreq_DispenseRequest_Quantity_Value
,	to_char(med.RX_END_DATE, 'YYYY-MM-DD')	AS	Medreq_DispenseRequest_ValidityPeriod_End
,	to_char(med.RX_START_DATE, 'YYYY-MM-DD')	AS	Medreq_DispenseRequest_ValidityPeriod_Start
,	null	AS	Medreq_DoNotPerform
,	null	AS	Medreq_Doseins_AdditionalInstruction_Coding_Code
,	null	AS	Medreq_Doseins_AdditionalInstruction_Coding_Display
,	null	AS	Medreq_Doseins_AdditionalInstruction_Coding_System
,	null	AS	Medreq_Doseins_AdditionalInstruction_Coding_Usrslt
,	null	AS	Medreq_Doseins_AdditionalInstruction_Coding_Version
,	null	AS	Medreq_Doseins_AdditionalInstruction_Text
,	nvl(cmv2.FHIR_OUT_CODE,null)	AS	Medicationrequest_DosageInstruction_AsNeededBoolean
,	null	AS	Medreq_Doseins_AsNeeded_CodeableConcept_Coding_Code
,	null	AS	Medreq_Doseins_AsNeeded_CodeableConcept_Coding_Display
,	null	AS	Medreq_Doseins_AsNeeded_CodeableConcept_Coding_System
,	null	AS	Medreq_Doseins_AsNeeded_CodeableConcept_Coding_Usrslt
,	null	AS	Medreq_Doseins_AsNeeded_CodeableConcept_Coding_Version
,	null	AS	Medreq_Doseins_AsNeeded_CodeableConcept_Text
,	null	AS	Medreq_Doseins_DoseAndRate_Dose_Quantity_Code
,	null	AS	Medreq_Doseins_DoseAndRate_Dose_Quantity_Compartr_Code
,	null	AS	Medreq_Doseins_DoseAndRate_Dose_Quantity_System
,	med.RX_DOSE_ORDERED_UNIT	AS	Medreq_Doseins_DoseAndRate_Dose_Quantity_Unit
,	med.RX_DOSE_ORDERED	AS	Medreq_Doseins_DoseAndRate_Dose_Quantity_Value
,	null	AS	Medreq_Doseins_DoseAndRate_Dose_Range_High_Code
,	null	AS	Medreq_Doseins_DoseAndRate_Dose_Range_High_Compartr_Code
,	null	AS	Medreq_Doseins_DoseAndRate_Dose_Range_High_System
,	null	AS	Medreq_Doseins_DoseAndRate_Dose_Range_High_Unit
,	null	AS	Medreq_Doseins_DoseAndRate_Dose_Range_High_Value
,	null	AS	Medreq_Doseins_DoseAndRate_Dose_Range_Low_Code
,	null	AS	Medreq_Doseins_DoseAndRate_Dose_Range_Low_Compartr_Code
,	null	AS	Medreq_Doseins_DoseAndRate_Dose_Range_Low_System
,	null	AS	Medreq_Doseins_DoseAndRate_Dose_Range_Low_Unit
,	null	AS	Medreq_Doseins_DoseAndRate_Dose_Range_Low_Value
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Quantity_Code
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Quantity_Compartr_Code
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Quantity_System
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Quantity_Unit
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Quantity_Value
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Range_High_Code
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Range_High_Compartr_Code
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Range_High_System
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Range_High_Unit
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Range_High_Value
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Range_Low_Code
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Range_Low_Compartr_Code
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Range_Low_System
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Range_Low_Unit
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Range_Low_Value
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Ratio_Denom_Code
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Ratio_Denom_Compartr_Code
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Ratio_Denom_System
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Ratio_Denom_Unit
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Ratio_Denom_Value
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Ratio_Numerator_Code
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Ratio_Numerator_Compartr_Code
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Ratio_Numerator_System
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Ratio_Numerator_Unit
,	null	AS	Medreq_Doseins_DoseAndRate_Rate_Ratio_Numerator_Value
,	null	AS	Medreq_Doseins_DoseAndRate_Type_Coding_Code
,	null	AS	Medreq_Doseins_DoseAndRate_Type_Coding_Display
,	null	AS	Medreq_Doseins_DoseAndRate_Type_Coding_System
,	null	AS	Medreq_Doseins_DoseAndRate_Type_Coding_Usrslt
,	null	AS	Medreq_Doseins_DoseAndRate_Type_Coding_Version
,	null	AS	Medreq_Doseins_DoseAndRate_Type_Text
,	null	AS	Medreq_Doseins_MaxDosePerAdministration_Code
,	null	AS	Medreq_Doseins_MaxDosePerAdministration_Compartr_Code
,	null	AS	Medreq_Doseins_MaxDosePerAdministration_System
,	null	AS	Medreq_Doseins_MaxDosePerAdministration_Unit
,	null	AS	Medreq_Doseins_MaxDosePerAdministration_Value
,	null	AS	Medreq_Doseins_MaxDosePerLifetime_Code
,	null	AS	Medreq_Doseins_MaxDosePerLifetime_Compartr_Code
,	null	AS	Medreq_Doseins_MaxDosePerLifetime_System
,	null	AS	Medreq_Doseins_MaxDosePerLifetime_Unit
,	null	AS	Medreq_Doseins_MaxDosePerLifetime_Value
,	null	AS	Medreq_Doseins_MaxDosePerPeriod_Denom_Code
,	null	AS	Medreq_Doseins_MaxDosePerPeriod_Denom_Compartr_Code
,	null	AS	Medreq_Doseins_MaxDosePerPeriod_Denom_System
,	null	AS	Medreq_Doseins_MaxDosePerPeriod_Denom_Unit
,	null	AS	Medreq_Doseins_MaxDosePerPeriod_Denom_Value
,	null	AS	Medreq_Doseins_MaxDosePerPeriod_Numerator_Code
,	null	AS	Medreq_Doseins_MaxDosePerPeriod_Numerator_Compartr_Code
,	null	AS	Medreq_Doseins_MaxDosePerPeriod_Numerator_System
,	null	AS	Medreq_Doseins_MaxDosePerPeriod_Numerator_Unit
,	null	AS	Medreq_Doseins_MaxDosePerPeriod_Numerator_Value
,	null	AS	Medreq_Doseins_Method_Coding_Code
,	null	AS	Medreq_Doseins_Method_Coding_Display
,	null	AS	Medreq_Doseins_Method_Coding_System
,	null	AS	Medreq_Doseins_Method_Coding_Usrslt
,	null	AS	Medreq_Doseins_Method_Coding_Version
,	null	AS	Medreq_Doseins_Method_Text
,	null	AS	Medreq_Doseins_PatientInstruction
,	null	AS	Medreq_Doseins_Route_Coding_Code
,	null	AS	Medreq_Doseins_Route_Coding_Display
,	null	AS	Medreq_Doseins_Route_Coding_System
,	null	AS	Medreq_Doseins_Route_Coding_Usrslt
,	null	AS	Medreq_Doseins_Route_Coding_Version
,	med.RX_ROUTE	AS	Medreq_Doseins_Route_Text
,	null	AS	Medreq_Doseins_Sequence
,	null	AS	Medreq_Doseins_Site_Coding_Code
,	null	AS	Medreq_Doseins_Site_Coding_Display
,	null	AS	Medreq_Doseins_Site_Coding_System
,	null	AS	Medreq_Doseins_Site_Coding_Usrslt
,	null	AS	Medreq_Doseins_Site_Coding_Version
,	null	AS	Medreq_Doseins_Site_Text
,	nvl(cmv1.FHIR_OUT_CODE,null)	AS	Medreq_Doseins_Text
,	null	AS	Medreq_Doseins_Timing_Code_Coding_Code
,	null	AS	Medreq_Doseins_Timing_Code_Coding_Display
,	null	AS	Medreq_Doseins_Timing_Code_Coding_System
,	null	AS	Medreq_Doseins_Timing_Code_Coding_Usrslt
,	null	AS	Medreq_Doseins_Timing_Code_Coding_Version
,	null	AS	Medreq_Doseins_Timing_Code_Text
,	null	AS	Medreq_Doseins_Timing_Event
,	null	AS	Medreq_Doseins_Timing_Repeat_Bounds_Duration_Code
,	null	AS	Medreq_Doseins_Timing_Repeat_Bounds_Duration_Compartr_Code
,	null	AS	Medreq_Doseins_Timing_Repeat_Bounds_Duration_System
,	null	AS	Medreq_Doseins_Timing_Repeat_Bounds_Duration_Unit
,	null	AS	Medreq_Doseins_Timing_Repeat_Bounds_Duration_Value
,	null	AS	Medreq_Doseins_Timing_Repeat_Bounds_Period_End
,	null	AS	Medreq_Doseins_Timing_Repeat_Bounds_Period_Start
,	null	AS	Medreq_Doseins_Timing_Repeat_Bounds_Range_High_Code
,	null	AS	Medreq_Doseins_Timing_Repeat_Bounds_Range_High_Compartr_Code
,	null	AS	Medreq_Doseins_Timing_Repeat_Bounds_Range_High_System
,	null	AS	Medreq_Doseins_Timing_Repeat_Bounds_Range_High_Unit
,	null	AS	Medreq_Doseins_Timing_Repeat_Bounds_Range_High_Value
,	null	AS	Medreq_Doseins_Timing_Repeat_Bounds_Range_Low_Code
,	null	AS	Medreq_Doseins_Timing_Repeat_Bounds_Range_Low_Compartr_Code
,	null	AS	Medreq_Doseins_Timing_Repeat_Bounds_Range_Low_System
,	null	AS	Medreq_Doseins_Timing_Repeat_Bounds_Range_Low_Unit
,	null	AS	Medreq_Doseins_Timing_Repeat_Bounds_Range_Low_Value
,	null	AS	Medreq_Doseins_Timing_Repeat_Count
,	null	AS	Medreq_Doseins_Timing_Repeat_CountMax
,	null	AS	Medreq_Doseins_Timing_Repeat_DayOfWeek_Code
,	null	AS	Medreq_Doseins_Timing_Repeat_Duration
,	null	AS	Medreq_Doseins_Timing_Repeat_DurationMax
,	null	AS	Medreq_Doseins_Timing_Repeat_DurationUnit_Code
,	null	AS	Medreq_Doseins_Timing_Repeat_Frequency
,	null	AS	Medreq_Doseins_Timing_Repeat_FrequencyMax
,	null	AS	Medreq_Doseins_Timing_Repeat_Off
,	null	AS	Medreq_Doseins_Timing_Repeat_Period
,	null	AS	Medreq_Doseins_Timing_Repeat_PeriodMax
,	null	AS	Medreq_Doseins_Timing_Repeat_PeriodUnit_Code
,	null	AS	Medreq_Doseins_Timing_Repeat_TimeOfDay
,	null	AS	Medreq_Doseins_Timing_Repeat_When_Code
,	'Encounter/'||med.ENCOUNTERID	AS	Medreq_Enc
,	null	AS	Medreq_EventHistory
,	null	AS	Medreq_GroupId_Assigner
,	null	AS	Medreq_GroupId_Period_End
,	null	AS	Medreq_GroupId_Period_Start
,	null	AS	Medreq_GroupId_System
,	null	AS	Medreq_GroupId_Type_Coding_Code
,	null	AS	Medreq_GroupId_Type_Coding_Display
,	null	AS	Medreq_GroupId_Type_Coding_System
,	null	AS	Medreq_GroupId_Type_Coding_Usrslt
,	null	AS	Medreq_GroupId_Type_Coding_Version
,	null	AS	Medreq_GroupId_Type_Text
,	null	AS	Medreq_GroupId_Use_Code
,	null	AS	Medreq_GroupId_Value
,	null	AS	Medreq_Id_Assigner
,	null	AS	Medreq_Id_Period_End
,	null	AS	Medreq_Id_Period_Start
,	null	AS	Medreq_Id_System
,	null	AS	Medreq_Id_Type_Coding_Code
,	null	AS	Medreq_Id_Type_Coding_Display
,	null	AS	Medreq_Id_Type_Coding_System
,	null	AS	Medreq_Id_Type_Coding_Usrslt
,	null	AS	Medreq_Id_Type_Coding_Version
,	null	AS	Medreq_Id_Type_Text
,	null	AS	Medreq_Id_Use_Code
,	null	AS	Medreq_Id_Value
,	null	AS	Medreq_InstantiatesCanonical
,	null	AS	Medreq_InstantiatesUri
,	null	AS	Medreq_Insurance
,	'order'	AS	Medreq_Intent_Code
,	null	AS	Medreq_Medication_CodeableConcept_Coding_Code
,	null	AS	Medreq_Medication_CodeableConcept_Coding_Display
,	null	AS	Medreq_Medication_CodeableConcept_Coding_System
,	null	AS	Medreq_Medication_CodeableConcept_Coding_Usrslt
,	null	AS	Medreq_Medication_CodeableConcept_Coding_Version
,	null	AS	Medreq_Medication_CodeableConcept_Text
,	'Medication/'||replace(med.raw_RXNORM_CUI,'MDCTN:','')	AS	Medicationrequest_MedicationReference
,	null	AS	Medicationrequest_Note_AuthorReference
,	null	AS	Medicationrequest_Note_AuthorString
,	null	AS	Medreq_Note_Text
,	null	AS	Medreq_Note_Time
,	null	AS	Medreq_Performer
,	null	AS	Medreq_PerformerType_Coding_Code
,	null	AS	Medreq_PerformerType_Coding_Display
,	null	AS	Medreq_PerformerType_Coding_System
,	null	AS	Medreq_PerformerType_Coding_Usrslt
,	null	AS	Medreq_PerformerType_Coding_Version
,	null	AS	Medreq_PerformerType_Text
,	null	AS	Medreq_PriorPrescription
,	null	AS	Medreq_Priority_Code
,	null	AS	Medreq_ReasonCode_Coding_Code
,	null	AS	Medreq_ReasonCode_Coding_Display
,	null	AS	Medreq_ReasonCode_Coding_System
,	null	AS	Medreq_ReasonCode_Coding_Usrslt
,	null	AS	Medreq_ReasonCode_Coding_Version
,	null	AS	Medreq_ReasonCode_Text
,	null	AS	Medreq_ReasonReference
,	null	AS	Medreq_Recorder
,	null	AS	Medicationrequest_ReportedBoolean
,	null	AS	Medicationrequest_ReportedReference
,	case when med.RX_PROVIDERID is null then null else 'Practitioner/'||med.RX_PROVIDERID end	AS	Medreq_Requester
,	null	AS	Medreq_Status_Code
,	null	AS	Medreq_StatusReason_Coding_Code
,	null	AS	Medreq_StatusReason_Coding_Display
,	null	AS	Medreq_StatusReason_Coding_System
,	null	AS	Medreq_StatusReason_Coding_Usrslt
,	null	AS	Medreq_StatusReason_Coding_Version
,	null	AS	Medreq_StatusReason_Text
,	'Patient/'||med.PATID	AS	Medreq_Subject
,	nvl(cmv3.FHIR_OUT_CODE,null)	AS	Medicationrequest_Substitution_AllowedBoolean
,	null	AS	Medreq_Substitution_Allowed_CodeableConcept_Coding_Code
,	null	AS	Medreq_Substitution_Allowed_CodeableConcept_Coding_Display
,	null	AS	Medreq_Substitution_Allowed_CodeableConcept_Coding_System
,	null	AS	Medreq_Substitution_Allowed_CodeableConcept_Coding_Usrslt
,	null	AS	Medreq_Substitution_Allowed_CodeableConcept_Coding_Version
,	null	AS	Medreq_Substitution_Allowed_CodeableConcept_Text
,	null	AS	Medreq_Substitution_Reason_Coding_Code
,	null	AS	Medreq_Substitution_Reason_Coding_Display
,	null	AS	Medreq_Substitution_Reason_Coding_System
,	null	AS	Medreq_Substitution_Reason_Coding_Usrslt
,	null	AS	Medreq_Substitution_Reason_Coding_Version
,	null	AS	Medreq_Substitution_Reason_Text
,	null	AS	Medreq_SupportingInformation
  
    
from 
    PRESCRIBING med
    left join CAMPFHIR_MAPPING_VALUESET cmv1 on cmv1.local_column='RX_FREQUENCY' and med.RX_FREQUENCY=cmv1.local_in_code
    left join CAMPFHIR_MAPPING_VALUESET cmv2 on cmv2.local_column='RX_PRN_FLAG' and med.RX_PRN_FLAG=cmv2.local_in_code
    left join CAMPFHIR_MAPPING_VALUESET cmv3 on cmv3.local_column='RX_DISPENSE_AS_WRITTEN' and med.RX_DISPENSE_AS_WRITTEN=cmv3.local_in_code
)
/
CREATE VIEW CAMPFHIR_VIEW_CONDITION ( ID, CONDITION_ABATEMENT, CONDITION_ABATEMENTDATETIME, CONDITION_ABATEMENT_PERIOD_END, CONDITION_ABATEMENT_PERIOD_START, CONDITION_ABATEMENT_RANGE_HIGH_CODE, CONDITION_ABATEMENT_RANGE_HIGH_COMPARTR_CODE, CONDITION_ABATEMENT_RANGE_HIGH_SYSTEM, CONDITION_ABATEMENT_RANGE_HIGH_UNIT, CONDITION_ABATEMENT_RANGE_HIGH_VALUE, CONDITION_ABATEMENT_RANGE_LOW_CODE, CONDITION_ABATEMENT_RANGE_LOW_COMPARTR_CODE, CONDITION_ABATEMENT_RANGE_LOW_SYSTEM, CONDITION_ABATEMENT_RANGE_LOW_UNIT, CONDITION_ABATEMENT_RANGE_LOW_VALUE, CONDITION_ABATEMENTSTRING, CONDITION_ASSERTER, CONDITION_BODYSITE_CODING_CODE, CONDITION_BODYSITE_CODING_DISPLAY, CONDITION_BODYSITE_CODING_SYSTEM, CONDITION_BODYSITE_CODING_USRSLT, CONDITION_BODYSITE_CODING_VERSION, CONDITION_BODYSITE_TEXT, CONDITION_CATEGORY_CODING_CODE, CONDITION_CATEGORY_CODING_DISPLAY, CONDITION_CATEGORY_CODING_SYSTEM, CONDITION_CATEGORY_CODING_USRSLT, CONDITION_CATEGORY_CODING_VERSION, CONDITION_CATEGORY_TEXT, CONDITION_CLINICALSTATUS_CODING_CODE, CONDITION_CLINICALSTATUS_CODING_DISPLAY, CONDITION_CLINICALSTATUS_CODING_SYSTEM, CONDITION_CLINICALSTATUS_CODING_USRSLT, CONDITION_CLINICALSTATUS_CODING_VERSION, CONDITION_CLINICALSTATUS_TEXT, CONDITION_CODE_CODING_CODE, CONDITION_CODE_CODING_DISPLAY, CONDITION_CODE_CODING_SYSTEM, CONDITION_CODE_CODING_USRSLT, CONDITION_CODE_CODING_VERSION, CONDITION_CODE_TEXT, CONDITION_ENC, CONDITION_EVIDENCE_CODE_CODING_CODE, CONDITION_EVIDENCE_CODE_CODING_DISPLAY, CONDITION_EVIDENCE_CODE_CODING_SYSTEM, CONDITION_EVIDENCE_CODE_CODING_USRSLT, CONDITION_EVIDENCE_CODE_CODING_VERSION, CONDITION_EVIDENCE_CODE_TEXT, CONDITION_EVIDENCE_DETAIL, CONDITION_ID_ASSIGNER, CONDITION_ID_PERIOD_END, CONDITION_ID_PERIOD_START, CONDITION_ID_SYSTEM, CONDITION_ID_TYPE_CODING_CODE, CONDITION_ID_TYPE_CODING_DISPLAY, CONDITION_ID_TYPE_CODING_SYSTEM, CONDITION_ID_TYPE_CODING_USRSLT, CONDITION_ID_TYPE_CODING_VERSION, CONDITION_ID_TYPE_TEXT, CONDITION_ID_USE_CODE, CONDITION_ID_VALUE, CONDITION_NOTE_AUTHORREFERENCE, CONDITION_NOTE_AUTHORSTRING, CONDITION_NOTE_TEXT, CONDITION_NOTE_TIME, CONDITION_ON, CONDITION_ONDATETIME, CONDITION_ON_PERIOD_END, CONDITION_ON_PERIOD_START, CONDITION_ON_RANGE_HIGH_CODE, CONDITION_ON_RANGE_HIGH_COMPARTR_CODE, CONDITION_ON_RANGE_HIGH_SYSTEM, CONDITION_ON_RANGE_HIGH_UNIT, CONDITION_ON_RANGE_HIGH_VALUE, CONDITION_ON_RANGE_LOW_CODE, CONDITION_ON_RANGE_LOW_COMPARTR_CODE, CONDITION_ON_RANGE_LOW_SYSTEM, CONDITION_ON_RANGE_LOW_UNIT, CONDITION_ON_RANGE_LOW_VALUE, CONDITION_ONSTRING, CONDITION_RECORDEDDATE, CONDITION_RECORDER, CONDITION_SEVERITY_CODING_CODE, CONDITION_SEVERITY_CODING_DISPLAY, CONDITION_SEVERITY_CODING_SYSTEM, CONDITION_SEVERITY_CODING_USRSLT, CONDITION_SEVERITY_CODING_VERSION, CONDITION_SEVERITY_TEXT, CONDITION_STAGE_ASSESSMENT, CONDITION_STAGE_SUMMARY_CODING_CODE, CONDITION_STAGE_SUMMARY_CODING_DISPLAY, CONDITION_STAGE_SUMMARY_CODING_SYSTEM, CONDITION_STAGE_SUMMARY_CODING_USRSLT, CONDITION_STAGE_SUMMARY_CODING_VERSION, CONDITION_STAGE_SUMMARY_TEXT, CONDITION_STAGE_TYPE_CODING_CODE, CONDITION_STAGE_TYPE_CODING_DISPLAY, CONDITION_STAGE_TYPE_CODING_SYSTEM, CONDITION_STAGE_TYPE_CODING_USRSLT, CONDITION_STAGE_TYPE_CODING_VERSION, CONDITION_STAGE_TYPE_TEXT, CONDITION_SUBJECT, CONDITION_VERIFICATIONSTATUS_CODING_CODE, CONDITION_VERIFICATIONSTATUS_CODING_DISPLAY, CONDITION_VERIFICATIONSTATUS_CODING_SYSTEM, CONDITION_VERIFICATIONSTATUS_CODING_USRSLT, CONDITION_VERIFICATIONSTATUS_CODING_VERSION, CONDITION_VERIFICATIONSTATUS_TEXT )
BEQUEATH DEFINER AS
(  
SELECT distinct
    conditionid	AS	id
,	null	AS	Condition_Abatement
,	to_char(cond.RESOLVE_DATE, 'YYYY-MM-DD')	AS	Condition_AbatementDateTime
,	null	AS	Condition_Abatement_Period_End
,	null	AS	Condition_Abatement_Period_Start
,	null	AS	Condition_Abatement_Range_High_Code
,	null	AS	Condition_Abatement_Range_High_Compartr_Code
,	null	AS	Condition_Abatement_Range_High_System
,	null	AS	Condition_Abatement_Range_High_Unit
,	null	AS	Condition_Abatement_Range_High_Value
,	null	AS	Condition_Abatement_Range_Low_Code
,	null	AS	Condition_Abatement_Range_Low_Compartr_Code
,	null	AS	Condition_Abatement_Range_Low_System
,	null	AS	Condition_Abatement_Range_Low_Unit
,	null	AS	Condition_Abatement_Range_Low_Value
,	null	AS	Condition_AbatementString
,	null	AS	Condition_Asserter
,	null	AS	Condition_BodySite_Coding_Code
,	null	AS	Condition_BodySite_Coding_Display
,	null	AS	Condition_BodySite_Coding_System
,	null	AS	Condition_BodySite_Coding_Usrslt
,	null	AS	Condition_BodySite_Coding_Version
,	null	AS	Condition_BodySite_Text
,	'problem-list-item'	AS	Condition_Category_Coding_Code
,	'Problem List Item'	AS	Condition_Category_Coding_Display
,	'https://www.hl7.org/fhir/valueset-condition-category'	AS	Condition_Category_Coding_System
,	null	AS	Condition_Category_Coding_Usrslt
,	null	AS	Condition_Category_Coding_Version
,	null	AS	Condition_Category_Text
,	nvl(cmv1.FHIR_OUT_CODE, null)	AS	Condition_ClinicalStatus_Coding_Code
,	nvl(cmv1.fhir_out_char, null)	AS	Condition_ClinicalStatus_Coding_Display
,	nvl(cmv1.fhir_urn_oid_system, null)	AS	Condition_ClinicalStatus_Coding_System
,	null	AS	Condition_ClinicalStatus_Coding_Usrslt
,	null	AS	Condition_ClinicalStatus_Coding_Version
,	null	AS	Condition_ClinicalStatus_Text
,	cond.CONDITION	AS	Condition_Code_Coding_Code
,	cond.RAW_CONDITION	AS	Condition_Code_Coding_Display
,	case
		when cond.CONDITION_TYPE = '09' then 'http://hl7.org/fhir/sid/icd-9-cm'
		when cond.CONDITION_TYPE = '10' then 'http://hl7.org/fhir/sid/icd-10-cm'
		when cond.CONDITION_TYPE = '11' then 'http://hl7.org/fhir/sid/icd-11-cm'
		when cond.CONDITION_TYPE = 'SM' then 'http://snomed.info/sct'
		when cond.CONDITION_TYPE = 'HP' then 'https://hpo.jax.org/app/'
	end 	AS	Condition_Code_Coding_System
,	null	AS	Condition_Code_Coding_Usrslt
,	null	AS	Condition_Code_Coding_Version
,	null	AS	Condition_Code_Text
,	case
	    when cond.ENCOUNTERID is null then null
	    else 'Encounter/' || cond.ENCOUNTERID
	end   	AS	Condition_Enc
,	null	AS	Condition_Evidence_Code_Coding_Code
,	null	AS	Condition_Evidence_Code_Coding_Display
,	null	AS	Condition_Evidence_Code_Coding_System
,	null	AS	Condition_Evidence_Code_Coding_Usrslt
,	null	AS	Condition_Evidence_Code_Coding_Version
,	null	AS	Condition_Evidence_Code_Text
,	null	AS	Condition_Evidence_Detail
,	null	AS	Condition_Id_Assigner
,	null	AS	Condition_Id_Period_End
,	null	AS	Condition_Id_Period_Start
,	null	AS	Condition_Id_System
,	null	AS	Condition_Id_Type_Coding_Code
,	null	AS	Condition_Id_Type_Coding_Display
,	null	AS	Condition_Id_Type_Coding_System
,	null	AS	Condition_Id_Type_Coding_Usrslt
,	null	AS	Condition_Id_Type_Coding_Version
,	null	AS	Condition_Id_Type_Text
,	'secondary'	AS	Condition_Id_Use_Code
,	conditionid	AS	Condition_Id_Value
,	null	AS	Condition_Note_AuthorReference
,	null	AS	Condition_Note_AuthorString
,	null	AS	Condition_Note_Text
,	null	AS	Condition_Note_Time
,	null	AS	Condition_On
,	to_char(cond.ONSET_DATE, 'YYYY-MM-DD')	AS	Condition_OnDateTime
,	null	AS	Condition_On_Period_End
,	null	AS	Condition_On_Period_Start
,	null	AS	Condition_On_Range_High_Code
,	null	AS	Condition_On_Range_High_Compartr_Code
,	null	AS	Condition_On_Range_High_System
,	null	AS	Condition_On_Range_High_Unit
,	null	AS	Condition_On_Range_High_Value
,	null	AS	Condition_On_Range_Low_Code
,	null	AS	Condition_On_Range_Low_Compartr_Code
,	null	AS	Condition_On_Range_Low_System
,	null	AS	Condition_On_Range_Low_Unit
,	null	AS	Condition_On_Range_Low_Value
,	null	AS	Condition_OnString
,	to_char(cond.REPORT_DATE, 'YYYY-MM-DD')	AS	Condition_RecordedDate
,	null	AS	Condition_Recorder
,	null	AS	Condition_Severity_Coding_Code
,	null	AS	Condition_Severity_Coding_Display
,	null	AS	Condition_Severity_Coding_System
,	null	AS	Condition_Severity_Coding_Usrslt
,	null	AS	Condition_Severity_Coding_Version
,	null	AS	Condition_Severity_Text
,	null	AS	Condition_Stage_Assessment
,	null	AS	Condition_Stage_Summary_Coding_Code
,	null	AS	Condition_Stage_Summary_Coding_Display
,	null	AS	Condition_Stage_Summary_Coding_System
,	null	AS	Condition_Stage_Summary_Coding_Usrslt
,	null	AS	Condition_Stage_Summary_Coding_Version
,	null	AS	Condition_Stage_Summary_Text
,	null	AS	Condition_Stage_Type_Coding_Code
,	null	AS	Condition_Stage_Type_Coding_Display
,	null	AS	Condition_Stage_Type_Coding_System
,	null	AS	Condition_Stage_Type_Coding_Usrslt
,	null	AS	Condition_Stage_Type_Coding_Version
,	null	AS	Condition_Stage_Type_Text
,	'Patient/'||cond.PATID	AS	Condition_Subject
,	null	AS	Condition_VerificationStatus_Coding_Code
,	null	AS	Condition_VerificationStatus_Coding_Display
,	null	AS	Condition_VerificationStatus_Coding_System
,	null	AS	Condition_VerificationStatus_Coding_Usrslt
,	null	AS	Condition_VerificationStatus_Coding_Version
,	null	AS	Condition_VerificationStatus_Text


from
	condition cond
	left join CAMPFHIR_MAPPING_VALUESET cmv1 on cmv1.local_column='CONDITION_STATUS' and cond.CONDITION_STATUS=cmv1.local_in_code

UNION

 select distinct
    dx.DIAGNOSISID	AS	id
,	null	AS	Condition_Abatement
,	null	AS	Condition_AbatementDateTime
,	null	AS	Condition_Abatement_Period_End
,	null	AS	Condition_Abatement_Period_Start
,	null	AS	Condition_Abatement_Range_High_Code
,	null	AS	Condition_Abatement_Range_High_Compartr_Code
,	null	AS	Condition_Abatement_Range_High_System
,	null	AS	Condition_Abatement_Range_High_Unit
,	null	AS	Condition_Abatement_Range_High_Value
,	null	AS	Condition_Abatement_Range_Low_Code
,	null	AS	Condition_Abatement_Range_Low_Compartr_Code
,	null	AS	Condition_Abatement_Range_Low_System
,	null	AS	Condition_Abatement_Range_Low_Unit
,	null	AS	Condition_Abatement_Range_Low_Value
,	null	AS	Condition_AbatementString
,	case when dx.PROVIDERID is null then null else 'Practitioner/'||dx.PROVIDERID end	AS	Condition_Asserter
,	null	AS	Condition_BodySite_Coding_Code
,	null	AS	Condition_BodySite_Coding_Display
,	null	AS	Condition_BodySite_Coding_System
,	null	AS	Condition_BodySite_Coding_Usrslt
,	null	AS	Condition_BodySite_Coding_Version
,	null	AS	Condition_BodySite_Text
,	'encounter-diagnosis'	AS	Condition_Category_Coding_Code
,	'Encounter Diagnosis'	AS	Condition_Category_Coding_Display
,	'https://www.hl7.org/fhir/valueset-condition-category'	AS	Condition_Category_Coding_System
,	null	AS	Condition_Category_Coding_Usrslt
,	null	AS	Condition_Category_Coding_Version
,	null	AS	Condition_Category_Text
,	null	AS	Condition_ClinicalStatus_Coding_Code
,	null	AS	Condition_ClinicalStatus_Coding_Display
,	null	AS	Condition_ClinicalStatus_Coding_System
,	null	AS	Condition_ClinicalStatus_Coding_Usrslt
,	null	AS	Condition_ClinicalStatus_Coding_Version
,	null	AS	Condition_ClinicalStatus_Text
,	dx.DX	AS	Condition_Code_Coding_Code
,	dx.RAW_DX	AS	Condition_Code_Coding_Display
,	case
		when dx.DX_TYPE = '09' then	'http://hl7.org/fhir/sid/icd-9-cm'
		when dx.DX_TYPE = '10' then 'http://hl7.org/fhir/sid/icd-10-cm'
		when dx.DX_TYPE = '11' then 'http://hl7.org/fhir/sid/icd-11-cm'
		when dx.DX_TYPE = 'SM' then 'http://snomed.info/sct'
	end 	AS	Condition_Code_Coding_System
,	null	AS	Condition_Code_Coding_Usrslt
,	null	AS	Condition_Code_Coding_Version
,	null	AS	Condition_Code_Text
,	case
	    when dx.ENCOUNTERID is null then null
	    else 'Encounter/' || dx.ENCOUNTERID
	end   	AS	Condition_Enc
,	null	AS	Condition_Evidence_Code_Coding_Code
,	null	AS	Condition_Evidence_Code_Coding_Display
,	null	AS	Condition_Evidence_Code_Coding_System
,	null	AS	Condition_Evidence_Code_Coding_Usrslt
,	null	AS	Condition_Evidence_Code_Coding_Version
,	null	AS	Condition_Evidence_Code_Text
,	null	AS	Condition_Evidence_Detail
,	null	AS	Condition_Id_Assigner
,	null	AS	Condition_Id_Period_End
,	null	AS	Condition_Id_Period_Start
,	null	AS	Condition_Id_System
,	null	AS	Condition_Id_Type_Coding_Code
,	null	AS	Condition_Id_Type_Coding_Display
,	null	AS	Condition_Id_Type_Coding_System
,	null	AS	Condition_Id_Type_Coding_Usrslt
,	null	AS	Condition_Id_Type_Coding_Version
,	null	AS	Condition_Id_Type_Text
,	'secondary'	AS	Condition_Id_Use_Code
,	dx.DIAGNOSISID	AS	Condition_Id_Value
,	null	AS	Condition_Note_AuthorReference
,	null	AS	Condition_Note_AuthorString
,	null	AS	Condition_Note_Text
,	null	AS	Condition_Note_Time
,	null	AS	Condition_On
,	null	AS	Condition_OnDateTime
,	null	AS	Condition_On_Period_End
,	null	AS	Condition_On_Period_Start
,	null	AS	Condition_On_Range_High_Code
,	null	AS	Condition_On_Range_High_Compartr_Code
,	null	AS	Condition_On_Range_High_System
,	null	AS	Condition_On_Range_High_Unit
,	null	AS	Condition_On_Range_High_Value
,	null	AS	Condition_On_Range_Low_Code
,	null	AS	Condition_On_Range_Low_Compartr_Code
,	null	AS	Condition_On_Range_Low_System
,	null	AS	Condition_On_Range_Low_Unit
,	null	AS	Condition_On_Range_Low_Value
,	null	AS	Condition_OnString
,	to_char(dx.admit_date, 'YYYY-MM-DD')	AS	Condition_RecordedDate
,	null	AS	Condition_Recorder
,	null	AS	Condition_Severity_Coding_Code
,	null	AS	Condition_Severity_Coding_Display
,	null	AS	Condition_Severity_Coding_System
,	null	AS	Condition_Severity_Coding_Usrslt
,	null	AS	Condition_Severity_Coding_Version
,	null	AS	Condition_Severity_Text
,	null	AS	Condition_Stage_Assessment
,	null	AS	Condition_Stage_Summary_Coding_Code
,	null	AS	Condition_Stage_Summary_Coding_Display
,	null	AS	Condition_Stage_Summary_Coding_System
,	null	AS	Condition_Stage_Summary_Coding_Usrslt
,	null	AS	Condition_Stage_Summary_Coding_Version
,	null	AS	Condition_Stage_Summary_Text
,	null	AS	Condition_Stage_Type_Coding_Code
,	null	AS	Condition_Stage_Type_Coding_Display
,	null	AS	Condition_Stage_Type_Coding_System
,	null	AS	Condition_Stage_Type_Coding_Usrslt
,	null	AS	Condition_Stage_Type_Coding_Version
,	null	AS	Condition_Stage_Type_Text
,	'Patient/'||dx.PATID	AS	Condition_Subject
,	null	AS	Condition_VerificationStatus_Coding_Code
,	null	AS	Condition_VerificationStatus_Coding_Display
,	null	AS	Condition_VerificationStatus_Coding_System
,	null	AS	Condition_VerificationStatus_Coding_Usrslt
,	null	AS	Condition_VerificationStatus_Coding_Version
,	null	AS	Condition_VerificationStatus_Text


from DIAGNOSIS  dx
)
/
CREATE VIEW CAMPFHIR_VIEW_DEVICEMETRIC ( ID, DEVMET_TYPE, DEVMET_UNIT, DEVMET_SOURCE_REF, DEVMET_PARENT_REF, DEVMET_OPERATIONALSTATUS, DEVMET_COLOR, DEVMET_CATEGORY, DEVMET_MEASUREMENTPERIOD, DEVMET_CALIBRATION, DEVMET_CALIBRATION_TYPE, DEVMET_CALIBRATION_STATE, DEVMET_CALIBRATION_TIME )
BEQUEATH DEFINER AS
SELECT
-- Can be used as a foreign key to connect to 'Device'
    null    AS ID,
null as DEVMET_TYPE,
null as DEVMET_UNIT,
null as DEVMET_SOURCE_REF,
-- Allows for a hierarchy to be created.
null as DEVMET_PARENT_REF,
null as DEVMET_OPERATIONALSTATUS,
null as DEVMET_COLOR,
null as DEVMET_CATEGORY,
null as DEVMET_MEASUREMENTPERIOD,
null as DEVMET_CALIBRATION,
null as DEVMET_CALIBRATION_TYPE,
null as DEVMET_CALIBRATION_STATE,
null as DEVMET_CALIBRATION_TIME
from dual
/
CREATE VIEW CAMPFHIR_VIEW_DEVICEDEFINITION ( ID, DEVDEF_ID, DEVDEF_UDIDEVICEIDENTIFIER, DEVDEF_UDIID_DEVICEIDENTIFIER, DEVDEF_UDIID_ISSUER, DEVDEF_UDIID_JURISDICTION, DEVDEF_MANUFACTURER_X, DEVDEF_MANUFACTURERSTRING, DEVDEF_MANUFACTURERREFERENCE, DEVDEF_DEVICENAME, DEVDEF_DEVICENAME_NAME, DEVDEF_DEVICENAME_TYPE, DEVDEF_MODELNUMBER, DEVDEF_TYPE, DEVDEF_SPECIALIZATION, DEVDEF_SPECIALIZATION_SYSTEMTP, DEVDEF_SPECIALIZATION_VERSION, DEVDEF_VERSION, DEVDEF_SAFETY, DEVDEF_SHELFLIFESTORAGE, DEVDEF_PHYSICALCHARACTERISTICS, DEVDEF_LANGUAGECODE, DEVDEF_CAPABILITY, DEVDEF_CAPABILITY_TYPE, DEVDEF_CAPABILITY_DESCRIPTION, DEVDEF_PROPERTY, DEVDEF_PROPERTY_TYPE, DEVDEF_PROPERTY_VALUEQUANTITY, DEVDEF_PROPERTY_VALUECODE, DEVDEF_OWNER_REF, DEVDEF_CONTACT, DEVDEF_URL, DEVDEF_ONLINEINFORMATION, DEVDEF_NOTE, DEVDEF_QUANTITY, DEVDEF_PARENTDEVICE, DEVDEF_MATERIAL, DEVDEF_MATERIAL_SUBSTANCE, DEVDEF_MATERIAL_ALTERNATE, DEVDEF_MATERIAL_ALLERGININDIC )
BEQUEATH DEFINER AS
select
    null    AS ID
,null as DEVDEF_ID,
null as DEVDEF_UDIDEVICEIDENTIFIER,
null as DEVDEF_UDIID_DEVICEIDENTIFIER,
null as DEVDEF_UDIID_ISSUER,
null as DEVDEF_UDIID_JURISDICTION,
null as DEVDEF_MANUFACTURER_X,
null as DEVDEF_MANUFACTURERSTRING,
null as DEVDEF_MANUFACTURERREFERENCE,
null as DEVDEF_DEVICENAME,
null as DEVDEF_DEVICENAME_NAME,
null as DEVDEF_DEVICENAME_TYPE,
null as DEVDEF_MODELNUMBER,
null as DEVDEF_TYPE,
null as DEVDEF_SPECIALIZATION,
null as DEVDEF_SPECIALIZATION_SYSTEMTP,
null as DEVDEF_SPECIALIZATION_VERSION,
null as DEVDEF_VERSION,
null as DEVDEF_SAFETY,
null as DEVDEF_SHELFLIFESTORAGE,
null as DEVDEF_PHYSICALCHARACTERISTICS,
null as DEVDEF_LANGUAGECODE,
null as DEVDEF_CAPABILITY,
null as DEVDEF_CAPABILITY_TYPE,
null as DEVDEF_CAPABILITY_DESCRIPTION,
null as DEVDEF_PROPERTY,
null as DEVDEF_PROPERTY_TYPE,
null as DEVDEF_PROPERTY_VALUEQUANTITY,
null as DEVDEF_PROPERTY_VALUECODE,
null as DEVDEF_OWNER_REF,
null as DEVDEF_CONTACT,
null as DEVDEF_URL,
null as DEVDEF_ONLINEINFORMATION,
null as DEVDEF_NOTE,
null as DEVDEF_QUANTITY,
null as DEVDEF_PARENTDEVICE,
null as DEVDEF_MATERIAL,
null as DEVDEF_MATERIAL_SUBSTANCE,
null as DEVDEF_MATERIAL_ALTERNATE,
null as DEVDEF_MATERIAL_ALLERGININDIC

from dual
/
CREATE VIEW CAMPFHIR_VIEW_DEVICE ( ID, DEVICE_CONTACT_PERIOD_END, DEVICE_CONTACT_PERIOD_START, DEVICE_CONTACT_RANK, DEVICE_CONTACT_SYSTEM_CODE, DEVICE_CONTACT_USE_CODE, DEVICE_CONTACT_VALUE, DEVICE_DEFINITION, DEVICE_DEVICENAME_NAME, DEVICE_DEVICENAME_TYPE_CODE, DEVICE_DISTINCTID, DEVICE_EXPIRATIONDATE, DEVICE_ID_ASSIGNER, DEVICE_ID_PERIOD_END, DEVICE_ID_PERIOD_START, DEVICE_ID_SYSTEM, DEVICE_ID_TYPE_CODING_CODE, DEVICE_ID_TYPE_CODING_DISPLAY, DEVICE_ID_TYPE_CODING_SYSTEM, DEVICE_ID_TYPE_CODING_USRSLT, DEVICE_ID_TYPE_CODING_VERSION, DEVICE_ID_TYPE_TEXT, DEVICE_ID_USE_CODE, DEVICE_ID_VALUE, DEVICE_LOCATION, DEVICE_LOTNUMBER, DEVICE_MANUFACTUREDATE, DEVICE_MANUFACTURER, DEVICE_MODELNUMBER, DEVICE_NOTE_AUTHORREFERENCE, DEVICE_NOTE_AUTHORSTRING, DEVICE_NOTE_TEXT, DEVICE_NOTE_TIME, DEVICE_OWNER, DEVICE_PARENT, DEVICE_PARTNUMBER, DEVICE_PATIENT, DEVICE_PROPERTY_TYPE_CODING_CODE, DEVICE_PROPERTY_TYPE_CODING_DISPLAY, DEVICE_PROPERTY_TYPE_CODING_SYSTEM, DEVICE_PROPERTY_TYPE_CODING_USRSLT, DEVICE_PROPERTY_TYPE_CODING_VERSION, DEVICE_PROPERTY_TYPE_TEXT, DEVICE_PROPERTY_VALUECODE_CODING_CODE, DEVICE_PROPERTY_VALUECODE_CODING_DISPLAY, DEVICE_PROPERTY_VALUECODE_CODING_SYSTEM, DEVICE_PROPERTY_VALUECODE_CODING_USRSLT, DEVICE_PROPERTY_VALUECODE_CODING_VERSION, DEVICE_PROPERTY_VALUECODE_TEXT, DEVICE_PROPERTY_VALUEQUANTITY_CODE, DEVICE_PROPERTY_VALUEQUANTITY_COMPARTR_CODE, DEVICE_PROPERTY_VALUEQUANTITY_SYSTEM, DEVICE_PROPERTY_VALUEQUANTITY_UNIT, DEVICE_PROPERTY_VALUEQUANTITY_VALUE, DEVICE_SAFETY_CODING_CODE, DEVICE_SAFETY_CODING_DISPLAY, DEVICE_SAFETY_CODING_SYSTEM, DEVICE_SAFETY_CODING_USRSLT, DEVICE_SAFETY_CODING_VERSION, DEVICE_SAFETY_TEXT, DEVICE_SERIALNUMBER, DEVICE_SPECIALIZATION_SYSTEMTYPE_CODING_CODE, DEVICE_SPECIALIZATION_SYSTEMTYPE_CODING_DISPLAY, DEVICE_SPECIALIZATION_SYSTEMTYPE_CODING_SYSTEM, DEVICE_SPECIALIZATION_SYSTEMTYPE_CODING_USRSLT, DEVICE_SPECIALIZATION_SYSTEMTYPE_CODING_VERSION, DEVICE_SPECIALIZATION_SYSTEMTYPE_TEXT, DEVICE_SPECIALIZATION_VERSION, DEVICE_STATUS_CODE, DEVICE_STATUSREASON_CODING_CODE, DEVICE_STATUSREASON_CODING_DISPLAY, DEVICE_STATUSREASON_CODING_SYSTEM, DEVICE_STATUSREASON_CODING_USRSLT, DEVICE_STATUSREASON_CODING_VERSION, DEVICE_STATUSREASON_TEXT, DEVICE_TYPE_CODING_CODE, DEVICE_TYPE_CODING_DISPLAY, DEVICE_TYPE_CODING_SYSTEM, DEVICE_TYPE_CODING_USRSLT, DEVICE_TYPE_CODING_VERSION, DEVICE_TYPE_TEXT, DEVICE_UDICARRIER_CARRIERAIDC, DEVICE_UDICARRIER_CARRIERHRF, DEVICE_UDICARRIER_DEVICEID, DEVICE_UDICARRIER_ENTRYTYPE_CODE, DEVICE_UDICARRIER_ISSUER, DEVICE_UDICARRIER_JURISDICTION, DEVICE_URL, DEVICE_VERSION_COMPONENT_ASSIGNER, DEVICE_VERSION_COMPONENT_PERIOD_END, DEVICE_VERSION_COMPONENT_PERIOD_START, DEVICE_VERSION_COMPONENT_SYSTEM, DEVICE_VERSION_COMPONENT_TYPE_CODING_CODE, DEVICE_VERSION_COMPONENT_TYPE_CODING_DISPLAY, DEVICE_VERSION_COMPONENT_TYPE_CODING_SYSTEM, DEVICE_VERSION_COMPONENT_TYPE_CODING_USRSLT, DEVICE_VERSION_COMPONENT_TYPE_CODING_VERSION, DEVICE_VERSION_COMPONENT_TYPE_TEXT, DEVICE_VERSION_COMPONENT_USE_CODE, DEVICE_VERSION_COMPONENT_VALUE, DEVICE_VERSION_TYPE_CODING_CODE, DEVICE_VERSION_TYPE_CODING_DISPLAY, DEVICE_VERSION_TYPE_CODING_SYSTEM, DEVICE_VERSION_TYPE_CODING_USRSLT, DEVICE_VERSION_TYPE_CODING_VERSION, DEVICE_VERSION_TYPE_TEXT, DEVICE_VERSION_VALUE )
BEQUEATH DEFINER AS
select
	null	AS	id
,	null	AS	Device_Contact_Period_End
,	null	AS	Device_Contact_Period_Start
,	null	AS	Device_Contact_Rank
,	null	AS	Device_Contact_System_Code
,	null	AS	Device_Contact_Use_Code
,	null	AS	Device_Contact_Value
,	null	AS	Device_Definition
,	null	AS	Device_DeviceName_Name
,	null	AS	Device_DeviceName_Type_Code
,	null	AS	Device_DistinctId
,	null	AS	Device_ExpirationDate
,	null	AS	Device_Id_Assigner
,	null	AS	Device_Id_Period_End
,	null	AS	Device_Id_Period_Start
,	null	AS	Device_Id_System
,	null	AS	Device_Id_Type_Coding_Code
,	null	AS	Device_Id_Type_Coding_Display
,	null	AS	Device_Id_Type_Coding_System
,	null	AS	Device_Id_Type_Coding_Usrslt
,	null	AS	Device_Id_Type_Coding_Version
,	null	AS	Device_Id_Type_Text
,	null	AS	Device_Id_Use_Code
,	null	AS	Device_Id_Value
,	null	AS	Device_Location
,	null	AS	Device_LotNumber
,	null	AS	Device_ManufactureDate
,	null	AS	Device_Manufacturer
,	null	AS	Device_ModelNumber
,	null	AS	Device_Note_AuthorReference
,	null	AS	Device_Note_AuthorString
,	null	AS	Device_Note_Text
,	null	AS	Device_Note_Time
,	null	AS	Device_Owner
,	null	AS	Device_Parent
,	null	AS	Device_PartNumber
,	null	AS	Device_Patient
,	null	AS	Device_Property_Type_Coding_Code
,	null	AS	Device_Property_Type_Coding_Display
,	null	AS	Device_Property_Type_Coding_System
,	null	AS	Device_Property_Type_Coding_Usrslt
,	null	AS	Device_Property_Type_Coding_Version
,	null	AS	Device_Property_Type_Text
,	null	AS	Device_Property_ValueCode_Coding_Code
,	null	AS	Device_Property_ValueCode_Coding_Display
,	null	AS	Device_Property_ValueCode_Coding_System
,	null	AS	Device_Property_ValueCode_Coding_Usrslt
,	null	AS	Device_Property_ValueCode_Coding_Version
,	null	AS	Device_Property_ValueCode_Text
,	null	AS	Device_Property_ValueQuantity_Code
,	null	AS	Device_Property_ValueQuantity_Compartr_Code
,	null	AS	Device_Property_ValueQuantity_System
,	null	AS	Device_Property_ValueQuantity_Unit
,	null	AS	Device_Property_ValueQuantity_Value
,	null	AS	Device_Safety_Coding_Code
,	null	AS	Device_Safety_Coding_Display
,	null	AS	Device_Safety_Coding_System
,	null	AS	Device_Safety_Coding_Usrslt
,	null	AS	Device_Safety_Coding_Version
,	null	AS	Device_Safety_Text
,	null	AS	Device_SerialNumber
,	null	AS	Device_Specialization_SystemType_Coding_Code
,	null	AS	Device_Specialization_SystemType_Coding_Display
,	null	AS	Device_Specialization_SystemType_Coding_System
,	null	AS	Device_Specialization_SystemType_Coding_Usrslt
,	null	AS	Device_Specialization_SystemType_Coding_Version
,	null	AS	Device_Specialization_SystemType_Text
,	null	AS	Device_Specialization_Version
,	null	AS	Device_Status_Code
,	null	AS	Device_StatusReason_Coding_Code
,	null	AS	Device_StatusReason_Coding_Display
,	null	AS	Device_StatusReason_Coding_System
,	null	AS	Device_StatusReason_Coding_Usrslt
,	null	AS	Device_StatusReason_Coding_Version
,	null	AS	Device_StatusReason_Text
,	null	AS	Device_Type_Coding_Code
,	null	AS	Device_Type_Coding_Display
,	null	AS	Device_Type_Coding_System
,	null	AS	Device_Type_Coding_Usrslt
,	null	AS	Device_Type_Coding_Version
,	null	AS	Device_Type_Text
,	null	AS	Device_UdiCarrier_CarrierAIDC
,	null	AS	Device_UdiCarrier_CarrierHRF
,	null	AS	Device_UdiCarrier_DeviceId
,	null	AS	Device_UdiCarrier_EntryType_Code
,	null	AS	Device_UdiCarrier_Issuer
,	null	AS	Device_UdiCarrier_Jurisdiction
,	null	AS	Device_Url
,	null	AS	Device_Version_Component_Assigner
,	null	AS	Device_Version_Component_Period_End
,	null	AS	Device_Version_Component_Period_Start
,	null	AS	Device_Version_Component_System
,	null	AS	Device_Version_Component_Type_Coding_Code
,	null	AS	Device_Version_Component_Type_Coding_Display
,	null	AS	Device_Version_Component_Type_Coding_System
,	null	AS	Device_Version_Component_Type_Coding_Usrslt
,	null	AS	Device_Version_Component_Type_Coding_Version
,	null	AS	Device_Version_Component_Type_Text
,	null	AS	Device_Version_Component_Use_Code
,	null	AS	Device_Version_Component_Value
,	null	AS	Device_Version_Type_Coding_Code
,	null	AS	Device_Version_Type_Coding_Display
,	null	AS	Device_Version_Type_Coding_System
,	null	AS	Device_Version_Type_Coding_Usrslt
,	null	AS	Device_Version_Type_Coding_Version
,	null	AS	Device_Version_Type_Text
,	null	AS	Device_Version_Value

from dual
/
CREATE VIEW CAMPFHIR_VIEW_PRACTITIONER ( ID, PRACT_ACTIVE, PRACT_ADDRESS_CITY, PRACT_ADDRESS_COUNTRY, PRACT_ADDRESS_DISTRICT, PRACT_ADDRESS_LINE, PRACT_ADDRESS_PERIOD_END, PRACT_ADDRESS_PERIOD_START, PRACT_ADDRESS_POSTALCODE, PRACT_ADDRESS_STATE, PRACT_ADDRESS_TEXT, PRACT_ADDRESS_TYPE_CODE, PRACT_ADDRESS_USE_CODE, PRACT_BIRTHDATE, PRACT_COMMN_CODING_CODE, PRACT_COMMN_CODING_DISPLAY, PRACT_COMMN_CODING_SYSTEM, PRACT_COMMN_CODING_USRSLT, PRACT_COMMN_CODING_VERSION, PRACT_COMMN_TEXT, PRACT_GENDER_CODE, PRACT_ID_ASSIGNER, PRACT_ID_PERIOD_END, PRACT_ID_PERIOD_START, PRACT_ID_SYSTEM, PRACT_ID_TYPE_CODING_CODE, PRACT_ID_TYPE_CODING_DISPLAY, PRACT_ID_TYPE_CODING_SYSTEM, PRACT_ID_TYPE_CODING_USRSLT, PRACT_ID_TYPE_CODING_VERSION, PRACT_ID_TYPE_TEXT, PRACT_ID_USE_CODE, PRACT_ID_VALUE, PRACT_NAME_FAMILY, PRACT_NAME_GIVEN, PRACT_NAME_PERIOD_END, PRACT_NAME_PERIOD_START, PRACT_NAME_PREFIX, PRACT_NAME_SUFFIX, PRACT_NAME_TEXT, PRACT_NAME_USE_CODE, PRACT_PHOTO_CONTENTTYPE, PRACT_PHOTO_CREATION, PRACT_PHOTO_DATA, PRACT_PHOTO_HASH, PRACT_PHOTO_LANG, PRACT_PHOTO_SIZE, PRACT_PHOTO_TITLE, PRACT_PHOTO_URL, PRACT_QUALIFICATION_CODE_CODING_CODE, PRACT_QUALIFICATION_CODE_CODING_DISPLAY, PRACT_QUALIFICATION_CODE_CODING_SYSTEM, PRACT_QUALIFICATION_CODE_CODING_USRSLT, PRACT_QUALIFICATION_CODE_CODING_VERSION, PRACT_QUALIFICATION_CODE_TEXT, PRACT_QUALIFICATION_ID_ASSIGNER, PRACT_QUALIFICATION_ID_PERIOD_END, PRACT_QUALIFICATION_ID_PERIOD_START, PRACT_QUALIFICATION_ID_SYSTEM, PRACT_QUALIFICATION_ID_TYPE_CODING_CODE, PRACT_QUALIFICATION_ID_TYPE_CODING_DISPLAY, PRACT_QUALIFICATION_ID_TYPE_CODING_SYSTEM, PRACT_QUALIFICATION_ID_TYPE_CODING_USRSLT, PRACT_QUALIFICATION_ID_TYPE_CODING_VERSION, PRACT_QUALIFICATION_ID_TYPE_TEXT, PRACT_QUALIFICATION_ID_USE_CODE, PRACT_QUALIFICATION_ID_VALUE, PRACT_QUALIFICATION_ISSUER, PRACT_QUALIFICATION_PERIOD_END, PRACT_QUALIFICATION_PERIOD_START, PRACT_TELECOM_PERIOD_END, PRACT_TELECOM_PERIOD_START, PRACT_TELECOM_RANK, PRACT_TELECOM_SYSTEM_CODE, PRACT_TELECOM_USE_CODE, PRACT_TELECOM_VALUE )
BEQUEATH DEFINER AS
(

select distinct
pro.PROVIDERID as id,
null as Pract_Active,
null as Pract_Address_City,
null as Pract_Address_Country,
null as Pract_Address_District,
null as Pract_Address_Line,
null as Pract_Address_Period_End,
null as Pract_Address_Period_Start,
null as Pract_Address_PostalCode,
null as Pract_Address_State,
null as Pract_Address_Text,
null as Pract_Address_Type_Code,
null as Pract_Address_Use_Code,
null as Pract_BirthDate,
null as Pract_Commn_Coding_Code,
null as Pract_Commn_Coding_Display,
null as Pract_Commn_Coding_System,
null as Pract_Commn_Coding_Usrslt,
null as Pract_Commn_Coding_Version,
null as Pract_Commn_Text,
nvl(cmv1.FHIR_OUT_CODE, null) as Pract_Gender_Code,
null as Pract_Id_Assigner,
null as Pract_Id_Period_End,
null as Pract_Id_Period_Start,
null as Pract_Id_System,
null as Pract_Id_Type_Coding_Code,
null as Pract_Id_Type_Coding_Display,
null as Pract_Id_Type_Coding_System,
null as Pract_Id_Type_Coding_Usrslt,
null as Pract_Id_Type_Coding_Version,
null as Pract_Id_Type_Text,
'secondary' as Pract_Id_Use_Code,
pro.PROVIDERID as Pract_Id_Value,
null as Pract_Name_Family,
null as Pract_Name_Given,
null as Pract_Name_Period_End,
null as Pract_Name_Period_Start,
null as Pract_Name_Prefix,
null as Pract_Name_Suffix,
null as Pract_Name_Text,
null as Pract_Name_Use_Code,
null as Pract_Photo_ContentType,
null as Pract_Photo_Creation,
null as Pract_Photo_Data,
null as Pract_Photo_Hash,
null as Pract_Photo_Lang,
null as Pract_Photo_Size,
null as Pract_Photo_Title,
null as Pract_Photo_Url,
null as Pract_Qualification_Code_Coding_Code,
null as Pract_Qualification_Code_Coding_Display,
null as Pract_Qualification_Code_Coding_System,
null as Pract_Qualification_Code_Coding_Usrslt,
null as Pract_Qualification_Code_Coding_Version,
null as Pract_Qualification_Code_Text,
null as Pract_Qualification_Id_Assigner,
null as Pract_Qualification_Id_Period_End,
null as Pract_Qualification_Id_Period_Start,
null as Pract_Qualification_Id_System,
null as Pract_Qualification_Id_Type_Coding_Code,
null as Pract_Qualification_Id_Type_Coding_Display,
null as Pract_Qualification_Id_Type_Coding_System,
null as Pract_Qualification_Id_Type_Coding_Usrslt,
null as Pract_Qualification_Id_Type_Coding_Version,
null as Pract_Qualification_Id_Type_Text,
null as Pract_Qualification_Id_Use_Code,
null as Pract_Qualification_Id_Value,
null as Pract_Qualification_Issuer,
null as Pract_Qualification_Period_End,
null as Pract_Qualification_Period_Start,
null as Pract_Telecom_Period_End,
null as Pract_Telecom_Period_Start,
null as Pract_Telecom_Rank,
null as Pract_Telecom_System_Code,
null as Pract_Telecom_Use_Code,
null as Pract_Telecom_Value
from PROVIDER pro
left join CAMPFHIR_MAPPING_VALUESET cmv1 on cmv1.local_column='PROVIDER_SEX' and pro.PROVIDER_SEX=cmv1.local_in_code
)
/
CREATE VIEW CAMPFHIR_VIEW_PROCEDURE ( ID, PROCEDURE_ASSERTER, PROCEDURE_BASEDON, PROCEDURE_BODYSITE_CODING_CODE, PROCEDURE_BODYSITE_CODING_DISPLAY, PROCEDURE_BODYSITE_CODING_SYSTEM, PROCEDURE_BODYSITE_CODING_USRSLT, PROCEDURE_BODYSITE_CODING_VERSION, PROCEDURE_BODYSITE_TEXT, PROCEDURE_CATEGORY_CODING_CODE, PROCEDURE_CATEGORY_CODING_DISPLAY, PROCEDURE_CATEGORY_CODING_SYSTEM, PROCEDURE_CATEGORY_CODING_USRSLT, PROCEDURE_CATEGORY_CODING_VERSION, PROCEDURE_CATEGORY_TEXT, PROCEDURE_CODE_CODING_CODE, PROCEDURE_CODE_CODING_DISPLAY, PROCEDURE_CODE_CODING_SYSTEM, PROCEDURE_CODE_CODING_USRSLT, PROCEDURE_CODE_CODING_VERSION, PROCEDURE_CODE_TEXT, PROCEDURE_COMPLICATION_CODING_CODE, PROCEDURE_COMPLICATION_CODING_DISPLAY, PROCEDURE_COMPLICATION_CODING_SYSTEM, PROCEDURE_COMPLICATION_CODING_USRSLT, PROCEDURE_COMPLICATION_CODING_VERSION, PROCEDURE_COMPLICATION_TEXT, PROCEDURE_COMPLICATIONDETAIL, PROCEDURE_ENC, PROCEDURE_FOCALDEVICE_ACTION_CODING_CODE, PROCEDURE_FOCALDEVICE_ACTION_CODING_DISPLAY, PROCEDURE_FOCALDEVICE_ACTION_CODING_SYSTEM, PROCEDURE_FOCALDEVICE_ACTION_CODING_USRSLT, PROCEDURE_FOCALDEVICE_ACTION_CODING_VERSION, PROCEDURE_FOCALDEVICE_ACTION_TEXT, PROCEDURE_FOCALDEVICE_MANIPULATED, PROCEDURE_FOLLOWUP_CODING_CODE, PROCEDURE_FOLLOWUP_CODING_DISPLAY, PROCEDURE_FOLLOWUP_CODING_SYSTEM, PROCEDURE_FOLLOWUP_CODING_USRSLT, PROCEDURE_FOLLOWUP_CODING_VERSION, PROCEDURE_FOLLOWUP_TEXT, PROCEDURE_ID_ASSIGNER, PROCEDURE_ID_PERIOD_END, PROCEDURE_ID_PERIOD_START, PROCEDURE_ID_SYSTEM, PROCEDURE_ID_TYPE_CODING_CODE, PROCEDURE_ID_TYPE_CODING_DISPLAY, PROCEDURE_ID_TYPE_CODING_SYSTEM, PROCEDURE_ID_TYPE_CODING_USRSLT, PROCEDURE_ID_TYPE_CODING_VERSION, PROCEDURE_ID_TYPE_TEXT, PROCEDURE_ID_USE_CODE, PROCEDURE_ID_VALUE, PROCEDURE_INSTANTIATESCANONICAL, PROCEDURE_INSTANTIATESURI, PROCEDURE_LOCATION, PROCEDURE_NOTE_AUTHORREFERENCE, PROCEDURE_NOTE_AUTHORSTRING, PROCEDURE_NOTE_TEXT, PROCEDURE_NOTE_TIME, PROCEDURE_OUTCOME_CODING_CODE, PROCEDURE_OUTCOME_CODING_DISPLAY, PROCEDURE_OUTCOME_CODING_SYSTEM, PROCEDURE_OUTCOME_CODING_USRSLT, PROCEDURE_OUTCOME_CODING_VERSION, PROCEDURE_OUTCOME_TEXT, PROCEDURE_PARTOF, PROCEDURE_PERFORMED, PROCEDURE_PERFORMEDDATETIME, PROCEDURE_PERFORMED_PERIOD_END, PROCEDURE_PERFORMED_PERIOD_START, PROCEDURE_PERFORMED_RANGE_HIGH_CODE, PROCEDURE_PERFORMED_RANGE_HIGH_COMPARTR_CODE, PROCEDURE_PERFORMED_RANGE_HIGH_SYSTEM, PROCEDURE_PERFORMED_RANGE_HIGH_UNIT, PROCEDURE_PERFORMED_RANGE_HIGH_VALUE, PROCEDURE_PERFORMED_RANGE_LOW_CODE, PROCEDURE_PERFORMED_RANGE_LOW_COMPARTR_CODE, PROCEDURE_PERFORMED_RANGE_LOW_SYSTEM, PROCEDURE_PERFORMED_RANGE_LOW_UNIT, PROCEDURE_PERFORMED_RANGE_LOW_VALUE, PROCEDURE_PERFORMEDSTRING, PROCEDURE_PERFORMER_ACTOR, PROCEDURE_PERFORMER_FUNCTION_CODING_CODE, PROCEDURE_PERFORMER_FUNCTION_CODING_DISPLAY, PROCEDURE_PERFORMER_FUNCTION_CODING_SYSTEM, PROCEDURE_PERFORMER_FUNCTION_CODING_USRSLT, PROCEDURE_PERFORMER_FUNCTION_CODING_VERSION, PROCEDURE_PERFORMER_FUNCTION_TEXT, PROCEDURE_PERFORMER_ONBEHALFOF, PROCEDURE_REASONCODE_CODING_CODE, PROCEDURE_REASONCODE_CODING_DISPLAY, PROCEDURE_REASONCODE_CODING_SYSTEM, PROCEDURE_REASONCODE_CODING_USRSLT, PROCEDURE_REASONCODE_CODING_VERSION, PROCEDURE_REASONCODE_TEXT, PROCEDURE_REASONREFERENCE, PROCEDURE_RECORDER, PROCEDURE_REPORT, PROCEDURE_STATUS_CODE, PROCEDURE_STATUSREASON_CODING_CODE, PROCEDURE_STATUSREASON_CODING_DISPLAY, PROCEDURE_STATUSREASON_CODING_SYSTEM, PROCEDURE_STATUSREASON_CODING_USRSLT, PROCEDURE_STATUSREASON_CODING_VERSION, PROCEDURE_STATUSREASON_TEXT, PROCEDURE_SUBJECT, PROCEDURE_USEDCODE_CODING_CODE, PROCEDURE_USEDCODE_CODING_DISPLAY, PROCEDURE_USEDCODE_CODING_SYSTEM, PROCEDURE_USEDCODE_CODING_USRSLT, PROCEDURE_USEDCODE_CODING_VERSION, PROCEDURE_USEDCODE_TEXT, PROCEDURE_USEDREFERENCE )
BEQUEATH DEFINER AS
(

select distinct
px.PROCEDURESID as id,
null as Procedure_Asserter,
null as Procedure_BasedOn,
null as Procedure_BodySite_Coding_Code,
null as Procedure_BodySite_Coding_Display,
null as Procedure_BodySite_Coding_System,
null as Procedure_BodySite_Coding_Usrslt,
null as Procedure_BodySite_Coding_Version,
null as Procedure_BodySite_Text,
null as Procedure_Category_Coding_Code,
null as Procedure_Category_Coding_Display,
null as Procedure_Category_Coding_System,
null as Procedure_Category_Coding_Usrslt,
null as Procedure_Category_Coding_Version,
null as Procedure_Category_Text,
px.PX as Procedure_Code_Coding_Code,
px.RAW_PX as Procedure_Code_Coding_Display,
case
		when px.PX_TYPE = '09' then	'http://hl7.org/fhir/sid/icd-9-cm/'
		when px.PX_TYPE = '10' then 'http://hl7.org/fhir/sid/icd-10-cm/'
		when px.PX_TYPE = '11' then 'http://hl7.org/fhir/sid/icd-11-cm/'
		when px.PX_TYPE = 'CH' then 'http://www.ama-assn.org/go/cpt/'
		when px.PX_TYPE = 'LC' then 'http://loinc.org/'
		when px.PX_TYPE = 'ND' then 'http://hl7.org/fhir/sid/ndc/'
		else null
end as Procedure_Code_Coding_System,
null as Procedure_Code_Coding_Usrslt,
null as Procedure_Code_Coding_Version,
null as Procedure_Code_Text,
null as Procedure_Complication_Coding_Code,
null as Procedure_Complication_Coding_Display,
null as Procedure_Complication_Coding_System,
null as Procedure_Complication_Coding_Usrslt,
null as Procedure_Complication_Coding_Version,
null as Procedure_Complication_Text,
null as Procedure_ComplicationDetail,
'Encounter/' || px.ENCOUNTERID as Procedure_Enc,
null as Procedure_FocalDevice_Action_Coding_Code,
null as Procedure_FocalDevice_Action_Coding_Display,
null as Procedure_FocalDevice_Action_Coding_System,
null as Procedure_FocalDevice_Action_Coding_Usrslt,
null as Procedure_FocalDevice_Action_Coding_Version,
null as Procedure_FocalDevice_Action_Text,
null as Procedure_FocalDevice_Manipulated,
null as Procedure_FollowUp_Coding_Code,
null as Procedure_FollowUp_Coding_Display,
null as Procedure_FollowUp_Coding_System,
null as Procedure_FollowUp_Coding_Usrslt,
null as Procedure_FollowUp_Coding_Version,
null as Procedure_FollowUp_Text,
null as Procedure_Id_Assigner,
null as Procedure_Id_Period_End,
null as Procedure_Id_Period_Start,
null as Procedure_Id_System,
null as Procedure_Id_Type_Coding_Code,
null as Procedure_Id_Type_Coding_Display,
null as Procedure_Id_Type_Coding_System,
null as Procedure_Id_Type_Coding_Usrslt,
null as Procedure_Id_Type_Coding_Version,
null as Procedure_Id_Type_Text,
'secondary' as Procedure_Id_Use_Code,
px.PROCEDURESID as Procedure_Id_Value,
null as Procedure_InstantiatesCanonical,
null as Procedure_InstantiatesUri,
null as Procedure_Location,
null as Procedure_Note_AuthorReference,
null as Procedure_Note_AuthorString,
null as Procedure_Note_Text,
null as Procedure_Note_Time,
null as Procedure_Outcome_Coding_Code,
null as Procedure_Outcome_Coding_Display,
null as Procedure_Outcome_Coding_System,
null as Procedure_Outcome_Coding_Usrslt,
null as Procedure_Outcome_Coding_Version,
null as Procedure_Outcome_Text,
null as Procedure_PartOf,
null as Procedure_Performed,
to_char(px.PX_DATE, 'YYYY-MM-DD') as Procedure_PerformedDateTime,
null as Procedure_Performed_Period_End,
null as Procedure_Performed_Period_Start,
null as Procedure_Performed_Range_High_Code,
null as Procedure_Performed_Range_High_Compartr_Code,
null as Procedure_Performed_Range_High_System,
null as Procedure_Performed_Range_High_Unit,
null as Procedure_Performed_Range_High_Value,
null as Procedure_Performed_Range_Low_Code,
null as Procedure_Performed_Range_Low_Compartr_Code,
null as Procedure_Performed_Range_Low_System,
null as Procedure_Performed_Range_Low_Unit,
null as Procedure_Performed_Range_Low_Value,
null as Procedure_PerformedString,
case
	 when px.PROVIDERID is null then null else 'Practitioner/'||px.PROVIDERID
end as Procedure_Performer_Actor,
null as Procedure_Performer_Function_Coding_Code,
null as Procedure_Performer_Function_Coding_Display,
null as Procedure_Performer_Function_Coding_System,
null as Procedure_Performer_Function_Coding_Usrslt,
null as Procedure_Performer_Function_Coding_Version,
null as Procedure_Performer_Function_Text,
null as Procedure_Performer_OnBehalfOf,
null as Procedure_ReasonCode_Coding_Code,
null as Procedure_ReasonCode_Coding_Display,
null as Procedure_ReasonCode_Coding_System,
null as Procedure_ReasonCode_Coding_Usrslt,
null as Procedure_ReasonCode_Coding_Version,
null as Procedure_ReasonCode_Text,
null as Procedure_ReasonReference,
null as Procedure_Recorder,
null as Procedure_Report,
null as Procedure_Status_Code,
null as Procedure_StatusReason_Coding_Code,
null as Procedure_StatusReason_Coding_Display,
null as Procedure_StatusReason_Coding_System,
null as Procedure_StatusReason_Coding_Usrslt,
null as Procedure_StatusReason_Coding_Version,
null as Procedure_StatusReason_Text,
'Patient/' || px.PATID as Procedure_Subject,
null as Procedure_UsedCode_Coding_Code,
null as Procedure_UsedCode_Coding_Display,
null as Procedure_UsedCode_Coding_System,
null as Procedure_UsedCode_Coding_Usrslt,
null as Procedure_UsedCode_Coding_Version,
null as Procedure_UsedCode_Text,
null as Procedure_UsedReference

from procedures px
left join PRO_CM pro on px.ENCOUNTERID = pro.ENCOUNTERID
left join CONDITION con on px.ENCOUNTERID = con.ENCOUNTERID

)
/
