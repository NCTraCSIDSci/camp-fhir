package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EnrollmentResponse;
public class EnrollmentResponseConversion 
{
	public org.hl7.fhir.r4.model.EnrollmentResponse EnrollmentResponses(EnrollmentResponse e) throws ParseException
	{
		org.hl7.fhir.r4.model.EnrollmentResponse enrollmentresponse = new org.hl7.fhir.r4.model.EnrollmentResponse();

		/******************** id ********************************************************************************/
		enrollmentresponse.setId(e.getId());

		/******************** EnrollmentRsps_Created ********************************************************************************/
		if(e.getEnrollmentRspsCreated() != null) {
			java.text.SimpleDateFormat EnrollmentRsps_Createdsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EnrollmentRsps_Createddate = EnrollmentRsps_Createdsdf.parse(e.getEnrollmentRspsCreated());
			enrollmentresponse.setCreated(EnrollmentRsps_Createddate);
		}
		/******************** EnrollmentRsps_Disposition ********************************************************************************/
		if(e.getEnrollmentRspsDisposition() != null) {
			enrollmentresponse.setDisposition(e.getEnrollmentRspsDisposition());
		}
		/******************** enrollmentresponseidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier enrollmentresponseidentifier =  new org.hl7.fhir.r4.model.Identifier();
		enrollmentresponse.addIdentifier(enrollmentresponseidentifier);

		/******************** EnrollmentRsps_Id_Assigner ********************************************************************************/
		if(e.getEnrollmentRspsIdAssigner() != null) {
			enrollmentresponseidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(e.getEnrollmentRspsIdAssigner()));
		}
		/******************** enrollmentresponseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period enrollmentresponseidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		enrollmentresponseidentifier.setPeriod(enrollmentresponseidentifierperiod);

		/******************** EnrollmentRsps_Id_Prd_End ********************************************************************************/
		if(e.getEnrollmentRspsIdPrdEnd() != null) {
			java.text.SimpleDateFormat EnrollmentRsps_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EnrollmentRsps_Id_Prd_Enddate = EnrollmentRsps_Id_Prd_Endsdf.parse(e.getEnrollmentRspsIdPrdEnd());
			enrollmentresponseidentifierperiod.setEnd(EnrollmentRsps_Id_Prd_Enddate);
		}
		/******************** EnrollmentRsps_Id_Prd_Strt ********************************************************************************/
		if(e.getEnrollmentRspsIdPrdStrt() != null) {
			java.text.SimpleDateFormat EnrollmentRsps_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EnrollmentRsps_Id_Prd_Strtdate = EnrollmentRsps_Id_Prd_Strtsdf.parse(e.getEnrollmentRspsIdPrdStrt());
			enrollmentresponseidentifierperiod.setStart(EnrollmentRsps_Id_Prd_Strtdate);
		}
		/******************** EnrollmentRsps_Id_Sys ********************************************************************************/
		if(e.getEnrollmentRspsIdSys() != null) {
			enrollmentresponseidentifier.setSystem(e.getEnrollmentRspsIdSys());
		}
		/******************** enrollmentresponseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept enrollmentresponseidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		enrollmentresponseidentifier.setType(enrollmentresponseidentifiertype);

		/******************** enrollmentresponseidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding enrollmentresponseidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		enrollmentresponseidentifiertype.addCoding(enrollmentresponseidentifiertypecoding);

		/******************** EnrollmentRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEnrollmentRspsIdTypCdgCd() != null) {
			enrollmentresponseidentifiertypecoding.setCode(e.getEnrollmentRspsIdTypCdgCd());
		}
		/******************** EnrollmentRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEnrollmentRspsIdTypCdgDsply() != null) {
			enrollmentresponseidentifiertypecoding.setDisplay(e.getEnrollmentRspsIdTypCdgDsply());
		}
		/******************** EnrollmentRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEnrollmentRspsIdTypCdgSys() != null) {
			enrollmentresponseidentifiertypecoding.setSystem(e.getEnrollmentRspsIdTypCdgSys());
		}
		/******************** EnrollmentRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEnrollmentRspsIdTypCdgUsrSltd() != null) {
			enrollmentresponseidentifiertypecoding.setUserSelected(Boolean.parseBoolean(e.getEnrollmentRspsIdTypCdgUsrSltd()));
		}
		/******************** EnrollmentRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEnrollmentRspsIdTypCdgVrsn() != null) {
			enrollmentresponseidentifiertypecoding.setVersion(e.getEnrollmentRspsIdTypCdgVrsn());
		}
		/******************** EnrollmentRsps_Id_Typ_Txt ********************************************************************************/
		if(e.getEnrollmentRspsIdTypTxt() != null) {
			enrollmentresponseidentifiertype.setText(e.getEnrollmentRspsIdTypTxt());
		}
		/******************** enrollmentresponseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory enrollmentresponseidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		enrollmentresponseidentifier.setUse(enrollmentresponseidentifieruse.fromCode(e.getEnrollmentRspsIdUse()));

		/******************** EnrollmentRsps_Id_Vl ********************************************************************************/
		if(e.getEnrollmentRspsIdVl() != null) {
			enrollmentresponseidentifier.setValue(e.getEnrollmentRspsIdVl());
		}
		/******************** EnrollmentRsps_Orgnztn ********************************************************************************/
		if(e.getEnrollmentRspsOrgnztn() != null) {
			enrollmentresponse.setOrganization( new org.hl7.fhir.r4.model.Reference(e.getEnrollmentRspsOrgnztn()));
		}
		/******************** enrollmentresponseoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.RemittanceOutcomeEnumFactory enrollmentresponseoutcome =  new org.hl7.fhir.r4.model.Enumerations.RemittanceOutcomeEnumFactory();
		enrollmentresponse.setOutcome(enrollmentresponseoutcome.fromCode(e.getEnrollmentRspsOutcome()));

		/******************** EnrollmentRsps_Rqst ********************************************************************************/
		if(e.getEnrollmentRspsRqst() != null) {
			enrollmentresponse.setRequest( new org.hl7.fhir.r4.model.Reference(e.getEnrollmentRspsRqst()));
		}
		/******************** EnrollmentRsps_RqstProvider ********************************************************************************/
		if(e.getEnrollmentRspsRqstProvider() != null) {
			enrollmentresponse.setRequestProvider( new org.hl7.fhir.r4.model.Reference(e.getEnrollmentRspsRqstProvider()));
		}
		/******************** enrollmentresponsestatus ********************************************************************************/
		org.hl7.fhir.r4.model.EnrollmentResponse.EnrollmentResponseStatusEnumFactory enrollmentresponsestatus =  new org.hl7.fhir.r4.model.EnrollmentResponse.EnrollmentResponseStatusEnumFactory();
		enrollmentresponse.setStatus(enrollmentresponsestatus.fromCode(e.getEnrollmentRspsSts()));

		return enrollmentresponse;
	}
}
