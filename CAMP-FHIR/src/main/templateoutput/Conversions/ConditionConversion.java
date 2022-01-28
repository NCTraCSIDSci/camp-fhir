package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Condition.
 * @see .Condition
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ConditionConversion 
{
	public Patient Conditions(main.templateoutput.Model.Condition condition) 
	{
			Patient  Conditionobj = new Patient(); 

						Conditionobj.addIdentifier(HapiFHIRHelpers.createIdentifier(condition.getCndtnDntfrDntfrSe() /** { "tree" :"Condition.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, condition.getCndtnDntfrDntfrTpCcCSstm() /** { "tree" :"Condition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, condition.getCndtnDntfrDntfrTpCcCVrsn() /** { "tree" :"Condition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, condition.getCndtnDntfrDntfrTpCcCCde() /** { "tree" :"Condition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, condition.getCndtnDntfrDntfrTpCcCDsplay() /** { "tree" :"Condition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, condition.getCndtnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Condition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, condition.getCndtnDntfrDntfrTpCcTxt() /** { "tree" :"Condition.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, condition.getCndtnDntfrDntfrPrdPrdStrt() /** { "tree" :"Condition.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, condition.getCndtnDntfrDntfrPrdPrdNd() /** { "tree" :"Condition.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, condition.getCndtnDntfrDntfrSsgnr() /** { "tree" :"Condition.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, condition.getCndtnDntfrDntfrVlue() /** { "tree" :"Condition.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, condition.getCndtnDntfrDntfrSstm() /** { "tree" :"Condition.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Conditionobj.setClinicalStatus(HapiFHIRHelpers.createCodeableConcept(condition.getCndtnClnclSttsCcCdngCSstm() /** { "tree" :"Condition.clinicalStatus", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setClinicalStatus, addCoding, setSystem"} **/
						, condition.getCndtnClnclSttsCcCdngCVrsn() /** { "tree" :"Condition.clinicalStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setClinicalStatus, addCoding, setVersion"} **/
						, condition.getCndtnClnclSttsCcCdngCCde() /** { "tree" :"Condition.clinicalStatus", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setClinicalStatus, addCoding, setCode"} **/
						, condition.getCndtnClnclSttsCcCdngCDsplay() /** { "tree" :"Condition.clinicalStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setClinicalStatus, addCoding, setDisplay"} **/
						, condition.getCndtnClnclSttsCcCdngCSrSlctd() /** { "tree" :"Condition.clinicalStatus", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setClinicalStatus, addCoding, setUserSelected"} **/
						, condition.getConditionClinicalStatusCcText() /** { "tree" :"Condition.clinicalStatus", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setClinicalStatus, setText"} **/
						));
Conditionobj.setVerificationStatus(HapiFHIRHelpers.createCodeableConcept(condition.getCndtnVrfctnSttsCcCdngCSstm() /** { "tree" :"Condition.verificationStatus", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVerificationStatus, addCoding, setSystem"} **/
						, condition.getCndtnVrfctnSttsCcCdngCVrsn() /** { "tree" :"Condition.verificationStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVerificationStatus, addCoding, setVersion"} **/
						, condition.getCndtnVrfctnSttsCcCdngCCde() /** { "tree" :"Condition.verificationStatus", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVerificationStatus, addCoding, setCode"} **/
						, condition.getCndtnVrfctnSttsCcCdngCDsplay() /** { "tree" :"Condition.verificationStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVerificationStatus, addCoding, setDisplay"} **/
						, condition.getCndtnVrfctnSttsCcCdngCSrSlctd() /** { "tree" :"Condition.verificationStatus", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVerificationStatus, addCoding, setUserSelected"} **/
						, condition.getCndtnVrfctnSttsCcTxt() /** { "tree" :"Condition.verificationStatus", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVerificationStatus, setText"} **/
						));
Conditionobj.addCategory(HapiFHIRHelpers.createCodeableConcept(condition.getCndtnCtgrCcCdngCSstm() /** { "tree" :"Condition.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setSystem"} **/
						, condition.getCndtnCtgrCcCdngCVrsn() /** { "tree" :"Condition.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setVersion"} **/
						, condition.getCndtnCtgrCcCdngCCde() /** { "tree" :"Condition.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setCode"} **/
						, condition.getCndtnCtgrCcCdngCDsplay() /** { "tree" :"Condition.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setDisplay"} **/
						, condition.getCndtnCtgrCcCdngCSrSlctd() /** { "tree" :"Condition.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setUserSelected"} **/
						, condition.getConditionCategoryCcText() /** { "tree" :"Condition.category", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, setText"} **/
						));
Conditionobj.setSeverity(HapiFHIRHelpers.createCodeableConcept(condition.getCndtnSvrtCcCdngCSstm() /** { "tree" :"Condition.severity", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeverity, addCoding, setSystem"} **/
						, condition.getCndtnSvrtCcCdngCVrsn() /** { "tree" :"Condition.severity", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeverity, addCoding, setVersion"} **/
						, condition.getCndtnSvrtCcCdngCCde() /** { "tree" :"Condition.severity", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeverity, addCoding, setCode"} **/
						, condition.getCndtnSvrtCcCdngCDsplay() /** { "tree" :"Condition.severity", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeverity, addCoding, setDisplay"} **/
						, condition.getCndtnSvrtCcCdngCSrSlctd() /** { "tree" :"Condition.severity", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeverity, addCoding, setUserSelected"} **/
						, condition.getConditionSeverityCcText() /** { "tree" :"Condition.severity", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeverity, setText"} **/
						));
Conditionobj.setCode(HapiFHIRHelpers.createCodeableConcept(condition.getConditionCodeCcCodingCSystem() /** { "tree" :"Condition.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, condition.getConditionCodeCcCodingCVersion() /** { "tree" :"Condition.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, condition.getConditionCodeCcCodingCCode() /** { "tree" :"Condition.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, condition.getConditionCodeCcCodingCDisplay() /** { "tree" :"Condition.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, condition.getCndtnCdCcCdngCSrSlctd() /** { "tree" :"Condition.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, condition.getConditionCodeCcText() /** { "tree" :"Condition.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Conditionobj.addBodySite(HapiFHIRHelpers.createCodeableConcept(condition.getCndtnBdStCcCdngCSstm() /** { "tree" :"Condition.bodySite", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodySite, addCoding, setSystem"} **/
						, condition.getCndtnBdStCcCdngCVrsn() /** { "tree" :"Condition.bodySite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodySite, addCoding, setVersion"} **/
						, condition.getCndtnBdStCcCdngCCde() /** { "tree" :"Condition.bodySite", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodySite, addCoding, setCode"} **/
						, condition.getCndtnBdStCcCdngCDsplay() /** { "tree" :"Condition.bodySite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodySite, addCoding, setDisplay"} **/
						, condition.getCndtnBdStCcCdngCSrSlctd() /** { "tree" :"Condition.bodySite", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodySite, addCoding, setUserSelected"} **/
						, condition.getConditionBodySiteCcText() /** { "tree" :"Condition.bodySite", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodySite, setText"} **/
						));
Conditionobj.setSubject(HapiFHIRHelpers.createReference(condition.getConditionSubjectReference() /** { "tree" :"Condition.subject", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Conditionobj.setEncounter(HapiFHIRHelpers.createReference(condition.getConditionEncounterReference() /** { "tree" :"Condition.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Conditionobj.setOnset(HapiFHIRHelpers.createdateTimetype(condition.getConditionOnsetDatetimeDateTime() /** { "tree" :"Condition.onsetDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOnsetDatetime"} **/
						));
Conditionobj.setOnsetAge(HapiFHIRHelpers.createAge(condition.getConditionOnsetAgeAge() /** { "tree" :"Condition.onsetAge", "datatype" : "Age", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOnsetAge"} **/
						));
Conditionobj.setOnsetPeriod(HapiFHIRHelpers.createPeriod(condition.getConditionOnsetPeriodPeriodStart() /** { "tree" :"Condition.onsetPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOnsetPeriod, setStart"} **/
						, condition.getConditionOnsetPeriodPeriodEnd() /** { "tree" :"Condition.onsetPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOnsetPeriod, setEnd"} **/
						));
Conditionobj.setOnsetRange(HapiFHIRHelpers.createRange(condition.getConditionOnsetRangeRangeLow() /** { "tree" :"Condition.onsetRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOnsetRange, setLow"} **/
						, condition.getConditionOnsetRangeRangeHigh() /** { "tree" :"Condition.onsetRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOnsetRange, setHigh"} **/
						));
Conditionobj.setOnsetString(HapiFHIRHelpers.createstring(condition.getConditionOnsetStringString() /** { "tree" :"Condition.onsetString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOnsetString"} **/
						));
Conditionobj.setAbatement(HapiFHIRHelpers.createdateTimetype(condition.getCndtnBtmntDttmDtTme() /** { "tree" :"Condition.abatementDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAbatementDatetime"} **/
						));
Conditionobj.setAbatementAge(HapiFHIRHelpers.createAge(condition.getConditionAbatementAgeAge() /** { "tree" :"Condition.abatementAge", "datatype" : "Age", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAbatementAge"} **/
						));
Conditionobj.setAbatementPeriod(HapiFHIRHelpers.createPeriod(condition.getCndtnBtmntPrdPrdStrt() /** { "tree" :"Condition.abatementPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAbatementPeriod, setStart"} **/
						, condition.getCndtnBtmntPrdPrdNd() /** { "tree" :"Condition.abatementPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAbatementPeriod, setEnd"} **/
						));
Conditionobj.setAbatementRange(HapiFHIRHelpers.createRange(condition.getConditionAbatementRangeRangeLow() /** { "tree" :"Condition.abatementRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAbatementRange, setLow"} **/
						, condition.getCndtnBtmntRngRngHgh() /** { "tree" :"Condition.abatementRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAbatementRange, setHigh"} **/
						));
Conditionobj.setAbatementString(HapiFHIRHelpers.createstring(condition.getConditionAbatementStringString() /** { "tree" :"Condition.abatementString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAbatementString"} **/
						));
Conditionobj.setRecordedDate(HapiFHIRHelpers.createdateTime(condition.getConditionRecordedDateDateTime() /** { "tree" :"Condition.recordedDate", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRecordedDate"} **/
						));
Conditionobj.setRecorder(HapiFHIRHelpers.createReference(condition.getConditionRecorderReference() /** { "tree" :"Condition.recorder", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRecorder"} **/
						));
Conditionobj.setAsserter(HapiFHIRHelpers.createReference(condition.getConditionAsserterReference() /** { "tree" :"Condition.asserter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAsserter"} **/
						));
Conditionobj.setSummary(HapiFHIRHelpers.createCodeableConcept(condition.getCndtnStgSmmrCcCdngCSstm() /** { "tree" :"Condition.stage.summary", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addStage"] , "methodName" : "setSummary, addCoding, setSystem"} **/
						, condition.getCndtnStgSmmrCcCdngCVrsn() /** { "tree" :"Condition.stage.summary", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addStage"] , "methodName" : "setSummary, addCoding, setVersion"} **/
						, condition.getCndtnStgSmmrCcCdngCCde() /** { "tree" :"Condition.stage.summary", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addStage"] , "methodName" : "setSummary, addCoding, setCode"} **/
						, condition.getCndtnStgSmmrCcCdngCDsplay() /** { "tree" :"Condition.stage.summary", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addStage"] , "methodName" : "setSummary, addCoding, setDisplay"} **/
						, condition.getCndtnStgSmmrCcCdngCSrSlctd() /** { "tree" :"Condition.stage.summary", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addStage"] , "methodName" : "setSummary, addCoding, setUserSelected"} **/
						, condition.getConditionStageSummaryCcText() /** { "tree" :"Condition.stage.summary", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addStage"] , "methodName" : "setSummary, setText"} **/
						));
Conditionobj.addAssessment(HapiFHIRHelpers.createReference(condition.getCndtnStgSsssmntRfrnce() /** { "tree" :"Condition.stage.assessment", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addStage"] , "methodName" : "addAssessment"} **/
						));
Conditionobj.setType(HapiFHIRHelpers.createCodeableConcept(condition.getCndtnStgTpCcCdngCSstm() /** { "tree" :"Condition.stage.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addStage"] , "methodName" : "setType, addCoding, setSystem"} **/
						, condition.getCndtnStgTpCcCdngCVrsn() /** { "tree" :"Condition.stage.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addStage"] , "methodName" : "setType, addCoding, setVersion"} **/
						, condition.getCndtnStgTpCcCdngCCde() /** { "tree" :"Condition.stage.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addStage"] , "methodName" : "setType, addCoding, setCode"} **/
						, condition.getCndtnStgTpCcCdngCDsplay() /** { "tree" :"Condition.stage.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addStage"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, condition.getCndtnStgTpCcCdngCSrSlctd() /** { "tree" :"Condition.stage.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addStage"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, condition.getConditionStageTypeCcText() /** { "tree" :"Condition.stage.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addStage"] , "methodName" : "setType, setText"} **/
						));
Conditionobj.addCode(HapiFHIRHelpers.createCodeableConcept(condition.getCndtnVdncCdCcCdngCSstm() /** { "tree" :"Condition.evidence.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addEvidence"] , "methodName" : "addCode, addCoding, setSystem"} **/
						, condition.getCndtnVdncCdCcCdngCVrsn() /** { "tree" :"Condition.evidence.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addEvidence"] , "methodName" : "addCode, addCoding, setVersion"} **/
						, condition.getCndtnVdncCdCcCdngCCde() /** { "tree" :"Condition.evidence.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addEvidence"] , "methodName" : "addCode, addCoding, setCode"} **/
						, condition.getCndtnVdncCdCcCdngCDsplay() /** { "tree" :"Condition.evidence.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addEvidence"] , "methodName" : "addCode, addCoding, setDisplay"} **/
						, condition.getCndtnVdncCdCcCdngCSrSlctd() /** { "tree" :"Condition.evidence.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addEvidence"] , "methodName" : "addCode, addCoding, setUserSelected"} **/
						, condition.getConditionEvidenceCodeCcText() /** { "tree" :"Condition.evidence.code", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addEvidence"] , "methodName" : "addCode, setText"} **/
						));
Conditionobj.addDetail(HapiFHIRHelpers.createReference(condition.getCndtnVdncDtlRfrnce() /** { "tree" :"Condition.evidence.detail", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addEvidence"] , "methodName" : "addDetail"} **/
						));
Conditionobj.addNote(HapiFHIRHelpers.createAnnotation(condition.getConditionNoteAnnotationTime() /** { "tree" :"Condition.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, condition.getConditionNoteAnnotationText() /** { "tree" :"Condition.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, condition.getCndtnNtNnttnThrRfrnce() /** { "tree" :"Condition.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, condition.getCndtnNtNnttnThrStrng() /** { "tree" :"Condition.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
		));
	}
}
