package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Familymemberhistory.
 * @see .Familymemberhistory
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class FamilymemberhistoryConversion 
{
	public Patient Familymemberhistorys(main.templateoutput.Model.Familymemberhistory familymemberhistory) 
	{
			Patient  Familymemberhistoryobj = new Patient(); 

						Familymemberhistoryobj.addIdentifier(HapiFHIRHelpers.createIdentifier(familymemberhistory.getFmlMmbrHstrDntfrDntfrSe() /** { "tree" :"FamilyMemberHistory.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, familymemberhistory.getFmlMmbrHstrDntfrDntfrTpCcCSstm() /** { "tree" :"FamilyMemberHistory.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, familymemberhistory.getFmlMmbrHstrDntfrDntfrTpCcCVrsn() /** { "tree" :"FamilyMemberHistory.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, familymemberhistory.getFmlMmbrHstrDntfrDntfrTpCcCCde() /** { "tree" :"FamilyMemberHistory.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, familymemberhistory.getFmlMmbrHstrDntfrDntfrTpCcCDsplay() /** { "tree" :"FamilyMemberHistory.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, familymemberhistory.getFmlMmbrHstrDntfrDntfrTpCcCSrSlctd() /** { "tree" :"FamilyMemberHistory.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, familymemberhistory.getFmlMmbrHstrDntfrDntfrTpCcTxt() /** { "tree" :"FamilyMemberHistory.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, familymemberhistory.getFmlMmbrHstrDntfrDntfrPrdPrdStrt() /** { "tree" :"FamilyMemberHistory.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, familymemberhistory.getFmlMmbrHstrDntfrDntfrPrdPrdNd() /** { "tree" :"FamilyMemberHistory.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, familymemberhistory.getFmlMmbrHstrDntfrDntfrSsgnr() /** { "tree" :"FamilyMemberHistory.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, familymemberhistory.getFmlMmbrHstrDntfrDntfrVlue() /** { "tree" :"FamilyMemberHistory.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, familymemberhistory.getFmlMmbrHstrDntfrDntfrSstm() /** { "tree" :"FamilyMemberHistory.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Familymemberhistoryobj.addInstantiatesCanonical(HapiFHIRHelpers.createcanonical(familymemberhistory.getFmlMmbrHstrNstnttsCnnclCnncl() /** { "tree" :"FamilyMemberHistory.instantiatesCanonical", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInstantiatesCanonical"} **/
						));
Familymemberhistoryobj.addInstantiatesUri(HapiFHIRHelpers.createuri(familymemberhistory.getFmlMmbrHstrNstnttsrRi() /** { "tree" :"FamilyMemberHistory.instantiatesUri", "datatype" : "uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInstantiatesUri"} **/
						));
Familymemberhistoryobj.setStatus(HapiFHIRHelpers.createcode(familymemberhistory.getFamilyMemberHistoryStatusCode() /** { "tree" :"FamilyMemberHistory.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Familymemberhistoryobj.setDataAbsentReason(HapiFHIRHelpers.createCodeableConcept(familymemberhistory.getFmlMmbrHstrDtbsntRsnCcCdngCSstm() /** { "tree" :"FamilyMemberHistory.dataAbsentReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDataAbsentReason, addCoding, setSystem"} **/
						, familymemberhistory.getFmlMmbrHstrDtbsntRsnCcCdngCVrsn() /** { "tree" :"FamilyMemberHistory.dataAbsentReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDataAbsentReason, addCoding, setVersion"} **/
						, familymemberhistory.getFmlMmbrHstrDtbsntRsnCcCdngCCde() /** { "tree" :"FamilyMemberHistory.dataAbsentReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDataAbsentReason, addCoding, setCode"} **/
						, familymemberhistory.getFmlMmbrHstrDtbsntRsnCcCdngCDsplay() /** { "tree" :"FamilyMemberHistory.dataAbsentReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDataAbsentReason, addCoding, setDisplay"} **/
						, familymemberhistory.getFmlMmbrHstrDtbsntRsnCcCdngCSrSlctd() /** { "tree" :"FamilyMemberHistory.dataAbsentReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDataAbsentReason, addCoding, setUserSelected"} **/
						, familymemberhistory.getFmlMmbrHstrDtbsntRsnCcTxt() /** { "tree" :"FamilyMemberHistory.dataAbsentReason", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDataAbsentReason, setText"} **/
						));
Familymemberhistoryobj.setPatient(HapiFHIRHelpers.createReference(familymemberhistory.getFamilyMemberHistoryPntReference() /** { "tree" :"FamilyMemberHistory.patient", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPatient"} **/
						));
Familymemberhistoryobj.setDate(HapiFHIRHelpers.createdateTime(familymemberhistory.getFamilyMemberHistoryDateDateTime() /** { "tree" :"FamilyMemberHistory.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Familymemberhistoryobj.setName(HapiFHIRHelpers.createstring(familymemberhistory.getFamilyMemberHistoryNameString() /** { "tree" :"FamilyMemberHistory.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Familymemberhistoryobj.setRelationship(HapiFHIRHelpers.createCodeableConcept(familymemberhistory.getFmlMmbrHstrRltnshpCcCdngCSstm() /** { "tree" :"FamilyMemberHistory.relationship", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setRelationship, addCoding, setSystem"} **/
						, familymemberhistory.getFmlMmbrHstrRltnshpCcCdngCVrsn() /** { "tree" :"FamilyMemberHistory.relationship", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setRelationship, addCoding, setVersion"} **/
						, familymemberhistory.getFmlMmbrHstrRltnshpCcCdngCCde() /** { "tree" :"FamilyMemberHistory.relationship", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setRelationship, addCoding, setCode"} **/
						, familymemberhistory.getFmlMmbrHstrRltnshpCcCdngCDsplay() /** { "tree" :"FamilyMemberHistory.relationship", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setRelationship, addCoding, setDisplay"} **/
						, familymemberhistory.getFmlMmbrHstrRltnshpCcCdngCSrSlctd() /** { "tree" :"FamilyMemberHistory.relationship", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setRelationship, addCoding, setUserSelected"} **/
						, familymemberhistory.getFmlMmbrHstrRltnshpCcTxt() /** { "tree" :"FamilyMemberHistory.relationship", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setRelationship, setText"} **/
						));
Familymemberhistoryobj.setSex(HapiFHIRHelpers.createCodeableConcept(familymemberhistory.getFmlMmbrHstrSxCcCdngCSstm() /** { "tree" :"FamilyMemberHistory.sex", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSex, addCoding, setSystem"} **/
						, familymemberhistory.getFmlMmbrHstrSxCcCdngCVrsn() /** { "tree" :"FamilyMemberHistory.sex", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSex, addCoding, setVersion"} **/
						, familymemberhistory.getFmlMmbrHstrSxCcCdngCCde() /** { "tree" :"FamilyMemberHistory.sex", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSex, addCoding, setCode"} **/
						, familymemberhistory.getFmlMmbrHstrSxCcCdngCDsplay() /** { "tree" :"FamilyMemberHistory.sex", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSex, addCoding, setDisplay"} **/
						, familymemberhistory.getFmlMmbrHstrSxCcCdngCSrSlctd() /** { "tree" :"FamilyMemberHistory.sex", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSex, addCoding, setUserSelected"} **/
						, familymemberhistory.getFamilyMemberHistorySexCcText() /** { "tree" :"FamilyMemberHistory.sex", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSex, setText"} **/
						));
Familymemberhistoryobj.setBornPeriod(HapiFHIRHelpers.createPeriod(familymemberhistory.getFmlMmbrHstrBrnPrdPrdStrt() /** { "tree" :"FamilyMemberHistory.bornPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBornPeriod, setStart"} **/
						, familymemberhistory.getFmlMmbrHstrBrnPrdPrdNd() /** { "tree" :"FamilyMemberHistory.bornPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBornPeriod, setEnd"} **/
						));
Familymemberhistoryobj.setBornDate(HapiFHIRHelpers.createdate(familymemberhistory.getFamilyMemberHistoryBornDateDate() /** { "tree" :"FamilyMemberHistory.bornDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBornDate"} **/
						));
Familymemberhistoryobj.setBornString(HapiFHIRHelpers.createstring(familymemberhistory.getFmlMmbrHstrBrnStrngStrng() /** { "tree" :"FamilyMemberHistory.bornString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBornString"} **/
						));
Familymemberhistoryobj.setAgeAge(HapiFHIRHelpers.createAge(familymemberhistory.getFamilyMemberHistoryAgeAgeAge() /** { "tree" :"FamilyMemberHistory.ageAge", "datatype" : "Age", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAgeAge"} **/
						));
Familymemberhistoryobj.setAgeRange(HapiFHIRHelpers.createRange(familymemberhistory.getFmlMmbrHstrGRngRngLw() /** { "tree" :"FamilyMemberHistory.ageRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAgeRange, setLow"} **/
						, familymemberhistory.getFmlMmbrHstrGRngRngHgh() /** { "tree" :"FamilyMemberHistory.ageRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAgeRange, setHigh"} **/
						));
Familymemberhistoryobj.setAgeString(HapiFHIRHelpers.createstring(familymemberhistory.getFmlMmbrHstrGStrngStrng() /** { "tree" :"FamilyMemberHistory.ageString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAgeString"} **/
						));
Familymemberhistoryobj.setEstimatedAge(HapiFHIRHelpers.createboolean(familymemberhistory.getFmlMmbrHstrStmtdgBln() /** { "tree" :"FamilyMemberHistory.estimatedAge", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEstimatedAge"} **/
						));
Familymemberhistoryobj.setDeceased(HapiFHIRHelpers.createbooleantype(familymemberhistory.getFmlMmbrHstrDcsdBlnBln() /** { "tree" :"FamilyMemberHistory.deceasedBoolean", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDeceasedBoolean"} **/
						));
Familymemberhistoryobj.setDeceasedAge(HapiFHIRHelpers.createAge(familymemberhistory.getFmlMmbrHstrDcsdgGe() /** { "tree" :"FamilyMemberHistory.deceasedAge", "datatype" : "Age", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDeceasedAge"} **/
						));
Familymemberhistoryobj.setDeceasedRange(HapiFHIRHelpers.createRange(familymemberhistory.getFmlMmbrHstrDcsdRngRngLw() /** { "tree" :"FamilyMemberHistory.deceasedRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDeceasedRange, setLow"} **/
						, familymemberhistory.getFmlMmbrHstrDcsdRngRngHgh() /** { "tree" :"FamilyMemberHistory.deceasedRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDeceasedRange, setHigh"} **/
						));
Familymemberhistoryobj.setDeceasedDate(HapiFHIRHelpers.createdate(familymemberhistory.getFmlMmbrHstrDcsdDtDte() /** { "tree" :"FamilyMemberHistory.deceasedDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDeceasedDate"} **/
						));
Familymemberhistoryobj.setDeceasedString(HapiFHIRHelpers.createstring(familymemberhistory.getFmlMmbrHstrDcsdStrngStrng() /** { "tree" :"FamilyMemberHistory.deceasedString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDeceasedString"} **/
						));
Familymemberhistoryobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(familymemberhistory.getFmlMmbrHstrRsnCdCcCdngCSstm() /** { "tree" :"FamilyMemberHistory.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, familymemberhistory.getFmlMmbrHstrRsnCdCcCdngCVrsn() /** { "tree" :"FamilyMemberHistory.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, familymemberhistory.getFmlMmbrHstrRsnCdCcCdngCCde() /** { "tree" :"FamilyMemberHistory.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, familymemberhistory.getFmlMmbrHstrRsnCdCcCdngCDsplay() /** { "tree" :"FamilyMemberHistory.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, familymemberhistory.getFmlMmbrHstrRsnCdCcCdngCSrSlctd() /** { "tree" :"FamilyMemberHistory.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, familymemberhistory.getFmlMmbrHstrRsnCdCcTxt() /** { "tree" :"FamilyMemberHistory.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Familymemberhistoryobj.addReasonReference(HapiFHIRHelpers.createReference(familymemberhistory.getFmlMmbrHstrRsnRfrncRfrnce() /** { "tree" :"FamilyMemberHistory.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonReference"} **/
						));
Familymemberhistoryobj.addNote(HapiFHIRHelpers.createAnnotation(familymemberhistory.getFmlMmbrHstrNtNnttnTme() /** { "tree" :"FamilyMemberHistory.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, familymemberhistory.getFmlMmbrHstrNtNnttnTxt() /** { "tree" :"FamilyMemberHistory.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, familymemberhistory.getFmlMmbrHstrNtNnttnThrRfrnce() /** { "tree" :"FamilyMemberHistory.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, familymemberhistory.getFmlMmbrHstrNtNnttnThrStrng() /** { "tree" :"FamilyMemberHistory.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Familymemberhistoryobj.setCode(HapiFHIRHelpers.createCodeableConcept(familymemberhistory.getFmlMmbrHstrCndtnCdCcCdngCSstm() /** { "tree" :"FamilyMemberHistory.condition.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addCondition"] , "methodName" : "setCode, addCoding, setSystem"} **/
						, familymemberhistory.getFmlMmbrHstrCndtnCdCcCdngCVrsn() /** { "tree" :"FamilyMemberHistory.condition.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addCondition"] , "methodName" : "setCode, addCoding, setVersion"} **/
						, familymemberhistory.getFmlMmbrHstrCndtnCdCcCdngCCde() /** { "tree" :"FamilyMemberHistory.condition.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addCondition"] , "methodName" : "setCode, addCoding, setCode"} **/
						, familymemberhistory.getFmlMmbrHstrCndtnCdCcCdngCDsplay() /** { "tree" :"FamilyMemberHistory.condition.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addCondition"] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, familymemberhistory.getFmlMmbrHstrCndtnCdCcCdngCSrSlctd() /** { "tree" :"FamilyMemberHistory.condition.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addCondition"] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, familymemberhistory.getFmlMmbrHstrCndtnCdCcTxt() /** { "tree" :"FamilyMemberHistory.condition.code", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addCondition"] , "methodName" : "setCode, setText"} **/
						));
Familymemberhistoryobj.setOutcome(HapiFHIRHelpers.createCodeableConcept(familymemberhistory.getFmlMmbrHstrCndtnTcmCcCdngCSstm() /** { "tree" :"FamilyMemberHistory.condition.outcome", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addCondition"] , "methodName" : "setOutcome, addCoding, setSystem"} **/
						, familymemberhistory.getFmlMmbrHstrCndtnTcmCcCdngCVrsn() /** { "tree" :"FamilyMemberHistory.condition.outcome", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addCondition"] , "methodName" : "setOutcome, addCoding, setVersion"} **/
						, familymemberhistory.getFmlMmbrHstrCndtnTcmCcCdngCCde() /** { "tree" :"FamilyMemberHistory.condition.outcome", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addCondition"] , "methodName" : "setOutcome, addCoding, setCode"} **/
						, familymemberhistory.getFmlMmbrHstrCndtnTcmCcCdngCDsplay() /** { "tree" :"FamilyMemberHistory.condition.outcome", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addCondition"] , "methodName" : "setOutcome, addCoding, setDisplay"} **/
						, familymemberhistory.getFmlMmbrHstrCndtnTcmCcCdngCSrSlctd() /** { "tree" :"FamilyMemberHistory.condition.outcome", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addCondition"] , "methodName" : "setOutcome, addCoding, setUserSelected"} **/
						, familymemberhistory.getFmlMmbrHstrCndtnTcmCcTxt() /** { "tree" :"FamilyMemberHistory.condition.outcome", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addCondition"] , "methodName" : "setOutcome, setText"} **/
						));
Familymemberhistoryobj.setContributedToDeath(HapiFHIRHelpers.createboolean(familymemberhistory.getFmlMmbrHstrCndtnCntrbtdTdthBln() /** { "tree" :"FamilyMemberHistory.condition.contributedToDeath", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addCondition"] , "methodName" : "setContributedToDeath"} **/
						));
Familymemberhistoryobj.setOnsetAge(HapiFHIRHelpers.createAge(familymemberhistory.getFmlMmbrHstrCndtnNstgGe() /** { "tree" :"FamilyMemberHistory.condition.onsetAge", "datatype" : "Age", "cardinality" : "ZeroOne", "elementtree" : ["addCondition"] , "methodName" : "setOnsetAge"} **/
						));
Familymemberhistoryobj.setOnsetRange(HapiFHIRHelpers.createRange(familymemberhistory.getFmlMmbrHstrCndtnNstRngRngLw() /** { "tree" :"FamilyMemberHistory.condition.onsetRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addCondition"] , "methodName" : "setOnsetRange, setLow"} **/
						, familymemberhistory.getFmlMmbrHstrCndtnNstRngRngHgh() /** { "tree" :"FamilyMemberHistory.condition.onsetRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addCondition"] , "methodName" : "setOnsetRange, setHigh"} **/
						));
Familymemberhistoryobj.setOnsetPeriod(HapiFHIRHelpers.createPeriod(familymemberhistory.getFmlMmbrHstrCndtnNstPrdPrdStrt() /** { "tree" :"FamilyMemberHistory.condition.onsetPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addCondition"] , "methodName" : "setOnsetPeriod, setStart"} **/
						, familymemberhistory.getFmlMmbrHstrCndtnNstPrdPrdNd() /** { "tree" :"FamilyMemberHistory.condition.onsetPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addCondition"] , "methodName" : "setOnsetPeriod, setEnd"} **/
						));
Familymemberhistoryobj.setOnsetString(HapiFHIRHelpers.createstring(familymemberhistory.getFmlMmbrHstrCndtnNstStrngStrng() /** { "tree" :"FamilyMemberHistory.condition.onsetString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addCondition"] , "methodName" : "setOnsetString"} **/
						));
Familymemberhistoryobj.addNote(HapiFHIRHelpers.createAnnotation(familymemberhistory.getFmlMmbrHstrCndtnNtNnttnTme() /** { "tree" :"FamilyMemberHistory.condition.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : ["addCondition"] , "methodName" : "addNote, setTime"} **/
						, familymemberhistory.getFmlMmbrHstrCndtnNtNnttnTxt() /** { "tree" :"FamilyMemberHistory.condition.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : ["addCondition"] , "methodName" : "addNote, setText"} **/
						, familymemberhistory.getFmlMmbrHstrCndtnNtNnttnThrRfrnce() /** { "tree" :"FamilyMemberHistory.condition.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : ["addCondition"] , "methodName" : "addNote, setAuthorReference"} **/
						, familymemberhistory.getFmlMmbrHstrCndtnNtNnttnThrStrng() /** { "tree" :"FamilyMemberHistory.condition.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : ["addCondition"] , "methodName" : "addNote, setAuthorString"} **/
		));
	}
}
