-- Creates a RDBMS view of the 'Device' FHIR resource
-- PCORNET does not have data for medical devices, so this is a work in progress.

create or replace view FHIR_VIEW_DEVICE as
select distinct
-- NESTcc request
null as DEV_ID,
null as DEV_DEFINITION_REF,
-- NESTcc request
null as DEV_UDICARRIER,
-- Mandatory string located on each device
null as DEV_UDICARRIER_ID,
null as DEV_UDICARRIER_ISSUER,
null as DEV_UDICARRIER_JURISDICTION,
null as DEV_UDICARRIER_CARRIERAIDC,
null as DEV_UDICARRIER_CARRIERHRF,
null as DEV_UDICARRIER_ENTRYTYPE,
-- NESTcc request
-- placeholder case for consistency purposes. Codebase concept
case
    when dual.DUMMY = 'active' then 'Active'
    when dual.DUMMY = 'inactive' then 'Inactive'
    when dual.DUMMY = 'entered-in-error' then 'Entered in Error'
    when dual.DUMMY = 'unknown' then 'Unknown'
    else null
end as DEV_STATUS,
null as DEV_STATUSREASON,
null as DEV_DISTINCTIDENTIFIER,
-- NESTcc request
null as DEV_MANUFACTURER,
-- NESTcc request
null as DEV_MANUFACTUREDATE,
null as DEV_EXPIRATIONDATE,
-- NESTcc request
null as DEV_LOTNUMBER,
-- NESTcc request
null as DEV_SERIALNUMBER,
-- NESTcc request
null as DEV_DEVICENAME,
null as DEV_DEVICENAME_NAME,
null as DEV_DEVICENAME_TYPE,
-- NESTcc request
null as DEV_MODELNUMBER,
null as DEV_PARTNUMBER,
-- NESTcc request
null as DEV_TYPE,
null as DEV_SPECIALIZATION,
null as DEV_SPECIALIZATION_SYSTEMTYPE,
null as DEV_SPECIALIZATION_VERSION,
null as DEV_VERSION,
null as DEV_VERSION_TYPE,
null as DEV_VERSION_COMPONENT,
null as DEV_VERSION_VALUE,
null as DEV_PROPERTY,
null as DEV_PROPERTY_TYPE,
null as DEV_PROPERTY_VALUEQUANTITY,
null as DEV_PROPERTY_VALUECODE,
null as DEV_PATIENT_REF,
null as DEV_OWNER_REF,
null as DEV_CONTACT,
null as DEV_LOCATION_REF,
null as DEV_URL,
null as DEV_NOTE,
null as DEV_SAFETY,
null as DEV_PARENT_REF
-- oracle dummy table
from dual
/
