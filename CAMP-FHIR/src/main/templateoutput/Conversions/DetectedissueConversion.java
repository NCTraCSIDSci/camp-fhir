package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Detectedissue.
 * @see .Detectedissue
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class DetectedissueConversion 
{
	public Patient Detectedissues(main.templateoutput.Model.Detectedissue detectedissue) 
	{
			Patient  Detectedissueobj = new Patient(); 

						Detectedissueobj.addIdentifier(HapiFHIRHelpers.createIdentifier(detectedissue.getDtctdssDntfrDntfrSe() /** { "tree" :"DetectedIssue.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, detectedissue.getDtctdssDntfrDntfrTpCcCSstm() /** { "tree" :"DetectedIssue.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, detectedissue.getDtctdssDntfrDntfrTpCcCVrsn() /** { "tree" :"DetectedIssue.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, detectedissue.getDtctdssDntfrDntfrTpCcCCde() /** { "tree" :"DetectedIssue.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, detectedissue.getDtctdssDntfrDntfrTpCcCDsplay() /** { "tree" :"DetectedIssue.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, detectedissue.getDtctdssDntfrDntfrTpCcCSrSlctd() /** { "tree" :"DetectedIssue.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, detectedissue.getDtctdssDntfrDntfrTpCcTxt() /** { "tree" :"DetectedIssue.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, detectedissue.getDtctdssDntfrDntfrPrdPrdStrt() /** { "tree" :"DetectedIssue.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, detectedissue.getDtctdssDntfrDntfrPrdPrdNd() /** { "tree" :"DetectedIssue.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, detectedissue.getDtctdssDntfrDntfrSsgnr() /** { "tree" :"DetectedIssue.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, detectedissue.getDtctdssDntfrDntfrVlue() /** { "tree" :"DetectedIssue.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, detectedissue.getDtctdssDntfrDntfrSstm() /** { "tree" :"DetectedIssue.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Detectedissueobj.setStatus(HapiFHIRHelpers.createcode(detectedissue.getDetectedIssueStatusCode() /** { "tree" :"DetectedIssue.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Detectedissueobj.setCode(HapiFHIRHelpers.createCodeableConcept(detectedissue.getDtctdssCdCcCdngCSstm() /** { "tree" :"DetectedIssue.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, detectedissue.getDtctdssCdCcCdngCVrsn() /** { "tree" :"DetectedIssue.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, detectedissue.getDtctdssCdCcCdngCCde() /** { "tree" :"DetectedIssue.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, detectedissue.getDtctdssCdCcCdngCDsplay() /** { "tree" :"DetectedIssue.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, detectedissue.getDtctdssCdCcCdngCSrSlctd() /** { "tree" :"DetectedIssue.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, detectedissue.getDetectedIssueCodeCcText() /** { "tree" :"DetectedIssue.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Detectedissueobj.setSeverity(HapiFHIRHelpers.createcode(detectedissue.getDetectedIssueSeverityCode() /** { "tree" :"DetectedIssue.severity", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeverity"} **/
						));
Detectedissueobj.setPatient(HapiFHIRHelpers.createReference(detectedissue.getDetectedIssuePntReference() /** { "tree" :"DetectedIssue.patient", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPatient"} **/
						));
Detectedissueobj.setIdentified(HapiFHIRHelpers.createdateTimetype(detectedissue.getDtctdssDntfdDttmDtTme() /** { "tree" :"DetectedIssue.identifiedDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifiedDatetime"} **/
						));
Detectedissueobj.setIdentifiedPeriod(HapiFHIRHelpers.createPeriod(detectedissue.getDtctdssDntfdPrdPrdStrt() /** { "tree" :"DetectedIssue.identifiedPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifiedPeriod, setStart"} **/
						, detectedissue.getDtctdssDntfdPrdPrdNd() /** { "tree" :"DetectedIssue.identifiedPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifiedPeriod, setEnd"} **/
						));
Detectedissueobj.setAuthor(HapiFHIRHelpers.createReference(detectedissue.getDetectedIssueAuthorReference() /** { "tree" :"DetectedIssue.author", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAuthor"} **/
						));
Detectedissueobj.addImplicated(HapiFHIRHelpers.createReference(detectedissue.getDetectedIssueImplicatedReference() /** { "tree" :"DetectedIssue.implicated", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addImplicated"} **/
						));
Detectedissueobj.addCode(HapiFHIRHelpers.createCodeableConcept(detectedissue.getDtctdssVdncCdCcCdngCSstm() /** { "tree" :"DetectedIssue.evidence.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addEvidence"] , "methodName" : "addCode, addCoding, setSystem"} **/
						, detectedissue.getDtctdssVdncCdCcCdngCVrsn() /** { "tree" :"DetectedIssue.evidence.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addEvidence"] , "methodName" : "addCode, addCoding, setVersion"} **/
						, detectedissue.getDtctdssVdncCdCcCdngCCde() /** { "tree" :"DetectedIssue.evidence.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addEvidence"] , "methodName" : "addCode, addCoding, setCode"} **/
						, detectedissue.getDtctdssVdncCdCcCdngCDsplay() /** { "tree" :"DetectedIssue.evidence.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addEvidence"] , "methodName" : "addCode, addCoding, setDisplay"} **/
						, detectedissue.getDtctdssVdncCdCcCdngCSrSlctd() /** { "tree" :"DetectedIssue.evidence.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addEvidence"] , "methodName" : "addCode, addCoding, setUserSelected"} **/
						, detectedissue.getDtctdssVdncCdCcTxt() /** { "tree" :"DetectedIssue.evidence.code", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addEvidence"] , "methodName" : "addCode, setText"} **/
						));
Detectedissueobj.addDetail(HapiFHIRHelpers.createReference(detectedissue.getDtctdssVdncDtlRfrnce() /** { "tree" :"DetectedIssue.evidence.detail", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addEvidence"] , "methodName" : "addDetail"} **/
						));
Detectedissueobj.setDetail(HapiFHIRHelpers.createstring(detectedissue.getDetectedIssueDetailString() /** { "tree" :"DetectedIssue.detail", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDetail"} **/
						));
Detectedissueobj.setReference(HapiFHIRHelpers.createuri(detectedissue.getDetectedIssueReferenceUri() /** { "tree" :"DetectedIssue.reference", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReference"} **/
						));
Detectedissueobj.setAction(HapiFHIRHelpers.createCodeableConcept(detectedissue.getDtctdssMtgtnCtnCcCdngCSstm() /** { "tree" :"DetectedIssue.mitigation.action", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addMitigation"] , "methodName" : "setAction, addCoding, setSystem"} **/
						, detectedissue.getDtctdssMtgtnCtnCcCdngCVrsn() /** { "tree" :"DetectedIssue.mitigation.action", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addMitigation"] , "methodName" : "setAction, addCoding, setVersion"} **/
						, detectedissue.getDtctdssMtgtnCtnCcCdngCCde() /** { "tree" :"DetectedIssue.mitigation.action", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addMitigation"] , "methodName" : "setAction, addCoding, setCode"} **/
						, detectedissue.getDtctdssMtgtnCtnCcCdngCDsplay() /** { "tree" :"DetectedIssue.mitigation.action", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addMitigation"] , "methodName" : "setAction, addCoding, setDisplay"} **/
						, detectedissue.getDtctdssMtgtnCtnCcCdngCSrSlctd() /** { "tree" :"DetectedIssue.mitigation.action", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addMitigation"] , "methodName" : "setAction, addCoding, setUserSelected"} **/
						, detectedissue.getDtctdssMtgtnCtnCcTxt() /** { "tree" :"DetectedIssue.mitigation.action", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addMitigation"] , "methodName" : "setAction, setText"} **/
						));
Detectedissueobj.setDate(HapiFHIRHelpers.createdateTime(detectedissue.getDtctdssMtgtnDtDtTme() /** { "tree" :"DetectedIssue.mitigation.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addMitigation"] , "methodName" : "setDate"} **/
						));
Detectedissueobj.setAuthor(HapiFHIRHelpers.createReference(detectedissue.getDtctdssMtgtnThrRfrnce() /** { "tree" :"DetectedIssue.mitigation.author", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addMitigation"] , "methodName" : "setAuthor"} **/
		));
	}
}
