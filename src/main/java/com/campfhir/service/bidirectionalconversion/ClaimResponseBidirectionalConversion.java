package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ClaimResponse;
public class ClaimResponseBidirectionalConversion 
{
	public ClaimResponse ClaimResponses(org.hl7.fhir.r4.model.ClaimResponse claimresponse) throws ParseException
	{
		 main.java.com.campfhir.model.ClaimResponse c = new  main.java.com.campfhir.model.ClaimResponse();

		/******************** id ********************************************************************************/
		c.setId(claimresponse.getIdElement().getIdPart());

		/******************** claimresponsetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsetype = claimresponse.getType();

		/******************** ClmRsps_Typ_Txt ********************************************************************************/
		if(claimresponsetype.hasText()) {

			c.addClmRspsTypTxt(String.valueOf(claimresponsetype.getText()));
		} else {
			c.addClmRspsTypTxt("NULL");
		}


		/******************** claimresponsetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponsetypecodinglist = claimresponsetype.getCoding();
		for(int claimresponsetypecodingi = 0; claimresponsetypecodingi<claimresponsetypecodinglist.size();claimresponsetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponsetypecoding = claimresponsetypecodinglist.get(claimresponsetypecodingi);

		/******************** ClmRsps_Typ_Cdg_Dsply ********************************************************************************/
		if(claimresponsetypecodingi == 0) {c.addClmRspsTypCdgDsply("[");}
		if(claimresponsetypecoding.hasDisplay()) {

			c.addClmRspsTypCdgDsply(String.valueOf(claimresponsetypecoding.getDisplay()));
		} else {
			c.addClmRspsTypCdgDsply("NULL");
		}

		if(claimresponsetypecodingi == claimresponsetypecodinglist.size()-1) {c.addClmRspsTypCdgDsply("]");}


		/******************** ClmRsps_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimresponsetypecodingi == 0) {c.addClmRspsTypCdgVrsn("[");}
		if(claimresponsetypecoding.hasVersion()) {

			c.addClmRspsTypCdgVrsn(String.valueOf(claimresponsetypecoding.getVersion()));
		} else {
			c.addClmRspsTypCdgVrsn("NULL");
		}

		if(claimresponsetypecodingi == claimresponsetypecodinglist.size()-1) {c.addClmRspsTypCdgVrsn("]");}


		/******************** ClmRsps_Typ_Cdg_Cd ********************************************************************************/
		if(claimresponsetypecodingi == 0) {c.addClmRspsTypCdgCd("[");}
		if(claimresponsetypecoding.hasCode()) {

			c.addClmRspsTypCdgCd(String.valueOf(claimresponsetypecoding.getCode()));
		} else {
			c.addClmRspsTypCdgCd("NULL");
		}

		if(claimresponsetypecodingi == claimresponsetypecodinglist.size()-1) {c.addClmRspsTypCdgCd("]");}


		/******************** ClmRsps_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimresponsetypecodingi == 0) {c.addClmRspsTypCdgUsrSltd("[");}
		if(claimresponsetypecoding.hasUserSelected()) {

			c.addClmRspsTypCdgUsrSltd(String.valueOf(claimresponsetypecoding.getUserSelected()));
		} else {
			c.addClmRspsTypCdgUsrSltd("NULL");
		}

		if(claimresponsetypecodingi == claimresponsetypecodinglist.size()-1) {c.addClmRspsTypCdgUsrSltd("]");}


		/******************** ClmRsps_Typ_Cdg_Sys ********************************************************************************/
		if(claimresponsetypecodingi == 0) {c.addClmRspsTypCdgSys("[");}
		if(claimresponsetypecoding.hasSystem()) {

			c.addClmRspsTypCdgSys(String.valueOf(claimresponsetypecoding.getSystem()));
		} else {
			c.addClmRspsTypCdgSys("NULL");
		}

		if(claimresponsetypecodingi == claimresponsetypecodinglist.size()-1) {c.addClmRspsTypCdgSys("]");}


		 };
		/******************** claimresponseitem ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ClaimResponse.ItemComponent> claimresponseitemlist = claimresponse.getItem();
		for(int claimresponseitemi = 0; claimresponseitemi<claimresponseitemlist.size();claimresponseitemi++ ) {
		org.hl7.fhir.r4.model.ClaimResponse.ItemComponent  claimresponseitem = claimresponseitemlist.get(claimresponseitemi);

		/******************** claimresponseitemdetail ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ClaimResponse.ItemDetailComponent> claimresponseitemdetaillist = claimresponseitem.getDetail();
		for(int claimresponseitemdetaili = 0; claimresponseitemdetaili<claimresponseitemdetaillist.size();claimresponseitemdetaili++ ) {
		org.hl7.fhir.r4.model.ClaimResponse.ItemDetailComponent  claimresponseitemdetail = claimresponseitemdetaillist.get(claimresponseitemdetaili);

		/******************** claimresponseitemdetailadjudication ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent> claimresponseitemdetailadjudicationlist = claimresponseitemdetail.getAdjudication();
		for(int claimresponseitemdetailadjudicationi = 0; claimresponseitemdetailadjudicationi<claimresponseitemdetailadjudicationlist.size();claimresponseitemdetailadjudicationi++ ) {
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent  claimresponseitemdetailadjudication = claimresponseitemdetailadjudicationlist.get(claimresponseitemdetailadjudicationi);

		/******************** ClmRsps_Itm_Dtl_Adjdctn_Vl ********************************************************************************/
		if(claimresponseitemdetailadjudicationi == 0) {c.addClmRspsItmDtlAdjdctnVl("[[[");}
		if(claimresponseitemdetailadjudication.hasValue()) {

			c.addClmRspsItmDtlAdjdctnVl(String.valueOf(claimresponseitemdetailadjudication.getValue()));
		} else {
			c.addClmRspsItmDtlAdjdctnVl("NULL");
		}

		if(claimresponseitemdetailadjudicationi == claimresponseitemdetailadjudicationlist.size()-1) {c.addClmRspsItmDtlAdjdctnVl("]]]");}


		/******************** claimresponseitemdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseitemdetailadjudicationreason = claimresponseitemdetailadjudication.getReason();

		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(claimresponseitemdetailadjudicationi == 0) {c.addClmRspsItmDtlAdjdctnRsnTxt("[[[");}
		if(claimresponseitemdetailadjudicationreason.hasText()) {

			c.addClmRspsItmDtlAdjdctnRsnTxt(String.valueOf(claimresponseitemdetailadjudicationreason.getText()));
		} else {
			c.addClmRspsItmDtlAdjdctnRsnTxt("NULL");
		}

		if(claimresponseitemdetailadjudicationi == claimresponseitemdetailadjudicationlist.size()-1) {c.addClmRspsItmDtlAdjdctnRsnTxt("]]]");}


		/******************** claimresponseitemdetailadjudicationreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseitemdetailadjudicationreasoncodinglist = claimresponseitemdetailadjudicationreason.getCoding();
		for(int claimresponseitemdetailadjudicationreasoncodingi = 0; claimresponseitemdetailadjudicationreasoncodingi<claimresponseitemdetailadjudicationreasoncodinglist.size();claimresponseitemdetailadjudicationreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseitemdetailadjudicationreasoncoding = claimresponseitemdetailadjudicationreasoncodinglist.get(claimresponseitemdetailadjudicationreasoncodingi);

		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(claimresponseitemdetailadjudicationreasoncodingi == 0) {c.addClmRspsItmDtlAdjdctnRsnCdgDsply("[[[[");}
		if(claimresponseitemdetailadjudicationreasoncoding.hasDisplay()) {

			c.addClmRspsItmDtlAdjdctnRsnCdgDsply(String.valueOf(claimresponseitemdetailadjudicationreasoncoding.getDisplay()));
		} else {
			c.addClmRspsItmDtlAdjdctnRsnCdgDsply("NULL");
		}

		if(claimresponseitemdetailadjudicationreasoncodingi == claimresponseitemdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsItmDtlAdjdctnRsnCdgDsply("]]]]");}


		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(claimresponseitemdetailadjudicationreasoncodingi == 0) {c.addClmRspsItmDtlAdjdctnRsnCdgVrsn("[[[[");}
		if(claimresponseitemdetailadjudicationreasoncoding.hasVersion()) {

			c.addClmRspsItmDtlAdjdctnRsnCdgVrsn(String.valueOf(claimresponseitemdetailadjudicationreasoncoding.getVersion()));
		} else {
			c.addClmRspsItmDtlAdjdctnRsnCdgVrsn("NULL");
		}

		if(claimresponseitemdetailadjudicationreasoncodingi == claimresponseitemdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsItmDtlAdjdctnRsnCdgVrsn("]]]]");}


		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(claimresponseitemdetailadjudicationreasoncodingi == 0) {c.addClmRspsItmDtlAdjdctnRsnCdgCd("[[[[");}
		if(claimresponseitemdetailadjudicationreasoncoding.hasCode()) {

			c.addClmRspsItmDtlAdjdctnRsnCdgCd(String.valueOf(claimresponseitemdetailadjudicationreasoncoding.getCode()));
		} else {
			c.addClmRspsItmDtlAdjdctnRsnCdgCd("NULL");
		}

		if(claimresponseitemdetailadjudicationreasoncodingi == claimresponseitemdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsItmDtlAdjdctnRsnCdgCd("]]]]");}


		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseitemdetailadjudicationreasoncodingi == 0) {c.addClmRspsItmDtlAdjdctnRsnCdgUsrSltd("[[[[");}
		if(claimresponseitemdetailadjudicationreasoncoding.hasUserSelected()) {

			c.addClmRspsItmDtlAdjdctnRsnCdgUsrSltd(String.valueOf(claimresponseitemdetailadjudicationreasoncoding.getUserSelected()));
		} else {
			c.addClmRspsItmDtlAdjdctnRsnCdgUsrSltd("NULL");
		}

		if(claimresponseitemdetailadjudicationreasoncodingi == claimresponseitemdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsItmDtlAdjdctnRsnCdgUsrSltd("]]]]");}


		/******************** ClmRsps_Itm_Dtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(claimresponseitemdetailadjudicationreasoncodingi == 0) {c.addClmRspsItmDtlAdjdctnRsnCdgSys("[[[[");}
		if(claimresponseitemdetailadjudicationreasoncoding.hasSystem()) {

			c.addClmRspsItmDtlAdjdctnRsnCdgSys(String.valueOf(claimresponseitemdetailadjudicationreasoncoding.getSystem()));
		} else {
			c.addClmRspsItmDtlAdjdctnRsnCdgSys("NULL");
		}

		if(claimresponseitemdetailadjudicationreasoncodingi == claimresponseitemdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsItmDtlAdjdctnRsnCdgSys("]]]]");}


		 };
		/******************** claimresponseitemdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseitemdetailadjudicationcategory = claimresponseitemdetailadjudication.getCategory();

		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(claimresponseitemdetailadjudicationi == 0) {c.addClmRspsItmDtlAdjdctnCtgryTxt("[[[");}
		if(claimresponseitemdetailadjudicationcategory.hasText()) {

			c.addClmRspsItmDtlAdjdctnCtgryTxt(String.valueOf(claimresponseitemdetailadjudicationcategory.getText()));
		} else {
			c.addClmRspsItmDtlAdjdctnCtgryTxt("NULL");
		}

		if(claimresponseitemdetailadjudicationi == claimresponseitemdetailadjudicationlist.size()-1) {c.addClmRspsItmDtlAdjdctnCtgryTxt("]]]");}


		/******************** claimresponseitemdetailadjudicationcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseitemdetailadjudicationcategorycodinglist = claimresponseitemdetailadjudicationcategory.getCoding();
		for(int claimresponseitemdetailadjudicationcategorycodingi = 0; claimresponseitemdetailadjudicationcategorycodingi<claimresponseitemdetailadjudicationcategorycodinglist.size();claimresponseitemdetailadjudicationcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseitemdetailadjudicationcategorycoding = claimresponseitemdetailadjudicationcategorycodinglist.get(claimresponseitemdetailadjudicationcategorycodingi);

		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimresponseitemdetailadjudicationcategorycodingi == 0) {c.addClmRspsItmDtlAdjdctnCtgryCdgDsply("[[[[");}
		if(claimresponseitemdetailadjudicationcategorycoding.hasDisplay()) {

			c.addClmRspsItmDtlAdjdctnCtgryCdgDsply(String.valueOf(claimresponseitemdetailadjudicationcategorycoding.getDisplay()));
		} else {
			c.addClmRspsItmDtlAdjdctnCtgryCdgDsply("NULL");
		}

		if(claimresponseitemdetailadjudicationcategorycodingi == claimresponseitemdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsItmDtlAdjdctnCtgryCdgDsply("]]]]");}


		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimresponseitemdetailadjudicationcategorycodingi == 0) {c.addClmRspsItmDtlAdjdctnCtgryCdgVrsn("[[[[");}
		if(claimresponseitemdetailadjudicationcategorycoding.hasVersion()) {

			c.addClmRspsItmDtlAdjdctnCtgryCdgVrsn(String.valueOf(claimresponseitemdetailadjudicationcategorycoding.getVersion()));
		} else {
			c.addClmRspsItmDtlAdjdctnCtgryCdgVrsn("NULL");
		}

		if(claimresponseitemdetailadjudicationcategorycodingi == claimresponseitemdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsItmDtlAdjdctnCtgryCdgVrsn("]]]]");}


		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimresponseitemdetailadjudicationcategorycodingi == 0) {c.addClmRspsItmDtlAdjdctnCtgryCdgCd("[[[[");}
		if(claimresponseitemdetailadjudicationcategorycoding.hasCode()) {

			c.addClmRspsItmDtlAdjdctnCtgryCdgCd(String.valueOf(claimresponseitemdetailadjudicationcategorycoding.getCode()));
		} else {
			c.addClmRspsItmDtlAdjdctnCtgryCdgCd("NULL");
		}

		if(claimresponseitemdetailadjudicationcategorycodingi == claimresponseitemdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsItmDtlAdjdctnCtgryCdgCd("]]]]");}


		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseitemdetailadjudicationcategorycodingi == 0) {c.addClmRspsItmDtlAdjdctnCtgryCdgUsrSltd("[[[[");}
		if(claimresponseitemdetailadjudicationcategorycoding.hasUserSelected()) {

			c.addClmRspsItmDtlAdjdctnCtgryCdgUsrSltd(String.valueOf(claimresponseitemdetailadjudicationcategorycoding.getUserSelected()));
		} else {
			c.addClmRspsItmDtlAdjdctnCtgryCdgUsrSltd("NULL");
		}

		if(claimresponseitemdetailadjudicationcategorycodingi == claimresponseitemdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsItmDtlAdjdctnCtgryCdgUsrSltd("]]]]");}


		/******************** ClmRsps_Itm_Dtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimresponseitemdetailadjudicationcategorycodingi == 0) {c.addClmRspsItmDtlAdjdctnCtgryCdgSys("[[[[");}
		if(claimresponseitemdetailadjudicationcategorycoding.hasSystem()) {

			c.addClmRspsItmDtlAdjdctnCtgryCdgSys(String.valueOf(claimresponseitemdetailadjudicationcategorycoding.getSystem()));
		} else {
			c.addClmRspsItmDtlAdjdctnCtgryCdgSys("NULL");
		}

		if(claimresponseitemdetailadjudicationcategorycodingi == claimresponseitemdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsItmDtlAdjdctnCtgryCdgSys("]]]]");}


		 };
		/******************** claimresponseitemdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseitemdetailadjudicationamount = claimresponseitemdetailadjudication.getAmount();

		/******************** ClmRsps_Itm_Dtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(claimresponseitemdetailadjudicationi == 0) {c.addClmRspsItmDtlAdjdctnAmntVl("[[[");}
		if(claimresponseitemdetailadjudicationamount.hasValue()) {

			c.addClmRspsItmDtlAdjdctnAmntVl(String.valueOf(claimresponseitemdetailadjudicationamount.getValue()));
		} else {
			c.addClmRspsItmDtlAdjdctnAmntVl("NULL");
		}

		if(claimresponseitemdetailadjudicationi == claimresponseitemdetailadjudicationlist.size()-1) {c.addClmRspsItmDtlAdjdctnAmntVl("]]]");}


		/******************** ClmRsps_Itm_Dtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(claimresponseitemdetailadjudicationi == 0) {c.addClmRspsItmDtlAdjdctnAmntCrncy("[[[");}
		if(claimresponseitemdetailadjudicationamount.hasCurrency()) {

			c.addClmRspsItmDtlAdjdctnAmntCrncy(String.valueOf(claimresponseitemdetailadjudicationamount.getCurrency()));
		} else {
			c.addClmRspsItmDtlAdjdctnAmntCrncy("NULL");
		}

		if(claimresponseitemdetailadjudicationi == claimresponseitemdetailadjudicationlist.size()-1) {c.addClmRspsItmDtlAdjdctnAmntCrncy("]]]");}


		 };
		/******************** claimresponseitemdetailsubdetail ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ClaimResponse.SubDetailComponent> claimresponseitemdetailsubdetaillist = claimresponseitemdetail.getSubDetail();
		for(int claimresponseitemdetailsubdetaili = 0; claimresponseitemdetailsubdetaili<claimresponseitemdetailsubdetaillist.size();claimresponseitemdetailsubdetaili++ ) {
		org.hl7.fhir.r4.model.ClaimResponse.SubDetailComponent  claimresponseitemdetailsubdetail = claimresponseitemdetailsubdetaillist.get(claimresponseitemdetailsubdetaili);

		/******************** claimresponseitemdetailsubdetailadjudication ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent> claimresponseitemdetailsubdetailadjudicationlist = claimresponseitemdetailsubdetail.getAdjudication();
		for(int claimresponseitemdetailsubdetailadjudicationi = 0; claimresponseitemdetailsubdetailadjudicationi<claimresponseitemdetailsubdetailadjudicationlist.size();claimresponseitemdetailsubdetailadjudicationi++ ) {
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent  claimresponseitemdetailsubdetailadjudication = claimresponseitemdetailsubdetailadjudicationlist.get(claimresponseitemdetailsubdetailadjudicationi);

		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Vl ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationi == 0) {c.addClmRspsItmDtlSubDtlAdjdctnVl("[[[[");}
		if(claimresponseitemdetailsubdetailadjudication.hasValue()) {

			c.addClmRspsItmDtlSubDtlAdjdctnVl(String.valueOf(claimresponseitemdetailsubdetailadjudication.getValue()));
		} else {
			c.addClmRspsItmDtlSubDtlAdjdctnVl("NULL");
		}

		if(claimresponseitemdetailsubdetailadjudicationi == claimresponseitemdetailsubdetailadjudicationlist.size()-1) {c.addClmRspsItmDtlSubDtlAdjdctnVl("]]]]");}


		/******************** claimresponseitemdetailsubdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseitemdetailsubdetailadjudicationreason = claimresponseitemdetailsubdetailadjudication.getReason();

		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationi == 0) {c.addClmRspsItmDtlSubDtlAdjdctnRsnTxt("[[[[");}
		if(claimresponseitemdetailsubdetailadjudicationreason.hasText()) {

			c.addClmRspsItmDtlSubDtlAdjdctnRsnTxt(String.valueOf(claimresponseitemdetailsubdetailadjudicationreason.getText()));
		} else {
			c.addClmRspsItmDtlSubDtlAdjdctnRsnTxt("NULL");
		}

		if(claimresponseitemdetailsubdetailadjudicationi == claimresponseitemdetailsubdetailadjudicationlist.size()-1) {c.addClmRspsItmDtlSubDtlAdjdctnRsnTxt("]]]]");}


		/******************** claimresponseitemdetailsubdetailadjudicationreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseitemdetailsubdetailadjudicationreasoncodinglist = claimresponseitemdetailsubdetailadjudicationreason.getCoding();
		for(int claimresponseitemdetailsubdetailadjudicationreasoncodingi = 0; claimresponseitemdetailsubdetailadjudicationreasoncodingi<claimresponseitemdetailsubdetailadjudicationreasoncodinglist.size();claimresponseitemdetailsubdetailadjudicationreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseitemdetailsubdetailadjudicationreasoncoding = claimresponseitemdetailsubdetailadjudicationreasoncodinglist.get(claimresponseitemdetailsubdetailadjudicationreasoncodingi);

		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationreasoncodingi == 0) {c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgDsply("[[[[[");}
		if(claimresponseitemdetailsubdetailadjudicationreasoncoding.hasDisplay()) {

			c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgDsply(String.valueOf(claimresponseitemdetailsubdetailadjudicationreasoncoding.getDisplay()));
		} else {
			c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgDsply("NULL");
		}

		if(claimresponseitemdetailsubdetailadjudicationreasoncodingi == claimresponseitemdetailsubdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgDsply("]]]]]");}


		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationreasoncodingi == 0) {c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgVrsn("[[[[[");}
		if(claimresponseitemdetailsubdetailadjudicationreasoncoding.hasVersion()) {

			c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgVrsn(String.valueOf(claimresponseitemdetailsubdetailadjudicationreasoncoding.getVersion()));
		} else {
			c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgVrsn("NULL");
		}

		if(claimresponseitemdetailsubdetailadjudicationreasoncodingi == claimresponseitemdetailsubdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgVrsn("]]]]]");}


		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationreasoncodingi == 0) {c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgCd("[[[[[");}
		if(claimresponseitemdetailsubdetailadjudicationreasoncoding.hasCode()) {

			c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgCd(String.valueOf(claimresponseitemdetailsubdetailadjudicationreasoncoding.getCode()));
		} else {
			c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgCd("NULL");
		}

		if(claimresponseitemdetailsubdetailadjudicationreasoncodingi == claimresponseitemdetailsubdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgCd("]]]]]");}


		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationreasoncodingi == 0) {c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgUsrSltd("[[[[[");}
		if(claimresponseitemdetailsubdetailadjudicationreasoncoding.hasUserSelected()) {

			c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgUsrSltd(String.valueOf(claimresponseitemdetailsubdetailadjudicationreasoncoding.getUserSelected()));
		} else {
			c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgUsrSltd("NULL");
		}

		if(claimresponseitemdetailsubdetailadjudicationreasoncodingi == claimresponseitemdetailsubdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgUsrSltd("]]]]]");}


		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationreasoncodingi == 0) {c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgSys("[[[[[");}
		if(claimresponseitemdetailsubdetailadjudicationreasoncoding.hasSystem()) {

			c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgSys(String.valueOf(claimresponseitemdetailsubdetailadjudicationreasoncoding.getSystem()));
		} else {
			c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgSys("NULL");
		}

		if(claimresponseitemdetailsubdetailadjudicationreasoncodingi == claimresponseitemdetailsubdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsItmDtlSubDtlAdjdctnRsnCdgSys("]]]]]");}


		 };
		/******************** claimresponseitemdetailsubdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseitemdetailsubdetailadjudicationcategory = claimresponseitemdetailsubdetailadjudication.getCategory();

		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationi == 0) {c.addClmRspsItmDtlSubDtlAdjdctnCtgryTxt("[[[[");}
		if(claimresponseitemdetailsubdetailadjudicationcategory.hasText()) {

			c.addClmRspsItmDtlSubDtlAdjdctnCtgryTxt(String.valueOf(claimresponseitemdetailsubdetailadjudicationcategory.getText()));
		} else {
			c.addClmRspsItmDtlSubDtlAdjdctnCtgryTxt("NULL");
		}

		if(claimresponseitemdetailsubdetailadjudicationi == claimresponseitemdetailsubdetailadjudicationlist.size()-1) {c.addClmRspsItmDtlSubDtlAdjdctnCtgryTxt("]]]]");}


		/******************** claimresponseitemdetailsubdetailadjudicationcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseitemdetailsubdetailadjudicationcategorycodinglist = claimresponseitemdetailsubdetailadjudicationcategory.getCoding();
		for(int claimresponseitemdetailsubdetailadjudicationcategorycodingi = 0; claimresponseitemdetailsubdetailadjudicationcategorycodingi<claimresponseitemdetailsubdetailadjudicationcategorycodinglist.size();claimresponseitemdetailsubdetailadjudicationcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseitemdetailsubdetailadjudicationcategorycoding = claimresponseitemdetailsubdetailadjudicationcategorycodinglist.get(claimresponseitemdetailsubdetailadjudicationcategorycodingi);

		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationcategorycodingi == 0) {c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgDsply("[[[[[");}
		if(claimresponseitemdetailsubdetailadjudicationcategorycoding.hasDisplay()) {

			c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgDsply(String.valueOf(claimresponseitemdetailsubdetailadjudicationcategorycoding.getDisplay()));
		} else {
			c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgDsply("NULL");
		}

		if(claimresponseitemdetailsubdetailadjudicationcategorycodingi == claimresponseitemdetailsubdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgDsply("]]]]]");}


		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationcategorycodingi == 0) {c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgVrsn("[[[[[");}
		if(claimresponseitemdetailsubdetailadjudicationcategorycoding.hasVersion()) {

			c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgVrsn(String.valueOf(claimresponseitemdetailsubdetailadjudicationcategorycoding.getVersion()));
		} else {
			c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgVrsn("NULL");
		}

		if(claimresponseitemdetailsubdetailadjudicationcategorycodingi == claimresponseitemdetailsubdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgVrsn("]]]]]");}


		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationcategorycodingi == 0) {c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgCd("[[[[[");}
		if(claimresponseitemdetailsubdetailadjudicationcategorycoding.hasCode()) {

			c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgCd(String.valueOf(claimresponseitemdetailsubdetailadjudicationcategorycoding.getCode()));
		} else {
			c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgCd("NULL");
		}

		if(claimresponseitemdetailsubdetailadjudicationcategorycodingi == claimresponseitemdetailsubdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgCd("]]]]]");}


		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationcategorycodingi == 0) {c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgUsrSltd("[[[[[");}
		if(claimresponseitemdetailsubdetailadjudicationcategorycoding.hasUserSelected()) {

			c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgUsrSltd(String.valueOf(claimresponseitemdetailsubdetailadjudicationcategorycoding.getUserSelected()));
		} else {
			c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgUsrSltd("NULL");
		}

		if(claimresponseitemdetailsubdetailadjudicationcategorycodingi == claimresponseitemdetailsubdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgUsrSltd("]]]]]");}


		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationcategorycodingi == 0) {c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgSys("[[[[[");}
		if(claimresponseitemdetailsubdetailadjudicationcategorycoding.hasSystem()) {

			c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgSys(String.valueOf(claimresponseitemdetailsubdetailadjudicationcategorycoding.getSystem()));
		} else {
			c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgSys("NULL");
		}

		if(claimresponseitemdetailsubdetailadjudicationcategorycodingi == claimresponseitemdetailsubdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsItmDtlSubDtlAdjdctnCtgryCdgSys("]]]]]");}


		 };
		/******************** claimresponseitemdetailsubdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseitemdetailsubdetailadjudicationamount = claimresponseitemdetailsubdetailadjudication.getAmount();

		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationi == 0) {c.addClmRspsItmDtlSubDtlAdjdctnAmntVl("[[[[");}
		if(claimresponseitemdetailsubdetailadjudicationamount.hasValue()) {

			c.addClmRspsItmDtlSubDtlAdjdctnAmntVl(String.valueOf(claimresponseitemdetailsubdetailadjudicationamount.getValue()));
		} else {
			c.addClmRspsItmDtlSubDtlAdjdctnAmntVl("NULL");
		}

		if(claimresponseitemdetailsubdetailadjudicationi == claimresponseitemdetailsubdetailadjudicationlist.size()-1) {c.addClmRspsItmDtlSubDtlAdjdctnAmntVl("]]]]");}


		/******************** ClmRsps_Itm_Dtl_SubDtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(claimresponseitemdetailsubdetailadjudicationi == 0) {c.addClmRspsItmDtlSubDtlAdjdctnAmntCrncy("[[[[");}
		if(claimresponseitemdetailsubdetailadjudicationamount.hasCurrency()) {

			c.addClmRspsItmDtlSubDtlAdjdctnAmntCrncy(String.valueOf(claimresponseitemdetailsubdetailadjudicationamount.getCurrency()));
		} else {
			c.addClmRspsItmDtlSubDtlAdjdctnAmntCrncy("NULL");
		}

		if(claimresponseitemdetailsubdetailadjudicationi == claimresponseitemdetailsubdetailadjudicationlist.size()-1) {c.addClmRspsItmDtlSubDtlAdjdctnAmntCrncy("]]]]");}


		 };
		/******************** ClmRsps_Itm_Dtl_SubDtl_NtNmbr ********************************************************************************/
		if(claimresponseitemdetailsubdetail.hasNoteNumber()) {

			String  array = "[";
			for(int incr=0; incr<claimresponseitemdetailsubdetail.getNoteNumber().size(); incr++) {
				array = array + claimresponseitemdetailsubdetail.getNoteNumber().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmRspsItmDtlSubDtlNtNmbr(array);

		} else {
			c.addClmRspsItmDtlSubDtlNtNmbr("NULL");
		}


		 };
		/******************** ClmRsps_Itm_Dtl_NtNmbr ********************************************************************************/
		if(claimresponseitemdetail.hasNoteNumber()) {

			String  array = "[";
			for(int incr=0; incr<claimresponseitemdetail.getNoteNumber().size(); incr++) {
				array = array + claimresponseitemdetail.getNoteNumber().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmRspsItmDtlNtNmbr(array);

		} else {
			c.addClmRspsItmDtlNtNmbr("NULL");
		}


		 };
		/******************** claimresponseitemadjudication ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent> claimresponseitemadjudicationlist = claimresponseitem.getAdjudication();
		for(int claimresponseitemadjudicationi = 0; claimresponseitemadjudicationi<claimresponseitemadjudicationlist.size();claimresponseitemadjudicationi++ ) {
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent  claimresponseitemadjudication = claimresponseitemadjudicationlist.get(claimresponseitemadjudicationi);

		/******************** ClmRsps_Itm_Adjdctn_Vl ********************************************************************************/
		if(claimresponseitemadjudicationi == 0) {c.addClmRspsItmAdjdctnVl("[[");}
		if(claimresponseitemadjudication.hasValue()) {

			c.addClmRspsItmAdjdctnVl(String.valueOf(claimresponseitemadjudication.getValue()));
		} else {
			c.addClmRspsItmAdjdctnVl("NULL");
		}

