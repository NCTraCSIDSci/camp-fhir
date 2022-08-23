package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.HealthcareService;
public class HealthcareServiceBidirectionalConversion 
{
	public HealthcareService HealthcareServices(org.hl7.fhir.r4.model.HealthcareService healthcareservice) throws ParseException
	{
		 main.java.com.campfhir.model.HealthcareService h = new  main.java.com.campfhir.model.HealthcareService();

		/******************** id ********************************************************************************/
		h.setId(healthcareservice.getIdElement().getIdPart());

		/******************** HlthcrSrv_Nm ********************************************************************************/
		if(healthcareservice.hasName()) {

			h.addHlthcrSrvNm(String.valueOf(healthcareservice.getName()));
		} else {
			h.addHlthcrSrvNm("NULL");
		}


		/******************** HlthcrSrv_Lctn ********************************************************************************/
		if(healthcareservice.hasLocation()) {

			String  array = "[";
			for(int incr=0; incr<healthcareservice.getLocation().size(); incr++) {
				array = array + healthcareservice.getLocation().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			h.addHlthcrSrvLctn(array);

		} else {
			h.addHlthcrSrvLctn("NULL");
		}


		/******************** healthcareservicetype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> healthcareservicetypelist = healthcareservice.getType();
		for(int healthcareservicetypei = 0; healthcareservicetypei<healthcareservicetypelist.size();healthcareservicetypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  healthcareservicetype = healthcareservicetypelist.get(healthcareservicetypei);

		/******************** HlthcrSrv_Typ_Txt ********************************************************************************/
		if(healthcareservicetypei == 0) {h.addHlthcrSrvTypTxt("[");}
		if(healthcareservicetype.hasText()) {

			h.addHlthcrSrvTypTxt(String.valueOf(healthcareservicetype.getText()));
		} else {
			h.addHlthcrSrvTypTxt("NULL");
		}

		if(healthcareservicetypei == healthcareservicetypelist.size()-1) {h.addHlthcrSrvTypTxt("]");}


		/******************** healthcareservicetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> healthcareservicetypecodinglist = healthcareservicetype.getCoding();
		for(int healthcareservicetypecodingi = 0; healthcareservicetypecodingi<healthcareservicetypecodinglist.size();healthcareservicetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  healthcareservicetypecoding = healthcareservicetypecodinglist.get(healthcareservicetypecodingi);

		/******************** HlthcrSrv_Typ_Cdg_Dsply ********************************************************************************/
		if(healthcareservicetypecodingi == 0) {h.addHlthcrSrvTypCdgDsply("[[");}
		if(healthcareservicetypecoding.hasDisplay()) {

			h.addHlthcrSrvTypCdgDsply(String.valueOf(healthcareservicetypecoding.getDisplay()));
		} else {
			h.addHlthcrSrvTypCdgDsply("NULL");
		}

		if(healthcareservicetypecodingi == healthcareservicetypecodinglist.size()-1) {h.addHlthcrSrvTypCdgDsply("]]");}


		/******************** HlthcrSrv_Typ_Cdg_Vrsn ********************************************************************************/
		if(healthcareservicetypecodingi == 0) {h.addHlthcrSrvTypCdgVrsn("[[");}
		if(healthcareservicetypecoding.hasVersion()) {

			h.addHlthcrSrvTypCdgVrsn(String.valueOf(healthcareservicetypecoding.getVersion()));
		} else {
			h.addHlthcrSrvTypCdgVrsn("NULL");
		}

		if(healthcareservicetypecodingi == healthcareservicetypecodinglist.size()-1) {h.addHlthcrSrvTypCdgVrsn("]]");}


		/******************** HlthcrSrv_Typ_Cdg_Cd ********************************************************************************/
		if(healthcareservicetypecodingi == 0) {h.addHlthcrSrvTypCdgCd("[[");}
		if(healthcareservicetypecoding.hasCode()) {

			h.addHlthcrSrvTypCdgCd(String.valueOf(healthcareservicetypecoding.getCode()));
		} else {
			h.addHlthcrSrvTypCdgCd("NULL");
		}

		if(healthcareservicetypecodingi == healthcareservicetypecodinglist.size()-1) {h.addHlthcrSrvTypCdgCd("]]");}


		/******************** HlthcrSrv_Typ_Cdg_UsrSltd ********************************************************************************/
		if(healthcareservicetypecodingi == 0) {h.addHlthcrSrvTypCdgUsrSltd("[[");}
		if(healthcareservicetypecoding.hasUserSelected()) {

			h.addHlthcrSrvTypCdgUsrSltd(String.valueOf(healthcareservicetypecoding.getUserSelected()));
		} else {
			h.addHlthcrSrvTypCdgUsrSltd("NULL");
		}

		if(healthcareservicetypecodingi == healthcareservicetypecodinglist.size()-1) {h.addHlthcrSrvTypCdgUsrSltd("]]");}


		/******************** HlthcrSrv_Typ_Cdg_Sys ********************************************************************************/
		if(healthcareservicetypecodingi == 0) {h.addHlthcrSrvTypCdgSys("[[");}
		if(healthcareservicetypecoding.hasSystem()) {

			h.addHlthcrSrvTypCdgSys(String.valueOf(healthcareservicetypecoding.getSystem()));
		} else {
			h.addHlthcrSrvTypCdgSys("NULL");
		}

		if(healthcareservicetypecodingi == healthcareservicetypecodinglist.size()-1) {h.addHlthcrSrvTypCdgSys("]]");}


		 };
		 };
		/******************** HlthcrSrv_Comment ********************************************************************************/
		if(healthcareservice.hasComment()) {

			h.addHlthcrSrvComment(String.valueOf(healthcareservice.getComment()));
		} else {
			h.addHlthcrSrvComment("NULL");
		}


