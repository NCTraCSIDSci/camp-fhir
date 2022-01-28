package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Auditevent.
 * @see .Auditevent
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class AuditeventConversion 
{
	public Patient Auditevents(main.templateoutput.Model.Auditevent auditevent) 
	{
			Patient  Auditeventobj = new Patient(); 

						Auditeventobj.setType(HapiFHIRHelpers.createCoding(auditevent.getAuditEventTypeCUserSelected() /** { "tree" :"AuditEvent.type", "datatype" : "Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, setUserSelected"} **/
						, auditevent.getAuditEventTypeCCode() /** { "tree" :"AuditEvent.type", "datatype" : "Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, setCode"} **/
						, auditevent.getAuditEventTypeCVersion() /** { "tree" :"AuditEvent.type", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, setVersion"} **/
						, auditevent.getAuditEventTypeCDisplay() /** { "tree" :"AuditEvent.type", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, setDisplay"} **/
						, auditevent.getAuditEventTypeCSystem() /** { "tree" :"AuditEvent.type", "datatype" : "Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, setSystem"} **/
						));
Auditeventobj.addSubtype(HapiFHIRHelpers.createCoding(auditevent.getAuditEventSubtypeCUserSelected() /** { "tree" :"AuditEvent.subtype", "datatype" : "Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSubtype, setUserSelected"} **/
						, auditevent.getAuditEventSubtypeCCode() /** { "tree" :"AuditEvent.subtype", "datatype" : "Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSubtype, setCode"} **/
						, auditevent.getAuditEventSubtypeCVersion() /** { "tree" :"AuditEvent.subtype", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSubtype, setVersion"} **/
						, auditevent.getAuditEventSubtypeCDisplay() /** { "tree" :"AuditEvent.subtype", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSubtype, setDisplay"} **/
						, auditevent.getAuditEventSubtypeCSystem() /** { "tree" :"AuditEvent.subtype", "datatype" : "Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSubtype, setSystem"} **/
						));
Auditeventobj.setAction(HapiFHIRHelpers.createcode(auditevent.getAuditEventActionCode() /** { "tree" :"AuditEvent.action", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAction"} **/
						));
Auditeventobj.setPeriod(HapiFHIRHelpers.createPeriod(auditevent.getAuditEventPeriodPeriodStart() /** { "tree" :"AuditEvent.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setStart"} **/
						, auditevent.getAuditEventPeriodPeriodEnd() /** { "tree" :"AuditEvent.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setEnd"} **/
						));
Auditeventobj.setRecorded(HapiFHIRHelpers.createinstant(auditevent.getAuditEventRecordedInstant() /** { "tree" :"AuditEvent.recorded", "datatype" : "instant", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setRecorded"} **/
						));
Auditeventobj.setOutcome(HapiFHIRHelpers.createcode(auditevent.getAuditEventOutcomeCode() /** { "tree" :"AuditEvent.outcome", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOutcome"} **/
						));
Auditeventobj.setOutcomeDesc(HapiFHIRHelpers.createstring(auditevent.getAuditEventOutcomeDescString() /** { "tree" :"AuditEvent.outcomeDesc", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOutcomeDesc"} **/
						));
Auditeventobj.addPurposeOfEvent(HapiFHIRHelpers.createCodeableConcept(auditevent.getAudtvntPrpsfvntCcCdngCSstm() /** { "tree" :"AuditEvent.purposeOfEvent", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPurposeOfEvent, addCoding, setSystem"} **/
						, auditevent.getAudtvntPrpsfvntCcCdngCVrsn() /** { "tree" :"AuditEvent.purposeOfEvent", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPurposeOfEvent, addCoding, setVersion"} **/
						, auditevent.getAudtvntPrpsfvntCcCdngCCde() /** { "tree" :"AuditEvent.purposeOfEvent", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPurposeOfEvent, addCoding, setCode"} **/
						, auditevent.getAudtvntPrpsfvntCcCdngCDsplay() /** { "tree" :"AuditEvent.purposeOfEvent", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPurposeOfEvent, addCoding, setDisplay"} **/
						, auditevent.getAudtvntPrpsfvntCcCdngCSrSlctd() /** { "tree" :"AuditEvent.purposeOfEvent", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPurposeOfEvent, addCoding, setUserSelected"} **/
						, auditevent.getAuditEventPurposeOfEventCcText() /** { "tree" :"AuditEvent.purposeOfEvent", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPurposeOfEvent, setText"} **/
						));
Auditeventobj.setType(HapiFHIRHelpers.createCodeableConcept(auditevent.getAudtvntGntTpCcCdngCSstm() /** { "tree" :"AuditEvent.agent.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addAgent"] , "methodName" : "setType, addCoding, setSystem"} **/
						, auditevent.getAudtvntGntTpCcCdngCVrsn() /** { "tree" :"AuditEvent.agent.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addAgent"] , "methodName" : "setType, addCoding, setVersion"} **/
						, auditevent.getAudtvntGntTpCcCdngCCde() /** { "tree" :"AuditEvent.agent.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addAgent"] , "methodName" : "setType, addCoding, setCode"} **/
						, auditevent.getAudtvntGntTpCcCdngCDsplay() /** { "tree" :"AuditEvent.agent.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addAgent"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, auditevent.getAudtvntGntTpCcCdngCSrSlctd() /** { "tree" :"AuditEvent.agent.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addAgent"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, auditevent.getAuditEventAgentTypeCcText() /** { "tree" :"AuditEvent.agent.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addAgent"] , "methodName" : "setType, setText"} **/
						));
Auditeventobj.addRole(HapiFHIRHelpers.createCodeableConcept(auditevent.getAudtvntGntRlCcCdngCSstm() /** { "tree" :"AuditEvent.agent.role", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addAgent"] , "methodName" : "addRole, addCoding, setSystem"} **/
						, auditevent.getAudtvntGntRlCcCdngCVrsn() /** { "tree" :"AuditEvent.agent.role", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addAgent"] , "methodName" : "addRole, addCoding, setVersion"} **/
						, auditevent.getAudtvntGntRlCcCdngCCde() /** { "tree" :"AuditEvent.agent.role", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addAgent"] , "methodName" : "addRole, addCoding, setCode"} **/
						, auditevent.getAudtvntGntRlCcCdngCDsplay() /** { "tree" :"AuditEvent.agent.role", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addAgent"] , "methodName" : "addRole, addCoding, setDisplay"} **/
						, auditevent.getAudtvntGntRlCcCdngCSrSlctd() /** { "tree" :"AuditEvent.agent.role", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addAgent"] , "methodName" : "addRole, addCoding, setUserSelected"} **/
						, auditevent.getAuditEventAgentRoleCcText() /** { "tree" :"AuditEvent.agent.role", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addAgent"] , "methodName" : "addRole, setText"} **/
						));
Auditeventobj.setWho(HapiFHIRHelpers.createReference(auditevent.getAuditEventAgentWhoReference() /** { "tree" :"AuditEvent.agent.who", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addAgent"] , "methodName" : "setWho"} **/
						));
Auditeventobj.setAltId(HapiFHIRHelpers.createstring(auditevent.getAuditEventAgentAltIdString() /** { "tree" :"AuditEvent.agent.altId", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addAgent"] , "methodName" : "setAltId"} **/
						));
Auditeventobj.setName(HapiFHIRHelpers.createstring(auditevent.getAuditEventAgentNameString() /** { "tree" :"AuditEvent.agent.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addAgent"] , "methodName" : "setName"} **/
						));
Auditeventobj.setRequestor(HapiFHIRHelpers.createboolean(auditevent.getAuditEventAgentRequestorBoolean() /** { "tree" :"AuditEvent.agent.requestor", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["addAgent"] , "methodName" : "setRequestor"} **/
						));
Auditeventobj.setLocation(HapiFHIRHelpers.createReference(auditevent.getAudtvntGntLctnRfrnce() /** { "tree" :"AuditEvent.agent.location", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addAgent"] , "methodName" : "setLocation"} **/
						));
Auditeventobj.addPolicy(HapiFHIRHelpers.createuri(auditevent.getAuditEventAgentPolicyUri() /** { "tree" :"AuditEvent.agent.policy", "datatype" : "uri", "cardinality" : "Many", "elementtree" : ["addAgent"] , "methodName" : "addPolicy"} **/
						));
Auditeventobj.setMedia(HapiFHIRHelpers.createCoding(auditevent.getAudtvntGntMdCSrSlctd() /** { "tree" :"AuditEvent.agent.media", "datatype" : "Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addAgent"] , "methodName" : "setMedia, setUserSelected"} **/
						, auditevent.getAuditEventAgentMediaCCode() /** { "tree" :"AuditEvent.agent.media", "datatype" : "Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addAgent"] , "methodName" : "setMedia, setCode"} **/
						, auditevent.getAuditEventAgentMediaCVersion() /** { "tree" :"AuditEvent.agent.media", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addAgent"] , "methodName" : "setMedia, setVersion"} **/
						, auditevent.getAuditEventAgentMediaCDisplay() /** { "tree" :"AuditEvent.agent.media", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addAgent"] , "methodName" : "setMedia, setDisplay"} **/
						, auditevent.getAuditEventAgentMediaCSystem() /** { "tree" :"AuditEvent.agent.media", "datatype" : "Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addAgent"] , "methodName" : "setMedia, setSystem"} **/
						));
Auditeventobj.setAddress(HapiFHIRHelpers.createstring(auditevent.getAudtvntGntNtwrkDdrssStrng() /** { "tree" :"AuditEvent.agent.network.address", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addAgent", "setNetwork"] , "methodName" : "setAddress"} **/
						));
Auditeventobj.setType(HapiFHIRHelpers.createcode(auditevent.getAuditEventAgentNetworkTypeCode() /** { "tree" :"AuditEvent.agent.network.type", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addAgent", "setNetwork"] , "methodName" : "setType"} **/
						));
Auditeventobj.addPurposeOfUse(HapiFHIRHelpers.createCodeableConcept(auditevent.getAudtvntGntPrpsfsCcCdngCSstm() /** { "tree" :"AuditEvent.agent.purposeOfUse", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addAgent", "setNetwork"] , "methodName" : "addPurposeOfUse, addCoding, setSystem"} **/
						, auditevent.getAudtvntGntPrpsfsCcCdngCVrsn() /** { "tree" :"AuditEvent.agent.purposeOfUse", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addAgent", "setNetwork"] , "methodName" : "addPurposeOfUse, addCoding, setVersion"} **/
						, auditevent.getAudtvntGntPrpsfsCcCdngCCde() /** { "tree" :"AuditEvent.agent.purposeOfUse", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addAgent", "setNetwork"] , "methodName" : "addPurposeOfUse, addCoding, setCode"} **/
						, auditevent.getAudtvntGntPrpsfsCcCdngCDsplay() /** { "tree" :"AuditEvent.agent.purposeOfUse", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addAgent", "setNetwork"] , "methodName" : "addPurposeOfUse, addCoding, setDisplay"} **/
						, auditevent.getAudtvntGntPrpsfsCcCdngCSrSlctd() /** { "tree" :"AuditEvent.agent.purposeOfUse", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addAgent", "setNetwork"] , "methodName" : "addPurposeOfUse, addCoding, setUserSelected"} **/
						, auditevent.getAudtvntGntPrpsfsCcTxt() /** { "tree" :"AuditEvent.agent.purposeOfUse", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addAgent", "setNetwork"] , "methodName" : "addPurposeOfUse, setText"} **/
						));
Auditeventobj.setSite(HapiFHIRHelpers.createstring(auditevent.getAuditEventSourceSiteString() /** { "tree" :"AuditEvent.source.site", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSource"] , "methodName" : "setSite"} **/
						));
Auditeventobj.setObserver(HapiFHIRHelpers.createReference(auditevent.getAudtvntSrcBsrvrRfrnce() /** { "tree" :"AuditEvent.source.observer", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["setSource"] , "methodName" : "setObserver"} **/
						));
Auditeventobj.addType(HapiFHIRHelpers.createCoding(auditevent.getAudtvntSrcTpCSrSlctd() /** { "tree" :"AuditEvent.source.type", "datatype" : "Coding, boolean", "cardinality" : "Many", "elementtree" : ["setSource"] , "methodName" : "addType, setUserSelected"} **/
						, auditevent.getAuditEventSourceTypeCCode() /** { "tree" :"AuditEvent.source.type", "datatype" : "Coding, code", "cardinality" : "Many", "elementtree" : ["setSource"] , "methodName" : "addType, setCode"} **/
						, auditevent.getAuditEventSourceTypeCVersion() /** { "tree" :"AuditEvent.source.type", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : ["setSource"] , "methodName" : "addType, setVersion"} **/
						, auditevent.getAuditEventSourceTypeCDisplay() /** { "tree" :"AuditEvent.source.type", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : ["setSource"] , "methodName" : "addType, setDisplay"} **/
						, auditevent.getAuditEventSourceTypeCSystem() /** { "tree" :"AuditEvent.source.type", "datatype" : "Coding, uri", "cardinality" : "Many", "elementtree" : ["setSource"] , "methodName" : "addType, setSystem"} **/
						));
Auditeventobj.setWhat(HapiFHIRHelpers.createReference(auditevent.getAuditEventEntityWhatReference() /** { "tree" :"AuditEvent.entity.what", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addEntity"] , "methodName" : "setWhat"} **/
						));
Auditeventobj.setType(HapiFHIRHelpers.createCoding(auditevent.getAudtvntNttTpCSrSlctd() /** { "tree" :"AuditEvent.entity.type", "datatype" : "Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addEntity"] , "methodName" : "setType, setUserSelected"} **/
						, auditevent.getAuditEventEntityTypeCCode() /** { "tree" :"AuditEvent.entity.type", "datatype" : "Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addEntity"] , "methodName" : "setType, setCode"} **/
						, auditevent.getAuditEventEntityTypeCVersion() /** { "tree" :"AuditEvent.entity.type", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addEntity"] , "methodName" : "setType, setVersion"} **/
						, auditevent.getAuditEventEntityTypeCDisplay() /** { "tree" :"AuditEvent.entity.type", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addEntity"] , "methodName" : "setType, setDisplay"} **/
						, auditevent.getAuditEventEntityTypeCSystem() /** { "tree" :"AuditEvent.entity.type", "datatype" : "Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addEntity"] , "methodName" : "setType, setSystem"} **/
						));
Auditeventobj.setRole(HapiFHIRHelpers.createCoding(auditevent.getAudtvntNttRlCSrSlctd() /** { "tree" :"AuditEvent.entity.role", "datatype" : "Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addEntity"] , "methodName" : "setRole, setUserSelected"} **/
						, auditevent.getAuditEventEntityRoleCCode() /** { "tree" :"AuditEvent.entity.role", "datatype" : "Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addEntity"] , "methodName" : "setRole, setCode"} **/
						, auditevent.getAuditEventEntityRoleCVersion() /** { "tree" :"AuditEvent.entity.role", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addEntity"] , "methodName" : "setRole, setVersion"} **/
						, auditevent.getAuditEventEntityRoleCDisplay() /** { "tree" :"AuditEvent.entity.role", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addEntity"] , "methodName" : "setRole, setDisplay"} **/
						, auditevent.getAuditEventEntityRoleCSystem() /** { "tree" :"AuditEvent.entity.role", "datatype" : "Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addEntity"] , "methodName" : "setRole, setSystem"} **/
						));
Auditeventobj.setLifecycle(HapiFHIRHelpers.createCoding(auditevent.getAudtvntNttLfcclCSrSlctd() /** { "tree" :"AuditEvent.entity.lifecycle", "datatype" : "Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addEntity"] , "methodName" : "setLifecycle, setUserSelected"} **/
						, auditevent.getAuditEventEntityLifecycleCCode() /** { "tree" :"AuditEvent.entity.lifecycle", "datatype" : "Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addEntity"] , "methodName" : "setLifecycle, setCode"} **/
						, auditevent.getAudtvntNttLfcclCVrsn() /** { "tree" :"AuditEvent.entity.lifecycle", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addEntity"] , "methodName" : "setLifecycle, setVersion"} **/
						, auditevent.getAudtvntNttLfcclCDsplay() /** { "tree" :"AuditEvent.entity.lifecycle", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addEntity"] , "methodName" : "setLifecycle, setDisplay"} **/
						, auditevent.getAudtvntNttLfcclCSstm() /** { "tree" :"AuditEvent.entity.lifecycle", "datatype" : "Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addEntity"] , "methodName" : "setLifecycle, setSystem"} **/
						));
Auditeventobj.addSecurityLabel(HapiFHIRHelpers.createCoding(auditevent.getAudtvntNttScrtLblCSrSlctd() /** { "tree" :"AuditEvent.entity.securityLabel", "datatype" : "Coding, boolean", "cardinality" : "Many", "elementtree" : ["addEntity"] , "methodName" : "addSecurityLabel, setUserSelected"} **/
						, auditevent.getAudtvntNttScrtLblCCde() /** { "tree" :"AuditEvent.entity.securityLabel", "datatype" : "Coding, code", "cardinality" : "Many", "elementtree" : ["addEntity"] , "methodName" : "addSecurityLabel, setCode"} **/
						, auditevent.getAudtvntNttScrtLblCVrsn() /** { "tree" :"AuditEvent.entity.securityLabel", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : ["addEntity"] , "methodName" : "addSecurityLabel, setVersion"} **/
						, auditevent.getAudtvntNttScrtLblCDsplay() /** { "tree" :"AuditEvent.entity.securityLabel", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : ["addEntity"] , "methodName" : "addSecurityLabel, setDisplay"} **/
						, auditevent.getAudtvntNttScrtLblCSstm() /** { "tree" :"AuditEvent.entity.securityLabel", "datatype" : "Coding, uri", "cardinality" : "Many", "elementtree" : ["addEntity"] , "methodName" : "addSecurityLabel, setSystem"} **/
						));
Auditeventobj.setName(HapiFHIRHelpers.createstring(auditevent.getAuditEventEntityNameString() /** { "tree" :"AuditEvent.entity.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addEntity"] , "methodName" : "setName"} **/
						));
Auditeventobj.setDescription(HapiFHIRHelpers.createstring(auditevent.getAudtvntNttDscrptnStrng() /** { "tree" :"AuditEvent.entity.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addEntity"] , "methodName" : "setDescription"} **/
						));
Auditeventobj.setQuery(HapiFHIRHelpers.createbase64Binary(auditevent.getAudtvntNttQrBs64bnry() /** { "tree" :"AuditEvent.entity.query", "datatype" : "base64Binary", "cardinality" : "ZeroOne", "elementtree" : ["addEntity"] , "methodName" : "setQuery"} **/
						));
Auditeventobj.setType(HapiFHIRHelpers.createstring(auditevent.getAudtvntNttDtlTpStrng() /** { "tree" :"AuditEvent.entity.detail.type", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addEntity", "addDetail"] , "methodName" : "setType"} **/
						));
Auditeventobj.setValueString(HapiFHIRHelpers.createstring(auditevent.getAudtvntNttDtlVlStrngStrng() /** { "tree" :"AuditEvent.entity.detail.valueString", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addEntity", "addDetail"] , "methodName" : "setValueString"} **/
						));
Auditeventobj.setValueBase64binary(HapiFHIRHelpers.createbase64Binary(auditevent.getAudtvntNttDtlVlBs64bnrBs64bnry() /** { "tree" :"AuditEvent.entity.detail.valueBase64binary", "datatype" : "base64Binary", "cardinality" : "Required", "elementtree" : ["addEntity", "addDetail"] , "methodName" : "setValueBase64binary"} **/
		));
	}
}
