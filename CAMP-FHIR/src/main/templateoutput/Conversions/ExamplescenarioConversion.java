package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Examplescenario.
 * @see .Examplescenario
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ExamplescenarioConversion 
{
	public Patient Examplescenarios(main.templateoutput.Model.Examplescenario examplescenario) 
	{
			Patient  Examplescenarioobj = new Patient(); 

						Examplescenarioobj.setUrl(HapiFHIRHelpers.createuri(examplescenario.getExampleScenarioUrlUri() /** { "tree" :"ExampleScenario.url", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Examplescenarioobj.addIdentifier(HapiFHIRHelpers.createIdentifier(examplescenario.getExmplScnrDntfrDntfrSe() /** { "tree" :"ExampleScenario.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, examplescenario.getExmplScnrDntfrDntfrTpCcCSstm() /** { "tree" :"ExampleScenario.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, examplescenario.getExmplScnrDntfrDntfrTpCcCVrsn() /** { "tree" :"ExampleScenario.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, examplescenario.getExmplScnrDntfrDntfrTpCcCCde() /** { "tree" :"ExampleScenario.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, examplescenario.getExmplScnrDntfrDntfrTpCcCDsplay() /** { "tree" :"ExampleScenario.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, examplescenario.getExmplScnrDntfrDntfrTpCcCSrSlctd() /** { "tree" :"ExampleScenario.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, examplescenario.getExmplScnrDntfrDntfrTpCcTxt() /** { "tree" :"ExampleScenario.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, examplescenario.getExmplScnrDntfrDntfrPrdPrdStrt() /** { "tree" :"ExampleScenario.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, examplescenario.getExmplScnrDntfrDntfrPrdPrdNd() /** { "tree" :"ExampleScenario.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, examplescenario.getExmplScnrDntfrDntfrSsgnr() /** { "tree" :"ExampleScenario.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, examplescenario.getExmplScnrDntfrDntfrVlue() /** { "tree" :"ExampleScenario.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, examplescenario.getExmplScnrDntfrDntfrSstm() /** { "tree" :"ExampleScenario.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Examplescenarioobj.setVersion(HapiFHIRHelpers.createstring(examplescenario.getExampleScenarioVersionString() /** { "tree" :"ExampleScenario.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Examplescenarioobj.setName(HapiFHIRHelpers.createstring(examplescenario.getExampleScenarioNameString() /** { "tree" :"ExampleScenario.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Examplescenarioobj.setStatus(HapiFHIRHelpers.createcode(examplescenario.getExampleScenarioStatusCode() /** { "tree" :"ExampleScenario.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Examplescenarioobj.setExperimental(HapiFHIRHelpers.createboolean(examplescenario.getExmplScnrXprmntlBln() /** { "tree" :"ExampleScenario.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Examplescenarioobj.setDate(HapiFHIRHelpers.createdateTime(examplescenario.getExampleScenarioDateDateTime() /** { "tree" :"ExampleScenario.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Examplescenarioobj.setPublisher(HapiFHIRHelpers.createstring(examplescenario.getExampleScenarioPublisherString() /** { "tree" :"ExampleScenario.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Examplescenarioobj.addContact(HapiFHIRHelpers.createContactDetail(examplescenario.getExmplScnrCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"ExampleScenario.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, examplescenario.getExmplScnrCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"ExampleScenario.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, examplescenario.getExmplScnrCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"ExampleScenario.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, examplescenario.getExmplScnrCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"ExampleScenario.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, examplescenario.getExmplScnrCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"ExampleScenario.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, examplescenario.getExmplScnrCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"ExampleScenario.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, examplescenario.getExmplScnrCntctCntctDtlNme() /** { "tree" :"ExampleScenario.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Examplescenarioobj.addUseContext(HapiFHIRHelpers.createUsageContext(examplescenario.getExmplScnrSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"ExampleScenario.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, examplescenario.getExmplScnrSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"ExampleScenario.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, examplescenario.getExmplScnrSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"ExampleScenario.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, examplescenario.getExmplScnrSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"ExampleScenario.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, examplescenario.getExmplScnrSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"ExampleScenario.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, examplescenario.getExmplScnrSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"ExampleScenario.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, examplescenario.getExmplScnrSCntxtSgCntxtCdCSstm() /** { "tree" :"ExampleScenario.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, examplescenario.getExmplScnrSCntxtSgCntxtCdCVrsn() /** { "tree" :"ExampleScenario.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, examplescenario.getExmplScnrSCntxtSgCntxtCdCCde() /** { "tree" :"ExampleScenario.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, examplescenario.getExmplScnrSCntxtSgCntxtCdCDsplay() /** { "tree" :"ExampleScenario.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, examplescenario.getExmplScnrSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"ExampleScenario.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, examplescenario.getExmplScnrSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"ExampleScenario.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, examplescenario.getExmplScnrSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"ExampleScenario.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, examplescenario.getExmplScnrSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"ExampleScenario.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, examplescenario.getExmplScnrSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"ExampleScenario.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, examplescenario.getExmplScnrSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"ExampleScenario.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, examplescenario.getExmplScnrSCntxtSgCntxtVlRngRngLw() /** { "tree" :"ExampleScenario.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, examplescenario.getExmplScnrSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"ExampleScenario.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, examplescenario.getExmplScnrSCntxtSgCntxtVlRfrnce() /** { "tree" :"ExampleScenario.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Examplescenarioobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(examplescenario.getExmplScnrJrsdctnCcCdngCSstm() /** { "tree" :"ExampleScenario.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, examplescenario.getExmplScnrJrsdctnCcCdngCVrsn() /** { "tree" :"ExampleScenario.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, examplescenario.getExmplScnrJrsdctnCcCdngCCde() /** { "tree" :"ExampleScenario.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, examplescenario.getExmplScnrJrsdctnCcCdngCDsplay() /** { "tree" :"ExampleScenario.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, examplescenario.getExmplScnrJrsdctnCcCdngCSrSlctd() /** { "tree" :"ExampleScenario.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, examplescenario.getExmplScnrJrsdctnCcTxt() /** { "tree" :"ExampleScenario.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Examplescenarioobj.setCopyright(HapiFHIRHelpers.createmarkdown(examplescenario.getExampleScenarioCopyrightMarkdown() /** { "tree" :"ExampleScenario.copyright", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCopyright"} **/
						));
Examplescenarioobj.setPurpose(HapiFHIRHelpers.createmarkdown(examplescenario.getExampleScenarioPurposeMarkdown() /** { "tree" :"ExampleScenario.purpose", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPurpose"} **/
						));
Examplescenarioobj.setActorId(HapiFHIRHelpers.createstring(examplescenario.getExmplScnrCtrCtrdStrng() /** { "tree" :"ExampleScenario.actor.actorId", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addActor"] , "methodName" : "setActorId"} **/
						));
Examplescenarioobj.setType(HapiFHIRHelpers.createcode(examplescenario.getExampleScenarioActorTypeCode() /** { "tree" :"ExampleScenario.actor.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addActor"] , "methodName" : "setType"} **/
						));
Examplescenarioobj.setName(HapiFHIRHelpers.createstring(examplescenario.getExampleScenarioActorNameString() /** { "tree" :"ExampleScenario.actor.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addActor"] , "methodName" : "setName"} **/
						));
Examplescenarioobj.setDescription(HapiFHIRHelpers.createmarkdown(examplescenario.getExmplScnrCtrDscrptnMrkdwn() /** { "tree" :"ExampleScenario.actor.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["addActor"] , "methodName" : "setDescription"} **/
						));
Examplescenarioobj.setResourceId(HapiFHIRHelpers.createstring(examplescenario.getExmplScnrNstncRsrcdStrng() /** { "tree" :"ExampleScenario.instance.resourceId", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addInstance"] , "methodName" : "setResourceId"} **/
						));
Examplescenarioobj.setResourceType(HapiFHIRHelpers.createcode(examplescenario.getExmplScnrNstncRsrcTpCde() /** { "tree" :"ExampleScenario.instance.resourceType", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addInstance"] , "methodName" : "setResourceType"} **/
						));
Examplescenarioobj.setName(HapiFHIRHelpers.createstring(examplescenario.getExmplScnrNstncNmStrng() /** { "tree" :"ExampleScenario.instance.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addInstance"] , "methodName" : "setName"} **/
						));
Examplescenarioobj.setDescription(HapiFHIRHelpers.createmarkdown(examplescenario.getExmplScnrNstncDscrptnMrkdwn() /** { "tree" :"ExampleScenario.instance.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["addInstance"] , "methodName" : "setDescription"} **/
						));
Examplescenarioobj.setVersionId(HapiFHIRHelpers.createstring(examplescenario.getExmplScnrNstncVrsnVrsndStrng() /** { "tree" :"ExampleScenario.instance.version.versionId", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addInstance", "addVersion"] , "methodName" : "setVersionId"} **/
						));
Examplescenarioobj.setDescription(HapiFHIRHelpers.createmarkdown(examplescenario.getExmplScnrNstncVrsnDscrptnMrkdwn() /** { "tree" :"ExampleScenario.instance.version.description", "datatype" : "markdown", "cardinality" : "Required", "elementtree" : ["addInstance", "addVersion"] , "methodName" : "setDescription"} **/
						));
Examplescenarioobj.setResourceId(HapiFHIRHelpers.createstring(examplescenario.getExmplScnrNstncCntndnstncRsrcdStrng() /** { "tree" :"ExampleScenario.instance.containedInstance.resourceId", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addInstance", "addVersion", "addContainedInstance"] , "methodName" : "setResourceId"} **/
						));
Examplescenarioobj.setVersionId(HapiFHIRHelpers.createstring(examplescenario.getExmplScnrNstncCntndnstncVrsndStrng() /** { "tree" :"ExampleScenario.instance.containedInstance.versionId", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addInstance", "addVersion", "addContainedInstance"] , "methodName" : "setVersionId"} **/
						));
Examplescenarioobj.setTitle(HapiFHIRHelpers.createstring(examplescenario.getExmplScnrPrcssTtlStrng() /** { "tree" :"ExampleScenario.process.title", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addProcess"] , "methodName" : "setTitle"} **/
						));
Examplescenarioobj.setDescription(HapiFHIRHelpers.createmarkdown(examplescenario.getExmplScnrPrcssDscrptnMrkdwn() /** { "tree" :"ExampleScenario.process.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["addProcess"] , "methodName" : "setDescription"} **/
						));
Examplescenarioobj.setPreConditions(HapiFHIRHelpers.createmarkdown(examplescenario.getExmplScnrPrcssPrCndtnsMrkdwn() /** { "tree" :"ExampleScenario.process.preConditions", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["addProcess"] , "methodName" : "setPreConditions"} **/
						));
Examplescenarioobj.setPostConditions(HapiFHIRHelpers.createmarkdown(examplescenario.getExmplScnrPrcssPstCndtnsMrkdwn() /** { "tree" :"ExampleScenario.process.postConditions", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["addProcess"] , "methodName" : "setPostConditions"} **/
						));
Examplescenarioobj.addProcess(HapiFHIRHelpers.createprocess(examplescenario.getExmplScnrPrcssStpPrcssPrcss() /** { "tree" :"ExampleScenario.process.step.process", "datatype" : "process", "cardinality" : "Many", "elementtree" : ["addProcess", "addStep"] , "methodName" : "addProcess"} **/
						));
Examplescenarioobj.setPause(HapiFHIRHelpers.createboolean(examplescenario.getExmplScnrPrcssStpPsBln() /** { "tree" :"ExampleScenario.process.step.pause", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addProcess", "addStep"] , "methodName" : "setPause"} **/
						));
Examplescenarioobj.setNumber(HapiFHIRHelpers.createstring(examplescenario.getExmplScnrPrcssStpPrtnNmbrStrng() /** { "tree" :"ExampleScenario.process.step.operation.number", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addProcess", "addStep", "setOperation"] , "methodName" : "setNumber"} **/
						));
Examplescenarioobj.setType(HapiFHIRHelpers.createstring(examplescenario.getExmplScnrPrcssStpPrtnTpStrng() /** { "tree" :"ExampleScenario.process.step.operation.type", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addProcess", "addStep", "setOperation"] , "methodName" : "setType"} **/
						));
Examplescenarioobj.setName(HapiFHIRHelpers.createstring(examplescenario.getExmplScnrPrcssStpPrtnNmStrng() /** { "tree" :"ExampleScenario.process.step.operation.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addProcess", "addStep", "setOperation"] , "methodName" : "setName"} **/
						));
Examplescenarioobj.setInitiator(HapiFHIRHelpers.createstring(examplescenario.getExmplScnrPrcssStpPrtnNttrStrng() /** { "tree" :"ExampleScenario.process.step.operation.initiator", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addProcess", "addStep", "setOperation"] , "methodName" : "setInitiator"} **/
						));
Examplescenarioobj.setReceiver(HapiFHIRHelpers.createstring(examplescenario.getExmplScnrPrcssStpPrtnRcvrStrng() /** { "tree" :"ExampleScenario.process.step.operation.receiver", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addProcess", "addStep", "setOperation"] , "methodName" : "setReceiver"} **/
						));
Examplescenarioobj.setDescription(HapiFHIRHelpers.createmarkdown(examplescenario.getExmplScnrPrcssStpPrtnDscrptnMrkdwn() /** { "tree" :"ExampleScenario.process.step.operation.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["addProcess", "addStep", "setOperation"] , "methodName" : "setDescription"} **/
						));
Examplescenarioobj.setInitiatorActive(HapiFHIRHelpers.createboolean(examplescenario.getExmplScnrPrcssStpPrtnNttrctvBln() /** { "tree" :"ExampleScenario.process.step.operation.initiatorActive", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addProcess", "addStep", "setOperation"] , "methodName" : "setInitiatorActive"} **/
						));
Examplescenarioobj.setReceiverActive(HapiFHIRHelpers.createboolean(examplescenario.getExmplScnrPrcssStpPrtnRcvrctvBln() /** { "tree" :"ExampleScenario.process.step.operation.receiverActive", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addProcess", "addStep", "setOperation"] , "methodName" : "setReceiverActive"} **/
						));
Examplescenarioobj.setRequest(HapiFHIRHelpers.createcontainedInstance(examplescenario.getExmplScnrPrcssStpPrtnRqstCntndnstnce() /** { "tree" :"ExampleScenario.process.step.operation.request", "datatype" : "containedInstance", "cardinality" : "ZeroOne", "elementtree" : ["addProcess", "addStep", "setOperation"] , "methodName" : "setRequest"} **/
						));
Examplescenarioobj.setResponse(HapiFHIRHelpers.createcontainedInstance(examplescenario.getExmplScnrPrcssStpPrtnRspnsCntndnstnce() /** { "tree" :"ExampleScenario.process.step.operation.response", "datatype" : "containedInstance", "cardinality" : "ZeroOne", "elementtree" : ["addProcess", "addStep", "setOperation"] , "methodName" : "setResponse"} **/
						));
Examplescenarioobj.setTitle(HapiFHIRHelpers.createstring(examplescenario.getExmplScnrPrcssStpLtrntvTtlStrng() /** { "tree" :"ExampleScenario.process.step.alternative.title", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addProcess", "addStep", "setOperation", "addAlternative"] , "methodName" : "setTitle"} **/
						));
Examplescenarioobj.setDescription(HapiFHIRHelpers.createmarkdown(examplescenario.getExmplScnrPrcssStpLtrntvDscrptnMrkdwn() /** { "tree" :"ExampleScenario.process.step.alternative.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["addProcess", "addStep", "setOperation", "addAlternative"] , "methodName" : "setDescription"} **/
						));
Examplescenarioobj.addStep(HapiFHIRHelpers.createstep(examplescenario.getExmplScnrPrcssStpLtrntvStpStp() /** { "tree" :"ExampleScenario.process.step.alternative.step", "datatype" : "step", "cardinality" : "Many", "elementtree" : ["addProcess", "addStep", "setOperation", "addAlternative"] , "methodName" : "addStep"} **/
						));
Examplescenarioobj.addWorkflow(HapiFHIRHelpers.createcanonical(examplescenario.getExampleScenarioWorkflowCanonical() /** { "tree" :"ExampleScenario.workflow", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addWorkflow"} **/
		));
	}
}
