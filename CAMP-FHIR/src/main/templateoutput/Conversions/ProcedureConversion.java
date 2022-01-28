package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Procedure.
 * @see .Procedure
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ProcedureConversion 
{
	public Patient Procedures(main.templateoutput.Model.Procedure procedure) 
	{
			Patient  Procedureobj = new Patient(); 

						Procedureobj.addIdentifier(HapiFHIRHelpers.createIdentifier(procedure.getPrcdrDntfrDntfrSe() /** { "tree" :"Procedure.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, procedure.getPrcdrDntfrDntfrTpCcCSstm() /** { "tree" :"Procedure.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, procedure.getPrcdrDntfrDntfrTpCcCVrsn() /** { "tree" :"Procedure.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, procedure.getPrcdrDntfrDntfrTpCcCCde() /** { "tree" :"Procedure.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, procedure.getPrcdrDntfrDntfrTpCcCDsplay() /** { "tree" :"Procedure.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, procedure.getPrcdrDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Procedure.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, procedure.getPrcdrDntfrDntfrTpCcTxt() /** { "tree" :"Procedure.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, procedure.getPrcdrDntfrDntfrPrdPrdStrt() /** { "tree" :"Procedure.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, procedure.getPrcdrDntfrDntfrPrdPrdNd() /** { "tree" :"Procedure.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, procedure.getPrcdrDntfrDntfrSsgnr() /** { "tree" :"Procedure.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, procedure.getPrcdrDntfrDntfrVlue() /** { "tree" :"Procedure.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, procedure.getPrcdrDntfrDntfrSstm() /** { "tree" :"Procedure.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Procedureobj.addInstantiatesCanonical(HapiFHIRHelpers.createcanonical(procedure.getPrcdrNstnttsCnnclCnncl() /** { "tree" :"Procedure.instantiatesCanonical", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInstantiatesCanonical"} **/
						));
Procedureobj.addInstantiatesUri(HapiFHIRHelpers.createuri(procedure.getProcedureInstantiatesUriUri() /** { "tree" :"Procedure.instantiatesUri", "datatype" : "uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInstantiatesUri"} **/
						));
Procedureobj.addBasedOn(HapiFHIRHelpers.createReference(procedure.getProcedureBasedOnReference() /** { "tree" :"Procedure.basedOn", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasedOn"} **/
						));
Procedureobj.addPartOf(HapiFHIRHelpers.createReference(procedure.getProcedurePartOfReference() /** { "tree" :"Procedure.partOf", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPartOf"} **/
						));
Procedureobj.setStatus(HapiFHIRHelpers.createcode(procedure.getProcedureStatusCode() /** { "tree" :"Procedure.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Procedureobj.setStatusReason(HapiFHIRHelpers.createCodeableConcept(procedure.getPrcdrSttsRsnCcCdngCSstm() /** { "tree" :"Procedure.statusReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setSystem"} **/
						, procedure.getPrcdrSttsRsnCcCdngCVrsn() /** { "tree" :"Procedure.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setVersion"} **/
						, procedure.getPrcdrSttsRsnCcCdngCCde() /** { "tree" :"Procedure.statusReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setCode"} **/
						, procedure.getPrcdrSttsRsnCcCdngCDsplay() /** { "tree" :"Procedure.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setDisplay"} **/
						, procedure.getPrcdrSttsRsnCcCdngCSrSlctd() /** { "tree" :"Procedure.statusReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setUserSelected"} **/
						, procedure.getProcedureStatusReasonCcText() /** { "tree" :"Procedure.statusReason", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, setText"} **/
						));
Procedureobj.setCategory(HapiFHIRHelpers.createCodeableConcept(procedure.getPrcdrCtgrCcCdngCSstm() /** { "tree" :"Procedure.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setSystem"} **/
						, procedure.getPrcdrCtgrCcCdngCVrsn() /** { "tree" :"Procedure.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setVersion"} **/
						, procedure.getPrcdrCtgrCcCdngCCde() /** { "tree" :"Procedure.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setCode"} **/
						, procedure.getPrcdrCtgrCcCdngCDsplay() /** { "tree" :"Procedure.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setDisplay"} **/
						, procedure.getPrcdrCtgrCcCdngCSrSlctd() /** { "tree" :"Procedure.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setUserSelected"} **/
						, procedure.getProcedureCategoryCcText() /** { "tree" :"Procedure.category", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, setText"} **/
						));
Procedureobj.setCode(HapiFHIRHelpers.createCodeableConcept(procedure.getProcedureCodeCcCodingCSystem() /** { "tree" :"Procedure.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, procedure.getProcedureCodeCcCodingCVersion() /** { "tree" :"Procedure.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, procedure.getProcedureCodeCcCodingCCode() /** { "tree" :"Procedure.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, procedure.getProcedureCodeCcCodingCDisplay() /** { "tree" :"Procedure.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, procedure.getPrcdrCdCcCdngCSrSlctd() /** { "tree" :"Procedure.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, procedure.getProcedureCodeCcText() /** { "tree" :"Procedure.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Procedureobj.setSubject(HapiFHIRHelpers.createReference(procedure.getProcedureSubjectReference() /** { "tree" :"Procedure.subject", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Procedureobj.setEncounter(HapiFHIRHelpers.createReference(procedure.getProcedureEncounterReference() /** { "tree" :"Procedure.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Procedureobj.setPerformed(HapiFHIRHelpers.createdateTimetype(procedure.getPrcdrPrfrmdDttmDtTme() /** { "tree" :"Procedure.performedDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformedDatetime"} **/
						));
Procedureobj.setPerformedPeriod(HapiFHIRHelpers.createPeriod(procedure.getPrcdrPrfrmdPrdPrdStrt() /** { "tree" :"Procedure.performedPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformedPeriod, setStart"} **/
						, procedure.getPrcdrPrfrmdPrdPrdNd() /** { "tree" :"Procedure.performedPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformedPeriod, setEnd"} **/
						));
Procedureobj.setPerformedString(HapiFHIRHelpers.createstring(procedure.getProcedurePerformedStringString() /** { "tree" :"Procedure.performedString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformedString"} **/
						));
Procedureobj.setPerformedAge(HapiFHIRHelpers.createAge(procedure.getProcedurePerformedAgeAge() /** { "tree" :"Procedure.performedAge", "datatype" : "Age", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformedAge"} **/
						));
Procedureobj.setPerformedRange(HapiFHIRHelpers.createRange(procedure.getProcedurePerformedRangeRangeLow() /** { "tree" :"Procedure.performedRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformedRange, setLow"} **/
						, procedure.getPrcdrPrfrmdRngRngHgh() /** { "tree" :"Procedure.performedRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformedRange, setHigh"} **/
						));
Procedureobj.setRecorder(HapiFHIRHelpers.createReference(procedure.getProcedureRecorderReference() /** { "tree" :"Procedure.recorder", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRecorder"} **/
						));
Procedureobj.setAsserter(HapiFHIRHelpers.createReference(procedure.getProcedureAsserterReference() /** { "tree" :"Procedure.asserter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAsserter"} **/
						));
Procedureobj.setFunction(HapiFHIRHelpers.createCodeableConcept(procedure.getPrcdrPrfrmrFnctnCcCdngCSstm() /** { "tree" :"Procedure.performer.function", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setSystem"} **/
						, procedure.getPrcdrPrfrmrFnctnCcCdngCVrsn() /** { "tree" :"Procedure.performer.function", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setVersion"} **/
						, procedure.getPrcdrPrfrmrFnctnCcCdngCCde() /** { "tree" :"Procedure.performer.function", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setCode"} **/
						, procedure.getPrcdrPrfrmrFnctnCcCdngCDsplay() /** { "tree" :"Procedure.performer.function", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setDisplay"} **/
						, procedure.getPrcdrPrfrmrFnctnCcCdngCSrSlctd() /** { "tree" :"Procedure.performer.function", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setUserSelected"} **/
						, procedure.getPrcdrPrfrmrFnctnCcTxt() /** { "tree" :"Procedure.performer.function", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, setText"} **/
						));
Procedureobj.setActor(HapiFHIRHelpers.createReference(procedure.getPrcdrPrfrmrCtrRfrnce() /** { "tree" :"Procedure.performer.actor", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addPerformer"] , "methodName" : "setActor"} **/
						));
Procedureobj.setOnBehalfOf(HapiFHIRHelpers.createReference(procedure.getPrcdrPrfrmrNBhlffRfrnce() /** { "tree" :"Procedure.performer.onBehalfOf", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setOnBehalfOf"} **/
						));
Procedureobj.setLocation(HapiFHIRHelpers.createReference(procedure.getProcedureLocationReference() /** { "tree" :"Procedure.location", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLocation"} **/
						));
Procedureobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(procedure.getPrcdrRsnCdCcCdngCSstm() /** { "tree" :"Procedure.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, procedure.getPrcdrRsnCdCcCdngCVrsn() /** { "tree" :"Procedure.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, procedure.getPrcdrRsnCdCcCdngCCde() /** { "tree" :"Procedure.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, procedure.getPrcdrRsnCdCcCdngCDsplay() /** { "tree" :"Procedure.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, procedure.getPrcdrRsnCdCcCdngCSrSlctd() /** { "tree" :"Procedure.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, procedure.getProcedureReasonCodeCcText() /** { "tree" :"Procedure.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Procedureobj.addReasonReference(HapiFHIRHelpers.createReference(procedure.getPrcdrRsnRfrncRfrnce() /** { "tree" :"Procedure.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonReference"} **/
						));
Procedureobj.addBodySite(HapiFHIRHelpers.createCodeableConcept(procedure.getPrcdrBdStCcCdngCSstm() /** { "tree" :"Procedure.bodySite", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodySite, addCoding, setSystem"} **/
						, procedure.getPrcdrBdStCcCdngCVrsn() /** { "tree" :"Procedure.bodySite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodySite, addCoding, setVersion"} **/
						, procedure.getPrcdrBdStCcCdngCCde() /** { "tree" :"Procedure.bodySite", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodySite, addCoding, setCode"} **/
						, procedure.getPrcdrBdStCcCdngCDsplay() /** { "tree" :"Procedure.bodySite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodySite, addCoding, setDisplay"} **/
						, procedure.getPrcdrBdStCcCdngCSrSlctd() /** { "tree" :"Procedure.bodySite", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodySite, addCoding, setUserSelected"} **/
						, procedure.getProcedureBodySiteCcText() /** { "tree" :"Procedure.bodySite", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodySite, setText"} **/
						));
Procedureobj.setOutcome(HapiFHIRHelpers.createCodeableConcept(procedure.getPrcdrTcmCcCdngCSstm() /** { "tree" :"Procedure.outcome", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOutcome, addCoding, setSystem"} **/
						, procedure.getPrcdrTcmCcCdngCVrsn() /** { "tree" :"Procedure.outcome", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOutcome, addCoding, setVersion"} **/
						, procedure.getProcedureOutcomeCcCodingCCode() /** { "tree" :"Procedure.outcome", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOutcome, addCoding, setCode"} **/
						, procedure.getPrcdrTcmCcCdngCDsplay() /** { "tree" :"Procedure.outcome", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOutcome, addCoding, setDisplay"} **/
						, procedure.getPrcdrTcmCcCdngCSrSlctd() /** { "tree" :"Procedure.outcome", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOutcome, addCoding, setUserSelected"} **/
						, procedure.getProcedureOutcomeCcText() /** { "tree" :"Procedure.outcome", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOutcome, setText"} **/
						));
Procedureobj.addReport(HapiFHIRHelpers.createReference(procedure.getProcedureReportReference() /** { "tree" :"Procedure.report", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReport"} **/
						));
Procedureobj.addComplication(HapiFHIRHelpers.createCodeableConcept(procedure.getPrcdrCmplctnCcCdngCSstm() /** { "tree" :"Procedure.complication", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComplication, addCoding, setSystem"} **/
						, procedure.getPrcdrCmplctnCcCdngCVrsn() /** { "tree" :"Procedure.complication", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComplication, addCoding, setVersion"} **/
						, procedure.getPrcdrCmplctnCcCdngCCde() /** { "tree" :"Procedure.complication", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComplication, addCoding, setCode"} **/
						, procedure.getPrcdrCmplctnCcCdngCDsplay() /** { "tree" :"Procedure.complication", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComplication, addCoding, setDisplay"} **/
						, procedure.getPrcdrCmplctnCcCdngCSrSlctd() /** { "tree" :"Procedure.complication", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComplication, addCoding, setUserSelected"} **/
						, procedure.getProcedureComplicationCcText() /** { "tree" :"Procedure.complication", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComplication, setText"} **/
						));
Procedureobj.addComplicationDetail(HapiFHIRHelpers.createReference(procedure.getPrcdrCmplctnDtlRfrnce() /** { "tree" :"Procedure.complicationDetail", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComplicationDetail"} **/
						));
Procedureobj.addFollowUp(HapiFHIRHelpers.createCodeableConcept(procedure.getPrcdrFllwpCcCdngCSstm() /** { "tree" :"Procedure.followUp", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addFollowUp, addCoding, setSystem"} **/
						, procedure.getPrcdrFllwpCcCdngCVrsn() /** { "tree" :"Procedure.followUp", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addFollowUp, addCoding, setVersion"} **/
						, procedure.getPrcdrFllwpCcCdngCCde() /** { "tree" :"Procedure.followUp", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addFollowUp, addCoding, setCode"} **/
						, procedure.getPrcdrFllwpCcCdngCDsplay() /** { "tree" :"Procedure.followUp", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addFollowUp, addCoding, setDisplay"} **/
						, procedure.getPrcdrFllwpCcCdngCSrSlctd() /** { "tree" :"Procedure.followUp", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addFollowUp, addCoding, setUserSelected"} **/
						, procedure.getProcedureFollowUpCcText() /** { "tree" :"Procedure.followUp", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addFollowUp, setText"} **/
						));
Procedureobj.addNote(HapiFHIRHelpers.createAnnotation(procedure.getProcedureNoteAnnotationTime() /** { "tree" :"Procedure.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, procedure.getProcedureNoteAnnotationText() /** { "tree" :"Procedure.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, procedure.getPrcdrNtNnttnThrRfrnce() /** { "tree" :"Procedure.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, procedure.getPrcdrNtNnttnThrStrng() /** { "tree" :"Procedure.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Procedureobj.setAction(HapiFHIRHelpers.createCodeableConcept(procedure.getPrcdrFclDvcCtnCcCdngCSstm() /** { "tree" :"Procedure.focalDevice.action", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addFocalDevice"] , "methodName" : "setAction, addCoding, setSystem"} **/
						, procedure.getPrcdrFclDvcCtnCcCdngCVrsn() /** { "tree" :"Procedure.focalDevice.action", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addFocalDevice"] , "methodName" : "setAction, addCoding, setVersion"} **/
						, procedure.getPrcdrFclDvcCtnCcCdngCCde() /** { "tree" :"Procedure.focalDevice.action", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addFocalDevice"] , "methodName" : "setAction, addCoding, setCode"} **/
						, procedure.getPrcdrFclDvcCtnCcCdngCDsplay() /** { "tree" :"Procedure.focalDevice.action", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addFocalDevice"] , "methodName" : "setAction, addCoding, setDisplay"} **/
						, procedure.getPrcdrFclDvcCtnCcCdngCSrSlctd() /** { "tree" :"Procedure.focalDevice.action", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addFocalDevice"] , "methodName" : "setAction, addCoding, setUserSelected"} **/
						, procedure.getPrcdrFclDvcCtnCcTxt() /** { "tree" :"Procedure.focalDevice.action", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addFocalDevice"] , "methodName" : "setAction, setText"} **/
						));
Procedureobj.setManipulated(HapiFHIRHelpers.createReference(procedure.getPrcdrFclDvcMnpltdRfrnce() /** { "tree" :"Procedure.focalDevice.manipulated", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addFocalDevice"] , "methodName" : "setManipulated"} **/
						));
Procedureobj.addUsedReference(HapiFHIRHelpers.createReference(procedure.getProcedureUsedReferenceReference() /** { "tree" :"Procedure.usedReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUsedReference"} **/
						));
Procedureobj.addUsedCode(HapiFHIRHelpers.createCodeableConcept(procedure.getPrcdrSdCdCcCdngCSstm() /** { "tree" :"Procedure.usedCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUsedCode, addCoding, setSystem"} **/
						, procedure.getPrcdrSdCdCcCdngCVrsn() /** { "tree" :"Procedure.usedCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUsedCode, addCoding, setVersion"} **/
						, procedure.getPrcdrSdCdCcCdngCCde() /** { "tree" :"Procedure.usedCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUsedCode, addCoding, setCode"} **/
						, procedure.getPrcdrSdCdCcCdngCDsplay() /** { "tree" :"Procedure.usedCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUsedCode, addCoding, setDisplay"} **/
						, procedure.getPrcdrSdCdCcCdngCSrSlctd() /** { "tree" :"Procedure.usedCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUsedCode, addCoding, setUserSelected"} **/
						, procedure.getProcedureUsedCodeCcText() /** { "tree" :"Procedure.usedCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUsedCode, setText"} **/
		));
	}
}
