package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Communication.
 * @see .Communication
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class CommunicationConversion 
{
	public Patient Communications(main.templateoutput.Model.Communication communication) 
	{
			Patient  Communicationobj = new Patient(); 

						Communicationobj.addIdentifier(HapiFHIRHelpers.createIdentifier(communication.getCmmnctnDntfrDntfrSe() /** { "tree" :"Communication.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, communication.getCmmnctnDntfrDntfrTpCcCSstm() /** { "tree" :"Communication.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, communication.getCmmnctnDntfrDntfrTpCcCVrsn() /** { "tree" :"Communication.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, communication.getCmmnctnDntfrDntfrTpCcCCde() /** { "tree" :"Communication.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, communication.getCmmnctnDntfrDntfrTpCcCDsplay() /** { "tree" :"Communication.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, communication.getCmmnctnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Communication.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, communication.getCmmnctnDntfrDntfrTpCcTxt() /** { "tree" :"Communication.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, communication.getCmmnctnDntfrDntfrPrdPrdStrt() /** { "tree" :"Communication.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, communication.getCmmnctnDntfrDntfrPrdPrdNd() /** { "tree" :"Communication.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, communication.getCmmnctnDntfrDntfrSsgnr() /** { "tree" :"Communication.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, communication.getCmmnctnDntfrDntfrVlue() /** { "tree" :"Communication.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, communication.getCmmnctnDntfrDntfrSstm() /** { "tree" :"Communication.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Communicationobj.addInstantiatesCanonical(HapiFHIRHelpers.createcanonical(communication.getCmmnctnNstnttsCnnclCnncl() /** { "tree" :"Communication.instantiatesCanonical", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInstantiatesCanonical"} **/
						));
Communicationobj.addInstantiatesUri(HapiFHIRHelpers.createuri(communication.getCommunicationInstantiatesUriUri() /** { "tree" :"Communication.instantiatesUri", "datatype" : "uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInstantiatesUri"} **/
						));
Communicationobj.addBasedOn(HapiFHIRHelpers.createReference(communication.getCommunicationBasedOnReference() /** { "tree" :"Communication.basedOn", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasedOn"} **/
						));
Communicationobj.addPartOf(HapiFHIRHelpers.createReference(communication.getCommunicationPartOfReference() /** { "tree" :"Communication.partOf", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPartOf"} **/
						));
Communicationobj.addInResponseTo(HapiFHIRHelpers.createReference(communication.getCmmnctnNRspnsTRfrnce() /** { "tree" :"Communication.inResponseTo", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInResponseTo"} **/
						));
Communicationobj.setStatus(HapiFHIRHelpers.createcode(communication.getCommunicationStatusCode() /** { "tree" :"Communication.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Communicationobj.setStatusReason(HapiFHIRHelpers.createCodeableConcept(communication.getCmmnctnSttsRsnCcCdngCSstm() /** { "tree" :"Communication.statusReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setSystem"} **/
						, communication.getCmmnctnSttsRsnCcCdngCVrsn() /** { "tree" :"Communication.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setVersion"} **/
						, communication.getCmmnctnSttsRsnCcCdngCCde() /** { "tree" :"Communication.statusReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setCode"} **/
						, communication.getCmmnctnSttsRsnCcCdngCDsplay() /** { "tree" :"Communication.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setDisplay"} **/
						, communication.getCmmnctnSttsRsnCcCdngCSrSlctd() /** { "tree" :"Communication.statusReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setUserSelected"} **/
						, communication.getCommunicationStatusReasonCcText() /** { "tree" :"Communication.statusReason", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, setText"} **/
						));
Communicationobj.addCategory(HapiFHIRHelpers.createCodeableConcept(communication.getCmmnctnCtgrCcCdngCSstm() /** { "tree" :"Communication.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setSystem"} **/
						, communication.getCmmnctnCtgrCcCdngCVrsn() /** { "tree" :"Communication.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setVersion"} **/
						, communication.getCmmnctnCtgrCcCdngCCde() /** { "tree" :"Communication.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setCode"} **/
						, communication.getCmmnctnCtgrCcCdngCDsplay() /** { "tree" :"Communication.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setDisplay"} **/
						, communication.getCmmnctnCtgrCcCdngCSrSlctd() /** { "tree" :"Communication.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setUserSelected"} **/
						, communication.getCommunicationCategoryCcText() /** { "tree" :"Communication.category", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, setText"} **/
						));
Communicationobj.setPriority(HapiFHIRHelpers.createcode(communication.getCommunicationPriorityCode() /** { "tree" :"Communication.priority", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority"} **/
						));
Communicationobj.addMedium(HapiFHIRHelpers.createCodeableConcept(communication.getCmmnctnMdmCcCdngCSstm() /** { "tree" :"Communication.medium", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addMedium, addCoding, setSystem"} **/
						, communication.getCmmnctnMdmCcCdngCVrsn() /** { "tree" :"Communication.medium", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addMedium, addCoding, setVersion"} **/
						, communication.getCmmnctnMdmCcCdngCCde() /** { "tree" :"Communication.medium", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addMedium, addCoding, setCode"} **/
						, communication.getCmmnctnMdmCcCdngCDsplay() /** { "tree" :"Communication.medium", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addMedium, addCoding, setDisplay"} **/
						, communication.getCmmnctnMdmCcCdngCSrSlctd() /** { "tree" :"Communication.medium", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addMedium, addCoding, setUserSelected"} **/
						, communication.getCommunicationMediumCcText() /** { "tree" :"Communication.medium", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addMedium, setText"} **/
						));
Communicationobj.setSubject(HapiFHIRHelpers.createReference(communication.getCommunicationSubjectReference() /** { "tree" :"Communication.subject", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Communicationobj.setTopic(HapiFHIRHelpers.createCodeableConcept(communication.getCmmnctnTpcCcCdngCSstm() /** { "tree" :"Communication.topic", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTopic, addCoding, setSystem"} **/
						, communication.getCmmnctnTpcCcCdngCVrsn() /** { "tree" :"Communication.topic", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTopic, addCoding, setVersion"} **/
						, communication.getCmmnctnTpcCcCdngCCde() /** { "tree" :"Communication.topic", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTopic, addCoding, setCode"} **/
						, communication.getCmmnctnTpcCcCdngCDsplay() /** { "tree" :"Communication.topic", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTopic, addCoding, setDisplay"} **/
						, communication.getCmmnctnTpcCcCdngCSrSlctd() /** { "tree" :"Communication.topic", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTopic, addCoding, setUserSelected"} **/
						, communication.getCommunicationTopicCcText() /** { "tree" :"Communication.topic", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTopic, setText"} **/
						));
Communicationobj.addAbout(HapiFHIRHelpers.createReference(communication.getCommunicationAboutReference() /** { "tree" :"Communication.about", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAbout"} **/
						));
Communicationobj.setEncounter(HapiFHIRHelpers.createReference(communication.getCommunicationEncounterReference() /** { "tree" :"Communication.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Communicationobj.setSent(HapiFHIRHelpers.createdateTime(communication.getCommunicationSentDateTime() /** { "tree" :"Communication.sent", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSent"} **/
						));
Communicationobj.setReceived(HapiFHIRHelpers.createdateTime(communication.getCommunicationReceivedDateTime() /** { "tree" :"Communication.received", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReceived"} **/
						));
Communicationobj.addRecipient(HapiFHIRHelpers.createReference(communication.getCommunicationRecipientReference() /** { "tree" :"Communication.recipient", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRecipient"} **/
						));
Communicationobj.setSender(HapiFHIRHelpers.createReference(communication.getCommunicationSenderReference() /** { "tree" :"Communication.sender", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSender"} **/
						));
Communicationobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(communication.getCmmnctnRsnCdCcCdngCSstm() /** { "tree" :"Communication.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, communication.getCmmnctnRsnCdCcCdngCVrsn() /** { "tree" :"Communication.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, communication.getCmmnctnRsnCdCcCdngCCde() /** { "tree" :"Communication.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, communication.getCmmnctnRsnCdCcCdngCDsplay() /** { "tree" :"Communication.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, communication.getCmmnctnRsnCdCcCdngCSrSlctd() /** { "tree" :"Communication.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, communication.getCommunicationReasonCodeCcText() /** { "tree" :"Communication.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Communicationobj.addReasonReference(HapiFHIRHelpers.createReference(communication.getCmmnctnRsnRfrncRfrnce() /** { "tree" :"Communication.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonReference"} **/
						));
Communicationobj.setContentString(HapiFHIRHelpers.createstring(communication.getCmmnctnPldCntntStrngStrng() /** { "tree" :"Communication.payload.contentString", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentString"} **/
						));
Communicationobj.setContentAttachment(HapiFHIRHelpers.createAttachment(communication.getCmmnctnPldCntntttchmntTtchmntDta() /** { "tree" :"Communication.payload.contentAttachment", "datatype" : "Attachment, base64Binary", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentAttachment, setData"} **/
						, communication.getCmmnctnPldCntntttchmntTtchmntHsh() /** { "tree" :"Communication.payload.contentAttachment", "datatype" : "Attachment, base64Binary", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentAttachment, setHash"} **/
						, communication.getCmmnctnPldCntntttchmntTtchmntCntntTpe() /** { "tree" :"Communication.payload.contentAttachment", "datatype" : "Attachment, code", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentAttachment, setContentType"} **/
						, communication.getCmmnctnPldCntntttchmntTtchmntLngge() /** { "tree" :"Communication.payload.contentAttachment", "datatype" : "Attachment, code", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentAttachment, setLanguage"} **/
						, communication.getCmmnctnPldCntntttchmntTtchmntCrtn() /** { "tree" :"Communication.payload.contentAttachment", "datatype" : "Attachment, dateTime", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentAttachment, setCreation"} **/
						, communication.getCmmnctnPldCntntttchmntTtchmntTtle() /** { "tree" :"Communication.payload.contentAttachment", "datatype" : "Attachment, string", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentAttachment, setTitle"} **/
						, communication.getCmmnctnPldCntntttchmntTtchmntSze() /** { "tree" :"Communication.payload.contentAttachment", "datatype" : "Attachment, unsignedInt", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentAttachment, setSize"} **/
						, communication.getCmmnctnPldCntntttchmntTtchmntRl() /** { "tree" :"Communication.payload.contentAttachment", "datatype" : "Attachment, url", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentAttachment, setUrl"} **/
						));
Communicationobj.setContentReference(any)(HapiFHIRHelpers.createReference(communication.getCmmnctnPldCntntRfrncRfrnce() /** { "tree" :"Communication.payload.contentReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentReference(any)"} **/
						));
Communicationobj.addNote(HapiFHIRHelpers.createAnnotation(communication.getCommunicationNoteAnnotationTime() /** { "tree" :"Communication.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, communication.getCommunicationNoteAnnotationText() /** { "tree" :"Communication.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, communication.getCmmnctnNtNnttnThrRfrnce() /** { "tree" :"Communication.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, communication.getCmmnctnNtNnttnThrStrng() /** { "tree" :"Communication.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
		));
	}
}
