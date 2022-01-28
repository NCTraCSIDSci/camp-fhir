package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Goal.
 * @see .Goal
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class GoalConversion 
{
	public Patient Goals(main.templateoutput.Model.Goal goal) 
	{
			Patient  Goalobj = new Patient(); 

						Goalobj.addIdentifier(HapiFHIRHelpers.createIdentifier(goal.getGoalIdentifierIdentifierUse() /** { "tree" :"Goal.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, goal.getGlDntfrDntfrTpCcCSstm() /** { "tree" :"Goal.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, goal.getGlDntfrDntfrTpCcCVrsn() /** { "tree" :"Goal.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, goal.getGlDntfrDntfrTpCcCCde() /** { "tree" :"Goal.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, goal.getGlDntfrDntfrTpCcCDsplay() /** { "tree" :"Goal.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, goal.getGlDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Goal.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, goal.getGlDntfrDntfrTpCcTxt() /** { "tree" :"Goal.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, goal.getGlDntfrDntfrPrdPrdStrt() /** { "tree" :"Goal.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, goal.getGlDntfrDntfrPrdPrdNd() /** { "tree" :"Goal.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, goal.getGlDntfrDntfrSsgnr() /** { "tree" :"Goal.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, goal.getGoalIdentifierIdentifierValue() /** { "tree" :"Goal.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, goal.getGoalIdentifierIdentifierSystem() /** { "tree" :"Goal.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Goalobj.setLifecycleStatus(HapiFHIRHelpers.createcode(goal.getGoalLifecycleStatusCode() /** { "tree" :"Goal.lifecycleStatus", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setLifecycleStatus"} **/
						));
Goalobj.setAchievementStatus(HapiFHIRHelpers.createCodeableConcept(goal.getGlChvmntSttsCcCdngCSstm() /** { "tree" :"Goal.achievementStatus", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAchievementStatus, addCoding, setSystem"} **/
						, goal.getGlChvmntSttsCcCdngCVrsn() /** { "tree" :"Goal.achievementStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAchievementStatus, addCoding, setVersion"} **/
						, goal.getGlChvmntSttsCcCdngCCde() /** { "tree" :"Goal.achievementStatus", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAchievementStatus, addCoding, setCode"} **/
						, goal.getGlChvmntSttsCcCdngCDsplay() /** { "tree" :"Goal.achievementStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAchievementStatus, addCoding, setDisplay"} **/
						, goal.getGlChvmntSttsCcCdngCSrSlctd() /** { "tree" :"Goal.achievementStatus", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAchievementStatus, addCoding, setUserSelected"} **/
						, goal.getGoalAchievementStatusCcText() /** { "tree" :"Goal.achievementStatus", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAchievementStatus, setText"} **/
						));
Goalobj.addCategory(HapiFHIRHelpers.createCodeableConcept(goal.getGoalCategoryCcCodingCSystem() /** { "tree" :"Goal.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setSystem"} **/
						, goal.getGoalCategoryCcCodingCVersion() /** { "tree" :"Goal.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setVersion"} **/
						, goal.getGoalCategoryCcCodingCCode() /** { "tree" :"Goal.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setCode"} **/
						, goal.getGoalCategoryCcCodingCDisplay() /** { "tree" :"Goal.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setDisplay"} **/
						, goal.getGlCtgrCcCdngCSrSlctd() /** { "tree" :"Goal.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setUserSelected"} **/
						, goal.getGoalCategoryCcText() /** { "tree" :"Goal.category", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, setText"} **/
						));
Goalobj.setPriority(HapiFHIRHelpers.createCodeableConcept(goal.getGoalPriorityCcCodingCSystem() /** { "tree" :"Goal.priority", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority, addCoding, setSystem"} **/
						, goal.getGoalPriorityCcCodingCVersion() /** { "tree" :"Goal.priority", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority, addCoding, setVersion"} **/
						, goal.getGoalPriorityCcCodingCCode() /** { "tree" :"Goal.priority", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority, addCoding, setCode"} **/
						, goal.getGoalPriorityCcCodingCDisplay() /** { "tree" :"Goal.priority", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority, addCoding, setDisplay"} **/
						, goal.getGlPrrtCcCdngCSrSlctd() /** { "tree" :"Goal.priority", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority, addCoding, setUserSelected"} **/
						, goal.getGoalPriorityCcText() /** { "tree" :"Goal.priority", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority, setText"} **/
						));
Goalobj.setDescription(HapiFHIRHelpers.createCodeableConcept(goal.getGlDscrptnCcCdngCSstm() /** { "tree" :"Goal.description", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDescription, addCoding, setSystem"} **/
						, goal.getGlDscrptnCcCdngCVrsn() /** { "tree" :"Goal.description", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDescription, addCoding, setVersion"} **/
						, goal.getGoalDescriptionCcCodingCCode() /** { "tree" :"Goal.description", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDescription, addCoding, setCode"} **/
						, goal.getGlDscrptnCcCdngCDsplay() /** { "tree" :"Goal.description", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDescription, addCoding, setDisplay"} **/
						, goal.getGlDscrptnCcCdngCSrSlctd() /** { "tree" :"Goal.description", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDescription, addCoding, setUserSelected"} **/
						, goal.getGoalDescriptionCcText() /** { "tree" :"Goal.description", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDescription, setText"} **/
						));
Goalobj.setSubject(HapiFHIRHelpers.createReference(goal.getGoalSubjectReference() /** { "tree" :"Goal.subject", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Goalobj.setStartDate(HapiFHIRHelpers.createdate(goal.getGoalStartDateDate() /** { "tree" :"Goal.startDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStartDate"} **/
						));
Goalobj.setStartCodeableconcept(HapiFHIRHelpers.createCodeableConcept(goal.getGlStrtCdblcncptCcCdngCSstm() /** { "tree" :"Goal.startCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStartCodeableconcept, addCoding, setSystem"} **/
						, goal.getGlStrtCdblcncptCcCdngCVrsn() /** { "tree" :"Goal.startCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStartCodeableconcept, addCoding, setVersion"} **/
						, goal.getGlStrtCdblcncptCcCdngCCde() /** { "tree" :"Goal.startCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStartCodeableconcept, addCoding, setCode"} **/
						, goal.getGlStrtCdblcncptCcCdngCDsplay() /** { "tree" :"Goal.startCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStartCodeableconcept, addCoding, setDisplay"} **/
						, goal.getGlStrtCdblcncptCcCdngCSrSlctd() /** { "tree" :"Goal.startCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStartCodeableconcept, addCoding, setUserSelected"} **/
						, goal.getGoalStartCodeableconceptCcText() /** { "tree" :"Goal.startCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStartCodeableconcept, setText"} **/
						));
Goalobj.setMeasure(HapiFHIRHelpers.createCodeableConcept(goal.getGlTrgtMsrCcCdngCSstm() /** { "tree" :"Goal.target.measure", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setMeasure, addCoding, setSystem"} **/
						, goal.getGlTrgtMsrCcCdngCVrsn() /** { "tree" :"Goal.target.measure", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setMeasure, addCoding, setVersion"} **/
						, goal.getGlTrgtMsrCcCdngCCde() /** { "tree" :"Goal.target.measure", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setMeasure, addCoding, setCode"} **/
						, goal.getGlTrgtMsrCcCdngCDsplay() /** { "tree" :"Goal.target.measure", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setMeasure, addCoding, setDisplay"} **/
						, goal.getGlTrgtMsrCcCdngCSrSlctd() /** { "tree" :"Goal.target.measure", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setMeasure, addCoding, setUserSelected"} **/
						, goal.getGoalTargetMeasureCcText() /** { "tree" :"Goal.target.measure", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setMeasure, setText"} **/
						));
Goalobj.setDetailQuantity(HapiFHIRHelpers.createQuantity(goal.getGlTrgtDtlQnttQnttCmprtr() /** { "tree" :"Goal.target.detailQuantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailQuantity, setComparator"} **/
						, goal.getGlTrgtDtlQnttQnttCde() /** { "tree" :"Goal.target.detailQuantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailQuantity, setCode"} **/
						, goal.getGlTrgtDtlQnttQnttVlue() /** { "tree" :"Goal.target.detailQuantity", "datatype" : "Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailQuantity, setValue"} **/
						, goal.getGlTrgtDtlQnttQnttNt() /** { "tree" :"Goal.target.detailQuantity", "datatype" : "Quantity, string", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailQuantity, setUnit"} **/
						, goal.getGlTrgtDtlQnttQnttSstm() /** { "tree" :"Goal.target.detailQuantity", "datatype" : "Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailQuantity, setSystem"} **/
						));
Goalobj.setDetailRange(HapiFHIRHelpers.createRange(goal.getGoalTargetDetailRangeRangeLow() /** { "tree" :"Goal.target.detailRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailRange, setLow"} **/
						, goal.getGoalTargetDetailRangeRangeHigh() /** { "tree" :"Goal.target.detailRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailRange, setHigh"} **/
						));
Goalobj.setDetailCodeableconcept(HapiFHIRHelpers.createCodeableConcept(goal.getGlTrgtDtlCdblcncptCcCdngCSstm() /** { "tree" :"Goal.target.detailCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailCodeableconcept, addCoding, setSystem"} **/
						, goal.getGlTrgtDtlCdblcncptCcCdngCVrsn() /** { "tree" :"Goal.target.detailCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailCodeableconcept, addCoding, setVersion"} **/
						, goal.getGlTrgtDtlCdblcncptCcCdngCCde() /** { "tree" :"Goal.target.detailCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailCodeableconcept, addCoding, setCode"} **/
						, goal.getGlTrgtDtlCdblcncptCcCdngCDsplay() /** { "tree" :"Goal.target.detailCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailCodeableconcept, addCoding, setDisplay"} **/
						, goal.getGlTrgtDtlCdblcncptCcCdngCSrSlctd() /** { "tree" :"Goal.target.detailCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailCodeableconcept, addCoding, setUserSelected"} **/
						, goal.getGlTrgtDtlCdblcncptCcTxt() /** { "tree" :"Goal.target.detailCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailCodeableconcept, setText"} **/
						));
Goalobj.setDetailString(HapiFHIRHelpers.createstring(goal.getGoalTargetDetailStringString() /** { "tree" :"Goal.target.detailString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailString"} **/
						));
Goalobj.setDetail(HapiFHIRHelpers.createbooleantype(goal.getGoalTargetDetailBooleanBoolean() /** { "tree" :"Goal.target.detailBoolean", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailBoolean"} **/
						));
Goalobj.setDetail(HapiFHIRHelpers.createintegertype(goal.getGoalTargetDetailIntegerInteger() /** { "tree" :"Goal.target.detailInteger", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailInteger"} **/
						));
Goalobj.setDetailRatio(HapiFHIRHelpers.createRatio(goal.getGlTrgtDtlRtRtNmrtrQnttVlue() /** { "tree" :"Goal.target.detailRatio", "datatype" : "Ratio, Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailRatio, setNumerator, setValue"} **/
						, goal.getGlTrgtDtlRtRtDnmntrQnttVlue() /** { "tree" :"Goal.target.detailRatio", "datatype" : "Ratio, Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailRatio, setDenominator, setValue"} **/
						, goal.getGlTrgtDtlRtRtNmrtrQnttCmprtr() /** { "tree" :"Goal.target.detailRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailRatio, setNumerator, setComparator"} **/
						, goal.getGlTrgtDtlRtRtDnmntrQnttCmprtr() /** { "tree" :"Goal.target.detailRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailRatio, setDenominator, setComparator"} **/
						, goal.getGlTrgtDtlRtRtNmrtrQnttNt() /** { "tree" :"Goal.target.detailRatio", "datatype" : "Ratio, Quantity, string", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailRatio, setNumerator, setUnit"} **/
						, goal.getGlTrgtDtlRtRtDnmntrQnttNt() /** { "tree" :"Goal.target.detailRatio", "datatype" : "Ratio, Quantity, string", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailRatio, setDenominator, setUnit"} **/
						, goal.getGlTrgtDtlRtRtNmrtrQnttSstm() /** { "tree" :"Goal.target.detailRatio", "datatype" : "Ratio, Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailRatio, setNumerator, setSystem"} **/
						, goal.getGlTrgtDtlRtRtDnmntrQnttSstm() /** { "tree" :"Goal.target.detailRatio", "datatype" : "Ratio, Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailRatio, setDenominator, setSystem"} **/
						, goal.getGlTrgtDtlRtRtNmrtrQnttCde() /** { "tree" :"Goal.target.detailRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailRatio, setNumerator, setCode"} **/
						, goal.getGlTrgtDtlRtRtDnmntrQnttCde() /** { "tree" :"Goal.target.detailRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDetailRatio, setDenominator, setCode"} **/
						));
Goalobj.setDueDate(HapiFHIRHelpers.createdate(goal.getGoalTargetDueDateDate() /** { "tree" :"Goal.target.dueDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDueDate"} **/
						));
Goalobj.setDueDuration(HapiFHIRHelpers.createDuration(goal.getGoalTargetDueDurationDuration() /** { "tree" :"Goal.target.dueDuration", "datatype" : "Duration", "cardinality" : "ZeroOne", "elementtree" : ["addTarget"] , "methodName" : "setDueDuration"} **/
						));
Goalobj.setStatusDate(HapiFHIRHelpers.createdate(goal.getGoalStatusDateDate() /** { "tree" :"Goal.statusDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusDate"} **/
						));
Goalobj.setStatusReason(HapiFHIRHelpers.createstring(goal.getGoalStatusReasonString() /** { "tree" :"Goal.statusReason", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason"} **/
						));
Goalobj.setExpressedBy(HapiFHIRHelpers.createReference(goal.getGoalExpressedByReference() /** { "tree" :"Goal.expressedBy", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExpressedBy"} **/
						));
Goalobj.addAddresses(HapiFHIRHelpers.createReference(goal.getGoalAddressesReference() /** { "tree" :"Goal.addresses", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddresses"} **/
						));
Goalobj.addNote(HapiFHIRHelpers.createAnnotation(goal.getGoalNoteAnnotationTime() /** { "tree" :"Goal.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, goal.getGoalNoteAnnotationText() /** { "tree" :"Goal.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, goal.getGlNtNnttnThrRfrnce() /** { "tree" :"Goal.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, goal.getGoalNoteAnnotationAuthorString() /** { "tree" :"Goal.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Goalobj.addOutcomeCode(HapiFHIRHelpers.createCodeableConcept(goal.getGlTcmCdCcCdngCSstm() /** { "tree" :"Goal.outcomeCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOutcomeCode, addCoding, setSystem"} **/
						, goal.getGlTcmCdCcCdngCVrsn() /** { "tree" :"Goal.outcomeCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOutcomeCode, addCoding, setVersion"} **/
						, goal.getGoalOutcomeCodeCcCodingCCode() /** { "tree" :"Goal.outcomeCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOutcomeCode, addCoding, setCode"} **/
						, goal.getGlTcmCdCcCdngCDsplay() /** { "tree" :"Goal.outcomeCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOutcomeCode, addCoding, setDisplay"} **/
						, goal.getGlTcmCdCcCdngCSrSlctd() /** { "tree" :"Goal.outcomeCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOutcomeCode, addCoding, setUserSelected"} **/
						, goal.getGoalOutcomeCodeCcText() /** { "tree" :"Goal.outcomeCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOutcomeCode, setText"} **/
						));
Goalobj.addOutcomeReference(HapiFHIRHelpers.createReference(goal.getGoalOutcomeReferenceReference() /** { "tree" :"Goal.outcomeReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOutcomeReference"} **/
		));
	}
}
