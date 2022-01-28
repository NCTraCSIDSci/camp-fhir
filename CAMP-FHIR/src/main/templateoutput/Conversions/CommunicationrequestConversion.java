package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Communicationrequest.
 * @see .Communicationrequest
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class CommunicationrequestConversion 
{
	public Patient Communicationrequests(main.templateoutput.Model.Communicationrequest communicationrequest) 
	{
			Patient  Communicationrequestobj = new Patient(); 

						Communicationrequestobj.addIdentifier(HapiFHIRHelpers.createIdentifier(communicationrequest.getCmmnctnRqstDntfrDntfrSe() /** { "tree" :"CommunicationRequest.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, communicationrequest.getCmmnctnRqstDntfrDntfrTpCcCSstm() /** { "tree" :"CommunicationRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, communicationrequest.getCmmnctnRqstDntfrDntfrTpCcCVrsn() /** { "tree" :"CommunicationRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, communicationrequest.getCmmnctnRqstDntfrDntfrTpCcCCde() /** { "tree" :"CommunicationRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, communicationrequest.getCmmnctnRqstDntfrDntfrTpCcCDsplay() /** { "tree" :"CommunicationRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, communicationrequest.getCmmnctnRqstDntfrDntfrTpCcCSrSlctd() /** { "tree" :"CommunicationRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, communicationrequest.getCmmnctnRqstDntfrDntfrTpCcTxt() /** { "tree" :"CommunicationRequest.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, communicationrequest.getCmmnctnRqstDntfrDntfrPrdPrdStrt() /** { "tree" :"CommunicationRequest.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, communicationrequest.getCmmnctnRqstDntfrDntfrPrdPrdNd() /** { "tree" :"CommunicationRequest.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, communicationrequest.getCmmnctnRqstDntfrDntfrSsgnr() /** { "tree" :"CommunicationRequest.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, communicationrequest.getCmmnctnRqstDntfrDntfrVlue() /** { "tree" :"CommunicationRequest.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, communicationrequest.getCmmnctnRqstDntfrDntfrSstm() /** { "tree" :"CommunicationRequest.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Communicationrequestobj.addBasedOn(HapiFHIRHelpers.createReference(communicationrequest.getCmmnctnRqstBsdnRfrnce() /** { "tree" :"CommunicationRequest.basedOn", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasedOn"} **/
						));
Communicationrequestobj.addReplaces(HapiFHIRHelpers.createReference(communicationrequest.getCmmnctnRqstRplcsRfrnce() /** { "tree" :"CommunicationRequest.replaces", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReplaces"} **/
						));
Communicationrequestobj.setGroupIdentifier(HapiFHIRHelpers.createIdentifier(communicationrequest.getCmmnctnRqstGrpdntfrDntfrSe() /** { "tree" :"CommunicationRequest.groupIdentifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setUse"} **/
						, communicationrequest.getCmmnctnRqstGrpdntfrDntfrTpCcCSstm() /** { "tree" :"CommunicationRequest.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setSystem"} **/
						, communicationrequest.getCmmnctnRqstGrpdntfrDntfrTpCcCVrsn() /** { "tree" :"CommunicationRequest.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setVersion"} **/
						, communicationrequest.getCmmnctnRqstGrpdntfrDntfrTpCcCCde() /** { "tree" :"CommunicationRequest.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setCode"} **/
						, communicationrequest.getCmmnctnRqstGrpdntfrDntfrTpCcCDsplay() /** { "tree" :"CommunicationRequest.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setDisplay"} **/
						, communicationrequest.getCmmnctnRqstGrpdntfrDntfrTpCcCSrSlctd() /** { "tree" :"CommunicationRequest.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setUserSelected"} **/
						, communicationrequest.getCmmnctnRqstGrpdntfrDntfrTpCcTxt() /** { "tree" :"CommunicationRequest.groupIdentifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, setText"} **/
						, communicationrequest.getCmmnctnRqstGrpdntfrDntfrPrdPrdStrt() /** { "tree" :"CommunicationRequest.groupIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setPeriod, setStart"} **/
						, communicationrequest.getCmmnctnRqstGrpdntfrDntfrPrdPrdNd() /** { "tree" :"CommunicationRequest.groupIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setPeriod, setEnd"} **/
						, communicationrequest.getCmmnctnRqstGrpdntfrDntfrSsgnr() /** { "tree" :"CommunicationRequest.groupIdentifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setAssigner"} **/
						, communicationrequest.getCmmnctnRqstGrpdntfrDntfrVlue() /** { "tree" :"CommunicationRequest.groupIdentifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setValue"} **/
						, communicationrequest.getCmmnctnRqstGrpdntfrDntfrSstm() /** { "tree" :"CommunicationRequest.groupIdentifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setSystem"} **/
						));
Communicationrequestobj.setStatus(HapiFHIRHelpers.createcode(communicationrequest.getCommunicationRequestStatusCode() /** { "tree" :"CommunicationRequest.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Communicationrequestobj.setStatusReason(HapiFHIRHelpers.createCodeableConcept(communicationrequest.getCmmnctnRqstSttsRsnCcCdngCSstm() /** { "tree" :"CommunicationRequest.statusReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setSystem"} **/
						, communicationrequest.getCmmnctnRqstSttsRsnCcCdngCVrsn() /** { "tree" :"CommunicationRequest.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setVersion"} **/
						, communicationrequest.getCmmnctnRqstSttsRsnCcCdngCCde() /** { "tree" :"CommunicationRequest.statusReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setCode"} **/
						, communicationrequest.getCmmnctnRqstSttsRsnCcCdngCDsplay() /** { "tree" :"CommunicationRequest.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setDisplay"} **/
						, communicationrequest.getCmmnctnRqstSttsRsnCcCdngCSrSlctd() /** { "tree" :"CommunicationRequest.statusReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setUserSelected"} **/
						, communicationrequest.getCmmnctnRqstSttsRsnCcTxt() /** { "tree" :"CommunicationRequest.statusReason", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, setText"} **/
						));
Communicationrequestobj.addCategory(HapiFHIRHelpers.createCodeableConcept(communicationrequest.getCmmnctnRqstCtgrCcCdngCSstm() /** { "tree" :"CommunicationRequest.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setSystem"} **/
						, communicationrequest.getCmmnctnRqstCtgrCcCdngCVrsn() /** { "tree" :"CommunicationRequest.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setVersion"} **/
						, communicationrequest.getCmmnctnRqstCtgrCcCdngCCde() /** { "tree" :"CommunicationRequest.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setCode"} **/
						, communicationrequest.getCmmnctnRqstCtgrCcCdngCDsplay() /** { "tree" :"CommunicationRequest.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setDisplay"} **/
						, communicationrequest.getCmmnctnRqstCtgrCcCdngCSrSlctd() /** { "tree" :"CommunicationRequest.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setUserSelected"} **/
						, communicationrequest.getCmmnctnRqstCtgrCcTxt() /** { "tree" :"CommunicationRequest.category", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, setText"} **/
						));
Communicationrequestobj.setPriority(HapiFHIRHelpers.createcode(communicationrequest.getCommunicationRequestPriorityCode() /** { "tree" :"CommunicationRequest.priority", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority"} **/
						));
Communicationrequestobj.setDoNotPerform(HapiFHIRHelpers.createboolean(communicationrequest.getCmmnctnRqstDNtPrfrmBln() /** { "tree" :"CommunicationRequest.doNotPerform", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDoNotPerform"} **/
						));
Communicationrequestobj.addMedium(HapiFHIRHelpers.createCodeableConcept(communicationrequest.getCmmnctnRqstMdmCcCdngCSstm() /** { "tree" :"CommunicationRequest.medium", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addMedium, addCoding, setSystem"} **/
						, communicationrequest.getCmmnctnRqstMdmCcCdngCVrsn() /** { "tree" :"CommunicationRequest.medium", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addMedium, addCoding, setVersion"} **/
						, communicationrequest.getCmmnctnRqstMdmCcCdngCCde() /** { "tree" :"CommunicationRequest.medium", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addMedium, addCoding, setCode"} **/
						, communicationrequest.getCmmnctnRqstMdmCcCdngCDsplay() /** { "tree" :"CommunicationRequest.medium", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addMedium, addCoding, setDisplay"} **/
						, communicationrequest.getCmmnctnRqstMdmCcCdngCSrSlctd() /** { "tree" :"CommunicationRequest.medium", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addMedium, addCoding, setUserSelected"} **/
						, communicationrequest.getCmmnctnRqstMdmCcTxt() /** { "tree" :"CommunicationRequest.medium", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addMedium, setText"} **/
						));
Communicationrequestobj.setSubject(HapiFHIRHelpers.createReference(communicationrequest.getCmmnctnRqstSbjctRfrnce() /** { "tree" :"CommunicationRequest.subject", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Communicationrequestobj.addAbout(HapiFHIRHelpers.createReference(communicationrequest.getCmmnctnRqstBtRfrnce() /** { "tree" :"CommunicationRequest.about", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAbout"} **/
						));
Communicationrequestobj.setEncounter(HapiFHIRHelpers.createReference(communicationrequest.getCmmnctnRqstNcntrRfrnce() /** { "tree" :"CommunicationRequest.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Communicationrequestobj.setContentString(HapiFHIRHelpers.createstring(communicationrequest.getCmmnctnRqstPldCntntStrngStrng() /** { "tree" :"CommunicationRequest.payload.contentString", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentString"} **/
						));
Communicationrequestobj.setContentAttachment(HapiFHIRHelpers.createAttachment(communicationrequest.getCmmnctnRqstPldCntntttchmntTtchmntDta() /** { "tree" :"CommunicationRequest.payload.contentAttachment", "datatype" : "Attachment, base64Binary", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentAttachment, setData"} **/
						, communicationrequest.getCmmnctnRqstPldCntntttchmntTtchmntHsh() /** { "tree" :"CommunicationRequest.payload.contentAttachment", "datatype" : "Attachment, base64Binary", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentAttachment, setHash"} **/
						, communicationrequest.getCmmnctnRqstPldCntntttchmntTtchmntCntntTpe() /** { "tree" :"CommunicationRequest.payload.contentAttachment", "datatype" : "Attachment, code", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentAttachment, setContentType"} **/
						, communicationrequest.getCmmnctnRqstPldCntntttchmntTtchmntLngge() /** { "tree" :"CommunicationRequest.payload.contentAttachment", "datatype" : "Attachment, code", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentAttachment, setLanguage"} **/
						, communicationrequest.getCmmnctnRqstPldCntntttchmntTtchmntCrtn() /** { "tree" :"CommunicationRequest.payload.contentAttachment", "datatype" : "Attachment, dateTime", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentAttachment, setCreation"} **/
						, communicationrequest.getCmmnctnRqstPldCntntttchmntTtchmntTtle() /** { "tree" :"CommunicationRequest.payload.contentAttachment", "datatype" : "Attachment, string", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentAttachment, setTitle"} **/
						, communicationrequest.getCmmnctnRqstPldCntntttchmntTtchmntSze() /** { "tree" :"CommunicationRequest.payload.contentAttachment", "datatype" : "Attachment, unsignedInt", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentAttachment, setSize"} **/
						, communicationrequest.getCmmnctnRqstPldCntntttchmntTtchmntRl() /** { "tree" :"CommunicationRequest.payload.contentAttachment", "datatype" : "Attachment, url", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentAttachment, setUrl"} **/
						));
Communicationrequestobj.setContentReference(any)(HapiFHIRHelpers.createReference(communicationrequest.getCmmnctnRqstPldCntntRfrncRfrnce() /** { "tree" :"CommunicationRequest.payload.contentReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addPayload"] , "methodName" : "setContentReference(any)"} **/
						));
Communicationrequestobj.setOccurrence(HapiFHIRHelpers.createdateTimetype(communicationrequest.getCmmnctnRqstCcrrncDttmDtTme() /** { "tree" :"CommunicationRequest.occurrenceDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceDatetime"} **/
						));
Communicationrequestobj.setOccurrencePeriod(HapiFHIRHelpers.createPeriod(communicationrequest.getCmmnctnRqstCcrrncPrdPrdStrt() /** { "tree" :"CommunicationRequest.occurrencePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrencePeriod, setStart"} **/
						, communicationrequest.getCmmnctnRqstCcrrncPrdPrdNd() /** { "tree" :"CommunicationRequest.occurrencePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrencePeriod, setEnd"} **/
						));
Communicationrequestobj.setAuthoredOn(HapiFHIRHelpers.createdateTime(communicationrequest.getCmmnctnRqstThrdnDtTme() /** { "tree" :"CommunicationRequest.authoredOn", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAuthoredOn"} **/
						));
Communicationrequestobj.setRequester(HapiFHIRHelpers.createReference(communicationrequest.getCmmnctnRqstRqstrRfrnce() /** { "tree" :"CommunicationRequest.requester", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequester"} **/
						));
Communicationrequestobj.addRecipient(HapiFHIRHelpers.createReference(communicationrequest.getCmmnctnRqstRcpntRfrnce() /** { "tree" :"CommunicationRequest.recipient", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRecipient"} **/
						));
Communicationrequestobj.setSender(HapiFHIRHelpers.createReference(communicationrequest.getCmmnctnRqstSndrRfrnce() /** { "tree" :"CommunicationRequest.sender", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSender"} **/
						));
Communicationrequestobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(communicationrequest.getCmmnctnRqstRsnCdCcCdngCSstm() /** { "tree" :"CommunicationRequest.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, communicationrequest.getCmmnctnRqstRsnCdCcCdngCVrsn() /** { "tree" :"CommunicationRequest.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, communicationrequest.getCmmnctnRqstRsnCdCcCdngCCde() /** { "tree" :"CommunicationRequest.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, communicationrequest.getCmmnctnRqstRsnCdCcCdngCDsplay() /** { "tree" :"CommunicationRequest.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, communicationrequest.getCmmnctnRqstRsnCdCcCdngCSrSlctd() /** { "tree" :"CommunicationRequest.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, communicationrequest.getCmmnctnRqstRsnCdCcTxt() /** { "tree" :"CommunicationRequest.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Communicationrequestobj.addReasonReference(HapiFHIRHelpers.createReference(communicationrequest.getCmmnctnRqstRsnRfrncRfrnce() /** { "tree" :"CommunicationRequest.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonReference"} **/
						));
Communicationrequestobj.addNote(HapiFHIRHelpers.createAnnotation(communicationrequest.getCmmnctnRqstNtNnttnTme() /** { "tree" :"CommunicationRequest.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, communicationrequest.getCmmnctnRqstNtNnttnTxt() /** { "tree" :"CommunicationRequest.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, communicationrequest.getCmmnctnRqstNtNnttnThrRfrnce() /** { "tree" :"CommunicationRequest.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, communicationrequest.getCmmnctnRqstNtNnttnThrStrng() /** { "tree" :"CommunicationRequest.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
		));
	}
}
