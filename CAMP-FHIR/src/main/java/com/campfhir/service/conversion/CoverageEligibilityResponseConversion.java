package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CoverageEligibilityResponse;
public class CoverageEligibilityResponseConversion 
{
	public org.hl7.fhir.r4.model.CoverageEligibilityResponse CoverageEligibilityResponses(CoverageEligibilityResponse c) throws ParseException
	{
		org.hl7.fhir.r4.model.CoverageEligibilityResponse coverageeligibilityresponse = new org.hl7.fhir.r4.model.CoverageEligibilityResponse();

		/******************** id ********************************************************************************/
		coverageeligibilityresponse.setId(c.getId());

		/******************** CvgElgbltyRsps_Created ********************************************************************************/
		if(c.getCvgElgbltyRspsCreated() != null) {
			java.text.SimpleDateFormat CvgElgbltyRsps_Createdsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CvgElgbltyRsps_Createddate = CvgElgbltyRsps_Createdsdf.parse(c.getCvgElgbltyRspsCreated());
			coverageeligibilityresponse.setCreated(CvgElgbltyRsps_Createddate);
		}
		/******************** CvgElgbltyRsps_Disposition ********************************************************************************/
		if(c.getCvgElgbltyRspsDisposition() != null) {
			coverageeligibilityresponse.setDisposition(c.getCvgElgbltyRspsDisposition());
		}
		/******************** coverageeligibilityresponseerror ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityResponse.ErrorsComponent coverageeligibilityresponseerror =  new org.hl7.fhir.r4.model.CoverageEligibilityResponse.ErrorsComponent();
		coverageeligibilityresponse.addError(coverageeligibilityresponseerror);

		/******************** coverageeligibilityresponseerrorcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseerrorcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverageeligibilityresponseerror.setCode(coverageeligibilityresponseerrorcode);

		/******************** coverageeligibilityresponseerrorcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseerrorcodecoding =  new org.hl7.fhir.r4.model.Coding();
		coverageeligibilityresponseerrorcode.addCoding(coverageeligibilityresponseerrorcodecoding);

		/******************** CvgElgbltyRsps_Error_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsErrorCdCdgCd() != null) {
			coverageeligibilityresponseerrorcodecoding.setCode(c.getCvgElgbltyRspsErrorCdCdgCd());
		}
		/******************** CvgElgbltyRsps_Error_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsErrorCdCdgDsply() != null) {
			coverageeligibilityresponseerrorcodecoding.setDisplay(c.getCvgElgbltyRspsErrorCdCdgDsply());
		}
		/******************** CvgElgbltyRsps_Error_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsErrorCdCdgSys() != null) {
			coverageeligibilityresponseerrorcodecoding.setSystem(c.getCvgElgbltyRspsErrorCdCdgSys());
		}
		/******************** CvgElgbltyRsps_Error_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsErrorCdCdgUsrSltd() != null) {
			coverageeligibilityresponseerrorcodecoding.setUserSelected(Boolean.parseBoolean(c.getCvgElgbltyRspsErrorCdCdgUsrSltd()));
		}
		/******************** CvgElgbltyRsps_Error_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsErrorCdCdgVrsn() != null) {
			coverageeligibilityresponseerrorcodecoding.setVersion(c.getCvgElgbltyRspsErrorCdCdgVrsn());
		}
		/******************** CvgElgbltyRsps_Error_Cd_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsErrorCdTxt() != null) {
			coverageeligibilityresponseerrorcode.setText(c.getCvgElgbltyRspsErrorCdTxt());
		}
		/******************** coverageeligibilityresponseform ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseform =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverageeligibilityresponse.setForm(coverageeligibilityresponseform);

		/******************** coverageeligibilityresponseformcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseformcoding =  new org.hl7.fhir.r4.model.Coding();
		coverageeligibilityresponseform.addCoding(coverageeligibilityresponseformcoding);

		/******************** CvgElgbltyRsps_Frm_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsFrmCdgCd() != null) {
			coverageeligibilityresponseformcoding.setCode(c.getCvgElgbltyRspsFrmCdgCd());
		}
		/******************** CvgElgbltyRsps_Frm_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsFrmCdgDsply() != null) {
			coverageeligibilityresponseformcoding.setDisplay(c.getCvgElgbltyRspsFrmCdgDsply());
		}
		/******************** CvgElgbltyRsps_Frm_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsFrmCdgSys() != null) {
			coverageeligibilityresponseformcoding.setSystem(c.getCvgElgbltyRspsFrmCdgSys());
		}
		/******************** CvgElgbltyRsps_Frm_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsFrmCdgUsrSltd() != null) {
			coverageeligibilityresponseformcoding.setUserSelected(Boolean.parseBoolean(c.getCvgElgbltyRspsFrmCdgUsrSltd()));
		}
		/******************** CvgElgbltyRsps_Frm_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsFrmCdgVrsn() != null) {
			coverageeligibilityresponseformcoding.setVersion(c.getCvgElgbltyRspsFrmCdgVrsn());
		}
		/******************** CvgElgbltyRsps_Frm_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsFrmTxt() != null) {
			coverageeligibilityresponseform.setText(c.getCvgElgbltyRspsFrmTxt());
		}
		/******************** coverageeligibilityresponseidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier coverageeligibilityresponseidentifier =  new org.hl7.fhir.r4.model.Identifier();
		coverageeligibilityresponse.addIdentifier(coverageeligibilityresponseidentifier);

		/******************** CvgElgbltyRsps_Id_Assigner ********************************************************************************/
		if(c.getCvgElgbltyRspsIdAssigner() != null) {
			coverageeligibilityresponseidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRspsIdAssigner()));
		}
		/******************** coverageeligibilityresponseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageeligibilityresponseidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		coverageeligibilityresponseidentifier.setPeriod(coverageeligibilityresponseidentifierperiod);

		/******************** CvgElgbltyRsps_Id_Prd_End ********************************************************************************/
		if(c.getCvgElgbltyRspsIdPrdEnd() != null) {
			java.text.SimpleDateFormat CvgElgbltyRsps_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CvgElgbltyRsps_Id_Prd_Enddate = CvgElgbltyRsps_Id_Prd_Endsdf.parse(c.getCvgElgbltyRspsIdPrdEnd());
			coverageeligibilityresponseidentifierperiod.setEnd(CvgElgbltyRsps_Id_Prd_Enddate);
		}
		/******************** CvgElgbltyRsps_Id_Prd_Strt ********************************************************************************/
		if(c.getCvgElgbltyRspsIdPrdStrt() != null) {
			java.text.SimpleDateFormat CvgElgbltyRsps_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CvgElgbltyRsps_Id_Prd_Strtdate = CvgElgbltyRsps_Id_Prd_Strtsdf.parse(c.getCvgElgbltyRspsIdPrdStrt());
			coverageeligibilityresponseidentifierperiod.setStart(CvgElgbltyRsps_Id_Prd_Strtdate);
		}
		/******************** CvgElgbltyRsps_Id_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsIdSys() != null) {
			coverageeligibilityresponseidentifier.setSystem(c.getCvgElgbltyRspsIdSys());
		}
		/******************** coverageeligibilityresponseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverageeligibilityresponseidentifier.setType(coverageeligibilityresponseidentifiertype);

		/******************** coverageeligibilityresponseidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		coverageeligibilityresponseidentifiertype.addCoding(coverageeligibilityresponseidentifiertypecoding);

		/******************** CvgElgbltyRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsIdTypCdgCd() != null) {
			coverageeligibilityresponseidentifiertypecoding.setCode(c.getCvgElgbltyRspsIdTypCdgCd());
		}
		/******************** CvgElgbltyRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsIdTypCdgDsply() != null) {
			coverageeligibilityresponseidentifiertypecoding.setDisplay(c.getCvgElgbltyRspsIdTypCdgDsply());
		}
		/******************** CvgElgbltyRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsIdTypCdgSys() != null) {
			coverageeligibilityresponseidentifiertypecoding.setSystem(c.getCvgElgbltyRspsIdTypCdgSys());
		}
		/******************** CvgElgbltyRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsIdTypCdgUsrSltd() != null) {
			coverageeligibilityresponseidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCvgElgbltyRspsIdTypCdgUsrSltd()));
		}
		/******************** CvgElgbltyRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsIdTypCdgVrsn() != null) {
			coverageeligibilityresponseidentifiertypecoding.setVersion(c.getCvgElgbltyRspsIdTypCdgVrsn());
		}
		/******************** CvgElgbltyRsps_Id_Typ_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsIdTypTxt() != null) {
			coverageeligibilityresponseidentifiertype.setText(c.getCvgElgbltyRspsIdTypTxt());
		}
		/******************** coverageeligibilityresponseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory coverageeligibilityresponseidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		coverageeligibilityresponseidentifier.setUse(coverageeligibilityresponseidentifieruse.fromCode(c.getCvgElgbltyRspsIdUse()));

		/******************** CvgElgbltyRsps_Id_Vl ********************************************************************************/
		if(c.getCvgElgbltyRspsIdVl() != null) {
			coverageeligibilityresponseidentifier.setValue(c.getCvgElgbltyRspsIdVl());
		}
		/******************** coverageeligibilityresponseinsurance ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityResponse.InsuranceComponent coverageeligibilityresponseinsurance =  new org.hl7.fhir.r4.model.CoverageEligibilityResponse.InsuranceComponent();
		coverageeligibilityresponse.addInsurance(coverageeligibilityresponseinsurance);

		/******************** coverageeligibilityresponseinsurancebenefitperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageeligibilityresponseinsurancebenefitperiod =  new org.hl7.fhir.r4.model.Period();
		coverageeligibilityresponseinsurance.setBenefitPeriod(coverageeligibilityresponseinsurancebenefitperiod);

		/******************** CvgElgbltyRsps_Insrnc_BnftPrd_End ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncBnftPrdEnd() != null) {
			java.text.SimpleDateFormat CvgElgbltyRsps_Insrnc_BnftPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CvgElgbltyRsps_Insrnc_BnftPrd_Enddate = CvgElgbltyRsps_Insrnc_BnftPrd_Endsdf.parse(c.getCvgElgbltyRspsInsrncBnftPrdEnd());
			coverageeligibilityresponseinsurancebenefitperiod.setEnd(CvgElgbltyRsps_Insrnc_BnftPrd_Enddate);
		}
		/******************** CvgElgbltyRsps_Insrnc_BnftPrd_Strt ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncBnftPrdStrt() != null) {
			java.text.SimpleDateFormat CvgElgbltyRsps_Insrnc_BnftPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CvgElgbltyRsps_Insrnc_BnftPrd_Strtdate = CvgElgbltyRsps_Insrnc_BnftPrd_Strtsdf.parse(c.getCvgElgbltyRspsInsrncBnftPrdStrt());
			coverageeligibilityresponseinsurancebenefitperiod.setStart(CvgElgbltyRsps_Insrnc_BnftPrd_Strtdate);
		}
		/******************** CvgElgbltyRsps_Insrnc_Cvg ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncCvg() != null) {
			coverageeligibilityresponseinsurance.setCoverage( new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRspsInsrncCvg()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Inforce ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncInforce() != null) {
			coverageeligibilityresponseinsurance.setInforce(Boolean.parseBoolean(c.getCvgElgbltyRspsInsrncInforce()));
		}
		/******************** coverageeligibilityresponseinsuranceitem ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityResponse.ItemsComponent coverageeligibilityresponseinsuranceitem =  new org.hl7.fhir.r4.model.CoverageEligibilityResponse.ItemsComponent();
		coverageeligibilityresponseinsurance.addItem(coverageeligibilityresponseinsuranceitem);

		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnRequired ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmAthztnRequired() != null) {
			coverageeligibilityresponseinsuranceitem.setAuthorizationRequired(Boolean.parseBoolean(c.getCvgElgbltyRspsInsrncItmAthztnRequired()));
		}
		/******************** coverageeligibilityresponseinsuranceitemauthorizationsupporting ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitemauthorizationsupporting =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverageeligibilityresponseinsuranceitem.addAuthorizationSupporting(coverageeligibilityresponseinsuranceitemauthorizationsupporting);

		/******************** coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding =  new org.hl7.fhir.r4.model.Coding();
		coverageeligibilityresponseinsuranceitemauthorizationsupporting.addCoding(coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding);

		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgCd() != null) {
			coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.setCode(c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgCd());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgDsply() != null) {
			coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.setDisplay(c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgDsply());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgSys() != null) {
			coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.setSystem(c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgSys());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgUsrSltd() != null) {
			coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.setUserSelected(Boolean.parseBoolean(c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgUsrSltd()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgVrsn() != null) {
			coverageeligibilityresponseinsuranceitemauthorizationsupportingcoding.setVersion(c.getCvgElgbltyRspsInsrncItmAthztnSprtingCdgVrsn());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnSprting_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmAthztnSprtingTxt() != null) {
			coverageeligibilityresponseinsuranceitemauthorizationsupporting.setText(c.getCvgElgbltyRspsInsrncItmAthztnSprtingTxt());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_AthztnUrl ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmAthztnUrl() != null) {
			coverageeligibilityresponseinsuranceitem.setAuthorizationUrl(c.getCvgElgbltyRspsInsrncItmAthztnUrl());
		}
		/******************** coverageeligibilityresponseinsuranceitembenefit ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityResponse.BenefitComponent coverageeligibilityresponseinsuranceitembenefit =  new org.hl7.fhir.r4.model.CoverageEligibilityResponse.BenefitComponent();
		coverageeligibilityresponseinsuranceitem.addBenefit(coverageeligibilityresponseinsuranceitembenefit);

		/******************** coverageeligibilityresponseinsuranceitembenefitallowedmoney ********************************************************************************/
		org.hl7.fhir.r4.model.Money coverageeligibilityresponseinsuranceitembenefitallowedmoney =  new org.hl7.fhir.r4.model.Money();
		coverageeligibilityresponseinsuranceitembenefit.setAllowed(coverageeligibilityresponseinsuranceitembenefitallowedmoney);

		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedMoney_Crncy ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftAllowedMoneyCrncy() != null) {
			coverageeligibilityresponseinsuranceitembenefitallowedmoney.setCurrency(c.getCvgElgbltyRspsInsrncItmBnftAllowedMoneyCrncy());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedMoney_Vl ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftAllowedMoneyVl() != null) {
			coverageeligibilityresponseinsuranceitembenefitallowedmoney.setValue(Double.parseDouble((c.getCvgElgbltyRspsInsrncItmBnftAllowedMoneyVl())));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedStrgTyp ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftAllowedStrgTyp() != null) {
			coverageeligibilityresponseinsuranceitembenefit.setAllowed( new org.hl7.fhir.r4.model.StringType(c.getCvgElgbltyRspsInsrncItmBnftAllowedStrgTyp()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_AllowedUnsignedIntTyp ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftAllowedUnsignedIntTyp() != null) {
			coverageeligibilityresponseinsuranceitembenefit.setAllowed( new org.hl7.fhir.r4.model.UnsignedIntType(c.getCvgElgbltyRspsInsrncItmBnftAllowedUnsignedIntTyp()));
		}
		/******************** coverageeligibilityresponseinsuranceitembenefittype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitembenefittype =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverageeligibilityresponseinsuranceitembenefit.setType(coverageeligibilityresponseinsuranceitembenefittype);

		/******************** coverageeligibilityresponseinsuranceitembenefittypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseinsuranceitembenefittypecoding =  new org.hl7.fhir.r4.model.Coding();
		coverageeligibilityresponseinsuranceitembenefittype.addCoding(coverageeligibilityresponseinsuranceitembenefittypecoding);

		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftTypCdgCd() != null) {
			coverageeligibilityresponseinsuranceitembenefittypecoding.setCode(c.getCvgElgbltyRspsInsrncItmBnftTypCdgCd());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftTypCdgDsply() != null) {
			coverageeligibilityresponseinsuranceitembenefittypecoding.setDisplay(c.getCvgElgbltyRspsInsrncItmBnftTypCdgDsply());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftTypCdgSys() != null) {
			coverageeligibilityresponseinsuranceitembenefittypecoding.setSystem(c.getCvgElgbltyRspsInsrncItmBnftTypCdgSys());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftTypCdgUsrSltd() != null) {
			coverageeligibilityresponseinsuranceitembenefittypecoding.setUserSelected(Boolean.parseBoolean(c.getCvgElgbltyRspsInsrncItmBnftTypCdgUsrSltd()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftTypCdgVrsn() != null) {
			coverageeligibilityresponseinsuranceitembenefittypecoding.setVersion(c.getCvgElgbltyRspsInsrncItmBnftTypCdgVrsn());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_Typ_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftTypTxt() != null) {
			coverageeligibilityresponseinsuranceitembenefittype.setText(c.getCvgElgbltyRspsInsrncItmBnftTypTxt());
		}
		/******************** coverageeligibilityresponseinsuranceitembenefitusedmoney ********************************************************************************/
		org.hl7.fhir.r4.model.Money coverageeligibilityresponseinsuranceitembenefitusedmoney =  new org.hl7.fhir.r4.model.Money();
		coverageeligibilityresponseinsuranceitembenefit.setUsed(coverageeligibilityresponseinsuranceitembenefitusedmoney);

		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedMoney_Crncy ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftUsedMoneyCrncy() != null) {
			coverageeligibilityresponseinsuranceitembenefitusedmoney.setCurrency(c.getCvgElgbltyRspsInsrncItmBnftUsedMoneyCrncy());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedMoney_Vl ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftUsedMoneyVl() != null) {
			coverageeligibilityresponseinsuranceitembenefitusedmoney.setValue(Double.parseDouble((c.getCvgElgbltyRspsInsrncItmBnftUsedMoneyVl())));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedStrgTyp ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftUsedStrgTyp() != null) {
			coverageeligibilityresponseinsuranceitembenefit.setUsed( new org.hl7.fhir.r4.model.StringType(c.getCvgElgbltyRspsInsrncItmBnftUsedStrgTyp()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Bnft_UsedUnsignedIntTyp ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmBnftUsedUnsignedIntTyp() != null) {
			coverageeligibilityresponseinsuranceitembenefit.setUsed( new org.hl7.fhir.r4.model.UnsignedIntType(c.getCvgElgbltyRspsInsrncItmBnftUsedUnsignedIntTyp()));
		}
		/******************** coverageeligibilityresponseinsuranceitemcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitemcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverageeligibilityresponseinsuranceitem.setCategory(coverageeligibilityresponseinsuranceitemcategory);

		/******************** coverageeligibilityresponseinsuranceitemcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseinsuranceitemcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		coverageeligibilityresponseinsuranceitemcategory.addCoding(coverageeligibilityresponseinsuranceitemcategorycoding);

		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmCtgryCdgCd() != null) {
			coverageeligibilityresponseinsuranceitemcategorycoding.setCode(c.getCvgElgbltyRspsInsrncItmCtgryCdgCd());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmCtgryCdgDsply() != null) {
			coverageeligibilityresponseinsuranceitemcategorycoding.setDisplay(c.getCvgElgbltyRspsInsrncItmCtgryCdgDsply());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmCtgryCdgSys() != null) {
			coverageeligibilityresponseinsuranceitemcategorycoding.setSystem(c.getCvgElgbltyRspsInsrncItmCtgryCdgSys());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmCtgryCdgUsrSltd() != null) {
			coverageeligibilityresponseinsuranceitemcategorycoding.setUserSelected(Boolean.parseBoolean(c.getCvgElgbltyRspsInsrncItmCtgryCdgUsrSltd()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmCtgryCdgVrsn() != null) {
			coverageeligibilityresponseinsuranceitemcategorycoding.setVersion(c.getCvgElgbltyRspsInsrncItmCtgryCdgVrsn());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Ctgry_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmCtgryTxt() != null) {
			coverageeligibilityresponseinsuranceitemcategory.setText(c.getCvgElgbltyRspsInsrncItmCtgryTxt());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Dscrptn ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmDscrptn() != null) {
			coverageeligibilityresponseinsuranceitem.setDescription(c.getCvgElgbltyRspsInsrncItmDscrptn());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Excluded ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmExcluded() != null) {
			coverageeligibilityresponseinsuranceitem.setExcluded(Boolean.parseBoolean(c.getCvgElgbltyRspsInsrncItmExcluded()));
		}
		/******************** coverageeligibilityresponseinsuranceitemmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitemmodifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverageeligibilityresponseinsuranceitem.addModifier(coverageeligibilityresponseinsuranceitemmodifier);

		/******************** coverageeligibilityresponseinsuranceitemmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseinsuranceitemmodifiercoding =  new org.hl7.fhir.r4.model.Coding();
		coverageeligibilityresponseinsuranceitemmodifier.addCoding(coverageeligibilityresponseinsuranceitemmodifiercoding);

		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmMdfrCdgCd() != null) {
			coverageeligibilityresponseinsuranceitemmodifiercoding.setCode(c.getCvgElgbltyRspsInsrncItmMdfrCdgCd());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmMdfrCdgDsply() != null) {
			coverageeligibilityresponseinsuranceitemmodifiercoding.setDisplay(c.getCvgElgbltyRspsInsrncItmMdfrCdgDsply());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmMdfrCdgSys() != null) {
			coverageeligibilityresponseinsuranceitemmodifiercoding.setSystem(c.getCvgElgbltyRspsInsrncItmMdfrCdgSys());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmMdfrCdgUsrSltd() != null) {
			coverageeligibilityresponseinsuranceitemmodifiercoding.setUserSelected(Boolean.parseBoolean(c.getCvgElgbltyRspsInsrncItmMdfrCdgUsrSltd()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmMdfrCdgVrsn() != null) {
			coverageeligibilityresponseinsuranceitemmodifiercoding.setVersion(c.getCvgElgbltyRspsInsrncItmMdfrCdgVrsn());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Mdfr_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmMdfrTxt() != null) {
			coverageeligibilityresponseinsuranceitemmodifier.setText(c.getCvgElgbltyRspsInsrncItmMdfrTxt());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Nm ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmNm() != null) {
			coverageeligibilityresponseinsuranceitem.setName(c.getCvgElgbltyRspsInsrncItmNm());
		}
		/******************** coverageeligibilityresponseinsuranceitemnetwork ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitemnetwork =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverageeligibilityresponseinsuranceitem.setNetwork(coverageeligibilityresponseinsuranceitemnetwork);

		/******************** coverageeligibilityresponseinsuranceitemnetworkcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseinsuranceitemnetworkcoding =  new org.hl7.fhir.r4.model.Coding();
		coverageeligibilityresponseinsuranceitemnetwork.addCoding(coverageeligibilityresponseinsuranceitemnetworkcoding);

		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmNetworkCdgCd() != null) {
			coverageeligibilityresponseinsuranceitemnetworkcoding.setCode(c.getCvgElgbltyRspsInsrncItmNetworkCdgCd());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmNetworkCdgDsply() != null) {
			coverageeligibilityresponseinsuranceitemnetworkcoding.setDisplay(c.getCvgElgbltyRspsInsrncItmNetworkCdgDsply());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmNetworkCdgSys() != null) {
			coverageeligibilityresponseinsuranceitemnetworkcoding.setSystem(c.getCvgElgbltyRspsInsrncItmNetworkCdgSys());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmNetworkCdgUsrSltd() != null) {
			coverageeligibilityresponseinsuranceitemnetworkcoding.setUserSelected(Boolean.parseBoolean(c.getCvgElgbltyRspsInsrncItmNetworkCdgUsrSltd()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmNetworkCdgVrsn() != null) {
			coverageeligibilityresponseinsuranceitemnetworkcoding.setVersion(c.getCvgElgbltyRspsInsrncItmNetworkCdgVrsn());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Network_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmNetworkTxt() != null) {
			coverageeligibilityresponseinsuranceitemnetwork.setText(c.getCvgElgbltyRspsInsrncItmNetworkTxt());
		}
		/******************** coverageeligibilityresponseinsuranceitemproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitemproductorservice =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverageeligibilityresponseinsuranceitem.setProductOrService(coverageeligibilityresponseinsuranceitemproductorservice);

		/******************** coverageeligibilityresponseinsuranceitemproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseinsuranceitemproductorservicecoding =  new org.hl7.fhir.r4.model.Coding();
		coverageeligibilityresponseinsuranceitemproductorservice.addCoding(coverageeligibilityresponseinsuranceitemproductorservicecoding);

		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgCd() != null) {
			coverageeligibilityresponseinsuranceitemproductorservicecoding.setCode(c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgCd());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgDsply() != null) {
			coverageeligibilityresponseinsuranceitemproductorservicecoding.setDisplay(c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgDsply());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgSys() != null) {
			coverageeligibilityresponseinsuranceitemproductorservicecoding.setSystem(c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgSys());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgUsrSltd() != null) {
			coverageeligibilityresponseinsuranceitemproductorservicecoding.setUserSelected(Boolean.parseBoolean(c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgUsrSltd()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgVrsn() != null) {
			coverageeligibilityresponseinsuranceitemproductorservicecoding.setVersion(c.getCvgElgbltyRspsInsrncItmPrdctOrSrvCdgVrsn());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_PrdctOrSrv_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmPrdctOrSrvTxt() != null) {
			coverageeligibilityresponseinsuranceitemproductorservice.setText(c.getCvgElgbltyRspsInsrncItmPrdctOrSrvTxt());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Provider ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmProvider() != null) {
			coverageeligibilityresponseinsuranceitem.setProvider( new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRspsInsrncItmProvider()));
		}
		/******************** coverageeligibilityresponseinsuranceitemterm ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitemterm =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverageeligibilityresponseinsuranceitem.setTerm(coverageeligibilityresponseinsuranceitemterm);

		/******************** coverageeligibilityresponseinsuranceitemtermcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseinsuranceitemtermcoding =  new org.hl7.fhir.r4.model.Coding();
		coverageeligibilityresponseinsuranceitemterm.addCoding(coverageeligibilityresponseinsuranceitemtermcoding);

		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmTrmCdgCd() != null) {
			coverageeligibilityresponseinsuranceitemtermcoding.setCode(c.getCvgElgbltyRspsInsrncItmTrmCdgCd());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmTrmCdgDsply() != null) {
			coverageeligibilityresponseinsuranceitemtermcoding.setDisplay(c.getCvgElgbltyRspsInsrncItmTrmCdgDsply());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmTrmCdgSys() != null) {
			coverageeligibilityresponseinsuranceitemtermcoding.setSystem(c.getCvgElgbltyRspsInsrncItmTrmCdgSys());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmTrmCdgUsrSltd() != null) {
			coverageeligibilityresponseinsuranceitemtermcoding.setUserSelected(Boolean.parseBoolean(c.getCvgElgbltyRspsInsrncItmTrmCdgUsrSltd()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmTrmCdgVrsn() != null) {
			coverageeligibilityresponseinsuranceitemtermcoding.setVersion(c.getCvgElgbltyRspsInsrncItmTrmCdgVrsn());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Trm_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmTrmTxt() != null) {
			coverageeligibilityresponseinsuranceitemterm.setText(c.getCvgElgbltyRspsInsrncItmTrmTxt());
		}
		/******************** coverageeligibilityresponseinsuranceitemunit ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityresponseinsuranceitemunit =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverageeligibilityresponseinsuranceitem.setUnit(coverageeligibilityresponseinsuranceitemunit);

		/******************** coverageeligibilityresponseinsuranceitemunitcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityresponseinsuranceitemunitcoding =  new org.hl7.fhir.r4.model.Coding();
		coverageeligibilityresponseinsuranceitemunit.addCoding(coverageeligibilityresponseinsuranceitemunitcoding);

		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmUntCdgCd() != null) {
			coverageeligibilityresponseinsuranceitemunitcoding.setCode(c.getCvgElgbltyRspsInsrncItmUntCdgCd());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmUntCdgDsply() != null) {
			coverageeligibilityresponseinsuranceitemunitcoding.setDisplay(c.getCvgElgbltyRspsInsrncItmUntCdgDsply());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmUntCdgSys() != null) {
			coverageeligibilityresponseinsuranceitemunitcoding.setSystem(c.getCvgElgbltyRspsInsrncItmUntCdgSys());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmUntCdgUsrSltd() != null) {
			coverageeligibilityresponseinsuranceitemunitcoding.setUserSelected(Boolean.parseBoolean(c.getCvgElgbltyRspsInsrncItmUntCdgUsrSltd()));
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmUntCdgVrsn() != null) {
			coverageeligibilityresponseinsuranceitemunitcoding.setVersion(c.getCvgElgbltyRspsInsrncItmUntCdgVrsn());
		}
		/******************** CvgElgbltyRsps_Insrnc_Itm_Unt_Txt ********************************************************************************/
		if(c.getCvgElgbltyRspsInsrncItmUntTxt() != null) {
			coverageeligibilityresponseinsuranceitemunit.setText(c.getCvgElgbltyRspsInsrncItmUntTxt());
		}
		/******************** CvgElgbltyRsps_Insurer ********************************************************************************/
		if(c.getCvgElgbltyRspsInsurer() != null) {
			coverageeligibilityresponse.setInsurer( new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRspsInsurer()));
		}
		/******************** coverageeligibilityresponseoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.RemittanceOutcomeEnumFactory coverageeligibilityresponseoutcome =  new org.hl7.fhir.r4.model.Enumerations.RemittanceOutcomeEnumFactory();
		coverageeligibilityresponse.setOutcome(coverageeligibilityresponseoutcome.fromCode(c.getCvgElgbltyRspsOutcome()));

		/******************** CvgElgbltyRsps_Pnt ********************************************************************************/
		if(c.getCvgElgbltyRspsPnt() != null) {
			coverageeligibilityresponse.setPatient( new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRspsPnt()));
		}
		/******************** CvgElgbltyRsps_PreAuthRef ********************************************************************************/
		if(c.getCvgElgbltyRspsPreAuthRef() != null) {
			coverageeligibilityresponse.setPreAuthRef(c.getCvgElgbltyRspsPreAuthRef());
		}
		/******************** coverageeligibilityresponsepurpose ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityResponse.EligibilityResponsePurposeEnumFactory coverageeligibilityresponsepurpose =  new org.hl7.fhir.r4.model.CoverageEligibilityResponse.EligibilityResponsePurposeEnumFactory();
		coverageeligibilityresponse.addPurpose(coverageeligibilityresponsepurpose.fromCode(c.getCvgElgbltyRspsPrpse()));

		/******************** CvgElgbltyRsps_Rqst ********************************************************************************/
		if(c.getCvgElgbltyRspsRqst() != null) {
			coverageeligibilityresponse.setRequest( new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRspsRqst()));
		}
		/******************** CvgElgbltyRsps_Rqstor ********************************************************************************/
		if(c.getCvgElgbltyRspsRqstor() != null) {
			coverageeligibilityresponse.setRequestor( new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRspsRqstor()));
		}
		/******************** CvgElgbltyRsps_SrvdDtTyp ********************************************************************************/
		if(c.getCvgElgbltyRspsSrvdDtTyp() != null) {
			coverageeligibilityresponse.setServiced( new org.hl7.fhir.r4.model.DateType(c.getCvgElgbltyRspsSrvdDtTyp()));
		}
		/******************** coverageeligibilityresponseservicedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageeligibilityresponseservicedperiod =  new org.hl7.fhir.r4.model.Period();
		coverageeligibilityresponse.setServiced(coverageeligibilityresponseservicedperiod);

		/******************** CvgElgbltyRsps_SrvdPrd_End ********************************************************************************/
		if(c.getCvgElgbltyRspsSrvdPrdEnd() != null) {
			java.text.SimpleDateFormat CvgElgbltyRsps_SrvdPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CvgElgbltyRsps_SrvdPrd_Enddate = CvgElgbltyRsps_SrvdPrd_Endsdf.parse(c.getCvgElgbltyRspsSrvdPrdEnd());
			coverageeligibilityresponseservicedperiod.setEnd(CvgElgbltyRsps_SrvdPrd_Enddate);
		}
		/******************** CvgElgbltyRsps_SrvdPrd_Strt ********************************************************************************/
		if(c.getCvgElgbltyRspsSrvdPrdStrt() != null) {
			java.text.SimpleDateFormat CvgElgbltyRsps_SrvdPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CvgElgbltyRsps_SrvdPrd_Strtdate = CvgElgbltyRsps_SrvdPrd_Strtsdf.parse(c.getCvgElgbltyRspsSrvdPrdStrt());
			coverageeligibilityresponseservicedperiod.setStart(CvgElgbltyRsps_SrvdPrd_Strtdate);
		}
		/******************** coverageeligibilityresponsestatus ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityResponse.EligibilityResponseStatusEnumFactory coverageeligibilityresponsestatus =  new org.hl7.fhir.r4.model.CoverageEligibilityResponse.EligibilityResponseStatusEnumFactory();
		coverageeligibilityresponse.setStatus(coverageeligibilityresponsestatus.fromCode(c.getCvgElgbltyRspsSts()));

		return coverageeligibilityresponse;
	}
}
