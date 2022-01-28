package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Adverseevent.
 * @see .Adverseevent
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class AdverseeventConversion 
{
	public Patient Adverseevents(main.templateoutput.Model.Adverseevent adverseevent) 
	{
			Patient  Adverseeventobj = new Patient(); 

						Adverseeventobj.setIdentifier(HapiFHIRHelpers.createIdentifier(adverseevent.getAdvrsvntDntfrDntfrSe() /** { "tree" :"AdverseEvent.identifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setUse"} **/
						, adverseevent.getAdvrsvntDntfrDntfrTpCcCSstm() /** { "tree" :"AdverseEvent.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setSystem"} **/
						, adverseevent.getAdvrsvntDntfrDntfrTpCcCVrsn() /** { "tree" :"AdverseEvent.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setVersion"} **/
						, adverseevent.getAdvrsvntDntfrDntfrTpCcCCde() /** { "tree" :"AdverseEvent.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setCode"} **/
						, adverseevent.getAdvrsvntDntfrDntfrTpCcCDsplay() /** { "tree" :"AdverseEvent.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setDisplay"} **/
						, adverseevent.getAdvrsvntDntfrDntfrTpCcCSrSlctd() /** { "tree" :"AdverseEvent.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setUserSelected"} **/
						, adverseevent.getAdvrsvntDntfrDntfrTpCcTxt() /** { "tree" :"AdverseEvent.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, setText"} **/
						, adverseevent.getAdvrsvntDntfrDntfrPrdPrdStrt() /** { "tree" :"AdverseEvent.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setPeriod, setStart"} **/
						, adverseevent.getAdvrsvntDntfrDntfrPrdPrdNd() /** { "tree" :"AdverseEvent.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setPeriod, setEnd"} **/
						, adverseevent.getAdvrsvntDntfrDntfrSsgnr() /** { "tree" :"AdverseEvent.identifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setAssigner"} **/
						, adverseevent.getAdvrsvntDntfrDntfrVlue() /** { "tree" :"AdverseEvent.identifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setValue"} **/
						, adverseevent.getAdvrsvntDntfrDntfrSstm() /** { "tree" :"AdverseEvent.identifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setSystem"} **/
						));
Adverseeventobj.setActuality(HapiFHIRHelpers.createcode(adverseevent.getAdverseEventActualityCode() /** { "tree" :"AdverseEvent.actuality", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setActuality"} **/
						));
Adverseeventobj.addCategory(HapiFHIRHelpers.createCodeableConcept(adverseevent.getAdvrsvntCtgrCcCdngCSstm() /** { "tree" :"AdverseEvent.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setSystem"} **/
						, adverseevent.getAdvrsvntCtgrCcCdngCVrsn() /** { "tree" :"AdverseEvent.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setVersion"} **/
						, adverseevent.getAdvrsvntCtgrCcCdngCCde() /** { "tree" :"AdverseEvent.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setCode"} **/
						, adverseevent.getAdvrsvntCtgrCcCdngCDsplay() /** { "tree" :"AdverseEvent.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setDisplay"} **/
						, adverseevent.getAdvrsvntCtgrCcCdngCSrSlctd() /** { "tree" :"AdverseEvent.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setUserSelected"} **/
						, adverseevent.getAdverseEventCategoryCcText() /** { "tree" :"AdverseEvent.category", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, setText"} **/
						));
Adverseeventobj.setEvent(HapiFHIRHelpers.createCodeableConcept(adverseevent.getAdvrsvntVntCcCdngCSstm() /** { "tree" :"AdverseEvent.event", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEvent, addCoding, setSystem"} **/
						, adverseevent.getAdvrsvntVntCcCdngCVrsn() /** { "tree" :"AdverseEvent.event", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEvent, addCoding, setVersion"} **/
						, adverseevent.getAdvrsvntVntCcCdngCCde() /** { "tree" :"AdverseEvent.event", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEvent, addCoding, setCode"} **/
						, adverseevent.getAdvrsvntVntCcCdngCDsplay() /** { "tree" :"AdverseEvent.event", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEvent, addCoding, setDisplay"} **/
						, adverseevent.getAdvrsvntVntCcCdngCSrSlctd() /** { "tree" :"AdverseEvent.event", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEvent, addCoding, setUserSelected"} **/
						, adverseevent.getAdverseEventEventCcText() /** { "tree" :"AdverseEvent.event", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEvent, setText"} **/
						));
Adverseeventobj.setSubject(HapiFHIRHelpers.createReference(adverseevent.getAdverseEventSubjectReference() /** { "tree" :"AdverseEvent.subject", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Adverseeventobj.setEncounter(HapiFHIRHelpers.createReference(adverseevent.getAdverseEventEncounterReference() /** { "tree" :"AdverseEvent.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Adverseeventobj.setDate(HapiFHIRHelpers.createdateTime(adverseevent.getAdverseEventDateDateTime() /** { "tree" :"AdverseEvent.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Adverseeventobj.setDetected(HapiFHIRHelpers.createdateTime(adverseevent.getAdverseEventDetectedDateTime() /** { "tree" :"AdverseEvent.detected", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDetected"} **/
						));
Adverseeventobj.setRecordedDate(HapiFHIRHelpers.createdateTime(adverseevent.getAdverseEventRecordedDateDateTime() /** { "tree" :"AdverseEvent.recordedDate", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRecordedDate"} **/
						));
Adverseeventobj.addResultingCondition(HapiFHIRHelpers.createReference(adverseevent.getAdvrsvntRsltngCndtnRfrnce() /** { "tree" :"AdverseEvent.resultingCondition", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addResultingCondition"} **/
						));
Adverseeventobj.setLocation(HapiFHIRHelpers.createReference(adverseevent.getAdverseEventLocationReference() /** { "tree" :"AdverseEvent.location", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLocation"} **/
						));
Adverseeventobj.setSeriousness(HapiFHIRHelpers.createCodeableConcept(adverseevent.getAdvrsvntSrsnssCcCdngCSstm() /** { "tree" :"AdverseEvent.seriousness", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeriousness, addCoding, setSystem"} **/
						, adverseevent.getAdvrsvntSrsnssCcCdngCVrsn() /** { "tree" :"AdverseEvent.seriousness", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeriousness, addCoding, setVersion"} **/
						, adverseevent.getAdvrsvntSrsnssCcCdngCCde() /** { "tree" :"AdverseEvent.seriousness", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeriousness, addCoding, setCode"} **/
						, adverseevent.getAdvrsvntSrsnssCcCdngCDsplay() /** { "tree" :"AdverseEvent.seriousness", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeriousness, addCoding, setDisplay"} **/
						, adverseevent.getAdvrsvntSrsnssCcCdngCSrSlctd() /** { "tree" :"AdverseEvent.seriousness", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeriousness, addCoding, setUserSelected"} **/
						, adverseevent.getAdverseEventSeriousnessCcText() /** { "tree" :"AdverseEvent.seriousness", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeriousness, setText"} **/
						));
Adverseeventobj.setSeverity(HapiFHIRHelpers.createCodeableConcept(adverseevent.getAdvrsvntSvrtCcCdngCSstm() /** { "tree" :"AdverseEvent.severity", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeverity, addCoding, setSystem"} **/
						, adverseevent.getAdvrsvntSvrtCcCdngCVrsn() /** { "tree" :"AdverseEvent.severity", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeverity, addCoding, setVersion"} **/
						, adverseevent.getAdvrsvntSvrtCcCdngCCde() /** { "tree" :"AdverseEvent.severity", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeverity, addCoding, setCode"} **/
						, adverseevent.getAdvrsvntSvrtCcCdngCDsplay() /** { "tree" :"AdverseEvent.severity", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeverity, addCoding, setDisplay"} **/
						, adverseevent.getAdvrsvntSvrtCcCdngCSrSlctd() /** { "tree" :"AdverseEvent.severity", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeverity, addCoding, setUserSelected"} **/
						, adverseevent.getAdverseEventSeverityCcText() /** { "tree" :"AdverseEvent.severity", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSeverity, setText"} **/
						));
Adverseeventobj.setOutcome(HapiFHIRHelpers.createCodeableConcept(adverseevent.getAdvrsvntTcmCcCdngCSstm() /** { "tree" :"AdverseEvent.outcome", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOutcome, addCoding, setSystem"} **/
						, adverseevent.getAdvrsvntTcmCcCdngCVrsn() /** { "tree" :"AdverseEvent.outcome", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOutcome, addCoding, setVersion"} **/
						, adverseevent.getAdvrsvntTcmCcCdngCCde() /** { "tree" :"AdverseEvent.outcome", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOutcome, addCoding, setCode"} **/
						, adverseevent.getAdvrsvntTcmCcCdngCDsplay() /** { "tree" :"AdverseEvent.outcome", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOutcome, addCoding, setDisplay"} **/
						, adverseevent.getAdvrsvntTcmCcCdngCSrSlctd() /** { "tree" :"AdverseEvent.outcome", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOutcome, addCoding, setUserSelected"} **/
						, adverseevent.getAdverseEventOutcomeCcText() /** { "tree" :"AdverseEvent.outcome", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOutcome, setText"} **/
						));
Adverseeventobj.setRecorder(HapiFHIRHelpers.createReference(adverseevent.getAdverseEventRecorderReference() /** { "tree" :"AdverseEvent.recorder", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRecorder"} **/
						));
Adverseeventobj.addContributor(HapiFHIRHelpers.createReference(adverseevent.getAdverseEventContributorReference() /** { "tree" :"AdverseEvent.contributor", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContributor"} **/
						));
Adverseeventobj.setInstance(HapiFHIRHelpers.createReference(adverseevent.getAdvrsvntSspctnttNstncRfrnce() /** { "tree" :"AdverseEvent.suspectEntity.instance", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addSuspectEntity"] , "methodName" : "setInstance"} **/
						));
Adverseeventobj.setAssessment(HapiFHIRHelpers.createCodeableConcept(adverseevent.getAdvrsvntSspctnttCsltSsssmntCcCdngCSstm() /** { "tree" :"AdverseEvent.suspectEntity.causality.assessment", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addSuspectEntity", "addCausality"] , "methodName" : "setAssessment, addCoding, setSystem"} **/
						, adverseevent.getAdvrsvntSspctnttCsltSsssmntCcCdngCVrsn() /** { "tree" :"AdverseEvent.suspectEntity.causality.assessment", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSuspectEntity", "addCausality"] , "methodName" : "setAssessment, addCoding, setVersion"} **/
						, adverseevent.getAdvrsvntSspctnttCsltSsssmntCcCdngCCde() /** { "tree" :"AdverseEvent.suspectEntity.causality.assessment", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addSuspectEntity", "addCausality"] , "methodName" : "setAssessment, addCoding, setCode"} **/
						, adverseevent.getAdvrsvntSspctnttCsltSsssmntCcCdngCDsplay() /** { "tree" :"AdverseEvent.suspectEntity.causality.assessment", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSuspectEntity", "addCausality"] , "methodName" : "setAssessment, addCoding, setDisplay"} **/
						, adverseevent.getAdvrsvntSspctnttCsltSsssmntCcCdngCSrSlctd() /** { "tree" :"AdverseEvent.suspectEntity.causality.assessment", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addSuspectEntity", "addCausality"] , "methodName" : "setAssessment, addCoding, setUserSelected"} **/
						, adverseevent.getAdvrsvntSspctnttCsltSsssmntCcTxt() /** { "tree" :"AdverseEvent.suspectEntity.causality.assessment", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addSuspectEntity", "addCausality"] , "methodName" : "setAssessment, setText"} **/
						));
Adverseeventobj.setProductRelatedness(HapiFHIRHelpers.createstring(adverseevent.getAdvrsvntSspctnttCsltPrdctRltdnssStrng() /** { "tree" :"AdverseEvent.suspectEntity.causality.productRelatedness", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addSuspectEntity", "addCausality"] , "methodName" : "setProductRelatedness"} **/
						));
Adverseeventobj.setAuthor(HapiFHIRHelpers.createReference(adverseevent.getAdvrsvntSspctnttCsltThrRfrnce() /** { "tree" :"AdverseEvent.suspectEntity.causality.author", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addSuspectEntity", "addCausality"] , "methodName" : "setAuthor"} **/
						));
Adverseeventobj.setMethod(HapiFHIRHelpers.createCodeableConcept(adverseevent.getAdvrsvntSspctnttCsltMthdCcCdngCSstm() /** { "tree" :"AdverseEvent.suspectEntity.causality.method", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addSuspectEntity", "addCausality"] , "methodName" : "setMethod, addCoding, setSystem"} **/
						, adverseevent.getAdvrsvntSspctnttCsltMthdCcCdngCVrsn() /** { "tree" :"AdverseEvent.suspectEntity.causality.method", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSuspectEntity", "addCausality"] , "methodName" : "setMethod, addCoding, setVersion"} **/
						, adverseevent.getAdvrsvntSspctnttCsltMthdCcCdngCCde() /** { "tree" :"AdverseEvent.suspectEntity.causality.method", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addSuspectEntity", "addCausality"] , "methodName" : "setMethod, addCoding, setCode"} **/
						, adverseevent.getAdvrsvntSspctnttCsltMthdCcCdngCDsplay() /** { "tree" :"AdverseEvent.suspectEntity.causality.method", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSuspectEntity", "addCausality"] , "methodName" : "setMethod, addCoding, setDisplay"} **/
						, adverseevent.getAdvrsvntSspctnttCsltMthdCcCdngCSrSlctd() /** { "tree" :"AdverseEvent.suspectEntity.causality.method", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addSuspectEntity", "addCausality"] , "methodName" : "setMethod, addCoding, setUserSelected"} **/
						, adverseevent.getAdvrsvntSspctnttCsltMthdCcTxt() /** { "tree" :"AdverseEvent.suspectEntity.causality.method", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addSuspectEntity", "addCausality"] , "methodName" : "setMethod, setText"} **/
						));
Adverseeventobj.addSubjectMedicalHistory(HapiFHIRHelpers.createReference(adverseevent.getAdvrsvntSbjctMdclHstrRfrnce() /** { "tree" :"AdverseEvent.subjectMedicalHistory", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSubjectMedicalHistory"} **/
						));
Adverseeventobj.addReferenceDocument(HapiFHIRHelpers.createReference(adverseevent.getAdvrsvntRfrncDcmntRfrnce() /** { "tree" :"AdverseEvent.referenceDocument", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReferenceDocument"} **/
						));
Adverseeventobj.addStudy(HapiFHIRHelpers.createReference(adverseevent.getAdverseEventStudyReference() /** { "tree" :"AdverseEvent.study", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addStudy"} **/
		));
	}
}
