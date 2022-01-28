package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 



/**
 *  object for conversion model class Patient.
 * @see .Patient
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class PatientConversion 
{
	public org.hl7.fhir.r4.model.Patient Patients(main.templateoutput.Model.Patient patient) 
	{
			org.hl7.fhir.r4.model.Patient  Patientobj = new org.hl7.fhir.r4.model.Patient(); 

						Patientobj.addIdentifier(HapiFHIRHelpers.createIdentifier(patient.getPatientIdentifierIdentifierUse() /** { "tree" :"Patient.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, patient.getPtntDntfrDntfrTpCcCSstm() /** { "tree" :"Patient.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, patient.getPtntDntfrDntfrTpCcCVrsn() /** { "tree" :"Patient.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, patient.getPtntDntfrDntfrTpCcCCde() /** { "tree" :"Patient.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, patient.getPtntDntfrDntfrTpCcCDsplay() /** { "tree" :"Patient.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, patient.getPtntDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Patient.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, patient.getPtntDntfrDntfrTpCcTxt() /** { "tree" :"Patient.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, patient.getPtntDntfrDntfrPrdPrdStrt() /** { "tree" :"Patient.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, patient.getPtntDntfrDntfrPrdPrdNd() /** { "tree" :"Patient.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, patient.getPtntDntfrDntfrSsgnr() /** { "tree" :"Patient.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, patient.getPtntDntfrDntfrVlue() /** { "tree" :"Patient.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, patient.getPtntDntfrDntfrSstm() /** { "tree" :"Patient.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Patientobj.setActive(HapiFHIRHelpers.createboolean(patient.getPatientActiveBoolean() /** { "tree" :"Patient.active", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActive"} **/
						));
Patientobj.addName(HapiFHIRHelpers.createHumanName(patient.getPatientNameHumanNameUse() /** { "tree" :"Patient.name", "datatype" : "HumanName, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setUse"} **/
						, patient.getPtntNmHmnNmPrdPrdStrt() /** { "tree" :"Patient.name", "datatype" : "HumanName, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setPeriod, setStart"} **/
						, patient.getPtntNmHmnNmPrdPrdNd() /** { "tree" :"Patient.name", "datatype" : "HumanName, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setPeriod, setEnd"} **/
						, patient.getPatientNameHumanNameText() /** { "tree" :"Patient.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setText"} **/
						, patient.getPatientNameHumanNameFamily() /** { "tree" :"Patient.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setFamily"} **/
						, patient.getPatientNameHumanNameGiven() /** { "tree" :"Patient.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, addGiven"} **/
						, patient.getPatientNameHumanNamePrefix() /** { "tree" :"Patient.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, addPrefix"} **/
						, patient.getPatientNameHumanNameSuffix() /** { "tree" :"Patient.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, addSuffix"} **/
						));
Patientobj.addTelecom(HapiFHIRHelpers.createContactPoint(patient.getPtntTlcmCntctPntSstm() /** { "tree" :"Patient.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setSystem"} **/
						, patient.getPatientTelecomContactPointUse() /** { "tree" :"Patient.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setUse"} **/
						, patient.getPtntTlcmCntctPntPrdPrdStrt() /** { "tree" :"Patient.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setStart"} **/
						, patient.getPtntTlcmCntctPntPrdPrdNd() /** { "tree" :"Patient.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setEnd"} **/
						, patient.getPatientTelecomContactPointRank() /** { "tree" :"Patient.telecom", "datatype" : "ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setRank"} **/
						, patient.getPatientTelecomContactPointValue() /** { "tree" :"Patient.telecom", "datatype" : "ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setValue"} **/
						));
Patientobj.setGender(HapiFHIRHelpers.createcode(patient.getPatientGenderCode() /** { "tree" :"Patient.gender", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGender"} **/
						));
Patientobj.setBirthDate(HapiFHIRHelpers.createdate(patient.getPatientBirthDateDate() /** { "tree" :"Patient.birthDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBirthDate"} **/
						));
Patientobj.setDeceased(HapiFHIRHelpers.createbooleantype(patient.getPatientDeceasedBooleanBoolean() /** { "tree" :"Patient.deceasedBoolean", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDeceasedBoolean"} **/
						));
Patientobj.setDeceased(HapiFHIRHelpers.createdateTimetype(patient.getPatientDeceasedDatetimeDateTime() /** { "tree" :"Patient.deceasedDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDeceasedDatetime"} **/
						));
