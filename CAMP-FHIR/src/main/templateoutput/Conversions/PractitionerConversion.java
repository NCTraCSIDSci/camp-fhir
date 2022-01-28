package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Practitioner.
 * @see .Practitioner
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class PractitionerConversion 
{
	public Patient Practitioners(main.templateoutput.Model.Practitioner practitioner) 
	{
			Patient  Practitionerobj = new Patient(); 

						Practitionerobj.addIdentifier(HapiFHIRHelpers.createIdentifier(practitioner.getPrcttnrDntfrDntfrSe() /** { "tree" :"Practitioner.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, practitioner.getPrcttnrDntfrDntfrTpCcCSstm() /** { "tree" :"Practitioner.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, practitioner.getPrcttnrDntfrDntfrTpCcCVrsn() /** { "tree" :"Practitioner.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, practitioner.getPrcttnrDntfrDntfrTpCcCCde() /** { "tree" :"Practitioner.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, practitioner.getPrcttnrDntfrDntfrTpCcCDsplay() /** { "tree" :"Practitioner.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, practitioner.getPrcttnrDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Practitioner.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, practitioner.getPrcttnrDntfrDntfrTpCcTxt() /** { "tree" :"Practitioner.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, practitioner.getPrcttnrDntfrDntfrPrdPrdStrt() /** { "tree" :"Practitioner.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, practitioner.getPrcttnrDntfrDntfrPrdPrdNd() /** { "tree" :"Practitioner.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, practitioner.getPrcttnrDntfrDntfrSsgnr() /** { "tree" :"Practitioner.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, practitioner.getPrcttnrDntfrDntfrVlue() /** { "tree" :"Practitioner.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, practitioner.getPrcttnrDntfrDntfrSstm() /** { "tree" :"Practitioner.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Practitionerobj.setActive(HapiFHIRHelpers.createboolean(practitioner.getPractitionerActiveBoolean() /** { "tree" :"Practitioner.active", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActive"} **/
						));
Practitionerobj.addName(HapiFHIRHelpers.createHumanName(practitioner.getPractitionerNameHumanNameUse() /** { "tree" :"Practitioner.name", "datatype" : "HumanName, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setUse"} **/
						, practitioner.getPrcttnrNmHmnNmPrdPrdStrt() /** { "tree" :"Practitioner.name", "datatype" : "HumanName, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setPeriod, setStart"} **/
						, practitioner.getPrcttnrNmHmnNmPrdPrdNd() /** { "tree" :"Practitioner.name", "datatype" : "HumanName, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setPeriod, setEnd"} **/
						, practitioner.getPractitionerNameHumanNameText() /** { "tree" :"Practitioner.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setText"} **/
						, practitioner.getPractitionerNameHumanNameFamily() /** { "tree" :"Practitioner.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, setFamily"} **/
						, practitioner.getPractitionerNameHumanNameGiven() /** { "tree" :"Practitioner.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, addGiven"} **/
						, practitioner.getPractitionerNameHumanNamePrefix() /** { "tree" :"Practitioner.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, addPrefix"} **/
						, practitioner.getPractitionerNameHumanNameSuffix() /** { "tree" :"Practitioner.name", "datatype" : "HumanName, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addName, addSuffix"} **/
						));
Practitionerobj.addTelecom(HapiFHIRHelpers.createContactPoint(practitioner.getPrcttnrTlcmCntctPntSstm() /** { "tree" :"Practitioner.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setSystem"} **/
						, practitioner.getPrcttnrTlcmCntctPntSe() /** { "tree" :"Practitioner.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setUse"} **/
						, practitioner.getPrcttnrTlcmCntctPntPrdPrdStrt() /** { "tree" :"Practitioner.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setStart"} **/
						, practitioner.getPrcttnrTlcmCntctPntPrdPrdNd() /** { "tree" :"Practitioner.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setEnd"} **/
						, practitioner.getPrcttnrTlcmCntctPntRnk() /** { "tree" :"Practitioner.telecom", "datatype" : "ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setRank"} **/
						, practitioner.getPrcttnrTlcmCntctPntVlue() /** { "tree" :"Practitioner.telecom", "datatype" : "ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setValue"} **/
						));
Practitionerobj.addAddress(HapiFHIRHelpers.createAddress(practitioner.getPractitionerAddressAddressUse() /** { "tree" :"Practitioner.address", "datatype" : "Address, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setUse"} **/
						, practitioner.getPractitionerAddressAddressType() /** { "tree" :"Practitioner.address", "datatype" : "Address, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setType"} **/
						, practitioner.getPrcttnrDdrssDdrssPrdPrdStrt() /** { "tree" :"Practitioner.address", "datatype" : "Address, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setPeriod, setStart"} **/
						, practitioner.getPrcttnrDdrssDdrssPrdPrdNd() /** { "tree" :"Practitioner.address", "datatype" : "Address, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setPeriod, setEnd"} **/
						, practitioner.getPractitionerAddressAddressText() /** { "tree" :"Practitioner.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setText"} **/
						, practitioner.getPractitionerAddressAddressLine() /** { "tree" :"Practitioner.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, addLine"} **/
						, practitioner.getPractitionerAddressAddressCity() /** { "tree" :"Practitioner.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setCity"} **/
						, practitioner.getPrcttnrDdrssDdrssDstrct() /** { "tree" :"Practitioner.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setDistrict"} **/
						, practitioner.getPractitionerAddressAddressState() /** { "tree" :"Practitioner.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setState"} **/
						, practitioner.getPrcttnrDdrssDdrssPstlCde() /** { "tree" :"Practitioner.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setPostalCode"} **/
						, practitioner.getPrcttnrDdrssDdrssCntry() /** { "tree" :"Practitioner.address", "datatype" : "Address, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddress, setCounty"} **/
						));
Practitionerobj.setGender(HapiFHIRHelpers.createcode(practitioner.getPractitionerGenderCode() /** { "tree" :"Practitioner.gender", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGender"} **/
						));
Practitionerobj.setBirthDate(HapiFHIRHelpers.createdate(practitioner.getPractitionerBirthDateDate() /** { "tree" :"Practitioner.birthDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBirthDate"} **/
						));
Practitionerobj.addPhoto(HapiFHIRHelpers.createAttachment(practitioner.getPractitionerPhotoAttachmentData() /** { "tree" :"Practitioner.photo", "datatype" : "Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setData"} **/
						, practitioner.getPractitionerPhotoAttachmentHash() /** { "tree" :"Practitioner.photo", "datatype" : "Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setHash"} **/
						, practitioner.getPrcttnrPhtTtchmntCntntTpe() /** { "tree" :"Practitioner.photo", "datatype" : "Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setContentType"} **/
						, practitioner.getPrcttnrPhtTtchmntLngge() /** { "tree" :"Practitioner.photo", "datatype" : "Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setLanguage"} **/
						, practitioner.getPrcttnrPhtTtchmntCrtn() /** { "tree" :"Practitioner.photo", "datatype" : "Attachment, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setCreation"} **/
						, practitioner.getPrcttnrPhtTtchmntTtle() /** { "tree" :"Practitioner.photo", "datatype" : "Attachment, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setTitle"} **/
						, practitioner.getPractitionerPhotoAttachmentSize() /** { "tree" :"Practitioner.photo", "datatype" : "Attachment, unsignedInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setSize"} **/
						, practitioner.getPractitionerPhotoAttachmentUrl() /** { "tree" :"Practitioner.photo", "datatype" : "Attachment, url", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPhoto, setUrl"} **/
						));
Practitionerobj.addIdentifier(HapiFHIRHelpers.createIdentifier(practitioner.getPrcttnrQlfctnDntfrDntfrSe() /** { "tree" :"Practitioner.qualification.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : ["addQualification"] , "methodName" : "addIdentifier, setUse"} **/
						, practitioner.getPrcttnrQlfctnDntfrDntfrTpCcCSstm() /** { "tree" :"Practitioner.qualification.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addQualification"] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, practitioner.getPrcttnrQlfctnDntfrDntfrTpCcCVrsn() /** { "tree" :"Practitioner.qualification.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addQualification"] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, practitioner.getPrcttnrQlfctnDntfrDntfrTpCcCCde() /** { "tree" :"Practitioner.qualification.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addQualification"] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, practitioner.getPrcttnrQlfctnDntfrDntfrTpCcCDsplay() /** { "tree" :"Practitioner.qualification.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addQualification"] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, practitioner.getPrcttnrQlfctnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Practitioner.qualification.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addQualification"] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, practitioner.getPrcttnrQlfctnDntfrDntfrTpCcTxt() /** { "tree" :"Practitioner.qualification.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addQualification"] , "methodName" : "addIdentifier, setType, setText"} **/
						, practitioner.getPrcttnrQlfctnDntfrDntfrPrdPrdStrt() /** { "tree" :"Practitioner.qualification.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : ["addQualification"] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, practitioner.getPrcttnrQlfctnDntfrDntfrPrdPrdNd() /** { "tree" :"Practitioner.qualification.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : ["addQualification"] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, practitioner.getPrcttnrQlfctnDntfrDntfrSsgnr() /** { "tree" :"Practitioner.qualification.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : ["addQualification"] , "methodName" : "addIdentifier, setAssigner"} **/
						, practitioner.getPrcttnrQlfctnDntfrDntfrVlue() /** { "tree" :"Practitioner.qualification.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : ["addQualification"] , "methodName" : "addIdentifier, setValue"} **/
						, practitioner.getPrcttnrQlfctnDntfrDntfrSstm() /** { "tree" :"Practitioner.qualification.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : ["addQualification"] , "methodName" : "addIdentifier, setSystem"} **/
						));
Practitionerobj.setCode(HapiFHIRHelpers.createCodeableConcept(practitioner.getPrcttnrQlfctnCdCcCdngCSstm() /** { "tree" :"Practitioner.qualification.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addQualification"] , "methodName" : "setCode, addCoding, setSystem"} **/
						, practitioner.getPrcttnrQlfctnCdCcCdngCVrsn() /** { "tree" :"Practitioner.qualification.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addQualification"] , "methodName" : "setCode, addCoding, setVersion"} **/
						, practitioner.getPrcttnrQlfctnCdCcCdngCCde() /** { "tree" :"Practitioner.qualification.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addQualification"] , "methodName" : "setCode, addCoding, setCode"} **/
						, practitioner.getPrcttnrQlfctnCdCcCdngCDsplay() /** { "tree" :"Practitioner.qualification.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addQualification"] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, practitioner.getPrcttnrQlfctnCdCcCdngCSrSlctd() /** { "tree" :"Practitioner.qualification.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addQualification"] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, practitioner.getPrcttnrQlfctnCdCcTxt() /** { "tree" :"Practitioner.qualification.code", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addQualification"] , "methodName" : "setCode, setText"} **/
						));
Practitionerobj.setPeriod(HapiFHIRHelpers.createPeriod(practitioner.getPrcttnrQlfctnPrdPrdStrt() /** { "tree" :"Practitioner.qualification.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addQualification"] , "methodName" : "setPeriod, setStart"} **/
						, practitioner.getPrcttnrQlfctnPrdPrdNd() /** { "tree" :"Practitioner.qualification.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addQualification"] , "methodName" : "setPeriod, setEnd"} **/
						));
Practitionerobj.setIssuer(HapiFHIRHelpers.createReference(practitioner.getPrcttnrQlfctnSsrRfrnce() /** { "tree" :"Practitioner.qualification.issuer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addQualification"] , "methodName" : "setIssuer"} **/
						));
Practitionerobj.addCommunication(HapiFHIRHelpers.createCodeableConcept(practitioner.getPrcttnrCmmnctnCcCdngCSstm() /** { "tree" :"Practitioner.communication", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCommunication, addCoding, setSystem"} **/
						, practitioner.getPrcttnrCmmnctnCcCdngCVrsn() /** { "tree" :"Practitioner.communication", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCommunication, addCoding, setVersion"} **/
						, practitioner.getPrcttnrCmmnctnCcCdngCCde() /** { "tree" :"Practitioner.communication", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCommunication, addCoding, setCode"} **/
						, practitioner.getPrcttnrCmmnctnCcCdngCDsplay() /** { "tree" :"Practitioner.communication", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCommunication, addCoding, setDisplay"} **/
						, practitioner.getPrcttnrCmmnctnCcCdngCSrSlctd() /** { "tree" :"Practitioner.communication", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCommunication, addCoding, setUserSelected"} **/
						, practitioner.getPractitionerCommunicationCcText() /** { "tree" :"Practitioner.communication", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCommunication, setText"} **/
		));
	}
}
