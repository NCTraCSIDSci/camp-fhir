package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CoverageEligibilityRequest;
public class CoverageEligibilityRequestBidirectionalConversion 
{
	public CoverageEligibilityRequest CoverageEligibilityRequests(org.hl7.fhir.r4.model.CoverageEligibilityRequest coverageeligibilityrequest) throws ParseException
	{
		 main.java.com.campfhir.model.CoverageEligibilityRequest c = new  main.java.com.campfhir.model.CoverageEligibilityRequest();

		/******************** id ********************************************************************************/
		c.setId(coverageeligibilityrequest.getIdElement().getIdPart());

		/******************** coverageeligibilityrequestpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityrequestpriority = coverageeligibilityrequest.getPriority();

		/******************** CvgElgbltyRqst_Priority_Txt ********************************************************************************/
		if(coverageeligibilityrequestpriority.hasText()) {

			c.addCvgElgbltyRqstPriorityTxt(String.valueOf(coverageeligibilityrequestpriority.getText()));
		} else {
			c.addCvgElgbltyRqstPriorityTxt("NULL");
		}


		/******************** coverageeligibilityrequestprioritycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coverageeligibilityrequestprioritycodinglist = coverageeligibilityrequestpriority.getCoding();
		for(int coverageeligibilityrequestprioritycodingi = 0; coverageeligibilityrequestprioritycodingi<coverageeligibilityrequestprioritycodinglist.size();coverageeligibilityrequestprioritycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coverageeligibilityrequestprioritycoding = coverageeligibilityrequestprioritycodinglist.get(coverageeligibilityrequestprioritycodingi);

		/******************** CvgElgbltyRqst_Priority_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityrequestprioritycodingi == 0) {c.addCvgElgbltyRqstPriorityCdgDsply("[");}
		if(coverageeligibilityrequestprioritycoding.hasDisplay()) {

			c.addCvgElgbltyRqstPriorityCdgDsply(String.valueOf(coverageeligibilityrequestprioritycoding.getDisplay()));
		} else {
			c.addCvgElgbltyRqstPriorityCdgDsply("NULL");
		}

		if(coverageeligibilityrequestprioritycodingi == coverageeligibilityrequestprioritycodinglist.size()-1) {c.addCvgElgbltyRqstPriorityCdgDsply("]");}


		/******************** CvgElgbltyRqst_Priority_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityrequestprioritycodingi == 0) {c.addCvgElgbltyRqstPriorityCdgVrsn("[");}
		if(coverageeligibilityrequestprioritycoding.hasVersion()) {

			c.addCvgElgbltyRqstPriorityCdgVrsn(String.valueOf(coverageeligibilityrequestprioritycoding.getVersion()));
		} else {
			c.addCvgElgbltyRqstPriorityCdgVrsn("NULL");
		}

		if(coverageeligibilityrequestprioritycodingi == coverageeligibilityrequestprioritycodinglist.size()-1) {c.addCvgElgbltyRqstPriorityCdgVrsn("]");}


		/******************** CvgElgbltyRqst_Priority_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityrequestprioritycodingi == 0) {c.addCvgElgbltyRqstPriorityCdgCd("[");}
		if(coverageeligibilityrequestprioritycoding.hasCode()) {

			c.addCvgElgbltyRqstPriorityCdgCd(String.valueOf(coverageeligibilityrequestprioritycoding.getCode()));
		} else {
			c.addCvgElgbltyRqstPriorityCdgCd("NULL");
		}

		if(coverageeligibilityrequestprioritycodingi == coverageeligibilityrequestprioritycodinglist.size()-1) {c.addCvgElgbltyRqstPriorityCdgCd("]");}


		/******************** CvgElgbltyRqst_Priority_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityrequestprioritycodingi == 0) {c.addCvgElgbltyRqstPriorityCdgUsrSltd("[");}
		if(coverageeligibilityrequestprioritycoding.hasUserSelected()) {

			c.addCvgElgbltyRqstPriorityCdgUsrSltd(String.valueOf(coverageeligibilityrequestprioritycoding.getUserSelected()));
		} else {
			c.addCvgElgbltyRqstPriorityCdgUsrSltd("NULL");
		}

		if(coverageeligibilityrequestprioritycodingi == coverageeligibilityrequestprioritycodinglist.size()-1) {c.addCvgElgbltyRqstPriorityCdgUsrSltd("]");}


		/******************** CvgElgbltyRqst_Priority_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityrequestprioritycodingi == 0) {c.addCvgElgbltyRqstPriorityCdgSys("[");}
		if(coverageeligibilityrequestprioritycoding.hasSystem()) {

			c.addCvgElgbltyRqstPriorityCdgSys(String.valueOf(coverageeligibilityrequestprioritycoding.getSystem()));
		} else {
			c.addCvgElgbltyRqstPriorityCdgSys("NULL");
		}

		if(coverageeligibilityrequestprioritycodingi == coverageeligibilityrequestprioritycodinglist.size()-1) {c.addCvgElgbltyRqstPriorityCdgSys("]");}


		 };
		/******************** CvgElgbltyRqst_Provider ********************************************************************************/
		if(coverageeligibilityrequest.hasProvider()) {

			if(coverageeligibilityrequest.getProvider().getReference() != null) {
			c.addCvgElgbltyRqstProvider(coverageeligibilityrequest.getProvider().getReference());
			}
		} else {
			c.addCvgElgbltyRqstProvider("NULL");
		}


		/******************** coverageeligibilityrequestitem ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CoverageEligibilityRequest.DetailsComponent> coverageeligibilityrequestitemlist = coverageeligibilityrequest.getItem();
		for(int coverageeligibilityrequestitemi = 0; coverageeligibilityrequestitemi<coverageeligibilityrequestitemlist.size();coverageeligibilityrequestitemi++ ) {
		org.hl7.fhir.r4.model.CoverageEligibilityRequest.DetailsComponent  coverageeligibilityrequestitem = coverageeligibilityrequestitemlist.get(coverageeligibilityrequestitemi);

		/******************** CvgElgbltyRqst_Itm_Provider ********************************************************************************/
		if(coverageeligibilityrequestitemi == 0) {c.addCvgElgbltyRqstItmProvider("[");}
		if(coverageeligibilityrequestitem.hasProvider()) {

			if(coverageeligibilityrequestitem.getProvider().getReference() != null) {
			c.addCvgElgbltyRqstItmProvider(coverageeligibilityrequestitem.getProvider().getReference());
			}
		} else {
			c.addCvgElgbltyRqstItmProvider("NULL");
		}

		if(coverageeligibilityrequestitemi == coverageeligibilityrequestitemlist.size()-1) {c.addCvgElgbltyRqstItmProvider("]");}


		/******************** coverageeligibilityrequestitemunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money coverageeligibilityrequestitemunitprice = coverageeligibilityrequestitem.getUnitPrice();

		/******************** CvgElgbltyRqst_Itm_UntPrice_Vl ********************************************************************************/
		if(coverageeligibilityrequestitemi == 0) {c.addCvgElgbltyRqstItmUntPriceVl("[");}
		if(coverageeligibilityrequestitemunitprice.hasValue()) {

			c.addCvgElgbltyRqstItmUntPriceVl(String.valueOf(coverageeligibilityrequestitemunitprice.getValue()));
		} else {
			c.addCvgElgbltyRqstItmUntPriceVl("NULL");
		}

		if(coverageeligibilityrequestitemi == coverageeligibilityrequestitemlist.size()-1) {c.addCvgElgbltyRqstItmUntPriceVl("]");}


		/******************** CvgElgbltyRqst_Itm_UntPrice_Crncy ********************************************************************************/
		if(coverageeligibilityrequestitemi == 0) {c.addCvgElgbltyRqstItmUntPriceCrncy("[");}
		if(coverageeligibilityrequestitemunitprice.hasCurrency()) {

			c.addCvgElgbltyRqstItmUntPriceCrncy(String.valueOf(coverageeligibilityrequestitemunitprice.getCurrency()));
		} else {
			c.addCvgElgbltyRqstItmUntPriceCrncy("NULL");
		}

		if(coverageeligibilityrequestitemi == coverageeligibilityrequestitemlist.size()-1) {c.addCvgElgbltyRqstItmUntPriceCrncy("]");}


		/******************** CvgElgbltyRqst_Itm_Dtl ********************************************************************************/
		if(coverageeligibilityrequestitemi == 0) {c.addCvgElgbltyRqstItmDtl("[");}
		if(coverageeligibilityrequestitem.hasDetail()) {

			String  array = "[";
			for(int incr=0; incr<coverageeligibilityrequestitem.getDetail().size(); incr++) {
				array = array + coverageeligibilityrequestitem.getDetail().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCvgElgbltyRqstItmDtl(array);

		} else {
			c.addCvgElgbltyRqstItmDtl("NULL");
		}

		if(coverageeligibilityrequestitemi == coverageeligibilityrequestitemlist.size()-1) {c.addCvgElgbltyRqstItmDtl("]");}


		/******************** coverageeligibilityrequestitemcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityrequestitemcategory = coverageeligibilityrequestitem.getCategory();

		/******************** CvgElgbltyRqst_Itm_Ctgry_Txt ********************************************************************************/
		if(coverageeligibilityrequestitemi == 0) {c.addCvgElgbltyRqstItmCtgryTxt("[");}
		if(coverageeligibilityrequestitemcategory.hasText()) {

			c.addCvgElgbltyRqstItmCtgryTxt(String.valueOf(coverageeligibilityrequestitemcategory.getText()));
		} else {
			c.addCvgElgbltyRqstItmCtgryTxt("NULL");
		}

		if(coverageeligibilityrequestitemi == coverageeligibilityrequestitemlist.size()-1) {c.addCvgElgbltyRqstItmCtgryTxt("]");}


		/******************** coverageeligibilityrequestitemcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coverageeligibilityrequestitemcategorycodinglist = coverageeligibilityrequestitemcategory.getCoding();
		for(int coverageeligibilityrequestitemcategorycodingi = 0; coverageeligibilityrequestitemcategorycodingi<coverageeligibilityrequestitemcategorycodinglist.size();coverageeligibilityrequestitemcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coverageeligibilityrequestitemcategorycoding = coverageeligibilityrequestitemcategorycodinglist.get(coverageeligibilityrequestitemcategorycodingi);

		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityrequestitemcategorycodingi == 0) {c.addCvgElgbltyRqstItmCtgryCdgDsply("[[");}
		if(coverageeligibilityrequestitemcategorycoding.hasDisplay()) {

			c.addCvgElgbltyRqstItmCtgryCdgDsply(String.valueOf(coverageeligibilityrequestitemcategorycoding.getDisplay()));
		} else {
			c.addCvgElgbltyRqstItmCtgryCdgDsply("NULL");
		}

		if(coverageeligibilityrequestitemcategorycodingi == coverageeligibilityrequestitemcategorycodinglist.size()-1) {c.addCvgElgbltyRqstItmCtgryCdgDsply("]]");}


		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityrequestitemcategorycodingi == 0) {c.addCvgElgbltyRqstItmCtgryCdgVrsn("[[");}
		if(coverageeligibilityrequestitemcategorycoding.hasVersion()) {

			c.addCvgElgbltyRqstItmCtgryCdgVrsn(String.valueOf(coverageeligibilityrequestitemcategorycoding.getVersion()));
		} else {
			c.addCvgElgbltyRqstItmCtgryCdgVrsn("NULL");
		}

		if(coverageeligibilityrequestitemcategorycodingi == coverageeligibilityrequestitemcategorycodinglist.size()-1) {c.addCvgElgbltyRqstItmCtgryCdgVrsn("]]");}


		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityrequestitemcategorycodingi == 0) {c.addCvgElgbltyRqstItmCtgryCdgCd("[[");}
		if(coverageeligibilityrequestitemcategorycoding.hasCode()) {

			c.addCvgElgbltyRqstItmCtgryCdgCd(String.valueOf(coverageeligibilityrequestitemcategorycoding.getCode()));
		} else {
			c.addCvgElgbltyRqstItmCtgryCdgCd("NULL");
		}

		if(coverageeligibilityrequestitemcategorycodingi == coverageeligibilityrequestitemcategorycodinglist.size()-1) {c.addCvgElgbltyRqstItmCtgryCdgCd("]]");}


		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityrequestitemcategorycodingi == 0) {c.addCvgElgbltyRqstItmCtgryCdgUsrSltd("[[");}
		if(coverageeligibilityrequestitemcategorycoding.hasUserSelected()) {

			c.addCvgElgbltyRqstItmCtgryCdgUsrSltd(String.valueOf(coverageeligibilityrequestitemcategorycoding.getUserSelected()));
		} else {
			c.addCvgElgbltyRqstItmCtgryCdgUsrSltd("NULL");
		}

		if(coverageeligibilityrequestitemcategorycodingi == coverageeligibilityrequestitemcategorycodinglist.size()-1) {c.addCvgElgbltyRqstItmCtgryCdgUsrSltd("]]");}


		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityrequestitemcategorycodingi == 0) {c.addCvgElgbltyRqstItmCtgryCdgSys("[[");}
		if(coverageeligibilityrequestitemcategorycoding.hasSystem()) {

			c.addCvgElgbltyRqstItmCtgryCdgSys(String.valueOf(coverageeligibilityrequestitemcategorycoding.getSystem()));
		} else {
			c.addCvgElgbltyRqstItmCtgryCdgSys("NULL");
		}

		if(coverageeligibilityrequestitemcategorycodingi == coverageeligibilityrequestitemcategorycodinglist.size()-1) {c.addCvgElgbltyRqstItmCtgryCdgSys("]]");}


		 };
		/******************** coverageeligibilityrequestitemmodifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> coverageeligibilityrequestitemmodifierlist = coverageeligibilityrequestitem.getModifier();
		for(int coverageeligibilityrequestitemmodifieri = 0; coverageeligibilityrequestitemmodifieri<coverageeligibilityrequestitemmodifierlist.size();coverageeligibilityrequestitemmodifieri++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  coverageeligibilityrequestitemmodifier = coverageeligibilityrequestitemmodifierlist.get(coverageeligibilityrequestitemmodifieri);

		/******************** CvgElgbltyRqst_Itm_Mdfr_Txt ********************************************************************************/
		if(coverageeligibilityrequestitemmodifieri == 0) {c.addCvgElgbltyRqstItmMdfrTxt("[[");}
		if(coverageeligibilityrequestitemmodifier.hasText()) {

			c.addCvgElgbltyRqstItmMdfrTxt(String.valueOf(coverageeligibilityrequestitemmodifier.getText()));
		} else {
			c.addCvgElgbltyRqstItmMdfrTxt("NULL");
		}

		if(coverageeligibilityrequestitemmodifieri == coverageeligibilityrequestitemmodifierlist.size()-1) {c.addCvgElgbltyRqstItmMdfrTxt("]]");}


		/******************** coverageeligibilityrequestitemmodifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coverageeligibilityrequestitemmodifiercodinglist = coverageeligibilityrequestitemmodifier.getCoding();
		for(int coverageeligibilityrequestitemmodifiercodingi = 0; coverageeligibilityrequestitemmodifiercodingi<coverageeligibilityrequestitemmodifiercodinglist.size();coverageeligibilityrequestitemmodifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coverageeligibilityrequestitemmodifiercoding = coverageeligibilityrequestitemmodifiercodinglist.get(coverageeligibilityrequestitemmodifiercodingi);

		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityrequestitemmodifiercodingi == 0) {c.addCvgElgbltyRqstItmMdfrCdgDsply("[[[");}
		if(coverageeligibilityrequestitemmodifiercoding.hasDisplay()) {

			c.addCvgElgbltyRqstItmMdfrCdgDsply(String.valueOf(coverageeligibilityrequestitemmodifiercoding.getDisplay()));
		} else {
			c.addCvgElgbltyRqstItmMdfrCdgDsply("NULL");
		}

		if(coverageeligibilityrequestitemmodifiercodingi == coverageeligibilityrequestitemmodifiercodinglist.size()-1) {c.addCvgElgbltyRqstItmMdfrCdgDsply("]]]");}


		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityrequestitemmodifiercodingi == 0) {c.addCvgElgbltyRqstItmMdfrCdgVrsn("[[[");}
		if(coverageeligibilityrequestitemmodifiercoding.hasVersion()) {

			c.addCvgElgbltyRqstItmMdfrCdgVrsn(String.valueOf(coverageeligibilityrequestitemmodifiercoding.getVersion()));
		} else {
			c.addCvgElgbltyRqstItmMdfrCdgVrsn("NULL");
		}

		if(coverageeligibilityrequestitemmodifiercodingi == coverageeligibilityrequestitemmodifiercodinglist.size()-1) {c.addCvgElgbltyRqstItmMdfrCdgVrsn("]]]");}


		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityrequestitemmodifiercodingi == 0) {c.addCvgElgbltyRqstItmMdfrCdgCd("[[[");}
		if(coverageeligibilityrequestitemmodifiercoding.hasCode()) {

			c.addCvgElgbltyRqstItmMdfrCdgCd(String.valueOf(coverageeligibilityrequestitemmodifiercoding.getCode()));
		} else {
			c.addCvgElgbltyRqstItmMdfrCdgCd("NULL");
		}

		if(coverageeligibilityrequestitemmodifiercodingi == coverageeligibilityrequestitemmodifiercodinglist.size()-1) {c.addCvgElgbltyRqstItmMdfrCdgCd("]]]");}


		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityrequestitemmodifiercodingi == 0) {c.addCvgElgbltyRqstItmMdfrCdgUsrSltd("[[[");}
		if(coverageeligibilityrequestitemmodifiercoding.hasUserSelected()) {

			c.addCvgElgbltyRqstItmMdfrCdgUsrSltd(String.valueOf(coverageeligibilityrequestitemmodifiercoding.getUserSelected()));
		} else {
			c.addCvgElgbltyRqstItmMdfrCdgUsrSltd("NULL");
		}

		if(coverageeligibilityrequestitemmodifiercodingi == coverageeligibilityrequestitemmodifiercodinglist.size()-1) {c.addCvgElgbltyRqstItmMdfrCdgUsrSltd("]]]");}


		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityrequestitemmodifiercodingi == 0) {c.addCvgElgbltyRqstItmMdfrCdgSys("[[[");}
		if(coverageeligibilityrequestitemmodifiercoding.hasSystem()) {

			c.addCvgElgbltyRqstItmMdfrCdgSys(String.valueOf(coverageeligibilityrequestitemmodifiercoding.getSystem()));
		} else {
			c.addCvgElgbltyRqstItmMdfrCdgSys("NULL");
		}

		if(coverageeligibilityrequestitemmodifiercodingi == coverageeligibilityrequestitemmodifiercodinglist.size()-1) {c.addCvgElgbltyRqstItmMdfrCdgSys("]]]");}


		 };
		 };
		/******************** CvgElgbltyRqst_Itm_Facility ********************************************************************************/
		if(coverageeligibilityrequestitem.hasFacility()) {

			if(coverageeligibilityrequestitem.getFacility().getReference() != null) {
			c.addCvgElgbltyRqstItmFacility(coverageeligibilityrequestitem.getFacility().getReference());
			}
		} else {
			c.addCvgElgbltyRqstItmFacility("NULL");
		}


		/******************** coverageeligibilityrequestitemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity coverageeligibilityrequestitemquantity = coverageeligibilityrequestitem.getQuantity();

		/******************** CvgElgbltyRqst_Itm_Qnty_Vl ********************************************************************************/
		if(coverageeligibilityrequestitemquantity.hasValue()) {

			c.addCvgElgbltyRqstItmQntyVl(String.valueOf(coverageeligibilityrequestitemquantity.getValue()));
		} else {
			c.addCvgElgbltyRqstItmQntyVl("NULL");
		}


		/******************** coverageeligibilityrequestitemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator coverageeligibilityrequestitemquantitycomparator = coverageeligibilityrequestitemquantity.getComparator();
		if(coverageeligibilityrequestitemquantitycomparator!=null) {
			c.addCvgElgbltyRqstItmQntyCmprtr(coverageeligibilityrequestitemquantitycomparator.toCode());
		} else {
			c.addCvgElgbltyRqstItmQntyCmprtr("NULL");
		}

		/******************** CvgElgbltyRqst_Itm_Qnty_Cd ********************************************************************************/
		if(coverageeligibilityrequestitemquantity.hasCode()) {

			c.addCvgElgbltyRqstItmQntyCd(String.valueOf(coverageeligibilityrequestitemquantity.getCode()));
		} else {
			c.addCvgElgbltyRqstItmQntyCd("NULL");
		}


		/******************** CvgElgbltyRqst_Itm_Qnty_Unt ********************************************************************************/
		if(coverageeligibilityrequestitemquantity.hasUnit()) {

			c.addCvgElgbltyRqstItmQntyUnt(String.valueOf(coverageeligibilityrequestitemquantity.getUnit()));
		} else {
			c.addCvgElgbltyRqstItmQntyUnt("NULL");
		}


		/******************** CvgElgbltyRqst_Itm_Qnty_Sys ********************************************************************************/
		if(coverageeligibilityrequestitemquantity.hasSystem()) {

			c.addCvgElgbltyRqstItmQntySys(String.valueOf(coverageeligibilityrequestitemquantity.getSystem()));
		} else {
			c.addCvgElgbltyRqstItmQntySys("NULL");
		}


		/******************** coverageeligibilityrequestitemproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityrequestitemproductorservice = coverageeligibilityrequestitem.getProductOrService();

		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Txt ********************************************************************************/
		if(coverageeligibilityrequestitemproductorservice.hasText()) {

			c.addCvgElgbltyRqstItmPrdctOrSrvTxt(String.valueOf(coverageeligibilityrequestitemproductorservice.getText()));
		} else {
			c.addCvgElgbltyRqstItmPrdctOrSrvTxt("NULL");
		}


		/******************** coverageeligibilityrequestitemproductorservicecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coverageeligibilityrequestitemproductorservicecodinglist = coverageeligibilityrequestitemproductorservice.getCoding();
		for(int coverageeligibilityrequestitemproductorservicecodingi = 0; coverageeligibilityrequestitemproductorservicecodingi<coverageeligibilityrequestitemproductorservicecodinglist.size();coverageeligibilityrequestitemproductorservicecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coverageeligibilityrequestitemproductorservicecoding = coverageeligibilityrequestitemproductorservicecodinglist.get(coverageeligibilityrequestitemproductorservicecodingi);

		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityrequestitemproductorservicecodingi == 0) {c.addCvgElgbltyRqstItmPrdctOrSrvCdgDsply("[[");}
		if(coverageeligibilityrequestitemproductorservicecoding.hasDisplay()) {

			c.addCvgElgbltyRqstItmPrdctOrSrvCdgDsply(String.valueOf(coverageeligibilityrequestitemproductorservicecoding.getDisplay()));
		} else {
			c.addCvgElgbltyRqstItmPrdctOrSrvCdgDsply("NULL");
		}

		if(coverageeligibilityrequestitemproductorservicecodingi == coverageeligibilityrequestitemproductorservicecodinglist.size()-1) {c.addCvgElgbltyRqstItmPrdctOrSrvCdgDsply("]]");}


		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityrequestitemproductorservicecodingi == 0) {c.addCvgElgbltyRqstItmPrdctOrSrvCdgVrsn("[[");}
		if(coverageeligibilityrequestitemproductorservicecoding.hasVersion()) {

			c.addCvgElgbltyRqstItmPrdctOrSrvCdgVrsn(String.valueOf(coverageeligibilityrequestitemproductorservicecoding.getVersion()));
		} else {
			c.addCvgElgbltyRqstItmPrdctOrSrvCdgVrsn("NULL");
		}

		if(coverageeligibilityrequestitemproductorservicecodingi == coverageeligibilityrequestitemproductorservicecodinglist.size()-1) {c.addCvgElgbltyRqstItmPrdctOrSrvCdgVrsn("]]");}


		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityrequestitemproductorservicecodingi == 0) {c.addCvgElgbltyRqstItmPrdctOrSrvCdgCd("[[");}
		if(coverageeligibilityrequestitemproductorservicecoding.hasCode()) {

			c.addCvgElgbltyRqstItmPrdctOrSrvCdgCd(String.valueOf(coverageeligibilityrequestitemproductorservicecoding.getCode()));
		} else {
			c.addCvgElgbltyRqstItmPrdctOrSrvCdgCd("NULL");
		}

		if(coverageeligibilityrequestitemproductorservicecodingi == coverageeligibilityrequestitemproductorservicecodinglist.size()-1) {c.addCvgElgbltyRqstItmPrdctOrSrvCdgCd("]]");}


		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityrequestitemproductorservicecodingi == 0) {c.addCvgElgbltyRqstItmPrdctOrSrvCdgUsrSltd("[[");}
		if(coverageeligibilityrequestitemproductorservicecoding.hasUserSelected()) {

			c.addCvgElgbltyRqstItmPrdctOrSrvCdgUsrSltd(String.valueOf(coverageeligibilityrequestitemproductorservicecoding.getUserSelected()));
		} else {
			c.addCvgElgbltyRqstItmPrdctOrSrvCdgUsrSltd("NULL");
		}

		if(coverageeligibilityrequestitemproductorservicecodingi == coverageeligibilityrequestitemproductorservicecodinglist.size()-1) {c.addCvgElgbltyRqstItmPrdctOrSrvCdgUsrSltd("]]");}


		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityrequestitemproductorservicecodingi == 0) {c.addCvgElgbltyRqstItmPrdctOrSrvCdgSys("[[");}
		if(coverageeligibilityrequestitemproductorservicecoding.hasSystem()) {

			c.addCvgElgbltyRqstItmPrdctOrSrvCdgSys(String.valueOf(coverageeligibilityrequestitemproductorservicecoding.getSystem()));
		} else {
			c.addCvgElgbltyRqstItmPrdctOrSrvCdgSys("NULL");
		}

		if(coverageeligibilityrequestitemproductorservicecodingi == coverageeligibilityrequestitemproductorservicecodinglist.size()-1) {c.addCvgElgbltyRqstItmPrdctOrSrvCdgSys("]]");}


		 };
		/******************** CvgElgbltyRqst_Itm_SprtingInfoSqnc ********************************************************************************/
		if(coverageeligibilityrequestitem.hasSupportingInfoSequence()) {

			String  array = "[";
			for(int incr=0; incr<coverageeligibilityrequestitem.getSupportingInfoSequence().size(); incr++) {
				array = array + coverageeligibilityrequestitem.getSupportingInfoSequence().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCvgElgbltyRqstItmSprtingInfoSqnc(array);

		} else {
			c.addCvgElgbltyRqstItmSprtingInfoSqnc("NULL");
		}


		/******************** coverageeligibilityrequestitemdiagnosis ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CoverageEligibilityRequest.DiagnosisComponent> coverageeligibilityrequestitemdiagnosislist = coverageeligibilityrequestitem.getDiagnosis();
		for(int coverageeligibilityrequestitemdiagnosisi = 0; coverageeligibilityrequestitemdiagnosisi<coverageeligibilityrequestitemdiagnosislist.size();coverageeligibilityrequestitemdiagnosisi++ ) {
		org.hl7.fhir.r4.model.CoverageEligibilityRequest.DiagnosisComponent  coverageeligibilityrequestitemdiagnosis = coverageeligibilityrequestitemdiagnosislist.get(coverageeligibilityrequestitemdiagnosisi);

		/******************** coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconcept = coverageeligibilityrequestitemdiagnosis.getDiagnosisCodeableConcept();

		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Txt ********************************************************************************/
		if(coverageeligibilityrequestitemdiagnosisi == 0) {c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptTxt("[[");}
		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconcept.hasText()) {

			c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptTxt(String.valueOf(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconcept.getText()));
		} else {
			c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptTxt("NULL");
		}

		if(coverageeligibilityrequestitemdiagnosisi == coverageeligibilityrequestitemdiagnosislist.size()-1) {c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptTxt("]]");}


		/******************** coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodinglist = coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconcept.getCoding();
		for(int coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodingi = 0; coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodingi<coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodinglist.size();coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding = coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodinglist.get(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodingi);

		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodingi == 0) {c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgDsply("[[[");}
		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.hasDisplay()) {

			c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgDsply(String.valueOf(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.getDisplay()));
		} else {
			c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgDsply("NULL");
		}

		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodingi == coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodinglist.size()-1) {c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgDsply("]]]");}


		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodingi == 0) {c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgVrsn("[[[");}
		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.hasVersion()) {

			c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgVrsn(String.valueOf(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.getVersion()));
		} else {
			c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgVrsn("NULL");
		}

		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodingi == coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodinglist.size()-1) {c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgVrsn("]]]");}


		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodingi == 0) {c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgCd("[[[");}
		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.hasCode()) {

			c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgCd(String.valueOf(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.getCode()));
		} else {
			c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgCd("NULL");
		}

		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodingi == coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodinglist.size()-1) {c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgCd("]]]");}


		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodingi == 0) {c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgUsrSltd("[[[");}
		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.hasUserSelected()) {

			c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgUsrSltd(String.valueOf(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.getUserSelected()));
		} else {
			c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgUsrSltd("NULL");
		}

		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodingi == coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodinglist.size()-1) {c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgUsrSltd("]]]");}


		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodingi == 0) {c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgSys("[[[");}
		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.hasSystem()) {

			c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgSys(String.valueOf(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.getSystem()));
		} else {
			c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgSys("NULL");
		}

		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodingi == coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcodinglist.size()-1) {c.addCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgSys("]]]");}


		 };
		 };
		 };
		/******************** coverageeligibilityrequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityRequest.EligibilityRequestStatus coverageeligibilityrequeststatus = coverageeligibilityrequest.getStatus();
		if(coverageeligibilityrequeststatus!=null) {
			c.addCvgElgbltyRqstSts(coverageeligibilityrequeststatus.toCode());
		} else {
			c.addCvgElgbltyRqstSts("NULL");
		}

		/******************** CvgElgbltyRqst_Created ********************************************************************************/
		if(coverageeligibilityrequest.hasCreated()) {

			c.addCvgElgbltyRqstCreated("\""+ca.uhn.fhir.util.DateUtils.formatDate(coverageeligibilityrequest.getCreated())+"\"");
		} else {
			c.addCvgElgbltyRqstCreated("NULL");
		}


		/******************** coverageeligibilityrequestidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> coverageeligibilityrequestidentifierlist = coverageeligibilityrequest.getIdentifier();
		for(int coverageeligibilityrequestidentifieri = 0; coverageeligibilityrequestidentifieri<coverageeligibilityrequestidentifierlist.size();coverageeligibilityrequestidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  coverageeligibilityrequestidentifier = coverageeligibilityrequestidentifierlist.get(coverageeligibilityrequestidentifieri);

		/******************** CvgElgbltyRqst_Id_Vl ********************************************************************************/
		if(coverageeligibilityrequestidentifieri == 0) {c.addCvgElgbltyRqstIdVl("[");}
		if(coverageeligibilityrequestidentifier.hasValue()) {

			c.addCvgElgbltyRqstIdVl(String.valueOf(coverageeligibilityrequestidentifier.getValue()));
		} else {
			c.addCvgElgbltyRqstIdVl("NULL");
		}

		if(coverageeligibilityrequestidentifieri == coverageeligibilityrequestidentifierlist.size()-1) {c.addCvgElgbltyRqstIdVl("]");}


		/******************** coverageeligibilityrequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityrequestidentifiertype = coverageeligibilityrequestidentifier.getType();

		/******************** CvgElgbltyRqst_Id_Typ_Txt ********************************************************************************/
		if(coverageeligibilityrequestidentifieri == 0) {c.addCvgElgbltyRqstIdTypTxt("[");}
		if(coverageeligibilityrequestidentifiertype.hasText()) {

			c.addCvgElgbltyRqstIdTypTxt(String.valueOf(coverageeligibilityrequestidentifiertype.getText()));
		} else {
			c.addCvgElgbltyRqstIdTypTxt("NULL");
		}

		if(coverageeligibilityrequestidentifieri == coverageeligibilityrequestidentifierlist.size()-1) {c.addCvgElgbltyRqstIdTypTxt("]");}


		/******************** coverageeligibilityrequestidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coverageeligibilityrequestidentifiertypecodinglist = coverageeligibilityrequestidentifiertype.getCoding();
		for(int coverageeligibilityrequestidentifiertypecodingi = 0; coverageeligibilityrequestidentifiertypecodingi<coverageeligibilityrequestidentifiertypecodinglist.size();coverageeligibilityrequestidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coverageeligibilityrequestidentifiertypecoding = coverageeligibilityrequestidentifiertypecodinglist.get(coverageeligibilityrequestidentifiertypecodingi);

		/******************** CvgElgbltyRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityrequestidentifiertypecodingi == 0) {c.addCvgElgbltyRqstIdTypCdgDsply("[[");}
		if(coverageeligibilityrequestidentifiertypecoding.hasDisplay()) {

			c.addCvgElgbltyRqstIdTypCdgDsply(String.valueOf(coverageeligibilityrequestidentifiertypecoding.getDisplay()));
		} else {
			c.addCvgElgbltyRqstIdTypCdgDsply("NULL");
		}

		if(coverageeligibilityrequestidentifiertypecodingi == coverageeligibilityrequestidentifiertypecodinglist.size()-1) {c.addCvgElgbltyRqstIdTypCdgDsply("]]");}


		/******************** CvgElgbltyRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityrequestidentifiertypecodingi == 0) {c.addCvgElgbltyRqstIdTypCdgVrsn("[[");}
		if(coverageeligibilityrequestidentifiertypecoding.hasVersion()) {

			c.addCvgElgbltyRqstIdTypCdgVrsn(String.valueOf(coverageeligibilityrequestidentifiertypecoding.getVersion()));
		} else {
			c.addCvgElgbltyRqstIdTypCdgVrsn("NULL");
		}

		if(coverageeligibilityrequestidentifiertypecodingi == coverageeligibilityrequestidentifiertypecodinglist.size()-1) {c.addCvgElgbltyRqstIdTypCdgVrsn("]]");}


		/******************** CvgElgbltyRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityrequestidentifiertypecodingi == 0) {c.addCvgElgbltyRqstIdTypCdgCd("[[");}
		if(coverageeligibilityrequestidentifiertypecoding.hasCode()) {

			c.addCvgElgbltyRqstIdTypCdgCd(String.valueOf(coverageeligibilityrequestidentifiertypecoding.getCode()));
		} else {
			c.addCvgElgbltyRqstIdTypCdgCd("NULL");
		}

		if(coverageeligibilityrequestidentifiertypecodingi == coverageeligibilityrequestidentifiertypecodinglist.size()-1) {c.addCvgElgbltyRqstIdTypCdgCd("]]");}


		/******************** CvgElgbltyRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityrequestidentifiertypecodingi == 0) {c.addCvgElgbltyRqstIdTypCdgUsrSltd("[[");}
		if(coverageeligibilityrequestidentifiertypecoding.hasUserSelected()) {

			c.addCvgElgbltyRqstIdTypCdgUsrSltd(String.valueOf(coverageeligibilityrequestidentifiertypecoding.getUserSelected()));
		} else {
			c.addCvgElgbltyRqstIdTypCdgUsrSltd("NULL");
		}

		if(coverageeligibilityrequestidentifiertypecodingi == coverageeligibilityrequestidentifiertypecodinglist.size()-1) {c.addCvgElgbltyRqstIdTypCdgUsrSltd("]]");}


		/******************** CvgElgbltyRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityrequestidentifiertypecodingi == 0) {c.addCvgElgbltyRqstIdTypCdgSys("[[");}
		if(coverageeligibilityrequestidentifiertypecoding.hasSystem()) {

			c.addCvgElgbltyRqstIdTypCdgSys(String.valueOf(coverageeligibilityrequestidentifiertypecoding.getSystem()));
		} else {
			c.addCvgElgbltyRqstIdTypCdgSys("NULL");
		}

		if(coverageeligibilityrequestidentifiertypecodingi == coverageeligibilityrequestidentifiertypecodinglist.size()-1) {c.addCvgElgbltyRqstIdTypCdgSys("]]");}


		 };
		/******************** coverageeligibilityrequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageeligibilityrequestidentifierperiod = coverageeligibilityrequestidentifier.getPeriod();

		/******************** CvgElgbltyRqst_Id_Prd_Strt ********************************************************************************/
		if(coverageeligibilityrequestidentifieri == 0) {c.addCvgElgbltyRqstIdPrdStrt("[");}
		if(coverageeligibilityrequestidentifierperiod.hasStart()) {

			c.addCvgElgbltyRqstIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(coverageeligibilityrequestidentifierperiod.getStart())+"\"");
		} else {
			c.addCvgElgbltyRqstIdPrdStrt("NULL");
		}

		if(coverageeligibilityrequestidentifieri == coverageeligibilityrequestidentifierlist.size()-1) {c.addCvgElgbltyRqstIdPrdStrt("]");}


		/******************** CvgElgbltyRqst_Id_Prd_End ********************************************************************************/
		if(coverageeligibilityrequestidentifieri == 0) {c.addCvgElgbltyRqstIdPrdEnd("[");}
		if(coverageeligibilityrequestidentifierperiod.hasEnd()) {

			c.addCvgElgbltyRqstIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(coverageeligibilityrequestidentifierperiod.getEnd())+"\"");
		} else {
			c.addCvgElgbltyRqstIdPrdEnd("NULL");
		}

