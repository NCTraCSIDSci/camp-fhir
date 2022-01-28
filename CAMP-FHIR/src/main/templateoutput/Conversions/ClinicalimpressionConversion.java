package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Clinicalimpression.
 * @see .Clinicalimpression
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ClinicalimpressionConversion 
{
	public Patient Clinicalimpressions(main.templateoutput.Model.Clinicalimpression clinicalimpression) 
	{
			Patient  Clinicalimpressionobj = new Patient(); 

						Clinicalimpressionobj.addIdentifier(HapiFHIRHelpers.createIdentifier(clinicalimpression.getClnclmprssnDntfrDntfrSe() /** { "tree" :"ClinicalImpression.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, clinicalimpression.getClnclmprssnDntfrDntfrTpCcCSstm() /** { "tree" :"ClinicalImpression.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, clinicalimpression.getClnclmprssnDntfrDntfrTpCcCVrsn() /** { "tree" :"ClinicalImpression.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, clinicalimpression.getClnclmprssnDntfrDntfrTpCcCCde() /** { "tree" :"ClinicalImpression.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, clinicalimpression.getClnclmprssnDntfrDntfrTpCcCDsplay() /** { "tree" :"ClinicalImpression.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, clinicalimpression.getClnclmprssnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"ClinicalImpression.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, clinicalimpression.getClnclmprssnDntfrDntfrTpCcTxt() /** { "tree" :"ClinicalImpression.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, clinicalimpression.getClnclmprssnDntfrDntfrPrdPrdStrt() /** { "tree" :"ClinicalImpression.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, clinicalimpression.getClnclmprssnDntfrDntfrPrdPrdNd() /** { "tree" :"ClinicalImpression.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, clinicalimpression.getClnclmprssnDntfrDntfrSsgnr() /** { "tree" :"ClinicalImpression.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, clinicalimpression.getClnclmprssnDntfrDntfrVlue() /** { "tree" :"ClinicalImpression.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, clinicalimpression.getClnclmprssnDntfrDntfrSstm() /** { "tree" :"ClinicalImpression.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Clinicalimpressionobj.setStatus(HapiFHIRHelpers.createcode(clinicalimpression.getClinicalImpressionStatusCode() /** { "tree" :"ClinicalImpression.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Clinicalimpressionobj.setStatusReason(HapiFHIRHelpers.createCodeableConcept(clinicalimpression.getClnclmprssnSttsRsnCcCdngCSstm() /** { "tree" :"ClinicalImpression.statusReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setSystem"} **/
						, clinicalimpression.getClnclmprssnSttsRsnCcCdngCVrsn() /** { "tree" :"ClinicalImpression.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setVersion"} **/
						, clinicalimpression.getClnclmprssnSttsRsnCcCdngCCde() /** { "tree" :"ClinicalImpression.statusReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setCode"} **/
						, clinicalimpression.getClnclmprssnSttsRsnCcCdngCDsplay() /** { "tree" :"ClinicalImpression.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setDisplay"} **/
						, clinicalimpression.getClnclmprssnSttsRsnCcCdngCSrSlctd() /** { "tree" :"ClinicalImpression.statusReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setUserSelected"} **/
						, clinicalimpression.getClnclmprssnSttsRsnCcTxt() /** { "tree" :"ClinicalImpression.statusReason", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, setText"} **/
						));
Clinicalimpressionobj.setCode(HapiFHIRHelpers.createCodeableConcept(clinicalimpression.getClnclmprssnCdCcCdngCSstm() /** { "tree" :"ClinicalImpression.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, clinicalimpression.getClnclmprssnCdCcCdngCVrsn() /** { "tree" :"ClinicalImpression.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, clinicalimpression.getClnclmprssnCdCcCdngCCde() /** { "tree" :"ClinicalImpression.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, clinicalimpression.getClnclmprssnCdCcCdngCDsplay() /** { "tree" :"ClinicalImpression.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, clinicalimpression.getClnclmprssnCdCcCdngCSrSlctd() /** { "tree" :"ClinicalImpression.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, clinicalimpression.getClinicalImpressionCodeCcText() /** { "tree" :"ClinicalImpression.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Clinicalimpressionobj.setDescription(HapiFHIRHelpers.createstring(clinicalimpression.getClnclmprssnDscrptnStrng() /** { "tree" :"ClinicalImpression.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Clinicalimpressionobj.setSubject(HapiFHIRHelpers.createReference(clinicalimpression.getClnclmprssnSbjctRfrnce() /** { "tree" :"ClinicalImpression.subject", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Clinicalimpressionobj.setEncounter(HapiFHIRHelpers.createReference(clinicalimpression.getClnclmprssnNcntrRfrnce() /** { "tree" :"ClinicalImpression.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Clinicalimpressionobj.setEffective(HapiFHIRHelpers.createdateTimetype(clinicalimpression.getClnclmprssnFfctvDttmDtTme() /** { "tree" :"ClinicalImpression.effectiveDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveDatetime"} **/
						));
Clinicalimpressionobj.setEffectivePeriod(HapiFHIRHelpers.createPeriod(clinicalimpression.getClnclmprssnFfctvPrdPrdStrt() /** { "tree" :"ClinicalImpression.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setStart"} **/
						, clinicalimpression.getClnclmprssnFfctvPrdPrdNd() /** { "tree" :"ClinicalImpression.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setEnd"} **/
						));
Clinicalimpressionobj.setDate(HapiFHIRHelpers.createdateTime(clinicalimpression.getClinicalImpressionDateDateTime() /** { "tree" :"ClinicalImpression.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Clinicalimpressionobj.setAssessor(HapiFHIRHelpers.createReference(clinicalimpression.getClnclmprssnSsssrRfrnce() /** { "tree" :"ClinicalImpression.assessor", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAssessor"} **/
						));
Clinicalimpressionobj.setPrevious(HapiFHIRHelpers.createReference(clinicalimpression.getClnclmprssnPrvsRfrnce() /** { "tree" :"ClinicalImpression.previous", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPrevious"} **/
						));
Clinicalimpressionobj.addProblem(HapiFHIRHelpers.createReference(clinicalimpression.getClnclmprssnPrblmRfrnce() /** { "tree" :"ClinicalImpression.problem", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProblem"} **/
						));
Clinicalimpressionobj.setCode(HapiFHIRHelpers.createCodeableConcept(clinicalimpression.getClnclmprssnNvstgtnCdCcCdngCSstm() /** { "tree" :"ClinicalImpression.investigation.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addInvestigation"] , "methodName" : "setCode, addCoding, setSystem"} **/
						, clinicalimpression.getClnclmprssnNvstgtnCdCcCdngCVrsn() /** { "tree" :"ClinicalImpression.investigation.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addInvestigation"] , "methodName" : "setCode, addCoding, setVersion"} **/
						, clinicalimpression.getClnclmprssnNvstgtnCdCcCdngCCde() /** { "tree" :"ClinicalImpression.investigation.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addInvestigation"] , "methodName" : "setCode, addCoding, setCode"} **/
						, clinicalimpression.getClnclmprssnNvstgtnCdCcCdngCDsplay() /** { "tree" :"ClinicalImpression.investigation.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addInvestigation"] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, clinicalimpression.getClnclmprssnNvstgtnCdCcCdngCSrSlctd() /** { "tree" :"ClinicalImpression.investigation.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addInvestigation"] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, clinicalimpression.getClnclmprssnNvstgtnCdCcTxt() /** { "tree" :"ClinicalImpression.investigation.code", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addInvestigation"] , "methodName" : "setCode, setText"} **/
						));
Clinicalimpressionobj.addItem(HapiFHIRHelpers.createReference(clinicalimpression.getClnclmprssnNvstgtnTmRfrnce() /** { "tree" :"ClinicalImpression.investigation.item", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addInvestigation"] , "methodName" : "addItem"} **/
						));
Clinicalimpressionobj.addProtocol(HapiFHIRHelpers.createuri(clinicalimpression.getClinicalImpressionProtocolUri() /** { "tree" :"ClinicalImpression.protocol", "datatype" : "uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProtocol"} **/
						));
Clinicalimpressionobj.setSummary(HapiFHIRHelpers.createstring(clinicalimpression.getClinicalImpressionSummaryString() /** { "tree" :"ClinicalImpression.summary", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSummary"} **/
						));
Clinicalimpressionobj.setItemCodeableConcept(HapiFHIRHelpers.createCodeableConcept(clinicalimpression.getClnclmprssnFndngTmCdblCncptCcCdngCSstm() /** { "tree" :"ClinicalImpression.finding.itemCodeableConcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addFinding"] , "methodName" : "setItemCodeableConcept, addCoding, setSystem"} **/
						, clinicalimpression.getClnclmprssnFndngTmCdblCncptCcCdngCVrsn() /** { "tree" :"ClinicalImpression.finding.itemCodeableConcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addFinding"] , "methodName" : "setItemCodeableConcept, addCoding, setVersion"} **/
						, clinicalimpression.getClnclmprssnFndngTmCdblCncptCcCdngCCde() /** { "tree" :"ClinicalImpression.finding.itemCodeableConcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addFinding"] , "methodName" : "setItemCodeableConcept, addCoding, setCode"} **/
						, clinicalimpression.getClnclmprssnFndngTmCdblCncptCcCdngCDsplay() /** { "tree" :"ClinicalImpression.finding.itemCodeableConcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addFinding"] , "methodName" : "setItemCodeableConcept, addCoding, setDisplay"} **/
						, clinicalimpression.getClnclmprssnFndngTmCdblCncptCcCdngCSrSlctd() /** { "tree" :"ClinicalImpression.finding.itemCodeableConcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addFinding"] , "methodName" : "setItemCodeableConcept, addCoding, setUserSelected"} **/
						, clinicalimpression.getClnclmprssnFndngTmCdblCncptCcTxt() /** { "tree" :"ClinicalImpression.finding.itemCodeableConcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addFinding"] , "methodName" : "setItemCodeableConcept, setText"} **/
						));
Clinicalimpressionobj.setItemReference(HapiFHIRHelpers.createReference(clinicalimpression.getClnclmprssnFndngTmRfrncRfrnce() /** { "tree" :"ClinicalImpression.finding.itemReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addFinding"] , "methodName" : "setItemReference"} **/
						));
Clinicalimpressionobj.setBasis(HapiFHIRHelpers.createstring(clinicalimpression.getClnclmprssnFndngBssStrng() /** { "tree" :"ClinicalImpression.finding.basis", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addFinding"] , "methodName" : "setBasis"} **/
						));
Clinicalimpressionobj.addPrognosisCodeableConcept(HapiFHIRHelpers.createCodeableConcept(clinicalimpression.getClnclmprssnPrgnssCdblCncptCcCdngCSstm() /** { "tree" :"ClinicalImpression.prognosisCodeableConcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPrognosisCodeableConcept, addCoding, setSystem"} **/
						, clinicalimpression.getClnclmprssnPrgnssCdblCncptCcCdngCVrsn() /** { "tree" :"ClinicalImpression.prognosisCodeableConcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPrognosisCodeableConcept, addCoding, setVersion"} **/
						, clinicalimpression.getClnclmprssnPrgnssCdblCncptCcCdngCCde() /** { "tree" :"ClinicalImpression.prognosisCodeableConcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPrognosisCodeableConcept, addCoding, setCode"} **/
						, clinicalimpression.getClnclmprssnPrgnssCdblCncptCcCdngCDsplay() /** { "tree" :"ClinicalImpression.prognosisCodeableConcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPrognosisCodeableConcept, addCoding, setDisplay"} **/
						, clinicalimpression.getClnclmprssnPrgnssCdblCncptCcCdngCSrSlctd() /** { "tree" :"ClinicalImpression.prognosisCodeableConcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPrognosisCodeableConcept, addCoding, setUserSelected"} **/
						, clinicalimpression.getClnclmprssnPrgnssCdblCncptCcTxt() /** { "tree" :"ClinicalImpression.prognosisCodeableConcept", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPrognosisCodeableConcept, setText"} **/
						));
Clinicalimpressionobj.addPrognosisReference(HapiFHIRHelpers.createReference(clinicalimpression.getClnclmprssnPrgnssRfrncRfrnce() /** { "tree" :"ClinicalImpression.prognosisReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPrognosisReference"} **/
						));
Clinicalimpressionobj.addSupportingInfo(HapiFHIRHelpers.createReference(clinicalimpression.getClnclmprssnSpprtngnfRfrnce() /** { "tree" :"ClinicalImpression.supportingInfo", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSupportingInfo"} **/
						));
Clinicalimpressionobj.addNote(HapiFHIRHelpers.createAnnotation(clinicalimpression.getClnclmprssnNtNnttnTme() /** { "tree" :"ClinicalImpression.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, clinicalimpression.getClnclmprssnNtNnttnTxt() /** { "tree" :"ClinicalImpression.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, clinicalimpression.getClnclmprssnNtNnttnThrRfrnce() /** { "tree" :"ClinicalImpression.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, clinicalimpression.getClnclmprssnNtNnttnThrStrng() /** { "tree" :"ClinicalImpression.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
		));
	}
}
