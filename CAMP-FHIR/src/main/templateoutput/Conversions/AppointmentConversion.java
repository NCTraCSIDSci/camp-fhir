package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Appointment.
 * @see .Appointment
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class AppointmentConversion 
{
	public Patient Appointments(main.templateoutput.Model.Appointment appointment) 
	{
			Patient  Appointmentobj = new Patient(); 

						Appointmentobj.addIdentifier(HapiFHIRHelpers.createIdentifier(appointment.getAppntmntDntfrDntfrSe() /** { "tree" :"Appointment.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, appointment.getAppntmntDntfrDntfrTpCcCSstm() /** { "tree" :"Appointment.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, appointment.getAppntmntDntfrDntfrTpCcCVrsn() /** { "tree" :"Appointment.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, appointment.getAppntmntDntfrDntfrTpCcCCde() /** { "tree" :"Appointment.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, appointment.getAppntmntDntfrDntfrTpCcCDsplay() /** { "tree" :"Appointment.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, appointment.getAppntmntDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Appointment.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, appointment.getAppntmntDntfrDntfrTpCcTxt() /** { "tree" :"Appointment.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, appointment.getAppntmntDntfrDntfrPrdPrdStrt() /** { "tree" :"Appointment.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, appointment.getAppntmntDntfrDntfrPrdPrdNd() /** { "tree" :"Appointment.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, appointment.getAppntmntDntfrDntfrSsgnr() /** { "tree" :"Appointment.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, appointment.getAppntmntDntfrDntfrVlue() /** { "tree" :"Appointment.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, appointment.getAppntmntDntfrDntfrSstm() /** { "tree" :"Appointment.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Appointmentobj.setStatus(HapiFHIRHelpers.createcode(appointment.getAppointmentStatusCode() /** { "tree" :"Appointment.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Appointmentobj.setCancelationReason(HapiFHIRHelpers.createCodeableConcept(appointment.getAppntmntCncltnRsnCcCdngCSstm() /** { "tree" :"Appointment.cancelationReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCancelationReason, addCoding, setSystem"} **/
						, appointment.getAppntmntCncltnRsnCcCdngCVrsn() /** { "tree" :"Appointment.cancelationReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCancelationReason, addCoding, setVersion"} **/
						, appointment.getAppntmntCncltnRsnCcCdngCCde() /** { "tree" :"Appointment.cancelationReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCancelationReason, addCoding, setCode"} **/
						, appointment.getAppntmntCncltnRsnCcCdngCDsplay() /** { "tree" :"Appointment.cancelationReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCancelationReason, addCoding, setDisplay"} **/
						, appointment.getAppntmntCncltnRsnCcCdngCSrSlctd() /** { "tree" :"Appointment.cancelationReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCancelationReason, addCoding, setUserSelected"} **/
						, appointment.getAppntmntCncltnRsnCcTxt() /** { "tree" :"Appointment.cancelationReason", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCancelationReason, setText"} **/
						));
Appointmentobj.addServiceCategory(HapiFHIRHelpers.createCodeableConcept(appointment.getAppntmntSrvcCtgrCcCdngCSstm() /** { "tree" :"Appointment.serviceCategory", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceCategory, addCoding, setSystem"} **/
						, appointment.getAppntmntSrvcCtgrCcCdngCVrsn() /** { "tree" :"Appointment.serviceCategory", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceCategory, addCoding, setVersion"} **/
						, appointment.getAppntmntSrvcCtgrCcCdngCCde() /** { "tree" :"Appointment.serviceCategory", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceCategory, addCoding, setCode"} **/
						, appointment.getAppntmntSrvcCtgrCcCdngCDsplay() /** { "tree" :"Appointment.serviceCategory", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceCategory, addCoding, setDisplay"} **/
						, appointment.getAppntmntSrvcCtgrCcCdngCSrSlctd() /** { "tree" :"Appointment.serviceCategory", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceCategory, addCoding, setUserSelected"} **/
						, appointment.getAppntmntSrvcCtgrCcTxt() /** { "tree" :"Appointment.serviceCategory", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceCategory, setText"} **/
						));
Appointmentobj.addServiceType(HapiFHIRHelpers.createCodeableConcept(appointment.getAppntmntSrvcTpCcCdngCSstm() /** { "tree" :"Appointment.serviceType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceType, addCoding, setSystem"} **/
						, appointment.getAppntmntSrvcTpCcCdngCVrsn() /** { "tree" :"Appointment.serviceType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceType, addCoding, setVersion"} **/
						, appointment.getAppntmntSrvcTpCcCdngCCde() /** { "tree" :"Appointment.serviceType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceType, addCoding, setCode"} **/
						, appointment.getAppntmntSrvcTpCcCdngCDsplay() /** { "tree" :"Appointment.serviceType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceType, addCoding, setDisplay"} **/
						, appointment.getAppntmntSrvcTpCcCdngCSrSlctd() /** { "tree" :"Appointment.serviceType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceType, addCoding, setUserSelected"} **/
						, appointment.getAppointmentServiceTypeCcText() /** { "tree" :"Appointment.serviceType", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceType, setText"} **/
						));
Appointmentobj.addSpecialty(HapiFHIRHelpers.createCodeableConcept(appointment.getAppntmntSpcltCcCdngCSstm() /** { "tree" :"Appointment.specialty", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setSystem"} **/
						, appointment.getAppntmntSpcltCcCdngCVrsn() /** { "tree" :"Appointment.specialty", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setVersion"} **/
						, appointment.getAppntmntSpcltCcCdngCCde() /** { "tree" :"Appointment.specialty", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setCode"} **/
						, appointment.getAppntmntSpcltCcCdngCDsplay() /** { "tree" :"Appointment.specialty", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setDisplay"} **/
						, appointment.getAppntmntSpcltCcCdngCSrSlctd() /** { "tree" :"Appointment.specialty", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setUserSelected"} **/
						, appointment.getAppointmentSpecialtyCcText() /** { "tree" :"Appointment.specialty", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, setText"} **/
						));
Appointmentobj.setAppointmentType(HapiFHIRHelpers.createCodeableConcept(appointment.getAppntmntPpntmntTpCcCdngCSstm() /** { "tree" :"Appointment.appointmentType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAppointmentType, addCoding, setSystem"} **/
						, appointment.getAppntmntPpntmntTpCcCdngCVrsn() /** { "tree" :"Appointment.appointmentType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAppointmentType, addCoding, setVersion"} **/
						, appointment.getAppntmntPpntmntTpCcCdngCCde() /** { "tree" :"Appointment.appointmentType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAppointmentType, addCoding, setCode"} **/
						, appointment.getAppntmntPpntmntTpCcCdngCDsplay() /** { "tree" :"Appointment.appointmentType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAppointmentType, addCoding, setDisplay"} **/
						, appointment.getAppntmntPpntmntTpCcCdngCSrSlctd() /** { "tree" :"Appointment.appointmentType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAppointmentType, addCoding, setUserSelected"} **/
						, appointment.getAppntmntPpntmntTpCcTxt() /** { "tree" :"Appointment.appointmentType", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAppointmentType, setText"} **/
						));
Appointmentobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(appointment.getAppntmntRsnCdCcCdngCSstm() /** { "tree" :"Appointment.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, appointment.getAppntmntRsnCdCcCdngCVrsn() /** { "tree" :"Appointment.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, appointment.getAppntmntRsnCdCcCdngCCde() /** { "tree" :"Appointment.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, appointment.getAppntmntRsnCdCcCdngCDsplay() /** { "tree" :"Appointment.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, appointment.getAppntmntRsnCdCcCdngCSrSlctd() /** { "tree" :"Appointment.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, appointment.getAppointmentReasonCodeCcText() /** { "tree" :"Appointment.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Appointmentobj.addReasonReference(HapiFHIRHelpers.createReference(appointment.getAppntmntRsnRfrncRfrnce() /** { "tree" :"Appointment.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonReference"} **/
						));
Appointmentobj.setPriority(HapiFHIRHelpers.createunsignedInt(appointment.getAppointmentPriorityUnsignedInt() /** { "tree" :"Appointment.priority", "datatype" : "unsignedInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority"} **/
						));
Appointmentobj.setDescription(HapiFHIRHelpers.createstring(appointment.getAppointmentDescriptionString() /** { "tree" :"Appointment.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Appointmentobj.addSupportingInformation(HapiFHIRHelpers.createReference(appointment.getAppntmntSpprtngnfrmtnRfrnce() /** { "tree" :"Appointment.supportingInformation", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSupportingInformation"} **/
						));
Appointmentobj.setStart(HapiFHIRHelpers.createinstant(appointment.getAppointmentStartInstant() /** { "tree" :"Appointment.start", "datatype" : "instant", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStart"} **/
						));
Appointmentobj.setEnd(HapiFHIRHelpers.createinstant(appointment.getAppointmentEndInstant() /** { "tree" :"Appointment.end", "datatype" : "instant", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEnd"} **/
						));
Appointmentobj.setMinutesDuration(HapiFHIRHelpers.createpositiveInt(appointment.getAppntmntMntsDrtnPstvnt() /** { "tree" :"Appointment.minutesDuration", "datatype" : "positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMinutesDuration"} **/
						));
Appointmentobj.addSlot(HapiFHIRHelpers.createReference(appointment.getAppointmentSlotReference() /** { "tree" :"Appointment.slot", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSlot"} **/
						));
Appointmentobj.setCreated(HapiFHIRHelpers.createdateTime(appointment.getAppointmentCreatedDateTime() /** { "tree" :"Appointment.created", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCreated"} **/
						));
Appointmentobj.setComment(HapiFHIRHelpers.createstring(appointment.getAppointmentCommentString() /** { "tree" :"Appointment.comment", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setComment"} **/
						));
Appointmentobj.setPatientInstruction(HapiFHIRHelpers.createstring(appointment.getAppointmentPntInstructionString() /** { "tree" :"Appointment.patientInstruction", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPatientInstruction"} **/
						));
Appointmentobj.addBasedOn(HapiFHIRHelpers.createReference(appointment.getAppointmentBasedOnReference() /** { "tree" :"Appointment.basedOn", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasedOn"} **/
						));
Appointmentobj.addType(HapiFHIRHelpers.createCodeableConcept(appointment.getAppntmntPrtcpntTpCcCdngCSstm() /** { "tree" :"Appointment.participant.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addParticipant"] , "methodName" : "addType, addCoding, setSystem"} **/
						, appointment.getAppntmntPrtcpntTpCcCdngCVrsn() /** { "tree" :"Appointment.participant.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addParticipant"] , "methodName" : "addType, addCoding, setVersion"} **/
						, appointment.getAppntmntPrtcpntTpCcCdngCCde() /** { "tree" :"Appointment.participant.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addParticipant"] , "methodName" : "addType, addCoding, setCode"} **/
						, appointment.getAppntmntPrtcpntTpCcCdngCDsplay() /** { "tree" :"Appointment.participant.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addParticipant"] , "methodName" : "addType, addCoding, setDisplay"} **/
						, appointment.getAppntmntPrtcpntTpCcCdngCSrSlctd() /** { "tree" :"Appointment.participant.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addParticipant"] , "methodName" : "addType, addCoding, setUserSelected"} **/
						, appointment.getAppntmntPrtcpntTpCcTxt() /** { "tree" :"Appointment.participant.type", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addParticipant"] , "methodName" : "addType, setText"} **/
						));
Appointmentobj.setActor(HapiFHIRHelpers.createReference(appointment.getAppntmntPrtcpntCtrRfrnce() /** { "tree" :"Appointment.participant.actor", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addParticipant"] , "methodName" : "setActor"} **/
						));
Appointmentobj.setRequired(HapiFHIRHelpers.createcode(appointment.getAppntmntPrtcpntRqrdCde() /** { "tree" :"Appointment.participant.required", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addParticipant"] , "methodName" : "setRequired"} **/
						));
Appointmentobj.setStatus(HapiFHIRHelpers.createcode(appointment.getAppntmntPrtcpntSttsCde() /** { "tree" :"Appointment.participant.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addParticipant"] , "methodName" : "setStatus"} **/
						));
Appointmentobj.setPeriod(HapiFHIRHelpers.createPeriod(appointment.getAppntmntPrtcpntPrdPrdStrt() /** { "tree" :"Appointment.participant.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addParticipant"] , "methodName" : "setPeriod, setStart"} **/
						, appointment.getAppntmntPrtcpntPrdPrdNd() /** { "tree" :"Appointment.participant.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addParticipant"] , "methodName" : "setPeriod, setEnd"} **/
						));
Appointmentobj.addRequestedPeriod(HapiFHIRHelpers.createPeriod(appointment.getAppntmntRqstdPrdPrdStrt() /** { "tree" :"Appointment.requestedPeriod", "datatype" : "Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRequestedPeriod, setStart"} **/
						, appointment.getAppntmntRqstdPrdPrdNd() /** { "tree" :"Appointment.requestedPeriod", "datatype" : "Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRequestedPeriod, setEnd"} **/
		));
	}
}
