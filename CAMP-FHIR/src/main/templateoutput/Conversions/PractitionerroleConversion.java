package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Practitionerrole.
 * @see .Practitionerrole
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class PractitionerroleConversion 
{
	public Patient Practitionerroles(main.templateoutput.Model.Practitionerrole practitionerrole) 
	{
			Patient  Practitionerroleobj = new Patient(); 

						Practitionerroleobj.addIdentifier(HapiFHIRHelpers.createIdentifier(practitionerrole.getPrcttnrRlDntfrDntfrSe() /** { "tree" :"PractitionerRole.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, practitionerrole.getPrcttnrRlDntfrDntfrTpCcCSstm() /** { "tree" :"PractitionerRole.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, practitionerrole.getPrcttnrRlDntfrDntfrTpCcCVrsn() /** { "tree" :"PractitionerRole.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, practitionerrole.getPrcttnrRlDntfrDntfrTpCcCCde() /** { "tree" :"PractitionerRole.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, practitionerrole.getPrcttnrRlDntfrDntfrTpCcCDsplay() /** { "tree" :"PractitionerRole.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, practitionerrole.getPrcttnrRlDntfrDntfrTpCcCSrSlctd() /** { "tree" :"PractitionerRole.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, practitionerrole.getPrcttnrRlDntfrDntfrTpCcTxt() /** { "tree" :"PractitionerRole.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, practitionerrole.getPrcttnrRlDntfrDntfrPrdPrdStrt() /** { "tree" :"PractitionerRole.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, practitionerrole.getPrcttnrRlDntfrDntfrPrdPrdNd() /** { "tree" :"PractitionerRole.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, practitionerrole.getPrcttnrRlDntfrDntfrSsgnr() /** { "tree" :"PractitionerRole.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, practitionerrole.getPrcttnrRlDntfrDntfrVlue() /** { "tree" :"PractitionerRole.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, practitionerrole.getPrcttnrRlDntfrDntfrSstm() /** { "tree" :"PractitionerRole.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Practitionerroleobj.setActive(HapiFHIRHelpers.createboolean(practitionerrole.getPractitionerRoleActiveBoolean() /** { "tree" :"PractitionerRole.active", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActive"} **/
						));
Practitionerroleobj.setPeriod(HapiFHIRHelpers.createPeriod(practitionerrole.getPrcttnrRlPrdPrdStrt() /** { "tree" :"PractitionerRole.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setStart"} **/
						, practitionerrole.getPractitionerRolePeriodPeriodEnd() /** { "tree" :"PractitionerRole.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setEnd"} **/
						));
Practitionerroleobj.setPractitioner(HapiFHIRHelpers.createReference(practitionerrole.getPrcttnrRlPrcttnrRfrnce() /** { "tree" :"PractitionerRole.practitioner", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPractitioner"} **/
						));
Practitionerroleobj.setOrganization(HapiFHIRHelpers.createReference(practitionerrole.getPrcttnrRlRgnztnRfrnce() /** { "tree" :"PractitionerRole.organization", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOrganization"} **/
						));
Practitionerroleobj.addCode(HapiFHIRHelpers.createCodeableConcept(practitionerrole.getPrcttnrRlCdCcCdngCSstm() /** { "tree" :"PractitionerRole.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCode, addCoding, setSystem"} **/
						, practitionerrole.getPrcttnrRlCdCcCdngCVrsn() /** { "tree" :"PractitionerRole.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCode, addCoding, setVersion"} **/
						, practitionerrole.getPrcttnrRlCdCcCdngCCde() /** { "tree" :"PractitionerRole.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCode, addCoding, setCode"} **/
						, practitionerrole.getPrcttnrRlCdCcCdngCDsplay() /** { "tree" :"PractitionerRole.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCode, addCoding, setDisplay"} **/
						, practitionerrole.getPrcttnrRlCdCcCdngCSrSlctd() /** { "tree" :"PractitionerRole.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCode, addCoding, setUserSelected"} **/
						, practitionerrole.getPractitionerRoleCodeCcText() /** { "tree" :"PractitionerRole.code", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCode, setText"} **/
						));
Practitionerroleobj.addSpecialty(HapiFHIRHelpers.createCodeableConcept(practitionerrole.getPrcttnrRlSpcltCcCdngCSstm() /** { "tree" :"PractitionerRole.specialty", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setSystem"} **/
						, practitionerrole.getPrcttnrRlSpcltCcCdngCVrsn() /** { "tree" :"PractitionerRole.specialty", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setVersion"} **/
						, practitionerrole.getPrcttnrRlSpcltCcCdngCCde() /** { "tree" :"PractitionerRole.specialty", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setCode"} **/
						, practitionerrole.getPrcttnrRlSpcltCcCdngCDsplay() /** { "tree" :"PractitionerRole.specialty", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setDisplay"} **/
						, practitionerrole.getPrcttnrRlSpcltCcCdngCSrSlctd() /** { "tree" :"PractitionerRole.specialty", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, addCoding, setUserSelected"} **/
						, practitionerrole.getPractitionerRoleSpecialtyCcText() /** { "tree" :"PractitionerRole.specialty", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecialty, setText"} **/
						));
Practitionerroleobj.addLocation(HapiFHIRHelpers.createReference(practitionerrole.getPrcttnrRlLctnRfrnce() /** { "tree" :"PractitionerRole.location", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocation"} **/
						));
Practitionerroleobj.addHealthcareService(HapiFHIRHelpers.createReference(practitionerrole.getPrcttnrRlHlthcrSrvcRfrnce() /** { "tree" :"PractitionerRole.healthcareService", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addHealthcareService"} **/
						));
Practitionerroleobj.addTelecom(HapiFHIRHelpers.createContactPoint(practitionerrole.getPrcttnrRlTlcmCntctPntSstm() /** { "tree" :"PractitionerRole.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setSystem"} **/
						, practitionerrole.getPrcttnrRlTlcmCntctPntSe() /** { "tree" :"PractitionerRole.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setUse"} **/
						, practitionerrole.getPrcttnrRlTlcmCntctPntPrdPrdStrt() /** { "tree" :"PractitionerRole.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setStart"} **/
						, practitionerrole.getPrcttnrRlTlcmCntctPntPrdPrdNd() /** { "tree" :"PractitionerRole.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setEnd"} **/
						, practitionerrole.getPrcttnrRlTlcmCntctPntRnk() /** { "tree" :"PractitionerRole.telecom", "datatype" : "ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setRank"} **/
						, practitionerrole.getPrcttnrRlTlcmCntctPntVlue() /** { "tree" :"PractitionerRole.telecom", "datatype" : "ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setValue"} **/
						));
Practitionerroleobj.addDaysOfWeek(HapiFHIRHelpers.createcode(practitionerrole.getPrcttnrRlVlblTmDsfWkCde() /** { "tree" :"PractitionerRole.availableTime.daysOfWeek", "datatype" : "code", "cardinality" : "Many", "elementtree" : ["addAvailableTime"] , "methodName" : "addDaysOfWeek"} **/
						));
Practitionerroleobj.setAllDay(HapiFHIRHelpers.createboolean(practitionerrole.getPrcttnrRlVlblTmLlDBln() /** { "tree" :"PractitionerRole.availableTime.allDay", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addAvailableTime"] , "methodName" : "setAllDay"} **/
						));
Practitionerroleobj.setAvailableStartTime(HapiFHIRHelpers.createtime(practitionerrole.getPrcttnrRlVlblTmVlblStrtTmTme() /** { "tree" :"PractitionerRole.availableTime.availableStartTime", "datatype" : "time", "cardinality" : "ZeroOne", "elementtree" : ["addAvailableTime"] , "methodName" : "setAvailableStartTime"} **/
						));
Practitionerroleobj.setAvailableEndTime(HapiFHIRHelpers.createtime(practitionerrole.getPrcttnrRlVlblTmVlblndTmTme() /** { "tree" :"PractitionerRole.availableTime.availableEndTime", "datatype" : "time", "cardinality" : "ZeroOne", "elementtree" : ["addAvailableTime"] , "methodName" : "setAvailableEndTime"} **/
						));
Practitionerroleobj.setDescription(HapiFHIRHelpers.createstring(practitionerrole.getPrcttnrRlNtvlblDscrptnStrng() /** { "tree" :"PractitionerRole.notAvailable.description", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addNotAvailable"] , "methodName" : "setDescription"} **/
						));
Practitionerroleobj.setDuring(HapiFHIRHelpers.createPeriod(practitionerrole.getPrcttnrRlNtvlblDrngPrdStrt() /** { "tree" :"PractitionerRole.notAvailable.during", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addNotAvailable"] , "methodName" : "setDuring, setStart"} **/
						, practitionerrole.getPrcttnrRlNtvlblDrngPrdNd() /** { "tree" :"PractitionerRole.notAvailable.during", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addNotAvailable"] , "methodName" : "setDuring, setEnd"} **/
						));
Practitionerroleobj.setAvailabilityExceptions(HapiFHIRHelpers.createstring(practitionerrole.getPrcttnrRlVlbltxcptnsStrng() /** { "tree" :"PractitionerRole.availabilityExceptions", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAvailabilityExceptions"} **/
						));
Practitionerroleobj.addEndpoint(HapiFHIRHelpers.createReference(practitionerrole.getPrcttnrRlNdpntRfrnce() /** { "tree" :"PractitionerRole.endpoint", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndpoint"} **/
		));
	}
}
