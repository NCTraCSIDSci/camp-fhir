package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.PractitionerRole;
public class PractitionerRoleConversion 
{
	public org.hl7.fhir.r4.model.PractitionerRole PractitionerRoles(PractitionerRole p) throws ParseException
	{
		org.hl7.fhir.r4.model.PractitionerRole practitionerrole = new org.hl7.fhir.r4.model.PractitionerRole();

		/******************** id ********************************************************************************/
		practitionerrole.setId(p.getId());

		/******************** PrctitnrRole_Active ********************************************************************************/
		if(p.getPrctitnrRoleActive() != null) {
			practitionerrole.setActive(Boolean.parseBoolean(p.getPrctitnrRoleActive()));
		}
		/******************** PrctitnrRole_AvailabilityExceptions ********************************************************************************/
		if(p.getPrctitnrRoleAvailabilityExceptions() != null) {
			practitionerrole.setAvailabilityExceptions(p.getPrctitnrRoleAvailabilityExceptions());
		}
		/******************** practitionerroleavailabletime ********************************************************************************/
		org.hl7.fhir.r4.model.PractitionerRole.PractitionerRoleAvailableTimeComponent practitionerroleavailabletime =  new org.hl7.fhir.r4.model.PractitionerRole.PractitionerRoleAvailableTimeComponent();
		practitionerrole.addAvailableTime(practitionerroleavailabletime);

		/******************** PrctitnrRole_AvailableTime_AllDay ********************************************************************************/
		if(p.getPrctitnrRoleAvailableTimeAllDay() != null) {
			practitionerroleavailabletime.setAllDay(Boolean.parseBoolean(p.getPrctitnrRoleAvailableTimeAllDay()));
		}
		/******************** PrctitnrRole_AvailableTime_AvailableEndTime ********************************************************************************/
		if(p.getPrctitnrRoleAvailableTimeAvailableEndTime() != null) {
			practitionerroleavailabletime.setAvailableEndTime(p.getPrctitnrRoleAvailableTimeAvailableEndTime());
		}
		/******************** PrctitnrRole_AvailableTime_AvailableStrtTime ********************************************************************************/
		if(p.getPrctitnrRoleAvailableTimeAvailableStrtTime() != null) {
			practitionerroleavailabletime.setAvailableStartTime(p.getPrctitnrRoleAvailableTimeAvailableStrtTime());
		}
		/******************** practitionerroleavailabletimedaysofweek ********************************************************************************/
		org.hl7.fhir.r4.model.PractitionerRole.DaysOfWeekEnumFactory practitionerroleavailabletimedaysofweek =  new org.hl7.fhir.r4.model.PractitionerRole.DaysOfWeekEnumFactory();
		practitionerroleavailabletime.addDaysOfWeek(practitionerroleavailabletimedaysofweek.fromCode(p.getPrctitnrRoleAvailableTimeDaysOfWeek()));

		/******************** practitionerrolecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept practitionerrolecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		practitionerrole.addCode(practitionerrolecode);

		/******************** practitionerrolecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding practitionerrolecodecoding =  new org.hl7.fhir.r4.model.Coding();
		practitionerrolecode.addCoding(practitionerrolecodecoding);

		/******************** PrctitnrRole_Cd_Cdg_Cd ********************************************************************************/
		if(p.getPrctitnrRoleCdCdgCd() != null) {
			practitionerrolecodecoding.setCode(p.getPrctitnrRoleCdCdgCd());
		}
		/******************** PrctitnrRole_Cd_Cdg_Dsply ********************************************************************************/
		if(p.getPrctitnrRoleCdCdgDsply() != null) {
			practitionerrolecodecoding.setDisplay(p.getPrctitnrRoleCdCdgDsply());
		}
		/******************** PrctitnrRole_Cd_Cdg_Sys ********************************************************************************/
		if(p.getPrctitnrRoleCdCdgSys() != null) {
			practitionerrolecodecoding.setSystem(p.getPrctitnrRoleCdCdgSys());
		}
		/******************** PrctitnrRole_Cd_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrctitnrRoleCdCdgUsrSltd() != null) {
			practitionerrolecodecoding.setUserSelected(Boolean.parseBoolean(p.getPrctitnrRoleCdCdgUsrSltd()));
		}
		/******************** PrctitnrRole_Cd_Cdg_Vrsn ********************************************************************************/
		if(p.getPrctitnrRoleCdCdgVrsn() != null) {
			practitionerrolecodecoding.setVersion(p.getPrctitnrRoleCdCdgVrsn());
		}
		/******************** PrctitnrRole_Cd_Txt ********************************************************************************/
		if(p.getPrctitnrRoleCdTxt() != null) {
			practitionerrolecode.setText(p.getPrctitnrRoleCdTxt());
		}
		/******************** PrctitnrRole_Endpoint ********************************************************************************/
		if(p.getPrctitnrRoleEndpoint() != null) {
			practitionerrole.addEndpoint( new org.hl7.fhir.r4.model.Reference(p.getPrctitnrRoleEndpoint()));
		}
		/******************** PrctitnrRole_HlthcrSrv ********************************************************************************/
		if(p.getPrctitnrRoleHlthcrSrv() != null) {
			practitionerrole.addHealthcareService( new org.hl7.fhir.r4.model.Reference(p.getPrctitnrRoleHlthcrSrv()));
		}
		/******************** practitionerroleidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier practitionerroleidentifier =  new org.hl7.fhir.r4.model.Identifier();
		practitionerrole.addIdentifier(practitionerroleidentifier);

		/******************** PrctitnrRole_Id_Assigner ********************************************************************************/
		if(p.getPrctitnrRoleIdAssigner() != null) {
			practitionerroleidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(p.getPrctitnrRoleIdAssigner()));
		}
		/******************** practitionerroleidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionerroleidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		practitionerroleidentifier.setPeriod(practitionerroleidentifierperiod);

		/******************** PrctitnrRole_Id_Prd_End ********************************************************************************/
		if(p.getPrctitnrRoleIdPrdEnd() != null) {
			java.text.SimpleDateFormat PrctitnrRole_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PrctitnrRole_Id_Prd_Enddate = PrctitnrRole_Id_Prd_Endsdf.parse(p.getPrctitnrRoleIdPrdEnd());
			practitionerroleidentifierperiod.setEnd(PrctitnrRole_Id_Prd_Enddate);
		}
		/******************** PrctitnrRole_Id_Prd_Strt ********************************************************************************/
		if(p.getPrctitnrRoleIdPrdStrt() != null) {
			java.text.SimpleDateFormat PrctitnrRole_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PrctitnrRole_Id_Prd_Strtdate = PrctitnrRole_Id_Prd_Strtsdf.parse(p.getPrctitnrRoleIdPrdStrt());
			practitionerroleidentifierperiod.setStart(PrctitnrRole_Id_Prd_Strtdate);
		}
		/******************** PrctitnrRole_Id_Sys ********************************************************************************/
		if(p.getPrctitnrRoleIdSys() != null) {
			practitionerroleidentifier.setSystem(p.getPrctitnrRoleIdSys());
		}
		/******************** practitionerroleidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept practitionerroleidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		practitionerroleidentifier.setType(practitionerroleidentifiertype);

		/******************** practitionerroleidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding practitionerroleidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		practitionerroleidentifiertype.addCoding(practitionerroleidentifiertypecoding);

		/******************** PrctitnrRole_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPrctitnrRoleIdTypCdgCd() != null) {
			practitionerroleidentifiertypecoding.setCode(p.getPrctitnrRoleIdTypCdgCd());
		}
		/******************** PrctitnrRole_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPrctitnrRoleIdTypCdgDsply() != null) {
			practitionerroleidentifiertypecoding.setDisplay(p.getPrctitnrRoleIdTypCdgDsply());
		}
		/******************** PrctitnrRole_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPrctitnrRoleIdTypCdgSys() != null) {
			practitionerroleidentifiertypecoding.setSystem(p.getPrctitnrRoleIdTypCdgSys());
		}
		/******************** PrctitnrRole_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrctitnrRoleIdTypCdgUsrSltd() != null) {
			practitionerroleidentifiertypecoding.setUserSelected(Boolean.parseBoolean(p.getPrctitnrRoleIdTypCdgUsrSltd()));
		}
		/******************** PrctitnrRole_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPrctitnrRoleIdTypCdgVrsn() != null) {
			practitionerroleidentifiertypecoding.setVersion(p.getPrctitnrRoleIdTypCdgVrsn());
		}
		/******************** PrctitnrRole_Id_Typ_Txt ********************************************************************************/
		if(p.getPrctitnrRoleIdTypTxt() != null) {
			practitionerroleidentifiertype.setText(p.getPrctitnrRoleIdTypTxt());
		}
		/******************** practitionerroleidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory practitionerroleidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		practitionerroleidentifier.setUse(practitionerroleidentifieruse.fromCode(p.getPrctitnrRoleIdUse()));

		/******************** PrctitnrRole_Id_Vl ********************************************************************************/
		if(p.getPrctitnrRoleIdVl() != null) {
			practitionerroleidentifier.setValue(p.getPrctitnrRoleIdVl());
		}
		/******************** PrctitnrRole_Lctn ********************************************************************************/
		if(p.getPrctitnrRoleLctn() != null) {
			practitionerrole.addLocation( new org.hl7.fhir.r4.model.Reference(p.getPrctitnrRoleLctn()));
		}
		/******************** practitionerrolenotavailable ********************************************************************************/
		org.hl7.fhir.r4.model.PractitionerRole.PractitionerRoleNotAvailableComponent practitionerrolenotavailable =  new org.hl7.fhir.r4.model.PractitionerRole.PractitionerRoleNotAvailableComponent();
		practitionerrole.addNotAvailable(practitionerrolenotavailable);

