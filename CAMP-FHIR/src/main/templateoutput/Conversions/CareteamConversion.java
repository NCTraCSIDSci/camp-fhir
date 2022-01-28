package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Careteam.
 * @see .Careteam
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class CareteamConversion 
{
	public Patient Careteams(main.templateoutput.Model.Careteam careteam) 
	{
			Patient  Careteamobj = new Patient(); 

						Careteamobj.addIdentifier(HapiFHIRHelpers.createIdentifier(careteam.getCareTeamIdentifierIdentifierUse() /** { "tree" :"CareTeam.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, careteam.getCrTmDntfrDntfrTpCcCSstm() /** { "tree" :"CareTeam.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, careteam.getCrTmDntfrDntfrTpCcCVrsn() /** { "tree" :"CareTeam.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, careteam.getCrTmDntfrDntfrTpCcCCde() /** { "tree" :"CareTeam.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, careteam.getCrTmDntfrDntfrTpCcCDsplay() /** { "tree" :"CareTeam.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, careteam.getCrTmDntfrDntfrTpCcCSrSlctd() /** { "tree" :"CareTeam.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, careteam.getCrTmDntfrDntfrTpCcTxt() /** { "tree" :"CareTeam.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, careteam.getCrTmDntfrDntfrPrdPrdStrt() /** { "tree" :"CareTeam.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, careteam.getCrTmDntfrDntfrPrdPrdNd() /** { "tree" :"CareTeam.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, careteam.getCrTmDntfrDntfrSsgnr() /** { "tree" :"CareTeam.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, careteam.getCrTmDntfrDntfrVlue() /** { "tree" :"CareTeam.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, careteam.getCrTmDntfrDntfrSstm() /** { "tree" :"CareTeam.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Careteamobj.setStatus(HapiFHIRHelpers.createcode(careteam.getCareTeamStatusCode() /** { "tree" :"CareTeam.status", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Careteamobj.addCategory(HapiFHIRHelpers.createCodeableConcept(careteam.getCrTmCtgrCcCdngCSstm() /** { "tree" :"CareTeam.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setSystem"} **/
						, careteam.getCrTmCtgrCcCdngCVrsn() /** { "tree" :"CareTeam.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setVersion"} **/
						, careteam.getCareTeamCategoryCcCodingCCode() /** { "tree" :"CareTeam.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setCode"} **/
						, careteam.getCrTmCtgrCcCdngCDsplay() /** { "tree" :"CareTeam.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setDisplay"} **/
						, careteam.getCrTmCtgrCcCdngCSrSlctd() /** { "tree" :"CareTeam.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setUserSelected"} **/
						, careteam.getCareTeamCategoryCcText() /** { "tree" :"CareTeam.category", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, setText"} **/
						));
Careteamobj.setName(HapiFHIRHelpers.createstring(careteam.getCareTeamNameString() /** { "tree" :"CareTeam.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Careteamobj.setSubject(HapiFHIRHelpers.createReference(careteam.getCareTeamSubjectReference() /** { "tree" :"CareTeam.subject", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Careteamobj.setEncounter(HapiFHIRHelpers.createReference(careteam.getCareTeamEncounterReference() /** { "tree" :"CareTeam.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Careteamobj.setPeriod(HapiFHIRHelpers.createPeriod(careteam.getCareTeamPeriodPeriodStart() /** { "tree" :"CareTeam.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setStart"} **/
						, careteam.getCareTeamPeriodPeriodEnd() /** { "tree" :"CareTeam.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setEnd"} **/
						));
Careteamobj.addRole(HapiFHIRHelpers.createCodeableConcept(careteam.getCrTmPrtcpntRlCcCdngCSstm() /** { "tree" :"CareTeam.participant.role", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addParticipant"] , "methodName" : "addRole, addCoding, setSystem"} **/
						, careteam.getCrTmPrtcpntRlCcCdngCVrsn() /** { "tree" :"CareTeam.participant.role", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addParticipant"] , "methodName" : "addRole, addCoding, setVersion"} **/
						, careteam.getCrTmPrtcpntRlCcCdngCCde() /** { "tree" :"CareTeam.participant.role", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addParticipant"] , "methodName" : "addRole, addCoding, setCode"} **/
						, careteam.getCrTmPrtcpntRlCcCdngCDsplay() /** { "tree" :"CareTeam.participant.role", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addParticipant"] , "methodName" : "addRole, addCoding, setDisplay"} **/
						, careteam.getCrTmPrtcpntRlCcCdngCSrSlctd() /** { "tree" :"CareTeam.participant.role", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addParticipant"] , "methodName" : "addRole, addCoding, setUserSelected"} **/
						, careteam.getCareTeamParticipantRoleCcText() /** { "tree" :"CareTeam.participant.role", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addParticipant"] , "methodName" : "addRole, setText"} **/
						));
Careteamobj.setMember(HapiFHIRHelpers.createReference(careteam.getCrTmPrtcpntMmbrRfrnce() /** { "tree" :"CareTeam.participant.member", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addParticipant"] , "methodName" : "setMember"} **/
						));
Careteamobj.setOnBehalfOf(HapiFHIRHelpers.createReference(careteam.getCrTmPrtcpntNBhlffRfrnce() /** { "tree" :"CareTeam.participant.onBehalfOf", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addParticipant"] , "methodName" : "setOnBehalfOf"} **/
						));
Careteamobj.setPeriod(HapiFHIRHelpers.createPeriod(careteam.getCrTmPrtcpntPrdPrdStrt() /** { "tree" :"CareTeam.participant.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addParticipant"] , "methodName" : "setPeriod, setStart"} **/
						, careteam.getCrTmPrtcpntPrdPrdNd() /** { "tree" :"CareTeam.participant.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addParticipant"] , "methodName" : "setPeriod, setEnd"} **/
						));
Careteamobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(careteam.getCrTmRsnCdCcCdngCSstm() /** { "tree" :"CareTeam.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, careteam.getCrTmRsnCdCcCdngCVrsn() /** { "tree" :"CareTeam.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, careteam.getCrTmRsnCdCcCdngCCde() /** { "tree" :"CareTeam.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, careteam.getCrTmRsnCdCcCdngCDsplay() /** { "tree" :"CareTeam.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, careteam.getCrTmRsnCdCcCdngCSrSlctd() /** { "tree" :"CareTeam.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, careteam.getCareTeamReasonCodeCcText() /** { "tree" :"CareTeam.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Careteamobj.addReasonReference(HapiFHIRHelpers.createReference(careteam.getCareTeamReasonReferenceReference() /** { "tree" :"CareTeam.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonReference"} **/
						));
Careteamobj.addManagingOrganization(HapiFHIRHelpers.createReference(careteam.getCrTmMngngrgnztnRfrnce() /** { "tree" :"CareTeam.managingOrganization", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addManagingOrganization"} **/
						));
Careteamobj.addTelecom(HapiFHIRHelpers.createContactPoint(careteam.getCrTmTlcmCntctPntSstm() /** { "tree" :"CareTeam.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setSystem"} **/
						, careteam.getCareTeamTelecomContactPointUse() /** { "tree" :"CareTeam.telecom", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setUse"} **/
						, careteam.getCrTmTlcmCntctPntPrdPrdStrt() /** { "tree" :"CareTeam.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setStart"} **/
						, careteam.getCrTmTlcmCntctPntPrdPrdNd() /** { "tree" :"CareTeam.telecom", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setPeriod, setEnd"} **/
						, careteam.getCareTeamTelecomContactPointRank() /** { "tree" :"CareTeam.telecom", "datatype" : "ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setRank"} **/
						, careteam.getCrTmTlcmCntctPntVlue() /** { "tree" :"CareTeam.telecom", "datatype" : "ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTelecom, setValue"} **/
						));
Careteamobj.addNote(HapiFHIRHelpers.createAnnotation(careteam.getCareTeamNoteAnnotationTime() /** { "tree" :"CareTeam.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, careteam.getCareTeamNoteAnnotationText() /** { "tree" :"CareTeam.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, careteam.getCrTmNtNnttnThrRfrnce() /** { "tree" :"CareTeam.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, careteam.getCrTmNtNnttnThrStrng() /** { "tree" :"CareTeam.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
		));
	}
}
