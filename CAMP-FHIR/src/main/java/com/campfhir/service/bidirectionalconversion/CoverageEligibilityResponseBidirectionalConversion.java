package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CoverageEligibilityResponse;
public class CoverageEligibilityResponseBidirectionalConversion 
{
	public CoverageEligibilityResponse CoverageEligibilityResponses(org.hl7.fhir.r4.model.CoverageEligibilityResponse coverageeligibilityresponse) throws ParseException
	{
		 main.java.com.campfhir.model.CoverageEligibilityResponse c = new  main.java.com.campfhir.model.CoverageEligibilityResponse();

		/******************** id ********************************************************************************/
		coverageeligibilityresponse.setId(c.getId());

		/******************** coverageeligibilityresponsestatus ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityResponse.EligibilityResponseStatus coverageeligibilityresponsestatus = coverageeligibilityresponse.getStatus();
		c.setCvgElgbltyRspsSts(coverageeligibilityresponsestatus.toCode());

		/******************** CvgElgbltyRsps_Created ********************************************************************************/
		if(coverageeligibilityresponse.hasCreated()) {
			c.setCvgElgbltyRspsCreated(String.valueOf(coverageeligibilityresponse.getCreated()));
		}
		/******************** CvgElgbltyRsps_Disposition ********************************************************************************/
		if(coverageeligibilityresponse.hasDisposition()) {
			c.setCvgElgbltyRspsDisposition(String.valueOf(coverageeligibilityresponse.getDisposition()));
		}
		/******************** CvgElgbltyRsps_Rqst ********************************************************************************/
		if(coverageeligibilityresponse.hasRequest()) {
			c.setCvgElgbltyRspsRqst(String.valueOf(coverageeligibilityresponse.getRequest()));
		}
		/******************** coverageeligibilityresponseoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.RemittanceOutcome coverageeligibilityresponseoutcome = coverageeligibilityresponse.getOutcome();
		c.setCvgElgbltyRspsOutcome(coverageeligibilityresponseoutcome.toCode());

		/******************** CvgElgbltyRsps_Rqstor ********************************************************************************/
		if(coverageeligibilityresponse.hasRequestor()) {
			c.setCvgElgbltyRspsRqstor(String.valueOf(coverageeligibilityresponse.getRequestor()));
		}
		/******************** CvgElgbltyRsps_Pnt ********************************************************************************/
		if(coverageeligibilityresponse.hasPatient()) {
			c.setCvgElgbltyRspsPnt(String.valueOf(coverageeligibilityresponse.getPatient()));
		}
		/******************** CvgElgbltyRsps_Insurer ********************************************************************************/
		if(coverageeligibilityresponse.hasInsurer()) {
			c.setCvgElgbltyRspsInsurer(String.valueOf(coverageeligibilityresponse.getInsurer()));
		}
		/******************** coverageeligibilityresponseerror ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityResponse.ErrorsComponent coverageeligibilityresponseerror = coverageeligibilityresponse.getErrorFirstRep();

		/******************** coverageeligibilityresponseerrorcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseerrorcode = coverageeligibilityresponseerror.getCode();

		/******************** coverageeligibilityresponseerrorcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseerrorcodecoding = coverageeligibilityresponseerrorcode.getCodingFirstRep();

		/******************** CvgElgbltyRsps_Error_Cd_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseerrorcodecoding.hasDisplay()) {
			c.setCvgElgbltyRspsErrorCdCdgDsply(String.valueOf(coverageeligibilityresponseerrorcodecoding.getDisplay()));
		}
		/******************** CvgElgbltyRsps_Error_Cd_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseerrorcodecoding.hasVersion()) {
			c.setCvgElgbltyRspsErrorCdCdgVrsn(String.valueOf(coverageeligibilityresponseerrorcodecoding.getVersion()));
		}
		/******************** CvgElgbltyRsps_Error_Cd_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseerrorcodecoding.hasCode()) {
			c.setCvgElgbltyRspsErrorCdCdgCd(String.valueOf(coverageeligibilityresponseerrorcodecoding.getCode()));
		}
		/******************** CvgElgbltyRsps_Error_Cd_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseerrorcodecoding.hasSystem()) {
			c.setCvgElgbltyRspsErrorCdCdgSys(String.valueOf(coverageeligibilityresponseerrorcodecoding.getSystem()));
		}
		/******************** CvgElgbltyRsps_Error_Cd_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseerrorcodecoding.hasUserSelected()) {
			c.setCvgElgbltyRspsErrorCdCdgUsrSltd(String.valueOf(coverageeligibilityresponseerrorcodecoding.getUserSelected()));
		}
		/******************** CvgElgbltyRsps_Error_Cd_Txt ********************************************************************************/
		if(coverageeligibilityresponseerrorcode.hasText()) {
			c.setCvgElgbltyRspsErrorCdTxt(String.valueOf(coverageeligibilityresponseerrorcode.getText()));
		}
		/******************** coverageeligibilityresponseidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier coverageeligibilityresponseidentifier = coverageeligibilityresponse.getIdentifierFirstRep();

		/******************** CvgElgbltyRsps_Id_Vl ********************************************************************************/
		if(coverageeligibilityresponseidentifier.hasValue()) {
			c.setCvgElgbltyRspsIdVl(String.valueOf(coverageeligibilityresponseidentifier.getValue()));
		}
		/******************** coverageeligibilityresponseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseidentifiertype = coverageeligibilityresponseidentifier.getType();

		/******************** coverageeligibilityresponseidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseidentifiertypecoding = coverageeligibilityresponseidentifiertype.getCodingFirstRep();

		/******************** CvgElgbltyRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseidentifiertypecoding.hasDisplay()) {
			c.setCvgElgbltyRspsIdTypCdgDsply(String.valueOf(coverageeligibilityresponseidentifiertypecoding.getDisplay()));
		}
		/******************** CvgElgbltyRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseidentifiertypecoding.hasVersion()) {
			c.setCvgElgbltyRspsIdTypCdgVrsn(String.valueOf(coverageeligibilityresponseidentifiertypecoding.getVersion()));
		}
		/******************** CvgElgbltyRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseidentifiertypecoding.hasCode()) {
			c.setCvgElgbltyRspsIdTypCdgCd(String.valueOf(coverageeligibilityresponseidentifiertypecoding.getCode()));
		}
		/******************** CvgElgbltyRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseidentifiertypecoding.hasSystem()) {
			c.setCvgElgbltyRspsIdTypCdgSys(String.valueOf(coverageeligibilityresponseidentifiertypecoding.getSystem()));
		}
		/******************** CvgElgbltyRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseidentifiertypecoding.hasUserSelected()) {
			c.setCvgElgbltyRspsIdTypCdgUsrSltd(String.valueOf(coverageeligibilityresponseidentifiertypecoding.getUserSelected()));
		}
		/******************** CvgElgbltyRsps_Id_Typ_Txt ********************************************************************************/
		if(coverageeligibilityresponseidentifiertype.hasText()) {
			c.setCvgElgbltyRspsIdTypTxt(String.valueOf(coverageeligibilityresponseidentifiertype.getText()));
		}
		/******************** CvgElgbltyRsps_Id_Sys ********************************************************************************/
		if(coverageeligibilityresponseidentifier.hasSystem()) {
			c.setCvgElgbltyRspsIdSys(String.valueOf(coverageeligibilityresponseidentifier.getSystem()));
		}
		/******************** CvgElgbltyRsps_Id_Assigner ********************************************************************************/
		if(coverageeligibilityresponseidentifier.hasAssigner()) {
			c.setCvgElgbltyRspsIdAssigner(String.valueOf(coverageeligibilityresponseidentifier.getAssigner()));
		}
		/******************** coverageeligibilityresponseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageeligibilityresponseidentifierperiod = coverageeligibilityresponseidentifier.getPeriod();

		/******************** CvgElgbltyRsps_Id_Prd_End ********************************************************************************/
		if(coverageeligibilityresponseidentifierperiod.hasEnd()) {
			c.setCvgElgbltyRspsIdPrdEnd(String.valueOf(coverageeligibilityresponseidentifierperiod.getEnd()));
		}
		/******************** CvgElgbltyRsps_Id_Prd_Strt ********************************************************************************/
		if(coverageeligibilityresponseidentifierperiod.hasStart()) {
			c.setCvgElgbltyRspsIdPrdStrt(String.valueOf(coverageeligibilityresponseidentifierperiod.getStart()));
		}
		/******************** coverageeligibilityresponseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse coverageeligibilityresponseidentifieruse = coverageeligibilityresponseidentifier.getUse();
		c.setCvgElgbltyRspsIdUse(coverageeligibilityresponseidentifieruse.toCode());

		/******************** coverageeligibilityresponseservicedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageeligibilityresponseservicedperiod = coverageeligibilityresponse.getServicedPeriod();

		/******************** CvgElgbltyRsps_SrvdPrd_End ********************************************************************************/
		if(coverageeligibilityresponseservicedperiod.hasEnd()) {
			c.setCvgElgbltyRspsSrvdPrdEnd(String.valueOf(coverageeligibilityresponseservicedperiod.getEnd()));
		}
		/******************** CvgElgbltyRsps_SrvdPrd_Strt ********************************************************************************/
		if(coverageeligibilityresponseservicedperiod.hasStart()) {
			c.setCvgElgbltyRspsSrvdPrdStrt(String.valueOf(coverageeligibilityresponseservicedperiod.getStart()));
		}
		/******************** coverageeligibilityresponseform ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseform = coverageeligibilityresponse.getForm();

		/******************** coverageeligibilityresponseformcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseformcoding = coverageeligibilityresponseform.getCodingFirstRep();

		/******************** CvgElgbltyRsps_Frm_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseformcoding.hasDisplay()) {
			c.setCvgElgbltyRspsFrmCdgDsply(String.valueOf(coverageeligibilityresponseformcoding.getDisplay()));
		}
		/******************** CvgElgbltyRsps_Frm_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseformcoding.hasVersion()) {
			c.setCvgElgbltyRspsFrmCdgVrsn(String.valueOf(coverageeligibilityresponseformcoding.getVersion()));
		}
		/******************** CvgElgbltyRsps_Frm_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseformcoding.hasCode()) {
			c.setCvgElgbltyRspsFrmCdgCd(String.valueOf(coverageeligibilityresponseformcoding.getCode()));
		}
		/******************** CvgElgbltyRsps_Frm_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseformcoding.hasSystem()) {
			c.setCvgElgbltyRspsFrmCdgSys(String.valueOf(coverageeligibilityresponseformcoding.getSystem()));
		}
		/******************** CvgElgbltyRsps_Frm_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseformcoding.hasUserSelected()) {
			c.setCvgElgbltyRspsFrmCdgUsrSltd(String.valueOf(coverageeligibilityresponseformcoding.getUserSelected()));
		}
		/******************** CvgElgbltyRsps_Frm_Txt ********************************************************************************/
		if(coverageeligibilityresponseform.hasText()) {
			c.setCvgElgbltyRspsFrmTxt(String.valueOf(coverageeligibilityresponseform.getText()));
		}
		/******************** CvgElgbltyRsps_PreAuthRef ********************************************************************************/
		if(coverageeligibilityresponse.hasPreAuthRef()) {
			c.setCvgElgbltyRspsPreAuthRef(String.valueOf(coverageeligibilityresponse.getPreAuthRef()));
		}
		/******************** CvgElgbltyRsps_SrvdDtTyp ********************************************************************************/
		if(coverageeligibilityresponse.hasServicedDateType()) {
			c.setCvgElgbltyRspsSrvdDtTyp(String.valueOf(coverageeligibilityresponse.getServicedDateType()));
		}
		/******************** coverageeligibilityresponseinsurance ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityResponse.InsuranceComponent coverageeligibilityresponseinsurance = coverageeligibilityresponse.getInsuranceFirstRep();

		/******************** CvgElgbltyRsps_Insrnc_Cvg ********************************************************************************/
		if(coverageeligibilityresponseinsurance.hasCoverage()) {
			c.setCvgElgbltyRspsInsrncCvg(String.valueOf(coverageeligibilityresponseinsurance.getCoverage()));
		}
		/******************** coverageeligibilityresponseinsuranceitem ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityResponse.ItemsComponent coverageeligibilityresponseinsuranceitem = coverageeligibilityresponseinsurance.getItemFirstRep();

		/******************** CvgElgbltyRsps_Insrnc_Itm_Nm ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitem.hasName()) {
			c.setCvgElgbltyRspsInsrncItmNm(String.valueOf(coverageeligibilityresponseinsuranceitem.getName()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Provider ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitem.hasProvider()) {
			c.setCvgElgbltyRspsInsrncItmProvider(String.valueOf(coverageeligibilityresponseinsuranceitem.getProvider()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Dscrptn ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitem.hasDescription()) {
			c.setCvgElgbltyRspsInsrncItmDscrptn(String.valueOf(coverageeligibilityresponseinsuranceitem.getDescription()));
		}
		/******************** coverageeligibilityresponseinsuranceitemcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitemcategory = coverageeligibilityresponseinsuranceitem.getCategory();

		/******************** coverageeligibilityresponseinsuranceitemcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseinsuranceitemcategorycoding = coverageeligibilityresponseinsuranceitemcategory.getCodingFirstRep();

		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemcategorycoding.hasDisplay()) {
			c.setCvgElgbltyRspsInsrncItmCtgryCdgDsply(String.valueOf(coverageeligibilityresponseinsuranceitemcategorycoding.getDisplay()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemcategorycoding.hasVersion()) {
			c.setCvgElgbltyRspsInsrncItmCtgryCdgVrsn(String.valueOf(coverageeligibilityresponseinsuranceitemcategorycoding.getVersion()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemcategorycoding.hasCode()) {
			c.setCvgElgbltyRspsInsrncItmCtgryCdgCd(String.valueOf(coverageeligibilityresponseinsuranceitemcategorycoding.getCode()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemcategorycoding.hasSystem()) {
			c.setCvgElgbltyRspsInsrncItmCtgryCdgSys(String.valueOf(coverageeligibilityresponseinsuranceitemcategorycoding.getSystem()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemcategorycoding.hasUserSelected()) {
			c.setCvgElgbltyRspsInsrncItmCtgryCdgUsrSltd(String.valueOf(coverageeligibilityresponseinsuranceitemcategorycoding.getUserSelected()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Txt ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemcategory.hasText()) {
			c.setCvgElgbltyRspsInsrncItmCtgryTxt(String.valueOf(coverageeligibilityresponseinsuranceitemcategory.getText()));
		}
		/******************** coverageeligibilityresponseinsuranceitemproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitemproductorservice = coverageeligibilityresponseinsuranceitem.getProductOrService();

		/******************** coverageeligibilityresponseinsuranceitemproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseinsuranceitemproductorservicecoding = coverageeligibilityresponseinsuranceitemproductorservice.getCodingFirstRep();

		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemproductorservicecoding.hasDisplay()) {
			c.setCvgElgbltyRspsInsrncItmPrdctOrSrvCdgDsply(String.valueOf(coverageeligibilityresponseinsuranceitemproductorservicecoding.getDisplay()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemproductorservicecoding.hasVersion()) {
			c.setCvgElgbltyRspsInsrncItmPrdctOrSrvCdgVrsn(String.valueOf(coverageeligibilityresponseinsuranceitemproductorservicecoding.getVersion()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemproductorservicecoding.hasCode()) {
			c.setCvgElgbltyRspsInsrncItmPrdctOrSrvCdgCd(String.valueOf(coverageeligibilityresponseinsuranceitemproductorservicecoding.getCode()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemproductorservicecoding.hasSystem()) {
			c.setCvgElgbltyRspsInsrncItmPrdctOrSrvCdgSys(String.valueOf(coverageeligibilityresponseinsuranceitemproductorservicecoding.getSystem()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemproductorservicecoding.hasUserSelected()) {
			c.setCvgElgbltyRspsInsrncItmPrdctOrSrvCdgUsrSltd(String.valueOf(coverageeligibilityresponseinsuranceitemproductorservicecoding.getUserSelected()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Txt ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemproductorservice.hasText()) {
			c.setCvgElgbltyRspsInsrncItmPrdctOrSrvTxt(String.valueOf(coverageeligibilityresponseinsuranceitemproductorservice.getText()));
		}
		/******************** coverageeligibilityresponseinsuranceitemmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitemmodifier = coverageeligibilityresponseinsuranceitem.getModifierFirstRep();

		/******************** coverageeligibilityresponseinsuranceitemmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseinsuranceitemmodifiercoding = coverageeligibilityresponseinsuranceitemmodifier.getCodingFirstRep();

		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemmodifiercoding.hasDisplay()) {
			c.setCvgElgbltyRspsInsrncItmMdfrCdgDsply(String.valueOf(coverageeligibilityresponseinsuranceitemmodifiercoding.getDisplay()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemmodifiercoding.hasVersion()) {
			c.setCvgElgbltyRspsInsrncItmMdfrCdgVrsn(String.valueOf(coverageeligibilityresponseinsuranceitemmodifiercoding.getVersion()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemmodifiercoding.hasCode()) {
			c.setCvgElgbltyRspsInsrncItmMdfrCdgCd(String.valueOf(coverageeligibilityresponseinsuranceitemmodifiercoding.getCode()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemmodifiercoding.hasSystem()) {
			c.setCvgElgbltyRspsInsrncItmMdfrCdgSys(String.valueOf(coverageeligibilityresponseinsuranceitemmodifiercoding.getSystem()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemmodifiercoding.hasUserSelected()) {
			c.setCvgElgbltyRspsInsrncItmMdfrCdgUsrSltd(String.valueOf(coverageeligibilityresponseinsuranceitemmodifiercoding.getUserSelected()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Txt ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemmodifier.hasText()) {
			c.setCvgElgbltyRspsInsrncItmMdfrTxt(String.valueOf(coverageeligibilityresponseinsuranceitemmodifier.getText()));
		}
		/******************** coverageeligibilityresponseinsuranceitemunit ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitemunit = coverageeligibilityresponseinsuranceitem.getUnit();

		/******************** coverageeligibilityresponseinsuranceitemunitcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseinsuranceitemunitcoding = coverageeligibilityresponseinsuranceitemunit.getCodingFirstRep();

		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemunitcoding.hasDisplay()) {
			c.setCvgElgbltyRspsInsrncItmUntCdgDsply(String.valueOf(coverageeligibilityresponseinsuranceitemunitcoding.getDisplay()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemunitcoding.hasVersion()) {
			c.setCvgElgbltyRspsInsrncItmUntCdgVrsn(String.valueOf(coverageeligibilityresponseinsuranceitemunitcoding.getVersion()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemunitcoding.hasCode()) {
			c.setCvgElgbltyRspsInsrncItmUntCdgCd(String.valueOf(coverageeligibilityresponseinsuranceitemunitcoding.getCode()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemunitcoding.hasSystem()) {
			c.setCvgElgbltyRspsInsrncItmUntCdgSys(String.valueOf(coverageeligibilityresponseinsuranceitemunitcoding.getSystem()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemunitcoding.hasUserSelected()) {
			c.setCvgElgbltyRspsInsrncItmUntCdgUsrSltd(String.valueOf(coverageeligibilityresponseinsuranceitemunitcoding.getUserSelected()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Txt ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemunit.hasText()) {
			c.setCvgElgbltyRspsInsrncItmUntTxt(String.valueOf(coverageeligibilityresponseinsuranceitemunit.getText()));
		}
		/******************** coverageeligibilityresponseinsuranceitemterm ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitemterm = coverageeligibilityresponseinsuranceitem.getTerm();

		/******************** coverageeligibilityresponseinsuranceitemtermcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseinsuranceitemtermcoding = coverageeligibilityresponseinsuranceitemterm.getCodingFirstRep();

		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemtermcoding.hasDisplay()) {
			c.setCvgElgbltyRspsInsrncItmTrmCdgDsply(String.valueOf(coverageeligibilityresponseinsuranceitemtermcoding.getDisplay()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemtermcoding.hasVersion()) {
			c.setCvgElgbltyRspsInsrncItmTrmCdgVrsn(String.valueOf(coverageeligibilityresponseinsuranceitemtermcoding.getVersion()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemtermcoding.hasCode()) {
			c.setCvgElgbltyRspsInsrncItmTrmCdgCd(String.valueOf(coverageeligibilityresponseinsuranceitemtermcoding.getCode()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemtermcoding.hasSystem()) {
			c.setCvgElgbltyRspsInsrncItmTrmCdgSys(String.valueOf(coverageeligibilityresponseinsuranceitemtermcoding.getSystem()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemtermcoding.hasUserSelected()) {
			c.setCvgElgbltyRspsInsrncItmTrmCdgUsrSltd(String.valueOf(coverageeligibilityresponseinsuranceitemtermcoding.getUserSelected()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Txt ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemterm.hasText()) {
			c.setCvgElgbltyRspsInsrncItmTrmTxt(String.valueOf(coverageeligibilityresponseinsuranceitemterm.getText()));
		}
		/******************** coverageeligibilityresponseinsuranceitemnetwork ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitemnetwork = coverageeligibilityresponseinsuranceitem.getNetwork();

		/******************** coverageeligibilityresponseinsuranceitemnetworkcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseinsuranceitemnetworkcoding = coverageeligibilityresponseinsuranceitemnetwork.getCodingFirstRep();

		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemnetworkcoding.hasDisplay()) {
			c.setCvgElgbltyRspsInsrncItmNetworkCdgDsply(String.valueOf(coverageeligibilityresponseinsuranceitemnetworkcoding.getDisplay()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemnetworkcoding.hasVersion()) {
			c.setCvgElgbltyRspsInsrncItmNetworkCdgVrsn(String.valueOf(coverageeligibilityresponseinsuranceitemnetworkcoding.getVersion()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemnetworkcoding.hasCode()) {
			c.setCvgElgbltyRspsInsrncItmNetworkCdgCd(String.valueOf(coverageeligibilityresponseinsuranceitemnetworkcoding.getCode()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemnetworkcoding.hasSystem()) {
			c.setCvgElgbltyRspsInsrncItmNetworkCdgSys(String.valueOf(coverageeligibilityresponseinsuranceitemnetworkcoding.getSystem()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemnetworkcoding.hasUserSelected()) {
			c.setCvgElgbltyRspsInsrncItmNetworkCdgUsrSltd(String.valueOf(coverageeligibilityresponseinsuranceitemnetworkcoding.getUserSelected()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Txt ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemnetwork.hasText()) {
			c.setCvgElgbltyRspsInsrncItmNetworkTxt(String.valueOf(coverageeligibilityresponseinsuranceitemnetwork.getText()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnUrl ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitem.hasAuthorizationUrl()) {
			c.setCvgElgbltyRspsInsrncItmAthztnUrl(String.valueOf(coverageeligibilityresponseinsuranceitem.getAuthorizationUrl()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnRequired ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitem.hasAuthorizationRequired()) {
			c.setCvgElgbltyRspsInsrncItmAthztnRequired(String.valueOf(coverageeligibilityresponseinsuranceitem.getAuthorizationRequired()));
		}
		/******************** coverageeligibilityresponseinsuranceitemauthorizationsupporting ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitemauthorizationsupporting = coverageeligibilityresponseinsuranceitem.getAuthorizationSupportingFirstRep();

		/******************** coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding = coverageeligibilityresponseinsuranceitemauthorizationsupporting.getCodingFirstRep();

		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.hasDisplay()) {
			c.setCvgElgbltyRspsInsrncItmAthztnSprtingCdgDsply(String.valueOf(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.getDisplay()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.hasVersion()) {
			c.setCvgElgbltyRspsInsrncItmAthztnSprtingCdgVrsn(String.valueOf(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.getVersion()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.hasCode()) {
			c.setCvgElgbltyRspsInsrncItmAthztnSprtingCdgCd(String.valueOf(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.getCode()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.hasSystem()) {
			c.setCvgElgbltyRspsInsrncItmAthztnSprtingCdgSys(String.valueOf(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.getSystem()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.hasUserSelected()) {
			c.setCvgElgbltyRspsInsrncItmAthztnSprtingCdgUsrSltd(String.valueOf(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.getUserSelected()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Txt ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitemauthorizationsupporting.hasText()) {
			c.setCvgElgbltyRspsInsrncItmAthztnSprtingTxt(String.valueOf(coverageeligibilityresponseinsuranceitemauthorizationsupporting.getText()));
		}
		/******************** coverageeligibilityresponseinsuranceitembenefit ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityResponse.BenefitComponent coverageeligibilityresponseinsuranceitembenefit = coverageeligibilityresponseinsuranceitem.getBenefitFirstRep();

		/******************** coverageeligibilityresponseinsuranceitembenefittype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitembenefittype = coverageeligibilityresponseinsuranceitembenefit.getType();

		/******************** coverageeligibilityresponseinsuranceitembenefittypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseinsuranceitembenefittypecoding = coverageeligibilityresponseinsuranceitembenefittype.getCodingFirstRep();

		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefittypecoding.hasDisplay()) {
			c.setCvgElgbltyRspsInsrncItmBnftTypCdgDsply(String.valueOf(coverageeligibilityresponseinsuranceitembenefittypecoding.getDisplay()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefittypecoding.hasVersion()) {
			c.setCvgElgbltyRspsInsrncItmBnftTypCdgVrsn(String.valueOf(coverageeligibilityresponseinsuranceitembenefittypecoding.getVersion()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefittypecoding.hasCode()) {
			c.setCvgElgbltyRspsInsrncItmBnftTypCdgCd(String.valueOf(coverageeligibilityresponseinsuranceitembenefittypecoding.getCode()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefittypecoding.hasSystem()) {
			c.setCvgElgbltyRspsInsrncItmBnftTypCdgSys(String.valueOf(coverageeligibilityresponseinsuranceitembenefittypecoding.getSystem()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefittypecoding.hasUserSelected()) {
			c.setCvgElgbltyRspsInsrncItmBnftTypCdgUsrSltd(String.valueOf(coverageeligibilityresponseinsuranceitembenefittypecoding.getUserSelected()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Txt ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefittype.hasText()) {
			c.setCvgElgbltyRspsInsrncItmBnftTypTxt(String.valueOf(coverageeligibilityresponseinsuranceitembenefittype.getText()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedStrgTyp ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefit.hasAllowedStringType()) {
			c.setCvgElgbltyRspsInsrncItmBnftAllowedStrgTyp(String.valueOf(coverageeligibilityresponseinsuranceitembenefit.getAllowedStringType()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedUnsignedIntTyp ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefit.hasAllowedUnsignedIntType()) {
			c.setCvgElgbltyRspsInsrncItmBnftAllowedUnsignedIntTyp(String.valueOf(coverageeligibilityresponseinsuranceitembenefit.getAllowedUnsignedIntType()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedUnsignedIntTyp ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefit.hasUsedUnsignedIntType()) {
			c.setCvgElgbltyRspsInsrncItmBnftUsedUnsignedIntTyp(String.valueOf(coverageeligibilityresponseinsuranceitembenefit.getUsedUnsignedIntType()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedStrgTyp ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefit.hasUsedStringType()) {
			c.setCvgElgbltyRspsInsrncItmBnftUsedStrgTyp(String.valueOf(coverageeligibilityresponseinsuranceitembenefit.getUsedStringType()));
		}
		/******************** coverageeligibilityresponseinsuranceitembenefitallowedmoney ********************************************************************************/
		org.hl7.fhir.r4.model.Money coverageeligibilityresponseinsuranceitembenefitallowedmoney = coverageeligibilityresponseinsuranceitembenefit.getAllowedMoney();

		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedMoney_Vl ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefitallowedmoney.hasValue()) {
			c.setCvgElgbltyRspsInsrncItmBnftAllowedMoneyVl(String.valueOf(coverageeligibilityresponseinsuranceitembenefitallowedmoney.getValue()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedMoney_Crncy ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefitallowedmoney.hasCurrency()) {
			c.setCvgElgbltyRspsInsrncItmBnftAllowedMoneyCrncy(String.valueOf(coverageeligibilityresponseinsuranceitembenefitallowedmoney.getCurrency()));
		}
		/******************** coverageeligibilityresponseinsuranceitembenefitusedmoney ********************************************************************************/
		org.hl7.fhir.r4.model.Money coverageeligibilityresponseinsuranceitembenefitusedmoney = coverageeligibilityresponseinsuranceitembenefit.getUsedMoney();

		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedMoney_Vl ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefitusedmoney.hasValue()) {
			c.setCvgElgbltyRspsInsrncItmBnftUsedMoneyVl(String.valueOf(coverageeligibilityresponseinsuranceitembenefitusedmoney.getValue()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedMoney_Crncy ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitembenefitusedmoney.hasCurrency()) {
			c.setCvgElgbltyRspsInsrncItmBnftUsedMoneyCrncy(String.valueOf(coverageeligibilityresponseinsuranceitembenefitusedmoney.getCurrency()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Excluded ********************************************************************************/
		if(coverageeligibilityresponseinsuranceitem.hasExcluded()) {
			c.setCvgElgbltyRspsInsrncItmExcluded(String.valueOf(coverageeligibilityresponseinsuranceitem.getExcluded()));
		}
		/******************** coverageeligibilityresponseinsurancebenefitperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageeligibilityresponseinsurancebenefitperiod = coverageeligibilityresponseinsurance.getBenefitPeriod();

		/******************** CvgElgbltyRsps_Insrnc_BnftPrd_End ********************************************************************************/
		if(coverageeligibilityresponseinsurancebenefitperiod.hasEnd()) {
			c.setCvgElgbltyRspsInsrncBnftPrdEnd(String.valueOf(coverageeligibilityresponseinsurancebenefitperiod.getEnd()));
		}
		/******************** CvgElgbltyRsps_Insrnc_BnftPrd_Strt ********************************************************************************/
		if(coverageeligibilityresponseinsurancebenefitperiod.hasStart()) {
			c.setCvgElgbltyRspsInsrncBnftPrdStrt(String.valueOf(coverageeligibilityresponseinsurancebenefitperiod.getStart()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Inforce ********************************************************************************/
		if(coverageeligibilityresponseinsurance.hasInforce()) {
			c.setCvgElgbltyRspsInsrncInforce(String.valueOf(coverageeligibilityresponseinsurance.getInforce()));
		}
		return c;
	}
}
