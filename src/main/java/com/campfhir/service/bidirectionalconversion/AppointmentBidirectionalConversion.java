package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Appointment;
public class AppointmentBidirectionalConversion 
{
	public Appointment Appointments(org.hl7.fhir.r4.model.Appointment appointment) throws ParseException
	{
		 main.java.com.campfhir.model.Appointment a = new  main.java.com.campfhir.model.Appointment();

		/******************** id ********************************************************************************/
		a.setId(appointment.getIdElement().getIdPart());

		/******************** Appmnt_Priority ********************************************************************************/
		if(appointment.hasPriority()) {

			a.addAppmntPriority(String.valueOf(appointment.getPriority()));
		} else {
			a.addAppmntPriority("NULL");
		}


		/******************** Appmnt_Slot ********************************************************************************/
		if(appointment.hasSlot()) {

			String  array = "[";
			for(int incr=0; incr<appointment.getSlot().size(); incr++) {
				array = array + appointment.getSlot().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			a.addAppmntSlot(array);

		} else {
			a.addAppmntSlot("NULL");
		}


		/******************** Appmnt_Comment ********************************************************************************/
		if(appointment.hasComment()) {

			a.addAppmntComment(String.valueOf(appointment.getComment()));
		} else {
			a.addAppmntComment("NULL");
		}


		/******************** appointmentstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Appointment.AppointmentStatus appointmentstatus = appointment.getStatus();
		if(appointmentstatus!=null) {
			a.addAppmntSts(appointmentstatus.toCode());
		} else {
			a.addAppmntSts("NULL");
		}

		/******************** Appmnt_BasedOn ********************************************************************************/
		if(appointment.hasBasedOn()) {

			String  array = "[";
			for(int incr=0; incr<appointment.getBasedOn().size(); incr++) {
				array = array + appointment.getBasedOn().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			a.addAppmntBasedOn(array);

		} else {
			a.addAppmntBasedOn("NULL");
		}


		/******************** appointmentreasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> appointmentreasoncodelist = appointment.getReasonCode();
		for(int appointmentreasoncodei = 0; appointmentreasoncodei<appointmentreasoncodelist.size();appointmentreasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  appointmentreasoncode = appointmentreasoncodelist.get(appointmentreasoncodei);

		/******************** Appmnt_RsnCd_Txt ********************************************************************************/
		if(appointmentreasoncodei == 0) {a.addAppmntRsnCdTxt("[");}
		if(appointmentreasoncode.hasText()) {

			a.addAppmntRsnCdTxt(String.valueOf(appointmentreasoncode.getText()));
		} else {
			a.addAppmntRsnCdTxt("NULL");
		}

		if(appointmentreasoncodei == appointmentreasoncodelist.size()-1) {a.addAppmntRsnCdTxt("]");}


		/******************** appointmentreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> appointmentreasoncodecodinglist = appointmentreasoncode.getCoding();
		for(int appointmentreasoncodecodingi = 0; appointmentreasoncodecodingi<appointmentreasoncodecodinglist.size();appointmentreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  appointmentreasoncodecoding = appointmentreasoncodecodinglist.get(appointmentreasoncodecodingi);

		/******************** Appmnt_RsnCd_Cdg_Dsply ********************************************************************************/
		if(appointmentreasoncodecodingi == 0) {a.addAppmntRsnCdCdgDsply("[[");}
		if(appointmentreasoncodecoding.hasDisplay()) {

			a.addAppmntRsnCdCdgDsply(String.valueOf(appointmentreasoncodecoding.getDisplay()));
		} else {
			a.addAppmntRsnCdCdgDsply("NULL");
		}

		if(appointmentreasoncodecodingi == appointmentreasoncodecodinglist.size()-1) {a.addAppmntRsnCdCdgDsply("]]");}


		/******************** Appmnt_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(appointmentreasoncodecodingi == 0) {a.addAppmntRsnCdCdgVrsn("[[");}
		if(appointmentreasoncodecoding.hasVersion()) {

			a.addAppmntRsnCdCdgVrsn(String.valueOf(appointmentreasoncodecoding.getVersion()));
		} else {
			a.addAppmntRsnCdCdgVrsn("NULL");
		}

		if(appointmentreasoncodecodingi == appointmentreasoncodecodinglist.size()-1) {a.addAppmntRsnCdCdgVrsn("]]");}


		/******************** Appmnt_RsnCd_Cdg_Cd ********************************************************************************/
		if(appointmentreasoncodecodingi == 0) {a.addAppmntRsnCdCdgCd("[[");}
		if(appointmentreasoncodecoding.hasCode()) {

			a.addAppmntRsnCdCdgCd(String.valueOf(appointmentreasoncodecoding.getCode()));
		} else {
			a.addAppmntRsnCdCdgCd("NULL");
		}

		if(appointmentreasoncodecodingi == appointmentreasoncodecodinglist.size()-1) {a.addAppmntRsnCdCdgCd("]]");}


		/******************** Appmnt_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(appointmentreasoncodecodingi == 0) {a.addAppmntRsnCdCdgUsrSltd("[[");}
		if(appointmentreasoncodecoding.hasUserSelected()) {

			a.addAppmntRsnCdCdgUsrSltd(String.valueOf(appointmentreasoncodecoding.getUserSelected()));
		} else {
			a.addAppmntRsnCdCdgUsrSltd("NULL");
		}

		if(appointmentreasoncodecodingi == appointmentreasoncodecodinglist.size()-1) {a.addAppmntRsnCdCdgUsrSltd("]]");}


		/******************** Appmnt_RsnCd_Cdg_Sys ********************************************************************************/
		if(appointmentreasoncodecodingi == 0) {a.addAppmntRsnCdCdgSys("[[");}
		if(appointmentreasoncodecoding.hasSystem()) {

			a.addAppmntRsnCdCdgSys(String.valueOf(appointmentreasoncodecoding.getSystem()));
		} else {
			a.addAppmntRsnCdCdgSys("NULL");
		}

		if(appointmentreasoncodecodingi == appointmentreasoncodecodinglist.size()-1) {a.addAppmntRsnCdCdgSys("]]");}


		 };
		 };
		/******************** Appmnt_Dscrptn ********************************************************************************/
		if(appointment.hasDescription()) {

			a.addAppmntDscrptn(String.valueOf(appointment.getDescription()));
		} else {
			a.addAppmntDscrptn("NULL");
		}


		/******************** Appmnt_RsnRfrnc ********************************************************************************/
		if(appointment.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<appointment.getReasonReference().size(); incr++) {
				array = array + appointment.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			a.addAppmntRsnRfrnc(array);

		} else {
			a.addAppmntRsnRfrnc("NULL");
		}


		/******************** Appmnt_Created ********************************************************************************/
		if(appointment.hasCreated()) {

			a.addAppmntCreated("\""+ca.uhn.fhir.util.DateUtils.formatDate(appointment.getCreated())+"\"");
		} else {
			a.addAppmntCreated("NULL");
		}


		/******************** appointmentidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> appointmentidentifierlist = appointment.getIdentifier();
		for(int appointmentidentifieri = 0; appointmentidentifieri<appointmentidentifierlist.size();appointmentidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  appointmentidentifier = appointmentidentifierlist.get(appointmentidentifieri);

		/******************** Appmnt_Id_Vl ********************************************************************************/
		if(appointmentidentifieri == 0) {a.addAppmntIdVl("[");}
		if(appointmentidentifier.hasValue()) {

			a.addAppmntIdVl(String.valueOf(appointmentidentifier.getValue()));
		} else {
			a.addAppmntIdVl("NULL");
		}

		if(appointmentidentifieri == appointmentidentifierlist.size()-1) {a.addAppmntIdVl("]");}


		/******************** appointmentidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentidentifiertype = appointmentidentifier.getType();

		/******************** Appmnt_Id_Typ_Txt ********************************************************************************/
		if(appointmentidentifieri == 0) {a.addAppmntIdTypTxt("[");}
		if(appointmentidentifiertype.hasText()) {

			a.addAppmntIdTypTxt(String.valueOf(appointmentidentifiertype.getText()));
		} else {
			a.addAppmntIdTypTxt("NULL");
		}

		if(appointmentidentifieri == appointmentidentifierlist.size()-1) {a.addAppmntIdTypTxt("]");}


		/******************** appointmentidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> appointmentidentifiertypecodinglist = appointmentidentifiertype.getCoding();
		for(int appointmentidentifiertypecodingi = 0; appointmentidentifiertypecodingi<appointmentidentifiertypecodinglist.size();appointmentidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  appointmentidentifiertypecoding = appointmentidentifiertypecodinglist.get(appointmentidentifiertypecodingi);

		/******************** Appmnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(appointmentidentifiertypecodingi == 0) {a.addAppmntIdTypCdgDsply("[[");}
		if(appointmentidentifiertypecoding.hasDisplay()) {

			a.addAppmntIdTypCdgDsply(String.valueOf(appointmentidentifiertypecoding.getDisplay()));
		} else {
			a.addAppmntIdTypCdgDsply("NULL");
		}

		if(appointmentidentifiertypecodingi == appointmentidentifiertypecodinglist.size()-1) {a.addAppmntIdTypCdgDsply("]]");}


		/******************** Appmnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(appointmentidentifiertypecodingi == 0) {a.addAppmntIdTypCdgVrsn("[[");}
		if(appointmentidentifiertypecoding.hasVersion()) {

			a.addAppmntIdTypCdgVrsn(String.valueOf(appointmentidentifiertypecoding.getVersion()));
		} else {
			a.addAppmntIdTypCdgVrsn("NULL");
		}

		if(appointmentidentifiertypecodingi == appointmentidentifiertypecodinglist.size()-1) {a.addAppmntIdTypCdgVrsn("]]");}


		/******************** Appmnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(appointmentidentifiertypecodingi == 0) {a.addAppmntIdTypCdgCd("[[");}
		if(appointmentidentifiertypecoding.hasCode()) {

			a.addAppmntIdTypCdgCd(String.valueOf(appointmentidentifiertypecoding.getCode()));
		} else {
			a.addAppmntIdTypCdgCd("NULL");
		}

		if(appointmentidentifiertypecodingi == appointmentidentifiertypecodinglist.size()-1) {a.addAppmntIdTypCdgCd("]]");}


		/******************** Appmnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(appointmentidentifiertypecodingi == 0) {a.addAppmntIdTypCdgUsrSltd("[[");}
		if(appointmentidentifiertypecoding.hasUserSelected()) {

			a.addAppmntIdTypCdgUsrSltd(String.valueOf(appointmentidentifiertypecoding.getUserSelected()));
		} else {
			a.addAppmntIdTypCdgUsrSltd("NULL");
		}

		if(appointmentidentifiertypecodingi == appointmentidentifiertypecodinglist.size()-1) {a.addAppmntIdTypCdgUsrSltd("]]");}


		/******************** Appmnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(appointmentidentifiertypecodingi == 0) {a.addAppmntIdTypCdgSys("[[");}
		if(appointmentidentifiertypecoding.hasSystem()) {

			a.addAppmntIdTypCdgSys(String.valueOf(appointmentidentifiertypecoding.getSystem()));
		} else {
			a.addAppmntIdTypCdgSys("NULL");
		}

		if(appointmentidentifiertypecodingi == appointmentidentifiertypecodinglist.size()-1) {a.addAppmntIdTypCdgSys("]]");}


		 };
		/******************** appointmentidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period appointmentidentifierperiod = appointmentidentifier.getPeriod();

		/******************** Appmnt_Id_Prd_Strt ********************************************************************************/
		if(appointmentidentifieri == 0) {a.addAppmntIdPrdStrt("[");}
		if(appointmentidentifierperiod.hasStart()) {

			a.addAppmntIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(appointmentidentifierperiod.getStart())+"\"");
		} else {
			a.addAppmntIdPrdStrt("NULL");
		}

