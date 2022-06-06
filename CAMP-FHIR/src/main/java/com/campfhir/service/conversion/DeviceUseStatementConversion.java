package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DeviceUseStatement;
public class DeviceUseStatementConversion 
{
	public org.hl7.fhir.r4.model.DeviceUseStatement DeviceUseStatements(DeviceUseStatement d) throws ParseException
	{
		org.hl7.fhir.r4.model.DeviceUseStatement deviceusestatement = new org.hl7.fhir.r4.model.DeviceUseStatement();

		/******************** id ********************************************************************************/
		deviceusestatement.setId(d.getId());

		/******************** DvcUseStmnt_BasedOn ********************************************************************************/
		if(d.getDvcUseStmntBasedOn() != null) {
			deviceusestatement.addBasedOn( new org.hl7.fhir.r4.model.Reference(d.getDvcUseStmntBasedOn()));
		}
		/******************** deviceusestatementbodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceusestatementbodysite =  new org.hl7.fhir.r4.model.CodeableConcept();
		deviceusestatement.setBodySite(deviceusestatementbodysite);

		/******************** deviceusestatementbodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding deviceusestatementbodysitecoding =  new org.hl7.fhir.r4.model.Coding();
		deviceusestatementbodysite.addCoding(deviceusestatementbodysitecoding);

		/******************** DvcUseStmnt_BodySite_Cdg_Cd ********************************************************************************/
		if(d.getDvcUseStmntBodySiteCdgCd() != null) {
			deviceusestatementbodysitecoding.setCode(d.getDvcUseStmntBodySiteCdgCd());
		}
		/******************** DvcUseStmnt_BodySite_Cdg_Dsply ********************************************************************************/
		if(d.getDvcUseStmntBodySiteCdgDsply() != null) {
			deviceusestatementbodysitecoding.setDisplay(d.getDvcUseStmntBodySiteCdgDsply());
		}
		/******************** DvcUseStmnt_BodySite_Cdg_Sys ********************************************************************************/
		if(d.getDvcUseStmntBodySiteCdgSys() != null) {
			deviceusestatementbodysitecoding.setSystem(d.getDvcUseStmntBodySiteCdgSys());
		}
		/******************** DvcUseStmnt_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcUseStmntBodySiteCdgUsrSltd() != null) {
			deviceusestatementbodysitecoding.setUserSelected(Boolean.parseBoolean(d.getDvcUseStmntBodySiteCdgUsrSltd()));
		}
		/******************** DvcUseStmnt_BodySite_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcUseStmntBodySiteCdgVrsn() != null) {
			deviceusestatementbodysitecoding.setVersion(d.getDvcUseStmntBodySiteCdgVrsn());
		}
		/******************** DvcUseStmnt_BodySite_Txt ********************************************************************************/
		if(d.getDvcUseStmntBodySiteTxt() != null) {
			deviceusestatementbodysite.setText(d.getDvcUseStmntBodySiteTxt());
		}
		/******************** DvcUseStmnt_DerivedFrom ********************************************************************************/
		if(d.getDvcUseStmntDerivedFrom() != null) {
			deviceusestatement.addDerivedFrom( new org.hl7.fhir.r4.model.Reference(d.getDvcUseStmntDerivedFrom()));
		}
		/******************** DvcUseStmnt_Dvc ********************************************************************************/
		if(d.getDvcUseStmntDvc() != null) {
			deviceusestatement.setDevice( new org.hl7.fhir.r4.model.Reference(d.getDvcUseStmntDvc()));
		}
		/******************** deviceusestatementidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier deviceusestatementidentifier =  new org.hl7.fhir.r4.model.Identifier();
		deviceusestatement.addIdentifier(deviceusestatementidentifier);

		/******************** DvcUseStmnt_Id_Assigner ********************************************************************************/
		if(d.getDvcUseStmntIdAssigner() != null) {
			deviceusestatementidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(d.getDvcUseStmntIdAssigner()));
		}
		/******************** deviceusestatementidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period deviceusestatementidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		deviceusestatementidentifier.setPeriod(deviceusestatementidentifierperiod);

		/******************** DvcUseStmnt_Id_Prd_End ********************************************************************************/
		if(d.getDvcUseStmntIdPrdEnd() != null) {
			java.text.SimpleDateFormat DvcUseStmnt_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcUseStmnt_Id_Prd_Enddate = DvcUseStmnt_Id_Prd_Endsdf.parse(d.getDvcUseStmntIdPrdEnd());
			deviceusestatementidentifierperiod.setEnd(DvcUseStmnt_Id_Prd_Enddate);
		}
		/******************** DvcUseStmnt_Id_Prd_Strt ********************************************************************************/
		if(d.getDvcUseStmntIdPrdStrt() != null) {
			java.text.SimpleDateFormat DvcUseStmnt_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcUseStmnt_Id_Prd_Strtdate = DvcUseStmnt_Id_Prd_Strtsdf.parse(d.getDvcUseStmntIdPrdStrt());
			deviceusestatementidentifierperiod.setStart(DvcUseStmnt_Id_Prd_Strtdate);
		}
		/******************** DvcUseStmnt_Id_Sys ********************************************************************************/
		if(d.getDvcUseStmntIdSys() != null) {
			deviceusestatementidentifier.setSystem(d.getDvcUseStmntIdSys());
		}
		/******************** deviceusestatementidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceusestatementidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		deviceusestatementidentifier.setType(deviceusestatementidentifiertype);

		/******************** deviceusestatementidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding deviceusestatementidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		deviceusestatementidentifiertype.addCoding(deviceusestatementidentifiertypecoding);

		/******************** DvcUseStmnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcUseStmntIdTypCdgCd() != null) {
			deviceusestatementidentifiertypecoding.setCode(d.getDvcUseStmntIdTypCdgCd());
		}
		/******************** DvcUseStmnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcUseStmntIdTypCdgDsply() != null) {
			deviceusestatementidentifiertypecoding.setDisplay(d.getDvcUseStmntIdTypCdgDsply());
		}
		/******************** DvcUseStmnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcUseStmntIdTypCdgSys() != null) {
			deviceusestatementidentifiertypecoding.setSystem(d.getDvcUseStmntIdTypCdgSys());
		}
		/******************** DvcUseStmnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcUseStmntIdTypCdgUsrSltd() != null) {
			deviceusestatementidentifiertypecoding.setUserSelected(Boolean.parseBoolean(d.getDvcUseStmntIdTypCdgUsrSltd()));
		}
		/******************** DvcUseStmnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcUseStmntIdTypCdgVrsn() != null) {
			deviceusestatementidentifiertypecoding.setVersion(d.getDvcUseStmntIdTypCdgVrsn());
		}
		/******************** DvcUseStmnt_Id_Typ_Txt ********************************************************************************/
		if(d.getDvcUseStmntIdTypTxt() != null) {
			deviceusestatementidentifiertype.setText(d.getDvcUseStmntIdTypTxt());
		}
		/******************** deviceusestatementidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory deviceusestatementidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		deviceusestatementidentifier.setUse(deviceusestatementidentifieruse.fromCode(d.getDvcUseStmntIdUse()));

		/******************** DvcUseStmnt_Id_Vl ********************************************************************************/
		if(d.getDvcUseStmntIdVl() != null) {
			deviceusestatementidentifier.setValue(d.getDvcUseStmntIdVl());
		}
		/******************** deviceusestatementnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation deviceusestatementnote =  new org.hl7.fhir.r4.model.Annotation();
		deviceusestatement.addNote(deviceusestatementnote);

		/******************** DvcUseStmnt_Nt_AthrRfrnc ********************************************************************************/
		if(d.getDvcUseStmntNtAthrRfrnc() != null) {
			deviceusestatementnote.setAuthor( new org.hl7.fhir.r4.model.Reference(d.getDvcUseStmntNtAthrRfrnc()));
		}
		/******************** DvcUseStmnt_Nt_AthrStrgTyp ********************************************************************************/
		if(d.getDvcUseStmntNtAthrStrgTyp() != null) {
			deviceusestatementnote.setAuthor( new org.hl7.fhir.r4.model.StringType(d.getDvcUseStmntNtAthrStrgTyp()));
		}
		/******************** DvcUseStmnt_Nt_Txt ********************************************************************************/
		if(d.getDvcUseStmntNtTxt() != null) {
			deviceusestatementnote.setText(d.getDvcUseStmntNtTxt());
		}
		/******************** DvcUseStmnt_Nt_Time ********************************************************************************/
		if(d.getDvcUseStmntNtTime() != null) {
			java.text.SimpleDateFormat DvcUseStmnt_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcUseStmnt_Nt_Timedate = DvcUseStmnt_Nt_Timesdf.parse(d.getDvcUseStmntNtTime());
			deviceusestatementnote.setTime(DvcUseStmnt_Nt_Timedate);
		}
		/******************** deviceusestatementreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceusestatementreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		deviceusestatement.addReasonCode(deviceusestatementreasoncode);

		/******************** deviceusestatementreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding deviceusestatementreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		deviceusestatementreasoncode.addCoding(deviceusestatementreasoncodecoding);

		/******************** DvcUseStmnt_RsnCd_Cdg_Cd ********************************************************************************/
		if(d.getDvcUseStmntRsnCdCdgCd() != null) {
			deviceusestatementreasoncodecoding.setCode(d.getDvcUseStmntRsnCdCdgCd());
		}
		/******************** DvcUseStmnt_RsnCd_Cdg_Dsply ********************************************************************************/
		if(d.getDvcUseStmntRsnCdCdgDsply() != null) {
			deviceusestatementreasoncodecoding.setDisplay(d.getDvcUseStmntRsnCdCdgDsply());
		}
		/******************** DvcUseStmnt_RsnCd_Cdg_Sys ********************************************************************************/
		if(d.getDvcUseStmntRsnCdCdgSys() != null) {
			deviceusestatementreasoncodecoding.setSystem(d.getDvcUseStmntRsnCdCdgSys());
		}
		/******************** DvcUseStmnt_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcUseStmntRsnCdCdgUsrSltd() != null) {
			deviceusestatementreasoncodecoding.setUserSelected(Boolean.parseBoolean(d.getDvcUseStmntRsnCdCdgUsrSltd()));
		}
		/******************** DvcUseStmnt_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcUseStmntRsnCdCdgVrsn() != null) {
			deviceusestatementreasoncodecoding.setVersion(d.getDvcUseStmntRsnCdCdgVrsn());
		}
		/******************** DvcUseStmnt_RsnCd_Txt ********************************************************************************/
		if(d.getDvcUseStmntRsnCdTxt() != null) {
			deviceusestatementreasoncode.setText(d.getDvcUseStmntRsnCdTxt());
		}
		/******************** DvcUseStmnt_RsnRfrnc ********************************************************************************/
		if(d.getDvcUseStmntRsnRfrnc() != null) {
			deviceusestatement.addReasonReference( new org.hl7.fhir.r4.model.Reference(d.getDvcUseStmntRsnRfrnc()));
		}
		/******************** DvcUseStmnt_RecordedOn ********************************************************************************/
		if(d.getDvcUseStmntRecordedOn() != null) {
			java.text.SimpleDateFormat DvcUseStmnt_RecordedOnsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcUseStmnt_RecordedOndate = DvcUseStmnt_RecordedOnsdf.parse(d.getDvcUseStmntRecordedOn());
			deviceusestatement.setRecordedOn(DvcUseStmnt_RecordedOndate);
		}
		/******************** DvcUseStmnt_Src ********************************************************************************/
		if(d.getDvcUseStmntSrc() != null) {
			deviceusestatement.setSource( new org.hl7.fhir.r4.model.Reference(d.getDvcUseStmntSrc()));
		}
		/******************** deviceusestatementstatus ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceUseStatement.DeviceUseStatementStatusEnumFactory deviceusestatementstatus =  new org.hl7.fhir.r4.model.DeviceUseStatement.DeviceUseStatementStatusEnumFactory();
		deviceusestatement.setStatus(deviceusestatementstatus.fromCode(d.getDvcUseStmntSts()));

		/******************** DvcUseStmnt_Sbjct ********************************************************************************/
		if(d.getDvcUseStmntSbjct() != null) {
			deviceusestatement.setSubject( new org.hl7.fhir.r4.model.Reference(d.getDvcUseStmntSbjct()));
		}
		/******************** DvcUseStmnt_TmgDtTimeTyp ********************************************************************************/
		if(d.getDvcUseStmntTmgDtTimeTyp() != null) {
			deviceusestatement.setTiming( new org.hl7.fhir.r4.model.DateTimeType(d.getDvcUseStmntTmgDtTimeTyp()));
		}
		/******************** deviceusestatementtimingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period deviceusestatementtimingperiod =  new org.hl7.fhir.r4.model.Period();
		deviceusestatement.setTiming(deviceusestatementtimingperiod);

		/******************** DvcUseStmnt_TmgPrd_End ********************************************************************************/
		if(d.getDvcUseStmntTmgPrdEnd() != null) {
			java.text.SimpleDateFormat DvcUseStmnt_TmgPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcUseStmnt_TmgPrd_Enddate = DvcUseStmnt_TmgPrd_Endsdf.parse(d.getDvcUseStmntTmgPrdEnd());
			deviceusestatementtimingperiod.setEnd(DvcUseStmnt_TmgPrd_Enddate);
		}
		/******************** DvcUseStmnt_TmgPrd_Strt ********************************************************************************/
		if(d.getDvcUseStmntTmgPrdStrt() != null) {
			java.text.SimpleDateFormat DvcUseStmnt_TmgPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcUseStmnt_TmgPrd_Strtdate = DvcUseStmnt_TmgPrd_Strtsdf.parse(d.getDvcUseStmntTmgPrdStrt());
			deviceusestatementtimingperiod.setStart(DvcUseStmnt_TmgPrd_Strtdate);
		}
		/******************** deviceusestatementtimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing deviceusestatementtimingtiming =  new org.hl7.fhir.r4.model.Timing();
		deviceusestatement.setTiming(deviceusestatementtimingtiming);

		/******************** deviceusestatementtimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceusestatementtimingtimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		deviceusestatementtimingtiming.setCode(deviceusestatementtimingtimingcode);

		/******************** deviceusestatementtimingtimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding deviceusestatementtimingtimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		deviceusestatementtimingtimingcode.addCoding(deviceusestatementtimingtimingcodecoding);

		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgCdCdgCd() != null) {
			deviceusestatementtimingtimingcodecoding.setCode(d.getDvcUseStmntTmgTmgCdCdgCd());
		}
		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgCdCdgDsply() != null) {
			deviceusestatementtimingtimingcodecoding.setDisplay(d.getDvcUseStmntTmgTmgCdCdgDsply());
		}
		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgCdCdgSys() != null) {
			deviceusestatementtimingtimingcodecoding.setSystem(d.getDvcUseStmntTmgTmgCdCdgSys());
		}
		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgCdCdgUsrSltd() != null) {
			deviceusestatementtimingtimingcodecoding.setUserSelected(Boolean.parseBoolean(d.getDvcUseStmntTmgTmgCdCdgUsrSltd()));
		}
		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgCdCdgVrsn() != null) {
			deviceusestatementtimingtimingcodecoding.setVersion(d.getDvcUseStmntTmgTmgCdCdgVrsn());
		}
		/******************** DvcUseStmnt_TmgTmg_Cd_Txt ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgCdTxt() != null) {
			deviceusestatementtimingtimingcode.setText(d.getDvcUseStmntTmgTmgCdTxt());
		}
		/******************** DvcUseStmnt_TmgTmg_Evnt ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgEvnt() != null) {
			java.text.SimpleDateFormat DvcUseStmnt_TmgTmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcUseStmnt_TmgTmg_Evntdate = DvcUseStmnt_TmgTmg_Evntsdf.parse(d.getDvcUseStmntTmgTmgEvnt());
			deviceusestatementtimingtiming.addEvent(DvcUseStmnt_TmgTmg_Evntdate);
		}
		/******************** deviceusestatementtimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent deviceusestatementtimingtimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		deviceusestatementtimingtiming.setRepeat(deviceusestatementtimingtimingrepeat);

		/******************** deviceusestatementtimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration deviceusestatementtimingtimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		deviceusestatementtimingtimingrepeat.setBounds(deviceusestatementtimingtimingrepeatboundsduration);

		/******************** deviceusestatementtimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period deviceusestatementtimingtimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		deviceusestatementtimingtimingrepeat.setBounds(deviceusestatementtimingtimingrepeatboundsperiod);

		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat DvcUseStmnt_TmgTmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcUseStmnt_TmgTmg_Rpt_BndsPrd_Enddate = DvcUseStmnt_TmgTmg_Rpt_BndsPrd_Endsdf.parse(d.getDvcUseStmntTmgTmgRptBndsPrdEnd());
			deviceusestatementtimingtimingrepeatboundsperiod.setEnd(DvcUseStmnt_TmgTmg_Rpt_BndsPrd_Enddate);
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat DvcUseStmnt_TmgTmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcUseStmnt_TmgTmg_Rpt_BndsPrd_Strtdate = DvcUseStmnt_TmgTmg_Rpt_BndsPrd_Strtsdf.parse(d.getDvcUseStmntTmgTmgRptBndsPrdStrt());
			deviceusestatementtimingtimingrepeatboundsperiod.setStart(DvcUseStmnt_TmgTmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** deviceusestatementtimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range deviceusestatementtimingtimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		deviceusestatementtimingtimingrepeat.setBounds(deviceusestatementtimingtimingrepeatboundsrange);

		/******************** deviceusestatementtimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity deviceusestatementtimingtimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		deviceusestatementtimingtimingrepeatboundsrange.setHigh(deviceusestatementtimingtimingrepeatboundsrangehigh);

		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsRngHiCd() != null) {
			deviceusestatementtimingtimingrepeatboundsrangehigh.setCode(d.getDvcUseStmntTmgTmgRptBndsRngHiCd());
		}
		/******************** deviceusestatementtimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory deviceusestatementtimingtimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		deviceusestatementtimingtimingrepeatboundsrangehigh.setComparator(deviceusestatementtimingtimingrepeatboundsrangehighcomparator.fromCode(d.getDvcUseStmntTmgTmgRptBndsRngHiCmprtr()));

		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsRngHiSys() != null) {
			deviceusestatementtimingtimingrepeatboundsrangehigh.setSystem(d.getDvcUseStmntTmgTmgRptBndsRngHiSys());
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsRngHiUnt() != null) {
			deviceusestatementtimingtimingrepeatboundsrangehigh.setUnit(d.getDvcUseStmntTmgTmgRptBndsRngHiUnt());
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsRngHiVl() != null) {
			deviceusestatementtimingtimingrepeatboundsrangehigh.setValue(Double.parseDouble((d.getDvcUseStmntTmgTmgRptBndsRngHiVl())));
		}
		/******************** deviceusestatementtimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity deviceusestatementtimingtimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		deviceusestatementtimingtimingrepeatboundsrange.setLow(deviceusestatementtimingtimingrepeatboundsrangelow);

		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsRngLwCd() != null) {
			deviceusestatementtimingtimingrepeatboundsrangelow.setCode(d.getDvcUseStmntTmgTmgRptBndsRngLwCd());
		}
		/******************** deviceusestatementtimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory deviceusestatementtimingtimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		deviceusestatementtimingtimingrepeatboundsrangelow.setComparator(deviceusestatementtimingtimingrepeatboundsrangelowcomparator.fromCode(d.getDvcUseStmntTmgTmgRptBndsRngLwCmprtr()));

		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsRngLwSys() != null) {
			deviceusestatementtimingtimingrepeatboundsrangelow.setSystem(d.getDvcUseStmntTmgTmgRptBndsRngLwSys());
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsRngLwUnt() != null) {
			deviceusestatementtimingtimingrepeatboundsrangelow.setUnit(d.getDvcUseStmntTmgTmgRptBndsRngLwUnt());
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptBndsRngLwVl() != null) {
			deviceusestatementtimingtimingrepeatboundsrangelow.setValue(Double.parseDouble((d.getDvcUseStmntTmgTmgRptBndsRngLwVl())));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptCnt() != null) {
			deviceusestatementtimingtimingrepeat.setCount(Integer.parseInt(d.getDvcUseStmntTmgTmgRptCnt()));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptCntMx() != null) {
			deviceusestatementtimingtimingrepeat.setCountMax(Integer.parseInt(d.getDvcUseStmntTmgTmgRptCntMx()));
		}
		/******************** deviceusestatementtimingtimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory deviceusestatementtimingtimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		deviceusestatementtimingtimingrepeat.addDayOfWeek(deviceusestatementtimingtimingrepeatdayofweek.fromCode(d.getDvcUseStmntTmgTmgRptDayOfWeek()));

		/******************** DvcUseStmnt_TmgTmg_Rpt_Duration ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptDuration() != null) {
			deviceusestatementtimingtimingrepeat.setDuration(Double.parseDouble((d.getDvcUseStmntTmgTmgRptDuration())));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptDurationMx() != null) {
			deviceusestatementtimingtimingrepeat.setDurationMax(Double.parseDouble((d.getDvcUseStmntTmgTmgRptDurationMx())));
		}
		/******************** deviceusestatementtimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory deviceusestatementtimingtimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		deviceusestatementtimingtimingrepeat.setDurationUnit(deviceusestatementtimingtimingrepeatdurationunit.fromCode(d.getDvcUseStmntTmgTmgRptDurationUnt()));

		/******************** DvcUseStmnt_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptFrqncy() != null) {
			deviceusestatementtimingtimingrepeat.setFrequency(Integer.parseInt(d.getDvcUseStmntTmgTmgRptFrqncy()));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptFrqncyMx() != null) {
			deviceusestatementtimingtimingrepeat.setFrequencyMax(Integer.parseInt(d.getDvcUseStmntTmgTmgRptFrqncyMx()));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_Off ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptOff() != null) {
			deviceusestatementtimingtimingrepeat.setOffset(Integer.parseInt(d.getDvcUseStmntTmgTmgRptOff()));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_Prd ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptPrd() != null) {
			deviceusestatementtimingtimingrepeat.setPeriod(Double.parseDouble((d.getDvcUseStmntTmgTmgRptPrd())));
		}
		/******************** DvcUseStmnt_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptPrdMx() != null) {
			deviceusestatementtimingtimingrepeat.setPeriodMax(Double.parseDouble((d.getDvcUseStmntTmgTmgRptPrdMx())));
		}
		/******************** deviceusestatementtimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory deviceusestatementtimingtimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		deviceusestatementtimingtimingrepeat.setPeriodUnit(deviceusestatementtimingtimingrepeatperiodunit.fromCode(d.getDvcUseStmntTmgTmgRptPrdUnt()));

		/******************** DvcUseStmnt_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(d.getDvcUseStmntTmgTmgRptTimeOfDay() != null) {
			deviceusestatementtimingtimingrepeat.addTimeOfDay(d.getDvcUseStmntTmgTmgRptTimeOfDay());
		}
		/******************** deviceusestatementtimingtimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory deviceusestatementtimingtimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		deviceusestatementtimingtimingrepeat.addWhen(deviceusestatementtimingtimingrepeatwhen.fromCode(d.getDvcUseStmntTmgTmgRptWhen()));

		return deviceusestatement;
	}
}
