package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Researchdefinition.
 * @see .Researchdefinition
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ResearchdefinitionConversion 
{
	public Patient Researchdefinitions(main.templateoutput.Model.Researchdefinition researchdefinition) 
	{
			Patient  Researchdefinitionobj = new Patient(); 

						Researchdefinitionobj.setUrl(HapiFHIRHelpers.createuri(researchdefinition.getResearchDefinitionUrlUri() /** { "tree" :"ResearchDefinition.url", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Researchdefinitionobj.addIdentifier(HapiFHIRHelpers.createIdentifier(researchdefinition.getRsrchDfntnDntfrDntfrSe() /** { "tree" :"ResearchDefinition.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, researchdefinition.getRsrchDfntnDntfrDntfrTpCcCSstm() /** { "tree" :"ResearchDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, researchdefinition.getRsrchDfntnDntfrDntfrTpCcCVrsn() /** { "tree" :"ResearchDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, researchdefinition.getRsrchDfntnDntfrDntfrTpCcCCde() /** { "tree" :"ResearchDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, researchdefinition.getRsrchDfntnDntfrDntfrTpCcCDsplay() /** { "tree" :"ResearchDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, researchdefinition.getRsrchDfntnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"ResearchDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, researchdefinition.getRsrchDfntnDntfrDntfrTpCcTxt() /** { "tree" :"ResearchDefinition.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, researchdefinition.getRsrchDfntnDntfrDntfrPrdPrdStrt() /** { "tree" :"ResearchDefinition.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, researchdefinition.getRsrchDfntnDntfrDntfrPrdPrdNd() /** { "tree" :"ResearchDefinition.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, researchdefinition.getRsrchDfntnDntfrDntfrSsgnr() /** { "tree" :"ResearchDefinition.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, researchdefinition.getRsrchDfntnDntfrDntfrVlue() /** { "tree" :"ResearchDefinition.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, researchdefinition.getRsrchDfntnDntfrDntfrSstm() /** { "tree" :"ResearchDefinition.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Researchdefinitionobj.setVersion(HapiFHIRHelpers.createstring(researchdefinition.getResearchDefinitionVersionString() /** { "tree" :"ResearchDefinition.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Researchdefinitionobj.setName(HapiFHIRHelpers.createstring(researchdefinition.getResearchDefinitionNameString() /** { "tree" :"ResearchDefinition.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Researchdefinitionobj.setTitle(HapiFHIRHelpers.createstring(researchdefinition.getResearchDefinitionTitleString() /** { "tree" :"ResearchDefinition.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Researchdefinitionobj.setShortTitle(HapiFHIRHelpers.createstring(researchdefinition.getRsrchDfntnShrtTtlStrng() /** { "tree" :"ResearchDefinition.shortTitle", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setShortTitle"} **/
						));
Researchdefinitionobj.setSubtitle(HapiFHIRHelpers.createstring(researchdefinition.getResearchDefinitionSubtitleString() /** { "tree" :"ResearchDefinition.subtitle", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubtitle"} **/
						));
Researchdefinitionobj.setStatus(HapiFHIRHelpers.createcode(researchdefinition.getResearchDefinitionStatusCode() /** { "tree" :"ResearchDefinition.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Researchdefinitionobj.setExperimental(HapiFHIRHelpers.createboolean(researchdefinition.getRsrchDfntnXprmntlBln() /** { "tree" :"ResearchDefinition.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Researchdefinitionobj.setSubjectCodeableconcept(HapiFHIRHelpers.createCodeableConcept(researchdefinition.getRsrchDfntnSbjctCdblcncptCcCdngCSstm() /** { "tree" :"ResearchDefinition.subjectCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectCodeableconcept, addCoding, setSystem"} **/
						, researchdefinition.getRsrchDfntnSbjctCdblcncptCcCdngCVrsn() /** { "tree" :"ResearchDefinition.subjectCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectCodeableconcept, addCoding, setVersion"} **/
						, researchdefinition.getRsrchDfntnSbjctCdblcncptCcCdngCCde() /** { "tree" :"ResearchDefinition.subjectCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectCodeableconcept, addCoding, setCode"} **/
						, researchdefinition.getRsrchDfntnSbjctCdblcncptCcCdngCDsplay() /** { "tree" :"ResearchDefinition.subjectCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectCodeableconcept, addCoding, setDisplay"} **/
						, researchdefinition.getRsrchDfntnSbjctCdblcncptCcCdngCSrSlctd() /** { "tree" :"ResearchDefinition.subjectCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectCodeableconcept, addCoding, setUserSelected"} **/
						, researchdefinition.getRsrchDfntnSbjctCdblcncptCcTxt() /** { "tree" :"ResearchDefinition.subjectCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectCodeableconcept, setText"} **/
						));
Researchdefinitionobj.setSubjectReference(group)(HapiFHIRHelpers.createReference(researchdefinition.getRsrchDfntnSbjctRfrncRfrnce() /** { "tree" :"ResearchDefinition.subjectReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubjectReference(group)"} **/
						));
Researchdefinitionobj.setDate(HapiFHIRHelpers.createdateTime(researchdefinition.getResearchDefinitionDateDateTime() /** { "tree" :"ResearchDefinition.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Researchdefinitionobj.setPublisher(HapiFHIRHelpers.createstring(researchdefinition.getRsrchDfntnPblshrStrng() /** { "tree" :"ResearchDefinition.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Researchdefinitionobj.addContact(HapiFHIRHelpers.createContactDetail(researchdefinition.getRsrchDfntnCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"ResearchDefinition.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, researchdefinition.getRsrchDfntnCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"ResearchDefinition.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, researchdefinition.getRsrchDfntnCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"ResearchDefinition.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, researchdefinition.getRsrchDfntnCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"ResearchDefinition.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, researchdefinition.getRsrchDfntnCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"ResearchDefinition.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, researchdefinition.getRsrchDfntnCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"ResearchDefinition.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, researchdefinition.getRsrchDfntnCntctCntctDtlNme() /** { "tree" :"ResearchDefinition.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Researchdefinitionobj.setDescription(HapiFHIRHelpers.createmarkdown(researchdefinition.getRsrchDfntnDscrptnMrkdwn() /** { "tree" :"ResearchDefinition.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Researchdefinitionobj.addComment(HapiFHIRHelpers.createstring(researchdefinition.getResearchDefinitionCommentString() /** { "tree" :"ResearchDefinition.comment", "datatype" : "string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComment"} **/
						));
Researchdefinitionobj.addUseContext(HapiFHIRHelpers.createUsageContext(researchdefinition.getRsrchDfntnSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"ResearchDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, researchdefinition.getRsrchDfntnSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"ResearchDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, researchdefinition.getRsrchDfntnSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"ResearchDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, researchdefinition.getRsrchDfntnSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"ResearchDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, researchdefinition.getRsrchDfntnSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"ResearchDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, researchdefinition.getRsrchDfntnSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"ResearchDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, researchdefinition.getRsrchDfntnSCntxtSgCntxtCdCSstm() /** { "tree" :"ResearchDefinition.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, researchdefinition.getRsrchDfntnSCntxtSgCntxtCdCVrsn() /** { "tree" :"ResearchDefinition.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, researchdefinition.getRsrchDfntnSCntxtSgCntxtCdCCde() /** { "tree" :"ResearchDefinition.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, researchdefinition.getRsrchDfntnSCntxtSgCntxtCdCDsplay() /** { "tree" :"ResearchDefinition.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, researchdefinition.getRsrchDfntnSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"ResearchDefinition.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, researchdefinition.getRsrchDfntnSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"ResearchDefinition.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, researchdefinition.getRsrchDfntnSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"ResearchDefinition.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, researchdefinition.getRsrchDfntnSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"ResearchDefinition.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, researchdefinition.getRsrchDfntnSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"ResearchDefinition.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, researchdefinition.getRsrchDfntnSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"ResearchDefinition.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, researchdefinition.getRsrchDfntnSCntxtSgCntxtVlRngRngLw() /** { "tree" :"ResearchDefinition.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, researchdefinition.getRsrchDfntnSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"ResearchDefinition.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, researchdefinition.getRsrchDfntnSCntxtSgCntxtVlRfrnce() /** { "tree" :"ResearchDefinition.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Researchdefinitionobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(researchdefinition.getRsrchDfntnJrsdctnCcCdngCSstm() /** { "tree" :"ResearchDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, researchdefinition.getRsrchDfntnJrsdctnCcCdngCVrsn() /** { "tree" :"ResearchDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, researchdefinition.getRsrchDfntnJrsdctnCcCdngCCde() /** { "tree" :"ResearchDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, researchdefinition.getRsrchDfntnJrsdctnCcCdngCDsplay() /** { "tree" :"ResearchDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, researchdefinition.getRsrchDfntnJrsdctnCcCdngCSrSlctd() /** { "tree" :"ResearchDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, researchdefinition.getRsrchDfntnJrsdctnCcTxt() /** { "tree" :"ResearchDefinition.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Researchdefinitionobj.setPurpose(HapiFHIRHelpers.createmarkdown(researchdefinition.getRsrchDfntnPrpsMrkdwn() /** { "tree" :"ResearchDefinition.purpose", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPurpose"} **/
						));
Researchdefinitionobj.setUsage(HapiFHIRHelpers.createstring(researchdefinition.getResearchDefinitionUsageString() /** { "tree" :"ResearchDefinition.usage", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUsage"} **/
						));
Researchdefinitionobj.setCopyright(HapiFHIRHelpers.createmarkdown(researchdefinition.getRsrchDfntnCprghtMrkdwn() /** { "tree" :"ResearchDefinition.copyright", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCopyright"} **/
						));
Researchdefinitionobj.setApprovalDate(HapiFHIRHelpers.createdate(researchdefinition.getRsrchDfntnPprvlDtDte() /** { "tree" :"ResearchDefinition.approvalDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setApprovalDate"} **/
						));
Researchdefinitionobj.setLastReviewDate(HapiFHIRHelpers.createdate(researchdefinition.getRsrchDfntnLstRvwDtDte() /** { "tree" :"ResearchDefinition.lastReviewDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLastReviewDate"} **/
						));
Researchdefinitionobj.setEffectivePeriod(HapiFHIRHelpers.createPeriod(researchdefinition.getRsrchDfntnFfctvPrdPrdStrt() /** { "tree" :"ResearchDefinition.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setStart"} **/
						, researchdefinition.getRsrchDfntnFfctvPrdPrdNd() /** { "tree" :"ResearchDefinition.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setEnd"} **/
						));
Researchdefinitionobj.addTopic(HapiFHIRHelpers.createCodeableConcept(researchdefinition.getRsrchDfntnTpcCcCdngCSstm() /** { "tree" :"ResearchDefinition.topic", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setSystem"} **/
						, researchdefinition.getRsrchDfntnTpcCcCdngCVrsn() /** { "tree" :"ResearchDefinition.topic", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setVersion"} **/
						, researchdefinition.getRsrchDfntnTpcCcCdngCCde() /** { "tree" :"ResearchDefinition.topic", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setCode"} **/
						, researchdefinition.getRsrchDfntnTpcCcCdngCDsplay() /** { "tree" :"ResearchDefinition.topic", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setDisplay"} **/
						, researchdefinition.getRsrchDfntnTpcCcCdngCSrSlctd() /** { "tree" :"ResearchDefinition.topic", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, addCoding, setUserSelected"} **/
						, researchdefinition.getResearchDefinitionTopicCcText() /** { "tree" :"ResearchDefinition.topic", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTopic, setText"} **/
						));
Researchdefinitionobj.addAuthor(HapiFHIRHelpers.createContactDetail(researchdefinition.getRsrchDfntnThrCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"ResearchDefinition.author", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setPeriod, setStart"} **/
						, researchdefinition.getRsrchDfntnThrCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"ResearchDefinition.author", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setPeriod, setEnd"} **/
						, researchdefinition.getRsrchDfntnThrCntctDtlTlcmCntctPntSstm() /** { "tree" :"ResearchDefinition.author", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setSystem"} **/
						, researchdefinition.getRsrchDfntnThrCntctDtlTlcmCntctPntVlue() /** { "tree" :"ResearchDefinition.author", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setValue"} **/
						, researchdefinition.getRsrchDfntnThrCntctDtlTlcmCntctPntSe() /** { "tree" :"ResearchDefinition.author", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setUse"} **/
						, researchdefinition.getRsrchDfntnThrCntctDtlTlcmCntctPntRnk() /** { "tree" :"ResearchDefinition.author", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, setTelecom, setRank"} **/
						, researchdefinition.getRsrchDfntnThrCntctDtlNme() /** { "tree" :"ResearchDefinition.author", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor, addName"} **/
						));
Researchdefinitionobj.addEditor(HapiFHIRHelpers.createContactDetail(researchdefinition.getRsrchDfntnDtrCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"ResearchDefinition.editor", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setPeriod, setStart"} **/
						, researchdefinition.getRsrchDfntnDtrCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"ResearchDefinition.editor", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setPeriod, setEnd"} **/
						, researchdefinition.getRsrchDfntnDtrCntctDtlTlcmCntctPntSstm() /** { "tree" :"ResearchDefinition.editor", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setSystem"} **/
						, researchdefinition.getRsrchDfntnDtrCntctDtlTlcmCntctPntVlue() /** { "tree" :"ResearchDefinition.editor", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setValue"} **/
						, researchdefinition.getRsrchDfntnDtrCntctDtlTlcmCntctPntSe() /** { "tree" :"ResearchDefinition.editor", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setUse"} **/
						, researchdefinition.getRsrchDfntnDtrCntctDtlTlcmCntctPntRnk() /** { "tree" :"ResearchDefinition.editor", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, setTelecom, setRank"} **/
						, researchdefinition.getRsrchDfntnDtrCntctDtlNme() /** { "tree" :"ResearchDefinition.editor", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEditor, addName"} **/
						));
Researchdefinitionobj.addReviewer(HapiFHIRHelpers.createContactDetail(researchdefinition.getRsrchDfntnRvwrCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"ResearchDefinition.reviewer", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setPeriod, setStart"} **/
						, researchdefinition.getRsrchDfntnRvwrCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"ResearchDefinition.reviewer", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setPeriod, setEnd"} **/
						, researchdefinition.getRsrchDfntnRvwrCntctDtlTlcmCntctPntSstm() /** { "tree" :"ResearchDefinition.reviewer", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setSystem"} **/
						, researchdefinition.getRsrchDfntnRvwrCntctDtlTlcmCntctPntVlue() /** { "tree" :"ResearchDefinition.reviewer", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setValue"} **/
						, researchdefinition.getRsrchDfntnRvwrCntctDtlTlcmCntctPntSe() /** { "tree" :"ResearchDefinition.reviewer", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setUse"} **/
						, researchdefinition.getRsrchDfntnRvwrCntctDtlTlcmCntctPntRnk() /** { "tree" :"ResearchDefinition.reviewer", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, setTelecom, setRank"} **/
						, researchdefinition.getRsrchDfntnRvwrCntctDtlNme() /** { "tree" :"ResearchDefinition.reviewer", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReviewer, addName"} **/
						));
Researchdefinitionobj.addEndorser(HapiFHIRHelpers.createContactDetail(researchdefinition.getRsrchDfntnNdrsrCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"ResearchDefinition.endorser", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setPeriod, setStart"} **/
						, researchdefinition.getRsrchDfntnNdrsrCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"ResearchDefinition.endorser", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setPeriod, setEnd"} **/
						, researchdefinition.getRsrchDfntnNdrsrCntctDtlTlcmCntctPntSstm() /** { "tree" :"ResearchDefinition.endorser", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setSystem"} **/
						, researchdefinition.getRsrchDfntnNdrsrCntctDtlTlcmCntctPntVlue() /** { "tree" :"ResearchDefinition.endorser", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setValue"} **/
						, researchdefinition.getRsrchDfntnNdrsrCntctDtlTlcmCntctPntSe() /** { "tree" :"ResearchDefinition.endorser", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setUse"} **/
						, researchdefinition.getRsrchDfntnNdrsrCntctDtlTlcmCntctPntRnk() /** { "tree" :"ResearchDefinition.endorser", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, setTelecom, setRank"} **/
						, researchdefinition.getRsrchDfntnNdrsrCntctDtlNme() /** { "tree" :"ResearchDefinition.endorser", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndorser, addName"} **/
						));
Researchdefinitionobj.addRelatedArtifact(HapiFHIRHelpers.createRelatedArtifact(researchdefinition.getRsrchDfntnRltdrtfctRltdrtfctDcmntTtchmntCntntTpe() /** { "tree" :"ResearchDefinition.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setContentType"} **/
						, researchdefinition.getRsrchDfntnRltdrtfctRltdrtfctDcmntTtchmntLngge() /** { "tree" :"ResearchDefinition.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setLanguage"} **/
						, researchdefinition.getRsrchDfntnRltdrtfctRltdrtfctDcmntTtchmntDta() /** { "tree" :"ResearchDefinition.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setData"} **/
						, researchdefinition.getRsrchDfntnRltdrtfctRltdrtfctDcmntTtchmntRl() /** { "tree" :"ResearchDefinition.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, url", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setUrl"} **/
						, researchdefinition.getRsrchDfntnRltdrtfctRltdrtfctDcmntTtchmntSze() /** { "tree" :"ResearchDefinition.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, unsignedInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setSize"} **/
						, researchdefinition.getRsrchDfntnRltdrtfctRltdrtfctDcmntTtchmntHsh() /** { "tree" :"ResearchDefinition.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setHash"} **/
						, researchdefinition.getRsrchDfntnRltdrtfctRltdrtfctDcmntTtchmntTtle() /** { "tree" :"ResearchDefinition.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setTitle"} **/
						, researchdefinition.getRsrchDfntnRltdrtfctRltdrtfctDcmntTtchmntCrtn() /** { "tree" :"ResearchDefinition.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setCreation"} **/
						, researchdefinition.getRsrchDfntnRltdrtfctRltdrtfctRsrce() /** { "tree" :"ResearchDefinition.relatedArtifact", "datatype" : "RelatedArtifact, canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setResource"} **/
						, researchdefinition.getRsrchDfntnRltdrtfctRltdrtfctTpe() /** { "tree" :"ResearchDefinition.relatedArtifact", "datatype" : "RelatedArtifact, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setType"} **/
						, researchdefinition.getRsrchDfntnRltdrtfctRltdrtfctCttn() /** { "tree" :"ResearchDefinition.relatedArtifact", "datatype" : "RelatedArtifact, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setCitation"} **/
						, researchdefinition.getRsrchDfntnRltdrtfctRltdrtfctLbl() /** { "tree" :"ResearchDefinition.relatedArtifact", "datatype" : "RelatedArtifact, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setLabel"} **/
						, researchdefinition.getRsrchDfntnRltdrtfctRltdrtfctDsplay() /** { "tree" :"ResearchDefinition.relatedArtifact", "datatype" : "RelatedArtifact, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDisplay"} **/
						, researchdefinition.getRsrchDfntnRltdrtfctRltdrtfctRl() /** { "tree" :"ResearchDefinition.relatedArtifact", "datatype" : "RelatedArtifact, url", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setUrl"} **/
						));
Researchdefinitionobj.addLibrary(HapiFHIRHelpers.createcanonical(researchdefinition.getRsrchDfntnLbrrCnncl() /** { "tree" :"ResearchDefinition.library", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLibrary"} **/
						));
Researchdefinitionobj.setPopulation(HapiFHIRHelpers.createReference(researchdefinition.getRsrchDfntnPpltnRfrnce() /** { "tree" :"ResearchDefinition.population", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPopulation"} **/
						));
Researchdefinitionobj.setExposure(HapiFHIRHelpers.createReference(researchdefinition.getRsrchDfntnXpsrRfrnce() /** { "tree" :"ResearchDefinition.exposure", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExposure"} **/
						));
Researchdefinitionobj.setExposureAlternative(HapiFHIRHelpers.createReference(researchdefinition.getRsrchDfntnXpsrltrntvRfrnce() /** { "tree" :"ResearchDefinition.exposureAlternative", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExposureAlternative"} **/
						));
Researchdefinitionobj.setOutcome(HapiFHIRHelpers.createReference(researchdefinition.getRsrchDfntnTcmRfrnce() /** { "tree" :"ResearchDefinition.outcome", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOutcome"} **/
		));
	}
}
