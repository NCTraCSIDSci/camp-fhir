package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Messageheader.
 * @see .Messageheader
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class MessageheaderConversion 
{
	public Patient Messageheaders(main.templateoutput.Model.Messageheader messageheader) 
	{
			Patient  Messageheaderobj = new Patient(); 

						Messageheaderobj.setEventCoding(HapiFHIRHelpers.createCoding(messageheader.getMssgHdrVntCdngCSrSlctd() /** { "tree" :"MessageHeader.eventCoding", "datatype" : "Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setEventCoding, setUserSelected"} **/
						, messageheader.getMessageHeaderEventCodingCCode() /** { "tree" :"MessageHeader.eventCoding", "datatype" : "Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setEventCoding, setCode"} **/
						, messageheader.getMssgHdrVntCdngCVrsn() /** { "tree" :"MessageHeader.eventCoding", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setEventCoding, setVersion"} **/
						, messageheader.getMssgHdrVntCdngCDsplay() /** { "tree" :"MessageHeader.eventCoding", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setEventCoding, setDisplay"} **/
						, messageheader.getMessageHeaderEventCodingCSystem() /** { "tree" :"MessageHeader.eventCoding", "datatype" : "Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setEventCoding, setSystem"} **/
						));
Messageheaderobj.setEventUri(HapiFHIRHelpers.createuri(messageheader.getMessageHeaderEventUriUri() /** { "tree" :"MessageHeader.eventUri", "datatype" : "uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setEventUri"} **/
						));
Messageheaderobj.setName(HapiFHIRHelpers.createstring(messageheader.getMssgHdrDstntnNmStrng() /** { "tree" :"MessageHeader.destination.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addDestination"] , "methodName" : "setName"} **/
						));
Messageheaderobj.setTarget(HapiFHIRHelpers.createReference(messageheader.getMssgHdrDstntnTrgtRfrnce() /** { "tree" :"MessageHeader.destination.target", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addDestination"] , "methodName" : "setTarget"} **/
						));
Messageheaderobj.setEndpoint(HapiFHIRHelpers.createurl(messageheader.getMssgHdrDstntnNdpntRl() /** { "tree" :"MessageHeader.destination.endpoint", "datatype" : "url", "cardinality" : "Required", "elementtree" : ["addDestination"] , "methodName" : "setEndpoint"} **/
						));
Messageheaderobj.setReceiver(HapiFHIRHelpers.createReference(messageheader.getMssgHdrDstntnRcvrRfrnce() /** { "tree" :"MessageHeader.destination.receiver", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addDestination"] , "methodName" : "setReceiver"} **/
						));
Messageheaderobj.setSender(HapiFHIRHelpers.createReference(messageheader.getMessageHeaderSenderReference() /** { "tree" :"MessageHeader.sender", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSender"} **/
						));
Messageheaderobj.setEnterer(HapiFHIRHelpers.createReference(messageheader.getMessageHeaderEntererReference() /** { "tree" :"MessageHeader.enterer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEnterer"} **/
						));
Messageheaderobj.setAuthor(HapiFHIRHelpers.createReference(messageheader.getMessageHeaderAuthorReference() /** { "tree" :"MessageHeader.author", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAuthor"} **/
						));
Messageheaderobj.setName(HapiFHIRHelpers.createstring(messageheader.getMessageHeaderSourceNameString() /** { "tree" :"MessageHeader.source.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSource"] , "methodName" : "setName"} **/
						));
Messageheaderobj.setSoftware(HapiFHIRHelpers.createstring(messageheader.getMssgHdrSrcSftwrStrng() /** { "tree" :"MessageHeader.source.software", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSource"] , "methodName" : "setSoftware"} **/
						));
Messageheaderobj.setVersion(HapiFHIRHelpers.createstring(messageheader.getMssgHdrSrcVrsnStrng() /** { "tree" :"MessageHeader.source.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setSource"] , "methodName" : "setVersion"} **/
						));
Messageheaderobj.setContact(HapiFHIRHelpers.createContactPoint(messageheader.getMssgHdrSrcCntctCntctPntSstm() /** { "tree" :"MessageHeader.source.contact", "datatype" : "ContactPoint, code", "cardinality" : "ZeroOne", "elementtree" : ["setSource"] , "methodName" : "setContact, setSystem"} **/
						, messageheader.getMssgHdrSrcCntctCntctPntSe() /** { "tree" :"MessageHeader.source.contact", "datatype" : "ContactPoint, code", "cardinality" : "ZeroOne", "elementtree" : ["setSource"] , "methodName" : "setContact, setUse"} **/
						, messageheader.getMssgHdrSrcCntctCntctPntPrdPrdStrt() /** { "tree" :"MessageHeader.source.contact", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setSource"] , "methodName" : "setContact, setPeriod, setStart"} **/
						, messageheader.getMssgHdrSrcCntctCntctPntPrdPrdNd() /** { "tree" :"MessageHeader.source.contact", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setSource"] , "methodName" : "setContact, setPeriod, setEnd"} **/
						, messageheader.getMssgHdrSrcCntctCntctPntRnk() /** { "tree" :"MessageHeader.source.contact", "datatype" : "ContactPoint, positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["setSource"] , "methodName" : "setContact, setRank"} **/
						, messageheader.getMssgHdrSrcCntctCntctPntVlue() /** { "tree" :"MessageHeader.source.contact", "datatype" : "ContactPoint, string", "cardinality" : "ZeroOne", "elementtree" : ["setSource"] , "methodName" : "setContact, setValue"} **/
						));
Messageheaderobj.setEndpoint(HapiFHIRHelpers.createurl(messageheader.getMessageHeaderSourceEndpointUrl() /** { "tree" :"MessageHeader.source.endpoint", "datatype" : "url", "cardinality" : "Required", "elementtree" : ["setSource"] , "methodName" : "setEndpoint"} **/
						));
Messageheaderobj.setResponsible(HapiFHIRHelpers.createReference(messageheader.getMssgHdrRspnsblRfrnce() /** { "tree" :"MessageHeader.responsible", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setResponsible"} **/
						));
Messageheaderobj.setReason(HapiFHIRHelpers.createCodeableConcept(messageheader.getMssgHdrRsnCcCdngCSstm() /** { "tree" :"MessageHeader.reason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReason, addCoding, setSystem"} **/
						, messageheader.getMssgHdrRsnCcCdngCVrsn() /** { "tree" :"MessageHeader.reason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReason, addCoding, setVersion"} **/
						, messageheader.getMssgHdrRsnCcCdngCCde() /** { "tree" :"MessageHeader.reason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReason, addCoding, setCode"} **/
						, messageheader.getMssgHdrRsnCcCdngCDsplay() /** { "tree" :"MessageHeader.reason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReason, addCoding, setDisplay"} **/
						, messageheader.getMssgHdrRsnCcCdngCSrSlctd() /** { "tree" :"MessageHeader.reason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReason, addCoding, setUserSelected"} **/
						, messageheader.getMessageHeaderReasonCcText() /** { "tree" :"MessageHeader.reason", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReason, setText"} **/
						));
Messageheaderobj.setIdentifier(HapiFHIRHelpers.createid(messageheader.getMssgHdrRspnsDntfrD() /** { "tree" :"MessageHeader.response.identifier", "datatype" : "id", "cardinality" : "Required", "elementtree" : ["setResponse"] , "methodName" : "setIdentifier"} **/
						));
Messageheaderobj.setCode(HapiFHIRHelpers.createcode(messageheader.getMessageHeaderResponseCodeCode() /** { "tree" :"MessageHeader.response.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["setResponse"] , "methodName" : "setCode"} **/
						));
Messageheaderobj.setDetails(HapiFHIRHelpers.createReference(messageheader.getMssgHdrRspnsDtlsRfrnce() /** { "tree" :"MessageHeader.response.details", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["setResponse"] , "methodName" : "setDetails"} **/
						));
Messageheaderobj.addFocus(HapiFHIRHelpers.createReference(messageheader.getMessageHeaderFocusReference() /** { "tree" :"MessageHeader.focus", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addFocus"} **/
						));
Messageheaderobj.setDefinition(HapiFHIRHelpers.createcanonical(messageheader.getMessageHeaderDefinitionCanonical() /** { "tree" :"MessageHeader.definition", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDefinition"} **/
		));
	}
}
