-- Creates a RDBMS view of the 'Device Metric' FHIR resource
-- PCORNET does not have data for medical devices, so this is a work in progress.

create or replace view FHIR_VIEW_DEVICEMETRIC as
SELECT distinct
-- Can be used as a foreign key to connect to 'Device'
null as DEVMET_ID,
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
