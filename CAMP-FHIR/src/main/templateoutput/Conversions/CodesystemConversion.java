package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Codesystem.
 * @see .Codesystem
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class CodesystemConversion 
{
	public Patient Codesystems(main.templateoutput.Model.Codesystem codesystem) 
	{
			Patient  Codesystemobj = new Patient(); 

						Codesystemobj.setUrl(HapiFHIRHelpers.createuri(codesystem.getCodeSystemUrlUri() /** { "tree" :"CodeSystem.url", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Codesystemobj.addIdentifier(HapiFHIRHelpers.createIdentifier(codesystem.getCdSstmDntfrDntfrSe() /** { "tree" :"CodeSystem.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, codesystem.getCdSstmDntfrDntfrTpCcCSstm() /** { "tree" :"CodeSystem.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, codesystem.getCdSstmDntfrDntfrTpCcCVrsn() /** { "tree" :"CodeSystem.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, codesystem.getCdSstmDntfrDntfrTpCcCCde() /** { "tree" :"CodeSystem.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, codesystem.getCdSstmDntfrDntfrTpCcCDsplay() /** { "tree" :"CodeSystem.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, codesystem.getCdSstmDntfrDntfrTpCcCSrSlctd() /** { "tree" :"CodeSystem.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, codesystem.getCdSstmDntfrDntfrTpCcTxt() /** { "tree" :"CodeSystem.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, codesystem.getCdSstmDntfrDntfrPrdPrdStrt() /** { "tree" :"CodeSystem.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, codesystem.getCdSstmDntfrDntfrPrdPrdNd() /** { "tree" :"CodeSystem.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, codesystem.getCdSstmDntfrDntfrSsgnr() /** { "tree" :"CodeSystem.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, codesystem.getCdSstmDntfrDntfrVlue() /** { "tree" :"CodeSystem.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, codesystem.getCdSstmDntfrDntfrSstm() /** { "tree" :"CodeSystem.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Codesystemobj.setVersion(HapiFHIRHelpers.createstring(codesystem.getCodeSystemVersionString() /** { "tree" :"CodeSystem.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Codesystemobj.setName(HapiFHIRHelpers.createstring(codesystem.getCodeSystemNameString() /** { "tree" :"CodeSystem.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Codesystemobj.setTitle(HapiFHIRHelpers.createstring(codesystem.getCodeSystemTitleString() /** { "tree" :"CodeSystem.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Codesystemobj.setStatus(HapiFHIRHelpers.createcode(codesystem.getCodeSystemStatusCode() /** { "tree" :"CodeSystem.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Codesystemobj.setExperimental(HapiFHIRHelpers.createboolean(codesystem.getCodeSystemExperimentalBoolean() /** { "tree" :"CodeSystem.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Codesystemobj.setDate(HapiFHIRHelpers.createdateTime(codesystem.getCodeSystemDateDateTime() /** { "tree" :"CodeSystem.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Codesystemobj.setPublisher(HapiFHIRHelpers.createstring(codesystem.getCodeSystemPublisherString() /** { "tree" :"CodeSystem.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Codesystemobj.addContact(HapiFHIRHelpers.createContactDetail(codesystem.getCdSstmCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"CodeSystem.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, codesystem.getCdSstmCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"CodeSystem.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, codesystem.getCdSstmCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"CodeSystem.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, codesystem.getCdSstmCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"CodeSystem.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, codesystem.getCdSstmCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"CodeSystem.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, codesystem.getCdSstmCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"CodeSystem.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, codesystem.getCdSstmCntctCntctDtlNme() /** { "tree" :"CodeSystem.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Codesystemobj.setDescription(HapiFHIRHelpers.createmarkdown(codesystem.getCodeSystemDescriptionMarkdown() /** { "tree" :"CodeSystem.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Codesystemobj.addUseContext(HapiFHIRHelpers.createUsageContext(codesystem.getCdSstmSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"CodeSystem.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, codesystem.getCdSstmSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"CodeSystem.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, codesystem.getCdSstmSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"CodeSystem.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, codesystem.getCdSstmSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"CodeSystem.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, codesystem.getCdSstmSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"CodeSystem.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, codesystem.getCdSstmSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"CodeSystem.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, codesystem.getCdSstmSCntxtSgCntxtCdCSstm() /** { "tree" :"CodeSystem.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, codesystem.getCdSstmSCntxtSgCntxtCdCVrsn() /** { "tree" :"CodeSystem.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, codesystem.getCdSstmSCntxtSgCntxtCdCCde() /** { "tree" :"CodeSystem.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, codesystem.getCdSstmSCntxtSgCntxtCdCDsplay() /** { "tree" :"CodeSystem.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, codesystem.getCdSstmSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"CodeSystem.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, codesystem.getCdSstmSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"CodeSystem.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, codesystem.getCdSstmSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"CodeSystem.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, codesystem.getCdSstmSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"CodeSystem.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, codesystem.getCdSstmSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"CodeSystem.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, codesystem.getCdSstmSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"CodeSystem.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, codesystem.getCdSstmSCntxtSgCntxtVlRngRngLw() /** { "tree" :"CodeSystem.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, codesystem.getCdSstmSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"CodeSystem.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, codesystem.getCdSstmSCntxtSgCntxtVlRfrnce() /** { "tree" :"CodeSystem.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Codesystemobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(codesystem.getCdSstmJrsdctnCcCdngCSstm() /** { "tree" :"CodeSystem.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, codesystem.getCdSstmJrsdctnCcCdngCVrsn() /** { "tree" :"CodeSystem.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, codesystem.getCdSstmJrsdctnCcCdngCCde() /** { "tree" :"CodeSystem.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, codesystem.getCdSstmJrsdctnCcCdngCDsplay() /** { "tree" :"CodeSystem.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, codesystem.getCdSstmJrsdctnCcCdngCSrSlctd() /** { "tree" :"CodeSystem.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, codesystem.getCodeSystemJurisdictionCcText() /** { "tree" :"CodeSystem.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Codesystemobj.setPurpose(HapiFHIRHelpers.createmarkdown(codesystem.getCodeSystemPurposeMarkdown() /** { "tree" :"CodeSystem.purpose", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPurpose"} **/
						));
Codesystemobj.setCopyright(HapiFHIRHelpers.createmarkdown(codesystem.getCodeSystemCopyrightMarkdown() /** { "tree" :"CodeSystem.copyright", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCopyright"} **/
						));
Codesystemobj.setCaseSensitive(HapiFHIRHelpers.createboolean(codesystem.getCodeSystemCaseSensitiveBoolean() /** { "tree" :"CodeSystem.caseSensitive", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCaseSensitive"} **/
						));
Codesystemobj.setValueSet(HapiFHIRHelpers.createcanonical(codesystem.getCodeSystemValueSetCanonical() /** { "tree" :"CodeSystem.valueSet", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueSet"} **/
						));
Codesystemobj.setHierarchyMeaning(HapiFHIRHelpers.createcode(codesystem.getCodeSystemHierarchyMeaningCode() /** { "tree" :"CodeSystem.hierarchyMeaning", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setHierarchyMeaning"} **/
						));
Codesystemobj.setCompositional(HapiFHIRHelpers.createboolean(codesystem.getCodeSystemCompositionalBoolean() /** { "tree" :"CodeSystem.compositional", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCompositional"} **/
						));
Codesystemobj.setVersionNeeded(HapiFHIRHelpers.createboolean(codesystem.getCodeSystemVersionNeededBoolean() /** { "tree" :"CodeSystem.versionNeeded", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersionNeeded"} **/
						));
Codesystemobj.setContent(HapiFHIRHelpers.createcode(codesystem.getCodeSystemContentCode() /** { "tree" :"CodeSystem.content", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setContent"} **/
						));
Codesystemobj.setSupplements(HapiFHIRHelpers.createcanonical(codesystem.getCodeSystemSupplementsCanonical() /** { "tree" :"CodeSystem.supplements", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSupplements"} **/
						));
Codesystemobj.setCount(HapiFHIRHelpers.createunsignedInt(codesystem.getCodeSystemCountUnsignedInt() /** { "tree" :"CodeSystem.count", "datatype" : "unsignedInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCount"} **/
						));
Codesystemobj.setCode(HapiFHIRHelpers.createcode(codesystem.getCodeSystemFilterCodeCode() /** { "tree" :"CodeSystem.filter.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addFilter"] , "methodName" : "setCode"} **/
						));
Codesystemobj.setDescription(HapiFHIRHelpers.createstring(codesystem.getCdSstmFltrDscrptnStrng() /** { "tree" :"CodeSystem.filter.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addFilter"] , "methodName" : "setDescription"} **/
						));
Codesystemobj.setOperator(HapiFHIRHelpers.createcode(codesystem.getCodeSystemFilterOperatorCode() /** { "tree" :"CodeSystem.filter.operator", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addFilter"] , "methodName" : "setOperator"} **/
						));
Codesystemobj.setValue(HapiFHIRHelpers.createstring(codesystem.getCodeSystemFilterValueString() /** { "tree" :"CodeSystem.filter.value", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addFilter"] , "methodName" : "setValue"} **/
						));
Codesystemobj.setCode(HapiFHIRHelpers.createcode(codesystem.getCodeSystemPropertyCodeCode() /** { "tree" :"CodeSystem.property.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addProperty"] , "methodName" : "setCode"} **/
						));
Codesystemobj.setUri(HapiFHIRHelpers.createuri(codesystem.getCodeSystemPropertyUriUri() /** { "tree" :"CodeSystem.property.uri", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["addProperty"] , "methodName" : "setUri"} **/
						));
Codesystemobj.setDescription(HapiFHIRHelpers.createstring(codesystem.getCdSstmPrprtDscrptnStrng() /** { "tree" :"CodeSystem.property.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addProperty"] , "methodName" : "setDescription"} **/
						));
Codesystemobj.setType(HapiFHIRHelpers.createcode(codesystem.getCodeSystemPropertyTypeCode() /** { "tree" :"CodeSystem.property.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addProperty"] , "methodName" : "setType"} **/
						));
Codesystemobj.setCode(HapiFHIRHelpers.createcode(codesystem.getCodeSystemConceptCodeCode() /** { "tree" :"CodeSystem.concept.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addConcept"] , "methodName" : "setCode"} **/
						));
Codesystemobj.setDisplay(HapiFHIRHelpers.createstring(codesystem.getCodeSystemConceptDisplayString() /** { "tree" :"CodeSystem.concept.display", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addConcept"] , "methodName" : "setDisplay"} **/
						));
Codesystemobj.setDefinition(HapiFHIRHelpers.createstring(codesystem.getCdSstmCncptDfntnStrng() /** { "tree" :"CodeSystem.concept.definition", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addConcept"] , "methodName" : "setDefinition"} **/
						));
Codesystemobj.setLanguage(HapiFHIRHelpers.createcode(codesystem.getCdSstmCncptDsgntnLnggCde() /** { "tree" :"CodeSystem.concept.designation.language", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addConcept", "addDesignation"] , "methodName" : "setLanguage"} **/
						));
Codesystemobj.setUse(HapiFHIRHelpers.createCoding(codesystem.getCdSstmCncptDsgntnSCSrSlctd() /** { "tree" :"CodeSystem.concept.designation.use", "datatype" : "Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addConcept", "addDesignation"] , "methodName" : "setUse, setUserSelected"} **/
						, codesystem.getCdSstmCncptDsgntnSCCde() /** { "tree" :"CodeSystem.concept.designation.use", "datatype" : "Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addConcept", "addDesignation"] , "methodName" : "setUse, setCode"} **/
						, codesystem.getCdSstmCncptDsgntnSCVrsn() /** { "tree" :"CodeSystem.concept.designation.use", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addConcept", "addDesignation"] , "methodName" : "setUse, setVersion"} **/
						, codesystem.getCdSstmCncptDsgntnSCDsplay() /** { "tree" :"CodeSystem.concept.designation.use", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addConcept", "addDesignation"] , "methodName" : "setUse, setDisplay"} **/
						, codesystem.getCdSstmCncptDsgntnSCSstm() /** { "tree" :"CodeSystem.concept.designation.use", "datatype" : "Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addConcept", "addDesignation"] , "methodName" : "setUse, setSystem"} **/
						));
Codesystemobj.setValue(HapiFHIRHelpers.createstring(codesystem.getCdSstmCncptDsgntnVlStrng() /** { "tree" :"CodeSystem.concept.designation.value", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addConcept", "addDesignation"] , "methodName" : "setValue"} **/
						));
Codesystemobj.setCode(HapiFHIRHelpers.createcode(codesystem.getCdSstmCncptPrprtCdCde() /** { "tree" :"CodeSystem.concept.property.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addConcept", "addDesignation", "addProperty"] , "methodName" : "setCode"} **/
						));
Codesystemobj.setValueCode(HapiFHIRHelpers.createcode(codesystem.getCdSstmCncptPrprtVlCdCde() /** { "tree" :"CodeSystem.concept.property.valueCode", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addConcept", "addDesignation", "addProperty"] , "methodName" : "setValueCode"} **/
						));
Codesystemobj.setValueCoding(HapiFHIRHelpers.createCoding(codesystem.getCdSstmCncptPrprtVlCdngCSrSlctd() /** { "tree" :"CodeSystem.concept.property.valueCoding", "datatype" : "Coding, boolean", "cardinality" : "Required", "elementtree" : ["addConcept", "addDesignation", "addProperty"] , "methodName" : "setValueCoding, setUserSelected"} **/
						, codesystem.getCdSstmCncptPrprtVlCdngCCde() /** { "tree" :"CodeSystem.concept.property.valueCoding", "datatype" : "Coding, code", "cardinality" : "Required", "elementtree" : ["addConcept", "addDesignation", "addProperty"] , "methodName" : "setValueCoding, setCode"} **/
						, codesystem.getCdSstmCncptPrprtVlCdngCVrsn() /** { "tree" :"CodeSystem.concept.property.valueCoding", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addConcept", "addDesignation", "addProperty"] , "methodName" : "setValueCoding, setVersion"} **/
						, codesystem.getCdSstmCncptPrprtVlCdngCDsplay() /** { "tree" :"CodeSystem.concept.property.valueCoding", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addConcept", "addDesignation", "addProperty"] , "methodName" : "setValueCoding, setDisplay"} **/
						, codesystem.getCdSstmCncptPrprtVlCdngCSstm() /** { "tree" :"CodeSystem.concept.property.valueCoding", "datatype" : "Coding, uri", "cardinality" : "Required", "elementtree" : ["addConcept", "addDesignation", "addProperty"] , "methodName" : "setValueCoding, setSystem"} **/
						));
Codesystemobj.setValueString(HapiFHIRHelpers.createstring(codesystem.getCdSstmCncptPrprtVlStrngStrng() /** { "tree" :"CodeSystem.concept.property.valueString", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addConcept", "addDesignation", "addProperty"] , "methodName" : "setValueString"} **/
						));
Codesystemobj.setValue(HapiFHIRHelpers.createintegertype(codesystem.getCdSstmCncptPrprtVlntgrNtgr() /** { "tree" :"CodeSystem.concept.property.valueInteger", "datatype" : "integer", "cardinality" : "Required", "elementtree" : ["addConcept", "addDesignation", "addProperty"] , "methodName" : "setValueInteger"} **/
						));
Codesystemobj.setValue(HapiFHIRHelpers.createbooleantype(codesystem.getCdSstmCncptPrprtVlBlnBln() /** { "tree" :"CodeSystem.concept.property.valueBoolean", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["addConcept", "addDesignation", "addProperty"] , "methodName" : "setValueBoolean"} **/
						));
Codesystemobj.setValue(HapiFHIRHelpers.createdateTimetype(codesystem.getCdSstmCncptPrprtVlDttmDtTme() /** { "tree" :"CodeSystem.concept.property.valueDatetime", "datatype" : "dateTime", "cardinality" : "Required", "elementtree" : ["addConcept", "addDesignation", "addProperty"] , "methodName" : "setValueDatetime"} **/
						));
Codesystemobj.setValueDecimal(HapiFHIRHelpers.createdecimal(codesystem.getCdSstmCncptPrprtVlDcmlDcml() /** { "tree" :"CodeSystem.concept.property.valueDecimal", "datatype" : "decimal", "cardinality" : "Required", "elementtree" : ["addConcept", "addDesignation", "addProperty"] , "methodName" : "setValueDecimal"} **/
						));
Codesystemobj.addConcept(HapiFHIRHelpers.createconcept(codesystem.getCodeSystemConceptConceptConcept() /** { "tree" :"CodeSystem.concept.concept", "datatype" : "concept", "cardinality" : "Many", "elementtree" : ["addConcept", "addDesignation", "addProperty"] , "methodName" : "addConcept"} **/
		));
	}
}
