package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CoverageEligibilityResponse;
public class CoverageEligibilityResponseBidirectionalConversion 
{
	public CoverageEligibilityResponse CoverageEligibilityResponses(org.hl7.fhir.r4.model.CoverageEligibilityResponse coverageeligibilityresponse) throws ParseException
	{
		 main.java.com.campfhir.model.CoverageEligibilityResponse c = new  main.java.com.campfhir.model.CoverageEligibilityResponse();

		/******************** id ********************************************************************************/
		c.setId(coverageeligibilityresponse.getIdElement().getIdPart());

		/******************** coverageeligibilityresponsestatus ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityResponse.EligibilityResponseStatus coverageeligibilityresponsestatus = coverageeligibilityresponse.getStatus();
		if(coverageeligibilityresponsestatus!=null) {
			c.addCvgElgbltyRspsSts(coverageeligibilityresponsestatus.toCode());
		} else {
			c.addCvgElgbltyRspsSts("NULL");
		}

		/******************** CvgElgbltyRsps_Created ********************************************************************************/
		if(coverageeligibilityresponse.hasCreated()) {

			c.addCvgElgbltyRspsCreated("\""+ca.uhn.fhir.util.DateUtils.formatDate(coverageeligibilityresponse.getCreated())+"\"");
		} else {
			c.addCvgElgbltyRspsCreated("NULL");
		}


		/******************** CvgElgbltyRsps_Rqst ********************************************************************************/
		if(coverageeligibilityresponse.hasRequest()) {

			if(coverageeligibilityresponse.getRequest().getReference() != null) {
			c.addCvgElgbltyRspsRqst(coverageeligibilityresponse.getRequest().getReference());
			}
		} else {
			c.addCvgElgbltyRspsRqst("NULL");
		}


		/******************** coverageeligibilityresponseidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> coverageeligibilityresponseidentifierlist = coverageeligibilityresponse.getIdentifier();
		for(int coverageeligibilityresponseidentifieri = 0; coverageeligibilityresponseidentifieri<coverageeligibilityresponseidentifierlist.size();coverageeligibilityresponseidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  coverageeligibilityresponseidentifier = coverageeligibilityresponseidentifierlist.get(coverageeligibilityresponseidentifieri);

		/******************** CvgElgbltyRsps_Id_Vl ********************************************************************************/
		if(coverageeligibilityresponseidentifieri == 0) {c.addCvgElgbltyRspsIdVl("[");}
		if(coverageeligibilityresponseidentifier.hasValue()) {

			c.addCvgElgbltyRspsIdVl(String.valueOf(coverageeligibilityresponseidentifier.getValue()));
		} else {
			c.addCvgElgbltyRspsIdVl("NULL");
		}

		if(coverageeligibilityresponseidentifieri == coverageeligibilityresponseidentifierlist.size()-1) {c.addCvgElgbltyRspsIdVl("]");}


		/******************** coverageeligibilityresponseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseidentifiertype = coverageeligibilityresponseidentifier.getType();

		/******************** CvgElgbltyRsps_Id_Typ_Txt ********************************************************************************/
		if(coverageeligibilityresponseidentifieri == 0) {c.addCvgElgbltyRspsIdTypTxt("[");}
		if(coverageeligibilityresponseidentifiertype.hasText()) {

			c.addCvgElgbltyRspsIdTypTxt(String.valueOf(coverageeligibilityresponseidentifiertype.getText()));
		} else {
			c.addCvgElgbltyRspsIdTypTxt("NULL");
		}

		if(coverageeligibilityresponseidentifieri == coverageeligibilityresponseidentifierlist.size()-1) {c.addCvgElgbltyRspsIdTypTxt("]");}


		/******************** coverageeligibilityresponseidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coverageeligibilityresponseidentifiertypecodinglist = coverageeligibilityresponseidentifiertype.getCoding();
		for(int coverageeligibilityresponseidentifiertypecodingi = 0; coverageeligibilityresponseidentifiertypecodingi<coverageeligibilityresponseidentifiertypecodinglist.size();coverageeligibilityresponseidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coverageeligibilityresponseidentifiertypecoding = coverageeligibilityresponseidentifiertypecodinglist.get(coverageeligibilityresponseidentifiertypecodingi);

		/******************** CvgElgbltyRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseidentifiertypecodingi == 0) {c.addCvgElgbltyRspsIdTypCdgDsply("[[");}
		if(coverageeligibilityresponseidentifiertypecoding.hasDisplay()) {

			c.addCvgElgbltyRspsIdTypCdgDsply(String.valueOf(coverageeligibilityresponseidentifiertypecoding.getDisplay()));
		} else {
			c.addCvgElgbltyRspsIdTypCdgDsply("NULL");
		}

		if(coverageeligibilityresponseidentifiertypecodingi == coverageeligibilityresponseidentifiertypecodinglist.size()-1) {c.addCvgElgbltyRspsIdTypCdgDsply("]]");}


		/******************** CvgElgbltyRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseidentifiertypecodingi == 0) {c.addCvgElgbltyRspsIdTypCdgVrsn("[[");}
		if(coverageeligibilityresponseidentifiertypecoding.hasVersion()) {

			c.addCvgElgbltyRspsIdTypCdgVrsn(String.valueOf(coverageeligibilityresponseidentifiertypecoding.getVersion()));
		} else {
			c.addCvgElgbltyRspsIdTypCdgVrsn("NULL");
		}

		if(coverageeligibilityresponseidentifiertypecodingi == coverageeligibilityresponseidentifiertypecodinglist.size()-1) {c.addCvgElgbltyRspsIdTypCdgVrsn("]]");}


		/******************** CvgElgbltyRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseidentifiertypecodingi == 0) {c.addCvgElgbltyRspsIdTypCdgCd("[[");}
		if(coverageeligibilityresponseidentifiertypecoding.hasCode()) {

			c.addCvgElgbltyRspsIdTypCdgCd(String.valueOf(coverageeligibilityresponseidentifiertypecoding.getCode()));
		} else {
			c.addCvgElgbltyRspsIdTypCdgCd("NULL");
		}

		if(coverageeligibilityresponseidentifiertypecodingi == coverageeligibilityresponseidentifiertypecodinglist.size()-1) {c.addCvgElgbltyRspsIdTypCdgCd("]]");}


		/******************** CvgElgbltyRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseidentifiertypecodingi == 0) {c.addCvgElgbltyRspsIdTypCdgUsrSltd("[[");}
		if(coverageeligibilityresponseidentifiertypecoding.hasUserSelected()) {

			c.addCvgElgbltyRspsIdTypCdgUsrSltd(String.valueOf(coverageeligibilityresponseidentifiertypecoding.getUserSelected()));
		} else {
			c.addCvgElgbltyRspsIdTypCdgUsrSltd("NULL");
		}

		if(coverageeligibilityresponseidentifiertypecodingi == coverageeligibilityresponseidentifiertypecodinglist.size()-1) {c.addCvgElgbltyRspsIdTypCdgUsrSltd("]]");}


		/******************** CvgElgbltyRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseidentifiertypecodingi == 0) {c.addCvgElgbltyRspsIdTypCdgSys("[[");}
		if(coverageeligibilityresponseidentifiertypecoding.hasSystem()) {

			c.addCvgElgbltyRspsIdTypCdgSys(String.valueOf(coverageeligibilityresponseidentifiertypecoding.getSystem()));
		} else {
			c.addCvgElgbltyRspsIdTypCdgSys("NULL");
		}

		if(coverageeligibilityresponseidentifiertypecodingi == coverageeligibilityresponseidentifiertypecodinglist.size()-1) {c.addCvgElgbltyRspsIdTypCdgSys("]]");}


		 };
		/******************** coverageeligibilityresponseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageeligibilityresponseidentifierperiod = coverageeligibilityresponseidentifier.getPeriod();

		/******************** CvgElgbltyRsps_Id_Prd_Strt ********************************************************************************/
		if(coverageeligibilityresponseidentifieri == 0) {c.addCvgElgbltyRspsIdPrdStrt("[");}
		if(coverageeligibilityresponseidentifierperiod.hasStart()) {

			c.addCvgElgbltyRspsIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(coverageeligibilityresponseidentifierperiod.getStart())+"\"");
		} else {
			c.addCvgElgbltyRspsIdPrdStrt("NULL");
		}

		if(coverageeligibilityresponseidentifieri == coverageeligibilityresponseidentifierlist.size()-1) {c.addCvgElgbltyRspsIdPrdStrt("]");}


