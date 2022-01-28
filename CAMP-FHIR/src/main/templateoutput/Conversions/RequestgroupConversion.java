package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Requestgroup.
 * @see .Requestgroup
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class RequestgroupConversion 
{
	public Patient Requestgroups(main.templateoutput.Model.Requestgroup requestgroup) 
	{
			Patient  Requestgroupobj = new Patient(); 

						Requestgroupobj.addIdentifier(HapiFHIRHelpers.createIdentifier(requestgroup.getRqstGrpDntfrDntfrSe() /** { "tree" :"RequestGroup.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, requestgroup.getRqstGrpDntfrDntfrTpCcCSstm() /** { "tree" :"RequestGroup.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, requestgroup.getRqstGrpDntfrDntfrTpCcCVrsn() /** { "tree" :"RequestGroup.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, requestgroup.getRqstGrpDntfrDntfrTpCcCCde() /** { "tree" :"RequestGroup.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, requestgroup.getRqstGrpDntfrDntfrTpCcCDsplay() /** { "tree" :"RequestGroup.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, requestgroup.getRqstGrpDntfrDntfrTpCcCSrSlctd() /** { "tree" :"RequestGroup.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, requestgroup.getRqstGrpDntfrDntfrTpCcTxt() /** { "tree" :"RequestGroup.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, requestgroup.getRqstGrpDntfrDntfrPrdPrdStrt() /** { "tree" :"RequestGroup.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, requestgroup.getRqstGrpDntfrDntfrPrdPrdNd() /** { "tree" :"RequestGroup.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, requestgroup.getRqstGrpDntfrDntfrSsgnr() /** { "tree" :"RequestGroup.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, requestgroup.getRqstGrpDntfrDntfrVlue() /** { "tree" :"RequestGroup.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, requestgroup.getRqstGrpDntfrDntfrSstm() /** { "tree" :"RequestGroup.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Requestgroupobj.addInstantiatesCanonical(HapiFHIRHelpers.createcanonical(requestgroup.getRqstGrpNstnttsCnnclCnncl() /** { "tree" :"RequestGroup.instantiatesCanonical", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInstantiatesCanonical"} **/
						));
Requestgroupobj.addInstantiatesUri(HapiFHIRHelpers.createuri(requestgroup.getRequestGroupInstantiatesUriUri() /** { "tree" :"RequestGroup.instantiatesUri", "datatype" : "uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInstantiatesUri"} **/
						));
Requestgroupobj.addBasedOn(HapiFHIRHelpers.createReference(requestgroup.getRequestGroupBasedOnReference() /** { "tree" :"RequestGroup.basedOn", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasedOn"} **/
						));
Requestgroupobj.addReplaces(HapiFHIRHelpers.createReference(requestgroup.getRequestGroupReplacesReference() /** { "tree" :"RequestGroup.replaces", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReplaces"} **/
						));
Requestgroupobj.setGroupIdentifier(HapiFHIRHelpers.createIdentifier(requestgroup.getRqstGrpGrpdntfrDntfrSe() /** { "tree" :"RequestGroup.groupIdentifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setUse"} **/
						, requestgroup.getRqstGrpGrpdntfrDntfrTpCcCSstm() /** { "tree" :"RequestGroup.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setSystem"} **/
						, requestgroup.getRqstGrpGrpdntfrDntfrTpCcCVrsn() /** { "tree" :"RequestGroup.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setVersion"} **/
						, requestgroup.getRqstGrpGrpdntfrDntfrTpCcCCde() /** { "tree" :"RequestGroup.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setCode"} **/
						, requestgroup.getRqstGrpGrpdntfrDntfrTpCcCDsplay() /** { "tree" :"RequestGroup.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setDisplay"} **/
						, requestgroup.getRqstGrpGrpdntfrDntfrTpCcCSrSlctd() /** { "tree" :"RequestGroup.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setUserSelected"} **/
						, requestgroup.getRqstGrpGrpdntfrDntfrTpCcTxt() /** { "tree" :"RequestGroup.groupIdentifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, setText"} **/
						, requestgroup.getRqstGrpGrpdntfrDntfrPrdPrdStrt() /** { "tree" :"RequestGroup.groupIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setPeriod, setStart"} **/
						, requestgroup.getRqstGrpGrpdntfrDntfrPrdPrdNd() /** { "tree" :"RequestGroup.groupIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setPeriod, setEnd"} **/
						, requestgroup.getRqstGrpGrpdntfrDntfrSsgnr() /** { "tree" :"RequestGroup.groupIdentifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setAssigner"} **/
						, requestgroup.getRqstGrpGrpdntfrDntfrVlue() /** { "tree" :"RequestGroup.groupIdentifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setValue"} **/
						, requestgroup.getRqstGrpGrpdntfrDntfrSstm() /** { "tree" :"RequestGroup.groupIdentifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setSystem"} **/
						));
Requestgroupobj.setStatus(HapiFHIRHelpers.createcode(requestgroup.getRequestGroupStatusCode() /** { "tree" :"RequestGroup.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Requestgroupobj.setIntent(HapiFHIRHelpers.createcode(requestgroup.getRequestGroupIntentCode() /** { "tree" :"RequestGroup.intent", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setIntent"} **/
						));
Requestgroupobj.setPriority(HapiFHIRHelpers.createcode(requestgroup.getRequestGroupPriorityCode() /** { "tree" :"RequestGroup.priority", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority"} **/
						));
Requestgroupobj.setCode(HapiFHIRHelpers.createCodeableConcept(requestgroup.getRqstGrpCdCcCdngCSstm() /** { "tree" :"RequestGroup.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, requestgroup.getRqstGrpCdCcCdngCVrsn() /** { "tree" :"RequestGroup.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, requestgroup.getRequestGroupCodeCcCodingCCode() /** { "tree" :"RequestGroup.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, requestgroup.getRqstGrpCdCcCdngCDsplay() /** { "tree" :"RequestGroup.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, requestgroup.getRqstGrpCdCcCdngCSrSlctd() /** { "tree" :"RequestGroup.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, requestgroup.getRequestGroupCodeCcText() /** { "tree" :"RequestGroup.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Requestgroupobj.setSubject(HapiFHIRHelpers.createReference(requestgroup.getRequestGroupSubjectReference() /** { "tree" :"RequestGroup.subject", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Requestgroupobj.setEncounter(HapiFHIRHelpers.createReference(requestgroup.getRequestGroupEncounterReference() /** { "tree" :"RequestGroup.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Requestgroupobj.setAuthoredOn(HapiFHIRHelpers.createdateTime(requestgroup.getRequestGroupAuthoredOnDateTime() /** { "tree" :"RequestGroup.authoredOn", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAuthoredOn"} **/
						));
Requestgroupobj.setAuthor(HapiFHIRHelpers.createReference(requestgroup.getRequestGroupAuthorReference() /** { "tree" :"RequestGroup.author", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAuthor"} **/
						));
Requestgroupobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(requestgroup.getRqstGrpRsnCdCcCdngCSstm() /** { "tree" :"RequestGroup.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, requestgroup.getRqstGrpRsnCdCcCdngCVrsn() /** { "tree" :"RequestGroup.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, requestgroup.getRqstGrpRsnCdCcCdngCCde() /** { "tree" :"RequestGroup.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, requestgroup.getRqstGrpRsnCdCcCdngCDsplay() /** { "tree" :"RequestGroup.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, requestgroup.getRqstGrpRsnCdCcCdngCSrSlctd() /** { "tree" :"RequestGroup.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, requestgroup.getRequestGroupReasonCodeCcText() /** { "tree" :"RequestGroup.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Requestgroupobj.addReasonReference(HapiFHIRHelpers.createReference(requestgroup.getRqstGrpRsnRfrncRfrnce() /** { "tree" :"RequestGroup.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonReference"} **/
						));
Requestgroupobj.addNote(HapiFHIRHelpers.createAnnotation(requestgroup.getRequestGroupNoteAnnotationTime() /** { "tree" :"RequestGroup.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, requestgroup.getRequestGroupNoteAnnotationText() /** { "tree" :"RequestGroup.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, requestgroup.getRqstGrpNtNnttnThrRfrnce() /** { "tree" :"RequestGroup.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, requestgroup.getRqstGrpNtNnttnThrStrng() /** { "tree" :"RequestGroup.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Requestgroupobj.setPrefix(HapiFHIRHelpers.createstring(requestgroup.getRequestGroupActionPrefixString() /** { "tree" :"RequestGroup.action.prefix", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addAction"] , "methodName" : "setPrefix"} **/
						));
Requestgroupobj.setTitle(HapiFHIRHelpers.createstring(requestgroup.getRequestGroupActionTitleString() /** { "tree" :"RequestGroup.action.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addAction"] , "methodName" : "setTitle"} **/
						));
Requestgroupobj.setDescription(HapiFHIRHelpers.createstring(requestgroup.getRqstGrpCtnDscrptnStrng() /** { "tree" :"RequestGroup.action.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addAction"] , "methodName" : "setDescription"} **/
						));
Requestgroupobj.setTextEquivalent(HapiFHIRHelpers.createstring(requestgroup.getRqstGrpCtnTxtqvlntStrng() /** { "tree" :"RequestGroup.action.textEquivalent", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addAction"] , "methodName" : "setTextEquivalent"} **/
						));
Requestgroupobj.setPriority(HapiFHIRHelpers.createcode(requestgroup.getRequestGroupActionPriorityCode() /** { "tree" :"RequestGroup.action.priority", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addAction"] , "methodName" : "setPriority"} **/
						));
Requestgroupobj.addCode(HapiFHIRHelpers.createCodeableConcept(requestgroup.getRqstGrpCtnCdCcCdngCSstm() /** { "tree" :"RequestGroup.action.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addCode, addCoding, setSystem"} **/
						, requestgroup.getRqstGrpCtnCdCcCdngCVrsn() /** { "tree" :"RequestGroup.action.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addCode, addCoding, setVersion"} **/
						, requestgroup.getRqstGrpCtnCdCcCdngCCde() /** { "tree" :"RequestGroup.action.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addCode, addCoding, setCode"} **/
						, requestgroup.getRqstGrpCtnCdCcCdngCDsplay() /** { "tree" :"RequestGroup.action.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addCode, addCoding, setDisplay"} **/
						, requestgroup.getRqstGrpCtnCdCcCdngCSrSlctd() /** { "tree" :"RequestGroup.action.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addCode, addCoding, setUserSelected"} **/
						, requestgroup.getRequestGroupActionCodeCcText() /** { "tree" :"RequestGroup.action.code", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addCode, setText"} **/
						));
Requestgroupobj.addDocumentation(HapiFHIRHelpers.createRelatedArtifact(requestgroup.getRqstGrpCtnDcmnttnRltdrtfctDcmntTtchmntCntntTpe() /** { "tree" :"RequestGroup.action.documentation", "datatype" : "RelatedArtifact, Attachment, code", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addDocumentation, setDocument, setContentType"} **/
						, requestgroup.getRqstGrpCtnDcmnttnRltdrtfctDcmntTtchmntLngge() /** { "tree" :"RequestGroup.action.documentation", "datatype" : "RelatedArtifact, Attachment, code", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addDocumentation, setDocument, setLanguage"} **/
						, requestgroup.getRqstGrpCtnDcmnttnRltdrtfctDcmntTtchmntDta() /** { "tree" :"RequestGroup.action.documentation", "datatype" : "RelatedArtifact, Attachment, base64Binary", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addDocumentation, setDocument, setData"} **/
						, requestgroup.getRqstGrpCtnDcmnttnRltdrtfctDcmntTtchmntRl() /** { "tree" :"RequestGroup.action.documentation", "datatype" : "RelatedArtifact, Attachment, url", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addDocumentation, setDocument, setUrl"} **/
						, requestgroup.getRqstGrpCtnDcmnttnRltdrtfctDcmntTtchmntSze() /** { "tree" :"RequestGroup.action.documentation", "datatype" : "RelatedArtifact, Attachment, unsignedInt", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addDocumentation, setDocument, setSize"} **/
						, requestgroup.getRqstGrpCtnDcmnttnRltdrtfctDcmntTtchmntHsh() /** { "tree" :"RequestGroup.action.documentation", "datatype" : "RelatedArtifact, Attachment, base64Binary", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addDocumentation, setDocument, setHash"} **/
						, requestgroup.getRqstGrpCtnDcmnttnRltdrtfctDcmntTtchmntTtle() /** { "tree" :"RequestGroup.action.documentation", "datatype" : "RelatedArtifact, Attachment, string", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addDocumentation, setDocument, setTitle"} **/
						, requestgroup.getRqstGrpCtnDcmnttnRltdrtfctDcmntTtchmntCrtn() /** { "tree" :"RequestGroup.action.documentation", "datatype" : "RelatedArtifact, Attachment, dateTime", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addDocumentation, setDocument, setCreation"} **/
						, requestgroup.getRqstGrpCtnDcmnttnRltdrtfctRsrce() /** { "tree" :"RequestGroup.action.documentation", "datatype" : "RelatedArtifact, canonical", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addDocumentation, setResource"} **/
						, requestgroup.getRqstGrpCtnDcmnttnRltdrtfctTpe() /** { "tree" :"RequestGroup.action.documentation", "datatype" : "RelatedArtifact, code", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addDocumentation, setType"} **/
						, requestgroup.getRqstGrpCtnDcmnttnRltdrtfctCttn() /** { "tree" :"RequestGroup.action.documentation", "datatype" : "RelatedArtifact, markdown", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addDocumentation, setCitation"} **/
						, requestgroup.getRqstGrpCtnDcmnttnRltdrtfctLbl() /** { "tree" :"RequestGroup.action.documentation", "datatype" : "RelatedArtifact, string", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addDocumentation, setLabel"} **/
						, requestgroup.getRqstGrpCtnDcmnttnRltdrtfctDsplay() /** { "tree" :"RequestGroup.action.documentation", "datatype" : "RelatedArtifact, string", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addDocumentation, setDisplay"} **/
						, requestgroup.getRqstGrpCtnDcmnttnRltdrtfctRl() /** { "tree" :"RequestGroup.action.documentation", "datatype" : "RelatedArtifact, url", "cardinality" : "Many", "elementtree" : ["addAction"] , "methodName" : "addDocumentation, setUrl"} **/
						));
Requestgroupobj.setKind(HapiFHIRHelpers.createcode(requestgroup.getRqstGrpCtnCndtnKndCde() /** { "tree" :"RequestGroup.action.condition.kind", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addAction", "addCondition"] , "methodName" : "setKind"} **/
						));
Requestgroupobj.setExpression(HapiFHIRHelpers.createExpression(requestgroup.getRqstGrpCtnCndtnXprssnXprssnLngge() /** { "tree" :"RequestGroup.action.condition.expression", "datatype" : "Expression, code", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition"] , "methodName" : "setExpression, setLanguage"} **/
						, requestgroup.getRqstGrpCtnCndtnXprssnXprssnNme() /** { "tree" :"RequestGroup.action.condition.expression", "datatype" : "Expression, id", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition"] , "methodName" : "setExpression, setName"} **/
						, requestgroup.getRqstGrpCtnCndtnXprssnXprssnDscrptn() /** { "tree" :"RequestGroup.action.condition.expression", "datatype" : "Expression, string", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition"] , "methodName" : "setExpression, setDescription"} **/
						, requestgroup.getRqstGrpCtnCndtnXprssnXprssnXprssn() /** { "tree" :"RequestGroup.action.condition.expression", "datatype" : "Expression, string", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition"] , "methodName" : "setExpression, setExpression"} **/
						, requestgroup.getRqstGrpCtnCndtnXprssnXprssnRfrnce() /** { "tree" :"RequestGroup.action.condition.expression", "datatype" : "Expression, uri", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition"] , "methodName" : "setExpression, setReference"} **/
						));
Requestgroupobj.setActionId(HapiFHIRHelpers.createid(requestgroup.getRqstGrpCtnRltdctnCtndD() /** { "tree" :"RequestGroup.action.relatedAction.actionId", "datatype" : "id", "cardinality" : "Required", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setActionId"} **/
						));
Requestgroupobj.setRelationship(HapiFHIRHelpers.createcode(requestgroup.getRqstGrpCtnRltdctnRltnshpCde() /** { "tree" :"RequestGroup.action.relatedAction.relationship", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setRelationship"} **/
						));
Requestgroupobj.setOffsetDuration(HapiFHIRHelpers.createDuration(requestgroup.getRqstGrpCtnRltdctnFfstDrtnDrtn() /** { "tree" :"RequestGroup.action.relatedAction.offsetDuration", "datatype" : "Duration", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setOffsetDuration"} **/
						));
Requestgroupobj.setOffsetRange(HapiFHIRHelpers.createRange(requestgroup.getRqstGrpCtnRltdctnFfstRngRngLw() /** { "tree" :"RequestGroup.action.relatedAction.offsetRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setOffsetRange, setLow"} **/
						, requestgroup.getRqstGrpCtnRltdctnFfstRngRngHgh() /** { "tree" :"RequestGroup.action.relatedAction.offsetRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setOffsetRange, setHigh"} **/
						));
Requestgroupobj.setTiming(HapiFHIRHelpers.createdateTimetype(requestgroup.getRqstGrpCtnTmngDttmDtTme() /** { "tree" :"RequestGroup.action.timingDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingDatetime"} **/
						));
Requestgroupobj.setTimingAge(HapiFHIRHelpers.createAge(requestgroup.getRequestGroupActionTimingAgeAge() /** { "tree" :"RequestGroup.action.timingAge", "datatype" : "Age", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingAge"} **/
						));
Requestgroupobj.setTimingPeriod(HapiFHIRHelpers.createPeriod(requestgroup.getRqstGrpCtnTmngPrdPrdStrt() /** { "tree" :"RequestGroup.action.timingPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingPeriod, setStart"} **/
						, requestgroup.getRqstGrpCtnTmngPrdPrdNd() /** { "tree" :"RequestGroup.action.timingPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingPeriod, setEnd"} **/
						));
Requestgroupobj.setTimingDuration(HapiFHIRHelpers.createDuration(requestgroup.getRqstGrpCtnTmngDrtnDrtn() /** { "tree" :"RequestGroup.action.timingDuration", "datatype" : "Duration", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingDuration"} **/
						));
Requestgroupobj.setTimingRange(HapiFHIRHelpers.createRange(requestgroup.getRqstGrpCtnTmngRngRngLw() /** { "tree" :"RequestGroup.action.timingRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingRange, setLow"} **/
						, requestgroup.getRqstGrpCtnTmngRngRngHgh() /** { "tree" :"RequestGroup.action.timingRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingRange, setHigh"} **/
						));
Requestgroupobj.setTimingTiming(HapiFHIRHelpers.createTiming(requestgroup.getRqstGrpCtnTmngTmngTmngCdCcCSstm() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setCode, addCoding, setSystem"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngCdCcCVrsn() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setCode, addCoding, setVersion"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngCdCcCCde() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setCode, addCoding, setCode"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngCdCcCDsplay() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setCode, addCoding, setDisplay"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngCdCcCSrSlctd() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setCode, addCoding, setUserSelected"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngCdCcTxt() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setCode, setText"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngVnt() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, addEvent"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngRptDrtnnt() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setRepeat, setDurationUnit"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngRptPrdnt() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setRepeat, setPeriodUnit"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngRptDfWk() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setRepeat, addDayOfWeek"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngRptWhn() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setRepeat, addWhen"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngRptDrtn() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setRepeat, setDuration"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngRptDrtnMx() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setRepeat, setDurationMax"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngRptPrd() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setRepeat, setPeriod"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngRptPrdMx() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setRepeat, setPeriodMax"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngRptBndsDrtn() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, Element, Duration", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setRepeat, setBoundsDuration"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngRptBndsPrd() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, Element, Period", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setRepeat, setBoundsPeriod"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngRptCnt() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setRepeat, setCount"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngRptCntMx() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setRepeat, setCountMax"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngRptFrqncy() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setRepeat, setFrequency"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngRptFrqncMx() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setRepeat, setFrequencyMax"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngRptBndsRnge() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, Element, Range", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setRepeat, setBoundsRange"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngRptTmfDay() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, Element, time", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setRepeat, addTimeOfDay"} **/
						, requestgroup.getRqstGrpCtnTmngTmngTmngRptFfst() /** { "tree" :"RequestGroup.action.timingTiming", "datatype" : "Timing, Element, unsignedInt", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setTimingTiming, setRepeat, setOffset"} **/
						));
Requestgroupobj.addParticipant(HapiFHIRHelpers.createReference(requestgroup.getRqstGrpCtnPrtcpntRfrnce() /** { "tree" :"RequestGroup.action.participant", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "addParticipant"} **/
						));
Requestgroupobj.setType(HapiFHIRHelpers.createCodeableConcept(requestgroup.getRqstGrpCtnTpCcCdngCSstm() /** { "tree" :"RequestGroup.action.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setType, addCoding, setSystem"} **/
						, requestgroup.getRqstGrpCtnTpCcCdngCVrsn() /** { "tree" :"RequestGroup.action.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setType, addCoding, setVersion"} **/
						, requestgroup.getRqstGrpCtnTpCcCdngCCde() /** { "tree" :"RequestGroup.action.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setType, addCoding, setCode"} **/
						, requestgroup.getRqstGrpCtnTpCcCdngCDsplay() /** { "tree" :"RequestGroup.action.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, requestgroup.getRqstGrpCtnTpCcCdngCSrSlctd() /** { "tree" :"RequestGroup.action.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, requestgroup.getRequestGroupActionTypeCcText() /** { "tree" :"RequestGroup.action.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setType, setText"} **/
						));
Requestgroupobj.setGroupingBehavior(HapiFHIRHelpers.createcode(requestgroup.getRqstGrpCtnGrpngBhvrCde() /** { "tree" :"RequestGroup.action.groupingBehavior", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setGroupingBehavior"} **/
						));
Requestgroupobj.setSelectionBehavior(HapiFHIRHelpers.createcode(requestgroup.getRqstGrpCtnSlctnBhvrCde() /** { "tree" :"RequestGroup.action.selectionBehavior", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setSelectionBehavior"} **/
						));
Requestgroupobj.setRequiredBehavior(HapiFHIRHelpers.createcode(requestgroup.getRqstGrpCtnRqrdBhvrCde() /** { "tree" :"RequestGroup.action.requiredBehavior", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setRequiredBehavior"} **/
						));
Requestgroupobj.setPrecheckBehavior(HapiFHIRHelpers.createcode(requestgroup.getRqstGrpCtnPrchckBhvrCde() /** { "tree" :"RequestGroup.action.precheckBehavior", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setPrecheckBehavior"} **/
						));
Requestgroupobj.setCardinalityBehavior(HapiFHIRHelpers.createcode(requestgroup.getRqstGrpCtnCrdnltBhvrCde() /** { "tree" :"RequestGroup.action.cardinalityBehavior", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setCardinalityBehavior"} **/
						));
Requestgroupobj.setResource(HapiFHIRHelpers.createReference(requestgroup.getRqstGrpCtnRsrcRfrnce() /** { "tree" :"RequestGroup.action.resource", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "setResource"} **/
						));
Requestgroupobj.addAction(HapiFHIRHelpers.createaction(requestgroup.getRequestGroupActionActionAction() /** { "tree" :"RequestGroup.action.action", "datatype" : "action", "cardinality" : "Many", "elementtree" : ["addAction", "addCondition", "addRelatedAction"] , "methodName" : "addAction"} **/
		));
	}
}
