package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.InsurancePlan;
public class InsurancePlanConversion 
{
	public org.hl7.fhir.r4.model.InsurancePlan InsurancePlans(InsurancePlan i) throws ParseException
	{
		org.hl7.fhir.r4.model.InsurancePlan insuranceplan = new org.hl7.fhir.r4.model.InsurancePlan();

		/******************** id ********************************************************************************/
		insuranceplan.setId(i.getId());

		/******************** InsrncPln_AdministeredBy ********************************************************************************/
		if(i.getInsrncPlnAdministeredBy() != null) {
			insuranceplan.setAdministeredBy( new org.hl7.fhir.r4.model.Reference(i.getInsrncPlnAdministeredBy()));
		}
		/******************** InsrncPln_Alias ********************************************************************************/
		if(i.getInsrncPlnAlias() != null) {
			insuranceplan.addAlias(i.getInsrncPlnAlias());
		}
		/******************** insuranceplancontact ********************************************************************************/
		org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanContactComponent insuranceplancontact =  new org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanContactComponent();
		insuranceplan.addContact(insuranceplancontact);

		/******************** insuranceplancontactaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address insuranceplancontactaddress =  new org.hl7.fhir.r4.model.Address();
		insuranceplancontact.setAddress(insuranceplancontactaddress);

		/******************** InsrncPln_Cntct_Addr_City ********************************************************************************/
		if(i.getInsrncPlnCntctAddrCity() != null) {
			insuranceplancontactaddress.setCity(i.getInsrncPlnCntctAddrCity());
		}
		/******************** InsrncPln_Cntct_Addr_Cntry ********************************************************************************/
		if(i.getInsrncPlnCntctAddrCntry() != null) {
			insuranceplancontactaddress.setCountry(i.getInsrncPlnCntctAddrCntry());
		}
		/******************** InsrncPln_Cntct_Addr_District ********************************************************************************/
		if(i.getInsrncPlnCntctAddrDistrict() != null) {
			insuranceplancontactaddress.setDistrict(i.getInsrncPlnCntctAddrDistrict());
		}
		/******************** InsrncPln_Cntct_Addr_Line ********************************************************************************/
		if(i.getInsrncPlnCntctAddrLine() != null) {
			insuranceplancontactaddress.addLine(i.getInsrncPlnCntctAddrLine());
		}
		/******************** insuranceplancontactaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period insuranceplancontactaddressperiod =  new org.hl7.fhir.r4.model.Period();
		insuranceplancontactaddress.setPeriod(insuranceplancontactaddressperiod);

		/******************** InsrncPln_Cntct_Addr_Prd_End ********************************************************************************/
		if(i.getInsrncPlnCntctAddrPrdEnd() != null) {
			java.text.SimpleDateFormat InsrncPln_Cntct_Addr_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date InsrncPln_Cntct_Addr_Prd_Enddate = InsrncPln_Cntct_Addr_Prd_Endsdf.parse(i.getInsrncPlnCntctAddrPrdEnd());
			insuranceplancontactaddressperiod.setEnd(InsrncPln_Cntct_Addr_Prd_Enddate);
		}
		/******************** InsrncPln_Cntct_Addr_Prd_Strt ********************************************************************************/
		if(i.getInsrncPlnCntctAddrPrdStrt() != null) {
			java.text.SimpleDateFormat InsrncPln_Cntct_Addr_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date InsrncPln_Cntct_Addr_Prd_Strtdate = InsrncPln_Cntct_Addr_Prd_Strtsdf.parse(i.getInsrncPlnCntctAddrPrdStrt());
			insuranceplancontactaddressperiod.setStart(InsrncPln_Cntct_Addr_Prd_Strtdate);
		}
		/******************** InsrncPln_Cntct_Addr_PostalCd ********************************************************************************/
		if(i.getInsrncPlnCntctAddrPostalCd() != null) {
			insuranceplancontactaddress.setPostalCode(i.getInsrncPlnCntctAddrPostalCd());
		}
		/******************** InsrncPln_Cntct_Addr_State ********************************************************************************/
		if(i.getInsrncPlnCntctAddrState() != null) {
			insuranceplancontactaddress.setState(i.getInsrncPlnCntctAddrState());
		}
		/******************** InsrncPln_Cntct_Addr_Txt ********************************************************************************/
		if(i.getInsrncPlnCntctAddrTxt() != null) {
			insuranceplancontactaddress.setText(i.getInsrncPlnCntctAddrTxt());
		}
		/******************** insuranceplancontactaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory insuranceplancontactaddresstype =  new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();
		insuranceplancontactaddress.setType(insuranceplancontactaddresstype.fromCode(i.getInsrncPlnCntctAddrTyp()));

		/******************** insuranceplancontactaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory insuranceplancontactaddressuse =  new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();
		insuranceplancontactaddress.setUse(insuranceplancontactaddressuse.fromCode(i.getInsrncPlnCntctAddrUse()));

		/******************** insuranceplancontactname ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName insuranceplancontactname =  new org.hl7.fhir.r4.model.HumanName();
		insuranceplancontact.setName(insuranceplancontactname);

		/******************** InsrncPln_Cntct_Nm_Fmly ********************************************************************************/
		if(i.getInsrncPlnCntctNmFmly() != null) {
			insuranceplancontactname.setFamily(i.getInsrncPlnCntctNmFmly());
		}
		/******************** InsrncPln_Cntct_Nm_Given ********************************************************************************/
		if(i.getInsrncPlnCntctNmGiven() != null) {
			insuranceplancontactname.addGiven(i.getInsrncPlnCntctNmGiven());
		}
		/******************** insuranceplancontactnameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period insuranceplancontactnameperiod =  new org.hl7.fhir.r4.model.Period();
		insuranceplancontactname.setPeriod(insuranceplancontactnameperiod);

		/******************** InsrncPln_Cntct_Nm_Prd_End ********************************************************************************/
		if(i.getInsrncPlnCntctNmPrdEnd() != null) {
			java.text.SimpleDateFormat InsrncPln_Cntct_Nm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date InsrncPln_Cntct_Nm_Prd_Enddate = InsrncPln_Cntct_Nm_Prd_Endsdf.parse(i.getInsrncPlnCntctNmPrdEnd());
			insuranceplancontactnameperiod.setEnd(InsrncPln_Cntct_Nm_Prd_Enddate);
		}
		/******************** InsrncPln_Cntct_Nm_Prd_Strt ********************************************************************************/
		if(i.getInsrncPlnCntctNmPrdStrt() != null) {
			java.text.SimpleDateFormat InsrncPln_Cntct_Nm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date InsrncPln_Cntct_Nm_Prd_Strtdate = InsrncPln_Cntct_Nm_Prd_Strtsdf.parse(i.getInsrncPlnCntctNmPrdStrt());
			insuranceplancontactnameperiod.setStart(InsrncPln_Cntct_Nm_Prd_Strtdate);
		}
		/******************** InsrncPln_Cntct_Nm_Prefix ********************************************************************************/
		if(i.getInsrncPlnCntctNmPrefix() != null) {
			insuranceplancontactname.addPrefix(i.getInsrncPlnCntctNmPrefix());
		}
		/******************** InsrncPln_Cntct_Nm_Suffix ********************************************************************************/
		if(i.getInsrncPlnCntctNmSuffix() != null) {
			insuranceplancontactname.addSuffix(i.getInsrncPlnCntctNmSuffix());
		}
		/******************** InsrncPln_Cntct_Nm_Txt ********************************************************************************/
		if(i.getInsrncPlnCntctNmTxt() != null) {
			insuranceplancontactname.setText(i.getInsrncPlnCntctNmTxt());
		}
		/******************** insuranceplancontactnameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory insuranceplancontactnameuse =  new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory();
		insuranceplancontactname.setUse(insuranceplancontactnameuse.fromCode(i.getInsrncPlnCntctNmUse()));

		/******************** insuranceplancontactpurpose ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplancontactpurpose =  new org.hl7.fhir.r4.model.CodeableConcept();
		insuranceplancontact.setPurpose(insuranceplancontactpurpose);

		/******************** insuranceplancontactpurposecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplancontactpurposecoding =  new org.hl7.fhir.r4.model.Coding();
		insuranceplancontactpurpose.addCoding(insuranceplancontactpurposecoding);

		/******************** InsrncPln_Cntct_Prpse_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnCntctPrpseCdgCd() != null) {
			insuranceplancontactpurposecoding.setCode(i.getInsrncPlnCntctPrpseCdgCd());
		}
		/******************** InsrncPln_Cntct_Prpse_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnCntctPrpseCdgDsply() != null) {
			insuranceplancontactpurposecoding.setDisplay(i.getInsrncPlnCntctPrpseCdgDsply());
		}
		/******************** InsrncPln_Cntct_Prpse_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnCntctPrpseCdgSys() != null) {
			insuranceplancontactpurposecoding.setSystem(i.getInsrncPlnCntctPrpseCdgSys());
		}
		/******************** InsrncPln_Cntct_Prpse_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnCntctPrpseCdgUsrSltd() != null) {
			insuranceplancontactpurposecoding.setUserSelected(Boolean.parseBoolean(i.getInsrncPlnCntctPrpseCdgUsrSltd()));
		}
		/******************** InsrncPln_Cntct_Prpse_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnCntctPrpseCdgVrsn() != null) {
			insuranceplancontactpurposecoding.setVersion(i.getInsrncPlnCntctPrpseCdgVrsn());
		}
		/******************** InsrncPln_Cntct_Prpse_Txt ********************************************************************************/
		if(i.getInsrncPlnCntctPrpseTxt() != null) {
			insuranceplancontactpurpose.setText(i.getInsrncPlnCntctPrpseTxt());
		}
		/******************** insuranceplancontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint insuranceplancontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		insuranceplancontact.addTelecom(insuranceplancontacttelecom);

		/******************** insuranceplancontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period insuranceplancontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		insuranceplancontacttelecom.setPeriod(insuranceplancontacttelecomperiod);

		/******************** InsrncPln_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(i.getInsrncPlnCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat InsrncPln_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date InsrncPln_Cntct_Tlcm_Prd_Enddate = InsrncPln_Cntct_Tlcm_Prd_Endsdf.parse(i.getInsrncPlnCntctTlcmPrdEnd());
			insuranceplancontacttelecomperiod.setEnd(InsrncPln_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** InsrncPln_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(i.getInsrncPlnCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat InsrncPln_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date InsrncPln_Cntct_Tlcm_Prd_Strtdate = InsrncPln_Cntct_Tlcm_Prd_Strtsdf.parse(i.getInsrncPlnCntctTlcmPrdStrt());
			insuranceplancontacttelecomperiod.setStart(InsrncPln_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** InsrncPln_Cntct_Tlcm_Rnk ********************************************************************************/
		if(i.getInsrncPlnCntctTlcmRnk() != null) {
			insuranceplancontacttelecom.setRank(Integer.parseInt(i.getInsrncPlnCntctTlcmRnk()));
		}
		/******************** insuranceplancontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory insuranceplancontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		insuranceplancontacttelecom.setSystem(insuranceplancontacttelecomsystem.fromCode(i.getInsrncPlnCntctTlcmSys()));

		/******************** insuranceplancontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory insuranceplancontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		insuranceplancontacttelecom.setUse(insuranceplancontacttelecomuse.fromCode(i.getInsrncPlnCntctTlcmUse()));

		/******************** InsrncPln_Cntct_Tlcm_Vl ********************************************************************************/
		if(i.getInsrncPlnCntctTlcmVl() != null) {
			insuranceplancontacttelecom.setValue(i.getInsrncPlnCntctTlcmVl());
		}
		/******************** insuranceplancoverage ********************************************************************************/
		org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanCoverageComponent insuranceplancoverage =  new org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanCoverageComponent();
		insuranceplan.addCoverage(insuranceplancoverage);

		/******************** insuranceplancoveragebenefit ********************************************************************************/
		org.hl7.fhir.r4.model.InsurancePlan.CoverageBenefitComponent insuranceplancoveragebenefit =  new org.hl7.fhir.r4.model.InsurancePlan.CoverageBenefitComponent();
		insuranceplancoverage.addBenefit(insuranceplancoveragebenefit);

		/******************** insuranceplancoveragebenefitlimit ********************************************************************************/
		org.hl7.fhir.r4.model.InsurancePlan.CoverageBenefitLimitComponent insuranceplancoveragebenefitlimit =  new org.hl7.fhir.r4.model.InsurancePlan.CoverageBenefitLimitComponent();
		insuranceplancoveragebenefit.addLimit(insuranceplancoveragebenefitlimit);

		/******************** insuranceplancoveragebenefitlimitcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplancoveragebenefitlimitcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		insuranceplancoveragebenefitlimit.setCode(insuranceplancoveragebenefitlimitcode);

		/******************** insuranceplancoveragebenefitlimitcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplancoveragebenefitlimitcodecoding =  new org.hl7.fhir.r4.model.Coding();
		insuranceplancoveragebenefitlimitcode.addCoding(insuranceplancoveragebenefitlimitcodecoding);

		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtCdCdgCd() != null) {
			insuranceplancoveragebenefitlimitcodecoding.setCode(i.getInsrncPlnCvgBnftLmtCdCdgCd());
		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtCdCdgDsply() != null) {
			insuranceplancoveragebenefitlimitcodecoding.setDisplay(i.getInsrncPlnCvgBnftLmtCdCdgDsply());
		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtCdCdgSys() != null) {
			insuranceplancoveragebenefitlimitcodecoding.setSystem(i.getInsrncPlnCvgBnftLmtCdCdgSys());
		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtCdCdgUsrSltd() != null) {
			insuranceplancoveragebenefitlimitcodecoding.setUserSelected(Boolean.parseBoolean(i.getInsrncPlnCvgBnftLmtCdCdgUsrSltd()));
		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtCdCdgVrsn() != null) {
			insuranceplancoveragebenefitlimitcodecoding.setVersion(i.getInsrncPlnCvgBnftLmtCdCdgVrsn());
		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Txt ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtCdTxt() != null) {
			insuranceplancoveragebenefitlimitcode.setText(i.getInsrncPlnCvgBnftLmtCdTxt());
		}
		/******************** insuranceplancoveragebenefitlimitvalue ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity insuranceplancoveragebenefitlimitvalue =  new org.hl7.fhir.r4.model.Quantity();
		insuranceplancoveragebenefitlimit.setValue(insuranceplancoveragebenefitlimitvalue);

		/******************** InsrncPln_Cvg_Bnft_Lmt_Vl_Cd ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtVlCd() != null) {
			insuranceplancoveragebenefitlimitvalue.setCode(i.getInsrncPlnCvgBnftLmtVlCd());
		}
		/******************** insuranceplancoveragebenefitlimitvaluecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory insuranceplancoveragebenefitlimitvaluecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		insuranceplancoveragebenefitlimitvalue.setComparator(insuranceplancoveragebenefitlimitvaluecomparator.fromCode(i.getInsrncPlnCvgBnftLmtVlCmprtr()));

		/******************** InsrncPln_Cvg_Bnft_Lmt_Vl_Sys ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtVlSys() != null) {
			insuranceplancoveragebenefitlimitvalue.setSystem(i.getInsrncPlnCvgBnftLmtVlSys());
		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Vl_Unt ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtVlUnt() != null) {
			insuranceplancoveragebenefitlimitvalue.setUnit(i.getInsrncPlnCvgBnftLmtVlUnt());
		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Vl_Vl ********************************************************************************/
		if(i.getInsrncPlnCvgBnftLmtVlVl() != null) {
			insuranceplancoveragebenefitlimitvalue.setValue(Double.parseDouble((i.getInsrncPlnCvgBnftLmtVlVl())));
		}
		/******************** InsrncPln_Cvg_Bnft_Rqrment ********************************************************************************/
		if(i.getInsrncPlnCvgBnftRqrment() != null) {
			insuranceplancoveragebenefit.setRequirement(i.getInsrncPlnCvgBnftRqrment());
		}
		/******************** insuranceplancoveragebenefittype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplancoveragebenefittype =  new org.hl7.fhir.r4.model.CodeableConcept();
		insuranceplancoveragebenefit.setType(insuranceplancoveragebenefittype);

		/******************** insuranceplancoveragebenefittypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplancoveragebenefittypecoding =  new org.hl7.fhir.r4.model.Coding();
		insuranceplancoveragebenefittype.addCoding(insuranceplancoveragebenefittypecoding);

		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnCvgBnftTypCdgCd() != null) {
			insuranceplancoveragebenefittypecoding.setCode(i.getInsrncPlnCvgBnftTypCdgCd());
		}
		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnCvgBnftTypCdgDsply() != null) {
			insuranceplancoveragebenefittypecoding.setDisplay(i.getInsrncPlnCvgBnftTypCdgDsply());
		}
		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnCvgBnftTypCdgSys() != null) {
			insuranceplancoveragebenefittypecoding.setSystem(i.getInsrncPlnCvgBnftTypCdgSys());
		}
		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnCvgBnftTypCdgUsrSltd() != null) {
			insuranceplancoveragebenefittypecoding.setUserSelected(Boolean.parseBoolean(i.getInsrncPlnCvgBnftTypCdgUsrSltd()));
		}
		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnCvgBnftTypCdgVrsn() != null) {
			insuranceplancoveragebenefittypecoding.setVersion(i.getInsrncPlnCvgBnftTypCdgVrsn());
		}
		/******************** InsrncPln_Cvg_Bnft_Typ_Txt ********************************************************************************/
		if(i.getInsrncPlnCvgBnftTypTxt() != null) {
			insuranceplancoveragebenefittype.setText(i.getInsrncPlnCvgBnftTypTxt());
		}
		/******************** InsrncPln_Cvg_Network ********************************************************************************/
		if(i.getInsrncPlnCvgNetwork() != null) {
			insuranceplancoverage.addNetwork( new org.hl7.fhir.r4.model.Reference(i.getInsrncPlnCvgNetwork()));
		}
		/******************** insuranceplancoveragetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplancoveragetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		insuranceplancoverage.setType(insuranceplancoveragetype);

		/******************** insuranceplancoveragetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplancoveragetypecoding =  new org.hl7.fhir.r4.model.Coding();
		insuranceplancoveragetype.addCoding(insuranceplancoveragetypecoding);

		/******************** InsrncPln_Cvg_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnCvgTypCdgCd() != null) {
			insuranceplancoveragetypecoding.setCode(i.getInsrncPlnCvgTypCdgCd());
		}
		/******************** InsrncPln_Cvg_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnCvgTypCdgDsply() != null) {
			insuranceplancoveragetypecoding.setDisplay(i.getInsrncPlnCvgTypCdgDsply());
		}
		/******************** InsrncPln_Cvg_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnCvgTypCdgSys() != null) {
			insuranceplancoveragetypecoding.setSystem(i.getInsrncPlnCvgTypCdgSys());
		}
		/******************** InsrncPln_Cvg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnCvgTypCdgUsrSltd() != null) {
			insuranceplancoveragetypecoding.setUserSelected(Boolean.parseBoolean(i.getInsrncPlnCvgTypCdgUsrSltd()));
		}
		/******************** InsrncPln_Cvg_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnCvgTypCdgVrsn() != null) {
			insuranceplancoveragetypecoding.setVersion(i.getInsrncPlnCvgTypCdgVrsn());
		}
		/******************** InsrncPln_Cvg_Typ_Txt ********************************************************************************/
		if(i.getInsrncPlnCvgTypTxt() != null) {
			insuranceplancoveragetype.setText(i.getInsrncPlnCvgTypTxt());
		}
		/******************** InsrncPln_CvgArea ********************************************************************************/
		if(i.getInsrncPlnCvgArea() != null) {
			insuranceplan.addCoverageArea( new org.hl7.fhir.r4.model.Reference(i.getInsrncPlnCvgArea()));
		}
		/******************** InsrncPln_Endpoint ********************************************************************************/
		if(i.getInsrncPlnEndpoint() != null) {
			insuranceplan.addEndpoint( new org.hl7.fhir.r4.model.Reference(i.getInsrncPlnEndpoint()));
		}
		/******************** insuranceplanidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier insuranceplanidentifier =  new org.hl7.fhir.r4.model.Identifier();
		insuranceplan.addIdentifier(insuranceplanidentifier);

		/******************** InsrncPln_Id_Assigner ********************************************************************************/
		if(i.getInsrncPlnIdAssigner() != null) {
			insuranceplanidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(i.getInsrncPlnIdAssigner()));
		}
		/******************** insuranceplanidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period insuranceplanidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		insuranceplanidentifier.setPeriod(insuranceplanidentifierperiod);

		/******************** InsrncPln_Id_Prd_End ********************************************************************************/
		if(i.getInsrncPlnIdPrdEnd() != null) {
			java.text.SimpleDateFormat InsrncPln_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date InsrncPln_Id_Prd_Enddate = InsrncPln_Id_Prd_Endsdf.parse(i.getInsrncPlnIdPrdEnd());
			insuranceplanidentifierperiod.setEnd(InsrncPln_Id_Prd_Enddate);
		}
		/******************** InsrncPln_Id_Prd_Strt ********************************************************************************/
		if(i.getInsrncPlnIdPrdStrt() != null) {
			java.text.SimpleDateFormat InsrncPln_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date InsrncPln_Id_Prd_Strtdate = InsrncPln_Id_Prd_Strtsdf.parse(i.getInsrncPlnIdPrdStrt());
			insuranceplanidentifierperiod.setStart(InsrncPln_Id_Prd_Strtdate);
		}
		/******************** InsrncPln_Id_Sys ********************************************************************************/
		if(i.getInsrncPlnIdSys() != null) {
			insuranceplanidentifier.setSystem(i.getInsrncPlnIdSys());
		}
		/******************** insuranceplanidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		insuranceplanidentifier.setType(insuranceplanidentifiertype);

		/******************** insuranceplanidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplanidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		insuranceplanidentifiertype.addCoding(insuranceplanidentifiertypecoding);

		/******************** InsrncPln_Id_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnIdTypCdgCd() != null) {
			insuranceplanidentifiertypecoding.setCode(i.getInsrncPlnIdTypCdgCd());
		}
		/******************** InsrncPln_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnIdTypCdgDsply() != null) {
			insuranceplanidentifiertypecoding.setDisplay(i.getInsrncPlnIdTypCdgDsply());
		}
		/******************** InsrncPln_Id_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnIdTypCdgSys() != null) {
			insuranceplanidentifiertypecoding.setSystem(i.getInsrncPlnIdTypCdgSys());
		}
		/******************** InsrncPln_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnIdTypCdgUsrSltd() != null) {
			insuranceplanidentifiertypecoding.setUserSelected(Boolean.parseBoolean(i.getInsrncPlnIdTypCdgUsrSltd()));
		}
		/******************** InsrncPln_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnIdTypCdgVrsn() != null) {
			insuranceplanidentifiertypecoding.setVersion(i.getInsrncPlnIdTypCdgVrsn());
		}
		/******************** InsrncPln_Id_Typ_Txt ********************************************************************************/
		if(i.getInsrncPlnIdTypTxt() != null) {
			insuranceplanidentifiertype.setText(i.getInsrncPlnIdTypTxt());
		}
		/******************** insuranceplanidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory insuranceplanidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		insuranceplanidentifier.setUse(insuranceplanidentifieruse.fromCode(i.getInsrncPlnIdUse()));

		/******************** InsrncPln_Id_Vl ********************************************************************************/
		if(i.getInsrncPlnIdVl() != null) {
			insuranceplanidentifier.setValue(i.getInsrncPlnIdVl());
		}
		/******************** InsrncPln_Nm ********************************************************************************/
		if(i.getInsrncPlnNm() != null) {
			insuranceplan.setName(i.getInsrncPlnNm());
		}
		/******************** InsrncPln_Network ********************************************************************************/
		if(i.getInsrncPlnNetwork() != null) {
			insuranceplan.addNetwork( new org.hl7.fhir.r4.model.Reference(i.getInsrncPlnNetwork()));
		}
		/******************** InsrncPln_OwnedBy ********************************************************************************/
		if(i.getInsrncPlnOwnedBy() != null) {
			insuranceplan.setOwnedBy( new org.hl7.fhir.r4.model.Reference(i.getInsrncPlnOwnedBy()));
		}
		/******************** insuranceplanperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period insuranceplanperiod =  new org.hl7.fhir.r4.model.Period();
		insuranceplan.setPeriod(insuranceplanperiod);

		/******************** InsrncPln_Prd_End ********************************************************************************/
		if(i.getInsrncPlnPrdEnd() != null) {
			java.text.SimpleDateFormat InsrncPln_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date InsrncPln_Prd_Enddate = InsrncPln_Prd_Endsdf.parse(i.getInsrncPlnPrdEnd());
			insuranceplanperiod.setEnd(InsrncPln_Prd_Enddate);
		}
		/******************** InsrncPln_Prd_Strt ********************************************************************************/
		if(i.getInsrncPlnPrdStrt() != null) {
			java.text.SimpleDateFormat InsrncPln_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date InsrncPln_Prd_Strtdate = InsrncPln_Prd_Strtsdf.parse(i.getInsrncPlnPrdStrt());
			insuranceplanperiod.setStart(InsrncPln_Prd_Strtdate);
		}
		/******************** insuranceplanplan ********************************************************************************/
		org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanComponent insuranceplanplan =  new org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanComponent();
		insuranceplan.addPlan(insuranceplanplan);

