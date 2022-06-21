package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EnrollmentResponse;
public class EnrollmentResponseBidirectionalConversion 
{
	public EnrollmentResponse EnrollmentResponses(org.hl7.fhir.r4.model.EnrollmentResponse enrollmentresponse) throws ParseException
	{
		 main.java.com.campfhir.model.EnrollmentResponse e = new  main.java.com.campfhir.model.EnrollmentResponse();

		/******************** id ********************************************************************************/
		enrollmentresponse.setId(e.getId());

		/******************** enrollmentresponsestatus ********************************************************************************/
		org.hl7.fhir.r4.model.EnrollmentResponse.EnrollmentResponseStatus enrollmentresponsestatus = enrollmentresponse.getStatus();
		e.setEnrollmentRspsSts(enrollmentresponsestatus.toCode());

		/******************** EnrollmentRsps_Created ********************************************************************************/
		if(enrollmentresponse.hasCreated()) {
			e.setEnrollmentRspsCreated(String.valueOf(enrollmentresponse.getCreated()));
		}
		/******************** EnrollmentRsps_Disposition ********************************************************************************/
		if(enrollmentresponse.hasDisposition()) {
			e.setEnrollmentRspsDisposition(String.valueOf(enrollmentresponse.getDisposition()));
		}
		/******************** EnrollmentRsps_Rqst ********************************************************************************/
		if(enrollmentresponse.hasRequest()) {
			e.setEnrollmentRspsRqst(String.valueOf(enrollmentresponse.getRequest()));
		}
		/******************** enrollmentresponseoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.RemittanceOutcome enrollmentresponseoutcome = enrollmentresponse.getOutcome();
		e.setEnrollmentRspsOutcome(enrollmentresponseoutcome.toCode());

		/******************** EnrollmentRsps_Orgnztn ********************************************************************************/
		if(enrollmentresponse.hasOrganization()) {
			e.setEnrollmentRspsOrgnztn(String.valueOf(enrollmentresponse.getOrganization()));
		}
		/******************** enrollmentresponseidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier enrollmentresponseidentifier = enrollmentresponse.getIdentifierFirstRep();

		/******************** EnrollmentRsps_Id_Vl ********************************************************************************/
		if(enrollmentresponseidentifier.hasValue()) {
			e.setEnrollmentRspsIdVl(String.valueOf(enrollmentresponseidentifier.getValue()));
		}
		/******************** enrollmentresponseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept enrollmentresponseidentifiertype = enrollmentresponseidentifier.getType();

		/******************** enrollmentresponseidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding enrollmentresponseidentifiertypecoding = enrollmentresponseidentifiertype.getCodingFirstRep();

		/******************** EnrollmentRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(enrollmentresponseidentifiertypecoding.hasDisplay()) {
			e.setEnrollmentRspsIdTypCdgDsply(String.valueOf(enrollmentresponseidentifiertypecoding.getDisplay()));
		}
		/******************** EnrollmentRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(enrollmentresponseidentifiertypecoding.hasVersion()) {
			e.setEnrollmentRspsIdTypCdgVrsn(String.valueOf(enrollmentresponseidentifiertypecoding.getVersion()));
		}
		/******************** EnrollmentRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(enrollmentresponseidentifiertypecoding.hasCode()) {
			e.setEnrollmentRspsIdTypCdgCd(String.valueOf(enrollmentresponseidentifiertypecoding.getCode()));
		}
		/******************** EnrollmentRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(enrollmentresponseidentifiertypecoding.hasSystem()) {
			e.setEnrollmentRspsIdTypCdgSys(String.valueOf(enrollmentresponseidentifiertypecoding.getSystem()));
		}
		/******************** EnrollmentRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(enrollmentresponseidentifiertypecoding.hasUserSelected()) {
			e.setEnrollmentRspsIdTypCdgUsrSltd(String.valueOf(enrollmentresponseidentifiertypecoding.getUserSelected()));
		}
		/******************** EnrollmentRsps_Id_Typ_Txt ********************************************************************************/
		if(enrollmentresponseidentifiertype.hasText()) {
			e.setEnrollmentRspsIdTypTxt(String.valueOf(enrollmentresponseidentifiertype.getText()));
		}
		/******************** EnrollmentRsps_Id_Sys ********************************************************************************/
		if(enrollmentresponseidentifier.hasSystem()) {
			e.setEnrollmentRspsIdSys(String.valueOf(enrollmentresponseidentifier.getSystem()));
		}
		/******************** EnrollmentRsps_Id_Assigner ********************************************************************************/
		if(enrollmentresponseidentifier.hasAssigner()) {
			e.setEnrollmentRspsIdAssigner(String.valueOf(enrollmentresponseidentifier.getAssigner()));
		}
		/******************** enrollmentresponseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period enrollmentresponseidentifierperiod = enrollmentresponseidentifier.getPeriod();

		/******************** EnrollmentRsps_Id_Prd_End ********************************************************************************/
		if(enrollmentresponseidentifierperiod.hasEnd()) {
			e.setEnrollmentRspsIdPrdEnd(String.valueOf(enrollmentresponseidentifierperiod.getEnd()));
		}
		/******************** EnrollmentRsps_Id_Prd_Strt ********************************************************************************/
		if(enrollmentresponseidentifierperiod.hasStart()) {
			e.setEnrollmentRspsIdPrdStrt(String.valueOf(enrollmentresponseidentifierperiod.getStart()));
		}
		/******************** enrollmentresponseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse enrollmentresponseidentifieruse = enrollmentresponseidentifier.getUse();
		e.setEnrollmentRspsIdUse(enrollmentresponseidentifieruse.toCode());

		/******************** EnrollmentRsps_RqstProvider ********************************************************************************/
		if(enrollmentresponse.hasRequestProvider()) {
			e.setEnrollmentRspsRqstProvider(String.valueOf(enrollmentresponse.getRequestProvider()));
		}
		return e;
	}
}
