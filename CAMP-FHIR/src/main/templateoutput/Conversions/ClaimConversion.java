package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Claim.
 * @see .Claim
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ClaimConversion 
{
	public Patient Claims(main.templateoutput.Model.Claim claim) 
	{
			Patient  Claimobj = new Patient(); 

						Claimobj.addIdentifier(HapiFHIRHelpers.createIdentifier(claim.getClaimIdentifierIdentifierUse() /** { "tree" :"Claim.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, claim.getClmDntfrDntfrTpCcCSstm() /** { "tree" :"Claim.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, claim.getClmDntfrDntfrTpCcCVrsn() /** { "tree" :"Claim.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, claim.getClmDntfrDntfrTpCcCCde() /** { "tree" :"Claim.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, claim.getClmDntfrDntfrTpCcCDsplay() /** { "tree" :"Claim.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, claim.getClmDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Claim.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, claim.getClmDntfrDntfrTpCcTxt() /** { "tree" :"Claim.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, claim.getClmDntfrDntfrPrdPrdStrt() /** { "tree" :"Claim.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, claim.getClmDntfrDntfrPrdPrdNd() /** { "tree" :"Claim.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, claim.getClmDntfrDntfrSsgnr() /** { "tree" :"Claim.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, claim.getClaimIdentifierIdentifierValue() /** { "tree" :"Claim.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, claim.getClaimIdentifierIdentifierSystem() /** { "tree" :"Claim.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Claimobj.setStatus(HapiFHIRHelpers.createcode(claim.getClaimStatusCode() /** { "tree" :"Claim.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Claimobj.setType(HapiFHIRHelpers.createCodeableConcept(claim.getClaimTypeCcCodingCSystem() /** { "tree" :"Claim.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setSystem"} **/
						, claim.getClaimTypeCcCodingCVersion() /** { "tree" :"Claim.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setVersion"} **/
						, claim.getClaimTypeCcCodingCCode() /** { "tree" :"Claim.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setCode"} **/
						, claim.getClaimTypeCcCodingCDisplay() /** { "tree" :"Claim.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setDisplay"} **/
						, claim.getClmTpCcCdngCSrSlctd() /** { "tree" :"Claim.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, claim.getClaimTypeCcText() /** { "tree" :"Claim.type", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, setText"} **/
						));
Claimobj.setSubType(HapiFHIRHelpers.createCodeableConcept(claim.getClaimSubTypeCcCodingCSystem() /** { "tree" :"Claim.subType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubType, addCoding, setSystem"} **/
						, claim.getClaimSubTypeCcCodingCVersion() /** { "tree" :"Claim.subType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubType, addCoding, setVersion"} **/
						, claim.getClaimSubTypeCcCodingCCode() /** { "tree" :"Claim.subType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubType, addCoding, setCode"} **/
						, claim.getClaimSubTypeCcCodingCDisplay() /** { "tree" :"Claim.subType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubType, addCoding, setDisplay"} **/
						, claim.getClmSbTpCcCdngCSrSlctd() /** { "tree" :"Claim.subType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubType, addCoding, setUserSelected"} **/
						, claim.getClaimSubTypeCcText() /** { "tree" :"Claim.subType", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubType, setText"} **/
						));
Claimobj.setUse(HapiFHIRHelpers.createcode(claim.getClaimUseCode() /** { "tree" :"Claim.use", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setUse"} **/
						));
Claimobj.setPatient(HapiFHIRHelpers.createReference(claim.getClaimPntReference() /** { "tree" :"Claim.patient", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPatient"} **/
						));
Claimobj.setBillablePeriod(HapiFHIRHelpers.createPeriod(claim.getClaimBillablePeriodPeriodStart() /** { "tree" :"Claim.billablePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBillablePeriod, setStart"} **/
						, claim.getClaimBillablePeriodPeriodEnd() /** { "tree" :"Claim.billablePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBillablePeriod, setEnd"} **/
						));
Claimobj.setCreated(HapiFHIRHelpers.createdateTime(claim.getClaimCreatedDateTime() /** { "tree" :"Claim.created", "datatype" : "dateTime", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCreated"} **/
						));
Claimobj.setEnterer(HapiFHIRHelpers.createReference(claim.getClaimEntererReference() /** { "tree" :"Claim.enterer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEnterer"} **/
						));
Claimobj.setInsurer(HapiFHIRHelpers.createReference(claim.getClaimInsurerReference() /** { "tree" :"Claim.insurer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setInsurer"} **/
						));
Claimobj.setProvider(HapiFHIRHelpers.createReference(claim.getClaimProviderReference() /** { "tree" :"Claim.provider", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setProvider"} **/
						));
Claimobj.setPriority(HapiFHIRHelpers.createCodeableConcept(claim.getClaimPriorityCcCodingCSystem() /** { "tree" :"Claim.priority", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPriority, addCoding, setSystem"} **/
						, claim.getClaimPriorityCcCodingCVersion() /** { "tree" :"Claim.priority", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPriority, addCoding, setVersion"} **/
						, claim.getClaimPriorityCcCodingCCode() /** { "tree" :"Claim.priority", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPriority, addCoding, setCode"} **/
						, claim.getClaimPriorityCcCodingCDisplay() /** { "tree" :"Claim.priority", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPriority, addCoding, setDisplay"} **/
						, claim.getClmPrrtCcCdngCSrSlctd() /** { "tree" :"Claim.priority", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPriority, addCoding, setUserSelected"} **/
						, claim.getClaimPriorityCcText() /** { "tree" :"Claim.priority", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPriority, setText"} **/
						));
Claimobj.setFundsReserve(HapiFHIRHelpers.createCodeableConcept(claim.getClmFndsRsrvCcCdngCSstm() /** { "tree" :"Claim.fundsReserve", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFundsReserve, addCoding, setSystem"} **/
						, claim.getClmFndsRsrvCcCdngCVrsn() /** { "tree" :"Claim.fundsReserve", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFundsReserve, addCoding, setVersion"} **/
						, claim.getClmFndsRsrvCcCdngCCde() /** { "tree" :"Claim.fundsReserve", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFundsReserve, addCoding, setCode"} **/
						, claim.getClmFndsRsrvCcCdngCDsplay() /** { "tree" :"Claim.fundsReserve", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFundsReserve, addCoding, setDisplay"} **/
						, claim.getClmFndsRsrvCcCdngCSrSlctd() /** { "tree" :"Claim.fundsReserve", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFundsReserve, addCoding, setUserSelected"} **/
						, claim.getClaimFundsReserveCcText() /** { "tree" :"Claim.fundsReserve", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFundsReserve, setText"} **/
						));
Claimobj.setClaim(HapiFHIRHelpers.createReference(claim.getClaimRelatedClaimReference() /** { "tree" :"Claim.related.claim", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setClaim"} **/
						));
Claimobj.setRelationship(HapiFHIRHelpers.createCodeableConcept(claim.getClmRltdRltnshpCcCdngCSstm() /** { "tree" :"Claim.related.relationship", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setRelationship, addCoding, setSystem"} **/
						, claim.getClmRltdRltnshpCcCdngCVrsn() /** { "tree" :"Claim.related.relationship", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setRelationship, addCoding, setVersion"} **/
						, claim.getClmRltdRltnshpCcCdngCCde() /** { "tree" :"Claim.related.relationship", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setRelationship, addCoding, setCode"} **/
						, claim.getClmRltdRltnshpCcCdngCDsplay() /** { "tree" :"Claim.related.relationship", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setRelationship, addCoding, setDisplay"} **/
						, claim.getClmRltdRltnshpCcCdngCSrSlctd() /** { "tree" :"Claim.related.relationship", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setRelationship, addCoding, setUserSelected"} **/
						, claim.getClaimRelatedRelationshipCcText() /** { "tree" :"Claim.related.relationship", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setRelationship, setText"} **/
						));
Claimobj.setReference(HapiFHIRHelpers.createIdentifier(claim.getClmRltdRfrncDntfrSe() /** { "tree" :"Claim.related.reference", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setReference, setUse"} **/
						, claim.getClmRltdRfrncDntfrTpCcCSstm() /** { "tree" :"Claim.related.reference", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setReference, setType, addCoding, setSystem"} **/
						, claim.getClmRltdRfrncDntfrTpCcCVrsn() /** { "tree" :"Claim.related.reference", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setReference, setType, addCoding, setVersion"} **/
						, claim.getClmRltdRfrncDntfrTpCcCCde() /** { "tree" :"Claim.related.reference", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setReference, setType, addCoding, setCode"} **/
						, claim.getClmRltdRfrncDntfrTpCcCDsplay() /** { "tree" :"Claim.related.reference", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setReference, setType, addCoding, setDisplay"} **/
						, claim.getClmRltdRfrncDntfrTpCcCSrSlctd() /** { "tree" :"Claim.related.reference", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setReference, setType, addCoding, setUserSelected"} **/
						, claim.getClmRltdRfrncDntfrTpCcTxt() /** { "tree" :"Claim.related.reference", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setReference, setType, setText"} **/
						, claim.getClmRltdRfrncDntfrPrdPrdStrt() /** { "tree" :"Claim.related.reference", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setReference, setPeriod, setStart"} **/
						, claim.getClmRltdRfrncDntfrPrdPrdNd() /** { "tree" :"Claim.related.reference", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setReference, setPeriod, setEnd"} **/
						, claim.getClmRltdRfrncDntfrSsgnr() /** { "tree" :"Claim.related.reference", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setReference, setAssigner"} **/
						, claim.getClmRltdRfrncDntfrVlue() /** { "tree" :"Claim.related.reference", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setReference, setValue"} **/
						, claim.getClmRltdRfrncDntfrSstm() /** { "tree" :"Claim.related.reference", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setReference, setSystem"} **/
						));
Claimobj.setPrescription(HapiFHIRHelpers.createReference(claim.getClaimPrescriptionReference() /** { "tree" :"Claim.prescription", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPrescription"} **/
						));
Claimobj.setOriginalPrescription(HapiFHIRHelpers.createReference(claim.getClmRgnlPrscrptnRfrnce() /** { "tree" :"Claim.originalPrescription", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOriginalPrescription"} **/
						));
Claimobj.setType(HapiFHIRHelpers.createCodeableConcept(claim.getClmPTpCcCdngCSstm() /** { "tree" :"Claim.payee.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["setPayee"] , "methodName" : "setType, addCoding, setSystem"} **/
						, claim.getClmPTpCcCdngCVrsn() /** { "tree" :"Claim.payee.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["setPayee"] , "methodName" : "setType, addCoding, setVersion"} **/
						, claim.getClaimPayeeTypeCcCodingCCode() /** { "tree" :"Claim.payee.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["setPayee"] , "methodName" : "setType, addCoding, setCode"} **/
						, claim.getClmPTpCcCdngCDsplay() /** { "tree" :"Claim.payee.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["setPayee"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, claim.getClmPTpCcCdngCSrSlctd() /** { "tree" :"Claim.payee.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["setPayee"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, claim.getClaimPayeeTypeCcText() /** { "tree" :"Claim.payee.type", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["setPayee"] , "methodName" : "setType, setText"} **/
						));
Claimobj.setParty(HapiFHIRHelpers.createReference(claim.getClaimPayeePartyReference() /** { "tree" :"Claim.payee.party", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["setPayee"] , "methodName" : "setParty"} **/
						));
Claimobj.setReferral(HapiFHIRHelpers.createReference(claim.getClaimReferralReference() /** { "tree" :"Claim.referral", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReferral"} **/
						));
Claimobj.setFacility(HapiFHIRHelpers.createReference(claim.getClaimFacilityReference() /** { "tree" :"Claim.facility", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFacility"} **/
						));
Claimobj.setSequence(HapiFHIRHelpers.createpositiveInt(claim.getClmCrTmSqncPstvnt() /** { "tree" :"Claim.careTeam.sequence", "datatype" : "positiveInt", "cardinality" : "Required", "elementtree" : ["addCareTeam"] , "methodName" : "setSequence"} **/
						));
Claimobj.setProvider(HapiFHIRHelpers.createReference(claim.getClaimCareTeamProviderReference() /** { "tree" :"Claim.careTeam.provider", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addCareTeam"] , "methodName" : "setProvider"} **/
						));
Claimobj.setResponsible(HapiFHIRHelpers.createboolean(claim.getClaimCareTeamResponsibleBoolean() /** { "tree" :"Claim.careTeam.responsible", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addCareTeam"] , "methodName" : "setResponsible"} **/
						));
Claimobj.setRole(HapiFHIRHelpers.createCodeableConcept(claim.getClmCrTmRlCcCdngCSstm() /** { "tree" :"Claim.careTeam.role", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addCareTeam"] , "methodName" : "setRole, addCoding, setSystem"} **/
						, claim.getClmCrTmRlCcCdngCVrsn() /** { "tree" :"Claim.careTeam.role", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addCareTeam"] , "methodName" : "setRole, addCoding, setVersion"} **/
						, claim.getClmCrTmRlCcCdngCCde() /** { "tree" :"Claim.careTeam.role", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addCareTeam"] , "methodName" : "setRole, addCoding, setCode"} **/
						, claim.getClmCrTmRlCcCdngCDsplay() /** { "tree" :"Claim.careTeam.role", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addCareTeam"] , "methodName" : "setRole, addCoding, setDisplay"} **/
						, claim.getClmCrTmRlCcCdngCSrSlctd() /** { "tree" :"Claim.careTeam.role", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addCareTeam"] , "methodName" : "setRole, addCoding, setUserSelected"} **/
						, claim.getClaimCareTeamRoleCcText() /** { "tree" :"Claim.careTeam.role", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addCareTeam"] , "methodName" : "setRole, setText"} **/
						));
Claimobj.setQualification(HapiFHIRHelpers.createCodeableConcept(claim.getClmCrTmQlfctnCcCdngCSstm() /** { "tree" :"Claim.careTeam.qualification", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addCareTeam"] , "methodName" : "setQualification, addCoding, setSystem"} **/
						, claim.getClmCrTmQlfctnCcCdngCVrsn() /** { "tree" :"Claim.careTeam.qualification", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addCareTeam"] , "methodName" : "setQualification, addCoding, setVersion"} **/
						, claim.getClmCrTmQlfctnCcCdngCCde() /** { "tree" :"Claim.careTeam.qualification", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addCareTeam"] , "methodName" : "setQualification, addCoding, setCode"} **/
						, claim.getClmCrTmQlfctnCcCdngCDsplay() /** { "tree" :"Claim.careTeam.qualification", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addCareTeam"] , "methodName" : "setQualification, addCoding, setDisplay"} **/
						, claim.getClmCrTmQlfctnCcCdngCSrSlctd() /** { "tree" :"Claim.careTeam.qualification", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addCareTeam"] , "methodName" : "setQualification, addCoding, setUserSelected"} **/
						, claim.getClmCrTmQlfctnCcTxt() /** { "tree" :"Claim.careTeam.qualification", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addCareTeam"] , "methodName" : "setQualification, setText"} **/
						));
Claimobj.setSequence(HapiFHIRHelpers.createpositiveInt(claim.getClmSpprtngnfSqncPstvnt() /** { "tree" :"Claim.supportingInfo.sequence", "datatype" : "positiveInt", "cardinality" : "Required", "elementtree" : ["addSupportingInfo"] , "methodName" : "setSequence"} **/
						));
Claimobj.setCategory(HapiFHIRHelpers.createCodeableConcept(claim.getClmSpprtngnfCtgrCcCdngCSstm() /** { "tree" :"Claim.supportingInfo.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addSupportingInfo"] , "methodName" : "setCategory, addCoding, setSystem"} **/
						, claim.getClmSpprtngnfCtgrCcCdngCVrsn() /** { "tree" :"Claim.supportingInfo.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addSupportingInfo"] , "methodName" : "setCategory, addCoding, setVersion"} **/
						, claim.getClmSpprtngnfCtgrCcCdngCCde() /** { "tree" :"Claim.supportingInfo.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addSupportingInfo"] , "methodName" : "setCategory, addCoding, setCode"} **/
						, claim.getClmSpprtngnfCtgrCcCdngCDsplay() /** { "tree" :"Claim.supportingInfo.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addSupportingInfo"] , "methodName" : "setCategory, addCoding, setDisplay"} **/
						, claim.getClmSpprtngnfCtgrCcCdngCSrSlctd() /** { "tree" :"Claim.supportingInfo.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addSupportingInfo"] , "methodName" : "setCategory, addCoding, setUserSelected"} **/
						, claim.getClmSpprtngnfCtgrCcTxt() /** { "tree" :"Claim.supportingInfo.category", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addSupportingInfo"] , "methodName" : "setCategory, setText"} **/
						));
Claimobj.setCode(HapiFHIRHelpers.createCodeableConcept(claim.getClmSpprtngnfCdCcCdngCSstm() /** { "tree" :"Claim.supportingInfo.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setCode, addCoding, setSystem"} **/
						, claim.getClmSpprtngnfCdCcCdngCVrsn() /** { "tree" :"Claim.supportingInfo.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setCode, addCoding, setVersion"} **/
						, claim.getClmSpprtngnfCdCcCdngCCde() /** { "tree" :"Claim.supportingInfo.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setCode, addCoding, setCode"} **/
						, claim.getClmSpprtngnfCdCcCdngCDsplay() /** { "tree" :"Claim.supportingInfo.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, claim.getClmSpprtngnfCdCcCdngCSrSlctd() /** { "tree" :"Claim.supportingInfo.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, claim.getClaimSupportingInfoCodeCcText() /** { "tree" :"Claim.supportingInfo.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setCode, setText"} **/
						));
Claimobj.setTimingDate(HapiFHIRHelpers.createdate(claim.getClmSpprtngnfTmngDtDte() /** { "tree" :"Claim.supportingInfo.timingDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setTimingDate"} **/
						));
Claimobj.setTimingPeriod(HapiFHIRHelpers.createPeriod(claim.getClmSpprtngnfTmngPrdPrdStrt() /** { "tree" :"Claim.supportingInfo.timingPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setTimingPeriod, setStart"} **/
						, claim.getClmSpprtngnfTmngPrdPrdNd() /** { "tree" :"Claim.supportingInfo.timingPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setTimingPeriod, setEnd"} **/
						));
Claimobj.setValue(HapiFHIRHelpers.createbooleantype(claim.getClmSpprtngnfVlBlnBln() /** { "tree" :"Claim.supportingInfo.valueBoolean", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setValueBoolean"} **/
						));
Claimobj.setValueString(HapiFHIRHelpers.createstring(claim.getClmSpprtngnfVlStrngStrng() /** { "tree" :"Claim.supportingInfo.valueString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setValueString"} **/
						));
Claimobj.setValueQuantity(HapiFHIRHelpers.createQuantity(claim.getClmSpprtngnfVlQnttQnttCmprtr() /** { "tree" :"Claim.supportingInfo.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setValueQuantity, setComparator"} **/
						, claim.getClmSpprtngnfVlQnttQnttCde() /** { "tree" :"Claim.supportingInfo.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setValueQuantity, setCode"} **/
						, claim.getClmSpprtngnfVlQnttQnttVlue() /** { "tree" :"Claim.supportingInfo.valueQuantity", "datatype" : "Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setValueQuantity, setValue"} **/
						, claim.getClmSpprtngnfVlQnttQnttNt() /** { "tree" :"Claim.supportingInfo.valueQuantity", "datatype" : "Quantity, string", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setValueQuantity, setUnit"} **/
						, claim.getClmSpprtngnfVlQnttQnttSstm() /** { "tree" :"Claim.supportingInfo.valueQuantity", "datatype" : "Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setValueQuantity, setSystem"} **/
						));
Claimobj.setValueAttachment(HapiFHIRHelpers.createAttachment(claim.getClmSpprtngnfVlttchmntTtchmntDta() /** { "tree" :"Claim.supportingInfo.valueAttachment", "datatype" : "Attachment, base64Binary", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setValueAttachment, setData"} **/
						, claim.getClmSpprtngnfVlttchmntTtchmntHsh() /** { "tree" :"Claim.supportingInfo.valueAttachment", "datatype" : "Attachment, base64Binary", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setValueAttachment, setHash"} **/
						, claim.getClmSpprtngnfVlttchmntTtchmntCntntTpe() /** { "tree" :"Claim.supportingInfo.valueAttachment", "datatype" : "Attachment, code", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setValueAttachment, setContentType"} **/
						, claim.getClmSpprtngnfVlttchmntTtchmntLngge() /** { "tree" :"Claim.supportingInfo.valueAttachment", "datatype" : "Attachment, code", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setValueAttachment, setLanguage"} **/
						, claim.getClmSpprtngnfVlttchmntTtchmntCrtn() /** { "tree" :"Claim.supportingInfo.valueAttachment", "datatype" : "Attachment, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setValueAttachment, setCreation"} **/
						, claim.getClmSpprtngnfVlttchmntTtchmntTtle() /** { "tree" :"Claim.supportingInfo.valueAttachment", "datatype" : "Attachment, string", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setValueAttachment, setTitle"} **/
						, claim.getClmSpprtngnfVlttchmntTtchmntSze() /** { "tree" :"Claim.supportingInfo.valueAttachment", "datatype" : "Attachment, unsignedInt", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setValueAttachment, setSize"} **/
						, claim.getClmSpprtngnfVlttchmntTtchmntRl() /** { "tree" :"Claim.supportingInfo.valueAttachment", "datatype" : "Attachment, url", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setValueAttachment, setUrl"} **/
						));
Claimobj.setValueReference(any)(HapiFHIRHelpers.createReference(claim.getClmSpprtngnfVlRfrncRfrnce() /** { "tree" :"Claim.supportingInfo.valueReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setValueReference(any)"} **/
						));
Claimobj.setReason(HapiFHIRHelpers.createCodeableConcept(claim.getClmSpprtngnfRsnCcCdngCSstm() /** { "tree" :"Claim.supportingInfo.reason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setReason, addCoding, setSystem"} **/
						, claim.getClmSpprtngnfRsnCcCdngCVrsn() /** { "tree" :"Claim.supportingInfo.reason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setReason, addCoding, setVersion"} **/
						, claim.getClmSpprtngnfRsnCcCdngCCde() /** { "tree" :"Claim.supportingInfo.reason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setReason, addCoding, setCode"} **/
						, claim.getClmSpprtngnfRsnCcCdngCDsplay() /** { "tree" :"Claim.supportingInfo.reason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setReason, addCoding, setDisplay"} **/
						, claim.getClmSpprtngnfRsnCcCdngCSrSlctd() /** { "tree" :"Claim.supportingInfo.reason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setReason, addCoding, setUserSelected"} **/
						, claim.getClmSpprtngnfRsnCcTxt() /** { "tree" :"Claim.supportingInfo.reason", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addSupportingInfo"] , "methodName" : "setReason, setText"} **/
						));
Claimobj.setSequence(HapiFHIRHelpers.createpositiveInt(claim.getClmDgnssSqncPstvnt() /** { "tree" :"Claim.diagnosis.sequence", "datatype" : "positiveInt", "cardinality" : "Required", "elementtree" : ["addDiagnosis"] , "methodName" : "setSequence"} **/
						));
Claimobj.setDiagnosisCodeableconcept(HapiFHIRHelpers.createCodeableConcept(claim.getClmDgnssDgnssCdblcncptCcCdngCSstm() /** { "tree" :"Claim.diagnosis.diagnosisCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addDiagnosis"] , "methodName" : "setDiagnosisCodeableconcept, addCoding, setSystem"} **/
						, claim.getClmDgnssDgnssCdblcncptCcCdngCVrsn() /** { "tree" :"Claim.diagnosis.diagnosisCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addDiagnosis"] , "methodName" : "setDiagnosisCodeableconcept, addCoding, setVersion"} **/
						, claim.getClmDgnssDgnssCdblcncptCcCdngCCde() /** { "tree" :"Claim.diagnosis.diagnosisCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addDiagnosis"] , "methodName" : "setDiagnosisCodeableconcept, addCoding, setCode"} **/
						, claim.getClmDgnssDgnssCdblcncptCcCdngCDsplay() /** { "tree" :"Claim.diagnosis.diagnosisCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addDiagnosis"] , "methodName" : "setDiagnosisCodeableconcept, addCoding, setDisplay"} **/
						, claim.getClmDgnssDgnssCdblcncptCcCdngCSrSlctd() /** { "tree" :"Claim.diagnosis.diagnosisCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addDiagnosis"] , "methodName" : "setDiagnosisCodeableconcept, addCoding, setUserSelected"} **/
						, claim.getClmDgnssDgnssCdblcncptCcTxt() /** { "tree" :"Claim.diagnosis.diagnosisCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addDiagnosis"] , "methodName" : "setDiagnosisCodeableconcept, setText"} **/
						));
Claimobj.setDiagnosisReference(condition)(HapiFHIRHelpers.createReference(claim.getClmDgnssDgnssRfrncRfrnce() /** { "tree" :"Claim.diagnosis.diagnosisReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addDiagnosis"] , "methodName" : "setDiagnosisReference(condition)"} **/
						));
Claimobj.addType(HapiFHIRHelpers.createCodeableConcept(claim.getClmDgnssTpCcCdngCSstm() /** { "tree" :"Claim.diagnosis.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addDiagnosis"] , "methodName" : "addType, addCoding, setSystem"} **/
						, claim.getClmDgnssTpCcCdngCVrsn() /** { "tree" :"Claim.diagnosis.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addDiagnosis"] , "methodName" : "addType, addCoding, setVersion"} **/
						, claim.getClmDgnssTpCcCdngCCde() /** { "tree" :"Claim.diagnosis.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addDiagnosis"] , "methodName" : "addType, addCoding, setCode"} **/
						, claim.getClmDgnssTpCcCdngCDsplay() /** { "tree" :"Claim.diagnosis.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addDiagnosis"] , "methodName" : "addType, addCoding, setDisplay"} **/
						, claim.getClmDgnssTpCcCdngCSrSlctd() /** { "tree" :"Claim.diagnosis.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addDiagnosis"] , "methodName" : "addType, addCoding, setUserSelected"} **/
						, claim.getClaimDiagnosisTypeCcText() /** { "tree" :"Claim.diagnosis.type", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addDiagnosis"] , "methodName" : "addType, setText"} **/
						));
Claimobj.setOnAdmission(HapiFHIRHelpers.createCodeableConcept(claim.getClmDgnssNdmssnCcCdngCSstm() /** { "tree" :"Claim.diagnosis.onAdmission", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setOnAdmission, addCoding, setSystem"} **/
						, claim.getClmDgnssNdmssnCcCdngCVrsn() /** { "tree" :"Claim.diagnosis.onAdmission", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setOnAdmission, addCoding, setVersion"} **/
						, claim.getClmDgnssNdmssnCcCdngCCde() /** { "tree" :"Claim.diagnosis.onAdmission", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setOnAdmission, addCoding, setCode"} **/
						, claim.getClmDgnssNdmssnCcCdngCDsplay() /** { "tree" :"Claim.diagnosis.onAdmission", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setOnAdmission, addCoding, setDisplay"} **/
						, claim.getClmDgnssNdmssnCcCdngCSrSlctd() /** { "tree" :"Claim.diagnosis.onAdmission", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setOnAdmission, addCoding, setUserSelected"} **/
						, claim.getClmDgnssNdmssnCcTxt() /** { "tree" :"Claim.diagnosis.onAdmission", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setOnAdmission, setText"} **/
						));
Claimobj.setPackageCode(HapiFHIRHelpers.createCodeableConcept(claim.getClmDgnssPckgCdCcCdngCSstm() /** { "tree" :"Claim.diagnosis.packageCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setPackageCode, addCoding, setSystem"} **/
						, claim.getClmDgnssPckgCdCcCdngCVrsn() /** { "tree" :"Claim.diagnosis.packageCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setPackageCode, addCoding, setVersion"} **/
						, claim.getClmDgnssPckgCdCcCdngCCde() /** { "tree" :"Claim.diagnosis.packageCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setPackageCode, addCoding, setCode"} **/
						, claim.getClmDgnssPckgCdCcCdngCDsplay() /** { "tree" :"Claim.diagnosis.packageCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setPackageCode, addCoding, setDisplay"} **/
						, claim.getClmDgnssPckgCdCcCdngCSrSlctd() /** { "tree" :"Claim.diagnosis.packageCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setPackageCode, addCoding, setUserSelected"} **/
						, claim.getClmDgnssPckgCdCcTxt() /** { "tree" :"Claim.diagnosis.packageCode", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addDiagnosis"] , "methodName" : "setPackageCode, setText"} **/
						));
Claimobj.setSequence(HapiFHIRHelpers.createpositiveInt(claim.getClmPrcdrSqncPstvnt() /** { "tree" :"Claim.procedure.sequence", "datatype" : "positiveInt", "cardinality" : "Required", "elementtree" : ["addProcedure"] , "methodName" : "setSequence"} **/
						));
Claimobj.addType(HapiFHIRHelpers.createCodeableConcept(claim.getClmPrcdrTpCcCdngCSstm() /** { "tree" :"Claim.procedure.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addProcedure"] , "methodName" : "addType, addCoding, setSystem"} **/
						, claim.getClmPrcdrTpCcCdngCVrsn() /** { "tree" :"Claim.procedure.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addProcedure"] , "methodName" : "addType, addCoding, setVersion"} **/
						, claim.getClmPrcdrTpCcCdngCCde() /** { "tree" :"Claim.procedure.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addProcedure"] , "methodName" : "addType, addCoding, setCode"} **/
						, claim.getClmPrcdrTpCcCdngCDsplay() /** { "tree" :"Claim.procedure.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addProcedure"] , "methodName" : "addType, addCoding, setDisplay"} **/
						, claim.getClmPrcdrTpCcCdngCSrSlctd() /** { "tree" :"Claim.procedure.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addProcedure"] , "methodName" : "addType, addCoding, setUserSelected"} **/
						, claim.getClaimProcedureTypeCcText() /** { "tree" :"Claim.procedure.type", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addProcedure"] , "methodName" : "addType, setText"} **/
						));
Claimobj.setDate(HapiFHIRHelpers.createdateTime(claim.getClaimProcedureDateDateTime() /** { "tree" :"Claim.procedure.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addProcedure"] , "methodName" : "setDate"} **/
						));
Claimobj.setProcedureCodeableconcept(HapiFHIRHelpers.createCodeableConcept(claim.getClmPrcdrPrcdrCdblcncptCcCdngCSstm() /** { "tree" :"Claim.procedure.procedureCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addProcedure"] , "methodName" : "setProcedureCodeableconcept, addCoding, setSystem"} **/
						, claim.getClmPrcdrPrcdrCdblcncptCcCdngCVrsn() /** { "tree" :"Claim.procedure.procedureCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addProcedure"] , "methodName" : "setProcedureCodeableconcept, addCoding, setVersion"} **/
						, claim.getClmPrcdrPrcdrCdblcncptCcCdngCCde() /** { "tree" :"Claim.procedure.procedureCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addProcedure"] , "methodName" : "setProcedureCodeableconcept, addCoding, setCode"} **/
						, claim.getClmPrcdrPrcdrCdblcncptCcCdngCDsplay() /** { "tree" :"Claim.procedure.procedureCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addProcedure"] , "methodName" : "setProcedureCodeableconcept, addCoding, setDisplay"} **/
						, claim.getClmPrcdrPrcdrCdblcncptCcCdngCSrSlctd() /** { "tree" :"Claim.procedure.procedureCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addProcedure"] , "methodName" : "setProcedureCodeableconcept, addCoding, setUserSelected"} **/
						, claim.getClmPrcdrPrcdrCdblcncptCcTxt() /** { "tree" :"Claim.procedure.procedureCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addProcedure"] , "methodName" : "setProcedureCodeableconcept, setText"} **/
						));
Claimobj.setProcedureReference(procedure)(HapiFHIRHelpers.createReference(claim.getClmPrcdrPrcdrRfrncRfrnce() /** { "tree" :"Claim.procedure.procedureReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addProcedure"] , "methodName" : "setProcedureReference(procedure)"} **/
						));
Claimobj.addUdi(HapiFHIRHelpers.createReference(claim.getClaimProcedureUdiReference() /** { "tree" :"Claim.procedure.udi", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addProcedure"] , "methodName" : "addUdi"} **/
						));
Claimobj.setSequence(HapiFHIRHelpers.createpositiveInt(claim.getClmNsrncSqncPstvnt() /** { "tree" :"Claim.insurance.sequence", "datatype" : "positiveInt", "cardinality" : "Required", "elementtree" : ["addInsurance"] , "methodName" : "setSequence"} **/
						));
Claimobj.setFocal(HapiFHIRHelpers.createboolean(claim.getClaimInsuranceFocalBoolean() /** { "tree" :"Claim.insurance.focal", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["addInsurance"] , "methodName" : "setFocal"} **/
						));
Claimobj.setIdentifier(HapiFHIRHelpers.createIdentifier(claim.getClmNsrncDntfrDntfrSe() /** { "tree" :"Claim.insurance.identifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : ["addInsurance"] , "methodName" : "setIdentifier, setUse"} **/
						, claim.getClmNsrncDntfrDntfrTpCcCSstm() /** { "tree" :"Claim.insurance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addInsurance"] , "methodName" : "setIdentifier, setType, addCoding, setSystem"} **/
						, claim.getClmNsrncDntfrDntfrTpCcCVrsn() /** { "tree" :"Claim.insurance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addInsurance"] , "methodName" : "setIdentifier, setType, addCoding, setVersion"} **/
						, claim.getClmNsrncDntfrDntfrTpCcCCde() /** { "tree" :"Claim.insurance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addInsurance"] , "methodName" : "setIdentifier, setType, addCoding, setCode"} **/
						, claim.getClmNsrncDntfrDntfrTpCcCDsplay() /** { "tree" :"Claim.insurance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addInsurance"] , "methodName" : "setIdentifier, setType, addCoding, setDisplay"} **/
						, claim.getClmNsrncDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Claim.insurance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addInsurance"] , "methodName" : "setIdentifier, setType, addCoding, setUserSelected"} **/
						, claim.getClmNsrncDntfrDntfrTpCcTxt() /** { "tree" :"Claim.insurance.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addInsurance"] , "methodName" : "setIdentifier, setType, setText"} **/
						, claim.getClmNsrncDntfrDntfrPrdPrdStrt() /** { "tree" :"Claim.insurance.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addInsurance"] , "methodName" : "setIdentifier, setPeriod, setStart"} **/
						, claim.getClmNsrncDntfrDntfrPrdPrdNd() /** { "tree" :"Claim.insurance.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addInsurance"] , "methodName" : "setIdentifier, setPeriod, setEnd"} **/
						, claim.getClmNsrncDntfrDntfrSsgnr() /** { "tree" :"Claim.insurance.identifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : ["addInsurance"] , "methodName" : "setIdentifier, setAssigner"} **/
						, claim.getClmNsrncDntfrDntfrVlue() /** { "tree" :"Claim.insurance.identifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : ["addInsurance"] , "methodName" : "setIdentifier, setValue"} **/
						, claim.getClmNsrncDntfrDntfrSstm() /** { "tree" :"Claim.insurance.identifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : ["addInsurance"] , "methodName" : "setIdentifier, setSystem"} **/
						));
Claimobj.setCoverage(HapiFHIRHelpers.createReference(claim.getClaimInsuranceCoverageReference() /** { "tree" :"Claim.insurance.coverage", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addInsurance"] , "methodName" : "setCoverage"} **/
						));
Claimobj.setBusinessArrangement(HapiFHIRHelpers.createstring(claim.getClmNsrncBsnssrrngmntStrng() /** { "tree" :"Claim.insurance.businessArrangement", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addInsurance"] , "methodName" : "setBusinessArrangement"} **/
						));
Claimobj.addPreAuthRef(HapiFHIRHelpers.createstring(claim.getClaimInsurancePreAuthRefString() /** { "tree" :"Claim.insurance.preAuthRef", "datatype" : "string", "cardinality" : "Many", "elementtree" : ["addInsurance"] , "methodName" : "addPreAuthRef"} **/
						));
Claimobj.setClaimResponse(HapiFHIRHelpers.createReference(claim.getClmNsrncClmRspnsRfrnce() /** { "tree" :"Claim.insurance.claimResponse", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addInsurance"] , "methodName" : "setClaimResponse"} **/
						));
Claimobj.setDate(HapiFHIRHelpers.createdate(claim.getClaimAccidentDateDate() /** { "tree" :"Claim.accident.date", "datatype" : "date", "cardinality" : "Required", "elementtree" : ["setAccident"] , "methodName" : "setDate"} **/
						));
Claimobj.setType(HapiFHIRHelpers.createCodeableConcept(claim.getClmCcdntTpCcCdngCSstm() /** { "tree" :"Claim.accident.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setAccident"] , "methodName" : "setType, addCoding, setSystem"} **/
						, claim.getClmCcdntTpCcCdngCVrsn() /** { "tree" :"Claim.accident.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setAccident"] , "methodName" : "setType, addCoding, setVersion"} **/
						, claim.getClmCcdntTpCcCdngCCde() /** { "tree" :"Claim.accident.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setAccident"] , "methodName" : "setType, addCoding, setCode"} **/
						, claim.getClmCcdntTpCcCdngCDsplay() /** { "tree" :"Claim.accident.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setAccident"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, claim.getClmCcdntTpCcCdngCSrSlctd() /** { "tree" :"Claim.accident.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setAccident"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, claim.getClaimAccidentTypeCcText() /** { "tree" :"Claim.accident.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setAccident"] , "methodName" : "setType, setText"} **/
						));
Claimobj.setLocationAddress(HapiFHIRHelpers.createAddress(claim.getClmCcdntLctnddrssDdrssSe() /** { "tree" :"Claim.accident.locationAddress", "datatype" : "Address, code", "cardinality" : "ZeroOne", "elementtree" : ["setAccident"] , "methodName" : "setLocationAddress, setUse"} **/
						, claim.getClmCcdntLctnddrssDdrssTpe() /** { "tree" :"Claim.accident.locationAddress", "datatype" : "Address, code", "cardinality" : "ZeroOne", "elementtree" : ["setAccident"] , "methodName" : "setLocationAddress, setType"} **/
						, claim.getClmCcdntLctnddrssDdrssPrdPrdStrt() /** { "tree" :"Claim.accident.locationAddress", "datatype" : "Address, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setAccident"] , "methodName" : "setLocationAddress, setPeriod, setStart"} **/
						, claim.getClmCcdntLctnddrssDdrssPrdPrdNd() /** { "tree" :"Claim.accident.locationAddress", "datatype" : "Address, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setAccident"] , "methodName" : "setLocationAddress, setPeriod, setEnd"} **/
						, claim.getClmCcdntLctnddrssDdrssTxt() /** { "tree" :"Claim.accident.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["setAccident"] , "methodName" : "setLocationAddress, setText"} **/
						, claim.getClmCcdntLctnddrssDdrssLne() /** { "tree" :"Claim.accident.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["setAccident"] , "methodName" : "setLocationAddress, addLine"} **/
						, claim.getClmCcdntLctnddrssDdrssCty() /** { "tree" :"Claim.accident.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["setAccident"] , "methodName" : "setLocationAddress, setCity"} **/
						, claim.getClmCcdntLctnddrssDdrssDstrct() /** { "tree" :"Claim.accident.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["setAccident"] , "methodName" : "setLocationAddress, setDistrict"} **/
						, claim.getClmCcdntLctnddrssDdrssStte() /** { "tree" :"Claim.accident.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["setAccident"] , "methodName" : "setLocationAddress, setState"} **/
						, claim.getClmCcdntLctnddrssDdrssPstlCde() /** { "tree" :"Claim.accident.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["setAccident"] , "methodName" : "setLocationAddress, setPostalCode"} **/
						, claim.getClmCcdntLctnddrssDdrssCntry() /** { "tree" :"Claim.accident.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["setAccident"] , "methodName" : "setLocationAddress, setCounty"} **/
						));
Claimobj.setLocationReference(location)(HapiFHIRHelpers.createReference(claim.getClmCcdntLctnRfrncRfrnce() /** { "tree" :"Claim.accident.locationReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["setAccident"] , "methodName" : "setLocationReference(location)"} **/
						));
Claimobj.setSequence(HapiFHIRHelpers.createpositiveInt(claim.getClaimItemSequencePositiveInt() /** { "tree" :"Claim.item.sequence", "datatype" : "positiveInt", "cardinality" : "Required", "elementtree" : ["addItem"] , "methodName" : "setSequence"} **/
						));
Claimobj.addCareTeamSequence(HapiFHIRHelpers.createpositiveInt(claim.getClmTmCrTmSqncPstvnt() /** { "tree" :"Claim.item.careTeamSequence", "datatype" : "positiveInt", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addCareTeamSequence"} **/
						));
Claimobj.addDiagnosisSequence(HapiFHIRHelpers.createpositiveInt(claim.getClmTmDgnssSqncPstvnt() /** { "tree" :"Claim.item.diagnosisSequence", "datatype" : "positiveInt", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addDiagnosisSequence"} **/
						));
Claimobj.addProcedureSequence(HapiFHIRHelpers.createpositiveInt(claim.getClmTmPrcdrSqncPstvnt() /** { "tree" :"Claim.item.procedureSequence", "datatype" : "positiveInt", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addProcedureSequence"} **/
						));
Claimobj.addInformationSequence(HapiFHIRHelpers.createpositiveInt(claim.getClmTmNfrmtnSqncPstvnt() /** { "tree" :"Claim.item.informationSequence", "datatype" : "positiveInt", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addInformationSequence"} **/
						));
Claimobj.setRevenue(HapiFHIRHelpers.createCodeableConcept(claim.getClmTmRvnCcCdngCSstm() /** { "tree" :"Claim.item.revenue", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setRevenue, addCoding, setSystem"} **/
						, claim.getClmTmRvnCcCdngCVrsn() /** { "tree" :"Claim.item.revenue", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setRevenue, addCoding, setVersion"} **/
						, claim.getClmTmRvnCcCdngCCde() /** { "tree" :"Claim.item.revenue", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setRevenue, addCoding, setCode"} **/
						, claim.getClmTmRvnCcCdngCDsplay() /** { "tree" :"Claim.item.revenue", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setRevenue, addCoding, setDisplay"} **/
						, claim.getClmTmRvnCcCdngCSrSlctd() /** { "tree" :"Claim.item.revenue", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setRevenue, addCoding, setUserSelected"} **/
						, claim.getClaimItemRevenueCcText() /** { "tree" :"Claim.item.revenue", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setRevenue, setText"} **/
						));
Claimobj.setCategory(HapiFHIRHelpers.createCodeableConcept(claim.getClmTmCtgrCcCdngCSstm() /** { "tree" :"Claim.item.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setCategory, addCoding, setSystem"} **/
						, claim.getClmTmCtgrCcCdngCVrsn() /** { "tree" :"Claim.item.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setCategory, addCoding, setVersion"} **/
						, claim.getClmTmCtgrCcCdngCCde() /** { "tree" :"Claim.item.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setCategory, addCoding, setCode"} **/
						, claim.getClmTmCtgrCcCdngCDsplay() /** { "tree" :"Claim.item.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setCategory, addCoding, setDisplay"} **/
						, claim.getClmTmCtgrCcCdngCSrSlctd() /** { "tree" :"Claim.item.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setCategory, addCoding, setUserSelected"} **/
						, claim.getClaimItemCategoryCcText() /** { "tree" :"Claim.item.category", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setCategory, setText"} **/
						));
Claimobj.setProductOrService(HapiFHIRHelpers.createCodeableConcept(claim.getClmTmPrdctrSrvcCcCdngCSstm() /** { "tree" :"Claim.item.productOrService", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addItem"] , "methodName" : "setProductOrService, addCoding, setSystem"} **/
						, claim.getClmTmPrdctrSrvcCcCdngCVrsn() /** { "tree" :"Claim.item.productOrService", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addItem"] , "methodName" : "setProductOrService, addCoding, setVersion"} **/
						, claim.getClmTmPrdctrSrvcCcCdngCCde() /** { "tree" :"Claim.item.productOrService", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addItem"] , "methodName" : "setProductOrService, addCoding, setCode"} **/
						, claim.getClmTmPrdctrSrvcCcCdngCDsplay() /** { "tree" :"Claim.item.productOrService", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addItem"] , "methodName" : "setProductOrService, addCoding, setDisplay"} **/
						, claim.getClmTmPrdctrSrvcCcCdngCSrSlctd() /** { "tree" :"Claim.item.productOrService", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addItem"] , "methodName" : "setProductOrService, addCoding, setUserSelected"} **/
						, claim.getClmTmPrdctrSrvcCcTxt() /** { "tree" :"Claim.item.productOrService", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addItem"] , "methodName" : "setProductOrService, setText"} **/
						));
Claimobj.addModifier(HapiFHIRHelpers.createCodeableConcept(claim.getClmTmMdfrCcCdngCSstm() /** { "tree" :"Claim.item.modifier", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addModifier, addCoding, setSystem"} **/
						, claim.getClmTmMdfrCcCdngCVrsn() /** { "tree" :"Claim.item.modifier", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addModifier, addCoding, setVersion"} **/
						, claim.getClmTmMdfrCcCdngCCde() /** { "tree" :"Claim.item.modifier", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addModifier, addCoding, setCode"} **/
						, claim.getClmTmMdfrCcCdngCDsplay() /** { "tree" :"Claim.item.modifier", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addModifier, addCoding, setDisplay"} **/
						, claim.getClmTmMdfrCcCdngCSrSlctd() /** { "tree" :"Claim.item.modifier", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addModifier, addCoding, setUserSelected"} **/
						, claim.getClaimItemModifierCcText() /** { "tree" :"Claim.item.modifier", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addModifier, setText"} **/
						));
Claimobj.addProgramCode(HapiFHIRHelpers.createCodeableConcept(claim.getClmTmPrgrmCdCcCdngCSstm() /** { "tree" :"Claim.item.programCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addProgramCode, addCoding, setSystem"} **/
						, claim.getClmTmPrgrmCdCcCdngCVrsn() /** { "tree" :"Claim.item.programCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addProgramCode, addCoding, setVersion"} **/
						, claim.getClmTmPrgrmCdCcCdngCCde() /** { "tree" :"Claim.item.programCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addProgramCode, addCoding, setCode"} **/
						, claim.getClmTmPrgrmCdCcCdngCDsplay() /** { "tree" :"Claim.item.programCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addProgramCode, addCoding, setDisplay"} **/
						, claim.getClmTmPrgrmCdCcCdngCSrSlctd() /** { "tree" :"Claim.item.programCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addProgramCode, addCoding, setUserSelected"} **/
						, claim.getClaimItemProgramCodeCcText() /** { "tree" :"Claim.item.programCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addProgramCode, setText"} **/
						));
Claimobj.setServicedDate(HapiFHIRHelpers.createdate(claim.getClaimItemServicedDateDate() /** { "tree" :"Claim.item.servicedDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setServicedDate"} **/
						));
Claimobj.setServicedPeriod(HapiFHIRHelpers.createPeriod(claim.getClmTmSrvcdPrdPrdStrt() /** { "tree" :"Claim.item.servicedPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setServicedPeriod, setStart"} **/
						, claim.getClmTmSrvcdPrdPrdNd() /** { "tree" :"Claim.item.servicedPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setServicedPeriod, setEnd"} **/
						));
Claimobj.setLocationCodeableconcept(HapiFHIRHelpers.createCodeableConcept(claim.getClmTmLctnCdblcncptCcCdngCSstm() /** { "tree" :"Claim.item.locationCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setLocationCodeableconcept, addCoding, setSystem"} **/
						, claim.getClmTmLctnCdblcncptCcCdngCVrsn() /** { "tree" :"Claim.item.locationCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setLocationCodeableconcept, addCoding, setVersion"} **/
						, claim.getClmTmLctnCdblcncptCcCdngCCde() /** { "tree" :"Claim.item.locationCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setLocationCodeableconcept, addCoding, setCode"} **/
						, claim.getClmTmLctnCdblcncptCcCdngCDsplay() /** { "tree" :"Claim.item.locationCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setLocationCodeableconcept, addCoding, setDisplay"} **/
						, claim.getClmTmLctnCdblcncptCcCdngCSrSlctd() /** { "tree" :"Claim.item.locationCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setLocationCodeableconcept, addCoding, setUserSelected"} **/
						, claim.getClmTmLctnCdblcncptCcTxt() /** { "tree" :"Claim.item.locationCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setLocationCodeableconcept, setText"} **/
						));
Claimobj.setLocationAddress(HapiFHIRHelpers.createAddress(claim.getClmTmLctnddrssDdrssSe() /** { "tree" :"Claim.item.locationAddress", "datatype" : "Address, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setLocationAddress, setUse"} **/
						, claim.getClmTmLctnddrssDdrssTpe() /** { "tree" :"Claim.item.locationAddress", "datatype" : "Address, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setLocationAddress, setType"} **/
						, claim.getClmTmLctnddrssDdrssPrdPrdStrt() /** { "tree" :"Claim.item.locationAddress", "datatype" : "Address, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setLocationAddress, setPeriod, setStart"} **/
						, claim.getClmTmLctnddrssDdrssPrdPrdNd() /** { "tree" :"Claim.item.locationAddress", "datatype" : "Address, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setLocationAddress, setPeriod, setEnd"} **/
						, claim.getClmTmLctnddrssDdrssTxt() /** { "tree" :"Claim.item.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setLocationAddress, setText"} **/
						, claim.getClmTmLctnddrssDdrssLne() /** { "tree" :"Claim.item.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setLocationAddress, addLine"} **/
						, claim.getClmTmLctnddrssDdrssCty() /** { "tree" :"Claim.item.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setLocationAddress, setCity"} **/
						, claim.getClmTmLctnddrssDdrssDstrct() /** { "tree" :"Claim.item.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setLocationAddress, setDistrict"} **/
						, claim.getClmTmLctnddrssDdrssStte() /** { "tree" :"Claim.item.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setLocationAddress, setState"} **/
						, claim.getClmTmLctnddrssDdrssPstlCde() /** { "tree" :"Claim.item.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setLocationAddress, setPostalCode"} **/
						, claim.getClmTmLctnddrssDdrssCntry() /** { "tree" :"Claim.item.locationAddress", "datatype" : "Address, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setLocationAddress, setCounty"} **/
						));
Claimobj.setLocationReference(location)(HapiFHIRHelpers.createReference(claim.getClmTmLctnRfrncRfrnce() /** { "tree" :"Claim.item.locationReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setLocationReference(location)"} **/
						));
Claimobj.setQuantity(HapiFHIRHelpers.createSimpleQuantity(claim.getClaimItemQuantitySimpleQuantity() /** { "tree" :"Claim.item.quantity", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setQuantity"} **/
						));
Claimobj.setUnitPrice(HapiFHIRHelpers.createMoney(claim.getClmTmNtPrcMnCrrncy() /** { "tree" :"Claim.item.unitPrice", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setUnitPrice, setCurrency"} **/
						, claim.getClaimItemUnitPriceMoneyValue() /** { "tree" :"Claim.item.unitPrice", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setUnitPrice, setVal"} **/
						));
Claimobj.setFactor(HapiFHIRHelpers.createdecimal(claim.getClaimItemFactorDecimal() /** { "tree" :"Claim.item.factor", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setFactor"} **/
						));
Claimobj.setNet(HapiFHIRHelpers.createMoney(claim.getClaimItemNetMoneyCurrency() /** { "tree" :"Claim.item.net", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setNet, setCurrency"} **/
						, claim.getClaimItemNetMoneyValue() /** { "tree" :"Claim.item.net", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setNet, setVal"} **/
						));
Claimobj.addUdi(HapiFHIRHelpers.createReference(claim.getClaimItemUdiReference() /** { "tree" :"Claim.item.udi", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addUdi"} **/
						));
Claimobj.setBodySite(HapiFHIRHelpers.createCodeableConcept(claim.getClmTmBdStCcCdngCSstm() /** { "tree" :"Claim.item.bodySite", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setBodySite, addCoding, setSystem"} **/
						, claim.getClmTmBdStCcCdngCVrsn() /** { "tree" :"Claim.item.bodySite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setBodySite, addCoding, setVersion"} **/
						, claim.getClmTmBdStCcCdngCCde() /** { "tree" :"Claim.item.bodySite", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setBodySite, addCoding, setCode"} **/
						, claim.getClmTmBdStCcCdngCDsplay() /** { "tree" :"Claim.item.bodySite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setBodySite, addCoding, setDisplay"} **/
						, claim.getClmTmBdStCcCdngCSrSlctd() /** { "tree" :"Claim.item.bodySite", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setBodySite, addCoding, setUserSelected"} **/
						, claim.getClaimItemBodySiteCcText() /** { "tree" :"Claim.item.bodySite", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setBodySite, setText"} **/
						));
Claimobj.addSubSite(HapiFHIRHelpers.createCodeableConcept(claim.getClmTmSbStCcCdngCSstm() /** { "tree" :"Claim.item.subSite", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addSubSite, addCoding, setSystem"} **/
						, claim.getClmTmSbStCcCdngCVrsn() /** { "tree" :"Claim.item.subSite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addSubSite, addCoding, setVersion"} **/
						, claim.getClmTmSbStCcCdngCCde() /** { "tree" :"Claim.item.subSite", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addSubSite, addCoding, setCode"} **/
						, claim.getClmTmSbStCcCdngCDsplay() /** { "tree" :"Claim.item.subSite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addSubSite, addCoding, setDisplay"} **/
						, claim.getClmTmSbStCcCdngCSrSlctd() /** { "tree" :"Claim.item.subSite", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addSubSite, addCoding, setUserSelected"} **/
						, claim.getClaimItemSubSiteCcText() /** { "tree" :"Claim.item.subSite", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addSubSite, setText"} **/
						));
Claimobj.addEncounter(HapiFHIRHelpers.createReference(claim.getClaimItemEncounterReference() /** { "tree" :"Claim.item.encounter", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addEncounter"} **/
						));
Claimobj.setSequence(HapiFHIRHelpers.createpositiveInt(claim.getClmTmDtlSqncPstvnt() /** { "tree" :"Claim.item.detail.sequence", "datatype" : "positiveInt", "cardinality" : "Required", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setSequence"} **/
						));
Claimobj.setRevenue(HapiFHIRHelpers.createCodeableConcept(claim.getClmTmDtlRvnCcCdngCSstm() /** { "tree" :"Claim.item.detail.revenue", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setRevenue, addCoding, setSystem"} **/
						, claim.getClmTmDtlRvnCcCdngCVrsn() /** { "tree" :"Claim.item.detail.revenue", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setRevenue, addCoding, setVersion"} **/
						, claim.getClmTmDtlRvnCcCdngCCde() /** { "tree" :"Claim.item.detail.revenue", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setRevenue, addCoding, setCode"} **/
						, claim.getClmTmDtlRvnCcCdngCDsplay() /** { "tree" :"Claim.item.detail.revenue", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setRevenue, addCoding, setDisplay"} **/
						, claim.getClmTmDtlRvnCcCdngCSrSlctd() /** { "tree" :"Claim.item.detail.revenue", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setRevenue, addCoding, setUserSelected"} **/
						, claim.getClaimItemDetailRevenueCcText() /** { "tree" :"Claim.item.detail.revenue", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setRevenue, setText"} **/
						));
Claimobj.setCategory(HapiFHIRHelpers.createCodeableConcept(claim.getClmTmDtlCtgrCcCdngCSstm() /** { "tree" :"Claim.item.detail.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setCategory, addCoding, setSystem"} **/
						, claim.getClmTmDtlCtgrCcCdngCVrsn() /** { "tree" :"Claim.item.detail.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setCategory, addCoding, setVersion"} **/
						, claim.getClmTmDtlCtgrCcCdngCCde() /** { "tree" :"Claim.item.detail.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setCategory, addCoding, setCode"} **/
						, claim.getClmTmDtlCtgrCcCdngCDsplay() /** { "tree" :"Claim.item.detail.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setCategory, addCoding, setDisplay"} **/
						, claim.getClmTmDtlCtgrCcCdngCSrSlctd() /** { "tree" :"Claim.item.detail.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setCategory, addCoding, setUserSelected"} **/
						, claim.getClaimItemDetailCategoryCcText() /** { "tree" :"Claim.item.detail.category", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setCategory, setText"} **/
						));
Claimobj.setProductOrService(HapiFHIRHelpers.createCodeableConcept(claim.getClmTmDtlPrdctrSrvcCcCdngCSstm() /** { "tree" :"Claim.item.detail.productOrService", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setProductOrService, addCoding, setSystem"} **/
						, claim.getClmTmDtlPrdctrSrvcCcCdngCVrsn() /** { "tree" :"Claim.item.detail.productOrService", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setProductOrService, addCoding, setVersion"} **/
						, claim.getClmTmDtlPrdctrSrvcCcCdngCCde() /** { "tree" :"Claim.item.detail.productOrService", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setProductOrService, addCoding, setCode"} **/
						, claim.getClmTmDtlPrdctrSrvcCcCdngCDsplay() /** { "tree" :"Claim.item.detail.productOrService", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setProductOrService, addCoding, setDisplay"} **/
						, claim.getClmTmDtlPrdctrSrvcCcCdngCSrSlctd() /** { "tree" :"Claim.item.detail.productOrService", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setProductOrService, addCoding, setUserSelected"} **/
						, claim.getClmTmDtlPrdctrSrvcCcTxt() /** { "tree" :"Claim.item.detail.productOrService", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setProductOrService, setText"} **/
						));
Claimobj.addModifier(HapiFHIRHelpers.createCodeableConcept(claim.getClmTmDtlMdfrCcCdngCSstm() /** { "tree" :"Claim.item.detail.modifier", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail"] , "methodName" : "addModifier, addCoding, setSystem"} **/
						, claim.getClmTmDtlMdfrCcCdngCVrsn() /** { "tree" :"Claim.item.detail.modifier", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail"] , "methodName" : "addModifier, addCoding, setVersion"} **/
						, claim.getClmTmDtlMdfrCcCdngCCde() /** { "tree" :"Claim.item.detail.modifier", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail"] , "methodName" : "addModifier, addCoding, setCode"} **/
						, claim.getClmTmDtlMdfrCcCdngCDsplay() /** { "tree" :"Claim.item.detail.modifier", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail"] , "methodName" : "addModifier, addCoding, setDisplay"} **/
						, claim.getClmTmDtlMdfrCcCdngCSrSlctd() /** { "tree" :"Claim.item.detail.modifier", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail"] , "methodName" : "addModifier, addCoding, setUserSelected"} **/
						, claim.getClaimItemDetailModifierCcText() /** { "tree" :"Claim.item.detail.modifier", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail"] , "methodName" : "addModifier, setText"} **/
						));
Claimobj.addProgramCode(HapiFHIRHelpers.createCodeableConcept(claim.getClmTmDtlPrgrmCdCcCdngCSstm() /** { "tree" :"Claim.item.detail.programCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail"] , "methodName" : "addProgramCode, addCoding, setSystem"} **/
						, claim.getClmTmDtlPrgrmCdCcCdngCVrsn() /** { "tree" :"Claim.item.detail.programCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail"] , "methodName" : "addProgramCode, addCoding, setVersion"} **/
						, claim.getClmTmDtlPrgrmCdCcCdngCCde() /** { "tree" :"Claim.item.detail.programCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail"] , "methodName" : "addProgramCode, addCoding, setCode"} **/
						, claim.getClmTmDtlPrgrmCdCcCdngCDsplay() /** { "tree" :"Claim.item.detail.programCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail"] , "methodName" : "addProgramCode, addCoding, setDisplay"} **/
						, claim.getClmTmDtlPrgrmCdCcCdngCSrSlctd() /** { "tree" :"Claim.item.detail.programCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail"] , "methodName" : "addProgramCode, addCoding, setUserSelected"} **/
						, claim.getClmTmDtlPrgrmCdCcTxt() /** { "tree" :"Claim.item.detail.programCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail"] , "methodName" : "addProgramCode, setText"} **/
						));
Claimobj.setQuantity(HapiFHIRHelpers.createSimpleQuantity(claim.getClmTmDtlQnttSmplQntty() /** { "tree" :"Claim.item.detail.quantity", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setQuantity"} **/
						));
Claimobj.setUnitPrice(HapiFHIRHelpers.createMoney(claim.getClmTmDtlNtPrcMnCrrncy() /** { "tree" :"Claim.item.detail.unitPrice", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setUnitPrice, setCurrency"} **/
						, claim.getClmTmDtlNtPrcMnVlue() /** { "tree" :"Claim.item.detail.unitPrice", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setUnitPrice, setVal"} **/
						));
Claimobj.setFactor(HapiFHIRHelpers.createdecimal(claim.getClaimItemDetailFactorDecimal() /** { "tree" :"Claim.item.detail.factor", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setFactor"} **/
						));
Claimobj.setNet(HapiFHIRHelpers.createMoney(claim.getClmTmDtlNtMnCrrncy() /** { "tree" :"Claim.item.detail.net", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setNet, setCurrency"} **/
						, claim.getClaimItemDetailNetMoneyValue() /** { "tree" :"Claim.item.detail.net", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail"] , "methodName" : "setNet, setVal"} **/
						));
Claimobj.addUdi(HapiFHIRHelpers.createReference(claim.getClaimItemDetailUdiReference() /** { "tree" :"Claim.item.detail.udi", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail"] , "methodName" : "addUdi"} **/
						));
Claimobj.setSequence(HapiFHIRHelpers.createpositiveInt(claim.getClmTmDtlSbDtlSqncPstvnt() /** { "tree" :"Claim.item.detail.subDetail.sequence", "datatype" : "positiveInt", "cardinality" : "Required", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setSequence"} **/
						));
Claimobj.setRevenue(HapiFHIRHelpers.createCodeableConcept(claim.getClmTmDtlSbDtlRvnCcCdngCSstm() /** { "tree" :"Claim.item.detail.subDetail.revenue", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setRevenue, addCoding, setSystem"} **/
						, claim.getClmTmDtlSbDtlRvnCcCdngCVrsn() /** { "tree" :"Claim.item.detail.subDetail.revenue", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setRevenue, addCoding, setVersion"} **/
						, claim.getClmTmDtlSbDtlRvnCcCdngCCde() /** { "tree" :"Claim.item.detail.subDetail.revenue", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setRevenue, addCoding, setCode"} **/
						, claim.getClmTmDtlSbDtlRvnCcCdngCDsplay() /** { "tree" :"Claim.item.detail.subDetail.revenue", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setRevenue, addCoding, setDisplay"} **/
						, claim.getClmTmDtlSbDtlRvnCcCdngCSrSlctd() /** { "tree" :"Claim.item.detail.subDetail.revenue", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setRevenue, addCoding, setUserSelected"} **/
						, claim.getClmTmDtlSbDtlRvnCcTxt() /** { "tree" :"Claim.item.detail.subDetail.revenue", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setRevenue, setText"} **/
						));
Claimobj.setCategory(HapiFHIRHelpers.createCodeableConcept(claim.getClmTmDtlSbDtlCtgrCcCdngCSstm() /** { "tree" :"Claim.item.detail.subDetail.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setCategory, addCoding, setSystem"} **/
						, claim.getClmTmDtlSbDtlCtgrCcCdngCVrsn() /** { "tree" :"Claim.item.detail.subDetail.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setCategory, addCoding, setVersion"} **/
						, claim.getClmTmDtlSbDtlCtgrCcCdngCCde() /** { "tree" :"Claim.item.detail.subDetail.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setCategory, addCoding, setCode"} **/
						, claim.getClmTmDtlSbDtlCtgrCcCdngCDsplay() /** { "tree" :"Claim.item.detail.subDetail.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setCategory, addCoding, setDisplay"} **/
						, claim.getClmTmDtlSbDtlCtgrCcCdngCSrSlctd() /** { "tree" :"Claim.item.detail.subDetail.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setCategory, addCoding, setUserSelected"} **/
						, claim.getClmTmDtlSbDtlCtgrCcTxt() /** { "tree" :"Claim.item.detail.subDetail.category", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setCategory, setText"} **/
						));
Claimobj.setProductOrService(HapiFHIRHelpers.createCodeableConcept(claim.getClmTmDtlSbDtlPrdctrSrvcCcCdngCSstm() /** { "tree" :"Claim.item.detail.subDetail.productOrService", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setProductOrService, addCoding, setSystem"} **/
						, claim.getClmTmDtlSbDtlPrdctrSrvcCcCdngCVrsn() /** { "tree" :"Claim.item.detail.subDetail.productOrService", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setProductOrService, addCoding, setVersion"} **/
						, claim.getClmTmDtlSbDtlPrdctrSrvcCcCdngCCde() /** { "tree" :"Claim.item.detail.subDetail.productOrService", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setProductOrService, addCoding, setCode"} **/
						, claim.getClmTmDtlSbDtlPrdctrSrvcCcCdngCDsplay() /** { "tree" :"Claim.item.detail.subDetail.productOrService", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setProductOrService, addCoding, setDisplay"} **/
						, claim.getClmTmDtlSbDtlPrdctrSrvcCcCdngCSrSlctd() /** { "tree" :"Claim.item.detail.subDetail.productOrService", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setProductOrService, addCoding, setUserSelected"} **/
						, claim.getClmTmDtlSbDtlPrdctrSrvcCcTxt() /** { "tree" :"Claim.item.detail.subDetail.productOrService", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setProductOrService, setText"} **/
						));
Claimobj.addModifier(HapiFHIRHelpers.createCodeableConcept(claim.getClmTmDtlSbDtlMdfrCcCdngCSstm() /** { "tree" :"Claim.item.detail.subDetail.modifier", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "addModifier, addCoding, setSystem"} **/
						, claim.getClmTmDtlSbDtlMdfrCcCdngCVrsn() /** { "tree" :"Claim.item.detail.subDetail.modifier", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "addModifier, addCoding, setVersion"} **/
						, claim.getClmTmDtlSbDtlMdfrCcCdngCCde() /** { "tree" :"Claim.item.detail.subDetail.modifier", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "addModifier, addCoding, setCode"} **/
						, claim.getClmTmDtlSbDtlMdfrCcCdngCDsplay() /** { "tree" :"Claim.item.detail.subDetail.modifier", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "addModifier, addCoding, setDisplay"} **/
						, claim.getClmTmDtlSbDtlMdfrCcCdngCSrSlctd() /** { "tree" :"Claim.item.detail.subDetail.modifier", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "addModifier, addCoding, setUserSelected"} **/
						, claim.getClmTmDtlSbDtlMdfrCcTxt() /** { "tree" :"Claim.item.detail.subDetail.modifier", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "addModifier, setText"} **/
						));
Claimobj.addProgramCode(HapiFHIRHelpers.createCodeableConcept(claim.getClmTmDtlSbDtlPrgrmCdCcCdngCSstm() /** { "tree" :"Claim.item.detail.subDetail.programCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "addProgramCode, addCoding, setSystem"} **/
						, claim.getClmTmDtlSbDtlPrgrmCdCcCdngCVrsn() /** { "tree" :"Claim.item.detail.subDetail.programCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "addProgramCode, addCoding, setVersion"} **/
						, claim.getClmTmDtlSbDtlPrgrmCdCcCdngCCde() /** { "tree" :"Claim.item.detail.subDetail.programCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "addProgramCode, addCoding, setCode"} **/
						, claim.getClmTmDtlSbDtlPrgrmCdCcCdngCDsplay() /** { "tree" :"Claim.item.detail.subDetail.programCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "addProgramCode, addCoding, setDisplay"} **/
						, claim.getClmTmDtlSbDtlPrgrmCdCcCdngCSrSlctd() /** { "tree" :"Claim.item.detail.subDetail.programCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "addProgramCode, addCoding, setUserSelected"} **/
						, claim.getClmTmDtlSbDtlPrgrmCdCcTxt() /** { "tree" :"Claim.item.detail.subDetail.programCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "addProgramCode, setText"} **/
						));
Claimobj.setQuantity(HapiFHIRHelpers.createSimpleQuantity(claim.getClmTmDtlSbDtlQnttSmplQntty() /** { "tree" :"Claim.item.detail.subDetail.quantity", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setQuantity"} **/
						));
Claimobj.setUnitPrice(HapiFHIRHelpers.createMoney(claim.getClmTmDtlSbDtlNtPrcMnCrrncy() /** { "tree" :"Claim.item.detail.subDetail.unitPrice", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setUnitPrice, setCurrency"} **/
						, claim.getClmTmDtlSbDtlNtPrcMnVlue() /** { "tree" :"Claim.item.detail.subDetail.unitPrice", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setUnitPrice, setVal"} **/
						));
Claimobj.setFactor(HapiFHIRHelpers.createdecimal(claim.getClmTmDtlSbDtlFctrDcml() /** { "tree" :"Claim.item.detail.subDetail.factor", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setFactor"} **/
						));
Claimobj.setNet(HapiFHIRHelpers.createMoney(claim.getClmTmDtlSbDtlNtMnCrrncy() /** { "tree" :"Claim.item.detail.subDetail.net", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setNet, setCurrency"} **/
						, claim.getClmTmDtlSbDtlNtMnVlue() /** { "tree" :"Claim.item.detail.subDetail.net", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "setNet, setVal"} **/
						));
Claimobj.addUdi(HapiFHIRHelpers.createReference(claim.getClmTmDtlSbDtlDRfrnce() /** { "tree" :"Claim.item.detail.subDetail.udi", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addItem", "addDetail", "addSubDetail"] , "methodName" : "addUdi"} **/
						));
Claimobj.setTotal(HapiFHIRHelpers.createMoney(claim.getClaimTotalMoneyCurrency() /** { "tree" :"Claim.total", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTotal, setCurrency"} **/
						, claim.getClaimTotalMoneyValue() /** { "tree" :"Claim.total", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTotal, setVal"} **/
		));
	}
}
