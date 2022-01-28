package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Measure.
 * @see .Measure
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class MeasureConversion 
{
	public Patient Measures(main.templateoutput.Model.Measure measure) 
	{
			Patient  Measureobj = new Patient(); 

						Measureobj.setUrl(HapiFHIRHelpers.createuri(measure.getMeasureUrlUri() /** { "tree" :"Measure.url", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Measureobj.addIdentifier(HapiFHIRHelpers.createIdentifier(measure.getMeasureIdentifierIdentifierUse() /** { "tree" :"Measure.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, measure.getMsrDntfrDntfrTpCcCSstm() /** { "tree" :"Measure.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, measure.getMsrDntfrDntfrTpCcCVrsn() /** { "tree" :"Measure.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, measure.getMsrDntfrDntfrTpCcCCde() /** { "tree" :"Measure.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, measure.getMsrDntfrDntfrTpCcCDsplay() /** { "tree" :"Measure.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, measure.getMsrDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Measure.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, measure.getMsrDntfrDntfrTpCcTxt() /** { "tree" :"Measure.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, measure.getMsrDntfrDntfrPrdPrdStrt() /** { "tree" :"Measure.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, measure.getMsrDntfrDntfrPrdPrdNd() /** { "tree" :"Measure.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, measure.getMsrDntfrDntfrSsgnr() /** { "tree" :"Measure.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, measure.getMsrDntfrDntfrVlue() /** { "tree" :"Measure.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, measure.getMsrDntfrDntfrSstm() /** { "tree" :"Measure.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Measureobj.setVersion(HapiFHIRHelpers.createstring(measure.getMeasureVersionString() /** { "tree" :"Measure.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Measureobj.setName(HapiFHIRHelpers.createstring(measure.getMeasureNameString() /** { "tree" :"Measure.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Measureobj.setTitle(HapiFHIRHelpers.createstring(measure.getMeasureTitleString() /** { "tree" :"Measure.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Measureobj.setSubtitle(HapiFHIRHelpers.createstring(measure.getMeasureSubtitleString() /** { "tree" :"Measure.subtitle", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubtitle"} **/
						));
Measureobj.setStatus(HapiFHIRHelpers.createcode(measure.getMeasureStatusCode() /** { "tree" :"Measure.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Measureobj.setExperimental(HapiFHIRHelpers.createboolean(measure.getMeasureExperimentalBoolean() /** { "tree" :"Measure.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Measureobj.setSubjectCodeableconcept(HapiFHIRHelpers.createCodeableConcept(measure.getMsrSbjctCdblcncptCcCdngCSstm() /** { "tree" :"Measure.subjectCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectCodeableconcept, addCoding, setSystem"} **/
						, measure.getMsrSbjctCdblcncptCcCdngCVrsn() /** { "tree" :"Measure.subjectCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectCodeableconcept, addCoding, setVersion"} **/
						, measure.getMsrSbjctCdblcncptCcCdngCCde() /** { "tree" :"Measure.subjectCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectCodeableconcept, addCoding, setCode"} **/
						, measure.getMsrSbjctCdblcncptCcCdngCDsplay() /** { "tree" :"Measure.subjectCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectCodeableconcept, addCoding, setDisplay"} **/
						, measure.getMsrSbjctCdblcncptCcCdngCSrSlctd() /** { "tree" :"Measure.subjectCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectCodeableconcept, addCoding, setUserSelected"} **/
						, measure.getMsrSbjctCdblcncptCcTxt() /** { "tree" :"Measure.subjectCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectCodeableconcept, setText"} **/
						));
Measureobj.setSubjectReference(group)(HapiFHIRHelpers.createReference(measure.getMeasureSubjectReferenceReference() /** { "tree" :"Measure.subjectReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectReference(group)"} **/
						));
Measureobj.setDate(HapiFHIRHelpers.createdateTime(measure.getMeasureDateDateTime() /** { "tree" :"Measure.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Measureobj.setPublisher(HapiFHIRHelpers.createstring(measure.getMeasurePublisherString() /** { "tree" :"Measure.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Measureobj.addContact(HapiFHIRHelpers.createContactDetail(measure.getMsrCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"Measure.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, measure.getMsrCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"Measure.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, measure.getMsrCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"Measure.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, measure.getMsrCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"Measure.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, measure.getMsrCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"Measure.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, measure.getMsrCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"Measure.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, measure.getMeasureContactContactDetailName() /** { "tree" :"Measure.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Measureobj.setDescription(HapiFHIRHelpers.createmarkdown(measure.getMeasureDescriptionMarkdown() /** { "tree" :"Measure.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Measureobj.addUseContext(HapiFHIRHelpers.createUsageContext(measure.getMsrSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"Measure.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, measure.getMsrSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"Measure.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, measure.getMsrSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"Measure.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, measure.getMsrSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"Measure.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, measure.getMsrSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"Measure.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, measure.getMsrSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"Measure.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, measure.getMsrSCntxtSgCntxtCdCSstm() /** { "tree" :"Measure.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, measure.getMsrSCntxtSgCntxtCdCVrsn() /** { "tree" :"Measure.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, measure.getMsrSCntxtSgCntxtCdCCde() /** { "tree" :"Measure.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, measure.getMsrSCntxtSgCntxtCdCDsplay() /** { "tree" :"Measure.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, measure.getMsrSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"Measure.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, measure.getMsrSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"Measure.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, measure.getMsrSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"Measure.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, measure.getMsrSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"Measure.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, measure.getMsrSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"Measure.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, measure.getMsrSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"Measure.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, measure.getMsrSCntxtSgCntxtVlRngRngLw() /** { "tree" :"Measure.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, measure.getMsrSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"Measure.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, measure.getMsrSCntxtSgCntxtVlRfrnce() /** { "tree" :"Measure.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Measureobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(measure.getMsrJrsdctnCcCdngCSstm() /** { "tree" :"Measure.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, measure.getMsrJrsdctnCcCdngCVrsn() /** { "tree" :"Measure.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, measure.getMsrJrsdctnCcCdngCCde() /** { "tree" :"Measure.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, measure.getMsrJrsdctnCcCdngCDsplay() /** { "tree" :"Measure.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, measure.getMsrJrsdctnCcCdngCSrSlctd() /** { "tree" :"Measure.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, measure.getMeasureJurisdictionCcText() /** { "tree" :"Measure.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Measureobj.setPurpose(HapiFHIRHelpers.createmarkdown(measure.getMeasurePurposeMarkdown() /** { "tree" :"Measure.purpose", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPurpose"} **/
						));
Measureobj.setUsage(HapiFHIRHelpers.createstring(measure.getMeasureUsageString() /** { "tree" :"Measure.usage", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUsage"} **/
						));
Measureobj.setCopyright(HapiFHIRHelpers.createmarkdown(measure.getMeasureCopyrightMarkdown() /** { "tree" :"Measure.copyright", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCopyright"} **/
						));
Measureobj.setApprovalDate(HapiFHIRHelpers.createdate(measure.getMeasureApprovalDateDate() /** { "tree" :"Measure.approvalDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setApprovalDate"} **/
						));
Measureobj.setLastReviewDate(HapiFHIRHelpers.createdate(measure.getMeasureLastReviewDateDate() /** { "tree" :"Measure.lastReviewDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLastReviewDate"} **/
						));
Measureobj.setEffectivePeriod(HapiFHIRHelpers.createPeriod(measure.getMsrFfctvPrdPrdStrt() /** { "tree" :"Measure.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setStart"} **/
						, measure.getMeasureEffectivePeriodPeriodEnd() /** { "tree" :"Measure.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setEnd"} **/
						));
Measureobj.addTopic(HapiFHIRHelpers.createCodeableConcept(measure.getMeasureTopicCcCodingCSystem() /** { "tree" :"Measure.topic", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setSystem"} **/
						, measure.getMeasureTopicCcCodingCVersion() /** { "tree" :"Measure.topic", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setVersion"} **/
						, measure.getMeasureTopicCcCodingCCode() /** { "tree" :"Measure.topic", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setCode"} **/
						, measure.getMeasureTopicCcCodingCDisplay() /** { "tree" :"Measure.topic", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setDisplay"} **/
						, measure.getMsrTpcCcCdngCSrSlctd() /** { "tree" :"Measure.topic", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setUserSelected"} **/
						, measure.getMeasureTopicCcText() /** { "tree" :"Measure.topic", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, setText"} **/
						));
Measureobj.addAuthor(HapiFHIRHelpers.createContactDetail(measure.getMsrThrCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"Measure.author", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setPeriod, setStart"} **/
						, measure.getMsrThrCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"Measure.author", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setPeriod, setEnd"} **/
						, measure.getMsrThrCntctDtlTlcmCntctPntSstm() /** { "tree" :"Measure.author", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setSystem"} **/
						, measure.getMsrThrCntctDtlTlcmCntctPntVlue() /** { "tree" :"Measure.author", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setValue"} **/
						, measure.getMsrThrCntctDtlTlcmCntctPntSe() /** { "tree" :"Measure.author", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setUse"} **/
						, measure.getMsrThrCntctDtlTlcmCntctPntRnk() /** { "tree" :"Measure.author", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setRank"} **/
						, measure.getMeasureAuthorContactDetailName() /** { "tree" :"Measure.author", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, addName"} **/
						));
Measureobj.addEditor(HapiFHIRHelpers.createContactDetail(measure.getMsrDtrCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"Measure.editor", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setPeriod, setStart"} **/
						, measure.getMsrDtrCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"Measure.editor", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setPeriod, setEnd"} **/
						, measure.getMsrDtrCntctDtlTlcmCntctPntSstm() /** { "tree" :"Measure.editor", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setSystem"} **/
						, measure.getMsrDtrCntctDtlTlcmCntctPntVlue() /** { "tree" :"Measure.editor", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setValue"} **/
						, measure.getMsrDtrCntctDtlTlcmCntctPntSe() /** { "tree" :"Measure.editor", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setUse"} **/
						, measure.getMsrDtrCntctDtlTlcmCntctPntRnk() /** { "tree" :"Measure.editor", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setRank"} **/
						, measure.getMeasureEditorContactDetailName() /** { "tree" :"Measure.editor", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, addName"} **/
						));
Measureobj.addReviewer(HapiFHIRHelpers.createContactDetail(measure.getMsrRvwrCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"Measure.reviewer", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setPeriod, setStart"} **/
						, measure.getMsrRvwrCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"Measure.reviewer", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setPeriod, setEnd"} **/
						, measure.getMsrRvwrCntctDtlTlcmCntctPntSstm() /** { "tree" :"Measure.reviewer", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setSystem"} **/
						, measure.getMsrRvwrCntctDtlTlcmCntctPntVlue() /** { "tree" :"Measure.reviewer", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setValue"} **/
						, measure.getMsrRvwrCntctDtlTlcmCntctPntSe() /** { "tree" :"Measure.reviewer", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setUse"} **/
						, measure.getMsrRvwrCntctDtlTlcmCntctPntRnk() /** { "tree" :"Measure.reviewer", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setRank"} **/
						, measure.getMsrRvwrCntctDtlNme() /** { "tree" :"Measure.reviewer", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, addName"} **/
						));
Measureobj.addEndorser(HapiFHIRHelpers.createContactDetail(measure.getMsrNdrsrCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"Measure.endorser", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setPeriod, setStart"} **/
						, measure.getMsrNdrsrCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"Measure.endorser", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setPeriod, setEnd"} **/
						, measure.getMsrNdrsrCntctDtlTlcmCntctPntSstm() /** { "tree" :"Measure.endorser", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setSystem"} **/
						, measure.getMsrNdrsrCntctDtlTlcmCntctPntVlue() /** { "tree" :"Measure.endorser", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setValue"} **/
						, measure.getMsrNdrsrCntctDtlTlcmCntctPntSe() /** { "tree" :"Measure.endorser", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setUse"} **/
						, measure.getMsrNdrsrCntctDtlTlcmCntctPntRnk() /** { "tree" :"Measure.endorser", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setRank"} **/
						, measure.getMsrNdrsrCntctDtlNme() /** { "tree" :"Measure.endorser", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, addName"} **/
						));
Measureobj.addRelatedArtifact(HapiFHIRHelpers.createRelatedArtifact(measure.getMsrRltdrtfctRltdrtfctDcmntTtchmntCntntTpe() /** { "tree" :"Measure.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setContentType"} **/
						, measure.getMsrRltdrtfctRltdrtfctDcmntTtchmntLngge() /** { "tree" :"Measure.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setLanguage"} **/
						, measure.getMsrRltdrtfctRltdrtfctDcmntTtchmntDta() /** { "tree" :"Measure.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setData"} **/
						, measure.getMsrRltdrtfctRltdrtfctDcmntTtchmntRl() /** { "tree" :"Measure.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, url", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setUrl"} **/
						, measure.getMsrRltdrtfctRltdrtfctDcmntTtchmntSze() /** { "tree" :"Measure.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, unsignedInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setSize"} **/
						, measure.getMsrRltdrtfctRltdrtfctDcmntTtchmntHsh() /** { "tree" :"Measure.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setHash"} **/
						, measure.getMsrRltdrtfctRltdrtfctDcmntTtchmntTtle() /** { "tree" :"Measure.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setTitle"} **/
						, measure.getMsrRltdrtfctRltdrtfctDcmntTtchmntCrtn() /** { "tree" :"Measure.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setCreation"} **/
						, measure.getMsrRltdrtfctRltdrtfctRsrce() /** { "tree" :"Measure.relatedArtifact", "datatype" : "RelatedArtifact, canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setResource"} **/
						, measure.getMsrRltdrtfctRltdrtfctTpe() /** { "tree" :"Measure.relatedArtifact", "datatype" : "RelatedArtifact, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setType"} **/
						, measure.getMsrRltdrtfctRltdrtfctCttn() /** { "tree" :"Measure.relatedArtifact", "datatype" : "RelatedArtifact, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setCitation"} **/
						, measure.getMsrRltdrtfctRltdrtfctLbl() /** { "tree" :"Measure.relatedArtifact", "datatype" : "RelatedArtifact, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setLabel"} **/
						, measure.getMsrRltdrtfctRltdrtfctDsplay() /** { "tree" :"Measure.relatedArtifact", "datatype" : "RelatedArtifact, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDisplay"} **/
						, measure.getMsrRltdrtfctRltdrtfctRl() /** { "tree" :"Measure.relatedArtifact", "datatype" : "RelatedArtifact, url", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setUrl"} **/
						));
Measureobj.addLibrary(HapiFHIRHelpers.createcanonical(measure.getMeasureLibraryCanonical() /** { "tree" :"Measure.library", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLibrary"} **/
						));
Measureobj.setDisclaimer(HapiFHIRHelpers.createmarkdown(measure.getMeasureDisclaimerMarkdown() /** { "tree" :"Measure.disclaimer", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDisclaimer"} **/
						));
Measureobj.setScoring(HapiFHIRHelpers.createCodeableConcept(measure.getMeasureScoringCcCodingCSystem() /** { "tree" :"Measure.scoring", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setScoring, addCoding, setSystem"} **/
						, measure.getMsrScrngCcCdngCVrsn() /** { "tree" :"Measure.scoring", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setScoring, addCoding, setVersion"} **/
						, measure.getMeasureScoringCcCodingCCode() /** { "tree" :"Measure.scoring", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setScoring, addCoding, setCode"} **/
						, measure.getMsrScrngCcCdngCDsplay() /** { "tree" :"Measure.scoring", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setScoring, addCoding, setDisplay"} **/
						, measure.getMsrScrngCcCdngCSrSlctd() /** { "tree" :"Measure.scoring", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setScoring, addCoding, setUserSelected"} **/
						, measure.getMeasureScoringCcText() /** { "tree" :"Measure.scoring", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setScoring, setText"} **/
						));
Measureobj.setCompositeScoring(HapiFHIRHelpers.createCodeableConcept(measure.getMsrCmpstScrngCcCdngCSstm() /** { "tree" :"Measure.compositeScoring", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCompositeScoring, addCoding, setSystem"} **/
						, measure.getMsrCmpstScrngCcCdngCVrsn() /** { "tree" :"Measure.compositeScoring", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCompositeScoring, addCoding, setVersion"} **/
						, measure.getMsrCmpstScrngCcCdngCCde() /** { "tree" :"Measure.compositeScoring", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCompositeScoring, addCoding, setCode"} **/
						, measure.getMsrCmpstScrngCcCdngCDsplay() /** { "tree" :"Measure.compositeScoring", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCompositeScoring, addCoding, setDisplay"} **/
						, measure.getMsrCmpstScrngCcCdngCSrSlctd() /** { "tree" :"Measure.compositeScoring", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCompositeScoring, addCoding, setUserSelected"} **/
						, measure.getMeasureCompositeScoringCcText() /** { "tree" :"Measure.compositeScoring", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCompositeScoring, setText"} **/
						));
Measureobj.addType(HapiFHIRHelpers.createCodeableConcept(measure.getMeasureTypeCcCodingCSystem() /** { "tree" :"Measure.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setSystem"} **/
						, measure.getMeasureTypeCcCodingCVersion() /** { "tree" :"Measure.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setVersion"} **/
						, measure.getMeasureTypeCcCodingCCode() /** { "tree" :"Measure.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setCode"} **/
						, measure.getMeasureTypeCcCodingCDisplay() /** { "tree" :"Measure.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setDisplay"} **/
						, measure.getMsrTpCcCdngCSrSlctd() /** { "tree" :"Measure.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, addCoding, setUserSelected"} **/
						, measure.getMeasureTypeCcText() /** { "tree" :"Measure.type", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addType, setText"} **/
						));
Measureobj.setRiskAdjustment(HapiFHIRHelpers.createstring(measure.getMeasureRiskAdjustmentString() /** { "tree" :"Measure.riskAdjustment", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRiskAdjustment"} **/
						));
Measureobj.setRateAggregation(HapiFHIRHelpers.createstring(measure.getMeasureRateAggregationString() /** { "tree" :"Measure.rateAggregation", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRateAggregation"} **/
						));
Measureobj.setRationale(HapiFHIRHelpers.createmarkdown(measure.getMeasureRationaleMarkdown() /** { "tree" :"Measure.rationale", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRationale"} **/
						));
Measureobj.setClinicalRecommendationStatement(HapiFHIRHelpers.createmarkdown(measure.getMsrClnclRcmmndtnSttmntMrkdwn() /** { "tree" :"Measure.clinicalRecommendationStatement", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setClinicalRecommendationStatement"} **/
						));
Measureobj.setImprovementNotation(HapiFHIRHelpers.createCodeableConcept(measure.getMsrMprvmntNttnCcCdngCSstm() /** { "tree" :"Measure.improvementNotation", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setImprovementNotation, addCoding, setSystem"} **/
						, measure.getMsrMprvmntNttnCcCdngCVrsn() /** { "tree" :"Measure.improvementNotation", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setImprovementNotation, addCoding, setVersion"} **/
						, measure.getMsrMprvmntNttnCcCdngCCde() /** { "tree" :"Measure.improvementNotation", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setImprovementNotation, addCoding, setCode"} **/
						, measure.getMsrMprvmntNttnCcCdngCDsplay() /** { "tree" :"Measure.improvementNotation", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setImprovementNotation, addCoding, setDisplay"} **/
						, measure.getMsrMprvmntNttnCcCdngCSrSlctd() /** { "tree" :"Measure.improvementNotation", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setImprovementNotation, addCoding, setUserSelected"} **/
						, measure.getMsrMprvmntNttnCcTxt() /** { "tree" :"Measure.improvementNotation", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setImprovementNotation, setText"} **/
						));
Measureobj.addDefinition(HapiFHIRHelpers.createmarkdown(measure.getMeasureDefinitionMarkdown() /** { "tree" :"Measure.definition", "datatype" : "markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDefinition"} **/
						));
Measureobj.setGuidance(HapiFHIRHelpers.createmarkdown(measure.getMeasureGuidanceMarkdown() /** { "tree" :"Measure.guidance", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGuidance"} **/
						));
Measureobj.setCode(HapiFHIRHelpers.createCodeableConcept(measure.getMsrGrpCdCcCdngCSstm() /** { "tree" :"Measure.group.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addGroup"] , "methodName" : "setCode, addCoding, setSystem"} **/
						, measure.getMsrGrpCdCcCdngCVrsn() /** { "tree" :"Measure.group.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup"] , "methodName" : "setCode, addCoding, setVersion"} **/
						, measure.getMsrGrpCdCcCdngCCde() /** { "tree" :"Measure.group.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addGroup"] , "methodName" : "setCode, addCoding, setCode"} **/
						, measure.getMsrGrpCdCcCdngCDsplay() /** { "tree" :"Measure.group.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup"] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, measure.getMsrGrpCdCcCdngCSrSlctd() /** { "tree" :"Measure.group.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addGroup"] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, measure.getMeasureGroupCodeCcText() /** { "tree" :"Measure.group.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup"] , "methodName" : "setCode, setText"} **/
						));
Measureobj.setDescription(HapiFHIRHelpers.createstring(measure.getMeasureGroupDescriptionString() /** { "tree" :"Measure.group.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup"] , "methodName" : "setDescription"} **/
						));
Measureobj.setCode(HapiFHIRHelpers.createCodeableConcept(measure.getMsrGrpPpltnCdCcCdngCSstm() /** { "tree" :"Measure.group.population.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation"] , "methodName" : "setCode, addCoding, setSystem"} **/
						, measure.getMsrGrpPpltnCdCcCdngCVrsn() /** { "tree" :"Measure.group.population.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation"] , "methodName" : "setCode, addCoding, setVersion"} **/
						, measure.getMsrGrpPpltnCdCcCdngCCde() /** { "tree" :"Measure.group.population.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation"] , "methodName" : "setCode, addCoding, setCode"} **/
						, measure.getMsrGrpPpltnCdCcCdngCDsplay() /** { "tree" :"Measure.group.population.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation"] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, measure.getMsrGrpPpltnCdCcCdngCSrSlctd() /** { "tree" :"Measure.group.population.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation"] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, measure.getMsrGrpPpltnCdCcTxt() /** { "tree" :"Measure.group.population.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation"] , "methodName" : "setCode, setText"} **/
						));
Measureobj.setDescription(HapiFHIRHelpers.createstring(measure.getMsrGrpPpltnDscrptnStrng() /** { "tree" :"Measure.group.population.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation"] , "methodName" : "setDescription"} **/
						));
Measureobj.setCriteria(HapiFHIRHelpers.createExpression(measure.getMsrGrpPpltnCrtrXprssnLngge() /** { "tree" :"Measure.group.population.criteria", "datatype" : "Expression, code", "cardinality" : "Required", "elementtree" : ["addGroup", "addPopulation"] , "methodName" : "setCriteria, setLanguage"} **/
						, measure.getMsrGrpPpltnCrtrXprssnNme() /** { "tree" :"Measure.group.population.criteria", "datatype" : "Expression, id", "cardinality" : "Required", "elementtree" : ["addGroup", "addPopulation"] , "methodName" : "setCriteria, setName"} **/
						, measure.getMsrGrpPpltnCrtrXprssnDscrptn() /** { "tree" :"Measure.group.population.criteria", "datatype" : "Expression, string", "cardinality" : "Required", "elementtree" : ["addGroup", "addPopulation"] , "methodName" : "setCriteria, setDescription"} **/
						, measure.getMsrGrpPpltnCrtrXprssnXprssn() /** { "tree" :"Measure.group.population.criteria", "datatype" : "Expression, string", "cardinality" : "Required", "elementtree" : ["addGroup", "addPopulation"] , "methodName" : "setCriteria, setExpression"} **/
						, measure.getMsrGrpPpltnCrtrXprssnRfrnce() /** { "tree" :"Measure.group.population.criteria", "datatype" : "Expression, uri", "cardinality" : "Required", "elementtree" : ["addGroup", "addPopulation"] , "methodName" : "setCriteria, setReference"} **/
						));
Measureobj.setCode(HapiFHIRHelpers.createCodeableConcept(measure.getMsrGrpStrtfrCdCcCdngCSstm() /** { "tree" :"Measure.group.stratifier.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation", "addStratifier"] , "methodName" : "setCode, addCoding, setSystem"} **/
						, measure.getMsrGrpStrtfrCdCcCdngCVrsn() /** { "tree" :"Measure.group.stratifier.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation", "addStratifier"] , "methodName" : "setCode, addCoding, setVersion"} **/
						, measure.getMsrGrpStrtfrCdCcCdngCCde() /** { "tree" :"Measure.group.stratifier.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation", "addStratifier"] , "methodName" : "setCode, addCoding, setCode"} **/
						, measure.getMsrGrpStrtfrCdCcCdngCDsplay() /** { "tree" :"Measure.group.stratifier.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation", "addStratifier"] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, measure.getMsrGrpStrtfrCdCcCdngCSrSlctd() /** { "tree" :"Measure.group.stratifier.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation", "addStratifier"] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, measure.getMsrGrpStrtfrCdCcTxt() /** { "tree" :"Measure.group.stratifier.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation", "addStratifier"] , "methodName" : "setCode, setText"} **/
						));
Measureobj.setDescription(HapiFHIRHelpers.createstring(measure.getMsrGrpStrtfrDscrptnStrng() /** { "tree" :"Measure.group.stratifier.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation", "addStratifier"] , "methodName" : "setDescription"} **/
						));
Measureobj.setCriteria(HapiFHIRHelpers.createExpression(measure.getMsrGrpStrtfrCrtrXprssnLngge() /** { "tree" :"Measure.group.stratifier.criteria", "datatype" : "Expression, code", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation", "addStratifier"] , "methodName" : "setCriteria, setLanguage"} **/
						, measure.getMsrGrpStrtfrCrtrXprssnNme() /** { "tree" :"Measure.group.stratifier.criteria", "datatype" : "Expression, id", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation", "addStratifier"] , "methodName" : "setCriteria, setName"} **/
						, measure.getMsrGrpStrtfrCrtrXprssnDscrptn() /** { "tree" :"Measure.group.stratifier.criteria", "datatype" : "Expression, string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation", "addStratifier"] , "methodName" : "setCriteria, setDescription"} **/
						, measure.getMsrGrpStrtfrCrtrXprssnXprssn() /** { "tree" :"Measure.group.stratifier.criteria", "datatype" : "Expression, string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation", "addStratifier"] , "methodName" : "setCriteria, setExpression"} **/
						, measure.getMsrGrpStrtfrCrtrXprssnRfrnce() /** { "tree" :"Measure.group.stratifier.criteria", "datatype" : "Expression, uri", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation", "addStratifier"] , "methodName" : "setCriteria, setReference"} **/
						));
Measureobj.setCode(HapiFHIRHelpers.createCodeableConcept(measure.getMsrGrpStrtfrCmpnntCdCcCdngCSstm() /** { "tree" :"Measure.group.stratifier.component.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation", "addStratifier", "addComponent"] , "methodName" : "setCode, addCoding, setSystem"} **/
						, measure.getMsrGrpStrtfrCmpnntCdCcCdngCVrsn() /** { "tree" :"Measure.group.stratifier.component.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation", "addStratifier", "addComponent"] , "methodName" : "setCode, addCoding, setVersion"} **/
						, measure.getMsrGrpStrtfrCmpnntCdCcCdngCCde() /** { "tree" :"Measure.group.stratifier.component.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation", "addStratifier", "addComponent"] , "methodName" : "setCode, addCoding, setCode"} **/
						, measure.getMsrGrpStrtfrCmpnntCdCcCdngCDsplay() /** { "tree" :"Measure.group.stratifier.component.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation", "addStratifier", "addComponent"] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, measure.getMsrGrpStrtfrCmpnntCdCcCdngCSrSlctd() /** { "tree" :"Measure.group.stratifier.component.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation", "addStratifier", "addComponent"] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, measure.getMsrGrpStrtfrCmpnntCdCcTxt() /** { "tree" :"Measure.group.stratifier.component.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation", "addStratifier", "addComponent"] , "methodName" : "setCode, setText"} **/
						));
Measureobj.setDescription(HapiFHIRHelpers.createstring(measure.getMsrGrpStrtfrCmpnntDscrptnStrng() /** { "tree" :"Measure.group.stratifier.component.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "addPopulation", "addStratifier", "addComponent"] , "methodName" : "setDescription"} **/
						));
Measureobj.setCriteria(HapiFHIRHelpers.createExpression(measure.getMsrGrpStrtfrCmpnntCrtrXprssnLngge() /** { "tree" :"Measure.group.stratifier.component.criteria", "datatype" : "Expression, code", "cardinality" : "Required", "elementtree" : ["addGroup", "addPopulation", "addStratifier", "addComponent"] , "methodName" : "setCriteria, setLanguage"} **/
						, measure.getMsrGrpStrtfrCmpnntCrtrXprssnNme() /** { "tree" :"Measure.group.stratifier.component.criteria", "datatype" : "Expression, id", "cardinality" : "Required", "elementtree" : ["addGroup", "addPopulation", "addStratifier", "addComponent"] , "methodName" : "setCriteria, setName"} **/
						, measure.getMsrGrpStrtfrCmpnntCrtrXprssnDscrptn() /** { "tree" :"Measure.group.stratifier.component.criteria", "datatype" : "Expression, string", "cardinality" : "Required", "elementtree" : ["addGroup", "addPopulation", "addStratifier", "addComponent"] , "methodName" : "setCriteria, setDescription"} **/
						, measure.getMsrGrpStrtfrCmpnntCrtrXprssnXprssn() /** { "tree" :"Measure.group.stratifier.component.criteria", "datatype" : "Expression, string", "cardinality" : "Required", "elementtree" : ["addGroup", "addPopulation", "addStratifier", "addComponent"] , "methodName" : "setCriteria, setExpression"} **/
						, measure.getMsrGrpStrtfrCmpnntCrtrXprssnRfrnce() /** { "tree" :"Measure.group.stratifier.component.criteria", "datatype" : "Expression, uri", "cardinality" : "Required", "elementtree" : ["addGroup", "addPopulation", "addStratifier", "addComponent"] , "methodName" : "setCriteria, setReference"} **/
						));
Measureobj.setCode(HapiFHIRHelpers.createCodeableConcept(measure.getMsrSpplmntlDtCdCcCdngCSstm() /** { "tree" :"Measure.supplementalData.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addSupplementalData"] , "methodName" : "setCode, addCoding, setSystem"} **/
						, measure.getMsrSpplmntlDtCdCcCdngCVrsn() /** { "tree" :"Measure.supplementalData.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSupplementalData"] , "methodName" : "setCode, addCoding, setVersion"} **/
						, measure.getMsrSpplmntlDtCdCcCdngCCde() /** { "tree" :"Measure.supplementalData.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addSupplementalData"] , "methodName" : "setCode, addCoding, setCode"} **/
						, measure.getMsrSpplmntlDtCdCcCdngCDsplay() /** { "tree" :"Measure.supplementalData.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSupplementalData"] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, measure.getMsrSpplmntlDtCdCcCdngCSrSlctd() /** { "tree" :"Measure.supplementalData.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addSupplementalData"] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, measure.getMsrSpplmntlDtCdCcTxt() /** { "tree" :"Measure.supplementalData.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addSupplementalData"] , "methodName" : "setCode, setText"} **/
						));
Measureobj.addUsage(HapiFHIRHelpers.createCodeableConcept(measure.getMsrSpplmntlDtSgCcCdngCSstm() /** { "tree" :"Measure.supplementalData.usage", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addSupplementalData"] , "methodName" : "addUsage, addCoding, setSystem"} **/
						, measure.getMsrSpplmntlDtSgCcCdngCVrsn() /** { "tree" :"Measure.supplementalData.usage", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addSupplementalData"] , "methodName" : "addUsage, addCoding, setVersion"} **/
						, measure.getMsrSpplmntlDtSgCcCdngCCde() /** { "tree" :"Measure.supplementalData.usage", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addSupplementalData"] , "methodName" : "addUsage, addCoding, setCode"} **/
						, measure.getMsrSpplmntlDtSgCcCdngCDsplay() /** { "tree" :"Measure.supplementalData.usage", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addSupplementalData"] , "methodName" : "addUsage, addCoding, setDisplay"} **/
						, measure.getMsrSpplmntlDtSgCcCdngCSrSlctd() /** { "tree" :"Measure.supplementalData.usage", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addSupplementalData"] , "methodName" : "addUsage, addCoding, setUserSelected"} **/
						, measure.getMsrSpplmntlDtSgCcTxt() /** { "tree" :"Measure.supplementalData.usage", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addSupplementalData"] , "methodName" : "addUsage, setText"} **/
						));
Measureobj.setDescription(HapiFHIRHelpers.createstring(measure.getMsrSpplmntlDtDscrptnStrng() /** { "tree" :"Measure.supplementalData.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addSupplementalData"] , "methodName" : "setDescription"} **/
						));
Measureobj.setCriteria(HapiFHIRHelpers.createExpression(measure.getMsrSpplmntlDtCrtrXprssnLngge() /** { "tree" :"Measure.supplementalData.criteria", "datatype" : "Expression, code", "cardinality" : "Required", "elementtree" : ["addSupplementalData"] , "methodName" : "setCriteria, setLanguage"} **/
						, measure.getMsrSpplmntlDtCrtrXprssnNme() /** { "tree" :"Measure.supplementalData.criteria", "datatype" : "Expression, id", "cardinality" : "Required", "elementtree" : ["addSupplementalData"] , "methodName" : "setCriteria, setName"} **/
						, measure.getMsrSpplmntlDtCrtrXprssnDscrptn() /** { "tree" :"Measure.supplementalData.criteria", "datatype" : "Expression, string", "cardinality" : "Required", "elementtree" : ["addSupplementalData"] , "methodName" : "setCriteria, setDescription"} **/
						, measure.getMsrSpplmntlDtCrtrXprssnXprssn() /** { "tree" :"Measure.supplementalData.criteria", "datatype" : "Expression, string", "cardinality" : "Required", "elementtree" : ["addSupplementalData"] , "methodName" : "setCriteria, setExpression"} **/
						, measure.getMsrSpplmntlDtCrtrXprssnRfrnce() /** { "tree" :"Measure.supplementalData.criteria", "datatype" : "Expression, uri", "cardinality" : "Required", "elementtree" : ["addSupplementalData"] , "methodName" : "setCriteria, setReference"} **/
		));
	}
}
