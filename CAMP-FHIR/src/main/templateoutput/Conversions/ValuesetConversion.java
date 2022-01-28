package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Valueset.
 * @see .Valueset
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ValuesetConversion 
{
	public Patient Valuesets(main.templateoutput.Model.Valueset valueset) 
	{
			Patient  Valuesetobj = new Patient(); 

						Valuesetobj.setUrl(HapiFHIRHelpers.createuri(valueset.getValueSetUrlUri() /** { "tree" :"ValueSet.url", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Valuesetobj.addIdentifier(HapiFHIRHelpers.createIdentifier(valueset.getValueSetIdentifierIdentifierUse() /** { "tree" :"ValueSet.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, valueset.getVlStDntfrDntfrTpCcCSstm() /** { "tree" :"ValueSet.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, valueset.getVlStDntfrDntfrTpCcCVrsn() /** { "tree" :"ValueSet.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, valueset.getVlStDntfrDntfrTpCcCCde() /** { "tree" :"ValueSet.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, valueset.getVlStDntfrDntfrTpCcCDsplay() /** { "tree" :"ValueSet.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, valueset.getVlStDntfrDntfrTpCcCSrSlctd() /** { "tree" :"ValueSet.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, valueset.getVlStDntfrDntfrTpCcTxt() /** { "tree" :"ValueSet.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, valueset.getVlStDntfrDntfrPrdPrdStrt() /** { "tree" :"ValueSet.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, valueset.getVlStDntfrDntfrPrdPrdNd() /** { "tree" :"ValueSet.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, valueset.getVlStDntfrDntfrSsgnr() /** { "tree" :"ValueSet.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, valueset.getVlStDntfrDntfrVlue() /** { "tree" :"ValueSet.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, valueset.getVlStDntfrDntfrSstm() /** { "tree" :"ValueSet.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Valuesetobj.setVersion(HapiFHIRHelpers.createstring(valueset.getValueSetVersionString() /** { "tree" :"ValueSet.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Valuesetobj.setName(HapiFHIRHelpers.createstring(valueset.getValueSetNameString() /** { "tree" :"ValueSet.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Valuesetobj.setTitle(HapiFHIRHelpers.createstring(valueset.getValueSetTitleString() /** { "tree" :"ValueSet.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Valuesetobj.setStatus(HapiFHIRHelpers.createcode(valueset.getValueSetStatusCode() /** { "tree" :"ValueSet.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Valuesetobj.setExperimental(HapiFHIRHelpers.createboolean(valueset.getValueSetExperimentalBoolean() /** { "tree" :"ValueSet.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Valuesetobj.setDate(HapiFHIRHelpers.createdateTime(valueset.getValueSetDateDateTime() /** { "tree" :"ValueSet.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Valuesetobj.setPublisher(HapiFHIRHelpers.createstring(valueset.getValueSetPublisherString() /** { "tree" :"ValueSet.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Valuesetobj.addContact(HapiFHIRHelpers.createContactDetail(valueset.getVlStCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"ValueSet.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, valueset.getVlStCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"ValueSet.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, valueset.getVlStCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"ValueSet.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, valueset.getVlStCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"ValueSet.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, valueset.getVlStCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"ValueSet.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, valueset.getVlStCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"ValueSet.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, valueset.getVlStCntctCntctDtlNme() /** { "tree" :"ValueSet.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Valuesetobj.setDescription(HapiFHIRHelpers.createmarkdown(valueset.getValueSetDescriptionMarkdown() /** { "tree" :"ValueSet.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Valuesetobj.addUseContext(HapiFHIRHelpers.createUsageContext(valueset.getVlStSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"ValueSet.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, valueset.getVlStSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"ValueSet.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, valueset.getVlStSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"ValueSet.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, valueset.getVlStSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"ValueSet.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, valueset.getVlStSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"ValueSet.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, valueset.getVlStSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"ValueSet.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, valueset.getVlStSCntxtSgCntxtCdCSstm() /** { "tree" :"ValueSet.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, valueset.getVlStSCntxtSgCntxtCdCVrsn() /** { "tree" :"ValueSet.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, valueset.getVlStSCntxtSgCntxtCdCCde() /** { "tree" :"ValueSet.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, valueset.getVlStSCntxtSgCntxtCdCDsplay() /** { "tree" :"ValueSet.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, valueset.getVlStSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"ValueSet.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, valueset.getVlStSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"ValueSet.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, valueset.getVlStSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"ValueSet.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, valueset.getVlStSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"ValueSet.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, valueset.getVlStSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"ValueSet.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, valueset.getVlStSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"ValueSet.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, valueset.getVlStSCntxtSgCntxtVlRngRngLw() /** { "tree" :"ValueSet.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, valueset.getVlStSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"ValueSet.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, valueset.getVlStSCntxtSgCntxtVlRfrnce() /** { "tree" :"ValueSet.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Valuesetobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(valueset.getVlStJrsdctnCcCdngCSstm() /** { "tree" :"ValueSet.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, valueset.getVlStJrsdctnCcCdngCVrsn() /** { "tree" :"ValueSet.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, valueset.getVlStJrsdctnCcCdngCCde() /** { "tree" :"ValueSet.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, valueset.getVlStJrsdctnCcCdngCDsplay() /** { "tree" :"ValueSet.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, valueset.getVlStJrsdctnCcCdngCSrSlctd() /** { "tree" :"ValueSet.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, valueset.getValueSetJurisdictionCcText() /** { "tree" :"ValueSet.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Valuesetobj.setImmutable(HapiFHIRHelpers.createboolean(valueset.getValueSetImmutableBoolean() /** { "tree" :"ValueSet.immutable", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setImmutable"} **/
						));
Valuesetobj.setPurpose(HapiFHIRHelpers.createmarkdown(valueset.getValueSetPurposeMarkdown() /** { "tree" :"ValueSet.purpose", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPurpose"} **/
						));
Valuesetobj.setCopyright(HapiFHIRHelpers.createmarkdown(valueset.getValueSetCopyrightMarkdown() /** { "tree" :"ValueSet.copyright", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCopyright"} **/
						));
Valuesetobj.setLockedDate(HapiFHIRHelpers.createdate(valueset.getValueSetComposeLockedDateDate() /** { "tree" :"ValueSet.compose.lockedDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : ["setCompose"] , "methodName" : "setLockedDate"} **/
						));
Valuesetobj.setInactive(HapiFHIRHelpers.createboolean(valueset.getValueSetComposeInactiveBoolean() /** { "tree" :"ValueSet.compose.inactive", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["setCompose"] , "methodName" : "setInactive"} **/
						));
Valuesetobj.setSystem(HapiFHIRHelpers.createuri(valueset.getVlStCmpsNcldSstmRi() /** { "tree" :"ValueSet.compose.include.system", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["setCompose", "setInclude"] , "methodName" : "setSystem"} **/
						));
Valuesetobj.setVersion(HapiFHIRHelpers.createstring(valueset.getVlStCmpsNcldVrsnStrng() /** { "tree" :"ValueSet.compose.include.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setCompose", "setInclude"] , "methodName" : "setVersion"} **/
						));
Valuesetobj.setCode(HapiFHIRHelpers.createcode(valueset.getVlStCmpsNcldCncptCdCde() /** { "tree" :"ValueSet.compose.include.concept.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["setCompose", "setInclude", "addConcept"] , "methodName" : "setCode"} **/
						));
Valuesetobj.setDisplay(HapiFHIRHelpers.createstring(valueset.getVlStCmpsNcldCncptDsplStrng() /** { "tree" :"ValueSet.compose.include.concept.display", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setCompose", "setInclude", "addConcept"] , "methodName" : "setDisplay"} **/
						));
Valuesetobj.setLanguage(HapiFHIRHelpers.createcode(valueset.getVlStCmpsNcldCncptDsgntnLnggCde() /** { "tree" :"ValueSet.compose.include.concept.designation.language", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["setCompose", "setInclude", "addConcept", "addDesignation"] , "methodName" : "setLanguage"} **/
						));
Valuesetobj.setUse(HapiFHIRHelpers.createCoding(valueset.getVlStCmpsNcldCncptDsgntnSCSrSlctd() /** { "tree" :"ValueSet.compose.include.concept.designation.use", "datatype" : "Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setCompose", "setInclude", "addConcept", "addDesignation"] , "methodName" : "setUse, setUserSelected"} **/
						, valueset.getVlStCmpsNcldCncptDsgntnSCCde() /** { "tree" :"ValueSet.compose.include.concept.designation.use", "datatype" : "Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setCompose", "setInclude", "addConcept", "addDesignation"] , "methodName" : "setUse, setCode"} **/
						, valueset.getVlStCmpsNcldCncptDsgntnSCVrsn() /** { "tree" :"ValueSet.compose.include.concept.designation.use", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setCompose", "setInclude", "addConcept", "addDesignation"] , "methodName" : "setUse, setVersion"} **/
						, valueset.getVlStCmpsNcldCncptDsgntnSCDsplay() /** { "tree" :"ValueSet.compose.include.concept.designation.use", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setCompose", "setInclude", "addConcept", "addDesignation"] , "methodName" : "setUse, setDisplay"} **/
						, valueset.getVlStCmpsNcldCncptDsgntnSCSstm() /** { "tree" :"ValueSet.compose.include.concept.designation.use", "datatype" : "Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setCompose", "setInclude", "addConcept", "addDesignation"] , "methodName" : "setUse, setSystem"} **/
						));
Valuesetobj.setValue(HapiFHIRHelpers.createstring(valueset.getVlStCmpsNcldCncptDsgntnVlStrng() /** { "tree" :"ValueSet.compose.include.concept.designation.value", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["setCompose", "setInclude", "addConcept", "addDesignation"] , "methodName" : "setValue"} **/
						));
Valuesetobj.setProperty(HapiFHIRHelpers.createcode(valueset.getVlStCmpsNcldFltrPrprtCde() /** { "tree" :"ValueSet.compose.include.filter.property", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["setCompose", "setInclude", "addConcept", "addDesignation", "addFilter"] , "methodName" : "setProperty"} **/
						));
Valuesetobj.setOp(HapiFHIRHelpers.createcode(valueset.getVlStCmpsNcldFltrPCde() /** { "tree" :"ValueSet.compose.include.filter.op", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["setCompose", "setInclude", "addConcept", "addDesignation", "addFilter"] , "methodName" : "setOp"} **/
						));
Valuesetobj.setValue(HapiFHIRHelpers.createstring(valueset.getVlStCmpsNcldFltrVlStrng() /** { "tree" :"ValueSet.compose.include.filter.value", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["setCompose", "setInclude", "addConcept", "addDesignation", "addFilter"] , "methodName" : "setValue"} **/
						));
Valuesetobj.addValueSet(HapiFHIRHelpers.createcanonical(valueset.getVlStCmpsNcldVlStCnncl() /** { "tree" :"ValueSet.compose.include.valueSet", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : ["setCompose", "setInclude", "addConcept", "addDesignation", "addFilter"] , "methodName" : "addValueSet"} **/
						));
Valuesetobj.addExclude(HapiFHIRHelpers.createinclude(valueset.getValueSetComposeExcludeInclude() /** { "tree" :"ValueSet.compose.exclude", "datatype" : "include", "cardinality" : "Many", "elementtree" : ["setCompose", "setInclude", "addConcept", "addDesignation", "addFilter"] , "methodName" : "addExclude"} **/
						));
Valuesetobj.setIdentifier(HapiFHIRHelpers.createuri(valueset.getValueSetExpansionIdentifierUri() /** { "tree" :"ValueSet.expansion.identifier", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion"] , "methodName" : "setIdentifier"} **/
						));
Valuesetobj.setTimestamp(HapiFHIRHelpers.createdateTime(valueset.getVlStXpnsnTmstmpDtTme() /** { "tree" :"ValueSet.expansion.timestamp", "datatype" : "dateTime", "cardinality" : "Required", "elementtree" : ["setExpansion"] , "methodName" : "setTimestamp"} **/
						));
Valuesetobj.setTotal(HapiFHIRHelpers.createinteger(valueset.getValueSetExpansionTotalInteger() /** { "tree" :"ValueSet.expansion.total", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion"] , "methodName" : "setTotal"} **/
						));
Valuesetobj.setOffset(HapiFHIRHelpers.createinteger(valueset.getValueSetExpansionOffsetInteger() /** { "tree" :"ValueSet.expansion.offset", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion"] , "methodName" : "setOffset"} **/
						));
Valuesetobj.setName(HapiFHIRHelpers.createstring(valueset.getVlStXpnsnPrmtrNmStrng() /** { "tree" :"ValueSet.expansion.parameter.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["setExpansion", "addParameter"] , "methodName" : "setName"} **/
						));
Valuesetobj.setValueString(HapiFHIRHelpers.createstring(valueset.getVlStXpnsnPrmtrVlStrngStrng() /** { "tree" :"ValueSet.expansion.parameter.valueString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion", "addParameter"] , "methodName" : "setValueString"} **/
						));
Valuesetobj.setValue(HapiFHIRHelpers.createbooleantype(valueset.getVlStXpnsnPrmtrVlBlnBln() /** { "tree" :"ValueSet.expansion.parameter.valueBoolean", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion", "addParameter"] , "methodName" : "setValueBoolean"} **/
						));
Valuesetobj.setValue(HapiFHIRHelpers.createintegertype(valueset.getVlStXpnsnPrmtrVlntgrNtgr() /** { "tree" :"ValueSet.expansion.parameter.valueInteger", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion", "addParameter"] , "methodName" : "setValueInteger"} **/
						));
Valuesetobj.setValueDecimal(HapiFHIRHelpers.createdecimal(valueset.getVlStXpnsnPrmtrVlDcmlDcml() /** { "tree" :"ValueSet.expansion.parameter.valueDecimal", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion", "addParameter"] , "methodName" : "setValueDecimal"} **/
						));
Valuesetobj.setValueUri(HapiFHIRHelpers.createuri(valueset.getVlStXpnsnPrmtrVlrRi() /** { "tree" :"ValueSet.expansion.parameter.valueUri", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion", "addParameter"] , "methodName" : "setValueUri"} **/
						));
Valuesetobj.setValueCode(HapiFHIRHelpers.createcode(valueset.getVlStXpnsnPrmtrVlCdCde() /** { "tree" :"ValueSet.expansion.parameter.valueCode", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion", "addParameter"] , "methodName" : "setValueCode"} **/
						));
Valuesetobj.setValue(HapiFHIRHelpers.createdateTimetype(valueset.getVlStXpnsnPrmtrVlDttmDtTme() /** { "tree" :"ValueSet.expansion.parameter.valueDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion", "addParameter"] , "methodName" : "setValueDatetime"} **/
						));
Valuesetobj.setSystem(HapiFHIRHelpers.createuri(valueset.getVlStXpnsnCntnsSstmRi() /** { "tree" :"ValueSet.expansion.contains.system", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion", "addParameter", "addContains"] , "methodName" : "setSystem"} **/
						));
Valuesetobj.setAbstract(HapiFHIRHelpers.createboolean(valueset.getVlStXpnsnCntnsBstrctBln() /** { "tree" :"ValueSet.expansion.contains.abstract", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion", "addParameter", "addContains"] , "methodName" : "setAbstract"} **/
						));
Valuesetobj.setInactive(HapiFHIRHelpers.createboolean(valueset.getVlStXpnsnCntnsNctvBln() /** { "tree" :"ValueSet.expansion.contains.inactive", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion", "addParameter", "addContains"] , "methodName" : "setInactive"} **/
						));
Valuesetobj.setVersion(HapiFHIRHelpers.createstring(valueset.getVlStXpnsnCntnsVrsnStrng() /** { "tree" :"ValueSet.expansion.contains.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion", "addParameter", "addContains"] , "methodName" : "setVersion"} **/
						));
Valuesetobj.setCode(HapiFHIRHelpers.createcode(valueset.getVlStXpnsnCntnsCdCde() /** { "tree" :"ValueSet.expansion.contains.code", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion", "addParameter", "addContains"] , "methodName" : "setCode"} **/
						));
Valuesetobj.setDisplay(HapiFHIRHelpers.createstring(valueset.getVlStXpnsnCntnsDsplStrng() /** { "tree" :"ValueSet.expansion.contains.display", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setExpansion", "addParameter", "addContains"] , "methodName" : "setDisplay"} **/
						));
Valuesetobj.addDesignation(HapiFHIRHelpers.createdesignation(valueset.getVlStXpnsnCntnsDsgntnDsgntn() /** { "tree" :"ValueSet.expansion.contains.designation", "datatype" : "designation", "cardinality" : "Many", "elementtree" : ["setExpansion", "addParameter", "addContains"] , "methodName" : "addDesignation"} **/
						));
Valuesetobj.addContains(HapiFHIRHelpers.createcontains(valueset.getVlStXpnsnCntnsCntnsCntns() /** { "tree" :"ValueSet.expansion.contains.contains", "datatype" : "contains", "cardinality" : "Many", "elementtree" : ["setExpansion", "addParameter", "addContains"] , "methodName" : "addContains"} **/
		));
	}
}
