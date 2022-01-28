package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Appointmentresponse.
 * @see .Appointmentresponse
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class AppointmentresponseConversion 
{
	public Patient Appointmentresponses(main.templateoutput.Model.Appointmentresponse appointmentresponse) 
	{
			Patient  Appointmentresponseobj = new Patient(); 

						Appointmentresponseobj.addIdentifier(HapiFHIRHelpers.createIdentifier(appointmentresponse.getAppntmntRspnsDntfrDntfrSe() /** { "tree" :"AppointmentResponse.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, appointmentresponse.getAppntmntRspnsDntfrDntfrTpCcCSstm() /** { "tree" :"AppointmentResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, appointmentresponse.getAppntmntRspnsDntfrDntfrTpCcCVrsn() /** { "tree" :"AppointmentResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, appointmentresponse.getAppntmntRspnsDntfrDntfrTpCcCCde() /** { "tree" :"AppointmentResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, appointmentresponse.getAppntmntRspnsDntfrDntfrTpCcCDsplay() /** { "tree" :"AppointmentResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, appointmentresponse.getAppntmntRspnsDntfrDntfrTpCcCSrSlctd() /** { "tree" :"AppointmentResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, appointmentresponse.getAppntmntRspnsDntfrDntfrTpCcTxt() /** { "tree" :"AppointmentResponse.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, appointmentresponse.getAppntmntRspnsDntfrDntfrPrdPrdStrt() /** { "tree" :"AppointmentResponse.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, appointmentresponse.getAppntmntRspnsDntfrDntfrPrdPrdNd() /** { "tree" :"AppointmentResponse.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, appointmentresponse.getAppntmntRspnsDntfrDntfrSsgnr() /** { "tree" :"AppointmentResponse.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, appointmentresponse.getAppntmntRspnsDntfrDntfrVlue() /** { "tree" :"AppointmentResponse.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, appointmentresponse.getAppntmntRspnsDntfrDntfrSstm() /** { "tree" :"AppointmentResponse.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Appointmentresponseobj.setAppointment(HapiFHIRHelpers.createReference(appointmentresponse.getAppntmntRspnsPpntmntRfrnce() /** { "tree" :"AppointmentResponse.appointment", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setAppointment"} **/
						));
Appointmentresponseobj.setStart(HapiFHIRHelpers.createinstant(appointmentresponse.getAppointmentResponseStartInstant() /** { "tree" :"AppointmentResponse.start", "datatype" : "instant", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStart"} **/
						));
Appointmentresponseobj.setEnd(HapiFHIRHelpers.createinstant(appointmentresponse.getAppointmentResponseEndInstant() /** { "tree" :"AppointmentResponse.end", "datatype" : "instant", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEnd"} **/
						));
Appointmentresponseobj.addParticipantType(HapiFHIRHelpers.createCodeableConcept(appointmentresponse.getAppntmntRspnsPrtcpntTpCcCdngCSstm() /** { "tree" :"AppointmentResponse.participantType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addParticipantType, addCoding, setSystem"} **/
						, appointmentresponse.getAppntmntRspnsPrtcpntTpCcCdngCVrsn() /** { "tree" :"AppointmentResponse.participantType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addParticipantType, addCoding, setVersion"} **/
						, appointmentresponse.getAppntmntRspnsPrtcpntTpCcCdngCCde() /** { "tree" :"AppointmentResponse.participantType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addParticipantType, addCoding, setCode"} **/
						, appointmentresponse.getAppntmntRspnsPrtcpntTpCcCdngCDsplay() /** { "tree" :"AppointmentResponse.participantType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addParticipantType, addCoding, setDisplay"} **/
						, appointmentresponse.getAppntmntRspnsPrtcpntTpCcCdngCSrSlctd() /** { "tree" :"AppointmentResponse.participantType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addParticipantType, addCoding, setUserSelected"} **/
						, appointmentresponse.getAppntmntRspnsPrtcpntTpCcTxt() /** { "tree" :"AppointmentResponse.participantType", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addParticipantType, setText"} **/
						));
Appointmentresponseobj.setActor(HapiFHIRHelpers.createReference(appointmentresponse.getAppntmntRspnsCtrRfrnce() /** { "tree" :"AppointmentResponse.actor", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActor"} **/
						));
Appointmentresponseobj.setParticipantStatus(HapiFHIRHelpers.createcode(appointmentresponse.getAppntmntRspnsPrtcpntSttsCde() /** { "tree" :"AppointmentResponse.participantStatus", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setParticipantStatus"} **/
						));
Appointmentresponseobj.setComment(HapiFHIRHelpers.createstring(appointmentresponse.getAppointmentResponseCommentString() /** { "tree" :"AppointmentResponse.comment", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setComment"} **/
		));
	}
}
