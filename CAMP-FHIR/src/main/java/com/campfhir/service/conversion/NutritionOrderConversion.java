package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.NutritionOrder;
public class NutritionOrderConversion 
{
	public org.hl7.fhir.r4.model.NutritionOrder NutritionOrders(NutritionOrder n) throws ParseException
	{
		org.hl7.fhir.r4.model.NutritionOrder nutritionorder = new org.hl7.fhir.r4.model.NutritionOrder();

		/******************** id ********************************************************************************/
		nutritionorder.setId(n.getId());

		/******************** NtritnOrdr_AlrgyIntolerance ********************************************************************************/
		if(n.getNtritnOrdrAlrgyIntolerance() != null ) {

				for( String currListStrSplit : n.getNtritnOrdrAlrgyIntolerance().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			nutritionorder.addAllergyIntolerance(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** NtritnOrdr_DtTime ********************************************************************************/
		if(n.getNtritnOrdrDtTime() != null ) {

			if(n.getNtritnOrdrDtTime().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrDtTime()==null) {} else {
			nutritionorder.setDateTime(n.getNtritnOrdrDtTime().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrDtTime()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(n.getNtritnOrdrDtTime().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** NtritnOrdr_Enc ********************************************************************************/
		if(n.getNtritnOrdrEnc() != null ) {

			if(n.getNtritnOrdrEnc().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrEnc()==null) {} else {
			nutritionorder.setEncounter(new org.hl7.fhir.r4.model.Reference(n.getNtritnOrdrEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** NtritnOrdr_EnteralFrmula_AddtvPrdctNm ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAddtvPrdctNm() != null ) {

			if(n.getNtritnOrdrEnteralFrmulaAddtvPrdctNm().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrEnteralFrmulaAddtvPrdctNm()==null) {} else {
			nutritionorder.getEnteralFormula().setAdditiveProductName(n.getNtritnOrdrEnteralFrmulaAddtvPrdctNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAddtvTypCdgCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAddtvTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdditiveType().getCoding().size() < i0+1) { nutritionorder.getEnteralFormula().getAdditiveType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdditiveType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAddtvTypCdgDsply() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAddtvTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdditiveType().getCoding().size() < i0+1) { nutritionorder.getEnteralFormula().getAdditiveType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdditiveType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAddtvTypCdgSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAddtvTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdditiveType().getCoding().size() < i0+1) { nutritionorder.getEnteralFormula().getAdditiveType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdditiveType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAddtvTypCdgUsrSltd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAddtvTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdditiveType().getCoding().size() < i0+1) { nutritionorder.getEnteralFormula().getAdditiveType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdditiveType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAddtvTypCdgVrsn() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAddtvTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdditiveType().getCoding().size() < i0+1) { nutritionorder.getEnteralFormula().getAdditiveType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdditiveType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Txt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAddtvTypTxt() != null ) {

			if(n.getNtritnOrdrEnteralFrmulaAddtvTypTxt().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrEnteralFrmulaAddtvTypTxt()==null) {} else {
			nutritionorder.getEnteralFormula().getAdditiveType().setText(n.getNtritnOrdrEnteralFrmulaAddtvTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnQntyCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Cmprtr ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnQntyCmprtr() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnQntySys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Unt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnQntyUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Vl ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnQntyVl() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtQntyCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnRtQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getRateQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Cmprtr ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtQntyCmprtr() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnRtQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getRateQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtQntySys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnRtQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getRateQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Unt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtQntyUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnRtQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getRateQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Vl ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtQntyVl() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnRtQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getRateQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getRateRatio().getDenominator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Cmprtr ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrCmprtr() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getRateRatio().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getRateRatio().getDenominator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getRateRatio().getDenominator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrVl() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getRateRatio().getDenominator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getRateRatio().getNumerator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Cmprtr ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrCmprtr() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getRateRatio().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getRateRatio().getNumerator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getRateRatio().getNumerator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrVl() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getRateRatio().getNumerator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				String[] arrayi1 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getCode().getCoding().size() < i1+1) { nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgDsply() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				String[] arrayi1 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getCode().getCoding().size() < i1+1) { nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				String[] arrayi1 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getCode().getCoding().size() < i1+1) { nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgUsrSltd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				String[] arrayi1 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getCode().getCoding().size() < i1+1) { nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgVrsn() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				String[] arrayi1 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getCode().getCoding().size() < i1+1) { nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Txt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdTxt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Evnt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlEvnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsDuration_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().getBoundsDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationCmprtr() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsDuration_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().getBoundsDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsDuration_Unt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().getBoundsDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsDuration_Vl ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationVl() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsPrd_End ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsPrdEnd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().getBoundsPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsPrd_Strt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsPrdStrt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().getBoundsPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().getBoundsRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiCmprtr() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().getBoundsRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().getBoundsRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiVl() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().getBoundsRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwCmprtr() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().getBoundsRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().getBoundsRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwVl() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Cnt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptCnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().setCount(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_CntMx ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptCntMx() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().setCountMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Duration ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDuration() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().setDuration((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_DurationMx ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDurationMx() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().setDurationMax((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_DurationUnt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDurationUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Frqncy ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptFrqncy() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().setFrequency(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_FrqncyMx ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptFrqncyMx() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().setFrequencyMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Off ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptOff() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().setOffset(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Prd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().setPeriod((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_PrdMx ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrdMx() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().setPeriodMax((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_PrdUnt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrdUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_TimeOfDay ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptTimeOfDay() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getAdministration().size() < i0+1) { nutritionorder.getEnteralFormula().addAdministration(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {nutritionorder.getEnteralFormula().getAdministration().get(i0).getSchedule().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_AdmnstnInstrctn ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnInstrctn() != null ) {

			if(n.getNtritnOrdrEnteralFrmulaAdmnstnInstrctn().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrEnteralFrmulaAdmnstnInstrctn()==null) {} else {
			nutritionorder.getEnteralFormula().setAdministrationInstruction(n.getNtritnOrdrEnteralFrmulaAdmnstnInstrctn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaPrdctNm ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaBaseFrmulaPrdctNm() != null ) {

			if(n.getNtritnOrdrEnteralFrmulaBaseFrmulaPrdctNm().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrEnteralFrmulaBaseFrmulaPrdctNm()==null) {} else {
			nutritionorder.getEnteralFormula().setBaseFormulaProductName(n.getNtritnOrdrEnteralFrmulaBaseFrmulaPrdctNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getBaseFormulaType().getCoding().size() < i0+1) { nutritionorder.getEnteralFormula().getBaseFormulaType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getBaseFormulaType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgDsply() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getBaseFormulaType().getCoding().size() < i0+1) { nutritionorder.getEnteralFormula().getBaseFormulaType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getBaseFormulaType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getBaseFormulaType().getCoding().size() < i0+1) { nutritionorder.getEnteralFormula().getBaseFormulaType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getBaseFormulaType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgUsrSltd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getBaseFormulaType().getCoding().size() < i0+1) { nutritionorder.getEnteralFormula().getBaseFormulaType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getBaseFormulaType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgVrsn() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getBaseFormulaType().getCoding().size() < i0+1) { nutritionorder.getEnteralFormula().getBaseFormulaType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getBaseFormulaType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Txt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypTxt() != null ) {

			if(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypTxt().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypTxt()==null) {} else {
			nutritionorder.getEnteralFormula().getBaseFormulaType().setText(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** NtritnOrdr_EnteralFrmula_CaloricDensity_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaCaloricDensityCd() != null ) {

			if(n.getNtritnOrdrEnteralFrmulaCaloricDensityCd().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrEnteralFrmulaCaloricDensityCd()==null) {} else {
			nutritionorder.getEnteralFormula().getCaloricDensity().setCode(n.getNtritnOrdrEnteralFrmulaCaloricDensityCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** NtritnOrdr_EnteralFrmula_CaloricDensity_Cmprtr ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaCaloricDensityCmprtr() != null ) {

			if(n.getNtritnOrdrEnteralFrmulaCaloricDensityCmprtr().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrEnteralFrmulaCaloricDensityCmprtr()==null) {} else {
			nutritionorder.getEnteralFormula().getCaloricDensity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(n.getNtritnOrdrEnteralFrmulaCaloricDensityCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** NtritnOrdr_EnteralFrmula_CaloricDensity_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaCaloricDensitySys() != null ) {

			if(n.getNtritnOrdrEnteralFrmulaCaloricDensitySys().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrEnteralFrmulaCaloricDensitySys()==null) {} else {
			nutritionorder.getEnteralFormula().getCaloricDensity().setSystem(n.getNtritnOrdrEnteralFrmulaCaloricDensitySys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** NtritnOrdr_EnteralFrmula_CaloricDensity_Unt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaCaloricDensityUnt() != null ) {

			if(n.getNtritnOrdrEnteralFrmulaCaloricDensityUnt().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrEnteralFrmulaCaloricDensityUnt()==null) {} else {
			nutritionorder.getEnteralFormula().getCaloricDensity().setUnit(n.getNtritnOrdrEnteralFrmulaCaloricDensityUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** NtritnOrdr_EnteralFrmula_CaloricDensity_Vl ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaCaloricDensityVl() != null ) {

			if(n.getNtritnOrdrEnteralFrmulaCaloricDensityVl().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrEnteralFrmulaCaloricDensityVl()==null) {} else {
			nutritionorder.getEnteralFormula().getCaloricDensity().setValue((new java.math.BigDecimal((n.getNtritnOrdrEnteralFrmulaCaloricDensityVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverCd() != null ) {

			if(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverCd().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverCd()==null) {} else {
			nutritionorder.getEnteralFormula().getMaxVolumeToDeliver().setCode(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Cmprtr ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverCmprtr() != null ) {

			if(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverCmprtr().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverCmprtr()==null) {} else {
			nutritionorder.getEnteralFormula().getMaxVolumeToDeliver().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverSys() != null ) {

			if(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverSys().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverSys()==null) {} else {
			nutritionorder.getEnteralFormula().getMaxVolumeToDeliver().setSystem(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Unt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverUnt() != null ) {

			if(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverUnt().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverUnt()==null) {} else {
			nutritionorder.getEnteralFormula().getMaxVolumeToDeliver().setUnit(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Vl ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverVl() != null ) {

			if(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverVl().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverVl()==null) {} else {
			nutritionorder.getEnteralFormula().getMaxVolumeToDeliver().setValue((new java.math.BigDecimal((n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getRouteofAdministration().getCoding().size() < i0+1) { nutritionorder.getEnteralFormula().getRouteofAdministration().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getRouteofAdministration().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgDsply() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getRouteofAdministration().getCoding().size() < i0+1) { nutritionorder.getEnteralFormula().getRouteofAdministration().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getRouteofAdministration().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getRouteofAdministration().getCoding().size() < i0+1) { nutritionorder.getEnteralFormula().getRouteofAdministration().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getRouteofAdministration().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgUsrSltd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getRouteofAdministration().getCoding().size() < i0+1) { nutritionorder.getEnteralFormula().getRouteofAdministration().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getRouteofAdministration().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgVrsn() != null ) {

			String[] arrayi0 = n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getEnteralFormula().getRouteofAdministration().getCoding().size() < i0+1) { nutritionorder.getEnteralFormula().getRouteofAdministration().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getEnteralFormula().getRouteofAdministration().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Txt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnTxt() != null ) {

			if(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnTxt().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnTxt()==null) {} else {
			nutritionorder.getEnteralFormula().getRouteofAdministration().setText(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrExcludeFoodMdfrCdgCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrExcludeFoodMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getExcludeFoodModifier().size() < i0+1) { nutritionorder.addExcludeFoodModifier(); }
				String[] arrayi1 = n.getNtritnOrdrExcludeFoodMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getExcludeFoodModifier().get(i0).getCoding().size() < i1+1) { nutritionorder.getExcludeFoodModifier().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getExcludeFoodModifier().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrExcludeFoodMdfrCdgDsply() != null ) {

			String[] arrayi0 = n.getNtritnOrdrExcludeFoodMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getExcludeFoodModifier().size() < i0+1) { nutritionorder.addExcludeFoodModifier(); }
				String[] arrayi1 = n.getNtritnOrdrExcludeFoodMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getExcludeFoodModifier().get(i0).getCoding().size() < i1+1) { nutritionorder.getExcludeFoodModifier().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getExcludeFoodModifier().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrExcludeFoodMdfrCdgSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrExcludeFoodMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getExcludeFoodModifier().size() < i0+1) { nutritionorder.addExcludeFoodModifier(); }
				String[] arrayi1 = n.getNtritnOrdrExcludeFoodMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getExcludeFoodModifier().get(i0).getCoding().size() < i1+1) { nutritionorder.getExcludeFoodModifier().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getExcludeFoodModifier().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrExcludeFoodMdfrCdgUsrSltd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrExcludeFoodMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getExcludeFoodModifier().size() < i0+1) { nutritionorder.addExcludeFoodModifier(); }
				String[] arrayi1 = n.getNtritnOrdrExcludeFoodMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getExcludeFoodModifier().get(i0).getCoding().size() < i1+1) { nutritionorder.getExcludeFoodModifier().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getExcludeFoodModifier().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrExcludeFoodMdfrCdgVrsn() != null ) {

			String[] arrayi0 = n.getNtritnOrdrExcludeFoodMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getExcludeFoodModifier().size() < i0+1) { nutritionorder.addExcludeFoodModifier(); }
				String[] arrayi1 = n.getNtritnOrdrExcludeFoodMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getExcludeFoodModifier().get(i0).getCoding().size() < i1+1) { nutritionorder.getExcludeFoodModifier().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getExcludeFoodModifier().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_ExcludeFoodMdfr_Txt ********************************************************************************/
		if(n.getNtritnOrdrExcludeFoodMdfrTxt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrExcludeFoodMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getExcludeFoodModifier().size() < i0+1) { nutritionorder.addExcludeFoodModifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getExcludeFoodModifier().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrFoodPreferenceMdfrCdgCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrFoodPreferenceMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getFoodPreferenceModifier().size() < i0+1) { nutritionorder.addFoodPreferenceModifier(); }
				String[] arrayi1 = n.getNtritnOrdrFoodPreferenceMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getFoodPreferenceModifier().get(i0).getCoding().size() < i1+1) { nutritionorder.getFoodPreferenceModifier().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getFoodPreferenceModifier().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrFoodPreferenceMdfrCdgDsply() != null ) {

			String[] arrayi0 = n.getNtritnOrdrFoodPreferenceMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getFoodPreferenceModifier().size() < i0+1) { nutritionorder.addFoodPreferenceModifier(); }
				String[] arrayi1 = n.getNtritnOrdrFoodPreferenceMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getFoodPreferenceModifier().get(i0).getCoding().size() < i1+1) { nutritionorder.getFoodPreferenceModifier().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getFoodPreferenceModifier().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrFoodPreferenceMdfrCdgSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrFoodPreferenceMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getFoodPreferenceModifier().size() < i0+1) { nutritionorder.addFoodPreferenceModifier(); }
				String[] arrayi1 = n.getNtritnOrdrFoodPreferenceMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getFoodPreferenceModifier().get(i0).getCoding().size() < i1+1) { nutritionorder.getFoodPreferenceModifier().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getFoodPreferenceModifier().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrFoodPreferenceMdfrCdgUsrSltd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrFoodPreferenceMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getFoodPreferenceModifier().size() < i0+1) { nutritionorder.addFoodPreferenceModifier(); }
				String[] arrayi1 = n.getNtritnOrdrFoodPreferenceMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getFoodPreferenceModifier().get(i0).getCoding().size() < i1+1) { nutritionorder.getFoodPreferenceModifier().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getFoodPreferenceModifier().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrFoodPreferenceMdfrCdgVrsn() != null ) {

			String[] arrayi0 = n.getNtritnOrdrFoodPreferenceMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getFoodPreferenceModifier().size() < i0+1) { nutritionorder.addFoodPreferenceModifier(); }
				String[] arrayi1 = n.getNtritnOrdrFoodPreferenceMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getFoodPreferenceModifier().get(i0).getCoding().size() < i1+1) { nutritionorder.getFoodPreferenceModifier().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getFoodPreferenceModifier().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_FoodPreferenceMdfr_Txt ********************************************************************************/
		if(n.getNtritnOrdrFoodPreferenceMdfrTxt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrFoodPreferenceMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getFoodPreferenceModifier().size() < i0+1) { nutritionorder.addFoodPreferenceModifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getFoodPreferenceModifier().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_Id_Assigner ********************************************************************************/
		if(n.getNtritnOrdrIdAssigner() != null ) {

			String[] arrayi0 = n.getNtritnOrdrIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getIdentifier().size() < i0+1) { nutritionorder.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_Id_Prd_End ********************************************************************************/
		if(n.getNtritnOrdrIdPrdEnd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getIdentifier().size() < i0+1) { nutritionorder.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_Id_Prd_Strt ********************************************************************************/
		if(n.getNtritnOrdrIdPrdStrt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getIdentifier().size() < i0+1) { nutritionorder.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_Id_Sys ********************************************************************************/
		if(n.getNtritnOrdrIdSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getIdentifier().size() < i0+1) { nutritionorder.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrIdTypCdgCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getIdentifier().size() < i0+1) { nutritionorder.addIdentifier(); }
				String[] arrayi1 = n.getNtritnOrdrIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { nutritionorder.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrIdTypCdgDsply() != null ) {

			String[] arrayi0 = n.getNtritnOrdrIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getIdentifier().size() < i0+1) { nutritionorder.addIdentifier(); }
				String[] arrayi1 = n.getNtritnOrdrIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { nutritionorder.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrIdTypCdgSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getIdentifier().size() < i0+1) { nutritionorder.addIdentifier(); }
				String[] arrayi1 = n.getNtritnOrdrIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { nutritionorder.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getIdentifier().size() < i0+1) { nutritionorder.addIdentifier(); }
				String[] arrayi1 = n.getNtritnOrdrIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { nutritionorder.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrIdTypCdgVrsn() != null ) {

			String[] arrayi0 = n.getNtritnOrdrIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getIdentifier().size() < i0+1) { nutritionorder.addIdentifier(); }
				String[] arrayi1 = n.getNtritnOrdrIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { nutritionorder.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_Id_Typ_Txt ********************************************************************************/
		if(n.getNtritnOrdrIdTypTxt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getIdentifier().size() < i0+1) { nutritionorder.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_Id_Use ********************************************************************************/
		if(n.getNtritnOrdrIdUse() != null ) {

			String[] arrayi0 = n.getNtritnOrdrIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getIdentifier().size() < i0+1) { nutritionorder.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_Id_Vl ********************************************************************************/
		if(n.getNtritnOrdrIdVl() != null ) {

			String[] arrayi0 = n.getNtritnOrdrIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getIdentifier().size() < i0+1) { nutritionorder.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_InstantiatesUri ********************************************************************************/
		if(n.getNtritnOrdrInstantiatesUri() != null ) {

				for( String currListStrSplit : n.getNtritnOrdrInstantiatesUri().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			nutritionorder.addInstantiates(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** NtritnOrdr_InstantiatesCanonical ********************************************************************************/
		if(n.getNtritnOrdrInstantiatesCanonical() != null ) {

				for( String currListStrSplit : n.getNtritnOrdrInstantiatesCanonical().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			nutritionorder.addInstantiatesCanonical(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** NtritnOrdr_InstantiatesUri ********************************************************************************/
		if(n.getNtritnOrdrInstantiatesUri() != null ) {

				for( String currListStrSplit : n.getNtritnOrdrInstantiatesUri().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			nutritionorder.addInstantiatesUri(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** NtritnOrdr_Intent ********************************************************************************/
		if(n.getNtritnOrdrIntent() != null ) {

			if(n.getNtritnOrdrIntent().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrIntent()==null) {} else {
			nutritionorder.setIntent(new org.hl7.fhir.r4.model.NutritionOrder.NutritiionOrderIntentEnumFactory().fromCode(n.getNtritnOrdrIntent().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** NtritnOrdr_Nt_AthrRfrnc ********************************************************************************/
		if(n.getNtritnOrdrNtAthrRfrnc() != null ) {

			String[] arrayi0 = n.getNtritnOrdrNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getNote().size() < i0+1) { nutritionorder.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_Nt_AthrStrgTyp ********************************************************************************/
		if(n.getNtritnOrdrNtAthrStrgTyp() != null ) {

			String[] arrayi0 = n.getNtritnOrdrNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getNote().size() < i0+1) { nutritionorder.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_Nt_Txt ********************************************************************************/
		if(n.getNtritnOrdrNtTxt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getNote().size() < i0+1) { nutritionorder.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_Nt_Time ********************************************************************************/
		if(n.getNtritnOrdrNtTime() != null ) {

			String[] arrayi0 = n.getNtritnOrdrNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getNote().size() < i0+1) { nutritionorder.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietFluidConsistencyTypCdgCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietFluidConsistencyTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getFluidConsistencyType().size() < i0+1) { nutritionorder.getOralDiet().addFluidConsistencyType(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietFluidConsistencyTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getFluidConsistencyType().get(i0).getCoding().size() < i1+1) { nutritionorder.getOralDiet().getFluidConsistencyType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getFluidConsistencyType().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrOralDietFluidConsistencyTypCdgDsply() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietFluidConsistencyTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getFluidConsistencyType().size() < i0+1) { nutritionorder.getOralDiet().addFluidConsistencyType(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietFluidConsistencyTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getFluidConsistencyType().get(i0).getCoding().size() < i1+1) { nutritionorder.getOralDiet().getFluidConsistencyType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getFluidConsistencyType().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietFluidConsistencyTypCdgSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietFluidConsistencyTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getFluidConsistencyType().size() < i0+1) { nutritionorder.getOralDiet().addFluidConsistencyType(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietFluidConsistencyTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getFluidConsistencyType().get(i0).getCoding().size() < i1+1) { nutritionorder.getOralDiet().getFluidConsistencyType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getFluidConsistencyType().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrOralDietFluidConsistencyTypCdgUsrSltd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietFluidConsistencyTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getFluidConsistencyType().size() < i0+1) { nutritionorder.getOralDiet().addFluidConsistencyType(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietFluidConsistencyTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getFluidConsistencyType().get(i0).getCoding().size() < i1+1) { nutritionorder.getOralDiet().getFluidConsistencyType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getFluidConsistencyType().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrOralDietFluidConsistencyTypCdgVrsn() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietFluidConsistencyTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getFluidConsistencyType().size() < i0+1) { nutritionorder.getOralDiet().addFluidConsistencyType(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietFluidConsistencyTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getFluidConsistencyType().get(i0).getCoding().size() < i1+1) { nutritionorder.getOralDiet().getFluidConsistencyType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getFluidConsistencyType().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Txt ********************************************************************************/
		if(n.getNtritnOrdrOralDietFluidConsistencyTypTxt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietFluidConsistencyTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getFluidConsistencyType().size() < i0+1) { nutritionorder.getOralDiet().addFluidConsistencyType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getFluidConsistencyType().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Instrctn ********************************************************************************/
		if(n.getNtritnOrdrOralDietInstrctn() != null ) {

			if(n.getNtritnOrdrOralDietInstrctn().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrOralDietInstrctn()==null) {} else {
			nutritionorder.getOralDiet().setInstruction(n.getNtritnOrdrOralDietInstrctn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Amnt_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientAmntCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietNutrientAmntCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getNutrient().size() < i0+1) { nutritionorder.getOralDiet().addNutrient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getNutrient().get(i0).getAmount().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Amnt_Cmprtr ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientAmntCmprtr() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietNutrientAmntCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getNutrient().size() < i0+1) { nutritionorder.getOralDiet().addNutrient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getNutrient().get(i0).getAmount().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Amnt_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientAmntSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietNutrientAmntSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getNutrient().size() < i0+1) { nutritionorder.getOralDiet().addNutrient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getNutrient().get(i0).getAmount().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Amnt_Unt ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientAmntUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietNutrientAmntUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getNutrient().size() < i0+1) { nutritionorder.getOralDiet().addNutrient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getNutrient().get(i0).getAmount().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Amnt_Vl ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientAmntVl() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietNutrientAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getNutrient().size() < i0+1) { nutritionorder.getOralDiet().addNutrient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getNutrient().get(i0).getAmount().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientMdfrCdgCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietNutrientMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getNutrient().size() < i0+1) { nutritionorder.getOralDiet().addNutrient(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietNutrientMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getNutrient().get(i0).getModifier().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getNutrient().get(i0).getModifier().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getNutrient().get(i0).getModifier().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientMdfrCdgDsply() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietNutrientMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getNutrient().size() < i0+1) { nutritionorder.getOralDiet().addNutrient(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietNutrientMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getNutrient().get(i0).getModifier().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getNutrient().get(i0).getModifier().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getNutrient().get(i0).getModifier().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientMdfrCdgSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietNutrientMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getNutrient().size() < i0+1) { nutritionorder.getOralDiet().addNutrient(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietNutrientMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getNutrient().get(i0).getModifier().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getNutrient().get(i0).getModifier().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getNutrient().get(i0).getModifier().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientMdfrCdgUsrSltd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietNutrientMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getNutrient().size() < i0+1) { nutritionorder.getOralDiet().addNutrient(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietNutrientMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getNutrient().get(i0).getModifier().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getNutrient().get(i0).getModifier().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getNutrient().get(i0).getModifier().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientMdfrCdgVrsn() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietNutrientMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getNutrient().size() < i0+1) { nutritionorder.getOralDiet().addNutrient(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietNutrientMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getNutrient().get(i0).getModifier().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getNutrient().get(i0).getModifier().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getNutrient().get(i0).getModifier().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Txt ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientMdfrTxt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietNutrientMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getNutrient().size() < i0+1) { nutritionorder.getOralDiet().addNutrient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getNutrient().get(i0).getModifier().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlCdCdgCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietSchdlCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getSchedule().get(i0).getCode().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getSchedule().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlCdCdgDsply() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietSchdlCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getSchedule().get(i0).getCode().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getSchedule().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlCdCdgSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietSchdlCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getSchedule().get(i0).getCode().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getSchedule().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlCdCdgUsrSltd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietSchdlCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getSchedule().get(i0).getCode().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getSchedule().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlCdCdgVrsn() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietSchdlCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getSchedule().get(i0).getCode().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getSchedule().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Txt ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlCdTxt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Evnt ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlEvnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsDuration_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsDurationCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().getBoundsDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsDurationCmprtr() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsDuration_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsDurationSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().getBoundsDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsDuration_Unt ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsDurationUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().getBoundsDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsDuration_Vl ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsDurationVl() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsPrd_End ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsPrdEnd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().getBoundsPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsPrd_Strt ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsPrdStrt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().getBoundsPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsRngHiCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().getBoundsRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsRngHiCmprtr() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsRngHiSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().getBoundsRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsRngHiUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().getBoundsRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsRngHiVl() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsRngLwCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().getBoundsRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsRngLwCmprtr() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsRngLwSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().getBoundsRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsRngLwUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().getBoundsRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsRngLwVl() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Cnt ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptCnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().setCount(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_CntMx ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptCntMx() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().setCountMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Duration ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptDuration() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().setDuration((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_DurationMx ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptDurationMx() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().setDurationMax((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_DurationUnt ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptDurationUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Frqncy ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptFrqncy() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().setFrequency(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_FrqncyMx ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptFrqncyMx() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().setFrequencyMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Off ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptOff() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().setOffset(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Prd ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptPrd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().setPeriod((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_PrdMx ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptPrdMx() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().setPeriodMax((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_PrdUnt ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptPrdUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_TimeOfDay ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptTimeOfDay() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietSchdlRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getSchedule().size() < i0+1) { nutritionorder.getOralDiet().addSchedule(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {nutritionorder.getOralDiet().getSchedule().get(i0).getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureFoodTypCdgCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietTxtureFoodTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getTexture().size() < i0+1) { nutritionorder.getOralDiet().addTexture(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietTxtureFoodTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getTexture().get(i0).getFoodType().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getTexture().get(i0).getFoodType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getTexture().get(i0).getFoodType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureFoodTypCdgDsply() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietTxtureFoodTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getTexture().size() < i0+1) { nutritionorder.getOralDiet().addTexture(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietTxtureFoodTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getTexture().get(i0).getFoodType().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getTexture().get(i0).getFoodType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getTexture().get(i0).getFoodType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureFoodTypCdgSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietTxtureFoodTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getTexture().size() < i0+1) { nutritionorder.getOralDiet().addTexture(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietTxtureFoodTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getTexture().get(i0).getFoodType().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getTexture().get(i0).getFoodType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getTexture().get(i0).getFoodType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureFoodTypCdgUsrSltd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietTxtureFoodTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getTexture().size() < i0+1) { nutritionorder.getOralDiet().addTexture(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietTxtureFoodTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getTexture().get(i0).getFoodType().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getTexture().get(i0).getFoodType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getTexture().get(i0).getFoodType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureFoodTypCdgVrsn() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietTxtureFoodTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getTexture().size() < i0+1) { nutritionorder.getOralDiet().addTexture(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietTxtureFoodTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getTexture().get(i0).getFoodType().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getTexture().get(i0).getFoodType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getTexture().get(i0).getFoodType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Txt ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureFoodTypTxt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietTxtureFoodTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getTexture().size() < i0+1) { nutritionorder.getOralDiet().addTexture(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getTexture().get(i0).getFoodType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureMdfrCdgCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietTxtureMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getTexture().size() < i0+1) { nutritionorder.getOralDiet().addTexture(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietTxtureMdfrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getTexture().get(i0).getModifier().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getTexture().get(i0).getModifier().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getTexture().get(i0).getModifier().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureMdfrCdgDsply() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietTxtureMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getTexture().size() < i0+1) { nutritionorder.getOralDiet().addTexture(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietTxtureMdfrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getTexture().get(i0).getModifier().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getTexture().get(i0).getModifier().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getTexture().get(i0).getModifier().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureMdfrCdgSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietTxtureMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getTexture().size() < i0+1) { nutritionorder.getOralDiet().addTexture(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietTxtureMdfrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getTexture().get(i0).getModifier().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getTexture().get(i0).getModifier().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getTexture().get(i0).getModifier().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureMdfrCdgUsrSltd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietTxtureMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getTexture().size() < i0+1) { nutritionorder.getOralDiet().addTexture(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietTxtureMdfrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getTexture().get(i0).getModifier().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getTexture().get(i0).getModifier().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getTexture().get(i0).getModifier().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureMdfrCdgVrsn() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietTxtureMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getTexture().size() < i0+1) { nutritionorder.getOralDiet().addTexture(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietTxtureMdfrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getTexture().get(i0).getModifier().getCoding().size() < i1+1) { nutritionorder.getOralDiet().getTexture().get(i0).getModifier().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getTexture().get(i0).getModifier().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Txt ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureMdfrTxt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietTxtureMdfrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getTexture().size() < i0+1) { nutritionorder.getOralDiet().addTexture(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getTexture().get(i0).getModifier().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_OralDiet_Typ_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietTypCdgCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getType().size() < i0+1) { nutritionorder.getOralDiet().addType(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getType().get(i0).getCoding().size() < i1+1) { nutritionorder.getOralDiet().getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getType().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Typ_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrOralDietTypCdgDsply() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getType().size() < i0+1) { nutritionorder.getOralDiet().addType(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getType().get(i0).getCoding().size() < i1+1) { nutritionorder.getOralDiet().getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getType().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Typ_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietTypCdgSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getType().size() < i0+1) { nutritionorder.getOralDiet().addType(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getType().get(i0).getCoding().size() < i1+1) { nutritionorder.getOralDiet().getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getType().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Typ_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrOralDietTypCdgUsrSltd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getType().size() < i0+1) { nutritionorder.getOralDiet().addType(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getType().get(i0).getCoding().size() < i1+1) { nutritionorder.getOralDiet().getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getType().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Typ_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrOralDietTypCdgVrsn() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getType().size() < i0+1) { nutritionorder.getOralDiet().addType(); }
				String[] arrayi1 = n.getNtritnOrdrOralDietTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getOralDiet().getType().get(i0).getCoding().size() < i1+1) { nutritionorder.getOralDiet().getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getOralDiet().getType().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_OralDiet_Typ_Txt ********************************************************************************/
		if(n.getNtritnOrdrOralDietTypTxt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrOralDietTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getOralDiet().getType().size() < i0+1) { nutritionorder.getOralDiet().addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getOralDiet().getType().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_Ordrer ********************************************************************************/
		if(n.getNtritnOrdrOrdrer() != null ) {

			if(n.getNtritnOrdrOrdrer().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrOrdrer()==null) {} else {
			nutritionorder.setOrderer(new org.hl7.fhir.r4.model.Reference(n.getNtritnOrdrOrdrer().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** NtritnOrdr_Pnt ********************************************************************************/
		if(n.getNtritnOrdrPnt() != null ) {

			if(n.getNtritnOrdrPnt().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrPnt()==null) {} else {
			nutritionorder.setPatient(new org.hl7.fhir.r4.model.Reference(n.getNtritnOrdrPnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** NtritnOrdr_Sts ********************************************************************************/
		if(n.getNtritnOrdrSts() != null ) {

			if(n.getNtritnOrdrSts().replace("[","").replace("]","").equals("NULL") | n.getNtritnOrdrSts()==null) {} else {
			nutritionorder.setStatus(new org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderStatusEnumFactory().fromCode(n.getNtritnOrdrSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** NtritnOrdr_Supplement_Instrctn ********************************************************************************/
		if(n.getNtritnOrdrSupplementInstrctn() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementInstrctn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getSupplement().get(i0).setInstruction(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_Supplement_PrdctNm ********************************************************************************/
		if(n.getNtritnOrdrSupplementPrdctNm() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementPrdctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getSupplement().get(i0).setProductName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_Supplement_Qnty_Cd ********************************************************************************/
		if(n.getNtritnOrdrSupplementQntyCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getSupplement().get(i0).getQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_Supplement_Qnty_Cmprtr ********************************************************************************/
		if(n.getNtritnOrdrSupplementQntyCmprtr() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getSupplement().get(i0).getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** NtritnOrdr_Supplement_Qnty_Sys ********************************************************************************/
		if(n.getNtritnOrdrSupplementQntySys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getSupplement().get(i0).getQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_Supplement_Qnty_Unt ********************************************************************************/
		if(n.getNtritnOrdrSupplementQntyUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getSupplement().get(i0).getQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** NtritnOrdr_Supplement_Qnty_Vl ********************************************************************************/
		if(n.getNtritnOrdrSupplementQntyVl() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getSupplement().get(i0).getQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlCdCdgCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					String[] arrayi2 = n.getNtritnOrdrSupplementSchdlCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getCode().getCoding().size() < i2+1) { nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getCode().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlCdCdgDsply() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					String[] arrayi2 = n.getNtritnOrdrSupplementSchdlCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getCode().getCoding().size() < i2+1) { nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getCode().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlCdCdgSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					String[] arrayi2 = n.getNtritnOrdrSupplementSchdlCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getCode().getCoding().size() < i2+1) { nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getCode().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlCdCdgUsrSltd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					String[] arrayi2 = n.getNtritnOrdrSupplementSchdlCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getCode().getCoding().size() < i2+1) { nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getCode().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlCdCdgVrsn() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					String[] arrayi2 = n.getNtritnOrdrSupplementSchdlCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getCode().getCoding().size() < i2+1) { nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getCode().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Cd_Txt ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlCdTxt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getCode().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Evnt ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlEvnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsDuration_Cd ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsDurationCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().getBoundsDuration().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsDurationCmprtr() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsDuration_Sys ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsDurationSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().getBoundsDuration().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsDuration_Unt ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsDurationUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().getBoundsDuration().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsDuration_Vl ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsDurationVl() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsPrd_End ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsPrdEnd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().getBoundsPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsPrd_Strt ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsPrdStrt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().getBoundsPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsRngHiCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().getBoundsRange().getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsRngHiCmprtr() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsRngHiSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().getBoundsRange().getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsRngHiUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().getBoundsRange().getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsRngHiVl() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsRngLwCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().getBoundsRange().getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsRngLwCmprtr() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsRngLwSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().getBoundsRange().getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsRngLwUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().getBoundsRange().getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsRngLwVl() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Cnt ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptCnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().setCount(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_CntMx ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptCntMx() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().setCountMax(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Duration ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptDuration() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().setDuration((Double.parseDouble((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_DurationMx ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptDurationMx() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().setDurationMax((Double.parseDouble((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_DurationUnt ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptDurationUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Frqncy ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptFrqncy() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().setFrequency(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_FrqncyMx ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptFrqncyMx() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().setFrequencyMax(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Off ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptOff() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().setOffset(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Prd ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptPrd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().setPeriod((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_PrdMx ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptPrdMx() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().setPeriodMax((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_PrdUnt ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptPrdUnt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_TimeOfDay ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptTimeOfDay() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementSchdlRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementSchdlRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getSchedule().size() < i1+1) { nutritionorder.getSupplement().get(i0).addSchedule(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {nutritionorder.getSupplement().get(i0).getSchedule().get(i1).getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Typ_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrSupplementTypCdgCd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getType().getCoding().size() < i1+1) { nutritionorder.getSupplement().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Typ_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrSupplementTypCdgDsply() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getType().getCoding().size() < i1+1) { nutritionorder.getSupplement().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Typ_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrSupplementTypCdgSys() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getType().getCoding().size() < i1+1) { nutritionorder.getSupplement().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Typ_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrSupplementTypCdgUsrSltd() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getType().getCoding().size() < i1+1) { nutritionorder.getSupplement().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Typ_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrSupplementTypCdgVrsn() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				String[] arrayi1 = n.getNtritnOrdrSupplementTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(nutritionorder.getSupplement().get(i0).getType().getCoding().size() < i1+1) { nutritionorder.getSupplement().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {nutritionorder.getSupplement().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** NtritnOrdr_Supplement_Typ_Txt ********************************************************************************/
		if(n.getNtritnOrdrSupplementTypTxt() != null ) {

			String[] arrayi0 = n.getNtritnOrdrSupplementTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(nutritionorder.getSupplement().size() < i0+1) { nutritionorder.addSupplement(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {nutritionorder.getSupplement().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		return nutritionorder;
	}
}
