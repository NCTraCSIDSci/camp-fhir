package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EnrollmentRequest;
public class EnrollmentRequestBidirectionalConversion 
{
	public EnrollmentRequest EnrollmentRequests(org.hl7.fhir.r4.model.EnrollmentRequest enrollmentrequest) throws ParseException
	{
		 main.java.com.campfhir.model.EnrollmentRequest e = new  main.java.com.campfhir.model.EnrollmentRequest();

		/******************** id ********************************************************************************/
		e.setId(enrollmentrequest.getIdElement().getIdPart());

		/******************** EnrollmentRqst_Provider ********************************************************************************/
		if(enrollmentrequest.hasProvider()) {

			if(enrollmentrequest.getProvider().getReference() != null) {
			e.addEnrollmentRqstProvider(enrollmentrequest.getProvider().getReference());
			}
		} else {
			e.addEnrollmentRqstProvider("NULL");
		}


		/******************** enrollmentrequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.EnrollmentRequest.EnrollmentRequestStatus enrollmentrequeststatus = enrollmentrequest.getStatus();
		if(enrollmentrequeststatus!=null) {
			e.addEnrollmentRqstSts(enrollmentrequeststatus.toCode());
		} else {
			e.addEnrollmentRqstSts("NULL");
		}

		/******************** EnrollmentRqst_Created ********************************************************************************/
		if(enrollmentrequest.hasCreated()) {

			e.addEnrollmentRqstCreated("\""+ca.uhn.fhir.util.DateUtils.formatDate(enrollmentrequest.getCreated())+"\"");
		} else {
			e.addEnrollmentRqstCreated("NULL");
		}


		/******************** enrollmentrequestidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> enrollmentrequestidentifierlist = enrollmentrequest.getIdentifier();
		for(int enrollmentrequestidentifieri = 0; enrollmentrequestidentifieri<enrollmentrequestidentifierlist.size();enrollmentrequestidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  enrollmentrequestidentifier = enrollmentrequestidentifierlist.get(enrollmentrequestidentifieri);

		/******************** EnrollmentRqst_Id_Vl ********************************************************************************/
		if(enrollmentrequestidentifieri == 0) {e.addEnrollmentRqstIdVl("[");}
		if(enrollmentrequestidentifier.hasValue()) {

			e.addEnrollmentRqstIdVl(String.valueOf(enrollmentrequestidentifier.getValue()));
		} else {
			e.addEnrollmentRqstIdVl("NULL");
		}

		if(enrollmentrequestidentifieri == enrollmentrequestidentifierlist.size()-1) {e.addEnrollmentRqstIdVl("]");}


		/******************** enrollmentrequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept enrollmentrequestidentifiertype = enrollmentrequestidentifier.getType();

		/******************** EnrollmentRqst_Id_Typ_Txt ********************************************************************************/
		if(enrollmentrequestidentifieri == 0) {e.addEnrollmentRqstIdTypTxt("[");}
		if(enrollmentrequestidentifiertype.hasText()) {

			e.addEnrollmentRqstIdTypTxt(String.valueOf(enrollmentrequestidentifiertype.getText()));
		} else {
			e.addEnrollmentRqstIdTypTxt("NULL");
		}

		if(enrollmentrequestidentifieri == enrollmentrequestidentifierlist.size()-1) {e.addEnrollmentRqstIdTypTxt("]");}


		/******************** enrollmentrequestidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> enrollmentrequestidentifiertypecodinglist = enrollmentrequestidentifiertype.getCoding();
		for(int enrollmentrequestidentifiertypecodingi = 0; enrollmentrequestidentifiertypecodingi<enrollmentrequestidentifiertypecodinglist.size();enrollmentrequestidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  enrollmentrequestidentifiertypecoding = enrollmentrequestidentifiertypecodinglist.get(enrollmentrequestidentifiertypecodingi);

		/******************** EnrollmentRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(enrollmentrequestidentifiertypecodingi == 0) {e.addEnrollmentRqstIdTypCdgDsply("[[");}
		if(enrollmentrequestidentifiertypecoding.hasDisplay()) {

			e.addEnrollmentRqstIdTypCdgDsply(String.valueOf(enrollmentrequestidentifiertypecoding.getDisplay()));
		} else {
			e.addEnrollmentRqstIdTypCdgDsply("NULL");
		}

		if(enrollmentrequestidentifiertypecodingi == enrollmentrequestidentifiertypecodinglist.size()-1) {e.addEnrollmentRqstIdTypCdgDsply("]]");}


		/******************** EnrollmentRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(enrollmentrequestidentifiertypecodingi == 0) {e.addEnrollmentRqstIdTypCdgVrsn("[[");}
		if(enrollmentrequestidentifiertypecoding.hasVersion()) {

			e.addEnrollmentRqstIdTypCdgVrsn(String.valueOf(enrollmentrequestidentifiertypecoding.getVersion()));
		} else {
			e.addEnrollmentRqstIdTypCdgVrsn("NULL");
		}

		if(enrollmentrequestidentifiertypecodingi == enrollmentrequestidentifiertypecodinglist.size()-1) {e.addEnrollmentRqstIdTypCdgVrsn("]]");}


		/******************** EnrollmentRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(enrollmentrequestidentifiertypecodingi == 0) {e.addEnrollmentRqstIdTypCdgCd("[[");}
		if(enrollmentrequestidentifiertypecoding.hasCode()) {

			e.addEnrollmentRqstIdTypCdgCd(String.valueOf(enrollmentrequestidentifiertypecoding.getCode()));
		} else {
			e.addEnrollmentRqstIdTypCdgCd("NULL");
		}

		if(enrollmentrequestidentifiertypecodingi == enrollmentrequestidentifiertypecodinglist.size()-1) {e.addEnrollmentRqstIdTypCdgCd("]]");}


		/******************** EnrollmentRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(enrollmentrequestidentifiertypecodingi == 0) {e.addEnrollmentRqstIdTypCdgUsrSltd("[[");}
		if(enrollmentrequestidentifiertypecoding.hasUserSelected()) {

			e.addEnrollmentRqstIdTypCdgUsrSltd(String.valueOf(enrollmentrequestidentifiertypecoding.getUserSelected()));
		} else {
			e.addEnrollmentRqstIdTypCdgUsrSltd("NULL");
		}

		if(enrollmentrequestidentifiertypecodingi == enrollmentrequestidentifiertypecodinglist.size()-1) {e.addEnrollmentRqstIdTypCdgUsrSltd("]]");}


		/******************** EnrollmentRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(enrollmentrequestidentifiertypecodingi == 0) {e.addEnrollmentRqstIdTypCdgSys("[[");}
		if(enrollmentrequestidentifiertypecoding.hasSystem()) {

			e.addEnrollmentRqstIdTypCdgSys(String.valueOf(enrollmentrequestidentifiertypecoding.getSystem()));
		} else {
			e.addEnrollmentRqstIdTypCdgSys("NULL");
		}

		if(enrollmentrequestidentifiertypecodingi == enrollmentrequestidentifiertypecodinglist.size()-1) {e.addEnrollmentRqstIdTypCdgSys("]]");}


		 };
		/******************** enrollmentrequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period enrollmentrequestidentifierperiod = enrollmentrequestidentifier.getPeriod();

		/******************** EnrollmentRqst_Id_Prd_Strt ********************************************************************************/
		if(enrollmentrequestidentifieri == 0) {e.addEnrollmentRqstIdPrdStrt("[");}
		if(enrollmentrequestidentifierperiod.hasStart()) {

			e.addEnrollmentRqstIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(enrollmentrequestidentifierperiod.getStart())+"\"");
		} else {
			e.addEnrollmentRqstIdPrdStrt("NULL");
		}

