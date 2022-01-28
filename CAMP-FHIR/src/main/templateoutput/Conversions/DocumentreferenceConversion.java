package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Documentreference.
 * @see .Documentreference
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class DocumentreferenceConversion 
{
	public Patient Documentreferences(main.templateoutput.Model.Documentreference documentreference) 
	{
			Patient  Documentreferenceobj = new Patient(); 

						Documentreferenceobj.setMasterIdentifier(HapiFHIRHelpers.createIdentifier(documentreference.getDcmntRfrncMstrdntfrDntfrSe() /** { "tree" :"DocumentReference.masterIdentifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setUse"} **/
						, documentreference.getDcmntRfrncMstrdntfrDntfrTpCcCSstm() /** { "tree" :"DocumentReference.masterIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setType, addCoding, setSystem"} **/
						, documentreference.getDcmntRfrncMstrdntfrDntfrTpCcCVrsn() /** { "tree" :"DocumentReference.masterIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setType, addCoding, setVersion"} **/
						, documentreference.getDcmntRfrncMstrdntfrDntfrTpCcCCde() /** { "tree" :"DocumentReference.masterIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setType, addCoding, setCode"} **/
						, documentreference.getDcmntRfrncMstrdntfrDntfrTpCcCDsplay() /** { "tree" :"DocumentReference.masterIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setType, addCoding, setDisplay"} **/
						, documentreference.getDcmntRfrncMstrdntfrDntfrTpCcCSrSlctd() /** { "tree" :"DocumentReference.masterIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setType, addCoding, setUserSelected"} **/
						, documentreference.getDcmntRfrncMstrdntfrDntfrTpCcTxt() /** { "tree" :"DocumentReference.masterIdentifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setType, setText"} **/
						, documentreference.getDcmntRfrncMstrdntfrDntfrPrdPrdStrt() /** { "tree" :"DocumentReference.masterIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setPeriod, setStart"} **/
						, documentreference.getDcmntRfrncMstrdntfrDntfrPrdPrdNd() /** { "tree" :"DocumentReference.masterIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setPeriod, setEnd"} **/
						, documentreference.getDcmntRfrncMstrdntfrDntfrSsgnr() /** { "tree" :"DocumentReference.masterIdentifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setAssigner"} **/
						, documentreference.getDcmntRfrncMstrdntfrDntfrVlue() /** { "tree" :"DocumentReference.masterIdentifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setValue"} **/
						, documentreference.getDcmntRfrncMstrdntfrDntfrSstm() /** { "tree" :"DocumentReference.masterIdentifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setSystem"} **/
						));
Documentreferenceobj.addIdentifier(HapiFHIRHelpers.createIdentifier(documentreference.getDcmntRfrncDntfrDntfrSe() /** { "tree" :"DocumentReference.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, documentreference.getDcmntRfrncDntfrDntfrTpCcCSstm() /** { "tree" :"DocumentReference.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, documentreference.getDcmntRfrncDntfrDntfrTpCcCVrsn() /** { "tree" :"DocumentReference.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, documentreference.getDcmntRfrncDntfrDntfrTpCcCCde() /** { "tree" :"DocumentReference.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, documentreference.getDcmntRfrncDntfrDntfrTpCcCDsplay() /** { "tree" :"DocumentReference.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, documentreference.getDcmntRfrncDntfrDntfrTpCcCSrSlctd() /** { "tree" :"DocumentReference.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, documentreference.getDcmntRfrncDntfrDntfrTpCcTxt() /** { "tree" :"DocumentReference.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, documentreference.getDcmntRfrncDntfrDntfrPrdPrdStrt() /** { "tree" :"DocumentReference.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, documentreference.getDcmntRfrncDntfrDntfrPrdPrdNd() /** { "tree" :"DocumentReference.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, documentreference.getDcmntRfrncDntfrDntfrSsgnr() /** { "tree" :"DocumentReference.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, documentreference.getDcmntRfrncDntfrDntfrVlue() /** { "tree" :"DocumentReference.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, documentreference.getDcmntRfrncDntfrDntfrSstm() /** { "tree" :"DocumentReference.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Documentreferenceobj.setStatus(HapiFHIRHelpers.createcode(documentreference.getDocumentReferenceStatusCode() /** { "tree" :"DocumentReference.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Documentreferenceobj.setDocStatus(HapiFHIRHelpers.createcode(documentreference.getDocumentReferenceDocStatusCode() /** { "tree" :"DocumentReference.docStatus", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDocStatus"} **/
						));
Documentreferenceobj.setType(HapiFHIRHelpers.createCodeableConcept(documentreference.getDcmntRfrncTpCcCdngCSstm() /** { "tree" :"DocumentReference.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setSystem"} **/
						, documentreference.getDcmntRfrncTpCcCdngCVrsn() /** { "tree" :"DocumentReference.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setVersion"} **/
						, documentreference.getDcmntRfrncTpCcCdngCCde() /** { "tree" :"DocumentReference.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setCode"} **/
						, documentreference.getDcmntRfrncTpCcCdngCDsplay() /** { "tree" :"DocumentReference.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setDisplay"} **/
						, documentreference.getDcmntRfrncTpCcCdngCSrSlctd() /** { "tree" :"DocumentReference.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, documentreference.getDocumentReferenceTypeCcText() /** { "tree" :"DocumentReference.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, setText"} **/
						));
Documentreferenceobj.addCategory(HapiFHIRHelpers.createCodeableConcept(documentreference.getDcmntRfrncCtgrCcCdngCSstm() /** { "tree" :"DocumentReference.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setSystem"} **/
						, documentreference.getDcmntRfrncCtgrCcCdngCVrsn() /** { "tree" :"DocumentReference.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setVersion"} **/
						, documentreference.getDcmntRfrncCtgrCcCdngCCde() /** { "tree" :"DocumentReference.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setCode"} **/
						, documentreference.getDcmntRfrncCtgrCcCdngCDsplay() /** { "tree" :"DocumentReference.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setDisplay"} **/
						, documentreference.getDcmntRfrncCtgrCcCdngCSrSlctd() /** { "tree" :"DocumentReference.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setUserSelected"} **/
						, documentreference.getDocumentReferenceCategoryCcText() /** { "tree" :"DocumentReference.category", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, setText"} **/
						));
Documentreferenceobj.setSubject(HapiFHIRHelpers.createReference(documentreference.getDcmntRfrncSbjctRfrnce() /** { "tree" :"DocumentReference.subject", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Documentreferenceobj.setDate(HapiFHIRHelpers.createinstant(documentreference.getDocumentReferenceDateInstant() /** { "tree" :"DocumentReference.date", "datatype" : "instant", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Documentreferenceobj.addAuthor(HapiFHIRHelpers.createReference(documentreference.getDocumentReferenceAuthorReference() /** { "tree" :"DocumentReference.author", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor"} **/
						));
Documentreferenceobj.setAuthenticator(HapiFHIRHelpers.createReference(documentreference.getDcmntRfrncThntctrRfrnce() /** { "tree" :"DocumentReference.authenticator", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAuthenticator"} **/
						));
Documentreferenceobj.setCustodian(HapiFHIRHelpers.createReference(documentreference.getDcmntRfrncCstdnRfrnce() /** { "tree" :"DocumentReference.custodian", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCustodian"} **/
						));
Documentreferenceobj.setCode(HapiFHIRHelpers.createcode(documentreference.getDcmntRfrncRltsTCdCde() /** { "tree" :"DocumentReference.relatesTo.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addRelatesTo"] , "methodName" : "setCode"} **/
						));
Documentreferenceobj.setTarget(HapiFHIRHelpers.createReference(documentreference.getDcmntRfrncRltsTTrgtRfrnce() /** { "tree" :"DocumentReference.relatesTo.target", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addRelatesTo"] , "methodName" : "setTarget"} **/
						));
Documentreferenceobj.setDescription(HapiFHIRHelpers.createstring(documentreference.getDcmntRfrncDscrptnStrng() /** { "tree" :"DocumentReference.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Documentreferenceobj.addSecurityLabel(HapiFHIRHelpers.createCodeableConcept(documentreference.getDcmntRfrncScrtLblCcCdngCSstm() /** { "tree" :"DocumentReference.securityLabel", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSecurityLabel, addCoding, setSystem"} **/
						, documentreference.getDcmntRfrncScrtLblCcCdngCVrsn() /** { "tree" :"DocumentReference.securityLabel", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSecurityLabel, addCoding, setVersion"} **/
						, documentreference.getDcmntRfrncScrtLblCcCdngCCde() /** { "tree" :"DocumentReference.securityLabel", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSecurityLabel, addCoding, setCode"} **/
						, documentreference.getDcmntRfrncScrtLblCcCdngCDsplay() /** { "tree" :"DocumentReference.securityLabel", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSecurityLabel, addCoding, setDisplay"} **/
						, documentreference.getDcmntRfrncScrtLblCcCdngCSrSlctd() /** { "tree" :"DocumentReference.securityLabel", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSecurityLabel, addCoding, setUserSelected"} **/
						, documentreference.getDcmntRfrncScrtLblCcTxt() /** { "tree" :"DocumentReference.securityLabel", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSecurityLabel, setText"} **/
						));
Documentreferenceobj.setAttachment(HapiFHIRHelpers.createAttachment(documentreference.getDcmntRfrncCntntTmntTtchmntDta() /** { "tree" :"DocumentReference.content.attachment", "datatype" : "Attachment, base64Binary", "cardinality" : "Required", "elementtree" : ["addContent"] , "methodName" : "setAttachment, setData"} **/
						, documentreference.getDcmntRfrncCntntTmntTtchmntHsh() /** { "tree" :"DocumentReference.content.attachment", "datatype" : "Attachment, base64Binary", "cardinality" : "Required", "elementtree" : ["addContent"] , "methodName" : "setAttachment, setHash"} **/
						, documentreference.getDcmntRfrncCntntTmntTtchmntCntntTpe() /** { "tree" :"DocumentReference.content.attachment", "datatype" : "Attachment, code", "cardinality" : "Required", "elementtree" : ["addContent"] , "methodName" : "setAttachment, setContentType"} **/
						, documentreference.getDcmntRfrncCntntTmntTtchmntLngge() /** { "tree" :"DocumentReference.content.attachment", "datatype" : "Attachment, code", "cardinality" : "Required", "elementtree" : ["addContent"] , "methodName" : "setAttachment, setLanguage"} **/
						, documentreference.getDcmntRfrncCntntTmntTtchmntCrtn() /** { "tree" :"DocumentReference.content.attachment", "datatype" : "Attachment, dateTime", "cardinality" : "Required", "elementtree" : ["addContent"] , "methodName" : "setAttachment, setCreation"} **/
						, documentreference.getDcmntRfrncCntntTmntTtchmntTtle() /** { "tree" :"DocumentReference.content.attachment", "datatype" : "Attachment, string", "cardinality" : "Required", "elementtree" : ["addContent"] , "methodName" : "setAttachment, setTitle"} **/
						, documentreference.getDcmntRfrncCntntTmntTtchmntSze() /** { "tree" :"DocumentReference.content.attachment", "datatype" : "Attachment, unsignedInt", "cardinality" : "Required", "elementtree" : ["addContent"] , "methodName" : "setAttachment, setSize"} **/
						, documentreference.getDcmntRfrncCntntTmntTtchmntRl() /** { "tree" :"DocumentReference.content.attachment", "datatype" : "Attachment, url", "cardinality" : "Required", "elementtree" : ["addContent"] , "methodName" : "setAttachment, setUrl"} **/
						));
Documentreferenceobj.setFormat(HapiFHIRHelpers.createCoding(documentreference.getDcmntRfrncCntntFrmtCSrSlctd() /** { "tree" :"DocumentReference.content.format", "datatype" : "Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addContent"] , "methodName" : "setFormat, setUserSelected"} **/
						, documentreference.getDcmntRfrncCntntFrmtCCde() /** { "tree" :"DocumentReference.content.format", "datatype" : "Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addContent"] , "methodName" : "setFormat, setCode"} **/
						, documentreference.getDcmntRfrncCntntFrmtCVrsn() /** { "tree" :"DocumentReference.content.format", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addContent"] , "methodName" : "setFormat, setVersion"} **/
						, documentreference.getDcmntRfrncCntntFrmtCDsplay() /** { "tree" :"DocumentReference.content.format", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addContent"] , "methodName" : "setFormat, setDisplay"} **/
						, documentreference.getDcmntRfrncCntntFrmtCSstm() /** { "tree" :"DocumentReference.content.format", "datatype" : "Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addContent"] , "methodName" : "setFormat, setSystem"} **/
						));
Documentreferenceobj.addEncounter(HapiFHIRHelpers.createReference(documentreference.getDcmntRfrncCntxtNcntrRfrnce() /** { "tree" :"DocumentReference.context.encounter", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["setContext"] , "methodName" : "addEncounter"} **/
						));
Documentreferenceobj.addEvent(HapiFHIRHelpers.createCodeableConcept(documentreference.getDcmntRfrncCntxtVntCcCdngCSstm() /** { "tree" :"DocumentReference.context.event", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["setContext"] , "methodName" : "addEvent, addCoding, setSystem"} **/
						, documentreference.getDcmntRfrncCntxtVntCcCdngCVrsn() /** { "tree" :"DocumentReference.context.event", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setContext"] , "methodName" : "addEvent, addCoding, setVersion"} **/
						, documentreference.getDcmntRfrncCntxtVntCcCdngCCde() /** { "tree" :"DocumentReference.context.event", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["setContext"] , "methodName" : "addEvent, addCoding, setCode"} **/
						, documentreference.getDcmntRfrncCntxtVntCcCdngCDsplay() /** { "tree" :"DocumentReference.context.event", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setContext"] , "methodName" : "addEvent, addCoding, setDisplay"} **/
						, documentreference.getDcmntRfrncCntxtVntCcCdngCSrSlctd() /** { "tree" :"DocumentReference.context.event", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["setContext"] , "methodName" : "addEvent, addCoding, setUserSelected"} **/
						, documentreference.getDcmntRfrncCntxtVntCcTxt() /** { "tree" :"DocumentReference.context.event", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["setContext"] , "methodName" : "addEvent, setText"} **/
						));
Documentreferenceobj.setPeriod(HapiFHIRHelpers.createPeriod(documentreference.getDcmntRfrncCntxtPrdPrdStrt() /** { "tree" :"DocumentReference.context.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setContext"] , "methodName" : "setPeriod, setStart"} **/
						, documentreference.getDcmntRfrncCntxtPrdPrdNd() /** { "tree" :"DocumentReference.context.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setContext"] , "methodName" : "setPeriod, setEnd"} **/
						));
Documentreferenceobj.setFacilityType(HapiFHIRHelpers.createCodeableConcept(documentreference.getDcmntRfrncCntxtFcltTpCcCdngCSstm() /** { "tree" :"DocumentReference.context.facilityType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setContext"] , "methodName" : "setFacilityType, addCoding, setSystem"} **/
						, documentreference.getDcmntRfrncCntxtFcltTpCcCdngCVrsn() /** { "tree" :"DocumentReference.context.facilityType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setContext"] , "methodName" : "setFacilityType, addCoding, setVersion"} **/
						, documentreference.getDcmntRfrncCntxtFcltTpCcCdngCCde() /** { "tree" :"DocumentReference.context.facilityType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setContext"] , "methodName" : "setFacilityType, addCoding, setCode"} **/
						, documentreference.getDcmntRfrncCntxtFcltTpCcCdngCDsplay() /** { "tree" :"DocumentReference.context.facilityType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setContext"] , "methodName" : "setFacilityType, addCoding, setDisplay"} **/
						, documentreference.getDcmntRfrncCntxtFcltTpCcCdngCSrSlctd() /** { "tree" :"DocumentReference.context.facilityType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setContext"] , "methodName" : "setFacilityType, addCoding, setUserSelected"} **/
						, documentreference.getDcmntRfrncCntxtFcltTpCcTxt() /** { "tree" :"DocumentReference.context.facilityType", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setContext"] , "methodName" : "setFacilityType, setText"} **/
						));
Documentreferenceobj.setPracticeSetting(HapiFHIRHelpers.createCodeableConcept(documentreference.getDcmntRfrncCntxtPrctcSttngCcCdngCSstm() /** { "tree" :"DocumentReference.context.practiceSetting", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setContext"] , "methodName" : "setPracticeSetting, addCoding, setSystem"} **/
						, documentreference.getDcmntRfrncCntxtPrctcSttngCcCdngCVrsn() /** { "tree" :"DocumentReference.context.practiceSetting", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setContext"] , "methodName" : "setPracticeSetting, addCoding, setVersion"} **/
						, documentreference.getDcmntRfrncCntxtPrctcSttngCcCdngCCde() /** { "tree" :"DocumentReference.context.practiceSetting", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setContext"] , "methodName" : "setPracticeSetting, addCoding, setCode"} **/
						, documentreference.getDcmntRfrncCntxtPrctcSttngCcCdngCDsplay() /** { "tree" :"DocumentReference.context.practiceSetting", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setContext"] , "methodName" : "setPracticeSetting, addCoding, setDisplay"} **/
						, documentreference.getDcmntRfrncCntxtPrctcSttngCcCdngCSrSlctd() /** { "tree" :"DocumentReference.context.practiceSetting", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setContext"] , "methodName" : "setPracticeSetting, addCoding, setUserSelected"} **/
						, documentreference.getDcmntRfrncCntxtPrctcSttngCcTxt() /** { "tree" :"DocumentReference.context.practiceSetting", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setContext"] , "methodName" : "setPracticeSetting, setText"} **/
						));
Documentreferenceobj.setSourcePatientInfo(HapiFHIRHelpers.createReference(documentreference.getDcmntRfrncCntxtSrcPtntnfRfrnce() /** { "tree" :"DocumentReference.context.sourcePatientInfo", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["setContext"] , "methodName" : "setSourcePatientInfo"} **/
						));
Documentreferenceobj.addRelated(HapiFHIRHelpers.createReference(documentreference.getDcmntRfrncCntxtRltdRfrnce() /** { "tree" :"DocumentReference.context.related", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["setContext"] , "methodName" : "addRelated"} **/
		));
	}
}