		/******************** HlthcrSrv_Endpoint ********************************************************************************/
		if(healthcareservice.hasEndpoint()) {

			String  array = "[";
			for(int incr=0; incr<healthcareservice.getEndpoint().size(); incr++) {
				array = array + healthcareservice.getEndpoint().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			h.addHlthcrSrvEndpoint(array);

		} else {
			h.addHlthcrSrvEndpoint("NULL");
		}


		/******************** healthcareserviceidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> healthcareserviceidentifierlist = healthcareservice.getIdentifier();
		for(int healthcareserviceidentifieri = 0; healthcareserviceidentifieri<healthcareserviceidentifierlist.size();healthcareserviceidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  healthcareserviceidentifier = healthcareserviceidentifierlist.get(healthcareserviceidentifieri);

		/******************** HlthcrSrv_Id_Vl ********************************************************************************/
		if(healthcareserviceidentifieri == 0) {h.addHlthcrSrvIdVl("[");}
		if(healthcareserviceidentifier.hasValue()) {

			h.addHlthcrSrvIdVl(String.valueOf(healthcareserviceidentifier.getValue()));
		} else {
			h.addHlthcrSrvIdVl("NULL");
		}

		if(healthcareserviceidentifieri == healthcareserviceidentifierlist.size()-1) {h.addHlthcrSrvIdVl("]");}


		/******************** healthcareserviceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareserviceidentifiertype = healthcareserviceidentifier.getType();

		/******************** HlthcrSrv_Id_Typ_Txt ********************************************************************************/
		if(healthcareserviceidentifieri == 0) {h.addHlthcrSrvIdTypTxt("[");}
		if(healthcareserviceidentifiertype.hasText()) {

			h.addHlthcrSrvIdTypTxt(String.valueOf(healthcareserviceidentifiertype.getText()));
		} else {
			h.addHlthcrSrvIdTypTxt("NULL");
		}

		if(healthcareserviceidentifieri == healthcareserviceidentifierlist.size()-1) {h.addHlthcrSrvIdTypTxt("]");}


		/******************** healthcareserviceidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> healthcareserviceidentifiertypecodinglist = healthcareserviceidentifiertype.getCoding();
		for(int healthcareserviceidentifiertypecodingi = 0; healthcareserviceidentifiertypecodingi<healthcareserviceidentifiertypecodinglist.size();healthcareserviceidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  healthcareserviceidentifiertypecoding = healthcareserviceidentifiertypecodinglist.get(healthcareserviceidentifiertypecodingi);

		/******************** HlthcrSrv_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(healthcareserviceidentifiertypecodingi == 0) {h.addHlthcrSrvIdTypCdgDsply("[[");}
		if(healthcareserviceidentifiertypecoding.hasDisplay()) {

			h.addHlthcrSrvIdTypCdgDsply(String.valueOf(healthcareserviceidentifiertypecoding.getDisplay()));
		} else {
			h.addHlthcrSrvIdTypCdgDsply("NULL");
		}

		if(healthcareserviceidentifiertypecodingi == healthcareserviceidentifiertypecodinglist.size()-1) {h.addHlthcrSrvIdTypCdgDsply("]]");}


		/******************** HlthcrSrv_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(healthcareserviceidentifiertypecodingi == 0) {h.addHlthcrSrvIdTypCdgVrsn("[[");}
		if(healthcareserviceidentifiertypecoding.hasVersion()) {

			h.addHlthcrSrvIdTypCdgVrsn(String.valueOf(healthcareserviceidentifiertypecoding.getVersion()));
		} else {
			h.addHlthcrSrvIdTypCdgVrsn("NULL");
		}

		if(healthcareserviceidentifiertypecodingi == healthcareserviceidentifiertypecodinglist.size()-1) {h.addHlthcrSrvIdTypCdgVrsn("]]");}


		/******************** HlthcrSrv_Id_Typ_Cdg_Cd ********************************************************************************/
		if(healthcareserviceidentifiertypecodingi == 0) {h.addHlthcrSrvIdTypCdgCd("[[");}
		if(healthcareserviceidentifiertypecoding.hasCode()) {

			h.addHlthcrSrvIdTypCdgCd(String.valueOf(healthcareserviceidentifiertypecoding.getCode()));
		} else {
			h.addHlthcrSrvIdTypCdgCd("NULL");
		}

		if(healthcareserviceidentifiertypecodingi == healthcareserviceidentifiertypecodinglist.size()-1) {h.addHlthcrSrvIdTypCdgCd("]]");}


		/******************** HlthcrSrv_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(healthcareserviceidentifiertypecodingi == 0) {h.addHlthcrSrvIdTypCdgUsrSltd("[[");}
		if(healthcareserviceidentifiertypecoding.hasUserSelected()) {

			h.addHlthcrSrvIdTypCdgUsrSltd(String.valueOf(healthcareserviceidentifiertypecoding.getUserSelected()));
		} else {
			h.addHlthcrSrvIdTypCdgUsrSltd("NULL");
		}

		if(healthcareserviceidentifiertypecodingi == healthcareserviceidentifiertypecodinglist.size()-1) {h.addHlthcrSrvIdTypCdgUsrSltd("]]");}


		/******************** HlthcrSrv_Id_Typ_Cdg_Sys ********************************************************************************/
		if(healthcareserviceidentifiertypecodingi == 0) {h.addHlthcrSrvIdTypCdgSys("[[");}
		if(healthcareserviceidentifiertypecoding.hasSystem()) {

			h.addHlthcrSrvIdTypCdgSys(String.valueOf(healthcareserviceidentifiertypecoding.getSystem()));
		} else {
			h.addHlthcrSrvIdTypCdgSys("NULL");
		}

		if(healthcareserviceidentifiertypecodingi == healthcareserviceidentifiertypecodinglist.size()-1) {h.addHlthcrSrvIdTypCdgSys("]]");}


		 };
		/******************** healthcareserviceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period healthcareserviceidentifierperiod = healthcareserviceidentifier.getPeriod();

		/******************** HlthcrSrv_Id_Prd_Strt ********************************************************************************/
		if(healthcareserviceidentifieri == 0) {h.addHlthcrSrvIdPrdStrt("[");}
		if(healthcareserviceidentifierperiod.hasStart()) {

			h.addHlthcrSrvIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(healthcareserviceidentifierperiod.getStart())+"\"");
		} else {
			h.addHlthcrSrvIdPrdStrt("NULL");
		}

		if(healthcareserviceidentifieri == healthcareserviceidentifierlist.size()-1) {h.addHlthcrSrvIdPrdStrt("]");}


		/******************** HlthcrSrv_Id_Prd_End ********************************************************************************/
		if(healthcareserviceidentifieri == 0) {h.addHlthcrSrvIdPrdEnd("[");}
		if(healthcareserviceidentifierperiod.hasEnd()) {

			h.addHlthcrSrvIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(healthcareserviceidentifierperiod.getEnd())+"\"");
		} else {
			h.addHlthcrSrvIdPrdEnd("NULL");
		}

		if(healthcareserviceidentifieri == healthcareserviceidentifierlist.size()-1) {h.addHlthcrSrvIdPrdEnd("]");}


		/******************** healthcareserviceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse healthcareserviceidentifieruse = healthcareserviceidentifier.getUse();
		if(healthcareserviceidentifieruse!=null) {
		if(healthcareserviceidentifieri == 0) {

		h.addHlthcrSrvIdUse("[");		}
			h.addHlthcrSrvIdUse(healthcareserviceidentifieruse.toCode());
		if(healthcareserviceidentifieri == healthcareserviceidentifierlist.size()-1) {

		h.addHlthcrSrvIdUse("]");		}

		} else {
			h.addHlthcrSrvIdUse("NULL");
		}

		/******************** HlthcrSrv_Id_Assigner ********************************************************************************/
		if(healthcareserviceidentifieri == 0) {h.addHlthcrSrvIdAssigner("[");}
		if(healthcareserviceidentifier.hasAssigner()) {

			if(healthcareserviceidentifier.getAssigner().getReference() != null) {
			h.addHlthcrSrvIdAssigner(healthcareserviceidentifier.getAssigner().getReference());
			}
		} else {
			h.addHlthcrSrvIdAssigner("NULL");
		}

		if(healthcareserviceidentifieri == healthcareserviceidentifierlist.size()-1) {h.addHlthcrSrvIdAssigner("]");}


		/******************** HlthcrSrv_Id_Sys ********************************************************************************/
		if(healthcareserviceidentifieri == 0) {h.addHlthcrSrvIdSys("[");}
		if(healthcareserviceidentifier.hasSystem()) {

			h.addHlthcrSrvIdSys(String.valueOf(healthcareserviceidentifier.getSystem()));
		} else {
			h.addHlthcrSrvIdSys("NULL");
		}

		if(healthcareserviceidentifieri == healthcareserviceidentifierlist.size()-1) {h.addHlthcrSrvIdSys("]");}


		 };
		/******************** healthcareservicecategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> healthcareservicecategorylist = healthcareservice.getCategory();
		for(int healthcareservicecategoryi = 0; healthcareservicecategoryi<healthcareservicecategorylist.size();healthcareservicecategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  healthcareservicecategory = healthcareservicecategorylist.get(healthcareservicecategoryi);

		/******************** HlthcrSrv_Ctgry_Txt ********************************************************************************/
		if(healthcareservicecategoryi == 0) {h.addHlthcrSrvCtgryTxt("[");}
		if(healthcareservicecategory.hasText()) {

			h.addHlthcrSrvCtgryTxt(String.valueOf(healthcareservicecategory.getText()));
		} else {
			h.addHlthcrSrvCtgryTxt("NULL");
		}

		if(healthcareservicecategoryi == healthcareservicecategorylist.size()-1) {h.addHlthcrSrvCtgryTxt("]");}


		/******************** healthcareservicecategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> healthcareservicecategorycodinglist = healthcareservicecategory.getCoding();
		for(int healthcareservicecategorycodingi = 0; healthcareservicecategorycodingi<healthcareservicecategorycodinglist.size();healthcareservicecategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  healthcareservicecategorycoding = healthcareservicecategorycodinglist.get(healthcareservicecategorycodingi);

		/******************** HlthcrSrv_Ctgry_Cdg_Dsply ********************************************************************************/
		if(healthcareservicecategorycodingi == 0) {h.addHlthcrSrvCtgryCdgDsply("[[");}
		if(healthcareservicecategorycoding.hasDisplay()) {

			h.addHlthcrSrvCtgryCdgDsply(String.valueOf(healthcareservicecategorycoding.getDisplay()));
		} else {
			h.addHlthcrSrvCtgryCdgDsply("NULL");
		}

		if(healthcareservicecategorycodingi == healthcareservicecategorycodinglist.size()-1) {h.addHlthcrSrvCtgryCdgDsply("]]");}


		/******************** HlthcrSrv_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(healthcareservicecategorycodingi == 0) {h.addHlthcrSrvCtgryCdgVrsn("[[");}
		if(healthcareservicecategorycoding.hasVersion()) {

			h.addHlthcrSrvCtgryCdgVrsn(String.valueOf(healthcareservicecategorycoding.getVersion()));
		} else {
			h.addHlthcrSrvCtgryCdgVrsn("NULL");
		}

		if(healthcareservicecategorycodingi == healthcareservicecategorycodinglist.size()-1) {h.addHlthcrSrvCtgryCdgVrsn("]]");}


		/******************** HlthcrSrv_Ctgry_Cdg_Cd ********************************************************************************/
		if(healthcareservicecategorycodingi == 0) {h.addHlthcrSrvCtgryCdgCd("[[");}
		if(healthcareservicecategorycoding.hasCode()) {

			h.addHlthcrSrvCtgryCdgCd(String.valueOf(healthcareservicecategorycoding.getCode()));
		} else {
			h.addHlthcrSrvCtgryCdgCd("NULL");
		}

		if(healthcareservicecategorycodingi == healthcareservicecategorycodinglist.size()-1) {h.addHlthcrSrvCtgryCdgCd("]]");}


		/******************** HlthcrSrv_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(healthcareservicecategorycodingi == 0) {h.addHlthcrSrvCtgryCdgUsrSltd("[[");}
		if(healthcareservicecategorycoding.hasUserSelected()) {

			h.addHlthcrSrvCtgryCdgUsrSltd(String.valueOf(healthcareservicecategorycoding.getUserSelected()));
		} else {
			h.addHlthcrSrvCtgryCdgUsrSltd("NULL");
		}

		if(healthcareservicecategorycodingi == healthcareservicecategorycodinglist.size()-1) {h.addHlthcrSrvCtgryCdgUsrSltd("]]");}


		/******************** HlthcrSrv_Ctgry_Cdg_Sys ********************************************************************************/
		if(healthcareservicecategorycodingi == 0) {h.addHlthcrSrvCtgryCdgSys("[[");}
		if(healthcareservicecategorycoding.hasSystem()) {

			h.addHlthcrSrvCtgryCdgSys(String.valueOf(healthcareservicecategorycoding.getSystem()));
		} else {
			h.addHlthcrSrvCtgryCdgSys("NULL");
		}

		if(healthcareservicecategorycodingi == healthcareservicecategorycodinglist.size()-1) {h.addHlthcrSrvCtgryCdgSys("]]");}


		 };
		 };
		/******************** healthcareserviceavailabletime ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceAvailableTimeComponent> healthcareserviceavailabletimelist = healthcareservice.getAvailableTime();
		for(int healthcareserviceavailabletimei = 0; healthcareserviceavailabletimei<healthcareserviceavailabletimelist.size();healthcareserviceavailabletimei++ ) {
		org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceAvailableTimeComponent  healthcareserviceavailabletime = healthcareserviceavailabletimelist.get(healthcareserviceavailabletimei);

		/******************** HlthcrSrv_AvailableTime_AllDay ********************************************************************************/
		if(healthcareserviceavailabletimei == 0) {h.addHlthcrSrvAvailableTimeAllDay("[");}
		if(healthcareserviceavailabletime.hasAllDay()) {

			h.addHlthcrSrvAvailableTimeAllDay(String.valueOf(healthcareserviceavailabletime.getAllDay()));
		} else {
			h.addHlthcrSrvAvailableTimeAllDay("NULL");
		}

		if(healthcareserviceavailabletimei == healthcareserviceavailabletimelist.size()-1) {h.addHlthcrSrvAvailableTimeAllDay("]");}


		/******************** healthcareserviceavailabletimedaysofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.HealthcareService.DaysOfWeek>> healthcareserviceavailabletimedaysofweeklist = healthcareserviceavailabletime.getDaysOfWeek();
		for(int healthcareserviceavailabletimedaysofweeki = 0; healthcareserviceavailabletimedaysofweeki<healthcareserviceavailabletimedaysofweeklist.size();healthcareserviceavailabletimedaysofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.HealthcareService.DaysOfWeek>  healthcareserviceavailabletimedaysofweek = healthcareserviceavailabletimedaysofweeklist.get(healthcareserviceavailabletimedaysofweeki);
		if(healthcareserviceavailabletimedaysofweek!=null) {
			h.addHlthcrSrvAvailableTimeDaysOfWeek(healthcareserviceavailabletimedaysofweek.getCode());
		} else {
			h.addHlthcrSrvAvailableTimeDaysOfWeek("NULL");
		}
		 };

		/******************** HlthcrSrv_AvailableTime_AvailableEndTime ********************************************************************************/
		if(healthcareserviceavailabletime.hasAvailableEndTime()) {

			h.addHlthcrSrvAvailableTimeAvailableEndTime(String.valueOf(healthcareserviceavailabletime.getAvailableEndTime()));
		} else {
			h.addHlthcrSrvAvailableTimeAvailableEndTime("NULL");
		}


		/******************** HlthcrSrv_AvailableTime_AvailableStrtTime ********************************************************************************/
		if(healthcareserviceavailabletime.hasAvailableStartTime()) {

			h.addHlthcrSrvAvailableTimeAvailableStrtTime(String.valueOf(healthcareserviceavailabletime.getAvailableStartTime()));
		} else {
			h.addHlthcrSrvAvailableTimeAvailableStrtTime("NULL");
		}


		 };
		/******************** healthcareservicenotavailable ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceNotAvailableComponent> healthcareservicenotavailablelist = healthcareservice.getNotAvailable();
		for(int healthcareservicenotavailablei = 0; healthcareservicenotavailablei<healthcareservicenotavailablelist.size();healthcareservicenotavailablei++ ) {
		org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceNotAvailableComponent  healthcareservicenotavailable = healthcareservicenotavailablelist.get(healthcareservicenotavailablei);

		/******************** HlthcrSrv_NotAvailable_Dscrptn ********************************************************************************/
		if(healthcareservicenotavailablei == 0) {h.addHlthcrSrvNotAvailableDscrptn("[");}
		if(healthcareservicenotavailable.hasDescription()) {

			h.addHlthcrSrvNotAvailableDscrptn(String.valueOf(healthcareservicenotavailable.getDescription()));
		} else {
			h.addHlthcrSrvNotAvailableDscrptn("NULL");
		}

		if(healthcareservicenotavailablei == healthcareservicenotavailablelist.size()-1) {h.addHlthcrSrvNotAvailableDscrptn("]");}


		/******************** healthcareservicenotavailableduring ********************************************************************************/
		org.hl7.fhir.r4.model.Period healthcareservicenotavailableduring = healthcareservicenotavailable.getDuring();

		/******************** HlthcrSrv_NotAvailable_During_Strt ********************************************************************************/
		if(healthcareservicenotavailablei == 0) {h.addHlthcrSrvNotAvailableDuringStrt("[");}
		if(healthcareservicenotavailableduring.hasStart()) {

			h.addHlthcrSrvNotAvailableDuringStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(healthcareservicenotavailableduring.getStart())+"\"");
		} else {
			h.addHlthcrSrvNotAvailableDuringStrt("NULL");
		}

		if(healthcareservicenotavailablei == healthcareservicenotavailablelist.size()-1) {h.addHlthcrSrvNotAvailableDuringStrt("]");}


		/******************** HlthcrSrv_NotAvailable_During_End ********************************************************************************/
		if(healthcareservicenotavailablei == 0) {h.addHlthcrSrvNotAvailableDuringEnd("[");}
		if(healthcareservicenotavailableduring.hasEnd()) {

			h.addHlthcrSrvNotAvailableDuringEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(healthcareservicenotavailableduring.getEnd())+"\"");
		} else {
			h.addHlthcrSrvNotAvailableDuringEnd("NULL");
		}

		if(healthcareservicenotavailablei == healthcareservicenotavailablelist.size()-1) {h.addHlthcrSrvNotAvailableDuringEnd("]");}


		 };
		/******************** HlthcrSrv_AvailabilityExceptions ********************************************************************************/
		if(healthcareservice.hasAvailabilityExceptions()) {

			h.addHlthcrSrvAvailabilityExceptions(String.valueOf(healthcareservice.getAvailabilityExceptions()));
		} else {
			h.addHlthcrSrvAvailabilityExceptions("NULL");
		}


		/******************** healthcareserviceserviceprovisioncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> healthcareserviceserviceprovisioncodelist = healthcareservice.getServiceProvisionCode();
		for(int healthcareserviceserviceprovisioncodei = 0; healthcareserviceserviceprovisioncodei<healthcareserviceserviceprovisioncodelist.size();healthcareserviceserviceprovisioncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  healthcareserviceserviceprovisioncode = healthcareserviceserviceprovisioncodelist.get(healthcareserviceserviceprovisioncodei);

		/******************** HlthcrSrv_SrvProvisionCd_Txt ********************************************************************************/
		if(healthcareserviceserviceprovisioncodei == 0) {h.addHlthcrSrvSrvProvisionCdTxt("[");}
		if(healthcareserviceserviceprovisioncode.hasText()) {

			h.addHlthcrSrvSrvProvisionCdTxt(String.valueOf(healthcareserviceserviceprovisioncode.getText()));
		} else {
			h.addHlthcrSrvSrvProvisionCdTxt("NULL");
		}

		if(healthcareserviceserviceprovisioncodei == healthcareserviceserviceprovisioncodelist.size()-1) {h.addHlthcrSrvSrvProvisionCdTxt("]");}


		/******************** healthcareserviceserviceprovisioncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> healthcareserviceserviceprovisioncodecodinglist = healthcareserviceserviceprovisioncode.getCoding();
		for(int healthcareserviceserviceprovisioncodecodingi = 0; healthcareserviceserviceprovisioncodecodingi<healthcareserviceserviceprovisioncodecodinglist.size();healthcareserviceserviceprovisioncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  healthcareserviceserviceprovisioncodecoding = healthcareserviceserviceprovisioncodecodinglist.get(healthcareserviceserviceprovisioncodecodingi);

		/******************** HlthcrSrv_SrvProvisionCd_Cdg_Dsply ********************************************************************************/
		if(healthcareserviceserviceprovisioncodecodingi == 0) {h.addHlthcrSrvSrvProvisionCdCdgDsply("[[");}
		if(healthcareserviceserviceprovisioncodecoding.hasDisplay()) {

			h.addHlthcrSrvSrvProvisionCdCdgDsply(String.valueOf(healthcareserviceserviceprovisioncodecoding.getDisplay()));
		} else {
			h.addHlthcrSrvSrvProvisionCdCdgDsply("NULL");
		}

		if(healthcareserviceserviceprovisioncodecodingi == healthcareserviceserviceprovisioncodecodinglist.size()-1) {h.addHlthcrSrvSrvProvisionCdCdgDsply("]]");}


		/******************** HlthcrSrv_SrvProvisionCd_Cdg_Vrsn ********************************************************************************/
		if(healthcareserviceserviceprovisioncodecodingi == 0) {h.addHlthcrSrvSrvProvisionCdCdgVrsn("[[");}
		if(healthcareserviceserviceprovisioncodecoding.hasVersion()) {

			h.addHlthcrSrvSrvProvisionCdCdgVrsn(String.valueOf(healthcareserviceserviceprovisioncodecoding.getVersion()));
		} else {
			h.addHlthcrSrvSrvProvisionCdCdgVrsn("NULL");
		}

		if(healthcareserviceserviceprovisioncodecodingi == healthcareserviceserviceprovisioncodecodinglist.size()-1) {h.addHlthcrSrvSrvProvisionCdCdgVrsn("]]");}


		/******************** HlthcrSrv_SrvProvisionCd_Cdg_Cd ********************************************************************************/
		if(healthcareserviceserviceprovisioncodecodingi == 0) {h.addHlthcrSrvSrvProvisionCdCdgCd("[[");}
		if(healthcareserviceserviceprovisioncodecoding.hasCode()) {

			h.addHlthcrSrvSrvProvisionCdCdgCd(String.valueOf(healthcareserviceserviceprovisioncodecoding.getCode()));
		} else {
			h.addHlthcrSrvSrvProvisionCdCdgCd("NULL");
		}

		if(healthcareserviceserviceprovisioncodecodingi == healthcareserviceserviceprovisioncodecodinglist.size()-1) {h.addHlthcrSrvSrvProvisionCdCdgCd("]]");}


		/******************** HlthcrSrv_SrvProvisionCd_Cdg_UsrSltd ********************************************************************************/
		if(healthcareserviceserviceprovisioncodecodingi == 0) {h.addHlthcrSrvSrvProvisionCdCdgUsrSltd("[[");}
		if(healthcareserviceserviceprovisioncodecoding.hasUserSelected()) {

			h.addHlthcrSrvSrvProvisionCdCdgUsrSltd(String.valueOf(healthcareserviceserviceprovisioncodecoding.getUserSelected()));
		} else {
			h.addHlthcrSrvSrvProvisionCdCdgUsrSltd("NULL");
		}

		if(healthcareserviceserviceprovisioncodecodingi == healthcareserviceserviceprovisioncodecodinglist.size()-1) {h.addHlthcrSrvSrvProvisionCdCdgUsrSltd("]]");}


		/******************** HlthcrSrv_SrvProvisionCd_Cdg_Sys ********************************************************************************/
		if(healthcareserviceserviceprovisioncodecodingi == 0) {h.addHlthcrSrvSrvProvisionCdCdgSys("[[");}
		if(healthcareserviceserviceprovisioncodecoding.hasSystem()) {

			h.addHlthcrSrvSrvProvisionCdCdgSys(String.valueOf(healthcareserviceserviceprovisioncodecoding.getSystem()));
		} else {
			h.addHlthcrSrvSrvProvisionCdCdgSys("NULL");
		}

		if(healthcareserviceserviceprovisioncodecodingi == healthcareserviceserviceprovisioncodecodinglist.size()-1) {h.addHlthcrSrvSrvProvisionCdCdgSys("]]");}


		 };
		 };
		/******************** HlthcrSrv_AppmntRequired ********************************************************************************/
		if(healthcareservice.hasAppointmentRequired()) {

			h.addHlthcrSrvAppmntRequired(String.valueOf(healthcareservice.getAppointmentRequired()));
		} else {
			h.addHlthcrSrvAppmntRequired("NULL");
		}


		/******************** healthcareservicespecialty ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> healthcareservicespecialtylist = healthcareservice.getSpecialty();
		for(int healthcareservicespecialtyi = 0; healthcareservicespecialtyi<healthcareservicespecialtylist.size();healthcareservicespecialtyi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  healthcareservicespecialty = healthcareservicespecialtylist.get(healthcareservicespecialtyi);

		/******************** HlthcrSrv_Spclty_Txt ********************************************************************************/
		if(healthcareservicespecialtyi == 0) {h.addHlthcrSrvSpcltyTxt("[");}
		if(healthcareservicespecialty.hasText()) {

			h.addHlthcrSrvSpcltyTxt(String.valueOf(healthcareservicespecialty.getText()));
		} else {
			h.addHlthcrSrvSpcltyTxt("NULL");
		}

		if(healthcareservicespecialtyi == healthcareservicespecialtylist.size()-1) {h.addHlthcrSrvSpcltyTxt("]");}


		/******************** healthcareservicespecialtycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> healthcareservicespecialtycodinglist = healthcareservicespecialty.getCoding();
		for(int healthcareservicespecialtycodingi = 0; healthcareservicespecialtycodingi<healthcareservicespecialtycodinglist.size();healthcareservicespecialtycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  healthcareservicespecialtycoding = healthcareservicespecialtycodinglist.get(healthcareservicespecialtycodingi);

		/******************** HlthcrSrv_Spclty_Cdg_Dsply ********************************************************************************/
		if(healthcareservicespecialtycodingi == 0) {h.addHlthcrSrvSpcltyCdgDsply("[[");}
		if(healthcareservicespecialtycoding.hasDisplay()) {

			h.addHlthcrSrvSpcltyCdgDsply(String.valueOf(healthcareservicespecialtycoding.getDisplay()));
		} else {
			h.addHlthcrSrvSpcltyCdgDsply("NULL");
		}

		if(healthcareservicespecialtycodingi == healthcareservicespecialtycodinglist.size()-1) {h.addHlthcrSrvSpcltyCdgDsply("]]");}


		/******************** HlthcrSrv_Spclty_Cdg_Vrsn ********************************************************************************/
		if(healthcareservicespecialtycodingi == 0) {h.addHlthcrSrvSpcltyCdgVrsn("[[");}
		if(healthcareservicespecialtycoding.hasVersion()) {

			h.addHlthcrSrvSpcltyCdgVrsn(String.valueOf(healthcareservicespecialtycoding.getVersion()));
		} else {
			h.addHlthcrSrvSpcltyCdgVrsn("NULL");
		}

		if(healthcareservicespecialtycodingi == healthcareservicespecialtycodinglist.size()-1) {h.addHlthcrSrvSpcltyCdgVrsn("]]");}


		/******************** HlthcrSrv_Spclty_Cdg_Cd ********************************************************************************/
		if(healthcareservicespecialtycodingi == 0) {h.addHlthcrSrvSpcltyCdgCd("[[");}
		if(healthcareservicespecialtycoding.hasCode()) {

			h.addHlthcrSrvSpcltyCdgCd(String.valueOf(healthcareservicespecialtycoding.getCode()));
		} else {
			h.addHlthcrSrvSpcltyCdgCd("NULL");
		}

		if(healthcareservicespecialtycodingi == healthcareservicespecialtycodinglist.size()-1) {h.addHlthcrSrvSpcltyCdgCd("]]");}


		/******************** HlthcrSrv_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(healthcareservicespecialtycodingi == 0) {h.addHlthcrSrvSpcltyCdgUsrSltd("[[");}
		if(healthcareservicespecialtycoding.hasUserSelected()) {

			h.addHlthcrSrvSpcltyCdgUsrSltd(String.valueOf(healthcareservicespecialtycoding.getUserSelected()));
		} else {
			h.addHlthcrSrvSpcltyCdgUsrSltd("NULL");
		}

		if(healthcareservicespecialtycodingi == healthcareservicespecialtycodinglist.size()-1) {h.addHlthcrSrvSpcltyCdgUsrSltd("]]");}


		/******************** HlthcrSrv_Spclty_Cdg_Sys ********************************************************************************/
		if(healthcareservicespecialtycodingi == 0) {h.addHlthcrSrvSpcltyCdgSys("[[");}
		if(healthcareservicespecialtycoding.hasSystem()) {

			h.addHlthcrSrvSpcltyCdgSys(String.valueOf(healthcareservicespecialtycoding.getSystem()));
		} else {
			h.addHlthcrSrvSpcltyCdgSys("NULL");
		}

		if(healthcareservicespecialtycodingi == healthcareservicespecialtycodinglist.size()-1) {h.addHlthcrSrvSpcltyCdgSys("]]");}


		 };
		 };
		/******************** HlthcrSrv_Active ********************************************************************************/
		if(healthcareservice.hasActive()) {

			h.addHlthcrSrvActive(String.valueOf(healthcareservice.getActive()));
		} else {
			h.addHlthcrSrvActive("NULL");
		}


		/******************** healthcareservicephoto ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment healthcareservicephoto = healthcareservice.getPhoto();

		/******************** HlthcrSrv_Photo_Sz ********************************************************************************/
		if(healthcareservicephoto.hasSize()) {

			h.addHlthcrSrvPhotoSz(String.valueOf(healthcareservicephoto.getSize()));
		} else {
			h.addHlthcrSrvPhotoSz("NULL");
		}


		/******************** HlthcrSrv_Photo_Lnguage ********************************************************************************/
		if(healthcareservicephoto.hasLanguage()) {

			h.addHlthcrSrvPhotoLnguage(String.valueOf(healthcareservicephoto.getLanguage()));
		} else {
			h.addHlthcrSrvPhotoLnguage("NULL");
		}


		/******************** HlthcrSrv_Photo_CntntTyp ********************************************************************************/
		if(healthcareservicephoto.hasContentType()) {

			h.addHlthcrSrvPhotoCntntTyp(String.valueOf(healthcareservicephoto.getContentType()));
		} else {
			h.addHlthcrSrvPhotoCntntTyp("NULL");
		}


		/******************** HlthcrSrv_Photo_Hash ********************************************************************************/
		if(healthcareservicephoto.hasHash()) {

			h.addHlthcrSrvPhotoHash(new String(healthcareservicephoto.getHash()));
		} else {
			h.addHlthcrSrvPhotoHash("NULL");
		}


		/******************** HlthcrSrv_Photo_Data ********************************************************************************/
		if(healthcareservicephoto.hasData()) {

			h.addHlthcrSrvPhotoData(new String(healthcareservicephoto.getData()));
		} else {
			h.addHlthcrSrvPhotoData("NULL");
		}


		/******************** HlthcrSrv_Photo_Creation ********************************************************************************/
		if(healthcareservicephoto.hasCreation()) {

			h.addHlthcrSrvPhotoCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(healthcareservicephoto.getCreation())+"\"");
		} else {
			h.addHlthcrSrvPhotoCreation("NULL");
		}


		/******************** HlthcrSrv_Photo_Ttl ********************************************************************************/
		if(healthcareservicephoto.hasTitle()) {

			h.addHlthcrSrvPhotoTtl(String.valueOf(healthcareservicephoto.getTitle()));
		} else {
			h.addHlthcrSrvPhotoTtl("NULL");
		}


		/******************** HlthcrSrv_Photo_Url ********************************************************************************/
		if(healthcareservicephoto.hasUrl()) {

			h.addHlthcrSrvPhotoUrl(String.valueOf(healthcareservicephoto.getUrl()));
		} else {
			h.addHlthcrSrvPhotoUrl("NULL");
		}


		/******************** healthcareservicetelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> healthcareservicetelecomlist = healthcareservice.getTelecom();
		for(int healthcareservicetelecomi = 0; healthcareservicetelecomi<healthcareservicetelecomlist.size();healthcareservicetelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  healthcareservicetelecom = healthcareservicetelecomlist.get(healthcareservicetelecomi);

		/******************** HlthcrSrv_Tlcm_Vl ********************************************************************************/
		if(healthcareservicetelecomi == 0) {h.addHlthcrSrvTlcmVl("[");}
		if(healthcareservicetelecom.hasValue()) {

			h.addHlthcrSrvTlcmVl(String.valueOf(healthcareservicetelecom.getValue()));
		} else {
			h.addHlthcrSrvTlcmVl("NULL");
		}

		if(healthcareservicetelecomi == healthcareservicetelecomlist.size()-1) {h.addHlthcrSrvTlcmVl("]");}


		/******************** healthcareservicetelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period healthcareservicetelecomperiod = healthcareservicetelecom.getPeriod();

		/******************** HlthcrSrv_Tlcm_Prd_Strt ********************************************************************************/
		if(healthcareservicetelecomi == 0) {h.addHlthcrSrvTlcmPrdStrt("[");}
		if(healthcareservicetelecomperiod.hasStart()) {

			h.addHlthcrSrvTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(healthcareservicetelecomperiod.getStart())+"\"");
		} else {
			h.addHlthcrSrvTlcmPrdStrt("NULL");
		}

		if(healthcareservicetelecomi == healthcareservicetelecomlist.size()-1) {h.addHlthcrSrvTlcmPrdStrt("]");}


		/******************** HlthcrSrv_Tlcm_Prd_End ********************************************************************************/
		if(healthcareservicetelecomi == 0) {h.addHlthcrSrvTlcmPrdEnd("[");}
		if(healthcareservicetelecomperiod.hasEnd()) {

			h.addHlthcrSrvTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(healthcareservicetelecomperiod.getEnd())+"\"");
		} else {
			h.addHlthcrSrvTlcmPrdEnd("NULL");
		}

		if(healthcareservicetelecomi == healthcareservicetelecomlist.size()-1) {h.addHlthcrSrvTlcmPrdEnd("]");}


		/******************** healthcareservicetelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse healthcareservicetelecomuse = healthcareservicetelecom.getUse();
		if(healthcareservicetelecomuse!=null) {
		if(healthcareservicetelecomi == 0) {

		h.addHlthcrSrvTlcmUse("[");		}
			h.addHlthcrSrvTlcmUse(healthcareservicetelecomuse.toCode());
		if(healthcareservicetelecomi == healthcareservicetelecomlist.size()-1) {

		h.addHlthcrSrvTlcmUse("]");		}

		} else {
			h.addHlthcrSrvTlcmUse("NULL");
		}

		/******************** healthcareservicetelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem healthcareservicetelecomsystem = healthcareservicetelecom.getSystem();
		if(healthcareservicetelecomsystem!=null) {
		if(healthcareservicetelecomi == 0) {

		h.addHlthcrSrvTlcmSys("[");		}
			h.addHlthcrSrvTlcmSys(healthcareservicetelecomsystem.toCode());
		if(healthcareservicetelecomi == healthcareservicetelecomlist.size()-1) {

		h.addHlthcrSrvTlcmSys("]");		}

		} else {
			h.addHlthcrSrvTlcmSys("NULL");
		}

		/******************** HlthcrSrv_Tlcm_Rnk ********************************************************************************/
		if(healthcareservicetelecomi == 0) {h.addHlthcrSrvTlcmRnk("[");}
		if(healthcareservicetelecom.hasRank()) {

			h.addHlthcrSrvTlcmRnk(String.valueOf(healthcareservicetelecom.getRank()));
		} else {
			h.addHlthcrSrvTlcmRnk("NULL");
		}

		if(healthcareservicetelecomi == healthcareservicetelecomlist.size()-1) {h.addHlthcrSrvTlcmRnk("]");}


		 };
		/******************** healthcareservicecommunication ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> healthcareservicecommunicationlist = healthcareservice.getCommunication();
		for(int healthcareservicecommunicationi = 0; healthcareservicecommunicationi<healthcareservicecommunicationlist.size();healthcareservicecommunicationi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  healthcareservicecommunication = healthcareservicecommunicationlist.get(healthcareservicecommunicationi);

		/******************** HlthcrSrv_Cmmnctn_Txt ********************************************************************************/
		if(healthcareservicecommunicationi == 0) {h.addHlthcrSrvCmmnctnTxt("[");}
		if(healthcareservicecommunication.hasText()) {

			h.addHlthcrSrvCmmnctnTxt(String.valueOf(healthcareservicecommunication.getText()));
		} else {
			h.addHlthcrSrvCmmnctnTxt("NULL");
		}

		if(healthcareservicecommunicationi == healthcareservicecommunicationlist.size()-1) {h.addHlthcrSrvCmmnctnTxt("]");}


		/******************** healthcareservicecommunicationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> healthcareservicecommunicationcodinglist = healthcareservicecommunication.getCoding();
		for(int healthcareservicecommunicationcodingi = 0; healthcareservicecommunicationcodingi<healthcareservicecommunicationcodinglist.size();healthcareservicecommunicationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  healthcareservicecommunicationcoding = healthcareservicecommunicationcodinglist.get(healthcareservicecommunicationcodingi);

		/******************** HlthcrSrv_Cmmnctn_Cdg_Dsply ********************************************************************************/
		if(healthcareservicecommunicationcodingi == 0) {h.addHlthcrSrvCmmnctnCdgDsply("[[");}
		if(healthcareservicecommunicationcoding.hasDisplay()) {

			h.addHlthcrSrvCmmnctnCdgDsply(String.valueOf(healthcareservicecommunicationcoding.getDisplay()));
		} else {
			h.addHlthcrSrvCmmnctnCdgDsply("NULL");
		}

		if(healthcareservicecommunicationcodingi == healthcareservicecommunicationcodinglist.size()-1) {h.addHlthcrSrvCmmnctnCdgDsply("]]");}


		/******************** HlthcrSrv_Cmmnctn_Cdg_Vrsn ********************************************************************************/
		if(healthcareservicecommunicationcodingi == 0) {h.addHlthcrSrvCmmnctnCdgVrsn("[[");}
		if(healthcareservicecommunicationcoding.hasVersion()) {

			h.addHlthcrSrvCmmnctnCdgVrsn(String.valueOf(healthcareservicecommunicationcoding.getVersion()));
		} else {
			h.addHlthcrSrvCmmnctnCdgVrsn("NULL");
		}

		if(healthcareservicecommunicationcodingi == healthcareservicecommunicationcodinglist.size()-1) {h.addHlthcrSrvCmmnctnCdgVrsn("]]");}


		/******************** HlthcrSrv_Cmmnctn_Cdg_Cd ********************************************************************************/
		if(healthcareservicecommunicationcodingi == 0) {h.addHlthcrSrvCmmnctnCdgCd("[[");}
		if(healthcareservicecommunicationcoding.hasCode()) {

			h.addHlthcrSrvCmmnctnCdgCd(String.valueOf(healthcareservicecommunicationcoding.getCode()));
		} else {
			h.addHlthcrSrvCmmnctnCdgCd("NULL");
		}

		if(healthcareservicecommunicationcodingi == healthcareservicecommunicationcodinglist.size()-1) {h.addHlthcrSrvCmmnctnCdgCd("]]");}


		/******************** HlthcrSrv_Cmmnctn_Cdg_UsrSltd ********************************************************************************/
		if(healthcareservicecommunicationcodingi == 0) {h.addHlthcrSrvCmmnctnCdgUsrSltd("[[");}
		if(healthcareservicecommunicationcoding.hasUserSelected()) {

			h.addHlthcrSrvCmmnctnCdgUsrSltd(String.valueOf(healthcareservicecommunicationcoding.getUserSelected()));
		} else {
			h.addHlthcrSrvCmmnctnCdgUsrSltd("NULL");
		}

		if(healthcareservicecommunicationcodingi == healthcareservicecommunicationcodinglist.size()-1) {h.addHlthcrSrvCmmnctnCdgUsrSltd("]]");}


		/******************** HlthcrSrv_Cmmnctn_Cdg_Sys ********************************************************************************/
		if(healthcareservicecommunicationcodingi == 0) {h.addHlthcrSrvCmmnctnCdgSys("[[");}
		if(healthcareservicecommunicationcoding.hasSystem()) {

			h.addHlthcrSrvCmmnctnCdgSys(String.valueOf(healthcareservicecommunicationcoding.getSystem()));
		} else {
			h.addHlthcrSrvCmmnctnCdgSys("NULL");
		}

		if(healthcareservicecommunicationcodingi == healthcareservicecommunicationcodinglist.size()-1) {h.addHlthcrSrvCmmnctnCdgSys("]]");}


		 };
		 };
		/******************** HlthcrSrv_ProvidedBy ********************************************************************************/
		if(healthcareservice.hasProvidedBy()) {

			if(healthcareservice.getProvidedBy().getReference() != null) {
			h.addHlthcrSrvProvidedBy(healthcareservice.getProvidedBy().getReference());
			}
		} else {
			h.addHlthcrSrvProvidedBy("NULL");
		}


		/******************** HlthcrSrv_ExtraDtls ********************************************************************************/
		if(healthcareservice.hasExtraDetails()) {

			h.addHlthcrSrvExtraDtls(String.valueOf(healthcareservice.getExtraDetails()));
		} else {
			h.addHlthcrSrvExtraDtls("NULL");
		}


		/******************** healthcareserviceeligibility ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceEligibilityComponent> healthcareserviceeligibilitylist = healthcareservice.getEligibility();
		for(int healthcareserviceeligibilityi = 0; healthcareserviceeligibilityi<healthcareserviceeligibilitylist.size();healthcareserviceeligibilityi++ ) {
		org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceEligibilityComponent  healthcareserviceeligibility = healthcareserviceeligibilitylist.get(healthcareserviceeligibilityi);

		/******************** HlthcrSrv_Elgblty_Comment ********************************************************************************/
		if(healthcareserviceeligibilityi == 0) {h.addHlthcrSrvElgbltyComment("[");}
		if(healthcareserviceeligibility.hasComment()) {

			h.addHlthcrSrvElgbltyComment(String.valueOf(healthcareserviceeligibility.getComment()));
		} else {
			h.addHlthcrSrvElgbltyComment("NULL");
		}

		if(healthcareserviceeligibilityi == healthcareserviceeligibilitylist.size()-1) {h.addHlthcrSrvElgbltyComment("]");}


		/******************** healthcareserviceeligibilitycode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareserviceeligibilitycode = healthcareserviceeligibility.getCode();

		/******************** HlthcrSrv_Elgblty_Cd_Txt ********************************************************************************/
		if(healthcareserviceeligibilityi == 0) {h.addHlthcrSrvElgbltyCdTxt("[");}
		if(healthcareserviceeligibilitycode.hasText()) {

			h.addHlthcrSrvElgbltyCdTxt(String.valueOf(healthcareserviceeligibilitycode.getText()));
		} else {
			h.addHlthcrSrvElgbltyCdTxt("NULL");
		}

		if(healthcareserviceeligibilityi == healthcareserviceeligibilitylist.size()-1) {h.addHlthcrSrvElgbltyCdTxt("]");}


		/******************** healthcareserviceeligibilitycodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> healthcareserviceeligibilitycodecodinglist = healthcareserviceeligibilitycode.getCoding();
		for(int healthcareserviceeligibilitycodecodingi = 0; healthcareserviceeligibilitycodecodingi<healthcareserviceeligibilitycodecodinglist.size();healthcareserviceeligibilitycodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  healthcareserviceeligibilitycodecoding = healthcareserviceeligibilitycodecodinglist.get(healthcareserviceeligibilitycodecodingi);

		/******************** HlthcrSrv_Elgblty_Cd_Cdg_Dsply ********************************************************************************/
		if(healthcareserviceeligibilitycodecodingi == 0) {h.addHlthcrSrvElgbltyCdCdgDsply("[[");}
		if(healthcareserviceeligibilitycodecoding.hasDisplay()) {

			h.addHlthcrSrvElgbltyCdCdgDsply(String.valueOf(healthcareserviceeligibilitycodecoding.getDisplay()));
		} else {
			h.addHlthcrSrvElgbltyCdCdgDsply("NULL");
		}

		if(healthcareserviceeligibilitycodecodingi == healthcareserviceeligibilitycodecodinglist.size()-1) {h.addHlthcrSrvElgbltyCdCdgDsply("]]");}


		/******************** HlthcrSrv_Elgblty_Cd_Cdg_Vrsn ********************************************************************************/
		if(healthcareserviceeligibilitycodecodingi == 0) {h.addHlthcrSrvElgbltyCdCdgVrsn("[[");}
		if(healthcareserviceeligibilitycodecoding.hasVersion()) {

			h.addHlthcrSrvElgbltyCdCdgVrsn(String.valueOf(healthcareserviceeligibilitycodecoding.getVersion()));
		} else {
			h.addHlthcrSrvElgbltyCdCdgVrsn("NULL");
		}

		if(healthcareserviceeligibilitycodecodingi == healthcareserviceeligibilitycodecodinglist.size()-1) {h.addHlthcrSrvElgbltyCdCdgVrsn("]]");}


		/******************** HlthcrSrv_Elgblty_Cd_Cdg_Cd ********************************************************************************/
		if(healthcareserviceeligibilitycodecodingi == 0) {h.addHlthcrSrvElgbltyCdCdgCd("[[");}
		if(healthcareserviceeligibilitycodecoding.hasCode()) {

			h.addHlthcrSrvElgbltyCdCdgCd(String.valueOf(healthcareserviceeligibilitycodecoding.getCode()));
		} else {
			h.addHlthcrSrvElgbltyCdCdgCd("NULL");
		}

		if(healthcareserviceeligibilitycodecodingi == healthcareserviceeligibilitycodecodinglist.size()-1) {h.addHlthcrSrvElgbltyCdCdgCd("]]");}


		/******************** HlthcrSrv_Elgblty_Cd_Cdg_UsrSltd ********************************************************************************/
		if(healthcareserviceeligibilitycodecodingi == 0) {h.addHlthcrSrvElgbltyCdCdgUsrSltd("[[");}
		if(healthcareserviceeligibilitycodecoding.hasUserSelected()) {

			h.addHlthcrSrvElgbltyCdCdgUsrSltd(String.valueOf(healthcareserviceeligibilitycodecoding.getUserSelected()));
		} else {
			h.addHlthcrSrvElgbltyCdCdgUsrSltd("NULL");
		}

		if(healthcareserviceeligibilitycodecodingi == healthcareserviceeligibilitycodecodinglist.size()-1) {h.addHlthcrSrvElgbltyCdCdgUsrSltd("]]");}


		/******************** HlthcrSrv_Elgblty_Cd_Cdg_Sys ********************************************************************************/
		if(healthcareserviceeligibilitycodecodingi == 0) {h.addHlthcrSrvElgbltyCdCdgSys("[[");}
		if(healthcareserviceeligibilitycodecoding.hasSystem()) {

			h.addHlthcrSrvElgbltyCdCdgSys(String.valueOf(healthcareserviceeligibilitycodecoding.getSystem()));
		} else {
			h.addHlthcrSrvElgbltyCdCdgSys("NULL");
		}

		if(healthcareserviceeligibilitycodecodingi == healthcareserviceeligibilitycodecodinglist.size()-1) {h.addHlthcrSrvElgbltyCdCdgSys("]]");}


		 };
		 };
		/******************** healthcareservicecharacteristic ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> healthcareservicecharacteristiclist = healthcareservice.getCharacteristic();
		for(int healthcareservicecharacteristici = 0; healthcareservicecharacteristici<healthcareservicecharacteristiclist.size();healthcareservicecharacteristici++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  healthcareservicecharacteristic = healthcareservicecharacteristiclist.get(healthcareservicecharacteristici);

		/******************** HlthcrSrv_Crctrstc_Txt ********************************************************************************/
		if(healthcareservicecharacteristici == 0) {h.addHlthcrSrvCrctrstcTxt("[");}
		if(healthcareservicecharacteristic.hasText()) {

			h.addHlthcrSrvCrctrstcTxt(String.valueOf(healthcareservicecharacteristic.getText()));
		} else {
			h.addHlthcrSrvCrctrstcTxt("NULL");
		}

		if(healthcareservicecharacteristici == healthcareservicecharacteristiclist.size()-1) {h.addHlthcrSrvCrctrstcTxt("]");}


		/******************** healthcareservicecharacteristiccoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> healthcareservicecharacteristiccodinglist = healthcareservicecharacteristic.getCoding();
		for(int healthcareservicecharacteristiccodingi = 0; healthcareservicecharacteristiccodingi<healthcareservicecharacteristiccodinglist.size();healthcareservicecharacteristiccodingi++ ) {
		org.hl7.fhir.r4.model.Coding  healthcareservicecharacteristiccoding = healthcareservicecharacteristiccodinglist.get(healthcareservicecharacteristiccodingi);

		/******************** HlthcrSrv_Crctrstc_Cdg_Dsply ********************************************************************************/
		if(healthcareservicecharacteristiccodingi == 0) {h.addHlthcrSrvCrctrstcCdgDsply("[[");}
		if(healthcareservicecharacteristiccoding.hasDisplay()) {

			h.addHlthcrSrvCrctrstcCdgDsply(String.valueOf(healthcareservicecharacteristiccoding.getDisplay()));
		} else {
			h.addHlthcrSrvCrctrstcCdgDsply("NULL");
		}

		if(healthcareservicecharacteristiccodingi == healthcareservicecharacteristiccodinglist.size()-1) {h.addHlthcrSrvCrctrstcCdgDsply("]]");}


		/******************** HlthcrSrv_Crctrstc_Cdg_Vrsn ********************************************************************************/
		if(healthcareservicecharacteristiccodingi == 0) {h.addHlthcrSrvCrctrstcCdgVrsn("[[");}
		if(healthcareservicecharacteristiccoding.hasVersion()) {

			h.addHlthcrSrvCrctrstcCdgVrsn(String.valueOf(healthcareservicecharacteristiccoding.getVersion()));
		} else {
			h.addHlthcrSrvCrctrstcCdgVrsn("NULL");
		}

		if(healthcareservicecharacteristiccodingi == healthcareservicecharacteristiccodinglist.size()-1) {h.addHlthcrSrvCrctrstcCdgVrsn("]]");}


		/******************** HlthcrSrv_Crctrstc_Cdg_Cd ********************************************************************************/
		if(healthcareservicecharacteristiccodingi == 0) {h.addHlthcrSrvCrctrstcCdgCd("[[");}
		if(healthcareservicecharacteristiccoding.hasCode()) {

			h.addHlthcrSrvCrctrstcCdgCd(String.valueOf(healthcareservicecharacteristiccoding.getCode()));
		} else {
			h.addHlthcrSrvCrctrstcCdgCd("NULL");
		}

		if(healthcareservicecharacteristiccodingi == healthcareservicecharacteristiccodinglist.size()-1) {h.addHlthcrSrvCrctrstcCdgCd("]]");}


		/******************** HlthcrSrv_Crctrstc_Cdg_UsrSltd ********************************************************************************/
		if(healthcareservicecharacteristiccodingi == 0) {h.addHlthcrSrvCrctrstcCdgUsrSltd("[[");}
		if(healthcareservicecharacteristiccoding.hasUserSelected()) {

			h.addHlthcrSrvCrctrstcCdgUsrSltd(String.valueOf(healthcareservicecharacteristiccoding.getUserSelected()));
		} else {
			h.addHlthcrSrvCrctrstcCdgUsrSltd("NULL");
		}

		if(healthcareservicecharacteristiccodingi == healthcareservicecharacteristiccodinglist.size()-1) {h.addHlthcrSrvCrctrstcCdgUsrSltd("]]");}


		/******************** HlthcrSrv_Crctrstc_Cdg_Sys ********************************************************************************/
		if(healthcareservicecharacteristiccodingi == 0) {h.addHlthcrSrvCrctrstcCdgSys("[[");}
		if(healthcareservicecharacteristiccoding.hasSystem()) {

			h.addHlthcrSrvCrctrstcCdgSys(String.valueOf(healthcareservicecharacteristiccoding.getSystem()));
		} else {
			h.addHlthcrSrvCrctrstcCdgSys("NULL");
		}

		if(healthcareservicecharacteristiccodingi == healthcareservicecharacteristiccodinglist.size()-1) {h.addHlthcrSrvCrctrstcCdgSys("]]");}


		 };
		 };
		/******************** healthcareserviceprogram ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> healthcareserviceprogramlist = healthcareservice.getProgram();
		for(int healthcareserviceprogrami = 0; healthcareserviceprogrami<healthcareserviceprogramlist.size();healthcareserviceprogrami++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  healthcareserviceprogram = healthcareserviceprogramlist.get(healthcareserviceprogrami);

		/******************** HlthcrSrv_Prgrm_Txt ********************************************************************************/
		if(healthcareserviceprogrami == 0) {h.addHlthcrSrvPrgrmTxt("[");}
		if(healthcareserviceprogram.hasText()) {

			h.addHlthcrSrvPrgrmTxt(String.valueOf(healthcareserviceprogram.getText()));
		} else {
			h.addHlthcrSrvPrgrmTxt("NULL");
		}

		if(healthcareserviceprogrami == healthcareserviceprogramlist.size()-1) {h.addHlthcrSrvPrgrmTxt("]");}


		/******************** healthcareserviceprogramcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> healthcareserviceprogramcodinglist = healthcareserviceprogram.getCoding();
		for(int healthcareserviceprogramcodingi = 0; healthcareserviceprogramcodingi<healthcareserviceprogramcodinglist.size();healthcareserviceprogramcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  healthcareserviceprogramcoding = healthcareserviceprogramcodinglist.get(healthcareserviceprogramcodingi);

		/******************** HlthcrSrv_Prgrm_Cdg_Dsply ********************************************************************************/
		if(healthcareserviceprogramcodingi == 0) {h.addHlthcrSrvPrgrmCdgDsply("[[");}
		if(healthcareserviceprogramcoding.hasDisplay()) {

			h.addHlthcrSrvPrgrmCdgDsply(String.valueOf(healthcareserviceprogramcoding.getDisplay()));
		} else {
			h.addHlthcrSrvPrgrmCdgDsply("NULL");
		}

		if(healthcareserviceprogramcodingi == healthcareserviceprogramcodinglist.size()-1) {h.addHlthcrSrvPrgrmCdgDsply("]]");}


		/******************** HlthcrSrv_Prgrm_Cdg_Vrsn ********************************************************************************/
		if(healthcareserviceprogramcodingi == 0) {h.addHlthcrSrvPrgrmCdgVrsn("[[");}
		if(healthcareserviceprogramcoding.hasVersion()) {

			h.addHlthcrSrvPrgrmCdgVrsn(String.valueOf(healthcareserviceprogramcoding.getVersion()));
		} else {
			h.addHlthcrSrvPrgrmCdgVrsn("NULL");
		}

		if(healthcareserviceprogramcodingi == healthcareserviceprogramcodinglist.size()-1) {h.addHlthcrSrvPrgrmCdgVrsn("]]");}


		/******************** HlthcrSrv_Prgrm_Cdg_Cd ********************************************************************************/
		if(healthcareserviceprogramcodingi == 0) {h.addHlthcrSrvPrgrmCdgCd("[[");}
		if(healthcareserviceprogramcoding.hasCode()) {

			h.addHlthcrSrvPrgrmCdgCd(String.valueOf(healthcareserviceprogramcoding.getCode()));
		} else {
			h.addHlthcrSrvPrgrmCdgCd("NULL");
		}

		if(healthcareserviceprogramcodingi == healthcareserviceprogramcodinglist.size()-1) {h.addHlthcrSrvPrgrmCdgCd("]]");}


		/******************** HlthcrSrv_Prgrm_Cdg_UsrSltd ********************************************************************************/
		if(healthcareserviceprogramcodingi == 0) {h.addHlthcrSrvPrgrmCdgUsrSltd("[[");}
		if(healthcareserviceprogramcoding.hasUserSelected()) {

			h.addHlthcrSrvPrgrmCdgUsrSltd(String.valueOf(healthcareserviceprogramcoding.getUserSelected()));
		} else {
			h.addHlthcrSrvPrgrmCdgUsrSltd("NULL");
		}

		if(healthcareserviceprogramcodingi == healthcareserviceprogramcodinglist.size()-1) {h.addHlthcrSrvPrgrmCdgUsrSltd("]]");}


		/******************** HlthcrSrv_Prgrm_Cdg_Sys ********************************************************************************/
		if(healthcareserviceprogramcodingi == 0) {h.addHlthcrSrvPrgrmCdgSys("[[");}
		if(healthcareserviceprogramcoding.hasSystem()) {

			h.addHlthcrSrvPrgrmCdgSys(String.valueOf(healthcareserviceprogramcoding.getSystem()));
		} else {
			h.addHlthcrSrvPrgrmCdgSys("NULL");
		}

		if(healthcareserviceprogramcodingi == healthcareserviceprogramcodinglist.size()-1) {h.addHlthcrSrvPrgrmCdgSys("]]");}


		 };
		 };
		/******************** healthcareservicereferralmethod ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> healthcareservicereferralmethodlist = healthcareservice.getReferralMethod();
		for(int healthcareservicereferralmethodi = 0; healthcareservicereferralmethodi<healthcareservicereferralmethodlist.size();healthcareservicereferralmethodi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  healthcareservicereferralmethod = healthcareservicereferralmethodlist.get(healthcareservicereferralmethodi);

		/******************** HlthcrSrv_ReferralMthd_Txt ********************************************************************************/
		if(healthcareservicereferralmethodi == 0) {h.addHlthcrSrvReferralMthdTxt("[");}
		if(healthcareservicereferralmethod.hasText()) {

			h.addHlthcrSrvReferralMthdTxt(String.valueOf(healthcareservicereferralmethod.getText()));
		} else {
			h.addHlthcrSrvReferralMthdTxt("NULL");
		}

		if(healthcareservicereferralmethodi == healthcareservicereferralmethodlist.size()-1) {h.addHlthcrSrvReferralMthdTxt("]");}


		/******************** healthcareservicereferralmethodcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> healthcareservicereferralmethodcodinglist = healthcareservicereferralmethod.getCoding();
		for(int healthcareservicereferralmethodcodingi = 0; healthcareservicereferralmethodcodingi<healthcareservicereferralmethodcodinglist.size();healthcareservicereferralmethodcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  healthcareservicereferralmethodcoding = healthcareservicereferralmethodcodinglist.get(healthcareservicereferralmethodcodingi);

		/******************** HlthcrSrv_ReferralMthd_Cdg_Dsply ********************************************************************************/
		if(healthcareservicereferralmethodcodingi == 0) {h.addHlthcrSrvReferralMthdCdgDsply("[[");}
		if(healthcareservicereferralmethodcoding.hasDisplay()) {

			h.addHlthcrSrvReferralMthdCdgDsply(String.valueOf(healthcareservicereferralmethodcoding.getDisplay()));
		} else {
			h.addHlthcrSrvReferralMthdCdgDsply("NULL");
		}

		if(healthcareservicereferralmethodcodingi == healthcareservicereferralmethodcodinglist.size()-1) {h.addHlthcrSrvReferralMthdCdgDsply("]]");}


		/******************** HlthcrSrv_ReferralMthd_Cdg_Vrsn ********************************************************************************/
		if(healthcareservicereferralmethodcodingi == 0) {h.addHlthcrSrvReferralMthdCdgVrsn("[[");}
		if(healthcareservicereferralmethodcoding.hasVersion()) {

			h.addHlthcrSrvReferralMthdCdgVrsn(String.valueOf(healthcareservicereferralmethodcoding.getVersion()));
		} else {
			h.addHlthcrSrvReferralMthdCdgVrsn("NULL");
		}

		if(healthcareservicereferralmethodcodingi == healthcareservicereferralmethodcodinglist.size()-1) {h.addHlthcrSrvReferralMthdCdgVrsn("]]");}


		/******************** HlthcrSrv_ReferralMthd_Cdg_Cd ********************************************************************************/
		if(healthcareservicereferralmethodcodingi == 0) {h.addHlthcrSrvReferralMthdCdgCd("[[");}
		if(healthcareservicereferralmethodcoding.hasCode()) {

			h.addHlthcrSrvReferralMthdCdgCd(String.valueOf(healthcareservicereferralmethodcoding.getCode()));
		} else {
			h.addHlthcrSrvReferralMthdCdgCd("NULL");
		}

		if(healthcareservicereferralmethodcodingi == healthcareservicereferralmethodcodinglist.size()-1) {h.addHlthcrSrvReferralMthdCdgCd("]]");}


		/******************** HlthcrSrv_ReferralMthd_Cdg_UsrSltd ********************************************************************************/
		if(healthcareservicereferralmethodcodingi == 0) {h.addHlthcrSrvReferralMthdCdgUsrSltd("[[");}
		if(healthcareservicereferralmethodcoding.hasUserSelected()) {

			h.addHlthcrSrvReferralMthdCdgUsrSltd(String.valueOf(healthcareservicereferralmethodcoding.getUserSelected()));
		} else {
			h.addHlthcrSrvReferralMthdCdgUsrSltd("NULL");
		}

		if(healthcareservicereferralmethodcodingi == healthcareservicereferralmethodcodinglist.size()-1) {h.addHlthcrSrvReferralMthdCdgUsrSltd("]]");}


		/******************** HlthcrSrv_ReferralMthd_Cdg_Sys ********************************************************************************/
		if(healthcareservicereferralmethodcodingi == 0) {h.addHlthcrSrvReferralMthdCdgSys("[[");}
		if(healthcareservicereferralmethodcoding.hasSystem()) {

			h.addHlthcrSrvReferralMthdCdgSys(String.valueOf(healthcareservicereferralmethodcoding.getSystem()));
		} else {
			h.addHlthcrSrvReferralMthdCdgSys("NULL");
		}

		if(healthcareservicereferralmethodcodingi == healthcareservicereferralmethodcodinglist.size()-1) {h.addHlthcrSrvReferralMthdCdgSys("]]");}


		 };
		 };
		/******************** HlthcrSrv_CvgArea ********************************************************************************/
		if(healthcareservice.hasCoverageArea()) {

			String  array = "[";
			for(int incr=0; incr<healthcareservice.getCoverageArea().size(); incr++) {
				array = array + healthcareservice.getCoverageArea().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			h.addHlthcrSrvCvgArea(array);

		} else {
			h.addHlthcrSrvCvgArea("NULL");
		}


		return h;
	}
}
