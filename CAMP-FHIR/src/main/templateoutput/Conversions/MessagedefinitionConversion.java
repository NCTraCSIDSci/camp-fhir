package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Messagedefinition.
 * @see .Messagedefinition
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class MessagedefinitionConversion 
{
	public Patient Messagedefinitions(main.templateoutput.Model.Messagedefinition messagedefinition) 
	{
			Patient  Messagedefinitionobj = new Patient(); 

						Messagedefinitionobj.setUrl(HapiFHIRHelpers.createuri(messagedefinition.getMessageDefinitionUrlUri() /** { "tree" :"MessageDefinition.url", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Messagedefinitionobj.addIdentifier(HapiFHIRHelpers.createIdentifier(messagedefinition.getMssgDfntnDntfrDntfrSe() /** { "tree" :"MessageDefinition.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, messagedefinition.getMssgDfntnDntfrDntfrTpCcCSstm() /** { "tree" :"MessageDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, messagedefinition.getMssgDfntnDntfrDntfrTpCcCVrsn() /** { "tree" :"MessageDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, messagedefinition.getMssgDfntnDntfrDntfrTpCcCCde() /** { "tree" :"MessageDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, messagedefinition.getMssgDfntnDntfrDntfrTpCcCDsplay() /** { "tree" :"MessageDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, messagedefinition.getMssgDfntnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"MessageDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, messagedefinition.getMssgDfntnDntfrDntfrTpCcTxt() /** { "tree" :"MessageDefinition.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, messagedefinition.getMssgDfntnDntfrDntfrPrdPrdStrt() /** { "tree" :"MessageDefinition.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, messagedefinition.getMssgDfntnDntfrDntfrPrdPrdNd() /** { "tree" :"MessageDefinition.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, messagedefinition.getMssgDfntnDntfrDntfrSsgnr() /** { "tree" :"MessageDefinition.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, messagedefinition.getMssgDfntnDntfrDntfrVlue() /** { "tree" :"MessageDefinition.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, messagedefinition.getMssgDfntnDntfrDntfrSstm() /** { "tree" :"MessageDefinition.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Messagedefinitionobj.setVersion(HapiFHIRHelpers.createstring(messagedefinition.getMessageDefinitionVersionString() /** { "tree" :"MessageDefinition.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Messagedefinitionobj.setName(HapiFHIRHelpers.createstring(messagedefinition.getMessageDefinitionNameString() /** { "tree" :"MessageDefinition.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Messagedefinitionobj.setTitle(HapiFHIRHelpers.createstring(messagedefinition.getMessageDefinitionTitleString() /** { "tree" :"MessageDefinition.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Messagedefinitionobj.addReplaces(HapiFHIRHelpers.createcanonical(messagedefinition.getMssgDfntnRplcsCnncl() /** { "tree" :"MessageDefinition.replaces", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReplaces"} **/
						));
Messagedefinitionobj.setStatus(HapiFHIRHelpers.createcode(messagedefinition.getMessageDefinitionStatusCode() /** { "tree" :"MessageDefinition.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Messagedefinitionobj.setExperimental(HapiFHIRHelpers.createboolean(messagedefinition.getMssgDfntnXprmntlBln() /** { "tree" :"MessageDefinition.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Messagedefinitionobj.setDate(HapiFHIRHelpers.createdateTime(messagedefinition.getMessageDefinitionDateDateTime() /** { "tree" :"MessageDefinition.date", "datatype" : "dateTime", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Messagedefinitionobj.setPublisher(HapiFHIRHelpers.createstring(messagedefinition.getMessageDefinitionPublisherString() /** { "tree" :"MessageDefinition.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Messagedefinitionobj.addContact(HapiFHIRHelpers.createContactDetail(messagedefinition.getMssgDfntnCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"MessageDefinition.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, messagedefinition.getMssgDfntnCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"MessageDefinition.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, messagedefinition.getMssgDfntnCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"MessageDefinition.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, messagedefinition.getMssgDfntnCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"MessageDefinition.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, messagedefinition.getMssgDfntnCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"MessageDefinition.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, messagedefinition.getMssgDfntnCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"MessageDefinition.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, messagedefinition.getMssgDfntnCntctCntctDtlNme() /** { "tree" :"MessageDefinition.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Messagedefinitionobj.setDescription(HapiFHIRHelpers.createmarkdown(messagedefinition.getMssgDfntnDscrptnMrkdwn() /** { "tree" :"MessageDefinition.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Messagedefinitionobj.addUseContext(HapiFHIRHelpers.createUsageContext(messagedefinition.getMssgDfntnSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"MessageDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, messagedefinition.getMssgDfntnSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"MessageDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, messagedefinition.getMssgDfntnSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"MessageDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, messagedefinition.getMssgDfntnSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"MessageDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, messagedefinition.getMssgDfntnSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"MessageDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, messagedefinition.getMssgDfntnSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"MessageDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, messagedefinition.getMssgDfntnSCntxtSgCntxtCdCSstm() /** { "tree" :"MessageDefinition.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, messagedefinition.getMssgDfntnSCntxtSgCntxtCdCVrsn() /** { "tree" :"MessageDefinition.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, messagedefinition.getMssgDfntnSCntxtSgCntxtCdCCde() /** { "tree" :"MessageDefinition.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, messagedefinition.getMssgDfntnSCntxtSgCntxtCdCDsplay() /** { "tree" :"MessageDefinition.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, messagedefinition.getMssgDfntnSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"MessageDefinition.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, messagedefinition.getMssgDfntnSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"MessageDefinition.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, messagedefinition.getMssgDfntnSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"MessageDefinition.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, messagedefinition.getMssgDfntnSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"MessageDefinition.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, messagedefinition.getMssgDfntnSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"MessageDefinition.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, messagedefinition.getMssgDfntnSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"MessageDefinition.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, messagedefinition.getMssgDfntnSCntxtSgCntxtVlRngRngLw() /** { "tree" :"MessageDefinition.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, messagedefinition.getMssgDfntnSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"MessageDefinition.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, messagedefinition.getMssgDfntnSCntxtSgCntxtVlRfrnce() /** { "tree" :"MessageDefinition.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Messagedefinitionobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(messagedefinition.getMssgDfntnJrsdctnCcCdngCSstm() /** { "tree" :"MessageDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, messagedefinition.getMssgDfntnJrsdctnCcCdngCVrsn() /** { "tree" :"MessageDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, messagedefinition.getMssgDfntnJrsdctnCcCdngCCde() /** { "tree" :"MessageDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, messagedefinition.getMssgDfntnJrsdctnCcCdngCDsplay() /** { "tree" :"MessageDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, messagedefinition.getMssgDfntnJrsdctnCcCdngCSrSlctd() /** { "tree" :"MessageDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, messagedefinition.getMssgDfntnJrsdctnCcTxt() /** { "tree" :"MessageDefinition.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Messagedefinitionobj.setPurpose(HapiFHIRHelpers.createmarkdown(messagedefinition.getMessageDefinitionPurposeMarkdown() /** { "tree" :"MessageDefinition.purpose", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPurpose"} **/
						));
Messagedefinitionobj.setCopyright(HapiFHIRHelpers.createmarkdown(messagedefinition.getMssgDfntnCprghtMrkdwn() /** { "tree" :"MessageDefinition.copyright", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCopyright"} **/
						));
Messagedefinitionobj.setBase(HapiFHIRHelpers.createcanonical(messagedefinition.getMessageDefinitionBaseCanonical() /** { "tree" :"MessageDefinition.base", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBase"} **/
						));
Messagedefinitionobj.addParent(HapiFHIRHelpers.createcanonical(messagedefinition.getMessageDefinitionParentCanonical() /** { "tree" :"MessageDefinition.parent", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addParent"} **/
						));
Messagedefinitionobj.setEventCoding(HapiFHIRHelpers.createCoding(messagedefinition.getMssgDfntnVntCdngCSrSlctd() /** { "tree" :"MessageDefinition.eventCoding", "datatype" : "Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setEventCoding, setUserSelected"} **/
						, messagedefinition.getMssgDfntnVntCdngCCde() /** { "tree" :"MessageDefinition.eventCoding", "datatype" : "Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setEventCoding, setCode"} **/
						, messagedefinition.getMssgDfntnVntCdngCVrsn() /** { "tree" :"MessageDefinition.eventCoding", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setEventCoding, setVersion"} **/
						, messagedefinition.getMssgDfntnVntCdngCDsplay() /** { "tree" :"MessageDefinition.eventCoding", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setEventCoding, setDisplay"} **/
						, messagedefinition.getMssgDfntnVntCdngCSstm() /** { "tree" :"MessageDefinition.eventCoding", "datatype" : "Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setEventCoding, setSystem"} **/
						));
Messagedefinitionobj.setEventUri(HapiFHIRHelpers.createuri(messagedefinition.getMessageDefinitionEventUriUri() /** { "tree" :"MessageDefinition.eventUri", "datatype" : "uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setEventUri"} **/
						));
Messagedefinitionobj.setCategory(HapiFHIRHelpers.createcode(messagedefinition.getMessageDefinitionCategoryCode() /** { "tree" :"MessageDefinition.category", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory"} **/
						));
Messagedefinitionobj.setCode(HapiFHIRHelpers.createcode(messagedefinition.getMessageDefinitionFocusCodeCode() /** { "tree" :"MessageDefinition.focus.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addFocus"] , "methodName" : "setCode"} **/
						));
Messagedefinitionobj.setProfile(HapiFHIRHelpers.createcanonical(messagedefinition.getMssgDfntnFcsPrflCnncl() /** { "tree" :"MessageDefinition.focus.profile", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : ["addFocus"] , "methodName" : "setProfile"} **/
						));
Messagedefinitionobj.setMin(HapiFHIRHelpers.createunsignedInt(messagedefinition.getMssgDfntnFcsMnNsgndnt() /** { "tree" :"MessageDefinition.focus.min", "datatype" : "unsignedInt", "cardinality" : "Required", "elementtree" : ["addFocus"] , "methodName" : "setMin"} **/
						));
Messagedefinitionobj.setMax(HapiFHIRHelpers.createstring(messagedefinition.getMessageDefinitionFocusMaxString() /** { "tree" :"MessageDefinition.focus.max", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addFocus"] , "methodName" : "setMax"} **/
						));
Messagedefinitionobj.setResponseRequired(HapiFHIRHelpers.createcode(messagedefinition.getMssgDfntnRspnsRqrdCde() /** { "tree" :"MessageDefinition.responseRequired", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setResponseRequired"} **/
						));
Messagedefinitionobj.setMessage(HapiFHIRHelpers.createcanonical(messagedefinition.getMssgDfntnLlwdRspnsMssgCnncl() /** { "tree" :"MessageDefinition.allowedResponse.message", "datatype" : "canonical", "cardinality" : "Required", "elementtree" : ["addAllowedResponse"] , "methodName" : "setMessage"} **/
						));
Messagedefinitionobj.setSituation(HapiFHIRHelpers.createmarkdown(messagedefinition.getMssgDfntnLlwdRspnsSttnMrkdwn() /** { "tree" :"MessageDefinition.allowedResponse.situation", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : ["addAllowedResponse"] , "methodName" : "setSituation"} **/
						));
Messagedefinitionobj.addGraph(HapiFHIRHelpers.createcanonical(messagedefinition.getMessageDefinitionGraphCanonical() /** { "tree" :"MessageDefinition.graph", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addGraph"} **/
		));
	}
}
