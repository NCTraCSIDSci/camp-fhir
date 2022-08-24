package main.java.com.campfhir.service.conversion;
import java.text.ParseException;

import main.java.com.campfhir.model.Claim;
import main.java.com.campfhir.model.ClaimResponse;
public class ClaimResponseConversion 
{
	public org.hl7.fhir.r4.model.ClaimResponse ClaimResponses(ClaimResponse c) throws ParseException
	{
		org.hl7.fhir.r4.model.ClaimResponse claimresponse = new org.hl7.fhir.r4.model.ClaimResponse();

		/******************** id ********************************************************************************/
		claimresponse.setId(c.getId());

		/******************** ClmRsps_AddItm_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnAmntCrncy() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getAddItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getAmount().setCurrency(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_Adjdctn_Amnt_Vl ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnAmntVl() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getAddItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getAmount().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsAddItmAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsAddItmAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsAddItmAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsAddItmAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsAddItmAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnCtgryTxt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getAddItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getCategory().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnRsnCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsAddItmAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnRsnCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsAddItmAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnRsnCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsAddItmAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsAddItmAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnRsnCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsAddItmAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Txt ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnRsnTxt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getAddItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getAdjudication().get(i1).getReason().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_Adjdctn_Vl ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnVl() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getAddItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getAdjudication().get(i1).setValue((Double.parseDouble((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ClmRsps_AddItm_BodySite_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmBodySiteCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getBodySite().getCoding().size() < i1+1) { claimresponse.getAddItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getBodySite().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_BodySite_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmBodySiteCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getBodySite().getCoding().size() < i1+1) { claimresponse.getAddItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getBodySite().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_BodySite_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmBodySiteCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getBodySite().getCoding().size() < i1+1) { claimresponse.getAddItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getBodySite().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmBodySiteCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getBodySite().getCoding().size() < i1+1) { claimresponse.getAddItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getBodySite().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClmRsps_AddItm_BodySite_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmBodySiteCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getBodySite().getCoding().size() < i1+1) { claimresponse.getAddItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getBodySite().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_BodySite_Txt ********************************************************************************/
		if(c.getClmRspsAddItmBodySiteTxt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmBodySiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getBodySite().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnAmntCrncy() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getAmount().setCurrency(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnAmntVl() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getAmount().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnCtgryTxt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnRsnCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnRsnCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnRsnCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnRsnCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnRsnTxt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnVl() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).setValue((Double.parseDouble((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Factor ********************************************************************************/
		if(c.getClmRspsAddItmDtlFactor() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).setFactor((Double.parseDouble((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlMdfrCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmDtlMdfrCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlMdfrCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmDtlMdfrCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmDtlMdfrCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Mdfr_Txt ********************************************************************************/
		if(c.getClmRspsAddItmDtlMdfrTxt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addModifier(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Net_Crncy ********************************************************************************/
		if(c.getClmRspsAddItmDtlNetCrncy() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getNet().setCurrency(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Net_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlNetVl() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getNet().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_NtNmbr ********************************************************************************/
		if(c.getClmRspsAddItmDtlNtNmbr() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).addNoteNumber(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlPrdctOrSrvCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmDtlPrdctOrSrvCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlPrdctOrSrvCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmDtlPrdctOrSrvCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmDtlPrdctOrSrvCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Txt ********************************************************************************/
		if(c.getClmRspsAddItmDtlPrdctOrSrvTxt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getProductOrService().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Qnty_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlQntyCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Qnty_Cmprtr ********************************************************************************/
		if(c.getClmRspsAddItmDtlQntyCmprtr() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Qnty_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlQntySys() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Qnty_Unt ********************************************************************************/
		if(c.getClmRspsAddItmDtlQntyUnt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_Qnty_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlQntyVl() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnAmntCrncy() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getAmount().setCurrency(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnAmntVl() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getAmount().setValue((new java.math.BigDecimal((arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryTxt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnRsnTxt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnVl() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).setValue((Double.parseDouble((arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Factor ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlFactor() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).setFactor((Double.parseDouble((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlMdfrCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = c.getClmRspsAddItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlMdfrCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = c.getClmRspsAddItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlMdfrCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = c.getClmRspsAddItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlMdfrCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = c.getClmRspsAddItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlMdfrCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = c.getClmRspsAddItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Txt ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlMdfrTxt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Net_Crncy ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlNetCrncy() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getNet().setCurrency(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Net_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlNetVl() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getNet().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_NtNmbr ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlNtNmbr() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						for( String currListStrSplit : arrayi2[i2].replace("[","").replace("]","").replace("\"","").split(",")){
						if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addNoteNumber(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Txt ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlPrdctOrSrvTxt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Qnty_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlQntyCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Qnty_Cmprtr ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlQntyCmprtr() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Qnty_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlQntySys() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Qnty_Unt ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlQntyUnt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Qnty_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlQntyVl() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_UntPrice_Crncy ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlUntPriceCrncy() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getUnitPrice().setCurrency(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_UntPrice_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlUntPriceVl() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSubDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlSubDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsAddItmDtlSubDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getUnitPrice().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_UntPrice_Crncy ********************************************************************************/
		if(c.getClmRspsAddItmDtlUntPriceCrncy() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getUnitPrice().setCurrency(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_Dtl_UntPrice_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlUntPriceVl() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getDetail().size() < i1+1) { claimresponse.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getDetail().get(i1).getUnitPrice().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ClmRsps_AddItm_DtlSqnc ********************************************************************************/
		if(c.getClmRspsAddItmDtlSqnc() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claimresponse.getAddItem().get(i0).addDetailSequence(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClmRsps_AddItm_Factor ********************************************************************************/
		if(c.getClmRspsAddItmFactor() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).setFactor((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		return Claims_Extended( c, claimresponse); 
	}
		public org.hl7.fhir.r4.model.ClaimResponse Claims_Extended(ClaimResponse c, org.hl7.fhir.r4.model.ClaimResponse claimresponse) throws ParseException
		{
		/******************** ClmRsps_AddItm_ItmSqnc ********************************************************************************/
		if(c.getClmRspsAddItmItmSqnc() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmItmSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claimresponse.getAddItem().get(i0).addItemSequence(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClmRsps_AddItm_LctnAddr_City ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrCity() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmLctnAddrCity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getLocationAddress().setCity(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_AddItm_LctnAddr_Cntry ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrCntry() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmLctnAddrCntry().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getLocationAddress().setCountry(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_AddItm_LctnAddr_District ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrDistrict() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmLctnAddrDistrict().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getLocationAddress().setDistrict(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_AddItm_LctnAddr_Line ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrLine() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmLctnAddrLine().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claimresponse.getAddItem().get(i0).getLocationAddress().addLine(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_LctnAddr_Prd_End ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrPrdEnd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmLctnAddrPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getLocationAddress().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_AddItm_LctnAddr_Prd_Strt ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrPrdStrt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmLctnAddrPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getLocationAddress().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_AddItm_LctnAddr_PostalCd ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrPostalCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmLctnAddrPostalCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getLocationAddress().setPostalCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_AddItm_LctnAddr_State ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrState() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmLctnAddrState().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getLocationAddress().setState(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_AddItm_LctnAddr_Txt ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrTxt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmLctnAddrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getLocationAddress().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_AddItm_LctnAddr_Typ ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrTyp() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmLctnAddrTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getLocationAddress().setType(new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_AddItm_LctnAddr_Use ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrUse() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmLctnAddrUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getLocationAddress().setUse(new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmLctnCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmLctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmLctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { claimresponse.getAddItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmLctnCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmLctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmLctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { claimresponse.getAddItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmLctnCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmLctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmLctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { claimresponse.getAddItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmLctnCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmLctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmLctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { claimresponse.getAddItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmLctnCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmLctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmLctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { claimresponse.getAddItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Txt ********************************************************************************/
		if(c.getClmRspsAddItmLctnCdbleCncptTxt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmLctnCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getLocationCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_AddItm_LctnRfrnc ********************************************************************************/
		if(c.getClmRspsAddItmLctnRfrnc() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmLctnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).setLocation(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_AddItm_Mdfr_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmMdfrCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getModifier().size() < i1+1) { claimresponse.getAddItem().get(i0).addModifier(); }
					String[] arrayi2 = c.getClmRspsAddItmMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getModifier().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmMdfrCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getModifier().size() < i1+1) { claimresponse.getAddItem().get(i0).addModifier(); }
					String[] arrayi2 = c.getClmRspsAddItmMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getModifier().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Mdfr_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmMdfrCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getModifier().size() < i1+1) { claimresponse.getAddItem().get(i0).addModifier(); }
					String[] arrayi2 = c.getClmRspsAddItmMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getModifier().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmMdfrCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getModifier().size() < i1+1) { claimresponse.getAddItem().get(i0).addModifier(); }
					String[] arrayi2 = c.getClmRspsAddItmMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getModifier().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmMdfrCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getModifier().size() < i1+1) { claimresponse.getAddItem().get(i0).addModifier(); }
					String[] arrayi2 = c.getClmRspsAddItmMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getModifier().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_Mdfr_Txt ********************************************************************************/
		if(c.getClmRspsAddItmMdfrTxt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getModifier().size() < i1+1) { claimresponse.getAddItem().get(i0).addModifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getModifier().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_Net_Crncy ********************************************************************************/
		if(c.getClmRspsAddItmNetCrncy() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getNet().setCurrency(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_AddItm_Net_Vl ********************************************************************************/
		if(c.getClmRspsAddItmNetVl() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getNet().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ClmRsps_AddItm_NtNmbr ********************************************************************************/
		if(c.getClmRspsAddItmNtNmbr() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claimresponse.getAddItem().get(i0).addNoteNumber(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmPrdctOrSrvCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getProductOrService().getCoding().size() < i1+1) { claimresponse.getAddItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getProductOrService().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmPrdctOrSrvCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getProductOrService().getCoding().size() < i1+1) { claimresponse.getAddItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getProductOrService().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmPrdctOrSrvCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getProductOrService().getCoding().size() < i1+1) { claimresponse.getAddItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getProductOrService().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmPrdctOrSrvCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getProductOrService().getCoding().size() < i1+1) { claimresponse.getAddItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getProductOrService().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmPrdctOrSrvCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getProductOrService().getCoding().size() < i1+1) { claimresponse.getAddItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getProductOrService().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_PrdctOrSrv_Txt ********************************************************************************/
		if(c.getClmRspsAddItmPrdctOrSrvTxt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getProductOrService().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		
		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmPrgrmCdCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getProgramCode().size() < i1+1) { claimresponse.getAddItem().get(i0).addProgramCode(); }
					String[] arrayi2 = c.getClmRspsAddItmPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmPrgrmCdCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getProgramCode().size() < i1+1) { claimresponse.getAddItem().get(i0).addProgramCode(); }
					String[] arrayi2 = c.getClmRspsAddItmPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmPrgrmCdCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getProgramCode().size() < i1+1) { claimresponse.getAddItem().get(i0).addProgramCode(); }
					String[] arrayi2 = c.getClmRspsAddItmPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmPrgrmCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getProgramCode().size() < i1+1) { claimresponse.getAddItem().get(i0).addProgramCode(); }
					String[] arrayi2 = c.getClmRspsAddItmPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmPrgrmCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getProgramCode().size() < i1+1) { claimresponse.getAddItem().get(i0).addProgramCode(); }
					String[] arrayi2 = c.getClmRspsAddItmPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_PrgrmCd_Txt ********************************************************************************/
		if(c.getClmRspsAddItmPrgrmCdTxt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getProgramCode().size() < i1+1) { claimresponse.getAddItem().get(i0).addProgramCode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getProgramCode().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_Provider ********************************************************************************/
		if(c.getClmRspsAddItmProvider() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmProvider().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claimresponse.getAddItem().get(i0).addProvider(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClmRsps_AddItm_Qnty_Cd ********************************************************************************/
		if(c.getClmRspsAddItmQntyCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_AddItm_Qnty_Cmprtr ********************************************************************************/
		if(c.getClmRspsAddItmQntyCmprtr() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		
		/******************** ClmRsps_AddItm_Qnty_Sys ********************************************************************************/
		if(c.getClmRspsAddItmQntySys() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_AddItm_Qnty_Unt ********************************************************************************/
		if(c.getClmRspsAddItmQntyUnt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_AddItm_Qnty_Vl ********************************************************************************/
		if(c.getClmRspsAddItmQntyVl() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ClmRsps_AddItm_SrvdDtTyp ********************************************************************************/
		if(c.getClmRspsAddItmSrvdDtTyp() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmSrvdDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).setServiced(new org.hl7.fhir.r4.model.DateType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_AddItm_SrvdPrd_End ********************************************************************************/
		if(c.getClmRspsAddItmSrvdPrdEnd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmSrvdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getServicedPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_AddItm_SrvdPrd_Strt ********************************************************************************/
		if(c.getClmRspsAddItmSrvdPrdStrt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmSrvdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getServicedPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_AddItm_SubSite_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmSubSiteCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmSubSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmSubSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getSubSite().size() < i1+1) { claimresponse.getAddItem().get(i0).addSubSite(); }
					String[] arrayi2 = c.getClmRspsAddItmSubSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_SubSite_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmSubSiteCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmSubSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmSubSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getSubSite().size() < i1+1) { claimresponse.getAddItem().get(i0).addSubSite(); }
					String[] arrayi2 = c.getClmRspsAddItmSubSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_SubSite_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmSubSiteCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmSubSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmSubSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getSubSite().size() < i1+1) { claimresponse.getAddItem().get(i0).addSubSite(); }
					String[] arrayi2 = c.getClmRspsAddItmSubSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_SubSite_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmSubSiteCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmSubSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmSubSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getSubSite().size() < i1+1) { claimresponse.getAddItem().get(i0).addSubSite(); }
					String[] arrayi2 = c.getClmRspsAddItmSubSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_SubSite_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmSubSiteCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmSubSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmSubSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getSubSite().size() < i1+1) { claimresponse.getAddItem().get(i0).addSubSite(); }
					String[] arrayi2 = c.getClmRspsAddItmSubSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getAddItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { claimresponse.getAddItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getAddItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_AddItm_SubSite_Txt ********************************************************************************/
		if(c.getClmRspsAddItmSubSiteTxt() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmSubSiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				String[] arrayi1 = c.getClmRspsAddItmSubSiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAddItem().get(i0).getSubSite().size() < i1+1) { claimresponse.getAddItem().get(i0).addSubSite(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAddItem().get(i0).getSubSite().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_AddItm_SubdetailSqnc ********************************************************************************/
		if(c.getClmRspsAddItmSubdetailSqnc() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmSubdetailSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claimresponse.getAddItem().get(i0).addSubdetailSequence(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClmRsps_AddItm_UntPrice_Crncy ********************************************************************************/
		if(c.getClmRspsAddItmUntPriceCrncy() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getUnitPrice().setCurrency(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_AddItm_UntPrice_Vl ********************************************************************************/
		if(c.getClmRspsAddItmUntPriceVl() != null ) {

			String[] arrayi0 = c.getClmRspsAddItmUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAddItem().size() < i0+1) { claimresponse.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAddItem().get(i0).getUnitPrice().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ClmRsps_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(c.getClmRspsAdjdctnAmntCrncy() != null ) {

			String[] arrayi0 = c.getClmRspsAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAdjudication().size() < i0+1) { claimresponse.addAdjudication(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAdjudication().get(i0).getAmount().setCurrency(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Adjdctn_Amnt_Vl ********************************************************************************/
		if(c.getClmRspsAdjdctnAmntVl() != null ) {

			String[] arrayi0 = c.getClmRspsAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAdjudication().size() < i0+1) { claimresponse.addAdjudication(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAdjudication().get(i0).getAmount().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAdjdctnCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAdjudication().size() < i0+1) { claimresponse.addAdjudication(); }
				String[] arrayi1 = c.getClmRspsAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAdjudication().get(i0).getCategory().getCoding().size() < i1+1) { claimresponse.getAdjudication().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAdjudication().get(i0).getCategory().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAdjdctnCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAdjudication().size() < i0+1) { claimresponse.addAdjudication(); }
				String[] arrayi1 = c.getClmRspsAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAdjudication().get(i0).getCategory().getCoding().size() < i1+1) { claimresponse.getAdjudication().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAdjudication().get(i0).getCategory().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAdjdctnCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAdjudication().size() < i0+1) { claimresponse.addAdjudication(); }
				String[] arrayi1 = c.getClmRspsAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAdjudication().get(i0).getCategory().getCoding().size() < i1+1) { claimresponse.getAdjudication().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAdjudication().get(i0).getCategory().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAdjdctnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAdjudication().size() < i0+1) { claimresponse.addAdjudication(); }
				String[] arrayi1 = c.getClmRspsAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAdjudication().get(i0).getCategory().getCoding().size() < i1+1) { claimresponse.getAdjudication().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAdjudication().get(i0).getCategory().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAdjdctnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAdjudication().size() < i0+1) { claimresponse.addAdjudication(); }
				String[] arrayi1 = c.getClmRspsAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAdjudication().get(i0).getCategory().getCoding().size() < i1+1) { claimresponse.getAdjudication().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAdjudication().get(i0).getCategory().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(c.getClmRspsAdjdctnCtgryTxt() != null ) {

			String[] arrayi0 = c.getClmRspsAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAdjudication().size() < i0+1) { claimresponse.addAdjudication(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAdjudication().get(i0).getCategory().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAdjdctnRsnCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAdjudication().size() < i0+1) { claimresponse.addAdjudication(); }
				String[] arrayi1 = c.getClmRspsAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAdjudication().get(i0).getReason().getCoding().size() < i1+1) { claimresponse.getAdjudication().get(i0).getReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAdjudication().get(i0).getReason().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAdjdctnRsnCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAdjudication().size() < i0+1) { claimresponse.addAdjudication(); }
				String[] arrayi1 = c.getClmRspsAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAdjudication().get(i0).getReason().getCoding().size() < i1+1) { claimresponse.getAdjudication().get(i0).getReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAdjudication().get(i0).getReason().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAdjdctnRsnCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAdjudication().size() < i0+1) { claimresponse.addAdjudication(); }
				String[] arrayi1 = c.getClmRspsAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAdjudication().get(i0).getReason().getCoding().size() < i1+1) { claimresponse.getAdjudication().get(i0).getReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAdjudication().get(i0).getReason().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAdjdctnRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAdjudication().size() < i0+1) { claimresponse.addAdjudication(); }
				String[] arrayi1 = c.getClmRspsAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAdjudication().get(i0).getReason().getCoding().size() < i1+1) { claimresponse.getAdjudication().get(i0).getReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAdjudication().get(i0).getReason().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClmRsps_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAdjdctnRsnCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAdjudication().size() < i0+1) { claimresponse.addAdjudication(); }
				String[] arrayi1 = c.getClmRspsAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getAdjudication().get(i0).getReason().getCoding().size() < i1+1) { claimresponse.getAdjudication().get(i0).getReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getAdjudication().get(i0).getReason().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Adjdctn_Rsn_Txt ********************************************************************************/
		if(c.getClmRspsAdjdctnRsnTxt() != null ) {

			String[] arrayi0 = c.getClmRspsAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAdjudication().size() < i0+1) { claimresponse.addAdjudication(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAdjudication().get(i0).getReason().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Adjdctn_Vl ********************************************************************************/
		if(c.getClmRspsAdjdctnVl() != null ) {

			String[] arrayi0 = c.getClmRspsAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getAdjudication().size() < i0+1) { claimresponse.addAdjudication(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getAdjudication().get(i0).setValue((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ClmRsps_CmmnctnRqst ********************************************************************************/
		if(c.getClmRspsCmmnctnRqst() != null ) {

				for( String currListStrSplit : c.getClmRspsCmmnctnRqst().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			claimresponse.addCommunicationRequest(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** ClmRsps_Created ********************************************************************************/
		if(c.getClmRspsCreated() != null ) {

			if(c.getClmRspsCreated().replace("[","").replace("]","").equals("NULL") | c.getClmRspsCreated()==null) {} else {
			claimresponse.setCreated(c.getClmRspsCreated().replace("[","").replace("]","").equals("NULL") | c.getClmRspsCreated()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getClmRspsCreated().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClmRsps_Disposition ********************************************************************************/
		if(c.getClmRspsDisposition() != null ) {

			if(c.getClmRspsDisposition().replace("[","").replace("]","").equals("NULL") | c.getClmRspsDisposition()==null) {} else {
			claimresponse.setDisposition(c.getClmRspsDisposition().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClmRsps_Error_Cd_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsErrorCdCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsErrorCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getError().size() < i0+1) { claimresponse.addError(); }
				String[] arrayi1 = c.getClmRspsErrorCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getError().get(i0).getCode().getCoding().size() < i1+1) { claimresponse.getError().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getError().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Error_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsErrorCdCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsErrorCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getError().size() < i0+1) { claimresponse.addError(); }
				String[] arrayi1 = c.getClmRspsErrorCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getError().get(i0).getCode().getCoding().size() < i1+1) { claimresponse.getError().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getError().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Error_Cd_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsErrorCdCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsErrorCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getError().size() < i0+1) { claimresponse.addError(); }
				String[] arrayi1 = c.getClmRspsErrorCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getError().get(i0).getCode().getCoding().size() < i1+1) { claimresponse.getError().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getError().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Error_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsErrorCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsErrorCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getError().size() < i0+1) { claimresponse.addError(); }
				String[] arrayi1 = c.getClmRspsErrorCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getError().get(i0).getCode().getCoding().size() < i1+1) { claimresponse.getError().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getError().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClmRsps_Error_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsErrorCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsErrorCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getError().size() < i0+1) { claimresponse.addError(); }
				String[] arrayi1 = c.getClmRspsErrorCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getError().get(i0).getCode().getCoding().size() < i1+1) { claimresponse.getError().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getError().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Error_Cd_Txt ********************************************************************************/
		if(c.getClmRspsErrorCdTxt() != null ) {

			String[] arrayi0 = c.getClmRspsErrorCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getError().size() < i0+1) { claimresponse.addError(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getError().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Error_DtlSqnc ********************************************************************************/
		if(c.getClmRspsErrorDtlSqnc() != null ) {

			String[] arrayi0 = c.getClmRspsErrorDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getError().size() < i0+1) { claimresponse.addError(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getError().get(i0).setDetailSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_Error_ItmSqnc ********************************************************************************/
		if(c.getClmRspsErrorItmSqnc() != null ) {

			String[] arrayi0 = c.getClmRspsErrorItmSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getError().size() < i0+1) { claimresponse.addError(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getError().get(i0).setItemSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_Error_SubDtlSqnc ********************************************************************************/
		if(c.getClmRspsErrorSubDtlSqnc() != null ) {

			String[] arrayi0 = c.getClmRspsErrorSubDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getError().size() < i0+1) { claimresponse.addError(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getError().get(i0).setSubDetailSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_Frm_CntntTyp ********************************************************************************/
		if(c.getClmRspsFrmCntntTyp() != null ) {

			if(c.getClmRspsFrmCntntTyp().replace("[","").replace("]","").equals("NULL") | c.getClmRspsFrmCntntTyp()==null) {} else {
			claimresponse.getForm().setContentType(c.getClmRspsFrmCntntTyp().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClmRsps_Frm_Creation ********************************************************************************/
		if(c.getClmRspsFrmCreation() != null ) {

			if(c.getClmRspsFrmCreation().replace("[","").replace("]","").equals("NULL") | c.getClmRspsFrmCreation()==null) {} else {
			claimresponse.getForm().setCreation(c.getClmRspsFrmCreation().replace("[","").replace("]","").equals("NULL") | c.getClmRspsFrmCreation()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getClmRspsFrmCreation().replace("[","").replace("]","").replace("\"","")));
			}
		}
		
		/******************** ClmRsps_Frm_Data ********************************************************************************/
		if(c.getClmRspsFrmData() != null ) {

			if(c.getClmRspsFrmData().replace("[","").replace("]","").equals("NULL") | c.getClmRspsFrmData()==null) {} else {
			claimresponse.getForm().setData(c.getClmRspsFrmData().getBytes());
			}
		}
		/******************** ClmRsps_Frm_Hash ********************************************************************************/
		if(c.getClmRspsFrmHash() != null ) {

			if(c.getClmRspsFrmHash().replace("[","").replace("]","").equals("NULL") | c.getClmRspsFrmHash()==null) {} else {
			claimresponse.getForm().setHash(c.getClmRspsFrmHash().getBytes());
			}
		}
		/******************** ClmRsps_Frm_Lnguage ********************************************************************************/
		if(c.getClmRspsFrmLnguage() != null ) {

			if(c.getClmRspsFrmLnguage().replace("[","").replace("]","").equals("NULL") | c.getClmRspsFrmLnguage()==null) {} else {
			claimresponse.getForm().setLanguage(c.getClmRspsFrmLnguage().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClmRsps_Frm_Sz ********************************************************************************/
		if(c.getClmRspsFrmSz() != null ) {

			if(c.getClmRspsFrmSz().replace("[","").replace("]","").equals("NULL") | c.getClmRspsFrmSz()==null) {} else {
			claimresponse.getForm().setSize(Integer.parseInt(c.getClmRspsFrmSz().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClmRsps_Frm_Ttl ********************************************************************************/
		if(c.getClmRspsFrmTtl() != null ) {

			if(c.getClmRspsFrmTtl().replace("[","").replace("]","").equals("NULL") | c.getClmRspsFrmTtl()==null) {} else {
			claimresponse.getForm().setTitle(c.getClmRspsFrmTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClmRsps_Frm_Url ********************************************************************************/
		if(c.getClmRspsFrmUrl() != null ) {

			if(c.getClmRspsFrmUrl().replace("[","").replace("]","").equals("NULL") | c.getClmRspsFrmUrl()==null) {} else {
			claimresponse.getForm().setUrl(c.getClmRspsFrmUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClmRsps_FrmCd_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsFrmCdCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsFrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getFormCode().getCoding().size() < i0+1) { claimresponse.getFormCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getFormCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_FrmCd_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsFrmCdCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsFrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getFormCode().getCoding().size() < i0+1) { claimresponse.getFormCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getFormCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_FrmCd_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsFrmCdCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsFrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getFormCode().getCoding().size() < i0+1) { claimresponse.getFormCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getFormCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_FrmCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsFrmCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsFrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getFormCode().getCoding().size() < i0+1) { claimresponse.getFormCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getFormCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_FrmCd_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsFrmCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsFrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getFormCode().getCoding().size() < i0+1) { claimresponse.getFormCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getFormCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_FrmCd_Txt ********************************************************************************/
		if(c.getClmRspsFrmCdTxt() != null ) {

			if(c.getClmRspsFrmCdTxt().replace("[","").replace("]","").equals("NULL") | c.getClmRspsFrmCdTxt()==null) {} else {
			claimresponse.getFormCode().setText(c.getClmRspsFrmCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClmRsps_FundsReserve_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsFundsReserveCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsFundsReserveCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getFundsReserve().getCoding().size() < i0+1) { claimresponse.getFundsReserve().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getFundsReserve().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_FundsReserve_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsFundsReserveCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsFundsReserveCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getFundsReserve().getCoding().size() < i0+1) { claimresponse.getFundsReserve().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getFundsReserve().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_FundsReserve_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsFundsReserveCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsFundsReserveCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getFundsReserve().getCoding().size() < i0+1) { claimresponse.getFundsReserve().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getFundsReserve().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_FundsReserve_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsFundsReserveCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsFundsReserveCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getFundsReserve().getCoding().size() < i0+1) { claimresponse.getFundsReserve().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getFundsReserve().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		
		/******************** ClmRsps_FundsReserve_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsFundsReserveCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsFundsReserveCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getFundsReserve().getCoding().size() < i0+1) { claimresponse.getFundsReserve().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getFundsReserve().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_FundsReserve_Txt ********************************************************************************/
		if(c.getClmRspsFundsReserveTxt() != null ) {

			if(c.getClmRspsFundsReserveTxt().replace("[","").replace("]","").equals("NULL") | c.getClmRspsFundsReserveTxt()==null) {} else {
			claimresponse.getFundsReserve().setText(c.getClmRspsFundsReserveTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClmRsps_Id_Assigner ********************************************************************************/
		if(c.getClmRspsIdAssigner() != null ) {

			String[] arrayi0 = c.getClmRspsIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getIdentifier().size() < i0+1) { claimresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_Id_Prd_End ********************************************************************************/
		if(c.getClmRspsIdPrdEnd() != null ) {

			String[] arrayi0 = c.getClmRspsIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getIdentifier().size() < i0+1) { claimresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_Id_Prd_Strt ********************************************************************************/
		if(c.getClmRspsIdPrdStrt() != null ) {

			String[] arrayi0 = c.getClmRspsIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getIdentifier().size() < i0+1) { claimresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_Id_Sys ********************************************************************************/
		if(c.getClmRspsIdSys() != null ) {

			String[] arrayi0 = c.getClmRspsIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getIdentifier().size() < i0+1) { claimresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getIdentifier().size() < i0+1) { claimresponse.addIdentifier(); }
				String[] arrayi1 = c.getClmRspsIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { claimresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		
		/******************** ClmRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getIdentifier().size() < i0+1) { claimresponse.addIdentifier(); }
				String[] arrayi1 = c.getClmRspsIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { claimresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getIdentifier().size() < i0+1) { claimresponse.addIdentifier(); }
				String[] arrayi1 = c.getClmRspsIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { claimresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getIdentifier().size() < i0+1) { claimresponse.addIdentifier(); }
				String[] arrayi1 = c.getClmRspsIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { claimresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClmRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getIdentifier().size() < i0+1) { claimresponse.addIdentifier(); }
				String[] arrayi1 = c.getClmRspsIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { claimresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Id_Typ_Txt ********************************************************************************/
		if(c.getClmRspsIdTypTxt() != null ) {

			String[] arrayi0 = c.getClmRspsIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getIdentifier().size() < i0+1) { claimresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Id_Use ********************************************************************************/
		if(c.getClmRspsIdUse() != null ) {

			String[] arrayi0 = c.getClmRspsIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getIdentifier().size() < i0+1) { claimresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_Id_Vl ********************************************************************************/
		if(c.getClmRspsIdVl() != null ) {

			String[] arrayi0 = c.getClmRspsIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getIdentifier().size() < i0+1) { claimresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Insrnc_BusinessArrangement ********************************************************************************/
		if(c.getClmRspsInsrncBusinessArrangement() != null ) {

			String[] arrayi0 = c.getClmRspsInsrncBusinessArrangement().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getInsurance().size() < i0+1) { claimresponse.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getInsurance().get(i0).setBusinessArrangement(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Insrnc_ClmRsps ********************************************************************************/
		if(c.getClmRspsInsrncClmRsps() != null ) {

			String[] arrayi0 = c.getClmRspsInsrncClmRsps().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getInsurance().size() < i0+1) { claimresponse.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getInsurance().get(i0).setClaimResponse(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_Insrnc_Cvg ********************************************************************************/
		if(c.getClmRspsInsrncCvg() != null ) {

			String[] arrayi0 = c.getClmRspsInsrncCvg().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getInsurance().size() < i0+1) { claimresponse.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getInsurance().get(i0).setCoverage(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_Insrnc_Focal ********************************************************************************/
		if(c.getClmRspsInsrncFocal() != null ) {

			String[] arrayi0 = c.getClmRspsInsrncFocal().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getInsurance().size() < i0+1) { claimresponse.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getInsurance().get(i0).setFocal(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_Insrnc_Sqnc ********************************************************************************/
		if(c.getClmRspsInsrncSqnc() != null ) {

			String[] arrayi0 = c.getClmRspsInsrncSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getInsurance().size() < i0+1) { claimresponse.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getInsurance().get(i0).setSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_Insurer ********************************************************************************/
		if(c.getClmRspsInsurer() != null ) {

			if(c.getClmRspsInsurer().replace("[","").replace("]","").equals("NULL") | c.getClmRspsInsurer()==null) {} else {
			claimresponse.setInsurer(new org.hl7.fhir.r4.model.Reference(c.getClmRspsInsurer().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClmRsps_Itm_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(c.getClmRspsItmAdjdctnAmntCrncy() != null ) {

			String[] arrayi0 = c.getClmRspsItmAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getItem().get(i0).getAdjudication().get(i1).getAmount().setCurrency(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Itm_Adjdctn_Amnt_Vl ********************************************************************************/
		if(c.getClmRspsItmAdjdctnAmntVl() != null ) {

			String[] arrayi0 = c.getClmRspsItmAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getItem().get(i0).getAdjudication().get(i1).getAmount().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsItmAdjdctnCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsItmAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsItmAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { claimresponse.getItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsItmAdjdctnCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsItmAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsItmAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { claimresponse.getItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsItmAdjdctnCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsItmAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsItmAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { claimresponse.getItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsItmAdjdctnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsItmAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsItmAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { claimresponse.getItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsItmAdjdctnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsItmAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsItmAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { claimresponse.getItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(c.getClmRspsItmAdjdctnCtgryTxt() != null ) {

			String[] arrayi0 = c.getClmRspsItmAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getItem().get(i0).getAdjudication().get(i1).getCategory().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsItmAdjdctnRsnCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsItmAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsItmAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { claimresponse.getItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsItmAdjdctnRsnCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsItmAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsItmAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { claimresponse.getItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		return Claims_Extended2( c, claimresponse); 
	}
		public org.hl7.fhir.r4.model.ClaimResponse Claims_Extended2(ClaimResponse c, org.hl7.fhir.r4.model.ClaimResponse claimresponse) throws ParseException
		{
		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsItmAdjdctnRsnCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsItmAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsItmAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { claimresponse.getItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsItmAdjdctnRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsItmAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsItmAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { claimresponse.getItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}

		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsItmAdjdctnRsnCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsItmAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = c.getClmRspsItmAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { claimresponse.getItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Adjdctn_Rsn_Txt ********************************************************************************/
		if(c.getClmRspsItmAdjdctnRsnTxt() != null ) {

			String[] arrayi0 = c.getClmRspsItmAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getItem().get(i0).getAdjudication().get(i1).getReason().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Itm_Adjdctn_Vl ********************************************************************************/
		if(c.getClmRspsItmAdjdctnVl() != null ) {

			String[] arrayi0 = c.getClmRspsItmAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getAdjudication().size() < i1+1) { claimresponse.getItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getItem().get(i0).getAdjudication().get(i1).setValue((Double.parseDouble((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnAmntCrncy() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getAmount().setCurrency(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnAmntVl() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getAmount().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsItmDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsItmDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsItmDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsItmDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsItmDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnCtgryTxt() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnRsnCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsItmDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnRsnCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsItmDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnRsnCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsItmDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsItmDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnRsnCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = c.getClmRspsItmDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnRsnTxt() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Vl ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnVl() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).setValue((Double.parseDouble((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_DtlSqnc ********************************************************************************/
		if(c.getClmRspsItmDtlDtlSqnc() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).setDetailSequence(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_NtNmbr ********************************************************************************/
		if(c.getClmRspsItmDtlNtNmbr() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).addNoteNumber(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnAmntCrncy() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlSubDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlSubDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlSubDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsItmDtlSubDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getAmount().setCurrency(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnAmntVl() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlSubDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlSubDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlSubDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsItmDtlSubDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getAmount().setValue((new java.math.BigDecimal((arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnCtgryTxt() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsItmDtlSubDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnRsnTxt() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlSubDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlSubDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlSubDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsItmDtlSubDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Vl ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnVl() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlSubDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlSubDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlSubDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = c.getClmRspsItmDtlSubDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).setValue((Double.parseDouble((arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_NtNmbr ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlNtNmbr() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlSubDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlSubDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlSubDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						for( String currListStrSplit : arrayi2[i2].replace("[","").replace("]","").replace("\"","").split(",")){
						if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addNoteNumber(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_SubDtlSqnc ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlSubDtlSqnc() != null ) {

			String[] arrayi0 = c.getClmRspsItmDtlSubDtlSubDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				String[] arrayi1 = c.getClmRspsItmDtlSubDtlSubDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getItem().get(i0).getDetail().size() < i1+1) { claimresponse.getItem().get(i0).addDetail(); }
					String[] arrayi2 = c.getClmRspsItmDtlSubDtlSubDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { claimresponse.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {claimresponse.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).setSubDetailSequence(Integer.parseInt(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ClmRsps_Itm_ItmSqnc ********************************************************************************/
		if(c.getClmRspsItmItmSqnc() != null ) {

			String[] arrayi0 = c.getClmRspsItmItmSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getItem().get(i0).setItemSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_Itm_NtNmbr ********************************************************************************/
		if(c.getClmRspsItmNtNmbr() != null ) {

			String[] arrayi0 = c.getClmRspsItmNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getItem().size() < i0+1) { claimresponse.addItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {claimresponse.getItem().get(i0).addNoteNumber(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClmRsps_Outcome ********************************************************************************/
		if(c.getClmRspsOutcome() != null ) {

			if(c.getClmRspsOutcome().replace("[","").replace("]","").equals("NULL") | c.getClmRspsOutcome()==null) {} else {
			claimresponse.setOutcome(new org.hl7.fhir.r4.model.ClaimResponse.RemittanceOutcomeEnumFactory().fromCode(c.getClmRspsOutcome().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClmRsps_Pnt ********************************************************************************/
		if(c.getClmRspsPnt() != null ) {

			if(c.getClmRspsPnt().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPnt()==null) {} else {
			claimresponse.setPatient(new org.hl7.fhir.r4.model.Reference(c.getClmRspsPnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClmRsps_PayeeTyp_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsPayeeTypCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsPayeeTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayeeType().getCoding().size() < i0+1) { claimresponse.getPayeeType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayeeType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_PayeeTyp_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsPayeeTypCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsPayeeTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayeeType().getCoding().size() < i0+1) { claimresponse.getPayeeType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayeeType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_PayeeTyp_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsPayeeTypCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsPayeeTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayeeType().getCoding().size() < i0+1) { claimresponse.getPayeeType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayeeType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_PayeeTyp_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsPayeeTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsPayeeTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayeeType().getCoding().size() < i0+1) { claimresponse.getPayeeType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayeeType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_PayeeTyp_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsPayeeTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsPayeeTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayeeType().getCoding().size() < i0+1) { claimresponse.getPayeeType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayeeType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_PayeeTyp_Txt ********************************************************************************/
		if(c.getClmRspsPayeeTypTxt() != null ) {

			if(c.getClmRspsPayeeTypTxt().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPayeeTypTxt()==null) {} else {
			claimresponse.getPayeeType().setText(c.getClmRspsPayeeTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClmRsps_Pymnt_Adjustment_Crncy ********************************************************************************/
		if(c.getClmRspsPymntAdjustmentCrncy() != null ) {

			if(c.getClmRspsPymntAdjustmentCrncy().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPymntAdjustmentCrncy()==null) {} else {
			claimresponse.getPayment().getAdjustment().setCurrency(c.getClmRspsPymntAdjustmentCrncy().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClmRsps_Pymnt_Adjustment_Vl ********************************************************************************/
		if(c.getClmRspsPymntAdjustmentVl() != null ) {

			if(c.getClmRspsPymntAdjustmentVl().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPymntAdjustmentVl()==null) {} else {
			claimresponse.getPayment().getAdjustment().setValue((new java.math.BigDecimal((c.getClmRspsPymntAdjustmentVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsPymntAdjustmentRsnCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsPymntAdjustmentRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayment().getAdjustmentReason().getCoding().size() < i0+1) { claimresponse.getPayment().getAdjustmentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayment().getAdjustmentReason().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsPymntAdjustmentRsnCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsPymntAdjustmentRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayment().getAdjustmentReason().getCoding().size() < i0+1) { claimresponse.getPayment().getAdjustmentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayment().getAdjustmentReason().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsPymntAdjustmentRsnCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsPymntAdjustmentRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayment().getAdjustmentReason().getCoding().size() < i0+1) { claimresponse.getPayment().getAdjustmentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayment().getAdjustmentReason().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsPymntAdjustmentRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsPymntAdjustmentRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayment().getAdjustmentReason().getCoding().size() < i0+1) { claimresponse.getPayment().getAdjustmentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayment().getAdjustmentReason().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsPymntAdjustmentRsnCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsPymntAdjustmentRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayment().getAdjustmentReason().getCoding().size() < i0+1) { claimresponse.getPayment().getAdjustmentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayment().getAdjustmentReason().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Pymnt_AdjustmentRsn_Txt ********************************************************************************/
		if(c.getClmRspsPymntAdjustmentRsnTxt() != null ) {

			if(c.getClmRspsPymntAdjustmentRsnTxt().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPymntAdjustmentRsnTxt()==null) {} else {
			claimresponse.getPayment().getAdjustmentReason().setText(c.getClmRspsPymntAdjustmentRsnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClmRsps_Pymnt_Amnt_Crncy ********************************************************************************/
		if(c.getClmRspsPymntAmntCrncy() != null ) {

			if(c.getClmRspsPymntAmntCrncy().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPymntAmntCrncy()==null) {} else {
			claimresponse.getPayment().getAmount().setCurrency(c.getClmRspsPymntAmntCrncy().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClmRsps_Pymnt_Amnt_Vl ********************************************************************************/
		if(c.getClmRspsPymntAmntVl() != null ) {

			if(c.getClmRspsPymntAmntVl().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPymntAmntVl()==null) {} else {
			claimresponse.getPayment().getAmount().setValue((new java.math.BigDecimal((c.getClmRspsPymntAmntVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ClmRsps_Pymnt_Dt ********************************************************************************/
		if(c.getClmRspsPymntDt() != null ) {

			if(c.getClmRspsPymntDt().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPymntDt()==null) {} else {
			claimresponse.getPayment().setDate(c.getClmRspsPymntDt().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPymntDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getClmRspsPymntDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClmRsps_Pymnt_Id_Assigner ********************************************************************************/
		if(c.getClmRspsPymntIdAssigner() != null ) {

			if(c.getClmRspsPymntIdAssigner().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPymntIdAssigner()==null) {} else {
			claimresponse.getPayment().getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(c.getClmRspsPymntIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClmRsps_Pymnt_Id_Prd_End ********************************************************************************/
		if(c.getClmRspsPymntIdPrdEnd() != null ) {

			if(c.getClmRspsPymntIdPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPymntIdPrdEnd()==null) {} else {
			claimresponse.getPayment().getIdentifier().getPeriod().setEnd(c.getClmRspsPymntIdPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPymntIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getClmRspsPymntIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClmRsps_Pymnt_Id_Prd_Strt ********************************************************************************/
		if(c.getClmRspsPymntIdPrdStrt() != null ) {

			if(c.getClmRspsPymntIdPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPymntIdPrdStrt()==null) {} else {
			claimresponse.getPayment().getIdentifier().getPeriod().setStart(c.getClmRspsPymntIdPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPymntIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getClmRspsPymntIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClmRsps_Pymnt_Id_Sys ********************************************************************************/
		if(c.getClmRspsPymntIdSys() != null ) {

			if(c.getClmRspsPymntIdSys().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPymntIdSys()==null) {} else {
			claimresponse.getPayment().getIdentifier().setSystem(c.getClmRspsPymntIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsPymntIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsPymntIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayment().getIdentifier().getType().getCoding().size() < i0+1) { claimresponse.getPayment().getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayment().getIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsPymntIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsPymntIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayment().getIdentifier().getType().getCoding().size() < i0+1) { claimresponse.getPayment().getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayment().getIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsPymntIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsPymntIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayment().getIdentifier().getType().getCoding().size() < i0+1) { claimresponse.getPayment().getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayment().getIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsPymntIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsPymntIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayment().getIdentifier().getType().getCoding().size() < i0+1) { claimresponse.getPayment().getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayment().getIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsPymntIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsPymntIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayment().getIdentifier().getType().getCoding().size() < i0+1) { claimresponse.getPayment().getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayment().getIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Pymnt_Id_Typ_Txt ********************************************************************************/
		if(c.getClmRspsPymntIdTypTxt() != null ) {

			if(c.getClmRspsPymntIdTypTxt().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPymntIdTypTxt()==null) {} else {
			claimresponse.getPayment().getIdentifier().getType().setText(c.getClmRspsPymntIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClmRsps_Pymnt_Id_Use ********************************************************************************/
		if(c.getClmRspsPymntIdUse() != null ) {

			if(c.getClmRspsPymntIdUse().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPymntIdUse()==null) {} else {
			claimresponse.getPayment().getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(c.getClmRspsPymntIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClmRsps_Pymnt_Id_Vl ********************************************************************************/
		if(c.getClmRspsPymntIdVl() != null ) {

			if(c.getClmRspsPymntIdVl().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPymntIdVl()==null) {} else {
			claimresponse.getPayment().getIdentifier().setValue(c.getClmRspsPymntIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClmRsps_Pymnt_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsPymntTypCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsPymntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayment().getType().getCoding().size() < i0+1) { claimresponse.getPayment().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayment().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Pymnt_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsPymntTypCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsPymntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayment().getType().getCoding().size() < i0+1) { claimresponse.getPayment().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayment().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Pymnt_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsPymntTypCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsPymntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayment().getType().getCoding().size() < i0+1) { claimresponse.getPayment().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayment().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Pymnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsPymntTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsPymntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayment().getType().getCoding().size() < i0+1) { claimresponse.getPayment().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayment().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_Pymnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsPymntTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsPymntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getPayment().getType().getCoding().size() < i0+1) { claimresponse.getPayment().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getPayment().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Pymnt_Typ_Txt ********************************************************************************/
		if(c.getClmRspsPymntTypTxt() != null ) {

			if(c.getClmRspsPymntTypTxt().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPymntTypTxt()==null) {} else {
			claimresponse.getPayment().getType().setText(c.getClmRspsPymntTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClmRsps_PreAuthPrd_End ********************************************************************************/
		if(c.getClmRspsPreAuthPrdEnd() != null ) {

			if(c.getClmRspsPreAuthPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPreAuthPrdEnd()==null) {} else {
			claimresponse.getPreAuthPeriod().setEnd(c.getClmRspsPreAuthPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPreAuthPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getClmRspsPreAuthPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClmRsps_PreAuthPrd_Strt ********************************************************************************/
		if(c.getClmRspsPreAuthPrdStrt() != null ) {

			if(c.getClmRspsPreAuthPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPreAuthPrdStrt()==null) {} else {
			claimresponse.getPreAuthPeriod().setStart(c.getClmRspsPreAuthPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPreAuthPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getClmRspsPreAuthPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClmRsps_PreAuthRef ********************************************************************************/
		if(c.getClmRspsPreAuthRef() != null ) {

			if(c.getClmRspsPreAuthRef().replace("[","").replace("]","").equals("NULL") | c.getClmRspsPreAuthRef()==null) {} else {
			claimresponse.setPreAuthRef(c.getClmRspsPreAuthRef().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsProcessNtLnguageCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsProcessNtLnguageCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getProcessNote().size() < i0+1) { claimresponse.addProcessNote(); }
				String[] arrayi1 = c.getClmRspsProcessNtLnguageCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getProcessNote().get(i0).getLanguage().getCoding().size() < i1+1) { claimresponse.getProcessNote().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getProcessNote().get(i0).getLanguage().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsProcessNtLnguageCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsProcessNtLnguageCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getProcessNote().size() < i0+1) { claimresponse.addProcessNote(); }
				String[] arrayi1 = c.getClmRspsProcessNtLnguageCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getProcessNote().get(i0).getLanguage().getCoding().size() < i1+1) { claimresponse.getProcessNote().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getProcessNote().get(i0).getLanguage().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsProcessNtLnguageCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsProcessNtLnguageCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getProcessNote().size() < i0+1) { claimresponse.addProcessNote(); }
				String[] arrayi1 = c.getClmRspsProcessNtLnguageCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getProcessNote().get(i0).getLanguage().getCoding().size() < i1+1) { claimresponse.getProcessNote().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getProcessNote().get(i0).getLanguage().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsProcessNtLnguageCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsProcessNtLnguageCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getProcessNote().size() < i0+1) { claimresponse.addProcessNote(); }
				String[] arrayi1 = c.getClmRspsProcessNtLnguageCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getProcessNote().get(i0).getLanguage().getCoding().size() < i1+1) { claimresponse.getProcessNote().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getProcessNote().get(i0).getLanguage().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsProcessNtLnguageCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsProcessNtLnguageCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getProcessNote().size() < i0+1) { claimresponse.addProcessNote(); }
				String[] arrayi1 = c.getClmRspsProcessNtLnguageCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getProcessNote().get(i0).getLanguage().getCoding().size() < i1+1) { claimresponse.getProcessNote().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getProcessNote().get(i0).getLanguage().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_ProcessNt_Lnguage_Txt ********************************************************************************/
		if(c.getClmRspsProcessNtLnguageTxt() != null ) {

			String[] arrayi0 = c.getClmRspsProcessNtLnguageTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getProcessNote().size() < i0+1) { claimresponse.addProcessNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getProcessNote().get(i0).getLanguage().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_ProcessNt_Nmbr ********************************************************************************/
		if(c.getClmRspsProcessNtNmbr() != null ) {

			String[] arrayi0 = c.getClmRspsProcessNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getProcessNote().size() < i0+1) { claimresponse.addProcessNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getProcessNote().get(i0).setNumber(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_ProcessNt_Txt ********************************************************************************/
		if(c.getClmRspsProcessNtTxt() != null ) {

			String[] arrayi0 = c.getClmRspsProcessNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getProcessNote().size() < i0+1) { claimresponse.addProcessNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getProcessNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_ProcessNt_Typ ********************************************************************************/
		if(c.getClmRspsProcessNtTyp() != null ) {

			String[] arrayi0 = c.getClmRspsProcessNtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getProcessNote().size() < i0+1) { claimresponse.addProcessNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getProcessNote().get(i0).setType(new org.hl7.fhir.r4.model.Enumerations.NoteTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_Rqst ********************************************************************************/
		if(c.getClmRspsRqst() != null ) {

			if(c.getClmRspsRqst().replace("[","").replace("]","").equals("NULL") | c.getClmRspsRqst()==null) {} else {
			claimresponse.setRequest(new org.hl7.fhir.r4.model.Reference(c.getClmRspsRqst().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClmRsps_Rqstor ********************************************************************************/
		if(c.getClmRspsRqstor() != null ) {

			if(c.getClmRspsRqstor().replace("[","").replace("]","").equals("NULL") | c.getClmRspsRqstor()==null) {} else {
			claimresponse.setRequestor(new org.hl7.fhir.r4.model.Reference(c.getClmRspsRqstor().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClmRsps_Sts ********************************************************************************/
		if(c.getClmRspsSts() != null ) {

			if(c.getClmRspsSts().replace("[","").replace("]","").equals("NULL") | c.getClmRspsSts()==null) {} else {
			claimresponse.setStatus(new org.hl7.fhir.r4.model.ClaimResponse.ClaimResponseStatusEnumFactory().fromCode(c.getClmRspsSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClmRsps_SubTyp_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsSubTypCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsSubTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getSubType().getCoding().size() < i0+1) { claimresponse.getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getSubType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_SubTyp_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsSubTypCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsSubTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getSubType().getCoding().size() < i0+1) { claimresponse.getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getSubType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_SubTyp_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsSubTypCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsSubTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getSubType().getCoding().size() < i0+1) { claimresponse.getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getSubType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsSubTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsSubTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getSubType().getCoding().size() < i0+1) { claimresponse.getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getSubType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsSubTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsSubTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getSubType().getCoding().size() < i0+1) { claimresponse.getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getSubType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_SubTyp_Txt ********************************************************************************/
		if(c.getClmRspsSubTypTxt() != null ) {

			if(c.getClmRspsSubTypTxt().replace("[","").replace("]","").equals("NULL") | c.getClmRspsSubTypTxt()==null) {} else {
			claimresponse.getSubType().setText(c.getClmRspsSubTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClmRsps_Total_Amnt_Crncy ********************************************************************************/
		if(c.getClmRspsTotalAmntCrncy() != null ) {

			String[] arrayi0 = c.getClmRspsTotalAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getTotal().size() < i0+1) { claimresponse.addTotal(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getTotal().get(i0).getAmount().setCurrency(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Total_Amnt_Vl ********************************************************************************/
		if(c.getClmRspsTotalAmntVl() != null ) {

			String[] arrayi0 = c.getClmRspsTotalAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getTotal().size() < i0+1) { claimresponse.addTotal(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getTotal().get(i0).getAmount().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ClmRsps_Total_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsTotalCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsTotalCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getTotal().size() < i0+1) { claimresponse.addTotal(); }
				String[] arrayi1 = c.getClmRspsTotalCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getTotal().get(i0).getCategory().getCoding().size() < i1+1) { claimresponse.getTotal().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getTotal().get(i0).getCategory().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Total_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsTotalCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsTotalCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getTotal().size() < i0+1) { claimresponse.addTotal(); }
				String[] arrayi1 = c.getClmRspsTotalCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getTotal().get(i0).getCategory().getCoding().size() < i1+1) { claimresponse.getTotal().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getTotal().get(i0).getCategory().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Total_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsTotalCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsTotalCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getTotal().size() < i0+1) { claimresponse.addTotal(); }
				String[] arrayi1 = c.getClmRspsTotalCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getTotal().get(i0).getCategory().getCoding().size() < i1+1) { claimresponse.getTotal().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getTotal().get(i0).getCategory().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Total_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsTotalCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsTotalCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getTotal().size() < i0+1) { claimresponse.addTotal(); }
				String[] arrayi1 = c.getClmRspsTotalCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getTotal().get(i0).getCategory().getCoding().size() < i1+1) { claimresponse.getTotal().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getTotal().get(i0).getCategory().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClmRsps_Total_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsTotalCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsTotalCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getTotal().size() < i0+1) { claimresponse.addTotal(); }
				String[] arrayi1 = c.getClmRspsTotalCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(claimresponse.getTotal().get(i0).getCategory().getCoding().size() < i1+1) { claimresponse.getTotal().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {claimresponse.getTotal().get(i0).getCategory().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClmRsps_Total_Ctgry_Txt ********************************************************************************/
		if(c.getClmRspsTotalCtgryTxt() != null ) {

			String[] arrayi0 = c.getClmRspsTotalCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getTotal().size() < i0+1) { claimresponse.addTotal(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getTotal().get(i0).getCategory().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsTypCdgCd() != null ) {

			String[] arrayi0 = c.getClmRspsTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getType().getCoding().size() < i0+1) { claimresponse.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsTypCdgDsply() != null ) {

			String[] arrayi0 = c.getClmRspsTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getType().getCoding().size() < i0+1) { claimresponse.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsTypCdgSys() != null ) {

			String[] arrayi0 = c.getClmRspsTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getType().getCoding().size() < i0+1) { claimresponse.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClmRspsTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getType().getCoding().size() < i0+1) { claimresponse.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClmRsps_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getClmRspsTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(claimresponse.getType().getCoding().size() < i0+1) { claimresponse.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {claimresponse.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClmRsps_Typ_Txt ********************************************************************************/
		if(c.getClmRspsTypTxt() != null ) {

			if(c.getClmRspsTypTxt().replace("[","").replace("]","").equals("NULL") | c.getClmRspsTypTxt()==null) {} else {
			claimresponse.getType().setText(c.getClmRspsTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClmRsps_Use ********************************************************************************/
		if(c.getClmRspsUse() != null ) {

			if(c.getClmRspsUse().replace("[","").replace("]","").equals("NULL") | c.getClmRspsUse()==null) {} else {
			claimresponse.setUse(new org.hl7.fhir.r4.model.ClaimResponse.UseEnumFactory().fromCode(c.getClmRspsUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return claimresponse;
	}
}
