package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CoverageEligibilityResponse;
public class CoverageEligibilityResponseConversion 
{
	public org.hl7.fhir.r4.model.CoverageEligibilityResponse CoverageEligibilityResponses(CoverageEligibilityResponse c) throws ParseException
	{
		org.hl7.fhir.r4.model.CoverageEligibilityResponse coverageeligibilityresponse = new org.hl7.fhir.r4.model.CoverageEligibilityResponse();

		/******************** id ********************************************************************************/
		coverageeligibilityresponse.setId(c.getId());

		/******************** CvgElgbltyRsps_Created ********************************************************************************/
		if(c.getCvgElgbltyRspsCreated() != null ) {

			if(c.getCvgElgbltyRspsCreated().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRspsCreated()==null) {} else {
			coverageeligibilityresponse.setCreated(c.getCvgElgbltyRspsCreated().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRspsCreated()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCvgElgbltyRspsCreated().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CvgElgbltyRsps_Disposition ********************************************************************************/
		if(c.getCvgElgbltyRspsDisposition() != null ) {

			if(c.getCvgElgbltyRspsDisposition().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRspsDisposition()==null) {} else {
			coverageeligibilityresponse.setDisposition(c.getCvgElgbltyRspsDisposition().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CvgElgbltyRsps_Error_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsErrorCdCdgCd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsErrorCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getError().size() < i0+1) { coverageeligibilityresponse.addError(); }
				String[] arrayi1 = c.getCvgElgbltyRspsErrorCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getError().get(i0).getCode().getCoding().size() < i1+1) { coverageeligibilityresponse.getError().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getError().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Error_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsErrorCdCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsErrorCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getError().size() < i0+1) { coverageeligibilityresponse.addError(); }
				String[] arrayi1 = c.getCvgElgbltyRspsErrorCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getError().get(i0).getCode().getCoding().size() < i1+1) { coverageeligibilityresponse.getError().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getError().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Error_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsErrorCdCdgSys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsErrorCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getError().size() < i0+1) { coverageeligibilityresponse.addError(); }
				String[] arrayi1 = c.getCvgElgbltyRspsErrorCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getError().get(i0).getCode().getCoding().size() < i1+1) { coverageeligibilityresponse.getError().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getError().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Error_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsErrorCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsErrorCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getError().size() < i0+1) { coverageeligibilityresponse.addError(); }
				String[] arrayi1 = c.getCvgElgbltyRspsErrorCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getError().get(i0).getCode().getCoding().size() < i1+1) { coverageeligibilityresponse.getError().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getError().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Error_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsErrorCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsErrorCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getError().size() < i0+1) { coverageeligibilityresponse.addError(); }
				String[] arrayi1 = c.getCvgElgbltyRspsErrorCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getError().get(i0).getCode().getCoding().size() < i1+1) { coverageeligibilityresponse.getError().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getError().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Error_Cd_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsErrorCdTxt() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsErrorCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getError().size() < i0+1) { coverageeligibilityresponse.addError(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityresponse.getError().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRsps_Frm_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsFrmCdgCd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsFrmCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getForm().getCoding().size() < i0+1) { coverageeligibilityresponse.getForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityresponse.getForm().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRsps_Frm_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsFrmCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsFrmCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getForm().getCoding().size() < i0+1) { coverageeligibilityresponse.getForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityresponse.getForm().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRsps_Frm_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsFrmCdgSys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsFrmCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getForm().getCoding().size() < i0+1) { coverageeligibilityresponse.getForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityresponse.getForm().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRsps_Frm_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsFrmCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsFrmCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getForm().getCoding().size() < i0+1) { coverageeligibilityresponse.getForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityresponse.getForm().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRsps_Frm_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsFrmCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsFrmCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getForm().getCoding().size() < i0+1) { coverageeligibilityresponse.getForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityresponse.getForm().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRsps_Frm_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsFrmTxt() != null ) {

			if(c.getCvgElgbltyRspsFrmTxt().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRspsFrmTxt()==null) {} else {
			coverageeligibilityresponse.getForm().setText(c.getCvgElgbltyRspsFrmTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CvgElgbltyRsps_Id_Assigner ********************************************************************************/
		if(c.getCvgElgbltyRspsIdAssigner() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getIdentifier().size() < i0+1) { coverageeligibilityresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityresponse.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRsps_Id_Prd_End ********************************************************************************/
		if(c.getCvgElgbltyRspsIdPrdEnd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getIdentifier().size() < i0+1) { coverageeligibilityresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityresponse.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRsps_Id_Prd_Strt ********************************************************************************/
		if(c.getCvgElgbltyRspsIdPrdStrt() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getIdentifier().size() < i0+1) { coverageeligibilityresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityresponse.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRsps_Id_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsIdSys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getIdentifier().size() < i0+1) { coverageeligibilityresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityresponse.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getIdentifier().size() < i0+1) { coverageeligibilityresponse.addIdentifier(); }
				String[] arrayi1 = c.getCvgElgbltyRspsIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { coverageeligibilityresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getIdentifier().size() < i0+1) { coverageeligibilityresponse.addIdentifier(); }
				String[] arrayi1 = c.getCvgElgbltyRspsIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { coverageeligibilityresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getIdentifier().size() < i0+1) { coverageeligibilityresponse.addIdentifier(); }
				String[] arrayi1 = c.getCvgElgbltyRspsIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { coverageeligibilityresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getIdentifier().size() < i0+1) { coverageeligibilityresponse.addIdentifier(); }
				String[] arrayi1 = c.getCvgElgbltyRspsIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { coverageeligibilityresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getIdentifier().size() < i0+1) { coverageeligibilityresponse.addIdentifier(); }
				String[] arrayi1 = c.getCvgElgbltyRspsIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { coverageeligibilityresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Id_Typ_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsIdTypTxt() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getIdentifier().size() < i0+1) { coverageeligibilityresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityresponse.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRsps_Id_Use ********************************************************************************/
		if(c.getCvgElgbltyRspsIdUse() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getIdentifier().size() < i0+1) { coverageeligibilityresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityresponse.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRsps_Id_Vl ********************************************************************************/
		if(c.getCvgElgbltyRspsIdVl() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getIdentifier().size() < i0+1) { coverageeligibilityresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityresponse.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_BnftPrd_End ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncBnftPrdEnd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncBnftPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getBenefitPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_BnftPrd_Strt ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncBnftPrdStrt() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncBnftPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getBenefitPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Cvg ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncCvg() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncCvg().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).setCoverage(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Inforce ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncInforce() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncInforce().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).setInforce(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnRequired ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmAthztnRequired() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmAthztnRequired().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmAthztnRequired().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).setAuthorizationRequired(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgCd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addAuthorizationSupporting(); }
						String[] arrayi3 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().get(i2).getCoding().size() < i3+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addAuthorizationSupporting(); }
						String[] arrayi3 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().get(i2).getCoding().size() < i3+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgSys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addAuthorizationSupporting(); }
						String[] arrayi3 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().get(i2).getCoding().size() < i3+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addAuthorizationSupporting(); }
						String[] arrayi3 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().get(i2).getCoding().size() < i3+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addAuthorizationSupporting(); }
						String[] arrayi3 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().get(i2).getCoding().size() < i3+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmAthztnSprtingTxt() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmAthztnSprtingTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addAuthorizationSupporting(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getAuthorizationSupporting().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnUrl ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmAthztnUrl() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmAthztnUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmAthztnUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).setAuthorizationUrl(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedMoney_Crncy ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftAllowedMoneyCrncy() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmBnftAllowedMoneyCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmBnftAllowedMoneyCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmBnftAllowedMoneyCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addBenefit(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getAllowedMoney().setCurrency(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedMoney_Vl ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftAllowedMoneyVl() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmBnftAllowedMoneyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmBnftAllowedMoneyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmBnftAllowedMoneyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addBenefit(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getAllowedMoney().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedStrgTyp ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftAllowedStrgTyp() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmBnftAllowedStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmBnftAllowedStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmBnftAllowedStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addBenefit(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).setAllowed(new org.hl7.fhir.r4.model.StringType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedUnsignedIntTyp ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftAllowedUnsignedIntTyp() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmBnftAllowedUnsignedIntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmBnftAllowedUnsignedIntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmBnftAllowedUnsignedIntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addBenefit(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).setAllowed(new org.hl7.fhir.r4.model.UnsignedIntType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftTypCdgCd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addBenefit(); }
						String[] arrayi3 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getType().getCoding().size() < i3+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getType().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addBenefit(); }
						String[] arrayi3 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getType().getCoding().size() < i3+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getType().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftTypCdgSys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addBenefit(); }
						String[] arrayi3 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getType().getCoding().size() < i3+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getType().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addBenefit(); }
						String[] arrayi3 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getType().getCoding().size() < i3+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getType().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addBenefit(); }
						String[] arrayi3 = c.getCvgElgbltyRspsInsrncItmBnftTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getType().getCoding().size() < i3+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getType().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftTypTxt() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmBnftTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmBnftTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmBnftTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addBenefit(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getType().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedMoney_Crncy ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftUsedMoneyCrncy() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmBnftUsedMoneyCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmBnftUsedMoneyCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmBnftUsedMoneyCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addBenefit(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getUsedMoney().setCurrency(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedMoney_Vl ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftUsedMoneyVl() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmBnftUsedMoneyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmBnftUsedMoneyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmBnftUsedMoneyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addBenefit(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).getUsedMoney().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedStrgTyp ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftUsedStrgTyp() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmBnftUsedStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmBnftUsedStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmBnftUsedStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addBenefit(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).setUsed(new org.hl7.fhir.r4.model.StringType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedUnsignedIntTyp ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftUsedUnsignedIntTyp() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmBnftUsedUnsignedIntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmBnftUsedUnsignedIntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmBnftUsedUnsignedIntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addBenefit(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getBenefit().get(i2).setUsed(new org.hl7.fhir.r4.model.UnsignedIntType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getCategory().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getCategory().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getCategory().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getCategory().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getCategory().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getCategory().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getCategory().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getCategory().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getCategory().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getCategory().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmCtgryTxt() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getCategory().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Dscrptn ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmDscrptn() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).setDescription(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Excluded ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmExcluded() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmExcluded().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmExcluded().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).setExcluded(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmMdfrCdgCd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addModifier(); }
						String[] arrayi3 = c.getCvgElgbltyRspsInsrncItmMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmMdfrCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addModifier(); }
						String[] arrayi3 = c.getCvgElgbltyRspsInsrncItmMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmMdfrCdgSys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addModifier(); }
						String[] arrayi3 = c.getCvgElgbltyRspsInsrncItmMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmMdfrCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addModifier(); }
						String[] arrayi3 = c.getCvgElgbltyRspsInsrncItmMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmMdfrCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addModifier(); }
						String[] arrayi3 = c.getCvgElgbltyRspsInsrncItmMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmMdfrTxt() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).addModifier(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getModifier().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Nm ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmNm() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).setName(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmNetworkCdgCd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmNetworkCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmNetworkCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmNetworkCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getNetwork().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getNetwork().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getNetwork().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmNetworkCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmNetworkCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmNetworkCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmNetworkCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getNetwork().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getNetwork().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getNetwork().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmNetworkCdgSys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmNetworkCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmNetworkCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmNetworkCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getNetwork().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getNetwork().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getNetwork().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmNetworkCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmNetworkCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmNetworkCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmNetworkCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getNetwork().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getNetwork().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getNetwork().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmNetworkCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmNetworkCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmNetworkCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmNetworkCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getNetwork().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getNetwork().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getNetwork().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmNetworkTxt() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmNetworkTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmNetworkTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getNetwork().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgCd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getProductOrService().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getProductOrService().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getProductOrService().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getProductOrService().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgSys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getProductOrService().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getProductOrService().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getProductOrService().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getProductOrService().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getProductOrService().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getProductOrService().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmPrdctOrSrvTxt() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getProductOrService().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Provider ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmProvider() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmProvider().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmProvider().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).setProvider(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmTrmCdgCd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmTrmCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmTrmCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmTrmCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getTerm().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getTerm().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getTerm().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmTrmCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmTrmCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmTrmCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmTrmCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getTerm().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getTerm().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getTerm().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmTrmCdgSys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmTrmCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmTrmCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmTrmCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getTerm().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getTerm().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getTerm().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmTrmCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmTrmCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmTrmCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmTrmCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getTerm().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getTerm().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getTerm().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmTrmCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmTrmCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmTrmCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmTrmCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getTerm().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getTerm().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getTerm().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmTrmTxt() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmTrmTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmTrmTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getTerm().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmUntCdgCd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmUntCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmUntCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmUntCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getUnit().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getUnit().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getUnit().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmUntCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmUntCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmUntCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmUntCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getUnit().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getUnit().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getUnit().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmUntCdgSys() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmUntCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmUntCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmUntCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getUnit().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getUnit().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getUnit().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmUntCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmUntCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmUntCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmUntCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getUnit().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getUnit().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getUnit().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmUntCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmUntCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmUntCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					String[] arrayi2 = c.getCvgElgbltyRspsInsrncItmUntCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getUnit().getCoding().size() < i2+1) { coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getUnit().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getUnit().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmUntTxt() != null ) {

			String[] arrayi0 = c.getCvgElgbltyRspsInsrncItmUntTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverageeligibilityresponse.getInsurance().size() < i0+1) { coverageeligibilityresponse.addInsurance(); }
				String[] arrayi1 = c.getCvgElgbltyRspsInsrncItmUntTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverageeligibilityresponse.getInsurance().get(i0).getItem().size() < i1+1) { coverageeligibilityresponse.getInsurance().get(i0).addItem(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverageeligibilityresponse.getInsurance().get(i0).getItem().get(i1).getUnit().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CvgElgbltyRsps_Insurer ********************************************************************************/
		if(c.getCvgElgbltyRspsInsurer() != null ) {

			if(c.getCvgElgbltyRspsInsurer().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRspsInsurer()==null) {} else {
			coverageeligibilityresponse.setInsurer(new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRspsInsurer().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CvgElgbltyRsps_Outcome ********************************************************************************/
		if(c.getCvgElgbltyRspsOutcome() != null ) {

			if(c.getCvgElgbltyRspsOutcome().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRspsOutcome()==null) {} else {
			coverageeligibilityresponse.setOutcome(new org.hl7.fhir.r4.model.Enumerations.RemittanceOutcomeEnumFactory().fromCode(c.getCvgElgbltyRspsOutcome().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CvgElgbltyRsps_Pnt ********************************************************************************/
		if(c.getCvgElgbltyRspsPnt() != null ) {

			if(c.getCvgElgbltyRspsPnt().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRspsPnt()==null) {} else {
			coverageeligibilityresponse.setPatient(new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRspsPnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CvgElgbltyRsps_PreAuthRef ********************************************************************************/
		if(c.getCvgElgbltyRspsPreAuthRef() != null ) {

			if(c.getCvgElgbltyRspsPreAuthRef().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRspsPreAuthRef()==null) {} else {
			coverageeligibilityresponse.setPreAuthRef(c.getCvgElgbltyRspsPreAuthRef().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CvgElgbltyRsps_Rqst ********************************************************************************/
		if(c.getCvgElgbltyRspsRqst() != null ) {

			if(c.getCvgElgbltyRspsRqst().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRspsRqst()==null) {} else {
			coverageeligibilityresponse.setRequest(new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRspsRqst().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CvgElgbltyRsps_Rqstor ********************************************************************************/
		if(c.getCvgElgbltyRspsRqstor() != null ) {

			if(c.getCvgElgbltyRspsRqstor().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRspsRqstor()==null) {} else {
			coverageeligibilityresponse.setRequestor(new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRspsRqstor().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CvgElgbltyRsps_SrvdDtTyp ********************************************************************************/
		if(c.getCvgElgbltyRspsSrvdDtTyp() != null ) {

			if(c.getCvgElgbltyRspsSrvdDtTyp().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRspsSrvdDtTyp()==null) {} else {
			coverageeligibilityresponse.setServiced(new org.hl7.fhir.r4.model.DateType(c.getCvgElgbltyRspsSrvdDtTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CvgElgbltyRsps_SrvdPrd_End ********************************************************************************/
		if(c.getCvgElgbltyRspsSrvdPrdEnd() != null ) {

			if(c.getCvgElgbltyRspsSrvdPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRspsSrvdPrdEnd()==null) {} else {
			coverageeligibilityresponse.getServicedPeriod().setEnd(c.getCvgElgbltyRspsSrvdPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRspsSrvdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCvgElgbltyRspsSrvdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CvgElgbltyRsps_SrvdPrd_Strt ********************************************************************************/
		if(c.getCvgElgbltyRspsSrvdPrdStrt() != null ) {

			if(c.getCvgElgbltyRspsSrvdPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRspsSrvdPrdStrt()==null) {} else {
			coverageeligibilityresponse.getServicedPeriod().setStart(c.getCvgElgbltyRspsSrvdPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRspsSrvdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCvgElgbltyRspsSrvdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CvgElgbltyRsps_Sts ********************************************************************************/
		if(c.getCvgElgbltyRspsSts() != null ) {

			if(c.getCvgElgbltyRspsSts().replace("[","").replace("]","").equals("NULL") | c.getCvgElgbltyRspsSts()==null) {} else {
			coverageeligibilityresponse.setStatus(new org.hl7.fhir.r4.model.CoverageEligibilityResponse.EligibilityResponseStatusEnumFactory().fromCode(c.getCvgElgbltyRspsSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return coverageeligibilityresponse;
	}
}
