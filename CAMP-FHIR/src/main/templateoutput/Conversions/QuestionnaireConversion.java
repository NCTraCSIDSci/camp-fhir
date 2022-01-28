package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Questionnaire.
 * @see .Questionnaire
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class QuestionnaireConversion 
{
	public Patient Questionnaires(main.templateoutput.Model.Questionnaire questionnaire) 
	{
			Patient  Questionnaireobj = new Patient(); 

						Questionnaireobj.setUrl(HapiFHIRHelpers.createuri(questionnaire.getQuestionnaireUrlUri() /** { "tree" :"Questionnaire.url", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Questionnaireobj.addIdentifier(HapiFHIRHelpers.createIdentifier(questionnaire.getQstnnrDntfrDntfrSe() /** { "tree" :"Questionnaire.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, questionnaire.getQstnnrDntfrDntfrTpCcCSstm() /** { "tree" :"Questionnaire.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, questionnaire.getQstnnrDntfrDntfrTpCcCVrsn() /** { "tree" :"Questionnaire.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, questionnaire.getQstnnrDntfrDntfrTpCcCCde() /** { "tree" :"Questionnaire.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, questionnaire.getQstnnrDntfrDntfrTpCcCDsplay() /** { "tree" :"Questionnaire.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, questionnaire.getQstnnrDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Questionnaire.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, questionnaire.getQstnnrDntfrDntfrTpCcTxt() /** { "tree" :"Questionnaire.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, questionnaire.getQstnnrDntfrDntfrPrdPrdStrt() /** { "tree" :"Questionnaire.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, questionnaire.getQstnnrDntfrDntfrPrdPrdNd() /** { "tree" :"Questionnaire.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, questionnaire.getQstnnrDntfrDntfrSsgnr() /** { "tree" :"Questionnaire.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, questionnaire.getQstnnrDntfrDntfrVlue() /** { "tree" :"Questionnaire.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, questionnaire.getQstnnrDntfrDntfrSstm() /** { "tree" :"Questionnaire.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Questionnaireobj.setVersion(HapiFHIRHelpers.createstring(questionnaire.getQuestionnaireVersionString() /** { "tree" :"Questionnaire.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Questionnaireobj.setName(HapiFHIRHelpers.createstring(questionnaire.getQuestionnaireNameString() /** { "tree" :"Questionnaire.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Questionnaireobj.setTitle(HapiFHIRHelpers.createstring(questionnaire.getQuestionnaireTitleString() /** { "tree" :"Questionnaire.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Questionnaireobj.addDerivedFrom(HapiFHIRHelpers.createcanonical(questionnaire.getQstnnrDrvdFrmCnncl() /** { "tree" :"Questionnaire.derivedFrom", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDerivedFrom"} **/
						));
Questionnaireobj.setStatus(HapiFHIRHelpers.createcode(questionnaire.getQuestionnaireStatusCode() /** { "tree" :"Questionnaire.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Questionnaireobj.setExperimental(HapiFHIRHelpers.createboolean(questionnaire.getQuestionnaireExperimentalBoolean() /** { "tree" :"Questionnaire.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Questionnaireobj.addSubjectType(HapiFHIRHelpers.createcode(questionnaire.getQuestionnaireSubjectTypeCode() /** { "tree" :"Questionnaire.subjectType", "datatype" : "code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSubjectType"} **/
						));
Questionnaireobj.setDate(HapiFHIRHelpers.createdateTime(questionnaire.getQuestionnaireDateDateTime() /** { "tree" :"Questionnaire.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Questionnaireobj.setPublisher(HapiFHIRHelpers.createstring(questionnaire.getQuestionnairePublisherString() /** { "tree" :"Questionnaire.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Questionnaireobj.addContact(HapiFHIRHelpers.createContactDetail(questionnaire.getQstnnrCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"Questionnaire.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, questionnaire.getQstnnrCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"Questionnaire.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, questionnaire.getQstnnrCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"Questionnaire.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, questionnaire.getQstnnrCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"Questionnaire.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, questionnaire.getQstnnrCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"Questionnaire.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, questionnaire.getQstnnrCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"Questionnaire.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, questionnaire.getQstnnrCntctCntctDtlNme() /** { "tree" :"Questionnaire.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Questionnaireobj.setDescription(HapiFHIRHelpers.createmarkdown(questionnaire.getQuestionnaireDescriptionMarkdown() /** { "tree" :"Questionnaire.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Questionnaireobj.addUseContext(HapiFHIRHelpers.createUsageContext(questionnaire.getQstnnrSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"Questionnaire.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, questionnaire.getQstnnrSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"Questionnaire.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, questionnaire.getQstnnrSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"Questionnaire.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, questionnaire.getQstnnrSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"Questionnaire.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, questionnaire.getQstnnrSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"Questionnaire.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, questionnaire.getQstnnrSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"Questionnaire.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, questionnaire.getQstnnrSCntxtSgCntxtCdCSstm() /** { "tree" :"Questionnaire.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, questionnaire.getQstnnrSCntxtSgCntxtCdCVrsn() /** { "tree" :"Questionnaire.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, questionnaire.getQstnnrSCntxtSgCntxtCdCCde() /** { "tree" :"Questionnaire.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, questionnaire.getQstnnrSCntxtSgCntxtCdCDsplay() /** { "tree" :"Questionnaire.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, questionnaire.getQstnnrSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"Questionnaire.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, questionnaire.getQstnnrSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"Questionnaire.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, questionnaire.getQstnnrSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"Questionnaire.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, questionnaire.getQstnnrSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"Questionnaire.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, questionnaire.getQstnnrSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"Questionnaire.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, questionnaire.getQstnnrSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"Questionnaire.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, questionnaire.getQstnnrSCntxtSgCntxtVlRngRngLw() /** { "tree" :"Questionnaire.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, questionnaire.getQstnnrSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"Questionnaire.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, questionnaire.getQstnnrSCntxtSgCntxtVlRfrnce() /** { "tree" :"Questionnaire.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Questionnaireobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(questionnaire.getQstnnrJrsdctnCcCdngCSstm() /** { "tree" :"Questionnaire.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, questionnaire.getQstnnrJrsdctnCcCdngCVrsn() /** { "tree" :"Questionnaire.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, questionnaire.getQstnnrJrsdctnCcCdngCCde() /** { "tree" :"Questionnaire.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, questionnaire.getQstnnrJrsdctnCcCdngCDsplay() /** { "tree" :"Questionnaire.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, questionnaire.getQstnnrJrsdctnCcCdngCSrSlctd() /** { "tree" :"Questionnaire.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, questionnaire.getQuestionnaireJurisdictionCcText() /** { "tree" :"Questionnaire.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Questionnaireobj.setPurpose(HapiFHIRHelpers.createmarkdown(questionnaire.getQuestionnairePurposeMarkdown() /** { "tree" :"Questionnaire.purpose", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPurpose"} **/
						));
Questionnaireobj.setCopyright(HapiFHIRHelpers.createmarkdown(questionnaire.getQuestionnaireCopyrightMarkdown() /** { "tree" :"Questionnaire.copyright", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCopyright"} **/
						));
Questionnaireobj.setApprovalDate(HapiFHIRHelpers.createdate(questionnaire.getQuestionnaireApprovalDateDate() /** { "tree" :"Questionnaire.approvalDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setApprovalDate"} **/
						));
Questionnaireobj.setLastReviewDate(HapiFHIRHelpers.createdate(questionnaire.getQuestionnaireLastReviewDateDate() /** { "tree" :"Questionnaire.lastReviewDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLastReviewDate"} **/
						));
Questionnaireobj.setEffectivePeriod(HapiFHIRHelpers.createPeriod(questionnaire.getQstnnrFfctvPrdPrdStrt() /** { "tree" :"Questionnaire.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setStart"} **/
						, questionnaire.getQstnnrFfctvPrdPrdNd() /** { "tree" :"Questionnaire.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setEnd"} **/
						));
Questionnaireobj.addCode(HapiFHIRHelpers.createCoding(questionnaire.getQuestionnaireCodeCUserSelected() /** { "tree" :"Questionnaire.code", "datatype" : "Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCode, setUserSelected"} **/
						, questionnaire.getQuestionnaireCodeCCode() /** { "tree" :"Questionnaire.code", "datatype" : "Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCode, setCode"} **/
						, questionnaire.getQuestionnaireCodeCVersion() /** { "tree" :"Questionnaire.code", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCode, setVersion"} **/
						, questionnaire.getQuestionnaireCodeCDisplay() /** { "tree" :"Questionnaire.code", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCode, setDisplay"} **/
						, questionnaire.getQuestionnaireCodeCSystem() /** { "tree" :"Questionnaire.code", "datatype" : "Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCode, setSystem"} **/
						));
Questionnaireobj.setLinkId(HapiFHIRHelpers.createstring(questionnaire.getQuestionnaireItemLinkIdString() /** { "tree" :"Questionnaire.item.linkId", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addItem"] , "methodName" : "setLinkId"} **/
						));
Questionnaireobj.setDefinition(HapiFHIRHelpers.createuri(questionnaire.getQuestionnaireItemDefinitionUri() /** { "tree" :"Questionnaire.item.definition", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setDefinition"} **/
						));
Questionnaireobj.addCode(HapiFHIRHelpers.createCoding(questionnaire.getQstnnrTmCdCSrSlctd() /** { "tree" :"Questionnaire.item.code", "datatype" : "Coding, boolean", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addCode, setUserSelected"} **/
						, questionnaire.getQuestionnaireItemCodeCCode() /** { "tree" :"Questionnaire.item.code", "datatype" : "Coding, code", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addCode, setCode"} **/
						, questionnaire.getQuestionnaireItemCodeCVersion() /** { "tree" :"Questionnaire.item.code", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addCode, setVersion"} **/
						, questionnaire.getQuestionnaireItemCodeCDisplay() /** { "tree" :"Questionnaire.item.code", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addCode, setDisplay"} **/
						, questionnaire.getQuestionnaireItemCodeCSystem() /** { "tree" :"Questionnaire.item.code", "datatype" : "Coding, uri", "cardinality" : "Many", "elementtree" : ["addItem"] , "methodName" : "addCode, setSystem"} **/
						));
Questionnaireobj.setPrefix(HapiFHIRHelpers.createstring(questionnaire.getQuestionnaireItemPrefixString() /** { "tree" :"Questionnaire.item.prefix", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setPrefix"} **/
						));
Questionnaireobj.setText(HapiFHIRHelpers.createstring(questionnaire.getQuestionnaireItemTextString() /** { "tree" :"Questionnaire.item.text", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setText"} **/
						));
Questionnaireobj.setType(HapiFHIRHelpers.createcode(questionnaire.getQuestionnaireItemTypeCode() /** { "tree" :"Questionnaire.item.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addItem"] , "methodName" : "setType"} **/
						));
Questionnaireobj.setQuestion(HapiFHIRHelpers.createstring(questionnaire.getQstnnrTmNblWhnQstnStrng() /** { "tree" :"Questionnaire.item.enableWhen.question", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setQuestion"} **/
						));
Questionnaireobj.setOperator(HapiFHIRHelpers.createcode(questionnaire.getQstnnrTmNblWhnPrtrCde() /** { "tree" :"Questionnaire.item.enableWhen.operator", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setOperator"} **/
						));
Questionnaireobj.setAnswer(HapiFHIRHelpers.createbooleantype(questionnaire.getQstnnrTmNblWhnNswrBlnBln() /** { "tree" :"Questionnaire.item.enableWhen.answerBoolean", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setAnswerBoolean"} **/
						));
Questionnaireobj.setAnswerDecimal(HapiFHIRHelpers.createdecimal(questionnaire.getQstnnrTmNblWhnNswrDcmlDcml() /** { "tree" :"Questionnaire.item.enableWhen.answerDecimal", "datatype" : "decimal", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setAnswerDecimal"} **/
						));
Questionnaireobj.setAnswer(HapiFHIRHelpers.createintegertype(questionnaire.getQstnnrTmNblWhnNswrntgrNtgr() /** { "tree" :"Questionnaire.item.enableWhen.answerInteger", "datatype" : "integer", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setAnswerInteger"} **/
						));
Questionnaireobj.setAnswerDate(HapiFHIRHelpers.createdate(questionnaire.getQstnnrTmNblWhnNswrDtDte() /** { "tree" :"Questionnaire.item.enableWhen.answerDate", "datatype" : "date", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setAnswerDate"} **/
						));
Questionnaireobj.setAnswer(HapiFHIRHelpers.createdateTimetype(questionnaire.getQstnnrTmNblWhnNswrDttmDtTme() /** { "tree" :"Questionnaire.item.enableWhen.answerDatetime", "datatype" : "dateTime", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setAnswerDatetime"} **/
						));
Questionnaireobj.setAnswerTime(HapiFHIRHelpers.createtime(questionnaire.getQstnnrTmNblWhnNswrTmTme() /** { "tree" :"Questionnaire.item.enableWhen.answerTime", "datatype" : "time", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setAnswerTime"} **/
						));
Questionnaireobj.setAnswerString(HapiFHIRHelpers.createstring(questionnaire.getQstnnrTmNblWhnNswrStrngStrng() /** { "tree" :"Questionnaire.item.enableWhen.answerString", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setAnswerString"} **/
						));
Questionnaireobj.setAnswerCoding(HapiFHIRHelpers.createCoding(questionnaire.getQstnnrTmNblWhnNswrCdngCSrSlctd() /** { "tree" :"Questionnaire.item.enableWhen.answerCoding", "datatype" : "Coding, boolean", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setAnswerCoding, setUserSelected"} **/
						, questionnaire.getQstnnrTmNblWhnNswrCdngCCde() /** { "tree" :"Questionnaire.item.enableWhen.answerCoding", "datatype" : "Coding, code", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setAnswerCoding, setCode"} **/
						, questionnaire.getQstnnrTmNblWhnNswrCdngCVrsn() /** { "tree" :"Questionnaire.item.enableWhen.answerCoding", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setAnswerCoding, setVersion"} **/
						, questionnaire.getQstnnrTmNblWhnNswrCdngCDsplay() /** { "tree" :"Questionnaire.item.enableWhen.answerCoding", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setAnswerCoding, setDisplay"} **/
						, questionnaire.getQstnnrTmNblWhnNswrCdngCSstm() /** { "tree" :"Questionnaire.item.enableWhen.answerCoding", "datatype" : "Coding, uri", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setAnswerCoding, setSystem"} **/
						));
Questionnaireobj.setAnswerQuantity(HapiFHIRHelpers.createQuantity(questionnaire.getQstnnrTmNblWhnNswrQnttQnttCmprtr() /** { "tree" :"Questionnaire.item.enableWhen.answerQuantity", "datatype" : "Quantity, code", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setAnswerQuantity, setComparator"} **/
						, questionnaire.getQstnnrTmNblWhnNswrQnttQnttCde() /** { "tree" :"Questionnaire.item.enableWhen.answerQuantity", "datatype" : "Quantity, code", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setAnswerQuantity, setCode"} **/
						, questionnaire.getQstnnrTmNblWhnNswrQnttQnttVlue() /** { "tree" :"Questionnaire.item.enableWhen.answerQuantity", "datatype" : "Quantity, decimal", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setAnswerQuantity, setValue"} **/
						, questionnaire.getQstnnrTmNblWhnNswrQnttQnttNt() /** { "tree" :"Questionnaire.item.enableWhen.answerQuantity", "datatype" : "Quantity, string", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setAnswerQuantity, setUnit"} **/
						, questionnaire.getQstnnrTmNblWhnNswrQnttQnttSstm() /** { "tree" :"Questionnaire.item.enableWhen.answerQuantity", "datatype" : "Quantity, uri", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setAnswerQuantity, setSystem"} **/
						));
Questionnaireobj.setAnswerReference(any)(HapiFHIRHelpers.createReference(questionnaire.getQstnnrTmNblWhnNswrRfrncRfrnce() /** { "tree" :"Questionnaire.item.enableWhen.answerReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setAnswerReference(any)"} **/
						));
Questionnaireobj.setEnableBehavior(HapiFHIRHelpers.createcode(questionnaire.getQstnnrTmNblBhvrCde() /** { "tree" :"Questionnaire.item.enableBehavior", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setEnableBehavior"} **/
						));
Questionnaireobj.setRequired(HapiFHIRHelpers.createboolean(questionnaire.getQstnnrTmRqrdBln() /** { "tree" :"Questionnaire.item.required", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setRequired"} **/
						));
Questionnaireobj.setRepeats(HapiFHIRHelpers.createboolean(questionnaire.getQuestionnaireItemRepeatsBoolean() /** { "tree" :"Questionnaire.item.repeats", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setRepeats"} **/
						));
Questionnaireobj.setReadOnly(HapiFHIRHelpers.createboolean(questionnaire.getQstnnrTmRdnlBln() /** { "tree" :"Questionnaire.item.readOnly", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setReadOnly"} **/
						));
Questionnaireobj.setMaxLength(HapiFHIRHelpers.createinteger(questionnaire.getQstnnrTmMxLngthNtgr() /** { "tree" :"Questionnaire.item.maxLength", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setMaxLength"} **/
						));
Questionnaireobj.setAnswerValueSet(HapiFHIRHelpers.createcanonical(questionnaire.getQstnnrTmNswrVlStCnncl() /** { "tree" :"Questionnaire.item.answerValueSet", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addEnableWhen"] , "methodName" : "setAnswerValueSet"} **/
						));
Questionnaireobj.setValue(HapiFHIRHelpers.createintegertype(questionnaire.getQstnnrTmNswrptnVlntgrNtgr() /** { "tree" :"Questionnaire.item.answerOption.valueInteger", "datatype" : "integer", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption"] , "methodName" : "setValueInteger"} **/
						));
Questionnaireobj.setValueDate(HapiFHIRHelpers.createdate(questionnaire.getQstnnrTmNswrptnVlDtDte() /** { "tree" :"Questionnaire.item.answerOption.valueDate", "datatype" : "date", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption"] , "methodName" : "setValueDate"} **/
						));
Questionnaireobj.setValueTime(HapiFHIRHelpers.createtime(questionnaire.getQstnnrTmNswrptnVlTmTme() /** { "tree" :"Questionnaire.item.answerOption.valueTime", "datatype" : "time", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption"] , "methodName" : "setValueTime"} **/
						));
Questionnaireobj.setValueString(HapiFHIRHelpers.createstring(questionnaire.getQstnnrTmNswrptnVlStrngStrng() /** { "tree" :"Questionnaire.item.answerOption.valueString", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption"] , "methodName" : "setValueString"} **/
						));
Questionnaireobj.setValueCoding(HapiFHIRHelpers.createCoding(questionnaire.getQstnnrTmNswrptnVlCdngCSrSlctd() /** { "tree" :"Questionnaire.item.answerOption.valueCoding", "datatype" : "Coding, boolean", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption"] , "methodName" : "setValueCoding, setUserSelected"} **/
						, questionnaire.getQstnnrTmNswrptnVlCdngCCde() /** { "tree" :"Questionnaire.item.answerOption.valueCoding", "datatype" : "Coding, code", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption"] , "methodName" : "setValueCoding, setCode"} **/
						, questionnaire.getQstnnrTmNswrptnVlCdngCVrsn() /** { "tree" :"Questionnaire.item.answerOption.valueCoding", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption"] , "methodName" : "setValueCoding, setVersion"} **/
						, questionnaire.getQstnnrTmNswrptnVlCdngCDsplay() /** { "tree" :"Questionnaire.item.answerOption.valueCoding", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption"] , "methodName" : "setValueCoding, setDisplay"} **/
						, questionnaire.getQstnnrTmNswrptnVlCdngCSstm() /** { "tree" :"Questionnaire.item.answerOption.valueCoding", "datatype" : "Coding, uri", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption"] , "methodName" : "setValueCoding, setSystem"} **/
						));
Questionnaireobj.setValueReference(any)(HapiFHIRHelpers.createReference(questionnaire.getQstnnrTmNswrptnVlRfrncRfrnce() /** { "tree" :"Questionnaire.item.answerOption.valueReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption"] , "methodName" : "setValueReference(any)"} **/
						));
Questionnaireobj.setInitialSelected(HapiFHIRHelpers.createboolean(questionnaire.getQstnnrTmNswrptnNtlSlctdBln() /** { "tree" :"Questionnaire.item.answerOption.initialSelected", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption"] , "methodName" : "setInitialSelected"} **/
						));
Questionnaireobj.setValue(HapiFHIRHelpers.createbooleantype(questionnaire.getQstnnrTmNtlVlBlnBln() /** { "tree" :"Questionnaire.item.initial.valueBoolean", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueBoolean"} **/
						));
Questionnaireobj.setValueDecimal(HapiFHIRHelpers.createdecimal(questionnaire.getQstnnrTmNtlVlDcmlDcml() /** { "tree" :"Questionnaire.item.initial.valueDecimal", "datatype" : "decimal", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueDecimal"} **/
						));
Questionnaireobj.setValue(HapiFHIRHelpers.createintegertype(questionnaire.getQstnnrTmNtlVlntgrNtgr() /** { "tree" :"Questionnaire.item.initial.valueInteger", "datatype" : "integer", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueInteger"} **/
						));
Questionnaireobj.setValueDate(HapiFHIRHelpers.createdate(questionnaire.getQstnnrTmNtlVlDtDte() /** { "tree" :"Questionnaire.item.initial.valueDate", "datatype" : "date", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueDate"} **/
						));
Questionnaireobj.setValue(HapiFHIRHelpers.createdateTimetype(questionnaire.getQstnnrTmNtlVlDttmDtTme() /** { "tree" :"Questionnaire.item.initial.valueDatetime", "datatype" : "dateTime", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueDatetime"} **/
						));
Questionnaireobj.setValueTime(HapiFHIRHelpers.createtime(questionnaire.getQstnnrTmNtlVlTmTme() /** { "tree" :"Questionnaire.item.initial.valueTime", "datatype" : "time", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueTime"} **/
						));
Questionnaireobj.setValueString(HapiFHIRHelpers.createstring(questionnaire.getQstnnrTmNtlVlStrngStrng() /** { "tree" :"Questionnaire.item.initial.valueString", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueString"} **/
						));
Questionnaireobj.setValueUri(HapiFHIRHelpers.createuri(questionnaire.getQstnnrTmNtlVlrRi() /** { "tree" :"Questionnaire.item.initial.valueUri", "datatype" : "uri", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueUri"} **/
						));
Questionnaireobj.setValueAttachment(HapiFHIRHelpers.createAttachment(questionnaire.getQstnnrTmNtlVlttchmntTtchmntDta() /** { "tree" :"Questionnaire.item.initial.valueAttachment", "datatype" : "Attachment, base64Binary", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueAttachment, setData"} **/
						, questionnaire.getQstnnrTmNtlVlttchmntTtchmntHsh() /** { "tree" :"Questionnaire.item.initial.valueAttachment", "datatype" : "Attachment, base64Binary", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueAttachment, setHash"} **/
						, questionnaire.getQstnnrTmNtlVlttchmntTtchmntCntntTpe() /** { "tree" :"Questionnaire.item.initial.valueAttachment", "datatype" : "Attachment, code", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueAttachment, setContentType"} **/
						, questionnaire.getQstnnrTmNtlVlttchmntTtchmntLngge() /** { "tree" :"Questionnaire.item.initial.valueAttachment", "datatype" : "Attachment, code", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueAttachment, setLanguage"} **/
						, questionnaire.getQstnnrTmNtlVlttchmntTtchmntCrtn() /** { "tree" :"Questionnaire.item.initial.valueAttachment", "datatype" : "Attachment, dateTime", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueAttachment, setCreation"} **/
						, questionnaire.getQstnnrTmNtlVlttchmntTtchmntTtle() /** { "tree" :"Questionnaire.item.initial.valueAttachment", "datatype" : "Attachment, string", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueAttachment, setTitle"} **/
						, questionnaire.getQstnnrTmNtlVlttchmntTtchmntSze() /** { "tree" :"Questionnaire.item.initial.valueAttachment", "datatype" : "Attachment, unsignedInt", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueAttachment, setSize"} **/
						, questionnaire.getQstnnrTmNtlVlttchmntTtchmntRl() /** { "tree" :"Questionnaire.item.initial.valueAttachment", "datatype" : "Attachment, url", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueAttachment, setUrl"} **/
						));
Questionnaireobj.setValueCoding(HapiFHIRHelpers.createCoding(questionnaire.getQstnnrTmNtlVlCdngCSrSlctd() /** { "tree" :"Questionnaire.item.initial.valueCoding", "datatype" : "Coding, boolean", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueCoding, setUserSelected"} **/
						, questionnaire.getQstnnrTmNtlVlCdngCCde() /** { "tree" :"Questionnaire.item.initial.valueCoding", "datatype" : "Coding, code", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueCoding, setCode"} **/
						, questionnaire.getQstnnrTmNtlVlCdngCVrsn() /** { "tree" :"Questionnaire.item.initial.valueCoding", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueCoding, setVersion"} **/
						, questionnaire.getQstnnrTmNtlVlCdngCDsplay() /** { "tree" :"Questionnaire.item.initial.valueCoding", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueCoding, setDisplay"} **/
						, questionnaire.getQstnnrTmNtlVlCdngCSstm() /** { "tree" :"Questionnaire.item.initial.valueCoding", "datatype" : "Coding, uri", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueCoding, setSystem"} **/
						));
Questionnaireobj.setValueQuantity(HapiFHIRHelpers.createQuantity(questionnaire.getQstnnrTmNtlVlQnttQnttCmprtr() /** { "tree" :"Questionnaire.item.initial.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueQuantity, setComparator"} **/
						, questionnaire.getQstnnrTmNtlVlQnttQnttCde() /** { "tree" :"Questionnaire.item.initial.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueQuantity, setCode"} **/
						, questionnaire.getQstnnrTmNtlVlQnttQnttVlue() /** { "tree" :"Questionnaire.item.initial.valueQuantity", "datatype" : "Quantity, decimal", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueQuantity, setValue"} **/
						, questionnaire.getQstnnrTmNtlVlQnttQnttNt() /** { "tree" :"Questionnaire.item.initial.valueQuantity", "datatype" : "Quantity, string", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueQuantity, setUnit"} **/
						, questionnaire.getQstnnrTmNtlVlQnttQnttSstm() /** { "tree" :"Questionnaire.item.initial.valueQuantity", "datatype" : "Quantity, uri", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueQuantity, setSystem"} **/
						));
Questionnaireobj.setValueReference(any)(HapiFHIRHelpers.createReference(questionnaire.getQstnnrTmNtlVlRfrncRfrnce() /** { "tree" :"Questionnaire.item.initial.valueReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "setValueReference(any)"} **/
						));
Questionnaireobj.addItem(HapiFHIRHelpers.createitem(questionnaire.getQuestionnaireItemItemItem() /** { "tree" :"Questionnaire.item.item", "datatype" : "item", "cardinality" : "Many", "elementtree" : ["addItem", "addEnableWhen", "addAnswerOption", "addInitial"] , "methodName" : "addItem"} **/
		));
	}
}
