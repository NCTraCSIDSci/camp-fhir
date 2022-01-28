package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Encounter.
 * @see .Encounter
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class EncounterConversion 
{
	public Patient Encounters(main.templateoutput.Model.Encounter encounter) 
	{
			Patient  Encounterobj = new Patient(); 

						Encounterobj.addIdentifier(HapiFHIRHelpers.createIdentifier(encounter.getEncntrDntfrDntfrSe() /** { "tree" :"Encounter.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, encounter.getEncntrDntfrDntfrTpCcCSstm() /** { "tree" :"Encounter.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, encounter.getEncntrDntfrDntfrTpCcCVrsn() /** { "tree" :"Encounter.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, encounter.getEncntrDntfrDntfrTpCcCCde() /** { "tree" :"Encounter.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, encounter.getEncntrDntfrDntfrTpCcCDsplay() /** { "tree" :"Encounter.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, encounter.getEncntrDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Encounter.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, encounter.getEncntrDntfrDntfrTpCcTxt() /** { "tree" :"Encounter.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, encounter.getEncntrDntfrDntfrPrdPrdStrt() /** { "tree" :"Encounter.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, encounter.getEncntrDntfrDntfrPrdPrdNd() /** { "tree" :"Encounter.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, encounter.getEncntrDntfrDntfrSsgnr() /** { "tree" :"Encounter.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, encounter.getEncntrDntfrDntfrVlue() /** { "tree" :"Encounter.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, encounter.getEncntrDntfrDntfrSstm() /** { "tree" :"Encounter.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Encounterobj.setStatus(HapiFHIRHelpers.createcode(encounter.getEncounterStatusCode() /** { "tree" :"Encounter.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						, encounter.getEncntrSttsHstrSttsCde() /** { "tree" :"Encounter.statusHistory.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addStatusHistory"] , "methodName" : "setStatus"} **/
						));
Encounterobj.setPeriod(HapiFHIRHelpers.createPeriod(encounter.getEncntrSttsHstrPrdPrdStrt() /** { "tree" :"Encounter.statusHistory.period", "datatype" : "Period, dateTime", "cardinality" : "Required", "elementtree" : ["addStatusHistory"] , "methodName" : "setPeriod, setStart"} **/
						, encounter.getEncntrSttsHstrPrdPrdNd() /** { "tree" :"Encounter.statusHistory.period", "datatype" : "Period, dateTime", "cardinality" : "Required", "elementtree" : ["addStatusHistory"] , "methodName" : "setPeriod, setEnd"} **/
						));
Encounterobj.setClass(HapiFHIRHelpers.createCoding(encounter.getEncounterClassCUserSelected() /** { "tree" :"Encounter.class", "datatype" : "Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setClass, setUserSelected"} **/
						, encounter.getEncounterClassCCode() /** { "tree" :"Encounter.class", "datatype" : "Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setClass, setCode"} **/
						, encounter.getEncounterClassCVersion() /** { "tree" :"Encounter.class", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setClass, setVersion"} **/
						, encounter.getEncounterClassCDisplay() /** { "tree" :"Encounter.class", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setClass, setDisplay"} **/
						, encounter.getEncounterClassCSystem() /** { "tree" :"Encounter.class", "datatype" : "Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setClass, setSystem"} **/
						, encounter.getEncntrClssHstrClssCSrSlctd() /** { "tree" :"Encounter.classHistory.class", "datatype" : "Coding, boolean", "cardinality" : "Required", "elementtree" : ["addClassHistory"] , "methodName" : "setClass, setUserSelected"} **/
						, encounter.getEncntrClssHstrClssCCde() /** { "tree" :"Encounter.classHistory.class", "datatype" : "Coding, code", "cardinality" : "Required", "elementtree" : ["addClassHistory"] , "methodName" : "setClass, setCode"} **/
						, encounter.getEncntrClssHstrClssCVrsn() /** { "tree" :"Encounter.classHistory.class", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addClassHistory"] , "methodName" : "setClass, setVersion"} **/
						, encounter.getEncntrClssHstrClssCDsplay() /** { "tree" :"Encounter.classHistory.class", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addClassHistory"] , "methodName" : "setClass, setDisplay"} **/
						, encounter.getEncntrClssHstrClssCSstm() /** { "tree" :"Encounter.classHistory.class", "datatype" : "Coding, uri", "cardinality" : "Required", "elementtree" : ["addClassHistory"] , "methodName" : "setClass, setSystem"} **/
						));
Encounterobj.setPeriod(HapiFHIRHelpers.createPeriod(encounter.getEncntrClssHstrPrdPrdStrt() /** { "tree" :"Encounter.classHistory.period", "datatype" : "Period, dateTime", "cardinality" : "Required", "elementtree" : ["addClassHistory"] , "methodName" : "setPeriod, setStart"} **/
						, encounter.getEncntrClssHstrPrdPrdNd() /** { "tree" :"Encounter.classHistory.period", "datatype" : "Period, dateTime", "cardinality" : "Required", "elementtree" : ["addClassHistory"] , "methodName" : "setPeriod, setEnd"} **/
						));
Encounterobj.addType(HapiFHIRHelpers.createCodeableConcept(encounter.getEncounterTypeCcCodingCSystem() /** { "tree" :"Encounter.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setSystem"} **/
						, encounter.getEncounterTypeCcCodingCVersion() /** { "tree" :"Encounter.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setVersion"} **/
						, encounter.getEncounterTypeCcCodingCCode() /** { "tree" :"Encounter.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setCode"} **/
						, encounter.getEncounterTypeCcCodingCDisplay() /** { "tree" :"Encounter.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setDisplay"} **/
						, encounter.getEncntrTpCcCdngCSrSlctd() /** { "tree" :"Encounter.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setUserSelected"} **/
						, encounter.getEncounterTypeCcText() /** { "tree" :"Encounter.type", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, setText"} **/
						));
Encounterobj.setServiceType(HapiFHIRHelpers.createCodeableConcept(encounter.getEncntrSrvcTpCcCdngCSstm() /** { "tree" :"Encounter.serviceType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setServiceType, addCoding, setSystem"} **/
						, encounter.getEncntrSrvcTpCcCdngCVrsn() /** { "tree" :"Encounter.serviceType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setServiceType, addCoding, setVersion"} **/
						, encounter.getEncntrSrvcTpCcCdngCCde() /** { "tree" :"Encounter.serviceType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setServiceType, addCoding, setCode"} **/
						, encounter.getEncntrSrvcTpCcCdngCDsplay() /** { "tree" :"Encounter.serviceType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setServiceType, addCoding, setDisplay"} **/
						, encounter.getEncntrSrvcTpCcCdngCSrSlctd() /** { "tree" :"Encounter.serviceType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setServiceType, addCoding, setUserSelected"} **/
						, encounter.getEncounterServiceTypeCcText() /** { "tree" :"Encounter.serviceType", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setServiceType, setText"} **/
						));
Encounterobj.setPriority(HapiFHIRHelpers.createCodeableConcept(encounter.getEncntrPrrtCcCdngCSstm() /** { "tree" :"Encounter.priority", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority, addCoding, setSystem"} **/
						, encounter.getEncntrPrrtCcCdngCVrsn() /** { "tree" :"Encounter.priority", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority, addCoding, setVersion"} **/
						, encounter.getEncntrPrrtCcCdngCCde() /** { "tree" :"Encounter.priority", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority, addCoding, setCode"} **/
						, encounter.getEncntrPrrtCcCdngCDsplay() /** { "tree" :"Encounter.priority", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority, addCoding, setDisplay"} **/
						, encounter.getEncntrPrrtCcCdngCSrSlctd() /** { "tree" :"Encounter.priority", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority, addCoding, setUserSelected"} **/
						, encounter.getEncounterPriorityCcText() /** { "tree" :"Encounter.priority", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority, setText"} **/
						));
Encounterobj.setSubject(HapiFHIRHelpers.createReference(encounter.getEncounterSubjectReference() /** { "tree" :"Encounter.subject", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Encounterobj.addEpisodeOfCare(HapiFHIRHelpers.createReference(encounter.getEncounterEpisodeOfCareReference() /** { "tree" :"Encounter.episodeOfCare", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEpisodeOfCare"} **/
						));
Encounterobj.addBasedOn(HapiFHIRHelpers.createReference(encounter.getEncounterBasedOnReference() /** { "tree" :"Encounter.basedOn", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasedOn"} **/
						));
Encounterobj.addType(HapiFHIRHelpers.createCodeableConcept(encounter.getEncntrPrtcpntTpCcCdngCSstm() /** { "tree" :"Encounter.participant.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addParticipant"] , "methodName" : "addType, addCoding, setSystem"} **/
						, encounter.getEncntrPrtcpntTpCcCdngCVrsn() /** { "tree" :"Encounter.participant.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addParticipant"] , "methodName" : "addType, addCoding, setVersion"} **/
						, encounter.getEncntrPrtcpntTpCcCdngCCde() /** { "tree" :"Encounter.participant.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addParticipant"] , "methodName" : "addType, addCoding, setCode"} **/
						, encounter.getEncntrPrtcpntTpCcCdngCDsplay() /** { "tree" :"Encounter.participant.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addParticipant"] , "methodName" : "addType, addCoding, setDisplay"} **/
						, encounter.getEncntrPrtcpntTpCcCdngCSrSlctd() /** { "tree" :"Encounter.participant.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addParticipant"] , "methodName" : "addType, addCoding, setUserSelected"} **/
						, encounter.getEncounterParticipantTypeCcText() /** { "tree" :"Encounter.participant.type", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addParticipant"] , "methodName" : "addType, setText"} **/
						));
Encounterobj.setPeriod(HapiFHIRHelpers.createPeriod(encounter.getEncntrPrtcpntPrdPrdStrt() /** { "tree" :"Encounter.participant.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addParticipant"] , "methodName" : "setPeriod, setStart"} **/
						, encounter.getEncntrPrtcpntPrdPrdNd() /** { "tree" :"Encounter.participant.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addParticipant"] , "methodName" : "setPeriod, setEnd"} **/
						));
Encounterobj.setIndividual(HapiFHIRHelpers.createReference(encounter.getEncntrPrtcpntNdvdlRfrnce() /** { "tree" :"Encounter.participant.individual", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addParticipant"] , "methodName" : "setIndividual"} **/
						));
Encounterobj.addAppointment(HapiFHIRHelpers.createReference(encounter.getEncounterAppointmentReference() /** { "tree" :"Encounter.appointment", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAppointment"} **/
						));
Encounterobj.setPeriod(HapiFHIRHelpers.createPeriod(encounter.getEncounterPeriodPeriodStart() /** { "tree" :"Encounter.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setStart"} **/
						, encounter.getEncounterPeriodPeriodEnd() /** { "tree" :"Encounter.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setEnd"} **/
						));
Encounterobj.setLength(HapiFHIRHelpers.createDuration(encounter.getEncounterLengthDuration() /** { "tree" :"Encounter.length", "datatype" : "Duration", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLength"} **/
						));
Encounterobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(encounter.getEncntrRsnCdCcCdngCSstm() /** { "tree" :"Encounter.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, encounter.getEncntrRsnCdCcCdngCVrsn() /** { "tree" :"Encounter.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, encounter.getEncntrRsnCdCcCdngCCde() /** { "tree" :"Encounter.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, encounter.getEncntrRsnCdCcCdngCDsplay() /** { "tree" :"Encounter.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, encounter.getEncntrRsnCdCcCdngCSrSlctd() /** { "tree" :"Encounter.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, encounter.getEncounterReasonCodeCcText() /** { "tree" :"Encounter.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Encounterobj.addReasonReference(HapiFHIRHelpers.createReference(encounter.getEncntrRsnRfrncRfrnce() /** { "tree" :"Encounter.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonReference"} **/
						));
Encounterobj.setCondition(HapiFHIRHelpers.createReference(encounter.getEncntrDgnssCndtnRfrnce() /** { "tree" :"Encounter.diagnosis.condition", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addDiagnosis"] , "methodName" : "setCondition"} **/
						));
Encounterobj.setUse(HapiFHIRHelpers.createCodeableConcept(encounter.getEncntrDgnssSCcCdngCSstm() /** { "tree" :"Encounter.diagnosis.use", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setUse, addCoding, setSystem"} **/
						, encounter.getEncntrDgnssSCcCdngCVrsn() /** { "tree" :"Encounter.diagnosis.use", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setUse, addCoding, setVersion"} **/
						, encounter.getEncntrDgnssSCcCdngCCde() /** { "tree" :"Encounter.diagnosis.use", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setUse, addCoding, setCode"} **/
						, encounter.getEncntrDgnssSCcCdngCDsplay() /** { "tree" :"Encounter.diagnosis.use", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setUse, addCoding, setDisplay"} **/
						, encounter.getEncntrDgnssSCcCdngCSrSlctd() /** { "tree" :"Encounter.diagnosis.use", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setUse, addCoding, setUserSelected"} **/
						, encounter.getEncounterDiagnosisUseCcText() /** { "tree" :"Encounter.diagnosis.use", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setUse, setText"} **/
						));
Encounterobj.setRank(HapiFHIRHelpers.createpositiveInt(encounter.getEncntrDgnssRnkPstvnt() /** { "tree" :"Encounter.diagnosis.rank", "datatype" : "positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setRank"} **/
						));
Encounterobj.addAccount(HapiFHIRHelpers.createReference(encounter.getEncounterAccountReference() /** { "tree" :"Encounter.account", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAccount"} **/
						));
Encounterobj.setPreAdmissionIdentifier(HapiFHIRHelpers.createIdentifier(encounter.getEncntrHsptlztnPrdmssndntfrDntfrSe() /** { "tree" :"Encounter.hospitalization.preAdmissionIdentifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setPreAdmissionIdentifier, setUse"} **/
						, encounter.getEncntrHsptlztnPrdmssndntfrDntfrTpCcCSstm() /** { "tree" :"Encounter.hospitalization.preAdmissionIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setPreAdmissionIdentifier, setType, addCoding, setSystem"} **/
						, encounter.getEncntrHsptlztnPrdmssndntfrDntfrTpCcCVrsn() /** { "tree" :"Encounter.hospitalization.preAdmissionIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setPreAdmissionIdentifier, setType, addCoding, setVersion"} **/
						, encounter.getEncntrHsptlztnPrdmssndntfrDntfrTpCcCCde() /** { "tree" :"Encounter.hospitalization.preAdmissionIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setPreAdmissionIdentifier, setType, addCoding, setCode"} **/
						, encounter.getEncntrHsptlztnPrdmssndntfrDntfrTpCcCDsplay() /** { "tree" :"Encounter.hospitalization.preAdmissionIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setPreAdmissionIdentifier, setType, addCoding, setDisplay"} **/
						, encounter.getEncntrHsptlztnPrdmssndntfrDntfrTpCcCSrSlctd() /** { "tree" :"Encounter.hospitalization.preAdmissionIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setPreAdmissionIdentifier, setType, addCoding, setUserSelected"} **/
						, encounter.getEncntrHsptlztnPrdmssndntfrDntfrTpCcTxt() /** { "tree" :"Encounter.hospitalization.preAdmissionIdentifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setPreAdmissionIdentifier, setType, setText"} **/
						, encounter.getEncntrHsptlztnPrdmssndntfrDntfrPrdPrdStrt() /** { "tree" :"Encounter.hospitalization.preAdmissionIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setPreAdmissionIdentifier, setPeriod, setStart"} **/
						, encounter.getEncntrHsptlztnPrdmssndntfrDntfrPrdPrdNd() /** { "tree" :"Encounter.hospitalization.preAdmissionIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setPreAdmissionIdentifier, setPeriod, setEnd"} **/
						, encounter.getEncntrHsptlztnPrdmssndntfrDntfrSsgnr() /** { "tree" :"Encounter.hospitalization.preAdmissionIdentifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setPreAdmissionIdentifier, setAssigner"} **/
						, encounter.getEncntrHsptlztnPrdmssndntfrDntfrVlue() /** { "tree" :"Encounter.hospitalization.preAdmissionIdentifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setPreAdmissionIdentifier, setValue"} **/
						, encounter.getEncntrHsptlztnPrdmssndntfrDntfrSstm() /** { "tree" :"Encounter.hospitalization.preAdmissionIdentifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setPreAdmissionIdentifier, setSystem"} **/
						));
Encounterobj.setOrigin(HapiFHIRHelpers.createReference(encounter.getEncntrHsptlztnRgnRfrnce() /** { "tree" :"Encounter.hospitalization.origin", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setOrigin"} **/
						));
Encounterobj.setAdmitSource(HapiFHIRHelpers.createCodeableConcept(encounter.getEncntrHsptlztnDmtSrcCcCdngCSstm() /** { "tree" :"Encounter.hospitalization.admitSource", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setAdmitSource, addCoding, setSystem"} **/
						, encounter.getEncntrHsptlztnDmtSrcCcCdngCVrsn() /** { "tree" :"Encounter.hospitalization.admitSource", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setAdmitSource, addCoding, setVersion"} **/
						, encounter.getEncntrHsptlztnDmtSrcCcCdngCCde() /** { "tree" :"Encounter.hospitalization.admitSource", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setAdmitSource, addCoding, setCode"} **/
						, encounter.getEncntrHsptlztnDmtSrcCcCdngCDsplay() /** { "tree" :"Encounter.hospitalization.admitSource", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setAdmitSource, addCoding, setDisplay"} **/
						, encounter.getEncntrHsptlztnDmtSrcCcCdngCSrSlctd() /** { "tree" :"Encounter.hospitalization.admitSource", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setAdmitSource, addCoding, setUserSelected"} **/
						, encounter.getEncntrHsptlztnDmtSrcCcTxt() /** { "tree" :"Encounter.hospitalization.admitSource", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setAdmitSource, setText"} **/
						));
Encounterobj.setReAdmission(HapiFHIRHelpers.createCodeableConcept(encounter.getEncntrHsptlztnRdmssnCcCdngCSstm() /** { "tree" :"Encounter.hospitalization.reAdmission", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setReAdmission, addCoding, setSystem"} **/
						, encounter.getEncntrHsptlztnRdmssnCcCdngCVrsn() /** { "tree" :"Encounter.hospitalization.reAdmission", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setReAdmission, addCoding, setVersion"} **/
						, encounter.getEncntrHsptlztnRdmssnCcCdngCCde() /** { "tree" :"Encounter.hospitalization.reAdmission", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setReAdmission, addCoding, setCode"} **/
						, encounter.getEncntrHsptlztnRdmssnCcCdngCDsplay() /** { "tree" :"Encounter.hospitalization.reAdmission", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setReAdmission, addCoding, setDisplay"} **/
						, encounter.getEncntrHsptlztnRdmssnCcCdngCSrSlctd() /** { "tree" :"Encounter.hospitalization.reAdmission", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setReAdmission, addCoding, setUserSelected"} **/
						, encounter.getEncntrHsptlztnRdmssnCcTxt() /** { "tree" :"Encounter.hospitalization.reAdmission", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setReAdmission, setText"} **/
						));
Encounterobj.addDietPreference(HapiFHIRHelpers.createCodeableConcept(encounter.getEncntrHsptlztnDtPrfrncCcCdngCSstm() /** { "tree" :"Encounter.hospitalization.dietPreference", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["setHospitalization"] , "methodName" : "addDietPreference, addCoding, setSystem"} **/
						, encounter.getEncntrHsptlztnDtPrfrncCcCdngCVrsn() /** { "tree" :"Encounter.hospitalization.dietPreference", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setHospitalization"] , "methodName" : "addDietPreference, addCoding, setVersion"} **/
						, encounter.getEncntrHsptlztnDtPrfrncCcCdngCCde() /** { "tree" :"Encounter.hospitalization.dietPreference", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["setHospitalization"] , "methodName" : "addDietPreference, addCoding, setCode"} **/
						, encounter.getEncntrHsptlztnDtPrfrncCcCdngCDsplay() /** { "tree" :"Encounter.hospitalization.dietPreference", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setHospitalization"] , "methodName" : "addDietPreference, addCoding, setDisplay"} **/
						, encounter.getEncntrHsptlztnDtPrfrncCcCdngCSrSlctd() /** { "tree" :"Encounter.hospitalization.dietPreference", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["setHospitalization"] , "methodName" : "addDietPreference, addCoding, setUserSelected"} **/
						, encounter.getEncntrHsptlztnDtPrfrncCcTxt() /** { "tree" :"Encounter.hospitalization.dietPreference", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["setHospitalization"] , "methodName" : "addDietPreference, setText"} **/
						));
Encounterobj.addSpecialCourtesy(HapiFHIRHelpers.createCodeableConcept(encounter.getEncntrHsptlztnSpclCrtsCcCdngCSstm() /** { "tree" :"Encounter.hospitalization.specialCourtesy", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["setHospitalization"] , "methodName" : "addSpecialCourtesy, addCoding, setSystem"} **/
						, encounter.getEncntrHsptlztnSpclCrtsCcCdngCVrsn() /** { "tree" :"Encounter.hospitalization.specialCourtesy", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setHospitalization"] , "methodName" : "addSpecialCourtesy, addCoding, setVersion"} **/
						, encounter.getEncntrHsptlztnSpclCrtsCcCdngCCde() /** { "tree" :"Encounter.hospitalization.specialCourtesy", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["setHospitalization"] , "methodName" : "addSpecialCourtesy, addCoding, setCode"} **/
						, encounter.getEncntrHsptlztnSpclCrtsCcCdngCDsplay() /** { "tree" :"Encounter.hospitalization.specialCourtesy", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setHospitalization"] , "methodName" : "addSpecialCourtesy, addCoding, setDisplay"} **/
						, encounter.getEncntrHsptlztnSpclCrtsCcCdngCSrSlctd() /** { "tree" :"Encounter.hospitalization.specialCourtesy", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["setHospitalization"] , "methodName" : "addSpecialCourtesy, addCoding, setUserSelected"} **/
						, encounter.getEncntrHsptlztnSpclCrtsCcTxt() /** { "tree" :"Encounter.hospitalization.specialCourtesy", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["setHospitalization"] , "methodName" : "addSpecialCourtesy, setText"} **/
						));
Encounterobj.addSpecialArrangement(HapiFHIRHelpers.createCodeableConcept(encounter.getEncntrHsptlztnSpclrrngmntCcCdngCSstm() /** { "tree" :"Encounter.hospitalization.specialArrangement", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["setHospitalization"] , "methodName" : "addSpecialArrangement, addCoding, setSystem"} **/
						, encounter.getEncntrHsptlztnSpclrrngmntCcCdngCVrsn() /** { "tree" :"Encounter.hospitalization.specialArrangement", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setHospitalization"] , "methodName" : "addSpecialArrangement, addCoding, setVersion"} **/
						, encounter.getEncntrHsptlztnSpclrrngmntCcCdngCCde() /** { "tree" :"Encounter.hospitalization.specialArrangement", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["setHospitalization"] , "methodName" : "addSpecialArrangement, addCoding, setCode"} **/
						, encounter.getEncntrHsptlztnSpclrrngmntCcCdngCDsplay() /** { "tree" :"Encounter.hospitalization.specialArrangement", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setHospitalization"] , "methodName" : "addSpecialArrangement, addCoding, setDisplay"} **/
						, encounter.getEncntrHsptlztnSpclrrngmntCcCdngCSrSlctd() /** { "tree" :"Encounter.hospitalization.specialArrangement", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["setHospitalization"] , "methodName" : "addSpecialArrangement, addCoding, setUserSelected"} **/
						, encounter.getEncntrHsptlztnSpclrrngmntCcTxt() /** { "tree" :"Encounter.hospitalization.specialArrangement", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["setHospitalization"] , "methodName" : "addSpecialArrangement, setText"} **/
						));
Encounterobj.setDestination(HapiFHIRHelpers.createReference(encounter.getEncntrHsptlztnDstntnRfrnce() /** { "tree" :"Encounter.hospitalization.destination", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setDestination"} **/
						));
Encounterobj.setDischargeDisposition(HapiFHIRHelpers.createCodeableConcept(encounter.getEncntrHsptlztnDschrgDspstnCcCdngCSstm() /** { "tree" :"Encounter.hospitalization.dischargeDisposition", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setDischargeDisposition, addCoding, setSystem"} **/
						, encounter.getEncntrHsptlztnDschrgDspstnCcCdngCVrsn() /** { "tree" :"Encounter.hospitalization.dischargeDisposition", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setDischargeDisposition, addCoding, setVersion"} **/
						, encounter.getEncntrHsptlztnDschrgDspstnCcCdngCCde() /** { "tree" :"Encounter.hospitalization.dischargeDisposition", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setDischargeDisposition, addCoding, setCode"} **/
						, encounter.getEncntrHsptlztnDschrgDspstnCcCdngCDsplay() /** { "tree" :"Encounter.hospitalization.dischargeDisposition", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setDischargeDisposition, addCoding, setDisplay"} **/
						, encounter.getEncntrHsptlztnDschrgDspstnCcCdngCSrSlctd() /** { "tree" :"Encounter.hospitalization.dischargeDisposition", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setDischargeDisposition, addCoding, setUserSelected"} **/
						, encounter.getEncntrHsptlztnDschrgDspstnCcTxt() /** { "tree" :"Encounter.hospitalization.dischargeDisposition", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setHospitalization"] , "methodName" : "setDischargeDisposition, setText"} **/
						));
Encounterobj.setLocation(HapiFHIRHelpers.createReference(encounter.getEncntrLctnLctnRfrnce() /** { "tree" :"Encounter.location.location", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addLocation"] , "methodName" : "setLocation"} **/
						));
Encounterobj.setStatus(HapiFHIRHelpers.createcode(encounter.getEncounterLocationStatusCode() /** { "tree" :"Encounter.location.status", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addLocation"] , "methodName" : "setStatus"} **/
						));
Encounterobj.setPhysicalType(HapiFHIRHelpers.createCodeableConcept(encounter.getEncntrLctnPhsclTpCcCdngCSstm() /** { "tree" :"Encounter.location.physicalType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addLocation"] , "methodName" : "setPhysicalType, addCoding, setSystem"} **/
						, encounter.getEncntrLctnPhsclTpCcCdngCVrsn() /** { "tree" :"Encounter.location.physicalType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addLocation"] , "methodName" : "setPhysicalType, addCoding, setVersion"} **/
						, encounter.getEncntrLctnPhsclTpCcCdngCCde() /** { "tree" :"Encounter.location.physicalType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addLocation"] , "methodName" : "setPhysicalType, addCoding, setCode"} **/
						, encounter.getEncntrLctnPhsclTpCcCdngCDsplay() /** { "tree" :"Encounter.location.physicalType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addLocation"] , "methodName" : "setPhysicalType, addCoding, setDisplay"} **/
						, encounter.getEncntrLctnPhsclTpCcCdngCSrSlctd() /** { "tree" :"Encounter.location.physicalType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addLocation"] , "methodName" : "setPhysicalType, addCoding, setUserSelected"} **/
						, encounter.getEncntrLctnPhsclTpCcTxt() /** { "tree" :"Encounter.location.physicalType", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addLocation"] , "methodName" : "setPhysicalType, setText"} **/
						));
Encounterobj.setPeriod(HapiFHIRHelpers.createPeriod(encounter.getEncntrLctnPrdPrdStrt() /** { "tree" :"Encounter.location.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addLocation"] , "methodName" : "setPeriod, setStart"} **/
						, encounter.getEncntrLctnPrdPrdNd() /** { "tree" :"Encounter.location.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addLocation"] , "methodName" : "setPeriod, setEnd"} **/
						));
Encounterobj.setServiceProvider(HapiFHIRHelpers.createReference(encounter.getEncntrSrvcPrvdrRfrnce() /** { "tree" :"Encounter.serviceProvider", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setServiceProvider"} **/
						));
Encounterobj.setPartOf(HapiFHIRHelpers.createReference(encounter.getEncounterPartOfReference() /** { "tree" :"Encounter.partOf", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPartOf"} **/
		));
	}
}
