package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Person.
 * @see .Person
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class PersonConversion 
{
	public Patient Persons(main.templateoutput.Model.Person person) 
	{
			Patient  Personobj = new Patient(); 

						Personobj.addIdentifier(HapiFHIRHelpers.createIdentifier(person.getPersonIdentifierIdentifierUse() /** { "tree" :"Person.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, person.getPrsnDntfrDntfrTpCcCSstm() /** { "tree" :"Person.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, person.getPrsnDntfrDntfrTpCcCVrsn() /** { "tree" :"Person.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, person.getPrsnDntfrDntfrTpCcCCde() /** { "tree" :"Person.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, person.getPrsnDntfrDntfrTpCcCDsplay() /** { "tree" :"Person.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, person.getPrsnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Person.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, person.getPrsnDntfrDntfrTpCcTxt() /** { "tree" :"Person.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, person.getPrsnDntfrDntfrPrdPrdStrt() /** { "tree" :"Person.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, person.getPrsnDntfrDntfrPrdPrdNd() /** { "tree" :"Person.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, person.getPrsnDntfrDntfrSsgnr() /** { "tree" :"Person.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, person.getPersonIdentifierIdentifierValue() /** { "tree" :"Person.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, person.getPrsnDntfrDntfrSstm() /** { "tree" :"Person.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Personobj.addName(HapiFHIRHelpers.createHumanName(person.getPersonNameHumanNameUse() /** { "tree" :"Person.name", "datatype" : "HumanName, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setUse"} **/
						, person.getPrsnNmHmnNmPrdPrdStrt() /** { "tree" :"Person.name", "datatype" : "HumanName, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setPeriod, setStart"} **/
						, person.getPrsnNmHmnNmPrdPrdNd() /** { "tree" :"Person.name", "datatype" : "HumanName, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setPeriod, setEnd"} **/
						, person.getPersonNameHumanNameText() /** { "tree" :"Person.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setText"} **/
						, person.getPersonNameHumanNameFamily() /** { "tree" :"Person.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setFamily"} **/
						, person.getPersonNameHumanNameGiven() /** { "tree" :"Person.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, addGiven"} **/
						, person.getPersonNameHumanNamePrefix() /** { "tree" :"Person.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, addPrefix"} **/
						, person.getPersonNameHumanNameSuffix() /** { "tree" :"Person.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, addSuffix"} **/
						));
Personobj.addTelecom(HapiFHIRHelpers.createContactPoint(person.getPersonTelecomContactPointSystem() /** { "tree" :"Person.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setSystem"} **/
						, person.getPersonTelecomContactPointUse() /** { "tree" :"Person.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setUse"} **/
						, person.getPrsnTlcmCntctPntPrdPrdStrt() /** { "tree" :"Person.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setStart"} **/
						, person.getPrsnTlcmCntctPntPrdPrdNd() /** { "tree" :"Person.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setEnd"} **/
						, person.getPersonTelecomContactPointRank() /** { "tree" :"Person.telecom", "datatype" : "ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setRank"} **/
						, person.getPersonTelecomContactPointValue() /** { "tree" :"Person.telecom", "datatype" : "ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setValue"} **/
						));
Personobj.setGender(HapiFHIRHelpers.createcode(person.getPersonGenderCode() /** { "tree" :"Person.gender", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGender"} **/
						));
Personobj.setBirthDate(HapiFHIRHelpers.createdate(person.getPersonBirthDateDate() /** { "tree" :"Person.birthDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBirthDate"} **/
						));
Personobj.addAddress(HapiFHIRHelpers.createAddress(person.getPersonAddressAddressUse() /** { "tree" :"Person.address", "datatype" : "Address, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setUse"} **/
						, person.getPersonAddressAddressType() /** { "tree" :"Person.address", "datatype" : "Address, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setType"} **/
						, person.getPrsnDdrssDdrssPrdPrdStrt() /** { "tree" :"Person.address", "datatype" : "Address, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setPeriod, setStart"} **/
						, person.getPrsnDdrssDdrssPrdPrdNd() /** { "tree" :"Person.address", "datatype" : "Address, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setPeriod, setEnd"} **/
						, person.getPersonAddressAddressText() /** { "tree" :"Person.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setText"} **/
						, person.getPersonAddressAddressLine() /** { "tree" :"Person.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, addLine"} **/
						, person.getPersonAddressAddressCity() /** { "tree" :"Person.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setCity"} **/
						, person.getPersonAddressAddressDistrict() /** { "tree" :"Person.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setDistrict"} **/
						, person.getPersonAddressAddressState() /** { "tree" :"Person.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setState"} **/
						, person.getPersonAddressAddressPostalCode() /** { "tree" :"Person.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setPostalCode"} **/
						, person.getPersonAddressAddressCountry() /** { "tree" :"Person.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setCounty"} **/
						));
Personobj.setPhoto(HapiFHIRHelpers.createAttachment(person.getPersonPhotoAttachmentData() /** { "tree" :"Person.photo", "datatype" : "Attachment, base64Binary", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhoto, setData"} **/
						, person.getPersonPhotoAttachmentHash() /** { "tree" :"Person.photo", "datatype" : "Attachment, base64Binary", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhoto, setHash"} **/
						, person.getPrsnPhtTtchmntCntntTpe() /** { "tree" :"Person.photo", "datatype" : "Attachment, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhoto, setContentType"} **/
						, person.getPersonPhotoAttachmentLanguage() /** { "tree" :"Person.photo", "datatype" : "Attachment, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhoto, setLanguage"} **/
						, person.getPersonPhotoAttachmentCreation() /** { "tree" :"Person.photo", "datatype" : "Attachment, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhoto, setCreation"} **/
						, person.getPersonPhotoAttachmentTitle() /** { "tree" :"Person.photo", "datatype" : "Attachment, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhoto, setTitle"} **/
						, person.getPersonPhotoAttachmentSize() /** { "tree" :"Person.photo", "datatype" : "Attachment, unsignedInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhoto, setSize"} **/
						, person.getPersonPhotoAttachmentUrl() /** { "tree" :"Person.photo", "datatype" : "Attachment, url", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhoto, setUrl"} **/
						));
Personobj.setManagingOrganization(HapiFHIRHelpers.createReference(person.getPrsnMngngrgnztnRfrnce() /** { "tree" :"Person.managingOrganization", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setManagingOrganization"} **/
						));
Personobj.setActive(HapiFHIRHelpers.createboolean(person.getPersonActiveBoolean() /** { "tree" :"Person.active", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActive"} **/
						));
Personobj.setTarget(HapiFHIRHelpers.createReference(person.getPersonLinkTargetReference() /** { "tree" :"Person.link.target", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addLink"] , "methodName" : "setTarget"} **/
						));
Personobj.setAssurance(HapiFHIRHelpers.createcode(person.getPersonLinkAssuranceCode() /** { "tree" :"Person.link.assurance", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addLink"] , "methodName" : "setAssurance"} **/
		));
	}
}
