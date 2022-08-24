package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SupplyDelivery;
public class SupplyDeliveryBidirectionalConversion 
{
	public SupplyDelivery SupplyDeliverys(org.hl7.fhir.r4.model.SupplyDelivery supplydelivery) throws ParseException
	{
		 main.java.com.campfhir.model.SupplyDelivery s = new  main.java.com.campfhir.model.SupplyDelivery();

		/******************** id ********************************************************************************/
		s.setId(supplydelivery.getIdElement().getIdPart());

		/******************** supplydeliverytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplydeliverytype = supplydelivery.getType();

		/******************** SpplyDlvry_Typ_Txt ********************************************************************************/
		if(supplydeliverytype.hasText()) {

			s.addSpplyDlvryTypTxt(String.valueOf(supplydeliverytype.getText()));
		} else {
			s.addSpplyDlvryTypTxt("NULL");
		}


		/******************** supplydeliverytypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> supplydeliverytypecodinglist = supplydeliverytype.getCoding();
		for(int supplydeliverytypecodingi = 0; supplydeliverytypecodingi<supplydeliverytypecodinglist.size();supplydeliverytypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  supplydeliverytypecoding = supplydeliverytypecodinglist.get(supplydeliverytypecodingi);

		/******************** SpplyDlvry_Typ_Cdg_Dsply ********************************************************************************/
		if(supplydeliverytypecodingi == 0) {s.addSpplyDlvryTypCdgDsply("[");}
		if(supplydeliverytypecoding.hasDisplay()) {

			s.addSpplyDlvryTypCdgDsply(String.valueOf(supplydeliverytypecoding.getDisplay()));
		} else {
			s.addSpplyDlvryTypCdgDsply("NULL");
		}

		if(supplydeliverytypecodingi == supplydeliverytypecodinglist.size()-1) {s.addSpplyDlvryTypCdgDsply("]");}


		/******************** SpplyDlvry_Typ_Cdg_Vrsn ********************************************************************************/
		if(supplydeliverytypecodingi == 0) {s.addSpplyDlvryTypCdgVrsn("[");}
		if(supplydeliverytypecoding.hasVersion()) {

			s.addSpplyDlvryTypCdgVrsn(String.valueOf(supplydeliverytypecoding.getVersion()));
		} else {
			s.addSpplyDlvryTypCdgVrsn("NULL");
		}

		if(supplydeliverytypecodingi == supplydeliverytypecodinglist.size()-1) {s.addSpplyDlvryTypCdgVrsn("]");}


		/******************** SpplyDlvry_Typ_Cdg_Cd ********************************************************************************/
		if(supplydeliverytypecodingi == 0) {s.addSpplyDlvryTypCdgCd("[");}
		if(supplydeliverytypecoding.hasCode()) {

			s.addSpplyDlvryTypCdgCd(String.valueOf(supplydeliverytypecoding.getCode()));
		} else {
			s.addSpplyDlvryTypCdgCd("NULL");
		}

		if(supplydeliverytypecodingi == supplydeliverytypecodinglist.size()-1) {s.addSpplyDlvryTypCdgCd("]");}


		/******************** SpplyDlvry_Typ_Cdg_UsrSltd ********************************************************************************/
		if(supplydeliverytypecodingi == 0) {s.addSpplyDlvryTypCdgUsrSltd("[");}
		if(supplydeliverytypecoding.hasUserSelected()) {

			s.addSpplyDlvryTypCdgUsrSltd(String.valueOf(supplydeliverytypecoding.getUserSelected()));
		} else {
			s.addSpplyDlvryTypCdgUsrSltd("NULL");
		}

		if(supplydeliverytypecodingi == supplydeliverytypecodinglist.size()-1) {s.addSpplyDlvryTypCdgUsrSltd("]");}


		/******************** SpplyDlvry_Typ_Cdg_Sys ********************************************************************************/
		if(supplydeliverytypecodingi == 0) {s.addSpplyDlvryTypCdgSys("[");}
		if(supplydeliverytypecoding.hasSystem()) {

			s.addSpplyDlvryTypCdgSys(String.valueOf(supplydeliverytypecoding.getSystem()));
		} else {
			s.addSpplyDlvryTypCdgSys("NULL");
		}

		if(supplydeliverytypecodingi == supplydeliverytypecodinglist.size()-1) {s.addSpplyDlvryTypCdgSys("]");}


		 };
		/******************** supplydeliverystatus ********************************************************************************/
		org.hl7.fhir.r4.model.SupplyDelivery.SupplyDeliveryStatus supplydeliverystatus = supplydelivery.getStatus();
		if(supplydeliverystatus!=null) {
			s.addSpplyDlvrySts(supplydeliverystatus.toCode());
		} else {
			s.addSpplyDlvrySts("NULL");
		}

