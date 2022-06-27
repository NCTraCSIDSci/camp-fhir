package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EnrollmentRequest;
public class EnrollmentRequestBidirectionalConversion 
{
	public EnrollmentRequest EnrollmentRequests(org.hl7.fhir.r4.model.EnrollmentRequest enrollmentrequest) throws ParseException
	{
		 main.java.com.campfhir.model.EnrollmentRequest e = new  main.java.com.campfhir.model.EnrollmentRequest();

		/******************** id ********************************************************************************/
		enrollmentrequest.setId(e.getId());

		/******************** EnrollmentRqst_Provider ********************************************************************************/
		if(enrollmentrequest.hasProvider()) {
			e.setEnrollmentRqstProvider(String.valueOf(enrollmentrequest.getProvider()));
		}
		/******************** EnrollmentRqst_Insurer ********************************************************************************/
		if(enrollmentrequest.hasInsurer()) {
			e.setEnrollmentRqstInsurer(String.valueOf(enrollmentrequest.getInsurer()));
		}
		/******************** EnrollmentRqst_Candidate ********************************************************************************/
		if(enrollmentrequest.hasCandidate()) {
			e.setEnrollmentRqstCandidate(String.valueOf(enrollmentrequest.getCandidate()));
		}
		/******************** EnrollmentRqst_Cvg ********************************************************************************/
		if(enrollmentrequest.hasCoverage()) {
			e.setEnrollmentRqstCvg(String.valueOf(enrollmentrequest.getCoverage()));
		}
		/******************** enrollmentrequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.EnrollmentRequest.EnrollmentRequestStatus enrollmentrequeststatus = enrollmentrequest.getStatus();
		e.setEnrollmentRqstSts(enrollmentrequeststatus.toCode());

		/******************** EnrollmentRqst_Created ********************************************************************************/
		if(enrollmentrequest.hasCreated()) {
			e.setEnrollmentRqstCreated(String.valueOf(enrollmentrequest.getCreated()));
		}
		/******************** enrollmentrequestidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier enrollmentrequestidentifier = enrollmentrequest.getIdentifierFirstRep();

		/******************** EnrollmentRqst_Id_Vl ********************************************************************************/
		if(enrollmentrequestidentifier.hasValue()) {
			e.setEnrollmentRqstIdVl(String.valueOf(enrollmentrequestidentifier.getValue()));
		}
		/******************** enrollmentrequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept enrollmentrequestidentifiertype = enrollmentrequestidentifier.getType();

		/******************** EnrollmentRqst_Id_Typ_Txt ********************************************************************************/
		if(enrollmentrequestidentifiertype.hasText()) {
			e.setEnrollmentRqstIdTypTxt(String.valueOf(enrollmentrequestidentifiertype.getText()));
		}
		/******************** enrollmentrequestidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding enrollmentrequestidentifiertypecoding = enrollmentrequestidentifiertype.getCodingFirstRep();

		/******************** EnrollmentRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(enrollmentrequestidentifiertypecoding.hasVersion()) {
			e.setEnrollmentRqstIdTypCdgVrsn(String.valueOf(enrollmentrequestidentifiertypecoding.getVersion()));
		}
		/******************** EnrollmentRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(enrollmentrequestidentifiertypecoding.hasDisplay()) {
			e.setEnrollmentRqstIdTypCdgDsply(String.valueOf(enrollmentrequestidentifiertypecoding.getDisplay()));
		}
		/******************** EnrollmentRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(enrollmentrequestidentifiertypecoding.hasCode()) {
			e.setEnrollmentRqstIdTypCdgCd(String.valueOf(enrollmentrequestidentifiertypecoding.getCode()));
		}
		/******************** EnrollmentRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(enrollmentrequestidentifiertypecoding.hasUserSelected()) {
			e.setEnrollmentRqstIdTypCdgUsrSltd(String.valueOf(enrollmentrequestidentifiertypecoding.getUserSelected()));
		}
		/******************** EnrollmentRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(enrollmentrequestidentifiertypecoding.hasSystem()) {
			e.setEnrollmentRqstIdTypCdgSys(String.valueOf(enrollmentrequestidentifiertypecoding.getSystem()));
		}
		/******************** enrollmentrequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period enrollmentrequestidentifierperiod = enrollmentrequestidentifier.getPeriod();

		/******************** EnrollmentRqst_Id_Prd_Strt ********************************************************************************/
		if(enrollmentrequestidentifierperiod.hasStart()) {
			e.setEnrollmentRqstIdPrdStrt(String.valueOf(enrollmentrequestidentifierperiod.getStart()));
		}
		/******************** EnrollmentRqst_Id_Prd_End ********************************************************************************/
		if(enrollmentrequestidentifierperiod.hasEnd()) {
			e.setEnrollmentRqstIdPrdEnd(String.valueOf(enrollmentrequestidentifierperiod.getEnd()));
		}
		/******************** EnrollmentRqst_Id_Assigner ********************************************************************************/
		if(enrollmentrequestidentifier.hasAssigner()) {
			e.setEnrollmentRqstIdAssigner(String.valueOf(enrollmentrequestidentifier.getAssigner()));
		}
		/******************** EnrollmentRqst_Id_Sys ********************************************************************************/
		if(enrollmentrequestidentifier.hasSystem()) {
			e.setEnrollmentRqstIdSys(String.valueOf(enrollmentrequestidentifier.getSystem()));
		}
		/******************** enrollmentrequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse enrollmentrequestidentifieruse = enrollmentrequestidentifier.getUse();
		e.setEnrollmentRqstIdUse(enrollmentrequestidentifieruse.toCode());

		return e;
	}
}
