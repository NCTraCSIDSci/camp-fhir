package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EnrollmentRequest;
public class EnrollmentRequestConversion 
{
	public org.hl7.fhir.r4.model.EnrollmentRequest EnrollmentRequests(EnrollmentRequest e) throws ParseException
	{
		org.hl7.fhir.r4.model.EnrollmentRequest enrollmentrequest = new org.hl7.fhir.r4.model.EnrollmentRequest();

		/******************** id ********************************************************************************/
		enrollmentrequest.setId(e.getId());

		/******************** EnrollmentRqst_Candidate ********************************************************************************/
		if(e.getEnrollmentRqstCandidate() != null) {
			enrollmentrequest.setCandidate( new org.hl7.fhir.r4.model.Reference(e.getEnrollmentRqstCandidate()));
		}
		/******************** EnrollmentRqst_Cvg ********************************************************************************/
		if(e.getEnrollmentRqstCvg() != null) {
			enrollmentrequest.setCoverage( new org.hl7.fhir.r4.model.Reference(e.getEnrollmentRqstCvg()));
		}
		/******************** EnrollmentRqst_Created ********************************************************************************/
		if(e.getEnrollmentRqstCreated() != null) {
			java.text.SimpleDateFormat EnrollmentRqst_Createdsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EnrollmentRqst_Createddate = EnrollmentRqst_Createdsdf.parse(e.getEnrollmentRqstCreated());
			enrollmentrequest.setCreated(EnrollmentRqst_Createddate);
		}
		/******************** enrollmentrequestidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier enrollmentrequestidentifier =  new org.hl7.fhir.r4.model.Identifier();
		enrollmentrequest.addIdentifier(enrollmentrequestidentifier);

		/******************** EnrollmentRqst_Id_Assigner ********************************************************************************/
		if(e.getEnrollmentRqstIdAssigner() != null) {
			enrollmentrequestidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(e.getEnrollmentRqstIdAssigner()));
		}
		/******************** enrollmentrequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period enrollmentrequestidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		enrollmentrequestidentifier.setPeriod(enrollmentrequestidentifierperiod);

		/******************** EnrollmentRqst_Id_Prd_End ********************************************************************************/
		if(e.getEnrollmentRqstIdPrdEnd() != null) {
			java.text.SimpleDateFormat EnrollmentRqst_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EnrollmentRqst_Id_Prd_Enddate = EnrollmentRqst_Id_Prd_Endsdf.parse(e.getEnrollmentRqstIdPrdEnd());
			enrollmentrequestidentifierperiod.setEnd(EnrollmentRqst_Id_Prd_Enddate);
		}
		/******************** EnrollmentRqst_Id_Prd_Strt ********************************************************************************/
		if(e.getEnrollmentRqstIdPrdStrt() != null) {
			java.text.SimpleDateFormat EnrollmentRqst_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EnrollmentRqst_Id_Prd_Strtdate = EnrollmentRqst_Id_Prd_Strtsdf.parse(e.getEnrollmentRqstIdPrdStrt());
			enrollmentrequestidentifierperiod.setStart(EnrollmentRqst_Id_Prd_Strtdate);
		}
		/******************** EnrollmentRqst_Id_Sys ********************************************************************************/
		if(e.getEnrollmentRqstIdSys() != null) {
			enrollmentrequestidentifier.setSystem(e.getEnrollmentRqstIdSys());
		}
		/******************** enrollmentrequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept enrollmentrequestidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		enrollmentrequestidentifier.setType(enrollmentrequestidentifiertype);

		/******************** enrollmentrequestidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding enrollmentrequestidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		enrollmentrequestidentifiertype.addCoding(enrollmentrequestidentifiertypecoding);

		/******************** EnrollmentRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEnrollmentRqstIdTypCdgCd() != null) {
			enrollmentrequestidentifiertypecoding.setCode(e.getEnrollmentRqstIdTypCdgCd());
		}
		/******************** EnrollmentRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEnrollmentRqstIdTypCdgDsply() != null) {
			enrollmentrequestidentifiertypecoding.setDisplay(e.getEnrollmentRqstIdTypCdgDsply());
		}
		/******************** EnrollmentRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEnrollmentRqstIdTypCdgSys() != null) {
			enrollmentrequestidentifiertypecoding.setSystem(e.getEnrollmentRqstIdTypCdgSys());
		}
		/******************** EnrollmentRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEnrollmentRqstIdTypCdgUsrSltd() != null) {
			enrollmentrequestidentifiertypecoding.setUserSelected(Boolean.parseBoolean(e.getEnrollmentRqstIdTypCdgUsrSltd()));
		}
		/******************** EnrollmentRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEnrollmentRqstIdTypCdgVrsn() != null) {
			enrollmentrequestidentifiertypecoding.setVersion(e.getEnrollmentRqstIdTypCdgVrsn());
		}
		/******************** EnrollmentRqst_Id_Typ_Txt ********************************************************************************/
		if(e.getEnrollmentRqstIdTypTxt() != null) {
			enrollmentrequestidentifiertype.setText(e.getEnrollmentRqstIdTypTxt());
		}
		/******************** enrollmentrequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory enrollmentrequestidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		enrollmentrequestidentifier.setUse(enrollmentrequestidentifieruse.fromCode(e.getEnrollmentRqstIdUse()));

		/******************** EnrollmentRqst_Id_Vl ********************************************************************************/
		if(e.getEnrollmentRqstIdVl() != null) {
			enrollmentrequestidentifier.setValue(e.getEnrollmentRqstIdVl());
		}
		/******************** EnrollmentRqst_Insurer ********************************************************************************/
		if(e.getEnrollmentRqstInsurer() != null) {
			enrollmentrequest.setInsurer( new org.hl7.fhir.r4.model.Reference(e.getEnrollmentRqstInsurer()));
		}
		/******************** EnrollmentRqst_Provider ********************************************************************************/
		if(e.getEnrollmentRqstProvider() != null) {
			enrollmentrequest.setProvider( new org.hl7.fhir.r4.model.Reference(e.getEnrollmentRqstProvider()));
		}
		/******************** enrollmentrequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.EnrollmentRequest.EnrollmentRequestStatusEnumFactory enrollmentrequeststatus =  new org.hl7.fhir.r4.model.EnrollmentRequest.EnrollmentRequestStatusEnumFactory();
		enrollmentrequest.setStatus(enrollmentrequeststatus.fromCode(e.getEnrollmentRqstSts()));

		return enrollmentrequest;
	}
}
