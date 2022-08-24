package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Location;
public class LocationBidirectionalConversion 
{
	public Location Locations(org.hl7.fhir.r4.model.Location location) throws ParseException
	{
		 main.java.com.campfhir.model.Location l = new  main.java.com.campfhir.model.Location();

		/******************** id ********************************************************************************/
		l.setId(location.getIdElement().getIdPart());

		/******************** Lctn_Nm ********************************************************************************/
		if(location.hasName()) {

			l.addLctnNm(String.valueOf(location.getName()));
		} else {
			l.addLctnNm("NULL");
		}


		/******************** locationtype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> locationtypelist = location.getType();
		for(int locationtypei = 0; locationtypei<locationtypelist.size();locationtypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  locationtype = locationtypelist.get(locationtypei);

		/******************** Lctn_Typ_Txt ********************************************************************************/
		if(locationtypei == 0) {l.addLctnTypTxt("[");}
		if(locationtype.hasText()) {

			l.addLctnTypTxt(String.valueOf(locationtype.getText()));
		} else {
			l.addLctnTypTxt("NULL");
		}

		if(locationtypei == locationtypelist.size()-1) {l.addLctnTypTxt("]");}


		/******************** locationtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> locationtypecodinglist = locationtype.getCoding();
		for(int locationtypecodingi = 0; locationtypecodingi<locationtypecodinglist.size();locationtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  locationtypecoding = locationtypecodinglist.get(locationtypecodingi);

		/******************** Lctn_Typ_Cdg_Dsply ********************************************************************************/
		if(locationtypecodingi == 0) {l.addLctnTypCdgDsply("[[");}
		if(locationtypecoding.hasDisplay()) {

			l.addLctnTypCdgDsply(String.valueOf(locationtypecoding.getDisplay()));
		} else {
			l.addLctnTypCdgDsply("NULL");
		}

		if(locationtypecodingi == locationtypecodinglist.size()-1) {l.addLctnTypCdgDsply("]]");}


		/******************** Lctn_Typ_Cdg_Vrsn ********************************************************************************/
		if(locationtypecodingi == 0) {l.addLctnTypCdgVrsn("[[");}
		if(locationtypecoding.hasVersion()) {

			l.addLctnTypCdgVrsn(String.valueOf(locationtypecoding.getVersion()));
		} else {
			l.addLctnTypCdgVrsn("NULL");
		}

		if(locationtypecodingi == locationtypecodinglist.size()-1) {l.addLctnTypCdgVrsn("]]");}


		/******************** Lctn_Typ_Cdg_Cd ********************************************************************************/
		if(locationtypecodingi == 0) {l.addLctnTypCdgCd("[[");}
		if(locationtypecoding.hasCode()) {

			l.addLctnTypCdgCd(String.valueOf(locationtypecoding.getCode()));
		} else {
			l.addLctnTypCdgCd("NULL");
		}

		if(locationtypecodingi == locationtypecodinglist.size()-1) {l.addLctnTypCdgCd("]]");}


		/******************** Lctn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(locationtypecodingi == 0) {l.addLctnTypCdgUsrSltd("[[");}
		if(locationtypecoding.hasUserSelected()) {

			l.addLctnTypCdgUsrSltd(String.valueOf(locationtypecoding.getUserSelected()));
		} else {
			l.addLctnTypCdgUsrSltd("NULL");
		}

		if(locationtypecodingi == locationtypecodinglist.size()-1) {l.addLctnTypCdgUsrSltd("]]");}


		/******************** Lctn_Typ_Cdg_Sys ********************************************************************************/
		if(locationtypecodingi == 0) {l.addLctnTypCdgSys("[[");}
		if(locationtypecoding.hasSystem()) {

			l.addLctnTypCdgSys(String.valueOf(locationtypecoding.getSystem()));
		} else {
			l.addLctnTypCdgSys("NULL");
		}

		if(locationtypecodingi == locationtypecodinglist.size()-1) {l.addLctnTypCdgSys("]]");}


		 };
		 };
		/******************** locationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address locationaddress = location.getAddress();

		/******************** Lctn_Addr_State ********************************************************************************/
		if(locationaddress.hasState()) {

			l.addLctnAddrState(String.valueOf(locationaddress.getState()));
		} else {
			l.addLctnAddrState("NULL");
		}


		/******************** locationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType locationaddresstype = locationaddress.getType();
		if(locationaddresstype!=null) {
			l.addLctnAddrTyp(locationaddresstype.toCode());
		} else {
			l.addLctnAddrTyp("NULL");
		}

		/******************** Lctn_Addr_Cntry ********************************************************************************/
		if(locationaddress.hasCountry()) {

			l.addLctnAddrCntry(String.valueOf(locationaddress.getCountry()));
		} else {
			l.addLctnAddrCntry("NULL");
		}


		/******************** locationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period locationaddressperiod = locationaddress.getPeriod();

		/******************** Lctn_Addr_Prd_Strt ********************************************************************************/
		if(locationaddressperiod.hasStart()) {

			l.addLctnAddrPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(locationaddressperiod.getStart())+"\"");
		} else {
			l.addLctnAddrPrdStrt("NULL");
		}


		/******************** Lctn_Addr_Prd_End ********************************************************************************/
		if(locationaddressperiod.hasEnd()) {

			l.addLctnAddrPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(locationaddressperiod.getEnd())+"\"");
		} else {
			l.addLctnAddrPrdEnd("NULL");
		}


		/******************** Lctn_Addr_District ********************************************************************************/
		if(locationaddress.hasDistrict()) {

			l.addLctnAddrDistrict(String.valueOf(locationaddress.getDistrict()));
		} else {
			l.addLctnAddrDistrict("NULL");
		}


		/******************** Lctn_Addr_PostalCd ********************************************************************************/
		if(locationaddress.hasPostalCode()) {

			l.addLctnAddrPostalCd(String.valueOf(locationaddress.getPostalCode()));
		} else {
			l.addLctnAddrPostalCd("NULL");
		}


		/******************** Lctn_Addr_Line ********************************************************************************/
		if(locationaddress.hasLine()) {

			String  array = "[";
			for(int incr=0; incr<locationaddress.getLine().size(); incr++) {
				array = array + locationaddress.getLine().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			l.addLctnAddrLine(array);

		} else {
			l.addLctnAddrLine("NULL");
		}


		/******************** Lctn_Addr_City ********************************************************************************/
		if(locationaddress.hasCity()) {

			l.addLctnAddrCity(String.valueOf(locationaddress.getCity()));
		} else {
			l.addLctnAddrCity("NULL");
		}


		/******************** locationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse locationaddressuse = locationaddress.getUse();
		if(locationaddressuse!=null) {
			l.addLctnAddrUse(locationaddressuse.toCode());
		} else {
			l.addLctnAddrUse("NULL");
		}

		/******************** Lctn_Addr_Txt ********************************************************************************/
		if(locationaddress.hasText()) {

			l.addLctnAddrTxt(String.valueOf(locationaddress.getText()));
		} else {
			l.addLctnAddrTxt("NULL");
		}


		/******************** locationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Location.LocationStatus locationstatus = location.getStatus();
		if(locationstatus!=null) {
			l.addLctnSts(locationstatus.toCode());
		} else {
			l.addLctnSts("NULL");
		}

		/******************** Lctn_Endpoint ********************************************************************************/
		if(location.hasEndpoint()) {

			String  array = "[";
			for(int incr=0; incr<location.getEndpoint().size(); incr++) {
				array = array + location.getEndpoint().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			l.addLctnEndpoint(array);

		} else {
			l.addLctnEndpoint("NULL");
		}


		/******************** Lctn_Dscrptn ********************************************************************************/
		if(location.hasDescription()) {

			l.addLctnDscrptn(String.valueOf(location.getDescription()));
		} else {
			l.addLctnDscrptn("NULL");
		}


		/******************** locationidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> locationidentifierlist = location.getIdentifier();
		for(int locationidentifieri = 0; locationidentifieri<locationidentifierlist.size();locationidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  locationidentifier = locationidentifierlist.get(locationidentifieri);

		/******************** Lctn_Id_Vl ********************************************************************************/
		if(locationidentifieri == 0) {l.addLctnIdVl("[");}
		if(locationidentifier.hasValue()) {

			l.addLctnIdVl(String.valueOf(locationidentifier.getValue()));
		} else {
			l.addLctnIdVl("NULL");
		}

		if(locationidentifieri == locationidentifierlist.size()-1) {l.addLctnIdVl("]");}


		/******************** locationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept locationidentifiertype = locationidentifier.getType();

		/******************** Lctn_Id_Typ_Txt ********************************************************************************/
		if(locationidentifieri == 0) {l.addLctnIdTypTxt("[");}
		if(locationidentifiertype.hasText()) {

			l.addLctnIdTypTxt(String.valueOf(locationidentifiertype.getText()));
		} else {
			l.addLctnIdTypTxt("NULL");
		}

		if(locationidentifieri == locationidentifierlist.size()-1) {l.addLctnIdTypTxt("]");}


		/******************** locationidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> locationidentifiertypecodinglist = locationidentifiertype.getCoding();
		for(int locationidentifiertypecodingi = 0; locationidentifiertypecodingi<locationidentifiertypecodinglist.size();locationidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  locationidentifiertypecoding = locationidentifiertypecodinglist.get(locationidentifiertypecodingi);

		/******************** Lctn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(locationidentifiertypecodingi == 0) {l.addLctnIdTypCdgDsply("[[");}
		if(locationidentifiertypecoding.hasDisplay()) {

			l.addLctnIdTypCdgDsply(String.valueOf(locationidentifiertypecoding.getDisplay()));
		} else {
			l.addLctnIdTypCdgDsply("NULL");
		}

		if(locationidentifiertypecodingi == locationidentifiertypecodinglist.size()-1) {l.addLctnIdTypCdgDsply("]]");}


		/******************** Lctn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(locationidentifiertypecodingi == 0) {l.addLctnIdTypCdgVrsn("[[");}
		if(locationidentifiertypecoding.hasVersion()) {

			l.addLctnIdTypCdgVrsn(String.valueOf(locationidentifiertypecoding.getVersion()));
		} else {
			l.addLctnIdTypCdgVrsn("NULL");
		}

		if(locationidentifiertypecodingi == locationidentifiertypecodinglist.size()-1) {l.addLctnIdTypCdgVrsn("]]");}


		/******************** Lctn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(locationidentifiertypecodingi == 0) {l.addLctnIdTypCdgCd("[[");}
		if(locationidentifiertypecoding.hasCode()) {

			l.addLctnIdTypCdgCd(String.valueOf(locationidentifiertypecoding.getCode()));
		} else {
			l.addLctnIdTypCdgCd("NULL");
		}

		if(locationidentifiertypecodingi == locationidentifiertypecodinglist.size()-1) {l.addLctnIdTypCdgCd("]]");}


		/******************** Lctn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(locationidentifiertypecodingi == 0) {l.addLctnIdTypCdgUsrSltd("[[");}
		if(locationidentifiertypecoding.hasUserSelected()) {

			l.addLctnIdTypCdgUsrSltd(String.valueOf(locationidentifiertypecoding.getUserSelected()));
		} else {
			l.addLctnIdTypCdgUsrSltd("NULL");
		}

		if(locationidentifiertypecodingi == locationidentifiertypecodinglist.size()-1) {l.addLctnIdTypCdgUsrSltd("]]");}


		/******************** Lctn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(locationidentifiertypecodingi == 0) {l.addLctnIdTypCdgSys("[[");}
		if(locationidentifiertypecoding.hasSystem()) {

			l.addLctnIdTypCdgSys(String.valueOf(locationidentifiertypecoding.getSystem()));
		} else {
			l.addLctnIdTypCdgSys("NULL");
		}

		if(locationidentifiertypecodingi == locationidentifiertypecodinglist.size()-1) {l.addLctnIdTypCdgSys("]]");}


		 };
		/******************** locationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period locationidentifierperiod = locationidentifier.getPeriod();

		/******************** Lctn_Id_Prd_Strt ********************************************************************************/
		if(locationidentifieri == 0) {l.addLctnIdPrdStrt("[");}
		if(locationidentifierperiod.hasStart()) {

			l.addLctnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(locationidentifierperiod.getStart())+"\"");
		} else {
			l.addLctnIdPrdStrt("NULL");
		}

		if(locationidentifieri == locationidentifierlist.size()-1) {l.addLctnIdPrdStrt("]");}


		/******************** Lctn_Id_Prd_End ********************************************************************************/
		if(locationidentifieri == 0) {l.addLctnIdPrdEnd("[");}
		if(locationidentifierperiod.hasEnd()) {

			l.addLctnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(locationidentifierperiod.getEnd())+"\"");
		} else {
			l.addLctnIdPrdEnd("NULL");
		}

		if(locationidentifieri == locationidentifierlist.size()-1) {l.addLctnIdPrdEnd("]");}


		/******************** locationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse locationidentifieruse = locationidentifier.getUse();
		if(locationidentifieruse!=null) {
		if(locationidentifieri == 0) {

		l.addLctnIdUse("[");		}
			l.addLctnIdUse(locationidentifieruse.toCode());
		if(locationidentifieri == locationidentifierlist.size()-1) {

		l.addLctnIdUse("]");		}

		} else {
			l.addLctnIdUse("NULL");
		}

		/******************** Lctn_Id_Assigner ********************************************************************************/
		if(locationidentifieri == 0) {l.addLctnIdAssigner("[");}
		if(locationidentifier.hasAssigner()) {

			if(locationidentifier.getAssigner().getReference() != null) {
			l.addLctnIdAssigner(locationidentifier.getAssigner().getReference());
			}
		} else {
			l.addLctnIdAssigner("NULL");
		}

		if(locationidentifieri == locationidentifierlist.size()-1) {l.addLctnIdAssigner("]");}


		/******************** Lctn_Id_Sys ********************************************************************************/
		if(locationidentifieri == 0) {l.addLctnIdSys("[");}
		if(locationidentifier.hasSystem()) {

			l.addLctnIdSys(String.valueOf(locationidentifier.getSystem()));
		} else {
			l.addLctnIdSys("NULL");
		}

		if(locationidentifieri == locationidentifierlist.size()-1) {l.addLctnIdSys("]");}


		 };
		/******************** locationoperationalstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Coding locationoperationalstatus = location.getOperationalStatus();

		/******************** Lctn_OprtnalSts_Dsply ********************************************************************************/
		if(locationoperationalstatus.hasDisplay()) {

			l.addLctnOprtnalStsDsply(String.valueOf(locationoperationalstatus.getDisplay()));
		} else {
			l.addLctnOprtnalStsDsply("NULL");
		}


		/******************** Lctn_OprtnalSts_Vrsn ********************************************************************************/
		if(locationoperationalstatus.hasVersion()) {

			l.addLctnOprtnalStsVrsn(String.valueOf(locationoperationalstatus.getVersion()));
		} else {
			l.addLctnOprtnalStsVrsn("NULL");
		}


		/******************** Lctn_OprtnalSts_Cd ********************************************************************************/
		if(locationoperationalstatus.hasCode()) {

			l.addLctnOprtnalStsCd(String.valueOf(locationoperationalstatus.getCode()));
		} else {
			l.addLctnOprtnalStsCd("NULL");
		}


		/******************** Lctn_OprtnalSts_UsrSltd ********************************************************************************/
		if(locationoperationalstatus.hasUserSelected()) {

			l.addLctnOprtnalStsUsrSltd(String.valueOf(locationoperationalstatus.getUserSelected()));
		} else {
			l.addLctnOprtnalStsUsrSltd("NULL");
		}


		/******************** Lctn_OprtnalSts_Sys ********************************************************************************/
		if(locationoperationalstatus.hasSystem()) {

			l.addLctnOprtnalStsSys(String.valueOf(locationoperationalstatus.getSystem()));
		} else {
			l.addLctnOprtnalStsSys("NULL");
		}


		/******************** locationposition ********************************************************************************/
		org.hl7.fhir.r4.model.Location.LocationPositionComponent locationposition = location.getPosition();

		/******************** Lctn_Position_Longitude ********************************************************************************/
		if(locationposition.hasLongitude()) {

			l.addLctnPositionLongitude(String.valueOf(locationposition.getLongitude()));
		} else {
			l.addLctnPositionLongitude("NULL");
		}


		/******************** Lctn_Position_Latitude ********************************************************************************/
		if(locationposition.hasLatitude()) {

			l.addLctnPositionLatitude(String.valueOf(locationposition.getLatitude()));
		} else {
			l.addLctnPositionLatitude("NULL");
		}


		/******************** Lctn_Position_Altitude ********************************************************************************/
		if(locationposition.hasAltitude()) {

			l.addLctnPositionAltitude(String.valueOf(locationposition.getAltitude()));
		} else {
			l.addLctnPositionAltitude("NULL");
		}


		/******************** locationphysicaltype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept locationphysicaltype = location.getPhysicalType();

		/******************** Lctn_PhysclTyp_Txt ********************************************************************************/
		if(locationphysicaltype.hasText()) {

			l.addLctnPhysclTypTxt(String.valueOf(locationphysicaltype.getText()));
		} else {
			l.addLctnPhysclTypTxt("NULL");
		}


		/******************** locationphysicaltypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> locationphysicaltypecodinglist = locationphysicaltype.getCoding();
		for(int locationphysicaltypecodingi = 0; locationphysicaltypecodingi<locationphysicaltypecodinglist.size();locationphysicaltypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  locationphysicaltypecoding = locationphysicaltypecodinglist.get(locationphysicaltypecodingi);

		/******************** Lctn_PhysclTyp_Cdg_Dsply ********************************************************************************/
		if(locationphysicaltypecodingi == 0) {l.addLctnPhysclTypCdgDsply("[");}
		if(locationphysicaltypecoding.hasDisplay()) {

			l.addLctnPhysclTypCdgDsply(String.valueOf(locationphysicaltypecoding.getDisplay()));
		} else {
			l.addLctnPhysclTypCdgDsply("NULL");
		}

		if(locationphysicaltypecodingi == locationphysicaltypecodinglist.size()-1) {l.addLctnPhysclTypCdgDsply("]");}


		/******************** Lctn_PhysclTyp_Cdg_Vrsn ********************************************************************************/
		if(locationphysicaltypecodingi == 0) {l.addLctnPhysclTypCdgVrsn("[");}
		if(locationphysicaltypecoding.hasVersion()) {

			l.addLctnPhysclTypCdgVrsn(String.valueOf(locationphysicaltypecoding.getVersion()));
		} else {
			l.addLctnPhysclTypCdgVrsn("NULL");
		}

		if(locationphysicaltypecodingi == locationphysicaltypecodinglist.size()-1) {l.addLctnPhysclTypCdgVrsn("]");}


		/******************** Lctn_PhysclTyp_Cdg_Cd ********************************************************************************/
		if(locationphysicaltypecodingi == 0) {l.addLctnPhysclTypCdgCd("[");}
		if(locationphysicaltypecoding.hasCode()) {

			l.addLctnPhysclTypCdgCd(String.valueOf(locationphysicaltypecoding.getCode()));
		} else {
			l.addLctnPhysclTypCdgCd("NULL");
		}

		if(locationphysicaltypecodingi == locationphysicaltypecodinglist.size()-1) {l.addLctnPhysclTypCdgCd("]");}


		/******************** Lctn_PhysclTyp_Cdg_UsrSltd ********************************************************************************/
		if(locationphysicaltypecodingi == 0) {l.addLctnPhysclTypCdgUsrSltd("[");}
		if(locationphysicaltypecoding.hasUserSelected()) {

			l.addLctnPhysclTypCdgUsrSltd(String.valueOf(locationphysicaltypecoding.getUserSelected()));
		} else {
			l.addLctnPhysclTypCdgUsrSltd("NULL");
		}

		if(locationphysicaltypecodingi == locationphysicaltypecodinglist.size()-1) {l.addLctnPhysclTypCdgUsrSltd("]");}


		/******************** Lctn_PhysclTyp_Cdg_Sys ********************************************************************************/
		if(locationphysicaltypecodingi == 0) {l.addLctnPhysclTypCdgSys("[");}
		if(locationphysicaltypecoding.hasSystem()) {

			l.addLctnPhysclTypCdgSys(String.valueOf(locationphysicaltypecoding.getSystem()));
		} else {
			l.addLctnPhysclTypCdgSys("NULL");
		}

		if(locationphysicaltypecodingi == locationphysicaltypecodinglist.size()-1) {l.addLctnPhysclTypCdgSys("]");}


		 };
		/******************** locationmode ********************************************************************************/
		org.hl7.fhir.r4.model.Location.LocationMode locationmode = location.getMode();
		if(locationmode!=null) {
			l.addLctnMode(locationmode.toCode());
		} else {
			l.addLctnMode("NULL");
		}

		/******************** locationhoursofoperation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Location.LocationHoursOfOperationComponent> locationhoursofoperationlist = location.getHoursOfOperation();
		for(int locationhoursofoperationi = 0; locationhoursofoperationi<locationhoursofoperationlist.size();locationhoursofoperationi++ ) {
		org.hl7.fhir.r4.model.Location.LocationHoursOfOperationComponent  locationhoursofoperation = locationhoursofoperationlist.get(locationhoursofoperationi);

		/******************** Lctn_HoursOfOprtn_OpeningTime ********************************************************************************/
		if(locationhoursofoperationi == 0) {l.addLctnHoursOfOprtnOpeningTime("[");}
		if(locationhoursofoperation.hasOpeningTime()) {

			l.addLctnHoursOfOprtnOpeningTime(String.valueOf(locationhoursofoperation.getOpeningTime()));
		} else {
			l.addLctnHoursOfOprtnOpeningTime("NULL");
		}

		if(locationhoursofoperationi == locationhoursofoperationlist.size()-1) {l.addLctnHoursOfOprtnOpeningTime("]");}


		/******************** Lctn_HoursOfOprtn_ClosingTime ********************************************************************************/
		if(locationhoursofoperationi == 0) {l.addLctnHoursOfOprtnClosingTime("[");}
		if(locationhoursofoperation.hasClosingTime()) {

			l.addLctnHoursOfOprtnClosingTime(String.valueOf(locationhoursofoperation.getClosingTime()));
		} else {
			l.addLctnHoursOfOprtnClosingTime("NULL");
		}

		if(locationhoursofoperationi == locationhoursofoperationlist.size()-1) {l.addLctnHoursOfOprtnClosingTime("]");}


		/******************** Lctn_HoursOfOprtn_AllDay ********************************************************************************/
		if(locationhoursofoperationi == 0) {l.addLctnHoursOfOprtnAllDay("[");}
		if(locationhoursofoperation.hasAllDay()) {

			l.addLctnHoursOfOprtnAllDay(String.valueOf(locationhoursofoperation.getAllDay()));
		} else {
			l.addLctnHoursOfOprtnAllDay("NULL");
		}

		if(locationhoursofoperationi == locationhoursofoperationlist.size()-1) {l.addLctnHoursOfOprtnAllDay("]");}


		/******************** locationhoursofoperationdaysofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Location.DaysOfWeek>> locationhoursofoperationdaysofweeklist = locationhoursofoperation.getDaysOfWeek();
		for(int locationhoursofoperationdaysofweeki = 0; locationhoursofoperationdaysofweeki<locationhoursofoperationdaysofweeklist.size();locationhoursofoperationdaysofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Location.DaysOfWeek>  locationhoursofoperationdaysofweek = locationhoursofoperationdaysofweeklist.get(locationhoursofoperationdaysofweeki);
		if(locationhoursofoperationdaysofweek!=null) {
			l.addLctnHoursOfOprtnDaysOfWeek(locationhoursofoperationdaysofweek.getCode());
		} else {
			l.addLctnHoursOfOprtnDaysOfWeek("NULL");
		}
		 };

		 };
		/******************** Lctn_AvailabilityExceptions ********************************************************************************/
		if(location.hasAvailabilityExceptions()) {

			l.addLctnAvailabilityExceptions(String.valueOf(location.getAvailabilityExceptions()));
		} else {
			l.addLctnAvailabilityExceptions("NULL");
		}


		/******************** locationtelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> locationtelecomlist = location.getTelecom();
		for(int locationtelecomi = 0; locationtelecomi<locationtelecomlist.size();locationtelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  locationtelecom = locationtelecomlist.get(locationtelecomi);

		/******************** Lctn_Tlcm_Vl ********************************************************************************/
		if(locationtelecomi == 0) {l.addLctnTlcmVl("[");}
		if(locationtelecom.hasValue()) {

			l.addLctnTlcmVl(String.valueOf(locationtelecom.getValue()));
		} else {
			l.addLctnTlcmVl("NULL");
		}

		if(locationtelecomi == locationtelecomlist.size()-1) {l.addLctnTlcmVl("]");}


		/******************** locationtelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period locationtelecomperiod = locationtelecom.getPeriod();

		/******************** Lctn_Tlcm_Prd_Strt ********************************************************************************/
		if(locationtelecomi == 0) {l.addLctnTlcmPrdStrt("[");}
		if(locationtelecomperiod.hasStart()) {

			l.addLctnTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(locationtelecomperiod.getStart())+"\"");
		} else {
			l.addLctnTlcmPrdStrt("NULL");
		}

		if(locationtelecomi == locationtelecomlist.size()-1) {l.addLctnTlcmPrdStrt("]");}


		/******************** Lctn_Tlcm_Prd_End ********************************************************************************/
		if(locationtelecomi == 0) {l.addLctnTlcmPrdEnd("[");}
		if(locationtelecomperiod.hasEnd()) {

			l.addLctnTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(locationtelecomperiod.getEnd())+"\"");
		} else {
			l.addLctnTlcmPrdEnd("NULL");
		}

		if(locationtelecomi == locationtelecomlist.size()-1) {l.addLctnTlcmPrdEnd("]");}


		/******************** locationtelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse locationtelecomuse = locationtelecom.getUse();
		if(locationtelecomuse!=null) {
		if(locationtelecomi == 0) {

		l.addLctnTlcmUse("[");		}
			l.addLctnTlcmUse(locationtelecomuse.toCode());
		if(locationtelecomi == locationtelecomlist.size()-1) {

		l.addLctnTlcmUse("]");		}

		} else {
			l.addLctnTlcmUse("NULL");
		}

		/******************** locationtelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem locationtelecomsystem = locationtelecom.getSystem();
		if(locationtelecomsystem!=null) {
		if(locationtelecomi == 0) {

		l.addLctnTlcmSys("[");		}
			l.addLctnTlcmSys(locationtelecomsystem.toCode());
		if(locationtelecomi == locationtelecomlist.size()-1) {

		l.addLctnTlcmSys("]");		}

		} else {
			l.addLctnTlcmSys("NULL");
		}

		/******************** Lctn_Tlcm_Rnk ********************************************************************************/
		if(locationtelecomi == 0) {l.addLctnTlcmRnk("[");}
		if(locationtelecom.hasRank()) {

			l.addLctnTlcmRnk(String.valueOf(locationtelecom.getRank()));
		} else {
			l.addLctnTlcmRnk("NULL");
		}

		if(locationtelecomi == locationtelecomlist.size()-1) {l.addLctnTlcmRnk("]");}


		 };
		/******************** Lctn_Alias ********************************************************************************/
		if(location.hasAlias()) {

			String  array = "[";
			for(int incr=0; incr<location.getAlias().size(); incr++) {
				array = array + location.getAlias().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			l.addLctnAlias(array);

		} else {
			l.addLctnAlias("NULL");
		}


		/******************** Lctn_ManagingOrgnztn ********************************************************************************/
		if(location.hasManagingOrganization()) {

			if(location.getManagingOrganization().getReference() != null) {
			l.addLctnManagingOrgnztn(location.getManagingOrganization().getReference());
			}
		} else {
			l.addLctnManagingOrgnztn("NULL");
		}


		/******************** Lctn_PartOf ********************************************************************************/
		if(location.hasPartOf()) {

			if(location.getPartOf().getReference() != null) {
			l.addLctnPartOf(location.getPartOf().getReference());
			}
		} else {
			l.addLctnPartOf("NULL");
		}


		return l;
	}
}