		/******************** PrctitnrRole_NotAvailable_Dscrptn ********************************************************************************/
		if(p.getPrctitnrRoleNotAvailableDscrptn() != null) {
			practitionerrolenotavailable.setDescription(p.getPrctitnrRoleNotAvailableDscrptn());
		}
		/******************** practitionerrolenotavailableduring ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionerrolenotavailableduring =  new org.hl7.fhir.r4.model.Period();
		practitionerrolenotavailable.setDuring(practitionerrolenotavailableduring);

		/******************** PrctitnrRole_NotAvailable_During_End ********************************************************************************/
		if(p.getPrctitnrRoleNotAvailableDuringEnd() != null) {
			java.text.SimpleDateFormat PrctitnrRole_NotAvailable_During_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PrctitnrRole_NotAvailable_During_Enddate = PrctitnrRole_NotAvailable_During_Endsdf.parse(p.getPrctitnrRoleNotAvailableDuringEnd());
			practitionerrolenotavailableduring.setEnd(PrctitnrRole_NotAvailable_During_Enddate);
		}
		/******************** PrctitnrRole_NotAvailable_During_Strt ********************************************************************************/
		if(p.getPrctitnrRoleNotAvailableDuringStrt() != null) {
			java.text.SimpleDateFormat PrctitnrRole_NotAvailable_During_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PrctitnrRole_NotAvailable_During_Strtdate = PrctitnrRole_NotAvailable_During_Strtsdf.parse(p.getPrctitnrRoleNotAvailableDuringStrt());
			practitionerrolenotavailableduring.setStart(PrctitnrRole_NotAvailable_During_Strtdate);
		}
		/******************** PrctitnrRole_Orgnztn ********************************************************************************/
		if(p.getPrctitnrRoleOrgnztn() != null) {
			practitionerrole.setOrganization( new org.hl7.fhir.r4.model.Reference(p.getPrctitnrRoleOrgnztn()));
		}
		/******************** practitionerroleperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionerroleperiod =  new org.hl7.fhir.r4.model.Period();
		practitionerrole.setPeriod(practitionerroleperiod);

		/******************** PrctitnrRole_Prd_End ********************************************************************************/
		if(p.getPrctitnrRolePrdEnd() != null) {
			java.text.SimpleDateFormat PrctitnrRole_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PrctitnrRole_Prd_Enddate = PrctitnrRole_Prd_Endsdf.parse(p.getPrctitnrRolePrdEnd());
			practitionerroleperiod.setEnd(PrctitnrRole_Prd_Enddate);
		}
		/******************** PrctitnrRole_Prd_Strt ********************************************************************************/
		if(p.getPrctitnrRolePrdStrt() != null) {
			java.text.SimpleDateFormat PrctitnrRole_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PrctitnrRole_Prd_Strtdate = PrctitnrRole_Prd_Strtsdf.parse(p.getPrctitnrRolePrdStrt());
			practitionerroleperiod.setStart(PrctitnrRole_Prd_Strtdate);
		}
		/******************** PrctitnrRole_Prctitnr ********************************************************************************/
		if(p.getPrctitnrRolePrctitnr() != null) {
			practitionerrole.setPractitioner( new org.hl7.fhir.r4.model.Reference(p.getPrctitnrRolePrctitnr()));
		}
		/******************** practitionerrolespecialty ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept practitionerrolespecialty =  new org.hl7.fhir.r4.model.CodeableConcept();
		practitionerrole.addSpecialty(practitionerrolespecialty);

		/******************** practitionerrolespecialtycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding practitionerrolespecialtycoding =  new org.hl7.fhir.r4.model.Coding();
		practitionerrolespecialty.addCoding(practitionerrolespecialtycoding);

		/******************** PrctitnrRole_Spclty_Cdg_Cd ********************************************************************************/
		if(p.getPrctitnrRoleSpcltyCdgCd() != null) {
			practitionerrolespecialtycoding.setCode(p.getPrctitnrRoleSpcltyCdgCd());
		}
		/******************** PrctitnrRole_Spclty_Cdg_Dsply ********************************************************************************/
		if(p.getPrctitnrRoleSpcltyCdgDsply() != null) {
			practitionerrolespecialtycoding.setDisplay(p.getPrctitnrRoleSpcltyCdgDsply());
		}
		/******************** PrctitnrRole_Spclty_Cdg_Sys ********************************************************************************/
		if(p.getPrctitnrRoleSpcltyCdgSys() != null) {
			practitionerrolespecialtycoding.setSystem(p.getPrctitnrRoleSpcltyCdgSys());
		}
		/******************** PrctitnrRole_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrctitnrRoleSpcltyCdgUsrSltd() != null) {
			practitionerrolespecialtycoding.setUserSelected(Boolean.parseBoolean(p.getPrctitnrRoleSpcltyCdgUsrSltd()));
		}
		/******************** PrctitnrRole_Spclty_Cdg_Vrsn ********************************************************************************/
		if(p.getPrctitnrRoleSpcltyCdgVrsn() != null) {
			practitionerrolespecialtycoding.setVersion(p.getPrctitnrRoleSpcltyCdgVrsn());
		}
		/******************** PrctitnrRole_Spclty_Txt ********************************************************************************/
		if(p.getPrctitnrRoleSpcltyTxt() != null) {
			practitionerrolespecialty.setText(p.getPrctitnrRoleSpcltyTxt());
		}
		/******************** practitionerroletelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint practitionerroletelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		practitionerrole.addTelecom(practitionerroletelecom);

		/******************** practitionerroletelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionerroletelecomperiod =  new org.hl7.fhir.r4.model.Period();
		practitionerroletelecom.setPeriod(practitionerroletelecomperiod);

		/******************** PrctitnrRole_Tlcm_Prd_End ********************************************************************************/
		if(p.getPrctitnrRoleTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat PrctitnrRole_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PrctitnrRole_Tlcm_Prd_Enddate = PrctitnrRole_Tlcm_Prd_Endsdf.parse(p.getPrctitnrRoleTlcmPrdEnd());
			practitionerroletelecomperiod.setEnd(PrctitnrRole_Tlcm_Prd_Enddate);
		}
		/******************** PrctitnrRole_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPrctitnrRoleTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat PrctitnrRole_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PrctitnrRole_Tlcm_Prd_Strtdate = PrctitnrRole_Tlcm_Prd_Strtsdf.parse(p.getPrctitnrRoleTlcmPrdStrt());
			practitionerroletelecomperiod.setStart(PrctitnrRole_Tlcm_Prd_Strtdate);
		}
		/******************** PrctitnrRole_Tlcm_Rnk ********************************************************************************/
		if(p.getPrctitnrRoleTlcmRnk() != null) {
			practitionerroletelecom.setRank(Integer.parseInt(p.getPrctitnrRoleTlcmRnk()));
		}
		/******************** practitionerroletelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory practitionerroletelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		practitionerroletelecom.setSystem(practitionerroletelecomsystem.fromCode(p.getPrctitnrRoleTlcmSys()));

		/******************** practitionerroletelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory practitionerroletelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		practitionerroletelecom.setUse(practitionerroletelecomuse.fromCode(p.getPrctitnrRoleTlcmUse()));

		/******************** PrctitnrRole_Tlcm_Vl ********************************************************************************/
		if(p.getPrctitnrRoleTlcmVl() != null) {
			practitionerroletelecom.setValue(p.getPrctitnrRoleTlcmVl());
		}
		return practitionerrole;
	}
}
