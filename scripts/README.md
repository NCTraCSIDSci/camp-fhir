# CAMPFHIR Mapping Documentation
​
This document serves as a guide the the mapping logic for mapping PCORnet Common Data Model (CDM) version 6.0 to FHIR version 4.0 (R4).
​
Currently, CAMPFHIR supports value set mapping for 44 PCORnet CDM fields. Of those, 7 are codeable concepts. The rest take the raw PCORnet value and map it to the corresponding CAMPFHIR column. This document explains the process taken to reach the conclusion that they are corresponding concepts.
​
## FHIR Resources
​
The list of resources available in the current release of FHIR are located [here](https://www.hl7.org/fhir/resourcelist.html).
CAMPFHIR Currently support the following FHIR Resources
|FHIR Resource|Version|
|-|-|
|CONDITION|R4|
|DEVICE|R4|
|DEVICEDEFINITION|R4|
|DEVICEMETRIC|R4|
|DOCUMENTREFERENCE|R4|
|ENCOUNTER|R4|
|MEDICATION|R4|
|MEDREQ|R4|
|OBSERVATION|R4|
|PATIENT|R4|
|PRACTITIONER|R4|
|PROCEDURE|R4|

​
## Common Data Models
A common data model contains a uniform set of metadata, allowing data and its meaning to be shared across applications. In addition to the uniform metadata, a common data model includes a set of standardized, extensible data schemas that include items such as entities, attributes, semantic metadata, and relationships.

How CAMPFHIR interacts with a common data model is though a transformation of that model to a relational FHIR schema.
​
### PCORNET CDM
​
The current specifications for the PCORnet CDM are located [here](https://pcornet.org/wp-content/uploads/2022/01/PCORnet-Common-Data-Model-v60-2020_10_221.pdf) [PDF].
​
#### Mapping Logic from PCORnet CDM to FHIR Resources
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
## Notes
- FHIR defines a condition as: 'A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern'. Therefore, diagnosis values from PCORnet map to encounters.

