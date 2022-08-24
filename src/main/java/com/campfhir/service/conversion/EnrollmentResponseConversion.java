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
		if(e.getEnrollmentRspsCreated() != null ) {

			if(e.getEnrollmentRspsCreated().replace("[","").replace("]","").equals("NULL") | e.getEnrollmentRspsCreated()==null) {} else {
			enrollmentresponse.setCreated(e.getEnrollmentRspsCreated().replace("[","").replace("]","").equals("NULL") | e.getEnrollmentRspsCreated()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEnrollmentRspsCreated().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EnrollmentRsps_Disposition ********************************************************************************/
		if(e.getEnrollmentRspsDisposition() != null ) {

			if(e.getEnrollmentRspsDisposition().replace("[","").replace("]","").equals("NULL") | e.getEnrollmentRspsDisposition()==null) {} else {
			enrollmentresponse.setDisposition(e.getEnrollmentRspsDisposition().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EnrollmentRsps_Id_Assigner ********************************************************************************/
		if(e.getEnrollmentRspsIdAssigner() != null ) {

			String[] arrayi0 = e.getEnrollmentRspsIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentresponse.getIdentifier().size() < i0+1) { enrollmentresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {enrollmentresponse.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EnrollmentRsps_Id_Prd_End ********************************************************************************/
		if(e.getEnrollmentRspsIdPrdEnd() != null ) {

			String[] arrayi0 = e.getEnrollmentRspsIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentresponse.getIdentifier().size() < i0+1) { enrollmentresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {enrollmentresponse.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EnrollmentRsps_Id_Prd_Strt ********************************************************************************/
		if(e.getEnrollmentRspsIdPrdStrt() != null ) {

			String[] arrayi0 = e.getEnrollmentRspsIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentresponse.getIdentifier().size() < i0+1) { enrollmentresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {enrollmentresponse.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EnrollmentRsps_Id_Sys ********************************************************************************/
		if(e.getEnrollmentRspsIdSys() != null ) {

			String[] arrayi0 = e.getEnrollmentRspsIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentresponse.getIdentifier().size() < i0+1) { enrollmentresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {enrollmentresponse.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EnrollmentRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEnrollmentRspsIdTypCdgCd() != null ) {

			String[] arrayi0 = e.getEnrollmentRspsIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentresponse.getIdentifier().size() < i0+1) { enrollmentresponse.addIdentifier(); }
				String[] arrayi1 = e.getEnrollmentRspsIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(enrollmentresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { enrollmentresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {enrollmentresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EnrollmentRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEnrollmentRspsIdTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEnrollmentRspsIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentresponse.getIdentifier().size() < i0+1) { enrollmentresponse.addIdentifier(); }
				String[] arrayi1 = e.getEnrollmentRspsIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(enrollmentresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { enrollmentresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {enrollmentresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EnrollmentRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEnrollmentRspsIdTypCdgSys() != null ) {

			String[] arrayi0 = e.getEnrollmentRspsIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentresponse.getIdentifier().size() < i0+1) { enrollmentresponse.addIdentifier(); }
				String[] arrayi1 = e.getEnrollmentRspsIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(enrollmentresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { enrollmentresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {enrollmentresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EnrollmentRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEnrollmentRspsIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEnrollmentRspsIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentresponse.getIdentifier().size() < i0+1) { enrollmentresponse.addIdentifier(); }
				String[] arrayi1 = e.getEnrollmentRspsIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(enrollmentresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { enrollmentresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {enrollmentresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EnrollmentRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEnrollmentRspsIdTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEnrollmentRspsIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentresponse.getIdentifier().size() < i0+1) { enrollmentresponse.addIdentifier(); }
				String[] arrayi1 = e.getEnrollmentRspsIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(enrollmentresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { enrollmentresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {enrollmentresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EnrollmentRsps_Id_Typ_Txt ********************************************************************************/
		if(e.getEnrollmentRspsIdTypTxt() != null ) {

			String[] arrayi0 = e.getEnrollmentRspsIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentresponse.getIdentifier().size() < i0+1) { enrollmentresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {enrollmentresponse.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EnrollmentRsps_Id_Use ********************************************************************************/
		if(e.getEnrollmentRspsIdUse() != null ) {

			String[] arrayi0 = e.getEnrollmentRspsIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentresponse.getIdentifier().size() < i0+1) { enrollmentresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {enrollmentresponse.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EnrollmentRsps_Id_Vl ********************************************************************************/
		if(e.getEnrollmentRspsIdVl() != null ) {

			String[] arrayi0 = e.getEnrollmentRspsIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentresponse.getIdentifier().size() < i0+1) { enrollmentresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {enrollmentresponse.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EnrollmentRsps_Orgnztn ********************************************************************************/
		if(e.getEnrollmentRspsOrgnztn() != null ) {

			if(e.getEnrollmentRspsOrgnztn().replace("[","").replace("]","").equals("NULL") | e.getEnrollmentRspsOrgnztn()==null) {} else {
			enrollmentresponse.setOrganization(new org.hl7.fhir.r4.model.Reference(e.getEnrollmentRspsOrgnztn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EnrollmentRsps_Outcome ********************************************************************************/
		if(e.getEnrollmentRspsOutcome() != null ) {

			if(e.getEnrollmentRspsOutcome().replace("[","").replace("]","").equals("NULL") | e.getEnrollmentRspsOutcome()==null) {} else {
			enrollmentresponse.setOutcome(new org.hl7.fhir.r4.model.Enumerations.RemittanceOutcomeEnumFactory().fromCode(e.getEnrollmentRspsOutcome().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EnrollmentRsps_Rqst ********************************************************************************/
		if(e.getEnrollmentRspsRqst() != null ) {

			if(e.getEnrollmentRspsRqst().replace("[","").replace("]","").equals("NULL") | e.getEnrollmentRspsRqst()==null) {} else {
			enrollmentresponse.setRequest(new org.hl7.fhir.r4.model.Reference(e.getEnrollmentRspsRqst().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EnrollmentRsps_RqstProvider ********************************************************************************/
		if(e.getEnrollmentRspsRqstProvider() != null ) {

			if(e.getEnrollmentRspsRqstProvider().replace("[","").replace("]","").equals("NULL") | e.getEnrollmentRspsRqstProvider()==null) {} else {
			enrollmentresponse.setRequestProvider(new org.hl7.fhir.r4.model.Reference(e.getEnrollmentRspsRqstProvider().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EnrollmentRsps_Sts ********************************************************************************/
		if(e.getEnrollmentRspsSts() != null ) {

			if(e.getEnrollmentRspsSts().replace("[","").replace("]","").equals("NULL") | e.getEnrollmentRspsSts()==null) {} else {
			enrollmentresponse.setStatus(new org.hl7.fhir.r4.model.EnrollmentResponse.EnrollmentResponseStatusEnumFactory().fromCode(e.getEnrollmentRspsSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return enrollmentresponse;
	}
}
