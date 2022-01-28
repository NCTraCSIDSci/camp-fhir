package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Slot.
 * @see .Slot
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class SlotConversion 
{
	public Patient Slots(main.templateoutput.Model.Slot slot) 
	{
			Patient  Slotobj = new Patient(); 

						Slotobj.addIdentifier(HapiFHIRHelpers.createIdentifier(slot.getSlotIdentifierIdentifierUse() /** { "tree" :"Slot.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, slot.getSltDntfrDntfrTpCcCSstm() /** { "tree" :"Slot.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, slot.getSltDntfrDntfrTpCcCVrsn() /** { "tree" :"Slot.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, slot.getSltDntfrDntfrTpCcCCde() /** { "tree" :"Slot.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, slot.getSltDntfrDntfrTpCcCDsplay() /** { "tree" :"Slot.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, slot.getSltDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Slot.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, slot.getSltDntfrDntfrTpCcTxt() /** { "tree" :"Slot.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, slot.getSltDntfrDntfrPrdPrdStrt() /** { "tree" :"Slot.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, slot.getSltDntfrDntfrPrdPrdNd() /** { "tree" :"Slot.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, slot.getSltDntfrDntfrSsgnr() /** { "tree" :"Slot.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, slot.getSlotIdentifierIdentifierValue() /** { "tree" :"Slot.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, slot.getSlotIdentifierIdentifierSystem() /** { "tree" :"Slot.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Slotobj.addServiceCategory(HapiFHIRHelpers.createCodeableConcept(slot.getSltSrvcCtgrCcCdngCSstm() /** { "tree" :"Slot.serviceCategory", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceCategory, addCoding, setSystem"} **/
						, slot.getSltSrvcCtgrCcCdngCVrsn() /** { "tree" :"Slot.serviceCategory", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceCategory, addCoding, setVersion"} **/
						, slot.getSltSrvcCtgrCcCdngCCde() /** { "tree" :"Slot.serviceCategory", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceCategory, addCoding, setCode"} **/
						, slot.getSltSrvcCtgrCcCdngCDsplay() /** { "tree" :"Slot.serviceCategory", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceCategory, addCoding, setDisplay"} **/
						, slot.getSltSrvcCtgrCcCdngCSrSlctd() /** { "tree" :"Slot.serviceCategory", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceCategory, addCoding, setUserSelected"} **/
						, slot.getSlotServiceCategoryCcText() /** { "tree" :"Slot.serviceCategory", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceCategory, setText"} **/
						));
Slotobj.addServiceType(HapiFHIRHelpers.createCodeableConcept(slot.getSltSrvcTpCcCdngCSstm() /** { "tree" :"Slot.serviceType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceType, addCoding, setSystem"} **/
						, slot.getSltSrvcTpCcCdngCVrsn() /** { "tree" :"Slot.serviceType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceType, addCoding, setVersion"} **/
						, slot.getSlotServiceTypeCcCodingCCode() /** { "tree" :"Slot.serviceType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceType, addCoding, setCode"} **/
						, slot.getSltSrvcTpCcCdngCDsplay() /** { "tree" :"Slot.serviceType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceType, addCoding, setDisplay"} **/
						, slot.getSltSrvcTpCcCdngCSrSlctd() /** { "tree" :"Slot.serviceType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceType, addCoding, setUserSelected"} **/
						, slot.getSlotServiceTypeCcText() /** { "tree" :"Slot.serviceType", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addServiceType, setText"} **/
						));
Slotobj.addSpecialty(HapiFHIRHelpers.createCodeableConcept(slot.getSlotSpecialtyCcCodingCSystem() /** { "tree" :"Slot.specialty", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setSystem"} **/
						, slot.getSlotSpecialtyCcCodingCVersion() /** { "tree" :"Slot.specialty", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setVersion"} **/
						, slot.getSlotSpecialtyCcCodingCCode() /** { "tree" :"Slot.specialty", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setCode"} **/
						, slot.getSlotSpecialtyCcCodingCDisplay() /** { "tree" :"Slot.specialty", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setDisplay"} **/
						, slot.getSltSpcltCcCdngCSrSlctd() /** { "tree" :"Slot.specialty", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setUserSelected"} **/
						, slot.getSlotSpecialtyCcText() /** { "tree" :"Slot.specialty", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, setText"} **/
						));
Slotobj.setAppointmentType(HapiFHIRHelpers.createCodeableConcept(slot.getSltPpntmntTpCcCdngCSstm() /** { "tree" :"Slot.appointmentType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAppointmentType, addCoding, setSystem"} **/
						, slot.getSltPpntmntTpCcCdngCVrsn() /** { "tree" :"Slot.appointmentType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAppointmentType, addCoding, setVersion"} **/
						, slot.getSltPpntmntTpCcCdngCCde() /** { "tree" :"Slot.appointmentType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAppointmentType, addCoding, setCode"} **/
						, slot.getSltPpntmntTpCcCdngCDsplay() /** { "tree" :"Slot.appointmentType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAppointmentType, addCoding, setDisplay"} **/
						, slot.getSltPpntmntTpCcCdngCSrSlctd() /** { "tree" :"Slot.appointmentType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAppointmentType, addCoding, setUserSelected"} **/
						, slot.getSlotAppointmentTypeCcText() /** { "tree" :"Slot.appointmentType", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAppointmentType, setText"} **/
						));
Slotobj.setSchedule(HapiFHIRHelpers.createReference(slot.getSlotScheduleReference() /** { "tree" :"Slot.schedule", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setSchedule"} **/
						));
Slotobj.setStatus(HapiFHIRHelpers.createcode(slot.getSlotStatusCode() /** { "tree" :"Slot.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Slotobj.setStart(HapiFHIRHelpers.createinstant(slot.getSlotStartInstant() /** { "tree" :"Slot.start", "datatype" : "instant", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStart"} **/
						));
Slotobj.setEnd(HapiFHIRHelpers.createinstant(slot.getSlotEndInstant() /** { "tree" :"Slot.end", "datatype" : "instant", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setEnd"} **/
						));
Slotobj.setOverbooked(HapiFHIRHelpers.createboolean(slot.getSlotOverbookedBoolean() /** { "tree" :"Slot.overbooked", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOverbooked"} **/
						));
Slotobj.setComment(HapiFHIRHelpers.createstring(slot.getSlotCommentString() /** { "tree" :"Slot.comment", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setComment"} **/
		));
	}
}
