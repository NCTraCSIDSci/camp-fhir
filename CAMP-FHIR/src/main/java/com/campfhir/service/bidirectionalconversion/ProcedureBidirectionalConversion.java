package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Procedure;
public class ProcedureBidirectionalConversion 
{
	public Procedure Procedures(org.hl7.fhir.r4.model.Procedure procedure) throws ParseException
	{
		 main.java.com.campfhir.model.Procedure p = new  main.java.com.campfhir.model.Procedure();

		/******************** id ********************************************************************************/
		procedure.setId(p.getId());

		/******************** Prcdr_Lctn ********************************************************************************/
		if(procedure.hasLocation()) {
			p.setPrcdrLctn(String.valueOf(procedure.getLocation()));
		}
		/******************** procedurecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurecode = procedure.getCode();

		/******************** procedurecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedurecodecoding = procedurecode.getCodingFirstRep();

		/******************** Prcdr_Cd_Cdg_Dsply ********************************************************************************/
		if(procedurecodecoding.hasDisplay()) {
			p.setPrcdrCdCdgDsply(String.valueOf(procedurecodecoding.getDisplay()));
		}
		/******************** Prcdr_Cd_Cdg_Vrsn ********************************************************************************/
		if(procedurecodecoding.hasVersion()) {
			p.setPrcdrCdCdgVrsn(String.valueOf(procedurecodecoding.getVersion()));
		}
		/******************** Prcdr_Cd_Cdg_Cd ********************************************************************************/
		if(procedurecodecoding.hasCode()) {
			p.setPrcdrCdCdgCd(String.valueOf(procedurecodecoding.getCode()));
		}
		/******************** Prcdr_Cd_Cdg_Sys ********************************************************************************/
		if(procedurecodecoding.hasSystem()) {
			p.setPrcdrCdCdgSys(String.valueOf(procedurecodecoding.getSystem()));
		}
		/******************** Prcdr_Cd_Cdg_UsrSltd ********************************************************************************/
		if(procedurecodecoding.hasUserSelected()) {
			p.setPrcdrCdCdgUsrSltd(String.valueOf(procedurecodecoding.getUserSelected()));
		}
		/******************** Prcdr_Cd_Txt ********************************************************************************/
		if(procedurecode.hasText()) {
			p.setPrcdrCdTxt(String.valueOf(procedurecode.getText()));
		}
		/******************** Prcdr_UsedRfrnc ********************************************************************************/
		if(procedure.hasUsedReference()) {
			p.setPrcdrUsedRfrnc(String.valueOf(procedure.getUsedReferenceFirstRep()));
		}
		/******************** procedureusedcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedureusedcode = procedure.getUsedCodeFirstRep();

		/******************** procedureusedcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedureusedcodecoding = procedureusedcode.getCodingFirstRep();

		/******************** Prcdr_UsedCd_Cdg_Dsply ********************************************************************************/
		if(procedureusedcodecoding.hasDisplay()) {
			p.setPrcdrUsedCdCdgDsply(String.valueOf(procedureusedcodecoding.getDisplay()));
		}
		/******************** Prcdr_UsedCd_Cdg_Vrsn ********************************************************************************/
		if(procedureusedcodecoding.hasVersion()) {
			p.setPrcdrUsedCdCdgVrsn(String.valueOf(procedureusedcodecoding.getVersion()));
		}
		/******************** Prcdr_UsedCd_Cdg_Cd ********************************************************************************/
		if(procedureusedcodecoding.hasCode()) {
			p.setPrcdrUsedCdCdgCd(String.valueOf(procedureusedcodecoding.getCode()));
		}
		/******************** Prcdr_UsedCd_Cdg_Sys ********************************************************************************/
		if(procedureusedcodecoding.hasSystem()) {
			p.setPrcdrUsedCdCdgSys(String.valueOf(procedureusedcodecoding.getSystem()));
		}
		/******************** Prcdr_UsedCd_Cdg_UsrSltd ********************************************************************************/
		if(procedureusedcodecoding.hasUserSelected()) {
			p.setPrcdrUsedCdCdgUsrSltd(String.valueOf(procedureusedcodecoding.getUserSelected()));
		}
		/******************** Prcdr_UsedCd_Txt ********************************************************************************/
		if(procedureusedcode.hasText()) {
			p.setPrcdrUsedCdTxt(String.valueOf(procedureusedcode.getText()));
		}
		/******************** Prcdr_ComplicationDtl ********************************************************************************/
		if(procedure.hasComplicationDetail()) {
			p.setPrcdrComplicationDtl(String.valueOf(procedure.getComplicationDetailFirstRep()));
		}
		/******************** procedurefocaldevice ********************************************************************************/
		org.hl7.fhir.r4.model.Procedure.ProcedureFocalDeviceComponent procedurefocaldevice = procedure.getFocalDeviceFirstRep();

		/******************** procedurefocaldeviceaction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurefocaldeviceaction = procedurefocaldevice.getAction();

		/******************** procedurefocaldeviceactioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedurefocaldeviceactioncoding = procedurefocaldeviceaction.getCodingFirstRep();

		/******************** Prcdr_FocalDvc_Actn_Cdg_Dsply ********************************************************************************/
		if(procedurefocaldeviceactioncoding.hasDisplay()) {
			p.setPrcdrFocalDvcActnCdgDsply(String.valueOf(procedurefocaldeviceactioncoding.getDisplay()));
		}
		/******************** Prcdr_FocalDvc_Actn_Cdg_Vrsn ********************************************************************************/
		if(procedurefocaldeviceactioncoding.hasVersion()) {
			p.setPrcdrFocalDvcActnCdgVrsn(String.valueOf(procedurefocaldeviceactioncoding.getVersion()));
		}
		/******************** Prcdr_FocalDvc_Actn_Cdg_Cd ********************************************************************************/
		if(procedurefocaldeviceactioncoding.hasCode()) {
			p.setPrcdrFocalDvcActnCdgCd(String.valueOf(procedurefocaldeviceactioncoding.getCode()));
		}
		/******************** Prcdr_FocalDvc_Actn_Cdg_Sys ********************************************************************************/
		if(procedurefocaldeviceactioncoding.hasSystem()) {
			p.setPrcdrFocalDvcActnCdgSys(String.valueOf(procedurefocaldeviceactioncoding.getSystem()));
		}
		/******************** Prcdr_FocalDvc_Actn_Cdg_UsrSltd ********************************************************************************/
		if(procedurefocaldeviceactioncoding.hasUserSelected()) {
			p.setPrcdrFocalDvcActnCdgUsrSltd(String.valueOf(procedurefocaldeviceactioncoding.getUserSelected()));
		}
		/******************** Prcdr_FocalDvc_Actn_Txt ********************************************************************************/
		if(procedurefocaldeviceaction.hasText()) {
			p.setPrcdrFocalDvcActnTxt(String.valueOf(procedurefocaldeviceaction.getText()));
		}
		/******************** Prcdr_FocalDvc_Manipulated ********************************************************************************/
		if(procedurefocaldevice.hasManipulated()) {
			p.setPrcdrFocalDvcManipulated(String.valueOf(procedurefocaldevice.getManipulated()));
		}
		/******************** Prcdr_PerformedDtTimeTyp ********************************************************************************/
		if(procedure.hasPerformedDateTimeType()) {
			p.setPrcdrPerformedDtTimeTyp(String.valueOf(procedure.getPerformedDateTimeType()));
		}
		/******************** Prcdr_PerformedStrgTyp ********************************************************************************/
		if(procedure.hasPerformedStringType()) {
			p.setPrcdrPerformedStrgTyp(String.valueOf(procedure.getPerformedStringType()));
		}
		/******************** procedurefollowup ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurefollowup = procedure.getFollowUpFirstRep();

		/******************** procedurefollowupcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedurefollowupcoding = procedurefollowup.getCodingFirstRep();

		/******************** Prcdr_FollowUp_Cdg_Dsply ********************************************************************************/
		if(procedurefollowupcoding.hasDisplay()) {
			p.setPrcdrFollowUpCdgDsply(String.valueOf(procedurefollowupcoding.getDisplay()));
		}
		/******************** Prcdr_FollowUp_Cdg_Vrsn ********************************************************************************/
		if(procedurefollowupcoding.hasVersion()) {
			p.setPrcdrFollowUpCdgVrsn(String.valueOf(procedurefollowupcoding.getVersion()));
		}
		/******************** Prcdr_FollowUp_Cdg_Cd ********************************************************************************/
		if(procedurefollowupcoding.hasCode()) {
			p.setPrcdrFollowUpCdgCd(String.valueOf(procedurefollowupcoding.getCode()));
		}
		/******************** Prcdr_FollowUp_Cdg_Sys ********************************************************************************/
		if(procedurefollowupcoding.hasSystem()) {
			p.setPrcdrFollowUpCdgSys(String.valueOf(procedurefollowupcoding.getSystem()));
		}
		/******************** Prcdr_FollowUp_Cdg_UsrSltd ********************************************************************************/
		if(procedurefollowupcoding.hasUserSelected()) {
			p.setPrcdrFollowUpCdgUsrSltd(String.valueOf(procedurefollowupcoding.getUserSelected()));
		}
		/******************** Prcdr_FollowUp_Txt ********************************************************************************/
		if(procedurefollowup.hasText()) {
			p.setPrcdrFollowUpTxt(String.valueOf(procedurefollowup.getText()));
		}
		/******************** procedurecomplication ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurecomplication = procedure.getComplicationFirstRep();

		/******************** procedurecomplicationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedurecomplicationcoding = procedurecomplication.getCodingFirstRep();

		/******************** Prcdr_Complication_Cdg_Dsply ********************************************************************************/
		if(procedurecomplicationcoding.hasDisplay()) {
			p.setPrcdrComplicationCdgDsply(String.valueOf(procedurecomplicationcoding.getDisplay()));
		}
		/******************** Prcdr_Complication_Cdg_Vrsn ********************************************************************************/
		if(procedurecomplicationcoding.hasVersion()) {
			p.setPrcdrComplicationCdgVrsn(String.valueOf(procedurecomplicationcoding.getVersion()));
		}
		/******************** Prcdr_Complication_Cdg_Cd ********************************************************************************/
		if(procedurecomplicationcoding.hasCode()) {
			p.setPrcdrComplicationCdgCd(String.valueOf(procedurecomplicationcoding.getCode()));
		}
		/******************** Prcdr_Complication_Cdg_Sys ********************************************************************************/
		if(procedurecomplicationcoding.hasSystem()) {
			p.setPrcdrComplicationCdgSys(String.valueOf(procedurecomplicationcoding.getSystem()));
		}
		/******************** Prcdr_Complication_Cdg_UsrSltd ********************************************************************************/
		if(procedurecomplicationcoding.hasUserSelected()) {
			p.setPrcdrComplicationCdgUsrSltd(String.valueOf(procedurecomplicationcoding.getUserSelected()));
		}
		/******************** Prcdr_Complication_Txt ********************************************************************************/
		if(procedurecomplication.hasText()) {
			p.setPrcdrComplicationTxt(String.valueOf(procedurecomplication.getText()));
		}
		/******************** procedureperformer ********************************************************************************/
		org.hl7.fhir.r4.model.Procedure.ProcedurePerformerComponent procedureperformer = procedure.getPerformerFirstRep();

		/******************** procedureperformerfunction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedureperformerfunction = procedureperformer.getFunction();

		/******************** procedureperformerfunctioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedureperformerfunctioncoding = procedureperformerfunction.getCodingFirstRep();

		/******************** Prcdr_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(procedureperformerfunctioncoding.hasDisplay()) {
			p.setPrcdrPrfrmrFunctionCdgDsply(String.valueOf(procedureperformerfunctioncoding.getDisplay()));
		}
		/******************** Prcdr_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(procedureperformerfunctioncoding.hasVersion()) {
			p.setPrcdrPrfrmrFunctionCdgVrsn(String.valueOf(procedureperformerfunctioncoding.getVersion()));
		}
		/******************** Prcdr_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(procedureperformerfunctioncoding.hasCode()) {
			p.setPrcdrPrfrmrFunctionCdgCd(String.valueOf(procedureperformerfunctioncoding.getCode()));
		}
		/******************** Prcdr_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(procedureperformerfunctioncoding.hasSystem()) {
			p.setPrcdrPrfrmrFunctionCdgSys(String.valueOf(procedureperformerfunctioncoding.getSystem()));
		}
		/******************** Prcdr_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(procedureperformerfunctioncoding.hasUserSelected()) {
			p.setPrcdrPrfrmrFunctionCdgUsrSltd(String.valueOf(procedureperformerfunctioncoding.getUserSelected()));
		}
		/******************** Prcdr_Prfrmr_Function_Txt ********************************************************************************/
		if(procedureperformerfunction.hasText()) {
			p.setPrcdrPrfrmrFunctionTxt(String.valueOf(procedureperformerfunction.getText()));
		}
		/******************** Prcdr_Prfrmr_Actor ********************************************************************************/
		if(procedureperformer.hasActor()) {
			p.setPrcdrPrfrmrActor(String.valueOf(procedureperformer.getActor()));
		}
		/******************** Prcdr_Prfrmr_OnBehalfOf ********************************************************************************/
		if(procedureperformer.hasOnBehalfOf()) {
			p.setPrcdrPrfrmrOnBehalfOf(String.valueOf(procedureperformer.getOnBehalfOf()));
		}
		/******************** Prcdr_Sbjct ********************************************************************************/
		if(procedure.hasSubject()) {
			p.setPrcdrSbjct(String.valueOf(procedure.getSubject()));
		}
		/******************** procedurestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Procedure.ProcedureStatus procedurestatus = procedure.getStatus();
		p.setPrcdrSts(procedurestatus.toCode());

		/******************** Prcdr_Enc ********************************************************************************/
		if(procedure.hasEncounter()) {
			p.setPrcdrEnc(String.valueOf(procedure.getEncounter()));
		}
		/******************** Prcdr_BasedOn ********************************************************************************/
		if(procedure.hasBasedOn()) {
			p.setPrcdrBasedOn(String.valueOf(procedure.getBasedOnFirstRep()));
		}
		/******************** procedurenote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation procedurenote = procedure.getNoteFirstRep();

		/******************** Prcdr_Nt_Time ********************************************************************************/
		if(procedurenote.hasTime()) {
			p.setPrcdrNtTime(String.valueOf(procedurenote.getTime()));
		}
		/******************** Prcdr_Nt_AthrRfrnc ********************************************************************************/
		if(procedurenote.hasAuthorReference()) {
			p.setPrcdrNtAthrRfrnc(String.valueOf(procedurenote.getAuthorReference()));
		}
		/******************** Prcdr_Nt_Txt ********************************************************************************/
		if(procedurenote.hasText()) {
			p.setPrcdrNtTxt(String.valueOf(procedurenote.getText()));
		}
		/******************** Prcdr_Nt_AthrStrgTyp ********************************************************************************/
		if(procedurenote.hasAuthorStringType()) {
			p.setPrcdrNtAthrStrgTyp(String.valueOf(procedurenote.getAuthorStringType()));
		}
		/******************** procedureoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedureoutcome = procedure.getOutcome();

		/******************** procedureoutcomecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedureoutcomecoding = procedureoutcome.getCodingFirstRep();

		/******************** Prcdr_Outcome_Cdg_Dsply ********************************************************************************/
		if(procedureoutcomecoding.hasDisplay()) {
			p.setPrcdrOutcomeCdgDsply(String.valueOf(procedureoutcomecoding.getDisplay()));
		}
		/******************** Prcdr_Outcome_Cdg_Vrsn ********************************************************************************/
		if(procedureoutcomecoding.hasVersion()) {
			p.setPrcdrOutcomeCdgVrsn(String.valueOf(procedureoutcomecoding.getVersion()));
		}
		/******************** Prcdr_Outcome_Cdg_Cd ********************************************************************************/
		if(procedureoutcomecoding.hasCode()) {
			p.setPrcdrOutcomeCdgCd(String.valueOf(procedureoutcomecoding.getCode()));
		}
		/******************** Prcdr_Outcome_Cdg_Sys ********************************************************************************/
		if(procedureoutcomecoding.hasSystem()) {
			p.setPrcdrOutcomeCdgSys(String.valueOf(procedureoutcomecoding.getSystem()));
		}
		/******************** Prcdr_Outcome_Cdg_UsrSltd ********************************************************************************/
		if(procedureoutcomecoding.hasUserSelected()) {
			p.setPrcdrOutcomeCdgUsrSltd(String.valueOf(procedureoutcomecoding.getUserSelected()));
		}
		/******************** Prcdr_Outcome_Txt ********************************************************************************/
		if(procedureoutcome.hasText()) {
			p.setPrcdrOutcomeTxt(String.valueOf(procedureoutcome.getText()));
		}
		/******************** procedurecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurecategory = procedure.getCategory();

		/******************** procedurecategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedurecategorycoding = procedurecategory.getCodingFirstRep();

		/******************** Prcdr_Ctgry_Cdg_Dsply ********************************************************************************/
		if(procedurecategorycoding.hasDisplay()) {
			p.setPrcdrCtgryCdgDsply(String.valueOf(procedurecategorycoding.getDisplay()));
		}
		/******************** Prcdr_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(procedurecategorycoding.hasVersion()) {
			p.setPrcdrCtgryCdgVrsn(String.valueOf(procedurecategorycoding.getVersion()));
		}
		/******************** Prcdr_Ctgry_Cdg_Cd ********************************************************************************/
		if(procedurecategorycoding.hasCode()) {
			p.setPrcdrCtgryCdgCd(String.valueOf(procedurecategorycoding.getCode()));
		}
		/******************** Prcdr_Ctgry_Cdg_Sys ********************************************************************************/
		if(procedurecategorycoding.hasSystem()) {
			p.setPrcdrCtgryCdgSys(String.valueOf(procedurecategorycoding.getSystem()));
		}
		/******************** Prcdr_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(procedurecategorycoding.hasUserSelected()) {
			p.setPrcdrCtgryCdgUsrSltd(String.valueOf(procedurecategorycoding.getUserSelected()));
		}
		/******************** Prcdr_Ctgry_Txt ********************************************************************************/
		if(procedurecategory.hasText()) {
			p.setPrcdrCtgryTxt(String.valueOf(procedurecategory.getText()));
		}
		/******************** Prcdr_Asserter ********************************************************************************/
		if(procedure.hasAsserter()) {
			p.setPrcdrAsserter(String.valueOf(procedure.getAsserter()));
		}
		/******************** Prcdr_Recorder ********************************************************************************/
		if(procedure.hasRecorder()) {
			p.setPrcdrRecorder(String.valueOf(procedure.getRecorder()));
		}
		/******************** procedurestatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurestatusreason = procedure.getStatusReason();

		/******************** procedurestatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedurestatusreasoncoding = procedurestatusreason.getCodingFirstRep();

		/******************** Prcdr_StsRsn_Cdg_Dsply ********************************************************************************/
		if(procedurestatusreasoncoding.hasDisplay()) {
			p.setPrcdrStsRsnCdgDsply(String.valueOf(procedurestatusreasoncoding.getDisplay()));
		}
		/******************** Prcdr_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(procedurestatusreasoncoding.hasVersion()) {
			p.setPrcdrStsRsnCdgVrsn(String.valueOf(procedurestatusreasoncoding.getVersion()));
		}
		/******************** Prcdr_StsRsn_Cdg_Cd ********************************************************************************/
		if(procedurestatusreasoncoding.hasCode()) {
			p.setPrcdrStsRsnCdgCd(String.valueOf(procedurestatusreasoncoding.getCode()));
		}
		/******************** Prcdr_StsRsn_Cdg_Sys ********************************************************************************/
		if(procedurestatusreasoncoding.hasSystem()) {
			p.setPrcdrStsRsnCdgSys(String.valueOf(procedurestatusreasoncoding.getSystem()));
		}
		/******************** Prcdr_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(procedurestatusreasoncoding.hasUserSelected()) {
			p.setPrcdrStsRsnCdgUsrSltd(String.valueOf(procedurestatusreasoncoding.getUserSelected()));
		}
		/******************** Prcdr_StsRsn_Txt ********************************************************************************/
		if(procedurestatusreason.hasText()) {
			p.setPrcdrStsRsnTxt(String.valueOf(procedurestatusreason.getText()));
		}
		/******************** Prcdr_RsnRfrnc ********************************************************************************/
		if(procedure.hasReasonReference()) {
			p.setPrcdrRsnRfrnc(String.valueOf(procedure.getReasonReferenceFirstRep()));
		}
		/******************** procedurereasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurereasoncode = procedure.getReasonCodeFirstRep();

		/******************** procedurereasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedurereasoncodecoding = procedurereasoncode.getCodingFirstRep();

		/******************** Prcdr_RsnCd_Cdg_Dsply ********************************************************************************/
		if(procedurereasoncodecoding.hasDisplay()) {
			p.setPrcdrRsnCdCdgDsply(String.valueOf(procedurereasoncodecoding.getDisplay()));
		}
		/******************** Prcdr_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(procedurereasoncodecoding.hasVersion()) {
			p.setPrcdrRsnCdCdgVrsn(String.valueOf(procedurereasoncodecoding.getVersion()));
		}
		/******************** Prcdr_RsnCd_Cdg_Cd ********************************************************************************/
		if(procedurereasoncodecoding.hasCode()) {
			p.setPrcdrRsnCdCdgCd(String.valueOf(procedurereasoncodecoding.getCode()));
		}
		/******************** Prcdr_RsnCd_Cdg_Sys ********************************************************************************/
		if(procedurereasoncodecoding.hasSystem()) {
			p.setPrcdrRsnCdCdgSys(String.valueOf(procedurereasoncodecoding.getSystem()));
		}
		/******************** Prcdr_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(procedurereasoncodecoding.hasUserSelected()) {
			p.setPrcdrRsnCdCdgUsrSltd(String.valueOf(procedurereasoncodecoding.getUserSelected()));
		}
		/******************** Prcdr_RsnCd_Txt ********************************************************************************/
		if(procedurereasoncode.hasText()) {
			p.setPrcdrRsnCdTxt(String.valueOf(procedurereasoncode.getText()));
		}
		/******************** procedurebodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedurebodysite = procedure.getBodySiteFirstRep();

		/******************** procedurebodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedurebodysitecoding = procedurebodysite.getCodingFirstRep();

		/******************** Prcdr_BodySite_Cdg_Dsply ********************************************************************************/
		if(procedurebodysitecoding.hasDisplay()) {
			p.setPrcdrBodySiteCdgDsply(String.valueOf(procedurebodysitecoding.getDisplay()));
		}
		/******************** Prcdr_BodySite_Cdg_Vrsn ********************************************************************************/
		if(procedurebodysitecoding.hasVersion()) {
			p.setPrcdrBodySiteCdgVrsn(String.valueOf(procedurebodysitecoding.getVersion()));
		}
		/******************** Prcdr_BodySite_Cdg_Cd ********************************************************************************/
		if(procedurebodysitecoding.hasCode()) {
			p.setPrcdrBodySiteCdgCd(String.valueOf(procedurebodysitecoding.getCode()));
		}
		/******************** Prcdr_BodySite_Cdg_Sys ********************************************************************************/
		if(procedurebodysitecoding.hasSystem()) {
			p.setPrcdrBodySiteCdgSys(String.valueOf(procedurebodysitecoding.getSystem()));
		}
		/******************** Prcdr_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(procedurebodysitecoding.hasUserSelected()) {
			p.setPrcdrBodySiteCdgUsrSltd(String.valueOf(procedurebodysitecoding.getUserSelected()));
		}
		/******************** Prcdr_BodySite_Txt ********************************************************************************/
		if(procedurebodysite.hasText()) {
			p.setPrcdrBodySiteTxt(String.valueOf(procedurebodysite.getText()));
		}
		/******************** procedureperformedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period procedureperformedperiod = procedure.getPerformedPeriod();

		/******************** Prcdr_PerformedPrd_End ********************************************************************************/
		if(procedureperformedperiod.hasEnd()) {
			p.setPrcdrPerformedPrdEnd(String.valueOf(procedureperformedperiod.getEnd()));
		}
		/******************** Prcdr_PerformedPrd_Strt ********************************************************************************/
		if(procedureperformedperiod.hasStart()) {
			p.setPrcdrPerformedPrdStrt(String.valueOf(procedureperformedperiod.getStart()));
		}
		/******************** procedureperformedage ********************************************************************************/
		org.hl7.fhir.r4.model.Age procedureperformedage = procedure.getPerformedAge();

		/******************** procedureperformedrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range procedureperformedrange = procedure.getPerformedRange();

		/******************** procedureperformedrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity procedureperformedrangelow = procedureperformedrange.getLow();

		/******************** Prcdr_PerformedRng_Lw_Vl ********************************************************************************/
		if(procedureperformedrangelow.hasValue()) {
			p.setPrcdrPerformedRngLwVl(String.valueOf(procedureperformedrangelow.getValue()));
		}
		/******************** procedureperformedrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator procedureperformedrangelowcomparator = procedureperformedrangelow.getComparator();
		p.setPrcdrPerformedRngLwCmprtr(procedureperformedrangelowcomparator.toCode());

		/******************** Prcdr_PerformedRng_Lw_Cd ********************************************************************************/
		if(procedureperformedrangelow.hasCode()) {
			p.setPrcdrPerformedRngLwCd(String.valueOf(procedureperformedrangelow.getCode()));
		}
		/******************** Prcdr_PerformedRng_Lw_Sys ********************************************************************************/
		if(procedureperformedrangelow.hasSystem()) {
			p.setPrcdrPerformedRngLwSys(String.valueOf(procedureperformedrangelow.getSystem()));
		}
		/******************** Prcdr_PerformedRng_Lw_Unt ********************************************************************************/
		if(procedureperformedrangelow.hasUnit()) {
			p.setPrcdrPerformedRngLwUnt(String.valueOf(procedureperformedrangelow.getUnit()));
		}
		/******************** procedureperformedrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity procedureperformedrangehigh = procedureperformedrange.getHigh();

		/******************** Prcdr_PerformedRng_Hi_Vl ********************************************************************************/
		if(procedureperformedrangehigh.hasValue()) {
			p.setPrcdrPerformedRngHiVl(String.valueOf(procedureperformedrangehigh.getValue()));
		}
		/******************** procedureperformedrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator procedureperformedrangehighcomparator = procedureperformedrangehigh.getComparator();
		p.setPrcdrPerformedRngHiCmprtr(procedureperformedrangehighcomparator.toCode());

		/******************** Prcdr_PerformedRng_Hi_Cd ********************************************************************************/
		if(procedureperformedrangehigh.hasCode()) {
			p.setPrcdrPerformedRngHiCd(String.valueOf(procedureperformedrangehigh.getCode()));
		}
		/******************** Prcdr_PerformedRng_Hi_Sys ********************************************************************************/
		if(procedureperformedrangehigh.hasSystem()) {
			p.setPrcdrPerformedRngHiSys(String.valueOf(procedureperformedrangehigh.getSystem()));
		}
		/******************** Prcdr_PerformedRng_Hi_Unt ********************************************************************************/
		if(procedureperformedrangehigh.hasUnit()) {
			p.setPrcdrPerformedRngHiUnt(String.valueOf(procedureperformedrangehigh.getUnit()));
		}
		/******************** Prcdr_Rpt ********************************************************************************/
		if(procedure.hasReport()) {
			p.setPrcdrRpt(String.valueOf(procedure.getReportFirstRep()));
		}
		/******************** Prcdr_PartOf ********************************************************************************/
		if(procedure.hasPartOf()) {
			p.setPrcdrPartOf(String.valueOf(procedure.getPartOfFirstRep()));
		}
		/******************** procedureidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier procedureidentifier = procedure.getIdentifierFirstRep();

		/******************** Prcdr_Id_Vl ********************************************************************************/
		if(procedureidentifier.hasValue()) {
			p.setPrcdrIdVl(String.valueOf(procedureidentifier.getValue()));
		}
		/******************** procedureidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept procedureidentifiertype = procedureidentifier.getType();

		/******************** procedureidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding procedureidentifiertypecoding = procedureidentifiertype.getCodingFirstRep();

		/******************** Prcdr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(procedureidentifiertypecoding.hasDisplay()) {
			p.setPrcdrIdTypCdgDsply(String.valueOf(procedureidentifiertypecoding.getDisplay()));
		}
		/******************** Prcdr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(procedureidentifiertypecoding.hasVersion()) {
			p.setPrcdrIdTypCdgVrsn(String.valueOf(procedureidentifiertypecoding.getVersion()));
		}
		/******************** Prcdr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(procedureidentifiertypecoding.hasCode()) {
			p.setPrcdrIdTypCdgCd(String.valueOf(procedureidentifiertypecoding.getCode()));
		}
		/******************** Prcdr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(procedureidentifiertypecoding.hasSystem()) {
			p.setPrcdrIdTypCdgSys(String.valueOf(procedureidentifiertypecoding.getSystem()));
		}
		/******************** Prcdr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(procedureidentifiertypecoding.hasUserSelected()) {
			p.setPrcdrIdTypCdgUsrSltd(String.valueOf(procedureidentifiertypecoding.getUserSelected()));
		}
		/******************** Prcdr_Id_Typ_Txt ********************************************************************************/
		if(procedureidentifiertype.hasText()) {
			p.setPrcdrIdTypTxt(String.valueOf(procedureidentifiertype.getText()));
		}
		/******************** Prcdr_Id_Sys ********************************************************************************/
		if(procedureidentifier.hasSystem()) {
			p.setPrcdrIdSys(String.valueOf(procedureidentifier.getSystem()));
		}
		/******************** Prcdr_Id_Assigner ********************************************************************************/
		if(procedureidentifier.hasAssigner()) {
			p.setPrcdrIdAssigner(String.valueOf(procedureidentifier.getAssigner()));
		}
		/******************** procedureidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period procedureidentifierperiod = procedureidentifier.getPeriod();

		/******************** Prcdr_Id_Prd_End ********************************************************************************/
		if(procedureidentifierperiod.hasEnd()) {
			p.setPrcdrIdPrdEnd(String.valueOf(procedureidentifierperiod.getEnd()));
		}
		/******************** Prcdr_Id_Prd_Strt ********************************************************************************/
		if(procedureidentifierperiod.hasStart()) {
			p.setPrcdrIdPrdStrt(String.valueOf(procedureidentifierperiod.getStart()));
		}
		/******************** procedureidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse procedureidentifieruse = procedureidentifier.getUse();
		p.setPrcdrIdUse(procedureidentifieruse.toCode());

		return p;
	}
}
