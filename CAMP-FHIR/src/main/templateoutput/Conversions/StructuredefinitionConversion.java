package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Structuredefinition.
 * @see .Structuredefinition
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class StructuredefinitionConversion 
{
	public Patient Structuredefinitions(main.templateoutput.Model.Structuredefinition structuredefinition) 
	{
			Patient  Structuredefinitionobj = new Patient(); 

						Structuredefinitionobj.setUrl(HapiFHIRHelpers.createuri(structuredefinition.getStructureDefinitionUrlUri() /** { "tree" :"StructureDefinition.url", "datatype" : "uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Structuredefinitionobj.addIdentifier(HapiFHIRHelpers.createIdentifier(structuredefinition.getStrctrDfntnDntfrDntfrSe() /** { "tree" :"StructureDefinition.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, structuredefinition.getStrctrDfntnDntfrDntfrTpCcCSstm() /** { "tree" :"StructureDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, structuredefinition.getStrctrDfntnDntfrDntfrTpCcCVrsn() /** { "tree" :"StructureDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, structuredefinition.getStrctrDfntnDntfrDntfrTpCcCCde() /** { "tree" :"StructureDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, structuredefinition.getStrctrDfntnDntfrDntfrTpCcCDsplay() /** { "tree" :"StructureDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, structuredefinition.getStrctrDfntnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"StructureDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, structuredefinition.getStrctrDfntnDntfrDntfrTpCcTxt() /** { "tree" :"StructureDefinition.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, structuredefinition.getStrctrDfntnDntfrDntfrPrdPrdStrt() /** { "tree" :"StructureDefinition.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, structuredefinition.getStrctrDfntnDntfrDntfrPrdPrdNd() /** { "tree" :"StructureDefinition.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, structuredefinition.getStrctrDfntnDntfrDntfrSsgnr() /** { "tree" :"StructureDefinition.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, structuredefinition.getStrctrDfntnDntfrDntfrVlue() /** { "tree" :"StructureDefinition.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, structuredefinition.getStrctrDfntnDntfrDntfrSstm() /** { "tree" :"StructureDefinition.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Structuredefinitionobj.setVersion(HapiFHIRHelpers.createstring(structuredefinition.getStructureDefinitionVersionString() /** { "tree" :"StructureDefinition.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Structuredefinitionobj.setName(HapiFHIRHelpers.createstring(structuredefinition.getStructureDefinitionNameString() /** { "tree" :"StructureDefinition.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setName"} **/
						));
Structuredefinitionobj.setTitle(HapiFHIRHelpers.createstring(structuredefinition.getStructureDefinitionTitleString() /** { "tree" :"StructureDefinition.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Structuredefinitionobj.setStatus(HapiFHIRHelpers.createcode(structuredefinition.getStructureDefinitionStatusCode() /** { "tree" :"StructureDefinition.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Structuredefinitionobj.setExperimental(HapiFHIRHelpers.createboolean(structuredefinition.getStrctrDfntnXprmntlBln() /** { "tree" :"StructureDefinition.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Structuredefinitionobj.setDate(HapiFHIRHelpers.createdateTime(structuredefinition.getStructureDefinitionDateDateTime() /** { "tree" :"StructureDefinition.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Structuredefinitionobj.setPublisher(HapiFHIRHelpers.createstring(structuredefinition.getStrctrDfntnPblshrStrng() /** { "tree" :"StructureDefinition.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Structuredefinitionobj.addContact(HapiFHIRHelpers.createContactDetail(structuredefinition.getStrctrDfntnCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"StructureDefinition.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, structuredefinition.getStrctrDfntnCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"StructureDefinition.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, structuredefinition.getStrctrDfntnCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"StructureDefinition.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, structuredefinition.getStrctrDfntnCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"StructureDefinition.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, structuredefinition.getStrctrDfntnCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"StructureDefinition.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, structuredefinition.getStrctrDfntnCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"StructureDefinition.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, structuredefinition.getStrctrDfntnCntctCntctDtlNme() /** { "tree" :"StructureDefinition.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Structuredefinitionobj.setDescription(HapiFHIRHelpers.createmarkdown(structuredefinition.getStrctrDfntnDscrptnMrkdwn() /** { "tree" :"StructureDefinition.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Structuredefinitionobj.addUseContext(HapiFHIRHelpers.createUsageContext(structuredefinition.getStrctrDfntnSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"StructureDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, structuredefinition.getStrctrDfntnSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"StructureDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, structuredefinition.getStrctrDfntnSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"StructureDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, structuredefinition.getStrctrDfntnSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"StructureDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, structuredefinition.getStrctrDfntnSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"StructureDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, structuredefinition.getStrctrDfntnSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"StructureDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, structuredefinition.getStrctrDfntnSCntxtSgCntxtCdCSstm() /** { "tree" :"StructureDefinition.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, structuredefinition.getStrctrDfntnSCntxtSgCntxtCdCVrsn() /** { "tree" :"StructureDefinition.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, structuredefinition.getStrctrDfntnSCntxtSgCntxtCdCCde() /** { "tree" :"StructureDefinition.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, structuredefinition.getStrctrDfntnSCntxtSgCntxtCdCDsplay() /** { "tree" :"StructureDefinition.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, structuredefinition.getStrctrDfntnSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"StructureDefinition.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, structuredefinition.getStrctrDfntnSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"StructureDefinition.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, structuredefinition.getStrctrDfntnSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"StructureDefinition.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, structuredefinition.getStrctrDfntnSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"StructureDefinition.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, structuredefinition.getStrctrDfntnSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"StructureDefinition.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, structuredefinition.getStrctrDfntnSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"StructureDefinition.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, structuredefinition.getStrctrDfntnSCntxtSgCntxtVlRngRngLw() /** { "tree" :"StructureDefinition.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, structuredefinition.getStrctrDfntnSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"StructureDefinition.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, structuredefinition.getStrctrDfntnSCntxtSgCntxtVlRfrnce() /** { "tree" :"StructureDefinition.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Structuredefinitionobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(structuredefinition.getStrctrDfntnJrsdctnCcCdngCSstm() /** { "tree" :"StructureDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, structuredefinition.getStrctrDfntnJrsdctnCcCdngCVrsn() /** { "tree" :"StructureDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, structuredefinition.getStrctrDfntnJrsdctnCcCdngCCde() /** { "tree" :"StructureDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, structuredefinition.getStrctrDfntnJrsdctnCcCdngCDsplay() /** { "tree" :"StructureDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, structuredefinition.getStrctrDfntnJrsdctnCcCdngCSrSlctd() /** { "tree" :"StructureDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, structuredefinition.getStrctrDfntnJrsdctnCcTxt() /** { "tree" :"StructureDefinition.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Structuredefinitionobj.setPurpose(HapiFHIRHelpers.createmarkdown(structuredefinition.getStrctrDfntnPrpsMrkdwn() /** { "tree" :"StructureDefinition.purpose", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPurpose"} **/
						));
Structuredefinitionobj.setCopyright(HapiFHIRHelpers.createmarkdown(structuredefinition.getStrctrDfntnCprghtMrkdwn() /** { "tree" :"StructureDefinition.copyright", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCopyright"} **/
						));
Structuredefinitionobj.addKeyword(HapiFHIRHelpers.createCoding(structuredefinition.getStrctrDfntnKwrdCSrSlctd() /** { "tree" :"StructureDefinition.keyword", "datatype" : "Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addKeyword, setUserSelected"} **/
						, structuredefinition.getStructureDefinitionKeywordCCode() /** { "tree" :"StructureDefinition.keyword", "datatype" : "Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addKeyword, setCode"} **/
						, structuredefinition.getStrctrDfntnKwrdCVrsn() /** { "tree" :"StructureDefinition.keyword", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addKeyword, setVersion"} **/
						, structuredefinition.getStrctrDfntnKwrdCDsplay() /** { "tree" :"StructureDefinition.keyword", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addKeyword, setDisplay"} **/
						, structuredefinition.getStrctrDfntnKwrdCSstm() /** { "tree" :"StructureDefinition.keyword", "datatype" : "Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addKeyword, setSystem"} **/
						));
Structuredefinitionobj.setFhirVersion(HapiFHIRHelpers.createcode(structuredefinition.getStrctrDfntnFhrVrsnCde() /** { "tree" :"StructureDefinition.fhirVersion", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFhirVersion"} **/
						));
Structuredefinitionobj.setIdentity(HapiFHIRHelpers.createid(structuredefinition.getStrctrDfntnMppngDnttD() /** { "tree" :"StructureDefinition.mapping.identity", "datatype" : "id", "cardinality" : "Required", "elementtree" : ["addMapping"] , "methodName" : "setIdentity"} **/
						));
Structuredefinitionobj.setUri(HapiFHIRHelpers.createuri(structuredefinition.getStrctrDfntnMppngRRi() /** { "tree" :"StructureDefinition.mapping.uri", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["addMapping"] , "methodName" : "setUri"} **/
						));
Structuredefinitionobj.setName(HapiFHIRHelpers.createstring(structuredefinition.getStrctrDfntnMppngNmStrng() /** { "tree" :"StructureDefinition.mapping.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addMapping"] , "methodName" : "setName"} **/
						));
Structuredefinitionobj.setComment(HapiFHIRHelpers.createstring(structuredefinition.getStrctrDfntnMppngCmmntStrng() /** { "tree" :"StructureDefinition.mapping.comment", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addMapping"] , "methodName" : "setComment"} **/
						));
Structuredefinitionobj.setKind(HapiFHIRHelpers.createcode(structuredefinition.getStructureDefinitionKindCode() /** { "tree" :"StructureDefinition.kind", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setKind"} **/
						));
Structuredefinitionobj.setAbstract(HapiFHIRHelpers.createboolean(structuredefinition.getStrctrDfntnBstrctBln() /** { "tree" :"StructureDefinition.abstract", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setAbstract"} **/
						));
Structuredefinitionobj.setType(HapiFHIRHelpers.createcode(structuredefinition.getStrctrDfntnCntxtTpCde() /** { "tree" :"StructureDefinition.context.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addContext"] , "methodName" : "setType"} **/
						));
Structuredefinitionobj.setExpression(HapiFHIRHelpers.createstring(structuredefinition.getStrctrDfntnCntxtXprssnStrng() /** { "tree" :"StructureDefinition.context.expression", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addContext"] , "methodName" : "setExpression"} **/
						));
Structuredefinitionobj.addContextInvariant(HapiFHIRHelpers.createstring(structuredefinition.getStrctrDfntnCntxtnvrntStrng() /** { "tree" :"StructureDefinition.contextInvariant", "datatype" : "string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContextInvariant"} **/
						));
Structuredefinitionobj.setType(HapiFHIRHelpers.createuri(structuredefinition.getStructureDefinitionTypeUri() /** { "tree" :"StructureDefinition.type", "datatype" : "uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType"} **/
						));
Structuredefinitionobj.setBaseDefinition(HapiFHIRHelpers.createcanonical(structuredefinition.getStrctrDfntnBsDfntnCnncl() /** { "tree" :"StructureDefinition.baseDefinition", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBaseDefinition"} **/
						));
Structuredefinitionobj.setDerivation(HapiFHIRHelpers.createcode(structuredefinition.getStrctrDfntnDrvtnCde() /** { "tree" :"StructureDefinition.derivation", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDerivation"} **/
						));
Structuredefinitionobj.setElement(HapiFHIRHelpers.createElementDefinition(structuredefinition.getStrctrDfntnSnpshtLmntLmntDfntn() /** { "tree" :"StructureDefinition.snapshot.element", "datatype" : "ElementDefinition", "cardinality" : "ZeroOne", "elementtree" : ["setSnapshot"] , "methodName" : "setElement"} **/
						, structuredefinition.getStrctrDfntnDffrntlLmntLmntDfntn() /** { "tree" :"StructureDefinition.differential.element", "datatype" : "ElementDefinition", "cardinality" : "ZeroOne", "elementtree" : ["setDifferential"] , "methodName" : "setElement"} **/
		));
	}
}