		if(enrollmentrequestidentifieri == enrollmentrequestidentifierlist.size()-1) {e.addEnrollmentRqstIdPrdStrt("]");}


		/******************** EnrollmentRqst_Id_Prd_End ********************************************************************************/
		if(enrollmentrequestidentifieri == 0) {e.addEnrollmentRqstIdPrdEnd("[");}
		if(enrollmentrequestidentifierperiod.hasEnd()) {

			e.addEnrollmentRqstIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(enrollmentrequestidentifierperiod.getEnd())+"\"");
		} else {
			e.addEnrollmentRqstIdPrdEnd("NULL");
		}

		if(enrollmentrequestidentifieri == enrollmentrequestidentifierlist.size()-1) {e.addEnrollmentRqstIdPrdEnd("]");}


		/******************** enrollmentrequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse enrollmentrequestidentifieruse = enrollmentrequestidentifier.getUse();
		if(enrollmentrequestidentifieruse!=null) {
		if(enrollmentrequestidentifieri == 0) {

		e.addEnrollmentRqstIdUse("[");		}
			e.addEnrollmentRqstIdUse(enrollmentrequestidentifieruse.toCode());
		if(enrollmentrequestidentifieri == enrollmentrequestidentifierlist.size()-1) {

		e.addEnrollmentRqstIdUse("]");		}

		} else {
			e.addEnrollmentRqstIdUse("NULL");
		}

		/******************** EnrollmentRqst_Id_Assigner ********************************************************************************/
		if(enrollmentrequestidentifieri == 0) {e.addEnrollmentRqstIdAssigner("[");}
		if(enrollmentrequestidentifier.hasAssigner()) {

			if(enrollmentrequestidentifier.getAssigner().getReference() != null) {
			e.addEnrollmentRqstIdAssigner(enrollmentrequestidentifier.getAssigner().getReference());
			}
		} else {
			e.addEnrollmentRqstIdAssigner("NULL");
		}

		if(enrollmentrequestidentifieri == enrollmentrequestidentifierlist.size()-1) {e.addEnrollmentRqstIdAssigner("]");}


		/******************** EnrollmentRqst_Id_Sys ********************************************************************************/
		if(enrollmentrequestidentifieri == 0) {e.addEnrollmentRqstIdSys("[");}
		if(enrollmentrequestidentifier.hasSystem()) {

			e.addEnrollmentRqstIdSys(String.valueOf(enrollmentrequestidentifier.getSystem()));
		} else {
			e.addEnrollmentRqstIdSys("NULL");
		}

		if(enrollmentrequestidentifieri == enrollmentrequestidentifierlist.size()-1) {e.addEnrollmentRqstIdSys("]");}


		 };
		/******************** EnrollmentRqst_Insurer ********************************************************************************/
		if(enrollmentrequest.hasInsurer()) {

			if(enrollmentrequest.getInsurer().getReference() != null) {
			e.addEnrollmentRqstInsurer(enrollmentrequest.getInsurer().getReference());
			}
		} else {
			e.addEnrollmentRqstInsurer("NULL");
		}


		/******************** EnrollmentRqst_Candidate ********************************************************************************/
		if(enrollmentrequest.hasCandidate()) {

			if(enrollmentrequest.getCandidate().getReference() != null) {
			e.addEnrollmentRqstCandidate(enrollmentrequest.getCandidate().getReference());
			}
		} else {
			e.addEnrollmentRqstCandidate("NULL");
		}


		/******************** EnrollmentRqst_Cvg ********************************************************************************/
		if(enrollmentrequest.hasCoverage()) {

			if(enrollmentrequest.getCoverage().getReference() != null) {
			e.addEnrollmentRqstCvg(enrollmentrequest.getCoverage().getReference());
			}
		} else {
			e.addEnrollmentRqstCvg("NULL");
		}


		return e;
	}
}
