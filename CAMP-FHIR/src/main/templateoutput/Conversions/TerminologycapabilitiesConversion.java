package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Terminologycapabilities.
 * @see .Terminologycapabilities
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class TerminologycapabilitiesConversion 
{
	public Patient Terminologycapabilitiess(main.templateoutput.Model.Terminologycapabilities terminologycapabilities) 
	{
			Patient  Terminologycapabilitiesobj = new Patient(); 

						Terminologycapabilitiesobj.setUrl(HapiFHIRHelpers.createuri(terminologycapabilities.getTerminologyCapabilitiesUrlUri() /** { "tree" :"TerminologyCapabilities.url", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Terminologycapabilitiesobj.setVersion(HapiFHIRHelpers.createstring(terminologycapabilities.getTrmnlgCpbltsVrsnStrng() /** { "tree" :"TerminologyCapabilities.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Terminologycapabilitiesobj.setName(HapiFHIRHelpers.createstring(terminologycapabilities.getTrmnlgCpbltsNmStrng() /** { "tree" :"TerminologyCapabilities.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Terminologycapabilitiesobj.setTitle(HapiFHIRHelpers.createstring(terminologycapabilities.getTrmnlgCpbltsTtlStrng() /** { "tree" :"TerminologyCapabilities.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Terminologycapabilitiesobj.setStatus(HapiFHIRHelpers.createcode(terminologycapabilities.getTrmnlgCpbltsSttsCde() /** { "tree" :"TerminologyCapabilities.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Terminologycapabilitiesobj.setExperimental(HapiFHIRHelpers.createboolean(terminologycapabilities.getTrmnlgCpbltsXprmntlBln() /** { "tree" :"TerminologyCapabilities.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Terminologycapabilitiesobj.setDate(HapiFHIRHelpers.createdateTime(terminologycapabilities.getTrmnlgCpbltsDtDtTme() /** { "tree" :"TerminologyCapabilities.date", "datatype" : "dateTime", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Terminologycapabilitiesobj.setPublisher(HapiFHIRHelpers.createstring(terminologycapabilities.getTrmnlgCpbltsPblshrStrng() /** { "tree" :"TerminologyCapabilities.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Terminologycapabilitiesobj.addContact(HapiFHIRHelpers.createContactDetail(terminologycapabilities.getTrmnlgCpbltsCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"TerminologyCapabilities.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, terminologycapabilities.getTrmnlgCpbltsCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"TerminologyCapabilities.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, terminologycapabilities.getTrmnlgCpbltsCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"TerminologyCapabilities.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, terminologycapabilities.getTrmnlgCpbltsCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"TerminologyCapabilities.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, terminologycapabilities.getTrmnlgCpbltsCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"TerminologyCapabilities.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, terminologycapabilities.getTrmnlgCpbltsCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"TerminologyCapabilities.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, terminologycapabilities.getTrmnlgCpbltsCntctCntctDtlNme() /** { "tree" :"TerminologyCapabilities.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Terminologycapabilitiesobj.setDescription(HapiFHIRHelpers.createmarkdown(terminologycapabilities.getTrmnlgCpbltsDscrptnMrkdwn() /** { "tree" :"TerminologyCapabilities.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Terminologycapabilitiesobj.addUseContext(HapiFHIRHelpers.createUsageContext(terminologycapabilities.getTrmnlgCpbltsSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"TerminologyCapabilities.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, terminologycapabilities.getTrmnlgCpbltsSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"TerminologyCapabilities.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, terminologycapabilities.getTrmnlgCpbltsSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"TerminologyCapabilities.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, terminologycapabilities.getTrmnlgCpbltsSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"TerminologyCapabilities.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, terminologycapabilities.getTrmnlgCpbltsSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"TerminologyCapabilities.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, terminologycapabilities.getTrmnlgCpbltsSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"TerminologyCapabilities.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, terminologycapabilities.getTrmnlgCpbltsSCntxtSgCntxtCdCSstm() /** { "tree" :"TerminologyCapabilities.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, terminologycapabilities.getTrmnlgCpbltsSCntxtSgCntxtCdCVrsn() /** { "tree" :"TerminologyCapabilities.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, terminologycapabilities.getTrmnlgCpbltsSCntxtSgCntxtCdCCde() /** { "tree" :"TerminologyCapabilities.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, terminologycapabilities.getTrmnlgCpbltsSCntxtSgCntxtCdCDsplay() /** { "tree" :"TerminologyCapabilities.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, terminologycapabilities.getTrmnlgCpbltsSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"TerminologyCapabilities.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, terminologycapabilities.getTrmnlgCpbltsSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"TerminologyCapabilities.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, terminologycapabilities.getTrmnlgCpbltsSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"TerminologyCapabilities.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, terminologycapabilities.getTrmnlgCpbltsSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"TerminologyCapabilities.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, terminologycapabilities.getTrmnlgCpbltsSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"TerminologyCapabilities.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, terminologycapabilities.getTrmnlgCpbltsSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"TerminologyCapabilities.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, terminologycapabilities.getTrmnlgCpbltsSCntxtSgCntxtVlRngRngLw() /** { "tree" :"TerminologyCapabilities.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, terminologycapabilities.getTrmnlgCpbltsSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"TerminologyCapabilities.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, terminologycapabilities.getTrmnlgCpbltsSCntxtSgCntxtVlRfrnce() /** { "tree" :"TerminologyCapabilities.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Terminologycapabilitiesobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(terminologycapabilities.getTrmnlgCpbltsJrsdctnCcCdngCSstm() /** { "tree" :"TerminologyCapabilities.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, terminologycapabilities.getTrmnlgCpbltsJrsdctnCcCdngCVrsn() /** { "tree" :"TerminologyCapabilities.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, terminologycapabilities.getTrmnlgCpbltsJrsdctnCcCdngCCde() /** { "tree" :"TerminologyCapabilities.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, terminologycapabilities.getTrmnlgCpbltsJrsdctnCcCdngCDsplay() /** { "tree" :"TerminologyCapabilities.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, terminologycapabilities.getTrmnlgCpbltsJrsdctnCcCdngCSrSlctd() /** { "tree" :"TerminologyCapabilities.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, terminologycapabilities.getTrmnlgCpbltsJrsdctnCcTxt() /** { "tree" :"TerminologyCapabilities.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Terminologycapabilitiesobj.setPurpose(HapiFHIRHelpers.createmarkdown(terminologycapabilities.getTrmnlgCpbltsPrpsMrkdwn() /** { "tree" :"TerminologyCapabilities.purpose", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPurpose"} **/
						));
Terminologycapabilitiesobj.setCopyright(HapiFHIRHelpers.createmarkdown(terminologycapabilities.getTrmnlgCpbltsCprghtMrkdwn() /** { "tree" :"TerminologyCapabilities.copyright", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCopyright"} **/
						));
Terminologycapabilitiesobj.setKind(HapiFHIRHelpers.createcode(terminologycapabilities.getTerminologyCapabilitiesKindCode() /** { "tree" :"TerminologyCapabilities.kind", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setKind"} **/
						));
Terminologycapabilitiesobj.setName(HapiFHIRHelpers.createstring(terminologycapabilities.getTrmnlgCpbltsSftwrNmStrng() /** { "tree" :"TerminologyCapabilities.software.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["setSoftware"] , "methodName" : "setName"} **/
						));
Terminologycapabilitiesobj.setVersion(HapiFHIRHelpers.createstring(terminologycapabilities.getTrmnlgCpbltsSftwrVrsnStrng() /** { "tree" :"TerminologyCapabilities.software.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSoftware"] , "methodName" : "setVersion"} **/
						));
Terminologycapabilitiesobj.setDescription(HapiFHIRHelpers.createstring(terminologycapabilities.getTrmnlgCpbltsMplmnttnDscrptnStrng() /** { "tree" :"TerminologyCapabilities.implementation.description", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["setImplementation"] , "methodName" : "setDescription"} **/
						));
Terminologycapabilitiesobj.setUrl(HapiFHIRHelpers.createurl(terminologycapabilities.getTrmnlgCpbltsMplmnttnRlRl() /** { "tree" :"TerminologyCapabilities.implementation.url", "datatype" : "url", "cardinality" : "ZeroOne", "elementtree" : ["setImplementation"] , "methodName" : "setUrl"} **/
						));
Terminologycapabilitiesobj.setLockedDate(HapiFHIRHelpers.createboolean(terminologycapabilities.getTrmnlgCpbltsLckdDtBln() /** { "tree" :"TerminologyCapabilities.lockedDate", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLockedDate"} **/
						));
Terminologycapabilitiesobj.setUri(HapiFHIRHelpers.createcanonical(terminologycapabilities.getTrmnlgCpbltsCdSstmRCnncl() /** { "tree" :"TerminologyCapabilities.codeSystem.uri", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : ["addCodeSystem"] , "methodName" : "setUri"} **/
						));
Terminologycapabilitiesobj.setCode(HapiFHIRHelpers.createstring(terminologycapabilities.getTrmnlgCpbltsCdSstmVrsnCdStrng() /** { "tree" :"TerminologyCapabilities.codeSystem.version.code", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addCodeSystem", "addVersion"] , "methodName" : "setCode"} **/
						));
Terminologycapabilitiesobj.setIsDefault(HapiFHIRHelpers.createboolean(terminologycapabilities.getTrmnlgCpbltsCdSstmVrsnSDfltBln() /** { "tree" :"TerminologyCapabilities.codeSystem.version.isDefault", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addCodeSystem", "addVersion"] , "methodName" : "setIsDefault"} **/
						));
Terminologycapabilitiesobj.setCompositional(HapiFHIRHelpers.createboolean(terminologycapabilities.getTrmnlgCpbltsCdSstmVrsnCmpstnlBln() /** { "tree" :"TerminologyCapabilities.codeSystem.version.compositional", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addCodeSystem", "addVersion"] , "methodName" : "setCompositional"} **/
						));
Terminologycapabilitiesobj.addLanguage(HapiFHIRHelpers.createcode(terminologycapabilities.getTrmnlgCpbltsCdSstmVrsnLnggCde() /** { "tree" :"TerminologyCapabilities.codeSystem.version.language", "datatype" : "code", "cardinality" : "Many", "elementtree" : ["addCodeSystem", "addVersion"] , "methodName" : "addLanguage"} **/
						));
Terminologycapabilitiesobj.setCode(HapiFHIRHelpers.createcode(terminologycapabilities.getTrmnlgCpbltsCdSstmVrsnFltrCdCde() /** { "tree" :"TerminologyCapabilities.codeSystem.version.filter.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addCodeSystem", "addVersion", "addFilter"] , "methodName" : "setCode"} **/
						));
Terminologycapabilitiesobj.setOp(HapiFHIRHelpers.createcode(terminologycapabilities.getTrmnlgCpbltsCdSstmVrsnFltrPCde() /** { "tree" :"TerminologyCapabilities.codeSystem.version.filter.op", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addCodeSystem", "addVersion", "addFilter"] , "methodName" : "setOp"} **/
						));
Terminologycapabilitiesobj.addProperty(HapiFHIRHelpers.createcode(terminologycapabilities.getTrmnlgCpbltsCdSstmVrsnPrprtCde() /** { "tree" :"TerminologyCapabilities.codeSystem.version.property", "datatype" : "code", "cardinality" : "Many", "elementtree" : ["addCodeSystem", "addVersion", "addFilter"] , "methodName" : "addProperty"} **/
						));
Terminologycapabilitiesobj.setSubsumption(HapiFHIRHelpers.createboolean(terminologycapabilities.getTrmnlgCpbltsCdSstmSbsmptnBln() /** { "tree" :"TerminologyCapabilities.codeSystem.subsumption", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addCodeSystem", "addVersion", "addFilter"] , "methodName" : "setSubsumption"} **/
						));
Terminologycapabilitiesobj.setHierarchical(HapiFHIRHelpers.createboolean(terminologycapabilities.getTrmnlgCpbltsXpnsnHrrchclBln() /** { "tree" :"TerminologyCapabilities.expansion.hierarchical", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion"] , "methodName" : "setHierarchical"} **/
						));
Terminologycapabilitiesobj.setPaging(HapiFHIRHelpers.createboolean(terminologycapabilities.getTrmnlgCpbltsXpnsnPgngBln() /** { "tree" :"TerminologyCapabilities.expansion.paging", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion"] , "methodName" : "setPaging"} **/
						));
Terminologycapabilitiesobj.setIncomplete(HapiFHIRHelpers.createboolean(terminologycapabilities.getTrmnlgCpbltsXpnsnNcmpltBln() /** { "tree" :"TerminologyCapabilities.expansion.incomplete", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion"] , "methodName" : "setIncomplete"} **/
						));
Terminologycapabilitiesobj.setName(HapiFHIRHelpers.createcode(terminologycapabilities.getTrmnlgCpbltsXpnsnPrmtrNmCde() /** { "tree" :"TerminologyCapabilities.expansion.parameter.name", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["setExpansion", "addParameter"] , "methodName" : "setName"} **/
						));
Terminologycapabilitiesobj.setDocumentation(HapiFHIRHelpers.createstring(terminologycapabilities.getTrmnlgCpbltsXpnsnPrmtrDcmnttnStrng() /** { "tree" :"TerminologyCapabilities.expansion.parameter.documentation", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion", "addParameter"] , "methodName" : "setDocumentation"} **/
						));
Terminologycapabilitiesobj.setTextFilter(HapiFHIRHelpers.createmarkdown(terminologycapabilities.getTrmnlgCpbltsXpnsnTxtFltrMrkdwn() /** { "tree" :"TerminologyCapabilities.expansion.textFilter", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion", "addParameter"] , "methodName" : "setTextFilter"} **/
						));
Terminologycapabilitiesobj.setCodeSearch(HapiFHIRHelpers.createcode(terminologycapabilities.getTrmnlgCpbltsCdSrchCde() /** { "tree" :"TerminologyCapabilities.codeSearch", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCodeSearch"} **/
						));
Terminologycapabilitiesobj.setTranslations(HapiFHIRHelpers.createboolean(terminologycapabilities.getTrmnlgCpbltsVldtCdTrnsltnsBln() /** { "tree" :"TerminologyCapabilities.validateCode.translations", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["setValidateCode"] , "methodName" : "setTranslations"} **/
						));
Terminologycapabilitiesobj.setNeedsMap(HapiFHIRHelpers.createboolean(terminologycapabilities.getTrmnlgCpbltsTrnsltnNdsMpBln() /** { "tree" :"TerminologyCapabilities.translation.needsMap", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["setTranslation"] , "methodName" : "setNeedsMap"} **/
						));
Terminologycapabilitiesobj.setTranslation(HapiFHIRHelpers.createboolean(terminologycapabilities.getTrmnlgCpbltsClsrTrnsltnBln() /** { "tree" :"TerminologyCapabilities.closure.translation", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["setClosure"] , "methodName" : "setTranslation"} **/
		));
	}
}
