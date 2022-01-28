package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Evidence.
 * @see .Evidence
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class EvidenceConversion 
{
	public Patient Evidences(main.templateoutput.Model.Evidence evidence) 
	{
			Patient  Evidenceobj = new Patient(); 

						Evidenceobj.setUrl(HapiFHIRHelpers.createuri(evidence.getEvidenceUrlUri() /** { "tree" :"Evidence.url", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Evidenceobj.addIdentifier(HapiFHIRHelpers.createIdentifier(evidence.getEvidenceIdentifierIdentifierUse() /** { "tree" :"Evidence.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, evidence.getEvdncDntfrDntfrTpCcCSstm() /** { "tree" :"Evidence.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, evidence.getEvdncDntfrDntfrTpCcCVrsn() /** { "tree" :"Evidence.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, evidence.getEvdncDntfrDntfrTpCcCCde() /** { "tree" :"Evidence.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, evidence.getEvdncDntfrDntfrTpCcCDsplay() /** { "tree" :"Evidence.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, evidence.getEvdncDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Evidence.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, evidence.getEvdncDntfrDntfrTpCcTxt() /** { "tree" :"Evidence.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, evidence.getEvdncDntfrDntfrPrdPrdStrt() /** { "tree" :"Evidence.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, evidence.getEvdncDntfrDntfrPrdPrdNd() /** { "tree" :"Evidence.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, evidence.getEvdncDntfrDntfrSsgnr() /** { "tree" :"Evidence.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, evidence.getEvdncDntfrDntfrVlue() /** { "tree" :"Evidence.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, evidence.getEvdncDntfrDntfrSstm() /** { "tree" :"Evidence.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Evidenceobj.setVersion(HapiFHIRHelpers.createstring(evidence.getEvidenceVersionString() /** { "tree" :"Evidence.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Evidenceobj.setName(HapiFHIRHelpers.createstring(evidence.getEvidenceNameString() /** { "tree" :"Evidence.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Evidenceobj.setTitle(HapiFHIRHelpers.createstring(evidence.getEvidenceTitleString() /** { "tree" :"Evidence.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Evidenceobj.setShortTitle(HapiFHIRHelpers.createstring(evidence.getEvidenceShortTitleString() /** { "tree" :"Evidence.shortTitle", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setShortTitle"} **/
						));
Evidenceobj.setSubtitle(HapiFHIRHelpers.createstring(evidence.getEvidenceSubtitleString() /** { "tree" :"Evidence.subtitle", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubtitle"} **/
						));
Evidenceobj.setStatus(HapiFHIRHelpers.createcode(evidence.getEvidenceStatusCode() /** { "tree" :"Evidence.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Evidenceobj.setDate(HapiFHIRHelpers.createdateTime(evidence.getEvidenceDateDateTime() /** { "tree" :"Evidence.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Evidenceobj.setPublisher(HapiFHIRHelpers.createstring(evidence.getEvidencePublisherString() /** { "tree" :"Evidence.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Evidenceobj.addContact(HapiFHIRHelpers.createContactDetail(evidence.getEvdncCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"Evidence.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, evidence.getEvdncCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"Evidence.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, evidence.getEvdncCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"Evidence.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, evidence.getEvdncCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"Evidence.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, evidence.getEvdncCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"Evidence.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, evidence.getEvdncCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"Evidence.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, evidence.getEvdncCntctCntctDtlNme() /** { "tree" :"Evidence.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Evidenceobj.setDescription(HapiFHIRHelpers.createmarkdown(evidence.getEvidenceDescriptionMarkdown() /** { "tree" :"Evidence.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Evidenceobj.addNote(HapiFHIRHelpers.createAnnotation(evidence.getEvidenceNoteAnnotationTime() /** { "tree" :"Evidence.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, evidence.getEvidenceNoteAnnotationText() /** { "tree" :"Evidence.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, evidence.getEvdncNtNnttnThrRfrnce() /** { "tree" :"Evidence.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, evidence.getEvdncNtNnttnThrStrng() /** { "tree" :"Evidence.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Evidenceobj.addUseContext(HapiFHIRHelpers.createUsageContext(evidence.getEvdncSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"Evidence.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, evidence.getEvdncSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"Evidence.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, evidence.getEvdncSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"Evidence.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, evidence.getEvdncSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"Evidence.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, evidence.getEvdncSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"Evidence.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, evidence.getEvdncSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"Evidence.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, evidence.getEvdncSCntxtSgCntxtCdCSstm() /** { "tree" :"Evidence.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, evidence.getEvdncSCntxtSgCntxtCdCVrsn() /** { "tree" :"Evidence.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, evidence.getEvdncSCntxtSgCntxtCdCCde() /** { "tree" :"Evidence.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, evidence.getEvdncSCntxtSgCntxtCdCDsplay() /** { "tree" :"Evidence.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, evidence.getEvdncSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"Evidence.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, evidence.getEvdncSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"Evidence.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, evidence.getEvdncSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"Evidence.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, evidence.getEvdncSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"Evidence.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, evidence.getEvdncSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"Evidence.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, evidence.getEvdncSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"Evidence.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, evidence.getEvdncSCntxtSgCntxtVlRngRngLw() /** { "tree" :"Evidence.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, evidence.getEvdncSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"Evidence.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, evidence.getEvdncSCntxtSgCntxtVlRfrnce() /** { "tree" :"Evidence.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Evidenceobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(evidence.getEvdncJrsdctnCcCdngCSstm() /** { "tree" :"Evidence.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, evidence.getEvdncJrsdctnCcCdngCVrsn() /** { "tree" :"Evidence.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, evidence.getEvdncJrsdctnCcCdngCCde() /** { "tree" :"Evidence.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, evidence.getEvdncJrsdctnCcCdngCDsplay() /** { "tree" :"Evidence.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, evidence.getEvdncJrsdctnCcCdngCSrSlctd() /** { "tree" :"Evidence.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, evidence.getEvidenceJurisdictionCcText() /** { "tree" :"Evidence.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Evidenceobj.setCopyright(HapiFHIRHelpers.createmarkdown(evidence.getEvidenceCopyrightMarkdown() /** { "tree" :"Evidence.copyright", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCopyright"} **/
						));
Evidenceobj.setApprovalDate(HapiFHIRHelpers.createdate(evidence.getEvidenceApprovalDateDate() /** { "tree" :"Evidence.approvalDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setApprovalDate"} **/
						));
Evidenceobj.setLastReviewDate(HapiFHIRHelpers.createdate(evidence.getEvidenceLastReviewDateDate() /** { "tree" :"Evidence.lastReviewDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLastReviewDate"} **/
						));
Evidenceobj.setEffectivePeriod(HapiFHIRHelpers.createPeriod(evidence.getEvdncFfctvPrdPrdStrt() /** { "tree" :"Evidence.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setStart"} **/
						, evidence.getEvdncFfctvPrdPrdNd() /** { "tree" :"Evidence.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setEnd"} **/
						));
Evidenceobj.addTopic(HapiFHIRHelpers.createCodeableConcept(evidence.getEvidenceTopicCcCodingCSystem() /** { "tree" :"Evidence.topic", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setSystem"} **/
						, evidence.getEvidenceTopicCcCodingCVersion() /** { "tree" :"Evidence.topic", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setVersion"} **/
						, evidence.getEvidenceTopicCcCodingCCode() /** { "tree" :"Evidence.topic", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setCode"} **/
						, evidence.getEvidenceTopicCcCodingCDisplay() /** { "tree" :"Evidence.topic", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setDisplay"} **/
						, evidence.getEvdncTpcCcCdngCSrSlctd() /** { "tree" :"Evidence.topic", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setUserSelected"} **/
						, evidence.getEvidenceTopicCcText() /** { "tree" :"Evidence.topic", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, setText"} **/
						));
Evidenceobj.addAuthor(HapiFHIRHelpers.createContactDetail(evidence.getEvdncThrCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"Evidence.author", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setPeriod, setStart"} **/
						, evidence.getEvdncThrCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"Evidence.author", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setPeriod, setEnd"} **/
						, evidence.getEvdncThrCntctDtlTlcmCntctPntSstm() /** { "tree" :"Evidence.author", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setSystem"} **/
						, evidence.getEvdncThrCntctDtlTlcmCntctPntVlue() /** { "tree" :"Evidence.author", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setValue"} **/
						, evidence.getEvdncThrCntctDtlTlcmCntctPntSe() /** { "tree" :"Evidence.author", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setUse"} **/
						, evidence.getEvdncThrCntctDtlTlcmCntctPntRnk() /** { "tree" :"Evidence.author", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setRank"} **/
						, evidence.getEvidenceAuthorContactDetailName() /** { "tree" :"Evidence.author", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, addName"} **/
						));
Evidenceobj.addEditor(HapiFHIRHelpers.createContactDetail(evidence.getEvdncDtrCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"Evidence.editor", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setPeriod, setStart"} **/
						, evidence.getEvdncDtrCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"Evidence.editor", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setPeriod, setEnd"} **/
						, evidence.getEvdncDtrCntctDtlTlcmCntctPntSstm() /** { "tree" :"Evidence.editor", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setSystem"} **/
						, evidence.getEvdncDtrCntctDtlTlcmCntctPntVlue() /** { "tree" :"Evidence.editor", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setValue"} **/
						, evidence.getEvdncDtrCntctDtlTlcmCntctPntSe() /** { "tree" :"Evidence.editor", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setUse"} **/
						, evidence.getEvdncDtrCntctDtlTlcmCntctPntRnk() /** { "tree" :"Evidence.editor", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setRank"} **/
						, evidence.getEvidenceEditorContactDetailName() /** { "tree" :"Evidence.editor", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, addName"} **/
						));
Evidenceobj.addReviewer(HapiFHIRHelpers.createContactDetail(evidence.getEvdncRvwrCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"Evidence.reviewer", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setPeriod, setStart"} **/
						, evidence.getEvdncRvwrCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"Evidence.reviewer", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setPeriod, setEnd"} **/
						, evidence.getEvdncRvwrCntctDtlTlcmCntctPntSstm() /** { "tree" :"Evidence.reviewer", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setSystem"} **/
						, evidence.getEvdncRvwrCntctDtlTlcmCntctPntVlue() /** { "tree" :"Evidence.reviewer", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setValue"} **/
						, evidence.getEvdncRvwrCntctDtlTlcmCntctPntSe() /** { "tree" :"Evidence.reviewer", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setUse"} **/
						, evidence.getEvdncRvwrCntctDtlTlcmCntctPntRnk() /** { "tree" :"Evidence.reviewer", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setRank"} **/
						, evidence.getEvdncRvwrCntctDtlNme() /** { "tree" :"Evidence.reviewer", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, addName"} **/
						));
Evidenceobj.addEndorser(HapiFHIRHelpers.createContactDetail(evidence.getEvdncNdrsrCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"Evidence.endorser", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setPeriod, setStart"} **/
						, evidence.getEvdncNdrsrCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"Evidence.endorser", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setPeriod, setEnd"} **/
						, evidence.getEvdncNdrsrCntctDtlTlcmCntctPntSstm() /** { "tree" :"Evidence.endorser", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setSystem"} **/
						, evidence.getEvdncNdrsrCntctDtlTlcmCntctPntVlue() /** { "tree" :"Evidence.endorser", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setValue"} **/
						, evidence.getEvdncNdrsrCntctDtlTlcmCntctPntSe() /** { "tree" :"Evidence.endorser", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setUse"} **/
						, evidence.getEvdncNdrsrCntctDtlTlcmCntctPntRnk() /** { "tree" :"Evidence.endorser", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setRank"} **/
						, evidence.getEvdncNdrsrCntctDtlNme() /** { "tree" :"Evidence.endorser", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, addName"} **/
						));
Evidenceobj.addRelatedArtifact(HapiFHIRHelpers.createRelatedArtifact(evidence.getEvdncRltdrtfctRltdrtfctDcmntTtchmntCntntTpe() /** { "tree" :"Evidence.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setContentType"} **/
						, evidence.getEvdncRltdrtfctRltdrtfctDcmntTtchmntLngge() /** { "tree" :"Evidence.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setLanguage"} **/
						, evidence.getEvdncRltdrtfctRltdrtfctDcmntTtchmntDta() /** { "tree" :"Evidence.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setData"} **/
						, evidence.getEvdncRltdrtfctRltdrtfctDcmntTtchmntRl() /** { "tree" :"Evidence.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, url", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setUrl"} **/
						, evidence.getEvdncRltdrtfctRltdrtfctDcmntTtchmntSze() /** { "tree" :"Evidence.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, unsignedInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setSize"} **/
						, evidence.getEvdncRltdrtfctRltdrtfctDcmntTtchmntHsh() /** { "tree" :"Evidence.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setHash"} **/
						, evidence.getEvdncRltdrtfctRltdrtfctDcmntTtchmntTtle() /** { "tree" :"Evidence.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setTitle"} **/
						, evidence.getEvdncRltdrtfctRltdrtfctDcmntTtchmntCrtn() /** { "tree" :"Evidence.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setCreation"} **/
						, evidence.getEvdncRltdrtfctRltdrtfctRsrce() /** { "tree" :"Evidence.relatedArtifact", "datatype" : "RelatedArtifact, canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setResource"} **/
						, evidence.getEvdncRltdrtfctRltdrtfctTpe() /** { "tree" :"Evidence.relatedArtifact", "datatype" : "RelatedArtifact, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setType"} **/
						, evidence.getEvdncRltdrtfctRltdrtfctCttn() /** { "tree" :"Evidence.relatedArtifact", "datatype" : "RelatedArtifact, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setCitation"} **/
						, evidence.getEvdncRltdrtfctRltdrtfctLbl() /** { "tree" :"Evidence.relatedArtifact", "datatype" : "RelatedArtifact, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setLabel"} **/
						, evidence.getEvdncRltdrtfctRltdrtfctDsplay() /** { "tree" :"Evidence.relatedArtifact", "datatype" : "RelatedArtifact, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDisplay"} **/
						, evidence.getEvdncRltdrtfctRltdrtfctRl() /** { "tree" :"Evidence.relatedArtifact", "datatype" : "RelatedArtifact, url", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setUrl"} **/
						));
Evidenceobj.setExposureBackground(HapiFHIRHelpers.createReference(evidence.getEvdncXpsrBckgrndRfrnce() /** { "tree" :"Evidence.exposureBackground", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setExposureBackground"} **/
						));
Evidenceobj.addExposureVariant(HapiFHIRHelpers.createReference(evidence.getEvidenceExposureVariantReference() /** { "tree" :"Evidence.exposureVariant", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addExposureVariant"} **/
						));
Evidenceobj.addOutcome(HapiFHIRHelpers.createReference(evidence.getEvidenceOutcomeReference() /** { "tree" :"Evidence.outcome", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOutcome"} **/
		));
	}
}
