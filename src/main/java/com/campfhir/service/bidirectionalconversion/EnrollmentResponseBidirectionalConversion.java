package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EnrollmentResponse;
public class EnrollmentResponseBidirectionalConversion 
{
	public EnrollmentResponse EnrollmentResponses(org.hl7.fhir.r4.model.EnrollmentResponse enrollmentresponse) throws ParseException
	{
		 main.java.com.campfhir.model.EnrollmentResponse e = new  main.java.com.campfhir.model.EnrollmentResponse();

		/******************** id ********************************************************************************/
		e.setId(enrollmentresponse.getIdElement().getIdPart());

		/******************** enrollmentresponsestatus ********************************************************************************/
		org.hl7.fhir.r4.model.EnrollmentResponse.EnrollmentResponseStatus enrollmentresponsestatus = enrollmentresponse.getStatus();
		if(enrollmentresponsestatus!=null) {
			e.addEnrollmentRspsSts(enrollmentresponsestatus.toCode());
		} else {
			e.addEnrollmentRspsSts("NULL");
		}

		/******************** EnrollmentRsps_Created ********************************************************************************/
		if(enrollmentresponse.hasCreated()) {

			e.addEnrollmentRspsCreated("\""+ca.uhn.fhir.util.DateUtils.formatDate(enrollmentresponse.getCreated())+"\"");
		} else {
			e.addEnrollmentRspsCreated("NULL");
		}


		/******************** EnrollmentRsps_Rqst ********************************************************************************/
		if(enrollmentresponse.hasRequest()) {

			if(enrollmentresponse.getRequest().getReference() != null) {
			e.addEnrollmentRspsRqst(enrollmentresponse.getRequest().getReference());
			}
		} else {
			e.addEnrollmentRspsRqst("NULL");
		}


		/******************** enrollmentresponseidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> enrollmentresponseidentifierlist = enrollmentresponse.getIdentifier();
		for(int enrollmentresponseidentifieri = 0; enrollmentresponseidentifieri<enrollmentresponseidentifierlist.size();enrollmentresponseidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  enrollmentresponseidentifier = enrollmentresponseidentifierlist.get(enrollmentresponseidentifieri);

		/******************** EnrollmentRsps_Id_Vl ********************************************************************************/
		if(enrollmentresponseidentifieri == 0) {e.addEnrollmentRspsIdVl("[");}
		if(enrollmentresponseidentifier.hasValue()) {

			e.addEnrollmentRspsIdVl(String.valueOf(enrollmentresponseidentifier.getValue()));
		} else {
			e.addEnrollmentRspsIdVl("NULL");
		}

		if(enrollmentresponseidentifieri == enrollmentresponseidentifierlist.size()-1) {e.addEnrollmentRspsIdVl("]");}


		/******************** enrollmentresponseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept enrollmentresponseidentifiertype = enrollmentresponseidentifier.getType();

		/******************** EnrollmentRsps_Id_Typ_Txt ********************************************************************************/
		if(enrollmentresponseidentifieri == 0) {e.addEnrollmentRspsIdTypTxt("[");}
		if(enrollmentresponseidentifiertype.hasText()) {

			e.addEnrollmentRspsIdTypTxt(String.valueOf(enrollmentresponseidentifiertype.getText()));
		} else {
			e.addEnrollmentRspsIdTypTxt("NULL");
		}

		if(enrollmentresponseidentifieri == enrollmentresponseidentifierlist.size()-1) {e.addEnrollmentRspsIdTypTxt("]");}


		/******************** enrollmentresponseidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> enrollmentresponseidentifiertypecodinglist = enrollmentresponseidentifiertype.getCoding();
		for(int enrollmentresponseidentifiertypecodingi = 0; enrollmentresponseidentifiertypecodingi<enrollmentresponseidentifiertypecodinglist.size();enrollmentresponseidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  enrollmentresponseidentifiertypecoding = enrollmentresponseidentifiertypecodinglist.get(enrollmentresponseidentifiertypecodingi);

		/******************** EnrollmentRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(enrollmentresponseidentifiertypecodingi == 0) {e.addEnrollmentRspsIdTypCdgDsply("[[");}
		if(enrollmentresponseidentifiertypecoding.hasDisplay()) {

			e.addEnrollmentRspsIdTypCdgDsply(String.valueOf(enrollmentresponseidentifiertypecoding.getDisplay()));
		} else {
			e.addEnrollmentRspsIdTypCdgDsply("NULL");
		}

		if(enrollmentresponseidentifiertypecodingi == enrollmentresponseidentifiertypecodinglist.size()-1) {e.addEnrollmentRspsIdTypCdgDsply("]]");}


		/******************** EnrollmentRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(enrollmentresponseidentifiertypecodingi == 0) {e.addEnrollmentRspsIdTypCdgVrsn("[[");}
		if(enrollmentresponseidentifiertypecoding.hasVersion()) {

			e.addEnrollmentRspsIdTypCdgVrsn(String.valueOf(enrollmentresponseidentifiertypecoding.getVersion()));
		} else {
			e.addEnrollmentRspsIdTypCdgVrsn("NULL");
		}

		if(enrollmentresponseidentifiertypecodingi == enrollmentresponseidentifiertypecodinglist.size()-1) {e.addEnrollmentRspsIdTypCdgVrsn("]]");}


		/******************** EnrollmentRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(enrollmentresponseidentifiertypecodingi == 0) {e.addEnrollmentRspsIdTypCdgCd("[[");}
		if(enrollmentresponseidentifiertypecoding.hasCode()) {

			e.addEnrollmentRspsIdTypCdgCd(String.valueOf(enrollmentresponseidentifiertypecoding.getCode()));
		} else {
			e.addEnrollmentRspsIdTypCdgCd("NULL");
		}

		if(enrollmentresponseidentifiertypecodingi == enrollmentresponseidentifiertypecodinglist.size()-1) {e.addEnrollmentRspsIdTypCdgCd("]]");}


		/******************** EnrollmentRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(enrollmentresponseidentifiertypecodingi == 0) {e.addEnrollmentRspsIdTypCdgUsrSltd("[[");}
		if(enrollmentresponseidentifiertypecoding.hasUserSelected()) {

			e.addEnrollmentRspsIdTypCdgUsrSltd(String.valueOf(enrollmentresponseidentifiertypecoding.getUserSelected()));
		} else {
			e.addEnrollmentRspsIdTypCdgUsrSltd("NULL");
		}

		if(enrollmentresponseidentifiertypecodingi == enrollmentresponseidentifiertypecodinglist.size()-1) {e.addEnrollmentRspsIdTypCdgUsrSltd("]]");}


		/******************** EnrollmentRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(enrollmentresponseidentifiertypecodingi == 0) {e.addEnrollmentRspsIdTypCdgSys("[[");}
		if(enrollmentresponseidentifiertypecoding.hasSystem()) {

			e.addEnrollmentRspsIdTypCdgSys(String.valueOf(enrollmentresponseidentifiertypecoding.getSystem()));
		} else {
			e.addEnrollmentRspsIdTypCdgSys("NULL");
		}

		if(enrollmentresponseidentifiertypecodingi == enrollmentresponseidentifiertypecodinglist.size()-1) {e.addEnrollmentRspsIdTypCdgSys("]]");}


		 };
		/******************** enrollmentresponseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period enrollmentresponseidentifierperiod = enrollmentresponseidentifier.getPeriod();

		/******************** EnrollmentRsps_Id_Prd_Strt ********************************************************************************/
		if(enrollmentresponseidentifieri == 0) {e.addEnrollmentRspsIdPrdStrt("[");}
		if(enrollmentresponseidentifierperiod.hasStart()) {

			e.addEnrollmentRspsIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(enrollmentresponseidentifierperiod.getStart())+"\"");
		} else {
			e.addEnrollmentRspsIdPrdStrt("NULL");
		}

