package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ExplanationOfBenefit;
public class ExplanationOfBenefitBidirectionalConversion 
{
	public ExplanationOfBenefit ExplanationOfBenefits(org.hl7.fhir.r4.model.ExplanationOfBenefit explanationofbenefit) throws ParseException
	{
		 main.java.com.campfhir.model.ExplanationOfBenefit e = new  main.java.com.campfhir.model.ExplanationOfBenefit();

		/******************** id ********************************************************************************/
		e.setId(explanationofbenefit.getIdElement().getIdPart());

		/******************** explanationofbenefitpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitpriority = explanationofbenefit.getPriority();

		/******************** ExplntnOfBnft_Priority_Txt ********************************************************************************/
		if(explanationofbenefitpriority.hasText()) {

			e.addExplntnOfBnftPriorityTxt(String.valueOf(explanationofbenefitpriority.getText()));
		} else {
			e.addExplntnOfBnftPriorityTxt("NULL");
		}


		/******************** explanationofbenefitprioritycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitprioritycodinglist = explanationofbenefitpriority.getCoding();
		for(int explanationofbenefitprioritycodingi = 0; explanationofbenefitprioritycodingi<explanationofbenefitprioritycodinglist.size();explanationofbenefitprioritycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitprioritycoding = explanationofbenefitprioritycodinglist.get(explanationofbenefitprioritycodingi);

		/******************** ExplntnOfBnft_Priority_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitprioritycodingi == 0) {e.addExplntnOfBnftPriorityCdgDsply("[");}
		if(explanationofbenefitprioritycoding.hasDisplay()) {

			e.addExplntnOfBnftPriorityCdgDsply(String.valueOf(explanationofbenefitprioritycoding.getDisplay()));
		} else {
			e.addExplntnOfBnftPriorityCdgDsply("NULL");
		}

		if(explanationofbenefitprioritycodingi == explanationofbenefitprioritycodinglist.size()-1) {e.addExplntnOfBnftPriorityCdgDsply("]");}


		/******************** ExplntnOfBnft_Priority_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitprioritycodingi == 0) {e.addExplntnOfBnftPriorityCdgVrsn("[");}
		if(explanationofbenefitprioritycoding.hasVersion()) {

			e.addExplntnOfBnftPriorityCdgVrsn(String.valueOf(explanationofbenefitprioritycoding.getVersion()));
		} else {
			e.addExplntnOfBnftPriorityCdgVrsn("NULL");
		}

		if(explanationofbenefitprioritycodingi == explanationofbenefitprioritycodinglist.size()-1) {e.addExplntnOfBnftPriorityCdgVrsn("]");}


		/******************** ExplntnOfBnft_Priority_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitprioritycodingi == 0) {e.addExplntnOfBnftPriorityCdgCd("[");}
		if(explanationofbenefitprioritycoding.hasCode()) {

			e.addExplntnOfBnftPriorityCdgCd(String.valueOf(explanationofbenefitprioritycoding.getCode()));
		} else {
			e.addExplntnOfBnftPriorityCdgCd("NULL");
		}

		if(explanationofbenefitprioritycodingi == explanationofbenefitprioritycodinglist.size()-1) {e.addExplntnOfBnftPriorityCdgCd("]");}


		/******************** ExplntnOfBnft_Priority_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitprioritycodingi == 0) {e.addExplntnOfBnftPriorityCdgUsrSltd("[");}
		if(explanationofbenefitprioritycoding.hasUserSelected()) {

			e.addExplntnOfBnftPriorityCdgUsrSltd(String.valueOf(explanationofbenefitprioritycoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftPriorityCdgUsrSltd("NULL");
		}

		if(explanationofbenefitprioritycodingi == explanationofbenefitprioritycodinglist.size()-1) {e.addExplntnOfBnftPriorityCdgUsrSltd("]");}


		/******************** ExplntnOfBnft_Priority_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitprioritycodingi == 0) {e.addExplntnOfBnftPriorityCdgSys("[");}
		if(explanationofbenefitprioritycoding.hasSystem()) {

			e.addExplntnOfBnftPriorityCdgSys(String.valueOf(explanationofbenefitprioritycoding.getSystem()));
		} else {
			e.addExplntnOfBnftPriorityCdgSys("NULL");
		}

		if(explanationofbenefitprioritycodingi == explanationofbenefitprioritycodinglist.size()-1) {e.addExplntnOfBnftPriorityCdgSys("]");}


		 };
		/******************** explanationofbenefittype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefittype = explanationofbenefit.getType();

		/******************** ExplntnOfBnft_Typ_Txt ********************************************************************************/
		if(explanationofbenefittype.hasText()) {

			e.addExplntnOfBnftTypTxt(String.valueOf(explanationofbenefittype.getText()));
		} else {
			e.addExplntnOfBnftTypTxt("NULL");
		}


		/******************** explanationofbenefittypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefittypecodinglist = explanationofbenefittype.getCoding();
		for(int explanationofbenefittypecodingi = 0; explanationofbenefittypecodingi<explanationofbenefittypecodinglist.size();explanationofbenefittypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefittypecoding = explanationofbenefittypecodinglist.get(explanationofbenefittypecodingi);

		/******************** ExplntnOfBnft_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefittypecodingi == 0) {e.addExplntnOfBnftTypCdgDsply("[");}
		if(explanationofbenefittypecoding.hasDisplay()) {

			e.addExplntnOfBnftTypCdgDsply(String.valueOf(explanationofbenefittypecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftTypCdgDsply("NULL");
		}

		if(explanationofbenefittypecodingi == explanationofbenefittypecodinglist.size()-1) {e.addExplntnOfBnftTypCdgDsply("]");}


		/******************** ExplntnOfBnft_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefittypecodingi == 0) {e.addExplntnOfBnftTypCdgVrsn("[");}
		if(explanationofbenefittypecoding.hasVersion()) {

			e.addExplntnOfBnftTypCdgVrsn(String.valueOf(explanationofbenefittypecoding.getVersion()));
		} else {
			e.addExplntnOfBnftTypCdgVrsn("NULL");
		}

		if(explanationofbenefittypecodingi == explanationofbenefittypecodinglist.size()-1) {e.addExplntnOfBnftTypCdgVrsn("]");}


		/******************** ExplntnOfBnft_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefittypecodingi == 0) {e.addExplntnOfBnftTypCdgCd("[");}
		if(explanationofbenefittypecoding.hasCode()) {

			e.addExplntnOfBnftTypCdgCd(String.valueOf(explanationofbenefittypecoding.getCode()));
		} else {
			e.addExplntnOfBnftTypCdgCd("NULL");
		}

		if(explanationofbenefittypecodingi == explanationofbenefittypecodinglist.size()-1) {e.addExplntnOfBnftTypCdgCd("]");}


		/******************** ExplntnOfBnft_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefittypecodingi == 0) {e.addExplntnOfBnftTypCdgUsrSltd("[");}
		if(explanationofbenefittypecoding.hasUserSelected()) {

			e.addExplntnOfBnftTypCdgUsrSltd(String.valueOf(explanationofbenefittypecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftTypCdgUsrSltd("NULL");
		}

		if(explanationofbenefittypecodingi == explanationofbenefittypecodinglist.size()-1) {e.addExplntnOfBnftTypCdgUsrSltd("]");}


		/******************** ExplntnOfBnft_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefittypecodingi == 0) {e.addExplntnOfBnftTypCdgSys("[");}
		if(explanationofbenefittypecoding.hasSystem()) {

			e.addExplntnOfBnftTypCdgSys(String.valueOf(explanationofbenefittypecoding.getSystem()));
		} else {
			e.addExplntnOfBnftTypCdgSys("NULL");
		}

		if(explanationofbenefittypecodingi == explanationofbenefittypecodinglist.size()-1) {e.addExplntnOfBnftTypCdgSys("]");}


		 };
		/******************** ExplntnOfBnft_Provider ********************************************************************************/
		if(explanationofbenefit.hasProvider()) {

			if(explanationofbenefit.getProvider().getReference() != null) {
			e.addExplntnOfBnftProvider(explanationofbenefit.getProvider().getReference());
			}
		} else {
			e.addExplntnOfBnftProvider("NULL");
		}


		/******************** explanationofbenefititem ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.ItemComponent> explanationofbenefititemlist = explanationofbenefit.getItem();
		for(int explanationofbenefititemi = 0; explanationofbenefititemi<explanationofbenefititemlist.size();explanationofbenefititemi++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.ItemComponent  explanationofbenefititem = explanationofbenefititemlist.get(explanationofbenefititemi);

		/******************** ExplntnOfBnft_Itm_Enc ********************************************************************************/
		if(explanationofbenefititemi == 0) {e.addExplntnOfBnftItmEnc("[");}
		if(explanationofbenefititem.hasEncounter()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefititem.getEncounter().size(); incr++) {
				array = array + explanationofbenefititem.getEncounter().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftItmEnc(array);

		} else {
			e.addExplntnOfBnftItmEnc("NULL");
		}

		if(explanationofbenefititemi == explanationofbenefititemlist.size()-1) {e.addExplntnOfBnftItmEnc("]");}


		/******************** explanationofbenefititemunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemunitprice = explanationofbenefititem.getUnitPrice();

		/******************** ExplntnOfBnft_Itm_UntPrice_Vl ********************************************************************************/
		if(explanationofbenefititemi == 0) {e.addExplntnOfBnftItmUntPriceVl("[");}
		if(explanationofbenefititemunitprice.hasValue()) {

			e.addExplntnOfBnftItmUntPriceVl(String.valueOf(explanationofbenefititemunitprice.getValue()));
		} else {
			e.addExplntnOfBnftItmUntPriceVl("NULL");
		}

		if(explanationofbenefititemi == explanationofbenefititemlist.size()-1) {e.addExplntnOfBnftItmUntPriceVl("]");}


		/******************** ExplntnOfBnft_Itm_UntPrice_Crncy ********************************************************************************/
		if(explanationofbenefititemi == 0) {e.addExplntnOfBnftItmUntPriceCrncy("[");}
		if(explanationofbenefititemunitprice.hasCurrency()) {

			e.addExplntnOfBnftItmUntPriceCrncy(String.valueOf(explanationofbenefititemunitprice.getCurrency()));
		} else {
			e.addExplntnOfBnftItmUntPriceCrncy("NULL");
		}

		if(explanationofbenefititemi == explanationofbenefititemlist.size()-1) {e.addExplntnOfBnftItmUntPriceCrncy("]");}


		/******************** explanationofbenefititemdetail ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.DetailComponent> explanationofbenefititemdetaillist = explanationofbenefititem.getDetail();
		for(int explanationofbenefititemdetaili = 0; explanationofbenefititemdetaili<explanationofbenefititemdetaillist.size();explanationofbenefititemdetaili++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.DetailComponent  explanationofbenefititemdetail = explanationofbenefititemdetaillist.get(explanationofbenefititemdetaili);

		/******************** explanationofbenefititemdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemdetailunitprice = explanationofbenefititemdetail.getUnitPrice();

		/******************** ExplntnOfBnft_Itm_Dtl_UntPrice_Vl ********************************************************************************/
		if(explanationofbenefititemdetaili == 0) {e.addExplntnOfBnftItmDtlUntPriceVl("[[");}
		if(explanationofbenefititemdetailunitprice.hasValue()) {

			e.addExplntnOfBnftItmDtlUntPriceVl(String.valueOf(explanationofbenefititemdetailunitprice.getValue()));
		} else {
			e.addExplntnOfBnftItmDtlUntPriceVl("NULL");
		}

		if(explanationofbenefititemdetaili == explanationofbenefititemdetaillist.size()-1) {e.addExplntnOfBnftItmDtlUntPriceVl("]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_UntPrice_Crncy ********************************************************************************/
		if(explanationofbenefititemdetaili == 0) {e.addExplntnOfBnftItmDtlUntPriceCrncy("[[");}
		if(explanationofbenefititemdetailunitprice.hasCurrency()) {

			e.addExplntnOfBnftItmDtlUntPriceCrncy(String.valueOf(explanationofbenefititemdetailunitprice.getCurrency()));
		} else {
			e.addExplntnOfBnftItmDtlUntPriceCrncy("NULL");
		}

		if(explanationofbenefititemdetaili == explanationofbenefititemdetaillist.size()-1) {e.addExplntnOfBnftItmDtlUntPriceCrncy("]]");}


		/******************** explanationofbenefititemdetailcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailcategory = explanationofbenefititemdetail.getCategory();

		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefititemdetaili == 0) {e.addExplntnOfBnftItmDtlCtgryTxt("[[");}
		if(explanationofbenefititemdetailcategory.hasText()) {

			e.addExplntnOfBnftItmDtlCtgryTxt(String.valueOf(explanationofbenefititemdetailcategory.getText()));
		} else {
			e.addExplntnOfBnftItmDtlCtgryTxt("NULL");
		}

		if(explanationofbenefititemdetaili == explanationofbenefititemdetaillist.size()-1) {e.addExplntnOfBnftItmDtlCtgryTxt("]]");}


		/******************** explanationofbenefititemdetailcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemdetailcategorycodinglist = explanationofbenefititemdetailcategory.getCoding();
		for(int explanationofbenefititemdetailcategorycodingi = 0; explanationofbenefititemdetailcategorycodingi<explanationofbenefititemdetailcategorycodinglist.size();explanationofbenefititemdetailcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemdetailcategorycoding = explanationofbenefititemdetailcategorycodinglist.get(explanationofbenefititemdetailcategorycodingi);

		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailcategorycodingi == 0) {e.addExplntnOfBnftItmDtlCtgryCdgDsply("[[[");}
		if(explanationofbenefititemdetailcategorycoding.hasDisplay()) {

			e.addExplntnOfBnftItmDtlCtgryCdgDsply(String.valueOf(explanationofbenefititemdetailcategorycoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmDtlCtgryCdgDsply("NULL");
		}

		if(explanationofbenefititemdetailcategorycodingi == explanationofbenefititemdetailcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlCtgryCdgDsply("]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailcategorycodingi == 0) {e.addExplntnOfBnftItmDtlCtgryCdgVrsn("[[[");}
		if(explanationofbenefititemdetailcategorycoding.hasVersion()) {

			e.addExplntnOfBnftItmDtlCtgryCdgVrsn(String.valueOf(explanationofbenefititemdetailcategorycoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmDtlCtgryCdgVrsn("NULL");
		}

		if(explanationofbenefititemdetailcategorycodingi == explanationofbenefititemdetailcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlCtgryCdgVrsn("]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailcategorycodingi == 0) {e.addExplntnOfBnftItmDtlCtgryCdgCd("[[[");}
		if(explanationofbenefititemdetailcategorycoding.hasCode()) {

			e.addExplntnOfBnftItmDtlCtgryCdgCd(String.valueOf(explanationofbenefititemdetailcategorycoding.getCode()));
		} else {
			e.addExplntnOfBnftItmDtlCtgryCdgCd("NULL");
		}

		if(explanationofbenefititemdetailcategorycodingi == explanationofbenefititemdetailcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlCtgryCdgCd("]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailcategorycodingi == 0) {e.addExplntnOfBnftItmDtlCtgryCdgUsrSltd("[[[");}
		if(explanationofbenefititemdetailcategorycoding.hasUserSelected()) {

			e.addExplntnOfBnftItmDtlCtgryCdgUsrSltd(String.valueOf(explanationofbenefititemdetailcategorycoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmDtlCtgryCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemdetailcategorycodingi == explanationofbenefititemdetailcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlCtgryCdgUsrSltd("]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailcategorycodingi == 0) {e.addExplntnOfBnftItmDtlCtgryCdgSys("[[[");}
		if(explanationofbenefititemdetailcategorycoding.hasSystem()) {

			e.addExplntnOfBnftItmDtlCtgryCdgSys(String.valueOf(explanationofbenefititemdetailcategorycoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmDtlCtgryCdgSys("NULL");
		}

		if(explanationofbenefititemdetailcategorycodingi == explanationofbenefititemdetailcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlCtgryCdgSys("]]]");}


		 };
		/******************** explanationofbenefititemdetailmodifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> explanationofbenefititemdetailmodifierlist = explanationofbenefititemdetail.getModifier();
		for(int explanationofbenefititemdetailmodifieri = 0; explanationofbenefititemdetailmodifieri<explanationofbenefititemdetailmodifierlist.size();explanationofbenefititemdetailmodifieri++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  explanationofbenefititemdetailmodifier = explanationofbenefititemdetailmodifierlist.get(explanationofbenefititemdetailmodifieri);

		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Txt ********************************************************************************/
		if(explanationofbenefititemdetailmodifieri == 0) {e.addExplntnOfBnftItmDtlMdfrTxt("[[[");}
		if(explanationofbenefititemdetailmodifier.hasText()) {

			e.addExplntnOfBnftItmDtlMdfrTxt(String.valueOf(explanationofbenefititemdetailmodifier.getText()));
		} else {
			e.addExplntnOfBnftItmDtlMdfrTxt("NULL");
		}

		if(explanationofbenefititemdetailmodifieri == explanationofbenefititemdetailmodifierlist.size()-1) {e.addExplntnOfBnftItmDtlMdfrTxt("]]]");}


		/******************** explanationofbenefititemdetailmodifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemdetailmodifiercodinglist = explanationofbenefititemdetailmodifier.getCoding();
		for(int explanationofbenefititemdetailmodifiercodingi = 0; explanationofbenefititemdetailmodifiercodingi<explanationofbenefititemdetailmodifiercodinglist.size();explanationofbenefititemdetailmodifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemdetailmodifiercoding = explanationofbenefititemdetailmodifiercodinglist.get(explanationofbenefititemdetailmodifiercodingi);

		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailmodifiercodingi == 0) {e.addExplntnOfBnftItmDtlMdfrCdgDsply("[[[[");}
		if(explanationofbenefititemdetailmodifiercoding.hasDisplay()) {

			e.addExplntnOfBnftItmDtlMdfrCdgDsply(String.valueOf(explanationofbenefititemdetailmodifiercoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmDtlMdfrCdgDsply("NULL");
		}

		if(explanationofbenefititemdetailmodifiercodingi == explanationofbenefititemdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftItmDtlMdfrCdgDsply("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailmodifiercodingi == 0) {e.addExplntnOfBnftItmDtlMdfrCdgVrsn("[[[[");}
		if(explanationofbenefititemdetailmodifiercoding.hasVersion()) {

			e.addExplntnOfBnftItmDtlMdfrCdgVrsn(String.valueOf(explanationofbenefititemdetailmodifiercoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmDtlMdfrCdgVrsn("NULL");
		}

		if(explanationofbenefititemdetailmodifiercodingi == explanationofbenefititemdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftItmDtlMdfrCdgVrsn("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailmodifiercodingi == 0) {e.addExplntnOfBnftItmDtlMdfrCdgCd("[[[[");}
		if(explanationofbenefititemdetailmodifiercoding.hasCode()) {

			e.addExplntnOfBnftItmDtlMdfrCdgCd(String.valueOf(explanationofbenefititemdetailmodifiercoding.getCode()));
		} else {
			e.addExplntnOfBnftItmDtlMdfrCdgCd("NULL");
		}

		if(explanationofbenefititemdetailmodifiercodingi == explanationofbenefititemdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftItmDtlMdfrCdgCd("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailmodifiercodingi == 0) {e.addExplntnOfBnftItmDtlMdfrCdgUsrSltd("[[[[");}
		if(explanationofbenefititemdetailmodifiercoding.hasUserSelected()) {

			e.addExplntnOfBnftItmDtlMdfrCdgUsrSltd(String.valueOf(explanationofbenefititemdetailmodifiercoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmDtlMdfrCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemdetailmodifiercodingi == explanationofbenefititemdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftItmDtlMdfrCdgUsrSltd("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailmodifiercodingi == 0) {e.addExplntnOfBnftItmDtlMdfrCdgSys("[[[[");}
		if(explanationofbenefititemdetailmodifiercoding.hasSystem()) {

			e.addExplntnOfBnftItmDtlMdfrCdgSys(String.valueOf(explanationofbenefititemdetailmodifiercoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmDtlMdfrCdgSys("NULL");
		}

		if(explanationofbenefititemdetailmodifiercodingi == explanationofbenefititemdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftItmDtlMdfrCdgSys("]]]]");}


		 };
		 };
		/******************** ExplntnOfBnft_Itm_Dtl_Sqnc ********************************************************************************/
		if(explanationofbenefititemdetail.hasSequence()) {

			e.addExplntnOfBnftItmDtlSqnc(String.valueOf(explanationofbenefititemdetail.getSequence()));
		} else {
			e.addExplntnOfBnftItmDtlSqnc("NULL");
		}


		/******************** explanationofbenefititemdetailadjudication ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent> explanationofbenefititemdetailadjudicationlist = explanationofbenefititemdetail.getAdjudication();
		for(int explanationofbenefititemdetailadjudicationi = 0; explanationofbenefititemdetailadjudicationi<explanationofbenefititemdetailadjudicationlist.size();explanationofbenefititemdetailadjudicationi++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent  explanationofbenefititemdetailadjudication = explanationofbenefititemdetailadjudicationlist.get(explanationofbenefititemdetailadjudicationi);

		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Vl ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationi == 0) {e.addExplntnOfBnftItmDtlAdjdctnVl("[[[");}
		if(explanationofbenefititemdetailadjudication.hasValue()) {

			e.addExplntnOfBnftItmDtlAdjdctnVl(String.valueOf(explanationofbenefititemdetailadjudication.getValue()));
		} else {
			e.addExplntnOfBnftItmDtlAdjdctnVl("NULL");
		}

		if(explanationofbenefititemdetailadjudicationi == explanationofbenefititemdetailadjudicationlist.size()-1) {e.addExplntnOfBnftItmDtlAdjdctnVl("]]]");}


		/******************** explanationofbenefititemdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailadjudicationreason = explanationofbenefititemdetailadjudication.getReason();

		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationi == 0) {e.addExplntnOfBnftItmDtlAdjdctnRsnTxt("[[[");}
		if(explanationofbenefititemdetailadjudicationreason.hasText()) {

			e.addExplntnOfBnftItmDtlAdjdctnRsnTxt(String.valueOf(explanationofbenefititemdetailadjudicationreason.getText()));
		} else {
			e.addExplntnOfBnftItmDtlAdjdctnRsnTxt("NULL");
		}

		if(explanationofbenefititemdetailadjudicationi == explanationofbenefititemdetailadjudicationlist.size()-1) {e.addExplntnOfBnftItmDtlAdjdctnRsnTxt("]]]");}


		/******************** explanationofbenefititemdetailadjudicationreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemdetailadjudicationreasoncodinglist = explanationofbenefititemdetailadjudicationreason.getCoding();
		for(int explanationofbenefititemdetailadjudicationreasoncodingi = 0; explanationofbenefititemdetailadjudicationreasoncodingi<explanationofbenefititemdetailadjudicationreasoncodinglist.size();explanationofbenefititemdetailadjudicationreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemdetailadjudicationreasoncoding = explanationofbenefititemdetailadjudicationreasoncodinglist.get(explanationofbenefititemdetailadjudicationreasoncodingi);

		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftItmDtlAdjdctnRsnCdgDsply("[[[[");}
		if(explanationofbenefititemdetailadjudicationreasoncoding.hasDisplay()) {

			e.addExplntnOfBnftItmDtlAdjdctnRsnCdgDsply(String.valueOf(explanationofbenefititemdetailadjudicationreasoncoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmDtlAdjdctnRsnCdgDsply("NULL");
		}

		if(explanationofbenefititemdetailadjudicationreasoncodingi == explanationofbenefititemdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftItmDtlAdjdctnRsnCdgDsply("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftItmDtlAdjdctnRsnCdgVrsn("[[[[");}
		if(explanationofbenefititemdetailadjudicationreasoncoding.hasVersion()) {

			e.addExplntnOfBnftItmDtlAdjdctnRsnCdgVrsn(String.valueOf(explanationofbenefititemdetailadjudicationreasoncoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmDtlAdjdctnRsnCdgVrsn("NULL");
		}

		if(explanationofbenefititemdetailadjudicationreasoncodingi == explanationofbenefititemdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftItmDtlAdjdctnRsnCdgVrsn("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftItmDtlAdjdctnRsnCdgCd("[[[[");}
		if(explanationofbenefititemdetailadjudicationreasoncoding.hasCode()) {

			e.addExplntnOfBnftItmDtlAdjdctnRsnCdgCd(String.valueOf(explanationofbenefititemdetailadjudicationreasoncoding.getCode()));
		} else {
			e.addExplntnOfBnftItmDtlAdjdctnRsnCdgCd("NULL");
		}

		if(explanationofbenefititemdetailadjudicationreasoncodingi == explanationofbenefititemdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftItmDtlAdjdctnRsnCdgCd("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftItmDtlAdjdctnRsnCdgUsrSltd("[[[[");}
		if(explanationofbenefititemdetailadjudicationreasoncoding.hasUserSelected()) {

			e.addExplntnOfBnftItmDtlAdjdctnRsnCdgUsrSltd(String.valueOf(explanationofbenefititemdetailadjudicationreasoncoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmDtlAdjdctnRsnCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemdetailadjudicationreasoncodingi == explanationofbenefititemdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftItmDtlAdjdctnRsnCdgUsrSltd("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftItmDtlAdjdctnRsnCdgSys("[[[[");}
		if(explanationofbenefititemdetailadjudicationreasoncoding.hasSystem()) {

			e.addExplntnOfBnftItmDtlAdjdctnRsnCdgSys(String.valueOf(explanationofbenefititemdetailadjudicationreasoncoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmDtlAdjdctnRsnCdgSys("NULL");
		}

		if(explanationofbenefititemdetailadjudicationreasoncodingi == explanationofbenefititemdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftItmDtlAdjdctnRsnCdgSys("]]]]");}


		 };
		/******************** explanationofbenefititemdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailadjudicationcategory = explanationofbenefititemdetailadjudication.getCategory();

		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationi == 0) {e.addExplntnOfBnftItmDtlAdjdctnCtgryTxt("[[[");}
		if(explanationofbenefititemdetailadjudicationcategory.hasText()) {

			e.addExplntnOfBnftItmDtlAdjdctnCtgryTxt(String.valueOf(explanationofbenefititemdetailadjudicationcategory.getText()));
		} else {
			e.addExplntnOfBnftItmDtlAdjdctnCtgryTxt("NULL");
		}

		if(explanationofbenefititemdetailadjudicationi == explanationofbenefititemdetailadjudicationlist.size()-1) {e.addExplntnOfBnftItmDtlAdjdctnCtgryTxt("]]]");}


		/******************** explanationofbenefititemdetailadjudicationcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemdetailadjudicationcategorycodinglist = explanationofbenefititemdetailadjudicationcategory.getCoding();
		for(int explanationofbenefititemdetailadjudicationcategorycodingi = 0; explanationofbenefititemdetailadjudicationcategorycodingi<explanationofbenefititemdetailadjudicationcategorycodinglist.size();explanationofbenefititemdetailadjudicationcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemdetailadjudicationcategorycoding = explanationofbenefititemdetailadjudicationcategorycodinglist.get(explanationofbenefititemdetailadjudicationcategorycodingi);

		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgDsply("[[[[");}
		if(explanationofbenefititemdetailadjudicationcategorycoding.hasDisplay()) {

			e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgDsply(String.valueOf(explanationofbenefititemdetailadjudicationcategorycoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgDsply("NULL");
		}

		if(explanationofbenefititemdetailadjudicationcategorycodingi == explanationofbenefititemdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgDsply("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgVrsn("[[[[");}
		if(explanationofbenefititemdetailadjudicationcategorycoding.hasVersion()) {

			e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgVrsn(String.valueOf(explanationofbenefititemdetailadjudicationcategorycoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgVrsn("NULL");
		}

		if(explanationofbenefititemdetailadjudicationcategorycodingi == explanationofbenefititemdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgVrsn("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgCd("[[[[");}
		if(explanationofbenefititemdetailadjudicationcategorycoding.hasCode()) {

			e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgCd(String.valueOf(explanationofbenefititemdetailadjudicationcategorycoding.getCode()));
		} else {
			e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgCd("NULL");
		}

		if(explanationofbenefititemdetailadjudicationcategorycodingi == explanationofbenefititemdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgCd("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgUsrSltd("[[[[");}
		if(explanationofbenefititemdetailadjudicationcategorycoding.hasUserSelected()) {

			e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgUsrSltd(String.valueOf(explanationofbenefititemdetailadjudicationcategorycoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemdetailadjudicationcategorycodingi == explanationofbenefititemdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgUsrSltd("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgSys("[[[[");}
		if(explanationofbenefititemdetailadjudicationcategorycoding.hasSystem()) {

			e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgSys(String.valueOf(explanationofbenefititemdetailadjudicationcategorycoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgSys("NULL");
		}

		if(explanationofbenefititemdetailadjudicationcategorycodingi == explanationofbenefititemdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlAdjdctnCtgryCdgSys("]]]]");}


		 };
		/******************** explanationofbenefititemdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemdetailadjudicationamount = explanationofbenefititemdetailadjudication.getAmount();

		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationi == 0) {e.addExplntnOfBnftItmDtlAdjdctnAmntVl("[[[");}
		if(explanationofbenefititemdetailadjudicationamount.hasValue()) {

			e.addExplntnOfBnftItmDtlAdjdctnAmntVl(String.valueOf(explanationofbenefititemdetailadjudicationamount.getValue()));
		} else {
			e.addExplntnOfBnftItmDtlAdjdctnAmntVl("NULL");
		}

		if(explanationofbenefititemdetailadjudicationi == explanationofbenefititemdetailadjudicationlist.size()-1) {e.addExplntnOfBnftItmDtlAdjdctnAmntVl("]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationi == 0) {e.addExplntnOfBnftItmDtlAdjdctnAmntCrncy("[[[");}
		if(explanationofbenefititemdetailadjudicationamount.hasCurrency()) {

			e.addExplntnOfBnftItmDtlAdjdctnAmntCrncy(String.valueOf(explanationofbenefititemdetailadjudicationamount.getCurrency()));
		} else {
			e.addExplntnOfBnftItmDtlAdjdctnAmntCrncy("NULL");
		}

		if(explanationofbenefititemdetailadjudicationi == explanationofbenefititemdetailadjudicationlist.size()-1) {e.addExplntnOfBnftItmDtlAdjdctnAmntCrncy("]]]");}


		 };
		/******************** ExplntnOfBnft_Itm_Dtl_Factor ********************************************************************************/
		if(explanationofbenefititemdetail.hasFactor()) {

			e.addExplntnOfBnftItmDtlFactor(String.valueOf(explanationofbenefititemdetail.getFactor()));
		} else {
			e.addExplntnOfBnftItmDtlFactor("NULL");
		}


		/******************** explanationofbenefititemdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemdetailnet = explanationofbenefititemdetail.getNet();

		/******************** ExplntnOfBnft_Itm_Dtl_Net_Vl ********************************************************************************/
		if(explanationofbenefititemdetailnet.hasValue()) {

			e.addExplntnOfBnftItmDtlNetVl(String.valueOf(explanationofbenefititemdetailnet.getValue()));
		} else {
			e.addExplntnOfBnftItmDtlNetVl("NULL");
		}


		/******************** ExplntnOfBnft_Itm_Dtl_Net_Crncy ********************************************************************************/
		if(explanationofbenefititemdetailnet.hasCurrency()) {

			e.addExplntnOfBnftItmDtlNetCrncy(String.valueOf(explanationofbenefititemdetailnet.getCurrency()));
		} else {
			e.addExplntnOfBnftItmDtlNetCrncy("NULL");
		}


		/******************** explanationofbenefititemdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefititemdetailquantity = explanationofbenefititemdetail.getQuantity();

		/******************** ExplntnOfBnft_Itm_Dtl_Qnty_Vl ********************************************************************************/
		if(explanationofbenefititemdetailquantity.hasValue()) {

			e.addExplntnOfBnftItmDtlQntyVl(String.valueOf(explanationofbenefititemdetailquantity.getValue()));
		} else {
			e.addExplntnOfBnftItmDtlQntyVl("NULL");
		}


		/******************** explanationofbenefititemdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator explanationofbenefititemdetailquantitycomparator = explanationofbenefititemdetailquantity.getComparator();
		if(explanationofbenefititemdetailquantitycomparator!=null) {
			e.addExplntnOfBnftItmDtlQntyCmprtr(explanationofbenefititemdetailquantitycomparator.toCode());
		} else {
			e.addExplntnOfBnftItmDtlQntyCmprtr("NULL");
		}

		/******************** ExplntnOfBnft_Itm_Dtl_Qnty_Cd ********************************************************************************/
		if(explanationofbenefititemdetailquantity.hasCode()) {

			e.addExplntnOfBnftItmDtlQntyCd(String.valueOf(explanationofbenefititemdetailquantity.getCode()));
		} else {
			e.addExplntnOfBnftItmDtlQntyCd("NULL");
		}


		/******************** ExplntnOfBnft_Itm_Dtl_Qnty_Unt ********************************************************************************/
		if(explanationofbenefititemdetailquantity.hasUnit()) {

			e.addExplntnOfBnftItmDtlQntyUnt(String.valueOf(explanationofbenefititemdetailquantity.getUnit()));
		} else {
			e.addExplntnOfBnftItmDtlQntyUnt("NULL");
		}


		/******************** ExplntnOfBnft_Itm_Dtl_Qnty_Sys ********************************************************************************/
		if(explanationofbenefititemdetailquantity.hasSystem()) {

			e.addExplntnOfBnftItmDtlQntySys(String.valueOf(explanationofbenefititemdetailquantity.getSystem()));
		} else {
			e.addExplntnOfBnftItmDtlQntySys("NULL");
		}


		/******************** explanationofbenefititemdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailproductorservice = explanationofbenefititemdetail.getProductOrService();

		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Txt ********************************************************************************/
		if(explanationofbenefititemdetailproductorservice.hasText()) {

			e.addExplntnOfBnftItmDtlPrdctOrSrvTxt(String.valueOf(explanationofbenefititemdetailproductorservice.getText()));
		} else {
			e.addExplntnOfBnftItmDtlPrdctOrSrvTxt("NULL");
		}


		/******************** explanationofbenefititemdetailproductorservicecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemdetailproductorservicecodinglist = explanationofbenefititemdetailproductorservice.getCoding();
		for(int explanationofbenefititemdetailproductorservicecodingi = 0; explanationofbenefititemdetailproductorservicecodingi<explanationofbenefititemdetailproductorservicecodinglist.size();explanationofbenefititemdetailproductorservicecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemdetailproductorservicecoding = explanationofbenefititemdetailproductorservicecodinglist.get(explanationofbenefititemdetailproductorservicecodingi);

		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailproductorservicecodingi == 0) {e.addExplntnOfBnftItmDtlPrdctOrSrvCdgDsply("[[[");}
		if(explanationofbenefititemdetailproductorservicecoding.hasDisplay()) {

			e.addExplntnOfBnftItmDtlPrdctOrSrvCdgDsply(String.valueOf(explanationofbenefititemdetailproductorservicecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmDtlPrdctOrSrvCdgDsply("NULL");
		}

		if(explanationofbenefititemdetailproductorservicecodingi == explanationofbenefititemdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftItmDtlPrdctOrSrvCdgDsply("]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailproductorservicecodingi == 0) {e.addExplntnOfBnftItmDtlPrdctOrSrvCdgVrsn("[[[");}
		if(explanationofbenefititemdetailproductorservicecoding.hasVersion()) {

			e.addExplntnOfBnftItmDtlPrdctOrSrvCdgVrsn(String.valueOf(explanationofbenefititemdetailproductorservicecoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmDtlPrdctOrSrvCdgVrsn("NULL");
		}

		if(explanationofbenefititemdetailproductorservicecodingi == explanationofbenefititemdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftItmDtlPrdctOrSrvCdgVrsn("]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailproductorservicecodingi == 0) {e.addExplntnOfBnftItmDtlPrdctOrSrvCdgCd("[[[");}
		if(explanationofbenefititemdetailproductorservicecoding.hasCode()) {

			e.addExplntnOfBnftItmDtlPrdctOrSrvCdgCd(String.valueOf(explanationofbenefititemdetailproductorservicecoding.getCode()));
		} else {
			e.addExplntnOfBnftItmDtlPrdctOrSrvCdgCd("NULL");
		}

		if(explanationofbenefititemdetailproductorservicecodingi == explanationofbenefititemdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftItmDtlPrdctOrSrvCdgCd("]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailproductorservicecodingi == 0) {e.addExplntnOfBnftItmDtlPrdctOrSrvCdgUsrSltd("[[[");}
		if(explanationofbenefititemdetailproductorservicecoding.hasUserSelected()) {

			e.addExplntnOfBnftItmDtlPrdctOrSrvCdgUsrSltd(String.valueOf(explanationofbenefititemdetailproductorservicecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmDtlPrdctOrSrvCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemdetailproductorservicecodingi == explanationofbenefititemdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftItmDtlPrdctOrSrvCdgUsrSltd("]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailproductorservicecodingi == 0) {e.addExplntnOfBnftItmDtlPrdctOrSrvCdgSys("[[[");}
		if(explanationofbenefititemdetailproductorservicecoding.hasSystem()) {

			e.addExplntnOfBnftItmDtlPrdctOrSrvCdgSys(String.valueOf(explanationofbenefititemdetailproductorservicecoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmDtlPrdctOrSrvCdgSys("NULL");
		}

		if(explanationofbenefititemdetailproductorservicecodingi == explanationofbenefititemdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftItmDtlPrdctOrSrvCdgSys("]]]");}


		 };
		/******************** explanationofbenefititemdetailsubdetail ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.SubDetailComponent> explanationofbenefititemdetailsubdetaillist = explanationofbenefititemdetail.getSubDetail();
		for(int explanationofbenefititemdetailsubdetaili = 0; explanationofbenefititemdetailsubdetaili<explanationofbenefititemdetailsubdetaillist.size();explanationofbenefititemdetailsubdetaili++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.SubDetailComponent  explanationofbenefititemdetailsubdetail = explanationofbenefititemdetailsubdetaillist.get(explanationofbenefititemdetailsubdetaili);

		/******************** explanationofbenefititemdetailsubdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemdetailsubdetailunitprice = explanationofbenefititemdetailsubdetail.getUnitPrice();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_UntPrice_Vl ********************************************************************************/
		if(explanationofbenefititemdetailsubdetaili == 0) {e.addExplntnOfBnftItmDtlSubDtlUntPriceVl("[[[");}
		if(explanationofbenefititemdetailsubdetailunitprice.hasValue()) {

			e.addExplntnOfBnftItmDtlSubDtlUntPriceVl(String.valueOf(explanationofbenefititemdetailsubdetailunitprice.getValue()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlUntPriceVl("NULL");
		}

		if(explanationofbenefititemdetailsubdetaili == explanationofbenefititemdetailsubdetaillist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlUntPriceVl("]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_UntPrice_Crncy ********************************************************************************/
		if(explanationofbenefititemdetailsubdetaili == 0) {e.addExplntnOfBnftItmDtlSubDtlUntPriceCrncy("[[[");}
		if(explanationofbenefititemdetailsubdetailunitprice.hasCurrency()) {

			e.addExplntnOfBnftItmDtlSubDtlUntPriceCrncy(String.valueOf(explanationofbenefititemdetailsubdetailunitprice.getCurrency()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlUntPriceCrncy("NULL");
		}

		if(explanationofbenefititemdetailsubdetaili == explanationofbenefititemdetailsubdetaillist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlUntPriceCrncy("]]]");}


		/******************** explanationofbenefititemdetailsubdetailcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailsubdetailcategory = explanationofbenefititemdetailsubdetail.getCategory();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefititemdetailsubdetaili == 0) {e.addExplntnOfBnftItmDtlSubDtlCtgryTxt("[[[");}
		if(explanationofbenefititemdetailsubdetailcategory.hasText()) {

			e.addExplntnOfBnftItmDtlSubDtlCtgryTxt(String.valueOf(explanationofbenefititemdetailsubdetailcategory.getText()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlCtgryTxt("NULL");
		}

		if(explanationofbenefititemdetailsubdetaili == explanationofbenefititemdetailsubdetaillist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlCtgryTxt("]]]");}


		/******************** explanationofbenefititemdetailsubdetailcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemdetailsubdetailcategorycodinglist = explanationofbenefititemdetailsubdetailcategory.getCoding();
		for(int explanationofbenefititemdetailsubdetailcategorycodingi = 0; explanationofbenefititemdetailsubdetailcategorycodingi<explanationofbenefititemdetailsubdetailcategorycodinglist.size();explanationofbenefititemdetailsubdetailcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemdetailsubdetailcategorycoding = explanationofbenefititemdetailsubdetailcategorycodinglist.get(explanationofbenefititemdetailsubdetailcategorycodingi);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailcategorycodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlCtgryCdgDsply("[[[[");}
		if(explanationofbenefititemdetailsubdetailcategorycoding.hasDisplay()) {

			e.addExplntnOfBnftItmDtlSubDtlCtgryCdgDsply(String.valueOf(explanationofbenefititemdetailsubdetailcategorycoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlCtgryCdgDsply("NULL");
		}

		if(explanationofbenefititemdetailsubdetailcategorycodingi == explanationofbenefititemdetailsubdetailcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlCtgryCdgDsply("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailcategorycodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlCtgryCdgVrsn("[[[[");}
		if(explanationofbenefititemdetailsubdetailcategorycoding.hasVersion()) {

			e.addExplntnOfBnftItmDtlSubDtlCtgryCdgVrsn(String.valueOf(explanationofbenefititemdetailsubdetailcategorycoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlCtgryCdgVrsn("NULL");
		}

		if(explanationofbenefititemdetailsubdetailcategorycodingi == explanationofbenefititemdetailsubdetailcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlCtgryCdgVrsn("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailcategorycodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlCtgryCdgCd("[[[[");}
		if(explanationofbenefititemdetailsubdetailcategorycoding.hasCode()) {

			e.addExplntnOfBnftItmDtlSubDtlCtgryCdgCd(String.valueOf(explanationofbenefititemdetailsubdetailcategorycoding.getCode()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlCtgryCdgCd("NULL");
		}

		if(explanationofbenefititemdetailsubdetailcategorycodingi == explanationofbenefititemdetailsubdetailcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlCtgryCdgCd("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailcategorycodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlCtgryCdgUsrSltd("[[[[");}
		if(explanationofbenefititemdetailsubdetailcategorycoding.hasUserSelected()) {

			e.addExplntnOfBnftItmDtlSubDtlCtgryCdgUsrSltd(String.valueOf(explanationofbenefititemdetailsubdetailcategorycoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlCtgryCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemdetailsubdetailcategorycodingi == explanationofbenefititemdetailsubdetailcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlCtgryCdgUsrSltd("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailcategorycodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlCtgryCdgSys("[[[[");}
		if(explanationofbenefititemdetailsubdetailcategorycoding.hasSystem()) {

			e.addExplntnOfBnftItmDtlSubDtlCtgryCdgSys(String.valueOf(explanationofbenefititemdetailsubdetailcategorycoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlCtgryCdgSys("NULL");
		}

		if(explanationofbenefititemdetailsubdetailcategorycodingi == explanationofbenefititemdetailsubdetailcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlCtgryCdgSys("]]]]");}


		 };
		/******************** explanationofbenefititemdetailsubdetailmodifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> explanationofbenefititemdetailsubdetailmodifierlist = explanationofbenefititemdetailsubdetail.getModifier();
		for(int explanationofbenefititemdetailsubdetailmodifieri = 0; explanationofbenefititemdetailsubdetailmodifieri<explanationofbenefititemdetailsubdetailmodifierlist.size();explanationofbenefititemdetailsubdetailmodifieri++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  explanationofbenefititemdetailsubdetailmodifier = explanationofbenefititemdetailsubdetailmodifierlist.get(explanationofbenefititemdetailsubdetailmodifieri);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Txt ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailmodifieri == 0) {e.addExplntnOfBnftItmDtlSubDtlMdfrTxt("[[[[");}
		if(explanationofbenefititemdetailsubdetailmodifier.hasText()) {

			e.addExplntnOfBnftItmDtlSubDtlMdfrTxt(String.valueOf(explanationofbenefititemdetailsubdetailmodifier.getText()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlMdfrTxt("NULL");
		}

		if(explanationofbenefititemdetailsubdetailmodifieri == explanationofbenefititemdetailsubdetailmodifierlist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlMdfrTxt("]]]]");}


		/******************** explanationofbenefititemdetailsubdetailmodifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemdetailsubdetailmodifiercodinglist = explanationofbenefititemdetailsubdetailmodifier.getCoding();
		for(int explanationofbenefititemdetailsubdetailmodifiercodingi = 0; explanationofbenefititemdetailsubdetailmodifiercodingi<explanationofbenefititemdetailsubdetailmodifiercodinglist.size();explanationofbenefititemdetailsubdetailmodifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemdetailsubdetailmodifiercoding = explanationofbenefititemdetailsubdetailmodifiercodinglist.get(explanationofbenefititemdetailsubdetailmodifiercodingi);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailmodifiercodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlMdfrCdgDsply("[[[[[");}
		if(explanationofbenefititemdetailsubdetailmodifiercoding.hasDisplay()) {

			e.addExplntnOfBnftItmDtlSubDtlMdfrCdgDsply(String.valueOf(explanationofbenefititemdetailsubdetailmodifiercoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlMdfrCdgDsply("NULL");
		}

		if(explanationofbenefititemdetailsubdetailmodifiercodingi == explanationofbenefititemdetailsubdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlMdfrCdgDsply("]]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailmodifiercodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlMdfrCdgVrsn("[[[[[");}
		if(explanationofbenefititemdetailsubdetailmodifiercoding.hasVersion()) {

			e.addExplntnOfBnftItmDtlSubDtlMdfrCdgVrsn(String.valueOf(explanationofbenefititemdetailsubdetailmodifiercoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlMdfrCdgVrsn("NULL");
		}

		if(explanationofbenefititemdetailsubdetailmodifiercodingi == explanationofbenefititemdetailsubdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlMdfrCdgVrsn("]]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailmodifiercodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlMdfrCdgCd("[[[[[");}
		if(explanationofbenefititemdetailsubdetailmodifiercoding.hasCode()) {

			e.addExplntnOfBnftItmDtlSubDtlMdfrCdgCd(String.valueOf(explanationofbenefititemdetailsubdetailmodifiercoding.getCode()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlMdfrCdgCd("NULL");
		}

		if(explanationofbenefititemdetailsubdetailmodifiercodingi == explanationofbenefititemdetailsubdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlMdfrCdgCd("]]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailmodifiercodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlMdfrCdgUsrSltd("[[[[[");}
		if(explanationofbenefititemdetailsubdetailmodifiercoding.hasUserSelected()) {

			e.addExplntnOfBnftItmDtlSubDtlMdfrCdgUsrSltd(String.valueOf(explanationofbenefititemdetailsubdetailmodifiercoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlMdfrCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemdetailsubdetailmodifiercodingi == explanationofbenefititemdetailsubdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlMdfrCdgUsrSltd("]]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailmodifiercodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlMdfrCdgSys("[[[[[");}
		if(explanationofbenefititemdetailsubdetailmodifiercoding.hasSystem()) {

			e.addExplntnOfBnftItmDtlSubDtlMdfrCdgSys(String.valueOf(explanationofbenefititemdetailsubdetailmodifiercoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlMdfrCdgSys("NULL");
		}

		if(explanationofbenefititemdetailsubdetailmodifiercodingi == explanationofbenefititemdetailsubdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlMdfrCdgSys("]]]]]");}


		 };
		 };
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Sqnc ********************************************************************************/
		if(explanationofbenefititemdetailsubdetail.hasSequence()) {

			e.addExplntnOfBnftItmDtlSubDtlSqnc(String.valueOf(explanationofbenefititemdetailsubdetail.getSequence()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlSqnc("NULL");
		}


		/******************** explanationofbenefititemdetailsubdetailadjudication ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent> explanationofbenefititemdetailsubdetailadjudicationlist = explanationofbenefititemdetailsubdetail.getAdjudication();
		for(int explanationofbenefititemdetailsubdetailadjudicationi = 0; explanationofbenefititemdetailsubdetailadjudicationi<explanationofbenefititemdetailsubdetailadjudicationlist.size();explanationofbenefititemdetailsubdetailadjudicationi++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent  explanationofbenefititemdetailsubdetailadjudication = explanationofbenefititemdetailsubdetailadjudicationlist.get(explanationofbenefititemdetailsubdetailadjudicationi);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Vl ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationi == 0) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnVl("[[[[");}
		if(explanationofbenefititemdetailsubdetailadjudication.hasValue()) {

			e.addExplntnOfBnftItmDtlSubDtlAdjdctnVl(String.valueOf(explanationofbenefititemdetailsubdetailadjudication.getValue()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlAdjdctnVl("NULL");
		}

		if(explanationofbenefititemdetailsubdetailadjudicationi == explanationofbenefititemdetailsubdetailadjudicationlist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnVl("]]]]");}


		/******************** explanationofbenefititemdetailsubdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailsubdetailadjudicationreason = explanationofbenefititemdetailsubdetailadjudication.getReason();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationi == 0) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnTxt("[[[[");}
		if(explanationofbenefititemdetailsubdetailadjudicationreason.hasText()) {

			e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnTxt(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationreason.getText()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnTxt("NULL");
		}

		if(explanationofbenefititemdetailsubdetailadjudicationi == explanationofbenefititemdetailsubdetailadjudicationlist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnTxt("]]]]");}


		/******************** explanationofbenefititemdetailsubdetailadjudicationreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemdetailsubdetailadjudicationreasoncodinglist = explanationofbenefititemdetailsubdetailadjudicationreason.getCoding();
		for(int explanationofbenefititemdetailsubdetailadjudicationreasoncodingi = 0; explanationofbenefititemdetailsubdetailadjudicationreasoncodingi<explanationofbenefititemdetailsubdetailadjudicationreasoncodinglist.size();explanationofbenefititemdetailsubdetailadjudicationreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemdetailsubdetailadjudicationreasoncoding = explanationofbenefititemdetailsubdetailadjudicationreasoncodinglist.get(explanationofbenefititemdetailsubdetailadjudicationreasoncodingi);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgDsply("[[[[[");}
		if(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.hasDisplay()) {

			e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgDsply(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgDsply("NULL");
		}

		if(explanationofbenefititemdetailsubdetailadjudicationreasoncodingi == explanationofbenefititemdetailsubdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgDsply("]]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgVrsn("[[[[[");}
		if(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.hasVersion()) {

			e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgVrsn(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgVrsn("NULL");
		}

		if(explanationofbenefititemdetailsubdetailadjudicationreasoncodingi == explanationofbenefititemdetailsubdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgVrsn("]]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgCd("[[[[[");}
		if(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.hasCode()) {

			e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgCd(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.getCode()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgCd("NULL");
		}

		if(explanationofbenefititemdetailsubdetailadjudicationreasoncodingi == explanationofbenefititemdetailsubdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgCd("]]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgUsrSltd("[[[[[");}
		if(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.hasUserSelected()) {

			e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgUsrSltd(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemdetailsubdetailadjudicationreasoncodingi == explanationofbenefititemdetailsubdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgUsrSltd("]]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgSys("[[[[[");}
		if(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.hasSystem()) {

			e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgSys(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgSys("NULL");
		}

		if(explanationofbenefititemdetailsubdetailadjudicationreasoncodingi == explanationofbenefititemdetailsubdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgSys("]]]]]");}


		 };
		/******************** explanationofbenefititemdetailsubdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailsubdetailadjudicationcategory = explanationofbenefititemdetailsubdetailadjudication.getCategory();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationi == 0) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryTxt("[[[[");}
		if(explanationofbenefititemdetailsubdetailadjudicationcategory.hasText()) {

			e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryTxt(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationcategory.getText()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryTxt("NULL");
		}

		if(explanationofbenefititemdetailsubdetailadjudicationi == explanationofbenefititemdetailsubdetailadjudicationlist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryTxt("]]]]");}


		/******************** explanationofbenefititemdetailsubdetailadjudicationcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemdetailsubdetailadjudicationcategorycodinglist = explanationofbenefititemdetailsubdetailadjudicationcategory.getCoding();
		for(int explanationofbenefititemdetailsubdetailadjudicationcategorycodingi = 0; explanationofbenefititemdetailsubdetailadjudicationcategorycodingi<explanationofbenefititemdetailsubdetailadjudicationcategorycodinglist.size();explanationofbenefititemdetailsubdetailadjudicationcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemdetailsubdetailadjudicationcategorycoding = explanationofbenefititemdetailsubdetailadjudicationcategorycodinglist.get(explanationofbenefititemdetailsubdetailadjudicationcategorycodingi);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgDsply("[[[[[");}
		if(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.hasDisplay()) {

			e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgDsply(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgDsply("NULL");
		}

		if(explanationofbenefititemdetailsubdetailadjudicationcategorycodingi == explanationofbenefititemdetailsubdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgDsply("]]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgVrsn("[[[[[");}
		if(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.hasVersion()) {

			e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgVrsn(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgVrsn("NULL");
		}

		if(explanationofbenefititemdetailsubdetailadjudicationcategorycodingi == explanationofbenefititemdetailsubdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgVrsn("]]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgCd("[[[[[");}
		if(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.hasCode()) {

			e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgCd(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.getCode()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgCd("NULL");
		}

		if(explanationofbenefititemdetailsubdetailadjudicationcategorycodingi == explanationofbenefititemdetailsubdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgCd("]]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgUsrSltd("[[[[[");}
		if(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.hasUserSelected()) {

			e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgUsrSltd(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemdetailsubdetailadjudicationcategorycodingi == explanationofbenefititemdetailsubdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgUsrSltd("]]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgSys("[[[[[");}
		if(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.hasSystem()) {

			e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgSys(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgSys("NULL");
		}

		if(explanationofbenefititemdetailsubdetailadjudicationcategorycodingi == explanationofbenefititemdetailsubdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgSys("]]]]]");}


		 };
		/******************** explanationofbenefititemdetailsubdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemdetailsubdetailadjudicationamount = explanationofbenefititemdetailsubdetailadjudication.getAmount();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationi == 0) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnAmntVl("[[[[");}
		if(explanationofbenefititemdetailsubdetailadjudicationamount.hasValue()) {

			e.addExplntnOfBnftItmDtlSubDtlAdjdctnAmntVl(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationamount.getValue()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlAdjdctnAmntVl("NULL");
		}

		if(explanationofbenefititemdetailsubdetailadjudicationi == explanationofbenefititemdetailsubdetailadjudicationlist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnAmntVl("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationi == 0) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnAmntCrncy("[[[[");}
		if(explanationofbenefititemdetailsubdetailadjudicationamount.hasCurrency()) {

			e.addExplntnOfBnftItmDtlSubDtlAdjdctnAmntCrncy(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationamount.getCurrency()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlAdjdctnAmntCrncy("NULL");
		}

		if(explanationofbenefititemdetailsubdetailadjudicationi == explanationofbenefititemdetailsubdetailadjudicationlist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlAdjdctnAmntCrncy("]]]]");}


		 };
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Factor ********************************************************************************/
		if(explanationofbenefititemdetailsubdetail.hasFactor()) {

			e.addExplntnOfBnftItmDtlSubDtlFactor(String.valueOf(explanationofbenefititemdetailsubdetail.getFactor()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlFactor("NULL");
		}


		/******************** explanationofbenefititemdetailsubdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemdetailsubdetailnet = explanationofbenefititemdetailsubdetail.getNet();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Net_Vl ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailnet.hasValue()) {

			e.addExplntnOfBnftItmDtlSubDtlNetVl(String.valueOf(explanationofbenefititemdetailsubdetailnet.getValue()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlNetVl("NULL");
		}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Net_Crncy ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailnet.hasCurrency()) {

			e.addExplntnOfBnftItmDtlSubDtlNetCrncy(String.valueOf(explanationofbenefititemdetailsubdetailnet.getCurrency()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlNetCrncy("NULL");
		}


		/******************** explanationofbenefititemdetailsubdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefititemdetailsubdetailquantity = explanationofbenefititemdetailsubdetail.getQuantity();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Qnty_Vl ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailquantity.hasValue()) {

			e.addExplntnOfBnftItmDtlSubDtlQntyVl(String.valueOf(explanationofbenefititemdetailsubdetailquantity.getValue()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlQntyVl("NULL");
		}


		/******************** explanationofbenefititemdetailsubdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator explanationofbenefititemdetailsubdetailquantitycomparator = explanationofbenefititemdetailsubdetailquantity.getComparator();
		if(explanationofbenefititemdetailsubdetailquantitycomparator!=null) {
			e.addExplntnOfBnftItmDtlSubDtlQntyCmprtr(explanationofbenefititemdetailsubdetailquantitycomparator.toCode());
		} else {
			e.addExplntnOfBnftItmDtlSubDtlQntyCmprtr("NULL");
		}

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Qnty_Cd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailquantity.hasCode()) {

			e.addExplntnOfBnftItmDtlSubDtlQntyCd(String.valueOf(explanationofbenefititemdetailsubdetailquantity.getCode()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlQntyCd("NULL");
		}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Qnty_Unt ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailquantity.hasUnit()) {

			e.addExplntnOfBnftItmDtlSubDtlQntyUnt(String.valueOf(explanationofbenefititemdetailsubdetailquantity.getUnit()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlQntyUnt("NULL");
		}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Qnty_Sys ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailquantity.hasSystem()) {

			e.addExplntnOfBnftItmDtlSubDtlQntySys(String.valueOf(explanationofbenefititemdetailsubdetailquantity.getSystem()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlQntySys("NULL");
		}


		/******************** explanationofbenefititemdetailsubdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailsubdetailproductorservice = explanationofbenefititemdetailsubdetail.getProductOrService();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Txt ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailproductorservice.hasText()) {

			e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvTxt(String.valueOf(explanationofbenefititemdetailsubdetailproductorservice.getText()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvTxt("NULL");
		}


		/******************** explanationofbenefititemdetailsubdetailproductorservicecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemdetailsubdetailproductorservicecodinglist = explanationofbenefititemdetailsubdetailproductorservice.getCoding();
		for(int explanationofbenefititemdetailsubdetailproductorservicecodingi = 0; explanationofbenefititemdetailsubdetailproductorservicecodingi<explanationofbenefititemdetailsubdetailproductorservicecodinglist.size();explanationofbenefititemdetailsubdetailproductorservicecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemdetailsubdetailproductorservicecoding = explanationofbenefititemdetailsubdetailproductorservicecodinglist.get(explanationofbenefititemdetailsubdetailproductorservicecodingi);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailproductorservicecodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgDsply("[[[[");}
		if(explanationofbenefititemdetailsubdetailproductorservicecoding.hasDisplay()) {

			e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgDsply(String.valueOf(explanationofbenefititemdetailsubdetailproductorservicecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgDsply("NULL");
		}

		if(explanationofbenefititemdetailsubdetailproductorservicecodingi == explanationofbenefititemdetailsubdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgDsply("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailproductorservicecodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgVrsn("[[[[");}
		if(explanationofbenefititemdetailsubdetailproductorservicecoding.hasVersion()) {

			e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgVrsn(String.valueOf(explanationofbenefititemdetailsubdetailproductorservicecoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgVrsn("NULL");
		}

		if(explanationofbenefititemdetailsubdetailproductorservicecodingi == explanationofbenefititemdetailsubdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgVrsn("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailproductorservicecodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgCd("[[[[");}
		if(explanationofbenefititemdetailsubdetailproductorservicecoding.hasCode()) {

			e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgCd(String.valueOf(explanationofbenefititemdetailsubdetailproductorservicecoding.getCode()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgCd("NULL");
		}

		if(explanationofbenefititemdetailsubdetailproductorservicecodingi == explanationofbenefititemdetailsubdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgCd("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailproductorservicecodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgUsrSltd("[[[[");}
		if(explanationofbenefititemdetailsubdetailproductorservicecoding.hasUserSelected()) {

			e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgUsrSltd(String.valueOf(explanationofbenefititemdetailsubdetailproductorservicecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemdetailsubdetailproductorservicecodingi == explanationofbenefititemdetailsubdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgUsrSltd("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailproductorservicecodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgSys("[[[[");}
		if(explanationofbenefititemdetailsubdetailproductorservicecoding.hasSystem()) {

			e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgSys(String.valueOf(explanationofbenefititemdetailsubdetailproductorservicecoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgSys("NULL");
		}

		if(explanationofbenefititemdetailsubdetailproductorservicecodingi == explanationofbenefititemdetailsubdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgSys("]]]]");}


		 };
		/******************** explanationofbenefititemdetailsubdetailprogramcode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> explanationofbenefititemdetailsubdetailprogramcodelist = explanationofbenefititemdetailsubdetail.getProgramCode();
		for(int explanationofbenefititemdetailsubdetailprogramcodei = 0; explanationofbenefititemdetailsubdetailprogramcodei<explanationofbenefititemdetailsubdetailprogramcodelist.size();explanationofbenefititemdetailsubdetailprogramcodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  explanationofbenefititemdetailsubdetailprogramcode = explanationofbenefititemdetailsubdetailprogramcodelist.get(explanationofbenefititemdetailsubdetailprogramcodei);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Txt ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailprogramcodei == 0) {e.addExplntnOfBnftItmDtlSubDtlPrgrmCdTxt("[[[[");}
		if(explanationofbenefititemdetailsubdetailprogramcode.hasText()) {

			e.addExplntnOfBnftItmDtlSubDtlPrgrmCdTxt(String.valueOf(explanationofbenefititemdetailsubdetailprogramcode.getText()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlPrgrmCdTxt("NULL");
		}

		if(explanationofbenefititemdetailsubdetailprogramcodei == explanationofbenefititemdetailsubdetailprogramcodelist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlPrgrmCdTxt("]]]]");}


		/******************** explanationofbenefititemdetailsubdetailprogramcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemdetailsubdetailprogramcodecodinglist = explanationofbenefititemdetailsubdetailprogramcode.getCoding();
		for(int explanationofbenefititemdetailsubdetailprogramcodecodingi = 0; explanationofbenefititemdetailsubdetailprogramcodecodingi<explanationofbenefititemdetailsubdetailprogramcodecodinglist.size();explanationofbenefititemdetailsubdetailprogramcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemdetailsubdetailprogramcodecoding = explanationofbenefititemdetailsubdetailprogramcodecodinglist.get(explanationofbenefititemdetailsubdetailprogramcodecodingi);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailprogramcodecodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgDsply("[[[[[");}
		if(explanationofbenefititemdetailsubdetailprogramcodecoding.hasDisplay()) {

			e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgDsply(String.valueOf(explanationofbenefititemdetailsubdetailprogramcodecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgDsply("NULL");
		}

		if(explanationofbenefititemdetailsubdetailprogramcodecodingi == explanationofbenefititemdetailsubdetailprogramcodecodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgDsply("]]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailprogramcodecodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgVrsn("[[[[[");}
		if(explanationofbenefititemdetailsubdetailprogramcodecoding.hasVersion()) {

			e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgVrsn(String.valueOf(explanationofbenefititemdetailsubdetailprogramcodecoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgVrsn("NULL");
		}

		if(explanationofbenefititemdetailsubdetailprogramcodecodingi == explanationofbenefititemdetailsubdetailprogramcodecodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgVrsn("]]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailprogramcodecodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgCd("[[[[[");}
		if(explanationofbenefititemdetailsubdetailprogramcodecoding.hasCode()) {

			e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgCd(String.valueOf(explanationofbenefititemdetailsubdetailprogramcodecoding.getCode()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgCd("NULL");
		}

		if(explanationofbenefititemdetailsubdetailprogramcodecodingi == explanationofbenefititemdetailsubdetailprogramcodecodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgCd("]]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailprogramcodecodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgUsrSltd("[[[[[");}
		if(explanationofbenefititemdetailsubdetailprogramcodecoding.hasUserSelected()) {

			e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgUsrSltd(String.valueOf(explanationofbenefititemdetailsubdetailprogramcodecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemdetailsubdetailprogramcodecodingi == explanationofbenefititemdetailsubdetailprogramcodecodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgUsrSltd("]]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailprogramcodecodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgSys("[[[[[");}
		if(explanationofbenefititemdetailsubdetailprogramcodecoding.hasSystem()) {

			e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgSys(String.valueOf(explanationofbenefititemdetailsubdetailprogramcodecoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgSys("NULL");
		}

		if(explanationofbenefititemdetailsubdetailprogramcodecodingi == explanationofbenefititemdetailsubdetailprogramcodecodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlPrgrmCdCdgSys("]]]]]");}


		 };
		 };
		/******************** explanationofbenefititemdetailsubdetailrevenue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailsubdetailrevenue = explanationofbenefititemdetailsubdetail.getRevenue();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Txt ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailrevenue.hasText()) {

			e.addExplntnOfBnftItmDtlSubDtlRevenueTxt(String.valueOf(explanationofbenefititemdetailsubdetailrevenue.getText()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlRevenueTxt("NULL");
		}


		/******************** explanationofbenefititemdetailsubdetailrevenuecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemdetailsubdetailrevenuecodinglist = explanationofbenefititemdetailsubdetailrevenue.getCoding();
		for(int explanationofbenefititemdetailsubdetailrevenuecodingi = 0; explanationofbenefititemdetailsubdetailrevenuecodingi<explanationofbenefititemdetailsubdetailrevenuecodinglist.size();explanationofbenefititemdetailsubdetailrevenuecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemdetailsubdetailrevenuecoding = explanationofbenefititemdetailsubdetailrevenuecodinglist.get(explanationofbenefititemdetailsubdetailrevenuecodingi);

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailrevenuecodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlRevenueCdgDsply("[[[[");}
		if(explanationofbenefititemdetailsubdetailrevenuecoding.hasDisplay()) {

			e.addExplntnOfBnftItmDtlSubDtlRevenueCdgDsply(String.valueOf(explanationofbenefititemdetailsubdetailrevenuecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlRevenueCdgDsply("NULL");
		}

		if(explanationofbenefititemdetailsubdetailrevenuecodingi == explanationofbenefititemdetailsubdetailrevenuecodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlRevenueCdgDsply("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailrevenuecodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlRevenueCdgVrsn("[[[[");}
		if(explanationofbenefititemdetailsubdetailrevenuecoding.hasVersion()) {

			e.addExplntnOfBnftItmDtlSubDtlRevenueCdgVrsn(String.valueOf(explanationofbenefititemdetailsubdetailrevenuecoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlRevenueCdgVrsn("NULL");
		}

		if(explanationofbenefititemdetailsubdetailrevenuecodingi == explanationofbenefititemdetailsubdetailrevenuecodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlRevenueCdgVrsn("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailrevenuecodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlRevenueCdgCd("[[[[");}
		if(explanationofbenefititemdetailsubdetailrevenuecoding.hasCode()) {

			e.addExplntnOfBnftItmDtlSubDtlRevenueCdgCd(String.valueOf(explanationofbenefititemdetailsubdetailrevenuecoding.getCode()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlRevenueCdgCd("NULL");
		}

		if(explanationofbenefititemdetailsubdetailrevenuecodingi == explanationofbenefititemdetailsubdetailrevenuecodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlRevenueCdgCd("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailrevenuecodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlRevenueCdgUsrSltd("[[[[");}
		if(explanationofbenefititemdetailsubdetailrevenuecoding.hasUserSelected()) {

			e.addExplntnOfBnftItmDtlSubDtlRevenueCdgUsrSltd(String.valueOf(explanationofbenefititemdetailsubdetailrevenuecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlRevenueCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemdetailsubdetailrevenuecodingi == explanationofbenefititemdetailsubdetailrevenuecodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlRevenueCdgUsrSltd("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailrevenuecodingi == 0) {e.addExplntnOfBnftItmDtlSubDtlRevenueCdgSys("[[[[");}
		if(explanationofbenefititemdetailsubdetailrevenuecoding.hasSystem()) {

			e.addExplntnOfBnftItmDtlSubDtlRevenueCdgSys(String.valueOf(explanationofbenefititemdetailsubdetailrevenuecoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmDtlSubDtlRevenueCdgSys("NULL");
		}

		if(explanationofbenefititemdetailsubdetailrevenuecodingi == explanationofbenefititemdetailsubdetailrevenuecodinglist.size()-1) {e.addExplntnOfBnftItmDtlSubDtlRevenueCdgSys("]]]]");}


		 };
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_NtNmbr ********************************************************************************/
		if(explanationofbenefititemdetailsubdetail.hasNoteNumber()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefititemdetailsubdetail.getNoteNumber().size(); incr++) {
				array = array + explanationofbenefititemdetailsubdetail.getNoteNumber().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftItmDtlSubDtlNtNmbr(array);

		} else {
			e.addExplntnOfBnftItmDtlSubDtlNtNmbr("NULL");
		}


		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Udi ********************************************************************************/
		if(explanationofbenefititemdetailsubdetail.hasUdi()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefititemdetailsubdetail.getUdi().size(); incr++) {
				array = array + explanationofbenefititemdetailsubdetail.getUdi().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftItmDtlSubDtlUdi(array);

		} else {
			e.addExplntnOfBnftItmDtlSubDtlUdi("NULL");
		}


		 };
		/******************** explanationofbenefititemdetailprogramcode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> explanationofbenefititemdetailprogramcodelist = explanationofbenefititemdetail.getProgramCode();
		for(int explanationofbenefititemdetailprogramcodei = 0; explanationofbenefititemdetailprogramcodei<explanationofbenefititemdetailprogramcodelist.size();explanationofbenefititemdetailprogramcodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  explanationofbenefititemdetailprogramcode = explanationofbenefititemdetailprogramcodelist.get(explanationofbenefititemdetailprogramcodei);

		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Txt ********************************************************************************/
		if(explanationofbenefititemdetailprogramcodei == 0) {e.addExplntnOfBnftItmDtlPrgrmCdTxt("[[[");}
		if(explanationofbenefititemdetailprogramcode.hasText()) {

			e.addExplntnOfBnftItmDtlPrgrmCdTxt(String.valueOf(explanationofbenefititemdetailprogramcode.getText()));
		} else {
			e.addExplntnOfBnftItmDtlPrgrmCdTxt("NULL");
		}

		if(explanationofbenefititemdetailprogramcodei == explanationofbenefititemdetailprogramcodelist.size()-1) {e.addExplntnOfBnftItmDtlPrgrmCdTxt("]]]");}


		/******************** explanationofbenefititemdetailprogramcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemdetailprogramcodecodinglist = explanationofbenefititemdetailprogramcode.getCoding();
		for(int explanationofbenefititemdetailprogramcodecodingi = 0; explanationofbenefititemdetailprogramcodecodingi<explanationofbenefititemdetailprogramcodecodinglist.size();explanationofbenefititemdetailprogramcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemdetailprogramcodecoding = explanationofbenefititemdetailprogramcodecodinglist.get(explanationofbenefititemdetailprogramcodecodingi);

		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailprogramcodecodingi == 0) {e.addExplntnOfBnftItmDtlPrgrmCdCdgDsply("[[[[");}
		if(explanationofbenefititemdetailprogramcodecoding.hasDisplay()) {

			e.addExplntnOfBnftItmDtlPrgrmCdCdgDsply(String.valueOf(explanationofbenefititemdetailprogramcodecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmDtlPrgrmCdCdgDsply("NULL");
		}

		if(explanationofbenefititemdetailprogramcodecodingi == explanationofbenefititemdetailprogramcodecodinglist.size()-1) {e.addExplntnOfBnftItmDtlPrgrmCdCdgDsply("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailprogramcodecodingi == 0) {e.addExplntnOfBnftItmDtlPrgrmCdCdgVrsn("[[[[");}
		if(explanationofbenefititemdetailprogramcodecoding.hasVersion()) {

			e.addExplntnOfBnftItmDtlPrgrmCdCdgVrsn(String.valueOf(explanationofbenefititemdetailprogramcodecoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmDtlPrgrmCdCdgVrsn("NULL");
		}

		if(explanationofbenefititemdetailprogramcodecodingi == explanationofbenefititemdetailprogramcodecodinglist.size()-1) {e.addExplntnOfBnftItmDtlPrgrmCdCdgVrsn("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailprogramcodecodingi == 0) {e.addExplntnOfBnftItmDtlPrgrmCdCdgCd("[[[[");}
		if(explanationofbenefititemdetailprogramcodecoding.hasCode()) {

			e.addExplntnOfBnftItmDtlPrgrmCdCdgCd(String.valueOf(explanationofbenefititemdetailprogramcodecoding.getCode()));
		} else {
			e.addExplntnOfBnftItmDtlPrgrmCdCdgCd("NULL");
		}

		if(explanationofbenefititemdetailprogramcodecodingi == explanationofbenefititemdetailprogramcodecodinglist.size()-1) {e.addExplntnOfBnftItmDtlPrgrmCdCdgCd("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailprogramcodecodingi == 0) {e.addExplntnOfBnftItmDtlPrgrmCdCdgUsrSltd("[[[[");}
		if(explanationofbenefititemdetailprogramcodecoding.hasUserSelected()) {

			e.addExplntnOfBnftItmDtlPrgrmCdCdgUsrSltd(String.valueOf(explanationofbenefititemdetailprogramcodecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmDtlPrgrmCdCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemdetailprogramcodecodingi == explanationofbenefititemdetailprogramcodecodinglist.size()-1) {e.addExplntnOfBnftItmDtlPrgrmCdCdgUsrSltd("]]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailprogramcodecodingi == 0) {e.addExplntnOfBnftItmDtlPrgrmCdCdgSys("[[[[");}
		if(explanationofbenefititemdetailprogramcodecoding.hasSystem()) {

			e.addExplntnOfBnftItmDtlPrgrmCdCdgSys(String.valueOf(explanationofbenefititemdetailprogramcodecoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmDtlPrgrmCdCdgSys("NULL");
		}

		if(explanationofbenefititemdetailprogramcodecodingi == explanationofbenefititemdetailprogramcodecodinglist.size()-1) {e.addExplntnOfBnftItmDtlPrgrmCdCdgSys("]]]]");}


		 };
		 };
		/******************** explanationofbenefititemdetailrevenue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailrevenue = explanationofbenefititemdetail.getRevenue();

		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Txt ********************************************************************************/
		if(explanationofbenefititemdetailrevenue.hasText()) {

			e.addExplntnOfBnftItmDtlRevenueTxt(String.valueOf(explanationofbenefititemdetailrevenue.getText()));
		} else {
			e.addExplntnOfBnftItmDtlRevenueTxt("NULL");
		}


		/******************** explanationofbenefititemdetailrevenuecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemdetailrevenuecodinglist = explanationofbenefititemdetailrevenue.getCoding();
		for(int explanationofbenefititemdetailrevenuecodingi = 0; explanationofbenefititemdetailrevenuecodingi<explanationofbenefititemdetailrevenuecodinglist.size();explanationofbenefititemdetailrevenuecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemdetailrevenuecoding = explanationofbenefititemdetailrevenuecodinglist.get(explanationofbenefititemdetailrevenuecodingi);

		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailrevenuecodingi == 0) {e.addExplntnOfBnftItmDtlRevenueCdgDsply("[[[");}
		if(explanationofbenefititemdetailrevenuecoding.hasDisplay()) {

			e.addExplntnOfBnftItmDtlRevenueCdgDsply(String.valueOf(explanationofbenefititemdetailrevenuecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmDtlRevenueCdgDsply("NULL");
		}

		if(explanationofbenefititemdetailrevenuecodingi == explanationofbenefititemdetailrevenuecodinglist.size()-1) {e.addExplntnOfBnftItmDtlRevenueCdgDsply("]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailrevenuecodingi == 0) {e.addExplntnOfBnftItmDtlRevenueCdgVrsn("[[[");}
		if(explanationofbenefititemdetailrevenuecoding.hasVersion()) {

			e.addExplntnOfBnftItmDtlRevenueCdgVrsn(String.valueOf(explanationofbenefititemdetailrevenuecoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmDtlRevenueCdgVrsn("NULL");
		}

		if(explanationofbenefititemdetailrevenuecodingi == explanationofbenefititemdetailrevenuecodinglist.size()-1) {e.addExplntnOfBnftItmDtlRevenueCdgVrsn("]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailrevenuecodingi == 0) {e.addExplntnOfBnftItmDtlRevenueCdgCd("[[[");}
		if(explanationofbenefititemdetailrevenuecoding.hasCode()) {

			e.addExplntnOfBnftItmDtlRevenueCdgCd(String.valueOf(explanationofbenefititemdetailrevenuecoding.getCode()));
		} else {
			e.addExplntnOfBnftItmDtlRevenueCdgCd("NULL");
		}

		if(explanationofbenefititemdetailrevenuecodingi == explanationofbenefititemdetailrevenuecodinglist.size()-1) {e.addExplntnOfBnftItmDtlRevenueCdgCd("]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailrevenuecodingi == 0) {e.addExplntnOfBnftItmDtlRevenueCdgUsrSltd("[[[");}
		if(explanationofbenefititemdetailrevenuecoding.hasUserSelected()) {

			e.addExplntnOfBnftItmDtlRevenueCdgUsrSltd(String.valueOf(explanationofbenefititemdetailrevenuecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmDtlRevenueCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemdetailrevenuecodingi == explanationofbenefititemdetailrevenuecodinglist.size()-1) {e.addExplntnOfBnftItmDtlRevenueCdgUsrSltd("]]]");}


		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailrevenuecodingi == 0) {e.addExplntnOfBnftItmDtlRevenueCdgSys("[[[");}
		if(explanationofbenefititemdetailrevenuecoding.hasSystem()) {

			e.addExplntnOfBnftItmDtlRevenueCdgSys(String.valueOf(explanationofbenefititemdetailrevenuecoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmDtlRevenueCdgSys("NULL");
		}

		if(explanationofbenefititemdetailrevenuecodingi == explanationofbenefititemdetailrevenuecodinglist.size()-1) {e.addExplntnOfBnftItmDtlRevenueCdgSys("]]]");}


		 };
		/******************** ExplntnOfBnft_Itm_Dtl_NtNmbr ********************************************************************************/
		if(explanationofbenefititemdetail.hasNoteNumber()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefititemdetail.getNoteNumber().size(); incr++) {
				array = array + explanationofbenefititemdetail.getNoteNumber().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftItmDtlNtNmbr(array);

		} else {
			e.addExplntnOfBnftItmDtlNtNmbr("NULL");
		}


		/******************** ExplntnOfBnft_Itm_Dtl_Udi ********************************************************************************/
		if(explanationofbenefititemdetail.hasUdi()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefititemdetail.getUdi().size(); incr++) {
				array = array + explanationofbenefititemdetail.getUdi().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftItmDtlUdi(array);

		} else {
			e.addExplntnOfBnftItmDtlUdi("NULL");
		}


		 };
		/******************** explanationofbenefititemcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemcategory = explanationofbenefititem.getCategory();

		/******************** ExplntnOfBnft_Itm_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefititemcategory.hasText()) {

			e.addExplntnOfBnftItmCtgryTxt(String.valueOf(explanationofbenefititemcategory.getText()));
		} else {
			e.addExplntnOfBnftItmCtgryTxt("NULL");
		}


		/******************** explanationofbenefititemcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemcategorycodinglist = explanationofbenefititemcategory.getCoding();
		for(int explanationofbenefititemcategorycodingi = 0; explanationofbenefititemcategorycodingi<explanationofbenefititemcategorycodinglist.size();explanationofbenefititemcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemcategorycoding = explanationofbenefititemcategorycodinglist.get(explanationofbenefititemcategorycodingi);

		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemcategorycodingi == 0) {e.addExplntnOfBnftItmCtgryCdgDsply("[[");}
		if(explanationofbenefititemcategorycoding.hasDisplay()) {

			e.addExplntnOfBnftItmCtgryCdgDsply(String.valueOf(explanationofbenefititemcategorycoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmCtgryCdgDsply("NULL");
		}

		if(explanationofbenefititemcategorycodingi == explanationofbenefititemcategorycodinglist.size()-1) {e.addExplntnOfBnftItmCtgryCdgDsply("]]");}


		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemcategorycodingi == 0) {e.addExplntnOfBnftItmCtgryCdgVrsn("[[");}
		if(explanationofbenefititemcategorycoding.hasVersion()) {

			e.addExplntnOfBnftItmCtgryCdgVrsn(String.valueOf(explanationofbenefititemcategorycoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmCtgryCdgVrsn("NULL");
		}

		if(explanationofbenefititemcategorycodingi == explanationofbenefititemcategorycodinglist.size()-1) {e.addExplntnOfBnftItmCtgryCdgVrsn("]]");}


		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemcategorycodingi == 0) {e.addExplntnOfBnftItmCtgryCdgCd("[[");}
		if(explanationofbenefititemcategorycoding.hasCode()) {

			e.addExplntnOfBnftItmCtgryCdgCd(String.valueOf(explanationofbenefititemcategorycoding.getCode()));
		} else {
			e.addExplntnOfBnftItmCtgryCdgCd("NULL");
		}

		if(explanationofbenefititemcategorycodingi == explanationofbenefititemcategorycodinglist.size()-1) {e.addExplntnOfBnftItmCtgryCdgCd("]]");}


		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemcategorycodingi == 0) {e.addExplntnOfBnftItmCtgryCdgUsrSltd("[[");}
		if(explanationofbenefititemcategorycoding.hasUserSelected()) {

			e.addExplntnOfBnftItmCtgryCdgUsrSltd(String.valueOf(explanationofbenefititemcategorycoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmCtgryCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemcategorycodingi == explanationofbenefititemcategorycodinglist.size()-1) {e.addExplntnOfBnftItmCtgryCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemcategorycodingi == 0) {e.addExplntnOfBnftItmCtgryCdgSys("[[");}
		if(explanationofbenefititemcategorycoding.hasSystem()) {

			e.addExplntnOfBnftItmCtgryCdgSys(String.valueOf(explanationofbenefititemcategorycoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmCtgryCdgSys("NULL");
		}

		if(explanationofbenefititemcategorycodingi == explanationofbenefititemcategorycodinglist.size()-1) {e.addExplntnOfBnftItmCtgryCdgSys("]]");}


		 };
		/******************** explanationofbenefititembodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititembodysite = explanationofbenefititem.getBodySite();

		/******************** ExplntnOfBnft_Itm_BodySite_Txt ********************************************************************************/
		if(explanationofbenefititembodysite.hasText()) {

			e.addExplntnOfBnftItmBodySiteTxt(String.valueOf(explanationofbenefititembodysite.getText()));
		} else {
			e.addExplntnOfBnftItmBodySiteTxt("NULL");
		}


		/******************** explanationofbenefititembodysitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititembodysitecodinglist = explanationofbenefititembodysite.getCoding();
		for(int explanationofbenefititembodysitecodingi = 0; explanationofbenefititembodysitecodingi<explanationofbenefititembodysitecodinglist.size();explanationofbenefititembodysitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititembodysitecoding = explanationofbenefititembodysitecodinglist.get(explanationofbenefititembodysitecodingi);

		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititembodysitecodingi == 0) {e.addExplntnOfBnftItmBodySiteCdgDsply("[[");}
		if(explanationofbenefititembodysitecoding.hasDisplay()) {

			e.addExplntnOfBnftItmBodySiteCdgDsply(String.valueOf(explanationofbenefititembodysitecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmBodySiteCdgDsply("NULL");
		}

		if(explanationofbenefititembodysitecodingi == explanationofbenefititembodysitecodinglist.size()-1) {e.addExplntnOfBnftItmBodySiteCdgDsply("]]");}


		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititembodysitecodingi == 0) {e.addExplntnOfBnftItmBodySiteCdgVrsn("[[");}
		if(explanationofbenefititembodysitecoding.hasVersion()) {

			e.addExplntnOfBnftItmBodySiteCdgVrsn(String.valueOf(explanationofbenefititembodysitecoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmBodySiteCdgVrsn("NULL");
		}

		if(explanationofbenefititembodysitecodingi == explanationofbenefititembodysitecodinglist.size()-1) {e.addExplntnOfBnftItmBodySiteCdgVrsn("]]");}


		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititembodysitecodingi == 0) {e.addExplntnOfBnftItmBodySiteCdgCd("[[");}
		if(explanationofbenefititembodysitecoding.hasCode()) {

			e.addExplntnOfBnftItmBodySiteCdgCd(String.valueOf(explanationofbenefititembodysitecoding.getCode()));
		} else {
			e.addExplntnOfBnftItmBodySiteCdgCd("NULL");
		}

		if(explanationofbenefititembodysitecodingi == explanationofbenefititembodysitecodinglist.size()-1) {e.addExplntnOfBnftItmBodySiteCdgCd("]]");}


		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititembodysitecodingi == 0) {e.addExplntnOfBnftItmBodySiteCdgUsrSltd("[[");}
		if(explanationofbenefititembodysitecoding.hasUserSelected()) {

			e.addExplntnOfBnftItmBodySiteCdgUsrSltd(String.valueOf(explanationofbenefititembodysitecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmBodySiteCdgUsrSltd("NULL");
		}

		if(explanationofbenefititembodysitecodingi == explanationofbenefititembodysitecodinglist.size()-1) {e.addExplntnOfBnftItmBodySiteCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititembodysitecodingi == 0) {e.addExplntnOfBnftItmBodySiteCdgSys("[[");}
		if(explanationofbenefititembodysitecoding.hasSystem()) {

			e.addExplntnOfBnftItmBodySiteCdgSys(String.valueOf(explanationofbenefititembodysitecoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmBodySiteCdgSys("NULL");
		}

		if(explanationofbenefititembodysitecodingi == explanationofbenefititembodysitecodinglist.size()-1) {e.addExplntnOfBnftItmBodySiteCdgSys("]]");}


		 };
		/******************** explanationofbenefititemmodifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> explanationofbenefititemmodifierlist = explanationofbenefititem.getModifier();
		for(int explanationofbenefititemmodifieri = 0; explanationofbenefititemmodifieri<explanationofbenefititemmodifierlist.size();explanationofbenefititemmodifieri++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  explanationofbenefititemmodifier = explanationofbenefititemmodifierlist.get(explanationofbenefititemmodifieri);

		/******************** ExplntnOfBnft_Itm_Mdfr_Txt ********************************************************************************/
		if(explanationofbenefititemmodifieri == 0) {e.addExplntnOfBnftItmMdfrTxt("[[");}
		if(explanationofbenefititemmodifier.hasText()) {

			e.addExplntnOfBnftItmMdfrTxt(String.valueOf(explanationofbenefititemmodifier.getText()));
		} else {
			e.addExplntnOfBnftItmMdfrTxt("NULL");
		}

		if(explanationofbenefititemmodifieri == explanationofbenefititemmodifierlist.size()-1) {e.addExplntnOfBnftItmMdfrTxt("]]");}


		/******************** explanationofbenefititemmodifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemmodifiercodinglist = explanationofbenefititemmodifier.getCoding();
		for(int explanationofbenefititemmodifiercodingi = 0; explanationofbenefititemmodifiercodingi<explanationofbenefititemmodifiercodinglist.size();explanationofbenefititemmodifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemmodifiercoding = explanationofbenefititemmodifiercodinglist.get(explanationofbenefititemmodifiercodingi);

		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemmodifiercodingi == 0) {e.addExplntnOfBnftItmMdfrCdgDsply("[[[");}
		if(explanationofbenefititemmodifiercoding.hasDisplay()) {

			e.addExplntnOfBnftItmMdfrCdgDsply(String.valueOf(explanationofbenefititemmodifiercoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmMdfrCdgDsply("NULL");
		}

		if(explanationofbenefititemmodifiercodingi == explanationofbenefititemmodifiercodinglist.size()-1) {e.addExplntnOfBnftItmMdfrCdgDsply("]]]");}


		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemmodifiercodingi == 0) {e.addExplntnOfBnftItmMdfrCdgVrsn("[[[");}
		if(explanationofbenefititemmodifiercoding.hasVersion()) {

			e.addExplntnOfBnftItmMdfrCdgVrsn(String.valueOf(explanationofbenefititemmodifiercoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmMdfrCdgVrsn("NULL");
		}

		if(explanationofbenefititemmodifiercodingi == explanationofbenefititemmodifiercodinglist.size()-1) {e.addExplntnOfBnftItmMdfrCdgVrsn("]]]");}


		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemmodifiercodingi == 0) {e.addExplntnOfBnftItmMdfrCdgCd("[[[");}
		if(explanationofbenefititemmodifiercoding.hasCode()) {

			e.addExplntnOfBnftItmMdfrCdgCd(String.valueOf(explanationofbenefititemmodifiercoding.getCode()));
		} else {
			e.addExplntnOfBnftItmMdfrCdgCd("NULL");
		}

		if(explanationofbenefititemmodifiercodingi == explanationofbenefititemmodifiercodinglist.size()-1) {e.addExplntnOfBnftItmMdfrCdgCd("]]]");}


		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemmodifiercodingi == 0) {e.addExplntnOfBnftItmMdfrCdgUsrSltd("[[[");}
		if(explanationofbenefititemmodifiercoding.hasUserSelected()) {

			e.addExplntnOfBnftItmMdfrCdgUsrSltd(String.valueOf(explanationofbenefititemmodifiercoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmMdfrCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemmodifiercodingi == explanationofbenefititemmodifiercodinglist.size()-1) {e.addExplntnOfBnftItmMdfrCdgUsrSltd("]]]");}


		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemmodifiercodingi == 0) {e.addExplntnOfBnftItmMdfrCdgSys("[[[");}
		if(explanationofbenefititemmodifiercoding.hasSystem()) {

			e.addExplntnOfBnftItmMdfrCdgSys(String.valueOf(explanationofbenefititemmodifiercoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmMdfrCdgSys("NULL");
		}

		if(explanationofbenefititemmodifiercodingi == explanationofbenefititemmodifiercodinglist.size()-1) {e.addExplntnOfBnftItmMdfrCdgSys("]]]");}


		 };
		 };
		/******************** ExplntnOfBnft_Itm_Sqnc ********************************************************************************/
		if(explanationofbenefititem.hasSequence()) {

			e.addExplntnOfBnftItmSqnc(String.valueOf(explanationofbenefititem.getSequence()));
		} else {
			e.addExplntnOfBnftItmSqnc("NULL");
		}


		/******************** explanationofbenefititemadjudication ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent> explanationofbenefititemadjudicationlist = explanationofbenefititem.getAdjudication();
		for(int explanationofbenefititemadjudicationi = 0; explanationofbenefititemadjudicationi<explanationofbenefititemadjudicationlist.size();explanationofbenefititemadjudicationi++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent  explanationofbenefititemadjudication = explanationofbenefititemadjudicationlist.get(explanationofbenefititemadjudicationi);

		/******************** ExplntnOfBnft_Itm_Adjdctn_Vl ********************************************************************************/
		if(explanationofbenefititemadjudicationi == 0) {e.addExplntnOfBnftItmAdjdctnVl("[[");}
		if(explanationofbenefititemadjudication.hasValue()) {

			e.addExplntnOfBnftItmAdjdctnVl(String.valueOf(explanationofbenefititemadjudication.getValue()));
		} else {
			e.addExplntnOfBnftItmAdjdctnVl("NULL");
		}

		if(explanationofbenefititemadjudicationi == explanationofbenefititemadjudicationlist.size()-1) {e.addExplntnOfBnftItmAdjdctnVl("]]");}


		/******************** explanationofbenefititemadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemadjudicationreason = explanationofbenefititemadjudication.getReason();

		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Txt ********************************************************************************/
		if(explanationofbenefititemadjudicationi == 0) {e.addExplntnOfBnftItmAdjdctnRsnTxt("[[");}
		if(explanationofbenefititemadjudicationreason.hasText()) {

			e.addExplntnOfBnftItmAdjdctnRsnTxt(String.valueOf(explanationofbenefititemadjudicationreason.getText()));
		} else {
			e.addExplntnOfBnftItmAdjdctnRsnTxt("NULL");
		}

		if(explanationofbenefititemadjudicationi == explanationofbenefititemadjudicationlist.size()-1) {e.addExplntnOfBnftItmAdjdctnRsnTxt("]]");}


		/******************** explanationofbenefititemadjudicationreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemadjudicationreasoncodinglist = explanationofbenefititemadjudicationreason.getCoding();
		for(int explanationofbenefititemadjudicationreasoncodingi = 0; explanationofbenefititemadjudicationreasoncodingi<explanationofbenefititemadjudicationreasoncodinglist.size();explanationofbenefititemadjudicationreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemadjudicationreasoncoding = explanationofbenefititemadjudicationreasoncodinglist.get(explanationofbenefititemadjudicationreasoncodingi);

		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemadjudicationreasoncodingi == 0) {e.addExplntnOfBnftItmAdjdctnRsnCdgDsply("[[[");}
		if(explanationofbenefititemadjudicationreasoncoding.hasDisplay()) {

			e.addExplntnOfBnftItmAdjdctnRsnCdgDsply(String.valueOf(explanationofbenefititemadjudicationreasoncoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmAdjdctnRsnCdgDsply("NULL");
		}

		if(explanationofbenefititemadjudicationreasoncodingi == explanationofbenefititemadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftItmAdjdctnRsnCdgDsply("]]]");}


		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemadjudicationreasoncodingi == 0) {e.addExplntnOfBnftItmAdjdctnRsnCdgVrsn("[[[");}
		if(explanationofbenefititemadjudicationreasoncoding.hasVersion()) {

			e.addExplntnOfBnftItmAdjdctnRsnCdgVrsn(String.valueOf(explanationofbenefititemadjudicationreasoncoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmAdjdctnRsnCdgVrsn("NULL");
		}

		if(explanationofbenefititemadjudicationreasoncodingi == explanationofbenefititemadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftItmAdjdctnRsnCdgVrsn("]]]");}


		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemadjudicationreasoncodingi == 0) {e.addExplntnOfBnftItmAdjdctnRsnCdgCd("[[[");}
		if(explanationofbenefititemadjudicationreasoncoding.hasCode()) {

			e.addExplntnOfBnftItmAdjdctnRsnCdgCd(String.valueOf(explanationofbenefititemadjudicationreasoncoding.getCode()));
		} else {
			e.addExplntnOfBnftItmAdjdctnRsnCdgCd("NULL");
		}

		if(explanationofbenefititemadjudicationreasoncodingi == explanationofbenefititemadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftItmAdjdctnRsnCdgCd("]]]");}


		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemadjudicationreasoncodingi == 0) {e.addExplntnOfBnftItmAdjdctnRsnCdgUsrSltd("[[[");}
		if(explanationofbenefititemadjudicationreasoncoding.hasUserSelected()) {

			e.addExplntnOfBnftItmAdjdctnRsnCdgUsrSltd(String.valueOf(explanationofbenefititemadjudicationreasoncoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmAdjdctnRsnCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemadjudicationreasoncodingi == explanationofbenefititemadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftItmAdjdctnRsnCdgUsrSltd("]]]");}


		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemadjudicationreasoncodingi == 0) {e.addExplntnOfBnftItmAdjdctnRsnCdgSys("[[[");}
		if(explanationofbenefititemadjudicationreasoncoding.hasSystem()) {

			e.addExplntnOfBnftItmAdjdctnRsnCdgSys(String.valueOf(explanationofbenefititemadjudicationreasoncoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmAdjdctnRsnCdgSys("NULL");
		}

		if(explanationofbenefititemadjudicationreasoncodingi == explanationofbenefititemadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftItmAdjdctnRsnCdgSys("]]]");}


		 };
		/******************** explanationofbenefititemadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemadjudicationcategory = explanationofbenefititemadjudication.getCategory();

		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefititemadjudicationi == 0) {e.addExplntnOfBnftItmAdjdctnCtgryTxt("[[");}
		if(explanationofbenefititemadjudicationcategory.hasText()) {

			e.addExplntnOfBnftItmAdjdctnCtgryTxt(String.valueOf(explanationofbenefititemadjudicationcategory.getText()));
		} else {
			e.addExplntnOfBnftItmAdjdctnCtgryTxt("NULL");
		}

		if(explanationofbenefititemadjudicationi == explanationofbenefititemadjudicationlist.size()-1) {e.addExplntnOfBnftItmAdjdctnCtgryTxt("]]");}


		/******************** explanationofbenefititemadjudicationcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemadjudicationcategorycodinglist = explanationofbenefititemadjudicationcategory.getCoding();
		for(int explanationofbenefititemadjudicationcategorycodingi = 0; explanationofbenefititemadjudicationcategorycodingi<explanationofbenefititemadjudicationcategorycodinglist.size();explanationofbenefititemadjudicationcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemadjudicationcategorycoding = explanationofbenefititemadjudicationcategorycodinglist.get(explanationofbenefititemadjudicationcategorycodingi);

		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemadjudicationcategorycodingi == 0) {e.addExplntnOfBnftItmAdjdctnCtgryCdgDsply("[[[");}
		if(explanationofbenefititemadjudicationcategorycoding.hasDisplay()) {

			e.addExplntnOfBnftItmAdjdctnCtgryCdgDsply(String.valueOf(explanationofbenefititemadjudicationcategorycoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmAdjdctnCtgryCdgDsply("NULL");
		}

		if(explanationofbenefititemadjudicationcategorycodingi == explanationofbenefititemadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftItmAdjdctnCtgryCdgDsply("]]]");}


		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemadjudicationcategorycodingi == 0) {e.addExplntnOfBnftItmAdjdctnCtgryCdgVrsn("[[[");}
		if(explanationofbenefititemadjudicationcategorycoding.hasVersion()) {

			e.addExplntnOfBnftItmAdjdctnCtgryCdgVrsn(String.valueOf(explanationofbenefititemadjudicationcategorycoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmAdjdctnCtgryCdgVrsn("NULL");
		}

		if(explanationofbenefititemadjudicationcategorycodingi == explanationofbenefititemadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftItmAdjdctnCtgryCdgVrsn("]]]");}


		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemadjudicationcategorycodingi == 0) {e.addExplntnOfBnftItmAdjdctnCtgryCdgCd("[[[");}
		if(explanationofbenefititemadjudicationcategorycoding.hasCode()) {

			e.addExplntnOfBnftItmAdjdctnCtgryCdgCd(String.valueOf(explanationofbenefititemadjudicationcategorycoding.getCode()));
		} else {
			e.addExplntnOfBnftItmAdjdctnCtgryCdgCd("NULL");
		}

		if(explanationofbenefititemadjudicationcategorycodingi == explanationofbenefititemadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftItmAdjdctnCtgryCdgCd("]]]");}


		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemadjudicationcategorycodingi == 0) {e.addExplntnOfBnftItmAdjdctnCtgryCdgUsrSltd("[[[");}
		if(explanationofbenefititemadjudicationcategorycoding.hasUserSelected()) {

			e.addExplntnOfBnftItmAdjdctnCtgryCdgUsrSltd(String.valueOf(explanationofbenefititemadjudicationcategorycoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmAdjdctnCtgryCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemadjudicationcategorycodingi == explanationofbenefititemadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftItmAdjdctnCtgryCdgUsrSltd("]]]");}


		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemadjudicationcategorycodingi == 0) {e.addExplntnOfBnftItmAdjdctnCtgryCdgSys("[[[");}
		if(explanationofbenefititemadjudicationcategorycoding.hasSystem()) {

			e.addExplntnOfBnftItmAdjdctnCtgryCdgSys(String.valueOf(explanationofbenefititemadjudicationcategorycoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmAdjdctnCtgryCdgSys("NULL");
		}

		if(explanationofbenefititemadjudicationcategorycodingi == explanationofbenefititemadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftItmAdjdctnCtgryCdgSys("]]]");}


		 };
		/******************** explanationofbenefititemadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemadjudicationamount = explanationofbenefititemadjudication.getAmount();

		/******************** ExplntnOfBnft_Itm_Adjdctn_Amnt_Vl ********************************************************************************/
		if(explanationofbenefititemadjudicationi == 0) {e.addExplntnOfBnftItmAdjdctnAmntVl("[[");}
		if(explanationofbenefititemadjudicationamount.hasValue()) {

			e.addExplntnOfBnftItmAdjdctnAmntVl(String.valueOf(explanationofbenefititemadjudicationamount.getValue()));
		} else {
			e.addExplntnOfBnftItmAdjdctnAmntVl("NULL");
		}

		if(explanationofbenefititemadjudicationi == explanationofbenefititemadjudicationlist.size()-1) {e.addExplntnOfBnftItmAdjdctnAmntVl("]]");}


		/******************** ExplntnOfBnft_Itm_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(explanationofbenefititemadjudicationi == 0) {e.addExplntnOfBnftItmAdjdctnAmntCrncy("[[");}
		if(explanationofbenefititemadjudicationamount.hasCurrency()) {

			e.addExplntnOfBnftItmAdjdctnAmntCrncy(String.valueOf(explanationofbenefititemadjudicationamount.getCurrency()));
		} else {
			e.addExplntnOfBnftItmAdjdctnAmntCrncy("NULL");
		}

		if(explanationofbenefititemadjudicationi == explanationofbenefititemadjudicationlist.size()-1) {e.addExplntnOfBnftItmAdjdctnAmntCrncy("]]");}


		 };
		/******************** ExplntnOfBnft_Itm_Factor ********************************************************************************/
		if(explanationofbenefititem.hasFactor()) {

			e.addExplntnOfBnftItmFactor(String.valueOf(explanationofbenefititem.getFactor()));
		} else {
			e.addExplntnOfBnftItmFactor("NULL");
		}


		/******************** explanationofbenefititemnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemnet = explanationofbenefititem.getNet();

		/******************** ExplntnOfBnft_Itm_Net_Vl ********************************************************************************/
		if(explanationofbenefititemnet.hasValue()) {

			e.addExplntnOfBnftItmNetVl(String.valueOf(explanationofbenefititemnet.getValue()));
		} else {
			e.addExplntnOfBnftItmNetVl("NULL");
		}


		/******************** ExplntnOfBnft_Itm_Net_Crncy ********************************************************************************/
		if(explanationofbenefititemnet.hasCurrency()) {

			e.addExplntnOfBnftItmNetCrncy(String.valueOf(explanationofbenefititemnet.getCurrency()));
		} else {
			e.addExplntnOfBnftItmNetCrncy("NULL");
		}


		/******************** ExplntnOfBnft_Itm_SrvdDtTyp ********************************************************************************/
		if(explanationofbenefititem.hasServicedDateType()) {

			e.addExplntnOfBnftItmSrvdDtTyp("\""+explanationofbenefititem.getServicedDateType().getValueAsString()+"\"");
		} else {
			e.addExplntnOfBnftItmSrvdDtTyp("NULL");
		}


		/******************** explanationofbenefititemlocationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemlocationcodeableconcept = explanationofbenefititem.getLocationCodeableConcept();

		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Txt ********************************************************************************/
		if(explanationofbenefititemlocationcodeableconcept.hasText()) {

			e.addExplntnOfBnftItmLctnCdbleCncptTxt(String.valueOf(explanationofbenefititemlocationcodeableconcept.getText()));
		} else {
			e.addExplntnOfBnftItmLctnCdbleCncptTxt("NULL");
		}


		/******************** explanationofbenefititemlocationcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemlocationcodeableconceptcodinglist = explanationofbenefititemlocationcodeableconcept.getCoding();
		for(int explanationofbenefititemlocationcodeableconceptcodingi = 0; explanationofbenefititemlocationcodeableconceptcodingi<explanationofbenefititemlocationcodeableconceptcodinglist.size();explanationofbenefititemlocationcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemlocationcodeableconceptcoding = explanationofbenefititemlocationcodeableconceptcodinglist.get(explanationofbenefititemlocationcodeableconceptcodingi);

		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemlocationcodeableconceptcodingi == 0) {e.addExplntnOfBnftItmLctnCdbleCncptCdgDsply("[[");}
		if(explanationofbenefititemlocationcodeableconceptcoding.hasDisplay()) {

			e.addExplntnOfBnftItmLctnCdbleCncptCdgDsply(String.valueOf(explanationofbenefititemlocationcodeableconceptcoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmLctnCdbleCncptCdgDsply("NULL");
		}

		if(explanationofbenefititemlocationcodeableconceptcodingi == explanationofbenefititemlocationcodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftItmLctnCdbleCncptCdgDsply("]]");}


		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemlocationcodeableconceptcodingi == 0) {e.addExplntnOfBnftItmLctnCdbleCncptCdgVrsn("[[");}
		if(explanationofbenefititemlocationcodeableconceptcoding.hasVersion()) {

			e.addExplntnOfBnftItmLctnCdbleCncptCdgVrsn(String.valueOf(explanationofbenefititemlocationcodeableconceptcoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmLctnCdbleCncptCdgVrsn("NULL");
		}

		if(explanationofbenefititemlocationcodeableconceptcodingi == explanationofbenefititemlocationcodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftItmLctnCdbleCncptCdgVrsn("]]");}


		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemlocationcodeableconceptcodingi == 0) {e.addExplntnOfBnftItmLctnCdbleCncptCdgCd("[[");}
		if(explanationofbenefititemlocationcodeableconceptcoding.hasCode()) {

			e.addExplntnOfBnftItmLctnCdbleCncptCdgCd(String.valueOf(explanationofbenefititemlocationcodeableconceptcoding.getCode()));
		} else {
			e.addExplntnOfBnftItmLctnCdbleCncptCdgCd("NULL");
		}

		if(explanationofbenefititemlocationcodeableconceptcodingi == explanationofbenefititemlocationcodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftItmLctnCdbleCncptCdgCd("]]");}


		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemlocationcodeableconceptcodingi == 0) {e.addExplntnOfBnftItmLctnCdbleCncptCdgUsrSltd("[[");}
		if(explanationofbenefititemlocationcodeableconceptcoding.hasUserSelected()) {

			e.addExplntnOfBnftItmLctnCdbleCncptCdgUsrSltd(String.valueOf(explanationofbenefititemlocationcodeableconceptcoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmLctnCdbleCncptCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemlocationcodeableconceptcodingi == explanationofbenefititemlocationcodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftItmLctnCdbleCncptCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemlocationcodeableconceptcodingi == 0) {e.addExplntnOfBnftItmLctnCdbleCncptCdgSys("[[");}
		if(explanationofbenefititemlocationcodeableconceptcoding.hasSystem()) {

			e.addExplntnOfBnftItmLctnCdbleCncptCdgSys(String.valueOf(explanationofbenefititemlocationcodeableconceptcoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmLctnCdbleCncptCdgSys("NULL");
		}

		if(explanationofbenefititemlocationcodeableconceptcodingi == explanationofbenefititemlocationcodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftItmLctnCdbleCncptCdgSys("]]");}


		 };
		/******************** explanationofbenefititemservicedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefititemservicedperiod = explanationofbenefititem.getServicedPeriod();

		/******************** ExplntnOfBnft_Itm_SrvdPrd_Strt ********************************************************************************/
		if(explanationofbenefititemservicedperiod.hasStart()) {

			e.addExplntnOfBnftItmSrvdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefititemservicedperiod.getStart())+"\"");
		} else {
			e.addExplntnOfBnftItmSrvdPrdStrt("NULL");
		}


		/******************** ExplntnOfBnft_Itm_SrvdPrd_End ********************************************************************************/
		if(explanationofbenefititemservicedperiod.hasEnd()) {

			e.addExplntnOfBnftItmSrvdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefititemservicedperiod.getEnd())+"\"");
		} else {
			e.addExplntnOfBnftItmSrvdPrdEnd("NULL");
		}


		/******************** explanationofbenefititemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefititemquantity = explanationofbenefititem.getQuantity();

		/******************** ExplntnOfBnft_Itm_Qnty_Vl ********************************************************************************/
		if(explanationofbenefititemquantity.hasValue()) {

			e.addExplntnOfBnftItmQntyVl(String.valueOf(explanationofbenefititemquantity.getValue()));
		} else {
			e.addExplntnOfBnftItmQntyVl("NULL");
		}


		/******************** explanationofbenefititemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator explanationofbenefititemquantitycomparator = explanationofbenefititemquantity.getComparator();
		if(explanationofbenefititemquantitycomparator!=null) {
			e.addExplntnOfBnftItmQntyCmprtr(explanationofbenefititemquantitycomparator.toCode());
		} else {
			e.addExplntnOfBnftItmQntyCmprtr("NULL");
		}

		/******************** ExplntnOfBnft_Itm_Qnty_Cd ********************************************************************************/
		if(explanationofbenefititemquantity.hasCode()) {

			e.addExplntnOfBnftItmQntyCd(String.valueOf(explanationofbenefititemquantity.getCode()));
		} else {
			e.addExplntnOfBnftItmQntyCd("NULL");
		}


		/******************** ExplntnOfBnft_Itm_Qnty_Unt ********************************************************************************/
		if(explanationofbenefititemquantity.hasUnit()) {

			e.addExplntnOfBnftItmQntyUnt(String.valueOf(explanationofbenefititemquantity.getUnit()));
		} else {
			e.addExplntnOfBnftItmQntyUnt("NULL");
		}


		/******************** ExplntnOfBnft_Itm_Qnty_Sys ********************************************************************************/
		if(explanationofbenefititemquantity.hasSystem()) {

			e.addExplntnOfBnftItmQntySys(String.valueOf(explanationofbenefititemquantity.getSystem()));
		} else {
			e.addExplntnOfBnftItmQntySys("NULL");
		}


		/******************** ExplntnOfBnft_Itm_CareTeamSqnc ********************************************************************************/
		if(explanationofbenefititem.hasCareTeamSequence()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefititem.getCareTeamSequence().size(); incr++) {
				array = array + explanationofbenefititem.getCareTeamSequence().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftItmCareTeamSqnc(array);

		} else {
			e.addExplntnOfBnftItmCareTeamSqnc("NULL");
		}


		/******************** ExplntnOfBnft_Itm_DgnsisSqnc ********************************************************************************/
		if(explanationofbenefititem.hasDiagnosisSequence()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefititem.getDiagnosisSequence().size(); incr++) {
				array = array + explanationofbenefititem.getDiagnosisSequence().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftItmDgnsisSqnc(array);

		} else {
			e.addExplntnOfBnftItmDgnsisSqnc("NULL");
		}


		/******************** ExplntnOfBnft_Itm_InfoSqnc ********************************************************************************/
		if(explanationofbenefititem.hasInformationSequence()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefititem.getInformationSequence().size(); incr++) {
				array = array + explanationofbenefititem.getInformationSequence().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftItmInfoSqnc(array);

		} else {
			e.addExplntnOfBnftItmInfoSqnc("NULL");
		}


		/******************** ExplntnOfBnft_Itm_PrcdrSqnc ********************************************************************************/
		if(explanationofbenefititem.hasProcedureSequence()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefititem.getProcedureSequence().size(); incr++) {
				array = array + explanationofbenefititem.getProcedureSequence().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftItmPrcdrSqnc(array);

		} else {
			e.addExplntnOfBnftItmPrcdrSqnc("NULL");
		}


		/******************** explanationofbenefititemproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemproductorservice = explanationofbenefititem.getProductOrService();

		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Txt ********************************************************************************/
		if(explanationofbenefititemproductorservice.hasText()) {

			e.addExplntnOfBnftItmPrdctOrSrvTxt(String.valueOf(explanationofbenefititemproductorservice.getText()));
		} else {
			e.addExplntnOfBnftItmPrdctOrSrvTxt("NULL");
		}


		/******************** explanationofbenefititemproductorservicecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemproductorservicecodinglist = explanationofbenefititemproductorservice.getCoding();
		for(int explanationofbenefititemproductorservicecodingi = 0; explanationofbenefititemproductorservicecodingi<explanationofbenefititemproductorservicecodinglist.size();explanationofbenefititemproductorservicecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemproductorservicecoding = explanationofbenefititemproductorservicecodinglist.get(explanationofbenefititemproductorservicecodingi);

		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemproductorservicecodingi == 0) {e.addExplntnOfBnftItmPrdctOrSrvCdgDsply("[[");}
		if(explanationofbenefititemproductorservicecoding.hasDisplay()) {

			e.addExplntnOfBnftItmPrdctOrSrvCdgDsply(String.valueOf(explanationofbenefititemproductorservicecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmPrdctOrSrvCdgDsply("NULL");
		}

		if(explanationofbenefititemproductorservicecodingi == explanationofbenefititemproductorservicecodinglist.size()-1) {e.addExplntnOfBnftItmPrdctOrSrvCdgDsply("]]");}


		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemproductorservicecodingi == 0) {e.addExplntnOfBnftItmPrdctOrSrvCdgVrsn("[[");}
		if(explanationofbenefititemproductorservicecoding.hasVersion()) {

			e.addExplntnOfBnftItmPrdctOrSrvCdgVrsn(String.valueOf(explanationofbenefititemproductorservicecoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmPrdctOrSrvCdgVrsn("NULL");
		}

		if(explanationofbenefititemproductorservicecodingi == explanationofbenefititemproductorservicecodinglist.size()-1) {e.addExplntnOfBnftItmPrdctOrSrvCdgVrsn("]]");}


		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemproductorservicecodingi == 0) {e.addExplntnOfBnftItmPrdctOrSrvCdgCd("[[");}
		if(explanationofbenefititemproductorservicecoding.hasCode()) {

			e.addExplntnOfBnftItmPrdctOrSrvCdgCd(String.valueOf(explanationofbenefititemproductorservicecoding.getCode()));
		} else {
			e.addExplntnOfBnftItmPrdctOrSrvCdgCd("NULL");
		}

		if(explanationofbenefititemproductorservicecodingi == explanationofbenefititemproductorservicecodinglist.size()-1) {e.addExplntnOfBnftItmPrdctOrSrvCdgCd("]]");}


		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemproductorservicecodingi == 0) {e.addExplntnOfBnftItmPrdctOrSrvCdgUsrSltd("[[");}
		if(explanationofbenefititemproductorservicecoding.hasUserSelected()) {

			e.addExplntnOfBnftItmPrdctOrSrvCdgUsrSltd(String.valueOf(explanationofbenefititemproductorservicecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmPrdctOrSrvCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemproductorservicecodingi == explanationofbenefititemproductorservicecodinglist.size()-1) {e.addExplntnOfBnftItmPrdctOrSrvCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemproductorservicecodingi == 0) {e.addExplntnOfBnftItmPrdctOrSrvCdgSys("[[");}
		if(explanationofbenefititemproductorservicecoding.hasSystem()) {

			e.addExplntnOfBnftItmPrdctOrSrvCdgSys(String.valueOf(explanationofbenefititemproductorservicecoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmPrdctOrSrvCdgSys("NULL");
		}

		if(explanationofbenefititemproductorservicecodingi == explanationofbenefititemproductorservicecodinglist.size()-1) {e.addExplntnOfBnftItmPrdctOrSrvCdgSys("]]");}


		 };
		/******************** explanationofbenefititemprogramcode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> explanationofbenefititemprogramcodelist = explanationofbenefititem.getProgramCode();
		for(int explanationofbenefititemprogramcodei = 0; explanationofbenefititemprogramcodei<explanationofbenefititemprogramcodelist.size();explanationofbenefititemprogramcodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  explanationofbenefititemprogramcode = explanationofbenefititemprogramcodelist.get(explanationofbenefititemprogramcodei);

		/******************** ExplntnOfBnft_Itm_PrgrmCd_Txt ********************************************************************************/
		if(explanationofbenefititemprogramcodei == 0) {e.addExplntnOfBnftItmPrgrmCdTxt("[[");}
		if(explanationofbenefititemprogramcode.hasText()) {

			e.addExplntnOfBnftItmPrgrmCdTxt(String.valueOf(explanationofbenefititemprogramcode.getText()));
		} else {
			e.addExplntnOfBnftItmPrgrmCdTxt("NULL");
		}

		if(explanationofbenefititemprogramcodei == explanationofbenefititemprogramcodelist.size()-1) {e.addExplntnOfBnftItmPrgrmCdTxt("]]");}


		/******************** explanationofbenefititemprogramcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemprogramcodecodinglist = explanationofbenefititemprogramcode.getCoding();
		for(int explanationofbenefititemprogramcodecodingi = 0; explanationofbenefititemprogramcodecodingi<explanationofbenefititemprogramcodecodinglist.size();explanationofbenefititemprogramcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemprogramcodecoding = explanationofbenefititemprogramcodecodinglist.get(explanationofbenefititemprogramcodecodingi);

		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemprogramcodecodingi == 0) {e.addExplntnOfBnftItmPrgrmCdCdgDsply("[[[");}
		if(explanationofbenefititemprogramcodecoding.hasDisplay()) {

			e.addExplntnOfBnftItmPrgrmCdCdgDsply(String.valueOf(explanationofbenefititemprogramcodecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmPrgrmCdCdgDsply("NULL");
		}

		if(explanationofbenefititemprogramcodecodingi == explanationofbenefititemprogramcodecodinglist.size()-1) {e.addExplntnOfBnftItmPrgrmCdCdgDsply("]]]");}


		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemprogramcodecodingi == 0) {e.addExplntnOfBnftItmPrgrmCdCdgVrsn("[[[");}
		if(explanationofbenefititemprogramcodecoding.hasVersion()) {

			e.addExplntnOfBnftItmPrgrmCdCdgVrsn(String.valueOf(explanationofbenefititemprogramcodecoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmPrgrmCdCdgVrsn("NULL");
		}

		if(explanationofbenefititemprogramcodecodingi == explanationofbenefititemprogramcodecodinglist.size()-1) {e.addExplntnOfBnftItmPrgrmCdCdgVrsn("]]]");}


		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemprogramcodecodingi == 0) {e.addExplntnOfBnftItmPrgrmCdCdgCd("[[[");}
		if(explanationofbenefititemprogramcodecoding.hasCode()) {

			e.addExplntnOfBnftItmPrgrmCdCdgCd(String.valueOf(explanationofbenefititemprogramcodecoding.getCode()));
		} else {
			e.addExplntnOfBnftItmPrgrmCdCdgCd("NULL");
		}

		if(explanationofbenefititemprogramcodecodingi == explanationofbenefititemprogramcodecodinglist.size()-1) {e.addExplntnOfBnftItmPrgrmCdCdgCd("]]]");}


		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemprogramcodecodingi == 0) {e.addExplntnOfBnftItmPrgrmCdCdgUsrSltd("[[[");}
		if(explanationofbenefititemprogramcodecoding.hasUserSelected()) {

			e.addExplntnOfBnftItmPrgrmCdCdgUsrSltd(String.valueOf(explanationofbenefititemprogramcodecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmPrgrmCdCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemprogramcodecodingi == explanationofbenefititemprogramcodecodinglist.size()-1) {e.addExplntnOfBnftItmPrgrmCdCdgUsrSltd("]]]");}


		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemprogramcodecodingi == 0) {e.addExplntnOfBnftItmPrgrmCdCdgSys("[[[");}
		if(explanationofbenefititemprogramcodecoding.hasSystem()) {

			e.addExplntnOfBnftItmPrgrmCdCdgSys(String.valueOf(explanationofbenefititemprogramcodecoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmPrgrmCdCdgSys("NULL");
		}

		if(explanationofbenefititemprogramcodecodingi == explanationofbenefititemprogramcodecodinglist.size()-1) {e.addExplntnOfBnftItmPrgrmCdCdgSys("]]]");}


		 };
		 };
		/******************** explanationofbenefititemsubsite ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> explanationofbenefititemsubsitelist = explanationofbenefititem.getSubSite();
		for(int explanationofbenefititemsubsitei = 0; explanationofbenefititemsubsitei<explanationofbenefititemsubsitelist.size();explanationofbenefititemsubsitei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  explanationofbenefititemsubsite = explanationofbenefititemsubsitelist.get(explanationofbenefititemsubsitei);

		/******************** ExplntnOfBnft_Itm_SubSite_Txt ********************************************************************************/
		if(explanationofbenefititemsubsitei == 0) {e.addExplntnOfBnftItmSubSiteTxt("[[");}
		if(explanationofbenefititemsubsite.hasText()) {

			e.addExplntnOfBnftItmSubSiteTxt(String.valueOf(explanationofbenefititemsubsite.getText()));
		} else {
			e.addExplntnOfBnftItmSubSiteTxt("NULL");
		}

		if(explanationofbenefititemsubsitei == explanationofbenefititemsubsitelist.size()-1) {e.addExplntnOfBnftItmSubSiteTxt("]]");}


		/******************** explanationofbenefititemsubsitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemsubsitecodinglist = explanationofbenefititemsubsite.getCoding();
		for(int explanationofbenefititemsubsitecodingi = 0; explanationofbenefititemsubsitecodingi<explanationofbenefititemsubsitecodinglist.size();explanationofbenefititemsubsitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemsubsitecoding = explanationofbenefititemsubsitecodinglist.get(explanationofbenefititemsubsitecodingi);

		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemsubsitecodingi == 0) {e.addExplntnOfBnftItmSubSiteCdgDsply("[[[");}
		if(explanationofbenefititemsubsitecoding.hasDisplay()) {

			e.addExplntnOfBnftItmSubSiteCdgDsply(String.valueOf(explanationofbenefititemsubsitecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmSubSiteCdgDsply("NULL");
		}

		if(explanationofbenefititemsubsitecodingi == explanationofbenefititemsubsitecodinglist.size()-1) {e.addExplntnOfBnftItmSubSiteCdgDsply("]]]");}


		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemsubsitecodingi == 0) {e.addExplntnOfBnftItmSubSiteCdgVrsn("[[[");}
		if(explanationofbenefititemsubsitecoding.hasVersion()) {

			e.addExplntnOfBnftItmSubSiteCdgVrsn(String.valueOf(explanationofbenefititemsubsitecoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmSubSiteCdgVrsn("NULL");
		}

		if(explanationofbenefititemsubsitecodingi == explanationofbenefititemsubsitecodinglist.size()-1) {e.addExplntnOfBnftItmSubSiteCdgVrsn("]]]");}


		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemsubsitecodingi == 0) {e.addExplntnOfBnftItmSubSiteCdgCd("[[[");}
		if(explanationofbenefititemsubsitecoding.hasCode()) {

			e.addExplntnOfBnftItmSubSiteCdgCd(String.valueOf(explanationofbenefititemsubsitecoding.getCode()));
		} else {
			e.addExplntnOfBnftItmSubSiteCdgCd("NULL");
		}

		if(explanationofbenefititemsubsitecodingi == explanationofbenefititemsubsitecodinglist.size()-1) {e.addExplntnOfBnftItmSubSiteCdgCd("]]]");}


		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemsubsitecodingi == 0) {e.addExplntnOfBnftItmSubSiteCdgUsrSltd("[[[");}
		if(explanationofbenefititemsubsitecoding.hasUserSelected()) {

			e.addExplntnOfBnftItmSubSiteCdgUsrSltd(String.valueOf(explanationofbenefititemsubsitecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmSubSiteCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemsubsitecodingi == explanationofbenefititemsubsitecodinglist.size()-1) {e.addExplntnOfBnftItmSubSiteCdgUsrSltd("]]]");}


		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemsubsitecodingi == 0) {e.addExplntnOfBnftItmSubSiteCdgSys("[[[");}
		if(explanationofbenefititemsubsitecoding.hasSystem()) {

			e.addExplntnOfBnftItmSubSiteCdgSys(String.valueOf(explanationofbenefititemsubsitecoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmSubSiteCdgSys("NULL");
		}

		if(explanationofbenefititemsubsitecodingi == explanationofbenefititemsubsitecodinglist.size()-1) {e.addExplntnOfBnftItmSubSiteCdgSys("]]]");}


		 };
		 };
		/******************** explanationofbenefititemrevenue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemrevenue = explanationofbenefititem.getRevenue();

		/******************** ExplntnOfBnft_Itm_Revenue_Txt ********************************************************************************/
		if(explanationofbenefititemrevenue.hasText()) {

			e.addExplntnOfBnftItmRevenueTxt(String.valueOf(explanationofbenefititemrevenue.getText()));
		} else {
			e.addExplntnOfBnftItmRevenueTxt("NULL");
		}


		/******************** explanationofbenefititemrevenuecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefititemrevenuecodinglist = explanationofbenefititemrevenue.getCoding();
		for(int explanationofbenefititemrevenuecodingi = 0; explanationofbenefititemrevenuecodingi<explanationofbenefititemrevenuecodinglist.size();explanationofbenefititemrevenuecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefititemrevenuecoding = explanationofbenefititemrevenuecodinglist.get(explanationofbenefititemrevenuecodingi);

		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemrevenuecodingi == 0) {e.addExplntnOfBnftItmRevenueCdgDsply("[[");}
		if(explanationofbenefititemrevenuecoding.hasDisplay()) {

			e.addExplntnOfBnftItmRevenueCdgDsply(String.valueOf(explanationofbenefititemrevenuecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftItmRevenueCdgDsply("NULL");
		}

		if(explanationofbenefititemrevenuecodingi == explanationofbenefititemrevenuecodinglist.size()-1) {e.addExplntnOfBnftItmRevenueCdgDsply("]]");}


		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemrevenuecodingi == 0) {e.addExplntnOfBnftItmRevenueCdgVrsn("[[");}
		if(explanationofbenefititemrevenuecoding.hasVersion()) {

			e.addExplntnOfBnftItmRevenueCdgVrsn(String.valueOf(explanationofbenefititemrevenuecoding.getVersion()));
		} else {
			e.addExplntnOfBnftItmRevenueCdgVrsn("NULL");
		}

		if(explanationofbenefititemrevenuecodingi == explanationofbenefititemrevenuecodinglist.size()-1) {e.addExplntnOfBnftItmRevenueCdgVrsn("]]");}


		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemrevenuecodingi == 0) {e.addExplntnOfBnftItmRevenueCdgCd("[[");}
		if(explanationofbenefititemrevenuecoding.hasCode()) {

			e.addExplntnOfBnftItmRevenueCdgCd(String.valueOf(explanationofbenefititemrevenuecoding.getCode()));
		} else {
			e.addExplntnOfBnftItmRevenueCdgCd("NULL");
		}

		if(explanationofbenefititemrevenuecodingi == explanationofbenefititemrevenuecodinglist.size()-1) {e.addExplntnOfBnftItmRevenueCdgCd("]]");}


		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemrevenuecodingi == 0) {e.addExplntnOfBnftItmRevenueCdgUsrSltd("[[");}
		if(explanationofbenefititemrevenuecoding.hasUserSelected()) {

			e.addExplntnOfBnftItmRevenueCdgUsrSltd(String.valueOf(explanationofbenefititemrevenuecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftItmRevenueCdgUsrSltd("NULL");
		}

		if(explanationofbenefititemrevenuecodingi == explanationofbenefititemrevenuecodinglist.size()-1) {e.addExplntnOfBnftItmRevenueCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemrevenuecodingi == 0) {e.addExplntnOfBnftItmRevenueCdgSys("[[");}
		if(explanationofbenefititemrevenuecoding.hasSystem()) {

			e.addExplntnOfBnftItmRevenueCdgSys(String.valueOf(explanationofbenefititemrevenuecoding.getSystem()));
		} else {
			e.addExplntnOfBnftItmRevenueCdgSys("NULL");
		}

		if(explanationofbenefititemrevenuecodingi == explanationofbenefititemrevenuecodinglist.size()-1) {e.addExplntnOfBnftItmRevenueCdgSys("]]");}


		 };
		/******************** ExplntnOfBnft_Itm_NtNmbr ********************************************************************************/
		if(explanationofbenefititem.hasNoteNumber()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefititem.getNoteNumber().size(); incr++) {
				array = array + explanationofbenefititem.getNoteNumber().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftItmNtNmbr(array);

		} else {
			e.addExplntnOfBnftItmNtNmbr("NULL");
		}


		/******************** ExplntnOfBnft_Itm_Udi ********************************************************************************/
		if(explanationofbenefititem.hasUdi()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefititem.getUdi().size(); incr++) {
				array = array + explanationofbenefititem.getUdi().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftItmUdi(array);

		} else {
			e.addExplntnOfBnftItmUdi("NULL");
		}


		/******************** explanationofbenefititemlocationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address explanationofbenefititemlocationaddress = explanationofbenefititem.getLocationAddress();

		/******************** ExplntnOfBnft_Itm_LctnAddr_State ********************************************************************************/
		if(explanationofbenefititemlocationaddress.hasState()) {

			e.addExplntnOfBnftItmLctnAddrState(String.valueOf(explanationofbenefititemlocationaddress.getState()));
		} else {
			e.addExplntnOfBnftItmLctnAddrState("NULL");
		}


		/******************** explanationofbenefititemlocationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType explanationofbenefititemlocationaddresstype = explanationofbenefititemlocationaddress.getType();
		if(explanationofbenefititemlocationaddresstype!=null) {
			e.addExplntnOfBnftItmLctnAddrTyp(explanationofbenefititemlocationaddresstype.toCode());
		} else {
			e.addExplntnOfBnftItmLctnAddrTyp("NULL");
		}

		/******************** ExplntnOfBnft_Itm_LctnAddr_Cntry ********************************************************************************/
		if(explanationofbenefititemlocationaddress.hasCountry()) {

			e.addExplntnOfBnftItmLctnAddrCntry(String.valueOf(explanationofbenefititemlocationaddress.getCountry()));
		} else {
			e.addExplntnOfBnftItmLctnAddrCntry("NULL");
		}


		/******************** explanationofbenefititemlocationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefititemlocationaddressperiod = explanationofbenefititemlocationaddress.getPeriod();

		/******************** ExplntnOfBnft_Itm_LctnAddr_Prd_Strt ********************************************************************************/
		if(explanationofbenefititemlocationaddressperiod.hasStart()) {

			e.addExplntnOfBnftItmLctnAddrPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefititemlocationaddressperiod.getStart())+"\"");
		} else {
			e.addExplntnOfBnftItmLctnAddrPrdStrt("NULL");
		}


		/******************** ExplntnOfBnft_Itm_LctnAddr_Prd_End ********************************************************************************/
		if(explanationofbenefititemlocationaddressperiod.hasEnd()) {

			e.addExplntnOfBnftItmLctnAddrPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefititemlocationaddressperiod.getEnd())+"\"");
		} else {
			e.addExplntnOfBnftItmLctnAddrPrdEnd("NULL");
		}


		/******************** ExplntnOfBnft_Itm_LctnAddr_District ********************************************************************************/
		if(explanationofbenefititemlocationaddress.hasDistrict()) {

			e.addExplntnOfBnftItmLctnAddrDistrict(String.valueOf(explanationofbenefititemlocationaddress.getDistrict()));
		} else {
			e.addExplntnOfBnftItmLctnAddrDistrict("NULL");
		}


		/******************** ExplntnOfBnft_Itm_LctnAddr_PostalCd ********************************************************************************/
		if(explanationofbenefititemlocationaddress.hasPostalCode()) {

			e.addExplntnOfBnftItmLctnAddrPostalCd(String.valueOf(explanationofbenefititemlocationaddress.getPostalCode()));
		} else {
			e.addExplntnOfBnftItmLctnAddrPostalCd("NULL");
		}


		/******************** ExplntnOfBnft_Itm_LctnAddr_Line ********************************************************************************/
		if(explanationofbenefititemlocationaddress.hasLine()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefititemlocationaddress.getLine().size(); incr++) {
				array = array + explanationofbenefititemlocationaddress.getLine().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftItmLctnAddrLine(array);

		} else {
			e.addExplntnOfBnftItmLctnAddrLine("NULL");
		}


		/******************** ExplntnOfBnft_Itm_LctnAddr_City ********************************************************************************/
		if(explanationofbenefititemlocationaddress.hasCity()) {

			e.addExplntnOfBnftItmLctnAddrCity(String.valueOf(explanationofbenefititemlocationaddress.getCity()));
		} else {
			e.addExplntnOfBnftItmLctnAddrCity("NULL");
		}


		/******************** explanationofbenefititemlocationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse explanationofbenefititemlocationaddressuse = explanationofbenefititemlocationaddress.getUse();
		if(explanationofbenefititemlocationaddressuse!=null) {
			e.addExplntnOfBnftItmLctnAddrUse(explanationofbenefititemlocationaddressuse.toCode());
		} else {
			e.addExplntnOfBnftItmLctnAddrUse("NULL");
		}

		/******************** ExplntnOfBnft_Itm_LctnAddr_Txt ********************************************************************************/
		if(explanationofbenefititemlocationaddress.hasText()) {

			e.addExplntnOfBnftItmLctnAddrTxt(String.valueOf(explanationofbenefititemlocationaddress.getText()));
		} else {
			e.addExplntnOfBnftItmLctnAddrTxt("NULL");
		}


		/******************** ExplntnOfBnft_Itm_LctnRfrnc ********************************************************************************/
		if(explanationofbenefititem.hasLocationReference()) {

			if(explanationofbenefititem.getLocationReference().getReference() != null) {
			e.addExplntnOfBnftItmLctnRfrnc(explanationofbenefititem.getLocationReference().getReference());
			}
		} else {
			e.addExplntnOfBnftItmLctnRfrnc("NULL");
		}


		 };
		/******************** explanationofbenefitstatus ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.ExplanationOfBenefitStatus explanationofbenefitstatus = explanationofbenefit.getStatus();
		if(explanationofbenefitstatus!=null) {
			e.addExplntnOfBnftSts(explanationofbenefitstatus.toCode());
		} else {
			e.addExplntnOfBnftSts("NULL");
		}

		/******************** ExplntnOfBnft_Created ********************************************************************************/
		if(explanationofbenefit.hasCreated()) {

			e.addExplntnOfBnftCreated("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefit.getCreated())+"\"");
		} else {
			e.addExplntnOfBnftCreated("NULL");
		}


		/******************** explanationofbenefitidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> explanationofbenefitidentifierlist = explanationofbenefit.getIdentifier();
		for(int explanationofbenefitidentifieri = 0; explanationofbenefitidentifieri<explanationofbenefitidentifierlist.size();explanationofbenefitidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  explanationofbenefitidentifier = explanationofbenefitidentifierlist.get(explanationofbenefitidentifieri);

		/******************** ExplntnOfBnft_Id_Vl ********************************************************************************/
		if(explanationofbenefitidentifieri == 0) {e.addExplntnOfBnftIdVl("[");}
		if(explanationofbenefitidentifier.hasValue()) {

			e.addExplntnOfBnftIdVl(String.valueOf(explanationofbenefitidentifier.getValue()));
		} else {
			e.addExplntnOfBnftIdVl("NULL");
		}

		if(explanationofbenefitidentifieri == explanationofbenefitidentifierlist.size()-1) {e.addExplntnOfBnftIdVl("]");}


		/******************** explanationofbenefitidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitidentifiertype = explanationofbenefitidentifier.getType();

		/******************** ExplntnOfBnft_Id_Typ_Txt ********************************************************************************/
		if(explanationofbenefitidentifieri == 0) {e.addExplntnOfBnftIdTypTxt("[");}
		if(explanationofbenefitidentifiertype.hasText()) {

			e.addExplntnOfBnftIdTypTxt(String.valueOf(explanationofbenefitidentifiertype.getText()));
		} else {
			e.addExplntnOfBnftIdTypTxt("NULL");
		}

		if(explanationofbenefitidentifieri == explanationofbenefitidentifierlist.size()-1) {e.addExplntnOfBnftIdTypTxt("]");}


		/******************** explanationofbenefitidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitidentifiertypecodinglist = explanationofbenefitidentifiertype.getCoding();
		for(int explanationofbenefitidentifiertypecodingi = 0; explanationofbenefitidentifiertypecodingi<explanationofbenefitidentifiertypecodinglist.size();explanationofbenefitidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitidentifiertypecoding = explanationofbenefitidentifiertypecodinglist.get(explanationofbenefitidentifiertypecodingi);

		/******************** ExplntnOfBnft_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitidentifiertypecodingi == 0) {e.addExplntnOfBnftIdTypCdgDsply("[[");}
		if(explanationofbenefitidentifiertypecoding.hasDisplay()) {

			e.addExplntnOfBnftIdTypCdgDsply(String.valueOf(explanationofbenefitidentifiertypecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftIdTypCdgDsply("NULL");
		}

		if(explanationofbenefitidentifiertypecodingi == explanationofbenefitidentifiertypecodinglist.size()-1) {e.addExplntnOfBnftIdTypCdgDsply("]]");}


		/******************** ExplntnOfBnft_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitidentifiertypecodingi == 0) {e.addExplntnOfBnftIdTypCdgVrsn("[[");}
		if(explanationofbenefitidentifiertypecoding.hasVersion()) {

			e.addExplntnOfBnftIdTypCdgVrsn(String.valueOf(explanationofbenefitidentifiertypecoding.getVersion()));
		} else {
			e.addExplntnOfBnftIdTypCdgVrsn("NULL");
		}

		if(explanationofbenefitidentifiertypecodingi == explanationofbenefitidentifiertypecodinglist.size()-1) {e.addExplntnOfBnftIdTypCdgVrsn("]]");}


		/******************** ExplntnOfBnft_Id_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitidentifiertypecodingi == 0) {e.addExplntnOfBnftIdTypCdgCd("[[");}
		if(explanationofbenefitidentifiertypecoding.hasCode()) {

			e.addExplntnOfBnftIdTypCdgCd(String.valueOf(explanationofbenefitidentifiertypecoding.getCode()));
		} else {
			e.addExplntnOfBnftIdTypCdgCd("NULL");
		}

		if(explanationofbenefitidentifiertypecodingi == explanationofbenefitidentifiertypecodinglist.size()-1) {e.addExplntnOfBnftIdTypCdgCd("]]");}


		/******************** ExplntnOfBnft_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitidentifiertypecodingi == 0) {e.addExplntnOfBnftIdTypCdgUsrSltd("[[");}
		if(explanationofbenefitidentifiertypecoding.hasUserSelected()) {

			e.addExplntnOfBnftIdTypCdgUsrSltd(String.valueOf(explanationofbenefitidentifiertypecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftIdTypCdgUsrSltd("NULL");
		}

		if(explanationofbenefitidentifiertypecodingi == explanationofbenefitidentifiertypecodinglist.size()-1) {e.addExplntnOfBnftIdTypCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_Id_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitidentifiertypecodingi == 0) {e.addExplntnOfBnftIdTypCdgSys("[[");}
		if(explanationofbenefitidentifiertypecoding.hasSystem()) {

			e.addExplntnOfBnftIdTypCdgSys(String.valueOf(explanationofbenefitidentifiertypecoding.getSystem()));
		} else {
			e.addExplntnOfBnftIdTypCdgSys("NULL");
		}

		if(explanationofbenefitidentifiertypecodingi == explanationofbenefitidentifiertypecodinglist.size()-1) {e.addExplntnOfBnftIdTypCdgSys("]]");}


		 };
		/******************** explanationofbenefitidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitidentifierperiod = explanationofbenefitidentifier.getPeriod();

		/******************** ExplntnOfBnft_Id_Prd_Strt ********************************************************************************/
		if(explanationofbenefitidentifieri == 0) {e.addExplntnOfBnftIdPrdStrt("[");}
		if(explanationofbenefitidentifierperiod.hasStart()) {

			e.addExplntnOfBnftIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitidentifierperiod.getStart())+"\"");
		} else {
			e.addExplntnOfBnftIdPrdStrt("NULL");
		}

		if(explanationofbenefitidentifieri == explanationofbenefitidentifierlist.size()-1) {e.addExplntnOfBnftIdPrdStrt("]");}


		/******************** ExplntnOfBnft_Id_Prd_End ********************************************************************************/
		if(explanationofbenefitidentifieri == 0) {e.addExplntnOfBnftIdPrdEnd("[");}
		if(explanationofbenefitidentifierperiod.hasEnd()) {

			e.addExplntnOfBnftIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitidentifierperiod.getEnd())+"\"");
		} else {
			e.addExplntnOfBnftIdPrdEnd("NULL");
		}

		if(explanationofbenefitidentifieri == explanationofbenefitidentifierlist.size()-1) {e.addExplntnOfBnftIdPrdEnd("]");}


		/******************** explanationofbenefitidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse explanationofbenefitidentifieruse = explanationofbenefitidentifier.getUse();
		if(explanationofbenefitidentifieruse!=null) {
		if(explanationofbenefitidentifieri == 0) {

		e.addExplntnOfBnftIdUse("[");		}
			e.addExplntnOfBnftIdUse(explanationofbenefitidentifieruse.toCode());
		if(explanationofbenefitidentifieri == explanationofbenefitidentifierlist.size()-1) {

		e.addExplntnOfBnftIdUse("]");		}

		} else {
			e.addExplntnOfBnftIdUse("NULL");
		}

		/******************** ExplntnOfBnft_Id_Assigner ********************************************************************************/
		if(explanationofbenefitidentifieri == 0) {e.addExplntnOfBnftIdAssigner("[");}
		if(explanationofbenefitidentifier.hasAssigner()) {

			if(explanationofbenefitidentifier.getAssigner().getReference() != null) {
			e.addExplntnOfBnftIdAssigner(explanationofbenefitidentifier.getAssigner().getReference());
			}
		} else {
			e.addExplntnOfBnftIdAssigner("NULL");
		}

		if(explanationofbenefitidentifieri == explanationofbenefitidentifierlist.size()-1) {e.addExplntnOfBnftIdAssigner("]");}


		/******************** ExplntnOfBnft_Id_Sys ********************************************************************************/
		if(explanationofbenefitidentifieri == 0) {e.addExplntnOfBnftIdSys("[");}
		if(explanationofbenefitidentifier.hasSystem()) {

			e.addExplntnOfBnftIdSys(String.valueOf(explanationofbenefitidentifier.getSystem()));
		} else {
			e.addExplntnOfBnftIdSys("NULL");
		}

		if(explanationofbenefitidentifieri == explanationofbenefitidentifierlist.size()-1) {e.addExplntnOfBnftIdSys("]");}


		 };
		/******************** ExplntnOfBnft_Disposition ********************************************************************************/
		if(explanationofbenefit.hasDisposition()) {

			e.addExplntnOfBnftDisposition(String.valueOf(explanationofbenefit.getDisposition()));
		} else {
			e.addExplntnOfBnftDisposition("NULL");
		}


		/******************** explanationofbenefitoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.RemittanceOutcome explanationofbenefitoutcome = explanationofbenefit.getOutcome();
		if(explanationofbenefitoutcome!=null) {
			e.addExplntnOfBnftOutcome(explanationofbenefitoutcome.toCode());
		} else {
			e.addExplntnOfBnftOutcome("NULL");
		}

		/******************** explanationofbenefitformcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitformcode = explanationofbenefit.getFormCode();

		/******************** ExplntnOfBnft_FrmCd_Txt ********************************************************************************/
		if(explanationofbenefitformcode.hasText()) {

			e.addExplntnOfBnftFrmCdTxt(String.valueOf(explanationofbenefitformcode.getText()));
		} else {
			e.addExplntnOfBnftFrmCdTxt("NULL");
		}


		/******************** explanationofbenefitformcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitformcodecodinglist = explanationofbenefitformcode.getCoding();
		for(int explanationofbenefitformcodecodingi = 0; explanationofbenefitformcodecodingi<explanationofbenefitformcodecodinglist.size();explanationofbenefitformcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitformcodecoding = explanationofbenefitformcodecodinglist.get(explanationofbenefitformcodecodingi);

		/******************** ExplntnOfBnft_FrmCd_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitformcodecodingi == 0) {e.addExplntnOfBnftFrmCdCdgDsply("[");}
		if(explanationofbenefitformcodecoding.hasDisplay()) {

			e.addExplntnOfBnftFrmCdCdgDsply(String.valueOf(explanationofbenefitformcodecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftFrmCdCdgDsply("NULL");
		}

		if(explanationofbenefitformcodecodingi == explanationofbenefitformcodecodinglist.size()-1) {e.addExplntnOfBnftFrmCdCdgDsply("]");}


		/******************** ExplntnOfBnft_FrmCd_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitformcodecodingi == 0) {e.addExplntnOfBnftFrmCdCdgVrsn("[");}
		if(explanationofbenefitformcodecoding.hasVersion()) {

			e.addExplntnOfBnftFrmCdCdgVrsn(String.valueOf(explanationofbenefitformcodecoding.getVersion()));
		} else {
			e.addExplntnOfBnftFrmCdCdgVrsn("NULL");
		}

		if(explanationofbenefitformcodecodingi == explanationofbenefitformcodecodinglist.size()-1) {e.addExplntnOfBnftFrmCdCdgVrsn("]");}


		/******************** ExplntnOfBnft_FrmCd_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitformcodecodingi == 0) {e.addExplntnOfBnftFrmCdCdgCd("[");}
		if(explanationofbenefitformcodecoding.hasCode()) {

			e.addExplntnOfBnftFrmCdCdgCd(String.valueOf(explanationofbenefitformcodecoding.getCode()));
		} else {
			e.addExplntnOfBnftFrmCdCdgCd("NULL");
		}

		if(explanationofbenefitformcodecodingi == explanationofbenefitformcodecodinglist.size()-1) {e.addExplntnOfBnftFrmCdCdgCd("]");}


		/******************** ExplntnOfBnft_FrmCd_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitformcodecodingi == 0) {e.addExplntnOfBnftFrmCdCdgUsrSltd("[");}
		if(explanationofbenefitformcodecoding.hasUserSelected()) {

			e.addExplntnOfBnftFrmCdCdgUsrSltd(String.valueOf(explanationofbenefitformcodecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftFrmCdCdgUsrSltd("NULL");
		}

		if(explanationofbenefitformcodecodingi == explanationofbenefitformcodecodinglist.size()-1) {e.addExplntnOfBnftFrmCdCdgUsrSltd("]");}


		/******************** ExplntnOfBnft_FrmCd_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitformcodecodingi == 0) {e.addExplntnOfBnftFrmCdCdgSys("[");}
		if(explanationofbenefitformcodecoding.hasSystem()) {

			e.addExplntnOfBnftFrmCdCdgSys(String.valueOf(explanationofbenefitformcodecoding.getSystem()));
		} else {
			e.addExplntnOfBnftFrmCdCdgSys("NULL");
		}

		if(explanationofbenefitformcodecodingi == explanationofbenefitformcodecodinglist.size()-1) {e.addExplntnOfBnftFrmCdCdgSys("]");}


		 };
		/******************** explanationofbenefitprocessnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.NoteComponent> explanationofbenefitprocessnotelist = explanationofbenefit.getProcessNote();
		for(int explanationofbenefitprocessnotei = 0; explanationofbenefitprocessnotei<explanationofbenefitprocessnotelist.size();explanationofbenefitprocessnotei++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.NoteComponent  explanationofbenefitprocessnote = explanationofbenefitprocessnotelist.get(explanationofbenefitprocessnotei);

		/******************** explanationofbenefitprocessnotetype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.NoteType explanationofbenefitprocessnotetype = explanationofbenefitprocessnote.getType();
		if(explanationofbenefitprocessnotetype!=null) {
		if(explanationofbenefitprocessnotei == 0) {

		e.addExplntnOfBnftProcessNtTyp("[");		}
			e.addExplntnOfBnftProcessNtTyp(explanationofbenefitprocessnotetype.toCode());
		if(explanationofbenefitprocessnotei == explanationofbenefitprocessnotelist.size()-1) {

		e.addExplntnOfBnftProcessNtTyp("]");		}

		} else {
			e.addExplntnOfBnftProcessNtTyp("NULL");
		}

		/******************** explanationofbenefitprocessnotelanguage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitprocessnotelanguage = explanationofbenefitprocessnote.getLanguage();

		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Txt ********************************************************************************/
		if(explanationofbenefitprocessnotei == 0) {e.addExplntnOfBnftProcessNtLnguageTxt("[");}
		if(explanationofbenefitprocessnotelanguage.hasText()) {

			e.addExplntnOfBnftProcessNtLnguageTxt(String.valueOf(explanationofbenefitprocessnotelanguage.getText()));
		} else {
			e.addExplntnOfBnftProcessNtLnguageTxt("NULL");
		}

		if(explanationofbenefitprocessnotei == explanationofbenefitprocessnotelist.size()-1) {e.addExplntnOfBnftProcessNtLnguageTxt("]");}


		/******************** explanationofbenefitprocessnotelanguagecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitprocessnotelanguagecodinglist = explanationofbenefitprocessnotelanguage.getCoding();
		for(int explanationofbenefitprocessnotelanguagecodingi = 0; explanationofbenefitprocessnotelanguagecodingi<explanationofbenefitprocessnotelanguagecodinglist.size();explanationofbenefitprocessnotelanguagecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitprocessnotelanguagecoding = explanationofbenefitprocessnotelanguagecodinglist.get(explanationofbenefitprocessnotelanguagecodingi);

		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitprocessnotelanguagecodingi == 0) {e.addExplntnOfBnftProcessNtLnguageCdgDsply("[[");}
		if(explanationofbenefitprocessnotelanguagecoding.hasDisplay()) {

			e.addExplntnOfBnftProcessNtLnguageCdgDsply(String.valueOf(explanationofbenefitprocessnotelanguagecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftProcessNtLnguageCdgDsply("NULL");
		}

		if(explanationofbenefitprocessnotelanguagecodingi == explanationofbenefitprocessnotelanguagecodinglist.size()-1) {e.addExplntnOfBnftProcessNtLnguageCdgDsply("]]");}


		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitprocessnotelanguagecodingi == 0) {e.addExplntnOfBnftProcessNtLnguageCdgVrsn("[[");}
		if(explanationofbenefitprocessnotelanguagecoding.hasVersion()) {

			e.addExplntnOfBnftProcessNtLnguageCdgVrsn(String.valueOf(explanationofbenefitprocessnotelanguagecoding.getVersion()));
		} else {
			e.addExplntnOfBnftProcessNtLnguageCdgVrsn("NULL");
		}

		if(explanationofbenefitprocessnotelanguagecodingi == explanationofbenefitprocessnotelanguagecodinglist.size()-1) {e.addExplntnOfBnftProcessNtLnguageCdgVrsn("]]");}


		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitprocessnotelanguagecodingi == 0) {e.addExplntnOfBnftProcessNtLnguageCdgCd("[[");}
		if(explanationofbenefitprocessnotelanguagecoding.hasCode()) {

			e.addExplntnOfBnftProcessNtLnguageCdgCd(String.valueOf(explanationofbenefitprocessnotelanguagecoding.getCode()));
		} else {
			e.addExplntnOfBnftProcessNtLnguageCdgCd("NULL");
		}

		if(explanationofbenefitprocessnotelanguagecodingi == explanationofbenefitprocessnotelanguagecodinglist.size()-1) {e.addExplntnOfBnftProcessNtLnguageCdgCd("]]");}


		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitprocessnotelanguagecodingi == 0) {e.addExplntnOfBnftProcessNtLnguageCdgUsrSltd("[[");}
		if(explanationofbenefitprocessnotelanguagecoding.hasUserSelected()) {

			e.addExplntnOfBnftProcessNtLnguageCdgUsrSltd(String.valueOf(explanationofbenefitprocessnotelanguagecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftProcessNtLnguageCdgUsrSltd("NULL");
		}

		if(explanationofbenefitprocessnotelanguagecodingi == explanationofbenefitprocessnotelanguagecodinglist.size()-1) {e.addExplntnOfBnftProcessNtLnguageCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitprocessnotelanguagecodingi == 0) {e.addExplntnOfBnftProcessNtLnguageCdgSys("[[");}
		if(explanationofbenefitprocessnotelanguagecoding.hasSystem()) {

			e.addExplntnOfBnftProcessNtLnguageCdgSys(String.valueOf(explanationofbenefitprocessnotelanguagecoding.getSystem()));
		} else {
			e.addExplntnOfBnftProcessNtLnguageCdgSys("NULL");
		}

		if(explanationofbenefitprocessnotelanguagecodingi == explanationofbenefitprocessnotelanguagecodinglist.size()-1) {e.addExplntnOfBnftProcessNtLnguageCdgSys("]]");}


		 };
		/******************** ExplntnOfBnft_ProcessNt_Nmbr ********************************************************************************/
		if(explanationofbenefitprocessnotei == 0) {e.addExplntnOfBnftProcessNtNmbr("[");}
		if(explanationofbenefitprocessnote.hasNumber()) {

			e.addExplntnOfBnftProcessNtNmbr(String.valueOf(explanationofbenefitprocessnote.getNumber()));
		} else {
			e.addExplntnOfBnftProcessNtNmbr("NULL");
		}

		if(explanationofbenefitprocessnotei == explanationofbenefitprocessnotelist.size()-1) {e.addExplntnOfBnftProcessNtNmbr("]");}


		/******************** ExplntnOfBnft_ProcessNt_Txt ********************************************************************************/
		if(explanationofbenefitprocessnotei == 0) {e.addExplntnOfBnftProcessNtTxt("[");}
		if(explanationofbenefitprocessnote.hasText()) {

			e.addExplntnOfBnftProcessNtTxt(String.valueOf(explanationofbenefitprocessnote.getText()));
		} else {
			e.addExplntnOfBnftProcessNtTxt("NULL");
		}

		if(explanationofbenefitprocessnotei == explanationofbenefitprocessnotelist.size()-1) {e.addExplntnOfBnftProcessNtTxt("]");}


		 };
		/******************** explanationofbenefitrelated ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.RelatedClaimComponent> explanationofbenefitrelatedlist = explanationofbenefit.getRelated();
		for(int explanationofbenefitrelatedi = 0; explanationofbenefitrelatedi<explanationofbenefitrelatedlist.size();explanationofbenefitrelatedi++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.RelatedClaimComponent  explanationofbenefitrelated = explanationofbenefitrelatedlist.get(explanationofbenefitrelatedi);

		/******************** explanationofbenefitrelatedreference ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier explanationofbenefitrelatedreference = explanationofbenefitrelated.getReference();

		/******************** ExplntnOfBnft_Rlted_Rfrnc_Vl ********************************************************************************/
		if(explanationofbenefitrelatedi == 0) {e.addExplntnOfBnftRltedRfrncVl("[");}
		if(explanationofbenefitrelatedreference.hasValue()) {

			e.addExplntnOfBnftRltedRfrncVl(String.valueOf(explanationofbenefitrelatedreference.getValue()));
		} else {
			e.addExplntnOfBnftRltedRfrncVl("NULL");
		}

		if(explanationofbenefitrelatedi == explanationofbenefitrelatedlist.size()-1) {e.addExplntnOfBnftRltedRfrncVl("]");}


		/******************** explanationofbenefitrelatedreferencetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitrelatedreferencetype = explanationofbenefitrelatedreference.getType();

		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Txt ********************************************************************************/
		if(explanationofbenefitrelatedi == 0) {e.addExplntnOfBnftRltedRfrncTypTxt("[");}
		if(explanationofbenefitrelatedreferencetype.hasText()) {

			e.addExplntnOfBnftRltedRfrncTypTxt(String.valueOf(explanationofbenefitrelatedreferencetype.getText()));
		} else {
			e.addExplntnOfBnftRltedRfrncTypTxt("NULL");
		}

		if(explanationofbenefitrelatedi == explanationofbenefitrelatedlist.size()-1) {e.addExplntnOfBnftRltedRfrncTypTxt("]");}


		/******************** explanationofbenefitrelatedreferencetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitrelatedreferencetypecodinglist = explanationofbenefitrelatedreferencetype.getCoding();
		for(int explanationofbenefitrelatedreferencetypecodingi = 0; explanationofbenefitrelatedreferencetypecodingi<explanationofbenefitrelatedreferencetypecodinglist.size();explanationofbenefitrelatedreferencetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitrelatedreferencetypecoding = explanationofbenefitrelatedreferencetypecodinglist.get(explanationofbenefitrelatedreferencetypecodingi);

		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitrelatedreferencetypecodingi == 0) {e.addExplntnOfBnftRltedRfrncTypCdgDsply("[[");}
		if(explanationofbenefitrelatedreferencetypecoding.hasDisplay()) {

			e.addExplntnOfBnftRltedRfrncTypCdgDsply(String.valueOf(explanationofbenefitrelatedreferencetypecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftRltedRfrncTypCdgDsply("NULL");
		}

		if(explanationofbenefitrelatedreferencetypecodingi == explanationofbenefitrelatedreferencetypecodinglist.size()-1) {e.addExplntnOfBnftRltedRfrncTypCdgDsply("]]");}


		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitrelatedreferencetypecodingi == 0) {e.addExplntnOfBnftRltedRfrncTypCdgVrsn("[[");}
		if(explanationofbenefitrelatedreferencetypecoding.hasVersion()) {

			e.addExplntnOfBnftRltedRfrncTypCdgVrsn(String.valueOf(explanationofbenefitrelatedreferencetypecoding.getVersion()));
		} else {
			e.addExplntnOfBnftRltedRfrncTypCdgVrsn("NULL");
		}

		if(explanationofbenefitrelatedreferencetypecodingi == explanationofbenefitrelatedreferencetypecodinglist.size()-1) {e.addExplntnOfBnftRltedRfrncTypCdgVrsn("]]");}


		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitrelatedreferencetypecodingi == 0) {e.addExplntnOfBnftRltedRfrncTypCdgCd("[[");}
		if(explanationofbenefitrelatedreferencetypecoding.hasCode()) {

			e.addExplntnOfBnftRltedRfrncTypCdgCd(String.valueOf(explanationofbenefitrelatedreferencetypecoding.getCode()));
		} else {
			e.addExplntnOfBnftRltedRfrncTypCdgCd("NULL");
		}

		if(explanationofbenefitrelatedreferencetypecodingi == explanationofbenefitrelatedreferencetypecodinglist.size()-1) {e.addExplntnOfBnftRltedRfrncTypCdgCd("]]");}


		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitrelatedreferencetypecodingi == 0) {e.addExplntnOfBnftRltedRfrncTypCdgUsrSltd("[[");}
		if(explanationofbenefitrelatedreferencetypecoding.hasUserSelected()) {

			e.addExplntnOfBnftRltedRfrncTypCdgUsrSltd(String.valueOf(explanationofbenefitrelatedreferencetypecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftRltedRfrncTypCdgUsrSltd("NULL");
		}

		if(explanationofbenefitrelatedreferencetypecodingi == explanationofbenefitrelatedreferencetypecodinglist.size()-1) {e.addExplntnOfBnftRltedRfrncTypCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitrelatedreferencetypecodingi == 0) {e.addExplntnOfBnftRltedRfrncTypCdgSys("[[");}
		if(explanationofbenefitrelatedreferencetypecoding.hasSystem()) {

			e.addExplntnOfBnftRltedRfrncTypCdgSys(String.valueOf(explanationofbenefitrelatedreferencetypecoding.getSystem()));
		} else {
			e.addExplntnOfBnftRltedRfrncTypCdgSys("NULL");
		}

		if(explanationofbenefitrelatedreferencetypecodingi == explanationofbenefitrelatedreferencetypecodinglist.size()-1) {e.addExplntnOfBnftRltedRfrncTypCdgSys("]]");}


		 };
		/******************** explanationofbenefitrelatedreferenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitrelatedreferenceperiod = explanationofbenefitrelatedreference.getPeriod();

		/******************** ExplntnOfBnft_Rlted_Rfrnc_Prd_Strt ********************************************************************************/
		if(explanationofbenefitrelatedi == 0) {e.addExplntnOfBnftRltedRfrncPrdStrt("[");}
		if(explanationofbenefitrelatedreferenceperiod.hasStart()) {

			e.addExplntnOfBnftRltedRfrncPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitrelatedreferenceperiod.getStart())+"\"");
		} else {
			e.addExplntnOfBnftRltedRfrncPrdStrt("NULL");
		}

		if(explanationofbenefitrelatedi == explanationofbenefitrelatedlist.size()-1) {e.addExplntnOfBnftRltedRfrncPrdStrt("]");}


		/******************** ExplntnOfBnft_Rlted_Rfrnc_Prd_End ********************************************************************************/
		if(explanationofbenefitrelatedi == 0) {e.addExplntnOfBnftRltedRfrncPrdEnd("[");}
		if(explanationofbenefitrelatedreferenceperiod.hasEnd()) {

			e.addExplntnOfBnftRltedRfrncPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitrelatedreferenceperiod.getEnd())+"\"");
		} else {
			e.addExplntnOfBnftRltedRfrncPrdEnd("NULL");
		}

		if(explanationofbenefitrelatedi == explanationofbenefitrelatedlist.size()-1) {e.addExplntnOfBnftRltedRfrncPrdEnd("]");}


		/******************** explanationofbenefitrelatedreferenceuse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse explanationofbenefitrelatedreferenceuse = explanationofbenefitrelatedreference.getUse();
		if(explanationofbenefitrelatedreferenceuse!=null) {
		if(explanationofbenefitrelatedi == 0) {

		e.addExplntnOfBnftRltedRfrncUse("[");		}
			e.addExplntnOfBnftRltedRfrncUse(explanationofbenefitrelatedreferenceuse.toCode());
		if(explanationofbenefitrelatedi == explanationofbenefitrelatedlist.size()-1) {

		e.addExplntnOfBnftRltedRfrncUse("]");		}

		} else {
			e.addExplntnOfBnftRltedRfrncUse("NULL");
		}

		/******************** ExplntnOfBnft_Rlted_Rfrnc_Assigner ********************************************************************************/
		if(explanationofbenefitrelatedi == 0) {e.addExplntnOfBnftRltedRfrncAssigner("[");}
		if(explanationofbenefitrelatedreference.hasAssigner()) {

			if(explanationofbenefitrelatedreference.getAssigner().getReference() != null) {
			e.addExplntnOfBnftRltedRfrncAssigner(explanationofbenefitrelatedreference.getAssigner().getReference());
			}
		} else {
			e.addExplntnOfBnftRltedRfrncAssigner("NULL");
		}

		if(explanationofbenefitrelatedi == explanationofbenefitrelatedlist.size()-1) {e.addExplntnOfBnftRltedRfrncAssigner("]");}


		/******************** ExplntnOfBnft_Rlted_Rfrnc_Sys ********************************************************************************/
		if(explanationofbenefitrelatedi == 0) {e.addExplntnOfBnftRltedRfrncSys("[");}
		if(explanationofbenefitrelatedreference.hasSystem()) {

			e.addExplntnOfBnftRltedRfrncSys(String.valueOf(explanationofbenefitrelatedreference.getSystem()));
		} else {
			e.addExplntnOfBnftRltedRfrncSys("NULL");
		}

		if(explanationofbenefitrelatedi == explanationofbenefitrelatedlist.size()-1) {e.addExplntnOfBnftRltedRfrncSys("]");}


		/******************** ExplntnOfBnft_Rlted_Clm ********************************************************************************/
		if(explanationofbenefitrelatedi == 0) {e.addExplntnOfBnftRltedClm("[");}
		if(explanationofbenefitrelated.hasClaim()) {

			if(explanationofbenefitrelated.getClaim().getReference() != null) {
			e.addExplntnOfBnftRltedClm(explanationofbenefitrelated.getClaim().getReference());
			}
		} else {
			e.addExplntnOfBnftRltedClm("NULL");
		}

		if(explanationofbenefitrelatedi == explanationofbenefitrelatedlist.size()-1) {e.addExplntnOfBnftRltedClm("]");}


		/******************** explanationofbenefitrelatedrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitrelatedrelationship = explanationofbenefitrelated.getRelationship();

		/******************** ExplntnOfBnft_Rlted_Rltnship_Txt ********************************************************************************/
		if(explanationofbenefitrelatedi == 0) {e.addExplntnOfBnftRltedRltnshipTxt("[");}
		if(explanationofbenefitrelatedrelationship.hasText()) {

			e.addExplntnOfBnftRltedRltnshipTxt(String.valueOf(explanationofbenefitrelatedrelationship.getText()));
		} else {
			e.addExplntnOfBnftRltedRltnshipTxt("NULL");
		}

		if(explanationofbenefitrelatedi == explanationofbenefitrelatedlist.size()-1) {e.addExplntnOfBnftRltedRltnshipTxt("]");}


		/******************** explanationofbenefitrelatedrelationshipcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitrelatedrelationshipcodinglist = explanationofbenefitrelatedrelationship.getCoding();
		for(int explanationofbenefitrelatedrelationshipcodingi = 0; explanationofbenefitrelatedrelationshipcodingi<explanationofbenefitrelatedrelationshipcodinglist.size();explanationofbenefitrelatedrelationshipcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitrelatedrelationshipcoding = explanationofbenefitrelatedrelationshipcodinglist.get(explanationofbenefitrelatedrelationshipcodingi);

		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitrelatedrelationshipcodingi == 0) {e.addExplntnOfBnftRltedRltnshipCdgDsply("[[");}
		if(explanationofbenefitrelatedrelationshipcoding.hasDisplay()) {

			e.addExplntnOfBnftRltedRltnshipCdgDsply(String.valueOf(explanationofbenefitrelatedrelationshipcoding.getDisplay()));
		} else {
			e.addExplntnOfBnftRltedRltnshipCdgDsply("NULL");
		}

		if(explanationofbenefitrelatedrelationshipcodingi == explanationofbenefitrelatedrelationshipcodinglist.size()-1) {e.addExplntnOfBnftRltedRltnshipCdgDsply("]]");}


		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitrelatedrelationshipcodingi == 0) {e.addExplntnOfBnftRltedRltnshipCdgVrsn("[[");}
		if(explanationofbenefitrelatedrelationshipcoding.hasVersion()) {

			e.addExplntnOfBnftRltedRltnshipCdgVrsn(String.valueOf(explanationofbenefitrelatedrelationshipcoding.getVersion()));
		} else {
			e.addExplntnOfBnftRltedRltnshipCdgVrsn("NULL");
		}

		if(explanationofbenefitrelatedrelationshipcodingi == explanationofbenefitrelatedrelationshipcodinglist.size()-1) {e.addExplntnOfBnftRltedRltnshipCdgVrsn("]]");}


		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitrelatedrelationshipcodingi == 0) {e.addExplntnOfBnftRltedRltnshipCdgCd("[[");}
		if(explanationofbenefitrelatedrelationshipcoding.hasCode()) {

			e.addExplntnOfBnftRltedRltnshipCdgCd(String.valueOf(explanationofbenefitrelatedrelationshipcoding.getCode()));
		} else {
			e.addExplntnOfBnftRltedRltnshipCdgCd("NULL");
		}

		if(explanationofbenefitrelatedrelationshipcodingi == explanationofbenefitrelatedrelationshipcodinglist.size()-1) {e.addExplntnOfBnftRltedRltnshipCdgCd("]]");}


		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitrelatedrelationshipcodingi == 0) {e.addExplntnOfBnftRltedRltnshipCdgUsrSltd("[[");}
		if(explanationofbenefitrelatedrelationshipcoding.hasUserSelected()) {

			e.addExplntnOfBnftRltedRltnshipCdgUsrSltd(String.valueOf(explanationofbenefitrelatedrelationshipcoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftRltedRltnshipCdgUsrSltd("NULL");
		}

		if(explanationofbenefitrelatedrelationshipcodingi == explanationofbenefitrelatedrelationshipcodinglist.size()-1) {e.addExplntnOfBnftRltedRltnshipCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitrelatedrelationshipcodingi == 0) {e.addExplntnOfBnftRltedRltnshipCdgSys("[[");}
		if(explanationofbenefitrelatedrelationshipcoding.hasSystem()) {

			e.addExplntnOfBnftRltedRltnshipCdgSys(String.valueOf(explanationofbenefitrelatedrelationshipcoding.getSystem()));
		} else {
			e.addExplntnOfBnftRltedRltnshipCdgSys("NULL");
		}

		if(explanationofbenefitrelatedrelationshipcodingi == explanationofbenefitrelatedrelationshipcodinglist.size()-1) {e.addExplntnOfBnftRltedRltnshipCdgSys("]]");}


		 };
		 };
		/******************** explanationofbenefituse ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.Use explanationofbenefituse = explanationofbenefit.getUse();
		if(explanationofbenefituse!=null) {
			e.addExplntnOfBnftUse(explanationofbenefituse.toCode());
		} else {
			e.addExplntnOfBnftUse("NULL");
		}

		/******************** explanationofbenefitbillableperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitbillableperiod = explanationofbenefit.getBillablePeriod();

		/******************** ExplntnOfBnft_BillablePrd_Strt ********************************************************************************/
		if(explanationofbenefitbillableperiod.hasStart()) {

			e.addExplntnOfBnftBillablePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitbillableperiod.getStart())+"\"");
		} else {
			e.addExplntnOfBnftBillablePrdStrt("NULL");
		}


		/******************** ExplntnOfBnft_BillablePrd_End ********************************************************************************/
		if(explanationofbenefitbillableperiod.hasEnd()) {

			e.addExplntnOfBnftBillablePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitbillableperiod.getEnd())+"\"");
		} else {
			e.addExplntnOfBnftBillablePrdEnd("NULL");
		}


		/******************** explanationofbenefitfundsreserve ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitfundsreserve = explanationofbenefit.getFundsReserve();

		/******************** ExplntnOfBnft_FundsReserve_Txt ********************************************************************************/
		if(explanationofbenefitfundsreserve.hasText()) {

			e.addExplntnOfBnftFundsReserveTxt(String.valueOf(explanationofbenefitfundsreserve.getText()));
		} else {
			e.addExplntnOfBnftFundsReserveTxt("NULL");
		}


		/******************** explanationofbenefitfundsreservecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitfundsreservecodinglist = explanationofbenefitfundsreserve.getCoding();
		for(int explanationofbenefitfundsreservecodingi = 0; explanationofbenefitfundsreservecodingi<explanationofbenefitfundsreservecodinglist.size();explanationofbenefitfundsreservecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitfundsreservecoding = explanationofbenefitfundsreservecodinglist.get(explanationofbenefitfundsreservecodingi);

		/******************** ExplntnOfBnft_FundsReserve_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitfundsreservecodingi == 0) {e.addExplntnOfBnftFundsReserveCdgDsply("[");}
		if(explanationofbenefitfundsreservecoding.hasDisplay()) {

			e.addExplntnOfBnftFundsReserveCdgDsply(String.valueOf(explanationofbenefitfundsreservecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftFundsReserveCdgDsply("NULL");
		}

		if(explanationofbenefitfundsreservecodingi == explanationofbenefitfundsreservecodinglist.size()-1) {e.addExplntnOfBnftFundsReserveCdgDsply("]");}


		/******************** ExplntnOfBnft_FundsReserve_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitfundsreservecodingi == 0) {e.addExplntnOfBnftFundsReserveCdgVrsn("[");}
		if(explanationofbenefitfundsreservecoding.hasVersion()) {

			e.addExplntnOfBnftFundsReserveCdgVrsn(String.valueOf(explanationofbenefitfundsreservecoding.getVersion()));
		} else {
			e.addExplntnOfBnftFundsReserveCdgVrsn("NULL");
		}

		if(explanationofbenefitfundsreservecodingi == explanationofbenefitfundsreservecodinglist.size()-1) {e.addExplntnOfBnftFundsReserveCdgVrsn("]");}


		/******************** ExplntnOfBnft_FundsReserve_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitfundsreservecodingi == 0) {e.addExplntnOfBnftFundsReserveCdgCd("[");}
		if(explanationofbenefitfundsreservecoding.hasCode()) {

			e.addExplntnOfBnftFundsReserveCdgCd(String.valueOf(explanationofbenefitfundsreservecoding.getCode()));
		} else {
			e.addExplntnOfBnftFundsReserveCdgCd("NULL");
		}

		if(explanationofbenefitfundsreservecodingi == explanationofbenefitfundsreservecodinglist.size()-1) {e.addExplntnOfBnftFundsReserveCdgCd("]");}


		/******************** ExplntnOfBnft_FundsReserve_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitfundsreservecodingi == 0) {e.addExplntnOfBnftFundsReserveCdgUsrSltd("[");}
		if(explanationofbenefitfundsreservecoding.hasUserSelected()) {

			e.addExplntnOfBnftFundsReserveCdgUsrSltd(String.valueOf(explanationofbenefitfundsreservecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftFundsReserveCdgUsrSltd("NULL");
		}

		if(explanationofbenefitfundsreservecodingi == explanationofbenefitfundsreservecodinglist.size()-1) {e.addExplntnOfBnftFundsReserveCdgUsrSltd("]");}


		/******************** ExplntnOfBnft_FundsReserve_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitfundsreservecodingi == 0) {e.addExplntnOfBnftFundsReserveCdgSys("[");}
		if(explanationofbenefitfundsreservecoding.hasSystem()) {

			e.addExplntnOfBnftFundsReserveCdgSys(String.valueOf(explanationofbenefitfundsreservecoding.getSystem()));
		} else {
			e.addExplntnOfBnftFundsReserveCdgSys("NULL");
		}

		if(explanationofbenefitfundsreservecodingi == explanationofbenefitfundsreservecodinglist.size()-1) {e.addExplntnOfBnftFundsReserveCdgSys("]");}


		 };
		/******************** ExplntnOfBnft_Prescription ********************************************************************************/
		if(explanationofbenefit.hasPrescription()) {

			if(explanationofbenefit.getPrescription().getReference() != null) {
			e.addExplntnOfBnftPrescription(explanationofbenefit.getPrescription().getReference());
			}
		} else {
			e.addExplntnOfBnftPrescription("NULL");
		}


		/******************** ExplntnOfBnft_Clm ********************************************************************************/
		if(explanationofbenefit.hasClaim()) {

			if(explanationofbenefit.getClaim().getReference() != null) {
			e.addExplntnOfBnftClm(explanationofbenefit.getClaim().getReference());
			}
		} else {
			e.addExplntnOfBnftClm("NULL");
		}


		/******************** ExplntnOfBnft_Referral ********************************************************************************/
		if(explanationofbenefit.hasReferral()) {

			if(explanationofbenefit.getReferral().getReference() != null) {
			e.addExplntnOfBnftReferral(explanationofbenefit.getReferral().getReference());
			}
		} else {
			e.addExplntnOfBnftReferral("NULL");
		}


		/******************** ExplntnOfBnft_ClmRsps ********************************************************************************/
		if(explanationofbenefit.hasClaimResponse()) {

			if(explanationofbenefit.getClaimResponse().getReference() != null) {
			e.addExplntnOfBnftClmRsps(explanationofbenefit.getClaimResponse().getReference());
			}
		} else {
			e.addExplntnOfBnftClmRsps("NULL");
		}


		/******************** ExplntnOfBnft_PreAuthRef ********************************************************************************/
		if(explanationofbenefit.hasPreAuthRef()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefit.getPreAuthRef().size(); incr++) {
				array = array + explanationofbenefit.getPreAuthRef().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftPreAuthRef(array);

		} else {
			e.addExplntnOfBnftPreAuthRef("NULL");
		}


		/******************** explanationofbenefitcareteam ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.CareTeamComponent> explanationofbenefitcareteamlist = explanationofbenefit.getCareTeam();
		for(int explanationofbenefitcareteami = 0; explanationofbenefitcareteami<explanationofbenefitcareteamlist.size();explanationofbenefitcareteami++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.CareTeamComponent  explanationofbenefitcareteam = explanationofbenefitcareteamlist.get(explanationofbenefitcareteami);

		/******************** ExplntnOfBnft_CareTeam_Provider ********************************************************************************/
		if(explanationofbenefitcareteami == 0) {e.addExplntnOfBnftCareTeamProvider("[");}
		if(explanationofbenefitcareteam.hasProvider()) {

			if(explanationofbenefitcareteam.getProvider().getReference() != null) {
			e.addExplntnOfBnftCareTeamProvider(explanationofbenefitcareteam.getProvider().getReference());
			}
		} else {
			e.addExplntnOfBnftCareTeamProvider("NULL");
		}

		if(explanationofbenefitcareteami == explanationofbenefitcareteamlist.size()-1) {e.addExplntnOfBnftCareTeamProvider("]");}


		/******************** explanationofbenefitcareteamrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitcareteamrole = explanationofbenefitcareteam.getRole();

		/******************** ExplntnOfBnft_CareTeam_Role_Txt ********************************************************************************/
		if(explanationofbenefitcareteami == 0) {e.addExplntnOfBnftCareTeamRoleTxt("[");}
		if(explanationofbenefitcareteamrole.hasText()) {

			e.addExplntnOfBnftCareTeamRoleTxt(String.valueOf(explanationofbenefitcareteamrole.getText()));
		} else {
			e.addExplntnOfBnftCareTeamRoleTxt("NULL");
		}

		if(explanationofbenefitcareteami == explanationofbenefitcareteamlist.size()-1) {e.addExplntnOfBnftCareTeamRoleTxt("]");}


		/******************** explanationofbenefitcareteamrolecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitcareteamrolecodinglist = explanationofbenefitcareteamrole.getCoding();
		for(int explanationofbenefitcareteamrolecodingi = 0; explanationofbenefitcareteamrolecodingi<explanationofbenefitcareteamrolecodinglist.size();explanationofbenefitcareteamrolecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitcareteamrolecoding = explanationofbenefitcareteamrolecodinglist.get(explanationofbenefitcareteamrolecodingi);

		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitcareteamrolecodingi == 0) {e.addExplntnOfBnftCareTeamRoleCdgDsply("[[");}
		if(explanationofbenefitcareteamrolecoding.hasDisplay()) {

			e.addExplntnOfBnftCareTeamRoleCdgDsply(String.valueOf(explanationofbenefitcareteamrolecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftCareTeamRoleCdgDsply("NULL");
		}

		if(explanationofbenefitcareteamrolecodingi == explanationofbenefitcareteamrolecodinglist.size()-1) {e.addExplntnOfBnftCareTeamRoleCdgDsply("]]");}


		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitcareteamrolecodingi == 0) {e.addExplntnOfBnftCareTeamRoleCdgVrsn("[[");}
		if(explanationofbenefitcareteamrolecoding.hasVersion()) {

			e.addExplntnOfBnftCareTeamRoleCdgVrsn(String.valueOf(explanationofbenefitcareteamrolecoding.getVersion()));
		} else {
			e.addExplntnOfBnftCareTeamRoleCdgVrsn("NULL");
		}

		if(explanationofbenefitcareteamrolecodingi == explanationofbenefitcareteamrolecodinglist.size()-1) {e.addExplntnOfBnftCareTeamRoleCdgVrsn("]]");}


		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitcareteamrolecodingi == 0) {e.addExplntnOfBnftCareTeamRoleCdgCd("[[");}
		if(explanationofbenefitcareteamrolecoding.hasCode()) {

			e.addExplntnOfBnftCareTeamRoleCdgCd(String.valueOf(explanationofbenefitcareteamrolecoding.getCode()));
		} else {
			e.addExplntnOfBnftCareTeamRoleCdgCd("NULL");
		}

		if(explanationofbenefitcareteamrolecodingi == explanationofbenefitcareteamrolecodinglist.size()-1) {e.addExplntnOfBnftCareTeamRoleCdgCd("]]");}


		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitcareteamrolecodingi == 0) {e.addExplntnOfBnftCareTeamRoleCdgUsrSltd("[[");}
		if(explanationofbenefitcareteamrolecoding.hasUserSelected()) {

			e.addExplntnOfBnftCareTeamRoleCdgUsrSltd(String.valueOf(explanationofbenefitcareteamrolecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftCareTeamRoleCdgUsrSltd("NULL");
		}

		if(explanationofbenefitcareteamrolecodingi == explanationofbenefitcareteamrolecodinglist.size()-1) {e.addExplntnOfBnftCareTeamRoleCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitcareteamrolecodingi == 0) {e.addExplntnOfBnftCareTeamRoleCdgSys("[[");}
		if(explanationofbenefitcareteamrolecoding.hasSystem()) {

			e.addExplntnOfBnftCareTeamRoleCdgSys(String.valueOf(explanationofbenefitcareteamrolecoding.getSystem()));
		} else {
			e.addExplntnOfBnftCareTeamRoleCdgSys("NULL");
		}

		if(explanationofbenefitcareteamrolecodingi == explanationofbenefitcareteamrolecodinglist.size()-1) {e.addExplntnOfBnftCareTeamRoleCdgSys("]]");}


		 };
		/******************** ExplntnOfBnft_CareTeam_Sqnc ********************************************************************************/
		if(explanationofbenefitcareteami == 0) {e.addExplntnOfBnftCareTeamSqnc("[");}
		if(explanationofbenefitcareteam.hasSequence()) {

			e.addExplntnOfBnftCareTeamSqnc(String.valueOf(explanationofbenefitcareteam.getSequence()));
		} else {
			e.addExplntnOfBnftCareTeamSqnc("NULL");
		}

		if(explanationofbenefitcareteami == explanationofbenefitcareteamlist.size()-1) {e.addExplntnOfBnftCareTeamSqnc("]");}


		/******************** explanationofbenefitcareteamqualification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitcareteamqualification = explanationofbenefitcareteam.getQualification();

		/******************** ExplntnOfBnft_CareTeam_Qualification_Txt ********************************************************************************/
		if(explanationofbenefitcareteami == 0) {e.addExplntnOfBnftCareTeamQualificationTxt("[");}
		if(explanationofbenefitcareteamqualification.hasText()) {

			e.addExplntnOfBnftCareTeamQualificationTxt(String.valueOf(explanationofbenefitcareteamqualification.getText()));
		} else {
			e.addExplntnOfBnftCareTeamQualificationTxt("NULL");
		}

		if(explanationofbenefitcareteami == explanationofbenefitcareteamlist.size()-1) {e.addExplntnOfBnftCareTeamQualificationTxt("]");}


		/******************** explanationofbenefitcareteamqualificationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitcareteamqualificationcodinglist = explanationofbenefitcareteamqualification.getCoding();
		for(int explanationofbenefitcareteamqualificationcodingi = 0; explanationofbenefitcareteamqualificationcodingi<explanationofbenefitcareteamqualificationcodinglist.size();explanationofbenefitcareteamqualificationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitcareteamqualificationcoding = explanationofbenefitcareteamqualificationcodinglist.get(explanationofbenefitcareteamqualificationcodingi);

		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitcareteamqualificationcodingi == 0) {e.addExplntnOfBnftCareTeamQualificationCdgDsply("[[");}
		if(explanationofbenefitcareteamqualificationcoding.hasDisplay()) {

			e.addExplntnOfBnftCareTeamQualificationCdgDsply(String.valueOf(explanationofbenefitcareteamqualificationcoding.getDisplay()));
		} else {
			e.addExplntnOfBnftCareTeamQualificationCdgDsply("NULL");
		}

		if(explanationofbenefitcareteamqualificationcodingi == explanationofbenefitcareteamqualificationcodinglist.size()-1) {e.addExplntnOfBnftCareTeamQualificationCdgDsply("]]");}


		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitcareteamqualificationcodingi == 0) {e.addExplntnOfBnftCareTeamQualificationCdgVrsn("[[");}
		if(explanationofbenefitcareteamqualificationcoding.hasVersion()) {

			e.addExplntnOfBnftCareTeamQualificationCdgVrsn(String.valueOf(explanationofbenefitcareteamqualificationcoding.getVersion()));
		} else {
			e.addExplntnOfBnftCareTeamQualificationCdgVrsn("NULL");
		}

		if(explanationofbenefitcareteamqualificationcodingi == explanationofbenefitcareteamqualificationcodinglist.size()-1) {e.addExplntnOfBnftCareTeamQualificationCdgVrsn("]]");}


		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitcareteamqualificationcodingi == 0) {e.addExplntnOfBnftCareTeamQualificationCdgCd("[[");}
		if(explanationofbenefitcareteamqualificationcoding.hasCode()) {

			e.addExplntnOfBnftCareTeamQualificationCdgCd(String.valueOf(explanationofbenefitcareteamqualificationcoding.getCode()));
		} else {
			e.addExplntnOfBnftCareTeamQualificationCdgCd("NULL");
		}

		if(explanationofbenefitcareteamqualificationcodingi == explanationofbenefitcareteamqualificationcodinglist.size()-1) {e.addExplntnOfBnftCareTeamQualificationCdgCd("]]");}


		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitcareteamqualificationcodingi == 0) {e.addExplntnOfBnftCareTeamQualificationCdgUsrSltd("[[");}
		if(explanationofbenefitcareteamqualificationcoding.hasUserSelected()) {

			e.addExplntnOfBnftCareTeamQualificationCdgUsrSltd(String.valueOf(explanationofbenefitcareteamqualificationcoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftCareTeamQualificationCdgUsrSltd("NULL");
		}

		if(explanationofbenefitcareteamqualificationcodingi == explanationofbenefitcareteamqualificationcodinglist.size()-1) {e.addExplntnOfBnftCareTeamQualificationCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitcareteamqualificationcodingi == 0) {e.addExplntnOfBnftCareTeamQualificationCdgSys("[[");}
		if(explanationofbenefitcareteamqualificationcoding.hasSystem()) {

			e.addExplntnOfBnftCareTeamQualificationCdgSys(String.valueOf(explanationofbenefitcareteamqualificationcoding.getSystem()));
		} else {
			e.addExplntnOfBnftCareTeamQualificationCdgSys("NULL");
		}

		if(explanationofbenefitcareteamqualificationcodingi == explanationofbenefitcareteamqualificationcodinglist.size()-1) {e.addExplntnOfBnftCareTeamQualificationCdgSys("]]");}


		 };
		/******************** ExplntnOfBnft_CareTeam_Responsible ********************************************************************************/
		if(explanationofbenefitcareteami == 0) {e.addExplntnOfBnftCareTeamResponsible("[");}
		if(explanationofbenefitcareteam.hasResponsible()) {

			e.addExplntnOfBnftCareTeamResponsible(String.valueOf(explanationofbenefitcareteam.getResponsible()));
		} else {
			e.addExplntnOfBnftCareTeamResponsible("NULL");
		}

		if(explanationofbenefitcareteami == explanationofbenefitcareteamlist.size()-1) {e.addExplntnOfBnftCareTeamResponsible("]");}


		 };
		/******************** explanationofbenefitprocedure ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.ProcedureComponent> explanationofbenefitprocedurelist = explanationofbenefit.getProcedure();
		for(int explanationofbenefitprocedurei = 0; explanationofbenefitprocedurei<explanationofbenefitprocedurelist.size();explanationofbenefitprocedurei++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.ProcedureComponent  explanationofbenefitprocedure = explanationofbenefitprocedurelist.get(explanationofbenefitprocedurei);

		/******************** explanationofbenefitproceduretype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> explanationofbenefitproceduretypelist = explanationofbenefitprocedure.getType();
		for(int explanationofbenefitproceduretypei = 0; explanationofbenefitproceduretypei<explanationofbenefitproceduretypelist.size();explanationofbenefitproceduretypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  explanationofbenefitproceduretype = explanationofbenefitproceduretypelist.get(explanationofbenefitproceduretypei);

		/******************** ExplntnOfBnft_Prcdr_Typ_Txt ********************************************************************************/
		if(explanationofbenefitproceduretypei == 0) {e.addExplntnOfBnftPrcdrTypTxt("[[");}
		if(explanationofbenefitproceduretype.hasText()) {

			e.addExplntnOfBnftPrcdrTypTxt(String.valueOf(explanationofbenefitproceduretype.getText()));
		} else {
			e.addExplntnOfBnftPrcdrTypTxt("NULL");
		}

		if(explanationofbenefitproceduretypei == explanationofbenefitproceduretypelist.size()-1) {e.addExplntnOfBnftPrcdrTypTxt("]]");}


		/******************** explanationofbenefitproceduretypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitproceduretypecodinglist = explanationofbenefitproceduretype.getCoding();
		for(int explanationofbenefitproceduretypecodingi = 0; explanationofbenefitproceduretypecodingi<explanationofbenefitproceduretypecodinglist.size();explanationofbenefitproceduretypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitproceduretypecoding = explanationofbenefitproceduretypecodinglist.get(explanationofbenefitproceduretypecodingi);

		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitproceduretypecodingi == 0) {e.addExplntnOfBnftPrcdrTypCdgDsply("[[[");}
		if(explanationofbenefitproceduretypecoding.hasDisplay()) {

			e.addExplntnOfBnftPrcdrTypCdgDsply(String.valueOf(explanationofbenefitproceduretypecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftPrcdrTypCdgDsply("NULL");
		}

		if(explanationofbenefitproceduretypecodingi == explanationofbenefitproceduretypecodinglist.size()-1) {e.addExplntnOfBnftPrcdrTypCdgDsply("]]]");}


		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitproceduretypecodingi == 0) {e.addExplntnOfBnftPrcdrTypCdgVrsn("[[[");}
		if(explanationofbenefitproceduretypecoding.hasVersion()) {

			e.addExplntnOfBnftPrcdrTypCdgVrsn(String.valueOf(explanationofbenefitproceduretypecoding.getVersion()));
		} else {
			e.addExplntnOfBnftPrcdrTypCdgVrsn("NULL");
		}

		if(explanationofbenefitproceduretypecodingi == explanationofbenefitproceduretypecodinglist.size()-1) {e.addExplntnOfBnftPrcdrTypCdgVrsn("]]]");}


		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitproceduretypecodingi == 0) {e.addExplntnOfBnftPrcdrTypCdgCd("[[[");}
		if(explanationofbenefitproceduretypecoding.hasCode()) {

			e.addExplntnOfBnftPrcdrTypCdgCd(String.valueOf(explanationofbenefitproceduretypecoding.getCode()));
		} else {
			e.addExplntnOfBnftPrcdrTypCdgCd("NULL");
		}

		if(explanationofbenefitproceduretypecodingi == explanationofbenefitproceduretypecodinglist.size()-1) {e.addExplntnOfBnftPrcdrTypCdgCd("]]]");}


		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitproceduretypecodingi == 0) {e.addExplntnOfBnftPrcdrTypCdgUsrSltd("[[[");}
		if(explanationofbenefitproceduretypecoding.hasUserSelected()) {

			e.addExplntnOfBnftPrcdrTypCdgUsrSltd(String.valueOf(explanationofbenefitproceduretypecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftPrcdrTypCdgUsrSltd("NULL");
		}

		if(explanationofbenefitproceduretypecodingi == explanationofbenefitproceduretypecodinglist.size()-1) {e.addExplntnOfBnftPrcdrTypCdgUsrSltd("]]]");}


		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitproceduretypecodingi == 0) {e.addExplntnOfBnftPrcdrTypCdgSys("[[[");}
		if(explanationofbenefitproceduretypecoding.hasSystem()) {

			e.addExplntnOfBnftPrcdrTypCdgSys(String.valueOf(explanationofbenefitproceduretypecoding.getSystem()));
		} else {
			e.addExplntnOfBnftPrcdrTypCdgSys("NULL");
		}

		if(explanationofbenefitproceduretypecodingi == explanationofbenefitproceduretypecodinglist.size()-1) {e.addExplntnOfBnftPrcdrTypCdgSys("]]]");}


		 };
		 };
		/******************** ExplntnOfBnft_Prcdr_Dt ********************************************************************************/
		if(explanationofbenefitprocedure.hasDate()) {

			e.addExplntnOfBnftPrcdrDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitprocedure.getDate())+"\"");
		} else {
			e.addExplntnOfBnftPrcdrDt("NULL");
		}


		/******************** ExplntnOfBnft_Prcdr_Sqnc ********************************************************************************/
		if(explanationofbenefitprocedure.hasSequence()) {

			e.addExplntnOfBnftPrcdrSqnc(String.valueOf(explanationofbenefitprocedure.getSequence()));
		} else {
			e.addExplntnOfBnftPrcdrSqnc("NULL");
		}


		/******************** explanationofbenefitprocedureprocedurecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitprocedureprocedurecodeableconcept = explanationofbenefitprocedure.getProcedureCodeableConcept();

		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Txt ********************************************************************************/
		if(explanationofbenefitprocedureprocedurecodeableconcept.hasText()) {

			e.addExplntnOfBnftPrcdrPrcdrCdbleCncptTxt(String.valueOf(explanationofbenefitprocedureprocedurecodeableconcept.getText()));
		} else {
			e.addExplntnOfBnftPrcdrPrcdrCdbleCncptTxt("NULL");
		}


		/******************** explanationofbenefitprocedureprocedurecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitprocedureprocedurecodeableconceptcodinglist = explanationofbenefitprocedureprocedurecodeableconcept.getCoding();
		for(int explanationofbenefitprocedureprocedurecodeableconceptcodingi = 0; explanationofbenefitprocedureprocedurecodeableconceptcodingi<explanationofbenefitprocedureprocedurecodeableconceptcodinglist.size();explanationofbenefitprocedureprocedurecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitprocedureprocedurecodeableconceptcoding = explanationofbenefitprocedureprocedurecodeableconceptcodinglist.get(explanationofbenefitprocedureprocedurecodeableconceptcodingi);

		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitprocedureprocedurecodeableconceptcodingi == 0) {e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgDsply("[[");}
		if(explanationofbenefitprocedureprocedurecodeableconceptcoding.hasDisplay()) {

			e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgDsply(String.valueOf(explanationofbenefitprocedureprocedurecodeableconceptcoding.getDisplay()));
		} else {
			e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgDsply("NULL");
		}

		if(explanationofbenefitprocedureprocedurecodeableconceptcodingi == explanationofbenefitprocedureprocedurecodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgDsply("]]");}


		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitprocedureprocedurecodeableconceptcodingi == 0) {e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgVrsn("[[");}
		if(explanationofbenefitprocedureprocedurecodeableconceptcoding.hasVersion()) {

			e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgVrsn(String.valueOf(explanationofbenefitprocedureprocedurecodeableconceptcoding.getVersion()));
		} else {
			e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgVrsn("NULL");
		}

		if(explanationofbenefitprocedureprocedurecodeableconceptcodingi == explanationofbenefitprocedureprocedurecodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgVrsn("]]");}


		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitprocedureprocedurecodeableconceptcodingi == 0) {e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgCd("[[");}
		if(explanationofbenefitprocedureprocedurecodeableconceptcoding.hasCode()) {

			e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgCd(String.valueOf(explanationofbenefitprocedureprocedurecodeableconceptcoding.getCode()));
		} else {
			e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgCd("NULL");
		}

		if(explanationofbenefitprocedureprocedurecodeableconceptcodingi == explanationofbenefitprocedureprocedurecodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgCd("]]");}


		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitprocedureprocedurecodeableconceptcodingi == 0) {e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgUsrSltd("[[");}
		if(explanationofbenefitprocedureprocedurecodeableconceptcoding.hasUserSelected()) {

			e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgUsrSltd(String.valueOf(explanationofbenefitprocedureprocedurecodeableconceptcoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgUsrSltd("NULL");
		}

		if(explanationofbenefitprocedureprocedurecodeableconceptcodingi == explanationofbenefitprocedureprocedurecodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitprocedureprocedurecodeableconceptcodingi == 0) {e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgSys("[[");}
		if(explanationofbenefitprocedureprocedurecodeableconceptcoding.hasSystem()) {

			e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgSys(String.valueOf(explanationofbenefitprocedureprocedurecodeableconceptcoding.getSystem()));
		} else {
			e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgSys("NULL");
		}

		if(explanationofbenefitprocedureprocedurecodeableconceptcodingi == explanationofbenefitprocedureprocedurecodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftPrcdrPrcdrCdbleCncptCdgSys("]]");}


		 };
		/******************** ExplntnOfBnft_Prcdr_Udi ********************************************************************************/
		if(explanationofbenefitprocedure.hasUdi()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefitprocedure.getUdi().size(); incr++) {
				array = array + explanationofbenefitprocedure.getUdi().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftPrcdrUdi(array);

		} else {
			e.addExplntnOfBnftPrcdrUdi("NULL");
		}


		 };
		/******************** ExplntnOfBnft_Precedence ********************************************************************************/
		if(explanationofbenefit.hasPrecedence()) {

			e.addExplntnOfBnftPrecedence(String.valueOf(explanationofbenefit.getPrecedence()));
		} else {
			e.addExplntnOfBnftPrecedence("NULL");
		}


		/******************** explanationofbenefitadjudication ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent> explanationofbenefitadjudicationlist = explanationofbenefit.getAdjudication();
		for(int explanationofbenefitadjudicationi = 0; explanationofbenefitadjudicationi<explanationofbenefitadjudicationlist.size();explanationofbenefitadjudicationi++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent  explanationofbenefitadjudication = explanationofbenefitadjudicationlist.get(explanationofbenefitadjudicationi);

		/******************** ExplntnOfBnft_Adjdctn_Vl ********************************************************************************/
		if(explanationofbenefitadjudicationi == 0) {e.addExplntnOfBnftAdjdctnVl("[");}
		if(explanationofbenefitadjudication.hasValue()) {

			e.addExplntnOfBnftAdjdctnVl(String.valueOf(explanationofbenefitadjudication.getValue()));
		} else {
			e.addExplntnOfBnftAdjdctnVl("NULL");
		}

		if(explanationofbenefitadjudicationi == explanationofbenefitadjudicationlist.size()-1) {e.addExplntnOfBnftAdjdctnVl("]");}


		/******************** explanationofbenefitadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadjudicationreason = explanationofbenefitadjudication.getReason();

		/******************** ExplntnOfBnft_Adjdctn_Rsn_Txt ********************************************************************************/
		if(explanationofbenefitadjudicationi == 0) {e.addExplntnOfBnftAdjdctnRsnTxt("[");}
		if(explanationofbenefitadjudicationreason.hasText()) {

			e.addExplntnOfBnftAdjdctnRsnTxt(String.valueOf(explanationofbenefitadjudicationreason.getText()));
		} else {
			e.addExplntnOfBnftAdjdctnRsnTxt("NULL");
		}

		if(explanationofbenefitadjudicationi == explanationofbenefitadjudicationlist.size()-1) {e.addExplntnOfBnftAdjdctnRsnTxt("]");}


		/******************** explanationofbenefitadjudicationreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitadjudicationreasoncodinglist = explanationofbenefitadjudicationreason.getCoding();
		for(int explanationofbenefitadjudicationreasoncodingi = 0; explanationofbenefitadjudicationreasoncodingi<explanationofbenefitadjudicationreasoncodinglist.size();explanationofbenefitadjudicationreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitadjudicationreasoncoding = explanationofbenefitadjudicationreasoncodinglist.get(explanationofbenefitadjudicationreasoncodingi);

		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAdjdctnRsnCdgDsply("[[");}
		if(explanationofbenefitadjudicationreasoncoding.hasDisplay()) {

			e.addExplntnOfBnftAdjdctnRsnCdgDsply(String.valueOf(explanationofbenefitadjudicationreasoncoding.getDisplay()));
		} else {
			e.addExplntnOfBnftAdjdctnRsnCdgDsply("NULL");
		}

		if(explanationofbenefitadjudicationreasoncodingi == explanationofbenefitadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAdjdctnRsnCdgDsply("]]");}


		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAdjdctnRsnCdgVrsn("[[");}
		if(explanationofbenefitadjudicationreasoncoding.hasVersion()) {

			e.addExplntnOfBnftAdjdctnRsnCdgVrsn(String.valueOf(explanationofbenefitadjudicationreasoncoding.getVersion()));
		} else {
			e.addExplntnOfBnftAdjdctnRsnCdgVrsn("NULL");
		}

		if(explanationofbenefitadjudicationreasoncodingi == explanationofbenefitadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAdjdctnRsnCdgVrsn("]]");}


		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAdjdctnRsnCdgCd("[[");}
		if(explanationofbenefitadjudicationreasoncoding.hasCode()) {

			e.addExplntnOfBnftAdjdctnRsnCdgCd(String.valueOf(explanationofbenefitadjudicationreasoncoding.getCode()));
		} else {
			e.addExplntnOfBnftAdjdctnRsnCdgCd("NULL");
		}

		if(explanationofbenefitadjudicationreasoncodingi == explanationofbenefitadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAdjdctnRsnCdgCd("]]");}


		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAdjdctnRsnCdgUsrSltd("[[");}
		if(explanationofbenefitadjudicationreasoncoding.hasUserSelected()) {

			e.addExplntnOfBnftAdjdctnRsnCdgUsrSltd(String.valueOf(explanationofbenefitadjudicationreasoncoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftAdjdctnRsnCdgUsrSltd("NULL");
		}

		if(explanationofbenefitadjudicationreasoncodingi == explanationofbenefitadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAdjdctnRsnCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAdjdctnRsnCdgSys("[[");}
		if(explanationofbenefitadjudicationreasoncoding.hasSystem()) {

			e.addExplntnOfBnftAdjdctnRsnCdgSys(String.valueOf(explanationofbenefitadjudicationreasoncoding.getSystem()));
		} else {
			e.addExplntnOfBnftAdjdctnRsnCdgSys("NULL");
		}

		if(explanationofbenefitadjudicationreasoncodingi == explanationofbenefitadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAdjdctnRsnCdgSys("]]");}


		 };
		/******************** explanationofbenefitadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadjudicationcategory = explanationofbenefitadjudication.getCategory();

		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefitadjudicationi == 0) {e.addExplntnOfBnftAdjdctnCtgryTxt("[");}
		if(explanationofbenefitadjudicationcategory.hasText()) {

			e.addExplntnOfBnftAdjdctnCtgryTxt(String.valueOf(explanationofbenefitadjudicationcategory.getText()));
		} else {
			e.addExplntnOfBnftAdjdctnCtgryTxt("NULL");
		}

		if(explanationofbenefitadjudicationi == explanationofbenefitadjudicationlist.size()-1) {e.addExplntnOfBnftAdjdctnCtgryTxt("]");}


		/******************** explanationofbenefitadjudicationcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitadjudicationcategorycodinglist = explanationofbenefitadjudicationcategory.getCoding();
		for(int explanationofbenefitadjudicationcategorycodingi = 0; explanationofbenefitadjudicationcategorycodingi<explanationofbenefitadjudicationcategorycodinglist.size();explanationofbenefitadjudicationcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitadjudicationcategorycoding = explanationofbenefitadjudicationcategorycodinglist.get(explanationofbenefitadjudicationcategorycodingi);

		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAdjdctnCtgryCdgDsply("[[");}
		if(explanationofbenefitadjudicationcategorycoding.hasDisplay()) {

			e.addExplntnOfBnftAdjdctnCtgryCdgDsply(String.valueOf(explanationofbenefitadjudicationcategorycoding.getDisplay()));
		} else {
			e.addExplntnOfBnftAdjdctnCtgryCdgDsply("NULL");
		}

		if(explanationofbenefitadjudicationcategorycodingi == explanationofbenefitadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAdjdctnCtgryCdgDsply("]]");}


		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAdjdctnCtgryCdgVrsn("[[");}
		if(explanationofbenefitadjudicationcategorycoding.hasVersion()) {

			e.addExplntnOfBnftAdjdctnCtgryCdgVrsn(String.valueOf(explanationofbenefitadjudicationcategorycoding.getVersion()));
		} else {
			e.addExplntnOfBnftAdjdctnCtgryCdgVrsn("NULL");
		}

		if(explanationofbenefitadjudicationcategorycodingi == explanationofbenefitadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAdjdctnCtgryCdgVrsn("]]");}


		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAdjdctnCtgryCdgCd("[[");}
		if(explanationofbenefitadjudicationcategorycoding.hasCode()) {

			e.addExplntnOfBnftAdjdctnCtgryCdgCd(String.valueOf(explanationofbenefitadjudicationcategorycoding.getCode()));
		} else {
			e.addExplntnOfBnftAdjdctnCtgryCdgCd("NULL");
		}

		if(explanationofbenefitadjudicationcategorycodingi == explanationofbenefitadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAdjdctnCtgryCdgCd("]]");}


		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAdjdctnCtgryCdgUsrSltd("[[");}
		if(explanationofbenefitadjudicationcategorycoding.hasUserSelected()) {

			e.addExplntnOfBnftAdjdctnCtgryCdgUsrSltd(String.valueOf(explanationofbenefitadjudicationcategorycoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftAdjdctnCtgryCdgUsrSltd("NULL");
		}

		if(explanationofbenefitadjudicationcategorycodingi == explanationofbenefitadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAdjdctnCtgryCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAdjdctnCtgryCdgSys("[[");}
		if(explanationofbenefitadjudicationcategorycoding.hasSystem()) {

			e.addExplntnOfBnftAdjdctnCtgryCdgSys(String.valueOf(explanationofbenefitadjudicationcategorycoding.getSystem()));
		} else {
			e.addExplntnOfBnftAdjdctnCtgryCdgSys("NULL");
		}

		if(explanationofbenefitadjudicationcategorycodingi == explanationofbenefitadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAdjdctnCtgryCdgSys("]]");}


		 };
		/******************** explanationofbenefitadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadjudicationamount = explanationofbenefitadjudication.getAmount();

		/******************** ExplntnOfBnft_Adjdctn_Amnt_Vl ********************************************************************************/
		if(explanationofbenefitadjudicationi == 0) {e.addExplntnOfBnftAdjdctnAmntVl("[");}
		if(explanationofbenefitadjudicationamount.hasValue()) {

			e.addExplntnOfBnftAdjdctnAmntVl(String.valueOf(explanationofbenefitadjudicationamount.getValue()));
		} else {
			e.addExplntnOfBnftAdjdctnAmntVl("NULL");
		}

		if(explanationofbenefitadjudicationi == explanationofbenefitadjudicationlist.size()-1) {e.addExplntnOfBnftAdjdctnAmntVl("]");}


		/******************** ExplntnOfBnft_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(explanationofbenefitadjudicationi == 0) {e.addExplntnOfBnftAdjdctnAmntCrncy("[");}
		if(explanationofbenefitadjudicationamount.hasCurrency()) {

			e.addExplntnOfBnftAdjdctnAmntCrncy(String.valueOf(explanationofbenefitadjudicationamount.getCurrency()));
		} else {
			e.addExplntnOfBnftAdjdctnAmntCrncy("NULL");
		}

		if(explanationofbenefitadjudicationi == explanationofbenefitadjudicationlist.size()-1) {e.addExplntnOfBnftAdjdctnAmntCrncy("]");}


		 };
		/******************** explanationofbenefitadditem ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemComponent> explanationofbenefitadditemlist = explanationofbenefit.getAddItem();
		for(int explanationofbenefitadditemi = 0; explanationofbenefitadditemi<explanationofbenefitadditemlist.size();explanationofbenefitadditemi++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemComponent  explanationofbenefitadditem = explanationofbenefitadditemlist.get(explanationofbenefitadditemi);

		/******************** ExplntnOfBnft_AddItm_Provider ********************************************************************************/
		if(explanationofbenefitadditemi == 0) {e.addExplntnOfBnftAddItmProvider("[");}
		if(explanationofbenefitadditem.hasProvider()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefitadditem.getProvider().size(); incr++) {
				array = array + explanationofbenefitadditem.getProvider().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftAddItmProvider(array);

		} else {
			e.addExplntnOfBnftAddItmProvider("NULL");
		}

		if(explanationofbenefitadditemi == explanationofbenefitadditemlist.size()-1) {e.addExplntnOfBnftAddItmProvider("]");}


		/******************** explanationofbenefitadditemunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemunitprice = explanationofbenefitadditem.getUnitPrice();

		/******************** ExplntnOfBnft_AddItm_UntPrice_Vl ********************************************************************************/
		if(explanationofbenefitadditemi == 0) {e.addExplntnOfBnftAddItmUntPriceVl("[");}
		if(explanationofbenefitadditemunitprice.hasValue()) {

			e.addExplntnOfBnftAddItmUntPriceVl(String.valueOf(explanationofbenefitadditemunitprice.getValue()));
		} else {
			e.addExplntnOfBnftAddItmUntPriceVl("NULL");
		}

		if(explanationofbenefitadditemi == explanationofbenefitadditemlist.size()-1) {e.addExplntnOfBnftAddItmUntPriceVl("]");}


		/******************** ExplntnOfBnft_AddItm_UntPrice_Crncy ********************************************************************************/
		if(explanationofbenefitadditemi == 0) {e.addExplntnOfBnftAddItmUntPriceCrncy("[");}
		if(explanationofbenefitadditemunitprice.hasCurrency()) {

			e.addExplntnOfBnftAddItmUntPriceCrncy(String.valueOf(explanationofbenefitadditemunitprice.getCurrency()));
		} else {
			e.addExplntnOfBnftAddItmUntPriceCrncy("NULL");
		}

		if(explanationofbenefitadditemi == explanationofbenefitadditemlist.size()-1) {e.addExplntnOfBnftAddItmUntPriceCrncy("]");}


		/******************** explanationofbenefitadditemdetail ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailComponent> explanationofbenefitadditemdetaillist = explanationofbenefitadditem.getDetail();
		for(int explanationofbenefitadditemdetaili = 0; explanationofbenefitadditemdetaili<explanationofbenefitadditemdetaillist.size();explanationofbenefitadditemdetaili++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailComponent  explanationofbenefitadditemdetail = explanationofbenefitadditemdetaillist.get(explanationofbenefitadditemdetaili);

		/******************** explanationofbenefitadditemdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemdetailunitprice = explanationofbenefitadditemdetail.getUnitPrice();

		/******************** ExplntnOfBnft_AddItm_Dtl_UntPrice_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetaili == 0) {e.addExplntnOfBnftAddItmDtlUntPriceVl("[[");}
		if(explanationofbenefitadditemdetailunitprice.hasValue()) {

			e.addExplntnOfBnftAddItmDtlUntPriceVl(String.valueOf(explanationofbenefitadditemdetailunitprice.getValue()));
		} else {
			e.addExplntnOfBnftAddItmDtlUntPriceVl("NULL");
		}

		if(explanationofbenefitadditemdetaili == explanationofbenefitadditemdetaillist.size()-1) {e.addExplntnOfBnftAddItmDtlUntPriceVl("]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_UntPrice_Crncy ********************************************************************************/
		if(explanationofbenefitadditemdetaili == 0) {e.addExplntnOfBnftAddItmDtlUntPriceCrncy("[[");}
		if(explanationofbenefitadditemdetailunitprice.hasCurrency()) {

			e.addExplntnOfBnftAddItmDtlUntPriceCrncy(String.valueOf(explanationofbenefitadditemdetailunitprice.getCurrency()));
		} else {
			e.addExplntnOfBnftAddItmDtlUntPriceCrncy("NULL");
		}

		if(explanationofbenefitadditemdetaili == explanationofbenefitadditemdetaillist.size()-1) {e.addExplntnOfBnftAddItmDtlUntPriceCrncy("]]");}


		/******************** explanationofbenefitadditemdetailmodifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> explanationofbenefitadditemdetailmodifierlist = explanationofbenefitadditemdetail.getModifier();
		for(int explanationofbenefitadditemdetailmodifieri = 0; explanationofbenefitadditemdetailmodifieri<explanationofbenefitadditemdetailmodifierlist.size();explanationofbenefitadditemdetailmodifieri++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  explanationofbenefitadditemdetailmodifier = explanationofbenefitadditemdetailmodifierlist.get(explanationofbenefitadditemdetailmodifieri);

		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Txt ********************************************************************************/
		if(explanationofbenefitadditemdetailmodifieri == 0) {e.addExplntnOfBnftAddItmDtlMdfrTxt("[[[");}
		if(explanationofbenefitadditemdetailmodifier.hasText()) {

			e.addExplntnOfBnftAddItmDtlMdfrTxt(String.valueOf(explanationofbenefitadditemdetailmodifier.getText()));
		} else {
			e.addExplntnOfBnftAddItmDtlMdfrTxt("NULL");
		}

		if(explanationofbenefitadditemdetailmodifieri == explanationofbenefitadditemdetailmodifierlist.size()-1) {e.addExplntnOfBnftAddItmDtlMdfrTxt("]]]");}


		/******************** explanationofbenefitadditemdetailmodifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitadditemdetailmodifiercodinglist = explanationofbenefitadditemdetailmodifier.getCoding();
		for(int explanationofbenefitadditemdetailmodifiercodingi = 0; explanationofbenefitadditemdetailmodifiercodingi<explanationofbenefitadditemdetailmodifiercodinglist.size();explanationofbenefitadditemdetailmodifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitadditemdetailmodifiercoding = explanationofbenefitadditemdetailmodifiercodinglist.get(explanationofbenefitadditemdetailmodifiercodingi);

		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemdetailmodifiercodingi == 0) {e.addExplntnOfBnftAddItmDtlMdfrCdgDsply("[[[[");}
		if(explanationofbenefitadditemdetailmodifiercoding.hasDisplay()) {

			e.addExplntnOfBnftAddItmDtlMdfrCdgDsply(String.valueOf(explanationofbenefitadditemdetailmodifiercoding.getDisplay()));
		} else {
			e.addExplntnOfBnftAddItmDtlMdfrCdgDsply("NULL");
		}

		if(explanationofbenefitadditemdetailmodifiercodingi == explanationofbenefitadditemdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlMdfrCdgDsply("]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemdetailmodifiercodingi == 0) {e.addExplntnOfBnftAddItmDtlMdfrCdgVrsn("[[[[");}
		if(explanationofbenefitadditemdetailmodifiercoding.hasVersion()) {

			e.addExplntnOfBnftAddItmDtlMdfrCdgVrsn(String.valueOf(explanationofbenefitadditemdetailmodifiercoding.getVersion()));
		} else {
			e.addExplntnOfBnftAddItmDtlMdfrCdgVrsn("NULL");
		}

		if(explanationofbenefitadditemdetailmodifiercodingi == explanationofbenefitadditemdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlMdfrCdgVrsn("]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailmodifiercodingi == 0) {e.addExplntnOfBnftAddItmDtlMdfrCdgCd("[[[[");}
		if(explanationofbenefitadditemdetailmodifiercoding.hasCode()) {

			e.addExplntnOfBnftAddItmDtlMdfrCdgCd(String.valueOf(explanationofbenefitadditemdetailmodifiercoding.getCode()));
		} else {
			e.addExplntnOfBnftAddItmDtlMdfrCdgCd("NULL");
		}

		if(explanationofbenefitadditemdetailmodifiercodingi == explanationofbenefitadditemdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlMdfrCdgCd("]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemdetailmodifiercodingi == 0) {e.addExplntnOfBnftAddItmDtlMdfrCdgUsrSltd("[[[[");}
		if(explanationofbenefitadditemdetailmodifiercoding.hasUserSelected()) {

			e.addExplntnOfBnftAddItmDtlMdfrCdgUsrSltd(String.valueOf(explanationofbenefitadditemdetailmodifiercoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftAddItmDtlMdfrCdgUsrSltd("NULL");
		}

		if(explanationofbenefitadditemdetailmodifiercodingi == explanationofbenefitadditemdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlMdfrCdgUsrSltd("]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailmodifiercodingi == 0) {e.addExplntnOfBnftAddItmDtlMdfrCdgSys("[[[[");}
		if(explanationofbenefitadditemdetailmodifiercoding.hasSystem()) {

			e.addExplntnOfBnftAddItmDtlMdfrCdgSys(String.valueOf(explanationofbenefitadditemdetailmodifiercoding.getSystem()));
		} else {
			e.addExplntnOfBnftAddItmDtlMdfrCdgSys("NULL");
		}

		if(explanationofbenefitadditemdetailmodifiercodingi == explanationofbenefitadditemdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlMdfrCdgSys("]]]]");}


		 };
		 };
		/******************** explanationofbenefitadditemdetailadjudication ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent> explanationofbenefitadditemdetailadjudicationlist = explanationofbenefitadditemdetail.getAdjudication();
		for(int explanationofbenefitadditemdetailadjudicationi = 0; explanationofbenefitadditemdetailadjudicationi<explanationofbenefitadditemdetailadjudicationlist.size();explanationofbenefitadditemdetailadjudicationi++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent  explanationofbenefitadditemdetailadjudication = explanationofbenefitadditemdetailadjudicationlist.get(explanationofbenefitadditemdetailadjudicationi);

		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationi == 0) {e.addExplntnOfBnftAddItmDtlAdjdctnVl("[[[");}
		if(explanationofbenefitadditemdetailadjudication.hasValue()) {

			e.addExplntnOfBnftAddItmDtlAdjdctnVl(String.valueOf(explanationofbenefitadditemdetailadjudication.getValue()));
		} else {
			e.addExplntnOfBnftAddItmDtlAdjdctnVl("NULL");
		}

		if(explanationofbenefitadditemdetailadjudicationi == explanationofbenefitadditemdetailadjudicationlist.size()-1) {e.addExplntnOfBnftAddItmDtlAdjdctnVl("]]]");}


		/******************** explanationofbenefitadditemdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailadjudicationreason = explanationofbenefitadditemdetailadjudication.getReason();

		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationi == 0) {e.addExplntnOfBnftAddItmDtlAdjdctnRsnTxt("[[[");}
		if(explanationofbenefitadditemdetailadjudicationreason.hasText()) {

			e.addExplntnOfBnftAddItmDtlAdjdctnRsnTxt(String.valueOf(explanationofbenefitadditemdetailadjudicationreason.getText()));
		} else {
			e.addExplntnOfBnftAddItmDtlAdjdctnRsnTxt("NULL");
		}

		if(explanationofbenefitadditemdetailadjudicationi == explanationofbenefitadditemdetailadjudicationlist.size()-1) {e.addExplntnOfBnftAddItmDtlAdjdctnRsnTxt("]]]");}


		/******************** explanationofbenefitadditemdetailadjudicationreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitadditemdetailadjudicationreasoncodinglist = explanationofbenefitadditemdetailadjudicationreason.getCoding();
		for(int explanationofbenefitadditemdetailadjudicationreasoncodingi = 0; explanationofbenefitadditemdetailadjudicationreasoncodingi<explanationofbenefitadditemdetailadjudicationreasoncodinglist.size();explanationofbenefitadditemdetailadjudicationreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitadditemdetailadjudicationreasoncoding = explanationofbenefitadditemdetailadjudicationreasoncodinglist.get(explanationofbenefitadditemdetailadjudicationreasoncodingi);

		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgDsply("[[[[");}
		if(explanationofbenefitadditemdetailadjudicationreasoncoding.hasDisplay()) {

			e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgDsply(String.valueOf(explanationofbenefitadditemdetailadjudicationreasoncoding.getDisplay()));
		} else {
			e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgDsply("NULL");
		}

		if(explanationofbenefitadditemdetailadjudicationreasoncodingi == explanationofbenefitadditemdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgDsply("]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgVrsn("[[[[");}
		if(explanationofbenefitadditemdetailadjudicationreasoncoding.hasVersion()) {

			e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgVrsn(String.valueOf(explanationofbenefitadditemdetailadjudicationreasoncoding.getVersion()));
		} else {
			e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgVrsn("NULL");
		}

		if(explanationofbenefitadditemdetailadjudicationreasoncodingi == explanationofbenefitadditemdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgVrsn("]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgCd("[[[[");}
		if(explanationofbenefitadditemdetailadjudicationreasoncoding.hasCode()) {

			e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgCd(String.valueOf(explanationofbenefitadditemdetailadjudicationreasoncoding.getCode()));
		} else {
			e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgCd("NULL");
		}

		if(explanationofbenefitadditemdetailadjudicationreasoncodingi == explanationofbenefitadditemdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgCd("]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgUsrSltd("[[[[");}
		if(explanationofbenefitadditemdetailadjudicationreasoncoding.hasUserSelected()) {

			e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgUsrSltd(String.valueOf(explanationofbenefitadditemdetailadjudicationreasoncoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgUsrSltd("NULL");
		}

		if(explanationofbenefitadditemdetailadjudicationreasoncodingi == explanationofbenefitadditemdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgUsrSltd("]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgSys("[[[[");}
		if(explanationofbenefitadditemdetailadjudicationreasoncoding.hasSystem()) {

			e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgSys(String.valueOf(explanationofbenefitadditemdetailadjudicationreasoncoding.getSystem()));
		} else {
			e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgSys("NULL");
		}

		if(explanationofbenefitadditemdetailadjudicationreasoncodingi == explanationofbenefitadditemdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlAdjdctnRsnCdgSys("]]]]");}


		 };
		/******************** explanationofbenefitadditemdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailadjudicationcategory = explanationofbenefitadditemdetailadjudication.getCategory();

		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationi == 0) {e.addExplntnOfBnftAddItmDtlAdjdctnCtgryTxt("[[[");}
		if(explanationofbenefitadditemdetailadjudicationcategory.hasText()) {

			e.addExplntnOfBnftAddItmDtlAdjdctnCtgryTxt(String.valueOf(explanationofbenefitadditemdetailadjudicationcategory.getText()));
		} else {
			e.addExplntnOfBnftAddItmDtlAdjdctnCtgryTxt("NULL");
		}

		if(explanationofbenefitadditemdetailadjudicationi == explanationofbenefitadditemdetailadjudicationlist.size()-1) {e.addExplntnOfBnftAddItmDtlAdjdctnCtgryTxt("]]]");}


		/******************** explanationofbenefitadditemdetailadjudicationcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitadditemdetailadjudicationcategorycodinglist = explanationofbenefitadditemdetailadjudicationcategory.getCoding();
		for(int explanationofbenefitadditemdetailadjudicationcategorycodingi = 0; explanationofbenefitadditemdetailadjudicationcategorycodingi<explanationofbenefitadditemdetailadjudicationcategorycodinglist.size();explanationofbenefitadditemdetailadjudicationcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitadditemdetailadjudicationcategorycoding = explanationofbenefitadditemdetailadjudicationcategorycodinglist.get(explanationofbenefitadditemdetailadjudicationcategorycodingi);

		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgDsply("[[[[");}
		if(explanationofbenefitadditemdetailadjudicationcategorycoding.hasDisplay()) {

			e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgDsply(String.valueOf(explanationofbenefitadditemdetailadjudicationcategorycoding.getDisplay()));
		} else {
			e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgDsply("NULL");
		}

		if(explanationofbenefitadditemdetailadjudicationcategorycodingi == explanationofbenefitadditemdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgDsply("]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgVrsn("[[[[");}
		if(explanationofbenefitadditemdetailadjudicationcategorycoding.hasVersion()) {

			e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgVrsn(String.valueOf(explanationofbenefitadditemdetailadjudicationcategorycoding.getVersion()));
		} else {
			e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgVrsn("NULL");
		}

		if(explanationofbenefitadditemdetailadjudicationcategorycodingi == explanationofbenefitadditemdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgVrsn("]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgCd("[[[[");}
		if(explanationofbenefitadditemdetailadjudicationcategorycoding.hasCode()) {

			e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgCd(String.valueOf(explanationofbenefitadditemdetailadjudicationcategorycoding.getCode()));
		} else {
			e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgCd("NULL");
		}

		if(explanationofbenefitadditemdetailadjudicationcategorycodingi == explanationofbenefitadditemdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgCd("]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgUsrSltd("[[[[");}
		if(explanationofbenefitadditemdetailadjudicationcategorycoding.hasUserSelected()) {

			e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgUsrSltd(String.valueOf(explanationofbenefitadditemdetailadjudicationcategorycoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgUsrSltd("NULL");
		}

		if(explanationofbenefitadditemdetailadjudicationcategorycodingi == explanationofbenefitadditemdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgUsrSltd("]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgSys("[[[[");}
		if(explanationofbenefitadditemdetailadjudicationcategorycoding.hasSystem()) {

			e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgSys(String.valueOf(explanationofbenefitadditemdetailadjudicationcategorycoding.getSystem()));
		} else {
			e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgSys("NULL");
		}

		if(explanationofbenefitadditemdetailadjudicationcategorycodingi == explanationofbenefitadditemdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlAdjdctnCtgryCdgSys("]]]]");}


		 };
		/******************** explanationofbenefitadditemdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemdetailadjudicationamount = explanationofbenefitadditemdetailadjudication.getAmount();

		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationi == 0) {e.addExplntnOfBnftAddItmDtlAdjdctnAmntVl("[[[");}
		if(explanationofbenefitadditemdetailadjudicationamount.hasValue()) {

			e.addExplntnOfBnftAddItmDtlAdjdctnAmntVl(String.valueOf(explanationofbenefitadditemdetailadjudicationamount.getValue()));
		} else {
			e.addExplntnOfBnftAddItmDtlAdjdctnAmntVl("NULL");
		}

		if(explanationofbenefitadditemdetailadjudicationi == explanationofbenefitadditemdetailadjudicationlist.size()-1) {e.addExplntnOfBnftAddItmDtlAdjdctnAmntVl("]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationi == 0) {e.addExplntnOfBnftAddItmDtlAdjdctnAmntCrncy("[[[");}
		if(explanationofbenefitadditemdetailadjudicationamount.hasCurrency()) {

			e.addExplntnOfBnftAddItmDtlAdjdctnAmntCrncy(String.valueOf(explanationofbenefitadditemdetailadjudicationamount.getCurrency()));
		} else {
			e.addExplntnOfBnftAddItmDtlAdjdctnAmntCrncy("NULL");
		}

		if(explanationofbenefitadditemdetailadjudicationi == explanationofbenefitadditemdetailadjudicationlist.size()-1) {e.addExplntnOfBnftAddItmDtlAdjdctnAmntCrncy("]]]");}


		 };
		/******************** ExplntnOfBnft_AddItm_Dtl_Factor ********************************************************************************/
		if(explanationofbenefitadditemdetail.hasFactor()) {

			e.addExplntnOfBnftAddItmDtlFactor(String.valueOf(explanationofbenefitadditemdetail.getFactor()));
		} else {
			e.addExplntnOfBnftAddItmDtlFactor("NULL");
		}


		/******************** explanationofbenefitadditemdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemdetailnet = explanationofbenefitadditemdetail.getNet();

		/******************** ExplntnOfBnft_AddItm_Dtl_Net_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetailnet.hasValue()) {

			e.addExplntnOfBnftAddItmDtlNetVl(String.valueOf(explanationofbenefitadditemdetailnet.getValue()));
		} else {
			e.addExplntnOfBnftAddItmDtlNetVl("NULL");
		}


		/******************** ExplntnOfBnft_AddItm_Dtl_Net_Crncy ********************************************************************************/
		if(explanationofbenefitadditemdetailnet.hasCurrency()) {

			e.addExplntnOfBnftAddItmDtlNetCrncy(String.valueOf(explanationofbenefitadditemdetailnet.getCurrency()));
		} else {
			e.addExplntnOfBnftAddItmDtlNetCrncy("NULL");
		}


		/******************** explanationofbenefitadditemdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefitadditemdetailquantity = explanationofbenefitadditemdetail.getQuantity();

		/******************** ExplntnOfBnft_AddItm_Dtl_Qnty_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetailquantity.hasValue()) {

			e.addExplntnOfBnftAddItmDtlQntyVl(String.valueOf(explanationofbenefitadditemdetailquantity.getValue()));
		} else {
			e.addExplntnOfBnftAddItmDtlQntyVl("NULL");
		}


		/******************** explanationofbenefitadditemdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator explanationofbenefitadditemdetailquantitycomparator = explanationofbenefitadditemdetailquantity.getComparator();
		if(explanationofbenefitadditemdetailquantitycomparator!=null) {
			e.addExplntnOfBnftAddItmDtlQntyCmprtr(explanationofbenefitadditemdetailquantitycomparator.toCode());
		} else {
			e.addExplntnOfBnftAddItmDtlQntyCmprtr("NULL");
		}

		/******************** ExplntnOfBnft_AddItm_Dtl_Qnty_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailquantity.hasCode()) {

			e.addExplntnOfBnftAddItmDtlQntyCd(String.valueOf(explanationofbenefitadditemdetailquantity.getCode()));
		} else {
			e.addExplntnOfBnftAddItmDtlQntyCd("NULL");
		}


		/******************** ExplntnOfBnft_AddItm_Dtl_Qnty_Unt ********************************************************************************/
		if(explanationofbenefitadditemdetailquantity.hasUnit()) {

			e.addExplntnOfBnftAddItmDtlQntyUnt(String.valueOf(explanationofbenefitadditemdetailquantity.getUnit()));
		} else {
			e.addExplntnOfBnftAddItmDtlQntyUnt("NULL");
		}


		/******************** ExplntnOfBnft_AddItm_Dtl_Qnty_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailquantity.hasSystem()) {

			e.addExplntnOfBnftAddItmDtlQntySys(String.valueOf(explanationofbenefitadditemdetailquantity.getSystem()));
		} else {
			e.addExplntnOfBnftAddItmDtlQntySys("NULL");
		}


		/******************** explanationofbenefitadditemdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailproductorservice = explanationofbenefitadditemdetail.getProductOrService();

		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Txt ********************************************************************************/
		if(explanationofbenefitadditemdetailproductorservice.hasText()) {

			e.addExplntnOfBnftAddItmDtlPrdctOrSrvTxt(String.valueOf(explanationofbenefitadditemdetailproductorservice.getText()));
		} else {
			e.addExplntnOfBnftAddItmDtlPrdctOrSrvTxt("NULL");
		}


		/******************** explanationofbenefitadditemdetailproductorservicecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitadditemdetailproductorservicecodinglist = explanationofbenefitadditemdetailproductorservice.getCoding();
		for(int explanationofbenefitadditemdetailproductorservicecodingi = 0; explanationofbenefitadditemdetailproductorservicecodingi<explanationofbenefitadditemdetailproductorservicecodinglist.size();explanationofbenefitadditemdetailproductorservicecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitadditemdetailproductorservicecoding = explanationofbenefitadditemdetailproductorservicecodinglist.get(explanationofbenefitadditemdetailproductorservicecodingi);

		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemdetailproductorservicecodingi == 0) {e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgDsply("[[[");}
		if(explanationofbenefitadditemdetailproductorservicecoding.hasDisplay()) {

			e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgDsply(String.valueOf(explanationofbenefitadditemdetailproductorservicecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgDsply("NULL");
		}

		if(explanationofbenefitadditemdetailproductorservicecodingi == explanationofbenefitadditemdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgDsply("]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemdetailproductorservicecodingi == 0) {e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgVrsn("[[[");}
		if(explanationofbenefitadditemdetailproductorservicecoding.hasVersion()) {

			e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgVrsn(String.valueOf(explanationofbenefitadditemdetailproductorservicecoding.getVersion()));
		} else {
			e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgVrsn("NULL");
		}

		if(explanationofbenefitadditemdetailproductorservicecodingi == explanationofbenefitadditemdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgVrsn("]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailproductorservicecodingi == 0) {e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgCd("[[[");}
		if(explanationofbenefitadditemdetailproductorservicecoding.hasCode()) {

			e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgCd(String.valueOf(explanationofbenefitadditemdetailproductorservicecoding.getCode()));
		} else {
			e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgCd("NULL");
		}

		if(explanationofbenefitadditemdetailproductorservicecodingi == explanationofbenefitadditemdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgCd("]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemdetailproductorservicecodingi == 0) {e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgUsrSltd("[[[");}
		if(explanationofbenefitadditemdetailproductorservicecoding.hasUserSelected()) {

			e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgUsrSltd(String.valueOf(explanationofbenefitadditemdetailproductorservicecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgUsrSltd("NULL");
		}

		if(explanationofbenefitadditemdetailproductorservicecodingi == explanationofbenefitadditemdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgUsrSltd("]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailproductorservicecodingi == 0) {e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgSys("[[[");}
		if(explanationofbenefitadditemdetailproductorservicecoding.hasSystem()) {

			e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgSys(String.valueOf(explanationofbenefitadditemdetailproductorservicecoding.getSystem()));
		} else {
			e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgSys("NULL");
		}

		if(explanationofbenefitadditemdetailproductorservicecodingi == explanationofbenefitadditemdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlPrdctOrSrvCdgSys("]]]");}


		 };
		/******************** explanationofbenefitadditemdetailsubdetail ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailSubDetailComponent> explanationofbenefitadditemdetailsubdetaillist = explanationofbenefitadditemdetail.getSubDetail();
		for(int explanationofbenefitadditemdetailsubdetaili = 0; explanationofbenefitadditemdetailsubdetaili<explanationofbenefitadditemdetailsubdetaillist.size();explanationofbenefitadditemdetailsubdetaili++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailSubDetailComponent  explanationofbenefitadditemdetailsubdetail = explanationofbenefitadditemdetailsubdetaillist.get(explanationofbenefitadditemdetailsubdetaili);

		/******************** explanationofbenefitadditemdetailsubdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemdetailsubdetailunitprice = explanationofbenefitadditemdetailsubdetail.getUnitPrice();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_UntPrice_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetaili == 0) {e.addExplntnOfBnftAddItmDtlSubDtlUntPriceVl("[[[");}
		if(explanationofbenefitadditemdetailsubdetailunitprice.hasValue()) {

			e.addExplntnOfBnftAddItmDtlSubDtlUntPriceVl(String.valueOf(explanationofbenefitadditemdetailsubdetailunitprice.getValue()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlUntPriceVl("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetaili == explanationofbenefitadditemdetailsubdetaillist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlUntPriceVl("]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_UntPrice_Crncy ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetaili == 0) {e.addExplntnOfBnftAddItmDtlSubDtlUntPriceCrncy("[[[");}
		if(explanationofbenefitadditemdetailsubdetailunitprice.hasCurrency()) {

			e.addExplntnOfBnftAddItmDtlSubDtlUntPriceCrncy(String.valueOf(explanationofbenefitadditemdetailsubdetailunitprice.getCurrency()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlUntPriceCrncy("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetaili == explanationofbenefitadditemdetailsubdetaillist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlUntPriceCrncy("]]]");}


		/******************** explanationofbenefitadditemdetailsubdetailmodifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> explanationofbenefitadditemdetailsubdetailmodifierlist = explanationofbenefitadditemdetailsubdetail.getModifier();
		for(int explanationofbenefitadditemdetailsubdetailmodifieri = 0; explanationofbenefitadditemdetailsubdetailmodifieri<explanationofbenefitadditemdetailsubdetailmodifierlist.size();explanationofbenefitadditemdetailsubdetailmodifieri++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  explanationofbenefitadditemdetailsubdetailmodifier = explanationofbenefitadditemdetailsubdetailmodifierlist.get(explanationofbenefitadditemdetailsubdetailmodifieri);

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Txt ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailmodifieri == 0) {e.addExplntnOfBnftAddItmDtlSubDtlMdfrTxt("[[[[");}
		if(explanationofbenefitadditemdetailsubdetailmodifier.hasText()) {

			e.addExplntnOfBnftAddItmDtlSubDtlMdfrTxt(String.valueOf(explanationofbenefitadditemdetailsubdetailmodifier.getText()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlMdfrTxt("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailmodifieri == explanationofbenefitadditemdetailsubdetailmodifierlist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlMdfrTxt("]]]]");}


		/******************** explanationofbenefitadditemdetailsubdetailmodifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitadditemdetailsubdetailmodifiercodinglist = explanationofbenefitadditemdetailsubdetailmodifier.getCoding();
		for(int explanationofbenefitadditemdetailsubdetailmodifiercodingi = 0; explanationofbenefitadditemdetailsubdetailmodifiercodingi<explanationofbenefitadditemdetailsubdetailmodifiercodinglist.size();explanationofbenefitadditemdetailsubdetailmodifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitadditemdetailsubdetailmodifiercoding = explanationofbenefitadditemdetailsubdetailmodifiercodinglist.get(explanationofbenefitadditemdetailsubdetailmodifiercodingi);

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailmodifiercodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgDsply("[[[[[");}
		if(explanationofbenefitadditemdetailsubdetailmodifiercoding.hasDisplay()) {

			e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgDsply(String.valueOf(explanationofbenefitadditemdetailsubdetailmodifiercoding.getDisplay()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgDsply("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailmodifiercodingi == explanationofbenefitadditemdetailsubdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgDsply("]]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailmodifiercodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgVrsn("[[[[[");}
		if(explanationofbenefitadditemdetailsubdetailmodifiercoding.hasVersion()) {

			e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgVrsn(String.valueOf(explanationofbenefitadditemdetailsubdetailmodifiercoding.getVersion()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgVrsn("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailmodifiercodingi == explanationofbenefitadditemdetailsubdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgVrsn("]]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailmodifiercodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgCd("[[[[[");}
		if(explanationofbenefitadditemdetailsubdetailmodifiercoding.hasCode()) {

			e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgCd(String.valueOf(explanationofbenefitadditemdetailsubdetailmodifiercoding.getCode()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgCd("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailmodifiercodingi == explanationofbenefitadditemdetailsubdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgCd("]]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailmodifiercodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgUsrSltd("[[[[[");}
		if(explanationofbenefitadditemdetailsubdetailmodifiercoding.hasUserSelected()) {

			e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgUsrSltd(String.valueOf(explanationofbenefitadditemdetailsubdetailmodifiercoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgUsrSltd("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailmodifiercodingi == explanationofbenefitadditemdetailsubdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgUsrSltd("]]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailmodifiercodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgSys("[[[[[");}
		if(explanationofbenefitadditemdetailsubdetailmodifiercoding.hasSystem()) {

			e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgSys(String.valueOf(explanationofbenefitadditemdetailsubdetailmodifiercoding.getSystem()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgSys("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailmodifiercodingi == explanationofbenefitadditemdetailsubdetailmodifiercodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlMdfrCdgSys("]]]]]");}


		 };
		 };
		/******************** explanationofbenefitadditemdetailsubdetailadjudication ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent> explanationofbenefitadditemdetailsubdetailadjudicationlist = explanationofbenefitadditemdetailsubdetail.getAdjudication();
		for(int explanationofbenefitadditemdetailsubdetailadjudicationi = 0; explanationofbenefitadditemdetailsubdetailadjudicationi<explanationofbenefitadditemdetailsubdetailadjudicationlist.size();explanationofbenefitadditemdetailsubdetailadjudicationi++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent  explanationofbenefitadditemdetailsubdetailadjudication = explanationofbenefitadditemdetailsubdetailadjudicationlist.get(explanationofbenefitadditemdetailsubdetailadjudicationi);

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnVl("[[[[");}
		if(explanationofbenefitadditemdetailsubdetailadjudication.hasValue()) {

			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnVl(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudication.getValue()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnVl("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailadjudicationi == explanationofbenefitadditemdetailsubdetailadjudicationlist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnVl("]]]]");}


		/******************** explanationofbenefitadditemdetailsubdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailsubdetailadjudicationreason = explanationofbenefitadditemdetailsubdetailadjudication.getReason();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnTxt("[[[[");}
		if(explanationofbenefitadditemdetailsubdetailadjudicationreason.hasText()) {

			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnTxt(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationreason.getText()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnTxt("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailadjudicationi == explanationofbenefitadditemdetailsubdetailadjudicationlist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnTxt("]]]]");}


		/******************** explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitadditemdetailsubdetailadjudicationreasoncodinglist = explanationofbenefitadditemdetailsubdetailadjudicationreason.getCoding();
		for(int explanationofbenefitadditemdetailsubdetailadjudicationreasoncodingi = 0; explanationofbenefitadditemdetailsubdetailadjudicationreasoncodingi<explanationofbenefitadditemdetailsubdetailadjudicationreasoncodinglist.size();explanationofbenefitadditemdetailsubdetailadjudicationreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding = explanationofbenefitadditemdetailsubdetailadjudicationreasoncodinglist.get(explanationofbenefitadditemdetailsubdetailadjudicationreasoncodingi);

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgDsply("[[[[[");}
		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.hasDisplay()) {

			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgDsply(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.getDisplay()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgDsply("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncodingi == explanationofbenefitadditemdetailsubdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgDsply("]]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgVrsn("[[[[[");}
		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.hasVersion()) {

			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgVrsn(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.getVersion()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgVrsn("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncodingi == explanationofbenefitadditemdetailsubdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgVrsn("]]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgCd("[[[[[");}
		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.hasCode()) {

			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgCd(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.getCode()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgCd("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncodingi == explanationofbenefitadditemdetailsubdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgCd("]]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd("[[[[[");}
		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.hasUserSelected()) {

			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncodingi == explanationofbenefitadditemdetailsubdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd("]]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgSys("[[[[[");}
		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.hasSystem()) {

			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgSys(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.getSystem()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgSys("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncodingi == explanationofbenefitadditemdetailsubdetailadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgSys("]]]]]");}


		 };
		/******************** explanationofbenefitadditemdetailsubdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailsubdetailadjudicationcategory = explanationofbenefitadditemdetailsubdetailadjudication.getCategory();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryTxt("[[[[");}
		if(explanationofbenefitadditemdetailsubdetailadjudicationcategory.hasText()) {

			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryTxt(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationcategory.getText()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryTxt("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailadjudicationi == explanationofbenefitadditemdetailsubdetailadjudicationlist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryTxt("]]]]");}


		/******************** explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitadditemdetailsubdetailadjudicationcategorycodinglist = explanationofbenefitadditemdetailsubdetailadjudicationcategory.getCoding();
		for(int explanationofbenefitadditemdetailsubdetailadjudicationcategorycodingi = 0; explanationofbenefitadditemdetailsubdetailadjudicationcategorycodingi<explanationofbenefitadditemdetailsubdetailadjudicationcategorycodinglist.size();explanationofbenefitadditemdetailsubdetailadjudicationcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding = explanationofbenefitadditemdetailsubdetailadjudicationcategorycodinglist.get(explanationofbenefitadditemdetailsubdetailadjudicationcategorycodingi);

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgDsply("[[[[[");}
		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.hasDisplay()) {

			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgDsply(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.getDisplay()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgDsply("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycodingi == explanationofbenefitadditemdetailsubdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgDsply("]]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgVrsn("[[[[[");}
		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.hasVersion()) {

			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgVrsn(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.getVersion()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgVrsn("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycodingi == explanationofbenefitadditemdetailsubdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgVrsn("]]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgCd("[[[[[");}
		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.hasCode()) {

			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgCd(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.getCode()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgCd("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycodingi == explanationofbenefitadditemdetailsubdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgCd("]]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd("[[[[[");}
		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.hasUserSelected()) {

			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycodingi == explanationofbenefitadditemdetailsubdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd("]]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgSys("[[[[[");}
		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.hasSystem()) {

			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgSys(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.getSystem()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgSys("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycodingi == explanationofbenefitadditemdetailsubdetailadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgSys("]]]]]");}


		 };
		/******************** explanationofbenefitadditemdetailsubdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemdetailsubdetailadjudicationamount = explanationofbenefitadditemdetailsubdetailadjudication.getAmount();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntVl("[[[[");}
		if(explanationofbenefitadditemdetailsubdetailadjudicationamount.hasValue()) {

			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntVl(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationamount.getValue()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntVl("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailadjudicationi == explanationofbenefitadditemdetailsubdetailadjudicationlist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntVl("]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntCrncy("[[[[");}
		if(explanationofbenefitadditemdetailsubdetailadjudicationamount.hasCurrency()) {

			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntCrncy(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationamount.getCurrency()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntCrncy("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailadjudicationi == explanationofbenefitadditemdetailsubdetailadjudicationlist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntCrncy("]]]]");}


		 };
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Factor ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetail.hasFactor()) {

			e.addExplntnOfBnftAddItmDtlSubDtlFactor(String.valueOf(explanationofbenefitadditemdetailsubdetail.getFactor()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlFactor("NULL");
		}


		/******************** explanationofbenefitadditemdetailsubdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemdetailsubdetailnet = explanationofbenefitadditemdetailsubdetail.getNet();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Net_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailnet.hasValue()) {

			e.addExplntnOfBnftAddItmDtlSubDtlNetVl(String.valueOf(explanationofbenefitadditemdetailsubdetailnet.getValue()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlNetVl("NULL");
		}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Net_Crncy ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailnet.hasCurrency()) {

			e.addExplntnOfBnftAddItmDtlSubDtlNetCrncy(String.valueOf(explanationofbenefitadditemdetailsubdetailnet.getCurrency()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlNetCrncy("NULL");
		}


		/******************** explanationofbenefitadditemdetailsubdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefitadditemdetailsubdetailquantity = explanationofbenefitadditemdetailsubdetail.getQuantity();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Qnty_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailquantity.hasValue()) {

			e.addExplntnOfBnftAddItmDtlSubDtlQntyVl(String.valueOf(explanationofbenefitadditemdetailsubdetailquantity.getValue()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlQntyVl("NULL");
		}


		/******************** explanationofbenefitadditemdetailsubdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator explanationofbenefitadditemdetailsubdetailquantitycomparator = explanationofbenefitadditemdetailsubdetailquantity.getComparator();
		if(explanationofbenefitadditemdetailsubdetailquantitycomparator!=null) {
			e.addExplntnOfBnftAddItmDtlSubDtlQntyCmprtr(explanationofbenefitadditemdetailsubdetailquantitycomparator.toCode());
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlQntyCmprtr("NULL");
		}

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Qnty_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailquantity.hasCode()) {

			e.addExplntnOfBnftAddItmDtlSubDtlQntyCd(String.valueOf(explanationofbenefitadditemdetailsubdetailquantity.getCode()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlQntyCd("NULL");
		}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Qnty_Unt ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailquantity.hasUnit()) {

			e.addExplntnOfBnftAddItmDtlSubDtlQntyUnt(String.valueOf(explanationofbenefitadditemdetailsubdetailquantity.getUnit()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlQntyUnt("NULL");
		}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Qnty_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailquantity.hasSystem()) {

			e.addExplntnOfBnftAddItmDtlSubDtlQntySys(String.valueOf(explanationofbenefitadditemdetailsubdetailquantity.getSystem()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlQntySys("NULL");
		}


		/******************** explanationofbenefitadditemdetailsubdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailsubdetailproductorservice = explanationofbenefitadditemdetailsubdetail.getProductOrService();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Txt ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailproductorservice.hasText()) {

			e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvTxt(String.valueOf(explanationofbenefitadditemdetailsubdetailproductorservice.getText()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvTxt("NULL");
		}


		/******************** explanationofbenefitadditemdetailsubdetailproductorservicecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitadditemdetailsubdetailproductorservicecodinglist = explanationofbenefitadditemdetailsubdetailproductorservice.getCoding();
		for(int explanationofbenefitadditemdetailsubdetailproductorservicecodingi = 0; explanationofbenefitadditemdetailsubdetailproductorservicecodingi<explanationofbenefitadditemdetailsubdetailproductorservicecodinglist.size();explanationofbenefitadditemdetailsubdetailproductorservicecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitadditemdetailsubdetailproductorservicecoding = explanationofbenefitadditemdetailsubdetailproductorservicecodinglist.get(explanationofbenefitadditemdetailsubdetailproductorservicecodingi);

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailproductorservicecodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgDsply("[[[[");}
		if(explanationofbenefitadditemdetailsubdetailproductorservicecoding.hasDisplay()) {

			e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgDsply(String.valueOf(explanationofbenefitadditemdetailsubdetailproductorservicecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgDsply("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailproductorservicecodingi == explanationofbenefitadditemdetailsubdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgDsply("]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailproductorservicecodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgVrsn("[[[[");}
		if(explanationofbenefitadditemdetailsubdetailproductorservicecoding.hasVersion()) {

			e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgVrsn(String.valueOf(explanationofbenefitadditemdetailsubdetailproductorservicecoding.getVersion()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgVrsn("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailproductorservicecodingi == explanationofbenefitadditemdetailsubdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgVrsn("]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailproductorservicecodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgCd("[[[[");}
		if(explanationofbenefitadditemdetailsubdetailproductorservicecoding.hasCode()) {

			e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgCd(String.valueOf(explanationofbenefitadditemdetailsubdetailproductorservicecoding.getCode()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgCd("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailproductorservicecodingi == explanationofbenefitadditemdetailsubdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgCd("]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailproductorservicecodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd("[[[[");}
		if(explanationofbenefitadditemdetailsubdetailproductorservicecoding.hasUserSelected()) {

			e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd(String.valueOf(explanationofbenefitadditemdetailsubdetailproductorservicecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailproductorservicecodingi == explanationofbenefitadditemdetailsubdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd("]]]]");}


		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailproductorservicecodingi == 0) {e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgSys("[[[[");}
		if(explanationofbenefitadditemdetailsubdetailproductorservicecoding.hasSystem()) {

			e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgSys(String.valueOf(explanationofbenefitadditemdetailsubdetailproductorservicecoding.getSystem()));
		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgSys("NULL");
		}

		if(explanationofbenefitadditemdetailsubdetailproductorservicecodingi == explanationofbenefitadditemdetailsubdetailproductorservicecodinglist.size()-1) {e.addExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgSys("]]]]");}


		 };
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_NtNmbr ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetail.hasNoteNumber()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefitadditemdetailsubdetail.getNoteNumber().size(); incr++) {
				array = array + explanationofbenefitadditemdetailsubdetail.getNoteNumber().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftAddItmDtlSubDtlNtNmbr(array);

		} else {
			e.addExplntnOfBnftAddItmDtlSubDtlNtNmbr("NULL");
		}


		 };
		/******************** ExplntnOfBnft_AddItm_Dtl_NtNmbr ********************************************************************************/
		if(explanationofbenefitadditemdetail.hasNoteNumber()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefitadditemdetail.getNoteNumber().size(); incr++) {
				array = array + explanationofbenefitadditemdetail.getNoteNumber().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftAddItmDtlNtNmbr(array);

		} else {
			e.addExplntnOfBnftAddItmDtlNtNmbr("NULL");
		}


		 };
		/******************** explanationofbenefitadditembodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditembodysite = explanationofbenefitadditem.getBodySite();

		/******************** ExplntnOfBnft_AddItm_BodySite_Txt ********************************************************************************/
		if(explanationofbenefitadditembodysite.hasText()) {

			e.addExplntnOfBnftAddItmBodySiteTxt(String.valueOf(explanationofbenefitadditembodysite.getText()));
		} else {
			e.addExplntnOfBnftAddItmBodySiteTxt("NULL");
		}


		/******************** explanationofbenefitadditembodysitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitadditembodysitecodinglist = explanationofbenefitadditembodysite.getCoding();
		for(int explanationofbenefitadditembodysitecodingi = 0; explanationofbenefitadditembodysitecodingi<explanationofbenefitadditembodysitecodinglist.size();explanationofbenefitadditembodysitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitadditembodysitecoding = explanationofbenefitadditembodysitecodinglist.get(explanationofbenefitadditembodysitecodingi);

		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditembodysitecodingi == 0) {e.addExplntnOfBnftAddItmBodySiteCdgDsply("[[");}
		if(explanationofbenefitadditembodysitecoding.hasDisplay()) {

			e.addExplntnOfBnftAddItmBodySiteCdgDsply(String.valueOf(explanationofbenefitadditembodysitecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftAddItmBodySiteCdgDsply("NULL");
		}

		if(explanationofbenefitadditembodysitecodingi == explanationofbenefitadditembodysitecodinglist.size()-1) {e.addExplntnOfBnftAddItmBodySiteCdgDsply("]]");}


		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditembodysitecodingi == 0) {e.addExplntnOfBnftAddItmBodySiteCdgVrsn("[[");}
		if(explanationofbenefitadditembodysitecoding.hasVersion()) {

			e.addExplntnOfBnftAddItmBodySiteCdgVrsn(String.valueOf(explanationofbenefitadditembodysitecoding.getVersion()));
		} else {
			e.addExplntnOfBnftAddItmBodySiteCdgVrsn("NULL");
		}

		if(explanationofbenefitadditembodysitecodingi == explanationofbenefitadditembodysitecodinglist.size()-1) {e.addExplntnOfBnftAddItmBodySiteCdgVrsn("]]");}


		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditembodysitecodingi == 0) {e.addExplntnOfBnftAddItmBodySiteCdgCd("[[");}
		if(explanationofbenefitadditembodysitecoding.hasCode()) {

			e.addExplntnOfBnftAddItmBodySiteCdgCd(String.valueOf(explanationofbenefitadditembodysitecoding.getCode()));
		} else {
			e.addExplntnOfBnftAddItmBodySiteCdgCd("NULL");
		}

		if(explanationofbenefitadditembodysitecodingi == explanationofbenefitadditembodysitecodinglist.size()-1) {e.addExplntnOfBnftAddItmBodySiteCdgCd("]]");}


		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditembodysitecodingi == 0) {e.addExplntnOfBnftAddItmBodySiteCdgUsrSltd("[[");}
		if(explanationofbenefitadditembodysitecoding.hasUserSelected()) {

			e.addExplntnOfBnftAddItmBodySiteCdgUsrSltd(String.valueOf(explanationofbenefitadditembodysitecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftAddItmBodySiteCdgUsrSltd("NULL");
		}

		if(explanationofbenefitadditembodysitecodingi == explanationofbenefitadditembodysitecodinglist.size()-1) {e.addExplntnOfBnftAddItmBodySiteCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditembodysitecodingi == 0) {e.addExplntnOfBnftAddItmBodySiteCdgSys("[[");}
		if(explanationofbenefitadditembodysitecoding.hasSystem()) {

			e.addExplntnOfBnftAddItmBodySiteCdgSys(String.valueOf(explanationofbenefitadditembodysitecoding.getSystem()));
		} else {
			e.addExplntnOfBnftAddItmBodySiteCdgSys("NULL");
		}

		if(explanationofbenefitadditembodysitecodingi == explanationofbenefitadditembodysitecodinglist.size()-1) {e.addExplntnOfBnftAddItmBodySiteCdgSys("]]");}


		 };
		/******************** explanationofbenefitadditemmodifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> explanationofbenefitadditemmodifierlist = explanationofbenefitadditem.getModifier();
		for(int explanationofbenefitadditemmodifieri = 0; explanationofbenefitadditemmodifieri<explanationofbenefitadditemmodifierlist.size();explanationofbenefitadditemmodifieri++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  explanationofbenefitadditemmodifier = explanationofbenefitadditemmodifierlist.get(explanationofbenefitadditemmodifieri);

		/******************** ExplntnOfBnft_AddItm_Mdfr_Txt ********************************************************************************/
		if(explanationofbenefitadditemmodifieri == 0) {e.addExplntnOfBnftAddItmMdfrTxt("[[");}
		if(explanationofbenefitadditemmodifier.hasText()) {

			e.addExplntnOfBnftAddItmMdfrTxt(String.valueOf(explanationofbenefitadditemmodifier.getText()));
		} else {
			e.addExplntnOfBnftAddItmMdfrTxt("NULL");
		}

		if(explanationofbenefitadditemmodifieri == explanationofbenefitadditemmodifierlist.size()-1) {e.addExplntnOfBnftAddItmMdfrTxt("]]");}


		/******************** explanationofbenefitadditemmodifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitadditemmodifiercodinglist = explanationofbenefitadditemmodifier.getCoding();
		for(int explanationofbenefitadditemmodifiercodingi = 0; explanationofbenefitadditemmodifiercodingi<explanationofbenefitadditemmodifiercodinglist.size();explanationofbenefitadditemmodifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitadditemmodifiercoding = explanationofbenefitadditemmodifiercodinglist.get(explanationofbenefitadditemmodifiercodingi);

		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemmodifiercodingi == 0) {e.addExplntnOfBnftAddItmMdfrCdgDsply("[[[");}
		if(explanationofbenefitadditemmodifiercoding.hasDisplay()) {

			e.addExplntnOfBnftAddItmMdfrCdgDsply(String.valueOf(explanationofbenefitadditemmodifiercoding.getDisplay()));
		} else {
			e.addExplntnOfBnftAddItmMdfrCdgDsply("NULL");
		}

		if(explanationofbenefitadditemmodifiercodingi == explanationofbenefitadditemmodifiercodinglist.size()-1) {e.addExplntnOfBnftAddItmMdfrCdgDsply("]]]");}


		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemmodifiercodingi == 0) {e.addExplntnOfBnftAddItmMdfrCdgVrsn("[[[");}
		if(explanationofbenefitadditemmodifiercoding.hasVersion()) {

			e.addExplntnOfBnftAddItmMdfrCdgVrsn(String.valueOf(explanationofbenefitadditemmodifiercoding.getVersion()));
		} else {
			e.addExplntnOfBnftAddItmMdfrCdgVrsn("NULL");
		}

		if(explanationofbenefitadditemmodifiercodingi == explanationofbenefitadditemmodifiercodinglist.size()-1) {e.addExplntnOfBnftAddItmMdfrCdgVrsn("]]]");}


		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemmodifiercodingi == 0) {e.addExplntnOfBnftAddItmMdfrCdgCd("[[[");}
		if(explanationofbenefitadditemmodifiercoding.hasCode()) {

			e.addExplntnOfBnftAddItmMdfrCdgCd(String.valueOf(explanationofbenefitadditemmodifiercoding.getCode()));
		} else {
			e.addExplntnOfBnftAddItmMdfrCdgCd("NULL");
		}

		if(explanationofbenefitadditemmodifiercodingi == explanationofbenefitadditemmodifiercodinglist.size()-1) {e.addExplntnOfBnftAddItmMdfrCdgCd("]]]");}


		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemmodifiercodingi == 0) {e.addExplntnOfBnftAddItmMdfrCdgUsrSltd("[[[");}
		if(explanationofbenefitadditemmodifiercoding.hasUserSelected()) {

			e.addExplntnOfBnftAddItmMdfrCdgUsrSltd(String.valueOf(explanationofbenefitadditemmodifiercoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftAddItmMdfrCdgUsrSltd("NULL");
		}

		if(explanationofbenefitadditemmodifiercodingi == explanationofbenefitadditemmodifiercodinglist.size()-1) {e.addExplntnOfBnftAddItmMdfrCdgUsrSltd("]]]");}


		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemmodifiercodingi == 0) {e.addExplntnOfBnftAddItmMdfrCdgSys("[[[");}
		if(explanationofbenefitadditemmodifiercoding.hasSystem()) {

			e.addExplntnOfBnftAddItmMdfrCdgSys(String.valueOf(explanationofbenefitadditemmodifiercoding.getSystem()));
		} else {
			e.addExplntnOfBnftAddItmMdfrCdgSys("NULL");
		}

		if(explanationofbenefitadditemmodifiercodingi == explanationofbenefitadditemmodifiercodinglist.size()-1) {e.addExplntnOfBnftAddItmMdfrCdgSys("]]]");}


		 };
		 };
		/******************** explanationofbenefitadditemadjudication ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent> explanationofbenefitadditemadjudicationlist = explanationofbenefitadditem.getAdjudication();
		for(int explanationofbenefitadditemadjudicationi = 0; explanationofbenefitadditemadjudicationi<explanationofbenefitadditemadjudicationlist.size();explanationofbenefitadditemadjudicationi++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent  explanationofbenefitadditemadjudication = explanationofbenefitadditemadjudicationlist.get(explanationofbenefitadditemadjudicationi);

		/******************** ExplntnOfBnft_AddItm_Adjdctn_Vl ********************************************************************************/
		if(explanationofbenefitadditemadjudicationi == 0) {e.addExplntnOfBnftAddItmAdjdctnVl("[[");}
		if(explanationofbenefitadditemadjudication.hasValue()) {

			e.addExplntnOfBnftAddItmAdjdctnVl(String.valueOf(explanationofbenefitadditemadjudication.getValue()));
		} else {
			e.addExplntnOfBnftAddItmAdjdctnVl("NULL");
		}

		if(explanationofbenefitadditemadjudicationi == explanationofbenefitadditemadjudicationlist.size()-1) {e.addExplntnOfBnftAddItmAdjdctnVl("]]");}


		/******************** explanationofbenefitadditemadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemadjudicationreason = explanationofbenefitadditemadjudication.getReason();

		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Txt ********************************************************************************/
		if(explanationofbenefitadditemadjudicationi == 0) {e.addExplntnOfBnftAddItmAdjdctnRsnTxt("[[");}
		if(explanationofbenefitadditemadjudicationreason.hasText()) {

			e.addExplntnOfBnftAddItmAdjdctnRsnTxt(String.valueOf(explanationofbenefitadditemadjudicationreason.getText()));
		} else {
			e.addExplntnOfBnftAddItmAdjdctnRsnTxt("NULL");
		}

		if(explanationofbenefitadditemadjudicationi == explanationofbenefitadditemadjudicationlist.size()-1) {e.addExplntnOfBnftAddItmAdjdctnRsnTxt("]]");}


		/******************** explanationofbenefitadditemadjudicationreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitadditemadjudicationreasoncodinglist = explanationofbenefitadditemadjudicationreason.getCoding();
		for(int explanationofbenefitadditemadjudicationreasoncodingi = 0; explanationofbenefitadditemadjudicationreasoncodingi<explanationofbenefitadditemadjudicationreasoncodinglist.size();explanationofbenefitadditemadjudicationreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitadditemadjudicationreasoncoding = explanationofbenefitadditemadjudicationreasoncodinglist.get(explanationofbenefitadditemadjudicationreasoncodingi);

		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAddItmAdjdctnRsnCdgDsply("[[[");}
		if(explanationofbenefitadditemadjudicationreasoncoding.hasDisplay()) {

			e.addExplntnOfBnftAddItmAdjdctnRsnCdgDsply(String.valueOf(explanationofbenefitadditemadjudicationreasoncoding.getDisplay()));
		} else {
			e.addExplntnOfBnftAddItmAdjdctnRsnCdgDsply("NULL");
		}

		if(explanationofbenefitadditemadjudicationreasoncodingi == explanationofbenefitadditemadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAddItmAdjdctnRsnCdgDsply("]]]");}


		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAddItmAdjdctnRsnCdgVrsn("[[[");}
		if(explanationofbenefitadditemadjudicationreasoncoding.hasVersion()) {

			e.addExplntnOfBnftAddItmAdjdctnRsnCdgVrsn(String.valueOf(explanationofbenefitadditemadjudicationreasoncoding.getVersion()));
		} else {
			e.addExplntnOfBnftAddItmAdjdctnRsnCdgVrsn("NULL");
		}

		if(explanationofbenefitadditemadjudicationreasoncodingi == explanationofbenefitadditemadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAddItmAdjdctnRsnCdgVrsn("]]]");}


		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAddItmAdjdctnRsnCdgCd("[[[");}
		if(explanationofbenefitadditemadjudicationreasoncoding.hasCode()) {

			e.addExplntnOfBnftAddItmAdjdctnRsnCdgCd(String.valueOf(explanationofbenefitadditemadjudicationreasoncoding.getCode()));
		} else {
			e.addExplntnOfBnftAddItmAdjdctnRsnCdgCd("NULL");
		}

		if(explanationofbenefitadditemadjudicationreasoncodingi == explanationofbenefitadditemadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAddItmAdjdctnRsnCdgCd("]]]");}


		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAddItmAdjdctnRsnCdgUsrSltd("[[[");}
		if(explanationofbenefitadditemadjudicationreasoncoding.hasUserSelected()) {

			e.addExplntnOfBnftAddItmAdjdctnRsnCdgUsrSltd(String.valueOf(explanationofbenefitadditemadjudicationreasoncoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftAddItmAdjdctnRsnCdgUsrSltd("NULL");
		}

		if(explanationofbenefitadditemadjudicationreasoncodingi == explanationofbenefitadditemadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAddItmAdjdctnRsnCdgUsrSltd("]]]");}


		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemadjudicationreasoncodingi == 0) {e.addExplntnOfBnftAddItmAdjdctnRsnCdgSys("[[[");}
		if(explanationofbenefitadditemadjudicationreasoncoding.hasSystem()) {

			e.addExplntnOfBnftAddItmAdjdctnRsnCdgSys(String.valueOf(explanationofbenefitadditemadjudicationreasoncoding.getSystem()));
		} else {
			e.addExplntnOfBnftAddItmAdjdctnRsnCdgSys("NULL");
		}

		if(explanationofbenefitadditemadjudicationreasoncodingi == explanationofbenefitadditemadjudicationreasoncodinglist.size()-1) {e.addExplntnOfBnftAddItmAdjdctnRsnCdgSys("]]]");}


		 };
		/******************** explanationofbenefitadditemadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemadjudicationcategory = explanationofbenefitadditemadjudication.getCategory();

		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefitadditemadjudicationi == 0) {e.addExplntnOfBnftAddItmAdjdctnCtgryTxt("[[");}
		if(explanationofbenefitadditemadjudicationcategory.hasText()) {

			e.addExplntnOfBnftAddItmAdjdctnCtgryTxt(String.valueOf(explanationofbenefitadditemadjudicationcategory.getText()));
		} else {
			e.addExplntnOfBnftAddItmAdjdctnCtgryTxt("NULL");
		}

		if(explanationofbenefitadditemadjudicationi == explanationofbenefitadditemadjudicationlist.size()-1) {e.addExplntnOfBnftAddItmAdjdctnCtgryTxt("]]");}


		/******************** explanationofbenefitadditemadjudicationcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitadditemadjudicationcategorycodinglist = explanationofbenefitadditemadjudicationcategory.getCoding();
		for(int explanationofbenefitadditemadjudicationcategorycodingi = 0; explanationofbenefitadditemadjudicationcategorycodingi<explanationofbenefitadditemadjudicationcategorycodinglist.size();explanationofbenefitadditemadjudicationcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitadditemadjudicationcategorycoding = explanationofbenefitadditemadjudicationcategorycodinglist.get(explanationofbenefitadditemadjudicationcategorycodingi);

		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAddItmAdjdctnCtgryCdgDsply("[[[");}
		if(explanationofbenefitadditemadjudicationcategorycoding.hasDisplay()) {

			e.addExplntnOfBnftAddItmAdjdctnCtgryCdgDsply(String.valueOf(explanationofbenefitadditemadjudicationcategorycoding.getDisplay()));
		} else {
			e.addExplntnOfBnftAddItmAdjdctnCtgryCdgDsply("NULL");
		}

		if(explanationofbenefitadditemadjudicationcategorycodingi == explanationofbenefitadditemadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAddItmAdjdctnCtgryCdgDsply("]]]");}


		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAddItmAdjdctnCtgryCdgVrsn("[[[");}
		if(explanationofbenefitadditemadjudicationcategorycoding.hasVersion()) {

			e.addExplntnOfBnftAddItmAdjdctnCtgryCdgVrsn(String.valueOf(explanationofbenefitadditemadjudicationcategorycoding.getVersion()));
		} else {
			e.addExplntnOfBnftAddItmAdjdctnCtgryCdgVrsn("NULL");
		}

		if(explanationofbenefitadditemadjudicationcategorycodingi == explanationofbenefitadditemadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAddItmAdjdctnCtgryCdgVrsn("]]]");}


		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAddItmAdjdctnCtgryCdgCd("[[[");}
		if(explanationofbenefitadditemadjudicationcategorycoding.hasCode()) {

			e.addExplntnOfBnftAddItmAdjdctnCtgryCdgCd(String.valueOf(explanationofbenefitadditemadjudicationcategorycoding.getCode()));
		} else {
			e.addExplntnOfBnftAddItmAdjdctnCtgryCdgCd("NULL");
		}

		if(explanationofbenefitadditemadjudicationcategorycodingi == explanationofbenefitadditemadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAddItmAdjdctnCtgryCdgCd("]]]");}


		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAddItmAdjdctnCtgryCdgUsrSltd("[[[");}
		if(explanationofbenefitadditemadjudicationcategorycoding.hasUserSelected()) {

			e.addExplntnOfBnftAddItmAdjdctnCtgryCdgUsrSltd(String.valueOf(explanationofbenefitadditemadjudicationcategorycoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftAddItmAdjdctnCtgryCdgUsrSltd("NULL");
		}

		if(explanationofbenefitadditemadjudicationcategorycodingi == explanationofbenefitadditemadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAddItmAdjdctnCtgryCdgUsrSltd("]]]");}


		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemadjudicationcategorycodingi == 0) {e.addExplntnOfBnftAddItmAdjdctnCtgryCdgSys("[[[");}
		if(explanationofbenefitadditemadjudicationcategorycoding.hasSystem()) {

			e.addExplntnOfBnftAddItmAdjdctnCtgryCdgSys(String.valueOf(explanationofbenefitadditemadjudicationcategorycoding.getSystem()));
		} else {
			e.addExplntnOfBnftAddItmAdjdctnCtgryCdgSys("NULL");
		}

		if(explanationofbenefitadditemadjudicationcategorycodingi == explanationofbenefitadditemadjudicationcategorycodinglist.size()-1) {e.addExplntnOfBnftAddItmAdjdctnCtgryCdgSys("]]]");}


		 };
		/******************** explanationofbenefitadditemadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemadjudicationamount = explanationofbenefitadditemadjudication.getAmount();

		/******************** ExplntnOfBnft_AddItm_Adjdctn_Amnt_Vl ********************************************************************************/
		if(explanationofbenefitadditemadjudicationi == 0) {e.addExplntnOfBnftAddItmAdjdctnAmntVl("[[");}
		if(explanationofbenefitadditemadjudicationamount.hasValue()) {

			e.addExplntnOfBnftAddItmAdjdctnAmntVl(String.valueOf(explanationofbenefitadditemadjudicationamount.getValue()));
		} else {
			e.addExplntnOfBnftAddItmAdjdctnAmntVl("NULL");
		}

		if(explanationofbenefitadditemadjudicationi == explanationofbenefitadditemadjudicationlist.size()-1) {e.addExplntnOfBnftAddItmAdjdctnAmntVl("]]");}


		/******************** ExplntnOfBnft_AddItm_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(explanationofbenefitadditemadjudicationi == 0) {e.addExplntnOfBnftAddItmAdjdctnAmntCrncy("[[");}
		if(explanationofbenefitadditemadjudicationamount.hasCurrency()) {

			e.addExplntnOfBnftAddItmAdjdctnAmntCrncy(String.valueOf(explanationofbenefitadditemadjudicationamount.getCurrency()));
		} else {
			e.addExplntnOfBnftAddItmAdjdctnAmntCrncy("NULL");
		}

		if(explanationofbenefitadditemadjudicationi == explanationofbenefitadditemadjudicationlist.size()-1) {e.addExplntnOfBnftAddItmAdjdctnAmntCrncy("]]");}


		 };
		/******************** ExplntnOfBnft_AddItm_Factor ********************************************************************************/
		if(explanationofbenefitadditem.hasFactor()) {

			e.addExplntnOfBnftAddItmFactor(String.valueOf(explanationofbenefitadditem.getFactor()));
		} else {
			e.addExplntnOfBnftAddItmFactor("NULL");
		}


		/******************** explanationofbenefitadditemnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemnet = explanationofbenefitadditem.getNet();

		/******************** ExplntnOfBnft_AddItm_Net_Vl ********************************************************************************/
		if(explanationofbenefitadditemnet.hasValue()) {

			e.addExplntnOfBnftAddItmNetVl(String.valueOf(explanationofbenefitadditemnet.getValue()));
		} else {
			e.addExplntnOfBnftAddItmNetVl("NULL");
		}


		/******************** ExplntnOfBnft_AddItm_Net_Crncy ********************************************************************************/
		if(explanationofbenefitadditemnet.hasCurrency()) {

			e.addExplntnOfBnftAddItmNetCrncy(String.valueOf(explanationofbenefitadditemnet.getCurrency()));
		} else {
			e.addExplntnOfBnftAddItmNetCrncy("NULL");
		}


		/******************** ExplntnOfBnft_AddItm_SrvdDtTyp ********************************************************************************/
		if(explanationofbenefitadditem.hasServicedDateType()) {

			e.addExplntnOfBnftAddItmSrvdDtTyp("\""+explanationofbenefitadditem.getServicedDateType().getValueAsString()+"\"");
		} else {
			e.addExplntnOfBnftAddItmSrvdDtTyp("NULL");
		}


		/******************** ExplntnOfBnft_AddItm_SubDtlSqnc ********************************************************************************/
		if(explanationofbenefitadditem.hasSubDetailSequence()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefitadditem.getSubDetailSequence().size(); incr++) {
				array = array + explanationofbenefitadditem.getSubDetailSequence().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftAddItmSubDtlSqnc(array);

		} else {
			e.addExplntnOfBnftAddItmSubDtlSqnc("NULL");
		}


		/******************** explanationofbenefitadditemlocationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemlocationcodeableconcept = explanationofbenefitadditem.getLocationCodeableConcept();

		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Txt ********************************************************************************/
		if(explanationofbenefitadditemlocationcodeableconcept.hasText()) {

			e.addExplntnOfBnftAddItmLctnCdbleCncptTxt(String.valueOf(explanationofbenefitadditemlocationcodeableconcept.getText()));
		} else {
			e.addExplntnOfBnftAddItmLctnCdbleCncptTxt("NULL");
		}


		/******************** explanationofbenefitadditemlocationcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitadditemlocationcodeableconceptcodinglist = explanationofbenefitadditemlocationcodeableconcept.getCoding();
		for(int explanationofbenefitadditemlocationcodeableconceptcodingi = 0; explanationofbenefitadditemlocationcodeableconceptcodingi<explanationofbenefitadditemlocationcodeableconceptcodinglist.size();explanationofbenefitadditemlocationcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitadditemlocationcodeableconceptcoding = explanationofbenefitadditemlocationcodeableconceptcodinglist.get(explanationofbenefitadditemlocationcodeableconceptcodingi);

		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemlocationcodeableconceptcodingi == 0) {e.addExplntnOfBnftAddItmLctnCdbleCncptCdgDsply("[[");}
		if(explanationofbenefitadditemlocationcodeableconceptcoding.hasDisplay()) {

			e.addExplntnOfBnftAddItmLctnCdbleCncptCdgDsply(String.valueOf(explanationofbenefitadditemlocationcodeableconceptcoding.getDisplay()));
		} else {
			e.addExplntnOfBnftAddItmLctnCdbleCncptCdgDsply("NULL");
		}

		if(explanationofbenefitadditemlocationcodeableconceptcodingi == explanationofbenefitadditemlocationcodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftAddItmLctnCdbleCncptCdgDsply("]]");}


		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemlocationcodeableconceptcodingi == 0) {e.addExplntnOfBnftAddItmLctnCdbleCncptCdgVrsn("[[");}
		if(explanationofbenefitadditemlocationcodeableconceptcoding.hasVersion()) {

			e.addExplntnOfBnftAddItmLctnCdbleCncptCdgVrsn(String.valueOf(explanationofbenefitadditemlocationcodeableconceptcoding.getVersion()));
		} else {
			e.addExplntnOfBnftAddItmLctnCdbleCncptCdgVrsn("NULL");
		}

		if(explanationofbenefitadditemlocationcodeableconceptcodingi == explanationofbenefitadditemlocationcodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftAddItmLctnCdbleCncptCdgVrsn("]]");}


		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemlocationcodeableconceptcodingi == 0) {e.addExplntnOfBnftAddItmLctnCdbleCncptCdgCd("[[");}
		if(explanationofbenefitadditemlocationcodeableconceptcoding.hasCode()) {

			e.addExplntnOfBnftAddItmLctnCdbleCncptCdgCd(String.valueOf(explanationofbenefitadditemlocationcodeableconceptcoding.getCode()));
		} else {
			e.addExplntnOfBnftAddItmLctnCdbleCncptCdgCd("NULL");
		}

		if(explanationofbenefitadditemlocationcodeableconceptcodingi == explanationofbenefitadditemlocationcodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftAddItmLctnCdbleCncptCdgCd("]]");}


		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemlocationcodeableconceptcodingi == 0) {e.addExplntnOfBnftAddItmLctnCdbleCncptCdgUsrSltd("[[");}
		if(explanationofbenefitadditemlocationcodeableconceptcoding.hasUserSelected()) {

			e.addExplntnOfBnftAddItmLctnCdbleCncptCdgUsrSltd(String.valueOf(explanationofbenefitadditemlocationcodeableconceptcoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftAddItmLctnCdbleCncptCdgUsrSltd("NULL");
		}

		if(explanationofbenefitadditemlocationcodeableconceptcodingi == explanationofbenefitadditemlocationcodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftAddItmLctnCdbleCncptCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemlocationcodeableconceptcodingi == 0) {e.addExplntnOfBnftAddItmLctnCdbleCncptCdgSys("[[");}
		if(explanationofbenefitadditemlocationcodeableconceptcoding.hasSystem()) {

			e.addExplntnOfBnftAddItmLctnCdbleCncptCdgSys(String.valueOf(explanationofbenefitadditemlocationcodeableconceptcoding.getSystem()));
		} else {
			e.addExplntnOfBnftAddItmLctnCdbleCncptCdgSys("NULL");
		}

		if(explanationofbenefitadditemlocationcodeableconceptcodingi == explanationofbenefitadditemlocationcodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftAddItmLctnCdbleCncptCdgSys("]]");}


		 };
		/******************** explanationofbenefitadditemservicedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitadditemservicedperiod = explanationofbenefitadditem.getServicedPeriod();

		/******************** ExplntnOfBnft_AddItm_SrvdPrd_Strt ********************************************************************************/
		if(explanationofbenefitadditemservicedperiod.hasStart()) {

			e.addExplntnOfBnftAddItmSrvdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitadditemservicedperiod.getStart())+"\"");
		} else {
			e.addExplntnOfBnftAddItmSrvdPrdStrt("NULL");
		}


		/******************** ExplntnOfBnft_AddItm_SrvdPrd_End ********************************************************************************/
		if(explanationofbenefitadditemservicedperiod.hasEnd()) {

			e.addExplntnOfBnftAddItmSrvdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitadditemservicedperiod.getEnd())+"\"");
		} else {
			e.addExplntnOfBnftAddItmSrvdPrdEnd("NULL");
		}


		/******************** explanationofbenefitadditemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefitadditemquantity = explanationofbenefitadditem.getQuantity();

		/******************** ExplntnOfBnft_AddItm_Qnty_Vl ********************************************************************************/
		if(explanationofbenefitadditemquantity.hasValue()) {

			e.addExplntnOfBnftAddItmQntyVl(String.valueOf(explanationofbenefitadditemquantity.getValue()));
		} else {
			e.addExplntnOfBnftAddItmQntyVl("NULL");
		}


		/******************** explanationofbenefitadditemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator explanationofbenefitadditemquantitycomparator = explanationofbenefitadditemquantity.getComparator();
		if(explanationofbenefitadditemquantitycomparator!=null) {
			e.addExplntnOfBnftAddItmQntyCmprtr(explanationofbenefitadditemquantitycomparator.toCode());
		} else {
			e.addExplntnOfBnftAddItmQntyCmprtr("NULL");
		}

		/******************** ExplntnOfBnft_AddItm_Qnty_Cd ********************************************************************************/
		if(explanationofbenefitadditemquantity.hasCode()) {

			e.addExplntnOfBnftAddItmQntyCd(String.valueOf(explanationofbenefitadditemquantity.getCode()));
		} else {
			e.addExplntnOfBnftAddItmQntyCd("NULL");
		}


		/******************** ExplntnOfBnft_AddItm_Qnty_Unt ********************************************************************************/
		if(explanationofbenefitadditemquantity.hasUnit()) {

			e.addExplntnOfBnftAddItmQntyUnt(String.valueOf(explanationofbenefitadditemquantity.getUnit()));
		} else {
			e.addExplntnOfBnftAddItmQntyUnt("NULL");
		}


		/******************** ExplntnOfBnft_AddItm_Qnty_Sys ********************************************************************************/
		if(explanationofbenefitadditemquantity.hasSystem()) {

			e.addExplntnOfBnftAddItmQntySys(String.valueOf(explanationofbenefitadditemquantity.getSystem()));
		} else {
			e.addExplntnOfBnftAddItmQntySys("NULL");
		}


		/******************** explanationofbenefitadditemproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemproductorservice = explanationofbenefitadditem.getProductOrService();

		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Txt ********************************************************************************/
		if(explanationofbenefitadditemproductorservice.hasText()) {

			e.addExplntnOfBnftAddItmPrdctOrSrvTxt(String.valueOf(explanationofbenefitadditemproductorservice.getText()));
		} else {
			e.addExplntnOfBnftAddItmPrdctOrSrvTxt("NULL");
		}


		/******************** explanationofbenefitadditemproductorservicecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitadditemproductorservicecodinglist = explanationofbenefitadditemproductorservice.getCoding();
		for(int explanationofbenefitadditemproductorservicecodingi = 0; explanationofbenefitadditemproductorservicecodingi<explanationofbenefitadditemproductorservicecodinglist.size();explanationofbenefitadditemproductorservicecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitadditemproductorservicecoding = explanationofbenefitadditemproductorservicecodinglist.get(explanationofbenefitadditemproductorservicecodingi);

		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemproductorservicecodingi == 0) {e.addExplntnOfBnftAddItmPrdctOrSrvCdgDsply("[[");}
		if(explanationofbenefitadditemproductorservicecoding.hasDisplay()) {

			e.addExplntnOfBnftAddItmPrdctOrSrvCdgDsply(String.valueOf(explanationofbenefitadditemproductorservicecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftAddItmPrdctOrSrvCdgDsply("NULL");
		}

		if(explanationofbenefitadditemproductorservicecodingi == explanationofbenefitadditemproductorservicecodinglist.size()-1) {e.addExplntnOfBnftAddItmPrdctOrSrvCdgDsply("]]");}


		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemproductorservicecodingi == 0) {e.addExplntnOfBnftAddItmPrdctOrSrvCdgVrsn("[[");}
		if(explanationofbenefitadditemproductorservicecoding.hasVersion()) {

			e.addExplntnOfBnftAddItmPrdctOrSrvCdgVrsn(String.valueOf(explanationofbenefitadditemproductorservicecoding.getVersion()));
		} else {
			e.addExplntnOfBnftAddItmPrdctOrSrvCdgVrsn("NULL");
		}

		if(explanationofbenefitadditemproductorservicecodingi == explanationofbenefitadditemproductorservicecodinglist.size()-1) {e.addExplntnOfBnftAddItmPrdctOrSrvCdgVrsn("]]");}


		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemproductorservicecodingi == 0) {e.addExplntnOfBnftAddItmPrdctOrSrvCdgCd("[[");}
		if(explanationofbenefitadditemproductorservicecoding.hasCode()) {

			e.addExplntnOfBnftAddItmPrdctOrSrvCdgCd(String.valueOf(explanationofbenefitadditemproductorservicecoding.getCode()));
		} else {
			e.addExplntnOfBnftAddItmPrdctOrSrvCdgCd("NULL");
		}

		if(explanationofbenefitadditemproductorservicecodingi == explanationofbenefitadditemproductorservicecodinglist.size()-1) {e.addExplntnOfBnftAddItmPrdctOrSrvCdgCd("]]");}


		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemproductorservicecodingi == 0) {e.addExplntnOfBnftAddItmPrdctOrSrvCdgUsrSltd("[[");}
		if(explanationofbenefitadditemproductorservicecoding.hasUserSelected()) {

			e.addExplntnOfBnftAddItmPrdctOrSrvCdgUsrSltd(String.valueOf(explanationofbenefitadditemproductorservicecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftAddItmPrdctOrSrvCdgUsrSltd("NULL");
		}

		if(explanationofbenefitadditemproductorservicecodingi == explanationofbenefitadditemproductorservicecodinglist.size()-1) {e.addExplntnOfBnftAddItmPrdctOrSrvCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemproductorservicecodingi == 0) {e.addExplntnOfBnftAddItmPrdctOrSrvCdgSys("[[");}
		if(explanationofbenefitadditemproductorservicecoding.hasSystem()) {

			e.addExplntnOfBnftAddItmPrdctOrSrvCdgSys(String.valueOf(explanationofbenefitadditemproductorservicecoding.getSystem()));
		} else {
			e.addExplntnOfBnftAddItmPrdctOrSrvCdgSys("NULL");
		}

		if(explanationofbenefitadditemproductorservicecodingi == explanationofbenefitadditemproductorservicecodinglist.size()-1) {e.addExplntnOfBnftAddItmPrdctOrSrvCdgSys("]]");}


		 };
		/******************** ExplntnOfBnft_AddItm_ItmSqnc ********************************************************************************/
		if(explanationofbenefitadditem.hasItemSequence()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefitadditem.getItemSequence().size(); incr++) {
				array = array + explanationofbenefitadditem.getItemSequence().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftAddItmItmSqnc(array);

		} else {
			e.addExplntnOfBnftAddItmItmSqnc("NULL");
		}


		/******************** ExplntnOfBnft_AddItm_DtlSqnc ********************************************************************************/
		if(explanationofbenefitadditem.hasDetailSequence()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefitadditem.getDetailSequence().size(); incr++) {
				array = array + explanationofbenefitadditem.getDetailSequence().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftAddItmDtlSqnc(array);

		} else {
			e.addExplntnOfBnftAddItmDtlSqnc("NULL");
		}


		/******************** explanationofbenefitadditemprogramcode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> explanationofbenefitadditemprogramcodelist = explanationofbenefitadditem.getProgramCode();
		for(int explanationofbenefitadditemprogramcodei = 0; explanationofbenefitadditemprogramcodei<explanationofbenefitadditemprogramcodelist.size();explanationofbenefitadditemprogramcodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  explanationofbenefitadditemprogramcode = explanationofbenefitadditemprogramcodelist.get(explanationofbenefitadditemprogramcodei);

		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Txt ********************************************************************************/
		if(explanationofbenefitadditemprogramcodei == 0) {e.addExplntnOfBnftAddItmPrgrmCdTxt("[[");}
		if(explanationofbenefitadditemprogramcode.hasText()) {

			e.addExplntnOfBnftAddItmPrgrmCdTxt(String.valueOf(explanationofbenefitadditemprogramcode.getText()));
		} else {
			e.addExplntnOfBnftAddItmPrgrmCdTxt("NULL");
		}

		if(explanationofbenefitadditemprogramcodei == explanationofbenefitadditemprogramcodelist.size()-1) {e.addExplntnOfBnftAddItmPrgrmCdTxt("]]");}


		/******************** explanationofbenefitadditemprogramcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitadditemprogramcodecodinglist = explanationofbenefitadditemprogramcode.getCoding();
		for(int explanationofbenefitadditemprogramcodecodingi = 0; explanationofbenefitadditemprogramcodecodingi<explanationofbenefitadditemprogramcodecodinglist.size();explanationofbenefitadditemprogramcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitadditemprogramcodecoding = explanationofbenefitadditemprogramcodecodinglist.get(explanationofbenefitadditemprogramcodecodingi);

		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemprogramcodecodingi == 0) {e.addExplntnOfBnftAddItmPrgrmCdCdgDsply("[[[");}
		if(explanationofbenefitadditemprogramcodecoding.hasDisplay()) {

			e.addExplntnOfBnftAddItmPrgrmCdCdgDsply(String.valueOf(explanationofbenefitadditemprogramcodecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftAddItmPrgrmCdCdgDsply("NULL");
		}

		if(explanationofbenefitadditemprogramcodecodingi == explanationofbenefitadditemprogramcodecodinglist.size()-1) {e.addExplntnOfBnftAddItmPrgrmCdCdgDsply("]]]");}


		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemprogramcodecodingi == 0) {e.addExplntnOfBnftAddItmPrgrmCdCdgVrsn("[[[");}
		if(explanationofbenefitadditemprogramcodecoding.hasVersion()) {

			e.addExplntnOfBnftAddItmPrgrmCdCdgVrsn(String.valueOf(explanationofbenefitadditemprogramcodecoding.getVersion()));
		} else {
			e.addExplntnOfBnftAddItmPrgrmCdCdgVrsn("NULL");
		}

		if(explanationofbenefitadditemprogramcodecodingi == explanationofbenefitadditemprogramcodecodinglist.size()-1) {e.addExplntnOfBnftAddItmPrgrmCdCdgVrsn("]]]");}


		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemprogramcodecodingi == 0) {e.addExplntnOfBnftAddItmPrgrmCdCdgCd("[[[");}
		if(explanationofbenefitadditemprogramcodecoding.hasCode()) {

			e.addExplntnOfBnftAddItmPrgrmCdCdgCd(String.valueOf(explanationofbenefitadditemprogramcodecoding.getCode()));
		} else {
			e.addExplntnOfBnftAddItmPrgrmCdCdgCd("NULL");
		}

		if(explanationofbenefitadditemprogramcodecodingi == explanationofbenefitadditemprogramcodecodinglist.size()-1) {e.addExplntnOfBnftAddItmPrgrmCdCdgCd("]]]");}


		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemprogramcodecodingi == 0) {e.addExplntnOfBnftAddItmPrgrmCdCdgUsrSltd("[[[");}
		if(explanationofbenefitadditemprogramcodecoding.hasUserSelected()) {

			e.addExplntnOfBnftAddItmPrgrmCdCdgUsrSltd(String.valueOf(explanationofbenefitadditemprogramcodecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftAddItmPrgrmCdCdgUsrSltd("NULL");
		}

		if(explanationofbenefitadditemprogramcodecodingi == explanationofbenefitadditemprogramcodecodinglist.size()-1) {e.addExplntnOfBnftAddItmPrgrmCdCdgUsrSltd("]]]");}


		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemprogramcodecodingi == 0) {e.addExplntnOfBnftAddItmPrgrmCdCdgSys("[[[");}
		if(explanationofbenefitadditemprogramcodecoding.hasSystem()) {

			e.addExplntnOfBnftAddItmPrgrmCdCdgSys(String.valueOf(explanationofbenefitadditemprogramcodecoding.getSystem()));
		} else {
			e.addExplntnOfBnftAddItmPrgrmCdCdgSys("NULL");
		}

		if(explanationofbenefitadditemprogramcodecodingi == explanationofbenefitadditemprogramcodecodinglist.size()-1) {e.addExplntnOfBnftAddItmPrgrmCdCdgSys("]]]");}


		 };
		 };
		/******************** explanationofbenefitadditemsubsite ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> explanationofbenefitadditemsubsitelist = explanationofbenefitadditem.getSubSite();
		for(int explanationofbenefitadditemsubsitei = 0; explanationofbenefitadditemsubsitei<explanationofbenefitadditemsubsitelist.size();explanationofbenefitadditemsubsitei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  explanationofbenefitadditemsubsite = explanationofbenefitadditemsubsitelist.get(explanationofbenefitadditemsubsitei);

		/******************** ExplntnOfBnft_AddItm_SubSite_Txt ********************************************************************************/
		if(explanationofbenefitadditemsubsitei == 0) {e.addExplntnOfBnftAddItmSubSiteTxt("[[");}
		if(explanationofbenefitadditemsubsite.hasText()) {

			e.addExplntnOfBnftAddItmSubSiteTxt(String.valueOf(explanationofbenefitadditemsubsite.getText()));
		} else {
			e.addExplntnOfBnftAddItmSubSiteTxt("NULL");
		}

		if(explanationofbenefitadditemsubsitei == explanationofbenefitadditemsubsitelist.size()-1) {e.addExplntnOfBnftAddItmSubSiteTxt("]]");}


		/******************** explanationofbenefitadditemsubsitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitadditemsubsitecodinglist = explanationofbenefitadditemsubsite.getCoding();
		for(int explanationofbenefitadditemsubsitecodingi = 0; explanationofbenefitadditemsubsitecodingi<explanationofbenefitadditemsubsitecodinglist.size();explanationofbenefitadditemsubsitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitadditemsubsitecoding = explanationofbenefitadditemsubsitecodinglist.get(explanationofbenefitadditemsubsitecodingi);

		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemsubsitecodingi == 0) {e.addExplntnOfBnftAddItmSubSiteCdgDsply("[[[");}
		if(explanationofbenefitadditemsubsitecoding.hasDisplay()) {

			e.addExplntnOfBnftAddItmSubSiteCdgDsply(String.valueOf(explanationofbenefitadditemsubsitecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftAddItmSubSiteCdgDsply("NULL");
		}

		if(explanationofbenefitadditemsubsitecodingi == explanationofbenefitadditemsubsitecodinglist.size()-1) {e.addExplntnOfBnftAddItmSubSiteCdgDsply("]]]");}


		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemsubsitecodingi == 0) {e.addExplntnOfBnftAddItmSubSiteCdgVrsn("[[[");}
		if(explanationofbenefitadditemsubsitecoding.hasVersion()) {

			e.addExplntnOfBnftAddItmSubSiteCdgVrsn(String.valueOf(explanationofbenefitadditemsubsitecoding.getVersion()));
		} else {
			e.addExplntnOfBnftAddItmSubSiteCdgVrsn("NULL");
		}

		if(explanationofbenefitadditemsubsitecodingi == explanationofbenefitadditemsubsitecodinglist.size()-1) {e.addExplntnOfBnftAddItmSubSiteCdgVrsn("]]]");}


		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemsubsitecodingi == 0) {e.addExplntnOfBnftAddItmSubSiteCdgCd("[[[");}
		if(explanationofbenefitadditemsubsitecoding.hasCode()) {

			e.addExplntnOfBnftAddItmSubSiteCdgCd(String.valueOf(explanationofbenefitadditemsubsitecoding.getCode()));
		} else {
			e.addExplntnOfBnftAddItmSubSiteCdgCd("NULL");
		}

		if(explanationofbenefitadditemsubsitecodingi == explanationofbenefitadditemsubsitecodinglist.size()-1) {e.addExplntnOfBnftAddItmSubSiteCdgCd("]]]");}


		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemsubsitecodingi == 0) {e.addExplntnOfBnftAddItmSubSiteCdgUsrSltd("[[[");}
		if(explanationofbenefitadditemsubsitecoding.hasUserSelected()) {

			e.addExplntnOfBnftAddItmSubSiteCdgUsrSltd(String.valueOf(explanationofbenefitadditemsubsitecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftAddItmSubSiteCdgUsrSltd("NULL");
		}

		if(explanationofbenefitadditemsubsitecodingi == explanationofbenefitadditemsubsitecodinglist.size()-1) {e.addExplntnOfBnftAddItmSubSiteCdgUsrSltd("]]]");}


		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemsubsitecodingi == 0) {e.addExplntnOfBnftAddItmSubSiteCdgSys("[[[");}
		if(explanationofbenefitadditemsubsitecoding.hasSystem()) {

			e.addExplntnOfBnftAddItmSubSiteCdgSys(String.valueOf(explanationofbenefitadditemsubsitecoding.getSystem()));
		} else {
			e.addExplntnOfBnftAddItmSubSiteCdgSys("NULL");
		}

		if(explanationofbenefitadditemsubsitecodingi == explanationofbenefitadditemsubsitecodinglist.size()-1) {e.addExplntnOfBnftAddItmSubSiteCdgSys("]]]");}


		 };
		 };
		/******************** ExplntnOfBnft_AddItm_NtNmbr ********************************************************************************/
		if(explanationofbenefitadditem.hasNoteNumber()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefitadditem.getNoteNumber().size(); incr++) {
				array = array + explanationofbenefitadditem.getNoteNumber().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftAddItmNtNmbr(array);

		} else {
			e.addExplntnOfBnftAddItmNtNmbr("NULL");
		}


		/******************** explanationofbenefitadditemlocationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address explanationofbenefitadditemlocationaddress = explanationofbenefitadditem.getLocationAddress();

		/******************** ExplntnOfBnft_AddItm_LctnAddr_State ********************************************************************************/
		if(explanationofbenefitadditemlocationaddress.hasState()) {

			e.addExplntnOfBnftAddItmLctnAddrState(String.valueOf(explanationofbenefitadditemlocationaddress.getState()));
		} else {
			e.addExplntnOfBnftAddItmLctnAddrState("NULL");
		}


		/******************** explanationofbenefitadditemlocationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType explanationofbenefitadditemlocationaddresstype = explanationofbenefitadditemlocationaddress.getType();
		if(explanationofbenefitadditemlocationaddresstype!=null) {
			e.addExplntnOfBnftAddItmLctnAddrTyp(explanationofbenefitadditemlocationaddresstype.toCode());
		} else {
			e.addExplntnOfBnftAddItmLctnAddrTyp("NULL");
		}

		/******************** ExplntnOfBnft_AddItm_LctnAddr_Cntry ********************************************************************************/
		if(explanationofbenefitadditemlocationaddress.hasCountry()) {

			e.addExplntnOfBnftAddItmLctnAddrCntry(String.valueOf(explanationofbenefitadditemlocationaddress.getCountry()));
		} else {
			e.addExplntnOfBnftAddItmLctnAddrCntry("NULL");
		}


		/******************** explanationofbenefitadditemlocationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitadditemlocationaddressperiod = explanationofbenefitadditemlocationaddress.getPeriod();

		/******************** ExplntnOfBnft_AddItm_LctnAddr_Prd_Strt ********************************************************************************/
		if(explanationofbenefitadditemlocationaddressperiod.hasStart()) {

			e.addExplntnOfBnftAddItmLctnAddrPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitadditemlocationaddressperiod.getStart())+"\"");
		} else {
			e.addExplntnOfBnftAddItmLctnAddrPrdStrt("NULL");
		}


		/******************** ExplntnOfBnft_AddItm_LctnAddr_Prd_End ********************************************************************************/
		if(explanationofbenefitadditemlocationaddressperiod.hasEnd()) {

			e.addExplntnOfBnftAddItmLctnAddrPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitadditemlocationaddressperiod.getEnd())+"\"");
		} else {
			e.addExplntnOfBnftAddItmLctnAddrPrdEnd("NULL");
		}


		/******************** ExplntnOfBnft_AddItm_LctnAddr_District ********************************************************************************/
		if(explanationofbenefitadditemlocationaddress.hasDistrict()) {

			e.addExplntnOfBnftAddItmLctnAddrDistrict(String.valueOf(explanationofbenefitadditemlocationaddress.getDistrict()));
		} else {
			e.addExplntnOfBnftAddItmLctnAddrDistrict("NULL");
		}


		/******************** ExplntnOfBnft_AddItm_LctnAddr_PostalCd ********************************************************************************/
		if(explanationofbenefitadditemlocationaddress.hasPostalCode()) {

			e.addExplntnOfBnftAddItmLctnAddrPostalCd(String.valueOf(explanationofbenefitadditemlocationaddress.getPostalCode()));
		} else {
			e.addExplntnOfBnftAddItmLctnAddrPostalCd("NULL");
		}


		/******************** ExplntnOfBnft_AddItm_LctnAddr_Line ********************************************************************************/
		if(explanationofbenefitadditemlocationaddress.hasLine()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefitadditemlocationaddress.getLine().size(); incr++) {
				array = array + explanationofbenefitadditemlocationaddress.getLine().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftAddItmLctnAddrLine(array);

		} else {
			e.addExplntnOfBnftAddItmLctnAddrLine("NULL");
		}


		/******************** ExplntnOfBnft_AddItm_LctnAddr_City ********************************************************************************/
		if(explanationofbenefitadditemlocationaddress.hasCity()) {

			e.addExplntnOfBnftAddItmLctnAddrCity(String.valueOf(explanationofbenefitadditemlocationaddress.getCity()));
		} else {
			e.addExplntnOfBnftAddItmLctnAddrCity("NULL");
		}


		/******************** explanationofbenefitadditemlocationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse explanationofbenefitadditemlocationaddressuse = explanationofbenefitadditemlocationaddress.getUse();
		if(explanationofbenefitadditemlocationaddressuse!=null) {
			e.addExplntnOfBnftAddItmLctnAddrUse(explanationofbenefitadditemlocationaddressuse.toCode());
		} else {
			e.addExplntnOfBnftAddItmLctnAddrUse("NULL");
		}

		/******************** ExplntnOfBnft_AddItm_LctnAddr_Txt ********************************************************************************/
		if(explanationofbenefitadditemlocationaddress.hasText()) {

			e.addExplntnOfBnftAddItmLctnAddrTxt(String.valueOf(explanationofbenefitadditemlocationaddress.getText()));
		} else {
			e.addExplntnOfBnftAddItmLctnAddrTxt("NULL");
		}


		/******************** ExplntnOfBnft_AddItm_LctnRfrnc ********************************************************************************/
		if(explanationofbenefitadditem.hasLocationReference()) {

			if(explanationofbenefitadditem.getLocationReference().getReference() != null) {
			e.addExplntnOfBnftAddItmLctnRfrnc(explanationofbenefitadditem.getLocationReference().getReference());
			}
		} else {
			e.addExplntnOfBnftAddItmLctnRfrnc("NULL");
		}


		 };
		/******************** explanationofbenefitaccident ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AccidentComponent explanationofbenefitaccident = explanationofbenefit.getAccident();

		/******************** explanationofbenefitaccidenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitaccidenttype = explanationofbenefitaccident.getType();

		/******************** ExplntnOfBnft_Accident_Typ_Txt ********************************************************************************/
		if(explanationofbenefitaccidenttype.hasText()) {

			e.addExplntnOfBnftAccidentTypTxt(String.valueOf(explanationofbenefitaccidenttype.getText()));
		} else {
			e.addExplntnOfBnftAccidentTypTxt("NULL");
		}


		/******************** explanationofbenefitaccidenttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitaccidenttypecodinglist = explanationofbenefitaccidenttype.getCoding();
		for(int explanationofbenefitaccidenttypecodingi = 0; explanationofbenefitaccidenttypecodingi<explanationofbenefitaccidenttypecodinglist.size();explanationofbenefitaccidenttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitaccidenttypecoding = explanationofbenefitaccidenttypecodinglist.get(explanationofbenefitaccidenttypecodingi);

		/******************** ExplntnOfBnft_Accident_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitaccidenttypecodingi == 0) {e.addExplntnOfBnftAccidentTypCdgDsply("[");}
		if(explanationofbenefitaccidenttypecoding.hasDisplay()) {

			e.addExplntnOfBnftAccidentTypCdgDsply(String.valueOf(explanationofbenefitaccidenttypecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftAccidentTypCdgDsply("NULL");
		}

		if(explanationofbenefitaccidenttypecodingi == explanationofbenefitaccidenttypecodinglist.size()-1) {e.addExplntnOfBnftAccidentTypCdgDsply("]");}


		/******************** ExplntnOfBnft_Accident_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitaccidenttypecodingi == 0) {e.addExplntnOfBnftAccidentTypCdgVrsn("[");}
		if(explanationofbenefitaccidenttypecoding.hasVersion()) {

			e.addExplntnOfBnftAccidentTypCdgVrsn(String.valueOf(explanationofbenefitaccidenttypecoding.getVersion()));
		} else {
			e.addExplntnOfBnftAccidentTypCdgVrsn("NULL");
		}

		if(explanationofbenefitaccidenttypecodingi == explanationofbenefitaccidenttypecodinglist.size()-1) {e.addExplntnOfBnftAccidentTypCdgVrsn("]");}


		/******************** ExplntnOfBnft_Accident_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitaccidenttypecodingi == 0) {e.addExplntnOfBnftAccidentTypCdgCd("[");}
		if(explanationofbenefitaccidenttypecoding.hasCode()) {

			e.addExplntnOfBnftAccidentTypCdgCd(String.valueOf(explanationofbenefitaccidenttypecoding.getCode()));
		} else {
			e.addExplntnOfBnftAccidentTypCdgCd("NULL");
		}

		if(explanationofbenefitaccidenttypecodingi == explanationofbenefitaccidenttypecodinglist.size()-1) {e.addExplntnOfBnftAccidentTypCdgCd("]");}


		/******************** ExplntnOfBnft_Accident_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitaccidenttypecodingi == 0) {e.addExplntnOfBnftAccidentTypCdgUsrSltd("[");}
		if(explanationofbenefitaccidenttypecoding.hasUserSelected()) {

			e.addExplntnOfBnftAccidentTypCdgUsrSltd(String.valueOf(explanationofbenefitaccidenttypecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftAccidentTypCdgUsrSltd("NULL");
		}

		if(explanationofbenefitaccidenttypecodingi == explanationofbenefitaccidenttypecodinglist.size()-1) {e.addExplntnOfBnftAccidentTypCdgUsrSltd("]");}


		/******************** ExplntnOfBnft_Accident_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitaccidenttypecodingi == 0) {e.addExplntnOfBnftAccidentTypCdgSys("[");}
		if(explanationofbenefitaccidenttypecoding.hasSystem()) {

			e.addExplntnOfBnftAccidentTypCdgSys(String.valueOf(explanationofbenefitaccidenttypecoding.getSystem()));
		} else {
			e.addExplntnOfBnftAccidentTypCdgSys("NULL");
		}

		if(explanationofbenefitaccidenttypecodingi == explanationofbenefitaccidenttypecodinglist.size()-1) {e.addExplntnOfBnftAccidentTypCdgSys("]");}


		 };
		/******************** ExplntnOfBnft_Accident_Dt ********************************************************************************/
		if(explanationofbenefitaccident.hasDate()) {

			e.addExplntnOfBnftAccidentDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitaccident.getDate())+"\"");
		} else {
			e.addExplntnOfBnftAccidentDt("NULL");
		}


		/******************** explanationofbenefitaccidentlocationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address explanationofbenefitaccidentlocationaddress = explanationofbenefitaccident.getLocationAddress();

		/******************** ExplntnOfBnft_Accident_LctnAddr_State ********************************************************************************/
		if(explanationofbenefitaccidentlocationaddress.hasState()) {

			e.addExplntnOfBnftAccidentLctnAddrState(String.valueOf(explanationofbenefitaccidentlocationaddress.getState()));
		} else {
			e.addExplntnOfBnftAccidentLctnAddrState("NULL");
		}


		/******************** explanationofbenefitaccidentlocationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType explanationofbenefitaccidentlocationaddresstype = explanationofbenefitaccidentlocationaddress.getType();
		if(explanationofbenefitaccidentlocationaddresstype!=null) {
			e.addExplntnOfBnftAccidentLctnAddrTyp(explanationofbenefitaccidentlocationaddresstype.toCode());
		} else {
			e.addExplntnOfBnftAccidentLctnAddrTyp("NULL");
		}

		/******************** ExplntnOfBnft_Accident_LctnAddr_Cntry ********************************************************************************/
		if(explanationofbenefitaccidentlocationaddress.hasCountry()) {

			e.addExplntnOfBnftAccidentLctnAddrCntry(String.valueOf(explanationofbenefitaccidentlocationaddress.getCountry()));
		} else {
			e.addExplntnOfBnftAccidentLctnAddrCntry("NULL");
		}


		/******************** explanationofbenefitaccidentlocationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitaccidentlocationaddressperiod = explanationofbenefitaccidentlocationaddress.getPeriod();

		/******************** ExplntnOfBnft_Accident_LctnAddr_Prd_Strt ********************************************************************************/
		if(explanationofbenefitaccidentlocationaddressperiod.hasStart()) {

			e.addExplntnOfBnftAccidentLctnAddrPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitaccidentlocationaddressperiod.getStart())+"\"");
		} else {
			e.addExplntnOfBnftAccidentLctnAddrPrdStrt("NULL");
		}


		/******************** ExplntnOfBnft_Accident_LctnAddr_Prd_End ********************************************************************************/
		if(explanationofbenefitaccidentlocationaddressperiod.hasEnd()) {

			e.addExplntnOfBnftAccidentLctnAddrPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitaccidentlocationaddressperiod.getEnd())+"\"");
		} else {
			e.addExplntnOfBnftAccidentLctnAddrPrdEnd("NULL");
		}


		/******************** ExplntnOfBnft_Accident_LctnAddr_District ********************************************************************************/
		if(explanationofbenefitaccidentlocationaddress.hasDistrict()) {

			e.addExplntnOfBnftAccidentLctnAddrDistrict(String.valueOf(explanationofbenefitaccidentlocationaddress.getDistrict()));
		} else {
			e.addExplntnOfBnftAccidentLctnAddrDistrict("NULL");
		}


		/******************** ExplntnOfBnft_Accident_LctnAddr_PostalCd ********************************************************************************/
		if(explanationofbenefitaccidentlocationaddress.hasPostalCode()) {

			e.addExplntnOfBnftAccidentLctnAddrPostalCd(String.valueOf(explanationofbenefitaccidentlocationaddress.getPostalCode()));
		} else {
			e.addExplntnOfBnftAccidentLctnAddrPostalCd("NULL");
		}


		/******************** ExplntnOfBnft_Accident_LctnAddr_Line ********************************************************************************/
		if(explanationofbenefitaccidentlocationaddress.hasLine()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefitaccidentlocationaddress.getLine().size(); incr++) {
				array = array + explanationofbenefitaccidentlocationaddress.getLine().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftAccidentLctnAddrLine(array);

		} else {
			e.addExplntnOfBnftAccidentLctnAddrLine("NULL");
		}


		/******************** ExplntnOfBnft_Accident_LctnAddr_City ********************************************************************************/
		if(explanationofbenefitaccidentlocationaddress.hasCity()) {

			e.addExplntnOfBnftAccidentLctnAddrCity(String.valueOf(explanationofbenefitaccidentlocationaddress.getCity()));
		} else {
			e.addExplntnOfBnftAccidentLctnAddrCity("NULL");
		}


		/******************** explanationofbenefitaccidentlocationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse explanationofbenefitaccidentlocationaddressuse = explanationofbenefitaccidentlocationaddress.getUse();
		if(explanationofbenefitaccidentlocationaddressuse!=null) {
			e.addExplntnOfBnftAccidentLctnAddrUse(explanationofbenefitaccidentlocationaddressuse.toCode());
		} else {
			e.addExplntnOfBnftAccidentLctnAddrUse("NULL");
		}

		/******************** ExplntnOfBnft_Accident_LctnAddr_Txt ********************************************************************************/
		if(explanationofbenefitaccidentlocationaddress.hasText()) {

			e.addExplntnOfBnftAccidentLctnAddrTxt(String.valueOf(explanationofbenefitaccidentlocationaddress.getText()));
		} else {
			e.addExplntnOfBnftAccidentLctnAddrTxt("NULL");
		}


		/******************** ExplntnOfBnft_Accident_LctnRfrnc ********************************************************************************/
		if(explanationofbenefitaccident.hasLocationReference()) {

			if(explanationofbenefitaccident.getLocationReference().getReference() != null) {
			e.addExplntnOfBnftAccidentLctnRfrnc(explanationofbenefitaccident.getLocationReference().getReference());
			}
		} else {
			e.addExplntnOfBnftAccidentLctnRfrnc("NULL");
		}


		/******************** explanationofbenefittotal ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.TotalComponent> explanationofbenefittotallist = explanationofbenefit.getTotal();
		for(int explanationofbenefittotali = 0; explanationofbenefittotali<explanationofbenefittotallist.size();explanationofbenefittotali++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.TotalComponent  explanationofbenefittotal = explanationofbenefittotallist.get(explanationofbenefittotali);

		/******************** explanationofbenefittotalcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefittotalcategory = explanationofbenefittotal.getCategory();

		/******************** ExplntnOfBnft_Total_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefittotali == 0) {e.addExplntnOfBnftTotalCtgryTxt("[");}
		if(explanationofbenefittotalcategory.hasText()) {

			e.addExplntnOfBnftTotalCtgryTxt(String.valueOf(explanationofbenefittotalcategory.getText()));
		} else {
			e.addExplntnOfBnftTotalCtgryTxt("NULL");
		}

		if(explanationofbenefittotali == explanationofbenefittotallist.size()-1) {e.addExplntnOfBnftTotalCtgryTxt("]");}


		/******************** explanationofbenefittotalcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefittotalcategorycodinglist = explanationofbenefittotalcategory.getCoding();
		for(int explanationofbenefittotalcategorycodingi = 0; explanationofbenefittotalcategorycodingi<explanationofbenefittotalcategorycodinglist.size();explanationofbenefittotalcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefittotalcategorycoding = explanationofbenefittotalcategorycodinglist.get(explanationofbenefittotalcategorycodingi);

		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefittotalcategorycodingi == 0) {e.addExplntnOfBnftTotalCtgryCdgDsply("[[");}
		if(explanationofbenefittotalcategorycoding.hasDisplay()) {

			e.addExplntnOfBnftTotalCtgryCdgDsply(String.valueOf(explanationofbenefittotalcategorycoding.getDisplay()));
		} else {
			e.addExplntnOfBnftTotalCtgryCdgDsply("NULL");
		}

		if(explanationofbenefittotalcategorycodingi == explanationofbenefittotalcategorycodinglist.size()-1) {e.addExplntnOfBnftTotalCtgryCdgDsply("]]");}


		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefittotalcategorycodingi == 0) {e.addExplntnOfBnftTotalCtgryCdgVrsn("[[");}
		if(explanationofbenefittotalcategorycoding.hasVersion()) {

			e.addExplntnOfBnftTotalCtgryCdgVrsn(String.valueOf(explanationofbenefittotalcategorycoding.getVersion()));
		} else {
			e.addExplntnOfBnftTotalCtgryCdgVrsn("NULL");
		}

		if(explanationofbenefittotalcategorycodingi == explanationofbenefittotalcategorycodinglist.size()-1) {e.addExplntnOfBnftTotalCtgryCdgVrsn("]]");}


		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefittotalcategorycodingi == 0) {e.addExplntnOfBnftTotalCtgryCdgCd("[[");}
		if(explanationofbenefittotalcategorycoding.hasCode()) {

			e.addExplntnOfBnftTotalCtgryCdgCd(String.valueOf(explanationofbenefittotalcategorycoding.getCode()));
		} else {
			e.addExplntnOfBnftTotalCtgryCdgCd("NULL");
		}

		if(explanationofbenefittotalcategorycodingi == explanationofbenefittotalcategorycodinglist.size()-1) {e.addExplntnOfBnftTotalCtgryCdgCd("]]");}


		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefittotalcategorycodingi == 0) {e.addExplntnOfBnftTotalCtgryCdgUsrSltd("[[");}
		if(explanationofbenefittotalcategorycoding.hasUserSelected()) {

			e.addExplntnOfBnftTotalCtgryCdgUsrSltd(String.valueOf(explanationofbenefittotalcategorycoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftTotalCtgryCdgUsrSltd("NULL");
		}

		if(explanationofbenefittotalcategorycodingi == explanationofbenefittotalcategorycodinglist.size()-1) {e.addExplntnOfBnftTotalCtgryCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefittotalcategorycodingi == 0) {e.addExplntnOfBnftTotalCtgryCdgSys("[[");}
		if(explanationofbenefittotalcategorycoding.hasSystem()) {

			e.addExplntnOfBnftTotalCtgryCdgSys(String.valueOf(explanationofbenefittotalcategorycoding.getSystem()));
		} else {
			e.addExplntnOfBnftTotalCtgryCdgSys("NULL");
		}

		if(explanationofbenefittotalcategorycodingi == explanationofbenefittotalcategorycodinglist.size()-1) {e.addExplntnOfBnftTotalCtgryCdgSys("]]");}


		 };
		/******************** explanationofbenefittotalamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefittotalamount = explanationofbenefittotal.getAmount();

		/******************** ExplntnOfBnft_Total_Amnt_Vl ********************************************************************************/
		if(explanationofbenefittotali == 0) {e.addExplntnOfBnftTotalAmntVl("[");}
		if(explanationofbenefittotalamount.hasValue()) {

			e.addExplntnOfBnftTotalAmntVl(String.valueOf(explanationofbenefittotalamount.getValue()));
		} else {
			e.addExplntnOfBnftTotalAmntVl("NULL");
		}

		if(explanationofbenefittotali == explanationofbenefittotallist.size()-1) {e.addExplntnOfBnftTotalAmntVl("]");}


		/******************** ExplntnOfBnft_Total_Amnt_Crncy ********************************************************************************/
		if(explanationofbenefittotali == 0) {e.addExplntnOfBnftTotalAmntCrncy("[");}
		if(explanationofbenefittotalamount.hasCurrency()) {

			e.addExplntnOfBnftTotalAmntCrncy(String.valueOf(explanationofbenefittotalamount.getCurrency()));
		} else {
			e.addExplntnOfBnftTotalAmntCrncy("NULL");
		}

		if(explanationofbenefittotali == explanationofbenefittotallist.size()-1) {e.addExplntnOfBnftTotalAmntCrncy("]");}


		 };
		/******************** explanationofbenefitform ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment explanationofbenefitform = explanationofbenefit.getForm();

		/******************** ExplntnOfBnft_Frm_Sz ********************************************************************************/
		if(explanationofbenefitform.hasSize()) {

			e.addExplntnOfBnftFrmSz(String.valueOf(explanationofbenefitform.getSize()));
		} else {
			e.addExplntnOfBnftFrmSz("NULL");
		}


		/******************** ExplntnOfBnft_Frm_Lnguage ********************************************************************************/
		if(explanationofbenefitform.hasLanguage()) {

			e.addExplntnOfBnftFrmLnguage(String.valueOf(explanationofbenefitform.getLanguage()));
		} else {
			e.addExplntnOfBnftFrmLnguage("NULL");
		}


		/******************** ExplntnOfBnft_Frm_CntntTyp ********************************************************************************/
		if(explanationofbenefitform.hasContentType()) {

			e.addExplntnOfBnftFrmCntntTyp(String.valueOf(explanationofbenefitform.getContentType()));
		} else {
			e.addExplntnOfBnftFrmCntntTyp("NULL");
		}


		/******************** ExplntnOfBnft_Frm_Hash ********************************************************************************/
		if(explanationofbenefitform.hasHash()) {

			e.addExplntnOfBnftFrmHash(new String(explanationofbenefitform.getHash()));
		} else {
			e.addExplntnOfBnftFrmHash("NULL");
		}


		/******************** ExplntnOfBnft_Frm_Data ********************************************************************************/
		if(explanationofbenefitform.hasData()) {

			e.addExplntnOfBnftFrmData(new String(explanationofbenefitform.getData()));
		} else {
			e.addExplntnOfBnftFrmData("NULL");
		}


		/******************** ExplntnOfBnft_Frm_Creation ********************************************************************************/
		if(explanationofbenefitform.hasCreation()) {

			e.addExplntnOfBnftFrmCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitform.getCreation())+"\"");
		} else {
			e.addExplntnOfBnftFrmCreation("NULL");
		}


		/******************** ExplntnOfBnft_Frm_Ttl ********************************************************************************/
		if(explanationofbenefitform.hasTitle()) {

			e.addExplntnOfBnftFrmTtl(String.valueOf(explanationofbenefitform.getTitle()));
		} else {
			e.addExplntnOfBnftFrmTtl("NULL");
		}


		/******************** ExplntnOfBnft_Frm_Url ********************************************************************************/
		if(explanationofbenefitform.hasUrl()) {

			e.addExplntnOfBnftFrmUrl(String.valueOf(explanationofbenefitform.getUrl()));
		} else {
			e.addExplntnOfBnftFrmUrl("NULL");
		}


		/******************** explanationofbenefitbenefitperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitbenefitperiod = explanationofbenefit.getBenefitPeriod();

		/******************** ExplntnOfBnft_BnftPrd_Strt ********************************************************************************/
		if(explanationofbenefitbenefitperiod.hasStart()) {

			e.addExplntnOfBnftBnftPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitbenefitperiod.getStart())+"\"");
		} else {
			e.addExplntnOfBnftBnftPrdStrt("NULL");
		}


		/******************** ExplntnOfBnft_BnftPrd_End ********************************************************************************/
		if(explanationofbenefitbenefitperiod.hasEnd()) {

			e.addExplntnOfBnftBnftPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitbenefitperiod.getEnd())+"\"");
		} else {
			e.addExplntnOfBnftBnftPrdEnd("NULL");
		}


		/******************** explanationofbenefitbenefitbalance ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitBalanceComponent> explanationofbenefitbenefitbalancelist = explanationofbenefit.getBenefitBalance();
		for(int explanationofbenefitbenefitbalancei = 0; explanationofbenefitbenefitbalancei<explanationofbenefitbenefitbalancelist.size();explanationofbenefitbenefitbalancei++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitBalanceComponent  explanationofbenefitbenefitbalance = explanationofbenefitbenefitbalancelist.get(explanationofbenefitbenefitbalancei);

		/******************** ExplntnOfBnft_BnftBalance_Nm ********************************************************************************/
		if(explanationofbenefitbenefitbalancei == 0) {e.addExplntnOfBnftBnftBalanceNm("[");}
		if(explanationofbenefitbenefitbalance.hasName()) {

			e.addExplntnOfBnftBnftBalanceNm(String.valueOf(explanationofbenefitbenefitbalance.getName()));
		} else {
			e.addExplntnOfBnftBnftBalanceNm("NULL");
		}

		if(explanationofbenefitbenefitbalancei == explanationofbenefitbenefitbalancelist.size()-1) {e.addExplntnOfBnftBnftBalanceNm("]");}


		/******************** ExplntnOfBnft_BnftBalance_Dscrptn ********************************************************************************/
		if(explanationofbenefitbenefitbalancei == 0) {e.addExplntnOfBnftBnftBalanceDscrptn("[");}
		if(explanationofbenefitbenefitbalance.hasDescription()) {

			e.addExplntnOfBnftBnftBalanceDscrptn(String.valueOf(explanationofbenefitbenefitbalance.getDescription()));
		} else {
			e.addExplntnOfBnftBnftBalanceDscrptn("NULL");
		}

		if(explanationofbenefitbenefitbalancei == explanationofbenefitbenefitbalancelist.size()-1) {e.addExplntnOfBnftBnftBalanceDscrptn("]");}


		/******************** explanationofbenefitbenefitbalancecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitbenefitbalancecategory = explanationofbenefitbenefitbalance.getCategory();

		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefitbenefitbalancei == 0) {e.addExplntnOfBnftBnftBalanceCtgryTxt("[");}
		if(explanationofbenefitbenefitbalancecategory.hasText()) {

			e.addExplntnOfBnftBnftBalanceCtgryTxt(String.valueOf(explanationofbenefitbenefitbalancecategory.getText()));
		} else {
			e.addExplntnOfBnftBnftBalanceCtgryTxt("NULL");
		}

		if(explanationofbenefitbenefitbalancei == explanationofbenefitbenefitbalancelist.size()-1) {e.addExplntnOfBnftBnftBalanceCtgryTxt("]");}


		/******************** explanationofbenefitbenefitbalancecategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitbenefitbalancecategorycodinglist = explanationofbenefitbenefitbalancecategory.getCoding();
		for(int explanationofbenefitbenefitbalancecategorycodingi = 0; explanationofbenefitbenefitbalancecategorycodingi<explanationofbenefitbenefitbalancecategorycodinglist.size();explanationofbenefitbenefitbalancecategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitbenefitbalancecategorycoding = explanationofbenefitbenefitbalancecategorycodinglist.get(explanationofbenefitbenefitbalancecategorycodingi);

		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitbenefitbalancecategorycodingi == 0) {e.addExplntnOfBnftBnftBalanceCtgryCdgDsply("[[");}
		if(explanationofbenefitbenefitbalancecategorycoding.hasDisplay()) {

			e.addExplntnOfBnftBnftBalanceCtgryCdgDsply(String.valueOf(explanationofbenefitbenefitbalancecategorycoding.getDisplay()));
		} else {
			e.addExplntnOfBnftBnftBalanceCtgryCdgDsply("NULL");
		}

		if(explanationofbenefitbenefitbalancecategorycodingi == explanationofbenefitbenefitbalancecategorycodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceCtgryCdgDsply("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitbenefitbalancecategorycodingi == 0) {e.addExplntnOfBnftBnftBalanceCtgryCdgVrsn("[[");}
		if(explanationofbenefitbenefitbalancecategorycoding.hasVersion()) {

			e.addExplntnOfBnftBnftBalanceCtgryCdgVrsn(String.valueOf(explanationofbenefitbenefitbalancecategorycoding.getVersion()));
		} else {
			e.addExplntnOfBnftBnftBalanceCtgryCdgVrsn("NULL");
		}

		if(explanationofbenefitbenefitbalancecategorycodingi == explanationofbenefitbenefitbalancecategorycodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceCtgryCdgVrsn("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitbenefitbalancecategorycodingi == 0) {e.addExplntnOfBnftBnftBalanceCtgryCdgCd("[[");}
		if(explanationofbenefitbenefitbalancecategorycoding.hasCode()) {

			e.addExplntnOfBnftBnftBalanceCtgryCdgCd(String.valueOf(explanationofbenefitbenefitbalancecategorycoding.getCode()));
		} else {
			e.addExplntnOfBnftBnftBalanceCtgryCdgCd("NULL");
		}

		if(explanationofbenefitbenefitbalancecategorycodingi == explanationofbenefitbenefitbalancecategorycodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceCtgryCdgCd("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitbenefitbalancecategorycodingi == 0) {e.addExplntnOfBnftBnftBalanceCtgryCdgUsrSltd("[[");}
		if(explanationofbenefitbenefitbalancecategorycoding.hasUserSelected()) {

			e.addExplntnOfBnftBnftBalanceCtgryCdgUsrSltd(String.valueOf(explanationofbenefitbenefitbalancecategorycoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftBnftBalanceCtgryCdgUsrSltd("NULL");
		}

		if(explanationofbenefitbenefitbalancecategorycodingi == explanationofbenefitbenefitbalancecategorycodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceCtgryCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitbenefitbalancecategorycodingi == 0) {e.addExplntnOfBnftBnftBalanceCtgryCdgSys("[[");}
		if(explanationofbenefitbenefitbalancecategorycoding.hasSystem()) {

			e.addExplntnOfBnftBnftBalanceCtgryCdgSys(String.valueOf(explanationofbenefitbenefitbalancecategorycoding.getSystem()));
		} else {
			e.addExplntnOfBnftBnftBalanceCtgryCdgSys("NULL");
		}

		if(explanationofbenefitbenefitbalancecategorycodingi == explanationofbenefitbenefitbalancecategorycodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceCtgryCdgSys("]]");}


		 };
		/******************** explanationofbenefitbenefitbalanceunit ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitbenefitbalanceunit = explanationofbenefitbenefitbalance.getUnit();

		/******************** ExplntnOfBnft_BnftBalance_Unt_Txt ********************************************************************************/
		if(explanationofbenefitbenefitbalancei == 0) {e.addExplntnOfBnftBnftBalanceUntTxt("[");}
		if(explanationofbenefitbenefitbalanceunit.hasText()) {

			e.addExplntnOfBnftBnftBalanceUntTxt(String.valueOf(explanationofbenefitbenefitbalanceunit.getText()));
		} else {
			e.addExplntnOfBnftBnftBalanceUntTxt("NULL");
		}

		if(explanationofbenefitbenefitbalancei == explanationofbenefitbenefitbalancelist.size()-1) {e.addExplntnOfBnftBnftBalanceUntTxt("]");}


		/******************** explanationofbenefitbenefitbalanceunitcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitbenefitbalanceunitcodinglist = explanationofbenefitbenefitbalanceunit.getCoding();
		for(int explanationofbenefitbenefitbalanceunitcodingi = 0; explanationofbenefitbenefitbalanceunitcodingi<explanationofbenefitbenefitbalanceunitcodinglist.size();explanationofbenefitbenefitbalanceunitcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitbenefitbalanceunitcoding = explanationofbenefitbenefitbalanceunitcodinglist.get(explanationofbenefitbenefitbalanceunitcodingi);

		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitbenefitbalanceunitcodingi == 0) {e.addExplntnOfBnftBnftBalanceUntCdgDsply("[[");}
		if(explanationofbenefitbenefitbalanceunitcoding.hasDisplay()) {

			e.addExplntnOfBnftBnftBalanceUntCdgDsply(String.valueOf(explanationofbenefitbenefitbalanceunitcoding.getDisplay()));
		} else {
			e.addExplntnOfBnftBnftBalanceUntCdgDsply("NULL");
		}

		if(explanationofbenefitbenefitbalanceunitcodingi == explanationofbenefitbenefitbalanceunitcodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceUntCdgDsply("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitbenefitbalanceunitcodingi == 0) {e.addExplntnOfBnftBnftBalanceUntCdgVrsn("[[");}
		if(explanationofbenefitbenefitbalanceunitcoding.hasVersion()) {

			e.addExplntnOfBnftBnftBalanceUntCdgVrsn(String.valueOf(explanationofbenefitbenefitbalanceunitcoding.getVersion()));
		} else {
			e.addExplntnOfBnftBnftBalanceUntCdgVrsn("NULL");
		}

		if(explanationofbenefitbenefitbalanceunitcodingi == explanationofbenefitbenefitbalanceunitcodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceUntCdgVrsn("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitbenefitbalanceunitcodingi == 0) {e.addExplntnOfBnftBnftBalanceUntCdgCd("[[");}
		if(explanationofbenefitbenefitbalanceunitcoding.hasCode()) {

			e.addExplntnOfBnftBnftBalanceUntCdgCd(String.valueOf(explanationofbenefitbenefitbalanceunitcoding.getCode()));
		} else {
			e.addExplntnOfBnftBnftBalanceUntCdgCd("NULL");
		}

		if(explanationofbenefitbenefitbalanceunitcodingi == explanationofbenefitbenefitbalanceunitcodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceUntCdgCd("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitbenefitbalanceunitcodingi == 0) {e.addExplntnOfBnftBnftBalanceUntCdgUsrSltd("[[");}
		if(explanationofbenefitbenefitbalanceunitcoding.hasUserSelected()) {

			e.addExplntnOfBnftBnftBalanceUntCdgUsrSltd(String.valueOf(explanationofbenefitbenefitbalanceunitcoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftBnftBalanceUntCdgUsrSltd("NULL");
		}

		if(explanationofbenefitbenefitbalanceunitcodingi == explanationofbenefitbenefitbalanceunitcodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceUntCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitbenefitbalanceunitcodingi == 0) {e.addExplntnOfBnftBnftBalanceUntCdgSys("[[");}
		if(explanationofbenefitbenefitbalanceunitcoding.hasSystem()) {

			e.addExplntnOfBnftBnftBalanceUntCdgSys(String.valueOf(explanationofbenefitbenefitbalanceunitcoding.getSystem()));
		} else {
			e.addExplntnOfBnftBnftBalanceUntCdgSys("NULL");
		}

		if(explanationofbenefitbenefitbalanceunitcodingi == explanationofbenefitbenefitbalanceunitcodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceUntCdgSys("]]");}


		 };
		/******************** explanationofbenefitbenefitbalancenetwork ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitbenefitbalancenetwork = explanationofbenefitbenefitbalance.getNetwork();

		/******************** ExplntnOfBnft_BnftBalance_Network_Txt ********************************************************************************/
		if(explanationofbenefitbenefitbalancei == 0) {e.addExplntnOfBnftBnftBalanceNetworkTxt("[");}
		if(explanationofbenefitbenefitbalancenetwork.hasText()) {

			e.addExplntnOfBnftBnftBalanceNetworkTxt(String.valueOf(explanationofbenefitbenefitbalancenetwork.getText()));
		} else {
			e.addExplntnOfBnftBnftBalanceNetworkTxt("NULL");
		}

		if(explanationofbenefitbenefitbalancei == explanationofbenefitbenefitbalancelist.size()-1) {e.addExplntnOfBnftBnftBalanceNetworkTxt("]");}


		/******************** explanationofbenefitbenefitbalancenetworkcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitbenefitbalancenetworkcodinglist = explanationofbenefitbenefitbalancenetwork.getCoding();
		for(int explanationofbenefitbenefitbalancenetworkcodingi = 0; explanationofbenefitbenefitbalancenetworkcodingi<explanationofbenefitbenefitbalancenetworkcodinglist.size();explanationofbenefitbenefitbalancenetworkcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitbenefitbalancenetworkcoding = explanationofbenefitbenefitbalancenetworkcodinglist.get(explanationofbenefitbenefitbalancenetworkcodingi);

		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitbenefitbalancenetworkcodingi == 0) {e.addExplntnOfBnftBnftBalanceNetworkCdgDsply("[[");}
		if(explanationofbenefitbenefitbalancenetworkcoding.hasDisplay()) {

			e.addExplntnOfBnftBnftBalanceNetworkCdgDsply(String.valueOf(explanationofbenefitbenefitbalancenetworkcoding.getDisplay()));
		} else {
			e.addExplntnOfBnftBnftBalanceNetworkCdgDsply("NULL");
		}

		if(explanationofbenefitbenefitbalancenetworkcodingi == explanationofbenefitbenefitbalancenetworkcodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceNetworkCdgDsply("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitbenefitbalancenetworkcodingi == 0) {e.addExplntnOfBnftBnftBalanceNetworkCdgVrsn("[[");}
		if(explanationofbenefitbenefitbalancenetworkcoding.hasVersion()) {

			e.addExplntnOfBnftBnftBalanceNetworkCdgVrsn(String.valueOf(explanationofbenefitbenefitbalancenetworkcoding.getVersion()));
		} else {
			e.addExplntnOfBnftBnftBalanceNetworkCdgVrsn("NULL");
		}

		if(explanationofbenefitbenefitbalancenetworkcodingi == explanationofbenefitbenefitbalancenetworkcodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceNetworkCdgVrsn("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitbenefitbalancenetworkcodingi == 0) {e.addExplntnOfBnftBnftBalanceNetworkCdgCd("[[");}
		if(explanationofbenefitbenefitbalancenetworkcoding.hasCode()) {

			e.addExplntnOfBnftBnftBalanceNetworkCdgCd(String.valueOf(explanationofbenefitbenefitbalancenetworkcoding.getCode()));
		} else {
			e.addExplntnOfBnftBnftBalanceNetworkCdgCd("NULL");
		}

		if(explanationofbenefitbenefitbalancenetworkcodingi == explanationofbenefitbenefitbalancenetworkcodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceNetworkCdgCd("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitbenefitbalancenetworkcodingi == 0) {e.addExplntnOfBnftBnftBalanceNetworkCdgUsrSltd("[[");}
		if(explanationofbenefitbenefitbalancenetworkcoding.hasUserSelected()) {

			e.addExplntnOfBnftBnftBalanceNetworkCdgUsrSltd(String.valueOf(explanationofbenefitbenefitbalancenetworkcoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftBnftBalanceNetworkCdgUsrSltd("NULL");
		}

		if(explanationofbenefitbenefitbalancenetworkcodingi == explanationofbenefitbenefitbalancenetworkcodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceNetworkCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitbenefitbalancenetworkcodingi == 0) {e.addExplntnOfBnftBnftBalanceNetworkCdgSys("[[");}
		if(explanationofbenefitbenefitbalancenetworkcoding.hasSystem()) {

			e.addExplntnOfBnftBnftBalanceNetworkCdgSys(String.valueOf(explanationofbenefitbenefitbalancenetworkcoding.getSystem()));
		} else {
			e.addExplntnOfBnftBnftBalanceNetworkCdgSys("NULL");
		}

		if(explanationofbenefitbenefitbalancenetworkcodingi == explanationofbenefitbenefitbalancenetworkcodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceNetworkCdgSys("]]");}


		 };
		/******************** explanationofbenefitbenefitbalanceterm ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitbenefitbalanceterm = explanationofbenefitbenefitbalance.getTerm();

		/******************** ExplntnOfBnft_BnftBalance_Trm_Txt ********************************************************************************/
		if(explanationofbenefitbenefitbalancei == 0) {e.addExplntnOfBnftBnftBalanceTrmTxt("[");}
		if(explanationofbenefitbenefitbalanceterm.hasText()) {

			e.addExplntnOfBnftBnftBalanceTrmTxt(String.valueOf(explanationofbenefitbenefitbalanceterm.getText()));
		} else {
			e.addExplntnOfBnftBnftBalanceTrmTxt("NULL");
		}

		if(explanationofbenefitbenefitbalancei == explanationofbenefitbenefitbalancelist.size()-1) {e.addExplntnOfBnftBnftBalanceTrmTxt("]");}


		/******************** explanationofbenefitbenefitbalancetermcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitbenefitbalancetermcodinglist = explanationofbenefitbenefitbalanceterm.getCoding();
		for(int explanationofbenefitbenefitbalancetermcodingi = 0; explanationofbenefitbenefitbalancetermcodingi<explanationofbenefitbenefitbalancetermcodinglist.size();explanationofbenefitbenefitbalancetermcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitbenefitbalancetermcoding = explanationofbenefitbenefitbalancetermcodinglist.get(explanationofbenefitbenefitbalancetermcodingi);

		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitbenefitbalancetermcodingi == 0) {e.addExplntnOfBnftBnftBalanceTrmCdgDsply("[[");}
		if(explanationofbenefitbenefitbalancetermcoding.hasDisplay()) {

			e.addExplntnOfBnftBnftBalanceTrmCdgDsply(String.valueOf(explanationofbenefitbenefitbalancetermcoding.getDisplay()));
		} else {
			e.addExplntnOfBnftBnftBalanceTrmCdgDsply("NULL");
		}

		if(explanationofbenefitbenefitbalancetermcodingi == explanationofbenefitbenefitbalancetermcodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceTrmCdgDsply("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitbenefitbalancetermcodingi == 0) {e.addExplntnOfBnftBnftBalanceTrmCdgVrsn("[[");}
		if(explanationofbenefitbenefitbalancetermcoding.hasVersion()) {

			e.addExplntnOfBnftBnftBalanceTrmCdgVrsn(String.valueOf(explanationofbenefitbenefitbalancetermcoding.getVersion()));
		} else {
			e.addExplntnOfBnftBnftBalanceTrmCdgVrsn("NULL");
		}

		if(explanationofbenefitbenefitbalancetermcodingi == explanationofbenefitbenefitbalancetermcodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceTrmCdgVrsn("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitbenefitbalancetermcodingi == 0) {e.addExplntnOfBnftBnftBalanceTrmCdgCd("[[");}
		if(explanationofbenefitbenefitbalancetermcoding.hasCode()) {

			e.addExplntnOfBnftBnftBalanceTrmCdgCd(String.valueOf(explanationofbenefitbenefitbalancetermcoding.getCode()));
		} else {
			e.addExplntnOfBnftBnftBalanceTrmCdgCd("NULL");
		}

		if(explanationofbenefitbenefitbalancetermcodingi == explanationofbenefitbenefitbalancetermcodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceTrmCdgCd("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitbenefitbalancetermcodingi == 0) {e.addExplntnOfBnftBnftBalanceTrmCdgUsrSltd("[[");}
		if(explanationofbenefitbenefitbalancetermcoding.hasUserSelected()) {

			e.addExplntnOfBnftBnftBalanceTrmCdgUsrSltd(String.valueOf(explanationofbenefitbenefitbalancetermcoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftBnftBalanceTrmCdgUsrSltd("NULL");
		}

		if(explanationofbenefitbenefitbalancetermcodingi == explanationofbenefitbenefitbalancetermcodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceTrmCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitbenefitbalancetermcodingi == 0) {e.addExplntnOfBnftBnftBalanceTrmCdgSys("[[");}
		if(explanationofbenefitbenefitbalancetermcoding.hasSystem()) {

			e.addExplntnOfBnftBnftBalanceTrmCdgSys(String.valueOf(explanationofbenefitbenefitbalancetermcoding.getSystem()));
		} else {
			e.addExplntnOfBnftBnftBalanceTrmCdgSys("NULL");
		}

		if(explanationofbenefitbenefitbalancetermcodingi == explanationofbenefitbenefitbalancetermcodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceTrmCdgSys("]]");}


		 };
		/******************** ExplntnOfBnft_BnftBalance_Excluded ********************************************************************************/
		if(explanationofbenefitbenefitbalancei == 0) {e.addExplntnOfBnftBnftBalanceExcluded("[");}
		if(explanationofbenefitbenefitbalance.hasExcluded()) {

			e.addExplntnOfBnftBnftBalanceExcluded(String.valueOf(explanationofbenefitbenefitbalance.getExcluded()));
		} else {
			e.addExplntnOfBnftBnftBalanceExcluded("NULL");
		}

		if(explanationofbenefitbenefitbalancei == explanationofbenefitbenefitbalancelist.size()-1) {e.addExplntnOfBnftBnftBalanceExcluded("]");}


		/******************** explanationofbenefitbenefitbalancefinancial ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitComponent> explanationofbenefitbenefitbalancefinanciallist = explanationofbenefitbenefitbalance.getFinancial();
		for(int explanationofbenefitbenefitbalancefinanciali = 0; explanationofbenefitbenefitbalancefinanciali<explanationofbenefitbenefitbalancefinanciallist.size();explanationofbenefitbenefitbalancefinanciali++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitComponent  explanationofbenefitbenefitbalancefinancial = explanationofbenefitbenefitbalancefinanciallist.get(explanationofbenefitbenefitbalancefinanciali);

		/******************** explanationofbenefitbenefitbalancefinancialtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitbenefitbalancefinancialtype = explanationofbenefitbenefitbalancefinancial.getType();

		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Txt ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinanciali == 0) {e.addExplntnOfBnftBnftBalanceFinancialTypTxt("[[");}
		if(explanationofbenefitbenefitbalancefinancialtype.hasText()) {

			e.addExplntnOfBnftBnftBalanceFinancialTypTxt(String.valueOf(explanationofbenefitbenefitbalancefinancialtype.getText()));
		} else {
			e.addExplntnOfBnftBnftBalanceFinancialTypTxt("NULL");
		}

		if(explanationofbenefitbenefitbalancefinanciali == explanationofbenefitbenefitbalancefinanciallist.size()-1) {e.addExplntnOfBnftBnftBalanceFinancialTypTxt("]]");}


		/******************** explanationofbenefitbenefitbalancefinancialtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitbenefitbalancefinancialtypecodinglist = explanationofbenefitbenefitbalancefinancialtype.getCoding();
		for(int explanationofbenefitbenefitbalancefinancialtypecodingi = 0; explanationofbenefitbenefitbalancefinancialtypecodingi<explanationofbenefitbenefitbalancefinancialtypecodinglist.size();explanationofbenefitbenefitbalancefinancialtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitbenefitbalancefinancialtypecoding = explanationofbenefitbenefitbalancefinancialtypecodinglist.get(explanationofbenefitbenefitbalancefinancialtypecodingi);

		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinancialtypecodingi == 0) {e.addExplntnOfBnftBnftBalanceFinancialTypCdgDsply("[[[");}
		if(explanationofbenefitbenefitbalancefinancialtypecoding.hasDisplay()) {

			e.addExplntnOfBnftBnftBalanceFinancialTypCdgDsply(String.valueOf(explanationofbenefitbenefitbalancefinancialtypecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftBnftBalanceFinancialTypCdgDsply("NULL");
		}

		if(explanationofbenefitbenefitbalancefinancialtypecodingi == explanationofbenefitbenefitbalancefinancialtypecodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceFinancialTypCdgDsply("]]]");}


		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinancialtypecodingi == 0) {e.addExplntnOfBnftBnftBalanceFinancialTypCdgVrsn("[[[");}
		if(explanationofbenefitbenefitbalancefinancialtypecoding.hasVersion()) {

			e.addExplntnOfBnftBnftBalanceFinancialTypCdgVrsn(String.valueOf(explanationofbenefitbenefitbalancefinancialtypecoding.getVersion()));
		} else {
			e.addExplntnOfBnftBnftBalanceFinancialTypCdgVrsn("NULL");
		}

		if(explanationofbenefitbenefitbalancefinancialtypecodingi == explanationofbenefitbenefitbalancefinancialtypecodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceFinancialTypCdgVrsn("]]]");}


		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinancialtypecodingi == 0) {e.addExplntnOfBnftBnftBalanceFinancialTypCdgCd("[[[");}
		if(explanationofbenefitbenefitbalancefinancialtypecoding.hasCode()) {

			e.addExplntnOfBnftBnftBalanceFinancialTypCdgCd(String.valueOf(explanationofbenefitbenefitbalancefinancialtypecoding.getCode()));
		} else {
			e.addExplntnOfBnftBnftBalanceFinancialTypCdgCd("NULL");
		}

		if(explanationofbenefitbenefitbalancefinancialtypecodingi == explanationofbenefitbenefitbalancefinancialtypecodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceFinancialTypCdgCd("]]]");}


		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinancialtypecodingi == 0) {e.addExplntnOfBnftBnftBalanceFinancialTypCdgUsrSltd("[[[");}
		if(explanationofbenefitbenefitbalancefinancialtypecoding.hasUserSelected()) {

			e.addExplntnOfBnftBnftBalanceFinancialTypCdgUsrSltd(String.valueOf(explanationofbenefitbenefitbalancefinancialtypecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftBnftBalanceFinancialTypCdgUsrSltd("NULL");
		}

		if(explanationofbenefitbenefitbalancefinancialtypecodingi == explanationofbenefitbenefitbalancefinancialtypecodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceFinancialTypCdgUsrSltd("]]]");}


		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinancialtypecodingi == 0) {e.addExplntnOfBnftBnftBalanceFinancialTypCdgSys("[[[");}
		if(explanationofbenefitbenefitbalancefinancialtypecoding.hasSystem()) {

			e.addExplntnOfBnftBnftBalanceFinancialTypCdgSys(String.valueOf(explanationofbenefitbenefitbalancefinancialtypecoding.getSystem()));
		} else {
			e.addExplntnOfBnftBnftBalanceFinancialTypCdgSys("NULL");
		}

		if(explanationofbenefitbenefitbalancefinancialtypecodingi == explanationofbenefitbenefitbalancefinancialtypecodinglist.size()-1) {e.addExplntnOfBnftBnftBalanceFinancialTypCdgSys("]]]");}


		 };
		/******************** ExplntnOfBnft_BnftBalance_Financial_UsedUnsignedIntTyp ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinanciali == 0) {e.addExplntnOfBnftBnftBalanceFinancialUsedUnsignedIntTyp("[[");}
		if(explanationofbenefitbenefitbalancefinancial.hasUsedUnsignedIntType()) {

			e.addExplntnOfBnftBnftBalanceFinancialUsedUnsignedIntTyp("\""+explanationofbenefitbenefitbalancefinancial.getUsedUnsignedIntType().getValueAsString()+"\"");
		} else {
			e.addExplntnOfBnftBnftBalanceFinancialUsedUnsignedIntTyp("NULL");
		}

		if(explanationofbenefitbenefitbalancefinanciali == explanationofbenefitbenefitbalancefinanciallist.size()-1) {e.addExplntnOfBnftBnftBalanceFinancialUsedUnsignedIntTyp("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Financial_AllowedStrgTyp ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinanciali == 0) {e.addExplntnOfBnftBnftBalanceFinancialAllowedStrgTyp("[[");}
		if(explanationofbenefitbenefitbalancefinancial.hasAllowedStringType()) {

			e.addExplntnOfBnftBnftBalanceFinancialAllowedStrgTyp("\""+explanationofbenefitbenefitbalancefinancial.getAllowedStringType().getValueAsString()+"\"");
		} else {
			e.addExplntnOfBnftBnftBalanceFinancialAllowedStrgTyp("NULL");
		}

		if(explanationofbenefitbenefitbalancefinanciali == explanationofbenefitbenefitbalancefinanciallist.size()-1) {e.addExplntnOfBnftBnftBalanceFinancialAllowedStrgTyp("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Financial_AllowedUnsignedIntTyp ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinanciali == 0) {e.addExplntnOfBnftBnftBalanceFinancialAllowedUnsignedIntTyp("[[");}
		if(explanationofbenefitbenefitbalancefinancial.hasAllowedUnsignedIntType()) {

			e.addExplntnOfBnftBnftBalanceFinancialAllowedUnsignedIntTyp("\""+explanationofbenefitbenefitbalancefinancial.getAllowedUnsignedIntType().getValueAsString()+"\"");
		} else {
			e.addExplntnOfBnftBnftBalanceFinancialAllowedUnsignedIntTyp("NULL");
		}

		if(explanationofbenefitbenefitbalancefinanciali == explanationofbenefitbenefitbalancefinanciallist.size()-1) {e.addExplntnOfBnftBnftBalanceFinancialAllowedUnsignedIntTyp("]]");}


		/******************** explanationofbenefitbenefitbalancefinancialusedmoney ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitbenefitbalancefinancialusedmoney = explanationofbenefitbenefitbalancefinancial.getUsedMoney();

		/******************** ExplntnOfBnft_BnftBalance_Financial_UsedMoney_Vl ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinanciali == 0) {e.addExplntnOfBnftBnftBalanceFinancialUsedMoneyVl("[[");}
		if(explanationofbenefitbenefitbalancefinancialusedmoney.hasValue()) {

			e.addExplntnOfBnftBnftBalanceFinancialUsedMoneyVl(String.valueOf(explanationofbenefitbenefitbalancefinancialusedmoney.getValue()));
		} else {
			e.addExplntnOfBnftBnftBalanceFinancialUsedMoneyVl("NULL");
		}

		if(explanationofbenefitbenefitbalancefinanciali == explanationofbenefitbenefitbalancefinanciallist.size()-1) {e.addExplntnOfBnftBnftBalanceFinancialUsedMoneyVl("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Financial_UsedMoney_Crncy ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinanciali == 0) {e.addExplntnOfBnftBnftBalanceFinancialUsedMoneyCrncy("[[");}
		if(explanationofbenefitbenefitbalancefinancialusedmoney.hasCurrency()) {

			e.addExplntnOfBnftBnftBalanceFinancialUsedMoneyCrncy(String.valueOf(explanationofbenefitbenefitbalancefinancialusedmoney.getCurrency()));
		} else {
			e.addExplntnOfBnftBnftBalanceFinancialUsedMoneyCrncy("NULL");
		}

		if(explanationofbenefitbenefitbalancefinanciali == explanationofbenefitbenefitbalancefinanciallist.size()-1) {e.addExplntnOfBnftBnftBalanceFinancialUsedMoneyCrncy("]]");}


		/******************** explanationofbenefitbenefitbalancefinancialallowedmoney ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitbenefitbalancefinancialallowedmoney = explanationofbenefitbenefitbalancefinancial.getAllowedMoney();

		/******************** ExplntnOfBnft_BnftBalance_Financial_AllowedMoney_Vl ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinanciali == 0) {e.addExplntnOfBnftBnftBalanceFinancialAllowedMoneyVl("[[");}
		if(explanationofbenefitbenefitbalancefinancialallowedmoney.hasValue()) {

			e.addExplntnOfBnftBnftBalanceFinancialAllowedMoneyVl(String.valueOf(explanationofbenefitbenefitbalancefinancialallowedmoney.getValue()));
		} else {
			e.addExplntnOfBnftBnftBalanceFinancialAllowedMoneyVl("NULL");
		}

		if(explanationofbenefitbenefitbalancefinanciali == explanationofbenefitbenefitbalancefinanciallist.size()-1) {e.addExplntnOfBnftBnftBalanceFinancialAllowedMoneyVl("]]");}


		/******************** ExplntnOfBnft_BnftBalance_Financial_AllowedMoney_Crncy ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinanciali == 0) {e.addExplntnOfBnftBnftBalanceFinancialAllowedMoneyCrncy("[[");}
		if(explanationofbenefitbenefitbalancefinancialallowedmoney.hasCurrency()) {

			e.addExplntnOfBnftBnftBalanceFinancialAllowedMoneyCrncy(String.valueOf(explanationofbenefitbenefitbalancefinancialallowedmoney.getCurrency()));
		} else {
			e.addExplntnOfBnftBnftBalanceFinancialAllowedMoneyCrncy("NULL");
		}

		if(explanationofbenefitbenefitbalancefinanciali == explanationofbenefitbenefitbalancefinanciallist.size()-1) {e.addExplntnOfBnftBnftBalanceFinancialAllowedMoneyCrncy("]]");}


		 };
		 };
		/******************** explanationofbenefitfundsreserverequested ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitfundsreserverequested = explanationofbenefit.getFundsReserveRequested();

		/******************** ExplntnOfBnft_FundsReserveRqsted_Txt ********************************************************************************/
		if(explanationofbenefitfundsreserverequested.hasText()) {

			e.addExplntnOfBnftFundsReserveRqstedTxt(String.valueOf(explanationofbenefitfundsreserverequested.getText()));
		} else {
			e.addExplntnOfBnftFundsReserveRqstedTxt("NULL");
		}


		/******************** explanationofbenefitfundsreserverequestedcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitfundsreserverequestedcodinglist = explanationofbenefitfundsreserverequested.getCoding();
		for(int explanationofbenefitfundsreserverequestedcodingi = 0; explanationofbenefitfundsreserverequestedcodingi<explanationofbenefitfundsreserverequestedcodinglist.size();explanationofbenefitfundsreserverequestedcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitfundsreserverequestedcoding = explanationofbenefitfundsreserverequestedcodinglist.get(explanationofbenefitfundsreserverequestedcodingi);

		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitfundsreserverequestedcodingi == 0) {e.addExplntnOfBnftFundsReserveRqstedCdgDsply("[");}
		if(explanationofbenefitfundsreserverequestedcoding.hasDisplay()) {

			e.addExplntnOfBnftFundsReserveRqstedCdgDsply(String.valueOf(explanationofbenefitfundsreserverequestedcoding.getDisplay()));
		} else {
			e.addExplntnOfBnftFundsReserveRqstedCdgDsply("NULL");
		}

		if(explanationofbenefitfundsreserverequestedcodingi == explanationofbenefitfundsreserverequestedcodinglist.size()-1) {e.addExplntnOfBnftFundsReserveRqstedCdgDsply("]");}


		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitfundsreserverequestedcodingi == 0) {e.addExplntnOfBnftFundsReserveRqstedCdgVrsn("[");}
		if(explanationofbenefitfundsreserverequestedcoding.hasVersion()) {

			e.addExplntnOfBnftFundsReserveRqstedCdgVrsn(String.valueOf(explanationofbenefitfundsreserverequestedcoding.getVersion()));
		} else {
			e.addExplntnOfBnftFundsReserveRqstedCdgVrsn("NULL");
		}

		if(explanationofbenefitfundsreserverequestedcodingi == explanationofbenefitfundsreserverequestedcodinglist.size()-1) {e.addExplntnOfBnftFundsReserveRqstedCdgVrsn("]");}


		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitfundsreserverequestedcodingi == 0) {e.addExplntnOfBnftFundsReserveRqstedCdgCd("[");}
		if(explanationofbenefitfundsreserverequestedcoding.hasCode()) {

			e.addExplntnOfBnftFundsReserveRqstedCdgCd(String.valueOf(explanationofbenefitfundsreserverequestedcoding.getCode()));
		} else {
			e.addExplntnOfBnftFundsReserveRqstedCdgCd("NULL");
		}

		if(explanationofbenefitfundsreserverequestedcodingi == explanationofbenefitfundsreserverequestedcodinglist.size()-1) {e.addExplntnOfBnftFundsReserveRqstedCdgCd("]");}


		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitfundsreserverequestedcodingi == 0) {e.addExplntnOfBnftFundsReserveRqstedCdgUsrSltd("[");}
		if(explanationofbenefitfundsreserverequestedcoding.hasUserSelected()) {

			e.addExplntnOfBnftFundsReserveRqstedCdgUsrSltd(String.valueOf(explanationofbenefitfundsreserverequestedcoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftFundsReserveRqstedCdgUsrSltd("NULL");
		}

		if(explanationofbenefitfundsreserverequestedcodingi == explanationofbenefitfundsreserverequestedcodinglist.size()-1) {e.addExplntnOfBnftFundsReserveRqstedCdgUsrSltd("]");}


		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitfundsreserverequestedcodingi == 0) {e.addExplntnOfBnftFundsReserveRqstedCdgSys("[");}
		if(explanationofbenefitfundsreserverequestedcoding.hasSystem()) {

			e.addExplntnOfBnftFundsReserveRqstedCdgSys(String.valueOf(explanationofbenefitfundsreserverequestedcoding.getSystem()));
		} else {
			e.addExplntnOfBnftFundsReserveRqstedCdgSys("NULL");
		}

		if(explanationofbenefitfundsreserverequestedcodingi == explanationofbenefitfundsreserverequestedcodinglist.size()-1) {e.addExplntnOfBnftFundsReserveRqstedCdgSys("]");}


		 };
		/******************** ExplntnOfBnft_OriginalPrescription ********************************************************************************/
		if(explanationofbenefit.hasOriginalPrescription()) {

			if(explanationofbenefit.getOriginalPrescription().getReference() != null) {
			e.addExplntnOfBnftOriginalPrescription(explanationofbenefit.getOriginalPrescription().getReference());
			}
		} else {
			e.addExplntnOfBnftOriginalPrescription("NULL");
		}


		/******************** explanationofbenefitpreauthrefperiod ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Period> explanationofbenefitpreauthrefperiodlist = explanationofbenefit.getPreAuthRefPeriod();
		for(int explanationofbenefitpreauthrefperiodi = 0; explanationofbenefitpreauthrefperiodi<explanationofbenefitpreauthrefperiodlist.size();explanationofbenefitpreauthrefperiodi++ ) {
		org.hl7.fhir.r4.model.Period  explanationofbenefitpreauthrefperiod = explanationofbenefitpreauthrefperiodlist.get(explanationofbenefitpreauthrefperiodi);

		/******************** ExplntnOfBnft_PreAuthRefPrd_Strt ********************************************************************************/
		if(explanationofbenefitpreauthrefperiodi == 0) {e.addExplntnOfBnftPreAuthRefPrdStrt("[");}
		if(explanationofbenefitpreauthrefperiod.hasStart()) {

			e.addExplntnOfBnftPreAuthRefPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitpreauthrefperiod.getStart())+"\"");
		} else {
			e.addExplntnOfBnftPreAuthRefPrdStrt("NULL");
		}

		if(explanationofbenefitpreauthrefperiodi == explanationofbenefitpreauthrefperiodlist.size()-1) {e.addExplntnOfBnftPreAuthRefPrdStrt("]");}


		/******************** ExplntnOfBnft_PreAuthRefPrd_End ********************************************************************************/
		if(explanationofbenefitpreauthrefperiodi == 0) {e.addExplntnOfBnftPreAuthRefPrdEnd("[");}
		if(explanationofbenefitpreauthrefperiod.hasEnd()) {

			e.addExplntnOfBnftPreAuthRefPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitpreauthrefperiod.getEnd())+"\"");
		} else {
			e.addExplntnOfBnftPreAuthRefPrdEnd("NULL");
		}

		if(explanationofbenefitpreauthrefperiodi == explanationofbenefitpreauthrefperiodlist.size()-1) {e.addExplntnOfBnftPreAuthRefPrdEnd("]");}


		 };
		/******************** ExplntnOfBnft_Enterer ********************************************************************************/
		if(explanationofbenefit.hasEnterer()) {

			if(explanationofbenefit.getEnterer().getReference() != null) {
			e.addExplntnOfBnftEnterer(explanationofbenefit.getEnterer().getReference());
			}
		} else {
			e.addExplntnOfBnftEnterer("NULL");
		}


		/******************** ExplntnOfBnft_Facility ********************************************************************************/
		if(explanationofbenefit.hasFacility()) {

			if(explanationofbenefit.getFacility().getReference() != null) {
			e.addExplntnOfBnftFacility(explanationofbenefit.getFacility().getReference());
			}
		} else {
			e.addExplntnOfBnftFacility("NULL");
		}


		/******************** explanationofbenefitsupportinginfo ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.SupportingInformationComponent> explanationofbenefitsupportinginfolist = explanationofbenefit.getSupportingInfo();
		for(int explanationofbenefitsupportinginfoi = 0; explanationofbenefitsupportinginfoi<explanationofbenefitsupportinginfolist.size();explanationofbenefitsupportinginfoi++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.SupportingInformationComponent  explanationofbenefitsupportinginfo = explanationofbenefitsupportinginfolist.get(explanationofbenefitsupportinginfoi);

		/******************** explanationofbenefitsupportinginforeason ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitsupportinginforeason = explanationofbenefitsupportinginfo.getReason();

		/******************** ExplntnOfBnft_SprtingInfo_Rsn_Dsply ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoRsnDsply("[");}
		if(explanationofbenefitsupportinginforeason.hasDisplay()) {

			e.addExplntnOfBnftSprtingInfoRsnDsply(String.valueOf(explanationofbenefitsupportinginforeason.getDisplay()));
		} else {
			e.addExplntnOfBnftSprtingInfoRsnDsply("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoRsnDsply("]");}


		/******************** ExplntnOfBnft_SprtingInfo_Rsn_Vrsn ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoRsnVrsn("[");}
		if(explanationofbenefitsupportinginforeason.hasVersion()) {

			e.addExplntnOfBnftSprtingInfoRsnVrsn(String.valueOf(explanationofbenefitsupportinginforeason.getVersion()));
		} else {
			e.addExplntnOfBnftSprtingInfoRsnVrsn("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoRsnVrsn("]");}


		/******************** ExplntnOfBnft_SprtingInfo_Rsn_Cd ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoRsnCd("[");}
		if(explanationofbenefitsupportinginforeason.hasCode()) {

			e.addExplntnOfBnftSprtingInfoRsnCd(String.valueOf(explanationofbenefitsupportinginforeason.getCode()));
		} else {
			e.addExplntnOfBnftSprtingInfoRsnCd("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoRsnCd("]");}


		/******************** ExplntnOfBnft_SprtingInfo_Rsn_UsrSltd ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoRsnUsrSltd("[");}
		if(explanationofbenefitsupportinginforeason.hasUserSelected()) {

			e.addExplntnOfBnftSprtingInfoRsnUsrSltd(String.valueOf(explanationofbenefitsupportinginforeason.getUserSelected()));
		} else {
			e.addExplntnOfBnftSprtingInfoRsnUsrSltd("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoRsnUsrSltd("]");}


		/******************** ExplntnOfBnft_SprtingInfo_Rsn_Sys ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoRsnSys("[");}
		if(explanationofbenefitsupportinginforeason.hasSystem()) {

			e.addExplntnOfBnftSprtingInfoRsnSys(String.valueOf(explanationofbenefitsupportinginforeason.getSystem()));
		} else {
			e.addExplntnOfBnftSprtingInfoRsnSys("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoRsnSys("]");}


		/******************** explanationofbenefitsupportinginfocode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitsupportinginfocode = explanationofbenefitsupportinginfo.getCode();

		/******************** ExplntnOfBnft_SprtingInfo_Cd_Txt ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoCdTxt("[");}
		if(explanationofbenefitsupportinginfocode.hasText()) {

			e.addExplntnOfBnftSprtingInfoCdTxt(String.valueOf(explanationofbenefitsupportinginfocode.getText()));
		} else {
			e.addExplntnOfBnftSprtingInfoCdTxt("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoCdTxt("]");}


		/******************** explanationofbenefitsupportinginfocodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitsupportinginfocodecodinglist = explanationofbenefitsupportinginfocode.getCoding();
		for(int explanationofbenefitsupportinginfocodecodingi = 0; explanationofbenefitsupportinginfocodecodingi<explanationofbenefitsupportinginfocodecodinglist.size();explanationofbenefitsupportinginfocodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitsupportinginfocodecoding = explanationofbenefitsupportinginfocodecodinglist.get(explanationofbenefitsupportinginfocodecodingi);

		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitsupportinginfocodecodingi == 0) {e.addExplntnOfBnftSprtingInfoCdCdgDsply("[[");}
		if(explanationofbenefitsupportinginfocodecoding.hasDisplay()) {

			e.addExplntnOfBnftSprtingInfoCdCdgDsply(String.valueOf(explanationofbenefitsupportinginfocodecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftSprtingInfoCdCdgDsply("NULL");
		}

		if(explanationofbenefitsupportinginfocodecodingi == explanationofbenefitsupportinginfocodecodinglist.size()-1) {e.addExplntnOfBnftSprtingInfoCdCdgDsply("]]");}


		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitsupportinginfocodecodingi == 0) {e.addExplntnOfBnftSprtingInfoCdCdgVrsn("[[");}
		if(explanationofbenefitsupportinginfocodecoding.hasVersion()) {

			e.addExplntnOfBnftSprtingInfoCdCdgVrsn(String.valueOf(explanationofbenefitsupportinginfocodecoding.getVersion()));
		} else {
			e.addExplntnOfBnftSprtingInfoCdCdgVrsn("NULL");
		}

		if(explanationofbenefitsupportinginfocodecodingi == explanationofbenefitsupportinginfocodecodinglist.size()-1) {e.addExplntnOfBnftSprtingInfoCdCdgVrsn("]]");}


		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitsupportinginfocodecodingi == 0) {e.addExplntnOfBnftSprtingInfoCdCdgCd("[[");}
		if(explanationofbenefitsupportinginfocodecoding.hasCode()) {

			e.addExplntnOfBnftSprtingInfoCdCdgCd(String.valueOf(explanationofbenefitsupportinginfocodecoding.getCode()));
		} else {
			e.addExplntnOfBnftSprtingInfoCdCdgCd("NULL");
		}

		if(explanationofbenefitsupportinginfocodecodingi == explanationofbenefitsupportinginfocodecodinglist.size()-1) {e.addExplntnOfBnftSprtingInfoCdCdgCd("]]");}


		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitsupportinginfocodecodingi == 0) {e.addExplntnOfBnftSprtingInfoCdCdgUsrSltd("[[");}
		if(explanationofbenefitsupportinginfocodecoding.hasUserSelected()) {

			e.addExplntnOfBnftSprtingInfoCdCdgUsrSltd(String.valueOf(explanationofbenefitsupportinginfocodecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftSprtingInfoCdCdgUsrSltd("NULL");
		}

		if(explanationofbenefitsupportinginfocodecodingi == explanationofbenefitsupportinginfocodecodinglist.size()-1) {e.addExplntnOfBnftSprtingInfoCdCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitsupportinginfocodecodingi == 0) {e.addExplntnOfBnftSprtingInfoCdCdgSys("[[");}
		if(explanationofbenefitsupportinginfocodecoding.hasSystem()) {

			e.addExplntnOfBnftSprtingInfoCdCdgSys(String.valueOf(explanationofbenefitsupportinginfocodecoding.getSystem()));
		} else {
			e.addExplntnOfBnftSprtingInfoCdCdgSys("NULL");
		}

		if(explanationofbenefitsupportinginfocodecodingi == explanationofbenefitsupportinginfocodecodinglist.size()-1) {e.addExplntnOfBnftSprtingInfoCdCdgSys("]]");}


		 };
		/******************** explanationofbenefitsupportinginfocategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitsupportinginfocategory = explanationofbenefitsupportinginfo.getCategory();

		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoCtgryTxt("[");}
		if(explanationofbenefitsupportinginfocategory.hasText()) {

			e.addExplntnOfBnftSprtingInfoCtgryTxt(String.valueOf(explanationofbenefitsupportinginfocategory.getText()));
		} else {
			e.addExplntnOfBnftSprtingInfoCtgryTxt("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoCtgryTxt("]");}


		/******************** explanationofbenefitsupportinginfocategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitsupportinginfocategorycodinglist = explanationofbenefitsupportinginfocategory.getCoding();
		for(int explanationofbenefitsupportinginfocategorycodingi = 0; explanationofbenefitsupportinginfocategorycodingi<explanationofbenefitsupportinginfocategorycodinglist.size();explanationofbenefitsupportinginfocategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitsupportinginfocategorycoding = explanationofbenefitsupportinginfocategorycodinglist.get(explanationofbenefitsupportinginfocategorycodingi);

		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitsupportinginfocategorycodingi == 0) {e.addExplntnOfBnftSprtingInfoCtgryCdgDsply("[[");}
		if(explanationofbenefitsupportinginfocategorycoding.hasDisplay()) {

			e.addExplntnOfBnftSprtingInfoCtgryCdgDsply(String.valueOf(explanationofbenefitsupportinginfocategorycoding.getDisplay()));
		} else {
			e.addExplntnOfBnftSprtingInfoCtgryCdgDsply("NULL");
		}

		if(explanationofbenefitsupportinginfocategorycodingi == explanationofbenefitsupportinginfocategorycodinglist.size()-1) {e.addExplntnOfBnftSprtingInfoCtgryCdgDsply("]]");}


		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitsupportinginfocategorycodingi == 0) {e.addExplntnOfBnftSprtingInfoCtgryCdgVrsn("[[");}
		if(explanationofbenefitsupportinginfocategorycoding.hasVersion()) {

			e.addExplntnOfBnftSprtingInfoCtgryCdgVrsn(String.valueOf(explanationofbenefitsupportinginfocategorycoding.getVersion()));
		} else {
			e.addExplntnOfBnftSprtingInfoCtgryCdgVrsn("NULL");
		}

		if(explanationofbenefitsupportinginfocategorycodingi == explanationofbenefitsupportinginfocategorycodinglist.size()-1) {e.addExplntnOfBnftSprtingInfoCtgryCdgVrsn("]]");}


		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitsupportinginfocategorycodingi == 0) {e.addExplntnOfBnftSprtingInfoCtgryCdgCd("[[");}
		if(explanationofbenefitsupportinginfocategorycoding.hasCode()) {

			e.addExplntnOfBnftSprtingInfoCtgryCdgCd(String.valueOf(explanationofbenefitsupportinginfocategorycoding.getCode()));
		} else {
			e.addExplntnOfBnftSprtingInfoCtgryCdgCd("NULL");
		}

		if(explanationofbenefitsupportinginfocategorycodingi == explanationofbenefitsupportinginfocategorycodinglist.size()-1) {e.addExplntnOfBnftSprtingInfoCtgryCdgCd("]]");}


		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitsupportinginfocategorycodingi == 0) {e.addExplntnOfBnftSprtingInfoCtgryCdgUsrSltd("[[");}
		if(explanationofbenefitsupportinginfocategorycoding.hasUserSelected()) {

			e.addExplntnOfBnftSprtingInfoCtgryCdgUsrSltd(String.valueOf(explanationofbenefitsupportinginfocategorycoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftSprtingInfoCtgryCdgUsrSltd("NULL");
		}

		if(explanationofbenefitsupportinginfocategorycodingi == explanationofbenefitsupportinginfocategorycodinglist.size()-1) {e.addExplntnOfBnftSprtingInfoCtgryCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitsupportinginfocategorycodingi == 0) {e.addExplntnOfBnftSprtingInfoCtgryCdgSys("[[");}
		if(explanationofbenefitsupportinginfocategorycoding.hasSystem()) {

			e.addExplntnOfBnftSprtingInfoCtgryCdgSys(String.valueOf(explanationofbenefitsupportinginfocategorycoding.getSystem()));
		} else {
			e.addExplntnOfBnftSprtingInfoCtgryCdgSys("NULL");
		}

		if(explanationofbenefitsupportinginfocategorycodingi == explanationofbenefitsupportinginfocategorycodinglist.size()-1) {e.addExplntnOfBnftSprtingInfoCtgryCdgSys("]]");}


		 };
		/******************** ExplntnOfBnft_SprtingInfo_Sqnc ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoSqnc("[");}
		if(explanationofbenefitsupportinginfo.hasSequence()) {

			e.addExplntnOfBnftSprtingInfoSqnc(String.valueOf(explanationofbenefitsupportinginfo.getSequence()));
		} else {
			e.addExplntnOfBnftSprtingInfoSqnc("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoSqnc("]");}


		/******************** explanationofbenefitsupportinginfovalueattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment explanationofbenefitsupportinginfovalueattachment = explanationofbenefitsupportinginfo.getValueAttachment();

		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Sz ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoVlAttchmntSz("[");}
		if(explanationofbenefitsupportinginfovalueattachment.hasSize()) {

			e.addExplntnOfBnftSprtingInfoVlAttchmntSz(String.valueOf(explanationofbenefitsupportinginfovalueattachment.getSize()));
		} else {
			e.addExplntnOfBnftSprtingInfoVlAttchmntSz("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoVlAttchmntSz("]");}


		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Lnguage ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoVlAttchmntLnguage("[");}
		if(explanationofbenefitsupportinginfovalueattachment.hasLanguage()) {

			e.addExplntnOfBnftSprtingInfoVlAttchmntLnguage(String.valueOf(explanationofbenefitsupportinginfovalueattachment.getLanguage()));
		} else {
			e.addExplntnOfBnftSprtingInfoVlAttchmntLnguage("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoVlAttchmntLnguage("]");}


		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_CntntTyp ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoVlAttchmntCntntTyp("[");}
		if(explanationofbenefitsupportinginfovalueattachment.hasContentType()) {

			e.addExplntnOfBnftSprtingInfoVlAttchmntCntntTyp(String.valueOf(explanationofbenefitsupportinginfovalueattachment.getContentType()));
		} else {
			e.addExplntnOfBnftSprtingInfoVlAttchmntCntntTyp("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoVlAttchmntCntntTyp("]");}


		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Hash ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoVlAttchmntHash("[");}
		if(explanationofbenefitsupportinginfovalueattachment.hasHash()) {

			e.addExplntnOfBnftSprtingInfoVlAttchmntHash(new String(explanationofbenefitsupportinginfovalueattachment.getHash()));
		} else {
			e.addExplntnOfBnftSprtingInfoVlAttchmntHash("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoVlAttchmntHash("]");}


		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Data ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoVlAttchmntData("[");}
		if(explanationofbenefitsupportinginfovalueattachment.hasData()) {

			e.addExplntnOfBnftSprtingInfoVlAttchmntData(new String(explanationofbenefitsupportinginfovalueattachment.getData()));
		} else {
			e.addExplntnOfBnftSprtingInfoVlAttchmntData("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoVlAttchmntData("]");}


		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Creation ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoVlAttchmntCreation("[");}
		if(explanationofbenefitsupportinginfovalueattachment.hasCreation()) {

			e.addExplntnOfBnftSprtingInfoVlAttchmntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitsupportinginfovalueattachment.getCreation())+"\"");
		} else {
			e.addExplntnOfBnftSprtingInfoVlAttchmntCreation("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoVlAttchmntCreation("]");}


		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Ttl ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoVlAttchmntTtl("[");}
		if(explanationofbenefitsupportinginfovalueattachment.hasTitle()) {

			e.addExplntnOfBnftSprtingInfoVlAttchmntTtl(String.valueOf(explanationofbenefitsupportinginfovalueattachment.getTitle()));
		} else {
			e.addExplntnOfBnftSprtingInfoVlAttchmntTtl("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoVlAttchmntTtl("]");}


		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Url ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoVlAttchmntUrl("[");}
		if(explanationofbenefitsupportinginfovalueattachment.hasUrl()) {

			e.addExplntnOfBnftSprtingInfoVlAttchmntUrl(String.valueOf(explanationofbenefitsupportinginfovalueattachment.getUrl()));
		} else {
			e.addExplntnOfBnftSprtingInfoVlAttchmntUrl("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoVlAttchmntUrl("]");}


		/******************** ExplntnOfBnft_SprtingInfo_VlRfrnc ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoVlRfrnc("[");}
		if(explanationofbenefitsupportinginfo.hasValueReference()) {

			if(explanationofbenefitsupportinginfo.getValueReference().getReference() != null) {
			e.addExplntnOfBnftSprtingInfoVlRfrnc(explanationofbenefitsupportinginfo.getValueReference().getReference());
			}
		} else {
			e.addExplntnOfBnftSprtingInfoVlRfrnc("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoVlRfrnc("]");}


		/******************** explanationofbenefitsupportinginfotimingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitsupportinginfotimingperiod = explanationofbenefitsupportinginfo.getTimingPeriod();

		/******************** ExplntnOfBnft_SprtingInfo_TmgPrd_Strt ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoTmgPrdStrt("[");}
		if(explanationofbenefitsupportinginfotimingperiod.hasStart()) {

			e.addExplntnOfBnftSprtingInfoTmgPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitsupportinginfotimingperiod.getStart())+"\"");
		} else {
			e.addExplntnOfBnftSprtingInfoTmgPrdStrt("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoTmgPrdStrt("]");}


		/******************** ExplntnOfBnft_SprtingInfo_TmgPrd_End ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoTmgPrdEnd("[");}
		if(explanationofbenefitsupportinginfotimingperiod.hasEnd()) {

			e.addExplntnOfBnftSprtingInfoTmgPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitsupportinginfotimingperiod.getEnd())+"\"");
		} else {
			e.addExplntnOfBnftSprtingInfoTmgPrdEnd("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoTmgPrdEnd("]");}


		/******************** ExplntnOfBnft_SprtingInfo_TmgDtTyp ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoTmgDtTyp("[");}
		if(explanationofbenefitsupportinginfo.hasTimingDateType()) {

			e.addExplntnOfBnftSprtingInfoTmgDtTyp("\""+explanationofbenefitsupportinginfo.getTimingDateType().getValueAsString()+"\"");
		} else {
			e.addExplntnOfBnftSprtingInfoTmgDtTyp("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoTmgDtTyp("]");}


		/******************** ExplntnOfBnft_SprtingInfo_VlBooleanTyp ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoVlBooleanTyp("[");}
		if(explanationofbenefitsupportinginfo.hasValueBooleanType()) {

			e.addExplntnOfBnftSprtingInfoVlBooleanTyp("\""+explanationofbenefitsupportinginfo.getValueBooleanType().getValueAsString()+"\"");
		} else {
			e.addExplntnOfBnftSprtingInfoVlBooleanTyp("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoVlBooleanTyp("]");}


		/******************** ExplntnOfBnft_SprtingInfo_VlStrgTyp ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoVlStrgTyp("[");}
		if(explanationofbenefitsupportinginfo.hasValueStringType()) {

			e.addExplntnOfBnftSprtingInfoVlStrgTyp("\""+explanationofbenefitsupportinginfo.getValueStringType().getValueAsString()+"\"");
		} else {
			e.addExplntnOfBnftSprtingInfoVlStrgTyp("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoVlStrgTyp("]");}


		/******************** explanationofbenefitsupportinginfovaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefitsupportinginfovaluequantity = explanationofbenefitsupportinginfo.getValueQuantity();

		/******************** ExplntnOfBnft_SprtingInfo_VlQnty_Vl ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoVlQntyVl("[");}
		if(explanationofbenefitsupportinginfovaluequantity.hasValue()) {

			e.addExplntnOfBnftSprtingInfoVlQntyVl(String.valueOf(explanationofbenefitsupportinginfovaluequantity.getValue()));
		} else {
			e.addExplntnOfBnftSprtingInfoVlQntyVl("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoVlQntyVl("]");}


		/******************** explanationofbenefitsupportinginfovaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator explanationofbenefitsupportinginfovaluequantitycomparator = explanationofbenefitsupportinginfovaluequantity.getComparator();
		if(explanationofbenefitsupportinginfovaluequantitycomparator!=null) {
		if(explanationofbenefitsupportinginfoi == 0) {

		e.addExplntnOfBnftSprtingInfoVlQntyCmprtr("[");		}
			e.addExplntnOfBnftSprtingInfoVlQntyCmprtr(explanationofbenefitsupportinginfovaluequantitycomparator.toCode());
		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {

		e.addExplntnOfBnftSprtingInfoVlQntyCmprtr("]");		}

		} else {
			e.addExplntnOfBnftSprtingInfoVlQntyCmprtr("NULL");
		}

		/******************** ExplntnOfBnft_SprtingInfo_VlQnty_Cd ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoVlQntyCd("[");}
		if(explanationofbenefitsupportinginfovaluequantity.hasCode()) {

			e.addExplntnOfBnftSprtingInfoVlQntyCd(String.valueOf(explanationofbenefitsupportinginfovaluequantity.getCode()));
		} else {
			e.addExplntnOfBnftSprtingInfoVlQntyCd("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoVlQntyCd("]");}


		/******************** ExplntnOfBnft_SprtingInfo_VlQnty_Unt ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoVlQntyUnt("[");}
		if(explanationofbenefitsupportinginfovaluequantity.hasUnit()) {

			e.addExplntnOfBnftSprtingInfoVlQntyUnt(String.valueOf(explanationofbenefitsupportinginfovaluequantity.getUnit()));
		} else {
			e.addExplntnOfBnftSprtingInfoVlQntyUnt("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoVlQntyUnt("]");}


		/******************** ExplntnOfBnft_SprtingInfo_VlQnty_Sys ********************************************************************************/
		if(explanationofbenefitsupportinginfoi == 0) {e.addExplntnOfBnftSprtingInfoVlQntySys("[");}
		if(explanationofbenefitsupportinginfovaluequantity.hasSystem()) {

			e.addExplntnOfBnftSprtingInfoVlQntySys(String.valueOf(explanationofbenefitsupportinginfovaluequantity.getSystem()));
		} else {
			e.addExplntnOfBnftSprtingInfoVlQntySys("NULL");
		}

		if(explanationofbenefitsupportinginfoi == explanationofbenefitsupportinginfolist.size()-1) {e.addExplntnOfBnftSprtingInfoVlQntySys("]");}


		 };
		/******************** explanationofbenefitinsurance ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.InsuranceComponent> explanationofbenefitinsurancelist = explanationofbenefit.getInsurance();
		for(int explanationofbenefitinsurancei = 0; explanationofbenefitinsurancei<explanationofbenefitinsurancelist.size();explanationofbenefitinsurancei++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.InsuranceComponent  explanationofbenefitinsurance = explanationofbenefitinsurancelist.get(explanationofbenefitinsurancei);

		/******************** ExplntnOfBnft_Insrnc_Focal ********************************************************************************/
		if(explanationofbenefitinsurancei == 0) {e.addExplntnOfBnftInsrncFocal("[");}
		if(explanationofbenefitinsurance.hasFocal()) {

			e.addExplntnOfBnftInsrncFocal(String.valueOf(explanationofbenefitinsurance.getFocal()));
		} else {
			e.addExplntnOfBnftInsrncFocal("NULL");
		}

		if(explanationofbenefitinsurancei == explanationofbenefitinsurancelist.size()-1) {e.addExplntnOfBnftInsrncFocal("]");}


		/******************** ExplntnOfBnft_Insrnc_PreAuthRef ********************************************************************************/
		if(explanationofbenefitinsurancei == 0) {e.addExplntnOfBnftInsrncPreAuthRef("[");}
		if(explanationofbenefitinsurance.hasPreAuthRef()) {

			String  array = "[";
			for(int incr=0; incr<explanationofbenefitinsurance.getPreAuthRef().size(); incr++) {
				array = array + explanationofbenefitinsurance.getPreAuthRef().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addExplntnOfBnftInsrncPreAuthRef(array);

		} else {
			e.addExplntnOfBnftInsrncPreAuthRef("NULL");
		}

		if(explanationofbenefitinsurancei == explanationofbenefitinsurancelist.size()-1) {e.addExplntnOfBnftInsrncPreAuthRef("]");}


		/******************** ExplntnOfBnft_Insrnc_Cvg ********************************************************************************/
		if(explanationofbenefitinsurancei == 0) {e.addExplntnOfBnftInsrncCvg("[");}
		if(explanationofbenefitinsurance.hasCoverage()) {

			if(explanationofbenefitinsurance.getCoverage().getReference() != null) {
			e.addExplntnOfBnftInsrncCvg(explanationofbenefitinsurance.getCoverage().getReference());
			}
		} else {
			e.addExplntnOfBnftInsrncCvg("NULL");
		}

		if(explanationofbenefitinsurancei == explanationofbenefitinsurancelist.size()-1) {e.addExplntnOfBnftInsrncCvg("]");}


		 };
		/******************** explanationofbenefitpayee ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.PayeeComponent explanationofbenefitpayee = explanationofbenefit.getPayee();

		/******************** explanationofbenefitpayeetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitpayeetype = explanationofbenefitpayee.getType();

		/******************** ExplntnOfBnft_Payee_Typ_Txt ********************************************************************************/
		if(explanationofbenefitpayeetype.hasText()) {

			e.addExplntnOfBnftPayeeTypTxt(String.valueOf(explanationofbenefitpayeetype.getText()));
		} else {
			e.addExplntnOfBnftPayeeTypTxt("NULL");
		}


		/******************** explanationofbenefitpayeetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitpayeetypecodinglist = explanationofbenefitpayeetype.getCoding();
		for(int explanationofbenefitpayeetypecodingi = 0; explanationofbenefitpayeetypecodingi<explanationofbenefitpayeetypecodinglist.size();explanationofbenefitpayeetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitpayeetypecoding = explanationofbenefitpayeetypecodinglist.get(explanationofbenefitpayeetypecodingi);

		/******************** ExplntnOfBnft_Payee_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitpayeetypecodingi == 0) {e.addExplntnOfBnftPayeeTypCdgDsply("[");}
		if(explanationofbenefitpayeetypecoding.hasDisplay()) {

			e.addExplntnOfBnftPayeeTypCdgDsply(String.valueOf(explanationofbenefitpayeetypecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftPayeeTypCdgDsply("NULL");
		}

		if(explanationofbenefitpayeetypecodingi == explanationofbenefitpayeetypecodinglist.size()-1) {e.addExplntnOfBnftPayeeTypCdgDsply("]");}


		/******************** ExplntnOfBnft_Payee_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitpayeetypecodingi == 0) {e.addExplntnOfBnftPayeeTypCdgVrsn("[");}
		if(explanationofbenefitpayeetypecoding.hasVersion()) {

			e.addExplntnOfBnftPayeeTypCdgVrsn(String.valueOf(explanationofbenefitpayeetypecoding.getVersion()));
		} else {
			e.addExplntnOfBnftPayeeTypCdgVrsn("NULL");
		}

		if(explanationofbenefitpayeetypecodingi == explanationofbenefitpayeetypecodinglist.size()-1) {e.addExplntnOfBnftPayeeTypCdgVrsn("]");}


		/******************** ExplntnOfBnft_Payee_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitpayeetypecodingi == 0) {e.addExplntnOfBnftPayeeTypCdgCd("[");}
		if(explanationofbenefitpayeetypecoding.hasCode()) {

			e.addExplntnOfBnftPayeeTypCdgCd(String.valueOf(explanationofbenefitpayeetypecoding.getCode()));
		} else {
			e.addExplntnOfBnftPayeeTypCdgCd("NULL");
		}

		if(explanationofbenefitpayeetypecodingi == explanationofbenefitpayeetypecodinglist.size()-1) {e.addExplntnOfBnftPayeeTypCdgCd("]");}


		/******************** ExplntnOfBnft_Payee_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitpayeetypecodingi == 0) {e.addExplntnOfBnftPayeeTypCdgUsrSltd("[");}
		if(explanationofbenefitpayeetypecoding.hasUserSelected()) {

			e.addExplntnOfBnftPayeeTypCdgUsrSltd(String.valueOf(explanationofbenefitpayeetypecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftPayeeTypCdgUsrSltd("NULL");
		}

		if(explanationofbenefitpayeetypecodingi == explanationofbenefitpayeetypecodinglist.size()-1) {e.addExplntnOfBnftPayeeTypCdgUsrSltd("]");}


		/******************** ExplntnOfBnft_Payee_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitpayeetypecodingi == 0) {e.addExplntnOfBnftPayeeTypCdgSys("[");}
		if(explanationofbenefitpayeetypecoding.hasSystem()) {

			e.addExplntnOfBnftPayeeTypCdgSys(String.valueOf(explanationofbenefitpayeetypecoding.getSystem()));
		} else {
			e.addExplntnOfBnftPayeeTypCdgSys("NULL");
		}

		if(explanationofbenefitpayeetypecodingi == explanationofbenefitpayeetypecodinglist.size()-1) {e.addExplntnOfBnftPayeeTypCdgSys("]");}


		 };
		/******************** ExplntnOfBnft_Payee_Party ********************************************************************************/
		if(explanationofbenefitpayee.hasParty()) {

			if(explanationofbenefitpayee.getParty().getReference() != null) {
			e.addExplntnOfBnftPayeeParty(explanationofbenefitpayee.getParty().getReference());
			}
		} else {
			e.addExplntnOfBnftPayeeParty("NULL");
		}


		/******************** explanationofbenefitpayment ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.PaymentComponent explanationofbenefitpayment = explanationofbenefit.getPayment();

		/******************** explanationofbenefitpaymenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitpaymenttype = explanationofbenefitpayment.getType();

		/******************** ExplntnOfBnft_Pymnt_Typ_Txt ********************************************************************************/
		if(explanationofbenefitpaymenttype.hasText()) {

			e.addExplntnOfBnftPymntTypTxt(String.valueOf(explanationofbenefitpaymenttype.getText()));
		} else {
			e.addExplntnOfBnftPymntTypTxt("NULL");
		}


		/******************** explanationofbenefitpaymenttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitpaymenttypecodinglist = explanationofbenefitpaymenttype.getCoding();
		for(int explanationofbenefitpaymenttypecodingi = 0; explanationofbenefitpaymenttypecodingi<explanationofbenefitpaymenttypecodinglist.size();explanationofbenefitpaymenttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitpaymenttypecoding = explanationofbenefitpaymenttypecodinglist.get(explanationofbenefitpaymenttypecodingi);

		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitpaymenttypecodingi == 0) {e.addExplntnOfBnftPymntTypCdgDsply("[");}
		if(explanationofbenefitpaymenttypecoding.hasDisplay()) {

			e.addExplntnOfBnftPymntTypCdgDsply(String.valueOf(explanationofbenefitpaymenttypecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftPymntTypCdgDsply("NULL");
		}

		if(explanationofbenefitpaymenttypecodingi == explanationofbenefitpaymenttypecodinglist.size()-1) {e.addExplntnOfBnftPymntTypCdgDsply("]");}


		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitpaymenttypecodingi == 0) {e.addExplntnOfBnftPymntTypCdgVrsn("[");}
		if(explanationofbenefitpaymenttypecoding.hasVersion()) {

			e.addExplntnOfBnftPymntTypCdgVrsn(String.valueOf(explanationofbenefitpaymenttypecoding.getVersion()));
		} else {
			e.addExplntnOfBnftPymntTypCdgVrsn("NULL");
		}

		if(explanationofbenefitpaymenttypecodingi == explanationofbenefitpaymenttypecodinglist.size()-1) {e.addExplntnOfBnftPymntTypCdgVrsn("]");}


		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitpaymenttypecodingi == 0) {e.addExplntnOfBnftPymntTypCdgCd("[");}
		if(explanationofbenefitpaymenttypecoding.hasCode()) {

			e.addExplntnOfBnftPymntTypCdgCd(String.valueOf(explanationofbenefitpaymenttypecoding.getCode()));
		} else {
			e.addExplntnOfBnftPymntTypCdgCd("NULL");
		}

		if(explanationofbenefitpaymenttypecodingi == explanationofbenefitpaymenttypecodinglist.size()-1) {e.addExplntnOfBnftPymntTypCdgCd("]");}


		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitpaymenttypecodingi == 0) {e.addExplntnOfBnftPymntTypCdgUsrSltd("[");}
		if(explanationofbenefitpaymenttypecoding.hasUserSelected()) {

			e.addExplntnOfBnftPymntTypCdgUsrSltd(String.valueOf(explanationofbenefitpaymenttypecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftPymntTypCdgUsrSltd("NULL");
		}

		if(explanationofbenefitpaymenttypecodingi == explanationofbenefitpaymenttypecodinglist.size()-1) {e.addExplntnOfBnftPymntTypCdgUsrSltd("]");}


		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitpaymenttypecodingi == 0) {e.addExplntnOfBnftPymntTypCdgSys("[");}
		if(explanationofbenefitpaymenttypecoding.hasSystem()) {

			e.addExplntnOfBnftPymntTypCdgSys(String.valueOf(explanationofbenefitpaymenttypecoding.getSystem()));
		} else {
			e.addExplntnOfBnftPymntTypCdgSys("NULL");
		}

		if(explanationofbenefitpaymenttypecodingi == explanationofbenefitpaymenttypecodinglist.size()-1) {e.addExplntnOfBnftPymntTypCdgSys("]");}


		 };
		/******************** ExplntnOfBnft_Pymnt_Dt ********************************************************************************/
		if(explanationofbenefitpayment.hasDate()) {

			e.addExplntnOfBnftPymntDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitpayment.getDate())+"\"");
		} else {
			e.addExplntnOfBnftPymntDt("NULL");
		}


		/******************** explanationofbenefitpaymentidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier explanationofbenefitpaymentidentifier = explanationofbenefitpayment.getIdentifier();

		/******************** ExplntnOfBnft_Pymnt_Id_Vl ********************************************************************************/
		if(explanationofbenefitpaymentidentifier.hasValue()) {

			e.addExplntnOfBnftPymntIdVl(String.valueOf(explanationofbenefitpaymentidentifier.getValue()));
		} else {
			e.addExplntnOfBnftPymntIdVl("NULL");
		}


		/******************** explanationofbenefitpaymentidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitpaymentidentifiertype = explanationofbenefitpaymentidentifier.getType();

		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Txt ********************************************************************************/
		if(explanationofbenefitpaymentidentifiertype.hasText()) {

			e.addExplntnOfBnftPymntIdTypTxt(String.valueOf(explanationofbenefitpaymentidentifiertype.getText()));
		} else {
			e.addExplntnOfBnftPymntIdTypTxt("NULL");
		}


		/******************** explanationofbenefitpaymentidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitpaymentidentifiertypecodinglist = explanationofbenefitpaymentidentifiertype.getCoding();
		for(int explanationofbenefitpaymentidentifiertypecodingi = 0; explanationofbenefitpaymentidentifiertypecodingi<explanationofbenefitpaymentidentifiertypecodinglist.size();explanationofbenefitpaymentidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitpaymentidentifiertypecoding = explanationofbenefitpaymentidentifiertypecodinglist.get(explanationofbenefitpaymentidentifiertypecodingi);

		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitpaymentidentifiertypecodingi == 0) {e.addExplntnOfBnftPymntIdTypCdgDsply("[");}
		if(explanationofbenefitpaymentidentifiertypecoding.hasDisplay()) {

			e.addExplntnOfBnftPymntIdTypCdgDsply(String.valueOf(explanationofbenefitpaymentidentifiertypecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftPymntIdTypCdgDsply("NULL");
		}

		if(explanationofbenefitpaymentidentifiertypecodingi == explanationofbenefitpaymentidentifiertypecodinglist.size()-1) {e.addExplntnOfBnftPymntIdTypCdgDsply("]");}


		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitpaymentidentifiertypecodingi == 0) {e.addExplntnOfBnftPymntIdTypCdgVrsn("[");}
		if(explanationofbenefitpaymentidentifiertypecoding.hasVersion()) {

			e.addExplntnOfBnftPymntIdTypCdgVrsn(String.valueOf(explanationofbenefitpaymentidentifiertypecoding.getVersion()));
		} else {
			e.addExplntnOfBnftPymntIdTypCdgVrsn("NULL");
		}

		if(explanationofbenefitpaymentidentifiertypecodingi == explanationofbenefitpaymentidentifiertypecodinglist.size()-1) {e.addExplntnOfBnftPymntIdTypCdgVrsn("]");}


		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitpaymentidentifiertypecodingi == 0) {e.addExplntnOfBnftPymntIdTypCdgCd("[");}
		if(explanationofbenefitpaymentidentifiertypecoding.hasCode()) {

			e.addExplntnOfBnftPymntIdTypCdgCd(String.valueOf(explanationofbenefitpaymentidentifiertypecoding.getCode()));
		} else {
			e.addExplntnOfBnftPymntIdTypCdgCd("NULL");
		}

		if(explanationofbenefitpaymentidentifiertypecodingi == explanationofbenefitpaymentidentifiertypecodinglist.size()-1) {e.addExplntnOfBnftPymntIdTypCdgCd("]");}


		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitpaymentidentifiertypecodingi == 0) {e.addExplntnOfBnftPymntIdTypCdgUsrSltd("[");}
		if(explanationofbenefitpaymentidentifiertypecoding.hasUserSelected()) {

			e.addExplntnOfBnftPymntIdTypCdgUsrSltd(String.valueOf(explanationofbenefitpaymentidentifiertypecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftPymntIdTypCdgUsrSltd("NULL");
		}

		if(explanationofbenefitpaymentidentifiertypecodingi == explanationofbenefitpaymentidentifiertypecodinglist.size()-1) {e.addExplntnOfBnftPymntIdTypCdgUsrSltd("]");}


		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitpaymentidentifiertypecodingi == 0) {e.addExplntnOfBnftPymntIdTypCdgSys("[");}
		if(explanationofbenefitpaymentidentifiertypecoding.hasSystem()) {

			e.addExplntnOfBnftPymntIdTypCdgSys(String.valueOf(explanationofbenefitpaymentidentifiertypecoding.getSystem()));
		} else {
			e.addExplntnOfBnftPymntIdTypCdgSys("NULL");
		}

		if(explanationofbenefitpaymentidentifiertypecodingi == explanationofbenefitpaymentidentifiertypecodinglist.size()-1) {e.addExplntnOfBnftPymntIdTypCdgSys("]");}


		 };
		/******************** explanationofbenefitpaymentidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitpaymentidentifierperiod = explanationofbenefitpaymentidentifier.getPeriod();

		/******************** ExplntnOfBnft_Pymnt_Id_Prd_Strt ********************************************************************************/
		if(explanationofbenefitpaymentidentifierperiod.hasStart()) {

			e.addExplntnOfBnftPymntIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitpaymentidentifierperiod.getStart())+"\"");
		} else {
			e.addExplntnOfBnftPymntIdPrdStrt("NULL");
		}


		/******************** ExplntnOfBnft_Pymnt_Id_Prd_End ********************************************************************************/
		if(explanationofbenefitpaymentidentifierperiod.hasEnd()) {

			e.addExplntnOfBnftPymntIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(explanationofbenefitpaymentidentifierperiod.getEnd())+"\"");
		} else {
			e.addExplntnOfBnftPymntIdPrdEnd("NULL");
		}


		/******************** explanationofbenefitpaymentidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse explanationofbenefitpaymentidentifieruse = explanationofbenefitpaymentidentifier.getUse();
		if(explanationofbenefitpaymentidentifieruse!=null) {
			e.addExplntnOfBnftPymntIdUse(explanationofbenefitpaymentidentifieruse.toCode());
		} else {
			e.addExplntnOfBnftPymntIdUse("NULL");
		}

		/******************** ExplntnOfBnft_Pymnt_Id_Assigner ********************************************************************************/
		if(explanationofbenefitpaymentidentifier.hasAssigner()) {

			if(explanationofbenefitpaymentidentifier.getAssigner().getReference() != null) {
			e.addExplntnOfBnftPymntIdAssigner(explanationofbenefitpaymentidentifier.getAssigner().getReference());
			}
		} else {
			e.addExplntnOfBnftPymntIdAssigner("NULL");
		}


		/******************** ExplntnOfBnft_Pymnt_Id_Sys ********************************************************************************/
		if(explanationofbenefitpaymentidentifier.hasSystem()) {

			e.addExplntnOfBnftPymntIdSys(String.valueOf(explanationofbenefitpaymentidentifier.getSystem()));
		} else {
			e.addExplntnOfBnftPymntIdSys("NULL");
		}


		/******************** explanationofbenefitpaymentadjustmentreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitpaymentadjustmentreason = explanationofbenefitpayment.getAdjustmentReason();

		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Txt ********************************************************************************/
		if(explanationofbenefitpaymentadjustmentreason.hasText()) {

			e.addExplntnOfBnftPymntAdjustmentRsnTxt(String.valueOf(explanationofbenefitpaymentadjustmentreason.getText()));
		} else {
			e.addExplntnOfBnftPymntAdjustmentRsnTxt("NULL");
		}


		/******************** explanationofbenefitpaymentadjustmentreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitpaymentadjustmentreasoncodinglist = explanationofbenefitpaymentadjustmentreason.getCoding();
		for(int explanationofbenefitpaymentadjustmentreasoncodingi = 0; explanationofbenefitpaymentadjustmentreasoncodingi<explanationofbenefitpaymentadjustmentreasoncodinglist.size();explanationofbenefitpaymentadjustmentreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitpaymentadjustmentreasoncoding = explanationofbenefitpaymentadjustmentreasoncodinglist.get(explanationofbenefitpaymentadjustmentreasoncodingi);

		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitpaymentadjustmentreasoncodingi == 0) {e.addExplntnOfBnftPymntAdjustmentRsnCdgDsply("[");}
		if(explanationofbenefitpaymentadjustmentreasoncoding.hasDisplay()) {

			e.addExplntnOfBnftPymntAdjustmentRsnCdgDsply(String.valueOf(explanationofbenefitpaymentadjustmentreasoncoding.getDisplay()));
		} else {
			e.addExplntnOfBnftPymntAdjustmentRsnCdgDsply("NULL");
		}

		if(explanationofbenefitpaymentadjustmentreasoncodingi == explanationofbenefitpaymentadjustmentreasoncodinglist.size()-1) {e.addExplntnOfBnftPymntAdjustmentRsnCdgDsply("]");}


		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitpaymentadjustmentreasoncodingi == 0) {e.addExplntnOfBnftPymntAdjustmentRsnCdgVrsn("[");}
		if(explanationofbenefitpaymentadjustmentreasoncoding.hasVersion()) {

			e.addExplntnOfBnftPymntAdjustmentRsnCdgVrsn(String.valueOf(explanationofbenefitpaymentadjustmentreasoncoding.getVersion()));
		} else {
			e.addExplntnOfBnftPymntAdjustmentRsnCdgVrsn("NULL");
		}

		if(explanationofbenefitpaymentadjustmentreasoncodingi == explanationofbenefitpaymentadjustmentreasoncodinglist.size()-1) {e.addExplntnOfBnftPymntAdjustmentRsnCdgVrsn("]");}


		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitpaymentadjustmentreasoncodingi == 0) {e.addExplntnOfBnftPymntAdjustmentRsnCdgCd("[");}
		if(explanationofbenefitpaymentadjustmentreasoncoding.hasCode()) {

			e.addExplntnOfBnftPymntAdjustmentRsnCdgCd(String.valueOf(explanationofbenefitpaymentadjustmentreasoncoding.getCode()));
		} else {
			e.addExplntnOfBnftPymntAdjustmentRsnCdgCd("NULL");
		}

		if(explanationofbenefitpaymentadjustmentreasoncodingi == explanationofbenefitpaymentadjustmentreasoncodinglist.size()-1) {e.addExplntnOfBnftPymntAdjustmentRsnCdgCd("]");}


		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitpaymentadjustmentreasoncodingi == 0) {e.addExplntnOfBnftPymntAdjustmentRsnCdgUsrSltd("[");}
		if(explanationofbenefitpaymentadjustmentreasoncoding.hasUserSelected()) {

			e.addExplntnOfBnftPymntAdjustmentRsnCdgUsrSltd(String.valueOf(explanationofbenefitpaymentadjustmentreasoncoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftPymntAdjustmentRsnCdgUsrSltd("NULL");
		}

		if(explanationofbenefitpaymentadjustmentreasoncodingi == explanationofbenefitpaymentadjustmentreasoncodinglist.size()-1) {e.addExplntnOfBnftPymntAdjustmentRsnCdgUsrSltd("]");}


		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitpaymentadjustmentreasoncodingi == 0) {e.addExplntnOfBnftPymntAdjustmentRsnCdgSys("[");}
		if(explanationofbenefitpaymentadjustmentreasoncoding.hasSystem()) {

			e.addExplntnOfBnftPymntAdjustmentRsnCdgSys(String.valueOf(explanationofbenefitpaymentadjustmentreasoncoding.getSystem()));
		} else {
			e.addExplntnOfBnftPymntAdjustmentRsnCdgSys("NULL");
		}

		if(explanationofbenefitpaymentadjustmentreasoncodingi == explanationofbenefitpaymentadjustmentreasoncodinglist.size()-1) {e.addExplntnOfBnftPymntAdjustmentRsnCdgSys("]");}


		 };
		/******************** explanationofbenefitpaymentamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitpaymentamount = explanationofbenefitpayment.getAmount();

		/******************** ExplntnOfBnft_Pymnt_Amnt_Vl ********************************************************************************/
		if(explanationofbenefitpaymentamount.hasValue()) {

			e.addExplntnOfBnftPymntAmntVl(String.valueOf(explanationofbenefitpaymentamount.getValue()));
		} else {
			e.addExplntnOfBnftPymntAmntVl("NULL");
		}


		/******************** ExplntnOfBnft_Pymnt_Amnt_Crncy ********************************************************************************/
		if(explanationofbenefitpaymentamount.hasCurrency()) {

			e.addExplntnOfBnftPymntAmntCrncy(String.valueOf(explanationofbenefitpaymentamount.getCurrency()));
		} else {
			e.addExplntnOfBnftPymntAmntCrncy("NULL");
		}


		/******************** explanationofbenefitpaymentadjustment ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitpaymentadjustment = explanationofbenefitpayment.getAdjustment();

		/******************** ExplntnOfBnft_Pymnt_Adjustment_Vl ********************************************************************************/
		if(explanationofbenefitpaymentadjustment.hasValue()) {

			e.addExplntnOfBnftPymntAdjustmentVl(String.valueOf(explanationofbenefitpaymentadjustment.getValue()));
		} else {
			e.addExplntnOfBnftPymntAdjustmentVl("NULL");
		}


		/******************** ExplntnOfBnft_Pymnt_Adjustment_Crncy ********************************************************************************/
		if(explanationofbenefitpaymentadjustment.hasCurrency()) {

			e.addExplntnOfBnftPymntAdjustmentCrncy(String.valueOf(explanationofbenefitpaymentadjustment.getCurrency()));
		} else {
			e.addExplntnOfBnftPymntAdjustmentCrncy("NULL");
		}


		/******************** ExplntnOfBnft_Pnt ********************************************************************************/
		if(explanationofbenefit.hasPatient()) {

			if(explanationofbenefit.getPatient().getReference() != null) {
			e.addExplntnOfBnftPnt(explanationofbenefit.getPatient().getReference());
			}
		} else {
			e.addExplntnOfBnftPnt("NULL");
		}


		/******************** ExplntnOfBnft_Insurer ********************************************************************************/
		if(explanationofbenefit.hasInsurer()) {

			if(explanationofbenefit.getInsurer().getReference() != null) {
			e.addExplntnOfBnftInsurer(explanationofbenefit.getInsurer().getReference());
			}
		} else {
			e.addExplntnOfBnftInsurer("NULL");
		}


		/******************** explanationofbenefitsubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitsubtype = explanationofbenefit.getSubType();

		/******************** ExplntnOfBnft_SubTyp_Txt ********************************************************************************/
		if(explanationofbenefitsubtype.hasText()) {

			e.addExplntnOfBnftSubTypTxt(String.valueOf(explanationofbenefitsubtype.getText()));
		} else {
			e.addExplntnOfBnftSubTypTxt("NULL");
		}


		/******************** explanationofbenefitsubtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitsubtypecodinglist = explanationofbenefitsubtype.getCoding();
		for(int explanationofbenefitsubtypecodingi = 0; explanationofbenefitsubtypecodingi<explanationofbenefitsubtypecodinglist.size();explanationofbenefitsubtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitsubtypecoding = explanationofbenefitsubtypecodinglist.get(explanationofbenefitsubtypecodingi);

		/******************** ExplntnOfBnft_SubTyp_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitsubtypecodingi == 0) {e.addExplntnOfBnftSubTypCdgDsply("[");}
		if(explanationofbenefitsubtypecoding.hasDisplay()) {

			e.addExplntnOfBnftSubTypCdgDsply(String.valueOf(explanationofbenefitsubtypecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftSubTypCdgDsply("NULL");
		}

		if(explanationofbenefitsubtypecodingi == explanationofbenefitsubtypecodinglist.size()-1) {e.addExplntnOfBnftSubTypCdgDsply("]");}


		/******************** ExplntnOfBnft_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitsubtypecodingi == 0) {e.addExplntnOfBnftSubTypCdgVrsn("[");}
		if(explanationofbenefitsubtypecoding.hasVersion()) {

			e.addExplntnOfBnftSubTypCdgVrsn(String.valueOf(explanationofbenefitsubtypecoding.getVersion()));
		} else {
			e.addExplntnOfBnftSubTypCdgVrsn("NULL");
		}

		if(explanationofbenefitsubtypecodingi == explanationofbenefitsubtypecodinglist.size()-1) {e.addExplntnOfBnftSubTypCdgVrsn("]");}


		/******************** ExplntnOfBnft_SubTyp_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitsubtypecodingi == 0) {e.addExplntnOfBnftSubTypCdgCd("[");}
		if(explanationofbenefitsubtypecoding.hasCode()) {

			e.addExplntnOfBnftSubTypCdgCd(String.valueOf(explanationofbenefitsubtypecoding.getCode()));
		} else {
			e.addExplntnOfBnftSubTypCdgCd("NULL");
		}

		if(explanationofbenefitsubtypecodingi == explanationofbenefitsubtypecodinglist.size()-1) {e.addExplntnOfBnftSubTypCdgCd("]");}


		/******************** ExplntnOfBnft_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitsubtypecodingi == 0) {e.addExplntnOfBnftSubTypCdgUsrSltd("[");}
		if(explanationofbenefitsubtypecoding.hasUserSelected()) {

			e.addExplntnOfBnftSubTypCdgUsrSltd(String.valueOf(explanationofbenefitsubtypecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftSubTypCdgUsrSltd("NULL");
		}

		if(explanationofbenefitsubtypecodingi == explanationofbenefitsubtypecodinglist.size()-1) {e.addExplntnOfBnftSubTypCdgUsrSltd("]");}


		/******************** ExplntnOfBnft_SubTyp_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitsubtypecodingi == 0) {e.addExplntnOfBnftSubTypCdgSys("[");}
		if(explanationofbenefitsubtypecoding.hasSystem()) {

			e.addExplntnOfBnftSubTypCdgSys(String.valueOf(explanationofbenefitsubtypecoding.getSystem()));
		} else {
			e.addExplntnOfBnftSubTypCdgSys("NULL");
		}

		if(explanationofbenefitsubtypecodingi == explanationofbenefitsubtypecodinglist.size()-1) {e.addExplntnOfBnftSubTypCdgSys("]");}


		 };
		/******************** explanationofbenefitdiagnosis ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ExplanationOfBenefit.DiagnosisComponent> explanationofbenefitdiagnosislist = explanationofbenefit.getDiagnosis();
		for(int explanationofbenefitdiagnosisi = 0; explanationofbenefitdiagnosisi<explanationofbenefitdiagnosislist.size();explanationofbenefitdiagnosisi++ ) {
		org.hl7.fhir.r4.model.ExplanationOfBenefit.DiagnosisComponent  explanationofbenefitdiagnosis = explanationofbenefitdiagnosislist.get(explanationofbenefitdiagnosisi);

		/******************** explanationofbenefitdiagnosistype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> explanationofbenefitdiagnosistypelist = explanationofbenefitdiagnosis.getType();
		for(int explanationofbenefitdiagnosistypei = 0; explanationofbenefitdiagnosistypei<explanationofbenefitdiagnosistypelist.size();explanationofbenefitdiagnosistypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  explanationofbenefitdiagnosistype = explanationofbenefitdiagnosistypelist.get(explanationofbenefitdiagnosistypei);

		/******************** ExplntnOfBnft_Dgnsis_Typ_Txt ********************************************************************************/
		if(explanationofbenefitdiagnosistypei == 0) {e.addExplntnOfBnftDgnsisTypTxt("[[");}
		if(explanationofbenefitdiagnosistype.hasText()) {

			e.addExplntnOfBnftDgnsisTypTxt(String.valueOf(explanationofbenefitdiagnosistype.getText()));
		} else {
			e.addExplntnOfBnftDgnsisTypTxt("NULL");
		}

		if(explanationofbenefitdiagnosistypei == explanationofbenefitdiagnosistypelist.size()-1) {e.addExplntnOfBnftDgnsisTypTxt("]]");}


		/******************** explanationofbenefitdiagnosistypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitdiagnosistypecodinglist = explanationofbenefitdiagnosistype.getCoding();
		for(int explanationofbenefitdiagnosistypecodingi = 0; explanationofbenefitdiagnosistypecodingi<explanationofbenefitdiagnosistypecodinglist.size();explanationofbenefitdiagnosistypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitdiagnosistypecoding = explanationofbenefitdiagnosistypecodinglist.get(explanationofbenefitdiagnosistypecodingi);

		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitdiagnosistypecodingi == 0) {e.addExplntnOfBnftDgnsisTypCdgDsply("[[[");}
		if(explanationofbenefitdiagnosistypecoding.hasDisplay()) {

			e.addExplntnOfBnftDgnsisTypCdgDsply(String.valueOf(explanationofbenefitdiagnosistypecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftDgnsisTypCdgDsply("NULL");
		}

		if(explanationofbenefitdiagnosistypecodingi == explanationofbenefitdiagnosistypecodinglist.size()-1) {e.addExplntnOfBnftDgnsisTypCdgDsply("]]]");}


		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitdiagnosistypecodingi == 0) {e.addExplntnOfBnftDgnsisTypCdgVrsn("[[[");}
		if(explanationofbenefitdiagnosistypecoding.hasVersion()) {

			e.addExplntnOfBnftDgnsisTypCdgVrsn(String.valueOf(explanationofbenefitdiagnosistypecoding.getVersion()));
		} else {
			e.addExplntnOfBnftDgnsisTypCdgVrsn("NULL");
		}

		if(explanationofbenefitdiagnosistypecodingi == explanationofbenefitdiagnosistypecodinglist.size()-1) {e.addExplntnOfBnftDgnsisTypCdgVrsn("]]]");}


		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitdiagnosistypecodingi == 0) {e.addExplntnOfBnftDgnsisTypCdgCd("[[[");}
		if(explanationofbenefitdiagnosistypecoding.hasCode()) {

			e.addExplntnOfBnftDgnsisTypCdgCd(String.valueOf(explanationofbenefitdiagnosistypecoding.getCode()));
		} else {
			e.addExplntnOfBnftDgnsisTypCdgCd("NULL");
		}

		if(explanationofbenefitdiagnosistypecodingi == explanationofbenefitdiagnosistypecodinglist.size()-1) {e.addExplntnOfBnftDgnsisTypCdgCd("]]]");}


		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitdiagnosistypecodingi == 0) {e.addExplntnOfBnftDgnsisTypCdgUsrSltd("[[[");}
		if(explanationofbenefitdiagnosistypecoding.hasUserSelected()) {

			e.addExplntnOfBnftDgnsisTypCdgUsrSltd(String.valueOf(explanationofbenefitdiagnosistypecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftDgnsisTypCdgUsrSltd("NULL");
		}

		if(explanationofbenefitdiagnosistypecodingi == explanationofbenefitdiagnosistypecodinglist.size()-1) {e.addExplntnOfBnftDgnsisTypCdgUsrSltd("]]]");}


		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitdiagnosistypecodingi == 0) {e.addExplntnOfBnftDgnsisTypCdgSys("[[[");}
		if(explanationofbenefitdiagnosistypecoding.hasSystem()) {

			e.addExplntnOfBnftDgnsisTypCdgSys(String.valueOf(explanationofbenefitdiagnosistypecoding.getSystem()));
		} else {
			e.addExplntnOfBnftDgnsisTypCdgSys("NULL");
		}

		if(explanationofbenefitdiagnosistypecodingi == explanationofbenefitdiagnosistypecodinglist.size()-1) {e.addExplntnOfBnftDgnsisTypCdgSys("]]]");}


		 };
		 };
		/******************** ExplntnOfBnft_Dgnsis_Sqnc ********************************************************************************/
		if(explanationofbenefitdiagnosis.hasSequence()) {

			e.addExplntnOfBnftDgnsisSqnc(String.valueOf(explanationofbenefitdiagnosis.getSequence()));
		} else {
			e.addExplntnOfBnftDgnsisSqnc("NULL");
		}


		/******************** explanationofbenefitdiagnosisdiagnosiscodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitdiagnosisdiagnosiscodeableconcept = explanationofbenefitdiagnosis.getDiagnosisCodeableConcept();

		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Txt ********************************************************************************/
		if(explanationofbenefitdiagnosisdiagnosiscodeableconcept.hasText()) {

			e.addExplntnOfBnftDgnsisDgnsisCdbleCncptTxt(String.valueOf(explanationofbenefitdiagnosisdiagnosiscodeableconcept.getText()));
		} else {
			e.addExplntnOfBnftDgnsisDgnsisCdbleCncptTxt("NULL");
		}


		/******************** explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitdiagnosisdiagnosiscodeableconceptcodinglist = explanationofbenefitdiagnosisdiagnosiscodeableconcept.getCoding();
		for(int explanationofbenefitdiagnosisdiagnosiscodeableconceptcodingi = 0; explanationofbenefitdiagnosisdiagnosiscodeableconceptcodingi<explanationofbenefitdiagnosisdiagnosiscodeableconceptcodinglist.size();explanationofbenefitdiagnosisdiagnosiscodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding = explanationofbenefitdiagnosisdiagnosiscodeableconceptcodinglist.get(explanationofbenefitdiagnosisdiagnosiscodeableconceptcodingi);

		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcodingi == 0) {e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgDsply("[[");}
		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.hasDisplay()) {

			e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgDsply(String.valueOf(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.getDisplay()));
		} else {
			e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgDsply("NULL");
		}

		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcodingi == explanationofbenefitdiagnosisdiagnosiscodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgDsply("]]");}


		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcodingi == 0) {e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgVrsn("[[");}
		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.hasVersion()) {

			e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgVrsn(String.valueOf(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.getVersion()));
		} else {
			e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgVrsn("NULL");
		}

		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcodingi == explanationofbenefitdiagnosisdiagnosiscodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgVrsn("]]");}


		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcodingi == 0) {e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgCd("[[");}
		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.hasCode()) {

			e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgCd(String.valueOf(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.getCode()));
		} else {
			e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgCd("NULL");
		}

		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcodingi == explanationofbenefitdiagnosisdiagnosiscodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgCd("]]");}


		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcodingi == 0) {e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgUsrSltd("[[");}
		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.hasUserSelected()) {

			e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgUsrSltd(String.valueOf(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgUsrSltd("NULL");
		}

		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcodingi == explanationofbenefitdiagnosisdiagnosiscodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcodingi == 0) {e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgSys("[[");}
		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.hasSystem()) {

			e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgSys(String.valueOf(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.getSystem()));
		} else {
			e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgSys("NULL");
		}

		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcodingi == explanationofbenefitdiagnosisdiagnosiscodeableconceptcodinglist.size()-1) {e.addExplntnOfBnftDgnsisDgnsisCdbleCncptCdgSys("]]");}


		 };
		/******************** explanationofbenefitdiagnosispackagecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitdiagnosispackagecode = explanationofbenefitdiagnosis.getPackageCode();

		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Txt ********************************************************************************/
		if(explanationofbenefitdiagnosispackagecode.hasText()) {

			e.addExplntnOfBnftDgnsisPckgCdTxt(String.valueOf(explanationofbenefitdiagnosispackagecode.getText()));
		} else {
			e.addExplntnOfBnftDgnsisPckgCdTxt("NULL");
		}


		/******************** explanationofbenefitdiagnosispackagecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitdiagnosispackagecodecodinglist = explanationofbenefitdiagnosispackagecode.getCoding();
		for(int explanationofbenefitdiagnosispackagecodecodingi = 0; explanationofbenefitdiagnosispackagecodecodingi<explanationofbenefitdiagnosispackagecodecodinglist.size();explanationofbenefitdiagnosispackagecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitdiagnosispackagecodecoding = explanationofbenefitdiagnosispackagecodecodinglist.get(explanationofbenefitdiagnosispackagecodecodingi);

		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitdiagnosispackagecodecodingi == 0) {e.addExplntnOfBnftDgnsisPckgCdCdgDsply("[[");}
		if(explanationofbenefitdiagnosispackagecodecoding.hasDisplay()) {

			e.addExplntnOfBnftDgnsisPckgCdCdgDsply(String.valueOf(explanationofbenefitdiagnosispackagecodecoding.getDisplay()));
		} else {
			e.addExplntnOfBnftDgnsisPckgCdCdgDsply("NULL");
		}

		if(explanationofbenefitdiagnosispackagecodecodingi == explanationofbenefitdiagnosispackagecodecodinglist.size()-1) {e.addExplntnOfBnftDgnsisPckgCdCdgDsply("]]");}


		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitdiagnosispackagecodecodingi == 0) {e.addExplntnOfBnftDgnsisPckgCdCdgVrsn("[[");}
		if(explanationofbenefitdiagnosispackagecodecoding.hasVersion()) {

			e.addExplntnOfBnftDgnsisPckgCdCdgVrsn(String.valueOf(explanationofbenefitdiagnosispackagecodecoding.getVersion()));
		} else {
			e.addExplntnOfBnftDgnsisPckgCdCdgVrsn("NULL");
		}

		if(explanationofbenefitdiagnosispackagecodecodingi == explanationofbenefitdiagnosispackagecodecodinglist.size()-1) {e.addExplntnOfBnftDgnsisPckgCdCdgVrsn("]]");}


		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitdiagnosispackagecodecodingi == 0) {e.addExplntnOfBnftDgnsisPckgCdCdgCd("[[");}
		if(explanationofbenefitdiagnosispackagecodecoding.hasCode()) {

			e.addExplntnOfBnftDgnsisPckgCdCdgCd(String.valueOf(explanationofbenefitdiagnosispackagecodecoding.getCode()));
		} else {
			e.addExplntnOfBnftDgnsisPckgCdCdgCd("NULL");
		}

		if(explanationofbenefitdiagnosispackagecodecodingi == explanationofbenefitdiagnosispackagecodecodinglist.size()-1) {e.addExplntnOfBnftDgnsisPckgCdCdgCd("]]");}


		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitdiagnosispackagecodecodingi == 0) {e.addExplntnOfBnftDgnsisPckgCdCdgUsrSltd("[[");}
		if(explanationofbenefitdiagnosispackagecodecoding.hasUserSelected()) {

			e.addExplntnOfBnftDgnsisPckgCdCdgUsrSltd(String.valueOf(explanationofbenefitdiagnosispackagecodecoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftDgnsisPckgCdCdgUsrSltd("NULL");
		}

		if(explanationofbenefitdiagnosispackagecodecodingi == explanationofbenefitdiagnosispackagecodecodinglist.size()-1) {e.addExplntnOfBnftDgnsisPckgCdCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitdiagnosispackagecodecodingi == 0) {e.addExplntnOfBnftDgnsisPckgCdCdgSys("[[");}
		if(explanationofbenefitdiagnosispackagecodecoding.hasSystem()) {

			e.addExplntnOfBnftDgnsisPckgCdCdgSys(String.valueOf(explanationofbenefitdiagnosispackagecodecoding.getSystem()));
		} else {
			e.addExplntnOfBnftDgnsisPckgCdCdgSys("NULL");
		}

		if(explanationofbenefitdiagnosispackagecodecodingi == explanationofbenefitdiagnosispackagecodecodinglist.size()-1) {e.addExplntnOfBnftDgnsisPckgCdCdgSys("]]");}


		 };
		/******************** explanationofbenefitdiagnosisonadmission ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitdiagnosisonadmission = explanationofbenefitdiagnosis.getOnAdmission();

		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Txt ********************************************************************************/
		if(explanationofbenefitdiagnosisonadmission.hasText()) {

			e.addExplntnOfBnftDgnsisOnAdmissionTxt(String.valueOf(explanationofbenefitdiagnosisonadmission.getText()));
		} else {
			e.addExplntnOfBnftDgnsisOnAdmissionTxt("NULL");
		}


		/******************** explanationofbenefitdiagnosisonadmissioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> explanationofbenefitdiagnosisonadmissioncodinglist = explanationofbenefitdiagnosisonadmission.getCoding();
		for(int explanationofbenefitdiagnosisonadmissioncodingi = 0; explanationofbenefitdiagnosisonadmissioncodingi<explanationofbenefitdiagnosisonadmissioncodinglist.size();explanationofbenefitdiagnosisonadmissioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  explanationofbenefitdiagnosisonadmissioncoding = explanationofbenefitdiagnosisonadmissioncodinglist.get(explanationofbenefitdiagnosisonadmissioncodingi);

		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitdiagnosisonadmissioncodingi == 0) {e.addExplntnOfBnftDgnsisOnAdmissionCdgDsply("[[");}
		if(explanationofbenefitdiagnosisonadmissioncoding.hasDisplay()) {

			e.addExplntnOfBnftDgnsisOnAdmissionCdgDsply(String.valueOf(explanationofbenefitdiagnosisonadmissioncoding.getDisplay()));
		} else {
			e.addExplntnOfBnftDgnsisOnAdmissionCdgDsply("NULL");
		}

		if(explanationofbenefitdiagnosisonadmissioncodingi == explanationofbenefitdiagnosisonadmissioncodinglist.size()-1) {e.addExplntnOfBnftDgnsisOnAdmissionCdgDsply("]]");}


		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitdiagnosisonadmissioncodingi == 0) {e.addExplntnOfBnftDgnsisOnAdmissionCdgVrsn("[[");}
		if(explanationofbenefitdiagnosisonadmissioncoding.hasVersion()) {

			e.addExplntnOfBnftDgnsisOnAdmissionCdgVrsn(String.valueOf(explanationofbenefitdiagnosisonadmissioncoding.getVersion()));
		} else {
			e.addExplntnOfBnftDgnsisOnAdmissionCdgVrsn("NULL");
		}

		if(explanationofbenefitdiagnosisonadmissioncodingi == explanationofbenefitdiagnosisonadmissioncodinglist.size()-1) {e.addExplntnOfBnftDgnsisOnAdmissionCdgVrsn("]]");}


		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitdiagnosisonadmissioncodingi == 0) {e.addExplntnOfBnftDgnsisOnAdmissionCdgCd("[[");}
		if(explanationofbenefitdiagnosisonadmissioncoding.hasCode()) {

			e.addExplntnOfBnftDgnsisOnAdmissionCdgCd(String.valueOf(explanationofbenefitdiagnosisonadmissioncoding.getCode()));
		} else {
			e.addExplntnOfBnftDgnsisOnAdmissionCdgCd("NULL");
		}

		if(explanationofbenefitdiagnosisonadmissioncodingi == explanationofbenefitdiagnosisonadmissioncodinglist.size()-1) {e.addExplntnOfBnftDgnsisOnAdmissionCdgCd("]]");}


		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitdiagnosisonadmissioncodingi == 0) {e.addExplntnOfBnftDgnsisOnAdmissionCdgUsrSltd("[[");}
		if(explanationofbenefitdiagnosisonadmissioncoding.hasUserSelected()) {

			e.addExplntnOfBnftDgnsisOnAdmissionCdgUsrSltd(String.valueOf(explanationofbenefitdiagnosisonadmissioncoding.getUserSelected()));
		} else {
			e.addExplntnOfBnftDgnsisOnAdmissionCdgUsrSltd("NULL");
		}

		if(explanationofbenefitdiagnosisonadmissioncodingi == explanationofbenefitdiagnosisonadmissioncodinglist.size()-1) {e.addExplntnOfBnftDgnsisOnAdmissionCdgUsrSltd("]]");}


		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitdiagnosisonadmissioncodingi == 0) {e.addExplntnOfBnftDgnsisOnAdmissionCdgSys("[[");}
		if(explanationofbenefitdiagnosisonadmissioncoding.hasSystem()) {

			e.addExplntnOfBnftDgnsisOnAdmissionCdgSys(String.valueOf(explanationofbenefitdiagnosisonadmissioncoding.getSystem()));
		} else {
			e.addExplntnOfBnftDgnsisOnAdmissionCdgSys("NULL");
		}

		if(explanationofbenefitdiagnosisonadmissioncodingi == explanationofbenefitdiagnosisonadmissioncodinglist.size()-1) {e.addExplntnOfBnftDgnsisOnAdmissionCdgSys("]]");}


		 };
		 };
		return e;
	}
}
