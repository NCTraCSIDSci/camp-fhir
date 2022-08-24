package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Claim;
public class ClaimBidirectionalConversion 
{
	public Claim Claims(org.hl7.fhir.r4.model.Claim claim) throws ParseException
	{
		 main.java.com.campfhir.model.Claim c = new  main.java.com.campfhir.model.Claim();

		/******************** id ********************************************************************************/
		c.setId(claim.getIdElement().getIdPart());

		/******************** claimpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimpriority = claim.getPriority();

		/******************** Clm_Priority_Txt ********************************************************************************/
		if(claimpriority.hasText()) {

			c.addClmPriorityTxt(String.valueOf(claimpriority.getText()));
		} else {
			c.addClmPriorityTxt("NULL");
		}


		/******************** claimprioritycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimprioritycodinglist = claimpriority.getCoding();
		for(int claimprioritycodingi = 0; claimprioritycodingi<claimprioritycodinglist.size();claimprioritycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimprioritycoding = claimprioritycodinglist.get(claimprioritycodingi);

		/******************** Clm_Priority_Cdg_Dsply ********************************************************************************/
		if(claimprioritycodingi == 0) {c.addClmPriorityCdgDsply("[");}
		if(claimprioritycoding.hasDisplay()) {

			c.addClmPriorityCdgDsply(String.valueOf(claimprioritycoding.getDisplay()));
		} else {
			c.addClmPriorityCdgDsply("NULL");
		}

		if(claimprioritycodingi == claimprioritycodinglist.size()-1) {c.addClmPriorityCdgDsply("]");}


		/******************** Clm_Priority_Cdg_Vrsn ********************************************************************************/
		if(claimprioritycodingi == 0) {c.addClmPriorityCdgVrsn("[");}
		if(claimprioritycoding.hasVersion()) {

			c.addClmPriorityCdgVrsn(String.valueOf(claimprioritycoding.getVersion()));
		} else {
			c.addClmPriorityCdgVrsn("NULL");
		}

		if(claimprioritycodingi == claimprioritycodinglist.size()-1) {c.addClmPriorityCdgVrsn("]");}


		/******************** Clm_Priority_Cdg_Cd ********************************************************************************/
		if(claimprioritycodingi == 0) {c.addClmPriorityCdgCd("[");}
		if(claimprioritycoding.hasCode()) {

			c.addClmPriorityCdgCd(String.valueOf(claimprioritycoding.getCode()));
		} else {
			c.addClmPriorityCdgCd("NULL");
		}

		if(claimprioritycodingi == claimprioritycodinglist.size()-1) {c.addClmPriorityCdgCd("]");}


		/******************** Clm_Priority_Cdg_UsrSltd ********************************************************************************/
		if(claimprioritycodingi == 0) {c.addClmPriorityCdgUsrSltd("[");}
		if(claimprioritycoding.hasUserSelected()) {

			c.addClmPriorityCdgUsrSltd(String.valueOf(claimprioritycoding.getUserSelected()));
		} else {
			c.addClmPriorityCdgUsrSltd("NULL");
		}

		if(claimprioritycodingi == claimprioritycodinglist.size()-1) {c.addClmPriorityCdgUsrSltd("]");}


		/******************** Clm_Priority_Cdg_Sys ********************************************************************************/
		if(claimprioritycodingi == 0) {c.addClmPriorityCdgSys("[");}
		if(claimprioritycoding.hasSystem()) {

			c.addClmPriorityCdgSys(String.valueOf(claimprioritycoding.getSystem()));
		} else {
			c.addClmPriorityCdgSys("NULL");
		}

		if(claimprioritycodingi == claimprioritycodinglist.size()-1) {c.addClmPriorityCdgSys("]");}


		 };
		/******************** claimtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimtype = claim.getType();

		/******************** Clm_Typ_Txt ********************************************************************************/
		if(claimtype.hasText()) {

			c.addClmTypTxt(String.valueOf(claimtype.getText()));
		} else {
			c.addClmTypTxt("NULL");
		}


		/******************** claimtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimtypecodinglist = claimtype.getCoding();
		for(int claimtypecodingi = 0; claimtypecodingi<claimtypecodinglist.size();claimtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimtypecoding = claimtypecodinglist.get(claimtypecodingi);

		/******************** Clm_Typ_Cdg_Dsply ********************************************************************************/
		if(claimtypecodingi == 0) {c.addClmTypCdgDsply("[");}
		if(claimtypecoding.hasDisplay()) {

			c.addClmTypCdgDsply(String.valueOf(claimtypecoding.getDisplay()));
		} else {
			c.addClmTypCdgDsply("NULL");
		}

		if(claimtypecodingi == claimtypecodinglist.size()-1) {c.addClmTypCdgDsply("]");}


		/******************** Clm_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimtypecodingi == 0) {c.addClmTypCdgVrsn("[");}
		if(claimtypecoding.hasVersion()) {

			c.addClmTypCdgVrsn(String.valueOf(claimtypecoding.getVersion()));
		} else {
			c.addClmTypCdgVrsn("NULL");
		}

		if(claimtypecodingi == claimtypecodinglist.size()-1) {c.addClmTypCdgVrsn("]");}


		/******************** Clm_Typ_Cdg_Cd ********************************************************************************/
		if(claimtypecodingi == 0) {c.addClmTypCdgCd("[");}
		if(claimtypecoding.hasCode()) {

			c.addClmTypCdgCd(String.valueOf(claimtypecoding.getCode()));
		} else {
			c.addClmTypCdgCd("NULL");
		}

		if(claimtypecodingi == claimtypecodinglist.size()-1) {c.addClmTypCdgCd("]");}


		/******************** Clm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimtypecodingi == 0) {c.addClmTypCdgUsrSltd("[");}
		if(claimtypecoding.hasUserSelected()) {

			c.addClmTypCdgUsrSltd(String.valueOf(claimtypecoding.getUserSelected()));
		} else {
			c.addClmTypCdgUsrSltd("NULL");
		}

		if(claimtypecodingi == claimtypecodinglist.size()-1) {c.addClmTypCdgUsrSltd("]");}


		/******************** Clm_Typ_Cdg_Sys ********************************************************************************/
		if(claimtypecodingi == 0) {c.addClmTypCdgSys("[");}
		if(claimtypecoding.hasSystem()) {

			c.addClmTypCdgSys(String.valueOf(claimtypecoding.getSystem()));
		} else {
			c.addClmTypCdgSys("NULL");
		}

