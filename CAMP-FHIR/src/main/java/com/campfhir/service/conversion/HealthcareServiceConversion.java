package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.HealthcareService;
public class HealthcareServiceConversion 
{
	public org.hl7.fhir.r4.model.HealthcareService HealthcareServices(HealthcareService h) throws ParseException
	{
		org.hl7.fhir.r4.model.HealthcareService healthcareservice = new org.hl7.fhir.r4.model.HealthcareService();

		/******************** id ********************************************************************************/
		healthcareservice.setId(h.getId());

		/******************** HlthcrSrv_Active ********************************************************************************/
		if(h.getHlthcrSrvActive() != null) {
			healthcareservice.setActive(Boolean.parseBoolean(h.getHlthcrSrvActive()));
		}
		/******************** HlthcrSrv_AppmntRequired ********************************************************************************/
		if(h.getHlthcrSrvAppmntRequired() != null) {
			healthcareservice.setAppointmentRequired(Boolean.parseBoolean(h.getHlthcrSrvAppmntRequired()));
		}
		/******************** HlthcrSrv_AvailabilityExceptions ********************************************************************************/
		if(h.getHlthcrSrvAvailabilityExceptions() != null) {
			healthcareservice.setAvailabilityExceptions(h.getHlthcrSrvAvailabilityExceptions());
		}
		/******************** healthcareserviceavailabletime ********************************************************************************/
		org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceAvailableTimeComponent healthcareserviceavailabletime =  new org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceAvailableTimeComponent();
		healthcareservice.addAvailableTime(healthcareserviceavailabletime);

		/******************** HlthcrSrv_AvailableTime_AllDay ********************************************************************************/
		if(h.getHlthcrSrvAvailableTimeAllDay() != null) {
			healthcareserviceavailabletime.setAllDay(Boolean.parseBoolean(h.getHlthcrSrvAvailableTimeAllDay()));
		}
		/******************** HlthcrSrv_AvailableTime_AvailableEndTime ********************************************************************************/
		if(h.getHlthcrSrvAvailableTimeAvailableEndTime() != null) {
			healthcareserviceavailabletime.setAvailableEndTime(h.getHlthcrSrvAvailableTimeAvailableEndTime());
		}
		/******************** HlthcrSrv_AvailableTime_AvailableStrtTime ********************************************************************************/
		if(h.getHlthcrSrvAvailableTimeAvailableStrtTime() != null) {
			healthcareserviceavailabletime.setAvailableStartTime(h.getHlthcrSrvAvailableTimeAvailableStrtTime());
		}
		/******************** healthcareserviceavailabletimedaysofweek ********************************************************************************/
		org.hl7.fhir.r4.model.HealthcareService.DaysOfWeekEnumFactory healthcareserviceavailabletimedaysofweek =  new org.hl7.fhir.r4.model.HealthcareService.DaysOfWeekEnumFactory();
		healthcareserviceavailabletime.addDaysOfWeek(healthcareserviceavailabletimedaysofweek.fromCode(h.getHlthcrSrvAvailableTimeDaysOfWeek()));

		/******************** healthcareservicecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareservicecategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		healthcareservice.addCategory(healthcareservicecategory);

		/******************** healthcareservicecategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareservicecategorycoding =  new org.hl7.fhir.r4.model.Coding();
		healthcareservicecategory.addCoding(healthcareservicecategorycoding);

		/******************** HlthcrSrv_Ctgry_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvCtgryCdgCd() != null) {
			healthcareservicecategorycoding.setCode(h.getHlthcrSrvCtgryCdgCd());
		}
		/******************** HlthcrSrv_Ctgry_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvCtgryCdgDsply() != null) {
			healthcareservicecategorycoding.setDisplay(h.getHlthcrSrvCtgryCdgDsply());
		}
		/******************** HlthcrSrv_Ctgry_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvCtgryCdgSys() != null) {
			healthcareservicecategorycoding.setSystem(h.getHlthcrSrvCtgryCdgSys());
		}
		/******************** HlthcrSrv_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvCtgryCdgUsrSltd() != null) {
			healthcareservicecategorycoding.setUserSelected(Boolean.parseBoolean(h.getHlthcrSrvCtgryCdgUsrSltd()));
		}
		/******************** HlthcrSrv_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvCtgryCdgVrsn() != null) {
			healthcareservicecategorycoding.setVersion(h.getHlthcrSrvCtgryCdgVrsn());
		}
		/******************** HlthcrSrv_Ctgry_Txt ********************************************************************************/
		if(h.getHlthcrSrvCtgryTxt() != null) {
			healthcareservicecategory.setText(h.getHlthcrSrvCtgryTxt());
		}
		/******************** healthcareservicecharacteristic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareservicecharacteristic =  new org.hl7.fhir.r4.model.CodeableConcept();
		healthcareservice.addCharacteristic(healthcareservicecharacteristic);

		/******************** healthcareservicecharacteristiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareservicecharacteristiccoding =  new org.hl7.fhir.r4.model.Coding();
		healthcareservicecharacteristic.addCoding(healthcareservicecharacteristiccoding);

		/******************** HlthcrSrv_Crctrstc_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvCrctrstcCdgCd() != null) {
			healthcareservicecharacteristiccoding.setCode(h.getHlthcrSrvCrctrstcCdgCd());
		}
		/******************** HlthcrSrv_Crctrstc_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvCrctrstcCdgDsply() != null) {
			healthcareservicecharacteristiccoding.setDisplay(h.getHlthcrSrvCrctrstcCdgDsply());
		}
		/******************** HlthcrSrv_Crctrstc_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvCrctrstcCdgSys() != null) {
			healthcareservicecharacteristiccoding.setSystem(h.getHlthcrSrvCrctrstcCdgSys());
		}
		/******************** HlthcrSrv_Crctrstc_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvCrctrstcCdgUsrSltd() != null) {
			healthcareservicecharacteristiccoding.setUserSelected(Boolean.parseBoolean(h.getHlthcrSrvCrctrstcCdgUsrSltd()));
		}
		/******************** HlthcrSrv_Crctrstc_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvCrctrstcCdgVrsn() != null) {
			healthcareservicecharacteristiccoding.setVersion(h.getHlthcrSrvCrctrstcCdgVrsn());
		}
		/******************** HlthcrSrv_Crctrstc_Txt ********************************************************************************/
		if(h.getHlthcrSrvCrctrstcTxt() != null) {
			healthcareservicecharacteristic.setText(h.getHlthcrSrvCrctrstcTxt());
		}
		/******************** HlthcrSrv_Comment ********************************************************************************/
		if(h.getHlthcrSrvComment() != null) {
			healthcareservice.setComment(h.getHlthcrSrvComment());
		}
		/******************** healthcareservicecommunication ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareservicecommunication =  new org.hl7.fhir.r4.model.CodeableConcept();
		healthcareservice.addCommunication(healthcareservicecommunication);

		/******************** healthcareservicecommunicationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareservicecommunicationcoding =  new org.hl7.fhir.r4.model.Coding();
		healthcareservicecommunication.addCoding(healthcareservicecommunicationcoding);

		/******************** HlthcrSrv_Cmmnctn_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvCmmnctnCdgCd() != null) {
			healthcareservicecommunicationcoding.setCode(h.getHlthcrSrvCmmnctnCdgCd());
		}
		/******************** HlthcrSrv_Cmmnctn_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvCmmnctnCdgDsply() != null) {
			healthcareservicecommunicationcoding.setDisplay(h.getHlthcrSrvCmmnctnCdgDsply());
		}
		/******************** HlthcrSrv_Cmmnctn_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvCmmnctnCdgSys() != null) {
			healthcareservicecommunicationcoding.setSystem(h.getHlthcrSrvCmmnctnCdgSys());
		}
		/******************** HlthcrSrv_Cmmnctn_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvCmmnctnCdgUsrSltd() != null) {
			healthcareservicecommunicationcoding.setUserSelected(Boolean.parseBoolean(h.getHlthcrSrvCmmnctnCdgUsrSltd()));
		}
		/******************** HlthcrSrv_Cmmnctn_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvCmmnctnCdgVrsn() != null) {
			healthcareservicecommunicationcoding.setVersion(h.getHlthcrSrvCmmnctnCdgVrsn());
		}
		/******************** HlthcrSrv_Cmmnctn_Txt ********************************************************************************/
		if(h.getHlthcrSrvCmmnctnTxt() != null) {
			healthcareservicecommunication.setText(h.getHlthcrSrvCmmnctnTxt());
		}
		/******************** HlthcrSrv_CvgArea ********************************************************************************/
		if(h.getHlthcrSrvCvgArea() != null) {
			healthcareservice.addCoverageArea( new org.hl7.fhir.r4.model.Reference(h.getHlthcrSrvCvgArea()));
		}
		/******************** healthcareserviceeligibility ********************************************************************************/
		org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceEligibilityComponent healthcareserviceeligibility =  new org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceEligibilityComponent();
		healthcareservice.addEligibility(healthcareserviceeligibility);

		/******************** healthcareserviceeligibilitycode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareserviceeligibilitycode =  new org.hl7.fhir.r4.model.CodeableConcept();
		healthcareserviceeligibility.setCode(healthcareserviceeligibilitycode);

		/******************** healthcareserviceeligibilitycodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareserviceeligibilitycodecoding =  new org.hl7.fhir.r4.model.Coding();
		healthcareserviceeligibilitycode.addCoding(healthcareserviceeligibilitycodecoding);

		/******************** HlthcrSrv_Elgblty_Cd_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvElgbltyCdCdgCd() != null) {
			healthcareserviceeligibilitycodecoding.setCode(h.getHlthcrSrvElgbltyCdCdgCd());
		}
		/******************** HlthcrSrv_Elgblty_Cd_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvElgbltyCdCdgDsply() != null) {
			healthcareserviceeligibilitycodecoding.setDisplay(h.getHlthcrSrvElgbltyCdCdgDsply());
		}
		/******************** HlthcrSrv_Elgblty_Cd_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvElgbltyCdCdgSys() != null) {
			healthcareserviceeligibilitycodecoding.setSystem(h.getHlthcrSrvElgbltyCdCdgSys());
		}
		/******************** HlthcrSrv_Elgblty_Cd_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvElgbltyCdCdgUsrSltd() != null) {
			healthcareserviceeligibilitycodecoding.setUserSelected(Boolean.parseBoolean(h.getHlthcrSrvElgbltyCdCdgUsrSltd()));
		}
		/******************** HlthcrSrv_Elgblty_Cd_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvElgbltyCdCdgVrsn() != null) {
			healthcareserviceeligibilitycodecoding.setVersion(h.getHlthcrSrvElgbltyCdCdgVrsn());
		}
		/******************** HlthcrSrv_Elgblty_Cd_Txt ********************************************************************************/
		if(h.getHlthcrSrvElgbltyCdTxt() != null) {
			healthcareserviceeligibilitycode.setText(h.getHlthcrSrvElgbltyCdTxt());
		}
		/******************** HlthcrSrv_Elgblty_Comment ********************************************************************************/
		if(h.getHlthcrSrvElgbltyComment() != null) {
			healthcareserviceeligibility.setComment(h.getHlthcrSrvElgbltyComment());
		}
		/******************** HlthcrSrv_Endpoint ********************************************************************************/
		if(h.getHlthcrSrvEndpoint() != null) {
			healthcareservice.addEndpoint( new org.hl7.fhir.r4.model.Reference(h.getHlthcrSrvEndpoint()));
		}
		/******************** HlthcrSrv_ExtraDtls ********************************************************************************/
		if(h.getHlthcrSrvExtraDtls() != null) {
			healthcareservice.setExtraDetails(h.getHlthcrSrvExtraDtls());
		}
		/******************** healthcareserviceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier healthcareserviceidentifier =  new org.hl7.fhir.r4.model.Identifier();
		healthcareservice.addIdentifier(healthcareserviceidentifier);

		/******************** HlthcrSrv_Id_Assigner ********************************************************************************/
		if(h.getHlthcrSrvIdAssigner() != null) {
			healthcareserviceidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(h.getHlthcrSrvIdAssigner()));
		}
		/******************** healthcareserviceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period healthcareserviceidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		healthcareserviceidentifier.setPeriod(healthcareserviceidentifierperiod);

		/******************** HlthcrSrv_Id_Prd_End ********************************************************************************/
		if(h.getHlthcrSrvIdPrdEnd() != null) {
			java.text.SimpleDateFormat HlthcrSrv_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date HlthcrSrv_Id_Prd_Enddate = HlthcrSrv_Id_Prd_Endsdf.parse(h.getHlthcrSrvIdPrdEnd());
			healthcareserviceidentifierperiod.setEnd(HlthcrSrv_Id_Prd_Enddate);
		}
		/******************** HlthcrSrv_Id_Prd_Strt ********************************************************************************/
		if(h.getHlthcrSrvIdPrdStrt() != null) {
			java.text.SimpleDateFormat HlthcrSrv_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date HlthcrSrv_Id_Prd_Strtdate = HlthcrSrv_Id_Prd_Strtsdf.parse(h.getHlthcrSrvIdPrdStrt());
			healthcareserviceidentifierperiod.setStart(HlthcrSrv_Id_Prd_Strtdate);
		}
		/******************** HlthcrSrv_Id_Sys ********************************************************************************/
		if(h.getHlthcrSrvIdSys() != null) {
			healthcareserviceidentifier.setSystem(h.getHlthcrSrvIdSys());
		}
		/******************** healthcareserviceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareserviceidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		healthcareserviceidentifier.setType(healthcareserviceidentifiertype);

		/******************** healthcareserviceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareserviceidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		healthcareserviceidentifiertype.addCoding(healthcareserviceidentifiertypecoding);

		/******************** HlthcrSrv_Id_Typ_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvIdTypCdgCd() != null) {
			healthcareserviceidentifiertypecoding.setCode(h.getHlthcrSrvIdTypCdgCd());
		}
		/******************** HlthcrSrv_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvIdTypCdgDsply() != null) {
			healthcareserviceidentifiertypecoding.setDisplay(h.getHlthcrSrvIdTypCdgDsply());
		}
		/******************** HlthcrSrv_Id_Typ_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvIdTypCdgSys() != null) {
			healthcareserviceidentifiertypecoding.setSystem(h.getHlthcrSrvIdTypCdgSys());
		}
		/******************** HlthcrSrv_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvIdTypCdgUsrSltd() != null) {
			healthcareserviceidentifiertypecoding.setUserSelected(Boolean.parseBoolean(h.getHlthcrSrvIdTypCdgUsrSltd()));
		}
		/******************** HlthcrSrv_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvIdTypCdgVrsn() != null) {
			healthcareserviceidentifiertypecoding.setVersion(h.getHlthcrSrvIdTypCdgVrsn());
		}
		/******************** HlthcrSrv_Id_Typ_Txt ********************************************************************************/
		if(h.getHlthcrSrvIdTypTxt() != null) {
			healthcareserviceidentifiertype.setText(h.getHlthcrSrvIdTypTxt());
		}
		/******************** healthcareserviceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory healthcareserviceidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		healthcareserviceidentifier.setUse(healthcareserviceidentifieruse.fromCode(h.getHlthcrSrvIdUse()));

		/******************** HlthcrSrv_Id_Vl ********************************************************************************/
		if(h.getHlthcrSrvIdVl() != null) {
			healthcareserviceidentifier.setValue(h.getHlthcrSrvIdVl());
		}
		/******************** HlthcrSrv_Lctn ********************************************************************************/
		if(h.getHlthcrSrvLctn() != null) {
			healthcareservice.addLocation( new org.hl7.fhir.r4.model.Reference(h.getHlthcrSrvLctn()));
		}
		/******************** HlthcrSrv_Nm ********************************************************************************/
		if(h.getHlthcrSrvNm() != null) {
			healthcareservice.setName(h.getHlthcrSrvNm());
		}
		/******************** healthcareservicenotavailable ********************************************************************************/
		org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceNotAvailableComponent healthcareservicenotavailable =  new org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceNotAvailableComponent();
		healthcareservice.addNotAvailable(healthcareservicenotavailable);

