package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Compartmentdefinition.
 * @see .Compartmentdefinition
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class CompartmentdefinitionConversion 
{
	public Patient Compartmentdefinitions(main.templateoutput.Model.Compartmentdefinition compartmentdefinition) 
	{
			Patient  Compartmentdefinitionobj = new Patient(); 

						Compartmentdefinitionobj.setUrl(HapiFHIRHelpers.createuri(compartmentdefinition.getCompartmentDefinitionUrlUri() /** { "tree" :"CompartmentDefinition.url", "datatype" : "uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Compartmentdefinitionobj.setVersion(HapiFHIRHelpers.createstring(compartmentdefinition.getCmprtmntDfntnVrsnStrng() /** { "tree" :"CompartmentDefinition.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Compartmentdefinitionobj.setName(HapiFHIRHelpers.createstring(compartmentdefinition.getCompartmentDefinitionNameString() /** { "tree" :"CompartmentDefinition.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setName"} **/
						));
Compartmentdefinitionobj.setStatus(HapiFHIRHelpers.createcode(compartmentdefinition.getCompartmentDefinitionStatusCode() /** { "tree" :"CompartmentDefinition.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Compartmentdefinitionobj.setExperimental(HapiFHIRHelpers.createboolean(compartmentdefinition.getCmprtmntDfntnXprmntlBln() /** { "tree" :"CompartmentDefinition.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Compartmentdefinitionobj.setDate(HapiFHIRHelpers.createdateTime(compartmentdefinition.getCmprtmntDfntnDtDtTme() /** { "tree" :"CompartmentDefinition.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Compartmentdefinitionobj.setPublisher(HapiFHIRHelpers.createstring(compartmentdefinition.getCmprtmntDfntnPblshrStrng() /** { "tree" :"CompartmentDefinition.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Compartmentdefinitionobj.addContact(HapiFHIRHelpers.createContactDetail(compartmentdefinition.getCmprtmntDfntnCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"CompartmentDefinition.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, compartmentdefinition.getCmprtmntDfntnCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"CompartmentDefinition.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, compartmentdefinition.getCmprtmntDfntnCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"CompartmentDefinition.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, compartmentdefinition.getCmprtmntDfntnCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"CompartmentDefinition.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, compartmentdefinition.getCmprtmntDfntnCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"CompartmentDefinition.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, compartmentdefinition.getCmprtmntDfntnCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"CompartmentDefinition.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, compartmentdefinition.getCmprtmntDfntnCntctCntctDtlNme() /** { "tree" :"CompartmentDefinition.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Compartmentdefinitionobj.setDescription(HapiFHIRHelpers.createmarkdown(compartmentdefinition.getCmprtmntDfntnDscrptnMrkdwn() /** { "tree" :"CompartmentDefinition.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Compartmentdefinitionobj.addUseContext(HapiFHIRHelpers.createUsageContext(compartmentdefinition.getCmprtmntDfntnSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"CompartmentDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, compartmentdefinition.getCmprtmntDfntnSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"CompartmentDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, compartmentdefinition.getCmprtmntDfntnSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"CompartmentDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, compartmentdefinition.getCmprtmntDfntnSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"CompartmentDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, compartmentdefinition.getCmprtmntDfntnSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"CompartmentDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, compartmentdefinition.getCmprtmntDfntnSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"CompartmentDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, compartmentdefinition.getCmprtmntDfntnSCntxtSgCntxtCdCSstm() /** { "tree" :"CompartmentDefinition.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, compartmentdefinition.getCmprtmntDfntnSCntxtSgCntxtCdCVrsn() /** { "tree" :"CompartmentDefinition.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, compartmentdefinition.getCmprtmntDfntnSCntxtSgCntxtCdCCde() /** { "tree" :"CompartmentDefinition.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, compartmentdefinition.getCmprtmntDfntnSCntxtSgCntxtCdCDsplay() /** { "tree" :"CompartmentDefinition.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, compartmentdefinition.getCmprtmntDfntnSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"CompartmentDefinition.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, compartmentdefinition.getCmprtmntDfntnSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"CompartmentDefinition.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, compartmentdefinition.getCmprtmntDfntnSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"CompartmentDefinition.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, compartmentdefinition.getCmprtmntDfntnSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"CompartmentDefinition.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, compartmentdefinition.getCmprtmntDfntnSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"CompartmentDefinition.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, compartmentdefinition.getCmprtmntDfntnSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"CompartmentDefinition.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, compartmentdefinition.getCmprtmntDfntnSCntxtSgCntxtVlRngRngLw() /** { "tree" :"CompartmentDefinition.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, compartmentdefinition.getCmprtmntDfntnSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"CompartmentDefinition.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, compartmentdefinition.getCmprtmntDfntnSCntxtSgCntxtVlRfrnce() /** { "tree" :"CompartmentDefinition.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Compartmentdefinitionobj.setPurpose(HapiFHIRHelpers.createmarkdown(compartmentdefinition.getCmprtmntDfntnPrpsMrkdwn() /** { "tree" :"CompartmentDefinition.purpose", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPurpose"} **/
						));
Compartmentdefinitionobj.setCode(HapiFHIRHelpers.createcode(compartmentdefinition.getCompartmentDefinitionCodeCode() /** { "tree" :"CompartmentDefinition.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode"} **/
						));
Compartmentdefinitionobj.setSearch(HapiFHIRHelpers.createboolean(compartmentdefinition.getCmprtmntDfntnSrchBln() /** { "tree" :"CompartmentDefinition.search", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setSearch"} **/
						));
Compartmentdefinitionobj.setCode(HapiFHIRHelpers.createcode(compartmentdefinition.getCmprtmntDfntnRsrcCdCde() /** { "tree" :"CompartmentDefinition.resource.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addResource"] , "methodName" : "setCode"} **/
						));
Compartmentdefinitionobj.addParam(HapiFHIRHelpers.createstring(compartmentdefinition.getCmprtmntDfntnRsrcPrmStrng() /** { "tree" :"CompartmentDefinition.resource.param", "datatype" : "string", "cardinality" : "Many", "elementtree" : ["addResource"] , "methodName" : "addParam"} **/
						));
Compartmentdefinitionobj.setDocumentation(HapiFHIRHelpers.createstring(compartmentdefinition.getCmprtmntDfntnRsrcDcmnttnStrng() /** { "tree" :"CompartmentDefinition.resource.documentation", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addResource"] , "methodName" : "setDocumentation"} **/
		));
	}
}