		if(coverageeligibilityrequestidentifieri == coverageeligibilityrequestidentifierlist.size()-1) {c.addCvgElgbltyRqstIdPrdEnd("]");}


		/******************** coverageeligibilityrequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse coverageeligibilityrequestidentifieruse = coverageeligibilityrequestidentifier.getUse();
		if(coverageeligibilityrequestidentifieruse!=null) {
		if(coverageeligibilityrequestidentifieri == 0) {

		c.addCvgElgbltyRqstIdUse("[");		}
			c.addCvgElgbltyRqstIdUse(coverageeligibilityrequestidentifieruse.toCode());
		if(coverageeligibilityrequestidentifieri == coverageeligibilityrequestidentifierlist.size()-1) {

		c.addCvgElgbltyRqstIdUse("]");		}

		} else {
			c.addCvgElgbltyRqstIdUse("NULL");
		}

		/******************** CvgElgbltyRqst_Id_Assigner ********************************************************************************/
		if(coverageeligibilityrequestidentifieri == 0) {c.addCvgElgbltyRqstIdAssigner("[");}
		if(coverageeligibilityrequestidentifier.hasAssigner()) {

			if(coverageeligibilityrequestidentifier.getAssigner().getReference() != null) {
			c.addCvgElgbltyRqstIdAssigner(coverageeligibilityrequestidentifier.getAssigner().getReference());
			}
		} else {
			c.addCvgElgbltyRqstIdAssigner("NULL");
		}