		if(enrollmentresponseidentifieri == enrollmentresponseidentifierlist.size()-1) {e.addEnrollmentRspsIdPrdStrt("]");}


		/******************** EnrollmentRsps_Id_Prd_End ********************************************************************************/
		if(enrollmentresponseidentifieri == 0) {e.addEnrollmentRspsIdPrdEnd("[");}
		if(enrollmentresponseidentifierperiod.hasEnd()) {

			e.addEnrollmentRspsIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(enrollmentresponseidentifierperiod.getEnd())+"\"");
		} else {
			e.addEnrollmentRspsIdPrdEnd("NULL");
		}

		if(enrollmentresponseidentifieri == enrollmentresponseidentifierlist.size()-1) {e.addEnrollmentRspsIdPrdEnd("]");}


		/******************** enrollmentresponseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse enrollmentresponseidentifieruse = enrollmentresponseidentifier.getUse();
		if(enrollmentresponseidentifieruse!=null) {
		if(enrollmentresponseidentifieri == 0) {

		e.addEnrollmentRspsIdUse("[");		}
			e.addEnrollmentRspsIdUse(enrollmentresponseidentifieruse.toCode());
		if(enrollmentresponseidentifieri == enrollmentresponseidentifierlist.size()-1) {

		e.addEnrollmentRspsIdUse("]");		}

		} else {
			e.addEnrollmentRspsIdUse("NULL");
		}

		/******************** EnrollmentRsps_Id_Assigner ********************************************************************************/
		if(enrollmentresponseidentifieri == 0) {e.addEnrollmentRspsIdAssigner("[");}
		if(enrollmentresponseidentifier.hasAssigner()) {

			if(enrollmentresponseidentifier.getAssigner().getReference() != null) {
			e.addEnrollmentRspsIdAssigner(enrollmentresponseidentifier.getAssigner().getReference());
			}
		} else {
			e.addEnrollmentRspsIdAssigner("NULL");
		}

		if(enrollmentresponseidentifieri == enrollmentresponseidentifierlist.size()-1) {e.addEnrollmentRspsIdAssigner("]");}


		/******************** EnrollmentRsps_Id_Sys ********************************************************************************/
		if(enrollmentresponseidentifieri == 0) {e.addEnrollmentRspsIdSys("[");}
		if(enrollmentresponseidentifier.hasSystem()) {

			e.addEnrollmentRspsIdSys(String.valueOf(enrollmentresponseidentifier.getSystem()));
		} else {
			e.addEnrollmentRspsIdSys("NULL");
		}

		if(enrollmentresponseidentifieri == enrollmentresponseidentifierlist.size()-1) {e.addEnrollmentRspsIdSys("]");}


		 };
		/******************** EnrollmentRsps_Disposition ********************************************************************************/
		if(enrollmentresponse.hasDisposition()) {

			e.addEnrollmentRspsDisposition(String.valueOf(enrollmentresponse.getDisposition()));
		} else {
			e.addEnrollmentRspsDisposition("NULL");
		}


		/******************** enrollmentresponseoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.RemittanceOutcome enrollmentresponseoutcome = enrollmentresponse.getOutcome();
		if(enrollmentresponseoutcome!=null) {
			e.addEnrollmentRspsOutcome(enrollmentresponseoutcome.toCode());
		} else {
			e.addEnrollmentRspsOutcome("NULL");
		}

		/******************** EnrollmentRsps_RqstProvider ********************************************************************************/
		if(enrollmentresponse.hasRequestProvider()) {

			if(enrollmentresponse.getRequestProvider().getReference() != null) {
			e.addEnrollmentRspsRqstProvider(enrollmentresponse.getRequestProvider().getReference());
			}
		} else {
			e.addEnrollmentRspsRqstProvider("NULL");
		}


		/******************** EnrollmentRsps_Orgnztn ********************************************************************************/
		if(enrollmentresponse.hasOrganization()) {

			if(enrollmentresponse.getOrganization().getReference() != null) {
			e.addEnrollmentRspsOrgnztn(enrollmentresponse.getOrganization().getReference());
			}
		} else {
			e.addEnrollmentRspsOrgnztn("NULL");
		}


		return e;
	}
}