		if(claimresponseitemadjudicationi == claimresponseitemadjudicationlist.size()-1) {c.addClmRspsItmAdjdctnVl("]]");}


		/******************** claimresponseitemadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseitemadjudicationreason = claimresponseitemadjudication.getReason();

		/******************** ClmRsps_Itm_Adjdctn_Rsn_Txt ********************************************************************************/
		if(claimresponseitemadjudicationi == 0) {c.addClmRspsItmAdjdctnRsnTxt("[[");}
		if(claimresponseitemadjudicationreason.hasText()) {

			c.addClmRspsItmAdjdctnRsnTxt(String.valueOf(claimresponseitemadjudicationreason.getText()));
		} else {
			c.addClmRspsItmAdjdctnRsnTxt("NULL");
		}

		if(claimresponseitemadjudicationi == claimresponseitemadjudicationlist.size()-1) {c.addClmRspsItmAdjdctnRsnTxt("]]");}


		/******************** claimresponseitemadjudicationreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseitemadjudicationreasoncodinglist = claimresponseitemadjudicationreason.getCoding();
		for(int claimresponseitemadjudicationreasoncodingi = 0; claimresponseitemadjudicationreasoncodingi<claimresponseitemadjudicationreasoncodinglist.size();claimresponseitemadjudicationreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseitemadjudicationreasoncoding = claimresponseitemadjudicationreasoncodinglist.get(claimresponseitemadjudicationreasoncodingi);

		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(claimresponseitemadjudicationreasoncodingi == 0) {c.addClmRspsItmAdjdctnRsnCdgDsply("[[[");}
		if(claimresponseitemadjudicationreasoncoding.hasDisplay()) {

			c.addClmRspsItmAdjdctnRsnCdgDsply(String.valueOf(claimresponseitemadjudicationreasoncoding.getDisplay()));
		} else {
			c.addClmRspsItmAdjdctnRsnCdgDsply("NULL");
		}

		if(claimresponseitemadjudicationreasoncodingi == claimresponseitemadjudicationreasoncodinglist.size()-1) {c.addClmRspsItmAdjdctnRsnCdgDsply("]]]");}


		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(claimresponseitemadjudicationreasoncodingi == 0) {c.addClmRspsItmAdjdctnRsnCdgVrsn("[[[");}
		if(claimresponseitemadjudicationreasoncoding.hasVersion()) {

			c.addClmRspsItmAdjdctnRsnCdgVrsn(String.valueOf(claimresponseitemadjudicationreasoncoding.getVersion()));
		} else {
			c.addClmRspsItmAdjdctnRsnCdgVrsn("NULL");
		}

		if(claimresponseitemadjudicationreasoncodingi == claimresponseitemadjudicationreasoncodinglist.size()-1) {c.addClmRspsItmAdjdctnRsnCdgVrsn("]]]");}


		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(claimresponseitemadjudicationreasoncodingi == 0) {c.addClmRspsItmAdjdctnRsnCdgCd("[[[");}
		if(claimresponseitemadjudicationreasoncoding.hasCode()) {

			c.addClmRspsItmAdjdctnRsnCdgCd(String.valueOf(claimresponseitemadjudicationreasoncoding.getCode()));
		} else {
			c.addClmRspsItmAdjdctnRsnCdgCd("NULL");
		}

		if(claimresponseitemadjudicationreasoncodingi == claimresponseitemadjudicationreasoncodinglist.size()-1) {c.addClmRspsItmAdjdctnRsnCdgCd("]]]");}


		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseitemadjudicationreasoncodingi == 0) {c.addClmRspsItmAdjdctnRsnCdgUsrSltd("[[[");}
		if(claimresponseitemadjudicationreasoncoding.hasUserSelected()) {

			c.addClmRspsItmAdjdctnRsnCdgUsrSltd(String.valueOf(claimresponseitemadjudicationreasoncoding.getUserSelected()));
		} else {
			c.addClmRspsItmAdjdctnRsnCdgUsrSltd("NULL");
		}

		if(claimresponseitemadjudicationreasoncodingi == claimresponseitemadjudicationreasoncodinglist.size()-1) {c.addClmRspsItmAdjdctnRsnCdgUsrSltd("]]]");}


		/******************** ClmRsps_Itm_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(claimresponseitemadjudicationreasoncodingi == 0) {c.addClmRspsItmAdjdctnRsnCdgSys("[[[");}
		if(claimresponseitemadjudicationreasoncoding.hasSystem()) {

			c.addClmRspsItmAdjdctnRsnCdgSys(String.valueOf(claimresponseitemadjudicationreasoncoding.getSystem()));
		} else {
			c.addClmRspsItmAdjdctnRsnCdgSys("NULL");
		}

		if(claimresponseitemadjudicationreasoncodingi == claimresponseitemadjudicationreasoncodinglist.size()-1) {c.addClmRspsItmAdjdctnRsnCdgSys("]]]");}


		 };
		/******************** claimresponseitemadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseitemadjudicationcategory = claimresponseitemadjudication.getCategory();

		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(claimresponseitemadjudicationi == 0) {c.addClmRspsItmAdjdctnCtgryTxt("[[");}
		if(claimresponseitemadjudicationcategory.hasText()) {

			c.addClmRspsItmAdjdctnCtgryTxt(String.valueOf(claimresponseitemadjudicationcategory.getText()));
		} else {
			c.addClmRspsItmAdjdctnCtgryTxt("NULL");
		}

		if(claimresponseitemadjudicationi == claimresponseitemadjudicationlist.size()-1) {c.addClmRspsItmAdjdctnCtgryTxt("]]");}


		/******************** claimresponseitemadjudicationcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseitemadjudicationcategorycodinglist = claimresponseitemadjudicationcategory.getCoding();
		for(int claimresponseitemadjudicationcategorycodingi = 0; claimresponseitemadjudicationcategorycodingi<claimresponseitemadjudicationcategorycodinglist.size();claimresponseitemadjudicationcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseitemadjudicationcategorycoding = claimresponseitemadjudicationcategorycodinglist.get(claimresponseitemadjudicationcategorycodingi);

		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimresponseitemadjudicationcategorycodingi == 0) {c.addClmRspsItmAdjdctnCtgryCdgDsply("[[[");}
		if(claimresponseitemadjudicationcategorycoding.hasDisplay()) {

			c.addClmRspsItmAdjdctnCtgryCdgDsply(String.valueOf(claimresponseitemadjudicationcategorycoding.getDisplay()));
		} else {
			c.addClmRspsItmAdjdctnCtgryCdgDsply("NULL");
		}

		if(claimresponseitemadjudicationcategorycodingi == claimresponseitemadjudicationcategorycodinglist.size()-1) {c.addClmRspsItmAdjdctnCtgryCdgDsply("]]]");}


		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimresponseitemadjudicationcategorycodingi == 0) {c.addClmRspsItmAdjdctnCtgryCdgVrsn("[[[");}
		if(claimresponseitemadjudicationcategorycoding.hasVersion()) {

			c.addClmRspsItmAdjdctnCtgryCdgVrsn(String.valueOf(claimresponseitemadjudicationcategorycoding.getVersion()));
		} else {
			c.addClmRspsItmAdjdctnCtgryCdgVrsn("NULL");
		}

		if(claimresponseitemadjudicationcategorycodingi == claimresponseitemadjudicationcategorycodinglist.size()-1) {c.addClmRspsItmAdjdctnCtgryCdgVrsn("]]]");}


		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimresponseitemadjudicationcategorycodingi == 0) {c.addClmRspsItmAdjdctnCtgryCdgCd("[[[");}
		if(claimresponseitemadjudicationcategorycoding.hasCode()) {

			c.addClmRspsItmAdjdctnCtgryCdgCd(String.valueOf(claimresponseitemadjudicationcategorycoding.getCode()));
		} else {
			c.addClmRspsItmAdjdctnCtgryCdgCd("NULL");
		}

		if(claimresponseitemadjudicationcategorycodingi == claimresponseitemadjudicationcategorycodinglist.size()-1) {c.addClmRspsItmAdjdctnCtgryCdgCd("]]]");}


		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseitemadjudicationcategorycodingi == 0) {c.addClmRspsItmAdjdctnCtgryCdgUsrSltd("[[[");}
		if(claimresponseitemadjudicationcategorycoding.hasUserSelected()) {

			c.addClmRspsItmAdjdctnCtgryCdgUsrSltd(String.valueOf(claimresponseitemadjudicationcategorycoding.getUserSelected()));
		} else {
			c.addClmRspsItmAdjdctnCtgryCdgUsrSltd("NULL");
		}

		if(claimresponseitemadjudicationcategorycodingi == claimresponseitemadjudicationcategorycodinglist.size()-1) {c.addClmRspsItmAdjdctnCtgryCdgUsrSltd("]]]");}


		/******************** ClmRsps_Itm_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimresponseitemadjudicationcategorycodingi == 0) {c.addClmRspsItmAdjdctnCtgryCdgSys("[[[");}
		if(claimresponseitemadjudicationcategorycoding.hasSystem()) {

			c.addClmRspsItmAdjdctnCtgryCdgSys(String.valueOf(claimresponseitemadjudicationcategorycoding.getSystem()));
		} else {
			c.addClmRspsItmAdjdctnCtgryCdgSys("NULL");
		}

		if(claimresponseitemadjudicationcategorycodingi == claimresponseitemadjudicationcategorycodinglist.size()-1) {c.addClmRspsItmAdjdctnCtgryCdgSys("]]]");}


		 };
		/******************** claimresponseitemadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseitemadjudicationamount = claimresponseitemadjudication.getAmount();

		/******************** ClmRsps_Itm_Adjdctn_Amnt_Vl ********************************************************************************/
		if(claimresponseitemadjudicationi == 0) {c.addClmRspsItmAdjdctnAmntVl("[[");}
		if(claimresponseitemadjudicationamount.hasValue()) {

			c.addClmRspsItmAdjdctnAmntVl(String.valueOf(claimresponseitemadjudicationamount.getValue()));
		} else {
			c.addClmRspsItmAdjdctnAmntVl("NULL");
		}

		if(claimresponseitemadjudicationi == claimresponseitemadjudicationlist.size()-1) {c.addClmRspsItmAdjdctnAmntVl("]]");}


		/******************** ClmRsps_Itm_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(claimresponseitemadjudicationi == 0) {c.addClmRspsItmAdjdctnAmntCrncy("[[");}
		if(claimresponseitemadjudicationamount.hasCurrency()) {

			c.addClmRspsItmAdjdctnAmntCrncy(String.valueOf(claimresponseitemadjudicationamount.getCurrency()));
		} else {
			c.addClmRspsItmAdjdctnAmntCrncy("NULL");
		}

		if(claimresponseitemadjudicationi == claimresponseitemadjudicationlist.size()-1) {c.addClmRspsItmAdjdctnAmntCrncy("]]");}


		 };
		/******************** ClmRsps_Itm_NtNmbr ********************************************************************************/
		if(claimresponseitem.hasNoteNumber()) {

			String  array = "[";
			for(int incr=0; incr<claimresponseitem.getNoteNumber().size(); incr++) {
				array = array + claimresponseitem.getNoteNumber().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmRspsItmNtNmbr(array);

		} else {
			c.addClmRspsItmNtNmbr("NULL");
		}


		 };
		/******************** claimresponsestatus ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.ClaimResponseStatus claimresponsestatus = claimresponse.getStatus();
		if(claimresponsestatus!=null) {
			c.addClmRspsSts(claimresponsestatus.toCode());
		} else {
			c.addClmRspsSts("NULL");
		}

		/******************** ClmRsps_Created ********************************************************************************/
		if(claimresponse.hasCreated()) {

			c.addClmRspsCreated("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimresponse.getCreated())+"\"");
		} else {
			c.addClmRspsCreated("NULL");
		}


		/******************** ClmRsps_Rqst ********************************************************************************/
		if(claimresponse.hasRequest()) {

			if(claimresponse.getRequest().getReference() != null) {
			c.addClmRspsRqst(claimresponse.getRequest().getReference());
			}
		} else {
			c.addClmRspsRqst("NULL");
		}


		/******************** claimresponseidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> claimresponseidentifierlist = claimresponse.getIdentifier();
		for(int claimresponseidentifieri = 0; claimresponseidentifieri<claimresponseidentifierlist.size();claimresponseidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  claimresponseidentifier = claimresponseidentifierlist.get(claimresponseidentifieri);

		/******************** ClmRsps_Id_Vl ********************************************************************************/
		if(claimresponseidentifieri == 0) {c.addClmRspsIdVl("[");}
		if(claimresponseidentifier.hasValue()) {

			c.addClmRspsIdVl(String.valueOf(claimresponseidentifier.getValue()));
		} else {
			c.addClmRspsIdVl("NULL");
		}

		if(claimresponseidentifieri == claimresponseidentifierlist.size()-1) {c.addClmRspsIdVl("]");}


		/******************** claimresponseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseidentifiertype = claimresponseidentifier.getType();

		/******************** ClmRsps_Id_Typ_Txt ********************************************************************************/
		if(claimresponseidentifieri == 0) {c.addClmRspsIdTypTxt("[");}
		if(claimresponseidentifiertype.hasText()) {

			c.addClmRspsIdTypTxt(String.valueOf(claimresponseidentifiertype.getText()));
		} else {
			c.addClmRspsIdTypTxt("NULL");
		}

		if(claimresponseidentifieri == claimresponseidentifierlist.size()-1) {c.addClmRspsIdTypTxt("]");}


