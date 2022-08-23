package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ExplanationOfBenefit;
public class ExplanationOfBenefitConversion 
{
	public org.hl7.fhir.r4.model.ExplanationOfBenefit ExplanationOfBenefits(ExplanationOfBenefit e) throws ParseException
	{
		org.hl7.fhir.r4.model.ExplanationOfBenefit explanationofbenefit = new org.hl7.fhir.r4.model.ExplanationOfBenefit();

		/******************** id ********************************************************************************/
		explanationofbenefit.setId(e.getId());

		/******************** ExplntnOfBnft_Accident_Dt ********************************************************************************/
		if(e.getExplntnOfBnftAccidentDt() != null ) {

			if(e.getExplntnOfBnftAccidentDt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftAccidentDt()==null) {} else {
			explanationofbenefit.getAccident().setDate(e.getExplntnOfBnftAccidentDt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftAccidentDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getExplntnOfBnftAccidentDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_City ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrCity() != null ) {

			if(e.getExplntnOfBnftAccidentLctnAddrCity().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftAccidentLctnAddrCity()==null) {} else {
			explanationofbenefit.getAccident().getLocationAddress().setCity(e.getExplntnOfBnftAccidentLctnAddrCity().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_Cntry ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrCntry() != null ) {

			if(e.getExplntnOfBnftAccidentLctnAddrCntry().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftAccidentLctnAddrCntry()==null) {} else {
			explanationofbenefit.getAccident().getLocationAddress().setCountry(e.getExplntnOfBnftAccidentLctnAddrCntry().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_District ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrDistrict() != null ) {

			if(e.getExplntnOfBnftAccidentLctnAddrDistrict().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftAccidentLctnAddrDistrict()==null) {} else {
			explanationofbenefit.getAccident().getLocationAddress().setDistrict(e.getExplntnOfBnftAccidentLctnAddrDistrict().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_Line ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrLine() != null ) {

				for( String currListStrSplit : e.getExplntnOfBnftAccidentLctnAddrLine().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			explanationofbenefit.getAccident().getLocationAddress().addLine(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_Prd_End ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrPrdEnd() != null ) {

			if(e.getExplntnOfBnftAccidentLctnAddrPrdEnd().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftAccidentLctnAddrPrdEnd()==null) {} else {
			explanationofbenefit.getAccident().getLocationAddress().getPeriod().setEnd(e.getExplntnOfBnftAccidentLctnAddrPrdEnd().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftAccidentLctnAddrPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getExplntnOfBnftAccidentLctnAddrPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_Prd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrPrdStrt() != null ) {

			if(e.getExplntnOfBnftAccidentLctnAddrPrdStrt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftAccidentLctnAddrPrdStrt()==null) {} else {
			explanationofbenefit.getAccident().getLocationAddress().getPeriod().setStart(e.getExplntnOfBnftAccidentLctnAddrPrdStrt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftAccidentLctnAddrPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getExplntnOfBnftAccidentLctnAddrPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_PostalCd ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrPostalCd() != null ) {

			if(e.getExplntnOfBnftAccidentLctnAddrPostalCd().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftAccidentLctnAddrPostalCd()==null) {} else {
			explanationofbenefit.getAccident().getLocationAddress().setPostalCode(e.getExplntnOfBnftAccidentLctnAddrPostalCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_State ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrState() != null ) {

			if(e.getExplntnOfBnftAccidentLctnAddrState().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftAccidentLctnAddrState()==null) {} else {
			explanationofbenefit.getAccident().getLocationAddress().setState(e.getExplntnOfBnftAccidentLctnAddrState().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrTxt() != null ) {

			if(e.getExplntnOfBnftAccidentLctnAddrTxt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftAccidentLctnAddrTxt()==null) {} else {
			explanationofbenefit.getAccident().getLocationAddress().setText(e.getExplntnOfBnftAccidentLctnAddrTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_Typ ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrTyp() != null ) {

			if(e.getExplntnOfBnftAccidentLctnAddrTyp().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftAccidentLctnAddrTyp()==null) {} else {
			explanationofbenefit.getAccident().getLocationAddress().setType(new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory().fromCode(e.getExplntnOfBnftAccidentLctnAddrTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_Use ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrUse() != null ) {

			if(e.getExplntnOfBnftAccidentLctnAddrUse().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftAccidentLctnAddrUse()==null) {} else {
			explanationofbenefit.getAccident().getLocationAddress().setUse(new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory().fromCode(e.getExplntnOfBnftAccidentLctnAddrUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Accident_LctnRfrnc ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnRfrnc() != null ) {

			if(e.getExplntnOfBnftAccidentLctnRfrnc().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftAccidentLctnRfrnc()==null) {} else {
			explanationofbenefit.getAccident().setLocation(new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftAccidentLctnRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Accident_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAccidentTypCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAccidentTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAccident().getType().getCoding().size() < i0+1) { explanationofbenefit.getAccident().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAccident().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Accident_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAccidentTypCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAccidentTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAccident().getType().getCoding().size() < i0+1) { explanationofbenefit.getAccident().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAccident().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Accident_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAccidentTypCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAccidentTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAccident().getType().getCoding().size() < i0+1) { explanationofbenefit.getAccident().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAccident().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Accident_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAccidentTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAccidentTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAccident().getType().getCoding().size() < i0+1) { explanationofbenefit.getAccident().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAccident().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Accident_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAccidentTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAccidentTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAccident().getType().getCoding().size() < i0+1) { explanationofbenefit.getAccident().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAccident().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Accident_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAccidentTypTxt() != null ) {

			if(e.getExplntnOfBnftAccidentTypTxt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftAccidentTypTxt()==null) {} else {
			explanationofbenefit.getAccident().getType().setText(e.getExplntnOfBnftAccidentTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnAmntCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getAmount().setCurrency(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Amnt_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnAmntVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getAmount().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnCtgryCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnCtgryCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnCtgryCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnCtgryTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getCategory().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnRsnCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnRsnCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnRsnCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnRsnCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnRsnTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).getReason().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getAdjudication().get(i1).setValue((Double.parseDouble((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmBodySiteCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getBodySite().getCoding().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getBodySite().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmBodySiteCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getBodySite().getCoding().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getBodySite().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmBodySiteCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getBodySite().getCoding().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getBodySite().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmBodySiteCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getBodySite().getCoding().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getBodySite().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmBodySiteCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getBodySite().getCoding().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getBodySite().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_BodySite_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmBodySiteTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmBodySiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getBodySite().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnAmntCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getAmount().setCurrency(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnAmntVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getAmount().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnCtgryTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnRsnTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).setValue((Double.parseDouble((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Factor ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlFactor() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).setFactor((Double.parseDouble((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlMdfrCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlMdfrCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlMdfrCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlMdfrCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlMdfrCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlMdfrTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addModifier(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getModifier().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Net_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlNetCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getNet().setCurrency(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Net_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlNetVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getNet().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_NtNmbr ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlNtNmbr() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addNoteNumber(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlPrdctOrSrvTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getProductOrService().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Qnty_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlQntyCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Qnty_Cmprtr ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlQntyCmprtr() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Qnty_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlQntySys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Qnty_Unt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlQntyUnt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Qnty_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlQntyVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getAmount().setCurrency(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getAmount().setValue((new java.math.BigDecimal((arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		return ExplanationOfBenefits_Extended5( e, explanationofbenefit);
	}
		public org.hl7.fhir.r4.model.ExplanationOfBenefit ExplanationOfBenefits_Extended5(ExplanationOfBenefit e, org.hl7.fhir.r4.model.ExplanationOfBenefit explanationofbenefit) throws ParseException
		{
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).setValue((Double.parseDouble((arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Factor ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlFactor() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).setFactor((Double.parseDouble((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlMdfrTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Net_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlNetCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getNet().setCurrency(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Net_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlNetVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getNet().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_NtNmbr ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlNtNmbr() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						for( String currListStrSplit : arrayi2[i2].replace("[","").replace("]","").replace("\"","").split(",")){
						if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addNoteNumber(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Qnty_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlQntyCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Qnty_Cmprtr ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlQntyCmprtr() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Qnty_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlQntySys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Qnty_Unt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlQntyUnt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Qnty_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlQntyVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_UntPrice_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlUntPriceCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getUnitPrice().setCurrency(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_UntPrice_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlUntPriceVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSubDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlSubDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmDtlSubDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getUnitPrice().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_UntPrice_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlUntPriceCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getUnitPrice().setCurrency(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Dtl_UntPrice_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlUntPriceVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getDetail().get(i1).getUnitPrice().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_DtlSqnc ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSqnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getAddItem().get(i0).addDetailSequence(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Factor ********************************************************************************/
		if(e.getExplntnOfBnftAddItmFactor() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).setFactor((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_ItmSqnc ********************************************************************************/
		if(e.getExplntnOfBnftAddItmItmSqnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmItmSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getAddItem().get(i0).addItemSequence(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_City ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrCity() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmLctnAddrCity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getLocationAddress().setCity(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_Cntry ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrCntry() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmLctnAddrCntry().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getLocationAddress().setCountry(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_District ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrDistrict() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmLctnAddrDistrict().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getLocationAddress().setDistrict(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_Line ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrLine() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmLctnAddrLine().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getAddItem().get(i0).getLocationAddress().addLine(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_Prd_End ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrPrdEnd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmLctnAddrPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getLocationAddress().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_Prd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrPrdStrt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmLctnAddrPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getLocationAddress().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_PostalCd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrPostalCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmLctnAddrPostalCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getLocationAddress().setPostalCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_State ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrState() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmLctnAddrState().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getLocationAddress().setState(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmLctnAddrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getLocationAddress().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_Typ ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrTyp() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmLctnAddrTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getLocationAddress().setType(new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_Use ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrUse() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmLctnAddrUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getLocationAddress().setUse(new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmLctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmLctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmLctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmLctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmLctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmLctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmLctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmLctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmLctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmLctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnCdbleCncptTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmLctnCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getLocationCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_LctnRfrnc ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnRfrnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmLctnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).setLocation(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmMdfrCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getModifier().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addModifier(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getModifier().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmMdfrCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getModifier().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addModifier(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getModifier().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmMdfrCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getModifier().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addModifier(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getModifier().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmMdfrCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getModifier().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addModifier(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getModifier().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmMdfrCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getModifier().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addModifier(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getModifier().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Mdfr_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmMdfrTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getModifier().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addModifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getModifier().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Net_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAddItmNetCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getNet().setCurrency(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_Net_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmNetVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getNet().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_NtNmbr ********************************************************************************/
		if(e.getExplntnOfBnftAddItmNtNmbr() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getAddItem().get(i0).addNoteNumber(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrdctOrSrvCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getProductOrService().getCoding().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getProductOrService().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrdctOrSrvCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getProductOrService().getCoding().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getProductOrService().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrdctOrSrvCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getProductOrService().getCoding().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getProductOrService().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrdctOrSrvCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getProductOrService().getCoding().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getProductOrService().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrdctOrSrvCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getProductOrService().getCoding().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getProductOrService().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		return ExplanationOfBenefits_Extended4( e, explanationofbenefit);
	}
		public org.hl7.fhir.r4.model.ExplanationOfBenefit ExplanationOfBenefits_Extended4(ExplanationOfBenefit e, org.hl7.fhir.r4.model.ExplanationOfBenefit explanationofbenefit) throws ParseException
		{
		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrdctOrSrvTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getProductOrService().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrgrmCdCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getProgramCode().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addProgramCode(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrgrmCdCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getProgramCode().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addProgramCode(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrgrmCdCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getProgramCode().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addProgramCode(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrgrmCdCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getProgramCode().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addProgramCode(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrgrmCdCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getProgramCode().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addProgramCode(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrgrmCdTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getProgramCode().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addProgramCode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getProgramCode().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Provider ********************************************************************************/
		if(e.getExplntnOfBnftAddItmProvider() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmProvider().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getAddItem().get(i0).addProvider(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_Qnty_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmQntyCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_Qnty_Cmprtr ********************************************************************************/
		if(e.getExplntnOfBnftAddItmQntyCmprtr() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_Qnty_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmQntySys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_Qnty_Unt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmQntyUnt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_Qnty_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmQntyVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_SrvdDtTyp ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSrvdDtTyp() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmSrvdDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).setServiced(new org.hl7.fhir.r4.model.DateType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_SrvdPrd_End ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSrvdPrdEnd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmSrvdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getServicedPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_SrvdPrd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSrvdPrdStrt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmSrvdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getServicedPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_SubDtlSqnc ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSubDtlSqnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmSubDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getAddItem().get(i0).addSubDetailSequence(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSubSiteCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmSubSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmSubSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getSubSite().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addSubSite(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmSubSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSubSiteCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmSubSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmSubSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getSubSite().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addSubSite(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmSubSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSubSiteCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmSubSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmSubSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getSubSite().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addSubSite(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmSubSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSubSiteCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmSubSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmSubSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getSubSite().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addSubSite(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmSubSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSubSiteCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmSubSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmSubSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getSubSite().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addSubSite(); }
					String[] arrayi2 = e.getExplntnOfBnftAddItmSubSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getAddItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getAddItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getAddItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_SubSite_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSubSiteTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmSubSiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				String[] arrayi1 = e.getExplntnOfBnftAddItmSubSiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAddItem().get(i0).getSubSite().size() < i1+1) { explanationofbenefit.getAddItem().get(i0).addSubSite(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAddItem().get(i0).getSubSite().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_AddItm_UntPrice_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAddItmUntPriceCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getUnitPrice().setCurrency(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_AddItm_UntPrice_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmUntPriceVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAddItmUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAddItem().size() < i0+1) { explanationofbenefit.addAddItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAddItem().get(i0).getUnitPrice().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ExplntnOfBnft_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnAmntCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAdjudication().size() < i0+1) { explanationofbenefit.addAdjudication(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAdjudication().get(i0).getAmount().setCurrency(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Adjdctn_Amnt_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnAmntVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAdjudication().size() < i0+1) { explanationofbenefit.addAdjudication(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAdjudication().get(i0).getAmount().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnCtgryCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAdjudication().size() < i0+1) { explanationofbenefit.addAdjudication(); }
				String[] arrayi1 = e.getExplntnOfBnftAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAdjudication().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getAdjudication().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAdjudication().get(i0).getCategory().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnCtgryCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAdjudication().size() < i0+1) { explanationofbenefit.addAdjudication(); }
				String[] arrayi1 = e.getExplntnOfBnftAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAdjudication().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getAdjudication().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAdjudication().get(i0).getCategory().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnCtgryCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAdjudication().size() < i0+1) { explanationofbenefit.addAdjudication(); }
				String[] arrayi1 = e.getExplntnOfBnftAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAdjudication().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getAdjudication().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAdjudication().get(i0).getCategory().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAdjudication().size() < i0+1) { explanationofbenefit.addAdjudication(); }
				String[] arrayi1 = e.getExplntnOfBnftAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAdjudication().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getAdjudication().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAdjudication().get(i0).getCategory().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAdjudication().size() < i0+1) { explanationofbenefit.addAdjudication(); }
				String[] arrayi1 = e.getExplntnOfBnftAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAdjudication().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getAdjudication().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAdjudication().get(i0).getCategory().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnCtgryTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAdjudication().size() < i0+1) { explanationofbenefit.addAdjudication(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAdjudication().get(i0).getCategory().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnRsnCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAdjudication().size() < i0+1) { explanationofbenefit.addAdjudication(); }
				String[] arrayi1 = e.getExplntnOfBnftAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAdjudication().get(i0).getReason().getCoding().size() < i1+1) { explanationofbenefit.getAdjudication().get(i0).getReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAdjudication().get(i0).getReason().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnRsnCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAdjudication().size() < i0+1) { explanationofbenefit.addAdjudication(); }
				String[] arrayi1 = e.getExplntnOfBnftAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAdjudication().get(i0).getReason().getCoding().size() < i1+1) { explanationofbenefit.getAdjudication().get(i0).getReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAdjudication().get(i0).getReason().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnRsnCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAdjudication().size() < i0+1) { explanationofbenefit.addAdjudication(); }
				String[] arrayi1 = e.getExplntnOfBnftAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAdjudication().get(i0).getReason().getCoding().size() < i1+1) { explanationofbenefit.getAdjudication().get(i0).getReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAdjudication().get(i0).getReason().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAdjudication().size() < i0+1) { explanationofbenefit.addAdjudication(); }
				String[] arrayi1 = e.getExplntnOfBnftAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAdjudication().get(i0).getReason().getCoding().size() < i1+1) { explanationofbenefit.getAdjudication().get(i0).getReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAdjudication().get(i0).getReason().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnRsnCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAdjudication().size() < i0+1) { explanationofbenefit.addAdjudication(); }
				String[] arrayi1 = e.getExplntnOfBnftAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getAdjudication().get(i0).getReason().getCoding().size() < i1+1) { explanationofbenefit.getAdjudication().get(i0).getReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getAdjudication().get(i0).getReason().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Adjdctn_Rsn_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnRsnTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAdjudication().size() < i0+1) { explanationofbenefit.addAdjudication(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAdjudication().get(i0).getReason().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Adjdctn_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getAdjudication().size() < i0+1) { explanationofbenefit.addAdjudication(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getAdjudication().get(i0).setValue((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceCtgryCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getCategory().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceCtgryCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getCategory().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceCtgryCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getCategory().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getCategory().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceCtgryCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getCategory().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceCtgryTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getCategory().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Dscrptn ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceDscrptn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Excluded ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceExcluded() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceExcluded().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).setExcluded(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_AllowedMoney_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialAllowedMoneyCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceFinancialAllowedMoneyCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceFinancialAllowedMoneyCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getFinancial().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).addFinancial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getAllowedMoney().setCurrency(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_AllowedMoney_Vl ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialAllowedMoneyVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceFinancialAllowedMoneyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceFinancialAllowedMoneyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getFinancial().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).addFinancial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getAllowedMoney().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_AllowedStrgTyp ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialAllowedStrgTyp() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceFinancialAllowedStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceFinancialAllowedStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getFinancial().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).addFinancial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).setAllowed(new org.hl7.fhir.r4.model.StringType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_AllowedUnsignedIntTyp ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialAllowedUnsignedIntTyp() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceFinancialAllowedUnsignedIntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceFinancialAllowedUnsignedIntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getFinancial().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).addFinancial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).setAllowed(new org.hl7.fhir.r4.model.UnsignedIntType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialTypCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceFinancialTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceFinancialTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getFinancial().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).addFinancial(); }
					String[] arrayi2 = e.getExplntnOfBnftBnftBalanceFinancialTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getType().getCoding().size() < i2+1) { explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialTypCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceFinancialTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceFinancialTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getFinancial().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).addFinancial(); }
					String[] arrayi2 = e.getExplntnOfBnftBnftBalanceFinancialTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getType().getCoding().size() < i2+1) { explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialTypCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceFinancialTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceFinancialTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getFinancial().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).addFinancial(); }
					String[] arrayi2 = e.getExplntnOfBnftBnftBalanceFinancialTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getType().getCoding().size() < i2+1) { explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceFinancialTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceFinancialTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getFinancial().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).addFinancial(); }
					String[] arrayi2 = e.getExplntnOfBnftBnftBalanceFinancialTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getType().getCoding().size() < i2+1) { explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceFinancialTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceFinancialTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getFinancial().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).addFinancial(); }
					String[] arrayi2 = e.getExplntnOfBnftBnftBalanceFinancialTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getType().getCoding().size() < i2+1) { explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialTypTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceFinancialTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceFinancialTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getFinancial().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).addFinancial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_UsedMoney_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialUsedMoneyCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceFinancialUsedMoneyCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceFinancialUsedMoneyCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getFinancial().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).addFinancial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getUsedMoney().setCurrency(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_UsedMoney_Vl ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialUsedMoneyVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceFinancialUsedMoneyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceFinancialUsedMoneyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getFinancial().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).addFinancial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).getUsedMoney().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_UsedUnsignedIntTyp ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialUsedUnsignedIntTyp() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceFinancialUsedUnsignedIntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceFinancialUsedUnsignedIntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getFinancial().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).addFinancial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getFinancial().get(i1).setUsed(new org.hl7.fhir.r4.model.UnsignedIntType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Nm ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceNm() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceNetworkCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceNetworkCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceNetworkCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getNetwork().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getNetwork().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getNetwork().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceNetworkCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceNetworkCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceNetworkCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getNetwork().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getNetwork().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getNetwork().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceNetworkCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceNetworkCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceNetworkCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getNetwork().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getNetwork().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getNetwork().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceNetworkCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceNetworkCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceNetworkCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getNetwork().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getNetwork().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getNetwork().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceNetworkCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceNetworkCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceNetworkCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getNetwork().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getNetwork().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getNetwork().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Network_Txt ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceNetworkTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceNetworkTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getNetwork().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceTrmCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceTrmCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceTrmCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getTerm().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getTerm().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getTerm().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceTrmCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceTrmCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceTrmCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getTerm().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getTerm().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getTerm().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceTrmCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceTrmCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceTrmCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getTerm().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getTerm().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getTerm().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceTrmCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceTrmCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceTrmCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getTerm().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getTerm().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getTerm().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceTrmCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceTrmCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceTrmCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getTerm().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getTerm().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getTerm().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Trm_Txt ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceTrmTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceTrmTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getTerm().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceUntCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceUntCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceUntCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getUnit().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getUnit().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getUnit().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceUntCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceUntCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceUntCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getUnit().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getUnit().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getUnit().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceUntCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceUntCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceUntCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getUnit().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getUnit().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getUnit().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceUntCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceUntCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceUntCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getUnit().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getUnit().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getUnit().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceUntCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceUntCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				String[] arrayi1 = e.getExplntnOfBnftBnftBalanceUntCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getBenefitBalance().get(i0).getUnit().getCoding().size() < i1+1) { explanationofbenefit.getBenefitBalance().get(i0).getUnit().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getUnit().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_BnftBalance_Unt_Txt ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceUntTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftBnftBalanceUntTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getBenefitBalance().size() < i0+1) { explanationofbenefit.addBenefitBalance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getBenefitBalance().get(i0).getUnit().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_BnftPrd_End ********************************************************************************/
		if(e.getExplntnOfBnftBnftPrdEnd() != null ) {

			if(e.getExplntnOfBnftBnftPrdEnd().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftBnftPrdEnd()==null) {} else {
			explanationofbenefit.getBenefitPeriod().setEnd(e.getExplntnOfBnftBnftPrdEnd().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftBnftPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getExplntnOfBnftBnftPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_BnftPrd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftBnftPrdStrt() != null ) {

			if(e.getExplntnOfBnftBnftPrdStrt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftBnftPrdStrt()==null) {} else {
			explanationofbenefit.getBenefitPeriod().setStart(e.getExplntnOfBnftBnftPrdStrt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftBnftPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getExplntnOfBnftBnftPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_BillablePrd_End ********************************************************************************/
		if(e.getExplntnOfBnftBillablePrdEnd() != null ) {

			if(e.getExplntnOfBnftBillablePrdEnd().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftBillablePrdEnd()==null) {} else {
			explanationofbenefit.getBillablePeriod().setEnd(e.getExplntnOfBnftBillablePrdEnd().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftBillablePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getExplntnOfBnftBillablePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_BillablePrd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftBillablePrdStrt() != null ) {

			if(e.getExplntnOfBnftBillablePrdStrt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftBillablePrdStrt()==null) {} else {
			explanationofbenefit.getBillablePeriod().setStart(e.getExplntnOfBnftBillablePrdStrt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftBillablePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getExplntnOfBnftBillablePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_CareTeam_Provider ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamProvider() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftCareTeamProvider().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getCareTeam().size() < i0+1) { explanationofbenefit.addCareTeam(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getCareTeam().get(i0).setProvider(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamQualificationCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftCareTeamQualificationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getCareTeam().size() < i0+1) { explanationofbenefit.addCareTeam(); }
				String[] arrayi1 = e.getExplntnOfBnftCareTeamQualificationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getCareTeam().get(i0).getQualification().getCoding().size() < i1+1) { explanationofbenefit.getCareTeam().get(i0).getQualification().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getCareTeam().get(i0).getQualification().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamQualificationCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftCareTeamQualificationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getCareTeam().size() < i0+1) { explanationofbenefit.addCareTeam(); }
				String[] arrayi1 = e.getExplntnOfBnftCareTeamQualificationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getCareTeam().get(i0).getQualification().getCoding().size() < i1+1) { explanationofbenefit.getCareTeam().get(i0).getQualification().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getCareTeam().get(i0).getQualification().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamQualificationCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftCareTeamQualificationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getCareTeam().size() < i0+1) { explanationofbenefit.addCareTeam(); }
				String[] arrayi1 = e.getExplntnOfBnftCareTeamQualificationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getCareTeam().get(i0).getQualification().getCoding().size() < i1+1) { explanationofbenefit.getCareTeam().get(i0).getQualification().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getCareTeam().get(i0).getQualification().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamQualificationCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftCareTeamQualificationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getCareTeam().size() < i0+1) { explanationofbenefit.addCareTeam(); }
				String[] arrayi1 = e.getExplntnOfBnftCareTeamQualificationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getCareTeam().get(i0).getQualification().getCoding().size() < i1+1) { explanationofbenefit.getCareTeam().get(i0).getQualification().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getCareTeam().get(i0).getQualification().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamQualificationCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftCareTeamQualificationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getCareTeam().size() < i0+1) { explanationofbenefit.addCareTeam(); }
				String[] arrayi1 = e.getExplntnOfBnftCareTeamQualificationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getCareTeam().get(i0).getQualification().getCoding().size() < i1+1) { explanationofbenefit.getCareTeam().get(i0).getQualification().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getCareTeam().get(i0).getQualification().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_CareTeam_Qualification_Txt ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamQualificationTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftCareTeamQualificationTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getCareTeam().size() < i0+1) { explanationofbenefit.addCareTeam(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getCareTeam().get(i0).getQualification().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_CareTeam_Responsible ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamResponsible() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftCareTeamResponsible().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getCareTeam().size() < i0+1) { explanationofbenefit.addCareTeam(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getCareTeam().get(i0).setResponsible(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamRoleCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftCareTeamRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getCareTeam().size() < i0+1) { explanationofbenefit.addCareTeam(); }
				String[] arrayi1 = e.getExplntnOfBnftCareTeamRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getCareTeam().get(i0).getRole().getCoding().size() < i1+1) { explanationofbenefit.getCareTeam().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getCareTeam().get(i0).getRole().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamRoleCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftCareTeamRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getCareTeam().size() < i0+1) { explanationofbenefit.addCareTeam(); }
				String[] arrayi1 = e.getExplntnOfBnftCareTeamRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getCareTeam().get(i0).getRole().getCoding().size() < i1+1) { explanationofbenefit.getCareTeam().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getCareTeam().get(i0).getRole().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamRoleCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftCareTeamRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getCareTeam().size() < i0+1) { explanationofbenefit.addCareTeam(); }
				String[] arrayi1 = e.getExplntnOfBnftCareTeamRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getCareTeam().get(i0).getRole().getCoding().size() < i1+1) { explanationofbenefit.getCareTeam().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getCareTeam().get(i0).getRole().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamRoleCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftCareTeamRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getCareTeam().size() < i0+1) { explanationofbenefit.addCareTeam(); }
				String[] arrayi1 = e.getExplntnOfBnftCareTeamRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getCareTeam().get(i0).getRole().getCoding().size() < i1+1) { explanationofbenefit.getCareTeam().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getCareTeam().get(i0).getRole().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamRoleCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftCareTeamRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getCareTeam().size() < i0+1) { explanationofbenefit.addCareTeam(); }
				String[] arrayi1 = e.getExplntnOfBnftCareTeamRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getCareTeam().get(i0).getRole().getCoding().size() < i1+1) { explanationofbenefit.getCareTeam().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getCareTeam().get(i0).getRole().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_CareTeam_Role_Txt ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamRoleTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftCareTeamRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getCareTeam().size() < i0+1) { explanationofbenefit.addCareTeam(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getCareTeam().get(i0).getRole().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_CareTeam_Sqnc ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamSqnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftCareTeamSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getCareTeam().size() < i0+1) { explanationofbenefit.addCareTeam(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getCareTeam().get(i0).setSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Clm ********************************************************************************/
		if(e.getExplntnOfBnftClm() != null ) {

			if(e.getExplntnOfBnftClm().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftClm()==null) {} else {
			explanationofbenefit.setClaim(new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftClm().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_ClmRsps ********************************************************************************/
		if(e.getExplntnOfBnftClmRsps() != null ) {

			if(e.getExplntnOfBnftClmRsps().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftClmRsps()==null) {} else {
			explanationofbenefit.setClaimResponse(new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftClmRsps().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Created ********************************************************************************/
		if(e.getExplntnOfBnftCreated() != null ) {

			if(e.getExplntnOfBnftCreated().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftCreated()==null) {} else {
			explanationofbenefit.setCreated(e.getExplntnOfBnftCreated().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftCreated()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getExplntnOfBnftCreated().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).getDiagnosisCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).getDiagnosisCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).getDiagnosisCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).getDiagnosisCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).getDiagnosisCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getDiagnosisCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Txt ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisDgnsisCdbleCncptTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisDgnsisCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getDiagnosisCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_DgnsisRfrnc ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisDgnsisRfrnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisDgnsisRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).setDiagnosis(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisOnAdmissionCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisOnAdmissionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisOnAdmissionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getOnAdmission().getCoding().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).getOnAdmission().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getOnAdmission().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisOnAdmissionCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisOnAdmissionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisOnAdmissionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getOnAdmission().getCoding().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).getOnAdmission().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getOnAdmission().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisOnAdmissionCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisOnAdmissionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisOnAdmissionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getOnAdmission().getCoding().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).getOnAdmission().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getOnAdmission().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisOnAdmissionCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisOnAdmissionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisOnAdmissionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getOnAdmission().getCoding().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).getOnAdmission().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getOnAdmission().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisOnAdmissionCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisOnAdmissionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisOnAdmissionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getOnAdmission().getCoding().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).getOnAdmission().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getOnAdmission().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Txt ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisOnAdmissionTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisOnAdmissionTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getOnAdmission().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisPckgCdCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisPckgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisPckgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getPackageCode().getCoding().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).getPackageCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getPackageCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisPckgCdCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisPckgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisPckgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getPackageCode().getCoding().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).getPackageCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getPackageCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisPckgCdCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisPckgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisPckgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getPackageCode().getCoding().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).getPackageCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getPackageCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisPckgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisPckgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisPckgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getPackageCode().getCoding().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).getPackageCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getPackageCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisPckgCdCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisPckgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisPckgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getPackageCode().getCoding().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).getPackageCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getPackageCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Txt ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisPckgCdTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisPckgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getPackageCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_Sqnc ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisSqnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).setSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisTypCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getType().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).addType(); }
					String[] arrayi2 = e.getExplntnOfBnftDgnsisTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getDiagnosis().get(i0).getType().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getDiagnosis().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getType().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisTypCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getType().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).addType(); }
					String[] arrayi2 = e.getExplntnOfBnftDgnsisTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getDiagnosis().get(i0).getType().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getDiagnosis().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getType().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisTypCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getType().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).addType(); }
					String[] arrayi2 = e.getExplntnOfBnftDgnsisTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getDiagnosis().get(i0).getType().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getDiagnosis().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getType().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getType().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).addType(); }
					String[] arrayi2 = e.getExplntnOfBnftDgnsisTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getDiagnosis().get(i0).getType().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getDiagnosis().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getType().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getType().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).addType(); }
					String[] arrayi2 = e.getExplntnOfBnftDgnsisTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getDiagnosis().get(i0).getType().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getDiagnosis().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getType().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Dgnsis_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisTypTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftDgnsisTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getDiagnosis().size() < i0+1) { explanationofbenefit.addDiagnosis(); }
				String[] arrayi1 = e.getExplntnOfBnftDgnsisTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getDiagnosis().get(i0).getType().size() < i1+1) { explanationofbenefit.getDiagnosis().get(i0).addType(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getDiagnosis().get(i0).getType().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Disposition ********************************************************************************/
		if(e.getExplntnOfBnftDisposition() != null ) {

			if(e.getExplntnOfBnftDisposition().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftDisposition()==null) {} else {
			explanationofbenefit.setDisposition(e.getExplntnOfBnftDisposition().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Enterer ********************************************************************************/
		if(e.getExplntnOfBnftEnterer() != null ) {

			if(e.getExplntnOfBnftEnterer().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftEnterer()==null) {} else {
			explanationofbenefit.setEnterer(new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftEnterer().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Facility ********************************************************************************/
		if(e.getExplntnOfBnftFacility() != null ) {

			if(e.getExplntnOfBnftFacility().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftFacility()==null) {} else {
			explanationofbenefit.setFacility(new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftFacility().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Frm_CntntTyp ********************************************************************************/
		if(e.getExplntnOfBnftFrmCntntTyp() != null ) {

			if(e.getExplntnOfBnftFrmCntntTyp().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftFrmCntntTyp()==null) {} else {
			explanationofbenefit.getForm().setContentType(e.getExplntnOfBnftFrmCntntTyp().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Frm_Creation ********************************************************************************/
		if(e.getExplntnOfBnftFrmCreation() != null ) {

			if(e.getExplntnOfBnftFrmCreation().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftFrmCreation()==null) {} else {
			explanationofbenefit.getForm().setCreation(e.getExplntnOfBnftFrmCreation().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftFrmCreation()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getExplntnOfBnftFrmCreation().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Frm_Data ********************************************************************************/
		if(e.getExplntnOfBnftFrmData() != null ) {

			if(e.getExplntnOfBnftFrmData().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftFrmData()==null) {} else {
			explanationofbenefit.getForm().setData(e.getExplntnOfBnftFrmData().getBytes());
			}
		}
		/******************** ExplntnOfBnft_Frm_Hash ********************************************************************************/
		if(e.getExplntnOfBnftFrmHash() != null ) {

			if(e.getExplntnOfBnftFrmHash().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftFrmHash()==null) {} else {
			explanationofbenefit.getForm().setHash(e.getExplntnOfBnftFrmHash().getBytes());
			}
		}
		/******************** ExplntnOfBnft_Frm_Lnguage ********************************************************************************/
		if(e.getExplntnOfBnftFrmLnguage() != null ) {

			if(e.getExplntnOfBnftFrmLnguage().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftFrmLnguage()==null) {} else {
			explanationofbenefit.getForm().setLanguage(e.getExplntnOfBnftFrmLnguage().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Frm_Sz ********************************************************************************/
		if(e.getExplntnOfBnftFrmSz() != null ) {

			if(e.getExplntnOfBnftFrmSz().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftFrmSz()==null) {} else {
			explanationofbenefit.getForm().setSize(Integer.parseInt(e.getExplntnOfBnftFrmSz().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Frm_Ttl ********************************************************************************/
		if(e.getExplntnOfBnftFrmTtl() != null ) {

			if(e.getExplntnOfBnftFrmTtl().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftFrmTtl()==null) {} else {
			explanationofbenefit.getForm().setTitle(e.getExplntnOfBnftFrmTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Frm_Url ********************************************************************************/
		if(e.getExplntnOfBnftFrmUrl() != null ) {

			if(e.getExplntnOfBnftFrmUrl().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftFrmUrl()==null) {} else {
			explanationofbenefit.getForm().setUrl(e.getExplntnOfBnftFrmUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_FrmCd_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftFrmCdCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftFrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getFormCode().getCoding().size() < i0+1) { explanationofbenefit.getFormCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getFormCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_FrmCd_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftFrmCdCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftFrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getFormCode().getCoding().size() < i0+1) { explanationofbenefit.getFormCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getFormCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_FrmCd_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftFrmCdCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftFrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getFormCode().getCoding().size() < i0+1) { explanationofbenefit.getFormCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getFormCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_FrmCd_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftFrmCdCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftFrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getFormCode().getCoding().size() < i0+1) { explanationofbenefit.getFormCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getFormCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_FrmCd_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftFrmCdCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftFrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getFormCode().getCoding().size() < i0+1) { explanationofbenefit.getFormCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getFormCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_FrmCd_Txt ********************************************************************************/
		if(e.getExplntnOfBnftFrmCdTxt() != null ) {

			if(e.getExplntnOfBnftFrmCdTxt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftFrmCdTxt()==null) {} else {
			explanationofbenefit.getFormCode().setText(e.getExplntnOfBnftFrmCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_FundsReserve_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftFundsReserveCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getFundsReserve().getCoding().size() < i0+1) { explanationofbenefit.getFundsReserve().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getFundsReserve().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_FundsReserve_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftFundsReserveCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getFundsReserve().getCoding().size() < i0+1) { explanationofbenefit.getFundsReserve().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getFundsReserve().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_FundsReserve_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftFundsReserveCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getFundsReserve().getCoding().size() < i0+1) { explanationofbenefit.getFundsReserve().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getFundsReserve().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_FundsReserve_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftFundsReserveCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getFundsReserve().getCoding().size() < i0+1) { explanationofbenefit.getFundsReserve().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getFundsReserve().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_FundsReserve_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftFundsReserveCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getFundsReserve().getCoding().size() < i0+1) { explanationofbenefit.getFundsReserve().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getFundsReserve().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_FundsReserve_Txt ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveTxt() != null ) {

			if(e.getExplntnOfBnftFundsReserveTxt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftFundsReserveTxt()==null) {} else {
			explanationofbenefit.getFundsReserve().setText(e.getExplntnOfBnftFundsReserveTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveRqstedCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftFundsReserveRqstedCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getFundsReserveRequested().getCoding().size() < i0+1) { explanationofbenefit.getFundsReserveRequested().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getFundsReserveRequested().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveRqstedCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftFundsReserveRqstedCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getFundsReserveRequested().getCoding().size() < i0+1) { explanationofbenefit.getFundsReserveRequested().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getFundsReserveRequested().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveRqstedCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftFundsReserveRqstedCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getFundsReserveRequested().getCoding().size() < i0+1) { explanationofbenefit.getFundsReserveRequested().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getFundsReserveRequested().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveRqstedCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftFundsReserveRqstedCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getFundsReserveRequested().getCoding().size() < i0+1) { explanationofbenefit.getFundsReserveRequested().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getFundsReserveRequested().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveRqstedCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftFundsReserveRqstedCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getFundsReserveRequested().getCoding().size() < i0+1) { explanationofbenefit.getFundsReserveRequested().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getFundsReserveRequested().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_FundsReserveRqsted_Txt ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveRqstedTxt() != null ) {

			if(e.getExplntnOfBnftFundsReserveRqstedTxt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftFundsReserveRqstedTxt()==null) {} else {
			explanationofbenefit.getFundsReserveRequested().setText(e.getExplntnOfBnftFundsReserveRqstedTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Id_Assigner ********************************************************************************/
		if(e.getExplntnOfBnftIdAssigner() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getIdentifier().size() < i0+1) { explanationofbenefit.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Id_Prd_End ********************************************************************************/
		if(e.getExplntnOfBnftIdPrdEnd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getIdentifier().size() < i0+1) { explanationofbenefit.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Id_Prd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftIdPrdStrt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getIdentifier().size() < i0+1) { explanationofbenefit.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Id_Sys ********************************************************************************/
		if(e.getExplntnOfBnftIdSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getIdentifier().size() < i0+1) { explanationofbenefit.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftIdTypCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getIdentifier().size() < i0+1) { explanationofbenefit.addIdentifier(); }
				String[] arrayi1 = e.getExplntnOfBnftIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { explanationofbenefit.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftIdTypCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getIdentifier().size() < i0+1) { explanationofbenefit.addIdentifier(); }
				String[] arrayi1 = e.getExplntnOfBnftIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { explanationofbenefit.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftIdTypCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getIdentifier().size() < i0+1) { explanationofbenefit.addIdentifier(); }
				String[] arrayi1 = e.getExplntnOfBnftIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { explanationofbenefit.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		return ExplanationOfBenefits_Extended( e, explanationofbenefit);
	}
		public org.hl7.fhir.r4.model.ExplanationOfBenefit ExplanationOfBenefits_Extended(ExplanationOfBenefit e, org.hl7.fhir.r4.model.ExplanationOfBenefit explanationofbenefit) throws ParseException
		{
		/******************** ExplntnOfBnft_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getIdentifier().size() < i0+1) { explanationofbenefit.addIdentifier(); }
				String[] arrayi1 = e.getExplntnOfBnftIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { explanationofbenefit.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftIdTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getIdentifier().size() < i0+1) { explanationofbenefit.addIdentifier(); }
				String[] arrayi1 = e.getExplntnOfBnftIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { explanationofbenefit.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Id_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftIdTypTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getIdentifier().size() < i0+1) { explanationofbenefit.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Id_Use ********************************************************************************/
		if(e.getExplntnOfBnftIdUse() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getIdentifier().size() < i0+1) { explanationofbenefit.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Id_Vl ********************************************************************************/
		if(e.getExplntnOfBnftIdVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getIdentifier().size() < i0+1) { explanationofbenefit.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Insrnc_Cvg ********************************************************************************/
		if(e.getExplntnOfBnftInsrncCvg() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftInsrncCvg().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getInsurance().size() < i0+1) { explanationofbenefit.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getInsurance().get(i0).setCoverage(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Insrnc_Focal ********************************************************************************/
		if(e.getExplntnOfBnftInsrncFocal() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftInsrncFocal().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getInsurance().size() < i0+1) { explanationofbenefit.addInsurance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getInsurance().get(i0).setFocal(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Insrnc_PreAuthRef ********************************************************************************/
		if(e.getExplntnOfBnftInsrncPreAuthRef() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftInsrncPreAuthRef().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getInsurance().size() < i0+1) { explanationofbenefit.addInsurance(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getInsurance().get(i0).addPreAuthRef(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Insurer ********************************************************************************/
		if(e.getExplntnOfBnftInsurer() != null ) {

			if(e.getExplntnOfBnftInsurer().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftInsurer()==null) {} else {
			explanationofbenefit.setInsurer(new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftInsurer().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnAmntCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getAmount().setCurrency(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Amnt_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnAmntVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getAmount().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnCtgryCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftItmAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnCtgryCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftItmAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnCtgryCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftItmAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftItmAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftItmAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getCategory().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnCtgryTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getCategory().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnRsnCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftItmAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnRsnCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftItmAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnRsnCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftItmAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftItmAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnRsnCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getItem().get(i0).addAdjudication(); }
					String[] arrayi2 = e.getExplntnOfBnftItmAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getReason().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getReason().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnRsnTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).getReason().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getAdjudication().size() < i1+1) { explanationofbenefit.getItem().get(i0).addAdjudication(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getAdjudication().get(i1).setValue((Double.parseDouble((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmBodySiteCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getBodySite().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getBodySite().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmBodySiteCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getBodySite().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getBodySite().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmBodySiteCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getBodySite().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getBodySite().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmBodySiteCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getBodySite().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getBodySite().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmBodySiteCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getBodySite().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getBodySite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getBodySite().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_BodySite_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmBodySiteTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmBodySiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getBodySite().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Itm_CareTeamSqnc ********************************************************************************/
		if(e.getExplntnOfBnftItmCareTeamSqnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmCareTeamSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getItem().get(i0).addCareTeamSequence(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmCtgryCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getCategory().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmCtgryCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getCategory().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmCtgryCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getCategory().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getCategory().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmCtgryCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getCategory().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmCtgryTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getCategory().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnAmntCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getAmount().setCurrency(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnAmntVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getAmount().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnCtgryTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getCategory().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnRsnCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnRsnCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnRsnCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnRsnCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnRsnTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).getReason().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addAdjudication(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getAdjudication().get(i2).setValue((Double.parseDouble((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlCtgryCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlCtgryCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlCtgryCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlCtgryCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getCategory().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getCategory().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlCtgryTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getCategory().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Factor ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlFactor() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).setFactor((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlMdfrCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlMdfrCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlMdfrCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlMdfrCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlMdfrCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addModifier(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlMdfrTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addModifier(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getModifier().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Net_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlNetCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getNet().setCurrency(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Net_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlNetVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getNet().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_NtNmbr ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlNtNmbr() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).addNoteNumber(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrdctOrSrvCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrdctOrSrvCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrdctOrSrvCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrdctOrSrvCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrdctOrSrvCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProductOrService().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProductOrService().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrdctOrSrvTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProductOrService().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrgrmCdCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addProgramCode(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrgrmCdCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addProgramCode(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrgrmCdCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addProgramCode(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrgrmCdCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addProgramCode(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrgrmCdCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addProgramCode(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrgrmCdTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addProgramCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getProgramCode().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Qnty_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlQntyCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Qnty_Cmprtr ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlQntyCmprtr() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Qnty_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlQntySys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Qnty_Unt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlQntyUnt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Qnty_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlQntyVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlRevenueCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlRevenueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlRevenueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlRevenueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getRevenue().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlRevenueCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlRevenueCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlRevenueCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlRevenueCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getRevenue().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlRevenueCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlRevenueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlRevenueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlRevenueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getRevenue().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlRevenueCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlRevenueCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlRevenueCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlRevenueCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getRevenue().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlRevenueCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlRevenueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlRevenueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlRevenueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getRevenue().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getRevenue().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlRevenueTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlRevenueTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlRevenueTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getRevenue().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Sqnc ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSqnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).setSequence(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnAmntCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getAmount().setCurrency(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnAmntVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getAmount().setValue((new java.math.BigDecimal((arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getCategory().setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).getReason().setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		return ExplanationOfBenefits_Extended2( e, explanationofbenefit);
		}
			public org.hl7.fhir.r4.model.ExplanationOfBenefit ExplanationOfBenefits_Extended2(ExplanationOfBenefit e, org.hl7.fhir.r4.model.ExplanationOfBenefit explanationofbenefit) throws ParseException
			{
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlAdjdctnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addAdjudication(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getAdjudication().get(i3).setValue((Double.parseDouble((arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlCtgryCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlCtgryCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlCtgryCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlCtgryCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlCtgryTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getCategory().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Factor ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlFactor() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).setFactor((Double.parseDouble((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlMdfrCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlMdfrCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlMdfrCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlMdfrCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlMdfrCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlMdfrTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addModifier(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getModifier().get(i3).setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Net_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlNetCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getNet().setCurrency(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Net_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlNetVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getNet().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_NtNmbr ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlNtNmbr() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						for( String currListStrSplit : arrayi2[i2].replace("[","").replace("]","").replace("\"","").split(",")){
						if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addNoteNumber(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProductOrService().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addProgramCode(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addProgramCode(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addProgramCode(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addProgramCode(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addProgramCode(); }
							String[] arrayi4 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().size() < i4+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrgrmCdTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addProgramCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getProgramCode().get(i3).setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Qnty_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlQntyCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Qnty_Cmprtr ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlQntyCmprtr() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Qnty_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlQntySys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Qnty_Unt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlQntyUnt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Qnty_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlQntyVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getQuantity().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlRevenueCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlRevenueCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlRevenueCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlRevenueCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlRevenueCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						String[] arrayi3 = e.getExplntnOfBnftItmDtlSubDtlRevenueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().size() < i3+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlRevenueTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlRevenueTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlRevenueTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlRevenueTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getRevenue().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Sqnc ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlSqnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).setSequence(Integer.parseInt(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Udi ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlUdi() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlUdi().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlUdi().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlUdi().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						for( String currListStrSplit : arrayi2[i2].replace("[","").replace("]","").replace("\"","").split(",")){
						if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).addUdi(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_UntPrice_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlUntPriceCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getUnitPrice().setCurrency(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_UntPrice_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlUntPriceVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlSubDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlSubDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					String[] arrayi2 = e.getExplntnOfBnftItmDtlSubDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().size() < i2+1) { explanationofbenefit.getItem().get(i0).getDetail().get(i1).addSubDetail(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getSubDetail().get(i2).getUnitPrice().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_Udi ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlUdi() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlUdi().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlUdi().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).addUdi(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		
		/******************** ExplntnOfBnft_Itm_Dtl_UntPrice_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlUntPriceCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getUnitPrice().setCurrency(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Dtl_UntPrice_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlUntPriceVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmDtlUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getDetail().size() < i1+1) { explanationofbenefit.getItem().get(i0).addDetail(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getDetail().get(i1).getUnitPrice().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_DgnsisSqnc ********************************************************************************/
		if(e.getExplntnOfBnftItmDgnsisSqnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmDgnsisSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getItem().get(i0).addDiagnosisSequence(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Enc ********************************************************************************/
		if(e.getExplntnOfBnftItmEnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmEnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getItem().get(i0).addEncounter(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Factor ********************************************************************************/
		if(e.getExplntnOfBnftItmFactor() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).setFactor((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ExplntnOfBnft_Itm_InfoSqnc ********************************************************************************/
		if(e.getExplntnOfBnftItmInfoSqnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmInfoSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getItem().get(i0).addInformationSequence(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_City ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrCity() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmLctnAddrCity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getLocationAddress().setCity(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_Cntry ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrCntry() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmLctnAddrCntry().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getLocationAddress().setCountry(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_District ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrDistrict() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmLctnAddrDistrict().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getLocationAddress().setDistrict(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_Line ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrLine() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmLctnAddrLine().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getItem().get(i0).getLocationAddress().addLine(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_Prd_End ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrPrdEnd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmLctnAddrPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getLocationAddress().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_Prd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrPrdStrt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmLctnAddrPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getLocationAddress().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_PostalCd ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrPostalCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmLctnAddrPostalCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getLocationAddress().setPostalCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_State ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrState() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmLctnAddrState().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getLocationAddress().setState(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmLctnAddrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getLocationAddress().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_Typ ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrTyp() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmLctnAddrTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getLocationAddress().setType(new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_Use ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrUse() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmLctnAddrUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getLocationAddress().setUse(new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmLctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmLctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmLctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmLctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmLctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmLctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmLctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmLctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmLctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmLctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getLocationCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getLocationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getLocationCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnCdbleCncptTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmLctnCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getLocationCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Itm_LctnRfrnc ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnRfrnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmLctnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).setLocation(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmMdfrCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getModifier().size() < i1+1) { explanationofbenefit.getItem().get(i0).addModifier(); }
					String[] arrayi2 = e.getExplntnOfBnftItmMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getModifier().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmMdfrCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getModifier().size() < i1+1) { explanationofbenefit.getItem().get(i0).addModifier(); }
					String[] arrayi2 = e.getExplntnOfBnftItmMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getModifier().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmMdfrCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getModifier().size() < i1+1) { explanationofbenefit.getItem().get(i0).addModifier(); }
					String[] arrayi2 = e.getExplntnOfBnftItmMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getModifier().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmMdfrCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getModifier().size() < i1+1) { explanationofbenefit.getItem().get(i0).addModifier(); }
					String[] arrayi2 = e.getExplntnOfBnftItmMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getModifier().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmMdfrCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getModifier().size() < i1+1) { explanationofbenefit.getItem().get(i0).addModifier(); }
					String[] arrayi2 = e.getExplntnOfBnftItmMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getModifier().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getModifier().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getModifier().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Mdfr_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmMdfrTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getModifier().size() < i1+1) { explanationofbenefit.getItem().get(i0).addModifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getModifier().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Net_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftItmNetCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmNetCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getNet().setCurrency(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Itm_Net_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmNetVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmNetVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getNet().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ExplntnOfBnft_Itm_NtNmbr ********************************************************************************/
		if(e.getExplntnOfBnftItmNtNmbr() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getItem().get(i0).addNoteNumber(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		
		/******************** ExplntnOfBnft_Itm_PrcdrSqnc ********************************************************************************/
		if(e.getExplntnOfBnftItmPrcdrSqnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmPrcdrSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getItem().get(i0).addProcedureSequence(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmPrdctOrSrvCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmPrdctOrSrvCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getProductOrService().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getProductOrService().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmPrdctOrSrvCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmPrdctOrSrvCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getProductOrService().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getProductOrService().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmPrdctOrSrvCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmPrdctOrSrvCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getProductOrService().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getProductOrService().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmPrdctOrSrvCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmPrdctOrSrvCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getProductOrService().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getProductOrService().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmPrdctOrSrvCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmPrdctOrSrvCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getProductOrService().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getProductOrService().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getProductOrService().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmPrdctOrSrvTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmPrdctOrSrvTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getProductOrService().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmPrgrmCdCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getProgramCode().size() < i1+1) { explanationofbenefit.getItem().get(i0).addProgramCode(); }
					String[] arrayi2 = e.getExplntnOfBnftItmPrgrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmPrgrmCdCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getProgramCode().size() < i1+1) { explanationofbenefit.getItem().get(i0).addProgramCode(); }
					String[] arrayi2 = e.getExplntnOfBnftItmPrgrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmPrgrmCdCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getProgramCode().size() < i1+1) { explanationofbenefit.getItem().get(i0).addProgramCode(); }
					String[] arrayi2 = e.getExplntnOfBnftItmPrgrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmPrgrmCdCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getProgramCode().size() < i1+1) { explanationofbenefit.getItem().get(i0).addProgramCode(); }
					String[] arrayi2 = e.getExplntnOfBnftItmPrgrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmPrgrmCdCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getProgramCode().size() < i1+1) { explanationofbenefit.getItem().get(i0).addProgramCode(); }
					String[] arrayi2 = e.getExplntnOfBnftItmPrgrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getProgramCode().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getProgramCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getProgramCode().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		
		/******************** ExplntnOfBnft_Itm_PrgrmCd_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmPrgrmCdTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmPrgrmCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getProgramCode().size() < i1+1) { explanationofbenefit.getItem().get(i0).addProgramCode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getProgramCode().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Qnty_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmQntyCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Itm_Qnty_Cmprtr ********************************************************************************/
		if(e.getExplntnOfBnftItmQntyCmprtr() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Itm_Qnty_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmQntySys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Itm_Qnty_Unt ********************************************************************************/
		if(e.getExplntnOfBnftItmQntyUnt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Itm_Qnty_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmQntyVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmRevenueCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmRevenueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmRevenueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getRevenue().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getRevenue().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getRevenue().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmRevenueCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmRevenueCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmRevenueCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getRevenue().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getRevenue().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getRevenue().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmRevenueCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmRevenueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmRevenueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getRevenue().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getRevenue().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getRevenue().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmRevenueCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmRevenueCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmRevenueCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getRevenue().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getRevenue().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getRevenue().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmRevenueCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmRevenueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmRevenueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getRevenue().getCoding().size() < i1+1) { explanationofbenefit.getItem().get(i0).getRevenue().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getRevenue().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Revenue_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmRevenueTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmRevenueTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getRevenue().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		return ExplanationOfBenefits_Extended3( e, explanationofbenefit);
			}
				public org.hl7.fhir.r4.model.ExplanationOfBenefit ExplanationOfBenefits_Extended3(ExplanationOfBenefit e, org.hl7.fhir.r4.model.ExplanationOfBenefit explanationofbenefit) throws ParseException
				{
		/******************** ExplntnOfBnft_Itm_Sqnc ********************************************************************************/
		if(e.getExplntnOfBnftItmSqnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).setSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Itm_SrvdDtTyp ********************************************************************************/
		if(e.getExplntnOfBnftItmSrvdDtTyp() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmSrvdDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).setServiced(new org.hl7.fhir.r4.model.DateType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Itm_SrvdPrd_End ********************************************************************************/
		if(e.getExplntnOfBnftItmSrvdPrdEnd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmSrvdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getServicedPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Itm_SrvdPrd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftItmSrvdPrdStrt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmSrvdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getServicedPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmSubSiteCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmSubSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmSubSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getSubSite().size() < i1+1) { explanationofbenefit.getItem().get(i0).addSubSite(); }
					String[] arrayi2 = e.getExplntnOfBnftItmSubSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmSubSiteCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmSubSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmSubSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getSubSite().size() < i1+1) { explanationofbenefit.getItem().get(i0).addSubSite(); }
					String[] arrayi2 = e.getExplntnOfBnftItmSubSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmSubSiteCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmSubSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmSubSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getSubSite().size() < i1+1) { explanationofbenefit.getItem().get(i0).addSubSite(); }
					String[] arrayi2 = e.getExplntnOfBnftItmSubSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmSubSiteCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmSubSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmSubSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getSubSite().size() < i1+1) { explanationofbenefit.getItem().get(i0).addSubSite(); }
					String[] arrayi2 = e.getExplntnOfBnftItmSubSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmSubSiteCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmSubSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmSubSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getSubSite().size() < i1+1) { explanationofbenefit.getItem().get(i0).addSubSite(); }
					String[] arrayi2 = e.getExplntnOfBnftItmSubSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getItem().get(i0).getSubSite().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getItem().get(i0).getSubSite().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getItem().get(i0).getSubSite().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_SubSite_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmSubSiteTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmSubSiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				String[] arrayi1 = e.getExplntnOfBnftItmSubSiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getItem().get(i0).getSubSite().size() < i1+1) { explanationofbenefit.getItem().get(i0).addSubSite(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getItem().get(i0).getSubSite().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_Udi ********************************************************************************/
		if(e.getExplntnOfBnftItmUdi() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmUdi().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getItem().get(i0).addUdi(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Itm_UntPrice_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftItmUntPriceCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmUntPriceCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getUnitPrice().setCurrency(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Itm_UntPrice_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmUntPriceVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftItmUntPriceVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getItem().size() < i0+1) { explanationofbenefit.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getItem().get(i0).getUnitPrice().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ExplntnOfBnft_OriginalPrescription ********************************************************************************/
		if(e.getExplntnOfBnftOriginalPrescription() != null ) {

			if(e.getExplntnOfBnftOriginalPrescription().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftOriginalPrescription()==null) {} else {
			explanationofbenefit.setOriginalPrescription(new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftOriginalPrescription().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Outcome ********************************************************************************/
		if(e.getExplntnOfBnftOutcome() != null ) {

			if(e.getExplntnOfBnftOutcome().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftOutcome()==null) {} else {
			explanationofbenefit.setOutcome(new org.hl7.fhir.r4.model.ExplanationOfBenefit.RemittanceOutcomeEnumFactory().fromCode(e.getExplntnOfBnftOutcome().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Pnt ********************************************************************************/
		if(e.getExplntnOfBnftPnt() != null ) {

			if(e.getExplntnOfBnftPnt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPnt()==null) {} else {
			explanationofbenefit.setPatient(new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftPnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Payee_Party ********************************************************************************/
		if(e.getExplntnOfBnftPayeeParty() != null ) {

			if(e.getExplntnOfBnftPayeeParty().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPayeeParty()==null) {} else {
			explanationofbenefit.getPayee().setParty(new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftPayeeParty().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Payee_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftPayeeTypCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPayeeTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayee().getType().getCoding().size() < i0+1) { explanationofbenefit.getPayee().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayee().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Payee_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftPayeeTypCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPayeeTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayee().getType().getCoding().size() < i0+1) { explanationofbenefit.getPayee().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayee().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Payee_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftPayeeTypCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPayeeTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayee().getType().getCoding().size() < i0+1) { explanationofbenefit.getPayee().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayee().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Payee_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftPayeeTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPayeeTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayee().getType().getCoding().size() < i0+1) { explanationofbenefit.getPayee().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayee().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Payee_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftPayeeTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPayeeTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayee().getType().getCoding().size() < i0+1) { explanationofbenefit.getPayee().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayee().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Payee_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftPayeeTypTxt() != null ) {

			if(e.getExplntnOfBnftPayeeTypTxt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPayeeTypTxt()==null) {} else {
			explanationofbenefit.getPayee().getType().setText(e.getExplntnOfBnftPayeeTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Pymnt_Adjustment_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftPymntAdjustmentCrncy() != null ) {

			if(e.getExplntnOfBnftPymntAdjustmentCrncy().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPymntAdjustmentCrncy()==null) {} else {
			explanationofbenefit.getPayment().getAdjustment().setCurrency(e.getExplntnOfBnftPymntAdjustmentCrncy().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Pymnt_Adjustment_Vl ********************************************************************************/
		if(e.getExplntnOfBnftPymntAdjustmentVl() != null ) {

			if(e.getExplntnOfBnftPymntAdjustmentVl().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPymntAdjustmentVl()==null) {} else {
			explanationofbenefit.getPayment().getAdjustment().setValue((new java.math.BigDecimal((e.getExplntnOfBnftPymntAdjustmentVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftPymntAdjustmentRsnCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPymntAdjustmentRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayment().getAdjustmentReason().getCoding().size() < i0+1) { explanationofbenefit.getPayment().getAdjustmentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayment().getAdjustmentReason().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftPymntAdjustmentRsnCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPymntAdjustmentRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayment().getAdjustmentReason().getCoding().size() < i0+1) { explanationofbenefit.getPayment().getAdjustmentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayment().getAdjustmentReason().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftPymntAdjustmentRsnCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPymntAdjustmentRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayment().getAdjustmentReason().getCoding().size() < i0+1) { explanationofbenefit.getPayment().getAdjustmentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayment().getAdjustmentReason().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftPymntAdjustmentRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPymntAdjustmentRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayment().getAdjustmentReason().getCoding().size() < i0+1) { explanationofbenefit.getPayment().getAdjustmentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayment().getAdjustmentReason().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftPymntAdjustmentRsnCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPymntAdjustmentRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayment().getAdjustmentReason().getCoding().size() < i0+1) { explanationofbenefit.getPayment().getAdjustmentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayment().getAdjustmentReason().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Txt ********************************************************************************/
		if(e.getExplntnOfBnftPymntAdjustmentRsnTxt() != null ) {

			if(e.getExplntnOfBnftPymntAdjustmentRsnTxt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPymntAdjustmentRsnTxt()==null) {} else {
			explanationofbenefit.getPayment().getAdjustmentReason().setText(e.getExplntnOfBnftPymntAdjustmentRsnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Pymnt_Amnt_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftPymntAmntCrncy() != null ) {

			if(e.getExplntnOfBnftPymntAmntCrncy().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPymntAmntCrncy()==null) {} else {
			explanationofbenefit.getPayment().getAmount().setCurrency(e.getExplntnOfBnftPymntAmntCrncy().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Pymnt_Amnt_Vl ********************************************************************************/
		if(e.getExplntnOfBnftPymntAmntVl() != null ) {

			if(e.getExplntnOfBnftPymntAmntVl().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPymntAmntVl()==null) {} else {
			explanationofbenefit.getPayment().getAmount().setValue((new java.math.BigDecimal((e.getExplntnOfBnftPymntAmntVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ExplntnOfBnft_Pymnt_Dt ********************************************************************************/
		if(e.getExplntnOfBnftPymntDt() != null ) {

			if(e.getExplntnOfBnftPymntDt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPymntDt()==null) {} else {
			explanationofbenefit.getPayment().setDate(e.getExplntnOfBnftPymntDt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPymntDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getExplntnOfBnftPymntDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Assigner ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdAssigner() != null ) {

			if(e.getExplntnOfBnftPymntIdAssigner().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPymntIdAssigner()==null) {} else {
			explanationofbenefit.getPayment().getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftPymntIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Prd_End ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdPrdEnd() != null ) {

			if(e.getExplntnOfBnftPymntIdPrdEnd().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPymntIdPrdEnd()==null) {} else {
			explanationofbenefit.getPayment().getIdentifier().getPeriod().setEnd(e.getExplntnOfBnftPymntIdPrdEnd().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPymntIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getExplntnOfBnftPymntIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Prd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdPrdStrt() != null ) {

			if(e.getExplntnOfBnftPymntIdPrdStrt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPymntIdPrdStrt()==null) {} else {
			explanationofbenefit.getPayment().getIdentifier().getPeriod().setStart(e.getExplntnOfBnftPymntIdPrdStrt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPymntIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getExplntnOfBnftPymntIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Sys ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdSys() != null ) {

			if(e.getExplntnOfBnftPymntIdSys().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPymntIdSys()==null) {} else {
			explanationofbenefit.getPayment().getIdentifier().setSystem(e.getExplntnOfBnftPymntIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdTypCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPymntIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayment().getIdentifier().getType().getCoding().size() < i0+1) { explanationofbenefit.getPayment().getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayment().getIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdTypCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPymntIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayment().getIdentifier().getType().getCoding().size() < i0+1) { explanationofbenefit.getPayment().getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayment().getIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdTypCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPymntIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayment().getIdentifier().getType().getCoding().size() < i0+1) { explanationofbenefit.getPayment().getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayment().getIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPymntIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayment().getIdentifier().getType().getCoding().size() < i0+1) { explanationofbenefit.getPayment().getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayment().getIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPymntIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayment().getIdentifier().getType().getCoding().size() < i0+1) { explanationofbenefit.getPayment().getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayment().getIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdTypTxt() != null ) {

			if(e.getExplntnOfBnftPymntIdTypTxt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPymntIdTypTxt()==null) {} else {
			explanationofbenefit.getPayment().getIdentifier().getType().setText(e.getExplntnOfBnftPymntIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Use ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdUse() != null ) {

			if(e.getExplntnOfBnftPymntIdUse().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPymntIdUse()==null) {} else {
			explanationofbenefit.getPayment().getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(e.getExplntnOfBnftPymntIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Vl ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdVl() != null ) {

			if(e.getExplntnOfBnftPymntIdVl().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPymntIdVl()==null) {} else {
			explanationofbenefit.getPayment().getIdentifier().setValue(e.getExplntnOfBnftPymntIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftPymntTypCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPymntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayment().getType().getCoding().size() < i0+1) { explanationofbenefit.getPayment().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayment().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftPymntTypCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPymntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayment().getType().getCoding().size() < i0+1) { explanationofbenefit.getPayment().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayment().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftPymntTypCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPymntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayment().getType().getCoding().size() < i0+1) { explanationofbenefit.getPayment().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayment().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftPymntTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPymntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayment().getType().getCoding().size() < i0+1) { explanationofbenefit.getPayment().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayment().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftPymntTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPymntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPayment().getType().getCoding().size() < i0+1) { explanationofbenefit.getPayment().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPayment().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Pymnt_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftPymntTypTxt() != null ) {

			if(e.getExplntnOfBnftPymntTypTxt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPymntTypTxt()==null) {} else {
			explanationofbenefit.getPayment().getType().setText(e.getExplntnOfBnftPymntTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_PreAuthRef ********************************************************************************/
		if(e.getExplntnOfBnftPreAuthRef() != null ) {

				for( String currListStrSplit : e.getExplntnOfBnftPreAuthRef().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			explanationofbenefit.addPreAuthRef(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** ExplntnOfBnft_PreAuthRefPrd_End ********************************************************************************/
		if(e.getExplntnOfBnftPreAuthRefPrdEnd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPreAuthRefPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPreAuthRefPeriod().size() < i0+1) { explanationofbenefit.addPreAuthRefPeriod(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPreAuthRefPeriod().get(i0).setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_PreAuthRefPrd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftPreAuthRefPrdStrt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPreAuthRefPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPreAuthRefPeriod().size() < i0+1) { explanationofbenefit.addPreAuthRefPeriod(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPreAuthRefPeriod().get(i0).setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Precedence ********************************************************************************/
		if(e.getExplntnOfBnftPrecedence() != null ) {

			if(e.getExplntnOfBnftPrecedence().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPrecedence()==null) {} else {
			explanationofbenefit.setPrecedence(Integer.parseInt(e.getExplntnOfBnftPrecedence().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Prescription ********************************************************************************/
		if(e.getExplntnOfBnftPrescription() != null ) {

			if(e.getExplntnOfBnftPrescription().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPrescription()==null) {} else {
			explanationofbenefit.setPrescription(new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftPrescription().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Priority_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftPriorityCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPriorityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPriority().getCoding().size() < i0+1) { explanationofbenefit.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPriority().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Priority_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftPriorityCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPriorityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPriority().getCoding().size() < i0+1) { explanationofbenefit.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPriority().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Priority_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftPriorityCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPriorityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPriority().getCoding().size() < i0+1) { explanationofbenefit.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPriority().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Priority_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftPriorityCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPriorityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPriority().getCoding().size() < i0+1) { explanationofbenefit.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPriority().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Priority_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftPriorityCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPriorityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getPriority().getCoding().size() < i0+1) { explanationofbenefit.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getPriority().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Priority_Txt ********************************************************************************/
		if(e.getExplntnOfBnftPriorityTxt() != null ) {

			if(e.getExplntnOfBnftPriorityTxt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftPriorityTxt()==null) {} else {
			explanationofbenefit.getPriority().setText(e.getExplntnOfBnftPriorityTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Prcdr_Dt ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrDt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPrcdrDt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcedure().size() < i0+1) { explanationofbenefit.addProcedure(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getProcedure().get(i0).setDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcedure().size() < i0+1) { explanationofbenefit.addProcedure(); }
				String[] arrayi1 = e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getProcedure().get(i0).getProcedureCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcedure().size() < i0+1) { explanationofbenefit.addProcedure(); }
				String[] arrayi1 = e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getProcedure().get(i0).getProcedureCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcedure().size() < i0+1) { explanationofbenefit.addProcedure(); }
				String[] arrayi1 = e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getProcedure().get(i0).getProcedureCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcedure().size() < i0+1) { explanationofbenefit.addProcedure(); }
				String[] arrayi1 = e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getProcedure().get(i0).getProcedureCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcedure().size() < i0+1) { explanationofbenefit.addProcedure(); }
				String[] arrayi1 = e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().size() < i1+1) { explanationofbenefit.getProcedure().get(i0).getProcedureCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getProcedure().get(i0).getProcedureCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Txt ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrPrcdrCdbleCncptTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPrcdrPrcdrCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcedure().size() < i0+1) { explanationofbenefit.addProcedure(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getProcedure().get(i0).getProcedureCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Prcdr_PrcdrRfrnc ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrPrcdrRfrnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPrcdrPrcdrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcedure().size() < i0+1) { explanationofbenefit.addProcedure(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getProcedure().get(i0).setProcedure(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Prcdr_Sqnc ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrSqnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPrcdrSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcedure().size() < i0+1) { explanationofbenefit.addProcedure(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getProcedure().get(i0).setSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrTypCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPrcdrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcedure().size() < i0+1) { explanationofbenefit.addProcedure(); }
				String[] arrayi1 = e.getExplntnOfBnftPrcdrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getProcedure().get(i0).getType().size() < i1+1) { explanationofbenefit.getProcedure().get(i0).addType(); }
					String[] arrayi2 = e.getExplntnOfBnftPrcdrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getProcedure().get(i0).getType().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getProcedure().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getProcedure().get(i0).getType().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrTypCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPrcdrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcedure().size() < i0+1) { explanationofbenefit.addProcedure(); }
				String[] arrayi1 = e.getExplntnOfBnftPrcdrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getProcedure().get(i0).getType().size() < i1+1) { explanationofbenefit.getProcedure().get(i0).addType(); }
					String[] arrayi2 = e.getExplntnOfBnftPrcdrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getProcedure().get(i0).getType().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getProcedure().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getProcedure().get(i0).getType().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrTypCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPrcdrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcedure().size() < i0+1) { explanationofbenefit.addProcedure(); }
				String[] arrayi1 = e.getExplntnOfBnftPrcdrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getProcedure().get(i0).getType().size() < i1+1) { explanationofbenefit.getProcedure().get(i0).addType(); }
					String[] arrayi2 = e.getExplntnOfBnftPrcdrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getProcedure().get(i0).getType().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getProcedure().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getProcedure().get(i0).getType().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPrcdrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcedure().size() < i0+1) { explanationofbenefit.addProcedure(); }
				String[] arrayi1 = e.getExplntnOfBnftPrcdrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getProcedure().get(i0).getType().size() < i1+1) { explanationofbenefit.getProcedure().get(i0).addType(); }
					String[] arrayi2 = e.getExplntnOfBnftPrcdrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getProcedure().get(i0).getType().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getProcedure().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getProcedure().get(i0).getType().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPrcdrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcedure().size() < i0+1) { explanationofbenefit.addProcedure(); }
				String[] arrayi1 = e.getExplntnOfBnftPrcdrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getProcedure().get(i0).getType().size() < i1+1) { explanationofbenefit.getProcedure().get(i0).addType(); }
					String[] arrayi2 = e.getExplntnOfBnftPrcdrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(explanationofbenefit.getProcedure().get(i0).getType().get(i1).getCoding().size() < i2+1) { explanationofbenefit.getProcedure().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {explanationofbenefit.getProcedure().get(i0).getType().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ExplntnOfBnft_Prcdr_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrTypTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPrcdrTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcedure().size() < i0+1) { explanationofbenefit.addProcedure(); }
				String[] arrayi1 = e.getExplntnOfBnftPrcdrTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getProcedure().get(i0).getType().size() < i1+1) { explanationofbenefit.getProcedure().get(i0).addType(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getProcedure().get(i0).getType().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Prcdr_Udi ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrUdi() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftPrcdrUdi().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcedure().size() < i0+1) { explanationofbenefit.addProcedure(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {explanationofbenefit.getProcedure().get(i0).addUdi(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftProcessNtLnguageCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftProcessNtLnguageCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcessNote().size() < i0+1) { explanationofbenefit.addProcessNote(); }
				String[] arrayi1 = e.getExplntnOfBnftProcessNtLnguageCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getProcessNote().get(i0).getLanguage().getCoding().size() < i1+1) { explanationofbenefit.getProcessNote().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getProcessNote().get(i0).getLanguage().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftProcessNtLnguageCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftProcessNtLnguageCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcessNote().size() < i0+1) { explanationofbenefit.addProcessNote(); }
				String[] arrayi1 = e.getExplntnOfBnftProcessNtLnguageCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getProcessNote().get(i0).getLanguage().getCoding().size() < i1+1) { explanationofbenefit.getProcessNote().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getProcessNote().get(i0).getLanguage().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftProcessNtLnguageCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftProcessNtLnguageCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcessNote().size() < i0+1) { explanationofbenefit.addProcessNote(); }
				String[] arrayi1 = e.getExplntnOfBnftProcessNtLnguageCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getProcessNote().get(i0).getLanguage().getCoding().size() < i1+1) { explanationofbenefit.getProcessNote().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getProcessNote().get(i0).getLanguage().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftProcessNtLnguageCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftProcessNtLnguageCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcessNote().size() < i0+1) { explanationofbenefit.addProcessNote(); }
				String[] arrayi1 = e.getExplntnOfBnftProcessNtLnguageCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getProcessNote().get(i0).getLanguage().getCoding().size() < i1+1) { explanationofbenefit.getProcessNote().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getProcessNote().get(i0).getLanguage().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftProcessNtLnguageCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftProcessNtLnguageCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcessNote().size() < i0+1) { explanationofbenefit.addProcessNote(); }
				String[] arrayi1 = e.getExplntnOfBnftProcessNtLnguageCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getProcessNote().get(i0).getLanguage().getCoding().size() < i1+1) { explanationofbenefit.getProcessNote().get(i0).getLanguage().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getProcessNote().get(i0).getLanguage().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Txt ********************************************************************************/
		if(e.getExplntnOfBnftProcessNtLnguageTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftProcessNtLnguageTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcessNote().size() < i0+1) { explanationofbenefit.addProcessNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getProcessNote().get(i0).getLanguage().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_ProcessNt_Nmbr ********************************************************************************/
		if(e.getExplntnOfBnftProcessNtNmbr() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftProcessNtNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcessNote().size() < i0+1) { explanationofbenefit.addProcessNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getProcessNote().get(i0).setNumber(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_ProcessNt_Txt ********************************************************************************/
		if(e.getExplntnOfBnftProcessNtTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftProcessNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcessNote().size() < i0+1) { explanationofbenefit.addProcessNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getProcessNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_ProcessNt_Typ ********************************************************************************/
		if(e.getExplntnOfBnftProcessNtTyp() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftProcessNtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getProcessNote().size() < i0+1) { explanationofbenefit.addProcessNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getProcessNote().get(i0).setType(new org.hl7.fhir.r4.model.Enumerations.NoteTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Provider ********************************************************************************/
		if(e.getExplntnOfBnftProvider() != null ) {

			if(e.getExplntnOfBnftProvider().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftProvider()==null) {} else {
			explanationofbenefit.setProvider(new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftProvider().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Referral ********************************************************************************/
		if(e.getExplntnOfBnftReferral() != null ) {

			if(e.getExplntnOfBnftReferral().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftReferral()==null) {} else {
			explanationofbenefit.setReferral(new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftReferral().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_Rlted_Clm ********************************************************************************/
		if(e.getExplntnOfBnftRltedClm() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftRltedClm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getRelated().size() < i0+1) { explanationofbenefit.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getRelated().get(i0).setClaim(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Assigner ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncAssigner() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftRltedRfrncAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getRelated().size() < i0+1) { explanationofbenefit.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getRelated().get(i0).getReference().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Prd_End ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncPrdEnd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftRltedRfrncPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getRelated().size() < i0+1) { explanationofbenefit.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getRelated().get(i0).getReference().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Prd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncPrdStrt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftRltedRfrncPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getRelated().size() < i0+1) { explanationofbenefit.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getRelated().get(i0).getReference().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Sys ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftRltedRfrncSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getRelated().size() < i0+1) { explanationofbenefit.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getRelated().get(i0).getReference().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncTypCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftRltedRfrncTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getRelated().size() < i0+1) { explanationofbenefit.addRelated(); }
				String[] arrayi1 = e.getExplntnOfBnftRltedRfrncTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getRelated().get(i0).getReference().getType().getCoding().size() < i1+1) { explanationofbenefit.getRelated().get(i0).getReference().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getRelated().get(i0).getReference().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncTypCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftRltedRfrncTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getRelated().size() < i0+1) { explanationofbenefit.addRelated(); }
				String[] arrayi1 = e.getExplntnOfBnftRltedRfrncTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getRelated().get(i0).getReference().getType().getCoding().size() < i1+1) { explanationofbenefit.getRelated().get(i0).getReference().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getRelated().get(i0).getReference().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncTypCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftRltedRfrncTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getRelated().size() < i0+1) { explanationofbenefit.addRelated(); }
				String[] arrayi1 = e.getExplntnOfBnftRltedRfrncTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getRelated().get(i0).getReference().getType().getCoding().size() < i1+1) { explanationofbenefit.getRelated().get(i0).getReference().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getRelated().get(i0).getReference().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftRltedRfrncTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getRelated().size() < i0+1) { explanationofbenefit.addRelated(); }
				String[] arrayi1 = e.getExplntnOfBnftRltedRfrncTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getRelated().get(i0).getReference().getType().getCoding().size() < i1+1) { explanationofbenefit.getRelated().get(i0).getReference().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getRelated().get(i0).getReference().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftRltedRfrncTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getRelated().size() < i0+1) { explanationofbenefit.addRelated(); }
				String[] arrayi1 = e.getExplntnOfBnftRltedRfrncTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getRelated().get(i0).getReference().getType().getCoding().size() < i1+1) { explanationofbenefit.getRelated().get(i0).getReference().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getRelated().get(i0).getReference().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncTypTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftRltedRfrncTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getRelated().size() < i0+1) { explanationofbenefit.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getRelated().get(i0).getReference().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Use ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncUse() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftRltedRfrncUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getRelated().size() < i0+1) { explanationofbenefit.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getRelated().get(i0).getReference().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Vl ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftRltedRfrncVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getRelated().size() < i0+1) { explanationofbenefit.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getRelated().get(i0).getReference().setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftRltedRltnshipCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftRltedRltnshipCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getRelated().size() < i0+1) { explanationofbenefit.addRelated(); }
				String[] arrayi1 = e.getExplntnOfBnftRltedRltnshipCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getRelated().get(i0).getRelationship().getCoding().size() < i1+1) { explanationofbenefit.getRelated().get(i0).getRelationship().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getRelated().get(i0).getRelationship().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftRltedRltnshipCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftRltedRltnshipCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getRelated().size() < i0+1) { explanationofbenefit.addRelated(); }
				String[] arrayi1 = e.getExplntnOfBnftRltedRltnshipCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getRelated().get(i0).getRelationship().getCoding().size() < i1+1) { explanationofbenefit.getRelated().get(i0).getRelationship().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getRelated().get(i0).getRelationship().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftRltedRltnshipCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftRltedRltnshipCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getRelated().size() < i0+1) { explanationofbenefit.addRelated(); }
				String[] arrayi1 = e.getExplntnOfBnftRltedRltnshipCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getRelated().get(i0).getRelationship().getCoding().size() < i1+1) { explanationofbenefit.getRelated().get(i0).getRelationship().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getRelated().get(i0).getRelationship().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftRltedRltnshipCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftRltedRltnshipCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getRelated().size() < i0+1) { explanationofbenefit.addRelated(); }
				String[] arrayi1 = e.getExplntnOfBnftRltedRltnshipCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getRelated().get(i0).getRelationship().getCoding().size() < i1+1) { explanationofbenefit.getRelated().get(i0).getRelationship().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getRelated().get(i0).getRelationship().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftRltedRltnshipCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftRltedRltnshipCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getRelated().size() < i0+1) { explanationofbenefit.addRelated(); }
				String[] arrayi1 = e.getExplntnOfBnftRltedRltnshipCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getRelated().get(i0).getRelationship().getCoding().size() < i1+1) { explanationofbenefit.getRelated().get(i0).getRelationship().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getRelated().get(i0).getRelationship().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Rlted_Rltnship_Txt ********************************************************************************/
		if(e.getExplntnOfBnftRltedRltnshipTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftRltedRltnshipTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getRelated().size() < i0+1) { explanationofbenefit.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getRelated().get(i0).getRelationship().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Sts ********************************************************************************/
		if(e.getExplntnOfBnftSts() != null ) {

			if(e.getExplntnOfBnftSts().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftSts()==null) {} else {
			explanationofbenefit.setStatus(new org.hl7.fhir.r4.model.ExplanationOfBenefit.ExplanationOfBenefitStatusEnumFactory().fromCode(e.getExplntnOfBnftSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ExplntnOfBnft_SubTyp_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftSubTypCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSubTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSubType().getCoding().size() < i0+1) { explanationofbenefit.getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSubType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_SubTyp_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftSubTypCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSubTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSubType().getCoding().size() < i0+1) { explanationofbenefit.getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSubType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_SubTyp_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftSubTypCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSubTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSubType().getCoding().size() < i0+1) { explanationofbenefit.getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSubType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftSubTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSubTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSubType().getCoding().size() < i0+1) { explanationofbenefit.getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSubType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftSubTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSubTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSubType().getCoding().size() < i0+1) { explanationofbenefit.getSubType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSubType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_SubTyp_Txt ********************************************************************************/
		if(e.getExplntnOfBnftSubTypTxt() != null ) {

			if(e.getExplntnOfBnftSubTypTxt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftSubTypTxt()==null) {} else {
			explanationofbenefit.getSubType().setText(e.getExplntnOfBnftSubTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCtgryCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				String[] arrayi1 = e.getExplntnOfBnftSprtingInfoCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getSupportingInfo().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getSupportingInfo().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getCategory().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCtgryCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				String[] arrayi1 = e.getExplntnOfBnftSprtingInfoCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getSupportingInfo().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getSupportingInfo().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getCategory().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCtgryCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				String[] arrayi1 = e.getExplntnOfBnftSprtingInfoCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getSupportingInfo().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getSupportingInfo().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getCategory().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				String[] arrayi1 = e.getExplntnOfBnftSprtingInfoCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getSupportingInfo().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getSupportingInfo().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getCategory().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCtgryCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				String[] arrayi1 = e.getExplntnOfBnftSprtingInfoCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getSupportingInfo().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getSupportingInfo().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getCategory().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCtgryTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getCategory().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCdCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				String[] arrayi1 = e.getExplntnOfBnftSprtingInfoCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getSupportingInfo().get(i0).getCode().getCoding().size() < i1+1) { explanationofbenefit.getSupportingInfo().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCdCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				String[] arrayi1 = e.getExplntnOfBnftSprtingInfoCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getSupportingInfo().get(i0).getCode().getCoding().size() < i1+1) { explanationofbenefit.getSupportingInfo().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCdCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				String[] arrayi1 = e.getExplntnOfBnftSprtingInfoCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getSupportingInfo().get(i0).getCode().getCoding().size() < i1+1) { explanationofbenefit.getSupportingInfo().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCdCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				String[] arrayi1 = e.getExplntnOfBnftSprtingInfoCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getSupportingInfo().get(i0).getCode().getCoding().size() < i1+1) { explanationofbenefit.getSupportingInfo().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCdCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				String[] arrayi1 = e.getExplntnOfBnftSprtingInfoCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getSupportingInfo().get(i0).getCode().getCoding().size() < i1+1) { explanationofbenefit.getSupportingInfo().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_Cd_Txt ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCdTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_Rsn_Cd ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoRsnCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoRsnCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getReason().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_Rsn_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoRsnDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoRsnDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getReason().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_Rsn_Sys ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoRsnSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoRsnSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getReason().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_Rsn_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoRsnUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoRsnUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getReason().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_Rsn_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoRsnVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoRsnVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getReason().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_Sqnc ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoSqnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).setSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_TmgDtTyp ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoTmgDtTyp() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoTmgDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).setTiming(new org.hl7.fhir.r4.model.DateType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_TmgPrd_End ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoTmgPrdEnd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoTmgPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getTimingPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_TmgPrd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoTmgPrdStrt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoTmgPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getTimingPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_CntntTyp ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlAttchmntCntntTyp() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoVlAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getValueAttachment().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Creation ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlAttchmntCreation() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoVlAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getValueAttachment().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Data ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlAttchmntData() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoVlAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getValueAttachment().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Hash ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlAttchmntHash() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoVlAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getValueAttachment().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Lnguage ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlAttchmntLnguage() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoVlAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getValueAttachment().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Sz ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlAttchmntSz() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoVlAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getValueAttachment().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Ttl ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlAttchmntTtl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoVlAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getValueAttachment().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Url ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlAttchmntUrl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoVlAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getValueAttachment().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_VlBooleanTyp ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlBooleanTyp() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoVlBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).setValue(new org.hl7.fhir.r4.model.BooleanType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_VlQnty_Cd ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlQntyCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_VlQnty_Cmprtr ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlQntyCmprtr() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_VlQnty_Sys ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlQntySys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_VlQnty_Unt ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlQntyUnt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_VlQnty_Vl ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlQntyVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_VlRfrnc ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlRfrnc() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_SprtingInfo_VlStrgTyp ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlStrgTyp() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftSprtingInfoVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getSupportingInfo().size() < i0+1) { explanationofbenefit.addSupportingInfo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getSupportingInfo().get(i0).setValue(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Total_Amnt_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftTotalAmntCrncy() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftTotalAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getTotal().size() < i0+1) { explanationofbenefit.addTotal(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getTotal().get(i0).getAmount().setCurrency(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Total_Amnt_Vl ********************************************************************************/
		if(e.getExplntnOfBnftTotalAmntVl() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftTotalAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getTotal().size() < i0+1) { explanationofbenefit.addTotal(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getTotal().get(i0).getAmount().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftTotalCtgryCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftTotalCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getTotal().size() < i0+1) { explanationofbenefit.addTotal(); }
				String[] arrayi1 = e.getExplntnOfBnftTotalCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getTotal().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getTotal().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getTotal().get(i0).getCategory().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftTotalCtgryCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftTotalCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getTotal().size() < i0+1) { explanationofbenefit.addTotal(); }
				String[] arrayi1 = e.getExplntnOfBnftTotalCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getTotal().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getTotal().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getTotal().get(i0).getCategory().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftTotalCtgryCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftTotalCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getTotal().size() < i0+1) { explanationofbenefit.addTotal(); }
				String[] arrayi1 = e.getExplntnOfBnftTotalCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getTotal().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getTotal().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getTotal().get(i0).getCategory().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftTotalCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftTotalCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getTotal().size() < i0+1) { explanationofbenefit.addTotal(); }
				String[] arrayi1 = e.getExplntnOfBnftTotalCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getTotal().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getTotal().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getTotal().get(i0).getCategory().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftTotalCtgryCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftTotalCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getTotal().size() < i0+1) { explanationofbenefit.addTotal(); }
				String[] arrayi1 = e.getExplntnOfBnftTotalCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(explanationofbenefit.getTotal().get(i0).getCategory().getCoding().size() < i1+1) { explanationofbenefit.getTotal().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {explanationofbenefit.getTotal().get(i0).getCategory().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ExplntnOfBnft_Total_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftTotalCtgryTxt() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftTotalCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getTotal().size() < i0+1) { explanationofbenefit.addTotal(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getTotal().get(i0).getCategory().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftTypCdgCd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getType().getCoding().size() < i0+1) { explanationofbenefit.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftTypCdgDsply() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getType().getCoding().size() < i0+1) { explanationofbenefit.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftTypCdgSys() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getType().getCoding().size() < i0+1) { explanationofbenefit.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getType().getCoding().size() < i0+1) { explanationofbenefit.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ExplntnOfBnft_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getExplntnOfBnftTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(explanationofbenefit.getType().getCoding().size() < i0+1) { explanationofbenefit.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {explanationofbenefit.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ExplntnOfBnft_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftTypTxt() != null ) {

			if(e.getExplntnOfBnftTypTxt().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftTypTxt()==null) {} else {
			explanationofbenefit.getType().setText(e.getExplntnOfBnftTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ExplntnOfBnft_Use ********************************************************************************/
		if(e.getExplntnOfBnftUse() != null ) {

			if(e.getExplntnOfBnftUse().replace("[","").replace("]","").equals("NULL") | e.getExplntnOfBnftUse()==null) {} else {
			explanationofbenefit.setUse(new org.hl7.fhir.r4.model.ExplanationOfBenefit.UseEnumFactory().fromCode(e.getExplntnOfBnftUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return explanationofbenefit;
	}
}
