package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DeviceRequest;
public class DeviceRequestConversion 
{
	public org.hl7.fhir.r4.model.DeviceRequest DeviceRequests(DeviceRequest d) throws ParseException
	{
		org.hl7.fhir.r4.model.DeviceRequest devicerequest = new org.hl7.fhir.r4.model.DeviceRequest();

		/******************** id ********************************************************************************/
		devicerequest.setId(d.getId());

		/******************** DvcRqst_AthredOn ********************************************************************************/
		if(d.getDvcRqstAthredOn() != null) {
			java.text.SimpleDateFormat DvcRqst_AthredOnsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcRqst_AthredOndate = DvcRqst_AthredOnsdf.parse(d.getDvcRqstAthredOn());
			devicerequest.setAuthoredOn(DvcRqst_AthredOndate);
		}
		/******************** DvcRqst_BasedOn ********************************************************************************/
		if(d.getDvcRqstBasedOn() != null) {
			devicerequest.addBasedOn( new org.hl7.fhir.r4.model.Reference(d.getDvcRqstBasedOn()));
		}
		/******************** devicerequestcodecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestcodecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicerequest.setCode(devicerequestcodecodeableconcept);

		/******************** devicerequestcodecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicerequestcodecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		devicerequestcodecodeableconcept.addCoding(devicerequestcodecodeableconceptcoding);

		/******************** DvcRqst_CdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(d.getDvcRqstCdCdbleCncptCdgCd() != null) {
			devicerequestcodecodeableconceptcoding.setCode(d.getDvcRqstCdCdbleCncptCdgCd());
		}
		/******************** DvcRqst_CdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(d.getDvcRqstCdCdbleCncptCdgDsply() != null) {
			devicerequestcodecodeableconceptcoding.setDisplay(d.getDvcRqstCdCdbleCncptCdgDsply());
		}
		/******************** DvcRqst_CdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(d.getDvcRqstCdCdbleCncptCdgSys() != null) {
			devicerequestcodecodeableconceptcoding.setSystem(d.getDvcRqstCdCdbleCncptCdgSys());
		}
		/******************** DvcRqst_CdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcRqstCdCdbleCncptCdgUsrSltd() != null) {
			devicerequestcodecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(d.getDvcRqstCdCdbleCncptCdgUsrSltd()));
		}
		/******************** DvcRqst_CdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcRqstCdCdbleCncptCdgVrsn() != null) {
			devicerequestcodecodeableconceptcoding.setVersion(d.getDvcRqstCdCdbleCncptCdgVrsn());
		}
		/******************** DvcRqst_CdCdbleCncpt_Txt ********************************************************************************/
		if(d.getDvcRqstCdCdbleCncptTxt() != null) {
			devicerequestcodecodeableconcept.setText(d.getDvcRqstCdCdbleCncptTxt());
		}
		/******************** DvcRqst_CdRfrnc ********************************************************************************/
		if(d.getDvcRqstCdRfrnc() != null) {
			devicerequest.setCode( new org.hl7.fhir.r4.model.Reference(d.getDvcRqstCdRfrnc()));
		}
		/******************** DvcRqst_Enc ********************************************************************************/
		if(d.getDvcRqstEnc() != null) {
			devicerequest.setEncounter( new org.hl7.fhir.r4.model.Reference(d.getDvcRqstEnc()));
		}
		/******************** devicerequestgroupidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier devicerequestgroupidentifier =  new org.hl7.fhir.r4.model.Identifier();
		devicerequest.setGroupIdentifier(devicerequestgroupidentifier);

		/******************** DvcRqst_GrpId_Assigner ********************************************************************************/
		if(d.getDvcRqstGrpIdAssigner() != null) {
			devicerequestgroupidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(d.getDvcRqstGrpIdAssigner()));
		}
		/******************** devicerequestgroupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicerequestgroupidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		devicerequestgroupidentifier.setPeriod(devicerequestgroupidentifierperiod);

		/******************** DvcRqst_GrpId_Prd_End ********************************************************************************/
		if(d.getDvcRqstGrpIdPrdEnd() != null) {
			java.text.SimpleDateFormat DvcRqst_GrpId_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcRqst_GrpId_Prd_Enddate = DvcRqst_GrpId_Prd_Endsdf.parse(d.getDvcRqstGrpIdPrdEnd());
			devicerequestgroupidentifierperiod.setEnd(DvcRqst_GrpId_Prd_Enddate);
		}
		/******************** DvcRqst_GrpId_Prd_Strt ********************************************************************************/
		if(d.getDvcRqstGrpIdPrdStrt() != null) {
			java.text.SimpleDateFormat DvcRqst_GrpId_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcRqst_GrpId_Prd_Strtdate = DvcRqst_GrpId_Prd_Strtsdf.parse(d.getDvcRqstGrpIdPrdStrt());
			devicerequestgroupidentifierperiod.setStart(DvcRqst_GrpId_Prd_Strtdate);
		}
		/******************** DvcRqst_GrpId_Sys ********************************************************************************/
		if(d.getDvcRqstGrpIdSys() != null) {
			devicerequestgroupidentifier.setSystem(d.getDvcRqstGrpIdSys());
		}
		/******************** devicerequestgroupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestgroupidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicerequestgroupidentifier.setType(devicerequestgroupidentifiertype);

		/******************** devicerequestgroupidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicerequestgroupidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		devicerequestgroupidentifiertype.addCoding(devicerequestgroupidentifiertypecoding);

		/******************** DvcRqst_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcRqstGrpIdTypCdgCd() != null) {
			devicerequestgroupidentifiertypecoding.setCode(d.getDvcRqstGrpIdTypCdgCd());
		}
		/******************** DvcRqst_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcRqstGrpIdTypCdgDsply() != null) {
			devicerequestgroupidentifiertypecoding.setDisplay(d.getDvcRqstGrpIdTypCdgDsply());
		}
		/******************** DvcRqst_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcRqstGrpIdTypCdgSys() != null) {
			devicerequestgroupidentifiertypecoding.setSystem(d.getDvcRqstGrpIdTypCdgSys());
		}
		/******************** DvcRqst_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcRqstGrpIdTypCdgUsrSltd() != null) {
			devicerequestgroupidentifiertypecoding.setUserSelected(Boolean.parseBoolean(d.getDvcRqstGrpIdTypCdgUsrSltd()));
		}
		/******************** DvcRqst_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcRqstGrpIdTypCdgVrsn() != null) {
			devicerequestgroupidentifiertypecoding.setVersion(d.getDvcRqstGrpIdTypCdgVrsn());
		}
		/******************** DvcRqst_GrpId_Typ_Txt ********************************************************************************/
		if(d.getDvcRqstGrpIdTypTxt() != null) {
			devicerequestgroupidentifiertype.setText(d.getDvcRqstGrpIdTypTxt());
		}
		/******************** devicerequestgroupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory devicerequestgroupidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		devicerequestgroupidentifier.setUse(devicerequestgroupidentifieruse.fromCode(d.getDvcRqstGrpIdUse()));

		/******************** DvcRqst_GrpId_Vl ********************************************************************************/
		if(d.getDvcRqstGrpIdVl() != null) {
			devicerequestgroupidentifier.setValue(d.getDvcRqstGrpIdVl());
		}
		/******************** devicerequestidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier devicerequestidentifier =  new org.hl7.fhir.r4.model.Identifier();
		devicerequest.addIdentifier(devicerequestidentifier);

		/******************** DvcRqst_Id_Assigner ********************************************************************************/
		if(d.getDvcRqstIdAssigner() != null) {
			devicerequestidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(d.getDvcRqstIdAssigner()));
		}
		/******************** devicerequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicerequestidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		devicerequestidentifier.setPeriod(devicerequestidentifierperiod);

		/******************** DvcRqst_Id_Prd_End ********************************************************************************/
		if(d.getDvcRqstIdPrdEnd() != null) {
			java.text.SimpleDateFormat DvcRqst_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcRqst_Id_Prd_Enddate = DvcRqst_Id_Prd_Endsdf.parse(d.getDvcRqstIdPrdEnd());
			devicerequestidentifierperiod.setEnd(DvcRqst_Id_Prd_Enddate);
		}
		/******************** DvcRqst_Id_Prd_Strt ********************************************************************************/
		if(d.getDvcRqstIdPrdStrt() != null) {
			java.text.SimpleDateFormat DvcRqst_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcRqst_Id_Prd_Strtdate = DvcRqst_Id_Prd_Strtsdf.parse(d.getDvcRqstIdPrdStrt());
			devicerequestidentifierperiod.setStart(DvcRqst_Id_Prd_Strtdate);
		}
		/******************** DvcRqst_Id_Sys ********************************************************************************/
		if(d.getDvcRqstIdSys() != null) {
			devicerequestidentifier.setSystem(d.getDvcRqstIdSys());
		}
		/******************** devicerequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicerequestidentifier.setType(devicerequestidentifiertype);

		/******************** devicerequestidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicerequestidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		devicerequestidentifiertype.addCoding(devicerequestidentifiertypecoding);

		/******************** DvcRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcRqstIdTypCdgCd() != null) {
			devicerequestidentifiertypecoding.setCode(d.getDvcRqstIdTypCdgCd());
		}
		/******************** DvcRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcRqstIdTypCdgDsply() != null) {
			devicerequestidentifiertypecoding.setDisplay(d.getDvcRqstIdTypCdgDsply());
		}
		/******************** DvcRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcRqstIdTypCdgSys() != null) {
			devicerequestidentifiertypecoding.setSystem(d.getDvcRqstIdTypCdgSys());
		}
		/******************** DvcRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcRqstIdTypCdgUsrSltd() != null) {
			devicerequestidentifiertypecoding.setUserSelected(Boolean.parseBoolean(d.getDvcRqstIdTypCdgUsrSltd()));
		}
		/******************** DvcRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcRqstIdTypCdgVrsn() != null) {
			devicerequestidentifiertypecoding.setVersion(d.getDvcRqstIdTypCdgVrsn());
		}
		/******************** DvcRqst_Id_Typ_Txt ********************************************************************************/
		if(d.getDvcRqstIdTypTxt() != null) {
			devicerequestidentifiertype.setText(d.getDvcRqstIdTypTxt());
		}
		/******************** devicerequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory devicerequestidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		devicerequestidentifier.setUse(devicerequestidentifieruse.fromCode(d.getDvcRqstIdUse()));

		/******************** DvcRqst_Id_Vl ********************************************************************************/
		if(d.getDvcRqstIdVl() != null) {
			devicerequestidentifier.setValue(d.getDvcRqstIdVl());
		}
		/******************** DvcRqst_InstantiatesCanonical ********************************************************************************/
		if(d.getDvcRqstInstantiatesCanonical() != null) {
			devicerequest.addInstantiatesCanonical(d.getDvcRqstInstantiatesCanonical());
		}
		/******************** DvcRqst_InstantiatesUri ********************************************************************************/
		if(d.getDvcRqstInstantiatesUri() != null) {
			devicerequest.addInstantiatesUri(d.getDvcRqstInstantiatesUri());
		}
		/******************** DvcRqst_Insrnc ********************************************************************************/
		if(d.getDvcRqstInsrnc() != null) {
			devicerequest.addInsurance( new org.hl7.fhir.r4.model.Reference(d.getDvcRqstInsrnc()));
		}
		/******************** devicerequestintent ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceRequest.RequestIntentEnumFactory devicerequestintent =  new org.hl7.fhir.r4.model.DeviceRequest.RequestIntentEnumFactory();
		devicerequest.setIntent(devicerequestintent.fromCode(d.getDvcRqstIntent()));

		/******************** devicerequestnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation devicerequestnote =  new org.hl7.fhir.r4.model.Annotation();
		devicerequest.addNote(devicerequestnote);

		/******************** DvcRqst_Nt_AthrRfrnc ********************************************************************************/
		if(d.getDvcRqstNtAthrRfrnc() != null) {
			devicerequestnote.setAuthor( new org.hl7.fhir.r4.model.Reference(d.getDvcRqstNtAthrRfrnc()));
		}
		/******************** DvcRqst_Nt_AthrStrgTyp ********************************************************************************/
		if(d.getDvcRqstNtAthrStrgTyp() != null) {
			devicerequestnote.setAuthor( new org.hl7.fhir.r4.model.StringType(d.getDvcRqstNtAthrStrgTyp()));
		}
		/******************** DvcRqst_Nt_Txt ********************************************************************************/
		if(d.getDvcRqstNtTxt() != null) {
			devicerequestnote.setText(d.getDvcRqstNtTxt());
		}
		/******************** DvcRqst_Nt_Time ********************************************************************************/
		if(d.getDvcRqstNtTime() != null) {
			java.text.SimpleDateFormat DvcRqst_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcRqst_Nt_Timedate = DvcRqst_Nt_Timesdf.parse(d.getDvcRqstNtTime());
			devicerequestnote.setTime(DvcRqst_Nt_Timedate);
		}
		/******************** DvcRqst_OccrnceDtTimeTyp ********************************************************************************/
		if(d.getDvcRqstOccrnceDtTimeTyp() != null) {
			devicerequest.setOccurrence( new org.hl7.fhir.r4.model.DateTimeType(d.getDvcRqstOccrnceDtTimeTyp()));
		}
		/******************** devicerequestoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicerequestoccurrenceperiod =  new org.hl7.fhir.r4.model.Period();
		devicerequest.setOccurrence(devicerequestoccurrenceperiod);

		/******************** DvcRqst_OccrncePrd_End ********************************************************************************/
		if(d.getDvcRqstOccrncePrdEnd() != null) {
			java.text.SimpleDateFormat DvcRqst_OccrncePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcRqst_OccrncePrd_Enddate = DvcRqst_OccrncePrd_Endsdf.parse(d.getDvcRqstOccrncePrdEnd());
			devicerequestoccurrenceperiod.setEnd(DvcRqst_OccrncePrd_Enddate);
		}
		/******************** DvcRqst_OccrncePrd_Strt ********************************************************************************/
		if(d.getDvcRqstOccrncePrdStrt() != null) {
			java.text.SimpleDateFormat DvcRqst_OccrncePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcRqst_OccrncePrd_Strtdate = DvcRqst_OccrncePrd_Strtsdf.parse(d.getDvcRqstOccrncePrdStrt());
			devicerequestoccurrenceperiod.setStart(DvcRqst_OccrncePrd_Strtdate);
		}
		/******************** devicerequestoccurrencetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing devicerequestoccurrencetiming =  new org.hl7.fhir.r4.model.Timing();
		devicerequest.setOccurrence(devicerequestoccurrencetiming);

		/******************** devicerequestoccurrencetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestoccurrencetimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicerequestoccurrencetiming.setCode(devicerequestoccurrencetimingcode);

		/******************** devicerequestoccurrencetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicerequestoccurrencetimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		devicerequestoccurrencetimingcode.addCoding(devicerequestoccurrencetimingcodecoding);

		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgCdCdgCd() != null) {
			devicerequestoccurrencetimingcodecoding.setCode(d.getDvcRqstOccrnceTmgCdCdgCd());
		}
		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgCdCdgDsply() != null) {
			devicerequestoccurrencetimingcodecoding.setDisplay(d.getDvcRqstOccrnceTmgCdCdgDsply());
		}
		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgCdCdgSys() != null) {
			devicerequestoccurrencetimingcodecoding.setSystem(d.getDvcRqstOccrnceTmgCdCdgSys());
		}
		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgCdCdgUsrSltd() != null) {
			devicerequestoccurrencetimingcodecoding.setUserSelected(Boolean.parseBoolean(d.getDvcRqstOccrnceTmgCdCdgUsrSltd()));
		}
		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgCdCdgVrsn() != null) {
			devicerequestoccurrencetimingcodecoding.setVersion(d.getDvcRqstOccrnceTmgCdCdgVrsn());
		}
		/******************** DvcRqst_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgCdTxt() != null) {
			devicerequestoccurrencetimingcode.setText(d.getDvcRqstOccrnceTmgCdTxt());
		}
		/******************** DvcRqst_OccrnceTmg_Evnt ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgEvnt() != null) {
			java.text.SimpleDateFormat DvcRqst_OccrnceTmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcRqst_OccrnceTmg_Evntdate = DvcRqst_OccrnceTmg_Evntsdf.parse(d.getDvcRqstOccrnceTmgEvnt());
			devicerequestoccurrencetiming.addEvent(DvcRqst_OccrnceTmg_Evntdate);
		}
		/******************** devicerequestoccurrencetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent devicerequestoccurrencetimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		devicerequestoccurrencetiming.setRepeat(devicerequestoccurrencetimingrepeat);

		/******************** devicerequestoccurrencetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration devicerequestoccurrencetimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		devicerequestoccurrencetimingrepeat.setBounds(devicerequestoccurrencetimingrepeatboundsduration);

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsDurationCd() != null) {
			devicerequestoccurrencetimingrepeatboundsduration.setCode(d.getDvcRqstOccrnceTmgRptBndsDurationCd());
		}
		/******************** devicerequestoccurrencetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory devicerequestoccurrencetimingrepeatboundsdurationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		devicerequestoccurrencetimingrepeatboundsduration.setComparator(devicerequestoccurrencetimingrepeatboundsdurationcomparator.fromCode(d.getDvcRqstOccrnceTmgRptBndsDurationCmprtr()));

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsDurationSys() != null) {
			devicerequestoccurrencetimingrepeatboundsduration.setSystem(d.getDvcRqstOccrnceTmgRptBndsDurationSys());
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsDurationUnt() != null) {
			devicerequestoccurrencetimingrepeatboundsduration.setUnit(d.getDvcRqstOccrnceTmgRptBndsDurationUnt());
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsDurationVl() != null) {
			devicerequestoccurrencetimingrepeatboundsduration.setValue(Double.parseDouble((d.getDvcRqstOccrnceTmgRptBndsDurationVl())));
		}
		/******************** devicerequestoccurrencetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicerequestoccurrencetimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		devicerequestoccurrencetimingrepeat.setBounds(devicerequestoccurrencetimingrepeatboundsperiod);

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat DvcRqst_OccrnceTmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcRqst_OccrnceTmg_Rpt_BndsPrd_Enddate = DvcRqst_OccrnceTmg_Rpt_BndsPrd_Endsdf.parse(d.getDvcRqstOccrnceTmgRptBndsPrdEnd());
			devicerequestoccurrencetimingrepeatboundsperiod.setEnd(DvcRqst_OccrnceTmg_Rpt_BndsPrd_Enddate);
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat DvcRqst_OccrnceTmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcRqst_OccrnceTmg_Rpt_BndsPrd_Strtdate = DvcRqst_OccrnceTmg_Rpt_BndsPrd_Strtsdf.parse(d.getDvcRqstOccrnceTmgRptBndsPrdStrt());
			devicerequestoccurrencetimingrepeatboundsperiod.setStart(DvcRqst_OccrnceTmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** devicerequestoccurrencetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range devicerequestoccurrencetimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		devicerequestoccurrencetimingrepeat.setBounds(devicerequestoccurrencetimingrepeatboundsrange);

		/******************** devicerequestoccurrencetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicerequestoccurrencetimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		devicerequestoccurrencetimingrepeatboundsrange.setHigh(devicerequestoccurrencetimingrepeatboundsrangehigh);

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsRngHiCd() != null) {
			devicerequestoccurrencetimingrepeatboundsrangehigh.setCode(d.getDvcRqstOccrnceTmgRptBndsRngHiCd());
		}
		/******************** devicerequestoccurrencetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory devicerequestoccurrencetimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		devicerequestoccurrencetimingrepeatboundsrangehigh.setComparator(devicerequestoccurrencetimingrepeatboundsrangehighcomparator.fromCode(d.getDvcRqstOccrnceTmgRptBndsRngHiCmprtr()));

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsRngHiSys() != null) {
			devicerequestoccurrencetimingrepeatboundsrangehigh.setSystem(d.getDvcRqstOccrnceTmgRptBndsRngHiSys());
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsRngHiUnt() != null) {
			devicerequestoccurrencetimingrepeatboundsrangehigh.setUnit(d.getDvcRqstOccrnceTmgRptBndsRngHiUnt());
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsRngHiVl() != null) {
			devicerequestoccurrencetimingrepeatboundsrangehigh.setValue(Double.parseDouble((d.getDvcRqstOccrnceTmgRptBndsRngHiVl())));
		}
		/******************** devicerequestoccurrencetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicerequestoccurrencetimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		devicerequestoccurrencetimingrepeatboundsrange.setLow(devicerequestoccurrencetimingrepeatboundsrangelow);

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsRngLwCd() != null) {
			devicerequestoccurrencetimingrepeatboundsrangelow.setCode(d.getDvcRqstOccrnceTmgRptBndsRngLwCd());
		}
		/******************** devicerequestoccurrencetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory devicerequestoccurrencetimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		devicerequestoccurrencetimingrepeatboundsrangelow.setComparator(devicerequestoccurrencetimingrepeatboundsrangelowcomparator.fromCode(d.getDvcRqstOccrnceTmgRptBndsRngLwCmprtr()));

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsRngLwSys() != null) {
			devicerequestoccurrencetimingrepeatboundsrangelow.setSystem(d.getDvcRqstOccrnceTmgRptBndsRngLwSys());
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsRngLwUnt() != null) {
			devicerequestoccurrencetimingrepeatboundsrangelow.setUnit(d.getDvcRqstOccrnceTmgRptBndsRngLwUnt());
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptBndsRngLwVl() != null) {
			devicerequestoccurrencetimingrepeatboundsrangelow.setValue(Double.parseDouble((d.getDvcRqstOccrnceTmgRptBndsRngLwVl())));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptCnt() != null) {
			devicerequestoccurrencetimingrepeat.setCount(Integer.parseInt(d.getDvcRqstOccrnceTmgRptCnt()));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptCntMx() != null) {
			devicerequestoccurrencetimingrepeat.setCountMax(Integer.parseInt(d.getDvcRqstOccrnceTmgRptCntMx()));
		}
		/******************** devicerequestoccurrencetimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory devicerequestoccurrencetimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		devicerequestoccurrencetimingrepeat.addDayOfWeek(devicerequestoccurrencetimingrepeatdayofweek.fromCode(d.getDvcRqstOccrnceTmgRptDayOfWeek()));

		/******************** DvcRqst_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptDuration() != null) {
			devicerequestoccurrencetimingrepeat.setDuration(Double.parseDouble((d.getDvcRqstOccrnceTmgRptDuration())));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptDurationMx() != null) {
			devicerequestoccurrencetimingrepeat.setDurationMax(Double.parseDouble((d.getDvcRqstOccrnceTmgRptDurationMx())));
		}
		/******************** devicerequestoccurrencetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory devicerequestoccurrencetimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		devicerequestoccurrencetimingrepeat.setDurationUnit(devicerequestoccurrencetimingrepeatdurationunit.fromCode(d.getDvcRqstOccrnceTmgRptDurationUnt()));

		/******************** DvcRqst_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptFrqncy() != null) {
			devicerequestoccurrencetimingrepeat.setFrequency(Integer.parseInt(d.getDvcRqstOccrnceTmgRptFrqncy()));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptFrqncyMx() != null) {
			devicerequestoccurrencetimingrepeat.setFrequencyMax(Integer.parseInt(d.getDvcRqstOccrnceTmgRptFrqncyMx()));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptOff() != null) {
			devicerequestoccurrencetimingrepeat.setOffset(Integer.parseInt(d.getDvcRqstOccrnceTmgRptOff()));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptPrd() != null) {
			devicerequestoccurrencetimingrepeat.setPeriod(Double.parseDouble((d.getDvcRqstOccrnceTmgRptPrd())));
		}
		/******************** DvcRqst_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptPrdMx() != null) {
			devicerequestoccurrencetimingrepeat.setPeriodMax(new java.math.BigDecimal((d.getDvcRqstOccrnceTmgRptPrdMx())));
		}
		/******************** devicerequestoccurrencetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory devicerequestoccurrencetimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		devicerequestoccurrencetimingrepeat.setPeriodUnit(devicerequestoccurrencetimingrepeatperiodunit.fromCode(d.getDvcRqstOccrnceTmgRptPrdUnt()));

		/******************** DvcRqst_OccrnceTmg_Rpt_TimeOfDay ********************************************************************************/
		if(d.getDvcRqstOccrnceTmgRptTimeOfDay() != null) {
			devicerequestoccurrencetimingrepeat.addTimeOfDay(d.getDvcRqstOccrnceTmgRptTimeOfDay());
		}
		/******************** devicerequestoccurrencetimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory devicerequestoccurrencetimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		devicerequestoccurrencetimingrepeat.addWhen(devicerequestoccurrencetimingrepeatwhen.fromCode(d.getDvcRqstOccrnceTmgRptWhen()));

		/******************** devicerequestparameter ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceRequest.DeviceRequestParameterComponent devicerequestparameter =  new org.hl7.fhir.r4.model.DeviceRequest.DeviceRequestParameterComponent();
		devicerequest.addParameter(devicerequestparameter);

		/******************** devicerequestparametercode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestparametercode =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicerequestparameter.setCode(devicerequestparametercode);

		/******************** devicerequestparametercodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicerequestparametercodecoding =  new org.hl7.fhir.r4.model.Coding();
		devicerequestparametercode.addCoding(devicerequestparametercodecoding);

		/******************** DvcRqst_Prmtr_Cd_Cdg_Cd ********************************************************************************/
		if(d.getDvcRqstPrmtrCdCdgCd() != null) {
			devicerequestparametercodecoding.setCode(d.getDvcRqstPrmtrCdCdgCd());
		}
		/******************** DvcRqst_Prmtr_Cd_Cdg_Dsply ********************************************************************************/
		if(d.getDvcRqstPrmtrCdCdgDsply() != null) {
			devicerequestparametercodecoding.setDisplay(d.getDvcRqstPrmtrCdCdgDsply());
		}
		/******************** DvcRqst_Prmtr_Cd_Cdg_Sys ********************************************************************************/
		if(d.getDvcRqstPrmtrCdCdgSys() != null) {
			devicerequestparametercodecoding.setSystem(d.getDvcRqstPrmtrCdCdgSys());
		}
		/******************** DvcRqst_Prmtr_Cd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcRqstPrmtrCdCdgUsrSltd() != null) {
			devicerequestparametercodecoding.setUserSelected(Boolean.parseBoolean(d.getDvcRqstPrmtrCdCdgUsrSltd()));
		}
		/******************** DvcRqst_Prmtr_Cd_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcRqstPrmtrCdCdgVrsn() != null) {
			devicerequestparametercodecoding.setVersion(d.getDvcRqstPrmtrCdCdgVrsn());
		}
		/******************** DvcRqst_Prmtr_Cd_Txt ********************************************************************************/
		if(d.getDvcRqstPrmtrCdTxt() != null) {
			devicerequestparametercode.setText(d.getDvcRqstPrmtrCdTxt());
		}
		/******************** DvcRqst_Prmtr_VlBooleanTyp ********************************************************************************/
		if(d.getDvcRqstPrmtrVlBooleanTyp() != null) {
			devicerequestparameter.setValue( new org.hl7.fhir.r4.model.BooleanType(d.getDvcRqstPrmtrVlBooleanTyp()));
		}
		/******************** devicerequestparametervaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestparametervaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicerequestparameter.setValue(devicerequestparametervaluecodeableconcept);

		/******************** devicerequestparametervaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicerequestparametervaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		devicerequestparametervaluecodeableconcept.addCoding(devicerequestparametervaluecodeableconceptcoding);

		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(d.getDvcRqstPrmtrVlCdbleCncptCdgCd() != null) {
			devicerequestparametervaluecodeableconceptcoding.setCode(d.getDvcRqstPrmtrVlCdbleCncptCdgCd());
		}
		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(d.getDvcRqstPrmtrVlCdbleCncptCdgDsply() != null) {
			devicerequestparametervaluecodeableconceptcoding.setDisplay(d.getDvcRqstPrmtrVlCdbleCncptCdgDsply());
		}
		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(d.getDvcRqstPrmtrVlCdbleCncptCdgSys() != null) {
			devicerequestparametervaluecodeableconceptcoding.setSystem(d.getDvcRqstPrmtrVlCdbleCncptCdgSys());
		}
		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcRqstPrmtrVlCdbleCncptCdgUsrSltd() != null) {
			devicerequestparametervaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(d.getDvcRqstPrmtrVlCdbleCncptCdgUsrSltd()));
		}
		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcRqstPrmtrVlCdbleCncptCdgVrsn() != null) {
			devicerequestparametervaluecodeableconceptcoding.setVersion(d.getDvcRqstPrmtrVlCdbleCncptCdgVrsn());
		}
		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Txt ********************************************************************************/
		if(d.getDvcRqstPrmtrVlCdbleCncptTxt() != null) {
			devicerequestparametervaluecodeableconcept.setText(d.getDvcRqstPrmtrVlCdbleCncptTxt());
		}
		/******************** devicerequestparametervaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicerequestparametervaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		devicerequestparameter.setValue(devicerequestparametervaluequantity);

		/******************** DvcRqst_Prmtr_VlQnty_Cd ********************************************************************************/
		if(d.getDvcRqstPrmtrVlQntyCd() != null) {
			devicerequestparametervaluequantity.setCode(d.getDvcRqstPrmtrVlQntyCd());
		}
		/******************** devicerequestparametervaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory devicerequestparametervaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		devicerequestparametervaluequantity.setComparator(devicerequestparametervaluequantitycomparator.fromCode(d.getDvcRqstPrmtrVlQntyCmprtr()));

		/******************** DvcRqst_Prmtr_VlQnty_Sys ********************************************************************************/
		if(d.getDvcRqstPrmtrVlQntySys() != null) {
			devicerequestparametervaluequantity.setSystem(d.getDvcRqstPrmtrVlQntySys());
		}
		/******************** DvcRqst_Prmtr_VlQnty_Unt ********************************************************************************/
		if(d.getDvcRqstPrmtrVlQntyUnt() != null) {
			devicerequestparametervaluequantity.setUnit(d.getDvcRqstPrmtrVlQntyUnt());
		}
		/******************** DvcRqst_Prmtr_VlQnty_Vl ********************************************************************************/
		if(d.getDvcRqstPrmtrVlQntyVl() != null) {
			devicerequestparametervaluequantity.setValue(Double.parseDouble((d.getDvcRqstPrmtrVlQntyVl())));
		}
		/******************** devicerequestparametervaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range devicerequestparametervaluerange =  new org.hl7.fhir.r4.model.Range();
		devicerequestparameter.setValue(devicerequestparametervaluerange);

		/******************** devicerequestparametervaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicerequestparametervaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		devicerequestparametervaluerange.setHigh(devicerequestparametervaluerangehigh);

		/******************** DvcRqst_Prmtr_VlRng_Hi_Cd ********************************************************************************/
		if(d.getDvcRqstPrmtrVlRngHiCd() != null) {
			devicerequestparametervaluerangehigh.setCode(d.getDvcRqstPrmtrVlRngHiCd());
		}
		/******************** devicerequestparametervaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory devicerequestparametervaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		devicerequestparametervaluerangehigh.setComparator(devicerequestparametervaluerangehighcomparator.fromCode(d.getDvcRqstPrmtrVlRngHiCmprtr()));

		/******************** DvcRqst_Prmtr_VlRng_Hi_Sys ********************************************************************************/
		if(d.getDvcRqstPrmtrVlRngHiSys() != null) {
			devicerequestparametervaluerangehigh.setSystem(d.getDvcRqstPrmtrVlRngHiSys());
		}
		/******************** DvcRqst_Prmtr_VlRng_Hi_Unt ********************************************************************************/
		if(d.getDvcRqstPrmtrVlRngHiUnt() != null) {
			devicerequestparametervaluerangehigh.setUnit(d.getDvcRqstPrmtrVlRngHiUnt());
		}
		/******************** DvcRqst_Prmtr_VlRng_Hi_Vl ********************************************************************************/
		if(d.getDvcRqstPrmtrVlRngHiVl() != null) {
			devicerequestparametervaluerangehigh.setValue(Double.parseDouble((d.getDvcRqstPrmtrVlRngHiVl())));
		}
		/******************** devicerequestparametervaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicerequestparametervaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		devicerequestparametervaluerange.setLow(devicerequestparametervaluerangelow);

		/******************** DvcRqst_Prmtr_VlRng_Lw_Cd ********************************************************************************/
		if(d.getDvcRqstPrmtrVlRngLwCd() != null) {
			devicerequestparametervaluerangelow.setCode(d.getDvcRqstPrmtrVlRngLwCd());
		}
		/******************** devicerequestparametervaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory devicerequestparametervaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		devicerequestparametervaluerangelow.setComparator(devicerequestparametervaluerangelowcomparator.fromCode(d.getDvcRqstPrmtrVlRngLwCmprtr()));

		/******************** DvcRqst_Prmtr_VlRng_Lw_Sys ********************************************************************************/
		if(d.getDvcRqstPrmtrVlRngLwSys() != null) {
			devicerequestparametervaluerangelow.setSystem(d.getDvcRqstPrmtrVlRngLwSys());
		}
		/******************** DvcRqst_Prmtr_VlRng_Lw_Unt ********************************************************************************/
		if(d.getDvcRqstPrmtrVlRngLwUnt() != null) {
			devicerequestparametervaluerangelow.setUnit(d.getDvcRqstPrmtrVlRngLwUnt());
		}
		/******************** DvcRqst_Prmtr_VlRng_Lw_Vl ********************************************************************************/
		if(d.getDvcRqstPrmtrVlRngLwVl() != null) {
			devicerequestparametervaluerangelow.setValue(Double.parseDouble((d.getDvcRqstPrmtrVlRngLwVl())));
		}
		/******************** DvcRqst_Prfrmr ********************************************************************************/
		if(d.getDvcRqstPrfrmr() != null) {
			devicerequest.setPerformer( new org.hl7.fhir.r4.model.Reference(d.getDvcRqstPrfrmr()));
		}
		/******************** devicerequestperformertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestperformertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicerequest.setPerformerType(devicerequestperformertype);

		/******************** devicerequestperformertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicerequestperformertypecoding =  new org.hl7.fhir.r4.model.Coding();
		devicerequestperformertype.addCoding(devicerequestperformertypecoding);

		/******************** DvcRqst_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(d.getDvcRqstPrfrmrTypCdgCd() != null) {
			devicerequestperformertypecoding.setCode(d.getDvcRqstPrfrmrTypCdgCd());
		}
		/******************** DvcRqst_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(d.getDvcRqstPrfrmrTypCdgDsply() != null) {
			devicerequestperformertypecoding.setDisplay(d.getDvcRqstPrfrmrTypCdgDsply());
		}
		/******************** DvcRqst_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(d.getDvcRqstPrfrmrTypCdgSys() != null) {
			devicerequestperformertypecoding.setSystem(d.getDvcRqstPrfrmrTypCdgSys());
		}
		/******************** DvcRqst_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcRqstPrfrmrTypCdgUsrSltd() != null) {
			devicerequestperformertypecoding.setUserSelected(Boolean.parseBoolean(d.getDvcRqstPrfrmrTypCdgUsrSltd()));
		}
		/******************** DvcRqst_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcRqstPrfrmrTypCdgVrsn() != null) {
			devicerequestperformertypecoding.setVersion(d.getDvcRqstPrfrmrTypCdgVrsn());
		}
		/******************** DvcRqst_PrfrmrTyp_Txt ********************************************************************************/
		if(d.getDvcRqstPrfrmrTypTxt() != null) {
			devicerequestperformertype.setText(d.getDvcRqstPrfrmrTypTxt());
		}
		/******************** DvcRqst_PriorRqst ********************************************************************************/
		if(d.getDvcRqstPriorRqst() != null) {
			devicerequest.addPriorRequest( new org.hl7.fhir.r4.model.Reference(d.getDvcRqstPriorRqst()));
		}
		/******************** devicerequestpriority ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceRequest.RequestPriorityEnumFactory devicerequestpriority =  new org.hl7.fhir.r4.model.DeviceRequest.RequestPriorityEnumFactory();
		devicerequest.setPriority(devicerequestpriority.fromCode(d.getDvcRqstPriority()));

		/******************** devicerequestreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicerequest.addReasonCode(devicerequestreasoncode);

		/******************** devicerequestreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicerequestreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		devicerequestreasoncode.addCoding(devicerequestreasoncodecoding);

		/******************** DvcRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(d.getDvcRqstRsnCdCdgCd() != null) {
			devicerequestreasoncodecoding.setCode(d.getDvcRqstRsnCdCdgCd());
		}
		/******************** DvcRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(d.getDvcRqstRsnCdCdgDsply() != null) {
			devicerequestreasoncodecoding.setDisplay(d.getDvcRqstRsnCdCdgDsply());
		}
		/******************** DvcRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(d.getDvcRqstRsnCdCdgSys() != null) {
			devicerequestreasoncodecoding.setSystem(d.getDvcRqstRsnCdCdgSys());
		}
		/******************** DvcRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcRqstRsnCdCdgUsrSltd() != null) {
			devicerequestreasoncodecoding.setUserSelected(Boolean.parseBoolean(d.getDvcRqstRsnCdCdgUsrSltd()));
		}
		/******************** DvcRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcRqstRsnCdCdgVrsn() != null) {
			devicerequestreasoncodecoding.setVersion(d.getDvcRqstRsnCdCdgVrsn());
		}
		/******************** DvcRqst_RsnCd_Txt ********************************************************************************/
		if(d.getDvcRqstRsnCdTxt() != null) {
			devicerequestreasoncode.setText(d.getDvcRqstRsnCdTxt());
		}
		/******************** DvcRqst_RsnRfrnc ********************************************************************************/
		if(d.getDvcRqstRsnRfrnc() != null) {
			devicerequest.addReasonReference( new org.hl7.fhir.r4.model.Reference(d.getDvcRqstRsnRfrnc()));
		}
		/******************** DvcRqst_RelevantHis ********************************************************************************/
		if(d.getDvcRqstRelevantHis() != null) {
			devicerequest.addRelevantHistory( new org.hl7.fhir.r4.model.Reference(d.getDvcRqstRelevantHis()));
		}
		/******************** DvcRqst_Rqster ********************************************************************************/
		if(d.getDvcRqstRqster() != null) {
			devicerequest.setRequester( new org.hl7.fhir.r4.model.Reference(d.getDvcRqstRqster()));
		}
		/******************** devicerequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceRequest.DeviceRequestStatusEnumFactory devicerequeststatus =  new org.hl7.fhir.r4.model.DeviceRequest.DeviceRequestStatusEnumFactory();
		devicerequest.setStatus(devicerequeststatus.fromCode(d.getDvcRqstSts()));

		/******************** DvcRqst_Sbjct ********************************************************************************/
		if(d.getDvcRqstSbjct() != null) {
			devicerequest.setSubject( new org.hl7.fhir.r4.model.Reference(d.getDvcRqstSbjct()));
		}
		/******************** DvcRqst_SprtingInfo ********************************************************************************/
		if(d.getDvcRqstSprtingInfo() != null) {
			devicerequest.addSupportingInfo( new org.hl7.fhir.r4.model.Reference(d.getDvcRqstSprtingInfo()));
		}
		return devicerequest;
	}
}
