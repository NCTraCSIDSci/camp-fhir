# CAMPFHIR Field Mapping Documentation
​
This document serves as a guide the the field mapping logic for mapping PCORnet Common Data Model (CDM) version 6.0 to FHIR version 4.0.
​
Currently, CAMPFHIR supports value set mapping for 44 PCORnet CDM fields. Of those, 7 are codeable concepts. The rest take the raw PCORnet value and map it to the corresponding CAMPFHIR column. This document explains the process taken to reach the conclusion that they are corresponding concepts. This
​
## PCORNET CDM
​
The current specifications for the PCORnet CDM are located [here](https://pcornet.org/data/).<a href="https://pcornet.org/data/" target="_blank">PCORNet Data</a>
​
## FHIR Resources
​
The list of resources available in the current release of FHIR are located [here](https://www.hl7.org/fhir/resourcelist.html).
​
## Mapping Logic from PCORnet CDM to FHIR Resources
​
| PCORnet Table Name | PCORNET Field Name | FHIR PATH | CAMPFHIR Column | Raw or Codeable | Logic |
|--------------------|--------------------|-----------|-----------------|-----------------|-------|
|Demographic         |PATID | Patient.identifier ||Raw | Patient ID serves as an identifer for the patient in the record. |
|Demographic         |BIRTH_DATE | Patient.birthDate ||Raw | Birthdate of the patient is recognized in both. |
|Demographic         |SEX | Patient.gender ||Codable |PCORnet accounts for Sex assigned at birth, current gender identity, and sexual orientation. FHIR only accounts for 'gender for record-keeping purposes'. CAMPFHIR pulls from DEMOGRAPHIC_SEX for simplicity purposes. |
|Demographic         |HISPANIC |||Codable |This is part of a FHIR Ethnicity extension.|
|Demographic         |RACE |||Codable | This is part of a FHIR Ethnicity extension. |
|Demographic         |PAT_PREF_LANGUAGE_SPOKEN | Patient.communication.language ||Codable | Preferred language of the patient is recognized in both PCORnet CDM and FHIR. |
|Encounter           |ENCOUNTERID | Encounter.idenftifier / Procedure.encounter.refrence ||Raw | Encounter is referenced throughout the FHIR specifications.|
|Encounter           |PATID | Encounter.subject.reference ||Raw | Within an encounter resource, the identifier of the patient is recorded. |
|Encounter           |ADMIT_DATE | Encounter.participant.period.start||Codable | FHIR stores the 'period of time during the encounter that the participant participated'.  |
|Encounter           |DISCHARGE_DATE | Encounter.participant.period.end ||Codable | See above.|
|Encounter           |ENC_TYPE | Encounter.class ||Codeable |PCORnet has types of encounters (ambulatory, emergency department, etc.). FHIR treats these as a 'Class' of encounter. The vocabulary is similar. |
|Encounter           |FACILITYID | Encounter.serviceprovider.reference||Raw |Reference to the facility where the encounter took place. |
|Encounter           |DISCHARGE_STATUS | Encounter.hospitalization.dischargedisposition ||Codable |Type of location where the patient was discharged.|
|Diagnosis           |DIAGNOSISID      | Condition.identifier.value||Raw |ID of the condition. |
|Diagnosis           |PATID | Condidtion.subject||Raw |Reference to the patient who has the condition. |
|Diagnosis           |ENCOUNTERID | Condition.encounter||Raw |Encounter where the diagnosis of condition happened.|
|Diagnosis           |PROVIDERID | Condition.asserter ||Raw |Reference to the person who asserted the condition.|
|Diagnosis           |DX | Condition.code ||Raw |The medical code of the diagnosis/condition.|
|Diagnosis           |DX_TYPE |Condition.code ||Codable |The coding system that accompanies the medical code. |
|Diagnosis           |RAW_DX | Condition.note ||Raw |PCORnet stores textual descriptions of diagnosis in the raw field. FHIR has space for a 'note' for additional information.|
|Procedures          |PROCEDURESID |Procedure.identifier||Raw |The identifier of the proceudre that took place.|
|Procedures          |PATID |Procedure.subject ||Raw |Reference to the person who recieved the procedure. |
|Procedures          |ENCOUNTERID |Procedure.encounter ||Raw |Reference to the encounter in which the procedure took place. |
|Procedures          |ENC_TYPE |Procedure.category ||Raw |PCORnet has types of encounters (ambulatory, emergency department, etc.). FHIR treats these as a 'Class' of encounter. The vocabulary is similar. |
|Procedures          |ADMIT_DATE |Procedure.performeddatetime ||Raw |Date of the encounter in which the procedure took place. |
|Procedures          |PROVIDERID|Procedure.performer.actor ||Raw |Reference to the provider who performed the procedure.|
|Procedures          |PX |Procedure.code ||Raw |The medical code corresponding to the procedure.|
|Procedures          |PX_TYPE|Procedure.code|Codable|The coding systems that accompanies the medical code. |
|Condition          |CONDITIONID |Condition.identifier ||Raw |ID of the condition record. |
|Condition          |PATID |Condition.subject ||Raw |Reference to the patient who has the condition.|
|Condition          |ENCOUNTERID |Condition.encounter ||Raw |Reference to the encounter where the condition was recorded. |
|Condition          |REPORT_DATE |Condition.recordedDate ||Raw |Date that the condition was recorded. |
|Condition          |RESOLVE_DATE |Condition.abatementDateTime ||Raw |Date that the condition was resolved. |
|Condition          |ONSET_DATE |Condition.onsetDateTime ||Raw |Date that the condition started for the patient. |
|Condition          |CONDITION_STATUS |Condition.clinicalStatus ||Codable |Current status of the condition.|
|Condition          |CONDITION |Condition.code ||Raw |The medical code corresponding to the condition.|
|Condition          |CONDITION_TYPE |Condition.code ||Codable |the coding system that accompanies the condition.|
|Condition          |RAW_CONDITION |Condition.note ||Raw |PCORnet uses this to store the textual description of the condition.|
|Death              |DEATH_DATE |Patient.deceasedDateTime ||Raw |Recorded date of patient death.|
|Med_Admin          |MEDADMIN_CODE |Medication.code ||Raw |PCORnet uses SNOMED to record codes associated with medications.|
​
​
​
​
​
## Notes
- FHIR defines a condition as: 'A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern'. Therefore, diagnosis values from PCORnet map to encounters.



FHIR_RESOURCE|FHIR_PATH|FHIR_NODE|LINE|FHIR_OUT_COLUMN|FHIR_SYSTEM
Encounter|Encounter.hospitalization.dischargeDisposition|dischargeDisposition|1|ENC_HOSP_DISDISP_CODING_CODE|http://hl7.org/fhir/ValueSet/encounter-discharge-disposition
Observation|Observation.interpretation|interpretation|1|OBS_INTERPRETATION|https://www.hl7.org/fhir/valueset-observation-interpretation.html
Patient|Patient.gender|gender|5|PTN_GENDER|https://www.hl7.org/fhir/valueset-administrative-gender
Patient|Patient.birthDate|birthDate|6|PTN_BIRTHDATE|
Patient|Patient.Contact.organization|organization|18|PTN_CONTACT_ORG|
Patient|Patient.Communication.preferred|preferred|21|PTN_COMM_PREFERRED|
Patient|Patient.ethnicity|ethnicity|0|PNT_ETHNICITY|http://hl7.org/fhir/v3/Ethnicity
Patient|Patient.active|active|2|PTN_ACTIVE|
Patient|Patient.deceased|deceased|7|PTN_DECEASED|
Patient|Patient.maritalStatus|maritalStatus|9|PTN_MARITAL_STATUS|
Patient|Patient.managingOrganization|managingOrganization|24|PTN_MGR_ORG|
Patient|Patient.Contact.period|period|19|PTN_CONTACT_PERIOD|
Patient|Patient.race|race|0|PNT_RACE|http://hl7.org/fhir/v3/Race
Observation|Observation.code|code|1|OBS_CODE_CODING_CODE|http://snomed.info/sct
Condition|Condition.clinicalStatus|clinicalStatus|1|CON_CLINICALSTAT|https://www.hl7.org/fhir/valueset-condition-clinical.html
Medication|||1|MED_SUBSTITU_ALLOWED|https://www.hl7.org/fhir/medicationrequest.html
Patient|Patient.identifier|identifier|1|PTN_IDENTIFIER|
Patient|Patient.address|address|8|PTN_ADDR_USE|
Patient|Patient.photo|photo|11|PTN_PHOTO|
Patient|Patient.Contact.telecom|telecom|15|PTN_CONTACT_TELCOM|
Patient|Patient.Contact.address|address|16|PTN_CONTACT_ADDR|
Patient|Patient.Link.other|other|25|PTN_LINK_OTHER|
Observation|Observation.value.quantity.comparator|comparator|1|OBS_VALUEQUANTITY_COMPARATOR|
Patient|Patient.name|name|3|PTN_NAME|
Patient|Patient.generalPractitioner|generalPractitioner|23|PTN_GEN_PRACT|
Patient|Patient.Contact.relationship|relationship|13|PTN_CONTACT_REL|
Patient|Patient.Contact.name|name|14|PTN_CONTACT_NAME|
Patient|Patient.Communication.language|language|20|PTN_COMM_LANGUAGE|
Encounter|Encounter.class|class|1|ENC_CLASS_CODE|http://hl7.org/fhir/ValueSet/v3-ActEncounterCode
Medication|||1|MED_DOSINSTX_ASNDBOOL|https://www.hl7.org/fhir/dosage.html
Patient|Patient.contact|contact|12|PTN_CONTACT|
Patient|Patient.communication|communication|19|PTN_COMMUNICATION|
Patient|Patient.Contact.gender|gender|17|PTN_CONTACT_GENDER|https://www.hl7.org/fhir/valueset-administrative-gender
Practitioner|Practitioner.gender|gender|1|PRACT_GENDER|https://www.hl7.org/fhir/valueset-administrative-gender.html
Patient|Patient.telecom|telecom|4|PTN_TELECOM|
Patient|Patient.Link.type|type|26|PTN_LINK_TYPE|
Encounter|Encounter.hospitalization.admitSource|admitSource|1|ENC_HOSP_ADMSRC_CODING_CODE|https://www.hl7.org/fhir/valueset-encounter-admit-source.html
Medication|||1|MED_DOSINSTX_TEXT|