		/******************** SpplyDlvry_BasedOn ********************************************************************************/
		if(supplydelivery.hasBasedOn()) {

			String  array = "[";
			for(int incr=0; incr<supplydelivery.getBasedOn().size(); incr++) {
				array = array + supplydelivery.getBasedOn().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSpplyDlvryBasedOn(array);

		} else {
			s.addSpplyDlvryBasedOn("NULL");
		}


		/******************** supplydeliveryidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> supplydeliveryidentifierlist = supplydelivery.getIdentifier();
		for(int supplydeliveryidentifieri = 0; supplydeliveryidentifieri<supplydeliveryidentifierlist.size();supplydeliveryidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  supplydeliveryidentifier = supplydeliveryidentifierlist.get(supplydeliveryidentifieri);

		/******************** SpplyDlvry_Id_Vl ********************************************************************************/
		if(supplydeliveryidentifieri == 0) {s.addSpplyDlvryIdVl("[");}
		if(supplydeliveryidentifier.hasValue()) {

			s.addSpplyDlvryIdVl(String.valueOf(supplydeliveryidentifier.getValue()));
		} else {
			s.addSpplyDlvryIdVl("NULL");
		}

		if(supplydeliveryidentifieri == supplydeliveryidentifierlist.size()-1) {s.addSpplyDlvryIdVl("]");}


		/******************** supplydeliveryidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplydeliveryidentifiertype = supplydeliveryidentifier.getType();

		/******************** SpplyDlvry_Id_Typ_Txt ********************************************************************************/
		if(supplydeliveryidentifieri == 0) {s.addSpplyDlvryIdTypTxt("[");}
		if(supplydeliveryidentifiertype.hasText()) {

			s.addSpplyDlvryIdTypTxt(String.valueOf(supplydeliveryidentifiertype.getText()));
		} else {
			s.addSpplyDlvryIdTypTxt("NULL");
		}

		if(supplydeliveryidentifieri == supplydeliveryidentifierlist.size()-1) {s.addSpplyDlvryIdTypTxt("]");}


		/******************** supplydeliveryidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> supplydeliveryidentifiertypecodinglist = supplydeliveryidentifiertype.getCoding();
		for(int supplydeliveryidentifiertypecodingi = 0; supplydeliveryidentifiertypecodingi<supplydeliveryidentifiertypecodinglist.size();supplydeliveryidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  supplydeliveryidentifiertypecoding = supplydeliveryidentifiertypecodinglist.get(supplydeliveryidentifiertypecodingi);

		/******************** SpplyDlvry_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(supplydeliveryidentifiertypecodingi == 0) {s.addSpplyDlvryIdTypCdgDsply("[[");}
		if(supplydeliveryidentifiertypecoding.hasDisplay()) {

			s.addSpplyDlvryIdTypCdgDsply(String.valueOf(supplydeliveryidentifiertypecoding.getDisplay()));
		} else {
			s.addSpplyDlvryIdTypCdgDsply("NULL");
		}

		if(supplydeliveryidentifiertypecodingi == supplydeliveryidentifiertypecodinglist.size()-1) {s.addSpplyDlvryIdTypCdgDsply("]]");}


		/******************** SpplyDlvry_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(supplydeliveryidentifiertypecodingi == 0) {s.addSpplyDlvryIdTypCdgVrsn("[[");}
		if(supplydeliveryidentifiertypecoding.hasVersion()) {

			s.addSpplyDlvryIdTypCdgVrsn(String.valueOf(supplydeliveryidentifiertypecoding.getVersion()));
		} else {
			s.addSpplyDlvryIdTypCdgVrsn("NULL");
		}

		if(supplydeliveryidentifiertypecodingi == supplydeliveryidentifiertypecodinglist.size()-1) {s.addSpplyDlvryIdTypCdgVrsn("]]");}


		/******************** SpplyDlvry_Id_Typ_Cdg_Cd ********************************************************************************/
		if(supplydeliveryidentifiertypecodingi == 0) {s.addSpplyDlvryIdTypCdgCd("[[");}
		if(supplydeliveryidentifiertypecoding.hasCode()) {

			s.addSpplyDlvryIdTypCdgCd(String.valueOf(supplydeliveryidentifiertypecoding.getCode()));
		} else {
			s.addSpplyDlvryIdTypCdgCd("NULL");
		}

		if(supplydeliveryidentifiertypecodingi == supplydeliveryidentifiertypecodinglist.size()-1) {s.addSpplyDlvryIdTypCdgCd("]]");}


		/******************** SpplyDlvry_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(supplydeliveryidentifiertypecodingi == 0) {s.addSpplyDlvryIdTypCdgUsrSltd("[[");}
		if(supplydeliveryidentifiertypecoding.hasUserSelected()) {

			s.addSpplyDlvryIdTypCdgUsrSltd(String.valueOf(supplydeliveryidentifiertypecoding.getUserSelected()));
		} else {
			s.addSpplyDlvryIdTypCdgUsrSltd("NULL");
		}

		if(supplydeliveryidentifiertypecodingi == supplydeliveryidentifiertypecodinglist.size()-1) {s.addSpplyDlvryIdTypCdgUsrSltd("]]");}


		/******************** SpplyDlvry_Id_Typ_Cdg_Sys ********************************************************************************/
		if(supplydeliveryidentifiertypecodingi == 0) {s.addSpplyDlvryIdTypCdgSys("[[");}
		if(supplydeliveryidentifiertypecoding.hasSystem()) {

			s.addSpplyDlvryIdTypCdgSys(String.valueOf(supplydeliveryidentifiertypecoding.getSystem()));
		} else {
			s.addSpplyDlvryIdTypCdgSys("NULL");
		}

		if(supplydeliveryidentifiertypecodingi == supplydeliveryidentifiertypecodinglist.size()-1) {s.addSpplyDlvryIdTypCdgSys("]]");}


		 };
		/******************** supplydeliveryidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period supplydeliveryidentifierperiod = supplydeliveryidentifier.getPeriod();

		/******************** SpplyDlvry_Id_Prd_Strt ********************************************************************************/
		if(supplydeliveryidentifieri == 0) {s.addSpplyDlvryIdPrdStrt("[");}
		if(supplydeliveryidentifierperiod.hasStart()) {

			s.addSpplyDlvryIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(supplydeliveryidentifierperiod.getStart())+"\"");
		} else {
			s.addSpplyDlvryIdPrdStrt("NULL");
		}

		if(supplydeliveryidentifieri == supplydeliveryidentifierlist.size()-1) {s.addSpplyDlvryIdPrdStrt("]");}


		/******************** SpplyDlvry_Id_Prd_End ********************************************************************************/
		if(supplydeliveryidentifieri == 0) {s.addSpplyDlvryIdPrdEnd("[");}
		if(supplydeliveryidentifierperiod.hasEnd()) {

			s.addSpplyDlvryIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(supplydeliveryidentifierperiod.getEnd())+"\"");
		} else {
			s.addSpplyDlvryIdPrdEnd("NULL");
		}

		if(supplydeliveryidentifieri == supplydeliveryidentifierlist.size()-1) {s.addSpplyDlvryIdPrdEnd("]");}


		/******************** supplydeliveryidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse supplydeliveryidentifieruse = supplydeliveryidentifier.getUse();
		if(supplydeliveryidentifieruse!=null) {
		if(supplydeliveryidentifieri == 0) {

		s.addSpplyDlvryIdUse("[");		}
			s.addSpplyDlvryIdUse(supplydeliveryidentifieruse.toCode());
		if(supplydeliveryidentifieri == supplydeliveryidentifierlist.size()-1) {

		s.addSpplyDlvryIdUse("]");		}

		} else {
			s.addSpplyDlvryIdUse("NULL");
		}

		/******************** SpplyDlvry_Id_Assigner ********************************************************************************/
		if(supplydeliveryidentifieri == 0) {s.addSpplyDlvryIdAssigner("[");}
		if(supplydeliveryidentifier.hasAssigner()) {

			if(supplydeliveryidentifier.getAssigner().getReference() != null) {
			s.addSpplyDlvryIdAssigner(supplydeliveryidentifier.getAssigner().getReference());
			}
		} else {
			s.addSpplyDlvryIdAssigner("NULL");
		}

		if(supplydeliveryidentifieri == supplydeliveryidentifierlist.size()-1) {s.addSpplyDlvryIdAssigner("]");}


		/******************** SpplyDlvry_Id_Sys ********************************************************************************/
		if(supplydeliveryidentifieri == 0) {s.addSpplyDlvryIdSys("[");}
		if(supplydeliveryidentifier.hasSystem()) {

			s.addSpplyDlvryIdSys(String.valueOf(supplydeliveryidentifier.getSystem()));
		} else {
			s.addSpplyDlvryIdSys("NULL");
		}

		if(supplydeliveryidentifieri == supplydeliveryidentifierlist.size()-1) {s.addSpplyDlvryIdSys("]");}


		 };
		/******************** SpplyDlvry_OccrnceDtTimeTyp ********************************************************************************/
		if(supplydelivery.hasOccurrenceDateTimeType()) {

			s.addSpplyDlvryOccrnceDtTimeTyp("\""+supplydelivery.getOccurrenceDateTimeType().getValueAsString()+"\"");
		} else {
			s.addSpplyDlvryOccrnceDtTimeTyp("NULL");
		}


		/******************** supplydeliveryoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period supplydeliveryoccurrenceperiod = supplydelivery.getOccurrencePeriod();

		/******************** SpplyDlvry_OccrncePrd_Strt ********************************************************************************/
		if(supplydeliveryoccurrenceperiod.hasStart()) {

			s.addSpplyDlvryOccrncePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(supplydeliveryoccurrenceperiod.getStart())+"\"");
		} else {
			s.addSpplyDlvryOccrncePrdStrt("NULL");
		}


		/******************** SpplyDlvry_OccrncePrd_End ********************************************************************************/
		if(supplydeliveryoccurrenceperiod.hasEnd()) {

			s.addSpplyDlvryOccrncePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(supplydeliveryoccurrenceperiod.getEnd())+"\"");
		} else {
			s.addSpplyDlvryOccrncePrdEnd("NULL");
		}


		/******************** SpplyDlvry_Supplier ********************************************************************************/
		if(supplydelivery.hasSupplier()) {

			if(supplydelivery.getSupplier().getReference() != null) {
			s.addSpplyDlvrySupplier(supplydelivery.getSupplier().getReference());
			}
		} else {
			s.addSpplyDlvrySupplier("NULL");
		}


		/******************** supplydeliveryoccurrencetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing supplydeliveryoccurrencetiming = supplydelivery.getOccurrenceTiming();

		/******************** supplydeliveryoccurrencetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplydeliveryoccurrencetimingcode = supplydeliveryoccurrencetiming.getCode();

		/******************** SpplyDlvry_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(supplydeliveryoccurrencetimingcode.hasText()) {

			s.addSpplyDlvryOccrnceTmgCdTxt(String.valueOf(supplydeliveryoccurrencetimingcode.getText()));
		} else {
			s.addSpplyDlvryOccrnceTmgCdTxt("NULL");
		}


		/******************** supplydeliveryoccurrencetimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> supplydeliveryoccurrencetimingcodecodinglist = supplydeliveryoccurrencetimingcode.getCoding();
		for(int supplydeliveryoccurrencetimingcodecodingi = 0; supplydeliveryoccurrencetimingcodecodingi<supplydeliveryoccurrencetimingcodecodinglist.size();supplydeliveryoccurrencetimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  supplydeliveryoccurrencetimingcodecoding = supplydeliveryoccurrencetimingcodecodinglist.get(supplydeliveryoccurrencetimingcodecodingi);

		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(supplydeliveryoccurrencetimingcodecodingi == 0) {s.addSpplyDlvryOccrnceTmgCdCdgDsply("[");}
		if(supplydeliveryoccurrencetimingcodecoding.hasDisplay()) {

			s.addSpplyDlvryOccrnceTmgCdCdgDsply(String.valueOf(supplydeliveryoccurrencetimingcodecoding.getDisplay()));
		} else {
			s.addSpplyDlvryOccrnceTmgCdCdgDsply("NULL");
		}

		if(supplydeliveryoccurrencetimingcodecodingi == supplydeliveryoccurrencetimingcodecodinglist.size()-1) {s.addSpplyDlvryOccrnceTmgCdCdgDsply("]");}


		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(supplydeliveryoccurrencetimingcodecodingi == 0) {s.addSpplyDlvryOccrnceTmgCdCdgVrsn("[");}
		if(supplydeliveryoccurrencetimingcodecoding.hasVersion()) {

			s.addSpplyDlvryOccrnceTmgCdCdgVrsn(String.valueOf(supplydeliveryoccurrencetimingcodecoding.getVersion()));
		} else {
			s.addSpplyDlvryOccrnceTmgCdCdgVrsn("NULL");
		}

		if(supplydeliveryoccurrencetimingcodecodingi == supplydeliveryoccurrencetimingcodecodinglist.size()-1) {s.addSpplyDlvryOccrnceTmgCdCdgVrsn("]");}


		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(supplydeliveryoccurrencetimingcodecodingi == 0) {s.addSpplyDlvryOccrnceTmgCdCdgCd("[");}
		if(supplydeliveryoccurrencetimingcodecoding.hasCode()) {

			s.addSpplyDlvryOccrnceTmgCdCdgCd(String.valueOf(supplydeliveryoccurrencetimingcodecoding.getCode()));
		} else {
			s.addSpplyDlvryOccrnceTmgCdCdgCd("NULL");
		}

		if(supplydeliveryoccurrencetimingcodecodingi == supplydeliveryoccurrencetimingcodecodinglist.size()-1) {s.addSpplyDlvryOccrnceTmgCdCdgCd("]");}


		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(supplydeliveryoccurrencetimingcodecodingi == 0) {s.addSpplyDlvryOccrnceTmgCdCdgUsrSltd("[");}
		if(supplydeliveryoccurrencetimingcodecoding.hasUserSelected()) {

			s.addSpplyDlvryOccrnceTmgCdCdgUsrSltd(String.valueOf(supplydeliveryoccurrencetimingcodecoding.getUserSelected()));
		} else {
			s.addSpplyDlvryOccrnceTmgCdCdgUsrSltd("NULL");
		}

		if(supplydeliveryoccurrencetimingcodecodingi == supplydeliveryoccurrencetimingcodecodinglist.size()-1) {s.addSpplyDlvryOccrnceTmgCdCdgUsrSltd("]");}


		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(supplydeliveryoccurrencetimingcodecodingi == 0) {s.addSpplyDlvryOccrnceTmgCdCdgSys("[");}
		if(supplydeliveryoccurrencetimingcodecoding.hasSystem()) {

			s.addSpplyDlvryOccrnceTmgCdCdgSys(String.valueOf(supplydeliveryoccurrencetimingcodecoding.getSystem()));
		} else {
			s.addSpplyDlvryOccrnceTmgCdCdgSys("NULL");
		}

		if(supplydeliveryoccurrencetimingcodecodingi == supplydeliveryoccurrencetimingcodecodinglist.size()-1) {s.addSpplyDlvryOccrnceTmgCdCdgSys("]");}


		 };
		/******************** SpplyDlvry_OccrnceTmg_Evnt ********************************************************************************/
		if(supplydeliveryoccurrencetiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<supplydeliveryoccurrencetiming.getEvent().size(); incr++) {
				array = array + supplydeliveryoccurrencetiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSpplyDlvryOccrnceTmgEvnt(array);

		} else {
			s.addSpplyDlvryOccrnceTmgEvnt("NULL");
		}


		/******************** supplydeliveryoccurrencetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent supplydeliveryoccurrencetimingrepeat = supplydeliveryoccurrencetiming.getRepeat();

		/******************** SpplyDlvry_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeat.hasOffset()) {

			s.addSpplyDlvryOccrnceTmgRptOff(String.valueOf(supplydeliveryoccurrencetimingrepeat.getOffset()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptOff("NULL");
		}


		/******************** SpplyDlvry_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeat.hasCount()) {

			s.addSpplyDlvryOccrnceTmgRptCnt(String.valueOf(supplydeliveryoccurrencetimingrepeat.getCount()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptCnt("NULL");
		}


		/******************** SpplyDlvry_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeat.hasPeriod()) {

			s.addSpplyDlvryOccrnceTmgRptPrd(String.valueOf(supplydeliveryoccurrencetimingrepeat.getPeriod()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptPrd("NULL");
		}


		/******************** SpplyDlvry_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeat.hasCountMax()) {

			s.addSpplyDlvryOccrnceTmgRptCntMx(String.valueOf(supplydeliveryoccurrencetimingrepeat.getCountMax()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptCntMx("NULL");
		}


		/******************** SpplyDlvry_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeat.hasDurationMax()) {

			s.addSpplyDlvryOccrnceTmgRptDurationMx(String.valueOf(supplydeliveryoccurrencetimingrepeat.getDurationMax()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptDurationMx("NULL");
		}


		/******************** supplydeliveryoccurrencetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period supplydeliveryoccurrencetimingrepeatboundsperiod = supplydeliveryoccurrencetimingrepeat.getBoundsPeriod();

		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsperiod.hasStart()) {

			s.addSpplyDlvryOccrnceTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(supplydeliveryoccurrencetimingrepeatboundsperiod.getStart())+"\"");
		} else {
			s.addSpplyDlvryOccrnceTmgRptBndsPrdStrt("NULL");
		}


		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsperiod.hasEnd()) {

			s.addSpplyDlvryOccrnceTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(supplydeliveryoccurrencetimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			s.addSpplyDlvryOccrnceTmgRptBndsPrdEnd("NULL");
		}


		/******************** supplydeliveryoccurrencetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime supplydeliveryoccurrencetimingrepeatdurationunit = supplydeliveryoccurrencetimingrepeat.getDurationUnit();
		if(supplydeliveryoccurrencetimingrepeatdurationunit!=null) {
			s.addSpplyDlvryOccrnceTmgRptDurationUnt(supplydeliveryoccurrencetimingrepeatdurationunit.toCode());
		} else {
			s.addSpplyDlvryOccrnceTmgRptDurationUnt("NULL");
		}

		/******************** supplydeliveryoccurrencetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration supplydeliveryoccurrencetimingrepeatboundsduration = supplydeliveryoccurrencetimingrepeat.getBoundsDuration();

		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsduration.hasValue()) {

			s.addSpplyDlvryOccrnceTmgRptBndsDurationVl(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsduration.getValue()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptBndsDurationVl("NULL");
		}


		/******************** supplydeliveryoccurrencetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplydeliveryoccurrencetimingrepeatboundsdurationcomparator = supplydeliveryoccurrencetimingrepeatboundsduration.getComparator();
		if(supplydeliveryoccurrencetimingrepeatboundsdurationcomparator!=null) {
			s.addSpplyDlvryOccrnceTmgRptBndsDurationCmprtr(supplydeliveryoccurrencetimingrepeatboundsdurationcomparator.toCode());
		} else {
			s.addSpplyDlvryOccrnceTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsduration.hasCode()) {

			s.addSpplyDlvryOccrnceTmgRptBndsDurationCd(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsduration.getCode()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptBndsDurationCd("NULL");
		}


		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsduration.hasUnit()) {

			s.addSpplyDlvryOccrnceTmgRptBndsDurationUnt(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsduration.getUnit()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptBndsDurationUnt("NULL");
		}


		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsduration.hasSystem()) {

			s.addSpplyDlvryOccrnceTmgRptBndsDurationSys(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsduration.getSystem()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptBndsDurationSys("NULL");
		}


		/******************** supplydeliveryoccurrencetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range supplydeliveryoccurrencetimingrepeatboundsrange = supplydeliveryoccurrencetimingrepeat.getBoundsRange();

		/******************** supplydeliveryoccurrencetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplydeliveryoccurrencetimingrepeatboundsrangelow = supplydeliveryoccurrencetimingrepeatboundsrange.getLow();

		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsrangelow.hasValue()) {

			s.addSpplyDlvryOccrnceTmgRptBndsRngLwVl(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsrangelow.getValue()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptBndsRngLwVl("NULL");
		}


		/******************** supplydeliveryoccurrencetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplydeliveryoccurrencetimingrepeatboundsrangelowcomparator = supplydeliveryoccurrencetimingrepeatboundsrangelow.getComparator();
		if(supplydeliveryoccurrencetimingrepeatboundsrangelowcomparator!=null) {
			s.addSpplyDlvryOccrnceTmgRptBndsRngLwCmprtr(supplydeliveryoccurrencetimingrepeatboundsrangelowcomparator.toCode());
		} else {
			s.addSpplyDlvryOccrnceTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsrangelow.hasCode()) {

			s.addSpplyDlvryOccrnceTmgRptBndsRngLwCd(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsrangelow.getCode()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptBndsRngLwCd("NULL");
		}


		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsrangelow.hasUnit()) {

			s.addSpplyDlvryOccrnceTmgRptBndsRngLwUnt(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsrangelow.getUnit()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptBndsRngLwUnt("NULL");
		}


		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsrangelow.hasSystem()) {

			s.addSpplyDlvryOccrnceTmgRptBndsRngLwSys(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsrangelow.getSystem()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptBndsRngLwSys("NULL");
		}


		/******************** supplydeliveryoccurrencetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplydeliveryoccurrencetimingrepeatboundsrangehigh = supplydeliveryoccurrencetimingrepeatboundsrange.getHigh();

		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsrangehigh.hasValue()) {

			s.addSpplyDlvryOccrnceTmgRptBndsRngHiVl(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsrangehigh.getValue()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptBndsRngHiVl("NULL");
		}


		/******************** supplydeliveryoccurrencetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplydeliveryoccurrencetimingrepeatboundsrangehighcomparator = supplydeliveryoccurrencetimingrepeatboundsrangehigh.getComparator();
		if(supplydeliveryoccurrencetimingrepeatboundsrangehighcomparator!=null) {
			s.addSpplyDlvryOccrnceTmgRptBndsRngHiCmprtr(supplydeliveryoccurrencetimingrepeatboundsrangehighcomparator.toCode());
		} else {
			s.addSpplyDlvryOccrnceTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsrangehigh.hasCode()) {

			s.addSpplyDlvryOccrnceTmgRptBndsRngHiCd(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsrangehigh.getCode()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptBndsRngHiCd("NULL");
		}


		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsrangehigh.hasUnit()) {

			s.addSpplyDlvryOccrnceTmgRptBndsRngHiUnt(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsrangehigh.getUnit()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptBndsRngHiUnt("NULL");
		}


		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsrangehigh.hasSystem()) {

			s.addSpplyDlvryOccrnceTmgRptBndsRngHiSys(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsrangehigh.getSystem()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptBndsRngHiSys("NULL");
		}


		/******************** SpplyDlvry_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeat.hasFrequencyMax()) {

			s.addSpplyDlvryOccrnceTmgRptFrqncyMx(String.valueOf(supplydeliveryoccurrencetimingrepeat.getFrequencyMax()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptFrqncyMx("NULL");
		}


		/******************** supplydeliveryoccurrencetimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> supplydeliveryoccurrencetimingrepeatwhenlist = supplydeliveryoccurrencetimingrepeat.getWhen();
		for(int supplydeliveryoccurrencetimingrepeatwheni = 0; supplydeliveryoccurrencetimingrepeatwheni<supplydeliveryoccurrencetimingrepeatwhenlist.size();supplydeliveryoccurrencetimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  supplydeliveryoccurrencetimingrepeatwhen = supplydeliveryoccurrencetimingrepeatwhenlist.get(supplydeliveryoccurrencetimingrepeatwheni);
		if(supplydeliveryoccurrencetimingrepeatwhen!=null) {
			s.addSpplyDlvryOccrnceTmgRptWhen(supplydeliveryoccurrencetimingrepeatwhen.getCode());
		} else {
			s.addSpplyDlvryOccrnceTmgRptWhen("NULL");
		}
		 };

		/******************** supplydeliveryoccurrencetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime supplydeliveryoccurrencetimingrepeatperiodunit = supplydeliveryoccurrencetimingrepeat.getPeriodUnit();
		if(supplydeliveryoccurrencetimingrepeatperiodunit!=null) {
			s.addSpplyDlvryOccrnceTmgRptPrdUnt(supplydeliveryoccurrencetimingrepeatperiodunit.toCode());
		} else {
			s.addSpplyDlvryOccrnceTmgRptPrdUnt("NULL");
		}

		/******************** SpplyDlvry_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeat.hasPeriodMax()) {

			s.addSpplyDlvryOccrnceTmgRptPrdMx(String.valueOf(supplydeliveryoccurrencetimingrepeat.getPeriodMax()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptPrdMx("NULL");
		}


		/******************** supplydeliveryoccurrencetimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> supplydeliveryoccurrencetimingrepeatdayofweeklist = supplydeliveryoccurrencetimingrepeat.getDayOfWeek();
		for(int supplydeliveryoccurrencetimingrepeatdayofweeki = 0; supplydeliveryoccurrencetimingrepeatdayofweeki<supplydeliveryoccurrencetimingrepeatdayofweeklist.size();supplydeliveryoccurrencetimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  supplydeliveryoccurrencetimingrepeatdayofweek = supplydeliveryoccurrencetimingrepeatdayofweeklist.get(supplydeliveryoccurrencetimingrepeatdayofweeki);
		if(supplydeliveryoccurrencetimingrepeatdayofweek!=null) {
			s.addSpplyDlvryOccrnceTmgRptDayOfWeek(supplydeliveryoccurrencetimingrepeatdayofweek.getCode());
		} else {
			s.addSpplyDlvryOccrnceTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** SpplyDlvry_OccrnceTmg_Rpt_TimeOfDay ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<supplydeliveryoccurrencetimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + supplydeliveryoccurrencetimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSpplyDlvryOccrnceTmgRptTimeOfDay(array);

		} else {
			s.addSpplyDlvryOccrnceTmgRptTimeOfDay("NULL");
		}


		/******************** SpplyDlvry_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeat.hasDuration()) {

			s.addSpplyDlvryOccrnceTmgRptDuration(String.valueOf(supplydeliveryoccurrencetimingrepeat.getDuration()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptDuration("NULL");
		}


		/******************** SpplyDlvry_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeat.hasFrequency()) {

			s.addSpplyDlvryOccrnceTmgRptFrqncy(String.valueOf(supplydeliveryoccurrencetimingrepeat.getFrequency()));
		} else {
			s.addSpplyDlvryOccrnceTmgRptFrqncy("NULL");
		}


		/******************** SpplyDlvry_Pnt ********************************************************************************/
		if(supplydelivery.hasPatient()) {

			if(supplydelivery.getPatient().getReference() != null) {
			s.addSpplyDlvryPnt(supplydelivery.getPatient().getReference());
			}
		} else {
			s.addSpplyDlvryPnt("NULL");
		}


		/******************** SpplyDlvry_Destination ********************************************************************************/
		if(supplydelivery.hasDestination()) {

			if(supplydelivery.getDestination().getReference() != null) {
			s.addSpplyDlvryDestination(supplydelivery.getDestination().getReference());
			}
		} else {
			s.addSpplyDlvryDestination("NULL");
		}


		/******************** SpplyDlvry_PartOf ********************************************************************************/
		if(supplydelivery.hasPartOf()) {

			String  array = "[";
			for(int incr=0; incr<supplydelivery.getPartOf().size(); incr++) {
				array = array + supplydelivery.getPartOf().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSpplyDlvryPartOf(array);

		} else {
			s.addSpplyDlvryPartOf("NULL");
		}


		/******************** supplydeliverysupplieditem ********************************************************************************/
		org.hl7.fhir.r4.model.SupplyDelivery.SupplyDeliverySuppliedItemComponent supplydeliverysupplieditem = supplydelivery.getSuppliedItem();

		/******************** SpplyDlvry_SuppliedItm_ItmRfrnc ********************************************************************************/
		if(supplydeliverysupplieditem.hasItemReference()) {

			if(supplydeliverysupplieditem.getItemReference().getReference() != null) {
			s.addSpplyDlvrySuppliedItmItmRfrnc(supplydeliverysupplieditem.getItemReference().getReference());
			}
		} else {
			s.addSpplyDlvrySuppliedItmItmRfrnc("NULL");
		}


		/******************** supplydeliverysupplieditemitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplydeliverysupplieditemitemcodeableconcept = supplydeliverysupplieditem.getItemCodeableConcept();

		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Txt ********************************************************************************/
		if(supplydeliverysupplieditemitemcodeableconcept.hasText()) {

			s.addSpplyDlvrySuppliedItmItmCdbleCncptTxt(String.valueOf(supplydeliverysupplieditemitemcodeableconcept.getText()));
		} else {
			s.addSpplyDlvrySuppliedItmItmCdbleCncptTxt("NULL");
		}


		/******************** supplydeliverysupplieditemitemcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> supplydeliverysupplieditemitemcodeableconceptcodinglist = supplydeliverysupplieditemitemcodeableconcept.getCoding();
		for(int supplydeliverysupplieditemitemcodeableconceptcodingi = 0; supplydeliverysupplieditemitemcodeableconceptcodingi<supplydeliverysupplieditemitemcodeableconceptcodinglist.size();supplydeliverysupplieditemitemcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  supplydeliverysupplieditemitemcodeableconceptcoding = supplydeliverysupplieditemitemcodeableconceptcodinglist.get(supplydeliverysupplieditemitemcodeableconceptcodingi);

		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(supplydeliverysupplieditemitemcodeableconceptcodingi == 0) {s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgDsply("[");}
		if(supplydeliverysupplieditemitemcodeableconceptcoding.hasDisplay()) {

			s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgDsply(String.valueOf(supplydeliverysupplieditemitemcodeableconceptcoding.getDisplay()));
		} else {
			s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgDsply("NULL");
		}

		if(supplydeliverysupplieditemitemcodeableconceptcodingi == supplydeliverysupplieditemitemcodeableconceptcodinglist.size()-1) {s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgDsply("]");}


		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(supplydeliverysupplieditemitemcodeableconceptcodingi == 0) {s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgVrsn("[");}
		if(supplydeliverysupplieditemitemcodeableconceptcoding.hasVersion()) {

			s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgVrsn(String.valueOf(supplydeliverysupplieditemitemcodeableconceptcoding.getVersion()));
		} else {
			s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgVrsn("NULL");
		}

		if(supplydeliverysupplieditemitemcodeableconceptcodingi == supplydeliverysupplieditemitemcodeableconceptcodinglist.size()-1) {s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgVrsn("]");}


		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(supplydeliverysupplieditemitemcodeableconceptcodingi == 0) {s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgCd("[");}
		if(supplydeliverysupplieditemitemcodeableconceptcoding.hasCode()) {

			s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgCd(String.valueOf(supplydeliverysupplieditemitemcodeableconceptcoding.getCode()));
		} else {
			s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgCd("NULL");
		}

		if(supplydeliverysupplieditemitemcodeableconceptcodingi == supplydeliverysupplieditemitemcodeableconceptcodinglist.size()-1) {s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgCd("]");}


		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(supplydeliverysupplieditemitemcodeableconceptcodingi == 0) {s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgUsrSltd("[");}
		if(supplydeliverysupplieditemitemcodeableconceptcoding.hasUserSelected()) {

			s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgUsrSltd(String.valueOf(supplydeliverysupplieditemitemcodeableconceptcoding.getUserSelected()));
		} else {
			s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgUsrSltd("NULL");
		}

		if(supplydeliverysupplieditemitemcodeableconceptcodingi == supplydeliverysupplieditemitemcodeableconceptcodinglist.size()-1) {s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgUsrSltd("]");}


		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(supplydeliverysupplieditemitemcodeableconceptcodingi == 0) {s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgSys("[");}
		if(supplydeliverysupplieditemitemcodeableconceptcoding.hasSystem()) {

			s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgSys(String.valueOf(supplydeliverysupplieditemitemcodeableconceptcoding.getSystem()));
		} else {
			s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgSys("NULL");
		}

		if(supplydeliverysupplieditemitemcodeableconceptcodingi == supplydeliverysupplieditemitemcodeableconceptcodinglist.size()-1) {s.addSpplyDlvrySuppliedItmItmCdbleCncptCdgSys("]");}


		 };
		/******************** supplydeliverysupplieditemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplydeliverysupplieditemquantity = supplydeliverysupplieditem.getQuantity();

		/******************** SpplyDlvry_SuppliedItm_Qnty_Vl ********************************************************************************/
		if(supplydeliverysupplieditemquantity.hasValue()) {

			s.addSpplyDlvrySuppliedItmQntyVl(String.valueOf(supplydeliverysupplieditemquantity.getValue()));
		} else {
			s.addSpplyDlvrySuppliedItmQntyVl("NULL");
		}


		/******************** supplydeliverysupplieditemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplydeliverysupplieditemquantitycomparator = supplydeliverysupplieditemquantity.getComparator();
		if(supplydeliverysupplieditemquantitycomparator!=null) {
			s.addSpplyDlvrySuppliedItmQntyCmprtr(supplydeliverysupplieditemquantitycomparator.toCode());
		} else {
			s.addSpplyDlvrySuppliedItmQntyCmprtr("NULL");
		}

		/******************** SpplyDlvry_SuppliedItm_Qnty_Cd ********************************************************************************/
		if(supplydeliverysupplieditemquantity.hasCode()) {

			s.addSpplyDlvrySuppliedItmQntyCd(String.valueOf(supplydeliverysupplieditemquantity.getCode()));
		} else {
			s.addSpplyDlvrySuppliedItmQntyCd("NULL");
		}


		/******************** SpplyDlvry_SuppliedItm_Qnty_Unt ********************************************************************************/
		if(supplydeliverysupplieditemquantity.hasUnit()) {

			s.addSpplyDlvrySuppliedItmQntyUnt(String.valueOf(supplydeliverysupplieditemquantity.getUnit()));
		} else {
			s.addSpplyDlvrySuppliedItmQntyUnt("NULL");
		}


		/******************** SpplyDlvry_SuppliedItm_Qnty_Sys ********************************************************************************/
		if(supplydeliverysupplieditemquantity.hasSystem()) {

			s.addSpplyDlvrySuppliedItmQntySys(String.valueOf(supplydeliverysupplieditemquantity.getSystem()));
		} else {
			s.addSpplyDlvrySuppliedItmQntySys("NULL");
		}


		/******************** SpplyDlvry_Receiver ********************************************************************************/
		if(supplydelivery.hasReceiver()) {

			String  array = "[";
			for(int incr=0; incr<supplydelivery.getReceiver().size(); incr++) {
				array = array + supplydelivery.getReceiver().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSpplyDlvryReceiver(array);

		} else {
			s.addSpplyDlvryReceiver("NULL");
		}


		return s;
	}
}
