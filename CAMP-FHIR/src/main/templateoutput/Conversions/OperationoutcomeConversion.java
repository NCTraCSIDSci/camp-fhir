package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Operationoutcome.
 * @see .Operationoutcome
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class OperationoutcomeConversion 
{
	public Patient Operationoutcomes(main.templateoutput.Model.Operationoutcome operationoutcome) 
	{
			Patient  Operationoutcomeobj = new Patient(); 

						Operationoutcomeobj.setSeverity(HapiFHIRHelpers.createcode(operationoutcome.getOprtntcmSsSvrtCde() /** { "tree" :"OperationOutcome.issue.severity", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["Issue"] , "methodName" : "setSeverity"} **/
						));
Operationoutcomeobj.setCode(HapiFHIRHelpers.createcode(operationoutcome.getOperationOutcomeIssueCodeCode() /** { "tree" :"OperationOutcome.issue.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["Issue"] , "methodName" : "setCode"} **/
						));
Operationoutcomeobj.setDetails(HapiFHIRHelpers.createCodeableConcept(operationoutcome.getOprtntcmSsDtlsCcCdngCSstm() /** { "tree" :"OperationOutcome.issue.details", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["Issue"] , "methodName" : "setDetails, addCoding, setSystem"} **/
						, operationoutcome.getOprtntcmSsDtlsCcCdngCVrsn() /** { "tree" :"OperationOutcome.issue.details", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["Issue"] , "methodName" : "setDetails, addCoding, setVersion"} **/
						, operationoutcome.getOprtntcmSsDtlsCcCdngCCde() /** { "tree" :"OperationOutcome.issue.details", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["Issue"] , "methodName" : "setDetails, addCoding, setCode"} **/
						, operationoutcome.getOprtntcmSsDtlsCcCdngCDsplay() /** { "tree" :"OperationOutcome.issue.details", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["Issue"] , "methodName" : "setDetails, addCoding, setDisplay"} **/
						, operationoutcome.getOprtntcmSsDtlsCcCdngCSrSlctd() /** { "tree" :"OperationOutcome.issue.details", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["Issue"] , "methodName" : "setDetails, addCoding, setUserSelected"} **/
						, operationoutcome.getOprtntcmSsDtlsCcTxt() /** { "tree" :"OperationOutcome.issue.details", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["Issue"] , "methodName" : "setDetails, setText"} **/
						));
Operationoutcomeobj.setDiagnostics(HapiFHIRHelpers.createstring(operationoutcome.getOprtntcmSsDgnstcsStrng() /** { "tree" :"OperationOutcome.issue.diagnostics", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["Issue"] , "methodName" : "setDiagnostics"} **/
						));
Operationoutcomeobj.addLocation(HapiFHIRHelpers.createstring(operationoutcome.getOprtntcmSsLctnStrng() /** { "tree" :"OperationOutcome.issue.location", "datatype" : "string", "cardinality" : "Many", "elementtree" : ["Issue"] , "methodName" : "addLocation"} **/
						));
Operationoutcomeobj.addExpression(HapiFHIRHelpers.createstring(operationoutcome.getOprtntcmSsXprssnStrng() /** { "tree" :"OperationOutcome.issue.expression", "datatype" : "string", "cardinality" : "Many", "elementtree" : ["Issue"] , "methodName" : "addExpression"} **/
		));
	}
}
