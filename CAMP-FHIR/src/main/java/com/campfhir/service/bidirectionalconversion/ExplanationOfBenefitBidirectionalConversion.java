package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ExplanationOfBenefit;
public class ExplanationOfBenefitBidirectionalConversion 
{
	public ExplanationOfBenefit ExplanationOfBenefits(org.hl7.fhir.r4.model.ExplanationOfBenefit explanationofbenefit) throws ParseException
	{
		 main.java.com.campfhir.model.ExplanationOfBenefit e = new  main.java.com.campfhir.model.ExplanationOfBenefit();

		/******************** id ********************************************************************************/
		explanationofbenefit.setId(e.getId());

		/******************** explanationofbenefitpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitpriority = explanationofbenefit.getPriority();

		/******************** ExplntnOfBnft_Priority_Txt ********************************************************************************/
		if(explanationofbenefitpriority.hasText()) {
			e.setExplntnOfBnftPriorityTxt(String.valueOf(explanationofbenefitpriority.getText()));
		}
		/******************** explanationofbenefitprioritycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitprioritycoding = explanationofbenefitpriority.getCodingFirstRep();

		/******************** ExplntnOfBnft_Priority_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitprioritycoding.hasVersion()) {
			e.setExplntnOfBnftPriorityCdgVrsn(String.valueOf(explanationofbenefitprioritycoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Priority_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitprioritycoding.hasDisplay()) {
			e.setExplntnOfBnftPriorityCdgDsply(String.valueOf(explanationofbenefitprioritycoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Priority_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitprioritycoding.hasCode()) {
			e.setExplntnOfBnftPriorityCdgCd(String.valueOf(explanationofbenefitprioritycoding.getCode()));
		}
		/******************** ExplntnOfBnft_Priority_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitprioritycoding.hasUserSelected()) {
			e.setExplntnOfBnftPriorityCdgUsrSltd(String.valueOf(explanationofbenefitprioritycoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Priority_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitprioritycoding.hasSystem()) {
			e.setExplntnOfBnftPriorityCdgSys(String.valueOf(explanationofbenefitprioritycoding.getSystem()));
		}
		/******************** explanationofbenefittype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefittype = explanationofbenefit.getType();

		/******************** ExplntnOfBnft_Typ_Txt ********************************************************************************/
		if(explanationofbenefittype.hasText()) {
			e.setExplntnOfBnftTypTxt(String.valueOf(explanationofbenefittype.getText()));
		}
		/******************** explanationofbenefittypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefittypecoding = explanationofbenefittype.getCodingFirstRep();

		/******************** ExplntnOfBnft_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefittypecoding.hasVersion()) {
			e.setExplntnOfBnftTypCdgVrsn(String.valueOf(explanationofbenefittypecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefittypecoding.hasDisplay()) {
			e.setExplntnOfBnftTypCdgDsply(String.valueOf(explanationofbenefittypecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefittypecoding.hasCode()) {
			e.setExplntnOfBnftTypCdgCd(String.valueOf(explanationofbenefittypecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefittypecoding.hasUserSelected()) {
			e.setExplntnOfBnftTypCdgUsrSltd(String.valueOf(explanationofbenefittypecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefittypecoding.hasSystem()) {
			e.setExplntnOfBnftTypCdgSys(String.valueOf(explanationofbenefittypecoding.getSystem()));
		}
		/******************** ExplntnOfBnft_Provider ********************************************************************************/
		if(explanationofbenefit.hasProvider()) {
			e.setExplntnOfBnftProvider(String.valueOf(explanationofbenefit.getProvider()));
		}
		/******************** explanationofbenefitsubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitsubtype = explanationofbenefit.getSubType();

		/******************** ExplntnOfBnft_SubTyp_Txt ********************************************************************************/
		if(explanationofbenefitsubtype.hasText()) {
			e.setExplntnOfBnftSubTypTxt(String.valueOf(explanationofbenefitsubtype.getText()));
		}
		/******************** explanationofbenefitsubtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitsubtypecoding = explanationofbenefitsubtype.getCodingFirstRep();

		/******************** ExplntnOfBnft_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitsubtypecoding.hasVersion()) {
			e.setExplntnOfBnftSubTypCdgVrsn(String.valueOf(explanationofbenefitsubtypecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_SubTyp_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitsubtypecoding.hasDisplay()) {
			e.setExplntnOfBnftSubTypCdgDsply(String.valueOf(explanationofbenefitsubtypecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_SubTyp_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitsubtypecoding.hasCode()) {
			e.setExplntnOfBnftSubTypCdgCd(String.valueOf(explanationofbenefitsubtypecoding.getCode()));
		}
		/******************** ExplntnOfBnft_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitsubtypecoding.hasUserSelected()) {
			e.setExplntnOfBnftSubTypCdgUsrSltd(String.valueOf(explanationofbenefitsubtypecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_SubTyp_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitsubtypecoding.hasSystem()) {
			e.setExplntnOfBnftSubTypCdgSys(String.valueOf(explanationofbenefitsubtypecoding.getSystem()));
		}
		/******************** ExplntnOfBnft_Pnt ********************************************************************************/
		if(explanationofbenefit.hasPatient()) {
			e.setExplntnOfBnftPnt(String.valueOf(explanationofbenefit.getPatient()));
		}
		/******************** ExplntnOfBnft_Insurer ********************************************************************************/
		if(explanationofbenefit.hasInsurer()) {
			e.setExplntnOfBnftInsurer(String.valueOf(explanationofbenefit.getInsurer()));
		}
		/******************** explanationofbenefitstatus ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.ExplanationOfBenefitStatus explanationofbenefitstatus = explanationofbenefit.getStatus();
		e.setExplntnOfBnftSts(explanationofbenefitstatus.toCode());

		/******************** ExplntnOfBnft_Created ********************************************************************************/
		if(explanationofbenefit.hasCreated()) {
			e.setExplntnOfBnftCreated(String.valueOf(explanationofbenefit.getCreated()));
		}
		/******************** explanationofbenefitoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.RemittanceOutcome explanationofbenefitoutcome = explanationofbenefit.getOutcome();
		e.setExplntnOfBnftOutcome(explanationofbenefitoutcome.toCode());

		/******************** ExplntnOfBnft_Disposition ********************************************************************************/
		if(explanationofbenefit.hasDisposition()) {
			e.setExplntnOfBnftDisposition(String.valueOf(explanationofbenefit.getDisposition()));
		}
		/******************** explanationofbenefitformcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitformcode = explanationofbenefit.getFormCode();

		/******************** ExplntnOfBnft_FrmCd_Txt ********************************************************************************/
		if(explanationofbenefitformcode.hasText()) {
			e.setExplntnOfBnftFrmCdTxt(String.valueOf(explanationofbenefitformcode.getText()));
		}
		/******************** explanationofbenefitformcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitformcodecoding = explanationofbenefitformcode.getCodingFirstRep();

		/******************** ExplntnOfBnft_FrmCd_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitformcodecoding.hasVersion()) {
			e.setExplntnOfBnftFrmCdCdgVrsn(String.valueOf(explanationofbenefitformcodecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_FrmCd_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitformcodecoding.hasDisplay()) {
			e.setExplntnOfBnftFrmCdCdgDsply(String.valueOf(explanationofbenefitformcodecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_FrmCd_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitformcodecoding.hasCode()) {
			e.setExplntnOfBnftFrmCdCdgCd(String.valueOf(explanationofbenefitformcodecoding.getCode()));
		}
		/******************** ExplntnOfBnft_FrmCd_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitformcodecoding.hasUserSelected()) {
			e.setExplntnOfBnftFrmCdCdgUsrSltd(String.valueOf(explanationofbenefitformcodecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_FrmCd_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitformcodecoding.hasSystem()) {
			e.setExplntnOfBnftFrmCdCdgSys(String.valueOf(explanationofbenefitformcodecoding.getSystem()));
		}
		/******************** explanationofbenefitrelated ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.RelatedClaimComponent explanationofbenefitrelated = explanationofbenefit.getRelatedFirstRep();

		/******************** explanationofbenefitrelatedreference ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier explanationofbenefitrelatedreference = explanationofbenefitrelated.getReference();

		/******************** ExplntnOfBnft_Rlted_Rfrnc_Vl ********************************************************************************/
		if(explanationofbenefitrelatedreference.hasValue()) {
			e.setExplntnOfBnftRltedRfrncVl(String.valueOf(explanationofbenefitrelatedreference.getValue()));
		}
		/******************** explanationofbenefitrelatedreferencetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitrelatedreferencetype = explanationofbenefitrelatedreference.getType();

		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Txt ********************************************************************************/
		if(explanationofbenefitrelatedreferencetype.hasText()) {
			e.setExplntnOfBnftRltedRfrncTypTxt(String.valueOf(explanationofbenefitrelatedreferencetype.getText()));
		}
		/******************** explanationofbenefitrelatedreferencetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitrelatedreferencetypecoding = explanationofbenefitrelatedreferencetype.getCodingFirstRep();

		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitrelatedreferencetypecoding.hasVersion()) {
			e.setExplntnOfBnftRltedRfrncTypCdgVrsn(String.valueOf(explanationofbenefitrelatedreferencetypecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitrelatedreferencetypecoding.hasDisplay()) {
			e.setExplntnOfBnftRltedRfrncTypCdgDsply(String.valueOf(explanationofbenefitrelatedreferencetypecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitrelatedreferencetypecoding.hasCode()) {
			e.setExplntnOfBnftRltedRfrncTypCdgCd(String.valueOf(explanationofbenefitrelatedreferencetypecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitrelatedreferencetypecoding.hasUserSelected()) {
			e.setExplntnOfBnftRltedRfrncTypCdgUsrSltd(String.valueOf(explanationofbenefitrelatedreferencetypecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitrelatedreferencetypecoding.hasSystem()) {
			e.setExplntnOfBnftRltedRfrncTypCdgSys(String.valueOf(explanationofbenefitrelatedreferencetypecoding.getSystem()));
		}
		/******************** explanationofbenefitrelatedreferenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitrelatedreferenceperiod = explanationofbenefitrelatedreference.getPeriod();

		/******************** ExplntnOfBnft_Rlted_Rfrnc_Prd_Strt ********************************************************************************/
		if(explanationofbenefitrelatedreferenceperiod.hasStart()) {
			e.setExplntnOfBnftRltedRfrncPrdStrt(String.valueOf(explanationofbenefitrelatedreferenceperiod.getStart()));
		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Prd_End ********************************************************************************/
		if(explanationofbenefitrelatedreferenceperiod.hasEnd()) {
			e.setExplntnOfBnftRltedRfrncPrdEnd(String.valueOf(explanationofbenefitrelatedreferenceperiod.getEnd()));
		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Assigner ********************************************************************************/
		if(explanationofbenefitrelatedreference.hasAssigner()) {
			e.setExplntnOfBnftRltedRfrncAssigner(String.valueOf(explanationofbenefitrelatedreference.getAssigner()));
		}
		/******************** ExplntnOfBnft_Rlted_Rfrnc_Sys ********************************************************************************/
		if(explanationofbenefitrelatedreference.hasSystem()) {
			e.setExplntnOfBnftRltedRfrncSys(String.valueOf(explanationofbenefitrelatedreference.getSystem()));
		}
		/******************** explanationofbenefitrelatedreferenceuse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse explanationofbenefitrelatedreferenceuse = explanationofbenefitrelatedreference.getUse();
		e.setExplntnOfBnftRltedRfrncUse(explanationofbenefitrelatedreferenceuse.toCode());

		/******************** ExplntnOfBnft_Rlted_Clm ********************************************************************************/
		if(explanationofbenefitrelated.hasClaim()) {
			e.setExplntnOfBnftRltedClm(String.valueOf(explanationofbenefitrelated.getClaim()));
		}
		/******************** explanationofbenefitrelatedrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitrelatedrelationship = explanationofbenefitrelated.getRelationship();

		/******************** ExplntnOfBnft_Rlted_Rltnship_Txt ********************************************************************************/
		if(explanationofbenefitrelatedrelationship.hasText()) {
			e.setExplntnOfBnftRltedRltnshipTxt(String.valueOf(explanationofbenefitrelatedrelationship.getText()));
		}
		/******************** explanationofbenefitrelatedrelationshipcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitrelatedrelationshipcoding = explanationofbenefitrelatedrelationship.getCodingFirstRep();

		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitrelatedrelationshipcoding.hasVersion()) {
			e.setExplntnOfBnftRltedRltnshipCdgVrsn(String.valueOf(explanationofbenefitrelatedrelationshipcoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitrelatedrelationshipcoding.hasDisplay()) {
			e.setExplntnOfBnftRltedRltnshipCdgDsply(String.valueOf(explanationofbenefitrelatedrelationshipcoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitrelatedrelationshipcoding.hasCode()) {
			e.setExplntnOfBnftRltedRltnshipCdgCd(String.valueOf(explanationofbenefitrelatedrelationshipcoding.getCode()));
		}
		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitrelatedrelationshipcoding.hasUserSelected()) {
			e.setExplntnOfBnftRltedRltnshipCdgUsrSltd(String.valueOf(explanationofbenefitrelatedrelationshipcoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Rlted_Rltnship_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitrelatedrelationshipcoding.hasSystem()) {
			e.setExplntnOfBnftRltedRltnshipCdgSys(String.valueOf(explanationofbenefitrelatedrelationshipcoding.getSystem()));
		}
		/******************** explanationofbenefitbillableperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitbillableperiod = explanationofbenefit.getBillablePeriod();

		/******************** ExplntnOfBnft_BillablePrd_Strt ********************************************************************************/
		if(explanationofbenefitbillableperiod.hasStart()) {
			e.setExplntnOfBnftBillablePrdStrt(String.valueOf(explanationofbenefitbillableperiod.getStart()));
		}
		/******************** ExplntnOfBnft_BillablePrd_End ********************************************************************************/
		if(explanationofbenefitbillableperiod.hasEnd()) {
			e.setExplntnOfBnftBillablePrdEnd(String.valueOf(explanationofbenefitbillableperiod.getEnd()));
		}
		/******************** explanationofbenefituse ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.Use explanationofbenefituse = explanationofbenefit.getUse();
		e.setExplntnOfBnftUse(explanationofbenefituse.toCode());

		/******************** ExplntnOfBnft_ClmRsps ********************************************************************************/
		if(explanationofbenefit.hasClaimResponse()) {
			e.setExplntnOfBnftClmRsps(String.valueOf(explanationofbenefit.getClaimResponse()));
		}
		/******************** ExplntnOfBnft_Prescription ********************************************************************************/
		if(explanationofbenefit.hasPrescription()) {
			e.setExplntnOfBnftPrescription(String.valueOf(explanationofbenefit.getPrescription()));
		}
		/******************** ExplntnOfBnft_Referral ********************************************************************************/
		if(explanationofbenefit.hasReferral()) {
			e.setExplntnOfBnftReferral(String.valueOf(explanationofbenefit.getReferral()));
		}
		/******************** ExplntnOfBnft_Clm ********************************************************************************/
		if(explanationofbenefit.hasClaim()) {
			e.setExplntnOfBnftClm(String.valueOf(explanationofbenefit.getClaim()));
		}
		/******************** explanationofbenefitfundsreserve ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitfundsreserve = explanationofbenefit.getFundsReserve();

		/******************** ExplntnOfBnft_FundsReserve_Txt ********************************************************************************/
		if(explanationofbenefitfundsreserve.hasText()) {
			e.setExplntnOfBnftFundsReserveTxt(String.valueOf(explanationofbenefitfundsreserve.getText()));
		}
		/******************** explanationofbenefitfundsreservecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitfundsreservecoding = explanationofbenefitfundsreserve.getCodingFirstRep();

		/******************** ExplntnOfBnft_FundsReserve_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitfundsreservecoding.hasVersion()) {
			e.setExplntnOfBnftFundsReserveCdgVrsn(String.valueOf(explanationofbenefitfundsreservecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_FundsReserve_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitfundsreservecoding.hasDisplay()) {
			e.setExplntnOfBnftFundsReserveCdgDsply(String.valueOf(explanationofbenefitfundsreservecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_FundsReserve_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitfundsreservecoding.hasCode()) {
			e.setExplntnOfBnftFundsReserveCdgCd(String.valueOf(explanationofbenefitfundsreservecoding.getCode()));
		}
		/******************** ExplntnOfBnft_FundsReserve_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitfundsreservecoding.hasUserSelected()) {
			e.setExplntnOfBnftFundsReserveCdgUsrSltd(String.valueOf(explanationofbenefitfundsreservecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_FundsReserve_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitfundsreservecoding.hasSystem()) {
			e.setExplntnOfBnftFundsReserveCdgSys(String.valueOf(explanationofbenefitfundsreservecoding.getSystem()));
		}
		/******************** explanationofbenefitaccident ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AccidentComponent explanationofbenefitaccident = explanationofbenefit.getAccident();

		/******************** explanationofbenefitaccidenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitaccidenttype = explanationofbenefitaccident.getType();

		/******************** ExplntnOfBnft_Accident_Typ_Txt ********************************************************************************/
		if(explanationofbenefitaccidenttype.hasText()) {
			e.setExplntnOfBnftAccidentTypTxt(String.valueOf(explanationofbenefitaccidenttype.getText()));
		}
		/******************** explanationofbenefitaccidenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitaccidenttypecoding = explanationofbenefitaccidenttype.getCodingFirstRep();

		/******************** ExplntnOfBnft_Accident_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitaccidenttypecoding.hasVersion()) {
			e.setExplntnOfBnftAccidentTypCdgVrsn(String.valueOf(explanationofbenefitaccidenttypecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Accident_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitaccidenttypecoding.hasDisplay()) {
			e.setExplntnOfBnftAccidentTypCdgDsply(String.valueOf(explanationofbenefitaccidenttypecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Accident_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitaccidenttypecoding.hasCode()) {
			e.setExplntnOfBnftAccidentTypCdgCd(String.valueOf(explanationofbenefitaccidenttypecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Accident_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitaccidenttypecoding.hasUserSelected()) {
			e.setExplntnOfBnftAccidentTypCdgUsrSltd(String.valueOf(explanationofbenefitaccidenttypecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Accident_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitaccidenttypecoding.hasSystem()) {
			e.setExplntnOfBnftAccidentTypCdgSys(String.valueOf(explanationofbenefitaccidenttypecoding.getSystem()));
		}
		/******************** ExplntnOfBnft_Accident_Dt ********************************************************************************/
		if(explanationofbenefitaccident.hasDate()) {
			e.setExplntnOfBnftAccidentDt(String.valueOf(explanationofbenefitaccident.getDate()));
		}
		/******************** explanationofbenefitaccidentlocationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address explanationofbenefitaccidentlocationaddress = explanationofbenefitaccident.getLocationAddress();

		/******************** ExplntnOfBnft_Accident_LctnAddr_State ********************************************************************************/
		if(explanationofbenefitaccidentlocationaddress.hasState()) {
			e.setExplntnOfBnftAccidentLctnAddrState(String.valueOf(explanationofbenefitaccidentlocationaddress.getState()));
		}
		/******************** explanationofbenefitaccidentlocationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType explanationofbenefitaccidentlocationaddresstype = explanationofbenefitaccidentlocationaddress.getType();
		e.setExplntnOfBnftAccidentLctnAddrTyp(explanationofbenefitaccidentlocationaddresstype.toCode());

		/******************** ExplntnOfBnft_Accident_LctnAddr_Cntry ********************************************************************************/
		if(explanationofbenefitaccidentlocationaddress.hasCountry()) {
			e.setExplntnOfBnftAccidentLctnAddrCntry(String.valueOf(explanationofbenefitaccidentlocationaddress.getCountry()));
		}
		/******************** explanationofbenefitaccidentlocationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitaccidentlocationaddressperiod = explanationofbenefitaccidentlocationaddress.getPeriod();

		/******************** ExplntnOfBnft_Accident_LctnAddr_Prd_Strt ********************************************************************************/
		if(explanationofbenefitaccidentlocationaddressperiod.hasStart()) {
			e.setExplntnOfBnftAccidentLctnAddrPrdStrt(String.valueOf(explanationofbenefitaccidentlocationaddressperiod.getStart()));
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_Prd_End ********************************************************************************/
		if(explanationofbenefitaccidentlocationaddressperiod.hasEnd()) {
			e.setExplntnOfBnftAccidentLctnAddrPrdEnd(String.valueOf(explanationofbenefitaccidentlocationaddressperiod.getEnd()));
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_Txt ********************************************************************************/
		if(explanationofbenefitaccidentlocationaddress.hasText()) {
			e.setExplntnOfBnftAccidentLctnAddrTxt(String.valueOf(explanationofbenefitaccidentlocationaddress.getText()));
		}
		/******************** explanationofbenefitaccidentlocationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse explanationofbenefitaccidentlocationaddressuse = explanationofbenefitaccidentlocationaddress.getUse();
		e.setExplntnOfBnftAccidentLctnAddrUse(explanationofbenefitaccidentlocationaddressuse.toCode());

		/******************** ExplntnOfBnft_Accident_LctnAddr_City ********************************************************************************/
		if(explanationofbenefitaccidentlocationaddress.hasCity()) {
			e.setExplntnOfBnftAccidentLctnAddrCity(String.valueOf(explanationofbenefitaccidentlocationaddress.getCity()));
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_District ********************************************************************************/
		if(explanationofbenefitaccidentlocationaddress.hasDistrict()) {
			e.setExplntnOfBnftAccidentLctnAddrDistrict(String.valueOf(explanationofbenefitaccidentlocationaddress.getDistrict()));
		}
		/******************** ExplntnOfBnft_Accident_LctnAddr_PostalCd ********************************************************************************/
		if(explanationofbenefitaccidentlocationaddress.hasPostalCode()) {
			e.setExplntnOfBnftAccidentLctnAddrPostalCd(String.valueOf(explanationofbenefitaccidentlocationaddress.getPostalCode()));
		}
		/******************** ExplntnOfBnft_Accident_LctnRfrnc ********************************************************************************/
		if(explanationofbenefitaccident.hasLocationReference()) {
			e.setExplntnOfBnftAccidentLctnRfrnc(String.valueOf(explanationofbenefitaccident.getLocationReference()));
		}
		/******************** ExplntnOfBnft_Precedence ********************************************************************************/
		if(explanationofbenefit.hasPrecedence()) {
			e.setExplntnOfBnftPrecedence(String.valueOf(explanationofbenefit.getPrecedence()));
		}
		/******************** explanationofbenefitadditem ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemComponent explanationofbenefitadditem = explanationofbenefit.getAddItemFirstRep();

		/******************** explanationofbenefitadditemlocationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address explanationofbenefitadditemlocationaddress = explanationofbenefitadditem.getLocationAddress();

		/******************** ExplntnOfBnft_AddItm_LctnAddr_State ********************************************************************************/
		if(explanationofbenefitadditemlocationaddress.hasState()) {
			e.setExplntnOfBnftAddItmLctnAddrState(String.valueOf(explanationofbenefitadditemlocationaddress.getState()));
		}
		/******************** explanationofbenefitadditemlocationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType explanationofbenefitadditemlocationaddresstype = explanationofbenefitadditemlocationaddress.getType();
		e.setExplntnOfBnftAddItmLctnAddrTyp(explanationofbenefitadditemlocationaddresstype.toCode());

		/******************** ExplntnOfBnft_AddItm_LctnAddr_Cntry ********************************************************************************/
		if(explanationofbenefitadditemlocationaddress.hasCountry()) {
			e.setExplntnOfBnftAddItmLctnAddrCntry(String.valueOf(explanationofbenefitadditemlocationaddress.getCountry()));
		}
		/******************** explanationofbenefitadditemlocationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitadditemlocationaddressperiod = explanationofbenefitadditemlocationaddress.getPeriod();

		/******************** ExplntnOfBnft_AddItm_LctnAddr_Prd_Strt ********************************************************************************/
		if(explanationofbenefitadditemlocationaddressperiod.hasStart()) {
			e.setExplntnOfBnftAddItmLctnAddrPrdStrt(String.valueOf(explanationofbenefitadditemlocationaddressperiod.getStart()));
		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_Prd_End ********************************************************************************/
		if(explanationofbenefitadditemlocationaddressperiod.hasEnd()) {
			e.setExplntnOfBnftAddItmLctnAddrPrdEnd(String.valueOf(explanationofbenefitadditemlocationaddressperiod.getEnd()));
		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_Txt ********************************************************************************/
		if(explanationofbenefitadditemlocationaddress.hasText()) {
			e.setExplntnOfBnftAddItmLctnAddrTxt(String.valueOf(explanationofbenefitadditemlocationaddress.getText()));
		}
		/******************** explanationofbenefitadditemlocationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse explanationofbenefitadditemlocationaddressuse = explanationofbenefitadditemlocationaddress.getUse();
		e.setExplntnOfBnftAddItmLctnAddrUse(explanationofbenefitadditemlocationaddressuse.toCode());

		/******************** ExplntnOfBnft_AddItm_LctnAddr_City ********************************************************************************/
		if(explanationofbenefitadditemlocationaddress.hasCity()) {
			e.setExplntnOfBnftAddItmLctnAddrCity(String.valueOf(explanationofbenefitadditemlocationaddress.getCity()));
		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_District ********************************************************************************/
		if(explanationofbenefitadditemlocationaddress.hasDistrict()) {
			e.setExplntnOfBnftAddItmLctnAddrDistrict(String.valueOf(explanationofbenefitadditemlocationaddress.getDistrict()));
		}
		/******************** ExplntnOfBnft_AddItm_LctnAddr_PostalCd ********************************************************************************/
		if(explanationofbenefitadditemlocationaddress.hasPostalCode()) {
			e.setExplntnOfBnftAddItmLctnAddrPostalCd(String.valueOf(explanationofbenefitadditemlocationaddress.getPostalCode()));
		}
		/******************** ExplntnOfBnft_AddItm_LctnRfrnc ********************************************************************************/
		if(explanationofbenefitadditem.hasLocationReference()) {
			e.setExplntnOfBnftAddItmLctnRfrnc(String.valueOf(explanationofbenefitadditem.getLocationReference()));
		}
		/******************** explanationofbenefitadditemdetail ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailComponent explanationofbenefitadditemdetail = explanationofbenefitadditem.getDetailFirstRep();

		/******************** explanationofbenefitadditemdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailproductorservice = explanationofbenefitadditemdetail.getProductOrService();

		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Txt ********************************************************************************/
		if(explanationofbenefitadditemdetailproductorservice.hasText()) {
			e.setExplntnOfBnftAddItmDtlPrdctOrSrvTxt(String.valueOf(explanationofbenefitadditemdetailproductorservice.getText()));
		}
		/******************** explanationofbenefitadditemdetailproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemdetailproductorservicecoding = explanationofbenefitadditemdetailproductorservice.getCodingFirstRep();

		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemdetailproductorservicecoding.hasVersion()) {
			e.setExplntnOfBnftAddItmDtlPrdctOrSrvCdgVrsn(String.valueOf(explanationofbenefitadditemdetailproductorservicecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemdetailproductorservicecoding.hasDisplay()) {
			e.setExplntnOfBnftAddItmDtlPrdctOrSrvCdgDsply(String.valueOf(explanationofbenefitadditemdetailproductorservicecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailproductorservicecoding.hasCode()) {
			e.setExplntnOfBnftAddItmDtlPrdctOrSrvCdgCd(String.valueOf(explanationofbenefitadditemdetailproductorservicecoding.getCode()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemdetailproductorservicecoding.hasUserSelected()) {
			e.setExplntnOfBnftAddItmDtlPrdctOrSrvCdgUsrSltd(String.valueOf(explanationofbenefitadditemdetailproductorservicecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailproductorservicecoding.hasSystem()) {
			e.setExplntnOfBnftAddItmDtlPrdctOrSrvCdgSys(String.valueOf(explanationofbenefitadditemdetailproductorservicecoding.getSystem()));
		}
		/******************** explanationofbenefitadditemdetailmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailmodifier = explanationofbenefitadditemdetail.getModifierFirstRep();

		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Txt ********************************************************************************/
		if(explanationofbenefitadditemdetailmodifier.hasText()) {
			e.setExplntnOfBnftAddItmDtlMdfrTxt(String.valueOf(explanationofbenefitadditemdetailmodifier.getText()));
		}
		/******************** explanationofbenefitadditemdetailmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemdetailmodifiercoding = explanationofbenefitadditemdetailmodifier.getCodingFirstRep();

		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemdetailmodifiercoding.hasVersion()) {
			e.setExplntnOfBnftAddItmDtlMdfrCdgVrsn(String.valueOf(explanationofbenefitadditemdetailmodifiercoding.getVersion()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemdetailmodifiercoding.hasDisplay()) {
			e.setExplntnOfBnftAddItmDtlMdfrCdgDsply(String.valueOf(explanationofbenefitadditemdetailmodifiercoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailmodifiercoding.hasCode()) {
			e.setExplntnOfBnftAddItmDtlMdfrCdgCd(String.valueOf(explanationofbenefitadditemdetailmodifiercoding.getCode()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemdetailmodifiercoding.hasUserSelected()) {
			e.setExplntnOfBnftAddItmDtlMdfrCdgUsrSltd(String.valueOf(explanationofbenefitadditemdetailmodifiercoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailmodifiercoding.hasSystem()) {
			e.setExplntnOfBnftAddItmDtlMdfrCdgSys(String.valueOf(explanationofbenefitadditemdetailmodifiercoding.getSystem()));
		}
		/******************** explanationofbenefitadditemdetailsubdetail ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailSubDetailComponent explanationofbenefitadditemdetailsubdetail = explanationofbenefitadditemdetail.getSubDetailFirstRep();

		/******************** explanationofbenefitadditemdetailsubdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailsubdetailproductorservice = explanationofbenefitadditemdetailsubdetail.getProductOrService();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Txt ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailproductorservice.hasText()) {
			e.setExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvTxt(String.valueOf(explanationofbenefitadditemdetailsubdetailproductorservice.getText()));
		}
		/******************** explanationofbenefitadditemdetailsubdetailproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemdetailsubdetailproductorservicecoding = explanationofbenefitadditemdetailsubdetailproductorservice.getCodingFirstRep();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailproductorservicecoding.hasVersion()) {
			e.setExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgVrsn(String.valueOf(explanationofbenefitadditemdetailsubdetailproductorservicecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailproductorservicecoding.hasDisplay()) {
			e.setExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgDsply(String.valueOf(explanationofbenefitadditemdetailsubdetailproductorservicecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailproductorservicecoding.hasCode()) {
			e.setExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgCd(String.valueOf(explanationofbenefitadditemdetailsubdetailproductorservicecoding.getCode()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailproductorservicecoding.hasUserSelected()) {
			e.setExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgUsrSltd(String.valueOf(explanationofbenefitadditemdetailsubdetailproductorservicecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailproductorservicecoding.hasSystem()) {
			e.setExplntnOfBnftAddItmDtlSubDtlPrdctOrSrvCdgSys(String.valueOf(explanationofbenefitadditemdetailsubdetailproductorservicecoding.getSystem()));
		}
		/******************** explanationofbenefitadditemdetailsubdetailmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailsubdetailmodifier = explanationofbenefitadditemdetailsubdetail.getModifierFirstRep();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Txt ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailmodifier.hasText()) {
			e.setExplntnOfBnftAddItmDtlSubDtlMdfrTxt(String.valueOf(explanationofbenefitadditemdetailsubdetailmodifier.getText()));
		}
		/******************** explanationofbenefitadditemdetailsubdetailmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemdetailsubdetailmodifiercoding = explanationofbenefitadditemdetailsubdetailmodifier.getCodingFirstRep();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailmodifiercoding.hasVersion()) {
			e.setExplntnOfBnftAddItmDtlSubDtlMdfrCdgVrsn(String.valueOf(explanationofbenefitadditemdetailsubdetailmodifiercoding.getVersion()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailmodifiercoding.hasDisplay()) {
			e.setExplntnOfBnftAddItmDtlSubDtlMdfrCdgDsply(String.valueOf(explanationofbenefitadditemdetailsubdetailmodifiercoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailmodifiercoding.hasCode()) {
			e.setExplntnOfBnftAddItmDtlSubDtlMdfrCdgCd(String.valueOf(explanationofbenefitadditemdetailsubdetailmodifiercoding.getCode()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailmodifiercoding.hasUserSelected()) {
			e.setExplntnOfBnftAddItmDtlSubDtlMdfrCdgUsrSltd(String.valueOf(explanationofbenefitadditemdetailsubdetailmodifiercoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailmodifiercoding.hasSystem()) {
			e.setExplntnOfBnftAddItmDtlSubDtlMdfrCdgSys(String.valueOf(explanationofbenefitadditemdetailsubdetailmodifiercoding.getSystem()));
		}
		/******************** explanationofbenefitadditemdetailsubdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefitadditemdetailsubdetailquantity = explanationofbenefitadditemdetailsubdetail.getQuantity();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Qnty_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailquantity.hasValue()) {
			e.setExplntnOfBnftAddItmDtlSubDtlQntyVl(String.valueOf(explanationofbenefitadditemdetailsubdetailquantity.getValue()));
		}
		/******************** explanationofbenefitadditemdetailsubdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator explanationofbenefitadditemdetailsubdetailquantitycomparator = explanationofbenefitadditemdetailsubdetailquantity.getComparator();
		e.setExplntnOfBnftAddItmDtlSubDtlQntyCmprtr(explanationofbenefitadditemdetailsubdetailquantitycomparator.toCode());

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Qnty_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailquantity.hasCode()) {
			e.setExplntnOfBnftAddItmDtlSubDtlQntyCd(String.valueOf(explanationofbenefitadditemdetailsubdetailquantity.getCode()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Qnty_Unt ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailquantity.hasUnit()) {
			e.setExplntnOfBnftAddItmDtlSubDtlQntyUnt(String.valueOf(explanationofbenefitadditemdetailsubdetailquantity.getUnit()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Qnty_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailquantity.hasSystem()) {
			e.setExplntnOfBnftAddItmDtlSubDtlQntySys(String.valueOf(explanationofbenefitadditemdetailsubdetailquantity.getSystem()));
		}
		/******************** explanationofbenefitadditemdetailsubdetailadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent explanationofbenefitadditemdetailsubdetailadjudication = explanationofbenefitadditemdetailsubdetail.getAdjudicationFirstRep();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudication.hasValue()) {
			e.setExplntnOfBnftAddItmDtlSubDtlAdjdctnVl(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudication.getValue()));
		}
		/******************** explanationofbenefitadditemdetailsubdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailsubdetailadjudicationreason = explanationofbenefitadditemdetailsubdetailadjudication.getReason();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationreason.hasText()) {
			e.setExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnTxt(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationreason.getText()));
		}
		/******************** explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding = explanationofbenefitadditemdetailsubdetailadjudicationreason.getCodingFirstRep();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.hasVersion()) {
			e.setExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgVrsn(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.getVersion()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.hasDisplay()) {
			e.setExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgDsply(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.hasCode()) {
			e.setExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgCd(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.getCode()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.hasUserSelected()) {
			e.setExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgUsrSltd(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.hasSystem()) {
			e.setExplntnOfBnftAddItmDtlSubDtlAdjdctnRsnCdgSys(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationreasoncoding.getSystem()));
		}
		/******************** explanationofbenefitadditemdetailsubdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailsubdetailadjudicationcategory = explanationofbenefitadditemdetailsubdetailadjudication.getCategory();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationcategory.hasText()) {
			e.setExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryTxt(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationcategory.getText()));
		}
		/******************** explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding = explanationofbenefitadditemdetailsubdetailadjudicationcategory.getCodingFirstRep();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.hasVersion()) {
			e.setExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgVrsn(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.getVersion()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.hasDisplay()) {
			e.setExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgDsply(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.hasCode()) {
			e.setExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgCd(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.getCode()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.hasUserSelected()) {
			e.setExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgUsrSltd(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.hasSystem()) {
			e.setExplntnOfBnftAddItmDtlSubDtlAdjdctnCtgryCdgSys(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationcategorycoding.getSystem()));
		}
		/******************** explanationofbenefitadditemdetailsubdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemdetailsubdetailadjudicationamount = explanationofbenefitadditemdetailsubdetailadjudication.getAmount();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationamount.hasValue()) {
			e.setExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntVl(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationamount.getValue()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailadjudicationamount.hasCurrency()) {
			e.setExplntnOfBnftAddItmDtlSubDtlAdjdctnAmntCrncy(String.valueOf(explanationofbenefitadditemdetailsubdetailadjudicationamount.getCurrency()));
		}
		/******************** explanationofbenefitadditemdetailsubdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemdetailsubdetailunitprice = explanationofbenefitadditemdetailsubdetail.getUnitPrice();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_UntPrice_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailunitprice.hasValue()) {
			e.setExplntnOfBnftAddItmDtlSubDtlUntPriceVl(String.valueOf(explanationofbenefitadditemdetailsubdetailunitprice.getValue()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_UntPrice_Crncy ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailunitprice.hasCurrency()) {
			e.setExplntnOfBnftAddItmDtlSubDtlUntPriceCrncy(String.valueOf(explanationofbenefitadditemdetailsubdetailunitprice.getCurrency()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Factor ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetail.hasFactor()) {
			e.setExplntnOfBnftAddItmDtlSubDtlFactor(String.valueOf(explanationofbenefitadditemdetailsubdetail.getFactor()));
		}
		/******************** explanationofbenefitadditemdetailsubdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemdetailsubdetailnet = explanationofbenefitadditemdetailsubdetail.getNet();

		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Net_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailnet.hasValue()) {
			e.setExplntnOfBnftAddItmDtlSubDtlNetVl(String.valueOf(explanationofbenefitadditemdetailsubdetailnet.getValue()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_SubDtl_Net_Crncy ********************************************************************************/
		if(explanationofbenefitadditemdetailsubdetailnet.hasCurrency()) {
			e.setExplntnOfBnftAddItmDtlSubDtlNetCrncy(String.valueOf(explanationofbenefitadditemdetailsubdetailnet.getCurrency()));
		}
		/******************** explanationofbenefitadditemdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefitadditemdetailquantity = explanationofbenefitadditemdetail.getQuantity();

		/******************** ExplntnOfBnft_AddItm_Dtl_Qnty_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetailquantity.hasValue()) {
			e.setExplntnOfBnftAddItmDtlQntyVl(String.valueOf(explanationofbenefitadditemdetailquantity.getValue()));
		}
		/******************** explanationofbenefitadditemdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator explanationofbenefitadditemdetailquantitycomparator = explanationofbenefitadditemdetailquantity.getComparator();
		e.setExplntnOfBnftAddItmDtlQntyCmprtr(explanationofbenefitadditemdetailquantitycomparator.toCode());

		/******************** ExplntnOfBnft_AddItm_Dtl_Qnty_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailquantity.hasCode()) {
			e.setExplntnOfBnftAddItmDtlQntyCd(String.valueOf(explanationofbenefitadditemdetailquantity.getCode()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Qnty_Unt ********************************************************************************/
		if(explanationofbenefitadditemdetailquantity.hasUnit()) {
			e.setExplntnOfBnftAddItmDtlQntyUnt(String.valueOf(explanationofbenefitadditemdetailquantity.getUnit()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Qnty_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailquantity.hasSystem()) {
			e.setExplntnOfBnftAddItmDtlQntySys(String.valueOf(explanationofbenefitadditemdetailquantity.getSystem()));
		}
		/******************** explanationofbenefitadditemdetailadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent explanationofbenefitadditemdetailadjudication = explanationofbenefitadditemdetail.getAdjudicationFirstRep();

		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudication.hasValue()) {
			e.setExplntnOfBnftAddItmDtlAdjdctnVl(String.valueOf(explanationofbenefitadditemdetailadjudication.getValue()));
		}
		/******************** explanationofbenefitadditemdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailadjudicationreason = explanationofbenefitadditemdetailadjudication.getReason();

		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationreason.hasText()) {
			e.setExplntnOfBnftAddItmDtlAdjdctnRsnTxt(String.valueOf(explanationofbenefitadditemdetailadjudicationreason.getText()));
		}
		/******************** explanationofbenefitadditemdetailadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemdetailadjudicationreasoncoding = explanationofbenefitadditemdetailadjudicationreason.getCodingFirstRep();

		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationreasoncoding.hasVersion()) {
			e.setExplntnOfBnftAddItmDtlAdjdctnRsnCdgVrsn(String.valueOf(explanationofbenefitadditemdetailadjudicationreasoncoding.getVersion()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationreasoncoding.hasDisplay()) {
			e.setExplntnOfBnftAddItmDtlAdjdctnRsnCdgDsply(String.valueOf(explanationofbenefitadditemdetailadjudicationreasoncoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationreasoncoding.hasCode()) {
			e.setExplntnOfBnftAddItmDtlAdjdctnRsnCdgCd(String.valueOf(explanationofbenefitadditemdetailadjudicationreasoncoding.getCode()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationreasoncoding.hasUserSelected()) {
			e.setExplntnOfBnftAddItmDtlAdjdctnRsnCdgUsrSltd(String.valueOf(explanationofbenefitadditemdetailadjudicationreasoncoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationreasoncoding.hasSystem()) {
			e.setExplntnOfBnftAddItmDtlAdjdctnRsnCdgSys(String.valueOf(explanationofbenefitadditemdetailadjudicationreasoncoding.getSystem()));
		}
		/******************** explanationofbenefitadditemdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemdetailadjudicationcategory = explanationofbenefitadditemdetailadjudication.getCategory();

		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationcategory.hasText()) {
			e.setExplntnOfBnftAddItmDtlAdjdctnCtgryTxt(String.valueOf(explanationofbenefitadditemdetailadjudicationcategory.getText()));
		}
		/******************** explanationofbenefitadditemdetailadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemdetailadjudicationcategorycoding = explanationofbenefitadditemdetailadjudicationcategory.getCodingFirstRep();

		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationcategorycoding.hasVersion()) {
			e.setExplntnOfBnftAddItmDtlAdjdctnCtgryCdgVrsn(String.valueOf(explanationofbenefitadditemdetailadjudicationcategorycoding.getVersion()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationcategorycoding.hasDisplay()) {
			e.setExplntnOfBnftAddItmDtlAdjdctnCtgryCdgDsply(String.valueOf(explanationofbenefitadditemdetailadjudicationcategorycoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationcategorycoding.hasCode()) {
			e.setExplntnOfBnftAddItmDtlAdjdctnCtgryCdgCd(String.valueOf(explanationofbenefitadditemdetailadjudicationcategorycoding.getCode()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationcategorycoding.hasUserSelected()) {
			e.setExplntnOfBnftAddItmDtlAdjdctnCtgryCdgUsrSltd(String.valueOf(explanationofbenefitadditemdetailadjudicationcategorycoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationcategorycoding.hasSystem()) {
			e.setExplntnOfBnftAddItmDtlAdjdctnCtgryCdgSys(String.valueOf(explanationofbenefitadditemdetailadjudicationcategorycoding.getSystem()));
		}
		/******************** explanationofbenefitadditemdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemdetailadjudicationamount = explanationofbenefitadditemdetailadjudication.getAmount();

		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationamount.hasValue()) {
			e.setExplntnOfBnftAddItmDtlAdjdctnAmntVl(String.valueOf(explanationofbenefitadditemdetailadjudicationamount.getValue()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(explanationofbenefitadditemdetailadjudicationamount.hasCurrency()) {
			e.setExplntnOfBnftAddItmDtlAdjdctnAmntCrncy(String.valueOf(explanationofbenefitadditemdetailadjudicationamount.getCurrency()));
		}
		/******************** explanationofbenefitadditemdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemdetailunitprice = explanationofbenefitadditemdetail.getUnitPrice();

		/******************** ExplntnOfBnft_AddItm_Dtl_UntPrice_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetailunitprice.hasValue()) {
			e.setExplntnOfBnftAddItmDtlUntPriceVl(String.valueOf(explanationofbenefitadditemdetailunitprice.getValue()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_UntPrice_Crncy ********************************************************************************/
		if(explanationofbenefitadditemdetailunitprice.hasCurrency()) {
			e.setExplntnOfBnftAddItmDtlUntPriceCrncy(String.valueOf(explanationofbenefitadditemdetailunitprice.getCurrency()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Factor ********************************************************************************/
		if(explanationofbenefitadditemdetail.hasFactor()) {
			e.setExplntnOfBnftAddItmDtlFactor(String.valueOf(explanationofbenefitadditemdetail.getFactor()));
		}
		/******************** explanationofbenefitadditemdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemdetailnet = explanationofbenefitadditemdetail.getNet();

		/******************** ExplntnOfBnft_AddItm_Dtl_Net_Vl ********************************************************************************/
		if(explanationofbenefitadditemdetailnet.hasValue()) {
			e.setExplntnOfBnftAddItmDtlNetVl(String.valueOf(explanationofbenefitadditemdetailnet.getValue()));
		}
		/******************** ExplntnOfBnft_AddItm_Dtl_Net_Crncy ********************************************************************************/
		if(explanationofbenefitadditemdetailnet.hasCurrency()) {
			e.setExplntnOfBnftAddItmDtlNetCrncy(String.valueOf(explanationofbenefitadditemdetailnet.getCurrency()));
		}
		/******************** explanationofbenefitadditemproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemproductorservice = explanationofbenefitadditem.getProductOrService();

		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Txt ********************************************************************************/
		if(explanationofbenefitadditemproductorservice.hasText()) {
			e.setExplntnOfBnftAddItmPrdctOrSrvTxt(String.valueOf(explanationofbenefitadditemproductorservice.getText()));
		}
		/******************** explanationofbenefitadditemproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemproductorservicecoding = explanationofbenefitadditemproductorservice.getCodingFirstRep();

		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemproductorservicecoding.hasVersion()) {
			e.setExplntnOfBnftAddItmPrdctOrSrvCdgVrsn(String.valueOf(explanationofbenefitadditemproductorservicecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemproductorservicecoding.hasDisplay()) {
			e.setExplntnOfBnftAddItmPrdctOrSrvCdgDsply(String.valueOf(explanationofbenefitadditemproductorservicecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemproductorservicecoding.hasCode()) {
			e.setExplntnOfBnftAddItmPrdctOrSrvCdgCd(String.valueOf(explanationofbenefitadditemproductorservicecoding.getCode()));
		}
		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemproductorservicecoding.hasUserSelected()) {
			e.setExplntnOfBnftAddItmPrdctOrSrvCdgUsrSltd(String.valueOf(explanationofbenefitadditemproductorservicecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_AddItm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemproductorservicecoding.hasSystem()) {
			e.setExplntnOfBnftAddItmPrdctOrSrvCdgSys(String.valueOf(explanationofbenefitadditemproductorservicecoding.getSystem()));
		}
		/******************** explanationofbenefitadditemmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemmodifier = explanationofbenefitadditem.getModifierFirstRep();

		/******************** ExplntnOfBnft_AddItm_Mdfr_Txt ********************************************************************************/
		if(explanationofbenefitadditemmodifier.hasText()) {
			e.setExplntnOfBnftAddItmMdfrTxt(String.valueOf(explanationofbenefitadditemmodifier.getText()));
		}
		/******************** explanationofbenefitadditemmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemmodifiercoding = explanationofbenefitadditemmodifier.getCodingFirstRep();

		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemmodifiercoding.hasVersion()) {
			e.setExplntnOfBnftAddItmMdfrCdgVrsn(String.valueOf(explanationofbenefitadditemmodifiercoding.getVersion()));
		}
		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemmodifiercoding.hasDisplay()) {
			e.setExplntnOfBnftAddItmMdfrCdgDsply(String.valueOf(explanationofbenefitadditemmodifiercoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemmodifiercoding.hasCode()) {
			e.setExplntnOfBnftAddItmMdfrCdgCd(String.valueOf(explanationofbenefitadditemmodifiercoding.getCode()));
		}
		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemmodifiercoding.hasUserSelected()) {
			e.setExplntnOfBnftAddItmMdfrCdgUsrSltd(String.valueOf(explanationofbenefitadditemmodifiercoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_AddItm_Mdfr_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemmodifiercoding.hasSystem()) {
			e.setExplntnOfBnftAddItmMdfrCdgSys(String.valueOf(explanationofbenefitadditemmodifiercoding.getSystem()));
		}
		/******************** ExplntnOfBnft_AddItm_Provider ********************************************************************************/
		if(explanationofbenefitadditem.hasProvider()) {
			e.setExplntnOfBnftAddItmProvider(String.valueOf(explanationofbenefitadditem.getProviderFirstRep()));
		}
		/******************** explanationofbenefitadditemprogramcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemprogramcode = explanationofbenefitadditem.getProgramCodeFirstRep();

		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Txt ********************************************************************************/
		if(explanationofbenefitadditemprogramcode.hasText()) {
			e.setExplntnOfBnftAddItmPrgrmCdTxt(String.valueOf(explanationofbenefitadditemprogramcode.getText()));
		}
		/******************** explanationofbenefitadditemprogramcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemprogramcodecoding = explanationofbenefitadditemprogramcode.getCodingFirstRep();

		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemprogramcodecoding.hasVersion()) {
			e.setExplntnOfBnftAddItmPrgrmCdCdgVrsn(String.valueOf(explanationofbenefitadditemprogramcodecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemprogramcodecoding.hasDisplay()) {
			e.setExplntnOfBnftAddItmPrgrmCdCdgDsply(String.valueOf(explanationofbenefitadditemprogramcodecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemprogramcodecoding.hasCode()) {
			e.setExplntnOfBnftAddItmPrgrmCdCdgCd(String.valueOf(explanationofbenefitadditemprogramcodecoding.getCode()));
		}
		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemprogramcodecoding.hasUserSelected()) {
			e.setExplntnOfBnftAddItmPrgrmCdCdgUsrSltd(String.valueOf(explanationofbenefitadditemprogramcodecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_AddItm_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemprogramcodecoding.hasSystem()) {
			e.setExplntnOfBnftAddItmPrgrmCdCdgSys(String.valueOf(explanationofbenefitadditemprogramcodecoding.getSystem()));
		}
		/******************** explanationofbenefitadditemlocationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemlocationcodeableconcept = explanationofbenefitadditem.getLocationCodeableConcept();

		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Txt ********************************************************************************/
		if(explanationofbenefitadditemlocationcodeableconcept.hasText()) {
			e.setExplntnOfBnftAddItmLctnCdbleCncptTxt(String.valueOf(explanationofbenefitadditemlocationcodeableconcept.getText()));
		}
		/******************** explanationofbenefitadditemlocationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemlocationcodeableconceptcoding = explanationofbenefitadditemlocationcodeableconcept.getCodingFirstRep();

		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemlocationcodeableconceptcoding.hasVersion()) {
			e.setExplntnOfBnftAddItmLctnCdbleCncptCdgVrsn(String.valueOf(explanationofbenefitadditemlocationcodeableconceptcoding.getVersion()));
		}
		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemlocationcodeableconceptcoding.hasDisplay()) {
			e.setExplntnOfBnftAddItmLctnCdbleCncptCdgDsply(String.valueOf(explanationofbenefitadditemlocationcodeableconceptcoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemlocationcodeableconceptcoding.hasCode()) {
			e.setExplntnOfBnftAddItmLctnCdbleCncptCdgCd(String.valueOf(explanationofbenefitadditemlocationcodeableconceptcoding.getCode()));
		}
		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemlocationcodeableconceptcoding.hasUserSelected()) {
			e.setExplntnOfBnftAddItmLctnCdbleCncptCdgUsrSltd(String.valueOf(explanationofbenefitadditemlocationcodeableconceptcoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_AddItm_LctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemlocationcodeableconceptcoding.hasSystem()) {
			e.setExplntnOfBnftAddItmLctnCdbleCncptCdgSys(String.valueOf(explanationofbenefitadditemlocationcodeableconceptcoding.getSystem()));
		}
		/******************** explanationofbenefitadditemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefitadditemquantity = explanationofbenefitadditem.getQuantity();

		/******************** ExplntnOfBnft_AddItm_Qnty_Vl ********************************************************************************/
		if(explanationofbenefitadditemquantity.hasValue()) {
			e.setExplntnOfBnftAddItmQntyVl(String.valueOf(explanationofbenefitadditemquantity.getValue()));
		}
		/******************** explanationofbenefitadditemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator explanationofbenefitadditemquantitycomparator = explanationofbenefitadditemquantity.getComparator();
		e.setExplntnOfBnftAddItmQntyCmprtr(explanationofbenefitadditemquantitycomparator.toCode());

		/******************** ExplntnOfBnft_AddItm_Qnty_Cd ********************************************************************************/
		if(explanationofbenefitadditemquantity.hasCode()) {
			e.setExplntnOfBnftAddItmQntyCd(String.valueOf(explanationofbenefitadditemquantity.getCode()));
		}
		/******************** ExplntnOfBnft_AddItm_Qnty_Unt ********************************************************************************/
		if(explanationofbenefitadditemquantity.hasUnit()) {
			e.setExplntnOfBnftAddItmQntyUnt(String.valueOf(explanationofbenefitadditemquantity.getUnit()));
		}
		/******************** ExplntnOfBnft_AddItm_Qnty_Sys ********************************************************************************/
		if(explanationofbenefitadditemquantity.hasSystem()) {
			e.setExplntnOfBnftAddItmQntySys(String.valueOf(explanationofbenefitadditemquantity.getSystem()));
		}
		/******************** explanationofbenefitadditemadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent explanationofbenefitadditemadjudication = explanationofbenefitadditem.getAdjudicationFirstRep();

		/******************** ExplntnOfBnft_AddItm_Adjdctn_Vl ********************************************************************************/
		if(explanationofbenefitadditemadjudication.hasValue()) {
			e.setExplntnOfBnftAddItmAdjdctnVl(String.valueOf(explanationofbenefitadditemadjudication.getValue()));
		}
		/******************** explanationofbenefitadditemadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemadjudicationreason = explanationofbenefitadditemadjudication.getReason();

		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Txt ********************************************************************************/
		if(explanationofbenefitadditemadjudicationreason.hasText()) {
			e.setExplntnOfBnftAddItmAdjdctnRsnTxt(String.valueOf(explanationofbenefitadditemadjudicationreason.getText()));
		}
		/******************** explanationofbenefitadditemadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemadjudicationreasoncoding = explanationofbenefitadditemadjudicationreason.getCodingFirstRep();

		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemadjudicationreasoncoding.hasVersion()) {
			e.setExplntnOfBnftAddItmAdjdctnRsnCdgVrsn(String.valueOf(explanationofbenefitadditemadjudicationreasoncoding.getVersion()));
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemadjudicationreasoncoding.hasDisplay()) {
			e.setExplntnOfBnftAddItmAdjdctnRsnCdgDsply(String.valueOf(explanationofbenefitadditemadjudicationreasoncoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemadjudicationreasoncoding.hasCode()) {
			e.setExplntnOfBnftAddItmAdjdctnRsnCdgCd(String.valueOf(explanationofbenefitadditemadjudicationreasoncoding.getCode()));
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemadjudicationreasoncoding.hasUserSelected()) {
			e.setExplntnOfBnftAddItmAdjdctnRsnCdgUsrSltd(String.valueOf(explanationofbenefitadditemadjudicationreasoncoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemadjudicationreasoncoding.hasSystem()) {
			e.setExplntnOfBnftAddItmAdjdctnRsnCdgSys(String.valueOf(explanationofbenefitadditemadjudicationreasoncoding.getSystem()));
		}
		/******************** explanationofbenefitadditemadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemadjudicationcategory = explanationofbenefitadditemadjudication.getCategory();

		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefitadditemadjudicationcategory.hasText()) {
			e.setExplntnOfBnftAddItmAdjdctnCtgryTxt(String.valueOf(explanationofbenefitadditemadjudicationcategory.getText()));
		}
		/******************** explanationofbenefitadditemadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemadjudicationcategorycoding = explanationofbenefitadditemadjudicationcategory.getCodingFirstRep();

		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemadjudicationcategorycoding.hasVersion()) {
			e.setExplntnOfBnftAddItmAdjdctnCtgryCdgVrsn(String.valueOf(explanationofbenefitadditemadjudicationcategorycoding.getVersion()));
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemadjudicationcategorycoding.hasDisplay()) {
			e.setExplntnOfBnftAddItmAdjdctnCtgryCdgDsply(String.valueOf(explanationofbenefitadditemadjudicationcategorycoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemadjudicationcategorycoding.hasCode()) {
			e.setExplntnOfBnftAddItmAdjdctnCtgryCdgCd(String.valueOf(explanationofbenefitadditemadjudicationcategorycoding.getCode()));
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemadjudicationcategorycoding.hasUserSelected()) {
			e.setExplntnOfBnftAddItmAdjdctnCtgryCdgUsrSltd(String.valueOf(explanationofbenefitadditemadjudicationcategorycoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemadjudicationcategorycoding.hasSystem()) {
			e.setExplntnOfBnftAddItmAdjdctnCtgryCdgSys(String.valueOf(explanationofbenefitadditemadjudicationcategorycoding.getSystem()));
		}
		/******************** explanationofbenefitadditemadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemadjudicationamount = explanationofbenefitadditemadjudication.getAmount();

		/******************** ExplntnOfBnft_AddItm_Adjdctn_Amnt_Vl ********************************************************************************/
		if(explanationofbenefitadditemadjudicationamount.hasValue()) {
			e.setExplntnOfBnftAddItmAdjdctnAmntVl(String.valueOf(explanationofbenefitadditemadjudicationamount.getValue()));
		}
		/******************** ExplntnOfBnft_AddItm_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(explanationofbenefitadditemadjudicationamount.hasCurrency()) {
			e.setExplntnOfBnftAddItmAdjdctnAmntCrncy(String.valueOf(explanationofbenefitadditemadjudicationamount.getCurrency()));
		}
		/******************** explanationofbenefitadditemunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemunitprice = explanationofbenefitadditem.getUnitPrice();

		/******************** ExplntnOfBnft_AddItm_UntPrice_Vl ********************************************************************************/
		if(explanationofbenefitadditemunitprice.hasValue()) {
			e.setExplntnOfBnftAddItmUntPriceVl(String.valueOf(explanationofbenefitadditemunitprice.getValue()));
		}
		/******************** ExplntnOfBnft_AddItm_UntPrice_Crncy ********************************************************************************/
		if(explanationofbenefitadditemunitprice.hasCurrency()) {
			e.setExplntnOfBnftAddItmUntPriceCrncy(String.valueOf(explanationofbenefitadditemunitprice.getCurrency()));
		}
		/******************** ExplntnOfBnft_AddItm_Factor ********************************************************************************/
		if(explanationofbenefitadditem.hasFactor()) {
			e.setExplntnOfBnftAddItmFactor(String.valueOf(explanationofbenefitadditem.getFactor()));
		}
		/******************** explanationofbenefitadditemnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadditemnet = explanationofbenefitadditem.getNet();

		/******************** ExplntnOfBnft_AddItm_Net_Vl ********************************************************************************/
		if(explanationofbenefitadditemnet.hasValue()) {
			e.setExplntnOfBnftAddItmNetVl(String.valueOf(explanationofbenefitadditemnet.getValue()));
		}
		/******************** ExplntnOfBnft_AddItm_Net_Crncy ********************************************************************************/
		if(explanationofbenefitadditemnet.hasCurrency()) {
			e.setExplntnOfBnftAddItmNetCrncy(String.valueOf(explanationofbenefitadditemnet.getCurrency()));
		}
		/******************** explanationofbenefitadditemservicedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitadditemservicedperiod = explanationofbenefitadditem.getServicedPeriod();

		/******************** ExplntnOfBnft_AddItm_SrvdPrd_Strt ********************************************************************************/
		if(explanationofbenefitadditemservicedperiod.hasStart()) {
			e.setExplntnOfBnftAddItmSrvdPrdStrt(String.valueOf(explanationofbenefitadditemservicedperiod.getStart()));
		}
		/******************** ExplntnOfBnft_AddItm_SrvdPrd_End ********************************************************************************/
		if(explanationofbenefitadditemservicedperiod.hasEnd()) {
			e.setExplntnOfBnftAddItmSrvdPrdEnd(String.valueOf(explanationofbenefitadditemservicedperiod.getEnd()));
		}
		/******************** explanationofbenefitadditembodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditembodysite = explanationofbenefitadditem.getBodySite();

		/******************** ExplntnOfBnft_AddItm_BodySite_Txt ********************************************************************************/
		if(explanationofbenefitadditembodysite.hasText()) {
			e.setExplntnOfBnftAddItmBodySiteTxt(String.valueOf(explanationofbenefitadditembodysite.getText()));
		}
		/******************** explanationofbenefitadditembodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditembodysitecoding = explanationofbenefitadditembodysite.getCodingFirstRep();

		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditembodysitecoding.hasVersion()) {
			e.setExplntnOfBnftAddItmBodySiteCdgVrsn(String.valueOf(explanationofbenefitadditembodysitecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditembodysitecoding.hasDisplay()) {
			e.setExplntnOfBnftAddItmBodySiteCdgDsply(String.valueOf(explanationofbenefitadditembodysitecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditembodysitecoding.hasCode()) {
			e.setExplntnOfBnftAddItmBodySiteCdgCd(String.valueOf(explanationofbenefitadditembodysitecoding.getCode()));
		}
		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditembodysitecoding.hasUserSelected()) {
			e.setExplntnOfBnftAddItmBodySiteCdgUsrSltd(String.valueOf(explanationofbenefitadditembodysitecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_AddItm_BodySite_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditembodysitecoding.hasSystem()) {
			e.setExplntnOfBnftAddItmBodySiteCdgSys(String.valueOf(explanationofbenefitadditembodysitecoding.getSystem()));
		}
		/******************** ExplntnOfBnft_AddItm_SrvdDtTyp ********************************************************************************/
		if(explanationofbenefitadditem.hasServicedDateType()) {
			e.setExplntnOfBnftAddItmSrvdDtTyp(String.valueOf(explanationofbenefitadditem.getServicedDateType()));
		}
		/******************** explanationofbenefitadditemsubsite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadditemsubsite = explanationofbenefitadditem.getSubSiteFirstRep();

		/******************** ExplntnOfBnft_AddItm_SubSite_Txt ********************************************************************************/
		if(explanationofbenefitadditemsubsite.hasText()) {
			e.setExplntnOfBnftAddItmSubSiteTxt(String.valueOf(explanationofbenefitadditemsubsite.getText()));
		}
		/******************** explanationofbenefitadditemsubsitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadditemsubsitecoding = explanationofbenefitadditemsubsite.getCodingFirstRep();

		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadditemsubsitecoding.hasVersion()) {
			e.setExplntnOfBnftAddItmSubSiteCdgVrsn(String.valueOf(explanationofbenefitadditemsubsitecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadditemsubsitecoding.hasDisplay()) {
			e.setExplntnOfBnftAddItmSubSiteCdgDsply(String.valueOf(explanationofbenefitadditemsubsitecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadditemsubsitecoding.hasCode()) {
			e.setExplntnOfBnftAddItmSubSiteCdgCd(String.valueOf(explanationofbenefitadditemsubsitecoding.getCode()));
		}
		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadditemsubsitecoding.hasUserSelected()) {
			e.setExplntnOfBnftAddItmSubSiteCdgUsrSltd(String.valueOf(explanationofbenefitadditemsubsitecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_AddItm_SubSite_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadditemsubsitecoding.hasSystem()) {
			e.setExplntnOfBnftAddItmSubSiteCdgSys(String.valueOf(explanationofbenefitadditemsubsitecoding.getSystem()));
		}
		/******************** explanationofbenefitbenefitperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitbenefitperiod = explanationofbenefit.getBenefitPeriod();

		/******************** ExplntnOfBnft_BnftPrd_Strt ********************************************************************************/
		if(explanationofbenefitbenefitperiod.hasStart()) {
			e.setExplntnOfBnftBnftPrdStrt(String.valueOf(explanationofbenefitbenefitperiod.getStart()));
		}
		/******************** ExplntnOfBnft_BnftPrd_End ********************************************************************************/
		if(explanationofbenefitbenefitperiod.hasEnd()) {
			e.setExplntnOfBnftBnftPrdEnd(String.valueOf(explanationofbenefitbenefitperiod.getEnd()));
		}
		/******************** explanationofbenefittotal ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.TotalComponent explanationofbenefittotal = explanationofbenefit.getTotalFirstRep();

		/******************** explanationofbenefittotalcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefittotalcategory = explanationofbenefittotal.getCategory();

		/******************** ExplntnOfBnft_Total_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefittotalcategory.hasText()) {
			e.setExplntnOfBnftTotalCtgryTxt(String.valueOf(explanationofbenefittotalcategory.getText()));
		}
		/******************** explanationofbenefittotalcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefittotalcategorycoding = explanationofbenefittotalcategory.getCodingFirstRep();

		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefittotalcategorycoding.hasVersion()) {
			e.setExplntnOfBnftTotalCtgryCdgVrsn(String.valueOf(explanationofbenefittotalcategorycoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefittotalcategorycoding.hasDisplay()) {
			e.setExplntnOfBnftTotalCtgryCdgDsply(String.valueOf(explanationofbenefittotalcategorycoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefittotalcategorycoding.hasCode()) {
			e.setExplntnOfBnftTotalCtgryCdgCd(String.valueOf(explanationofbenefittotalcategorycoding.getCode()));
		}
		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefittotalcategorycoding.hasUserSelected()) {
			e.setExplntnOfBnftTotalCtgryCdgUsrSltd(String.valueOf(explanationofbenefittotalcategorycoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Total_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefittotalcategorycoding.hasSystem()) {
			e.setExplntnOfBnftTotalCtgryCdgSys(String.valueOf(explanationofbenefittotalcategorycoding.getSystem()));
		}
		/******************** explanationofbenefittotalamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefittotalamount = explanationofbenefittotal.getAmount();

		/******************** ExplntnOfBnft_Total_Amnt_Vl ********************************************************************************/
		if(explanationofbenefittotalamount.hasValue()) {
			e.setExplntnOfBnftTotalAmntVl(String.valueOf(explanationofbenefittotalamount.getValue()));
		}
		/******************** ExplntnOfBnft_Total_Amnt_Crncy ********************************************************************************/
		if(explanationofbenefittotalamount.hasCurrency()) {
			e.setExplntnOfBnftTotalAmntCrncy(String.valueOf(explanationofbenefittotalamount.getCurrency()));
		}
		/******************** explanationofbenefitform ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment explanationofbenefitform = explanationofbenefit.getForm();

		/******************** ExplntnOfBnft_Frm_Sz ********************************************************************************/
		if(explanationofbenefitform.hasSize()) {
			e.setExplntnOfBnftFrmSz(String.valueOf(explanationofbenefitform.getSize()));
		}
		/******************** ExplntnOfBnft_Frm_Lnguage ********************************************************************************/
		if(explanationofbenefitform.hasLanguage()) {
			e.setExplntnOfBnftFrmLnguage(String.valueOf(explanationofbenefitform.getLanguage()));
		}
		/******************** ExplntnOfBnft_Frm_CntntTyp ********************************************************************************/
		if(explanationofbenefitform.hasContentType()) {
			e.setExplntnOfBnftFrmCntntTyp(String.valueOf(explanationofbenefitform.getContentType()));
		}
		/******************** ExplntnOfBnft_Frm_Ttl ********************************************************************************/
		if(explanationofbenefitform.hasTitle()) {
			e.setExplntnOfBnftFrmTtl(String.valueOf(explanationofbenefitform.getTitle()));
		}
		/******************** ExplntnOfBnft_Frm_Url ********************************************************************************/
		if(explanationofbenefitform.hasUrl()) {
			e.setExplntnOfBnftFrmUrl(String.valueOf(explanationofbenefitform.getUrl()));
		}
		/******************** ExplntnOfBnft_Frm_Data ********************************************************************************/
		if(explanationofbenefitform.hasData()) {
			e.setExplntnOfBnftFrmData(String.valueOf(explanationofbenefitform.getData()));
		}

		/******************** ExplntnOfBnft_Frm_Hash ********************************************************************************/
		if(explanationofbenefitform.hasHash()) {
			e.setExplntnOfBnftFrmHash(String.valueOf(explanationofbenefitform.getHash()));
		}

		/******************** ExplntnOfBnft_Frm_Creation ********************************************************************************/
		if(explanationofbenefitform.hasCreation()) {
			e.setExplntnOfBnftFrmCreation(String.valueOf(explanationofbenefitform.getCreation()));
		}
		/******************** explanationofbenefitfundsreserverequested ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitfundsreserverequested = explanationofbenefit.getFundsReserveRequested();

		/******************** ExplntnOfBnft_FundsReserveRqsted_Txt ********************************************************************************/
		if(explanationofbenefitfundsreserverequested.hasText()) {
			e.setExplntnOfBnftFundsReserveRqstedTxt(String.valueOf(explanationofbenefitfundsreserverequested.getText()));
		}
		/******************** explanationofbenefitfundsreserverequestedcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitfundsreserverequestedcoding = explanationofbenefitfundsreserverequested.getCodingFirstRep();

		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitfundsreserverequestedcoding.hasVersion()) {
			e.setExplntnOfBnftFundsReserveRqstedCdgVrsn(String.valueOf(explanationofbenefitfundsreserverequestedcoding.getVersion()));
		}
		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitfundsreserverequestedcoding.hasDisplay()) {
			e.setExplntnOfBnftFundsReserveRqstedCdgDsply(String.valueOf(explanationofbenefitfundsreserverequestedcoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitfundsreserverequestedcoding.hasCode()) {
			e.setExplntnOfBnftFundsReserveRqstedCdgCd(String.valueOf(explanationofbenefitfundsreserverequestedcoding.getCode()));
		}
		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitfundsreserverequestedcoding.hasUserSelected()) {
			e.setExplntnOfBnftFundsReserveRqstedCdgUsrSltd(String.valueOf(explanationofbenefitfundsreserverequestedcoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_FundsReserveRqsted_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitfundsreserverequestedcoding.hasSystem()) {
			e.setExplntnOfBnftFundsReserveRqstedCdgSys(String.valueOf(explanationofbenefitfundsreserverequestedcoding.getSystem()));
		}
		/******************** explanationofbenefitcareteam ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.CareTeamComponent explanationofbenefitcareteam = explanationofbenefit.getCareTeamFirstRep();

		/******************** ExplntnOfBnft_CareTeam_Provider ********************************************************************************/
		if(explanationofbenefitcareteam.hasProvider()) {
			e.setExplntnOfBnftCareTeamProvider(String.valueOf(explanationofbenefitcareteam.getProvider()));
		}
		/******************** ExplntnOfBnft_CareTeam_Sqnc ********************************************************************************/
		if(explanationofbenefitcareteam.hasSequence()) {
			e.setExplntnOfBnftCareTeamSqnc(String.valueOf(explanationofbenefitcareteam.getSequence()));
		}
		/******************** explanationofbenefitcareteamrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitcareteamrole = explanationofbenefitcareteam.getRole();

		/******************** ExplntnOfBnft_CareTeam_Role_Txt ********************************************************************************/
		if(explanationofbenefitcareteamrole.hasText()) {
			e.setExplntnOfBnftCareTeamRoleTxt(String.valueOf(explanationofbenefitcareteamrole.getText()));
		}
		/******************** explanationofbenefitcareteamrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitcareteamrolecoding = explanationofbenefitcareteamrole.getCodingFirstRep();

		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitcareteamrolecoding.hasVersion()) {
			e.setExplntnOfBnftCareTeamRoleCdgVrsn(String.valueOf(explanationofbenefitcareteamrolecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitcareteamrolecoding.hasDisplay()) {
			e.setExplntnOfBnftCareTeamRoleCdgDsply(String.valueOf(explanationofbenefitcareteamrolecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitcareteamrolecoding.hasCode()) {
			e.setExplntnOfBnftCareTeamRoleCdgCd(String.valueOf(explanationofbenefitcareteamrolecoding.getCode()));
		}
		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitcareteamrolecoding.hasUserSelected()) {
			e.setExplntnOfBnftCareTeamRoleCdgUsrSltd(String.valueOf(explanationofbenefitcareteamrolecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_CareTeam_Role_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitcareteamrolecoding.hasSystem()) {
			e.setExplntnOfBnftCareTeamRoleCdgSys(String.valueOf(explanationofbenefitcareteamrolecoding.getSystem()));
		}
		/******************** ExplntnOfBnft_CareTeam_Responsible ********************************************************************************/
		if(explanationofbenefitcareteam.hasResponsible()) {
			e.setExplntnOfBnftCareTeamResponsible(String.valueOf(explanationofbenefitcareteam.getResponsible()));
		}
		/******************** explanationofbenefitcareteamqualification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitcareteamqualification = explanationofbenefitcareteam.getQualification();

		/******************** ExplntnOfBnft_CareTeam_Qualification_Txt ********************************************************************************/
		if(explanationofbenefitcareteamqualification.hasText()) {
			e.setExplntnOfBnftCareTeamQualificationTxt(String.valueOf(explanationofbenefitcareteamqualification.getText()));
		}
		/******************** explanationofbenefitcareteamqualificationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitcareteamqualificationcoding = explanationofbenefitcareteamqualification.getCodingFirstRep();

		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitcareteamqualificationcoding.hasVersion()) {
			e.setExplntnOfBnftCareTeamQualificationCdgVrsn(String.valueOf(explanationofbenefitcareteamqualificationcoding.getVersion()));
		}
		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitcareteamqualificationcoding.hasDisplay()) {
			e.setExplntnOfBnftCareTeamQualificationCdgDsply(String.valueOf(explanationofbenefitcareteamqualificationcoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitcareteamqualificationcoding.hasCode()) {
			e.setExplntnOfBnftCareTeamQualificationCdgCd(String.valueOf(explanationofbenefitcareteamqualificationcoding.getCode()));
		}
		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitcareteamqualificationcoding.hasUserSelected()) {
			e.setExplntnOfBnftCareTeamQualificationCdgUsrSltd(String.valueOf(explanationofbenefitcareteamqualificationcoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_CareTeam_Qualification_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitcareteamqualificationcoding.hasSystem()) {
			e.setExplntnOfBnftCareTeamQualificationCdgSys(String.valueOf(explanationofbenefitcareteamqualificationcoding.getSystem()));
		}
		/******************** explanationofbenefitbenefitbalance ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitBalanceComponent explanationofbenefitbenefitbalance = explanationofbenefit.getBenefitBalanceFirstRep();

		/******************** ExplntnOfBnft_BnftBalance_Nm ********************************************************************************/
		if(explanationofbenefitbenefitbalance.hasName()) {
			e.setExplntnOfBnftBnftBalanceNm(String.valueOf(explanationofbenefitbenefitbalance.getName()));
		}
		/******************** explanationofbenefitbenefitbalanceterm ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitbenefitbalanceterm = explanationofbenefitbenefitbalance.getTerm();

		/******************** ExplntnOfBnft_BnftBalance_Trm_Txt ********************************************************************************/
		if(explanationofbenefitbenefitbalanceterm.hasText()) {
			e.setExplntnOfBnftBnftBalanceTrmTxt(String.valueOf(explanationofbenefitbenefitbalanceterm.getText()));
		}
		/******************** explanationofbenefitbenefitbalancetermcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitbenefitbalancetermcoding = explanationofbenefitbenefitbalanceterm.getCodingFirstRep();

		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitbenefitbalancetermcoding.hasVersion()) {
			e.setExplntnOfBnftBnftBalanceTrmCdgVrsn(String.valueOf(explanationofbenefitbenefitbalancetermcoding.getVersion()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitbenefitbalancetermcoding.hasDisplay()) {
			e.setExplntnOfBnftBnftBalanceTrmCdgDsply(String.valueOf(explanationofbenefitbenefitbalancetermcoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitbenefitbalancetermcoding.hasCode()) {
			e.setExplntnOfBnftBnftBalanceTrmCdgCd(String.valueOf(explanationofbenefitbenefitbalancetermcoding.getCode()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitbenefitbalancetermcoding.hasUserSelected()) {
			e.setExplntnOfBnftBnftBalanceTrmCdgUsrSltd(String.valueOf(explanationofbenefitbenefitbalancetermcoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Trm_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitbenefitbalancetermcoding.hasSystem()) {
			e.setExplntnOfBnftBnftBalanceTrmCdgSys(String.valueOf(explanationofbenefitbenefitbalancetermcoding.getSystem()));
		}
		/******************** explanationofbenefitbenefitbalanceunit ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitbenefitbalanceunit = explanationofbenefitbenefitbalance.getUnit();

		/******************** ExplntnOfBnft_BnftBalance_Unt_Txt ********************************************************************************/
		if(explanationofbenefitbenefitbalanceunit.hasText()) {
			e.setExplntnOfBnftBnftBalanceUntTxt(String.valueOf(explanationofbenefitbenefitbalanceunit.getText()));
		}
		/******************** explanationofbenefitbenefitbalanceunitcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitbenefitbalanceunitcoding = explanationofbenefitbenefitbalanceunit.getCodingFirstRep();

		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitbenefitbalanceunitcoding.hasVersion()) {
			e.setExplntnOfBnftBnftBalanceUntCdgVrsn(String.valueOf(explanationofbenefitbenefitbalanceunitcoding.getVersion()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitbenefitbalanceunitcoding.hasDisplay()) {
			e.setExplntnOfBnftBnftBalanceUntCdgDsply(String.valueOf(explanationofbenefitbenefitbalanceunitcoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitbenefitbalanceunitcoding.hasCode()) {
			e.setExplntnOfBnftBnftBalanceUntCdgCd(String.valueOf(explanationofbenefitbenefitbalanceunitcoding.getCode()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitbenefitbalanceunitcoding.hasUserSelected()) {
			e.setExplntnOfBnftBnftBalanceUntCdgUsrSltd(String.valueOf(explanationofbenefitbenefitbalanceunitcoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Unt_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitbenefitbalanceunitcoding.hasSystem()) {
			e.setExplntnOfBnftBnftBalanceUntCdgSys(String.valueOf(explanationofbenefitbenefitbalanceunitcoding.getSystem()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Dscrptn ********************************************************************************/
		if(explanationofbenefitbenefitbalance.hasDescription()) {
			e.setExplntnOfBnftBnftBalanceDscrptn(String.valueOf(explanationofbenefitbenefitbalance.getDescription()));
		}
		/******************** explanationofbenefitbenefitbalancefinancial ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitComponent explanationofbenefitbenefitbalancefinancial = explanationofbenefitbenefitbalance.getFinancialFirstRep();

		/******************** explanationofbenefitbenefitbalancefinancialtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitbenefitbalancefinancialtype = explanationofbenefitbenefitbalancefinancial.getType();

		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Txt ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinancialtype.hasText()) {
			e.setExplntnOfBnftBnftBalanceFinancialTypTxt(String.valueOf(explanationofbenefitbenefitbalancefinancialtype.getText()));
		}
		/******************** explanationofbenefitbenefitbalancefinancialtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitbenefitbalancefinancialtypecoding = explanationofbenefitbenefitbalancefinancialtype.getCodingFirstRep();

		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinancialtypecoding.hasVersion()) {
			e.setExplntnOfBnftBnftBalanceFinancialTypCdgVrsn(String.valueOf(explanationofbenefitbenefitbalancefinancialtypecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinancialtypecoding.hasDisplay()) {
			e.setExplntnOfBnftBnftBalanceFinancialTypCdgDsply(String.valueOf(explanationofbenefitbenefitbalancefinancialtypecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinancialtypecoding.hasCode()) {
			e.setExplntnOfBnftBnftBalanceFinancialTypCdgCd(String.valueOf(explanationofbenefitbenefitbalancefinancialtypecoding.getCode()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinancialtypecoding.hasUserSelected()) {
			e.setExplntnOfBnftBnftBalanceFinancialTypCdgUsrSltd(String.valueOf(explanationofbenefitbenefitbalancefinancialtypecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinancialtypecoding.hasSystem()) {
			e.setExplntnOfBnftBnftBalanceFinancialTypCdgSys(String.valueOf(explanationofbenefitbenefitbalancefinancialtypecoding.getSystem()));
		}
		/******************** explanationofbenefitbenefitbalancefinancialallowedmoney ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitbenefitbalancefinancialallowedmoney = explanationofbenefitbenefitbalancefinancial.getAllowedMoney();

		/******************** ExplntnOfBnft_BnftBalance_Financial_AllowedMoney_Vl ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinancialallowedmoney.hasValue()) {
			e.setExplntnOfBnftBnftBalanceFinancialAllowedMoneyVl(String.valueOf(explanationofbenefitbenefitbalancefinancialallowedmoney.getValue()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_AllowedMoney_Crncy ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinancialallowedmoney.hasCurrency()) {
			e.setExplntnOfBnftBnftBalanceFinancialAllowedMoneyCrncy(String.valueOf(explanationofbenefitbenefitbalancefinancialallowedmoney.getCurrency()));
		}
		/******************** explanationofbenefitbenefitbalancefinancialusedmoney ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitbenefitbalancefinancialusedmoney = explanationofbenefitbenefitbalancefinancial.getUsedMoney();

		/******************** ExplntnOfBnft_BnftBalance_Financial_UsedMoney_Vl ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinancialusedmoney.hasValue()) {
			e.setExplntnOfBnftBnftBalanceFinancialUsedMoneyVl(String.valueOf(explanationofbenefitbenefitbalancefinancialusedmoney.getValue()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_UsedMoney_Crncy ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinancialusedmoney.hasCurrency()) {
			e.setExplntnOfBnftBnftBalanceFinancialUsedMoneyCrncy(String.valueOf(explanationofbenefitbenefitbalancefinancialusedmoney.getCurrency()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_AllowedStrgTyp ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinancial.hasAllowedStringType()) {
			e.setExplntnOfBnftBnftBalanceFinancialAllowedStrgTyp(String.valueOf(explanationofbenefitbenefitbalancefinancial.getAllowedStringType()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_AllowedUnsignedIntTyp ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinancial.hasAllowedUnsignedIntType()) {
			e.setExplntnOfBnftBnftBalanceFinancialAllowedUnsignedIntTyp(String.valueOf(explanationofbenefitbenefitbalancefinancial.getAllowedUnsignedIntType()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Financial_UsedUnsignedIntTyp ********************************************************************************/
		if(explanationofbenefitbenefitbalancefinancial.hasUsedUnsignedIntType()) {
			e.setExplntnOfBnftBnftBalanceFinancialUsedUnsignedIntTyp(String.valueOf(explanationofbenefitbenefitbalancefinancial.getUsedUnsignedIntType()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Excluded ********************************************************************************/
		if(explanationofbenefitbenefitbalance.hasExcluded()) {
			e.setExplntnOfBnftBnftBalanceExcluded(String.valueOf(explanationofbenefitbenefitbalance.getExcluded()));
		}
		/******************** explanationofbenefitbenefitbalancenetwork ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitbenefitbalancenetwork = explanationofbenefitbenefitbalance.getNetwork();

		/******************** ExplntnOfBnft_BnftBalance_Network_Txt ********************************************************************************/
		if(explanationofbenefitbenefitbalancenetwork.hasText()) {
			e.setExplntnOfBnftBnftBalanceNetworkTxt(String.valueOf(explanationofbenefitbenefitbalancenetwork.getText()));
		}
		/******************** explanationofbenefitbenefitbalancenetworkcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitbenefitbalancenetworkcoding = explanationofbenefitbenefitbalancenetwork.getCodingFirstRep();

		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitbenefitbalancenetworkcoding.hasVersion()) {
			e.setExplntnOfBnftBnftBalanceNetworkCdgVrsn(String.valueOf(explanationofbenefitbenefitbalancenetworkcoding.getVersion()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitbenefitbalancenetworkcoding.hasDisplay()) {
			e.setExplntnOfBnftBnftBalanceNetworkCdgDsply(String.valueOf(explanationofbenefitbenefitbalancenetworkcoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitbenefitbalancenetworkcoding.hasCode()) {
			e.setExplntnOfBnftBnftBalanceNetworkCdgCd(String.valueOf(explanationofbenefitbenefitbalancenetworkcoding.getCode()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitbenefitbalancenetworkcoding.hasUserSelected()) {
			e.setExplntnOfBnftBnftBalanceNetworkCdgUsrSltd(String.valueOf(explanationofbenefitbenefitbalancenetworkcoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Network_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitbenefitbalancenetworkcoding.hasSystem()) {
			e.setExplntnOfBnftBnftBalanceNetworkCdgSys(String.valueOf(explanationofbenefitbenefitbalancenetworkcoding.getSystem()));
		}
		/******************** explanationofbenefitbenefitbalancecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitbenefitbalancecategory = explanationofbenefitbenefitbalance.getCategory();

		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefitbenefitbalancecategory.hasText()) {
			e.setExplntnOfBnftBnftBalanceCtgryTxt(String.valueOf(explanationofbenefitbenefitbalancecategory.getText()));
		}
		/******************** explanationofbenefitbenefitbalancecategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitbenefitbalancecategorycoding = explanationofbenefitbenefitbalancecategory.getCodingFirstRep();

		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitbenefitbalancecategorycoding.hasVersion()) {
			e.setExplntnOfBnftBnftBalanceCtgryCdgVrsn(String.valueOf(explanationofbenefitbenefitbalancecategorycoding.getVersion()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitbenefitbalancecategorycoding.hasDisplay()) {
			e.setExplntnOfBnftBnftBalanceCtgryCdgDsply(String.valueOf(explanationofbenefitbenefitbalancecategorycoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitbenefitbalancecategorycoding.hasCode()) {
			e.setExplntnOfBnftBnftBalanceCtgryCdgCd(String.valueOf(explanationofbenefitbenefitbalancecategorycoding.getCode()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitbenefitbalancecategorycoding.hasUserSelected()) {
			e.setExplntnOfBnftBnftBalanceCtgryCdgUsrSltd(String.valueOf(explanationofbenefitbenefitbalancecategorycoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_BnftBalance_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitbenefitbalancecategorycoding.hasSystem()) {
			e.setExplntnOfBnftBnftBalanceCtgryCdgSys(String.valueOf(explanationofbenefitbenefitbalancecategorycoding.getSystem()));
		}
		/******************** explanationofbenefitprocedure ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.ProcedureComponent explanationofbenefitprocedure = explanationofbenefit.getProcedureFirstRep();

		/******************** ExplntnOfBnft_Prcdr_Dt ********************************************************************************/
		if(explanationofbenefitprocedure.hasDate()) {
			e.setExplntnOfBnftPrcdrDt(String.valueOf(explanationofbenefitprocedure.getDate()));
		}
		/******************** explanationofbenefitprocedureprocedurecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitprocedureprocedurecodeableconcept = explanationofbenefitprocedure.getProcedureCodeableConcept();

		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Txt ********************************************************************************/
		if(explanationofbenefitprocedureprocedurecodeableconcept.hasText()) {
			e.setExplntnOfBnftPrcdrPrcdrCdbleCncptTxt(String.valueOf(explanationofbenefitprocedureprocedurecodeableconcept.getText()));
		}
		/******************** explanationofbenefitprocedureprocedurecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitprocedureprocedurecodeableconceptcoding = explanationofbenefitprocedureprocedurecodeableconcept.getCodingFirstRep();

		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitprocedureprocedurecodeableconceptcoding.hasVersion()) {
			e.setExplntnOfBnftPrcdrPrcdrCdbleCncptCdgVrsn(String.valueOf(explanationofbenefitprocedureprocedurecodeableconceptcoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitprocedureprocedurecodeableconceptcoding.hasDisplay()) {
			e.setExplntnOfBnftPrcdrPrcdrCdbleCncptCdgDsply(String.valueOf(explanationofbenefitprocedureprocedurecodeableconceptcoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitprocedureprocedurecodeableconceptcoding.hasCode()) {
			e.setExplntnOfBnftPrcdrPrcdrCdbleCncptCdgCd(String.valueOf(explanationofbenefitprocedureprocedurecodeableconceptcoding.getCode()));
		}
		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitprocedureprocedurecodeableconceptcoding.hasUserSelected()) {
			e.setExplntnOfBnftPrcdrPrcdrCdbleCncptCdgUsrSltd(String.valueOf(explanationofbenefitprocedureprocedurecodeableconceptcoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Prcdr_PrcdrCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitprocedureprocedurecodeableconceptcoding.hasSystem()) {
			e.setExplntnOfBnftPrcdrPrcdrCdbleCncptCdgSys(String.valueOf(explanationofbenefitprocedureprocedurecodeableconceptcoding.getSystem()));
		}
		/******************** ExplntnOfBnft_Prcdr_Sqnc ********************************************************************************/
		if(explanationofbenefitprocedure.hasSequence()) {
			e.setExplntnOfBnftPrcdrSqnc(String.valueOf(explanationofbenefitprocedure.getSequence()));
		}
		/******************** explanationofbenefitproceduretype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitproceduretype = explanationofbenefitprocedure.getTypeFirstRep();

		/******************** ExplntnOfBnft_Prcdr_Typ_Txt ********************************************************************************/
		if(explanationofbenefitproceduretype.hasText()) {
			e.setExplntnOfBnftPrcdrTypTxt(String.valueOf(explanationofbenefitproceduretype.getText()));
		}
		/******************** explanationofbenefitproceduretypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitproceduretypecoding = explanationofbenefitproceduretype.getCodingFirstRep();

		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitproceduretypecoding.hasVersion()) {
			e.setExplntnOfBnftPrcdrTypCdgVrsn(String.valueOf(explanationofbenefitproceduretypecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitproceduretypecoding.hasDisplay()) {
			e.setExplntnOfBnftPrcdrTypCdgDsply(String.valueOf(explanationofbenefitproceduretypecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitproceduretypecoding.hasCode()) {
			e.setExplntnOfBnftPrcdrTypCdgCd(String.valueOf(explanationofbenefitproceduretypecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitproceduretypecoding.hasUserSelected()) {
			e.setExplntnOfBnftPrcdrTypCdgUsrSltd(String.valueOf(explanationofbenefitproceduretypecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Prcdr_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitproceduretypecoding.hasSystem()) {
			e.setExplntnOfBnftPrcdrTypCdgSys(String.valueOf(explanationofbenefitproceduretypecoding.getSystem()));
		}
		/******************** ExplntnOfBnft_Prcdr_Udi ********************************************************************************/
		if(explanationofbenefitprocedure.hasUdi()) {
			e.setExplntnOfBnftPrcdrUdi(String.valueOf(explanationofbenefitprocedure.getUdiFirstRep()));
		}
		/******************** explanationofbenefitpreauthrefperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitpreauthrefperiod = explanationofbenefit.getPreAuthRefPeriodFirstRep();

		/******************** ExplntnOfBnft_PreAuthRefPrd_Strt ********************************************************************************/
		if(explanationofbenefitpreauthrefperiod.hasStart()) {
			e.setExplntnOfBnftPreAuthRefPrdStrt(String.valueOf(explanationofbenefitpreauthrefperiod.getStart()));
		}
		/******************** ExplntnOfBnft_PreAuthRefPrd_End ********************************************************************************/
		if(explanationofbenefitpreauthrefperiod.hasEnd()) {
			e.setExplntnOfBnftPreAuthRefPrdEnd(String.valueOf(explanationofbenefitpreauthrefperiod.getEnd()));
		}
		/******************** ExplntnOfBnft_OriginalPrescription ********************************************************************************/
		if(explanationofbenefit.hasOriginalPrescription()) {
			e.setExplntnOfBnftOriginalPrescription(String.valueOf(explanationofbenefit.getOriginalPrescription()));
		}
		/******************** explanationofbenefitadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent explanationofbenefitadjudication = explanationofbenefit.getAdjudicationFirstRep();

		/******************** ExplntnOfBnft_Adjdctn_Vl ********************************************************************************/
		if(explanationofbenefitadjudication.hasValue()) {
			e.setExplntnOfBnftAdjdctnVl(String.valueOf(explanationofbenefitadjudication.getValue()));
		}
		/******************** explanationofbenefitadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadjudicationreason = explanationofbenefitadjudication.getReason();

		/******************** ExplntnOfBnft_Adjdctn_Rsn_Txt ********************************************************************************/
		if(explanationofbenefitadjudicationreason.hasText()) {
			e.setExplntnOfBnftAdjdctnRsnTxt(String.valueOf(explanationofbenefitadjudicationreason.getText()));
		}
		/******************** explanationofbenefitadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadjudicationreasoncoding = explanationofbenefitadjudicationreason.getCodingFirstRep();

		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadjudicationreasoncoding.hasVersion()) {
			e.setExplntnOfBnftAdjdctnRsnCdgVrsn(String.valueOf(explanationofbenefitadjudicationreasoncoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadjudicationreasoncoding.hasDisplay()) {
			e.setExplntnOfBnftAdjdctnRsnCdgDsply(String.valueOf(explanationofbenefitadjudicationreasoncoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadjudicationreasoncoding.hasCode()) {
			e.setExplntnOfBnftAdjdctnRsnCdgCd(String.valueOf(explanationofbenefitadjudicationreasoncoding.getCode()));
		}
		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadjudicationreasoncoding.hasUserSelected()) {
			e.setExplntnOfBnftAdjdctnRsnCdgUsrSltd(String.valueOf(explanationofbenefitadjudicationreasoncoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadjudicationreasoncoding.hasSystem()) {
			e.setExplntnOfBnftAdjdctnRsnCdgSys(String.valueOf(explanationofbenefitadjudicationreasoncoding.getSystem()));
		}
		/******************** explanationofbenefitadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitadjudicationcategory = explanationofbenefitadjudication.getCategory();

		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefitadjudicationcategory.hasText()) {
			e.setExplntnOfBnftAdjdctnCtgryTxt(String.valueOf(explanationofbenefitadjudicationcategory.getText()));
		}
		/******************** explanationofbenefitadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitadjudicationcategorycoding = explanationofbenefitadjudicationcategory.getCodingFirstRep();

		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitadjudicationcategorycoding.hasVersion()) {
			e.setExplntnOfBnftAdjdctnCtgryCdgVrsn(String.valueOf(explanationofbenefitadjudicationcategorycoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitadjudicationcategorycoding.hasDisplay()) {
			e.setExplntnOfBnftAdjdctnCtgryCdgDsply(String.valueOf(explanationofbenefitadjudicationcategorycoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitadjudicationcategorycoding.hasCode()) {
			e.setExplntnOfBnftAdjdctnCtgryCdgCd(String.valueOf(explanationofbenefitadjudicationcategorycoding.getCode()));
		}
		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitadjudicationcategorycoding.hasUserSelected()) {
			e.setExplntnOfBnftAdjdctnCtgryCdgUsrSltd(String.valueOf(explanationofbenefitadjudicationcategorycoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitadjudicationcategorycoding.hasSystem()) {
			e.setExplntnOfBnftAdjdctnCtgryCdgSys(String.valueOf(explanationofbenefitadjudicationcategorycoding.getSystem()));
		}
		/******************** explanationofbenefitadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitadjudicationamount = explanationofbenefitadjudication.getAmount();

		/******************** ExplntnOfBnft_Adjdctn_Amnt_Vl ********************************************************************************/
		if(explanationofbenefitadjudicationamount.hasValue()) {
			e.setExplntnOfBnftAdjdctnAmntVl(String.valueOf(explanationofbenefitadjudicationamount.getValue()));
		}
		/******************** ExplntnOfBnft_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(explanationofbenefitadjudicationamount.hasCurrency()) {
			e.setExplntnOfBnftAdjdctnAmntCrncy(String.valueOf(explanationofbenefitadjudicationamount.getCurrency()));
		}
		/******************** ExplntnOfBnft_Enterer ********************************************************************************/
		if(explanationofbenefit.hasEnterer()) {
			e.setExplntnOfBnftEnterer(String.valueOf(explanationofbenefit.getEnterer()));
		}
		/******************** ExplntnOfBnft_Facility ********************************************************************************/
		if(explanationofbenefit.hasFacility()) {
			e.setExplntnOfBnftFacility(String.valueOf(explanationofbenefit.getFacility()));
		}
		/******************** explanationofbenefititem ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.ItemComponent explanationofbenefititem = explanationofbenefit.getItemFirstRep();

		/******************** explanationofbenefititemlocationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address explanationofbenefititemlocationaddress = explanationofbenefititem.getLocationAddress();

		/******************** ExplntnOfBnft_Itm_LctnAddr_State ********************************************************************************/
		if(explanationofbenefititemlocationaddress.hasState()) {
			e.setExplntnOfBnftItmLctnAddrState(String.valueOf(explanationofbenefititemlocationaddress.getState()));
		}
		/******************** explanationofbenefititemlocationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType explanationofbenefititemlocationaddresstype = explanationofbenefititemlocationaddress.getType();
		e.setExplntnOfBnftItmLctnAddrTyp(explanationofbenefititemlocationaddresstype.toCode());

		/******************** ExplntnOfBnft_Itm_LctnAddr_Cntry ********************************************************************************/
		if(explanationofbenefititemlocationaddress.hasCountry()) {
			e.setExplntnOfBnftItmLctnAddrCntry(String.valueOf(explanationofbenefititemlocationaddress.getCountry()));
		}
		/******************** explanationofbenefititemlocationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefititemlocationaddressperiod = explanationofbenefititemlocationaddress.getPeriod();

		/******************** ExplntnOfBnft_Itm_LctnAddr_Prd_Strt ********************************************************************************/
		if(explanationofbenefititemlocationaddressperiod.hasStart()) {
			e.setExplntnOfBnftItmLctnAddrPrdStrt(String.valueOf(explanationofbenefititemlocationaddressperiod.getStart()));
		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_Prd_End ********************************************************************************/
		if(explanationofbenefititemlocationaddressperiod.hasEnd()) {
			e.setExplntnOfBnftItmLctnAddrPrdEnd(String.valueOf(explanationofbenefititemlocationaddressperiod.getEnd()));
		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_Txt ********************************************************************************/
		if(explanationofbenefititemlocationaddress.hasText()) {
			e.setExplntnOfBnftItmLctnAddrTxt(String.valueOf(explanationofbenefititemlocationaddress.getText()));
		}
		/******************** explanationofbenefititemlocationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse explanationofbenefititemlocationaddressuse = explanationofbenefititemlocationaddress.getUse();
		e.setExplntnOfBnftItmLctnAddrUse(explanationofbenefititemlocationaddressuse.toCode());

		/******************** ExplntnOfBnft_Itm_LctnAddr_City ********************************************************************************/
		if(explanationofbenefititemlocationaddress.hasCity()) {
			e.setExplntnOfBnftItmLctnAddrCity(String.valueOf(explanationofbenefititemlocationaddress.getCity()));
		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_District ********************************************************************************/
		if(explanationofbenefititemlocationaddress.hasDistrict()) {
			e.setExplntnOfBnftItmLctnAddrDistrict(String.valueOf(explanationofbenefititemlocationaddress.getDistrict()));
		}
		/******************** ExplntnOfBnft_Itm_LctnAddr_PostalCd ********************************************************************************/
		if(explanationofbenefititemlocationaddress.hasPostalCode()) {
			e.setExplntnOfBnftItmLctnAddrPostalCd(String.valueOf(explanationofbenefititemlocationaddress.getPostalCode()));
		}
		/******************** ExplntnOfBnft_Itm_LctnRfrnc ********************************************************************************/
		if(explanationofbenefititem.hasLocationReference()) {
			e.setExplntnOfBnftItmLctnRfrnc(String.valueOf(explanationofbenefititem.getLocationReference()));
		}
		/******************** ExplntnOfBnft_Itm_Sqnc ********************************************************************************/
		if(explanationofbenefititem.hasSequence()) {
			e.setExplntnOfBnftItmSqnc(String.valueOf(explanationofbenefititem.getSequence()));
		}
		/******************** explanationofbenefititemdetail ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.DetailComponent explanationofbenefititemdetail = explanationofbenefititem.getDetailFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_Sqnc ********************************************************************************/
		if(explanationofbenefititemdetail.hasSequence()) {
			e.setExplntnOfBnftItmDtlSqnc(String.valueOf(explanationofbenefititemdetail.getSequence()));
		}
		/******************** explanationofbenefititemdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailproductorservice = explanationofbenefititemdetail.getProductOrService();

		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Txt ********************************************************************************/
		if(explanationofbenefititemdetailproductorservice.hasText()) {
			e.setExplntnOfBnftItmDtlPrdctOrSrvTxt(String.valueOf(explanationofbenefititemdetailproductorservice.getText()));
		}
		/******************** explanationofbenefititemdetailproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailproductorservicecoding = explanationofbenefititemdetailproductorservice.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailproductorservicecoding.hasVersion()) {
			e.setExplntnOfBnftItmDtlPrdctOrSrvCdgVrsn(String.valueOf(explanationofbenefititemdetailproductorservicecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailproductorservicecoding.hasDisplay()) {
			e.setExplntnOfBnftItmDtlPrdctOrSrvCdgDsply(String.valueOf(explanationofbenefititemdetailproductorservicecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailproductorservicecoding.hasCode()) {
			e.setExplntnOfBnftItmDtlPrdctOrSrvCdgCd(String.valueOf(explanationofbenefititemdetailproductorservicecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailproductorservicecoding.hasUserSelected()) {
			e.setExplntnOfBnftItmDtlPrdctOrSrvCdgUsrSltd(String.valueOf(explanationofbenefititemdetailproductorservicecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailproductorservicecoding.hasSystem()) {
			e.setExplntnOfBnftItmDtlPrdctOrSrvCdgSys(String.valueOf(explanationofbenefititemdetailproductorservicecoding.getSystem()));
		}
		/******************** explanationofbenefititemdetailmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailmodifier = explanationofbenefititemdetail.getModifierFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Txt ********************************************************************************/
		if(explanationofbenefititemdetailmodifier.hasText()) {
			e.setExplntnOfBnftItmDtlMdfrTxt(String.valueOf(explanationofbenefititemdetailmodifier.getText()));
		}
		/******************** explanationofbenefititemdetailmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailmodifiercoding = explanationofbenefititemdetailmodifier.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailmodifiercoding.hasVersion()) {
			e.setExplntnOfBnftItmDtlMdfrCdgVrsn(String.valueOf(explanationofbenefititemdetailmodifiercoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailmodifiercoding.hasDisplay()) {
			e.setExplntnOfBnftItmDtlMdfrCdgDsply(String.valueOf(explanationofbenefititemdetailmodifiercoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailmodifiercoding.hasCode()) {
			e.setExplntnOfBnftItmDtlMdfrCdgCd(String.valueOf(explanationofbenefititemdetailmodifiercoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailmodifiercoding.hasUserSelected()) {
			e.setExplntnOfBnftItmDtlMdfrCdgUsrSltd(String.valueOf(explanationofbenefititemdetailmodifiercoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailmodifiercoding.hasSystem()) {
			e.setExplntnOfBnftItmDtlMdfrCdgSys(String.valueOf(explanationofbenefititemdetailmodifiercoding.getSystem()));
		}
		/******************** explanationofbenefititemdetailprogramcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailprogramcode = explanationofbenefititemdetail.getProgramCodeFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Txt ********************************************************************************/
		if(explanationofbenefititemdetailprogramcode.hasText()) {
			e.setExplntnOfBnftItmDtlPrgrmCdTxt(String.valueOf(explanationofbenefititemdetailprogramcode.getText()));
		}
		/******************** explanationofbenefititemdetailprogramcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailprogramcodecoding = explanationofbenefititemdetailprogramcode.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailprogramcodecoding.hasVersion()) {
			e.setExplntnOfBnftItmDtlPrgrmCdCdgVrsn(String.valueOf(explanationofbenefititemdetailprogramcodecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailprogramcodecoding.hasDisplay()) {
			e.setExplntnOfBnftItmDtlPrgrmCdCdgDsply(String.valueOf(explanationofbenefititemdetailprogramcodecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailprogramcodecoding.hasCode()) {
			e.setExplntnOfBnftItmDtlPrgrmCdCdgCd(String.valueOf(explanationofbenefititemdetailprogramcodecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailprogramcodecoding.hasUserSelected()) {
			e.setExplntnOfBnftItmDtlPrgrmCdCdgUsrSltd(String.valueOf(explanationofbenefititemdetailprogramcodecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailprogramcodecoding.hasSystem()) {
			e.setExplntnOfBnftItmDtlPrgrmCdCdgSys(String.valueOf(explanationofbenefititemdetailprogramcodecoding.getSystem()));
		}
		/******************** explanationofbenefititemdetailsubdetail ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.SubDetailComponent explanationofbenefititemdetailsubdetail = explanationofbenefititemdetail.getSubDetailFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Sqnc ********************************************************************************/
		if(explanationofbenefititemdetailsubdetail.hasSequence()) {
			e.setExplntnOfBnftItmDtlSubDtlSqnc(String.valueOf(explanationofbenefititemdetailsubdetail.getSequence()));
		}
		/******************** explanationofbenefititemdetailsubdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailsubdetailproductorservice = explanationofbenefititemdetailsubdetail.getProductOrService();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Txt ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailproductorservice.hasText()) {
			e.setExplntnOfBnftItmDtlSubDtlPrdctOrSrvTxt(String.valueOf(explanationofbenefititemdetailsubdetailproductorservice.getText()));
		}
		/******************** explanationofbenefititemdetailsubdetailproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailsubdetailproductorservicecoding = explanationofbenefititemdetailsubdetailproductorservice.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailproductorservicecoding.hasVersion()) {
			e.setExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgVrsn(String.valueOf(explanationofbenefititemdetailsubdetailproductorservicecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailproductorservicecoding.hasDisplay()) {
			e.setExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgDsply(String.valueOf(explanationofbenefititemdetailsubdetailproductorservicecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailproductorservicecoding.hasCode()) {
			e.setExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgCd(String.valueOf(explanationofbenefititemdetailsubdetailproductorservicecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailproductorservicecoding.hasUserSelected()) {
			e.setExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgUsrSltd(String.valueOf(explanationofbenefititemdetailsubdetailproductorservicecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailproductorservicecoding.hasSystem()) {
			e.setExplntnOfBnftItmDtlSubDtlPrdctOrSrvCdgSys(String.valueOf(explanationofbenefititemdetailsubdetailproductorservicecoding.getSystem()));
		}
		/******************** explanationofbenefititemdetailsubdetailmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailsubdetailmodifier = explanationofbenefititemdetailsubdetail.getModifierFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Txt ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailmodifier.hasText()) {
			e.setExplntnOfBnftItmDtlSubDtlMdfrTxt(String.valueOf(explanationofbenefititemdetailsubdetailmodifier.getText()));
		}
		/******************** explanationofbenefititemdetailsubdetailmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailsubdetailmodifiercoding = explanationofbenefititemdetailsubdetailmodifier.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailmodifiercoding.hasVersion()) {
			e.setExplntnOfBnftItmDtlSubDtlMdfrCdgVrsn(String.valueOf(explanationofbenefititemdetailsubdetailmodifiercoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailmodifiercoding.hasDisplay()) {
			e.setExplntnOfBnftItmDtlSubDtlMdfrCdgDsply(String.valueOf(explanationofbenefititemdetailsubdetailmodifiercoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailmodifiercoding.hasCode()) {
			e.setExplntnOfBnftItmDtlSubDtlMdfrCdgCd(String.valueOf(explanationofbenefititemdetailsubdetailmodifiercoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailmodifiercoding.hasUserSelected()) {
			e.setExplntnOfBnftItmDtlSubDtlMdfrCdgUsrSltd(String.valueOf(explanationofbenefititemdetailsubdetailmodifiercoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailmodifiercoding.hasSystem()) {
			e.setExplntnOfBnftItmDtlSubDtlMdfrCdgSys(String.valueOf(explanationofbenefititemdetailsubdetailmodifiercoding.getSystem()));
		}
		/******************** explanationofbenefititemdetailsubdetailprogramcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailsubdetailprogramcode = explanationofbenefititemdetailsubdetail.getProgramCodeFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Txt ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailprogramcode.hasText()) {
			e.setExplntnOfBnftItmDtlSubDtlPrgrmCdTxt(String.valueOf(explanationofbenefititemdetailsubdetailprogramcode.getText()));
		}
		/******************** explanationofbenefititemdetailsubdetailprogramcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailsubdetailprogramcodecoding = explanationofbenefititemdetailsubdetailprogramcode.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailprogramcodecoding.hasVersion()) {
			e.setExplntnOfBnftItmDtlSubDtlPrgrmCdCdgVrsn(String.valueOf(explanationofbenefititemdetailsubdetailprogramcodecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailprogramcodecoding.hasDisplay()) {
			e.setExplntnOfBnftItmDtlSubDtlPrgrmCdCdgDsply(String.valueOf(explanationofbenefititemdetailsubdetailprogramcodecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailprogramcodecoding.hasCode()) {
			e.setExplntnOfBnftItmDtlSubDtlPrgrmCdCdgCd(String.valueOf(explanationofbenefititemdetailsubdetailprogramcodecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailprogramcodecoding.hasUserSelected()) {
			e.setExplntnOfBnftItmDtlSubDtlPrgrmCdCdgUsrSltd(String.valueOf(explanationofbenefititemdetailsubdetailprogramcodecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailprogramcodecoding.hasSystem()) {
			e.setExplntnOfBnftItmDtlSubDtlPrgrmCdCdgSys(String.valueOf(explanationofbenefititemdetailsubdetailprogramcodecoding.getSystem()));
		}
		/******************** explanationofbenefititemdetailsubdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefititemdetailsubdetailquantity = explanationofbenefititemdetailsubdetail.getQuantity();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Qnty_Vl ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailquantity.hasValue()) {
			e.setExplntnOfBnftItmDtlSubDtlQntyVl(String.valueOf(explanationofbenefititemdetailsubdetailquantity.getValue()));
		}
		/******************** explanationofbenefititemdetailsubdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator explanationofbenefititemdetailsubdetailquantitycomparator = explanationofbenefititemdetailsubdetailquantity.getComparator();
		e.setExplntnOfBnftItmDtlSubDtlQntyCmprtr(explanationofbenefititemdetailsubdetailquantitycomparator.toCode());

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Qnty_Cd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailquantity.hasCode()) {
			e.setExplntnOfBnftItmDtlSubDtlQntyCd(String.valueOf(explanationofbenefititemdetailsubdetailquantity.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Qnty_Unt ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailquantity.hasUnit()) {
			e.setExplntnOfBnftItmDtlSubDtlQntyUnt(String.valueOf(explanationofbenefititemdetailsubdetailquantity.getUnit()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Qnty_Sys ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailquantity.hasSystem()) {
			e.setExplntnOfBnftItmDtlSubDtlQntySys(String.valueOf(explanationofbenefititemdetailsubdetailquantity.getSystem()));
		}
		/******************** explanationofbenefititemdetailsubdetailadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent explanationofbenefititemdetailsubdetailadjudication = explanationofbenefititemdetailsubdetail.getAdjudicationFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Vl ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudication.hasValue()) {
			e.setExplntnOfBnftItmDtlSubDtlAdjdctnVl(String.valueOf(explanationofbenefititemdetailsubdetailadjudication.getValue()));
		}
		/******************** explanationofbenefititemdetailsubdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailsubdetailadjudicationreason = explanationofbenefititemdetailsubdetailadjudication.getReason();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationreason.hasText()) {
			e.setExplntnOfBnftItmDtlSubDtlAdjdctnRsnTxt(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationreason.getText()));
		}
		/******************** explanationofbenefititemdetailsubdetailadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailsubdetailadjudicationreasoncoding = explanationofbenefititemdetailsubdetailadjudicationreason.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.hasVersion()) {
			e.setExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgVrsn(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.hasDisplay()) {
			e.setExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgDsply(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.hasCode()) {
			e.setExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgCd(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.hasUserSelected()) {
			e.setExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgUsrSltd(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.hasSystem()) {
			e.setExplntnOfBnftItmDtlSubDtlAdjdctnRsnCdgSys(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationreasoncoding.getSystem()));
		}
		/******************** explanationofbenefititemdetailsubdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailsubdetailadjudicationcategory = explanationofbenefititemdetailsubdetailadjudication.getCategory();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationcategory.hasText()) {
			e.setExplntnOfBnftItmDtlSubDtlAdjdctnCtgryTxt(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationcategory.getText()));
		}
		/******************** explanationofbenefititemdetailsubdetailadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailsubdetailadjudicationcategorycoding = explanationofbenefititemdetailsubdetailadjudicationcategory.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.hasVersion()) {
			e.setExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgVrsn(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.hasDisplay()) {
			e.setExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgDsply(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.hasCode()) {
			e.setExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgCd(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.hasUserSelected()) {
			e.setExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgUsrSltd(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.hasSystem()) {
			e.setExplntnOfBnftItmDtlSubDtlAdjdctnCtgryCdgSys(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationcategorycoding.getSystem()));
		}
		/******************** explanationofbenefititemdetailsubdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemdetailsubdetailadjudicationamount = explanationofbenefititemdetailsubdetailadjudication.getAmount();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationamount.hasValue()) {
			e.setExplntnOfBnftItmDtlSubDtlAdjdctnAmntVl(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationamount.getValue()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailadjudicationamount.hasCurrency()) {
			e.setExplntnOfBnftItmDtlSubDtlAdjdctnAmntCrncy(String.valueOf(explanationofbenefititemdetailsubdetailadjudicationamount.getCurrency()));
		}
		/******************** explanationofbenefititemdetailsubdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemdetailsubdetailunitprice = explanationofbenefititemdetailsubdetail.getUnitPrice();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_UntPrice_Vl ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailunitprice.hasValue()) {
			e.setExplntnOfBnftItmDtlSubDtlUntPriceVl(String.valueOf(explanationofbenefititemdetailsubdetailunitprice.getValue()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_UntPrice_Crncy ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailunitprice.hasCurrency()) {
			e.setExplntnOfBnftItmDtlSubDtlUntPriceCrncy(String.valueOf(explanationofbenefititemdetailsubdetailunitprice.getCurrency()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Factor ********************************************************************************/
		if(explanationofbenefititemdetailsubdetail.hasFactor()) {
			e.setExplntnOfBnftItmDtlSubDtlFactor(String.valueOf(explanationofbenefititemdetailsubdetail.getFactor()));
		}
		/******************** explanationofbenefititemdetailsubdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemdetailsubdetailnet = explanationofbenefititemdetailsubdetail.getNet();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Net_Vl ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailnet.hasValue()) {
			e.setExplntnOfBnftItmDtlSubDtlNetVl(String.valueOf(explanationofbenefititemdetailsubdetailnet.getValue()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Net_Crncy ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailnet.hasCurrency()) {
			e.setExplntnOfBnftItmDtlSubDtlNetCrncy(String.valueOf(explanationofbenefititemdetailsubdetailnet.getCurrency()));
		}
		/******************** explanationofbenefititemdetailsubdetailcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailsubdetailcategory = explanationofbenefititemdetailsubdetail.getCategory();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailcategory.hasText()) {
			e.setExplntnOfBnftItmDtlSubDtlCtgryTxt(String.valueOf(explanationofbenefititemdetailsubdetailcategory.getText()));
		}
		/******************** explanationofbenefititemdetailsubdetailcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailsubdetailcategorycoding = explanationofbenefititemdetailsubdetailcategory.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailcategorycoding.hasVersion()) {
			e.setExplntnOfBnftItmDtlSubDtlCtgryCdgVrsn(String.valueOf(explanationofbenefititemdetailsubdetailcategorycoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailcategorycoding.hasDisplay()) {
			e.setExplntnOfBnftItmDtlSubDtlCtgryCdgDsply(String.valueOf(explanationofbenefititemdetailsubdetailcategorycoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailcategorycoding.hasCode()) {
			e.setExplntnOfBnftItmDtlSubDtlCtgryCdgCd(String.valueOf(explanationofbenefititemdetailsubdetailcategorycoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailcategorycoding.hasUserSelected()) {
			e.setExplntnOfBnftItmDtlSubDtlCtgryCdgUsrSltd(String.valueOf(explanationofbenefititemdetailsubdetailcategorycoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailcategorycoding.hasSystem()) {
			e.setExplntnOfBnftItmDtlSubDtlCtgryCdgSys(String.valueOf(explanationofbenefititemdetailsubdetailcategorycoding.getSystem()));
		}
		/******************** explanationofbenefititemdetailsubdetailrevenue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailsubdetailrevenue = explanationofbenefititemdetailsubdetail.getRevenue();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Txt ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailrevenue.hasText()) {
			e.setExplntnOfBnftItmDtlSubDtlRevenueTxt(String.valueOf(explanationofbenefititemdetailsubdetailrevenue.getText()));
		}
		/******************** explanationofbenefititemdetailsubdetailrevenuecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailsubdetailrevenuecoding = explanationofbenefititemdetailsubdetailrevenue.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailrevenuecoding.hasVersion()) {
			e.setExplntnOfBnftItmDtlSubDtlRevenueCdgVrsn(String.valueOf(explanationofbenefititemdetailsubdetailrevenuecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailrevenuecoding.hasDisplay()) {
			e.setExplntnOfBnftItmDtlSubDtlRevenueCdgDsply(String.valueOf(explanationofbenefititemdetailsubdetailrevenuecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailrevenuecoding.hasCode()) {
			e.setExplntnOfBnftItmDtlSubDtlRevenueCdgCd(String.valueOf(explanationofbenefititemdetailsubdetailrevenuecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailrevenuecoding.hasUserSelected()) {
			e.setExplntnOfBnftItmDtlSubDtlRevenueCdgUsrSltd(String.valueOf(explanationofbenefititemdetailsubdetailrevenuecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Revenue_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailsubdetailrevenuecoding.hasSystem()) {
			e.setExplntnOfBnftItmDtlSubDtlRevenueCdgSys(String.valueOf(explanationofbenefititemdetailsubdetailrevenuecoding.getSystem()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_SubDtl_Udi ********************************************************************************/
		if(explanationofbenefititemdetailsubdetail.hasUdi()) {
			e.setExplntnOfBnftItmDtlSubDtlUdi(String.valueOf(explanationofbenefititemdetailsubdetail.getUdiFirstRep()));
		}
		/******************** explanationofbenefititemdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefititemdetailquantity = explanationofbenefititemdetail.getQuantity();

		/******************** ExplntnOfBnft_Itm_Dtl_Qnty_Vl ********************************************************************************/
		if(explanationofbenefititemdetailquantity.hasValue()) {
			e.setExplntnOfBnftItmDtlQntyVl(String.valueOf(explanationofbenefititemdetailquantity.getValue()));
		}
		/******************** explanationofbenefititemdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator explanationofbenefititemdetailquantitycomparator = explanationofbenefititemdetailquantity.getComparator();
		e.setExplntnOfBnftItmDtlQntyCmprtr(explanationofbenefititemdetailquantitycomparator.toCode());

		/******************** ExplntnOfBnft_Itm_Dtl_Qnty_Cd ********************************************************************************/
		if(explanationofbenefititemdetailquantity.hasCode()) {
			e.setExplntnOfBnftItmDtlQntyCd(String.valueOf(explanationofbenefititemdetailquantity.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Qnty_Unt ********************************************************************************/
		if(explanationofbenefititemdetailquantity.hasUnit()) {
			e.setExplntnOfBnftItmDtlQntyUnt(String.valueOf(explanationofbenefititemdetailquantity.getUnit()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Qnty_Sys ********************************************************************************/
		if(explanationofbenefititemdetailquantity.hasSystem()) {
			e.setExplntnOfBnftItmDtlQntySys(String.valueOf(explanationofbenefititemdetailquantity.getSystem()));
		}
		/******************** explanationofbenefititemdetailadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent explanationofbenefititemdetailadjudication = explanationofbenefititemdetail.getAdjudicationFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Vl ********************************************************************************/
		if(explanationofbenefititemdetailadjudication.hasValue()) {
			e.setExplntnOfBnftItmDtlAdjdctnVl(String.valueOf(explanationofbenefititemdetailadjudication.getValue()));
		}
		/******************** explanationofbenefititemdetailadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailadjudicationreason = explanationofbenefititemdetailadjudication.getReason();

		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Txt ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationreason.hasText()) {
			e.setExplntnOfBnftItmDtlAdjdctnRsnTxt(String.valueOf(explanationofbenefititemdetailadjudicationreason.getText()));
		}
		/******************** explanationofbenefititemdetailadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailadjudicationreasoncoding = explanationofbenefititemdetailadjudicationreason.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationreasoncoding.hasVersion()) {
			e.setExplntnOfBnftItmDtlAdjdctnRsnCdgVrsn(String.valueOf(explanationofbenefititemdetailadjudicationreasoncoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationreasoncoding.hasDisplay()) {
			e.setExplntnOfBnftItmDtlAdjdctnRsnCdgDsply(String.valueOf(explanationofbenefititemdetailadjudicationreasoncoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationreasoncoding.hasCode()) {
			e.setExplntnOfBnftItmDtlAdjdctnRsnCdgCd(String.valueOf(explanationofbenefititemdetailadjudicationreasoncoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationreasoncoding.hasUserSelected()) {
			e.setExplntnOfBnftItmDtlAdjdctnRsnCdgUsrSltd(String.valueOf(explanationofbenefititemdetailadjudicationreasoncoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationreasoncoding.hasSystem()) {
			e.setExplntnOfBnftItmDtlAdjdctnRsnCdgSys(String.valueOf(explanationofbenefititemdetailadjudicationreasoncoding.getSystem()));
		}
		/******************** explanationofbenefititemdetailadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailadjudicationcategory = explanationofbenefititemdetailadjudication.getCategory();

		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationcategory.hasText()) {
			e.setExplntnOfBnftItmDtlAdjdctnCtgryTxt(String.valueOf(explanationofbenefititemdetailadjudicationcategory.getText()));
		}
		/******************** explanationofbenefititemdetailadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailadjudicationcategorycoding = explanationofbenefititemdetailadjudicationcategory.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationcategorycoding.hasVersion()) {
			e.setExplntnOfBnftItmDtlAdjdctnCtgryCdgVrsn(String.valueOf(explanationofbenefititemdetailadjudicationcategorycoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationcategorycoding.hasDisplay()) {
			e.setExplntnOfBnftItmDtlAdjdctnCtgryCdgDsply(String.valueOf(explanationofbenefititemdetailadjudicationcategorycoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationcategorycoding.hasCode()) {
			e.setExplntnOfBnftItmDtlAdjdctnCtgryCdgCd(String.valueOf(explanationofbenefititemdetailadjudicationcategorycoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationcategorycoding.hasUserSelected()) {
			e.setExplntnOfBnftItmDtlAdjdctnCtgryCdgUsrSltd(String.valueOf(explanationofbenefititemdetailadjudicationcategorycoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationcategorycoding.hasSystem()) {
			e.setExplntnOfBnftItmDtlAdjdctnCtgryCdgSys(String.valueOf(explanationofbenefititemdetailadjudicationcategorycoding.getSystem()));
		}
		/******************** explanationofbenefititemdetailadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemdetailadjudicationamount = explanationofbenefititemdetailadjudication.getAmount();

		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Amnt_Vl ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationamount.hasValue()) {
			e.setExplntnOfBnftItmDtlAdjdctnAmntVl(String.valueOf(explanationofbenefititemdetailadjudicationamount.getValue()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(explanationofbenefititemdetailadjudicationamount.hasCurrency()) {
			e.setExplntnOfBnftItmDtlAdjdctnAmntCrncy(String.valueOf(explanationofbenefititemdetailadjudicationamount.getCurrency()));
		}
		/******************** explanationofbenefititemdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemdetailunitprice = explanationofbenefititemdetail.getUnitPrice();

		/******************** ExplntnOfBnft_Itm_Dtl_UntPrice_Vl ********************************************************************************/
		if(explanationofbenefititemdetailunitprice.hasValue()) {
			e.setExplntnOfBnftItmDtlUntPriceVl(String.valueOf(explanationofbenefititemdetailunitprice.getValue()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_UntPrice_Crncy ********************************************************************************/
		if(explanationofbenefititemdetailunitprice.hasCurrency()) {
			e.setExplntnOfBnftItmDtlUntPriceCrncy(String.valueOf(explanationofbenefititemdetailunitprice.getCurrency()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Factor ********************************************************************************/
		if(explanationofbenefititemdetail.hasFactor()) {
			e.setExplntnOfBnftItmDtlFactor(String.valueOf(explanationofbenefititemdetail.getFactor()));
		}
		/******************** explanationofbenefititemdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemdetailnet = explanationofbenefititemdetail.getNet();

		/******************** ExplntnOfBnft_Itm_Dtl_Net_Vl ********************************************************************************/
		if(explanationofbenefititemdetailnet.hasValue()) {
			e.setExplntnOfBnftItmDtlNetVl(String.valueOf(explanationofbenefititemdetailnet.getValue()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Net_Crncy ********************************************************************************/
		if(explanationofbenefititemdetailnet.hasCurrency()) {
			e.setExplntnOfBnftItmDtlNetCrncy(String.valueOf(explanationofbenefititemdetailnet.getCurrency()));
		}
		/******************** explanationofbenefititemdetailcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailcategory = explanationofbenefititemdetail.getCategory();

		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefititemdetailcategory.hasText()) {
			e.setExplntnOfBnftItmDtlCtgryTxt(String.valueOf(explanationofbenefititemdetailcategory.getText()));
		}
		/******************** explanationofbenefititemdetailcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailcategorycoding = explanationofbenefititemdetailcategory.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailcategorycoding.hasVersion()) {
			e.setExplntnOfBnftItmDtlCtgryCdgVrsn(String.valueOf(explanationofbenefititemdetailcategorycoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailcategorycoding.hasDisplay()) {
			e.setExplntnOfBnftItmDtlCtgryCdgDsply(String.valueOf(explanationofbenefititemdetailcategorycoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailcategorycoding.hasCode()) {
			e.setExplntnOfBnftItmDtlCtgryCdgCd(String.valueOf(explanationofbenefititemdetailcategorycoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailcategorycoding.hasUserSelected()) {
			e.setExplntnOfBnftItmDtlCtgryCdgUsrSltd(String.valueOf(explanationofbenefititemdetailcategorycoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailcategorycoding.hasSystem()) {
			e.setExplntnOfBnftItmDtlCtgryCdgSys(String.valueOf(explanationofbenefititemdetailcategorycoding.getSystem()));
		}
		/******************** explanationofbenefititemdetailrevenue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemdetailrevenue = explanationofbenefititemdetail.getRevenue();

		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Txt ********************************************************************************/
		if(explanationofbenefititemdetailrevenue.hasText()) {
			e.setExplntnOfBnftItmDtlRevenueTxt(String.valueOf(explanationofbenefititemdetailrevenue.getText()));
		}
		/******************** explanationofbenefititemdetailrevenuecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemdetailrevenuecoding = explanationofbenefititemdetailrevenue.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemdetailrevenuecoding.hasVersion()) {
			e.setExplntnOfBnftItmDtlRevenueCdgVrsn(String.valueOf(explanationofbenefititemdetailrevenuecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemdetailrevenuecoding.hasDisplay()) {
			e.setExplntnOfBnftItmDtlRevenueCdgDsply(String.valueOf(explanationofbenefititemdetailrevenuecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemdetailrevenuecoding.hasCode()) {
			e.setExplntnOfBnftItmDtlRevenueCdgCd(String.valueOf(explanationofbenefititemdetailrevenuecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemdetailrevenuecoding.hasUserSelected()) {
			e.setExplntnOfBnftItmDtlRevenueCdgUsrSltd(String.valueOf(explanationofbenefititemdetailrevenuecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Revenue_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemdetailrevenuecoding.hasSystem()) {
			e.setExplntnOfBnftItmDtlRevenueCdgSys(String.valueOf(explanationofbenefititemdetailrevenuecoding.getSystem()));
		}
		/******************** ExplntnOfBnft_Itm_Dtl_Udi ********************************************************************************/
		if(explanationofbenefititemdetail.hasUdi()) {
			e.setExplntnOfBnftItmDtlUdi(String.valueOf(explanationofbenefititemdetail.getUdiFirstRep()));
		}
		/******************** explanationofbenefititemproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemproductorservice = explanationofbenefititem.getProductOrService();

		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Txt ********************************************************************************/
		if(explanationofbenefititemproductorservice.hasText()) {
			e.setExplntnOfBnftItmPrdctOrSrvTxt(String.valueOf(explanationofbenefititemproductorservice.getText()));
		}
		/******************** explanationofbenefititemproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemproductorservicecoding = explanationofbenefititemproductorservice.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemproductorservicecoding.hasVersion()) {
			e.setExplntnOfBnftItmPrdctOrSrvCdgVrsn(String.valueOf(explanationofbenefititemproductorservicecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemproductorservicecoding.hasDisplay()) {
			e.setExplntnOfBnftItmPrdctOrSrvCdgDsply(String.valueOf(explanationofbenefititemproductorservicecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemproductorservicecoding.hasCode()) {
			e.setExplntnOfBnftItmPrdctOrSrvCdgCd(String.valueOf(explanationofbenefititemproductorservicecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemproductorservicecoding.hasUserSelected()) {
			e.setExplntnOfBnftItmPrdctOrSrvCdgUsrSltd(String.valueOf(explanationofbenefititemproductorservicecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemproductorservicecoding.hasSystem()) {
			e.setExplntnOfBnftItmPrdctOrSrvCdgSys(String.valueOf(explanationofbenefititemproductorservicecoding.getSystem()));
		}
		/******************** explanationofbenefititemmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemmodifier = explanationofbenefititem.getModifierFirstRep();

		/******************** ExplntnOfBnft_Itm_Mdfr_Txt ********************************************************************************/
		if(explanationofbenefititemmodifier.hasText()) {
			e.setExplntnOfBnftItmMdfrTxt(String.valueOf(explanationofbenefititemmodifier.getText()));
		}
		/******************** explanationofbenefititemmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemmodifiercoding = explanationofbenefititemmodifier.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemmodifiercoding.hasVersion()) {
			e.setExplntnOfBnftItmMdfrCdgVrsn(String.valueOf(explanationofbenefititemmodifiercoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemmodifiercoding.hasDisplay()) {
			e.setExplntnOfBnftItmMdfrCdgDsply(String.valueOf(explanationofbenefititemmodifiercoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemmodifiercoding.hasCode()) {
			e.setExplntnOfBnftItmMdfrCdgCd(String.valueOf(explanationofbenefititemmodifiercoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemmodifiercoding.hasUserSelected()) {
			e.setExplntnOfBnftItmMdfrCdgUsrSltd(String.valueOf(explanationofbenefititemmodifiercoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_Mdfr_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemmodifiercoding.hasSystem()) {
			e.setExplntnOfBnftItmMdfrCdgSys(String.valueOf(explanationofbenefititemmodifiercoding.getSystem()));
		}
		/******************** ExplntnOfBnft_Itm_Enc ********************************************************************************/
		if(explanationofbenefititem.hasEncounter()) {
			e.setExplntnOfBnftItmEnc(String.valueOf(explanationofbenefititem.getEncounterFirstRep()));
		}
		/******************** explanationofbenefititemprogramcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemprogramcode = explanationofbenefititem.getProgramCodeFirstRep();

		/******************** ExplntnOfBnft_Itm_PrgrmCd_Txt ********************************************************************************/
		if(explanationofbenefititemprogramcode.hasText()) {
			e.setExplntnOfBnftItmPrgrmCdTxt(String.valueOf(explanationofbenefititemprogramcode.getText()));
		}
		/******************** explanationofbenefititemprogramcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemprogramcodecoding = explanationofbenefititemprogramcode.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemprogramcodecoding.hasVersion()) {
			e.setExplntnOfBnftItmPrgrmCdCdgVrsn(String.valueOf(explanationofbenefititemprogramcodecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemprogramcodecoding.hasDisplay()) {
			e.setExplntnOfBnftItmPrgrmCdCdgDsply(String.valueOf(explanationofbenefititemprogramcodecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemprogramcodecoding.hasCode()) {
			e.setExplntnOfBnftItmPrgrmCdCdgCd(String.valueOf(explanationofbenefititemprogramcodecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemprogramcodecoding.hasUserSelected()) {
			e.setExplntnOfBnftItmPrgrmCdCdgUsrSltd(String.valueOf(explanationofbenefititemprogramcodecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemprogramcodecoding.hasSystem()) {
			e.setExplntnOfBnftItmPrgrmCdCdgSys(String.valueOf(explanationofbenefititemprogramcodecoding.getSystem()));
		}
		/******************** explanationofbenefititemlocationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemlocationcodeableconcept = explanationofbenefititem.getLocationCodeableConcept();

		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Txt ********************************************************************************/
		if(explanationofbenefititemlocationcodeableconcept.hasText()) {
			e.setExplntnOfBnftItmLctnCdbleCncptTxt(String.valueOf(explanationofbenefititemlocationcodeableconcept.getText()));
		}
		/******************** explanationofbenefititemlocationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemlocationcodeableconceptcoding = explanationofbenefititemlocationcodeableconcept.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemlocationcodeableconceptcoding.hasVersion()) {
			e.setExplntnOfBnftItmLctnCdbleCncptCdgVrsn(String.valueOf(explanationofbenefititemlocationcodeableconceptcoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemlocationcodeableconceptcoding.hasDisplay()) {
			e.setExplntnOfBnftItmLctnCdbleCncptCdgDsply(String.valueOf(explanationofbenefititemlocationcodeableconceptcoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemlocationcodeableconceptcoding.hasCode()) {
			e.setExplntnOfBnftItmLctnCdbleCncptCdgCd(String.valueOf(explanationofbenefititemlocationcodeableconceptcoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemlocationcodeableconceptcoding.hasUserSelected()) {
			e.setExplntnOfBnftItmLctnCdbleCncptCdgUsrSltd(String.valueOf(explanationofbenefititemlocationcodeableconceptcoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_LctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemlocationcodeableconceptcoding.hasSystem()) {
			e.setExplntnOfBnftItmLctnCdbleCncptCdgSys(String.valueOf(explanationofbenefititemlocationcodeableconceptcoding.getSystem()));
		}
		/******************** explanationofbenefititemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefititemquantity = explanationofbenefititem.getQuantity();

		/******************** ExplntnOfBnft_Itm_Qnty_Vl ********************************************************************************/
		if(explanationofbenefititemquantity.hasValue()) {
			e.setExplntnOfBnftItmQntyVl(String.valueOf(explanationofbenefititemquantity.getValue()));
		}
		/******************** explanationofbenefititemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator explanationofbenefititemquantitycomparator = explanationofbenefititemquantity.getComparator();
		e.setExplntnOfBnftItmQntyCmprtr(explanationofbenefititemquantitycomparator.toCode());

		/******************** ExplntnOfBnft_Itm_Qnty_Cd ********************************************************************************/
		if(explanationofbenefititemquantity.hasCode()) {
			e.setExplntnOfBnftItmQntyCd(String.valueOf(explanationofbenefititemquantity.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Qnty_Unt ********************************************************************************/
		if(explanationofbenefititemquantity.hasUnit()) {
			e.setExplntnOfBnftItmQntyUnt(String.valueOf(explanationofbenefititemquantity.getUnit()));
		}
		/******************** ExplntnOfBnft_Itm_Qnty_Sys ********************************************************************************/
		if(explanationofbenefititemquantity.hasSystem()) {
			e.setExplntnOfBnftItmQntySys(String.valueOf(explanationofbenefititemquantity.getSystem()));
		}
		/******************** explanationofbenefititemadjudication ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent explanationofbenefititemadjudication = explanationofbenefititem.getAdjudicationFirstRep();

		/******************** ExplntnOfBnft_Itm_Adjdctn_Vl ********************************************************************************/
		if(explanationofbenefititemadjudication.hasValue()) {
			e.setExplntnOfBnftItmAdjdctnVl(String.valueOf(explanationofbenefititemadjudication.getValue()));
		}
		/******************** explanationofbenefititemadjudicationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemadjudicationreason = explanationofbenefititemadjudication.getReason();

		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Txt ********************************************************************************/
		if(explanationofbenefititemadjudicationreason.hasText()) {
			e.setExplntnOfBnftItmAdjdctnRsnTxt(String.valueOf(explanationofbenefititemadjudicationreason.getText()));
		}
		/******************** explanationofbenefititemadjudicationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemadjudicationreasoncoding = explanationofbenefititemadjudicationreason.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemadjudicationreasoncoding.hasVersion()) {
			e.setExplntnOfBnftItmAdjdctnRsnCdgVrsn(String.valueOf(explanationofbenefititemadjudicationreasoncoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemadjudicationreasoncoding.hasDisplay()) {
			e.setExplntnOfBnftItmAdjdctnRsnCdgDsply(String.valueOf(explanationofbenefititemadjudicationreasoncoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemadjudicationreasoncoding.hasCode()) {
			e.setExplntnOfBnftItmAdjdctnRsnCdgCd(String.valueOf(explanationofbenefititemadjudicationreasoncoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemadjudicationreasoncoding.hasUserSelected()) {
			e.setExplntnOfBnftItmAdjdctnRsnCdgUsrSltd(String.valueOf(explanationofbenefititemadjudicationreasoncoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Rsn_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemadjudicationreasoncoding.hasSystem()) {
			e.setExplntnOfBnftItmAdjdctnRsnCdgSys(String.valueOf(explanationofbenefititemadjudicationreasoncoding.getSystem()));
		}
		/******************** explanationofbenefititemadjudicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemadjudicationcategory = explanationofbenefititemadjudication.getCategory();

		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefititemadjudicationcategory.hasText()) {
			e.setExplntnOfBnftItmAdjdctnCtgryTxt(String.valueOf(explanationofbenefititemadjudicationcategory.getText()));
		}
		/******************** explanationofbenefititemadjudicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemadjudicationcategorycoding = explanationofbenefititemadjudicationcategory.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemadjudicationcategorycoding.hasVersion()) {
			e.setExplntnOfBnftItmAdjdctnCtgryCdgVrsn(String.valueOf(explanationofbenefititemadjudicationcategorycoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemadjudicationcategorycoding.hasDisplay()) {
			e.setExplntnOfBnftItmAdjdctnCtgryCdgDsply(String.valueOf(explanationofbenefititemadjudicationcategorycoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemadjudicationcategorycoding.hasCode()) {
			e.setExplntnOfBnftItmAdjdctnCtgryCdgCd(String.valueOf(explanationofbenefititemadjudicationcategorycoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemadjudicationcategorycoding.hasUserSelected()) {
			e.setExplntnOfBnftItmAdjdctnCtgryCdgUsrSltd(String.valueOf(explanationofbenefititemadjudicationcategorycoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemadjudicationcategorycoding.hasSystem()) {
			e.setExplntnOfBnftItmAdjdctnCtgryCdgSys(String.valueOf(explanationofbenefititemadjudicationcategorycoding.getSystem()));
		}
		/******************** explanationofbenefititemadjudicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemadjudicationamount = explanationofbenefititemadjudication.getAmount();

		/******************** ExplntnOfBnft_Itm_Adjdctn_Amnt_Vl ********************************************************************************/
		if(explanationofbenefititemadjudicationamount.hasValue()) {
			e.setExplntnOfBnftItmAdjdctnAmntVl(String.valueOf(explanationofbenefititemadjudicationamount.getValue()));
		}
		/******************** ExplntnOfBnft_Itm_Adjdctn_Amnt_Crncy ********************************************************************************/
		if(explanationofbenefititemadjudicationamount.hasCurrency()) {
			e.setExplntnOfBnftItmAdjdctnAmntCrncy(String.valueOf(explanationofbenefititemadjudicationamount.getCurrency()));
		}
		/******************** explanationofbenefititemunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemunitprice = explanationofbenefititem.getUnitPrice();

		/******************** ExplntnOfBnft_Itm_UntPrice_Vl ********************************************************************************/
		if(explanationofbenefititemunitprice.hasValue()) {
			e.setExplntnOfBnftItmUntPriceVl(String.valueOf(explanationofbenefititemunitprice.getValue()));
		}
		/******************** ExplntnOfBnft_Itm_UntPrice_Crncy ********************************************************************************/
		if(explanationofbenefititemunitprice.hasCurrency()) {
			e.setExplntnOfBnftItmUntPriceCrncy(String.valueOf(explanationofbenefititemunitprice.getCurrency()));
		}
		/******************** ExplntnOfBnft_Itm_Factor ********************************************************************************/
		if(explanationofbenefititem.hasFactor()) {
			e.setExplntnOfBnftItmFactor(String.valueOf(explanationofbenefititem.getFactor()));
		}
		/******************** explanationofbenefititemnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefititemnet = explanationofbenefititem.getNet();

		/******************** ExplntnOfBnft_Itm_Net_Vl ********************************************************************************/
		if(explanationofbenefititemnet.hasValue()) {
			e.setExplntnOfBnftItmNetVl(String.valueOf(explanationofbenefititemnet.getValue()));
		}
		/******************** ExplntnOfBnft_Itm_Net_Crncy ********************************************************************************/
		if(explanationofbenefititemnet.hasCurrency()) {
			e.setExplntnOfBnftItmNetCrncy(String.valueOf(explanationofbenefititemnet.getCurrency()));
		}
		/******************** explanationofbenefititemservicedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefititemservicedperiod = explanationofbenefititem.getServicedPeriod();

		/******************** ExplntnOfBnft_Itm_SrvdPrd_Strt ********************************************************************************/
		if(explanationofbenefititemservicedperiod.hasStart()) {
			e.setExplntnOfBnftItmSrvdPrdStrt(String.valueOf(explanationofbenefititemservicedperiod.getStart()));
		}
		/******************** ExplntnOfBnft_Itm_SrvdPrd_End ********************************************************************************/
		if(explanationofbenefititemservicedperiod.hasEnd()) {
			e.setExplntnOfBnftItmSrvdPrdEnd(String.valueOf(explanationofbenefititemservicedperiod.getEnd()));
		}
		/******************** explanationofbenefititembodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititembodysite = explanationofbenefititem.getBodySite();

		/******************** ExplntnOfBnft_Itm_BodySite_Txt ********************************************************************************/
		if(explanationofbenefititembodysite.hasText()) {
			e.setExplntnOfBnftItmBodySiteTxt(String.valueOf(explanationofbenefititembodysite.getText()));
		}
		/******************** explanationofbenefititembodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititembodysitecoding = explanationofbenefititembodysite.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititembodysitecoding.hasVersion()) {
			e.setExplntnOfBnftItmBodySiteCdgVrsn(String.valueOf(explanationofbenefititembodysitecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititembodysitecoding.hasDisplay()) {
			e.setExplntnOfBnftItmBodySiteCdgDsply(String.valueOf(explanationofbenefititembodysitecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititembodysitecoding.hasCode()) {
			e.setExplntnOfBnftItmBodySiteCdgCd(String.valueOf(explanationofbenefititembodysitecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititembodysitecoding.hasUserSelected()) {
			e.setExplntnOfBnftItmBodySiteCdgUsrSltd(String.valueOf(explanationofbenefititembodysitecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_BodySite_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititembodysitecoding.hasSystem()) {
			e.setExplntnOfBnftItmBodySiteCdgSys(String.valueOf(explanationofbenefititembodysitecoding.getSystem()));
		}
		/******************** explanationofbenefititemcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemcategory = explanationofbenefititem.getCategory();

		/******************** ExplntnOfBnft_Itm_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefititemcategory.hasText()) {
			e.setExplntnOfBnftItmCtgryTxt(String.valueOf(explanationofbenefititemcategory.getText()));
		}
		/******************** explanationofbenefititemcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemcategorycoding = explanationofbenefititemcategory.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemcategorycoding.hasVersion()) {
			e.setExplntnOfBnftItmCtgryCdgVrsn(String.valueOf(explanationofbenefititemcategorycoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemcategorycoding.hasDisplay()) {
			e.setExplntnOfBnftItmCtgryCdgDsply(String.valueOf(explanationofbenefititemcategorycoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemcategorycoding.hasCode()) {
			e.setExplntnOfBnftItmCtgryCdgCd(String.valueOf(explanationofbenefititemcategorycoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemcategorycoding.hasUserSelected()) {
			e.setExplntnOfBnftItmCtgryCdgUsrSltd(String.valueOf(explanationofbenefititemcategorycoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemcategorycoding.hasSystem()) {
			e.setExplntnOfBnftItmCtgryCdgSys(String.valueOf(explanationofbenefititemcategorycoding.getSystem()));
		}
		/******************** ExplntnOfBnft_Itm_SrvdDtTyp ********************************************************************************/
		if(explanationofbenefititem.hasServicedDateType()) {
			e.setExplntnOfBnftItmSrvdDtTyp(String.valueOf(explanationofbenefititem.getServicedDateType()));
		}
		/******************** explanationofbenefititemrevenue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemrevenue = explanationofbenefititem.getRevenue();

		/******************** ExplntnOfBnft_Itm_Revenue_Txt ********************************************************************************/
		if(explanationofbenefititemrevenue.hasText()) {
			e.setExplntnOfBnftItmRevenueTxt(String.valueOf(explanationofbenefititemrevenue.getText()));
		}
		/******************** explanationofbenefititemrevenuecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemrevenuecoding = explanationofbenefititemrevenue.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemrevenuecoding.hasVersion()) {
			e.setExplntnOfBnftItmRevenueCdgVrsn(String.valueOf(explanationofbenefititemrevenuecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemrevenuecoding.hasDisplay()) {
			e.setExplntnOfBnftItmRevenueCdgDsply(String.valueOf(explanationofbenefititemrevenuecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemrevenuecoding.hasCode()) {
			e.setExplntnOfBnftItmRevenueCdgCd(String.valueOf(explanationofbenefititemrevenuecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemrevenuecoding.hasUserSelected()) {
			e.setExplntnOfBnftItmRevenueCdgUsrSltd(String.valueOf(explanationofbenefititemrevenuecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_Revenue_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemrevenuecoding.hasSystem()) {
			e.setExplntnOfBnftItmRevenueCdgSys(String.valueOf(explanationofbenefititemrevenuecoding.getSystem()));
		}
		/******************** ExplntnOfBnft_Itm_Udi ********************************************************************************/
		if(explanationofbenefititem.hasUdi()) {
			e.setExplntnOfBnftItmUdi(String.valueOf(explanationofbenefititem.getUdiFirstRep()));
		}
		/******************** explanationofbenefititemsubsite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefititemsubsite = explanationofbenefititem.getSubSiteFirstRep();

		/******************** ExplntnOfBnft_Itm_SubSite_Txt ********************************************************************************/
		if(explanationofbenefititemsubsite.hasText()) {
			e.setExplntnOfBnftItmSubSiteTxt(String.valueOf(explanationofbenefititemsubsite.getText()));
		}
		/******************** explanationofbenefititemsubsitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefititemsubsitecoding = explanationofbenefititemsubsite.getCodingFirstRep();

		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefititemsubsitecoding.hasVersion()) {
			e.setExplntnOfBnftItmSubSiteCdgVrsn(String.valueOf(explanationofbenefititemsubsitecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefititemsubsitecoding.hasDisplay()) {
			e.setExplntnOfBnftItmSubSiteCdgDsply(String.valueOf(explanationofbenefititemsubsitecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_Cd ********************************************************************************/
		if(explanationofbenefititemsubsitecoding.hasCode()) {
			e.setExplntnOfBnftItmSubSiteCdgCd(String.valueOf(explanationofbenefititemsubsitecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefititemsubsitecoding.hasUserSelected()) {
			e.setExplntnOfBnftItmSubSiteCdgUsrSltd(String.valueOf(explanationofbenefititemsubsitecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Itm_SubSite_Cdg_Sys ********************************************************************************/
		if(explanationofbenefititemsubsitecoding.hasSystem()) {
			e.setExplntnOfBnftItmSubSiteCdgSys(String.valueOf(explanationofbenefititemsubsitecoding.getSystem()));
		}
		/******************** explanationofbenefitpayee ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.PayeeComponent explanationofbenefitpayee = explanationofbenefit.getPayee();

		/******************** explanationofbenefitpayeetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitpayeetype = explanationofbenefitpayee.getType();

		/******************** ExplntnOfBnft_Payee_Typ_Txt ********************************************************************************/
		if(explanationofbenefitpayeetype.hasText()) {
			e.setExplntnOfBnftPayeeTypTxt(String.valueOf(explanationofbenefitpayeetype.getText()));
		}
		/******************** explanationofbenefitpayeetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitpayeetypecoding = explanationofbenefitpayeetype.getCodingFirstRep();

		/******************** ExplntnOfBnft_Payee_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitpayeetypecoding.hasVersion()) {
			e.setExplntnOfBnftPayeeTypCdgVrsn(String.valueOf(explanationofbenefitpayeetypecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Payee_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitpayeetypecoding.hasDisplay()) {
			e.setExplntnOfBnftPayeeTypCdgDsply(String.valueOf(explanationofbenefitpayeetypecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Payee_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitpayeetypecoding.hasCode()) {
			e.setExplntnOfBnftPayeeTypCdgCd(String.valueOf(explanationofbenefitpayeetypecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Payee_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitpayeetypecoding.hasUserSelected()) {
			e.setExplntnOfBnftPayeeTypCdgUsrSltd(String.valueOf(explanationofbenefitpayeetypecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Payee_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitpayeetypecoding.hasSystem()) {
			e.setExplntnOfBnftPayeeTypCdgSys(String.valueOf(explanationofbenefitpayeetypecoding.getSystem()));
		}
		/******************** ExplntnOfBnft_Payee_Party ********************************************************************************/
		if(explanationofbenefitpayee.hasParty()) {
			e.setExplntnOfBnftPayeeParty(String.valueOf(explanationofbenefitpayee.getParty()));
		}
		/******************** explanationofbenefitpayment ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.PaymentComponent explanationofbenefitpayment = explanationofbenefit.getPayment();

		/******************** explanationofbenefitpaymenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitpaymenttype = explanationofbenefitpayment.getType();

		/******************** ExplntnOfBnft_Pymnt_Typ_Txt ********************************************************************************/
		if(explanationofbenefitpaymenttype.hasText()) {
			e.setExplntnOfBnftPymntTypTxt(String.valueOf(explanationofbenefitpaymenttype.getText()));
		}
		/******************** explanationofbenefitpaymenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitpaymenttypecoding = explanationofbenefitpaymenttype.getCodingFirstRep();

		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitpaymenttypecoding.hasVersion()) {
			e.setExplntnOfBnftPymntTypCdgVrsn(String.valueOf(explanationofbenefitpaymenttypecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitpaymenttypecoding.hasDisplay()) {
			e.setExplntnOfBnftPymntTypCdgDsply(String.valueOf(explanationofbenefitpaymenttypecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitpaymenttypecoding.hasCode()) {
			e.setExplntnOfBnftPymntTypCdgCd(String.valueOf(explanationofbenefitpaymenttypecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitpaymenttypecoding.hasUserSelected()) {
			e.setExplntnOfBnftPymntTypCdgUsrSltd(String.valueOf(explanationofbenefitpaymenttypecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Pymnt_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitpaymenttypecoding.hasSystem()) {
			e.setExplntnOfBnftPymntTypCdgSys(String.valueOf(explanationofbenefitpaymenttypecoding.getSystem()));
		}
		/******************** ExplntnOfBnft_Pymnt_Dt ********************************************************************************/
		if(explanationofbenefitpayment.hasDate()) {
			e.setExplntnOfBnftPymntDt(String.valueOf(explanationofbenefitpayment.getDate()));
		}
		/******************** explanationofbenefitpaymentidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier explanationofbenefitpaymentidentifier = explanationofbenefitpayment.getIdentifier();

		/******************** ExplntnOfBnft_Pymnt_Id_Vl ********************************************************************************/
		if(explanationofbenefitpaymentidentifier.hasValue()) {
			e.setExplntnOfBnftPymntIdVl(String.valueOf(explanationofbenefitpaymentidentifier.getValue()));
		}
		/******************** explanationofbenefitpaymentidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitpaymentidentifiertype = explanationofbenefitpaymentidentifier.getType();

		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Txt ********************************************************************************/
		if(explanationofbenefitpaymentidentifiertype.hasText()) {
			e.setExplntnOfBnftPymntIdTypTxt(String.valueOf(explanationofbenefitpaymentidentifiertype.getText()));
		}
		/******************** explanationofbenefitpaymentidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitpaymentidentifiertypecoding = explanationofbenefitpaymentidentifiertype.getCodingFirstRep();

		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitpaymentidentifiertypecoding.hasVersion()) {
			e.setExplntnOfBnftPymntIdTypCdgVrsn(String.valueOf(explanationofbenefitpaymentidentifiertypecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitpaymentidentifiertypecoding.hasDisplay()) {
			e.setExplntnOfBnftPymntIdTypCdgDsply(String.valueOf(explanationofbenefitpaymentidentifiertypecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitpaymentidentifiertypecoding.hasCode()) {
			e.setExplntnOfBnftPymntIdTypCdgCd(String.valueOf(explanationofbenefitpaymentidentifiertypecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitpaymentidentifiertypecoding.hasUserSelected()) {
			e.setExplntnOfBnftPymntIdTypCdgUsrSltd(String.valueOf(explanationofbenefitpaymentidentifiertypecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitpaymentidentifiertypecoding.hasSystem()) {
			e.setExplntnOfBnftPymntIdTypCdgSys(String.valueOf(explanationofbenefitpaymentidentifiertypecoding.getSystem()));
		}
		/******************** explanationofbenefitpaymentidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitpaymentidentifierperiod = explanationofbenefitpaymentidentifier.getPeriod();

		/******************** ExplntnOfBnft_Pymnt_Id_Prd_Strt ********************************************************************************/
		if(explanationofbenefitpaymentidentifierperiod.hasStart()) {
			e.setExplntnOfBnftPymntIdPrdStrt(String.valueOf(explanationofbenefitpaymentidentifierperiod.getStart()));
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Prd_End ********************************************************************************/
		if(explanationofbenefitpaymentidentifierperiod.hasEnd()) {
			e.setExplntnOfBnftPymntIdPrdEnd(String.valueOf(explanationofbenefitpaymentidentifierperiod.getEnd()));
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Assigner ********************************************************************************/
		if(explanationofbenefitpaymentidentifier.hasAssigner()) {
			e.setExplntnOfBnftPymntIdAssigner(String.valueOf(explanationofbenefitpaymentidentifier.getAssigner()));
		}
		/******************** ExplntnOfBnft_Pymnt_Id_Sys ********************************************************************************/
		if(explanationofbenefitpaymentidentifier.hasSystem()) {
			e.setExplntnOfBnftPymntIdSys(String.valueOf(explanationofbenefitpaymentidentifier.getSystem()));
		}
		/******************** explanationofbenefitpaymentidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse explanationofbenefitpaymentidentifieruse = explanationofbenefitpaymentidentifier.getUse();
		e.setExplntnOfBnftPymntIdUse(explanationofbenefitpaymentidentifieruse.toCode());

		/******************** explanationofbenefitpaymentadjustment ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitpaymentadjustment = explanationofbenefitpayment.getAdjustment();

		/******************** ExplntnOfBnft_Pymnt_Adjustment_Vl ********************************************************************************/
		if(explanationofbenefitpaymentadjustment.hasValue()) {
			e.setExplntnOfBnftPymntAdjustmentVl(String.valueOf(explanationofbenefitpaymentadjustment.getValue()));
		}
		/******************** ExplntnOfBnft_Pymnt_Adjustment_Crncy ********************************************************************************/
		if(explanationofbenefitpaymentadjustment.hasCurrency()) {
			e.setExplntnOfBnftPymntAdjustmentCrncy(String.valueOf(explanationofbenefitpaymentadjustment.getCurrency()));
		}
		/******************** explanationofbenefitpaymentadjustmentreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitpaymentadjustmentreason = explanationofbenefitpayment.getAdjustmentReason();

		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Txt ********************************************************************************/
		if(explanationofbenefitpaymentadjustmentreason.hasText()) {
			e.setExplntnOfBnftPymntAdjustmentRsnTxt(String.valueOf(explanationofbenefitpaymentadjustmentreason.getText()));
		}
		/******************** explanationofbenefitpaymentadjustmentreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitpaymentadjustmentreasoncoding = explanationofbenefitpaymentadjustmentreason.getCodingFirstRep();

		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitpaymentadjustmentreasoncoding.hasVersion()) {
			e.setExplntnOfBnftPymntAdjustmentRsnCdgVrsn(String.valueOf(explanationofbenefitpaymentadjustmentreasoncoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitpaymentadjustmentreasoncoding.hasDisplay()) {
			e.setExplntnOfBnftPymntAdjustmentRsnCdgDsply(String.valueOf(explanationofbenefitpaymentadjustmentreasoncoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitpaymentadjustmentreasoncoding.hasCode()) {
			e.setExplntnOfBnftPymntAdjustmentRsnCdgCd(String.valueOf(explanationofbenefitpaymentadjustmentreasoncoding.getCode()));
		}
		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitpaymentadjustmentreasoncoding.hasUserSelected()) {
			e.setExplntnOfBnftPymntAdjustmentRsnCdgUsrSltd(String.valueOf(explanationofbenefitpaymentadjustmentreasoncoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Pymnt_AdjustmentRsn_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitpaymentadjustmentreasoncoding.hasSystem()) {
			e.setExplntnOfBnftPymntAdjustmentRsnCdgSys(String.valueOf(explanationofbenefitpaymentadjustmentreasoncoding.getSystem()));
		}
		/******************** explanationofbenefitpaymentamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money explanationofbenefitpaymentamount = explanationofbenefitpayment.getAmount();

		/******************** ExplntnOfBnft_Pymnt_Amnt_Vl ********************************************************************************/
		if(explanationofbenefitpaymentamount.hasValue()) {
			e.setExplntnOfBnftPymntAmntVl(String.valueOf(explanationofbenefitpaymentamount.getValue()));
		}
		/******************** ExplntnOfBnft_Pymnt_Amnt_Crncy ********************************************************************************/
		if(explanationofbenefitpaymentamount.hasCurrency()) {
			e.setExplntnOfBnftPymntAmntCrncy(String.valueOf(explanationofbenefitpaymentamount.getCurrency()));
		}
		/******************** explanationofbenefitdiagnosis ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.DiagnosisComponent explanationofbenefitdiagnosis = explanationofbenefit.getDiagnosisFirstRep();

		/******************** ExplntnOfBnft_Dgnsis_Sqnc ********************************************************************************/
		if(explanationofbenefitdiagnosis.hasSequence()) {
			e.setExplntnOfBnftDgnsisSqnc(String.valueOf(explanationofbenefitdiagnosis.getSequence()));
		}
		/******************** explanationofbenefitdiagnosistype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitdiagnosistype = explanationofbenefitdiagnosis.getTypeFirstRep();

		/******************** ExplntnOfBnft_Dgnsis_Typ_Txt ********************************************************************************/
		if(explanationofbenefitdiagnosistype.hasText()) {
			e.setExplntnOfBnftDgnsisTypTxt(String.valueOf(explanationofbenefitdiagnosistype.getText()));
		}
		/******************** explanationofbenefitdiagnosistypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitdiagnosistypecoding = explanationofbenefitdiagnosistype.getCodingFirstRep();

		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitdiagnosistypecoding.hasVersion()) {
			e.setExplntnOfBnftDgnsisTypCdgVrsn(String.valueOf(explanationofbenefitdiagnosistypecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitdiagnosistypecoding.hasDisplay()) {
			e.setExplntnOfBnftDgnsisTypCdgDsply(String.valueOf(explanationofbenefitdiagnosistypecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitdiagnosistypecoding.hasCode()) {
			e.setExplntnOfBnftDgnsisTypCdgCd(String.valueOf(explanationofbenefitdiagnosistypecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitdiagnosistypecoding.hasUserSelected()) {
			e.setExplntnOfBnftDgnsisTypCdgUsrSltd(String.valueOf(explanationofbenefitdiagnosistypecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Dgnsis_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitdiagnosistypecoding.hasSystem()) {
			e.setExplntnOfBnftDgnsisTypCdgSys(String.valueOf(explanationofbenefitdiagnosistypecoding.getSystem()));
		}
		/******************** explanationofbenefitdiagnosisdiagnosiscodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitdiagnosisdiagnosiscodeableconcept = explanationofbenefitdiagnosis.getDiagnosisCodeableConcept();

		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Txt ********************************************************************************/
		if(explanationofbenefitdiagnosisdiagnosiscodeableconcept.hasText()) {
			e.setExplntnOfBnftDgnsisDgnsisCdbleCncptTxt(String.valueOf(explanationofbenefitdiagnosisdiagnosiscodeableconcept.getText()));
		}
		/******************** explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding = explanationofbenefitdiagnosisdiagnosiscodeableconcept.getCodingFirstRep();

		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.hasVersion()) {
			e.setExplntnOfBnftDgnsisDgnsisCdbleCncptCdgVrsn(String.valueOf(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.hasDisplay()) {
			e.setExplntnOfBnftDgnsisDgnsisCdbleCncptCdgDsply(String.valueOf(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.hasCode()) {
			e.setExplntnOfBnftDgnsisDgnsisCdbleCncptCdgCd(String.valueOf(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.getCode()));
		}
		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.hasUserSelected()) {
			e.setExplntnOfBnftDgnsisDgnsisCdbleCncptCdgUsrSltd(String.valueOf(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Dgnsis_DgnsisCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.hasSystem()) {
			e.setExplntnOfBnftDgnsisDgnsisCdbleCncptCdgSys(String.valueOf(explanationofbenefitdiagnosisdiagnosiscodeableconceptcoding.getSystem()));
		}
		/******************** explanationofbenefitdiagnosispackagecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitdiagnosispackagecode = explanationofbenefitdiagnosis.getPackageCode();

		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Txt ********************************************************************************/
		if(explanationofbenefitdiagnosispackagecode.hasText()) {
			e.setExplntnOfBnftDgnsisPckgCdTxt(String.valueOf(explanationofbenefitdiagnosispackagecode.getText()));
		}
		/******************** explanationofbenefitdiagnosispackagecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitdiagnosispackagecodecoding = explanationofbenefitdiagnosispackagecode.getCodingFirstRep();

		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitdiagnosispackagecodecoding.hasVersion()) {
			e.setExplntnOfBnftDgnsisPckgCdCdgVrsn(String.valueOf(explanationofbenefitdiagnosispackagecodecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitdiagnosispackagecodecoding.hasDisplay()) {
			e.setExplntnOfBnftDgnsisPckgCdCdgDsply(String.valueOf(explanationofbenefitdiagnosispackagecodecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitdiagnosispackagecodecoding.hasCode()) {
			e.setExplntnOfBnftDgnsisPckgCdCdgCd(String.valueOf(explanationofbenefitdiagnosispackagecodecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitdiagnosispackagecodecoding.hasUserSelected()) {
			e.setExplntnOfBnftDgnsisPckgCdCdgUsrSltd(String.valueOf(explanationofbenefitdiagnosispackagecodecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Dgnsis_PckgCd_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitdiagnosispackagecodecoding.hasSystem()) {
			e.setExplntnOfBnftDgnsisPckgCdCdgSys(String.valueOf(explanationofbenefitdiagnosispackagecodecoding.getSystem()));
		}
		/******************** explanationofbenefitdiagnosisonadmission ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitdiagnosisonadmission = explanationofbenefitdiagnosis.getOnAdmission();

		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Txt ********************************************************************************/
		if(explanationofbenefitdiagnosisonadmission.hasText()) {
			e.setExplntnOfBnftDgnsisOnAdmissionTxt(String.valueOf(explanationofbenefitdiagnosisonadmission.getText()));
		}
		/******************** explanationofbenefitdiagnosisonadmissioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitdiagnosisonadmissioncoding = explanationofbenefitdiagnosisonadmission.getCodingFirstRep();

		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitdiagnosisonadmissioncoding.hasVersion()) {
			e.setExplntnOfBnftDgnsisOnAdmissionCdgVrsn(String.valueOf(explanationofbenefitdiagnosisonadmissioncoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitdiagnosisonadmissioncoding.hasDisplay()) {
			e.setExplntnOfBnftDgnsisOnAdmissionCdgDsply(String.valueOf(explanationofbenefitdiagnosisonadmissioncoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitdiagnosisonadmissioncoding.hasCode()) {
			e.setExplntnOfBnftDgnsisOnAdmissionCdgCd(String.valueOf(explanationofbenefitdiagnosisonadmissioncoding.getCode()));
		}
		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitdiagnosisonadmissioncoding.hasUserSelected()) {
			e.setExplntnOfBnftDgnsisOnAdmissionCdgUsrSltd(String.valueOf(explanationofbenefitdiagnosisonadmissioncoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Dgnsis_OnAdmission_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitdiagnosisonadmissioncoding.hasSystem()) {
			e.setExplntnOfBnftDgnsisOnAdmissionCdgSys(String.valueOf(explanationofbenefitdiagnosisonadmissioncoding.getSystem()));
		}
		/******************** explanationofbenefitsupportinginfo ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.SupportingInformationComponent explanationofbenefitsupportinginfo = explanationofbenefit.getSupportingInfoFirstRep();

		/******************** explanationofbenefitsupportinginforeason ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitsupportinginforeason = explanationofbenefitsupportinginfo.getReason();

		/******************** ExplntnOfBnft_SprtingInfo_Rsn_Vrsn ********************************************************************************/
		if(explanationofbenefitsupportinginforeason.hasVersion()) {
			e.setExplntnOfBnftSprtingInfoRsnVrsn(String.valueOf(explanationofbenefitsupportinginforeason.getVersion()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_Rsn_Dsply ********************************************************************************/
		if(explanationofbenefitsupportinginforeason.hasDisplay()) {
			e.setExplntnOfBnftSprtingInfoRsnDsply(String.valueOf(explanationofbenefitsupportinginforeason.getDisplay()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_Rsn_Cd ********************************************************************************/
		if(explanationofbenefitsupportinginforeason.hasCode()) {
			e.setExplntnOfBnftSprtingInfoRsnCd(String.valueOf(explanationofbenefitsupportinginforeason.getCode()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_Rsn_UsrSltd ********************************************************************************/
		if(explanationofbenefitsupportinginforeason.hasUserSelected()) {
			e.setExplntnOfBnftSprtingInfoRsnUsrSltd(String.valueOf(explanationofbenefitsupportinginforeason.getUserSelected()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_Rsn_Sys ********************************************************************************/
		if(explanationofbenefitsupportinginforeason.hasSystem()) {
			e.setExplntnOfBnftSprtingInfoRsnSys(String.valueOf(explanationofbenefitsupportinginforeason.getSystem()));
		}
		/******************** explanationofbenefitsupportinginfocode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitsupportinginfocode = explanationofbenefitsupportinginfo.getCode();

		/******************** ExplntnOfBnft_SprtingInfo_Cd_Txt ********************************************************************************/
		if(explanationofbenefitsupportinginfocode.hasText()) {
			e.setExplntnOfBnftSprtingInfoCdTxt(String.valueOf(explanationofbenefitsupportinginfocode.getText()));
		}
		/******************** explanationofbenefitsupportinginfocodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitsupportinginfocodecoding = explanationofbenefitsupportinginfocode.getCodingFirstRep();

		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitsupportinginfocodecoding.hasVersion()) {
			e.setExplntnOfBnftSprtingInfoCdCdgVrsn(String.valueOf(explanationofbenefitsupportinginfocodecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitsupportinginfocodecoding.hasDisplay()) {
			e.setExplntnOfBnftSprtingInfoCdCdgDsply(String.valueOf(explanationofbenefitsupportinginfocodecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitsupportinginfocodecoding.hasCode()) {
			e.setExplntnOfBnftSprtingInfoCdCdgCd(String.valueOf(explanationofbenefitsupportinginfocodecoding.getCode()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitsupportinginfocodecoding.hasUserSelected()) {
			e.setExplntnOfBnftSprtingInfoCdCdgUsrSltd(String.valueOf(explanationofbenefitsupportinginfocodecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_Cd_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitsupportinginfocodecoding.hasSystem()) {
			e.setExplntnOfBnftSprtingInfoCdCdgSys(String.valueOf(explanationofbenefitsupportinginfocodecoding.getSystem()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlBooleanTyp ********************************************************************************/
		if(explanationofbenefitsupportinginfo.hasValueBooleanType()) {
			e.setExplntnOfBnftSprtingInfoVlBooleanTyp(String.valueOf(explanationofbenefitsupportinginfo.getValueBooleanType()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_Sqnc ********************************************************************************/
		if(explanationofbenefitsupportinginfo.hasSequence()) {
			e.setExplntnOfBnftSprtingInfoSqnc(String.valueOf(explanationofbenefitsupportinginfo.getSequence()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_TmgDtTyp ********************************************************************************/
		if(explanationofbenefitsupportinginfo.hasTimingDateType()) {
			e.setExplntnOfBnftSprtingInfoTmgDtTyp(String.valueOf(explanationofbenefitsupportinginfo.getTimingDateType()));
		}
		/******************** explanationofbenefitsupportinginfovaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity explanationofbenefitsupportinginfovaluequantity = explanationofbenefitsupportinginfo.getValueQuantity();

		/******************** ExplntnOfBnft_SprtingInfo_VlQnty_Vl ********************************************************************************/
		if(explanationofbenefitsupportinginfovaluequantity.hasValue()) {
			e.setExplntnOfBnftSprtingInfoVlQntyVl(String.valueOf(explanationofbenefitsupportinginfovaluequantity.getValue()));
		}
		/******************** explanationofbenefitsupportinginfovaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator explanationofbenefitsupportinginfovaluequantitycomparator = explanationofbenefitsupportinginfovaluequantity.getComparator();
		e.setExplntnOfBnftSprtingInfoVlQntyCmprtr(explanationofbenefitsupportinginfovaluequantitycomparator.toCode());

		/******************** ExplntnOfBnft_SprtingInfo_VlQnty_Cd ********************************************************************************/
		if(explanationofbenefitsupportinginfovaluequantity.hasCode()) {
			e.setExplntnOfBnftSprtingInfoVlQntyCd(String.valueOf(explanationofbenefitsupportinginfovaluequantity.getCode()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlQnty_Unt ********************************************************************************/
		if(explanationofbenefitsupportinginfovaluequantity.hasUnit()) {
			e.setExplntnOfBnftSprtingInfoVlQntyUnt(String.valueOf(explanationofbenefitsupportinginfovaluequantity.getUnit()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlQnty_Sys ********************************************************************************/
		if(explanationofbenefitsupportinginfovaluequantity.hasSystem()) {
			e.setExplntnOfBnftSprtingInfoVlQntySys(String.valueOf(explanationofbenefitsupportinginfovaluequantity.getSystem()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlStrgTyp ********************************************************************************/
		if(explanationofbenefitsupportinginfo.hasValueStringType()) {
			e.setExplntnOfBnftSprtingInfoVlStrgTyp(String.valueOf(explanationofbenefitsupportinginfo.getValueStringType()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlRfrnc ********************************************************************************/
		if(explanationofbenefitsupportinginfo.hasValueReference()) {
			e.setExplntnOfBnftSprtingInfoVlRfrnc(String.valueOf(explanationofbenefitsupportinginfo.getValueReference()));
		}
		/******************** explanationofbenefitsupportinginfovalueattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment explanationofbenefitsupportinginfovalueattachment = explanationofbenefitsupportinginfo.getValueAttachment();

		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Sz ********************************************************************************/
		if(explanationofbenefitsupportinginfovalueattachment.hasSize()) {
			e.setExplntnOfBnftSprtingInfoVlAttchmntSz(String.valueOf(explanationofbenefitsupportinginfovalueattachment.getSize()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Lnguage ********************************************************************************/
		if(explanationofbenefitsupportinginfovalueattachment.hasLanguage()) {
			e.setExplntnOfBnftSprtingInfoVlAttchmntLnguage(String.valueOf(explanationofbenefitsupportinginfovalueattachment.getLanguage()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_CntntTyp ********************************************************************************/
		if(explanationofbenefitsupportinginfovalueattachment.hasContentType()) {
			e.setExplntnOfBnftSprtingInfoVlAttchmntCntntTyp(String.valueOf(explanationofbenefitsupportinginfovalueattachment.getContentType()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Ttl ********************************************************************************/
		if(explanationofbenefitsupportinginfovalueattachment.hasTitle()) {
			e.setExplntnOfBnftSprtingInfoVlAttchmntTtl(String.valueOf(explanationofbenefitsupportinginfovalueattachment.getTitle()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Url ********************************************************************************/
		if(explanationofbenefitsupportinginfovalueattachment.hasUrl()) {
			e.setExplntnOfBnftSprtingInfoVlAttchmntUrl(String.valueOf(explanationofbenefitsupportinginfovalueattachment.getUrl()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Data ********************************************************************************/
		if(explanationofbenefitsupportinginfovalueattachment.hasData()) {
			e.setExplntnOfBnftSprtingInfoVlAttchmntData(String.valueOf(explanationofbenefitsupportinginfovalueattachment.getData()));
		}

		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Hash ********************************************************************************/
		if(explanationofbenefitsupportinginfovalueattachment.hasHash()) {
			e.setExplntnOfBnftSprtingInfoVlAttchmntHash(String.valueOf(explanationofbenefitsupportinginfovalueattachment.getHash()));
		}

		/******************** ExplntnOfBnft_SprtingInfo_VlAttchmnt_Creation ********************************************************************************/
		if(explanationofbenefitsupportinginfovalueattachment.hasCreation()) {
			e.setExplntnOfBnftSprtingInfoVlAttchmntCreation(String.valueOf(explanationofbenefitsupportinginfovalueattachment.getCreation()));
		}
		/******************** explanationofbenefitsupportinginfocategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitsupportinginfocategory = explanationofbenefitsupportinginfo.getCategory();

		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Txt ********************************************************************************/
		if(explanationofbenefitsupportinginfocategory.hasText()) {
			e.setExplntnOfBnftSprtingInfoCtgryTxt(String.valueOf(explanationofbenefitsupportinginfocategory.getText()));
		}
		/******************** explanationofbenefitsupportinginfocategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitsupportinginfocategorycoding = explanationofbenefitsupportinginfocategory.getCodingFirstRep();

		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitsupportinginfocategorycoding.hasVersion()) {
			e.setExplntnOfBnftSprtingInfoCtgryCdgVrsn(String.valueOf(explanationofbenefitsupportinginfocategorycoding.getVersion()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitsupportinginfocategorycoding.hasDisplay()) {
			e.setExplntnOfBnftSprtingInfoCtgryCdgDsply(String.valueOf(explanationofbenefitsupportinginfocategorycoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitsupportinginfocategorycoding.hasCode()) {
			e.setExplntnOfBnftSprtingInfoCtgryCdgCd(String.valueOf(explanationofbenefitsupportinginfocategorycoding.getCode()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitsupportinginfocategorycoding.hasUserSelected()) {
			e.setExplntnOfBnftSprtingInfoCtgryCdgUsrSltd(String.valueOf(explanationofbenefitsupportinginfocategorycoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_Ctgry_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitsupportinginfocategorycoding.hasSystem()) {
			e.setExplntnOfBnftSprtingInfoCtgryCdgSys(String.valueOf(explanationofbenefitsupportinginfocategorycoding.getSystem()));
		}
		/******************** explanationofbenefitsupportinginfotimingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitsupportinginfotimingperiod = explanationofbenefitsupportinginfo.getTimingPeriod();

		/******************** ExplntnOfBnft_SprtingInfo_TmgPrd_Strt ********************************************************************************/
		if(explanationofbenefitsupportinginfotimingperiod.hasStart()) {
			e.setExplntnOfBnftSprtingInfoTmgPrdStrt(String.valueOf(explanationofbenefitsupportinginfotimingperiod.getStart()));
		}
		/******************** ExplntnOfBnft_SprtingInfo_TmgPrd_End ********************************************************************************/
		if(explanationofbenefitsupportinginfotimingperiod.hasEnd()) {
			e.setExplntnOfBnftSprtingInfoTmgPrdEnd(String.valueOf(explanationofbenefitsupportinginfotimingperiod.getEnd()));
		}
		/******************** explanationofbenefitinsurance ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.InsuranceComponent explanationofbenefitinsurance = explanationofbenefit.getInsuranceFirstRep();

		/******************** ExplntnOfBnft_Insrnc_Cvg ********************************************************************************/
		if(explanationofbenefitinsurance.hasCoverage()) {
			e.setExplntnOfBnftInsrncCvg(String.valueOf(explanationofbenefitinsurance.getCoverage()));
		}
		/******************** ExplntnOfBnft_Insrnc_Focal ********************************************************************************/
		if(explanationofbenefitinsurance.hasFocal()) {
			e.setExplntnOfBnftInsrncFocal(String.valueOf(explanationofbenefitinsurance.getFocal()));
		}
		/******************** explanationofbenefitidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier explanationofbenefitidentifier = explanationofbenefit.getIdentifierFirstRep();

		/******************** ExplntnOfBnft_Id_Vl ********************************************************************************/
		if(explanationofbenefitidentifier.hasValue()) {
			e.setExplntnOfBnftIdVl(String.valueOf(explanationofbenefitidentifier.getValue()));
		}
		/******************** explanationofbenefitidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitidentifiertype = explanationofbenefitidentifier.getType();

		/******************** ExplntnOfBnft_Id_Typ_Txt ********************************************************************************/
		if(explanationofbenefitidentifiertype.hasText()) {
			e.setExplntnOfBnftIdTypTxt(String.valueOf(explanationofbenefitidentifiertype.getText()));
		}
		/******************** explanationofbenefitidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitidentifiertypecoding = explanationofbenefitidentifiertype.getCodingFirstRep();

		/******************** ExplntnOfBnft_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitidentifiertypecoding.hasVersion()) {
			e.setExplntnOfBnftIdTypCdgVrsn(String.valueOf(explanationofbenefitidentifiertypecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitidentifiertypecoding.hasDisplay()) {
			e.setExplntnOfBnftIdTypCdgDsply(String.valueOf(explanationofbenefitidentifiertypecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_Id_Typ_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitidentifiertypecoding.hasCode()) {
			e.setExplntnOfBnftIdTypCdgCd(String.valueOf(explanationofbenefitidentifiertypecoding.getCode()));
		}
		/******************** ExplntnOfBnft_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitidentifiertypecoding.hasUserSelected()) {
			e.setExplntnOfBnftIdTypCdgUsrSltd(String.valueOf(explanationofbenefitidentifiertypecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_Id_Typ_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitidentifiertypecoding.hasSystem()) {
			e.setExplntnOfBnftIdTypCdgSys(String.valueOf(explanationofbenefitidentifiertypecoding.getSystem()));
		}
		/******************** explanationofbenefitidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period explanationofbenefitidentifierperiod = explanationofbenefitidentifier.getPeriod();

		/******************** ExplntnOfBnft_Id_Prd_Strt ********************************************************************************/
		if(explanationofbenefitidentifierperiod.hasStart()) {
			e.setExplntnOfBnftIdPrdStrt(String.valueOf(explanationofbenefitidentifierperiod.getStart()));
		}
		/******************** ExplntnOfBnft_Id_Prd_End ********************************************************************************/
		if(explanationofbenefitidentifierperiod.hasEnd()) {
			e.setExplntnOfBnftIdPrdEnd(String.valueOf(explanationofbenefitidentifierperiod.getEnd()));
		}
		/******************** ExplntnOfBnft_Id_Assigner ********************************************************************************/
		if(explanationofbenefitidentifier.hasAssigner()) {
			e.setExplntnOfBnftIdAssigner(String.valueOf(explanationofbenefitidentifier.getAssigner()));
		}
		/******************** ExplntnOfBnft_Id_Sys ********************************************************************************/
		if(explanationofbenefitidentifier.hasSystem()) {
			e.setExplntnOfBnftIdSys(String.valueOf(explanationofbenefitidentifier.getSystem()));
		}
		/******************** explanationofbenefitidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse explanationofbenefitidentifieruse = explanationofbenefitidentifier.getUse();
		e.setExplntnOfBnftIdUse(explanationofbenefitidentifieruse.toCode());

		/******************** explanationofbenefitprocessnote ********************************************************************************/
		org.hl7.fhir.r4.model.ExplanationOfBenefit.NoteComponent explanationofbenefitprocessnote = explanationofbenefit.getProcessNoteFirstRep();

		/******************** explanationofbenefitprocessnotetype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.NoteType explanationofbenefitprocessnotetype = explanationofbenefitprocessnote.getType();
		e.setExplntnOfBnftProcessNtTyp(explanationofbenefitprocessnotetype.toCode());

		/******************** explanationofbenefitprocessnotelanguage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept explanationofbenefitprocessnotelanguage = explanationofbenefitprocessnote.getLanguage();

		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Txt ********************************************************************************/
		if(explanationofbenefitprocessnotelanguage.hasText()) {
			e.setExplntnOfBnftProcessNtLnguageTxt(String.valueOf(explanationofbenefitprocessnotelanguage.getText()));
		}
		/******************** explanationofbenefitprocessnotelanguagecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding explanationofbenefitprocessnotelanguagecoding = explanationofbenefitprocessnotelanguage.getCodingFirstRep();

		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(explanationofbenefitprocessnotelanguagecoding.hasVersion()) {
			e.setExplntnOfBnftProcessNtLnguageCdgVrsn(String.valueOf(explanationofbenefitprocessnotelanguagecoding.getVersion()));
		}
		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_Dsply ********************************************************************************/
		if(explanationofbenefitprocessnotelanguagecoding.hasDisplay()) {
			e.setExplntnOfBnftProcessNtLnguageCdgDsply(String.valueOf(explanationofbenefitprocessnotelanguagecoding.getDisplay()));
		}
		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_Cd ********************************************************************************/
		if(explanationofbenefitprocessnotelanguagecoding.hasCode()) {
			e.setExplntnOfBnftProcessNtLnguageCdgCd(String.valueOf(explanationofbenefitprocessnotelanguagecoding.getCode()));
		}
		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(explanationofbenefitprocessnotelanguagecoding.hasUserSelected()) {
			e.setExplntnOfBnftProcessNtLnguageCdgUsrSltd(String.valueOf(explanationofbenefitprocessnotelanguagecoding.getUserSelected()));
		}
		/******************** ExplntnOfBnft_ProcessNt_Lnguage_Cdg_Sys ********************************************************************************/
		if(explanationofbenefitprocessnotelanguagecoding.hasSystem()) {
			e.setExplntnOfBnftProcessNtLnguageCdgSys(String.valueOf(explanationofbenefitprocessnotelanguagecoding.getSystem()));
		}
		/******************** ExplntnOfBnft_ProcessNt_Nmbr ********************************************************************************/
		if(explanationofbenefitprocessnote.hasNumber()) {
			e.setExplntnOfBnftProcessNtNmbr(String.valueOf(explanationofbenefitprocessnote.getNumber()));
		}
		/******************** ExplntnOfBnft_ProcessNt_Txt ********************************************************************************/
		if(explanationofbenefitprocessnote.hasText()) {
			e.setExplntnOfBnftProcessNtTxt(String.valueOf(explanationofbenefitprocessnote.getText()));
		}
		return e;
	}
}
