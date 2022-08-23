package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.PractitionerRole;
public class PractitionerRoleBidirectionalConversion 
{
	public PractitionerRole PractitionerRoles(org.hl7.fhir.r4.model.PractitionerRole practitionerrole) throws ParseException
	{
		 main.java.com.campfhir.model.PractitionerRole p = new  main.java.com.campfhir.model.PractitionerRole();

		/******************** id ********************************************************************************/
		p.setId(practitionerrole.getIdElement().getIdPart());

		/******************** PrctitnrRole_Lctn ********************************************************************************/
		if(practitionerrole.hasLocation()) {

			String  array = "[";
			for(int incr=0; incr<practitionerrole.getLocation().size(); incr++) {
				array = array + practitionerrole.getLocation().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPrctitnrRoleLctn(array);

		} else {
			p.addPrctitnrRoleLctn("NULL");
		}


		/******************** practitionerrolecode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> practitionerrolecodelist = practitionerrole.getCode();
		for(int practitionerrolecodei = 0; practitionerrolecodei<practitionerrolecodelist.size();practitionerrolecodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  practitionerrolecode = practitionerrolecodelist.get(practitionerrolecodei);

		/******************** PrctitnrRole_Cd_Txt ********************************************************************************/
		if(practitionerrolecodei == 0) {p.addPrctitnrRoleCdTxt("[");}
		if(practitionerrolecode.hasText()) {

			p.addPrctitnrRoleCdTxt(String.valueOf(practitionerrolecode.getText()));
		} else {
			p.addPrctitnrRoleCdTxt("NULL");
		}

		if(practitionerrolecodei == practitionerrolecodelist.size()-1) {p.addPrctitnrRoleCdTxt("]");}


		/******************** practitionerrolecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> practitionerrolecodecodinglist = practitionerrolecode.getCoding();
		for(int practitionerrolecodecodingi = 0; practitionerrolecodecodingi<practitionerrolecodecodinglist.size();practitionerrolecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  practitionerrolecodecoding = practitionerrolecodecodinglist.get(practitionerrolecodecodingi);

		/******************** PrctitnrRole_Cd_Cdg_Dsply ********************************************************************************/
		if(practitionerrolecodecodingi == 0) {p.addPrctitnrRoleCdCdgDsply("[[");}
		if(practitionerrolecodecoding.hasDisplay()) {

			p.addPrctitnrRoleCdCdgDsply(String.valueOf(practitionerrolecodecoding.getDisplay()));
		} else {
			p.addPrctitnrRoleCdCdgDsply("NULL");
		}

		if(practitionerrolecodecodingi == practitionerrolecodecodinglist.size()-1) {p.addPrctitnrRoleCdCdgDsply("]]");}


		/******************** PrctitnrRole_Cd_Cdg_Vrsn ********************************************************************************/
		if(practitionerrolecodecodingi == 0) {p.addPrctitnrRoleCdCdgVrsn("[[");}
		if(practitionerrolecodecoding.hasVersion()) {

			p.addPrctitnrRoleCdCdgVrsn(String.valueOf(practitionerrolecodecoding.getVersion()));
		} else {
			p.addPrctitnrRoleCdCdgVrsn("NULL");
		}

		if(practitionerrolecodecodingi == practitionerrolecodecodinglist.size()-1) {p.addPrctitnrRoleCdCdgVrsn("]]");}


		/******************** PrctitnrRole_Cd_Cdg_Cd ********************************************************************************/
		if(practitionerrolecodecodingi == 0) {p.addPrctitnrRoleCdCdgCd("[[");}
		if(practitionerrolecodecoding.hasCode()) {

			p.addPrctitnrRoleCdCdgCd(String.valueOf(practitionerrolecodecoding.getCode()));
		} else {
			p.addPrctitnrRoleCdCdgCd("NULL");
		}

		if(practitionerrolecodecodingi == practitionerrolecodecodinglist.size()-1) {p.addPrctitnrRoleCdCdgCd("]]");}


		/******************** PrctitnrRole_Cd_Cdg_UsrSltd ********************************************************************************/
		if(practitionerrolecodecodingi == 0) {p.addPrctitnrRoleCdCdgUsrSltd("[[");}
		if(practitionerrolecodecoding.hasUserSelected()) {

			p.addPrctitnrRoleCdCdgUsrSltd(String.valueOf(practitionerrolecodecoding.getUserSelected()));
		} else {
			p.addPrctitnrRoleCdCdgUsrSltd("NULL");
		}

		if(practitionerrolecodecodingi == practitionerrolecodecodinglist.size()-1) {p.addPrctitnrRoleCdCdgUsrSltd("]]");}


		/******************** PrctitnrRole_Cd_Cdg_Sys ********************************************************************************/
		if(practitionerrolecodecodingi == 0) {p.addPrctitnrRoleCdCdgSys("[[");}
		if(practitionerrolecodecoding.hasSystem()) {

			p.addPrctitnrRoleCdCdgSys(String.valueOf(practitionerrolecodecoding.getSystem()));
		} else {
			p.addPrctitnrRoleCdCdgSys("NULL");
		}

		if(practitionerrolecodecodingi == practitionerrolecodecodinglist.size()-1) {p.addPrctitnrRoleCdCdgSys("]]");}


		 };
		 };
		/******************** PrctitnrRole_Endpoint ********************************************************************************/
		if(practitionerrole.hasEndpoint()) {

			String  array = "[";
			for(int incr=0; incr<practitionerrole.getEndpoint().size(); incr++) {
				array = array + practitionerrole.getEndpoint().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPrctitnrRoleEndpoint(array);

		} else {
			p.addPrctitnrRoleEndpoint("NULL");
		}


		/******************** practitionerroleperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionerroleperiod = practitionerrole.getPeriod();

		/******************** PrctitnrRole_Prd_Strt ********************************************************************************/
		if(practitionerroleperiod.hasStart()) {

			p.addPrctitnrRolePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitionerroleperiod.getStart())+"\"");
		} else {
			p.addPrctitnrRolePrdStrt("NULL");
		}


		/******************** PrctitnrRole_Prd_End ********************************************************************************/
		if(practitionerroleperiod.hasEnd()) {

			p.addPrctitnrRolePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitionerroleperiod.getEnd())+"\"");
		} else {
			p.addPrctitnrRolePrdEnd("NULL");
		}


		/******************** practitionerroleidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> practitionerroleidentifierlist = practitionerrole.getIdentifier();
		for(int practitionerroleidentifieri = 0; practitionerroleidentifieri<practitionerroleidentifierlist.size();practitionerroleidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  practitionerroleidentifier = practitionerroleidentifierlist.get(practitionerroleidentifieri);

		/******************** PrctitnrRole_Id_Vl ********************************************************************************/
		if(practitionerroleidentifieri == 0) {p.addPrctitnrRoleIdVl("[");}
		if(practitionerroleidentifier.hasValue()) {

			p.addPrctitnrRoleIdVl(String.valueOf(practitionerroleidentifier.getValue()));
		} else {
			p.addPrctitnrRoleIdVl("NULL");
		}

		if(practitionerroleidentifieri == practitionerroleidentifierlist.size()-1) {p.addPrctitnrRoleIdVl("]");}


		/******************** practitionerroleidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept practitionerroleidentifiertype = practitionerroleidentifier.getType();

		/******************** PrctitnrRole_Id_Typ_Txt ********************************************************************************/
		if(practitionerroleidentifieri == 0) {p.addPrctitnrRoleIdTypTxt("[");}
		if(practitionerroleidentifiertype.hasText()) {

			p.addPrctitnrRoleIdTypTxt(String.valueOf(practitionerroleidentifiertype.getText()));
		} else {
			p.addPrctitnrRoleIdTypTxt("NULL");
		}

		if(practitionerroleidentifieri == practitionerroleidentifierlist.size()-1) {p.addPrctitnrRoleIdTypTxt("]");}


		/******************** practitionerroleidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> practitionerroleidentifiertypecodinglist = practitionerroleidentifiertype.getCoding();
		for(int practitionerroleidentifiertypecodingi = 0; practitionerroleidentifiertypecodingi<practitionerroleidentifiertypecodinglist.size();practitionerroleidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  practitionerroleidentifiertypecoding = practitionerroleidentifiertypecodinglist.get(practitionerroleidentifiertypecodingi);

		/******************** PrctitnrRole_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(practitionerroleidentifiertypecodingi == 0) {p.addPrctitnrRoleIdTypCdgDsply("[[");}
		if(practitionerroleidentifiertypecoding.hasDisplay()) {

			p.addPrctitnrRoleIdTypCdgDsply(String.valueOf(practitionerroleidentifiertypecoding.getDisplay()));
		} else {
			p.addPrctitnrRoleIdTypCdgDsply("NULL");
		}

		if(practitionerroleidentifiertypecodingi == practitionerroleidentifiertypecodinglist.size()-1) {p.addPrctitnrRoleIdTypCdgDsply("]]");}


		/******************** PrctitnrRole_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(practitionerroleidentifiertypecodingi == 0) {p.addPrctitnrRoleIdTypCdgVrsn("[[");}
		if(practitionerroleidentifiertypecoding.hasVersion()) {

			p.addPrctitnrRoleIdTypCdgVrsn(String.valueOf(practitionerroleidentifiertypecoding.getVersion()));
		} else {
			p.addPrctitnrRoleIdTypCdgVrsn("NULL");
		}

		if(practitionerroleidentifiertypecodingi == practitionerroleidentifiertypecodinglist.size()-1) {p.addPrctitnrRoleIdTypCdgVrsn("]]");}


		/******************** PrctitnrRole_Id_Typ_Cdg_Cd ********************************************************************************/
		if(practitionerroleidentifiertypecodingi == 0) {p.addPrctitnrRoleIdTypCdgCd("[[");}
		if(practitionerroleidentifiertypecoding.hasCode()) {

			p.addPrctitnrRoleIdTypCdgCd(String.valueOf(practitionerroleidentifiertypecoding.getCode()));
		} else {
			p.addPrctitnrRoleIdTypCdgCd("NULL");
		}

		if(practitionerroleidentifiertypecodingi == practitionerroleidentifiertypecodinglist.size()-1) {p.addPrctitnrRoleIdTypCdgCd("]]");}


		/******************** PrctitnrRole_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(practitionerroleidentifiertypecodingi == 0) {p.addPrctitnrRoleIdTypCdgUsrSltd("[[");}
		if(practitionerroleidentifiertypecoding.hasUserSelected()) {

			p.addPrctitnrRoleIdTypCdgUsrSltd(String.valueOf(practitionerroleidentifiertypecoding.getUserSelected()));
		} else {
			p.addPrctitnrRoleIdTypCdgUsrSltd("NULL");
		}

		if(practitionerroleidentifiertypecodingi == practitionerroleidentifiertypecodinglist.size()-1) {p.addPrctitnrRoleIdTypCdgUsrSltd("]]");}


		/******************** PrctitnrRole_Id_Typ_Cdg_Sys ********************************************************************************/
		if(practitionerroleidentifiertypecodingi == 0) {p.addPrctitnrRoleIdTypCdgSys("[[");}
		if(practitionerroleidentifiertypecoding.hasSystem()) {

			p.addPrctitnrRoleIdTypCdgSys(String.valueOf(practitionerroleidentifiertypecoding.getSystem()));
		} else {
			p.addPrctitnrRoleIdTypCdgSys("NULL");
		}

		if(practitionerroleidentifiertypecodingi == practitionerroleidentifiertypecodinglist.size()-1) {p.addPrctitnrRoleIdTypCdgSys("]]");}


		 };
		/******************** practitionerroleidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionerroleidentifierperiod = practitionerroleidentifier.getPeriod();

		/******************** PrctitnrRole_Id_Prd_Strt ********************************************************************************/
		if(practitionerroleidentifieri == 0) {p.addPrctitnrRoleIdPrdStrt("[");}
		if(practitionerroleidentifierperiod.hasStart()) {

			p.addPrctitnrRoleIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitionerroleidentifierperiod.getStart())+"\"");
		} else {
			p.addPrctitnrRoleIdPrdStrt("NULL");
		}

		if(practitionerroleidentifieri == practitionerroleidentifierlist.size()-1) {p.addPrctitnrRoleIdPrdStrt("]");}


		/******************** PrctitnrRole_Id_Prd_End ********************************************************************************/
		if(practitionerroleidentifieri == 0) {p.addPrctitnrRoleIdPrdEnd("[");}
		if(practitionerroleidentifierperiod.hasEnd()) {

			p.addPrctitnrRoleIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitionerroleidentifierperiod.getEnd())+"\"");
		} else {
			p.addPrctitnrRoleIdPrdEnd("NULL");
		}

		if(practitionerroleidentifieri == practitionerroleidentifierlist.size()-1) {p.addPrctitnrRoleIdPrdEnd("]");}


		/******************** practitionerroleidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse practitionerroleidentifieruse = practitionerroleidentifier.getUse();
		if(practitionerroleidentifieruse!=null) {
		if(practitionerroleidentifieri == 0) {

		p.addPrctitnrRoleIdUse("[");		}
			p.addPrctitnrRoleIdUse(practitionerroleidentifieruse.toCode());
		if(practitionerroleidentifieri == practitionerroleidentifierlist.size()-1) {

		p.addPrctitnrRoleIdUse("]");		}

		} else {
			p.addPrctitnrRoleIdUse("NULL");
		}

		/******************** PrctitnrRole_Id_Assigner ********************************************************************************/
		if(practitionerroleidentifieri == 0) {p.addPrctitnrRoleIdAssigner("[");}
		if(practitionerroleidentifier.hasAssigner()) {

			if(practitionerroleidentifier.getAssigner().getReference() != null) {
			p.addPrctitnrRoleIdAssigner(practitionerroleidentifier.getAssigner().getReference());
			}
		} else {
			p.addPrctitnrRoleIdAssigner("NULL");
		}

		if(practitionerroleidentifieri == practitionerroleidentifierlist.size()-1) {p.addPrctitnrRoleIdAssigner("]");}


		/******************** PrctitnrRole_Id_Sys ********************************************************************************/
		if(practitionerroleidentifieri == 0) {p.addPrctitnrRoleIdSys("[");}
		if(practitionerroleidentifier.hasSystem()) {

			p.addPrctitnrRoleIdSys(String.valueOf(practitionerroleidentifier.getSystem()));
		} else {
			p.addPrctitnrRoleIdSys("NULL");
		}

		if(practitionerroleidentifieri == practitionerroleidentifierlist.size()-1) {p.addPrctitnrRoleIdSys("]");}


		 };
		/******************** practitionerroleavailabletime ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.PractitionerRole.PractitionerRoleAvailableTimeComponent> practitionerroleavailabletimelist = practitionerrole.getAvailableTime();
		for(int practitionerroleavailabletimei = 0; practitionerroleavailabletimei<practitionerroleavailabletimelist.size();practitionerroleavailabletimei++ ) {
		org.hl7.fhir.r4.model.PractitionerRole.PractitionerRoleAvailableTimeComponent  practitionerroleavailabletime = practitionerroleavailabletimelist.get(practitionerroleavailabletimei);

		/******************** PrctitnrRole_AvailableTime_AllDay ********************************************************************************/
		if(practitionerroleavailabletimei == 0) {p.addPrctitnrRoleAvailableTimeAllDay("[");}
		if(practitionerroleavailabletime.hasAllDay()) {

			p.addPrctitnrRoleAvailableTimeAllDay(String.valueOf(practitionerroleavailabletime.getAllDay()));
		} else {
			p.addPrctitnrRoleAvailableTimeAllDay("NULL");
		}

		if(practitionerroleavailabletimei == practitionerroleavailabletimelist.size()-1) {p.addPrctitnrRoleAvailableTimeAllDay("]");}


		/******************** practitionerroleavailabletimedaysofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.PractitionerRole.DaysOfWeek>> practitionerroleavailabletimedaysofweeklist = practitionerroleavailabletime.getDaysOfWeek();
		for(int practitionerroleavailabletimedaysofweeki = 0; practitionerroleavailabletimedaysofweeki<practitionerroleavailabletimedaysofweeklist.size();practitionerroleavailabletimedaysofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.PractitionerRole.DaysOfWeek>  practitionerroleavailabletimedaysofweek = practitionerroleavailabletimedaysofweeklist.get(practitionerroleavailabletimedaysofweeki);
		if(practitionerroleavailabletimedaysofweek!=null) {
			p.addPrctitnrRoleAvailableTimeDaysOfWeek(practitionerroleavailabletimedaysofweek.getCode());
		} else {
			p.addPrctitnrRoleAvailableTimeDaysOfWeek("NULL");
		}
		 };

		/******************** PrctitnrRole_AvailableTime_AvailableEndTime ********************************************************************************/
		if(practitionerroleavailabletime.hasAvailableEndTime()) {

			p.addPrctitnrRoleAvailableTimeAvailableEndTime(String.valueOf(practitionerroleavailabletime.getAvailableEndTime()));
		} else {
			p.addPrctitnrRoleAvailableTimeAvailableEndTime("NULL");
		}


		/******************** PrctitnrRole_AvailableTime_AvailableStrtTime ********************************************************************************/
		if(practitionerroleavailabletime.hasAvailableStartTime()) {

			p.addPrctitnrRoleAvailableTimeAvailableStrtTime(String.valueOf(practitionerroleavailabletime.getAvailableStartTime()));
		} else {
			p.addPrctitnrRoleAvailableTimeAvailableStrtTime("NULL");
		}


		 };
		/******************** PrctitnrRole_Orgnztn ********************************************************************************/
		if(practitionerrole.hasOrganization()) {

			if(practitionerrole.getOrganization().getReference() != null) {
			p.addPrctitnrRoleOrgnztn(practitionerrole.getOrganization().getReference());
			}
		} else {
			p.addPrctitnrRoleOrgnztn("NULL");
		}


		/******************** PrctitnrRole_Prctitnr ********************************************************************************/
		if(practitionerrole.hasPractitioner()) {

			if(practitionerrole.getPractitioner().getReference() != null) {
			p.addPrctitnrRolePrctitnr(practitionerrole.getPractitioner().getReference());
			}
		} else {
			p.addPrctitnrRolePrctitnr("NULL");
		}


		/******************** practitionerrolenotavailable ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.PractitionerRole.PractitionerRoleNotAvailableComponent> practitionerrolenotavailablelist = practitionerrole.getNotAvailable();
		for(int practitionerrolenotavailablei = 0; practitionerrolenotavailablei<practitionerrolenotavailablelist.size();practitionerrolenotavailablei++ ) {
		org.hl7.fhir.r4.model.PractitionerRole.PractitionerRoleNotAvailableComponent  practitionerrolenotavailable = practitionerrolenotavailablelist.get(practitionerrolenotavailablei);

		/******************** PrctitnrRole_NotAvailable_Dscrptn ********************************************************************************/
		if(practitionerrolenotavailablei == 0) {p.addPrctitnrRoleNotAvailableDscrptn("[");}
		if(practitionerrolenotavailable.hasDescription()) {

			p.addPrctitnrRoleNotAvailableDscrptn(String.valueOf(practitionerrolenotavailable.getDescription()));
		} else {
			p.addPrctitnrRoleNotAvailableDscrptn("NULL");
		}

		if(practitionerrolenotavailablei == practitionerrolenotavailablelist.size()-1) {p.addPrctitnrRoleNotAvailableDscrptn("]");}


		/******************** practitionerrolenotavailableduring ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionerrolenotavailableduring = practitionerrolenotavailable.getDuring();

		/******************** PrctitnrRole_NotAvailable_During_Strt ********************************************************************************/
		if(practitionerrolenotavailablei == 0) {p.addPrctitnrRoleNotAvailableDuringStrt("[");}
		if(practitionerrolenotavailableduring.hasStart()) {

			p.addPrctitnrRoleNotAvailableDuringStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitionerrolenotavailableduring.getStart())+"\"");
		} else {
			p.addPrctitnrRoleNotAvailableDuringStrt("NULL");
		}

		if(practitionerrolenotavailablei == practitionerrolenotavailablelist.size()-1) {p.addPrctitnrRoleNotAvailableDuringStrt("]");}


		/******************** PrctitnrRole_NotAvailable_During_End ********************************************************************************/
		if(practitionerrolenotavailablei == 0) {p.addPrctitnrRoleNotAvailableDuringEnd("[");}
		if(practitionerrolenotavailableduring.hasEnd()) {

			p.addPrctitnrRoleNotAvailableDuringEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitionerrolenotavailableduring.getEnd())+"\"");
		} else {
			p.addPrctitnrRoleNotAvailableDuringEnd("NULL");
		}

		if(practitionerrolenotavailablei == practitionerrolenotavailablelist.size()-1) {p.addPrctitnrRoleNotAvailableDuringEnd("]");}


		 };
		/******************** PrctitnrRole_HlthcrSrv ********************************************************************************/
		if(practitionerrole.hasHealthcareService()) {

			String  array = "[";
			for(int incr=0; incr<practitionerrole.getHealthcareService().size(); incr++) {
				array = array + practitionerrole.getHealthcareService().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addPrctitnrRoleHlthcrSrv(array);

		} else {
			p.addPrctitnrRoleHlthcrSrv("NULL");
		}


		/******************** PrctitnrRole_AvailabilityExceptions ********************************************************************************/
		if(practitionerrole.hasAvailabilityExceptions()) {

			p.addPrctitnrRoleAvailabilityExceptions(String.valueOf(practitionerrole.getAvailabilityExceptions()));
		} else {
			p.addPrctitnrRoleAvailabilityExceptions("NULL");
		}


		/******************** practitionerrolespecialty ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> practitionerrolespecialtylist = practitionerrole.getSpecialty();
		for(int practitionerrolespecialtyi = 0; practitionerrolespecialtyi<practitionerrolespecialtylist.size();practitionerrolespecialtyi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  practitionerrolespecialty = practitionerrolespecialtylist.get(practitionerrolespecialtyi);

		/******************** PrctitnrRole_Spclty_Txt ********************************************************************************/
		if(practitionerrolespecialtyi == 0) {p.addPrctitnrRoleSpcltyTxt("[");}
		if(practitionerrolespecialty.hasText()) {

			p.addPrctitnrRoleSpcltyTxt(String.valueOf(practitionerrolespecialty.getText()));
		} else {
			p.addPrctitnrRoleSpcltyTxt("NULL");
		}

		if(practitionerrolespecialtyi == practitionerrolespecialtylist.size()-1) {p.addPrctitnrRoleSpcltyTxt("]");}


		/******************** practitionerrolespecialtycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> practitionerrolespecialtycodinglist = practitionerrolespecialty.getCoding();
		for(int practitionerrolespecialtycodingi = 0; practitionerrolespecialtycodingi<practitionerrolespecialtycodinglist.size();practitionerrolespecialtycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  practitionerrolespecialtycoding = practitionerrolespecialtycodinglist.get(practitionerrolespecialtycodingi);

		/******************** PrctitnrRole_Spclty_Cdg_Dsply ********************************************************************************/
		if(practitionerrolespecialtycodingi == 0) {p.addPrctitnrRoleSpcltyCdgDsply("[[");}
		if(practitionerrolespecialtycoding.hasDisplay()) {

			p.addPrctitnrRoleSpcltyCdgDsply(String.valueOf(practitionerrolespecialtycoding.getDisplay()));
		} else {
			p.addPrctitnrRoleSpcltyCdgDsply("NULL");
		}

		if(practitionerrolespecialtycodingi == practitionerrolespecialtycodinglist.size()-1) {p.addPrctitnrRoleSpcltyCdgDsply("]]");}


		/******************** PrctitnrRole_Spclty_Cdg_Vrsn ********************************************************************************/
		if(practitionerrolespecialtycodingi == 0) {p.addPrctitnrRoleSpcltyCdgVrsn("[[");}
		if(practitionerrolespecialtycoding.hasVersion()) {

			p.addPrctitnrRoleSpcltyCdgVrsn(String.valueOf(practitionerrolespecialtycoding.getVersion()));
		} else {
			p.addPrctitnrRoleSpcltyCdgVrsn("NULL");
		}

		if(practitionerrolespecialtycodingi == practitionerrolespecialtycodinglist.size()-1) {p.addPrctitnrRoleSpcltyCdgVrsn("]]");}


		/******************** PrctitnrRole_Spclty_Cdg_Cd ********************************************************************************/
		if(practitionerrolespecialtycodingi == 0) {p.addPrctitnrRoleSpcltyCdgCd("[[");}
		if(practitionerrolespecialtycoding.hasCode()) {

			p.addPrctitnrRoleSpcltyCdgCd(String.valueOf(practitionerrolespecialtycoding.getCode()));
		} else {
			p.addPrctitnrRoleSpcltyCdgCd("NULL");
		}

		if(practitionerrolespecialtycodingi == practitionerrolespecialtycodinglist.size()-1) {p.addPrctitnrRoleSpcltyCdgCd("]]");}


		/******************** PrctitnrRole_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(practitionerrolespecialtycodingi == 0) {p.addPrctitnrRoleSpcltyCdgUsrSltd("[[");}
		if(practitionerrolespecialtycoding.hasUserSelected()) {

			p.addPrctitnrRoleSpcltyCdgUsrSltd(String.valueOf(practitionerrolespecialtycoding.getUserSelected()));
		} else {
			p.addPrctitnrRoleSpcltyCdgUsrSltd("NULL");
		}

		if(practitionerrolespecialtycodingi == practitionerrolespecialtycodinglist.size()-1) {p.addPrctitnrRoleSpcltyCdgUsrSltd("]]");}


		/******************** PrctitnrRole_Spclty_Cdg_Sys ********************************************************************************/
		if(practitionerrolespecialtycodingi == 0) {p.addPrctitnrRoleSpcltyCdgSys("[[");}
		if(practitionerrolespecialtycoding.hasSystem()) {

			p.addPrctitnrRoleSpcltyCdgSys(String.valueOf(practitionerrolespecialtycoding.getSystem()));
		} else {
			p.addPrctitnrRoleSpcltyCdgSys("NULL");
		}

		if(practitionerrolespecialtycodingi == practitionerrolespecialtycodinglist.size()-1) {p.addPrctitnrRoleSpcltyCdgSys("]]");}


		 };
		 };
		/******************** PrctitnrRole_Active ********************************************************************************/
		if(practitionerrole.hasActive()) {

			p.addPrctitnrRoleActive(String.valueOf(practitionerrole.getActive()));
		} else {
			p.addPrctitnrRoleActive("NULL");
		}


		/******************** practitionerroletelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> practitionerroletelecomlist = practitionerrole.getTelecom();
		for(int practitionerroletelecomi = 0; practitionerroletelecomi<practitionerroletelecomlist.size();practitionerroletelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  practitionerroletelecom = practitionerroletelecomlist.get(practitionerroletelecomi);

		/******************** PrctitnrRole_Tlcm_Vl ********************************************************************************/
		if(practitionerroletelecomi == 0) {p.addPrctitnrRoleTlcmVl("[");}
		if(practitionerroletelecom.hasValue()) {

			p.addPrctitnrRoleTlcmVl(String.valueOf(practitionerroletelecom.getValue()));
		} else {
			p.addPrctitnrRoleTlcmVl("NULL");
		}

		if(practitionerroletelecomi == practitionerroletelecomlist.size()-1) {p.addPrctitnrRoleTlcmVl("]");}


		/******************** practitionerroletelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionerroletelecomperiod = practitionerroletelecom.getPeriod();

		/******************** PrctitnrRole_Tlcm_Prd_Strt ********************************************************************************/
		if(practitionerroletelecomi == 0) {p.addPrctitnrRoleTlcmPrdStrt("[");}
		if(practitionerroletelecomperiod.hasStart()) {

			p.addPrctitnrRoleTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitionerroletelecomperiod.getStart())+"\"");
		} else {
			p.addPrctitnrRoleTlcmPrdStrt("NULL");
		}

		if(practitionerroletelecomi == practitionerroletelecomlist.size()-1) {p.addPrctitnrRoleTlcmPrdStrt("]");}


		/******************** PrctitnrRole_Tlcm_Prd_End ********************************************************************************/
		if(practitionerroletelecomi == 0) {p.addPrctitnrRoleTlcmPrdEnd("[");}
		if(practitionerroletelecomperiod.hasEnd()) {

			p.addPrctitnrRoleTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(practitionerroletelecomperiod.getEnd())+"\"");
		} else {
			p.addPrctitnrRoleTlcmPrdEnd("NULL");
		}

		if(practitionerroletelecomi == practitionerroletelecomlist.size()-1) {p.addPrctitnrRoleTlcmPrdEnd("]");}


		/******************** practitionerroletelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse practitionerroletelecomuse = practitionerroletelecom.getUse();
		if(practitionerroletelecomuse!=null) {
		if(practitionerroletelecomi == 0) {

		p.addPrctitnrRoleTlcmUse("[");		}
			p.addPrctitnrRoleTlcmUse(practitionerroletelecomuse.toCode());
		if(practitionerroletelecomi == practitionerroletelecomlist.size()-1) {

		p.addPrctitnrRoleTlcmUse("]");		}

		} else {
			p.addPrctitnrRoleTlcmUse("NULL");
		}

		/******************** practitionerroletelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem practitionerroletelecomsystem = practitionerroletelecom.getSystem();
		if(practitionerroletelecomsystem!=null) {
		if(practitionerroletelecomi == 0) {

		p.addPrctitnrRoleTlcmSys("[");		}
			p.addPrctitnrRoleTlcmSys(practitionerroletelecomsystem.toCode());
		if(practitionerroletelecomi == practitionerroletelecomlist.size()-1) {

		p.addPrctitnrRoleTlcmSys("]");		}

		} else {
			p.addPrctitnrRoleTlcmSys("NULL");
		}

		/******************** PrctitnrRole_Tlcm_Rnk ********************************************************************************/
		if(practitionerroletelecomi == 0) {p.addPrctitnrRoleTlcmRnk("[");}
		if(practitionerroletelecom.hasRank()) {

			p.addPrctitnrRoleTlcmRnk(String.valueOf(practitionerroletelecom.getRank()));
		} else {
			p.addPrctitnrRoleTlcmRnk("NULL");
		}

		if(practitionerroletelecomi == practitionerroletelecomlist.size()-1) {p.addPrctitnrRoleTlcmRnk("]");}


		 };
		return p;
	}
}