		/******************** InsrncPln_Pln_CvgArea ********************************************************************************/
		if(i.getInsrncPlnPlnCvgArea() != null) {
			insuranceplanplan.addCoverageArea( new org.hl7.fhir.r4.model.Reference(i.getInsrncPlnPlnCvgArea()));
		}
		/******************** insuranceplanplangeneralcost ********************************************************************************/
		org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanGeneralCostComponent insuranceplanplangeneralcost =  new org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanGeneralCostComponent();
		insuranceplanplan.addGeneralCost(insuranceplanplangeneralcost);

		/******************** InsrncPln_Pln_GeneralCst_Comment ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstComment() != null) {
			insuranceplanplangeneralcost.setComment(i.getInsrncPlnPlnGeneralCstComment());
		}
		/******************** insuranceplanplangeneralcostcost ********************************************************************************/
		org.hl7.fhir.r4.model.Money insuranceplanplangeneralcostcost =  new org.hl7.fhir.r4.model.Money();
		insuranceplanplangeneralcost.setCost(insuranceplanplangeneralcostcost);

		/******************** InsrncPln_Pln_GeneralCst_Cst_Crncy ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstCstCrncy() != null) {
			insuranceplanplangeneralcostcost.setCurrency(i.getInsrncPlnPlnGeneralCstCstCrncy());
		}
		/******************** InsrncPln_Pln_GeneralCst_Cst_Vl ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstCstVl() != null) {
			insuranceplanplangeneralcostcost.setValue(Double.parseDouble((i.getInsrncPlnPlnGeneralCstCstVl())));
		}
		/******************** InsrncPln_Pln_GeneralCst_GrpSz ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstGrpSz() != null) {
			insuranceplanplangeneralcost.setGroupSize(Integer.parseInt(i.getInsrncPlnPlnGeneralCstGrpSz()));
		}
		/******************** insuranceplanplangeneralcosttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplangeneralcosttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		insuranceplanplangeneralcost.setType(insuranceplanplangeneralcosttype);

		/******************** insuranceplanplangeneralcosttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplanplangeneralcosttypecoding =  new org.hl7.fhir.r4.model.Coding();
		insuranceplanplangeneralcosttype.addCoding(insuranceplanplangeneralcosttypecoding);

		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstTypCdgCd() != null) {
			insuranceplanplangeneralcosttypecoding.setCode(i.getInsrncPlnPlnGeneralCstTypCdgCd());
		}
		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstTypCdgDsply() != null) {
			insuranceplanplangeneralcosttypecoding.setDisplay(i.getInsrncPlnPlnGeneralCstTypCdgDsply());
		}
		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstTypCdgSys() != null) {
			insuranceplanplangeneralcosttypecoding.setSystem(i.getInsrncPlnPlnGeneralCstTypCdgSys());
		}
		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstTypCdgUsrSltd() != null) {
			insuranceplanplangeneralcosttypecoding.setUserSelected(Boolean.parseBoolean(i.getInsrncPlnPlnGeneralCstTypCdgUsrSltd()));
		}
		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstTypCdgVrsn() != null) {
			insuranceplanplangeneralcosttypecoding.setVersion(i.getInsrncPlnPlnGeneralCstTypCdgVrsn());
		}
		/******************** InsrncPln_Pln_GeneralCst_Typ_Txt ********************************************************************************/
		if(i.getInsrncPlnPlnGeneralCstTypTxt() != null) {
			insuranceplanplangeneralcosttype.setText(i.getInsrncPlnPlnGeneralCstTypTxt());
		}
		/******************** insuranceplanplanidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier insuranceplanplanidentifier =  new org.hl7.fhir.r4.model.Identifier();
		insuranceplanplan.addIdentifier(insuranceplanplanidentifier);

		/******************** InsrncPln_Pln_Id_Assigner ********************************************************************************/
		if(i.getInsrncPlnPlnIdAssigner() != null) {
			insuranceplanplanidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(i.getInsrncPlnPlnIdAssigner()));
		}
		/******************** insuranceplanplanidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period insuranceplanplanidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		insuranceplanplanidentifier.setPeriod(insuranceplanplanidentifierperiod);

		/******************** InsrncPln_Pln_Id_Prd_End ********************************************************************************/
		if(i.getInsrncPlnPlnIdPrdEnd() != null) {
			java.text.SimpleDateFormat InsrncPln_Pln_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date InsrncPln_Pln_Id_Prd_Enddate = InsrncPln_Pln_Id_Prd_Endsdf.parse(i.getInsrncPlnPlnIdPrdEnd());
			insuranceplanplanidentifierperiod.setEnd(InsrncPln_Pln_Id_Prd_Enddate);
		}
		/******************** InsrncPln_Pln_Id_Prd_Strt ********************************************************************************/
		if(i.getInsrncPlnPlnIdPrdStrt() != null) {
			java.text.SimpleDateFormat InsrncPln_Pln_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date InsrncPln_Pln_Id_Prd_Strtdate = InsrncPln_Pln_Id_Prd_Strtsdf.parse(i.getInsrncPlnPlnIdPrdStrt());
			insuranceplanplanidentifierperiod.setStart(InsrncPln_Pln_Id_Prd_Strtdate);
		}
		/******************** InsrncPln_Pln_Id_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnIdSys() != null) {
			insuranceplanplanidentifier.setSystem(i.getInsrncPlnPlnIdSys());
		}
		/******************** insuranceplanplanidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplanidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		insuranceplanplanidentifier.setType(insuranceplanplanidentifiertype);

		/******************** insuranceplanplanidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplanplanidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		insuranceplanplanidentifiertype.addCoding(insuranceplanplanidentifiertypecoding);

		/******************** InsrncPln_Pln_Id_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnPlnIdTypCdgCd() != null) {
			insuranceplanplanidentifiertypecoding.setCode(i.getInsrncPlnPlnIdTypCdgCd());
		}
		/******************** InsrncPln_Pln_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnPlnIdTypCdgDsply() != null) {
			insuranceplanplanidentifiertypecoding.setDisplay(i.getInsrncPlnPlnIdTypCdgDsply());
		}
		/******************** InsrncPln_Pln_Id_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnIdTypCdgSys() != null) {
			insuranceplanplanidentifiertypecoding.setSystem(i.getInsrncPlnPlnIdTypCdgSys());
		}
		/******************** InsrncPln_Pln_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnPlnIdTypCdgUsrSltd() != null) {
			insuranceplanplanidentifiertypecoding.setUserSelected(Boolean.parseBoolean(i.getInsrncPlnPlnIdTypCdgUsrSltd()));
		}
		/******************** InsrncPln_Pln_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnPlnIdTypCdgVrsn() != null) {
			insuranceplanplanidentifiertypecoding.setVersion(i.getInsrncPlnPlnIdTypCdgVrsn());
		}
		/******************** InsrncPln_Pln_Id_Typ_Txt ********************************************************************************/
		if(i.getInsrncPlnPlnIdTypTxt() != null) {
			insuranceplanplanidentifiertype.setText(i.getInsrncPlnPlnIdTypTxt());
		}
		/******************** insuranceplanplanidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory insuranceplanplanidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		insuranceplanplanidentifier.setUse(insuranceplanplanidentifieruse.fromCode(i.getInsrncPlnPlnIdUse()));

		/******************** InsrncPln_Pln_Id_Vl ********************************************************************************/
		if(i.getInsrncPlnPlnIdVl() != null) {
			insuranceplanplanidentifier.setValue(i.getInsrncPlnPlnIdVl());
		}
		/******************** InsrncPln_Pln_Network ********************************************************************************/
		if(i.getInsrncPlnPlnNetwork() != null) {
			insuranceplanplan.addNetwork( new org.hl7.fhir.r4.model.Reference(i.getInsrncPlnPlnNetwork()));
		}
		/******************** insuranceplanplanspecificcost ********************************************************************************/
		org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanSpecificCostComponent insuranceplanplanspecificcost =  new org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanSpecificCostComponent();
		insuranceplanplan.addSpecificCost(insuranceplanplanspecificcost);

		/******************** insuranceplanplanspecificcostbenefit ********************************************************************************/
		org.hl7.fhir.r4.model.InsurancePlan.PlanBenefitComponent insuranceplanplanspecificcostbenefit =  new org.hl7.fhir.r4.model.InsurancePlan.PlanBenefitComponent();
		insuranceplanplanspecificcost.addBenefit(insuranceplanplanspecificcostbenefit);

		/******************** insuranceplanplanspecificcostbenefitcost ********************************************************************************/
		org.hl7.fhir.r4.model.InsurancePlan.PlanBenefitCostComponent insuranceplanplanspecificcostbenefitcost =  new org.hl7.fhir.r4.model.InsurancePlan.PlanBenefitCostComponent();
		insuranceplanplanspecificcostbenefit.addCost(insuranceplanplanspecificcostbenefitcost);

		/******************** insuranceplanplanspecificcostbenefitcostapplicability ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplanspecificcostbenefitcostapplicability =  new org.hl7.fhir.r4.model.CodeableConcept();
		insuranceplanplanspecificcostbenefitcost.setApplicability(insuranceplanplanspecificcostbenefitcostapplicability);

		/******************** insuranceplanplanspecificcostbenefitcostapplicabilitycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplanplanspecificcostbenefitcostapplicabilitycoding =  new org.hl7.fhir.r4.model.Coding();
		insuranceplanplanspecificcostbenefitcostapplicability.addCoding(insuranceplanplanspecificcostbenefitcostapplicabilitycoding);

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgCd() != null) {
			insuranceplanplanspecificcostbenefitcostapplicabilitycoding.setCode(i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgCd());
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgDsply() != null) {
			insuranceplanplanspecificcostbenefitcostapplicabilitycoding.setDisplay(i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgDsply());
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgSys() != null) {
			insuranceplanplanspecificcostbenefitcostapplicabilitycoding.setSystem(i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgSys());
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgUsrSltd() != null) {
			insuranceplanplanspecificcostbenefitcostapplicabilitycoding.setUserSelected(Boolean.parseBoolean(i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgUsrSltd()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgVrsn() != null) {
			insuranceplanplanspecificcostbenefitcostapplicabilitycoding.setVersion(i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgVrsn());
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Txt ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityTxt() != null) {
			insuranceplanplanspecificcostbenefitcostapplicability.setText(i.getInsrncPlnPlnSpecificCstBnftCstApplicabilityTxt());
		}
		/******************** insuranceplanplanspecificcostbenefitcostqualifiers ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplanspecificcostbenefitcostqualifiers =  new org.hl7.fhir.r4.model.CodeableConcept();
		insuranceplanplanspecificcostbenefitcost.addQualifiers(insuranceplanplanspecificcostbenefitcostqualifiers);

		/******************** insuranceplanplanspecificcostbenefitcostqualifierscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplanplanspecificcostbenefitcostqualifierscoding =  new org.hl7.fhir.r4.model.Coding();
		insuranceplanplanspecificcostbenefitcostqualifiers.addCoding(insuranceplanplanspecificcostbenefitcostqualifierscoding);

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgCd() != null) {
			insuranceplanplanspecificcostbenefitcostqualifierscoding.setCode(i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgCd());
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgDsply() != null) {
			insuranceplanplanspecificcostbenefitcostqualifierscoding.setDisplay(i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgDsply());
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgSys() != null) {
			insuranceplanplanspecificcostbenefitcostqualifierscoding.setSystem(i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgSys());
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgUsrSltd() != null) {
			insuranceplanplanspecificcostbenefitcostqualifierscoding.setUserSelected(Boolean.parseBoolean(i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgUsrSltd()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgVrsn() != null) {
			insuranceplanplanspecificcostbenefitcostqualifierscoding.setVersion(i.getInsrncPlnPlnSpecificCstBnftCstQualifiersCdgVrsn());
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Txt ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstQualifiersTxt() != null) {
			insuranceplanplanspecificcostbenefitcostqualifiers.setText(i.getInsrncPlnPlnSpecificCstBnftCstQualifiersTxt());
		}
		/******************** insuranceplanplanspecificcostbenefitcosttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplanspecificcostbenefitcosttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		insuranceplanplanspecificcostbenefitcost.setType(insuranceplanplanspecificcostbenefitcosttype);

		/******************** insuranceplanplanspecificcostbenefitcosttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplanplanspecificcostbenefitcosttypecoding =  new org.hl7.fhir.r4.model.Coding();
		insuranceplanplanspecificcostbenefitcosttype.addCoding(insuranceplanplanspecificcostbenefitcosttypecoding);

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstTypCdgCd() != null) {
			insuranceplanplanspecificcostbenefitcosttypecoding.setCode(i.getInsrncPlnPlnSpecificCstBnftCstTypCdgCd());
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstTypCdgDsply() != null) {
			insuranceplanplanspecificcostbenefitcosttypecoding.setDisplay(i.getInsrncPlnPlnSpecificCstBnftCstTypCdgDsply());
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstTypCdgSys() != null) {
			insuranceplanplanspecificcostbenefitcosttypecoding.setSystem(i.getInsrncPlnPlnSpecificCstBnftCstTypCdgSys());
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstTypCdgUsrSltd() != null) {
			insuranceplanplanspecificcostbenefitcosttypecoding.setUserSelected(Boolean.parseBoolean(i.getInsrncPlnPlnSpecificCstBnftCstTypCdgUsrSltd()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstTypCdgVrsn() != null) {
			insuranceplanplanspecificcostbenefitcosttypecoding.setVersion(i.getInsrncPlnPlnSpecificCstBnftCstTypCdgVrsn());
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Txt ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstTypTxt() != null) {
			insuranceplanplanspecificcostbenefitcosttype.setText(i.getInsrncPlnPlnSpecificCstBnftCstTypTxt());
		}
		/******************** insuranceplanplanspecificcostbenefitcostvalue ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity insuranceplanplanspecificcostbenefitcostvalue =  new org.hl7.fhir.r4.model.Quantity();
		insuranceplanplanspecificcostbenefitcost.setValue(insuranceplanplanspecificcostbenefitcostvalue);

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Vl_Cd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstVlCd() != null) {
			insuranceplanplanspecificcostbenefitcostvalue.setCode(i.getInsrncPlnPlnSpecificCstBnftCstVlCd());
		}
		/******************** insuranceplanplanspecificcostbenefitcostvaluecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory insuranceplanplanspecificcostbenefitcostvaluecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		insuranceplanplanspecificcostbenefitcostvalue.setComparator(insuranceplanplanspecificcostbenefitcostvaluecomparator.fromCode(i.getInsrncPlnPlnSpecificCstBnftCstVlCmprtr()));

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Vl_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstVlSys() != null) {
			insuranceplanplanspecificcostbenefitcostvalue.setSystem(i.getInsrncPlnPlnSpecificCstBnftCstVlSys());
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Vl_Unt ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstVlUnt() != null) {
			insuranceplanplanspecificcostbenefitcostvalue.setUnit(i.getInsrncPlnPlnSpecificCstBnftCstVlUnt());
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Vl_Vl ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftCstVlVl() != null) {
			insuranceplanplanspecificcostbenefitcostvalue.setValue(Double.parseDouble((i.getInsrncPlnPlnSpecificCstBnftCstVlVl())));
		}
		/******************** insuranceplanplanspecificcostbenefittype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplanspecificcostbenefittype =  new org.hl7.fhir.r4.model.CodeableConcept();
		insuranceplanplanspecificcostbenefit.setType(insuranceplanplanspecificcostbenefittype);

		/******************** insuranceplanplanspecificcostbenefittypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplanplanspecificcostbenefittypecoding =  new org.hl7.fhir.r4.model.Coding();
		insuranceplanplanspecificcostbenefittype.addCoding(insuranceplanplanspecificcostbenefittypecoding);

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftTypCdgCd() != null) {
			insuranceplanplanspecificcostbenefittypecoding.setCode(i.getInsrncPlnPlnSpecificCstBnftTypCdgCd());
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftTypCdgDsply() != null) {
			insuranceplanplanspecificcostbenefittypecoding.setDisplay(i.getInsrncPlnPlnSpecificCstBnftTypCdgDsply());
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftTypCdgSys() != null) {
			insuranceplanplanspecificcostbenefittypecoding.setSystem(i.getInsrncPlnPlnSpecificCstBnftTypCdgSys());
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftTypCdgUsrSltd() != null) {
			insuranceplanplanspecificcostbenefittypecoding.setUserSelected(Boolean.parseBoolean(i.getInsrncPlnPlnSpecificCstBnftTypCdgUsrSltd()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftTypCdgVrsn() != null) {
			insuranceplanplanspecificcostbenefittypecoding.setVersion(i.getInsrncPlnPlnSpecificCstBnftTypCdgVrsn());
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Txt ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstBnftTypTxt() != null) {
			insuranceplanplanspecificcostbenefittype.setText(i.getInsrncPlnPlnSpecificCstBnftTypTxt());
		}
		/******************** insuranceplanplanspecificcostcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplanspecificcostcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		insuranceplanplanspecificcost.setCategory(insuranceplanplanspecificcostcategory);

		/******************** insuranceplanplanspecificcostcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplanplanspecificcostcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		insuranceplanplanspecificcostcategory.addCoding(insuranceplanplanspecificcostcategorycoding);

		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstCtgryCdgCd() != null) {
			insuranceplanplanspecificcostcategorycoding.setCode(i.getInsrncPlnPlnSpecificCstCtgryCdgCd());
		}
		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstCtgryCdgDsply() != null) {
			insuranceplanplanspecificcostcategorycoding.setDisplay(i.getInsrncPlnPlnSpecificCstCtgryCdgDsply());
		}
		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstCtgryCdgSys() != null) {
			insuranceplanplanspecificcostcategorycoding.setSystem(i.getInsrncPlnPlnSpecificCstCtgryCdgSys());
		}
		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstCtgryCdgUsrSltd() != null) {
			insuranceplanplanspecificcostcategorycoding.setUserSelected(Boolean.parseBoolean(i.getInsrncPlnPlnSpecificCstCtgryCdgUsrSltd()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstCtgryCdgVrsn() != null) {
			insuranceplanplanspecificcostcategorycoding.setVersion(i.getInsrncPlnPlnSpecificCstCtgryCdgVrsn());
		}
		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Txt ********************************************************************************/
		if(i.getInsrncPlnPlnSpecificCstCtgryTxt() != null) {
			insuranceplanplanspecificcostcategory.setText(i.getInsrncPlnPlnSpecificCstCtgryTxt());
		}
		/******************** insuranceplanplantype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplantype =  new org.hl7.fhir.r4.model.CodeableConcept();
		insuranceplanplan.setType(insuranceplanplantype);

		/******************** insuranceplanplantypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplanplantypecoding =  new org.hl7.fhir.r4.model.Coding();
		insuranceplanplantype.addCoding(insuranceplanplantypecoding);

		/******************** InsrncPln_Pln_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnPlnTypCdgCd() != null) {
			insuranceplanplantypecoding.setCode(i.getInsrncPlnPlnTypCdgCd());
		}
		/******************** InsrncPln_Pln_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnPlnTypCdgDsply() != null) {
			insuranceplanplantypecoding.setDisplay(i.getInsrncPlnPlnTypCdgDsply());
		}
		/******************** InsrncPln_Pln_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnPlnTypCdgSys() != null) {
			insuranceplanplantypecoding.setSystem(i.getInsrncPlnPlnTypCdgSys());
		}
		/******************** InsrncPln_Pln_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnPlnTypCdgUsrSltd() != null) {
			insuranceplanplantypecoding.setUserSelected(Boolean.parseBoolean(i.getInsrncPlnPlnTypCdgUsrSltd()));
		}
		/******************** InsrncPln_Pln_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnPlnTypCdgVrsn() != null) {
			insuranceplanplantypecoding.setVersion(i.getInsrncPlnPlnTypCdgVrsn());
		}
		/******************** InsrncPln_Pln_Typ_Txt ********************************************************************************/
		if(i.getInsrncPlnPlnTypTxt() != null) {
			insuranceplanplantype.setText(i.getInsrncPlnPlnTypTxt());
		}
		/******************** insuranceplanstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory insuranceplanstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		insuranceplan.setStatus(insuranceplanstatus.fromCode(i.getInsrncPlnSts()));

		/******************** insuranceplantype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplantype =  new org.hl7.fhir.r4.model.CodeableConcept();
		insuranceplan.addType(insuranceplantype);

		/******************** insuranceplantypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplantypecoding =  new org.hl7.fhir.r4.model.Coding();
		insuranceplantype.addCoding(insuranceplantypecoding);

		/******************** InsrncPln_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInsrncPlnTypCdgCd() != null) {
			insuranceplantypecoding.setCode(i.getInsrncPlnTypCdgCd());
		}
		/******************** InsrncPln_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInsrncPlnTypCdgDsply() != null) {
			insuranceplantypecoding.setDisplay(i.getInsrncPlnTypCdgDsply());
		}
		/******************** InsrncPln_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInsrncPlnTypCdgSys() != null) {
			insuranceplantypecoding.setSystem(i.getInsrncPlnTypCdgSys());
		}
		/******************** InsrncPln_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInsrncPlnTypCdgUsrSltd() != null) {
			insuranceplantypecoding.setUserSelected(Boolean.parseBoolean(i.getInsrncPlnTypCdgUsrSltd()));
		}
		/******************** InsrncPln_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInsrncPlnTypCdgVrsn() != null) {
			insuranceplantypecoding.setVersion(i.getInsrncPlnTypCdgVrsn());
		}
		/******************** InsrncPln_Typ_Txt ********************************************************************************/
		if(i.getInsrncPlnTypTxt() != null) {
			insuranceplantype.setText(i.getInsrncPlnTypTxt());
		}
		return insuranceplan;
	}
}
