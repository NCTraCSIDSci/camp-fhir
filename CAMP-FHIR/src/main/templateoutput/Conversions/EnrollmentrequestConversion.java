package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Enrollmentrequest.
 * @see .Enrollmentrequest
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class EnrollmentrequestConversion 
{
	public Patient Enrollmentrequests(main.templateoutput.Model.Enrollmentrequest enrollmentrequest) 
	{
			Patient  Enrollmentrequestobj = new Patient(); 

						Enrollmentrequestobj.addIdentifier(HapiFHIRHelpers.createIdentifier(enrollmentrequest.getEnrllmntRqstDntfrDntfrSe() /** { "tree" :"EnrollmentRequest.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, enrollmentrequest.getEnrllmntRqstDntfrDntfrTpCcCSstm() /** { "tree" :"EnrollmentRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, enrollmentrequest.getEnrllmntRqstDntfrDntfrTpCcCVrsn() /** { "tree" :"EnrollmentRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, enrollmentrequest.getEnrllmntRqstDntfrDntfrTpCcCCde() /** { "tree" :"EnrollmentRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, enrollmentrequest.getEnrllmntRqstDntfrDntfrTpCcCDsplay() /** { "tree" :"EnrollmentRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, enrollmentrequest.getEnrllmntRqstDntfrDntfrTpCcCSrSlctd() /** { "tree" :"EnrollmentRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, enrollmentrequest.getEnrllmntRqstDntfrDntfrTpCcTxt() /** { "tree" :"EnrollmentRequest.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, enrollmentrequest.getEnrllmntRqstDntfrDntfrPrdPrdStrt() /** { "tree" :"EnrollmentRequest.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, enrollmentrequest.getEnrllmntRqstDntfrDntfrPrdPrdNd() /** { "tree" :"EnrollmentRequest.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, enrollmentrequest.getEnrllmntRqstDntfrDntfrSsgnr() /** { "tree" :"EnrollmentRequest.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, enrollmentrequest.getEnrllmntRqstDntfrDntfrVlue() /** { "tree" :"EnrollmentRequest.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, enrollmentrequest.getEnrllmntRqstDntfrDntfrSstm() /** { "tree" :"EnrollmentRequest.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Enrollmentrequestobj.setStatus(HapiFHIRHelpers.createcode(enrollmentrequest.getEnrollmentRequestStatusCode() /** { "tree" :"EnrollmentRequest.status", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Enrollmentrequestobj.setCreated(HapiFHIRHelpers.createdateTime(enrollmentrequest.getEnrollmentRequestCreatedDateTime() /** { "tree" :"EnrollmentRequest.created", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCreated"} **/
						));
Enrollmentrequestobj.setInsurer(HapiFHIRHelpers.createReference(enrollmentrequest.getEnrllmntRqstNsrrRfrnce() /** { "tree" :"EnrollmentRequest.insurer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setInsurer"} **/
						));
Enrollmentrequestobj.setProvider(HapiFHIRHelpers.createReference(enrollmentrequest.getEnrllmntRqstPrvdrRfrnce() /** { "tree" :"EnrollmentRequest.provider", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProvider"} **/
						));
Enrollmentrequestobj.setCandidate(HapiFHIRHelpers.createReference(enrollmentrequest.getEnrllmntRqstCnddtRfrnce() /** { "tree" :"EnrollmentRequest.candidate", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCandidate"} **/
						));
Enrollmentrequestobj.setCoverage(HapiFHIRHelpers.createReference(enrollmentrequest.getEnrllmntRqstCvrgRfrnce() /** { "tree" :"EnrollmentRequest.coverage", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCoverage"} **/
		));
	}
}
