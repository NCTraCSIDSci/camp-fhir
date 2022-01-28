package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Capabilitystatement.
 * @see .Capabilitystatement
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class CapabilitystatementConversion 
{
	public Patient Capabilitystatements(main.templateoutput.Model.Capabilitystatement capabilitystatement) 
	{
			Patient  Capabilitystatementobj = new Patient(); 

						Capabilitystatementobj.setUrl(HapiFHIRHelpers.createuri(capabilitystatement.getCapabilityStatementUrlUri() /** { "tree" :"CapabilityStatement.url", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Capabilitystatementobj.setVersion(HapiFHIRHelpers.createstring(capabilitystatement.getCapabilityStatementVersionString() /** { "tree" :"CapabilityStatement.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Capabilitystatementobj.setName(HapiFHIRHelpers.createstring(capabilitystatement.getCapabilityStatementNameString() /** { "tree" :"CapabilityStatement.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Capabilitystatementobj.setTitle(HapiFHIRHelpers.createstring(capabilitystatement.getCapabilityStatementTitleString() /** { "tree" :"CapabilityStatement.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Capabilitystatementobj.setStatus(HapiFHIRHelpers.createcode(capabilitystatement.getCapabilityStatementStatusCode() /** { "tree" :"CapabilityStatement.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Capabilitystatementobj.setExperimental(HapiFHIRHelpers.createboolean(capabilitystatement.getCpbltSttmntXprmntlBln() /** { "tree" :"CapabilityStatement.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Capabilitystatementobj.setDate(HapiFHIRHelpers.createdateTime(capabilitystatement.getCapabilityStatementDateDateTime() /** { "tree" :"CapabilityStatement.date", "datatype" : "dateTime", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Capabilitystatementobj.setPublisher(HapiFHIRHelpers.createstring(capabilitystatement.getCpbltSttmntPblshrStrng() /** { "tree" :"CapabilityStatement.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Capabilitystatementobj.addContact(HapiFHIRHelpers.createContactDetail(capabilitystatement.getCpbltSttmntCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"CapabilityStatement.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, capabilitystatement.getCpbltSttmntCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"CapabilityStatement.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, capabilitystatement.getCpbltSttmntCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"CapabilityStatement.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, capabilitystatement.getCpbltSttmntCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"CapabilityStatement.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, capabilitystatement.getCpbltSttmntCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"CapabilityStatement.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, capabilitystatement.getCpbltSttmntCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"CapabilityStatement.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, capabilitystatement.getCpbltSttmntCntctCntctDtlNme() /** { "tree" :"CapabilityStatement.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Capabilitystatementobj.setDescription(HapiFHIRHelpers.createmarkdown(capabilitystatement.getCpbltSttmntDscrptnMrkdwn() /** { "tree" :"CapabilityStatement.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Capabilitystatementobj.addUseContext(HapiFHIRHelpers.createUsageContext(capabilitystatement.getCpbltSttmntSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"CapabilityStatement.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, capabilitystatement.getCpbltSttmntSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"CapabilityStatement.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, capabilitystatement.getCpbltSttmntSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"CapabilityStatement.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, capabilitystatement.getCpbltSttmntSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"CapabilityStatement.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, capabilitystatement.getCpbltSttmntSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"CapabilityStatement.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, capabilitystatement.getCpbltSttmntSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"CapabilityStatement.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, capabilitystatement.getCpbltSttmntSCntxtSgCntxtCdCSstm() /** { "tree" :"CapabilityStatement.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, capabilitystatement.getCpbltSttmntSCntxtSgCntxtCdCVrsn() /** { "tree" :"CapabilityStatement.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, capabilitystatement.getCpbltSttmntSCntxtSgCntxtCdCCde() /** { "tree" :"CapabilityStatement.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, capabilitystatement.getCpbltSttmntSCntxtSgCntxtCdCDsplay() /** { "tree" :"CapabilityStatement.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, capabilitystatement.getCpbltSttmntSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"CapabilityStatement.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, capabilitystatement.getCpbltSttmntSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"CapabilityStatement.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, capabilitystatement.getCpbltSttmntSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"CapabilityStatement.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, capabilitystatement.getCpbltSttmntSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"CapabilityStatement.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, capabilitystatement.getCpbltSttmntSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"CapabilityStatement.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, capabilitystatement.getCpbltSttmntSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"CapabilityStatement.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, capabilitystatement.getCpbltSttmntSCntxtSgCntxtVlRngRngLw() /** { "tree" :"CapabilityStatement.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, capabilitystatement.getCpbltSttmntSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"CapabilityStatement.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, capabilitystatement.getCpbltSttmntSCntxtSgCntxtVlRfrnce() /** { "tree" :"CapabilityStatement.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Capabilitystatementobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(capabilitystatement.getCpbltSttmntJrsdctnCcCdngCSstm() /** { "tree" :"CapabilityStatement.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, capabilitystatement.getCpbltSttmntJrsdctnCcCdngCVrsn() /** { "tree" :"CapabilityStatement.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, capabilitystatement.getCpbltSttmntJrsdctnCcCdngCCde() /** { "tree" :"CapabilityStatement.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, capabilitystatement.getCpbltSttmntJrsdctnCcCdngCDsplay() /** { "tree" :"CapabilityStatement.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, capabilitystatement.getCpbltSttmntJrsdctnCcCdngCSrSlctd() /** { "tree" :"CapabilityStatement.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, capabilitystatement.getCpbltSttmntJrsdctnCcTxt() /** { "tree" :"CapabilityStatement.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Capabilitystatementobj.setPurpose(HapiFHIRHelpers.createmarkdown(capabilitystatement.getCpbltSttmntPrpsMrkdwn() /** { "tree" :"CapabilityStatement.purpose", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPurpose"} **/
						));
Capabilitystatementobj.setCopyright(HapiFHIRHelpers.createmarkdown(capabilitystatement.getCpbltSttmntCprghtMrkdwn() /** { "tree" :"CapabilityStatement.copyright", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCopyright"} **/
						));
Capabilitystatementobj.setKind(HapiFHIRHelpers.createcode(capabilitystatement.getCapabilityStatementKindCode() /** { "tree" :"CapabilityStatement.kind", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setKind"} **/
						));
Capabilitystatementobj.addInstantiates(HapiFHIRHelpers.createcanonical(capabilitystatement.getCpbltSttmntNstnttsCnncl() /** { "tree" :"CapabilityStatement.instantiates", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInstantiates"} **/
						));
Capabilitystatementobj.addImports(HapiFHIRHelpers.createcanonical(capabilitystatement.getCpbltSttmntMprtsCnncl() /** { "tree" :"CapabilityStatement.imports", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addImports"} **/
						));
Capabilitystatementobj.setName(HapiFHIRHelpers.createstring(capabilitystatement.getCpbltSttmntSftwrNmStrng() /** { "tree" :"CapabilityStatement.software.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["setSoftware"] , "methodName" : "setName"} **/
						));
Capabilitystatementobj.setVersion(HapiFHIRHelpers.createstring(capabilitystatement.getCpbltSttmntSftwrVrsnStrng() /** { "tree" :"CapabilityStatement.software.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSoftware"] , "methodName" : "setVersion"} **/
						));
Capabilitystatementobj.setReleaseDate(HapiFHIRHelpers.createdateTime(capabilitystatement.getCpbltSttmntSftwrRlsDtDtTme() /** { "tree" :"CapabilityStatement.software.releaseDate", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setSoftware"] , "methodName" : "setReleaseDate"} **/
						));
Capabilitystatementobj.setDescription(HapiFHIRHelpers.createstring(capabilitystatement.getCpbltSttmntMplmnttnDscrptnStrng() /** { "tree" :"CapabilityStatement.implementation.description", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["setImplementation"] , "methodName" : "setDescription"} **/
						));
Capabilitystatementobj.setUrl(HapiFHIRHelpers.createurl(capabilitystatement.getCpbltSttmntMplmnttnRlRl() /** { "tree" :"CapabilityStatement.implementation.url", "datatype" : "url", "cardinality" : "ZeroOne", "elementtree" : ["setImplementation"] , "methodName" : "setUrl"} **/
						));
Capabilitystatementobj.setCustodian(HapiFHIRHelpers.createReference(capabilitystatement.getCpbltSttmntMplmnttnCstdnRfrnce() /** { "tree" :"CapabilityStatement.implementation.custodian", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["setImplementation"] , "methodName" : "setCustodian"} **/
						));
Capabilitystatementobj.setFhirVersion(HapiFHIRHelpers.createcode(capabilitystatement.getCpbltSttmntFhrVrsnCde() /** { "tree" :"CapabilityStatement.fhirVersion", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setFhirVersion"} **/
						));
Capabilitystatementobj.setFormat(HapiFHIRHelpers.createcode(capabilitystatement.getCapabilityStatementFormatCode() /** { "tree" :"CapabilityStatement.format", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setFormat"} **/
						));
Capabilitystatementobj.addPatchFormat(HapiFHIRHelpers.createcode(capabilitystatement.getCpbltSttmntPtchFrmtCde() /** { "tree" :"CapabilityStatement.patchFormat", "datatype" : "code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPatchFormat"} **/
						));
Capabilitystatementobj.addImplementationGuide(HapiFHIRHelpers.createcanonical(capabilitystatement.getCpbltSttmntMplmnttnGdCnncl() /** { "tree" :"CapabilityStatement.implementationGuide", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addImplementationGuide"} **/
						));
Capabilitystatementobj.setMode(HapiFHIRHelpers.createcode(capabilitystatement.getCapabilityStatementRestModeCode() /** { "tree" :"CapabilityStatement.rest.mode", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addRest"] , "methodName" : "setMode"} **/
						));
Capabilitystatementobj.setDocumentation(HapiFHIRHelpers.createmarkdown(capabilitystatement.getCpbltSttmntRstDcmnttnMrkdwn() /** { "tree" :"CapabilityStatement.rest.documentation", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["addRest"] , "methodName" : "setDocumentation"} **/
						));
Capabilitystatementobj.setCors(HapiFHIRHelpers.createboolean(capabilitystatement.getCpbltSttmntRstScrtCrsBln() /** { "tree" :"CapabilityStatement.rest.security.cors", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addRest", "setSecurity"] , "methodName" : "setCors"} **/
						));
Capabilitystatementobj.addService(HapiFHIRHelpers.createCodeableConcept(capabilitystatement.getCpbltSttmntRstScrtSrvcCcCdngCSstm() /** { "tree" :"CapabilityStatement.rest.security.service", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addRest", "setSecurity"] , "methodName" : "addService, addCoding, setSystem"} **/
						, capabilitystatement.getCpbltSttmntRstScrtSrvcCcCdngCVrsn() /** { "tree" :"CapabilityStatement.rest.security.service", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addRest", "setSecurity"] , "methodName" : "addService, addCoding, setVersion"} **/
						, capabilitystatement.getCpbltSttmntRstScrtSrvcCcCdngCCde() /** { "tree" :"CapabilityStatement.rest.security.service", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addRest", "setSecurity"] , "methodName" : "addService, addCoding, setCode"} **/
						, capabilitystatement.getCpbltSttmntRstScrtSrvcCcCdngCDsplay() /** { "tree" :"CapabilityStatement.rest.security.service", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addRest", "setSecurity"] , "methodName" : "addService, addCoding, setDisplay"} **/
						, capabilitystatement.getCpbltSttmntRstScrtSrvcCcCdngCSrSlctd() /** { "tree" :"CapabilityStatement.rest.security.service", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addRest", "setSecurity"] , "methodName" : "addService, addCoding, setUserSelected"} **/
						, capabilitystatement.getCpbltSttmntRstScrtSrvcCcTxt() /** { "tree" :"CapabilityStatement.rest.security.service", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addRest", "setSecurity"] , "methodName" : "addService, setText"} **/
						));
Capabilitystatementobj.setDescription(HapiFHIRHelpers.createmarkdown(capabilitystatement.getCpbltSttmntRstScrtDscrptnMrkdwn() /** { "tree" :"CapabilityStatement.rest.security.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["addRest", "setSecurity"] , "methodName" : "setDescription"} **/
						));
Capabilitystatementobj.setType(HapiFHIRHelpers.createcode(capabilitystatement.getCpbltSttmntRstRsrcTpCde() /** { "tree" :"CapabilityStatement.rest.resource.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addRest", "setSecurity", "addResource"] , "methodName" : "setType"} **/
						));
Capabilitystatementobj.setProfile(HapiFHIRHelpers.createcanonical(capabilitystatement.getCpbltSttmntRstRsrcPrflCnncl() /** { "tree" :"CapabilityStatement.rest.resource.profile", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : ["addRest", "setSecurity", "addResource"] , "methodName" : "setProfile"} **/
						));
Capabilitystatementobj.addSupportedProfile(HapiFHIRHelpers.createcanonical(capabilitystatement.getCpbltSttmntRstRsrcSpprtdPrflCnncl() /** { "tree" :"CapabilityStatement.rest.resource.supportedProfile", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : ["addRest", "setSecurity", "addResource"] , "methodName" : "addSupportedProfile"} **/
						));
Capabilitystatementobj.setDocumentation(HapiFHIRHelpers.createmarkdown(capabilitystatement.getCpbltSttmntRstRsrcDcmnttnMrkdwn() /** { "tree" :"CapabilityStatement.rest.resource.documentation", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["addRest", "setSecurity", "addResource"] , "methodName" : "setDocumentation"} **/
						));
Capabilitystatementobj.setCode(HapiFHIRHelpers.createcode(capabilitystatement.getCpbltSttmntRstRsrcNtrctnCdCde() /** { "tree" :"CapabilityStatement.rest.resource.interaction.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction"] , "methodName" : "setCode"} **/
						));
Capabilitystatementobj.setDocumentation(HapiFHIRHelpers.createmarkdown(capabilitystatement.getCpbltSttmntRstRsrcNtrctnDcmnttnMrkdwn() /** { "tree" :"CapabilityStatement.rest.resource.interaction.documentation", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction"] , "methodName" : "setDocumentation"} **/
						));
Capabilitystatementobj.setVersioning(HapiFHIRHelpers.createcode(capabilitystatement.getCpbltSttmntRstRsrcVrsnngCde() /** { "tree" :"CapabilityStatement.rest.resource.versioning", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction"] , "methodName" : "setVersioning"} **/
						));
Capabilitystatementobj.setReadHistory(HapiFHIRHelpers.createboolean(capabilitystatement.getCpbltSttmntRstRsrcRdHstrBln() /** { "tree" :"CapabilityStatement.rest.resource.readHistory", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction"] , "methodName" : "setReadHistory"} **/
						));
Capabilitystatementobj.setUpdateCreate(HapiFHIRHelpers.createboolean(capabilitystatement.getCpbltSttmntRstRsrcPdtCrtBln() /** { "tree" :"CapabilityStatement.rest.resource.updateCreate", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction"] , "methodName" : "setUpdateCreate"} **/
						));
Capabilitystatementobj.setConditionalCreate(HapiFHIRHelpers.createboolean(capabilitystatement.getCpbltSttmntRstRsrcCndtnlCrtBln() /** { "tree" :"CapabilityStatement.rest.resource.conditionalCreate", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction"] , "methodName" : "setConditionalCreate"} **/
						));
Capabilitystatementobj.setConditionalRead(HapiFHIRHelpers.createcode(capabilitystatement.getCpbltSttmntRstRsrcCndtnlRdCde() /** { "tree" :"CapabilityStatement.rest.resource.conditionalRead", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction"] , "methodName" : "setConditionalRead"} **/
						));
Capabilitystatementobj.setConditionalUpdate(HapiFHIRHelpers.createboolean(capabilitystatement.getCpbltSttmntRstRsrcCndtnlpdtBln() /** { "tree" :"CapabilityStatement.rest.resource.conditionalUpdate", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction"] , "methodName" : "setConditionalUpdate"} **/
						));
Capabilitystatementobj.setConditionalDelete(HapiFHIRHelpers.createcode(capabilitystatement.getCpbltSttmntRstRsrcCndtnlDltCde() /** { "tree" :"CapabilityStatement.rest.resource.conditionalDelete", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction"] , "methodName" : "setConditionalDelete"} **/
						));
Capabilitystatementobj.addReferencePolicy(HapiFHIRHelpers.createcode(capabilitystatement.getCpbltSttmntRstRsrcRfrncPlcCde() /** { "tree" :"CapabilityStatement.rest.resource.referencePolicy", "datatype" : "code", "cardinality" : "Many", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction"] , "methodName" : "addReferencePolicy"} **/
						));
Capabilitystatementobj.addSearchInclude(HapiFHIRHelpers.createstring(capabilitystatement.getCpbltSttmntRstRsrcSrchncldStrng() /** { "tree" :"CapabilityStatement.rest.resource.searchInclude", "datatype" : "string", "cardinality" : "Many", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction"] , "methodName" : "addSearchInclude"} **/
						));
Capabilitystatementobj.addSearchRevInclude(HapiFHIRHelpers.createstring(capabilitystatement.getCpbltSttmntRstRsrcSrchRvncldStrng() /** { "tree" :"CapabilityStatement.rest.resource.searchRevInclude", "datatype" : "string", "cardinality" : "Many", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction"] , "methodName" : "addSearchRevInclude"} **/
						));
Capabilitystatementobj.setName(HapiFHIRHelpers.createstring(capabilitystatement.getCpbltSttmntRstRsrcSrchPrmNmStrng() /** { "tree" :"CapabilityStatement.rest.resource.searchParam.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction", "addSearchParam"] , "methodName" : "setName"} **/
						));
Capabilitystatementobj.setDefinition(HapiFHIRHelpers.createcanonical(capabilitystatement.getCpbltSttmntRstRsrcSrchPrmDfntnCnncl() /** { "tree" :"CapabilityStatement.rest.resource.searchParam.definition", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction", "addSearchParam"] , "methodName" : "setDefinition"} **/
						));
Capabilitystatementobj.setType(HapiFHIRHelpers.createcode(capabilitystatement.getCpbltSttmntRstRsrcSrchPrmTpCde() /** { "tree" :"CapabilityStatement.rest.resource.searchParam.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction", "addSearchParam"] , "methodName" : "setType"} **/
						));
Capabilitystatementobj.setDocumentation(HapiFHIRHelpers.createmarkdown(capabilitystatement.getCpbltSttmntRstRsrcSrchPrmDcmnttnMrkdwn() /** { "tree" :"CapabilityStatement.rest.resource.searchParam.documentation", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction", "addSearchParam"] , "methodName" : "setDocumentation"} **/
						));
Capabilitystatementobj.setName(HapiFHIRHelpers.createstring(capabilitystatement.getCpbltSttmntRstRsrcPrtnNmStrng() /** { "tree" :"CapabilityStatement.rest.resource.operation.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction", "addSearchParam", "addOperation"] , "methodName" : "setName"} **/
						));
Capabilitystatementobj.setDefinition(HapiFHIRHelpers.createcanonical(capabilitystatement.getCpbltSttmntRstRsrcPrtnDfntnCnncl() /** { "tree" :"CapabilityStatement.rest.resource.operation.definition", "datatype" : "canonical", "cardinality" : "Required", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction", "addSearchParam", "addOperation"] , "methodName" : "setDefinition"} **/
						));
Capabilitystatementobj.setDocumentation(HapiFHIRHelpers.createmarkdown(capabilitystatement.getCpbltSttmntRstRsrcPrtnDcmnttnMrkdwn() /** { "tree" :"CapabilityStatement.rest.resource.operation.documentation", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction", "addSearchParam", "addOperation"] , "methodName" : "setDocumentation"} **/
						));
Capabilitystatementobj.setCode(HapiFHIRHelpers.createcode(capabilitystatement.getCpbltSttmntRstNtrctnCdCde() /** { "tree" :"CapabilityStatement.rest.interaction.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction", "addSearchParam", "addOperation", "addInteraction"] , "methodName" : "setCode"} **/
						));
Capabilitystatementobj.setDocumentation(HapiFHIRHelpers.createmarkdown(capabilitystatement.getCpbltSttmntRstNtrctnDcmnttnMrkdwn() /** { "tree" :"CapabilityStatement.rest.interaction.documentation", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction", "addSearchParam", "addOperation", "addInteraction"] , "methodName" : "setDocumentation"} **/
						));
Capabilitystatementobj.addSearchParam(HapiFHIRHelpers.createsearchParam(capabilitystatement.getCpbltSttmntRstSrchPrmSrchPrm() /** { "tree" :"CapabilityStatement.rest.searchParam", "datatype" : "searchParam", "cardinality" : "Many", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction", "addSearchParam", "addOperation", "addInteraction"] , "methodName" : "addSearchParam"} **/
						));
Capabilitystatementobj.addOperation(HapiFHIRHelpers.createoperation(capabilitystatement.getCpbltSttmntRstPrtnPrtn() /** { "tree" :"CapabilityStatement.rest.operation", "datatype" : "operation", "cardinality" : "Many", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction", "addSearchParam", "addOperation", "addInteraction"] , "methodName" : "addOperation"} **/
						));
Capabilitystatementobj.addCompartment(HapiFHIRHelpers.createcanonical(capabilitystatement.getCpbltSttmntRstCmprtmntCnncl() /** { "tree" :"CapabilityStatement.rest.compartment", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : ["addRest", "setSecurity", "addResource", "addInteraction", "addSearchParam", "addOperation", "addInteraction"] , "methodName" : "addCompartment"} **/
						));
Capabilitystatementobj.setProtocol(HapiFHIRHelpers.createCoding(capabilitystatement.getCpbltSttmntMssgngNdpntPrtclCSrSlctd() /** { "tree" :"CapabilityStatement.messaging.endpoint.protocol", "datatype" : "Coding, boolean", "cardinality" : "Required", "elementtree" : ["addMessaging", "addEndpoint"] , "methodName" : "setProtocol, setUserSelected"} **/
						, capabilitystatement.getCpbltSttmntMssgngNdpntPrtclCCde() /** { "tree" :"CapabilityStatement.messaging.endpoint.protocol", "datatype" : "Coding, code", "cardinality" : "Required", "elementtree" : ["addMessaging", "addEndpoint"] , "methodName" : "setProtocol, setCode"} **/
						, capabilitystatement.getCpbltSttmntMssgngNdpntPrtclCVrsn() /** { "tree" :"CapabilityStatement.messaging.endpoint.protocol", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addMessaging", "addEndpoint"] , "methodName" : "setProtocol, setVersion"} **/
						, capabilitystatement.getCpbltSttmntMssgngNdpntPrtclCDsplay() /** { "tree" :"CapabilityStatement.messaging.endpoint.protocol", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addMessaging", "addEndpoint"] , "methodName" : "setProtocol, setDisplay"} **/
						, capabilitystatement.getCpbltSttmntMssgngNdpntPrtclCSstm() /** { "tree" :"CapabilityStatement.messaging.endpoint.protocol", "datatype" : "Coding, uri", "cardinality" : "Required", "elementtree" : ["addMessaging", "addEndpoint"] , "methodName" : "setProtocol, setSystem"} **/
						));
Capabilitystatementobj.setAddress(HapiFHIRHelpers.createurl(capabilitystatement.getCpbltSttmntMssgngNdpntDdrssRl() /** { "tree" :"CapabilityStatement.messaging.endpoint.address", "datatype" : "url", "cardinality" : "Required", "elementtree" : ["addMessaging", "addEndpoint"] , "methodName" : "setAddress"} **/
						));
Capabilitystatementobj.setReliableCache(HapiFHIRHelpers.createunsignedInt(capabilitystatement.getCpbltSttmntMssgngRlblCchNsgndnt() /** { "tree" :"CapabilityStatement.messaging.reliableCache", "datatype" : "unsignedInt", "cardinality" : "ZeroOne", "elementtree" : ["addMessaging", "addEndpoint"] , "methodName" : "setReliableCache"} **/
						));
Capabilitystatementobj.setDocumentation(HapiFHIRHelpers.createmarkdown(capabilitystatement.getCpbltSttmntMssgngDcmnttnMrkdwn() /** { "tree" :"CapabilityStatement.messaging.documentation", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["addMessaging", "addEndpoint"] , "methodName" : "setDocumentation"} **/
						));
Capabilitystatementobj.setMode(HapiFHIRHelpers.createcode(capabilitystatement.getCpbltSttmntMssgngSpprtdMssgMdCde() /** { "tree" :"CapabilityStatement.messaging.supportedMessage.mode", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addMessaging", "addEndpoint", "addSupportedMessage"] , "methodName" : "setMode"} **/
						));
Capabilitystatementobj.setDefinition(HapiFHIRHelpers.createcanonical(capabilitystatement.getCpbltSttmntMssgngSpprtdMssgDfntnCnncl() /** { "tree" :"CapabilityStatement.messaging.supportedMessage.definition", "datatype" : "canonical", "cardinality" : "Required", "elementtree" : ["addMessaging", "addEndpoint", "addSupportedMessage"] , "methodName" : "setDefinition"} **/
						));
Capabilitystatementobj.setMode(HapiFHIRHelpers.createcode(capabilitystatement.getCpbltSttmntDcmntMdCde() /** { "tree" :"CapabilityStatement.document.mode", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addDocument"] , "methodName" : "setMode"} **/
						));
Capabilitystatementobj.setDocumentation(HapiFHIRHelpers.createmarkdown(capabilitystatement.getCpbltSttmntDcmntDcmnttnMrkdwn() /** { "tree" :"CapabilityStatement.document.documentation", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["addDocument"] , "methodName" : "setDocumentation"} **/
						));
Capabilitystatementobj.setProfile(HapiFHIRHelpers.createcanonical(capabilitystatement.getCpbltSttmntDcmntPrflCnncl() /** { "tree" :"CapabilityStatement.document.profile", "datatype" : "canonical", "cardinality" : "Required", "elementtree" : ["addDocument"] , "methodName" : "setProfile"} **/
		));
	}
}
