package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Searchparameter.
 * @see .Searchparameter
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class SearchparameterConversion 
{
	public Patient Searchparameters(main.templateoutput.Model.Searchparameter searchparameter) 
	{
			Patient  Searchparameterobj = new Patient(); 

						Searchparameterobj.setUrl(HapiFHIRHelpers.createuri(searchparameter.getSearchParameterUrlUri() /** { "tree" :"SearchParameter.url", "datatype" : "uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Searchparameterobj.setVersion(HapiFHIRHelpers.createstring(searchparameter.getSearchParameterVersionString() /** { "tree" :"SearchParameter.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Searchparameterobj.setName(HapiFHIRHelpers.createstring(searchparameter.getSearchParameterNameString() /** { "tree" :"SearchParameter.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setName"} **/
						));
Searchparameterobj.setDerivedFrom(HapiFHIRHelpers.createcanonical(searchparameter.getSrchPrmtrDrvdFrmCnncl() /** { "tree" :"SearchParameter.derivedFrom", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDerivedFrom"} **/
						));
Searchparameterobj.setStatus(HapiFHIRHelpers.createcode(searchparameter.getSearchParameterStatusCode() /** { "tree" :"SearchParameter.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Searchparameterobj.setExperimental(HapiFHIRHelpers.createboolean(searchparameter.getSrchPrmtrXprmntlBln() /** { "tree" :"SearchParameter.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Searchparameterobj.setDate(HapiFHIRHelpers.createdateTime(searchparameter.getSearchParameterDateDateTime() /** { "tree" :"SearchParameter.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Searchparameterobj.setPublisher(HapiFHIRHelpers.createstring(searchparameter.getSearchParameterPublisherString() /** { "tree" :"SearchParameter.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Searchparameterobj.addContact(HapiFHIRHelpers.createContactDetail(searchparameter.getSrchPrmtrCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"SearchParameter.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, searchparameter.getSrchPrmtrCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"SearchParameter.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, searchparameter.getSrchPrmtrCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"SearchParameter.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, searchparameter.getSrchPrmtrCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"SearchParameter.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, searchparameter.getSrchPrmtrCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"SearchParameter.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, searchparameter.getSrchPrmtrCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"SearchParameter.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, searchparameter.getSrchPrmtrCntctCntctDtlNme() /** { "tree" :"SearchParameter.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Searchparameterobj.setDescription(HapiFHIRHelpers.createmarkdown(searchparameter.getSrchPrmtrDscrptnMrkdwn() /** { "tree" :"SearchParameter.description", "datatype" : "markdown", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Searchparameterobj.addUseContext(HapiFHIRHelpers.createUsageContext(searchparameter.getSrchPrmtrSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"SearchParameter.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, searchparameter.getSrchPrmtrSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"SearchParameter.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, searchparameter.getSrchPrmtrSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"SearchParameter.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, searchparameter.getSrchPrmtrSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"SearchParameter.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, searchparameter.getSrchPrmtrSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"SearchParameter.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, searchparameter.getSrchPrmtrSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"SearchParameter.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, searchparameter.getSrchPrmtrSCntxtSgCntxtCdCSstm() /** { "tree" :"SearchParameter.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, searchparameter.getSrchPrmtrSCntxtSgCntxtCdCVrsn() /** { "tree" :"SearchParameter.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, searchparameter.getSrchPrmtrSCntxtSgCntxtCdCCde() /** { "tree" :"SearchParameter.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, searchparameter.getSrchPrmtrSCntxtSgCntxtCdCDsplay() /** { "tree" :"SearchParameter.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, searchparameter.getSrchPrmtrSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"SearchParameter.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, searchparameter.getSrchPrmtrSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"SearchParameter.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, searchparameter.getSrchPrmtrSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"SearchParameter.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, searchparameter.getSrchPrmtrSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"SearchParameter.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, searchparameter.getSrchPrmtrSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"SearchParameter.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, searchparameter.getSrchPrmtrSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"SearchParameter.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, searchparameter.getSrchPrmtrSCntxtSgCntxtVlRngRngLw() /** { "tree" :"SearchParameter.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, searchparameter.getSrchPrmtrSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"SearchParameter.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, searchparameter.getSrchPrmtrSCntxtSgCntxtVlRfrnce() /** { "tree" :"SearchParameter.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Searchparameterobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(searchparameter.getSrchPrmtrJrsdctnCcCdngCSstm() /** { "tree" :"SearchParameter.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, searchparameter.getSrchPrmtrJrsdctnCcCdngCVrsn() /** { "tree" :"SearchParameter.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, searchparameter.getSrchPrmtrJrsdctnCcCdngCCde() /** { "tree" :"SearchParameter.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, searchparameter.getSrchPrmtrJrsdctnCcCdngCDsplay() /** { "tree" :"SearchParameter.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, searchparameter.getSrchPrmtrJrsdctnCcCdngCSrSlctd() /** { "tree" :"SearchParameter.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, searchparameter.getSrchPrmtrJrsdctnCcTxt() /** { "tree" :"SearchParameter.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Searchparameterobj.setPurpose(HapiFHIRHelpers.createmarkdown(searchparameter.getSearchParameterPurposeMarkdown() /** { "tree" :"SearchParameter.purpose", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPurpose"} **/
						));
Searchparameterobj.setCode(HapiFHIRHelpers.createcode(searchparameter.getSearchParameterCodeCode() /** { "tree" :"SearchParameter.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode"} **/
						));
Searchparameterobj.setBase(HapiFHIRHelpers.createcode(searchparameter.getSearchParameterBaseCode() /** { "tree" :"SearchParameter.base", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setBase"} **/
						));
Searchparameterobj.setType(HapiFHIRHelpers.createcode(searchparameter.getSearchParameterTypeCode() /** { "tree" :"SearchParameter.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType"} **/
						));
Searchparameterobj.setExpression(HapiFHIRHelpers.createstring(searchparameter.getSearchParameterExpressionString() /** { "tree" :"SearchParameter.expression", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExpression"} **/
						));
Searchparameterobj.setXpath(HapiFHIRHelpers.createstring(searchparameter.getSearchParameterXpathString() /** { "tree" :"SearchParameter.xpath", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setXpath"} **/
						));
Searchparameterobj.setXpathUsage(HapiFHIRHelpers.createcode(searchparameter.getSearchParameterXpathUsageCode() /** { "tree" :"SearchParameter.xpathUsage", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setXpathUsage"} **/
						));
Searchparameterobj.addTarget(HapiFHIRHelpers.createcode(searchparameter.getSearchParameterTargetCode() /** { "tree" :"SearchParameter.target", "datatype" : "code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTarget"} **/
						));
Searchparameterobj.setMultipleOr(HapiFHIRHelpers.createboolean(searchparameter.getSearchParameterMultipleOrBoolean() /** { "tree" :"SearchParameter.multipleOr", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMultipleOr"} **/
						));
Searchparameterobj.setMultipleAnd(HapiFHIRHelpers.createboolean(searchparameter.getSrchPrmtrMltplndBln() /** { "tree" :"SearchParameter.multipleAnd", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMultipleAnd"} **/
						));
Searchparameterobj.addComparator(HapiFHIRHelpers.createcode(searchparameter.getSearchParameterComparatorCode() /** { "tree" :"SearchParameter.comparator", "datatype" : "code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComparator"} **/
						));
Searchparameterobj.addModifier(HapiFHIRHelpers.createcode(searchparameter.getSearchParameterModifierCode() /** { "tree" :"SearchParameter.modifier", "datatype" : "code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addModifier"} **/
						));
Searchparameterobj.addChain(HapiFHIRHelpers.createstring(searchparameter.getSearchParameterChainString() /** { "tree" :"SearchParameter.chain", "datatype" : "string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addChain"} **/
						));
Searchparameterobj.setDefinition(HapiFHIRHelpers.createcanonical(searchparameter.getSrchPrmtrCmpnntDfntnCnncl() /** { "tree" :"SearchParameter.component.definition", "datatype" : "canonical", "cardinality" : "Required", "elementtree" : ["addComponent"] , "methodName" : "setDefinition"} **/
						));
Searchparameterobj.setExpression(HapiFHIRHelpers.createstring(searchparameter.getSrchPrmtrCmpnntXprssnStrng() /** { "tree" :"SearchParameter.component.expression", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addComponent"] , "methodName" : "setExpression"} **/
		));
	}
}
