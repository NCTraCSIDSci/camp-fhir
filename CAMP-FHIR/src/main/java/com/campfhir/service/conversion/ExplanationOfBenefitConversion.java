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

		/******************** explanationofbenefitaccident ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AccidentComponent explanationofbenefitaccident =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.AccidentComponent();
		explanationofbenefit.setAccident(explanationofbenefitaccident);

		/******************** ExplntnOfBnft_Accident_Dt ********************************************************************************/
		if(e.getExplntnOfBnftAccidentDt() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_Accident_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_Accident_Dtdate = ExplntnOfBnft_Accident_Dtsdf.parse(e.getExplntnOfBnftAccidentDt());
			explanationofbenefitaccident.setDate(ExplntnOfBnft_Accident_Dtdate);
		}
		/******************** explanationofbenefitaccidentlocationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address explanationofbenefitaccidentlocationaddress =  new org.hl7.fhir.r4.model.Address();
		explanationofbenefitaccident.setLocation(explanationofbenefitaccidentlocationaddress);

		/******************** ExplntnOfBnft_Accident_LctnAddr_City ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrCity() != null) {
			explanationofbenefitaccidentlocationaddress.setCity(e.getExplntnOfBnftAccidentLctnAddrCity());
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_Cntry ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrCntry() != null) {
			explanationofbenefitaccidentlocationaddress.setCountry(e.getExplntnOfBnftAccidentLctnAddrCntry());
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_District ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrDistrict() != null) {
			explanationofbenefitaccidentlocationaddress.setDistrict(e.getExplntnOfBnftAccidentLctnAddrDistrict());
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_Line ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrLine() != null) {
			explanationofbenefitaccidentlocationaddress.addLine(e.getExplntnOfBnftAccidentLctnAddrLine());
		}
		/******************** explanationofbenefitaccidentlocationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitaccidentlocationaddressperiod =  new org.hl7.fhir.r4.model.Period();
		explanationofbenefitaccidentlocationaddress.setPeriod(explanationofbenefitaccidentlocationaddressperiod);

		/******************** ExplntnOfBnft_Accident_LctnAddr_Prd_End ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrPrdEnd() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_Accident_LctnAddr_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_Accident_LctnAddr_Prd_Enddate = ExplntnOfBnft_Accident_LctnAddr_Prd_Endsdf.parse(e.getExplntnOfBnftAccidentLctnAddrPrdEnd());
			explanationofbenefitaccidentlocationaddressperiod.setEnd(ExplntnOfBnft_Accident_LctnAddr_Prd_Enddate);
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_Prd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrPrdStrt() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_Accident_LctnAddr_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_Accident_LctnAddr_Prd_Strtdate = ExplntnOfBnft_Accident_LctnAddr_Prd_Strtsdf.parse(e.getExplntnOfBnftAccidentLctnAddrPrdStrt());
			explanationofbenefitaccidentlocationaddressperiod.setStart(ExplntnOfBnft_Accident_LctnAddr_Prd_Strtdate);
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_PostalCd ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrPostalCd() != null) {
			explanationofbenefitaccidentlocationaddress.setPostalCode(e.getExplntnOfBnftAccidentLctnAddrPostalCd());
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_State ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrState() != null) {
			explanationofbenefitaccidentlocationaddress.setState(e.getExplntnOfBnftAccidentLctnAddrState());
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnAddrTxt() != null) {
			explanationofbenefitaccidentlocationaddress.setText(e.getExplntnOfBnftAccidentLctnAddrTxt());
		}
		/******************** explanationofbenefitaccidentlocationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory explanationofbenefitaccidentlocationaddresstype =  new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();
		explanationofbenefitaccidentlocationaddress.setType(explanationofbenefitaccidentlocationaddresstype.fromCode(e.getExplntnOfBnftAccidentLctnAddrTyp()));

		/******************** explanationofbenefitaccidentlocationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory explanationofbenefitaccidentlocationaddressuse =  new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();
		explanationofbenefitaccidentlocationaddress.setUse(explanationofbenefitaccidentlocationaddressuse.fromCode(e.getExplntnOfBnftAccidentLctnAddrUse()));

		/******************** ExplntnOfBnft_Accident_LctnRfrnc ********************************************************************************/
		if(e.getExplntnOfBnftAccidentLctnRfrnc() != null) {
			explanationofbenefitaccident.setLocation( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftAccidentLctnRfrnc()));
		}
		/******************** explanationofbenefitaccidenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitaccidenttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitaccident.setType(explanationofbenefitaccidenttype);

		/******************** explanationofbenefitaccidenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitaccidenttypecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitaccidenttype.addCoding(explanationofbenefitaccidenttypecoding);

		/******************** ExplntnOfBnft_Accident_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAccidentTypCdgCd() != null) {
			explanationofbenefitaccidenttypecoding.setCode(e.getExplntnOfBnftAccidentTypCdgCd());
		}
		/******************** ExplntnOfBnft_Accident_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAccidentTypCdgDsply() != null) {
			explanationofbenefitaccidenttypecoding.setDisplay(e.getExplntnOfBnftAccidentTypCdgDsply());
		}
		/******************** ExplntnOfBnft_Accident_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAccidentTypCdgSys() != null) {
			explanationofbenefitaccidenttypecoding.setSystem(e.getExplntnOfBnftAccidentTypCdgSys());
		}
		/******************** ExplntnOfBnft_Accident_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAccidentTypCdgUsrSltd() != null) {
			explanationofbenefitaccidenttypecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftAccidentTypCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Accident_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAccidentTypCdgVrsn() != null) {
			explanationofbenefitaccidenttypecoding.setVersion(e.getExplntnOfBnftAccidentTypCdgVrsn());
		}
		/******************** ExplntnOfBnft_Accident_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAccidentTypTxt() != null) {
			explanationofbenefitaccidenttype.setText(e.getExplntnOfBnftAccidentTypTxt());
		}
		/******************** explanationofbenefitadditem ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemComponent explanationofbenefitadditem =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemComponent();
		explanationofbenefit.addAddItem(explanationofbenefitadditem);

		/******************** explanationofbenefitadditemadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent explanationofbenefitadditemadjudication =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent();
		explanationofbenefitadditem.addAdjudication(explanationofbenefitadditemadjudication);

		/******************** explanationofbenefitadditemadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemadjudicationamount =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefitadditemadjudication.setAmount(explanationofbenefitadditemadjudicationamount);

		/******************** ExplntnOfBnft_AddItm_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnAmntCrncy() != null) {
			explanationofbenefitadditemadjudicationamount.setCurrency(e.getExplntnOfBnftAddItmAdjdctnAmntCrncy());
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Amnt_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnAmntVl() != null) {
			explanationofbenefitadditemadjudicationamount.setValue(Double.parseDouble((e.getExplntnOfBnftAddItmAdjdctnAmntVl())));
		}
		/******************** explanationofbenefitadditemadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemadjudicationcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitadditemadjudication.setCategory(explanationofbenefitadditemadjudicationcategory);

		/******************** explanationofbenefitadditemadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemadjudicationcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitadditemadjudicationcategory.addCoding(explanationofbenefitadditemadjudicationcategorycoding);

		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnCtgryCdgCd() != null) {
			explanationofbenefitadditemadjudicationcategorycoding.setCode(e.getExplntnOfBnftAddItmAdjdctnCtgryCdgCd());
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnCtgryCdgDsply() != null) {
			explanationofbenefitadditemadjudicationcategorycoding.setDisplay(e.getExplntnOfBnftAddItmAdjdctnCtgryCdgDsply());
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnCtgryCdgSys() != null) {
			explanationofbenefitadditemadjudicationcategorycoding.setSystem(e.getExplntnOfBnftAddItmAdjdctnCtgryCdgSys());
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnCtgryCdgUsrSltd() != null) {
			explanationofbenefitadditemadjudicationcategorycoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftAddItmAdjdctnCtgryCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnCtgryCdgVrsn() != null) {
			explanationofbenefitadditemadjudicationcategorycoding.setVersion(e.getExplntnOfBnftAddItmAdjdctnCtgryCdgVrsn());
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnCtgryTxt() != null) {
			explanationofbenefitadditemadjudicationcategory.setText(e.getExplntnOfBnftAddItmAdjdctnCtgryTxt());
		}
		/******************** explanationofbenefitadditemadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemadjudicationreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitadditemadjudication.setReason(explanationofbenefitadditemadjudicationreason);

		/******************** explanationofbenefitadditemadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemadjudicationreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitadditemadjudicationreason.addCoding(explanationofbenefitadditemadjudicationreasoncoding);

		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnRsnCdgCd() != null) {
			explanationofbenefitadditemadjudicationreasoncoding.setCode(e.getExplntnOfBnftAddItmAdjdctnRsnCdgCd());
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnRsnCdgDsply() != null) {
			explanationofbenefitadditemadjudicationreasoncoding.setDisplay(e.getExplntnOfBnftAddItmAdjdctnRsnCdgDsply());
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnRsnCdgSys() != null) {
			explanationofbenefitadditemadjudicationreasoncoding.setSystem(e.getExplntnOfBnftAddItmAdjdctnRsnCdgSys());
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnRsnCdgUsrSltd() != null) {
			explanationofbenefitadditemadjudicationreasoncoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftAddItmAdjdctnRsnCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnRsnCdgVrsn() != null) {
			explanationofbenefitadditemadjudicationreasoncoding.setVersion(e.getExplntnOfBnftAddItmAdjdctnRsnCdgVrsn());
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnRsnTxt() != null) {
			explanationofbenefitadditemadjudicationreason.setText(e.getExplntnOfBnftAddItmAdjdctnRsnTxt());
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmAdjdctnVl() != null) {
			explanationofbenefitadditemadjudication.setValue(Double.parseDouble((e.getExplntnOfBnftAddItmAdjdctnVl())));
		}
		/******************** explanationofbenefitadditembodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditembodysite =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitadditem.setBodySite(explanationofbenefitadditembodysite);

		/******************** explanationofbenefitadditembodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditembodysitecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitadditembodysite.addCoding(explanationofbenefitadditembodysitecoding);

		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmBodySiteCdgCd() != null) {
			explanationofbenefitadditembodysitecoding.setCode(e.getExplntnOfBnftAddItmBodySiteCdgCd());
		}
		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmBodySiteCdgDsply() != null) {
			explanationofbenefitadditembodysitecoding.setDisplay(e.getExplntnOfBnftAddItmBodySiteCdgDsply());
		}
		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmBodySiteCdgSys() != null) {
			explanationofbenefitadditembodysitecoding.setSystem(e.getExplntnOfBnftAddItmBodySiteCdgSys());
		}
		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmBodySiteCdgUsrSltd() != null) {
			explanationofbenefitadditembodysitecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftAddItmBodySiteCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmBodySiteCdgVrsn() != null) {
			explanationofbenefitadditembodysitecoding.setVersion(e.getExplntnOfBnftAddItmBodySiteCdgVrsn());
		}
		/******************** ExplntnOfBnft_AddItm_BodySite_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmBodySiteTxt() != null) {
			explanationofbenefitadditembodysite.setText(e.getExplntnOfBnftAddItmBodySiteTxt());
		}
		/******************** explanationofbenefitadditemdetail ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailComponent explanationofbenefitadditemdetail =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailComponent();
		explanationofbenefitadditem.addDetail(explanationofbenefitadditemdetail);

		/******************** explanationofbenefitadditemdetailadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent explanationofbenefitadditemdetailadjudication =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent();
		explanationofbenefitadditemdetail.addAdjudication(explanationofbenefitadditemdetailadjudication);

		/******************** explanationofbenefitadditemdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemdetailadjudicationamount =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefitadditemdetailadjudication.setAmount(explanationofbenefitadditemdetailadjudicationamount);

		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnAmntCrncy() != null) {
			explanationofbenefitadditemdetailadjudicationamount.setCurrency(e.getExplntnOfBnftAddItmDtlAdjdctnAmntCrncy());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnAmntVl() != null) {
			explanationofbenefitadditemdetailadjudicationamount.setValue(Double.parseDouble((e.getExplntnOfBnftAddItmDtlAdjdctnAmntVl())));
		}
		/******************** explanationofbenefitadditemdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailadjudicationcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitadditemdetailadjudication.setCategory(explanationofbenefitadditemdetailadjudicationcategory);

		/******************** explanationofbenefitadditemdetailadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemdetailadjudicationcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitadditemdetailadjudicationcategory.addCoding(explanationofbenefitadditemdetailadjudicationcategorycoding);

		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgCd() != null) {
			explanationofbenefitadditemdetailadjudicationcategorycoding.setCode(e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgCd());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgDsply() != null) {
			explanationofbenefitadditemdetailadjudicationcategorycoding.setDisplay(e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgDsply());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgSys() != null) {
			explanationofbenefitadditemdetailadjudicationcategorycoding.setSystem(e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgSys());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgUsrSltd() != null) {
			explanationofbenefitadditemdetailadjudicationcategorycoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgVrsn() != null) {
			explanationofbenefitadditemdetailadjudicationcategorycoding.setVersion(e.getExplntnOfBnftAddItmDtlAdjdctnCtgryCdgVrsn());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnCtgryTxt() != null) {
			explanationofbenefitadditemdetailadjudicationcategory.setText(e.getExplntnOfBnftAddItmDtlAdjdctnCtgryTxt());
		}
		/******************** explanationofbenefitadditemdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailadjudicationreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitadditemdetailadjudication.setReason(explanationofbenefitadditemdetailadjudicationreason);

		/******************** explanationofbenefitadditemdetailadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemdetailadjudicationreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitadditemdetailadjudicationreason.addCoding(explanationofbenefitadditemdetailadjudicationreasoncoding);

		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgCd() != null) {
			explanationofbenefitadditemdetailadjudicationreasoncoding.setCode(e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgCd());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgDsply() != null) {
			explanationofbenefitadditemdetailadjudicationreasoncoding.setDisplay(e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgDsply());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgSys() != null) {
			explanationofbenefitadditemdetailadjudicationreasoncoding.setSystem(e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgSys());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgUsrSltd() != null) {
			explanationofbenefitadditemdetailadjudicationreasoncoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgVrsn() != null) {
			explanationofbenefitadditemdetailadjudicationreasoncoding.setVersion(e.getExplntnOfBnftAddItmDtlAdjdctnRsnCdgVrsn());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnRsnTxt() != null) {
			explanationofbenefitadditemdetailadjudicationreason.setText(e.getExplntnOfBnftAddItmDtlAdjdctnRsnTxt());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlAdjdctnVl() != null) {
			explanationofbenefitadditemdetailadjudication.setValue(Double.parseDouble((e.getExplntnOfBnftAddItmDtlAdjdctnVl())));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Factor ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlFactor() != null) {
			explanationofbenefitadditemdetail.setFactor(Double.parseDouble((e.getExplntnOfBnftAddItmDtlFactor())));
		}
		/******************** explanationofbenefitadditemdetailmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailmodifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitadditemdetail.addModifier(explanationofbenefitadditemdetailmodifier);

		/******************** explanationofbenefitadditemdetailmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemdetailmodifiercoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitadditemdetailmodifier.addCoding(explanationofbenefitadditemdetailmodifiercoding);

		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlMdfrCdgCd() != null) {
			explanationofbenefitadditemdetailmodifiercoding.setCode(e.getExplntnOfBnftAddItmDtlMdfrCdgCd());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlMdfrCdgDsply() != null) {
			explanationofbenefitadditemdetailmodifiercoding.setDisplay(e.getExplntnOfBnftAddItmDtlMdfrCdgDsply());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlMdfrCdgSys() != null) {
			explanationofbenefitadditemdetailmodifiercoding.setSystem(e.getExplntnOfBnftAddItmDtlMdfrCdgSys());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlMdfrCdgUsrSltd() != null) {
			explanationofbenefitadditemdetailmodifiercoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftAddItmDtlMdfrCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlMdfrCdgVrsn() != null) {
			explanationofbenefitadditemdetailmodifiercoding.setVersion(e.getExplntnOfBnftAddItmDtlMdfrCdgVrsn());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlMdfrTxt() != null) {
			explanationofbenefitadditemdetailmodifier.setText(e.getExplntnOfBnftAddItmDtlMdfrTxt());
		}
		/******************** explanationofbenefitadditemdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemdetailnet =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefitadditemdetail.setNet(explanationofbenefitadditemdetailnet);

		/******************** ExplntnOfBnft_AddItm_Dtl_Net_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlNetCrncy() != null) {
			explanationofbenefitadditemdetailnet.setCurrency(e.getExplntnOfBnftAddItmDtlNetCrncy());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Net_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlNetVl() != null) {
			explanationofbenefitadditemdetailnet.setValue(Double.parseDouble((e.getExplntnOfBnftAddItmDtlNetVl())));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_NtNmbr ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlNtNmbr() != null) {
			explanationofbenefitadditemdetail.addNoteNumber(Integer.parseInt(e.getExplntnOfBnftAddItmDtlNtNmbr()));
		}
		/******************** explanationofbenefitadditemdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailproductorservice =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitadditemdetail.setProductOrService(explanationofbenefitadditemdetailproductorservice);

		/******************** explanationofbenefitadditemdetailproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemdetailproductorservicecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitadditemdetailproductorservice.addCoding(explanationofbenefitadditemdetailproductorservicecoding);

		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgCd() != null) {
			explanationofbenefitadditemdetailproductorservicecoding.setCode(e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgCd());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgDsply() != null) {
			explanationofbenefitadditemdetailproductorservicecoding.setDisplay(e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgDsply());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgSys() != null) {
			explanationofbenefitadditemdetailproductorservicecoding.setSystem(e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgSys());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgUsrSltd() != null) {
			explanationofbenefitadditemdetailproductorservicecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgVrsn() != null) {
			explanationofbenefitadditemdetailproductorservicecoding.setVersion(e.getExplntnOfBnftAddItmDtlPrdctOrSrvCdgVrsn());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlPrdctOrSrvTxt() != null) {
			explanationofbenefitadditemdetailproductorservice.setText(e.getExplntnOfBnftAddItmDtlPrdctOrSrvTxt());
		}
		/******************** explanationofbenefitadditemdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefitadditemdetailquantity =  new org.hl7.fhir.r4.model.Quantity();
		explanationofbenefitadditemdetail.setQuantity(explanationofbenefitadditemdetailquantity);

		/******************** ExplntnOfBnft_AddItm_Dtl_Qnty_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlQntyCd() != null) {
			explanationofbenefitadditemdetailquantity.setCode(e.getExplntnOfBnftAddItmDtlQntyCd());
		}
		/******************** explanationofbenefitadditemdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory explanationofbenefitadditemdetailquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		explanationofbenefitadditemdetailquantity.setComparator(explanationofbenefitadditemdetailquantitycomparator.fromCode(e.getExplntnOfBnftAddItmDtlQntyCmprtr()));

		/******************** ExplntnOfBnft_AddItm_Dtl_Qnty_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlQntySys() != null) {
			explanationofbenefitadditemdetailquantity.setSystem(e.getExplntnOfBnftAddItmDtlQntySys());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Qnty_Unt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlQntyUnt() != null) {
			explanationofbenefitadditemdetailquantity.setUnit(e.getExplntnOfBnftAddItmDtlQntyUnt());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Qnty_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlQntyVl() != null) {
			explanationofbenefitadditemdetailquantity.setValue(Double.parseDouble((e.getExplntnOfBnftAddItmDtlQntyVl())));
		}
		/******************** explanationofbenefitadditemdetailsubdetail ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailSubDetailComponent explanationofbenefitadditemdetailsubdetail =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailSubDetailComponent();
		explanationofbenefitadditemdetail.addSubDetail(explanationofbenefitadditemdetailsubdetail);

		/******************** explanationofbenefitadditemdetailsubdetailadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent explanationofbenefitadditemdetailsubdetailadjudication =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent();
		explanationofbenefitadditemdetailsubdetail.addAdjudication(explanationofbenefitadditemdetailsubdetailadjudication);

		/******************** explanationofbenefitadditemdetailsubdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemdetailsubdetailadjudicationamount =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefitadditemdetailsubdetailadjudication.setAmount(explanationofbenefitadditemdetailsubdetailadjudicationamount);

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntCrncy() != null) {
			explanationofbenefitadditemdetailsubdetailadjudicationamount.setCurrency(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntCrncy());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntVl() != null) {
			explanationofbenefitadditemdetailsubdetailadjudicationamount.setValue(Double.parseDouble((e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntVl())));
		}
		/******************** explanationofbenefitadditemdetailsubdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailsubdetailadjudicationcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitadditemdetailsubdetailadjudication.setCategory(explanationofbenefitadditemdetailsubdetailadjudicationcategory);

		/******************** explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitadditemdetailsubdetailadjudicationcategory.addCoding(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding);

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgCd() != null) {
			explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.setCode(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgCd());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgDsply() != null) {
			explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.setDisplay(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgDsply());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgSys() != null) {
			explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.setSystem(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgSys());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd() != null) {
			explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgVrsn() != null) {
			explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.setVersion(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgVrsn());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryTxt() != null) {
			explanationofbenefitadditemdetailsubdetailadjudicationcategory.setText(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryTxt());
		}
		/******************** explanationofbenefitadditemdetailsubdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailsubdetailadjudicationreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitadditemdetailsubdetailadjudication.setReason(explanationofbenefitadditemdetailsubdetailadjudicationreason);

		/******************** explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitadditemdetailsubdetailadjudicationreason.addCoding(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding);

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgCd() != null) {
			explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.setCode(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgCd());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgDsply() != null) {
			explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.setDisplay(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgDsply());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgSys() != null) {
			explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.setSystem(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgSys());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd() != null) {
			explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgVrsn() != null) {
			explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.setVersion(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgVrsn());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnTxt() != null) {
			explanationofbenefitadditemdetailsubdetailadjudicationreason.setText(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnTxt());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnVl() != null) {
			explanationofbenefitadditemdetailsubdetailadjudication.setValue(Double.parseDouble((e.getExplntnOfBnftAddItmDtlSubDtlAdjdctnVl())));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Factor ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlFactor() != null) {
			explanationofbenefitadditemdetailsubdetail.setFactor(new java.math.BigDecimal((e.getExplntnOfBnftAddItmDtlSubDtlFactor())));
		}
		/******************** explanationofbenefitadditemdetailsubdetailmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailsubdetailmodifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitadditemdetailsubdetail.addModifier(explanationofbenefitadditemdetailsubdetailmodifier);

		/******************** explanationofbenefitadditemdetailsubdetailmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemdetailsubdetailmodifiercoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitadditemdetailsubdetailmodifier.addCoding(explanationofbenefitadditemdetailsubdetailmodifiercoding);

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgCd() != null) {
			explanationofbenefitadditemdetailsubdetailmodifiercoding.setCode(e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgCd());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgDsply() != null) {
			explanationofbenefitadditemdetailsubdetailmodifiercoding.setDisplay(e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgDsply());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgSys() != null) {
			explanationofbenefitadditemdetailsubdetailmodifiercoding.setSystem(e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgSys());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgUsrSltd() != null) {
			explanationofbenefitadditemdetailsubdetailmodifiercoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgVrsn() != null) {
			explanationofbenefitadditemdetailsubdetailmodifiercoding.setVersion(e.getExplntnOfBnftAddItmDtlSubDtlMdfrCdgVrsn());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlMdfrTxt() != null) {
			explanationofbenefitadditemdetailsubdetailmodifier.setText(e.getExplntnOfBnftAddItmDtlSubDtlMdfrTxt());
		}
		/******************** explanationofbenefitadditemdetailsubdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemdetailsubdetailnet =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefitadditemdetailsubdetail.setNet(explanationofbenefitadditemdetailsubdetailnet);

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Net_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlNetCrncy() != null) {
			explanationofbenefitadditemdetailsubdetailnet.setCurrency(e.getExplntnOfBnftAddItmDtlSubDtlNetCrncy());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Net_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlNetVl() != null) {
			explanationofbenefitadditemdetailsubdetailnet.setValue(Double.parseDouble((e.getExplntnOfBnftAddItmDtlSubDtlNetVl())));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_NtNmbr ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlNtNmbr() != null) {
			explanationofbenefitadditemdetailsubdetail.addNoteNumber(Integer.parseInt(e.getExplntnOfBnftAddItmDtlSubDtlNtNmbr()));
		}
		/******************** explanationofbenefitadditemdetailsubdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailsubdetailproductorservice =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitadditemdetailsubdetail.setProductOrService(explanationofbenefitadditemdetailsubdetailproductorservice);

		/******************** explanationofbenefitadditemdetailsubdetailproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemdetailsubdetailproductorservicecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitadditemdetailsubdetailproductorservice.addCoding(explanationofbenefitadditemdetailsubdetailproductorservicecoding);

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgCd() != null) {
			explanationofbenefitadditemdetailsubdetailproductorservicecoding.setCode(e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgCd());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgDsply() != null) {
			explanationofbenefitadditemdetailsubdetailproductorservicecoding.setDisplay(e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgDsply());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgSys() != null) {
			explanationofbenefitadditemdetailsubdetailproductorservicecoding.setSystem(e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgSys());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd() != null) {
			explanationofbenefitadditemdetailsubdetailproductorservicecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgVrsn() != null) {
			explanationofbenefitadditemdetailsubdetailproductorservicecoding.setVersion(e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgVrsn());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvTxt() != null) {
			explanationofbenefitadditemdetailsubdetailproductorservice.setText(e.getExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvTxt());
		}
		/******************** explanationofbenefitadditemdetailsubdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefitadditemdetailsubdetailquantity =  new org.hl7.fhir.r4.model.Quantity();
		explanationofbenefitadditemdetailsubdetail.setQuantity(explanationofbenefitadditemdetailsubdetailquantity);

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Qnty_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlQntyCd() != null) {
			explanationofbenefitadditemdetailsubdetailquantity.setCode(e.getExplntnOfBnftAddItmDtlSubDtlQntyCd());
		}
		/******************** explanationofbenefitadditemdetailsubdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory explanationofbenefitadditemdetailsubdetailquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		explanationofbenefitadditemdetailsubdetailquantity.setComparator(explanationofbenefitadditemdetailsubdetailquantitycomparator.fromCode(e.getExplntnOfBnftAddItmDtlSubDtlQntyCmprtr()));

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Qnty_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlQntySys() != null) {
			explanationofbenefitadditemdetailsubdetailquantity.setSystem(e.getExplntnOfBnftAddItmDtlSubDtlQntySys());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Qnty_Unt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlQntyUnt() != null) {
			explanationofbenefitadditemdetailsubdetailquantity.setUnit(e.getExplntnOfBnftAddItmDtlSubDtlQntyUnt());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Qnty_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlQntyVl() != null) {
			explanationofbenefitadditemdetailsubdetailquantity.setValue(Double.parseDouble((e.getExplntnOfBnftAddItmDtlSubDtlQntyVl())));
		}
		/******************** explanationofbenefitadditemdetailsubdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemdetailsubdetailunitprice =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefitadditemdetailsubdetail.setUnitPrice(explanationofbenefitadditemdetailsubdetailunitprice);

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_UntPrice_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlUntPriceCrncy() != null) {
			explanationofbenefitadditemdetailsubdetailunitprice.setCurrency(e.getExplntnOfBnftAddItmDtlSubDtlUntPriceCrncy());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_UntPrice_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSubDtlUntPriceVl() != null) {
			explanationofbenefitadditemdetailsubdetailunitprice.setValue(Double.parseDouble((e.getExplntnOfBnftAddItmDtlSubDtlUntPriceVl())));
		}
		/******************** explanationofbenefitadditemdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemdetailunitprice =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefitadditemdetail.setUnitPrice(explanationofbenefitadditemdetailunitprice);

		/******************** ExplntnOfBnft_AddItm_Dtl_UntPrice_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlUntPriceCrncy() != null) {
			explanationofbenefitadditemdetailunitprice.setCurrency(e.getExplntnOfBnftAddItmDtlUntPriceCrncy());
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_UntPrice_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlUntPriceVl() != null) {
			explanationofbenefitadditemdetailunitprice.setValue(Double.parseDouble((e.getExplntnOfBnftAddItmDtlUntPriceVl())));
		}
		/******************** ExplntnOfBnft_AddItm_DtlSqnc ********************************************************************************/
		if(e.getExplntnOfBnftAddItmDtlSqnc() != null) {
			explanationofbenefitadditem.addDetailSequence(Integer.parseInt(e.getExplntnOfBnftAddItmDtlSqnc()));
		}
		/******************** ExplntnOfBnft_AddItm_Factor ********************************************************************************/
		if(e.getExplntnOfBnftAddItmFactor() != null) {
			explanationofbenefitadditem.setFactor(Double.parseDouble((e.getExplntnOfBnftAddItmFactor())));
		}
		/******************** ExplntnOfBnft_AddItm_ItmSqnc ********************************************************************************/
		if(e.getExplntnOfBnftAddItmItmSqnc() != null) {
			explanationofbenefitadditem.addItemSequence(Integer.parseInt(e.getExplntnOfBnftAddItmItmSqnc()));
		}
		/******************** explanationofbenefitadditemlocationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address explanationofbenefitadditemlocationaddress =  new org.hl7.fhir.r4.model.Address();
		explanationofbenefitadditem.setLocation(explanationofbenefitadditemlocationaddress);

		/******************** ExplntnOfBnft_AddItm_LctnAddr_City ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrCity() != null) {
			explanationofbenefitadditemlocationaddress.setCity(e.getExplntnOfBnftAddItmLctnAddrCity());
		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_Cntry ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrCntry() != null) {
			explanationofbenefitadditemlocationaddress.setCountry(e.getExplntnOfBnftAddItmLctnAddrCntry());
		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_District ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrDistrict() != null) {
			explanationofbenefitadditemlocationaddress.setDistrict(e.getExplntnOfBnftAddItmLctnAddrDistrict());
		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_Line ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrLine() != null) {
			explanationofbenefitadditemlocationaddress.addLine(e.getExplntnOfBnftAddItmLctnAddrLine());
		}
		/******************** explanationofbenefitadditemlocationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitadditemlocationaddressperiod =  new org.hl7.fhir.r4.model.Period();
		explanationofbenefitadditemlocationaddress.setPeriod(explanationofbenefitadditemlocationaddressperiod);

		/******************** ExplntnOfBnft_AddItm_LctnAddr_Prd_End ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrPrdEnd() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_AddItm_LctnAddr_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_AddItm_LctnAddr_Prd_Enddate = ExplntnOfBnft_AddItm_LctnAddr_Prd_Endsdf.parse(e.getExplntnOfBnftAddItmLctnAddrPrdEnd());
			explanationofbenefitadditemlocationaddressperiod.setEnd(ExplntnOfBnft_AddItm_LctnAddr_Prd_Enddate);
		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_Prd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrPrdStrt() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_AddItm_LctnAddr_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_AddItm_LctnAddr_Prd_Strtdate = ExplntnOfBnft_AddItm_LctnAddr_Prd_Strtsdf.parse(e.getExplntnOfBnftAddItmLctnAddrPrdStrt());
			explanationofbenefitadditemlocationaddressperiod.setStart(ExplntnOfBnft_AddItm_LctnAddr_Prd_Strtdate);
		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_PostalCd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrPostalCd() != null) {
			explanationofbenefitadditemlocationaddress.setPostalCode(e.getExplntnOfBnftAddItmLctnAddrPostalCd());
		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_State ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrState() != null) {
			explanationofbenefitadditemlocationaddress.setState(e.getExplntnOfBnftAddItmLctnAddrState());
		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnAddrTxt() != null) {
			explanationofbenefitadditemlocationaddress.setText(e.getExplntnOfBnftAddItmLctnAddrTxt());
		}
		/******************** explanationofbenefitadditemlocationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory explanationofbenefitadditemlocationaddresstype =  new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();
		explanationofbenefitadditemlocationaddress.setType(explanationofbenefitadditemlocationaddresstype.fromCode(e.getExplntnOfBnftAddItmLctnAddrTyp()));

		/******************** explanationofbenefitadditemlocationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory explanationofbenefitadditemlocationaddressuse =  new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();
		explanationofbenefitadditemlocationaddress.setUse(explanationofbenefitadditemlocationaddressuse.fromCode(e.getExplntnOfBnftAddItmLctnAddrUse()));

		/******************** explanationofbenefitadditemlocationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemlocationcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitadditem.setLocation(explanationofbenefitadditemlocationcodeableconcept);

		/******************** explanationofbenefitadditemlocationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemlocationcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitadditemlocationcodeableconcept.addCoding(explanationofbenefitadditemlocationcodeableconceptcoding);

		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnCdbleCncptCdgCd() != null) {
			explanationofbenefitadditemlocationcodeableconceptcoding.setCode(e.getExplntnOfBnftAddItmLctnCdbleCncptCdgCd());
		}
		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnCdbleCncptCdgDsply() != null) {
			explanationofbenefitadditemlocationcodeableconceptcoding.setDisplay(e.getExplntnOfBnftAddItmLctnCdbleCncptCdgDsply());
		}
		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnCdbleCncptCdgSys() != null) {
			explanationofbenefitadditemlocationcodeableconceptcoding.setSystem(e.getExplntnOfBnftAddItmLctnCdbleCncptCdgSys());
		}
		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnCdbleCncptCdgUsrSltd() != null) {
			explanationofbenefitadditemlocationcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftAddItmLctnCdbleCncptCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnCdbleCncptCdgVrsn() != null) {
			explanationofbenefitadditemlocationcodeableconceptcoding.setVersion(e.getExplntnOfBnftAddItmLctnCdbleCncptCdgVrsn());
		}
		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnCdbleCncptTxt() != null) {
			explanationofbenefitadditemlocationcodeableconcept.setText(e.getExplntnOfBnftAddItmLctnCdbleCncptTxt());
		}
		/******************** ExplntnOfBnft_AddItm_LctnRfrnc ********************************************************************************/
		if(e.getExplntnOfBnftAddItmLctnRfrnc() != null) {
			explanationofbenefitadditem.setLocation( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftAddItmLctnRfrnc()));
		}
		/******************** explanationofbenefitadditemmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemmodifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitadditem.addModifier(explanationofbenefitadditemmodifier);

		/******************** explanationofbenefitadditemmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemmodifiercoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitadditemmodifier.addCoding(explanationofbenefitadditemmodifiercoding);

		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmMdfrCdgCd() != null) {
			explanationofbenefitadditemmodifiercoding.setCode(e.getExplntnOfBnftAddItmMdfrCdgCd());
		}
		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmMdfrCdgDsply() != null) {
			explanationofbenefitadditemmodifiercoding.setDisplay(e.getExplntnOfBnftAddItmMdfrCdgDsply());
		}
		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmMdfrCdgSys() != null) {
			explanationofbenefitadditemmodifiercoding.setSystem(e.getExplntnOfBnftAddItmMdfrCdgSys());
		}
		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmMdfrCdgUsrSltd() != null) {
			explanationofbenefitadditemmodifiercoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftAddItmMdfrCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmMdfrCdgVrsn() != null) {
			explanationofbenefitadditemmodifiercoding.setVersion(e.getExplntnOfBnftAddItmMdfrCdgVrsn());
		}
		/******************** ExplntnOfBnft_AddItm_Mdfr_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmMdfrTxt() != null) {
			explanationofbenefitadditemmodifier.setText(e.getExplntnOfBnftAddItmMdfrTxt());
		}
		/******************** explanationofbenefitadditemnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemnet =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefitadditem.setNet(explanationofbenefitadditemnet);

		/******************** ExplntnOfBnft_AddItm_Net_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAddItmNetCrncy() != null) {
			explanationofbenefitadditemnet.setCurrency(e.getExplntnOfBnftAddItmNetCrncy());
		}
		/******************** ExplntnOfBnft_AddItm_Net_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmNetVl() != null) {
			explanationofbenefitadditemnet.setValue(Double.parseDouble((e.getExplntnOfBnftAddItmNetVl())));
		}
		/******************** ExplntnOfBnft_AddItm_NtNmbr ********************************************************************************/
		if(e.getExplntnOfBnftAddItmNtNmbr() != null) {
			explanationofbenefitadditem.addNoteNumber(Integer.parseInt(e.getExplntnOfBnftAddItmNtNmbr()));
		}
		/******************** explanationofbenefitadditemproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemproductorservice =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitadditem.setProductOrService(explanationofbenefitadditemproductorservice);

		/******************** explanationofbenefitadditemproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemproductorservicecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitadditemproductorservice.addCoding(explanationofbenefitadditemproductorservicecoding);

		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrdctOrSrvCdgCd() != null) {
			explanationofbenefitadditemproductorservicecoding.setCode(e.getExplntnOfBnftAddItmPrdctOrSrvCdgCd());
		}
		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrdctOrSrvCdgDsply() != null) {
			explanationofbenefitadditemproductorservicecoding.setDisplay(e.getExplntnOfBnftAddItmPrdctOrSrvCdgDsply());
		}
		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrdctOrSrvCdgSys() != null) {
			explanationofbenefitadditemproductorservicecoding.setSystem(e.getExplntnOfBnftAddItmPrdctOrSrvCdgSys());
		}
		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrdctOrSrvCdgUsrSltd() != null) {
			explanationofbenefitadditemproductorservicecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftAddItmPrdctOrSrvCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrdctOrSrvCdgVrsn() != null) {
			explanationofbenefitadditemproductorservicecoding.setVersion(e.getExplntnOfBnftAddItmPrdctOrSrvCdgVrsn());
		}
		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrdctOrSrvTxt() != null) {
			explanationofbenefitadditemproductorservice.setText(e.getExplntnOfBnftAddItmPrdctOrSrvTxt());
		}
		/******************** explanationofbenefitadditemprogramcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemprogramcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitadditem.addProgramCode(explanationofbenefitadditemprogramcode);

		/******************** explanationofbenefitadditemprogramcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemprogramcodecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitadditemprogramcode.addCoding(explanationofbenefitadditemprogramcodecoding);

		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrgrmCdCdgCd() != null) {
			explanationofbenefitadditemprogramcodecoding.setCode(e.getExplntnOfBnftAddItmPrgrmCdCdgCd());
		}
		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrgrmCdCdgDsply() != null) {
			explanationofbenefitadditemprogramcodecoding.setDisplay(e.getExplntnOfBnftAddItmPrgrmCdCdgDsply());
		}
		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrgrmCdCdgSys() != null) {
			explanationofbenefitadditemprogramcodecoding.setSystem(e.getExplntnOfBnftAddItmPrgrmCdCdgSys());
		}
		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrgrmCdCdgUsrSltd() != null) {
			explanationofbenefitadditemprogramcodecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftAddItmPrgrmCdCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrgrmCdCdgVrsn() != null) {
			explanationofbenefitadditemprogramcodecoding.setVersion(e.getExplntnOfBnftAddItmPrgrmCdCdgVrsn());
		}
		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmPrgrmCdTxt() != null) {
			explanationofbenefitadditemprogramcode.setText(e.getExplntnOfBnftAddItmPrgrmCdTxt());
		}
		/******************** ExplntnOfBnft_AddItm_Provider ********************************************************************************/
		if(e.getExplntnOfBnftAddItmProvider() != null) {
			explanationofbenefitadditem.addProvider( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftAddItmProvider()));
		}
		/******************** explanationofbenefitadditemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefitadditemquantity =  new org.hl7.fhir.r4.model.Quantity();
		explanationofbenefitadditem.setQuantity(explanationofbenefitadditemquantity);

		/******************** ExplntnOfBnft_AddItm_Qnty_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmQntyCd() != null) {
			explanationofbenefitadditemquantity.setCode(e.getExplntnOfBnftAddItmQntyCd());
		}
		/******************** explanationofbenefitadditemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory explanationofbenefitadditemquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		explanationofbenefitadditemquantity.setComparator(explanationofbenefitadditemquantitycomparator.fromCode(e.getExplntnOfBnftAddItmQntyCmprtr()));

		/******************** ExplntnOfBnft_AddItm_Qnty_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmQntySys() != null) {
			explanationofbenefitadditemquantity.setSystem(e.getExplntnOfBnftAddItmQntySys());
		}
		/******************** ExplntnOfBnft_AddItm_Qnty_Unt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmQntyUnt() != null) {
			explanationofbenefitadditemquantity.setUnit(e.getExplntnOfBnftAddItmQntyUnt());
		}
		/******************** ExplntnOfBnft_AddItm_Qnty_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmQntyVl() != null) {
			explanationofbenefitadditemquantity.setValue(Double.parseDouble((e.getExplntnOfBnftAddItmQntyVl())));
		}
		/******************** ExplntnOfBnft_AddItm_SrvdDtTyp ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSrvdDtTyp() != null) {
			explanationofbenefitadditem.setServiced( new org.hl7.fhir.r4.model.DateType(e.getExplntnOfBnftAddItmSrvdDtTyp()));
		}
		/******************** explanationofbenefitadditemservicedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitadditemservicedperiod =  new org.hl7.fhir.r4.model.Period();
		explanationofbenefitadditem.setServiced(explanationofbenefitadditemservicedperiod);

		/******************** ExplntnOfBnft_AddItm_SrvdPrd_End ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSrvdPrdEnd() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_AddItm_SrvdPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_AddItm_SrvdPrd_Enddate = ExplntnOfBnft_AddItm_SrvdPrd_Endsdf.parse(e.getExplntnOfBnftAddItmSrvdPrdEnd());
			explanationofbenefitadditemservicedperiod.setEnd(ExplntnOfBnft_AddItm_SrvdPrd_Enddate);
		}
		/******************** ExplntnOfBnft_AddItm_SrvdPrd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSrvdPrdStrt() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_AddItm_SrvdPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_AddItm_SrvdPrd_Strtdate = ExplntnOfBnft_AddItm_SrvdPrd_Strtsdf.parse(e.getExplntnOfBnftAddItmSrvdPrdStrt());
			explanationofbenefitadditemservicedperiod.setStart(ExplntnOfBnft_AddItm_SrvdPrd_Strtdate);
		}
		/******************** ExplntnOfBnft_AddItm_SubDtlSqnc ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSubDtlSqnc() != null) {
			explanationofbenefitadditem.addSubDetailSequence(Integer.parseInt(e.getExplntnOfBnftAddItmSubDtlSqnc()));
		}
		/******************** explanationofbenefitadditemsubsite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemsubsite =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitadditem.addSubSite(explanationofbenefitadditemsubsite);

		/******************** explanationofbenefitadditemsubsitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemsubsitecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitadditemsubsite.addCoding(explanationofbenefitadditemsubsitecoding);

		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSubSiteCdgCd() != null) {
			explanationofbenefitadditemsubsitecoding.setCode(e.getExplntnOfBnftAddItmSubSiteCdgCd());
		}
		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSubSiteCdgDsply() != null) {
			explanationofbenefitadditemsubsitecoding.setDisplay(e.getExplntnOfBnftAddItmSubSiteCdgDsply());
		}
		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSubSiteCdgSys() != null) {
			explanationofbenefitadditemsubsitecoding.setSystem(e.getExplntnOfBnftAddItmSubSiteCdgSys());
		}
		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSubSiteCdgUsrSltd() != null) {
			explanationofbenefitadditemsubsitecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftAddItmSubSiteCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSubSiteCdgVrsn() != null) {
			explanationofbenefitadditemsubsitecoding.setVersion(e.getExplntnOfBnftAddItmSubSiteCdgVrsn());
		}
		/******************** ExplntnOfBnft_AddItm_SubSite_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAddItmSubSiteTxt() != null) {
			explanationofbenefitadditemsubsite.setText(e.getExplntnOfBnftAddItmSubSiteTxt());
		}
		/******************** explanationofbenefitadditemunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemunitprice =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefitadditem.setUnitPrice(explanationofbenefitadditemunitprice);

		/******************** ExplntnOfBnft_AddItm_UntPrice_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAddItmUntPriceCrncy() != null) {
			explanationofbenefitadditemunitprice.setCurrency(e.getExplntnOfBnftAddItmUntPriceCrncy());
		}
		/******************** ExplntnOfBnft_AddItm_UntPrice_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAddItmUntPriceVl() != null) {
			explanationofbenefitadditemunitprice.setValue(Double.parseDouble((e.getExplntnOfBnftAddItmUntPriceVl())));
		}
		/******************** explanationofbenefitadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent explanationofbenefitadjudication =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent();
		explanationofbenefit.addAdjudication(explanationofbenefitadjudication);

		/******************** explanationofbenefitadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadjudicationamount =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefitadjudication.setAmount(explanationofbenefitadjudicationamount);

		/******************** ExplntnOfBnft_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnAmntCrncy() != null) {
			explanationofbenefitadjudicationamount.setCurrency(e.getExplntnOfBnftAdjdctnAmntCrncy());
		}
		/******************** ExplntnOfBnft_Adjdctn_Amnt_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnAmntVl() != null) {
			explanationofbenefitadjudicationamount.setValue(Double.parseDouble((e.getExplntnOfBnftAdjdctnAmntVl())));
		}
		/******************** explanationofbenefitadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadjudicationcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitadjudication.setCategory(explanationofbenefitadjudicationcategory);

		/******************** explanationofbenefitadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadjudicationcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitadjudicationcategory.addCoding(explanationofbenefitadjudicationcategorycoding);

		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnCtgryCdgCd() != null) {
			explanationofbenefitadjudicationcategorycoding.setCode(e.getExplntnOfBnftAdjdctnCtgryCdgCd());
		}
		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnCtgryCdgDsply() != null) {
			explanationofbenefitadjudicationcategorycoding.setDisplay(e.getExplntnOfBnftAdjdctnCtgryCdgDsply());
		}
		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnCtgryCdgSys() != null) {
			explanationofbenefitadjudicationcategorycoding.setSystem(e.getExplntnOfBnftAdjdctnCtgryCdgSys());
		}
		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnCtgryCdgUsrSltd() != null) {
			explanationofbenefitadjudicationcategorycoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftAdjdctnCtgryCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnCtgryCdgVrsn() != null) {
			explanationofbenefitadjudicationcategorycoding.setVersion(e.getExplntnOfBnftAdjdctnCtgryCdgVrsn());
		}
		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnCtgryTxt() != null) {
			explanationofbenefitadjudicationcategory.setText(e.getExplntnOfBnftAdjdctnCtgryTxt());
		}
		/******************** explanationofbenefitadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadjudicationreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitadjudication.setReason(explanationofbenefitadjudicationreason);

		/******************** explanationofbenefitadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadjudicationreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitadjudicationreason.addCoding(explanationofbenefitadjudicationreasoncoding);

		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnRsnCdgCd() != null) {
			explanationofbenefitadjudicationreasoncoding.setCode(e.getExplntnOfBnftAdjdctnRsnCdgCd());
		}
		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnRsnCdgDsply() != null) {
			explanationofbenefitadjudicationreasoncoding.setDisplay(e.getExplntnOfBnftAdjdctnRsnCdgDsply());
		}
		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnRsnCdgSys() != null) {
			explanationofbenefitadjudicationreasoncoding.setSystem(e.getExplntnOfBnftAdjdctnRsnCdgSys());
		}
		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnRsnCdgUsrSltd() != null) {
			explanationofbenefitadjudicationreasoncoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftAdjdctnRsnCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnRsnCdgVrsn() != null) {
			explanationofbenefitadjudicationreasoncoding.setVersion(e.getExplntnOfBnftAdjdctnRsnCdgVrsn());
		}
		/******************** ExplntnOfBnft_Adjdctn_Rsn_Txt ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnRsnTxt() != null) {
			explanationofbenefitadjudicationreason.setText(e.getExplntnOfBnftAdjdctnRsnTxt());
		}
		/******************** ExplntnOfBnft_Adjdctn_Vl ********************************************************************************/
		if(e.getExplntnOfBnftAdjdctnVl() != null) {
			explanationofbenefitadjudication.setValue(Double.parseDouble((e.getExplntnOfBnftAdjdctnVl())));
		}
		/******************** explanationofbenefitbenefitbalance ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitBalanceComponent explanationofbenefitbenefitbalance =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitBalanceComponent();
		explanationofbenefit.addBenefitBalance(explanationofbenefitbenefitbalance);

		/******************** explanationofbenefitbenefitbalancecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitbenefitbalancecategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitbenefitbalance.setCategory(explanationofbenefitbenefitbalancecategory);

		/******************** explanationofbenefitbenefitbalancecategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitbenefitbalancecategorycoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitbenefitbalancecategory.addCoding(explanationofbenefitbenefitbalancecategorycoding);

		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceCtgryCdgCd() != null) {
			explanationofbenefitbenefitbalancecategorycoding.setCode(e.getExplntnOfBnftBnftBalanceCtgryCdgCd());
		}
		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceCtgryCdgDsply() != null) {
			explanationofbenefitbenefitbalancecategorycoding.setDisplay(e.getExplntnOfBnftBnftBalanceCtgryCdgDsply());
		}
		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceCtgryCdgSys() != null) {
			explanationofbenefitbenefitbalancecategorycoding.setSystem(e.getExplntnOfBnftBnftBalanceCtgryCdgSys());
		}
		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceCtgryCdgUsrSltd() != null) {
			explanationofbenefitbenefitbalancecategorycoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftBnftBalanceCtgryCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceCtgryCdgVrsn() != null) {
			explanationofbenefitbenefitbalancecategorycoding.setVersion(e.getExplntnOfBnftBnftBalanceCtgryCdgVrsn());
		}
		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceCtgryTxt() != null) {
			explanationofbenefitbenefitbalancecategory.setText(e.getExplntnOfBnftBnftBalanceCtgryTxt());
		}
		/******************** ExplntnOfBnft_BnftBalance_Dscrptn ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceDscrptn() != null) {
			explanationofbenefitbenefitbalance.setDescription(e.getExplntnOfBnftBnftBalanceDscrptn());
		}
		/******************** ExplntnOfBnft_BnftBalance_Excluded ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceExcluded() != null) {
			explanationofbenefitbenefitbalance.setExcluded(Boolean.parseBoolean(e.getExplntnOfBnftBnftBalanceExcluded()));
		}
		/******************** explanationofbenefitbenefitbalancefinancial ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitComponent explanationofbenefitbenefitbalancefinancial =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitComponent();
		explanationofbenefitbenefitbalance.addFinancial(explanationofbenefitbenefitbalancefinancial);

		/******************** explanationofbenefitbenefitbalancefinancialallowedmoney ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitbenefitbalancefinancialallowedmoney =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefitbenefitbalancefinancial.setAllowed(explanationofbenefitbenefitbalancefinancialallowedmoney);

		/******************** ExplntnOfBnft_BnftBalance_Financial_AllowedMoney_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialAllowedMoneyCrncy() != null) {
			explanationofbenefitbenefitbalancefinancialallowedmoney.setCurrency(e.getExplntnOfBnftBnftBalanceFinancialAllowedMoneyCrncy());
		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_AllowedMoney_Vl ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialAllowedMoneyVl() != null) {
			explanationofbenefitbenefitbalancefinancialallowedmoney.setValue(Double.parseDouble((e.getExplntnOfBnftBnftBalanceFinancialAllowedMoneyVl())));
		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_AllowedStrgTyp ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialAllowedStrgTyp() != null) {
			explanationofbenefitbenefitbalancefinancial.setAllowed( new org.hl7.fhir.r4.model.StringType(e.getExplntnOfBnftBnftBalanceFinancialAllowedStrgTyp()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_AllowedUnsignedIntTyp ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialAllowedUnsignedIntTyp() != null) {
			explanationofbenefitbenefitbalancefinancial.setAllowed( new org.hl7.fhir.r4.model.UnsignedIntType(e.getExplntnOfBnftBnftBalanceFinancialAllowedUnsignedIntTyp()));
		}
		/******************** explanationofbenefitbenefitbalancefinancialtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitbenefitbalancefinancialtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitbenefitbalancefinancial.setType(explanationofbenefitbenefitbalancefinancialtype);

		/******************** explanationofbenefitbenefitbalancefinancialtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitbenefitbalancefinancialtypecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitbenefitbalancefinancialtype.addCoding(explanationofbenefitbenefitbalancefinancialtypecoding);

		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialTypCdgCd() != null) {
			explanationofbenefitbenefitbalancefinancialtypecoding.setCode(e.getExplntnOfBnftBnftBalanceFinancialTypCdgCd());
		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialTypCdgDsply() != null) {
			explanationofbenefitbenefitbalancefinancialtypecoding.setDisplay(e.getExplntnOfBnftBnftBalanceFinancialTypCdgDsply());
		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialTypCdgSys() != null) {
			explanationofbenefitbenefitbalancefinancialtypecoding.setSystem(e.getExplntnOfBnftBnftBalanceFinancialTypCdgSys());
		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialTypCdgUsrSltd() != null) {
			explanationofbenefitbenefitbalancefinancialtypecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftBnftBalanceFinancialTypCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialTypCdgVrsn() != null) {
			explanationofbenefitbenefitbalancefinancialtypecoding.setVersion(e.getExplntnOfBnftBnftBalanceFinancialTypCdgVrsn());
		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialTypTxt() != null) {
			explanationofbenefitbenefitbalancefinancialtype.setText(e.getExplntnOfBnftBnftBalanceFinancialTypTxt());
		}
		/******************** explanationofbenefitbenefitbalancefinancialusedmoney ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitbenefitbalancefinancialusedmoney =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefitbenefitbalancefinancial.setUsed(explanationofbenefitbenefitbalancefinancialusedmoney);

		/******************** ExplntnOfBnft_BnftBalance_Financial_UsedMoney_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialUsedMoneyCrncy() != null) {
			explanationofbenefitbenefitbalancefinancialusedmoney.setCurrency(e.getExplntnOfBnftBnftBalanceFinancialUsedMoneyCrncy());
		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_UsedMoney_Vl ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialUsedMoneyVl() != null) {
			explanationofbenefitbenefitbalancefinancialusedmoney.setValue(Double.parseDouble((e.getExplntnOfBnftBnftBalanceFinancialUsedMoneyVl())));
		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_UsedUnsignedIntTyp ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceFinancialUsedUnsignedIntTyp() != null) {
			explanationofbenefitbenefitbalancefinancial.setUsed( new org.hl7.fhir.r4.model.UnsignedIntType(e.getExplntnOfBnftBnftBalanceFinancialUsedUnsignedIntTyp()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Nm ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceNm() != null) {
			explanationofbenefitbenefitbalance.setName(e.getExplntnOfBnftBnftBalanceNm());
		}
		/******************** explanationofbenefitbenefitbalancenetwork ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitbenefitbalancenetwork =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitbenefitbalance.setNetwork(explanationofbenefitbenefitbalancenetwork);

		/******************** explanationofbenefitbenefitbalancenetworkcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitbenefitbalancenetworkcoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitbenefitbalancenetwork.addCoding(explanationofbenefitbenefitbalancenetworkcoding);

		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceNetworkCdgCd() != null) {
			explanationofbenefitbenefitbalancenetworkcoding.setCode(e.getExplntnOfBnftBnftBalanceNetworkCdgCd());
		}
		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceNetworkCdgDsply() != null) {
			explanationofbenefitbenefitbalancenetworkcoding.setDisplay(e.getExplntnOfBnftBnftBalanceNetworkCdgDsply());
		}
		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceNetworkCdgSys() != null) {
			explanationofbenefitbenefitbalancenetworkcoding.setSystem(e.getExplntnOfBnftBnftBalanceNetworkCdgSys());
		}
		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceNetworkCdgUsrSltd() != null) {
			explanationofbenefitbenefitbalancenetworkcoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftBnftBalanceNetworkCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceNetworkCdgVrsn() != null) {
			explanationofbenefitbenefitbalancenetworkcoding.setVersion(e.getExplntnOfBnftBnftBalanceNetworkCdgVrsn());
		}
		/******************** ExplntnOfBnft_BnftBalance_Network_Txt ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceNetworkTxt() != null) {
			explanationofbenefitbenefitbalancenetwork.setText(e.getExplntnOfBnftBnftBalanceNetworkTxt());
		}
		/******************** explanationofbenefitbenefitbalanceterm ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitbenefitbalanceterm =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitbenefitbalance.setTerm(explanationofbenefitbenefitbalanceterm);

		/******************** explanationofbenefitbenefitbalancetermcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitbenefitbalancetermcoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitbenefitbalanceterm.addCoding(explanationofbenefitbenefitbalancetermcoding);

		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceTrmCdgCd() != null) {
			explanationofbenefitbenefitbalancetermcoding.setCode(e.getExplntnOfBnftBnftBalanceTrmCdgCd());
		}
		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceTrmCdgDsply() != null) {
			explanationofbenefitbenefitbalancetermcoding.setDisplay(e.getExplntnOfBnftBnftBalanceTrmCdgDsply());
		}
		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceTrmCdgSys() != null) {
			explanationofbenefitbenefitbalancetermcoding.setSystem(e.getExplntnOfBnftBnftBalanceTrmCdgSys());
		}
		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceTrmCdgUsrSltd() != null) {
			explanationofbenefitbenefitbalancetermcoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftBnftBalanceTrmCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceTrmCdgVrsn() != null) {
			explanationofbenefitbenefitbalancetermcoding.setVersion(e.getExplntnOfBnftBnftBalanceTrmCdgVrsn());
		}
		/******************** ExplntnOfBnft_BnftBalance_Trm_Txt ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceTrmTxt() != null) {
			explanationofbenefitbenefitbalanceterm.setText(e.getExplntnOfBnftBnftBalanceTrmTxt());
		}
		/******************** explanationofbenefitbenefitbalanceunit ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitbenefitbalanceunit =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitbenefitbalance.setUnit(explanationofbenefitbenefitbalanceunit);

		/******************** explanationofbenefitbenefitbalanceunitcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitbenefitbalanceunitcoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitbenefitbalanceunit.addCoding(explanationofbenefitbenefitbalanceunitcoding);

		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceUntCdgCd() != null) {
			explanationofbenefitbenefitbalanceunitcoding.setCode(e.getExplntnOfBnftBnftBalanceUntCdgCd());
		}
		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceUntCdgDsply() != null) {
			explanationofbenefitbenefitbalanceunitcoding.setDisplay(e.getExplntnOfBnftBnftBalanceUntCdgDsply());
		}
		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceUntCdgSys() != null) {
			explanationofbenefitbenefitbalanceunitcoding.setSystem(e.getExplntnOfBnftBnftBalanceUntCdgSys());
		}
		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceUntCdgUsrSltd() != null) {
			explanationofbenefitbenefitbalanceunitcoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftBnftBalanceUntCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceUntCdgVrsn() != null) {
			explanationofbenefitbenefitbalanceunitcoding.setVersion(e.getExplntnOfBnftBnftBalanceUntCdgVrsn());
		}
		/******************** ExplntnOfBnft_BnftBalance_Unt_Txt ********************************************************************************/
		if(e.getExplntnOfBnftBnftBalanceUntTxt() != null) {
			explanationofbenefitbenefitbalanceunit.setText(e.getExplntnOfBnftBnftBalanceUntTxt());
		}
		/******************** explanationofbenefitbenefitperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitbenefitperiod =  new org.hl7.fhir.r4.model.Period();
		explanationofbenefit.setBenefitPeriod(explanationofbenefitbenefitperiod);

		/******************** ExplntnOfBnft_BnftPrd_End ********************************************************************************/
		if(e.getExplntnOfBnftBnftPrdEnd() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_BnftPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_BnftPrd_Enddate = ExplntnOfBnft_BnftPrd_Endsdf.parse(e.getExplntnOfBnftBnftPrdEnd());
			explanationofbenefitbenefitperiod.setEnd(ExplntnOfBnft_BnftPrd_Enddate);
		}
		/******************** ExplntnOfBnft_BnftPrd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftBnftPrdStrt() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_BnftPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_BnftPrd_Strtdate = ExplntnOfBnft_BnftPrd_Strtsdf.parse(e.getExplntnOfBnftBnftPrdStrt());
			explanationofbenefitbenefitperiod.setStart(ExplntnOfBnft_BnftPrd_Strtdate);
		}
		/******************** explanationofbenefitbillableperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitbillableperiod =  new org.hl7.fhir.r4.model.Period();
		explanationofbenefit.setBillablePeriod(explanationofbenefitbillableperiod);

		/******************** ExplntnOfBnft_BillablePrd_End ********************************************************************************/
		if(e.getExplntnOfBnftBillablePrdEnd() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_BillablePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_BillablePrd_Enddate = ExplntnOfBnft_BillablePrd_Endsdf.parse(e.getExplntnOfBnftBillablePrdEnd());
			explanationofbenefitbillableperiod.setEnd(ExplntnOfBnft_BillablePrd_Enddate);
		}
		/******************** ExplntnOfBnft_BillablePrd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftBillablePrdStrt() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_BillablePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_BillablePrd_Strtdate = ExplntnOfBnft_BillablePrd_Strtsdf.parse(e.getExplntnOfBnftBillablePrdStrt());
			explanationofbenefitbillableperiod.setStart(ExplntnOfBnft_BillablePrd_Strtdate);
		}
		/******************** explanationofbenefitcareteam ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.CareTeamComponent explanationofbenefitcareteam =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.CareTeamComponent();
		explanationofbenefit.addCareTeam(explanationofbenefitcareteam);

		/******************** ExplntnOfBnft_CareTeam_Provider ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamProvider() != null) {
			explanationofbenefitcareteam.setProvider( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftCareTeamProvider()));
		}
		/******************** explanationofbenefitcareteamqualification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitcareteamqualification =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitcareteam.setQualification(explanationofbenefitcareteamqualification);

		/******************** explanationofbenefitcareteamqualificationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitcareteamqualificationcoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitcareteamqualification.addCoding(explanationofbenefitcareteamqualificationcoding);

		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamQualificationCdgCd() != null) {
			explanationofbenefitcareteamqualificationcoding.setCode(e.getExplntnOfBnftCareTeamQualificationCdgCd());
		}
		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamQualificationCdgDsply() != null) {
			explanationofbenefitcareteamqualificationcoding.setDisplay(e.getExplntnOfBnftCareTeamQualificationCdgDsply());
		}
		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamQualificationCdgSys() != null) {
			explanationofbenefitcareteamqualificationcoding.setSystem(e.getExplntnOfBnftCareTeamQualificationCdgSys());
		}
		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamQualificationCdgUsrSltd() != null) {
			explanationofbenefitcareteamqualificationcoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftCareTeamQualificationCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamQualificationCdgVrsn() != null) {
			explanationofbenefitcareteamqualificationcoding.setVersion(e.getExplntnOfBnftCareTeamQualificationCdgVrsn());
		}
		/******************** ExplntnOfBnft_CareTeam_Qualification_Txt ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamQualificationTxt() != null) {
			explanationofbenefitcareteamqualification.setText(e.getExplntnOfBnftCareTeamQualificationTxt());
		}
		/******************** ExplntnOfBnft_CareTeam_Responsible ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamResponsible() != null) {
			explanationofbenefitcareteam.setResponsible(Boolean.parseBoolean(e.getExplntnOfBnftCareTeamResponsible()));
		}
		/******************** explanationofbenefitcareteamrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitcareteamrole =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitcareteam.setRole(explanationofbenefitcareteamrole);

		/******************** explanationofbenefitcareteamrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitcareteamrolecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitcareteamrole.addCoding(explanationofbenefitcareteamrolecoding);

		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamRoleCdgCd() != null) {
			explanationofbenefitcareteamrolecoding.setCode(e.getExplntnOfBnftCareTeamRoleCdgCd());
		}
		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamRoleCdgDsply() != null) {
			explanationofbenefitcareteamrolecoding.setDisplay(e.getExplntnOfBnftCareTeamRoleCdgDsply());
		}
		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamRoleCdgSys() != null) {
			explanationofbenefitcareteamrolecoding.setSystem(e.getExplntnOfBnftCareTeamRoleCdgSys());
		}
		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamRoleCdgUsrSltd() != null) {
			explanationofbenefitcareteamrolecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftCareTeamRoleCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamRoleCdgVrsn() != null) {
			explanationofbenefitcareteamrolecoding.setVersion(e.getExplntnOfBnftCareTeamRoleCdgVrsn());
		}
		/******************** ExplntnOfBnft_CareTeam_Role_Txt ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamRoleTxt() != null) {
			explanationofbenefitcareteamrole.setText(e.getExplntnOfBnftCareTeamRoleTxt());
		}
		/******************** ExplntnOfBnft_CareTeam_Sqnc ********************************************************************************/
		if(e.getExplntnOfBnftCareTeamSqnc() != null) {
			explanationofbenefitcareteam.setSequence(Integer.parseInt(e.getExplntnOfBnftCareTeamSqnc()));
		}
		/******************** ExplntnOfBnft_Clm ********************************************************************************/
		if(e.getExplntnOfBnftClm() != null) {
			explanationofbenefit.setClaim( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftClm()));
		}
		/******************** ExplntnOfBnft_ClmRsps ********************************************************************************/
		if(e.getExplntnOfBnftClmRsps() != null) {
			explanationofbenefit.setClaimResponse( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftClmRsps()));
		}
		/******************** ExplntnOfBnft_Created ********************************************************************************/
		if(e.getExplntnOfBnftCreated() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_Createdsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_Createddate = ExplntnOfBnft_Createdsdf.parse(e.getExplntnOfBnftCreated());
			explanationofbenefit.setCreated(ExplntnOfBnft_Createddate);
		}
		/******************** explanationofbenefitdiagnosis ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.DiagnosisComponent explanationofbenefitdiagnosis =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.DiagnosisComponent();
		explanationofbenefit.addDiagnosis(explanationofbenefitdiagnosis);

		/******************** explanationofbenefitdiagnosisdiagnosiscodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitdiagnosisdiagnosiscodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitdiagnosis.setDiagnosis(explanationofbenefitdiagnosisdiagnosiscodeableconcept);

		/******************** explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitdiagnosisdiagnosiscodeableconcept.addCoding(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding);

		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgCd() != null) {
			explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.setCode(e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgCd());
		}
		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgDsply() != null) {
			explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.setDisplay(e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgDsply());
		}
		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgSys() != null) {
			explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.setSystem(e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgSys());
		}
		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgUsrSltd() != null) {
			explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgVrsn() != null) {
			explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.setVersion(e.getExplntnOfBnftDgnsisDgnsisCdbleCncptCdgVrsn());
		}
		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Txt ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisDgnsisCdbleCncptTxt() != null) {
			explanationofbenefitdiagnosisdiagnosiscodeableconcept.setText(e.getExplntnOfBnftDgnsisDgnsisCdbleCncptTxt());
		}
		/******************** ExplntnOfBnft_Dgnsis_DgnsisRfrnc ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisDgnsisRfrnc() != null) {
			explanationofbenefitdiagnosis.setDiagnosis( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftDgnsisDgnsisRfrnc()));
		}
		/******************** explanationofbenefitdiagnosisonadmission ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitdiagnosisonadmission =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitdiagnosis.setOnAdmission(explanationofbenefitdiagnosisonadmission);

		/******************** explanationofbenefitdiagnosisonadmissioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitdiagnosisonadmissioncoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitdiagnosisonadmission.addCoding(explanationofbenefitdiagnosisonadmissioncoding);

		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisOnAdmissionCdgCd() != null) {
			explanationofbenefitdiagnosisonadmissioncoding.setCode(e.getExplntnOfBnftDgnsisOnAdmissionCdgCd());
		}
		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisOnAdmissionCdgDsply() != null) {
			explanationofbenefitdiagnosisonadmissioncoding.setDisplay(e.getExplntnOfBnftDgnsisOnAdmissionCdgDsply());
		}
		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisOnAdmissionCdgSys() != null) {
			explanationofbenefitdiagnosisonadmissioncoding.setSystem(e.getExplntnOfBnftDgnsisOnAdmissionCdgSys());
		}
		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisOnAdmissionCdgUsrSltd() != null) {
			explanationofbenefitdiagnosisonadmissioncoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftDgnsisOnAdmissionCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisOnAdmissionCdgVrsn() != null) {
			explanationofbenefitdiagnosisonadmissioncoding.setVersion(e.getExplntnOfBnftDgnsisOnAdmissionCdgVrsn());
		}
		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Txt ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisOnAdmissionTxt() != null) {
			explanationofbenefitdiagnosisonadmission.setText(e.getExplntnOfBnftDgnsisOnAdmissionTxt());
		}
		/******************** explanationofbenefitdiagnosispackagecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitdiagnosispackagecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitdiagnosis.setPackageCode(explanationofbenefitdiagnosispackagecode);

		/******************** explanationofbenefitdiagnosispackagecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitdiagnosispackagecodecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitdiagnosispackagecode.addCoding(explanationofbenefitdiagnosispackagecodecoding);

		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisPckgCdCdgCd() != null) {
			explanationofbenefitdiagnosispackagecodecoding.setCode(e.getExplntnOfBnftDgnsisPckgCdCdgCd());
		}
		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisPckgCdCdgDsply() != null) {
			explanationofbenefitdiagnosispackagecodecoding.setDisplay(e.getExplntnOfBnftDgnsisPckgCdCdgDsply());
		}
		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisPckgCdCdgSys() != null) {
			explanationofbenefitdiagnosispackagecodecoding.setSystem(e.getExplntnOfBnftDgnsisPckgCdCdgSys());
		}
		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisPckgCdCdgUsrSltd() != null) {
			explanationofbenefitdiagnosispackagecodecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftDgnsisPckgCdCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisPckgCdCdgVrsn() != null) {
			explanationofbenefitdiagnosispackagecodecoding.setVersion(e.getExplntnOfBnftDgnsisPckgCdCdgVrsn());
		}
		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Txt ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisPckgCdTxt() != null) {
			explanationofbenefitdiagnosispackagecode.setText(e.getExplntnOfBnftDgnsisPckgCdTxt());
		}
		/******************** ExplntnOfBnft_Dgnsis_Sqnc ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisSqnc() != null) {
			explanationofbenefitdiagnosis.setSequence(Integer.parseInt(e.getExplntnOfBnftDgnsisSqnc()));
		}
		/******************** explanationofbenefitdiagnosistype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitdiagnosistype =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitdiagnosis.addType(explanationofbenefitdiagnosistype);

		/******************** explanationofbenefitdiagnosistypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitdiagnosistypecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitdiagnosistype.addCoding(explanationofbenefitdiagnosistypecoding);

		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisTypCdgCd() != null) {
			explanationofbenefitdiagnosistypecoding.setCode(e.getExplntnOfBnftDgnsisTypCdgCd());
		}
		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisTypCdgDsply() != null) {
			explanationofbenefitdiagnosistypecoding.setDisplay(e.getExplntnOfBnftDgnsisTypCdgDsply());
		}
		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisTypCdgSys() != null) {
			explanationofbenefitdiagnosistypecoding.setSystem(e.getExplntnOfBnftDgnsisTypCdgSys());
		}
		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisTypCdgUsrSltd() != null) {
			explanationofbenefitdiagnosistypecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftDgnsisTypCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisTypCdgVrsn() != null) {
			explanationofbenefitdiagnosistypecoding.setVersion(e.getExplntnOfBnftDgnsisTypCdgVrsn());
		}
		/******************** ExplntnOfBnft_Dgnsis_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftDgnsisTypTxt() != null) {
			explanationofbenefitdiagnosistype.setText(e.getExplntnOfBnftDgnsisTypTxt());
		}
		/******************** ExplntnOfBnft_Disposition ********************************************************************************/
		if(e.getExplntnOfBnftDisposition() != null) {
			explanationofbenefit.setDisposition(e.getExplntnOfBnftDisposition());
		}
		/******************** ExplntnOfBnft_Enterer ********************************************************************************/
		if(e.getExplntnOfBnftEnterer() != null) {
			explanationofbenefit.setEnterer( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftEnterer()));
		}
		/******************** ExplntnOfBnft_Facility ********************************************************************************/
		if(e.getExplntnOfBnftFacility() != null) {
			explanationofbenefit.setFacility( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftFacility()));
		}
		/******************** explanationofbenefitform ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment explanationofbenefitform =  new org.hl7.fhir.r4.model.Attachment();
		explanationofbenefit.setForm(explanationofbenefitform);

		/******************** ExplntnOfBnft_Frm_CntntTyp ********************************************************************************/
		if(e.getExplntnOfBnftFrmCntntTyp() != null) {
			explanationofbenefitform.setContentType(e.getExplntnOfBnftFrmCntntTyp());
		}
		/******************** ExplntnOfBnft_Frm_Creation ********************************************************************************/
		if(e.getExplntnOfBnftFrmCreation() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_Frm_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_Frm_Creationdate = ExplntnOfBnft_Frm_Creationsdf.parse(e.getExplntnOfBnftFrmCreation());
			explanationofbenefitform.setCreation(ExplntnOfBnft_Frm_Creationdate);
		}
		/******************** ExplntnOfBnft_Frm_Data ********************************************************************************/
		if(e.getExplntnOfBnftFrmData() != null) {
			explanationofbenefitform.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(e.getExplntnOfBnftFrmData()));
		}
		/******************** ExplntnOfBnft_Frm_Hash ********************************************************************************/
		if(e.getExplntnOfBnftFrmHash() != null) {
			explanationofbenefitform.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(e.getExplntnOfBnftFrmHash()));
		}
		/******************** ExplntnOfBnft_Frm_Lnguage ********************************************************************************/
		if(e.getExplntnOfBnftFrmLnguage() != null) {
			explanationofbenefitform.setLanguage(e.getExplntnOfBnftFrmLnguage());
		}
		/******************** ExplntnOfBnft_Frm_Sz ********************************************************************************/
		if(e.getExplntnOfBnftFrmSz() != null) {
			explanationofbenefitform.setSize(Integer.parseInt(e.getExplntnOfBnftFrmSz()));
		}
		/******************** ExplntnOfBnft_Frm_Ttl ********************************************************************************/
		if(e.getExplntnOfBnftFrmTtl() != null) {
			explanationofbenefitform.setTitle(e.getExplntnOfBnftFrmTtl());
		}
		/******************** ExplntnOfBnft_Frm_Url ********************************************************************************/
		if(e.getExplntnOfBnftFrmUrl() != null) {
			explanationofbenefitform.setUrl(e.getExplntnOfBnftFrmUrl());
		}
		/******************** explanationofbenefitformcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitformcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefit.setFormCode(explanationofbenefitformcode);

		/******************** explanationofbenefitformcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitformcodecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitformcode.addCoding(explanationofbenefitformcodecoding);

		/******************** ExplntnOfBnft_FrmCd_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftFrmCdCdgCd() != null) {
			explanationofbenefitformcodecoding.setCode(e.getExplntnOfBnftFrmCdCdgCd());
		}
		/******************** ExplntnOfBnft_FrmCd_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftFrmCdCdgDsply() != null) {
			explanationofbenefitformcodecoding.setDisplay(e.getExplntnOfBnftFrmCdCdgDsply());
		}
		/******************** ExplntnOfBnft_FrmCd_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftFrmCdCdgSys() != null) {
			explanationofbenefitformcodecoding.setSystem(e.getExplntnOfBnftFrmCdCdgSys());
		}
		/******************** ExplntnOfBnft_FrmCd_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftFrmCdCdgUsrSltd() != null) {
			explanationofbenefitformcodecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftFrmCdCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_FrmCd_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftFrmCdCdgVrsn() != null) {
			explanationofbenefitformcodecoding.setVersion(e.getExplntnOfBnftFrmCdCdgVrsn());
		}
		/******************** ExplntnOfBnft_FrmCd_Txt ********************************************************************************/
		if(e.getExplntnOfBnftFrmCdTxt() != null) {
			explanationofbenefitformcode.setText(e.getExplntnOfBnftFrmCdTxt());
		}
		/******************** explanationofbenefitfundsreserve ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitfundsreserve =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefit.setFundsReserve(explanationofbenefitfundsreserve);

		/******************** explanationofbenefitfundsreservecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitfundsreservecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitfundsreserve.addCoding(explanationofbenefitfundsreservecoding);

		/******************** ExplntnOfBnft_FundsReserve_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveCdgCd() != null) {
			explanationofbenefitfundsreservecoding.setCode(e.getExplntnOfBnftFundsReserveCdgCd());
		}
		/******************** ExplntnOfBnft_FundsReserve_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveCdgDsply() != null) {
			explanationofbenefitfundsreservecoding.setDisplay(e.getExplntnOfBnftFundsReserveCdgDsply());
		}
		/******************** ExplntnOfBnft_FundsReserve_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveCdgSys() != null) {
			explanationofbenefitfundsreservecoding.setSystem(e.getExplntnOfBnftFundsReserveCdgSys());
		}
		/******************** ExplntnOfBnft_FundsReserve_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveCdgUsrSltd() != null) {
			explanationofbenefitfundsreservecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftFundsReserveCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_FundsReserve_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveCdgVrsn() != null) {
			explanationofbenefitfundsreservecoding.setVersion(e.getExplntnOfBnftFundsReserveCdgVrsn());
		}
		/******************** ExplntnOfBnft_FundsReserve_Txt ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveTxt() != null) {
			explanationofbenefitfundsreserve.setText(e.getExplntnOfBnftFundsReserveTxt());
		}
		/******************** explanationofbenefitfundsreserverequested ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitfundsreserverequested =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefit.setFundsReserveRequested(explanationofbenefitfundsreserverequested);

		/******************** explanationofbenefitfundsreserverequestedcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitfundsreserverequestedcoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitfundsreserverequested.addCoding(explanationofbenefitfundsreserverequestedcoding);

		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveRqstedCdgCd() != null) {
			explanationofbenefitfundsreserverequestedcoding.setCode(e.getExplntnOfBnftFundsReserveRqstedCdgCd());
		}
		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveRqstedCdgDsply() != null) {
			explanationofbenefitfundsreserverequestedcoding.setDisplay(e.getExplntnOfBnftFundsReserveRqstedCdgDsply());
		}
		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveRqstedCdgSys() != null) {
			explanationofbenefitfundsreserverequestedcoding.setSystem(e.getExplntnOfBnftFundsReserveRqstedCdgSys());
		}
		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveRqstedCdgUsrSltd() != null) {
			explanationofbenefitfundsreserverequestedcoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftFundsReserveRqstedCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveRqstedCdgVrsn() != null) {
			explanationofbenefitfundsreserverequestedcoding.setVersion(e.getExplntnOfBnftFundsReserveRqstedCdgVrsn());
		}
		/******************** ExplntnOfBnft_FundsReserveRqsted_Txt ********************************************************************************/
		if(e.getExplntnOfBnftFundsReserveRqstedTxt() != null) {
			explanationofbenefitfundsreserverequested.setText(e.getExplntnOfBnftFundsReserveRqstedTxt());
		}
		/******************** explanationofbenefitidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier explanationofbenefitidentifier =  new org.hl7.fhir.r4.model.Identifier();
		explanationofbenefit.addIdentifier(explanationofbenefitidentifier);

		/******************** ExplntnOfBnft_Id_Assigner ********************************************************************************/
		if(e.getExplntnOfBnftIdAssigner() != null) {
			explanationofbenefitidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftIdAssigner()));
		}
		/******************** explanationofbenefitidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		explanationofbenefitidentifier.setPeriod(explanationofbenefitidentifierperiod);

		/******************** ExplntnOfBnft_Id_Prd_End ********************************************************************************/
		if(e.getExplntnOfBnftIdPrdEnd() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_Id_Prd_Enddate = ExplntnOfBnft_Id_Prd_Endsdf.parse(e.getExplntnOfBnftIdPrdEnd());
			explanationofbenefitidentifierperiod.setEnd(ExplntnOfBnft_Id_Prd_Enddate);
		}
		/******************** ExplntnOfBnft_Id_Prd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftIdPrdStrt() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_Id_Prd_Strtdate = ExplntnOfBnft_Id_Prd_Strtsdf.parse(e.getExplntnOfBnftIdPrdStrt());
			explanationofbenefitidentifierperiod.setStart(ExplntnOfBnft_Id_Prd_Strtdate);
		}
		/******************** ExplntnOfBnft_Id_Sys ********************************************************************************/
		if(e.getExplntnOfBnftIdSys() != null) {
			explanationofbenefitidentifier.setSystem(e.getExplntnOfBnftIdSys());
		}
		/******************** explanationofbenefitidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitidentifier.setType(explanationofbenefitidentifiertype);

		/******************** explanationofbenefitidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitidentifiertype.addCoding(explanationofbenefitidentifiertypecoding);

		/******************** ExplntnOfBnft_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftIdTypCdgCd() != null) {
			explanationofbenefitidentifiertypecoding.setCode(e.getExplntnOfBnftIdTypCdgCd());
		}
		/******************** ExplntnOfBnft_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftIdTypCdgDsply() != null) {
			explanationofbenefitidentifiertypecoding.setDisplay(e.getExplntnOfBnftIdTypCdgDsply());
		}
		/******************** ExplntnOfBnft_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftIdTypCdgSys() != null) {
			explanationofbenefitidentifiertypecoding.setSystem(e.getExplntnOfBnftIdTypCdgSys());
		}
		/******************** ExplntnOfBnft_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftIdTypCdgUsrSltd() != null) {
			explanationofbenefitidentifiertypecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftIdTypCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftIdTypCdgVrsn() != null) {
			explanationofbenefitidentifiertypecoding.setVersion(e.getExplntnOfBnftIdTypCdgVrsn());
		}
		/******************** ExplntnOfBnft_Id_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftIdTypTxt() != null) {
			explanationofbenefitidentifiertype.setText(e.getExplntnOfBnftIdTypTxt());
		}
		/******************** explanationofbenefitidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory explanationofbenefitidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		explanationofbenefitidentifier.setUse(explanationofbenefitidentifieruse.fromCode(e.getExplntnOfBnftIdUse()));

		/******************** ExplntnOfBnft_Id_Vl ********************************************************************************/
		if(e.getExplntnOfBnftIdVl() != null) {
			explanationofbenefitidentifier.setValue(e.getExplntnOfBnftIdVl());
		}
		/******************** explanationofbenefitinsurance ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.InsuranceComponent explanationofbenefitinsurance =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.InsuranceComponent();
		explanationofbenefit.addInsurance(explanationofbenefitinsurance);

		/******************** ExplntnOfBnft_Insrnc_Cvg ********************************************************************************/
		if(e.getExplntnOfBnftInsrncCvg() != null) {
			explanationofbenefitinsurance.setCoverage( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftInsrncCvg()));
		}
		/******************** ExplntnOfBnft_Insrnc_Focal ********************************************************************************/
		if(e.getExplntnOfBnftInsrncFocal() != null) {
			explanationofbenefitinsurance.setFocal(Boolean.parseBoolean(e.getExplntnOfBnftInsrncFocal()));
		}
		/******************** ExplntnOfBnft_Insrnc_PreAuthRef ********************************************************************************/
		if(e.getExplntnOfBnftInsrncPreAuthRef() != null) {
			explanationofbenefitinsurance.addPreAuthRef(e.getExplntnOfBnftInsrncPreAuthRef());
		}
		/******************** ExplntnOfBnft_Insurer ********************************************************************************/
		if(e.getExplntnOfBnftInsurer() != null) {
			explanationofbenefit.setInsurer( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftInsurer()));
		}
		/******************** explanationofbenefititem ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.ItemComponent explanationofbenefititem =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.ItemComponent();
		explanationofbenefit.addItem(explanationofbenefititem);

		/******************** explanationofbenefititemadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent explanationofbenefititemadjudication =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent();
		explanationofbenefititem.addAdjudication(explanationofbenefititemadjudication);

		/******************** explanationofbenefititemadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemadjudicationamount =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefititemadjudication.setAmount(explanationofbenefititemadjudicationamount);

		/******************** ExplntnOfBnft_Itm_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnAmntCrncy() != null) {
			explanationofbenefititemadjudicationamount.setCurrency(e.getExplntnOfBnftItmAdjdctnAmntCrncy());
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Amnt_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnAmntVl() != null) {
			explanationofbenefititemadjudicationamount.setValue(Double.parseDouble((e.getExplntnOfBnftItmAdjdctnAmntVl())));
		}
		/******************** explanationofbenefititemadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemadjudicationcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititemadjudication.setCategory(explanationofbenefititemadjudicationcategory);

		/******************** explanationofbenefititemadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemadjudicationcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemadjudicationcategory.addCoding(explanationofbenefititemadjudicationcategorycoding);

		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnCtgryCdgCd() != null) {
			explanationofbenefititemadjudicationcategorycoding.setCode(e.getExplntnOfBnftItmAdjdctnCtgryCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnCtgryCdgDsply() != null) {
			explanationofbenefititemadjudicationcategorycoding.setDisplay(e.getExplntnOfBnftItmAdjdctnCtgryCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnCtgryCdgSys() != null) {
			explanationofbenefititemadjudicationcategorycoding.setSystem(e.getExplntnOfBnftItmAdjdctnCtgryCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnCtgryCdgUsrSltd() != null) {
			explanationofbenefititemadjudicationcategorycoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmAdjdctnCtgryCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnCtgryCdgVrsn() != null) {
			explanationofbenefititemadjudicationcategorycoding.setVersion(e.getExplntnOfBnftItmAdjdctnCtgryCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnCtgryTxt() != null) {
			explanationofbenefititemadjudicationcategory.setText(e.getExplntnOfBnftItmAdjdctnCtgryTxt());
		}
		/******************** explanationofbenefititemadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemadjudicationreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititemadjudication.setReason(explanationofbenefititemadjudicationreason);

		/******************** explanationofbenefititemadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemadjudicationreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemadjudicationreason.addCoding(explanationofbenefititemadjudicationreasoncoding);

		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnRsnCdgCd() != null) {
			explanationofbenefititemadjudicationreasoncoding.setCode(e.getExplntnOfBnftItmAdjdctnRsnCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnRsnCdgDsply() != null) {
			explanationofbenefititemadjudicationreasoncoding.setDisplay(e.getExplntnOfBnftItmAdjdctnRsnCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnRsnCdgSys() != null) {
			explanationofbenefititemadjudicationreasoncoding.setSystem(e.getExplntnOfBnftItmAdjdctnRsnCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnRsnCdgUsrSltd() != null) {
			explanationofbenefititemadjudicationreasoncoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmAdjdctnRsnCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnRsnCdgVrsn() != null) {
			explanationofbenefititemadjudicationreasoncoding.setVersion(e.getExplntnOfBnftItmAdjdctnRsnCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnRsnTxt() != null) {
			explanationofbenefititemadjudicationreason.setText(e.getExplntnOfBnftItmAdjdctnRsnTxt());
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmAdjdctnVl() != null) {
			explanationofbenefititemadjudication.setValue(Double.parseDouble((e.getExplntnOfBnftItmAdjdctnVl())));
		}
		/******************** explanationofbenefititembodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititembodysite =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititem.setBodySite(explanationofbenefititembodysite);

		/******************** explanationofbenefititembodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititembodysitecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititembodysite.addCoding(explanationofbenefititembodysitecoding);

		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmBodySiteCdgCd() != null) {
			explanationofbenefititembodysitecoding.setCode(e.getExplntnOfBnftItmBodySiteCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmBodySiteCdgDsply() != null) {
			explanationofbenefititembodysitecoding.setDisplay(e.getExplntnOfBnftItmBodySiteCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmBodySiteCdgSys() != null) {
			explanationofbenefititembodysitecoding.setSystem(e.getExplntnOfBnftItmBodySiteCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmBodySiteCdgUsrSltd() != null) {
			explanationofbenefititembodysitecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmBodySiteCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmBodySiteCdgVrsn() != null) {
			explanationofbenefititembodysitecoding.setVersion(e.getExplntnOfBnftItmBodySiteCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_BodySite_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmBodySiteTxt() != null) {
			explanationofbenefititembodysite.setText(e.getExplntnOfBnftItmBodySiteTxt());
		}
		/******************** ExplntnOfBnft_Itm_CareTeamSqnc ********************************************************************************/
		if(e.getExplntnOfBnftItmCareTeamSqnc() != null) {
			explanationofbenefititem.addCareTeamSequence(Integer.parseInt(e.getExplntnOfBnftItmCareTeamSqnc()));
		}
		/******************** explanationofbenefititemcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititem.setCategory(explanationofbenefititemcategory);

		/******************** explanationofbenefititemcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemcategory.addCoding(explanationofbenefititemcategorycoding);

		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmCtgryCdgCd() != null) {
			explanationofbenefititemcategorycoding.setCode(e.getExplntnOfBnftItmCtgryCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmCtgryCdgDsply() != null) {
			explanationofbenefititemcategorycoding.setDisplay(e.getExplntnOfBnftItmCtgryCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmCtgryCdgSys() != null) {
			explanationofbenefititemcategorycoding.setSystem(e.getExplntnOfBnftItmCtgryCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmCtgryCdgUsrSltd() != null) {
			explanationofbenefititemcategorycoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmCtgryCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmCtgryCdgVrsn() != null) {
			explanationofbenefititemcategorycoding.setVersion(e.getExplntnOfBnftItmCtgryCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmCtgryTxt() != null) {
			explanationofbenefititemcategory.setText(e.getExplntnOfBnftItmCtgryTxt());
		}
		/******************** explanationofbenefititemdetail ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.DetailComponent explanationofbenefititemdetail =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.DetailComponent();
		explanationofbenefititem.addDetail(explanationofbenefititemdetail);

		/******************** explanationofbenefititemdetailadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent explanationofbenefititemdetailadjudication =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent();
		explanationofbenefititemdetail.addAdjudication(explanationofbenefititemdetailadjudication);

		/******************** explanationofbenefititemdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemdetailadjudicationamount =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefititemdetailadjudication.setAmount(explanationofbenefititemdetailadjudicationamount);

		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnAmntCrncy() != null) {
			explanationofbenefititemdetailadjudicationamount.setCurrency(e.getExplntnOfBnftItmDtlAdjdctnAmntCrncy());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnAmntVl() != null) {
			explanationofbenefititemdetailadjudicationamount.setValue(Double.parseDouble((e.getExplntnOfBnftItmDtlAdjdctnAmntVl())));
		}
		/******************** explanationofbenefititemdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailadjudicationcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititemdetailadjudication.setCategory(explanationofbenefititemdetailadjudicationcategory);

		/******************** explanationofbenefititemdetailadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailadjudicationcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemdetailadjudicationcategory.addCoding(explanationofbenefititemdetailadjudicationcategorycoding);

		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgCd() != null) {
			explanationofbenefititemdetailadjudicationcategorycoding.setCode(e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgDsply() != null) {
			explanationofbenefititemdetailadjudicationcategorycoding.setDisplay(e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgSys() != null) {
			explanationofbenefititemdetailadjudicationcategorycoding.setSystem(e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgUsrSltd() != null) {
			explanationofbenefititemdetailadjudicationcategorycoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgVrsn() != null) {
			explanationofbenefititemdetailadjudicationcategorycoding.setVersion(e.getExplntnOfBnftItmDtlAdjdctnCtgryCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnCtgryTxt() != null) {
			explanationofbenefititemdetailadjudicationcategory.setText(e.getExplntnOfBnftItmDtlAdjdctnCtgryTxt());
		}
		/******************** explanationofbenefititemdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailadjudicationreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititemdetailadjudication.setReason(explanationofbenefititemdetailadjudicationreason);

		/******************** explanationofbenefititemdetailadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailadjudicationreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemdetailadjudicationreason.addCoding(explanationofbenefititemdetailadjudicationreasoncoding);

		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnRsnCdgCd() != null) {
			explanationofbenefititemdetailadjudicationreasoncoding.setCode(e.getExplntnOfBnftItmDtlAdjdctnRsnCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnRsnCdgDsply() != null) {
			explanationofbenefititemdetailadjudicationreasoncoding.setDisplay(e.getExplntnOfBnftItmDtlAdjdctnRsnCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnRsnCdgSys() != null) {
			explanationofbenefititemdetailadjudicationreasoncoding.setSystem(e.getExplntnOfBnftItmDtlAdjdctnRsnCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnRsnCdgUsrSltd() != null) {
			explanationofbenefititemdetailadjudicationreasoncoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmDtlAdjdctnRsnCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnRsnCdgVrsn() != null) {
			explanationofbenefititemdetailadjudicationreasoncoding.setVersion(e.getExplntnOfBnftItmDtlAdjdctnRsnCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnRsnTxt() != null) {
			explanationofbenefititemdetailadjudicationreason.setText(e.getExplntnOfBnftItmDtlAdjdctnRsnTxt());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlAdjdctnVl() != null) {
			explanationofbenefititemdetailadjudication.setValue(Double.parseDouble((e.getExplntnOfBnftItmDtlAdjdctnVl())));
		}
		/******************** explanationofbenefititemdetailcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititemdetail.setCategory(explanationofbenefititemdetailcategory);

		/******************** explanationofbenefititemdetailcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemdetailcategory.addCoding(explanationofbenefititemdetailcategorycoding);

		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlCtgryCdgCd() != null) {
			explanationofbenefititemdetailcategorycoding.setCode(e.getExplntnOfBnftItmDtlCtgryCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlCtgryCdgDsply() != null) {
			explanationofbenefititemdetailcategorycoding.setDisplay(e.getExplntnOfBnftItmDtlCtgryCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlCtgryCdgSys() != null) {
			explanationofbenefititemdetailcategorycoding.setSystem(e.getExplntnOfBnftItmDtlCtgryCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlCtgryCdgUsrSltd() != null) {
			explanationofbenefititemdetailcategorycoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmDtlCtgryCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlCtgryCdgVrsn() != null) {
			explanationofbenefititemdetailcategorycoding.setVersion(e.getExplntnOfBnftItmDtlCtgryCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlCtgryTxt() != null) {
			explanationofbenefititemdetailcategory.setText(e.getExplntnOfBnftItmDtlCtgryTxt());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Factor ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlFactor() != null) {
			explanationofbenefititemdetail.setFactor(new java.math.BigDecimal((e.getExplntnOfBnftItmDtlFactor())));
		}
		/******************** explanationofbenefititemdetailmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailmodifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititemdetail.addModifier(explanationofbenefititemdetailmodifier);

		/******************** explanationofbenefititemdetailmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailmodifiercoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemdetailmodifier.addCoding(explanationofbenefititemdetailmodifiercoding);

		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlMdfrCdgCd() != null) {
			explanationofbenefititemdetailmodifiercoding.setCode(e.getExplntnOfBnftItmDtlMdfrCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlMdfrCdgDsply() != null) {
			explanationofbenefititemdetailmodifiercoding.setDisplay(e.getExplntnOfBnftItmDtlMdfrCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlMdfrCdgSys() != null) {
			explanationofbenefititemdetailmodifiercoding.setSystem(e.getExplntnOfBnftItmDtlMdfrCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlMdfrCdgUsrSltd() != null) {
			explanationofbenefititemdetailmodifiercoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmDtlMdfrCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlMdfrCdgVrsn() != null) {
			explanationofbenefititemdetailmodifiercoding.setVersion(e.getExplntnOfBnftItmDtlMdfrCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlMdfrTxt() != null) {
			explanationofbenefititemdetailmodifier.setText(e.getExplntnOfBnftItmDtlMdfrTxt());
		}
		/******************** explanationofbenefititemdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemdetailnet =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefititemdetail.setNet(explanationofbenefititemdetailnet);

		/******************** ExplntnOfBnft_Itm_Dtl_Net_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlNetCrncy() != null) {
			explanationofbenefititemdetailnet.setCurrency(e.getExplntnOfBnftItmDtlNetCrncy());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Net_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlNetVl() != null) {
			explanationofbenefititemdetailnet.setValue(Double.parseDouble((e.getExplntnOfBnftItmDtlNetVl())));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_NtNmbr ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlNtNmbr() != null) {
			explanationofbenefititemdetail.addNoteNumber(Integer.parseInt(e.getExplntnOfBnftItmDtlNtNmbr()));
		}
		/******************** explanationofbenefititemdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailproductorservice =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititemdetail.setProductOrService(explanationofbenefititemdetailproductorservice);

		/******************** explanationofbenefititemdetailproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailproductorservicecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemdetailproductorservice.addCoding(explanationofbenefititemdetailproductorservicecoding);

		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrdctOrSrvCdgCd() != null) {
			explanationofbenefititemdetailproductorservicecoding.setCode(e.getExplntnOfBnftItmDtlPrdctOrSrvCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrdctOrSrvCdgDsply() != null) {
			explanationofbenefititemdetailproductorservicecoding.setDisplay(e.getExplntnOfBnftItmDtlPrdctOrSrvCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrdctOrSrvCdgSys() != null) {
			explanationofbenefititemdetailproductorservicecoding.setSystem(e.getExplntnOfBnftItmDtlPrdctOrSrvCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrdctOrSrvCdgUsrSltd() != null) {
			explanationofbenefititemdetailproductorservicecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmDtlPrdctOrSrvCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrdctOrSrvCdgVrsn() != null) {
			explanationofbenefititemdetailproductorservicecoding.setVersion(e.getExplntnOfBnftItmDtlPrdctOrSrvCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrdctOrSrvTxt() != null) {
			explanationofbenefititemdetailproductorservice.setText(e.getExplntnOfBnftItmDtlPrdctOrSrvTxt());
		}
		/******************** explanationofbenefititemdetailprogramcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailprogramcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititemdetail.addProgramCode(explanationofbenefititemdetailprogramcode);

		/******************** explanationofbenefititemdetailprogramcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailprogramcodecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemdetailprogramcode.addCoding(explanationofbenefititemdetailprogramcodecoding);

		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrgrmCdCdgCd() != null) {
			explanationofbenefititemdetailprogramcodecoding.setCode(e.getExplntnOfBnftItmDtlPrgrmCdCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrgrmCdCdgDsply() != null) {
			explanationofbenefititemdetailprogramcodecoding.setDisplay(e.getExplntnOfBnftItmDtlPrgrmCdCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrgrmCdCdgSys() != null) {
			explanationofbenefititemdetailprogramcodecoding.setSystem(e.getExplntnOfBnftItmDtlPrgrmCdCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrgrmCdCdgUsrSltd() != null) {
			explanationofbenefititemdetailprogramcodecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmDtlPrgrmCdCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrgrmCdCdgVrsn() != null) {
			explanationofbenefititemdetailprogramcodecoding.setVersion(e.getExplntnOfBnftItmDtlPrgrmCdCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlPrgrmCdTxt() != null) {
			explanationofbenefititemdetailprogramcode.setText(e.getExplntnOfBnftItmDtlPrgrmCdTxt());
		}
		/******************** explanationofbenefititemdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefititemdetailquantity =  new org.hl7.fhir.r4.model.Quantity();
		explanationofbenefititemdetail.setQuantity(explanationofbenefititemdetailquantity);

		/******************** ExplntnOfBnft_Itm_Dtl_Qnty_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlQntyCd() != null) {
			explanationofbenefititemdetailquantity.setCode(e.getExplntnOfBnftItmDtlQntyCd());
		}
		/******************** explanationofbenefititemdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory explanationofbenefititemdetailquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		explanationofbenefititemdetailquantity.setComparator(explanationofbenefititemdetailquantitycomparator.fromCode(e.getExplntnOfBnftItmDtlQntyCmprtr()));

		/******************** ExplntnOfBnft_Itm_Dtl_Qnty_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlQntySys() != null) {
			explanationofbenefititemdetailquantity.setSystem(e.getExplntnOfBnftItmDtlQntySys());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Qnty_Unt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlQntyUnt() != null) {
			explanationofbenefititemdetailquantity.setUnit(e.getExplntnOfBnftItmDtlQntyUnt());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Qnty_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlQntyVl() != null) {
			explanationofbenefititemdetailquantity.setValue(Double.parseDouble((e.getExplntnOfBnftItmDtlQntyVl())));
		}
		/******************** explanationofbenefititemdetailrevenue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailrevenue =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititemdetail.setRevenue(explanationofbenefititemdetailrevenue);

		/******************** explanationofbenefititemdetailrevenuecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailrevenuecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemdetailrevenue.addCoding(explanationofbenefititemdetailrevenuecoding);

		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlRevenueCdgCd() != null) {
			explanationofbenefititemdetailrevenuecoding.setCode(e.getExplntnOfBnftItmDtlRevenueCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlRevenueCdgDsply() != null) {
			explanationofbenefititemdetailrevenuecoding.setDisplay(e.getExplntnOfBnftItmDtlRevenueCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlRevenueCdgSys() != null) {
			explanationofbenefititemdetailrevenuecoding.setSystem(e.getExplntnOfBnftItmDtlRevenueCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlRevenueCdgUsrSltd() != null) {
			explanationofbenefititemdetailrevenuecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmDtlRevenueCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlRevenueCdgVrsn() != null) {
			explanationofbenefititemdetailrevenuecoding.setVersion(e.getExplntnOfBnftItmDtlRevenueCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlRevenueTxt() != null) {
			explanationofbenefititemdetailrevenue.setText(e.getExplntnOfBnftItmDtlRevenueTxt());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Sqnc ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSqnc() != null) {
			explanationofbenefititemdetail.setSequence(Integer.parseInt(e.getExplntnOfBnftItmDtlSqnc()));
		}
		/******************** explanationofbenefititemdetailsubdetail ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.SubDetailComponent explanationofbenefititemdetailsubdetail =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.SubDetailComponent();
		explanationofbenefititemdetail.addSubDetail(explanationofbenefititemdetailsubdetail);

		/******************** explanationofbenefititemdetailsubdetailadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent explanationofbenefititemdetailsubdetailadjudication =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent();
		explanationofbenefititemdetailsubdetail.addAdjudication(explanationofbenefititemdetailsubdetailadjudication);

		/******************** explanationofbenefititemdetailsubdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemdetailsubdetailadjudicationamount =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefititemdetailsubdetailadjudication.setAmount(explanationofbenefititemdetailsubdetailadjudicationamount);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnAmntCrncy() != null) {
			explanationofbenefititemdetailsubdetailadjudicationamount.setCurrency(e.getExplntnOfBnftItmDtlSubDtlAdjdctnAmntCrncy());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnAmntVl() != null) {
			explanationofbenefititemdetailsubdetailadjudicationamount.setValue(Double.parseDouble((e.getExplntnOfBnftItmDtlSubDtlAdjdctnAmntVl())));
		}
		/******************** explanationofbenefititemdetailsubdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailsubdetailadjudicationcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititemdetailsubdetailadjudication.setCategory(explanationofbenefititemdetailsubdetailadjudicationcategory);

		/******************** explanationofbenefititemdetailsubdetailadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailsubdetailadjudicationcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemdetailsubdetailadjudicationcategory.addCoding(explanationofbenefititemdetailsubdetailadjudicationcategorycoding);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgCd() != null) {
			explanationofbenefititemdetailsubdetailadjudicationcategorycoding.setCode(e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgDsply() != null) {
			explanationofbenefititemdetailsubdetailadjudicationcategorycoding.setDisplay(e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgSys() != null) {
			explanationofbenefititemdetailsubdetailadjudicationcategorycoding.setSystem(e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgUsrSltd() != null) {
			explanationofbenefititemdetailsubdetailadjudicationcategorycoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgVrsn() != null) {
			explanationofbenefititemdetailsubdetailadjudicationcategorycoding.setVersion(e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryTxt() != null) {
			explanationofbenefititemdetailsubdetailadjudicationcategory.setText(e.getExplntnOfBnftItmDtlSubDtlAdjdctnCtgryTxt());
		}
		/******************** explanationofbenefititemdetailsubdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailsubdetailadjudicationreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititemdetailsubdetailadjudication.setReason(explanationofbenefititemdetailsubdetailadjudicationreason);

		/******************** explanationofbenefititemdetailsubdetailadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailsubdetailadjudicationreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemdetailsubdetailadjudicationreason.addCoding(explanationofbenefititemdetailsubdetailadjudicationreasoncoding);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgCd() != null) {
			explanationofbenefititemdetailsubdetailadjudicationreasoncoding.setCode(e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgDsply() != null) {
			explanationofbenefititemdetailsubdetailadjudicationreasoncoding.setDisplay(e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgSys() != null) {
			explanationofbenefititemdetailsubdetailadjudicationreasoncoding.setSystem(e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgUsrSltd() != null) {
			explanationofbenefititemdetailsubdetailadjudicationreasoncoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgVrsn() != null) {
			explanationofbenefititemdetailsubdetailadjudicationreasoncoding.setVersion(e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnTxt() != null) {
			explanationofbenefititemdetailsubdetailadjudicationreason.setText(e.getExplntnOfBnftItmDtlSubDtlAdjdctnRsnTxt());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlAdjdctnVl() != null) {
			explanationofbenefititemdetailsubdetailadjudication.setValue(Double.parseDouble((e.getExplntnOfBnftItmDtlSubDtlAdjdctnVl())));
		}
		/******************** explanationofbenefititemdetailsubdetailcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailsubdetailcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititemdetailsubdetail.setCategory(explanationofbenefititemdetailsubdetailcategory);

		/******************** explanationofbenefititemdetailsubdetailcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailsubdetailcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemdetailsubdetailcategory.addCoding(explanationofbenefititemdetailsubdetailcategorycoding);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlCtgryCdgCd() != null) {
			explanationofbenefititemdetailsubdetailcategorycoding.setCode(e.getExplntnOfBnftItmDtlSubDtlCtgryCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlCtgryCdgDsply() != null) {
			explanationofbenefititemdetailsubdetailcategorycoding.setDisplay(e.getExplntnOfBnftItmDtlSubDtlCtgryCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlCtgryCdgSys() != null) {
			explanationofbenefititemdetailsubdetailcategorycoding.setSystem(e.getExplntnOfBnftItmDtlSubDtlCtgryCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlCtgryCdgUsrSltd() != null) {
			explanationofbenefititemdetailsubdetailcategorycoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmDtlSubDtlCtgryCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlCtgryCdgVrsn() != null) {
			explanationofbenefititemdetailsubdetailcategorycoding.setVersion(e.getExplntnOfBnftItmDtlSubDtlCtgryCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlCtgryTxt() != null) {
			explanationofbenefititemdetailsubdetailcategory.setText(e.getExplntnOfBnftItmDtlSubDtlCtgryTxt());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Factor ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlFactor() != null) {
			explanationofbenefititemdetailsubdetail.setFactor(Double.parseDouble((e.getExplntnOfBnftItmDtlSubDtlFactor())));
		}
		/******************** explanationofbenefititemdetailsubdetailmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailsubdetailmodifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititemdetailsubdetail.addModifier(explanationofbenefititemdetailsubdetailmodifier);

		/******************** explanationofbenefititemdetailsubdetailmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailsubdetailmodifiercoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemdetailsubdetailmodifier.addCoding(explanationofbenefititemdetailsubdetailmodifiercoding);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlMdfrCdgCd() != null) {
			explanationofbenefititemdetailsubdetailmodifiercoding.setCode(e.getExplntnOfBnftItmDtlSubDtlMdfrCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlMdfrCdgDsply() != null) {
			explanationofbenefititemdetailsubdetailmodifiercoding.setDisplay(e.getExplntnOfBnftItmDtlSubDtlMdfrCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlMdfrCdgSys() != null) {
			explanationofbenefititemdetailsubdetailmodifiercoding.setSystem(e.getExplntnOfBnftItmDtlSubDtlMdfrCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlMdfrCdgUsrSltd() != null) {
			explanationofbenefititemdetailsubdetailmodifiercoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmDtlSubDtlMdfrCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlMdfrCdgVrsn() != null) {
			explanationofbenefititemdetailsubdetailmodifiercoding.setVersion(e.getExplntnOfBnftItmDtlSubDtlMdfrCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlMdfrTxt() != null) {
			explanationofbenefititemdetailsubdetailmodifier.setText(e.getExplntnOfBnftItmDtlSubDtlMdfrTxt());
		}
		/******************** explanationofbenefititemdetailsubdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemdetailsubdetailnet =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefititemdetailsubdetail.setNet(explanationofbenefititemdetailsubdetailnet);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Net_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlNetCrncy() != null) {
			explanationofbenefititemdetailsubdetailnet.setCurrency(e.getExplntnOfBnftItmDtlSubDtlNetCrncy());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Net_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlNetVl() != null) {
			explanationofbenefititemdetailsubdetailnet.setValue(Double.parseDouble((e.getExplntnOfBnftItmDtlSubDtlNetVl())));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_NtNmbr ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlNtNmbr() != null) {
			explanationofbenefititemdetailsubdetail.addNoteNumber(Integer.parseInt(e.getExplntnOfBnftItmDtlSubDtlNtNmbr()));
		}
		/******************** explanationofbenefititemdetailsubdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailsubdetailproductorservice =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititemdetailsubdetail.setProductOrService(explanationofbenefititemdetailsubdetailproductorservice);

		/******************** explanationofbenefititemdetailsubdetailproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailsubdetailproductorservicecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemdetailsubdetailproductorservice.addCoding(explanationofbenefititemdetailsubdetailproductorservicecoding);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgCd() != null) {
			explanationofbenefititemdetailsubdetailproductorservicecoding.setCode(e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgDsply() != null) {
			explanationofbenefititemdetailsubdetailproductorservicecoding.setDisplay(e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgSys() != null) {
			explanationofbenefititemdetailsubdetailproductorservicecoding.setSystem(e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgUsrSltd() != null) {
			explanationofbenefititemdetailsubdetailproductorservicecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgVrsn() != null) {
			explanationofbenefititemdetailsubdetailproductorservicecoding.setVersion(e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvTxt() != null) {
			explanationofbenefititemdetailsubdetailproductorservice.setText(e.getExplntnOfBnftItmDtlSubDtlPrdctOrSrvTxt());
		}
		/******************** explanationofbenefititemdetailsubdetailprogramcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailsubdetailprogramcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititemdetailsubdetail.addProgramCode(explanationofbenefititemdetailsubdetailprogramcode);

		/******************** explanationofbenefititemdetailsubdetailprogramcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailsubdetailprogramcodecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemdetailsubdetailprogramcode.addCoding(explanationofbenefititemdetailsubdetailprogramcodecoding);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgCd() != null) {
			explanationofbenefititemdetailsubdetailprogramcodecoding.setCode(e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgDsply() != null) {
			explanationofbenefititemdetailsubdetailprogramcodecoding.setDisplay(e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgSys() != null) {
			explanationofbenefititemdetailsubdetailprogramcodecoding.setSystem(e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgUsrSltd() != null) {
			explanationofbenefititemdetailsubdetailprogramcodecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgVrsn() != null) {
			explanationofbenefititemdetailsubdetailprogramcodecoding.setVersion(e.getExplntnOfBnftItmDtlSubDtlPrgrmCdCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlPrgrmCdTxt() != null) {
			explanationofbenefititemdetailsubdetailprogramcode.setText(e.getExplntnOfBnftItmDtlSubDtlPrgrmCdTxt());
		}
		/******************** explanationofbenefititemdetailsubdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefititemdetailsubdetailquantity =  new org.hl7.fhir.r4.model.Quantity();
		explanationofbenefititemdetailsubdetail.setQuantity(explanationofbenefititemdetailsubdetailquantity);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Qnty_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlQntyCd() != null) {
			explanationofbenefititemdetailsubdetailquantity.setCode(e.getExplntnOfBnftItmDtlSubDtlQntyCd());
		}
		/******************** explanationofbenefititemdetailsubdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory explanationofbenefititemdetailsubdetailquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		explanationofbenefititemdetailsubdetailquantity.setComparator(explanationofbenefititemdetailsubdetailquantitycomparator.fromCode(e.getExplntnOfBnftItmDtlSubDtlQntyCmprtr()));

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Qnty_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlQntySys() != null) {
			explanationofbenefititemdetailsubdetailquantity.setSystem(e.getExplntnOfBnftItmDtlSubDtlQntySys());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Qnty_Unt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlQntyUnt() != null) {
			explanationofbenefititemdetailsubdetailquantity.setUnit(e.getExplntnOfBnftItmDtlSubDtlQntyUnt());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Qnty_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlQntyVl() != null) {
			explanationofbenefititemdetailsubdetailquantity.setValue(Double.parseDouble((e.getExplntnOfBnftItmDtlSubDtlQntyVl())));
		}
		/******************** explanationofbenefititemdetailsubdetailrevenue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailsubdetailrevenue =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititemdetailsubdetail.setRevenue(explanationofbenefititemdetailsubdetailrevenue);

		/******************** explanationofbenefititemdetailsubdetailrevenuecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailsubdetailrevenuecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemdetailsubdetailrevenue.addCoding(explanationofbenefititemdetailsubdetailrevenuecoding);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlRevenueCdgCd() != null) {
			explanationofbenefititemdetailsubdetailrevenuecoding.setCode(e.getExplntnOfBnftItmDtlSubDtlRevenueCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlRevenueCdgDsply() != null) {
			explanationofbenefititemdetailsubdetailrevenuecoding.setDisplay(e.getExplntnOfBnftItmDtlSubDtlRevenueCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlRevenueCdgSys() != null) {
			explanationofbenefititemdetailsubdetailrevenuecoding.setSystem(e.getExplntnOfBnftItmDtlSubDtlRevenueCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlRevenueCdgUsrSltd() != null) {
			explanationofbenefititemdetailsubdetailrevenuecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmDtlSubDtlRevenueCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlRevenueCdgVrsn() != null) {
			explanationofbenefititemdetailsubdetailrevenuecoding.setVersion(e.getExplntnOfBnftItmDtlSubDtlRevenueCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlRevenueTxt() != null) {
			explanationofbenefititemdetailsubdetailrevenue.setText(e.getExplntnOfBnftItmDtlSubDtlRevenueTxt());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Sqnc ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlSqnc() != null) {
			explanationofbenefititemdetailsubdetail.setSequence(Integer.parseInt(e.getExplntnOfBnftItmDtlSubDtlSqnc()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Udi ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlUdi() != null) {
			explanationofbenefititemdetailsubdetail.addUdi( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftItmDtlSubDtlUdi()));
		}
		/******************** explanationofbenefititemdetailsubdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemdetailsubdetailunitprice =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefititemdetailsubdetail.setUnitPrice(explanationofbenefititemdetailsubdetailunitprice);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_UntPrice_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlUntPriceCrncy() != null) {
			explanationofbenefititemdetailsubdetailunitprice.setCurrency(e.getExplntnOfBnftItmDtlSubDtlUntPriceCrncy());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_UntPrice_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlSubDtlUntPriceVl() != null) {
			explanationofbenefititemdetailsubdetailunitprice.setValue(Double.parseDouble((e.getExplntnOfBnftItmDtlSubDtlUntPriceVl())));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Udi ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlUdi() != null) {
			explanationofbenefititemdetail.addUdi( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftItmDtlUdi()));
		}
		/******************** explanationofbenefititemdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemdetailunitprice =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefititemdetail.setUnitPrice(explanationofbenefititemdetailunitprice);

		/******************** ExplntnOfBnft_Itm_Dtl_UntPrice_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlUntPriceCrncy() != null) {
			explanationofbenefititemdetailunitprice.setCurrency(e.getExplntnOfBnftItmDtlUntPriceCrncy());
		}
		/******************** ExplntnOfBnft_Itm_Dtl_UntPrice_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmDtlUntPriceVl() != null) {
			explanationofbenefititemdetailunitprice.setValue(Double.parseDouble((e.getExplntnOfBnftItmDtlUntPriceVl())));
		}
		/******************** ExplntnOfBnft_Itm_DgnsisSqnc ********************************************************************************/
		if(e.getExplntnOfBnftItmDgnsisSqnc() != null) {
			explanationofbenefititem.addDiagnosisSequence(Integer.parseInt(e.getExplntnOfBnftItmDgnsisSqnc()));
		}
		/******************** ExplntnOfBnft_Itm_Enc ********************************************************************************/
		if(e.getExplntnOfBnftItmEnc() != null) {
			explanationofbenefititem.addEncounter( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftItmEnc()));
		}
		/******************** ExplntnOfBnft_Itm_Factor ********************************************************************************/
		if(e.getExplntnOfBnftItmFactor() != null) {
			explanationofbenefititem.setFactor(Double.parseDouble((e.getExplntnOfBnftItmFactor())));
		}
		/******************** ExplntnOfBnft_Itm_InfoSqnc ********************************************************************************/
		if(e.getExplntnOfBnftItmInfoSqnc() != null) {
			explanationofbenefititem.addInformationSequence(Integer.parseInt(e.getExplntnOfBnftItmInfoSqnc()));
		}
		/******************** explanationofbenefititemlocationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address explanationofbenefititemlocationaddress =  new org.hl7.fhir.r4.model.Address();
		explanationofbenefititem.setLocation(explanationofbenefititemlocationaddress);

		/******************** ExplntnOfBnft_Itm_LctnAddr_City ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrCity() != null) {
			explanationofbenefititemlocationaddress.setCity(e.getExplntnOfBnftItmLctnAddrCity());
		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_Cntry ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrCntry() != null) {
			explanationofbenefititemlocationaddress.setCountry(e.getExplntnOfBnftItmLctnAddrCntry());
		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_District ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrDistrict() != null) {
			explanationofbenefititemlocationaddress.setDistrict(e.getExplntnOfBnftItmLctnAddrDistrict());
		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_Line ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrLine() != null) {
			explanationofbenefititemlocationaddress.addLine(e.getExplntnOfBnftItmLctnAddrLine());
		}
		/******************** explanationofbenefititemlocationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefititemlocationaddressperiod =  new org.hl7.fhir.r4.model.Period();
		explanationofbenefititemlocationaddress.setPeriod(explanationofbenefititemlocationaddressperiod);

		/******************** ExplntnOfBnft_Itm_LctnAddr_Prd_End ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrPrdEnd() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_Itm_LctnAddr_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_Itm_LctnAddr_Prd_Enddate = ExplntnOfBnft_Itm_LctnAddr_Prd_Endsdf.parse(e.getExplntnOfBnftItmLctnAddrPrdEnd());
			explanationofbenefititemlocationaddressperiod.setEnd(ExplntnOfBnft_Itm_LctnAddr_Prd_Enddate);
		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_Prd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrPrdStrt() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_Itm_LctnAddr_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_Itm_LctnAddr_Prd_Strtdate = ExplntnOfBnft_Itm_LctnAddr_Prd_Strtsdf.parse(e.getExplntnOfBnftItmLctnAddrPrdStrt());
			explanationofbenefititemlocationaddressperiod.setStart(ExplntnOfBnft_Itm_LctnAddr_Prd_Strtdate);
		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_PostalCd ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrPostalCd() != null) {
			explanationofbenefititemlocationaddress.setPostalCode(e.getExplntnOfBnftItmLctnAddrPostalCd());
		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_State ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrState() != null) {
			explanationofbenefititemlocationaddress.setState(e.getExplntnOfBnftItmLctnAddrState());
		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnAddrTxt() != null) {
			explanationofbenefititemlocationaddress.setText(e.getExplntnOfBnftItmLctnAddrTxt());
		}
		/******************** explanationofbenefititemlocationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory explanationofbenefititemlocationaddresstype =  new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();
		explanationofbenefititemlocationaddress.setType(explanationofbenefititemlocationaddresstype.fromCode(e.getExplntnOfBnftItmLctnAddrTyp()));

		/******************** explanationofbenefititemlocationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory explanationofbenefititemlocationaddressuse =  new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();
		explanationofbenefititemlocationaddress.setUse(explanationofbenefititemlocationaddressuse.fromCode(e.getExplntnOfBnftItmLctnAddrUse()));

		/******************** explanationofbenefititemlocationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemlocationcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititem.setLocation(explanationofbenefititemlocationcodeableconcept);

		/******************** explanationofbenefititemlocationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemlocationcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemlocationcodeableconcept.addCoding(explanationofbenefititemlocationcodeableconceptcoding);

		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnCdbleCncptCdgCd() != null) {
			explanationofbenefititemlocationcodeableconceptcoding.setCode(e.getExplntnOfBnftItmLctnCdbleCncptCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnCdbleCncptCdgDsply() != null) {
			explanationofbenefititemlocationcodeableconceptcoding.setDisplay(e.getExplntnOfBnftItmLctnCdbleCncptCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnCdbleCncptCdgSys() != null) {
			explanationofbenefititemlocationcodeableconceptcoding.setSystem(e.getExplntnOfBnftItmLctnCdbleCncptCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnCdbleCncptCdgUsrSltd() != null) {
			explanationofbenefititemlocationcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmLctnCdbleCncptCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnCdbleCncptCdgVrsn() != null) {
			explanationofbenefititemlocationcodeableconceptcoding.setVersion(e.getExplntnOfBnftItmLctnCdbleCncptCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnCdbleCncptTxt() != null) {
			explanationofbenefititemlocationcodeableconcept.setText(e.getExplntnOfBnftItmLctnCdbleCncptTxt());
		}
		/******************** ExplntnOfBnft_Itm_LctnRfrnc ********************************************************************************/
		if(e.getExplntnOfBnftItmLctnRfrnc() != null) {
			explanationofbenefititem.setLocation( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftItmLctnRfrnc()));
		}
		/******************** explanationofbenefititemmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemmodifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititem.addModifier(explanationofbenefititemmodifier);

		/******************** explanationofbenefititemmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemmodifiercoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemmodifier.addCoding(explanationofbenefititemmodifiercoding);

		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmMdfrCdgCd() != null) {
			explanationofbenefititemmodifiercoding.setCode(e.getExplntnOfBnftItmMdfrCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmMdfrCdgDsply() != null) {
			explanationofbenefititemmodifiercoding.setDisplay(e.getExplntnOfBnftItmMdfrCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmMdfrCdgSys() != null) {
			explanationofbenefititemmodifiercoding.setSystem(e.getExplntnOfBnftItmMdfrCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmMdfrCdgUsrSltd() != null) {
			explanationofbenefititemmodifiercoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmMdfrCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmMdfrCdgVrsn() != null) {
			explanationofbenefititemmodifiercoding.setVersion(e.getExplntnOfBnftItmMdfrCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_Mdfr_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmMdfrTxt() != null) {
			explanationofbenefititemmodifier.setText(e.getExplntnOfBnftItmMdfrTxt());
		}
		/******************** explanationofbenefititemnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemnet =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefititem.setNet(explanationofbenefititemnet);

		/******************** ExplntnOfBnft_Itm_Net_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftItmNetCrncy() != null) {
			explanationofbenefititemnet.setCurrency(e.getExplntnOfBnftItmNetCrncy());
		}
		/******************** ExplntnOfBnft_Itm_Net_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmNetVl() != null) {
			explanationofbenefititemnet.setValue(Double.parseDouble((e.getExplntnOfBnftItmNetVl())));
		}
		/******************** ExplntnOfBnft_Itm_NtNmbr ********************************************************************************/
		if(e.getExplntnOfBnftItmNtNmbr() != null) {
			explanationofbenefititem.addNoteNumber(Integer.parseInt(e.getExplntnOfBnftItmNtNmbr()));
		}
		/******************** ExplntnOfBnft_Itm_PrcdrSqnc ********************************************************************************/
		if(e.getExplntnOfBnftItmPrcdrSqnc() != null) {
			explanationofbenefititem.addProcedureSequence(Integer.parseInt(e.getExplntnOfBnftItmPrcdrSqnc()));
		}
		/******************** explanationofbenefititemproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemproductorservice =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititem.setProductOrService(explanationofbenefititemproductorservice);

		/******************** explanationofbenefititemproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemproductorservicecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemproductorservice.addCoding(explanationofbenefititemproductorservicecoding);

		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmPrdctOrSrvCdgCd() != null) {
			explanationofbenefititemproductorservicecoding.setCode(e.getExplntnOfBnftItmPrdctOrSrvCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmPrdctOrSrvCdgDsply() != null) {
			explanationofbenefititemproductorservicecoding.setDisplay(e.getExplntnOfBnftItmPrdctOrSrvCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmPrdctOrSrvCdgSys() != null) {
			explanationofbenefititemproductorservicecoding.setSystem(e.getExplntnOfBnftItmPrdctOrSrvCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmPrdctOrSrvCdgUsrSltd() != null) {
			explanationofbenefititemproductorservicecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmPrdctOrSrvCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmPrdctOrSrvCdgVrsn() != null) {
			explanationofbenefititemproductorservicecoding.setVersion(e.getExplntnOfBnftItmPrdctOrSrvCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmPrdctOrSrvTxt() != null) {
			explanationofbenefititemproductorservice.setText(e.getExplntnOfBnftItmPrdctOrSrvTxt());
		}
		/******************** explanationofbenefititemprogramcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemprogramcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititem.addProgramCode(explanationofbenefititemprogramcode);

		/******************** explanationofbenefititemprogramcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemprogramcodecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemprogramcode.addCoding(explanationofbenefititemprogramcodecoding);

		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmPrgrmCdCdgCd() != null) {
			explanationofbenefititemprogramcodecoding.setCode(e.getExplntnOfBnftItmPrgrmCdCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmPrgrmCdCdgDsply() != null) {
			explanationofbenefititemprogramcodecoding.setDisplay(e.getExplntnOfBnftItmPrgrmCdCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmPrgrmCdCdgSys() != null) {
			explanationofbenefititemprogramcodecoding.setSystem(e.getExplntnOfBnftItmPrgrmCdCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmPrgrmCdCdgUsrSltd() != null) {
			explanationofbenefititemprogramcodecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmPrgrmCdCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmPrgrmCdCdgVrsn() != null) {
			explanationofbenefititemprogramcodecoding.setVersion(e.getExplntnOfBnftItmPrgrmCdCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_PrgrmCd_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmPrgrmCdTxt() != null) {
			explanationofbenefititemprogramcode.setText(e.getExplntnOfBnftItmPrgrmCdTxt());
		}
		/******************** explanationofbenefititemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefititemquantity =  new org.hl7.fhir.r4.model.Quantity();
		explanationofbenefititem.setQuantity(explanationofbenefititemquantity);

		/******************** ExplntnOfBnft_Itm_Qnty_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmQntyCd() != null) {
			explanationofbenefititemquantity.setCode(e.getExplntnOfBnftItmQntyCd());
		}
		/******************** explanationofbenefititemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory explanationofbenefititemquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		explanationofbenefititemquantity.setComparator(explanationofbenefititemquantitycomparator.fromCode(e.getExplntnOfBnftItmQntyCmprtr()));

		/******************** ExplntnOfBnft_Itm_Qnty_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmQntySys() != null) {
			explanationofbenefititemquantity.setSystem(e.getExplntnOfBnftItmQntySys());
		}
		/******************** ExplntnOfBnft_Itm_Qnty_Unt ********************************************************************************/
		if(e.getExplntnOfBnftItmQntyUnt() != null) {
			explanationofbenefititemquantity.setUnit(e.getExplntnOfBnftItmQntyUnt());
		}
		/******************** ExplntnOfBnft_Itm_Qnty_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmQntyVl() != null) {
			explanationofbenefititemquantity.setValue(Double.parseDouble((e.getExplntnOfBnftItmQntyVl())));
		}
		/******************** explanationofbenefititemrevenue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemrevenue =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititem.setRevenue(explanationofbenefititemrevenue);

		/******************** explanationofbenefititemrevenuecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemrevenuecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemrevenue.addCoding(explanationofbenefititemrevenuecoding);

		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmRevenueCdgCd() != null) {
			explanationofbenefititemrevenuecoding.setCode(e.getExplntnOfBnftItmRevenueCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmRevenueCdgDsply() != null) {
			explanationofbenefititemrevenuecoding.setDisplay(e.getExplntnOfBnftItmRevenueCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmRevenueCdgSys() != null) {
			explanationofbenefititemrevenuecoding.setSystem(e.getExplntnOfBnftItmRevenueCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmRevenueCdgUsrSltd() != null) {
			explanationofbenefititemrevenuecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmRevenueCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmRevenueCdgVrsn() != null) {
			explanationofbenefititemrevenuecoding.setVersion(e.getExplntnOfBnftItmRevenueCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_Revenue_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmRevenueTxt() != null) {
			explanationofbenefititemrevenue.setText(e.getExplntnOfBnftItmRevenueTxt());
		}
		/******************** ExplntnOfBnft_Itm_Sqnc ********************************************************************************/
		if(e.getExplntnOfBnftItmSqnc() != null) {
			explanationofbenefititem.setSequence(Integer.parseInt(e.getExplntnOfBnftItmSqnc()));
		}
		/******************** ExplntnOfBnft_Itm_SrvdDtTyp ********************************************************************************/
		if(e.getExplntnOfBnftItmSrvdDtTyp() != null) {
			explanationofbenefititem.setServiced( new org.hl7.fhir.r4.model.DateType(e.getExplntnOfBnftItmSrvdDtTyp()));
		}
		/******************** explanationofbenefititemservicedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefititemservicedperiod =  new org.hl7.fhir.r4.model.Period();
		explanationofbenefititem.setServiced(explanationofbenefititemservicedperiod);

		/******************** ExplntnOfBnft_Itm_SrvdPrd_End ********************************************************************************/
		if(e.getExplntnOfBnftItmSrvdPrdEnd() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_Itm_SrvdPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_Itm_SrvdPrd_Enddate = ExplntnOfBnft_Itm_SrvdPrd_Endsdf.parse(e.getExplntnOfBnftItmSrvdPrdEnd());
			explanationofbenefititemservicedperiod.setEnd(ExplntnOfBnft_Itm_SrvdPrd_Enddate);
		}
		/******************** ExplntnOfBnft_Itm_SrvdPrd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftItmSrvdPrdStrt() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_Itm_SrvdPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_Itm_SrvdPrd_Strtdate = ExplntnOfBnft_Itm_SrvdPrd_Strtsdf.parse(e.getExplntnOfBnftItmSrvdPrdStrt());
			explanationofbenefititemservicedperiod.setStart(ExplntnOfBnft_Itm_SrvdPrd_Strtdate);
		}
		/******************** explanationofbenefititemsubsite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemsubsite =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefititem.addSubSite(explanationofbenefititemsubsite);

		/******************** explanationofbenefititemsubsitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemsubsitecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefititemsubsite.addCoding(explanationofbenefititemsubsitecoding);

		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftItmSubSiteCdgCd() != null) {
			explanationofbenefititemsubsitecoding.setCode(e.getExplntnOfBnftItmSubSiteCdgCd());
		}
		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftItmSubSiteCdgDsply() != null) {
			explanationofbenefititemsubsitecoding.setDisplay(e.getExplntnOfBnftItmSubSiteCdgDsply());
		}
		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftItmSubSiteCdgSys() != null) {
			explanationofbenefititemsubsitecoding.setSystem(e.getExplntnOfBnftItmSubSiteCdgSys());
		}
		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftItmSubSiteCdgUsrSltd() != null) {
			explanationofbenefititemsubsitecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftItmSubSiteCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftItmSubSiteCdgVrsn() != null) {
			explanationofbenefititemsubsitecoding.setVersion(e.getExplntnOfBnftItmSubSiteCdgVrsn());
		}
		/******************** ExplntnOfBnft_Itm_SubSite_Txt ********************************************************************************/
		if(e.getExplntnOfBnftItmSubSiteTxt() != null) {
			explanationofbenefititemsubsite.setText(e.getExplntnOfBnftItmSubSiteTxt());
		}
		/******************** ExplntnOfBnft_Itm_Udi ********************************************************************************/
		if(e.getExplntnOfBnftItmUdi() != null) {
			explanationofbenefititem.addUdi( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftItmUdi()));
		}
		/******************** explanationofbenefititemunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemunitprice =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefititem.setUnitPrice(explanationofbenefititemunitprice);

		/******************** ExplntnOfBnft_Itm_UntPrice_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftItmUntPriceCrncy() != null) {
			explanationofbenefititemunitprice.setCurrency(e.getExplntnOfBnftItmUntPriceCrncy());
		}
		/******************** ExplntnOfBnft_Itm_UntPrice_Vl ********************************************************************************/
		if(e.getExplntnOfBnftItmUntPriceVl() != null) {
			explanationofbenefititemunitprice.setValue(Double.parseDouble((e.getExplntnOfBnftItmUntPriceVl())));
		}
		/******************** ExplntnOfBnft_OriginalPrescription ********************************************************************************/
		if(e.getExplntnOfBnftOriginalPrescription() != null) {
			explanationofbenefit.setOriginalPrescription( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftOriginalPrescription()));
		}
		/******************** explanationofbenefitoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.RemittanceOutcomeEnumFactory explanationofbenefitoutcome =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.RemittanceOutcomeEnumFactory();
		explanationofbenefit.setOutcome(explanationofbenefitoutcome.fromCode(e.getExplntnOfBnftOutcome()));

		/******************** ExplntnOfBnft_Pnt ********************************************************************************/
		if(e.getExplntnOfBnftPnt() != null) {
			explanationofbenefit.setPatient( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftPnt()));
		}
		/******************** explanationofbenefitpayee ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.PayeeComponent explanationofbenefitpayee =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.PayeeComponent();
		explanationofbenefit.setPayee(explanationofbenefitpayee);

		/******************** ExplntnOfBnft_Payee_Party ********************************************************************************/
		if(e.getExplntnOfBnftPayeeParty() != null) {
			explanationofbenefitpayee.setParty( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftPayeeParty()));
		}
		/******************** explanationofbenefitpayeetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitpayeetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitpayee.setType(explanationofbenefitpayeetype);

		/******************** explanationofbenefitpayeetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitpayeetypecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitpayeetype.addCoding(explanationofbenefitpayeetypecoding);

		/******************** ExplntnOfBnft_Payee_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftPayeeTypCdgCd() != null) {
			explanationofbenefitpayeetypecoding.setCode(e.getExplntnOfBnftPayeeTypCdgCd());
		}
		/******************** ExplntnOfBnft_Payee_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftPayeeTypCdgDsply() != null) {
			explanationofbenefitpayeetypecoding.setDisplay(e.getExplntnOfBnftPayeeTypCdgDsply());
		}
		/******************** ExplntnOfBnft_Payee_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftPayeeTypCdgSys() != null) {
			explanationofbenefitpayeetypecoding.setSystem(e.getExplntnOfBnftPayeeTypCdgSys());
		}
		/******************** ExplntnOfBnft_Payee_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftPayeeTypCdgUsrSltd() != null) {
			explanationofbenefitpayeetypecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftPayeeTypCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Payee_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftPayeeTypCdgVrsn() != null) {
			explanationofbenefitpayeetypecoding.setVersion(e.getExplntnOfBnftPayeeTypCdgVrsn());
		}
		/******************** ExplntnOfBnft_Payee_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftPayeeTypTxt() != null) {
			explanationofbenefitpayeetype.setText(e.getExplntnOfBnftPayeeTypTxt());
		}
		/******************** explanationofbenefitpayment ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.PaymentComponent explanationofbenefitpayment =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.PaymentComponent();
		explanationofbenefit.setPayment(explanationofbenefitpayment);

		/******************** explanationofbenefitpaymentadjustment ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitpaymentadjustment =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefitpayment.setAdjustment(explanationofbenefitpaymentadjustment);

		/******************** ExplntnOfBnft_Pymnt_Adjustment_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftPymntAdjustmentCrncy() != null) {
			explanationofbenefitpaymentadjustment.setCurrency(e.getExplntnOfBnftPymntAdjustmentCrncy());
		}
		/******************** ExplntnOfBnft_Pymnt_Adjustment_Vl ********************************************************************************/
		if(e.getExplntnOfBnftPymntAdjustmentVl() != null) {
			explanationofbenefitpaymentadjustment.setValue(Double.parseDouble((e.getExplntnOfBnftPymntAdjustmentVl())));
		}
		/******************** explanationofbenefitpaymentadjustmentreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitpaymentadjustmentreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitpayment.setAdjustmentReason(explanationofbenefitpaymentadjustmentreason);

		/******************** explanationofbenefitpaymentadjustmentreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitpaymentadjustmentreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitpaymentadjustmentreason.addCoding(explanationofbenefitpaymentadjustmentreasoncoding);

		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftPymntAdjustmentRsnCdgCd() != null) {
			explanationofbenefitpaymentadjustmentreasoncoding.setCode(e.getExplntnOfBnftPymntAdjustmentRsnCdgCd());
		}
		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftPymntAdjustmentRsnCdgDsply() != null) {
			explanationofbenefitpaymentadjustmentreasoncoding.setDisplay(e.getExplntnOfBnftPymntAdjustmentRsnCdgDsply());
		}
		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftPymntAdjustmentRsnCdgSys() != null) {
			explanationofbenefitpaymentadjustmentreasoncoding.setSystem(e.getExplntnOfBnftPymntAdjustmentRsnCdgSys());
		}
		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftPymntAdjustmentRsnCdgUsrSltd() != null) {
			explanationofbenefitpaymentadjustmentreasoncoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftPymntAdjustmentRsnCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftPymntAdjustmentRsnCdgVrsn() != null) {
			explanationofbenefitpaymentadjustmentreasoncoding.setVersion(e.getExplntnOfBnftPymntAdjustmentRsnCdgVrsn());
		}
		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Txt ********************************************************************************/
		if(e.getExplntnOfBnftPymntAdjustmentRsnTxt() != null) {
			explanationofbenefitpaymentadjustmentreason.setText(e.getExplntnOfBnftPymntAdjustmentRsnTxt());
		}
		/******************** explanationofbenefitpaymentamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitpaymentamount =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefitpayment.setAmount(explanationofbenefitpaymentamount);

		/******************** ExplntnOfBnft_Pymnt_Amnt_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftPymntAmntCrncy() != null) {
			explanationofbenefitpaymentamount.setCurrency(e.getExplntnOfBnftPymntAmntCrncy());
		}
		/******************** ExplntnOfBnft_Pymnt_Amnt_Vl ********************************************************************************/
		if(e.getExplntnOfBnftPymntAmntVl() != null) {
			explanationofbenefitpaymentamount.setValue(Double.parseDouble((e.getExplntnOfBnftPymntAmntVl())));
		}
		/******************** ExplntnOfBnft_Pymnt_Dt ********************************************************************************/
		if(e.getExplntnOfBnftPymntDt() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_Pymnt_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_Pymnt_Dtdate = ExplntnOfBnft_Pymnt_Dtsdf.parse(e.getExplntnOfBnftPymntDt());
			explanationofbenefitpayment.setDate(ExplntnOfBnft_Pymnt_Dtdate);
		}
		/******************** explanationofbenefitpaymentidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier explanationofbenefitpaymentidentifier =  new org.hl7.fhir.r4.model.Identifier();
		explanationofbenefitpayment.setIdentifier(explanationofbenefitpaymentidentifier);

		/******************** ExplntnOfBnft_Pymnt_Id_Assigner ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdAssigner() != null) {
			explanationofbenefitpaymentidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftPymntIdAssigner()));
		}
		/******************** explanationofbenefitpaymentidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitpaymentidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		explanationofbenefitpaymentidentifier.setPeriod(explanationofbenefitpaymentidentifierperiod);

		/******************** ExplntnOfBnft_Pymnt_Id_Prd_End ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdPrdEnd() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_Pymnt_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_Pymnt_Id_Prd_Enddate = ExplntnOfBnft_Pymnt_Id_Prd_Endsdf.parse(e.getExplntnOfBnftPymntIdPrdEnd());
			explanationofbenefitpaymentidentifierperiod.setEnd(ExplntnOfBnft_Pymnt_Id_Prd_Enddate);
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Prd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdPrdStrt() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_Pymnt_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_Pymnt_Id_Prd_Strtdate = ExplntnOfBnft_Pymnt_Id_Prd_Strtsdf.parse(e.getExplntnOfBnftPymntIdPrdStrt());
			explanationofbenefitpaymentidentifierperiod.setStart(ExplntnOfBnft_Pymnt_Id_Prd_Strtdate);
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Sys ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdSys() != null) {
			explanationofbenefitpaymentidentifier.setSystem(e.getExplntnOfBnftPymntIdSys());
		}
		/******************** explanationofbenefitpaymentidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitpaymentidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitpaymentidentifier.setType(explanationofbenefitpaymentidentifiertype);

		/******************** explanationofbenefitpaymentidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitpaymentidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitpaymentidentifiertype.addCoding(explanationofbenefitpaymentidentifiertypecoding);

		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdTypCdgCd() != null) {
			explanationofbenefitpaymentidentifiertypecoding.setCode(e.getExplntnOfBnftPymntIdTypCdgCd());
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdTypCdgDsply() != null) {
			explanationofbenefitpaymentidentifiertypecoding.setDisplay(e.getExplntnOfBnftPymntIdTypCdgDsply());
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdTypCdgSys() != null) {
			explanationofbenefitpaymentidentifiertypecoding.setSystem(e.getExplntnOfBnftPymntIdTypCdgSys());
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdTypCdgUsrSltd() != null) {
			explanationofbenefitpaymentidentifiertypecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftPymntIdTypCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdTypCdgVrsn() != null) {
			explanationofbenefitpaymentidentifiertypecoding.setVersion(e.getExplntnOfBnftPymntIdTypCdgVrsn());
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdTypTxt() != null) {
			explanationofbenefitpaymentidentifiertype.setText(e.getExplntnOfBnftPymntIdTypTxt());
		}
		/******************** explanationofbenefitpaymentidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory explanationofbenefitpaymentidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		explanationofbenefitpaymentidentifier.setUse(explanationofbenefitpaymentidentifieruse.fromCode(e.getExplntnOfBnftPymntIdUse()));

		/******************** ExplntnOfBnft_Pymnt_Id_Vl ********************************************************************************/
		if(e.getExplntnOfBnftPymntIdVl() != null) {
			explanationofbenefitpaymentidentifier.setValue(e.getExplntnOfBnftPymntIdVl());
		}
		/******************** explanationofbenefitpaymenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitpaymenttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitpayment.setType(explanationofbenefitpaymenttype);

		/******************** explanationofbenefitpaymenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitpaymenttypecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitpaymenttype.addCoding(explanationofbenefitpaymenttypecoding);

		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftPymntTypCdgCd() != null) {
			explanationofbenefitpaymenttypecoding.setCode(e.getExplntnOfBnftPymntTypCdgCd());
		}
		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftPymntTypCdgDsply() != null) {
			explanationofbenefitpaymenttypecoding.setDisplay(e.getExplntnOfBnftPymntTypCdgDsply());
		}
		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftPymntTypCdgSys() != null) {
			explanationofbenefitpaymenttypecoding.setSystem(e.getExplntnOfBnftPymntTypCdgSys());
		}
		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftPymntTypCdgUsrSltd() != null) {
			explanationofbenefitpaymenttypecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftPymntTypCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftPymntTypCdgVrsn() != null) {
			explanationofbenefitpaymenttypecoding.setVersion(e.getExplntnOfBnftPymntTypCdgVrsn());
		}
		/******************** ExplntnOfBnft_Pymnt_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftPymntTypTxt() != null) {
			explanationofbenefitpaymenttype.setText(e.getExplntnOfBnftPymntTypTxt());
		}
		/******************** ExplntnOfBnft_PreAuthRef ********************************************************************************/
		if(e.getExplntnOfBnftPreAuthRef() != null) {
			explanationofbenefit.addPreAuthRef(e.getExplntnOfBnftPreAuthRef());
		}
		/******************** explanationofbenefitpreauthrefperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitpreauthrefperiod =  new org.hl7.fhir.r4.model.Period();
		explanationofbenefit.addPreAuthRefPeriod(explanationofbenefitpreauthrefperiod);

		/******************** ExplntnOfBnft_PreAuthRefPrd_End ********************************************************************************/
		if(e.getExplntnOfBnftPreAuthRefPrdEnd() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_PreAuthRefPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_PreAuthRefPrd_Enddate = ExplntnOfBnft_PreAuthRefPrd_Endsdf.parse(e.getExplntnOfBnftPreAuthRefPrdEnd());
			explanationofbenefitpreauthrefperiod.setEnd(ExplntnOfBnft_PreAuthRefPrd_Enddate);
		}
		/******************** ExplntnOfBnft_PreAuthRefPrd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftPreAuthRefPrdStrt() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_PreAuthRefPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_PreAuthRefPrd_Strtdate = ExplntnOfBnft_PreAuthRefPrd_Strtsdf.parse(e.getExplntnOfBnftPreAuthRefPrdStrt());
			explanationofbenefitpreauthrefperiod.setStart(ExplntnOfBnft_PreAuthRefPrd_Strtdate);
		}
		/******************** ExplntnOfBnft_Precedence ********************************************************************************/
		if(e.getExplntnOfBnftPrecedence() != null) {
			explanationofbenefit.setPrecedence(Integer.parseInt(e.getExplntnOfBnftPrecedence()));
		}
		/******************** ExplntnOfBnft_Prescription ********************************************************************************/
		if(e.getExplntnOfBnftPrescription() != null) {
			explanationofbenefit.setPrescription( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftPrescription()));
		}
		/******************** explanationofbenefitpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitpriority =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefit.setPriority(explanationofbenefitpriority);

		/******************** explanationofbenefitprioritycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitprioritycoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitpriority.addCoding(explanationofbenefitprioritycoding);

		/******************** ExplntnOfBnft_Priority_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftPriorityCdgCd() != null) {
			explanationofbenefitprioritycoding.setCode(e.getExplntnOfBnftPriorityCdgCd());
		}
		/******************** ExplntnOfBnft_Priority_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftPriorityCdgDsply() != null) {
			explanationofbenefitprioritycoding.setDisplay(e.getExplntnOfBnftPriorityCdgDsply());
		}
		/******************** ExplntnOfBnft_Priority_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftPriorityCdgSys() != null) {
			explanationofbenefitprioritycoding.setSystem(e.getExplntnOfBnftPriorityCdgSys());
		}
		/******************** ExplntnOfBnft_Priority_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftPriorityCdgUsrSltd() != null) {
			explanationofbenefitprioritycoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftPriorityCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Priority_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftPriorityCdgVrsn() != null) {
			explanationofbenefitprioritycoding.setVersion(e.getExplntnOfBnftPriorityCdgVrsn());
		}
		/******************** ExplntnOfBnft_Priority_Txt ********************************************************************************/
		if(e.getExplntnOfBnftPriorityTxt() != null) {
			explanationofbenefitpriority.setText(e.getExplntnOfBnftPriorityTxt());
		}
		/******************** explanationofbenefitprocedure ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.ProcedureComponent explanationofbenefitprocedure =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.ProcedureComponent();
		explanationofbenefit.addProcedure(explanationofbenefitprocedure);

		/******************** ExplntnOfBnft_Prcdr_Dt ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrDt() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_Prcdr_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_Prcdr_Dtdate = ExplntnOfBnft_Prcdr_Dtsdf.parse(e.getExplntnOfBnftPrcdrDt());
			explanationofbenefitprocedure.setDate(ExplntnOfBnft_Prcdr_Dtdate);
		}
		/******************** explanationofbenefitprocedureprocedurecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitprocedureprocedurecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitprocedure.setProcedure(explanationofbenefitprocedureprocedurecodeableconcept);

		/******************** explanationofbenefitprocedureprocedurecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitprocedureprocedurecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitprocedureprocedurecodeableconcept.addCoding(explanationofbenefitprocedureprocedurecodeableconceptcoding);

		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgCd() != null) {
			explanationofbenefitprocedureprocedurecodeableconceptcoding.setCode(e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgCd());
		}
		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgDsply() != null) {
			explanationofbenefitprocedureprocedurecodeableconceptcoding.setDisplay(e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgDsply());
		}
		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgSys() != null) {
			explanationofbenefitprocedureprocedurecodeableconceptcoding.setSystem(e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgSys());
		}
		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgUsrSltd() != null) {
			explanationofbenefitprocedureprocedurecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgVrsn() != null) {
			explanationofbenefitprocedureprocedurecodeableconceptcoding.setVersion(e.getExplntnOfBnftPrcdrPrcdrCdbleCncptCdgVrsn());
		}
		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Txt ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrPrcdrCdbleCncptTxt() != null) {
			explanationofbenefitprocedureprocedurecodeableconcept.setText(e.getExplntnOfBnftPrcdrPrcdrCdbleCncptTxt());
		}
		/******************** ExplntnOfBnft_Prcdr_PrcdrRfrnc ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrPrcdrRfrnc() != null) {
			explanationofbenefitprocedure.setProcedure( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftPrcdrPrcdrRfrnc()));
		}
		/******************** ExplntnOfBnft_Prcdr_Sqnc ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrSqnc() != null) {
			explanationofbenefitprocedure.setSequence(Integer.parseInt(e.getExplntnOfBnftPrcdrSqnc()));
		}
		/******************** explanationofbenefitproceduretype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitproceduretype =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitprocedure.addType(explanationofbenefitproceduretype);

		/******************** explanationofbenefitproceduretypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitproceduretypecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitproceduretype.addCoding(explanationofbenefitproceduretypecoding);

		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrTypCdgCd() != null) {
			explanationofbenefitproceduretypecoding.setCode(e.getExplntnOfBnftPrcdrTypCdgCd());
		}
		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrTypCdgDsply() != null) {
			explanationofbenefitproceduretypecoding.setDisplay(e.getExplntnOfBnftPrcdrTypCdgDsply());
		}
		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrTypCdgSys() != null) {
			explanationofbenefitproceduretypecoding.setSystem(e.getExplntnOfBnftPrcdrTypCdgSys());
		}
		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrTypCdgUsrSltd() != null) {
			explanationofbenefitproceduretypecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftPrcdrTypCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrTypCdgVrsn() != null) {
			explanationofbenefitproceduretypecoding.setVersion(e.getExplntnOfBnftPrcdrTypCdgVrsn());
		}
		/******************** ExplntnOfBnft_Prcdr_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrTypTxt() != null) {
			explanationofbenefitproceduretype.setText(e.getExplntnOfBnftPrcdrTypTxt());
		}
		/******************** ExplntnOfBnft_Prcdr_Udi ********************************************************************************/
		if(e.getExplntnOfBnftPrcdrUdi() != null) {
			explanationofbenefitprocedure.addUdi( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftPrcdrUdi()));
		}
		/******************** explanationofbenefitprocessnote ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.NoteComponent explanationofbenefitprocessnote =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.NoteComponent();
		explanationofbenefit.addProcessNote(explanationofbenefitprocessnote);

		/******************** explanationofbenefitprocessnotelanguage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitprocessnotelanguage =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitprocessnote.setLanguage(explanationofbenefitprocessnotelanguage);

		/******************** explanationofbenefitprocessnotelanguagecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitprocessnotelanguagecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitprocessnotelanguage.addCoding(explanationofbenefitprocessnotelanguagecoding);

		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftProcessNtLnguageCdgCd() != null) {
			explanationofbenefitprocessnotelanguagecoding.setCode(e.getExplntnOfBnftProcessNtLnguageCdgCd());
		}
		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftProcessNtLnguageCdgDsply() != null) {
			explanationofbenefitprocessnotelanguagecoding.setDisplay(e.getExplntnOfBnftProcessNtLnguageCdgDsply());
		}
		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftProcessNtLnguageCdgSys() != null) {
			explanationofbenefitprocessnotelanguagecoding.setSystem(e.getExplntnOfBnftProcessNtLnguageCdgSys());
		}
		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftProcessNtLnguageCdgUsrSltd() != null) {
			explanationofbenefitprocessnotelanguagecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftProcessNtLnguageCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftProcessNtLnguageCdgVrsn() != null) {
			explanationofbenefitprocessnotelanguagecoding.setVersion(e.getExplntnOfBnftProcessNtLnguageCdgVrsn());
		}
		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Txt ********************************************************************************/
		if(e.getExplntnOfBnftProcessNtLnguageTxt() != null) {
			explanationofbenefitprocessnotelanguage.setText(e.getExplntnOfBnftProcessNtLnguageTxt());
		}
		/******************** ExplntnOfBnft_ProcessNt_Nmbr ********************************************************************************/
		if(e.getExplntnOfBnftProcessNtNmbr() != null) {
			explanationofbenefitprocessnote.setNumber(Integer.parseInt(e.getExplntnOfBnftProcessNtNmbr()));
		}
		/******************** ExplntnOfBnft_ProcessNt_Txt ********************************************************************************/
		if(e.getExplntnOfBnftProcessNtTxt() != null) {
			explanationofbenefitprocessnote.setText(e.getExplntnOfBnftProcessNtTxt());
		}
		/******************** explanationofbenefitprocessnotetype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.NoteTypeEnumFactory explanationofbenefitprocessnotetype =  new org.hl7.fhir.r4.model.Enumerations.NoteTypeEnumFactory();
		explanationofbenefitprocessnote.setType(explanationofbenefitprocessnotetype.fromCode(e.getExplntnOfBnftProcessNtTyp()));

		/******************** ExplntnOfBnft_Provider ********************************************************************************/
		if(e.getExplntnOfBnftProvider() != null) {
			explanationofbenefit.setProvider( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftProvider()));
		}
		/******************** ExplntnOfBnft_Referral ********************************************************************************/
		if(e.getExplntnOfBnftReferral() != null) {
			explanationofbenefit.setReferral( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftReferral()));
		}
		/******************** explanationofbenefitrelated ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.RelatedClaimComponent explanationofbenefitrelated =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.RelatedClaimComponent();
		explanationofbenefit.addRelated(explanationofbenefitrelated);

		/******************** ExplntnOfBnft_Rlted_Clm ********************************************************************************/
		if(e.getExplntnOfBnftRltedClm() != null) {
			explanationofbenefitrelated.setClaim( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftRltedClm()));
		}
		/******************** explanationofbenefitrelatedreference ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier explanationofbenefitrelatedreference =  new org.hl7.fhir.r4.model.Identifier();
		explanationofbenefitrelated.setReference(explanationofbenefitrelatedreference);

		/******************** ExplntnOfBnft_Rlted_Rfrnc_Assigner ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncAssigner() != null) {
			explanationofbenefitrelatedreference.setAssigner( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftRltedRfrncAssigner()));
		}
		/******************** explanationofbenefitrelatedreferenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitrelatedreferenceperiod =  new org.hl7.fhir.r4.model.Period();
		explanationofbenefitrelatedreference.setPeriod(explanationofbenefitrelatedreferenceperiod);

		/******************** ExplntnOfBnft_Rlted_Rfrnc_Prd_End ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncPrdEnd() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_Rlted_Rfrnc_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_Rlted_Rfrnc_Prd_Enddate = ExplntnOfBnft_Rlted_Rfrnc_Prd_Endsdf.parse(e.getExplntnOfBnftRltedRfrncPrdEnd());
			explanationofbenefitrelatedreferenceperiod.setEnd(ExplntnOfBnft_Rlted_Rfrnc_Prd_Enddate);
		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Prd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncPrdStrt() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_Rlted_Rfrnc_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_Rlted_Rfrnc_Prd_Strtdate = ExplntnOfBnft_Rlted_Rfrnc_Prd_Strtsdf.parse(e.getExplntnOfBnftRltedRfrncPrdStrt());
			explanationofbenefitrelatedreferenceperiod.setStart(ExplntnOfBnft_Rlted_Rfrnc_Prd_Strtdate);
		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Sys ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncSys() != null) {
			explanationofbenefitrelatedreference.setSystem(e.getExplntnOfBnftRltedRfrncSys());
		}
		/******************** explanationofbenefitrelatedreferencetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitrelatedreferencetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitrelatedreference.setType(explanationofbenefitrelatedreferencetype);

		/******************** explanationofbenefitrelatedreferencetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitrelatedreferencetypecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitrelatedreferencetype.addCoding(explanationofbenefitrelatedreferencetypecoding);

		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncTypCdgCd() != null) {
			explanationofbenefitrelatedreferencetypecoding.setCode(e.getExplntnOfBnftRltedRfrncTypCdgCd());
		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncTypCdgDsply() != null) {
			explanationofbenefitrelatedreferencetypecoding.setDisplay(e.getExplntnOfBnftRltedRfrncTypCdgDsply());
		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncTypCdgSys() != null) {
			explanationofbenefitrelatedreferencetypecoding.setSystem(e.getExplntnOfBnftRltedRfrncTypCdgSys());
		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncTypCdgUsrSltd() != null) {
			explanationofbenefitrelatedreferencetypecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftRltedRfrncTypCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncTypCdgVrsn() != null) {
			explanationofbenefitrelatedreferencetypecoding.setVersion(e.getExplntnOfBnftRltedRfrncTypCdgVrsn());
		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncTypTxt() != null) {
			explanationofbenefitrelatedreferencetype.setText(e.getExplntnOfBnftRltedRfrncTypTxt());
		}
		/******************** explanationofbenefitrelatedreferenceuse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory explanationofbenefitrelatedreferenceuse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		explanationofbenefitrelatedreference.setUse(explanationofbenefitrelatedreferenceuse.fromCode(e.getExplntnOfBnftRltedRfrncUse()));

		/******************** ExplntnOfBnft_Rlted_Rfrnc_Vl ********************************************************************************/
		if(e.getExplntnOfBnftRltedRfrncVl() != null) {
			explanationofbenefitrelatedreference.setValue(e.getExplntnOfBnftRltedRfrncVl());
		}
		/******************** explanationofbenefitrelatedrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitrelatedrelationship =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitrelated.setRelationship(explanationofbenefitrelatedrelationship);

		/******************** explanationofbenefitrelatedrelationshipcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitrelatedrelationshipcoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitrelatedrelationship.addCoding(explanationofbenefitrelatedrelationshipcoding);

		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftRltedRltnshipCdgCd() != null) {
			explanationofbenefitrelatedrelationshipcoding.setCode(e.getExplntnOfBnftRltedRltnshipCdgCd());
		}
		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftRltedRltnshipCdgDsply() != null) {
			explanationofbenefitrelatedrelationshipcoding.setDisplay(e.getExplntnOfBnftRltedRltnshipCdgDsply());
		}
		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftRltedRltnshipCdgSys() != null) {
			explanationofbenefitrelatedrelationshipcoding.setSystem(e.getExplntnOfBnftRltedRltnshipCdgSys());
		}
		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftRltedRltnshipCdgUsrSltd() != null) {
			explanationofbenefitrelatedrelationshipcoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftRltedRltnshipCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftRltedRltnshipCdgVrsn() != null) {
			explanationofbenefitrelatedrelationshipcoding.setVersion(e.getExplntnOfBnftRltedRltnshipCdgVrsn());
		}
		/******************** ExplntnOfBnft_Rlted_Rltnship_Txt ********************************************************************************/
		if(e.getExplntnOfBnftRltedRltnshipTxt() != null) {
			explanationofbenefitrelatedrelationship.setText(e.getExplntnOfBnftRltedRltnshipTxt());
		}
		/******************** explanationofbenefitstatus ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.ExplanationOfBenefitStatusEnumFactory explanationofbenefitstatus =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.ExplanationOfBenefitStatusEnumFactory();
		explanationofbenefit.setStatus(explanationofbenefitstatus.fromCode(e.getExplntnOfBnftSts()));

		/******************** explanationofbenefitsubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitsubtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefit.setSubType(explanationofbenefitsubtype);

		/******************** explanationofbenefitsubtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitsubtypecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitsubtype.addCoding(explanationofbenefitsubtypecoding);

		/******************** ExplntnOfBnft_SubTyp_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftSubTypCdgCd() != null) {
			explanationofbenefitsubtypecoding.setCode(e.getExplntnOfBnftSubTypCdgCd());
		}
		/******************** ExplntnOfBnft_SubTyp_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftSubTypCdgDsply() != null) {
			explanationofbenefitsubtypecoding.setDisplay(e.getExplntnOfBnftSubTypCdgDsply());
		}
		/******************** ExplntnOfBnft_SubTyp_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftSubTypCdgSys() != null) {
			explanationofbenefitsubtypecoding.setSystem(e.getExplntnOfBnftSubTypCdgSys());
		}
		/******************** ExplntnOfBnft_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftSubTypCdgUsrSltd() != null) {
			explanationofbenefitsubtypecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftSubTypCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftSubTypCdgVrsn() != null) {
			explanationofbenefitsubtypecoding.setVersion(e.getExplntnOfBnftSubTypCdgVrsn());
		}
		/******************** ExplntnOfBnft_SubTyp_Txt ********************************************************************************/
		if(e.getExplntnOfBnftSubTypTxt() != null) {
			explanationofbenefitsubtype.setText(e.getExplntnOfBnftSubTypTxt());
		}
		/******************** explanationofbenefitsupportinginfo ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.SupportingInformationComponent explanationofbenefitsupportinginfo =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.SupportingInformationComponent();
		explanationofbenefit.addSupportingInfo(explanationofbenefitsupportinginfo);

		/******************** explanationofbenefitsupportinginfocategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitsupportinginfocategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitsupportinginfo.setCategory(explanationofbenefitsupportinginfocategory);

		/******************** explanationofbenefitsupportinginfocategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitsupportinginfocategorycoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitsupportinginfocategory.addCoding(explanationofbenefitsupportinginfocategorycoding);

		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCtgryCdgCd() != null) {
			explanationofbenefitsupportinginfocategorycoding.setCode(e.getExplntnOfBnftSprtingInfoCtgryCdgCd());
		}
		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCtgryCdgDsply() != null) {
			explanationofbenefitsupportinginfocategorycoding.setDisplay(e.getExplntnOfBnftSprtingInfoCtgryCdgDsply());
		}
		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCtgryCdgSys() != null) {
			explanationofbenefitsupportinginfocategorycoding.setSystem(e.getExplntnOfBnftSprtingInfoCtgryCdgSys());
		}
		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCtgryCdgUsrSltd() != null) {
			explanationofbenefitsupportinginfocategorycoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftSprtingInfoCtgryCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCtgryCdgVrsn() != null) {
			explanationofbenefitsupportinginfocategorycoding.setVersion(e.getExplntnOfBnftSprtingInfoCtgryCdgVrsn());
		}
		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCtgryTxt() != null) {
			explanationofbenefitsupportinginfocategory.setText(e.getExplntnOfBnftSprtingInfoCtgryTxt());
		}
		/******************** explanationofbenefitsupportinginfocode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitsupportinginfocode =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefitsupportinginfo.setCode(explanationofbenefitsupportinginfocode);

		/******************** explanationofbenefitsupportinginfocodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitsupportinginfocodecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitsupportinginfocode.addCoding(explanationofbenefitsupportinginfocodecoding);

		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCdCdgCd() != null) {
			explanationofbenefitsupportinginfocodecoding.setCode(e.getExplntnOfBnftSprtingInfoCdCdgCd());
		}
		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCdCdgDsply() != null) {
			explanationofbenefitsupportinginfocodecoding.setDisplay(e.getExplntnOfBnftSprtingInfoCdCdgDsply());
		}
		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCdCdgSys() != null) {
			explanationofbenefitsupportinginfocodecoding.setSystem(e.getExplntnOfBnftSprtingInfoCdCdgSys());
		}
		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCdCdgUsrSltd() != null) {
			explanationofbenefitsupportinginfocodecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftSprtingInfoCdCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCdCdgVrsn() != null) {
			explanationofbenefitsupportinginfocodecoding.setVersion(e.getExplntnOfBnftSprtingInfoCdCdgVrsn());
		}
		/******************** ExplntnOfBnft_SprtingInfo_Cd_Txt ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoCdTxt() != null) {
			explanationofbenefitsupportinginfocode.setText(e.getExplntnOfBnftSprtingInfoCdTxt());
		}
		/******************** explanationofbenefitsupportinginforeason ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitsupportinginforeason =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefitsupportinginfo.setReason(explanationofbenefitsupportinginforeason);

		/******************** ExplntnOfBnft_SprtingInfo_Rsn_Cd ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoRsnCd() != null) {
			explanationofbenefitsupportinginforeason.setCode(e.getExplntnOfBnftSprtingInfoRsnCd());
		}
		/******************** ExplntnOfBnft_SprtingInfo_Rsn_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoRsnDsply() != null) {
			explanationofbenefitsupportinginforeason.setDisplay(e.getExplntnOfBnftSprtingInfoRsnDsply());
		}
		/******************** ExplntnOfBnft_SprtingInfo_Rsn_Sys ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoRsnSys() != null) {
			explanationofbenefitsupportinginforeason.setSystem(e.getExplntnOfBnftSprtingInfoRsnSys());
		}
		/******************** ExplntnOfBnft_SprtingInfo_Rsn_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoRsnUsrSltd() != null) {
			explanationofbenefitsupportinginforeason.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftSprtingInfoRsnUsrSltd()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_Rsn_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoRsnVrsn() != null) {
			explanationofbenefitsupportinginforeason.setVersion(e.getExplntnOfBnftSprtingInfoRsnVrsn());
		}
		/******************** ExplntnOfBnft_SprtingInfo_Sqnc ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoSqnc() != null) {
			explanationofbenefitsupportinginfo.setSequence(Integer.parseInt(e.getExplntnOfBnftSprtingInfoSqnc()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_TmgDtTyp ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoTmgDtTyp() != null) {
			explanationofbenefitsupportinginfo.setTiming( new org.hl7.fhir.r4.model.DateType(e.getExplntnOfBnftSprtingInfoTmgDtTyp()));
		}
		/******************** explanationofbenefitsupportinginfotimingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitsupportinginfotimingperiod =  new org.hl7.fhir.r4.model.Period();
		explanationofbenefitsupportinginfo.setTiming(explanationofbenefitsupportinginfotimingperiod);

		/******************** ExplntnOfBnft_SprtingInfo_TmgPrd_End ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoTmgPrdEnd() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_SprtingInfo_TmgPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_SprtingInfo_TmgPrd_Enddate = ExplntnOfBnft_SprtingInfo_TmgPrd_Endsdf.parse(e.getExplntnOfBnftSprtingInfoTmgPrdEnd());
			explanationofbenefitsupportinginfotimingperiod.setEnd(ExplntnOfBnft_SprtingInfo_TmgPrd_Enddate);
		}
		/******************** ExplntnOfBnft_SprtingInfo_TmgPrd_Strt ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoTmgPrdStrt() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_SprtingInfo_TmgPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_SprtingInfo_TmgPrd_Strtdate = ExplntnOfBnft_SprtingInfo_TmgPrd_Strtsdf.parse(e.getExplntnOfBnftSprtingInfoTmgPrdStrt());
			explanationofbenefitsupportinginfotimingperiod.setStart(ExplntnOfBnft_SprtingInfo_TmgPrd_Strtdate);
		}
		/******************** explanationofbenefitsupportinginfovalueattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment explanationofbenefitsupportinginfovalueattachment =  new org.hl7.fhir.r4.model.Attachment();
		explanationofbenefitsupportinginfo.setValue(explanationofbenefitsupportinginfovalueattachment);

		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_CntntTyp ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlAttchmntCntntTyp() != null) {
			explanationofbenefitsupportinginfovalueattachment.setContentType(e.getExplntnOfBnftSprtingInfoVlAttchmntCntntTyp());
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Creation ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlAttchmntCreation() != null) {
			java.text.SimpleDateFormat ExplntnOfBnft_SprtingInfo_VlAttchmnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ExplntnOfBnft_SprtingInfo_VlAttchmnt_Creationdate = ExplntnOfBnft_SprtingInfo_VlAttchmnt_Creationsdf.parse(e.getExplntnOfBnftSprtingInfoVlAttchmntCreation());
			explanationofbenefitsupportinginfovalueattachment.setCreation(ExplntnOfBnft_SprtingInfo_VlAttchmnt_Creationdate);
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Data ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlAttchmntData() != null) {
			explanationofbenefitsupportinginfovalueattachment.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(e.getExplntnOfBnftSprtingInfoVlAttchmntData()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Hash ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlAttchmntHash() != null) {
			explanationofbenefitsupportinginfovalueattachment.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(e.getExplntnOfBnftSprtingInfoVlAttchmntHash()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Lnguage ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlAttchmntLnguage() != null) {
			explanationofbenefitsupportinginfovalueattachment.setLanguage(e.getExplntnOfBnftSprtingInfoVlAttchmntLnguage());
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Sz ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlAttchmntSz() != null) {
			explanationofbenefitsupportinginfovalueattachment.setSize(Integer.parseInt(e.getExplntnOfBnftSprtingInfoVlAttchmntSz()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Ttl ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlAttchmntTtl() != null) {
			explanationofbenefitsupportinginfovalueattachment.setTitle(e.getExplntnOfBnftSprtingInfoVlAttchmntTtl());
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Url ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlAttchmntUrl() != null) {
			explanationofbenefitsupportinginfovalueattachment.setUrl(e.getExplntnOfBnftSprtingInfoVlAttchmntUrl());
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlBooleanTyp ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlBooleanTyp() != null) {
			explanationofbenefitsupportinginfo.setValue( new org.hl7.fhir.r4.model.BooleanType(e.getExplntnOfBnftSprtingInfoVlBooleanTyp()));
		}
		/******************** explanationofbenefitsupportinginfovaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefitsupportinginfovaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		explanationofbenefitsupportinginfo.setValue(explanationofbenefitsupportinginfovaluequantity);

		/******************** ExplntnOfBnft_SprtingInfo_VlQnty_Cd ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlQntyCd() != null) {
			explanationofbenefitsupportinginfovaluequantity.setCode(e.getExplntnOfBnftSprtingInfoVlQntyCd());
		}
		/******************** explanationofbenefitsupportinginfovaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory explanationofbenefitsupportinginfovaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		explanationofbenefitsupportinginfovaluequantity.setComparator(explanationofbenefitsupportinginfovaluequantitycomparator.fromCode(e.getExplntnOfBnftSprtingInfoVlQntyCmprtr()));

		/******************** ExplntnOfBnft_SprtingInfo_VlQnty_Sys ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlQntySys() != null) {
			explanationofbenefitsupportinginfovaluequantity.setSystem(e.getExplntnOfBnftSprtingInfoVlQntySys());
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlQnty_Unt ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlQntyUnt() != null) {
			explanationofbenefitsupportinginfovaluequantity.setUnit(e.getExplntnOfBnftSprtingInfoVlQntyUnt());
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlQnty_Vl ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlQntyVl() != null) {
			explanationofbenefitsupportinginfovaluequantity.setValue(Double.parseDouble((e.getExplntnOfBnftSprtingInfoVlQntyVl())));
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlRfrnc ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlRfrnc() != null) {
			explanationofbenefitsupportinginfo.setValue( new org.hl7.fhir.r4.model.Reference(e.getExplntnOfBnftSprtingInfoVlRfrnc()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlStrgTyp ********************************************************************************/
		if(e.getExplntnOfBnftSprtingInfoVlStrgTyp() != null) {
			explanationofbenefitsupportinginfo.setValue( new org.hl7.fhir.r4.model.StringType(e.getExplntnOfBnftSprtingInfoVlStrgTyp()));
		}
		/******************** explanationofbenefittotal ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.TotalComponent explanationofbenefittotal =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.TotalComponent();
		explanationofbenefit.addTotal(explanationofbenefittotal);

		/******************** explanationofbenefittotalamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefittotalamount =  new org.hl7.fhir.r4.model.Money();
		explanationofbenefittotal.setAmount(explanationofbenefittotalamount);

		/******************** ExplntnOfBnft_Total_Amnt_Crncy ********************************************************************************/
		if(e.getExplntnOfBnftTotalAmntCrncy() != null) {
			explanationofbenefittotalamount.setCurrency(e.getExplntnOfBnftTotalAmntCrncy());
		}
		/******************** ExplntnOfBnft_Total_Amnt_Vl ********************************************************************************/
		if(e.getExplntnOfBnftTotalAmntVl() != null) {
			explanationofbenefittotalamount.setValue(Double.parseDouble((e.getExplntnOfBnftTotalAmntVl())));
		}
		/******************** explanationofbenefittotalcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefittotalcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefittotal.setCategory(explanationofbenefittotalcategory);

		/******************** explanationofbenefittotalcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefittotalcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefittotalcategory.addCoding(explanationofbenefittotalcategorycoding);

		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftTotalCtgryCdgCd() != null) {
			explanationofbenefittotalcategorycoding.setCode(e.getExplntnOfBnftTotalCtgryCdgCd());
		}
		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftTotalCtgryCdgDsply() != null) {
			explanationofbenefittotalcategorycoding.setDisplay(e.getExplntnOfBnftTotalCtgryCdgDsply());
		}
		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftTotalCtgryCdgSys() != null) {
			explanationofbenefittotalcategorycoding.setSystem(e.getExplntnOfBnftTotalCtgryCdgSys());
		}
		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftTotalCtgryCdgUsrSltd() != null) {
			explanationofbenefittotalcategorycoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftTotalCtgryCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftTotalCtgryCdgVrsn() != null) {
			explanationofbenefittotalcategorycoding.setVersion(e.getExplntnOfBnftTotalCtgryCdgVrsn());
		}
		/******************** ExplntnOfBnft_Total_Ctgry_Txt ********************************************************************************/
		if(e.getExplntnOfBnftTotalCtgryTxt() != null) {
			explanationofbenefittotalcategory.setText(e.getExplntnOfBnftTotalCtgryTxt());
		}
		/******************** explanationofbenefittype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefittype =  new org.hl7.fhir.r4.model.CodeableConcept();
		explanationofbenefit.setType(explanationofbenefittype);

		/******************** explanationofbenefittypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefittypecoding =  new org.hl7.fhir.r4.model.Coding();
		explanationofbenefittype.addCoding(explanationofbenefittypecoding);

		/******************** ExplntnOfBnft_Typ_Cdg_Cd ********************************************************************************/
		if(e.getExplntnOfBnftTypCdgCd() != null) {
			explanationofbenefittypecoding.setCode(e.getExplntnOfBnftTypCdgCd());
		}
		/******************** ExplntnOfBnft_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getExplntnOfBnftTypCdgDsply() != null) {
			explanationofbenefittypecoding.setDisplay(e.getExplntnOfBnftTypCdgDsply());
		}
		/******************** ExplntnOfBnft_Typ_Cdg_Sys ********************************************************************************/
		if(e.getExplntnOfBnftTypCdgSys() != null) {
			explanationofbenefittypecoding.setSystem(e.getExplntnOfBnftTypCdgSys());
		}
		/******************** ExplntnOfBnft_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getExplntnOfBnftTypCdgUsrSltd() != null) {
			explanationofbenefittypecoding.setUserSelected(Boolean.parseBoolean(e.getExplntnOfBnftTypCdgUsrSltd()));
		}
		/******************** ExplntnOfBnft_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getExplntnOfBnftTypCdgVrsn() != null) {
			explanationofbenefittypecoding.setVersion(e.getExplntnOfBnftTypCdgVrsn());
		}
		/******************** ExplntnOfBnft_Typ_Txt ********************************************************************************/
		if(e.getExplntnOfBnftTypTxt() != null) {
			explanationofbenefittype.setText(e.getExplntnOfBnftTypTxt());
		}
		/******************** explanationofbenefituse ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.UseEnumFactory explanationofbenefituse =  new org.hl7.fhir.r4.model.ExplanationOfBenefit.UseEnumFactory();
		explanationofbenefit.setUse(explanationofbenefituse.fromCode(e.getExplntnOfBnftUse()));

		return explanationofbenefit;
	}
}
