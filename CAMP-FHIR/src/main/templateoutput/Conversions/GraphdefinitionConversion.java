package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Graphdefinition.
 * @see .Graphdefinition
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class GraphdefinitionConversion 
{
	public Patient Graphdefinitions(main.templateoutput.Model.Graphdefinition graphdefinition) 
	{
			Patient  Graphdefinitionobj = new Patient(); 

						Graphdefinitionobj.setUrl(HapiFHIRHelpers.createuri(graphdefinition.getGraphDefinitionUrlUri() /** { "tree" :"GraphDefinition.url", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Graphdefinitionobj.setVersion(HapiFHIRHelpers.createstring(graphdefinition.getGraphDefinitionVersionString() /** { "tree" :"GraphDefinition.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Graphdefinitionobj.setName(HapiFHIRHelpers.createstring(graphdefinition.getGraphDefinitionNameString() /** { "tree" :"GraphDefinition.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setName"} **/
						));
Graphdefinitionobj.setStatus(HapiFHIRHelpers.createcode(graphdefinition.getGraphDefinitionStatusCode() /** { "tree" :"GraphDefinition.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Graphdefinitionobj.setExperimental(HapiFHIRHelpers.createboolean(graphdefinition.getGrphDfntnXprmntlBln() /** { "tree" :"GraphDefinition.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Graphdefinitionobj.setDate(HapiFHIRHelpers.createdateTime(graphdefinition.getGraphDefinitionDateDateTime() /** { "tree" :"GraphDefinition.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Graphdefinitionobj.setPublisher(HapiFHIRHelpers.createstring(graphdefinition.getGraphDefinitionPublisherString() /** { "tree" :"GraphDefinition.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Graphdefinitionobj.addContact(HapiFHIRHelpers.createContactDetail(graphdefinition.getGrphDfntnCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"GraphDefinition.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, graphdefinition.getGrphDfntnCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"GraphDefinition.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, graphdefinition.getGrphDfntnCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"GraphDefinition.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, graphdefinition.getGrphDfntnCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"GraphDefinition.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, graphdefinition.getGrphDfntnCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"GraphDefinition.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, graphdefinition.getGrphDfntnCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"GraphDefinition.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, graphdefinition.getGrphDfntnCntctCntctDtlNme() /** { "tree" :"GraphDefinition.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Graphdefinitionobj.setDescription(HapiFHIRHelpers.createmarkdown(graphdefinition.getGrphDfntnDscrptnMrkdwn() /** { "tree" :"GraphDefinition.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Graphdefinitionobj.addUseContext(HapiFHIRHelpers.createUsageContext(graphdefinition.getGrphDfntnSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"GraphDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, graphdefinition.getGrphDfntnSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"GraphDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, graphdefinition.getGrphDfntnSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"GraphDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, graphdefinition.getGrphDfntnSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"GraphDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, graphdefinition.getGrphDfntnSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"GraphDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, graphdefinition.getGrphDfntnSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"GraphDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, graphdefinition.getGrphDfntnSCntxtSgCntxtCdCSstm() /** { "tree" :"GraphDefinition.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, graphdefinition.getGrphDfntnSCntxtSgCntxtCdCVrsn() /** { "tree" :"GraphDefinition.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, graphdefinition.getGrphDfntnSCntxtSgCntxtCdCCde() /** { "tree" :"GraphDefinition.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, graphdefinition.getGrphDfntnSCntxtSgCntxtCdCDsplay() /** { "tree" :"GraphDefinition.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, graphdefinition.getGrphDfntnSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"GraphDefinition.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, graphdefinition.getGrphDfntnSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"GraphDefinition.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, graphdefinition.getGrphDfntnSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"GraphDefinition.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, graphdefinition.getGrphDfntnSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"GraphDefinition.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, graphdefinition.getGrphDfntnSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"GraphDefinition.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, graphdefinition.getGrphDfntnSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"GraphDefinition.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, graphdefinition.getGrphDfntnSCntxtSgCntxtVlRngRngLw() /** { "tree" :"GraphDefinition.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, graphdefinition.getGrphDfntnSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"GraphDefinition.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, graphdefinition.getGrphDfntnSCntxtSgCntxtVlRfrnce() /** { "tree" :"GraphDefinition.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Graphdefinitionobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(graphdefinition.getGrphDfntnJrsdctnCcCdngCSstm() /** { "tree" :"GraphDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, graphdefinition.getGrphDfntnJrsdctnCcCdngCVrsn() /** { "tree" :"GraphDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, graphdefinition.getGrphDfntnJrsdctnCcCdngCCde() /** { "tree" :"GraphDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, graphdefinition.getGrphDfntnJrsdctnCcCdngCDsplay() /** { "tree" :"GraphDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, graphdefinition.getGrphDfntnJrsdctnCcCdngCSrSlctd() /** { "tree" :"GraphDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, graphdefinition.getGrphDfntnJrsdctnCcTxt() /** { "tree" :"GraphDefinition.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Graphdefinitionobj.setPurpose(HapiFHIRHelpers.createmarkdown(graphdefinition.getGraphDefinitionPurposeMarkdown() /** { "tree" :"GraphDefinition.purpose", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPurpose"} **/
						));
Graphdefinitionobj.setStart(HapiFHIRHelpers.createcode(graphdefinition.getGraphDefinitionStartCode() /** { "tree" :"GraphDefinition.start", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStart"} **/
						));
Graphdefinitionobj.setProfile(HapiFHIRHelpers.createcanonical(graphdefinition.getGraphDefinitionProfileCanonical() /** { "tree" :"GraphDefinition.profile", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProfile"} **/
						));
Graphdefinitionobj.setPath(HapiFHIRHelpers.createstring(graphdefinition.getGraphDefinitionLinkPathString() /** { "tree" :"GraphDefinition.link.path", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addLink"] , "methodName" : "setPath"} **/
						));
Graphdefinitionobj.setSliceName(HapiFHIRHelpers.createstring(graphdefinition.getGrphDfntnLnkSlcNmStrng() /** { "tree" :"GraphDefinition.link.sliceName", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addLink"] , "methodName" : "setSliceName"} **/
						));
Graphdefinitionobj.setMin(HapiFHIRHelpers.createinteger(graphdefinition.getGraphDefinitionLinkMinInteger() /** { "tree" :"GraphDefinition.link.min", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["addLink"] , "methodName" : "setMin"} **/
						));
Graphdefinitionobj.setMax(HapiFHIRHelpers.createstring(graphdefinition.getGraphDefinitionLinkMaxString() /** { "tree" :"GraphDefinition.link.max", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addLink"] , "methodName" : "setMax"} **/
						));
Graphdefinitionobj.setDescription(HapiFHIRHelpers.createstring(graphdefinition.getGrphDfntnLnkDscrptnStrng() /** { "tree" :"GraphDefinition.link.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addLink"] , "methodName" : "setDescription"} **/
						));
Graphdefinitionobj.setType(HapiFHIRHelpers.createcode(graphdefinition.getGrphDfntnLnkTrgtTpCde() /** { "tree" :"GraphDefinition.link.target.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addLink", "addTarget"] , "methodName" : "setType"} **/
						));
Graphdefinitionobj.setParams(HapiFHIRHelpers.createstring(graphdefinition.getGrphDfntnLnkTrgtPrmsStrng() /** { "tree" :"GraphDefinition.link.target.params", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addLink", "addTarget"] , "methodName" : "setParams"} **/
						));
Graphdefinitionobj.setProfile(HapiFHIRHelpers.createcanonical(graphdefinition.getGrphDfntnLnkTrgtPrflCnncl() /** { "tree" :"GraphDefinition.link.target.profile", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : ["addLink", "addTarget"] , "methodName" : "setProfile"} **/
						));
Graphdefinitionobj.setUse(HapiFHIRHelpers.createcode(graphdefinition.getGrphDfntnLnkTrgtCmprtmntSCde() /** { "tree" :"GraphDefinition.link.target.compartment.use", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addLink", "addTarget", "addCompartment"] , "methodName" : "setUse"} **/
						));
Graphdefinitionobj.setCode(HapiFHIRHelpers.createcode(graphdefinition.getGrphDfntnLnkTrgtCmprtmntCdCde() /** { "tree" :"GraphDefinition.link.target.compartment.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addLink", "addTarget", "addCompartment"] , "methodName" : "setCode"} **/
						));
Graphdefinitionobj.setRule(HapiFHIRHelpers.createcode(graphdefinition.getGrphDfntnLnkTrgtCmprtmntRlCde() /** { "tree" :"GraphDefinition.link.target.compartment.rule", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addLink", "addTarget", "addCompartment"] , "methodName" : "setRule"} **/
						));
Graphdefinitionobj.setExpression(HapiFHIRHelpers.createstring(graphdefinition.getGrphDfntnLnkTrgtCmprtmntXprssnStrng() /** { "tree" :"GraphDefinition.link.target.compartment.expression", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addLink", "addTarget", "addCompartment"] , "methodName" : "setExpression"} **/
						));
Graphdefinitionobj.setDescription(HapiFHIRHelpers.createstring(graphdefinition.getGrphDfntnLnkTrgtCmprtmntDscrptnStrng() /** { "tree" :"GraphDefinition.link.target.compartment.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addLink", "addTarget", "addCompartment"] , "methodName" : "setDescription"} **/
						));
Graphdefinitionobj.addLink(HapiFHIRHelpers.createlink(graphdefinition.getGrphDfntnLnkTrgtLnkLnk() /** { "tree" :"GraphDefinition.link.target.link", "datatype" : "link", "cardinality" : "Many", "elementtree" : ["addLink", "addTarget", "addCompartment"] , "methodName" : "addLink"} **/
		));
	}
}