		if(coverageeligibilityrequestidentifieri == coverageeligibilityrequestidentifierlist.size()-1) {c.addCvgElgbltyRqstIdAssigner("]");}


		/******************** CvgElgbltyRqst_Id_Sys ********************************************************************************/
		if(coverageeligibilityrequestidentifieri == 0) {c.addCvgElgbltyRqstIdSys("[");}
		if(coverageeligibilityrequestidentifier.hasSystem()) {

			c.addCvgElgbltyRqstIdSys(String.valueOf(coverageeligibilityrequestidentifier.getSystem()));
		} else {
			c.addCvgElgbltyRqstIdSys("NULL");
		}

		if(coverageeligibilityrequestidentifieri == coverageeligibilityrequestidentifierlist.size()-1) {c.addCvgElgbltyRqstIdSys("]");}


		 };
		/******************** CvgElgbltyRqst_SrvdDtTyp ********************************************************************************/
		if(coverageeligibilityrequest.hasServicedDateType()) {

			c.addCvgElgbltyRqstSrvdDtTyp("\""+coverageeligibilityrequest.getServicedDateType().getValueAsString()+"\"");
		} else {
			c.addCvgElgbltyRqstSrvdDtTyp("NULL");
		}


		/******************** coverageeligibilityrequestpurpose ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.CoverageEligibilityRequest.EligibilityRequestPurpose>> coverageeligibilityrequestpurposelist = coverageeligibilityrequest.getPurpose();
		for(int coverageeligibilityrequestpurposei = 0; coverageeligibilityrequestpurposei<coverageeligibilityrequestpurposelist.size();coverageeligibilityrequestpurposei++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.CoverageEligibilityRequest.EligibilityRequestPurpose>  coverageeligibilityrequestpurpose = coverageeligibilityrequestpurposelist.get(coverageeligibilityrequestpurposei);
		if(coverageeligibilityrequestpurpose!=null) {
			c.addCvgElgbltyRqstPrpse(coverageeligibilityrequestpurpose.getCode());
		} else {
			c.addCvgElgbltyRqstPrpse("NULL");
		}
		 };

		/******************** CvgElgbltyRqst_Enterer ********************************************************************************/
		if(coverageeligibilityrequest.hasEnterer()) {

			if(coverageeligibilityrequest.getEnterer().getReference() != null) {
			c.addCvgElgbltyRqstEnterer(coverageeligibilityrequest.getEnterer().getReference());
			}
		} else {
			c.addCvgElgbltyRqstEnterer("NULL");
		}


		/******************** coverageeligibilityrequestservicedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageeligibilityrequestservicedperiod = coverageeligibilityrequest.getServicedPeriod();

		/******************** CvgElgbltyRqst_SrvdPrd_Strt ********************************************************************************/
		if(coverageeligibilityrequestservicedperiod.hasStart()) {

			c.addCvgElgbltyRqstSrvdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(coverageeligibilityrequestservicedperiod.getStart())+"\"");
		} else {
			c.addCvgElgbltyRqstSrvdPrdStrt("NULL");
		}


		/******************** CvgElgbltyRqst_SrvdPrd_End ********************************************************************************/
		if(coverageeligibilityrequestservicedperiod.hasEnd()) {

			c.addCvgElgbltyRqstSrvdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(coverageeligibilityrequestservicedperiod.getEnd())+"\"");
		} else {
			c.addCvgElgbltyRqstSrvdPrdEnd("NULL");
		}


		/******************** CvgElgbltyRqst_Facility ********************************************************************************/
		if(coverageeligibilityrequest.hasFacility()) {

			if(coverageeligibilityrequest.getFacility().getReference() != null) {
			c.addCvgElgbltyRqstFacility(coverageeligibilityrequest.getFacility().getReference());
			}
		} else {
			c.addCvgElgbltyRqstFacility("NULL");
		}


		/******************** coverageeligibilityrequestsupportinginfo ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CoverageEligibilityRequest.SupportingInformationComponent> coverageeligibilityrequestsupportinginfolist = coverageeligibilityrequest.getSupportingInfo();
		for(int coverageeligibilityrequestsupportinginfoi = 0; coverageeligibilityrequestsupportinginfoi<coverageeligibilityrequestsupportinginfolist.size();coverageeligibilityrequestsupportinginfoi++ ) {
		org.hl7.fhir.r4.model.CoverageEligibilityRequest.SupportingInformationComponent  coverageeligibilityrequestsupportinginfo = coverageeligibilityrequestsupportinginfolist.get(coverageeligibilityrequestsupportinginfoi);

		/******************** CvgElgbltyRqst_SprtingInfo_AppliesToAll ********************************************************************************/
		if(coverageeligibilityrequestsupportinginfoi == 0) {c.addCvgElgbltyRqstSprtingInfoAppliesToAll("[");}
		if(coverageeligibilityrequestsupportinginfo.hasAppliesToAll()) {

			c.addCvgElgbltyRqstSprtingInfoAppliesToAll(String.valueOf(coverageeligibilityrequestsupportinginfo.getAppliesToAll()));
		} else {
			c.addCvgElgbltyRqstSprtingInfoAppliesToAll("NULL");
		}

		if(coverageeligibilityrequestsupportinginfoi == coverageeligibilityrequestsupportinginfolist.size()-1) {c.addCvgElgbltyRqstSprtingInfoAppliesToAll("]");}


		/******************** CvgElgbltyRqst_SprtingInfo_Info ********************************************************************************/
		if(coverageeligibilityrequestsupportinginfoi == 0) {c.addCvgElgbltyRqstSprtingInfoInfo("[");}
		if(coverageeligibilityrequestsupportinginfo.hasInformation()) {

			if(coverageeligibilityrequestsupportinginfo.getInformation().getReference() != null) {
			c.addCvgElgbltyRqstSprtingInfoInfo(coverageeligibilityrequestsupportinginfo.getInformation().getReference());
			}
		} else {
			c.addCvgElgbltyRqstSprtingInfoInfo("NULL");
		}

		if(coverageeligibilityrequestsupportinginfoi == coverageeligibilityrequestsupportinginfolist.size()-1) {c.addCvgElgbltyRqstSprtingInfoInfo("]");}


		/******************** CvgElgbltyRqst_SprtingInfo_Sqnc ********************************************************************************/
		if(coverageeligibilityrequestsupportinginfoi == 0) {c.addCvgElgbltyRqstSprtingInfoSqnc("[");}
		if(coverageeligibilityrequestsupportinginfo.hasSequence()) {

			c.addCvgElgbltyRqstSprtingInfoSqnc(String.valueOf(coverageeligibilityrequestsupportinginfo.getSequence()));
		} else {
			c.addCvgElgbltyRqstSprtingInfoSqnc("NULL");
		}

		if(coverageeligibilityrequestsupportinginfoi == coverageeligibilityrequestsupportinginfolist.size()-1) {c.addCvgElgbltyRqstSprtingInfoSqnc("]");}


		 };
		/******************** coverageeligibilityrequestinsurance ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CoverageEligibilityRequest.InsuranceComponent> coverageeligibilityrequestinsurancelist = coverageeligibilityrequest.getInsurance();
		for(int coverageeligibilityrequestinsurancei = 0; coverageeligibilityrequestinsurancei<coverageeligibilityrequestinsurancelist.size();coverageeligibilityrequestinsurancei++ ) {
		org.hl7.fhir.r4.model.CoverageEligibilityRequest.InsuranceComponent  coverageeligibilityrequestinsurance = coverageeligibilityrequestinsurancelist.get(coverageeligibilityrequestinsurancei);

		/******************** CvgElgbltyRqst_Insrnc_Focal ********************************************************************************/
		if(coverageeligibilityrequestinsurancei == 0) {c.addCvgElgbltyRqstInsrncFocal("[");}
		if(coverageeligibilityrequestinsurance.hasFocal()) {

			c.addCvgElgbltyRqstInsrncFocal(String.valueOf(coverageeligibilityrequestinsurance.getFocal()));
		} else {
			c.addCvgElgbltyRqstInsrncFocal("NULL");
		}

		if(coverageeligibilityrequestinsurancei == coverageeligibilityrequestinsurancelist.size()-1) {c.addCvgElgbltyRqstInsrncFocal("]");}


		/******************** CvgElgbltyRqst_Insrnc_Cvg ********************************************************************************/
		if(coverageeligibilityrequestinsurancei == 0) {c.addCvgElgbltyRqstInsrncCvg("[");}
		if(coverageeligibilityrequestinsurance.hasCoverage()) {

			if(coverageeligibilityrequestinsurance.getCoverage().getReference() != null) {
			c.addCvgElgbltyRqstInsrncCvg(coverageeligibilityrequestinsurance.getCoverage().getReference());
			}
		} else {
			c.addCvgElgbltyRqstInsrncCvg("NULL");
		}

		if(coverageeligibilityrequestinsurancei == coverageeligibilityrequestinsurancelist.size()-1) {c.addCvgElgbltyRqstInsrncCvg("]");}


		/******************** CvgElgbltyRqst_Insrnc_BusinessArrangement ********************************************************************************/
		if(coverageeligibilityrequestinsurancei == 0) {c.addCvgElgbltyRqstInsrncBusinessArrangement("[");}
		if(coverageeligibilityrequestinsurance.hasBusinessArrangement()) {

			c.addCvgElgbltyRqstInsrncBusinessArrangement(String.valueOf(coverageeligibilityrequestinsurance.getBusinessArrangement()));
		} else {
			c.addCvgElgbltyRqstInsrncBusinessArrangement("NULL");
		}

		if(coverageeligibilityrequestinsurancei == coverageeligibilityrequestinsurancelist.size()-1) {c.addCvgElgbltyRqstInsrncBusinessArrangement("]");}


		 };
		/******************** CvgElgbltyRqst_Pnt ********************************************************************************/
		if(coverageeligibilityrequest.hasPatient()) {

			if(coverageeligibilityrequest.getPatient().getReference() != null) {
			c.addCvgElgbltyRqstPnt(coverageeligibilityrequest.getPatient().getReference());
			}
		} else {
			c.addCvgElgbltyRqstPnt("NULL");
		}


		/******************** CvgElgbltyRqst_Insurer ********************************************************************************/
		if(coverageeligibilityrequest.hasInsurer()) {

			if(coverageeligibilityrequest.getInsurer().getReference() != null) {
			c.addCvgElgbltyRqstInsurer(coverageeligibilityrequest.getInsurer().getReference());
			}
		} else {
			c.addCvgElgbltyRqstInsurer("NULL");
		}


		return c;
	}
}
