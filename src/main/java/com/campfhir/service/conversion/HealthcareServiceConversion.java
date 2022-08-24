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
		if(h.getHlthcrSrvActive() != null ) {

			if(h.getHlthcrSrvActive().replace("[","").replace("]","").equals("NULL") | h.getHlthcrSrvActive()==null) {} else {
			healthcareservice.setActive(Boolean.parseBoolean(h.getHlthcrSrvActive().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** HlthcrSrv_AppmntRequired ********************************************************************************/
		if(h.getHlthcrSrvAppmntRequired() != null ) {

			if(h.getHlthcrSrvAppmntRequired().replace("[","").replace("]","").equals("NULL") | h.getHlthcrSrvAppmntRequired()==null) {} else {
			healthcareservice.setAppointmentRequired(Boolean.parseBoolean(h.getHlthcrSrvAppmntRequired().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** HlthcrSrv_AvailabilityExceptions ********************************************************************************/
		if(h.getHlthcrSrvAvailabilityExceptions() != null ) {

			if(h.getHlthcrSrvAvailabilityExceptions().replace("[","").replace("]","").equals("NULL") | h.getHlthcrSrvAvailabilityExceptions()==null) {} else {
			healthcareservice.setAvailabilityExceptions(h.getHlthcrSrvAvailabilityExceptions().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** HlthcrSrv_AvailableTime_AllDay ********************************************************************************/
		if(h.getHlthcrSrvAvailableTimeAllDay() != null ) {

			String[] arrayi0 = h.getHlthcrSrvAvailableTimeAllDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getAvailableTime().size() < i0+1) { healthcareservice.addAvailableTime(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getAvailableTime().get(i0).setAllDay(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** HlthcrSrv_AvailableTime_AvailableEndTime ********************************************************************************/
		if(h.getHlthcrSrvAvailableTimeAvailableEndTime() != null ) {

			String[] arrayi0 = h.getHlthcrSrvAvailableTimeAvailableEndTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getAvailableTime().size() < i0+1) { healthcareservice.addAvailableTime(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getAvailableTime().get(i0).setAvailableEndTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** HlthcrSrv_AvailableTime_AvailableStrtTime ********************************************************************************/
		if(h.getHlthcrSrvAvailableTimeAvailableStrtTime() != null ) {

			String[] arrayi0 = h.getHlthcrSrvAvailableTimeAvailableStrtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getAvailableTime().size() < i0+1) { healthcareservice.addAvailableTime(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getAvailableTime().get(i0).setAvailableStartTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** HlthcrSrv_Ctgry_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvCtgryCdgCd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getCategory().size() < i0+1) { healthcareservice.addCategory(); }
				String[] arrayi1 = h.getHlthcrSrvCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getCategory().get(i0).getCoding().size() < i1+1) { healthcareservice.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Ctgry_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvCtgryCdgDsply() != null ) {

			String[] arrayi0 = h.getHlthcrSrvCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getCategory().size() < i0+1) { healthcareservice.addCategory(); }
				String[] arrayi1 = h.getHlthcrSrvCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getCategory().get(i0).getCoding().size() < i1+1) { healthcareservice.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Ctgry_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvCtgryCdgSys() != null ) {

			String[] arrayi0 = h.getHlthcrSrvCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getCategory().size() < i0+1) { healthcareservice.addCategory(); }
				String[] arrayi1 = h.getHlthcrSrvCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getCategory().get(i0).getCoding().size() < i1+1) { healthcareservice.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getCategory().size() < i0+1) { healthcareservice.addCategory(); }
				String[] arrayi1 = h.getHlthcrSrvCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getCategory().get(i0).getCoding().size() < i1+1) { healthcareservice.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** HlthcrSrv_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvCtgryCdgVrsn() != null ) {

			String[] arrayi0 = h.getHlthcrSrvCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getCategory().size() < i0+1) { healthcareservice.addCategory(); }
				String[] arrayi1 = h.getHlthcrSrvCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getCategory().get(i0).getCoding().size() < i1+1) { healthcareservice.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Ctgry_Txt ********************************************************************************/
		if(h.getHlthcrSrvCtgryTxt() != null ) {

			String[] arrayi0 = h.getHlthcrSrvCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getCategory().size() < i0+1) { healthcareservice.addCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** HlthcrSrv_Crctrstc_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvCrctrstcCdgCd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvCrctrstcCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getCharacteristic().size() < i0+1) { healthcareservice.addCharacteristic(); }
				String[] arrayi1 = h.getHlthcrSrvCrctrstcCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getCharacteristic().get(i0).getCoding().size() < i1+1) { healthcareservice.getCharacteristic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getCharacteristic().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Crctrstc_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvCrctrstcCdgDsply() != null ) {

			String[] arrayi0 = h.getHlthcrSrvCrctrstcCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getCharacteristic().size() < i0+1) { healthcareservice.addCharacteristic(); }
				String[] arrayi1 = h.getHlthcrSrvCrctrstcCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getCharacteristic().get(i0).getCoding().size() < i1+1) { healthcareservice.getCharacteristic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getCharacteristic().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Crctrstc_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvCrctrstcCdgSys() != null ) {

			String[] arrayi0 = h.getHlthcrSrvCrctrstcCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getCharacteristic().size() < i0+1) { healthcareservice.addCharacteristic(); }
				String[] arrayi1 = h.getHlthcrSrvCrctrstcCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getCharacteristic().get(i0).getCoding().size() < i1+1) { healthcareservice.getCharacteristic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getCharacteristic().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Crctrstc_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvCrctrstcCdgUsrSltd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvCrctrstcCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getCharacteristic().size() < i0+1) { healthcareservice.addCharacteristic(); }
				String[] arrayi1 = h.getHlthcrSrvCrctrstcCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getCharacteristic().get(i0).getCoding().size() < i1+1) { healthcareservice.getCharacteristic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getCharacteristic().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** HlthcrSrv_Crctrstc_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvCrctrstcCdgVrsn() != null ) {

			String[] arrayi0 = h.getHlthcrSrvCrctrstcCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getCharacteristic().size() < i0+1) { healthcareservice.addCharacteristic(); }
				String[] arrayi1 = h.getHlthcrSrvCrctrstcCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getCharacteristic().get(i0).getCoding().size() < i1+1) { healthcareservice.getCharacteristic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getCharacteristic().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Crctrstc_Txt ********************************************************************************/
		if(h.getHlthcrSrvCrctrstcTxt() != null ) {

			String[] arrayi0 = h.getHlthcrSrvCrctrstcTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getCharacteristic().size() < i0+1) { healthcareservice.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getCharacteristic().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** HlthcrSrv_Comment ********************************************************************************/
		if(h.getHlthcrSrvComment() != null ) {

			if(h.getHlthcrSrvComment().replace("[","").replace("]","").equals("NULL") | h.getHlthcrSrvComment()==null) {} else {
			healthcareservice.setComment(h.getHlthcrSrvComment().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** HlthcrSrv_Cmmnctn_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvCmmnctnCdgCd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvCmmnctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getCommunication().size() < i0+1) { healthcareservice.addCommunication(); }
				String[] arrayi1 = h.getHlthcrSrvCmmnctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getCommunication().get(i0).getCoding().size() < i1+1) { healthcareservice.getCommunication().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getCommunication().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Cmmnctn_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvCmmnctnCdgDsply() != null ) {

			String[] arrayi0 = h.getHlthcrSrvCmmnctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getCommunication().size() < i0+1) { healthcareservice.addCommunication(); }
				String[] arrayi1 = h.getHlthcrSrvCmmnctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getCommunication().get(i0).getCoding().size() < i1+1) { healthcareservice.getCommunication().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getCommunication().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Cmmnctn_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvCmmnctnCdgSys() != null ) {

			String[] arrayi0 = h.getHlthcrSrvCmmnctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getCommunication().size() < i0+1) { healthcareservice.addCommunication(); }
				String[] arrayi1 = h.getHlthcrSrvCmmnctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getCommunication().get(i0).getCoding().size() < i1+1) { healthcareservice.getCommunication().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getCommunication().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Cmmnctn_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvCmmnctnCdgUsrSltd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvCmmnctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getCommunication().size() < i0+1) { healthcareservice.addCommunication(); }
				String[] arrayi1 = h.getHlthcrSrvCmmnctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getCommunication().get(i0).getCoding().size() < i1+1) { healthcareservice.getCommunication().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getCommunication().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** HlthcrSrv_Cmmnctn_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvCmmnctnCdgVrsn() != null ) {

			String[] arrayi0 = h.getHlthcrSrvCmmnctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getCommunication().size() < i0+1) { healthcareservice.addCommunication(); }
				String[] arrayi1 = h.getHlthcrSrvCmmnctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getCommunication().get(i0).getCoding().size() < i1+1) { healthcareservice.getCommunication().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getCommunication().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Cmmnctn_Txt ********************************************************************************/
		if(h.getHlthcrSrvCmmnctnTxt() != null ) {

			String[] arrayi0 = h.getHlthcrSrvCmmnctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getCommunication().size() < i0+1) { healthcareservice.addCommunication(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getCommunication().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** HlthcrSrv_CvgArea ********************************************************************************/
		if(h.getHlthcrSrvCvgArea() != null ) {

				for( String currListStrSplit : h.getHlthcrSrvCvgArea().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			healthcareservice.addCoverageArea(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** HlthcrSrv_Elgblty_Cd_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvElgbltyCdCdgCd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvElgbltyCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getEligibility().size() < i0+1) { healthcareservice.addEligibility(); }
				String[] arrayi1 = h.getHlthcrSrvElgbltyCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getEligibility().get(i0).getCode().getCoding().size() < i1+1) { healthcareservice.getEligibility().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getEligibility().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Elgblty_Cd_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvElgbltyCdCdgDsply() != null ) {

			String[] arrayi0 = h.getHlthcrSrvElgbltyCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getEligibility().size() < i0+1) { healthcareservice.addEligibility(); }
				String[] arrayi1 = h.getHlthcrSrvElgbltyCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getEligibility().get(i0).getCode().getCoding().size() < i1+1) { healthcareservice.getEligibility().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getEligibility().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Elgblty_Cd_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvElgbltyCdCdgSys() != null ) {

			String[] arrayi0 = h.getHlthcrSrvElgbltyCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getEligibility().size() < i0+1) { healthcareservice.addEligibility(); }
				String[] arrayi1 = h.getHlthcrSrvElgbltyCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getEligibility().get(i0).getCode().getCoding().size() < i1+1) { healthcareservice.getEligibility().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getEligibility().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Elgblty_Cd_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvElgbltyCdCdgUsrSltd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvElgbltyCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getEligibility().size() < i0+1) { healthcareservice.addEligibility(); }
				String[] arrayi1 = h.getHlthcrSrvElgbltyCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getEligibility().get(i0).getCode().getCoding().size() < i1+1) { healthcareservice.getEligibility().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getEligibility().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** HlthcrSrv_Elgblty_Cd_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvElgbltyCdCdgVrsn() != null ) {

			String[] arrayi0 = h.getHlthcrSrvElgbltyCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getEligibility().size() < i0+1) { healthcareservice.addEligibility(); }
				String[] arrayi1 = h.getHlthcrSrvElgbltyCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getEligibility().get(i0).getCode().getCoding().size() < i1+1) { healthcareservice.getEligibility().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getEligibility().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Elgblty_Cd_Txt ********************************************************************************/
		if(h.getHlthcrSrvElgbltyCdTxt() != null ) {

			String[] arrayi0 = h.getHlthcrSrvElgbltyCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getEligibility().size() < i0+1) { healthcareservice.addEligibility(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getEligibility().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** HlthcrSrv_Elgblty_Comment ********************************************************************************/
		if(h.getHlthcrSrvElgbltyComment() != null ) {

			String[] arrayi0 = h.getHlthcrSrvElgbltyComment().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getEligibility().size() < i0+1) { healthcareservice.addEligibility(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getEligibility().get(i0).setComment(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** HlthcrSrv_Endpoint ********************************************************************************/
		if(h.getHlthcrSrvEndpoint() != null ) {

				for( String currListStrSplit : h.getHlthcrSrvEndpoint().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			healthcareservice.addEndpoint(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** HlthcrSrv_ExtraDtls ********************************************************************************/
		if(h.getHlthcrSrvExtraDtls() != null ) {

			if(h.getHlthcrSrvExtraDtls().replace("[","").replace("]","").equals("NULL") | h.getHlthcrSrvExtraDtls()==null) {} else {
			healthcareservice.setExtraDetails(h.getHlthcrSrvExtraDtls().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** HlthcrSrv_Id_Assigner ********************************************************************************/
		if(h.getHlthcrSrvIdAssigner() != null ) {

			String[] arrayi0 = h.getHlthcrSrvIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getIdentifier().size() < i0+1) { healthcareservice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** HlthcrSrv_Id_Prd_End ********************************************************************************/
		if(h.getHlthcrSrvIdPrdEnd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getIdentifier().size() < i0+1) { healthcareservice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** HlthcrSrv_Id_Prd_Strt ********************************************************************************/
		if(h.getHlthcrSrvIdPrdStrt() != null ) {

			String[] arrayi0 = h.getHlthcrSrvIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getIdentifier().size() < i0+1) { healthcareservice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** HlthcrSrv_Id_Sys ********************************************************************************/
		if(h.getHlthcrSrvIdSys() != null ) {

			String[] arrayi0 = h.getHlthcrSrvIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getIdentifier().size() < i0+1) { healthcareservice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** HlthcrSrv_Id_Typ_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvIdTypCdgCd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getIdentifier().size() < i0+1) { healthcareservice.addIdentifier(); }
				String[] arrayi1 = h.getHlthcrSrvIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { healthcareservice.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvIdTypCdgDsply() != null ) {

			String[] arrayi0 = h.getHlthcrSrvIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getIdentifier().size() < i0+1) { healthcareservice.addIdentifier(); }
				String[] arrayi1 = h.getHlthcrSrvIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { healthcareservice.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Id_Typ_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvIdTypCdgSys() != null ) {

			String[] arrayi0 = h.getHlthcrSrvIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getIdentifier().size() < i0+1) { healthcareservice.addIdentifier(); }
				String[] arrayi1 = h.getHlthcrSrvIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { healthcareservice.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getIdentifier().size() < i0+1) { healthcareservice.addIdentifier(); }
				String[] arrayi1 = h.getHlthcrSrvIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { healthcareservice.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** HlthcrSrv_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvIdTypCdgVrsn() != null ) {

			String[] arrayi0 = h.getHlthcrSrvIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getIdentifier().size() < i0+1) { healthcareservice.addIdentifier(); }
				String[] arrayi1 = h.getHlthcrSrvIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { healthcareservice.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Id_Typ_Txt ********************************************************************************/
		if(h.getHlthcrSrvIdTypTxt() != null ) {

			String[] arrayi0 = h.getHlthcrSrvIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getIdentifier().size() < i0+1) { healthcareservice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** HlthcrSrv_Id_Use ********************************************************************************/
		if(h.getHlthcrSrvIdUse() != null ) {

			String[] arrayi0 = h.getHlthcrSrvIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getIdentifier().size() < i0+1) { healthcareservice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** HlthcrSrv_Id_Vl ********************************************************************************/
		if(h.getHlthcrSrvIdVl() != null ) {

			String[] arrayi0 = h.getHlthcrSrvIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getIdentifier().size() < i0+1) { healthcareservice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** HlthcrSrv_Lctn ********************************************************************************/
		if(h.getHlthcrSrvLctn() != null ) {

				for( String currListStrSplit : h.getHlthcrSrvLctn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			healthcareservice.addLocation(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** HlthcrSrv_Nm ********************************************************************************/
		if(h.getHlthcrSrvNm() != null ) {

			if(h.getHlthcrSrvNm().replace("[","").replace("]","").equals("NULL") | h.getHlthcrSrvNm()==null) {} else {
			healthcareservice.setName(h.getHlthcrSrvNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** HlthcrSrv_NotAvailable_Dscrptn ********************************************************************************/
		if(h.getHlthcrSrvNotAvailableDscrptn() != null ) {

			String[] arrayi0 = h.getHlthcrSrvNotAvailableDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getNotAvailable().size() < i0+1) { healthcareservice.addNotAvailable(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getNotAvailable().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** HlthcrSrv_NotAvailable_During_End ********************************************************************************/
		if(h.getHlthcrSrvNotAvailableDuringEnd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvNotAvailableDuringEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getNotAvailable().size() < i0+1) { healthcareservice.addNotAvailable(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getNotAvailable().get(i0).getDuring().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** HlthcrSrv_NotAvailable_During_Strt ********************************************************************************/
		if(h.getHlthcrSrvNotAvailableDuringStrt() != null ) {

			String[] arrayi0 = h.getHlthcrSrvNotAvailableDuringStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getNotAvailable().size() < i0+1) { healthcareservice.addNotAvailable(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getNotAvailable().get(i0).getDuring().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** HlthcrSrv_Photo_CntntTyp ********************************************************************************/
		if(h.getHlthcrSrvPhotoCntntTyp() != null ) {

			if(h.getHlthcrSrvPhotoCntntTyp().replace("[","").replace("]","").equals("NULL") | h.getHlthcrSrvPhotoCntntTyp()==null) {} else {
			healthcareservice.getPhoto().setContentType(h.getHlthcrSrvPhotoCntntTyp().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** HlthcrSrv_Photo_Creation ********************************************************************************/
		if(h.getHlthcrSrvPhotoCreation() != null ) {

			if(h.getHlthcrSrvPhotoCreation().replace("[","").replace("]","").equals("NULL") | h.getHlthcrSrvPhotoCreation()==null) {} else {
			healthcareservice.getPhoto().setCreation(h.getHlthcrSrvPhotoCreation().replace("[","").replace("]","").equals("NULL") | h.getHlthcrSrvPhotoCreation()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(h.getHlthcrSrvPhotoCreation().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** HlthcrSrv_Photo_Data ********************************************************************************/
		if(h.getHlthcrSrvPhotoData() != null ) {

			if(h.getHlthcrSrvPhotoData().replace("[","").replace("]","").equals("NULL") | h.getHlthcrSrvPhotoData()==null) {} else {
			healthcareservice.getPhoto().setData(h.getHlthcrSrvPhotoData().getBytes());
			}
		}
		/******************** HlthcrSrv_Photo_Hash ********************************************************************************/
		if(h.getHlthcrSrvPhotoHash() != null ) {

			if(h.getHlthcrSrvPhotoHash().replace("[","").replace("]","").equals("NULL") | h.getHlthcrSrvPhotoHash()==null) {} else {
			healthcareservice.getPhoto().setHash(h.getHlthcrSrvPhotoHash().getBytes());
			}
		}
		/******************** HlthcrSrv_Photo_Lnguage ********************************************************************************/
		if(h.getHlthcrSrvPhotoLnguage() != null ) {

			if(h.getHlthcrSrvPhotoLnguage().replace("[","").replace("]","").equals("NULL") | h.getHlthcrSrvPhotoLnguage()==null) {} else {
			healthcareservice.getPhoto().setLanguage(h.getHlthcrSrvPhotoLnguage().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** HlthcrSrv_Photo_Sz ********************************************************************************/
		if(h.getHlthcrSrvPhotoSz() != null ) {

			if(h.getHlthcrSrvPhotoSz().replace("[","").replace("]","").equals("NULL") | h.getHlthcrSrvPhotoSz()==null) {} else {
			healthcareservice.getPhoto().setSize(Integer.parseInt(h.getHlthcrSrvPhotoSz().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** HlthcrSrv_Photo_Ttl ********************************************************************************/
		if(h.getHlthcrSrvPhotoTtl() != null ) {

			if(h.getHlthcrSrvPhotoTtl().replace("[","").replace("]","").equals("NULL") | h.getHlthcrSrvPhotoTtl()==null) {} else {
			healthcareservice.getPhoto().setTitle(h.getHlthcrSrvPhotoTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** HlthcrSrv_Photo_Url ********************************************************************************/
		if(h.getHlthcrSrvPhotoUrl() != null ) {

			if(h.getHlthcrSrvPhotoUrl().replace("[","").replace("]","").equals("NULL") | h.getHlthcrSrvPhotoUrl()==null) {} else {
			healthcareservice.getPhoto().setUrl(h.getHlthcrSrvPhotoUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** HlthcrSrv_Prgrm_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvPrgrmCdgCd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvPrgrmCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getProgram().size() < i0+1) { healthcareservice.addProgram(); }
				String[] arrayi1 = h.getHlthcrSrvPrgrmCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getProgram().get(i0).getCoding().size() < i1+1) { healthcareservice.getProgram().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getProgram().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Prgrm_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvPrgrmCdgDsply() != null ) {

			String[] arrayi0 = h.getHlthcrSrvPrgrmCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getProgram().size() < i0+1) { healthcareservice.addProgram(); }
				String[] arrayi1 = h.getHlthcrSrvPrgrmCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getProgram().get(i0).getCoding().size() < i1+1) { healthcareservice.getProgram().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getProgram().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Prgrm_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvPrgrmCdgSys() != null ) {

			String[] arrayi0 = h.getHlthcrSrvPrgrmCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getProgram().size() < i0+1) { healthcareservice.addProgram(); }
				String[] arrayi1 = h.getHlthcrSrvPrgrmCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getProgram().get(i0).getCoding().size() < i1+1) { healthcareservice.getProgram().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getProgram().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Prgrm_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvPrgrmCdgUsrSltd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvPrgrmCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getProgram().size() < i0+1) { healthcareservice.addProgram(); }
				String[] arrayi1 = h.getHlthcrSrvPrgrmCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getProgram().get(i0).getCoding().size() < i1+1) { healthcareservice.getProgram().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getProgram().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** HlthcrSrv_Prgrm_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvPrgrmCdgVrsn() != null ) {

			String[] arrayi0 = h.getHlthcrSrvPrgrmCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getProgram().size() < i0+1) { healthcareservice.addProgram(); }
				String[] arrayi1 = h.getHlthcrSrvPrgrmCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getProgram().get(i0).getCoding().size() < i1+1) { healthcareservice.getProgram().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getProgram().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Prgrm_Txt ********************************************************************************/
		if(h.getHlthcrSrvPrgrmTxt() != null ) {

			String[] arrayi0 = h.getHlthcrSrvPrgrmTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getProgram().size() < i0+1) { healthcareservice.addProgram(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getProgram().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** HlthcrSrv_ProvidedBy ********************************************************************************/
		if(h.getHlthcrSrvProvidedBy() != null ) {

			if(h.getHlthcrSrvProvidedBy().replace("[","").replace("]","").equals("NULL") | h.getHlthcrSrvProvidedBy()==null) {} else {
			healthcareservice.setProvidedBy(new org.hl7.fhir.r4.model.Reference(h.getHlthcrSrvProvidedBy().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** HlthcrSrv_ReferralMthd_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvReferralMthdCdgCd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvReferralMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getReferralMethod().size() < i0+1) { healthcareservice.addReferralMethod(); }
				String[] arrayi1 = h.getHlthcrSrvReferralMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getReferralMethod().get(i0).getCoding().size() < i1+1) { healthcareservice.getReferralMethod().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getReferralMethod().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_ReferralMthd_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvReferralMthdCdgDsply() != null ) {

			String[] arrayi0 = h.getHlthcrSrvReferralMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getReferralMethod().size() < i0+1) { healthcareservice.addReferralMethod(); }
				String[] arrayi1 = h.getHlthcrSrvReferralMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getReferralMethod().get(i0).getCoding().size() < i1+1) { healthcareservice.getReferralMethod().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getReferralMethod().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_ReferralMthd_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvReferralMthdCdgSys() != null ) {

			String[] arrayi0 = h.getHlthcrSrvReferralMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getReferralMethod().size() < i0+1) { healthcareservice.addReferralMethod(); }
				String[] arrayi1 = h.getHlthcrSrvReferralMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getReferralMethod().get(i0).getCoding().size() < i1+1) { healthcareservice.getReferralMethod().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getReferralMethod().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_ReferralMthd_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvReferralMthdCdgUsrSltd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvReferralMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getReferralMethod().size() < i0+1) { healthcareservice.addReferralMethod(); }
				String[] arrayi1 = h.getHlthcrSrvReferralMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getReferralMethod().get(i0).getCoding().size() < i1+1) { healthcareservice.getReferralMethod().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getReferralMethod().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** HlthcrSrv_ReferralMthd_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvReferralMthdCdgVrsn() != null ) {

			String[] arrayi0 = h.getHlthcrSrvReferralMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getReferralMethod().size() < i0+1) { healthcareservice.addReferralMethod(); }
				String[] arrayi1 = h.getHlthcrSrvReferralMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getReferralMethod().get(i0).getCoding().size() < i1+1) { healthcareservice.getReferralMethod().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getReferralMethod().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_ReferralMthd_Txt ********************************************************************************/
		if(h.getHlthcrSrvReferralMthdTxt() != null ) {

			String[] arrayi0 = h.getHlthcrSrvReferralMthdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getReferralMethod().size() < i0+1) { healthcareservice.addReferralMethod(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getReferralMethod().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** HlthcrSrv_SrvProvisionCd_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvSrvProvisionCdCdgCd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvSrvProvisionCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getServiceProvisionCode().size() < i0+1) { healthcareservice.addServiceProvisionCode(); }
				String[] arrayi1 = h.getHlthcrSrvSrvProvisionCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getServiceProvisionCode().get(i0).getCoding().size() < i1+1) { healthcareservice.getServiceProvisionCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getServiceProvisionCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_SrvProvisionCd_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvSrvProvisionCdCdgDsply() != null ) {

			String[] arrayi0 = h.getHlthcrSrvSrvProvisionCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getServiceProvisionCode().size() < i0+1) { healthcareservice.addServiceProvisionCode(); }
				String[] arrayi1 = h.getHlthcrSrvSrvProvisionCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getServiceProvisionCode().get(i0).getCoding().size() < i1+1) { healthcareservice.getServiceProvisionCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getServiceProvisionCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_SrvProvisionCd_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvSrvProvisionCdCdgSys() != null ) {

			String[] arrayi0 = h.getHlthcrSrvSrvProvisionCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getServiceProvisionCode().size() < i0+1) { healthcareservice.addServiceProvisionCode(); }
				String[] arrayi1 = h.getHlthcrSrvSrvProvisionCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getServiceProvisionCode().get(i0).getCoding().size() < i1+1) { healthcareservice.getServiceProvisionCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getServiceProvisionCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_SrvProvisionCd_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvSrvProvisionCdCdgUsrSltd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvSrvProvisionCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getServiceProvisionCode().size() < i0+1) { healthcareservice.addServiceProvisionCode(); }
				String[] arrayi1 = h.getHlthcrSrvSrvProvisionCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getServiceProvisionCode().get(i0).getCoding().size() < i1+1) { healthcareservice.getServiceProvisionCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getServiceProvisionCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** HlthcrSrv_SrvProvisionCd_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvSrvProvisionCdCdgVrsn() != null ) {

			String[] arrayi0 = h.getHlthcrSrvSrvProvisionCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getServiceProvisionCode().size() < i0+1) { healthcareservice.addServiceProvisionCode(); }
				String[] arrayi1 = h.getHlthcrSrvSrvProvisionCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getServiceProvisionCode().get(i0).getCoding().size() < i1+1) { healthcareservice.getServiceProvisionCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getServiceProvisionCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_SrvProvisionCd_Txt ********************************************************************************/
		if(h.getHlthcrSrvSrvProvisionCdTxt() != null ) {

			String[] arrayi0 = h.getHlthcrSrvSrvProvisionCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getServiceProvisionCode().size() < i0+1) { healthcareservice.addServiceProvisionCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getServiceProvisionCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** HlthcrSrv_Spclty_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvSpcltyCdgCd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvSpcltyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getSpecialty().size() < i0+1) { healthcareservice.addSpecialty(); }
				String[] arrayi1 = h.getHlthcrSrvSpcltyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getSpecialty().get(i0).getCoding().size() < i1+1) { healthcareservice.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getSpecialty().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Spclty_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvSpcltyCdgDsply() != null ) {

			String[] arrayi0 = h.getHlthcrSrvSpcltyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getSpecialty().size() < i0+1) { healthcareservice.addSpecialty(); }
				String[] arrayi1 = h.getHlthcrSrvSpcltyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getSpecialty().get(i0).getCoding().size() < i1+1) { healthcareservice.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getSpecialty().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Spclty_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvSpcltyCdgSys() != null ) {

			String[] arrayi0 = h.getHlthcrSrvSpcltyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getSpecialty().size() < i0+1) { healthcareservice.addSpecialty(); }
				String[] arrayi1 = h.getHlthcrSrvSpcltyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getSpecialty().get(i0).getCoding().size() < i1+1) { healthcareservice.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getSpecialty().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvSpcltyCdgUsrSltd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvSpcltyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getSpecialty().size() < i0+1) { healthcareservice.addSpecialty(); }
				String[] arrayi1 = h.getHlthcrSrvSpcltyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getSpecialty().get(i0).getCoding().size() < i1+1) { healthcareservice.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getSpecialty().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** HlthcrSrv_Spclty_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvSpcltyCdgVrsn() != null ) {

			String[] arrayi0 = h.getHlthcrSrvSpcltyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getSpecialty().size() < i0+1) { healthcareservice.addSpecialty(); }
				String[] arrayi1 = h.getHlthcrSrvSpcltyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getSpecialty().get(i0).getCoding().size() < i1+1) { healthcareservice.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getSpecialty().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Spclty_Txt ********************************************************************************/
		if(h.getHlthcrSrvSpcltyTxt() != null ) {

			String[] arrayi0 = h.getHlthcrSrvSpcltyTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getSpecialty().size() < i0+1) { healthcareservice.addSpecialty(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getSpecialty().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** HlthcrSrv_Tlcm_Prd_End ********************************************************************************/
		if(h.getHlthcrSrvTlcmPrdEnd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getTelecom().size() < i0+1) { healthcareservice.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getTelecom().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** HlthcrSrv_Tlcm_Prd_Strt ********************************************************************************/
		if(h.getHlthcrSrvTlcmPrdStrt() != null ) {

			String[] arrayi0 = h.getHlthcrSrvTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getTelecom().size() < i0+1) { healthcareservice.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getTelecom().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** HlthcrSrv_Tlcm_Rnk ********************************************************************************/
		if(h.getHlthcrSrvTlcmRnk() != null ) {

			String[] arrayi0 = h.getHlthcrSrvTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getTelecom().size() < i0+1) { healthcareservice.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getTelecom().get(i0).setRank(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** HlthcrSrv_Tlcm_Sys ********************************************************************************/
		if(h.getHlthcrSrvTlcmSys() != null ) {

			String[] arrayi0 = h.getHlthcrSrvTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getTelecom().size() < i0+1) { healthcareservice.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getTelecom().get(i0).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** HlthcrSrv_Tlcm_Use ********************************************************************************/
		if(h.getHlthcrSrvTlcmUse() != null ) {

			String[] arrayi0 = h.getHlthcrSrvTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getTelecom().size() < i0+1) { healthcareservice.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getTelecom().get(i0).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** HlthcrSrv_Tlcm_Vl ********************************************************************************/
		if(h.getHlthcrSrvTlcmVl() != null ) {

			String[] arrayi0 = h.getHlthcrSrvTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getTelecom().size() < i0+1) { healthcareservice.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getTelecom().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** HlthcrSrv_Typ_Cdg_Cd ********************************************************************************/
		if(h.getHlthcrSrvTypCdgCd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getType().size() < i0+1) { healthcareservice.addType(); }
				String[] arrayi1 = h.getHlthcrSrvTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getType().get(i0).getCoding().size() < i1+1) { healthcareservice.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getType().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Typ_Cdg_Dsply ********************************************************************************/
		if(h.getHlthcrSrvTypCdgDsply() != null ) {

			String[] arrayi0 = h.getHlthcrSrvTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getType().size() < i0+1) { healthcareservice.addType(); }
				String[] arrayi1 = h.getHlthcrSrvTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getType().get(i0).getCoding().size() < i1+1) { healthcareservice.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getType().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Typ_Cdg_Sys ********************************************************************************/
		if(h.getHlthcrSrvTypCdgSys() != null ) {

			String[] arrayi0 = h.getHlthcrSrvTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getType().size() < i0+1) { healthcareservice.addType(); }
				String[] arrayi1 = h.getHlthcrSrvTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getType().get(i0).getCoding().size() < i1+1) { healthcareservice.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getType().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Typ_Cdg_UsrSltd ********************************************************************************/
		if(h.getHlthcrSrvTypCdgUsrSltd() != null ) {

			String[] arrayi0 = h.getHlthcrSrvTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getType().size() < i0+1) { healthcareservice.addType(); }
				String[] arrayi1 = h.getHlthcrSrvTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getType().get(i0).getCoding().size() < i1+1) { healthcareservice.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getType().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** HlthcrSrv_Typ_Cdg_Vrsn ********************************************************************************/
		if(h.getHlthcrSrvTypCdgVrsn() != null ) {

			String[] arrayi0 = h.getHlthcrSrvTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getType().size() < i0+1) { healthcareservice.addType(); }
				String[] arrayi1 = h.getHlthcrSrvTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(healthcareservice.getType().get(i0).getCoding().size() < i1+1) { healthcareservice.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {healthcareservice.getType().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** HlthcrSrv_Typ_Txt ********************************************************************************/
		if(h.getHlthcrSrvTypTxt() != null ) {

			String[] arrayi0 = h.getHlthcrSrvTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(healthcareservice.getType().size() < i0+1) { healthcareservice.addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {healthcareservice.getType().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		return healthcareservice;
	}
}
