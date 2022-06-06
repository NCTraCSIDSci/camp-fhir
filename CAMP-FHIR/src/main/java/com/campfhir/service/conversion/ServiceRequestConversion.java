package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ServiceRequest;
public class ServiceRequestConversion 
{
	public org.hl7.fhir.r4.model.ServiceRequest ServiceRequests(ServiceRequest s) throws ParseException
	{
		org.hl7.fhir.r4.model.ServiceRequest servicerequest = new org.hl7.fhir.r4.model.ServiceRequest();

		/******************** id ********************************************************************************/
		servicerequest.setId(s.getId());

		/******************** SrvRqst_AsNdBooleanTyp ********************************************************************************/
		if(s.getSrvRqstAsNdBooleanTyp() != null) {
			servicerequest.setAsNeeded( new org.hl7.fhir.r4.model.BooleanType(s.getSrvRqstAsNdBooleanTyp()));
		}
		/******************** servicerequestasneededcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestasneededcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		servicerequest.setAsNeeded(servicerequestasneededcodeableconcept);

		/******************** servicerequestasneededcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestasneededcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		servicerequestasneededcodeableconcept.addCoding(servicerequestasneededcodeableconceptcoding);

		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstAsNdCdbleCncptCdgCd() != null) {
			servicerequestasneededcodeableconceptcoding.setCode(s.getSrvRqstAsNdCdbleCncptCdgCd());
		}
		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstAsNdCdbleCncptCdgDsply() != null) {
			servicerequestasneededcodeableconceptcoding.setDisplay(s.getSrvRqstAsNdCdbleCncptCdgDsply());
		}
		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstAsNdCdbleCncptCdgSys() != null) {
			servicerequestasneededcodeableconceptcoding.setSystem(s.getSrvRqstAsNdCdbleCncptCdgSys());
		}
		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstAsNdCdbleCncptCdgUsrSltd() != null) {
			servicerequestasneededcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(s.getSrvRqstAsNdCdbleCncptCdgUsrSltd()));
		}
		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstAsNdCdbleCncptCdgVrsn() != null) {
			servicerequestasneededcodeableconceptcoding.setVersion(s.getSrvRqstAsNdCdbleCncptCdgVrsn());
		}
		/******************** SrvRqst_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(s.getSrvRqstAsNdCdbleCncptTxt() != null) {
			servicerequestasneededcodeableconcept.setText(s.getSrvRqstAsNdCdbleCncptTxt());
		}
		/******************** SrvRqst_AthredOn ********************************************************************************/
		if(s.getSrvRqstAthredOn() != null) {
			java.text.SimpleDateFormat SrvRqst_AthredOnsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SrvRqst_AthredOndate = SrvRqst_AthredOnsdf.parse(s.getSrvRqstAthredOn());
			servicerequest.setAuthoredOn(SrvRqst_AthredOndate);
		}
		/******************** SrvRqst_BasedOn ********************************************************************************/
		if(s.getSrvRqstBasedOn() != null) {
			servicerequest.addBasedOn( new org.hl7.fhir.r4.model.Reference(s.getSrvRqstBasedOn()));
		}
		/******************** servicerequestbodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestbodysite =  new org.hl7.fhir.r4.model.CodeableConcept();
		servicerequest.addBodySite(servicerequestbodysite);

		/******************** servicerequestbodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestbodysitecoding =  new org.hl7.fhir.r4.model.Coding();
		servicerequestbodysite.addCoding(servicerequestbodysitecoding);

		/******************** SrvRqst_BodySite_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstBodySiteCdgCd() != null) {
			servicerequestbodysitecoding.setCode(s.getSrvRqstBodySiteCdgCd());
		}
		/******************** SrvRqst_BodySite_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstBodySiteCdgDsply() != null) {
			servicerequestbodysitecoding.setDisplay(s.getSrvRqstBodySiteCdgDsply());
		}
		/******************** SrvRqst_BodySite_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstBodySiteCdgSys() != null) {
			servicerequestbodysitecoding.setSystem(s.getSrvRqstBodySiteCdgSys());
		}
		/******************** SrvRqst_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstBodySiteCdgUsrSltd() != null) {
			servicerequestbodysitecoding.setUserSelected(Boolean.parseBoolean(s.getSrvRqstBodySiteCdgUsrSltd()));
		}
		/******************** SrvRqst_BodySite_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstBodySiteCdgVrsn() != null) {
			servicerequestbodysitecoding.setVersion(s.getSrvRqstBodySiteCdgVrsn());
		}
		/******************** SrvRqst_BodySite_Txt ********************************************************************************/
		if(s.getSrvRqstBodySiteTxt() != null) {
			servicerequestbodysite.setText(s.getSrvRqstBodySiteTxt());
		}
		/******************** servicerequestcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		servicerequest.addCategory(servicerequestcategory);

		/******************** servicerequestcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		servicerequestcategory.addCoding(servicerequestcategorycoding);

		/******************** SrvRqst_Ctgry_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstCtgryCdgCd() != null) {
			servicerequestcategorycoding.setCode(s.getSrvRqstCtgryCdgCd());
		}
		/******************** SrvRqst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstCtgryCdgDsply() != null) {
			servicerequestcategorycoding.setDisplay(s.getSrvRqstCtgryCdgDsply());
		}
		/******************** SrvRqst_Ctgry_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstCtgryCdgSys() != null) {
			servicerequestcategorycoding.setSystem(s.getSrvRqstCtgryCdgSys());
		}
		/******************** SrvRqst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstCtgryCdgUsrSltd() != null) {
			servicerequestcategorycoding.setUserSelected(Boolean.parseBoolean(s.getSrvRqstCtgryCdgUsrSltd()));
		}
		/******************** SrvRqst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstCtgryCdgVrsn() != null) {
			servicerequestcategorycoding.setVersion(s.getSrvRqstCtgryCdgVrsn());
		}
		/******************** SrvRqst_Ctgry_Txt ********************************************************************************/
		if(s.getSrvRqstCtgryTxt() != null) {
			servicerequestcategory.setText(s.getSrvRqstCtgryTxt());
		}
		/******************** servicerequestcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		servicerequest.setCode(servicerequestcode);

		/******************** servicerequestcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestcodecoding =  new org.hl7.fhir.r4.model.Coding();
		servicerequestcode.addCoding(servicerequestcodecoding);

		/******************** SrvRqst_Cd_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstCdCdgCd() != null) {
			servicerequestcodecoding.setCode(s.getSrvRqstCdCdgCd());
		}
		/******************** SrvRqst_Cd_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstCdCdgDsply() != null) {
			servicerequestcodecoding.setDisplay(s.getSrvRqstCdCdgDsply());
		}
		/******************** SrvRqst_Cd_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstCdCdgSys() != null) {
			servicerequestcodecoding.setSystem(s.getSrvRqstCdCdgSys());
		}
		/******************** SrvRqst_Cd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstCdCdgUsrSltd() != null) {
			servicerequestcodecoding.setUserSelected(Boolean.parseBoolean(s.getSrvRqstCdCdgUsrSltd()));
		}
		/******************** SrvRqst_Cd_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstCdCdgVrsn() != null) {
			servicerequestcodecoding.setVersion(s.getSrvRqstCdCdgVrsn());
		}
		/******************** SrvRqst_Cd_Txt ********************************************************************************/
		if(s.getSrvRqstCdTxt() != null) {
			servicerequestcode.setText(s.getSrvRqstCdTxt());
		}
		/******************** SrvRqst_DoNotPerform ********************************************************************************/
		if(s.getSrvRqstDoNotPerform() != null) {
			servicerequest.setDoNotPerform(Boolean.parseBoolean(s.getSrvRqstDoNotPerform()));
		}
		/******************** SrvRqst_Enc ********************************************************************************/
		if(s.getSrvRqstEnc() != null) {
			servicerequest.setEncounter( new org.hl7.fhir.r4.model.Reference(s.getSrvRqstEnc()));
		}
		/******************** servicerequestidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier servicerequestidentifier =  new org.hl7.fhir.r4.model.Identifier();
		servicerequest.addIdentifier(servicerequestidentifier);

		/******************** SrvRqst_Id_Assigner ********************************************************************************/
		if(s.getSrvRqstIdAssigner() != null) {
			servicerequestidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSrvRqstIdAssigner()));
		}
		/******************** servicerequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period servicerequestidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		servicerequestidentifier.setPeriod(servicerequestidentifierperiod);

		/******************** SrvRqst_Id_Prd_End ********************************************************************************/
		if(s.getSrvRqstIdPrdEnd() != null) {
			java.text.SimpleDateFormat SrvRqst_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SrvRqst_Id_Prd_Enddate = SrvRqst_Id_Prd_Endsdf.parse(s.getSrvRqstIdPrdEnd());
			servicerequestidentifierperiod.setEnd(SrvRqst_Id_Prd_Enddate);
		}
		/******************** SrvRqst_Id_Prd_Strt ********************************************************************************/
		if(s.getSrvRqstIdPrdStrt() != null) {
			java.text.SimpleDateFormat SrvRqst_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SrvRqst_Id_Prd_Strtdate = SrvRqst_Id_Prd_Strtsdf.parse(s.getSrvRqstIdPrdStrt());
			servicerequestidentifierperiod.setStart(SrvRqst_Id_Prd_Strtdate);
		}
		/******************** SrvRqst_Id_Sys ********************************************************************************/
		if(s.getSrvRqstIdSys() != null) {
			servicerequestidentifier.setSystem(s.getSrvRqstIdSys());
		}
		/******************** servicerequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		servicerequestidentifier.setType(servicerequestidentifiertype);

		/******************** servicerequestidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		servicerequestidentifiertype.addCoding(servicerequestidentifiertypecoding);

		/******************** SrvRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstIdTypCdgCd() != null) {
			servicerequestidentifiertypecoding.setCode(s.getSrvRqstIdTypCdgCd());
		}
		/******************** SrvRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstIdTypCdgDsply() != null) {
			servicerequestidentifiertypecoding.setDisplay(s.getSrvRqstIdTypCdgDsply());
		}
		/******************** SrvRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstIdTypCdgSys() != null) {
			servicerequestidentifiertypecoding.setSystem(s.getSrvRqstIdTypCdgSys());
		}
		/******************** SrvRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstIdTypCdgUsrSltd() != null) {
			servicerequestidentifiertypecoding.setUserSelected(Boolean.parseBoolean(s.getSrvRqstIdTypCdgUsrSltd()));
		}
		/******************** SrvRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstIdTypCdgVrsn() != null) {
			servicerequestidentifiertypecoding.setVersion(s.getSrvRqstIdTypCdgVrsn());
		}
		/******************** SrvRqst_Id_Typ_Txt ********************************************************************************/
		if(s.getSrvRqstIdTypTxt() != null) {
			servicerequestidentifiertype.setText(s.getSrvRqstIdTypTxt());
		}
		/******************** servicerequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory servicerequestidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		servicerequestidentifier.setUse(servicerequestidentifieruse.fromCode(s.getSrvRqstIdUse()));

		/******************** SrvRqst_Id_Vl ********************************************************************************/
		if(s.getSrvRqstIdVl() != null) {
			servicerequestidentifier.setValue(s.getSrvRqstIdVl());
		}
		/******************** SrvRqst_InstantiatesCanonical ********************************************************************************/
		if(s.getSrvRqstInstantiatesCanonical() != null) {
			servicerequest.addInstantiatesCanonical(s.getSrvRqstInstantiatesCanonical());
		}
		/******************** SrvRqst_InstantiatesUri ********************************************************************************/
		if(s.getSrvRqstInstantiatesUri() != null) {
			servicerequest.addInstantiatesUri(s.getSrvRqstInstantiatesUri());
		}
		/******************** SrvRqst_Insrnc ********************************************************************************/
		if(s.getSrvRqstInsrnc() != null) {
			servicerequest.addInsurance( new org.hl7.fhir.r4.model.Reference(s.getSrvRqstInsrnc()));
		}
		/******************** servicerequestintent ********************************************************************************/
		org.hl7.fhir.r4.model.ServiceRequest.ServiceRequestIntentEnumFactory servicerequestintent =  new org.hl7.fhir.r4.model.ServiceRequest.ServiceRequestIntentEnumFactory();
		servicerequest.setIntent(servicerequestintent.fromCode(s.getSrvRqstIntent()));

		/******************** servicerequestlocationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestlocationcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		servicerequest.addLocationCode(servicerequestlocationcode);

		/******************** servicerequestlocationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestlocationcodecoding =  new org.hl7.fhir.r4.model.Coding();
		servicerequestlocationcode.addCoding(servicerequestlocationcodecoding);

		/******************** SrvRqst_LctnCd_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstLctnCdCdgCd() != null) {
			servicerequestlocationcodecoding.setCode(s.getSrvRqstLctnCdCdgCd());
		}
		/******************** SrvRqst_LctnCd_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstLctnCdCdgDsply() != null) {
			servicerequestlocationcodecoding.setDisplay(s.getSrvRqstLctnCdCdgDsply());
		}
		/******************** SrvRqst_LctnCd_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstLctnCdCdgSys() != null) {
			servicerequestlocationcodecoding.setSystem(s.getSrvRqstLctnCdCdgSys());
		}
		/******************** SrvRqst_LctnCd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstLctnCdCdgUsrSltd() != null) {
			servicerequestlocationcodecoding.setUserSelected(Boolean.parseBoolean(s.getSrvRqstLctnCdCdgUsrSltd()));
		}
		/******************** SrvRqst_LctnCd_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstLctnCdCdgVrsn() != null) {
			servicerequestlocationcodecoding.setVersion(s.getSrvRqstLctnCdCdgVrsn());
		}
		/******************** SrvRqst_LctnCd_Txt ********************************************************************************/
		if(s.getSrvRqstLctnCdTxt() != null) {
			servicerequestlocationcode.setText(s.getSrvRqstLctnCdTxt());
		}
		/******************** SrvRqst_LctnRfrnc ********************************************************************************/
		if(s.getSrvRqstLctnRfrnc() != null) {
			servicerequest.addLocationReference( new org.hl7.fhir.r4.model.Reference(s.getSrvRqstLctnRfrnc()));
		}
		/******************** servicerequestnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation servicerequestnote =  new org.hl7.fhir.r4.model.Annotation();
		servicerequest.addNote(servicerequestnote);

		/******************** SrvRqst_Nt_AthrRfrnc ********************************************************************************/
		if(s.getSrvRqstNtAthrRfrnc() != null) {
			servicerequestnote.setAuthor( new org.hl7.fhir.r4.model.Reference(s.getSrvRqstNtAthrRfrnc()));
		}
		/******************** SrvRqst_Nt_AthrStrgTyp ********************************************************************************/
		if(s.getSrvRqstNtAthrStrgTyp() != null) {
			servicerequestnote.setAuthor( new org.hl7.fhir.r4.model.StringType(s.getSrvRqstNtAthrStrgTyp()));
		}
		/******************** SrvRqst_Nt_Txt ********************************************************************************/
		if(s.getSrvRqstNtTxt() != null) {
			servicerequestnote.setText(s.getSrvRqstNtTxt());
		}
		/******************** SrvRqst_Nt_Time ********************************************************************************/
		if(s.getSrvRqstNtTime() != null) {
			java.text.SimpleDateFormat SrvRqst_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SrvRqst_Nt_Timedate = SrvRqst_Nt_Timesdf.parse(s.getSrvRqstNtTime());
			servicerequestnote.setTime(SrvRqst_Nt_Timedate);
		}
		/******************** SrvRqst_OccrnceDtTimeTyp ********************************************************************************/
		if(s.getSrvRqstOccrnceDtTimeTyp() != null) {
			servicerequest.setOccurrence( new org.hl7.fhir.r4.model.DateTimeType(s.getSrvRqstOccrnceDtTimeTyp()));
		}
		/******************** servicerequestoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period servicerequestoccurrenceperiod =  new org.hl7.fhir.r4.model.Period();
		servicerequest.setOccurrence(servicerequestoccurrenceperiod);

		/******************** SrvRqst_OccrncePrd_End ********************************************************************************/
		if(s.getSrvRqstOccrncePrdEnd() != null) {
			java.text.SimpleDateFormat SrvRqst_OccrncePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SrvRqst_OccrncePrd_Enddate = SrvRqst_OccrncePrd_Endsdf.parse(s.getSrvRqstOccrncePrdEnd());
			servicerequestoccurrenceperiod.setEnd(SrvRqst_OccrncePrd_Enddate);
		}
		/******************** SrvRqst_OccrncePrd_Strt ********************************************************************************/
		if(s.getSrvRqstOccrncePrdStrt() != null) {
			java.text.SimpleDateFormat SrvRqst_OccrncePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SrvRqst_OccrncePrd_Strtdate = SrvRqst_OccrncePrd_Strtsdf.parse(s.getSrvRqstOccrncePrdStrt());
			servicerequestoccurrenceperiod.setStart(SrvRqst_OccrncePrd_Strtdate);
		}
		/******************** servicerequestoccurrencetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing servicerequestoccurrencetiming =  new org.hl7.fhir.r4.model.Timing();
		servicerequest.setOccurrence(servicerequestoccurrencetiming);

		/******************** servicerequestoccurrencetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestoccurrencetimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		servicerequestoccurrencetiming.setCode(servicerequestoccurrencetimingcode);

		/******************** servicerequestoccurrencetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestoccurrencetimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		servicerequestoccurrencetimingcode.addCoding(servicerequestoccurrencetimingcodecoding);

		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgCdCdgCd() != null) {
			servicerequestoccurrencetimingcodecoding.setCode(s.getSrvRqstOccrnceTmgCdCdgCd());
		}
		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgCdCdgDsply() != null) {
			servicerequestoccurrencetimingcodecoding.setDisplay(s.getSrvRqstOccrnceTmgCdCdgDsply());
		}
		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgCdCdgSys() != null) {
			servicerequestoccurrencetimingcodecoding.setSystem(s.getSrvRqstOccrnceTmgCdCdgSys());
		}
		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgCdCdgUsrSltd() != null) {
			servicerequestoccurrencetimingcodecoding.setUserSelected(Boolean.parseBoolean(s.getSrvRqstOccrnceTmgCdCdgUsrSltd()));
		}
		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgCdCdgVrsn() != null) {
			servicerequestoccurrencetimingcodecoding.setVersion(s.getSrvRqstOccrnceTmgCdCdgVrsn());
		}
		/******************** SrvRqst_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgCdTxt() != null) {
			servicerequestoccurrencetimingcode.setText(s.getSrvRqstOccrnceTmgCdTxt());
		}
		/******************** SrvRqst_OccrnceTmg_Evnt ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgEvnt() != null) {
			java.text.SimpleDateFormat SrvRqst_OccrnceTmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SrvRqst_OccrnceTmg_Evntdate = SrvRqst_OccrnceTmg_Evntsdf.parse(s.getSrvRqstOccrnceTmgEvnt());
			servicerequestoccurrencetiming.addEvent(SrvRqst_OccrnceTmg_Evntdate);
		}
		/******************** servicerequestoccurrencetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent servicerequestoccurrencetimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		servicerequestoccurrencetiming.setRepeat(servicerequestoccurrencetimingrepeat);

		/******************** servicerequestoccurrencetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration servicerequestoccurrencetimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		servicerequestoccurrencetimingrepeat.setBounds(servicerequestoccurrencetimingrepeatboundsduration);

		/******************** servicerequestoccurrencetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period servicerequestoccurrencetimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		servicerequestoccurrencetimingrepeat.setBounds(servicerequestoccurrencetimingrepeatboundsperiod);

		/******************** SrvRqst_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat SrvRqst_OccrnceTmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SrvRqst_OccrnceTmg_Rpt_BndsPrd_Enddate = SrvRqst_OccrnceTmg_Rpt_BndsPrd_Endsdf.parse(s.getSrvRqstOccrnceTmgRptBndsPrdEnd());
			servicerequestoccurrencetimingrepeatboundsperiod.setEnd(SrvRqst_OccrnceTmg_Rpt_BndsPrd_Enddate);
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat SrvRqst_OccrnceTmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SrvRqst_OccrnceTmg_Rpt_BndsPrd_Strtdate = SrvRqst_OccrnceTmg_Rpt_BndsPrd_Strtsdf.parse(s.getSrvRqstOccrnceTmgRptBndsPrdStrt());
			servicerequestoccurrencetimingrepeatboundsperiod.setStart(SrvRqst_OccrnceTmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** servicerequestoccurrencetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range servicerequestoccurrencetimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		servicerequestoccurrencetimingrepeat.setBounds(servicerequestoccurrencetimingrepeatboundsrange);

		/******************** servicerequestoccurrencetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestoccurrencetimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		servicerequestoccurrencetimingrepeatboundsrange.setHigh(servicerequestoccurrencetimingrepeatboundsrangehigh);

		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsRngHiCd() != null) {
			servicerequestoccurrencetimingrepeatboundsrangehigh.setCode(s.getSrvRqstOccrnceTmgRptBndsRngHiCd());
		}
		/******************** servicerequestoccurrencetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory servicerequestoccurrencetimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		servicerequestoccurrencetimingrepeatboundsrangehigh.setComparator(servicerequestoccurrencetimingrepeatboundsrangehighcomparator.fromCode(s.getSrvRqstOccrnceTmgRptBndsRngHiCmprtr()));

		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsRngHiSys() != null) {
			servicerequestoccurrencetimingrepeatboundsrangehigh.setSystem(s.getSrvRqstOccrnceTmgRptBndsRngHiSys());
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsRngHiUnt() != null) {
			servicerequestoccurrencetimingrepeatboundsrangehigh.setUnit(s.getSrvRqstOccrnceTmgRptBndsRngHiUnt());
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsRngHiVl() != null) {
			servicerequestoccurrencetimingrepeatboundsrangehigh.setValue(Double.parseDouble((s.getSrvRqstOccrnceTmgRptBndsRngHiVl())));
		}
		/******************** servicerequestoccurrencetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestoccurrencetimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		servicerequestoccurrencetimingrepeatboundsrange.setLow(servicerequestoccurrencetimingrepeatboundsrangelow);

		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsRngLwCd() != null) {
			servicerequestoccurrencetimingrepeatboundsrangelow.setCode(s.getSrvRqstOccrnceTmgRptBndsRngLwCd());
		}
		/******************** servicerequestoccurrencetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory servicerequestoccurrencetimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		servicerequestoccurrencetimingrepeatboundsrangelow.setComparator(servicerequestoccurrencetimingrepeatboundsrangelowcomparator.fromCode(s.getSrvRqstOccrnceTmgRptBndsRngLwCmprtr()));

		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsRngLwSys() != null) {
			servicerequestoccurrencetimingrepeatboundsrangelow.setSystem(s.getSrvRqstOccrnceTmgRptBndsRngLwSys());
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsRngLwUnt() != null) {
			servicerequestoccurrencetimingrepeatboundsrangelow.setUnit(s.getSrvRqstOccrnceTmgRptBndsRngLwUnt());
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsRngLwVl() != null) {
			servicerequestoccurrencetimingrepeatboundsrangelow.setValue(Double.parseDouble((s.getSrvRqstOccrnceTmgRptBndsRngLwVl())));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptCnt() != null) {
			servicerequestoccurrencetimingrepeat.setCount(Integer.parseInt(s.getSrvRqstOccrnceTmgRptCnt()));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptCntMx() != null) {
			servicerequestoccurrencetimingrepeat.setCountMax(Integer.parseInt(s.getSrvRqstOccrnceTmgRptCntMx()));
		}
		/******************** servicerequestoccurrencetimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory servicerequestoccurrencetimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		servicerequestoccurrencetimingrepeat.addDayOfWeek(servicerequestoccurrencetimingrepeatdayofweek.fromCode(s.getSrvRqstOccrnceTmgRptDayOfWeek()));

		/******************** SrvRqst_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptDuration() != null) {
			servicerequestoccurrencetimingrepeat.setDuration(Double.parseDouble((s.getSrvRqstOccrnceTmgRptDuration())));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptDurationMx() != null) {
			servicerequestoccurrencetimingrepeat.setDurationMax(Double.parseDouble((s.getSrvRqstOccrnceTmgRptDurationMx())));
		}
		/******************** servicerequestoccurrencetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory servicerequestoccurrencetimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		servicerequestoccurrencetimingrepeat.setDurationUnit(servicerequestoccurrencetimingrepeatdurationunit.fromCode(s.getSrvRqstOccrnceTmgRptDurationUnt()));

		/******************** SrvRqst_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptFrqncy() != null) {
			servicerequestoccurrencetimingrepeat.setFrequency(Integer.parseInt(s.getSrvRqstOccrnceTmgRptFrqncy()));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptFrqncyMx() != null) {
			servicerequestoccurrencetimingrepeat.setFrequencyMax(Integer.parseInt(s.getSrvRqstOccrnceTmgRptFrqncyMx()));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptOff() != null) {
			servicerequestoccurrencetimingrepeat.setOffset(Integer.parseInt(s.getSrvRqstOccrnceTmgRptOff()));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptPrd() != null) {
			servicerequestoccurrencetimingrepeat.setPeriod(Double.parseDouble((s.getSrvRqstOccrnceTmgRptPrd())));
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptPrdMx() != null) {
			servicerequestoccurrencetimingrepeat.setPeriodMax(Double.parseDouble((s.getSrvRqstOccrnceTmgRptPrdMx())));
		}
		/******************** servicerequestoccurrencetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory servicerequestoccurrencetimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		servicerequestoccurrencetimingrepeat.setPeriodUnit(servicerequestoccurrencetimingrepeatperiodunit.fromCode(s.getSrvRqstOccrnceTmgRptPrdUnt()));

		/******************** SrvRqst_OccrnceTmg_Rpt_TimeOfDay ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptTimeOfDay() != null) {
			servicerequestoccurrencetimingrepeat.addTimeOfDay(s.getSrvRqstOccrnceTmgRptTimeOfDay());
		}
		/******************** servicerequestoccurrencetimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory servicerequestoccurrencetimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		servicerequestoccurrencetimingrepeat.addWhen(servicerequestoccurrencetimingrepeatwhen.fromCode(s.getSrvRqstOccrnceTmgRptWhen()));

		/******************** servicerequestorderdetail ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestorderdetail =  new org.hl7.fhir.r4.model.CodeableConcept();
		servicerequest.addOrderDetail(servicerequestorderdetail);

		/******************** servicerequestorderdetailcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestorderdetailcoding =  new org.hl7.fhir.r4.model.Coding();
		servicerequestorderdetail.addCoding(servicerequestorderdetailcoding);

		/******************** SrvRqst_OrdrDtl_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstOrdrDtlCdgCd() != null) {
			servicerequestorderdetailcoding.setCode(s.getSrvRqstOrdrDtlCdgCd());
		}
		/******************** SrvRqst_OrdrDtl_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstOrdrDtlCdgDsply() != null) {
			servicerequestorderdetailcoding.setDisplay(s.getSrvRqstOrdrDtlCdgDsply());
		}
		/******************** SrvRqst_OrdrDtl_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstOrdrDtlCdgSys() != null) {
			servicerequestorderdetailcoding.setSystem(s.getSrvRqstOrdrDtlCdgSys());
		}
		/******************** SrvRqst_OrdrDtl_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstOrdrDtlCdgUsrSltd() != null) {
			servicerequestorderdetailcoding.setUserSelected(Boolean.parseBoolean(s.getSrvRqstOrdrDtlCdgUsrSltd()));
		}
		/******************** SrvRqst_OrdrDtl_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstOrdrDtlCdgVrsn() != null) {
			servicerequestorderdetailcoding.setVersion(s.getSrvRqstOrdrDtlCdgVrsn());
		}
		/******************** SrvRqst_OrdrDtl_Txt ********************************************************************************/
		if(s.getSrvRqstOrdrDtlTxt() != null) {
			servicerequestorderdetail.setText(s.getSrvRqstOrdrDtlTxt());
		}
		/******************** SrvRqst_PntInstrctn ********************************************************************************/
		if(s.getSrvRqstPntInstrctn() != null) {
			servicerequest.setPatientInstruction(s.getSrvRqstPntInstrctn());
		}
		/******************** SrvRqst_Prfrmr ********************************************************************************/
		if(s.getSrvRqstPrfrmr() != null) {
			servicerequest.addPerformer( new org.hl7.fhir.r4.model.Reference(s.getSrvRqstPrfrmr()));
		}
		/******************** servicerequestperformertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestperformertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		servicerequest.setPerformerType(servicerequestperformertype);

		/******************** servicerequestperformertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestperformertypecoding =  new org.hl7.fhir.r4.model.Coding();
		servicerequestperformertype.addCoding(servicerequestperformertypecoding);

		/******************** SrvRqst_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstPrfrmrTypCdgCd() != null) {
			servicerequestperformertypecoding.setCode(s.getSrvRqstPrfrmrTypCdgCd());
		}
		/******************** SrvRqst_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstPrfrmrTypCdgDsply() != null) {
			servicerequestperformertypecoding.setDisplay(s.getSrvRqstPrfrmrTypCdgDsply());
		}
		/******************** SrvRqst_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstPrfrmrTypCdgSys() != null) {
			servicerequestperformertypecoding.setSystem(s.getSrvRqstPrfrmrTypCdgSys());
		}
		/******************** SrvRqst_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstPrfrmrTypCdgUsrSltd() != null) {
			servicerequestperformertypecoding.setUserSelected(Boolean.parseBoolean(s.getSrvRqstPrfrmrTypCdgUsrSltd()));
		}
		/******************** SrvRqst_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstPrfrmrTypCdgVrsn() != null) {
			servicerequestperformertypecoding.setVersion(s.getSrvRqstPrfrmrTypCdgVrsn());
		}
		/******************** SrvRqst_PrfrmrTyp_Txt ********************************************************************************/
		if(s.getSrvRqstPrfrmrTypTxt() != null) {
			servicerequestperformertype.setText(s.getSrvRqstPrfrmrTypTxt());
		}
		/******************** servicerequestpriority ********************************************************************************/
		org.hl7.fhir.r4.model.ServiceRequest.ServiceRequestPriorityEnumFactory servicerequestpriority =  new org.hl7.fhir.r4.model.ServiceRequest.ServiceRequestPriorityEnumFactory();
		servicerequest.setPriority(servicerequestpriority.fromCode(s.getSrvRqstPriority()));

		/******************** servicerequestquantityquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestquantityquantity =  new org.hl7.fhir.r4.model.Quantity();
		servicerequest.setQuantity(servicerequestquantityquantity);

		/******************** SrvRqst_QntyQnty_Cd ********************************************************************************/
		if(s.getSrvRqstQntyQntyCd() != null) {
			servicerequestquantityquantity.setCode(s.getSrvRqstQntyQntyCd());
		}
		/******************** servicerequestquantityquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory servicerequestquantityquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		servicerequestquantityquantity.setComparator(servicerequestquantityquantitycomparator.fromCode(s.getSrvRqstQntyQntyCmprtr()));

		/******************** SrvRqst_QntyQnty_Sys ********************************************************************************/
		if(s.getSrvRqstQntyQntySys() != null) {
			servicerequestquantityquantity.setSystem(s.getSrvRqstQntyQntySys());
		}
		/******************** SrvRqst_QntyQnty_Unt ********************************************************************************/
		if(s.getSrvRqstQntyQntyUnt() != null) {
			servicerequestquantityquantity.setUnit(s.getSrvRqstQntyQntyUnt());
		}
		/******************** SrvRqst_QntyQnty_Vl ********************************************************************************/
		if(s.getSrvRqstQntyQntyVl() != null) {
			servicerequestquantityquantity.setValue(Double.parseDouble((s.getSrvRqstQntyQntyVl())));
		}
		/******************** servicerequestquantityrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range servicerequestquantityrange =  new org.hl7.fhir.r4.model.Range();
		servicerequest.setQuantity(servicerequestquantityrange);

		/******************** servicerequestquantityrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestquantityrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		servicerequestquantityrange.setHigh(servicerequestquantityrangehigh);

		/******************** SrvRqst_QntyRng_Hi_Cd ********************************************************************************/
		if(s.getSrvRqstQntyRngHiCd() != null) {
			servicerequestquantityrangehigh.setCode(s.getSrvRqstQntyRngHiCd());
		}
		/******************** servicerequestquantityrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory servicerequestquantityrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		servicerequestquantityrangehigh.setComparator(servicerequestquantityrangehighcomparator.fromCode(s.getSrvRqstQntyRngHiCmprtr()));

		/******************** SrvRqst_QntyRng_Hi_Sys ********************************************************************************/
		if(s.getSrvRqstQntyRngHiSys() != null) {
			servicerequestquantityrangehigh.setSystem(s.getSrvRqstQntyRngHiSys());
		}
		/******************** SrvRqst_QntyRng_Hi_Unt ********************************************************************************/
		if(s.getSrvRqstQntyRngHiUnt() != null) {
			servicerequestquantityrangehigh.setUnit(s.getSrvRqstQntyRngHiUnt());
		}
		/******************** SrvRqst_QntyRng_Hi_Vl ********************************************************************************/
		if(s.getSrvRqstQntyRngHiVl() != null) {
			servicerequestquantityrangehigh.setValue(Double.parseDouble((s.getSrvRqstQntyRngHiVl())));
		}
		/******************** servicerequestquantityrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestquantityrangelow =  new org.hl7.fhir.r4.model.Quantity();
		servicerequestquantityrange.setLow(servicerequestquantityrangelow);

		/******************** SrvRqst_QntyRng_Lw_Cd ********************************************************************************/
		if(s.getSrvRqstQntyRngLwCd() != null) {
			servicerequestquantityrangelow.setCode(s.getSrvRqstQntyRngLwCd());
		}
		/******************** servicerequestquantityrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory servicerequestquantityrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		servicerequestquantityrangelow.setComparator(servicerequestquantityrangelowcomparator.fromCode(s.getSrvRqstQntyRngLwCmprtr()));

		/******************** SrvRqst_QntyRng_Lw_Sys ********************************************************************************/
		if(s.getSrvRqstQntyRngLwSys() != null) {
			servicerequestquantityrangelow.setSystem(s.getSrvRqstQntyRngLwSys());
		}
		/******************** SrvRqst_QntyRng_Lw_Unt ********************************************************************************/
		if(s.getSrvRqstQntyRngLwUnt() != null) {
			servicerequestquantityrangelow.setUnit(s.getSrvRqstQntyRngLwUnt());
		}
		/******************** SrvRqst_QntyRng_Lw_Vl ********************************************************************************/
		if(s.getSrvRqstQntyRngLwVl() != null) {
			servicerequestquantityrangelow.setValue(Double.parseDouble((s.getSrvRqstQntyRngLwVl())));
		}
		/******************** servicerequestquantityratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio servicerequestquantityratio =  new org.hl7.fhir.r4.model.Ratio();
		servicerequest.setQuantity(servicerequestquantityratio);

		/******************** servicerequestquantityratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestquantityratiodenominator =  new org.hl7.fhir.r4.model.Quantity();
		servicerequestquantityratio.setDenominator(servicerequestquantityratiodenominator);

		/******************** SrvRqst_QntyRtio_Dnmntr_Cd ********************************************************************************/
		if(s.getSrvRqstQntyRtioDnmntrCd() != null) {
			servicerequestquantityratiodenominator.setCode(s.getSrvRqstQntyRtioDnmntrCd());
		}
		/******************** servicerequestquantityratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory servicerequestquantityratiodenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		servicerequestquantityratiodenominator.setComparator(servicerequestquantityratiodenominatorcomparator.fromCode(s.getSrvRqstQntyRtioDnmntrCmprtr()));

		/******************** SrvRqst_QntyRtio_Dnmntr_Sys ********************************************************************************/
		if(s.getSrvRqstQntyRtioDnmntrSys() != null) {
			servicerequestquantityratiodenominator.setSystem(s.getSrvRqstQntyRtioDnmntrSys());
		}
		/******************** SrvRqst_QntyRtio_Dnmntr_Unt ********************************************************************************/
		if(s.getSrvRqstQntyRtioDnmntrUnt() != null) {
			servicerequestquantityratiodenominator.setUnit(s.getSrvRqstQntyRtioDnmntrUnt());
		}
		/******************** SrvRqst_QntyRtio_Dnmntr_Vl ********************************************************************************/
		if(s.getSrvRqstQntyRtioDnmntrVl() != null) {
			servicerequestquantityratiodenominator.setValue(Double.parseDouble((s.getSrvRqstQntyRtioDnmntrVl())));
		}
		/******************** servicerequestquantityrationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestquantityrationumerator =  new org.hl7.fhir.r4.model.Quantity();
		servicerequestquantityratio.setNumerator(servicerequestquantityrationumerator);

		/******************** SrvRqst_QntyRtio_Nmrtr_Cd ********************************************************************************/
		if(s.getSrvRqstQntyRtioNmrtrCd() != null) {
			servicerequestquantityrationumerator.setCode(s.getSrvRqstQntyRtioNmrtrCd());
		}
		/******************** servicerequestquantityrationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory servicerequestquantityrationumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		servicerequestquantityrationumerator.setComparator(servicerequestquantityrationumeratorcomparator.fromCode(s.getSrvRqstQntyRtioNmrtrCmprtr()));

		/******************** SrvRqst_QntyRtio_Nmrtr_Sys ********************************************************************************/
		if(s.getSrvRqstQntyRtioNmrtrSys() != null) {
			servicerequestquantityrationumerator.setSystem(s.getSrvRqstQntyRtioNmrtrSys());
		}
		/******************** SrvRqst_QntyRtio_Nmrtr_Unt ********************************************************************************/
		if(s.getSrvRqstQntyRtioNmrtrUnt() != null) {
			servicerequestquantityrationumerator.setUnit(s.getSrvRqstQntyRtioNmrtrUnt());
		}
		/******************** SrvRqst_QntyRtio_Nmrtr_Vl ********************************************************************************/
		if(s.getSrvRqstQntyRtioNmrtrVl() != null) {
			servicerequestquantityrationumerator.setValue(Double.parseDouble((s.getSrvRqstQntyRtioNmrtrVl())));
		}
		/******************** servicerequestreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		servicerequest.addReasonCode(servicerequestreasoncode);

		/******************** servicerequestreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		servicerequestreasoncode.addCoding(servicerequestreasoncodecoding);

		/******************** SrvRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstRsnCdCdgCd() != null) {
			servicerequestreasoncodecoding.setCode(s.getSrvRqstRsnCdCdgCd());
		}
		/******************** SrvRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstRsnCdCdgDsply() != null) {
			servicerequestreasoncodecoding.setDisplay(s.getSrvRqstRsnCdCdgDsply());
		}
		/******************** SrvRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstRsnCdCdgSys() != null) {
			servicerequestreasoncodecoding.setSystem(s.getSrvRqstRsnCdCdgSys());
		}
		/******************** SrvRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstRsnCdCdgUsrSltd() != null) {
			servicerequestreasoncodecoding.setUserSelected(Boolean.parseBoolean(s.getSrvRqstRsnCdCdgUsrSltd()));
		}
		/******************** SrvRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstRsnCdCdgVrsn() != null) {
			servicerequestreasoncodecoding.setVersion(s.getSrvRqstRsnCdCdgVrsn());
		}
		/******************** SrvRqst_RsnCd_Txt ********************************************************************************/
		if(s.getSrvRqstRsnCdTxt() != null) {
			servicerequestreasoncode.setText(s.getSrvRqstRsnCdTxt());
		}
		/******************** SrvRqst_RsnRfrnc ********************************************************************************/
		if(s.getSrvRqstRsnRfrnc() != null) {
			servicerequest.addReasonReference( new org.hl7.fhir.r4.model.Reference(s.getSrvRqstRsnRfrnc()));
		}
		/******************** SrvRqst_RelevantHis ********************************************************************************/
		if(s.getSrvRqstRelevantHis() != null) {
			servicerequest.addRelevantHistory( new org.hl7.fhir.r4.model.Reference(s.getSrvRqstRelevantHis()));
		}
		/******************** SrvRqst_Replaces ********************************************************************************/
		if(s.getSrvRqstReplaces() != null) {
			servicerequest.addReplaces( new org.hl7.fhir.r4.model.Reference(s.getSrvRqstReplaces()));
		}
		/******************** SrvRqst_Rqster ********************************************************************************/
		if(s.getSrvRqstRqster() != null) {
			servicerequest.setRequester( new org.hl7.fhir.r4.model.Reference(s.getSrvRqstRqster()));
		}
		/******************** servicerequestrequisition ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier servicerequestrequisition =  new org.hl7.fhir.r4.model.Identifier();
		servicerequest.setRequisition(servicerequestrequisition);

		/******************** SrvRqst_Requisition_Assigner ********************************************************************************/
		if(s.getSrvRqstRequisitionAssigner() != null) {
			servicerequestrequisition.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSrvRqstRequisitionAssigner()));
		}
		/******************** servicerequestrequisitionperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period servicerequestrequisitionperiod =  new org.hl7.fhir.r4.model.Period();
		servicerequestrequisition.setPeriod(servicerequestrequisitionperiod);

		/******************** SrvRqst_Requisition_Prd_End ********************************************************************************/
		if(s.getSrvRqstRequisitionPrdEnd() != null) {
			java.text.SimpleDateFormat SrvRqst_Requisition_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SrvRqst_Requisition_Prd_Enddate = SrvRqst_Requisition_Prd_Endsdf.parse(s.getSrvRqstRequisitionPrdEnd());
			servicerequestrequisitionperiod.setEnd(SrvRqst_Requisition_Prd_Enddate);
		}
		/******************** SrvRqst_Requisition_Prd_Strt ********************************************************************************/
		if(s.getSrvRqstRequisitionPrdStrt() != null) {
			java.text.SimpleDateFormat SrvRqst_Requisition_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SrvRqst_Requisition_Prd_Strtdate = SrvRqst_Requisition_Prd_Strtsdf.parse(s.getSrvRqstRequisitionPrdStrt());
			servicerequestrequisitionperiod.setStart(SrvRqst_Requisition_Prd_Strtdate);
		}
		/******************** SrvRqst_Requisition_Sys ********************************************************************************/
		if(s.getSrvRqstRequisitionSys() != null) {
			servicerequestrequisition.setSystem(s.getSrvRqstRequisitionSys());
		}
		/******************** servicerequestrequisitiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestrequisitiontype =  new org.hl7.fhir.r4.model.CodeableConcept();
		servicerequestrequisition.setType(servicerequestrequisitiontype);

		/******************** servicerequestrequisitiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding servicerequestrequisitiontypecoding =  new org.hl7.fhir.r4.model.Coding();
		servicerequestrequisitiontype.addCoding(servicerequestrequisitiontypecoding);

		/******************** SrvRqst_Requisition_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstRequisitionTypCdgCd() != null) {
			servicerequestrequisitiontypecoding.setCode(s.getSrvRqstRequisitionTypCdgCd());
		}
		/******************** SrvRqst_Requisition_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstRequisitionTypCdgDsply() != null) {
			servicerequestrequisitiontypecoding.setDisplay(s.getSrvRqstRequisitionTypCdgDsply());
		}
		/******************** SrvRqst_Requisition_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstRequisitionTypCdgSys() != null) {
			servicerequestrequisitiontypecoding.setSystem(s.getSrvRqstRequisitionTypCdgSys());
		}
		/******************** SrvRqst_Requisition_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstRequisitionTypCdgUsrSltd() != null) {
			servicerequestrequisitiontypecoding.setUserSelected(Boolean.parseBoolean(s.getSrvRqstRequisitionTypCdgUsrSltd()));
		}
		/******************** SrvRqst_Requisition_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstRequisitionTypCdgVrsn() != null) {
			servicerequestrequisitiontypecoding.setVersion(s.getSrvRqstRequisitionTypCdgVrsn());
		}
		/******************** SrvRqst_Requisition_Typ_Txt ********************************************************************************/
		if(s.getSrvRqstRequisitionTypTxt() != null) {
			servicerequestrequisitiontype.setText(s.getSrvRqstRequisitionTypTxt());
		}
		/******************** servicerequestrequisitionuse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory servicerequestrequisitionuse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		servicerequestrequisition.setUse(servicerequestrequisitionuse.fromCode(s.getSrvRqstRequisitionUse()));

		/******************** SrvRqst_Requisition_Vl ********************************************************************************/
		if(s.getSrvRqstRequisitionVl() != null) {
			servicerequestrequisition.setValue(s.getSrvRqstRequisitionVl());
		}
		/******************** SrvRqst_Spcmn ********************************************************************************/
		if(s.getSrvRqstSpcmn() != null) {
			servicerequest.addSpecimen( new org.hl7.fhir.r4.model.Reference(s.getSrvRqstSpcmn()));
		}
		/******************** servicerequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.ServiceRequest.ServiceRequestStatusEnumFactory servicerequeststatus =  new org.hl7.fhir.r4.model.ServiceRequest.ServiceRequestStatusEnumFactory();
		servicerequest.setStatus(servicerequeststatus.fromCode(s.getSrvRqstSts()));

		/******************** SrvRqst_Sbjct ********************************************************************************/
		if(s.getSrvRqstSbjct() != null) {
			servicerequest.setSubject( new org.hl7.fhir.r4.model.Reference(s.getSrvRqstSbjct()));
		}
		/******************** SrvRqst_SprtingInfo ********************************************************************************/
		if(s.getSrvRqstSprtingInfo() != null) {
			servicerequest.addSupportingInfo( new org.hl7.fhir.r4.model.Reference(s.getSrvRqstSprtingInfo()));
		}
		return servicerequest;
	}
}
