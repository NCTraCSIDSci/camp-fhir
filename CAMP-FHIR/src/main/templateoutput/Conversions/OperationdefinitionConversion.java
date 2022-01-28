package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Operationdefinition.
 * @see .Operationdefinition
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class OperationdefinitionConversion 
{
	public Patient Operationdefinitions(main.templateoutput.Model.Operationdefinition operationdefinition) 
	{
			Patient  Operationdefinitionobj = new Patient(); 

						Operationdefinitionobj.setUrl(HapiFHIRHelpers.createuri(operationdefinition.getOperationDefinitionUrlUri() /** { "tree" :"OperationDefinition.url", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Operationdefinitionobj.setVersion(HapiFHIRHelpers.createstring(operationdefinition.getOperationDefinitionVersionString() /** { "tree" :"OperationDefinition.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Operationdefinitionobj.setName(HapiFHIRHelpers.createstring(operationdefinition.getOperationDefinitionNameString() /** { "tree" :"OperationDefinition.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setName"} **/
						));
Operationdefinitionobj.setTitle(HapiFHIRHelpers.createstring(operationdefinition.getOperationDefinitionTitleString() /** { "tree" :"OperationDefinition.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Operationdefinitionobj.setStatus(HapiFHIRHelpers.createcode(operationdefinition.getOperationDefinitionStatusCode() /** { "tree" :"OperationDefinition.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Operationdefinitionobj.setKind(HapiFHIRHelpers.createcode(operationdefinition.getOperationDefinitionKindCode() /** { "tree" :"OperationDefinition.kind", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setKind"} **/
						));
Operationdefinitionobj.setExperimental(HapiFHIRHelpers.createboolean(operationdefinition.getOprtnDfntnXprmntlBln() /** { "tree" :"OperationDefinition.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Operationdefinitionobj.setDate(HapiFHIRHelpers.createdateTime(operationdefinition.getOperationDefinitionDateDateTime() /** { "tree" :"OperationDefinition.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Operationdefinitionobj.setPublisher(HapiFHIRHelpers.createstring(operationdefinition.getOprtnDfntnPblshrStrng() /** { "tree" :"OperationDefinition.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Operationdefinitionobj.addContact(HapiFHIRHelpers.createContactDetail(operationdefinition.getOprtnDfntnCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"OperationDefinition.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, operationdefinition.getOprtnDfntnCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"OperationDefinition.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, operationdefinition.getOprtnDfntnCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"OperationDefinition.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, operationdefinition.getOprtnDfntnCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"OperationDefinition.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, operationdefinition.getOprtnDfntnCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"OperationDefinition.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, operationdefinition.getOprtnDfntnCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"OperationDefinition.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, operationdefinition.getOprtnDfntnCntctCntctDtlNme() /** { "tree" :"OperationDefinition.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Operationdefinitionobj.setDescription(HapiFHIRHelpers.createmarkdown(operationdefinition.getOprtnDfntnDscrptnMrkdwn() /** { "tree" :"OperationDefinition.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Operationdefinitionobj.addUseContext(HapiFHIRHelpers.createUsageContext(operationdefinition.getOprtnDfntnSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"OperationDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, operationdefinition.getOprtnDfntnSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"OperationDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, operationdefinition.getOprtnDfntnSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"OperationDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, operationdefinition.getOprtnDfntnSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"OperationDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, operationdefinition.getOprtnDfntnSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"OperationDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, operationdefinition.getOprtnDfntnSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"OperationDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, operationdefinition.getOprtnDfntnSCntxtSgCntxtCdCSstm() /** { "tree" :"OperationDefinition.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, operationdefinition.getOprtnDfntnSCntxtSgCntxtCdCVrsn() /** { "tree" :"OperationDefinition.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, operationdefinition.getOprtnDfntnSCntxtSgCntxtCdCCde() /** { "tree" :"OperationDefinition.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, operationdefinition.getOprtnDfntnSCntxtSgCntxtCdCDsplay() /** { "tree" :"OperationDefinition.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, operationdefinition.getOprtnDfntnSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"OperationDefinition.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, operationdefinition.getOprtnDfntnSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"OperationDefinition.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, operationdefinition.getOprtnDfntnSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"OperationDefinition.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, operationdefinition.getOprtnDfntnSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"OperationDefinition.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, operationdefinition.getOprtnDfntnSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"OperationDefinition.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, operationdefinition.getOprtnDfntnSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"OperationDefinition.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, operationdefinition.getOprtnDfntnSCntxtSgCntxtVlRngRngLw() /** { "tree" :"OperationDefinition.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, operationdefinition.getOprtnDfntnSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"OperationDefinition.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, operationdefinition.getOprtnDfntnSCntxtSgCntxtVlRfrnce() /** { "tree" :"OperationDefinition.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Operationdefinitionobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(operationdefinition.getOprtnDfntnJrsdctnCcCdngCSstm() /** { "tree" :"OperationDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, operationdefinition.getOprtnDfntnJrsdctnCcCdngCVrsn() /** { "tree" :"OperationDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, operationdefinition.getOprtnDfntnJrsdctnCcCdngCCde() /** { "tree" :"OperationDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, operationdefinition.getOprtnDfntnJrsdctnCcCdngCDsplay() /** { "tree" :"OperationDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, operationdefinition.getOprtnDfntnJrsdctnCcCdngCSrSlctd() /** { "tree" :"OperationDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, operationdefinition.getOprtnDfntnJrsdctnCcTxt() /** { "tree" :"OperationDefinition.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Operationdefinitionobj.setPurpose(HapiFHIRHelpers.createmarkdown(operationdefinition.getOprtnDfntnPrpsMrkdwn() /** { "tree" :"OperationDefinition.purpose", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPurpose"} **/
						));
Operationdefinitionobj.setAffectsState(HapiFHIRHelpers.createboolean(operationdefinition.getOprtnDfntnFfctsSttBln() /** { "tree" :"OperationDefinition.affectsState", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAffectsState"} **/
						));
Operationdefinitionobj.setCode(HapiFHIRHelpers.createcode(operationdefinition.getOperationDefinitionCodeCode() /** { "tree" :"OperationDefinition.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode"} **/
						));
Operationdefinitionobj.setComment(HapiFHIRHelpers.createmarkdown(operationdefinition.getOprtnDfntnCmmntMrkdwn() /** { "tree" :"OperationDefinition.comment", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setComment"} **/
						));
Operationdefinitionobj.setBase(HapiFHIRHelpers.createcanonical(operationdefinition.getOperationDefinitionBaseCanonical() /** { "tree" :"OperationDefinition.base", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBase"} **/
						));
Operationdefinitionobj.addResource(HapiFHIRHelpers.createcode(operationdefinition.getOperationDefinitionResourceCode() /** { "tree" :"OperationDefinition.resource", "datatype" : "code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addResource"} **/
						));
Operationdefinitionobj.setSystem(HapiFHIRHelpers.createboolean(operationdefinition.getOperationDefinitionSystemBoolean() /** { "tree" :"OperationDefinition.system", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setSystem"} **/
						));
Operationdefinitionobj.setType(HapiFHIRHelpers.createboolean(operationdefinition.getOperationDefinitionTypeBoolean() /** { "tree" :"OperationDefinition.type", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType"} **/
						));
Operationdefinitionobj.setInstance(HapiFHIRHelpers.createboolean(operationdefinition.getOprtnDfntnNstncBln() /** { "tree" :"OperationDefinition.instance", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setInstance"} **/
						));
Operationdefinitionobj.setInputProfile(HapiFHIRHelpers.createcanonical(operationdefinition.getOprtnDfntnNptPrflCnncl() /** { "tree" :"OperationDefinition.inputProfile", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setInputProfile"} **/
						));
Operationdefinitionobj.setOutputProfile(HapiFHIRHelpers.createcanonical(operationdefinition.getOprtnDfntnTptPrflCnncl() /** { "tree" :"OperationDefinition.outputProfile", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOutputProfile"} **/
						));
Operationdefinitionobj.setName(HapiFHIRHelpers.createcode(operationdefinition.getOprtnDfntnPrmtrNmCde() /** { "tree" :"OperationDefinition.parameter.name", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addParameter"] , "methodName" : "setName"} **/
						));
Operationdefinitionobj.setUse(HapiFHIRHelpers.createcode(operationdefinition.getOprtnDfntnPrmtrSCde() /** { "tree" :"OperationDefinition.parameter.use", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addParameter"] , "methodName" : "setUse"} **/
						));
Operationdefinitionobj.setMin(HapiFHIRHelpers.createinteger(operationdefinition.getOprtnDfntnPrmtrMnNtgr() /** { "tree" :"OperationDefinition.parameter.min", "datatype" : "integer", "cardinality" : "Required", "elementtree" : ["addParameter"] , "methodName" : "setMin"} **/
						));
Operationdefinitionobj.setMax(HapiFHIRHelpers.createstring(operationdefinition.getOprtnDfntnPrmtrMxStrng() /** { "tree" :"OperationDefinition.parameter.max", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addParameter"] , "methodName" : "setMax"} **/
						));
Operationdefinitionobj.setDocumentation(HapiFHIRHelpers.createstring(operationdefinition.getOprtnDfntnPrmtrDcmnttnStrng() /** { "tree" :"OperationDefinition.parameter.documentation", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setDocumentation"} **/
						));
Operationdefinitionobj.setType(HapiFHIRHelpers.createcode(operationdefinition.getOprtnDfntnPrmtrTpCde() /** { "tree" :"OperationDefinition.parameter.type", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setType"} **/
						));
Operationdefinitionobj.addTargetProfile(HapiFHIRHelpers.createcanonical(operationdefinition.getOprtnDfntnPrmtrTrgtPrflCnncl() /** { "tree" :"OperationDefinition.parameter.targetProfile", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : ["addParameter"] , "methodName" : "addTargetProfile"} **/
						));
Operationdefinitionobj.setSearchType(HapiFHIRHelpers.createcode(operationdefinition.getOprtnDfntnPrmtrSrchTpCde() /** { "tree" :"OperationDefinition.parameter.searchType", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setSearchType"} **/
						));
Operationdefinitionobj.setStrength(HapiFHIRHelpers.createcode(operationdefinition.getOprtnDfntnPrmtrBndngStrCde() /** { "tree" :"OperationDefinition.parameter.binding.strength", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addParameter", "setBinding"] , "methodName" : "setStrength"} **/
						));
Operationdefinitionobj.setValueSet(HapiFHIRHelpers.createcanonical(operationdefinition.getOprtnDfntnPrmtrBndngVlStCnncl() /** { "tree" :"OperationDefinition.parameter.binding.valueSet", "datatype" : "canonical", "cardinality" : "Required", "elementtree" : ["addParameter", "setBinding"] , "methodName" : "setValueSet"} **/
						));
Operationdefinitionobj.setSource(HapiFHIRHelpers.createstring(operationdefinition.getOprtnDfntnPrmtrRfrncdFrmSrcStrng() /** { "tree" :"OperationDefinition.parameter.referencedFrom.source", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addParameter", "setBinding", "addReferencedFrom"] , "methodName" : "setSource"} **/
						));
Operationdefinitionobj.setSourceId(HapiFHIRHelpers.createstring(operationdefinition.getOprtnDfntnPrmtrRfrncdFrmSrcdStrng() /** { "tree" :"OperationDefinition.parameter.referencedFrom.sourceId", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addParameter", "setBinding", "addReferencedFrom"] , "methodName" : "setSourceId"} **/
						));
Operationdefinitionobj.addPart(HapiFHIRHelpers.createparameter(operationdefinition.getOprtnDfntnPrmtrPrtPrmtr() /** { "tree" :"OperationDefinition.parameter.part", "datatype" : "parameter", "cardinality" : "Many", "elementtree" : ["addParameter", "setBinding", "addReferencedFrom"] , "methodName" : "addPart"} **/
						));
Operationdefinitionobj.addParameterName(HapiFHIRHelpers.createstring(operationdefinition.getOprtnDfntnVrldPrmtrNmStrng() /** { "tree" :"OperationDefinition.overload.parameterName", "datatype" : "string", "cardinality" : "Many", "elementtree" : ["addOverload"] , "methodName" : "addParameterName"} **/
						));
Operationdefinitionobj.setComment(HapiFHIRHelpers.createstring(operationdefinition.getOprtnDfntnVrldCmmntStrng() /** { "tree" :"OperationDefinition.overload.comment", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addOverload"] , "methodName" : "setComment"} **/
		));
	}
}
