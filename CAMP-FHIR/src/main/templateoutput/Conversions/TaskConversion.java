package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Task.
 * @see .Task
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class TaskConversion 
{
	public Patient Tasks(main.templateoutput.Model.Task task) 
	{
			Patient  Taskobj = new Patient(); 

						Taskobj.addIdentifier(HapiFHIRHelpers.createIdentifier(task.getTaskIdentifierIdentifierUse() /** { "tree" :"Task.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, task.getTskDntfrDntfrTpCcCSstm() /** { "tree" :"Task.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, task.getTskDntfrDntfrTpCcCVrsn() /** { "tree" :"Task.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, task.getTskDntfrDntfrTpCcCCde() /** { "tree" :"Task.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, task.getTskDntfrDntfrTpCcCDsplay() /** { "tree" :"Task.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, task.getTskDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Task.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, task.getTskDntfrDntfrTpCcTxt() /** { "tree" :"Task.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, task.getTskDntfrDntfrPrdPrdStrt() /** { "tree" :"Task.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, task.getTskDntfrDntfrPrdPrdNd() /** { "tree" :"Task.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, task.getTskDntfrDntfrSsgnr() /** { "tree" :"Task.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, task.getTaskIdentifierIdentifierValue() /** { "tree" :"Task.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, task.getTaskIdentifierIdentifierSystem() /** { "tree" :"Task.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Taskobj.setInstantiatesCanonical(HapiFHIRHelpers.createcanonical(task.getTskNstnttsCnnclCnncl() /** { "tree" :"Task.instantiatesCanonical", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setInstantiatesCanonical"} **/
						));
Taskobj.setInstantiatesUri(HapiFHIRHelpers.createuri(task.getTaskInstantiatesUriUri() /** { "tree" :"Task.instantiatesUri", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setInstantiatesUri"} **/
						));
Taskobj.addBasedOn(HapiFHIRHelpers.createReference(task.getTaskBasedOnReference() /** { "tree" :"Task.basedOn", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasedOn"} **/
						));
Taskobj.setGroupIdentifier(HapiFHIRHelpers.createIdentifier(task.getTskGrpdntfrDntfrSe() /** { "tree" :"Task.groupIdentifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setUse"} **/
						, task.getTskGrpdntfrDntfrTpCcCSstm() /** { "tree" :"Task.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setSystem"} **/
						, task.getTskGrpdntfrDntfrTpCcCVrsn() /** { "tree" :"Task.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setVersion"} **/
						, task.getTskGrpdntfrDntfrTpCcCCde() /** { "tree" :"Task.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setCode"} **/
						, task.getTskGrpdntfrDntfrTpCcCDsplay() /** { "tree" :"Task.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setDisplay"} **/
						, task.getTskGrpdntfrDntfrTpCcCSrSlctd() /** { "tree" :"Task.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setUserSelected"} **/
						, task.getTskGrpdntfrDntfrTpCcTxt() /** { "tree" :"Task.groupIdentifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, setText"} **/
						, task.getTskGrpdntfrDntfrPrdPrdStrt() /** { "tree" :"Task.groupIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setPeriod, setStart"} **/
						, task.getTskGrpdntfrDntfrPrdPrdNd() /** { "tree" :"Task.groupIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setPeriod, setEnd"} **/
						, task.getTskGrpdntfrDntfrSsgnr() /** { "tree" :"Task.groupIdentifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setAssigner"} **/
						, task.getTskGrpdntfrDntfrVlue() /** { "tree" :"Task.groupIdentifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setValue"} **/
						, task.getTskGrpdntfrDntfrSstm() /** { "tree" :"Task.groupIdentifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setSystem"} **/
						));
Taskobj.addPartOf(HapiFHIRHelpers.createReference(task.getTaskPartOfReference() /** { "tree" :"Task.partOf", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPartOf"} **/
						));
Taskobj.setStatus(HapiFHIRHelpers.createcode(task.getTaskStatusCode() /** { "tree" :"Task.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Taskobj.setStatusReason(HapiFHIRHelpers.createCodeableConcept(task.getTskSttsRsnCcCdngCSstm() /** { "tree" :"Task.statusReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setSystem"} **/
						, task.getTskSttsRsnCcCdngCVrsn() /** { "tree" :"Task.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setVersion"} **/
						, task.getTaskStatusReasonCcCodingCCode() /** { "tree" :"Task.statusReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setCode"} **/
						, task.getTskSttsRsnCcCdngCDsplay() /** { "tree" :"Task.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setDisplay"} **/
						, task.getTskSttsRsnCcCdngCSrSlctd() /** { "tree" :"Task.statusReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setUserSelected"} **/
						, task.getTaskStatusReasonCcText() /** { "tree" :"Task.statusReason", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, setText"} **/
						));
Taskobj.setBusinessStatus(HapiFHIRHelpers.createCodeableConcept(task.getTskBsnssSttsCcCdngCSstm() /** { "tree" :"Task.businessStatus", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBusinessStatus, addCoding, setSystem"} **/
						, task.getTskBsnssSttsCcCdngCVrsn() /** { "tree" :"Task.businessStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBusinessStatus, addCoding, setVersion"} **/
						, task.getTskBsnssSttsCcCdngCCde() /** { "tree" :"Task.businessStatus", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBusinessStatus, addCoding, setCode"} **/
						, task.getTskBsnssSttsCcCdngCDsplay() /** { "tree" :"Task.businessStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBusinessStatus, addCoding, setDisplay"} **/
						, task.getTskBsnssSttsCcCdngCSrSlctd() /** { "tree" :"Task.businessStatus", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBusinessStatus, addCoding, setUserSelected"} **/
						, task.getTaskBusinessStatusCcText() /** { "tree" :"Task.businessStatus", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBusinessStatus, setText"} **/
						));
Taskobj.setIntent(HapiFHIRHelpers.createcode(task.getTaskIntentCode() /** { "tree" :"Task.intent", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setIntent"} **/
						));
Taskobj.setPriority(HapiFHIRHelpers.createcode(task.getTaskPriorityCode() /** { "tree" :"Task.priority", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority"} **/
						));
Taskobj.setCode(HapiFHIRHelpers.createCodeableConcept(task.getTaskCodeCcCodingCSystem() /** { "tree" :"Task.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, task.getTaskCodeCcCodingCVersion() /** { "tree" :"Task.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, task.getTaskCodeCcCodingCCode() /** { "tree" :"Task.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, task.getTaskCodeCcCodingCDisplay() /** { "tree" :"Task.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, task.getTaskCodeCcCodingCUserSelected() /** { "tree" :"Task.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, task.getTaskCodeCcText() /** { "tree" :"Task.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Taskobj.setDescription(HapiFHIRHelpers.createstring(task.getTaskDescriptionString() /** { "tree" :"Task.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Taskobj.setFocus(HapiFHIRHelpers.createReference(task.getTaskFocusReference() /** { "tree" :"Task.focus", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFocus"} **/
						));
Taskobj.setFor(HapiFHIRHelpers.createReference(task.getTaskForReference() /** { "tree" :"Task.for", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFor"} **/
						));
Taskobj.setEncounter(HapiFHIRHelpers.createReference(task.getTaskEncounterReference() /** { "tree" :"Task.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Taskobj.setExecutionPeriod(HapiFHIRHelpers.createPeriod(task.getTaskExecutionPeriodPeriodStart() /** { "tree" :"Task.executionPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExecutionPeriod, setStart"} **/
						, task.getTaskExecutionPeriodPeriodEnd() /** { "tree" :"Task.executionPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExecutionPeriod, setEnd"} **/
						));
Taskobj.setAuthoredOn(HapiFHIRHelpers.createdateTime(task.getTaskAuthoredOnDateTime() /** { "tree" :"Task.authoredOn", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAuthoredOn"} **/
						));
Taskobj.setLastModified(HapiFHIRHelpers.createdateTime(task.getTaskLastModifiedDateTime() /** { "tree" :"Task.lastModified", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLastModified"} **/
						));
Taskobj.setRequester(HapiFHIRHelpers.createReference(task.getTaskRequesterReference() /** { "tree" :"Task.requester", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequester"} **/
						));
Taskobj.addPerformerType(HapiFHIRHelpers.createCodeableConcept(task.getTskPrfrmrTpCcCdngCSstm() /** { "tree" :"Task.performerType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPerformerType, addCoding, setSystem"} **/
						, task.getTskPrfrmrTpCcCdngCVrsn() /** { "tree" :"Task.performerType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPerformerType, addCoding, setVersion"} **/
						, task.getTskPrfrmrTpCcCdngCCde() /** { "tree" :"Task.performerType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPerformerType, addCoding, setCode"} **/
						, task.getTskPrfrmrTpCcCdngCDsplay() /** { "tree" :"Task.performerType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPerformerType, addCoding, setDisplay"} **/
						, task.getTskPrfrmrTpCcCdngCSrSlctd() /** { "tree" :"Task.performerType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPerformerType, addCoding, setUserSelected"} **/
						, task.getTaskPerformerTypeCcText() /** { "tree" :"Task.performerType", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPerformerType, setText"} **/
						));
Taskobj.setOwner(HapiFHIRHelpers.createReference(task.getTaskOwnerReference() /** { "tree" :"Task.owner", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOwner"} **/
						));
Taskobj.setLocation(HapiFHIRHelpers.createReference(task.getTaskLocationReference() /** { "tree" :"Task.location", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLocation"} **/
						));
Taskobj.setReasonCode(HapiFHIRHelpers.createCodeableConcept(task.getTaskReasonCodeCcCodingCSystem() /** { "tree" :"Task.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReasonCode, addCoding, setSystem"} **/
						, task.getTskRsnCdCcCdngCVrsn() /** { "tree" :"Task.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReasonCode, addCoding, setVersion"} **/
						, task.getTaskReasonCodeCcCodingCCode() /** { "tree" :"Task.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReasonCode, addCoding, setCode"} **/
						, task.getTskRsnCdCcCdngCDsplay() /** { "tree" :"Task.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReasonCode, addCoding, setDisplay"} **/
						, task.getTskRsnCdCcCdngCSrSlctd() /** { "tree" :"Task.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReasonCode, addCoding, setUserSelected"} **/
						, task.getTaskReasonCodeCcText() /** { "tree" :"Task.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReasonCode, setText"} **/
						));
Taskobj.setReasonReference(HapiFHIRHelpers.createReference(task.getTaskReasonReferenceReference() /** { "tree" :"Task.reasonReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReasonReference"} **/
						));
Taskobj.addInsurance(HapiFHIRHelpers.createReference(task.getTaskInsuranceReference() /** { "tree" :"Task.insurance", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInsurance"} **/
						));
Taskobj.addNote(HapiFHIRHelpers.createAnnotation(task.getTaskNoteAnnotationTime() /** { "tree" :"Task.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, task.getTaskNoteAnnotationText() /** { "tree" :"Task.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, task.getTskNtNnttnThrRfrnce() /** { "tree" :"Task.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, task.getTaskNoteAnnotationAuthorString() /** { "tree" :"Task.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Taskobj.addRelevantHistory(HapiFHIRHelpers.createReference(task.getTaskRelevantHistoryReference() /** { "tree" :"Task.relevantHistory", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelevantHistory"} **/
						));
Taskobj.setRepetitions(HapiFHIRHelpers.createpositiveInt(task.getTskRstrctnRpttnsPstvnt() /** { "tree" :"Task.restriction.repetitions", "datatype" : "positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["setRestriction"] , "methodName" : "setRepetitions"} **/
						));
Taskobj.setPeriod(HapiFHIRHelpers.createPeriod(task.getTskRstrctnPrdPrdStrt() /** { "tree" :"Task.restriction.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setRestriction"] , "methodName" : "setPeriod, setStart"} **/
						, task.getTaskRestrictionPeriodPeriodEnd() /** { "tree" :"Task.restriction.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setRestriction"] , "methodName" : "setPeriod, setEnd"} **/
						));
Taskobj.addRecipient(HapiFHIRHelpers.createReference(task.getTskRstrctnRcpntRfrnce() /** { "tree" :"Task.restriction.recipient", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["setRestriction"] , "methodName" : "addRecipient"} **/
						));
Taskobj.setType(HapiFHIRHelpers.createCodeableConcept(task.getTaskInputTypeCcCodingCSystem() /** { "tree" :"Task.input.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addInput"] , "methodName" : "setType, addCoding, setSystem"} **/
						, task.getTskNptTpCcCdngCVrsn() /** { "tree" :"Task.input.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addInput"] , "methodName" : "setType, addCoding, setVersion"} **/
						, task.getTaskInputTypeCcCodingCCode() /** { "tree" :"Task.input.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addInput"] , "methodName" : "setType, addCoding, setCode"} **/
						, task.getTskNptTpCcCdngCDsplay() /** { "tree" :"Task.input.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addInput"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, task.getTskNptTpCcCdngCSrSlctd() /** { "tree" :"Task.input.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addInput"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, task.getTaskInputTypeCcText() /** { "tree" :"Task.input.type", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addInput"] , "methodName" : "setType, setText"} **/
						, task.getTskTptTpCcCdngCSstm() /** { "tree" :"Task.output.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addOutput"] , "methodName" : "setType, addCoding, setSystem"} **/
						, task.getTskTptTpCcCdngCVrsn() /** { "tree" :"Task.output.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addOutput"] , "methodName" : "setType, addCoding, setVersion"} **/
						, task.getTaskOutputTypeCcCodingCCode() /** { "tree" :"Task.output.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addOutput"] , "methodName" : "setType, addCoding, setCode"} **/
						, task.getTskTptTpCcCdngCDsplay() /** { "tree" :"Task.output.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addOutput"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, task.getTskTptTpCcCdngCSrSlctd() /** { "tree" :"Task.output.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addOutput"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, task.getTaskOutputTypeCcText() /** { "tree" :"Task.output.type", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addOutput"] , "methodName" : "setType, setText"} **/
		));
	}
}
