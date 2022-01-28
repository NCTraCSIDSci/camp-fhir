package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Healthcareservice.
 * @see .Healthcareservice
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class HealthcareserviceConversion 
{
	public Patient Healthcareservices(main.templateoutput.Model.Healthcareservice healthcareservice) 
	{
			Patient  Healthcareserviceobj = new Patient(); 

						Healthcareserviceobj.addIdentifier(HapiFHIRHelpers.createIdentifier(healthcareservice.getHlthcrSrvcDntfrDntfrSe() /** { "tree" :"HealthcareService.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, healthcareservice.getHlthcrSrvcDntfrDntfrTpCcCSstm() /** { "tree" :"HealthcareService.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, healthcareservice.getHlthcrSrvcDntfrDntfrTpCcCVrsn() /** { "tree" :"HealthcareService.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, healthcareservice.getHlthcrSrvcDntfrDntfrTpCcCCde() /** { "tree" :"HealthcareService.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, healthcareservice.getHlthcrSrvcDntfrDntfrTpCcCDsplay() /** { "tree" :"HealthcareService.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, healthcareservice.getHlthcrSrvcDntfrDntfrTpCcCSrSlctd() /** { "tree" :"HealthcareService.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, healthcareservice.getHlthcrSrvcDntfrDntfrTpCcTxt() /** { "tree" :"HealthcareService.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, healthcareservice.getHlthcrSrvcDntfrDntfrPrdPrdStrt() /** { "tree" :"HealthcareService.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, healthcareservice.getHlthcrSrvcDntfrDntfrPrdPrdNd() /** { "tree" :"HealthcareService.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, healthcareservice.getHlthcrSrvcDntfrDntfrSsgnr() /** { "tree" :"HealthcareService.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, healthcareservice.getHlthcrSrvcDntfrDntfrVlue() /** { "tree" :"HealthcareService.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, healthcareservice.getHlthcrSrvcDntfrDntfrSstm() /** { "tree" :"HealthcareService.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Healthcareserviceobj.setActive(HapiFHIRHelpers.createboolean(healthcareservice.getHealthcareServiceActiveBoolean() /** { "tree" :"HealthcareService.active", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActive"} **/
						));
Healthcareserviceobj.setProvidedBy(HapiFHIRHelpers.createReference(healthcareservice.getHlthcrSrvcPrvddBRfrnce() /** { "tree" :"HealthcareService.providedBy", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProvidedBy"} **/
						));
Healthcareserviceobj.addCategory(HapiFHIRHelpers.createCodeableConcept(healthcareservice.getHlthcrSrvcCtgrCcCdngCSstm() /** { "tree" :"HealthcareService.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setSystem"} **/
						, healthcareservice.getHlthcrSrvcCtgrCcCdngCVrsn() /** { "tree" :"HealthcareService.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setVersion"} **/
						, healthcareservice.getHlthcrSrvcCtgrCcCdngCCde() /** { "tree" :"HealthcareService.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setCode"} **/
						, healthcareservice.getHlthcrSrvcCtgrCcCdngCDsplay() /** { "tree" :"HealthcareService.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setDisplay"} **/
						, healthcareservice.getHlthcrSrvcCtgrCcCdngCSrSlctd() /** { "tree" :"HealthcareService.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setUserSelected"} **/
						, healthcareservice.getHealthcareServiceCategoryCcText() /** { "tree" :"HealthcareService.category", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, setText"} **/
						));
Healthcareserviceobj.addType(HapiFHIRHelpers.createCodeableConcept(healthcareservice.getHlthcrSrvcTpCcCdngCSstm() /** { "tree" :"HealthcareService.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setSystem"} **/
						, healthcareservice.getHlthcrSrvcTpCcCdngCVrsn() /** { "tree" :"HealthcareService.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setVersion"} **/
						, healthcareservice.getHlthcrSrvcTpCcCdngCCde() /** { "tree" :"HealthcareService.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setCode"} **/
						, healthcareservice.getHlthcrSrvcTpCcCdngCDsplay() /** { "tree" :"HealthcareService.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setDisplay"} **/
						, healthcareservice.getHlthcrSrvcTpCcCdngCSrSlctd() /** { "tree" :"HealthcareService.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setUserSelected"} **/
						, healthcareservice.getHealthcareServiceTypeCcText() /** { "tree" :"HealthcareService.type", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, setText"} **/
						));
Healthcareserviceobj.addSpecialty(HapiFHIRHelpers.createCodeableConcept(healthcareservice.getHlthcrSrvcSpcltCcCdngCSstm() /** { "tree" :"HealthcareService.specialty", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setSystem"} **/
						, healthcareservice.getHlthcrSrvcSpcltCcCdngCVrsn() /** { "tree" :"HealthcareService.specialty", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setVersion"} **/
						, healthcareservice.getHlthcrSrvcSpcltCcCdngCCde() /** { "tree" :"HealthcareService.specialty", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setCode"} **/
						, healthcareservice.getHlthcrSrvcSpcltCcCdngCDsplay() /** { "tree" :"HealthcareService.specialty", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setDisplay"} **/
						, healthcareservice.getHlthcrSrvcSpcltCcCdngCSrSlctd() /** { "tree" :"HealthcareService.specialty", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setUserSelected"} **/
						, healthcareservice.getHlthcrSrvcSpcltCcTxt() /** { "tree" :"HealthcareService.specialty", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, setText"} **/
						));
Healthcareserviceobj.addLocation(HapiFHIRHelpers.createReference(healthcareservice.getHlthcrSrvcLctnRfrnce() /** { "tree" :"HealthcareService.location", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocation"} **/
						));
Healthcareserviceobj.setName(HapiFHIRHelpers.createstring(healthcareservice.getHealthcareServiceNameString() /** { "tree" :"HealthcareService.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Healthcareserviceobj.setComment(HapiFHIRHelpers.createstring(healthcareservice.getHealthcareServiceCommentString() /** { "tree" :"HealthcareService.comment", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setComment"} **/
						));
Healthcareserviceobj.setExtraDetails(HapiFHIRHelpers.createmarkdown(healthcareservice.getHlthcrSrvcXtrDtlsMrkdwn() /** { "tree" :"HealthcareService.extraDetails", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExtraDetails"} **/
						));
Healthcareserviceobj.setPhoto(HapiFHIRHelpers.createAttachment(healthcareservice.getHlthcrSrvcPhtTtchmntDta() /** { "tree" :"HealthcareService.photo", "datatype" : "Attachment, base64Binary", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhoto, setData"} **/
						, healthcareservice.getHlthcrSrvcPhtTtchmntHsh() /** { "tree" :"HealthcareService.photo", "datatype" : "Attachment, base64Binary", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhoto, setHash"} **/
						, healthcareservice.getHlthcrSrvcPhtTtchmntCntntTpe() /** { "tree" :"HealthcareService.photo", "datatype" : "Attachment, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhoto, setContentType"} **/
						, healthcareservice.getHlthcrSrvcPhtTtchmntLngge() /** { "tree" :"HealthcareService.photo", "datatype" : "Attachment, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhoto, setLanguage"} **/
						, healthcareservice.getHlthcrSrvcPhtTtchmntCrtn() /** { "tree" :"HealthcareService.photo", "datatype" : "Attachment, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhoto, setCreation"} **/
						, healthcareservice.getHlthcrSrvcPhtTtchmntTtle() /** { "tree" :"HealthcareService.photo", "datatype" : "Attachment, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhoto, setTitle"} **/
						, healthcareservice.getHlthcrSrvcPhtTtchmntSze() /** { "tree" :"HealthcareService.photo", "datatype" : "Attachment, unsignedInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhoto, setSize"} **/
						, healthcareservice.getHlthcrSrvcPhtTtchmntRl() /** { "tree" :"HealthcareService.photo", "datatype" : "Attachment, url", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhoto, setUrl"} **/
						));
Healthcareserviceobj.addTelecom(HapiFHIRHelpers.createContactPoint(healthcareservice.getHlthcrSrvcTlcmCntctPntSstm() /** { "tree" :"HealthcareService.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setSystem"} **/
						, healthcareservice.getHlthcrSrvcTlcmCntctPntSe() /** { "tree" :"HealthcareService.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setUse"} **/
						, healthcareservice.getHlthcrSrvcTlcmCntctPntPrdPrdStrt() /** { "tree" :"HealthcareService.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setStart"} **/
						, healthcareservice.getHlthcrSrvcTlcmCntctPntPrdPrdNd() /** { "tree" :"HealthcareService.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setEnd"} **/
						, healthcareservice.getHlthcrSrvcTlcmCntctPntRnk() /** { "tree" :"HealthcareService.telecom", "datatype" : "ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setRank"} **/
						, healthcareservice.getHlthcrSrvcTlcmCntctPntVlue() /** { "tree" :"HealthcareService.telecom", "datatype" : "ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setValue"} **/
						));
Healthcareserviceobj.addCoverageArea(HapiFHIRHelpers.createReference(healthcareservice.getHlthcrSrvcCvrgrRfrnce() /** { "tree" :"HealthcareService.coverageArea", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCoverageArea"} **/
						));
Healthcareserviceobj.addServiceProvisionCode(HapiFHIRHelpers.createCodeableConcept(healthcareservice.getHlthcrSrvcSrvcPrvsnCdCcCdngCSstm() /** { "tree" :"HealthcareService.serviceProvisionCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceProvisionCode, addCoding, setSystem"} **/
						, healthcareservice.getHlthcrSrvcSrvcPrvsnCdCcCdngCVrsn() /** { "tree" :"HealthcareService.serviceProvisionCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceProvisionCode, addCoding, setVersion"} **/
						, healthcareservice.getHlthcrSrvcSrvcPrvsnCdCcCdngCCde() /** { "tree" :"HealthcareService.serviceProvisionCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceProvisionCode, addCoding, setCode"} **/
						, healthcareservice.getHlthcrSrvcSrvcPrvsnCdCcCdngCDsplay() /** { "tree" :"HealthcareService.serviceProvisionCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceProvisionCode, addCoding, setDisplay"} **/
						, healthcareservice.getHlthcrSrvcSrvcPrvsnCdCcCdngCSrSlctd() /** { "tree" :"HealthcareService.serviceProvisionCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceProvisionCode, addCoding, setUserSelected"} **/
						, healthcareservice.getHlthcrSrvcSrvcPrvsnCdCcTxt() /** { "tree" :"HealthcareService.serviceProvisionCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceProvisionCode, setText"} **/
						));
Healthcareserviceobj.setCode(HapiFHIRHelpers.createCodeableConcept(healthcareservice.getHlthcrSrvcLgbltCdCcCdngCSstm() /** { "tree" :"HealthcareService.eligibility.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addEligibility"] , "methodName" : "setCode, addCoding, setSystem"} **/
						, healthcareservice.getHlthcrSrvcLgbltCdCcCdngCVrsn() /** { "tree" :"HealthcareService.eligibility.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addEligibility"] , "methodName" : "setCode, addCoding, setVersion"} **/
						, healthcareservice.getHlthcrSrvcLgbltCdCcCdngCCde() /** { "tree" :"HealthcareService.eligibility.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addEligibility"] , "methodName" : "setCode, addCoding, setCode"} **/
						, healthcareservice.getHlthcrSrvcLgbltCdCcCdngCDsplay() /** { "tree" :"HealthcareService.eligibility.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addEligibility"] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, healthcareservice.getHlthcrSrvcLgbltCdCcCdngCSrSlctd() /** { "tree" :"HealthcareService.eligibility.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addEligibility"] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, healthcareservice.getHlthcrSrvcLgbltCdCcTxt() /** { "tree" :"HealthcareService.eligibility.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addEligibility"] , "methodName" : "setCode, setText"} **/
						));
Healthcareserviceobj.setComment(HapiFHIRHelpers.createmarkdown(healthcareservice.getHlthcrSrvcLgbltCmmntMrkdwn() /** { "tree" :"HealthcareService.eligibility.comment", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["addEligibility"] , "methodName" : "setComment"} **/
						));
Healthcareserviceobj.addProgram(HapiFHIRHelpers.createCodeableConcept(healthcareservice.getHlthcrSrvcPrgrmCcCdngCSstm() /** { "tree" :"HealthcareService.program", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProgram, addCoding, setSystem"} **/
						, healthcareservice.getHlthcrSrvcPrgrmCcCdngCVrsn() /** { "tree" :"HealthcareService.program", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProgram, addCoding, setVersion"} **/
						, healthcareservice.getHlthcrSrvcPrgrmCcCdngCCde() /** { "tree" :"HealthcareService.program", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProgram, addCoding, setCode"} **/
						, healthcareservice.getHlthcrSrvcPrgrmCcCdngCDsplay() /** { "tree" :"HealthcareService.program", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProgram, addCoding, setDisplay"} **/
						, healthcareservice.getHlthcrSrvcPrgrmCcCdngCSrSlctd() /** { "tree" :"HealthcareService.program", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProgram, addCoding, setUserSelected"} **/
						, healthcareservice.getHealthcareServiceProgramCcText() /** { "tree" :"HealthcareService.program", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProgram, setText"} **/
						));
Healthcareserviceobj.addCharacteristic(HapiFHIRHelpers.createCodeableConcept(healthcareservice.getHlthcrSrvcChrctrCcCdngCSstm() /** { "tree" :"HealthcareService.characteristic", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCharacteristic, addCoding, setSystem"} **/
						, healthcareservice.getHlthcrSrvcChrctrCcCdngCVrsn() /** { "tree" :"HealthcareService.characteristic", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCharacteristic, addCoding, setVersion"} **/
						, healthcareservice.getHlthcrSrvcChrctrCcCdngCCde() /** { "tree" :"HealthcareService.characteristic", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCharacteristic, addCoding, setCode"} **/
						, healthcareservice.getHlthcrSrvcChrctrCcCdngCDsplay() /** { "tree" :"HealthcareService.characteristic", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCharacteristic, addCoding, setDisplay"} **/
						, healthcareservice.getHlthcrSrvcChrctrCcCdngCSrSlctd() /** { "tree" :"HealthcareService.characteristic", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCharacteristic, addCoding, setUserSelected"} **/
						, healthcareservice.getHealthcareServiceChrctrCcText() /** { "tree" :"HealthcareService.characteristic", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCharacteristic, setText"} **/
						));
Healthcareserviceobj.addCommunication(HapiFHIRHelpers.createCodeableConcept(healthcareservice.getHlthcrSrvcCmmnctnCcCdngCSstm() /** { "tree" :"HealthcareService.communication", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCommunication, addCoding, setSystem"} **/
						, healthcareservice.getHlthcrSrvcCmmnctnCcCdngCVrsn() /** { "tree" :"HealthcareService.communication", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCommunication, addCoding, setVersion"} **/
						, healthcareservice.getHlthcrSrvcCmmnctnCcCdngCCde() /** { "tree" :"HealthcareService.communication", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCommunication, addCoding, setCode"} **/
						, healthcareservice.getHlthcrSrvcCmmnctnCcCdngCDsplay() /** { "tree" :"HealthcareService.communication", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCommunication, addCoding, setDisplay"} **/
						, healthcareservice.getHlthcrSrvcCmmnctnCcCdngCSrSlctd() /** { "tree" :"HealthcareService.communication", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCommunication, addCoding, setUserSelected"} **/
						, healthcareservice.getHlthcrSrvcCmmnctnCcTxt() /** { "tree" :"HealthcareService.communication", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCommunication, setText"} **/
						));
Healthcareserviceobj.addReferralMethod(HapiFHIRHelpers.createCodeableConcept(healthcareservice.getHlthcrSrvcRfrrlMthdCcCdngCSstm() /** { "tree" :"HealthcareService.referralMethod", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReferralMethod, addCoding, setSystem"} **/
						, healthcareservice.getHlthcrSrvcRfrrlMthdCcCdngCVrsn() /** { "tree" :"HealthcareService.referralMethod", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReferralMethod, addCoding, setVersion"} **/
						, healthcareservice.getHlthcrSrvcRfrrlMthdCcCdngCCde() /** { "tree" :"HealthcareService.referralMethod", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReferralMethod, addCoding, setCode"} **/
						, healthcareservice.getHlthcrSrvcRfrrlMthdCcCdngCDsplay() /** { "tree" :"HealthcareService.referralMethod", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReferralMethod, addCoding, setDisplay"} **/
						, healthcareservice.getHlthcrSrvcRfrrlMthdCcCdngCSrSlctd() /** { "tree" :"HealthcareService.referralMethod", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReferralMethod, addCoding, setUserSelected"} **/
						, healthcareservice.getHlthcrSrvcRfrrlMthdCcTxt() /** { "tree" :"HealthcareService.referralMethod", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReferralMethod, setText"} **/
						));
Healthcareserviceobj.setAppointmentRequired(HapiFHIRHelpers.createboolean(healthcareservice.getHlthcrSrvcPpntmntRqrdBln() /** { "tree" :"HealthcareService.appointmentRequired", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAppointmentRequired"} **/
						));
Healthcareserviceobj.addDaysOfWeek(HapiFHIRHelpers.createcode(healthcareservice.getHlthcrSrvcVlblTmDsfWkCde() /** { "tree" :"HealthcareService.availableTime.daysOfWeek", "datatype" : "code", "cardinality" : "Many", "elementtree" : ["addAvailableTime"] , "methodName" : "addDaysOfWeek"} **/
						));
Healthcareserviceobj.setAllDay(HapiFHIRHelpers.createboolean(healthcareservice.getHlthcrSrvcVlblTmLlDBln() /** { "tree" :"HealthcareService.availableTime.allDay", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addAvailableTime"] , "methodName" : "setAllDay"} **/
						));
Healthcareserviceobj.setAvailableStartTime(HapiFHIRHelpers.createtime(healthcareservice.getHlthcrSrvcVlblTmVlblStrtTmTme() /** { "tree" :"HealthcareService.availableTime.availableStartTime", "datatype" : "time", "cardinality" : "ZeroOne", "elementtree" : ["addAvailableTime"] , "methodName" : "setAvailableStartTime"} **/
						));
Healthcareserviceobj.setAvailableEndTime(HapiFHIRHelpers.createtime(healthcareservice.getHlthcrSrvcVlblTmVlblndTmTme() /** { "tree" :"HealthcareService.availableTime.availableEndTime", "datatype" : "time", "cardinality" : "ZeroOne", "elementtree" : ["addAvailableTime"] , "methodName" : "setAvailableEndTime"} **/
						));
Healthcareserviceobj.setDescription(HapiFHIRHelpers.createstring(healthcareservice.getHlthcrSrvcNtvlblDscrptnStrng() /** { "tree" :"HealthcareService.notAvailable.description", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addNotAvailable"] , "methodName" : "setDescription"} **/
						));
Healthcareserviceobj.setDuring(HapiFHIRHelpers.createPeriod(healthcareservice.getHlthcrSrvcNtvlblDrngPrdStrt() /** { "tree" :"HealthcareService.notAvailable.during", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addNotAvailable"] , "methodName" : "setDuring, setStart"} **/
						, healthcareservice.getHlthcrSrvcNtvlblDrngPrdNd() /** { "tree" :"HealthcareService.notAvailable.during", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addNotAvailable"] , "methodName" : "setDuring, setEnd"} **/
						));
Healthcareserviceobj.setAvailabilityExceptions(HapiFHIRHelpers.createstring(healthcareservice.getHlthcrSrvcVlbltxcptnsStrng() /** { "tree" :"HealthcareService.availabilityExceptions", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAvailabilityExceptions"} **/
						));
Healthcareserviceobj.addEndpoint(HapiFHIRHelpers.createReference(healthcareservice.getHlthcrSrvcNdpntRfrnce() /** { "tree" :"HealthcareService.endpoint", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndpoint"} **/
		));
	}
}
