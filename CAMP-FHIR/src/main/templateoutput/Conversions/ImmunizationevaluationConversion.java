package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Immunizationevaluation.
 * @see .Immunizationevaluation
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ImmunizationevaluationConversion 
{
	public Patient Immunizationevaluations(main.templateoutput.Model.Immunizationevaluation immunizationevaluation) 
	{
			Patient  Immunizationevaluationobj = new Patient(); 

						Immunizationevaluationobj.addIdentifier(HapiFHIRHelpers.createIdentifier(immunizationevaluation.getImmvltnDntfrDntfrSe() /** { "tree" :"ImmunizationEvaluation.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, immunizationevaluation.getImmvltnDntfrDntfrTpCcCSstm() /** { "tree" :"ImmunizationEvaluation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, immunizationevaluation.getImmvltnDntfrDntfrTpCcCVrsn() /** { "tree" :"ImmunizationEvaluation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, immunizationevaluation.getImmvltnDntfrDntfrTpCcCCde() /** { "tree" :"ImmunizationEvaluation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, immunizationevaluation.getImmvltnDntfrDntfrTpCcCDsplay() /** { "tree" :"ImmunizationEvaluation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, immunizationevaluation.getImmvltnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"ImmunizationEvaluation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, immunizationevaluation.getImmvltnDntfrDntfrTpCcTxt() /** { "tree" :"ImmunizationEvaluation.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, immunizationevaluation.getImmvltnDntfrDntfrPrdPrdStrt() /** { "tree" :"ImmunizationEvaluation.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, immunizationevaluation.getImmvltnDntfrDntfrPrdPrdNd() /** { "tree" :"ImmunizationEvaluation.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, immunizationevaluation.getImmvltnDntfrDntfrSsgnr() /** { "tree" :"ImmunizationEvaluation.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, immunizationevaluation.getImmvltnDntfrDntfrVlue() /** { "tree" :"ImmunizationEvaluation.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, immunizationevaluation.getImmvltnDntfrDntfrSstm() /** { "tree" :"ImmunizationEvaluation.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Immunizationevaluationobj.setStatus(HapiFHIRHelpers.createcode(immunizationevaluation.getImmEvaluationStatusCode() /** { "tree" :"ImmunizationEvaluation.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Immunizationevaluationobj.setPatient(HapiFHIRHelpers.createReference(immunizationevaluation.getImmEvaluationPntReference() /** { "tree" :"ImmunizationEvaluation.patient", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPatient"} **/
						));
Immunizationevaluationobj.setDate(HapiFHIRHelpers.createdateTime(immunizationevaluation.getImmEvaluationDateDateTime() /** { "tree" :"ImmunizationEvaluation.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Immunizationevaluationobj.setAuthority(HapiFHIRHelpers.createReference(immunizationevaluation.getImmEvaluationAuthorityReference() /** { "tree" :"ImmunizationEvaluation.authority", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAuthority"} **/
						));
Immunizationevaluationobj.setTargetDisease(HapiFHIRHelpers.createCodeableConcept(immunizationevaluation.getImmvltnTrgtDssCcCdngCSstm() /** { "tree" :"ImmunizationEvaluation.targetDisease", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setTargetDisease, addCoding, setSystem"} **/
						, immunizationevaluation.getImmvltnTrgtDssCcCdngCVrsn() /** { "tree" :"ImmunizationEvaluation.targetDisease", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setTargetDisease, addCoding, setVersion"} **/
						, immunizationevaluation.getImmvltnTrgtDssCcCdngCCde() /** { "tree" :"ImmunizationEvaluation.targetDisease", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setTargetDisease, addCoding, setCode"} **/
						, immunizationevaluation.getImmvltnTrgtDssCcCdngCDsplay() /** { "tree" :"ImmunizationEvaluation.targetDisease", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setTargetDisease, addCoding, setDisplay"} **/
						, immunizationevaluation.getImmvltnTrgtDssCcCdngCSrSlctd() /** { "tree" :"ImmunizationEvaluation.targetDisease", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setTargetDisease, addCoding, setUserSelected"} **/
						, immunizationevaluation.getImmvltnTrgtDssCcTxt() /** { "tree" :"ImmunizationEvaluation.targetDisease", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setTargetDisease, setText"} **/
						));
Immunizationevaluationobj.setImmunizationEvent(HapiFHIRHelpers.createReference(immunizationevaluation.getImmEvaluationImmEventReference() /** { "tree" :"ImmunizationEvaluation.immunizationEvent", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setImmunizationEvent"} **/
						));
Immunizationevaluationobj.setDoseStatus(HapiFHIRHelpers.createCodeableConcept(immunizationevaluation.getImmvltnDsSttsCcCdngCSstm() /** { "tree" :"ImmunizationEvaluation.doseStatus", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDoseStatus, addCoding, setSystem"} **/
						, immunizationevaluation.getImmvltnDsSttsCcCdngCVrsn() /** { "tree" :"ImmunizationEvaluation.doseStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDoseStatus, addCoding, setVersion"} **/
						, immunizationevaluation.getImmvltnDsSttsCcCdngCCde() /** { "tree" :"ImmunizationEvaluation.doseStatus", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDoseStatus, addCoding, setCode"} **/
						, immunizationevaluation.getImmvltnDsSttsCcCdngCDsplay() /** { "tree" :"ImmunizationEvaluation.doseStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDoseStatus, addCoding, setDisplay"} **/
						, immunizationevaluation.getImmvltnDsSttsCcCdngCSrSlctd() /** { "tree" :"ImmunizationEvaluation.doseStatus", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDoseStatus, addCoding, setUserSelected"} **/
						, immunizationevaluation.getImmEvaluationDoseStatusCcText() /** { "tree" :"ImmunizationEvaluation.doseStatus", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDoseStatus, setText"} **/
						));
Immunizationevaluationobj.addDoseStatusReason(HapiFHIRHelpers.createCodeableConcept(immunizationevaluation.getImmvltnDsSttsRsnCcCdngCSstm() /** { "tree" :"ImmunizationEvaluation.doseStatusReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDoseStatusReason, addCoding, setSystem"} **/
						, immunizationevaluation.getImmvltnDsSttsRsnCcCdngCVrsn() /** { "tree" :"ImmunizationEvaluation.doseStatusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDoseStatusReason, addCoding, setVersion"} **/
						, immunizationevaluation.getImmvltnDsSttsRsnCcCdngCCde() /** { "tree" :"ImmunizationEvaluation.doseStatusReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDoseStatusReason, addCoding, setCode"} **/
						, immunizationevaluation.getImmvltnDsSttsRsnCcCdngCDsplay() /** { "tree" :"ImmunizationEvaluation.doseStatusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDoseStatusReason, addCoding, setDisplay"} **/
						, immunizationevaluation.getImmvltnDsSttsRsnCcCdngCSrSlctd() /** { "tree" :"ImmunizationEvaluation.doseStatusReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDoseStatusReason, addCoding, setUserSelected"} **/
						, immunizationevaluation.getImmvltnDsSttsRsnCcTxt() /** { "tree" :"ImmunizationEvaluation.doseStatusReason", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDoseStatusReason, setText"} **/
						));
Immunizationevaluationobj.setDescription(HapiFHIRHelpers.createstring(immunizationevaluation.getImmEvaluationDescriptionString() /** { "tree" :"ImmunizationEvaluation.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Immunizationevaluationobj.setSeries(HapiFHIRHelpers.createstring(immunizationevaluation.getImmEvaluationSeriesString() /** { "tree" :"ImmunizationEvaluation.series", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeries"} **/
						));
Immunizationevaluationobj.setDoseNumberPositiveint(HapiFHIRHelpers.createpositiveInt(immunizationevaluation.getImmvltnDsNmbrPstvntPstvnt() /** { "tree" :"ImmunizationEvaluation.doseNumberPositiveint", "datatype" : "positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDoseNumberPositiveint"} **/
						));
Immunizationevaluationobj.setDoseNumberString(HapiFHIRHelpers.createstring(immunizationevaluation.getImmvltnDsNmbrStrngStrng() /** { "tree" :"ImmunizationEvaluation.doseNumberString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDoseNumberString"} **/
						));
Immunizationevaluationobj.setSeriesDosesPositiveint(HapiFHIRHelpers.createpositiveInt(immunizationevaluation.getImmvltnSrsDssPstvntPstvnt() /** { "tree" :"ImmunizationEvaluation.seriesDosesPositiveint", "datatype" : "positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeriesDosesPositiveint"} **/
						));
Immunizationevaluationobj.setSeriesDosesString(HapiFHIRHelpers.createstring(immunizationevaluation.getImmvltnSrsDssStrngStrng() /** { "tree" :"ImmunizationEvaluation.seriesDosesString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeriesDosesString"} **/
		));
	}
}