		/******************** claimresponseidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseidentifiertypecodinglist = claimresponseidentifiertype.getCoding();
		for(int claimresponseidentifiertypecodingi = 0; claimresponseidentifiertypecodingi<claimresponseidentifiertypecodinglist.size();claimresponseidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseidentifiertypecoding = claimresponseidentifiertypecodinglist.get(claimresponseidentifiertypecodingi);

		/******************** ClmRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(claimresponseidentifiertypecodingi == 0) {c.addClmRspsIdTypCdgDsply("[[");}
		if(claimresponseidentifiertypecoding.hasDisplay()) {

			c.addClmRspsIdTypCdgDsply(String.valueOf(claimresponseidentifiertypecoding.getDisplay()));
		} else {
			c.addClmRspsIdTypCdgDsply("NULL");
		}

		if(claimresponseidentifiertypecodingi == claimresponseidentifiertypecodinglist.size()-1) {c.addClmRspsIdTypCdgDsply("]]");}


		/******************** ClmRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimresponseidentifiertypecodingi == 0) {c.addClmRspsIdTypCdgVrsn("[[");}
		if(claimresponseidentifiertypecoding.hasVersion()) {

			c.addClmRspsIdTypCdgVrsn(String.valueOf(claimresponseidentifiertypecoding.getVersion()));
		} else {
			c.addClmRspsIdTypCdgVrsn("NULL");
		}

		if(claimresponseidentifiertypecodingi == claimresponseidentifiertypecodinglist.size()-1) {c.addClmRspsIdTypCdgVrsn("]]");}


		/******************** ClmRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(claimresponseidentifiertypecodingi == 0) {c.addClmRspsIdTypCdgCd("[[");}
		if(claimresponseidentifiertypecoding.hasCode()) {

			c.addClmRspsIdTypCdgCd(String.valueOf(claimresponseidentifiertypecoding.getCode()));
		} else {
			c.addClmRspsIdTypCdgCd("NULL");
		}

		if(claimresponseidentifiertypecodingi == claimresponseidentifiertypecodinglist.size()-1) {c.addClmRspsIdTypCdgCd("]]");}


		/******************** ClmRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseidentifiertypecodingi == 0) {c.addClmRspsIdTypCdgUsrSltd("[[");}
		if(claimresponseidentifiertypecoding.hasUserSelected()) {

			c.addClmRspsIdTypCdgUsrSltd(String.valueOf(claimresponseidentifiertypecoding.getUserSelected()));
		} else {
			c.addClmRspsIdTypCdgUsrSltd("NULL");
		}

		if(claimresponseidentifiertypecodingi == claimresponseidentifiertypecodinglist.size()-1) {c.addClmRspsIdTypCdgUsrSltd("]]");}


		/******************** ClmRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(claimresponseidentifiertypecodingi == 0) {c.addClmRspsIdTypCdgSys("[[");}
		if(claimresponseidentifiertypecoding.hasSystem()) {

			c.addClmRspsIdTypCdgSys(String.valueOf(claimresponseidentifiertypecoding.getSystem()));
		} else {
			c.addClmRspsIdTypCdgSys("NULL");
		}

		if(claimresponseidentifiertypecodingi == claimresponseidentifiertypecodinglist.size()-1) {c.addClmRspsIdTypCdgSys("]]");}


		 };
		/******************** claimresponseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimresponseidentifierperiod = claimresponseidentifier.getPeriod();

		/******************** ClmRsps_Id_Prd_Strt ********************************************************************************/
		if(claimresponseidentifieri == 0) {c.addClmRspsIdPrdStrt("[");}
		if(claimresponseidentifierperiod.hasStart()) {

			c.addClmRspsIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimresponseidentifierperiod.getStart())+"\"");
		} else {
			c.addClmRspsIdPrdStrt("NULL");
		}

		if(claimresponseidentifieri == claimresponseidentifierlist.size()-1) {c.addClmRspsIdPrdStrt("]");}


		/******************** ClmRsps_Id_Prd_End ********************************************************************************/
		if(claimresponseidentifieri == 0) {c.addClmRspsIdPrdEnd("[");}
		if(claimresponseidentifierperiod.hasEnd()) {

			c.addClmRspsIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimresponseidentifierperiod.getEnd())+"\"");
		} else {
			c.addClmRspsIdPrdEnd("NULL");
		}

		if(claimresponseidentifieri == claimresponseidentifierlist.size()-1) {c.addClmRspsIdPrdEnd("]");}


		/******************** claimresponseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse claimresponseidentifieruse = claimresponseidentifier.getUse();
		if(claimresponseidentifieruse!=null) {
		if(claimresponseidentifieri == 0) {

		c.addClmRspsIdUse("[");		}
			c.addClmRspsIdUse(claimresponseidentifieruse.toCode());
		if(claimresponseidentifieri == claimresponseidentifierlist.size()-1) {

		c.addClmRspsIdUse("]");		}

		} else {
			c.addClmRspsIdUse("NULL");
		}

		/******************** ClmRsps_Id_Assigner ********************************************************************************/
		if(claimresponseidentifieri == 0) {c.addClmRspsIdAssigner("[");}
		if(claimresponseidentifier.hasAssigner()) {

			if(claimresponseidentifier.getAssigner().getReference() != null) {
			c.addClmRspsIdAssigner(claimresponseidentifier.getAssigner().getReference());
			}
		} else {
			c.addClmRspsIdAssigner("NULL");
		}

		if(claimresponseidentifieri == claimresponseidentifierlist.size()-1) {c.addClmRspsIdAssigner("]");}


		/******************** ClmRsps_Id_Sys ********************************************************************************/
		if(claimresponseidentifieri == 0) {c.addClmRspsIdSys("[");}
		if(claimresponseidentifier.hasSystem()) {

			c.addClmRspsIdSys(String.valueOf(claimresponseidentifier.getSystem()));
		} else {
			c.addClmRspsIdSys("NULL");
		}

		if(claimresponseidentifieri == claimresponseidentifierlist.size()-1) {c.addClmRspsIdSys("]");}


		 };
		/******************** ClmRsps_Disposition ********************************************************************************/
		if(claimresponse.hasDisposition()) {

			c.addClmRspsDisposition(String.valueOf(claimresponse.getDisposition()));
		} else {
			c.addClmRspsDisposition("NULL");
		}


		/******************** claimresponseoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.RemittanceOutcome claimresponseoutcome = claimresponse.getOutcome();
		if(claimresponseoutcome!=null) {
			c.addClmRspsOutcome(claimresponseoutcome.toCode());
		} else {
			c.addClmRspsOutcome("NULL");
		}

		/******************** ClmRsps_Rqstor ********************************************************************************/
		if(claimresponse.hasRequestor()) {

			if(claimresponse.getRequestor().getReference() != null) {
			c.addClmRspsRqstor(claimresponse.getRequestor().getReference());
			}
		} else {
			c.addClmRspsRqstor("NULL");
		}


		/******************** claimresponseformcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseformcode = claimresponse.getFormCode();

		/******************** ClmRsps_FrmCd_Txt ********************************************************************************/
		if(claimresponseformcode.hasText()) {

			c.addClmRspsFrmCdTxt(String.valueOf(claimresponseformcode.getText()));
		} else {
			c.addClmRspsFrmCdTxt("NULL");
		}


		/******************** claimresponseformcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseformcodecodinglist = claimresponseformcode.getCoding();
		for(int claimresponseformcodecodingi = 0; claimresponseformcodecodingi<claimresponseformcodecodinglist.size();claimresponseformcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseformcodecoding = claimresponseformcodecodinglist.get(claimresponseformcodecodingi);

		/******************** ClmRsps_FrmCd_Cdg_Dsply ********************************************************************************/
		if(claimresponseformcodecodingi == 0) {c.addClmRspsFrmCdCdgDsply("[");}
		if(claimresponseformcodecoding.hasDisplay()) {

			c.addClmRspsFrmCdCdgDsply(String.valueOf(claimresponseformcodecoding.getDisplay()));
		} else {
			c.addClmRspsFrmCdCdgDsply("NULL");
		}

		if(claimresponseformcodecodingi == claimresponseformcodecodinglist.size()-1) {c.addClmRspsFrmCdCdgDsply("]");}


		/******************** ClmRsps_FrmCd_Cdg_Vrsn ********************************************************************************/
		if(claimresponseformcodecodingi == 0) {c.addClmRspsFrmCdCdgVrsn("[");}
		if(claimresponseformcodecoding.hasVersion()) {

			c.addClmRspsFrmCdCdgVrsn(String.valueOf(claimresponseformcodecoding.getVersion()));
		} else {
			c.addClmRspsFrmCdCdgVrsn("NULL");
		}

		if(claimresponseformcodecodingi == claimresponseformcodecodinglist.size()-1) {c.addClmRspsFrmCdCdgVrsn("]");}


		/******************** ClmRsps_FrmCd_Cdg_Cd ********************************************************************************/
		if(claimresponseformcodecodingi == 0) {c.addClmRspsFrmCdCdgCd("[");}
		if(claimresponseformcodecoding.hasCode()) {

			c.addClmRspsFrmCdCdgCd(String.valueOf(claimresponseformcodecoding.getCode()));
		} else {
			c.addClmRspsFrmCdCdgCd("NULL");
		}

		if(claimresponseformcodecodingi == claimresponseformcodecodinglist.size()-1) {c.addClmRspsFrmCdCdgCd("]");}


		/******************** ClmRsps_FrmCd_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseformcodecodingi == 0) {c.addClmRspsFrmCdCdgUsrSltd("[");}
		if(claimresponseformcodecoding.hasUserSelected()) {

			c.addClmRspsFrmCdCdgUsrSltd(String.valueOf(claimresponseformcodecoding.getUserSelected()));
		} else {
			c.addClmRspsFrmCdCdgUsrSltd("NULL");
		}

		if(claimresponseformcodecodingi == claimresponseformcodecodinglist.size()-1) {c.addClmRspsFrmCdCdgUsrSltd("]");}


		/******************** ClmRsps_FrmCd_Cdg_Sys ********************************************************************************/
		if(claimresponseformcodecodingi == 0) {c.addClmRspsFrmCdCdgSys("[");}
		if(claimresponseformcodecoding.hasSystem()) {

			c.addClmRspsFrmCdCdgSys(String.valueOf(claimresponseformcodecoding.getSystem()));
		} else {
			c.addClmRspsFrmCdCdgSys("NULL");
		}

		if(claimresponseformcodecodingi == claimresponseformcodecodinglist.size()-1) {c.addClmRspsFrmCdCdgSys("]");}


		 };
		/******************** claimresponseprocessnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ClaimResponse.NoteComponent> claimresponseprocessnotelist = claimresponse.getProcessNote();
		for(int claimresponseprocessnotei = 0; claimresponseprocessnotei<claimresponseprocessnotelist.size();claimresponseprocessnotei++ ) {
		org.hl7.fhir.r4.model.ClaimResponse.NoteComponent  claimresponseprocessnote = claimresponseprocessnotelist.get(claimresponseprocessnotei);

		/******************** claimresponseprocessnotetype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.NoteType claimresponseprocessnotetype = claimresponseprocessnote.getType();
		if(claimresponseprocessnotetype!=null) {
		if(claimresponseprocessnotei == 0) {

		c.addClmRspsProcessNtTyp("[");		}
			c.addClmRspsProcessNtTyp(claimresponseprocessnotetype.toCode());
		if(claimresponseprocessnotei == claimresponseprocessnotelist.size()-1) {

		c.addClmRspsProcessNtTyp("]");		}

		} else {
			c.addClmRspsProcessNtTyp("NULL");
		}

		/******************** claimresponseprocessnotelanguage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseprocessnotelanguage = claimresponseprocessnote.getLanguage();

		/******************** ClmRsps_ProcessNt_Lnguage_Txt ********************************************************************************/
		if(claimresponseprocessnotei == 0) {c.addClmRspsProcessNtLnguageTxt("[");}
		if(claimresponseprocessnotelanguage.hasText()) {

			c.addClmRspsProcessNtLnguageTxt(String.valueOf(claimresponseprocessnotelanguage.getText()));
		} else {
			c.addClmRspsProcessNtLnguageTxt("NULL");
		}

		if(claimresponseprocessnotei == claimresponseprocessnotelist.size()-1) {c.addClmRspsProcessNtLnguageTxt("]");}


		/******************** claimresponseprocessnotelanguagecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseprocessnotelanguagecodinglist = claimresponseprocessnotelanguage.getCoding();
		for(int claimresponseprocessnotelanguagecodingi = 0; claimresponseprocessnotelanguagecodingi<claimresponseprocessnotelanguagecodinglist.size();claimresponseprocessnotelanguagecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseprocessnotelanguagecoding = claimresponseprocessnotelanguagecodinglist.get(claimresponseprocessnotelanguagecodingi);

		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_Dsply ********************************************************************************/
		if(claimresponseprocessnotelanguagecodingi == 0) {c.addClmRspsProcessNtLnguageCdgDsply("[[");}
		if(claimresponseprocessnotelanguagecoding.hasDisplay()) {

			c.addClmRspsProcessNtLnguageCdgDsply(String.valueOf(claimresponseprocessnotelanguagecoding.getDisplay()));
		} else {
			c.addClmRspsProcessNtLnguageCdgDsply("NULL");
		}

		if(claimresponseprocessnotelanguagecodingi == claimresponseprocessnotelanguagecodinglist.size()-1) {c.addClmRspsProcessNtLnguageCdgDsply("]]");}


		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(claimresponseprocessnotelanguagecodingi == 0) {c.addClmRspsProcessNtLnguageCdgVrsn("[[");}
		if(claimresponseprocessnotelanguagecoding.hasVersion()) {

			c.addClmRspsProcessNtLnguageCdgVrsn(String.valueOf(claimresponseprocessnotelanguagecoding.getVersion()));
		} else {
			c.addClmRspsProcessNtLnguageCdgVrsn("NULL");
		}

		if(claimresponseprocessnotelanguagecodingi == claimresponseprocessnotelanguagecodinglist.size()-1) {c.addClmRspsProcessNtLnguageCdgVrsn("]]");}


		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_Cd ********************************************************************************/
		if(claimresponseprocessnotelanguagecodingi == 0) {c.addClmRspsProcessNtLnguageCdgCd("[[");}
		if(claimresponseprocessnotelanguagecoding.hasCode()) {

			c.addClmRspsProcessNtLnguageCdgCd(String.valueOf(claimresponseprocessnotelanguagecoding.getCode()));
		} else {
			c.addClmRspsProcessNtLnguageCdgCd("NULL");
		}

		if(claimresponseprocessnotelanguagecodingi == claimresponseprocessnotelanguagecodinglist.size()-1) {c.addClmRspsProcessNtLnguageCdgCd("]]");}


		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseprocessnotelanguagecodingi == 0) {c.addClmRspsProcessNtLnguageCdgUsrSltd("[[");}
		if(claimresponseprocessnotelanguagecoding.hasUserSelected()) {

			c.addClmRspsProcessNtLnguageCdgUsrSltd(String.valueOf(claimresponseprocessnotelanguagecoding.getUserSelected()));
		} else {
			c.addClmRspsProcessNtLnguageCdgUsrSltd("NULL");
		}

		if(claimresponseprocessnotelanguagecodingi == claimresponseprocessnotelanguagecodinglist.size()-1) {c.addClmRspsProcessNtLnguageCdgUsrSltd("]]");}


		/******************** ClmRsps_ProcessNt_Lnguage_Cdg_Sys ********************************************************************************/
		if(claimresponseprocessnotelanguagecodingi == 0) {c.addClmRspsProcessNtLnguageCdgSys("[[");}
		if(claimresponseprocessnotelanguagecoding.hasSystem()) {

			c.addClmRspsProcessNtLnguageCdgSys(String.valueOf(claimresponseprocessnotelanguagecoding.getSystem()));
		} else {
			c.addClmRspsProcessNtLnguageCdgSys("NULL");
		}

		if(claimresponseprocessnotelanguagecodingi == claimresponseprocessnotelanguagecodinglist.size()-1) {c.addClmRspsProcessNtLnguageCdgSys("]]");}


		 };
		/******************** ClmRsps_ProcessNt_Nmbr ********************************************************************************/
		if(claimresponseprocessnotei == 0) {c.addClmRspsProcessNtNmbr("[");}
		if(claimresponseprocessnote.hasNumber()) {

			c.addClmRspsProcessNtNmbr(String.valueOf(claimresponseprocessnote.getNumber()));
		} else {
			c.addClmRspsProcessNtNmbr("NULL");
		}

		if(claimresponseprocessnotei == claimresponseprocessnotelist.size()-1) {c.addClmRspsProcessNtNmbr("]");}


		/******************** ClmRsps_ProcessNt_Txt ********************************************************************************/
		if(claimresponseprocessnotei == 0) {c.addClmRspsProcessNtTxt("[");}
		if(claimresponseprocessnote.hasText()) {

			c.addClmRspsProcessNtTxt(String.valueOf(claimresponseprocessnote.getText()));
		} else {
			c.addClmRspsProcessNtTxt("NULL");
		}

		if(claimresponseprocessnotei == claimresponseprocessnotelist.size()-1) {c.addClmRspsProcessNtTxt("]");}


		 };
		/******************** claimresponsepayeetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsepayeetype = claimresponse.getPayeeType();

		/******************** ClmRsps_PayeeTyp_Txt ********************************************************************************/
		if(claimresponsepayeetype.hasText()) {

			c.addClmRspsPayeeTypTxt(String.valueOf(claimresponsepayeetype.getText()));
		} else {
			c.addClmRspsPayeeTypTxt("NULL");
		}


		/******************** claimresponsepayeetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponsepayeetypecodinglist = claimresponsepayeetype.getCoding();
		for(int claimresponsepayeetypecodingi = 0; claimresponsepayeetypecodingi<claimresponsepayeetypecodinglist.size();claimresponsepayeetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponsepayeetypecoding = claimresponsepayeetypecodinglist.get(claimresponsepayeetypecodingi);

		/******************** ClmRsps_PayeeTyp_Cdg_Dsply ********************************************************************************/
		if(claimresponsepayeetypecodingi == 0) {c.addClmRspsPayeeTypCdgDsply("[");}
		if(claimresponsepayeetypecoding.hasDisplay()) {

			c.addClmRspsPayeeTypCdgDsply(String.valueOf(claimresponsepayeetypecoding.getDisplay()));
		} else {
			c.addClmRspsPayeeTypCdgDsply("NULL");
		}

		if(claimresponsepayeetypecodingi == claimresponsepayeetypecodinglist.size()-1) {c.addClmRspsPayeeTypCdgDsply("]");}


		/******************** ClmRsps_PayeeTyp_Cdg_Vrsn ********************************************************************************/
		if(claimresponsepayeetypecodingi == 0) {c.addClmRspsPayeeTypCdgVrsn("[");}
		if(claimresponsepayeetypecoding.hasVersion()) {

			c.addClmRspsPayeeTypCdgVrsn(String.valueOf(claimresponsepayeetypecoding.getVersion()));
		} else {
			c.addClmRspsPayeeTypCdgVrsn("NULL");
		}

		if(claimresponsepayeetypecodingi == claimresponsepayeetypecodinglist.size()-1) {c.addClmRspsPayeeTypCdgVrsn("]");}


		/******************** ClmRsps_PayeeTyp_Cdg_Cd ********************************************************************************/
		if(claimresponsepayeetypecodingi == 0) {c.addClmRspsPayeeTypCdgCd("[");}
		if(claimresponsepayeetypecoding.hasCode()) {

			c.addClmRspsPayeeTypCdgCd(String.valueOf(claimresponsepayeetypecoding.getCode()));
		} else {
			c.addClmRspsPayeeTypCdgCd("NULL");
		}

		if(claimresponsepayeetypecodingi == claimresponsepayeetypecodinglist.size()-1) {c.addClmRspsPayeeTypCdgCd("]");}


		/******************** ClmRsps_PayeeTyp_Cdg_UsrSltd ********************************************************************************/
		if(claimresponsepayeetypecodingi == 0) {c.addClmRspsPayeeTypCdgUsrSltd("[");}
		if(claimresponsepayeetypecoding.hasUserSelected()) {

			c.addClmRspsPayeeTypCdgUsrSltd(String.valueOf(claimresponsepayeetypecoding.getUserSelected()));
		} else {
			c.addClmRspsPayeeTypCdgUsrSltd("NULL");
		}

		if(claimresponsepayeetypecodingi == claimresponsepayeetypecodinglist.size()-1) {c.addClmRspsPayeeTypCdgUsrSltd("]");}


		/******************** ClmRsps_PayeeTyp_Cdg_Sys ********************************************************************************/
		if(claimresponsepayeetypecodingi == 0) {c.addClmRspsPayeeTypCdgSys("[");}
		if(claimresponsepayeetypecoding.hasSystem()) {

			c.addClmRspsPayeeTypCdgSys(String.valueOf(claimresponsepayeetypecoding.getSystem()));
		} else {
			c.addClmRspsPayeeTypCdgSys("NULL");
		}

		if(claimresponsepayeetypecodingi == claimresponsepayeetypecodinglist.size()-1) {c.addClmRspsPayeeTypCdgSys("]");}


		 };
		/******************** claimresponsepreauthperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimresponsepreauthperiod = claimresponse.getPreAuthPeriod();

		/******************** ClmRsps_PreAuthPrd_Strt ********************************************************************************/
		if(claimresponsepreauthperiod.hasStart()) {

			c.addClmRspsPreAuthPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimresponsepreauthperiod.getStart())+"\"");
		} else {
			c.addClmRspsPreAuthPrdStrt("NULL");
		}


		/******************** ClmRsps_PreAuthPrd_End ********************************************************************************/
		if(claimresponsepreauthperiod.hasEnd()) {

			c.addClmRspsPreAuthPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimresponsepreauthperiod.getEnd())+"\"");
		} else {
			c.addClmRspsPreAuthPrdEnd("NULL");
		}


		/******************** claimresponseuse ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.Use claimresponseuse = claimresponse.getUse();
		if(claimresponseuse!=null) {
			c.addClmRspsUse(claimresponseuse.toCode());
		} else {
			c.addClmRspsUse("NULL");
		}

		/******************** claimresponsefundsreserve ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsefundsreserve = claimresponse.getFundsReserve();

		/******************** ClmRsps_FundsReserve_Txt ********************************************************************************/
		if(claimresponsefundsreserve.hasText()) {

			c.addClmRspsFundsReserveTxt(String.valueOf(claimresponsefundsreserve.getText()));
		} else {
			c.addClmRspsFundsReserveTxt("NULL");
		}


		/******************** claimresponsefundsreservecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponsefundsreservecodinglist = claimresponsefundsreserve.getCoding();
		for(int claimresponsefundsreservecodingi = 0; claimresponsefundsreservecodingi<claimresponsefundsreservecodinglist.size();claimresponsefundsreservecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponsefundsreservecoding = claimresponsefundsreservecodinglist.get(claimresponsefundsreservecodingi);

		/******************** ClmRsps_FundsReserve_Cdg_Dsply ********************************************************************************/
		if(claimresponsefundsreservecodingi == 0) {c.addClmRspsFundsReserveCdgDsply("[");}
		if(claimresponsefundsreservecoding.hasDisplay()) {

			c.addClmRspsFundsReserveCdgDsply(String.valueOf(claimresponsefundsreservecoding.getDisplay()));
		} else {
			c.addClmRspsFundsReserveCdgDsply("NULL");
		}

		if(claimresponsefundsreservecodingi == claimresponsefundsreservecodinglist.size()-1) {c.addClmRspsFundsReserveCdgDsply("]");}


		/******************** ClmRsps_FundsReserve_Cdg_Vrsn ********************************************************************************/
		if(claimresponsefundsreservecodingi == 0) {c.addClmRspsFundsReserveCdgVrsn("[");}
		if(claimresponsefundsreservecoding.hasVersion()) {

			c.addClmRspsFundsReserveCdgVrsn(String.valueOf(claimresponsefundsreservecoding.getVersion()));
		} else {
			c.addClmRspsFundsReserveCdgVrsn("NULL");
		}

		if(claimresponsefundsreservecodingi == claimresponsefundsreservecodinglist.size()-1) {c.addClmRspsFundsReserveCdgVrsn("]");}


		/******************** ClmRsps_FundsReserve_Cdg_Cd ********************************************************************************/
		if(claimresponsefundsreservecodingi == 0) {c.addClmRspsFundsReserveCdgCd("[");}
		if(claimresponsefundsreservecoding.hasCode()) {

			c.addClmRspsFundsReserveCdgCd(String.valueOf(claimresponsefundsreservecoding.getCode()));
		} else {
			c.addClmRspsFundsReserveCdgCd("NULL");
		}

		if(claimresponsefundsreservecodingi == claimresponsefundsreservecodinglist.size()-1) {c.addClmRspsFundsReserveCdgCd("]");}


		/******************** ClmRsps_FundsReserve_Cdg_UsrSltd ********************************************************************************/
		if(claimresponsefundsreservecodingi == 0) {c.addClmRspsFundsReserveCdgUsrSltd("[");}
		if(claimresponsefundsreservecoding.hasUserSelected()) {

			c.addClmRspsFundsReserveCdgUsrSltd(String.valueOf(claimresponsefundsreservecoding.getUserSelected()));
		} else {
			c.addClmRspsFundsReserveCdgUsrSltd("NULL");
		}

		if(claimresponsefundsreservecodingi == claimresponsefundsreservecodinglist.size()-1) {c.addClmRspsFundsReserveCdgUsrSltd("]");}


		/******************** ClmRsps_FundsReserve_Cdg_Sys ********************************************************************************/
		if(claimresponsefundsreservecodingi == 0) {c.addClmRspsFundsReserveCdgSys("[");}
		if(claimresponsefundsreservecoding.hasSystem()) {

			c.addClmRspsFundsReserveCdgSys(String.valueOf(claimresponsefundsreservecoding.getSystem()));
		} else {
			c.addClmRspsFundsReserveCdgSys("NULL");
		}

		if(claimresponsefundsreservecodingi == claimresponsefundsreservecodinglist.size()-1) {c.addClmRspsFundsReserveCdgSys("]");}


		 };
		/******************** ClmRsps_PreAuthRef ********************************************************************************/
		if(claimresponse.hasPreAuthRef()) {

			c.addClmRspsPreAuthRef(String.valueOf(claimresponse.getPreAuthRef()));
		} else {
			c.addClmRspsPreAuthRef("NULL");
		}


		/******************** claimresponseadjudication ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent> claimresponseadjudicationlist = claimresponse.getAdjudication();
		for(int claimresponseadjudicationi = 0; claimresponseadjudicationi<claimresponseadjudicationlist.size();claimresponseadjudicationi++ ) {
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent  claimresponseadjudication = claimresponseadjudicationlist.get(claimresponseadjudicationi);

		/******************** ClmRsps_Adjdctn_Vl ********************************************************************************/
		if(claimresponseadjudicationi == 0) {c.addClmRspsAdjdctnVl("[");}
		if(claimresponseadjudication.hasValue()) {

			c.addClmRspsAdjdctnVl(String.valueOf(claimresponseadjudication.getValue()));
		} else {
			c.addClmRspsAdjdctnVl("NULL");
		}

		if(claimresponseadjudicationi == claimresponseadjudicationlist.size()-1) {c.addClmRspsAdjdctnVl("]");}


		/******************** claimresponseadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadjudicationreason = claimresponseadjudication.getReason();

		/******************** ClmRsps_Adjdctn_Rsn_Txt ********************************************************************************/
		if(claimresponseadjudicationi == 0) {c.addClmRspsAdjdctnRsnTxt("[");}
		if(claimresponseadjudicationreason.hasText()) {

			c.addClmRspsAdjdctnRsnTxt(String.valueOf(claimresponseadjudicationreason.getText()));
		} else {
			c.addClmRspsAdjdctnRsnTxt("NULL");
		}

		if(claimresponseadjudicationi == claimresponseadjudicationlist.size()-1) {c.addClmRspsAdjdctnRsnTxt("]");}


		/******************** claimresponseadjudicationreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseadjudicationreasoncodinglist = claimresponseadjudicationreason.getCoding();
		for(int claimresponseadjudicationreasoncodingi = 0; claimresponseadjudicationreasoncodingi<claimresponseadjudicationreasoncodinglist.size();claimresponseadjudicationreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseadjudicationreasoncoding = claimresponseadjudicationreasoncodinglist.get(claimresponseadjudicationreasoncodingi);

		/******************** ClmRsps_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(claimresponseadjudicationreasoncodingi == 0) {c.addClmRspsAdjdctnRsnCdgDsply("[[");}
		if(claimresponseadjudicationreasoncoding.hasDisplay()) {

			c.addClmRspsAdjdctnRsnCdgDsply(String.valueOf(claimresponseadjudicationreasoncoding.getDisplay()));
		} else {
			c.addClmRspsAdjdctnRsnCdgDsply("NULL");
		}

		if(claimresponseadjudicationreasoncodingi == claimresponseadjudicationreasoncodinglist.size()-1) {c.addClmRspsAdjdctnRsnCdgDsply("]]");}


		/******************** ClmRsps_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadjudicationreasoncodingi == 0) {c.addClmRspsAdjdctnRsnCdgVrsn("[[");}
		if(claimresponseadjudicationreasoncoding.hasVersion()) {

			c.addClmRspsAdjdctnRsnCdgVrsn(String.valueOf(claimresponseadjudicationreasoncoding.getVersion()));
		} else {
			c.addClmRspsAdjdctnRsnCdgVrsn("NULL");
		}

		if(claimresponseadjudicationreasoncodingi == claimresponseadjudicationreasoncodinglist.size()-1) {c.addClmRspsAdjdctnRsnCdgVrsn("]]");}


		/******************** ClmRsps_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(claimresponseadjudicationreasoncodingi == 0) {c.addClmRspsAdjdctnRsnCdgCd("[[");}
		if(claimresponseadjudicationreasoncoding.hasCode()) {

			c.addClmRspsAdjdctnRsnCdgCd(String.valueOf(claimresponseadjudicationreasoncoding.getCode()));
		} else {
			c.addClmRspsAdjdctnRsnCdgCd("NULL");
		}

		if(claimresponseadjudicationreasoncodingi == claimresponseadjudicationreasoncodinglist.size()-1) {c.addClmRspsAdjdctnRsnCdgCd("]]");}


		/******************** ClmRsps_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadjudicationreasoncodingi == 0) {c.addClmRspsAdjdctnRsnCdgUsrSltd("[[");}
		if(claimresponseadjudicationreasoncoding.hasUserSelected()) {

			c.addClmRspsAdjdctnRsnCdgUsrSltd(String.valueOf(claimresponseadjudicationreasoncoding.getUserSelected()));
		} else {
			c.addClmRspsAdjdctnRsnCdgUsrSltd("NULL");
		}

		if(claimresponseadjudicationreasoncodingi == claimresponseadjudicationreasoncodinglist.size()-1) {c.addClmRspsAdjdctnRsnCdgUsrSltd("]]");}


		/******************** ClmRsps_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(claimresponseadjudicationreasoncodingi == 0) {c.addClmRspsAdjdctnRsnCdgSys("[[");}
		if(claimresponseadjudicationreasoncoding.hasSystem()) {

			c.addClmRspsAdjdctnRsnCdgSys(String.valueOf(claimresponseadjudicationreasoncoding.getSystem()));
		} else {
			c.addClmRspsAdjdctnRsnCdgSys("NULL");
		}

		if(claimresponseadjudicationreasoncodingi == claimresponseadjudicationreasoncodinglist.size()-1) {c.addClmRspsAdjdctnRsnCdgSys("]]");}


		 };
		/******************** claimresponseadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadjudicationcategory = claimresponseadjudication.getCategory();

		/******************** ClmRsps_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(claimresponseadjudicationi == 0) {c.addClmRspsAdjdctnCtgryTxt("[");}
		if(claimresponseadjudicationcategory.hasText()) {

			c.addClmRspsAdjdctnCtgryTxt(String.valueOf(claimresponseadjudicationcategory.getText()));
		} else {
			c.addClmRspsAdjdctnCtgryTxt("NULL");
		}

		if(claimresponseadjudicationi == claimresponseadjudicationlist.size()-1) {c.addClmRspsAdjdctnCtgryTxt("]");}


		/******************** claimresponseadjudicationcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseadjudicationcategorycodinglist = claimresponseadjudicationcategory.getCoding();
		for(int claimresponseadjudicationcategorycodingi = 0; claimresponseadjudicationcategorycodingi<claimresponseadjudicationcategorycodinglist.size();claimresponseadjudicationcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseadjudicationcategorycoding = claimresponseadjudicationcategorycodinglist.get(claimresponseadjudicationcategorycodingi);

		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimresponseadjudicationcategorycodingi == 0) {c.addClmRspsAdjdctnCtgryCdgDsply("[[");}
		if(claimresponseadjudicationcategorycoding.hasDisplay()) {

			c.addClmRspsAdjdctnCtgryCdgDsply(String.valueOf(claimresponseadjudicationcategorycoding.getDisplay()));
		} else {
			c.addClmRspsAdjdctnCtgryCdgDsply("NULL");
		}

		if(claimresponseadjudicationcategorycodingi == claimresponseadjudicationcategorycodinglist.size()-1) {c.addClmRspsAdjdctnCtgryCdgDsply("]]");}


		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadjudicationcategorycodingi == 0) {c.addClmRspsAdjdctnCtgryCdgVrsn("[[");}
		if(claimresponseadjudicationcategorycoding.hasVersion()) {

			c.addClmRspsAdjdctnCtgryCdgVrsn(String.valueOf(claimresponseadjudicationcategorycoding.getVersion()));
		} else {
			c.addClmRspsAdjdctnCtgryCdgVrsn("NULL");
		}

		if(claimresponseadjudicationcategorycodingi == claimresponseadjudicationcategorycodinglist.size()-1) {c.addClmRspsAdjdctnCtgryCdgVrsn("]]");}


		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimresponseadjudicationcategorycodingi == 0) {c.addClmRspsAdjdctnCtgryCdgCd("[[");}
		if(claimresponseadjudicationcategorycoding.hasCode()) {

			c.addClmRspsAdjdctnCtgryCdgCd(String.valueOf(claimresponseadjudicationcategorycoding.getCode()));
		} else {
			c.addClmRspsAdjdctnCtgryCdgCd("NULL");
		}

		if(claimresponseadjudicationcategorycodingi == claimresponseadjudicationcategorycodinglist.size()-1) {c.addClmRspsAdjdctnCtgryCdgCd("]]");}


		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadjudicationcategorycodingi == 0) {c.addClmRspsAdjdctnCtgryCdgUsrSltd("[[");}
		if(claimresponseadjudicationcategorycoding.hasUserSelected()) {

			c.addClmRspsAdjdctnCtgryCdgUsrSltd(String.valueOf(claimresponseadjudicationcategorycoding.getUserSelected()));
		} else {
			c.addClmRspsAdjdctnCtgryCdgUsrSltd("NULL");
		}

		if(claimresponseadjudicationcategorycodingi == claimresponseadjudicationcategorycodinglist.size()-1) {c.addClmRspsAdjdctnCtgryCdgUsrSltd("]]");}


		/******************** ClmRsps_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimresponseadjudicationcategorycodingi == 0) {c.addClmRspsAdjdctnCtgryCdgSys("[[");}
		if(claimresponseadjudicationcategorycoding.hasSystem()) {

			c.addClmRspsAdjdctnCtgryCdgSys(String.valueOf(claimresponseadjudicationcategorycoding.getSystem()));
		} else {
			c.addClmRspsAdjdctnCtgryCdgSys("NULL");
		}

		if(claimresponseadjudicationcategorycodingi == claimresponseadjudicationcategorycodinglist.size()-1) {c.addClmRspsAdjdctnCtgryCdgSys("]]");}


		 };
		/******************** claimresponseadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadjudicationamount = claimresponseadjudication.getAmount();

		/******************** ClmRsps_Adjdctn_Amnt_Vl ********************************************************************************/
		if(claimresponseadjudicationi == 0) {c.addClmRspsAdjdctnAmntVl("[");}
		if(claimresponseadjudicationamount.hasValue()) {

			c.addClmRspsAdjdctnAmntVl(String.valueOf(claimresponseadjudicationamount.getValue()));
		} else {
			c.addClmRspsAdjdctnAmntVl("NULL");
		}

		if(claimresponseadjudicationi == claimresponseadjudicationlist.size()-1) {c.addClmRspsAdjdctnAmntVl("]");}


		/******************** ClmRsps_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(claimresponseadjudicationi == 0) {c.addClmRspsAdjdctnAmntCrncy("[");}
		if(claimresponseadjudicationamount.hasCurrency()) {

			c.addClmRspsAdjdctnAmntCrncy(String.valueOf(claimresponseadjudicationamount.getCurrency()));
		} else {
			c.addClmRspsAdjdctnAmntCrncy("NULL");
		}

		if(claimresponseadjudicationi == claimresponseadjudicationlist.size()-1) {c.addClmRspsAdjdctnAmntCrncy("]");}


		 };
		/******************** claimresponseadditem ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ClaimResponse.AddedItemComponent> claimresponseadditemlist = claimresponse.getAddItem();
		for(int claimresponseadditemi = 0; claimresponseadditemi<claimresponseadditemlist.size();claimresponseadditemi++ ) {
		org.hl7.fhir.r4.model.ClaimResponse.AddedItemComponent  claimresponseadditem = claimresponseadditemlist.get(claimresponseadditemi);

		/******************** ClmRsps_AddItm_Provider ********************************************************************************/
		if(claimresponseadditemi == 0) {c.addClmRspsAddItmProvider("[");}
		if(claimresponseadditem.hasProvider()) {

			String  array = "[";
			for(int incr=0; incr<claimresponseadditem.getProvider().size(); incr++) {
				array = array + claimresponseadditem.getProvider().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmRspsAddItmProvider(array);

		} else {
			c.addClmRspsAddItmProvider("NULL");
		}

		if(claimresponseadditemi == claimresponseadditemlist.size()-1) {c.addClmRspsAddItmProvider("]");}


		/******************** ClmRsps_AddItm_SubdetailSqnc ********************************************************************************/
		if(claimresponseadditemi == 0) {c.addClmRspsAddItmSubdetailSqnc("[");}
		if(claimresponseadditem.hasSubdetailSequence()) {

			String  array = "[";
			for(int incr=0; incr<claimresponseadditem.getSubdetailSequence().size(); incr++) {
				array = array + claimresponseadditem.getSubdetailSequence().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmRspsAddItmSubdetailSqnc(array);

		} else {
			c.addClmRspsAddItmSubdetailSqnc("NULL");
		}

		if(claimresponseadditemi == claimresponseadditemlist.size()-1) {c.addClmRspsAddItmSubdetailSqnc("]");}


		/******************** claimresponseadditemunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemunitprice = claimresponseadditem.getUnitPrice();

		/******************** ClmRsps_AddItm_UntPrice_Vl ********************************************************************************/
		if(claimresponseadditemi == 0) {c.addClmRspsAddItmUntPriceVl("[");}
		if(claimresponseadditemunitprice.hasValue()) {

			c.addClmRspsAddItmUntPriceVl(String.valueOf(claimresponseadditemunitprice.getValue()));
		} else {
			c.addClmRspsAddItmUntPriceVl("NULL");
		}

		if(claimresponseadditemi == claimresponseadditemlist.size()-1) {c.addClmRspsAddItmUntPriceVl("]");}


		/******************** ClmRsps_AddItm_UntPrice_Crncy ********************************************************************************/
		if(claimresponseadditemi == 0) {c.addClmRspsAddItmUntPriceCrncy("[");}
		if(claimresponseadditemunitprice.hasCurrency()) {

			c.addClmRspsAddItmUntPriceCrncy(String.valueOf(claimresponseadditemunitprice.getCurrency()));
		} else {
			c.addClmRspsAddItmUntPriceCrncy("NULL");
		}

		if(claimresponseadditemi == claimresponseadditemlist.size()-1) {c.addClmRspsAddItmUntPriceCrncy("]");}


		/******************** claimresponseadditemdetail ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ClaimResponse.AddedItemDetailComponent> claimresponseadditemdetaillist = claimresponseadditem.getDetail();
		for(int claimresponseadditemdetaili = 0; claimresponseadditemdetaili<claimresponseadditemdetaillist.size();claimresponseadditemdetaili++ ) {
		org.hl7.fhir.r4.model.ClaimResponse.AddedItemDetailComponent  claimresponseadditemdetail = claimresponseadditemdetaillist.get(claimresponseadditemdetaili);

		/******************** claimresponseadditemdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemdetailunitprice = claimresponseadditemdetail.getUnitPrice();

		/******************** ClmRsps_AddItm_Dtl_UntPrice_Vl ********************************************************************************/
		if(claimresponseadditemdetaili == 0) {c.addClmRspsAddItmDtlUntPriceVl("[[");}
		if(claimresponseadditemdetailunitprice.hasValue()) {

			c.addClmRspsAddItmDtlUntPriceVl(String.valueOf(claimresponseadditemdetailunitprice.getValue()));
		} else {
			c.addClmRspsAddItmDtlUntPriceVl("NULL");
		}

		if(claimresponseadditemdetaili == claimresponseadditemdetaillist.size()-1) {c.addClmRspsAddItmDtlUntPriceVl("]]");}


		/******************** ClmRsps_AddItm_Dtl_UntPrice_Crncy ********************************************************************************/
		if(claimresponseadditemdetaili == 0) {c.addClmRspsAddItmDtlUntPriceCrncy("[[");}
		if(claimresponseadditemdetailunitprice.hasCurrency()) {

			c.addClmRspsAddItmDtlUntPriceCrncy(String.valueOf(claimresponseadditemdetailunitprice.getCurrency()));
		} else {
			c.addClmRspsAddItmDtlUntPriceCrncy("NULL");
		}

		if(claimresponseadditemdetaili == claimresponseadditemdetaillist.size()-1) {c.addClmRspsAddItmDtlUntPriceCrncy("]]");}


		/******************** claimresponseadditemdetailmodifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> claimresponseadditemdetailmodifierlist = claimresponseadditemdetail.getModifier();
		for(int claimresponseadditemdetailmodifieri = 0; claimresponseadditemdetailmodifieri<claimresponseadditemdetailmodifierlist.size();claimresponseadditemdetailmodifieri++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  claimresponseadditemdetailmodifier = claimresponseadditemdetailmodifierlist.get(claimresponseadditemdetailmodifieri);

		/******************** ClmRsps_AddItm_Dtl_Mdfr_Txt ********************************************************************************/
		if(claimresponseadditemdetailmodifieri == 0) {c.addClmRspsAddItmDtlMdfrTxt("[[[");}
		if(claimresponseadditemdetailmodifier.hasText()) {

			c.addClmRspsAddItmDtlMdfrTxt(String.valueOf(claimresponseadditemdetailmodifier.getText()));
		} else {
			c.addClmRspsAddItmDtlMdfrTxt("NULL");
		}

		if(claimresponseadditemdetailmodifieri == claimresponseadditemdetailmodifierlist.size()-1) {c.addClmRspsAddItmDtlMdfrTxt("]]]");}


		/******************** claimresponseadditemdetailmodifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseadditemdetailmodifiercodinglist = claimresponseadditemdetailmodifier.getCoding();
		for(int claimresponseadditemdetailmodifiercodingi = 0; claimresponseadditemdetailmodifiercodingi<claimresponseadditemdetailmodifiercodinglist.size();claimresponseadditemdetailmodifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseadditemdetailmodifiercoding = claimresponseadditemdetailmodifiercodinglist.get(claimresponseadditemdetailmodifiercodingi);

		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemdetailmodifiercodingi == 0) {c.addClmRspsAddItmDtlMdfrCdgDsply("[[[[");}
		if(claimresponseadditemdetailmodifiercoding.hasDisplay()) {

			c.addClmRspsAddItmDtlMdfrCdgDsply(String.valueOf(claimresponseadditemdetailmodifiercoding.getDisplay()));
		} else {
			c.addClmRspsAddItmDtlMdfrCdgDsply("NULL");
		}

		if(claimresponseadditemdetailmodifiercodingi == claimresponseadditemdetailmodifiercodinglist.size()-1) {c.addClmRspsAddItmDtlMdfrCdgDsply("]]]]");}


		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemdetailmodifiercodingi == 0) {c.addClmRspsAddItmDtlMdfrCdgVrsn("[[[[");}
		if(claimresponseadditemdetailmodifiercoding.hasVersion()) {

			c.addClmRspsAddItmDtlMdfrCdgVrsn(String.valueOf(claimresponseadditemdetailmodifiercoding.getVersion()));
		} else {
			c.addClmRspsAddItmDtlMdfrCdgVrsn("NULL");
		}

		if(claimresponseadditemdetailmodifiercodingi == claimresponseadditemdetailmodifiercodinglist.size()-1) {c.addClmRspsAddItmDtlMdfrCdgVrsn("]]]]");}


		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemdetailmodifiercodingi == 0) {c.addClmRspsAddItmDtlMdfrCdgCd("[[[[");}
		if(claimresponseadditemdetailmodifiercoding.hasCode()) {

			c.addClmRspsAddItmDtlMdfrCdgCd(String.valueOf(claimresponseadditemdetailmodifiercoding.getCode()));
		} else {
			c.addClmRspsAddItmDtlMdfrCdgCd("NULL");
		}

		if(claimresponseadditemdetailmodifiercodingi == claimresponseadditemdetailmodifiercodinglist.size()-1) {c.addClmRspsAddItmDtlMdfrCdgCd("]]]]");}


		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemdetailmodifiercodingi == 0) {c.addClmRspsAddItmDtlMdfrCdgUsrSltd("[[[[");}
		if(claimresponseadditemdetailmodifiercoding.hasUserSelected()) {

			c.addClmRspsAddItmDtlMdfrCdgUsrSltd(String.valueOf(claimresponseadditemdetailmodifiercoding.getUserSelected()));
		} else {
			c.addClmRspsAddItmDtlMdfrCdgUsrSltd("NULL");
		}

		if(claimresponseadditemdetailmodifiercodingi == claimresponseadditemdetailmodifiercodinglist.size()-1) {c.addClmRspsAddItmDtlMdfrCdgUsrSltd("]]]]");}


		/******************** ClmRsps_AddItm_Dtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemdetailmodifiercodingi == 0) {c.addClmRspsAddItmDtlMdfrCdgSys("[[[[");}
		if(claimresponseadditemdetailmodifiercoding.hasSystem()) {

			c.addClmRspsAddItmDtlMdfrCdgSys(String.valueOf(claimresponseadditemdetailmodifiercoding.getSystem()));
		} else {
			c.addClmRspsAddItmDtlMdfrCdgSys("NULL");
		}

		if(claimresponseadditemdetailmodifiercodingi == claimresponseadditemdetailmodifiercodinglist.size()-1) {c.addClmRspsAddItmDtlMdfrCdgSys("]]]]");}


		 };
		 };
		/******************** claimresponseadditemdetailadjudication ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent> claimresponseadditemdetailadjudicationlist = claimresponseadditemdetail.getAdjudication();
		for(int claimresponseadditemdetailadjudicationi = 0; claimresponseadditemdetailadjudicationi<claimresponseadditemdetailadjudicationlist.size();claimresponseadditemdetailadjudicationi++ ) {
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent  claimresponseadditemdetailadjudication = claimresponseadditemdetailadjudicationlist.get(claimresponseadditemdetailadjudicationi);

		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Vl ********************************************************************************/
		if(claimresponseadditemdetailadjudicationi == 0) {c.addClmRspsAddItmDtlAdjdctnVl("[[[");}
		if(claimresponseadditemdetailadjudication.hasValue()) {

			c.addClmRspsAddItmDtlAdjdctnVl(String.valueOf(claimresponseadditemdetailadjudication.getValue()));
		} else {
			c.addClmRspsAddItmDtlAdjdctnVl("NULL");
		}

		if(claimresponseadditemdetailadjudicationi == claimresponseadditemdetailadjudicationlist.size()-1) {c.addClmRspsAddItmDtlAdjdctnVl("]]]");}


		/******************** claimresponseadditemdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailadjudicationreason = claimresponseadditemdetailadjudication.getReason();

		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(claimresponseadditemdetailadjudicationi == 0) {c.addClmRspsAddItmDtlAdjdctnRsnTxt("[[[");}
		if(claimresponseadditemdetailadjudicationreason.hasText()) {

			c.addClmRspsAddItmDtlAdjdctnRsnTxt(String.valueOf(claimresponseadditemdetailadjudicationreason.getText()));
		} else {
			c.addClmRspsAddItmDtlAdjdctnRsnTxt("NULL");
		}

		if(claimresponseadditemdetailadjudicationi == claimresponseadditemdetailadjudicationlist.size()-1) {c.addClmRspsAddItmDtlAdjdctnRsnTxt("]]]");}


		/******************** claimresponseadditemdetailadjudicationreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseadditemdetailadjudicationreasoncodinglist = claimresponseadditemdetailadjudicationreason.getCoding();
		for(int claimresponseadditemdetailadjudicationreasoncodingi = 0; claimresponseadditemdetailadjudicationreasoncodingi<claimresponseadditemdetailadjudicationreasoncodinglist.size();claimresponseadditemdetailadjudicationreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseadditemdetailadjudicationreasoncoding = claimresponseadditemdetailadjudicationreasoncodinglist.get(claimresponseadditemdetailadjudicationreasoncodingi);

		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemdetailadjudicationreasoncodingi == 0) {c.addClmRspsAddItmDtlAdjdctnRsnCdgDsply("[[[[");}
		if(claimresponseadditemdetailadjudicationreasoncoding.hasDisplay()) {

			c.addClmRspsAddItmDtlAdjdctnRsnCdgDsply(String.valueOf(claimresponseadditemdetailadjudicationreasoncoding.getDisplay()));
		} else {
			c.addClmRspsAddItmDtlAdjdctnRsnCdgDsply("NULL");
		}

		if(claimresponseadditemdetailadjudicationreasoncodingi == claimresponseadditemdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsAddItmDtlAdjdctnRsnCdgDsply("]]]]");}


		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemdetailadjudicationreasoncodingi == 0) {c.addClmRspsAddItmDtlAdjdctnRsnCdgVrsn("[[[[");}
		if(claimresponseadditemdetailadjudicationreasoncoding.hasVersion()) {

			c.addClmRspsAddItmDtlAdjdctnRsnCdgVrsn(String.valueOf(claimresponseadditemdetailadjudicationreasoncoding.getVersion()));
		} else {
			c.addClmRspsAddItmDtlAdjdctnRsnCdgVrsn("NULL");
		}

		if(claimresponseadditemdetailadjudicationreasoncodingi == claimresponseadditemdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsAddItmDtlAdjdctnRsnCdgVrsn("]]]]");}


		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemdetailadjudicationreasoncodingi == 0) {c.addClmRspsAddItmDtlAdjdctnRsnCdgCd("[[[[");}
		if(claimresponseadditemdetailadjudicationreasoncoding.hasCode()) {

			c.addClmRspsAddItmDtlAdjdctnRsnCdgCd(String.valueOf(claimresponseadditemdetailadjudicationreasoncoding.getCode()));
		} else {
			c.addClmRspsAddItmDtlAdjdctnRsnCdgCd("NULL");
		}

		if(claimresponseadditemdetailadjudicationreasoncodingi == claimresponseadditemdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsAddItmDtlAdjdctnRsnCdgCd("]]]]");}


		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemdetailadjudicationreasoncodingi == 0) {c.addClmRspsAddItmDtlAdjdctnRsnCdgUsrSltd("[[[[");}
		if(claimresponseadditemdetailadjudicationreasoncoding.hasUserSelected()) {

			c.addClmRspsAddItmDtlAdjdctnRsnCdgUsrSltd(String.valueOf(claimresponseadditemdetailadjudicationreasoncoding.getUserSelected()));
		} else {
			c.addClmRspsAddItmDtlAdjdctnRsnCdgUsrSltd("NULL");
		}

		if(claimresponseadditemdetailadjudicationreasoncodingi == claimresponseadditemdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsAddItmDtlAdjdctnRsnCdgUsrSltd("]]]]");}


		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemdetailadjudicationreasoncodingi == 0) {c.addClmRspsAddItmDtlAdjdctnRsnCdgSys("[[[[");}
		if(claimresponseadditemdetailadjudicationreasoncoding.hasSystem()) {

			c.addClmRspsAddItmDtlAdjdctnRsnCdgSys(String.valueOf(claimresponseadditemdetailadjudicationreasoncoding.getSystem()));
		} else {
			c.addClmRspsAddItmDtlAdjdctnRsnCdgSys("NULL");
		}

		if(claimresponseadditemdetailadjudicationreasoncodingi == claimresponseadditemdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsAddItmDtlAdjdctnRsnCdgSys("]]]]");}


		 };
		/******************** claimresponseadditemdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailadjudicationcategory = claimresponseadditemdetailadjudication.getCategory();

		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(claimresponseadditemdetailadjudicationi == 0) {c.addClmRspsAddItmDtlAdjdctnCtgryTxt("[[[");}
		if(claimresponseadditemdetailadjudicationcategory.hasText()) {

			c.addClmRspsAddItmDtlAdjdctnCtgryTxt(String.valueOf(claimresponseadditemdetailadjudicationcategory.getText()));
		} else {
			c.addClmRspsAddItmDtlAdjdctnCtgryTxt("NULL");
		}

		if(claimresponseadditemdetailadjudicationi == claimresponseadditemdetailadjudicationlist.size()-1) {c.addClmRspsAddItmDtlAdjdctnCtgryTxt("]]]");}


		/******************** claimresponseadditemdetailadjudicationcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseadditemdetailadjudicationcategorycodinglist = claimresponseadditemdetailadjudicationcategory.getCoding();
		for(int claimresponseadditemdetailadjudicationcategorycodingi = 0; claimresponseadditemdetailadjudicationcategorycodingi<claimresponseadditemdetailadjudicationcategorycodinglist.size();claimresponseadditemdetailadjudicationcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseadditemdetailadjudicationcategorycoding = claimresponseadditemdetailadjudicationcategorycodinglist.get(claimresponseadditemdetailadjudicationcategorycodingi);

		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemdetailadjudicationcategorycodingi == 0) {c.addClmRspsAddItmDtlAdjdctnCtgryCdgDsply("[[[[");}
		if(claimresponseadditemdetailadjudicationcategorycoding.hasDisplay()) {

			c.addClmRspsAddItmDtlAdjdctnCtgryCdgDsply(String.valueOf(claimresponseadditemdetailadjudicationcategorycoding.getDisplay()));
		} else {
			c.addClmRspsAddItmDtlAdjdctnCtgryCdgDsply("NULL");
		}

		if(claimresponseadditemdetailadjudicationcategorycodingi == claimresponseadditemdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsAddItmDtlAdjdctnCtgryCdgDsply("]]]]");}


		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemdetailadjudicationcategorycodingi == 0) {c.addClmRspsAddItmDtlAdjdctnCtgryCdgVrsn("[[[[");}
		if(claimresponseadditemdetailadjudicationcategorycoding.hasVersion()) {

			c.addClmRspsAddItmDtlAdjdctnCtgryCdgVrsn(String.valueOf(claimresponseadditemdetailadjudicationcategorycoding.getVersion()));
		} else {
			c.addClmRspsAddItmDtlAdjdctnCtgryCdgVrsn("NULL");
		}

		if(claimresponseadditemdetailadjudicationcategorycodingi == claimresponseadditemdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsAddItmDtlAdjdctnCtgryCdgVrsn("]]]]");}


		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemdetailadjudicationcategorycodingi == 0) {c.addClmRspsAddItmDtlAdjdctnCtgryCdgCd("[[[[");}
		if(claimresponseadditemdetailadjudicationcategorycoding.hasCode()) {

			c.addClmRspsAddItmDtlAdjdctnCtgryCdgCd(String.valueOf(claimresponseadditemdetailadjudicationcategorycoding.getCode()));
		} else {
			c.addClmRspsAddItmDtlAdjdctnCtgryCdgCd("NULL");
		}

		if(claimresponseadditemdetailadjudicationcategorycodingi == claimresponseadditemdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsAddItmDtlAdjdctnCtgryCdgCd("]]]]");}


		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemdetailadjudicationcategorycodingi == 0) {c.addClmRspsAddItmDtlAdjdctnCtgryCdgUsrSltd("[[[[");}
		if(claimresponseadditemdetailadjudicationcategorycoding.hasUserSelected()) {

			c.addClmRspsAddItmDtlAdjdctnCtgryCdgUsrSltd(String.valueOf(claimresponseadditemdetailadjudicationcategorycoding.getUserSelected()));
		} else {
			c.addClmRspsAddItmDtlAdjdctnCtgryCdgUsrSltd("NULL");
		}

		if(claimresponseadditemdetailadjudicationcategorycodingi == claimresponseadditemdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsAddItmDtlAdjdctnCtgryCdgUsrSltd("]]]]");}


		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemdetailadjudicationcategorycodingi == 0) {c.addClmRspsAddItmDtlAdjdctnCtgryCdgSys("[[[[");}
		if(claimresponseadditemdetailadjudicationcategorycoding.hasSystem()) {

			c.addClmRspsAddItmDtlAdjdctnCtgryCdgSys(String.valueOf(claimresponseadditemdetailadjudicationcategorycoding.getSystem()));
		} else {
			c.addClmRspsAddItmDtlAdjdctnCtgryCdgSys("NULL");
		}

		if(claimresponseadditemdetailadjudicationcategorycodingi == claimresponseadditemdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsAddItmDtlAdjdctnCtgryCdgSys("]]]]");}


		 };
		/******************** claimresponseadditemdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemdetailadjudicationamount = claimresponseadditemdetailadjudication.getAmount();

		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(claimresponseadditemdetailadjudicationi == 0) {c.addClmRspsAddItmDtlAdjdctnAmntVl("[[[");}
		if(claimresponseadditemdetailadjudicationamount.hasValue()) {

			c.addClmRspsAddItmDtlAdjdctnAmntVl(String.valueOf(claimresponseadditemdetailadjudicationamount.getValue()));
		} else {
			c.addClmRspsAddItmDtlAdjdctnAmntVl("NULL");
		}

		if(claimresponseadditemdetailadjudicationi == claimresponseadditemdetailadjudicationlist.size()-1) {c.addClmRspsAddItmDtlAdjdctnAmntVl("]]]");}


		/******************** ClmRsps_AddItm_Dtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(claimresponseadditemdetailadjudicationi == 0) {c.addClmRspsAddItmDtlAdjdctnAmntCrncy("[[[");}
		if(claimresponseadditemdetailadjudicationamount.hasCurrency()) {

			c.addClmRspsAddItmDtlAdjdctnAmntCrncy(String.valueOf(claimresponseadditemdetailadjudicationamount.getCurrency()));
		} else {
			c.addClmRspsAddItmDtlAdjdctnAmntCrncy("NULL");
		}

		if(claimresponseadditemdetailadjudicationi == claimresponseadditemdetailadjudicationlist.size()-1) {c.addClmRspsAddItmDtlAdjdctnAmntCrncy("]]]");}


		 };
		/******************** ClmRsps_AddItm_Dtl_Factor ********************************************************************************/
		if(claimresponseadditemdetail.hasFactor()) {

			c.addClmRspsAddItmDtlFactor(String.valueOf(claimresponseadditemdetail.getFactor()));
		} else {
			c.addClmRspsAddItmDtlFactor("NULL");
		}


		/******************** claimresponseadditemdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemdetailnet = claimresponseadditemdetail.getNet();

		/******************** ClmRsps_AddItm_Dtl_Net_Vl ********************************************************************************/
		if(claimresponseadditemdetailnet.hasValue()) {

			c.addClmRspsAddItmDtlNetVl(String.valueOf(claimresponseadditemdetailnet.getValue()));
		} else {
			c.addClmRspsAddItmDtlNetVl("NULL");
		}


		/******************** ClmRsps_AddItm_Dtl_Net_Crncy ********************************************************************************/
		if(claimresponseadditemdetailnet.hasCurrency()) {

			c.addClmRspsAddItmDtlNetCrncy(String.valueOf(claimresponseadditemdetailnet.getCurrency()));
		} else {
			c.addClmRspsAddItmDtlNetCrncy("NULL");
		}


		/******************** claimresponseadditemdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimresponseadditemdetailquantity = claimresponseadditemdetail.getQuantity();

		/******************** ClmRsps_AddItm_Dtl_Qnty_Vl ********************************************************************************/
		if(claimresponseadditemdetailquantity.hasValue()) {

			c.addClmRspsAddItmDtlQntyVl(String.valueOf(claimresponseadditemdetailquantity.getValue()));
		} else {
			c.addClmRspsAddItmDtlQntyVl("NULL");
		}


		/******************** claimresponseadditemdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator claimresponseadditemdetailquantitycomparator = claimresponseadditemdetailquantity.getComparator();
		if(claimresponseadditemdetailquantitycomparator!=null) {
			c.addClmRspsAddItmDtlQntyCmprtr(claimresponseadditemdetailquantitycomparator.toCode());
		} else {
			c.addClmRspsAddItmDtlQntyCmprtr("NULL");
		}

		/******************** ClmRsps_AddItm_Dtl_Qnty_Cd ********************************************************************************/
		if(claimresponseadditemdetailquantity.hasCode()) {

			c.addClmRspsAddItmDtlQntyCd(String.valueOf(claimresponseadditemdetailquantity.getCode()));
		} else {
			c.addClmRspsAddItmDtlQntyCd("NULL");
		}


		/******************** ClmRsps_AddItm_Dtl_Qnty_Unt ********************************************************************************/
		if(claimresponseadditemdetailquantity.hasUnit()) {

			c.addClmRspsAddItmDtlQntyUnt(String.valueOf(claimresponseadditemdetailquantity.getUnit()));
		} else {
			c.addClmRspsAddItmDtlQntyUnt("NULL");
		}


		/******************** ClmRsps_AddItm_Dtl_Qnty_Sys ********************************************************************************/
		if(claimresponseadditemdetailquantity.hasSystem()) {

			c.addClmRspsAddItmDtlQntySys(String.valueOf(claimresponseadditemdetailquantity.getSystem()));
		} else {
			c.addClmRspsAddItmDtlQntySys("NULL");
		}


		/******************** claimresponseadditemdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailproductorservice = claimresponseadditemdetail.getProductOrService();

		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Txt ********************************************************************************/
		if(claimresponseadditemdetailproductorservice.hasText()) {

			c.addClmRspsAddItmDtlPrdctOrSrvTxt(String.valueOf(claimresponseadditemdetailproductorservice.getText()));
		} else {
			c.addClmRspsAddItmDtlPrdctOrSrvTxt("NULL");
		}


		/******************** claimresponseadditemdetailproductorservicecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseadditemdetailproductorservicecodinglist = claimresponseadditemdetailproductorservice.getCoding();
		for(int claimresponseadditemdetailproductorservicecodingi = 0; claimresponseadditemdetailproductorservicecodingi<claimresponseadditemdetailproductorservicecodinglist.size();claimresponseadditemdetailproductorservicecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseadditemdetailproductorservicecoding = claimresponseadditemdetailproductorservicecodinglist.get(claimresponseadditemdetailproductorservicecodingi);

		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemdetailproductorservicecodingi == 0) {c.addClmRspsAddItmDtlPrdctOrSrvCdgDsply("[[[");}
		if(claimresponseadditemdetailproductorservicecoding.hasDisplay()) {

			c.addClmRspsAddItmDtlPrdctOrSrvCdgDsply(String.valueOf(claimresponseadditemdetailproductorservicecoding.getDisplay()));
		} else {
			c.addClmRspsAddItmDtlPrdctOrSrvCdgDsply("NULL");
		}

		if(claimresponseadditemdetailproductorservicecodingi == claimresponseadditemdetailproductorservicecodinglist.size()-1) {c.addClmRspsAddItmDtlPrdctOrSrvCdgDsply("]]]");}


		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemdetailproductorservicecodingi == 0) {c.addClmRspsAddItmDtlPrdctOrSrvCdgVrsn("[[[");}
		if(claimresponseadditemdetailproductorservicecoding.hasVersion()) {

			c.addClmRspsAddItmDtlPrdctOrSrvCdgVrsn(String.valueOf(claimresponseadditemdetailproductorservicecoding.getVersion()));
		} else {
			c.addClmRspsAddItmDtlPrdctOrSrvCdgVrsn("NULL");
		}

		if(claimresponseadditemdetailproductorservicecodingi == claimresponseadditemdetailproductorservicecodinglist.size()-1) {c.addClmRspsAddItmDtlPrdctOrSrvCdgVrsn("]]]");}


		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemdetailproductorservicecodingi == 0) {c.addClmRspsAddItmDtlPrdctOrSrvCdgCd("[[[");}
		if(claimresponseadditemdetailproductorservicecoding.hasCode()) {

			c.addClmRspsAddItmDtlPrdctOrSrvCdgCd(String.valueOf(claimresponseadditemdetailproductorservicecoding.getCode()));
		} else {
			c.addClmRspsAddItmDtlPrdctOrSrvCdgCd("NULL");
		}

		if(claimresponseadditemdetailproductorservicecodingi == claimresponseadditemdetailproductorservicecodinglist.size()-1) {c.addClmRspsAddItmDtlPrdctOrSrvCdgCd("]]]");}


		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemdetailproductorservicecodingi == 0) {c.addClmRspsAddItmDtlPrdctOrSrvCdgUsrSltd("[[[");}
		if(claimresponseadditemdetailproductorservicecoding.hasUserSelected()) {

			c.addClmRspsAddItmDtlPrdctOrSrvCdgUsrSltd(String.valueOf(claimresponseadditemdetailproductorservicecoding.getUserSelected()));
		} else {
			c.addClmRspsAddItmDtlPrdctOrSrvCdgUsrSltd("NULL");
		}

		if(claimresponseadditemdetailproductorservicecodingi == claimresponseadditemdetailproductorservicecodinglist.size()-1) {c.addClmRspsAddItmDtlPrdctOrSrvCdgUsrSltd("]]]");}


		/******************** ClmRsps_AddItm_Dtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemdetailproductorservicecodingi == 0) {c.addClmRspsAddItmDtlPrdctOrSrvCdgSys("[[[");}
		if(claimresponseadditemdetailproductorservicecoding.hasSystem()) {

			c.addClmRspsAddItmDtlPrdctOrSrvCdgSys(String.valueOf(claimresponseadditemdetailproductorservicecoding.getSystem()));
		} else {
			c.addClmRspsAddItmDtlPrdctOrSrvCdgSys("NULL");
		}

		if(claimresponseadditemdetailproductorservicecodingi == claimresponseadditemdetailproductorservicecodinglist.size()-1) {c.addClmRspsAddItmDtlPrdctOrSrvCdgSys("]]]");}


		 };
		/******************** claimresponseadditemdetailsubdetail ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ClaimResponse.AddedItemSubDetailComponent> claimresponseadditemdetailsubdetaillist = claimresponseadditemdetail.getSubDetail();
		for(int claimresponseadditemdetailsubdetaili = 0; claimresponseadditemdetailsubdetaili<claimresponseadditemdetailsubdetaillist.size();claimresponseadditemdetailsubdetaili++ ) {
		org.hl7.fhir.r4.model.ClaimResponse.AddedItemSubDetailComponent  claimresponseadditemdetailsubdetail = claimresponseadditemdetailsubdetaillist.get(claimresponseadditemdetailsubdetaili);

		/******************** claimresponseadditemdetailsubdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemdetailsubdetailunitprice = claimresponseadditemdetailsubdetail.getUnitPrice();

		/******************** ClmRsps_AddItm_Dtl_SubDtl_UntPrice_Vl ********************************************************************************/
		if(claimresponseadditemdetailsubdetaili == 0) {c.addClmRspsAddItmDtlSubDtlUntPriceVl("[[[");}
		if(claimresponseadditemdetailsubdetailunitprice.hasValue()) {

			c.addClmRspsAddItmDtlSubDtlUntPriceVl(String.valueOf(claimresponseadditemdetailsubdetailunitprice.getValue()));
		} else {
			c.addClmRspsAddItmDtlSubDtlUntPriceVl("NULL");
		}

		if(claimresponseadditemdetailsubdetaili == claimresponseadditemdetailsubdetaillist.size()-1) {c.addClmRspsAddItmDtlSubDtlUntPriceVl("]]]");}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_UntPrice_Crncy ********************************************************************************/
		if(claimresponseadditemdetailsubdetaili == 0) {c.addClmRspsAddItmDtlSubDtlUntPriceCrncy("[[[");}
		if(claimresponseadditemdetailsubdetailunitprice.hasCurrency()) {

			c.addClmRspsAddItmDtlSubDtlUntPriceCrncy(String.valueOf(claimresponseadditemdetailsubdetailunitprice.getCurrency()));
		} else {
			c.addClmRspsAddItmDtlSubDtlUntPriceCrncy("NULL");
		}

		if(claimresponseadditemdetailsubdetaili == claimresponseadditemdetailsubdetaillist.size()-1) {c.addClmRspsAddItmDtlSubDtlUntPriceCrncy("]]]");}


		/******************** claimresponseadditemdetailsubdetailmodifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> claimresponseadditemdetailsubdetailmodifierlist = claimresponseadditemdetailsubdetail.getModifier();
		for(int claimresponseadditemdetailsubdetailmodifieri = 0; claimresponseadditemdetailsubdetailmodifieri<claimresponseadditemdetailsubdetailmodifierlist.size();claimresponseadditemdetailsubdetailmodifieri++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  claimresponseadditemdetailsubdetailmodifier = claimresponseadditemdetailsubdetailmodifierlist.get(claimresponseadditemdetailsubdetailmodifieri);

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Txt ********************************************************************************/
		if(claimresponseadditemdetailsubdetailmodifieri == 0) {c.addClmRspsAddItmDtlSubDtlMdfrTxt("[[[[");}
		if(claimresponseadditemdetailsubdetailmodifier.hasText()) {

			c.addClmRspsAddItmDtlSubDtlMdfrTxt(String.valueOf(claimresponseadditemdetailsubdetailmodifier.getText()));
		} else {
			c.addClmRspsAddItmDtlSubDtlMdfrTxt("NULL");
		}

		if(claimresponseadditemdetailsubdetailmodifieri == claimresponseadditemdetailsubdetailmodifierlist.size()-1) {c.addClmRspsAddItmDtlSubDtlMdfrTxt("]]]]");}


		/******************** claimresponseadditemdetailsubdetailmodifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseadditemdetailsubdetailmodifiercodinglist = claimresponseadditemdetailsubdetailmodifier.getCoding();
		for(int claimresponseadditemdetailsubdetailmodifiercodingi = 0; claimresponseadditemdetailsubdetailmodifiercodingi<claimresponseadditemdetailsubdetailmodifiercodinglist.size();claimresponseadditemdetailsubdetailmodifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseadditemdetailsubdetailmodifiercoding = claimresponseadditemdetailsubdetailmodifiercodinglist.get(claimresponseadditemdetailsubdetailmodifiercodingi);

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemdetailsubdetailmodifiercodingi == 0) {c.addClmRspsAddItmDtlSubDtlMdfrCdgDsply("[[[[[");}
		if(claimresponseadditemdetailsubdetailmodifiercoding.hasDisplay()) {

			c.addClmRspsAddItmDtlSubDtlMdfrCdgDsply(String.valueOf(claimresponseadditemdetailsubdetailmodifiercoding.getDisplay()));
		} else {
			c.addClmRspsAddItmDtlSubDtlMdfrCdgDsply("NULL");
		}

		if(claimresponseadditemdetailsubdetailmodifiercodingi == claimresponseadditemdetailsubdetailmodifiercodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlMdfrCdgDsply("]]]]]");}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemdetailsubdetailmodifiercodingi == 0) {c.addClmRspsAddItmDtlSubDtlMdfrCdgVrsn("[[[[[");}
		if(claimresponseadditemdetailsubdetailmodifiercoding.hasVersion()) {

			c.addClmRspsAddItmDtlSubDtlMdfrCdgVrsn(String.valueOf(claimresponseadditemdetailsubdetailmodifiercoding.getVersion()));
		} else {
			c.addClmRspsAddItmDtlSubDtlMdfrCdgVrsn("NULL");
		}

		if(claimresponseadditemdetailsubdetailmodifiercodingi == claimresponseadditemdetailsubdetailmodifiercodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlMdfrCdgVrsn("]]]]]");}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemdetailsubdetailmodifiercodingi == 0) {c.addClmRspsAddItmDtlSubDtlMdfrCdgCd("[[[[[");}
		if(claimresponseadditemdetailsubdetailmodifiercoding.hasCode()) {

			c.addClmRspsAddItmDtlSubDtlMdfrCdgCd(String.valueOf(claimresponseadditemdetailsubdetailmodifiercoding.getCode()));
		} else {
			c.addClmRspsAddItmDtlSubDtlMdfrCdgCd("NULL");
		}

		if(claimresponseadditemdetailsubdetailmodifiercodingi == claimresponseadditemdetailsubdetailmodifiercodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlMdfrCdgCd("]]]]]");}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemdetailsubdetailmodifiercodingi == 0) {c.addClmRspsAddItmDtlSubDtlMdfrCdgUsrSltd("[[[[[");}
		if(claimresponseadditemdetailsubdetailmodifiercoding.hasUserSelected()) {

			c.addClmRspsAddItmDtlSubDtlMdfrCdgUsrSltd(String.valueOf(claimresponseadditemdetailsubdetailmodifiercoding.getUserSelected()));
		} else {
			c.addClmRspsAddItmDtlSubDtlMdfrCdgUsrSltd("NULL");
		}

		if(claimresponseadditemdetailsubdetailmodifiercodingi == claimresponseadditemdetailsubdetailmodifiercodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlMdfrCdgUsrSltd("]]]]]");}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemdetailsubdetailmodifiercodingi == 0) {c.addClmRspsAddItmDtlSubDtlMdfrCdgSys("[[[[[");}
		if(claimresponseadditemdetailsubdetailmodifiercoding.hasSystem()) {

			c.addClmRspsAddItmDtlSubDtlMdfrCdgSys(String.valueOf(claimresponseadditemdetailsubdetailmodifiercoding.getSystem()));
		} else {
			c.addClmRspsAddItmDtlSubDtlMdfrCdgSys("NULL");
		}

		if(claimresponseadditemdetailsubdetailmodifiercodingi == claimresponseadditemdetailsubdetailmodifiercodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlMdfrCdgSys("]]]]]");}


		 };
		 };
		/******************** claimresponseadditemdetailsubdetailadjudication ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent> claimresponseadditemdetailsubdetailadjudicationlist = claimresponseadditemdetailsubdetail.getAdjudication();
		for(int claimresponseadditemdetailsubdetailadjudicationi = 0; claimresponseadditemdetailsubdetailadjudicationi<claimresponseadditemdetailsubdetailadjudicationlist.size();claimresponseadditemdetailsubdetailadjudicationi++ ) {
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent  claimresponseadditemdetailsubdetailadjudication = claimresponseadditemdetailsubdetailadjudicationlist.get(claimresponseadditemdetailsubdetailadjudicationi);

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Vl ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationi == 0) {c.addClmRspsAddItmDtlSubDtlAdjdctnVl("[[[[");}
		if(claimresponseadditemdetailsubdetailadjudication.hasValue()) {

			c.addClmRspsAddItmDtlSubDtlAdjdctnVl(String.valueOf(claimresponseadditemdetailsubdetailadjudication.getValue()));
		} else {
			c.addClmRspsAddItmDtlSubDtlAdjdctnVl("NULL");
		}

		if(claimresponseadditemdetailsubdetailadjudicationi == claimresponseadditemdetailsubdetailadjudicationlist.size()-1) {c.addClmRspsAddItmDtlSubDtlAdjdctnVl("]]]]");}


		/******************** claimresponseadditemdetailsubdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailsubdetailadjudicationreason = claimresponseadditemdetailsubdetailadjudication.getReason();

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationi == 0) {c.addClmRspsAddItmDtlSubDtlAdjdctnRsnTxt("[[[[");}
		if(claimresponseadditemdetailsubdetailadjudicationreason.hasText()) {

			c.addClmRspsAddItmDtlSubDtlAdjdctnRsnTxt(String.valueOf(claimresponseadditemdetailsubdetailadjudicationreason.getText()));
		} else {
			c.addClmRspsAddItmDtlSubDtlAdjdctnRsnTxt("NULL");
		}

		if(claimresponseadditemdetailsubdetailadjudicationi == claimresponseadditemdetailsubdetailadjudicationlist.size()-1) {c.addClmRspsAddItmDtlSubDtlAdjdctnRsnTxt("]]]]");}


		/******************** claimresponseadditemdetailsubdetailadjudicationreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseadditemdetailsubdetailadjudicationreasoncodinglist = claimresponseadditemdetailsubdetailadjudicationreason.getCoding();
		for(int claimresponseadditemdetailsubdetailadjudicationreasoncodingi = 0; claimresponseadditemdetailsubdetailadjudicationreasoncodingi<claimresponseadditemdetailsubdetailadjudicationreasoncodinglist.size();claimresponseadditemdetailsubdetailadjudicationreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseadditemdetailsubdetailadjudicationreasoncoding = claimresponseadditemdetailsubdetailadjudicationreasoncodinglist.get(claimresponseadditemdetailsubdetailadjudicationreasoncodingi);

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationreasoncodingi == 0) {c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgDsply("[[[[[");}
		if(claimresponseadditemdetailsubdetailadjudicationreasoncoding.hasDisplay()) {

			c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgDsply(String.valueOf(claimresponseadditemdetailsubdetailadjudicationreasoncoding.getDisplay()));
		} else {
			c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgDsply("NULL");
		}

		if(claimresponseadditemdetailsubdetailadjudicationreasoncodingi == claimresponseadditemdetailsubdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgDsply("]]]]]");}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationreasoncodingi == 0) {c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgVrsn("[[[[[");}
		if(claimresponseadditemdetailsubdetailadjudicationreasoncoding.hasVersion()) {

			c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgVrsn(String.valueOf(claimresponseadditemdetailsubdetailadjudicationreasoncoding.getVersion()));
		} else {
			c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgVrsn("NULL");
		}

		if(claimresponseadditemdetailsubdetailadjudicationreasoncodingi == claimresponseadditemdetailsubdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgVrsn("]]]]]");}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationreasoncodingi == 0) {c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgCd("[[[[[");}
		if(claimresponseadditemdetailsubdetailadjudicationreasoncoding.hasCode()) {

			c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgCd(String.valueOf(claimresponseadditemdetailsubdetailadjudicationreasoncoding.getCode()));
		} else {
			c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgCd("NULL");
		}

		if(claimresponseadditemdetailsubdetailadjudicationreasoncodingi == claimresponseadditemdetailsubdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgCd("]]]]]");}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationreasoncodingi == 0) {c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd("[[[[[");}
		if(claimresponseadditemdetailsubdetailadjudicationreasoncoding.hasUserSelected()) {

			c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd(String.valueOf(claimresponseadditemdetailsubdetailadjudicationreasoncoding.getUserSelected()));
		} else {
			c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd("NULL");
		}

		if(claimresponseadditemdetailsubdetailadjudicationreasoncodingi == claimresponseadditemdetailsubdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd("]]]]]");}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationreasoncodingi == 0) {c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgSys("[[[[[");}
		if(claimresponseadditemdetailsubdetailadjudicationreasoncoding.hasSystem()) {

			c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgSys(String.valueOf(claimresponseadditemdetailsubdetailadjudicationreasoncoding.getSystem()));
		} else {
			c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgSys("NULL");
		}

		if(claimresponseadditemdetailsubdetailadjudicationreasoncodingi == claimresponseadditemdetailsubdetailadjudicationreasoncodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlAdjdctnRsnCdgSys("]]]]]");}


		 };
		/******************** claimresponseadditemdetailsubdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailsubdetailadjudicationcategory = claimresponseadditemdetailsubdetailadjudication.getCategory();

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationi == 0) {c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryTxt("[[[[");}
		if(claimresponseadditemdetailsubdetailadjudicationcategory.hasText()) {

			c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryTxt(String.valueOf(claimresponseadditemdetailsubdetailadjudicationcategory.getText()));
		} else {
			c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryTxt("NULL");
		}

		if(claimresponseadditemdetailsubdetailadjudicationi == claimresponseadditemdetailsubdetailadjudicationlist.size()-1) {c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryTxt("]]]]");}


		/******************** claimresponseadditemdetailsubdetailadjudicationcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseadditemdetailsubdetailadjudicationcategorycodinglist = claimresponseadditemdetailsubdetailadjudicationcategory.getCoding();
		for(int claimresponseadditemdetailsubdetailadjudicationcategorycodingi = 0; claimresponseadditemdetailsubdetailadjudicationcategorycodingi<claimresponseadditemdetailsubdetailadjudicationcategorycodinglist.size();claimresponseadditemdetailsubdetailadjudicationcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseadditemdetailsubdetailadjudicationcategorycoding = claimresponseadditemdetailsubdetailadjudicationcategorycodinglist.get(claimresponseadditemdetailsubdetailadjudicationcategorycodingi);

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationcategorycodingi == 0) {c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgDsply("[[[[[");}
		if(claimresponseadditemdetailsubdetailadjudicationcategorycoding.hasDisplay()) {

			c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgDsply(String.valueOf(claimresponseadditemdetailsubdetailadjudicationcategorycoding.getDisplay()));
		} else {
			c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgDsply("NULL");
		}

		if(claimresponseadditemdetailsubdetailadjudicationcategorycodingi == claimresponseadditemdetailsubdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgDsply("]]]]]");}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationcategorycodingi == 0) {c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgVrsn("[[[[[");}
		if(claimresponseadditemdetailsubdetailadjudicationcategorycoding.hasVersion()) {

			c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgVrsn(String.valueOf(claimresponseadditemdetailsubdetailadjudicationcategorycoding.getVersion()));
		} else {
			c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgVrsn("NULL");
		}

		if(claimresponseadditemdetailsubdetailadjudicationcategorycodingi == claimresponseadditemdetailsubdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgVrsn("]]]]]");}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationcategorycodingi == 0) {c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgCd("[[[[[");}
		if(claimresponseadditemdetailsubdetailadjudicationcategorycoding.hasCode()) {

			c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgCd(String.valueOf(claimresponseadditemdetailsubdetailadjudicationcategorycoding.getCode()));
		} else {
			c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgCd("NULL");
		}

		if(claimresponseadditemdetailsubdetailadjudicationcategorycodingi == claimresponseadditemdetailsubdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgCd("]]]]]");}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationcategorycodingi == 0) {c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd("[[[[[");}
		if(claimresponseadditemdetailsubdetailadjudicationcategorycoding.hasUserSelected()) {

			c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd(String.valueOf(claimresponseadditemdetailsubdetailadjudicationcategorycoding.getUserSelected()));
		} else {
			c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd("NULL");
		}

		if(claimresponseadditemdetailsubdetailadjudicationcategorycodingi == claimresponseadditemdetailsubdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd("]]]]]");}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationcategorycodingi == 0) {c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgSys("[[[[[");}
		if(claimresponseadditemdetailsubdetailadjudicationcategorycoding.hasSystem()) {

			c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgSys(String.valueOf(claimresponseadditemdetailsubdetailadjudicationcategorycoding.getSystem()));
		} else {
			c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgSys("NULL");
		}

		if(claimresponseadditemdetailsubdetailadjudicationcategorycodingi == claimresponseadditemdetailsubdetailadjudicationcategorycodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlAdjdctnCtgryCdgSys("]]]]]");}


		 };
		/******************** claimresponseadditemdetailsubdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemdetailsubdetailadjudicationamount = claimresponseadditemdetailsubdetailadjudication.getAmount();

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationi == 0) {c.addClmRspsAddItmDtlSubDtlAdjdctnAmntVl("[[[[");}
		if(claimresponseadditemdetailsubdetailadjudicationamount.hasValue()) {

			c.addClmRspsAddItmDtlSubDtlAdjdctnAmntVl(String.valueOf(claimresponseadditemdetailsubdetailadjudicationamount.getValue()));
		} else {
			c.addClmRspsAddItmDtlSubDtlAdjdctnAmntVl("NULL");
		}

		if(claimresponseadditemdetailsubdetailadjudicationi == claimresponseadditemdetailsubdetailadjudicationlist.size()-1) {c.addClmRspsAddItmDtlSubDtlAdjdctnAmntVl("]]]]");}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(claimresponseadditemdetailsubdetailadjudicationi == 0) {c.addClmRspsAddItmDtlSubDtlAdjdctnAmntCrncy("[[[[");}
		if(claimresponseadditemdetailsubdetailadjudicationamount.hasCurrency()) {

			c.addClmRspsAddItmDtlSubDtlAdjdctnAmntCrncy(String.valueOf(claimresponseadditemdetailsubdetailadjudicationamount.getCurrency()));
		} else {
			c.addClmRspsAddItmDtlSubDtlAdjdctnAmntCrncy("NULL");
		}

		if(claimresponseadditemdetailsubdetailadjudicationi == claimresponseadditemdetailsubdetailadjudicationlist.size()-1) {c.addClmRspsAddItmDtlSubDtlAdjdctnAmntCrncy("]]]]");}


		 };
		/******************** ClmRsps_AddItm_Dtl_SubDtl_Factor ********************************************************************************/
		if(claimresponseadditemdetailsubdetail.hasFactor()) {

			c.addClmRspsAddItmDtlSubDtlFactor(String.valueOf(claimresponseadditemdetailsubdetail.getFactor()));
		} else {
			c.addClmRspsAddItmDtlSubDtlFactor("NULL");
		}


		/******************** claimresponseadditemdetailsubdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemdetailsubdetailnet = claimresponseadditemdetailsubdetail.getNet();

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Net_Vl ********************************************************************************/
		if(claimresponseadditemdetailsubdetailnet.hasValue()) {

			c.addClmRspsAddItmDtlSubDtlNetVl(String.valueOf(claimresponseadditemdetailsubdetailnet.getValue()));
		} else {
			c.addClmRspsAddItmDtlSubDtlNetVl("NULL");
		}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_Net_Crncy ********************************************************************************/
		if(claimresponseadditemdetailsubdetailnet.hasCurrency()) {

			c.addClmRspsAddItmDtlSubDtlNetCrncy(String.valueOf(claimresponseadditemdetailsubdetailnet.getCurrency()));
		} else {
			c.addClmRspsAddItmDtlSubDtlNetCrncy("NULL");
		}


		/******************** claimresponseadditemdetailsubdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimresponseadditemdetailsubdetailquantity = claimresponseadditemdetailsubdetail.getQuantity();

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Qnty_Vl ********************************************************************************/
		if(claimresponseadditemdetailsubdetailquantity.hasValue()) {

			c.addClmRspsAddItmDtlSubDtlQntyVl(String.valueOf(claimresponseadditemdetailsubdetailquantity.getValue()));
		} else {
			c.addClmRspsAddItmDtlSubDtlQntyVl("NULL");
		}


		/******************** claimresponseadditemdetailsubdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator claimresponseadditemdetailsubdetailquantitycomparator = claimresponseadditemdetailsubdetailquantity.getComparator();
		if(claimresponseadditemdetailsubdetailquantitycomparator!=null) {
			c.addClmRspsAddItmDtlSubDtlQntyCmprtr(claimresponseadditemdetailsubdetailquantitycomparator.toCode());
		} else {
			c.addClmRspsAddItmDtlSubDtlQntyCmprtr("NULL");
		}

		/******************** ClmRsps_AddItm_Dtl_SubDtl_Qnty_Cd ********************************************************************************/
		if(claimresponseadditemdetailsubdetailquantity.hasCode()) {

			c.addClmRspsAddItmDtlSubDtlQntyCd(String.valueOf(claimresponseadditemdetailsubdetailquantity.getCode()));
		} else {
			c.addClmRspsAddItmDtlSubDtlQntyCd("NULL");
		}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_Qnty_Unt ********************************************************************************/
		if(claimresponseadditemdetailsubdetailquantity.hasUnit()) {

			c.addClmRspsAddItmDtlSubDtlQntyUnt(String.valueOf(claimresponseadditemdetailsubdetailquantity.getUnit()));
		} else {
			c.addClmRspsAddItmDtlSubDtlQntyUnt("NULL");
		}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_Qnty_Sys ********************************************************************************/
		if(claimresponseadditemdetailsubdetailquantity.hasSystem()) {

			c.addClmRspsAddItmDtlSubDtlQntySys(String.valueOf(claimresponseadditemdetailsubdetailquantity.getSystem()));
		} else {
			c.addClmRspsAddItmDtlSubDtlQntySys("NULL");
		}


		/******************** claimresponseadditemdetailsubdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemdetailsubdetailproductorservice = claimresponseadditemdetailsubdetail.getProductOrService();

		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Txt ********************************************************************************/
		if(claimresponseadditemdetailsubdetailproductorservice.hasText()) {

			c.addClmRspsAddItmDtlSubDtlPrdctOrSrvTxt(String.valueOf(claimresponseadditemdetailsubdetailproductorservice.getText()));
		} else {
			c.addClmRspsAddItmDtlSubDtlPrdctOrSrvTxt("NULL");
		}


		/******************** claimresponseadditemdetailsubdetailproductorservicecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseadditemdetailsubdetailproductorservicecodinglist = claimresponseadditemdetailsubdetailproductorservice.getCoding();
		for(int claimresponseadditemdetailsubdetailproductorservicecodingi = 0; claimresponseadditemdetailsubdetailproductorservicecodingi<claimresponseadditemdetailsubdetailproductorservicecodinglist.size();claimresponseadditemdetailsubdetailproductorservicecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseadditemdetailsubdetailproductorservicecoding = claimresponseadditemdetailsubdetailproductorservicecodinglist.get(claimresponseadditemdetailsubdetailproductorservicecodingi);

		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemdetailsubdetailproductorservicecodingi == 0) {c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgDsply("[[[[");}
		if(claimresponseadditemdetailsubdetailproductorservicecoding.hasDisplay()) {

			c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgDsply(String.valueOf(claimresponseadditemdetailsubdetailproductorservicecoding.getDisplay()));
		} else {
			c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgDsply("NULL");
		}

		if(claimresponseadditemdetailsubdetailproductorservicecodingi == claimresponseadditemdetailsubdetailproductorservicecodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgDsply("]]]]");}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemdetailsubdetailproductorservicecodingi == 0) {c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgVrsn("[[[[");}
		if(claimresponseadditemdetailsubdetailproductorservicecoding.hasVersion()) {

			c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgVrsn(String.valueOf(claimresponseadditemdetailsubdetailproductorservicecoding.getVersion()));
		} else {
			c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgVrsn("NULL");
		}

		if(claimresponseadditemdetailsubdetailproductorservicecodingi == claimresponseadditemdetailsubdetailproductorservicecodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgVrsn("]]]]");}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemdetailsubdetailproductorservicecodingi == 0) {c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgCd("[[[[");}
		if(claimresponseadditemdetailsubdetailproductorservicecoding.hasCode()) {

			c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgCd(String.valueOf(claimresponseadditemdetailsubdetailproductorservicecoding.getCode()));
		} else {
			c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgCd("NULL");
		}

		if(claimresponseadditemdetailsubdetailproductorservicecodingi == claimresponseadditemdetailsubdetailproductorservicecodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgCd("]]]]");}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemdetailsubdetailproductorservicecodingi == 0) {c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd("[[[[");}
		if(claimresponseadditemdetailsubdetailproductorservicecoding.hasUserSelected()) {

			c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd(String.valueOf(claimresponseadditemdetailsubdetailproductorservicecoding.getUserSelected()));
		} else {
			c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd("NULL");
		}

		if(claimresponseadditemdetailsubdetailproductorservicecodingi == claimresponseadditemdetailsubdetailproductorservicecodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd("]]]]");}


		/******************** ClmRsps_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemdetailsubdetailproductorservicecodingi == 0) {c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgSys("[[[[");}
		if(claimresponseadditemdetailsubdetailproductorservicecoding.hasSystem()) {

			c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgSys(String.valueOf(claimresponseadditemdetailsubdetailproductorservicecoding.getSystem()));
		} else {
			c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgSys("NULL");
		}

		if(claimresponseadditemdetailsubdetailproductorservicecodingi == claimresponseadditemdetailsubdetailproductorservicecodinglist.size()-1) {c.addClmRspsAddItmDtlSubDtlPrdctOrSrvCdgSys("]]]]");}


		 };
		/******************** ClmRsps_AddItm_Dtl_SubDtl_NtNmbr ********************************************************************************/
		if(claimresponseadditemdetailsubdetail.hasNoteNumber()) {

			String  array = "[";
			for(int incr=0; incr<claimresponseadditemdetailsubdetail.getNoteNumber().size(); incr++) {
				array = array + claimresponseadditemdetailsubdetail.getNoteNumber().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmRspsAddItmDtlSubDtlNtNmbr(array);

		} else {
			c.addClmRspsAddItmDtlSubDtlNtNmbr("NULL");
		}


		 };
		/******************** ClmRsps_AddItm_Dtl_NtNmbr ********************************************************************************/
		if(claimresponseadditemdetail.hasNoteNumber()) {

			String  array = "[";
			for(int incr=0; incr<claimresponseadditemdetail.getNoteNumber().size(); incr++) {
				array = array + claimresponseadditemdetail.getNoteNumber().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmRspsAddItmDtlNtNmbr(array);

		} else {
			c.addClmRspsAddItmDtlNtNmbr("NULL");
		}


		 };
		/******************** claimresponseadditembodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditembodysite = claimresponseadditem.getBodySite();

		/******************** ClmRsps_AddItm_BodySite_Txt ********************************************************************************/
		if(claimresponseadditembodysite.hasText()) {

			c.addClmRspsAddItmBodySiteTxt(String.valueOf(claimresponseadditembodysite.getText()));
		} else {
			c.addClmRspsAddItmBodySiteTxt("NULL");
		}


		/******************** claimresponseadditembodysitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseadditembodysitecodinglist = claimresponseadditembodysite.getCoding();
		for(int claimresponseadditembodysitecodingi = 0; claimresponseadditembodysitecodingi<claimresponseadditembodysitecodinglist.size();claimresponseadditembodysitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseadditembodysitecoding = claimresponseadditembodysitecodinglist.get(claimresponseadditembodysitecodingi);

		/******************** ClmRsps_AddItm_BodySite_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditembodysitecodingi == 0) {c.addClmRspsAddItmBodySiteCdgDsply("[[");}
		if(claimresponseadditembodysitecoding.hasDisplay()) {

			c.addClmRspsAddItmBodySiteCdgDsply(String.valueOf(claimresponseadditembodysitecoding.getDisplay()));
		} else {
			c.addClmRspsAddItmBodySiteCdgDsply("NULL");
		}

		if(claimresponseadditembodysitecodingi == claimresponseadditembodysitecodinglist.size()-1) {c.addClmRspsAddItmBodySiteCdgDsply("]]");}


		/******************** ClmRsps_AddItm_BodySite_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditembodysitecodingi == 0) {c.addClmRspsAddItmBodySiteCdgVrsn("[[");}
		if(claimresponseadditembodysitecoding.hasVersion()) {

			c.addClmRspsAddItmBodySiteCdgVrsn(String.valueOf(claimresponseadditembodysitecoding.getVersion()));
		} else {
			c.addClmRspsAddItmBodySiteCdgVrsn("NULL");
		}

		if(claimresponseadditembodysitecodingi == claimresponseadditembodysitecodinglist.size()-1) {c.addClmRspsAddItmBodySiteCdgVrsn("]]");}


		/******************** ClmRsps_AddItm_BodySite_Cdg_Cd ********************************************************************************/
		if(claimresponseadditembodysitecodingi == 0) {c.addClmRspsAddItmBodySiteCdgCd("[[");}
		if(claimresponseadditembodysitecoding.hasCode()) {

			c.addClmRspsAddItmBodySiteCdgCd(String.valueOf(claimresponseadditembodysitecoding.getCode()));
		} else {
			c.addClmRspsAddItmBodySiteCdgCd("NULL");
		}

		if(claimresponseadditembodysitecodingi == claimresponseadditembodysitecodinglist.size()-1) {c.addClmRspsAddItmBodySiteCdgCd("]]");}


		/******************** ClmRsps_AddItm_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditembodysitecodingi == 0) {c.addClmRspsAddItmBodySiteCdgUsrSltd("[[");}
		if(claimresponseadditembodysitecoding.hasUserSelected()) {

			c.addClmRspsAddItmBodySiteCdgUsrSltd(String.valueOf(claimresponseadditembodysitecoding.getUserSelected()));
		} else {
			c.addClmRspsAddItmBodySiteCdgUsrSltd("NULL");
		}

		if(claimresponseadditembodysitecodingi == claimresponseadditembodysitecodinglist.size()-1) {c.addClmRspsAddItmBodySiteCdgUsrSltd("]]");}


		/******************** ClmRsps_AddItm_BodySite_Cdg_Sys ********************************************************************************/
		if(claimresponseadditembodysitecodingi == 0) {c.addClmRspsAddItmBodySiteCdgSys("[[");}
		if(claimresponseadditembodysitecoding.hasSystem()) {

			c.addClmRspsAddItmBodySiteCdgSys(String.valueOf(claimresponseadditembodysitecoding.getSystem()));
		} else {
			c.addClmRspsAddItmBodySiteCdgSys("NULL");
		}

		if(claimresponseadditembodysitecodingi == claimresponseadditembodysitecodinglist.size()-1) {c.addClmRspsAddItmBodySiteCdgSys("]]");}


		 };
		/******************** claimresponseadditemmodifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> claimresponseadditemmodifierlist = claimresponseadditem.getModifier();
		for(int claimresponseadditemmodifieri = 0; claimresponseadditemmodifieri<claimresponseadditemmodifierlist.size();claimresponseadditemmodifieri++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  claimresponseadditemmodifier = claimresponseadditemmodifierlist.get(claimresponseadditemmodifieri);

		/******************** ClmRsps_AddItm_Mdfr_Txt ********************************************************************************/
		if(claimresponseadditemmodifieri == 0) {c.addClmRspsAddItmMdfrTxt("[[");}
		if(claimresponseadditemmodifier.hasText()) {

			c.addClmRspsAddItmMdfrTxt(String.valueOf(claimresponseadditemmodifier.getText()));
		} else {
			c.addClmRspsAddItmMdfrTxt("NULL");
		}

		if(claimresponseadditemmodifieri == claimresponseadditemmodifierlist.size()-1) {c.addClmRspsAddItmMdfrTxt("]]");}


		/******************** claimresponseadditemmodifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseadditemmodifiercodinglist = claimresponseadditemmodifier.getCoding();
		for(int claimresponseadditemmodifiercodingi = 0; claimresponseadditemmodifiercodingi<claimresponseadditemmodifiercodinglist.size();claimresponseadditemmodifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseadditemmodifiercoding = claimresponseadditemmodifiercodinglist.get(claimresponseadditemmodifiercodingi);

		/******************** ClmRsps_AddItm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemmodifiercodingi == 0) {c.addClmRspsAddItmMdfrCdgDsply("[[[");}
		if(claimresponseadditemmodifiercoding.hasDisplay()) {

			c.addClmRspsAddItmMdfrCdgDsply(String.valueOf(claimresponseadditemmodifiercoding.getDisplay()));
		} else {
			c.addClmRspsAddItmMdfrCdgDsply("NULL");
		}

		if(claimresponseadditemmodifiercodingi == claimresponseadditemmodifiercodinglist.size()-1) {c.addClmRspsAddItmMdfrCdgDsply("]]]");}


		/******************** ClmRsps_AddItm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemmodifiercodingi == 0) {c.addClmRspsAddItmMdfrCdgVrsn("[[[");}
		if(claimresponseadditemmodifiercoding.hasVersion()) {

			c.addClmRspsAddItmMdfrCdgVrsn(String.valueOf(claimresponseadditemmodifiercoding.getVersion()));
		} else {
			c.addClmRspsAddItmMdfrCdgVrsn("NULL");
		}

		if(claimresponseadditemmodifiercodingi == claimresponseadditemmodifiercodinglist.size()-1) {c.addClmRspsAddItmMdfrCdgVrsn("]]]");}


		/******************** ClmRsps_AddItm_Mdfr_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemmodifiercodingi == 0) {c.addClmRspsAddItmMdfrCdgCd("[[[");}
		if(claimresponseadditemmodifiercoding.hasCode()) {

			c.addClmRspsAddItmMdfrCdgCd(String.valueOf(claimresponseadditemmodifiercoding.getCode()));
		} else {
			c.addClmRspsAddItmMdfrCdgCd("NULL");
		}

		if(claimresponseadditemmodifiercodingi == claimresponseadditemmodifiercodinglist.size()-1) {c.addClmRspsAddItmMdfrCdgCd("]]]");}


		/******************** ClmRsps_AddItm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemmodifiercodingi == 0) {c.addClmRspsAddItmMdfrCdgUsrSltd("[[[");}
		if(claimresponseadditemmodifiercoding.hasUserSelected()) {

			c.addClmRspsAddItmMdfrCdgUsrSltd(String.valueOf(claimresponseadditemmodifiercoding.getUserSelected()));
		} else {
			c.addClmRspsAddItmMdfrCdgUsrSltd("NULL");
		}

		if(claimresponseadditemmodifiercodingi == claimresponseadditemmodifiercodinglist.size()-1) {c.addClmRspsAddItmMdfrCdgUsrSltd("]]]");}


		/******************** ClmRsps_AddItm_Mdfr_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemmodifiercodingi == 0) {c.addClmRspsAddItmMdfrCdgSys("[[[");}
		if(claimresponseadditemmodifiercoding.hasSystem()) {

			c.addClmRspsAddItmMdfrCdgSys(String.valueOf(claimresponseadditemmodifiercoding.getSystem()));
		} else {
			c.addClmRspsAddItmMdfrCdgSys("NULL");
		}

		if(claimresponseadditemmodifiercodingi == claimresponseadditemmodifiercodinglist.size()-1) {c.addClmRspsAddItmMdfrCdgSys("]]]");}


		 };
		 };
		/******************** claimresponseadditemadjudication ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent> claimresponseadditemadjudicationlist = claimresponseadditem.getAdjudication();
		for(int claimresponseadditemadjudicationi = 0; claimresponseadditemadjudicationi<claimresponseadditemadjudicationlist.size();claimresponseadditemadjudicationi++ ) {
		org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent  claimresponseadditemadjudication = claimresponseadditemadjudicationlist.get(claimresponseadditemadjudicationi);

		/******************** ClmRsps_AddItm_Adjdctn_Vl ********************************************************************************/
		if(claimresponseadditemadjudicationi == 0) {c.addClmRspsAddItmAdjdctnVl("[[");}
		if(claimresponseadditemadjudication.hasValue()) {

			c.addClmRspsAddItmAdjdctnVl(String.valueOf(claimresponseadditemadjudication.getValue()));
		} else {
			c.addClmRspsAddItmAdjdctnVl("NULL");
		}

		if(claimresponseadditemadjudicationi == claimresponseadditemadjudicationlist.size()-1) {c.addClmRspsAddItmAdjdctnVl("]]");}


		/******************** claimresponseadditemadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemadjudicationreason = claimresponseadditemadjudication.getReason();

		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Txt ********************************************************************************/
		if(claimresponseadditemadjudicationi == 0) {c.addClmRspsAddItmAdjdctnRsnTxt("[[");}
		if(claimresponseadditemadjudicationreason.hasText()) {

			c.addClmRspsAddItmAdjdctnRsnTxt(String.valueOf(claimresponseadditemadjudicationreason.getText()));
		} else {
			c.addClmRspsAddItmAdjdctnRsnTxt("NULL");
		}

		if(claimresponseadditemadjudicationi == claimresponseadditemadjudicationlist.size()-1) {c.addClmRspsAddItmAdjdctnRsnTxt("]]");}


		/******************** claimresponseadditemadjudicationreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseadditemadjudicationreasoncodinglist = claimresponseadditemadjudicationreason.getCoding();
		for(int claimresponseadditemadjudicationreasoncodingi = 0; claimresponseadditemadjudicationreasoncodingi<claimresponseadditemadjudicationreasoncodinglist.size();claimresponseadditemadjudicationreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseadditemadjudicationreasoncoding = claimresponseadditemadjudicationreasoncodinglist.get(claimresponseadditemadjudicationreasoncodingi);

		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemadjudicationreasoncodingi == 0) {c.addClmRspsAddItmAdjdctnRsnCdgDsply("[[[");}
		if(claimresponseadditemadjudicationreasoncoding.hasDisplay()) {

			c.addClmRspsAddItmAdjdctnRsnCdgDsply(String.valueOf(claimresponseadditemadjudicationreasoncoding.getDisplay()));
		} else {
			c.addClmRspsAddItmAdjdctnRsnCdgDsply("NULL");
		}

		if(claimresponseadditemadjudicationreasoncodingi == claimresponseadditemadjudicationreasoncodinglist.size()-1) {c.addClmRspsAddItmAdjdctnRsnCdgDsply("]]]");}


		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemadjudicationreasoncodingi == 0) {c.addClmRspsAddItmAdjdctnRsnCdgVrsn("[[[");}
		if(claimresponseadditemadjudicationreasoncoding.hasVersion()) {

			c.addClmRspsAddItmAdjdctnRsnCdgVrsn(String.valueOf(claimresponseadditemadjudicationreasoncoding.getVersion()));
		} else {
			c.addClmRspsAddItmAdjdctnRsnCdgVrsn("NULL");
		}

		if(claimresponseadditemadjudicationreasoncodingi == claimresponseadditemadjudicationreasoncodinglist.size()-1) {c.addClmRspsAddItmAdjdctnRsnCdgVrsn("]]]");}


		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemadjudicationreasoncodingi == 0) {c.addClmRspsAddItmAdjdctnRsnCdgCd("[[[");}
		if(claimresponseadditemadjudicationreasoncoding.hasCode()) {

			c.addClmRspsAddItmAdjdctnRsnCdgCd(String.valueOf(claimresponseadditemadjudicationreasoncoding.getCode()));
		} else {
			c.addClmRspsAddItmAdjdctnRsnCdgCd("NULL");
		}

		if(claimresponseadditemadjudicationreasoncodingi == claimresponseadditemadjudicationreasoncodinglist.size()-1) {c.addClmRspsAddItmAdjdctnRsnCdgCd("]]]");}


		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemadjudicationreasoncodingi == 0) {c.addClmRspsAddItmAdjdctnRsnCdgUsrSltd("[[[");}
		if(claimresponseadditemadjudicationreasoncoding.hasUserSelected()) {

			c.addClmRspsAddItmAdjdctnRsnCdgUsrSltd(String.valueOf(claimresponseadditemadjudicationreasoncoding.getUserSelected()));
		} else {
			c.addClmRspsAddItmAdjdctnRsnCdgUsrSltd("NULL");
		}

		if(claimresponseadditemadjudicationreasoncodingi == claimresponseadditemadjudicationreasoncodinglist.size()-1) {c.addClmRspsAddItmAdjdctnRsnCdgUsrSltd("]]]");}


		/******************** ClmRsps_AddItm_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemadjudicationreasoncodingi == 0) {c.addClmRspsAddItmAdjdctnRsnCdgSys("[[[");}
		if(claimresponseadditemadjudicationreasoncoding.hasSystem()) {

			c.addClmRspsAddItmAdjdctnRsnCdgSys(String.valueOf(claimresponseadditemadjudicationreasoncoding.getSystem()));
		} else {
			c.addClmRspsAddItmAdjdctnRsnCdgSys("NULL");
		}

		if(claimresponseadditemadjudicationreasoncodingi == claimresponseadditemadjudicationreasoncodinglist.size()-1) {c.addClmRspsAddItmAdjdctnRsnCdgSys("]]]");}


		 };
		/******************** claimresponseadditemadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemadjudicationcategory = claimresponseadditemadjudication.getCategory();

		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(claimresponseadditemadjudicationi == 0) {c.addClmRspsAddItmAdjdctnCtgryTxt("[[");}
		if(claimresponseadditemadjudicationcategory.hasText()) {

			c.addClmRspsAddItmAdjdctnCtgryTxt(String.valueOf(claimresponseadditemadjudicationcategory.getText()));
		} else {
			c.addClmRspsAddItmAdjdctnCtgryTxt("NULL");
		}

		if(claimresponseadditemadjudicationi == claimresponseadditemadjudicationlist.size()-1) {c.addClmRspsAddItmAdjdctnCtgryTxt("]]");}


		/******************** claimresponseadditemadjudicationcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseadditemadjudicationcategorycodinglist = claimresponseadditemadjudicationcategory.getCoding();
		for(int claimresponseadditemadjudicationcategorycodingi = 0; claimresponseadditemadjudicationcategorycodingi<claimresponseadditemadjudicationcategorycodinglist.size();claimresponseadditemadjudicationcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseadditemadjudicationcategorycoding = claimresponseadditemadjudicationcategorycodinglist.get(claimresponseadditemadjudicationcategorycodingi);

		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemadjudicationcategorycodingi == 0) {c.addClmRspsAddItmAdjdctnCtgryCdgDsply("[[[");}
		if(claimresponseadditemadjudicationcategorycoding.hasDisplay()) {

			c.addClmRspsAddItmAdjdctnCtgryCdgDsply(String.valueOf(claimresponseadditemadjudicationcategorycoding.getDisplay()));
		} else {
			c.addClmRspsAddItmAdjdctnCtgryCdgDsply("NULL");
		}

		if(claimresponseadditemadjudicationcategorycodingi == claimresponseadditemadjudicationcategorycodinglist.size()-1) {c.addClmRspsAddItmAdjdctnCtgryCdgDsply("]]]");}


		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemadjudicationcategorycodingi == 0) {c.addClmRspsAddItmAdjdctnCtgryCdgVrsn("[[[");}
		if(claimresponseadditemadjudicationcategorycoding.hasVersion()) {

			c.addClmRspsAddItmAdjdctnCtgryCdgVrsn(String.valueOf(claimresponseadditemadjudicationcategorycoding.getVersion()));
		} else {
			c.addClmRspsAddItmAdjdctnCtgryCdgVrsn("NULL");
		}

		if(claimresponseadditemadjudicationcategorycodingi == claimresponseadditemadjudicationcategorycodinglist.size()-1) {c.addClmRspsAddItmAdjdctnCtgryCdgVrsn("]]]");}


		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemadjudicationcategorycodingi == 0) {c.addClmRspsAddItmAdjdctnCtgryCdgCd("[[[");}
		if(claimresponseadditemadjudicationcategorycoding.hasCode()) {

			c.addClmRspsAddItmAdjdctnCtgryCdgCd(String.valueOf(claimresponseadditemadjudicationcategorycoding.getCode()));
		} else {
			c.addClmRspsAddItmAdjdctnCtgryCdgCd("NULL");
		}

		if(claimresponseadditemadjudicationcategorycodingi == claimresponseadditemadjudicationcategorycodinglist.size()-1) {c.addClmRspsAddItmAdjdctnCtgryCdgCd("]]]");}


		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemadjudicationcategorycodingi == 0) {c.addClmRspsAddItmAdjdctnCtgryCdgUsrSltd("[[[");}
		if(claimresponseadditemadjudicationcategorycoding.hasUserSelected()) {

			c.addClmRspsAddItmAdjdctnCtgryCdgUsrSltd(String.valueOf(claimresponseadditemadjudicationcategorycoding.getUserSelected()));
		} else {
			c.addClmRspsAddItmAdjdctnCtgryCdgUsrSltd("NULL");
		}

		if(claimresponseadditemadjudicationcategorycodingi == claimresponseadditemadjudicationcategorycodinglist.size()-1) {c.addClmRspsAddItmAdjdctnCtgryCdgUsrSltd("]]]");}


		/******************** ClmRsps_AddItm_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemadjudicationcategorycodingi == 0) {c.addClmRspsAddItmAdjdctnCtgryCdgSys("[[[");}
		if(claimresponseadditemadjudicationcategorycoding.hasSystem()) {

			c.addClmRspsAddItmAdjdctnCtgryCdgSys(String.valueOf(claimresponseadditemadjudicationcategorycoding.getSystem()));
		} else {
			c.addClmRspsAddItmAdjdctnCtgryCdgSys("NULL");
		}

		if(claimresponseadditemadjudicationcategorycodingi == claimresponseadditemadjudicationcategorycodinglist.size()-1) {c.addClmRspsAddItmAdjdctnCtgryCdgSys("]]]");}


		 };
		/******************** claimresponseadditemadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemadjudicationamount = claimresponseadditemadjudication.getAmount();

		/******************** ClmRsps_AddItm_Adjdctn_Amnt_Vl ********************************************************************************/
		if(claimresponseadditemadjudicationi == 0) {c.addClmRspsAddItmAdjdctnAmntVl("[[");}
		if(claimresponseadditemadjudicationamount.hasValue()) {

			c.addClmRspsAddItmAdjdctnAmntVl(String.valueOf(claimresponseadditemadjudicationamount.getValue()));
		} else {
			c.addClmRspsAddItmAdjdctnAmntVl("NULL");
		}

		if(claimresponseadditemadjudicationi == claimresponseadditemadjudicationlist.size()-1) {c.addClmRspsAddItmAdjdctnAmntVl("]]");}


		/******************** ClmRsps_AddItm_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(claimresponseadditemadjudicationi == 0) {c.addClmRspsAddItmAdjdctnAmntCrncy("[[");}
		if(claimresponseadditemadjudicationamount.hasCurrency()) {

			c.addClmRspsAddItmAdjdctnAmntCrncy(String.valueOf(claimresponseadditemadjudicationamount.getCurrency()));
		} else {
			c.addClmRspsAddItmAdjdctnAmntCrncy("NULL");
		}

		if(claimresponseadditemadjudicationi == claimresponseadditemadjudicationlist.size()-1) {c.addClmRspsAddItmAdjdctnAmntCrncy("]]");}


		 };
		/******************** ClmRsps_AddItm_Factor ********************************************************************************/
		if(claimresponseadditem.hasFactor()) {

			c.addClmRspsAddItmFactor(String.valueOf(claimresponseadditem.getFactor()));
		} else {
			c.addClmRspsAddItmFactor("NULL");
		}


		/******************** claimresponseadditemnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponseadditemnet = claimresponseadditem.getNet();

		/******************** ClmRsps_AddItm_Net_Vl ********************************************************************************/
		if(claimresponseadditemnet.hasValue()) {

			c.addClmRspsAddItmNetVl(String.valueOf(claimresponseadditemnet.getValue()));
		} else {
			c.addClmRspsAddItmNetVl("NULL");
		}


		/******************** ClmRsps_AddItm_Net_Crncy ********************************************************************************/
		if(claimresponseadditemnet.hasCurrency()) {

			c.addClmRspsAddItmNetCrncy(String.valueOf(claimresponseadditemnet.getCurrency()));
		} else {
			c.addClmRspsAddItmNetCrncy("NULL");
		}


		/******************** ClmRsps_AddItm_SrvdDtTyp ********************************************************************************/
		if(claimresponseadditem.hasServicedDateType()) {

			c.addClmRspsAddItmSrvdDtTyp("\""+claimresponseadditem.getServicedDateType().getValueAsString()+"\"");
		} else {
			c.addClmRspsAddItmSrvdDtTyp("NULL");
		}


		/******************** claimresponseadditemlocationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemlocationcodeableconcept = claimresponseadditem.getLocationCodeableConcept();

		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Txt ********************************************************************************/
		if(claimresponseadditemlocationcodeableconcept.hasText()) {

			c.addClmRspsAddItmLctnCdbleCncptTxt(String.valueOf(claimresponseadditemlocationcodeableconcept.getText()));
		} else {
			c.addClmRspsAddItmLctnCdbleCncptTxt("NULL");
		}


		/******************** claimresponseadditemlocationcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseadditemlocationcodeableconceptcodinglist = claimresponseadditemlocationcodeableconcept.getCoding();
		for(int claimresponseadditemlocationcodeableconceptcodingi = 0; claimresponseadditemlocationcodeableconceptcodingi<claimresponseadditemlocationcodeableconceptcodinglist.size();claimresponseadditemlocationcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseadditemlocationcodeableconceptcoding = claimresponseadditemlocationcodeableconceptcodinglist.get(claimresponseadditemlocationcodeableconceptcodingi);

		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemlocationcodeableconceptcodingi == 0) {c.addClmRspsAddItmLctnCdbleCncptCdgDsply("[[");}
		if(claimresponseadditemlocationcodeableconceptcoding.hasDisplay()) {

			c.addClmRspsAddItmLctnCdbleCncptCdgDsply(String.valueOf(claimresponseadditemlocationcodeableconceptcoding.getDisplay()));
		} else {
			c.addClmRspsAddItmLctnCdbleCncptCdgDsply("NULL");
		}

		if(claimresponseadditemlocationcodeableconceptcodingi == claimresponseadditemlocationcodeableconceptcodinglist.size()-1) {c.addClmRspsAddItmLctnCdbleCncptCdgDsply("]]");}


		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemlocationcodeableconceptcodingi == 0) {c.addClmRspsAddItmLctnCdbleCncptCdgVrsn("[[");}
		if(claimresponseadditemlocationcodeableconceptcoding.hasVersion()) {

			c.addClmRspsAddItmLctnCdbleCncptCdgVrsn(String.valueOf(claimresponseadditemlocationcodeableconceptcoding.getVersion()));
		} else {
			c.addClmRspsAddItmLctnCdbleCncptCdgVrsn("NULL");
		}

		if(claimresponseadditemlocationcodeableconceptcodingi == claimresponseadditemlocationcodeableconceptcodinglist.size()-1) {c.addClmRspsAddItmLctnCdbleCncptCdgVrsn("]]");}


		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemlocationcodeableconceptcodingi == 0) {c.addClmRspsAddItmLctnCdbleCncptCdgCd("[[");}
		if(claimresponseadditemlocationcodeableconceptcoding.hasCode()) {

			c.addClmRspsAddItmLctnCdbleCncptCdgCd(String.valueOf(claimresponseadditemlocationcodeableconceptcoding.getCode()));
		} else {
			c.addClmRspsAddItmLctnCdbleCncptCdgCd("NULL");
		}

		if(claimresponseadditemlocationcodeableconceptcodingi == claimresponseadditemlocationcodeableconceptcodinglist.size()-1) {c.addClmRspsAddItmLctnCdbleCncptCdgCd("]]");}


		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemlocationcodeableconceptcodingi == 0) {c.addClmRspsAddItmLctnCdbleCncptCdgUsrSltd("[[");}
		if(claimresponseadditemlocationcodeableconceptcoding.hasUserSelected()) {

			c.addClmRspsAddItmLctnCdbleCncptCdgUsrSltd(String.valueOf(claimresponseadditemlocationcodeableconceptcoding.getUserSelected()));
		} else {
			c.addClmRspsAddItmLctnCdbleCncptCdgUsrSltd("NULL");
		}

		if(claimresponseadditemlocationcodeableconceptcodingi == claimresponseadditemlocationcodeableconceptcodinglist.size()-1) {c.addClmRspsAddItmLctnCdbleCncptCdgUsrSltd("]]");}


		/******************** ClmRsps_AddItm_LctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemlocationcodeableconceptcodingi == 0) {c.addClmRspsAddItmLctnCdbleCncptCdgSys("[[");}
		if(claimresponseadditemlocationcodeableconceptcoding.hasSystem()) {

			c.addClmRspsAddItmLctnCdbleCncptCdgSys(String.valueOf(claimresponseadditemlocationcodeableconceptcoding.getSystem()));
		} else {
			c.addClmRspsAddItmLctnCdbleCncptCdgSys("NULL");
		}

		if(claimresponseadditemlocationcodeableconceptcodingi == claimresponseadditemlocationcodeableconceptcodinglist.size()-1) {c.addClmRspsAddItmLctnCdbleCncptCdgSys("]]");}


		 };
		/******************** claimresponseadditemservicedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimresponseadditemservicedperiod = claimresponseadditem.getServicedPeriod();

		/******************** ClmRsps_AddItm_SrvdPrd_Strt ********************************************************************************/
		if(claimresponseadditemservicedperiod.hasStart()) {

			c.addClmRspsAddItmSrvdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimresponseadditemservicedperiod.getStart())+"\"");
		} else {
			c.addClmRspsAddItmSrvdPrdStrt("NULL");
		}


		/******************** ClmRsps_AddItm_SrvdPrd_End ********************************************************************************/
		if(claimresponseadditemservicedperiod.hasEnd()) {

			c.addClmRspsAddItmSrvdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimresponseadditemservicedperiod.getEnd())+"\"");
		} else {
			c.addClmRspsAddItmSrvdPrdEnd("NULL");
		}


		/******************** claimresponseadditemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimresponseadditemquantity = claimresponseadditem.getQuantity();

		/******************** ClmRsps_AddItm_Qnty_Vl ********************************************************************************/
		if(claimresponseadditemquantity.hasValue()) {

			c.addClmRspsAddItmQntyVl(String.valueOf(claimresponseadditemquantity.getValue()));
		} else {
			c.addClmRspsAddItmQntyVl("NULL");
		}


		/******************** claimresponseadditemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator claimresponseadditemquantitycomparator = claimresponseadditemquantity.getComparator();
		if(claimresponseadditemquantitycomparator!=null) {
			c.addClmRspsAddItmQntyCmprtr(claimresponseadditemquantitycomparator.toCode());
		} else {
			c.addClmRspsAddItmQntyCmprtr("NULL");
		}

		/******************** ClmRsps_AddItm_Qnty_Cd ********************************************************************************/
		if(claimresponseadditemquantity.hasCode()) {

			c.addClmRspsAddItmQntyCd(String.valueOf(claimresponseadditemquantity.getCode()));
		} else {
			c.addClmRspsAddItmQntyCd("NULL");
		}


		/******************** ClmRsps_AddItm_Qnty_Unt ********************************************************************************/
		if(claimresponseadditemquantity.hasUnit()) {

			c.addClmRspsAddItmQntyUnt(String.valueOf(claimresponseadditemquantity.getUnit()));
		} else {
			c.addClmRspsAddItmQntyUnt("NULL");
		}


		/******************** ClmRsps_AddItm_Qnty_Sys ********************************************************************************/
		if(claimresponseadditemquantity.hasSystem()) {

			c.addClmRspsAddItmQntySys(String.valueOf(claimresponseadditemquantity.getSystem()));
		} else {
			c.addClmRspsAddItmQntySys("NULL");
		}


		/******************** claimresponseadditemproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseadditemproductorservice = claimresponseadditem.getProductOrService();

		/******************** ClmRsps_AddItm_PrdctOrSrv_Txt ********************************************************************************/
		if(claimresponseadditemproductorservice.hasText()) {

			c.addClmRspsAddItmPrdctOrSrvTxt(String.valueOf(claimresponseadditemproductorservice.getText()));
		} else {
			c.addClmRspsAddItmPrdctOrSrvTxt("NULL");
		}


		/******************** claimresponseadditemproductorservicecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseadditemproductorservicecodinglist = claimresponseadditemproductorservice.getCoding();
		for(int claimresponseadditemproductorservicecodingi = 0; claimresponseadditemproductorservicecodingi<claimresponseadditemproductorservicecodinglist.size();claimresponseadditemproductorservicecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseadditemproductorservicecoding = claimresponseadditemproductorservicecodinglist.get(claimresponseadditemproductorservicecodingi);

		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemproductorservicecodingi == 0) {c.addClmRspsAddItmPrdctOrSrvCdgDsply("[[");}
		if(claimresponseadditemproductorservicecoding.hasDisplay()) {

			c.addClmRspsAddItmPrdctOrSrvCdgDsply(String.valueOf(claimresponseadditemproductorservicecoding.getDisplay()));
		} else {
			c.addClmRspsAddItmPrdctOrSrvCdgDsply("NULL");
		}

		if(claimresponseadditemproductorservicecodingi == claimresponseadditemproductorservicecodinglist.size()-1) {c.addClmRspsAddItmPrdctOrSrvCdgDsply("]]");}


		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemproductorservicecodingi == 0) {c.addClmRspsAddItmPrdctOrSrvCdgVrsn("[[");}
		if(claimresponseadditemproductorservicecoding.hasVersion()) {

			c.addClmRspsAddItmPrdctOrSrvCdgVrsn(String.valueOf(claimresponseadditemproductorservicecoding.getVersion()));
		} else {
			c.addClmRspsAddItmPrdctOrSrvCdgVrsn("NULL");
		}

		if(claimresponseadditemproductorservicecodingi == claimresponseadditemproductorservicecodinglist.size()-1) {c.addClmRspsAddItmPrdctOrSrvCdgVrsn("]]");}


		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemproductorservicecodingi == 0) {c.addClmRspsAddItmPrdctOrSrvCdgCd("[[");}
		if(claimresponseadditemproductorservicecoding.hasCode()) {

			c.addClmRspsAddItmPrdctOrSrvCdgCd(String.valueOf(claimresponseadditemproductorservicecoding.getCode()));
		} else {
			c.addClmRspsAddItmPrdctOrSrvCdgCd("NULL");
		}

		if(claimresponseadditemproductorservicecodingi == claimresponseadditemproductorservicecodinglist.size()-1) {c.addClmRspsAddItmPrdctOrSrvCdgCd("]]");}


		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemproductorservicecodingi == 0) {c.addClmRspsAddItmPrdctOrSrvCdgUsrSltd("[[");}
		if(claimresponseadditemproductorservicecoding.hasUserSelected()) {

			c.addClmRspsAddItmPrdctOrSrvCdgUsrSltd(String.valueOf(claimresponseadditemproductorservicecoding.getUserSelected()));
		} else {
			c.addClmRspsAddItmPrdctOrSrvCdgUsrSltd("NULL");
		}

		if(claimresponseadditemproductorservicecodingi == claimresponseadditemproductorservicecodinglist.size()-1) {c.addClmRspsAddItmPrdctOrSrvCdgUsrSltd("]]");}


		/******************** ClmRsps_AddItm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemproductorservicecodingi == 0) {c.addClmRspsAddItmPrdctOrSrvCdgSys("[[");}
		if(claimresponseadditemproductorservicecoding.hasSystem()) {

			c.addClmRspsAddItmPrdctOrSrvCdgSys(String.valueOf(claimresponseadditemproductorservicecoding.getSystem()));
		} else {
			c.addClmRspsAddItmPrdctOrSrvCdgSys("NULL");
		}

		if(claimresponseadditemproductorservicecodingi == claimresponseadditemproductorservicecodinglist.size()-1) {c.addClmRspsAddItmPrdctOrSrvCdgSys("]]");}


		 };
		/******************** ClmRsps_AddItm_ItmSqnc ********************************************************************************/
		if(claimresponseadditem.hasItemSequence()) {

			String  array = "[";
			for(int incr=0; incr<claimresponseadditem.getItemSequence().size(); incr++) {
				array = array + claimresponseadditem.getItemSequence().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmRspsAddItmItmSqnc(array);

		} else {
			c.addClmRspsAddItmItmSqnc("NULL");
		}


		/******************** ClmRsps_AddItm_DtlSqnc ********************************************************************************/
		if(claimresponseadditem.hasDetailSequence()) {

			String  array = "[";
			for(int incr=0; incr<claimresponseadditem.getDetailSequence().size(); incr++) {
				array = array + claimresponseadditem.getDetailSequence().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmRspsAddItmDtlSqnc(array);

		} else {
			c.addClmRspsAddItmDtlSqnc("NULL");
		}


		/******************** claimresponseadditemprogramcode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> claimresponseadditemprogramcodelist = claimresponseadditem.getProgramCode();
		for(int claimresponseadditemprogramcodei = 0; claimresponseadditemprogramcodei<claimresponseadditemprogramcodelist.size();claimresponseadditemprogramcodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  claimresponseadditemprogramcode = claimresponseadditemprogramcodelist.get(claimresponseadditemprogramcodei);

		/******************** ClmRsps_AddItm_PrgrmCd_Txt ********************************************************************************/
		if(claimresponseadditemprogramcodei == 0) {c.addClmRspsAddItmPrgrmCdTxt("[[");}
		if(claimresponseadditemprogramcode.hasText()) {

			c.addClmRspsAddItmPrgrmCdTxt(String.valueOf(claimresponseadditemprogramcode.getText()));
		} else {
			c.addClmRspsAddItmPrgrmCdTxt("NULL");
		}

		if(claimresponseadditemprogramcodei == claimresponseadditemprogramcodelist.size()-1) {c.addClmRspsAddItmPrgrmCdTxt("]]");}


		/******************** claimresponseadditemprogramcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseadditemprogramcodecodinglist = claimresponseadditemprogramcode.getCoding();
		for(int claimresponseadditemprogramcodecodingi = 0; claimresponseadditemprogramcodecodingi<claimresponseadditemprogramcodecodinglist.size();claimresponseadditemprogramcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseadditemprogramcodecoding = claimresponseadditemprogramcodecodinglist.get(claimresponseadditemprogramcodecodingi);

		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemprogramcodecodingi == 0) {c.addClmRspsAddItmPrgrmCdCdgDsply("[[[");}
		if(claimresponseadditemprogramcodecoding.hasDisplay()) {

			c.addClmRspsAddItmPrgrmCdCdgDsply(String.valueOf(claimresponseadditemprogramcodecoding.getDisplay()));
		} else {
			c.addClmRspsAddItmPrgrmCdCdgDsply("NULL");
		}

		if(claimresponseadditemprogramcodecodingi == claimresponseadditemprogramcodecodinglist.size()-1) {c.addClmRspsAddItmPrgrmCdCdgDsply("]]]");}


		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemprogramcodecodingi == 0) {c.addClmRspsAddItmPrgrmCdCdgVrsn("[[[");}
		if(claimresponseadditemprogramcodecoding.hasVersion()) {

			c.addClmRspsAddItmPrgrmCdCdgVrsn(String.valueOf(claimresponseadditemprogramcodecoding.getVersion()));
		} else {
			c.addClmRspsAddItmPrgrmCdCdgVrsn("NULL");
		}

		if(claimresponseadditemprogramcodecodingi == claimresponseadditemprogramcodecodinglist.size()-1) {c.addClmRspsAddItmPrgrmCdCdgVrsn("]]]");}


		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemprogramcodecodingi == 0) {c.addClmRspsAddItmPrgrmCdCdgCd("[[[");}
		if(claimresponseadditemprogramcodecoding.hasCode()) {

			c.addClmRspsAddItmPrgrmCdCdgCd(String.valueOf(claimresponseadditemprogramcodecoding.getCode()));
		} else {
			c.addClmRspsAddItmPrgrmCdCdgCd("NULL");
		}

		if(claimresponseadditemprogramcodecodingi == claimresponseadditemprogramcodecodinglist.size()-1) {c.addClmRspsAddItmPrgrmCdCdgCd("]]]");}


		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemprogramcodecodingi == 0) {c.addClmRspsAddItmPrgrmCdCdgUsrSltd("[[[");}
		if(claimresponseadditemprogramcodecoding.hasUserSelected()) {

			c.addClmRspsAddItmPrgrmCdCdgUsrSltd(String.valueOf(claimresponseadditemprogramcodecoding.getUserSelected()));
		} else {
			c.addClmRspsAddItmPrgrmCdCdgUsrSltd("NULL");
		}

		if(claimresponseadditemprogramcodecodingi == claimresponseadditemprogramcodecodinglist.size()-1) {c.addClmRspsAddItmPrgrmCdCdgUsrSltd("]]]");}


		/******************** ClmRsps_AddItm_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemprogramcodecodingi == 0) {c.addClmRspsAddItmPrgrmCdCdgSys("[[[");}
		if(claimresponseadditemprogramcodecoding.hasSystem()) {

			c.addClmRspsAddItmPrgrmCdCdgSys(String.valueOf(claimresponseadditemprogramcodecoding.getSystem()));
		} else {
			c.addClmRspsAddItmPrgrmCdCdgSys("NULL");
		}

		if(claimresponseadditemprogramcodecodingi == claimresponseadditemprogramcodecodinglist.size()-1) {c.addClmRspsAddItmPrgrmCdCdgSys("]]]");}


		 };
		 };
		/******************** claimresponseadditemsubsite ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> claimresponseadditemsubsitelist = claimresponseadditem.getSubSite();
		for(int claimresponseadditemsubsitei = 0; claimresponseadditemsubsitei<claimresponseadditemsubsitelist.size();claimresponseadditemsubsitei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  claimresponseadditemsubsite = claimresponseadditemsubsitelist.get(claimresponseadditemsubsitei);

		/******************** ClmRsps_AddItm_SubSite_Txt ********************************************************************************/
		if(claimresponseadditemsubsitei == 0) {c.addClmRspsAddItmSubSiteTxt("[[");}
		if(claimresponseadditemsubsite.hasText()) {

			c.addClmRspsAddItmSubSiteTxt(String.valueOf(claimresponseadditemsubsite.getText()));
		} else {
			c.addClmRspsAddItmSubSiteTxt("NULL");
		}

		if(claimresponseadditemsubsitei == claimresponseadditemsubsitelist.size()-1) {c.addClmRspsAddItmSubSiteTxt("]]");}


		/******************** claimresponseadditemsubsitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseadditemsubsitecodinglist = claimresponseadditemsubsite.getCoding();
		for(int claimresponseadditemsubsitecodingi = 0; claimresponseadditemsubsitecodingi<claimresponseadditemsubsitecodinglist.size();claimresponseadditemsubsitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseadditemsubsitecoding = claimresponseadditemsubsitecodinglist.get(claimresponseadditemsubsitecodingi);

		/******************** ClmRsps_AddItm_SubSite_Cdg_Dsply ********************************************************************************/
		if(claimresponseadditemsubsitecodingi == 0) {c.addClmRspsAddItmSubSiteCdgDsply("[[[");}
		if(claimresponseadditemsubsitecoding.hasDisplay()) {

			c.addClmRspsAddItmSubSiteCdgDsply(String.valueOf(claimresponseadditemsubsitecoding.getDisplay()));
		} else {
			c.addClmRspsAddItmSubSiteCdgDsply("NULL");
		}

		if(claimresponseadditemsubsitecodingi == claimresponseadditemsubsitecodinglist.size()-1) {c.addClmRspsAddItmSubSiteCdgDsply("]]]");}


		/******************** ClmRsps_AddItm_SubSite_Cdg_Vrsn ********************************************************************************/
		if(claimresponseadditemsubsitecodingi == 0) {c.addClmRspsAddItmSubSiteCdgVrsn("[[[");}
		if(claimresponseadditemsubsitecoding.hasVersion()) {

			c.addClmRspsAddItmSubSiteCdgVrsn(String.valueOf(claimresponseadditemsubsitecoding.getVersion()));
		} else {
			c.addClmRspsAddItmSubSiteCdgVrsn("NULL");
		}

		if(claimresponseadditemsubsitecodingi == claimresponseadditemsubsitecodinglist.size()-1) {c.addClmRspsAddItmSubSiteCdgVrsn("]]]");}


		/******************** ClmRsps_AddItm_SubSite_Cdg_Cd ********************************************************************************/
		if(claimresponseadditemsubsitecodingi == 0) {c.addClmRspsAddItmSubSiteCdgCd("[[[");}
		if(claimresponseadditemsubsitecoding.hasCode()) {

			c.addClmRspsAddItmSubSiteCdgCd(String.valueOf(claimresponseadditemsubsitecoding.getCode()));
		} else {
			c.addClmRspsAddItmSubSiteCdgCd("NULL");
		}

		if(claimresponseadditemsubsitecodingi == claimresponseadditemsubsitecodinglist.size()-1) {c.addClmRspsAddItmSubSiteCdgCd("]]]");}


		/******************** ClmRsps_AddItm_SubSite_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseadditemsubsitecodingi == 0) {c.addClmRspsAddItmSubSiteCdgUsrSltd("[[[");}
		if(claimresponseadditemsubsitecoding.hasUserSelected()) {

			c.addClmRspsAddItmSubSiteCdgUsrSltd(String.valueOf(claimresponseadditemsubsitecoding.getUserSelected()));
		} else {
			c.addClmRspsAddItmSubSiteCdgUsrSltd("NULL");
		}

		if(claimresponseadditemsubsitecodingi == claimresponseadditemsubsitecodinglist.size()-1) {c.addClmRspsAddItmSubSiteCdgUsrSltd("]]]");}


		/******************** ClmRsps_AddItm_SubSite_Cdg_Sys ********************************************************************************/
		if(claimresponseadditemsubsitecodingi == 0) {c.addClmRspsAddItmSubSiteCdgSys("[[[");}
		if(claimresponseadditemsubsitecoding.hasSystem()) {

			c.addClmRspsAddItmSubSiteCdgSys(String.valueOf(claimresponseadditemsubsitecoding.getSystem()));
		} else {
			c.addClmRspsAddItmSubSiteCdgSys("NULL");
		}

		if(claimresponseadditemsubsitecodingi == claimresponseadditemsubsitecodinglist.size()-1) {c.addClmRspsAddItmSubSiteCdgSys("]]]");}


		 };
		 };
		/******************** ClmRsps_AddItm_NtNmbr ********************************************************************************/
		if(claimresponseadditem.hasNoteNumber()) {

			String  array = "[";
			for(int incr=0; incr<claimresponseadditem.getNoteNumber().size(); incr++) {
				array = array + claimresponseadditem.getNoteNumber().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmRspsAddItmNtNmbr(array);

		} else {
			c.addClmRspsAddItmNtNmbr("NULL");
		}


		/******************** claimresponseadditemlocationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address claimresponseadditemlocationaddress = claimresponseadditem.getLocationAddress();

		/******************** ClmRsps_AddItm_LctnAddr_State ********************************************************************************/
		if(claimresponseadditemlocationaddress.hasState()) {

			c.addClmRspsAddItmLctnAddrState(String.valueOf(claimresponseadditemlocationaddress.getState()));
		} else {
			c.addClmRspsAddItmLctnAddrState("NULL");
		}


		/******************** claimresponseadditemlocationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType claimresponseadditemlocationaddresstype = claimresponseadditemlocationaddress.getType();
		if(claimresponseadditemlocationaddresstype!=null) {
			c.addClmRspsAddItmLctnAddrTyp(claimresponseadditemlocationaddresstype.toCode());
		} else {
			c.addClmRspsAddItmLctnAddrTyp("NULL");
		}

		/******************** ClmRsps_AddItm_LctnAddr_Cntry ********************************************************************************/
		if(claimresponseadditemlocationaddress.hasCountry()) {

			c.addClmRspsAddItmLctnAddrCntry(String.valueOf(claimresponseadditemlocationaddress.getCountry()));
		} else {
			c.addClmRspsAddItmLctnAddrCntry("NULL");
		}


		/******************** claimresponseadditemlocationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimresponseadditemlocationaddressperiod = claimresponseadditemlocationaddress.getPeriod();

		/******************** ClmRsps_AddItm_LctnAddr_Prd_Strt ********************************************************************************/
		if(claimresponseadditemlocationaddressperiod.hasStart()) {

			c.addClmRspsAddItmLctnAddrPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimresponseadditemlocationaddressperiod.getStart())+"\"");
		} else {
			c.addClmRspsAddItmLctnAddrPrdStrt("NULL");
		}


		/******************** ClmRsps_AddItm_LctnAddr_Prd_End ********************************************************************************/
		if(claimresponseadditemlocationaddressperiod.hasEnd()) {

			c.addClmRspsAddItmLctnAddrPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimresponseadditemlocationaddressperiod.getEnd())+"\"");
		} else {
			c.addClmRspsAddItmLctnAddrPrdEnd("NULL");
		}


		/******************** ClmRsps_AddItm_LctnAddr_District ********************************************************************************/
		if(claimresponseadditemlocationaddress.hasDistrict()) {

			c.addClmRspsAddItmLctnAddrDistrict(String.valueOf(claimresponseadditemlocationaddress.getDistrict()));
		} else {
			c.addClmRspsAddItmLctnAddrDistrict("NULL");
		}


		/******************** ClmRsps_AddItm_LctnAddr_PostalCd ********************************************************************************/
		if(claimresponseadditemlocationaddress.hasPostalCode()) {

			c.addClmRspsAddItmLctnAddrPostalCd(String.valueOf(claimresponseadditemlocationaddress.getPostalCode()));
		} else {
			c.addClmRspsAddItmLctnAddrPostalCd("NULL");
		}


		/******************** ClmRsps_AddItm_LctnAddr_Line ********************************************************************************/
		if(claimresponseadditemlocationaddress.hasLine()) {

			String  array = "[";
			for(int incr=0; incr<claimresponseadditemlocationaddress.getLine().size(); incr++) {
				array = array + claimresponseadditemlocationaddress.getLine().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmRspsAddItmLctnAddrLine(array);

		} else {
			c.addClmRspsAddItmLctnAddrLine("NULL");
		}


		/******************** ClmRsps_AddItm_LctnAddr_City ********************************************************************************/
		if(claimresponseadditemlocationaddress.hasCity()) {

			c.addClmRspsAddItmLctnAddrCity(String.valueOf(claimresponseadditemlocationaddress.getCity()));
		} else {
			c.addClmRspsAddItmLctnAddrCity("NULL");
		}


		/******************** claimresponseadditemlocationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse claimresponseadditemlocationaddressuse = claimresponseadditemlocationaddress.getUse();
		if(claimresponseadditemlocationaddressuse!=null) {
			c.addClmRspsAddItmLctnAddrUse(claimresponseadditemlocationaddressuse.toCode());
		} else {
			c.addClmRspsAddItmLctnAddrUse("NULL");
		}

		/******************** ClmRsps_AddItm_LctnAddr_Txt ********************************************************************************/
		if(claimresponseadditemlocationaddress.hasText()) {

			c.addClmRspsAddItmLctnAddrTxt(String.valueOf(claimresponseadditemlocationaddress.getText()));
		} else {
			c.addClmRspsAddItmLctnAddrTxt("NULL");
		}


		/******************** ClmRsps_AddItm_LctnRfrnc ********************************************************************************/
		if(claimresponseadditem.hasLocationReference()) {

			if(claimresponseadditem.getLocationReference().getReference() != null) {
			c.addClmRspsAddItmLctnRfrnc(claimresponseadditem.getLocationReference().getReference());
			}
		} else {
			c.addClmRspsAddItmLctnRfrnc("NULL");
		}


		 };
		/******************** claimresponsetotal ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ClaimResponse.TotalComponent> claimresponsetotallist = claimresponse.getTotal();
		for(int claimresponsetotali = 0; claimresponsetotali<claimresponsetotallist.size();claimresponsetotali++ ) {
		org.hl7.fhir.r4.model.ClaimResponse.TotalComponent  claimresponsetotal = claimresponsetotallist.get(claimresponsetotali);

		/******************** claimresponsetotalcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsetotalcategory = claimresponsetotal.getCategory();

		/******************** ClmRsps_Total_Ctgry_Txt ********************************************************************************/
		if(claimresponsetotali == 0) {c.addClmRspsTotalCtgryTxt("[");}
		if(claimresponsetotalcategory.hasText()) {

			c.addClmRspsTotalCtgryTxt(String.valueOf(claimresponsetotalcategory.getText()));
		} else {
			c.addClmRspsTotalCtgryTxt("NULL");
		}

		if(claimresponsetotali == claimresponsetotallist.size()-1) {c.addClmRspsTotalCtgryTxt("]");}


		/******************** claimresponsetotalcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponsetotalcategorycodinglist = claimresponsetotalcategory.getCoding();
		for(int claimresponsetotalcategorycodingi = 0; claimresponsetotalcategorycodingi<claimresponsetotalcategorycodinglist.size();claimresponsetotalcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponsetotalcategorycoding = claimresponsetotalcategorycodinglist.get(claimresponsetotalcategorycodingi);

		/******************** ClmRsps_Total_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimresponsetotalcategorycodingi == 0) {c.addClmRspsTotalCtgryCdgDsply("[[");}
		if(claimresponsetotalcategorycoding.hasDisplay()) {

			c.addClmRspsTotalCtgryCdgDsply(String.valueOf(claimresponsetotalcategorycoding.getDisplay()));
		} else {
			c.addClmRspsTotalCtgryCdgDsply("NULL");
		}

		if(claimresponsetotalcategorycodingi == claimresponsetotalcategorycodinglist.size()-1) {c.addClmRspsTotalCtgryCdgDsply("]]");}


		/******************** ClmRsps_Total_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimresponsetotalcategorycodingi == 0) {c.addClmRspsTotalCtgryCdgVrsn("[[");}
		if(claimresponsetotalcategorycoding.hasVersion()) {

			c.addClmRspsTotalCtgryCdgVrsn(String.valueOf(claimresponsetotalcategorycoding.getVersion()));
		} else {
			c.addClmRspsTotalCtgryCdgVrsn("NULL");
		}

		if(claimresponsetotalcategorycodingi == claimresponsetotalcategorycodinglist.size()-1) {c.addClmRspsTotalCtgryCdgVrsn("]]");}


		/******************** ClmRsps_Total_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimresponsetotalcategorycodingi == 0) {c.addClmRspsTotalCtgryCdgCd("[[");}
		if(claimresponsetotalcategorycoding.hasCode()) {

			c.addClmRspsTotalCtgryCdgCd(String.valueOf(claimresponsetotalcategorycoding.getCode()));
		} else {
			c.addClmRspsTotalCtgryCdgCd("NULL");
		}

		if(claimresponsetotalcategorycodingi == claimresponsetotalcategorycodinglist.size()-1) {c.addClmRspsTotalCtgryCdgCd("]]");}


		/******************** ClmRsps_Total_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimresponsetotalcategorycodingi == 0) {c.addClmRspsTotalCtgryCdgUsrSltd("[[");}
		if(claimresponsetotalcategorycoding.hasUserSelected()) {

			c.addClmRspsTotalCtgryCdgUsrSltd(String.valueOf(claimresponsetotalcategorycoding.getUserSelected()));
		} else {
			c.addClmRspsTotalCtgryCdgUsrSltd("NULL");
		}

		if(claimresponsetotalcategorycodingi == claimresponsetotalcategorycodinglist.size()-1) {c.addClmRspsTotalCtgryCdgUsrSltd("]]");}


		/******************** ClmRsps_Total_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimresponsetotalcategorycodingi == 0) {c.addClmRspsTotalCtgryCdgSys("[[");}
		if(claimresponsetotalcategorycoding.hasSystem()) {

			c.addClmRspsTotalCtgryCdgSys(String.valueOf(claimresponsetotalcategorycoding.getSystem()));
		} else {
			c.addClmRspsTotalCtgryCdgSys("NULL");
		}

		if(claimresponsetotalcategorycodingi == claimresponsetotalcategorycodinglist.size()-1) {c.addClmRspsTotalCtgryCdgSys("]]");}


		 };
		/******************** claimresponsetotalamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponsetotalamount = claimresponsetotal.getAmount();

		/******************** ClmRsps_Total_Amnt_Vl ********************************************************************************/
		if(claimresponsetotali == 0) {c.addClmRspsTotalAmntVl("[");}
		if(claimresponsetotalamount.hasValue()) {

			c.addClmRspsTotalAmntVl(String.valueOf(claimresponsetotalamount.getValue()));
		} else {
			c.addClmRspsTotalAmntVl("NULL");
		}

		if(claimresponsetotali == claimresponsetotallist.size()-1) {c.addClmRspsTotalAmntVl("]");}


		/******************** ClmRsps_Total_Amnt_Crncy ********************************************************************************/
		if(claimresponsetotali == 0) {c.addClmRspsTotalAmntCrncy("[");}
		if(claimresponsetotalamount.hasCurrency()) {

			c.addClmRspsTotalAmntCrncy(String.valueOf(claimresponsetotalamount.getCurrency()));
		} else {
			c.addClmRspsTotalAmntCrncy("NULL");
		}

		if(claimresponsetotali == claimresponsetotallist.size()-1) {c.addClmRspsTotalAmntCrncy("]");}


		 };
		/******************** claimresponseform ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment claimresponseform = claimresponse.getForm();

		/******************** ClmRsps_Frm_Sz ********************************************************************************/
		if(claimresponseform.hasSize()) {

			c.addClmRspsFrmSz(String.valueOf(claimresponseform.getSize()));
		} else {
			c.addClmRspsFrmSz("NULL");
		}


		/******************** ClmRsps_Frm_Lnguage ********************************************************************************/
		if(claimresponseform.hasLanguage()) {

			c.addClmRspsFrmLnguage(String.valueOf(claimresponseform.getLanguage()));
		} else {
			c.addClmRspsFrmLnguage("NULL");
		}


		/******************** ClmRsps_Frm_CntntTyp ********************************************************************************/
		if(claimresponseform.hasContentType()) {

			c.addClmRspsFrmCntntTyp(String.valueOf(claimresponseform.getContentType()));
		} else {
			c.addClmRspsFrmCntntTyp("NULL");
		}


		/******************** ClmRsps_Frm_Hash ********************************************************************************/
		if(claimresponseform.hasHash()) {

			c.addClmRspsFrmHash(new String(claimresponseform.getHash()));
		} else {
			c.addClmRspsFrmHash("NULL");
		}


		/******************** ClmRsps_Frm_Data ********************************************************************************/
		if(claimresponseform.hasData()) {

			c.addClmRspsFrmData(new String(claimresponseform.getData()));
		} else {
			c.addClmRspsFrmData("NULL");
		}


		/******************** ClmRsps_Frm_Creation ********************************************************************************/
		if(claimresponseform.hasCreation()) {

			c.addClmRspsFrmCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimresponseform.getCreation())+"\"");
		} else {
			c.addClmRspsFrmCreation("NULL");
		}


		/******************** ClmRsps_Frm_Ttl ********************************************************************************/
		if(claimresponseform.hasTitle()) {

			c.addClmRspsFrmTtl(String.valueOf(claimresponseform.getTitle()));
		} else {
			c.addClmRspsFrmTtl("NULL");
		}


		/******************** ClmRsps_Frm_Url ********************************************************************************/
		if(claimresponseform.hasUrl()) {

			c.addClmRspsFrmUrl(String.valueOf(claimresponseform.getUrl()));
		} else {
			c.addClmRspsFrmUrl("NULL");
		}


		/******************** claimresponseinsurance ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ClaimResponse.InsuranceComponent> claimresponseinsurancelist = claimresponse.getInsurance();
		for(int claimresponseinsurancei = 0; claimresponseinsurancei<claimresponseinsurancelist.size();claimresponseinsurancei++ ) {
		org.hl7.fhir.r4.model.ClaimResponse.InsuranceComponent  claimresponseinsurance = claimresponseinsurancelist.get(claimresponseinsurancei);

		/******************** ClmRsps_Insrnc_Focal ********************************************************************************/
		if(claimresponseinsurancei == 0) {c.addClmRspsInsrncFocal("[");}
		if(claimresponseinsurance.hasFocal()) {

			c.addClmRspsInsrncFocal(String.valueOf(claimresponseinsurance.getFocal()));
		} else {
			c.addClmRspsInsrncFocal("NULL");
		}

		if(claimresponseinsurancei == claimresponseinsurancelist.size()-1) {c.addClmRspsInsrncFocal("]");}


		/******************** ClmRsps_Insrnc_Sqnc ********************************************************************************/
		if(claimresponseinsurancei == 0) {c.addClmRspsInsrncSqnc("[");}
		if(claimresponseinsurance.hasSequence()) {

			c.addClmRspsInsrncSqnc(String.valueOf(claimresponseinsurance.getSequence()));
		} else {
			c.addClmRspsInsrncSqnc("NULL");
		}

		if(claimresponseinsurancei == claimresponseinsurancelist.size()-1) {c.addClmRspsInsrncSqnc("]");}


		/******************** ClmRsps_Insrnc_ClmRsps ********************************************************************************/
		if(claimresponseinsurancei == 0) {c.addClmRspsInsrncClmRsps("[");}
		if(claimresponseinsurance.hasClaimResponse()) {

			if(claimresponseinsurance.getClaimResponse().getReference() != null) {
			c.addClmRspsInsrncClmRsps(claimresponseinsurance.getClaimResponse().getReference());
			}
		} else {
			c.addClmRspsInsrncClmRsps("NULL");
		}

		if(claimresponseinsurancei == claimresponseinsurancelist.size()-1) {c.addClmRspsInsrncClmRsps("]");}


		/******************** ClmRsps_Insrnc_Cvg ********************************************************************************/
		if(claimresponseinsurancei == 0) {c.addClmRspsInsrncCvg("[");}
		if(claimresponseinsurance.hasCoverage()) {

			if(claimresponseinsurance.getCoverage().getReference() != null) {
			c.addClmRspsInsrncCvg(claimresponseinsurance.getCoverage().getReference());
			}
		} else {
			c.addClmRspsInsrncCvg("NULL");
		}

		if(claimresponseinsurancei == claimresponseinsurancelist.size()-1) {c.addClmRspsInsrncCvg("]");}


		/******************** ClmRsps_Insrnc_BusinessArrangement ********************************************************************************/
		if(claimresponseinsurancei == 0) {c.addClmRspsInsrncBusinessArrangement("[");}
		if(claimresponseinsurance.hasBusinessArrangement()) {

			c.addClmRspsInsrncBusinessArrangement(String.valueOf(claimresponseinsurance.getBusinessArrangement()));
		} else {
			c.addClmRspsInsrncBusinessArrangement("NULL");
		}

		if(claimresponseinsurancei == claimresponseinsurancelist.size()-1) {c.addClmRspsInsrncBusinessArrangement("]");}


		 };
		/******************** claimresponsepayment ********************************************************************************/
		org.hl7.fhir.r4.model.ClaimResponse.PaymentComponent claimresponsepayment = claimresponse.getPayment();

		/******************** claimresponsepaymenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsepaymenttype = claimresponsepayment.getType();

		/******************** ClmRsps_Pymnt_Typ_Txt ********************************************************************************/
		if(claimresponsepaymenttype.hasText()) {

			c.addClmRspsPymntTypTxt(String.valueOf(claimresponsepaymenttype.getText()));
		} else {
			c.addClmRspsPymntTypTxt("NULL");
		}


		/******************** claimresponsepaymenttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponsepaymenttypecodinglist = claimresponsepaymenttype.getCoding();
		for(int claimresponsepaymenttypecodingi = 0; claimresponsepaymenttypecodingi<claimresponsepaymenttypecodinglist.size();claimresponsepaymenttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponsepaymenttypecoding = claimresponsepaymenttypecodinglist.get(claimresponsepaymenttypecodingi);

		/******************** ClmRsps_Pymnt_Typ_Cdg_Dsply ********************************************************************************/
		if(claimresponsepaymenttypecodingi == 0) {c.addClmRspsPymntTypCdgDsply("[");}
		if(claimresponsepaymenttypecoding.hasDisplay()) {

			c.addClmRspsPymntTypCdgDsply(String.valueOf(claimresponsepaymenttypecoding.getDisplay()));
		} else {
			c.addClmRspsPymntTypCdgDsply("NULL");
		}

		if(claimresponsepaymenttypecodingi == claimresponsepaymenttypecodinglist.size()-1) {c.addClmRspsPymntTypCdgDsply("]");}


		/******************** ClmRsps_Pymnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimresponsepaymenttypecodingi == 0) {c.addClmRspsPymntTypCdgVrsn("[");}
		if(claimresponsepaymenttypecoding.hasVersion()) {

			c.addClmRspsPymntTypCdgVrsn(String.valueOf(claimresponsepaymenttypecoding.getVersion()));
		} else {
			c.addClmRspsPymntTypCdgVrsn("NULL");
		}

		if(claimresponsepaymenttypecodingi == claimresponsepaymenttypecodinglist.size()-1) {c.addClmRspsPymntTypCdgVrsn("]");}


		/******************** ClmRsps_Pymnt_Typ_Cdg_Cd ********************************************************************************/
		if(claimresponsepaymenttypecodingi == 0) {c.addClmRspsPymntTypCdgCd("[");}
		if(claimresponsepaymenttypecoding.hasCode()) {

			c.addClmRspsPymntTypCdgCd(String.valueOf(claimresponsepaymenttypecoding.getCode()));
		} else {
			c.addClmRspsPymntTypCdgCd("NULL");
		}

		if(claimresponsepaymenttypecodingi == claimresponsepaymenttypecodinglist.size()-1) {c.addClmRspsPymntTypCdgCd("]");}


		/******************** ClmRsps_Pymnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimresponsepaymenttypecodingi == 0) {c.addClmRspsPymntTypCdgUsrSltd("[");}
		if(claimresponsepaymenttypecoding.hasUserSelected()) {

			c.addClmRspsPymntTypCdgUsrSltd(String.valueOf(claimresponsepaymenttypecoding.getUserSelected()));
		} else {
			c.addClmRspsPymntTypCdgUsrSltd("NULL");
		}

		if(claimresponsepaymenttypecodingi == claimresponsepaymenttypecodinglist.size()-1) {c.addClmRspsPymntTypCdgUsrSltd("]");}


		/******************** ClmRsps_Pymnt_Typ_Cdg_Sys ********************************************************************************/
		if(claimresponsepaymenttypecodingi == 0) {c.addClmRspsPymntTypCdgSys("[");}
		if(claimresponsepaymenttypecoding.hasSystem()) {

			c.addClmRspsPymntTypCdgSys(String.valueOf(claimresponsepaymenttypecoding.getSystem()));
		} else {
			c.addClmRspsPymntTypCdgSys("NULL");
		}

		if(claimresponsepaymenttypecodingi == claimresponsepaymenttypecodinglist.size()-1) {c.addClmRspsPymntTypCdgSys("]");}


		 };
		/******************** ClmRsps_Pymnt_Dt ********************************************************************************/
		if(claimresponsepayment.hasDate()) {

			c.addClmRspsPymntDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimresponsepayment.getDate())+"\"");
		} else {
			c.addClmRspsPymntDt("NULL");
		}


		/******************** claimresponsepaymentidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier claimresponsepaymentidentifier = claimresponsepayment.getIdentifier();

		/******************** ClmRsps_Pymnt_Id_Vl ********************************************************************************/
		if(claimresponsepaymentidentifier.hasValue()) {

			c.addClmRspsPymntIdVl(String.valueOf(claimresponsepaymentidentifier.getValue()));
		} else {
			c.addClmRspsPymntIdVl("NULL");
		}


		/******************** claimresponsepaymentidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsepaymentidentifiertype = claimresponsepaymentidentifier.getType();

		/******************** ClmRsps_Pymnt_Id_Typ_Txt ********************************************************************************/
		if(claimresponsepaymentidentifiertype.hasText()) {

			c.addClmRspsPymntIdTypTxt(String.valueOf(claimresponsepaymentidentifiertype.getText()));
		} else {
			c.addClmRspsPymntIdTypTxt("NULL");
		}


		/******************** claimresponsepaymentidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponsepaymentidentifiertypecodinglist = claimresponsepaymentidentifiertype.getCoding();
		for(int claimresponsepaymentidentifiertypecodingi = 0; claimresponsepaymentidentifiertypecodingi<claimresponsepaymentidentifiertypecodinglist.size();claimresponsepaymentidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponsepaymentidentifiertypecoding = claimresponsepaymentidentifiertypecodinglist.get(claimresponsepaymentidentifiertypecodingi);

		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(claimresponsepaymentidentifiertypecodingi == 0) {c.addClmRspsPymntIdTypCdgDsply("[");}
		if(claimresponsepaymentidentifiertypecoding.hasDisplay()) {

			c.addClmRspsPymntIdTypCdgDsply(String.valueOf(claimresponsepaymentidentifiertypecoding.getDisplay()));
		} else {
			c.addClmRspsPymntIdTypCdgDsply("NULL");
		}

		if(claimresponsepaymentidentifiertypecodingi == claimresponsepaymentidentifiertypecodinglist.size()-1) {c.addClmRspsPymntIdTypCdgDsply("]");}


		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimresponsepaymentidentifiertypecodingi == 0) {c.addClmRspsPymntIdTypCdgVrsn("[");}
		if(claimresponsepaymentidentifiertypecoding.hasVersion()) {

			c.addClmRspsPymntIdTypCdgVrsn(String.valueOf(claimresponsepaymentidentifiertypecoding.getVersion()));
		} else {
			c.addClmRspsPymntIdTypCdgVrsn("NULL");
		}

		if(claimresponsepaymentidentifiertypecodingi == claimresponsepaymentidentifiertypecodinglist.size()-1) {c.addClmRspsPymntIdTypCdgVrsn("]");}


		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(claimresponsepaymentidentifiertypecodingi == 0) {c.addClmRspsPymntIdTypCdgCd("[");}
		if(claimresponsepaymentidentifiertypecoding.hasCode()) {

			c.addClmRspsPymntIdTypCdgCd(String.valueOf(claimresponsepaymentidentifiertypecoding.getCode()));
		} else {
			c.addClmRspsPymntIdTypCdgCd("NULL");
		}

		if(claimresponsepaymentidentifiertypecodingi == claimresponsepaymentidentifiertypecodinglist.size()-1) {c.addClmRspsPymntIdTypCdgCd("]");}


		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimresponsepaymentidentifiertypecodingi == 0) {c.addClmRspsPymntIdTypCdgUsrSltd("[");}
		if(claimresponsepaymentidentifiertypecoding.hasUserSelected()) {

			c.addClmRspsPymntIdTypCdgUsrSltd(String.valueOf(claimresponsepaymentidentifiertypecoding.getUserSelected()));
		} else {
			c.addClmRspsPymntIdTypCdgUsrSltd("NULL");
		}

		if(claimresponsepaymentidentifiertypecodingi == claimresponsepaymentidentifiertypecodinglist.size()-1) {c.addClmRspsPymntIdTypCdgUsrSltd("]");}


		/******************** ClmRsps_Pymnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(claimresponsepaymentidentifiertypecodingi == 0) {c.addClmRspsPymntIdTypCdgSys("[");}
		if(claimresponsepaymentidentifiertypecoding.hasSystem()) {

			c.addClmRspsPymntIdTypCdgSys(String.valueOf(claimresponsepaymentidentifiertypecoding.getSystem()));
		} else {
			c.addClmRspsPymntIdTypCdgSys("NULL");
		}

		if(claimresponsepaymentidentifiertypecodingi == claimresponsepaymentidentifiertypecodinglist.size()-1) {c.addClmRspsPymntIdTypCdgSys("]");}


		 };
		/******************** claimresponsepaymentidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimresponsepaymentidentifierperiod = claimresponsepaymentidentifier.getPeriod();

		/******************** ClmRsps_Pymnt_Id_Prd_Strt ********************************************************************************/
		if(claimresponsepaymentidentifierperiod.hasStart()) {

			c.addClmRspsPymntIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimresponsepaymentidentifierperiod.getStart())+"\"");
		} else {
			c.addClmRspsPymntIdPrdStrt("NULL");
		}


		/******************** ClmRsps_Pymnt_Id_Prd_End ********************************************************************************/
		if(claimresponsepaymentidentifierperiod.hasEnd()) {

			c.addClmRspsPymntIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimresponsepaymentidentifierperiod.getEnd())+"\"");
		} else {
			c.addClmRspsPymntIdPrdEnd("NULL");
		}


		/******************** claimresponsepaymentidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse claimresponsepaymentidentifieruse = claimresponsepaymentidentifier.getUse();
		if(claimresponsepaymentidentifieruse!=null) {
			c.addClmRspsPymntIdUse(claimresponsepaymentidentifieruse.toCode());
		} else {
			c.addClmRspsPymntIdUse("NULL");
		}

		/******************** ClmRsps_Pymnt_Id_Assigner ********************************************************************************/
		if(claimresponsepaymentidentifier.hasAssigner()) {

			if(claimresponsepaymentidentifier.getAssigner().getReference() != null) {
			c.addClmRspsPymntIdAssigner(claimresponsepaymentidentifier.getAssigner().getReference());
			}
		} else {
			c.addClmRspsPymntIdAssigner("NULL");
		}


		/******************** ClmRsps_Pymnt_Id_Sys ********************************************************************************/
		if(claimresponsepaymentidentifier.hasSystem()) {

			c.addClmRspsPymntIdSys(String.valueOf(claimresponsepaymentidentifier.getSystem()));
		} else {
			c.addClmRspsPymntIdSys("NULL");
		}


		/******************** claimresponsepaymentadjustmentreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsepaymentadjustmentreason = claimresponsepayment.getAdjustmentReason();

		/******************** ClmRsps_Pymnt_AdjustmentRsn_Txt ********************************************************************************/
		if(claimresponsepaymentadjustmentreason.hasText()) {

			c.addClmRspsPymntAdjustmentRsnTxt(String.valueOf(claimresponsepaymentadjustmentreason.getText()));
		} else {
			c.addClmRspsPymntAdjustmentRsnTxt("NULL");
		}


		/******************** claimresponsepaymentadjustmentreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponsepaymentadjustmentreasoncodinglist = claimresponsepaymentadjustmentreason.getCoding();
		for(int claimresponsepaymentadjustmentreasoncodingi = 0; claimresponsepaymentadjustmentreasoncodingi<claimresponsepaymentadjustmentreasoncodinglist.size();claimresponsepaymentadjustmentreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponsepaymentadjustmentreasoncoding = claimresponsepaymentadjustmentreasoncodinglist.get(claimresponsepaymentadjustmentreasoncodingi);

		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_Dsply ********************************************************************************/
		if(claimresponsepaymentadjustmentreasoncodingi == 0) {c.addClmRspsPymntAdjustmentRsnCdgDsply("[");}
		if(claimresponsepaymentadjustmentreasoncoding.hasDisplay()) {

			c.addClmRspsPymntAdjustmentRsnCdgDsply(String.valueOf(claimresponsepaymentadjustmentreasoncoding.getDisplay()));
		} else {
			c.addClmRspsPymntAdjustmentRsnCdgDsply("NULL");
		}

		if(claimresponsepaymentadjustmentreasoncodingi == claimresponsepaymentadjustmentreasoncodinglist.size()-1) {c.addClmRspsPymntAdjustmentRsnCdgDsply("]");}


		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_Vrsn ********************************************************************************/
		if(claimresponsepaymentadjustmentreasoncodingi == 0) {c.addClmRspsPymntAdjustmentRsnCdgVrsn("[");}
		if(claimresponsepaymentadjustmentreasoncoding.hasVersion()) {

			c.addClmRspsPymntAdjustmentRsnCdgVrsn(String.valueOf(claimresponsepaymentadjustmentreasoncoding.getVersion()));
		} else {
			c.addClmRspsPymntAdjustmentRsnCdgVrsn("NULL");
		}

		if(claimresponsepaymentadjustmentreasoncodingi == claimresponsepaymentadjustmentreasoncodinglist.size()-1) {c.addClmRspsPymntAdjustmentRsnCdgVrsn("]");}


		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_Cd ********************************************************************************/
		if(claimresponsepaymentadjustmentreasoncodingi == 0) {c.addClmRspsPymntAdjustmentRsnCdgCd("[");}
		if(claimresponsepaymentadjustmentreasoncoding.hasCode()) {

			c.addClmRspsPymntAdjustmentRsnCdgCd(String.valueOf(claimresponsepaymentadjustmentreasoncoding.getCode()));
		} else {
			c.addClmRspsPymntAdjustmentRsnCdgCd("NULL");
		}

		if(claimresponsepaymentadjustmentreasoncodingi == claimresponsepaymentadjustmentreasoncodinglist.size()-1) {c.addClmRspsPymntAdjustmentRsnCdgCd("]");}


		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_UsrSltd ********************************************************************************/
		if(claimresponsepaymentadjustmentreasoncodingi == 0) {c.addClmRspsPymntAdjustmentRsnCdgUsrSltd("[");}
		if(claimresponsepaymentadjustmentreasoncoding.hasUserSelected()) {

			c.addClmRspsPymntAdjustmentRsnCdgUsrSltd(String.valueOf(claimresponsepaymentadjustmentreasoncoding.getUserSelected()));
		} else {
			c.addClmRspsPymntAdjustmentRsnCdgUsrSltd("NULL");
		}

		if(claimresponsepaymentadjustmentreasoncodingi == claimresponsepaymentadjustmentreasoncodinglist.size()-1) {c.addClmRspsPymntAdjustmentRsnCdgUsrSltd("]");}


		/******************** ClmRsps_Pymnt_AdjustmentRsn_Cdg_Sys ********************************************************************************/
		if(claimresponsepaymentadjustmentreasoncodingi == 0) {c.addClmRspsPymntAdjustmentRsnCdgSys("[");}
		if(claimresponsepaymentadjustmentreasoncoding.hasSystem()) {

			c.addClmRspsPymntAdjustmentRsnCdgSys(String.valueOf(claimresponsepaymentadjustmentreasoncoding.getSystem()));
		} else {
			c.addClmRspsPymntAdjustmentRsnCdgSys("NULL");
		}

		if(claimresponsepaymentadjustmentreasoncodingi == claimresponsepaymentadjustmentreasoncodinglist.size()-1) {c.addClmRspsPymntAdjustmentRsnCdgSys("]");}


		 };
		/******************** claimresponsepaymentamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponsepaymentamount = claimresponsepayment.getAmount();

		/******************** ClmRsps_Pymnt_Amnt_Vl ********************************************************************************/
		if(claimresponsepaymentamount.hasValue()) {

			c.addClmRspsPymntAmntVl(String.valueOf(claimresponsepaymentamount.getValue()));
		} else {
			c.addClmRspsPymntAmntVl("NULL");
		}


		/******************** ClmRsps_Pymnt_Amnt_Crncy ********************************************************************************/
		if(claimresponsepaymentamount.hasCurrency()) {

			c.addClmRspsPymntAmntCrncy(String.valueOf(claimresponsepaymentamount.getCurrency()));
		} else {
			c.addClmRspsPymntAmntCrncy("NULL");
		}


		/******************** claimresponsepaymentadjustment ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimresponsepaymentadjustment = claimresponsepayment.getAdjustment();

		/******************** ClmRsps_Pymnt_Adjustment_Vl ********************************************************************************/
		if(claimresponsepaymentadjustment.hasValue()) {

			c.addClmRspsPymntAdjustmentVl(String.valueOf(claimresponsepaymentadjustment.getValue()));
		} else {
			c.addClmRspsPymntAdjustmentVl("NULL");
		}


		/******************** ClmRsps_Pymnt_Adjustment_Crncy ********************************************************************************/
		if(claimresponsepaymentadjustment.hasCurrency()) {

			c.addClmRspsPymntAdjustmentCrncy(String.valueOf(claimresponsepaymentadjustment.getCurrency()));
		} else {
			c.addClmRspsPymntAdjustmentCrncy("NULL");
		}


		/******************** ClmRsps_Pnt ********************************************************************************/
		if(claimresponse.hasPatient()) {

			if(claimresponse.getPatient().getReference() != null) {
			c.addClmRspsPnt(claimresponse.getPatient().getReference());
			}
		} else {
			c.addClmRspsPnt("NULL");
		}


		/******************** ClmRsps_Insurer ********************************************************************************/
		if(claimresponse.hasInsurer()) {

			if(claimresponse.getInsurer().getReference() != null) {
			c.addClmRspsInsurer(claimresponse.getInsurer().getReference());
			}
		} else {
			c.addClmRspsInsurer("NULL");
		}


		/******************** claimresponsesubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponsesubtype = claimresponse.getSubType();

		/******************** ClmRsps_SubTyp_Txt ********************************************************************************/
		if(claimresponsesubtype.hasText()) {

			c.addClmRspsSubTypTxt(String.valueOf(claimresponsesubtype.getText()));
		} else {
			c.addClmRspsSubTypTxt("NULL");
		}


		/******************** claimresponsesubtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponsesubtypecodinglist = claimresponsesubtype.getCoding();
		for(int claimresponsesubtypecodingi = 0; claimresponsesubtypecodingi<claimresponsesubtypecodinglist.size();claimresponsesubtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponsesubtypecoding = claimresponsesubtypecodinglist.get(claimresponsesubtypecodingi);

		/******************** ClmRsps_SubTyp_Cdg_Dsply ********************************************************************************/
		if(claimresponsesubtypecodingi == 0) {c.addClmRspsSubTypCdgDsply("[");}
		if(claimresponsesubtypecoding.hasDisplay()) {

			c.addClmRspsSubTypCdgDsply(String.valueOf(claimresponsesubtypecoding.getDisplay()));
		} else {
			c.addClmRspsSubTypCdgDsply("NULL");
		}

		if(claimresponsesubtypecodingi == claimresponsesubtypecodinglist.size()-1) {c.addClmRspsSubTypCdgDsply("]");}


		/******************** ClmRsps_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(claimresponsesubtypecodingi == 0) {c.addClmRspsSubTypCdgVrsn("[");}
		if(claimresponsesubtypecoding.hasVersion()) {

			c.addClmRspsSubTypCdgVrsn(String.valueOf(claimresponsesubtypecoding.getVersion()));
		} else {
			c.addClmRspsSubTypCdgVrsn("NULL");
		}

		if(claimresponsesubtypecodingi == claimresponsesubtypecodinglist.size()-1) {c.addClmRspsSubTypCdgVrsn("]");}


		/******************** ClmRsps_SubTyp_Cdg_Cd ********************************************************************************/
		if(claimresponsesubtypecodingi == 0) {c.addClmRspsSubTypCdgCd("[");}
		if(claimresponsesubtypecoding.hasCode()) {

			c.addClmRspsSubTypCdgCd(String.valueOf(claimresponsesubtypecoding.getCode()));
		} else {
			c.addClmRspsSubTypCdgCd("NULL");
		}

		if(claimresponsesubtypecodingi == claimresponsesubtypecodinglist.size()-1) {c.addClmRspsSubTypCdgCd("]");}


		/******************** ClmRsps_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(claimresponsesubtypecodingi == 0) {c.addClmRspsSubTypCdgUsrSltd("[");}
		if(claimresponsesubtypecoding.hasUserSelected()) {

			c.addClmRspsSubTypCdgUsrSltd(String.valueOf(claimresponsesubtypecoding.getUserSelected()));
		} else {
			c.addClmRspsSubTypCdgUsrSltd("NULL");
		}

		if(claimresponsesubtypecodingi == claimresponsesubtypecodinglist.size()-1) {c.addClmRspsSubTypCdgUsrSltd("]");}


		/******************** ClmRsps_SubTyp_Cdg_Sys ********************************************************************************/
		if(claimresponsesubtypecodingi == 0) {c.addClmRspsSubTypCdgSys("[");}
		if(claimresponsesubtypecoding.hasSystem()) {

			c.addClmRspsSubTypCdgSys(String.valueOf(claimresponsesubtypecoding.getSystem()));
		} else {
			c.addClmRspsSubTypCdgSys("NULL");
		}

		if(claimresponsesubtypecodingi == claimresponsesubtypecodinglist.size()-1) {c.addClmRspsSubTypCdgSys("]");}


		 };
		/******************** ClmRsps_CmmnctnRqst ********************************************************************************/
		if(claimresponse.hasCommunicationRequest()) {

			String  array = "[";
			for(int incr=0; incr<claimresponse.getCommunicationRequest().size(); incr++) {
				array = array + claimresponse.getCommunicationRequest().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmRspsCmmnctnRqst(array);

		} else {
			c.addClmRspsCmmnctnRqst("NULL");
		}


		/******************** claimresponseerror ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ClaimResponse.ErrorComponent> claimresponseerrorlist = claimresponse.getError();
		for(int claimresponseerrori = 0; claimresponseerrori<claimresponseerrorlist.size();claimresponseerrori++ ) {
		org.hl7.fhir.r4.model.ClaimResponse.ErrorComponent  claimresponseerror = claimresponseerrorlist.get(claimresponseerrori);

		/******************** claimresponseerrorcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimresponseerrorcode = claimresponseerror.getCode();

		/******************** ClmRsps_Error_Cd_Txt ********************************************************************************/
		if(claimresponseerrori == 0) {c.addClmRspsErrorCdTxt("[");}
		if(claimresponseerrorcode.hasText()) {

			c.addClmRspsErrorCdTxt(String.valueOf(claimresponseerrorcode.getText()));
		} else {
			c.addClmRspsErrorCdTxt("NULL");
		}

		if(claimresponseerrori == claimresponseerrorlist.size()-1) {c.addClmRspsErrorCdTxt("]");}


		/******************** claimresponseerrorcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimresponseerrorcodecodinglist = claimresponseerrorcode.getCoding();
		for(int claimresponseerrorcodecodingi = 0; claimresponseerrorcodecodingi<claimresponseerrorcodecodinglist.size();claimresponseerrorcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimresponseerrorcodecoding = claimresponseerrorcodecodinglist.get(claimresponseerrorcodecodingi);

		/******************** ClmRsps_Error_Cd_Cdg_Dsply ********************************************************************************/
		if(claimresponseerrorcodecodingi == 0) {c.addClmRspsErrorCdCdgDsply("[[");}
		if(claimresponseerrorcodecoding.hasDisplay()) {

			c.addClmRspsErrorCdCdgDsply(String.valueOf(claimresponseerrorcodecoding.getDisplay()));
		} else {
			c.addClmRspsErrorCdCdgDsply("NULL");
		}

		if(claimresponseerrorcodecodingi == claimresponseerrorcodecodinglist.size()-1) {c.addClmRspsErrorCdCdgDsply("]]");}


		/******************** ClmRsps_Error_Cd_Cdg_Vrsn ********************************************************************************/
		if(claimresponseerrorcodecodingi == 0) {c.addClmRspsErrorCdCdgVrsn("[[");}
		if(claimresponseerrorcodecoding.hasVersion()) {

			c.addClmRspsErrorCdCdgVrsn(String.valueOf(claimresponseerrorcodecoding.getVersion()));
		} else {
			c.addClmRspsErrorCdCdgVrsn("NULL");
		}

		if(claimresponseerrorcodecodingi == claimresponseerrorcodecodinglist.size()-1) {c.addClmRspsErrorCdCdgVrsn("]]");}


		/******************** ClmRsps_Error_Cd_Cdg_Cd ********************************************************************************/
		if(claimresponseerrorcodecodingi == 0) {c.addClmRspsErrorCdCdgCd("[[");}
		if(claimresponseerrorcodecoding.hasCode()) {

			c.addClmRspsErrorCdCdgCd(String.valueOf(claimresponseerrorcodecoding.getCode()));
		} else {
			c.addClmRspsErrorCdCdgCd("NULL");
		}

		if(claimresponseerrorcodecodingi == claimresponseerrorcodecodinglist.size()-1) {c.addClmRspsErrorCdCdgCd("]]");}


		/******************** ClmRsps_Error_Cd_Cdg_UsrSltd ********************************************************************************/
		if(claimresponseerrorcodecodingi == 0) {c.addClmRspsErrorCdCdgUsrSltd("[[");}
		if(claimresponseerrorcodecoding.hasUserSelected()) {

			c.addClmRspsErrorCdCdgUsrSltd(String.valueOf(claimresponseerrorcodecoding.getUserSelected()));
		} else {
			c.addClmRspsErrorCdCdgUsrSltd("NULL");
		}

		if(claimresponseerrorcodecodingi == claimresponseerrorcodecodinglist.size()-1) {c.addClmRspsErrorCdCdgUsrSltd("]]");}


		/******************** ClmRsps_Error_Cd_Cdg_Sys ********************************************************************************/
		if(claimresponseerrorcodecodingi == 0) {c.addClmRspsErrorCdCdgSys("[[");}
		if(claimresponseerrorcodecoding.hasSystem()) {

			c.addClmRspsErrorCdCdgSys(String.valueOf(claimresponseerrorcodecoding.getSystem()));
		} else {
			c.addClmRspsErrorCdCdgSys("NULL");
		}

		if(claimresponseerrorcodecodingi == claimresponseerrorcodecodinglist.size()-1) {c.addClmRspsErrorCdCdgSys("]]");}


		 };
		/******************** ClmRsps_Error_SubDtlSqnc ********************************************************************************/
		if(claimresponseerrori == 0) {c.addClmRspsErrorSubDtlSqnc("[");}
		if(claimresponseerror.hasSubDetailSequence()) {

			c.addClmRspsErrorSubDtlSqnc(String.valueOf(claimresponseerror.getSubDetailSequence()));
		} else {
			c.addClmRspsErrorSubDtlSqnc("NULL");
		}

		if(claimresponseerrori == claimresponseerrorlist.size()-1) {c.addClmRspsErrorSubDtlSqnc("]");}


		/******************** ClmRsps_Error_ItmSqnc ********************************************************************************/
		if(claimresponseerrori == 0) {c.addClmRspsErrorItmSqnc("[");}
		if(claimresponseerror.hasItemSequence()) {

			c.addClmRspsErrorItmSqnc(String.valueOf(claimresponseerror.getItemSequence()));
		} else {
			c.addClmRspsErrorItmSqnc("NULL");
		}

		if(claimresponseerrori == claimresponseerrorlist.size()-1) {c.addClmRspsErrorItmSqnc("]");}


		/******************** ClmRsps_Error_DtlSqnc ********************************************************************************/
		if(claimresponseerrori == 0) {c.addClmRspsErrorDtlSqnc("[");}
		if(claimresponseerror.hasDetailSequence()) {

			c.addClmRspsErrorDtlSqnc(String.valueOf(claimresponseerror.getDetailSequence()));
		} else {
			c.addClmRspsErrorDtlSqnc("NULL");
		}

		if(claimresponseerrori == claimresponseerrorlist.size()-1) {c.addClmRspsErrorDtlSqnc("]");}


		 };
		return c;
	}
}