		/******************** CvgElgbltyRsps_Id_Prd_End ********************************************************************************/
		if(coverageeligibilityresponseidentifieri == 0) {c.addCvgElgbltyRspsIdPrdEnd("[");}
		if(coverageeligibilityresponseidentifierperiod.hasEnd()) {

			c.addCvgElgbltyRspsIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(coverageeligibilityresponseidentifierperiod.getEnd())+"\"");
		} else {
			c.addCvgElgbltyRspsIdPrdEnd("NULL");
		}

		if(coverageeligibilityresponseidentifieri == coverageeligibilityresponseidentifierlist.size()-1) {c.addCvgElgbltyRspsIdPrdEnd("]");}


		/******************** coverageeligibilityresponseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse coverageeligibilityresponseidentifieruse = coverageeligibilityresponseidentifier.getUse();
		if(coverageeligibilityresponseidentifieruse!=null) {
		if(coverageeligibilityresponseidentifieri == 0) {

		c.addCvgElgbltyRspsIdUse("[");		}
			c.addCvgElgbltyRspsIdUse(coverageeligibilityresponseidentifieruse.toCode());
		if(coverageeligibilityresponseidentifieri == coverageeligibilityresponseidentifierlist.size()-1) {

		c.addCvgElgbltyRspsIdUse("]");		}

		} else {
			c.addCvgElgbltyRspsIdUse("NULL");
		}

		/******************** CvgElgbltyRsps_Id_Assigner ********************************************************************************/
		if(coverageeligibilityresponseidentifieri == 0) {c.addCvgElgbltyRspsIdAssigner("[");}
		if(coverageeligibilityresponseidentifier.hasAssigner()) {

			if(coverageeligibilityresponseidentifier.getAssigner().getReference() != null) {
			c.addCvgElgbltyRspsIdAssigner(coverageeligibilityresponseidentifier.getAssigner().getReference());
			}
		} else {
			c.addCvgElgbltyRspsIdAssigner("NULL");
		}

		if(coverageeligibilityresponseidentifieri == coverageeligibilityresponseidentifierlist.size()-1) {c.addCvgElgbltyRspsIdAssigner("]");}


		/******************** CvgElgbltyRsps_Id_Sys ********************************************************************************/
		if(coverageeligibilityresponseidentifieri == 0) {c.addCvgElgbltyRspsIdSys("[");}
		if(coverageeligibilityresponseidentifier.hasSystem()) {

			c.addCvgElgbltyRspsIdSys(String.valueOf(coverageeligibilityresponseidentifier.getSystem()));
		} else {
			c.addCvgElgbltyRspsIdSys("NULL");
		}

		if(coverageeligibilityresponseidentifieri == coverageeligibilityresponseidentifierlist.size()-1) {c.addCvgElgbltyRspsIdSys("]");}


		 };
		/******************** CvgElgbltyRsps_Disposition ********************************************************************************/
		if(coverageeligibilityresponse.hasDisposition()) {

			c.addCvgElgbltyRspsDisposition(String.valueOf(coverageeligibilityresponse.getDisposition()));
		} else {
			c.addCvgElgbltyRspsDisposition("NULL");
		}


		/******************** coverageeligibilityresponseoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.RemittanceOutcome coverageeligibilityresponseoutcome = coverageeligibilityresponse.getOutcome();
		if(coverageeligibilityresponseoutcome!=null) {
			c.addCvgElgbltyRspsOutcome(coverageeligibilityresponseoutcome.toCode());
		} else {
			c.addCvgElgbltyRspsOutcome("NULL");
		}

		/******************** CvgElgbltyRsps_Rqstor ********************************************************************************/
		if(coverageeligibilityresponse.hasRequestor()) {

			if(coverageeligibilityresponse.getRequestor().getReference() != null) {
			c.addCvgElgbltyRspsRqstor(coverageeligibilityresponse.getRequestor().getReference());
			}
		} else {
			c.addCvgElgbltyRspsRqstor("NULL");
		}


		/******************** CvgElgbltyRsps_PreAuthRef ********************************************************************************/
		if(coverageeligibilityresponse.hasPreAuthRef()) {

			c.addCvgElgbltyRspsPreAuthRef(String.valueOf(coverageeligibilityresponse.getPreAuthRef()));
		} else {
			c.addCvgElgbltyRspsPreAuthRef("NULL");
		}


		/******************** coverageeligibilityresponseform ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseform = coverageeligibilityresponse.getForm();

		/******************** CvgElgbltyRsps_Frm_Txt ********************************************************************************/
		if(coverageeligibilityresponseform.hasText()) {

			c.addCvgElgbltyRspsFrmTxt(String.valueOf(coverageeligibilityresponseform.getText()));
		} else {
			c.addCvgElgbltyRspsFrmTxt("NULL");
		}


		/******************** coverageeligibilityresponseformcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coverageeligibilityresponseformcodinglist = coverageeligibilityresponseform.getCoding();
		for(int coverageeligibilityresponseformcodingi = 0; coverageeligibilityresponseformcodingi<coverageeligibilityresponseformcodinglist.size();coverageeligibilityresponseformcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coverageeligibilityresponseformcoding = coverageeligibilityresponseformcodinglist.get(coverageeligibilityresponseformcodingi);

		/******************** CvgElgbltyRsps_Frm_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseformcodingi == 0) {c.addCvgElgbltyRspsFrmCdgDsply("[");}
		if(coverageeligibilityresponseformcoding.hasDisplay()) {

			c.addCvgElgbltyRspsFrmCdgDsply(String.valueOf(coverageeligibilityresponseformcoding.getDisplay()));
		} else {
			c.addCvgElgbltyRspsFrmCdgDsply("NULL");
		}

		if(coverageeligibilityresponseformcodingi == coverageeligibilityresponseformcodinglist.size()-1) {c.addCvgElgbltyRspsFrmCdgDsply("]");}


		/******************** CvgElgbltyRsps_Frm_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseformcodingi == 0) {c.addCvgElgbltyRspsFrmCdgVrsn("[");}
		if(coverageeligibilityresponseformcoding.hasVersion()) {

			c.addCvgElgbltyRspsFrmCdgVrsn(String.valueOf(coverageeligibilityresponseformcoding.getVersion()));
		} else {
			c.addCvgElgbltyRspsFrmCdgVrsn("NULL");
		}

		if(coverageeligibilityresponseformcodingi == coverageeligibilityresponseformcodinglist.size()-1) {c.addCvgElgbltyRspsFrmCdgVrsn("]");}


		/******************** CvgElgbltyRsps_Frm_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseformcodingi == 0) {c.addCvgElgbltyRspsFrmCdgCd("[");}
		if(coverageeligibilityresponseformcoding.hasCode()) {

			c.addCvgElgbltyRspsFrmCdgCd(String.valueOf(coverageeligibilityresponseformcoding.getCode()));
		} else {
			c.addCvgElgbltyRspsFrmCdgCd("NULL");
		}

		if(coverageeligibilityresponseformcodingi == coverageeligibilityresponseformcodinglist.size()-1) {c.addCvgElgbltyRspsFrmCdgCd("]");}


		/******************** CvgElgbltyRsps_Frm_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseformcodingi == 0) {c.addCvgElgbltyRspsFrmCdgUsrSltd("[");}
		if(coverageeligibilityresponseformcoding.hasUserSelected()) {

			c.addCvgElgbltyRspsFrmCdgUsrSltd(String.valueOf(coverageeligibilityresponseformcoding.getUserSelected()));
		} else {
			c.addCvgElgbltyRspsFrmCdgUsrSltd("NULL");
		}

		if(coverageeligibilityresponseformcodingi == coverageeligibilityresponseformcodinglist.size()-1) {c.addCvgElgbltyRspsFrmCdgUsrSltd("]");}


		/******************** CvgElgbltyRsps_Frm_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseformcodingi == 0) {c.addCvgElgbltyRspsFrmCdgSys("[");}
		if(coverageeligibilityresponseformcoding.hasSystem()) {

			c.addCvgElgbltyRspsFrmCdgSys(String.valueOf(coverageeligibilityresponseformcoding.getSystem()));
		} else {
			c.addCvgElgbltyRspsFrmCdgSys("NULL");
		}

		if(coverageeligibilityresponseformcodingi == coverageeligibilityresponseformcodinglist.size()-1) {c.addCvgElgbltyRspsFrmCdgSys("]");}


		 };
		/******************** CvgElgbltyRsps_SrvdDtTyp ********************************************************************************/
		if(coverageeligibilityresponse.hasServicedDateType()) {

			c.addCvgElgbltyRspsSrvdDtTyp("\""+coverageeligibilityresponse.getServicedDateType().getValueAsString()+"\"");
		} else {
			c.addCvgElgbltyRspsSrvdDtTyp("NULL");
		}


		/******************** coverageeligibilityresponsepurpose ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.CoverageEligibilityResponse.EligibilityResponsePurpose>> coverageeligibilityresponsepurposelist = coverageeligibilityresponse.getPurpose();
		for(int coverageeligibilityresponsepurposei = 0; coverageeligibilityresponsepurposei<coverageeligibilityresponsepurposelist.size();coverageeligibilityresponsepurposei++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.CoverageEligibilityResponse.EligibilityResponsePurpose>  coverageeligibilityresponsepurpose = coverageeligibilityresponsepurposelist.get(coverageeligibilityresponsepurposei);
		if(coverageeligibilityresponsepurpose!=null) {
			c.addCvgElgbltyRspsPrpse(coverageeligibilityresponsepurpose.getCode());
		} else {
			c.addCvgElgbltyRspsPrpse("NULL");
		}
		 };

		/******************** coverageeligibilityresponseservicedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageeligibilityresponseservicedperiod = coverageeligibilityresponse.getServicedPeriod();

		/******************** CvgElgbltyRsps_SrvdPrd_Strt ********************************************************************************/
		if(coverageeligibilityresponseservicedperiod.hasStart()) {

			c.addCvgElgbltyRspsSrvdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(coverageeligibilityresponseservicedperiod.getStart())+"\"");
		} else {
			c.addCvgElgbltyRspsSrvdPrdStrt("NULL");
		}


		/******************** CvgElgbltyRsps_SrvdPrd_End ********************************************************************************/
		if(coverageeligibilityresponseservicedperiod.hasEnd()) {

			c.addCvgElgbltyRspsSrvdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(coverageeligibilityresponseservicedperiod.getEnd())+"\"");
		} else {
			c.addCvgElgbltyRspsSrvdPrdEnd("NULL");
		}


		/******************** coverageeligibilityresponseinsurance ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CoverageEligibilityResponse.InsuranceComponent> coverageeligibilityresponseinsurancelist = coverageeligibilityresponse.getInsurance();
		for(int coverageeligibilityresponseinsurancei = 0; coverageeligibilityresponseinsurancei<coverageeligibilityresponseinsurancelist.size();coverageeligibilityresponseinsurancei++ ) {
		org.hl7.fhir.r4.model.CoverageEligibilityResponse.InsuranceComponent  coverageeligibilityresponseinsurance = coverageeligibilityresponseinsurancelist.get(coverageeligibilityresponseinsurancei);

		/******************** coverageeligibilityresponseinsuranceitem ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CoverageEligibilityResponse.ItemsComponent> coverageeligibilityresponseinsuranceitemlist = coverageeligibilityresponseinsurance.getItem();
		for(int coverageeligibilityresponseinsuranceitemi = 0; coverageeligibilityresponseinsuranceitemi<coverageeligibilityresponseinsuranceitemlist.size();coverageeligibilityresponseinsuranceitemi++ ) {
		org.hl7.fhir.r4.model.CoverageEligibilityResponse.ItemsComponent  coverageeligibilityresponseinsuranceitem = coverageeligibilityresponseinsuranceitemlist.get(coverageeligibilityresponseinsuranceitemi);

		/******************** CvgElgbltyRsps_Insrnc_Itm_Nm ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemi == 0) {c.addCvgElgbltyRspsInsrncItmNm("[[");}
		if(coverageeligibilityresponseinsuranceitem.hasName()) {

			c.addCvgElgbltyRspsInsrncItmNm(String.valueOf(coverageeligibilityresponseinsuranceitem.getName()));
		} else {
			c.addCvgElgbltyRspsInsrncItmNm("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemi == coverageeligibilityresponseinsuranceitemlist.size()-1) {c.addCvgElgbltyRspsInsrncItmNm("]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Provider ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemi == 0) {c.addCvgElgbltyRspsInsrncItmProvider("[[");}
		if(coverageeligibilityresponseinsuranceitem.hasProvider()) {

			if(coverageeligibilityresponseinsuranceitem.getProvider().getReference() != null) {
			c.addCvgElgbltyRspsInsrncItmProvider(coverageeligibilityresponseinsuranceitem.getProvider().getReference());
			}
		} else {
			c.addCvgElgbltyRspsInsrncItmProvider("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemi == coverageeligibilityresponseinsuranceitemlist.size()-1) {c.addCvgElgbltyRspsInsrncItmProvider("]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Dscrptn ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemi == 0) {c.addCvgElgbltyRspsInsrncItmDscrptn("[[");}
		if(coverageeligibilityresponseinsuranceitem.hasDescription()) {

			c.addCvgElgbltyRspsInsrncItmDscrptn(String.valueOf(coverageeligibilityresponseinsuranceitem.getDescription()));
		} else {
			c.addCvgElgbltyRspsInsrncItmDscrptn("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemi == coverageeligibilityresponseinsuranceitemlist.size()-1) {c.addCvgElgbltyRspsInsrncItmDscrptn("]]");}


		/******************** coverageeligibilityresponseinsuranceitemcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitemcategory = coverageeligibilityresponseinsuranceitem.getCategory();

		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Txt ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemi == 0) {c.addCvgElgbltyRspsInsrncItmCtgryTxt("[[");}
		if(coverageeligibilityresponseinsuranceitemcategory.hasText()) {

			c.addCvgElgbltyRspsInsrncItmCtgryTxt(String.valueOf(coverageeligibilityresponseinsuranceitemcategory.getText()));
		} else {
			c.addCvgElgbltyRspsInsrncItmCtgryTxt("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemi == coverageeligibilityresponseinsuranceitemlist.size()-1) {c.addCvgElgbltyRspsInsrncItmCtgryTxt("]]");}


		/******************** coverageeligibilityresponseinsuranceitemcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coverageeligibilityresponseinsuranceitemcategorycodinglist = coverageeligibilityresponseinsuranceitemcategory.getCoding();
		for(int coverageeligibilityresponseinsuranceitemcategorycodingi = 0; coverageeligibilityresponseinsuranceitemcategorycodingi<coverageeligibilityresponseinsuranceitemcategorycodinglist.size();coverageeligibilityresponseinsuranceitemcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coverageeligibilityresponseinsuranceitemcategorycoding = coverageeligibilityresponseinsuranceitemcategorycodinglist.get(coverageeligibilityresponseinsuranceitemcategorycodingi);

		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemcategorycodingi == 0) {c.addCvgElgbltyRspsInsrncItmCtgryCdgDsply("[[[");}
		if(coverageeligibilityresponseinsuranceitemcategorycoding.hasDisplay()) {

			c.addCvgElgbltyRspsInsrncItmCtgryCdgDsply(String.valueOf(coverageeligibilityresponseinsuranceitemcategorycoding.getDisplay()));
		} else {
			c.addCvgElgbltyRspsInsrncItmCtgryCdgDsply("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemcategorycodingi == coverageeligibilityresponseinsuranceitemcategorycodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmCtgryCdgDsply("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemcategorycodingi == 0) {c.addCvgElgbltyRspsInsrncItmCtgryCdgVrsn("[[[");}
		if(coverageeligibilityresponseinsuranceitemcategorycoding.hasVersion()) {

			c.addCvgElgbltyRspsInsrncItmCtgryCdgVrsn(String.valueOf(coverageeligibilityresponseinsuranceitemcategorycoding.getVersion()));
		} else {
			c.addCvgElgbltyRspsInsrncItmCtgryCdgVrsn("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemcategorycodingi == coverageeligibilityresponseinsuranceitemcategorycodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmCtgryCdgVrsn("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemcategorycodingi == 0) {c.addCvgElgbltyRspsInsrncItmCtgryCdgCd("[[[");}
		if(coverageeligibilityresponseinsuranceitemcategorycoding.hasCode()) {

			c.addCvgElgbltyRspsInsrncItmCtgryCdgCd(String.valueOf(coverageeligibilityresponseinsuranceitemcategorycoding.getCode()));
		} else {
			c.addCvgElgbltyRspsInsrncItmCtgryCdgCd("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemcategorycodingi == coverageeligibilityresponseinsuranceitemcategorycodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmCtgryCdgCd("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemcategorycodingi == 0) {c.addCvgElgbltyRspsInsrncItmCtgryCdgUsrSltd("[[[");}
		if(coverageeligibilityresponseinsuranceitemcategorycoding.hasUserSelected()) {

			c.addCvgElgbltyRspsInsrncItmCtgryCdgUsrSltd(String.valueOf(coverageeligibilityresponseinsuranceitemcategorycoding.getUserSelected()));
		} else {
			c.addCvgElgbltyRspsInsrncItmCtgryCdgUsrSltd("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemcategorycodingi == coverageeligibilityresponseinsuranceitemcategorycodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmCtgryCdgUsrSltd("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemcategorycodingi == 0) {c.addCvgElgbltyRspsInsrncItmCtgryCdgSys("[[[");}
		if(coverageeligibilityresponseinsuranceitemcategorycoding.hasSystem()) {

			c.addCvgElgbltyRspsInsrncItmCtgryCdgSys(String.valueOf(coverageeligibilityresponseinsuranceitemcategorycoding.getSystem()));
		} else {
			c.addCvgElgbltyRspsInsrncItmCtgryCdgSys("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemcategorycodingi == coverageeligibilityresponseinsuranceitemcategorycodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmCtgryCdgSys("]]]");}


		 };
		/******************** coverageeligibilityresponseinsuranceitemmodifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> coverageeligibilityresponseinsuranceitemmodifierlist = coverageeligibilityresponseinsuranceitem.getModifier();
		for(int coverageeligibilityresponseinsuranceitemmodifieri = 0; coverageeligibilityresponseinsuranceitemmodifieri<coverageeligibilityresponseinsuranceitemmodifierlist.size();coverageeligibilityresponseinsuranceitemmodifieri++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  coverageeligibilityresponseinsuranceitemmodifier = coverageeligibilityresponseinsuranceitemmodifierlist.get(coverageeligibilityresponseinsuranceitemmodifieri);

		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Txt ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemmodifieri == 0) {c.addCvgElgbltyRspsInsrncItmMdfrTxt("[[[");}
		if(coverageeligibilityresponseinsuranceitemmodifier.hasText()) {

			c.addCvgElgbltyRspsInsrncItmMdfrTxt(String.valueOf(coverageeligibilityresponseinsuranceitemmodifier.getText()));
		} else {
			c.addCvgElgbltyRspsInsrncItmMdfrTxt("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemmodifieri == coverageeligibilityresponseinsuranceitemmodifierlist.size()-1) {c.addCvgElgbltyRspsInsrncItmMdfrTxt("]]]");}


		/******************** coverageeligibilityresponseinsuranceitemmodifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coverageeligibilityresponseinsuranceitemmodifiercodinglist = coverageeligibilityresponseinsuranceitemmodifier.getCoding();
		for(int coverageeligibilityresponseinsuranceitemmodifiercodingi = 0; coverageeligibilityresponseinsuranceitemmodifiercodingi<coverageeligibilityresponseinsuranceitemmodifiercodinglist.size();coverageeligibilityresponseinsuranceitemmodifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coverageeligibilityresponseinsuranceitemmodifiercoding = coverageeligibilityresponseinsuranceitemmodifiercodinglist.get(coverageeligibilityresponseinsuranceitemmodifiercodingi);

		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemmodifiercodingi == 0) {c.addCvgElgbltyRspsInsrncItmMdfrCdgDsply("[[[[");}
		if(coverageeligibilityresponseinsuranceitemmodifiercoding.hasDisplay()) {

			c.addCvgElgbltyRspsInsrncItmMdfrCdgDsply(String.valueOf(coverageeligibilityresponseinsuranceitemmodifiercoding.getDisplay()));
		} else {
			c.addCvgElgbltyRspsInsrncItmMdfrCdgDsply("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemmodifiercodingi == coverageeligibilityresponseinsuranceitemmodifiercodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmMdfrCdgDsply("]]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemmodifiercodingi == 0) {c.addCvgElgbltyRspsInsrncItmMdfrCdgVrsn("[[[[");}
		if(coverageeligibilityresponseinsuranceitemmodifiercoding.hasVersion()) {

			c.addCvgElgbltyRspsInsrncItmMdfrCdgVrsn(String.valueOf(coverageeligibilityresponseinsuranceitemmodifiercoding.getVersion()));
		} else {
			c.addCvgElgbltyRspsInsrncItmMdfrCdgVrsn("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemmodifiercodingi == coverageeligibilityresponseinsuranceitemmodifiercodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmMdfrCdgVrsn("]]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemmodifiercodingi == 0) {c.addCvgElgbltyRspsInsrncItmMdfrCdgCd("[[[[");}
		if(coverageeligibilityresponseinsuranceitemmodifiercoding.hasCode()) {

			c.addCvgElgbltyRspsInsrncItmMdfrCdgCd(String.valueOf(coverageeligibilityresponseinsuranceitemmodifiercoding.getCode()));
		} else {
			c.addCvgElgbltyRspsInsrncItmMdfrCdgCd("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemmodifiercodingi == coverageeligibilityresponseinsuranceitemmodifiercodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmMdfrCdgCd("]]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemmodifiercodingi == 0) {c.addCvgElgbltyRspsInsrncItmMdfrCdgUsrSltd("[[[[");}
		if(coverageeligibilityresponseinsuranceitemmodifiercoding.hasUserSelected()) {

			c.addCvgElgbltyRspsInsrncItmMdfrCdgUsrSltd(String.valueOf(coverageeligibilityresponseinsuranceitemmodifiercoding.getUserSelected()));
		} else {
			c.addCvgElgbltyRspsInsrncItmMdfrCdgUsrSltd("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemmodifiercodingi == coverageeligibilityresponseinsuranceitemmodifiercodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmMdfrCdgUsrSltd("]]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemmodifiercodingi == 0) {c.addCvgElgbltyRspsInsrncItmMdfrCdgSys("[[[[");}
		if(coverageeligibilityresponseinsuranceitemmodifiercoding.hasSystem()) {

			c.addCvgElgbltyRspsInsrncItmMdfrCdgSys(String.valueOf(coverageeligibilityresponseinsuranceitemmodifiercoding.getSystem()));
		} else {
			c.addCvgElgbltyRspsInsrncItmMdfrCdgSys("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemmodifiercodingi == coverageeligibilityresponseinsuranceitemmodifiercodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmMdfrCdgSys("]]]]");}


		 };
		 };
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnRequired ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitem.hasAuthorizationRequired()) {

			c.addCvgElgbltyRspsInsrncItmAthztnRequired(String.valueOf(coverageeligibilityresponseinsuranceitem.getAuthorizationRequired()));
		} else {
			c.addCvgElgbltyRspsInsrncItmAthztnRequired("NULL");
		}


		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnUrl ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitem.hasAuthorizationUrl()) {

			c.addCvgElgbltyRspsInsrncItmAthztnUrl(String.valueOf(coverageeligibilityresponseinsuranceitem.getAuthorizationUrl()));
		} else {
			c.addCvgElgbltyRspsInsrncItmAthztnUrl("NULL");
		}


		/******************** coverageeligibilityresponseinsuranceitemauthorizationsupporting ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> coverageeligibilityresponseinsuranceitemauthorizationsupportinglist = coverageeligibilityresponseinsuranceitem.getAuthorizationSupporting();
		for(int coverageeligibilityresponseinsuranceitemauthorizationsupportingi = 0; coverageeligibilityresponseinsuranceitemauthorizationsupportingi<coverageeligibilityresponseinsuranceitemauthorizationsupportinglist.size();coverageeligibilityresponseinsuranceitemauthorizationsupportingi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  coverageeligibilityresponseinsuranceitemauthorizationsupporting = coverageeligibilityresponseinsuranceitemauthorizationsupportinglist.get(coverageeligibilityresponseinsuranceitemauthorizationsupportingi);

		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Txt ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingi == 0) {c.addCvgElgbltyRspsInsrncItmAthztnSprtingTxt("[[[");}
		if(coverageeligibilityresponseinsuranceitemauthorizationsupporting.hasText()) {

			c.addCvgElgbltyRspsInsrncItmAthztnSprtingTxt(String.valueOf(coverageeligibilityresponseinsuranceitemauthorizationsupporting.getText()));
		} else {
			c.addCvgElgbltyRspsInsrncItmAthztnSprtingTxt("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingi == coverageeligibilityresponseinsuranceitemauthorizationsupportinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmAthztnSprtingTxt("]]]");}


		/******************** coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coverageeligibilityresponseinsuranceitemauthorizationsupportingcodinglist = coverageeligibilityresponseinsuranceitemauthorizationsupporting.getCoding();
		for(int coverageeligibilityresponseinsuranceitemauthorizationsupportingcodingi = 0; coverageeligibilityresponseinsuranceitemauthorizationsupportingcodingi<coverageeligibilityresponseinsuranceitemauthorizationsupportingcodinglist.size();coverageeligibilityresponseinsuranceitemauthorizationsupportingcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding = coverageeligibilityresponseinsuranceitemauthorizationsupportingcodinglist.get(coverageeligibilityresponseinsuranceitemauthorizationsupportingcodingi);

		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcodingi == 0) {c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgDsply("[[[[");}
		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.hasDisplay()) {

			c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgDsply(String.valueOf(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.getDisplay()));
		} else {
			c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgDsply("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcodingi == coverageeligibilityresponseinsuranceitemauthorizationsupportingcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgDsply("]]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcodingi == 0) {c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgVrsn("[[[[");}
		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.hasVersion()) {

			c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgVrsn(String.valueOf(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.getVersion()));
		} else {
			c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgVrsn("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcodingi == coverageeligibilityresponseinsuranceitemauthorizationsupportingcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgVrsn("]]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcodingi == 0) {c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgCd("[[[[");}
		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.hasCode()) {

			c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgCd(String.valueOf(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.getCode()));
		} else {
			c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgCd("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcodingi == coverageeligibilityresponseinsuranceitemauthorizationsupportingcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgCd("]]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcodingi == 0) {c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgUsrSltd("[[[[");}
		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.hasUserSelected()) {

			c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgUsrSltd(String.valueOf(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.getUserSelected()));
		} else {
			c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgUsrSltd("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcodingi == coverageeligibilityresponseinsuranceitemauthorizationsupportingcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgUsrSltd("]]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcodingi == 0) {c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgSys("[[[[");}
		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.hasSystem()) {

			c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgSys(String.valueOf(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.getSystem()));
		} else {
			c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgSys("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcodingi == coverageeligibilityresponseinsuranceitemauthorizationsupportingcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmAthztnSprtingCdgSys("]]]]");}


		 };
		 };
		/******************** coverageeligibilityresponseinsuranceitemunit ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitemunit = coverageeligibilityresponseinsuranceitem.getUnit();

		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Txt ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemunit.hasText()) {

			c.addCvgElgbltyRspsInsrncItmUntTxt(String.valueOf(coverageeligibilityresponseinsuranceitemunit.getText()));
		} else {
			c.addCvgElgbltyRspsInsrncItmUntTxt("NULL");
		}


		/******************** coverageeligibilityresponseinsuranceitemunitcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coverageeligibilityresponseinsuranceitemunitcodinglist = coverageeligibilityresponseinsuranceitemunit.getCoding();
		for(int coverageeligibilityresponseinsuranceitemunitcodingi = 0; coverageeligibilityresponseinsuranceitemunitcodingi<coverageeligibilityresponseinsuranceitemunitcodinglist.size();coverageeligibilityresponseinsuranceitemunitcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coverageeligibilityresponseinsuranceitemunitcoding = coverageeligibilityresponseinsuranceitemunitcodinglist.get(coverageeligibilityresponseinsuranceitemunitcodingi);

		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemunitcodingi == 0) {c.addCvgElgbltyRspsInsrncItmUntCdgDsply("[[[");}
		if(coverageeligibilityresponseinsuranceitemunitcoding.hasDisplay()) {

			c.addCvgElgbltyRspsInsrncItmUntCdgDsply(String.valueOf(coverageeligibilityresponseinsuranceitemunitcoding.getDisplay()));
		} else {
			c.addCvgElgbltyRspsInsrncItmUntCdgDsply("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemunitcodingi == coverageeligibilityresponseinsuranceitemunitcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmUntCdgDsply("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemunitcodingi == 0) {c.addCvgElgbltyRspsInsrncItmUntCdgVrsn("[[[");}
		if(coverageeligibilityresponseinsuranceitemunitcoding.hasVersion()) {

			c.addCvgElgbltyRspsInsrncItmUntCdgVrsn(String.valueOf(coverageeligibilityresponseinsuranceitemunitcoding.getVersion()));
		} else {
			c.addCvgElgbltyRspsInsrncItmUntCdgVrsn("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemunitcodingi == coverageeligibilityresponseinsuranceitemunitcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmUntCdgVrsn("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemunitcodingi == 0) {c.addCvgElgbltyRspsInsrncItmUntCdgCd("[[[");}
		if(coverageeligibilityresponseinsuranceitemunitcoding.hasCode()) {

			c.addCvgElgbltyRspsInsrncItmUntCdgCd(String.valueOf(coverageeligibilityresponseinsuranceitemunitcoding.getCode()));
		} else {
			c.addCvgElgbltyRspsInsrncItmUntCdgCd("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemunitcodingi == coverageeligibilityresponseinsuranceitemunitcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmUntCdgCd("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemunitcodingi == 0) {c.addCvgElgbltyRspsInsrncItmUntCdgUsrSltd("[[[");}
		if(coverageeligibilityresponseinsuranceitemunitcoding.hasUserSelected()) {

			c.addCvgElgbltyRspsInsrncItmUntCdgUsrSltd(String.valueOf(coverageeligibilityresponseinsuranceitemunitcoding.getUserSelected()));
		} else {
			c.addCvgElgbltyRspsInsrncItmUntCdgUsrSltd("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemunitcodingi == coverageeligibilityresponseinsuranceitemunitcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmUntCdgUsrSltd("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemunitcodingi == 0) {c.addCvgElgbltyRspsInsrncItmUntCdgSys("[[[");}
		if(coverageeligibilityresponseinsuranceitemunitcoding.hasSystem()) {

			c.addCvgElgbltyRspsInsrncItmUntCdgSys(String.valueOf(coverageeligibilityresponseinsuranceitemunitcoding.getSystem()));
		} else {
			c.addCvgElgbltyRspsInsrncItmUntCdgSys("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemunitcodingi == coverageeligibilityresponseinsuranceitemunitcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmUntCdgSys("]]]");}


		 };
		/******************** coverageeligibilityresponseinsuranceitemnetwork ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitemnetwork = coverageeligibilityresponseinsuranceitem.getNetwork();

		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Txt ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemnetwork.hasText()) {

			c.addCvgElgbltyRspsInsrncItmNetworkTxt(String.valueOf(coverageeligibilityresponseinsuranceitemnetwork.getText()));
		} else {
			c.addCvgElgbltyRspsInsrncItmNetworkTxt("NULL");
		}


		/******************** coverageeligibilityresponseinsuranceitemnetworkcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coverageeligibilityresponseinsuranceitemnetworkcodinglist = coverageeligibilityresponseinsuranceitemnetwork.getCoding();
		for(int coverageeligibilityresponseinsuranceitemnetworkcodingi = 0; coverageeligibilityresponseinsuranceitemnetworkcodingi<coverageeligibilityresponseinsuranceitemnetworkcodinglist.size();coverageeligibilityresponseinsuranceitemnetworkcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coverageeligibilityresponseinsuranceitemnetworkcoding = coverageeligibilityresponseinsuranceitemnetworkcodinglist.get(coverageeligibilityresponseinsuranceitemnetworkcodingi);

		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemnetworkcodingi == 0) {c.addCvgElgbltyRspsInsrncItmNetworkCdgDsply("[[[");}
		if(coverageeligibilityresponseinsuranceitemnetworkcoding.hasDisplay()) {

			c.addCvgElgbltyRspsInsrncItmNetworkCdgDsply(String.valueOf(coverageeligibilityresponseinsuranceitemnetworkcoding.getDisplay()));
		} else {
			c.addCvgElgbltyRspsInsrncItmNetworkCdgDsply("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemnetworkcodingi == coverageeligibilityresponseinsuranceitemnetworkcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmNetworkCdgDsply("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemnetworkcodingi == 0) {c.addCvgElgbltyRspsInsrncItmNetworkCdgVrsn("[[[");}
		if(coverageeligibilityresponseinsuranceitemnetworkcoding.hasVersion()) {

			c.addCvgElgbltyRspsInsrncItmNetworkCdgVrsn(String.valueOf(coverageeligibilityresponseinsuranceitemnetworkcoding.getVersion()));
		} else {
			c.addCvgElgbltyRspsInsrncItmNetworkCdgVrsn("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemnetworkcodingi == coverageeligibilityresponseinsuranceitemnetworkcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmNetworkCdgVrsn("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemnetworkcodingi == 0) {c.addCvgElgbltyRspsInsrncItmNetworkCdgCd("[[[");}
		if(coverageeligibilityresponseinsuranceitemnetworkcoding.hasCode()) {

			c.addCvgElgbltyRspsInsrncItmNetworkCdgCd(String.valueOf(coverageeligibilityresponseinsuranceitemnetworkcoding.getCode()));
		} else {
			c.addCvgElgbltyRspsInsrncItmNetworkCdgCd("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemnetworkcodingi == coverageeligibilityresponseinsuranceitemnetworkcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmNetworkCdgCd("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemnetworkcodingi == 0) {c.addCvgElgbltyRspsInsrncItmNetworkCdgUsrSltd("[[[");}
		if(coverageeligibilityresponseinsuranceitemnetworkcoding.hasUserSelected()) {

			c.addCvgElgbltyRspsInsrncItmNetworkCdgUsrSltd(String.valueOf(coverageeligibilityresponseinsuranceitemnetworkcoding.getUserSelected()));
		} else {
			c.addCvgElgbltyRspsInsrncItmNetworkCdgUsrSltd("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemnetworkcodingi == coverageeligibilityresponseinsuranceitemnetworkcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmNetworkCdgUsrSltd("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemnetworkcodingi == 0) {c.addCvgElgbltyRspsInsrncItmNetworkCdgSys("[[[");}
		if(coverageeligibilityresponseinsuranceitemnetworkcoding.hasSystem()) {

			c.addCvgElgbltyRspsInsrncItmNetworkCdgSys(String.valueOf(coverageeligibilityresponseinsuranceitemnetworkcoding.getSystem()));
		} else {
			c.addCvgElgbltyRspsInsrncItmNetworkCdgSys("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemnetworkcodingi == coverageeligibilityresponseinsuranceitemnetworkcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmNetworkCdgSys("]]]");}


		 };
		/******************** coverageeligibilityresponseinsuranceitembenefit ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CoverageEligibilityResponse.BenefitComponent> coverageeligibilityresponseinsuranceitembenefitlist = coverageeligibilityresponseinsuranceitem.getBenefit();
		for(int coverageeligibilityresponseinsuranceitembenefiti = 0; coverageeligibilityresponseinsuranceitembenefiti<coverageeligibilityresponseinsuranceitembenefitlist.size();coverageeligibilityresponseinsuranceitembenefiti++ ) {
		org.hl7.fhir.r4.model.CoverageEligibilityResponse.BenefitComponent  coverageeligibilityresponseinsuranceitembenefit = coverageeligibilityresponseinsuranceitembenefitlist.get(coverageeligibilityresponseinsuranceitembenefiti);

		/******************** coverageeligibilityresponseinsuranceitembenefittype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitembenefittype = coverageeligibilityresponseinsuranceitembenefit.getType();

		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Txt ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefiti == 0) {c.addCvgElgbltyRspsInsrncItmBnftTypTxt("[[[");}
		if(coverageeligibilityresponseinsuranceitembenefittype.hasText()) {

			c.addCvgElgbltyRspsInsrncItmBnftTypTxt(String.valueOf(coverageeligibilityresponseinsuranceitembenefittype.getText()));
		} else {
			c.addCvgElgbltyRspsInsrncItmBnftTypTxt("NULL");
		}

		if(coverageeligibilityresponseinsuranceitembenefiti == coverageeligibilityresponseinsuranceitembenefitlist.size()-1) {c.addCvgElgbltyRspsInsrncItmBnftTypTxt("]]]");}


		/******************** coverageeligibilityresponseinsuranceitembenefittypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coverageeligibilityresponseinsuranceitembenefittypecodinglist = coverageeligibilityresponseinsuranceitembenefittype.getCoding();
		for(int coverageeligibilityresponseinsuranceitembenefittypecodingi = 0; coverageeligibilityresponseinsuranceitembenefittypecodingi<coverageeligibilityresponseinsuranceitembenefittypecodinglist.size();coverageeligibilityresponseinsuranceitembenefittypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coverageeligibilityresponseinsuranceitembenefittypecoding = coverageeligibilityresponseinsuranceitembenefittypecodinglist.get(coverageeligibilityresponseinsuranceitembenefittypecodingi);

		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefittypecodingi == 0) {c.addCvgElgbltyRspsInsrncItmBnftTypCdgDsply("[[[[");}
		if(coverageeligibilityresponseinsuranceitembenefittypecoding.hasDisplay()) {

			c.addCvgElgbltyRspsInsrncItmBnftTypCdgDsply(String.valueOf(coverageeligibilityresponseinsuranceitembenefittypecoding.getDisplay()));
		} else {
			c.addCvgElgbltyRspsInsrncItmBnftTypCdgDsply("NULL");
		}

		if(coverageeligibilityresponseinsuranceitembenefittypecodingi == coverageeligibilityresponseinsuranceitembenefittypecodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmBnftTypCdgDsply("]]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefittypecodingi == 0) {c.addCvgElgbltyRspsInsrncItmBnftTypCdgVrsn("[[[[");}
		if(coverageeligibilityresponseinsuranceitembenefittypecoding.hasVersion()) {

			c.addCvgElgbltyRspsInsrncItmBnftTypCdgVrsn(String.valueOf(coverageeligibilityresponseinsuranceitembenefittypecoding.getVersion()));
		} else {
			c.addCvgElgbltyRspsInsrncItmBnftTypCdgVrsn("NULL");
		}

		if(coverageeligibilityresponseinsuranceitembenefittypecodingi == coverageeligibilityresponseinsuranceitembenefittypecodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmBnftTypCdgVrsn("]]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefittypecodingi == 0) {c.addCvgElgbltyRspsInsrncItmBnftTypCdgCd("[[[[");}
		if(coverageeligibilityresponseinsuranceitembenefittypecoding.hasCode()) {

			c.addCvgElgbltyRspsInsrncItmBnftTypCdgCd(String.valueOf(coverageeligibilityresponseinsuranceitembenefittypecoding.getCode()));
		} else {
			c.addCvgElgbltyRspsInsrncItmBnftTypCdgCd("NULL");
		}

		if(coverageeligibilityresponseinsuranceitembenefittypecodingi == coverageeligibilityresponseinsuranceitembenefittypecodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmBnftTypCdgCd("]]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefittypecodingi == 0) {c.addCvgElgbltyRspsInsrncItmBnftTypCdgUsrSltd("[[[[");}
		if(coverageeligibilityresponseinsuranceitembenefittypecoding.hasUserSelected()) {

			c.addCvgElgbltyRspsInsrncItmBnftTypCdgUsrSltd(String.valueOf(coverageeligibilityresponseinsuranceitembenefittypecoding.getUserSelected()));
		} else {
			c.addCvgElgbltyRspsInsrncItmBnftTypCdgUsrSltd("NULL");
		}

		if(coverageeligibilityresponseinsuranceitembenefittypecodingi == coverageeligibilityresponseinsuranceitembenefittypecodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmBnftTypCdgUsrSltd("]]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefittypecodingi == 0) {c.addCvgElgbltyRspsInsrncItmBnftTypCdgSys("[[[[");}
		if(coverageeligibilityresponseinsuranceitembenefittypecoding.hasSystem()) {

			c.addCvgElgbltyRspsInsrncItmBnftTypCdgSys(String.valueOf(coverageeligibilityresponseinsuranceitembenefittypecoding.getSystem()));
		} else {
			c.addCvgElgbltyRspsInsrncItmBnftTypCdgSys("NULL");
		}

		if(coverageeligibilityresponseinsuranceitembenefittypecodingi == coverageeligibilityresponseinsuranceitembenefittypecodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmBnftTypCdgSys("]]]]");}


		 };
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedUnsignedIntTyp ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefiti == 0) {c.addCvgElgbltyRspsInsrncItmBnftUsedUnsignedIntTyp("[[[");}
		if(coverageeligibilityresponseinsuranceitembenefit.hasUsedUnsignedIntType()) {

			c.addCvgElgbltyRspsInsrncItmBnftUsedUnsignedIntTyp("\""+coverageeligibilityresponseinsuranceitembenefit.getUsedUnsignedIntType().getValueAsString()+"\"");
		} else {
			c.addCvgElgbltyRspsInsrncItmBnftUsedUnsignedIntTyp("NULL");
		}

		if(coverageeligibilityresponseinsuranceitembenefiti == coverageeligibilityresponseinsuranceitembenefitlist.size()-1) {c.addCvgElgbltyRspsInsrncItmBnftUsedUnsignedIntTyp("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedStrgTyp ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefiti == 0) {c.addCvgElgbltyRspsInsrncItmBnftAllowedStrgTyp("[[[");}
		if(coverageeligibilityresponseinsuranceitembenefit.hasAllowedStringType()) {

			c.addCvgElgbltyRspsInsrncItmBnftAllowedStrgTyp("\""+coverageeligibilityresponseinsuranceitembenefit.getAllowedStringType().getValueAsString()+"\"");
		} else {
			c.addCvgElgbltyRspsInsrncItmBnftAllowedStrgTyp("NULL");
		}

		if(coverageeligibilityresponseinsuranceitembenefiti == coverageeligibilityresponseinsuranceitembenefitlist.size()-1) {c.addCvgElgbltyRspsInsrncItmBnftAllowedStrgTyp("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedUnsignedIntTyp ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefiti == 0) {c.addCvgElgbltyRspsInsrncItmBnftAllowedUnsignedIntTyp("[[[");}
		if(coverageeligibilityresponseinsuranceitembenefit.hasAllowedUnsignedIntType()) {

			c.addCvgElgbltyRspsInsrncItmBnftAllowedUnsignedIntTyp("\""+coverageeligibilityresponseinsuranceitembenefit.getAllowedUnsignedIntType().getValueAsString()+"\"");
		} else {
			c.addCvgElgbltyRspsInsrncItmBnftAllowedUnsignedIntTyp("NULL");
		}

		if(coverageeligibilityresponseinsuranceitembenefiti == coverageeligibilityresponseinsuranceitembenefitlist.size()-1) {c.addCvgElgbltyRspsInsrncItmBnftAllowedUnsignedIntTyp("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedStrgTyp ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefiti == 0) {c.addCvgElgbltyRspsInsrncItmBnftUsedStrgTyp("[[[");}
		if(coverageeligibilityresponseinsuranceitembenefit.hasUsedStringType()) {

			c.addCvgElgbltyRspsInsrncItmBnftUsedStrgTyp("\""+coverageeligibilityresponseinsuranceitembenefit.getUsedStringType().getValueAsString()+"\"");
		} else {
			c.addCvgElgbltyRspsInsrncItmBnftUsedStrgTyp("NULL");
		}

		if(coverageeligibilityresponseinsuranceitembenefiti == coverageeligibilityresponseinsuranceitembenefitlist.size()-1) {c.addCvgElgbltyRspsInsrncItmBnftUsedStrgTyp("]]]");}


		/******************** coverageeligibilityresponseinsuranceitembenefitusedmoney ********************************************************************************/
		org.hl7.fhir.r4.model.Money coverageeligibilityresponseinsuranceitembenefitusedmoney = coverageeligibilityresponseinsuranceitembenefit.getUsedMoney();

		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedMoney_Vl ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefiti == 0) {c.addCvgElgbltyRspsInsrncItmBnftUsedMoneyVl("[[[");}
		if(coverageeligibilityresponseinsuranceitembenefitusedmoney.hasValue()) {

			c.addCvgElgbltyRspsInsrncItmBnftUsedMoneyVl(String.valueOf(coverageeligibilityresponseinsuranceitembenefitusedmoney.getValue()));
		} else {
			c.addCvgElgbltyRspsInsrncItmBnftUsedMoneyVl("NULL");
		}

		if(coverageeligibilityresponseinsuranceitembenefiti == coverageeligibilityresponseinsuranceitembenefitlist.size()-1) {c.addCvgElgbltyRspsInsrncItmBnftUsedMoneyVl("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedMoney_Crncy ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefiti == 0) {c.addCvgElgbltyRspsInsrncItmBnftUsedMoneyCrncy("[[[");}
		if(coverageeligibilityresponseinsuranceitembenefitusedmoney.hasCurrency()) {

			c.addCvgElgbltyRspsInsrncItmBnftUsedMoneyCrncy(String.valueOf(coverageeligibilityresponseinsuranceitembenefitusedmoney.getCurrency()));
		} else {
			c.addCvgElgbltyRspsInsrncItmBnftUsedMoneyCrncy("NULL");
		}

		if(coverageeligibilityresponseinsuranceitembenefiti == coverageeligibilityresponseinsuranceitembenefitlist.size()-1) {c.addCvgElgbltyRspsInsrncItmBnftUsedMoneyCrncy("]]]");}


		/******************** coverageeligibilityresponseinsuranceitembenefitallowedmoney ********************************************************************************/
		org.hl7.fhir.r4.model.Money coverageeligibilityresponseinsuranceitembenefitallowedmoney = coverageeligibilityresponseinsuranceitembenefit.getAllowedMoney();

		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedMoney_Vl ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefiti == 0) {c.addCvgElgbltyRspsInsrncItmBnftAllowedMoneyVl("[[[");}
		if(coverageeligibilityresponseinsuranceitembenefitallowedmoney.hasValue()) {

			c.addCvgElgbltyRspsInsrncItmBnftAllowedMoneyVl(String.valueOf(coverageeligibilityresponseinsuranceitembenefitallowedmoney.getValue()));
		} else {
			c.addCvgElgbltyRspsInsrncItmBnftAllowedMoneyVl("NULL");
		}

		if(coverageeligibilityresponseinsuranceitembenefiti == coverageeligibilityresponseinsuranceitembenefitlist.size()-1) {c.addCvgElgbltyRspsInsrncItmBnftAllowedMoneyVl("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedMoney_Crncy ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefiti == 0) {c.addCvgElgbltyRspsInsrncItmBnftAllowedMoneyCrncy("[[[");}
		if(coverageeligibilityresponseinsuranceitembenefitallowedmoney.hasCurrency()) {

			c.addCvgElgbltyRspsInsrncItmBnftAllowedMoneyCrncy(String.valueOf(coverageeligibilityresponseinsuranceitembenefitallowedmoney.getCurrency()));
		} else {
			c.addCvgElgbltyRspsInsrncItmBnftAllowedMoneyCrncy("NULL");
		}

		if(coverageeligibilityresponseinsuranceitembenefiti == coverageeligibilityresponseinsuranceitembenefitlist.size()-1) {c.addCvgElgbltyRspsInsrncItmBnftAllowedMoneyCrncy("]]]");}


		 };
		/******************** coverageeligibilityresponseinsuranceitemterm ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitemterm = coverageeligibilityresponseinsuranceitem.getTerm();

		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Txt ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemterm.hasText()) {

			c.addCvgElgbltyRspsInsrncItmTrmTxt(String.valueOf(coverageeligibilityresponseinsuranceitemterm.getText()));
		} else {
			c.addCvgElgbltyRspsInsrncItmTrmTxt("NULL");
		}


		/******************** coverageeligibilityresponseinsuranceitemtermcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coverageeligibilityresponseinsuranceitemtermcodinglist = coverageeligibilityresponseinsuranceitemterm.getCoding();
		for(int coverageeligibilityresponseinsuranceitemtermcodingi = 0; coverageeligibilityresponseinsuranceitemtermcodingi<coverageeligibilityresponseinsuranceitemtermcodinglist.size();coverageeligibilityresponseinsuranceitemtermcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coverageeligibilityresponseinsuranceitemtermcoding = coverageeligibilityresponseinsuranceitemtermcodinglist.get(coverageeligibilityresponseinsuranceitemtermcodingi);

		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemtermcodingi == 0) {c.addCvgElgbltyRspsInsrncItmTrmCdgDsply("[[[");}
		if(coverageeligibilityresponseinsuranceitemtermcoding.hasDisplay()) {

			c.addCvgElgbltyRspsInsrncItmTrmCdgDsply(String.valueOf(coverageeligibilityresponseinsuranceitemtermcoding.getDisplay()));
		} else {
			c.addCvgElgbltyRspsInsrncItmTrmCdgDsply("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemtermcodingi == coverageeligibilityresponseinsuranceitemtermcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmTrmCdgDsply("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemtermcodingi == 0) {c.addCvgElgbltyRspsInsrncItmTrmCdgVrsn("[[[");}
		if(coverageeligibilityresponseinsuranceitemtermcoding.hasVersion()) {

			c.addCvgElgbltyRspsInsrncItmTrmCdgVrsn(String.valueOf(coverageeligibilityresponseinsuranceitemtermcoding.getVersion()));
		} else {
			c.addCvgElgbltyRspsInsrncItmTrmCdgVrsn("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemtermcodingi == coverageeligibilityresponseinsuranceitemtermcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmTrmCdgVrsn("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemtermcodingi == 0) {c.addCvgElgbltyRspsInsrncItmTrmCdgCd("[[[");}
		if(coverageeligibilityresponseinsuranceitemtermcoding.hasCode()) {

			c.addCvgElgbltyRspsInsrncItmTrmCdgCd(String.valueOf(coverageeligibilityresponseinsuranceitemtermcoding.getCode()));
		} else {
			c.addCvgElgbltyRspsInsrncItmTrmCdgCd("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemtermcodingi == coverageeligibilityresponseinsuranceitemtermcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmTrmCdgCd("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemtermcodingi == 0) {c.addCvgElgbltyRspsInsrncItmTrmCdgUsrSltd("[[[");}
		if(coverageeligibilityresponseinsuranceitemtermcoding.hasUserSelected()) {

			c.addCvgElgbltyRspsInsrncItmTrmCdgUsrSltd(String.valueOf(coverageeligibilityresponseinsuranceitemtermcoding.getUserSelected()));
		} else {
			c.addCvgElgbltyRspsInsrncItmTrmCdgUsrSltd("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemtermcodingi == coverageeligibilityresponseinsuranceitemtermcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmTrmCdgUsrSltd("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemtermcodingi == 0) {c.addCvgElgbltyRspsInsrncItmTrmCdgSys("[[[");}
		if(coverageeligibilityresponseinsuranceitemtermcoding.hasSystem()) {

			c.addCvgElgbltyRspsInsrncItmTrmCdgSys(String.valueOf(coverageeligibilityresponseinsuranceitemtermcoding.getSystem()));
		} else {
			c.addCvgElgbltyRspsInsrncItmTrmCdgSys("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemtermcodingi == coverageeligibilityresponseinsuranceitemtermcodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmTrmCdgSys("]]]");}


		 };
		/******************** coverageeligibilityresponseinsuranceitemproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitemproductorservice = coverageeligibilityresponseinsuranceitem.getProductOrService();

		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Txt ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemproductorservice.hasText()) {

			c.addCvgElgbltyRspsInsrncItmPrdctOrSrvTxt(String.valueOf(coverageeligibilityresponseinsuranceitemproductorservice.getText()));
		} else {
			c.addCvgElgbltyRspsInsrncItmPrdctOrSrvTxt("NULL");
		}


		/******************** coverageeligibilityresponseinsuranceitemproductorservicecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coverageeligibilityresponseinsuranceitemproductorservicecodinglist = coverageeligibilityresponseinsuranceitemproductorservice.getCoding();
		for(int coverageeligibilityresponseinsuranceitemproductorservicecodingi = 0; coverageeligibilityresponseinsuranceitemproductorservicecodingi<coverageeligibilityresponseinsuranceitemproductorservicecodinglist.size();coverageeligibilityresponseinsuranceitemproductorservicecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coverageeligibilityresponseinsuranceitemproductorservicecoding = coverageeligibilityresponseinsuranceitemproductorservicecodinglist.get(coverageeligibilityresponseinsuranceitemproductorservicecodingi);

		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemproductorservicecodingi == 0) {c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgDsply("[[[");}
		if(coverageeligibilityresponseinsuranceitemproductorservicecoding.hasDisplay()) {

			c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgDsply(String.valueOf(coverageeligibilityresponseinsuranceitemproductorservicecoding.getDisplay()));
		} else {
			c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgDsply("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemproductorservicecodingi == coverageeligibilityresponseinsuranceitemproductorservicecodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgDsply("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemproductorservicecodingi == 0) {c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgVrsn("[[[");}
		if(coverageeligibilityresponseinsuranceitemproductorservicecoding.hasVersion()) {

			c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgVrsn(String.valueOf(coverageeligibilityresponseinsuranceitemproductorservicecoding.getVersion()));
		} else {
			c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgVrsn("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemproductorservicecodingi == coverageeligibilityresponseinsuranceitemproductorservicecodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgVrsn("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemproductorservicecodingi == 0) {c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgCd("[[[");}
		if(coverageeligibilityresponseinsuranceitemproductorservicecoding.hasCode()) {

			c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgCd(String.valueOf(coverageeligibilityresponseinsuranceitemproductorservicecoding.getCode()));
		} else {
			c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgCd("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemproductorservicecodingi == coverageeligibilityresponseinsuranceitemproductorservicecodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgCd("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemproductorservicecodingi == 0) {c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgUsrSltd("[[[");}
		if(coverageeligibilityresponseinsuranceitemproductorservicecoding.hasUserSelected()) {

			c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgUsrSltd(String.valueOf(coverageeligibilityresponseinsuranceitemproductorservicecoding.getUserSelected()));
		} else {
			c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgUsrSltd("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemproductorservicecodingi == coverageeligibilityresponseinsuranceitemproductorservicecodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgUsrSltd("]]]");}


		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemproductorservicecodingi == 0) {c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgSys("[[[");}
		if(coverageeligibilityresponseinsuranceitemproductorservicecoding.hasSystem()) {

			c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgSys(String.valueOf(coverageeligibilityresponseinsuranceitemproductorservicecoding.getSystem()));
		} else {
			c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgSys("NULL");
		}

		if(coverageeligibilityresponseinsuranceitemproductorservicecodingi == coverageeligibilityresponseinsuranceitemproductorservicecodinglist.size()-1) {c.addCvgElgbltyRspsInsrncItmPrdctOrSrvCdgSys("]]]");}


		 };
		/******************** CvgElgbltyRsps_Insrnc_Itm_Excluded ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitem.hasExcluded()) {

			c.addCvgElgbltyRspsInsrncItmExcluded(String.valueOf(coverageeligibilityresponseinsuranceitem.getExcluded()));
		} else {
			c.addCvgElgbltyRspsInsrncItmExcluded("NULL");
		}


		 };
		/******************** coverageeligibilityresponseinsurancebenefitperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageeligibilityresponseinsurancebenefitperiod = coverageeligibilityresponseinsurance.getBenefitPeriod();

		/******************** CvgElgbltyRsps_Insrnc_BnftPrd_Strt ********************************************************************************/
		if(coverageeligibilityresponseinsurancebenefitperiod.hasStart()) {

			c.addCvgElgbltyRspsInsrncBnftPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(coverageeligibilityresponseinsurancebenefitperiod.getStart())+"\"");
		} else {
			c.addCvgElgbltyRspsInsrncBnftPrdStrt("NULL");
		}


		/******************** CvgElgbltyRsps_Insrnc_BnftPrd_End ********************************************************************************/
		if(coverageeligibilityresponseinsurancebenefitperiod.hasEnd()) {

			c.addCvgElgbltyRspsInsrncBnftPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(coverageeligibilityresponseinsurancebenefitperiod.getEnd())+"\"");
		} else {
			c.addCvgElgbltyRspsInsrncBnftPrdEnd("NULL");
		}


		/******************** CvgElgbltyRsps_Insrnc_Inforce ********************************************************************************/
		if(coverageeligibilityresponseinsurance.hasInforce()) {

			c.addCvgElgbltyRspsInsrncInforce(String.valueOf(coverageeligibilityresponseinsurance.getInforce()));
		} else {
			c.addCvgElgbltyRspsInsrncInforce("NULL");
		}


		/******************** CvgElgbltyRsps_Insrnc_Cvg ********************************************************************************/
		if(coverageeligibilityresponseinsurance.hasCoverage()) {

			if(coverageeligibilityresponseinsurance.getCoverage().getReference() != null) {
			c.addCvgElgbltyRspsInsrncCvg(coverageeligibilityresponseinsurance.getCoverage().getReference());
			}
		} else {
			c.addCvgElgbltyRspsInsrncCvg("NULL");
		}


		 };
		/******************** CvgElgbltyRsps_Pnt ********************************************************************************/
		if(coverageeligibilityresponse.hasPatient()) {

			if(coverageeligibilityresponse.getPatient().getReference() != null) {
			c.addCvgElgbltyRspsPnt(coverageeligibilityresponse.getPatient().getReference());
			}
		} else {
			c.addCvgElgbltyRspsPnt("NULL");
		}


		/******************** CvgElgbltyRsps_Insurer ********************************************************************************/
		if(coverageeligibilityresponse.hasInsurer()) {

			if(coverageeligibilityresponse.getInsurer().getReference() != null) {
			c.addCvgElgbltyRspsInsurer(coverageeligibilityresponse.getInsurer().getReference());
			}
		} else {
			c.addCvgElgbltyRspsInsurer("NULL");
		}


		/******************** coverageeligibilityresponseerror ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CoverageEligibilityResponse.ErrorsComponent> coverageeligibilityresponseerrorlist = coverageeligibilityresponse.getError();
		for(int coverageeligibilityresponseerrori = 0; coverageeligibilityresponseerrori<coverageeligibilityresponseerrorlist.size();coverageeligibilityresponseerrori++ ) {
		org.hl7.fhir.r4.model.CoverageEligibilityResponse.ErrorsComponent  coverageeligibilityresponseerror = coverageeligibilityresponseerrorlist.get(coverageeligibilityresponseerrori);

		/******************** coverageeligibilityresponseerrorcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseerrorcode = coverageeligibilityresponseerror.getCode();

		/******************** CvgElgbltyRsps_Error_Cd_Txt ********************************************************************************/
		if(coverageeligibilityresponseerrori == 0) {c.addCvgElgbltyRspsErrorCdTxt("[");}
		if(coverageeligibilityresponseerrorcode.hasText()) {

			c.addCvgElgbltyRspsErrorCdTxt(String.valueOf(coverageeligibilityresponseerrorcode.getText()));
		} else {
			c.addCvgElgbltyRspsErrorCdTxt("NULL");
		}

		if(coverageeligibilityresponseerrori == coverageeligibilityresponseerrorlist.size()-1) {c.addCvgElgbltyRspsErrorCdTxt("]");}


		/******************** coverageeligibilityresponseerrorcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coverageeligibilityresponseerrorcodecodinglist = coverageeligibilityresponseerrorcode.getCoding();
		for(int coverageeligibilityresponseerrorcodecodingi = 0; coverageeligibilityresponseerrorcodecodingi<coverageeligibilityresponseerrorcodecodinglist.size();coverageeligibilityresponseerrorcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coverageeligibilityresponseerrorcodecoding = coverageeligibilityresponseerrorcodecodinglist.get(coverageeligibilityresponseerrorcodecodingi);

		/******************** CvgElgbltyRsps_Error_Cd_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseerrorcodecodingi == 0) {c.addCvgElgbltyRspsErrorCdCdgDsply("[[");}
		if(coverageeligibilityresponseerrorcodecoding.hasDisplay()) {

			c.addCvgElgbltyRspsErrorCdCdgDsply(String.valueOf(coverageeligibilityresponseerrorcodecoding.getDisplay()));
		} else {
			c.addCvgElgbltyRspsErrorCdCdgDsply("NULL");
		}

		if(coverageeligibilityresponseerrorcodecodingi == coverageeligibilityresponseerrorcodecodinglist.size()-1) {c.addCvgElgbltyRspsErrorCdCdgDsply("]]");}


		/******************** CvgElgbltyRsps_Error_Cd_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseerrorcodecodingi == 0) {c.addCvgElgbltyRspsErrorCdCdgVrsn("[[");}
		if(coverageeligibilityresponseerrorcodecoding.hasVersion()) {

			c.addCvgElgbltyRspsErrorCdCdgVrsn(String.valueOf(coverageeligibilityresponseerrorcodecoding.getVersion()));
		} else {
			c.addCvgElgbltyRspsErrorCdCdgVrsn("NULL");
		}

		if(coverageeligibilityresponseerrorcodecodingi == coverageeligibilityresponseerrorcodecodinglist.size()-1) {c.addCvgElgbltyRspsErrorCdCdgVrsn("]]");}


		/******************** CvgElgbltyRsps_Error_Cd_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseerrorcodecodingi == 0) {c.addCvgElgbltyRspsErrorCdCdgCd("[[");}
		if(coverageeligibilityresponseerrorcodecoding.hasCode()) {

			c.addCvgElgbltyRspsErrorCdCdgCd(String.valueOf(coverageeligibilityresponseerrorcodecoding.getCode()));
		} else {
			c.addCvgElgbltyRspsErrorCdCdgCd("NULL");
		}

		if(coverageeligibilityresponseerrorcodecodingi == coverageeligibilityresponseerrorcodecodinglist.size()-1) {c.addCvgElgbltyRspsErrorCdCdgCd("]]");}


		/******************** CvgElgbltyRsps_Error_Cd_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseerrorcodecodingi == 0) {c.addCvgElgbltyRspsErrorCdCdgUsrSltd("[[");}
		if(coverageeligibilityresponseerrorcodecoding.hasUserSelected()) {

			c.addCvgElgbltyRspsErrorCdCdgUsrSltd(String.valueOf(coverageeligibilityresponseerrorcodecoding.getUserSelected()));
		} else {
			c.addCvgElgbltyRspsErrorCdCdgUsrSltd("NULL");
		}

		if(coverageeligibilityresponseerrorcodecodingi == coverageeligibilityresponseerrorcodecodinglist.size()-1) {c.addCvgElgbltyRspsErrorCdCdgUsrSltd("]]");}


		/******************** CvgElgbltyRsps_Error_Cd_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseerrorcodecodingi == 0) {c.addCvgElgbltyRspsErrorCdCdgSys("[[");}
		if(coverageeligibilityresponseerrorcodecoding.hasSystem()) {

			c.addCvgElgbltyRspsErrorCdCdgSys(String.valueOf(coverageeligibilityresponseerrorcodecoding.getSystem()));
		} else {
			c.addCvgElgbltyRspsErrorCdCdgSys("NULL");
		}

		if(coverageeligibilityresponseerrorcodecodingi == coverageeligibilityresponseerrorcodecodinglist.size()-1) {c.addCvgElgbltyRspsErrorCdCdgSys("]]");}


		 };
		 };
		return c;
	}
}
