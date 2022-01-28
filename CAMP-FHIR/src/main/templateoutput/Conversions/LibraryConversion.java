package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Library.
 * @see .Library
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class LibraryConversion 
{
	public Patient Librarys(main.templateoutput.Model.Library library) 
	{
			Patient  Libraryobj = new Patient(); 

						Libraryobj.setUrl(HapiFHIRHelpers.createuri(library.getLibraryUrlUri() /** { "tree" :"Library.url", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Libraryobj.addIdentifier(HapiFHIRHelpers.createIdentifier(library.getLibraryIdentifierIdentifierUse() /** { "tree" :"Library.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, library.getLbrrDntfrDntfrTpCcCSstm() /** { "tree" :"Library.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, library.getLbrrDntfrDntfrTpCcCVrsn() /** { "tree" :"Library.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, library.getLbrrDntfrDntfrTpCcCCde() /** { "tree" :"Library.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, library.getLbrrDntfrDntfrTpCcCDsplay() /** { "tree" :"Library.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, library.getLbrrDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Library.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, library.getLbrrDntfrDntfrTpCcTxt() /** { "tree" :"Library.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, library.getLbrrDntfrDntfrPrdPrdStrt() /** { "tree" :"Library.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, library.getLbrrDntfrDntfrPrdPrdNd() /** { "tree" :"Library.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, library.getLbrrDntfrDntfrSsgnr() /** { "tree" :"Library.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, library.getLbrrDntfrDntfrVlue() /** { "tree" :"Library.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, library.getLbrrDntfrDntfrSstm() /** { "tree" :"Library.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Libraryobj.setVersion(HapiFHIRHelpers.createstring(library.getLibraryVersionString() /** { "tree" :"Library.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Libraryobj.setName(HapiFHIRHelpers.createstring(library.getLibraryNameString() /** { "tree" :"Library.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Libraryobj.setTitle(HapiFHIRHelpers.createstring(library.getLibraryTitleString() /** { "tree" :"Library.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Libraryobj.setSubtitle(HapiFHIRHelpers.createstring(library.getLibrarySubtitleString() /** { "tree" :"Library.subtitle", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubtitle"} **/
						));
Libraryobj.setStatus(HapiFHIRHelpers.createcode(library.getLibraryStatusCode() /** { "tree" :"Library.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Libraryobj.setExperimental(HapiFHIRHelpers.createboolean(library.getLibraryExperimentalBoolean() /** { "tree" :"Library.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Libraryobj.setType(HapiFHIRHelpers.createCodeableConcept(library.getLibraryTypeCcCodingCSystem() /** { "tree" :"Library.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setSystem"} **/
						, library.getLibraryTypeCcCodingCVersion() /** { "tree" :"Library.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setVersion"} **/
						, library.getLibraryTypeCcCodingCCode() /** { "tree" :"Library.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setCode"} **/
						, library.getLibraryTypeCcCodingCDisplay() /** { "tree" :"Library.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setDisplay"} **/
						, library.getLbrrTpCcCdngCSrSlctd() /** { "tree" :"Library.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, library.getLibraryTypeCcText() /** { "tree" :"Library.type", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, setText"} **/
						));
Libraryobj.setSubjectCodeableconcept(HapiFHIRHelpers.createCodeableConcept(library.getLbrrSbjctCdblcncptCcCdngCSstm() /** { "tree" :"Library.subjectCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectCodeableconcept, addCoding, setSystem"} **/
						, library.getLbrrSbjctCdblcncptCcCdngCVrsn() /** { "tree" :"Library.subjectCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectCodeableconcept, addCoding, setVersion"} **/
						, library.getLbrrSbjctCdblcncptCcCdngCCde() /** { "tree" :"Library.subjectCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectCodeableconcept, addCoding, setCode"} **/
						, library.getLbrrSbjctCdblcncptCcCdngCDsplay() /** { "tree" :"Library.subjectCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectCodeableconcept, addCoding, setDisplay"} **/
						, library.getLbrrSbjctCdblcncptCcCdngCSrSlctd() /** { "tree" :"Library.subjectCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectCodeableconcept, addCoding, setUserSelected"} **/
						, library.getLbrrSbjctCdblcncptCcTxt() /** { "tree" :"Library.subjectCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectCodeableconcept, setText"} **/
						));
Libraryobj.setSubjectReference(group)(HapiFHIRHelpers.createReference(library.getLibrarySubjectReferenceReference() /** { "tree" :"Library.subjectReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectReference(group)"} **/
						));
Libraryobj.setDate(HapiFHIRHelpers.createdateTime(library.getLibraryDateDateTime() /** { "tree" :"Library.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Libraryobj.setPublisher(HapiFHIRHelpers.createstring(library.getLibraryPublisherString() /** { "tree" :"Library.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Libraryobj.addContact(HapiFHIRHelpers.createContactDetail(library.getLbrrCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"Library.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, library.getLbrrCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"Library.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, library.getLbrrCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"Library.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, library.getLbrrCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"Library.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, library.getLbrrCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"Library.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, library.getLbrrCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"Library.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, library.getLibraryContactContactDetailName() /** { "tree" :"Library.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Libraryobj.setDescription(HapiFHIRHelpers.createmarkdown(library.getLibraryDescriptionMarkdown() /** { "tree" :"Library.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Libraryobj.addUseContext(HapiFHIRHelpers.createUsageContext(library.getLbrrSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"Library.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, library.getLbrrSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"Library.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, library.getLbrrSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"Library.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, library.getLbrrSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"Library.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, library.getLbrrSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"Library.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, library.getLbrrSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"Library.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, library.getLbrrSCntxtSgCntxtCdCSstm() /** { "tree" :"Library.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, library.getLbrrSCntxtSgCntxtCdCVrsn() /** { "tree" :"Library.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, library.getLbrrSCntxtSgCntxtCdCCde() /** { "tree" :"Library.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, library.getLbrrSCntxtSgCntxtCdCDsplay() /** { "tree" :"Library.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, library.getLbrrSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"Library.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, library.getLbrrSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"Library.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, library.getLbrrSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"Library.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, library.getLbrrSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"Library.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, library.getLbrrSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"Library.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, library.getLbrrSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"Library.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, library.getLbrrSCntxtSgCntxtVlRngRngLw() /** { "tree" :"Library.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, library.getLbrrSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"Library.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, library.getLbrrSCntxtSgCntxtVlRfrnce() /** { "tree" :"Library.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Libraryobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(library.getLbrrJrsdctnCcCdngCSstm() /** { "tree" :"Library.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, library.getLbrrJrsdctnCcCdngCVrsn() /** { "tree" :"Library.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, library.getLbrrJrsdctnCcCdngCCde() /** { "tree" :"Library.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, library.getLbrrJrsdctnCcCdngCDsplay() /** { "tree" :"Library.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, library.getLbrrJrsdctnCcCdngCSrSlctd() /** { "tree" :"Library.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, library.getLibraryJurisdictionCcText() /** { "tree" :"Library.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Libraryobj.setPurpose(HapiFHIRHelpers.createmarkdown(library.getLibraryPurposeMarkdown() /** { "tree" :"Library.purpose", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPurpose"} **/
						));
Libraryobj.setUsage(HapiFHIRHelpers.createstring(library.getLibraryUsageString() /** { "tree" :"Library.usage", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUsage"} **/
						));
Libraryobj.setCopyright(HapiFHIRHelpers.createmarkdown(library.getLibraryCopyrightMarkdown() /** { "tree" :"Library.copyright", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCopyright"} **/
						));
Libraryobj.setApprovalDate(HapiFHIRHelpers.createdate(library.getLibraryApprovalDateDate() /** { "tree" :"Library.approvalDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setApprovalDate"} **/
						));
Libraryobj.setLastReviewDate(HapiFHIRHelpers.createdate(library.getLibraryLastReviewDateDate() /** { "tree" :"Library.lastReviewDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLastReviewDate"} **/
						));
Libraryobj.setEffectivePeriod(HapiFHIRHelpers.createPeriod(library.getLbrrFfctvPrdPrdStrt() /** { "tree" :"Library.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setStart"} **/
						, library.getLibraryEffectivePeriodPeriodEnd() /** { "tree" :"Library.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setEnd"} **/
						));
Libraryobj.addTopic(HapiFHIRHelpers.createCodeableConcept(library.getLibraryTopicCcCodingCSystem() /** { "tree" :"Library.topic", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setSystem"} **/
						, library.getLibraryTopicCcCodingCVersion() /** { "tree" :"Library.topic", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setVersion"} **/
						, library.getLibraryTopicCcCodingCCode() /** { "tree" :"Library.topic", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setCode"} **/
						, library.getLibraryTopicCcCodingCDisplay() /** { "tree" :"Library.topic", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setDisplay"} **/
						, library.getLbrrTpcCcCdngCSrSlctd() /** { "tree" :"Library.topic", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setUserSelected"} **/
						, library.getLibraryTopicCcText() /** { "tree" :"Library.topic", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, setText"} **/
						));
Libraryobj.addAuthor(HapiFHIRHelpers.createContactDetail(library.getLbrrThrCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"Library.author", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setPeriod, setStart"} **/
						, library.getLbrrThrCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"Library.author", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setPeriod, setEnd"} **/
						, library.getLbrrThrCntctDtlTlcmCntctPntSstm() /** { "tree" :"Library.author", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setSystem"} **/
						, library.getLbrrThrCntctDtlTlcmCntctPntVlue() /** { "tree" :"Library.author", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setValue"} **/
						, library.getLbrrThrCntctDtlTlcmCntctPntSe() /** { "tree" :"Library.author", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setUse"} **/
						, library.getLbrrThrCntctDtlTlcmCntctPntRnk() /** { "tree" :"Library.author", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setRank"} **/
						, library.getLibraryAuthorContactDetailName() /** { "tree" :"Library.author", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, addName"} **/
						));
Libraryobj.addEditor(HapiFHIRHelpers.createContactDetail(library.getLbrrDtrCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"Library.editor", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setPeriod, setStart"} **/
						, library.getLbrrDtrCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"Library.editor", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setPeriod, setEnd"} **/
						, library.getLbrrDtrCntctDtlTlcmCntctPntSstm() /** { "tree" :"Library.editor", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setSystem"} **/
						, library.getLbrrDtrCntctDtlTlcmCntctPntVlue() /** { "tree" :"Library.editor", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setValue"} **/
						, library.getLbrrDtrCntctDtlTlcmCntctPntSe() /** { "tree" :"Library.editor", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setUse"} **/
						, library.getLbrrDtrCntctDtlTlcmCntctPntRnk() /** { "tree" :"Library.editor", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setRank"} **/
						, library.getLibraryEditorContactDetailName() /** { "tree" :"Library.editor", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, addName"} **/
						));
Libraryobj.addReviewer(HapiFHIRHelpers.createContactDetail(library.getLbrrRvwrCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"Library.reviewer", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setPeriod, setStart"} **/
						, library.getLbrrRvwrCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"Library.reviewer", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setPeriod, setEnd"} **/
						, library.getLbrrRvwrCntctDtlTlcmCntctPntSstm() /** { "tree" :"Library.reviewer", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setSystem"} **/
						, library.getLbrrRvwrCntctDtlTlcmCntctPntVlue() /** { "tree" :"Library.reviewer", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setValue"} **/
						, library.getLbrrRvwrCntctDtlTlcmCntctPntSe() /** { "tree" :"Library.reviewer", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setUse"} **/
						, library.getLbrrRvwrCntctDtlTlcmCntctPntRnk() /** { "tree" :"Library.reviewer", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setRank"} **/
						, library.getLbrrRvwrCntctDtlNme() /** { "tree" :"Library.reviewer", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, addName"} **/
						));
Libraryobj.addEndorser(HapiFHIRHelpers.createContactDetail(library.getLbrrNdrsrCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"Library.endorser", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setPeriod, setStart"} **/
						, library.getLbrrNdrsrCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"Library.endorser", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setPeriod, setEnd"} **/
						, library.getLbrrNdrsrCntctDtlTlcmCntctPntSstm() /** { "tree" :"Library.endorser", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setSystem"} **/
						, library.getLbrrNdrsrCntctDtlTlcmCntctPntVlue() /** { "tree" :"Library.endorser", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setValue"} **/
						, library.getLbrrNdrsrCntctDtlTlcmCntctPntSe() /** { "tree" :"Library.endorser", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setUse"} **/
						, library.getLbrrNdrsrCntctDtlTlcmCntctPntRnk() /** { "tree" :"Library.endorser", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setRank"} **/
						, library.getLbrrNdrsrCntctDtlNme() /** { "tree" :"Library.endorser", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, addName"} **/
						));
Libraryobj.addRelatedArtifact(HapiFHIRHelpers.createRelatedArtifact(library.getLbrrRltdrtfctRltdrtfctDcmntTtchmntCntntTpe() /** { "tree" :"Library.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setContentType"} **/
						, library.getLbrrRltdrtfctRltdrtfctDcmntTtchmntLngge() /** { "tree" :"Library.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setLanguage"} **/
						, library.getLbrrRltdrtfctRltdrtfctDcmntTtchmntDta() /** { "tree" :"Library.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setData"} **/
						, library.getLbrrRltdrtfctRltdrtfctDcmntTtchmntRl() /** { "tree" :"Library.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, url", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setUrl"} **/
						, library.getLbrrRltdrtfctRltdrtfctDcmntTtchmntSze() /** { "tree" :"Library.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, unsignedInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setSize"} **/
						, library.getLbrrRltdrtfctRltdrtfctDcmntTtchmntHsh() /** { "tree" :"Library.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setHash"} **/
						, library.getLbrrRltdrtfctRltdrtfctDcmntTtchmntTtle() /** { "tree" :"Library.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setTitle"} **/
						, library.getLbrrRltdrtfctRltdrtfctDcmntTtchmntCrtn() /** { "tree" :"Library.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setCreation"} **/
						, library.getLbrrRltdrtfctRltdrtfctRsrce() /** { "tree" :"Library.relatedArtifact", "datatype" : "RelatedArtifact, canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setResource"} **/
						, library.getLbrrRltdrtfctRltdrtfctTpe() /** { "tree" :"Library.relatedArtifact", "datatype" : "RelatedArtifact, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setType"} **/
						, library.getLbrrRltdrtfctRltdrtfctCttn() /** { "tree" :"Library.relatedArtifact", "datatype" : "RelatedArtifact, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setCitation"} **/
						, library.getLbrrRltdrtfctRltdrtfctLbl() /** { "tree" :"Library.relatedArtifact", "datatype" : "RelatedArtifact, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setLabel"} **/
						, library.getLbrrRltdrtfctRltdrtfctDsplay() /** { "tree" :"Library.relatedArtifact", "datatype" : "RelatedArtifact, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDisplay"} **/
						, library.getLbrrRltdrtfctRltdrtfctRl() /** { "tree" :"Library.relatedArtifact", "datatype" : "RelatedArtifact, url", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setUrl"} **/
						));
Libraryobj.addParameter(HapiFHIRHelpers.createParameterDefinition(library.getLbrrPrmtrPrmtrDfntnPrfle() /** { "tree" :"Library.parameter", "datatype" : "ParameterDefinition, canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addParameter, setProfile"} **/
						, library.getLbrrPrmtrPrmtrDfntnNme() /** { "tree" :"Library.parameter", "datatype" : "ParameterDefinition, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addParameter, setName"} **/
						, library.getLbrrPrmtrPrmtrDfntnSe() /** { "tree" :"Library.parameter", "datatype" : "ParameterDefinition, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addParameter, setUse"} **/
						, library.getLbrrPrmtrPrmtrDfntnTpe() /** { "tree" :"Library.parameter", "datatype" : "ParameterDefinition, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addParameter, setType"} **/
						, library.getLbrrPrmtrPrmtrDfntnMn() /** { "tree" :"Library.parameter", "datatype" : "ParameterDefinition, integer", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addParameter, setMin"} **/
						, library.getLbrrPrmtrPrmtrDfntnMx() /** { "tree" :"Library.parameter", "datatype" : "ParameterDefinition, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addParameter, setMax"} **/
						, library.getLbrrPrmtrPrmtrDfntnDcmnttn() /** { "tree" :"Library.parameter", "datatype" : "ParameterDefinition, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addParameter, setDocumentation"} **/
						));
Libraryobj.addDataRequirement(HapiFHIRHelpers.createDataRequirement(library.getLbrrDtRqrmntDtRqrmntPrfle() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addProfile"} **/
						, library.getLbrrDtRqrmntDtRqrmntTpe() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, setType"} **/
						, library.getLbrrDtRqrmntDtRqrmntSbjctCcCcCSstm() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, setSubjectCodeableConcept, addCoding, setSystem"} **/
						, library.getLbrrDtRqrmntDtRqrmntSbjctCcCcCVrsn() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, setSubjectCodeableConcept, addCoding, setVersion"} **/
						, library.getLbrrDtRqrmntDtRqrmntSbjctCcCcCCde() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, setSubjectCodeableConcept, addCoding, setCode"} **/
						, library.getLbrrDtRqrmntDtRqrmntSbjctCcCcCDsplay() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, setSubjectCodeableConcept, addCoding, setDisplay"} **/
						, library.getLbrrDtRqrmntDtRqrmntSbjctCcCcCSrSlctd() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, setSubjectCodeableConcept, addCoding, setUserSelected"} **/
						, library.getLbrrDtRqrmntDtRqrmntSbjctCcCcTxt() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, setSubjectCodeableConcept, setText"} **/
						, library.getLbrrDtRqrmntDtRqrmntCdFltrVlSt() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, Element, canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addCodeFilter, setValueSet"} **/
						, library.getLbrrDtRqrmntDtRqrmntSrtDrctn() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addSort, setDirection"} **/
						, library.getLbrrDtRqrmntDtRqrmntCdFltrCde() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, Element, Coding", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addCodeFilter, addCode"} **/
						, library.getLbrrDtRqrmntDtRqrmntDtFltrVlDtTme() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, Element, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addDateFilter, setValueDateTime"} **/
						, library.getLbrrDtRqrmntDtRqrmntDtFltrVlDrtn() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, Element, Duration", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addDateFilter, setValueDuration"} **/
						, library.getLbrrDtRqrmntDtRqrmntDtFltrVlPrd() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, Element, Period", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addDateFilter, setValuePeriod"} **/
						, library.getLbrrDtRqrmntDtRqrmntCdFltrPth() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, Element, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addCodeFilter, setPath"} **/
						, library.getLbrrDtRqrmntDtRqrmntCdFltrSrchPrm() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, Element, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addCodeFilter, setSearchParam"} **/
						, library.getLbrrDtRqrmntDtRqrmntDtFltrPth() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, Element, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addDateFilter, setPath"} **/
						, library.getLbrrDtRqrmntDtRqrmntDtFltrSrchPrm() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, Element, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addDateFilter, setSearchParam"} **/
						, library.getLbrrDtRqrmntDtRqrmntSrtPth() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addSort, setPath"} **/
						, library.getLbrrDtRqrmntDtRqrmntLmt() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, setLimit"} **/
						, library.getLbrrDtRqrmntDtRqrmntSbjctRfrnce() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, setSubjectReference"} **/
						, library.getLbrrDtRqrmntDtRqrmntMstSpprt() /** { "tree" :"Library.dataRequirement", "datatype" : "DataRequirement, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addMustSupport"} **/
						));
Libraryobj.addContent(HapiFHIRHelpers.createAttachment(library.getLibraryContentAttachmentData() /** { "tree" :"Library.content", "datatype" : "Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContent, setData"} **/
						, library.getLibraryContentAttachmentHash() /** { "tree" :"Library.content", "datatype" : "Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContent, setHash"} **/
						, library.getLbrrCntntTtchmntCntntTpe() /** { "tree" :"Library.content", "datatype" : "Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContent, setContentType"} **/
						, library.getLbrrCntntTtchmntLngge() /** { "tree" :"Library.content", "datatype" : "Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContent, setLanguage"} **/
						, library.getLbrrCntntTtchmntCrtn() /** { "tree" :"Library.content", "datatype" : "Attachment, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContent, setCreation"} **/
						, library.getLibraryContentAttachmentTitle() /** { "tree" :"Library.content", "datatype" : "Attachment, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContent, setTitle"} **/
						, library.getLibraryContentAttachmentSize() /** { "tree" :"Library.content", "datatype" : "Attachment, unsignedInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContent, setSize"} **/
						, library.getLibraryContentAttachmentUrl() /** { "tree" :"Library.content", "datatype" : "Attachment, url", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContent, setUrl"} **/
		));
	}
}
