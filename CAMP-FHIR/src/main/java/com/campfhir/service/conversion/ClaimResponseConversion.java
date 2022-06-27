package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ClaimResponse;
public class ClaimResponseConversion 
{
	public org.hl7.fhir.r4.model.ClaimResponse ClaimResponses(ClaimResponse c) throws ParseException
	{
		org.hl7.fhir.r4.model.ClaimResponse claimresponse = new org.hl7.fhir.r4.model.ClaimResponse();

		/******************** id ********************************************************************************/
		claimresponse.setId(c.getId());

		/******************** claimresponseadditem ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AddedItemComponent claimresponseadditem =  new org.hl7.fhir.r4.model.ClaimResponse.AddedItemComponent();
		claimresponse.addAddItem(claimresponseadditem);

		/******************** claimresponseadditemadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent claimresponseadditemadjudication =  new org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent();
		claimresponseadditem.addAdjudication(claimresponseadditemadjudication);

		/******************** claimresponseadditemadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemadjudicationamount =  new org.hl7.fhir.r4.model.Money();
		claimresponseadditemadjudication.setAmount(claimresponseadditemadjudicationamount);

		/******************** ClmRsps_AddItm_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnAmntCrncy() != null) {
			claimresponseadditemadjudicationamount.setCurrency(c.getClmRspsAddItmAdjdctnAmntCrncy());
		}
		/******************** ClmRsps_AddItm_Adjdctn_Amnt_Vl ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnAmntVl() != null) {
			claimresponseadditemadjudicationamount.setValue(Double.parseDouble((c.getClmRspsAddItmAdjdctnAmntVl())));
		}
		/******************** claimresponseadditemadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemadjudicationcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseadditemadjudication.setCategory(claimresponseadditemadjudicationcategory);

		/******************** claimresponseadditemadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemadjudicationcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseadditemadjudicationcategory.addCoding(claimresponseadditemadjudicationcategorycoding);

		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnCtgryCdgCd() != null) {
			claimresponseadditemadjudicationcategorycoding.setCode(c.getClmRspsAddItmAdjdctnCtgryCdgCd());
		}
		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnCtgryCdgDsply() != null) {
			claimresponseadditemadjudicationcategorycoding.setDisplay(c.getClmRspsAddItmAdjdctnCtgryCdgDsply());
		}
		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnCtgryCdgSys() != null) {
			claimresponseadditemadjudicationcategorycoding.setSystem(c.getClmRspsAddItmAdjdctnCtgryCdgSys());
		}
		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnCtgryCdgUsrSltd() != null) {
			claimresponseadditemadjudicationcategorycoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsAddItmAdjdctnCtgryCdgUsrSltd()));
		}
		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnCtgryCdgVrsn() != null) {
			claimresponseadditemadjudicationcategorycoding.setVersion(c.getClmRspsAddItmAdjdctnCtgryCdgVrsn());
		}
		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnCtgryTxt() != null) {
			claimresponseadditemadjudicationcategory.setText(c.getClmRspsAddItmAdjdctnCtgryTxt());
		}
		/******************** claimresponseadditemadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemadjudicationreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseadditemadjudication.setReason(claimresponseadditemadjudicationreason);

		/******************** claimresponseadditemadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemadjudicationreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseadditemadjudicationreason.addCoding(claimresponseadditemadjudicationreasoncoding);

		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnRsnCdgCd() != null) {
			claimresponseadditemadjudicationreasoncoding.setCode(c.getClmRspsAddItmAdjdctnRsnCdgCd());
		}
		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnRsnCdgDsply() != null) {
			claimresponseadditemadjudicationreasoncoding.setDisplay(c.getClmRspsAddItmAdjdctnRsnCdgDsply());
		}
		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnRsnCdgSys() != null) {
			claimresponseadditemadjudicationreasoncoding.setSystem(c.getClmRspsAddItmAdjdctnRsnCdgSys());
		}
		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnRsnCdgUsrSltd() != null) {
			claimresponseadditemadjudicationreasoncoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsAddItmAdjdctnRsnCdgUsrSltd()));
		}
		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnRsnCdgVrsn() != null) {
			claimresponseadditemadjudicationreasoncoding.setVersion(c.getClmRspsAddItmAdjdctnRsnCdgVrsn());
		}
		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Txt ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnRsnTxt() != null) {
			claimresponseadditemadjudicationreason.setText(c.getClmRspsAddItmAdjdctnRsnTxt());
		}
		/******************** ClmRsps_AddItm_Adjdctn_Vl ********************************************************************************/
		if(c.getClmRspsAddItmAdjdctnVl() != null) {
			claimresponseadditemadjudication.setValue(Double.parseDouble((c.getClmRspsAddItmAdjdctnVl())));
		}
		/******************** claimresponseadditembodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditembodysite =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseadditem.setBodySite(claimresponseadditembodysite);

		/******************** claimresponseadditembodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditembodysitecoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseadditembodysite.addCoding(claimresponseadditembodysitecoding);

		/******************** ClmRsps_AddItm_BodySite_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmBodySiteCdgCd() != null) {
			claimresponseadditembodysitecoding.setCode(c.getClmRspsAddItmBodySiteCdgCd());
		}
		/******************** ClmRsps_AddItm_BodySite_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmBodySiteCdgDsply() != null) {
			claimresponseadditembodysitecoding.setDisplay(c.getClmRspsAddItmBodySiteCdgDsply());
		}
		/******************** ClmRsps_AddItm_BodySite_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmBodySiteCdgSys() != null) {
			claimresponseadditembodysitecoding.setSystem(c.getClmRspsAddItmBodySiteCdgSys());
		}
		/******************** ClmRsps_AddItm_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmBodySiteCdgUsrSltd() != null) {
			claimresponseadditembodysitecoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsAddItmBodySiteCdgUsrSltd()));
		}
		/******************** ClmRsps_AddItm_BodySite_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmBodySiteCdgVrsn() != null) {
			claimresponseadditembodysitecoding.setVersion(c.getClmRspsAddItmBodySiteCdgVrsn());
		}
		/******************** ClmRsps_AddItm_BodySite_Txt ********************************************************************************/
		if(c.getClmRspsAddItmBodySiteTxt() != null) {
			claimresponseadditembodysite.setText(c.getClmRspsAddItmBodySiteTxt());
		}
		/******************** claimresponseadditemdetail ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AddedItemDetailComponent claimresponseadditemdetail =  new org.hl7.fhir.r4.model.ClaimResponse.AddedItemDetailComponent();
		claimresponseadditem.addDetail(claimresponseadditemdetail);

		/******************** claimresponseadditemdetailadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent claimresponseadditemdetailadjudication =  new org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent();
		claimresponseadditemdetail.addAdjudication(claimresponseadditemdetailadjudication);

		/******************** claimresponseadditemdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemdetailadjudicationamount =  new org.hl7.fhir.r4.model.Money();
		claimresponseadditemdetailadjudication.setAmount(claimresponseadditemdetailadjudicationamount);

		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnAmntCrncy() != null) {
			claimresponseadditemdetailadjudicationamount.setCurrency(c.getClmRspsAddItmDtlAdjdctnAmntCrncy());
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnAmntVl() != null) {
			claimresponseadditemdetailadjudicationamount.setValue(Double.parseDouble((c.getClmRspsAddItmDtlAdjdctnAmntVl())));
		}
		/******************** claimresponseadditemdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailadjudicationcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseadditemdetailadjudication.setCategory(claimresponseadditemdetailadjudicationcategory);

		/******************** claimresponseadditemdetailadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemdetailadjudicationcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseadditemdetailadjudicationcategory.addCoding(claimresponseadditemdetailadjudicationcategorycoding);

		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnCtgryCdgCd() != null) {
			claimresponseadditemdetailadjudicationcategorycoding.setCode(c.getClmRspsAddItmDtlAdjdctnCtgryCdgCd());
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnCtgryCdgDsply() != null) {
			claimresponseadditemdetailadjudicationcategorycoding.setDisplay(c.getClmRspsAddItmDtlAdjdctnCtgryCdgDsply());
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnCtgryCdgSys() != null) {
			claimresponseadditemdetailadjudicationcategorycoding.setSystem(c.getClmRspsAddItmDtlAdjdctnCtgryCdgSys());
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnCtgryCdgUsrSltd() != null) {
			claimresponseadditemdetailadjudicationcategorycoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsAddItmDtlAdjdctnCtgryCdgUsrSltd()));
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnCtgryCdgVrsn() != null) {
			claimresponseadditemdetailadjudicationcategorycoding.setVersion(c.getClmRspsAddItmDtlAdjdctnCtgryCdgVrsn());
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnCtgryTxt() != null) {
			claimresponseadditemdetailadjudicationcategory.setText(c.getClmRspsAddItmDtlAdjdctnCtgryTxt());
		}
		/******************** claimresponseadditemdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailadjudicationreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseadditemdetailadjudication.setReason(claimresponseadditemdetailadjudicationreason);

		/******************** claimresponseadditemdetailadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemdetailadjudicationreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseadditemdetailadjudicationreason.addCoding(claimresponseadditemdetailadjudicationreasoncoding);

		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnRsnCdgCd() != null) {
			claimresponseadditemdetailadjudicationreasoncoding.setCode(c.getClmRspsAddItmDtlAdjdctnRsnCdgCd());
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnRsnCdgDsply() != null) {
			claimresponseadditemdetailadjudicationreasoncoding.setDisplay(c.getClmRspsAddItmDtlAdjdctnRsnCdgDsply());
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnRsnCdgSys() != null) {
			claimresponseadditemdetailadjudicationreasoncoding.setSystem(c.getClmRspsAddItmDtlAdjdctnRsnCdgSys());
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnRsnCdgUsrSltd() != null) {
			claimresponseadditemdetailadjudicationreasoncoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsAddItmDtlAdjdctnRsnCdgUsrSltd()));
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnRsnCdgVrsn() != null) {
			claimresponseadditemdetailadjudicationreasoncoding.setVersion(c.getClmRspsAddItmDtlAdjdctnRsnCdgVrsn());
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnRsnTxt() != null) {
			claimresponseadditemdetailadjudicationreason.setText(c.getClmRspsAddItmDtlAdjdctnRsnTxt());
		}
		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlAdjdctnVl() != null) {
			claimresponseadditemdetailadjudication.setValue(Double.parseDouble((c.getClmRspsAddItmDtlAdjdctnVl())));
		}
		/******************** ClmRsps_AddItm_Dtl_Factor ********************************************************************************/
		if(c.getClmRspsAddItmDtlFactor() != null) {
			claimresponseadditemdetail.setFactor(Double.parseDouble((c.getClmRspsAddItmDtlFactor())));
		}
		/******************** claimresponseadditemdetailmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailmodifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseadditemdetail.addModifier(claimresponseadditemdetailmodifier);

		/******************** claimresponseadditemdetailmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemdetailmodifiercoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseadditemdetailmodifier.addCoding(claimresponseadditemdetailmodifiercoding);

		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlMdfrCdgCd() != null) {
			claimresponseadditemdetailmodifiercoding.setCode(c.getClmRspsAddItmDtlMdfrCdgCd());
		}
		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmDtlMdfrCdgDsply() != null) {
			claimresponseadditemdetailmodifiercoding.setDisplay(c.getClmRspsAddItmDtlMdfrCdgDsply());
		}
		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlMdfrCdgSys() != null) {
			claimresponseadditemdetailmodifiercoding.setSystem(c.getClmRspsAddItmDtlMdfrCdgSys());
		}
		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmDtlMdfrCdgUsrSltd() != null) {
			claimresponseadditemdetailmodifiercoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsAddItmDtlMdfrCdgUsrSltd()));
		}
		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmDtlMdfrCdgVrsn() != null) {
			claimresponseadditemdetailmodifiercoding.setVersion(c.getClmRspsAddItmDtlMdfrCdgVrsn());
		}
		/******************** ClmRsps_AddItm_Dtl_Mdfr_Txt ********************************************************************************/
		if(c.getClmRspsAddItmDtlMdfrTxt() != null) {
			claimresponseadditemdetailmodifier.setText(c.getClmRspsAddItmDtlMdfrTxt());
		}
		/******************** claimresponseadditemdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemdetailnet =  new org.hl7.fhir.r4.model.Money();
		claimresponseadditemdetail.setNet(claimresponseadditemdetailnet);

		/******************** ClmRsps_AddItm_Dtl_Net_Crncy ********************************************************************************/
		if(c.getClmRspsAddItmDtlNetCrncy() != null) {
			claimresponseadditemdetailnet.setCurrency(c.getClmRspsAddItmDtlNetCrncy());
		}
		/******************** ClmRsps_AddItm_Dtl_Net_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlNetVl() != null) {
			claimresponseadditemdetailnet.setValue(Double.parseDouble((c.getClmRspsAddItmDtlNetVl())));
		}
		/******************** ClmRsps_AddItm_Dtl_NtNmbr ********************************************************************************/
		if(c.getClmRspsAddItmDtlNtNmbr() != null) {
			claimresponseadditemdetail.addNoteNumber(Integer.parseInt(c.getClmRspsAddItmDtlNtNmbr()));
		}
		/******************** claimresponseadditemdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailproductorservice =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseadditemdetail.setProductOrService(claimresponseadditemdetailproductorservice);

		/******************** claimresponseadditemdetailproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemdetailproductorservicecoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseadditemdetailproductorservice.addCoding(claimresponseadditemdetailproductorservicecoding);

		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlPrdctOrSrvCdgCd() != null) {
			claimresponseadditemdetailproductorservicecoding.setCode(c.getClmRspsAddItmDtlPrdctOrSrvCdgCd());
		}
		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmDtlPrdctOrSrvCdgDsply() != null) {
			claimresponseadditemdetailproductorservicecoding.setDisplay(c.getClmRspsAddItmDtlPrdctOrSrvCdgDsply());
		}
		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlPrdctOrSrvCdgSys() != null) {
			claimresponseadditemdetailproductorservicecoding.setSystem(c.getClmRspsAddItmDtlPrdctOrSrvCdgSys());
		}
		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmDtlPrdctOrSrvCdgUsrSltd() != null) {
			claimresponseadditemdetailproductorservicecoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsAddItmDtlPrdctOrSrvCdgUsrSltd()));
		}
		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmDtlPrdctOrSrvCdgVrsn() != null) {
			claimresponseadditemdetailproductorservicecoding.setVersion(c.getClmRspsAddItmDtlPrdctOrSrvCdgVrsn());
		}
		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Txt ********************************************************************************/
		if(c.getClmRspsAddItmDtlPrdctOrSrvTxt() != null) {
			claimresponseadditemdetailproductorservice.setText(c.getClmRspsAddItmDtlPrdctOrSrvTxt());
		}
		/******************** claimresponseadditemdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimresponseadditemdetailquantity =  new org.hl7.fhir.r4.model.Quantity();
		claimresponseadditemdetail.setQuantity(claimresponseadditemdetailquantity);

		/******************** ClmRsps_AddItm_Dtl_Qnty_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlQntyCd() != null) {
			claimresponseadditemdetailquantity.setCode(c.getClmRspsAddItmDtlQntyCd());
		}
		/******************** claimresponseadditemdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory claimresponseadditemdetailquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		claimresponseadditemdetailquantity.setComparator(claimresponseadditemdetailquantitycomparator.fromCode(c.getClmRspsAddItmDtlQntyCmprtr()));

		/******************** ClmRsps_AddItm_Dtl_Qnty_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlQntySys() != null) {
			claimresponseadditemdetailquantity.setSystem(c.getClmRspsAddItmDtlQntySys());
		}
		/******************** ClmRsps_AddItm_Dtl_Qnty_Unt ********************************************************************************/
		if(c.getClmRspsAddItmDtlQntyUnt() != null) {
			claimresponseadditemdetailquantity.setUnit(c.getClmRspsAddItmDtlQntyUnt());
		}
		/******************** ClmRsps_AddItm_Dtl_Qnty_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlQntyVl() != null) {
			claimresponseadditemdetailquantity.setValue(Double.parseDouble((c.getClmRspsAddItmDtlQntyVl())));
		}
		/******************** claimresponseadditemdetailsubdetail ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AddedItemSubDetailComponent claimresponseadditemdetailsubdetail =  new org.hl7.fhir.r4.model.ClaimResponse.AddedItemSubDetailComponent();
		claimresponseadditemdetail.addSubDetail(claimresponseadditemdetailsubdetail);

		/******************** claimresponseadditemdetailsubdetailadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent claimresponseadditemdetailsubdetailadjudication =  new org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent();
		claimresponseadditemdetailsubdetail.addAdjudication(claimresponseadditemdetailsubdetailadjudication);

		/******************** claimresponseadditemdetailsubdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemdetailsubdetailadjudicationamount =  new org.hl7.fhir.r4.model.Money();
		claimresponseadditemdetailsubdetailadjudication.setAmount(claimresponseadditemdetailsubdetailadjudicationamount);

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnAmntCrncy() != null) {
			claimresponseadditemdetailsubdetailadjudicationamount.setCurrency(c.getClmRspsAddItmDtlSubDtlAdjdctnAmntCrncy());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnAmntVl() != null) {
			claimresponseadditemdetailsubdetailadjudicationamount.setValue(Double.parseDouble((c.getClmRspsAddItmDtlSubDtlAdjdctnAmntVl())));
		}
		/******************** claimresponseadditemdetailsubdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailsubdetailadjudicationcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseadditemdetailsubdetailadjudication.setCategory(claimresponseadditemdetailsubdetailadjudicationcategory);

		/******************** claimresponseadditemdetailsubdetailadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemdetailsubdetailadjudicationcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseadditemdetailsubdetailadjudicationcategory.addCoding(claimresponseadditemdetailsubdetailadjudicationcategorycoding);

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgCd() != null) {
			claimresponseadditemdetailsubdetailadjudicationcategorycoding.setCode(c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgCd());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgDsply() != null) {
			claimresponseadditemdetailsubdetailadjudicationcategorycoding.setDisplay(c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgDsply());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgSys() != null) {
			claimresponseadditemdetailsubdetailadjudicationcategorycoding.setSystem(c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgSys());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd() != null) {
			claimresponseadditemdetailsubdetailadjudicationcategorycoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgVrsn() != null) {
			claimresponseadditemdetailsubdetailadjudicationcategorycoding.setVersion(c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgVrsn());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryTxt() != null) {
			claimresponseadditemdetailsubdetailadjudicationcategory.setText(c.getClmRspsAddItmDtlSubDtlAdjdctnCtgryTxt());
		}
		/******************** claimresponseadditemdetailsubdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailsubdetailadjudicationreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseadditemdetailsubdetailadjudication.setReason(claimresponseadditemdetailsubdetailadjudicationreason);

		/******************** claimresponseadditemdetailsubdetailadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemdetailsubdetailadjudicationreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseadditemdetailsubdetailadjudicationreason.addCoding(claimresponseadditemdetailsubdetailadjudicationreasoncoding);

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgCd() != null) {
			claimresponseadditemdetailsubdetailadjudicationreasoncoding.setCode(c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgCd());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgDsply() != null) {
			claimresponseadditemdetailsubdetailadjudicationreasoncoding.setDisplay(c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgDsply());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgSys() != null) {
			claimresponseadditemdetailsubdetailadjudicationreasoncoding.setSystem(c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgSys());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd() != null) {
			claimresponseadditemdetailsubdetailadjudicationreasoncoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgVrsn() != null) {
			claimresponseadditemdetailsubdetailadjudicationreasoncoding.setVersion(c.getClmRspsAddItmDtlSubDtlAdjdctnRsnCdgVrsn());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnRsnTxt() != null) {
			claimresponseadditemdetailsubdetailadjudicationreason.setText(c.getClmRspsAddItmDtlSubDtlAdjdctnRsnTxt());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlAdjdctnVl() != null) {
			claimresponseadditemdetailsubdetailadjudication.setValue(Double.parseDouble((c.getClmRspsAddItmDtlSubDtlAdjdctnVl())));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Factor ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlFactor() != null) {
			claimresponseadditemdetailsubdetail.setFactor(new java.math.BigDecimal((c.getClmRspsAddItmDtlSubDtlFactor())));
		}
		/******************** claimresponseadditemdetailsubdetailmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailsubdetailmodifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseadditemdetailsubdetail.addModifier(claimresponseadditemdetailsubdetailmodifier);

		/******************** claimresponseadditemdetailsubdetailmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemdetailsubdetailmodifiercoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseadditemdetailsubdetailmodifier.addCoding(claimresponseadditemdetailsubdetailmodifiercoding);

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlMdfrCdgCd() != null) {
			claimresponseadditemdetailsubdetailmodifiercoding.setCode(c.getClmRspsAddItmDtlSubDtlMdfrCdgCd());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlMdfrCdgDsply() != null) {
			claimresponseadditemdetailsubdetailmodifiercoding.setDisplay(c.getClmRspsAddItmDtlSubDtlMdfrCdgDsply());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlMdfrCdgSys() != null) {
			claimresponseadditemdetailsubdetailmodifiercoding.setSystem(c.getClmRspsAddItmDtlSubDtlMdfrCdgSys());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlMdfrCdgUsrSltd() != null) {
			claimresponseadditemdetailsubdetailmodifiercoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsAddItmDtlSubDtlMdfrCdgUsrSltd()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlMdfrCdgVrsn() != null) {
			claimresponseadditemdetailsubdetailmodifiercoding.setVersion(c.getClmRspsAddItmDtlSubDtlMdfrCdgVrsn());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Txt ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlMdfrTxt() != null) {
			claimresponseadditemdetailsubdetailmodifier.setText(c.getClmRspsAddItmDtlSubDtlMdfrTxt());
		}
		/******************** claimresponseadditemdetailsubdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemdetailsubdetailnet =  new org.hl7.fhir.r4.model.Money();
		claimresponseadditemdetailsubdetail.setNet(claimresponseadditemdetailsubdetailnet);

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Net_Crncy ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlNetCrncy() != null) {
			claimresponseadditemdetailsubdetailnet.setCurrency(c.getClmRspsAddItmDtlSubDtlNetCrncy());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Net_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlNetVl() != null) {
			claimresponseadditemdetailsubdetailnet.setValue(Double.parseDouble((c.getClmRspsAddItmDtlSubDtlNetVl())));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_NtNmbr ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlNtNmbr() != null) {
			claimresponseadditemdetailsubdetail.addNoteNumber(Integer.parseInt(c.getClmRspsAddItmDtlSubDtlNtNmbr()));
		}
		/******************** claimresponseadditemdetailsubdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailsubdetailproductorservice =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseadditemdetailsubdetail.setProductOrService(claimresponseadditemdetailsubdetailproductorservice);

		/******************** claimresponseadditemdetailsubdetailproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemdetailsubdetailproductorservicecoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseadditemdetailsubdetailproductorservice.addCoding(claimresponseadditemdetailsubdetailproductorservicecoding);

		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgCd() != null) {
			claimresponseadditemdetailsubdetailproductorservicecoding.setCode(c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgCd());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgDsply() != null) {
			claimresponseadditemdetailsubdetailproductorservicecoding.setDisplay(c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgDsply());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgSys() != null) {
			claimresponseadditemdetailsubdetailproductorservicecoding.setSystem(c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgSys());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd() != null) {
			claimresponseadditemdetailsubdetailproductorservicecoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd()));
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgVrsn() != null) {
			claimresponseadditemdetailsubdetailproductorservicecoding.setVersion(c.getClmRspsAddItmDtlSubDtlPrdctOrSrvCdgVrsn());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Txt ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlPrdctOrSrvTxt() != null) {
			claimresponseadditemdetailsubdetailproductorservice.setText(c.getClmRspsAddItmDtlSubDtlPrdctOrSrvTxt());
		}
		/******************** claimresponseadditemdetailsubdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimresponseadditemdetailsubdetailquantity =  new org.hl7.fhir.r4.model.Quantity();
		claimresponseadditemdetailsubdetail.setQuantity(claimresponseadditemdetailsubdetailquantity);

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Qnty_Cd ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlQntyCd() != null) {
			claimresponseadditemdetailsubdetailquantity.setCode(c.getClmRspsAddItmDtlSubDtlQntyCd());
		}
		/******************** claimresponseadditemdetailsubdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory claimresponseadditemdetailsubdetailquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		claimresponseadditemdetailsubdetailquantity.setComparator(claimresponseadditemdetailsubdetailquantitycomparator.fromCode(c.getClmRspsAddItmDtlSubDtlQntyCmprtr()));

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Qnty_Sys ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlQntySys() != null) {
			claimresponseadditemdetailsubdetailquantity.setSystem(c.getClmRspsAddItmDtlSubDtlQntySys());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Qnty_Unt ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlQntyUnt() != null) {
			claimresponseadditemdetailsubdetailquantity.setUnit(c.getClmRspsAddItmDtlSubDtlQntyUnt());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Qnty_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlQntyVl() != null) {
			claimresponseadditemdetailsubdetailquantity.setValue(Double.parseDouble((c.getClmRspsAddItmDtlSubDtlQntyVl())));
		}
		/******************** claimresponseadditemdetailsubdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemdetailsubdetailunitprice =  new org.hl7.fhir.r4.model.Money();
		claimresponseadditemdetailsubdetail.setUnitPrice(claimresponseadditemdetailsubdetailunitprice);

		/******************** ClmRsps_AddItm_Dtl_SubDtl_UntPrice_Crncy ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlUntPriceCrncy() != null) {
			claimresponseadditemdetailsubdetailunitprice.setCurrency(c.getClmRspsAddItmDtlSubDtlUntPriceCrncy());
		}
		/******************** ClmRsps_AddItm_Dtl_SubDtl_UntPrice_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlSubDtlUntPriceVl() != null) {
			claimresponseadditemdetailsubdetailunitprice.setValue(Double.parseDouble((c.getClmRspsAddItmDtlSubDtlUntPriceVl())));
		}
		/******************** claimresponseadditemdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemdetailunitprice =  new org.hl7.fhir.r4.model.Money();
		claimresponseadditemdetail.setUnitPrice(claimresponseadditemdetailunitprice);

		/******************** ClmRsps_AddItm_Dtl_UntPrice_Crncy ********************************************************************************/
		if(c.getClmRspsAddItmDtlUntPriceCrncy() != null) {
			claimresponseadditemdetailunitprice.setCurrency(c.getClmRspsAddItmDtlUntPriceCrncy());
		}
		/******************** ClmRsps_AddItm_Dtl_UntPrice_Vl ********************************************************************************/
		if(c.getClmRspsAddItmDtlUntPriceVl() != null) {
			claimresponseadditemdetailunitprice.setValue(Double.parseDouble((c.getClmRspsAddItmDtlUntPriceVl())));
		}
		/******************** ClmRsps_AddItm_DtlSqnc ********************************************************************************/
		if(c.getClmRspsAddItmDtlSqnc() != null) {
			claimresponseadditem.addDetailSequence(Integer.parseInt(c.getClmRspsAddItmDtlSqnc()));
		}
		/******************** ClmRsps_AddItm_Factor ********************************************************************************/
		if(c.getClmRspsAddItmFactor() != null) {
			claimresponseadditem.setFactor(Double.parseDouble((c.getClmRspsAddItmFactor())));
		}
		/******************** ClmRsps_AddItm_ItmSqnc ********************************************************************************/
		if(c.getClmRspsAddItmItmSqnc() != null) {
			claimresponseadditem.addItemSequence(Integer.parseInt(c.getClmRspsAddItmItmSqnc()));
		}
		/******************** claimresponseadditemlocationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address claimresponseadditemlocationaddress =  new org.hl7.fhir.r4.model.Address();
		claimresponseadditem.setLocation(claimresponseadditemlocationaddress);

		/******************** ClmRsps_AddItm_LctnAddr_City ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrCity() != null) {
			claimresponseadditemlocationaddress.setCity(c.getClmRspsAddItmLctnAddrCity());
		}
		/******************** ClmRsps_AddItm_LctnAddr_Cntry ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrCntry() != null) {
			claimresponseadditemlocationaddress.setCountry(c.getClmRspsAddItmLctnAddrCntry());
		}
		/******************** ClmRsps_AddItm_LctnAddr_District ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrDistrict() != null) {
			claimresponseadditemlocationaddress.setDistrict(c.getClmRspsAddItmLctnAddrDistrict());
		}
		/******************** ClmRsps_AddItm_LctnAddr_Line ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrLine() != null) {
			claimresponseadditemlocationaddress.addLine(c.getClmRspsAddItmLctnAddrLine());
		}
		/******************** claimresponseadditemlocationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimresponseadditemlocationaddressperiod =  new org.hl7.fhir.r4.model.Period();
		claimresponseadditemlocationaddress.setPeriod(claimresponseadditemlocationaddressperiod);

		/******************** ClmRsps_AddItm_LctnAddr_Prd_End ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrPrdEnd() != null) {
			java.text.SimpleDateFormat ClmRsps_AddItm_LctnAddr_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ClmRsps_AddItm_LctnAddr_Prd_Enddate = ClmRsps_AddItm_LctnAddr_Prd_Endsdf.parse(c.getClmRspsAddItmLctnAddrPrdEnd());
			claimresponseadditemlocationaddressperiod.setEnd(ClmRsps_AddItm_LctnAddr_Prd_Enddate);
		}
		/******************** ClmRsps_AddItm_LctnAddr_Prd_Strt ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrPrdStrt() != null) {
			java.text.SimpleDateFormat ClmRsps_AddItm_LctnAddr_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ClmRsps_AddItm_LctnAddr_Prd_Strtdate = ClmRsps_AddItm_LctnAddr_Prd_Strtsdf.parse(c.getClmRspsAddItmLctnAddrPrdStrt());
			claimresponseadditemlocationaddressperiod.setStart(ClmRsps_AddItm_LctnAddr_Prd_Strtdate);
		}
		/******************** ClmRsps_AddItm_LctnAddr_PostalCd ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrPostalCd() != null) {
			claimresponseadditemlocationaddress.setPostalCode(c.getClmRspsAddItmLctnAddrPostalCd());
		}
		/******************** ClmRsps_AddItm_LctnAddr_State ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrState() != null) {
			claimresponseadditemlocationaddress.setState(c.getClmRspsAddItmLctnAddrState());
		}
		/******************** ClmRsps_AddItm_LctnAddr_Txt ********************************************************************************/
		if(c.getClmRspsAddItmLctnAddrTxt() != null) {
			claimresponseadditemlocationaddress.setText(c.getClmRspsAddItmLctnAddrTxt());
		}
		/******************** claimresponseadditemlocationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory claimresponseadditemlocationaddresstype =  new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();
		claimresponseadditemlocationaddress.setType(claimresponseadditemlocationaddresstype.fromCode(c.getClmRspsAddItmLctnAddrTyp()));

		/******************** claimresponseadditemlocationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory claimresponseadditemlocationaddressuse =  new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();
		claimresponseadditemlocationaddress.setUse(claimresponseadditemlocationaddressuse.fromCode(c.getClmRspsAddItmLctnAddrUse()));

		/******************** claimresponseadditemlocationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemlocationcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseadditem.setLocation(claimresponseadditemlocationcodeableconcept);

		/******************** claimresponseadditemlocationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemlocationcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseadditemlocationcodeableconcept.addCoding(claimresponseadditemlocationcodeableconceptcoding);

		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmLctnCdbleCncptCdgCd() != null) {
			claimresponseadditemlocationcodeableconceptcoding.setCode(c.getClmRspsAddItmLctnCdbleCncptCdgCd());
		}
		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmLctnCdbleCncptCdgDsply() != null) {
			claimresponseadditemlocationcodeableconceptcoding.setDisplay(c.getClmRspsAddItmLctnCdbleCncptCdgDsply());
		}
		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmLctnCdbleCncptCdgSys() != null) {
			claimresponseadditemlocationcodeableconceptcoding.setSystem(c.getClmRspsAddItmLctnCdbleCncptCdgSys());
		}
		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmLctnCdbleCncptCdgUsrSltd() != null) {
			claimresponseadditemlocationcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsAddItmLctnCdbleCncptCdgUsrSltd()));
		}
		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmLctnCdbleCncptCdgVrsn() != null) {
			claimresponseadditemlocationcodeableconceptcoding.setVersion(c.getClmRspsAddItmLctnCdbleCncptCdgVrsn());
		}
		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Txt ********************************************************************************/
		if(c.getClmRspsAddItmLctnCdbleCncptTxt() != null) {
			claimresponseadditemlocationcodeableconcept.setText(c.getClmRspsAddItmLctnCdbleCncptTxt());
		}
		/******************** ClmRsps_AddItm_LctnRfrnc ********************************************************************************/
		if(c.getClmRspsAddItmLctnRfrnc() != null) {
			claimresponseadditem.setLocation( new org.hl7.fhir.r4.model.Reference(c.getClmRspsAddItmLctnRfrnc()));
		}
		/******************** claimresponseadditemmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemmodifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseadditem.addModifier(claimresponseadditemmodifier);

		/******************** claimresponseadditemmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemmodifiercoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseadditemmodifier.addCoding(claimresponseadditemmodifiercoding);

		/******************** ClmRsps_AddItm_Mdfr_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmMdfrCdgCd() != null) {
			claimresponseadditemmodifiercoding.setCode(c.getClmRspsAddItmMdfrCdgCd());
		}
		/******************** ClmRsps_AddItm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmMdfrCdgDsply() != null) {
			claimresponseadditemmodifiercoding.setDisplay(c.getClmRspsAddItmMdfrCdgDsply());
		}
		/******************** ClmRsps_AddItm_Mdfr_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmMdfrCdgSys() != null) {
			claimresponseadditemmodifiercoding.setSystem(c.getClmRspsAddItmMdfrCdgSys());
		}
		/******************** ClmRsps_AddItm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmMdfrCdgUsrSltd() != null) {
			claimresponseadditemmodifiercoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsAddItmMdfrCdgUsrSltd()));
		}
		/******************** ClmRsps_AddItm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmMdfrCdgVrsn() != null) {
			claimresponseadditemmodifiercoding.setVersion(c.getClmRspsAddItmMdfrCdgVrsn());
		}
		/******************** ClmRsps_AddItm_Mdfr_Txt ********************************************************************************/
		if(c.getClmRspsAddItmMdfrTxt() != null) {
			claimresponseadditemmodifier.setText(c.getClmRspsAddItmMdfrTxt());
		}
		/******************** claimresponseadditemnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemnet =  new org.hl7.fhir.r4.model.Money();
		claimresponseadditem.setNet(claimresponseadditemnet);

		/******************** ClmRsps_AddItm_Net_Crncy ********************************************************************************/
		if(c.getClmRspsAddItmNetCrncy() != null) {
			claimresponseadditemnet.setCurrency(c.getClmRspsAddItmNetCrncy());
		}
		/******************** ClmRsps_AddItm_Net_Vl ********************************************************************************/
		if(c.getClmRspsAddItmNetVl() != null) {
			claimresponseadditemnet.setValue(Double.parseDouble((c.getClmRspsAddItmNetVl())));
		}
		/******************** ClmRsps_AddItm_NtNmbr ********************************************************************************/
		if(c.getClmRspsAddItmNtNmbr() != null) {
			claimresponseadditem.addNoteNumber(Integer.parseInt(c.getClmRspsAddItmNtNmbr()));
		}
		/******************** claimresponseadditemproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemproductorservice =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseadditem.setProductOrService(claimresponseadditemproductorservice);

		/******************** claimresponseadditemproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemproductorservicecoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseadditemproductorservice.addCoding(claimresponseadditemproductorservicecoding);

		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmPrdctOrSrvCdgCd() != null) {
			claimresponseadditemproductorservicecoding.setCode(c.getClmRspsAddItmPrdctOrSrvCdgCd());
		}
		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmPrdctOrSrvCdgDsply() != null) {
			claimresponseadditemproductorservicecoding.setDisplay(c.getClmRspsAddItmPrdctOrSrvCdgDsply());
		}
		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmPrdctOrSrvCdgSys() != null) {
			claimresponseadditemproductorservicecoding.setSystem(c.getClmRspsAddItmPrdctOrSrvCdgSys());
		}
		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmPrdctOrSrvCdgUsrSltd() != null) {
			claimresponseadditemproductorservicecoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsAddItmPrdctOrSrvCdgUsrSltd()));
		}
		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmPrdctOrSrvCdgVrsn() != null) {
			claimresponseadditemproductorservicecoding.setVersion(c.getClmRspsAddItmPrdctOrSrvCdgVrsn());
		}
		/******************** ClmRsps_AddItm_PrdctOrSrv_Txt ********************************************************************************/
		if(c.getClmRspsAddItmPrdctOrSrvTxt() != null) {
			claimresponseadditemproductorservice.setText(c.getClmRspsAddItmPrdctOrSrvTxt());
		}
		/******************** claimresponseadditemprogramcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemprogramcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseadditem.addProgramCode(claimresponseadditemprogramcode);

		/******************** claimresponseadditemprogramcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemprogramcodecoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseadditemprogramcode.addCoding(claimresponseadditemprogramcodecoding);

		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmPrgrmCdCdgCd() != null) {
			claimresponseadditemprogramcodecoding.setCode(c.getClmRspsAddItmPrgrmCdCdgCd());
		}
		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmPrgrmCdCdgDsply() != null) {
			claimresponseadditemprogramcodecoding.setDisplay(c.getClmRspsAddItmPrgrmCdCdgDsply());
		}
		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmPrgrmCdCdgSys() != null) {
			claimresponseadditemprogramcodecoding.setSystem(c.getClmRspsAddItmPrgrmCdCdgSys());
		}
		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmPrgrmCdCdgUsrSltd() != null) {
			claimresponseadditemprogramcodecoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsAddItmPrgrmCdCdgUsrSltd()));
		}
		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmPrgrmCdCdgVrsn() != null) {
			claimresponseadditemprogramcodecoding.setVersion(c.getClmRspsAddItmPrgrmCdCdgVrsn());
		}
		/******************** ClmRsps_AddItm_PrgrmCd_Txt ********************************************************************************/
		if(c.getClmRspsAddItmPrgrmCdTxt() != null) {
			claimresponseadditemprogramcode.setText(c.getClmRspsAddItmPrgrmCdTxt());
		}
		/******************** ClmRsps_AddItm_Provider ********************************************************************************/
		if(c.getClmRspsAddItmProvider() != null) {
			claimresponseadditem.addProvider( new org.hl7.fhir.r4.model.Reference(c.getClmRspsAddItmProvider()));
		}
		/******************** claimresponseadditemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimresponseadditemquantity =  new org.hl7.fhir.r4.model.Quantity();
		claimresponseadditem.setQuantity(claimresponseadditemquantity);

		/******************** ClmRsps_AddItm_Qnty_Cd ********************************************************************************/
		if(c.getClmRspsAddItmQntyCd() != null) {
			claimresponseadditemquantity.setCode(c.getClmRspsAddItmQntyCd());
		}
		/******************** claimresponseadditemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory claimresponseadditemquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		claimresponseadditemquantity.setComparator(claimresponseadditemquantitycomparator.fromCode(c.getClmRspsAddItmQntyCmprtr()));

		/******************** ClmRsps_AddItm_Qnty_Sys ********************************************************************************/
		if(c.getClmRspsAddItmQntySys() != null) {
			claimresponseadditemquantity.setSystem(c.getClmRspsAddItmQntySys());
		}
		/******************** ClmRsps_AddItm_Qnty_Unt ********************************************************************************/
		if(c.getClmRspsAddItmQntyUnt() != null) {
			claimresponseadditemquantity.setUnit(c.getClmRspsAddItmQntyUnt());
		}
		/******************** ClmRsps_AddItm_Qnty_Vl ********************************************************************************/
		if(c.getClmRspsAddItmQntyVl() != null) {
			claimresponseadditemquantity.setValue(Double.parseDouble((c.getClmRspsAddItmQntyVl())));
		}
		/******************** ClmRsps_AddItm_SrvdDtTyp ********************************************************************************/
		if(c.getClmRspsAddItmSrvdDtTyp() != null) {
			claimresponseadditem.setServiced( new org.hl7.fhir.r4.model.DateType(c.getClmRspsAddItmSrvdDtTyp()));
		}
		/******************** claimresponseadditemservicedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimresponseadditemservicedperiod =  new org.hl7.fhir.r4.model.Period();
		claimresponseadditem.setServiced(claimresponseadditemservicedperiod);

		/******************** ClmRsps_AddItm_SrvdPrd_End ********************************************************************************/
		if(c.getClmRspsAddItmSrvdPrdEnd() != null) {
			java.text.SimpleDateFormat ClmRsps_AddItm_SrvdPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ClmRsps_AddItm_SrvdPrd_Enddate = ClmRsps_AddItm_SrvdPrd_Endsdf.parse(c.getClmRspsAddItmSrvdPrdEnd());
			claimresponseadditemservicedperiod.setEnd(ClmRsps_AddItm_SrvdPrd_Enddate);
		}
		/******************** ClmRsps_AddItm_SrvdPrd_Strt ********************************************************************************/
		if(c.getClmRspsAddItmSrvdPrdStrt() != null) {
			java.text.SimpleDateFormat ClmRsps_AddItm_SrvdPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ClmRsps_AddItm_SrvdPrd_Strtdate = ClmRsps_AddItm_SrvdPrd_Strtsdf.parse(c.getClmRspsAddItmSrvdPrdStrt());
			claimresponseadditemservicedperiod.setStart(ClmRsps_AddItm_SrvdPrd_Strtdate);
		}
		/******************** claimresponseadditemsubsite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemsubsite =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseadditem.addSubSite(claimresponseadditemsubsite);

		/******************** claimresponseadditemsubsitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadditemsubsitecoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseadditemsubsite.addCoding(claimresponseadditemsubsitecoding);

		/******************** ClmRsps_AddItm_SubSite_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAddItmSubSiteCdgCd() != null) {
			claimresponseadditemsubsitecoding.setCode(c.getClmRspsAddItmSubSiteCdgCd());
		}
		/******************** ClmRsps_AddItm_SubSite_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAddItmSubSiteCdgDsply() != null) {
			claimresponseadditemsubsitecoding.setDisplay(c.getClmRspsAddItmSubSiteCdgDsply());
		}
		/******************** ClmRsps_AddItm_SubSite_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAddItmSubSiteCdgSys() != null) {
			claimresponseadditemsubsitecoding.setSystem(c.getClmRspsAddItmSubSiteCdgSys());
		}
		/******************** ClmRsps_AddItm_SubSite_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAddItmSubSiteCdgUsrSltd() != null) {
			claimresponseadditemsubsitecoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsAddItmSubSiteCdgUsrSltd()));
		}
		/******************** ClmRsps_AddItm_SubSite_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAddItmSubSiteCdgVrsn() != null) {
			claimresponseadditemsubsitecoding.setVersion(c.getClmRspsAddItmSubSiteCdgVrsn());
		}
		/******************** ClmRsps_AddItm_SubSite_Txt ********************************************************************************/
		if(c.getClmRspsAddItmSubSiteTxt() != null) {
			claimresponseadditemsubsite.setText(c.getClmRspsAddItmSubSiteTxt());
		}
		/******************** ClmRsps_AddItm_SubdetailSqnc ********************************************************************************/
		if(c.getClmRspsAddItmSubdetailSqnc() != null) {
			claimresponseadditem.addSubdetailSequence(Integer.parseInt(c.getClmRspsAddItmSubdetailSqnc()));
		}
		/******************** claimresponseadditemunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemunitprice =  new org.hl7.fhir.r4.model.Money();
		claimresponseadditem.setUnitPrice(claimresponseadditemunitprice);

		/******************** ClmRsps_AddItm_UntPrice_Crncy ********************************************************************************/
		if(c.getClmRspsAddItmUntPriceCrncy() != null) {
			claimresponseadditemunitprice.setCurrency(c.getClmRspsAddItmUntPriceCrncy());
		}
		/******************** ClmRsps_AddItm_UntPrice_Vl ********************************************************************************/
		if(c.getClmRspsAddItmUntPriceVl() != null) {
			claimresponseadditemunitprice.setValue(Double.parseDouble((c.getClmRspsAddItmUntPriceVl())));
		}
		/******************** claimresponseadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent claimresponseadjudication =  new org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent();
		claimresponse.addAdjudication(claimresponseadjudication);

		/******************** claimresponseadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadjudicationamount =  new org.hl7.fhir.r4.model.Money();
		claimresponseadjudication.setAmount(claimresponseadjudicationamount);

		/******************** ClmRsps_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(c.getClmRspsAdjdctnAmntCrncy() != null) {
			claimresponseadjudicationamount.setCurrency(c.getClmRspsAdjdctnAmntCrncy());
		}
		/******************** ClmRsps_Adjdctn_Amnt_Vl ********************************************************************************/
		if(c.getClmRspsAdjdctnAmntVl() != null) {
			claimresponseadjudicationamount.setValue(Double.parseDouble((c.getClmRspsAdjdctnAmntVl())));
		}
		/******************** claimresponseadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadjudicationcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseadjudication.setCategory(claimresponseadjudicationcategory);

		/******************** claimresponseadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadjudicationcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseadjudicationcategory.addCoding(claimresponseadjudicationcategorycoding);

		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAdjdctnCtgryCdgCd() != null) {
			claimresponseadjudicationcategorycoding.setCode(c.getClmRspsAdjdctnCtgryCdgCd());
		}
		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAdjdctnCtgryCdgDsply() != null) {
			claimresponseadjudicationcategorycoding.setDisplay(c.getClmRspsAdjdctnCtgryCdgDsply());
		}
		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAdjdctnCtgryCdgSys() != null) {
			claimresponseadjudicationcategorycoding.setSystem(c.getClmRspsAdjdctnCtgryCdgSys());
		}
		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAdjdctnCtgryCdgUsrSltd() != null) {
			claimresponseadjudicationcategorycoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsAdjdctnCtgryCdgUsrSltd()));
		}
		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAdjdctnCtgryCdgVrsn() != null) {
			claimresponseadjudicationcategorycoding.setVersion(c.getClmRspsAdjdctnCtgryCdgVrsn());
		}
		/******************** ClmRsps_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(c.getClmRspsAdjdctnCtgryTxt() != null) {
			claimresponseadjudicationcategory.setText(c.getClmRspsAdjdctnCtgryTxt());
		}
		/******************** claimresponseadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadjudicationreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseadjudication.setReason(claimresponseadjudicationreason);

		/******************** claimresponseadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseadjudicationreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseadjudicationreason.addCoding(claimresponseadjudicationreasoncoding);

		/******************** ClmRsps_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsAdjdctnRsnCdgCd() != null) {
			claimresponseadjudicationreasoncoding.setCode(c.getClmRspsAdjdctnRsnCdgCd());
		}
		/******************** ClmRsps_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsAdjdctnRsnCdgDsply() != null) {
			claimresponseadjudicationreasoncoding.setDisplay(c.getClmRspsAdjdctnRsnCdgDsply());
		}
		/******************** ClmRsps_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsAdjdctnRsnCdgSys() != null) {
			claimresponseadjudicationreasoncoding.setSystem(c.getClmRspsAdjdctnRsnCdgSys());
		}
		/******************** ClmRsps_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsAdjdctnRsnCdgUsrSltd() != null) {
			claimresponseadjudicationreasoncoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsAdjdctnRsnCdgUsrSltd()));
		}
		/******************** ClmRsps_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsAdjdctnRsnCdgVrsn() != null) {
			claimresponseadjudicationreasoncoding.setVersion(c.getClmRspsAdjdctnRsnCdgVrsn());
		}
		/******************** ClmRsps_Adjdctn_Rsn_Txt ********************************************************************************/
		if(c.getClmRspsAdjdctnRsnTxt() != null) {
			claimresponseadjudicationreason.setText(c.getClmRspsAdjdctnRsnTxt());
		}
		/******************** ClmRsps_Adjdctn_Vl ********************************************************************************/
		if(c.getClmRspsAdjdctnVl() != null) {
			claimresponseadjudication.setValue(Double.parseDouble((c.getClmRspsAdjdctnVl())));
		}
		/******************** ClmRsps_CmmnctnRqst ********************************************************************************/
		if(c.getClmRspsCmmnctnRqst() != null) {
			claimresponse.addCommunicationRequest( new org.hl7.fhir.r4.model.Reference(c.getClmRspsCmmnctnRqst()));
		}
		/******************** ClmRsps_Created ********************************************************************************/
		if(c.getClmRspsCreated() != null) {
			java.text.SimpleDateFormat ClmRsps_Createdsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ClmRsps_Createddate = ClmRsps_Createdsdf.parse(c.getClmRspsCreated());
			claimresponse.setCreated(ClmRsps_Createddate);
		}
		/******************** ClmRsps_Disposition ********************************************************************************/
		if(c.getClmRspsDisposition() != null) {
			claimresponse.setDisposition(c.getClmRspsDisposition());
		}
		/******************** claimresponseerror ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.ErrorComponent claimresponseerror =  new org.hl7.fhir.r4.model.ClaimResponse.ErrorComponent();
		claimresponse.addError(claimresponseerror);

		/******************** claimresponseerrorcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseerrorcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseerror.setCode(claimresponseerrorcode);

		/******************** claimresponseerrorcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseerrorcodecoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseerrorcode.addCoding(claimresponseerrorcodecoding);

		/******************** ClmRsps_Error_Cd_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsErrorCdCdgCd() != null) {
			claimresponseerrorcodecoding.setCode(c.getClmRspsErrorCdCdgCd());
		}
		/******************** ClmRsps_Error_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsErrorCdCdgDsply() != null) {
			claimresponseerrorcodecoding.setDisplay(c.getClmRspsErrorCdCdgDsply());
		}
		/******************** ClmRsps_Error_Cd_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsErrorCdCdgSys() != null) {
			claimresponseerrorcodecoding.setSystem(c.getClmRspsErrorCdCdgSys());
		}
		/******************** ClmRsps_Error_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsErrorCdCdgUsrSltd() != null) {
			claimresponseerrorcodecoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsErrorCdCdgUsrSltd()));
		}
		/******************** ClmRsps_Error_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsErrorCdCdgVrsn() != null) {
			claimresponseerrorcodecoding.setVersion(c.getClmRspsErrorCdCdgVrsn());
		}
		/******************** ClmRsps_Error_Cd_Txt ********************************************************************************/
		if(c.getClmRspsErrorCdTxt() != null) {
			claimresponseerrorcode.setText(c.getClmRspsErrorCdTxt());
		}
		/******************** ClmRsps_Error_DtlSqnc ********************************************************************************/
		if(c.getClmRspsErrorDtlSqnc() != null) {
			claimresponseerror.setDetailSequence(Integer.parseInt(c.getClmRspsErrorDtlSqnc()));
		}
		/******************** ClmRsps_Error_ItmSqnc ********************************************************************************/
		if(c.getClmRspsErrorItmSqnc() != null) {
			claimresponseerror.setItemSequence(Integer.parseInt(c.getClmRspsErrorItmSqnc()));
		}
		/******************** ClmRsps_Error_SubDtlSqnc ********************************************************************************/
		if(c.getClmRspsErrorSubDtlSqnc() != null) {
			claimresponseerror.setSubDetailSequence(Integer.parseInt(c.getClmRspsErrorSubDtlSqnc()));
		}
		/******************** claimresponseform ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment claimresponseform =  new org.hl7.fhir.r4.model.Attachment();
		claimresponse.setForm(claimresponseform);

		/******************** ClmRsps_Frm_CntntTyp ********************************************************************************/
		if(c.getClmRspsFrmCntntTyp() != null) {
			claimresponseform.setContentType(c.getClmRspsFrmCntntTyp());
		}
		/******************** ClmRsps_Frm_Creation ********************************************************************************/
		if(c.getClmRspsFrmCreation() != null) {
			java.text.SimpleDateFormat ClmRsps_Frm_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ClmRsps_Frm_Creationdate = ClmRsps_Frm_Creationsdf.parse(c.getClmRspsFrmCreation());
			claimresponseform.setCreation(ClmRsps_Frm_Creationdate);
		}
		/******************** ClmRsps_Frm_Data ********************************************************************************/
		if(c.getClmRspsFrmData() != null) {
			claimresponseform.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getClmRspsFrmData()));
		}
		/******************** ClmRsps_Frm_Hash ********************************************************************************/
		if(c.getClmRspsFrmHash() != null) {
			claimresponseform.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getClmRspsFrmHash()));
		}
		/******************** ClmRsps_Frm_Lnguage ********************************************************************************/
		if(c.getClmRspsFrmLnguage() != null) {
			claimresponseform.setLanguage(c.getClmRspsFrmLnguage());
		}
		/******************** ClmRsps_Frm_Sz ********************************************************************************/
		if(c.getClmRspsFrmSz() != null) {
			claimresponseform.setSize(Integer.parseInt(c.getClmRspsFrmSz()));
		}
		/******************** ClmRsps_Frm_Ttl ********************************************************************************/
		if(c.getClmRspsFrmTtl() != null) {
			claimresponseform.setTitle(c.getClmRspsFrmTtl());
		}
		/******************** ClmRsps_Frm_Url ********************************************************************************/
		if(c.getClmRspsFrmUrl() != null) {
			claimresponseform.setUrl(c.getClmRspsFrmUrl());
		}
		/******************** claimresponseformcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseformcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponse.setFormCode(claimresponseformcode);

		/******************** claimresponseformcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseformcodecoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseformcode.addCoding(claimresponseformcodecoding);

		/******************** ClmRsps_FrmCd_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsFrmCdCdgCd() != null) {
			claimresponseformcodecoding.setCode(c.getClmRspsFrmCdCdgCd());
		}
		/******************** ClmRsps_FrmCd_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsFrmCdCdgDsply() != null) {
			claimresponseformcodecoding.setDisplay(c.getClmRspsFrmCdCdgDsply());
		}
		/******************** ClmRsps_FrmCd_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsFrmCdCdgSys() != null) {
			claimresponseformcodecoding.setSystem(c.getClmRspsFrmCdCdgSys());
		}
		/******************** ClmRsps_FrmCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsFrmCdCdgUsrSltd() != null) {
			claimresponseformcodecoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsFrmCdCdgUsrSltd()));
		}
		/******************** ClmRsps_FrmCd_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsFrmCdCdgVrsn() != null) {
			claimresponseformcodecoding.setVersion(c.getClmRspsFrmCdCdgVrsn());
		}
		/******************** ClmRsps_FrmCd_Txt ********************************************************************************/
		if(c.getClmRspsFrmCdTxt() != null) {
			claimresponseformcode.setText(c.getClmRspsFrmCdTxt());
		}
		/******************** claimresponsefundsreserve ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsefundsreserve =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponse.setFundsReserve(claimresponsefundsreserve);

		/******************** claimresponsefundsreservecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponsefundsreservecoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponsefundsreserve.addCoding(claimresponsefundsreservecoding);

		/******************** ClmRsps_FundsReserve_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsFundsReserveCdgCd() != null) {
			claimresponsefundsreservecoding.setCode(c.getClmRspsFundsReserveCdgCd());
		}
		/******************** ClmRsps_FundsReserve_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsFundsReserveCdgDsply() != null) {
			claimresponsefundsreservecoding.setDisplay(c.getClmRspsFundsReserveCdgDsply());
		}
		/******************** ClmRsps_FundsReserve_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsFundsReserveCdgSys() != null) {
			claimresponsefundsreservecoding.setSystem(c.getClmRspsFundsReserveCdgSys());
		}
		/******************** ClmRsps_FundsReserve_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsFundsReserveCdgUsrSltd() != null) {
			claimresponsefundsreservecoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsFundsReserveCdgUsrSltd()));
		}
		/******************** ClmRsps_FundsReserve_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsFundsReserveCdgVrsn() != null) {
			claimresponsefundsreservecoding.setVersion(c.getClmRspsFundsReserveCdgVrsn());
		}
		/******************** ClmRsps_FundsReserve_Txt ********************************************************************************/
		if(c.getClmRspsFundsReserveTxt() != null) {
			claimresponsefundsreserve.setText(c.getClmRspsFundsReserveTxt());
		}
		/******************** claimresponseidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier claimresponseidentifier =  new org.hl7.fhir.r4.model.Identifier();
		claimresponse.addIdentifier(claimresponseidentifier);

		/******************** ClmRsps_Id_Assigner ********************************************************************************/
		if(c.getClmRspsIdAssigner() != null) {
			claimresponseidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getClmRspsIdAssigner()));
		}
		/******************** claimresponseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimresponseidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		claimresponseidentifier.setPeriod(claimresponseidentifierperiod);

		/******************** ClmRsps_Id_Prd_End ********************************************************************************/
		if(c.getClmRspsIdPrdEnd() != null) {
			java.text.SimpleDateFormat ClmRsps_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ClmRsps_Id_Prd_Enddate = ClmRsps_Id_Prd_Endsdf.parse(c.getClmRspsIdPrdEnd());
			claimresponseidentifierperiod.setEnd(ClmRsps_Id_Prd_Enddate);
		}
		/******************** ClmRsps_Id_Prd_Strt ********************************************************************************/
		if(c.getClmRspsIdPrdStrt() != null) {
			java.text.SimpleDateFormat ClmRsps_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ClmRsps_Id_Prd_Strtdate = ClmRsps_Id_Prd_Strtsdf.parse(c.getClmRspsIdPrdStrt());
			claimresponseidentifierperiod.setStart(ClmRsps_Id_Prd_Strtdate);
		}
		/******************** ClmRsps_Id_Sys ********************************************************************************/
		if(c.getClmRspsIdSys() != null) {
			claimresponseidentifier.setSystem(c.getClmRspsIdSys());
		}
		/******************** claimresponseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseidentifier.setType(claimresponseidentifiertype);

		/******************** claimresponseidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseidentifiertype.addCoding(claimresponseidentifiertypecoding);

		/******************** ClmRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsIdTypCdgCd() != null) {
			claimresponseidentifiertypecoding.setCode(c.getClmRspsIdTypCdgCd());
		}
		/******************** ClmRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsIdTypCdgDsply() != null) {
			claimresponseidentifiertypecoding.setDisplay(c.getClmRspsIdTypCdgDsply());
		}
		/******************** ClmRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsIdTypCdgSys() != null) {
			claimresponseidentifiertypecoding.setSystem(c.getClmRspsIdTypCdgSys());
		}
		/******************** ClmRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsIdTypCdgUsrSltd() != null) {
			claimresponseidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsIdTypCdgUsrSltd()));
		}
		/******************** ClmRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsIdTypCdgVrsn() != null) {
			claimresponseidentifiertypecoding.setVersion(c.getClmRspsIdTypCdgVrsn());
		}
		/******************** ClmRsps_Id_Typ_Txt ********************************************************************************/
		if(c.getClmRspsIdTypTxt() != null) {
			claimresponseidentifiertype.setText(c.getClmRspsIdTypTxt());
		}
		/******************** claimresponseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory claimresponseidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		claimresponseidentifier.setUse(claimresponseidentifieruse.fromCode(c.getClmRspsIdUse()));

		/******************** ClmRsps_Id_Vl ********************************************************************************/
		if(c.getClmRspsIdVl() != null) {
			claimresponseidentifier.setValue(c.getClmRspsIdVl());
		}
		/******************** claimresponseinsurance ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.InsuranceComponent claimresponseinsurance =  new org.hl7.fhir.r4.model.ClaimResponse.InsuranceComponent();
		claimresponse.addInsurance(claimresponseinsurance);

		/******************** ClmRsps_Insrnc_BusinessArrangement ********************************************************************************/
		if(c.getClmRspsInsrncBusinessArrangement() != null) {
			claimresponseinsurance.setBusinessArrangement(c.getClmRspsInsrncBusinessArrangement());
		}
		/******************** ClmRsps_Insrnc_ClmRsps ********************************************************************************/
		if(c.getClmRspsInsrncClmRsps() != null) {
			claimresponseinsurance.setClaimResponse( new org.hl7.fhir.r4.model.Reference(c.getClmRspsInsrncClmRsps()));
		}
		/******************** ClmRsps_Insrnc_Cvg ********************************************************************************/
		if(c.getClmRspsInsrncCvg() != null) {
			claimresponseinsurance.setCoverage( new org.hl7.fhir.r4.model.Reference(c.getClmRspsInsrncCvg()));
		}
		/******************** ClmRsps_Insrnc_Focal ********************************************************************************/
		if(c.getClmRspsInsrncFocal() != null) {
			claimresponseinsurance.setFocal(Boolean.parseBoolean(c.getClmRspsInsrncFocal()));
		}
		/******************** ClmRsps_Insrnc_Sqnc ********************************************************************************/
		if(c.getClmRspsInsrncSqnc() != null) {
			claimresponseinsurance.setSequence(Integer.parseInt(c.getClmRspsInsrncSqnc()));
		}
		/******************** ClmRsps_Insurer ********************************************************************************/
		if(c.getClmRspsInsurer() != null) {
			claimresponse.setInsurer( new org.hl7.fhir.r4.model.Reference(c.getClmRspsInsurer()));
		}
		/******************** claimresponseitem ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.ItemComponent claimresponseitem =  new org.hl7.fhir.r4.model.ClaimResponse.ItemComponent();
		claimresponse.addItem(claimresponseitem);

		/******************** claimresponseitemadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent claimresponseitemadjudication =  new org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent();
		claimresponseitem.addAdjudication(claimresponseitemadjudication);

		/******************** claimresponseitemadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseitemadjudicationamount =  new org.hl7.fhir.r4.model.Money();
		claimresponseitemadjudication.setAmount(claimresponseitemadjudicationamount);

		/******************** ClmRsps_Itm_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(c.getClmRspsItmAdjdctnAmntCrncy() != null) {
			claimresponseitemadjudicationamount.setCurrency(c.getClmRspsItmAdjdctnAmntCrncy());
		}
		/******************** ClmRsps_Itm_Adjdctn_Amnt_Vl ********************************************************************************/
		if(c.getClmRspsItmAdjdctnAmntVl() != null) {
			claimresponseitemadjudicationamount.setValue(Double.parseDouble((c.getClmRspsItmAdjdctnAmntVl())));
		}
		/******************** claimresponseitemadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseitemadjudicationcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseitemadjudication.setCategory(claimresponseitemadjudicationcategory);

		/******************** claimresponseitemadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseitemadjudicationcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseitemadjudicationcategory.addCoding(claimresponseitemadjudicationcategorycoding);

		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsItmAdjdctnCtgryCdgCd() != null) {
			claimresponseitemadjudicationcategorycoding.setCode(c.getClmRspsItmAdjdctnCtgryCdgCd());
		}
		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsItmAdjdctnCtgryCdgDsply() != null) {
			claimresponseitemadjudicationcategorycoding.setDisplay(c.getClmRspsItmAdjdctnCtgryCdgDsply());
		}
		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsItmAdjdctnCtgryCdgSys() != null) {
			claimresponseitemadjudicationcategorycoding.setSystem(c.getClmRspsItmAdjdctnCtgryCdgSys());
		}
		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsItmAdjdctnCtgryCdgUsrSltd() != null) {
			claimresponseitemadjudicationcategorycoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsItmAdjdctnCtgryCdgUsrSltd()));
		}
		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsItmAdjdctnCtgryCdgVrsn() != null) {
			claimresponseitemadjudicationcategorycoding.setVersion(c.getClmRspsItmAdjdctnCtgryCdgVrsn());
		}
		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(c.getClmRspsItmAdjdctnCtgryTxt() != null) {
			claimresponseitemadjudicationcategory.setText(c.getClmRspsItmAdjdctnCtgryTxt());
		}
		/******************** claimresponseitemadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseitemadjudicationreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseitemadjudication.setReason(claimresponseitemadjudicationreason);

		/******************** claimresponseitemadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseitemadjudicationreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseitemadjudicationreason.addCoding(claimresponseitemadjudicationreasoncoding);

		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsItmAdjdctnRsnCdgCd() != null) {
			claimresponseitemadjudicationreasoncoding.setCode(c.getClmRspsItmAdjdctnRsnCdgCd());
		}
		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsItmAdjdctnRsnCdgDsply() != null) {
			claimresponseitemadjudicationreasoncoding.setDisplay(c.getClmRspsItmAdjdctnRsnCdgDsply());
		}
		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsItmAdjdctnRsnCdgSys() != null) {
			claimresponseitemadjudicationreasoncoding.setSystem(c.getClmRspsItmAdjdctnRsnCdgSys());
		}
		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsItmAdjdctnRsnCdgUsrSltd() != null) {
			claimresponseitemadjudicationreasoncoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsItmAdjdctnRsnCdgUsrSltd()));
		}
		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsItmAdjdctnRsnCdgVrsn() != null) {
			claimresponseitemadjudicationreasoncoding.setVersion(c.getClmRspsItmAdjdctnRsnCdgVrsn());
		}
		/******************** ClmRsps_Itm_Adjdctn_Rsn_Txt ********************************************************************************/
		if(c.getClmRspsItmAdjdctnRsnTxt() != null) {
			claimresponseitemadjudicationreason.setText(c.getClmRspsItmAdjdctnRsnTxt());
		}
		/******************** ClmRsps_Itm_Adjdctn_Vl ********************************************************************************/
		if(c.getClmRspsItmAdjdctnVl() != null) {
			claimresponseitemadjudication.setValue(Double.parseDouble((c.getClmRspsItmAdjdctnVl())));
		}
		/******************** claimresponseitemdetail ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.ItemDetailComponent claimresponseitemdetail =  new org.hl7.fhir.r4.model.ClaimResponse.ItemDetailComponent();
		claimresponseitem.addDetail(claimresponseitemdetail);

		/******************** claimresponseitemdetailadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent claimresponseitemdetailadjudication =  new org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent();
		claimresponseitemdetail.addAdjudication(claimresponseitemdetailadjudication);

		/******************** claimresponseitemdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseitemdetailadjudicationamount =  new org.hl7.fhir.r4.model.Money();
		claimresponseitemdetailadjudication.setAmount(claimresponseitemdetailadjudicationamount);

		/******************** ClmRsps_Itm_Dtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnAmntCrncy() != null) {
			claimresponseitemdetailadjudicationamount.setCurrency(c.getClmRspsItmDtlAdjdctnAmntCrncy());
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnAmntVl() != null) {
			claimresponseitemdetailadjudicationamount.setValue(Double.parseDouble((c.getClmRspsItmDtlAdjdctnAmntVl())));
		}
		/******************** claimresponseitemdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseitemdetailadjudicationcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseitemdetailadjudication.setCategory(claimresponseitemdetailadjudicationcategory);

		/******************** claimresponseitemdetailadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseitemdetailadjudicationcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseitemdetailadjudicationcategory.addCoding(claimresponseitemdetailadjudicationcategorycoding);

		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnCtgryCdgCd() != null) {
			claimresponseitemdetailadjudicationcategorycoding.setCode(c.getClmRspsItmDtlAdjdctnCtgryCdgCd());
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnCtgryCdgDsply() != null) {
			claimresponseitemdetailadjudicationcategorycoding.setDisplay(c.getClmRspsItmDtlAdjdctnCtgryCdgDsply());
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnCtgryCdgSys() != null) {
			claimresponseitemdetailadjudicationcategorycoding.setSystem(c.getClmRspsItmDtlAdjdctnCtgryCdgSys());
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnCtgryCdgUsrSltd() != null) {
			claimresponseitemdetailadjudicationcategorycoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsItmDtlAdjdctnCtgryCdgUsrSltd()));
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnCtgryCdgVrsn() != null) {
			claimresponseitemdetailadjudicationcategorycoding.setVersion(c.getClmRspsItmDtlAdjdctnCtgryCdgVrsn());
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnCtgryTxt() != null) {
			claimresponseitemdetailadjudicationcategory.setText(c.getClmRspsItmDtlAdjdctnCtgryTxt());
		}
		/******************** claimresponseitemdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseitemdetailadjudicationreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseitemdetailadjudication.setReason(claimresponseitemdetailadjudicationreason);

		/******************** claimresponseitemdetailadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseitemdetailadjudicationreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseitemdetailadjudicationreason.addCoding(claimresponseitemdetailadjudicationreasoncoding);

		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnRsnCdgCd() != null) {
			claimresponseitemdetailadjudicationreasoncoding.setCode(c.getClmRspsItmDtlAdjdctnRsnCdgCd());
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnRsnCdgDsply() != null) {
			claimresponseitemdetailadjudicationreasoncoding.setDisplay(c.getClmRspsItmDtlAdjdctnRsnCdgDsply());
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnRsnCdgSys() != null) {
			claimresponseitemdetailadjudicationreasoncoding.setSystem(c.getClmRspsItmDtlAdjdctnRsnCdgSys());
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnRsnCdgUsrSltd() != null) {
			claimresponseitemdetailadjudicationreasoncoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsItmDtlAdjdctnRsnCdgUsrSltd()));
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnRsnCdgVrsn() != null) {
			claimresponseitemdetailadjudicationreasoncoding.setVersion(c.getClmRspsItmDtlAdjdctnRsnCdgVrsn());
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnRsnTxt() != null) {
			claimresponseitemdetailadjudicationreason.setText(c.getClmRspsItmDtlAdjdctnRsnTxt());
		}
		/******************** ClmRsps_Itm_Dtl_Adjdctn_Vl ********************************************************************************/
		if(c.getClmRspsItmDtlAdjdctnVl() != null) {
			claimresponseitemdetailadjudication.setValue(Double.parseDouble((c.getClmRspsItmDtlAdjdctnVl())));
		}
		/******************** ClmRsps_Itm_Dtl_DtlSqnc ********************************************************************************/
		if(c.getClmRspsItmDtlDtlSqnc() != null) {
			claimresponseitemdetail.setDetailSequence(Integer.parseInt(c.getClmRspsItmDtlDtlSqnc()));
		}
		/******************** ClmRsps_Itm_Dtl_NtNmbr ********************************************************************************/
		if(c.getClmRspsItmDtlNtNmbr() != null) {
			claimresponseitemdetail.addNoteNumber(Integer.parseInt(c.getClmRspsItmDtlNtNmbr()));
		}
		/******************** claimresponseitemdetailsubdetail ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.SubDetailComponent claimresponseitemdetailsubdetail =  new org.hl7.fhir.r4.model.ClaimResponse.SubDetailComponent();
		claimresponseitemdetail.addSubDetail(claimresponseitemdetailsubdetail);

		/******************** claimresponseitemdetailsubdetailadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent claimresponseitemdetailsubdetailadjudication =  new org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent();
		claimresponseitemdetailsubdetail.addAdjudication(claimresponseitemdetailsubdetailadjudication);

		/******************** claimresponseitemdetailsubdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseitemdetailsubdetailadjudicationamount =  new org.hl7.fhir.r4.model.Money();
		claimresponseitemdetailsubdetailadjudication.setAmount(claimresponseitemdetailsubdetailadjudicationamount);

		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnAmntCrncy() != null) {
			claimresponseitemdetailsubdetailadjudicationamount.setCurrency(c.getClmRspsItmDtlSubDtlAdjdctnAmntCrncy());
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnAmntVl() != null) {
			claimresponseitemdetailsubdetailadjudicationamount.setValue(Double.parseDouble((c.getClmRspsItmDtlSubDtlAdjdctnAmntVl())));
		}
		/******************** claimresponseitemdetailsubdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseitemdetailsubdetailadjudicationcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseitemdetailsubdetailadjudication.setCategory(claimresponseitemdetailsubdetailadjudicationcategory);

		/******************** claimresponseitemdetailsubdetailadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseitemdetailsubdetailadjudicationcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseitemdetailsubdetailadjudicationcategory.addCoding(claimresponseitemdetailsubdetailadjudicationcategorycoding);

		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgCd() != null) {
			claimresponseitemdetailsubdetailadjudicationcategorycoding.setCode(c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgCd());
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgDsply() != null) {
			claimresponseitemdetailsubdetailadjudicationcategorycoding.setDisplay(c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgDsply());
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgSys() != null) {
			claimresponseitemdetailsubdetailadjudicationcategorycoding.setSystem(c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgSys());
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgUsrSltd() != null) {
			claimresponseitemdetailsubdetailadjudicationcategorycoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgUsrSltd()));
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgVrsn() != null) {
			claimresponseitemdetailsubdetailadjudicationcategorycoding.setVersion(c.getClmRspsItmDtlSubDtlAdjdctnCtgryCdgVrsn());
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnCtgryTxt() != null) {
			claimresponseitemdetailsubdetailadjudicationcategory.setText(c.getClmRspsItmDtlSubDtlAdjdctnCtgryTxt());
		}
		/******************** claimresponseitemdetailsubdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseitemdetailsubdetailadjudicationreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseitemdetailsubdetailadjudication.setReason(claimresponseitemdetailsubdetailadjudicationreason);

		/******************** claimresponseitemdetailsubdetailadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseitemdetailsubdetailadjudicationreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseitemdetailsubdetailadjudicationreason.addCoding(claimresponseitemdetailsubdetailadjudicationreasoncoding);

		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgCd() != null) {
			claimresponseitemdetailsubdetailadjudicationreasoncoding.setCode(c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgCd());
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgDsply() != null) {
			claimresponseitemdetailsubdetailadjudicationreasoncoding.setDisplay(c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgDsply());
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgSys() != null) {
			claimresponseitemdetailsubdetailadjudicationreasoncoding.setSystem(c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgSys());
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgUsrSltd() != null) {
			claimresponseitemdetailsubdetailadjudicationreasoncoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgUsrSltd()));
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgVrsn() != null) {
			claimresponseitemdetailsubdetailadjudicationreasoncoding.setVersion(c.getClmRspsItmDtlSubDtlAdjdctnRsnCdgVrsn());
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnRsnTxt() != null) {
			claimresponseitemdetailsubdetailadjudicationreason.setText(c.getClmRspsItmDtlSubDtlAdjdctnRsnTxt());
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Vl ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlAdjdctnVl() != null) {
			claimresponseitemdetailsubdetailadjudication.setValue(Double.parseDouble((c.getClmRspsItmDtlSubDtlAdjdctnVl())));
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_NtNmbr ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlNtNmbr() != null) {
			claimresponseitemdetailsubdetail.addNoteNumber(Integer.parseInt(c.getClmRspsItmDtlSubDtlNtNmbr()));
		}
		/******************** ClmRsps_Itm_Dtl_SubDtl_SubDtlSqnc ********************************************************************************/
		if(c.getClmRspsItmDtlSubDtlSubDtlSqnc() != null) {
			claimresponseitemdetailsubdetail.setSubDetailSequence(Integer.parseInt(c.getClmRspsItmDtlSubDtlSubDtlSqnc()));
		}
		/******************** ClmRsps_Itm_ItmSqnc ********************************************************************************/
		if(c.getClmRspsItmItmSqnc() != null) {
			claimresponseitem.setItemSequence(Integer.parseInt(c.getClmRspsItmItmSqnc()));
		}
		/******************** ClmRsps_Itm_NtNmbr ********************************************************************************/
		if(c.getClmRspsItmNtNmbr() != null) {
			claimresponseitem.addNoteNumber(Integer.parseInt(c.getClmRspsItmNtNmbr()));
		}
		/******************** claimresponseoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.RemittanceOutcomeEnumFactory claimresponseoutcome =  new org.hl7.fhir.r4.model.ClaimResponse.RemittanceOutcomeEnumFactory();
		claimresponse.setOutcome(claimresponseoutcome.fromCode(c.getClmRspsOutcome()));

		/******************** ClmRsps_Pnt ********************************************************************************/
		if(c.getClmRspsPnt() != null) {
			claimresponse.setPatient( new org.hl7.fhir.r4.model.Reference(c.getClmRspsPnt()));
		}
		/******************** claimresponsepayeetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsepayeetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponse.setPayeeType(claimresponsepayeetype);

		/******************** claimresponsepayeetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponsepayeetypecoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponsepayeetype.addCoding(claimresponsepayeetypecoding);

		/******************** ClmRsps_PayeeTyp_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsPayeeTypCdgCd() != null) {
			claimresponsepayeetypecoding.setCode(c.getClmRspsPayeeTypCdgCd());
		}
		/******************** ClmRsps_PayeeTyp_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsPayeeTypCdgDsply() != null) {
			claimresponsepayeetypecoding.setDisplay(c.getClmRspsPayeeTypCdgDsply());
		}
		/******************** ClmRsps_PayeeTyp_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsPayeeTypCdgSys() != null) {
			claimresponsepayeetypecoding.setSystem(c.getClmRspsPayeeTypCdgSys());
		}
		/******************** ClmRsps_PayeeTyp_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsPayeeTypCdgUsrSltd() != null) {
			claimresponsepayeetypecoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsPayeeTypCdgUsrSltd()));
		}
		/******************** ClmRsps_PayeeTyp_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsPayeeTypCdgVrsn() != null) {
			claimresponsepayeetypecoding.setVersion(c.getClmRspsPayeeTypCdgVrsn());
		}
		/******************** ClmRsps_PayeeTyp_Txt ********************************************************************************/
		if(c.getClmRspsPayeeTypTxt() != null) {
			claimresponsepayeetype.setText(c.getClmRspsPayeeTypTxt());
		}
		/******************** claimresponsepayment ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.PaymentComponent claimresponsepayment =  new org.hl7.fhir.r4.model.ClaimResponse.PaymentComponent();
		claimresponse.setPayment(claimresponsepayment);

		/******************** claimresponsepaymentadjustment ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponsepaymentadjustment =  new org.hl7.fhir.r4.model.Money();
		claimresponsepayment.setAdjustment(claimresponsepaymentadjustment);

		/******************** ClmRsps_Pymnt_Adjustment_Crncy ********************************************************************************/
		if(c.getClmRspsPymntAdjustmentCrncy() != null) {
			claimresponsepaymentadjustment.setCurrency(c.getClmRspsPymntAdjustmentCrncy());
		}
		/******************** ClmRsps_Pymnt_Adjustment_Vl ********************************************************************************/
		if(c.getClmRspsPymntAdjustmentVl() != null) {
			claimresponsepaymentadjustment.setValue(Double.parseDouble((c.getClmRspsPymntAdjustmentVl())));
		}
		/******************** claimresponsepaymentadjustmentreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsepaymentadjustmentreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponsepayment.setAdjustmentReason(claimresponsepaymentadjustmentreason);

		/******************** claimresponsepaymentadjustmentreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponsepaymentadjustmentreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponsepaymentadjustmentreason.addCoding(claimresponsepaymentadjustmentreasoncoding);

		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsPymntAdjustmentRsnCdgCd() != null) {
			claimresponsepaymentadjustmentreasoncoding.setCode(c.getClmRspsPymntAdjustmentRsnCdgCd());
		}
		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsPymntAdjustmentRsnCdgDsply() != null) {
			claimresponsepaymentadjustmentreasoncoding.setDisplay(c.getClmRspsPymntAdjustmentRsnCdgDsply());
		}
		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsPymntAdjustmentRsnCdgSys() != null) {
			claimresponsepaymentadjustmentreasoncoding.setSystem(c.getClmRspsPymntAdjustmentRsnCdgSys());
		}
		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsPymntAdjustmentRsnCdgUsrSltd() != null) {
			claimresponsepaymentadjustmentreasoncoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsPymntAdjustmentRsnCdgUsrSltd()));
		}
		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsPymntAdjustmentRsnCdgVrsn() != null) {
			claimresponsepaymentadjustmentreasoncoding.setVersion(c.getClmRspsPymntAdjustmentRsnCdgVrsn());
		}
		/******************** ClmRsps_Pymnt_AdjustmentRsn_Txt ********************************************************************************/
		if(c.getClmRspsPymntAdjustmentRsnTxt() != null) {
			claimresponsepaymentadjustmentreason.setText(c.getClmRspsPymntAdjustmentRsnTxt());
		}
		/******************** claimresponsepaymentamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponsepaymentamount =  new org.hl7.fhir.r4.model.Money();
		claimresponsepayment.setAmount(claimresponsepaymentamount);

		/******************** ClmRsps_Pymnt_Amnt_Crncy ********************************************************************************/
		if(c.getClmRspsPymntAmntCrncy() != null) {
			claimresponsepaymentamount.setCurrency(c.getClmRspsPymntAmntCrncy());
		}
		/******************** ClmRsps_Pymnt_Amnt_Vl ********************************************************************************/
		if(c.getClmRspsPymntAmntVl() != null) {
			claimresponsepaymentamount.setValue(Double.parseDouble((c.getClmRspsPymntAmntVl())));
		}
		/******************** ClmRsps_Pymnt_Dt ********************************************************************************/
		if(c.getClmRspsPymntDt() != null) {
			java.text.SimpleDateFormat ClmRsps_Pymnt_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ClmRsps_Pymnt_Dtdate = ClmRsps_Pymnt_Dtsdf.parse(c.getClmRspsPymntDt());
			claimresponsepayment.setDate(ClmRsps_Pymnt_Dtdate);
		}
		/******************** claimresponsepaymentidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier claimresponsepaymentidentifier =  new org.hl7.fhir.r4.model.Identifier();
		claimresponsepayment.setIdentifier(claimresponsepaymentidentifier);

		/******************** ClmRsps_Pymnt_Id_Assigner ********************************************************************************/
		if(c.getClmRspsPymntIdAssigner() != null) {
			claimresponsepaymentidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getClmRspsPymntIdAssigner()));
		}
		/******************** claimresponsepaymentidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimresponsepaymentidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		claimresponsepaymentidentifier.setPeriod(claimresponsepaymentidentifierperiod);

		/******************** ClmRsps_Pymnt_Id_Prd_End ********************************************************************************/
		if(c.getClmRspsPymntIdPrdEnd() != null) {
			java.text.SimpleDateFormat ClmRsps_Pymnt_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ClmRsps_Pymnt_Id_Prd_Enddate = ClmRsps_Pymnt_Id_Prd_Endsdf.parse(c.getClmRspsPymntIdPrdEnd());
			claimresponsepaymentidentifierperiod.setEnd(ClmRsps_Pymnt_Id_Prd_Enddate);
		}
		/******************** ClmRsps_Pymnt_Id_Prd_Strt ********************************************************************************/
		if(c.getClmRspsPymntIdPrdStrt() != null) {
			java.text.SimpleDateFormat ClmRsps_Pymnt_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ClmRsps_Pymnt_Id_Prd_Strtdate = ClmRsps_Pymnt_Id_Prd_Strtsdf.parse(c.getClmRspsPymntIdPrdStrt());
			claimresponsepaymentidentifierperiod.setStart(ClmRsps_Pymnt_Id_Prd_Strtdate);
		}
		/******************** ClmRsps_Pymnt_Id_Sys ********************************************************************************/
		if(c.getClmRspsPymntIdSys() != null) {
			claimresponsepaymentidentifier.setSystem(c.getClmRspsPymntIdSys());
		}
		/******************** claimresponsepaymentidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsepaymentidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponsepaymentidentifier.setType(claimresponsepaymentidentifiertype);

		/******************** claimresponsepaymentidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponsepaymentidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponsepaymentidentifiertype.addCoding(claimresponsepaymentidentifiertypecoding);

		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsPymntIdTypCdgCd() != null) {
			claimresponsepaymentidentifiertypecoding.setCode(c.getClmRspsPymntIdTypCdgCd());
		}
		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsPymntIdTypCdgDsply() != null) {
			claimresponsepaymentidentifiertypecoding.setDisplay(c.getClmRspsPymntIdTypCdgDsply());
		}
		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsPymntIdTypCdgSys() != null) {
			claimresponsepaymentidentifiertypecoding.setSystem(c.getClmRspsPymntIdTypCdgSys());
		}
		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsPymntIdTypCdgUsrSltd() != null) {
			claimresponsepaymentidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsPymntIdTypCdgUsrSltd()));
		}
		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsPymntIdTypCdgVrsn() != null) {
			claimresponsepaymentidentifiertypecoding.setVersion(c.getClmRspsPymntIdTypCdgVrsn());
		}
		/******************** ClmRsps_Pymnt_Id_Typ_Txt ********************************************************************************/
		if(c.getClmRspsPymntIdTypTxt() != null) {
			claimresponsepaymentidentifiertype.setText(c.getClmRspsPymntIdTypTxt());
		}
		/******************** claimresponsepaymentidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory claimresponsepaymentidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		claimresponsepaymentidentifier.setUse(claimresponsepaymentidentifieruse.fromCode(c.getClmRspsPymntIdUse()));

		/******************** ClmRsps_Pymnt_Id_Vl ********************************************************************************/
		if(c.getClmRspsPymntIdVl() != null) {
			claimresponsepaymentidentifier.setValue(c.getClmRspsPymntIdVl());
		}
		/******************** claimresponsepaymenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsepaymenttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponsepayment.setType(claimresponsepaymenttype);

		/******************** claimresponsepaymenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponsepaymenttypecoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponsepaymenttype.addCoding(claimresponsepaymenttypecoding);

		/******************** ClmRsps_Pymnt_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsPymntTypCdgCd() != null) {
			claimresponsepaymenttypecoding.setCode(c.getClmRspsPymntTypCdgCd());
		}
		/******************** ClmRsps_Pymnt_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsPymntTypCdgDsply() != null) {
			claimresponsepaymenttypecoding.setDisplay(c.getClmRspsPymntTypCdgDsply());
		}
		/******************** ClmRsps_Pymnt_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsPymntTypCdgSys() != null) {
			claimresponsepaymenttypecoding.setSystem(c.getClmRspsPymntTypCdgSys());
		}
		/******************** ClmRsps_Pymnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsPymntTypCdgUsrSltd() != null) {
			claimresponsepaymenttypecoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsPymntTypCdgUsrSltd()));
		}
		/******************** ClmRsps_Pymnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsPymntTypCdgVrsn() != null) {
			claimresponsepaymenttypecoding.setVersion(c.getClmRspsPymntTypCdgVrsn());
		}
		/******************** ClmRsps_Pymnt_Typ_Txt ********************************************************************************/
		if(c.getClmRspsPymntTypTxt() != null) {
			claimresponsepaymenttype.setText(c.getClmRspsPymntTypTxt());
		}
		/******************** claimresponsepreauthperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimresponsepreauthperiod =  new org.hl7.fhir.r4.model.Period();
		claimresponse.setPreAuthPeriod(claimresponsepreauthperiod);

		/******************** ClmRsps_PreAuthPrd_End ********************************************************************************/
		if(c.getClmRspsPreAuthPrdEnd() != null) {
			java.text.SimpleDateFormat ClmRsps_PreAuthPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ClmRsps_PreAuthPrd_Enddate = ClmRsps_PreAuthPrd_Endsdf.parse(c.getClmRspsPreAuthPrdEnd());
			claimresponsepreauthperiod.setEnd(ClmRsps_PreAuthPrd_Enddate);
		}
		/******************** ClmRsps_PreAuthPrd_Strt ********************************************************************************/
		if(c.getClmRspsPreAuthPrdStrt() != null) {
			java.text.SimpleDateFormat ClmRsps_PreAuthPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ClmRsps_PreAuthPrd_Strtdate = ClmRsps_PreAuthPrd_Strtsdf.parse(c.getClmRspsPreAuthPrdStrt());
			claimresponsepreauthperiod.setStart(ClmRsps_PreAuthPrd_Strtdate);
		}
		/******************** ClmRsps_PreAuthRef ********************************************************************************/
		if(c.getClmRspsPreAuthRef() != null) {
			claimresponse.setPreAuthRef(c.getClmRspsPreAuthRef());
		}
		/******************** claimresponseprocessnote ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.NoteComponent claimresponseprocessnote =  new org.hl7.fhir.r4.model.ClaimResponse.NoteComponent();
		claimresponse.addProcessNote(claimresponseprocessnote);

		/******************** claimresponseprocessnotelanguage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseprocessnotelanguage =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponseprocessnote.setLanguage(claimresponseprocessnotelanguage);

		/******************** claimresponseprocessnotelanguagecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponseprocessnotelanguagecoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponseprocessnotelanguage.addCoding(claimresponseprocessnotelanguagecoding);

		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsProcessNtLnguageCdgCd() != null) {
			claimresponseprocessnotelanguagecoding.setCode(c.getClmRspsProcessNtLnguageCdgCd());
		}
		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsProcessNtLnguageCdgDsply() != null) {
			claimresponseprocessnotelanguagecoding.setDisplay(c.getClmRspsProcessNtLnguageCdgDsply());
		}
		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsProcessNtLnguageCdgSys() != null) {
			claimresponseprocessnotelanguagecoding.setSystem(c.getClmRspsProcessNtLnguageCdgSys());
		}
		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsProcessNtLnguageCdgUsrSltd() != null) {
			claimresponseprocessnotelanguagecoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsProcessNtLnguageCdgUsrSltd()));
		}
		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsProcessNtLnguageCdgVrsn() != null) {
			claimresponseprocessnotelanguagecoding.setVersion(c.getClmRspsProcessNtLnguageCdgVrsn());
		}
		/******************** ClmRsps_ProcessNt_Lnguage_Txt ********************************************************************************/
		if(c.getClmRspsProcessNtLnguageTxt() != null) {
			claimresponseprocessnotelanguage.setText(c.getClmRspsProcessNtLnguageTxt());
		}
		/******************** ClmRsps_ProcessNt_Nmbr ********************************************************************************/
		if(c.getClmRspsProcessNtNmbr() != null) {
			claimresponseprocessnote.setNumber(Integer.parseInt(c.getClmRspsProcessNtNmbr()));
		}
		/******************** ClmRsps_ProcessNt_Txt ********************************************************************************/
		if(c.getClmRspsProcessNtTxt() != null) {
			claimresponseprocessnote.setText(c.getClmRspsProcessNtTxt());
		}
		/******************** claimresponseprocessnotetype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.NoteTypeEnumFactory claimresponseprocessnotetype =  new org.hl7.fhir.r4.model.Enumerations.NoteTypeEnumFactory();
		claimresponseprocessnote.setType(claimresponseprocessnotetype.fromCode(c.getClmRspsProcessNtTyp()));

		/******************** ClmRsps_Rqst ********************************************************************************/
		if(c.getClmRspsRqst() != null) {
			claimresponse.setRequest( new org.hl7.fhir.r4.model.Reference(c.getClmRspsRqst()));
		}
		/******************** ClmRsps_Rqstor ********************************************************************************/
		if(c.getClmRspsRqstor() != null) {
			claimresponse.setRequestor( new org.hl7.fhir.r4.model.Reference(c.getClmRspsRqstor()));
		}
		/******************** claimresponsestatus ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.ClaimResponseStatusEnumFactory claimresponsestatus =  new org.hl7.fhir.r4.model.ClaimResponse.ClaimResponseStatusEnumFactory();
		claimresponse.setStatus(claimresponsestatus.fromCode(c.getClmRspsSts()));

		/******************** claimresponsesubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsesubtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponse.setSubType(claimresponsesubtype);

		/******************** claimresponsesubtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponsesubtypecoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponsesubtype.addCoding(claimresponsesubtypecoding);

		/******************** ClmRsps_SubTyp_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsSubTypCdgCd() != null) {
			claimresponsesubtypecoding.setCode(c.getClmRspsSubTypCdgCd());
		}
		/******************** ClmRsps_SubTyp_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsSubTypCdgDsply() != null) {
			claimresponsesubtypecoding.setDisplay(c.getClmRspsSubTypCdgDsply());
		}
		/******************** ClmRsps_SubTyp_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsSubTypCdgSys() != null) {
			claimresponsesubtypecoding.setSystem(c.getClmRspsSubTypCdgSys());
		}
		/******************** ClmRsps_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsSubTypCdgUsrSltd() != null) {
			claimresponsesubtypecoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsSubTypCdgUsrSltd()));
		}
		/******************** ClmRsps_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsSubTypCdgVrsn() != null) {
			claimresponsesubtypecoding.setVersion(c.getClmRspsSubTypCdgVrsn());
		}
		/******************** ClmRsps_SubTyp_Txt ********************************************************************************/
		if(c.getClmRspsSubTypTxt() != null) {
			claimresponsesubtype.setText(c.getClmRspsSubTypTxt());
		}
		/******************** claimresponsetotal ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.TotalComponent claimresponsetotal =  new org.hl7.fhir.r4.model.ClaimResponse.TotalComponent();
		claimresponse.addTotal(claimresponsetotal);

		/******************** claimresponsetotalamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponsetotalamount =  new org.hl7.fhir.r4.model.Money();
		claimresponsetotal.setAmount(claimresponsetotalamount);

		/******************** ClmRsps_Total_Amnt_Crncy ********************************************************************************/
		if(c.getClmRspsTotalAmntCrncy() != null) {
			claimresponsetotalamount.setCurrency(c.getClmRspsTotalAmntCrncy());
		}
		/******************** ClmRsps_Total_Amnt_Vl ********************************************************************************/
		if(c.getClmRspsTotalAmntVl() != null) {
			claimresponsetotalamount.setValue(Double.parseDouble((c.getClmRspsTotalAmntVl())));
		}
		/******************** claimresponsetotalcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsetotalcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponsetotal.setCategory(claimresponsetotalcategory);

		/******************** claimresponsetotalcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponsetotalcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponsetotalcategory.addCoding(claimresponsetotalcategorycoding);

		/******************** ClmRsps_Total_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsTotalCtgryCdgCd() != null) {
			claimresponsetotalcategorycoding.setCode(c.getClmRspsTotalCtgryCdgCd());
		}
		/******************** ClmRsps_Total_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsTotalCtgryCdgDsply() != null) {
			claimresponsetotalcategorycoding.setDisplay(c.getClmRspsTotalCtgryCdgDsply());
		}
		/******************** ClmRsps_Total_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsTotalCtgryCdgSys() != null) {
			claimresponsetotalcategorycoding.setSystem(c.getClmRspsTotalCtgryCdgSys());
		}
		/******************** ClmRsps_Total_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsTotalCtgryCdgUsrSltd() != null) {
			claimresponsetotalcategorycoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsTotalCtgryCdgUsrSltd()));
		}
		/******************** ClmRsps_Total_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsTotalCtgryCdgVrsn() != null) {
			claimresponsetotalcategorycoding.setVersion(c.getClmRspsTotalCtgryCdgVrsn());
		}
		/******************** ClmRsps_Total_Ctgry_Txt ********************************************************************************/
		if(c.getClmRspsTotalCtgryTxt() != null) {
			claimresponsetotalcategory.setText(c.getClmRspsTotalCtgryTxt());
		}
		/******************** claimresponsetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimresponse.setType(claimresponsetype);

		/******************** claimresponsetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimresponsetypecoding =  new org.hl7.fhir.r4.model.Coding();
		claimresponsetype.addCoding(claimresponsetypecoding);

		/******************** ClmRsps_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmRspsTypCdgCd() != null) {
			claimresponsetypecoding.setCode(c.getClmRspsTypCdgCd());
		}
		/******************** ClmRsps_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmRspsTypCdgDsply() != null) {
			claimresponsetypecoding.setDisplay(c.getClmRspsTypCdgDsply());
		}
		/******************** ClmRsps_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmRspsTypCdgSys() != null) {
			claimresponsetypecoding.setSystem(c.getClmRspsTypCdgSys());
		}
		/******************** ClmRsps_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRspsTypCdgUsrSltd() != null) {
			claimresponsetypecoding.setUserSelected(Boolean.parseBoolean(c.getClmRspsTypCdgUsrSltd()));
		}
		/******************** ClmRsps_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRspsTypCdgVrsn() != null) {
			claimresponsetypecoding.setVersion(c.getClmRspsTypCdgVrsn());
		}
		/******************** ClmRsps_Typ_Txt ********************************************************************************/
		if(c.getClmRspsTypTxt() != null) {
			claimresponsetype.setText(c.getClmRspsTypTxt());
		}
		/******************** claimresponseuse ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.UseEnumFactory claimresponseuse =  new org.hl7.fhir.r4.model.ClaimResponse.UseEnumFactory();
		claimresponse.setUse(claimresponseuse.fromCode(c.getClmRspsUse()));

		return claimresponse;
	}
}
