package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Provenance.
 * @see .Provenance
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ProvenanceConversion 
{
	public Patient Provenances(main.templateoutput.Model.Provenance provenance) 
	{
			Patient  Provenanceobj = new Patient(); 

						Provenanceobj.Target(HapiFHIRHelpers.createReference(provenance.getProvenanceTargetReference() /** { "tree" :"Provenance.target", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "Target"} **/
						));
Provenanceobj.setOccurredPeriod(HapiFHIRHelpers.createPeriod(provenance.getPrvnncCcrrdPrdPrdStrt() /** { "tree" :"Provenance.occurredPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurredPeriod, setStart"} **/
						, provenance.getPrvnncCcrrdPrdPrdNd() /** { "tree" :"Provenance.occurredPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurredPeriod, setEnd"} **/
						));
Provenanceobj.setOccurred(HapiFHIRHelpers.createdateTimetype(provenance.getPrvnncCcrrdDttmDtTme() /** { "tree" :"Provenance.occurredDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurredDatetime"} **/
						));
Provenanceobj.setRecorded(HapiFHIRHelpers.createinstant(provenance.getProvenanceRecordedInstant() /** { "tree" :"Provenance.recorded", "datatype" : "instant", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setRecorded"} **/
						));
Provenanceobj.addPolicy(HapiFHIRHelpers.createuri(provenance.getProvenancePolicyUri() /** { "tree" :"Provenance.policy", "datatype" : "uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPolicy"} **/
						));
Provenanceobj.setLocation(HapiFHIRHelpers.createReference(provenance.getProvenanceLocationReference() /** { "tree" :"Provenance.location", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLocation"} **/
						));
Provenanceobj.addReason(HapiFHIRHelpers.createCodeableConcept(provenance.getPrvnncRsnCcCdngCSstm() /** { "tree" :"Provenance.reason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReason, addCoding, setSystem"} **/
						, provenance.getPrvnncRsnCcCdngCVrsn() /** { "tree" :"Provenance.reason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReason, addCoding, setVersion"} **/
						, provenance.getProvenanceReasonCcCodingCCode() /** { "tree" :"Provenance.reason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReason, addCoding, setCode"} **/
						, provenance.getPrvnncRsnCcCdngCDsplay() /** { "tree" :"Provenance.reason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReason, addCoding, setDisplay"} **/
						, provenance.getPrvnncRsnCcCdngCSrSlctd() /** { "tree" :"Provenance.reason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReason, addCoding, setUserSelected"} **/
						, provenance.getProvenanceReasonCcText() /** { "tree" :"Provenance.reason", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReason, setText"} **/
						));
Provenanceobj.setActivity(HapiFHIRHelpers.createCodeableConcept(provenance.getPrvnncCtvtCcCdngCSstm() /** { "tree" :"Provenance.activity", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActivity, addCoding, setSystem"} **/
						, provenance.getPrvnncCtvtCcCdngCVrsn() /** { "tree" :"Provenance.activity", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActivity, addCoding, setVersion"} **/
						, provenance.getPrvnncCtvtCcCdngCCde() /** { "tree" :"Provenance.activity", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActivity, addCoding, setCode"} **/
						, provenance.getPrvnncCtvtCcCdngCDsplay() /** { "tree" :"Provenance.activity", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActivity, addCoding, setDisplay"} **/
						, provenance.getPrvnncCtvtCcCdngCSrSlctd() /** { "tree" :"Provenance.activity", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActivity, addCoding, setUserSelected"} **/
						, provenance.getProvenanceActivityCcText() /** { "tree" :"Provenance.activity", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActivity, setText"} **/
						));
Provenanceobj.setType(HapiFHIRHelpers.createCodeableConcept(provenance.getPrvnncGntTpCcCdngCSstm() /** { "tree" :"Provenance.agent.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setAgent"] , "methodName" : "setType, addCoding, setSystem"} **/
						, provenance.getPrvnncGntTpCcCdngCVrsn() /** { "tree" :"Provenance.agent.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setAgent"] , "methodName" : "setType, addCoding, setVersion"} **/
						, provenance.getPrvnncGntTpCcCdngCCde() /** { "tree" :"Provenance.agent.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setAgent"] , "methodName" : "setType, addCoding, setCode"} **/
						, provenance.getPrvnncGntTpCcCdngCDsplay() /** { "tree" :"Provenance.agent.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setAgent"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, provenance.getPrvnncGntTpCcCdngCSrSlctd() /** { "tree" :"Provenance.agent.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setAgent"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, provenance.getProvenanceAgentTypeCcText() /** { "tree" :"Provenance.agent.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setAgent"] , "methodName" : "setType, setText"} **/
						));
Provenanceobj.addRole(HapiFHIRHelpers.createCodeableConcept(provenance.getPrvnncGntRlCcCdngCSstm() /** { "tree" :"Provenance.agent.role", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["setAgent"] , "methodName" : "addRole, addCoding, setSystem"} **/
						, provenance.getPrvnncGntRlCcCdngCVrsn() /** { "tree" :"Provenance.agent.role", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setAgent"] , "methodName" : "addRole, addCoding, setVersion"} **/
						, provenance.getPrvnncGntRlCcCdngCCde() /** { "tree" :"Provenance.agent.role", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["setAgent"] , "methodName" : "addRole, addCoding, setCode"} **/
						, provenance.getPrvnncGntRlCcCdngCDsplay() /** { "tree" :"Provenance.agent.role", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setAgent"] , "methodName" : "addRole, addCoding, setDisplay"} **/
						, provenance.getPrvnncGntRlCcCdngCSrSlctd() /** { "tree" :"Provenance.agent.role", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["setAgent"] , "methodName" : "addRole, addCoding, setUserSelected"} **/
						, provenance.getProvenanceAgentRoleCcText() /** { "tree" :"Provenance.agent.role", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["setAgent"] , "methodName" : "addRole, setText"} **/
						));
Provenanceobj.setWho(HapiFHIRHelpers.createReference(provenance.getProvenanceAgentWhoReference() /** { "tree" :"Provenance.agent.who", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["setAgent"] , "methodName" : "setWho"} **/
						));
Provenanceobj.setOnBehalfOf(HapiFHIRHelpers.createReference(provenance.getPrvnncGntNBhlffRfrnce() /** { "tree" :"Provenance.agent.onBehalfOf", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["setAgent"] , "methodName" : "setOnBehalfOf"} **/
						));
Provenanceobj.setRole(HapiFHIRHelpers.createcode(provenance.getProvenanceEntityRoleCode() /** { "tree" :"Provenance.entity.role", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addEntity"] , "methodName" : "setRole"} **/
						));
Provenanceobj.setWhat(HapiFHIRHelpers.createReference(provenance.getProvenanceEntityWhatReference() /** { "tree" :"Provenance.entity.what", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addEntity"] , "methodName" : "setWhat"} **/
						));
Provenanceobj.addAgent(HapiFHIRHelpers.createagent(provenance.getProvenanceEntityAgentAgent() /** { "tree" :"Provenance.entity.agent", "datatype" : "agent", "cardinality" : "Many", "elementtree" : ["addEntity"] , "methodName" : "addAgent"} **/
						));
Provenanceobj.addSignature(HapiFHIRHelpers.createSignature(provenance.getPrvnncSgntrSgntrDta() /** { "tree" :"Provenance.signature", "datatype" : "Signature, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSignature, setData"} **/
						, provenance.getPrvnncSgntrSgntrTrgtFrmt() /** { "tree" :"Provenance.signature", "datatype" : "Signature, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSignature, setTargetFormat"} **/
						, provenance.getPrvnncSgntrSgntrSgFrmt() /** { "tree" :"Provenance.signature", "datatype" : "Signature, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSignature, setSigFormat"} **/
						, provenance.getPrvnncSgntrSgntrTpCSstm() /** { "tree" :"Provenance.signature", "datatype" : "Signature, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSignature, addType, setSystem"} **/
						, provenance.getPrvnncSgntrSgntrTpCVrsn() /** { "tree" :"Provenance.signature", "datatype" : "Signature, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSignature, addType, setVersion"} **/
						, provenance.getPrvnncSgntrSgntrTpCCde() /** { "tree" :"Provenance.signature", "datatype" : "Signature, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSignature, addType, setCode"} **/
						, provenance.getPrvnncSgntrSgntrTpCDsplay() /** { "tree" :"Provenance.signature", "datatype" : "Signature, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSignature, addType, setDisplay"} **/
						, provenance.getPrvnncSgntrSgntrTpCSrSlctd() /** { "tree" :"Provenance.signature", "datatype" : "Signature, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSignature, addType, setUserSelected"} **/
						, provenance.getPrvnncSgntrSgntrWhn() /** { "tree" :"Provenance.signature", "datatype" : "Signature, instant", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSignature, setWhen"} **/
						, provenance.getProvenanceSignatureSignatureWho() /** { "tree" :"Provenance.signature", "datatype" : "Signature, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSignature, setWho"} **/
						, provenance.getPrvnncSgntrSgntrNBhlff() /** { "tree" :"Provenance.signature", "datatype" : "Signature, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSignature, setOnBehalfOf"} **/
		));
	}
}