Patientobj.addAddress(HapiFHIRHelpers.createAddress(patient.getPatientAddressAddressUse() /** { "tree" :"Patient.address", "datatype" : "Address, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setUse"} **/
						, patient.getPatientAddressAddressType() /** { "tree" :"Patient.address", "datatype" : "Address, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setType"} **/
						, patient.getPtntDdrssDdrssPrdPrdStrt() /** { "tree" :"Patient.address", "datatype" : "Address, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setPeriod, setStart"} **/
						, patient.getPtntDdrssDdrssPrdPrdNd() /** { "tree" :"Patient.address", "datatype" : "Address, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setPeriod, setEnd"} **/
						, patient.getPatientAddressAddressText() /** { "tree" :"Patient.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setText"} **/
						, patient.getPatientAddressAddressLine() /** { "tree" :"Patient.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, addLine"} **/
						, patient.getPatientAddressAddressCity() /** { "tree" :"Patient.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setCity"} **/
						, patient.getPatientAddressAddressDistrict() /** { "tree" :"Patient.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setDistrict"} **/
						, patient.getPatientAddressAddressState() /** { "tree" :"Patient.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setState"} **/
						, patient.getPatientAddressAddressPostalCode() /** { "tree" :"Patient.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setPostalCode"} **/
						, patient.getPatientAddressAddressCountry() /** { "tree" :"Patient.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setCounty"} **/
						));
Patientobj.setMaritalStatus(HapiFHIRHelpers.createCodeableConcept(patient.getPtntMrtlSttsCcCdngCSstm() /** { "tree" :"Patient.maritalStatus", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMaritalStatus, addCoding, setSystem"} **/
						, patient.getPtntMrtlSttsCcCdngCVrsn() /** { "tree" :"Patient.maritalStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMaritalStatus, addCoding, setVersion"} **/
						, patient.getPtntMrtlSttsCcCdngCCde() /** { "tree" :"Patient.maritalStatus", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMaritalStatus, addCoding, setCode"} **/
						, patient.getPtntMrtlSttsCcCdngCDsplay() /** { "tree" :"Patient.maritalStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMaritalStatus, addCoding, setDisplay"} **/
						, patient.getPtntMrtlSttsCcCdngCSrSlctd() /** { "tree" :"Patient.maritalStatus", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMaritalStatus, addCoding, setUserSelected"} **/
						, patient.getPatientMaritalStatusCcText() /** { "tree" :"Patient.maritalStatus", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMaritalStatus, setText"} **/
						));
Patientobj.setMultipleBirth(HapiFHIRHelpers.createbooleantype(patient.getPtntMltplBrthBlnBln() /** { "tree" :"Patient.multipleBirthBoolean", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMultipleBirthBoolean"} **/
						));
Patientobj.setMultipleBirth(HapiFHIRHelpers.createintegertype(patient.getPtntMltplBrthntgrNtgr() /** { "tree" :"Patient.multipleBirthInteger", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMultipleBirthInteger"} **/
						));
Patientobj.addPhoto(HapiFHIRHelpers.createAttachment(patient.getPatientPhotoAttachmentData() /** { "tree" :"Patient.photo", "datatype" : "Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setData"} **/
						, patient.getPatientPhotoAttachmentHash() /** { "tree" :"Patient.photo", "datatype" : "Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setHash"} **/
						, patient.getPtntPhtTtchmntCntntTpe() /** { "tree" :"Patient.photo", "datatype" : "Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setContentType"} **/
						, patient.getPatientPhotoAttachmentLanguage() /** { "tree" :"Patient.photo", "datatype" : "Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setLanguage"} **/
						, patient.getPatientPhotoAttachmentCreation() /** { "tree" :"Patient.photo", "datatype" : "Attachment, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setCreation"} **/
						, patient.getPatientPhotoAttachmentTitle() /** { "tree" :"Patient.photo", "datatype" : "Attachment, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setTitle"} **/
						, patient.getPatientPhotoAttachmentSize() /** { "tree" :"Patient.photo", "datatype" : "Attachment, unsignedInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setSize"} **/
						, patient.getPatientPhotoAttachmentUrl() /** { "tree" :"Patient.photo", "datatype" : "Attachment, url", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setUrl"} **/
						));
