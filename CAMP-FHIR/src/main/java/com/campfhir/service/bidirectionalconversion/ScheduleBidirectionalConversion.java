package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Schedule;
public class ScheduleBidirectionalConversion 
{
	public Schedule Schedules(org.hl7.fhir.r4.model.Schedule schedule) throws ParseException
	{
		 main.java.com.campfhir.model.Schedule s = new  main.java.com.campfhir.model.Schedule();

		/******************** id ********************************************************************************/
		s.setId(schedule.getIdElement().getIdPart());

		/******************** Schdl_Comment ********************************************************************************/
		if(schedule.hasComment()) {

			s.addSchdlComment(String.valueOf(schedule.getComment()));
		} else {
			s.addSchdlComment("NULL");
		}


		/******************** scheduleidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> scheduleidentifierlist = schedule.getIdentifier();
		for(int scheduleidentifieri = 0; scheduleidentifieri<scheduleidentifierlist.size();scheduleidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  scheduleidentifier = scheduleidentifierlist.get(scheduleidentifieri);

		/******************** Schdl_Id_Vl ********************************************************************************/
		if(scheduleidentifieri == 0) {s.addSchdlIdVl("[");}
		if(scheduleidentifier.hasValue()) {

			s.addSchdlIdVl(String.valueOf(scheduleidentifier.getValue()));
		} else {
			s.addSchdlIdVl("NULL");
		}

		if(scheduleidentifieri == scheduleidentifierlist.size()-1) {s.addSchdlIdVl("]");}


		/******************** scheduleidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept scheduleidentifiertype = scheduleidentifier.getType();

		/******************** Schdl_Id_Typ_Txt ********************************************************************************/
		if(scheduleidentifieri == 0) {s.addSchdlIdTypTxt("[");}
		if(scheduleidentifiertype.hasText()) {

			s.addSchdlIdTypTxt(String.valueOf(scheduleidentifiertype.getText()));
		} else {
			s.addSchdlIdTypTxt("NULL");
		}

		if(scheduleidentifieri == scheduleidentifierlist.size()-1) {s.addSchdlIdTypTxt("]");}


		/******************** scheduleidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> scheduleidentifiertypecodinglist = scheduleidentifiertype.getCoding();
		for(int scheduleidentifiertypecodingi = 0; scheduleidentifiertypecodingi<scheduleidentifiertypecodinglist.size();scheduleidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  scheduleidentifiertypecoding = scheduleidentifiertypecodinglist.get(scheduleidentifiertypecodingi);

		/******************** Schdl_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(scheduleidentifiertypecodingi == 0) {s.addSchdlIdTypCdgDsply("[[");}
		if(scheduleidentifiertypecoding.hasDisplay()) {

			s.addSchdlIdTypCdgDsply(String.valueOf(scheduleidentifiertypecoding.getDisplay()));
		} else {
			s.addSchdlIdTypCdgDsply("NULL");
		}

		if(scheduleidentifiertypecodingi == scheduleidentifiertypecodinglist.size()-1) {s.addSchdlIdTypCdgDsply("]]");}


		/******************** Schdl_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(scheduleidentifiertypecodingi == 0) {s.addSchdlIdTypCdgVrsn("[[");}
		if(scheduleidentifiertypecoding.hasVersion()) {

			s.addSchdlIdTypCdgVrsn(String.valueOf(scheduleidentifiertypecoding.getVersion()));
		} else {
			s.addSchdlIdTypCdgVrsn("NULL");
		}

		if(scheduleidentifiertypecodingi == scheduleidentifiertypecodinglist.size()-1) {s.addSchdlIdTypCdgVrsn("]]");}


		/******************** Schdl_Id_Typ_Cdg_Cd ********************************************************************************/
		if(scheduleidentifiertypecodingi == 0) {s.addSchdlIdTypCdgCd("[[");}
		if(scheduleidentifiertypecoding.hasCode()) {

			s.addSchdlIdTypCdgCd(String.valueOf(scheduleidentifiertypecoding.getCode()));
		} else {
			s.addSchdlIdTypCdgCd("NULL");
		}

		if(scheduleidentifiertypecodingi == scheduleidentifiertypecodinglist.size()-1) {s.addSchdlIdTypCdgCd("]]");}


		/******************** Schdl_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(scheduleidentifiertypecodingi == 0) {s.addSchdlIdTypCdgUsrSltd("[[");}
		if(scheduleidentifiertypecoding.hasUserSelected()) {

			s.addSchdlIdTypCdgUsrSltd(String.valueOf(scheduleidentifiertypecoding.getUserSelected()));
		} else {
			s.addSchdlIdTypCdgUsrSltd("NULL");
		}

		if(scheduleidentifiertypecodingi == scheduleidentifiertypecodinglist.size()-1) {s.addSchdlIdTypCdgUsrSltd("]]");}


		/******************** Schdl_Id_Typ_Cdg_Sys ********************************************************************************/
		if(scheduleidentifiertypecodingi == 0) {s.addSchdlIdTypCdgSys("[[");}
		if(scheduleidentifiertypecoding.hasSystem()) {

			s.addSchdlIdTypCdgSys(String.valueOf(scheduleidentifiertypecoding.getSystem()));
		} else {
			s.addSchdlIdTypCdgSys("NULL");
		}

		if(scheduleidentifiertypecodingi == scheduleidentifiertypecodinglist.size()-1) {s.addSchdlIdTypCdgSys("]]");}


		 };
		/******************** scheduleidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period scheduleidentifierperiod = scheduleidentifier.getPeriod();

		/******************** Schdl_Id_Prd_Strt ********************************************************************************/
		if(scheduleidentifieri == 0) {s.addSchdlIdPrdStrt("[");}
		if(scheduleidentifierperiod.hasStart()) {

			s.addSchdlIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(scheduleidentifierperiod.getStart())+"\"");
		} else {
			s.addSchdlIdPrdStrt("NULL");
		}

		if(scheduleidentifieri == scheduleidentifierlist.size()-1) {s.addSchdlIdPrdStrt("]");}


		/******************** Schdl_Id_Prd_End ********************************************************************************/
		if(scheduleidentifieri == 0) {s.addSchdlIdPrdEnd("[");}
		if(scheduleidentifierperiod.hasEnd()) {

			s.addSchdlIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(scheduleidentifierperiod.getEnd())+"\"");
		} else {
			s.addSchdlIdPrdEnd("NULL");
		}

		if(scheduleidentifieri == scheduleidentifierlist.size()-1) {s.addSchdlIdPrdEnd("]");}


		/******************** scheduleidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse scheduleidentifieruse = scheduleidentifier.getUse();
		if(scheduleidentifieruse!=null) {
		if(scheduleidentifieri == 0) {

		s.addSchdlIdUse("[");		}
			s.addSchdlIdUse(scheduleidentifieruse.toCode());
		if(scheduleidentifieri == scheduleidentifierlist.size()-1) {

		s.addSchdlIdUse("]");		}

		} else {
			s.addSchdlIdUse("NULL");
		}

		/******************** Schdl_Id_Assigner ********************************************************************************/
		if(scheduleidentifieri == 0) {s.addSchdlIdAssigner("[");}
		if(scheduleidentifier.hasAssigner()) {

			if(scheduleidentifier.getAssigner().getReference() != null) {
			s.addSchdlIdAssigner(scheduleidentifier.getAssigner().getReference());
			}
		} else {
			s.addSchdlIdAssigner("NULL");
		}

		if(scheduleidentifieri == scheduleidentifierlist.size()-1) {s.addSchdlIdAssigner("]");}


		/******************** Schdl_Id_Sys ********************************************************************************/
		if(scheduleidentifieri == 0) {s.addSchdlIdSys("[");}
		if(scheduleidentifier.hasSystem()) {

			s.addSchdlIdSys(String.valueOf(scheduleidentifier.getSystem()));
		} else {
			s.addSchdlIdSys("NULL");
		}

		if(scheduleidentifieri == scheduleidentifierlist.size()-1) {s.addSchdlIdSys("]");}


		 };
		/******************** scheduleplanninghorizon ********************************************************************************/
		org.hl7.fhir.r4.model.Period scheduleplanninghorizon = schedule.getPlanningHorizon();

		/******************** Schdl_PlnningHorizon_Strt ********************************************************************************/
		if(scheduleplanninghorizon.hasStart()) {

			s.addSchdlPlnningHorizonStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(scheduleplanninghorizon.getStart())+"\"");
		} else {
			s.addSchdlPlnningHorizonStrt("NULL");
		}


		/******************** Schdl_PlnningHorizon_End ********************************************************************************/
		if(scheduleplanninghorizon.hasEnd()) {

			s.addSchdlPlnningHorizonEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(scheduleplanninghorizon.getEnd())+"\"");
		} else {
			s.addSchdlPlnningHorizonEnd("NULL");
		}


		/******************** scheduleservicecategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> scheduleservicecategorylist = schedule.getServiceCategory();
		for(int scheduleservicecategoryi = 0; scheduleservicecategoryi<scheduleservicecategorylist.size();scheduleservicecategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  scheduleservicecategory = scheduleservicecategorylist.get(scheduleservicecategoryi);

		/******************** Schdl_SrvCtgry_Txt ********************************************************************************/
		if(scheduleservicecategoryi == 0) {s.addSchdlSrvCtgryTxt("[");}
		if(scheduleservicecategory.hasText()) {

			s.addSchdlSrvCtgryTxt(String.valueOf(scheduleservicecategory.getText()));
		} else {
			s.addSchdlSrvCtgryTxt("NULL");
		}

		if(scheduleservicecategoryi == scheduleservicecategorylist.size()-1) {s.addSchdlSrvCtgryTxt("]");}


		/******************** scheduleservicecategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> scheduleservicecategorycodinglist = scheduleservicecategory.getCoding();
		for(int scheduleservicecategorycodingi = 0; scheduleservicecategorycodingi<scheduleservicecategorycodinglist.size();scheduleservicecategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  scheduleservicecategorycoding = scheduleservicecategorycodinglist.get(scheduleservicecategorycodingi);

		/******************** Schdl_SrvCtgry_Cdg_Dsply ********************************************************************************/
		if(scheduleservicecategorycodingi == 0) {s.addSchdlSrvCtgryCdgDsply("[[");}
		if(scheduleservicecategorycoding.hasDisplay()) {

			s.addSchdlSrvCtgryCdgDsply(String.valueOf(scheduleservicecategorycoding.getDisplay()));
		} else {
			s.addSchdlSrvCtgryCdgDsply("NULL");
		}

		if(scheduleservicecategorycodingi == scheduleservicecategorycodinglist.size()-1) {s.addSchdlSrvCtgryCdgDsply("]]");}


		/******************** Schdl_SrvCtgry_Cdg_Vrsn ********************************************************************************/
		if(scheduleservicecategorycodingi == 0) {s.addSchdlSrvCtgryCdgVrsn("[[");}
		if(scheduleservicecategorycoding.hasVersion()) {

			s.addSchdlSrvCtgryCdgVrsn(String.valueOf(scheduleservicecategorycoding.getVersion()));
		} else {
			s.addSchdlSrvCtgryCdgVrsn("NULL");
		}

		if(scheduleservicecategorycodingi == scheduleservicecategorycodinglist.size()-1) {s.addSchdlSrvCtgryCdgVrsn("]]");}


		/******************** Schdl_SrvCtgry_Cdg_Cd ********************************************************************************/
		if(scheduleservicecategorycodingi == 0) {s.addSchdlSrvCtgryCdgCd("[[");}
		if(scheduleservicecategorycoding.hasCode()) {

			s.addSchdlSrvCtgryCdgCd(String.valueOf(scheduleservicecategorycoding.getCode()));
		} else {
			s.addSchdlSrvCtgryCdgCd("NULL");
		}

		if(scheduleservicecategorycodingi == scheduleservicecategorycodinglist.size()-1) {s.addSchdlSrvCtgryCdgCd("]]");}


		/******************** Schdl_SrvCtgry_Cdg_UsrSltd ********************************************************************************/
		if(scheduleservicecategorycodingi == 0) {s.addSchdlSrvCtgryCdgUsrSltd("[[");}
		if(scheduleservicecategorycoding.hasUserSelected()) {

			s.addSchdlSrvCtgryCdgUsrSltd(String.valueOf(scheduleservicecategorycoding.getUserSelected()));
		} else {
			s.addSchdlSrvCtgryCdgUsrSltd("NULL");
		}

		if(scheduleservicecategorycodingi == scheduleservicecategorycodinglist.size()-1) {s.addSchdlSrvCtgryCdgUsrSltd("]]");}


		/******************** Schdl_SrvCtgry_Cdg_Sys ********************************************************************************/
		if(scheduleservicecategorycodingi == 0) {s.addSchdlSrvCtgryCdgSys("[[");}
		if(scheduleservicecategorycoding.hasSystem()) {

			s.addSchdlSrvCtgryCdgSys(String.valueOf(scheduleservicecategorycoding.getSystem()));
		} else {
			s.addSchdlSrvCtgryCdgSys("NULL");
		}

		if(scheduleservicecategorycodingi == scheduleservicecategorycodinglist.size()-1) {s.addSchdlSrvCtgryCdgSys("]]");}


		 };
		 };
		/******************** schedulespecialty ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> schedulespecialtylist = schedule.getSpecialty();
		for(int schedulespecialtyi = 0; schedulespecialtyi<schedulespecialtylist.size();schedulespecialtyi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  schedulespecialty = schedulespecialtylist.get(schedulespecialtyi);

		/******************** Schdl_Spclty_Txt ********************************************************************************/
		if(schedulespecialtyi == 0) {s.addSchdlSpcltyTxt("[");}
		if(schedulespecialty.hasText()) {

			s.addSchdlSpcltyTxt(String.valueOf(schedulespecialty.getText()));
		} else {
			s.addSchdlSpcltyTxt("NULL");
		}

		if(schedulespecialtyi == schedulespecialtylist.size()-1) {s.addSchdlSpcltyTxt("]");}


		/******************** schedulespecialtycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> schedulespecialtycodinglist = schedulespecialty.getCoding();
		for(int schedulespecialtycodingi = 0; schedulespecialtycodingi<schedulespecialtycodinglist.size();schedulespecialtycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  schedulespecialtycoding = schedulespecialtycodinglist.get(schedulespecialtycodingi);

		/******************** Schdl_Spclty_Cdg_Dsply ********************************************************************************/
		if(schedulespecialtycodingi == 0) {s.addSchdlSpcltyCdgDsply("[[");}
		if(schedulespecialtycoding.hasDisplay()) {

			s.addSchdlSpcltyCdgDsply(String.valueOf(schedulespecialtycoding.getDisplay()));
		} else {
			s.addSchdlSpcltyCdgDsply("NULL");
		}

		if(schedulespecialtycodingi == schedulespecialtycodinglist.size()-1) {s.addSchdlSpcltyCdgDsply("]]");}


		/******************** Schdl_Spclty_Cdg_Vrsn ********************************************************************************/
		if(schedulespecialtycodingi == 0) {s.addSchdlSpcltyCdgVrsn("[[");}
		if(schedulespecialtycoding.hasVersion()) {

			s.addSchdlSpcltyCdgVrsn(String.valueOf(schedulespecialtycoding.getVersion()));
		} else {
			s.addSchdlSpcltyCdgVrsn("NULL");
		}

		if(schedulespecialtycodingi == schedulespecialtycodinglist.size()-1) {s.addSchdlSpcltyCdgVrsn("]]");}


		/******************** Schdl_Spclty_Cdg_Cd ********************************************************************************/
		if(schedulespecialtycodingi == 0) {s.addSchdlSpcltyCdgCd("[[");}
		if(schedulespecialtycoding.hasCode()) {

			s.addSchdlSpcltyCdgCd(String.valueOf(schedulespecialtycoding.getCode()));
		} else {
			s.addSchdlSpcltyCdgCd("NULL");
		}

		if(schedulespecialtycodingi == schedulespecialtycodinglist.size()-1) {s.addSchdlSpcltyCdgCd("]]");}


		/******************** Schdl_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(schedulespecialtycodingi == 0) {s.addSchdlSpcltyCdgUsrSltd("[[");}
		if(schedulespecialtycoding.hasUserSelected()) {

			s.addSchdlSpcltyCdgUsrSltd(String.valueOf(schedulespecialtycoding.getUserSelected()));
		} else {
			s.addSchdlSpcltyCdgUsrSltd("NULL");
		}

		if(schedulespecialtycodingi == schedulespecialtycodinglist.size()-1) {s.addSchdlSpcltyCdgUsrSltd("]]");}


		/******************** Schdl_Spclty_Cdg_Sys ********************************************************************************/
		if(schedulespecialtycodingi == 0) {s.addSchdlSpcltyCdgSys("[[");}
		if(schedulespecialtycoding.hasSystem()) {

			s.addSchdlSpcltyCdgSys(String.valueOf(schedulespecialtycoding.getSystem()));
		} else {
			s.addSchdlSpcltyCdgSys("NULL");
		}

		if(schedulespecialtycodingi == schedulespecialtycodinglist.size()-1) {s.addSchdlSpcltyCdgSys("]]");}


		 };
		 };
		/******************** Schdl_Active ********************************************************************************/
		if(schedule.hasActive()) {

			s.addSchdlActive(String.valueOf(schedule.getActive()));
		} else {
			s.addSchdlActive("NULL");
		}


		/******************** Schdl_Actor ********************************************************************************/
		if(schedule.hasActor()) {

			String  array = "[";
			for(int incr=0; incr<schedule.getActor().size(); incr++) {
				array = array + schedule.getActor().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSchdlActor(array);

		} else {
			s.addSchdlActor("NULL");
		}


		/******************** scheduleservicetype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> scheduleservicetypelist = schedule.getServiceType();
		for(int scheduleservicetypei = 0; scheduleservicetypei<scheduleservicetypelist.size();scheduleservicetypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  scheduleservicetype = scheduleservicetypelist.get(scheduleservicetypei);

		/******************** Schdl_SrvTyp_Txt ********************************************************************************/
		if(scheduleservicetypei == 0) {s.addSchdlSrvTypTxt("[");}
		if(scheduleservicetype.hasText()) {

			s.addSchdlSrvTypTxt(String.valueOf(scheduleservicetype.getText()));
		} else {
			s.addSchdlSrvTypTxt("NULL");
		}

		if(scheduleservicetypei == scheduleservicetypelist.size()-1) {s.addSchdlSrvTypTxt("]");}


		/******************** scheduleservicetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> scheduleservicetypecodinglist = scheduleservicetype.getCoding();
		for(int scheduleservicetypecodingi = 0; scheduleservicetypecodingi<scheduleservicetypecodinglist.size();scheduleservicetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  scheduleservicetypecoding = scheduleservicetypecodinglist.get(scheduleservicetypecodingi);

		/******************** Schdl_SrvTyp_Cdg_Dsply ********************************************************************************/
		if(scheduleservicetypecodingi == 0) {s.addSchdlSrvTypCdgDsply("[[");}
		if(scheduleservicetypecoding.hasDisplay()) {

			s.addSchdlSrvTypCdgDsply(String.valueOf(scheduleservicetypecoding.getDisplay()));
		} else {
			s.addSchdlSrvTypCdgDsply("NULL");
		}

		if(scheduleservicetypecodingi == scheduleservicetypecodinglist.size()-1) {s.addSchdlSrvTypCdgDsply("]]");}


		/******************** Schdl_SrvTyp_Cdg_Vrsn ********************************************************************************/
		if(scheduleservicetypecodingi == 0) {s.addSchdlSrvTypCdgVrsn("[[");}
		if(scheduleservicetypecoding.hasVersion()) {

			s.addSchdlSrvTypCdgVrsn(String.valueOf(scheduleservicetypecoding.getVersion()));
		} else {
			s.addSchdlSrvTypCdgVrsn("NULL");
		}

		if(scheduleservicetypecodingi == scheduleservicetypecodinglist.size()-1) {s.addSchdlSrvTypCdgVrsn("]]");}


		/******************** Schdl_SrvTyp_Cdg_Cd ********************************************************************************/
		if(scheduleservicetypecodingi == 0) {s.addSchdlSrvTypCdgCd("[[");}
		if(scheduleservicetypecoding.hasCode()) {

			s.addSchdlSrvTypCdgCd(String.valueOf(scheduleservicetypecoding.getCode()));
		} else {
			s.addSchdlSrvTypCdgCd("NULL");
		}

		if(scheduleservicetypecodingi == scheduleservicetypecodinglist.size()-1) {s.addSchdlSrvTypCdgCd("]]");}


		/******************** Schdl_SrvTyp_Cdg_UsrSltd ********************************************************************************/
		if(scheduleservicetypecodingi == 0) {s.addSchdlSrvTypCdgUsrSltd("[[");}
		if(scheduleservicetypecoding.hasUserSelected()) {

			s.addSchdlSrvTypCdgUsrSltd(String.valueOf(scheduleservicetypecoding.getUserSelected()));
		} else {
			s.addSchdlSrvTypCdgUsrSltd("NULL");
		}

		if(scheduleservicetypecodingi == scheduleservicetypecodinglist.size()-1) {s.addSchdlSrvTypCdgUsrSltd("]]");}


		/******************** Schdl_SrvTyp_Cdg_Sys ********************************************************************************/
		if(scheduleservicetypecodingi == 0) {s.addSchdlSrvTypCdgSys("[[");}
		if(scheduleservicetypecoding.hasSystem()) {

			s.addSchdlSrvTypCdgSys(String.valueOf(scheduleservicetypecoding.getSystem()));
		} else {
			s.addSchdlSrvTypCdgSys("NULL");
		}

		if(scheduleservicetypecodingi == scheduleservicetypecodinglist.size()-1) {s.addSchdlSrvTypCdgSys("]]");}


		 };
		 };
		return s;
	}
}
