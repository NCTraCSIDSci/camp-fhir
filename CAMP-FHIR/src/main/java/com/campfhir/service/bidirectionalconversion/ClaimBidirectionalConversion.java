package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Claim;
public class ClaimBidirectionalConversion 
{
	public Claim Claims(org.hl7.fhir.r4.model.Claim claim) throws ParseException
	{
		 main.java.com.campfhir.model.Claim c = new  main.java.com.campfhir.model.Claim();

		/******************** id ********************************************************************************/
		claim.setId(c.getId());

		/******************** claimpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimpriority = claim.getPriority();

		/******************** Clm_Priority_Txt ********************************************************************************/
		if(claimpriority.hasText()) {
			c.setClmPriorityTxt(String.valueOf(claimpriority.getText()));
		}
		/******************** claimprioritycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimprioritycoding = claimpriority.getCodingFirstRep();

		/******************** Clm_Priority_Cdg_Vrsn ********************************************************************************/
		if(claimprioritycoding.hasVersion()) {
			c.setClmPriorityCdgVrsn(String.valueOf(claimprioritycoding.getVersion()));
		}
		/******************** Clm_Priority_Cdg_Dsply ********************************************************************************/
		if(claimprioritycoding.hasDisplay()) {
			c.setClmPriorityCdgDsply(String.valueOf(claimprioritycoding.getDisplay()));
		}
		/******************** Clm_Priority_Cdg_Cd ********************************************************************************/
		if(claimprioritycoding.hasCode()) {
			c.setClmPriorityCdgCd(String.valueOf(claimprioritycoding.getCode()));
		}
		/******************** Clm_Priority_Cdg_UsrSltd ********************************************************************************/
		if(claimprioritycoding.hasUserSelected()) {
			c.setClmPriorityCdgUsrSltd(String.valueOf(claimprioritycoding.getUserSelected()));
		}
		/******************** Clm_Priority_Cdg_Sys ********************************************************************************/
		if(claimprioritycoding.hasSystem()) {
			c.setClmPriorityCdgSys(String.valueOf(claimprioritycoding.getSystem()));
		}
		/******************** claimtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimtype = claim.getType();

		/******************** Clm_Typ_Txt ********************************************************************************/
		if(claimtype.hasText()) {
			c.setClmTypTxt(String.valueOf(claimtype.getText()));
		}
		/******************** claimtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimtypecoding = claimtype.getCodingFirstRep();

		/******************** Clm_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimtypecoding.hasVersion()) {
			c.setClmTypCdgVrsn(String.valueOf(claimtypecoding.getVersion()));
		}
		/******************** Clm_Typ_Cdg_Dsply ********************************************************************************/
		if(claimtypecoding.hasDisplay()) {
			c.setClmTypCdgDsply(String.valueOf(claimtypecoding.getDisplay()));
		}
		/******************** Clm_Typ_Cdg_Cd ********************************************************************************/
		if(claimtypecoding.hasCode()) {
			c.setClmTypCdgCd(String.valueOf(claimtypecoding.getCode()));
		}
		/******************** Clm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimtypecoding.hasUserSelected()) {
			c.setClmTypCdgUsrSltd(String.valueOf(claimtypecoding.getUserSelected()));
		}
		/******************** Clm_Typ_Cdg_Sys ********************************************************************************/
		if(claimtypecoding.hasSystem()) {
			c.setClmTypCdgSys(String.valueOf(claimtypecoding.getSystem()));
		}
		/******************** Clm_Provider ********************************************************************************/
		if(claim.hasProvider()) {
			c.setClmProvider(String.valueOf(claim.getProvider()));
		}
		/******************** claimsubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimsubtype = claim.getSubType();

		/******************** Clm_SubTyp_Txt ********************************************************************************/
		if(claimsubtype.hasText()) {
			c.setClmSubTypTxt(String.valueOf(claimsubtype.getText()));
		}
		/******************** claimsubtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimsubtypecoding = claimsubtype.getCodingFirstRep();

		/******************** Clm_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(claimsubtypecoding.hasVersion()) {
			c.setClmSubTypCdgVrsn(String.valueOf(claimsubtypecoding.getVersion()));
		}
		/******************** Clm_SubTyp_Cdg_Dsply ********************************************************************************/
		if(claimsubtypecoding.hasDisplay()) {
			c.setClmSubTypCdgDsply(String.valueOf(claimsubtypecoding.getDisplay()));
		}
		/******************** Clm_SubTyp_Cdg_Cd ********************************************************************************/
		if(claimsubtypecoding.hasCode()) {
			c.setClmSubTypCdgCd(String.valueOf(claimsubtypecoding.getCode()));
		}
		/******************** Clm_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(claimsubtypecoding.hasUserSelected()) {
			c.setClmSubTypCdgUsrSltd(String.valueOf(claimsubtypecoding.getUserSelected()));
		}
		/******************** Clm_SubTyp_Cdg_Sys ********************************************************************************/
		if(claimsubtypecoding.hasSystem()) {
			c.setClmSubTypCdgSys(String.valueOf(claimsubtypecoding.getSystem()));
		}
		/******************** Clm_Pnt ********************************************************************************/
		if(claim.hasPatient()) {
			c.setClmPnt(String.valueOf(claim.getPatient()));
		}
		/******************** Clm_Insurer ********************************************************************************/
		if(claim.hasInsurer()) {
			c.setClmInsurer(String.valueOf(claim.getInsurer()));
		}
		/******************** claimstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.ClaimStatus claimstatus = claim.getStatus();
		c.setClmSts(claimstatus.toCode());

		/******************** Clm_Created ********************************************************************************/
		if(claim.hasCreated()) {
			c.setClmCreated(String.valueOf(claim.getCreated()));
		}
		/******************** claimrelated ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.RelatedClaimComponent claimrelated = claim.getRelatedFirstRep();

		/******************** claimrelatedreference ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier claimrelatedreference = claimrelated.getReference();

		/******************** Clm_Rlted_Rfrnc_Vl ********************************************************************************/
		if(claimrelatedreference.hasValue()) {
			c.setClmRltedRfrncVl(String.valueOf(claimrelatedreference.getValue()));
		}
		/******************** claimrelatedreferencetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimrelatedreferencetype = claimrelatedreference.getType();

		/******************** Clm_Rlted_Rfrnc_Typ_Txt ********************************************************************************/
		if(claimrelatedreferencetype.hasText()) {
			c.setClmRltedRfrncTypTxt(String.valueOf(claimrelatedreferencetype.getText()));
		}
		/******************** claimrelatedreferencetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimrelatedreferencetypecoding = claimrelatedreferencetype.getCodingFirstRep();

		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimrelatedreferencetypecoding.hasVersion()) {
			c.setClmRltedRfrncTypCdgVrsn(String.valueOf(claimrelatedreferencetypecoding.getVersion()));
		}
		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_Dsply ********************************************************************************/
		if(claimrelatedreferencetypecoding.hasDisplay()) {
			c.setClmRltedRfrncTypCdgDsply(String.valueOf(claimrelatedreferencetypecoding.getDisplay()));
		}
		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_Cd ********************************************************************************/
		if(claimrelatedreferencetypecoding.hasCode()) {
			c.setClmRltedRfrncTypCdgCd(String.valueOf(claimrelatedreferencetypecoding.getCode()));
		}
		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimrelatedreferencetypecoding.hasUserSelected()) {
			c.setClmRltedRfrncTypCdgUsrSltd(String.valueOf(claimrelatedreferencetypecoding.getUserSelected()));
		}
		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_Sys ********************************************************************************/
		if(claimrelatedreferencetypecoding.hasSystem()) {
			c.setClmRltedRfrncTypCdgSys(String.valueOf(claimrelatedreferencetypecoding.getSystem()));
		}
		/******************** claimrelatedreferenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimrelatedreferenceperiod = claimrelatedreference.getPeriod();

		/******************** Clm_Rlted_Rfrnc_Prd_Strt ********************************************************************************/
		if(claimrelatedreferenceperiod.hasStart()) {
			c.setClmRltedRfrncPrdStrt(String.valueOf(claimrelatedreferenceperiod.getStart()));
		}
		/******************** Clm_Rlted_Rfrnc_Prd_End ********************************************************************************/
		if(claimrelatedreferenceperiod.hasEnd()) {
			c.setClmRltedRfrncPrdEnd(String.valueOf(claimrelatedreferenceperiod.getEnd()));
		}
		/******************** Clm_Rlted_Rfrnc_Assigner ********************************************************************************/
		if(claimrelatedreference.hasAssigner()) {
			c.setClmRltedRfrncAssigner(String.valueOf(claimrelatedreference.getAssigner()));
		}
		/******************** Clm_Rlted_Rfrnc_Sys ********************************************************************************/
		if(claimrelatedreference.hasSystem()) {
			c.setClmRltedRfrncSys(String.valueOf(claimrelatedreference.getSystem()));
		}
		/******************** claimrelatedreferenceuse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse claimrelatedreferenceuse = claimrelatedreference.getUse();
		c.setClmRltedRfrncUse(claimrelatedreferenceuse.toCode());

		/******************** Clm_Rlted_Clm ********************************************************************************/
		if(claimrelated.hasClaim()) {
			c.setClmRltedClm(String.valueOf(claimrelated.getClaim()));
		}
		/******************** claimrelatedrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimrelatedrelationship = claimrelated.getRelationship();

		/******************** Clm_Rlted_Rltnship_Txt ********************************************************************************/
		if(claimrelatedrelationship.hasText()) {
			c.setClmRltedRltnshipTxt(String.valueOf(claimrelatedrelationship.getText()));
		}
		/******************** claimrelatedrelationshipcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimrelatedrelationshipcoding = claimrelatedrelationship.getCodingFirstRep();

		/******************** Clm_Rlted_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(claimrelatedrelationshipcoding.hasVersion()) {
			c.setClmRltedRltnshipCdgVrsn(String.valueOf(claimrelatedrelationshipcoding.getVersion()));
		}
		/******************** Clm_Rlted_Rltnship_Cdg_Dsply ********************************************************************************/
		if(claimrelatedrelationshipcoding.hasDisplay()) {
			c.setClmRltedRltnshipCdgDsply(String.valueOf(claimrelatedrelationshipcoding.getDisplay()));
		}
		/******************** Clm_Rlted_Rltnship_Cdg_Cd ********************************************************************************/
		if(claimrelatedrelationshipcoding.hasCode()) {
			c.setClmRltedRltnshipCdgCd(String.valueOf(claimrelatedrelationshipcoding.getCode()));
		}
		/******************** Clm_Rlted_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(claimrelatedrelationshipcoding.hasUserSelected()) {
			c.setClmRltedRltnshipCdgUsrSltd(String.valueOf(claimrelatedrelationshipcoding.getUserSelected()));
		}
		/******************** Clm_Rlted_Rltnship_Cdg_Sys ********************************************************************************/
		if(claimrelatedrelationshipcoding.hasSystem()) {
			c.setClmRltedRltnshipCdgSys(String.valueOf(claimrelatedrelationshipcoding.getSystem()));
		}
		/******************** claimbillableperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimbillableperiod = claim.getBillablePeriod();

		/******************** Clm_BillablePrd_Strt ********************************************************************************/
		if(claimbillableperiod.hasStart()) {
			c.setClmBillablePrdStrt(String.valueOf(claimbillableperiod.getStart()));
		}
		/******************** Clm_BillablePrd_End ********************************************************************************/
		if(claimbillableperiod.hasEnd()) {
			c.setClmBillablePrdEnd(String.valueOf(claimbillableperiod.getEnd()));
		}
		/******************** claimuse ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.Use claimuse = claim.getUse();
		c.setClmUse(claimuse.toCode());

		/******************** Clm_Prescription ********************************************************************************/
		if(claim.hasPrescription()) {
			c.setClmPrescription(String.valueOf(claim.getPrescription()));
		}
		/******************** Clm_Referral ********************************************************************************/
		if(claim.hasReferral()) {
			c.setClmReferral(String.valueOf(claim.getReferral()));
		}
		/******************** claimfundsreserve ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimfundsreserve = claim.getFundsReserve();

		/******************** Clm_FundsReserve_Txt ********************************************************************************/
		if(claimfundsreserve.hasText()) {
			c.setClmFundsReserveTxt(String.valueOf(claimfundsreserve.getText()));
		}
		/******************** claimfundsreservecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimfundsreservecoding = claimfundsreserve.getCodingFirstRep();

		/******************** Clm_FundsReserve_Cdg_Vrsn ********************************************************************************/
		if(claimfundsreservecoding.hasVersion()) {
			c.setClmFundsReserveCdgVrsn(String.valueOf(claimfundsreservecoding.getVersion()));
		}
		/******************** Clm_FundsReserve_Cdg_Dsply ********************************************************************************/
		if(claimfundsreservecoding.hasDisplay()) {
			c.setClmFundsReserveCdgDsply(String.valueOf(claimfundsreservecoding.getDisplay()));
		}
		/******************** Clm_FundsReserve_Cdg_Cd ********************************************************************************/
		if(claimfundsreservecoding.hasCode()) {
			c.setClmFundsReserveCdgCd(String.valueOf(claimfundsreservecoding.getCode()));
		}
		/******************** Clm_FundsReserve_Cdg_UsrSltd ********************************************************************************/
		if(claimfundsreservecoding.hasUserSelected()) {
			c.setClmFundsReserveCdgUsrSltd(String.valueOf(claimfundsreservecoding.getUserSelected()));
		}
		/******************** Clm_FundsReserve_Cdg_Sys ********************************************************************************/
		if(claimfundsreservecoding.hasSystem()) {
			c.setClmFundsReserveCdgSys(String.valueOf(claimfundsreservecoding.getSystem()));
		}
		/******************** claimaccident ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.AccidentComponent claimaccident = claim.getAccident();

		/******************** claimaccidenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimaccidenttype = claimaccident.getType();

		/******************** Clm_Accident_Typ_Txt ********************************************************************************/
		if(claimaccidenttype.hasText()) {
			c.setClmAccidentTypTxt(String.valueOf(claimaccidenttype.getText()));
		}
		/******************** claimaccidenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimaccidenttypecoding = claimaccidenttype.getCodingFirstRep();

		/******************** Clm_Accident_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimaccidenttypecoding.hasVersion()) {
			c.setClmAccidentTypCdgVrsn(String.valueOf(claimaccidenttypecoding.getVersion()));
		}
		/******************** Clm_Accident_Typ_Cdg_Dsply ********************************************************************************/
		if(claimaccidenttypecoding.hasDisplay()) {
			c.setClmAccidentTypCdgDsply(String.valueOf(claimaccidenttypecoding.getDisplay()));
		}
		/******************** Clm_Accident_Typ_Cdg_Cd ********************************************************************************/
		if(claimaccidenttypecoding.hasCode()) {
			c.setClmAccidentTypCdgCd(String.valueOf(claimaccidenttypecoding.getCode()));
		}
		/******************** Clm_Accident_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimaccidenttypecoding.hasUserSelected()) {
			c.setClmAccidentTypCdgUsrSltd(String.valueOf(claimaccidenttypecoding.getUserSelected()));
		}
		/******************** Clm_Accident_Typ_Cdg_Sys ********************************************************************************/
		if(claimaccidenttypecoding.hasSystem()) {
			c.setClmAccidentTypCdgSys(String.valueOf(claimaccidenttypecoding.getSystem()));
		}
		/******************** Clm_Accident_Dt ********************************************************************************/
		if(claimaccident.hasDate()) {
			c.setClmAccidentDt(String.valueOf(claimaccident.getDate()));
		}
		/******************** claimaccidentlocationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address claimaccidentlocationaddress = claimaccident.getLocationAddress();

		/******************** Clm_Accident_LctnAddr_State ********************************************************************************/
		if(claimaccidentlocationaddress.hasState()) {
			c.setClmAccidentLctnAddrState(String.valueOf(claimaccidentlocationaddress.getState()));
		}
		/******************** claimaccidentlocationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType claimaccidentlocationaddresstype = claimaccidentlocationaddress.getType();
		c.setClmAccidentLctnAddrTyp(claimaccidentlocationaddresstype.toCode());

		/******************** Clm_Accident_LctnAddr_Cntry ********************************************************************************/
		if(claimaccidentlocationaddress.hasCountry()) {
			c.setClmAccidentLctnAddrCntry(String.valueOf(claimaccidentlocationaddress.getCountry()));
		}
		/******************** claimaccidentlocationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimaccidentlocationaddressperiod = claimaccidentlocationaddress.getPeriod();

		/******************** Clm_Accident_LctnAddr_Prd_Strt ********************************************************************************/
		if(claimaccidentlocationaddressperiod.hasStart()) {
			c.setClmAccidentLctnAddrPrdStrt(String.valueOf(claimaccidentlocationaddressperiod.getStart()));
		}
		/******************** Clm_Accident_LctnAddr_Prd_End ********************************************************************************/
		if(claimaccidentlocationaddressperiod.hasEnd()) {
			c.setClmAccidentLctnAddrPrdEnd(String.valueOf(claimaccidentlocationaddressperiod.getEnd()));
		}
		/******************** Clm_Accident_LctnAddr_Txt ********************************************************************************/
		if(claimaccidentlocationaddress.hasText()) {
			c.setClmAccidentLctnAddrTxt(String.valueOf(claimaccidentlocationaddress.getText()));
		}
		/******************** claimaccidentlocationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse claimaccidentlocationaddressuse = claimaccidentlocationaddress.getUse();
		c.setClmAccidentLctnAddrUse(claimaccidentlocationaddressuse.toCode());

		/******************** Clm_Accident_LctnAddr_City ********************************************************************************/
		if(claimaccidentlocationaddress.hasCity()) {
			c.setClmAccidentLctnAddrCity(String.valueOf(claimaccidentlocationaddress.getCity()));
		}
		/******************** Clm_Accident_LctnAddr_District ********************************************************************************/
		if(claimaccidentlocationaddress.hasDistrict()) {
			c.setClmAccidentLctnAddrDistrict(String.valueOf(claimaccidentlocationaddress.getDistrict()));
		}
		/******************** Clm_Accident_LctnAddr_PostalCd ********************************************************************************/
		if(claimaccidentlocationaddress.hasPostalCode()) {
			c.setClmAccidentLctnAddrPostalCd(String.valueOf(claimaccidentlocationaddress.getPostalCode()));
		}
		/******************** Clm_Accident_LctnRfrnc ********************************************************************************/
		if(claimaccident.hasLocationReference()) {
			c.setClmAccidentLctnRfrnc(String.valueOf(claimaccident.getLocationReference()));
		}
		/******************** claimtotal ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimtotal = claim.getTotal();

		/******************** Clm_Total_Vl ********************************************************************************/
		if(claimtotal.hasValue()) {
			c.setClmTotalVl(String.valueOf(claimtotal.getValue()));
		}
		/******************** Clm_Total_Crncy ********************************************************************************/
		if(claimtotal.hasCurrency()) {
			c.setClmTotalCrncy(String.valueOf(claimtotal.getCurrency()));
		}
		/******************** claimcareteam ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.CareTeamComponent claimcareteam = claim.getCareTeamFirstRep();

		/******************** Clm_CareTeam_Provider ********************************************************************************/
		if(claimcareteam.hasProvider()) {
			c.setClmCareTeamProvider(String.valueOf(claimcareteam.getProvider()));
		}
		/******************** Clm_CareTeam_Sqnc ********************************************************************************/
		if(claimcareteam.hasSequence()) {
			c.setClmCareTeamSqnc(String.valueOf(claimcareteam.getSequence()));
		}
		/******************** claimcareteamrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimcareteamrole = claimcareteam.getRole();

		/******************** Clm_CareTeam_Role_Txt ********************************************************************************/
		if(claimcareteamrole.hasText()) {
			c.setClmCareTeamRoleTxt(String.valueOf(claimcareteamrole.getText()));
		}
		/******************** claimcareteamrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimcareteamrolecoding = claimcareteamrole.getCodingFirstRep();

		/******************** Clm_CareTeam_Role_Cdg_Vrsn ********************************************************************************/
		if(claimcareteamrolecoding.hasVersion()) {
			c.setClmCareTeamRoleCdgVrsn(String.valueOf(claimcareteamrolecoding.getVersion()));
		}
		/******************** Clm_CareTeam_Role_Cdg_Dsply ********************************************************************************/
		if(claimcareteamrolecoding.hasDisplay()) {
			c.setClmCareTeamRoleCdgDsply(String.valueOf(claimcareteamrolecoding.getDisplay()));
		}
		/******************** Clm_CareTeam_Role_Cdg_Cd ********************************************************************************/
		if(claimcareteamrolecoding.hasCode()) {
			c.setClmCareTeamRoleCdgCd(String.valueOf(claimcareteamrolecoding.getCode()));
		}
		/******************** Clm_CareTeam_Role_Cdg_UsrSltd ********************************************************************************/
		if(claimcareteamrolecoding.hasUserSelected()) {
			c.setClmCareTeamRoleCdgUsrSltd(String.valueOf(claimcareteamrolecoding.getUserSelected()));
		}
		/******************** Clm_CareTeam_Role_Cdg_Sys ********************************************************************************/
		if(claimcareteamrolecoding.hasSystem()) {
			c.setClmCareTeamRoleCdgSys(String.valueOf(claimcareteamrolecoding.getSystem()));
		}
		/******************** Clm_CareTeam_Responsible ********************************************************************************/
		if(claimcareteam.hasResponsible()) {
			c.setClmCareTeamResponsible(String.valueOf(claimcareteam.getResponsible()));
		}
		/******************** claimcareteamqualification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimcareteamqualification = claimcareteam.getQualification();

		/******************** Clm_CareTeam_Qualification_Txt ********************************************************************************/
		if(claimcareteamqualification.hasText()) {
			c.setClmCareTeamQualificationTxt(String.valueOf(claimcareteamqualification.getText()));
		}
		/******************** claimcareteamqualificationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimcareteamqualificationcoding = claimcareteamqualification.getCodingFirstRep();

		/******************** Clm_CareTeam_Qualification_Cdg_Vrsn ********************************************************************************/
		if(claimcareteamqualificationcoding.hasVersion()) {
			c.setClmCareTeamQualificationCdgVrsn(String.valueOf(claimcareteamqualificationcoding.getVersion()));
		}
		/******************** Clm_CareTeam_Qualification_Cdg_Dsply ********************************************************************************/
		if(claimcareteamqualificationcoding.hasDisplay()) {
			c.setClmCareTeamQualificationCdgDsply(String.valueOf(claimcareteamqualificationcoding.getDisplay()));
		}
		/******************** Clm_CareTeam_Qualification_Cdg_Cd ********************************************************************************/
		if(claimcareteamqualificationcoding.hasCode()) {
			c.setClmCareTeamQualificationCdgCd(String.valueOf(claimcareteamqualificationcoding.getCode()));
		}
		/******************** Clm_CareTeam_Qualification_Cdg_UsrSltd ********************************************************************************/
		if(claimcareteamqualificationcoding.hasUserSelected()) {
			c.setClmCareTeamQualificationCdgUsrSltd(String.valueOf(claimcareteamqualificationcoding.getUserSelected()));
		}
		/******************** Clm_CareTeam_Qualification_Cdg_Sys ********************************************************************************/
		if(claimcareteamqualificationcoding.hasSystem()) {
			c.setClmCareTeamQualificationCdgSys(String.valueOf(claimcareteamqualificationcoding.getSystem()));
		}
		/******************** claimprocedure ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.ProcedureComponent claimprocedure = claim.getProcedureFirstRep();

		/******************** Clm_Prcdr_Dt ********************************************************************************/
		if(claimprocedure.hasDate()) {
			c.setClmPrcdrDt(String.valueOf(claimprocedure.getDate()));
		}
		/******************** claimprocedureprocedurecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimprocedureprocedurecodeableconcept = claimprocedure.getProcedureCodeableConcept();

		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Txt ********************************************************************************/
		if(claimprocedureprocedurecodeableconcept.hasText()) {
			c.setClmPrcdrPrcdrCdbleCncptTxt(String.valueOf(claimprocedureprocedurecodeableconcept.getText()));
		}
		/******************** claimprocedureprocedurecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimprocedureprocedurecodeableconceptcoding = claimprocedureprocedurecodeableconcept.getCodingFirstRep();

		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(claimprocedureprocedurecodeableconceptcoding.hasVersion()) {
			c.setClmPrcdrPrcdrCdbleCncptCdgVrsn(String.valueOf(claimprocedureprocedurecodeableconceptcoding.getVersion()));
		}
		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(claimprocedureprocedurecodeableconceptcoding.hasDisplay()) {
			c.setClmPrcdrPrcdrCdbleCncptCdgDsply(String.valueOf(claimprocedureprocedurecodeableconceptcoding.getDisplay()));
		}
		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(claimprocedureprocedurecodeableconceptcoding.hasCode()) {
			c.setClmPrcdrPrcdrCdbleCncptCdgCd(String.valueOf(claimprocedureprocedurecodeableconceptcoding.getCode()));
		}
		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(claimprocedureprocedurecodeableconceptcoding.hasUserSelected()) {
			c.setClmPrcdrPrcdrCdbleCncptCdgUsrSltd(String.valueOf(claimprocedureprocedurecodeableconceptcoding.getUserSelected()));
		}
		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(claimprocedureprocedurecodeableconceptcoding.hasSystem()) {
			c.setClmPrcdrPrcdrCdbleCncptCdgSys(String.valueOf(claimprocedureprocedurecodeableconceptcoding.getSystem()));
		}
		/******************** Clm_Prcdr_Sqnc ********************************************************************************/
		if(claimprocedure.hasSequence()) {
			c.setClmPrcdrSqnc(String.valueOf(claimprocedure.getSequence()));
		}
		/******************** claimproceduretype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimproceduretype = claimprocedure.getTypeFirstRep();

		/******************** Clm_Prcdr_Typ_Txt ********************************************************************************/
		if(claimproceduretype.hasText()) {
			c.setClmPrcdrTypTxt(String.valueOf(claimproceduretype.getText()));
		}
		/******************** claimproceduretypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimproceduretypecoding = claimproceduretype.getCodingFirstRep();

		/******************** Clm_Prcdr_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimproceduretypecoding.hasVersion()) {
			c.setClmPrcdrTypCdgVrsn(String.valueOf(claimproceduretypecoding.getVersion()));
		}
		/******************** Clm_Prcdr_Typ_Cdg_Dsply ********************************************************************************/
		if(claimproceduretypecoding.hasDisplay()) {
			c.setClmPrcdrTypCdgDsply(String.valueOf(claimproceduretypecoding.getDisplay()));
		}
		/******************** Clm_Prcdr_Typ_Cdg_Cd ********************************************************************************/
		if(claimproceduretypecoding.hasCode()) {
			c.setClmPrcdrTypCdgCd(String.valueOf(claimproceduretypecoding.getCode()));
		}
		/******************** Clm_Prcdr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimproceduretypecoding.hasUserSelected()) {
			c.setClmPrcdrTypCdgUsrSltd(String.valueOf(claimproceduretypecoding.getUserSelected()));
		}
		/******************** Clm_Prcdr_Typ_Cdg_Sys ********************************************************************************/
		if(claimproceduretypecoding.hasSystem()) {
			c.setClmPrcdrTypCdgSys(String.valueOf(claimproceduretypecoding.getSystem()));
		}
		/******************** Clm_Prcdr_Udi ********************************************************************************/
		if(claimprocedure.hasUdi()) {
			c.setClmPrcdrUdi(String.valueOf(claimprocedure.getUdiFirstRep()));
		}
		/******************** Clm_OriginalPrescription ********************************************************************************/
		if(claim.hasOriginalPrescription()) {
			c.setClmOriginalPrescription(String.valueOf(claim.getOriginalPrescription()));
		}
		/******************** Clm_Enterer ********************************************************************************/
		if(claim.hasEnterer()) {
			c.setClmEnterer(String.valueOf(claim.getEnterer()));
		}
		/******************** Clm_Facility ********************************************************************************/
		if(claim.hasFacility()) {
			c.setClmFacility(String.valueOf(claim.getFacility()));
		}
		/******************** claimitem ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.ItemComponent claimitem = claim.getItemFirstRep();

		/******************** claimitemlocationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address claimitemlocationaddress = claimitem.getLocationAddress();

		/******************** Clm_Itm_LctnAddr_State ********************************************************************************/
		if(claimitemlocationaddress.hasState()) {
			c.setClmItmLctnAddrState(String.valueOf(claimitemlocationaddress.getState()));
		}
		/******************** claimitemlocationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType claimitemlocationaddresstype = claimitemlocationaddress.getType();
		c.setClmItmLctnAddrTyp(claimitemlocationaddresstype.toCode());

		/******************** Clm_Itm_LctnAddr_Cntry ********************************************************************************/
		if(claimitemlocationaddress.hasCountry()) {
			c.setClmItmLctnAddrCntry(String.valueOf(claimitemlocationaddress.getCountry()));
		}
		/******************** claimitemlocationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimitemlocationaddressperiod = claimitemlocationaddress.getPeriod();

		/******************** Clm_Itm_LctnAddr_Prd_Strt ********************************************************************************/
		if(claimitemlocationaddressperiod.hasStart()) {
			c.setClmItmLctnAddrPrdStrt(String.valueOf(claimitemlocationaddressperiod.getStart()));
		}
		/******************** Clm_Itm_LctnAddr_Prd_End ********************************************************************************/
		if(claimitemlocationaddressperiod.hasEnd()) {
			c.setClmItmLctnAddrPrdEnd(String.valueOf(claimitemlocationaddressperiod.getEnd()));
		}
		/******************** Clm_Itm_LctnAddr_Txt ********************************************************************************/
		if(claimitemlocationaddress.hasText()) {
			c.setClmItmLctnAddrTxt(String.valueOf(claimitemlocationaddress.getText()));
		}
		/******************** claimitemlocationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse claimitemlocationaddressuse = claimitemlocationaddress.getUse();
		c.setClmItmLctnAddrUse(claimitemlocationaddressuse.toCode());

		/******************** Clm_Itm_LctnAddr_City ********************************************************************************/
		if(claimitemlocationaddress.hasCity()) {
			c.setClmItmLctnAddrCity(String.valueOf(claimitemlocationaddress.getCity()));
		}
		/******************** Clm_Itm_LctnAddr_District ********************************************************************************/
		if(claimitemlocationaddress.hasDistrict()) {
			c.setClmItmLctnAddrDistrict(String.valueOf(claimitemlocationaddress.getDistrict()));
		}
		/******************** Clm_Itm_LctnAddr_PostalCd ********************************************************************************/
		if(claimitemlocationaddress.hasPostalCode()) {
			c.setClmItmLctnAddrPostalCd(String.valueOf(claimitemlocationaddress.getPostalCode()));
		}
		/******************** Clm_Itm_LctnRfrnc ********************************************************************************/
		if(claimitem.hasLocationReference()) {
			c.setClmItmLctnRfrnc(String.valueOf(claimitem.getLocationReference()));
		}
		/******************** Clm_Itm_Sqnc ********************************************************************************/
		if(claimitem.hasSequence()) {
			c.setClmItmSqnc(String.valueOf(claimitem.getSequence()));
		}
		/******************** claimitemdetail ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.DetailComponent claimitemdetail = claimitem.getDetailFirstRep();

		/******************** Clm_Itm_Dtl_Sqnc ********************************************************************************/
		if(claimitemdetail.hasSequence()) {
			c.setClmItmDtlSqnc(String.valueOf(claimitemdetail.getSequence()));
		}
		/******************** claimitemdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailproductorservice = claimitemdetail.getProductOrService();

		/******************** Clm_Itm_Dtl_PrdctOrSrv_Txt ********************************************************************************/
		if(claimitemdetailproductorservice.hasText()) {
			c.setClmItmDtlPrdctOrSrvTxt(String.valueOf(claimitemdetailproductorservice.getText()));
		}
		/******************** claimitemdetailproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailproductorservicecoding = claimitemdetailproductorservice.getCodingFirstRep();

		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailproductorservicecoding.hasVersion()) {
			c.setClmItmDtlPrdctOrSrvCdgVrsn(String.valueOf(claimitemdetailproductorservicecoding.getVersion()));
		}
		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailproductorservicecoding.hasDisplay()) {
			c.setClmItmDtlPrdctOrSrvCdgDsply(String.valueOf(claimitemdetailproductorservicecoding.getDisplay()));
		}
		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(claimitemdetailproductorservicecoding.hasCode()) {
			c.setClmItmDtlPrdctOrSrvCdgCd(String.valueOf(claimitemdetailproductorservicecoding.getCode()));
		}
		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailproductorservicecoding.hasUserSelected()) {
			c.setClmItmDtlPrdctOrSrvCdgUsrSltd(String.valueOf(claimitemdetailproductorservicecoding.getUserSelected()));
		}
		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(claimitemdetailproductorservicecoding.hasSystem()) {
			c.setClmItmDtlPrdctOrSrvCdgSys(String.valueOf(claimitemdetailproductorservicecoding.getSystem()));
		}
		/******************** claimitemdetailmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailmodifier = claimitemdetail.getModifierFirstRep();

		/******************** Clm_Itm_Dtl_Mdfr_Txt ********************************************************************************/
		if(claimitemdetailmodifier.hasText()) {
			c.setClmItmDtlMdfrTxt(String.valueOf(claimitemdetailmodifier.getText()));
		}
		/******************** claimitemdetailmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailmodifiercoding = claimitemdetailmodifier.getCodingFirstRep();

		/******************** Clm_Itm_Dtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailmodifiercoding.hasVersion()) {
			c.setClmItmDtlMdfrCdgVrsn(String.valueOf(claimitemdetailmodifiercoding.getVersion()));
		}
		/******************** Clm_Itm_Dtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailmodifiercoding.hasDisplay()) {
			c.setClmItmDtlMdfrCdgDsply(String.valueOf(claimitemdetailmodifiercoding.getDisplay()));
		}
		/******************** Clm_Itm_Dtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(claimitemdetailmodifiercoding.hasCode()) {
			c.setClmItmDtlMdfrCdgCd(String.valueOf(claimitemdetailmodifiercoding.getCode()));
		}
		/******************** Clm_Itm_Dtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailmodifiercoding.hasUserSelected()) {
			c.setClmItmDtlMdfrCdgUsrSltd(String.valueOf(claimitemdetailmodifiercoding.getUserSelected()));
		}
		/******************** Clm_Itm_Dtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(claimitemdetailmodifiercoding.hasSystem()) {
			c.setClmItmDtlMdfrCdgSys(String.valueOf(claimitemdetailmodifiercoding.getSystem()));
		}
		/******************** claimitemdetailprogramcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailprogramcode = claimitemdetail.getProgramCodeFirstRep();

		/******************** Clm_Itm_Dtl_PrgrmCd_Txt ********************************************************************************/
		if(claimitemdetailprogramcode.hasText()) {
			c.setClmItmDtlPrgrmCdTxt(String.valueOf(claimitemdetailprogramcode.getText()));
		}
		/******************** claimitemdetailprogramcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailprogramcodecoding = claimitemdetailprogramcode.getCodingFirstRep();

		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailprogramcodecoding.hasVersion()) {
			c.setClmItmDtlPrgrmCdCdgVrsn(String.valueOf(claimitemdetailprogramcodecoding.getVersion()));
		}
		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailprogramcodecoding.hasDisplay()) {
			c.setClmItmDtlPrgrmCdCdgDsply(String.valueOf(claimitemdetailprogramcodecoding.getDisplay()));
		}
		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(claimitemdetailprogramcodecoding.hasCode()) {
			c.setClmItmDtlPrgrmCdCdgCd(String.valueOf(claimitemdetailprogramcodecoding.getCode()));
		}
		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailprogramcodecoding.hasUserSelected()) {
			c.setClmItmDtlPrgrmCdCdgUsrSltd(String.valueOf(claimitemdetailprogramcodecoding.getUserSelected()));
		}
		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(claimitemdetailprogramcodecoding.hasSystem()) {
			c.setClmItmDtlPrgrmCdCdgSys(String.valueOf(claimitemdetailprogramcodecoding.getSystem()));
		}
		/******************** claimitemdetailsubdetail ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.SubDetailComponent claimitemdetailsubdetail = claimitemdetail.getSubDetailFirstRep();

		/******************** Clm_Itm_Dtl_SubDtl_Sqnc ********************************************************************************/
		if(claimitemdetailsubdetail.hasSequence()) {
			c.setClmItmDtlSubDtlSqnc(String.valueOf(claimitemdetailsubdetail.getSequence()));
		}
		/******************** claimitemdetailsubdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailsubdetailproductorservice = claimitemdetailsubdetail.getProductOrService();

		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Txt ********************************************************************************/
		if(claimitemdetailsubdetailproductorservice.hasText()) {
			c.setClmItmDtlSubDtlPrdctOrSrvTxt(String.valueOf(claimitemdetailsubdetailproductorservice.getText()));
		}
		/******************** claimitemdetailsubdetailproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailsubdetailproductorservicecoding = claimitemdetailsubdetailproductorservice.getCodingFirstRep();

		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailsubdetailproductorservicecoding.hasVersion()) {
			c.setClmItmDtlSubDtlPrdctOrSrvCdgVrsn(String.valueOf(claimitemdetailsubdetailproductorservicecoding.getVersion()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailsubdetailproductorservicecoding.hasDisplay()) {
			c.setClmItmDtlSubDtlPrdctOrSrvCdgDsply(String.valueOf(claimitemdetailsubdetailproductorservicecoding.getDisplay()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(claimitemdetailsubdetailproductorservicecoding.hasCode()) {
			c.setClmItmDtlSubDtlPrdctOrSrvCdgCd(String.valueOf(claimitemdetailsubdetailproductorservicecoding.getCode()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailsubdetailproductorservicecoding.hasUserSelected()) {
			c.setClmItmDtlSubDtlPrdctOrSrvCdgUsrSltd(String.valueOf(claimitemdetailsubdetailproductorservicecoding.getUserSelected()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(claimitemdetailsubdetailproductorservicecoding.hasSystem()) {
			c.setClmItmDtlSubDtlPrdctOrSrvCdgSys(String.valueOf(claimitemdetailsubdetailproductorservicecoding.getSystem()));
		}
		/******************** claimitemdetailsubdetailmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailsubdetailmodifier = claimitemdetailsubdetail.getModifierFirstRep();

		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Txt ********************************************************************************/
		if(claimitemdetailsubdetailmodifier.hasText()) {
			c.setClmItmDtlSubDtlMdfrTxt(String.valueOf(claimitemdetailsubdetailmodifier.getText()));
		}
		/******************** claimitemdetailsubdetailmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailsubdetailmodifiercoding = claimitemdetailsubdetailmodifier.getCodingFirstRep();

		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailsubdetailmodifiercoding.hasVersion()) {
			c.setClmItmDtlSubDtlMdfrCdgVrsn(String.valueOf(claimitemdetailsubdetailmodifiercoding.getVersion()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailsubdetailmodifiercoding.hasDisplay()) {
			c.setClmItmDtlSubDtlMdfrCdgDsply(String.valueOf(claimitemdetailsubdetailmodifiercoding.getDisplay()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(claimitemdetailsubdetailmodifiercoding.hasCode()) {
			c.setClmItmDtlSubDtlMdfrCdgCd(String.valueOf(claimitemdetailsubdetailmodifiercoding.getCode()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailsubdetailmodifiercoding.hasUserSelected()) {
			c.setClmItmDtlSubDtlMdfrCdgUsrSltd(String.valueOf(claimitemdetailsubdetailmodifiercoding.getUserSelected()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(claimitemdetailsubdetailmodifiercoding.hasSystem()) {
			c.setClmItmDtlSubDtlMdfrCdgSys(String.valueOf(claimitemdetailsubdetailmodifiercoding.getSystem()));
		}
		/******************** claimitemdetailsubdetailprogramcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailsubdetailprogramcode = claimitemdetailsubdetail.getProgramCodeFirstRep();

		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Txt ********************************************************************************/
		if(claimitemdetailsubdetailprogramcode.hasText()) {
			c.setClmItmDtlSubDtlPrgrmCdTxt(String.valueOf(claimitemdetailsubdetailprogramcode.getText()));
		}
		/******************** claimitemdetailsubdetailprogramcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailsubdetailprogramcodecoding = claimitemdetailsubdetailprogramcode.getCodingFirstRep();

		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailsubdetailprogramcodecoding.hasVersion()) {
			c.setClmItmDtlSubDtlPrgrmCdCdgVrsn(String.valueOf(claimitemdetailsubdetailprogramcodecoding.getVersion()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailsubdetailprogramcodecoding.hasDisplay()) {
			c.setClmItmDtlSubDtlPrgrmCdCdgDsply(String.valueOf(claimitemdetailsubdetailprogramcodecoding.getDisplay()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(claimitemdetailsubdetailprogramcodecoding.hasCode()) {
			c.setClmItmDtlSubDtlPrgrmCdCdgCd(String.valueOf(claimitemdetailsubdetailprogramcodecoding.getCode()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailsubdetailprogramcodecoding.hasUserSelected()) {
			c.setClmItmDtlSubDtlPrgrmCdCdgUsrSltd(String.valueOf(claimitemdetailsubdetailprogramcodecoding.getUserSelected()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(claimitemdetailsubdetailprogramcodecoding.hasSystem()) {
			c.setClmItmDtlSubDtlPrgrmCdCdgSys(String.valueOf(claimitemdetailsubdetailprogramcodecoding.getSystem()));
		}
		/******************** claimitemdetailsubdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimitemdetailsubdetailquantity = claimitemdetailsubdetail.getQuantity();

		/******************** Clm_Itm_Dtl_SubDtl_Qnty_Vl ********************************************************************************/
		if(claimitemdetailsubdetailquantity.hasValue()) {
			c.setClmItmDtlSubDtlQntyVl(String.valueOf(claimitemdetailsubdetailquantity.getValue()));
		}
		/******************** claimitemdetailsubdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator claimitemdetailsubdetailquantitycomparator = claimitemdetailsubdetailquantity.getComparator();
		c.setClmItmDtlSubDtlQntyCmprtr(claimitemdetailsubdetailquantitycomparator.toCode());

		/******************** Clm_Itm_Dtl_SubDtl_Qnty_Cd ********************************************************************************/
		if(claimitemdetailsubdetailquantity.hasCode()) {
			c.setClmItmDtlSubDtlQntyCd(String.valueOf(claimitemdetailsubdetailquantity.getCode()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Qnty_Unt ********************************************************************************/
		if(claimitemdetailsubdetailquantity.hasUnit()) {
			c.setClmItmDtlSubDtlQntyUnt(String.valueOf(claimitemdetailsubdetailquantity.getUnit()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Qnty_Sys ********************************************************************************/
		if(claimitemdetailsubdetailquantity.hasSystem()) {
			c.setClmItmDtlSubDtlQntySys(String.valueOf(claimitemdetailsubdetailquantity.getSystem()));
		}
		/******************** claimitemdetailsubdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimitemdetailsubdetailunitprice = claimitemdetailsubdetail.getUnitPrice();

		/******************** Clm_Itm_Dtl_SubDtl_UntPrice_Vl ********************************************************************************/
		if(claimitemdetailsubdetailunitprice.hasValue()) {
			c.setClmItmDtlSubDtlUntPriceVl(String.valueOf(claimitemdetailsubdetailunitprice.getValue()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_UntPrice_Crncy ********************************************************************************/
		if(claimitemdetailsubdetailunitprice.hasCurrency()) {
			c.setClmItmDtlSubDtlUntPriceCrncy(String.valueOf(claimitemdetailsubdetailunitprice.getCurrency()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Factor ********************************************************************************/
		if(claimitemdetailsubdetail.hasFactor()) {
			c.setClmItmDtlSubDtlFactor(String.valueOf(claimitemdetailsubdetail.getFactor()));
		}
		/******************** claimitemdetailsubdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimitemdetailsubdetailnet = claimitemdetailsubdetail.getNet();

		/******************** Clm_Itm_Dtl_SubDtl_Net_Vl ********************************************************************************/
		if(claimitemdetailsubdetailnet.hasValue()) {
			c.setClmItmDtlSubDtlNetVl(String.valueOf(claimitemdetailsubdetailnet.getValue()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Net_Crncy ********************************************************************************/
		if(claimitemdetailsubdetailnet.hasCurrency()) {
			c.setClmItmDtlSubDtlNetCrncy(String.valueOf(claimitemdetailsubdetailnet.getCurrency()));
		}
		/******************** claimitemdetailsubdetailcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailsubdetailcategory = claimitemdetailsubdetail.getCategory();

		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Txt ********************************************************************************/
		if(claimitemdetailsubdetailcategory.hasText()) {
			c.setClmItmDtlSubDtlCtgryTxt(String.valueOf(claimitemdetailsubdetailcategory.getText()));
		}
		/******************** claimitemdetailsubdetailcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailsubdetailcategorycoding = claimitemdetailsubdetailcategory.getCodingFirstRep();

		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailsubdetailcategorycoding.hasVersion()) {
			c.setClmItmDtlSubDtlCtgryCdgVrsn(String.valueOf(claimitemdetailsubdetailcategorycoding.getVersion()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailsubdetailcategorycoding.hasDisplay()) {
			c.setClmItmDtlSubDtlCtgryCdgDsply(String.valueOf(claimitemdetailsubdetailcategorycoding.getDisplay()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimitemdetailsubdetailcategorycoding.hasCode()) {
			c.setClmItmDtlSubDtlCtgryCdgCd(String.valueOf(claimitemdetailsubdetailcategorycoding.getCode()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailsubdetailcategorycoding.hasUserSelected()) {
			c.setClmItmDtlSubDtlCtgryCdgUsrSltd(String.valueOf(claimitemdetailsubdetailcategorycoding.getUserSelected()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimitemdetailsubdetailcategorycoding.hasSystem()) {
			c.setClmItmDtlSubDtlCtgryCdgSys(String.valueOf(claimitemdetailsubdetailcategorycoding.getSystem()));
		}
		/******************** claimitemdetailsubdetailrevenue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailsubdetailrevenue = claimitemdetailsubdetail.getRevenue();

		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Txt ********************************************************************************/
		if(claimitemdetailsubdetailrevenue.hasText()) {
			c.setClmItmDtlSubDtlRevenueTxt(String.valueOf(claimitemdetailsubdetailrevenue.getText()));
		}
		/******************** claimitemdetailsubdetailrevenuecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailsubdetailrevenuecoding = claimitemdetailsubdetailrevenue.getCodingFirstRep();

		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailsubdetailrevenuecoding.hasVersion()) {
			c.setClmItmDtlSubDtlRevenueCdgVrsn(String.valueOf(claimitemdetailsubdetailrevenuecoding.getVersion()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailsubdetailrevenuecoding.hasDisplay()) {
			c.setClmItmDtlSubDtlRevenueCdgDsply(String.valueOf(claimitemdetailsubdetailrevenuecoding.getDisplay()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Cd ********************************************************************************/
		if(claimitemdetailsubdetailrevenuecoding.hasCode()) {
			c.setClmItmDtlSubDtlRevenueCdgCd(String.valueOf(claimitemdetailsubdetailrevenuecoding.getCode()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailsubdetailrevenuecoding.hasUserSelected()) {
			c.setClmItmDtlSubDtlRevenueCdgUsrSltd(String.valueOf(claimitemdetailsubdetailrevenuecoding.getUserSelected()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Sys ********************************************************************************/
		if(claimitemdetailsubdetailrevenuecoding.hasSystem()) {
			c.setClmItmDtlSubDtlRevenueCdgSys(String.valueOf(claimitemdetailsubdetailrevenuecoding.getSystem()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Udi ********************************************************************************/
		if(claimitemdetailsubdetail.hasUdi()) {
			c.setClmItmDtlSubDtlUdi(String.valueOf(claimitemdetailsubdetail.getUdiFirstRep()));
		}
		/******************** claimitemdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimitemdetailquantity = claimitemdetail.getQuantity();

		/******************** Clm_Itm_Dtl_Qnty_Vl ********************************************************************************/
		if(claimitemdetailquantity.hasValue()) {
			c.setClmItmDtlQntyVl(String.valueOf(claimitemdetailquantity.getValue()));
		}
		/******************** claimitemdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator claimitemdetailquantitycomparator = claimitemdetailquantity.getComparator();
		c.setClmItmDtlQntyCmprtr(claimitemdetailquantitycomparator.toCode());

		/******************** Clm_Itm_Dtl_Qnty_Cd ********************************************************************************/
		if(claimitemdetailquantity.hasCode()) {
			c.setClmItmDtlQntyCd(String.valueOf(claimitemdetailquantity.getCode()));
		}
		/******************** Clm_Itm_Dtl_Qnty_Unt ********************************************************************************/
		if(claimitemdetailquantity.hasUnit()) {
			c.setClmItmDtlQntyUnt(String.valueOf(claimitemdetailquantity.getUnit()));
		}
		/******************** Clm_Itm_Dtl_Qnty_Sys ********************************************************************************/
		if(claimitemdetailquantity.hasSystem()) {
			c.setClmItmDtlQntySys(String.valueOf(claimitemdetailquantity.getSystem()));
		}
		/******************** claimitemdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimitemdetailunitprice = claimitemdetail.getUnitPrice();

		/******************** Clm_Itm_Dtl_UntPrice_Vl ********************************************************************************/
		if(claimitemdetailunitprice.hasValue()) {
			c.setClmItmDtlUntPriceVl(String.valueOf(claimitemdetailunitprice.getValue()));
		}
		/******************** Clm_Itm_Dtl_UntPrice_Crncy ********************************************************************************/
		if(claimitemdetailunitprice.hasCurrency()) {
			c.setClmItmDtlUntPriceCrncy(String.valueOf(claimitemdetailunitprice.getCurrency()));
		}
		/******************** Clm_Itm_Dtl_Factor ********************************************************************************/
		if(claimitemdetail.hasFactor()) {
			c.setClmItmDtlFactor(String.valueOf(claimitemdetail.getFactor()));
		}
		/******************** claimitemdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimitemdetailnet = claimitemdetail.getNet();

		/******************** Clm_Itm_Dtl_Net_Vl ********************************************************************************/
		if(claimitemdetailnet.hasValue()) {
			c.setClmItmDtlNetVl(String.valueOf(claimitemdetailnet.getValue()));
		}
		/******************** Clm_Itm_Dtl_Net_Crncy ********************************************************************************/
		if(claimitemdetailnet.hasCurrency()) {
			c.setClmItmDtlNetCrncy(String.valueOf(claimitemdetailnet.getCurrency()));
		}
		/******************** claimitemdetailcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailcategory = claimitemdetail.getCategory();

		/******************** Clm_Itm_Dtl_Ctgry_Txt ********************************************************************************/
		if(claimitemdetailcategory.hasText()) {
			c.setClmItmDtlCtgryTxt(String.valueOf(claimitemdetailcategory.getText()));
		}
		/******************** claimitemdetailcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailcategorycoding = claimitemdetailcategory.getCodingFirstRep();

		/******************** Clm_Itm_Dtl_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailcategorycoding.hasVersion()) {
			c.setClmItmDtlCtgryCdgVrsn(String.valueOf(claimitemdetailcategorycoding.getVersion()));
		}
		/******************** Clm_Itm_Dtl_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailcategorycoding.hasDisplay()) {
			c.setClmItmDtlCtgryCdgDsply(String.valueOf(claimitemdetailcategorycoding.getDisplay()));
		}
		/******************** Clm_Itm_Dtl_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimitemdetailcategorycoding.hasCode()) {
			c.setClmItmDtlCtgryCdgCd(String.valueOf(claimitemdetailcategorycoding.getCode()));
		}
		/******************** Clm_Itm_Dtl_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailcategorycoding.hasUserSelected()) {
			c.setClmItmDtlCtgryCdgUsrSltd(String.valueOf(claimitemdetailcategorycoding.getUserSelected()));
		}
		/******************** Clm_Itm_Dtl_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimitemdetailcategorycoding.hasSystem()) {
			c.setClmItmDtlCtgryCdgSys(String.valueOf(claimitemdetailcategorycoding.getSystem()));
		}
		/******************** claimitemdetailrevenue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailrevenue = claimitemdetail.getRevenue();

		/******************** Clm_Itm_Dtl_Revenue_Txt ********************************************************************************/
		if(claimitemdetailrevenue.hasText()) {
			c.setClmItmDtlRevenueTxt(String.valueOf(claimitemdetailrevenue.getText()));
		}
		/******************** claimitemdetailrevenuecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailrevenuecoding = claimitemdetailrevenue.getCodingFirstRep();

		/******************** Clm_Itm_Dtl_Revenue_Cdg_Vrsn ********************************************************************************/
		if(claimitemdetailrevenuecoding.hasVersion()) {
			c.setClmItmDtlRevenueCdgVrsn(String.valueOf(claimitemdetailrevenuecoding.getVersion()));
		}
		/******************** Clm_Itm_Dtl_Revenue_Cdg_Dsply ********************************************************************************/
		if(claimitemdetailrevenuecoding.hasDisplay()) {
			c.setClmItmDtlRevenueCdgDsply(String.valueOf(claimitemdetailrevenuecoding.getDisplay()));
		}
		/******************** Clm_Itm_Dtl_Revenue_Cdg_Cd ********************************************************************************/
		if(claimitemdetailrevenuecoding.hasCode()) {
			c.setClmItmDtlRevenueCdgCd(String.valueOf(claimitemdetailrevenuecoding.getCode()));
		}
		/******************** Clm_Itm_Dtl_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(claimitemdetailrevenuecoding.hasUserSelected()) {
			c.setClmItmDtlRevenueCdgUsrSltd(String.valueOf(claimitemdetailrevenuecoding.getUserSelected()));
		}
		/******************** Clm_Itm_Dtl_Revenue_Cdg_Sys ********************************************************************************/
		if(claimitemdetailrevenuecoding.hasSystem()) {
			c.setClmItmDtlRevenueCdgSys(String.valueOf(claimitemdetailrevenuecoding.getSystem()));
		}
		/******************** Clm_Itm_Dtl_Udi ********************************************************************************/
		if(claimitemdetail.hasUdi()) {
			c.setClmItmDtlUdi(String.valueOf(claimitemdetail.getUdiFirstRep()));
		}
		/******************** claimitemproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemproductorservice = claimitem.getProductOrService();

		/******************** Clm_Itm_PrdctOrSrv_Txt ********************************************************************************/
		if(claimitemproductorservice.hasText()) {
			c.setClmItmPrdctOrSrvTxt(String.valueOf(claimitemproductorservice.getText()));
		}
		/******************** claimitemproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemproductorservicecoding = claimitemproductorservice.getCodingFirstRep();

		/******************** Clm_Itm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(claimitemproductorservicecoding.hasVersion()) {
			c.setClmItmPrdctOrSrvCdgVrsn(String.valueOf(claimitemproductorservicecoding.getVersion()));
		}
		/******************** Clm_Itm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(claimitemproductorservicecoding.hasDisplay()) {
			c.setClmItmPrdctOrSrvCdgDsply(String.valueOf(claimitemproductorservicecoding.getDisplay()));
		}
		/******************** Clm_Itm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(claimitemproductorservicecoding.hasCode()) {
			c.setClmItmPrdctOrSrvCdgCd(String.valueOf(claimitemproductorservicecoding.getCode()));
		}
		/******************** Clm_Itm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(claimitemproductorservicecoding.hasUserSelected()) {
			c.setClmItmPrdctOrSrvCdgUsrSltd(String.valueOf(claimitemproductorservicecoding.getUserSelected()));
		}
		/******************** Clm_Itm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(claimitemproductorservicecoding.hasSystem()) {
			c.setClmItmPrdctOrSrvCdgSys(String.valueOf(claimitemproductorservicecoding.getSystem()));
		}
		/******************** claimitemmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemmodifier = claimitem.getModifierFirstRep();

		/******************** Clm_Itm_Mdfr_Txt ********************************************************************************/
		if(claimitemmodifier.hasText()) {
			c.setClmItmMdfrTxt(String.valueOf(claimitemmodifier.getText()));
		}
		/******************** claimitemmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemmodifiercoding = claimitemmodifier.getCodingFirstRep();

		/******************** Clm_Itm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(claimitemmodifiercoding.hasVersion()) {
			c.setClmItmMdfrCdgVrsn(String.valueOf(claimitemmodifiercoding.getVersion()));
		}
		/******************** Clm_Itm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(claimitemmodifiercoding.hasDisplay()) {
			c.setClmItmMdfrCdgDsply(String.valueOf(claimitemmodifiercoding.getDisplay()));
		}
		/******************** Clm_Itm_Mdfr_Cdg_Cd ********************************************************************************/
		if(claimitemmodifiercoding.hasCode()) {
			c.setClmItmMdfrCdgCd(String.valueOf(claimitemmodifiercoding.getCode()));
		}
		/******************** Clm_Itm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(claimitemmodifiercoding.hasUserSelected()) {
			c.setClmItmMdfrCdgUsrSltd(String.valueOf(claimitemmodifiercoding.getUserSelected()));
		}
		/******************** Clm_Itm_Mdfr_Cdg_Sys ********************************************************************************/
		if(claimitemmodifiercoding.hasSystem()) {
			c.setClmItmMdfrCdgSys(String.valueOf(claimitemmodifiercoding.getSystem()));
		}
		/******************** Clm_Itm_Enc ********************************************************************************/
		if(claimitem.hasEncounter()) {
			c.setClmItmEnc(String.valueOf(claimitem.getEncounterFirstRep()));
		}
		/******************** claimitemprogramcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemprogramcode = claimitem.getProgramCodeFirstRep();

		/******************** Clm_Itm_PrgrmCd_Txt ********************************************************************************/
		if(claimitemprogramcode.hasText()) {
			c.setClmItmPrgrmCdTxt(String.valueOf(claimitemprogramcode.getText()));
		}
		/******************** claimitemprogramcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemprogramcodecoding = claimitemprogramcode.getCodingFirstRep();

		/******************** Clm_Itm_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(claimitemprogramcodecoding.hasVersion()) {
			c.setClmItmPrgrmCdCdgVrsn(String.valueOf(claimitemprogramcodecoding.getVersion()));
		}
		/******************** Clm_Itm_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(claimitemprogramcodecoding.hasDisplay()) {
			c.setClmItmPrgrmCdCdgDsply(String.valueOf(claimitemprogramcodecoding.getDisplay()));
		}
		/******************** Clm_Itm_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(claimitemprogramcodecoding.hasCode()) {
			c.setClmItmPrgrmCdCdgCd(String.valueOf(claimitemprogramcodecoding.getCode()));
		}
		/******************** Clm_Itm_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(claimitemprogramcodecoding.hasUserSelected()) {
			c.setClmItmPrgrmCdCdgUsrSltd(String.valueOf(claimitemprogramcodecoding.getUserSelected()));
		}
		/******************** Clm_Itm_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(claimitemprogramcodecoding.hasSystem()) {
			c.setClmItmPrgrmCdCdgSys(String.valueOf(claimitemprogramcodecoding.getSystem()));
		}
		/******************** claimitemlocationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemlocationcodeableconcept = claimitem.getLocationCodeableConcept();

		/******************** Clm_Itm_LctnCdbleCncpt_Txt ********************************************************************************/
		if(claimitemlocationcodeableconcept.hasText()) {
			c.setClmItmLctnCdbleCncptTxt(String.valueOf(claimitemlocationcodeableconcept.getText()));
		}
		/******************** claimitemlocationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemlocationcodeableconceptcoding = claimitemlocationcodeableconcept.getCodingFirstRep();

		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(claimitemlocationcodeableconceptcoding.hasVersion()) {
			c.setClmItmLctnCdbleCncptCdgVrsn(String.valueOf(claimitemlocationcodeableconceptcoding.getVersion()));
		}
		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(claimitemlocationcodeableconceptcoding.hasDisplay()) {
			c.setClmItmLctnCdbleCncptCdgDsply(String.valueOf(claimitemlocationcodeableconceptcoding.getDisplay()));
		}
		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(claimitemlocationcodeableconceptcoding.hasCode()) {
			c.setClmItmLctnCdbleCncptCdgCd(String.valueOf(claimitemlocationcodeableconceptcoding.getCode()));
		}
		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(claimitemlocationcodeableconceptcoding.hasUserSelected()) {
			c.setClmItmLctnCdbleCncptCdgUsrSltd(String.valueOf(claimitemlocationcodeableconceptcoding.getUserSelected()));
		}
		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(claimitemlocationcodeableconceptcoding.hasSystem()) {
			c.setClmItmLctnCdbleCncptCdgSys(String.valueOf(claimitemlocationcodeableconceptcoding.getSystem()));
		}
		/******************** claimitemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimitemquantity = claimitem.getQuantity();

		/******************** Clm_Itm_Qnty_Vl ********************************************************************************/
		if(claimitemquantity.hasValue()) {
			c.setClmItmQntyVl(String.valueOf(claimitemquantity.getValue()));
		}
		/******************** claimitemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator claimitemquantitycomparator = claimitemquantity.getComparator();
		c.setClmItmQntyCmprtr(claimitemquantitycomparator.toCode());

		/******************** Clm_Itm_Qnty_Cd ********************************************************************************/
		if(claimitemquantity.hasCode()) {
			c.setClmItmQntyCd(String.valueOf(claimitemquantity.getCode()));
		}
		/******************** Clm_Itm_Qnty_Unt ********************************************************************************/
		if(claimitemquantity.hasUnit()) {
			c.setClmItmQntyUnt(String.valueOf(claimitemquantity.getUnit()));
		}
		/******************** Clm_Itm_Qnty_Sys ********************************************************************************/
		if(claimitemquantity.hasSystem()) {
			c.setClmItmQntySys(String.valueOf(claimitemquantity.getSystem()));
		}
		/******************** claimitemunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimitemunitprice = claimitem.getUnitPrice();

		/******************** Clm_Itm_UntPrice_Vl ********************************************************************************/
		if(claimitemunitprice.hasValue()) {
			c.setClmItmUntPriceVl(String.valueOf(claimitemunitprice.getValue()));
		}
		/******************** Clm_Itm_UntPrice_Crncy ********************************************************************************/
		if(claimitemunitprice.hasCurrency()) {
			c.setClmItmUntPriceCrncy(String.valueOf(claimitemunitprice.getCurrency()));
		}
		/******************** Clm_Itm_Factor ********************************************************************************/
		if(claimitem.hasFactor()) {
			c.setClmItmFactor(String.valueOf(claimitem.getFactor()));
		}
		/******************** claimitemnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimitemnet = claimitem.getNet();

		/******************** Clm_Itm_Net_Vl ********************************************************************************/
		if(claimitemnet.hasValue()) {
			c.setClmItmNetVl(String.valueOf(claimitemnet.getValue()));
		}
		/******************** Clm_Itm_Net_Crncy ********************************************************************************/
		if(claimitemnet.hasCurrency()) {
			c.setClmItmNetCrncy(String.valueOf(claimitemnet.getCurrency()));
		}
		/******************** claimitemservicedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimitemservicedperiod = claimitem.getServicedPeriod();

		/******************** Clm_Itm_SrvdPrd_Strt ********************************************************************************/
		if(claimitemservicedperiod.hasStart()) {
			c.setClmItmSrvdPrdStrt(String.valueOf(claimitemservicedperiod.getStart()));
		}
		/******************** Clm_Itm_SrvdPrd_End ********************************************************************************/
		if(claimitemservicedperiod.hasEnd()) {
			c.setClmItmSrvdPrdEnd(String.valueOf(claimitemservicedperiod.getEnd()));
		}
		/******************** claimitembodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitembodysite = claimitem.getBodySite();

		/******************** Clm_Itm_BodySite_Txt ********************************************************************************/
		if(claimitembodysite.hasText()) {
			c.setClmItmBodySiteTxt(String.valueOf(claimitembodysite.getText()));
		}
		/******************** claimitembodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitembodysitecoding = claimitembodysite.getCodingFirstRep();

		/******************** Clm_Itm_BodySite_Cdg_Vrsn ********************************************************************************/
		if(claimitembodysitecoding.hasVersion()) {
			c.setClmItmBodySiteCdgVrsn(String.valueOf(claimitembodysitecoding.getVersion()));
		}
		/******************** Clm_Itm_BodySite_Cdg_Dsply ********************************************************************************/
		if(claimitembodysitecoding.hasDisplay()) {
			c.setClmItmBodySiteCdgDsply(String.valueOf(claimitembodysitecoding.getDisplay()));
		}
		/******************** Clm_Itm_BodySite_Cdg_Cd ********************************************************************************/
		if(claimitembodysitecoding.hasCode()) {
			c.setClmItmBodySiteCdgCd(String.valueOf(claimitembodysitecoding.getCode()));
		}
		/******************** Clm_Itm_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(claimitembodysitecoding.hasUserSelected()) {
			c.setClmItmBodySiteCdgUsrSltd(String.valueOf(claimitembodysitecoding.getUserSelected()));
		}
		/******************** Clm_Itm_BodySite_Cdg_Sys ********************************************************************************/
		if(claimitembodysitecoding.hasSystem()) {
			c.setClmItmBodySiteCdgSys(String.valueOf(claimitembodysitecoding.getSystem()));
		}
		/******************** claimitemcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemcategory = claimitem.getCategory();

		/******************** Clm_Itm_Ctgry_Txt ********************************************************************************/
		if(claimitemcategory.hasText()) {
			c.setClmItmCtgryTxt(String.valueOf(claimitemcategory.getText()));
		}
		/******************** claimitemcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemcategorycoding = claimitemcategory.getCodingFirstRep();

		/******************** Clm_Itm_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimitemcategorycoding.hasVersion()) {
			c.setClmItmCtgryCdgVrsn(String.valueOf(claimitemcategorycoding.getVersion()));
		}
		/******************** Clm_Itm_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimitemcategorycoding.hasDisplay()) {
			c.setClmItmCtgryCdgDsply(String.valueOf(claimitemcategorycoding.getDisplay()));
		}
		/******************** Clm_Itm_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimitemcategorycoding.hasCode()) {
			c.setClmItmCtgryCdgCd(String.valueOf(claimitemcategorycoding.getCode()));
		}
		/******************** Clm_Itm_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimitemcategorycoding.hasUserSelected()) {
			c.setClmItmCtgryCdgUsrSltd(String.valueOf(claimitemcategorycoding.getUserSelected()));
		}
		/******************** Clm_Itm_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimitemcategorycoding.hasSystem()) {
			c.setClmItmCtgryCdgSys(String.valueOf(claimitemcategorycoding.getSystem()));
		}
		/******************** Clm_Itm_SrvdDtTyp ********************************************************************************/
		if(claimitem.hasServicedDateType()) {
			c.setClmItmSrvdDtTyp(String.valueOf(claimitem.getServicedDateType()));
		}
		/******************** claimitemrevenue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemrevenue = claimitem.getRevenue();

		/******************** Clm_Itm_Revenue_Txt ********************************************************************************/
		if(claimitemrevenue.hasText()) {
			c.setClmItmRevenueTxt(String.valueOf(claimitemrevenue.getText()));
		}
		/******************** claimitemrevenuecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemrevenuecoding = claimitemrevenue.getCodingFirstRep();

		/******************** Clm_Itm_Revenue_Cdg_Vrsn ********************************************************************************/
		if(claimitemrevenuecoding.hasVersion()) {
			c.setClmItmRevenueCdgVrsn(String.valueOf(claimitemrevenuecoding.getVersion()));
		}
		/******************** Clm_Itm_Revenue_Cdg_Dsply ********************************************************************************/
		if(claimitemrevenuecoding.hasDisplay()) {
			c.setClmItmRevenueCdgDsply(String.valueOf(claimitemrevenuecoding.getDisplay()));
		}
		/******************** Clm_Itm_Revenue_Cdg_Cd ********************************************************************************/
		if(claimitemrevenuecoding.hasCode()) {
			c.setClmItmRevenueCdgCd(String.valueOf(claimitemrevenuecoding.getCode()));
		}
		/******************** Clm_Itm_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(claimitemrevenuecoding.hasUserSelected()) {
			c.setClmItmRevenueCdgUsrSltd(String.valueOf(claimitemrevenuecoding.getUserSelected()));
		}
		/******************** Clm_Itm_Revenue_Cdg_Sys ********************************************************************************/
		if(claimitemrevenuecoding.hasSystem()) {
			c.setClmItmRevenueCdgSys(String.valueOf(claimitemrevenuecoding.getSystem()));
		}
		/******************** Clm_Itm_Udi ********************************************************************************/
		if(claimitem.hasUdi()) {
			c.setClmItmUdi(String.valueOf(claimitem.getUdiFirstRep()));
		}
		/******************** claimitemsubsite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemsubsite = claimitem.getSubSiteFirstRep();

		/******************** Clm_Itm_SubSite_Txt ********************************************************************************/
		if(claimitemsubsite.hasText()) {
			c.setClmItmSubSiteTxt(String.valueOf(claimitemsubsite.getText()));
		}
		/******************** claimitemsubsitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemsubsitecoding = claimitemsubsite.getCodingFirstRep();

		/******************** Clm_Itm_SubSite_Cdg_Vrsn ********************************************************************************/
		if(claimitemsubsitecoding.hasVersion()) {
			c.setClmItmSubSiteCdgVrsn(String.valueOf(claimitemsubsitecoding.getVersion()));
		}
		/******************** Clm_Itm_SubSite_Cdg_Dsply ********************************************************************************/
		if(claimitemsubsitecoding.hasDisplay()) {
			c.setClmItmSubSiteCdgDsply(String.valueOf(claimitemsubsitecoding.getDisplay()));
		}
		/******************** Clm_Itm_SubSite_Cdg_Cd ********************************************************************************/
		if(claimitemsubsitecoding.hasCode()) {
			c.setClmItmSubSiteCdgCd(String.valueOf(claimitemsubsitecoding.getCode()));
		}
		/******************** Clm_Itm_SubSite_Cdg_UsrSltd ********************************************************************************/
		if(claimitemsubsitecoding.hasUserSelected()) {
			c.setClmItmSubSiteCdgUsrSltd(String.valueOf(claimitemsubsitecoding.getUserSelected()));
		}
		/******************** Clm_Itm_SubSite_Cdg_Sys ********************************************************************************/
		if(claimitemsubsitecoding.hasSystem()) {
			c.setClmItmSubSiteCdgSys(String.valueOf(claimitemsubsitecoding.getSystem()));
		}
		/******************** claimpayee ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.PayeeComponent claimpayee = claim.getPayee();

		/******************** claimpayeetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimpayeetype = claimpayee.getType();

		/******************** Clm_Payee_Typ_Txt ********************************************************************************/
		if(claimpayeetype.hasText()) {
			c.setClmPayeeTypTxt(String.valueOf(claimpayeetype.getText()));
		}
		/******************** claimpayeetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimpayeetypecoding = claimpayeetype.getCodingFirstRep();

		/******************** Clm_Payee_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimpayeetypecoding.hasVersion()) {
			c.setClmPayeeTypCdgVrsn(String.valueOf(claimpayeetypecoding.getVersion()));
		}
		/******************** Clm_Payee_Typ_Cdg_Dsply ********************************************************************************/
		if(claimpayeetypecoding.hasDisplay()) {
			c.setClmPayeeTypCdgDsply(String.valueOf(claimpayeetypecoding.getDisplay()));
		}
		/******************** Clm_Payee_Typ_Cdg_Cd ********************************************************************************/
		if(claimpayeetypecoding.hasCode()) {
			c.setClmPayeeTypCdgCd(String.valueOf(claimpayeetypecoding.getCode()));
		}
		/******************** Clm_Payee_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimpayeetypecoding.hasUserSelected()) {
			c.setClmPayeeTypCdgUsrSltd(String.valueOf(claimpayeetypecoding.getUserSelected()));
		}
		/******************** Clm_Payee_Typ_Cdg_Sys ********************************************************************************/
		if(claimpayeetypecoding.hasSystem()) {
			c.setClmPayeeTypCdgSys(String.valueOf(claimpayeetypecoding.getSystem()));
		}
		/******************** Clm_Payee_Party ********************************************************************************/
		if(claimpayee.hasParty()) {
			c.setClmPayeeParty(String.valueOf(claimpayee.getParty()));
		}
		/******************** claimdiagnosis ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.DiagnosisComponent claimdiagnosis = claim.getDiagnosisFirstRep();

		/******************** Clm_Dgnsis_Sqnc ********************************************************************************/
		if(claimdiagnosis.hasSequence()) {
			c.setClmDgnsisSqnc(String.valueOf(claimdiagnosis.getSequence()));
		}
		/******************** claimdiagnosistype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimdiagnosistype = claimdiagnosis.getTypeFirstRep();

		/******************** Clm_Dgnsis_Typ_Txt ********************************************************************************/
		if(claimdiagnosistype.hasText()) {
			c.setClmDgnsisTypTxt(String.valueOf(claimdiagnosistype.getText()));
		}
		/******************** claimdiagnosistypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimdiagnosistypecoding = claimdiagnosistype.getCodingFirstRep();

		/******************** Clm_Dgnsis_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimdiagnosistypecoding.hasVersion()) {
			c.setClmDgnsisTypCdgVrsn(String.valueOf(claimdiagnosistypecoding.getVersion()));
		}
		/******************** Clm_Dgnsis_Typ_Cdg_Dsply ********************************************************************************/
		if(claimdiagnosistypecoding.hasDisplay()) {
			c.setClmDgnsisTypCdgDsply(String.valueOf(claimdiagnosistypecoding.getDisplay()));
		}
		/******************** Clm_Dgnsis_Typ_Cdg_Cd ********************************************************************************/
		if(claimdiagnosistypecoding.hasCode()) {
			c.setClmDgnsisTypCdgCd(String.valueOf(claimdiagnosistypecoding.getCode()));
		}
		/******************** Clm_Dgnsis_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimdiagnosistypecoding.hasUserSelected()) {
			c.setClmDgnsisTypCdgUsrSltd(String.valueOf(claimdiagnosistypecoding.getUserSelected()));
		}
		/******************** Clm_Dgnsis_Typ_Cdg_Sys ********************************************************************************/
		if(claimdiagnosistypecoding.hasSystem()) {
			c.setClmDgnsisTypCdgSys(String.valueOf(claimdiagnosistypecoding.getSystem()));
		}
		/******************** claimdiagnosisdiagnosiscodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimdiagnosisdiagnosiscodeableconcept = claimdiagnosis.getDiagnosisCodeableConcept();

		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Txt ********************************************************************************/
		if(claimdiagnosisdiagnosiscodeableconcept.hasText()) {
			c.setClmDgnsisDgnsisCdbleCncptTxt(String.valueOf(claimdiagnosisdiagnosiscodeableconcept.getText()));
		}
		/******************** claimdiagnosisdiagnosiscodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimdiagnosisdiagnosiscodeableconceptcoding = claimdiagnosisdiagnosiscodeableconcept.getCodingFirstRep();

		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(claimdiagnosisdiagnosiscodeableconceptcoding.hasVersion()) {
			c.setClmDgnsisDgnsisCdbleCncptCdgVrsn(String.valueOf(claimdiagnosisdiagnosiscodeableconceptcoding.getVersion()));
		}
		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(claimdiagnosisdiagnosiscodeableconceptcoding.hasDisplay()) {
			c.setClmDgnsisDgnsisCdbleCncptCdgDsply(String.valueOf(claimdiagnosisdiagnosiscodeableconceptcoding.getDisplay()));
		}
		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(claimdiagnosisdiagnosiscodeableconceptcoding.hasCode()) {
			c.setClmDgnsisDgnsisCdbleCncptCdgCd(String.valueOf(claimdiagnosisdiagnosiscodeableconceptcoding.getCode()));
		}
		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(claimdiagnosisdiagnosiscodeableconceptcoding.hasUserSelected()) {
			c.setClmDgnsisDgnsisCdbleCncptCdgUsrSltd(String.valueOf(claimdiagnosisdiagnosiscodeableconceptcoding.getUserSelected()));
		}
		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(claimdiagnosisdiagnosiscodeableconceptcoding.hasSystem()) {
			c.setClmDgnsisDgnsisCdbleCncptCdgSys(String.valueOf(claimdiagnosisdiagnosiscodeableconceptcoding.getSystem()));
		}
		/******************** claimdiagnosispackagecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimdiagnosispackagecode = claimdiagnosis.getPackageCode();

		/******************** Clm_Dgnsis_PckgCd_Txt ********************************************************************************/
		if(claimdiagnosispackagecode.hasText()) {
			c.setClmDgnsisPckgCdTxt(String.valueOf(claimdiagnosispackagecode.getText()));
		}
		/******************** claimdiagnosispackagecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimdiagnosispackagecodecoding = claimdiagnosispackagecode.getCodingFirstRep();

		/******************** Clm_Dgnsis_PckgCd_Cdg_Vrsn ********************************************************************************/
		if(claimdiagnosispackagecodecoding.hasVersion()) {
			c.setClmDgnsisPckgCdCdgVrsn(String.valueOf(claimdiagnosispackagecodecoding.getVersion()));
		}
		/******************** Clm_Dgnsis_PckgCd_Cdg_Dsply ********************************************************************************/
		if(claimdiagnosispackagecodecoding.hasDisplay()) {
			c.setClmDgnsisPckgCdCdgDsply(String.valueOf(claimdiagnosispackagecodecoding.getDisplay()));
		}
		/******************** Clm_Dgnsis_PckgCd_Cdg_Cd ********************************************************************************/
		if(claimdiagnosispackagecodecoding.hasCode()) {
			c.setClmDgnsisPckgCdCdgCd(String.valueOf(claimdiagnosispackagecodecoding.getCode()));
		}
		/******************** Clm_Dgnsis_PckgCd_Cdg_UsrSltd ********************************************************************************/
		if(claimdiagnosispackagecodecoding.hasUserSelected()) {
			c.setClmDgnsisPckgCdCdgUsrSltd(String.valueOf(claimdiagnosispackagecodecoding.getUserSelected()));
		}
		/******************** Clm_Dgnsis_PckgCd_Cdg_Sys ********************************************************************************/
		if(claimdiagnosispackagecodecoding.hasSystem()) {
			c.setClmDgnsisPckgCdCdgSys(String.valueOf(claimdiagnosispackagecodecoding.getSystem()));
		}
		/******************** claimdiagnosisonadmission ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimdiagnosisonadmission = claimdiagnosis.getOnAdmission();

		/******************** Clm_Dgnsis_OnAdmission_Txt ********************************************************************************/
		if(claimdiagnosisonadmission.hasText()) {
			c.setClmDgnsisOnAdmissionTxt(String.valueOf(claimdiagnosisonadmission.getText()));
		}
		/******************** claimdiagnosisonadmissioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimdiagnosisonadmissioncoding = claimdiagnosisonadmission.getCodingFirstRep();

		/******************** Clm_Dgnsis_OnAdmission_Cdg_Vrsn ********************************************************************************/
		if(claimdiagnosisonadmissioncoding.hasVersion()) {
			c.setClmDgnsisOnAdmissionCdgVrsn(String.valueOf(claimdiagnosisonadmissioncoding.getVersion()));
		}
		/******************** Clm_Dgnsis_OnAdmission_Cdg_Dsply ********************************************************************************/
		if(claimdiagnosisonadmissioncoding.hasDisplay()) {
			c.setClmDgnsisOnAdmissionCdgDsply(String.valueOf(claimdiagnosisonadmissioncoding.getDisplay()));
		}
		/******************** Clm_Dgnsis_OnAdmission_Cdg_Cd ********************************************************************************/
		if(claimdiagnosisonadmissioncoding.hasCode()) {
			c.setClmDgnsisOnAdmissionCdgCd(String.valueOf(claimdiagnosisonadmissioncoding.getCode()));
		}
		/******************** Clm_Dgnsis_OnAdmission_Cdg_UsrSltd ********************************************************************************/
		if(claimdiagnosisonadmissioncoding.hasUserSelected()) {
			c.setClmDgnsisOnAdmissionCdgUsrSltd(String.valueOf(claimdiagnosisonadmissioncoding.getUserSelected()));
		}
		/******************** Clm_Dgnsis_OnAdmission_Cdg_Sys ********************************************************************************/
		if(claimdiagnosisonadmissioncoding.hasSystem()) {
			c.setClmDgnsisOnAdmissionCdgSys(String.valueOf(claimdiagnosisonadmissioncoding.getSystem()));
		}
		/******************** claimsupportinginfo ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.SupportingInformationComponent claimsupportinginfo = claim.getSupportingInfoFirstRep();

		/******************** claimsupportinginforeason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimsupportinginforeason = claimsupportinginfo.getReason();

		/******************** Clm_SprtingInfo_Rsn_Txt ********************************************************************************/
		if(claimsupportinginforeason.hasText()) {
			c.setClmSprtingInfoRsnTxt(String.valueOf(claimsupportinginforeason.getText()));
		}
		/******************** claimsupportinginforeasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimsupportinginforeasoncoding = claimsupportinginforeason.getCodingFirstRep();

		/******************** Clm_SprtingInfo_Rsn_Cdg_Vrsn ********************************************************************************/
		if(claimsupportinginforeasoncoding.hasVersion()) {
			c.setClmSprtingInfoRsnCdgVrsn(String.valueOf(claimsupportinginforeasoncoding.getVersion()));
		}
		/******************** Clm_SprtingInfo_Rsn_Cdg_Dsply ********************************************************************************/
		if(claimsupportinginforeasoncoding.hasDisplay()) {
			c.setClmSprtingInfoRsnCdgDsply(String.valueOf(claimsupportinginforeasoncoding.getDisplay()));
		}
		/******************** Clm_SprtingInfo_Rsn_Cdg_Cd ********************************************************************************/
		if(claimsupportinginforeasoncoding.hasCode()) {
			c.setClmSprtingInfoRsnCdgCd(String.valueOf(claimsupportinginforeasoncoding.getCode()));
		}
		/******************** Clm_SprtingInfo_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(claimsupportinginforeasoncoding.hasUserSelected()) {
			c.setClmSprtingInfoRsnCdgUsrSltd(String.valueOf(claimsupportinginforeasoncoding.getUserSelected()));
		}
		/******************** Clm_SprtingInfo_Rsn_Cdg_Sys ********************************************************************************/
		if(claimsupportinginforeasoncoding.hasSystem()) {
			c.setClmSprtingInfoRsnCdgSys(String.valueOf(claimsupportinginforeasoncoding.getSystem()));
		}
		/******************** claimsupportinginfocode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimsupportinginfocode = claimsupportinginfo.getCode();

		/******************** Clm_SprtingInfo_Cd_Txt ********************************************************************************/
		if(claimsupportinginfocode.hasText()) {
			c.setClmSprtingInfoCdTxt(String.valueOf(claimsupportinginfocode.getText()));
		}
		/******************** claimsupportinginfocodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimsupportinginfocodecoding = claimsupportinginfocode.getCodingFirstRep();

		/******************** Clm_SprtingInfo_Cd_Cdg_Vrsn ********************************************************************************/
		if(claimsupportinginfocodecoding.hasVersion()) {
			c.setClmSprtingInfoCdCdgVrsn(String.valueOf(claimsupportinginfocodecoding.getVersion()));
		}
		/******************** Clm_SprtingInfo_Cd_Cdg_Dsply ********************************************************************************/
		if(claimsupportinginfocodecoding.hasDisplay()) {
			c.setClmSprtingInfoCdCdgDsply(String.valueOf(claimsupportinginfocodecoding.getDisplay()));
		}
		/******************** Clm_SprtingInfo_Cd_Cdg_Cd ********************************************************************************/
		if(claimsupportinginfocodecoding.hasCode()) {
			c.setClmSprtingInfoCdCdgCd(String.valueOf(claimsupportinginfocodecoding.getCode()));
		}
		/******************** Clm_SprtingInfo_Cd_Cdg_UsrSltd ********************************************************************************/
		if(claimsupportinginfocodecoding.hasUserSelected()) {
			c.setClmSprtingInfoCdCdgUsrSltd(String.valueOf(claimsupportinginfocodecoding.getUserSelected()));
		}
		/******************** Clm_SprtingInfo_Cd_Cdg_Sys ********************************************************************************/
		if(claimsupportinginfocodecoding.hasSystem()) {
			c.setClmSprtingInfoCdCdgSys(String.valueOf(claimsupportinginfocodecoding.getSystem()));
		}
		/******************** Clm_SprtingInfo_VlBooleanTyp ********************************************************************************/
		if(claimsupportinginfo.hasValueBooleanType()) {
			c.setClmSprtingInfoVlBooleanTyp(String.valueOf(claimsupportinginfo.getValueBooleanType()));
		}
		/******************** Clm_SprtingInfo_Sqnc ********************************************************************************/
		if(claimsupportinginfo.hasSequence()) {
			c.setClmSprtingInfoSqnc(String.valueOf(claimsupportinginfo.getSequence()));
		}
		/******************** Clm_SprtingInfo_TmgDtTyp ********************************************************************************/
		if(claimsupportinginfo.hasTimingDateType()) {
			c.setClmSprtingInfoTmgDtTyp(String.valueOf(claimsupportinginfo.getTimingDateType()));
		}
		/******************** claimsupportinginfovaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimsupportinginfovaluequantity = claimsupportinginfo.getValueQuantity();

		/******************** Clm_SprtingInfo_VlQnty_Vl ********************************************************************************/
		if(claimsupportinginfovaluequantity.hasValue()) {
			c.setClmSprtingInfoVlQntyVl(String.valueOf(claimsupportinginfovaluequantity.getValue()));
		}
		/******************** claimsupportinginfovaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator claimsupportinginfovaluequantitycomparator = claimsupportinginfovaluequantity.getComparator();
		c.setClmSprtingInfoVlQntyCmprtr(claimsupportinginfovaluequantitycomparator.toCode());

		/******************** Clm_SprtingInfo_VlQnty_Cd ********************************************************************************/
		if(claimsupportinginfovaluequantity.hasCode()) {
			c.setClmSprtingInfoVlQntyCd(String.valueOf(claimsupportinginfovaluequantity.getCode()));
		}
		/******************** Clm_SprtingInfo_VlQnty_Unt ********************************************************************************/
		if(claimsupportinginfovaluequantity.hasUnit()) {
			c.setClmSprtingInfoVlQntyUnt(String.valueOf(claimsupportinginfovaluequantity.getUnit()));
		}
		/******************** Clm_SprtingInfo_VlQnty_Sys ********************************************************************************/
		if(claimsupportinginfovaluequantity.hasSystem()) {
			c.setClmSprtingInfoVlQntySys(String.valueOf(claimsupportinginfovaluequantity.getSystem()));
		}
		/******************** Clm_SprtingInfo_VlStrgTyp ********************************************************************************/
		if(claimsupportinginfo.hasValueStringType()) {
			c.setClmSprtingInfoVlStrgTyp(String.valueOf(claimsupportinginfo.getValueStringType()));
		}
		/******************** Clm_SprtingInfo_VlRfrnc ********************************************************************************/
		if(claimsupportinginfo.hasValueReference()) {
			c.setClmSprtingInfoVlRfrnc(String.valueOf(claimsupportinginfo.getValueReference()));
		}
		/******************** claimsupportinginfovalueattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment claimsupportinginfovalueattachment = claimsupportinginfo.getValueAttachment();

		/******************** Clm_SprtingInfo_VlAttchmnt_Sz ********************************************************************************/
		if(claimsupportinginfovalueattachment.hasSize()) {
			c.setClmSprtingInfoVlAttchmntSz(String.valueOf(claimsupportinginfovalueattachment.getSize()));
		}
		/******************** Clm_SprtingInfo_VlAttchmnt_Lnguage ********************************************************************************/
		if(claimsupportinginfovalueattachment.hasLanguage()) {
			c.setClmSprtingInfoVlAttchmntLnguage(String.valueOf(claimsupportinginfovalueattachment.getLanguage()));
		}
		/******************** Clm_SprtingInfo_VlAttchmnt_CntntTyp ********************************************************************************/
		if(claimsupportinginfovalueattachment.hasContentType()) {
			c.setClmSprtingInfoVlAttchmntCntntTyp(String.valueOf(claimsupportinginfovalueattachment.getContentType()));
		}
		/******************** Clm_SprtingInfo_VlAttchmnt_Ttl ********************************************************************************/
		if(claimsupportinginfovalueattachment.hasTitle()) {
			c.setClmSprtingInfoVlAttchmntTtl(String.valueOf(claimsupportinginfovalueattachment.getTitle()));
		}
		/******************** Clm_SprtingInfo_VlAttchmnt_Url ********************************************************************************/
		if(claimsupportinginfovalueattachment.hasUrl()) {
			c.setClmSprtingInfoVlAttchmntUrl(String.valueOf(claimsupportinginfovalueattachment.getUrl()));
		}
		/******************** Clm_SprtingInfo_VlAttchmnt_Data ********************************************************************************/
		if(claimsupportinginfovalueattachment.hasData()) {
			c.setClmSprtingInfoVlAttchmntData(String.valueOf(claimsupportinginfovalueattachment.getData()));
		}

		/******************** Clm_SprtingInfo_VlAttchmnt_Hash ********************************************************************************/
		if(claimsupportinginfovalueattachment.hasHash()) {
			c.setClmSprtingInfoVlAttchmntHash(String.valueOf(claimsupportinginfovalueattachment.getHash()));
		}

		/******************** Clm_SprtingInfo_VlAttchmnt_Creation ********************************************************************************/
		if(claimsupportinginfovalueattachment.hasCreation()) {
			c.setClmSprtingInfoVlAttchmntCreation(String.valueOf(claimsupportinginfovalueattachment.getCreation()));
		}
		/******************** claimsupportinginfocategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimsupportinginfocategory = claimsupportinginfo.getCategory();

		/******************** Clm_SprtingInfo_Ctgry_Txt ********************************************************************************/
		if(claimsupportinginfocategory.hasText()) {
			c.setClmSprtingInfoCtgryTxt(String.valueOf(claimsupportinginfocategory.getText()));
		}
		/******************** claimsupportinginfocategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimsupportinginfocategorycoding = claimsupportinginfocategory.getCodingFirstRep();

		/******************** Clm_SprtingInfo_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(claimsupportinginfocategorycoding.hasVersion()) {
			c.setClmSprtingInfoCtgryCdgVrsn(String.valueOf(claimsupportinginfocategorycoding.getVersion()));
		}
		/******************** Clm_SprtingInfo_Ctgry_Cdg_Dsply ********************************************************************************/
		if(claimsupportinginfocategorycoding.hasDisplay()) {
			c.setClmSprtingInfoCtgryCdgDsply(String.valueOf(claimsupportinginfocategorycoding.getDisplay()));
		}
		/******************** Clm_SprtingInfo_Ctgry_Cdg_Cd ********************************************************************************/
		if(claimsupportinginfocategorycoding.hasCode()) {
			c.setClmSprtingInfoCtgryCdgCd(String.valueOf(claimsupportinginfocategorycoding.getCode()));
		}
		/******************** Clm_SprtingInfo_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(claimsupportinginfocategorycoding.hasUserSelected()) {
			c.setClmSprtingInfoCtgryCdgUsrSltd(String.valueOf(claimsupportinginfocategorycoding.getUserSelected()));
		}
		/******************** Clm_SprtingInfo_Ctgry_Cdg_Sys ********************************************************************************/
		if(claimsupportinginfocategorycoding.hasSystem()) {
			c.setClmSprtingInfoCtgryCdgSys(String.valueOf(claimsupportinginfocategorycoding.getSystem()));
		}
		/******************** claimsupportinginfotimingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimsupportinginfotimingperiod = claimsupportinginfo.getTimingPeriod();

		/******************** Clm_SprtingInfo_TmgPrd_Strt ********************************************************************************/
		if(claimsupportinginfotimingperiod.hasStart()) {
			c.setClmSprtingInfoTmgPrdStrt(String.valueOf(claimsupportinginfotimingperiod.getStart()));
		}
		/******************** Clm_SprtingInfo_TmgPrd_End ********************************************************************************/
		if(claimsupportinginfotimingperiod.hasEnd()) {
			c.setClmSprtingInfoTmgPrdEnd(String.valueOf(claimsupportinginfotimingperiod.getEnd()));
		}
		/******************** claiminsurance ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.InsuranceComponent claiminsurance = claim.getInsuranceFirstRep();

		/******************** Clm_Insrnc_Sqnc ********************************************************************************/
		if(claiminsurance.hasSequence()) {
			c.setClmInsrncSqnc(String.valueOf(claiminsurance.getSequence()));
		}
		/******************** Clm_Insrnc_Cvg ********************************************************************************/
		if(claiminsurance.hasCoverage()) {
			c.setClmInsrncCvg(String.valueOf(claiminsurance.getCoverage()));
		}
		/******************** Clm_Insrnc_BusinessArrangement ********************************************************************************/
		if(claiminsurance.hasBusinessArrangement()) {
			c.setClmInsrncBusinessArrangement(String.valueOf(claiminsurance.getBusinessArrangement()));
		}
		/******************** claiminsuranceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier claiminsuranceidentifier = claiminsurance.getIdentifier();

		/******************** Clm_Insrnc_Id_Vl ********************************************************************************/
		if(claiminsuranceidentifier.hasValue()) {
			c.setClmInsrncIdVl(String.valueOf(claiminsuranceidentifier.getValue()));
		}
		/******************** claiminsuranceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claiminsuranceidentifiertype = claiminsuranceidentifier.getType();

		/******************** Clm_Insrnc_Id_Typ_Txt ********************************************************************************/
		if(claiminsuranceidentifiertype.hasText()) {
			c.setClmInsrncIdTypTxt(String.valueOf(claiminsuranceidentifiertype.getText()));
		}
		/******************** claiminsuranceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claiminsuranceidentifiertypecoding = claiminsuranceidentifiertype.getCodingFirstRep();

		/******************** Clm_Insrnc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(claiminsuranceidentifiertypecoding.hasVersion()) {
			c.setClmInsrncIdTypCdgVrsn(String.valueOf(claiminsuranceidentifiertypecoding.getVersion()));
		}
		/******************** Clm_Insrnc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(claiminsuranceidentifiertypecoding.hasDisplay()) {
			c.setClmInsrncIdTypCdgDsply(String.valueOf(claiminsuranceidentifiertypecoding.getDisplay()));
		}
		/******************** Clm_Insrnc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(claiminsuranceidentifiertypecoding.hasCode()) {
			c.setClmInsrncIdTypCdgCd(String.valueOf(claiminsuranceidentifiertypecoding.getCode()));
		}
		/******************** Clm_Insrnc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claiminsuranceidentifiertypecoding.hasUserSelected()) {
			c.setClmInsrncIdTypCdgUsrSltd(String.valueOf(claiminsuranceidentifiertypecoding.getUserSelected()));
		}
		/******************** Clm_Insrnc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(claiminsuranceidentifiertypecoding.hasSystem()) {
			c.setClmInsrncIdTypCdgSys(String.valueOf(claiminsuranceidentifiertypecoding.getSystem()));
		}
		/******************** claiminsuranceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claiminsuranceidentifierperiod = claiminsuranceidentifier.getPeriod();

		/******************** Clm_Insrnc_Id_Prd_Strt ********************************************************************************/
		if(claiminsuranceidentifierperiod.hasStart()) {
			c.setClmInsrncIdPrdStrt(String.valueOf(claiminsuranceidentifierperiod.getStart()));
		}
		/******************** Clm_Insrnc_Id_Prd_End ********************************************************************************/
		if(claiminsuranceidentifierperiod.hasEnd()) {
			c.setClmInsrncIdPrdEnd(String.valueOf(claiminsuranceidentifierperiod.getEnd()));
		}
		/******************** Clm_Insrnc_Id_Assigner ********************************************************************************/
		if(claiminsuranceidentifier.hasAssigner()) {
			c.setClmInsrncIdAssigner(String.valueOf(claiminsuranceidentifier.getAssigner()));
		}
		/******************** Clm_Insrnc_Id_Sys ********************************************************************************/
		if(claiminsuranceidentifier.hasSystem()) {
			c.setClmInsrncIdSys(String.valueOf(claiminsuranceidentifier.getSystem()));
		}
		/******************** claiminsuranceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse claiminsuranceidentifieruse = claiminsuranceidentifier.getUse();
		c.setClmInsrncIdUse(claiminsuranceidentifieruse.toCode());

		/******************** Clm_Insrnc_ClmRsps ********************************************************************************/
		if(claiminsurance.hasClaimResponse()) {
			c.setClmInsrncClmRsps(String.valueOf(claiminsurance.getClaimResponse()));
		}
		/******************** Clm_Insrnc_Focal ********************************************************************************/
		if(claiminsurance.hasFocal()) {
			c.setClmInsrncFocal(String.valueOf(claiminsurance.getFocal()));
		}
		/******************** claimidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier claimidentifier = claim.getIdentifierFirstRep();

		/******************** Clm_Id_Vl ********************************************************************************/
		if(claimidentifier.hasValue()) {
			c.setClmIdVl(String.valueOf(claimidentifier.getValue()));
		}
		/******************** claimidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimidentifiertype = claimidentifier.getType();

		/******************** Clm_Id_Typ_Txt ********************************************************************************/
		if(claimidentifiertype.hasText()) {
			c.setClmIdTypTxt(String.valueOf(claimidentifiertype.getText()));
		}
		/******************** claimidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimidentifiertypecoding = claimidentifiertype.getCodingFirstRep();

		/******************** Clm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(claimidentifiertypecoding.hasVersion()) {
			c.setClmIdTypCdgVrsn(String.valueOf(claimidentifiertypecoding.getVersion()));
		}
		/******************** Clm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(claimidentifiertypecoding.hasDisplay()) {
			c.setClmIdTypCdgDsply(String.valueOf(claimidentifiertypecoding.getDisplay()));
		}
		/******************** Clm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(claimidentifiertypecoding.hasCode()) {
			c.setClmIdTypCdgCd(String.valueOf(claimidentifiertypecoding.getCode()));
		}
		/******************** Clm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(claimidentifiertypecoding.hasUserSelected()) {
			c.setClmIdTypCdgUsrSltd(String.valueOf(claimidentifiertypecoding.getUserSelected()));
		}
		/******************** Clm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(claimidentifiertypecoding.hasSystem()) {
			c.setClmIdTypCdgSys(String.valueOf(claimidentifiertypecoding.getSystem()));
		}
		/******************** claimidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimidentifierperiod = claimidentifier.getPeriod();

		/******************** Clm_Id_Prd_Strt ********************************************************************************/
		if(claimidentifierperiod.hasStart()) {
			c.setClmIdPrdStrt(String.valueOf(claimidentifierperiod.getStart()));
		}
		/******************** Clm_Id_Prd_End ********************************************************************************/
		if(claimidentifierperiod.hasEnd()) {
			c.setClmIdPrdEnd(String.valueOf(claimidentifierperiod.getEnd()));
		}
		/******************** Clm_Id_Assigner ********************************************************************************/
		if(claimidentifier.hasAssigner()) {
			c.setClmIdAssigner(String.valueOf(claimidentifier.getAssigner()));
		}
		/******************** Clm_Id_Sys ********************************************************************************/
		if(claimidentifier.hasSystem()) {
			c.setClmIdSys(String.valueOf(claimidentifier.getSystem()));
		}
		/******************** claimidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse claimidentifieruse = claimidentifier.getUse();
		c.setClmIdUse(claimidentifieruse.toCode());

		return c;
	}
}
