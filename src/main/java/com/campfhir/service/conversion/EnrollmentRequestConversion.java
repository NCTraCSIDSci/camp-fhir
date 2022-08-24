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
		if(e.getEnrollmentRqstCandidate() != null ) {

			if(e.getEnrollmentRqstCandidate().replace("[","").replace("]","").equals("NULL") | e.getEnrollmentRqstCandidate()==null) {} else {
			enrollmentrequest.setCandidate(new org.hl7.fhir.r4.model.Reference(e.getEnrollmentRqstCandidate().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EnrollmentRqst_Cvg ********************************************************************************/
		if(e.getEnrollmentRqstCvg() != null ) {

			if(e.getEnrollmentRqstCvg().replace("[","").replace("]","").equals("NULL") | e.getEnrollmentRqstCvg()==null) {} else {
			enrollmentrequest.setCoverage(new org.hl7.fhir.r4.model.Reference(e.getEnrollmentRqstCvg().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EnrollmentRqst_Created ********************************************************************************/
		if(e.getEnrollmentRqstCreated() != null ) {

			if(e.getEnrollmentRqstCreated().replace("[","").replace("]","").equals("NULL") | e.getEnrollmentRqstCreated()==null) {} else {
			enrollmentrequest.setCreated(e.getEnrollmentRqstCreated().replace("[","").replace("]","").equals("NULL") | e.getEnrollmentRqstCreated()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEnrollmentRqstCreated().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EnrollmentRqst_Id_Assigner ********************************************************************************/
		if(e.getEnrollmentRqstIdAssigner() != null ) {

			String[] arrayi0 = e.getEnrollmentRqstIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentrequest.getIdentifier().size() < i0+1) { enrollmentrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {enrollmentrequest.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EnrollmentRqst_Id_Prd_End ********************************************************************************/
		if(e.getEnrollmentRqstIdPrdEnd() != null ) {

			String[] arrayi0 = e.getEnrollmentRqstIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentrequest.getIdentifier().size() < i0+1) { enrollmentrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {enrollmentrequest.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EnrollmentRqst_Id_Prd_Strt ********************************************************************************/
		if(e.getEnrollmentRqstIdPrdStrt() != null ) {

			String[] arrayi0 = e.getEnrollmentRqstIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentrequest.getIdentifier().size() < i0+1) { enrollmentrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {enrollmentrequest.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EnrollmentRqst_Id_Sys ********************************************************************************/
		if(e.getEnrollmentRqstIdSys() != null ) {

			String[] arrayi0 = e.getEnrollmentRqstIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentrequest.getIdentifier().size() < i0+1) { enrollmentrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {enrollmentrequest.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EnrollmentRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEnrollmentRqstIdTypCdgCd() != null ) {

			String[] arrayi0 = e.getEnrollmentRqstIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentrequest.getIdentifier().size() < i0+1) { enrollmentrequest.addIdentifier(); }
				String[] arrayi1 = e.getEnrollmentRqstIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(enrollmentrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { enrollmentrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {enrollmentrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EnrollmentRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEnrollmentRqstIdTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEnrollmentRqstIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentrequest.getIdentifier().size() < i0+1) { enrollmentrequest.addIdentifier(); }
				String[] arrayi1 = e.getEnrollmentRqstIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(enrollmentrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { enrollmentrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {enrollmentrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EnrollmentRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEnrollmentRqstIdTypCdgSys() != null ) {

			String[] arrayi0 = e.getEnrollmentRqstIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentrequest.getIdentifier().size() < i0+1) { enrollmentrequest.addIdentifier(); }
				String[] arrayi1 = e.getEnrollmentRqstIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(enrollmentrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { enrollmentrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {enrollmentrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EnrollmentRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEnrollmentRqstIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEnrollmentRqstIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentrequest.getIdentifier().size() < i0+1) { enrollmentrequest.addIdentifier(); }
				String[] arrayi1 = e.getEnrollmentRqstIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(enrollmentrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { enrollmentrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {enrollmentrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EnrollmentRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEnrollmentRqstIdTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEnrollmentRqstIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentrequest.getIdentifier().size() < i0+1) { enrollmentrequest.addIdentifier(); }
				String[] arrayi1 = e.getEnrollmentRqstIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(enrollmentrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { enrollmentrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {enrollmentrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EnrollmentRqst_Id_Typ_Txt ********************************************************************************/
		if(e.getEnrollmentRqstIdTypTxt() != null ) {

			String[] arrayi0 = e.getEnrollmentRqstIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentrequest.getIdentifier().size() < i0+1) { enrollmentrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {enrollmentrequest.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EnrollmentRqst_Id_Use ********************************************************************************/
		if(e.getEnrollmentRqstIdUse() != null ) {

			String[] arrayi0 = e.getEnrollmentRqstIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentrequest.getIdentifier().size() < i0+1) { enrollmentrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {enrollmentrequest.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EnrollmentRqst_Id_Vl ********************************************************************************/
		if(e.getEnrollmentRqstIdVl() != null ) {

			String[] arrayi0 = e.getEnrollmentRqstIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(enrollmentrequest.getIdentifier().size() < i0+1) { enrollmentrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {enrollmentrequest.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EnrollmentRqst_Insurer ********************************************************************************/
		if(e.getEnrollmentRqstInsurer() != null ) {

			if(e.getEnrollmentRqstInsurer().replace("[","").replace("]","").equals("NULL") | e.getEnrollmentRqstInsurer()==null) {} else {
			enrollmentrequest.setInsurer(new org.hl7.fhir.r4.model.Reference(e.getEnrollmentRqstInsurer().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EnrollmentRqst_Provider ********************************************************************************/
		if(e.getEnrollmentRqstProvider() != null ) {

			if(e.getEnrollmentRqstProvider().replace("[","").replace("]","").equals("NULL") | e.getEnrollmentRqstProvider()==null) {} else {
			enrollmentrequest.setProvider(new org.hl7.fhir.r4.model.Reference(e.getEnrollmentRqstProvider().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EnrollmentRqst_Sts ********************************************************************************/
		if(e.getEnrollmentRqstSts() != null ) {

			if(e.getEnrollmentRqstSts().replace("[","").replace("]","").equals("NULL") | e.getEnrollmentRqstSts()==null) {} else {
			enrollmentrequest.setStatus(new org.hl7.fhir.r4.model.EnrollmentRequest.EnrollmentRequestStatusEnumFactory().fromCode(e.getEnrollmentRqstSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return enrollmentrequest;
	}
}