Patientobj.addRelationship(HapiFHIRHelpers.createCodeableConcept(patient.getPtntCntctRltnshpCcCdngCSstm() /** { "tree" :"Patient.contact.relationship", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addContact"] , "methodName" : "addRelationship, addCoding, setSystem"} **/
						, patient.getPtntCntctRltnshpCcCdngCVrsn() /** { "tree" :"Patient.contact.relationship", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addContact"] , "methodName" : "addRelationship, addCoding, setVersion"} **/
						, patient.getPtntCntctRltnshpCcCdngCCde() /** { "tree" :"Patient.contact.relationship", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addContact"] , "methodName" : "addRelationship, addCoding, setCode"} **/
						, patient.getPtntCntctRltnshpCcCdngCDsplay() /** { "tree" :"Patient.contact.relationship", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addContact"] , "methodName" : "addRelationship, addCoding, setDisplay"} **/
						, patient.getPtntCntctRltnshpCcCdngCSrSlctd() /** { "tree" :"Patient.contact.relationship", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addContact"] , "methodName" : "addRelationship, addCoding, setUserSelected"} **/
						, patient.getPtntCntctRltnshpCcTxt() /** { "tree" :"Patient.contact.relationship", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addContact"] , "methodName" : "addRelationship, setText"} **/
						));
Patientobj.setName(HapiFHIRHelpers.createHumanName(patient.getPatientContactNameHumanNameUse() /** { "tree" :"Patient.contact.name", "datatype" : "HumanName, code", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setName, setUse"} **/
						, patient.getPtntCntctNmHmnNmPrdPrdStrt() /** { "tree" :"Patient.contact.name", "datatype" : "HumanName, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setName, setPeriod, setStart"} **/
						, patient.getPtntCntctNmHmnNmPrdPrdNd() /** { "tree" :"Patient.contact.name", "datatype" : "HumanName, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setName, setPeriod, setEnd"} **/
						, patient.getPtntCntctNmHmnNmTxt() /** { "tree" :"Patient.contact.name", "datatype" : "HumanName, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setName, setText"} **/
						, patient.getPtntCntctNmHmnNmFmly() /** { "tree" :"Patient.contact.name", "datatype" : "HumanName, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setName, setFamily"} **/
						, patient.getPtntCntctNmHmnNmGvn() /** { "tree" :"Patient.contact.name", "datatype" : "HumanName, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setName, addGiven"} **/
						, patient.getPtntCntctNmHmnNmPrfx() /** { "tree" :"Patient.contact.name", "datatype" : "HumanName, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setName, addPrefix"} **/
						, patient.getPtntCntctNmHmnNmSffx() /** { "tree" :"Patient.contact.name", "datatype" : "HumanName, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setName, addSuffix"} **/
						));
Patientobj.addTelecom(HapiFHIRHelpers.createContactPoint(patient.getPtntCntctTlcmCntctPntSstm() /** { "tree" :"Patient.contact.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : ["addContact"] , "methodName" : "addTelecom, setSystem"} **/
						, patient.getPtntCntctTlcmCntctPntSe() /** { "tree" :"Patient.contact.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : ["addContact"] , "methodName" : "addTelecom, setUse"} **/
						, patient.getPtntCntctTlcmCntctPntPrdPrdStrt() /** { "tree" :"Patient.contact.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : ["addContact"] , "methodName" : "addTelecom, setPeriod, setStart"} **/
						, patient.getPtntCntctTlcmCntctPntPrdPrdNd() /** { "tree" :"Patient.contact.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : ["addContact"] , "methodName" : "addTelecom, setPeriod, setEnd"} **/
						, patient.getPtntCntctTlcmCntctPntRnk() /** { "tree" :"Patient.contact.telecom", "datatype" : "ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : ["addContact"] , "methodName" : "addTelecom, setRank"} **/
						, patient.getPtntCntctTlcmCntctPntVlue() /** { "tree" :"Patient.contact.telecom", "datatype" : "ContactPoint, string", "cardinality" : "Many", "elementtree" : ["addContact"] , "methodName" : "addTelecom, setValue"} **/
						));
