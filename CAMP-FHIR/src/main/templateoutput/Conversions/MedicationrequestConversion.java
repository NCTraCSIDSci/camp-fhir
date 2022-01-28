package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Medicationrequest.
 * @see .Medicationrequest
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class MedicationrequestConversion 
{
	public Patient Medicationrequests(main.templateoutput.Model.Medicationrequest medicationrequest) 
	{
			Patient  Medicationrequestobj = new Patient(); 

						Medicationrequestobj.addIdentifier(HapiFHIRHelpers.createIdentifier(medicationrequest.getMdRqstDntfrDntfrSe() /** { "tree" :"MedicationRequest.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, medicationrequest.getMdRqstDntfrDntfrTpCcCSstm() /** { "tree" :"MedicationRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, medicationrequest.getMdRqstDntfrDntfrTpCcCVrsn() /** { "tree" :"MedicationRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, medicationrequest.getMdRqstDntfrDntfrTpCcCCde() /** { "tree" :"MedicationRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, medicationrequest.getMdRqstDntfrDntfrTpCcCDsplay() /** { "tree" :"MedicationRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, medicationrequest.getMdRqstDntfrDntfrTpCcCSrSlctd() /** { "tree" :"MedicationRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, medicationrequest.getMdRqstDntfrDntfrTpCcTxt() /** { "tree" :"MedicationRequest.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, medicationrequest.getMdRqstDntfrDntfrPrdPrdStrt() /** { "tree" :"MedicationRequest.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, medicationrequest.getMdRqstDntfrDntfrPrdPrdNd() /** { "tree" :"MedicationRequest.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, medicationrequest.getMdRqstDntfrDntfrSsgnr() /** { "tree" :"MedicationRequest.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, medicationrequest.getMdRqstDntfrDntfrVlue() /** { "tree" :"MedicationRequest.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, medicationrequest.getMdRqstDntfrDntfrSstm() /** { "tree" :"MedicationRequest.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Medicationrequestobj.setStatus(HapiFHIRHelpers.createcode(medicationrequest.getMedRequestStatusCode() /** { "tree" :"MedicationRequest.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Medicationrequestobj.setStatusReason(HapiFHIRHelpers.createCodeableConcept(medicationrequest.getMdRqstSttsRsnCcCdngCSstm() /** { "tree" :"MedicationRequest.statusReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setSystem"} **/
						, medicationrequest.getMdRqstSttsRsnCcCdngCVrsn() /** { "tree" :"MedicationRequest.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setVersion"} **/
						, medicationrequest.getMdRqstSttsRsnCcCdngCCde() /** { "tree" :"MedicationRequest.statusReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setCode"} **/
						, medicationrequest.getMdRqstSttsRsnCcCdngCDsplay() /** { "tree" :"MedicationRequest.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setDisplay"} **/
						, medicationrequest.getMdRqstSttsRsnCcCdngCSrSlctd() /** { "tree" :"MedicationRequest.statusReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setUserSelected"} **/
						, medicationrequest.getMedRequestStatusReasonCcText() /** { "tree" :"MedicationRequest.statusReason", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, setText"} **/
						));
Medicationrequestobj.setIntent(HapiFHIRHelpers.createcode(medicationrequest.getMedRequestIntentCode() /** { "tree" :"MedicationRequest.intent", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setIntent"} **/
						));
Medicationrequestobj.addCategory(HapiFHIRHelpers.createCodeableConcept(medicationrequest.getMdRqstCtgrCcCdngCSstm() /** { "tree" :"MedicationRequest.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setSystem"} **/
						, medicationrequest.getMdRqstCtgrCcCdngCVrsn() /** { "tree" :"MedicationRequest.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setVersion"} **/
						, medicationrequest.getMdRqstCtgrCcCdngCCde() /** { "tree" :"MedicationRequest.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setCode"} **/
						, medicationrequest.getMdRqstCtgrCcCdngCDsplay() /** { "tree" :"MedicationRequest.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setDisplay"} **/
						, medicationrequest.getMdRqstCtgrCcCdngCSrSlctd() /** { "tree" :"MedicationRequest.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setUserSelected"} **/
						, medicationrequest.getMedRequestCategoryCcText() /** { "tree" :"MedicationRequest.category", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, setText"} **/
						));
Medicationrequestobj.setPriority(HapiFHIRHelpers.createcode(medicationrequest.getMedRequestPriorityCode() /** { "tree" :"MedicationRequest.priority", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority"} **/
						));
Medicationrequestobj.setDoNotPerform(HapiFHIRHelpers.createboolean(medicationrequest.getMedRequestDoNotPerformBoolean() /** { "tree" :"MedicationRequest.doNotPerform", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDoNotPerform"} **/
						));
Medicationrequestobj.setReported(HapiFHIRHelpers.createbooleantype(medicationrequest.getMedRequestReportedBooleanBoolean() /** { "tree" :"MedicationRequest.reportedBoolean", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReportedBoolean"} **/
						));
Medicationrequestobj.setReportedReference(patient | practitioner | practitionerrole | relatedperson | organization)(HapiFHIRHelpers.createReference(medicationrequest.getMdRqstRprtdRfrncRfrnce() /** { "tree" :"MedicationRequest.reportedReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReportedReference(patient | practitioner | practitionerrole | relatedperson | organization)"} **/
						));
Medicationrequestobj.setMedicationCodeableconcept(HapiFHIRHelpers.createCodeableConcept(medicationrequest.getMdRqstMdCdblcncptCcCdngCSstm() /** { "tree" :"MedicationRequest.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setSystem"} **/
						, medicationrequest.getMdRqstMdCdblcncptCcCdngCVrsn() /** { "tree" :"MedicationRequest.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setVersion"} **/
						, medicationrequest.getMdRqstMdCdblcncptCcCdngCCde() /** { "tree" :"MedicationRequest.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setCode"} **/
						, medicationrequest.getMdRqstMdCdblcncptCcCdngCDsplay() /** { "tree" :"MedicationRequest.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setDisplay"} **/
						, medicationrequest.getMdRqstMdCdblcncptCcCdngCSrSlctd() /** { "tree" :"MedicationRequest.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setUserSelected"} **/
						, medicationrequest.getMdRqstMdCdblcncptCcTxt() /** { "tree" :"MedicationRequest.medicationCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, setText"} **/
						));
Medicationrequestobj.setMedicationReference(medication)(HapiFHIRHelpers.createReference(medicationrequest.getMedRequestMedReferenceReference() /** { "tree" :"MedicationRequest.medicationReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationReference(medication)"} **/
						));
Medicationrequestobj.setSubject(HapiFHIRHelpers.createReference(medicationrequest.getMedRequestSubjectReference() /** { "tree" :"MedicationRequest.subject", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Medicationrequestobj.setEncounter(HapiFHIRHelpers.createReference(medicationrequest.getMedRequestEncounterReference() /** { "tree" :"MedicationRequest.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Medicationrequestobj.addSupportingInformation(HapiFHIRHelpers.createReference(medicationrequest.getMdRqstSpprtngnfrmtnRfrnce() /** { "tree" :"MedicationRequest.supportingInformation", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSupportingInformation"} **/
						));
Medicationrequestobj.setAuthoredOn(HapiFHIRHelpers.createdateTime(medicationrequest.getMedRequestAuthoredOnDateTime() /** { "tree" :"MedicationRequest.authoredOn", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAuthoredOn"} **/
						));
Medicationrequestobj.setRequester(HapiFHIRHelpers.createReference(medicationrequest.getMedRequestRequesterReference() /** { "tree" :"MedicationRequest.requester", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequester"} **/
						));
Medicationrequestobj.setPerformer(HapiFHIRHelpers.createReference(medicationrequest.getMedRequestPerformerReference() /** { "tree" :"MedicationRequest.performer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformer"} **/
						));
Medicationrequestobj.setPerformerType(HapiFHIRHelpers.createCodeableConcept(medicationrequest.getMdRqstPrfrmrTpCcCdngCSstm() /** { "tree" :"MedicationRequest.performerType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformerType, addCoding, setSystem"} **/
						, medicationrequest.getMdRqstPrfrmrTpCcCdngCVrsn() /** { "tree" :"MedicationRequest.performerType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformerType, addCoding, setVersion"} **/
						, medicationrequest.getMdRqstPrfrmrTpCcCdngCCde() /** { "tree" :"MedicationRequest.performerType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformerType, addCoding, setCode"} **/
						, medicationrequest.getMdRqstPrfrmrTpCcCdngCDsplay() /** { "tree" :"MedicationRequest.performerType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformerType, addCoding, setDisplay"} **/
						, medicationrequest.getMdRqstPrfrmrTpCcCdngCSrSlctd() /** { "tree" :"MedicationRequest.performerType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformerType, addCoding, setUserSelected"} **/
						, medicationrequest.getMedRequestPerformerTypeCcText() /** { "tree" :"MedicationRequest.performerType", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformerType, setText"} **/
						));
Medicationrequestobj.setRecorder(HapiFHIRHelpers.createReference(medicationrequest.getMedRequestRecorderReference() /** { "tree" :"MedicationRequest.recorder", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRecorder"} **/
						));
Medicationrequestobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(medicationrequest.getMdRqstRsnCdCcCdngCSstm() /** { "tree" :"MedicationRequest.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, medicationrequest.getMdRqstRsnCdCcCdngCVrsn() /** { "tree" :"MedicationRequest.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, medicationrequest.getMdRqstRsnCdCcCdngCCde() /** { "tree" :"MedicationRequest.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, medicationrequest.getMdRqstRsnCdCcCdngCDsplay() /** { "tree" :"MedicationRequest.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, medicationrequest.getMdRqstRsnCdCcCdngCSrSlctd() /** { "tree" :"MedicationRequest.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, medicationrequest.getMedRequestReasonCodeCcText() /** { "tree" :"MedicationRequest.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Medicationrequestobj.addReasonReference(HapiFHIRHelpers.createReference(medicationrequest.getMdRqstRsnRfrncRfrnce() /** { "tree" :"MedicationRequest.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonReference"} **/
						));
Medicationrequestobj.addInstantiatesCanonical(HapiFHIRHelpers.createcanonical(medicationrequest.getMdRqstNstnttsCnnclCnncl() /** { "tree" :"MedicationRequest.instantiatesCanonical", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInstantiatesCanonical"} **/
						));
Medicationrequestobj.addInstantiatesUri(HapiFHIRHelpers.createuri(medicationrequest.getMedRequestInstantiatesUriUri() /** { "tree" :"MedicationRequest.instantiatesUri", "datatype" : "uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInstantiatesUri"} **/
						));
Medicationrequestobj.addBasedOn(HapiFHIRHelpers.createReference(medicationrequest.getMedRequestBasedOnReference() /** { "tree" :"MedicationRequest.basedOn", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasedOn"} **/
						));
Medicationrequestobj.setGroupIdentifier(HapiFHIRHelpers.createIdentifier(medicationrequest.getMdRqstGrpdntfrDntfrSe() /** { "tree" :"MedicationRequest.groupIdentifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setUse"} **/
						, medicationrequest.getMdRqstGrpdntfrDntfrTpCcCSstm() /** { "tree" :"MedicationRequest.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setSystem"} **/
						, medicationrequest.getMdRqstGrpdntfrDntfrTpCcCVrsn() /** { "tree" :"MedicationRequest.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setVersion"} **/
						, medicationrequest.getMdRqstGrpdntfrDntfrTpCcCCde() /** { "tree" :"MedicationRequest.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setCode"} **/
						, medicationrequest.getMdRqstGrpdntfrDntfrTpCcCDsplay() /** { "tree" :"MedicationRequest.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setDisplay"} **/
						, medicationrequest.getMdRqstGrpdntfrDntfrTpCcCSrSlctd() /** { "tree" :"MedicationRequest.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setUserSelected"} **/
						, medicationrequest.getMdRqstGrpdntfrDntfrTpCcTxt() /** { "tree" :"MedicationRequest.groupIdentifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, setText"} **/
						, medicationrequest.getMdRqstGrpdntfrDntfrPrdPrdStrt() /** { "tree" :"MedicationRequest.groupIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setPeriod, setStart"} **/
						, medicationrequest.getMdRqstGrpdntfrDntfrPrdPrdNd() /** { "tree" :"MedicationRequest.groupIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setPeriod, setEnd"} **/
						, medicationrequest.getMdRqstGrpdntfrDntfrSsgnr() /** { "tree" :"MedicationRequest.groupIdentifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setAssigner"} **/
						, medicationrequest.getMdRqstGrpdntfrDntfrVlue() /** { "tree" :"MedicationRequest.groupIdentifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setValue"} **/
						, medicationrequest.getMdRqstGrpdntfrDntfrSstm() /** { "tree" :"MedicationRequest.groupIdentifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setSystem"} **/
						));
Medicationrequestobj.setCourseOfTherapyType(HapiFHIRHelpers.createCodeableConcept(medicationrequest.getMdRqstCrsfThrpTpCcCdngCSstm() /** { "tree" :"MedicationRequest.courseOfTherapyType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCourseOfTherapyType, addCoding, setSystem"} **/
						, medicationrequest.getMdRqstCrsfThrpTpCcCdngCVrsn() /** { "tree" :"MedicationRequest.courseOfTherapyType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCourseOfTherapyType, addCoding, setVersion"} **/
						, medicationrequest.getMdRqstCrsfThrpTpCcCdngCCde() /** { "tree" :"MedicationRequest.courseOfTherapyType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCourseOfTherapyType, addCoding, setCode"} **/
						, medicationrequest.getMdRqstCrsfThrpTpCcCdngCDsplay() /** { "tree" :"MedicationRequest.courseOfTherapyType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCourseOfTherapyType, addCoding, setDisplay"} **/
						, medicationrequest.getMdRqstCrsfThrpTpCcCdngCSrSlctd() /** { "tree" :"MedicationRequest.courseOfTherapyType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCourseOfTherapyType, addCoding, setUserSelected"} **/
						, medicationrequest.getMdRqstCrsfThrpTpCcTxt() /** { "tree" :"MedicationRequest.courseOfTherapyType", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCourseOfTherapyType, setText"} **/
						));
Medicationrequestobj.addInsurance(HapiFHIRHelpers.createReference(medicationrequest.getMedRequestInsuranceReference() /** { "tree" :"MedicationRequest.insurance", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInsurance"} **/
						));
Medicationrequestobj.addNote(HapiFHIRHelpers.createAnnotation(medicationrequest.getMedRequestNoteAnnotationTime() /** { "tree" :"MedicationRequest.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, medicationrequest.getMedRequestNoteAnnotationText() /** { "tree" :"MedicationRequest.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, medicationrequest.getMdRqstNtNnttnThrRfrnce() /** { "tree" :"MedicationRequest.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, medicationrequest.getMdRqstNtNnttnThrStrng() /** { "tree" :"MedicationRequest.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Medicationrequestobj.addDosageInstruction(HapiFHIRHelpers.createDosage(medicationrequest.getMdRqstDsgnstrctnDsge() /** { "tree" :"MedicationRequest.dosageInstruction", "datatype" : "Dosage", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDosageInstruction"} **/
						));
Medicationrequestobj.setQuantity(HapiFHIRHelpers.createSimpleQuantity(medicationrequest.getMdRqstDspnsRqstNtlFllQnttSmplQntty() /** { "tree" :"MedicationRequest.dispenseRequest.initialFill.quantity", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["setDispenseRequest", "setInitialFill"] , "methodName" : "setQuantity"} **/
						));
Medicationrequestobj.setDuration(HapiFHIRHelpers.createDuration(medicationrequest.getMdRqstDspnsRqstNtlFllDrtnDrtn() /** { "tree" :"MedicationRequest.dispenseRequest.initialFill.duration", "datatype" : "Duration", "cardinality" : "ZeroOne", "elementtree" : ["setDispenseRequest", "setInitialFill"] , "methodName" : "setDuration"} **/
						));
Medicationrequestobj.setDispenseInterval(HapiFHIRHelpers.createDuration(medicationrequest.getMdRqstDspnsRqstDspnsntrvlDrtn() /** { "tree" :"MedicationRequest.dispenseRequest.dispenseInterval", "datatype" : "Duration", "cardinality" : "ZeroOne", "elementtree" : ["setDispenseRequest", "setInitialFill"] , "methodName" : "setDispenseInterval"} **/
						));
Medicationrequestobj.setValidityPeriod(HapiFHIRHelpers.createPeriod(medicationrequest.getMdRqstDspnsRqstVldtPrdPrdStrt() /** { "tree" :"MedicationRequest.dispenseRequest.validityPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setDispenseRequest", "setInitialFill"] , "methodName" : "setValidityPeriod, setStart"} **/
						, medicationrequest.getMdRqstDspnsRqstVldtPrdPrdNd() /** { "tree" :"MedicationRequest.dispenseRequest.validityPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setDispenseRequest", "setInitialFill"] , "methodName" : "setValidityPeriod, setEnd"} **/
						));
Medicationrequestobj.setNumberOfRepeatsAllowed(HapiFHIRHelpers.createunsignedInt(medicationrequest.getMdRqstDspnsRqstNmbrfRptsllwdNsgndnt() /** { "tree" :"MedicationRequest.dispenseRequest.numberOfRepeatsAllowed", "datatype" : "unsignedInt", "cardinality" : "ZeroOne", "elementtree" : ["setDispenseRequest", "setInitialFill"] , "methodName" : "setNumberOfRepeatsAllowed"} **/
						));
Medicationrequestobj.setQuantity(HapiFHIRHelpers.createSimpleQuantity(medicationrequest.getMdRqstDspnsRqstQnttSmplQntty() /** { "tree" :"MedicationRequest.dispenseRequest.quantity", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["setDispenseRequest", "setInitialFill"] , "methodName" : "setQuantity"} **/
						));
Medicationrequestobj.setExpectedSupplyDuration(HapiFHIRHelpers.createDuration(medicationrequest.getMdRqstDspnsRqstXpctdSpplDrtnDrtn() /** { "tree" :"MedicationRequest.dispenseRequest.expectedSupplyDuration", "datatype" : "Duration", "cardinality" : "ZeroOne", "elementtree" : ["setDispenseRequest", "setInitialFill"] , "methodName" : "setExpectedSupplyDuration"} **/
						));
Medicationrequestobj.setPerformer(HapiFHIRHelpers.createReference(medicationrequest.getMdRqstDspnsRqstPrfrmrRfrnce() /** { "tree" :"MedicationRequest.dispenseRequest.performer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["setDispenseRequest", "setInitialFill"] , "methodName" : "setPerformer"} **/
						));
Medicationrequestobj.setAllowed(HapiFHIRHelpers.createbooleantype(medicationrequest.getMdRqstSbstttnLlwdBlnBln() /** { "tree" :"MedicationRequest.substitution.allowedBoolean", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["setSubstitution"] , "methodName" : "setAllowedBoolean"} **/
						));
Medicationrequestobj.setAllowedCodeableconcept(HapiFHIRHelpers.createCodeableConcept(medicationrequest.getMdRqstSbstttnLlwdCdblcncptCcCdngCSstm() /** { "tree" :"MedicationRequest.substitution.allowedCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["setSubstitution"] , "methodName" : "setAllowedCodeableconcept, addCoding, setSystem"} **/
						, medicationrequest.getMdRqstSbstttnLlwdCdblcncptCcCdngCVrsn() /** { "tree" :"MedicationRequest.substitution.allowedCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["setSubstitution"] , "methodName" : "setAllowedCodeableconcept, addCoding, setVersion"} **/
						, medicationrequest.getMdRqstSbstttnLlwdCdblcncptCcCdngCCde() /** { "tree" :"MedicationRequest.substitution.allowedCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["setSubstitution"] , "methodName" : "setAllowedCodeableconcept, addCoding, setCode"} **/
						, medicationrequest.getMdRqstSbstttnLlwdCdblcncptCcCdngCDsplay() /** { "tree" :"MedicationRequest.substitution.allowedCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["setSubstitution"] , "methodName" : "setAllowedCodeableconcept, addCoding, setDisplay"} **/
						, medicationrequest.getMdRqstSbstttnLlwdCdblcncptCcCdngCSrSlctd() /** { "tree" :"MedicationRequest.substitution.allowedCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["setSubstitution"] , "methodName" : "setAllowedCodeableconcept, addCoding, setUserSelected"} **/
						, medicationrequest.getMdRqstSbstttnLlwdCdblcncptCcTxt() /** { "tree" :"MedicationRequest.substitution.allowedCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["setSubstitution"] , "methodName" : "setAllowedCodeableconcept, setText"} **/
						));
Medicationrequestobj.setReason(HapiFHIRHelpers.createCodeableConcept(medicationrequest.getMdRqstSbstttnRsnCcCdngCSstm() /** { "tree" :"MedicationRequest.substitution.reason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setSubstitution"] , "methodName" : "setReason, addCoding, setSystem"} **/
						, medicationrequest.getMdRqstSbstttnRsnCcCdngCVrsn() /** { "tree" :"MedicationRequest.substitution.reason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setSubstitution"] , "methodName" : "setReason, addCoding, setVersion"} **/
						, medicationrequest.getMdRqstSbstttnRsnCcCdngCCde() /** { "tree" :"MedicationRequest.substitution.reason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setSubstitution"] , "methodName" : "setReason, addCoding, setCode"} **/
						, medicationrequest.getMdRqstSbstttnRsnCcCdngCDsplay() /** { "tree" :"MedicationRequest.substitution.reason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setSubstitution"] , "methodName" : "setReason, addCoding, setDisplay"} **/
						, medicationrequest.getMdRqstSbstttnRsnCcCdngCSrSlctd() /** { "tree" :"MedicationRequest.substitution.reason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setSubstitution"] , "methodName" : "setReason, addCoding, setUserSelected"} **/
						, medicationrequest.getMdRqstSbstttnRsnCcTxt() /** { "tree" :"MedicationRequest.substitution.reason", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setSubstitution"] , "methodName" : "setReason, setText"} **/
						));
Medicationrequestobj.setPriorPrescription(HapiFHIRHelpers.createReference(medicationrequest.getMdRqstPrrPrscrptnRfrnce() /** { "tree" :"MedicationRequest.priorPrescription", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriorPrescription"} **/
						));
Medicationrequestobj.addDetectedIssue(HapiFHIRHelpers.createReference(medicationrequest.getMedRequestDetectedIssueReference() /** { "tree" :"MedicationRequest.detectedIssue", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDetectedIssue"} **/
						));
Medicationrequestobj.addEventHistory(HapiFHIRHelpers.createReference(medicationrequest.getMedRequestEventHistoryReference() /** { "tree" :"MedicationRequest.eventHistory", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEventHistory"} **/
		));
	}
}
