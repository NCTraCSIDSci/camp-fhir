package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Consent.
 * @see .Consent
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ConsentConversion 
{
	public Patient Consents(main.templateoutput.Model.Consent consent) 
	{
			Patient  Consentobj = new Patient(); 

						Consentobj.addIdentifier(HapiFHIRHelpers.createIdentifier(consent.getConsentIdentifierIdentifierUse() /** { "tree" :"Consent.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, consent.getCnsntDntfrDntfrTpCcCSstm() /** { "tree" :"Consent.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, consent.getCnsntDntfrDntfrTpCcCVrsn() /** { "tree" :"Consent.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, consent.getCnsntDntfrDntfrTpCcCCde() /** { "tree" :"Consent.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, consent.getCnsntDntfrDntfrTpCcCDsplay() /** { "tree" :"Consent.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, consent.getCnsntDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Consent.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, consent.getCnsntDntfrDntfrTpCcTxt() /** { "tree" :"Consent.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, consent.getCnsntDntfrDntfrPrdPrdStrt() /** { "tree" :"Consent.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, consent.getCnsntDntfrDntfrPrdPrdNd() /** { "tree" :"Consent.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, consent.getCnsntDntfrDntfrSsgnr() /** { "tree" :"Consent.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, consent.getCnsntDntfrDntfrVlue() /** { "tree" :"Consent.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, consent.getCnsntDntfrDntfrSstm() /** { "tree" :"Consent.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Consentobj.setStatus(HapiFHIRHelpers.createcode(consent.getConsentStatusCode() /** { "tree" :"Consent.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Consentobj.setScope(HapiFHIRHelpers.createCodeableConcept(consent.getConsentScopeCcCodingCSystem() /** { "tree" :"Consent.scope", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setScope, addCoding, setSystem"} **/
						, consent.getConsentScopeCcCodingCVersion() /** { "tree" :"Consent.scope", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setScope, addCoding, setVersion"} **/
						, consent.getConsentScopeCcCodingCCode() /** { "tree" :"Consent.scope", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setScope, addCoding, setCode"} **/
						, consent.getConsentScopeCcCodingCDisplay() /** { "tree" :"Consent.scope", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setScope, addCoding, setDisplay"} **/
						, consent.getCnsntScpCcCdngCSrSlctd() /** { "tree" :"Consent.scope", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setScope, addCoding, setUserSelected"} **/
						, consent.getConsentScopeCcText() /** { "tree" :"Consent.scope", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setScope, setText"} **/
						));
Consentobj.setCategory(HapiFHIRHelpers.createCodeableConcept(consent.getCnsntCtgrCcCdngCSstm() /** { "tree" :"Consent.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCategory, addCoding, setSystem"} **/
						, consent.getCnsntCtgrCcCdngCVrsn() /** { "tree" :"Consent.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCategory, addCoding, setVersion"} **/
						, consent.getConsentCategoryCcCodingCCode() /** { "tree" :"Consent.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCategory, addCoding, setCode"} **/
						, consent.getCnsntCtgrCcCdngCDsplay() /** { "tree" :"Consent.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCategory, addCoding, setDisplay"} **/
						, consent.getCnsntCtgrCcCdngCSrSlctd() /** { "tree" :"Consent.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCategory, addCoding, setUserSelected"} **/
						, consent.getConsentCategoryCcText() /** { "tree" :"Consent.category", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCategory, setText"} **/
						));
Consentobj.setPatient(HapiFHIRHelpers.createReference(consent.getConsentPntReference() /** { "tree" :"Consent.patient", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPatient"} **/
						));
Consentobj.setDateTime(HapiFHIRHelpers.createdateTime(consent.getConsentDateTimeDateTime() /** { "tree" :"Consent.dateTime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDateTime"} **/
						));
Consentobj.addPerformer(HapiFHIRHelpers.createReference(consent.getConsentPerformerReference() /** { "tree" :"Consent.performer", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPerformer"} **/
						));
Consentobj.addOrganization(HapiFHIRHelpers.createReference(consent.getConsentOrganizationReference() /** { "tree" :"Consent.organization", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOrganization"} **/
						));
Consentobj.setSourceAttachment(HapiFHIRHelpers.createAttachment(consent.getCnsntSrcttchmntTtchmntDta() /** { "tree" :"Consent.sourceAttachment", "datatype" : "Attachment, base64Binary", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSourceAttachment, setData"} **/
						, consent.getCnsntSrcttchmntTtchmntHsh() /** { "tree" :"Consent.sourceAttachment", "datatype" : "Attachment, base64Binary", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSourceAttachment, setHash"} **/
						, consent.getCnsntSrcttchmntTtchmntCntntTpe() /** { "tree" :"Consent.sourceAttachment", "datatype" : "Attachment, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSourceAttachment, setContentType"} **/
						, consent.getCnsntSrcttchmntTtchmntLngge() /** { "tree" :"Consent.sourceAttachment", "datatype" : "Attachment, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSourceAttachment, setLanguage"} **/
						, consent.getCnsntSrcttchmntTtchmntCrtn() /** { "tree" :"Consent.sourceAttachment", "datatype" : "Attachment, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSourceAttachment, setCreation"} **/
						, consent.getCnsntSrcttchmntTtchmntTtle() /** { "tree" :"Consent.sourceAttachment", "datatype" : "Attachment, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSourceAttachment, setTitle"} **/
						, consent.getCnsntSrcttchmntTtchmntSze() /** { "tree" :"Consent.sourceAttachment", "datatype" : "Attachment, unsignedInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSourceAttachment, setSize"} **/
						, consent.getCnsntSrcttchmntTtchmntRl() /** { "tree" :"Consent.sourceAttachment", "datatype" : "Attachment, url", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSourceAttachment, setUrl"} **/
						));
Consentobj.setSourceReference(consent | documentreference | contract | questionnaireresponse)(HapiFHIRHelpers.createReference(consent.getConsentSourceReferenceReference() /** { "tree" :"Consent.sourceReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSourceReference(consent | documentreference | contract | questionnaireresponse)"} **/
						));
Consentobj.setAuthority(HapiFHIRHelpers.createuri(consent.getConsentPolicyAuthorityUri() /** { "tree" :"Consent.policy.authority", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["addPolicy"] , "methodName" : "setAuthority"} **/
						));
Consentobj.setUri(HapiFHIRHelpers.createuri(consent.getConsentPolicyUriUri() /** { "tree" :"Consent.policy.uri", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["addPolicy"] , "methodName" : "setUri"} **/
						));
Consentobj.setPolicyRule(HapiFHIRHelpers.createCodeableConcept(consent.getCnsntPlcRlCcCdngCSstm() /** { "tree" :"Consent.policyRule", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPolicyRule, addCoding, setSystem"} **/
						, consent.getCnsntPlcRlCcCdngCVrsn() /** { "tree" :"Consent.policyRule", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPolicyRule, addCoding, setVersion"} **/
						, consent.getCnsntPlcRlCcCdngCCde() /** { "tree" :"Consent.policyRule", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPolicyRule, addCoding, setCode"} **/
						, consent.getCnsntPlcRlCcCdngCDsplay() /** { "tree" :"Consent.policyRule", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPolicyRule, addCoding, setDisplay"} **/
						, consent.getCnsntPlcRlCcCdngCSrSlctd() /** { "tree" :"Consent.policyRule", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPolicyRule, addCoding, setUserSelected"} **/
						, consent.getConsentPolicyRuleCcText() /** { "tree" :"Consent.policyRule", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPolicyRule, setText"} **/
						));
Consentobj.setVerified(HapiFHIRHelpers.createboolean(consent.getCnsntVrfctnVrfdBln() /** { "tree" :"Consent.verification.verified", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["addVerification"] , "methodName" : "setVerified"} **/
						));
Consentobj.setVerifiedWith(HapiFHIRHelpers.createReference(consent.getCnsntVrfctnVrfdWthRfrnce() /** { "tree" :"Consent.verification.verifiedWith", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addVerification"] , "methodName" : "setVerifiedWith"} **/
						));
Consentobj.setVerificationDate(HapiFHIRHelpers.createdateTime(consent.getCnsntVrfctnVrfctnDtDtTme() /** { "tree" :"Consent.verification.verificationDate", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addVerification"] , "methodName" : "setVerificationDate"} **/
						));
Consentobj.setType(HapiFHIRHelpers.createcode(consent.getConsentProvisionTypeCode() /** { "tree" :"Consent.provision.type", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["setProvision"] , "methodName" : "setType"} **/
						));
Consentobj.setPeriod(HapiFHIRHelpers.createPeriod(consent.getCnsntPrvsnPrdPrdStrt() /** { "tree" :"Consent.provision.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setProvision"] , "methodName" : "setPeriod, setStart"} **/
						, consent.getCnsntPrvsnPrdPrdNd() /** { "tree" :"Consent.provision.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setProvision"] , "methodName" : "setPeriod, setEnd"} **/
						));
Consentobj.setRole(HapiFHIRHelpers.createCodeableConcept(consent.getCnsntPrvsnCtrRlCcCdngCSstm() /** { "tree" :"Consent.provision.actor.role", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["setProvision", "addActor"] , "methodName" : "setRole, addCoding, setSystem"} **/
						, consent.getCnsntPrvsnCtrRlCcCdngCVrsn() /** { "tree" :"Consent.provision.actor.role", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["setProvision", "addActor"] , "methodName" : "setRole, addCoding, setVersion"} **/
						, consent.getCnsntPrvsnCtrRlCcCdngCCde() /** { "tree" :"Consent.provision.actor.role", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["setProvision", "addActor"] , "methodName" : "setRole, addCoding, setCode"} **/
						, consent.getCnsntPrvsnCtrRlCcCdngCDsplay() /** { "tree" :"Consent.provision.actor.role", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["setProvision", "addActor"] , "methodName" : "setRole, addCoding, setDisplay"} **/
						, consent.getCnsntPrvsnCtrRlCcCdngCSrSlctd() /** { "tree" :"Consent.provision.actor.role", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["setProvision", "addActor"] , "methodName" : "setRole, addCoding, setUserSelected"} **/
						, consent.getCnsntPrvsnCtrRlCcTxt() /** { "tree" :"Consent.provision.actor.role", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["setProvision", "addActor"] , "methodName" : "setRole, setText"} **/
						));
Consentobj.setReference(HapiFHIRHelpers.createReference(consent.getCnsntPrvsnCtrRfrncRfrnce() /** { "tree" :"Consent.provision.actor.reference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["setProvision", "addActor"] , "methodName" : "setReference"} **/
						));
Consentobj.addAction(HapiFHIRHelpers.createCodeableConcept(consent.getCnsntPrvsnCtnCcCdngCSstm() /** { "tree" :"Consent.provision.action", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addAction, addCoding, setSystem"} **/
						, consent.getCnsntPrvsnCtnCcCdngCVrsn() /** { "tree" :"Consent.provision.action", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addAction, addCoding, setVersion"} **/
						, consent.getCnsntPrvsnCtnCcCdngCCde() /** { "tree" :"Consent.provision.action", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addAction, addCoding, setCode"} **/
						, consent.getCnsntPrvsnCtnCcCdngCDsplay() /** { "tree" :"Consent.provision.action", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addAction, addCoding, setDisplay"} **/
						, consent.getCnsntPrvsnCtnCcCdngCSrSlctd() /** { "tree" :"Consent.provision.action", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addAction, addCoding, setUserSelected"} **/
						, consent.getConsentProvisionActionCcText() /** { "tree" :"Consent.provision.action", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addAction, setText"} **/
						));
Consentobj.addSecurityLabel(HapiFHIRHelpers.createCoding(consent.getCnsntPrvsnScrtLblCSrSlctd() /** { "tree" :"Consent.provision.securityLabel", "datatype" : "Coding, boolean", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addSecurityLabel, setUserSelected"} **/
						, consent.getCnsntPrvsnScrtLblCCde() /** { "tree" :"Consent.provision.securityLabel", "datatype" : "Coding, code", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addSecurityLabel, setCode"} **/
						, consent.getCnsntPrvsnScrtLblCVrsn() /** { "tree" :"Consent.provision.securityLabel", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addSecurityLabel, setVersion"} **/
						, consent.getCnsntPrvsnScrtLblCDsplay() /** { "tree" :"Consent.provision.securityLabel", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addSecurityLabel, setDisplay"} **/
						, consent.getCnsntPrvsnScrtLblCSstm() /** { "tree" :"Consent.provision.securityLabel", "datatype" : "Coding, uri", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addSecurityLabel, setSystem"} **/
						));
Consentobj.addPurpose(HapiFHIRHelpers.createCoding(consent.getCnsntPrvsnPrpsCSrSlctd() /** { "tree" :"Consent.provision.purpose", "datatype" : "Coding, boolean", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addPurpose, setUserSelected"} **/
						, consent.getConsentProvisionPurposeCCode() /** { "tree" :"Consent.provision.purpose", "datatype" : "Coding, code", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addPurpose, setCode"} **/
						, consent.getCnsntPrvsnPrpsCVrsn() /** { "tree" :"Consent.provision.purpose", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addPurpose, setVersion"} **/
						, consent.getCnsntPrvsnPrpsCDsplay() /** { "tree" :"Consent.provision.purpose", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addPurpose, setDisplay"} **/
						, consent.getConsentProvisionPurposeCSystem() /** { "tree" :"Consent.provision.purpose", "datatype" : "Coding, uri", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addPurpose, setSystem"} **/
						));
Consentobj.addClass(HapiFHIRHelpers.createCoding(consent.getCnsntPrvsnClssCSrSlctd() /** { "tree" :"Consent.provision.class", "datatype" : "Coding, boolean", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addClass, setUserSelected"} **/
						, consent.getConsentProvisionClassCCode() /** { "tree" :"Consent.provision.class", "datatype" : "Coding, code", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addClass, setCode"} **/
						, consent.getConsentProvisionClassCVersion() /** { "tree" :"Consent.provision.class", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addClass, setVersion"} **/
						, consent.getConsentProvisionClassCDisplay() /** { "tree" :"Consent.provision.class", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addClass, setDisplay"} **/
						, consent.getConsentProvisionClassCSystem() /** { "tree" :"Consent.provision.class", "datatype" : "Coding, uri", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addClass, setSystem"} **/
						));
Consentobj.addCode(HapiFHIRHelpers.createCodeableConcept(consent.getCnsntPrvsnCdCcCdngCSstm() /** { "tree" :"Consent.provision.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addCode, addCoding, setSystem"} **/
						, consent.getCnsntPrvsnCdCcCdngCVrsn() /** { "tree" :"Consent.provision.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addCode, addCoding, setVersion"} **/
						, consent.getCnsntPrvsnCdCcCdngCCde() /** { "tree" :"Consent.provision.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addCode, addCoding, setCode"} **/
						, consent.getCnsntPrvsnCdCcCdngCDsplay() /** { "tree" :"Consent.provision.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addCode, addCoding, setDisplay"} **/
						, consent.getCnsntPrvsnCdCcCdngCSrSlctd() /** { "tree" :"Consent.provision.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addCode, addCoding, setUserSelected"} **/
						, consent.getConsentProvisionCodeCcText() /** { "tree" :"Consent.provision.code", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor"] , "methodName" : "addCode, setText"} **/
						));
Consentobj.setDataPeriod(HapiFHIRHelpers.createPeriod(consent.getCnsntPrvsnDtPrdPrdStrt() /** { "tree" :"Consent.provision.dataPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setProvision", "addActor"] , "methodName" : "setDataPeriod, setStart"} **/
						, consent.getCnsntPrvsnDtPrdPrdNd() /** { "tree" :"Consent.provision.dataPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setProvision", "addActor"] , "methodName" : "setDataPeriod, setEnd"} **/
						));
Consentobj.setMeaning(HapiFHIRHelpers.createcode(consent.getCnsntPrvsnDtMnngCde() /** { "tree" :"Consent.provision.data.meaning", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["setProvision", "addActor", "addData"] , "methodName" : "setMeaning"} **/
						));
Consentobj.setReference(HapiFHIRHelpers.createReference(consent.getCnsntPrvsnDtRfrncRfrnce() /** { "tree" :"Consent.provision.data.reference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["setProvision", "addActor", "addData"] , "methodName" : "setReference"} **/
						));
Consentobj.addProvision(HapiFHIRHelpers.createprovision(consent.getCnsntPrvsnPrvsnPrvsn() /** { "tree" :"Consent.provision.provision", "datatype" : "provision", "cardinality" : "Many", "elementtree" : ["setProvision", "addActor", "addData"] , "methodName" : "addProvision"} **/
		));
	}
}
