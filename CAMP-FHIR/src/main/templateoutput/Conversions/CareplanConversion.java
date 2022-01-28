package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Careplan.
 * @see .Careplan
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class CareplanConversion 
{
	public Patient Careplans(main.templateoutput.Model.Careplan careplan) 
	{
			Patient  Careplanobj = new Patient(); 

						Careplanobj.addIdentifier(HapiFHIRHelpers.createIdentifier(careplan.getCarePlanIdentifierIdentifierUse() /** { "tree" :"CarePlan.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, careplan.getCrPlnDntfrDntfrTpCcCSstm() /** { "tree" :"CarePlan.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, careplan.getCrPlnDntfrDntfrTpCcCVrsn() /** { "tree" :"CarePlan.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, careplan.getCrPlnDntfrDntfrTpCcCCde() /** { "tree" :"CarePlan.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, careplan.getCrPlnDntfrDntfrTpCcCDsplay() /** { "tree" :"CarePlan.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, careplan.getCrPlnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"CarePlan.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, careplan.getCrPlnDntfrDntfrTpCcTxt() /** { "tree" :"CarePlan.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, careplan.getCrPlnDntfrDntfrPrdPrdStrt() /** { "tree" :"CarePlan.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, careplan.getCrPlnDntfrDntfrPrdPrdNd() /** { "tree" :"CarePlan.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, careplan.getCrPlnDntfrDntfrSsgnr() /** { "tree" :"CarePlan.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, careplan.getCrPlnDntfrDntfrVlue() /** { "tree" :"CarePlan.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, careplan.getCrPlnDntfrDntfrSstm() /** { "tree" :"CarePlan.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Careplanobj.addInstantiatesCanonical(HapiFHIRHelpers.createcanonical(careplan.getCrPlnNstnttsCnnclCnncl() /** { "tree" :"CarePlan.instantiatesCanonical", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInstantiatesCanonical"} **/
						));
Careplanobj.addInstantiatesUri(HapiFHIRHelpers.createuri(careplan.getCarePlanInstantiatesUriUri() /** { "tree" :"CarePlan.instantiatesUri", "datatype" : "uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInstantiatesUri"} **/
						));
Careplanobj.addBasedOn(HapiFHIRHelpers.createReference(careplan.getCarePlanBasedOnReference() /** { "tree" :"CarePlan.basedOn", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasedOn"} **/
						));
Careplanobj.addReplaces(HapiFHIRHelpers.createReference(careplan.getCarePlanReplacesReference() /** { "tree" :"CarePlan.replaces", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReplaces"} **/
						));
Careplanobj.addPartOf(HapiFHIRHelpers.createReference(careplan.getCarePlanPartOfReference() /** { "tree" :"CarePlan.partOf", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPartOf"} **/
						));
Careplanobj.setStatus(HapiFHIRHelpers.createcode(careplan.getCarePlanStatusCode() /** { "tree" :"CarePlan.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Careplanobj.setIntent(HapiFHIRHelpers.createcode(careplan.getCarePlanIntentCode() /** { "tree" :"CarePlan.intent", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setIntent"} **/
						));
Careplanobj.addCategory(HapiFHIRHelpers.createCodeableConcept(careplan.getCrPlnCtgrCcCdngCSstm() /** { "tree" :"CarePlan.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setSystem"} **/
						, careplan.getCrPlnCtgrCcCdngCVrsn() /** { "tree" :"CarePlan.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setVersion"} **/
						, careplan.getCarePlanCategoryCcCodingCCode() /** { "tree" :"CarePlan.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setCode"} **/
						, careplan.getCrPlnCtgrCcCdngCDsplay() /** { "tree" :"CarePlan.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setDisplay"} **/
						, careplan.getCrPlnCtgrCcCdngCSrSlctd() /** { "tree" :"CarePlan.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setUserSelected"} **/
						, careplan.getCarePlanCategoryCcText() /** { "tree" :"CarePlan.category", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, setText"} **/
						));
Careplanobj.setTitle(HapiFHIRHelpers.createstring(careplan.getCarePlanTitleString() /** { "tree" :"CarePlan.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Careplanobj.setDescription(HapiFHIRHelpers.createstring(careplan.getCarePlanDescriptionString() /** { "tree" :"CarePlan.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Careplanobj.setSubject(HapiFHIRHelpers.createReference(careplan.getCarePlanSubjectReference() /** { "tree" :"CarePlan.subject", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Careplanobj.setEncounter(HapiFHIRHelpers.createReference(careplan.getCarePlanEncounterReference() /** { "tree" :"CarePlan.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Careplanobj.setPeriod(HapiFHIRHelpers.createPeriod(careplan.getCarePlanPeriodPeriodStart() /** { "tree" :"CarePlan.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setStart"} **/
						, careplan.getCarePlanPeriodPeriodEnd() /** { "tree" :"CarePlan.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setEnd"} **/
						));
Careplanobj.setCreated(HapiFHIRHelpers.createdateTime(careplan.getCarePlanCreatedDateTime() /** { "tree" :"CarePlan.created", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCreated"} **/
						));
Careplanobj.setAuthor(HapiFHIRHelpers.createReference(careplan.getCarePlanAuthorReference() /** { "tree" :"CarePlan.author", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAuthor"} **/
						));
Careplanobj.addContributor(HapiFHIRHelpers.createReference(careplan.getCarePlanContributorReference() /** { "tree" :"CarePlan.contributor", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContributor"} **/
						));
Careplanobj.addCareTeam(HapiFHIRHelpers.createReference(careplan.getCarePlanCareTeamReference() /** { "tree" :"CarePlan.careTeam", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCareTeam"} **/
						));
Careplanobj.addAddresses(HapiFHIRHelpers.createReference(careplan.getCarePlanAddressesReference() /** { "tree" :"CarePlan.addresses", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAddresses"} **/
						));
Careplanobj.addSupportingInfo(HapiFHIRHelpers.createReference(careplan.getCarePlanSupportingInfoReference() /** { "tree" :"CarePlan.supportingInfo", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSupportingInfo"} **/
						));
Careplanobj.addGoal(HapiFHIRHelpers.createReference(careplan.getCarePlanGoalReference() /** { "tree" :"CarePlan.goal", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addGoal"} **/
						));
Careplanobj.addOutcomeCodeableConcept(HapiFHIRHelpers.createCodeableConcept(careplan.getCrPlnCtvtTcmCdblCncptCcCdngCSstm() /** { "tree" :"CarePlan.activity.outcomeCodeableConcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addActivity"] , "methodName" : "addOutcomeCodeableConcept, addCoding, setSystem"} **/
						, careplan.getCrPlnCtvtTcmCdblCncptCcCdngCVrsn() /** { "tree" :"CarePlan.activity.outcomeCodeableConcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addActivity"] , "methodName" : "addOutcomeCodeableConcept, addCoding, setVersion"} **/
						, careplan.getCrPlnCtvtTcmCdblCncptCcCdngCCde() /** { "tree" :"CarePlan.activity.outcomeCodeableConcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addActivity"] , "methodName" : "addOutcomeCodeableConcept, addCoding, setCode"} **/
						, careplan.getCrPlnCtvtTcmCdblCncptCcCdngCDsplay() /** { "tree" :"CarePlan.activity.outcomeCodeableConcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addActivity"] , "methodName" : "addOutcomeCodeableConcept, addCoding, setDisplay"} **/
						, careplan.getCrPlnCtvtTcmCdblCncptCcCdngCSrSlctd() /** { "tree" :"CarePlan.activity.outcomeCodeableConcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addActivity"] , "methodName" : "addOutcomeCodeableConcept, addCoding, setUserSelected"} **/
						, careplan.getCrPlnCtvtTcmCdblCncptCcTxt() /** { "tree" :"CarePlan.activity.outcomeCodeableConcept", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addActivity"] , "methodName" : "addOutcomeCodeableConcept, setText"} **/
						));
Careplanobj.addOutcomeReference(HapiFHIRHelpers.createReference(careplan.getCrPlnCtvtTcmRfrncRfrnce() /** { "tree" :"CarePlan.activity.outcomeReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addActivity"] , "methodName" : "addOutcomeReference"} **/
						));
Careplanobj.addProgress(HapiFHIRHelpers.createAnnotation(careplan.getCrPlnCtvtPrgrssNnttnTme() /** { "tree" :"CarePlan.activity.progress", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : ["addActivity"] , "methodName" : "addProgress, setTime"} **/
						, careplan.getCrPlnCtvtPrgrssNnttnTxt() /** { "tree" :"CarePlan.activity.progress", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : ["addActivity"] , "methodName" : "addProgress, setText"} **/
						, careplan.getCrPlnCtvtPrgrssNnttnThrRfrnce() /** { "tree" :"CarePlan.activity.progress", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : ["addActivity"] , "methodName" : "addProgress, setAuthorReference"} **/
						, careplan.getCrPlnCtvtPrgrssNnttnThrStrng() /** { "tree" :"CarePlan.activity.progress", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : ["addActivity"] , "methodName" : "addProgress, setAuthorString"} **/
						));
Careplanobj.setReference(HapiFHIRHelpers.createReference(careplan.getCrPlnCtvtRfrncRfrnce() /** { "tree" :"CarePlan.activity.reference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addActivity"] , "methodName" : "setReference"} **/
						));
Careplanobj.setKind(HapiFHIRHelpers.createcode(careplan.getCarePlanActivityDetailKindCode() /** { "tree" :"CarePlan.activity.detail.kind", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setKind"} **/
						));
Careplanobj.addInstantiatesCanonical(HapiFHIRHelpers.createcanonical(careplan.getCrPlnCtvtDtlNstnttsCnnclCnncl() /** { "tree" :"CarePlan.activity.detail.instantiatesCanonical", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "addInstantiatesCanonical"} **/
						));
Careplanobj.addInstantiatesUri(HapiFHIRHelpers.createuri(careplan.getCrPlnCtvtDtlNstnttsrRi() /** { "tree" :"CarePlan.activity.detail.instantiatesUri", "datatype" : "uri", "cardinality" : "Many", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "addInstantiatesUri"} **/
						));
Careplanobj.setCode(HapiFHIRHelpers.createCodeableConcept(careplan.getCrPlnCtvtDtlCdCcCdngCSstm() /** { "tree" :"CarePlan.activity.detail.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setCode, addCoding, setSystem"} **/
						, careplan.getCrPlnCtvtDtlCdCcCdngCVrsn() /** { "tree" :"CarePlan.activity.detail.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setCode, addCoding, setVersion"} **/
						, careplan.getCrPlnCtvtDtlCdCcCdngCCde() /** { "tree" :"CarePlan.activity.detail.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setCode, addCoding, setCode"} **/
						, careplan.getCrPlnCtvtDtlCdCcCdngCDsplay() /** { "tree" :"CarePlan.activity.detail.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, careplan.getCrPlnCtvtDtlCdCcCdngCSrSlctd() /** { "tree" :"CarePlan.activity.detail.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, careplan.getCrPlnCtvtDtlCdCcTxt() /** { "tree" :"CarePlan.activity.detail.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setCode, setText"} **/
						));
Careplanobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(careplan.getCrPlnCtvtDtlRsnCdCcCdngCSstm() /** { "tree" :"CarePlan.activity.detail.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, careplan.getCrPlnCtvtDtlRsnCdCcCdngCVrsn() /** { "tree" :"CarePlan.activity.detail.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, careplan.getCrPlnCtvtDtlRsnCdCcCdngCCde() /** { "tree" :"CarePlan.activity.detail.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, careplan.getCrPlnCtvtDtlRsnCdCcCdngCDsplay() /** { "tree" :"CarePlan.activity.detail.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, careplan.getCrPlnCtvtDtlRsnCdCcCdngCSrSlctd() /** { "tree" :"CarePlan.activity.detail.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, careplan.getCrPlnCtvtDtlRsnCdCcTxt() /** { "tree" :"CarePlan.activity.detail.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "addReasonCode, setText"} **/
						));
Careplanobj.addReasonReference(HapiFHIRHelpers.createReference(careplan.getCrPlnCtvtDtlRsnRfrncRfrnce() /** { "tree" :"CarePlan.activity.detail.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "addReasonReference"} **/
						));
Careplanobj.addGoal(HapiFHIRHelpers.createReference(careplan.getCrPlnCtvtDtlGlRfrnce() /** { "tree" :"CarePlan.activity.detail.goal", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "addGoal"} **/
						));
Careplanobj.setStatus(HapiFHIRHelpers.createcode(careplan.getCrPlnCtvtDtlSttsCde() /** { "tree" :"CarePlan.activity.detail.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setStatus"} **/
						));
Careplanobj.setStatusReason(HapiFHIRHelpers.createCodeableConcept(careplan.getCrPlnCtvtDtlSttsRsnCcCdngCSstm() /** { "tree" :"CarePlan.activity.detail.statusReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setStatusReason, addCoding, setSystem"} **/
						, careplan.getCrPlnCtvtDtlSttsRsnCcCdngCVrsn() /** { "tree" :"CarePlan.activity.detail.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setStatusReason, addCoding, setVersion"} **/
						, careplan.getCrPlnCtvtDtlSttsRsnCcCdngCCde() /** { "tree" :"CarePlan.activity.detail.statusReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setStatusReason, addCoding, setCode"} **/
						, careplan.getCrPlnCtvtDtlSttsRsnCcCdngCDsplay() /** { "tree" :"CarePlan.activity.detail.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setStatusReason, addCoding, setDisplay"} **/
						, careplan.getCrPlnCtvtDtlSttsRsnCcCdngCSrSlctd() /** { "tree" :"CarePlan.activity.detail.statusReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setStatusReason, addCoding, setUserSelected"} **/
						, careplan.getCrPlnCtvtDtlSttsRsnCcTxt() /** { "tree" :"CarePlan.activity.detail.statusReason", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setStatusReason, setText"} **/
						));
Careplanobj.setDoNotPerform(HapiFHIRHelpers.createboolean(careplan.getCrPlnCtvtDtlDNtPrfrmBln() /** { "tree" :"CarePlan.activity.detail.doNotPerform", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setDoNotPerform"} **/
						));
Careplanobj.setScheduledTiming(HapiFHIRHelpers.createTiming(careplan.getCrPlnCtvtDtlSchdldTmngTmngCdCcCSstm() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setCode, addCoding, setSystem"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngCdCcCVrsn() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setCode, addCoding, setVersion"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngCdCcCCde() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setCode, addCoding, setCode"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngCdCcCDsplay() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setCode, addCoding, setDisplay"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngCdCcCSrSlctd() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setCode, addCoding, setUserSelected"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngCdCcTxt() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setCode, setText"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngVnt() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, addEvent"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngRptDrtnnt() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setRepeat, setDurationUnit"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngRptPrdnt() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setRepeat, setPeriodUnit"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngRptDfWk() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setRepeat, addDayOfWeek"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngRptWhn() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setRepeat, addWhen"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngRptDrtn() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setRepeat, setDuration"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngRptDrtnMx() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setRepeat, setDurationMax"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngRptPrd() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setRepeat, setPeriod"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngRptPrdMx() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setRepeat, setPeriodMax"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngRptBndsDrtn() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, Element, Duration", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setRepeat, setBoundsDuration"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngRptBndsPrd() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, Element, Period", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setRepeat, setBoundsPeriod"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngRptCnt() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setRepeat, setCount"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngRptCntMx() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setRepeat, setCountMax"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngRptFrqncy() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setRepeat, setFrequency"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngRptFrqncMx() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setRepeat, setFrequencyMax"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngRptBndsRnge() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, Element, Range", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setRepeat, setBoundsRange"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngRptTmfDay() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, Element, time", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setRepeat, addTimeOfDay"} **/
						, careplan.getCrPlnCtvtDtlSchdldTmngTmngRptFfst() /** { "tree" :"CarePlan.activity.detail.scheduledTiming", "datatype" : "Timing, Element, unsignedInt", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledTiming, setRepeat, setOffset"} **/
						));
Careplanobj.setScheduledPeriod(HapiFHIRHelpers.createPeriod(careplan.getCrPlnCtvtDtlSchdldPrdPrdStrt() /** { "tree" :"CarePlan.activity.detail.scheduledPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledPeriod, setStart"} **/
						, careplan.getCrPlnCtvtDtlSchdldPrdPrdNd() /** { "tree" :"CarePlan.activity.detail.scheduledPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledPeriod, setEnd"} **/
						));
Careplanobj.setScheduledString(HapiFHIRHelpers.createstring(careplan.getCrPlnCtvtDtlSchdldStrngStrng() /** { "tree" :"CarePlan.activity.detail.scheduledString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setScheduledString"} **/
						));
Careplanobj.setLocation(HapiFHIRHelpers.createReference(careplan.getCrPlnCtvtDtlLctnRfrnce() /** { "tree" :"CarePlan.activity.detail.location", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setLocation"} **/
						));
Careplanobj.addPerformer(HapiFHIRHelpers.createReference(careplan.getCrPlnCtvtDtlPrfrmrRfrnce() /** { "tree" :"CarePlan.activity.detail.performer", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "addPerformer"} **/
						));
Careplanobj.setProductCodeableconcept(HapiFHIRHelpers.createCodeableConcept(careplan.getCrPlnCtvtDtlPrdctCdblcncptCcCdngCSstm() /** { "tree" :"CarePlan.activity.detail.productCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setProductCodeableconcept, addCoding, setSystem"} **/
						, careplan.getCrPlnCtvtDtlPrdctCdblcncptCcCdngCVrsn() /** { "tree" :"CarePlan.activity.detail.productCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setProductCodeableconcept, addCoding, setVersion"} **/
						, careplan.getCrPlnCtvtDtlPrdctCdblcncptCcCdngCCde() /** { "tree" :"CarePlan.activity.detail.productCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setProductCodeableconcept, addCoding, setCode"} **/
						, careplan.getCrPlnCtvtDtlPrdctCdblcncptCcCdngCDsplay() /** { "tree" :"CarePlan.activity.detail.productCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setProductCodeableconcept, addCoding, setDisplay"} **/
						, careplan.getCrPlnCtvtDtlPrdctCdblcncptCcCdngCSrSlctd() /** { "tree" :"CarePlan.activity.detail.productCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setProductCodeableconcept, addCoding, setUserSelected"} **/
						, careplan.getCrPlnCtvtDtlPrdctCdblcncptCcTxt() /** { "tree" :"CarePlan.activity.detail.productCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setProductCodeableconcept, setText"} **/
						));
Careplanobj.setProductReference(medication | substance)(HapiFHIRHelpers.createReference(careplan.getCrPlnCtvtDtlPrdctRfrncRfrnce() /** { "tree" :"CarePlan.activity.detail.productReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setProductReference(medication | substance)"} **/
						));
Careplanobj.setDailyAmount(HapiFHIRHelpers.createSimpleQuantity(careplan.getCrPlnCtvtDtlDlmntSmplQntty() /** { "tree" :"CarePlan.activity.detail.dailyAmount", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setDailyAmount"} **/
						));
Careplanobj.setQuantity(HapiFHIRHelpers.createSimpleQuantity(careplan.getCrPlnCtvtDtlQnttSmplQntty() /** { "tree" :"CarePlan.activity.detail.quantity", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setQuantity"} **/
						));
Careplanobj.setDescription(HapiFHIRHelpers.createstring(careplan.getCrPlnCtvtDtlDscrptnStrng() /** { "tree" :"CarePlan.activity.detail.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addActivity", "setDetail"] , "methodName" : "setDescription"} **/
						));
Careplanobj.addNote(HapiFHIRHelpers.createAnnotation(careplan.getCarePlanNoteAnnotationTime() /** { "tree" :"CarePlan.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, careplan.getCarePlanNoteAnnotationText() /** { "tree" :"CarePlan.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, careplan.getCrPlnNtNnttnThrRfrnce() /** { "tree" :"CarePlan.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, careplan.getCrPlnNtNnttnThrStrng() /** { "tree" :"CarePlan.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
		));
	}
}
