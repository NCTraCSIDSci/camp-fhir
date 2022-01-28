package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Schedule.
 * @see .Schedule
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ScheduleConversion 
{
	public Patient Schedules(main.templateoutput.Model.Schedule schedule) 
	{
			Patient  Scheduleobj = new Patient(); 

						Scheduleobj.addIdentifier(HapiFHIRHelpers.createIdentifier(schedule.getScheduleIdentifierIdentifierUse() /** { "tree" :"Schedule.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, schedule.getSchdlDntfrDntfrTpCcCSstm() /** { "tree" :"Schedule.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, schedule.getSchdlDntfrDntfrTpCcCVrsn() /** { "tree" :"Schedule.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, schedule.getSchdlDntfrDntfrTpCcCCde() /** { "tree" :"Schedule.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, schedule.getSchdlDntfrDntfrTpCcCDsplay() /** { "tree" :"Schedule.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, schedule.getSchdlDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Schedule.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, schedule.getSchdlDntfrDntfrTpCcTxt() /** { "tree" :"Schedule.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, schedule.getSchdlDntfrDntfrPrdPrdStrt() /** { "tree" :"Schedule.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, schedule.getSchdlDntfrDntfrPrdPrdNd() /** { "tree" :"Schedule.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, schedule.getSchdlDntfrDntfrSsgnr() /** { "tree" :"Schedule.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, schedule.getSchdlDntfrDntfrVlue() /** { "tree" :"Schedule.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, schedule.getSchdlDntfrDntfrSstm() /** { "tree" :"Schedule.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Scheduleobj.setActive(HapiFHIRHelpers.createboolean(schedule.getScheduleActiveBoolean() /** { "tree" :"Schedule.active", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActive"} **/
						));
Scheduleobj.addServiceCategory(HapiFHIRHelpers.createCodeableConcept(schedule.getSchdlSrvcCtgrCcCdngCSstm() /** { "tree" :"Schedule.serviceCategory", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceCategory, addCoding, setSystem"} **/
						, schedule.getSchdlSrvcCtgrCcCdngCVrsn() /** { "tree" :"Schedule.serviceCategory", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceCategory, addCoding, setVersion"} **/
						, schedule.getSchdlSrvcCtgrCcCdngCCde() /** { "tree" :"Schedule.serviceCategory", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceCategory, addCoding, setCode"} **/
						, schedule.getSchdlSrvcCtgrCcCdngCDsplay() /** { "tree" :"Schedule.serviceCategory", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceCategory, addCoding, setDisplay"} **/
						, schedule.getSchdlSrvcCtgrCcCdngCSrSlctd() /** { "tree" :"Schedule.serviceCategory", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceCategory, addCoding, setUserSelected"} **/
						, schedule.getScheduleServiceCategoryCcText() /** { "tree" :"Schedule.serviceCategory", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceCategory, setText"} **/
						));
Scheduleobj.addServiceType(HapiFHIRHelpers.createCodeableConcept(schedule.getSchdlSrvcTpCcCdngCSstm() /** { "tree" :"Schedule.serviceType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceType, addCoding, setSystem"} **/
						, schedule.getSchdlSrvcTpCcCdngCVrsn() /** { "tree" :"Schedule.serviceType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceType, addCoding, setVersion"} **/
						, schedule.getSchdlSrvcTpCcCdngCCde() /** { "tree" :"Schedule.serviceType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceType, addCoding, setCode"} **/
						, schedule.getSchdlSrvcTpCcCdngCDsplay() /** { "tree" :"Schedule.serviceType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceType, addCoding, setDisplay"} **/
						, schedule.getSchdlSrvcTpCcCdngCSrSlctd() /** { "tree" :"Schedule.serviceType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceType, addCoding, setUserSelected"} **/
						, schedule.getScheduleServiceTypeCcText() /** { "tree" :"Schedule.serviceType", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceType, setText"} **/
						));
Scheduleobj.addSpecialty(HapiFHIRHelpers.createCodeableConcept(schedule.getSchdlSpcltCcCdngCSstm() /** { "tree" :"Schedule.specialty", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setSystem"} **/
						, schedule.getSchdlSpcltCcCdngCVrsn() /** { "tree" :"Schedule.specialty", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setVersion"} **/
						, schedule.getSchdlSpcltCcCdngCCde() /** { "tree" :"Schedule.specialty", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setCode"} **/
						, schedule.getSchdlSpcltCcCdngCDsplay() /** { "tree" :"Schedule.specialty", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setDisplay"} **/
						, schedule.getSchdlSpcltCcCdngCSrSlctd() /** { "tree" :"Schedule.specialty", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setUserSelected"} **/
						, schedule.getScheduleSpecialtyCcText() /** { "tree" :"Schedule.specialty", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, setText"} **/
						));
Scheduleobj.addActor(HapiFHIRHelpers.createReference(schedule.getScheduleActorReference() /** { "tree" :"Schedule.actor", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addActor"} **/
						));
Scheduleobj.setPlanningHorizon(HapiFHIRHelpers.createPeriod(schedule.getSchdlPlnnngHrznPrdStrt() /** { "tree" :"Schedule.planningHorizon", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPlanningHorizon, setStart"} **/
						, schedule.getSchdlPlnnngHrznPrdNd() /** { "tree" :"Schedule.planningHorizon", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPlanningHorizon, setEnd"} **/
						));
Scheduleobj.setComment(HapiFHIRHelpers.createstring(schedule.getScheduleCommentString() /** { "tree" :"Schedule.comment", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setComment"} **/
		));
	}
}
