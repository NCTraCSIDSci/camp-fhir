package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Testscript.
 * @see .Testscript
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class TestscriptConversion 
{
	public Patient Testscripts(main.templateoutput.Model.Testscript testscript) 
	{
			Patient  Testscriptobj = new Patient(); 

						Testscriptobj.setUrl(HapiFHIRHelpers.createuri(testscript.getTestScriptUrlUri() /** { "tree" :"TestScript.url", "datatype" : "uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Testscriptobj.setIdentifier(HapiFHIRHelpers.createIdentifier(testscript.getTstScrptDntfrDntfrSe() /** { "tree" :"TestScript.identifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setUse"} **/
						, testscript.getTstScrptDntfrDntfrTpCcCSstm() /** { "tree" :"TestScript.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setSystem"} **/
						, testscript.getTstScrptDntfrDntfrTpCcCVrsn() /** { "tree" :"TestScript.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setVersion"} **/
						, testscript.getTstScrptDntfrDntfrTpCcCCde() /** { "tree" :"TestScript.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setCode"} **/
						, testscript.getTstScrptDntfrDntfrTpCcCDsplay() /** { "tree" :"TestScript.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setDisplay"} **/
						, testscript.getTstScrptDntfrDntfrTpCcCSrSlctd() /** { "tree" :"TestScript.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setUserSelected"} **/
						, testscript.getTstScrptDntfrDntfrTpCcTxt() /** { "tree" :"TestScript.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, setText"} **/
						, testscript.getTstScrptDntfrDntfrPrdPrdStrt() /** { "tree" :"TestScript.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setPeriod, setStart"} **/
						, testscript.getTstScrptDntfrDntfrPrdPrdNd() /** { "tree" :"TestScript.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setPeriod, setEnd"} **/
						, testscript.getTstScrptDntfrDntfrSsgnr() /** { "tree" :"TestScript.identifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setAssigner"} **/
						, testscript.getTstScrptDntfrDntfrVlue() /** { "tree" :"TestScript.identifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setValue"} **/
						, testscript.getTstScrptDntfrDntfrSstm() /** { "tree" :"TestScript.identifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setSystem"} **/
						));
Testscriptobj.setVersion(HapiFHIRHelpers.createstring(testscript.getTestScriptVersionString() /** { "tree" :"TestScript.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Testscriptobj.setName(HapiFHIRHelpers.createstring(testscript.getTestScriptNameString() /** { "tree" :"TestScript.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setName"} **/
						));
Testscriptobj.setTitle(HapiFHIRHelpers.createstring(testscript.getTestScriptTitleString() /** { "tree" :"TestScript.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Testscriptobj.setStatus(HapiFHIRHelpers.createcode(testscript.getTestScriptStatusCode() /** { "tree" :"TestScript.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Testscriptobj.setExperimental(HapiFHIRHelpers.createboolean(testscript.getTestScriptExperimentalBoolean() /** { "tree" :"TestScript.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Testscriptobj.setDate(HapiFHIRHelpers.createdateTime(testscript.getTestScriptDateDateTime() /** { "tree" :"TestScript.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Testscriptobj.setPublisher(HapiFHIRHelpers.createstring(testscript.getTestScriptPublisherString() /** { "tree" :"TestScript.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Testscriptobj.addContact(HapiFHIRHelpers.createContactDetail(testscript.getTstScrptCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"TestScript.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, testscript.getTstScrptCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"TestScript.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, testscript.getTstScrptCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"TestScript.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, testscript.getTstScrptCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"TestScript.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, testscript.getTstScrptCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"TestScript.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, testscript.getTstScrptCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"TestScript.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, testscript.getTstScrptCntctCntctDtlNme() /** { "tree" :"TestScript.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Testscriptobj.setDescription(HapiFHIRHelpers.createmarkdown(testscript.getTestScriptDescriptionMarkdown() /** { "tree" :"TestScript.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Testscriptobj.addUseContext(HapiFHIRHelpers.createUsageContext(testscript.getTstScrptSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"TestScript.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, testscript.getTstScrptSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"TestScript.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, testscript.getTstScrptSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"TestScript.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, testscript.getTstScrptSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"TestScript.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, testscript.getTstScrptSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"TestScript.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, testscript.getTstScrptSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"TestScript.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, testscript.getTstScrptSCntxtSgCntxtCdCSstm() /** { "tree" :"TestScript.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, testscript.getTstScrptSCntxtSgCntxtCdCVrsn() /** { "tree" :"TestScript.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, testscript.getTstScrptSCntxtSgCntxtCdCCde() /** { "tree" :"TestScript.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, testscript.getTstScrptSCntxtSgCntxtCdCDsplay() /** { "tree" :"TestScript.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, testscript.getTstScrptSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"TestScript.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, testscript.getTstScrptSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"TestScript.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, testscript.getTstScrptSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"TestScript.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, testscript.getTstScrptSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"TestScript.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, testscript.getTstScrptSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"TestScript.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, testscript.getTstScrptSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"TestScript.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, testscript.getTstScrptSCntxtSgCntxtVlRngRngLw() /** { "tree" :"TestScript.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, testscript.getTstScrptSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"TestScript.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, testscript.getTstScrptSCntxtSgCntxtVlRfrnce() /** { "tree" :"TestScript.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Testscriptobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(testscript.getTstScrptJrsdctnCcCdngCSstm() /** { "tree" :"TestScript.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, testscript.getTstScrptJrsdctnCcCdngCVrsn() /** { "tree" :"TestScript.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, testscript.getTstScrptJrsdctnCcCdngCCde() /** { "tree" :"TestScript.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, testscript.getTstScrptJrsdctnCcCdngCDsplay() /** { "tree" :"TestScript.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, testscript.getTstScrptJrsdctnCcCdngCSrSlctd() /** { "tree" :"TestScript.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, testscript.getTestScriptJurisdictionCcText() /** { "tree" :"TestScript.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Testscriptobj.setPurpose(HapiFHIRHelpers.createmarkdown(testscript.getTestScriptPurposeMarkdown() /** { "tree" :"TestScript.purpose", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPurpose"} **/
						));
Testscriptobj.setCopyright(HapiFHIRHelpers.createmarkdown(testscript.getTestScriptCopyrightMarkdown() /** { "tree" :"TestScript.copyright", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCopyright"} **/
						));
Testscriptobj.setIndex(HapiFHIRHelpers.createinteger(testscript.getTestScriptOriginIndexInteger() /** { "tree" :"TestScript.origin.index", "datatype" : "integer", "cardinality" : "Required", "elementtree" : ["addOrigin"] , "methodName" : "setIndex"} **/
						));
Testscriptobj.setProfile(HapiFHIRHelpers.createCoding(testscript.getTstScrptRgnPrflCSrSlctd() /** { "tree" :"TestScript.origin.profile", "datatype" : "Coding, boolean", "cardinality" : "Required", "elementtree" : ["addOrigin"] , "methodName" : "setProfile, setUserSelected"} **/
						, testscript.getTestScriptOriginProfileCCode() /** { "tree" :"TestScript.origin.profile", "datatype" : "Coding, code", "cardinality" : "Required", "elementtree" : ["addOrigin"] , "methodName" : "setProfile, setCode"} **/
						, testscript.getTstScrptRgnPrflCVrsn() /** { "tree" :"TestScript.origin.profile", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addOrigin"] , "methodName" : "setProfile, setVersion"} **/
						, testscript.getTstScrptRgnPrflCDsplay() /** { "tree" :"TestScript.origin.profile", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addOrigin"] , "methodName" : "setProfile, setDisplay"} **/
						, testscript.getTestScriptOriginProfileCSystem() /** { "tree" :"TestScript.origin.profile", "datatype" : "Coding, uri", "cardinality" : "Required", "elementtree" : ["addOrigin"] , "methodName" : "setProfile, setSystem"} **/
						));
Testscriptobj.setIndex(HapiFHIRHelpers.createinteger(testscript.getTstScrptDstntnNdxNtgr() /** { "tree" :"TestScript.destination.index", "datatype" : "integer", "cardinality" : "Required", "elementtree" : ["addDestination"] , "methodName" : "setIndex"} **/
						));
Testscriptobj.setProfile(HapiFHIRHelpers.createCoding(testscript.getTstScrptDstntnPrflCSrSlctd() /** { "tree" :"TestScript.destination.profile", "datatype" : "Coding, boolean", "cardinality" : "Required", "elementtree" : ["addDestination"] , "methodName" : "setProfile, setUserSelected"} **/
						, testscript.getTstScrptDstntnPrflCCde() /** { "tree" :"TestScript.destination.profile", "datatype" : "Coding, code", "cardinality" : "Required", "elementtree" : ["addDestination"] , "methodName" : "setProfile, setCode"} **/
						, testscript.getTstScrptDstntnPrflCVrsn() /** { "tree" :"TestScript.destination.profile", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addDestination"] , "methodName" : "setProfile, setVersion"} **/
						, testscript.getTstScrptDstntnPrflCDsplay() /** { "tree" :"TestScript.destination.profile", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addDestination"] , "methodName" : "setProfile, setDisplay"} **/
						, testscript.getTstScrptDstntnPrflCSstm() /** { "tree" :"TestScript.destination.profile", "datatype" : "Coding, uri", "cardinality" : "Required", "elementtree" : ["addDestination"] , "methodName" : "setProfile, setSystem"} **/
						));
Testscriptobj.setUrl(HapiFHIRHelpers.createuri(testscript.getTestScriptMetadataLinkUrlUri() /** { "tree" :"TestScript.metadata.link.url", "datatype" : "uri", "cardinality" : "Required", "elementtree" : ["setMetadata", "addLink"] , "methodName" : "setUrl"} **/
						));
Testscriptobj.setDescription(HapiFHIRHelpers.createstring(testscript.getTstScrptMtdtLnkDscrptnStrng() /** { "tree" :"TestScript.metadata.link.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setMetadata", "addLink"] , "methodName" : "setDescription"} **/
						));
Testscriptobj.setRequired(HapiFHIRHelpers.createboolean(testscript.getTstScrptMtdtCpbltRqrdBln() /** { "tree" :"TestScript.metadata.capability.required", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["setMetadata", "addLink", "setCapability"] , "methodName" : "setRequired"} **/
						));
Testscriptobj.setValidated(HapiFHIRHelpers.createboolean(testscript.getTstScrptMtdtCpbltVldtdBln() /** { "tree" :"TestScript.metadata.capability.validated", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["setMetadata", "addLink", "setCapability"] , "methodName" : "setValidated"} **/
						));
Testscriptobj.setDescription(HapiFHIRHelpers.createstring(testscript.getTstScrptMtdtCpbltDscrptnStrng() /** { "tree" :"TestScript.metadata.capability.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setMetadata", "addLink", "setCapability"] , "methodName" : "setDescription"} **/
						));
Testscriptobj.addOrigin(HapiFHIRHelpers.createinteger(testscript.getTstScrptMtdtCpbltRgnNtgr() /** { "tree" :"TestScript.metadata.capability.origin", "datatype" : "integer", "cardinality" : "Many", "elementtree" : ["setMetadata", "addLink", "setCapability"] , "methodName" : "addOrigin"} **/
						));
Testscriptobj.setDestination(HapiFHIRHelpers.createinteger(testscript.getTstScrptMtdtCpbltDstntnNtgr() /** { "tree" :"TestScript.metadata.capability.destination", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["setMetadata", "addLink", "setCapability"] , "methodName" : "setDestination"} **/
						));
Testscriptobj.addLink(HapiFHIRHelpers.createuri(testscript.getTstScrptMtdtCpbltLnkRi() /** { "tree" :"TestScript.metadata.capability.link", "datatype" : "uri", "cardinality" : "Many", "elementtree" : ["setMetadata", "addLink", "setCapability"] , "methodName" : "addLink"} **/
						));
Testscriptobj.setCapabilities(HapiFHIRHelpers.createcanonical(testscript.getTstScrptMtdtCpbltCpbltsCnncl() /** { "tree" :"TestScript.metadata.capability.capabilities", "datatype" : "canonical", "cardinality" : "Required", "elementtree" : ["setMetadata", "addLink", "setCapability"] , "methodName" : "setCapabilities"} **/
						));
Testscriptobj.setAutocreate(HapiFHIRHelpers.createboolean(testscript.getTstScrptFxtrTcrtBln() /** { "tree" :"TestScript.fixture.autocreate", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["addFixture"] , "methodName" : "setAutocreate"} **/
						));
Testscriptobj.setAutodelete(HapiFHIRHelpers.createboolean(testscript.getTstScrptFxtrTdltBln() /** { "tree" :"TestScript.fixture.autodelete", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["addFixture"] , "methodName" : "setAutodelete"} **/
						));
Testscriptobj.setResource(HapiFHIRHelpers.createReference(testscript.getTstScrptFxtrRsrcRfrnce() /** { "tree" :"TestScript.fixture.resource", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addFixture"] , "methodName" : "setResource"} **/
						));
Testscriptobj.addProfile(HapiFHIRHelpers.createReference(testscript.getTestScriptProfileReference() /** { "tree" :"TestScript.profile", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProfile"} **/
						));
Testscriptobj.setName(HapiFHIRHelpers.createstring(testscript.getTestScriptVariableNameString() /** { "tree" :"TestScript.variable.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addVariable"] , "methodName" : "setName"} **/
						));
Testscriptobj.setDefaultValue(HapiFHIRHelpers.createstring(testscript.getTstScrptVrblDfltVlStrng() /** { "tree" :"TestScript.variable.defaultValue", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addVariable"] , "methodName" : "setDefaultValue"} **/
						));
Testscriptobj.setDescription(HapiFHIRHelpers.createstring(testscript.getTstScrptVrblDscrptnStrng() /** { "tree" :"TestScript.variable.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addVariable"] , "methodName" : "setDescription"} **/
						));
Testscriptobj.setExpression(HapiFHIRHelpers.createstring(testscript.getTstScrptVrblXprssnStrng() /** { "tree" :"TestScript.variable.expression", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addVariable"] , "methodName" : "setExpression"} **/
						));
Testscriptobj.setHeaderField(HapiFHIRHelpers.createstring(testscript.getTstScrptVrblHdrFldStrng() /** { "tree" :"TestScript.variable.headerField", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addVariable"] , "methodName" : "setHeaderField"} **/
						));
Testscriptobj.setHint(HapiFHIRHelpers.createstring(testscript.getTestScriptVariableHintString() /** { "tree" :"TestScript.variable.hint", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addVariable"] , "methodName" : "setHint"} **/
						));
Testscriptobj.setPath(HapiFHIRHelpers.createstring(testscript.getTestScriptVariablePathString() /** { "tree" :"TestScript.variable.path", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addVariable"] , "methodName" : "setPath"} **/
						));
Testscriptobj.setSourceId(HapiFHIRHelpers.createid(testscript.getTestScriptVariableSourceIdId() /** { "tree" :"TestScript.variable.sourceId", "datatype" : "id", "cardinality" : "ZeroOne", "elementtree" : ["addVariable"] , "methodName" : "setSourceId"} **/
						));
Testscriptobj.setType(HapiFHIRHelpers.createCoding(testscript.getTstScrptStpCtnPrtnTpCSrSlctd() /** { "tree" :"TestScript.setup.action.operation.type", "datatype" : "Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation"] , "methodName" : "setType, setUserSelected"} **/
						, testscript.getTstScrptStpCtnPrtnTpCCde() /** { "tree" :"TestScript.setup.action.operation.type", "datatype" : "Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation"] , "methodName" : "setType, setCode"} **/
						, testscript.getTstScrptStpCtnPrtnTpCVrsn() /** { "tree" :"TestScript.setup.action.operation.type", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation"] , "methodName" : "setType, setVersion"} **/
						, testscript.getTstScrptStpCtnPrtnTpCDsplay() /** { "tree" :"TestScript.setup.action.operation.type", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation"] , "methodName" : "setType, setDisplay"} **/
						, testscript.getTstScrptStpCtnPrtnTpCSstm() /** { "tree" :"TestScript.setup.action.operation.type", "datatype" : "Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation"] , "methodName" : "setType, setSystem"} **/
						));
Testscriptobj.setResource(HapiFHIRHelpers.createcode(testscript.getTstScrptStpCtnPrtnRsrcCde() /** { "tree" :"TestScript.setup.action.operation.resource", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation"] , "methodName" : "setResource"} **/
						));
Testscriptobj.setLabel(HapiFHIRHelpers.createstring(testscript.getTstScrptStpCtnPrtnLblStrng() /** { "tree" :"TestScript.setup.action.operation.label", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation"] , "methodName" : "setLabel"} **/
						));
Testscriptobj.setDescription(HapiFHIRHelpers.createstring(testscript.getTstScrptStpCtnPrtnDscrptnStrng() /** { "tree" :"TestScript.setup.action.operation.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation"] , "methodName" : "setDescription"} **/
						));
Testscriptobj.setAccept(HapiFHIRHelpers.createcode(testscript.getTstScrptStpCtnPrtnCcptCde() /** { "tree" :"TestScript.setup.action.operation.accept", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation"] , "methodName" : "setAccept"} **/
						));
Testscriptobj.setContentType(HapiFHIRHelpers.createcode(testscript.getTstScrptStpCtnPrtnCntntTpCde() /** { "tree" :"TestScript.setup.action.operation.contentType", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation"] , "methodName" : "setContentType"} **/
						));
Testscriptobj.setDestination(HapiFHIRHelpers.createinteger(testscript.getTstScrptStpCtnPrtnDstntnNtgr() /** { "tree" :"TestScript.setup.action.operation.destination", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation"] , "methodName" : "setDestination"} **/
						));
Testscriptobj.setEncodeRequestUrl(HapiFHIRHelpers.createboolean(testscript.getTstScrptStpCtnPrtnNcdRqstrlBln() /** { "tree" :"TestScript.setup.action.operation.encodeRequestUrl", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["setSetup", "setAction", "setOperation"] , "methodName" : "setEncodeRequestUrl"} **/
						));
Testscriptobj.setMethod(HapiFHIRHelpers.createcode(testscript.getTstScrptStpCtnPrtnMthdCde() /** { "tree" :"TestScript.setup.action.operation.method", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation"] , "methodName" : "setMethod"} **/
						));
Testscriptobj.setOrigin(HapiFHIRHelpers.createinteger(testscript.getTstScrptStpCtnPrtnRgnNtgr() /** { "tree" :"TestScript.setup.action.operation.origin", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation"] , "methodName" : "setOrigin"} **/
						));
Testscriptobj.setParams(HapiFHIRHelpers.createstring(testscript.getTstScrptStpCtnPrtnPrmsStrng() /** { "tree" :"TestScript.setup.action.operation.params", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation"] , "methodName" : "setParams"} **/
						));
Testscriptobj.setField(HapiFHIRHelpers.createstring(testscript.getTstScrptStpCtnPrtnRqstHdrFldStrng() /** { "tree" :"TestScript.setup.action.operation.requestHeader.field", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader"] , "methodName" : "setField"} **/
						));
Testscriptobj.setValue(HapiFHIRHelpers.createstring(testscript.getTstScrptStpCtnPrtnRqstHdrVlStrng() /** { "tree" :"TestScript.setup.action.operation.requestHeader.value", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader"] , "methodName" : "setValue"} **/
						));
Testscriptobj.setRequestId(HapiFHIRHelpers.createid(testscript.getTstScrptStpCtnPrtnRqstdD() /** { "tree" :"TestScript.setup.action.operation.requestId", "datatype" : "id", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader"] , "methodName" : "setRequestId"} **/
						));
Testscriptobj.setResponseId(HapiFHIRHelpers.createid(testscript.getTstScrptStpCtnPrtnRspnsdD() /** { "tree" :"TestScript.setup.action.operation.responseId", "datatype" : "id", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader"] , "methodName" : "setResponseId"} **/
						));
Testscriptobj.setSourceId(HapiFHIRHelpers.createid(testscript.getTstScrptStpCtnPrtnSrcdD() /** { "tree" :"TestScript.setup.action.operation.sourceId", "datatype" : "id", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader"] , "methodName" : "setSourceId"} **/
						));
Testscriptobj.setTargetId(HapiFHIRHelpers.createid(testscript.getTstScrptStpCtnPrtnTrgtdD() /** { "tree" :"TestScript.setup.action.operation.targetId", "datatype" : "id", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader"] , "methodName" : "setTargetId"} **/
						));
Testscriptobj.setUrl(HapiFHIRHelpers.createstring(testscript.getTstScrptStpCtnPrtnRlStrng() /** { "tree" :"TestScript.setup.action.operation.url", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader"] , "methodName" : "setUrl"} **/
						));
Testscriptobj.setLabel(HapiFHIRHelpers.createstring(testscript.getTstScrptStpCtnSsrtLblStrng() /** { "tree" :"TestScript.setup.action.assert.label", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setLabel"} **/
						));
Testscriptobj.setDescription(HapiFHIRHelpers.createstring(testscript.getTstScrptStpCtnSsrtDscrptnStrng() /** { "tree" :"TestScript.setup.action.assert.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setDescription"} **/
						));
Testscriptobj.setDirection(HapiFHIRHelpers.createcode(testscript.getTstScrptStpCtnSsrtDrctnCde() /** { "tree" :"TestScript.setup.action.assert.direction", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setDirection"} **/
						));
Testscriptobj.setCompareToSourceId(HapiFHIRHelpers.createstring(testscript.getTstScrptStpCtnSsrtCmprTsrcdStrng() /** { "tree" :"TestScript.setup.action.assert.compareToSourceId", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setCompareToSourceId"} **/
						));
Testscriptobj.setCompareToSourceExpression(HapiFHIRHelpers.createstring(testscript.getTstScrptStpCtnSsrtCmprTsrcxprssnStrng() /** { "tree" :"TestScript.setup.action.assert.compareToSourceExpression", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setCompareToSourceExpression"} **/
						));
Testscriptobj.setCompareToSourcePath(HapiFHIRHelpers.createstring(testscript.getTstScrptStpCtnSsrtCmprTsrcPthStrng() /** { "tree" :"TestScript.setup.action.assert.compareToSourcePath", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setCompareToSourcePath"} **/
						));
Testscriptobj.setContentType(HapiFHIRHelpers.createcode(testscript.getTstScrptStpCtnSsrtCntntTpCde() /** { "tree" :"TestScript.setup.action.assert.contentType", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setContentType"} **/
						));
Testscriptobj.setExpression(HapiFHIRHelpers.createstring(testscript.getTstScrptStpCtnSsrtXprssnStrng() /** { "tree" :"TestScript.setup.action.assert.expression", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setExpression"} **/
						));
Testscriptobj.setHeaderField(HapiFHIRHelpers.createstring(testscript.getTstScrptStpCtnSsrtHdrFldStrng() /** { "tree" :"TestScript.setup.action.assert.headerField", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setHeaderField"} **/
						));
Testscriptobj.setMinimumId(HapiFHIRHelpers.createstring(testscript.getTstScrptStpCtnSsrtMnmmdStrng() /** { "tree" :"TestScript.setup.action.assert.minimumId", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setMinimumId"} **/
						));
Testscriptobj.setNavigationLinks(HapiFHIRHelpers.createboolean(testscript.getTstScrptStpCtnSsrtNvgtnLnksBln() /** { "tree" :"TestScript.setup.action.assert.navigationLinks", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setNavigationLinks"} **/
						));
Testscriptobj.setOperator(HapiFHIRHelpers.createcode(testscript.getTstScrptStpCtnSsrtPrtrCde() /** { "tree" :"TestScript.setup.action.assert.operator", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setOperator"} **/
						));
Testscriptobj.setPath(HapiFHIRHelpers.createstring(testscript.getTstScrptStpCtnSsrtPthStrng() /** { "tree" :"TestScript.setup.action.assert.path", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setPath"} **/
						));
Testscriptobj.setRequestMethod(HapiFHIRHelpers.createcode(testscript.getTstScrptStpCtnSsrtRqstMthdCde() /** { "tree" :"TestScript.setup.action.assert.requestMethod", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setRequestMethod"} **/
						));
Testscriptobj.setRequestURL(HapiFHIRHelpers.createstring(testscript.getTstScrptStpCtnSsrtRqstRlStrng() /** { "tree" :"TestScript.setup.action.assert.requestURL", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setRequestURL"} **/
						));
Testscriptobj.setResource(HapiFHIRHelpers.createcode(testscript.getTstScrptStpCtnSsrtRsrcCde() /** { "tree" :"TestScript.setup.action.assert.resource", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setResource"} **/
						));
Testscriptobj.setResponse(HapiFHIRHelpers.createcode(testscript.getTstScrptStpCtnSsrtRspnsCde() /** { "tree" :"TestScript.setup.action.assert.response", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setResponse"} **/
						));
Testscriptobj.setResponseCode(HapiFHIRHelpers.createstring(testscript.getTstScrptStpCtnSsrtRspnsCdStrng() /** { "tree" :"TestScript.setup.action.assert.responseCode", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setResponseCode"} **/
						));
Testscriptobj.setSourceId(HapiFHIRHelpers.createid(testscript.getTstScrptStpCtnSsrtSrcdD() /** { "tree" :"TestScript.setup.action.assert.sourceId", "datatype" : "id", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setSourceId"} **/
						));
Testscriptobj.setValidateProfileId(HapiFHIRHelpers.createid(testscript.getTstScrptStpCtnSsrtVldtPrfldD() /** { "tree" :"TestScript.setup.action.assert.validateProfileId", "datatype" : "id", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setValidateProfileId"} **/
						));
Testscriptobj.setValue(HapiFHIRHelpers.createstring(testscript.getTstScrptStpCtnSsrtVlStrng() /** { "tree" :"TestScript.setup.action.assert.value", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setValue"} **/
						));
Testscriptobj.setWarningOnly(HapiFHIRHelpers.createboolean(testscript.getTstScrptStpCtnSsrtWrnngnlBln() /** { "tree" :"TestScript.setup.action.assert.warningOnly", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["setSetup", "setAction", "setOperation", "addRequestHeader", "setAssert"] , "methodName" : "setWarningOnly"} **/
						));
Testscriptobj.setName(HapiFHIRHelpers.createstring(testscript.getTestScriptTestNameString() /** { "tree" :"TestScript.test.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addTest"] , "methodName" : "setName"} **/
						));
Testscriptobj.setDescription(HapiFHIRHelpers.createstring(testscript.getTestScriptTestDescriptionString() /** { "tree" :"TestScript.test.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addTest"] , "methodName" : "setDescription"} **/
						));
Testscriptobj.setOperation(HapiFHIRHelpers.createoperation(testscript.getTstScrptTstCtnPrtnPrtn() /** { "tree" :"TestScript.test.action.operation", "datatype" : "operation", "cardinality" : "ZeroOne", "elementtree" : ["addTest", "setAction"] , "methodName" : "setOperation"} **/
						));
Testscriptobj.setAssert(HapiFHIRHelpers.createassert(testscript.getTstScrptTstCtnSsrtSsrt() /** { "tree" :"TestScript.test.action.assert", "datatype" : "assert", "cardinality" : "ZeroOne", "elementtree" : ["addTest", "setAction"] , "methodName" : "setAssert"} **/
						));
Testscriptobj.setOperation(HapiFHIRHelpers.createoperation(testscript.getTstScrptTrdwnCtnPrtnPrtn() /** { "tree" :"TestScript.teardown.action.operation", "datatype" : "operation", "cardinality" : "Required", "elementtree" : ["setTeardown", "setAction"] , "methodName" : "setOperation"} **/
		));
	}
}