Patientobj.setAddress(HapiFHIRHelpers.createAddress(patient.getPtntCntctDdrssDdrssSe() /** { "tree" :"Patient.contact.address", "datatype" : "Address, code", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setUse"} **/
						, patient.getPtntCntctDdrssDdrssTpe() /** { "tree" :"Patient.contact.address", "datatype" : "Address, code", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setType"} **/
						, patient.getPtntCntctDdrssDdrssPrdPrdStrt() /** { "tree" :"Patient.contact.address", "datatype" : "Address, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setPeriod, setStart"} **/
						, patient.getPtntCntctDdrssDdrssPrdPrdNd() /** { "tree" :"Patient.contact.address", "datatype" : "Address, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setPeriod, setEnd"} **/
						, patient.getPtntCntctDdrssDdrssTxt() /** { "tree" :"Patient.contact.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setText"} **/
						, patient.getPtntCntctDdrssDdrssLne() /** { "tree" :"Patient.contact.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, addLine"} **/
						, patient.getPtntCntctDdrssDdrssCty() /** { "tree" :"Patient.contact.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setCity"} **/
						, patient.getPtntCntctDdrssDdrssDstrct() /** { "tree" :"Patient.contact.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setDistrict"} **/
						, patient.getPtntCntctDdrssDdrssStte() /** { "tree" :"Patient.contact.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setState"} **/
						, patient.getPtntCntctDdrssDdrssPstlCde() /** { "tree" :"Patient.contact.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setPostalCode"} **/
						, patient.getPtntCntctDdrssDdrssCntry() /** { "tree" :"Patient.contact.address", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setAddress, setCounty"} **/
						));
Patientobj.setGender(HapiFHIRHelpers.createcode(patient.getPatientContactGenderCode() /** { "tree" :"Patient.contact.gender", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setGender"} **/
						));
Patientobj.setOrganization(HapiFHIRHelpers.createReference(patient.getPtntCntctRgnztnRfrnce() /** { "tree" :"Patient.contact.organization", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setOrganization"} **/
						));
Patientobj.setPeriod(HapiFHIRHelpers.createPeriod(patient.getPtntCntctPrdPrdStrt() /** { "tree" :"Patient.contact.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setPeriod, setStart"} **/
						, patient.getPatientContactPeriodPeriodEnd() /** { "tree" :"Patient.contact.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addContact"] , "methodName" : "setPeriod, setEnd"} **/
						));
Patientobj.setLanguage(HapiFHIRHelpers.createCodeableConcept(patient.getPtntCmmnctnLnggCcCdngCSstm() /** { "tree" :"Patient.communication.language", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addCommunication"] , "methodName" : "setLanguage, addCoding, setSystem"} **/
						, patient.getPtntCmmnctnLnggCcCdngCVrsn() /** { "tree" :"Patient.communication.language", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addCommunication"] , "methodName" : "setLanguage, addCoding, setVersion"} **/
						, patient.getPtntCmmnctnLnggCcCdngCCde() /** { "tree" :"Patient.communication.language", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addCommunication"] , "methodName" : "setLanguage, addCoding, setCode"} **/
						, patient.getPtntCmmnctnLnggCcCdngCDsplay() /** { "tree" :"Patient.communication.language", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addCommunication"] , "methodName" : "setLanguage, addCoding, setDisplay"} **/
						, patient.getPtntCmmnctnLnggCcCdngCSrSlctd() /** { "tree" :"Patient.communication.language", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addCommunication"] , "methodName" : "setLanguage, addCoding, setUserSelected"} **/
						, patient.getPtntCmmnctnLnggCcTxt() /** { "tree" :"Patient.communication.language", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addCommunication"] , "methodName" : "setLanguage, setText"} **/
						));
Patientobj.setPreferred(HapiFHIRHelpers.createboolean(patient.getPtntCmmnctnPrfrrdBln() /** { "tree" :"Patient.communication.preferred", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addCommunication"] , "methodName" : "setPreferred"} **/
						));
Patientobj.addGeneralPractitioner(HapiFHIRHelpers.createReference(patient.getPtntGnrlPrcttnrRfrnce() /** { "tree" :"Patient.generalPractitioner", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addGeneralPractitioner"} **/
						));
Patientobj.setManagingOrganization(HapiFHIRHelpers.createReference(patient.getPtntMngngrgnztnRfrnce() /** { "tree" :"Patient.managingOrganization", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setManagingOrganization"} **/
						));
Patientobj.setOther(HapiFHIRHelpers.createReference(patient.getPatientLinkOtherReference() /** { "tree" :"Patient.link.other", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addLink"] , "methodName" : "setOther"} **/
						));
Patientobj.setType(HapiFHIRHelpers.createcode(patient.getPatientLinkTypeCode() /** { "tree" :"Patient.link.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addLink"] , "methodName" : "setType"} **/
		));
	}
}
