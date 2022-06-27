package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.InsurancePlan;
public class InsurancePlanBidirectionalConversion 
{
	public InsurancePlan InsurancePlans(org.hl7.fhir.r4.model.InsurancePlan insuranceplan) throws ParseException
	{
		 main.java.com.campfhir.model.InsurancePlan i = new  main.java.com.campfhir.model.InsurancePlan();

		/******************** id ********************************************************************************/
		insuranceplan.setId(i.getId());

		/******************** InsrncPln_Nm ********************************************************************************/
		if(insuranceplan.hasName()) {
			i.setInsrncPlnNm(String.valueOf(insuranceplan.getName()));
		}
		/******************** insuranceplancoverage ********************************************************************************/
		org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanCoverageComponent insuranceplancoverage = insuranceplan.getCoverageFirstRep();

		/******************** insuranceplancoveragetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplancoveragetype = insuranceplancoverage.getType();

		/******************** InsrncPln_Cvg_Typ_Txt ********************************************************************************/
		if(insuranceplancoveragetype.hasText()) {
			i.setInsrncPlnCvgTypTxt(String.valueOf(insuranceplancoveragetype.getText()));
		}
		/******************** insuranceplancoveragetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplancoveragetypecoding = insuranceplancoveragetype.getCodingFirstRep();

		/******************** InsrncPln_Cvg_Typ_Cdg_Vrsn ********************************************************************************/
		if(insuranceplancoveragetypecoding.hasVersion()) {
			i.setInsrncPlnCvgTypCdgVrsn(String.valueOf(insuranceplancoveragetypecoding.getVersion()));
		}
		/******************** InsrncPln_Cvg_Typ_Cdg_Dsply ********************************************************************************/
		if(insuranceplancoveragetypecoding.hasDisplay()) {
			i.setInsrncPlnCvgTypCdgDsply(String.valueOf(insuranceplancoveragetypecoding.getDisplay()));
		}
		/******************** InsrncPln_Cvg_Typ_Cdg_Cd ********************************************************************************/
		if(insuranceplancoveragetypecoding.hasCode()) {
			i.setInsrncPlnCvgTypCdgCd(String.valueOf(insuranceplancoveragetypecoding.getCode()));
		}
		/******************** InsrncPln_Cvg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplancoveragetypecoding.hasUserSelected()) {
			i.setInsrncPlnCvgTypCdgUsrSltd(String.valueOf(insuranceplancoveragetypecoding.getUserSelected()));
		}
		/******************** InsrncPln_Cvg_Typ_Cdg_Sys ********************************************************************************/
		if(insuranceplancoveragetypecoding.hasSystem()) {
			i.setInsrncPlnCvgTypCdgSys(String.valueOf(insuranceplancoveragetypecoding.getSystem()));
		}
		/******************** insuranceplancoveragebenefit ********************************************************************************/
		org.hl7.fhir.r4.model.InsurancePlan.CoverageBenefitComponent insuranceplancoveragebenefit = insuranceplancoverage.getBenefitFirstRep();

		/******************** insuranceplancoveragebenefittype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplancoveragebenefittype = insuranceplancoveragebenefit.getType();

		/******************** InsrncPln_Cvg_Bnft_Typ_Txt ********************************************************************************/
		if(insuranceplancoveragebenefittype.hasText()) {
			i.setInsrncPlnCvgBnftTypTxt(String.valueOf(insuranceplancoveragebenefittype.getText()));
		}
		/******************** insuranceplancoveragebenefittypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplancoveragebenefittypecoding = insuranceplancoveragebenefittype.getCodingFirstRep();

		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_Vrsn ********************************************************************************/
		if(insuranceplancoveragebenefittypecoding.hasVersion()) {
			i.setInsrncPlnCvgBnftTypCdgVrsn(String.valueOf(insuranceplancoveragebenefittypecoding.getVersion()));
		}
		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_Dsply ********************************************************************************/
		if(insuranceplancoveragebenefittypecoding.hasDisplay()) {
			i.setInsrncPlnCvgBnftTypCdgDsply(String.valueOf(insuranceplancoveragebenefittypecoding.getDisplay()));
		}
		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_Cd ********************************************************************************/
		if(insuranceplancoveragebenefittypecoding.hasCode()) {
			i.setInsrncPlnCvgBnftTypCdgCd(String.valueOf(insuranceplancoveragebenefittypecoding.getCode()));
		}
		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplancoveragebenefittypecoding.hasUserSelected()) {
			i.setInsrncPlnCvgBnftTypCdgUsrSltd(String.valueOf(insuranceplancoveragebenefittypecoding.getUserSelected()));
		}
		/******************** InsrncPln_Cvg_Bnft_Typ_Cdg_Sys ********************************************************************************/
		if(insuranceplancoveragebenefittypecoding.hasSystem()) {
			i.setInsrncPlnCvgBnftTypCdgSys(String.valueOf(insuranceplancoveragebenefittypecoding.getSystem()));
		}
		/******************** insuranceplancoveragebenefitlimit ********************************************************************************/
		org.hl7.fhir.r4.model.InsurancePlan.CoverageBenefitLimitComponent insuranceplancoveragebenefitlimit = insuranceplancoveragebenefit.getLimitFirstRep();

