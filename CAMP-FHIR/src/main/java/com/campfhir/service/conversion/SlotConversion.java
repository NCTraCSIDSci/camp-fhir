package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Slot;
public class SlotConversion 
{
	public org.hl7.fhir.r4.model.Slot Slots(Slot s) throws ParseException
	{
		org.hl7.fhir.r4.model.Slot slot = new org.hl7.fhir.r4.model.Slot();

		/******************** id ********************************************************************************/
		slot.setId(s.getId());

		/******************** Slot_AppmntTyp_Cdg_Cd ********************************************************************************/
		if(s.getSlotAppmntTypCdgCd() != null ) {

			String[] arrayi0 = s.getSlotAppmntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getAppointmentType().getCoding().size() < i0+1) { slot.getAppointmentType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {slot.getAppointmentType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Slot_AppmntTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSlotAppmntTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSlotAppmntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getAppointmentType().getCoding().size() < i0+1) { slot.getAppointmentType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {slot.getAppointmentType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Slot_AppmntTyp_Cdg_Sys ********************************************************************************/
		if(s.getSlotAppmntTypCdgSys() != null ) {

			String[] arrayi0 = s.getSlotAppmntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getAppointmentType().getCoding().size() < i0+1) { slot.getAppointmentType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {slot.getAppointmentType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Slot_AppmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSlotAppmntTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSlotAppmntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getAppointmentType().getCoding().size() < i0+1) { slot.getAppointmentType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {slot.getAppointmentType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Slot_AppmntTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSlotAppmntTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSlotAppmntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getAppointmentType().getCoding().size() < i0+1) { slot.getAppointmentType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {slot.getAppointmentType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Slot_AppmntTyp_Txt ********************************************************************************/
		if(s.getSlotAppmntTypTxt() != null ) {

			if(s.getSlotAppmntTypTxt().replace("[","").replace("]","").equals("NULL") | s.getSlotAppmntTypTxt()==null) {} else {
			slot.getAppointmentType().setText(s.getSlotAppmntTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Slot_Comment ********************************************************************************/
		if(s.getSlotComment() != null ) {

			if(s.getSlotComment().replace("[","").replace("]","").equals("NULL") | s.getSlotComment()==null) {} else {
			slot.setComment(s.getSlotComment().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Slot_End ********************************************************************************/
		if(s.getSlotEnd() != null ) {

			if(s.getSlotEnd().replace("[","").replace("]","").equals("NULL") | s.getSlotEnd()==null) {} else {
			slot.setEnd(s.getSlotEnd().replace("[","").replace("]","").equals("NULL") | s.getSlotEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSlotEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Slot_Id_Assigner ********************************************************************************/
		if(s.getSlotIdAssigner() != null ) {

			String[] arrayi0 = s.getSlotIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getIdentifier().size() < i0+1) { slot.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {slot.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Slot_Id_Prd_End ********************************************************************************/
		if(s.getSlotIdPrdEnd() != null ) {

			String[] arrayi0 = s.getSlotIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getIdentifier().size() < i0+1) { slot.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {slot.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Slot_Id_Prd_Strt ********************************************************************************/
		if(s.getSlotIdPrdStrt() != null ) {

			String[] arrayi0 = s.getSlotIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getIdentifier().size() < i0+1) { slot.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {slot.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Slot_Id_Sys ********************************************************************************/
		if(s.getSlotIdSys() != null ) {

			String[] arrayi0 = s.getSlotIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getIdentifier().size() < i0+1) { slot.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {slot.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Slot_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSlotIdTypCdgCd() != null ) {

			String[] arrayi0 = s.getSlotIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getIdentifier().size() < i0+1) { slot.addIdentifier(); }
				String[] arrayi1 = s.getSlotIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { slot.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Slot_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSlotIdTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSlotIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getIdentifier().size() < i0+1) { slot.addIdentifier(); }
				String[] arrayi1 = s.getSlotIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { slot.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Slot_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSlotIdTypCdgSys() != null ) {

			String[] arrayi0 = s.getSlotIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getIdentifier().size() < i0+1) { slot.addIdentifier(); }
				String[] arrayi1 = s.getSlotIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { slot.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Slot_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSlotIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSlotIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getIdentifier().size() < i0+1) { slot.addIdentifier(); }
				String[] arrayi1 = s.getSlotIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { slot.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Slot_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSlotIdTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSlotIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getIdentifier().size() < i0+1) { slot.addIdentifier(); }
				String[] arrayi1 = s.getSlotIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { slot.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Slot_Id_Typ_Txt ********************************************************************************/
		if(s.getSlotIdTypTxt() != null ) {

			String[] arrayi0 = s.getSlotIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getIdentifier().size() < i0+1) { slot.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {slot.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Slot_Id_Use ********************************************************************************/
		if(s.getSlotIdUse() != null ) {

			String[] arrayi0 = s.getSlotIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getIdentifier().size() < i0+1) { slot.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {slot.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Slot_Id_Vl ********************************************************************************/
		if(s.getSlotIdVl() != null ) {

			String[] arrayi0 = s.getSlotIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getIdentifier().size() < i0+1) { slot.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {slot.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Slot_Overbooked ********************************************************************************/
		if(s.getSlotOverbooked() != null ) {

			if(s.getSlotOverbooked().replace("[","").replace("]","").equals("NULL") | s.getSlotOverbooked()==null) {} else {
			slot.setOverbooked(Boolean.parseBoolean(s.getSlotOverbooked().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Slot_Schdl ********************************************************************************/
		if(s.getSlotSchdl() != null ) {

			if(s.getSlotSchdl().replace("[","").replace("]","").equals("NULL") | s.getSlotSchdl()==null) {} else {
			slot.setSchedule(new org.hl7.fhir.r4.model.Reference(s.getSlotSchdl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Slot_SrvCtgry_Cdg_Cd ********************************************************************************/
		if(s.getSlotSrvCtgryCdgCd() != null ) {

			String[] arrayi0 = s.getSlotSrvCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getServiceCategory().size() < i0+1) { slot.addServiceCategory(); }
				String[] arrayi1 = s.getSlotSrvCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getServiceCategory().get(i0).getCoding().size() < i1+1) { slot.getServiceCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getServiceCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Slot_SrvCtgry_Cdg_Dsply ********************************************************************************/
		if(s.getSlotSrvCtgryCdgDsply() != null ) {

			String[] arrayi0 = s.getSlotSrvCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getServiceCategory().size() < i0+1) { slot.addServiceCategory(); }
				String[] arrayi1 = s.getSlotSrvCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getServiceCategory().get(i0).getCoding().size() < i1+1) { slot.getServiceCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getServiceCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Slot_SrvCtgry_Cdg_Sys ********************************************************************************/
		if(s.getSlotSrvCtgryCdgSys() != null ) {

			String[] arrayi0 = s.getSlotSrvCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getServiceCategory().size() < i0+1) { slot.addServiceCategory(); }
				String[] arrayi1 = s.getSlotSrvCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getServiceCategory().get(i0).getCoding().size() < i1+1) { slot.getServiceCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getServiceCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Slot_SrvCtgry_Cdg_UsrSltd ********************************************************************************/
		if(s.getSlotSrvCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSlotSrvCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getServiceCategory().size() < i0+1) { slot.addServiceCategory(); }
				String[] arrayi1 = s.getSlotSrvCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getServiceCategory().get(i0).getCoding().size() < i1+1) { slot.getServiceCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getServiceCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Slot_SrvCtgry_Cdg_Vrsn ********************************************************************************/
		if(s.getSlotSrvCtgryCdgVrsn() != null ) {

			String[] arrayi0 = s.getSlotSrvCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getServiceCategory().size() < i0+1) { slot.addServiceCategory(); }
				String[] arrayi1 = s.getSlotSrvCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getServiceCategory().get(i0).getCoding().size() < i1+1) { slot.getServiceCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getServiceCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Slot_SrvCtgry_Txt ********************************************************************************/
		if(s.getSlotSrvCtgryTxt() != null ) {

			String[] arrayi0 = s.getSlotSrvCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getServiceCategory().size() < i0+1) { slot.addServiceCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {slot.getServiceCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Slot_SrvTyp_Cdg_Cd ********************************************************************************/
		if(s.getSlotSrvTypCdgCd() != null ) {

			String[] arrayi0 = s.getSlotSrvTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getServiceType().size() < i0+1) { slot.addServiceType(); }
				String[] arrayi1 = s.getSlotSrvTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getServiceType().get(i0).getCoding().size() < i1+1) { slot.getServiceType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getServiceType().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Slot_SrvTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSlotSrvTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSlotSrvTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getServiceType().size() < i0+1) { slot.addServiceType(); }
				String[] arrayi1 = s.getSlotSrvTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getServiceType().get(i0).getCoding().size() < i1+1) { slot.getServiceType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getServiceType().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Slot_SrvTyp_Cdg_Sys ********************************************************************************/
		if(s.getSlotSrvTypCdgSys() != null ) {

			String[] arrayi0 = s.getSlotSrvTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getServiceType().size() < i0+1) { slot.addServiceType(); }
				String[] arrayi1 = s.getSlotSrvTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getServiceType().get(i0).getCoding().size() < i1+1) { slot.getServiceType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getServiceType().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Slot_SrvTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSlotSrvTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSlotSrvTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getServiceType().size() < i0+1) { slot.addServiceType(); }
				String[] arrayi1 = s.getSlotSrvTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getServiceType().get(i0).getCoding().size() < i1+1) { slot.getServiceType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getServiceType().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Slot_SrvTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSlotSrvTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSlotSrvTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getServiceType().size() < i0+1) { slot.addServiceType(); }
				String[] arrayi1 = s.getSlotSrvTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getServiceType().get(i0).getCoding().size() < i1+1) { slot.getServiceType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getServiceType().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Slot_SrvTyp_Txt ********************************************************************************/
		if(s.getSlotSrvTypTxt() != null ) {

			String[] arrayi0 = s.getSlotSrvTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getServiceType().size() < i0+1) { slot.addServiceType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {slot.getServiceType().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Slot_Spclty_Cdg_Cd ********************************************************************************/
		if(s.getSlotSpcltyCdgCd() != null ) {

			String[] arrayi0 = s.getSlotSpcltyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getSpecialty().size() < i0+1) { slot.addSpecialty(); }
				String[] arrayi1 = s.getSlotSpcltyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getSpecialty().get(i0).getCoding().size() < i1+1) { slot.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getSpecialty().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Slot_Spclty_Cdg_Dsply ********************************************************************************/
		if(s.getSlotSpcltyCdgDsply() != null ) {

			String[] arrayi0 = s.getSlotSpcltyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getSpecialty().size() < i0+1) { slot.addSpecialty(); }
				String[] arrayi1 = s.getSlotSpcltyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getSpecialty().get(i0).getCoding().size() < i1+1) { slot.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getSpecialty().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Slot_Spclty_Cdg_Sys ********************************************************************************/
		if(s.getSlotSpcltyCdgSys() != null ) {

			String[] arrayi0 = s.getSlotSpcltyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getSpecialty().size() < i0+1) { slot.addSpecialty(); }
				String[] arrayi1 = s.getSlotSpcltyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getSpecialty().get(i0).getCoding().size() < i1+1) { slot.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getSpecialty().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Slot_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(s.getSlotSpcltyCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSlotSpcltyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getSpecialty().size() < i0+1) { slot.addSpecialty(); }
				String[] arrayi1 = s.getSlotSpcltyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getSpecialty().get(i0).getCoding().size() < i1+1) { slot.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getSpecialty().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Slot_Spclty_Cdg_Vrsn ********************************************************************************/
		if(s.getSlotSpcltyCdgVrsn() != null ) {

			String[] arrayi0 = s.getSlotSpcltyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getSpecialty().size() < i0+1) { slot.addSpecialty(); }
				String[] arrayi1 = s.getSlotSpcltyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(slot.getSpecialty().get(i0).getCoding().size() < i1+1) { slot.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {slot.getSpecialty().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Slot_Spclty_Txt ********************************************************************************/
		if(s.getSlotSpcltyTxt() != null ) {

			String[] arrayi0 = s.getSlotSpcltyTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(slot.getSpecialty().size() < i0+1) { slot.addSpecialty(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {slot.getSpecialty().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Slot_Strt ********************************************************************************/
		if(s.getSlotStrt() != null ) {

			if(s.getSlotStrt().replace("[","").replace("]","").equals("NULL") | s.getSlotStrt()==null) {} else {
			slot.setStart(s.getSlotStrt().replace("[","").replace("]","").equals("NULL") | s.getSlotStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSlotStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Slot_Sts ********************************************************************************/
		if(s.getSlotSts() != null ) {

			if(s.getSlotSts().replace("[","").replace("]","").equals("NULL") | s.getSlotSts()==null) {} else {
			slot.setStatus(new org.hl7.fhir.r4.model.Slot.SlotStatusEnumFactory().fromCode(s.getSlotSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return slot;
	}
}