		if(appointmentidentifieri == appointmentidentifierlist.size()-1) {a.addAppmntIdPrdStrt("]");}


		/******************** Appmnt_Id_Prd_End ********************************************************************************/
		if(appointmentidentifieri == 0) {a.addAppmntIdPrdEnd("[");}
		if(appointmentidentifierperiod.hasEnd()) {

			a.addAppmntIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(appointmentidentifierperiod.getEnd())+"\"");
		} else {
			a.addAppmntIdPrdEnd("NULL");
		}

		if(appointmentidentifieri == appointmentidentifierlist.size()-1) {a.addAppmntIdPrdEnd("]");}


		/******************** appointmentidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse appointmentidentifieruse = appointmentidentifier.getUse();
		if(appointmentidentifieruse!=null) {
		if(appointmentidentifieri == 0) {

		a.addAppmntIdUse("[");		}
			a.addAppmntIdUse(appointmentidentifieruse.toCode());
		if(appointmentidentifieri == appointmentidentifierlist.size()-1) {

		a.addAppmntIdUse("]");		}

		} else {
			a.addAppmntIdUse("NULL");
		}

		/******************** Appmnt_Id_Assigner ********************************************************************************/
		if(appointmentidentifieri == 0) {a.addAppmntIdAssigner("[");}
		if(appointmentidentifier.hasAssigner()) {

			if(appointmentidentifier.getAssigner().getReference() != null) {
			a.addAppmntIdAssigner(appointmentidentifier.getAssigner().getReference());
			}
		} else {
			a.addAppmntIdAssigner("NULL");
		}

		if(appointmentidentifieri == appointmentidentifierlist.size()-1) {a.addAppmntIdAssigner("]");}


		/******************** Appmnt_Id_Sys ********************************************************************************/
		if(appointmentidentifieri == 0) {a.addAppmntIdSys("[");}
		if(appointmentidentifier.hasSystem()) {

			a.addAppmntIdSys(String.valueOf(appointmentidentifier.getSystem()));
		} else {
			a.addAppmntIdSys("NULL");
		}

		if(appointmentidentifieri == appointmentidentifierlist.size()-1) {a.addAppmntIdSys("]");}


		 };
		/******************** Appmnt_MinutesDuration ********************************************************************************/
		if(appointment.hasMinutesDuration()) {

			a.addAppmntMinutesDuration(String.valueOf(appointment.getMinutesDuration()));
		} else {
			a.addAppmntMinutesDuration("NULL");
		}


		/******************** appointmentrequestedperiod ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Period> appointmentrequestedperiodlist = appointment.getRequestedPeriod();
		for(int appointmentrequestedperiodi = 0; appointmentrequestedperiodi<appointmentrequestedperiodlist.size();appointmentrequestedperiodi++ ) {
		org.hl7.fhir.r4.model.Period  appointmentrequestedperiod = appointmentrequestedperiodlist.get(appointmentrequestedperiodi);

		/******************** Appmnt_RqstedPrd_Strt ********************************************************************************/
		if(appointmentrequestedperiodi == 0) {a.addAppmntRqstedPrdStrt("[");}
		if(appointmentrequestedperiod.hasStart()) {

			a.addAppmntRqstedPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(appointmentrequestedperiod.getStart())+"\"");
		} else {
			a.addAppmntRqstedPrdStrt("NULL");
		}

		if(appointmentrequestedperiodi == appointmentrequestedperiodlist.size()-1) {a.addAppmntRqstedPrdStrt("]");}


		/******************** Appmnt_RqstedPrd_End ********************************************************************************/
		if(appointmentrequestedperiodi == 0) {a.addAppmntRqstedPrdEnd("[");}
		if(appointmentrequestedperiod.hasEnd()) {

			a.addAppmntRqstedPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(appointmentrequestedperiod.getEnd())+"\"");
		} else {
			a.addAppmntRqstedPrdEnd("NULL");
		}

		if(appointmentrequestedperiodi == appointmentrequestedperiodlist.size()-1) {a.addAppmntRqstedPrdEnd("]");}


		 };
		/******************** Appmnt_SprtingInfo ********************************************************************************/
		if(appointment.hasSupportingInformation()) {

			String  array = "[";
			for(int incr=0; incr<appointment.getSupportingInformation().size(); incr++) {
				array = array + appointment.getSupportingInformation().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			a.addAppmntSprtingInfo(array);

		} else {
			a.addAppmntSprtingInfo("NULL");
		}


		/******************** Appmnt_PntInstrctn ********************************************************************************/
		if(appointment.hasPatientInstruction()) {

			a.addAppmntPntInstrctn(String.valueOf(appointment.getPatientInstruction()));
		} else {
			a.addAppmntPntInstrctn("NULL");
		}


		/******************** appointmentcancelationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentcancelationreason = appointment.getCancelationReason();

		/******************** Appmnt_CancelationRsn_Txt ********************************************************************************/
		if(appointmentcancelationreason.hasText()) {

			a.addAppmntCancelationRsnTxt(String.valueOf(appointmentcancelationreason.getText()));
		} else {
			a.addAppmntCancelationRsnTxt("NULL");
		}


		/******************** appointmentcancelationreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> appointmentcancelationreasoncodinglist = appointmentcancelationreason.getCoding();
		for(int appointmentcancelationreasoncodingi = 0; appointmentcancelationreasoncodingi<appointmentcancelationreasoncodinglist.size();appointmentcancelationreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  appointmentcancelationreasoncoding = appointmentcancelationreasoncodinglist.get(appointmentcancelationreasoncodingi);

		/******************** Appmnt_CancelationRsn_Cdg_Dsply ********************************************************************************/
		if(appointmentcancelationreasoncodingi == 0) {a.addAppmntCancelationRsnCdgDsply("[");}
		if(appointmentcancelationreasoncoding.hasDisplay()) {

			a.addAppmntCancelationRsnCdgDsply(String.valueOf(appointmentcancelationreasoncoding.getDisplay()));
		} else {
			a.addAppmntCancelationRsnCdgDsply("NULL");
		}

		if(appointmentcancelationreasoncodingi == appointmentcancelationreasoncodinglist.size()-1) {a.addAppmntCancelationRsnCdgDsply("]");}


		/******************** Appmnt_CancelationRsn_Cdg_Vrsn ********************************************************************************/
		if(appointmentcancelationreasoncodingi == 0) {a.addAppmntCancelationRsnCdgVrsn("[");}
		if(appointmentcancelationreasoncoding.hasVersion()) {

			a.addAppmntCancelationRsnCdgVrsn(String.valueOf(appointmentcancelationreasoncoding.getVersion()));
		} else {
			a.addAppmntCancelationRsnCdgVrsn("NULL");
		}

		if(appointmentcancelationreasoncodingi == appointmentcancelationreasoncodinglist.size()-1) {a.addAppmntCancelationRsnCdgVrsn("]");}


		/******************** Appmnt_CancelationRsn_Cdg_Cd ********************************************************************************/
		if(appointmentcancelationreasoncodingi == 0) {a.addAppmntCancelationRsnCdgCd("[");}
		if(appointmentcancelationreasoncoding.hasCode()) {

			a.addAppmntCancelationRsnCdgCd(String.valueOf(appointmentcancelationreasoncoding.getCode()));
		} else {
			a.addAppmntCancelationRsnCdgCd("NULL");
		}

		if(appointmentcancelationreasoncodingi == appointmentcancelationreasoncodinglist.size()-1) {a.addAppmntCancelationRsnCdgCd("]");}


		/******************** Appmnt_CancelationRsn_Cdg_UsrSltd ********************************************************************************/
		if(appointmentcancelationreasoncodingi == 0) {a.addAppmntCancelationRsnCdgUsrSltd("[");}
		if(appointmentcancelationreasoncoding.hasUserSelected()) {

			a.addAppmntCancelationRsnCdgUsrSltd(String.valueOf(appointmentcancelationreasoncoding.getUserSelected()));
		} else {
			a.addAppmntCancelationRsnCdgUsrSltd("NULL");
		}

		if(appointmentcancelationreasoncodingi == appointmentcancelationreasoncodinglist.size()-1) {a.addAppmntCancelationRsnCdgUsrSltd("]");}


		/******************** Appmnt_CancelationRsn_Cdg_Sys ********************************************************************************/
		if(appointmentcancelationreasoncodingi == 0) {a.addAppmntCancelationRsnCdgSys("[");}
		if(appointmentcancelationreasoncoding.hasSystem()) {

			a.addAppmntCancelationRsnCdgSys(String.valueOf(appointmentcancelationreasoncoding.getSystem()));
		} else {
			a.addAppmntCancelationRsnCdgSys("NULL");
		}

		if(appointmentcancelationreasoncodingi == appointmentcancelationreasoncodinglist.size()-1) {a.addAppmntCancelationRsnCdgSys("]");}


		 };
		/******************** appointmentservicecategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> appointmentservicecategorylist = appointment.getServiceCategory();
		for(int appointmentservicecategoryi = 0; appointmentservicecategoryi<appointmentservicecategorylist.size();appointmentservicecategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  appointmentservicecategory = appointmentservicecategorylist.get(appointmentservicecategoryi);

		/******************** Appmnt_SrvCtgry_Txt ********************************************************************************/
		if(appointmentservicecategoryi == 0) {a.addAppmntSrvCtgryTxt("[");}
		if(appointmentservicecategory.hasText()) {

			a.addAppmntSrvCtgryTxt(String.valueOf(appointmentservicecategory.getText()));
		} else {
			a.addAppmntSrvCtgryTxt("NULL");
		}

		if(appointmentservicecategoryi == appointmentservicecategorylist.size()-1) {a.addAppmntSrvCtgryTxt("]");}


		/******************** appointmentservicecategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> appointmentservicecategorycodinglist = appointmentservicecategory.getCoding();
		for(int appointmentservicecategorycodingi = 0; appointmentservicecategorycodingi<appointmentservicecategorycodinglist.size();appointmentservicecategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  appointmentservicecategorycoding = appointmentservicecategorycodinglist.get(appointmentservicecategorycodingi);

		/******************** Appmnt_SrvCtgry_Cdg_Dsply ********************************************************************************/
		if(appointmentservicecategorycodingi == 0) {a.addAppmntSrvCtgryCdgDsply("[[");}
		if(appointmentservicecategorycoding.hasDisplay()) {

			a.addAppmntSrvCtgryCdgDsply(String.valueOf(appointmentservicecategorycoding.getDisplay()));
		} else {
			a.addAppmntSrvCtgryCdgDsply("NULL");
		}

		if(appointmentservicecategorycodingi == appointmentservicecategorycodinglist.size()-1) {a.addAppmntSrvCtgryCdgDsply("]]");}


		/******************** Appmnt_SrvCtgry_Cdg_Vrsn ********************************************************************************/
		if(appointmentservicecategorycodingi == 0) {a.addAppmntSrvCtgryCdgVrsn("[[");}
		if(appointmentservicecategorycoding.hasVersion()) {

			a.addAppmntSrvCtgryCdgVrsn(String.valueOf(appointmentservicecategorycoding.getVersion()));
		} else {
			a.addAppmntSrvCtgryCdgVrsn("NULL");
		}

		if(appointmentservicecategorycodingi == appointmentservicecategorycodinglist.size()-1) {a.addAppmntSrvCtgryCdgVrsn("]]");}


		/******************** Appmnt_SrvCtgry_Cdg_Cd ********************************************************************************/
		if(appointmentservicecategorycodingi == 0) {a.addAppmntSrvCtgryCdgCd("[[");}
		if(appointmentservicecategorycoding.hasCode()) {

			a.addAppmntSrvCtgryCdgCd(String.valueOf(appointmentservicecategorycoding.getCode()));
		} else {
			a.addAppmntSrvCtgryCdgCd("NULL");
		}

		if(appointmentservicecategorycodingi == appointmentservicecategorycodinglist.size()-1) {a.addAppmntSrvCtgryCdgCd("]]");}


		/******************** Appmnt_SrvCtgry_Cdg_UsrSltd ********************************************************************************/
		if(appointmentservicecategorycodingi == 0) {a.addAppmntSrvCtgryCdgUsrSltd("[[");}
		if(appointmentservicecategorycoding.hasUserSelected()) {

			a.addAppmntSrvCtgryCdgUsrSltd(String.valueOf(appointmentservicecategorycoding.getUserSelected()));
		} else {
			a.addAppmntSrvCtgryCdgUsrSltd("NULL");
		}

		if(appointmentservicecategorycodingi == appointmentservicecategorycodinglist.size()-1) {a.addAppmntSrvCtgryCdgUsrSltd("]]");}


		/******************** Appmnt_SrvCtgry_Cdg_Sys ********************************************************************************/
		if(appointmentservicecategorycodingi == 0) {a.addAppmntSrvCtgryCdgSys("[[");}
		if(appointmentservicecategorycoding.hasSystem()) {

			a.addAppmntSrvCtgryCdgSys(String.valueOf(appointmentservicecategorycoding.getSystem()));
		} else {
			a.addAppmntSrvCtgryCdgSys("NULL");
		}

		if(appointmentservicecategorycodingi == appointmentservicecategorycodinglist.size()-1) {a.addAppmntSrvCtgryCdgSys("]]");}


		 };
		 };
		/******************** appointmentspecialty ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> appointmentspecialtylist = appointment.getSpecialty();
		for(int appointmentspecialtyi = 0; appointmentspecialtyi<appointmentspecialtylist.size();appointmentspecialtyi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  appointmentspecialty = appointmentspecialtylist.get(appointmentspecialtyi);

		/******************** Appmnt_Spclty_Txt ********************************************************************************/
		if(appointmentspecialtyi == 0) {a.addAppmntSpcltyTxt("[");}
		if(appointmentspecialty.hasText()) {

			a.addAppmntSpcltyTxt(String.valueOf(appointmentspecialty.getText()));
		} else {
			a.addAppmntSpcltyTxt("NULL");
		}

		if(appointmentspecialtyi == appointmentspecialtylist.size()-1) {a.addAppmntSpcltyTxt("]");}


		/******************** appointmentspecialtycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> appointmentspecialtycodinglist = appointmentspecialty.getCoding();
		for(int appointmentspecialtycodingi = 0; appointmentspecialtycodingi<appointmentspecialtycodinglist.size();appointmentspecialtycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  appointmentspecialtycoding = appointmentspecialtycodinglist.get(appointmentspecialtycodingi);

		/******************** Appmnt_Spclty_Cdg_Dsply ********************************************************************************/
		if(appointmentspecialtycodingi == 0) {a.addAppmntSpcltyCdgDsply("[[");}
		if(appointmentspecialtycoding.hasDisplay()) {

			a.addAppmntSpcltyCdgDsply(String.valueOf(appointmentspecialtycoding.getDisplay()));
		} else {
			a.addAppmntSpcltyCdgDsply("NULL");
		}

		if(appointmentspecialtycodingi == appointmentspecialtycodinglist.size()-1) {a.addAppmntSpcltyCdgDsply("]]");}


		/******************** Appmnt_Spclty_Cdg_Vrsn ********************************************************************************/
		if(appointmentspecialtycodingi == 0) {a.addAppmntSpcltyCdgVrsn("[[");}
		if(appointmentspecialtycoding.hasVersion()) {

			a.addAppmntSpcltyCdgVrsn(String.valueOf(appointmentspecialtycoding.getVersion()));
		} else {
			a.addAppmntSpcltyCdgVrsn("NULL");
		}

		if(appointmentspecialtycodingi == appointmentspecialtycodinglist.size()-1) {a.addAppmntSpcltyCdgVrsn("]]");}


		/******************** Appmnt_Spclty_Cdg_Cd ********************************************************************************/
		if(appointmentspecialtycodingi == 0) {a.addAppmntSpcltyCdgCd("[[");}
		if(appointmentspecialtycoding.hasCode()) {

			a.addAppmntSpcltyCdgCd(String.valueOf(appointmentspecialtycoding.getCode()));
		} else {
			a.addAppmntSpcltyCdgCd("NULL");
		}

		if(appointmentspecialtycodingi == appointmentspecialtycodinglist.size()-1) {a.addAppmntSpcltyCdgCd("]]");}


		/******************** Appmnt_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(appointmentspecialtycodingi == 0) {a.addAppmntSpcltyCdgUsrSltd("[[");}
		if(appointmentspecialtycoding.hasUserSelected()) {

			a.addAppmntSpcltyCdgUsrSltd(String.valueOf(appointmentspecialtycoding.getUserSelected()));
		} else {
			a.addAppmntSpcltyCdgUsrSltd("NULL");
		}

		if(appointmentspecialtycodingi == appointmentspecialtycodinglist.size()-1) {a.addAppmntSpcltyCdgUsrSltd("]]");}


		/******************** Appmnt_Spclty_Cdg_Sys ********************************************************************************/
		if(appointmentspecialtycodingi == 0) {a.addAppmntSpcltyCdgSys("[[");}
		if(appointmentspecialtycoding.hasSystem()) {

			a.addAppmntSpcltyCdgSys(String.valueOf(appointmentspecialtycoding.getSystem()));
		} else {
			a.addAppmntSpcltyCdgSys("NULL");
		}

		if(appointmentspecialtycodingi == appointmentspecialtycodinglist.size()-1) {a.addAppmntSpcltyCdgSys("]]");}


		 };
		 };
		/******************** appointmentappointmenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentappointmenttype = appointment.getAppointmentType();

		/******************** Appmnt_AppmntTyp_Txt ********************************************************************************/
		if(appointmentappointmenttype.hasText()) {

			a.addAppmntAppmntTypTxt(String.valueOf(appointmentappointmenttype.getText()));
		} else {
			a.addAppmntAppmntTypTxt("NULL");
		}


		/******************** appointmentappointmenttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> appointmentappointmenttypecodinglist = appointmentappointmenttype.getCoding();
		for(int appointmentappointmenttypecodingi = 0; appointmentappointmenttypecodingi<appointmentappointmenttypecodinglist.size();appointmentappointmenttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  appointmentappointmenttypecoding = appointmentappointmenttypecodinglist.get(appointmentappointmenttypecodingi);

		/******************** Appmnt_AppmntTyp_Cdg_Dsply ********************************************************************************/
		if(appointmentappointmenttypecodingi == 0) {a.addAppmntAppmntTypCdgDsply("[");}
		if(appointmentappointmenttypecoding.hasDisplay()) {

			a.addAppmntAppmntTypCdgDsply(String.valueOf(appointmentappointmenttypecoding.getDisplay()));
		} else {
			a.addAppmntAppmntTypCdgDsply("NULL");
		}

		if(appointmentappointmenttypecodingi == appointmentappointmenttypecodinglist.size()-1) {a.addAppmntAppmntTypCdgDsply("]");}


		/******************** Appmnt_AppmntTyp_Cdg_Vrsn ********************************************************************************/
		if(appointmentappointmenttypecodingi == 0) {a.addAppmntAppmntTypCdgVrsn("[");}
		if(appointmentappointmenttypecoding.hasVersion()) {

			a.addAppmntAppmntTypCdgVrsn(String.valueOf(appointmentappointmenttypecoding.getVersion()));
		} else {
			a.addAppmntAppmntTypCdgVrsn("NULL");
		}

		if(appointmentappointmenttypecodingi == appointmentappointmenttypecodinglist.size()-1) {a.addAppmntAppmntTypCdgVrsn("]");}


		/******************** Appmnt_AppmntTyp_Cdg_Cd ********************************************************************************/
		if(appointmentappointmenttypecodingi == 0) {a.addAppmntAppmntTypCdgCd("[");}
		if(appointmentappointmenttypecoding.hasCode()) {

			a.addAppmntAppmntTypCdgCd(String.valueOf(appointmentappointmenttypecoding.getCode()));
		} else {
			a.addAppmntAppmntTypCdgCd("NULL");
		}

		if(appointmentappointmenttypecodingi == appointmentappointmenttypecodinglist.size()-1) {a.addAppmntAppmntTypCdgCd("]");}


		/******************** Appmnt_AppmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(appointmentappointmenttypecodingi == 0) {a.addAppmntAppmntTypCdgUsrSltd("[");}
		if(appointmentappointmenttypecoding.hasUserSelected()) {

			a.addAppmntAppmntTypCdgUsrSltd(String.valueOf(appointmentappointmenttypecoding.getUserSelected()));
		} else {
			a.addAppmntAppmntTypCdgUsrSltd("NULL");
		}

		if(appointmentappointmenttypecodingi == appointmentappointmenttypecodinglist.size()-1) {a.addAppmntAppmntTypCdgUsrSltd("]");}


		/******************** Appmnt_AppmntTyp_Cdg_Sys ********************************************************************************/
		if(appointmentappointmenttypecodingi == 0) {a.addAppmntAppmntTypCdgSys("[");}
		if(appointmentappointmenttypecoding.hasSystem()) {

			a.addAppmntAppmntTypCdgSys(String.valueOf(appointmentappointmenttypecoding.getSystem()));
		} else {
			a.addAppmntAppmntTypCdgSys("NULL");
		}

		if(appointmentappointmenttypecodingi == appointmentappointmenttypecodinglist.size()-1) {a.addAppmntAppmntTypCdgSys("]");}


		 };
		/******************** Appmnt_Strt ********************************************************************************/
		if(appointment.hasStart()) {

			a.addAppmntStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(appointment.getStart())+"\"");
		} else {
			a.addAppmntStrt("NULL");
		}


		/******************** Appmnt_End ********************************************************************************/
		if(appointment.hasEnd()) {

			a.addAppmntEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(appointment.getEnd())+"\"");
		} else {
			a.addAppmntEnd("NULL");
		}


		/******************** appointmentservicetype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> appointmentservicetypelist = appointment.getServiceType();
		for(int appointmentservicetypei = 0; appointmentservicetypei<appointmentservicetypelist.size();appointmentservicetypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  appointmentservicetype = appointmentservicetypelist.get(appointmentservicetypei);

		/******************** Appmnt_SrvTyp_Txt ********************************************************************************/
		if(appointmentservicetypei == 0) {a.addAppmntSrvTypTxt("[");}
		if(appointmentservicetype.hasText()) {

			a.addAppmntSrvTypTxt(String.valueOf(appointmentservicetype.getText()));
		} else {
			a.addAppmntSrvTypTxt("NULL");
		}

		if(appointmentservicetypei == appointmentservicetypelist.size()-1) {a.addAppmntSrvTypTxt("]");}


		/******************** appointmentservicetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> appointmentservicetypecodinglist = appointmentservicetype.getCoding();
		for(int appointmentservicetypecodingi = 0; appointmentservicetypecodingi<appointmentservicetypecodinglist.size();appointmentservicetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  appointmentservicetypecoding = appointmentservicetypecodinglist.get(appointmentservicetypecodingi);

		/******************** Appmnt_SrvTyp_Cdg_Dsply ********************************************************************************/
		if(appointmentservicetypecodingi == 0) {a.addAppmntSrvTypCdgDsply("[[");}
		if(appointmentservicetypecoding.hasDisplay()) {

			a.addAppmntSrvTypCdgDsply(String.valueOf(appointmentservicetypecoding.getDisplay()));
		} else {
			a.addAppmntSrvTypCdgDsply("NULL");
		}

		if(appointmentservicetypecodingi == appointmentservicetypecodinglist.size()-1) {a.addAppmntSrvTypCdgDsply("]]");}


		/******************** Appmnt_SrvTyp_Cdg_Vrsn ********************************************************************************/
		if(appointmentservicetypecodingi == 0) {a.addAppmntSrvTypCdgVrsn("[[");}
		if(appointmentservicetypecoding.hasVersion()) {

			a.addAppmntSrvTypCdgVrsn(String.valueOf(appointmentservicetypecoding.getVersion()));
		} else {
			a.addAppmntSrvTypCdgVrsn("NULL");
		}

		if(appointmentservicetypecodingi == appointmentservicetypecodinglist.size()-1) {a.addAppmntSrvTypCdgVrsn("]]");}


		/******************** Appmnt_SrvTyp_Cdg_Cd ********************************************************************************/
		if(appointmentservicetypecodingi == 0) {a.addAppmntSrvTypCdgCd("[[");}
		if(appointmentservicetypecoding.hasCode()) {

			a.addAppmntSrvTypCdgCd(String.valueOf(appointmentservicetypecoding.getCode()));
		} else {
			a.addAppmntSrvTypCdgCd("NULL");
		}

		if(appointmentservicetypecodingi == appointmentservicetypecodinglist.size()-1) {a.addAppmntSrvTypCdgCd("]]");}


		/******************** Appmnt_SrvTyp_Cdg_UsrSltd ********************************************************************************/
		if(appointmentservicetypecodingi == 0) {a.addAppmntSrvTypCdgUsrSltd("[[");}
		if(appointmentservicetypecoding.hasUserSelected()) {

			a.addAppmntSrvTypCdgUsrSltd(String.valueOf(appointmentservicetypecoding.getUserSelected()));
		} else {
			a.addAppmntSrvTypCdgUsrSltd("NULL");
		}

		if(appointmentservicetypecodingi == appointmentservicetypecodinglist.size()-1) {a.addAppmntSrvTypCdgUsrSltd("]]");}


		/******************** Appmnt_SrvTyp_Cdg_Sys ********************************************************************************/
		if(appointmentservicetypecodingi == 0) {a.addAppmntSrvTypCdgSys("[[");}
		if(appointmentservicetypecoding.hasSystem()) {

			a.addAppmntSrvTypCdgSys(String.valueOf(appointmentservicetypecoding.getSystem()));
		} else {
			a.addAppmntSrvTypCdgSys("NULL");
		}

		if(appointmentservicetypecodingi == appointmentservicetypecodinglist.size()-1) {a.addAppmntSrvTypCdgSys("]]");}


		 };
		 };
		/******************** appointmentparticipant ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Appointment.AppointmentParticipantComponent> appointmentparticipantlist = appointment.getParticipant();
		for(int appointmentparticipanti = 0; appointmentparticipanti<appointmentparticipantlist.size();appointmentparticipanti++ ) {
		org.hl7.fhir.r4.model.Appointment.AppointmentParticipantComponent  appointmentparticipant = appointmentparticipantlist.get(appointmentparticipanti);

		/******************** appointmentparticipanttype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> appointmentparticipanttypelist = appointmentparticipant.getType();
		for(int appointmentparticipanttypei = 0; appointmentparticipanttypei<appointmentparticipanttypelist.size();appointmentparticipanttypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  appointmentparticipanttype = appointmentparticipanttypelist.get(appointmentparticipanttypei);

		/******************** Appmnt_Prtcpnt_Typ_Txt ********************************************************************************/
		if(appointmentparticipanttypei == 0) {a.addAppmntPrtcpntTypTxt("[[");}
		if(appointmentparticipanttype.hasText()) {

			a.addAppmntPrtcpntTypTxt(String.valueOf(appointmentparticipanttype.getText()));
		} else {
			a.addAppmntPrtcpntTypTxt("NULL");
		}

		if(appointmentparticipanttypei == appointmentparticipanttypelist.size()-1) {a.addAppmntPrtcpntTypTxt("]]");}


		/******************** appointmentparticipanttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> appointmentparticipanttypecodinglist = appointmentparticipanttype.getCoding();
		for(int appointmentparticipanttypecodingi = 0; appointmentparticipanttypecodingi<appointmentparticipanttypecodinglist.size();appointmentparticipanttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  appointmentparticipanttypecoding = appointmentparticipanttypecodinglist.get(appointmentparticipanttypecodingi);

		/******************** Appmnt_Prtcpnt_Typ_Cdg_Dsply ********************************************************************************/
		if(appointmentparticipanttypecodingi == 0) {a.addAppmntPrtcpntTypCdgDsply("[[[");}
		if(appointmentparticipanttypecoding.hasDisplay()) {

			a.addAppmntPrtcpntTypCdgDsply(String.valueOf(appointmentparticipanttypecoding.getDisplay()));
		} else {
			a.addAppmntPrtcpntTypCdgDsply("NULL");
		}

		if(appointmentparticipanttypecodingi == appointmentparticipanttypecodinglist.size()-1) {a.addAppmntPrtcpntTypCdgDsply("]]]");}


		/******************** Appmnt_Prtcpnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(appointmentparticipanttypecodingi == 0) {a.addAppmntPrtcpntTypCdgVrsn("[[[");}
		if(appointmentparticipanttypecoding.hasVersion()) {

			a.addAppmntPrtcpntTypCdgVrsn(String.valueOf(appointmentparticipanttypecoding.getVersion()));
		} else {
			a.addAppmntPrtcpntTypCdgVrsn("NULL");
		}

		if(appointmentparticipanttypecodingi == appointmentparticipanttypecodinglist.size()-1) {a.addAppmntPrtcpntTypCdgVrsn("]]]");}


		/******************** Appmnt_Prtcpnt_Typ_Cdg_Cd ********************************************************************************/
		if(appointmentparticipanttypecodingi == 0) {a.addAppmntPrtcpntTypCdgCd("[[[");}
		if(appointmentparticipanttypecoding.hasCode()) {

			a.addAppmntPrtcpntTypCdgCd(String.valueOf(appointmentparticipanttypecoding.getCode()));
		} else {
			a.addAppmntPrtcpntTypCdgCd("NULL");
		}

		if(appointmentparticipanttypecodingi == appointmentparticipanttypecodinglist.size()-1) {a.addAppmntPrtcpntTypCdgCd("]]]");}


		/******************** Appmnt_Prtcpnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(appointmentparticipanttypecodingi == 0) {a.addAppmntPrtcpntTypCdgUsrSltd("[[[");}
		if(appointmentparticipanttypecoding.hasUserSelected()) {

			a.addAppmntPrtcpntTypCdgUsrSltd(String.valueOf(appointmentparticipanttypecoding.getUserSelected()));
		} else {
			a.addAppmntPrtcpntTypCdgUsrSltd("NULL");
		}

		if(appointmentparticipanttypecodingi == appointmentparticipanttypecodinglist.size()-1) {a.addAppmntPrtcpntTypCdgUsrSltd("]]]");}


		/******************** Appmnt_Prtcpnt_Typ_Cdg_Sys ********************************************************************************/
		if(appointmentparticipanttypecodingi == 0) {a.addAppmntPrtcpntTypCdgSys("[[[");}
		if(appointmentparticipanttypecoding.hasSystem()) {

			a.addAppmntPrtcpntTypCdgSys(String.valueOf(appointmentparticipanttypecoding.getSystem()));
		} else {
			a.addAppmntPrtcpntTypCdgSys("NULL");
		}

		if(appointmentparticipanttypecodingi == appointmentparticipanttypecodinglist.size()-1) {a.addAppmntPrtcpntTypCdgSys("]]]");}


		 };
		 };
		/******************** appointmentparticipantstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Appointment.ParticipationStatus appointmentparticipantstatus = appointmentparticipant.getStatus();
		if(appointmentparticipantstatus!=null) {
			a.addAppmntPrtcpntSts(appointmentparticipantstatus.toCode());
		} else {
			a.addAppmntPrtcpntSts("NULL");
		}

		/******************** appointmentparticipantperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period appointmentparticipantperiod = appointmentparticipant.getPeriod();

		/******************** Appmnt_Prtcpnt_Prd_Strt ********************************************************************************/
		if(appointmentparticipantperiod.hasStart()) {

			a.addAppmntPrtcpntPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(appointmentparticipantperiod.getStart())+"\"");
		} else {
			a.addAppmntPrtcpntPrdStrt("NULL");
		}


		/******************** Appmnt_Prtcpnt_Prd_End ********************************************************************************/
		if(appointmentparticipantperiod.hasEnd()) {

			a.addAppmntPrtcpntPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(appointmentparticipantperiod.getEnd())+"\"");
		} else {
			a.addAppmntPrtcpntPrdEnd("NULL");
		}


		/******************** appointmentparticipantrequired ********************************************************************************/
		org.hl7.fhir.r4.model.Appointment.ParticipantRequired appointmentparticipantrequired = appointmentparticipant.getRequired();
		if(appointmentparticipantrequired!=null) {
			a.addAppmntPrtcpntRequired(appointmentparticipantrequired.toCode());
		} else {
			a.addAppmntPrtcpntRequired("NULL");
		}

		/******************** Appmnt_Prtcpnt_Actor ********************************************************************************/
		if(appointmentparticipant.hasActor()) {

			if(appointmentparticipant.getActor().getReference() != null) {
			a.addAppmntPrtcpntActor(appointmentparticipant.getActor().getReference());
			}
		} else {
			a.addAppmntPrtcpntActor("NULL");
		}


		 };
		return a;
	}
}
