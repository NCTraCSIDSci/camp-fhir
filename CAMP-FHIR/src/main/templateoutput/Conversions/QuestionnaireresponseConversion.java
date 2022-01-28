package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Questionnaireresponse.
 * @see .Questionnaireresponse
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class QuestionnaireresponseConversion 
{
	public Patient Questionnaireresponses(main.templateoutput.Model.Questionnaireresponse questionnaireresponse) 
	{
			Patient  Questionnaireresponseobj = new Patient(); 

						Questionnaireresponseobj.setIdentifier(HapiFHIRHelpers.createIdentifier(questionnaireresponse.getQstnnrRspnsDntfrDntfrSe() /** { "tree" :"QuestionnaireResponse.identifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setUse"} **/
						, questionnaireresponse.getQstnnrRspnsDntfrDntfrTpCcCSstm() /** { "tree" :"QuestionnaireResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setSystem"} **/
						, questionnaireresponse.getQstnnrRspnsDntfrDntfrTpCcCVrsn() /** { "tree" :"QuestionnaireResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setVersion"} **/
						, questionnaireresponse.getQstnnrRspnsDntfrDntfrTpCcCCde() /** { "tree" :"QuestionnaireResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setCode"} **/
						, questionnaireresponse.getQstnnrRspnsDntfrDntfrTpCcCDsplay() /** { "tree" :"QuestionnaireResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setDisplay"} **/
						, questionnaireresponse.getQstnnrRspnsDntfrDntfrTpCcCSrSlctd() /** { "tree" :"QuestionnaireResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setUserSelected"} **/
						, questionnaireresponse.getQstnnrRspnsDntfrDntfrTpCcTxt() /** { "tree" :"QuestionnaireResponse.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, setText"} **/
						, questionnaireresponse.getQstnnrRspnsDntfrDntfrPrdPrdStrt() /** { "tree" :"QuestionnaireResponse.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setPeriod, setStart"} **/
						, questionnaireresponse.getQstnnrRspnsDntfrDntfrPrdPrdNd() /** { "tree" :"QuestionnaireResponse.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setPeriod, setEnd"} **/
						, questionnaireresponse.getQstnnrRspnsDntfrDntfrSsgnr() /** { "tree" :"QuestionnaireResponse.identifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setAssigner"} **/
						, questionnaireresponse.getQstnnrRspnsDntfrDntfrVlue() /** { "tree" :"QuestionnaireResponse.identifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setValue"} **/
						, questionnaireresponse.getQstnnrRspnsDntfrDntfrSstm() /** { "tree" :"QuestionnaireResponse.identifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setSystem"} **/
						));
Questionnaireresponseobj.addBasedOn(HapiFHIRHelpers.createReference(questionnaireresponse.getQstnnrRspnsBsdnRfrnce() /** { "tree" :"QuestionnaireResponse.basedOn", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasedOn"} **/
						));
Questionnaireresponseobj.addPartOf(HapiFHIRHelpers.createReference(questionnaireresponse.getQstnnrRspnsPrtfRfrnce() /** { "tree" :"QuestionnaireResponse.partOf", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPartOf"} **/
						));
Questionnaireresponseobj.setQuestionnaire(HapiFHIRHelpers.createcanonical(questionnaireresponse.getQstnnrRspnsQstnnrCnncl() /** { "tree" :"QuestionnaireResponse.questionnaire", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuestionnaire"} **/
						));
Questionnaireresponseobj.setStatus(HapiFHIRHelpers.createcode(questionnaireresponse.getQuestionnaireResponseStatusCode() /** { "tree" :"QuestionnaireResponse.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Questionnaireresponseobj.setSubject(HapiFHIRHelpers.createReference(questionnaireresponse.getQstnnrRspnsSbjctRfrnce() /** { "tree" :"QuestionnaireResponse.subject", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Questionnaireresponseobj.setEncounter(HapiFHIRHelpers.createReference(questionnaireresponse.getQstnnrRspnsNcntrRfrnce() /** { "tree" :"QuestionnaireResponse.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Questionnaireresponseobj.setAuthored(HapiFHIRHelpers.createdateTime(questionnaireresponse.getQstnnrRspnsThrdDtTme() /** { "tree" :"QuestionnaireResponse.authored", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAuthored"} **/
						));
Questionnaireresponseobj.setAuthor(HapiFHIRHelpers.createReference(questionnaireresponse.getQstnnrRspnsThrRfrnce() /** { "tree" :"QuestionnaireResponse.author", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAuthor"} **/
						));
Questionnaireresponseobj.setSource(HapiFHIRHelpers.createReference(questionnaireresponse.getQstnnrRspnsSrcRfrnce() /** { "tree" :"QuestionnaireResponse.source", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSource"} **/
						));
Questionnaireresponseobj.setLinkId(HapiFHIRHelpers.createstring(questionnaireresponse.getQstnnrRspnsTmLnkdStrng() /** { "tree" :"QuestionnaireResponse.item.linkId", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addItem"] , "methodName" : "setLinkId"} **/
						));
Questionnaireresponseobj.setDefinition(HapiFHIRHelpers.createuri(questionnaireresponse.getQstnnrRspnsTmDfntnRi() /** { "tree" :"QuestionnaireResponse.item.definition", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setDefinition"} **/
						));
Questionnaireresponseobj.setText(HapiFHIRHelpers.createstring(questionnaireresponse.getQstnnrRspnsTmTxtStrng() /** { "tree" :"QuestionnaireResponse.item.text", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addItem"] , "methodName" : "setText"} **/
						));
Questionnaireresponseobj.setValue(HapiFHIRHelpers.createbooleantype(questionnaireresponse.getQstnnrRspnsTmNswrVlBlnBln() /** { "tree" :"QuestionnaireResponse.item.answer.valueBoolean", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueBoolean"} **/
						));
Questionnaireresponseobj.setValueDecimal(HapiFHIRHelpers.createdecimal(questionnaireresponse.getQstnnrRspnsTmNswrVlDcmlDcml() /** { "tree" :"QuestionnaireResponse.item.answer.valueDecimal", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueDecimal"} **/
						));
Questionnaireresponseobj.setValue(HapiFHIRHelpers.createintegertype(questionnaireresponse.getQstnnrRspnsTmNswrVlntgrNtgr() /** { "tree" :"QuestionnaireResponse.item.answer.valueInteger", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueInteger"} **/
						));
Questionnaireresponseobj.setValueDate(HapiFHIRHelpers.createdate(questionnaireresponse.getQstnnrRspnsTmNswrVlDtDte() /** { "tree" :"QuestionnaireResponse.item.answer.valueDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueDate"} **/
						));
Questionnaireresponseobj.setValue(HapiFHIRHelpers.createdateTimetype(questionnaireresponse.getQstnnrRspnsTmNswrVlDttmDtTme() /** { "tree" :"QuestionnaireResponse.item.answer.valueDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueDatetime"} **/
						));
Questionnaireresponseobj.setValueTime(HapiFHIRHelpers.createtime(questionnaireresponse.getQstnnrRspnsTmNswrVlTmTme() /** { "tree" :"QuestionnaireResponse.item.answer.valueTime", "datatype" : "time", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueTime"} **/
						));
Questionnaireresponseobj.setValueString(HapiFHIRHelpers.createstring(questionnaireresponse.getQstnnrRspnsTmNswrVlStrngStrng() /** { "tree" :"QuestionnaireResponse.item.answer.valueString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueString"} **/
						));
Questionnaireresponseobj.setValueUri(HapiFHIRHelpers.createuri(questionnaireresponse.getQstnnrRspnsTmNswrVlrRi() /** { "tree" :"QuestionnaireResponse.item.answer.valueUri", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueUri"} **/
						));
Questionnaireresponseobj.setValueAttachment(HapiFHIRHelpers.createAttachment(questionnaireresponse.getQstnnrRspnsTmNswrVlttchmntTtchmntDta() /** { "tree" :"QuestionnaireResponse.item.answer.valueAttachment", "datatype" : "Attachment, base64Binary", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueAttachment, setData"} **/
						, questionnaireresponse.getQstnnrRspnsTmNswrVlttchmntTtchmntHsh() /** { "tree" :"QuestionnaireResponse.item.answer.valueAttachment", "datatype" : "Attachment, base64Binary", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueAttachment, setHash"} **/
						, questionnaireresponse.getQstnnrRspnsTmNswrVlttchmntTtchmntCntntTpe() /** { "tree" :"QuestionnaireResponse.item.answer.valueAttachment", "datatype" : "Attachment, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueAttachment, setContentType"} **/
						, questionnaireresponse.getQstnnrRspnsTmNswrVlttchmntTtchmntLngge() /** { "tree" :"QuestionnaireResponse.item.answer.valueAttachment", "datatype" : "Attachment, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueAttachment, setLanguage"} **/
						, questionnaireresponse.getQstnnrRspnsTmNswrVlttchmntTtchmntCrtn() /** { "tree" :"QuestionnaireResponse.item.answer.valueAttachment", "datatype" : "Attachment, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueAttachment, setCreation"} **/
						, questionnaireresponse.getQstnnrRspnsTmNswrVlttchmntTtchmntTtle() /** { "tree" :"QuestionnaireResponse.item.answer.valueAttachment", "datatype" : "Attachment, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueAttachment, setTitle"} **/
						, questionnaireresponse.getQstnnrRspnsTmNswrVlttchmntTtchmntSze() /** { "tree" :"QuestionnaireResponse.item.answer.valueAttachment", "datatype" : "Attachment, unsignedInt", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueAttachment, setSize"} **/
						, questionnaireresponse.getQstnnrRspnsTmNswrVlttchmntTtchmntRl() /** { "tree" :"QuestionnaireResponse.item.answer.valueAttachment", "datatype" : "Attachment, url", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueAttachment, setUrl"} **/
						));
Questionnaireresponseobj.setValueCoding(HapiFHIRHelpers.createCoding(questionnaireresponse.getQstnnrRspnsTmNswrVlCdngCSrSlctd() /** { "tree" :"QuestionnaireResponse.item.answer.valueCoding", "datatype" : "Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueCoding, setUserSelected"} **/
						, questionnaireresponse.getQstnnrRspnsTmNswrVlCdngCCde() /** { "tree" :"QuestionnaireResponse.item.answer.valueCoding", "datatype" : "Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueCoding, setCode"} **/
						, questionnaireresponse.getQstnnrRspnsTmNswrVlCdngCVrsn() /** { "tree" :"QuestionnaireResponse.item.answer.valueCoding", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueCoding, setVersion"} **/
						, questionnaireresponse.getQstnnrRspnsTmNswrVlCdngCDsplay() /** { "tree" :"QuestionnaireResponse.item.answer.valueCoding", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueCoding, setDisplay"} **/
						, questionnaireresponse.getQstnnrRspnsTmNswrVlCdngCSstm() /** { "tree" :"QuestionnaireResponse.item.answer.valueCoding", "datatype" : "Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueCoding, setSystem"} **/
						));
Questionnaireresponseobj.setValueQuantity(HapiFHIRHelpers.createQuantity(questionnaireresponse.getQstnnrRspnsTmNswrVlQnttQnttCmprtr() /** { "tree" :"QuestionnaireResponse.item.answer.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueQuantity, setComparator"} **/
						, questionnaireresponse.getQstnnrRspnsTmNswrVlQnttQnttCde() /** { "tree" :"QuestionnaireResponse.item.answer.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueQuantity, setCode"} **/
						, questionnaireresponse.getQstnnrRspnsTmNswrVlQnttQnttVlue() /** { "tree" :"QuestionnaireResponse.item.answer.valueQuantity", "datatype" : "Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueQuantity, setValue"} **/
						, questionnaireresponse.getQstnnrRspnsTmNswrVlQnttQnttNt() /** { "tree" :"QuestionnaireResponse.item.answer.valueQuantity", "datatype" : "Quantity, string", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueQuantity, setUnit"} **/
						, questionnaireresponse.getQstnnrRspnsTmNswrVlQnttQnttSstm() /** { "tree" :"QuestionnaireResponse.item.answer.valueQuantity", "datatype" : "Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueQuantity, setSystem"} **/
						));
Questionnaireresponseobj.setValueReference(any)(HapiFHIRHelpers.createReference(questionnaireresponse.getQstnnrRspnsTmNswrVlRfrncRfrnce() /** { "tree" :"QuestionnaireResponse.item.answer.valueReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "setValueReference(any)"} **/
						));
Questionnaireresponseobj.addItem(HapiFHIRHelpers.createitem(questionnaireresponse.getQstnnrRspnsTmNswrTmTm() /** { "tree" :"QuestionnaireResponse.item.answer.item", "datatype" : "item", "cardinality" : "Many", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "addItem"} **/
						, questionnaireresponse.getQstnnrRspnsTmTmTm() /** { "tree" :"QuestionnaireResponse.item.item", "datatype" : "item", "cardinality" : "Many", "elementtree" : ["addItem", "addAnswer"] , "methodName" : "addItem"} **/
		));
	}
}
