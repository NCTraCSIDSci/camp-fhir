package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Location;
public class LocationBidirectionalConversion 
{
	public Location Locations(org.hl7.fhir.r4.model.Location location) throws ParseException
	{
		 main.java.com.campfhir.model.Location l = new  main.java.com.campfhir.model.Location();

		/******************** id ********************************************************************************/
		location.setId(l.getId());

		/******************** Lctn_Nm ********************************************************************************/
		if(location.hasName()) {
			l.setLctnNm(String.valueOf(location.getName()));
		}
		/******************** locationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address locationaddress = location.getAddress();

		/******************** Lctn_Addr_State ********************************************************************************/
		if(locationaddress.hasState()) {
			l.setLctnAddrState(String.valueOf(locationaddress.getState()));
		}
		/******************** locationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType locationaddresstype = locationaddress.getType();
		l.setLctnAddrTyp(locationaddresstype.toCode());

		/******************** Lctn_Addr_Cntry ********************************************************************************/
		if(locationaddress.hasCountry()) {
			l.setLctnAddrCntry(String.valueOf(locationaddress.getCountry()));
		}
		/******************** locationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period locationaddressperiod = locationaddress.getPeriod();

		/******************** Lctn_Addr_Prd_Strt ********************************************************************************/
		if(locationaddressperiod.hasStart()) {
			l.setLctnAddrPrdStrt(String.valueOf(locationaddressperiod.getStart()));
		}
		/******************** Lctn_Addr_Prd_End ********************************************************************************/
		if(locationaddressperiod.hasEnd()) {
			l.setLctnAddrPrdEnd(String.valueOf(locationaddressperiod.getEnd()));
		}
		/******************** Lctn_Addr_Txt ********************************************************************************/
		if(locationaddress.hasText()) {
			l.setLctnAddrTxt(String.valueOf(locationaddress.getText()));
		}
		/******************** locationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse locationaddressuse = locationaddress.getUse();
		l.setLctnAddrUse(locationaddressuse.toCode());

		/******************** Lctn_Addr_City ********************************************************************************/
		if(locationaddress.hasCity()) {
			l.setLctnAddrCity(String.valueOf(locationaddress.getCity()));
		}
		/******************** Lctn_Addr_District ********************************************************************************/
		if(locationaddress.hasDistrict()) {
			l.setLctnAddrDistrict(String.valueOf(locationaddress.getDistrict()));
		}
		/******************** Lctn_Addr_PostalCd ********************************************************************************/
		if(locationaddress.hasPostalCode()) {
			l.setLctnAddrPostalCd(String.valueOf(locationaddress.getPostalCode()));
		}
		/******************** locationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept locationtype = location.getTypeFirstRep();

		/******************** Lctn_Typ_Txt ********************************************************************************/
		if(locationtype.hasText()) {
			l.setLctnTypTxt(String.valueOf(locationtype.getText()));
		}
		/******************** locationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding locationtypecoding = locationtype.getCodingFirstRep();

		/******************** Lctn_Typ_Cdg_Vrsn ********************************************************************************/
		if(locationtypecoding.hasVersion()) {
			l.setLctnTypCdgVrsn(String.valueOf(locationtypecoding.getVersion()));
		}
		/******************** Lctn_Typ_Cdg_Dsply ********************************************************************************/
		if(locationtypecoding.hasDisplay()) {
			l.setLctnTypCdgDsply(String.valueOf(locationtypecoding.getDisplay()));
		}
		/******************** Lctn_Typ_Cdg_Cd ********************************************************************************/
		if(locationtypecoding.hasCode()) {
			l.setLctnTypCdgCd(String.valueOf(locationtypecoding.getCode()));
		}
		/******************** Lctn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(locationtypecoding.hasUserSelected()) {
			l.setLctnTypCdgUsrSltd(String.valueOf(locationtypecoding.getUserSelected()));
		}
		/******************** Lctn_Typ_Cdg_Sys ********************************************************************************/
		if(locationtypecoding.hasSystem()) {
			l.setLctnTypCdgSys(String.valueOf(locationtypecoding.getSystem()));
		}
		/******************** Lctn_PartOf ********************************************************************************/
		if(location.hasPartOf()) {
			l.setLctnPartOf(String.valueOf(location.getPartOf()));
		}
		/******************** locationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Location.LocationStatus locationstatus = location.getStatus();
		l.setLctnSts(locationstatus.toCode());

		/******************** Lctn_Dscrptn ********************************************************************************/
		if(location.hasDescription()) {
			l.setLctnDscrptn(String.valueOf(location.getDescription()));
		}
		/******************** locationphysicaltype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept locationphysicaltype = location.getPhysicalType();

		/******************** Lctn_PhysclTyp_Txt ********************************************************************************/
		if(locationphysicaltype.hasText()) {
			l.setLctnPhysclTypTxt(String.valueOf(locationphysicaltype.getText()));
		}
		/******************** locationphysicaltypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding locationphysicaltypecoding = locationphysicaltype.getCodingFirstRep();

		/******************** Lctn_PhysclTyp_Cdg_Vrsn ********************************************************************************/
		if(locationphysicaltypecoding.hasVersion()) {
			l.setLctnPhysclTypCdgVrsn(String.valueOf(locationphysicaltypecoding.getVersion()));
		}
		/******************** Lctn_PhysclTyp_Cdg_Dsply ********************************************************************************/
		if(locationphysicaltypecoding.hasDisplay()) {
			l.setLctnPhysclTypCdgDsply(String.valueOf(locationphysicaltypecoding.getDisplay()));
		}
		/******************** Lctn_PhysclTyp_Cdg_Cd ********************************************************************************/
		if(locationphysicaltypecoding.hasCode()) {
			l.setLctnPhysclTypCdgCd(String.valueOf(locationphysicaltypecoding.getCode()));
		}
		/******************** Lctn_PhysclTyp_Cdg_UsrSltd ********************************************************************************/
		if(locationphysicaltypecoding.hasUserSelected()) {
			l.setLctnPhysclTypCdgUsrSltd(String.valueOf(locationphysicaltypecoding.getUserSelected()));
		}
		/******************** Lctn_PhysclTyp_Cdg_Sys ********************************************************************************/
		if(locationphysicaltypecoding.hasSystem()) {
			l.setLctnPhysclTypCdgSys(String.valueOf(locationphysicaltypecoding.getSystem()));
		}
		/******************** locationposition ********************************************************************************/
		org.hl7.fhir.r4.model.Location.LocationPositionComponent locationposition = location.getPosition();

		/******************** Lctn_Position_Latitude ********************************************************************************/
		if(locationposition.hasLatitude()) {
			l.setLctnPositionLatitude(String.valueOf(locationposition.getLatitude()));
		}
		/******************** Lctn_Position_Longitude ********************************************************************************/
		if(locationposition.hasLongitude()) {
			l.setLctnPositionLongitude(String.valueOf(locationposition.getLongitude()));
		}
		/******************** Lctn_Position_Altitude ********************************************************************************/
		if(locationposition.hasAltitude()) {
			l.setLctnPositionAltitude(String.valueOf(locationposition.getAltitude()));
		}
		/******************** locationmode ********************************************************************************/
		org.hl7.fhir.r4.model.Location.LocationMode locationmode = location.getMode();
		l.setLctnMode(locationmode.toCode());

		/******************** locationhoursofoperation ********************************************************************************/
		org.hl7.fhir.r4.model.Location.LocationHoursOfOperationComponent locationhoursofoperation = location.getHoursOfOperationFirstRep();

		/******************** Lctn_HoursOfOprtn_OpeningTime ********************************************************************************/
		if(locationhoursofoperation.hasOpeningTime()) {
			l.setLctnHoursOfOprtnOpeningTime(String.valueOf(locationhoursofoperation.getOpeningTime()));
		}
		/******************** Lctn_HoursOfOprtn_ClosingTime ********************************************************************************/
		if(locationhoursofoperation.hasClosingTime()) {
			l.setLctnHoursOfOprtnClosingTime(String.valueOf(locationhoursofoperation.getClosingTime()));
		}
		/******************** Lctn_HoursOfOprtn_AllDay ********************************************************************************/
		if(locationhoursofoperation.hasAllDay()) {
			l.setLctnHoursOfOprtnAllDay(String.valueOf(locationhoursofoperation.getAllDay()));
		}
		/******************** locationtelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint locationtelecom = location.getTelecomFirstRep();

		/******************** Lctn_Tlcm_Vl ********************************************************************************/
		if(locationtelecom.hasValue()) {
			l.setLctnTlcmVl(String.valueOf(locationtelecom.getValue()));
		}
		/******************** locationtelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period locationtelecomperiod = locationtelecom.getPeriod();

		/******************** Lctn_Tlcm_Prd_Strt ********************************************************************************/
		if(locationtelecomperiod.hasStart()) {
			l.setLctnTlcmPrdStrt(String.valueOf(locationtelecomperiod.getStart()));
		}
		/******************** Lctn_Tlcm_Prd_End ********************************************************************************/
		if(locationtelecomperiod.hasEnd()) {
			l.setLctnTlcmPrdEnd(String.valueOf(locationtelecomperiod.getEnd()));
		}
		/******************** locationtelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem locationtelecomsystem = locationtelecom.getSystem();
		l.setLctnTlcmSys(locationtelecomsystem.toCode());

		/******************** locationtelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse locationtelecomuse = locationtelecom.getUse();
		l.setLctnTlcmUse(locationtelecomuse.toCode());

		/******************** Lctn_Tlcm_Rnk ********************************************************************************/
		if(locationtelecom.hasRank()) {
			l.setLctnTlcmRnk(String.valueOf(locationtelecom.getRank()));
		}
		/******************** locationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier locationidentifier = location.getIdentifierFirstRep();

		/******************** Lctn_Id_Vl ********************************************************************************/
		if(locationidentifier.hasValue()) {
			l.setLctnIdVl(String.valueOf(locationidentifier.getValue()));
		}
		/******************** locationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept locationidentifiertype = locationidentifier.getType();

		/******************** Lctn_Id_Typ_Txt ********************************************************************************/
		if(locationidentifiertype.hasText()) {
			l.setLctnIdTypTxt(String.valueOf(locationidentifiertype.getText()));
		}
		/******************** locationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding locationidentifiertypecoding = locationidentifiertype.getCodingFirstRep();

		/******************** Lctn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(locationidentifiertypecoding.hasVersion()) {
			l.setLctnIdTypCdgVrsn(String.valueOf(locationidentifiertypecoding.getVersion()));
		}
		/******************** Lctn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(locationidentifiertypecoding.hasDisplay()) {
			l.setLctnIdTypCdgDsply(String.valueOf(locationidentifiertypecoding.getDisplay()));
		}
		/******************** Lctn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(locationidentifiertypecoding.hasCode()) {
			l.setLctnIdTypCdgCd(String.valueOf(locationidentifiertypecoding.getCode()));
		}
		/******************** Lctn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(locationidentifiertypecoding.hasUserSelected()) {
			l.setLctnIdTypCdgUsrSltd(String.valueOf(locationidentifiertypecoding.getUserSelected()));
		}
		/******************** Lctn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(locationidentifiertypecoding.hasSystem()) {
			l.setLctnIdTypCdgSys(String.valueOf(locationidentifiertypecoding.getSystem()));
		}
		/******************** locationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period locationidentifierperiod = locationidentifier.getPeriod();

		/******************** Lctn_Id_Prd_Strt ********************************************************************************/
		if(locationidentifierperiod.hasStart()) {
			l.setLctnIdPrdStrt(String.valueOf(locationidentifierperiod.getStart()));
		}
		/******************** Lctn_Id_Prd_End ********************************************************************************/
		if(locationidentifierperiod.hasEnd()) {
			l.setLctnIdPrdEnd(String.valueOf(locationidentifierperiod.getEnd()));
		}
		/******************** Lctn_Id_Assigner ********************************************************************************/
		if(locationidentifier.hasAssigner()) {
			l.setLctnIdAssigner(String.valueOf(locationidentifier.getAssigner()));
		}
		/******************** Lctn_Id_Sys ********************************************************************************/
		if(locationidentifier.hasSystem()) {
			l.setLctnIdSys(String.valueOf(locationidentifier.getSystem()));
		}
		/******************** locationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse locationidentifieruse = locationidentifier.getUse();
		l.setLctnIdUse(locationidentifieruse.toCode());

		/******************** Lctn_Endpoint ********************************************************************************/
		if(location.hasEndpoint()) {
			l.setLctnEndpoint(String.valueOf(location.getEndpointFirstRep()));
		}
		/******************** Lctn_ManagingOrgnztn ********************************************************************************/
		if(location.hasManagingOrganization()) {
			l.setLctnManagingOrgnztn(String.valueOf(location.getManagingOrganization()));
		}
		/******************** locationoperationalstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Coding locationoperationalstatus = location.getOperationalStatus();

		/******************** Lctn_OprtnalSts_Vrsn ********************************************************************************/
		if(locationoperationalstatus.hasVersion()) {
			l.setLctnOprtnalStsVrsn(String.valueOf(locationoperationalstatus.getVersion()));
		}
		/******************** Lctn_OprtnalSts_Dsply ********************************************************************************/
		if(locationoperationalstatus.hasDisplay()) {
			l.setLctnOprtnalStsDsply(String.valueOf(locationoperationalstatus.getDisplay()));
		}
		/******************** Lctn_OprtnalSts_Cd ********************************************************************************/
		if(locationoperationalstatus.hasCode()) {
			l.setLctnOprtnalStsCd(String.valueOf(locationoperationalstatus.getCode()));
		}
		/******************** Lctn_OprtnalSts_UsrSltd ********************************************************************************/
		if(locationoperationalstatus.hasUserSelected()) {
			l.setLctnOprtnalStsUsrSltd(String.valueOf(locationoperationalstatus.getUserSelected()));
		}
		/******************** Lctn_OprtnalSts_Sys ********************************************************************************/
		if(locationoperationalstatus.hasSystem()) {
			l.setLctnOprtnalStsSys(String.valueOf(locationoperationalstatus.getSystem()));
		}
		/******************** Lctn_AvailabilityExceptions ********************************************************************************/
		if(location.hasAvailabilityExceptions()) {
			l.setLctnAvailabilityExceptions(String.valueOf(location.getAvailabilityExceptions()));
		}
		return l;
	}
}