		/******************** insuranceplancoveragebenefitlimitvalue ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity insuranceplancoveragebenefitlimitvalue = insuranceplancoveragebenefitlimit.getValue();

		/******************** insuranceplancoveragebenefitlimitvaluecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator insuranceplancoveragebenefitlimitvaluecomparator = insuranceplancoveragebenefitlimitvalue.getComparator();
		i.setInsrncPlnCvgBnftLmtVlCmprtr(insuranceplancoveragebenefitlimitvaluecomparator.toCode());

		/******************** InsrncPln_Cvg_Bnft_Lmt_Vl_Cd ********************************************************************************/
		if(insuranceplancoveragebenefitlimitvalue.hasCode()) {
			i.setInsrncPlnCvgBnftLmtVlCd(String.valueOf(insuranceplancoveragebenefitlimitvalue.getCode()));
		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Vl_Unt ********************************************************************************/
		if(insuranceplancoveragebenefitlimitvalue.hasUnit()) {
			i.setInsrncPlnCvgBnftLmtVlUnt(String.valueOf(insuranceplancoveragebenefitlimitvalue.getUnit()));
		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Vl_Sys ********************************************************************************/
		if(insuranceplancoveragebenefitlimitvalue.hasSystem()) {
			i.setInsrncPlnCvgBnftLmtVlSys(String.valueOf(insuranceplancoveragebenefitlimitvalue.getSystem()));
		}
		/******************** insuranceplancoveragebenefitlimitcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplancoveragebenefitlimitcode = insuranceplancoveragebenefitlimit.getCode();

		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Txt ********************************************************************************/
		if(insuranceplancoveragebenefitlimitcode.hasText()) {
			i.setInsrncPlnCvgBnftLmtCdTxt(String.valueOf(insuranceplancoveragebenefitlimitcode.getText()));
		}
		/******************** insuranceplancoveragebenefitlimitcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplancoveragebenefitlimitcodecoding = insuranceplancoveragebenefitlimitcode.getCodingFirstRep();

		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_Vrsn ********************************************************************************/
		if(insuranceplancoveragebenefitlimitcodecoding.hasVersion()) {
			i.setInsrncPlnCvgBnftLmtCdCdgVrsn(String.valueOf(insuranceplancoveragebenefitlimitcodecoding.getVersion()));
		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_Dsply ********************************************************************************/
		if(insuranceplancoveragebenefitlimitcodecoding.hasDisplay()) {
			i.setInsrncPlnCvgBnftLmtCdCdgDsply(String.valueOf(insuranceplancoveragebenefitlimitcodecoding.getDisplay()));
		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_Cd ********************************************************************************/
		if(insuranceplancoveragebenefitlimitcodecoding.hasCode()) {
			i.setInsrncPlnCvgBnftLmtCdCdgCd(String.valueOf(insuranceplancoveragebenefitlimitcodecoding.getCode()));
		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplancoveragebenefitlimitcodecoding.hasUserSelected()) {
			i.setInsrncPlnCvgBnftLmtCdCdgUsrSltd(String.valueOf(insuranceplancoveragebenefitlimitcodecoding.getUserSelected()));
		}
		/******************** InsrncPln_Cvg_Bnft_Lmt_Cd_Cdg_Sys ********************************************************************************/
		if(insuranceplancoveragebenefitlimitcodecoding.hasSystem()) {
			i.setInsrncPlnCvgBnftLmtCdCdgSys(String.valueOf(insuranceplancoveragebenefitlimitcodecoding.getSystem()));
		}
		/******************** InsrncPln_Cvg_Bnft_Rqrment ********************************************************************************/
		if(insuranceplancoveragebenefit.hasRequirement()) {
			i.setInsrncPlnCvgBnftRqrment(String.valueOf(insuranceplancoveragebenefit.getRequirement()));
		}
		/******************** InsrncPln_Cvg_Network ********************************************************************************/
		if(insuranceplancoverage.hasNetwork()) {
			i.setInsrncPlnCvgNetwork(String.valueOf(insuranceplancoverage.getNetworkFirstRep()));
		}
		/******************** insuranceplantype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplantype = insuranceplan.getTypeFirstRep();

		/******************** InsrncPln_Typ_Txt ********************************************************************************/
		if(insuranceplantype.hasText()) {
			i.setInsrncPlnTypTxt(String.valueOf(insuranceplantype.getText()));
		}
		/******************** insuranceplantypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplantypecoding = insuranceplantype.getCodingFirstRep();

		/******************** InsrncPln_Typ_Cdg_Vrsn ********************************************************************************/
		if(insuranceplantypecoding.hasVersion()) {
			i.setInsrncPlnTypCdgVrsn(String.valueOf(insuranceplantypecoding.getVersion()));
		}
		/******************** InsrncPln_Typ_Cdg_Dsply ********************************************************************************/
		if(insuranceplantypecoding.hasDisplay()) {
			i.setInsrncPlnTypCdgDsply(String.valueOf(insuranceplantypecoding.getDisplay()));
		}
		/******************** InsrncPln_Typ_Cdg_Cd ********************************************************************************/
		if(insuranceplantypecoding.hasCode()) {
			i.setInsrncPlnTypCdgCd(String.valueOf(insuranceplantypecoding.getCode()));
		}
		/******************** InsrncPln_Typ_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplantypecoding.hasUserSelected()) {
			i.setInsrncPlnTypCdgUsrSltd(String.valueOf(insuranceplantypecoding.getUserSelected()));
		}
		/******************** InsrncPln_Typ_Cdg_Sys ********************************************************************************/
		if(insuranceplantypecoding.hasSystem()) {
			i.setInsrncPlnTypCdgSys(String.valueOf(insuranceplantypecoding.getSystem()));
		}
		/******************** insuranceplanstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus insuranceplanstatus = insuranceplan.getStatus();
		i.setInsrncPlnSts(insuranceplanstatus.toCode());

		/******************** insuranceplanperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period insuranceplanperiod = insuranceplan.getPeriod();

		/******************** InsrncPln_Prd_Strt ********************************************************************************/
		if(insuranceplanperiod.hasStart()) {
			i.setInsrncPlnPrdStrt(String.valueOf(insuranceplanperiod.getStart()));
		}
		/******************** InsrncPln_Prd_End ********************************************************************************/
		if(insuranceplanperiod.hasEnd()) {
			i.setInsrncPlnPrdEnd(String.valueOf(insuranceplanperiod.getEnd()));
		}
		/******************** InsrncPln_OwnedBy ********************************************************************************/
		if(insuranceplan.hasOwnedBy()) {
			i.setInsrncPlnOwnedBy(String.valueOf(insuranceplan.getOwnedBy()));
		}
		/******************** InsrncPln_AdministeredBy ********************************************************************************/
		if(insuranceplan.hasAdministeredBy()) {
			i.setInsrncPlnAdministeredBy(String.valueOf(insuranceplan.getAdministeredBy()));
		}
		/******************** InsrncPln_Network ********************************************************************************/
		if(insuranceplan.hasNetwork()) {
			i.setInsrncPlnNetwork(String.valueOf(insuranceplan.getNetworkFirstRep()));
		}
		/******************** insuranceplanplan ********************************************************************************/
		org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanComponent insuranceplanplan = insuranceplan.getPlanFirstRep();

		/******************** insuranceplanplantype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplantype = insuranceplanplan.getType();

		/******************** InsrncPln_Pln_Typ_Txt ********************************************************************************/
		if(insuranceplanplantype.hasText()) {
			i.setInsrncPlnPlnTypTxt(String.valueOf(insuranceplanplantype.getText()));
		}
		/******************** insuranceplanplantypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplanplantypecoding = insuranceplanplantype.getCodingFirstRep();

		/******************** InsrncPln_Pln_Typ_Cdg_Vrsn ********************************************************************************/
		if(insuranceplanplantypecoding.hasVersion()) {
			i.setInsrncPlnPlnTypCdgVrsn(String.valueOf(insuranceplanplantypecoding.getVersion()));
		}
		/******************** InsrncPln_Pln_Typ_Cdg_Dsply ********************************************************************************/
		if(insuranceplanplantypecoding.hasDisplay()) {
			i.setInsrncPlnPlnTypCdgDsply(String.valueOf(insuranceplanplantypecoding.getDisplay()));
		}
		/******************** InsrncPln_Pln_Typ_Cdg_Cd ********************************************************************************/
		if(insuranceplanplantypecoding.hasCode()) {
			i.setInsrncPlnPlnTypCdgCd(String.valueOf(insuranceplanplantypecoding.getCode()));
		}
		/******************** InsrncPln_Pln_Typ_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplanplantypecoding.hasUserSelected()) {
			i.setInsrncPlnPlnTypCdgUsrSltd(String.valueOf(insuranceplanplantypecoding.getUserSelected()));
		}
		/******************** InsrncPln_Pln_Typ_Cdg_Sys ********************************************************************************/
		if(insuranceplanplantypecoding.hasSystem()) {
			i.setInsrncPlnPlnTypCdgSys(String.valueOf(insuranceplanplantypecoding.getSystem()));
		}
		/******************** insuranceplanplangeneralcost ********************************************************************************/
		org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanGeneralCostComponent insuranceplanplangeneralcost = insuranceplanplan.getGeneralCostFirstRep();

		/******************** insuranceplanplangeneralcosttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplangeneralcosttype = insuranceplanplangeneralcost.getType();

		/******************** InsrncPln_Pln_GeneralCst_Typ_Txt ********************************************************************************/
		if(insuranceplanplangeneralcosttype.hasText()) {
			i.setInsrncPlnPlnGeneralCstTypTxt(String.valueOf(insuranceplanplangeneralcosttype.getText()));
		}
		/******************** insuranceplanplangeneralcosttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplanplangeneralcosttypecoding = insuranceplanplangeneralcosttype.getCodingFirstRep();

		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_Vrsn ********************************************************************************/
		if(insuranceplanplangeneralcosttypecoding.hasVersion()) {
			i.setInsrncPlnPlnGeneralCstTypCdgVrsn(String.valueOf(insuranceplanplangeneralcosttypecoding.getVersion()));
		}
		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_Dsply ********************************************************************************/
		if(insuranceplanplangeneralcosttypecoding.hasDisplay()) {
			i.setInsrncPlnPlnGeneralCstTypCdgDsply(String.valueOf(insuranceplanplangeneralcosttypecoding.getDisplay()));
		}
		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_Cd ********************************************************************************/
		if(insuranceplanplangeneralcosttypecoding.hasCode()) {
			i.setInsrncPlnPlnGeneralCstTypCdgCd(String.valueOf(insuranceplanplangeneralcosttypecoding.getCode()));
		}
		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplanplangeneralcosttypecoding.hasUserSelected()) {
			i.setInsrncPlnPlnGeneralCstTypCdgUsrSltd(String.valueOf(insuranceplanplangeneralcosttypecoding.getUserSelected()));
		}
		/******************** InsrncPln_Pln_GeneralCst_Typ_Cdg_Sys ********************************************************************************/
		if(insuranceplanplangeneralcosttypecoding.hasSystem()) {
			i.setInsrncPlnPlnGeneralCstTypCdgSys(String.valueOf(insuranceplanplangeneralcosttypecoding.getSystem()));
		}
		/******************** InsrncPln_Pln_GeneralCst_Comment ********************************************************************************/
		if(insuranceplanplangeneralcost.hasComment()) {
			i.setInsrncPlnPlnGeneralCstComment(String.valueOf(insuranceplanplangeneralcost.getComment()));
		}
		/******************** InsrncPln_Pln_GeneralCst_GrpSz ********************************************************************************/
		if(insuranceplanplangeneralcost.hasGroupSize()) {
			i.setInsrncPlnPlnGeneralCstGrpSz(String.valueOf(insuranceplanplangeneralcost.getGroupSize()));
		}
		/******************** insuranceplanplangeneralcostcost ********************************************************************************/
		org.hl7.fhir.r4.model.Money insuranceplanplangeneralcostcost = insuranceplanplangeneralcost.getCost();

		/******************** InsrncPln_Pln_GeneralCst_Cst_Vl ********************************************************************************/
		if(insuranceplanplangeneralcostcost.hasValue()) {
			i.setInsrncPlnPlnGeneralCstCstVl(String.valueOf(insuranceplanplangeneralcostcost.getValue()));
		}
		/******************** InsrncPln_Pln_GeneralCst_Cst_Crncy ********************************************************************************/
		if(insuranceplanplangeneralcostcost.hasCurrency()) {
			i.setInsrncPlnPlnGeneralCstCstCrncy(String.valueOf(insuranceplanplangeneralcostcost.getCurrency()));
		}
		/******************** insuranceplanplanspecificcost ********************************************************************************/
		org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanPlanSpecificCostComponent insuranceplanplanspecificcost = insuranceplanplan.getSpecificCostFirstRep();

		/******************** insuranceplanplanspecificcostbenefit ********************************************************************************/
		org.hl7.fhir.r4.model.InsurancePlan.PlanBenefitComponent insuranceplanplanspecificcostbenefit = insuranceplanplanspecificcost.getBenefitFirstRep();

		/******************** insuranceplanplanspecificcostbenefittype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplanspecificcostbenefittype = insuranceplanplanspecificcostbenefit.getType();

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Txt ********************************************************************************/
		if(insuranceplanplanspecificcostbenefittype.hasText()) {
			i.setInsrncPlnPlnSpecificCstBnftTypTxt(String.valueOf(insuranceplanplanspecificcostbenefittype.getText()));
		}
		/******************** insuranceplanplanspecificcostbenefittypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplanplanspecificcostbenefittypecoding = insuranceplanplanspecificcostbenefittype.getCodingFirstRep();

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_Vrsn ********************************************************************************/
		if(insuranceplanplanspecificcostbenefittypecoding.hasVersion()) {
			i.setInsrncPlnPlnSpecificCstBnftTypCdgVrsn(String.valueOf(insuranceplanplanspecificcostbenefittypecoding.getVersion()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_Dsply ********************************************************************************/
		if(insuranceplanplanspecificcostbenefittypecoding.hasDisplay()) {
			i.setInsrncPlnPlnSpecificCstBnftTypCdgDsply(String.valueOf(insuranceplanplanspecificcostbenefittypecoding.getDisplay()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_Cd ********************************************************************************/
		if(insuranceplanplanspecificcostbenefittypecoding.hasCode()) {
			i.setInsrncPlnPlnSpecificCstBnftTypCdgCd(String.valueOf(insuranceplanplanspecificcostbenefittypecoding.getCode()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplanplanspecificcostbenefittypecoding.hasUserSelected()) {
			i.setInsrncPlnPlnSpecificCstBnftTypCdgUsrSltd(String.valueOf(insuranceplanplanspecificcostbenefittypecoding.getUserSelected()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Typ_Cdg_Sys ********************************************************************************/
		if(insuranceplanplanspecificcostbenefittypecoding.hasSystem()) {
			i.setInsrncPlnPlnSpecificCstBnftTypCdgSys(String.valueOf(insuranceplanplanspecificcostbenefittypecoding.getSystem()));
		}
		/******************** insuranceplanplanspecificcostbenefitcost ********************************************************************************/
		org.hl7.fhir.r4.model.InsurancePlan.PlanBenefitCostComponent insuranceplanplanspecificcostbenefitcost = insuranceplanplanspecificcostbenefit.getCostFirstRep();

		/******************** insuranceplanplanspecificcostbenefitcostvalue ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity insuranceplanplanspecificcostbenefitcostvalue = insuranceplanplanspecificcostbenefitcost.getValue();

		/******************** insuranceplanplanspecificcostbenefitcostvaluecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator insuranceplanplanspecificcostbenefitcostvaluecomparator = insuranceplanplanspecificcostbenefitcostvalue.getComparator();
		i.setInsrncPlnPlnSpecificCstBnftCstVlCmprtr(insuranceplanplanspecificcostbenefitcostvaluecomparator.toCode());

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Vl_Cd ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostvalue.hasCode()) {
			i.setInsrncPlnPlnSpecificCstBnftCstVlCd(String.valueOf(insuranceplanplanspecificcostbenefitcostvalue.getCode()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Vl_Unt ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostvalue.hasUnit()) {
			i.setInsrncPlnPlnSpecificCstBnftCstVlUnt(String.valueOf(insuranceplanplanspecificcostbenefitcostvalue.getUnit()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Vl_Sys ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostvalue.hasSystem()) {
			i.setInsrncPlnPlnSpecificCstBnftCstVlSys(String.valueOf(insuranceplanplanspecificcostbenefitcostvalue.getSystem()));
		}
		/******************** insuranceplanplanspecificcostbenefitcosttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplanspecificcostbenefitcosttype = insuranceplanplanspecificcostbenefitcost.getType();

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Txt ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcosttype.hasText()) {
			i.setInsrncPlnPlnSpecificCstBnftCstTypTxt(String.valueOf(insuranceplanplanspecificcostbenefitcosttype.getText()));
		}
		/******************** insuranceplanplanspecificcostbenefitcosttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplanplanspecificcostbenefitcosttypecoding = insuranceplanplanspecificcostbenefitcosttype.getCodingFirstRep();

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_Vrsn ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcosttypecoding.hasVersion()) {
			i.setInsrncPlnPlnSpecificCstBnftCstTypCdgVrsn(String.valueOf(insuranceplanplanspecificcostbenefitcosttypecoding.getVersion()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_Dsply ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcosttypecoding.hasDisplay()) {
			i.setInsrncPlnPlnSpecificCstBnftCstTypCdgDsply(String.valueOf(insuranceplanplanspecificcostbenefitcosttypecoding.getDisplay()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_Cd ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcosttypecoding.hasCode()) {
			i.setInsrncPlnPlnSpecificCstBnftCstTypCdgCd(String.valueOf(insuranceplanplanspecificcostbenefitcosttypecoding.getCode()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcosttypecoding.hasUserSelected()) {
			i.setInsrncPlnPlnSpecificCstBnftCstTypCdgUsrSltd(String.valueOf(insuranceplanplanspecificcostbenefitcosttypecoding.getUserSelected()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Typ_Cdg_Sys ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcosttypecoding.hasSystem()) {
			i.setInsrncPlnPlnSpecificCstBnftCstTypCdgSys(String.valueOf(insuranceplanplanspecificcostbenefitcosttypecoding.getSystem()));
		}
		/******************** insuranceplanplanspecificcostbenefitcostqualifiers ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplanspecificcostbenefitcostqualifiers = insuranceplanplanspecificcostbenefitcost.getQualifiersFirstRep();

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Txt ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostqualifiers.hasText()) {
			i.setInsrncPlnPlnSpecificCstBnftCstQualifiersTxt(String.valueOf(insuranceplanplanspecificcostbenefitcostqualifiers.getText()));
		}
		/******************** insuranceplanplanspecificcostbenefitcostqualifierscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplanplanspecificcostbenefitcostqualifierscoding = insuranceplanplanspecificcostbenefitcostqualifiers.getCodingFirstRep();

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_Vrsn ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostqualifierscoding.hasVersion()) {
			i.setInsrncPlnPlnSpecificCstBnftCstQualifiersCdgVrsn(String.valueOf(insuranceplanplanspecificcostbenefitcostqualifierscoding.getVersion()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_Dsply ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostqualifierscoding.hasDisplay()) {
			i.setInsrncPlnPlnSpecificCstBnftCstQualifiersCdgDsply(String.valueOf(insuranceplanplanspecificcostbenefitcostqualifierscoding.getDisplay()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_Cd ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostqualifierscoding.hasCode()) {
			i.setInsrncPlnPlnSpecificCstBnftCstQualifiersCdgCd(String.valueOf(insuranceplanplanspecificcostbenefitcostqualifierscoding.getCode()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostqualifierscoding.hasUserSelected()) {
			i.setInsrncPlnPlnSpecificCstBnftCstQualifiersCdgUsrSltd(String.valueOf(insuranceplanplanspecificcostbenefitcostqualifierscoding.getUserSelected()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Qualifiers_Cdg_Sys ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostqualifierscoding.hasSystem()) {
			i.setInsrncPlnPlnSpecificCstBnftCstQualifiersCdgSys(String.valueOf(insuranceplanplanspecificcostbenefitcostqualifierscoding.getSystem()));
		}
		/******************** insuranceplanplanspecificcostbenefitcostapplicability ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplanspecificcostbenefitcostapplicability = insuranceplanplanspecificcostbenefitcost.getApplicability();

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Txt ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostapplicability.hasText()) {
			i.setInsrncPlnPlnSpecificCstBnftCstApplicabilityTxt(String.valueOf(insuranceplanplanspecificcostbenefitcostapplicability.getText()));
		}
		/******************** insuranceplanplanspecificcostbenefitcostapplicabilitycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplanplanspecificcostbenefitcostapplicabilitycoding = insuranceplanplanspecificcostbenefitcostapplicability.getCodingFirstRep();

		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_Vrsn ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.hasVersion()) {
			i.setInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgVrsn(String.valueOf(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.getVersion()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_Dsply ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.hasDisplay()) {
			i.setInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgDsply(String.valueOf(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.getDisplay()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_Cd ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.hasCode()) {
			i.setInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgCd(String.valueOf(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.getCode()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.hasUserSelected()) {
			i.setInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgUsrSltd(String.valueOf(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.getUserSelected()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Bnft_Cst_Applicability_Cdg_Sys ********************************************************************************/
		if(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.hasSystem()) {
			i.setInsrncPlnPlnSpecificCstBnftCstApplicabilityCdgSys(String.valueOf(insuranceplanplanspecificcostbenefitcostapplicabilitycoding.getSystem()));
		}
		/******************** insuranceplanplanspecificcostcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplanspecificcostcategory = insuranceplanplanspecificcost.getCategory();

		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Txt ********************************************************************************/
		if(insuranceplanplanspecificcostcategory.hasText()) {
			i.setInsrncPlnPlnSpecificCstCtgryTxt(String.valueOf(insuranceplanplanspecificcostcategory.getText()));
		}
		/******************** insuranceplanplanspecificcostcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplanplanspecificcostcategorycoding = insuranceplanplanspecificcostcategory.getCodingFirstRep();

		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(insuranceplanplanspecificcostcategorycoding.hasVersion()) {
			i.setInsrncPlnPlnSpecificCstCtgryCdgVrsn(String.valueOf(insuranceplanplanspecificcostcategorycoding.getVersion()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(insuranceplanplanspecificcostcategorycoding.hasDisplay()) {
			i.setInsrncPlnPlnSpecificCstCtgryCdgDsply(String.valueOf(insuranceplanplanspecificcostcategorycoding.getDisplay()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_Cd ********************************************************************************/
		if(insuranceplanplanspecificcostcategorycoding.hasCode()) {
			i.setInsrncPlnPlnSpecificCstCtgryCdgCd(String.valueOf(insuranceplanplanspecificcostcategorycoding.getCode()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplanplanspecificcostcategorycoding.hasUserSelected()) {
			i.setInsrncPlnPlnSpecificCstCtgryCdgUsrSltd(String.valueOf(insuranceplanplanspecificcostcategorycoding.getUserSelected()));
		}
		/******************** InsrncPln_Pln_SpecificCst_Ctgry_Cdg_Sys ********************************************************************************/
		if(insuranceplanplanspecificcostcategorycoding.hasSystem()) {
			i.setInsrncPlnPlnSpecificCstCtgryCdgSys(String.valueOf(insuranceplanplanspecificcostcategorycoding.getSystem()));
		}
		/******************** InsrncPln_Pln_Network ********************************************************************************/
		if(insuranceplanplan.hasNetwork()) {
			i.setInsrncPlnPlnNetwork(String.valueOf(insuranceplanplan.getNetworkFirstRep()));
		}
		/******************** insuranceplanplanidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier insuranceplanplanidentifier = insuranceplanplan.getIdentifierFirstRep();

		/******************** InsrncPln_Pln_Id_Vl ********************************************************************************/
		if(insuranceplanplanidentifier.hasValue()) {
			i.setInsrncPlnPlnIdVl(String.valueOf(insuranceplanplanidentifier.getValue()));
		}
		/******************** insuranceplanplanidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanplanidentifiertype = insuranceplanplanidentifier.getType();

		/******************** InsrncPln_Pln_Id_Typ_Txt ********************************************************************************/
		if(insuranceplanplanidentifiertype.hasText()) {
			i.setInsrncPlnPlnIdTypTxt(String.valueOf(insuranceplanplanidentifiertype.getText()));
		}
		/******************** insuranceplanplanidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplanplanidentifiertypecoding = insuranceplanplanidentifiertype.getCodingFirstRep();

		/******************** InsrncPln_Pln_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(insuranceplanplanidentifiertypecoding.hasVersion()) {
			i.setInsrncPlnPlnIdTypCdgVrsn(String.valueOf(insuranceplanplanidentifiertypecoding.getVersion()));
		}
		/******************** InsrncPln_Pln_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(insuranceplanplanidentifiertypecoding.hasDisplay()) {
			i.setInsrncPlnPlnIdTypCdgDsply(String.valueOf(insuranceplanplanidentifiertypecoding.getDisplay()));
		}
		/******************** InsrncPln_Pln_Id_Typ_Cdg_Cd ********************************************************************************/
		if(insuranceplanplanidentifiertypecoding.hasCode()) {
			i.setInsrncPlnPlnIdTypCdgCd(String.valueOf(insuranceplanplanidentifiertypecoding.getCode()));
		}
		/******************** InsrncPln_Pln_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplanplanidentifiertypecoding.hasUserSelected()) {
			i.setInsrncPlnPlnIdTypCdgUsrSltd(String.valueOf(insuranceplanplanidentifiertypecoding.getUserSelected()));
		}
		/******************** InsrncPln_Pln_Id_Typ_Cdg_Sys ********************************************************************************/
		if(insuranceplanplanidentifiertypecoding.hasSystem()) {
			i.setInsrncPlnPlnIdTypCdgSys(String.valueOf(insuranceplanplanidentifiertypecoding.getSystem()));
		}
		/******************** insuranceplanplanidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period insuranceplanplanidentifierperiod = insuranceplanplanidentifier.getPeriod();

		/******************** InsrncPln_Pln_Id_Prd_Strt ********************************************************************************/
		if(insuranceplanplanidentifierperiod.hasStart()) {
			i.setInsrncPlnPlnIdPrdStrt(String.valueOf(insuranceplanplanidentifierperiod.getStart()));
		}
		/******************** InsrncPln_Pln_Id_Prd_End ********************************************************************************/
		if(insuranceplanplanidentifierperiod.hasEnd()) {
			i.setInsrncPlnPlnIdPrdEnd(String.valueOf(insuranceplanplanidentifierperiod.getEnd()));
		}
		/******************** InsrncPln_Pln_Id_Assigner ********************************************************************************/
		if(insuranceplanplanidentifier.hasAssigner()) {
			i.setInsrncPlnPlnIdAssigner(String.valueOf(insuranceplanplanidentifier.getAssigner()));
		}
		/******************** InsrncPln_Pln_Id_Sys ********************************************************************************/
		if(insuranceplanplanidentifier.hasSystem()) {
			i.setInsrncPlnPlnIdSys(String.valueOf(insuranceplanplanidentifier.getSystem()));
		}
		/******************** insuranceplanplanidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse insuranceplanplanidentifieruse = insuranceplanplanidentifier.getUse();
		i.setInsrncPlnPlnIdUse(insuranceplanplanidentifieruse.toCode());

		/******************** InsrncPln_Pln_CvgArea ********************************************************************************/
		if(insuranceplanplan.hasCoverageArea()) {
			i.setInsrncPlnPlnCvgArea(String.valueOf(insuranceplanplan.getCoverageAreaFirstRep()));
		}
		/******************** insuranceplancontact ********************************************************************************/
		org.hl7.fhir.r4.model.InsurancePlan.InsurancePlanContactComponent insuranceplancontact = insuranceplan.getContactFirstRep();

		/******************** insuranceplancontactname ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName insuranceplancontactname = insuranceplancontact.getName();

		/******************** insuranceplancontactnameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period insuranceplancontactnameperiod = insuranceplancontactname.getPeriod();

		/******************** InsrncPln_Cntct_Nm_Prd_Strt ********************************************************************************/
		if(insuranceplancontactnameperiod.hasStart()) {
			i.setInsrncPlnCntctNmPrdStrt(String.valueOf(insuranceplancontactnameperiod.getStart()));
		}
		/******************** InsrncPln_Cntct_Nm_Prd_End ********************************************************************************/
		if(insuranceplancontactnameperiod.hasEnd()) {
			i.setInsrncPlnCntctNmPrdEnd(String.valueOf(insuranceplancontactnameperiod.getEnd()));
		}
		/******************** InsrncPln_Cntct_Nm_Txt ********************************************************************************/
		if(insuranceplancontactname.hasText()) {
			i.setInsrncPlnCntctNmTxt(String.valueOf(insuranceplancontactname.getText()));
		}
		/******************** InsrncPln_Cntct_Nm_Given ********************************************************************************/
		if(insuranceplancontactname.hasGiven()) {
			i.setInsrncPlnCntctNmGiven(String.valueOf(insuranceplancontactname.getGivenAsSingleString()));
		}
		/******************** InsrncPln_Cntct_Nm_Prefix ********************************************************************************/
		if(insuranceplancontactname.hasPrefix()) {
			i.setInsrncPlnCntctNmPrefix(String.valueOf(insuranceplancontactname.getPrefixAsSingleString()));
		}
		/******************** InsrncPln_Cntct_Nm_Suffix ********************************************************************************/
		if(insuranceplancontactname.hasSuffix()) {
			i.setInsrncPlnCntctNmSuffix(String.valueOf(insuranceplancontactname.getSuffixAsSingleString()));
		}
		/******************** insuranceplancontactnameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUse insuranceplancontactnameuse = insuranceplancontactname.getUse();
		i.setInsrncPlnCntctNmUse(insuranceplancontactnameuse.toCode());

		/******************** InsrncPln_Cntct_Nm_Fmly ********************************************************************************/
		if(insuranceplancontactname.hasFamily()) {
			i.setInsrncPlnCntctNmFmly(String.valueOf(insuranceplancontactname.getFamily()));
		}
		/******************** insuranceplancontactaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address insuranceplancontactaddress = insuranceplancontact.getAddress();

		/******************** InsrncPln_Cntct_Addr_State ********************************************************************************/
		if(insuranceplancontactaddress.hasState()) {
			i.setInsrncPlnCntctAddrState(String.valueOf(insuranceplancontactaddress.getState()));
		}
		/******************** insuranceplancontactaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType insuranceplancontactaddresstype = insuranceplancontactaddress.getType();
		i.setInsrncPlnCntctAddrTyp(insuranceplancontactaddresstype.toCode());

		/******************** InsrncPln_Cntct_Addr_Cntry ********************************************************************************/
		if(insuranceplancontactaddress.hasCountry()) {
			i.setInsrncPlnCntctAddrCntry(String.valueOf(insuranceplancontactaddress.getCountry()));
		}
		/******************** insuranceplancontactaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period insuranceplancontactaddressperiod = insuranceplancontactaddress.getPeriod();

		/******************** InsrncPln_Cntct_Addr_Prd_Strt ********************************************************************************/
		if(insuranceplancontactaddressperiod.hasStart()) {
			i.setInsrncPlnCntctAddrPrdStrt(String.valueOf(insuranceplancontactaddressperiod.getStart()));
		}
		/******************** InsrncPln_Cntct_Addr_Prd_End ********************************************************************************/
		if(insuranceplancontactaddressperiod.hasEnd()) {
			i.setInsrncPlnCntctAddrPrdEnd(String.valueOf(insuranceplancontactaddressperiod.getEnd()));
		}
		/******************** InsrncPln_Cntct_Addr_Txt ********************************************************************************/
		if(insuranceplancontactaddress.hasText()) {
			i.setInsrncPlnCntctAddrTxt(String.valueOf(insuranceplancontactaddress.getText()));
		}
		/******************** insuranceplancontactaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse insuranceplancontactaddressuse = insuranceplancontactaddress.getUse();
		i.setInsrncPlnCntctAddrUse(insuranceplancontactaddressuse.toCode());

		/******************** InsrncPln_Cntct_Addr_City ********************************************************************************/
		if(insuranceplancontactaddress.hasCity()) {
			i.setInsrncPlnCntctAddrCity(String.valueOf(insuranceplancontactaddress.getCity()));
		}
		/******************** InsrncPln_Cntct_Addr_District ********************************************************************************/
		if(insuranceplancontactaddress.hasDistrict()) {
			i.setInsrncPlnCntctAddrDistrict(String.valueOf(insuranceplancontactaddress.getDistrict()));
		}
		/******************** InsrncPln_Cntct_Addr_PostalCd ********************************************************************************/
		if(insuranceplancontactaddress.hasPostalCode()) {
			i.setInsrncPlnCntctAddrPostalCd(String.valueOf(insuranceplancontactaddress.getPostalCode()));
		}
		/******************** insuranceplancontactpurpose ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplancontactpurpose = insuranceplancontact.getPurpose();

		/******************** InsrncPln_Cntct_Prpse_Txt ********************************************************************************/
		if(insuranceplancontactpurpose.hasText()) {
			i.setInsrncPlnCntctPrpseTxt(String.valueOf(insuranceplancontactpurpose.getText()));
		}
		/******************** insuranceplancontactpurposecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplancontactpurposecoding = insuranceplancontactpurpose.getCodingFirstRep();

		/******************** InsrncPln_Cntct_Prpse_Cdg_Vrsn ********************************************************************************/
		if(insuranceplancontactpurposecoding.hasVersion()) {
			i.setInsrncPlnCntctPrpseCdgVrsn(String.valueOf(insuranceplancontactpurposecoding.getVersion()));
		}
		/******************** InsrncPln_Cntct_Prpse_Cdg_Dsply ********************************************************************************/
		if(insuranceplancontactpurposecoding.hasDisplay()) {
			i.setInsrncPlnCntctPrpseCdgDsply(String.valueOf(insuranceplancontactpurposecoding.getDisplay()));
		}
		/******************** InsrncPln_Cntct_Prpse_Cdg_Cd ********************************************************************************/
		if(insuranceplancontactpurposecoding.hasCode()) {
			i.setInsrncPlnCntctPrpseCdgCd(String.valueOf(insuranceplancontactpurposecoding.getCode()));
		}
		/******************** InsrncPln_Cntct_Prpse_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplancontactpurposecoding.hasUserSelected()) {
			i.setInsrncPlnCntctPrpseCdgUsrSltd(String.valueOf(insuranceplancontactpurposecoding.getUserSelected()));
		}
		/******************** InsrncPln_Cntct_Prpse_Cdg_Sys ********************************************************************************/
		if(insuranceplancontactpurposecoding.hasSystem()) {
			i.setInsrncPlnCntctPrpseCdgSys(String.valueOf(insuranceplancontactpurposecoding.getSystem()));
		}
		/******************** insuranceplancontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint insuranceplancontacttelecom = insuranceplancontact.getTelecomFirstRep();

		/******************** InsrncPln_Cntct_Tlcm_Vl ********************************************************************************/
		if(insuranceplancontacttelecom.hasValue()) {
			i.setInsrncPlnCntctTlcmVl(String.valueOf(insuranceplancontacttelecom.getValue()));
		}
		/******************** insuranceplancontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period insuranceplancontacttelecomperiod = insuranceplancontacttelecom.getPeriod();

		/******************** InsrncPln_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(insuranceplancontacttelecomperiod.hasStart()) {
			i.setInsrncPlnCntctTlcmPrdStrt(String.valueOf(insuranceplancontacttelecomperiod.getStart()));
		}
		/******************** InsrncPln_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(insuranceplancontacttelecomperiod.hasEnd()) {
			i.setInsrncPlnCntctTlcmPrdEnd(String.valueOf(insuranceplancontacttelecomperiod.getEnd()));
		}
		/******************** insuranceplancontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem insuranceplancontacttelecomsystem = insuranceplancontacttelecom.getSystem();
		i.setInsrncPlnCntctTlcmSys(insuranceplancontacttelecomsystem.toCode());

		/******************** insuranceplancontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse insuranceplancontacttelecomuse = insuranceplancontacttelecom.getUse();
		i.setInsrncPlnCntctTlcmUse(insuranceplancontacttelecomuse.toCode());

		/******************** InsrncPln_Cntct_Tlcm_Rnk ********************************************************************************/
		if(insuranceplancontacttelecom.hasRank()) {
			i.setInsrncPlnCntctTlcmRnk(String.valueOf(insuranceplancontacttelecom.getRank()));
		}
		/******************** insuranceplanidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier insuranceplanidentifier = insuranceplan.getIdentifierFirstRep();

		/******************** InsrncPln_Id_Vl ********************************************************************************/
		if(insuranceplanidentifier.hasValue()) {
			i.setInsrncPlnIdVl(String.valueOf(insuranceplanidentifier.getValue()));
		}
		/******************** insuranceplanidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept insuranceplanidentifiertype = insuranceplanidentifier.getType();

		/******************** InsrncPln_Id_Typ_Txt ********************************************************************************/
		if(insuranceplanidentifiertype.hasText()) {
			i.setInsrncPlnIdTypTxt(String.valueOf(insuranceplanidentifiertype.getText()));
		}
		/******************** insuranceplanidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding insuranceplanidentifiertypecoding = insuranceplanidentifiertype.getCodingFirstRep();

		/******************** InsrncPln_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(insuranceplanidentifiertypecoding.hasVersion()) {
			i.setInsrncPlnIdTypCdgVrsn(String.valueOf(insuranceplanidentifiertypecoding.getVersion()));
		}
		/******************** InsrncPln_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(insuranceplanidentifiertypecoding.hasDisplay()) {
			i.setInsrncPlnIdTypCdgDsply(String.valueOf(insuranceplanidentifiertypecoding.getDisplay()));
		}
		/******************** InsrncPln_Id_Typ_Cdg_Cd ********************************************************************************/
		if(insuranceplanidentifiertypecoding.hasCode()) {
			i.setInsrncPlnIdTypCdgCd(String.valueOf(insuranceplanidentifiertypecoding.getCode()));
		}
		/******************** InsrncPln_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(insuranceplanidentifiertypecoding.hasUserSelected()) {
			i.setInsrncPlnIdTypCdgUsrSltd(String.valueOf(insuranceplanidentifiertypecoding.getUserSelected()));
		}
		/******************** InsrncPln_Id_Typ_Cdg_Sys ********************************************************************************/
		if(insuranceplanidentifiertypecoding.hasSystem()) {
			i.setInsrncPlnIdTypCdgSys(String.valueOf(insuranceplanidentifiertypecoding.getSystem()));
		}
		/******************** insuranceplanidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period insuranceplanidentifierperiod = insuranceplanidentifier.getPeriod();

		/******************** InsrncPln_Id_Prd_Strt ********************************************************************************/
		if(insuranceplanidentifierperiod.hasStart()) {
			i.setInsrncPlnIdPrdStrt(String.valueOf(insuranceplanidentifierperiod.getStart()));
		}
		/******************** InsrncPln_Id_Prd_End ********************************************************************************/
		if(insuranceplanidentifierperiod.hasEnd()) {
			i.setInsrncPlnIdPrdEnd(String.valueOf(insuranceplanidentifierperiod.getEnd()));
		}
		/******************** InsrncPln_Id_Assigner ********************************************************************************/
		if(insuranceplanidentifier.hasAssigner()) {
			i.setInsrncPlnIdAssigner(String.valueOf(insuranceplanidentifier.getAssigner()));
		}
		/******************** InsrncPln_Id_Sys ********************************************************************************/
		if(insuranceplanidentifier.hasSystem()) {
			i.setInsrncPlnIdSys(String.valueOf(insuranceplanidentifier.getSystem()));
		}
		/******************** insuranceplanidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse insuranceplanidentifieruse = insuranceplanidentifier.getUse();
		i.setInsrncPlnIdUse(insuranceplanidentifieruse.toCode());

		/******************** InsrncPln_Endpoint ********************************************************************************/
		if(insuranceplan.hasEndpoint()) {
			i.setInsrncPlnEndpoint(String.valueOf(insuranceplan.getEndpointFirstRep()));
		}
		/******************** InsrncPln_CvgArea ********************************************************************************/
		if(insuranceplan.hasCoverageArea()) {
			i.setInsrncPlnCvgArea(String.valueOf(insuranceplan.getCoverageAreaFirstRep()));
		}
		return i;
	}
}
