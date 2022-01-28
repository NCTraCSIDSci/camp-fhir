package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Enrollmentresponse.
 * @see .Enrollmentresponse
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class EnrollmentresponseConversion 
{
	public Patient Enrollmentresponses(main.templateoutput.Model.Enrollmentresponse enrollmentresponse) 
	{
			Patient  Enrollmentresponseobj = new Patient(); 

						Enrollmentresponseobj.addIdentifier(HapiFHIRHelpers.createIdentifier(enrollmentresponse.getEnrllmntRspnsDntfrDntfrSe() /** { "tree" :"EnrollmentResponse.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, enrollmentresponse.getEnrllmntRspnsDntfrDntfrTpCcCSstm() /** { "tree" :"EnrollmentResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, enrollmentresponse.getEnrllmntRspnsDntfrDntfrTpCcCVrsn() /** { "tree" :"EnrollmentResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, enrollmentresponse.getEnrllmntRspnsDntfrDntfrTpCcCCde() /** { "tree" :"EnrollmentResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, enrollmentresponse.getEnrllmntRspnsDntfrDntfrTpCcCDsplay() /** { "tree" :"EnrollmentResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, enrollmentresponse.getEnrllmntRspnsDntfrDntfrTpCcCSrSlctd() /** { "tree" :"EnrollmentResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, enrollmentresponse.getEnrllmntRspnsDntfrDntfrTpCcTxt() /** { "tree" :"EnrollmentResponse.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, enrollmentresponse.getEnrllmntRspnsDntfrDntfrPrdPrdStrt() /** { "tree" :"EnrollmentResponse.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, enrollmentresponse.getEnrllmntRspnsDntfrDntfrPrdPrdNd() /** { "tree" :"EnrollmentResponse.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, enrollmentresponse.getEnrllmntRspnsDntfrDntfrSsgnr() /** { "tree" :"EnrollmentResponse.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, enrollmentresponse.getEnrllmntRspnsDntfrDntfrVlue() /** { "tree" :"EnrollmentResponse.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, enrollmentresponse.getEnrllmntRspnsDntfrDntfrSstm() /** { "tree" :"EnrollmentResponse.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Enrollmentresponseobj.setStatus(HapiFHIRHelpers.createcode(enrollmentresponse.getEnrollmentResponseStatusCode() /** { "tree" :"EnrollmentResponse.status", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Enrollmentresponseobj.setRequest(HapiFHIRHelpers.createReference(enrollmentresponse.getEnrllmntRspnsRqstRfrnce() /** { "tree" :"EnrollmentResponse.request", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequest"} **/
						));
Enrollmentresponseobj.setOutcome(HapiFHIRHelpers.createcode(enrollmentresponse.getEnrollmentResponseOutcomeCode() /** { "tree" :"EnrollmentResponse.outcome", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOutcome"} **/
						));
Enrollmentresponseobj.setDisposition(HapiFHIRHelpers.createstring(enrollmentresponse.getEnrllmntRspnsDspstnStrng() /** { "tree" :"EnrollmentResponse.disposition", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDisposition"} **/
						));
Enrollmentresponseobj.setCreated(HapiFHIRHelpers.createdateTime(enrollmentresponse.getEnrllmntRspnsCrtdDtTme() /** { "tree" :"EnrollmentResponse.created", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCreated"} **/
						));
Enrollmentresponseobj.setOrganization(HapiFHIRHelpers.createReference(enrollmentresponse.getEnrllmntRspnsRgnztnRfrnce() /** { "tree" :"EnrollmentResponse.organization", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOrganization"} **/
						));
Enrollmentresponseobj.setRequestProvider(HapiFHIRHelpers.createReference(enrollmentresponse.getEnrllmntRspnsRqstPrvdrRfrnce() /** { "tree" :"EnrollmentResponse.requestProvider", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequestProvider"} **/
		));
	}
}
