package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Slot;
public class SlotBidirectionalConversion 
{
	public Slot Slots(org.hl7.fhir.r4.model.Slot slot) throws ParseException
	{
		 main.java.com.campfhir.model.Slot s = new  main.java.com.campfhir.model.Slot();

		/******************** id ********************************************************************************/
		s.setId(slot.getIdElement().getIdPart());

		/******************** Slot_Comment ********************************************************************************/
		if(slot.hasComment()) {

			s.addSlotComment(String.valueOf(slot.getComment()));
		} else {
			s.addSlotComment("NULL");
		}


		/******************** slotstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Slot.SlotStatus slotstatus = slot.getStatus();
		if(slotstatus!=null) {
			s.addSlotSts(slotstatus.toCode());
		} else {
			s.addSlotSts("NULL");
		}

		/******************** slotidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> slotidentifierlist = slot.getIdentifier();
		for(int slotidentifieri = 0; slotidentifieri<slotidentifierlist.size();slotidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  slotidentifier = slotidentifierlist.get(slotidentifieri);

		/******************** Slot_Id_Vl ********************************************************************************/
		if(slotidentifieri == 0) {s.addSlotIdVl("[");}
		if(slotidentifier.hasValue()) {

			s.addSlotIdVl(String.valueOf(slotidentifier.getValue()));
		} else {
			s.addSlotIdVl("NULL");
		}

		if(slotidentifieri == slotidentifierlist.size()-1) {s.addSlotIdVl("]");}


		/******************** slotidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept slotidentifiertype = slotidentifier.getType();

		/******************** Slot_Id_Typ_Txt ********************************************************************************/
		if(slotidentifieri == 0) {s.addSlotIdTypTxt("[");}
		if(slotidentifiertype.hasText()) {

			s.addSlotIdTypTxt(String.valueOf(slotidentifiertype.getText()));
		} else {
			s.addSlotIdTypTxt("NULL");
		}

		if(slotidentifieri == slotidentifierlist.size()-1) {s.addSlotIdTypTxt("]");}


		/******************** slotidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> slotidentifiertypecodinglist = slotidentifiertype.getCoding();
		for(int slotidentifiertypecodingi = 0; slotidentifiertypecodingi<slotidentifiertypecodinglist.size();slotidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  slotidentifiertypecoding = slotidentifiertypecodinglist.get(slotidentifiertypecodingi);

		/******************** Slot_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(slotidentifiertypecodingi == 0) {s.addSlotIdTypCdgDsply("[[");}
		if(slotidentifiertypecoding.hasDisplay()) {

			s.addSlotIdTypCdgDsply(String.valueOf(slotidentifiertypecoding.getDisplay()));
		} else {
			s.addSlotIdTypCdgDsply("NULL");
		}

		if(slotidentifiertypecodingi == slotidentifiertypecodinglist.size()-1) {s.addSlotIdTypCdgDsply("]]");}


		/******************** Slot_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(slotidentifiertypecodingi == 0) {s.addSlotIdTypCdgVrsn("[[");}
		if(slotidentifiertypecoding.hasVersion()) {

			s.addSlotIdTypCdgVrsn(String.valueOf(slotidentifiertypecoding.getVersion()));
		} else {
			s.addSlotIdTypCdgVrsn("NULL");
		}

		if(slotidentifiertypecodingi == slotidentifiertypecodinglist.size()-1) {s.addSlotIdTypCdgVrsn("]]");}


		/******************** Slot_Id_Typ_Cdg_Cd ********************************************************************************/
		if(slotidentifiertypecodingi == 0) {s.addSlotIdTypCdgCd("[[");}
		if(slotidentifiertypecoding.hasCode()) {

			s.addSlotIdTypCdgCd(String.valueOf(slotidentifiertypecoding.getCode()));
		} else {
			s.addSlotIdTypCdgCd("NULL");
		}

		if(slotidentifiertypecodingi == slotidentifiertypecodinglist.size()-1) {s.addSlotIdTypCdgCd("]]");}


		/******************** Slot_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(slotidentifiertypecodingi == 0) {s.addSlotIdTypCdgUsrSltd("[[");}
		if(slotidentifiertypecoding.hasUserSelected()) {

			s.addSlotIdTypCdgUsrSltd(String.valueOf(slotidentifiertypecoding.getUserSelected()));
		} else {
			s.addSlotIdTypCdgUsrSltd("NULL");
		}

		if(slotidentifiertypecodingi == slotidentifiertypecodinglist.size()-1) {s.addSlotIdTypCdgUsrSltd("]]");}


		/******************** Slot_Id_Typ_Cdg_Sys ********************************************************************************/
		if(slotidentifiertypecodingi == 0) {s.addSlotIdTypCdgSys("[[");}
		if(slotidentifiertypecoding.hasSystem()) {

			s.addSlotIdTypCdgSys(String.valueOf(slotidentifiertypecoding.getSystem()));
		} else {
			s.addSlotIdTypCdgSys("NULL");
		}

		if(slotidentifiertypecodingi == slotidentifiertypecodinglist.size()-1) {s.addSlotIdTypCdgSys("]]");}


		 };
		/******************** slotidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period slotidentifierperiod = slotidentifier.getPeriod();

		/******************** Slot_Id_Prd_Strt ********************************************************************************/
		if(slotidentifieri == 0) {s.addSlotIdPrdStrt("[");}
		if(slotidentifierperiod.hasStart()) {

			s.addSlotIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(slotidentifierperiod.getStart())+"\"");
		} else {
			s.addSlotIdPrdStrt("NULL");
		}

		if(slotidentifieri == slotidentifierlist.size()-1) {s.addSlotIdPrdStrt("]");}


		/******************** Slot_Id_Prd_End ********************************************************************************/
		if(slotidentifieri == 0) {s.addSlotIdPrdEnd("[");}
		if(slotidentifierperiod.hasEnd()) {

			s.addSlotIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(slotidentifierperiod.getEnd())+"\"");
		} else {
			s.addSlotIdPrdEnd("NULL");
		}

		if(slotidentifieri == slotidentifierlist.size()-1) {s.addSlotIdPrdEnd("]");}


		/******************** slotidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse slotidentifieruse = slotidentifier.getUse();
		if(slotidentifieruse!=null) {
		if(slotidentifieri == 0) {

		s.addSlotIdUse("[");		}
			s.addSlotIdUse(slotidentifieruse.toCode());
		if(slotidentifieri == slotidentifierlist.size()-1) {

		s.addSlotIdUse("]");		}

		} else {
			s.addSlotIdUse("NULL");
		}

		/******************** Slot_Id_Assigner ********************************************************************************/
		if(slotidentifieri == 0) {s.addSlotIdAssigner("[");}
		if(slotidentifier.hasAssigner()) {

			if(slotidentifier.getAssigner().getReference() != null) {
			s.addSlotIdAssigner(slotidentifier.getAssigner().getReference());
			}
		} else {
			s.addSlotIdAssigner("NULL");
		}

		if(slotidentifieri == slotidentifierlist.size()-1) {s.addSlotIdAssigner("]");}


		/******************** Slot_Id_Sys ********************************************************************************/
		if(slotidentifieri == 0) {s.addSlotIdSys("[");}
		if(slotidentifier.hasSystem()) {

			s.addSlotIdSys(String.valueOf(slotidentifier.getSystem()));
		} else {
			s.addSlotIdSys("NULL");
		}

		if(slotidentifieri == slotidentifierlist.size()-1) {s.addSlotIdSys("]");}


		 };
		/******************** slotservicecategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> slotservicecategorylist = slot.getServiceCategory();
		for(int slotservicecategoryi = 0; slotservicecategoryi<slotservicecategorylist.size();slotservicecategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  slotservicecategory = slotservicecategorylist.get(slotservicecategoryi);

		/******************** Slot_SrvCtgry_Txt ********************************************************************************/
		if(slotservicecategoryi == 0) {s.addSlotSrvCtgryTxt("[");}
		if(slotservicecategory.hasText()) {

			s.addSlotSrvCtgryTxt(String.valueOf(slotservicecategory.getText()));
		} else {
			s.addSlotSrvCtgryTxt("NULL");
		}

		if(slotservicecategoryi == slotservicecategorylist.size()-1) {s.addSlotSrvCtgryTxt("]");}


		/******************** slotservicecategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> slotservicecategorycodinglist = slotservicecategory.getCoding();
		for(int slotservicecategorycodingi = 0; slotservicecategorycodingi<slotservicecategorycodinglist.size();slotservicecategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  slotservicecategorycoding = slotservicecategorycodinglist.get(slotservicecategorycodingi);

		/******************** Slot_SrvCtgry_Cdg_Dsply ********************************************************************************/
		if(slotservicecategorycodingi == 0) {s.addSlotSrvCtgryCdgDsply("[[");}
		if(slotservicecategorycoding.hasDisplay()) {

			s.addSlotSrvCtgryCdgDsply(String.valueOf(slotservicecategorycoding.getDisplay()));
		} else {
			s.addSlotSrvCtgryCdgDsply("NULL");
		}

		if(slotservicecategorycodingi == slotservicecategorycodinglist.size()-1) {s.addSlotSrvCtgryCdgDsply("]]");}


		/******************** Slot_SrvCtgry_Cdg_Vrsn ********************************************************************************/
		if(slotservicecategorycodingi == 0) {s.addSlotSrvCtgryCdgVrsn("[[");}
		if(slotservicecategorycoding.hasVersion()) {

			s.addSlotSrvCtgryCdgVrsn(String.valueOf(slotservicecategorycoding.getVersion()));
		} else {
			s.addSlotSrvCtgryCdgVrsn("NULL");
		}

		if(slotservicecategorycodingi == slotservicecategorycodinglist.size()-1) {s.addSlotSrvCtgryCdgVrsn("]]");}


		/******************** Slot_SrvCtgry_Cdg_Cd ********************************************************************************/
		if(slotservicecategorycodingi == 0) {s.addSlotSrvCtgryCdgCd("[[");}
		if(slotservicecategorycoding.hasCode()) {

			s.addSlotSrvCtgryCdgCd(String.valueOf(slotservicecategorycoding.getCode()));
		} else {
			s.addSlotSrvCtgryCdgCd("NULL");
		}

		if(slotservicecategorycodingi == slotservicecategorycodinglist.size()-1) {s.addSlotSrvCtgryCdgCd("]]");}


		/******************** Slot_SrvCtgry_Cdg_UsrSltd ********************************************************************************/
		if(slotservicecategorycodingi == 0) {s.addSlotSrvCtgryCdgUsrSltd("[[");}
		if(slotservicecategorycoding.hasUserSelected()) {

			s.addSlotSrvCtgryCdgUsrSltd(String.valueOf(slotservicecategorycoding.getUserSelected()));
		} else {
			s.addSlotSrvCtgryCdgUsrSltd("NULL");
		}

		if(slotservicecategorycodingi == slotservicecategorycodinglist.size()-1) {s.addSlotSrvCtgryCdgUsrSltd("]]");}


		/******************** Slot_SrvCtgry_Cdg_Sys ********************************************************************************/
		if(slotservicecategorycodingi == 0) {s.addSlotSrvCtgryCdgSys("[[");}
		if(slotservicecategorycoding.hasSystem()) {

			s.addSlotSrvCtgryCdgSys(String.valueOf(slotservicecategorycoding.getSystem()));
		} else {
			s.addSlotSrvCtgryCdgSys("NULL");
		}

		if(slotservicecategorycodingi == slotservicecategorycodinglist.size()-1) {s.addSlotSrvCtgryCdgSys("]]");}


		 };
		 };
		/******************** slotspecialty ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> slotspecialtylist = slot.getSpecialty();
		for(int slotspecialtyi = 0; slotspecialtyi<slotspecialtylist.size();slotspecialtyi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  slotspecialty = slotspecialtylist.get(slotspecialtyi);

		/******************** Slot_Spclty_Txt ********************************************************************************/
		if(slotspecialtyi == 0) {s.addSlotSpcltyTxt("[");}
		if(slotspecialty.hasText()) {

			s.addSlotSpcltyTxt(String.valueOf(slotspecialty.getText()));
		} else {
			s.addSlotSpcltyTxt("NULL");
		}

		if(slotspecialtyi == slotspecialtylist.size()-1) {s.addSlotSpcltyTxt("]");}


		/******************** slotspecialtycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> slotspecialtycodinglist = slotspecialty.getCoding();
		for(int slotspecialtycodingi = 0; slotspecialtycodingi<slotspecialtycodinglist.size();slotspecialtycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  slotspecialtycoding = slotspecialtycodinglist.get(slotspecialtycodingi);

		/******************** Slot_Spclty_Cdg_Dsply ********************************************************************************/
		if(slotspecialtycodingi == 0) {s.addSlotSpcltyCdgDsply("[[");}
		if(slotspecialtycoding.hasDisplay()) {

			s.addSlotSpcltyCdgDsply(String.valueOf(slotspecialtycoding.getDisplay()));
		} else {
			s.addSlotSpcltyCdgDsply("NULL");
		}

		if(slotspecialtycodingi == slotspecialtycodinglist.size()-1) {s.addSlotSpcltyCdgDsply("]]");}


		/******************** Slot_Spclty_Cdg_Vrsn ********************************************************************************/
		if(slotspecialtycodingi == 0) {s.addSlotSpcltyCdgVrsn("[[");}
		if(slotspecialtycoding.hasVersion()) {

			s.addSlotSpcltyCdgVrsn(String.valueOf(slotspecialtycoding.getVersion()));
		} else {
			s.addSlotSpcltyCdgVrsn("NULL");
		}

		if(slotspecialtycodingi == slotspecialtycodinglist.size()-1) {s.addSlotSpcltyCdgVrsn("]]");}


		/******************** Slot_Spclty_Cdg_Cd ********************************************************************************/
		if(slotspecialtycodingi == 0) {s.addSlotSpcltyCdgCd("[[");}
		if(slotspecialtycoding.hasCode()) {

			s.addSlotSpcltyCdgCd(String.valueOf(slotspecialtycoding.getCode()));
		} else {
			s.addSlotSpcltyCdgCd("NULL");
		}

		if(slotspecialtycodingi == slotspecialtycodinglist.size()-1) {s.addSlotSpcltyCdgCd("]]");}


		/******************** Slot_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(slotspecialtycodingi == 0) {s.addSlotSpcltyCdgUsrSltd("[[");}
		if(slotspecialtycoding.hasUserSelected()) {

			s.addSlotSpcltyCdgUsrSltd(String.valueOf(slotspecialtycoding.getUserSelected()));
		} else {
			s.addSlotSpcltyCdgUsrSltd("NULL");
		}

		if(slotspecialtycodingi == slotspecialtycodinglist.size()-1) {s.addSlotSpcltyCdgUsrSltd("]]");}


		/******************** Slot_Spclty_Cdg_Sys ********************************************************************************/
		if(slotspecialtycodingi == 0) {s.addSlotSpcltyCdgSys("[[");}
		if(slotspecialtycoding.hasSystem()) {

			s.addSlotSpcltyCdgSys(String.valueOf(slotspecialtycoding.getSystem()));
		} else {
			s.addSlotSpcltyCdgSys("NULL");
		}

		if(slotspecialtycodingi == slotspecialtycodinglist.size()-1) {s.addSlotSpcltyCdgSys("]]");}


		 };
		 };
		/******************** Slot_Schdl ********************************************************************************/
		if(slot.hasSchedule()) {

			if(slot.getSchedule().getReference() != null) {
			s.addSlotSchdl(slot.getSchedule().getReference());
			}
		} else {
			s.addSlotSchdl("NULL");
		}


		/******************** slotappointmenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept slotappointmenttype = slot.getAppointmentType();

		/******************** Slot_AppmntTyp_Txt ********************************************************************************/
		if(slotappointmenttype.hasText()) {

			s.addSlotAppmntTypTxt(String.valueOf(slotappointmenttype.getText()));
		} else {
			s.addSlotAppmntTypTxt("NULL");
		}


		/******************** slotappointmenttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> slotappointmenttypecodinglist = slotappointmenttype.getCoding();
		for(int slotappointmenttypecodingi = 0; slotappointmenttypecodingi<slotappointmenttypecodinglist.size();slotappointmenttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  slotappointmenttypecoding = slotappointmenttypecodinglist.get(slotappointmenttypecodingi);

		/******************** Slot_AppmntTyp_Cdg_Dsply ********************************************************************************/
		if(slotappointmenttypecodingi == 0) {s.addSlotAppmntTypCdgDsply("[");}
		if(slotappointmenttypecoding.hasDisplay()) {

			s.addSlotAppmntTypCdgDsply(String.valueOf(slotappointmenttypecoding.getDisplay()));
		} else {
			s.addSlotAppmntTypCdgDsply("NULL");
		}

		if(slotappointmenttypecodingi == slotappointmenttypecodinglist.size()-1) {s.addSlotAppmntTypCdgDsply("]");}


		/******************** Slot_AppmntTyp_Cdg_Vrsn ********************************************************************************/
		if(slotappointmenttypecodingi == 0) {s.addSlotAppmntTypCdgVrsn("[");}
		if(slotappointmenttypecoding.hasVersion()) {

			s.addSlotAppmntTypCdgVrsn(String.valueOf(slotappointmenttypecoding.getVersion()));
		} else {
			s.addSlotAppmntTypCdgVrsn("NULL");
		}

		if(slotappointmenttypecodingi == slotappointmenttypecodinglist.size()-1) {s.addSlotAppmntTypCdgVrsn("]");}


		/******************** Slot_AppmntTyp_Cdg_Cd ********************************************************************************/
		if(slotappointmenttypecodingi == 0) {s.addSlotAppmntTypCdgCd("[");}
		if(slotappointmenttypecoding.hasCode()) {

			s.addSlotAppmntTypCdgCd(String.valueOf(slotappointmenttypecoding.getCode()));
		} else {
			s.addSlotAppmntTypCdgCd("NULL");
		}

		if(slotappointmenttypecodingi == slotappointmenttypecodinglist.size()-1) {s.addSlotAppmntTypCdgCd("]");}


		/******************** Slot_AppmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(slotappointmenttypecodingi == 0) {s.addSlotAppmntTypCdgUsrSltd("[");}
		if(slotappointmenttypecoding.hasUserSelected()) {

			s.addSlotAppmntTypCdgUsrSltd(String.valueOf(slotappointmenttypecoding.getUserSelected()));
		} else {
			s.addSlotAppmntTypCdgUsrSltd("NULL");
		}

		if(slotappointmenttypecodingi == slotappointmenttypecodinglist.size()-1) {s.addSlotAppmntTypCdgUsrSltd("]");}


		/******************** Slot_AppmntTyp_Cdg_Sys ********************************************************************************/
		if(slotappointmenttypecodingi == 0) {s.addSlotAppmntTypCdgSys("[");}
		if(slotappointmenttypecoding.hasSystem()) {

			s.addSlotAppmntTypCdgSys(String.valueOf(slotappointmenttypecoding.getSystem()));
		} else {
			s.addSlotAppmntTypCdgSys("NULL");
		}

		if(slotappointmenttypecodingi == slotappointmenttypecodinglist.size()-1) {s.addSlotAppmntTypCdgSys("]");}


		 };
		/******************** Slot_Strt ********************************************************************************/
		if(slot.hasStart()) {

			s.addSlotStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(slot.getStart())+"\"");
		} else {
			s.addSlotStrt("NULL");
		}


		/******************** Slot_End ********************************************************************************/
		if(slot.hasEnd()) {

			s.addSlotEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(slot.getEnd())+"\"");
		} else {
			s.addSlotEnd("NULL");
		}


		/******************** Slot_Overbooked ********************************************************************************/
		if(slot.hasOverbooked()) {

			s.addSlotOverbooked(String.valueOf(slot.getOverbooked()));
		} else {
			s.addSlotOverbooked("NULL");
		}


		/******************** slotservicetype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> slotservicetypelist = slot.getServiceType();
		for(int slotservicetypei = 0; slotservicetypei<slotservicetypelist.size();slotservicetypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  slotservicetype = slotservicetypelist.get(slotservicetypei);

		/******************** Slot_SrvTyp_Txt ********************************************************************************/
		if(slotservicetypei == 0) {s.addSlotSrvTypTxt("[");}
		if(slotservicetype.hasText()) {

			s.addSlotSrvTypTxt(String.valueOf(slotservicetype.getText()));
		} else {
			s.addSlotSrvTypTxt("NULL");
		}

		if(slotservicetypei == slotservicetypelist.size()-1) {s.addSlotSrvTypTxt("]");}


		/******************** slotservicetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> slotservicetypecodinglist = slotservicetype.getCoding();
		for(int slotservicetypecodingi = 0; slotservicetypecodingi<slotservicetypecodinglist.size();slotservicetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  slotservicetypecoding = slotservicetypecodinglist.get(slotservicetypecodingi);

		/******************** Slot_SrvTyp_Cdg_Dsply ********************************************************************************/
		if(slotservicetypecodingi == 0) {s.addSlotSrvTypCdgDsply("[[");}
		if(slotservicetypecoding.hasDisplay()) {

			s.addSlotSrvTypCdgDsply(String.valueOf(slotservicetypecoding.getDisplay()));
		} else {
			s.addSlotSrvTypCdgDsply("NULL");
		}

		if(slotservicetypecodingi == slotservicetypecodinglist.size()-1) {s.addSlotSrvTypCdgDsply("]]");}


		/******************** Slot_SrvTyp_Cdg_Vrsn ********************************************************************************/
		if(slotservicetypecodingi == 0) {s.addSlotSrvTypCdgVrsn("[[");}
		if(slotservicetypecoding.hasVersion()) {

			s.addSlotSrvTypCdgVrsn(String.valueOf(slotservicetypecoding.getVersion()));
		} else {
			s.addSlotSrvTypCdgVrsn("NULL");
		}

		if(slotservicetypecodingi == slotservicetypecodinglist.size()-1) {s.addSlotSrvTypCdgVrsn("]]");}


		/******************** Slot_SrvTyp_Cdg_Cd ********************************************************************************/
		if(slotservicetypecodingi == 0) {s.addSlotSrvTypCdgCd("[[");}
		if(slotservicetypecoding.hasCode()) {

			s.addSlotSrvTypCdgCd(String.valueOf(slotservicetypecoding.getCode()));
		} else {
			s.addSlotSrvTypCdgCd("NULL");
		}

		if(slotservicetypecodingi == slotservicetypecodinglist.size()-1) {s.addSlotSrvTypCdgCd("]]");}


		/******************** Slot_SrvTyp_Cdg_UsrSltd ********************************************************************************/
		if(slotservicetypecodingi == 0) {s.addSlotSrvTypCdgUsrSltd("[[");}
		if(slotservicetypecoding.hasUserSelected()) {

			s.addSlotSrvTypCdgUsrSltd(String.valueOf(slotservicetypecoding.getUserSelected()));
		} else {
			s.addSlotSrvTypCdgUsrSltd("NULL");
		}

		if(slotservicetypecodingi == slotservicetypecodinglist.size()-1) {s.addSlotSrvTypCdgUsrSltd("]]");}


		/******************** Slot_SrvTyp_Cdg_Sys ********************************************************************************/
		if(slotservicetypecodingi == 0) {s.addSlotSrvTypCdgSys("[[");}
		if(slotservicetypecoding.hasSystem()) {

			s.addSlotSrvTypCdgSys(String.valueOf(slotservicetypecoding.getSystem()));
		} else {
			s.addSlotSrvTypCdgSys("NULL");
		}

		if(slotservicetypecodingi == slotservicetypecodinglist.size()-1) {s.addSlotSrvTypCdgSys("]]");}


		 };
		 };
		return s;
	}
}
