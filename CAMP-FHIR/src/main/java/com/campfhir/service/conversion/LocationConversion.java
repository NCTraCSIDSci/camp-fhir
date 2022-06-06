package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Location;
public class LocationConversion 
{
	public org.hl7.fhir.r4.model.Location Locations(Location l) throws ParseException
	{
		org.hl7.fhir.r4.model.Location location = new org.hl7.fhir.r4.model.Location();

		/******************** id ********************************************************************************/
		location.setId(l.getId());

		/******************** locationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address locationaddress =  new org.hl7.fhir.r4.model.Address();
		location.setAddress(locationaddress);

		/******************** Lctn_Addr_City ********************************************************************************/
		if(l.getLctnAddrCity() != null) {
			locationaddress.setCity(l.getLctnAddrCity());
		}
		/******************** Lctn_Addr_Cntry ********************************************************************************/
		if(l.getLctnAddrCntry() != null) {
			locationaddress.setCountry(l.getLctnAddrCntry());
		}
		/******************** Lctn_Addr_District ********************************************************************************/
		if(l.getLctnAddrDistrict() != null) {
			locationaddress.setDistrict(l.getLctnAddrDistrict());
		}
		/******************** Lctn_Addr_Line ********************************************************************************/
		if(l.getLctnAddrLine() != null) {
			locationaddress.addLine(l.getLctnAddrLine());
		}
		/******************** locationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period locationaddressperiod =  new org.hl7.fhir.r4.model.Period();
		locationaddress.setPeriod(locationaddressperiod);

		/******************** Lctn_Addr_Prd_End ********************************************************************************/
		if(l.getLctnAddrPrdEnd() != null) {
			java.text.SimpleDateFormat Lctn_Addr_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Lctn_Addr_Prd_Enddate = Lctn_Addr_Prd_Endsdf.parse(l.getLctnAddrPrdEnd());
			locationaddressperiod.setEnd(Lctn_Addr_Prd_Enddate);
		}
		/******************** Lctn_Addr_Prd_Strt ********************************************************************************/
		if(l.getLctnAddrPrdStrt() != null) {
			java.text.SimpleDateFormat Lctn_Addr_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Lctn_Addr_Prd_Strtdate = Lctn_Addr_Prd_Strtsdf.parse(l.getLctnAddrPrdStrt());
			locationaddressperiod.setStart(Lctn_Addr_Prd_Strtdate);
		}
		/******************** Lctn_Addr_PostalCd ********************************************************************************/
		if(l.getLctnAddrPostalCd() != null) {
			locationaddress.setPostalCode(l.getLctnAddrPostalCd());
		}
		/******************** Lctn_Addr_State ********************************************************************************/
		if(l.getLctnAddrState() != null) {
			locationaddress.setState(l.getLctnAddrState());
		}
		/******************** Lctn_Addr_Txt ********************************************************************************/
		if(l.getLctnAddrTxt() != null) {
			locationaddress.setText(l.getLctnAddrTxt());
		}
		/******************** locationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory locationaddresstype =  new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();
		locationaddress.setType(locationaddresstype.fromCode(l.getLctnAddrTyp()));

		/******************** locationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory locationaddressuse =  new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();
		locationaddress.setUse(locationaddressuse.fromCode(l.getLctnAddrUse()));

		/******************** Lctn_Alias ********************************************************************************/
		if(l.getLctnAlias() != null) {
			location.addAlias(l.getLctnAlias());
		}
		/******************** Lctn_AvailabilityExceptions ********************************************************************************/
		if(l.getLctnAvailabilityExceptions() != null) {
			location.setAvailabilityExceptions(l.getLctnAvailabilityExceptions());
		}
		/******************** Lctn_Dscrptn ********************************************************************************/
		if(l.getLctnDscrptn() != null) {
			location.setDescription(l.getLctnDscrptn());
		}
		/******************** Lctn_Endpoint ********************************************************************************/
		if(l.getLctnEndpoint() != null) {
			location.addEndpoint( new org.hl7.fhir.r4.model.Reference(l.getLctnEndpoint()));
		}
		/******************** locationhoursofoperation ********************************************************************************/
		org.hl7.fhir.r4.model.Location.LocationHoursOfOperationComponent locationhoursofoperation =  new org.hl7.fhir.r4.model.Location.LocationHoursOfOperationComponent();
		location.addHoursOfOperation(locationhoursofoperation);

		/******************** Lctn_HoursOfOprtn_AllDay ********************************************************************************/
		if(l.getLctnHoursOfOprtnAllDay() != null) {
			locationhoursofoperation.setAllDay(Boolean.parseBoolean(l.getLctnHoursOfOprtnAllDay()));
		}
		/******************** Lctn_HoursOfOprtn_ClosingTime ********************************************************************************/
		if(l.getLctnHoursOfOprtnClosingTime() != null) {
			locationhoursofoperation.setClosingTime(l.getLctnHoursOfOprtnClosingTime());
		}
		/******************** locationhoursofoperationdaysofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Location.DaysOfWeekEnumFactory locationhoursofoperationdaysofweek =  new org.hl7.fhir.r4.model.Location.DaysOfWeekEnumFactory();
		locationhoursofoperation.addDaysOfWeek(locationhoursofoperationdaysofweek.fromCode(l.getLctnHoursOfOprtnDaysOfWeek()));

		/******************** Lctn_HoursOfOprtn_OpeningTime ********************************************************************************/
		if(l.getLctnHoursOfOprtnOpeningTime() != null) {
			locationhoursofoperation.setOpeningTime(l.getLctnHoursOfOprtnOpeningTime());
		}
		/******************** locationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier locationidentifier =  new org.hl7.fhir.r4.model.Identifier();
		location.addIdentifier(locationidentifier);

		/******************** Lctn_Id_Assigner ********************************************************************************/
		if(l.getLctnIdAssigner() != null) {
			locationidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(l.getLctnIdAssigner()));
		}
		/******************** locationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period locationidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		locationidentifier.setPeriod(locationidentifierperiod);

		/******************** Lctn_Id_Prd_End ********************************************************************************/
		if(l.getLctnIdPrdEnd() != null) {
			java.text.SimpleDateFormat Lctn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Lctn_Id_Prd_Enddate = Lctn_Id_Prd_Endsdf.parse(l.getLctnIdPrdEnd());
			locationidentifierperiod.setEnd(Lctn_Id_Prd_Enddate);
		}
		/******************** Lctn_Id_Prd_Strt ********************************************************************************/
		if(l.getLctnIdPrdStrt() != null) {
			java.text.SimpleDateFormat Lctn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Lctn_Id_Prd_Strtdate = Lctn_Id_Prd_Strtsdf.parse(l.getLctnIdPrdStrt());
			locationidentifierperiod.setStart(Lctn_Id_Prd_Strtdate);
		}
		/******************** Lctn_Id_Sys ********************************************************************************/
		if(l.getLctnIdSys() != null) {
			locationidentifier.setSystem(l.getLctnIdSys());
		}
		/******************** locationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept locationidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		locationidentifier.setType(locationidentifiertype);

		/******************** locationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding locationidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		locationidentifiertype.addCoding(locationidentifiertypecoding);

		/******************** Lctn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(l.getLctnIdTypCdgCd() != null) {
			locationidentifiertypecoding.setCode(l.getLctnIdTypCdgCd());
		}
		/******************** Lctn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(l.getLctnIdTypCdgDsply() != null) {
			locationidentifiertypecoding.setDisplay(l.getLctnIdTypCdgDsply());
		}
		/******************** Lctn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(l.getLctnIdTypCdgSys() != null) {
			locationidentifiertypecoding.setSystem(l.getLctnIdTypCdgSys());
		}
		/******************** Lctn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(l.getLctnIdTypCdgUsrSltd() != null) {
			locationidentifiertypecoding.setUserSelected(Boolean.parseBoolean(l.getLctnIdTypCdgUsrSltd()));
		}
		/******************** Lctn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(l.getLctnIdTypCdgVrsn() != null) {
			locationidentifiertypecoding.setVersion(l.getLctnIdTypCdgVrsn());
		}
		/******************** Lctn_Id_Typ_Txt ********************************************************************************/
		if(l.getLctnIdTypTxt() != null) {
			locationidentifiertype.setText(l.getLctnIdTypTxt());
		}
		/******************** locationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory locationidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		locationidentifier.setUse(locationidentifieruse.fromCode(l.getLctnIdUse()));

		/******************** Lctn_Id_Vl ********************************************************************************/
		if(l.getLctnIdVl() != null) {
			locationidentifier.setValue(l.getLctnIdVl());
		}
		/******************** Lctn_ManagingOrgnztn ********************************************************************************/
		if(l.getLctnManagingOrgnztn() != null) {
			location.setManagingOrganization( new org.hl7.fhir.r4.model.Reference(l.getLctnManagingOrgnztn()));
		}
		/******************** locationmode ********************************************************************************/
		org.hl7.fhir.r4.model.Location.LocationModeEnumFactory locationmode =  new org.hl7.fhir.r4.model.Location.LocationModeEnumFactory();
		location.setMode(locationmode.fromCode(l.getLctnMode()));