		if(claimtypecodingi == claimtypecodinglist.size()-1) {c.addClmTypCdgSys("]");}


		 };
		/******************** Clm_Provider ********************************************************************************/
		if(claim.hasProvider()) {

			if(claim.getProvider().getReference() != null) {
			c.addClmProvider(claim.getProvider().getReference());
			}
		} else {
			c.addClmProvider("NULL");
		}


		/******************** claimitem ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Claim.ItemComponent> claimitemlist = claim.getItem();
		for(int claimitemi = 0; claimitemi<claimitemlist.size();claimitemi++ ) {
		org.hl7.fhir.r4.model.Claim.ItemComponent  claimitem = claimitemlist.get(claimitemi);

		/******************** Clm_Itm_Enc ********************************************************************************/
		if(claimitemi == 0) {c.addClmItmEnc("[");}
		if(claimitem.hasEncounter()) {

			String  array = "[";
			for(int incr=0; incr<claimitem.getEncounter().size(); incr++) {
				array = array + claimitem.getEncounter().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmItmEnc(array);

		} else {
			c.addClmItmEnc("NULL");
		}

		if(claimitemi == claimitemlist.size()-1) {c.addClmItmEnc("]");}


		/******************** claimitemunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimitemunitprice = claimitem.getUnitPrice();

		/******************** Clm_Itm_UntPrice_Vl ********************************************************************************/
		if(claimitemi == 0) {c.addClmItmUntPriceVl("[");}
		if(claimitemunitprice.hasValue()) {

			c.addClmItmUntPriceVl(String.valueOf(claimitemunitprice.getValue()));
		} else {
			c.addClmItmUntPriceVl("NULL");
		}

		if(claimitemi == claimitemlist.size()-1) {c.addClmItmUntPriceVl("]");}


		/******************** Clm_Itm_UntPrice_Crncy ********************************************************************************/
		if(claimitemi == 0) {c.addClmItmUntPriceCrncy("[");}
		if(claimitemunitprice.hasCurrency()) {

			c.addClmItmUntPriceCrncy(String.valueOf(claimitemunitprice.getCurrency()));
		} else {
			c.addClmItmUntPriceCrncy("NULL");
		}

		if(claimitemi == claimitemlist.size()-1) {c.addClmItmUntPriceCrncy("]");}


		/******************** claimitemdetail ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Claim.DetailComponent> claimitemdetaillist = claimitem.getDetail();
		for(int claimitemdetaili = 0; claimitemdetaili<claimitemdetaillist.size();claimitemdetaili++ ) {
		org.hl7.fhir.r4.model.Claim.DetailComponent  claimitemdetail = claimitemdetaillist.get(claimitemdetaili);

		/******************** claimitemdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimitemdetailunitprice = claimitemdetail.getUnitPrice();

		/******************** Clm_Itm_Dtl_UntPrice_Vl ********************************************************************************/
		if(claimitemdetaili == 0) {c.addClmItmDtlUntPriceVl("[[");}
		if(claimitemdetailunitprice.hasValue()) {

			c.addClmItmDtlUntPriceVl(String.valueOf(claimitemdetailunitprice.getValue()));
		} else {
			c.addClmItmDtlUntPriceVl("NULL");
		}

		if(claimitemdetaili == claimitemdetaillist.size()-1) {c.addClmItmDtlUntPriceVl("]]");}


		/******************** Clm_Itm_Dtl_UntPrice_Crncy ********************************************************************************/
		if(claimitemdetaili == 0) {c.addClmItmDtlUntPriceCrncy("[[");}
		if(claimitemdetailunitprice.hasCurrency()) {

			c.addClmItmDtlUntPriceCrncy(String.valueOf(claimitemdetailunitprice.getCurrency()));
		} else {
			c.addClmItmDtlUntPriceCrncy("NULL");
		}

		if(claimitemdetaili == claimitemdetaillist.size()-1) {c.addClmItmDtlUntPriceCrncy("]]");}


		/******************** claimitemdetailcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailcategory = claimitemdetail.getCategory();

		/******************** Clm_Itm_Dtl_Ctgry_Txt ********************************************************************************/
		if(claimitemdetaili == 0) {c.addClmItmDtlCtgryTxt("[[");}
		if(claimitemdetailcategory.hasText()) {

			c.addClmItmDtlCtgryTxt(String.valueOf(claimitemdetailcategory.getText()));
		} else {
			c.addClmItmDtlCtgryTxt("NULL");
		}

		if(claimitemdetaili == claimitemdetaillist.size()-1) {c.addClmItmDtlCtgryTxt("]]");}


		/******************** claimitemdetailcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimitemdetailcategorycodinglist = claimitemdetailcategory.getCoding();
		for(int claimitemdetailcategorycodingi = 0; claimitemdetailcategorycodingi<claimitemdetailcategorycodinglist.size();claimitemdetailcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimitemdetailcategorycoding = claimitemdetailcategorycodinglist.get(claimitemdetailcategorycodingi);

		/******************** Clm_Itm_Dtl_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailcategorycodingi == 0) {c.addClmItmDtlCtgryCdgDsply("[[[");}
		if(claimitemdetailcategorycoding.hasDisplay()) {

			c.addClmItmDtlCtgryCdgDsply(String.valueOf(claimitemdetailcategorycoding.getDisplay()));
		} else {
			c.addClmItmDtlCtgryCdgDsply("NULL");
		}

		if(claimitemdetailcategorycodingi == claimitemdetailcategorycodinglist.size()-1) {c.addClmItmDtlCtgryCdgDsply("]]]");}


		/******************** Clm_Itm_Dtl_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailcategorycodingi == 0) {c.addClmItmDtlCtgryCdgVrsn("[[[");}
		if(claimitemdetailcategorycoding.hasVersion()) {

			c.addClmItmDtlCtgryCdgVrsn(String.valueOf(claimitemdetailcategorycoding.getVersion()));
		} else {
			c.addClmItmDtlCtgryCdgVrsn("NULL");
		}

		if(claimitemdetailcategorycodingi == claimitemdetailcategorycodinglist.size()-1) {c.addClmItmDtlCtgryCdgVrsn("]]]");}


		/******************** Clm_Itm_Dtl_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimitemdetailcategorycodingi == 0) {c.addClmItmDtlCtgryCdgCd("[[[");}
		if(claimitemdetailcategorycoding.hasCode()) {

			c.addClmItmDtlCtgryCdgCd(String.valueOf(claimitemdetailcategorycoding.getCode()));
		} else {
			c.addClmItmDtlCtgryCdgCd("NULL");
		}

		if(claimitemdetailcategorycodingi == claimitemdetailcategorycodinglist.size()-1) {c.addClmItmDtlCtgryCdgCd("]]]");}


		/******************** Clm_Itm_Dtl_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailcategorycodingi == 0) {c.addClmItmDtlCtgryCdgUsrSltd("[[[");}
		if(claimitemdetailcategorycoding.hasUserSelected()) {

			c.addClmItmDtlCtgryCdgUsrSltd(String.valueOf(claimitemdetailcategorycoding.getUserSelected()));
		} else {
			c.addClmItmDtlCtgryCdgUsrSltd("NULL");
		}

		if(claimitemdetailcategorycodingi == claimitemdetailcategorycodinglist.size()-1) {c.addClmItmDtlCtgryCdgUsrSltd("]]]");}


		/******************** Clm_Itm_Dtl_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimitemdetailcategorycodingi == 0) {c.addClmItmDtlCtgryCdgSys("[[[");}
		if(claimitemdetailcategorycoding.hasSystem()) {

			c.addClmItmDtlCtgryCdgSys(String.valueOf(claimitemdetailcategorycoding.getSystem()));
		} else {
			c.addClmItmDtlCtgryCdgSys("NULL");
		}

		if(claimitemdetailcategorycodingi == claimitemdetailcategorycodinglist.size()-1) {c.addClmItmDtlCtgryCdgSys("]]]");}


		 };
		/******************** claimitemdetailmodifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> claimitemdetailmodifierlist = claimitemdetail.getModifier();
		for(int claimitemdetailmodifieri = 0; claimitemdetailmodifieri<claimitemdetailmodifierlist.size();claimitemdetailmodifieri++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  claimitemdetailmodifier = claimitemdetailmodifierlist.get(claimitemdetailmodifieri);

		/******************** Clm_Itm_Dtl_Mdfr_Txt ********************************************************************************/
		if(claimitemdetailmodifieri == 0) {c.addClmItmDtlMdfrTxt("[[[");}
		if(claimitemdetailmodifier.hasText()) {

			c.addClmItmDtlMdfrTxt(String.valueOf(claimitemdetailmodifier.getText()));
		} else {
			c.addClmItmDtlMdfrTxt("NULL");
		}

		if(claimitemdetailmodifieri == claimitemdetailmodifierlist.size()-1) {c.addClmItmDtlMdfrTxt("]]]");}


		/******************** claimitemdetailmodifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimitemdetailmodifiercodinglist = claimitemdetailmodifier.getCoding();
		for(int claimitemdetailmodifiercodingi = 0; claimitemdetailmodifiercodingi<claimitemdetailmodifiercodinglist.size();claimitemdetailmodifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimitemdetailmodifiercoding = claimitemdetailmodifiercodinglist.get(claimitemdetailmodifiercodingi);

		/******************** Clm_Itm_Dtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailmodifiercodingi == 0) {c.addClmItmDtlMdfrCdgDsply("[[[[");}
		if(claimitemdetailmodifiercoding.hasDisplay()) {

			c.addClmItmDtlMdfrCdgDsply(String.valueOf(claimitemdetailmodifiercoding.getDisplay()));
		} else {
			c.addClmItmDtlMdfrCdgDsply("NULL");
		}

		if(claimitemdetailmodifiercodingi == claimitemdetailmodifiercodinglist.size()-1) {c.addClmItmDtlMdfrCdgDsply("]]]]");}


		/******************** Clm_Itm_Dtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailmodifiercodingi == 0) {c.addClmItmDtlMdfrCdgVrsn("[[[[");}
		if(claimitemdetailmodifiercoding.hasVersion()) {

			c.addClmItmDtlMdfrCdgVrsn(String.valueOf(claimitemdetailmodifiercoding.getVersion()));
		} else {
			c.addClmItmDtlMdfrCdgVrsn("NULL");
		}

		if(claimitemdetailmodifiercodingi == claimitemdetailmodifiercodinglist.size()-1) {c.addClmItmDtlMdfrCdgVrsn("]]]]");}


		/******************** Clm_Itm_Dtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(claimitemdetailmodifiercodingi == 0) {c.addClmItmDtlMdfrCdgCd("[[[[");}
		if(claimitemdetailmodifiercoding.hasCode()) {

			c.addClmItmDtlMdfrCdgCd(String.valueOf(claimitemdetailmodifiercoding.getCode()));
		} else {
			c.addClmItmDtlMdfrCdgCd("NULL");
		}

		if(claimitemdetailmodifiercodingi == claimitemdetailmodifiercodinglist.size()-1) {c.addClmItmDtlMdfrCdgCd("]]]]");}


		/******************** Clm_Itm_Dtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailmodifiercodingi == 0) {c.addClmItmDtlMdfrCdgUsrSltd("[[[[");}
		if(claimitemdetailmodifiercoding.hasUserSelected()) {

			c.addClmItmDtlMdfrCdgUsrSltd(String.valueOf(claimitemdetailmodifiercoding.getUserSelected()));
		} else {
			c.addClmItmDtlMdfrCdgUsrSltd("NULL");
		}

		if(claimitemdetailmodifiercodingi == claimitemdetailmodifiercodinglist.size()-1) {c.addClmItmDtlMdfrCdgUsrSltd("]]]]");}


		/******************** Clm_Itm_Dtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(claimitemdetailmodifiercodingi == 0) {c.addClmItmDtlMdfrCdgSys("[[[[");}
		if(claimitemdetailmodifiercoding.hasSystem()) {

			c.addClmItmDtlMdfrCdgSys(String.valueOf(claimitemdetailmodifiercoding.getSystem()));
		} else {
			c.addClmItmDtlMdfrCdgSys("NULL");
		}

		if(claimitemdetailmodifiercodingi == claimitemdetailmodifiercodinglist.size()-1) {c.addClmItmDtlMdfrCdgSys("]]]]");}


		 };
		 };
		/******************** Clm_Itm_Dtl_Sqnc ********************************************************************************/
		if(claimitemdetail.hasSequence()) {

			c.addClmItmDtlSqnc(String.valueOf(claimitemdetail.getSequence()));
		} else {
			c.addClmItmDtlSqnc("NULL");
		}


		/******************** Clm_Itm_Dtl_Factor ********************************************************************************/
		if(claimitemdetail.hasFactor()) {

			c.addClmItmDtlFactor(String.valueOf(claimitemdetail.getFactor()));
		} else {
			c.addClmItmDtlFactor("NULL");
		}


		/******************** claimitemdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimitemdetailnet = claimitemdetail.getNet();

		/******************** Clm_Itm_Dtl_Net_Vl ********************************************************************************/
		if(claimitemdetailnet.hasValue()) {

			c.addClmItmDtlNetVl(String.valueOf(claimitemdetailnet.getValue()));
		} else {
			c.addClmItmDtlNetVl("NULL");
		}


		/******************** Clm_Itm_Dtl_Net_Crncy ********************************************************************************/
		if(claimitemdetailnet.hasCurrency()) {

			c.addClmItmDtlNetCrncy(String.valueOf(claimitemdetailnet.getCurrency()));
		} else {
			c.addClmItmDtlNetCrncy("NULL");
		}


		/******************** claimitemdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimitemdetailquantity = claimitemdetail.getQuantity();

		/******************** Clm_Itm_Dtl_Qnty_Vl ********************************************************************************/
		if(claimitemdetailquantity.hasValue()) {

			c.addClmItmDtlQntyVl(String.valueOf(claimitemdetailquantity.getValue()));
		} else {
			c.addClmItmDtlQntyVl("NULL");
		}


		/******************** claimitemdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator claimitemdetailquantitycomparator = claimitemdetailquantity.getComparator();
		if(claimitemdetailquantitycomparator!=null) {
			c.addClmItmDtlQntyCmprtr(claimitemdetailquantitycomparator.toCode());
		} else {
			c.addClmItmDtlQntyCmprtr("NULL");
		}

		/******************** Clm_Itm_Dtl_Qnty_Cd ********************************************************************************/
		if(claimitemdetailquantity.hasCode()) {

			c.addClmItmDtlQntyCd(String.valueOf(claimitemdetailquantity.getCode()));
		} else {
			c.addClmItmDtlQntyCd("NULL");
		}


		/******************** Clm_Itm_Dtl_Qnty_Unt ********************************************************************************/
		if(claimitemdetailquantity.hasUnit()) {

			c.addClmItmDtlQntyUnt(String.valueOf(claimitemdetailquantity.getUnit()));
		} else {
			c.addClmItmDtlQntyUnt("NULL");
		}


		/******************** Clm_Itm_Dtl_Qnty_Sys ********************************************************************************/
		if(claimitemdetailquantity.hasSystem()) {

			c.addClmItmDtlQntySys(String.valueOf(claimitemdetailquantity.getSystem()));
		} else {
			c.addClmItmDtlQntySys("NULL");
		}


		/******************** claimitemdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailproductorservice = claimitemdetail.getProductOrService();

		/******************** Clm_Itm_Dtl_PrdctOrSrv_Txt ********************************************************************************/
		if(claimitemdetailproductorservice.hasText()) {

			c.addClmItmDtlPrdctOrSrvTxt(String.valueOf(claimitemdetailproductorservice.getText()));
		} else {
			c.addClmItmDtlPrdctOrSrvTxt("NULL");
		}


		/******************** claimitemdetailproductorservicecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimitemdetailproductorservicecodinglist = claimitemdetailproductorservice.getCoding();
		for(int claimitemdetailproductorservicecodingi = 0; claimitemdetailproductorservicecodingi<claimitemdetailproductorservicecodinglist.size();claimitemdetailproductorservicecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimitemdetailproductorservicecoding = claimitemdetailproductorservicecodinglist.get(claimitemdetailproductorservicecodingi);

		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailproductorservicecodingi == 0) {c.addClmItmDtlPrdctOrSrvCdgDsply("[[[");}
		if(claimitemdetailproductorservicecoding.hasDisplay()) {

			c.addClmItmDtlPrdctOrSrvCdgDsply(String.valueOf(claimitemdetailproductorservicecoding.getDisplay()));
		} else {
			c.addClmItmDtlPrdctOrSrvCdgDsply("NULL");
		}

		if(claimitemdetailproductorservicecodingi == claimitemdetailproductorservicecodinglist.size()-1) {c.addClmItmDtlPrdctOrSrvCdgDsply("]]]");}


		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailproductorservicecodingi == 0) {c.addClmItmDtlPrdctOrSrvCdgVrsn("[[[");}
		if(claimitemdetailproductorservicecoding.hasVersion()) {

			c.addClmItmDtlPrdctOrSrvCdgVrsn(String.valueOf(claimitemdetailproductorservicecoding.getVersion()));
		} else {
			c.addClmItmDtlPrdctOrSrvCdgVrsn("NULL");
		}

		if(claimitemdetailproductorservicecodingi == claimitemdetailproductorservicecodinglist.size()-1) {c.addClmItmDtlPrdctOrSrvCdgVrsn("]]]");}


		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(claimitemdetailproductorservicecodingi == 0) {c.addClmItmDtlPrdctOrSrvCdgCd("[[[");}
		if(claimitemdetailproductorservicecoding.hasCode()) {

			c.addClmItmDtlPrdctOrSrvCdgCd(String.valueOf(claimitemdetailproductorservicecoding.getCode()));
		} else {
			c.addClmItmDtlPrdctOrSrvCdgCd("NULL");
		}

		if(claimitemdetailproductorservicecodingi == claimitemdetailproductorservicecodinglist.size()-1) {c.addClmItmDtlPrdctOrSrvCdgCd("]]]");}


		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailproductorservicecodingi == 0) {c.addClmItmDtlPrdctOrSrvCdgUsrSltd("[[[");}
		if(claimitemdetailproductorservicecoding.hasUserSelected()) {

			c.addClmItmDtlPrdctOrSrvCdgUsrSltd(String.valueOf(claimitemdetailproductorservicecoding.getUserSelected()));
		} else {
			c.addClmItmDtlPrdctOrSrvCdgUsrSltd("NULL");
		}

		if(claimitemdetailproductorservicecodingi == claimitemdetailproductorservicecodinglist.size()-1) {c.addClmItmDtlPrdctOrSrvCdgUsrSltd("]]]");}


		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(claimitemdetailproductorservicecodingi == 0) {c.addClmItmDtlPrdctOrSrvCdgSys("[[[");}
		if(claimitemdetailproductorservicecoding.hasSystem()) {

			c.addClmItmDtlPrdctOrSrvCdgSys(String.valueOf(claimitemdetailproductorservicecoding.getSystem()));
		} else {
			c.addClmItmDtlPrdctOrSrvCdgSys("NULL");
		}

		if(claimitemdetailproductorservicecodingi == claimitemdetailproductorservicecodinglist.size()-1) {c.addClmItmDtlPrdctOrSrvCdgSys("]]]");}


		 };
		/******************** claimitemdetailsubdetail ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Claim.SubDetailComponent> claimitemdetailsubdetaillist = claimitemdetail.getSubDetail();
		for(int claimitemdetailsubdetaili = 0; claimitemdetailsubdetaili<claimitemdetailsubdetaillist.size();claimitemdetailsubdetaili++ ) {
		org.hl7.fhir.r4.model.Claim.SubDetailComponent  claimitemdetailsubdetail = claimitemdetailsubdetaillist.get(claimitemdetailsubdetaili);

		/******************** claimitemdetailsubdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimitemdetailsubdetailunitprice = claimitemdetailsubdetail.getUnitPrice();

		/******************** Clm_Itm_Dtl_SubDtl_UntPrice_Vl ********************************************************************************/
		if(claimitemdetailsubdetaili == 0) {c.addClmItmDtlSubDtlUntPriceVl("[[[");}
		if(claimitemdetailsubdetailunitprice.hasValue()) {

			c.addClmItmDtlSubDtlUntPriceVl(String.valueOf(claimitemdetailsubdetailunitprice.getValue()));
		} else {
			c.addClmItmDtlSubDtlUntPriceVl("NULL");
		}

		if(claimitemdetailsubdetaili == claimitemdetailsubdetaillist.size()-1) {c.addClmItmDtlSubDtlUntPriceVl("]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_UntPrice_Crncy ********************************************************************************/
		if(claimitemdetailsubdetaili == 0) {c.addClmItmDtlSubDtlUntPriceCrncy("[[[");}
		if(claimitemdetailsubdetailunitprice.hasCurrency()) {

			c.addClmItmDtlSubDtlUntPriceCrncy(String.valueOf(claimitemdetailsubdetailunitprice.getCurrency()));
		} else {
			c.addClmItmDtlSubDtlUntPriceCrncy("NULL");
		}

		if(claimitemdetailsubdetaili == claimitemdetailsubdetaillist.size()-1) {c.addClmItmDtlSubDtlUntPriceCrncy("]]]");}


		/******************** claimitemdetailsubdetailcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailsubdetailcategory = claimitemdetailsubdetail.getCategory();

		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Txt ********************************************************************************/
		if(claimitemdetailsubdetaili == 0) {c.addClmItmDtlSubDtlCtgryTxt("[[[");}
		if(claimitemdetailsubdetailcategory.hasText()) {

			c.addClmItmDtlSubDtlCtgryTxt(String.valueOf(claimitemdetailsubdetailcategory.getText()));
		} else {
			c.addClmItmDtlSubDtlCtgryTxt("NULL");
		}

		if(claimitemdetailsubdetaili == claimitemdetailsubdetaillist.size()-1) {c.addClmItmDtlSubDtlCtgryTxt("]]]");}


		/******************** claimitemdetailsubdetailcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimitemdetailsubdetailcategorycodinglist = claimitemdetailsubdetailcategory.getCoding();
		for(int claimitemdetailsubdetailcategorycodingi = 0; claimitemdetailsubdetailcategorycodingi<claimitemdetailsubdetailcategorycodinglist.size();claimitemdetailsubdetailcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimitemdetailsubdetailcategorycoding = claimitemdetailsubdetailcategorycodinglist.get(claimitemdetailsubdetailcategorycodingi);

		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailsubdetailcategorycodingi == 0) {c.addClmItmDtlSubDtlCtgryCdgDsply("[[[[");}
		if(claimitemdetailsubdetailcategorycoding.hasDisplay()) {

			c.addClmItmDtlSubDtlCtgryCdgDsply(String.valueOf(claimitemdetailsubdetailcategorycoding.getDisplay()));
		} else {
			c.addClmItmDtlSubDtlCtgryCdgDsply("NULL");
		}

		if(claimitemdetailsubdetailcategorycodingi == claimitemdetailsubdetailcategorycodinglist.size()-1) {c.addClmItmDtlSubDtlCtgryCdgDsply("]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailsubdetailcategorycodingi == 0) {c.addClmItmDtlSubDtlCtgryCdgVrsn("[[[[");}
		if(claimitemdetailsubdetailcategorycoding.hasVersion()) {

			c.addClmItmDtlSubDtlCtgryCdgVrsn(String.valueOf(claimitemdetailsubdetailcategorycoding.getVersion()));
		} else {
			c.addClmItmDtlSubDtlCtgryCdgVrsn("NULL");
		}

		if(claimitemdetailsubdetailcategorycodingi == claimitemdetailsubdetailcategorycodinglist.size()-1) {c.addClmItmDtlSubDtlCtgryCdgVrsn("]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimitemdetailsubdetailcategorycodingi == 0) {c.addClmItmDtlSubDtlCtgryCdgCd("[[[[");}
		if(claimitemdetailsubdetailcategorycoding.hasCode()) {

			c.addClmItmDtlSubDtlCtgryCdgCd(String.valueOf(claimitemdetailsubdetailcategorycoding.getCode()));
		} else {
			c.addClmItmDtlSubDtlCtgryCdgCd("NULL");
		}

		if(claimitemdetailsubdetailcategorycodingi == claimitemdetailsubdetailcategorycodinglist.size()-1) {c.addClmItmDtlSubDtlCtgryCdgCd("]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailsubdetailcategorycodingi == 0) {c.addClmItmDtlSubDtlCtgryCdgUsrSltd("[[[[");}
		if(claimitemdetailsubdetailcategorycoding.hasUserSelected()) {

			c.addClmItmDtlSubDtlCtgryCdgUsrSltd(String.valueOf(claimitemdetailsubdetailcategorycoding.getUserSelected()));
		} else {
			c.addClmItmDtlSubDtlCtgryCdgUsrSltd("NULL");
		}

		if(claimitemdetailsubdetailcategorycodingi == claimitemdetailsubdetailcategorycodinglist.size()-1) {c.addClmItmDtlSubDtlCtgryCdgUsrSltd("]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimitemdetailsubdetailcategorycodingi == 0) {c.addClmItmDtlSubDtlCtgryCdgSys("[[[[");}
		if(claimitemdetailsubdetailcategorycoding.hasSystem()) {

			c.addClmItmDtlSubDtlCtgryCdgSys(String.valueOf(claimitemdetailsubdetailcategorycoding.getSystem()));
		} else {
			c.addClmItmDtlSubDtlCtgryCdgSys("NULL");
		}

		if(claimitemdetailsubdetailcategorycodingi == claimitemdetailsubdetailcategorycodinglist.size()-1) {c.addClmItmDtlSubDtlCtgryCdgSys("]]]]");}


		 };
		/******************** claimitemdetailsubdetailmodifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> claimitemdetailsubdetailmodifierlist = claimitemdetailsubdetail.getModifier();
		for(int claimitemdetailsubdetailmodifieri = 0; claimitemdetailsubdetailmodifieri<claimitemdetailsubdetailmodifierlist.size();claimitemdetailsubdetailmodifieri++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  claimitemdetailsubdetailmodifier = claimitemdetailsubdetailmodifierlist.get(claimitemdetailsubdetailmodifieri);

		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Txt ********************************************************************************/
		if(claimitemdetailsubdetailmodifieri == 0) {c.addClmItmDtlSubDtlMdfrTxt("[[[[");}
		if(claimitemdetailsubdetailmodifier.hasText()) {

			c.addClmItmDtlSubDtlMdfrTxt(String.valueOf(claimitemdetailsubdetailmodifier.getText()));
		} else {
			c.addClmItmDtlSubDtlMdfrTxt("NULL");
		}

		if(claimitemdetailsubdetailmodifieri == claimitemdetailsubdetailmodifierlist.size()-1) {c.addClmItmDtlSubDtlMdfrTxt("]]]]");}


		/******************** claimitemdetailsubdetailmodifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimitemdetailsubdetailmodifiercodinglist = claimitemdetailsubdetailmodifier.getCoding();
		for(int claimitemdetailsubdetailmodifiercodingi = 0; claimitemdetailsubdetailmodifiercodingi<claimitemdetailsubdetailmodifiercodinglist.size();claimitemdetailsubdetailmodifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimitemdetailsubdetailmodifiercoding = claimitemdetailsubdetailmodifiercodinglist.get(claimitemdetailsubdetailmodifiercodingi);

		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailsubdetailmodifiercodingi == 0) {c.addClmItmDtlSubDtlMdfrCdgDsply("[[[[[");}
		if(claimitemdetailsubdetailmodifiercoding.hasDisplay()) {

			c.addClmItmDtlSubDtlMdfrCdgDsply(String.valueOf(claimitemdetailsubdetailmodifiercoding.getDisplay()));
		} else {
			c.addClmItmDtlSubDtlMdfrCdgDsply("NULL");
		}

		if(claimitemdetailsubdetailmodifiercodingi == claimitemdetailsubdetailmodifiercodinglist.size()-1) {c.addClmItmDtlSubDtlMdfrCdgDsply("]]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailsubdetailmodifiercodingi == 0) {c.addClmItmDtlSubDtlMdfrCdgVrsn("[[[[[");}
		if(claimitemdetailsubdetailmodifiercoding.hasVersion()) {

			c.addClmItmDtlSubDtlMdfrCdgVrsn(String.valueOf(claimitemdetailsubdetailmodifiercoding.getVersion()));
		} else {
			c.addClmItmDtlSubDtlMdfrCdgVrsn("NULL");
		}

		if(claimitemdetailsubdetailmodifiercodingi == claimitemdetailsubdetailmodifiercodinglist.size()-1) {c.addClmItmDtlSubDtlMdfrCdgVrsn("]]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(claimitemdetailsubdetailmodifiercodingi == 0) {c.addClmItmDtlSubDtlMdfrCdgCd("[[[[[");}
		if(claimitemdetailsubdetailmodifiercoding.hasCode()) {

			c.addClmItmDtlSubDtlMdfrCdgCd(String.valueOf(claimitemdetailsubdetailmodifiercoding.getCode()));
		} else {
			c.addClmItmDtlSubDtlMdfrCdgCd("NULL");
		}

		if(claimitemdetailsubdetailmodifiercodingi == claimitemdetailsubdetailmodifiercodinglist.size()-1) {c.addClmItmDtlSubDtlMdfrCdgCd("]]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailsubdetailmodifiercodingi == 0) {c.addClmItmDtlSubDtlMdfrCdgUsrSltd("[[[[[");}
		if(claimitemdetailsubdetailmodifiercoding.hasUserSelected()) {

			c.addClmItmDtlSubDtlMdfrCdgUsrSltd(String.valueOf(claimitemdetailsubdetailmodifiercoding.getUserSelected()));
		} else {
			c.addClmItmDtlSubDtlMdfrCdgUsrSltd("NULL");
		}

		if(claimitemdetailsubdetailmodifiercodingi == claimitemdetailsubdetailmodifiercodinglist.size()-1) {c.addClmItmDtlSubDtlMdfrCdgUsrSltd("]]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(claimitemdetailsubdetailmodifiercodingi == 0) {c.addClmItmDtlSubDtlMdfrCdgSys("[[[[[");}
		if(claimitemdetailsubdetailmodifiercoding.hasSystem()) {

			c.addClmItmDtlSubDtlMdfrCdgSys(String.valueOf(claimitemdetailsubdetailmodifiercoding.getSystem()));
		} else {
			c.addClmItmDtlSubDtlMdfrCdgSys("NULL");
		}

		if(claimitemdetailsubdetailmodifiercodingi == claimitemdetailsubdetailmodifiercodinglist.size()-1) {c.addClmItmDtlSubDtlMdfrCdgSys("]]]]]");}


		 };
		 };
		/******************** Clm_Itm_Dtl_SubDtl_Sqnc ********************************************************************************/
		if(claimitemdetailsubdetail.hasSequence()) {

			c.addClmItmDtlSubDtlSqnc(String.valueOf(claimitemdetailsubdetail.getSequence()));
		} else {
			c.addClmItmDtlSubDtlSqnc("NULL");
		}


		/******************** Clm_Itm_Dtl_SubDtl_Factor ********************************************************************************/
		if(claimitemdetailsubdetail.hasFactor()) {

			c.addClmItmDtlSubDtlFactor(String.valueOf(claimitemdetailsubdetail.getFactor()));
		} else {
			c.addClmItmDtlSubDtlFactor("NULL");
		}


		/******************** claimitemdetailsubdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimitemdetailsubdetailnet = claimitemdetailsubdetail.getNet();

		/******************** Clm_Itm_Dtl_SubDtl_Net_Vl ********************************************************************************/
		if(claimitemdetailsubdetailnet.hasValue()) {

			c.addClmItmDtlSubDtlNetVl(String.valueOf(claimitemdetailsubdetailnet.getValue()));
		} else {
			c.addClmItmDtlSubDtlNetVl("NULL");
		}


		/******************** Clm_Itm_Dtl_SubDtl_Net_Crncy ********************************************************************************/
		if(claimitemdetailsubdetailnet.hasCurrency()) {

			c.addClmItmDtlSubDtlNetCrncy(String.valueOf(claimitemdetailsubdetailnet.getCurrency()));
		} else {
			c.addClmItmDtlSubDtlNetCrncy("NULL");
		}


		/******************** claimitemdetailsubdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimitemdetailsubdetailquantity = claimitemdetailsubdetail.getQuantity();

		/******************** Clm_Itm_Dtl_SubDtl_Qnty_Vl ********************************************************************************/
		if(claimitemdetailsubdetailquantity.hasValue()) {

			c.addClmItmDtlSubDtlQntyVl(String.valueOf(claimitemdetailsubdetailquantity.getValue()));
		} else {
			c.addClmItmDtlSubDtlQntyVl("NULL");
		}


		/******************** claimitemdetailsubdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator claimitemdetailsubdetailquantitycomparator = claimitemdetailsubdetailquantity.getComparator();
		if(claimitemdetailsubdetailquantitycomparator!=null) {
			c.addClmItmDtlSubDtlQntyCmprtr(claimitemdetailsubdetailquantitycomparator.toCode());
		} else {
			c.addClmItmDtlSubDtlQntyCmprtr("NULL");
		}

		/******************** Clm_Itm_Dtl_SubDtl_Qnty_Cd ********************************************************************************/
		if(claimitemdetailsubdetailquantity.hasCode()) {

			c.addClmItmDtlSubDtlQntyCd(String.valueOf(claimitemdetailsubdetailquantity.getCode()));
		} else {
			c.addClmItmDtlSubDtlQntyCd("NULL");
		}


		/******************** Clm_Itm_Dtl_SubDtl_Qnty_Unt ********************************************************************************/
		if(claimitemdetailsubdetailquantity.hasUnit()) {

			c.addClmItmDtlSubDtlQntyUnt(String.valueOf(claimitemdetailsubdetailquantity.getUnit()));
		} else {
			c.addClmItmDtlSubDtlQntyUnt("NULL");
		}


		/******************** Clm_Itm_Dtl_SubDtl_Qnty_Sys ********************************************************************************/
		if(claimitemdetailsubdetailquantity.hasSystem()) {

			c.addClmItmDtlSubDtlQntySys(String.valueOf(claimitemdetailsubdetailquantity.getSystem()));
		} else {
			c.addClmItmDtlSubDtlQntySys("NULL");
		}


		/******************** claimitemdetailsubdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailsubdetailproductorservice = claimitemdetailsubdetail.getProductOrService();

		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Txt ********************************************************************************/
		if(claimitemdetailsubdetailproductorservice.hasText()) {

			c.addClmItmDtlSubDtlPrdctOrSrvTxt(String.valueOf(claimitemdetailsubdetailproductorservice.getText()));
		} else {
			c.addClmItmDtlSubDtlPrdctOrSrvTxt("NULL");
		}


		/******************** claimitemdetailsubdetailproductorservicecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimitemdetailsubdetailproductorservicecodinglist = claimitemdetailsubdetailproductorservice.getCoding();
		for(int claimitemdetailsubdetailproductorservicecodingi = 0; claimitemdetailsubdetailproductorservicecodingi<claimitemdetailsubdetailproductorservicecodinglist.size();claimitemdetailsubdetailproductorservicecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimitemdetailsubdetailproductorservicecoding = claimitemdetailsubdetailproductorservicecodinglist.get(claimitemdetailsubdetailproductorservicecodingi);

		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailsubdetailproductorservicecodingi == 0) {c.addClmItmDtlSubDtlPrdctOrSrvCdgDsply("[[[[");}
		if(claimitemdetailsubdetailproductorservicecoding.hasDisplay()) {

			c.addClmItmDtlSubDtlPrdctOrSrvCdgDsply(String.valueOf(claimitemdetailsubdetailproductorservicecoding.getDisplay()));
		} else {
			c.addClmItmDtlSubDtlPrdctOrSrvCdgDsply("NULL");
		}

		if(claimitemdetailsubdetailproductorservicecodingi == claimitemdetailsubdetailproductorservicecodinglist.size()-1) {c.addClmItmDtlSubDtlPrdctOrSrvCdgDsply("]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailsubdetailproductorservicecodingi == 0) {c.addClmItmDtlSubDtlPrdctOrSrvCdgVrsn("[[[[");}
		if(claimitemdetailsubdetailproductorservicecoding.hasVersion()) {

			c.addClmItmDtlSubDtlPrdctOrSrvCdgVrsn(String.valueOf(claimitemdetailsubdetailproductorservicecoding.getVersion()));
		} else {
			c.addClmItmDtlSubDtlPrdctOrSrvCdgVrsn("NULL");
		}

		if(claimitemdetailsubdetailproductorservicecodingi == claimitemdetailsubdetailproductorservicecodinglist.size()-1) {c.addClmItmDtlSubDtlPrdctOrSrvCdgVrsn("]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(claimitemdetailsubdetailproductorservicecodingi == 0) {c.addClmItmDtlSubDtlPrdctOrSrvCdgCd("[[[[");}
		if(claimitemdetailsubdetailproductorservicecoding.hasCode()) {

			c.addClmItmDtlSubDtlPrdctOrSrvCdgCd(String.valueOf(claimitemdetailsubdetailproductorservicecoding.getCode()));
		} else {
			c.addClmItmDtlSubDtlPrdctOrSrvCdgCd("NULL");
		}

		if(claimitemdetailsubdetailproductorservicecodingi == claimitemdetailsubdetailproductorservicecodinglist.size()-1) {c.addClmItmDtlSubDtlPrdctOrSrvCdgCd("]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailsubdetailproductorservicecodingi == 0) {c.addClmItmDtlSubDtlPrdctOrSrvCdgUsrSltd("[[[[");}
		if(claimitemdetailsubdetailproductorservicecoding.hasUserSelected()) {

			c.addClmItmDtlSubDtlPrdctOrSrvCdgUsrSltd(String.valueOf(claimitemdetailsubdetailproductorservicecoding.getUserSelected()));
		} else {
			c.addClmItmDtlSubDtlPrdctOrSrvCdgUsrSltd("NULL");
		}

		if(claimitemdetailsubdetailproductorservicecodingi == claimitemdetailsubdetailproductorservicecodinglist.size()-1) {c.addClmItmDtlSubDtlPrdctOrSrvCdgUsrSltd("]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(claimitemdetailsubdetailproductorservicecodingi == 0) {c.addClmItmDtlSubDtlPrdctOrSrvCdgSys("[[[[");}
		if(claimitemdetailsubdetailproductorservicecoding.hasSystem()) {

			c.addClmItmDtlSubDtlPrdctOrSrvCdgSys(String.valueOf(claimitemdetailsubdetailproductorservicecoding.getSystem()));
		} else {
			c.addClmItmDtlSubDtlPrdctOrSrvCdgSys("NULL");
		}

		if(claimitemdetailsubdetailproductorservicecodingi == claimitemdetailsubdetailproductorservicecodinglist.size()-1) {c.addClmItmDtlSubDtlPrdctOrSrvCdgSys("]]]]");}


		 };
		/******************** claimitemdetailsubdetailprogramcode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> claimitemdetailsubdetailprogramcodelist = claimitemdetailsubdetail.getProgramCode();
		for(int claimitemdetailsubdetailprogramcodei = 0; claimitemdetailsubdetailprogramcodei<claimitemdetailsubdetailprogramcodelist.size();claimitemdetailsubdetailprogramcodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  claimitemdetailsubdetailprogramcode = claimitemdetailsubdetailprogramcodelist.get(claimitemdetailsubdetailprogramcodei);

		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Txt ********************************************************************************/
		if(claimitemdetailsubdetailprogramcodei == 0) {c.addClmItmDtlSubDtlPrgrmCdTxt("[[[[");}
		if(claimitemdetailsubdetailprogramcode.hasText()) {

			c.addClmItmDtlSubDtlPrgrmCdTxt(String.valueOf(claimitemdetailsubdetailprogramcode.getText()));
		} else {
			c.addClmItmDtlSubDtlPrgrmCdTxt("NULL");
		}

		if(claimitemdetailsubdetailprogramcodei == claimitemdetailsubdetailprogramcodelist.size()-1) {c.addClmItmDtlSubDtlPrgrmCdTxt("]]]]");}


		/******************** claimitemdetailsubdetailprogramcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimitemdetailsubdetailprogramcodecodinglist = claimitemdetailsubdetailprogramcode.getCoding();
		for(int claimitemdetailsubdetailprogramcodecodingi = 0; claimitemdetailsubdetailprogramcodecodingi<claimitemdetailsubdetailprogramcodecodinglist.size();claimitemdetailsubdetailprogramcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimitemdetailsubdetailprogramcodecoding = claimitemdetailsubdetailprogramcodecodinglist.get(claimitemdetailsubdetailprogramcodecodingi);

		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailsubdetailprogramcodecodingi == 0) {c.addClmItmDtlSubDtlPrgrmCdCdgDsply("[[[[[");}
		if(claimitemdetailsubdetailprogramcodecoding.hasDisplay()) {

			c.addClmItmDtlSubDtlPrgrmCdCdgDsply(String.valueOf(claimitemdetailsubdetailprogramcodecoding.getDisplay()));
		} else {
			c.addClmItmDtlSubDtlPrgrmCdCdgDsply("NULL");
		}

		if(claimitemdetailsubdetailprogramcodecodingi == claimitemdetailsubdetailprogramcodecodinglist.size()-1) {c.addClmItmDtlSubDtlPrgrmCdCdgDsply("]]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailsubdetailprogramcodecodingi == 0) {c.addClmItmDtlSubDtlPrgrmCdCdgVrsn("[[[[[");}
		if(claimitemdetailsubdetailprogramcodecoding.hasVersion()) {

			c.addClmItmDtlSubDtlPrgrmCdCdgVrsn(String.valueOf(claimitemdetailsubdetailprogramcodecoding.getVersion()));
		} else {
			c.addClmItmDtlSubDtlPrgrmCdCdgVrsn("NULL");
		}

		if(claimitemdetailsubdetailprogramcodecodingi == claimitemdetailsubdetailprogramcodecodinglist.size()-1) {c.addClmItmDtlSubDtlPrgrmCdCdgVrsn("]]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(claimitemdetailsubdetailprogramcodecodingi == 0) {c.addClmItmDtlSubDtlPrgrmCdCdgCd("[[[[[");}
		if(claimitemdetailsubdetailprogramcodecoding.hasCode()) {

			c.addClmItmDtlSubDtlPrgrmCdCdgCd(String.valueOf(claimitemdetailsubdetailprogramcodecoding.getCode()));
		} else {
			c.addClmItmDtlSubDtlPrgrmCdCdgCd("NULL");
		}

		if(claimitemdetailsubdetailprogramcodecodingi == claimitemdetailsubdetailprogramcodecodinglist.size()-1) {c.addClmItmDtlSubDtlPrgrmCdCdgCd("]]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailsubdetailprogramcodecodingi == 0) {c.addClmItmDtlSubDtlPrgrmCdCdgUsrSltd("[[[[[");}
		if(claimitemdetailsubdetailprogramcodecoding.hasUserSelected()) {

			c.addClmItmDtlSubDtlPrgrmCdCdgUsrSltd(String.valueOf(claimitemdetailsubdetailprogramcodecoding.getUserSelected()));
		} else {
			c.addClmItmDtlSubDtlPrgrmCdCdgUsrSltd("NULL");
		}

		if(claimitemdetailsubdetailprogramcodecodingi == claimitemdetailsubdetailprogramcodecodinglist.size()-1) {c.addClmItmDtlSubDtlPrgrmCdCdgUsrSltd("]]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(claimitemdetailsubdetailprogramcodecodingi == 0) {c.addClmItmDtlSubDtlPrgrmCdCdgSys("[[[[[");}
		if(claimitemdetailsubdetailprogramcodecoding.hasSystem()) {

			c.addClmItmDtlSubDtlPrgrmCdCdgSys(String.valueOf(claimitemdetailsubdetailprogramcodecoding.getSystem()));
		} else {
			c.addClmItmDtlSubDtlPrgrmCdCdgSys("NULL");
		}

		if(claimitemdetailsubdetailprogramcodecodingi == claimitemdetailsubdetailprogramcodecodinglist.size()-1) {c.addClmItmDtlSubDtlPrgrmCdCdgSys("]]]]]");}


		 };
		 };
		/******************** claimitemdetailsubdetailrevenue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailsubdetailrevenue = claimitemdetailsubdetail.getRevenue();

		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Txt ********************************************************************************/
		if(claimitemdetailsubdetailrevenue.hasText()) {

			c.addClmItmDtlSubDtlRevenueTxt(String.valueOf(claimitemdetailsubdetailrevenue.getText()));
		} else {
			c.addClmItmDtlSubDtlRevenueTxt("NULL");
		}


		/******************** claimitemdetailsubdetailrevenuecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimitemdetailsubdetailrevenuecodinglist = claimitemdetailsubdetailrevenue.getCoding();
		for(int claimitemdetailsubdetailrevenuecodingi = 0; claimitemdetailsubdetailrevenuecodingi<claimitemdetailsubdetailrevenuecodinglist.size();claimitemdetailsubdetailrevenuecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimitemdetailsubdetailrevenuecoding = claimitemdetailsubdetailrevenuecodinglist.get(claimitemdetailsubdetailrevenuecodingi);

		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailsubdetailrevenuecodingi == 0) {c.addClmItmDtlSubDtlRevenueCdgDsply("[[[[");}
		if(claimitemdetailsubdetailrevenuecoding.hasDisplay()) {

			c.addClmItmDtlSubDtlRevenueCdgDsply(String.valueOf(claimitemdetailsubdetailrevenuecoding.getDisplay()));
		} else {
			c.addClmItmDtlSubDtlRevenueCdgDsply("NULL");
		}

		if(claimitemdetailsubdetailrevenuecodingi == claimitemdetailsubdetailrevenuecodinglist.size()-1) {c.addClmItmDtlSubDtlRevenueCdgDsply("]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailsubdetailrevenuecodingi == 0) {c.addClmItmDtlSubDtlRevenueCdgVrsn("[[[[");}
		if(claimitemdetailsubdetailrevenuecoding.hasVersion()) {

			c.addClmItmDtlSubDtlRevenueCdgVrsn(String.valueOf(claimitemdetailsubdetailrevenuecoding.getVersion()));
		} else {
			c.addClmItmDtlSubDtlRevenueCdgVrsn("NULL");
		}

		if(claimitemdetailsubdetailrevenuecodingi == claimitemdetailsubdetailrevenuecodinglist.size()-1) {c.addClmItmDtlSubDtlRevenueCdgVrsn("]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Cd ********************************************************************************/
		if(claimitemdetailsubdetailrevenuecodingi == 0) {c.addClmItmDtlSubDtlRevenueCdgCd("[[[[");}
		if(claimitemdetailsubdetailrevenuecoding.hasCode()) {

			c.addClmItmDtlSubDtlRevenueCdgCd(String.valueOf(claimitemdetailsubdetailrevenuecoding.getCode()));
		} else {
			c.addClmItmDtlSubDtlRevenueCdgCd("NULL");
		}

		if(claimitemdetailsubdetailrevenuecodingi == claimitemdetailsubdetailrevenuecodinglist.size()-1) {c.addClmItmDtlSubDtlRevenueCdgCd("]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailsubdetailrevenuecodingi == 0) {c.addClmItmDtlSubDtlRevenueCdgUsrSltd("[[[[");}
		if(claimitemdetailsubdetailrevenuecoding.hasUserSelected()) {

			c.addClmItmDtlSubDtlRevenueCdgUsrSltd(String.valueOf(claimitemdetailsubdetailrevenuecoding.getUserSelected()));
		} else {
			c.addClmItmDtlSubDtlRevenueCdgUsrSltd("NULL");
		}

		if(claimitemdetailsubdetailrevenuecodingi == claimitemdetailsubdetailrevenuecodinglist.size()-1) {c.addClmItmDtlSubDtlRevenueCdgUsrSltd("]]]]");}


		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Sys ********************************************************************************/
		if(claimitemdetailsubdetailrevenuecodingi == 0) {c.addClmItmDtlSubDtlRevenueCdgSys("[[[[");}
		if(claimitemdetailsubdetailrevenuecoding.hasSystem()) {

			c.addClmItmDtlSubDtlRevenueCdgSys(String.valueOf(claimitemdetailsubdetailrevenuecoding.getSystem()));
		} else {
			c.addClmItmDtlSubDtlRevenueCdgSys("NULL");
		}

		if(claimitemdetailsubdetailrevenuecodingi == claimitemdetailsubdetailrevenuecodinglist.size()-1) {c.addClmItmDtlSubDtlRevenueCdgSys("]]]]");}


		 };
		/******************** Clm_Itm_Dtl_SubDtl_Udi ********************************************************************************/
		if(claimitemdetailsubdetail.hasUdi()) {

			String  array = "[";
			for(int incr=0; incr<claimitemdetailsubdetail.getUdi().size(); incr++) {
				array = array + claimitemdetailsubdetail.getUdi().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmItmDtlSubDtlUdi(array);

		} else {
			c.addClmItmDtlSubDtlUdi("NULL");
		}


		 };
		/******************** claimitemdetailprogramcode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> claimitemdetailprogramcodelist = claimitemdetail.getProgramCode();
		for(int claimitemdetailprogramcodei = 0; claimitemdetailprogramcodei<claimitemdetailprogramcodelist.size();claimitemdetailprogramcodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  claimitemdetailprogramcode = claimitemdetailprogramcodelist.get(claimitemdetailprogramcodei);

		/******************** Clm_Itm_Dtl_PrgrmCd_Txt ********************************************************************************/
		if(claimitemdetailprogramcodei == 0) {c.addClmItmDtlPrgrmCdTxt("[[[");}
		if(claimitemdetailprogramcode.hasText()) {

			c.addClmItmDtlPrgrmCdTxt(String.valueOf(claimitemdetailprogramcode.getText()));
		} else {
			c.addClmItmDtlPrgrmCdTxt("NULL");
		}

		if(claimitemdetailprogramcodei == claimitemdetailprogramcodelist.size()-1) {c.addClmItmDtlPrgrmCdTxt("]]]");}


		/******************** claimitemdetailprogramcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimitemdetailprogramcodecodinglist = claimitemdetailprogramcode.getCoding();
		for(int claimitemdetailprogramcodecodingi = 0; claimitemdetailprogramcodecodingi<claimitemdetailprogramcodecodinglist.size();claimitemdetailprogramcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimitemdetailprogramcodecoding = claimitemdetailprogramcodecodinglist.get(claimitemdetailprogramcodecodingi);

		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailprogramcodecodingi == 0) {c.addClmItmDtlPrgrmCdCdgDsply("[[[[");}
		if(claimitemdetailprogramcodecoding.hasDisplay()) {

			c.addClmItmDtlPrgrmCdCdgDsply(String.valueOf(claimitemdetailprogramcodecoding.getDisplay()));
		} else {
			c.addClmItmDtlPrgrmCdCdgDsply("NULL");
		}

		if(claimitemdetailprogramcodecodingi == claimitemdetailprogramcodecodinglist.size()-1) {c.addClmItmDtlPrgrmCdCdgDsply("]]]]");}


		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailprogramcodecodingi == 0) {c.addClmItmDtlPrgrmCdCdgVrsn("[[[[");}
		if(claimitemdetailprogramcodecoding.hasVersion()) {

			c.addClmItmDtlPrgrmCdCdgVrsn(String.valueOf(claimitemdetailprogramcodecoding.getVersion()));
		} else {
			c.addClmItmDtlPrgrmCdCdgVrsn("NULL");
		}

		if(claimitemdetailprogramcodecodingi == claimitemdetailprogramcodecodinglist.size()-1) {c.addClmItmDtlPrgrmCdCdgVrsn("]]]]");}


		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(claimitemdetailprogramcodecodingi == 0) {c.addClmItmDtlPrgrmCdCdgCd("[[[[");}
		if(claimitemdetailprogramcodecoding.hasCode()) {

			c.addClmItmDtlPrgrmCdCdgCd(String.valueOf(claimitemdetailprogramcodecoding.getCode()));
		} else {
			c.addClmItmDtlPrgrmCdCdgCd("NULL");
		}

		if(claimitemdetailprogramcodecodingi == claimitemdetailprogramcodecodinglist.size()-1) {c.addClmItmDtlPrgrmCdCdgCd("]]]]");}


		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailprogramcodecodingi == 0) {c.addClmItmDtlPrgrmCdCdgUsrSltd("[[[[");}
		if(claimitemdetailprogramcodecoding.hasUserSelected()) {

			c.addClmItmDtlPrgrmCdCdgUsrSltd(String.valueOf(claimitemdetailprogramcodecoding.getUserSelected()));
		} else {
			c.addClmItmDtlPrgrmCdCdgUsrSltd("NULL");
		}

		if(claimitemdetailprogramcodecodingi == claimitemdetailprogramcodecodinglist.size()-1) {c.addClmItmDtlPrgrmCdCdgUsrSltd("]]]]");}


		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(claimitemdetailprogramcodecodingi == 0) {c.addClmItmDtlPrgrmCdCdgSys("[[[[");}
		if(claimitemdetailprogramcodecoding.hasSystem()) {

			c.addClmItmDtlPrgrmCdCdgSys(String.valueOf(claimitemdetailprogramcodecoding.getSystem()));
		} else {
			c.addClmItmDtlPrgrmCdCdgSys("NULL");
		}

		if(claimitemdetailprogramcodecodingi == claimitemdetailprogramcodecodinglist.size()-1) {c.addClmItmDtlPrgrmCdCdgSys("]]]]");}


		 };
		 };
		/******************** claimitemdetailrevenue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailrevenue = claimitemdetail.getRevenue();

		/******************** Clm_Itm_Dtl_Revenue_Txt ********************************************************************************/
		if(claimitemdetailrevenue.hasText()) {

			c.addClmItmDtlRevenueTxt(String.valueOf(claimitemdetailrevenue.getText()));
		} else {
			c.addClmItmDtlRevenueTxt("NULL");
		}


		/******************** claimitemdetailrevenuecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimitemdetailrevenuecodinglist = claimitemdetailrevenue.getCoding();
		for(int claimitemdetailrevenuecodingi = 0; claimitemdetailrevenuecodingi<claimitemdetailrevenuecodinglist.size();claimitemdetailrevenuecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimitemdetailrevenuecoding = claimitemdetailrevenuecodinglist.get(claimitemdetailrevenuecodingi);

		/******************** Clm_Itm_Dtl_Revenue_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailrevenuecodingi == 0) {c.addClmItmDtlRevenueCdgDsply("[[[");}
		if(claimitemdetailrevenuecoding.hasDisplay()) {

			c.addClmItmDtlRevenueCdgDsply(String.valueOf(claimitemdetailrevenuecoding.getDisplay()));
		} else {
			c.addClmItmDtlRevenueCdgDsply("NULL");
		}

		if(claimitemdetailrevenuecodingi == claimitemdetailrevenuecodinglist.size()-1) {c.addClmItmDtlRevenueCdgDsply("]]]");}


		/******************** Clm_Itm_Dtl_Revenue_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailrevenuecodingi == 0) {c.addClmItmDtlRevenueCdgVrsn("[[[");}
		if(claimitemdetailrevenuecoding.hasVersion()) {

			c.addClmItmDtlRevenueCdgVrsn(String.valueOf(claimitemdetailrevenuecoding.getVersion()));
		} else {
			c.addClmItmDtlRevenueCdgVrsn("NULL");
		}

		if(claimitemdetailrevenuecodingi == claimitemdetailrevenuecodinglist.size()-1) {c.addClmItmDtlRevenueCdgVrsn("]]]");}


		/******************** Clm_Itm_Dtl_Revenue_Cdg_Cd ********************************************************************************/
		if(claimitemdetailrevenuecodingi == 0) {c.addClmItmDtlRevenueCdgCd("[[[");}
		if(claimitemdetailrevenuecoding.hasCode()) {

			c.addClmItmDtlRevenueCdgCd(String.valueOf(claimitemdetailrevenuecoding.getCode()));
		} else {
			c.addClmItmDtlRevenueCdgCd("NULL");
		}

		if(claimitemdetailrevenuecodingi == claimitemdetailrevenuecodinglist.size()-1) {c.addClmItmDtlRevenueCdgCd("]]]");}


		/******************** Clm_Itm_Dtl_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailrevenuecodingi == 0) {c.addClmItmDtlRevenueCdgUsrSltd("[[[");}
		if(claimitemdetailrevenuecoding.hasUserSelected()) {

			c.addClmItmDtlRevenueCdgUsrSltd(String.valueOf(claimitemdetailrevenuecoding.getUserSelected()));
		} else {
			c.addClmItmDtlRevenueCdgUsrSltd("NULL");
		}

		if(claimitemdetailrevenuecodingi == claimitemdetailrevenuecodinglist.size()-1) {c.addClmItmDtlRevenueCdgUsrSltd("]]]");}


		/******************** Clm_Itm_Dtl_Revenue_Cdg_Sys ********************************************************************************/
		if(claimitemdetailrevenuecodingi == 0) {c.addClmItmDtlRevenueCdgSys("[[[");}
		if(claimitemdetailrevenuecoding.hasSystem()) {

			c.addClmItmDtlRevenueCdgSys(String.valueOf(claimitemdetailrevenuecoding.getSystem()));
		} else {
			c.addClmItmDtlRevenueCdgSys("NULL");
		}

		if(claimitemdetailrevenuecodingi == claimitemdetailrevenuecodinglist.size()-1) {c.addClmItmDtlRevenueCdgSys("]]]");}


		 };
		/******************** Clm_Itm_Dtl_Udi ********************************************************************************/
		if(claimitemdetail.hasUdi()) {

			String  array = "[";
			for(int incr=0; incr<claimitemdetail.getUdi().size(); incr++) {
				array = array + claimitemdetail.getUdi().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmItmDtlUdi(array);

		} else {
			c.addClmItmDtlUdi("NULL");
		}


		 };
		/******************** claimitemcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemcategory = claimitem.getCategory();

		/******************** Clm_Itm_Ctgry_Txt ********************************************************************************/
		if(claimitemcategory.hasText()) {

			c.addClmItmCtgryTxt(String.valueOf(claimitemcategory.getText()));
		} else {
			c.addClmItmCtgryTxt("NULL");
		}


		/******************** claimitemcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimitemcategorycodinglist = claimitemcategory.getCoding();
		for(int claimitemcategorycodingi = 0; claimitemcategorycodingi<claimitemcategorycodinglist.size();claimitemcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimitemcategorycoding = claimitemcategorycodinglist.get(claimitemcategorycodingi);

		/******************** Clm_Itm_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimitemcategorycodingi == 0) {c.addClmItmCtgryCdgDsply("[[");}
		if(claimitemcategorycoding.hasDisplay()) {

			c.addClmItmCtgryCdgDsply(String.valueOf(claimitemcategorycoding.getDisplay()));
		} else {
			c.addClmItmCtgryCdgDsply("NULL");
		}

		if(claimitemcategorycodingi == claimitemcategorycodinglist.size()-1) {c.addClmItmCtgryCdgDsply("]]");}


		/******************** Clm_Itm_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimitemcategorycodingi == 0) {c.addClmItmCtgryCdgVrsn("[[");}
		if(claimitemcategorycoding.hasVersion()) {

			c.addClmItmCtgryCdgVrsn(String.valueOf(claimitemcategorycoding.getVersion()));
		} else {
			c.addClmItmCtgryCdgVrsn("NULL");
		}

		if(claimitemcategorycodingi == claimitemcategorycodinglist.size()-1) {c.addClmItmCtgryCdgVrsn("]]");}


		/******************** Clm_Itm_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimitemcategorycodingi == 0) {c.addClmItmCtgryCdgCd("[[");}
		if(claimitemcategorycoding.hasCode()) {

			c.addClmItmCtgryCdgCd(String.valueOf(claimitemcategorycoding.getCode()));
		} else {
			c.addClmItmCtgryCdgCd("NULL");
		}

		if(claimitemcategorycodingi == claimitemcategorycodinglist.size()-1) {c.addClmItmCtgryCdgCd("]]");}


		/******************** Clm_Itm_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimitemcategorycodingi == 0) {c.addClmItmCtgryCdgUsrSltd("[[");}
		if(claimitemcategorycoding.hasUserSelected()) {

			c.addClmItmCtgryCdgUsrSltd(String.valueOf(claimitemcategorycoding.getUserSelected()));
		} else {
			c.addClmItmCtgryCdgUsrSltd("NULL");
		}

		if(claimitemcategorycodingi == claimitemcategorycodinglist.size()-1) {c.addClmItmCtgryCdgUsrSltd("]]");}


		/******************** Clm_Itm_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimitemcategorycodingi == 0) {c.addClmItmCtgryCdgSys("[[");}
		if(claimitemcategorycoding.hasSystem()) {

			c.addClmItmCtgryCdgSys(String.valueOf(claimitemcategorycoding.getSystem()));
		} else {
			c.addClmItmCtgryCdgSys("NULL");
		}

		if(claimitemcategorycodingi == claimitemcategorycodinglist.size()-1) {c.addClmItmCtgryCdgSys("]]");}


		 };
		/******************** claimitembodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitembodysite = claimitem.getBodySite();

		/******************** Clm_Itm_BodySite_Txt ********************************************************************************/
		if(claimitembodysite.hasText()) {

			c.addClmItmBodySiteTxt(String.valueOf(claimitembodysite.getText()));
		} else {
			c.addClmItmBodySiteTxt("NULL");
		}


		/******************** claimitembodysitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimitembodysitecodinglist = claimitembodysite.getCoding();
		for(int claimitembodysitecodingi = 0; claimitembodysitecodingi<claimitembodysitecodinglist.size();claimitembodysitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimitembodysitecoding = claimitembodysitecodinglist.get(claimitembodysitecodingi);

		/******************** Clm_Itm_BodySite_Cdg_Dsply ********************************************************************************/
		if(claimitembodysitecodingi == 0) {c.addClmItmBodySiteCdgDsply("[[");}
		if(claimitembodysitecoding.hasDisplay()) {

			c.addClmItmBodySiteCdgDsply(String.valueOf(claimitembodysitecoding.getDisplay()));
		} else {
			c.addClmItmBodySiteCdgDsply("NULL");
		}

		if(claimitembodysitecodingi == claimitembodysitecodinglist.size()-1) {c.addClmItmBodySiteCdgDsply("]]");}


		/******************** Clm_Itm_BodySite_Cdg_Vrsn ********************************************************************************/
		if(claimitembodysitecodingi == 0) {c.addClmItmBodySiteCdgVrsn("[[");}
		if(claimitembodysitecoding.hasVersion()) {

			c.addClmItmBodySiteCdgVrsn(String.valueOf(claimitembodysitecoding.getVersion()));
		} else {
			c.addClmItmBodySiteCdgVrsn("NULL");
		}

		if(claimitembodysitecodingi == claimitembodysitecodinglist.size()-1) {c.addClmItmBodySiteCdgVrsn("]]");}


		/******************** Clm_Itm_BodySite_Cdg_Cd ********************************************************************************/
		if(claimitembodysitecodingi == 0) {c.addClmItmBodySiteCdgCd("[[");}
		if(claimitembodysitecoding.hasCode()) {

			c.addClmItmBodySiteCdgCd(String.valueOf(claimitembodysitecoding.getCode()));
		} else {
			c.addClmItmBodySiteCdgCd("NULL");
		}

		if(claimitembodysitecodingi == claimitembodysitecodinglist.size()-1) {c.addClmItmBodySiteCdgCd("]]");}


		/******************** Clm_Itm_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(claimitembodysitecodingi == 0) {c.addClmItmBodySiteCdgUsrSltd("[[");}
		if(claimitembodysitecoding.hasUserSelected()) {

			c.addClmItmBodySiteCdgUsrSltd(String.valueOf(claimitembodysitecoding.getUserSelected()));
		} else {
			c.addClmItmBodySiteCdgUsrSltd("NULL");
		}

		if(claimitembodysitecodingi == claimitembodysitecodinglist.size()-1) {c.addClmItmBodySiteCdgUsrSltd("]]");}


		/******************** Clm_Itm_BodySite_Cdg_Sys ********************************************************************************/
		if(claimitembodysitecodingi == 0) {c.addClmItmBodySiteCdgSys("[[");}
		if(claimitembodysitecoding.hasSystem()) {

			c.addClmItmBodySiteCdgSys(String.valueOf(claimitembodysitecoding.getSystem()));
		} else {
			c.addClmItmBodySiteCdgSys("NULL");
		}

		if(claimitembodysitecodingi == claimitembodysitecodinglist.size()-1) {c.addClmItmBodySiteCdgSys("]]");}


		 };
		/******************** claimitemmodifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> claimitemmodifierlist = claimitem.getModifier();
		for(int claimitemmodifieri = 0; claimitemmodifieri<claimitemmodifierlist.size();claimitemmodifieri++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  claimitemmodifier = claimitemmodifierlist.get(claimitemmodifieri);

		/******************** Clm_Itm_Mdfr_Txt ********************************************************************************/
		if(claimitemmodifieri == 0) {c.addClmItmMdfrTxt("[[");}
		if(claimitemmodifier.hasText()) {

			c.addClmItmMdfrTxt(String.valueOf(claimitemmodifier.getText()));
		} else {
			c.addClmItmMdfrTxt("NULL");
		}

		if(claimitemmodifieri == claimitemmodifierlist.size()-1) {c.addClmItmMdfrTxt("]]");}


		/******************** claimitemmodifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimitemmodifiercodinglist = claimitemmodifier.getCoding();
		for(int claimitemmodifiercodingi = 0; claimitemmodifiercodingi<claimitemmodifiercodinglist.size();claimitemmodifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimitemmodifiercoding = claimitemmodifiercodinglist.get(claimitemmodifiercodingi);

		/******************** Clm_Itm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(claimitemmodifiercodingi == 0) {c.addClmItmMdfrCdgDsply("[[[");}
		if(claimitemmodifiercoding.hasDisplay()) {

			c.addClmItmMdfrCdgDsply(String.valueOf(claimitemmodifiercoding.getDisplay()));
		} else {
			c.addClmItmMdfrCdgDsply("NULL");
		}

		if(claimitemmodifiercodingi == claimitemmodifiercodinglist.size()-1) {c.addClmItmMdfrCdgDsply("]]]");}


		/******************** Clm_Itm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(claimitemmodifiercodingi == 0) {c.addClmItmMdfrCdgVrsn("[[[");}
		if(claimitemmodifiercoding.hasVersion()) {

			c.addClmItmMdfrCdgVrsn(String.valueOf(claimitemmodifiercoding.getVersion()));
		} else {
			c.addClmItmMdfrCdgVrsn("NULL");
		}

		if(claimitemmodifiercodingi == claimitemmodifiercodinglist.size()-1) {c.addClmItmMdfrCdgVrsn("]]]");}


		/******************** Clm_Itm_Mdfr_Cdg_Cd ********************************************************************************/
		if(claimitemmodifiercodingi == 0) {c.addClmItmMdfrCdgCd("[[[");}
		if(claimitemmodifiercoding.hasCode()) {

			c.addClmItmMdfrCdgCd(String.valueOf(claimitemmodifiercoding.getCode()));
		} else {
			c.addClmItmMdfrCdgCd("NULL");
		}

		if(claimitemmodifiercodingi == claimitemmodifiercodinglist.size()-1) {c.addClmItmMdfrCdgCd("]]]");}


		/******************** Clm_Itm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(claimitemmodifiercodingi == 0) {c.addClmItmMdfrCdgUsrSltd("[[[");}
		if(claimitemmodifiercoding.hasUserSelected()) {

			c.addClmItmMdfrCdgUsrSltd(String.valueOf(claimitemmodifiercoding.getUserSelected()));
		} else {
			c.addClmItmMdfrCdgUsrSltd("NULL");
		}

		if(claimitemmodifiercodingi == claimitemmodifiercodinglist.size()-1) {c.addClmItmMdfrCdgUsrSltd("]]]");}


		/******************** Clm_Itm_Mdfr_Cdg_Sys ********************************************************************************/
		if(claimitemmodifiercodingi == 0) {c.addClmItmMdfrCdgSys("[[[");}
		if(claimitemmodifiercoding.hasSystem()) {

			c.addClmItmMdfrCdgSys(String.valueOf(claimitemmodifiercoding.getSystem()));
		} else {
			c.addClmItmMdfrCdgSys("NULL");
		}

		if(claimitemmodifiercodingi == claimitemmodifiercodinglist.size()-1) {c.addClmItmMdfrCdgSys("]]]");}


		 };
		 };
		/******************** Clm_Itm_Sqnc ********************************************************************************/
		if(claimitem.hasSequence()) {

			c.addClmItmSqnc(String.valueOf(claimitem.getSequence()));
		} else {
			c.addClmItmSqnc("NULL");
		}


		/******************** Clm_Itm_Factor ********************************************************************************/
		if(claimitem.hasFactor()) {

			c.addClmItmFactor(String.valueOf(claimitem.getFactor()));
		} else {
			c.addClmItmFactor("NULL");
		}


		/******************** claimitemnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimitemnet = claimitem.getNet();

		/******************** Clm_Itm_Net_Vl ********************************************************************************/
		if(claimitemnet.hasValue()) {

			c.addClmItmNetVl(String.valueOf(claimitemnet.getValue()));
		} else {
			c.addClmItmNetVl("NULL");
		}


		/******************** Clm_Itm_Net_Crncy ********************************************************************************/
		if(claimitemnet.hasCurrency()) {

			c.addClmItmNetCrncy(String.valueOf(claimitemnet.getCurrency()));
		} else {
			c.addClmItmNetCrncy("NULL");
		}


		/******************** Clm_Itm_SrvdDtTyp ********************************************************************************/
		if(claimitem.hasServicedDateType()) {

			c.addClmItmSrvdDtTyp("\""+claimitem.getServicedDateType().getValueAsString()+"\"");
		} else {
			c.addClmItmSrvdDtTyp("NULL");
		}


		/******************** claimitemlocationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemlocationcodeableconcept = claimitem.getLocationCodeableConcept();

		/******************** Clm_Itm_LctnCdbleCncpt_Txt ********************************************************************************/
		if(claimitemlocationcodeableconcept.hasText()) {

			c.addClmItmLctnCdbleCncptTxt(String.valueOf(claimitemlocationcodeableconcept.getText()));
		} else {
			c.addClmItmLctnCdbleCncptTxt("NULL");
		}


		/******************** claimitemlocationcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimitemlocationcodeableconceptcodinglist = claimitemlocationcodeableconcept.getCoding();
		for(int claimitemlocationcodeableconceptcodingi = 0; claimitemlocationcodeableconceptcodingi<claimitemlocationcodeableconceptcodinglist.size();claimitemlocationcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimitemlocationcodeableconceptcoding = claimitemlocationcodeableconceptcodinglist.get(claimitemlocationcodeableconceptcodingi);

		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(claimitemlocationcodeableconceptcodingi == 0) {c.addClmItmLctnCdbleCncptCdgDsply("[[");}
		if(claimitemlocationcodeableconceptcoding.hasDisplay()) {

			c.addClmItmLctnCdbleCncptCdgDsply(String.valueOf(claimitemlocationcodeableconceptcoding.getDisplay()));
		} else {
			c.addClmItmLctnCdbleCncptCdgDsply("NULL");
		}

		if(claimitemlocationcodeableconceptcodingi == claimitemlocationcodeableconceptcodinglist.size()-1) {c.addClmItmLctnCdbleCncptCdgDsply("]]");}


		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(claimitemlocationcodeableconceptcodingi == 0) {c.addClmItmLctnCdbleCncptCdgVrsn("[[");}
		if(claimitemlocationcodeableconceptcoding.hasVersion()) {

			c.addClmItmLctnCdbleCncptCdgVrsn(String.valueOf(claimitemlocationcodeableconceptcoding.getVersion()));
		} else {
			c.addClmItmLctnCdbleCncptCdgVrsn("NULL");
		}

		if(claimitemlocationcodeableconceptcodingi == claimitemlocationcodeableconceptcodinglist.size()-1) {c.addClmItmLctnCdbleCncptCdgVrsn("]]");}


		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(claimitemlocationcodeableconceptcodingi == 0) {c.addClmItmLctnCdbleCncptCdgCd("[[");}
		if(claimitemlocationcodeableconceptcoding.hasCode()) {

			c.addClmItmLctnCdbleCncptCdgCd(String.valueOf(claimitemlocationcodeableconceptcoding.getCode()));
		} else {
			c.addClmItmLctnCdbleCncptCdgCd("NULL");
		}

		if(claimitemlocationcodeableconceptcodingi == claimitemlocationcodeableconceptcodinglist.size()-1) {c.addClmItmLctnCdbleCncptCdgCd("]]");}


		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(claimitemlocationcodeableconceptcodingi == 0) {c.addClmItmLctnCdbleCncptCdgUsrSltd("[[");}
		if(claimitemlocationcodeableconceptcoding.hasUserSelected()) {

			c.addClmItmLctnCdbleCncptCdgUsrSltd(String.valueOf(claimitemlocationcodeableconceptcoding.getUserSelected()));
		} else {
			c.addClmItmLctnCdbleCncptCdgUsrSltd("NULL");
		}

		if(claimitemlocationcodeableconceptcodingi == claimitemlocationcodeableconceptcodinglist.size()-1) {c.addClmItmLctnCdbleCncptCdgUsrSltd("]]");}


		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(claimitemlocationcodeableconceptcodingi == 0) {c.addClmItmLctnCdbleCncptCdgSys("[[");}
		if(claimitemlocationcodeableconceptcoding.hasSystem()) {

			c.addClmItmLctnCdbleCncptCdgSys(String.valueOf(claimitemlocationcodeableconceptcoding.getSystem()));
		} else {
			c.addClmItmLctnCdbleCncptCdgSys("NULL");
		}

		if(claimitemlocationcodeableconceptcodingi == claimitemlocationcodeableconceptcodinglist.size()-1) {c.addClmItmLctnCdbleCncptCdgSys("]]");}


		 };
		/******************** claimitemservicedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimitemservicedperiod = claimitem.getServicedPeriod();

		/******************** Clm_Itm_SrvdPrd_Strt ********************************************************************************/
		if(claimitemservicedperiod.hasStart()) {

			c.addClmItmSrvdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimitemservicedperiod.getStart())+"\"");
		} else {
			c.addClmItmSrvdPrdStrt("NULL");
		}


		/******************** Clm_Itm_SrvdPrd_End ********************************************************************************/
		if(claimitemservicedperiod.hasEnd()) {

			c.addClmItmSrvdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimitemservicedperiod.getEnd())+"\"");
		} else {
			c.addClmItmSrvdPrdEnd("NULL");
		}


		/******************** claimitemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimitemquantity = claimitem.getQuantity();

		/******************** Clm_Itm_Qnty_Vl ********************************************************************************/
		if(claimitemquantity.hasValue()) {

			c.addClmItmQntyVl(String.valueOf(claimitemquantity.getValue()));
		} else {
			c.addClmItmQntyVl("NULL");
		}


		/******************** claimitemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator claimitemquantitycomparator = claimitemquantity.getComparator();
		if(claimitemquantitycomparator!=null) {
			c.addClmItmQntyCmprtr(claimitemquantitycomparator.toCode());
		} else {
			c.addClmItmQntyCmprtr("NULL");
		}

		/******************** Clm_Itm_Qnty_Cd ********************************************************************************/
		if(claimitemquantity.hasCode()) {

			c.addClmItmQntyCd(String.valueOf(claimitemquantity.getCode()));
		} else {
			c.addClmItmQntyCd("NULL");
		}


		/******************** Clm_Itm_Qnty_Unt ********************************************************************************/
		if(claimitemquantity.hasUnit()) {

			c.addClmItmQntyUnt(String.valueOf(claimitemquantity.getUnit()));
		} else {
			c.addClmItmQntyUnt("NULL");
		}


		/******************** Clm_Itm_Qnty_Sys ********************************************************************************/
		if(claimitemquantity.hasSystem()) {

			c.addClmItmQntySys(String.valueOf(claimitemquantity.getSystem()));
		} else {
			c.addClmItmQntySys("NULL");
		}


		/******************** Clm_Itm_CareTeamSqnc ********************************************************************************/
		if(claimitem.hasCareTeamSequence()) {

			String  array = "[";
			for(int incr=0; incr<claimitem.getCareTeamSequence().size(); incr++) {
				array = array + claimitem.getCareTeamSequence().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmItmCareTeamSqnc(array);

		} else {
			c.addClmItmCareTeamSqnc("NULL");
		}


		/******************** Clm_Itm_DgnsisSqnc ********************************************************************************/
		if(claimitem.hasDiagnosisSequence()) {

			String  array = "[";
			for(int incr=0; incr<claimitem.getDiagnosisSequence().size(); incr++) {
				array = array + claimitem.getDiagnosisSequence().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmItmDgnsisSqnc(array);

		} else {
			c.addClmItmDgnsisSqnc("NULL");
		}


		/******************** Clm_Itm_InfoSqnc ********************************************************************************/
		if(claimitem.hasInformationSequence()) {

			String  array = "[";
			for(int incr=0; incr<claimitem.getInformationSequence().size(); incr++) {
				array = array + claimitem.getInformationSequence().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmItmInfoSqnc(array);

		} else {
			c.addClmItmInfoSqnc("NULL");
		}


		/******************** Clm_Itm_PrcdrSqnc ********************************************************************************/
		if(claimitem.hasProcedureSequence()) {

			String  array = "[";
			for(int incr=0; incr<claimitem.getProcedureSequence().size(); incr++) {
				array = array + claimitem.getProcedureSequence().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmItmPrcdrSqnc(array);

		} else {
			c.addClmItmPrcdrSqnc("NULL");
		}


		/******************** claimitemproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemproductorservice = claimitem.getProductOrService();

		/******************** Clm_Itm_PrdctOrSrv_Txt ********************************************************************************/
		if(claimitemproductorservice.hasText()) {

			c.addClmItmPrdctOrSrvTxt(String.valueOf(claimitemproductorservice.getText()));
		} else {
			c.addClmItmPrdctOrSrvTxt("NULL");
		}


		/******************** claimitemproductorservicecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimitemproductorservicecodinglist = claimitemproductorservice.getCoding();
		for(int claimitemproductorservicecodingi = 0; claimitemproductorservicecodingi<claimitemproductorservicecodinglist.size();claimitemproductorservicecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimitemproductorservicecoding = claimitemproductorservicecodinglist.get(claimitemproductorservicecodingi);

		/******************** Clm_Itm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(claimitemproductorservicecodingi == 0) {c.addClmItmPrdctOrSrvCdgDsply("[[");}
		if(claimitemproductorservicecoding.hasDisplay()) {

			c.addClmItmPrdctOrSrvCdgDsply(String.valueOf(claimitemproductorservicecoding.getDisplay()));
		} else {
			c.addClmItmPrdctOrSrvCdgDsply("NULL");
		}

		if(claimitemproductorservicecodingi == claimitemproductorservicecodinglist.size()-1) {c.addClmItmPrdctOrSrvCdgDsply("]]");}


		/******************** Clm_Itm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(claimitemproductorservicecodingi == 0) {c.addClmItmPrdctOrSrvCdgVrsn("[[");}
		if(claimitemproductorservicecoding.hasVersion()) {

			c.addClmItmPrdctOrSrvCdgVrsn(String.valueOf(claimitemproductorservicecoding.getVersion()));
		} else {
			c.addClmItmPrdctOrSrvCdgVrsn("NULL");
		}

		if(claimitemproductorservicecodingi == claimitemproductorservicecodinglist.size()-1) {c.addClmItmPrdctOrSrvCdgVrsn("]]");}


		/******************** Clm_Itm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(claimitemproductorservicecodingi == 0) {c.addClmItmPrdctOrSrvCdgCd("[[");}
		if(claimitemproductorservicecoding.hasCode()) {

			c.addClmItmPrdctOrSrvCdgCd(String.valueOf(claimitemproductorservicecoding.getCode()));
		} else {
			c.addClmItmPrdctOrSrvCdgCd("NULL");
		}

		if(claimitemproductorservicecodingi == claimitemproductorservicecodinglist.size()-1) {c.addClmItmPrdctOrSrvCdgCd("]]");}


		/******************** Clm_Itm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(claimitemproductorservicecodingi == 0) {c.addClmItmPrdctOrSrvCdgUsrSltd("[[");}
		if(claimitemproductorservicecoding.hasUserSelected()) {

			c.addClmItmPrdctOrSrvCdgUsrSltd(String.valueOf(claimitemproductorservicecoding.getUserSelected()));
		} else {
			c.addClmItmPrdctOrSrvCdgUsrSltd("NULL");
		}

		if(claimitemproductorservicecodingi == claimitemproductorservicecodinglist.size()-1) {c.addClmItmPrdctOrSrvCdgUsrSltd("]]");}


		/******************** Clm_Itm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(claimitemproductorservicecodingi == 0) {c.addClmItmPrdctOrSrvCdgSys("[[");}
		if(claimitemproductorservicecoding.hasSystem()) {

			c.addClmItmPrdctOrSrvCdgSys(String.valueOf(claimitemproductorservicecoding.getSystem()));
		} else {
			c.addClmItmPrdctOrSrvCdgSys("NULL");
		}

		if(claimitemproductorservicecodingi == claimitemproductorservicecodinglist.size()-1) {c.addClmItmPrdctOrSrvCdgSys("]]");}


		 };
		/******************** claimitemprogramcode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> claimitemprogramcodelist = claimitem.getProgramCode();
		for(int claimitemprogramcodei = 0; claimitemprogramcodei<claimitemprogramcodelist.size();claimitemprogramcodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  claimitemprogramcode = claimitemprogramcodelist.get(claimitemprogramcodei);

		/******************** Clm_Itm_PrgrmCd_Txt ********************************************************************************/
		if(claimitemprogramcodei == 0) {c.addClmItmPrgrmCdTxt("[[");}
		if(claimitemprogramcode.hasText()) {

			c.addClmItmPrgrmCdTxt(String.valueOf(claimitemprogramcode.getText()));
		} else {
			c.addClmItmPrgrmCdTxt("NULL");
		}

		if(claimitemprogramcodei == claimitemprogramcodelist.size()-1) {c.addClmItmPrgrmCdTxt("]]");}


		/******************** claimitemprogramcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimitemprogramcodecodinglist = claimitemprogramcode.getCoding();
		for(int claimitemprogramcodecodingi = 0; claimitemprogramcodecodingi<claimitemprogramcodecodinglist.size();claimitemprogramcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimitemprogramcodecoding = claimitemprogramcodecodinglist.get(claimitemprogramcodecodingi);

		/******************** Clm_Itm_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(claimitemprogramcodecodingi == 0) {c.addClmItmPrgrmCdCdgDsply("[[[");}
		if(claimitemprogramcodecoding.hasDisplay()) {

			c.addClmItmPrgrmCdCdgDsply(String.valueOf(claimitemprogramcodecoding.getDisplay()));
		} else {
			c.addClmItmPrgrmCdCdgDsply("NULL");
		}

		if(claimitemprogramcodecodingi == claimitemprogramcodecodinglist.size()-1) {c.addClmItmPrgrmCdCdgDsply("]]]");}


		/******************** Clm_Itm_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(claimitemprogramcodecodingi == 0) {c.addClmItmPrgrmCdCdgVrsn("[[[");}
		if(claimitemprogramcodecoding.hasVersion()) {

			c.addClmItmPrgrmCdCdgVrsn(String.valueOf(claimitemprogramcodecoding.getVersion()));
		} else {
			c.addClmItmPrgrmCdCdgVrsn("NULL");
		}

		if(claimitemprogramcodecodingi == claimitemprogramcodecodinglist.size()-1) {c.addClmItmPrgrmCdCdgVrsn("]]]");}


		/******************** Clm_Itm_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(claimitemprogramcodecodingi == 0) {c.addClmItmPrgrmCdCdgCd("[[[");}
		if(claimitemprogramcodecoding.hasCode()) {

			c.addClmItmPrgrmCdCdgCd(String.valueOf(claimitemprogramcodecoding.getCode()));
		} else {
			c.addClmItmPrgrmCdCdgCd("NULL");
		}

		if(claimitemprogramcodecodingi == claimitemprogramcodecodinglist.size()-1) {c.addClmItmPrgrmCdCdgCd("]]]");}


		/******************** Clm_Itm_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(claimitemprogramcodecodingi == 0) {c.addClmItmPrgrmCdCdgUsrSltd("[[[");}
		if(claimitemprogramcodecoding.hasUserSelected()) {

			c.addClmItmPrgrmCdCdgUsrSltd(String.valueOf(claimitemprogramcodecoding.getUserSelected()));
		} else {
			c.addClmItmPrgrmCdCdgUsrSltd("NULL");
		}

		if(claimitemprogramcodecodingi == claimitemprogramcodecodinglist.size()-1) {c.addClmItmPrgrmCdCdgUsrSltd("]]]");}


		/******************** Clm_Itm_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(claimitemprogramcodecodingi == 0) {c.addClmItmPrgrmCdCdgSys("[[[");}
		if(claimitemprogramcodecoding.hasSystem()) {

			c.addClmItmPrgrmCdCdgSys(String.valueOf(claimitemprogramcodecoding.getSystem()));
		} else {
			c.addClmItmPrgrmCdCdgSys("NULL");
		}

		if(claimitemprogramcodecodingi == claimitemprogramcodecodinglist.size()-1) {c.addClmItmPrgrmCdCdgSys("]]]");}


		 };
		 };
		/******************** claimitemsubsite ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> claimitemsubsitelist = claimitem.getSubSite();
		for(int claimitemsubsitei = 0; claimitemsubsitei<claimitemsubsitelist.size();claimitemsubsitei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  claimitemsubsite = claimitemsubsitelist.get(claimitemsubsitei);

		/******************** Clm_Itm_SubSite_Txt ********************************************************************************/
		if(claimitemsubsitei == 0) {c.addClmItmSubSiteTxt("[[");}
		if(claimitemsubsite.hasText()) {

			c.addClmItmSubSiteTxt(String.valueOf(claimitemsubsite.getText()));
		} else {
			c.addClmItmSubSiteTxt("NULL");
		}

		if(claimitemsubsitei == claimitemsubsitelist.size()-1) {c.addClmItmSubSiteTxt("]]");}


		/******************** claimitemsubsitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimitemsubsitecodinglist = claimitemsubsite.getCoding();
		for(int claimitemsubsitecodingi = 0; claimitemsubsitecodingi<claimitemsubsitecodinglist.size();claimitemsubsitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimitemsubsitecoding = claimitemsubsitecodinglist.get(claimitemsubsitecodingi);

		/******************** Clm_Itm_SubSite_Cdg_Dsply ********************************************************************************/
		if(claimitemsubsitecodingi == 0) {c.addClmItmSubSiteCdgDsply("[[[");}
		if(claimitemsubsitecoding.hasDisplay()) {

			c.addClmItmSubSiteCdgDsply(String.valueOf(claimitemsubsitecoding.getDisplay()));
		} else {
			c.addClmItmSubSiteCdgDsply("NULL");
		}

		if(claimitemsubsitecodingi == claimitemsubsitecodinglist.size()-1) {c.addClmItmSubSiteCdgDsply("]]]");}


		/******************** Clm_Itm_SubSite_Cdg_Vrsn ********************************************************************************/
		if(claimitemsubsitecodingi == 0) {c.addClmItmSubSiteCdgVrsn("[[[");}
		if(claimitemsubsitecoding.hasVersion()) {

			c.addClmItmSubSiteCdgVrsn(String.valueOf(claimitemsubsitecoding.getVersion()));
		} else {
			c.addClmItmSubSiteCdgVrsn("NULL");
		}

		if(claimitemsubsitecodingi == claimitemsubsitecodinglist.size()-1) {c.addClmItmSubSiteCdgVrsn("]]]");}


		/******************** Clm_Itm_SubSite_Cdg_Cd ********************************************************************************/
		if(claimitemsubsitecodingi == 0) {c.addClmItmSubSiteCdgCd("[[[");}
		if(claimitemsubsitecoding.hasCode()) {

			c.addClmItmSubSiteCdgCd(String.valueOf(claimitemsubsitecoding.getCode()));
		} else {
			c.addClmItmSubSiteCdgCd("NULL");
		}

		if(claimitemsubsitecodingi == claimitemsubsitecodinglist.size()-1) {c.addClmItmSubSiteCdgCd("]]]");}


		/******************** Clm_Itm_SubSite_Cdg_UsrSltd ********************************************************************************/
		if(claimitemsubsitecodingi == 0) {c.addClmItmSubSiteCdgUsrSltd("[[[");}
		if(claimitemsubsitecoding.hasUserSelected()) {

			c.addClmItmSubSiteCdgUsrSltd(String.valueOf(claimitemsubsitecoding.getUserSelected()));
		} else {
			c.addClmItmSubSiteCdgUsrSltd("NULL");
		}

		if(claimitemsubsitecodingi == claimitemsubsitecodinglist.size()-1) {c.addClmItmSubSiteCdgUsrSltd("]]]");}


		/******************** Clm_Itm_SubSite_Cdg_Sys ********************************************************************************/
		if(claimitemsubsitecodingi == 0) {c.addClmItmSubSiteCdgSys("[[[");}
		if(claimitemsubsitecoding.hasSystem()) {

			c.addClmItmSubSiteCdgSys(String.valueOf(claimitemsubsitecoding.getSystem()));
		} else {
			c.addClmItmSubSiteCdgSys("NULL");
		}

		if(claimitemsubsitecodingi == claimitemsubsitecodinglist.size()-1) {c.addClmItmSubSiteCdgSys("]]]");}


		 };
		 };
		/******************** claimitemrevenue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemrevenue = claimitem.getRevenue();

		/******************** Clm_Itm_Revenue_Txt ********************************************************************************/
		if(claimitemrevenue.hasText()) {

			c.addClmItmRevenueTxt(String.valueOf(claimitemrevenue.getText()));
		} else {
			c.addClmItmRevenueTxt("NULL");
		}


		/******************** claimitemrevenuecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimitemrevenuecodinglist = claimitemrevenue.getCoding();
		for(int claimitemrevenuecodingi = 0; claimitemrevenuecodingi<claimitemrevenuecodinglist.size();claimitemrevenuecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimitemrevenuecoding = claimitemrevenuecodinglist.get(claimitemrevenuecodingi);

		/******************** Clm_Itm_Revenue_Cdg_Dsply ********************************************************************************/
		if(claimitemrevenuecodingi == 0) {c.addClmItmRevenueCdgDsply("[[");}
		if(claimitemrevenuecoding.hasDisplay()) {

			c.addClmItmRevenueCdgDsply(String.valueOf(claimitemrevenuecoding.getDisplay()));
		} else {
			c.addClmItmRevenueCdgDsply("NULL");
		}

		if(claimitemrevenuecodingi == claimitemrevenuecodinglist.size()-1) {c.addClmItmRevenueCdgDsply("]]");}


		/******************** Clm_Itm_Revenue_Cdg_Vrsn ********************************************************************************/
		if(claimitemrevenuecodingi == 0) {c.addClmItmRevenueCdgVrsn("[[");}
		if(claimitemrevenuecoding.hasVersion()) {

			c.addClmItmRevenueCdgVrsn(String.valueOf(claimitemrevenuecoding.getVersion()));
		} else {
			c.addClmItmRevenueCdgVrsn("NULL");
		}

		if(claimitemrevenuecodingi == claimitemrevenuecodinglist.size()-1) {c.addClmItmRevenueCdgVrsn("]]");}


		/******************** Clm_Itm_Revenue_Cdg_Cd ********************************************************************************/
		if(claimitemrevenuecodingi == 0) {c.addClmItmRevenueCdgCd("[[");}
		if(claimitemrevenuecoding.hasCode()) {

			c.addClmItmRevenueCdgCd(String.valueOf(claimitemrevenuecoding.getCode()));
		} else {
			c.addClmItmRevenueCdgCd("NULL");
		}

		if(claimitemrevenuecodingi == claimitemrevenuecodinglist.size()-1) {c.addClmItmRevenueCdgCd("]]");}


		/******************** Clm_Itm_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(claimitemrevenuecodingi == 0) {c.addClmItmRevenueCdgUsrSltd("[[");}
		if(claimitemrevenuecoding.hasUserSelected()) {

			c.addClmItmRevenueCdgUsrSltd(String.valueOf(claimitemrevenuecoding.getUserSelected()));
		} else {
			c.addClmItmRevenueCdgUsrSltd("NULL");
		}

		if(claimitemrevenuecodingi == claimitemrevenuecodinglist.size()-1) {c.addClmItmRevenueCdgUsrSltd("]]");}


		/******************** Clm_Itm_Revenue_Cdg_Sys ********************************************************************************/
		if(claimitemrevenuecodingi == 0) {c.addClmItmRevenueCdgSys("[[");}
		if(claimitemrevenuecoding.hasSystem()) {

			c.addClmItmRevenueCdgSys(String.valueOf(claimitemrevenuecoding.getSystem()));
		} else {
			c.addClmItmRevenueCdgSys("NULL");
		}

		if(claimitemrevenuecodingi == claimitemrevenuecodinglist.size()-1) {c.addClmItmRevenueCdgSys("]]");}


		 };
		/******************** Clm_Itm_Udi ********************************************************************************/
		if(claimitem.hasUdi()) {

			String  array = "[";
			for(int incr=0; incr<claimitem.getUdi().size(); incr++) {
				array = array + claimitem.getUdi().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmItmUdi(array);

		} else {
			c.addClmItmUdi("NULL");
		}


		/******************** claimitemlocationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address claimitemlocationaddress = claimitem.getLocationAddress();

		/******************** Clm_Itm_LctnAddr_State ********************************************************************************/
		if(claimitemlocationaddress.hasState()) {

			c.addClmItmLctnAddrState(String.valueOf(claimitemlocationaddress.getState()));
		} else {
			c.addClmItmLctnAddrState("NULL");
		}


		/******************** claimitemlocationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType claimitemlocationaddresstype = claimitemlocationaddress.getType();
		if(claimitemlocationaddresstype!=null) {
			c.addClmItmLctnAddrTyp(claimitemlocationaddresstype.toCode());
		} else {
			c.addClmItmLctnAddrTyp("NULL");
		}

		/******************** Clm_Itm_LctnAddr_Cntry ********************************************************************************/
		if(claimitemlocationaddress.hasCountry()) {

			c.addClmItmLctnAddrCntry(String.valueOf(claimitemlocationaddress.getCountry()));
		} else {
			c.addClmItmLctnAddrCntry("NULL");
		}


		/******************** claimitemlocationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimitemlocationaddressperiod = claimitemlocationaddress.getPeriod();

		/******************** Clm_Itm_LctnAddr_Prd_Strt ********************************************************************************/
		if(claimitemlocationaddressperiod.hasStart()) {

			c.addClmItmLctnAddrPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimitemlocationaddressperiod.getStart())+"\"");
		} else {
			c.addClmItmLctnAddrPrdStrt("NULL");
		}


		/******************** Clm_Itm_LctnAddr_Prd_End ********************************************************************************/
		if(claimitemlocationaddressperiod.hasEnd()) {

			c.addClmItmLctnAddrPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimitemlocationaddressperiod.getEnd())+"\"");
		} else {
			c.addClmItmLctnAddrPrdEnd("NULL");
		}


		/******************** Clm_Itm_LctnAddr_District ********************************************************************************/
		if(claimitemlocationaddress.hasDistrict()) {

			c.addClmItmLctnAddrDistrict(String.valueOf(claimitemlocationaddress.getDistrict()));
		} else {
			c.addClmItmLctnAddrDistrict("NULL");
		}


		/******************** Clm_Itm_LctnAddr_PostalCd ********************************************************************************/
		if(claimitemlocationaddress.hasPostalCode()) {

			c.addClmItmLctnAddrPostalCd(String.valueOf(claimitemlocationaddress.getPostalCode()));
		} else {
			c.addClmItmLctnAddrPostalCd("NULL");
		}


		/******************** Clm_Itm_LctnAddr_Line ********************************************************************************/
		if(claimitemlocationaddress.hasLine()) {

			String  array = "[";
			for(int incr=0; incr<claimitemlocationaddress.getLine().size(); incr++) {
				array = array + claimitemlocationaddress.getLine().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmItmLctnAddrLine(array);

		} else {
			c.addClmItmLctnAddrLine("NULL");
		}


		/******************** Clm_Itm_LctnAddr_City ********************************************************************************/
		if(claimitemlocationaddress.hasCity()) {

			c.addClmItmLctnAddrCity(String.valueOf(claimitemlocationaddress.getCity()));
		} else {
			c.addClmItmLctnAddrCity("NULL");
		}


		/******************** claimitemlocationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse claimitemlocationaddressuse = claimitemlocationaddress.getUse();
		if(claimitemlocationaddressuse!=null) {
			c.addClmItmLctnAddrUse(claimitemlocationaddressuse.toCode());
		} else {
			c.addClmItmLctnAddrUse("NULL");
		}

		/******************** Clm_Itm_LctnAddr_Txt ********************************************************************************/
		if(claimitemlocationaddress.hasText()) {

			c.addClmItmLctnAddrTxt(String.valueOf(claimitemlocationaddress.getText()));
		} else {
			c.addClmItmLctnAddrTxt("NULL");
		}


		/******************** Clm_Itm_LctnRfrnc ********************************************************************************/
		if(claimitem.hasLocationReference()) {

			if(claimitem.getLocationReference().getReference() != null) {
			c.addClmItmLctnRfrnc(claimitem.getLocationReference().getReference());
			}
		} else {
			c.addClmItmLctnRfrnc("NULL");
		}


		 };
		/******************** claimstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.ClaimStatus claimstatus = claim.getStatus();
		if(claimstatus!=null) {
			c.addClmSts(claimstatus.toCode());
		} else {
			c.addClmSts("NULL");
		}

		/******************** Clm_Created ********************************************************************************/
		if(claim.hasCreated()) {

			c.addClmCreated("\""+ca.uhn.fhir.util.DateUtils.formatDate(claim.getCreated())+"\"");
		} else {
			c.addClmCreated("NULL");
		}


		/******************** claimidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> claimidentifierlist = claim.getIdentifier();
		for(int claimidentifieri = 0; claimidentifieri<claimidentifierlist.size();claimidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  claimidentifier = claimidentifierlist.get(claimidentifieri);

		/******************** Clm_Id_Vl ********************************************************************************/
		if(claimidentifieri == 0) {c.addClmIdVl("[");}
		if(claimidentifier.hasValue()) {

			c.addClmIdVl(String.valueOf(claimidentifier.getValue()));
		} else {
			c.addClmIdVl("NULL");
		}

		if(claimidentifieri == claimidentifierlist.size()-1) {c.addClmIdVl("]");}


		/******************** claimidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimidentifiertype = claimidentifier.getType();

		/******************** Clm_Id_Typ_Txt ********************************************************************************/
		if(claimidentifieri == 0) {c.addClmIdTypTxt("[");}
		if(claimidentifiertype.hasText()) {

			c.addClmIdTypTxt(String.valueOf(claimidentifiertype.getText()));
		} else {
			c.addClmIdTypTxt("NULL");
		}

		if(claimidentifieri == claimidentifierlist.size()-1) {c.addClmIdTypTxt("]");}


		/******************** claimidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimidentifiertypecodinglist = claimidentifiertype.getCoding();
		for(int claimidentifiertypecodingi = 0; claimidentifiertypecodingi<claimidentifiertypecodinglist.size();claimidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimidentifiertypecoding = claimidentifiertypecodinglist.get(claimidentifiertypecodingi);

		/******************** Clm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(claimidentifiertypecodingi == 0) {c.addClmIdTypCdgDsply("[[");}
		if(claimidentifiertypecoding.hasDisplay()) {

			c.addClmIdTypCdgDsply(String.valueOf(claimidentifiertypecoding.getDisplay()));
		} else {
			c.addClmIdTypCdgDsply("NULL");
		}

		if(claimidentifiertypecodingi == claimidentifiertypecodinglist.size()-1) {c.addClmIdTypCdgDsply("]]");}


		/******************** Clm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimidentifiertypecodingi == 0) {c.addClmIdTypCdgVrsn("[[");}
		if(claimidentifiertypecoding.hasVersion()) {

			c.addClmIdTypCdgVrsn(String.valueOf(claimidentifiertypecoding.getVersion()));
		} else {
			c.addClmIdTypCdgVrsn("NULL");
		}

		if(claimidentifiertypecodingi == claimidentifiertypecodinglist.size()-1) {c.addClmIdTypCdgVrsn("]]");}


		/******************** Clm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(claimidentifiertypecodingi == 0) {c.addClmIdTypCdgCd("[[");}
		if(claimidentifiertypecoding.hasCode()) {

			c.addClmIdTypCdgCd(String.valueOf(claimidentifiertypecoding.getCode()));
		} else {
			c.addClmIdTypCdgCd("NULL");
		}

		if(claimidentifiertypecodingi == claimidentifiertypecodinglist.size()-1) {c.addClmIdTypCdgCd("]]");}


		/******************** Clm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimidentifiertypecodingi == 0) {c.addClmIdTypCdgUsrSltd("[[");}
		if(claimidentifiertypecoding.hasUserSelected()) {

			c.addClmIdTypCdgUsrSltd(String.valueOf(claimidentifiertypecoding.getUserSelected()));
		} else {
			c.addClmIdTypCdgUsrSltd("NULL");
		}

		if(claimidentifiertypecodingi == claimidentifiertypecodinglist.size()-1) {c.addClmIdTypCdgUsrSltd("]]");}


		/******************** Clm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(claimidentifiertypecodingi == 0) {c.addClmIdTypCdgSys("[[");}
		if(claimidentifiertypecoding.hasSystem()) {

			c.addClmIdTypCdgSys(String.valueOf(claimidentifiertypecoding.getSystem()));
		} else {
			c.addClmIdTypCdgSys("NULL");
		}

		if(claimidentifiertypecodingi == claimidentifiertypecodinglist.size()-1) {c.addClmIdTypCdgSys("]]");}


		 };
		/******************** claimidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimidentifierperiod = claimidentifier.getPeriod();

		/******************** Clm_Id_Prd_Strt ********************************************************************************/
		if(claimidentifieri == 0) {c.addClmIdPrdStrt("[");}
		if(claimidentifierperiod.hasStart()) {

			c.addClmIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimidentifierperiod.getStart())+"\"");
		} else {
			c.addClmIdPrdStrt("NULL");
		}

		if(claimidentifieri == claimidentifierlist.size()-1) {c.addClmIdPrdStrt("]");}


		/******************** Clm_Id_Prd_End ********************************************************************************/
		if(claimidentifieri == 0) {c.addClmIdPrdEnd("[");}
		if(claimidentifierperiod.hasEnd()) {

			c.addClmIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimidentifierperiod.getEnd())+"\"");
		} else {
			c.addClmIdPrdEnd("NULL");
		}

		if(claimidentifieri == claimidentifierlist.size()-1) {c.addClmIdPrdEnd("]");}


		/******************** claimidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse claimidentifieruse = claimidentifier.getUse();
		if(claimidentifieruse!=null) {
		if(claimidentifieri == 0) {

		c.addClmIdUse("[");		}
			c.addClmIdUse(claimidentifieruse.toCode());
		if(claimidentifieri == claimidentifierlist.size()-1) {

		c.addClmIdUse("]");		}

		} else {
			c.addClmIdUse("NULL");
		}

		/******************** Clm_Id_Assigner ********************************************************************************/
		if(claimidentifieri == 0) {c.addClmIdAssigner("[");}
		if(claimidentifier.hasAssigner()) {

			if(claimidentifier.getAssigner().getReference() != null) {
			c.addClmIdAssigner(claimidentifier.getAssigner().getReference());
			}
		} else {
			c.addClmIdAssigner("NULL");
		}

		if(claimidentifieri == claimidentifierlist.size()-1) {c.addClmIdAssigner("]");}


		/******************** Clm_Id_Sys ********************************************************************************/
		if(claimidentifieri == 0) {c.addClmIdSys("[");}
		if(claimidentifier.hasSystem()) {

			c.addClmIdSys(String.valueOf(claimidentifier.getSystem()));
		} else {
			c.addClmIdSys("NULL");
		}

		if(claimidentifieri == claimidentifierlist.size()-1) {c.addClmIdSys("]");}


		 };
		/******************** claimrelated ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Claim.RelatedClaimComponent> claimrelatedlist = claim.getRelated();
		for(int claimrelatedi = 0; claimrelatedi<claimrelatedlist.size();claimrelatedi++ ) {
		org.hl7.fhir.r4.model.Claim.RelatedClaimComponent  claimrelated = claimrelatedlist.get(claimrelatedi);

		/******************** claimrelatedreference ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier claimrelatedreference = claimrelated.getReference();

		/******************** Clm_Rlted_Rfrnc_Vl ********************************************************************************/
		if(claimrelatedi == 0) {c.addClmRltedRfrncVl("[");}
		if(claimrelatedreference.hasValue()) {

			c.addClmRltedRfrncVl(String.valueOf(claimrelatedreference.getValue()));
		} else {
			c.addClmRltedRfrncVl("NULL");
		}

		if(claimrelatedi == claimrelatedlist.size()-1) {c.addClmRltedRfrncVl("]");}


		/******************** claimrelatedreferencetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimrelatedreferencetype = claimrelatedreference.getType();

		/******************** Clm_Rlted_Rfrnc_Typ_Txt ********************************************************************************/
		if(claimrelatedi == 0) {c.addClmRltedRfrncTypTxt("[");}
		if(claimrelatedreferencetype.hasText()) {

			c.addClmRltedRfrncTypTxt(String.valueOf(claimrelatedreferencetype.getText()));
		} else {
			c.addClmRltedRfrncTypTxt("NULL");
		}

		if(claimrelatedi == claimrelatedlist.size()-1) {c.addClmRltedRfrncTypTxt("]");}


		/******************** claimrelatedreferencetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimrelatedreferencetypecodinglist = claimrelatedreferencetype.getCoding();
		for(int claimrelatedreferencetypecodingi = 0; claimrelatedreferencetypecodingi<claimrelatedreferencetypecodinglist.size();claimrelatedreferencetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimrelatedreferencetypecoding = claimrelatedreferencetypecodinglist.get(claimrelatedreferencetypecodingi);

		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_Dsply ********************************************************************************/
		if(claimrelatedreferencetypecodingi == 0) {c.addClmRltedRfrncTypCdgDsply("[[");}
		if(claimrelatedreferencetypecoding.hasDisplay()) {

			c.addClmRltedRfrncTypCdgDsply(String.valueOf(claimrelatedreferencetypecoding.getDisplay()));
		} else {
			c.addClmRltedRfrncTypCdgDsply("NULL");
		}

		if(claimrelatedreferencetypecodingi == claimrelatedreferencetypecodinglist.size()-1) {c.addClmRltedRfrncTypCdgDsply("]]");}


		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimrelatedreferencetypecodingi == 0) {c.addClmRltedRfrncTypCdgVrsn("[[");}
		if(claimrelatedreferencetypecoding.hasVersion()) {

			c.addClmRltedRfrncTypCdgVrsn(String.valueOf(claimrelatedreferencetypecoding.getVersion()));
		} else {
			c.addClmRltedRfrncTypCdgVrsn("NULL");
		}

		if(claimrelatedreferencetypecodingi == claimrelatedreferencetypecodinglist.size()-1) {c.addClmRltedRfrncTypCdgVrsn("]]");}


		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_Cd ********************************************************************************/
		if(claimrelatedreferencetypecodingi == 0) {c.addClmRltedRfrncTypCdgCd("[[");}
		if(claimrelatedreferencetypecoding.hasCode()) {

			c.addClmRltedRfrncTypCdgCd(String.valueOf(claimrelatedreferencetypecoding.getCode()));
		} else {
			c.addClmRltedRfrncTypCdgCd("NULL");
		}

		if(claimrelatedreferencetypecodingi == claimrelatedreferencetypecodinglist.size()-1) {c.addClmRltedRfrncTypCdgCd("]]");}


		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimrelatedreferencetypecodingi == 0) {c.addClmRltedRfrncTypCdgUsrSltd("[[");}
		if(claimrelatedreferencetypecoding.hasUserSelected()) {

			c.addClmRltedRfrncTypCdgUsrSltd(String.valueOf(claimrelatedreferencetypecoding.getUserSelected()));
		} else {
			c.addClmRltedRfrncTypCdgUsrSltd("NULL");
		}

		if(claimrelatedreferencetypecodingi == claimrelatedreferencetypecodinglist.size()-1) {c.addClmRltedRfrncTypCdgUsrSltd("]]");}


		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_Sys ********************************************************************************/
		if(claimrelatedreferencetypecodingi == 0) {c.addClmRltedRfrncTypCdgSys("[[");}
		if(claimrelatedreferencetypecoding.hasSystem()) {

			c.addClmRltedRfrncTypCdgSys(String.valueOf(claimrelatedreferencetypecoding.getSystem()));
		} else {
			c.addClmRltedRfrncTypCdgSys("NULL");
		}

		if(claimrelatedreferencetypecodingi == claimrelatedreferencetypecodinglist.size()-1) {c.addClmRltedRfrncTypCdgSys("]]");}


		 };
		/******************** claimrelatedreferenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimrelatedreferenceperiod = claimrelatedreference.getPeriod();

		/******************** Clm_Rlted_Rfrnc_Prd_Strt ********************************************************************************/
		if(claimrelatedi == 0) {c.addClmRltedRfrncPrdStrt("[");}
		if(claimrelatedreferenceperiod.hasStart()) {

			c.addClmRltedRfrncPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimrelatedreferenceperiod.getStart())+"\"");
		} else {
			c.addClmRltedRfrncPrdStrt("NULL");
		}

		if(claimrelatedi == claimrelatedlist.size()-1) {c.addClmRltedRfrncPrdStrt("]");}


		/******************** Clm_Rlted_Rfrnc_Prd_End ********************************************************************************/
		if(claimrelatedi == 0) {c.addClmRltedRfrncPrdEnd("[");}
		if(claimrelatedreferenceperiod.hasEnd()) {

			c.addClmRltedRfrncPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimrelatedreferenceperiod.getEnd())+"\"");
		} else {
			c.addClmRltedRfrncPrdEnd("NULL");
		}

		if(claimrelatedi == claimrelatedlist.size()-1) {c.addClmRltedRfrncPrdEnd("]");}


		/******************** claimrelatedreferenceuse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse claimrelatedreferenceuse = claimrelatedreference.getUse();
		if(claimrelatedreferenceuse!=null) {
		if(claimrelatedi == 0) {

		c.addClmRltedRfrncUse("[");		}
			c.addClmRltedRfrncUse(claimrelatedreferenceuse.toCode());
		if(claimrelatedi == claimrelatedlist.size()-1) {

		c.addClmRltedRfrncUse("]");		}

		} else {
			c.addClmRltedRfrncUse("NULL");
		}

		/******************** Clm_Rlted_Rfrnc_Assigner ********************************************************************************/
		if(claimrelatedi == 0) {c.addClmRltedRfrncAssigner("[");}
		if(claimrelatedreference.hasAssigner()) {

			if(claimrelatedreference.getAssigner().getReference() != null) {
			c.addClmRltedRfrncAssigner(claimrelatedreference.getAssigner().getReference());
			}
		} else {
			c.addClmRltedRfrncAssigner("NULL");
		}

		if(claimrelatedi == claimrelatedlist.size()-1) {c.addClmRltedRfrncAssigner("]");}


		/******************** Clm_Rlted_Rfrnc_Sys ********************************************************************************/
		if(claimrelatedi == 0) {c.addClmRltedRfrncSys("[");}
		if(claimrelatedreference.hasSystem()) {

			c.addClmRltedRfrncSys(String.valueOf(claimrelatedreference.getSystem()));
		} else {
			c.addClmRltedRfrncSys("NULL");
		}

		if(claimrelatedi == claimrelatedlist.size()-1) {c.addClmRltedRfrncSys("]");}


		/******************** Clm_Rlted_Clm ********************************************************************************/
		if(claimrelatedi == 0) {c.addClmRltedClm("[");}
		if(claimrelated.hasClaim()) {

			if(claimrelated.getClaim().getReference() != null) {
			c.addClmRltedClm(claimrelated.getClaim().getReference());
			}
		} else {
			c.addClmRltedClm("NULL");
		}

		if(claimrelatedi == claimrelatedlist.size()-1) {c.addClmRltedClm("]");}


		/******************** claimrelatedrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimrelatedrelationship = claimrelated.getRelationship();

		/******************** Clm_Rlted_Rltnship_Txt ********************************************************************************/
		if(claimrelatedi == 0) {c.addClmRltedRltnshipTxt("[");}
		if(claimrelatedrelationship.hasText()) {

			c.addClmRltedRltnshipTxt(String.valueOf(claimrelatedrelationship.getText()));
		} else {
			c.addClmRltedRltnshipTxt("NULL");
		}

		if(claimrelatedi == claimrelatedlist.size()-1) {c.addClmRltedRltnshipTxt("]");}


		/******************** claimrelatedrelationshipcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimrelatedrelationshipcodinglist = claimrelatedrelationship.getCoding();
		for(int claimrelatedrelationshipcodingi = 0; claimrelatedrelationshipcodingi<claimrelatedrelationshipcodinglist.size();claimrelatedrelationshipcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimrelatedrelationshipcoding = claimrelatedrelationshipcodinglist.get(claimrelatedrelationshipcodingi);

		/******************** Clm_Rlted_Rltnship_Cdg_Dsply ********************************************************************************/
		if(claimrelatedrelationshipcodingi == 0) {c.addClmRltedRltnshipCdgDsply("[[");}
		if(claimrelatedrelationshipcoding.hasDisplay()) {

			c.addClmRltedRltnshipCdgDsply(String.valueOf(claimrelatedrelationshipcoding.getDisplay()));
		} else {
			c.addClmRltedRltnshipCdgDsply("NULL");
		}

		if(claimrelatedrelationshipcodingi == claimrelatedrelationshipcodinglist.size()-1) {c.addClmRltedRltnshipCdgDsply("]]");}


		/******************** Clm_Rlted_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(claimrelatedrelationshipcodingi == 0) {c.addClmRltedRltnshipCdgVrsn("[[");}
		if(claimrelatedrelationshipcoding.hasVersion()) {

			c.addClmRltedRltnshipCdgVrsn(String.valueOf(claimrelatedrelationshipcoding.getVersion()));
		} else {
			c.addClmRltedRltnshipCdgVrsn("NULL");
		}

		if(claimrelatedrelationshipcodingi == claimrelatedrelationshipcodinglist.size()-1) {c.addClmRltedRltnshipCdgVrsn("]]");}


		/******************** Clm_Rlted_Rltnship_Cdg_Cd ********************************************************************************/
		if(claimrelatedrelationshipcodingi == 0) {c.addClmRltedRltnshipCdgCd("[[");}
		if(claimrelatedrelationshipcoding.hasCode()) {

			c.addClmRltedRltnshipCdgCd(String.valueOf(claimrelatedrelationshipcoding.getCode()));
		} else {
			c.addClmRltedRltnshipCdgCd("NULL");
		}

		if(claimrelatedrelationshipcodingi == claimrelatedrelationshipcodinglist.size()-1) {c.addClmRltedRltnshipCdgCd("]]");}


		/******************** Clm_Rlted_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(claimrelatedrelationshipcodingi == 0) {c.addClmRltedRltnshipCdgUsrSltd("[[");}
		if(claimrelatedrelationshipcoding.hasUserSelected()) {

			c.addClmRltedRltnshipCdgUsrSltd(String.valueOf(claimrelatedrelationshipcoding.getUserSelected()));
		} else {
			c.addClmRltedRltnshipCdgUsrSltd("NULL");
		}

		if(claimrelatedrelationshipcodingi == claimrelatedrelationshipcodinglist.size()-1) {c.addClmRltedRltnshipCdgUsrSltd("]]");}


		/******************** Clm_Rlted_Rltnship_Cdg_Sys ********************************************************************************/
		if(claimrelatedrelationshipcodingi == 0) {c.addClmRltedRltnshipCdgSys("[[");}
		if(claimrelatedrelationshipcoding.hasSystem()) {

			c.addClmRltedRltnshipCdgSys(String.valueOf(claimrelatedrelationshipcoding.getSystem()));
		} else {
			c.addClmRltedRltnshipCdgSys("NULL");
		}

		if(claimrelatedrelationshipcodingi == claimrelatedrelationshipcodinglist.size()-1) {c.addClmRltedRltnshipCdgSys("]]");}


		 };
		 };
		/******************** claimuse ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.Use claimuse = claim.getUse();
		if(claimuse!=null) {
			c.addClmUse(claimuse.toCode());
		} else {
			c.addClmUse("NULL");
		}

		/******************** claimbillableperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimbillableperiod = claim.getBillablePeriod();

		/******************** Clm_BillablePrd_Strt ********************************************************************************/
		if(claimbillableperiod.hasStart()) {

			c.addClmBillablePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimbillableperiod.getStart())+"\"");
		} else {
			c.addClmBillablePrdStrt("NULL");
		}


		/******************** Clm_BillablePrd_End ********************************************************************************/
		if(claimbillableperiod.hasEnd()) {

			c.addClmBillablePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimbillableperiod.getEnd())+"\"");
		} else {
			c.addClmBillablePrdEnd("NULL");
		}


		/******************** claimfundsreserve ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimfundsreserve = claim.getFundsReserve();

		/******************** Clm_FundsReserve_Txt ********************************************************************************/
		if(claimfundsreserve.hasText()) {

			c.addClmFundsReserveTxt(String.valueOf(claimfundsreserve.getText()));
		} else {
			c.addClmFundsReserveTxt("NULL");
		}


		/******************** claimfundsreservecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimfundsreservecodinglist = claimfundsreserve.getCoding();
		for(int claimfundsreservecodingi = 0; claimfundsreservecodingi<claimfundsreservecodinglist.size();claimfundsreservecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimfundsreservecoding = claimfundsreservecodinglist.get(claimfundsreservecodingi);

		/******************** Clm_FundsReserve_Cdg_Dsply ********************************************************************************/
		if(claimfundsreservecodingi == 0) {c.addClmFundsReserveCdgDsply("[");}
		if(claimfundsreservecoding.hasDisplay()) {

			c.addClmFundsReserveCdgDsply(String.valueOf(claimfundsreservecoding.getDisplay()));
		} else {
			c.addClmFundsReserveCdgDsply("NULL");
		}

		if(claimfundsreservecodingi == claimfundsreservecodinglist.size()-1) {c.addClmFundsReserveCdgDsply("]");}


		/******************** Clm_FundsReserve_Cdg_Vrsn ********************************************************************************/
		if(claimfundsreservecodingi == 0) {c.addClmFundsReserveCdgVrsn("[");}
		if(claimfundsreservecoding.hasVersion()) {

			c.addClmFundsReserveCdgVrsn(String.valueOf(claimfundsreservecoding.getVersion()));
		} else {
			c.addClmFundsReserveCdgVrsn("NULL");
		}

		if(claimfundsreservecodingi == claimfundsreservecodinglist.size()-1) {c.addClmFundsReserveCdgVrsn("]");}


		/******************** Clm_FundsReserve_Cdg_Cd ********************************************************************************/
		if(claimfundsreservecodingi == 0) {c.addClmFundsReserveCdgCd("[");}
		if(claimfundsreservecoding.hasCode()) {

			c.addClmFundsReserveCdgCd(String.valueOf(claimfundsreservecoding.getCode()));
		} else {
			c.addClmFundsReserveCdgCd("NULL");
		}

		if(claimfundsreservecodingi == claimfundsreservecodinglist.size()-1) {c.addClmFundsReserveCdgCd("]");}


		/******************** Clm_FundsReserve_Cdg_UsrSltd ********************************************************************************/
		if(claimfundsreservecodingi == 0) {c.addClmFundsReserveCdgUsrSltd("[");}
		if(claimfundsreservecoding.hasUserSelected()) {

			c.addClmFundsReserveCdgUsrSltd(String.valueOf(claimfundsreservecoding.getUserSelected()));
		} else {
			c.addClmFundsReserveCdgUsrSltd("NULL");
		}

		if(claimfundsreservecodingi == claimfundsreservecodinglist.size()-1) {c.addClmFundsReserveCdgUsrSltd("]");}


		/******************** Clm_FundsReserve_Cdg_Sys ********************************************************************************/
		if(claimfundsreservecodingi == 0) {c.addClmFundsReserveCdgSys("[");}
		if(claimfundsreservecoding.hasSystem()) {

			c.addClmFundsReserveCdgSys(String.valueOf(claimfundsreservecoding.getSystem()));
		} else {
			c.addClmFundsReserveCdgSys("NULL");
		}

		if(claimfundsreservecodingi == claimfundsreservecodinglist.size()-1) {c.addClmFundsReserveCdgSys("]");}


		 };
		/******************** Clm_Prescription ********************************************************************************/
		if(claim.hasPrescription()) {

			if(claim.getPrescription().getReference() != null) {
			c.addClmPrescription(claim.getPrescription().getReference());
			}
		} else {
			c.addClmPrescription("NULL");
		}


		/******************** Clm_Referral ********************************************************************************/
		if(claim.hasReferral()) {

			if(claim.getReferral().getReference() != null) {
			c.addClmReferral(claim.getReferral().getReference());
			}
		} else {
			c.addClmReferral("NULL");
		}


		/******************** claimcareteam ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Claim.CareTeamComponent> claimcareteamlist = claim.getCareTeam();
		for(int claimcareteami = 0; claimcareteami<claimcareteamlist.size();claimcareteami++ ) {
		org.hl7.fhir.r4.model.Claim.CareTeamComponent  claimcareteam = claimcareteamlist.get(claimcareteami);

		/******************** Clm_CareTeam_Provider ********************************************************************************/
		if(claimcareteami == 0) {c.addClmCareTeamProvider("[");}
		if(claimcareteam.hasProvider()) {

			if(claimcareteam.getProvider().getReference() != null) {
			c.addClmCareTeamProvider(claimcareteam.getProvider().getReference());
			}
		} else {
			c.addClmCareTeamProvider("NULL");
		}

		if(claimcareteami == claimcareteamlist.size()-1) {c.addClmCareTeamProvider("]");}


		/******************** claimcareteamrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimcareteamrole = claimcareteam.getRole();

		/******************** Clm_CareTeam_Role_Txt ********************************************************************************/
		if(claimcareteami == 0) {c.addClmCareTeamRoleTxt("[");}
		if(claimcareteamrole.hasText()) {

			c.addClmCareTeamRoleTxt(String.valueOf(claimcareteamrole.getText()));
		} else {
			c.addClmCareTeamRoleTxt("NULL");
		}

		if(claimcareteami == claimcareteamlist.size()-1) {c.addClmCareTeamRoleTxt("]");}


		/******************** claimcareteamrolecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimcareteamrolecodinglist = claimcareteamrole.getCoding();
		for(int claimcareteamrolecodingi = 0; claimcareteamrolecodingi<claimcareteamrolecodinglist.size();claimcareteamrolecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimcareteamrolecoding = claimcareteamrolecodinglist.get(claimcareteamrolecodingi);

		/******************** Clm_CareTeam_Role_Cdg_Dsply ********************************************************************************/
		if(claimcareteamrolecodingi == 0) {c.addClmCareTeamRoleCdgDsply("[[");}
		if(claimcareteamrolecoding.hasDisplay()) {

			c.addClmCareTeamRoleCdgDsply(String.valueOf(claimcareteamrolecoding.getDisplay()));
		} else {
			c.addClmCareTeamRoleCdgDsply("NULL");
		}

		if(claimcareteamrolecodingi == claimcareteamrolecodinglist.size()-1) {c.addClmCareTeamRoleCdgDsply("]]");}


		/******************** Clm_CareTeam_Role_Cdg_Vrsn ********************************************************************************/
		if(claimcareteamrolecodingi == 0) {c.addClmCareTeamRoleCdgVrsn("[[");}
		if(claimcareteamrolecoding.hasVersion()) {

			c.addClmCareTeamRoleCdgVrsn(String.valueOf(claimcareteamrolecoding.getVersion()));
		} else {
			c.addClmCareTeamRoleCdgVrsn("NULL");
		}

		if(claimcareteamrolecodingi == claimcareteamrolecodinglist.size()-1) {c.addClmCareTeamRoleCdgVrsn("]]");}


		/******************** Clm_CareTeam_Role_Cdg_Cd ********************************************************************************/
		if(claimcareteamrolecodingi == 0) {c.addClmCareTeamRoleCdgCd("[[");}
		if(claimcareteamrolecoding.hasCode()) {

			c.addClmCareTeamRoleCdgCd(String.valueOf(claimcareteamrolecoding.getCode()));
		} else {
			c.addClmCareTeamRoleCdgCd("NULL");
		}

		if(claimcareteamrolecodingi == claimcareteamrolecodinglist.size()-1) {c.addClmCareTeamRoleCdgCd("]]");}


		/******************** Clm_CareTeam_Role_Cdg_UsrSltd ********************************************************************************/
		if(claimcareteamrolecodingi == 0) {c.addClmCareTeamRoleCdgUsrSltd("[[");}
		if(claimcareteamrolecoding.hasUserSelected()) {

			c.addClmCareTeamRoleCdgUsrSltd(String.valueOf(claimcareteamrolecoding.getUserSelected()));
		} else {
			c.addClmCareTeamRoleCdgUsrSltd("NULL");
		}

		if(claimcareteamrolecodingi == claimcareteamrolecodinglist.size()-1) {c.addClmCareTeamRoleCdgUsrSltd("]]");}


		/******************** Clm_CareTeam_Role_Cdg_Sys ********************************************************************************/
		if(claimcareteamrolecodingi == 0) {c.addClmCareTeamRoleCdgSys("[[");}
		if(claimcareteamrolecoding.hasSystem()) {

			c.addClmCareTeamRoleCdgSys(String.valueOf(claimcareteamrolecoding.getSystem()));
		} else {
			c.addClmCareTeamRoleCdgSys("NULL");
		}

		if(claimcareteamrolecodingi == claimcareteamrolecodinglist.size()-1) {c.addClmCareTeamRoleCdgSys("]]");}


		 };
		/******************** Clm_CareTeam_Sqnc ********************************************************************************/
		if(claimcareteami == 0) {c.addClmCareTeamSqnc("[");}
		if(claimcareteam.hasSequence()) {

			c.addClmCareTeamSqnc(String.valueOf(claimcareteam.getSequence()));
		} else {
			c.addClmCareTeamSqnc("NULL");
		}

		if(claimcareteami == claimcareteamlist.size()-1) {c.addClmCareTeamSqnc("]");}


		/******************** claimcareteamqualification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimcareteamqualification = claimcareteam.getQualification();

		/******************** Clm_CareTeam_Qualification_Txt ********************************************************************************/
		if(claimcareteami == 0) {c.addClmCareTeamQualificationTxt("[");}
		if(claimcareteamqualification.hasText()) {

			c.addClmCareTeamQualificationTxt(String.valueOf(claimcareteamqualification.getText()));
		} else {
			c.addClmCareTeamQualificationTxt("NULL");
		}

		if(claimcareteami == claimcareteamlist.size()-1) {c.addClmCareTeamQualificationTxt("]");}


		/******************** claimcareteamqualificationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimcareteamqualificationcodinglist = claimcareteamqualification.getCoding();
		for(int claimcareteamqualificationcodingi = 0; claimcareteamqualificationcodingi<claimcareteamqualificationcodinglist.size();claimcareteamqualificationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimcareteamqualificationcoding = claimcareteamqualificationcodinglist.get(claimcareteamqualificationcodingi);

		/******************** Clm_CareTeam_Qualification_Cdg_Dsply ********************************************************************************/
		if(claimcareteamqualificationcodingi == 0) {c.addClmCareTeamQualificationCdgDsply("[[");}
		if(claimcareteamqualificationcoding.hasDisplay()) {

			c.addClmCareTeamQualificationCdgDsply(String.valueOf(claimcareteamqualificationcoding.getDisplay()));
		} else {
			c.addClmCareTeamQualificationCdgDsply("NULL");
		}

		if(claimcareteamqualificationcodingi == claimcareteamqualificationcodinglist.size()-1) {c.addClmCareTeamQualificationCdgDsply("]]");}


		/******************** Clm_CareTeam_Qualification_Cdg_Vrsn ********************************************************************************/
		if(claimcareteamqualificationcodingi == 0) {c.addClmCareTeamQualificationCdgVrsn("[[");}
		if(claimcareteamqualificationcoding.hasVersion()) {

			c.addClmCareTeamQualificationCdgVrsn(String.valueOf(claimcareteamqualificationcoding.getVersion()));
		} else {
			c.addClmCareTeamQualificationCdgVrsn("NULL");
		}

		if(claimcareteamqualificationcodingi == claimcareteamqualificationcodinglist.size()-1) {c.addClmCareTeamQualificationCdgVrsn("]]");}


		/******************** Clm_CareTeam_Qualification_Cdg_Cd ********************************************************************************/
		if(claimcareteamqualificationcodingi == 0) {c.addClmCareTeamQualificationCdgCd("[[");}
		if(claimcareteamqualificationcoding.hasCode()) {

			c.addClmCareTeamQualificationCdgCd(String.valueOf(claimcareteamqualificationcoding.getCode()));
		} else {
			c.addClmCareTeamQualificationCdgCd("NULL");
		}

		if(claimcareteamqualificationcodingi == claimcareteamqualificationcodinglist.size()-1) {c.addClmCareTeamQualificationCdgCd("]]");}


		/******************** Clm_CareTeam_Qualification_Cdg_UsrSltd ********************************************************************************/
		if(claimcareteamqualificationcodingi == 0) {c.addClmCareTeamQualificationCdgUsrSltd("[[");}
		if(claimcareteamqualificationcoding.hasUserSelected()) {

			c.addClmCareTeamQualificationCdgUsrSltd(String.valueOf(claimcareteamqualificationcoding.getUserSelected()));
		} else {
			c.addClmCareTeamQualificationCdgUsrSltd("NULL");
		}

		if(claimcareteamqualificationcodingi == claimcareteamqualificationcodinglist.size()-1) {c.addClmCareTeamQualificationCdgUsrSltd("]]");}


		/******************** Clm_CareTeam_Qualification_Cdg_Sys ********************************************************************************/
		if(claimcareteamqualificationcodingi == 0) {c.addClmCareTeamQualificationCdgSys("[[");}
		if(claimcareteamqualificationcoding.hasSystem()) {

			c.addClmCareTeamQualificationCdgSys(String.valueOf(claimcareteamqualificationcoding.getSystem()));
		} else {
			c.addClmCareTeamQualificationCdgSys("NULL");
		}

		if(claimcareteamqualificationcodingi == claimcareteamqualificationcodinglist.size()-1) {c.addClmCareTeamQualificationCdgSys("]]");}


		 };
		/******************** Clm_CareTeam_Responsible ********************************************************************************/
		if(claimcareteami == 0) {c.addClmCareTeamResponsible("[");}
		if(claimcareteam.hasResponsible()) {

			c.addClmCareTeamResponsible(String.valueOf(claimcareteam.getResponsible()));
		} else {
			c.addClmCareTeamResponsible("NULL");
		}

		if(claimcareteami == claimcareteamlist.size()-1) {c.addClmCareTeamResponsible("]");}


		 };
		/******************** claimprocedure ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Claim.ProcedureComponent> claimprocedurelist = claim.getProcedure();
		for(int claimprocedurei = 0; claimprocedurei<claimprocedurelist.size();claimprocedurei++ ) {
		org.hl7.fhir.r4.model.Claim.ProcedureComponent  claimprocedure = claimprocedurelist.get(claimprocedurei);

		/******************** claimproceduretype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> claimproceduretypelist = claimprocedure.getType();
		for(int claimproceduretypei = 0; claimproceduretypei<claimproceduretypelist.size();claimproceduretypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  claimproceduretype = claimproceduretypelist.get(claimproceduretypei);

		/******************** Clm_Prcdr_Typ_Txt ********************************************************************************/
		if(claimproceduretypei == 0) {c.addClmPrcdrTypTxt("[[");}
		if(claimproceduretype.hasText()) {

			c.addClmPrcdrTypTxt(String.valueOf(claimproceduretype.getText()));
		} else {
			c.addClmPrcdrTypTxt("NULL");
		}

		if(claimproceduretypei == claimproceduretypelist.size()-1) {c.addClmPrcdrTypTxt("]]");}


		/******************** claimproceduretypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimproceduretypecodinglist = claimproceduretype.getCoding();
		for(int claimproceduretypecodingi = 0; claimproceduretypecodingi<claimproceduretypecodinglist.size();claimproceduretypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimproceduretypecoding = claimproceduretypecodinglist.get(claimproceduretypecodingi);

		/******************** Clm_Prcdr_Typ_Cdg_Dsply ********************************************************************************/
		if(claimproceduretypecodingi == 0) {c.addClmPrcdrTypCdgDsply("[[[");}
		if(claimproceduretypecoding.hasDisplay()) {

			c.addClmPrcdrTypCdgDsply(String.valueOf(claimproceduretypecoding.getDisplay()));
		} else {
			c.addClmPrcdrTypCdgDsply("NULL");
		}

		if(claimproceduretypecodingi == claimproceduretypecodinglist.size()-1) {c.addClmPrcdrTypCdgDsply("]]]");}


		/******************** Clm_Prcdr_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimproceduretypecodingi == 0) {c.addClmPrcdrTypCdgVrsn("[[[");}
		if(claimproceduretypecoding.hasVersion()) {

			c.addClmPrcdrTypCdgVrsn(String.valueOf(claimproceduretypecoding.getVersion()));
		} else {
			c.addClmPrcdrTypCdgVrsn("NULL");
		}

		if(claimproceduretypecodingi == claimproceduretypecodinglist.size()-1) {c.addClmPrcdrTypCdgVrsn("]]]");}


		/******************** Clm_Prcdr_Typ_Cdg_Cd ********************************************************************************/
		if(claimproceduretypecodingi == 0) {c.addClmPrcdrTypCdgCd("[[[");}
		if(claimproceduretypecoding.hasCode()) {

			c.addClmPrcdrTypCdgCd(String.valueOf(claimproceduretypecoding.getCode()));
		} else {
			c.addClmPrcdrTypCdgCd("NULL");
		}

		if(claimproceduretypecodingi == claimproceduretypecodinglist.size()-1) {c.addClmPrcdrTypCdgCd("]]]");}


		/******************** Clm_Prcdr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimproceduretypecodingi == 0) {c.addClmPrcdrTypCdgUsrSltd("[[[");}
		if(claimproceduretypecoding.hasUserSelected()) {

			c.addClmPrcdrTypCdgUsrSltd(String.valueOf(claimproceduretypecoding.getUserSelected()));
		} else {
			c.addClmPrcdrTypCdgUsrSltd("NULL");
		}

		if(claimproceduretypecodingi == claimproceduretypecodinglist.size()-1) {c.addClmPrcdrTypCdgUsrSltd("]]]");}


		/******************** Clm_Prcdr_Typ_Cdg_Sys ********************************************************************************/
		if(claimproceduretypecodingi == 0) {c.addClmPrcdrTypCdgSys("[[[");}
		if(claimproceduretypecoding.hasSystem()) {

			c.addClmPrcdrTypCdgSys(String.valueOf(claimproceduretypecoding.getSystem()));
		} else {
			c.addClmPrcdrTypCdgSys("NULL");
		}

		if(claimproceduretypecodingi == claimproceduretypecodinglist.size()-1) {c.addClmPrcdrTypCdgSys("]]]");}


		 };
		 };
		/******************** Clm_Prcdr_Dt ********************************************************************************/
		if(claimprocedure.hasDate()) {

			c.addClmPrcdrDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimprocedure.getDate())+"\"");
		} else {
			c.addClmPrcdrDt("NULL");
		}


		/******************** Clm_Prcdr_Sqnc ********************************************************************************/
		if(claimprocedure.hasSequence()) {

			c.addClmPrcdrSqnc(String.valueOf(claimprocedure.getSequence()));
		} else {
			c.addClmPrcdrSqnc("NULL");
		}


		/******************** claimprocedureprocedurecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimprocedureprocedurecodeableconcept = claimprocedure.getProcedureCodeableConcept();

		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Txt ********************************************************************************/
		if(claimprocedureprocedurecodeableconcept.hasText()) {

			c.addClmPrcdrPrcdrCdbleCncptTxt(String.valueOf(claimprocedureprocedurecodeableconcept.getText()));
		} else {
			c.addClmPrcdrPrcdrCdbleCncptTxt("NULL");
		}


		/******************** claimprocedureprocedurecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimprocedureprocedurecodeableconceptcodinglist = claimprocedureprocedurecodeableconcept.getCoding();
		for(int claimprocedureprocedurecodeableconceptcodingi = 0; claimprocedureprocedurecodeableconceptcodingi<claimprocedureprocedurecodeableconceptcodinglist.size();claimprocedureprocedurecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimprocedureprocedurecodeableconceptcoding = claimprocedureprocedurecodeableconceptcodinglist.get(claimprocedureprocedurecodeableconceptcodingi);

		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(claimprocedureprocedurecodeableconceptcodingi == 0) {c.addClmPrcdrPrcdrCdbleCncptCdgDsply("[[");}
		if(claimprocedureprocedurecodeableconceptcoding.hasDisplay()) {

			c.addClmPrcdrPrcdrCdbleCncptCdgDsply(String.valueOf(claimprocedureprocedurecodeableconceptcoding.getDisplay()));
		} else {
			c.addClmPrcdrPrcdrCdbleCncptCdgDsply("NULL");
		}

		if(claimprocedureprocedurecodeableconceptcodingi == claimprocedureprocedurecodeableconceptcodinglist.size()-1) {c.addClmPrcdrPrcdrCdbleCncptCdgDsply("]]");}


		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(claimprocedureprocedurecodeableconceptcodingi == 0) {c.addClmPrcdrPrcdrCdbleCncptCdgVrsn("[[");}
		if(claimprocedureprocedurecodeableconceptcoding.hasVersion()) {

			c.addClmPrcdrPrcdrCdbleCncptCdgVrsn(String.valueOf(claimprocedureprocedurecodeableconceptcoding.getVersion()));
		} else {
			c.addClmPrcdrPrcdrCdbleCncptCdgVrsn("NULL");
		}

		if(claimprocedureprocedurecodeableconceptcodingi == claimprocedureprocedurecodeableconceptcodinglist.size()-1) {c.addClmPrcdrPrcdrCdbleCncptCdgVrsn("]]");}


		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(claimprocedureprocedurecodeableconceptcodingi == 0) {c.addClmPrcdrPrcdrCdbleCncptCdgCd("[[");}
		if(claimprocedureprocedurecodeableconceptcoding.hasCode()) {

			c.addClmPrcdrPrcdrCdbleCncptCdgCd(String.valueOf(claimprocedureprocedurecodeableconceptcoding.getCode()));
		} else {
			c.addClmPrcdrPrcdrCdbleCncptCdgCd("NULL");
		}

		if(claimprocedureprocedurecodeableconceptcodingi == claimprocedureprocedurecodeableconceptcodinglist.size()-1) {c.addClmPrcdrPrcdrCdbleCncptCdgCd("]]");}


		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(claimprocedureprocedurecodeableconceptcodingi == 0) {c.addClmPrcdrPrcdrCdbleCncptCdgUsrSltd("[[");}
		if(claimprocedureprocedurecodeableconceptcoding.hasUserSelected()) {

			c.addClmPrcdrPrcdrCdbleCncptCdgUsrSltd(String.valueOf(claimprocedureprocedurecodeableconceptcoding.getUserSelected()));
		} else {
			c.addClmPrcdrPrcdrCdbleCncptCdgUsrSltd("NULL");
		}

		if(claimprocedureprocedurecodeableconceptcodingi == claimprocedureprocedurecodeableconceptcodinglist.size()-1) {c.addClmPrcdrPrcdrCdbleCncptCdgUsrSltd("]]");}


		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(claimprocedureprocedurecodeableconceptcodingi == 0) {c.addClmPrcdrPrcdrCdbleCncptCdgSys("[[");}
		if(claimprocedureprocedurecodeableconceptcoding.hasSystem()) {

			c.addClmPrcdrPrcdrCdbleCncptCdgSys(String.valueOf(claimprocedureprocedurecodeableconceptcoding.getSystem()));
		} else {
			c.addClmPrcdrPrcdrCdbleCncptCdgSys("NULL");
		}

		if(claimprocedureprocedurecodeableconceptcodingi == claimprocedureprocedurecodeableconceptcodinglist.size()-1) {c.addClmPrcdrPrcdrCdbleCncptCdgSys("]]");}


		 };
		/******************** Clm_Prcdr_Udi ********************************************************************************/
		if(claimprocedure.hasUdi()) {

			String  array = "[";
			for(int incr=0; incr<claimprocedure.getUdi().size(); incr++) {
				array = array + claimprocedure.getUdi().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmPrcdrUdi(array);

		} else {
			c.addClmPrcdrUdi("NULL");
		}


		 };
		/******************** claimaccident ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.AccidentComponent claimaccident = claim.getAccident();

		/******************** claimaccidenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimaccidenttype = claimaccident.getType();

		/******************** Clm_Accident_Typ_Txt ********************************************************************************/
		if(claimaccidenttype.hasText()) {

			c.addClmAccidentTypTxt(String.valueOf(claimaccidenttype.getText()));
		} else {
			c.addClmAccidentTypTxt("NULL");
		}


		/******************** claimaccidenttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimaccidenttypecodinglist = claimaccidenttype.getCoding();
		for(int claimaccidenttypecodingi = 0; claimaccidenttypecodingi<claimaccidenttypecodinglist.size();claimaccidenttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimaccidenttypecoding = claimaccidenttypecodinglist.get(claimaccidenttypecodingi);

		/******************** Clm_Accident_Typ_Cdg_Dsply ********************************************************************************/
		if(claimaccidenttypecodingi == 0) {c.addClmAccidentTypCdgDsply("[");}
		if(claimaccidenttypecoding.hasDisplay()) {

			c.addClmAccidentTypCdgDsply(String.valueOf(claimaccidenttypecoding.getDisplay()));
		} else {
			c.addClmAccidentTypCdgDsply("NULL");
		}

		if(claimaccidenttypecodingi == claimaccidenttypecodinglist.size()-1) {c.addClmAccidentTypCdgDsply("]");}


		/******************** Clm_Accident_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimaccidenttypecodingi == 0) {c.addClmAccidentTypCdgVrsn("[");}
		if(claimaccidenttypecoding.hasVersion()) {

			c.addClmAccidentTypCdgVrsn(String.valueOf(claimaccidenttypecoding.getVersion()));
		} else {
			c.addClmAccidentTypCdgVrsn("NULL");
		}

		if(claimaccidenttypecodingi == claimaccidenttypecodinglist.size()-1) {c.addClmAccidentTypCdgVrsn("]");}


		/******************** Clm_Accident_Typ_Cdg_Cd ********************************************************************************/
		if(claimaccidenttypecodingi == 0) {c.addClmAccidentTypCdgCd("[");}
		if(claimaccidenttypecoding.hasCode()) {

			c.addClmAccidentTypCdgCd(String.valueOf(claimaccidenttypecoding.getCode()));
		} else {
			c.addClmAccidentTypCdgCd("NULL");
		}

		if(claimaccidenttypecodingi == claimaccidenttypecodinglist.size()-1) {c.addClmAccidentTypCdgCd("]");}


		/******************** Clm_Accident_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimaccidenttypecodingi == 0) {c.addClmAccidentTypCdgUsrSltd("[");}
		if(claimaccidenttypecoding.hasUserSelected()) {

			c.addClmAccidentTypCdgUsrSltd(String.valueOf(claimaccidenttypecoding.getUserSelected()));
		} else {
			c.addClmAccidentTypCdgUsrSltd("NULL");
		}

		if(claimaccidenttypecodingi == claimaccidenttypecodinglist.size()-1) {c.addClmAccidentTypCdgUsrSltd("]");}


		/******************** Clm_Accident_Typ_Cdg_Sys ********************************************************************************/
		if(claimaccidenttypecodingi == 0) {c.addClmAccidentTypCdgSys("[");}
		if(claimaccidenttypecoding.hasSystem()) {

			c.addClmAccidentTypCdgSys(String.valueOf(claimaccidenttypecoding.getSystem()));
		} else {
			c.addClmAccidentTypCdgSys("NULL");
		}

		if(claimaccidenttypecodingi == claimaccidenttypecodinglist.size()-1) {c.addClmAccidentTypCdgSys("]");}


		 };
		/******************** Clm_Accident_Dt ********************************************************************************/
		if(claimaccident.hasDate()) {

			c.addClmAccidentDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimaccident.getDate())+"\"");
		} else {
			c.addClmAccidentDt("NULL");
		}


		/******************** claimaccidentlocationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address claimaccidentlocationaddress = claimaccident.getLocationAddress();

		/******************** Clm_Accident_LctnAddr_State ********************************************************************************/
		if(claimaccidentlocationaddress.hasState()) {

			c.addClmAccidentLctnAddrState(String.valueOf(claimaccidentlocationaddress.getState()));
		} else {
			c.addClmAccidentLctnAddrState("NULL");
		}


		/******************** claimaccidentlocationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType claimaccidentlocationaddresstype = claimaccidentlocationaddress.getType();
		if(claimaccidentlocationaddresstype!=null) {
			c.addClmAccidentLctnAddrTyp(claimaccidentlocationaddresstype.toCode());
		} else {
			c.addClmAccidentLctnAddrTyp("NULL");
		}

		/******************** Clm_Accident_LctnAddr_Cntry ********************************************************************************/
		if(claimaccidentlocationaddress.hasCountry()) {

			c.addClmAccidentLctnAddrCntry(String.valueOf(claimaccidentlocationaddress.getCountry()));
		} else {
			c.addClmAccidentLctnAddrCntry("NULL");
		}


		/******************** claimaccidentlocationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimaccidentlocationaddressperiod = claimaccidentlocationaddress.getPeriod();

		/******************** Clm_Accident_LctnAddr_Prd_Strt ********************************************************************************/
		if(claimaccidentlocationaddressperiod.hasStart()) {

			c.addClmAccidentLctnAddrPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimaccidentlocationaddressperiod.getStart())+"\"");
		} else {
			c.addClmAccidentLctnAddrPrdStrt("NULL");
		}


		/******************** Clm_Accident_LctnAddr_Prd_End ********************************************************************************/
		if(claimaccidentlocationaddressperiod.hasEnd()) {

			c.addClmAccidentLctnAddrPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimaccidentlocationaddressperiod.getEnd())+"\"");
		} else {
			c.addClmAccidentLctnAddrPrdEnd("NULL");
		}


		/******************** Clm_Accident_LctnAddr_District ********************************************************************************/
		if(claimaccidentlocationaddress.hasDistrict()) {

			c.addClmAccidentLctnAddrDistrict(String.valueOf(claimaccidentlocationaddress.getDistrict()));
		} else {
			c.addClmAccidentLctnAddrDistrict("NULL");
		}


		/******************** Clm_Accident_LctnAddr_PostalCd ********************************************************************************/
		if(claimaccidentlocationaddress.hasPostalCode()) {

			c.addClmAccidentLctnAddrPostalCd(String.valueOf(claimaccidentlocationaddress.getPostalCode()));
		} else {
			c.addClmAccidentLctnAddrPostalCd("NULL");
		}


		/******************** Clm_Accident_LctnAddr_Line ********************************************************************************/
		if(claimaccidentlocationaddress.hasLine()) {

			String  array = "[";
			for(int incr=0; incr<claimaccidentlocationaddress.getLine().size(); incr++) {
				array = array + claimaccidentlocationaddress.getLine().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmAccidentLctnAddrLine(array);

		} else {
			c.addClmAccidentLctnAddrLine("NULL");
		}


		/******************** Clm_Accident_LctnAddr_City ********************************************************************************/
		if(claimaccidentlocationaddress.hasCity()) {

			c.addClmAccidentLctnAddrCity(String.valueOf(claimaccidentlocationaddress.getCity()));
		} else {
			c.addClmAccidentLctnAddrCity("NULL");
		}


		/******************** claimaccidentlocationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse claimaccidentlocationaddressuse = claimaccidentlocationaddress.getUse();
		if(claimaccidentlocationaddressuse!=null) {
			c.addClmAccidentLctnAddrUse(claimaccidentlocationaddressuse.toCode());
		} else {
			c.addClmAccidentLctnAddrUse("NULL");
		}

		/******************** Clm_Accident_LctnAddr_Txt ********************************************************************************/
		if(claimaccidentlocationaddress.hasText()) {

			c.addClmAccidentLctnAddrTxt(String.valueOf(claimaccidentlocationaddress.getText()));
		} else {
			c.addClmAccidentLctnAddrTxt("NULL");
		}


		/******************** Clm_Accident_LctnRfrnc ********************************************************************************/
		if(claimaccident.hasLocationReference()) {

			if(claimaccident.getLocationReference().getReference() != null) {
			c.addClmAccidentLctnRfrnc(claimaccident.getLocationReference().getReference());
			}
		} else {
			c.addClmAccidentLctnRfrnc("NULL");
		}


		/******************** claimtotal ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimtotal = claim.getTotal();

		/******************** Clm_Total_Vl ********************************************************************************/
		if(claimtotal.hasValue()) {

			c.addClmTotalVl(String.valueOf(claimtotal.getValue()));
		} else {
			c.addClmTotalVl("NULL");
		}


		/******************** Clm_Total_Crncy ********************************************************************************/
		if(claimtotal.hasCurrency()) {

			c.addClmTotalCrncy(String.valueOf(claimtotal.getCurrency()));
		} else {
			c.addClmTotalCrncy("NULL");
		}


		/******************** Clm_OriginalPrescription ********************************************************************************/
		if(claim.hasOriginalPrescription()) {

			if(claim.getOriginalPrescription().getReference() != null) {
			c.addClmOriginalPrescription(claim.getOriginalPrescription().getReference());
			}
		} else {
			c.addClmOriginalPrescription("NULL");
		}


		/******************** Clm_Enterer ********************************************************************************/
		if(claim.hasEnterer()) {

			if(claim.getEnterer().getReference() != null) {
			c.addClmEnterer(claim.getEnterer().getReference());
			}
		} else {
			c.addClmEnterer("NULL");
		}


		/******************** Clm_Facility ********************************************************************************/
		if(claim.hasFacility()) {

			if(claim.getFacility().getReference() != null) {
			c.addClmFacility(claim.getFacility().getReference());
			}
		} else {
			c.addClmFacility("NULL");
		}


		/******************** claimsupportinginfo ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Claim.SupportingInformationComponent> claimsupportinginfolist = claim.getSupportingInfo();
		for(int claimsupportinginfoi = 0; claimsupportinginfoi<claimsupportinginfolist.size();claimsupportinginfoi++ ) {
		org.hl7.fhir.r4.model.Claim.SupportingInformationComponent  claimsupportinginfo = claimsupportinginfolist.get(claimsupportinginfoi);

		/******************** claimsupportinginforeason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimsupportinginforeason = claimsupportinginfo.getReason();

		/******************** Clm_SprtingInfo_Rsn_Txt ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoRsnTxt("[");}
		if(claimsupportinginforeason.hasText()) {

			c.addClmSprtingInfoRsnTxt(String.valueOf(claimsupportinginforeason.getText()));
		} else {
			c.addClmSprtingInfoRsnTxt("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoRsnTxt("]");}


		/******************** claimsupportinginforeasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimsupportinginforeasoncodinglist = claimsupportinginforeason.getCoding();
		for(int claimsupportinginforeasoncodingi = 0; claimsupportinginforeasoncodingi<claimsupportinginforeasoncodinglist.size();claimsupportinginforeasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimsupportinginforeasoncoding = claimsupportinginforeasoncodinglist.get(claimsupportinginforeasoncodingi);

		/******************** Clm_SprtingInfo_Rsn_Cdg_Dsply ********************************************************************************/
		if(claimsupportinginforeasoncodingi == 0) {c.addClmSprtingInfoRsnCdgDsply("[[");}
		if(claimsupportinginforeasoncoding.hasDisplay()) {

			c.addClmSprtingInfoRsnCdgDsply(String.valueOf(claimsupportinginforeasoncoding.getDisplay()));
		} else {
			c.addClmSprtingInfoRsnCdgDsply("NULL");
		}

		if(claimsupportinginforeasoncodingi == claimsupportinginforeasoncodinglist.size()-1) {c.addClmSprtingInfoRsnCdgDsply("]]");}


		/******************** Clm_SprtingInfo_Rsn_Cdg_Vrsn ********************************************************************************/
		if(claimsupportinginforeasoncodingi == 0) {c.addClmSprtingInfoRsnCdgVrsn("[[");}
		if(claimsupportinginforeasoncoding.hasVersion()) {

			c.addClmSprtingInfoRsnCdgVrsn(String.valueOf(claimsupportinginforeasoncoding.getVersion()));
		} else {
			c.addClmSprtingInfoRsnCdgVrsn("NULL");
		}

		if(claimsupportinginforeasoncodingi == claimsupportinginforeasoncodinglist.size()-1) {c.addClmSprtingInfoRsnCdgVrsn("]]");}


		/******************** Clm_SprtingInfo_Rsn_Cdg_Cd ********************************************************************************/
		if(claimsupportinginforeasoncodingi == 0) {c.addClmSprtingInfoRsnCdgCd("[[");}
		if(claimsupportinginforeasoncoding.hasCode()) {

			c.addClmSprtingInfoRsnCdgCd(String.valueOf(claimsupportinginforeasoncoding.getCode()));
		} else {
			c.addClmSprtingInfoRsnCdgCd("NULL");
		}

		if(claimsupportinginforeasoncodingi == claimsupportinginforeasoncodinglist.size()-1) {c.addClmSprtingInfoRsnCdgCd("]]");}


		/******************** Clm_SprtingInfo_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(claimsupportinginforeasoncodingi == 0) {c.addClmSprtingInfoRsnCdgUsrSltd("[[");}
		if(claimsupportinginforeasoncoding.hasUserSelected()) {

			c.addClmSprtingInfoRsnCdgUsrSltd(String.valueOf(claimsupportinginforeasoncoding.getUserSelected()));
		} else {
			c.addClmSprtingInfoRsnCdgUsrSltd("NULL");
		}

		if(claimsupportinginforeasoncodingi == claimsupportinginforeasoncodinglist.size()-1) {c.addClmSprtingInfoRsnCdgUsrSltd("]]");}


		/******************** Clm_SprtingInfo_Rsn_Cdg_Sys ********************************************************************************/
		if(claimsupportinginforeasoncodingi == 0) {c.addClmSprtingInfoRsnCdgSys("[[");}
		if(claimsupportinginforeasoncoding.hasSystem()) {

			c.addClmSprtingInfoRsnCdgSys(String.valueOf(claimsupportinginforeasoncoding.getSystem()));
		} else {
			c.addClmSprtingInfoRsnCdgSys("NULL");
		}

		if(claimsupportinginforeasoncodingi == claimsupportinginforeasoncodinglist.size()-1) {c.addClmSprtingInfoRsnCdgSys("]]");}


		 };
		/******************** claimsupportinginfocode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimsupportinginfocode = claimsupportinginfo.getCode();

		/******************** Clm_SprtingInfo_Cd_Txt ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoCdTxt("[");}
		if(claimsupportinginfocode.hasText()) {

			c.addClmSprtingInfoCdTxt(String.valueOf(claimsupportinginfocode.getText()));
		} else {
			c.addClmSprtingInfoCdTxt("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoCdTxt("]");}


		/******************** claimsupportinginfocodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimsupportinginfocodecodinglist = claimsupportinginfocode.getCoding();
		for(int claimsupportinginfocodecodingi = 0; claimsupportinginfocodecodingi<claimsupportinginfocodecodinglist.size();claimsupportinginfocodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimsupportinginfocodecoding = claimsupportinginfocodecodinglist.get(claimsupportinginfocodecodingi);

		/******************** Clm_SprtingInfo_Cd_Cdg_Dsply ********************************************************************************/
		if(claimsupportinginfocodecodingi == 0) {c.addClmSprtingInfoCdCdgDsply("[[");}
		if(claimsupportinginfocodecoding.hasDisplay()) {

			c.addClmSprtingInfoCdCdgDsply(String.valueOf(claimsupportinginfocodecoding.getDisplay()));
		} else {
			c.addClmSprtingInfoCdCdgDsply("NULL");
		}

		if(claimsupportinginfocodecodingi == claimsupportinginfocodecodinglist.size()-1) {c.addClmSprtingInfoCdCdgDsply("]]");}


		/******************** Clm_SprtingInfo_Cd_Cdg_Vrsn ********************************************************************************/
		if(claimsupportinginfocodecodingi == 0) {c.addClmSprtingInfoCdCdgVrsn("[[");}
		if(claimsupportinginfocodecoding.hasVersion()) {

			c.addClmSprtingInfoCdCdgVrsn(String.valueOf(claimsupportinginfocodecoding.getVersion()));
		} else {
			c.addClmSprtingInfoCdCdgVrsn("NULL");
		}

		if(claimsupportinginfocodecodingi == claimsupportinginfocodecodinglist.size()-1) {c.addClmSprtingInfoCdCdgVrsn("]]");}


		/******************** Clm_SprtingInfo_Cd_Cdg_Cd ********************************************************************************/
		if(claimsupportinginfocodecodingi == 0) {c.addClmSprtingInfoCdCdgCd("[[");}
		if(claimsupportinginfocodecoding.hasCode()) {

			c.addClmSprtingInfoCdCdgCd(String.valueOf(claimsupportinginfocodecoding.getCode()));
		} else {
			c.addClmSprtingInfoCdCdgCd("NULL");
		}

		if(claimsupportinginfocodecodingi == claimsupportinginfocodecodinglist.size()-1) {c.addClmSprtingInfoCdCdgCd("]]");}


		/******************** Clm_SprtingInfo_Cd_Cdg_UsrSltd ********************************************************************************/
		if(claimsupportinginfocodecodingi == 0) {c.addClmSprtingInfoCdCdgUsrSltd("[[");}
		if(claimsupportinginfocodecoding.hasUserSelected()) {

			c.addClmSprtingInfoCdCdgUsrSltd(String.valueOf(claimsupportinginfocodecoding.getUserSelected()));
		} else {
			c.addClmSprtingInfoCdCdgUsrSltd("NULL");
		}

		if(claimsupportinginfocodecodingi == claimsupportinginfocodecodinglist.size()-1) {c.addClmSprtingInfoCdCdgUsrSltd("]]");}


		/******************** Clm_SprtingInfo_Cd_Cdg_Sys ********************************************************************************/
		if(claimsupportinginfocodecodingi == 0) {c.addClmSprtingInfoCdCdgSys("[[");}
		if(claimsupportinginfocodecoding.hasSystem()) {

			c.addClmSprtingInfoCdCdgSys(String.valueOf(claimsupportinginfocodecoding.getSystem()));
		} else {
			c.addClmSprtingInfoCdCdgSys("NULL");
		}

		if(claimsupportinginfocodecodingi == claimsupportinginfocodecodinglist.size()-1) {c.addClmSprtingInfoCdCdgSys("]]");}


		 };
		/******************** claimsupportinginfocategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimsupportinginfocategory = claimsupportinginfo.getCategory();

		/******************** Clm_SprtingInfo_Ctgry_Txt ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoCtgryTxt("[");}
		if(claimsupportinginfocategory.hasText()) {

			c.addClmSprtingInfoCtgryTxt(String.valueOf(claimsupportinginfocategory.getText()));
		} else {
			c.addClmSprtingInfoCtgryTxt("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoCtgryTxt("]");}


		/******************** claimsupportinginfocategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimsupportinginfocategorycodinglist = claimsupportinginfocategory.getCoding();
		for(int claimsupportinginfocategorycodingi = 0; claimsupportinginfocategorycodingi<claimsupportinginfocategorycodinglist.size();claimsupportinginfocategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimsupportinginfocategorycoding = claimsupportinginfocategorycodinglist.get(claimsupportinginfocategorycodingi);

		/******************** Clm_SprtingInfo_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimsupportinginfocategorycodingi == 0) {c.addClmSprtingInfoCtgryCdgDsply("[[");}
		if(claimsupportinginfocategorycoding.hasDisplay()) {

			c.addClmSprtingInfoCtgryCdgDsply(String.valueOf(claimsupportinginfocategorycoding.getDisplay()));
		} else {
			c.addClmSprtingInfoCtgryCdgDsply("NULL");
		}

		if(claimsupportinginfocategorycodingi == claimsupportinginfocategorycodinglist.size()-1) {c.addClmSprtingInfoCtgryCdgDsply("]]");}


		/******************** Clm_SprtingInfo_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimsupportinginfocategorycodingi == 0) {c.addClmSprtingInfoCtgryCdgVrsn("[[");}
		if(claimsupportinginfocategorycoding.hasVersion()) {

			c.addClmSprtingInfoCtgryCdgVrsn(String.valueOf(claimsupportinginfocategorycoding.getVersion()));
		} else {
			c.addClmSprtingInfoCtgryCdgVrsn("NULL");
		}

		if(claimsupportinginfocategorycodingi == claimsupportinginfocategorycodinglist.size()-1) {c.addClmSprtingInfoCtgryCdgVrsn("]]");}


		/******************** Clm_SprtingInfo_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimsupportinginfocategorycodingi == 0) {c.addClmSprtingInfoCtgryCdgCd("[[");}
		if(claimsupportinginfocategorycoding.hasCode()) {

			c.addClmSprtingInfoCtgryCdgCd(String.valueOf(claimsupportinginfocategorycoding.getCode()));
		} else {
			c.addClmSprtingInfoCtgryCdgCd("NULL");
		}

		if(claimsupportinginfocategorycodingi == claimsupportinginfocategorycodinglist.size()-1) {c.addClmSprtingInfoCtgryCdgCd("]]");}


		/******************** Clm_SprtingInfo_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimsupportinginfocategorycodingi == 0) {c.addClmSprtingInfoCtgryCdgUsrSltd("[[");}
		if(claimsupportinginfocategorycoding.hasUserSelected()) {

			c.addClmSprtingInfoCtgryCdgUsrSltd(String.valueOf(claimsupportinginfocategorycoding.getUserSelected()));
		} else {
			c.addClmSprtingInfoCtgryCdgUsrSltd("NULL");
		}

		if(claimsupportinginfocategorycodingi == claimsupportinginfocategorycodinglist.size()-1) {c.addClmSprtingInfoCtgryCdgUsrSltd("]]");}


		/******************** Clm_SprtingInfo_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimsupportinginfocategorycodingi == 0) {c.addClmSprtingInfoCtgryCdgSys("[[");}
		if(claimsupportinginfocategorycoding.hasSystem()) {

			c.addClmSprtingInfoCtgryCdgSys(String.valueOf(claimsupportinginfocategorycoding.getSystem()));
		} else {
			c.addClmSprtingInfoCtgryCdgSys("NULL");
		}

		if(claimsupportinginfocategorycodingi == claimsupportinginfocategorycodinglist.size()-1) {c.addClmSprtingInfoCtgryCdgSys("]]");}


		 };
		/******************** Clm_SprtingInfo_Sqnc ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoSqnc("[");}
		if(claimsupportinginfo.hasSequence()) {

			c.addClmSprtingInfoSqnc(String.valueOf(claimsupportinginfo.getSequence()));
		} else {
			c.addClmSprtingInfoSqnc("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoSqnc("]");}


		/******************** claimsupportinginfovalueattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment claimsupportinginfovalueattachment = claimsupportinginfo.getValueAttachment();

		/******************** Clm_SprtingInfo_VlAttchmnt_Sz ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoVlAttchmntSz("[");}
		if(claimsupportinginfovalueattachment.hasSize()) {

			c.addClmSprtingInfoVlAttchmntSz(String.valueOf(claimsupportinginfovalueattachment.getSize()));
		} else {
			c.addClmSprtingInfoVlAttchmntSz("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoVlAttchmntSz("]");}


		/******************** Clm_SprtingInfo_VlAttchmnt_Lnguage ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoVlAttchmntLnguage("[");}
		if(claimsupportinginfovalueattachment.hasLanguage()) {

			c.addClmSprtingInfoVlAttchmntLnguage(String.valueOf(claimsupportinginfovalueattachment.getLanguage()));
		} else {
			c.addClmSprtingInfoVlAttchmntLnguage("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoVlAttchmntLnguage("]");}


		/******************** Clm_SprtingInfo_VlAttchmnt_CntntTyp ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoVlAttchmntCntntTyp("[");}
		if(claimsupportinginfovalueattachment.hasContentType()) {

			c.addClmSprtingInfoVlAttchmntCntntTyp(String.valueOf(claimsupportinginfovalueattachment.getContentType()));
		} else {
			c.addClmSprtingInfoVlAttchmntCntntTyp("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoVlAttchmntCntntTyp("]");}


		/******************** Clm_SprtingInfo_VlAttchmnt_Hash ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoVlAttchmntHash("[");}
		if(claimsupportinginfovalueattachment.hasHash()) {

			c.addClmSprtingInfoVlAttchmntHash(new String(claimsupportinginfovalueattachment.getHash()));
		} else {
			c.addClmSprtingInfoVlAttchmntHash("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoVlAttchmntHash("]");}


		/******************** Clm_SprtingInfo_VlAttchmnt_Data ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoVlAttchmntData("[");}
		if(claimsupportinginfovalueattachment.hasData()) {

			c.addClmSprtingInfoVlAttchmntData(new String(claimsupportinginfovalueattachment.getData()));
		} else {
			c.addClmSprtingInfoVlAttchmntData("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoVlAttchmntData("]");}


		/******************** Clm_SprtingInfo_VlAttchmnt_Creation ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoVlAttchmntCreation("[");}
		if(claimsupportinginfovalueattachment.hasCreation()) {

			c.addClmSprtingInfoVlAttchmntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimsupportinginfovalueattachment.getCreation())+"\"");
		} else {
			c.addClmSprtingInfoVlAttchmntCreation("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoVlAttchmntCreation("]");}


		/******************** Clm_SprtingInfo_VlAttchmnt_Ttl ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoVlAttchmntTtl("[");}
		if(claimsupportinginfovalueattachment.hasTitle()) {

			c.addClmSprtingInfoVlAttchmntTtl(String.valueOf(claimsupportinginfovalueattachment.getTitle()));
		} else {
			c.addClmSprtingInfoVlAttchmntTtl("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoVlAttchmntTtl("]");}


		/******************** Clm_SprtingInfo_VlAttchmnt_Url ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoVlAttchmntUrl("[");}
		if(claimsupportinginfovalueattachment.hasUrl()) {

			c.addClmSprtingInfoVlAttchmntUrl(String.valueOf(claimsupportinginfovalueattachment.getUrl()));
		} else {
			c.addClmSprtingInfoVlAttchmntUrl("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoVlAttchmntUrl("]");}


		/******************** Clm_SprtingInfo_VlRfrnc ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoVlRfrnc("[");}
		if(claimsupportinginfo.hasValueReference()) {

			if(claimsupportinginfo.getValueReference().getReference() != null) {
			c.addClmSprtingInfoVlRfrnc(claimsupportinginfo.getValueReference().getReference());
			}
		} else {
			c.addClmSprtingInfoVlRfrnc("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoVlRfrnc("]");}


		/******************** claimsupportinginfotimingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimsupportinginfotimingperiod = claimsupportinginfo.getTimingPeriod();

		/******************** Clm_SprtingInfo_TmgPrd_Strt ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoTmgPrdStrt("[");}
		if(claimsupportinginfotimingperiod.hasStart()) {

			c.addClmSprtingInfoTmgPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimsupportinginfotimingperiod.getStart())+"\"");
		} else {
			c.addClmSprtingInfoTmgPrdStrt("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoTmgPrdStrt("]");}


		/******************** Clm_SprtingInfo_TmgPrd_End ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoTmgPrdEnd("[");}
		if(claimsupportinginfotimingperiod.hasEnd()) {

			c.addClmSprtingInfoTmgPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(claimsupportinginfotimingperiod.getEnd())+"\"");
		} else {
			c.addClmSprtingInfoTmgPrdEnd("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoTmgPrdEnd("]");}


		/******************** Clm_SprtingInfo_TmgDtTyp ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoTmgDtTyp("[");}
		if(claimsupportinginfo.hasTimingDateType()) {

			c.addClmSprtingInfoTmgDtTyp("\""+claimsupportinginfo.getTimingDateType().getValueAsString()+"\"");
		} else {
			c.addClmSprtingInfoTmgDtTyp("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoTmgDtTyp("]");}


		/******************** Clm_SprtingInfo_VlBooleanTyp ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoVlBooleanTyp("[");}
		if(claimsupportinginfo.hasValueBooleanType()) {

			c.addClmSprtingInfoVlBooleanTyp("\""+claimsupportinginfo.getValueBooleanType().getValueAsString()+"\"");
		} else {
			c.addClmSprtingInfoVlBooleanTyp("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoVlBooleanTyp("]");}


		/******************** Clm_SprtingInfo_VlStrgTyp ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoVlStrgTyp("[");}
		if(claimsupportinginfo.hasValueStringType()) {

			c.addClmSprtingInfoVlStrgTyp("\""+claimsupportinginfo.getValueStringType().getValueAsString()+"\"");
		} else {
			c.addClmSprtingInfoVlStrgTyp("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoVlStrgTyp("]");}


		/******************** claimsupportinginfovaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimsupportinginfovaluequantity = claimsupportinginfo.getValueQuantity();

		/******************** Clm_SprtingInfo_VlQnty_Vl ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoVlQntyVl("[");}
		if(claimsupportinginfovaluequantity.hasValue()) {

			c.addClmSprtingInfoVlQntyVl(String.valueOf(claimsupportinginfovaluequantity.getValue()));
		} else {
			c.addClmSprtingInfoVlQntyVl("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoVlQntyVl("]");}


		/******************** claimsupportinginfovaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator claimsupportinginfovaluequantitycomparator = claimsupportinginfovaluequantity.getComparator();
		if(claimsupportinginfovaluequantitycomparator!=null) {
		if(claimsupportinginfoi == 0) {

		c.addClmSprtingInfoVlQntyCmprtr("[");		}
			c.addClmSprtingInfoVlQntyCmprtr(claimsupportinginfovaluequantitycomparator.toCode());
		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {

		c.addClmSprtingInfoVlQntyCmprtr("]");		}

		} else {
			c.addClmSprtingInfoVlQntyCmprtr("NULL");
		}

		/******************** Clm_SprtingInfo_VlQnty_Cd ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoVlQntyCd("[");}
		if(claimsupportinginfovaluequantity.hasCode()) {

			c.addClmSprtingInfoVlQntyCd(String.valueOf(claimsupportinginfovaluequantity.getCode()));
		} else {
			c.addClmSprtingInfoVlQntyCd("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoVlQntyCd("]");}


		/******************** Clm_SprtingInfo_VlQnty_Unt ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoVlQntyUnt("[");}
		if(claimsupportinginfovaluequantity.hasUnit()) {

			c.addClmSprtingInfoVlQntyUnt(String.valueOf(claimsupportinginfovaluequantity.getUnit()));
		} else {
			c.addClmSprtingInfoVlQntyUnt("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoVlQntyUnt("]");}


		/******************** Clm_SprtingInfo_VlQnty_Sys ********************************************************************************/
		if(claimsupportinginfoi == 0) {c.addClmSprtingInfoVlQntySys("[");}
		if(claimsupportinginfovaluequantity.hasSystem()) {

			c.addClmSprtingInfoVlQntySys(String.valueOf(claimsupportinginfovaluequantity.getSystem()));
		} else {
			c.addClmSprtingInfoVlQntySys("NULL");
		}

		if(claimsupportinginfoi == claimsupportinginfolist.size()-1) {c.addClmSprtingInfoVlQntySys("]");}


		 };
		/******************** claiminsurance ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Claim.InsuranceComponent> claiminsurancelist = claim.getInsurance();
		for(int claiminsurancei = 0; claiminsurancei<claiminsurancelist.size();claiminsurancei++ ) {
		org.hl7.fhir.r4.model.Claim.InsuranceComponent  claiminsurance = claiminsurancelist.get(claiminsurancei);

		/******************** claiminsuranceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier claiminsuranceidentifier = claiminsurance.getIdentifier();

		/******************** Clm_Insrnc_Id_Vl ********************************************************************************/
		if(claiminsurancei == 0) {c.addClmInsrncIdVl("[");}
		if(claiminsuranceidentifier.hasValue()) {

			c.addClmInsrncIdVl(String.valueOf(claiminsuranceidentifier.getValue()));
		} else {
			c.addClmInsrncIdVl("NULL");
		}

		if(claiminsurancei == claiminsurancelist.size()-1) {c.addClmInsrncIdVl("]");}


		/******************** claiminsuranceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claiminsuranceidentifiertype = claiminsuranceidentifier.getType();

		/******************** Clm_Insrnc_Id_Typ_Txt ********************************************************************************/
		if(claiminsurancei == 0) {c.addClmInsrncIdTypTxt("[");}
		if(claiminsuranceidentifiertype.hasText()) {

			c.addClmInsrncIdTypTxt(String.valueOf(claiminsuranceidentifiertype.getText()));
		} else {
			c.addClmInsrncIdTypTxt("NULL");
		}

		if(claiminsurancei == claiminsurancelist.size()-1) {c.addClmInsrncIdTypTxt("]");}


		/******************** claiminsuranceidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claiminsuranceidentifiertypecodinglist = claiminsuranceidentifiertype.getCoding();
		for(int claiminsuranceidentifiertypecodingi = 0; claiminsuranceidentifiertypecodingi<claiminsuranceidentifiertypecodinglist.size();claiminsuranceidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claiminsuranceidentifiertypecoding = claiminsuranceidentifiertypecodinglist.get(claiminsuranceidentifiertypecodingi);

		/******************** Clm_Insrnc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(claiminsuranceidentifiertypecodingi == 0) {c.addClmInsrncIdTypCdgDsply("[[");}
		if(claiminsuranceidentifiertypecoding.hasDisplay()) {

			c.addClmInsrncIdTypCdgDsply(String.valueOf(claiminsuranceidentifiertypecoding.getDisplay()));
		} else {
			c.addClmInsrncIdTypCdgDsply("NULL");
		}

		if(claiminsuranceidentifiertypecodingi == claiminsuranceidentifiertypecodinglist.size()-1) {c.addClmInsrncIdTypCdgDsply("]]");}


		/******************** Clm_Insrnc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(claiminsuranceidentifiertypecodingi == 0) {c.addClmInsrncIdTypCdgVrsn("[[");}
		if(claiminsuranceidentifiertypecoding.hasVersion()) {

			c.addClmInsrncIdTypCdgVrsn(String.valueOf(claiminsuranceidentifiertypecoding.getVersion()));
		} else {
			c.addClmInsrncIdTypCdgVrsn("NULL");
		}

		if(claiminsuranceidentifiertypecodingi == claiminsuranceidentifiertypecodinglist.size()-1) {c.addClmInsrncIdTypCdgVrsn("]]");}


		/******************** Clm_Insrnc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(claiminsuranceidentifiertypecodingi == 0) {c.addClmInsrncIdTypCdgCd("[[");}
		if(claiminsuranceidentifiertypecoding.hasCode()) {

			c.addClmInsrncIdTypCdgCd(String.valueOf(claiminsuranceidentifiertypecoding.getCode()));
		} else {
			c.addClmInsrncIdTypCdgCd("NULL");
		}

		if(claiminsuranceidentifiertypecodingi == claiminsuranceidentifiertypecodinglist.size()-1) {c.addClmInsrncIdTypCdgCd("]]");}


		/******************** Clm_Insrnc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claiminsuranceidentifiertypecodingi == 0) {c.addClmInsrncIdTypCdgUsrSltd("[[");}
		if(claiminsuranceidentifiertypecoding.hasUserSelected()) {

			c.addClmInsrncIdTypCdgUsrSltd(String.valueOf(claiminsuranceidentifiertypecoding.getUserSelected()));
		} else {
			c.addClmInsrncIdTypCdgUsrSltd("NULL");
		}

		if(claiminsuranceidentifiertypecodingi == claiminsuranceidentifiertypecodinglist.size()-1) {c.addClmInsrncIdTypCdgUsrSltd("]]");}


		/******************** Clm_Insrnc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(claiminsuranceidentifiertypecodingi == 0) {c.addClmInsrncIdTypCdgSys("[[");}
		if(claiminsuranceidentifiertypecoding.hasSystem()) {

			c.addClmInsrncIdTypCdgSys(String.valueOf(claiminsuranceidentifiertypecoding.getSystem()));
		} else {
			c.addClmInsrncIdTypCdgSys("NULL");
		}

		if(claiminsuranceidentifiertypecodingi == claiminsuranceidentifiertypecodinglist.size()-1) {c.addClmInsrncIdTypCdgSys("]]");}


		 };
		/******************** claiminsuranceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claiminsuranceidentifierperiod = claiminsuranceidentifier.getPeriod();

		/******************** Clm_Insrnc_Id_Prd_Strt ********************************************************************************/
		if(claiminsurancei == 0) {c.addClmInsrncIdPrdStrt("[");}
		if(claiminsuranceidentifierperiod.hasStart()) {

			c.addClmInsrncIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(claiminsuranceidentifierperiod.getStart())+"\"");
		} else {
			c.addClmInsrncIdPrdStrt("NULL");
		}

		if(claiminsurancei == claiminsurancelist.size()-1) {c.addClmInsrncIdPrdStrt("]");}


		/******************** Clm_Insrnc_Id_Prd_End ********************************************************************************/
		if(claiminsurancei == 0) {c.addClmInsrncIdPrdEnd("[");}
		if(claiminsuranceidentifierperiod.hasEnd()) {

			c.addClmInsrncIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(claiminsuranceidentifierperiod.getEnd())+"\"");
		} else {
			c.addClmInsrncIdPrdEnd("NULL");
		}

		if(claiminsurancei == claiminsurancelist.size()-1) {c.addClmInsrncIdPrdEnd("]");}


		/******************** claiminsuranceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse claiminsuranceidentifieruse = claiminsuranceidentifier.getUse();
		if(claiminsuranceidentifieruse!=null) {
		if(claiminsurancei == 0) {

		c.addClmInsrncIdUse("[");		}
			c.addClmInsrncIdUse(claiminsuranceidentifieruse.toCode());
		if(claiminsurancei == claiminsurancelist.size()-1) {

		c.addClmInsrncIdUse("]");		}

		} else {
			c.addClmInsrncIdUse("NULL");
		}

		/******************** Clm_Insrnc_Id_Assigner ********************************************************************************/
		if(claiminsurancei == 0) {c.addClmInsrncIdAssigner("[");}
		if(claiminsuranceidentifier.hasAssigner()) {

			if(claiminsuranceidentifier.getAssigner().getReference() != null) {
			c.addClmInsrncIdAssigner(claiminsuranceidentifier.getAssigner().getReference());
			}
		} else {
			c.addClmInsrncIdAssigner("NULL");
		}

		if(claiminsurancei == claiminsurancelist.size()-1) {c.addClmInsrncIdAssigner("]");}


		/******************** Clm_Insrnc_Id_Sys ********************************************************************************/
		if(claiminsurancei == 0) {c.addClmInsrncIdSys("[");}
		if(claiminsuranceidentifier.hasSystem()) {

			c.addClmInsrncIdSys(String.valueOf(claiminsuranceidentifier.getSystem()));
		} else {
			c.addClmInsrncIdSys("NULL");
		}

		if(claiminsurancei == claiminsurancelist.size()-1) {c.addClmInsrncIdSys("]");}


		/******************** Clm_Insrnc_Focal ********************************************************************************/
		if(claiminsurancei == 0) {c.addClmInsrncFocal("[");}
		if(claiminsurance.hasFocal()) {

			c.addClmInsrncFocal(String.valueOf(claiminsurance.getFocal()));
		} else {
			c.addClmInsrncFocal("NULL");
		}

		if(claiminsurancei == claiminsurancelist.size()-1) {c.addClmInsrncFocal("]");}


		/******************** Clm_Insrnc_Sqnc ********************************************************************************/
		if(claiminsurancei == 0) {c.addClmInsrncSqnc("[");}
		if(claiminsurance.hasSequence()) {

			c.addClmInsrncSqnc(String.valueOf(claiminsurance.getSequence()));
		} else {
			c.addClmInsrncSqnc("NULL");
		}

		if(claiminsurancei == claiminsurancelist.size()-1) {c.addClmInsrncSqnc("]");}


		/******************** Clm_Insrnc_ClmRsps ********************************************************************************/
		if(claiminsurancei == 0) {c.addClmInsrncClmRsps("[");}
		if(claiminsurance.hasClaimResponse()) {

			if(claiminsurance.getClaimResponse().getReference() != null) {
			c.addClmInsrncClmRsps(claiminsurance.getClaimResponse().getReference());
			}
		} else {
			c.addClmInsrncClmRsps("NULL");
		}

		if(claiminsurancei == claiminsurancelist.size()-1) {c.addClmInsrncClmRsps("]");}


		/******************** Clm_Insrnc_PreAuthRef ********************************************************************************/
		if(claiminsurancei == 0) {c.addClmInsrncPreAuthRef("[");}
		if(claiminsurance.hasPreAuthRef()) {

			String  array = "[";
			for(int incr=0; incr<claiminsurance.getPreAuthRef().size(); incr++) {
				array = array + claiminsurance.getPreAuthRef().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addClmInsrncPreAuthRef(array);

		} else {
			c.addClmInsrncPreAuthRef("NULL");
		}

		if(claiminsurancei == claiminsurancelist.size()-1) {c.addClmInsrncPreAuthRef("]");}


		/******************** Clm_Insrnc_Cvg ********************************************************************************/
		if(claiminsurancei == 0) {c.addClmInsrncCvg("[");}
		if(claiminsurance.hasCoverage()) {

			if(claiminsurance.getCoverage().getReference() != null) {
			c.addClmInsrncCvg(claiminsurance.getCoverage().getReference());
			}
		} else {
			c.addClmInsrncCvg("NULL");
		}

		if(claiminsurancei == claiminsurancelist.size()-1) {c.addClmInsrncCvg("]");}


		/******************** Clm_Insrnc_BusinessArrangement ********************************************************************************/
		if(claiminsurancei == 0) {c.addClmInsrncBusinessArrangement("[");}
		if(claiminsurance.hasBusinessArrangement()) {

			c.addClmInsrncBusinessArrangement(String.valueOf(claiminsurance.getBusinessArrangement()));
		} else {
			c.addClmInsrncBusinessArrangement("NULL");
		}

		if(claiminsurancei == claiminsurancelist.size()-1) {c.addClmInsrncBusinessArrangement("]");}


		 };
		/******************** claimpayee ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.PayeeComponent claimpayee = claim.getPayee();

		/******************** claimpayeetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimpayeetype = claimpayee.getType();

		/******************** Clm_Payee_Typ_Txt ********************************************************************************/
		if(claimpayeetype.hasText()) {

			c.addClmPayeeTypTxt(String.valueOf(claimpayeetype.getText()));
		} else {
			c.addClmPayeeTypTxt("NULL");
		}


		/******************** claimpayeetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimpayeetypecodinglist = claimpayeetype.getCoding();
		for(int claimpayeetypecodingi = 0; claimpayeetypecodingi<claimpayeetypecodinglist.size();claimpayeetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimpayeetypecoding = claimpayeetypecodinglist.get(claimpayeetypecodingi);

		/******************** Clm_Payee_Typ_Cdg_Dsply ********************************************************************************/
		if(claimpayeetypecodingi == 0) {c.addClmPayeeTypCdgDsply("[");}
		if(claimpayeetypecoding.hasDisplay()) {

			c.addClmPayeeTypCdgDsply(String.valueOf(claimpayeetypecoding.getDisplay()));
		} else {
			c.addClmPayeeTypCdgDsply("NULL");
		}

		if(claimpayeetypecodingi == claimpayeetypecodinglist.size()-1) {c.addClmPayeeTypCdgDsply("]");}


		/******************** Clm_Payee_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimpayeetypecodingi == 0) {c.addClmPayeeTypCdgVrsn("[");}
		if(claimpayeetypecoding.hasVersion()) {

			c.addClmPayeeTypCdgVrsn(String.valueOf(claimpayeetypecoding.getVersion()));
		} else {
			c.addClmPayeeTypCdgVrsn("NULL");
		}

		if(claimpayeetypecodingi == claimpayeetypecodinglist.size()-1) {c.addClmPayeeTypCdgVrsn("]");}


		/******************** Clm_Payee_Typ_Cdg_Cd ********************************************************************************/
		if(claimpayeetypecodingi == 0) {c.addClmPayeeTypCdgCd("[");}
		if(claimpayeetypecoding.hasCode()) {

			c.addClmPayeeTypCdgCd(String.valueOf(claimpayeetypecoding.getCode()));
		} else {
			c.addClmPayeeTypCdgCd("NULL");
		}

		if(claimpayeetypecodingi == claimpayeetypecodinglist.size()-1) {c.addClmPayeeTypCdgCd("]");}


		/******************** Clm_Payee_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimpayeetypecodingi == 0) {c.addClmPayeeTypCdgUsrSltd("[");}
		if(claimpayeetypecoding.hasUserSelected()) {

			c.addClmPayeeTypCdgUsrSltd(String.valueOf(claimpayeetypecoding.getUserSelected()));
		} else {
			c.addClmPayeeTypCdgUsrSltd("NULL");
		}

		if(claimpayeetypecodingi == claimpayeetypecodinglist.size()-1) {c.addClmPayeeTypCdgUsrSltd("]");}


		/******************** Clm_Payee_Typ_Cdg_Sys ********************************************************************************/
		if(claimpayeetypecodingi == 0) {c.addClmPayeeTypCdgSys("[");}
		if(claimpayeetypecoding.hasSystem()) {

			c.addClmPayeeTypCdgSys(String.valueOf(claimpayeetypecoding.getSystem()));
		} else {
			c.addClmPayeeTypCdgSys("NULL");
		}

		if(claimpayeetypecodingi == claimpayeetypecodinglist.size()-1) {c.addClmPayeeTypCdgSys("]");}


		 };
		/******************** Clm_Payee_Party ********************************************************************************/
		if(claimpayee.hasParty()) {

			if(claimpayee.getParty().getReference() != null) {
			c.addClmPayeeParty(claimpayee.getParty().getReference());
			}
		} else {
			c.addClmPayeeParty("NULL");
		}


		/******************** Clm_Pnt ********************************************************************************/
		if(claim.hasPatient()) {

			if(claim.getPatient().getReference() != null) {
			c.addClmPnt(claim.getPatient().getReference());
			}
		} else {
			c.addClmPnt("NULL");
		}


		/******************** Clm_Insurer ********************************************************************************/
		if(claim.hasInsurer()) {

			if(claim.getInsurer().getReference() != null) {
			c.addClmInsurer(claim.getInsurer().getReference());
			}
		} else {
			c.addClmInsurer("NULL");
		}


		/******************** claimsubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimsubtype = claim.getSubType();

		/******************** Clm_SubTyp_Txt ********************************************************************************/
		if(claimsubtype.hasText()) {

			c.addClmSubTypTxt(String.valueOf(claimsubtype.getText()));
		} else {
			c.addClmSubTypTxt("NULL");
		}


		/******************** claimsubtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimsubtypecodinglist = claimsubtype.getCoding();
		for(int claimsubtypecodingi = 0; claimsubtypecodingi<claimsubtypecodinglist.size();claimsubtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimsubtypecoding = claimsubtypecodinglist.get(claimsubtypecodingi);

		/******************** Clm_SubTyp_Cdg_Dsply ********************************************************************************/
		if(claimsubtypecodingi == 0) {c.addClmSubTypCdgDsply("[");}
		if(claimsubtypecoding.hasDisplay()) {

			c.addClmSubTypCdgDsply(String.valueOf(claimsubtypecoding.getDisplay()));
		} else {
			c.addClmSubTypCdgDsply("NULL");
		}

		if(claimsubtypecodingi == claimsubtypecodinglist.size()-1) {c.addClmSubTypCdgDsply("]");}


		/******************** Clm_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(claimsubtypecodingi == 0) {c.addClmSubTypCdgVrsn("[");}
		if(claimsubtypecoding.hasVersion()) {

			c.addClmSubTypCdgVrsn(String.valueOf(claimsubtypecoding.getVersion()));
		} else {
			c.addClmSubTypCdgVrsn("NULL");
		}

		if(claimsubtypecodingi == claimsubtypecodinglist.size()-1) {c.addClmSubTypCdgVrsn("]");}


		/******************** Clm_SubTyp_Cdg_Cd ********************************************************************************/
		if(claimsubtypecodingi == 0) {c.addClmSubTypCdgCd("[");}
		if(claimsubtypecoding.hasCode()) {

			c.addClmSubTypCdgCd(String.valueOf(claimsubtypecoding.getCode()));
		} else {
			c.addClmSubTypCdgCd("NULL");
		}

		if(claimsubtypecodingi == claimsubtypecodinglist.size()-1) {c.addClmSubTypCdgCd("]");}


		/******************** Clm_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(claimsubtypecodingi == 0) {c.addClmSubTypCdgUsrSltd("[");}
		if(claimsubtypecoding.hasUserSelected()) {

			c.addClmSubTypCdgUsrSltd(String.valueOf(claimsubtypecoding.getUserSelected()));
		} else {
			c.addClmSubTypCdgUsrSltd("NULL");
		}

		if(claimsubtypecodingi == claimsubtypecodinglist.size()-1) {c.addClmSubTypCdgUsrSltd("]");}


		/******************** Clm_SubTyp_Cdg_Sys ********************************************************************************/
		if(claimsubtypecodingi == 0) {c.addClmSubTypCdgSys("[");}
		if(claimsubtypecoding.hasSystem()) {

			c.addClmSubTypCdgSys(String.valueOf(claimsubtypecoding.getSystem()));
		} else {
			c.addClmSubTypCdgSys("NULL");
		}

		if(claimsubtypecodingi == claimsubtypecodinglist.size()-1) {c.addClmSubTypCdgSys("]");}


		 };
		/******************** claimdiagnosis ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Claim.DiagnosisComponent> claimdiagnosislist = claim.getDiagnosis();
		for(int claimdiagnosisi = 0; claimdiagnosisi<claimdiagnosislist.size();claimdiagnosisi++ ) {
		org.hl7.fhir.r4.model.Claim.DiagnosisComponent  claimdiagnosis = claimdiagnosislist.get(claimdiagnosisi);

		/******************** claimdiagnosistype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> claimdiagnosistypelist = claimdiagnosis.getType();
		for(int claimdiagnosistypei = 0; claimdiagnosistypei<claimdiagnosistypelist.size();claimdiagnosistypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  claimdiagnosistype = claimdiagnosistypelist.get(claimdiagnosistypei);

		/******************** Clm_Dgnsis_Typ_Txt ********************************************************************************/
		if(claimdiagnosistypei == 0) {c.addClmDgnsisTypTxt("[[");}
		if(claimdiagnosistype.hasText()) {

			c.addClmDgnsisTypTxt(String.valueOf(claimdiagnosistype.getText()));
		} else {
			c.addClmDgnsisTypTxt("NULL");
		}

		if(claimdiagnosistypei == claimdiagnosistypelist.size()-1) {c.addClmDgnsisTypTxt("]]");}


		/******************** claimdiagnosistypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimdiagnosistypecodinglist = claimdiagnosistype.getCoding();
		for(int claimdiagnosistypecodingi = 0; claimdiagnosistypecodingi<claimdiagnosistypecodinglist.size();claimdiagnosistypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimdiagnosistypecoding = claimdiagnosistypecodinglist.get(claimdiagnosistypecodingi);

		/******************** Clm_Dgnsis_Typ_Cdg_Dsply ********************************************************************************/
		if(claimdiagnosistypecodingi == 0) {c.addClmDgnsisTypCdgDsply("[[[");}
		if(claimdiagnosistypecoding.hasDisplay()) {

			c.addClmDgnsisTypCdgDsply(String.valueOf(claimdiagnosistypecoding.getDisplay()));
		} else {
			c.addClmDgnsisTypCdgDsply("NULL");
		}

		if(claimdiagnosistypecodingi == claimdiagnosistypecodinglist.size()-1) {c.addClmDgnsisTypCdgDsply("]]]");}


		/******************** Clm_Dgnsis_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimdiagnosistypecodingi == 0) {c.addClmDgnsisTypCdgVrsn("[[[");}
		if(claimdiagnosistypecoding.hasVersion()) {

			c.addClmDgnsisTypCdgVrsn(String.valueOf(claimdiagnosistypecoding.getVersion()));
		} else {
			c.addClmDgnsisTypCdgVrsn("NULL");
		}

		if(claimdiagnosistypecodingi == claimdiagnosistypecodinglist.size()-1) {c.addClmDgnsisTypCdgVrsn("]]]");}


		/******************** Clm_Dgnsis_Typ_Cdg_Cd ********************************************************************************/
		if(claimdiagnosistypecodingi == 0) {c.addClmDgnsisTypCdgCd("[[[");}
		if(claimdiagnosistypecoding.hasCode()) {

			c.addClmDgnsisTypCdgCd(String.valueOf(claimdiagnosistypecoding.getCode()));
		} else {
			c.addClmDgnsisTypCdgCd("NULL");
		}

		if(claimdiagnosistypecodingi == claimdiagnosistypecodinglist.size()-1) {c.addClmDgnsisTypCdgCd("]]]");}


		/******************** Clm_Dgnsis_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimdiagnosistypecodingi == 0) {c.addClmDgnsisTypCdgUsrSltd("[[[");}
		if(claimdiagnosistypecoding.hasUserSelected()) {

			c.addClmDgnsisTypCdgUsrSltd(String.valueOf(claimdiagnosistypecoding.getUserSelected()));
		} else {
			c.addClmDgnsisTypCdgUsrSltd("NULL");
		}

		if(claimdiagnosistypecodingi == claimdiagnosistypecodinglist.size()-1) {c.addClmDgnsisTypCdgUsrSltd("]]]");}


		/******************** Clm_Dgnsis_Typ_Cdg_Sys ********************************************************************************/
		if(claimdiagnosistypecodingi == 0) {c.addClmDgnsisTypCdgSys("[[[");}
		if(claimdiagnosistypecoding.hasSystem()) {

			c.addClmDgnsisTypCdgSys(String.valueOf(claimdiagnosistypecoding.getSystem()));
		} else {
			c.addClmDgnsisTypCdgSys("NULL");
		}

		if(claimdiagnosistypecodingi == claimdiagnosistypecodinglist.size()-1) {c.addClmDgnsisTypCdgSys("]]]");}


		 };
		 };
		/******************** Clm_Dgnsis_Sqnc ********************************************************************************/
		if(claimdiagnosis.hasSequence()) {

			c.addClmDgnsisSqnc(String.valueOf(claimdiagnosis.getSequence()));
		} else {
			c.addClmDgnsisSqnc("NULL");
		}


		/******************** claimdiagnosisdiagnosiscodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimdiagnosisdiagnosiscodeableconcept = claimdiagnosis.getDiagnosisCodeableConcept();

		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Txt ********************************************************************************/
		if(claimdiagnosisdiagnosiscodeableconcept.hasText()) {

			c.addClmDgnsisDgnsisCdbleCncptTxt(String.valueOf(claimdiagnosisdiagnosiscodeableconcept.getText()));
		} else {
			c.addClmDgnsisDgnsisCdbleCncptTxt("NULL");
		}


		/******************** claimdiagnosisdiagnosiscodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimdiagnosisdiagnosiscodeableconceptcodinglist = claimdiagnosisdiagnosiscodeableconcept.getCoding();
		for(int claimdiagnosisdiagnosiscodeableconceptcodingi = 0; claimdiagnosisdiagnosiscodeableconceptcodingi<claimdiagnosisdiagnosiscodeableconceptcodinglist.size();claimdiagnosisdiagnosiscodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimdiagnosisdiagnosiscodeableconceptcoding = claimdiagnosisdiagnosiscodeableconceptcodinglist.get(claimdiagnosisdiagnosiscodeableconceptcodingi);

		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(claimdiagnosisdiagnosiscodeableconceptcodingi == 0) {c.addClmDgnsisDgnsisCdbleCncptCdgDsply("[[");}
		if(claimdiagnosisdiagnosiscodeableconceptcoding.hasDisplay()) {

			c.addClmDgnsisDgnsisCdbleCncptCdgDsply(String.valueOf(claimdiagnosisdiagnosiscodeableconceptcoding.getDisplay()));
		} else {
			c.addClmDgnsisDgnsisCdbleCncptCdgDsply("NULL");
		}

		if(claimdiagnosisdiagnosiscodeableconceptcodingi == claimdiagnosisdiagnosiscodeableconceptcodinglist.size()-1) {c.addClmDgnsisDgnsisCdbleCncptCdgDsply("]]");}


		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(claimdiagnosisdiagnosiscodeableconceptcodingi == 0) {c.addClmDgnsisDgnsisCdbleCncptCdgVrsn("[[");}
		if(claimdiagnosisdiagnosiscodeableconceptcoding.hasVersion()) {

			c.addClmDgnsisDgnsisCdbleCncptCdgVrsn(String.valueOf(claimdiagnosisdiagnosiscodeableconceptcoding.getVersion()));
		} else {
			c.addClmDgnsisDgnsisCdbleCncptCdgVrsn("NULL");
		}

		if(claimdiagnosisdiagnosiscodeableconceptcodingi == claimdiagnosisdiagnosiscodeableconceptcodinglist.size()-1) {c.addClmDgnsisDgnsisCdbleCncptCdgVrsn("]]");}


		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(claimdiagnosisdiagnosiscodeableconceptcodingi == 0) {c.addClmDgnsisDgnsisCdbleCncptCdgCd("[[");}
		if(claimdiagnosisdiagnosiscodeableconceptcoding.hasCode()) {

			c.addClmDgnsisDgnsisCdbleCncptCdgCd(String.valueOf(claimdiagnosisdiagnosiscodeableconceptcoding.getCode()));
		} else {
			c.addClmDgnsisDgnsisCdbleCncptCdgCd("NULL");
		}

		if(claimdiagnosisdiagnosiscodeableconceptcodingi == claimdiagnosisdiagnosiscodeableconceptcodinglist.size()-1) {c.addClmDgnsisDgnsisCdbleCncptCdgCd("]]");}


		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(claimdiagnosisdiagnosiscodeableconceptcodingi == 0) {c.addClmDgnsisDgnsisCdbleCncptCdgUsrSltd("[[");}
		if(claimdiagnosisdiagnosiscodeableconceptcoding.hasUserSelected()) {

			c.addClmDgnsisDgnsisCdbleCncptCdgUsrSltd(String.valueOf(claimdiagnosisdiagnosiscodeableconceptcoding.getUserSelected()));
		} else {
			c.addClmDgnsisDgnsisCdbleCncptCdgUsrSltd("NULL");
		}

		if(claimdiagnosisdiagnosiscodeableconceptcodingi == claimdiagnosisdiagnosiscodeableconceptcodinglist.size()-1) {c.addClmDgnsisDgnsisCdbleCncptCdgUsrSltd("]]");}


		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(claimdiagnosisdiagnosiscodeableconceptcodingi == 0) {c.addClmDgnsisDgnsisCdbleCncptCdgSys("[[");}
		if(claimdiagnosisdiagnosiscodeableconceptcoding.hasSystem()) {

			c.addClmDgnsisDgnsisCdbleCncptCdgSys(String.valueOf(claimdiagnosisdiagnosiscodeableconceptcoding.getSystem()));
		} else {
			c.addClmDgnsisDgnsisCdbleCncptCdgSys("NULL");
		}

		if(claimdiagnosisdiagnosiscodeableconceptcodingi == claimdiagnosisdiagnosiscodeableconceptcodinglist.size()-1) {c.addClmDgnsisDgnsisCdbleCncptCdgSys("]]");}


		 };
		/******************** claimdiagnosispackagecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimdiagnosispackagecode = claimdiagnosis.getPackageCode();

		/******************** Clm_Dgnsis_PckgCd_Txt ********************************************************************************/
		if(claimdiagnosispackagecode.hasText()) {

			c.addClmDgnsisPckgCdTxt(String.valueOf(claimdiagnosispackagecode.getText()));
		} else {
			c.addClmDgnsisPckgCdTxt("NULL");
		}


		/******************** claimdiagnosispackagecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimdiagnosispackagecodecodinglist = claimdiagnosispackagecode.getCoding();
		for(int claimdiagnosispackagecodecodingi = 0; claimdiagnosispackagecodecodingi<claimdiagnosispackagecodecodinglist.size();claimdiagnosispackagecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimdiagnosispackagecodecoding = claimdiagnosispackagecodecodinglist.get(claimdiagnosispackagecodecodingi);

		/******************** Clm_Dgnsis_PckgCd_Cdg_Dsply ********************************************************************************/
		if(claimdiagnosispackagecodecodingi == 0) {c.addClmDgnsisPckgCdCdgDsply("[[");}
		if(claimdiagnosispackagecodecoding.hasDisplay()) {

			c.addClmDgnsisPckgCdCdgDsply(String.valueOf(claimdiagnosispackagecodecoding.getDisplay()));
		} else {
			c.addClmDgnsisPckgCdCdgDsply("NULL");
		}

		if(claimdiagnosispackagecodecodingi == claimdiagnosispackagecodecodinglist.size()-1) {c.addClmDgnsisPckgCdCdgDsply("]]");}


		/******************** Clm_Dgnsis_PckgCd_Cdg_Vrsn ********************************************************************************/
		if(claimdiagnosispackagecodecodingi == 0) {c.addClmDgnsisPckgCdCdgVrsn("[[");}
		if(claimdiagnosispackagecodecoding.hasVersion()) {

			c.addClmDgnsisPckgCdCdgVrsn(String.valueOf(claimdiagnosispackagecodecoding.getVersion()));
		} else {
			c.addClmDgnsisPckgCdCdgVrsn("NULL");
		}

		if(claimdiagnosispackagecodecodingi == claimdiagnosispackagecodecodinglist.size()-1) {c.addClmDgnsisPckgCdCdgVrsn("]]");}


		/******************** Clm_Dgnsis_PckgCd_Cdg_Cd ********************************************************************************/
		if(claimdiagnosispackagecodecodingi == 0) {c.addClmDgnsisPckgCdCdgCd("[[");}
		if(claimdiagnosispackagecodecoding.hasCode()) {

			c.addClmDgnsisPckgCdCdgCd(String.valueOf(claimdiagnosispackagecodecoding.getCode()));
		} else {
			c.addClmDgnsisPckgCdCdgCd("NULL");
		}

		if(claimdiagnosispackagecodecodingi == claimdiagnosispackagecodecodinglist.size()-1) {c.addClmDgnsisPckgCdCdgCd("]]");}


		/******************** Clm_Dgnsis_PckgCd_Cdg_UsrSltd ********************************************************************************/
		if(claimdiagnosispackagecodecodingi == 0) {c.addClmDgnsisPckgCdCdgUsrSltd("[[");}
		if(claimdiagnosispackagecodecoding.hasUserSelected()) {

			c.addClmDgnsisPckgCdCdgUsrSltd(String.valueOf(claimdiagnosispackagecodecoding.getUserSelected()));
		} else {
			c.addClmDgnsisPckgCdCdgUsrSltd("NULL");
		}

		if(claimdiagnosispackagecodecodingi == claimdiagnosispackagecodecodinglist.size()-1) {c.addClmDgnsisPckgCdCdgUsrSltd("]]");}


		/******************** Clm_Dgnsis_PckgCd_Cdg_Sys ********************************************************************************/
		if(claimdiagnosispackagecodecodingi == 0) {c.addClmDgnsisPckgCdCdgSys("[[");}
		if(claimdiagnosispackagecodecoding.hasSystem()) {

			c.addClmDgnsisPckgCdCdgSys(String.valueOf(claimdiagnosispackagecodecoding.getSystem()));
		} else {
			c.addClmDgnsisPckgCdCdgSys("NULL");
		}

		if(claimdiagnosispackagecodecodingi == claimdiagnosispackagecodecodinglist.size()-1) {c.addClmDgnsisPckgCdCdgSys("]]");}


		 };
		/******************** claimdiagnosisonadmission ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimdiagnosisonadmission = claimdiagnosis.getOnAdmission();

		/******************** Clm_Dgnsis_OnAdmission_Txt ********************************************************************************/
		if(claimdiagnosisonadmission.hasText()) {

			c.addClmDgnsisOnAdmissionTxt(String.valueOf(claimdiagnosisonadmission.getText()));
		} else {
			c.addClmDgnsisOnAdmissionTxt("NULL");
		}


		/******************** claimdiagnosisonadmissioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> claimdiagnosisonadmissioncodinglist = claimdiagnosisonadmission.getCoding();
		for(int claimdiagnosisonadmissioncodingi = 0; claimdiagnosisonadmissioncodingi<claimdiagnosisonadmissioncodinglist.size();claimdiagnosisonadmissioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  claimdiagnosisonadmissioncoding = claimdiagnosisonadmissioncodinglist.get(claimdiagnosisonadmissioncodingi);

		/******************** Clm_Dgnsis_OnAdmission_Cdg_Dsply ********************************************************************************/
		if(claimdiagnosisonadmissioncodingi == 0) {c.addClmDgnsisOnAdmissionCdgDsply("[[");}
		if(claimdiagnosisonadmissioncoding.hasDisplay()) {

			c.addClmDgnsisOnAdmissionCdgDsply(String.valueOf(claimdiagnosisonadmissioncoding.getDisplay()));
		} else {
			c.addClmDgnsisOnAdmissionCdgDsply("NULL");
		}

		if(claimdiagnosisonadmissioncodingi == claimdiagnosisonadmissioncodinglist.size()-1) {c.addClmDgnsisOnAdmissionCdgDsply("]]");}


		/******************** Clm_Dgnsis_OnAdmission_Cdg_Vrsn ********************************************************************************/
		if(claimdiagnosisonadmissioncodingi == 0) {c.addClmDgnsisOnAdmissionCdgVrsn("[[");}
		if(claimdiagnosisonadmissioncoding.hasVersion()) {

			c.addClmDgnsisOnAdmissionCdgVrsn(String.valueOf(claimdiagnosisonadmissioncoding.getVersion()));
		} else {
			c.addClmDgnsisOnAdmissionCdgVrsn("NULL");
		}

		if(claimdiagnosisonadmissioncodingi == claimdiagnosisonadmissioncodinglist.size()-1) {c.addClmDgnsisOnAdmissionCdgVrsn("]]");}


		/******************** Clm_Dgnsis_OnAdmission_Cdg_Cd ********************************************************************************/
		if(claimdiagnosisonadmissioncodingi == 0) {c.addClmDgnsisOnAdmissionCdgCd("[[");}
		if(claimdiagnosisonadmissioncoding.hasCode()) {

			c.addClmDgnsisOnAdmissionCdgCd(String.valueOf(claimdiagnosisonadmissioncoding.getCode()));
		} else {
			c.addClmDgnsisOnAdmissionCdgCd("NULL");
		}

		if(claimdiagnosisonadmissioncodingi == claimdiagnosisonadmissioncodinglist.size()-1) {c.addClmDgnsisOnAdmissionCdgCd("]]");}


		/******************** Clm_Dgnsis_OnAdmission_Cdg_UsrSltd ********************************************************************************/
		if(claimdiagnosisonadmissioncodingi == 0) {c.addClmDgnsisOnAdmissionCdgUsrSltd("[[");}
		if(claimdiagnosisonadmissioncoding.hasUserSelected()) {

			c.addClmDgnsisOnAdmissionCdgUsrSltd(String.valueOf(claimdiagnosisonadmissioncoding.getUserSelected()));
		} else {
			c.addClmDgnsisOnAdmissionCdgUsrSltd("NULL");
		}

		if(claimdiagnosisonadmissioncodingi == claimdiagnosisonadmissioncodinglist.size()-1) {c.addClmDgnsisOnAdmissionCdgUsrSltd("]]");}


		/******************** Clm_Dgnsis_OnAdmission_Cdg_Sys ********************************************************************************/
		if(claimdiagnosisonadmissioncodingi == 0) {c.addClmDgnsisOnAdmissionCdgSys("[[");}
		if(claimdiagnosisonadmissioncoding.hasSystem()) {

			c.addClmDgnsisOnAdmissionCdgSys(String.valueOf(claimdiagnosisonadmissioncoding.getSystem()));
		} else {
			c.addClmDgnsisOnAdmissionCdgSys("NULL");
		}

		if(claimdiagnosisonadmissioncodingi == claimdiagnosisonadmissioncodinglist.size()-1) {c.addClmDgnsisOnAdmissionCdgSys("]]");}


		 };
		 };
		return c;
	}
}
