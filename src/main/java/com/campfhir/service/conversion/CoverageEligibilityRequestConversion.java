package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CoverageEligibilityRequest;
public class CoverageEligibilityRequestConversion 
{
	public org.hl7.fhir.r4.model.CoverageEligibilityRequest CoverageEligibilityRequests(CoverageEligibilityRequest c) throws ParseException
	{
		org.hl7.fhir.r4.model.CoverageEligibilityRequest coverageeligibilityrequest = new org.hl7.fhir.r4.model.CoverageEligibilityRequest();

		/******************** id ********************************************************************************/
		coverageeligibilityrequest.setId(c.getId());

		/******************** CvgElgbltyRqst_Created ********************************************************************************/
		if(c.getCvgElgbltyRqstCreated() != null ) {

			if(c.getCvgElgbltyRqstCreated().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRqstCreated()==null) {} else {
			coverageeligibilityrequest.setCreated(c.getCvgElgbltyRqstCreated().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRqstCreated()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCvgElgbltyRqstCreated().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CvgElgbltyRqst_Enterer ********************************************************************************/
		if(c.getCvgElgbltyRqstEnterer() != null ) {

			if(c.getCvgElgbltyRqstEnterer().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRqstEnterer()==null) {} else {
			coverageeligibilityrequest.setEnterer(new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRqstEnterer().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CvgElgbltyRqst_Facility ********************************************************************************/
		if(c.getCvgElgbltyRqstFacility() != null ) {

			if(c.getCvgElgbltyRqstFacility().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRqstFacility()==null) {} else {
			coverageeligibilityrequest.setFacility(new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRqstFacility().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CvgElgbltyRqst_Id_Assigner ********************************************************************************/
		if(c.getCvgElgbltyRqstIdAssigner() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getIdentifier().size() < i0+1) { coverageeligibilityrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRqst_Id_Prd_End ********************************************************************************/
		if(c.getCvgElgbltyRqstIdPrdEnd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getIdentifier().size() < i0+1) { coverageeligibilityrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRqst_Id_Prd_Strt ********************************************************************************/
		if(c.getCvgElgbltyRqstIdPrdStrt() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getIdentifier().size() < i0+1) { coverageeligibilityrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRqst_Id_Sys ********************************************************************************/
		if(c.getCvgElgbltyRqstIdSys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getIdentifier().size() < i0+1) { coverageeligibilityrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRqstIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getIdentifier().size() < i0+1) { coverageeligibilityrequest.addIdentifier(); }
				String[] arrayi1 = c.getCvgElgbltyRqstIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { coverageeligibilityrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRqstIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getIdentifier().size() < i0+1) { coverageeligibilityrequest.addIdentifier(); }
				String[] arrayi1 = c.getCvgElgbltyRqstIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { coverageeligibilityrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRqstIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getIdentifier().size() < i0+1) { coverageeligibilityrequest.addIdentifier(); }
				String[] arrayi1 = c.getCvgElgbltyRqstIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { coverageeligibilityrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRqstIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getIdentifier().size() < i0+1) { coverageeligibilityrequest.addIdentifier(); }
				String[] arrayi1 = c.getCvgElgbltyRqstIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { coverageeligibilityrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRqstIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getIdentifier().size() < i0+1) { coverageeligibilityrequest.addIdentifier(); }
				String[] arrayi1 = c.getCvgElgbltyRqstIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { coverageeligibilityrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Id_Typ_Txt ********************************************************************************/
		if(c.getCvgElgbltyRqstIdTypTxt() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getIdentifier().size() < i0+1) { coverageeligibilityrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRqst_Id_Use ********************************************************************************/
		if(c.getCvgElgbltyRqstIdUse() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getIdentifier().size() < i0+1) { coverageeligibilityrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRqst_Id_Vl ********************************************************************************/
		if(c.getCvgElgbltyRqstIdVl() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getIdentifier().size() < i0+1) { coverageeligibilityrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRqst_Insrnc_BusinessArrangement ********************************************************************************/
		if(c.getCvgElgbltyRqstInsrncBusinessArrangement() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstInsrncBusinessArrangement().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getInsurance().size() < i0+1) { coverageeligibilityrequest.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getInsurance().get(i0).setBusinessArrangement(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRqst_Insrnc_Cvg ********************************************************************************/
		if(c.getCvgElgbltyRqstInsrncCvg() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstInsrncCvg().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getInsurance().size() < i0+1) { coverageeligibilityrequest.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getInsurance().get(i0).setCoverage(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRqst_Insrnc_Focal ********************************************************************************/
		if(c.getCvgElgbltyRqstInsrncFocal() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstInsrncFocal().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getInsurance().size() < i0+1) { coverageeligibilityrequest.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getInsurance().get(i0).setFocal(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRqst_Insurer ********************************************************************************/
		if(c.getCvgElgbltyRqstInsurer() != null ) {

			if(c.getCvgElgbltyRqstInsurer().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRqstInsurer()==null) {} else {
			coverageeligibilityrequest.setInsurer(new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRqstInsurer().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRqstItmCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getCategory().getCoding().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getCategory().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRqstItmCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getCategory().getCoding().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getCategory().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRqstItmCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getCategory().getCoding().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getCategory().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRqstItmCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getCategory().getCoding().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getCategory().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRqstItmCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getCategory().getCoding().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getCategory().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_Ctgry_Txt ********************************************************************************/
		if(c.getCvgElgbltyRqstItmCtgryTxt() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getCategory().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRqst_Itm_Dtl ********************************************************************************/
		if(c.getCvgElgbltyRqstItmDtl() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmDtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {coverageeligibilityrequest.getItem().get(i0).addDetail(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getDiagnosis().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).addDiagnosis(); }
					String[] arrayi2 = c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityrequest.getItem().get(i0).getDiagnosis().get(i1).getDiagnosisCodeableConcept().getCoding().size() < i2+1) { coverageeligibilityrequest.getItem().get(i0).getDiagnosis().get(i1).getDiagnosisCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getDiagnosis().get(i1).getDiagnosisCodeableConcept().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getDiagnosis().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).addDiagnosis(); }
					String[] arrayi2 = c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityrequest.getItem().get(i0).getDiagnosis().get(i1).getDiagnosisCodeableConcept().getCoding().size() < i2+1) { coverageeligibilityrequest.getItem().get(i0).getDiagnosis().get(i1).getDiagnosisCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getDiagnosis().get(i1).getDiagnosisCodeableConcept().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getDiagnosis().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).addDiagnosis(); }
					String[] arrayi2 = c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityrequest.getItem().get(i0).getDiagnosis().get(i1).getDiagnosisCodeableConcept().getCoding().size() < i2+1) { coverageeligibilityrequest.getItem().get(i0).getDiagnosis().get(i1).getDiagnosisCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getDiagnosis().get(i1).getDiagnosisCodeableConcept().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getDiagnosis().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).addDiagnosis(); }
					String[] arrayi2 = c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityrequest.getItem().get(i0).getDiagnosis().get(i1).getDiagnosisCodeableConcept().getCoding().size() < i2+1) { coverageeligibilityrequest.getItem().get(i0).getDiagnosis().get(i1).getDiagnosisCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getDiagnosis().get(i1).getDiagnosisCodeableConcept().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getDiagnosis().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).addDiagnosis(); }
					String[] arrayi2 = c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityrequest.getItem().get(i0).getDiagnosis().get(i1).getDiagnosisCodeableConcept().getCoding().size() < i2+1) { coverageeligibilityrequest.getItem().get(i0).getDiagnosis().get(i1).getDiagnosisCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getDiagnosis().get(i1).getDiagnosisCodeableConcept().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Txt ********************************************************************************/
		if(c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptTxt() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getDiagnosis().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).addDiagnosis(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getDiagnosis().get(i1).getDiagnosisCodeableConcept().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisRfrnc ********************************************************************************/
		if(c.getCvgElgbltyRqstItmDgnsisDgnsisRfrnc() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmDgnsisDgnsisRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmDgnsisDgnsisRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getDiagnosis().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).addDiagnosis(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getDiagnosis().get(i1).setDiagnosis(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_Facility ********************************************************************************/
		if(c.getCvgElgbltyRqstItmFacility() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmFacility().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getItem().get(i0).setFacility(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRqstItmMdfrCdgCd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getModifier().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).addModifier(); }
					String[] arrayi2 = c.getCvgElgbltyRqstItmMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityrequest.getItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { coverageeligibilityrequest.getItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getModifier().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRqstItmMdfrCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getModifier().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).addModifier(); }
					String[] arrayi2 = c.getCvgElgbltyRqstItmMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityrequest.getItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { coverageeligibilityrequest.getItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getModifier().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRqstItmMdfrCdgSys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getModifier().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).addModifier(); }
					String[] arrayi2 = c.getCvgElgbltyRqstItmMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityrequest.getItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { coverageeligibilityrequest.getItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getModifier().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRqstItmMdfrCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getModifier().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).addModifier(); }
					String[] arrayi2 = c.getCvgElgbltyRqstItmMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityrequest.getItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { coverageeligibilityrequest.getItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getModifier().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRqstItmMdfrCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getModifier().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).addModifier(); }
					String[] arrayi2 = c.getCvgElgbltyRqstItmMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityrequest.getItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { coverageeligibilityrequest.getItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getModifier().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_Mdfr_Txt ********************************************************************************/
		if(c.getCvgElgbltyRqstItmMdfrTxt() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getModifier().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).addModifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getModifier().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRqstItmPrdctOrSrvCdgCd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getProductOrService().getCoding().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getProductOrService().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRqstItmPrdctOrSrvCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getProductOrService().getCoding().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getProductOrService().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRqstItmPrdctOrSrvCdgSys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getProductOrService().getCoding().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getProductOrService().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRqstItmPrdctOrSrvCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getProductOrService().getCoding().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getProductOrService().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRqstItmPrdctOrSrvCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				String[] arrayi1 = c.getCvgElgbltyRqstItmPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityrequest.getItem().get(i0).getProductOrService().getCoding().size() < i1+1) { coverageeligibilityrequest.getItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getProductOrService().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Txt ********************************************************************************/
		if(c.getCvgElgbltyRqstItmPrdctOrSrvTxt() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getProductOrService().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRqst_Itm_Provider ********************************************************************************/
		if(c.getCvgElgbltyRqstItmProvider() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmProvider().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getItem().get(i0).setProvider(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRqst_Itm_Qnty_Cd ********************************************************************************/
		if(c.getCvgElgbltyRqstItmQntyCd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRqst_Itm_Qnty_Cmprtr ********************************************************************************/
		if(c.getCvgElgbltyRqstItmQntyCmprtr() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRqst_Itm_Qnty_Sys ********************************************************************************/
		if(c.getCvgElgbltyRqstItmQntySys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRqst_Itm_Qnty_Unt ********************************************************************************/
		if(c.getCvgElgbltyRqstItmQntyUnt() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRqst_Itm_Qnty_Vl ********************************************************************************/
		if(c.getCvgElgbltyRqstItmQntyVl() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CvgElgbltyRqst_Itm_SprtingInfoSqnc ********************************************************************************/
		if(c.getCvgElgbltyRqstItmSprtingInfoSqnc() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmSprtingInfoSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {coverageeligibilityrequest.getItem().get(i0).addSupportingInfoSequence(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CvgElgbltyRqst_Itm_UntPrice_Crncy ********************************************************************************/
		if(c.getCvgElgbltyRqstItmUntPriceCrncy() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getUnitPrice().setCurrency(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRqst_Itm_UntPrice_Vl ********************************************************************************/
		if(c.getCvgElgbltyRqstItmUntPriceVl() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstItmUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getItem().size() < i0+1) { coverageeligibilityrequest.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getItem().get(i0).getUnitPrice().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CvgElgbltyRqst_Pnt ********************************************************************************/
		if(c.getCvgElgbltyRqstPnt() != null ) {

			if(c.getCvgElgbltyRqstPnt().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRqstPnt()==null) {} else {
			coverageeligibilityrequest.setPatient(new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRqstPnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CvgElgbltyRqst_Priority_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRqstPriorityCdgCd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstPriorityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getPriority().getCoding().size() < i0+1) { coverageeligibilityrequest.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getPriority().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRqst_Priority_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRqstPriorityCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstPriorityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getPriority().getCoding().size() < i0+1) { coverageeligibilityrequest.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getPriority().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRqst_Priority_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRqstPriorityCdgSys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstPriorityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getPriority().getCoding().size() < i0+1) { coverageeligibilityrequest.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getPriority().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRqst_Priority_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRqstPriorityCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstPriorityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getPriority().getCoding().size() < i0+1) { coverageeligibilityrequest.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getPriority().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRqst_Priority_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRqstPriorityCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstPriorityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getPriority().getCoding().size() < i0+1) { coverageeligibilityrequest.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getPriority().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRqst_Priority_Txt ********************************************************************************/
		if(c.getCvgElgbltyRqstPriorityTxt() != null ) {

			if(c.getCvgElgbltyRqstPriorityTxt().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRqstPriorityTxt()==null) {} else {
			coverageeligibilityrequest.getPriority().setText(c.getCvgElgbltyRqstPriorityTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CvgElgbltyRqst_Provider ********************************************************************************/
		if(c.getCvgElgbltyRqstProvider() != null ) {

			if(c.getCvgElgbltyRqstProvider().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRqstProvider()==null) {} else {
			coverageeligibilityrequest.setProvider(new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRqstProvider().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CvgElgbltyRqst_SrvdDtTyp ********************************************************************************/
		if(c.getCvgElgbltyRqstSrvdDtTyp() != null ) {

			if(c.getCvgElgbltyRqstSrvdDtTyp().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRqstSrvdDtTyp()==null) {} else {
			coverageeligibilityrequest.setServiced(new org.hl7.fhir.r4.model.DateType(c.getCvgElgbltyRqstSrvdDtTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CvgElgbltyRqst_SrvdPrd_End ********************************************************************************/
		if(c.getCvgElgbltyRqstSrvdPrdEnd() != null ) {

			if(c.getCvgElgbltyRqstSrvdPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRqstSrvdPrdEnd()==null) {} else {
			coverageeligibilityrequest.getServicedPeriod().setEnd(c.getCvgElgbltyRqstSrvdPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRqstSrvdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCvgElgbltyRqstSrvdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CvgElgbltyRqst_SrvdPrd_Strt ********************************************************************************/
		if(c.getCvgElgbltyRqstSrvdPrdStrt() != null ) {

			if(c.getCvgElgbltyRqstSrvdPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRqstSrvdPrdStrt()==null) {} else {
			coverageeligibilityrequest.getServicedPeriod().setStart(c.getCvgElgbltyRqstSrvdPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRqstSrvdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCvgElgbltyRqstSrvdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CvgElgbltyRqst_Sts ********************************************************************************/
		if(c.getCvgElgbltyRqstSts() != null ) {

			if(c.getCvgElgbltyRqstSts().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRqstSts()==null) {} else {
			coverageeligibilityrequest.setStatus(new org.hl7.fhir.r4.model.CoverageEligibilityRequest.EligibilityRequestStatusEnumFactory().fromCode(c.getCvgElgbltyRqstSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CvgElgbltyRqst_SprtingInfo_AppliesToAll ********************************************************************************/
		if(c.getCvgElgbltyRqstSprtingInfoAppliesToAll() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstSprtingInfoAppliesToAll().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getSupportingInfo().size() < i0+1) { coverageeligibilityrequest.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getSupportingInfo().get(i0).setAppliesToAll(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRqst_SprtingInfo_Info ********************************************************************************/
		if(c.getCvgElgbltyRqstSprtingInfoInfo() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstSprtingInfoInfo().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getSupportingInfo().size() < i0+1) { coverageeligibilityrequest.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getSupportingInfo().get(i0).setInformation(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRqst_SprtingInfo_Sqnc ********************************************************************************/
		if(c.getCvgElgbltyRqstSprtingInfoSqnc() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRqstSprtingInfoSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityrequest.getSupportingInfo().size() < i0+1) { coverageeligibilityrequest.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityrequest.getSupportingInfo().get(i0).setSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		return coverageeligibilityrequest;
	}
}