		/******************** Lctn_Nm ********************************************************************************/
		if(l.getLctnNm() != null) {
			location.setName(l.getLctnNm());
		}
		/******************** locationoperationalstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Coding locationoperationalstatus =  new org.hl7.fhir.r4.model.Coding();
		location.setOperationalStatus(locationoperationalstatus);

		/******************** Lctn_OprtnalSts_Cd ********************************************************************************/
		if(l.getLctnOprtnalStsCd() != null) {
			locationoperationalstatus.setCode(l.getLctnOprtnalStsCd());
		}
		/******************** Lctn_OprtnalSts_Dsply ********************************************************************************/
		if(l.getLctnOprtnalStsDsply() != null) {
			locationoperationalstatus.setDisplay(l.getLctnOprtnalStsDsply());
		}
		/******************** Lctn_OprtnalSts_Sys ********************************************************************************/
		if(l.getLctnOprtnalStsSys() != null) {
			locationoperationalstatus.setSystem(l.getLctnOprtnalStsSys());
		}
		/******************** Lctn_OprtnalSts_UsrSltd ********************************************************************************/
		if(l.getLctnOprtnalStsUsrSltd() != null) {
			locationoperationalstatus.setUserSelected(Boolean.parseBoolean(l.getLctnOprtnalStsUsrSltd()));
		}
		/******************** Lctn_OprtnalSts_Vrsn ********************************************************************************/
		if(l.getLctnOprtnalStsVrsn() != null) {
			locationoperationalstatus.setVersion(l.getLctnOprtnalStsVrsn());
		}
		/******************** Lctn_PartOf ********************************************************************************/
		if(l.getLctnPartOf() != null) {
			location.setPartOf( new org.hl7.fhir.r4.model.Reference(l.getLctnPartOf()));
		}
		/******************** locationphysicaltype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept locationphysicaltype =  new org.hl7.fhir.r4.model.CodeableConcept();
		location.setPhysicalType(locationphysicaltype);

		/******************** locationphysicaltypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding locationphysicaltypecoding =  new org.hl7.fhir.r4.model.Coding();
		locationphysicaltype.addCoding(locationphysicaltypecoding);

		/******************** Lctn_PhysclTyp_Cdg_Cd ********************************************************************************/
		if(l.getLctnPhysclTypCdgCd() != null) {
			locationphysicaltypecoding.setCode(l.getLctnPhysclTypCdgCd());
		}
		/******************** Lctn_PhysclTyp_Cdg_Dsply ********************************************************************************/
		if(l.getLctnPhysclTypCdgDsply() != null) {
			locationphysicaltypecoding.setDisplay(l.getLctnPhysclTypCdgDsply());
		}
		/******************** Lctn_PhysclTyp_Cdg_Sys ********************************************************************************/
		if(l.getLctnPhysclTypCdgSys() != null) {
			locationphysicaltypecoding.setSystem(l.getLctnPhysclTypCdgSys());
		}
		/******************** Lctn_PhysclTyp_Cdg_UsrSltd ********************************************************************************/
		if(l.getLctnPhysclTypCdgUsrSltd() != null) {
			locationphysicaltypecoding.setUserSelected(Boolean.parseBoolean(l.getLctnPhysclTypCdgUsrSltd()));
		}
		/******************** Lctn_PhysclTyp_Cdg_Vrsn ********************************************************************************/
		if(l.getLctnPhysclTypCdgVrsn() != null) {
			locationphysicaltypecoding.setVersion(l.getLctnPhysclTypCdgVrsn());
		}
		/******************** Lctn_PhysclTyp_Txt ********************************************************************************/
		if(l.getLctnPhysclTypTxt() != null) {
			locationphysicaltype.setText(l.getLctnPhysclTypTxt());
		}
		/******************** locationposition ********************************************************************************/
		org.hl7.fhir.r4.model.Location.LocationPositionComponent locationposition =  new org.hl7.fhir.r4.model.Location.LocationPositionComponent();
		location.setPosition(locationposition);

