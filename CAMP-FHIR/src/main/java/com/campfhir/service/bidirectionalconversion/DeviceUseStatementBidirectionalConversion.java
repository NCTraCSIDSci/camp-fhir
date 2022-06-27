package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DeviceUseStatement;
public class DeviceUseStatementBidirectionalConversion 
{
	public DeviceUseStatement DeviceUseStatements(org.hl7.fhir.r4.model.DeviceUseStatement deviceusestatement) throws ParseException
	{
		 main.java.com.campfhir.model.DeviceUseStatement d = new  main.java.com.campfhir.model.DeviceUseStatement();

		/******************** id ********************************************************************************/
		deviceusestatement.setId(d.getId());

		/******************** DvcUseStmnt_Src ********************************************************************************/
		if(deviceusestatement.hasSource()) {
			d.setDvcUseStmntSrc(String.valueOf(deviceusestatement.getSource()));
		}
		/******************** DvcUseStmnt_Sbjct ********************************************************************************/
		if(deviceusestatement.hasSubject()) {
			d.setDvcUseStmntSbjct(String.valueOf(deviceusestatement.getSubject()));
		}
		/******************** deviceusestatementstatus ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceUseStatement.DeviceUseStatementStatus deviceusestatementstatus = deviceusestatement.getStatus();
		d.setDvcUseStmntSts(deviceusestatementstatus.toCode());

		/******************** DvcUseStmnt_BasedOn ********************************************************************************/
		if(deviceusestatement.hasBasedOn()) {
			d.setDvcUseStmntBasedOn(String.valueOf(deviceusestatement.getBasedOnFirstRep()));
		}
		/******************** deviceusestatementnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation deviceusestatementnote = deviceusestatement.getNoteFirstRep();

		/******************** DvcUseStmnt_Nt_Time ********************************************************************************/
		if(deviceusestatementnote.hasTime()) {
			d.setDvcUseStmntNtTime(String.valueOf(deviceusestatementnote.getTime()));
		}
		/******************** DvcUseStmnt_Nt_Txt ********************************************************************************/
		if(deviceusestatementnote.hasText()) {
			d.setDvcUseStmntNtTxt(String.valueOf(deviceusestatementnote.getText()));
		}
		/******************** DvcUseStmnt_Nt_AthrRfrnc ********************************************************************************/
		if(deviceusestatementnote.hasAuthorReference()) {
			d.setDvcUseStmntNtAthrRfrnc(String.valueOf(deviceusestatementnote.getAuthorReference()));
		}
		/******************** DvcUseStmnt_Nt_AthrStrgTyp ********************************************************************************/
		if(deviceusestatementnote.hasAuthorStringType()) {
			d.setDvcUseStmntNtAthrStrgTyp(String.valueOf(deviceusestatementnote.getAuthorStringType()));
		}
		/******************** deviceusestatementbodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceusestatementbodysite = deviceusestatement.getBodySite();

		/******************** DvcUseStmnt_BodySite_Txt ********************************************************************************/
		if(deviceusestatementbodysite.hasText()) {
			d.setDvcUseStmntBodySiteTxt(String.valueOf(deviceusestatementbodysite.getText()));
		}
		/******************** deviceusestatementbodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding deviceusestatementbodysitecoding = deviceusestatementbodysite.getCodingFirstRep();

		/******************** DvcUseStmnt_BodySite_Cdg_Vrsn ********************************************************************************/
		if(deviceusestatementbodysitecoding.hasVersion()) {
			d.setDvcUseStmntBodySiteCdgVrsn(String.valueOf(deviceusestatementbodysitecoding.getVersion()));
		}
		/******************** DvcUseStmnt_BodySite_Cdg_Dsply ********************************************************************************/
		if(deviceusestatementbodysitecoding.hasDisplay()) {
			d.setDvcUseStmntBodySiteCdgDsply(String.valueOf(deviceusestatementbodysitecoding.getDisplay()));
		}
		/******************** DvcUseStmnt_BodySite_Cdg_Cd ********************************************************************************/
		if(deviceusestatementbodysitecoding.hasCode()) {
			d.setDvcUseStmntBodySiteCdgCd(String.valueOf(deviceusestatementbodysitecoding.getCode()));
		}
		/******************** DvcUseStmnt_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(deviceusestatementbodysitecoding.hasUserSelected()) {
			d.setDvcUseStmntBodySiteCdgUsrSltd(String.valueOf(deviceusestatementbodysitecoding.getUserSelected()));
		}
		/******************** DvcUseStmnt_BodySite_Cdg_Sys ********************************************************************************/
		if(deviceusestatementbodysitecoding.hasSystem()) {
			d.setDvcUseStmntBodySiteCdgSys(String.valueOf(deviceusestatementbodysitecoding.getSystem()));
		}
		/******************** DvcUseStmnt_DerivedFrom ********************************************************************************/
		if(deviceusestatement.hasDerivedFrom()) {
			d.setDvcUseStmntDerivedFrom(String.valueOf(deviceusestatement.getDerivedFromFirstRep()));
		}
		/******************** DvcUseStmnt_TmgDtTimeTyp ********************************************************************************/
		if(deviceusestatement.hasTimingDateTimeType()) {
			d.setDvcUseStmntTmgDtTimeTyp(String.valueOf(deviceusestatement.getTimingDateTimeType()));
		}
		/******************** deviceusestatementidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier deviceusestatementidentifier = deviceusestatement.getIdentifierFirstRep();

		/******************** DvcUseStmnt_Id_Vl ********************************************************************************/
		if(deviceusestatementidentifier.hasValue()) {
			d.setDvcUseStmntIdVl(String.valueOf(deviceusestatementidentifier.getValue()));
		}
		/******************** deviceusestatementidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceusestatementidentifiertype = deviceusestatementidentifier.getType();

		/******************** DvcUseStmnt_Id_Typ_Txt ********************************************************************************/
		if(deviceusestatementidentifiertype.hasText()) {
			d.setDvcUseStmntIdTypTxt(String.valueOf(deviceusestatementidentifiertype.getText()));
		}
		/******************** deviceusestatementidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding deviceusestatementidentifiertypecoding = deviceusestatementidentifiertype.getCodingFirstRep();

		/******************** DvcUseStmnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(deviceusestatementidentifiertypecoding.hasVersion()) {
			d.setDvcUseStmntIdTypCdgVrsn(String.valueOf(deviceusestatementidentifiertypecoding.getVersion()));
		}
		/******************** DvcUseStmnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(deviceusestatementidentifiertypecoding.hasDisplay()) {
			d.setDvcUseStmntIdTypCdgDsply(String.valueOf(deviceusestatementidentifiertypecoding.getDisplay()));
		}
		/******************** DvcUseStmnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(deviceusestatementidentifiertypecoding.hasCode()) {
			d.setDvcUseStmntIdTypCdgCd(String.valueOf(deviceusestatementidentifiertypecoding.getCode()));
		}
		/******************** DvcUseStmnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(deviceusestatementidentifiertypecoding.hasUserSelected()) {
			d.setDvcUseStmntIdTypCdgUsrSltd(String.valueOf(deviceusestatementidentifiertypecoding.getUserSelected()));
		}
		/******************** DvcUseStmnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(deviceusestatementidentifiertypecoding.hasSystem()) {
			d.setDvcUseStmntIdTypCdgSys(String.valueOf(deviceusestatementidentifiertypecoding.getSystem()));
		}
		/******************** deviceusestatementidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period deviceusestatementidentifierperiod = deviceusestatementidentifier.getPeriod();

		/******************** DvcUseStmnt_Id_Prd_Strt ********************************************************************************/
		if(deviceusestatementidentifierperiod.hasStart()) {
			d.setDvcUseStmntIdPrdStrt(String.valueOf(deviceusestatementidentifierperiod.getStart()));
		}
		/******************** DvcUseStmnt_Id_Prd_End ********************************************************************************/
		if(deviceusestatementidentifierperiod.hasEnd()) {
			d.setDvcUseStmntIdPrdEnd(String.valueOf(deviceusestatementidentifierperiod.getEnd()));
		}
		/******************** DvcUseStmnt_Id_Assigner ********************************************************************************/
		if(deviceusestatementidentifier.hasAssigner()) {
			d.setDvcUseStmntIdAssigner(String.valueOf(deviceusestatementidentifier.getAssigner()));
		}
		/******************** DvcUseStmnt_Id_Sys ********************************************************************************/
		if(deviceusestatementidentifier.hasSystem()) {
			d.setDvcUseStmntIdSys(String.valueOf(deviceusestatementidentifier.getSystem()));
		}
		/******************** deviceusestatementidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse deviceusestatementidentifieruse = deviceusestatementidentifier.getUse();
		d.setDvcUseStmntIdUse(deviceusestatementidentifieruse.toCode());

		/******************** deviceusestatementreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceusestatementreasoncode = deviceusestatement.getReasonCodeFirstRep();

		/******************** DvcUseStmnt_RsnCd_Txt ********************************************************************************/
		if(deviceusestatementreasoncode.hasText()) {
			d.setDvcUseStmntRsnCdTxt(String.valueOf(deviceusestatementreasoncode.getText()));
		}
		/******************** deviceusestatementreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding deviceusestatementreasoncodecoding = deviceusestatementreasoncode.getCodingFirstRep();

		/******************** DvcUseStmnt_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(deviceusestatementreasoncodecoding.hasVersion()) {
			d.setDvcUseStmntRsnCdCdgVrsn(String.valueOf(deviceusestatementreasoncodecoding.getVersion()));
		}
		/******************** DvcUseStmnt_RsnCd_Cdg_Dsply ********************************************************************************/
		if(deviceusestatementreasoncodecoding.hasDisplay()) {
			d.setDvcUseStmntRsnCdCdgDsply(String.valueOf(deviceusestatementreasoncodecoding.getDisplay()));
		}
		/******************** DvcUseStmnt_RsnCd_Cdg_Cd ********************************************************************************/
		if(deviceusestatementreasoncodecoding.hasCode()) {
			d.setDvcUseStmntRsnCdCdgCd(String.valueOf(deviceusestatementreasoncodecoding.getCode()));
		}
		/******************** DvcUseStmnt_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(deviceusestatementreasoncodecoding.hasUserSelected()) {
			d.setDvcUseStmntRsnCdCdgUsrSltd(String.valueOf(deviceusestatementreasoncodecoding.getUserSelected()));
		}
		/******************** DvcUseStmnt_RsnCd_Cdg_Sys ********************************************************************************/
		if(deviceusestatementreasoncodecoding.hasSystem()) {
			d.setDvcUseStmntRsnCdCdgSys(String.valueOf(deviceusestatementreasoncodecoding.getSystem()));
		}
		/******************** DvcUseStmnt_RsnRfrnc ********************************************************************************/
		if(deviceusestatement.hasReasonReference()) {
			d.setDvcUseStmntRsnRfrnc(String.valueOf(deviceusestatement.getReasonReferenceFirstRep()));
		}
		/******************** deviceusestatementtimingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period deviceusestatementtimingperiod = deviceusestatement.getTimingPeriod();

		/******************** DvcUseStmnt_TmgPrd_Strt ********************************************************************************/
		if(deviceusestatementtimingperiod.hasStart()) {
			d.setDvcUseStmntTmgPrdStrt(String.valueOf(deviceusestatementtimingperiod.getStart()));
		}
		/******************** DvcUseStmnt_TmgPrd_End ********************************************************************************/
		if(deviceusestatementtimingperiod.hasEnd()) {
			d.setDvcUseStmntTmgPrdEnd(String.valueOf(deviceusestatementtimingperiod.getEnd()));
		}
		/******************** deviceusestatementtimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing deviceusestatementtimingtiming = deviceusestatement.getTimingTiming();

		/******************** deviceusestatementtimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceusestatementtimingtimingcode = deviceusestatementtimingtiming.getCode();

		/******************** DvcUseStmnt_TmgTmg_Cd_Txt ********************************************************************************/
		if(deviceusestatementtimingtimingcode.hasText()) {
			d.setDvcUseStmntTmgTmgCdTxt(String.valueOf(deviceusestatementtimingtimingcode.getText()));
		}
		/******************** deviceusestatementtimingtimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding deviceusestatementtimingtimingcodecoding = deviceusestatementtimingtimingcode.getCodingFirstRep();

		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(deviceusestatementtimingtimingcodecoding.hasVersion()) {
			d.setDvcUseStmntTmgTmgCdCdgVrsn(String.valueOf(deviceusestatementtimingtimingcodecoding.getVersion()));
		}
		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(deviceusestatementtimingtimingcodecoding.hasDisplay()) {
			d.setDvcUseStmntTmgTmgCdCdgDsply(String.valueOf(deviceusestatementtimingtimingcodecoding.getDisplay()));
		}
		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(deviceusestatementtimingtimingcodecoding.hasCode()) {
			d.setDvcUseStmntTmgTmgCdCdgCd(String.valueOf(deviceusestatementtimingtimingcodecoding.getCode()));
		}
		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(deviceusestatementtimingtimingcodecoding.hasUserSelected()) {
			d.setDvcUseStmntTmgTmgCdCdgUsrSltd(String.valueOf(deviceusestatementtimingtimingcodecoding.getUserSelected()));
		}
		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(deviceusestatementtimingtimingcodecoding.hasSystem()) {
			d.setDvcUseStmntTmgTmgCdCdgSys(String.valueOf(deviceusestatementtimingtimingcodecoding.getSystem()));
		}
		/******************** deviceusestatementtimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent deviceusestatementtimingtimingrepeat = deviceusestatementtimingtiming.getRepeat();

		/******************** DvcUseStmnt_TmgTmg_Rpt_Off ********************************************************************************/
		if(deviceusestatementtimingtimingrepeat.hasOffset()) {
			d.setDvcUseStmntTmgTmgRptOff(String.valueOf(deviceusestatementtimingtimingrepeat.getOffset()));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(deviceusestatementtimingtimingrepeat.hasCount()) {
			d.setDvcUseStmntTmgTmgRptCnt(String.valueOf(deviceusestatementtimingtimingrepeat.getCount()));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(deviceusestatementtimingtimingrepeat.hasFrequency()) {
			d.setDvcUseStmntTmgTmgRptFrqncy(String.valueOf(deviceusestatementtimingtimingrepeat.getFrequency()));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_Prd ********************************************************************************/
		if(deviceusestatementtimingtimingrepeat.hasPeriod()) {
			d.setDvcUseStmntTmgTmgRptPrd(String.valueOf(deviceusestatementtimingtimingrepeat.getPeriod()));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_Duration ********************************************************************************/
		if(deviceusestatementtimingtimingrepeat.hasDuration()) {
			d.setDvcUseStmntTmgTmgRptDuration(String.valueOf(deviceusestatementtimingtimingrepeat.getDuration()));
		}
		/******************** deviceusestatementtimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration deviceusestatementtimingtimingrepeatboundsduration = deviceusestatementtimingtimingrepeat.getBoundsDuration();

		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsduration.hasValue()) {
			d.setDvcUseStmntTmgTmgRptBndsDurationVl(String.valueOf(deviceusestatementtimingtimingrepeatboundsduration.getValue()));
		}
		/******************** deviceusestatementtimingtimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator deviceusestatementtimingtimingrepeatboundsdurationcomparator = deviceusestatementtimingtimingrepeatboundsduration.getComparator();
		d.setDvcUseStmntTmgTmgRptBndsDurationCmprtr(deviceusestatementtimingtimingrepeatboundsdurationcomparator.toCode());

		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsduration.hasCode()) {
			d.setDvcUseStmntTmgTmgRptBndsDurationCd(String.valueOf(deviceusestatementtimingtimingrepeatboundsduration.getCode()));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsduration.hasUnit()) {
			d.setDvcUseStmntTmgTmgRptBndsDurationUnt(String.valueOf(deviceusestatementtimingtimingrepeatboundsduration.getUnit()));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsduration.hasSystem()) {
			d.setDvcUseStmntTmgTmgRptBndsDurationSys(String.valueOf(deviceusestatementtimingtimingrepeatboundsduration.getSystem()));
		}
		/******************** deviceusestatementtimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range deviceusestatementtimingtimingrepeatboundsrange = deviceusestatementtimingtimingrepeat.getBoundsRange();

		/******************** deviceusestatementtimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity deviceusestatementtimingtimingrepeatboundsrangelow = deviceusestatementtimingtimingrepeatboundsrange.getLow();

		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsrangelow.hasValue()) {
			d.setDvcUseStmntTmgTmgRptBndsRngLwVl(String.valueOf(deviceusestatementtimingtimingrepeatboundsrangelow.getValue()));
		}
		/******************** deviceusestatementtimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator deviceusestatementtimingtimingrepeatboundsrangelowcomparator = deviceusestatementtimingtimingrepeatboundsrangelow.getComparator();
		d.setDvcUseStmntTmgTmgRptBndsRngLwCmprtr(deviceusestatementtimingtimingrepeatboundsrangelowcomparator.toCode());

		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsrangelow.hasCode()) {
			d.setDvcUseStmntTmgTmgRptBndsRngLwCd(String.valueOf(deviceusestatementtimingtimingrepeatboundsrangelow.getCode()));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsrangelow.hasUnit()) {
			d.setDvcUseStmntTmgTmgRptBndsRngLwUnt(String.valueOf(deviceusestatementtimingtimingrepeatboundsrangelow.getUnit()));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsrangelow.hasSystem()) {
			d.setDvcUseStmntTmgTmgRptBndsRngLwSys(String.valueOf(deviceusestatementtimingtimingrepeatboundsrangelow.getSystem()));
		}
		/******************** deviceusestatementtimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity deviceusestatementtimingtimingrepeatboundsrangehigh = deviceusestatementtimingtimingrepeatboundsrange.getHigh();

		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsrangehigh.hasValue()) {
			d.setDvcUseStmntTmgTmgRptBndsRngHiVl(String.valueOf(deviceusestatementtimingtimingrepeatboundsrangehigh.getValue()));
		}
		/******************** deviceusestatementtimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator deviceusestatementtimingtimingrepeatboundsrangehighcomparator = deviceusestatementtimingtimingrepeatboundsrangehigh.getComparator();
		d.setDvcUseStmntTmgTmgRptBndsRngHiCmprtr(deviceusestatementtimingtimingrepeatboundsrangehighcomparator.toCode());

		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsrangehigh.hasCode()) {
			d.setDvcUseStmntTmgTmgRptBndsRngHiCd(String.valueOf(deviceusestatementtimingtimingrepeatboundsrangehigh.getCode()));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsrangehigh.hasUnit()) {
			d.setDvcUseStmntTmgTmgRptBndsRngHiUnt(String.valueOf(deviceusestatementtimingtimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsrangehigh.hasSystem()) {
			d.setDvcUseStmntTmgTmgRptBndsRngHiSys(String.valueOf(deviceusestatementtimingtimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** deviceusestatementtimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period deviceusestatementtimingtimingrepeatboundsperiod = deviceusestatementtimingtimingrepeat.getBoundsPeriod();

		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsperiod.hasStart()) {
			d.setDvcUseStmntTmgTmgRptBndsPrdStrt(String.valueOf(deviceusestatementtimingtimingrepeatboundsperiod.getStart()));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsperiod.hasEnd()) {
			d.setDvcUseStmntTmgTmgRptBndsPrdEnd(String.valueOf(deviceusestatementtimingtimingrepeatboundsperiod.getEnd()));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(deviceusestatementtimingtimingrepeat.hasPeriodMax()) {
			d.setDvcUseStmntTmgTmgRptPrdMx(String.valueOf(deviceusestatementtimingtimingrepeat.getPeriodMax()));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(deviceusestatementtimingtimingrepeat.hasDurationMax()) {
			d.setDvcUseStmntTmgTmgRptDurationMx(String.valueOf(deviceusestatementtimingtimingrepeat.getDurationMax()));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(deviceusestatementtimingtimingrepeat.hasCountMax()) {
			d.setDvcUseStmntTmgTmgRptCntMx(String.valueOf(deviceusestatementtimingtimingrepeat.getCountMax()));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(deviceusestatementtimingtimingrepeat.hasFrequencyMax()) {
			d.setDvcUseStmntTmgTmgRptFrqncyMx(String.valueOf(deviceusestatementtimingtimingrepeat.getFrequencyMax()));
		}
		/******************** deviceusestatementtimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime deviceusestatementtimingtimingrepeatdurationunit = deviceusestatementtimingtimingrepeat.getDurationUnit();
		d.setDvcUseStmntTmgTmgRptDurationUnt(deviceusestatementtimingtimingrepeatdurationunit.toCode());

		/******************** deviceusestatementtimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime deviceusestatementtimingtimingrepeatperiodunit = deviceusestatementtimingtimingrepeat.getPeriodUnit();
		d.setDvcUseStmntTmgTmgRptPrdUnt(deviceusestatementtimingtimingrepeatperiodunit.toCode());

		/******************** DvcUseStmnt_RecordedOn ********************************************************************************/
		if(deviceusestatement.hasRecordedOn()) {
			d.setDvcUseStmntRecordedOn(String.valueOf(deviceusestatement.getRecordedOn()));
		}
		/******************** DvcUseStmnt_Dvc ********************************************************************************/
		if(deviceusestatement.hasDevice()) {
			d.setDvcUseStmntDvc(String.valueOf(deviceusestatement.getDevice()));
		}
		return d;
	}
}
