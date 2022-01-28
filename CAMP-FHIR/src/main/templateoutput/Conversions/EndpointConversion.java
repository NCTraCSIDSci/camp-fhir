package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Endpoint.
 * @see .Endpoint
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class EndpointConversion 
{
	public Patient Endpoints(main.templateoutput.Model.Endpoint endpoint) 
	{
			Patient  Endpointobj = new Patient(); 

						Endpointobj.addIdentifier(HapiFHIRHelpers.createIdentifier(endpoint.getEndpointIdentifierIdentifierUse() /** { "tree" :"Endpoint.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, endpoint.getEndpntDntfrDntfrTpCcCSstm() /** { "tree" :"Endpoint.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, endpoint.getEndpntDntfrDntfrTpCcCVrsn() /** { "tree" :"Endpoint.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, endpoint.getEndpntDntfrDntfrTpCcCCde() /** { "tree" :"Endpoint.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, endpoint.getEndpntDntfrDntfrTpCcCDsplay() /** { "tree" :"Endpoint.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, endpoint.getEndpntDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Endpoint.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, endpoint.getEndpntDntfrDntfrTpCcTxt() /** { "tree" :"Endpoint.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, endpoint.getEndpntDntfrDntfrPrdPrdStrt() /** { "tree" :"Endpoint.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, endpoint.getEndpntDntfrDntfrPrdPrdNd() /** { "tree" :"Endpoint.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, endpoint.getEndpntDntfrDntfrSsgnr() /** { "tree" :"Endpoint.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, endpoint.getEndpntDntfrDntfrVlue() /** { "tree" :"Endpoint.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, endpoint.getEndpntDntfrDntfrSstm() /** { "tree" :"Endpoint.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Endpointobj.setStatus(HapiFHIRHelpers.createcode(endpoint.getEndpointStatusCode() /** { "tree" :"Endpoint.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Endpointobj.setConnectionType(HapiFHIRHelpers.createCoding(endpoint.getEndpntCnnctnTpCSrSlctd() /** { "tree" :"Endpoint.connectionType", "datatype" : "Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setConnectionType, setUserSelected"} **/
						, endpoint.getEndpointConnectionTypeCCode() /** { "tree" :"Endpoint.connectionType", "datatype" : "Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setConnectionType, setCode"} **/
						, endpoint.getEndpointConnectionTypeCVersion() /** { "tree" :"Endpoint.connectionType", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setConnectionType, setVersion"} **/
						, endpoint.getEndpointConnectionTypeCDisplay() /** { "tree" :"Endpoint.connectionType", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setConnectionType, setDisplay"} **/
						, endpoint.getEndpointConnectionTypeCSystem() /** { "tree" :"Endpoint.connectionType", "datatype" : "Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setConnectionType, setSystem"} **/
						));
Endpointobj.setName(HapiFHIRHelpers.createstring(endpoint.getEndpointNameString() /** { "tree" :"Endpoint.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Endpointobj.setManagingOrganization(HapiFHIRHelpers.createReference(endpoint.getEndpntMngngrgnztnRfrnce() /** { "tree" :"Endpoint.managingOrganization", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setManagingOrganization"} **/
						));
Endpointobj.addContact(HapiFHIRHelpers.createContactPoint(endpoint.getEndpntCntctCntctPntSstm() /** { "tree" :"Endpoint.contact", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setSystem"} **/
						, endpoint.getEndpointContactContactPointUse() /** { "tree" :"Endpoint.contact", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setUse"} **/
						, endpoint.getEndpntCntctCntctPntPrdPrdStrt() /** { "tree" :"Endpoint.contact", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setPeriod, setStart"} **/
						, endpoint.getEndpntCntctCntctPntPrdPrdNd() /** { "tree" :"Endpoint.contact", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setPeriod, setEnd"} **/
						, endpoint.getEndpointContactContactPointRank() /** { "tree" :"Endpoint.contact", "datatype" : "ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setRank"} **/
						, endpoint.getEndpntCntctCntctPntVlue() /** { "tree" :"Endpoint.contact", "datatype" : "ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setValue"} **/
						));
Endpointobj.setPeriod(HapiFHIRHelpers.createPeriod(endpoint.getEndpointPeriodPeriodStart() /** { "tree" :"Endpoint.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setStart"} **/
						, endpoint.getEndpointPeriodPeriodEnd() /** { "tree" :"Endpoint.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setEnd"} **/
						));
Endpointobj.setPayloadType(HapiFHIRHelpers.createCodeableConcept(endpoint.getEndpntPldTpCcCdngCSstm() /** { "tree" :"Endpoint.payloadType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPayloadType, addCoding, setSystem"} **/
						, endpoint.getEndpntPldTpCcCdngCVrsn() /** { "tree" :"Endpoint.payloadType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPayloadType, addCoding, setVersion"} **/
						, endpoint.getEndpntPldTpCcCdngCCde() /** { "tree" :"Endpoint.payloadType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPayloadType, addCoding, setCode"} **/
						, endpoint.getEndpntPldTpCcCdngCDsplay() /** { "tree" :"Endpoint.payloadType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPayloadType, addCoding, setDisplay"} **/
						, endpoint.getEndpntPldTpCcCdngCSrSlctd() /** { "tree" :"Endpoint.payloadType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPayloadType, addCoding, setUserSelected"} **/
						, endpoint.getEndpointPayloadTypeCcText() /** { "tree" :"Endpoint.payloadType", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPayloadType, setText"} **/
						));
Endpointobj.addPayloadMimeType(HapiFHIRHelpers.createcode(endpoint.getEndpointPayloadMimeTypeCode() /** { "tree" :"Endpoint.payloadMimeType", "datatype" : "code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPayloadMimeType"} **/
						));
Endpointobj.setAddress(HapiFHIRHelpers.createurl(endpoint.getEndpointAddressUrl() /** { "tree" :"Endpoint.address", "datatype" : "url", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setAddress"} **/
						));
Endpointobj.addHeader(HapiFHIRHelpers.createstring(endpoint.getEndpointHeaderString() /** { "tree" :"Endpoint.header", "datatype" : "string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addHeader"} **/
		));
	}
}
