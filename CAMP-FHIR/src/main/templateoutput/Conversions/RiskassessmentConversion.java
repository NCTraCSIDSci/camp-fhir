package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Riskassessment.
 * @see .Riskassessment
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class RiskassessmentConversion 
{
	public Patient Riskassessments(main.templateoutput.Model.Riskassessment riskassessment) 
	{
			Patient  Riskassessmentobj = new Patient(); 

						Riskassessmentobj.addIdentifier(HapiFHIRHelpers.createIdentifier(riskassessment.getRskssssmntDntfrDntfrSe() /** { "tree" :"RiskAssessment.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, riskassessment.getRskssssmntDntfrDntfrTpCcCSstm() /** { "tree" :"RiskAssessment.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, riskassessment.getRskssssmntDntfrDntfrTpCcCVrsn() /** { "tree" :"RiskAssessment.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, riskassessment.getRskssssmntDntfrDntfrTpCcCCde() /** { "tree" :"RiskAssessment.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, riskassessment.getRskssssmntDntfrDntfrTpCcCDsplay() /** { "tree" :"RiskAssessment.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, riskassessment.getRskssssmntDntfrDntfrTpCcCSrSlctd() /** { "tree" :"RiskAssessment.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, riskassessment.getRskssssmntDntfrDntfrTpCcTxt() /** { "tree" :"RiskAssessment.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, riskassessment.getRskssssmntDntfrDntfrPrdPrdStrt() /** { "tree" :"RiskAssessment.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, riskassessment.getRskssssmntDntfrDntfrPrdPrdNd() /** { "tree" :"RiskAssessment.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, riskassessment.getRskssssmntDntfrDntfrSsgnr() /** { "tree" :"RiskAssessment.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, riskassessment.getRskssssmntDntfrDntfrVlue() /** { "tree" :"RiskAssessment.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, riskassessment.getRskssssmntDntfrDntfrSstm() /** { "tree" :"RiskAssessment.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Riskassessmentobj.setBasedOn(HapiFHIRHelpers.createReference(riskassessment.getRiskAssessmentBasedOnReference() /** { "tree" :"RiskAssessment.basedOn", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBasedOn"} **/
						));
Riskassessmentobj.setParent(HapiFHIRHelpers.createReference(riskassessment.getRiskAssessmentParentReference() /** { "tree" :"RiskAssessment.parent", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setParent"} **/
						));
Riskassessmentobj.setStatus(HapiFHIRHelpers.createcode(riskassessment.getRiskAssessmentStatusCode() /** { "tree" :"RiskAssessment.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Riskassessmentobj.setMethod(HapiFHIRHelpers.createCodeableConcept(riskassessment.getRskssssmntMthdCcCdngCSstm() /** { "tree" :"RiskAssessment.method", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMethod, addCoding, setSystem"} **/
						, riskassessment.getRskssssmntMthdCcCdngCVrsn() /** { "tree" :"RiskAssessment.method", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMethod, addCoding, setVersion"} **/
						, riskassessment.getRskssssmntMthdCcCdngCCde() /** { "tree" :"RiskAssessment.method", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMethod, addCoding, setCode"} **/
						, riskassessment.getRskssssmntMthdCcCdngCDsplay() /** { "tree" :"RiskAssessment.method", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMethod, addCoding, setDisplay"} **/
						, riskassessment.getRskssssmntMthdCcCdngCSrSlctd() /** { "tree" :"RiskAssessment.method", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMethod, addCoding, setUserSelected"} **/
						, riskassessment.getRiskAssessmentMethodCcText() /** { "tree" :"RiskAssessment.method", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMethod, setText"} **/
						));
Riskassessmentobj.setCode(HapiFHIRHelpers.createCodeableConcept(riskassessment.getRskssssmntCdCcCdngCSstm() /** { "tree" :"RiskAssessment.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, riskassessment.getRskssssmntCdCcCdngCVrsn() /** { "tree" :"RiskAssessment.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, riskassessment.getRskssssmntCdCcCdngCCde() /** { "tree" :"RiskAssessment.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, riskassessment.getRskssssmntCdCcCdngCDsplay() /** { "tree" :"RiskAssessment.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, riskassessment.getRskssssmntCdCcCdngCSrSlctd() /** { "tree" :"RiskAssessment.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, riskassessment.getRiskAssessmentCodeCcText() /** { "tree" :"RiskAssessment.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Riskassessmentobj.setSubject(HapiFHIRHelpers.createReference(riskassessment.getRiskAssessmentSubjectReference() /** { "tree" :"RiskAssessment.subject", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Riskassessmentobj.setEncounter(HapiFHIRHelpers.createReference(riskassessment.getRiskAssessmentEncounterReference() /** { "tree" :"RiskAssessment.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Riskassessmentobj.setOccurrence(HapiFHIRHelpers.createdateTimetype(riskassessment.getRskssssmntCcrrncDttmDtTme() /** { "tree" :"RiskAssessment.occurrenceDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceDatetime"} **/
						));
Riskassessmentobj.setOccurrencePeriod(HapiFHIRHelpers.createPeriod(riskassessment.getRskssssmntCcrrncPrdPrdStrt() /** { "tree" :"RiskAssessment.occurrencePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrencePeriod, setStart"} **/
						, riskassessment.getRskssssmntCcrrncPrdPrdNd() /** { "tree" :"RiskAssessment.occurrencePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrencePeriod, setEnd"} **/
						));
Riskassessmentobj.setCondition(HapiFHIRHelpers.createReference(riskassessment.getRiskAssessmentConditionReference() /** { "tree" :"RiskAssessment.condition", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCondition"} **/
						));
Riskassessmentobj.setPerformer(HapiFHIRHelpers.createReference(riskassessment.getRiskAssessmentPerformerReference() /** { "tree" :"RiskAssessment.performer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformer"} **/
						));
Riskassessmentobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(riskassessment.getRskssssmntRsnCdCcCdngCSstm() /** { "tree" :"RiskAssessment.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, riskassessment.getRskssssmntRsnCdCcCdngCVrsn() /** { "tree" :"RiskAssessment.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, riskassessment.getRskssssmntRsnCdCcCdngCCde() /** { "tree" :"RiskAssessment.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, riskassessment.getRskssssmntRsnCdCcCdngCDsplay() /** { "tree" :"RiskAssessment.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, riskassessment.getRskssssmntRsnCdCcCdngCSrSlctd() /** { "tree" :"RiskAssessment.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, riskassessment.getRiskAssessmentReasonCodeCcText() /** { "tree" :"RiskAssessment.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Riskassessmentobj.addReasonReference(HapiFHIRHelpers.createReference(riskassessment.getRskssssmntRsnRfrncRfrnce() /** { "tree" :"RiskAssessment.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonReference"} **/
						));
Riskassessmentobj.addBasis(HapiFHIRHelpers.createReference(riskassessment.getRiskAssessmentBasisReference() /** { "tree" :"RiskAssessment.basis", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasis"} **/
						));
Riskassessmentobj.setOutcome(HapiFHIRHelpers.createCodeableConcept(riskassessment.getRskssssmntPrdctnTcmCcCdngCSstm() /** { "tree" :"RiskAssessment.prediction.outcome", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setOutcome, addCoding, setSystem"} **/
						, riskassessment.getRskssssmntPrdctnTcmCcCdngCVrsn() /** { "tree" :"RiskAssessment.prediction.outcome", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setOutcome, addCoding, setVersion"} **/
						, riskassessment.getRskssssmntPrdctnTcmCcCdngCCde() /** { "tree" :"RiskAssessment.prediction.outcome", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setOutcome, addCoding, setCode"} **/
						, riskassessment.getRskssssmntPrdctnTcmCcCdngCDsplay() /** { "tree" :"RiskAssessment.prediction.outcome", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setOutcome, addCoding, setDisplay"} **/
						, riskassessment.getRskssssmntPrdctnTcmCcCdngCSrSlctd() /** { "tree" :"RiskAssessment.prediction.outcome", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setOutcome, addCoding, setUserSelected"} **/
						, riskassessment.getRskssssmntPrdctnTcmCcTxt() /** { "tree" :"RiskAssessment.prediction.outcome", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setOutcome, setText"} **/
						));
Riskassessmentobj.setProbabilityDecimal(HapiFHIRHelpers.createdecimal(riskassessment.getRskssssmntPrdctnPrbbltDcmlDcml() /** { "tree" :"RiskAssessment.prediction.probabilityDecimal", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setProbabilityDecimal"} **/
						));
Riskassessmentobj.setProbabilityRange(HapiFHIRHelpers.createRange(riskassessment.getRskssssmntPrdctnPrbbltRngRngLw() /** { "tree" :"RiskAssessment.prediction.probabilityRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setProbabilityRange, setLow"} **/
						, riskassessment.getRskssssmntPrdctnPrbbltRngRngHgh() /** { "tree" :"RiskAssessment.prediction.probabilityRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setProbabilityRange, setHigh"} **/
						));
Riskassessmentobj.setQualitativeRisk(HapiFHIRHelpers.createCodeableConcept(riskassessment.getRskssssmntPrdctnQlttvRskCcCdngCSstm() /** { "tree" :"RiskAssessment.prediction.qualitativeRisk", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setQualitativeRisk, addCoding, setSystem"} **/
						, riskassessment.getRskssssmntPrdctnQlttvRskCcCdngCVrsn() /** { "tree" :"RiskAssessment.prediction.qualitativeRisk", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setQualitativeRisk, addCoding, setVersion"} **/
						, riskassessment.getRskssssmntPrdctnQlttvRskCcCdngCCde() /** { "tree" :"RiskAssessment.prediction.qualitativeRisk", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setQualitativeRisk, addCoding, setCode"} **/
						, riskassessment.getRskssssmntPrdctnQlttvRskCcCdngCDsplay() /** { "tree" :"RiskAssessment.prediction.qualitativeRisk", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setQualitativeRisk, addCoding, setDisplay"} **/
						, riskassessment.getRskssssmntPrdctnQlttvRskCcCdngCSrSlctd() /** { "tree" :"RiskAssessment.prediction.qualitativeRisk", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setQualitativeRisk, addCoding, setUserSelected"} **/
						, riskassessment.getRskssssmntPrdctnQlttvRskCcTxt() /** { "tree" :"RiskAssessment.prediction.qualitativeRisk", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setQualitativeRisk, setText"} **/
						));
Riskassessmentobj.setRelativeRisk(HapiFHIRHelpers.createdecimal(riskassessment.getRskssssmntPrdctnRltvRskDcml() /** { "tree" :"RiskAssessment.prediction.relativeRisk", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setRelativeRisk"} **/
						));
Riskassessmentobj.setWhenPeriod(HapiFHIRHelpers.createPeriod(riskassessment.getRskssssmntPrdctnWhnPrdPrdStrt() /** { "tree" :"RiskAssessment.prediction.whenPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setWhenPeriod, setStart"} **/
						, riskassessment.getRskssssmntPrdctnWhnPrdPrdNd() /** { "tree" :"RiskAssessment.prediction.whenPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setWhenPeriod, setEnd"} **/
						));
Riskassessmentobj.setWhenRange(HapiFHIRHelpers.createRange(riskassessment.getRskssssmntPrdctnWhnRngRngLw() /** { "tree" :"RiskAssessment.prediction.whenRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setWhenRange, setLow"} **/
						, riskassessment.getRskssssmntPrdctnWhnRngRngHgh() /** { "tree" :"RiskAssessment.prediction.whenRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setWhenRange, setHigh"} **/
						));
Riskassessmentobj.setRationale(HapiFHIRHelpers.createstring(riskassessment.getRskssssmntPrdctnRtnlStrng() /** { "tree" :"RiskAssessment.prediction.rationale", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addPrediction"] , "methodName" : "setRationale"} **/
						));
Riskassessmentobj.setMitigation(HapiFHIRHelpers.createstring(riskassessment.getRiskAssessmentMitigationString() /** { "tree" :"RiskAssessment.mitigation", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMitigation"} **/
						));
Riskassessmentobj.addNote(HapiFHIRHelpers.createAnnotation(riskassessment.getRskssssmntNtNnttnTme() /** { "tree" :"RiskAssessment.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, riskassessment.getRskssssmntNtNnttnTxt() /** { "tree" :"RiskAssessment.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, riskassessment.getRskssssmntNtNnttnThrRfrnce() /** { "tree" :"RiskAssessment.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, riskassessment.getRskssssmntNtNnttnThrStrng() /** { "tree" :"RiskAssessment.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
		));
	}
}
