package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Testreport.
 * @see .Testreport
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class TestreportConversion 
{
	public Patient Testreports(main.templateoutput.Model.Testreport testreport) 
	{
			Patient  Testreportobj = new Patient(); 

						Testreportobj.setIdentifier(HapiFHIRHelpers.createIdentifier(testreport.getTstRprtDntfrDntfrSe() /** { "tree" :"TestReport.identifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setUse"} **/
						, testreport.getTstRprtDntfrDntfrTpCcCSstm() /** { "tree" :"TestReport.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setSystem"} **/
						, testreport.getTstRprtDntfrDntfrTpCcCVrsn() /** { "tree" :"TestReport.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setVersion"} **/
						, testreport.getTstRprtDntfrDntfrTpCcCCde() /** { "tree" :"TestReport.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setCode"} **/
						, testreport.getTstRprtDntfrDntfrTpCcCDsplay() /** { "tree" :"TestReport.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setDisplay"} **/
						, testreport.getTstRprtDntfrDntfrTpCcCSrSlctd() /** { "tree" :"TestReport.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setUserSelected"} **/
						, testreport.getTstRprtDntfrDntfrTpCcTxt() /** { "tree" :"TestReport.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, setText"} **/
						, testreport.getTstRprtDntfrDntfrPrdPrdStrt() /** { "tree" :"TestReport.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setPeriod, setStart"} **/
						, testreport.getTstRprtDntfrDntfrPrdPrdNd() /** { "tree" :"TestReport.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setPeriod, setEnd"} **/
						, testreport.getTstRprtDntfrDntfrSsgnr() /** { "tree" :"TestReport.identifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setAssigner"} **/
						, testreport.getTstRprtDntfrDntfrVlue() /** { "tree" :"TestReport.identifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setValue"} **/
						, testreport.getTstRprtDntfrDntfrSstm() /** { "tree" :"TestReport.identifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setSystem"} **/
						));
Testreportobj.setName(HapiFHIRHelpers.createstring(testreport.getTestReportNameString() /** { "tree" :"TestReport.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Testreportobj.setStatus(HapiFHIRHelpers.createcode(testreport.getTestReportStatusCode() /** { "tree" :"TestReport.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Testreportobj.setTestScript(HapiFHIRHelpers.createReference(testreport.getTestReportTestScriptReference() /** { "tree" :"TestReport.testScript", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setTestScript"} **/
						));
Testreportobj.setResult(HapiFHIRHelpers.createcode(testreport.getTestReportResultCode() /** { "tree" :"TestReport.result", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setResult"} **/
						));
Testreportobj.setScore(HapiFHIRHelpers.createdecimal(testreport.getTestReportScoreDecimal() /** { "tree" :"TestReport.score", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setScore"} **/
						));
Testreportobj.setTester(HapiFHIRHelpers.createstring(testreport.getTestReportTesterString() /** { "tree" :"TestReport.tester", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTester"} **/
						));
Testreportobj.setIssued(HapiFHIRHelpers.createdateTime(testreport.getTestReportIssuedDateTime() /** { "tree" :"TestReport.issued", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIssued"} **/
						));
Testreportobj.setType(HapiFHIRHelpers.createcode(testreport.getTestReportParticipantTypeCode() /** { "tree" :"TestReport.participant.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addParticipant"] , "methodName" : "setType"} **/
						));
Testreportobj.setUri(HapiFHIRHelpers.createuri(testreport.getTestReportParticipantUriUri() /** { "tree" :"TestReport.participant.uri", "datatype" : "uri", "cardinality" : "Required", "elementtree" : ["addParticipant"] , "methodName" : "setUri"} **/
						));
Testreportobj.setDisplay(HapiFHIRHelpers.createstring(testreport.getTstRprtPrtcpntDsplStrng() /** { "tree" :"TestReport.participant.display", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addParticipant"] , "methodName" : "setDisplay"} **/
						));
Testreportobj.setResult(HapiFHIRHelpers.createcode(testreport.getTstRprtStpCtnPrtnRsltCde() /** { "tree" :"TestReport.setup.action.operation.result", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["setSetup", "setAction", "setOperation"] , "methodName" : "setResult"} **/
						));
Testreportobj.setMessage(HapiFHIRHelpers.createmarkdown(testreport.getTstRprtStpCtnPrtnMssgMrkdwn() /** { "tree" :"TestReport.setup.action.operation.message", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation"] , "methodName" : "setMessage"} **/
						));
Testreportobj.setDetail(HapiFHIRHelpers.createuri(testreport.getTstRprtStpCtnPrtnDtlRi() /** { "tree" :"TestReport.setup.action.operation.detail", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation"] , "methodName" : "setDetail"} **/
						));
Testreportobj.setResult(HapiFHIRHelpers.createcode(testreport.getTstRprtStpCtnSsrtRsltCde() /** { "tree" :"TestReport.setup.action.assert.result", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["setSetup", "setAction", "setOperation", "setAssert"] , "methodName" : "setResult"} **/
						));
Testreportobj.setMessage(HapiFHIRHelpers.createmarkdown(testreport.getTstRprtStpCtnSsrtMssgMrkdwn() /** { "tree" :"TestReport.setup.action.assert.message", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "setAssert"] , "methodName" : "setMessage"} **/
						));
Testreportobj.setDetail(HapiFHIRHelpers.createstring(testreport.getTstRprtStpCtnSsrtDtlStrng() /** { "tree" :"TestReport.setup.action.assert.detail", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSetup", "setAction", "setOperation", "setAssert"] , "methodName" : "setDetail"} **/
						));
Testreportobj.setName(HapiFHIRHelpers.createstring(testreport.getTestReportTestNameString() /** { "tree" :"TestReport.test.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addTest"] , "methodName" : "setName"} **/
						));
Testreportobj.setDescription(HapiFHIRHelpers.createstring(testreport.getTestReportTestDescriptionString() /** { "tree" :"TestReport.test.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addTest"] , "methodName" : "setDescription"} **/
						));
Testreportobj.setOperation(HapiFHIRHelpers.createoperation(testreport.getTstRprtTstCtnPrtnPrtn() /** { "tree" :"TestReport.test.action.operation", "datatype" : "operation", "cardinality" : "ZeroOne", "elementtree" : ["addTest", "setAction"] , "methodName" : "setOperation"} **/
						));
Testreportobj.setAssert(HapiFHIRHelpers.createassert(testreport.getTstRprtTstCtnSsrtSsrt() /** { "tree" :"TestReport.test.action.assert", "datatype" : "assert", "cardinality" : "ZeroOne", "elementtree" : ["addTest", "setAction"] , "methodName" : "setAssert"} **/
						));
Testreportobj.setOperation(HapiFHIRHelpers.createoperation(testreport.getTstRprtTrdwnCtnPrtnPrtn() /** { "tree" :"TestReport.teardown.action.operation", "datatype" : "operation", "cardinality" : "Required", "elementtree" : ["setTeardown", "setAction"] , "methodName" : "setOperation"} **/
		));
	}
}