		/******************** HlthcrSrv_NotAvailable_Dscrptn ********************************************************************************/
		if(h.getHlthcrSrvNotAvailableDscrptn() != null) {
			healthcareservicenotavailable.setDescription(h.getHlthcrSrvNotAvailableDscrptn());
		}
		/******************** healthcareservicenotavailableduring ********************************************************************************/
		org.hl7.fhir.r4.model.Period healthcareservicenotavailableduring =  new org.hl7.fhir.r4.model.Period();
		healthcareservicenotavailable.setDuring(healthcareservicenotavailableduring);

		/******************** HlthcrSrv_NotAvailable_During_End ********************************************************************************/
		if(h.getHlthcrSrvNotAvailableDuringEnd() != null) {
			java.text.SimpleDateFormat HlthcrSrv_NotAvailable_During_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date HlthcrSrv_NotAvailable_During_Enddate = HlthcrSrv_NotAvailable_During_Endsdf.parse(h.getHlthcrSrvNotAvailableDuringEnd());
			healthcareservicenotavailableduring.setEnd(HlthcrSrv_NotAvailable_During_Enddate);
		}
		/******************** HlthcrSrv_NotAvailable_During_Strt ********************************************************************************/
		if(h.getHlthcrSrvNotAvailableDuringStrt() != null) {
			java.text.SimpleDateFormat HlthcrSrv_NotAvailable_During_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date HlthcrSrv_NotAvailable_During_Strtdate = HlthcrSrv_NotAvailable_During_Strtsdf.parse(h.getHlthcrSrvNotAvailableDuringStrt());
			healthcareservicenotavailableduring.setStart(HlthcrSrv_NotAvailable_During_Strtdate);
		}
		/******************** healthcareservicephoto ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment healthcareservicephoto =  new org.hl7.fhir.r4.model.Attachment();
		healthcareservice.setPhoto(healthcareservicephoto);

		/******************** HlthcrSrv_Photo_CntntTyp ********************************************************************************/
		if(h.getHlthcrSrvPhotoCntntTyp() != null) {
			healthcareservicephoto.setContentType(h.getHlthcrSrvPhotoCntntTyp());
		}
		/******************** HlthcrSrv_Photo_Creation ********************************************************************************/
		if(h.getHlthcrSrvPhotoCreation() != null) {
			java.text.SimpleDateFormat HlthcrSrv_Photo_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date HlthcrSrv_Photo_Creationdate = HlthcrSrv_Photo_Creationsdf.parse(h.getHlthcrSrvPhotoCreation());
			healthcareservicephoto.setCreation(HlthcrSrv_Photo_Creationdate);
		}
		/******************** HlthcrSrv_Photo_Data ********************************************************************************/
		if(h.getHlthcrSrvPhotoData() != null) {
			healthcareservicephoto.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(h.getHlthcrSrvPhotoData()));
		}
		/******************** HlthcrSrv_Photo_Hash ********************************************************************************/
		if(h.getHlthcrSrvPhotoHash() != null) {
			healthcareservicephoto.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(h.getHlthcrSrvPhotoHash()));
		}
		/******************** HlthcrSrv_Photo_Lnguage ********************************************************************************/
		if(h.getHlthcrSrvPhotoLnguage() != null) {
			healthcareservicephoto.setLanguage(h.getHlthcrSrvPhotoLnguage());
		}
		/******************** HlthcrSrv_Photo_Sz ********************************************************************************/
		if(h.getHlthcrSrvPhotoSz() != null) {
			healthcareservicephoto.setSize(Integer.parseInt(h.getHlthcrSrvPhotoSz()));
		}
		/******************** HlthcrSrv_Photo_Ttl ********************************************************************************/
		if(h.getHlthcrSrvPhotoTtl() != null) {
			healthcareservicephoto.setTitle(h.getHlthcrSrvPhotoTtl());
		}
		/******************** HlthcrSrv_Photo_Url ********************************************************************************/
		if(h.getHlthcrSrvPhotoUrl() != null) {
			healthcareservicephoto.setUrl(h.getHlthcrSrvPhotoUrl());
		}
		/******************** healthcareserviceprogram ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareserviceprogram =  new org.hl7.fhir.r4.model.CodeableConcept();
		healthcareservice.addProgram(healthcareserviceprogram);

		/******************** healthcareserviceprogramcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareserviceprogramcoding =  new org.hl7.fhir.r4.model.Coding();
		healthcareserviceprogram.addCoding(healthcareserviceprogramcoding);

		/******************** HlthcrSrv_Prgrm_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvPrgrmCdgCd() != null) {
			healthcareserviceprogramcoding.setCode(h.getHlthcrSrvPrgrmCdgCd());
		}
		/******************** HlthcrSrv_Prgrm_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvPrgrmCdgDsply() != null) {
			healthcareserviceprogramcoding.setDisplay(h.getHlthcrSrvPrgrmCdgDsply());
		}
		/******************** HlthcrSrv_Prgrm_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvPrgrmCdgSys() != null) {
			healthcareserviceprogramcoding.setSystem(h.getHlthcrSrvPrgrmCdgSys());
		}
		/******************** HlthcrSrv_Prgrm_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvPrgrmCdgUsrSltd() != null) {
			healthcareserviceprogramcoding.setUserSelected(Boolean.parseBoolean(h.getHlthcrSrvPrgrmCdgUsrSltd()));
		}
		/******************** HlthcrSrv_Prgrm_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvPrgrmCdgVrsn() != null) {
			healthcareserviceprogramcoding.setVersion(h.getHlthcrSrvPrgrmCdgVrsn());
		}
		/******************** HlthcrSrv_Prgrm_Txt ********************************************************************************/
		if(h.getHlthcrSrvPrgrmTxt() != null) {
			healthcareserviceprogram.setText(h.getHlthcrSrvPrgrmTxt());
		}
		/******************** HlthcrSrv_ProvidedBy ********************************************************************************/
		if(h.getHlthcrSrvProvidedBy() != null) {
			healthcareservice.setProvidedBy( new org.hl7.fhir.r4.model.Reference(h.getHlthcrSrvProvidedBy()));
		}
		/******************** healthcareservicereferralmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareservicereferralmethod =  new org.hl7.fhir.r4.model.CodeableConcept();
		healthcareservice.addReferralMethod(healthcareservicereferralmethod);

		/******************** healthcareservicereferralmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareservicereferralmethodcoding =  new org.hl7.fhir.r4.model.Coding();
		healthcareservicereferralmethod.addCoding(healthcareservicereferralmethodcoding);

		/******************** HlthcrSrv_ReferralMthd_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvReferralMthdCdgCd() != null) {
			healthcareservicereferralmethodcoding.setCode(h.getHlthcrSrvReferralMthdCdgCd());
		}
		/******************** HlthcrSrv_ReferralMthd_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvReferralMthdCdgDsply() != null) {
			healthcareservicereferralmethodcoding.setDisplay(h.getHlthcrSrvReferralMthdCdgDsply());
		}
		/******************** HlthcrSrv_ReferralMthd_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvReferralMthdCdgSys() != null) {
			healthcareservicereferralmethodcoding.setSystem(h.getHlthcrSrvReferralMthdCdgSys());
		}
		/******************** HlthcrSrv_ReferralMthd_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvReferralMthdCdgUsrSltd() != null) {
			healthcareservicereferralmethodcoding.setUserSelected(Boolean.parseBoolean(h.getHlthcrSrvReferralMthdCdgUsrSltd()));
		}
		/******************** HlthcrSrv_ReferralMthd_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvReferralMthdCdgVrsn() != null) {
			healthcareservicereferralmethodcoding.setVersion(h.getHlthcrSrvReferralMthdCdgVrsn());
		}
		/******************** HlthcrSrv_ReferralMthd_Txt ********************************************************************************/
		if(h.getHlthcrSrvReferralMthdTxt() != null) {
			healthcareservicereferralmethod.setText(h.getHlthcrSrvReferralMthdTxt());
		}
		/******************** healthcareserviceserviceprovisioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareserviceserviceprovisioncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		healthcareservice.addServiceProvisionCode(healthcareserviceserviceprovisioncode);

		/******************** healthcareserviceserviceprovisioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareserviceserviceprovisioncodecoding =  new org.hl7.fhir.r4.model.Coding();
		healthcareserviceserviceprovisioncode.addCoding(healthcareserviceserviceprovisioncodecoding);

		/******************** HlthcrSrv_SrvProvisionCd_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvSrvProvisionCdCdgCd() != null) {
			healthcareserviceserviceprovisioncodecoding.setCode(h.getHlthcrSrvSrvProvisionCdCdgCd());
		}
		/******************** HlthcrSrv_SrvProvisionCd_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvSrvProvisionCdCdgDsply() != null) {
			healthcareserviceserviceprovisioncodecoding.setDisplay(h.getHlthcrSrvSrvProvisionCdCdgDsply());
		}
		/******************** HlthcrSrv_SrvProvisionCd_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvSrvProvisionCdCdgSys() != null) {
			healthcareserviceserviceprovisioncodecoding.setSystem(h.getHlthcrSrvSrvProvisionCdCdgSys());
		}
		/******************** HlthcrSrv_SrvProvisionCd_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvSrvProvisionCdCdgUsrSltd() != null) {
			healthcareserviceserviceprovisioncodecoding.setUserSelected(Boolean.parseBoolean(h.getHlthcrSrvSrvProvisionCdCdgUsrSltd()));
		}
		/******************** HlthcrSrv_SrvProvisionCd_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvSrvProvisionCdCdgVrsn() != null) {
			healthcareserviceserviceprovisioncodecoding.setVersion(h.getHlthcrSrvSrvProvisionCdCdgVrsn());
		}
		/******************** HlthcrSrv_SrvProvisionCd_Txt ********************************************************************************/
		if(h.getHlthcrSrvSrvProvisionCdTxt() != null) {
			healthcareserviceserviceprovisioncode.setText(h.getHlthcrSrvSrvProvisionCdTxt());
		}
		/******************** healthcareservicespecialty ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareservicespecialty =  new org.hl7.fhir.r4.model.CodeableConcept();
		healthcareservice.addSpecialty(healthcareservicespecialty);

		/******************** healthcareservicespecialtycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareservicespecialtycoding =  new org.hl7.fhir.r4.model.Coding();
		healthcareservicespecialty.addCoding(healthcareservicespecialtycoding);

		/******************** HlthcrSrv_Spclty_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvSpcltyCdgCd() != null) {
			healthcareservicespecialtycoding.setCode(h.getHlthcrSrvSpcltyCdgCd());
		}
		/******************** HlthcrSrv_Spclty_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvSpcltyCdgDsply() != null) {
			healthcareservicespecialtycoding.setDisplay(h.getHlthcrSrvSpcltyCdgDsply());
		}
		/******************** HlthcrSrv_Spclty_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvSpcltyCdgSys() != null) {
			healthcareservicespecialtycoding.setSystem(h.getHlthcrSrvSpcltyCdgSys());
		}
		/******************** HlthcrSrv_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvSpcltyCdgUsrSltd() != null) {
			healthcareservicespecialtycoding.setUserSelected(Boolean.parseBoolean(h.getHlthcrSrvSpcltyCdgUsrSltd()));
		}
		/******************** HlthcrSrv_Spclty_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvSpcltyCdgVrsn() != null) {
			healthcareservicespecialtycoding.setVersion(h.getHlthcrSrvSpcltyCdgVrsn());
		}
		/******************** HlthcrSrv_Spclty_Txt ********************************************************************************/
		if(h.getHlthcrSrvSpcltyTxt() != null) {
			healthcareservicespecialty.setText(h.getHlthcrSrvSpcltyTxt());
		}
		/******************** healthcareservicetelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint healthcareservicetelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		healthcareservice.addTelecom(healthcareservicetelecom);

		/******************** healthcareservicetelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period healthcareservicetelecomperiod =  new org.hl7.fhir.r4.model.Period();
		healthcareservicetelecom.setPeriod(healthcareservicetelecomperiod);

		/******************** HlthcrSrv_Tlcm_Prd_End ********************************************************************************/
		if(h.getHlthcrSrvTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat HlthcrSrv_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date HlthcrSrv_Tlcm_Prd_Enddate = HlthcrSrv_Tlcm_Prd_Endsdf.parse(h.getHlthcrSrvTlcmPrdEnd());
			healthcareservicetelecomperiod.setEnd(HlthcrSrv_Tlcm_Prd_Enddate);
		}
		/******************** HlthcrSrv_Tlcm_Prd_Strt ********************************************************************************/
		if(h.getHlthcrSrvTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat HlthcrSrv_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date HlthcrSrv_Tlcm_Prd_Strtdate = HlthcrSrv_Tlcm_Prd_Strtsdf.parse(h.getHlthcrSrvTlcmPrdStrt());
			healthcareservicetelecomperiod.setStart(HlthcrSrv_Tlcm_Prd_Strtdate);
		}
		/******************** HlthcrSrv_Tlcm_Rnk ********************************************************************************/
		if(h.getHlthcrSrvTlcmRnk() != null) {
			healthcareservicetelecom.setRank(Integer.parseInt(h.getHlthcrSrvTlcmRnk()));
		}
		/******************** healthcareservicetelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory healthcareservicetelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		healthcareservicetelecom.setSystem(healthcareservicetelecomsystem.fromCode(h.getHlthcrSrvTlcmSys()));

		/******************** healthcareservicetelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory healthcareservicetelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		healthcareservicetelecom.setUse(healthcareservicetelecomuse.fromCode(h.getHlthcrSrvTlcmUse()));

		/******************** HlthcrSrv_Tlcm_Vl ********************************************************************************/
		if(h.getHlthcrSrvTlcmVl() != null) {
			healthcareservicetelecom.setValue(h.getHlthcrSrvTlcmVl());
		}
		/******************** healthcareservicetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareservicetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		healthcareservice.addType(healthcareservicetype);

		/******************** healthcareservicetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareservicetypecoding =  new org.hl7.fhir.r4.model.Coding();
		healthcareservicetype.addCoding(healthcareservicetypecoding);

		/******************** HlthcrSrv_Typ_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvTypCdgCd() != null) {
			healthcareservicetypecoding.setCode(h.getHlthcrSrvTypCdgCd());
		}
		/******************** HlthcrSrv_Typ_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvTypCdgDsply() != null) {
			healthcareservicetypecoding.setDisplay(h.getHlthcrSrvTypCdgDsply());
		}
		/******************** HlthcrSrv_Typ_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvTypCdgSys() != null) {
			healthcareservicetypecoding.setSystem(h.getHlthcrSrvTypCdgSys());
		}
		/******************** HlthcrSrv_Typ_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvTypCdgUsrSltd() != null) {
			healthcareservicetypecoding.setUserSelected(Boolean.parseBoolean(h.getHlthcrSrvTypCdgUsrSltd()));
		}
		/******************** HlthcrSrv_Typ_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvTypCdgVrsn() != null) {
			healthcareservicetypecoding.setVersion(h.getHlthcrSrvTypCdgVrsn());
		}
		/******************** HlthcrSrv_Typ_Txt ********************************************************************************/
		if(h.getHlthcrSrvTypTxt() != null) {
			healthcareservicetype.setText(h.getHlthcrSrvTypTxt());
		}
		return healthcareservice;
	}
}
