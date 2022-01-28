package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Relatedperson.
 * @see .Relatedperson
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class RelatedpersonConversion 
{
	public Patient Relatedpersons(main.templateoutput.Model.Relatedperson relatedperson) 
	{
			Patient  Relatedpersonobj = new Patient(); 

						Relatedpersonobj.addIdentifier(HapiFHIRHelpers.createIdentifier(relatedperson.getRltdPrsnDntfrDntfrSe() /** { "tree" :"RelatedPerson.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, relatedperson.getRltdPrsnDntfrDntfrTpCcCSstm() /** { "tree" :"RelatedPerson.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, relatedperson.getRltdPrsnDntfrDntfrTpCcCVrsn() /** { "tree" :"RelatedPerson.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, relatedperson.getRltdPrsnDntfrDntfrTpCcCCde() /** { "tree" :"RelatedPerson.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, relatedperson.getRltdPrsnDntfrDntfrTpCcCDsplay() /** { "tree" :"RelatedPerson.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, relatedperson.getRltdPrsnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"RelatedPerson.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, relatedperson.getRltdPrsnDntfrDntfrTpCcTxt() /** { "tree" :"RelatedPerson.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, relatedperson.getRltdPrsnDntfrDntfrPrdPrdStrt() /** { "tree" :"RelatedPerson.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, relatedperson.getRltdPrsnDntfrDntfrPrdPrdNd() /** { "tree" :"RelatedPerson.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, relatedperson.getRltdPrsnDntfrDntfrSsgnr() /** { "tree" :"RelatedPerson.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, relatedperson.getRltdPrsnDntfrDntfrVlue() /** { "tree" :"RelatedPerson.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, relatedperson.getRltdPrsnDntfrDntfrSstm() /** { "tree" :"RelatedPerson.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Relatedpersonobj.setActive(HapiFHIRHelpers.createboolean(relatedperson.getRelatedPersonActiveBoolean() /** { "tree" :"RelatedPerson.active", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActive"} **/
						));
Relatedpersonobj.setPatient(HapiFHIRHelpers.createReference(relatedperson.getRelatedPersonPntReference() /** { "tree" :"RelatedPerson.patient", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPatient"} **/
						));
Relatedpersonobj.addRelationship(HapiFHIRHelpers.createCodeableConcept(relatedperson.getRltdPrsnRltnshpCcCdngCSstm() /** { "tree" :"RelatedPerson.relationship", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelationship, addCoding, setSystem"} **/
						, relatedperson.getRltdPrsnRltnshpCcCdngCVrsn() /** { "tree" :"RelatedPerson.relationship", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelationship, addCoding, setVersion"} **/
						, relatedperson.getRltdPrsnRltnshpCcCdngCCde() /** { "tree" :"RelatedPerson.relationship", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelationship, addCoding, setCode"} **/
						, relatedperson.getRltdPrsnRltnshpCcCdngCDsplay() /** { "tree" :"RelatedPerson.relationship", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelationship, addCoding, setDisplay"} **/
						, relatedperson.getRltdPrsnRltnshpCcCdngCSrSlctd() /** { "tree" :"RelatedPerson.relationship", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelationship, addCoding, setUserSelected"} **/
						, relatedperson.getRelatedPersonRelationshipCcText() /** { "tree" :"RelatedPerson.relationship", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelationship, setText"} **/
						));
Relatedpersonobj.addName(HapiFHIRHelpers.createHumanName(relatedperson.getRelatedPersonNameHumanNameUse() /** { "tree" :"RelatedPerson.name", "datatype" : "HumanName, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setUse"} **/
						, relatedperson.getRltdPrsnNmHmnNmPrdPrdStrt() /** { "tree" :"RelatedPerson.name", "datatype" : "HumanName, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setPeriod, setStart"} **/
						, relatedperson.getRltdPrsnNmHmnNmPrdPrdNd() /** { "tree" :"RelatedPerson.name", "datatype" : "HumanName, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setPeriod, setEnd"} **/
						, relatedperson.getRelatedPersonNameHumanNameText() /** { "tree" :"RelatedPerson.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setText"} **/
						, relatedperson.getRltdPrsnNmHmnNmFmly() /** { "tree" :"RelatedPerson.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setFamily"} **/
						, relatedperson.getRelatedPersonNameHumanNameGiven() /** { "tree" :"RelatedPerson.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, addGiven"} **/
						, relatedperson.getRltdPrsnNmHmnNmPrfx() /** { "tree" :"RelatedPerson.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, addPrefix"} **/
						, relatedperson.getRltdPrsnNmHmnNmSffx() /** { "tree" :"RelatedPerson.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, addSuffix"} **/
						));
Relatedpersonobj.addTelecom(HapiFHIRHelpers.createContactPoint(relatedperson.getRltdPrsnTlcmCntctPntSstm() /** { "tree" :"RelatedPerson.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setSystem"} **/
						, relatedperson.getRltdPrsnTlcmCntctPntSe() /** { "tree" :"RelatedPerson.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setUse"} **/
						, relatedperson.getRltdPrsnTlcmCntctPntPrdPrdStrt() /** { "tree" :"RelatedPerson.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setStart"} **/
						, relatedperson.getRltdPrsnTlcmCntctPntPrdPrdNd() /** { "tree" :"RelatedPerson.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setEnd"} **/
						, relatedperson.getRltdPrsnTlcmCntctPntRnk() /** { "tree" :"RelatedPerson.telecom", "datatype" : "ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setRank"} **/
						, relatedperson.getRltdPrsnTlcmCntctPntVlue() /** { "tree" :"RelatedPerson.telecom", "datatype" : "ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setValue"} **/
						));
Relatedpersonobj.setGender(HapiFHIRHelpers.createcode(relatedperson.getRelatedPersonGenderCode() /** { "tree" :"RelatedPerson.gender", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGender"} **/
						));
Relatedpersonobj.setBirthDate(HapiFHIRHelpers.createdate(relatedperson.getRelatedPersonBirthDateDate() /** { "tree" :"RelatedPerson.birthDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBirthDate"} **/
						));
Relatedpersonobj.addAddress(HapiFHIRHelpers.createAddress(relatedperson.getRelatedPersonAddressAddressUse() /** { "tree" :"RelatedPerson.address", "datatype" : "Address, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setUse"} **/
						, relatedperson.getRelatedPersonAddressAddressType() /** { "tree" :"RelatedPerson.address", "datatype" : "Address, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setType"} **/
						, relatedperson.getRltdPrsnDdrssDdrssPrdPrdStrt() /** { "tree" :"RelatedPerson.address", "datatype" : "Address, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setPeriod, setStart"} **/
						, relatedperson.getRltdPrsnDdrssDdrssPrdPrdNd() /** { "tree" :"RelatedPerson.address", "datatype" : "Address, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setPeriod, setEnd"} **/
						, relatedperson.getRelatedPersonAddressAddressText() /** { "tree" :"RelatedPerson.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setText"} **/
						, relatedperson.getRelatedPersonAddressAddressLine() /** { "tree" :"RelatedPerson.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, addLine"} **/
						, relatedperson.getRelatedPersonAddressAddressCity() /** { "tree" :"RelatedPerson.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setCity"} **/
						, relatedperson.getRltdPrsnDdrssDdrssDstrct() /** { "tree" :"RelatedPerson.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setDistrict"} **/
						, relatedperson.getRltdPrsnDdrssDdrssStte() /** { "tree" :"RelatedPerson.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setState"} **/
						, relatedperson.getRltdPrsnDdrssDdrssPstlCde() /** { "tree" :"RelatedPerson.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setPostalCode"} **/
						, relatedperson.getRltdPrsnDdrssDdrssCntry() /** { "tree" :"RelatedPerson.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setCounty"} **/
						));
Relatedpersonobj.addPhoto(HapiFHIRHelpers.createAttachment(relatedperson.getRltdPrsnPhtTtchmntDta() /** { "tree" :"RelatedPerson.photo", "datatype" : "Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setData"} **/
						, relatedperson.getRltdPrsnPhtTtchmntHsh() /** { "tree" :"RelatedPerson.photo", "datatype" : "Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setHash"} **/
						, relatedperson.getRltdPrsnPhtTtchmntCntntTpe() /** { "tree" :"RelatedPerson.photo", "datatype" : "Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setContentType"} **/
						, relatedperson.getRltdPrsnPhtTtchmntLngge() /** { "tree" :"RelatedPerson.photo", "datatype" : "Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setLanguage"} **/
						, relatedperson.getRltdPrsnPhtTtchmntCrtn() /** { "tree" :"RelatedPerson.photo", "datatype" : "Attachment, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setCreation"} **/
						, relatedperson.getRltdPrsnPhtTtchmntTtle() /** { "tree" :"RelatedPerson.photo", "datatype" : "Attachment, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setTitle"} **/
						, relatedperson.getRltdPrsnPhtTtchmntSze() /** { "tree" :"RelatedPerson.photo", "datatype" : "Attachment, unsignedInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setSize"} **/
						, relatedperson.getRelatedPersonPhotoAttachmentUrl() /** { "tree" :"RelatedPerson.photo", "datatype" : "Attachment, url", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setUrl"} **/
						));
Relatedpersonobj.setPeriod(HapiFHIRHelpers.createPeriod(relatedperson.getRelatedPersonPeriodPeriodStart() /** { "tree" :"RelatedPerson.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setStart"} **/
						, relatedperson.getRelatedPersonPeriodPeriodEnd() /** { "tree" :"RelatedPerson.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setEnd"} **/
						));
Relatedpersonobj.setLanguage(HapiFHIRHelpers.createCodeableConcept(relatedperson.getRltdPrsnCmmnctnLnggCcCdngCSstm() /** { "tree" :"RelatedPerson.communication.language", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addCommunication"] , "methodName" : "setLanguage, addCoding, setSystem"} **/
						, relatedperson.getRltdPrsnCmmnctnLnggCcCdngCVrsn() /** { "tree" :"RelatedPerson.communication.language", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addCommunication"] , "methodName" : "setLanguage, addCoding, setVersion"} **/
						, relatedperson.getRltdPrsnCmmnctnLnggCcCdngCCde() /** { "tree" :"RelatedPerson.communication.language", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addCommunication"] , "methodName" : "setLanguage, addCoding, setCode"} **/
						, relatedperson.getRltdPrsnCmmnctnLnggCcCdngCDsplay() /** { "tree" :"RelatedPerson.communication.language", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addCommunication"] , "methodName" : "setLanguage, addCoding, setDisplay"} **/
						, relatedperson.getRltdPrsnCmmnctnLnggCcCdngCSrSlctd() /** { "tree" :"RelatedPerson.communication.language", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addCommunication"] , "methodName" : "setLanguage, addCoding, setUserSelected"} **/
						, relatedperson.getRltdPrsnCmmnctnLnggCcTxt() /** { "tree" :"RelatedPerson.communication.language", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addCommunication"] , "methodName" : "setLanguage, setText"} **/
						));
Relatedpersonobj.setPreferred(HapiFHIRHelpers.createboolean(relatedperson.getRltdPrsnCmmnctnPrfrrdBln() /** { "tree" :"RelatedPerson.communication.preferred", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addCommunication"] , "methodName" : "setPreferred"} **/
		));
	}
}