		/******************** Lctn_Position_Altitude ********************************************************************************/
		if(l.getLctnPositionAltitude() != null) {
			locationposition.setAltitude(Double.parseDouble((l.getLctnPositionAltitude())));
		}
		/******************** Lctn_Position_Latitude ********************************************************************************/
		if(l.getLctnPositionLatitude() != null) {
			locationposition.setLatitude(Double.parseDouble((l.getLctnPositionLatitude())));
		}
		/******************** Lctn_Position_Longitude ********************************************************************************/
		if(l.getLctnPositionLongitude() != null) {
			locationposition.setLongitude(Double.parseDouble((l.getLctnPositionLongitude())));
		}
		/******************** locationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Location.LocationStatusEnumFactory locationstatus =  new org.hl7.fhir.r4.model.Location.LocationStatusEnumFactory();
		location.setStatus(locationstatus.fromCode(l.getLctnSts()));

		/******************** locationtelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint locationtelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		location.addTelecom(locationtelecom);

		/******************** locationtelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period locationtelecomperiod =  new org.hl7.fhir.r4.model.Period();
		locationtelecom.setPeriod(locationtelecomperiod);

		/******************** Lctn_Tlcm_Prd_End ********************************************************************************/
		if(l.getLctnTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Lctn_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Lctn_Tlcm_Prd_Enddate = Lctn_Tlcm_Prd_Endsdf.parse(l.getLctnTlcmPrdEnd());
			locationtelecomperiod.setEnd(Lctn_Tlcm_Prd_Enddate);
		}
		/******************** Lctn_Tlcm_Prd_Strt ********************************************************************************/
		if(l.getLctnTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Lctn_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Lctn_Tlcm_Prd_Strtdate = Lctn_Tlcm_Prd_Strtsdf.parse(l.getLctnTlcmPrdStrt());
			locationtelecomperiod.setStart(Lctn_Tlcm_Prd_Strtdate);
		}
		/******************** Lctn_Tlcm_Rnk ********************************************************************************/
		if(l.getLctnTlcmRnk() != null) {
			locationtelecom.setRank(Integer.parseInt(l.getLctnTlcmRnk()));
		}
		/******************** locationtelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory locationtelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		locationtelecom.setSystem(locationtelecomsystem.fromCode(l.getLctnTlcmSys()));

		/******************** locationtelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory locationtelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		locationtelecom.setUse(locationtelecomuse.fromCode(l.getLctnTlcmUse()));

		/******************** Lctn_Tlcm_Vl ********************************************************************************/
		if(l.getLctnTlcmVl() != null) {
			locationtelecom.setValue(l.getLctnTlcmVl());
		}
		/******************** locationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept locationtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		location.addType(locationtype);

		/******************** locationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding locationtypecoding =  new org.hl7.fhir.r4.model.Coding();
		locationtype.addCoding(locationtypecoding);

		/******************** Lctn_Typ_Cdg_Cd ********************************************************************************/
		if(l.getLctnTypCdgCd() != null) {
			locationtypecoding.setCode(l.getLctnTypCdgCd());
		}
		/******************** Lctn_Typ_Cdg_Dsply ********************************************************************************/
		if(l.getLctnTypCdgDsply() != null) {
			locationtypecoding.setDisplay(l.getLctnTypCdgDsply());
		}
		/******************** Lctn_Typ_Cdg_Sys ********************************************************************************/
		if(l.getLctnTypCdgSys() != null) {
			locationtypecoding.setSystem(l.getLctnTypCdgSys());
		}
		/******************** Lctn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(l.getLctnTypCdgUsrSltd() != null) {
			locationtypecoding.setUserSelected(Boolean.parseBoolean(l.getLctnTypCdgUsrSltd()));
		}
		/******************** Lctn_Typ_Cdg_Vrsn ********************************************************************************/
		if(l.getLctnTypCdgVrsn() != null) {
			locationtypecoding.setVersion(l.getLctnTypCdgVrsn());
		}
		/******************** Lctn_Typ_Txt ********************************************************************************/
		if(l.getLctnTypTxt() != null) {
			locationtype.setText(l.getLctnTypTxt());
		}
		return location;
	}
}
