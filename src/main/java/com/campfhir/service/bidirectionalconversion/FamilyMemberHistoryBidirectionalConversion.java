package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.FamilyMemberHistory;
public class FamilyMemberHistoryBidirectionalConversion 
{
	public FamilyMemberHistory FamilyMemberHistorys(org.hl7.fhir.r4.model.FamilyMemberHistory familymemberhistory) throws ParseException
	{
		 main.java.com.campfhir.model.FamilyMemberHistory f = new  main.java.com.campfhir.model.FamilyMemberHistory();

		/******************** id ********************************************************************************/
		f.setId(familymemberhistory.getIdElement().getIdPart());

		/******************** FmlyMmbrHis_Nm ********************************************************************************/
		if(familymemberhistory.hasName()) {

			f.addFmlyMmbrHisNm(String.valueOf(familymemberhistory.getName()));
		} else {
			f.addFmlyMmbrHisNm("NULL");
		}


		/******************** FmlyMmbrHis_Dt ********************************************************************************/
		if(familymemberhistory.hasDate()) {

			f.addFmlyMmbrHisDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(familymemberhistory.getDate())+"\"");
		} else {
			f.addFmlyMmbrHisDt("NULL");
		}


		/******************** familymemberhistorystatus ********************************************************************************/
		org.hl7.fhir.r4.model.FamilyMemberHistory.FamilyHistoryStatus familymemberhistorystatus = familymemberhistory.getStatus();
		if(familymemberhistorystatus!=null) {
			f.addFmlyMmbrHisSts(familymemberhistorystatus.toCode());
		} else {
			f.addFmlyMmbrHisSts("NULL");
		}

		/******************** familymemberhistoryreasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> familymemberhistoryreasoncodelist = familymemberhistory.getReasonCode();
		for(int familymemberhistoryreasoncodei = 0; familymemberhistoryreasoncodei<familymemberhistoryreasoncodelist.size();familymemberhistoryreasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  familymemberhistoryreasoncode = familymemberhistoryreasoncodelist.get(familymemberhistoryreasoncodei);

		/******************** FmlyMmbrHis_RsnCd_Txt ********************************************************************************/
		if(familymemberhistoryreasoncodei == 0) {f.addFmlyMmbrHisRsnCdTxt("[");}
		if(familymemberhistoryreasoncode.hasText()) {

			f.addFmlyMmbrHisRsnCdTxt(String.valueOf(familymemberhistoryreasoncode.getText()));
		} else {
			f.addFmlyMmbrHisRsnCdTxt("NULL");
		}

		if(familymemberhistoryreasoncodei == familymemberhistoryreasoncodelist.size()-1) {f.addFmlyMmbrHisRsnCdTxt("]");}


		/******************** familymemberhistoryreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> familymemberhistoryreasoncodecodinglist = familymemberhistoryreasoncode.getCoding();
		for(int familymemberhistoryreasoncodecodingi = 0; familymemberhistoryreasoncodecodingi<familymemberhistoryreasoncodecodinglist.size();familymemberhistoryreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  familymemberhistoryreasoncodecoding = familymemberhistoryreasoncodecodinglist.get(familymemberhistoryreasoncodecodingi);

		/******************** FmlyMmbrHis_RsnCd_Cdg_Dsply ********************************************************************************/
		if(familymemberhistoryreasoncodecodingi == 0) {f.addFmlyMmbrHisRsnCdCdgDsply("[[");}
		if(familymemberhistoryreasoncodecoding.hasDisplay()) {

			f.addFmlyMmbrHisRsnCdCdgDsply(String.valueOf(familymemberhistoryreasoncodecoding.getDisplay()));
		} else {
			f.addFmlyMmbrHisRsnCdCdgDsply("NULL");
		}

		if(familymemberhistoryreasoncodecodingi == familymemberhistoryreasoncodecodinglist.size()-1) {f.addFmlyMmbrHisRsnCdCdgDsply("]]");}


		/******************** FmlyMmbrHis_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(familymemberhistoryreasoncodecodingi == 0) {f.addFmlyMmbrHisRsnCdCdgVrsn("[[");}
		if(familymemberhistoryreasoncodecoding.hasVersion()) {

			f.addFmlyMmbrHisRsnCdCdgVrsn(String.valueOf(familymemberhistoryreasoncodecoding.getVersion()));
		} else {
			f.addFmlyMmbrHisRsnCdCdgVrsn("NULL");
		}

		if(familymemberhistoryreasoncodecodingi == familymemberhistoryreasoncodecodinglist.size()-1) {f.addFmlyMmbrHisRsnCdCdgVrsn("]]");}


		/******************** FmlyMmbrHis_RsnCd_Cdg_Cd ********************************************************************************/
		if(familymemberhistoryreasoncodecodingi == 0) {f.addFmlyMmbrHisRsnCdCdgCd("[[");}
		if(familymemberhistoryreasoncodecoding.hasCode()) {

			f.addFmlyMmbrHisRsnCdCdgCd(String.valueOf(familymemberhistoryreasoncodecoding.getCode()));
		} else {
			f.addFmlyMmbrHisRsnCdCdgCd("NULL");
		}

		if(familymemberhistoryreasoncodecodingi == familymemberhistoryreasoncodecodinglist.size()-1) {f.addFmlyMmbrHisRsnCdCdgCd("]]");}


		/******************** FmlyMmbrHis_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(familymemberhistoryreasoncodecodingi == 0) {f.addFmlyMmbrHisRsnCdCdgUsrSltd("[[");}
		if(familymemberhistoryreasoncodecoding.hasUserSelected()) {

			f.addFmlyMmbrHisRsnCdCdgUsrSltd(String.valueOf(familymemberhistoryreasoncodecoding.getUserSelected()));
		} else {
			f.addFmlyMmbrHisRsnCdCdgUsrSltd("NULL");
		}

		if(familymemberhistoryreasoncodecodingi == familymemberhistoryreasoncodecodinglist.size()-1) {f.addFmlyMmbrHisRsnCdCdgUsrSltd("]]");}


		/******************** FmlyMmbrHis_RsnCd_Cdg_Sys ********************************************************************************/
		if(familymemberhistoryreasoncodecodingi == 0) {f.addFmlyMmbrHisRsnCdCdgSys("[[");}
		if(familymemberhistoryreasoncodecoding.hasSystem()) {

			f.addFmlyMmbrHisRsnCdCdgSys(String.valueOf(familymemberhistoryreasoncodecoding.getSystem()));
		} else {
			f.addFmlyMmbrHisRsnCdCdgSys("NULL");
		}

		if(familymemberhistoryreasoncodecodingi == familymemberhistoryreasoncodecodinglist.size()-1) {f.addFmlyMmbrHisRsnCdCdgSys("]]");}


		 };
		 };
		/******************** familymemberhistorynote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> familymemberhistorynotelist = familymemberhistory.getNote();
		for(int familymemberhistorynotei = 0; familymemberhistorynotei<familymemberhistorynotelist.size();familymemberhistorynotei++ ) {
		org.hl7.fhir.r4.model.Annotation  familymemberhistorynote = familymemberhistorynotelist.get(familymemberhistorynotei);

		/******************** FmlyMmbrHis_Nt_Time ********************************************************************************/
		if(familymemberhistorynotei == 0) {f.addFmlyMmbrHisNtTime("[");}
		if(familymemberhistorynote.hasTime()) {

			f.addFmlyMmbrHisNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(familymemberhistorynote.getTime())+"\"");
		} else {
			f.addFmlyMmbrHisNtTime("NULL");
		}

		if(familymemberhistorynotei == familymemberhistorynotelist.size()-1) {f.addFmlyMmbrHisNtTime("]");}


		/******************** FmlyMmbrHis_Nt_AthrRfrnc ********************************************************************************/
		if(familymemberhistorynotei == 0) {f.addFmlyMmbrHisNtAthrRfrnc("[");}
		if(familymemberhistorynote.hasAuthorReference()) {

			if(familymemberhistorynote.getAuthorReference().getReference() != null) {
			f.addFmlyMmbrHisNtAthrRfrnc(familymemberhistorynote.getAuthorReference().getReference());
			}
		} else {
			f.addFmlyMmbrHisNtAthrRfrnc("NULL");
		}

		if(familymemberhistorynotei == familymemberhistorynotelist.size()-1) {f.addFmlyMmbrHisNtAthrRfrnc("]");}


		/******************** FmlyMmbrHis_Nt_Txt ********************************************************************************/
		if(familymemberhistorynotei == 0) {f.addFmlyMmbrHisNtTxt("[");}
		if(familymemberhistorynote.hasText()) {

			f.addFmlyMmbrHisNtTxt(String.valueOf(familymemberhistorynote.getText()));
		} else {
			f.addFmlyMmbrHisNtTxt("NULL");
		}

		if(familymemberhistorynotei == familymemberhistorynotelist.size()-1) {f.addFmlyMmbrHisNtTxt("]");}


		/******************** FmlyMmbrHis_Nt_AthrStrgTyp ********************************************************************************/
		if(familymemberhistorynotei == 0) {f.addFmlyMmbrHisNtAthrStrgTyp("[");}
		if(familymemberhistorynote.hasAuthorStringType()) {

			f.addFmlyMmbrHisNtAthrStrgTyp("\""+familymemberhistorynote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			f.addFmlyMmbrHisNtAthrStrgTyp("NULL");
		}

		if(familymemberhistorynotei == familymemberhistorynotelist.size()-1) {f.addFmlyMmbrHisNtAthrStrgTyp("]");}


		 };
		/******************** FmlyMmbrHis_RsnRfrnc ********************************************************************************/
		if(familymemberhistory.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<familymemberhistory.getReasonReference().size(); incr++) {
				array = array + familymemberhistory.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			f.addFmlyMmbrHisRsnRfrnc(array);

		} else {
			f.addFmlyMmbrHisRsnRfrnc("NULL");
		}


		/******************** familymemberhistoryidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> familymemberhistoryidentifierlist = familymemberhistory.getIdentifier();
		for(int familymemberhistoryidentifieri = 0; familymemberhistoryidentifieri<familymemberhistoryidentifierlist.size();familymemberhistoryidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  familymemberhistoryidentifier = familymemberhistoryidentifierlist.get(familymemberhistoryidentifieri);

		/******************** FmlyMmbrHis_Id_Vl ********************************************************************************/
		if(familymemberhistoryidentifieri == 0) {f.addFmlyMmbrHisIdVl("[");}
		if(familymemberhistoryidentifier.hasValue()) {

			f.addFmlyMmbrHisIdVl(String.valueOf(familymemberhistoryidentifier.getValue()));
		} else {
			f.addFmlyMmbrHisIdVl("NULL");
		}

		if(familymemberhistoryidentifieri == familymemberhistoryidentifierlist.size()-1) {f.addFmlyMmbrHisIdVl("]");}


		/******************** familymemberhistoryidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistoryidentifiertype = familymemberhistoryidentifier.getType();

		/******************** FmlyMmbrHis_Id_Typ_Txt ********************************************************************************/
		if(familymemberhistoryidentifieri == 0) {f.addFmlyMmbrHisIdTypTxt("[");}
		if(familymemberhistoryidentifiertype.hasText()) {

			f.addFmlyMmbrHisIdTypTxt(String.valueOf(familymemberhistoryidentifiertype.getText()));
		} else {
			f.addFmlyMmbrHisIdTypTxt("NULL");
		}

		if(familymemberhistoryidentifieri == familymemberhistoryidentifierlist.size()-1) {f.addFmlyMmbrHisIdTypTxt("]");}


		/******************** familymemberhistoryidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> familymemberhistoryidentifiertypecodinglist = familymemberhistoryidentifiertype.getCoding();
		for(int familymemberhistoryidentifiertypecodingi = 0; familymemberhistoryidentifiertypecodingi<familymemberhistoryidentifiertypecodinglist.size();familymemberhistoryidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  familymemberhistoryidentifiertypecoding = familymemberhistoryidentifiertypecodinglist.get(familymemberhistoryidentifiertypecodingi);

		/******************** FmlyMmbrHis_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(familymemberhistoryidentifiertypecodingi == 0) {f.addFmlyMmbrHisIdTypCdgDsply("[[");}
		if(familymemberhistoryidentifiertypecoding.hasDisplay()) {

			f.addFmlyMmbrHisIdTypCdgDsply(String.valueOf(familymemberhistoryidentifiertypecoding.getDisplay()));
		} else {
			f.addFmlyMmbrHisIdTypCdgDsply("NULL");
		}

		if(familymemberhistoryidentifiertypecodingi == familymemberhistoryidentifiertypecodinglist.size()-1) {f.addFmlyMmbrHisIdTypCdgDsply("]]");}


		/******************** FmlyMmbrHis_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(familymemberhistoryidentifiertypecodingi == 0) {f.addFmlyMmbrHisIdTypCdgVrsn("[[");}
		if(familymemberhistoryidentifiertypecoding.hasVersion()) {

			f.addFmlyMmbrHisIdTypCdgVrsn(String.valueOf(familymemberhistoryidentifiertypecoding.getVersion()));
		} else {
			f.addFmlyMmbrHisIdTypCdgVrsn("NULL");
		}

		if(familymemberhistoryidentifiertypecodingi == familymemberhistoryidentifiertypecodinglist.size()-1) {f.addFmlyMmbrHisIdTypCdgVrsn("]]");}


		/******************** FmlyMmbrHis_Id_Typ_Cdg_Cd ********************************************************************************/
		if(familymemberhistoryidentifiertypecodingi == 0) {f.addFmlyMmbrHisIdTypCdgCd("[[");}
		if(familymemberhistoryidentifiertypecoding.hasCode()) {

			f.addFmlyMmbrHisIdTypCdgCd(String.valueOf(familymemberhistoryidentifiertypecoding.getCode()));
		} else {
			f.addFmlyMmbrHisIdTypCdgCd("NULL");
		}

		if(familymemberhistoryidentifiertypecodingi == familymemberhistoryidentifiertypecodinglist.size()-1) {f.addFmlyMmbrHisIdTypCdgCd("]]");}


		/******************** FmlyMmbrHis_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(familymemberhistoryidentifiertypecodingi == 0) {f.addFmlyMmbrHisIdTypCdgUsrSltd("[[");}
		if(familymemberhistoryidentifiertypecoding.hasUserSelected()) {

			f.addFmlyMmbrHisIdTypCdgUsrSltd(String.valueOf(familymemberhistoryidentifiertypecoding.getUserSelected()));
		} else {
			f.addFmlyMmbrHisIdTypCdgUsrSltd("NULL");
		}

		if(familymemberhistoryidentifiertypecodingi == familymemberhistoryidentifiertypecodinglist.size()-1) {f.addFmlyMmbrHisIdTypCdgUsrSltd("]]");}


		/******************** FmlyMmbrHis_Id_Typ_Cdg_Sys ********************************************************************************/
		if(familymemberhistoryidentifiertypecodingi == 0) {f.addFmlyMmbrHisIdTypCdgSys("[[");}
		if(familymemberhistoryidentifiertypecoding.hasSystem()) {

			f.addFmlyMmbrHisIdTypCdgSys(String.valueOf(familymemberhistoryidentifiertypecoding.getSystem()));
		} else {
			f.addFmlyMmbrHisIdTypCdgSys("NULL");
		}

		if(familymemberhistoryidentifiertypecodingi == familymemberhistoryidentifiertypecodinglist.size()-1) {f.addFmlyMmbrHisIdTypCdgSys("]]");}


		 };
		/******************** familymemberhistoryidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period familymemberhistoryidentifierperiod = familymemberhistoryidentifier.getPeriod();

		/******************** FmlyMmbrHis_Id_Prd_Strt ********************************************************************************/
		if(familymemberhistoryidentifieri == 0) {f.addFmlyMmbrHisIdPrdStrt("[");}
		if(familymemberhistoryidentifierperiod.hasStart()) {

			f.addFmlyMmbrHisIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(familymemberhistoryidentifierperiod.getStart())+"\"");
		} else {
			f.addFmlyMmbrHisIdPrdStrt("NULL");
		}

		if(familymemberhistoryidentifieri == familymemberhistoryidentifierlist.size()-1) {f.addFmlyMmbrHisIdPrdStrt("]");}


		/******************** FmlyMmbrHis_Id_Prd_End ********************************************************************************/
		if(familymemberhistoryidentifieri == 0) {f.addFmlyMmbrHisIdPrdEnd("[");}
		if(familymemberhistoryidentifierperiod.hasEnd()) {

			f.addFmlyMmbrHisIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(familymemberhistoryidentifierperiod.getEnd())+"\"");
		} else {
			f.addFmlyMmbrHisIdPrdEnd("NULL");
		}

		if(familymemberhistoryidentifieri == familymemberhistoryidentifierlist.size()-1) {f.addFmlyMmbrHisIdPrdEnd("]");}


		/******************** familymemberhistoryidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse familymemberhistoryidentifieruse = familymemberhistoryidentifier.getUse();
		if(familymemberhistoryidentifieruse!=null) {
		if(familymemberhistoryidentifieri == 0) {

		f.addFmlyMmbrHisIdUse("[");		}
			f.addFmlyMmbrHisIdUse(familymemberhistoryidentifieruse.toCode());
		if(familymemberhistoryidentifieri == familymemberhistoryidentifierlist.size()-1) {

		f.addFmlyMmbrHisIdUse("]");		}

		} else {
			f.addFmlyMmbrHisIdUse("NULL");
		}

		/******************** FmlyMmbrHis_Id_Assigner ********************************************************************************/
		if(familymemberhistoryidentifieri == 0) {f.addFmlyMmbrHisIdAssigner("[");}
		if(familymemberhistoryidentifier.hasAssigner()) {

			if(familymemberhistoryidentifier.getAssigner().getReference() != null) {
			f.addFmlyMmbrHisIdAssigner(familymemberhistoryidentifier.getAssigner().getReference());
			}
		} else {
			f.addFmlyMmbrHisIdAssigner("NULL");
		}

		if(familymemberhistoryidentifieri == familymemberhistoryidentifierlist.size()-1) {f.addFmlyMmbrHisIdAssigner("]");}


		/******************** FmlyMmbrHis_Id_Sys ********************************************************************************/
		if(familymemberhistoryidentifieri == 0) {f.addFmlyMmbrHisIdSys("[");}
		if(familymemberhistoryidentifier.hasSystem()) {

			f.addFmlyMmbrHisIdSys(String.valueOf(familymemberhistoryidentifier.getSystem()));
		} else {
			f.addFmlyMmbrHisIdSys("NULL");
		}

		if(familymemberhistoryidentifieri == familymemberhistoryidentifierlist.size()-1) {f.addFmlyMmbrHisIdSys("]");}


		 };
		/******************** FmlyMmbrHis_InstantiatesUri ********************************************************************************/
		if(familymemberhistory.hasInstantiatesUri()) {

			String  array = "[";
			for(int incr=0; incr<familymemberhistory.getInstantiatesUri().size(); incr++) {
				array = array + familymemberhistory.getInstantiatesUri().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			f.addFmlyMmbrHisInstantiatesUri(array);

		} else {
			f.addFmlyMmbrHisInstantiatesUri("NULL");
		}


		/******************** familymemberhistorycondition ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.FamilyMemberHistory.FamilyMemberHistoryConditionComponent> familymemberhistoryconditionlist = familymemberhistory.getCondition();
		for(int familymemberhistoryconditioni = 0; familymemberhistoryconditioni<familymemberhistoryconditionlist.size();familymemberhistoryconditioni++ ) {
		org.hl7.fhir.r4.model.FamilyMemberHistory.FamilyMemberHistoryConditionComponent  familymemberhistorycondition = familymemberhistoryconditionlist.get(familymemberhistoryconditioni);

		/******************** familymemberhistoryconditioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistoryconditioncode = familymemberhistorycondition.getCode();

		/******************** FmlyMmbrHis_Cndtn_Cd_Txt ********************************************************************************/
		if(familymemberhistoryconditioni == 0) {f.addFmlyMmbrHisCndtnCdTxt("[");}
		if(familymemberhistoryconditioncode.hasText()) {

			f.addFmlyMmbrHisCndtnCdTxt(String.valueOf(familymemberhistoryconditioncode.getText()));
		} else {
			f.addFmlyMmbrHisCndtnCdTxt("NULL");
		}

		if(familymemberhistoryconditioni == familymemberhistoryconditionlist.size()-1) {f.addFmlyMmbrHisCndtnCdTxt("]");}


		/******************** familymemberhistoryconditioncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> familymemberhistoryconditioncodecodinglist = familymemberhistoryconditioncode.getCoding();
		for(int familymemberhistoryconditioncodecodingi = 0; familymemberhistoryconditioncodecodingi<familymemberhistoryconditioncodecodinglist.size();familymemberhistoryconditioncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  familymemberhistoryconditioncodecoding = familymemberhistoryconditioncodecodinglist.get(familymemberhistoryconditioncodecodingi);

		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_Dsply ********************************************************************************/
		if(familymemberhistoryconditioncodecodingi == 0) {f.addFmlyMmbrHisCndtnCdCdgDsply("[[");}
		if(familymemberhistoryconditioncodecoding.hasDisplay()) {

			f.addFmlyMmbrHisCndtnCdCdgDsply(String.valueOf(familymemberhistoryconditioncodecoding.getDisplay()));
		} else {
			f.addFmlyMmbrHisCndtnCdCdgDsply("NULL");
		}

		if(familymemberhistoryconditioncodecodingi == familymemberhistoryconditioncodecodinglist.size()-1) {f.addFmlyMmbrHisCndtnCdCdgDsply("]]");}


		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_Vrsn ********************************************************************************/
		if(familymemberhistoryconditioncodecodingi == 0) {f.addFmlyMmbrHisCndtnCdCdgVrsn("[[");}
		if(familymemberhistoryconditioncodecoding.hasVersion()) {

			f.addFmlyMmbrHisCndtnCdCdgVrsn(String.valueOf(familymemberhistoryconditioncodecoding.getVersion()));
		} else {
			f.addFmlyMmbrHisCndtnCdCdgVrsn("NULL");
		}

		if(familymemberhistoryconditioncodecodingi == familymemberhistoryconditioncodecodinglist.size()-1) {f.addFmlyMmbrHisCndtnCdCdgVrsn("]]");}


		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_Cd ********************************************************************************/
		if(familymemberhistoryconditioncodecodingi == 0) {f.addFmlyMmbrHisCndtnCdCdgCd("[[");}
		if(familymemberhistoryconditioncodecoding.hasCode()) {

			f.addFmlyMmbrHisCndtnCdCdgCd(String.valueOf(familymemberhistoryconditioncodecoding.getCode()));
		} else {
			f.addFmlyMmbrHisCndtnCdCdgCd("NULL");
		}

		if(familymemberhistoryconditioncodecodingi == familymemberhistoryconditioncodecodinglist.size()-1) {f.addFmlyMmbrHisCndtnCdCdgCd("]]");}


		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(familymemberhistoryconditioncodecodingi == 0) {f.addFmlyMmbrHisCndtnCdCdgUsrSltd("[[");}
		if(familymemberhistoryconditioncodecoding.hasUserSelected()) {

			f.addFmlyMmbrHisCndtnCdCdgUsrSltd(String.valueOf(familymemberhistoryconditioncodecoding.getUserSelected()));
		} else {
			f.addFmlyMmbrHisCndtnCdCdgUsrSltd("NULL");
		}

		if(familymemberhistoryconditioncodecodingi == familymemberhistoryconditioncodecodinglist.size()-1) {f.addFmlyMmbrHisCndtnCdCdgUsrSltd("]]");}


		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_Sys ********************************************************************************/
		if(familymemberhistoryconditioncodecodingi == 0) {f.addFmlyMmbrHisCndtnCdCdgSys("[[");}
		if(familymemberhistoryconditioncodecoding.hasSystem()) {

			f.addFmlyMmbrHisCndtnCdCdgSys(String.valueOf(familymemberhistoryconditioncodecoding.getSystem()));
		} else {
			f.addFmlyMmbrHisCndtnCdCdgSys("NULL");
		}

		if(familymemberhistoryconditioncodecodingi == familymemberhistoryconditioncodecodinglist.size()-1) {f.addFmlyMmbrHisCndtnCdCdgSys("]]");}


		 };
		/******************** familymemberhistoryconditionnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> familymemberhistoryconditionnotelist = familymemberhistorycondition.getNote();
		for(int familymemberhistoryconditionnotei = 0; familymemberhistoryconditionnotei<familymemberhistoryconditionnotelist.size();familymemberhistoryconditionnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  familymemberhistoryconditionnote = familymemberhistoryconditionnotelist.get(familymemberhistoryconditionnotei);

		/******************** FmlyMmbrHis_Cndtn_Nt_Time ********************************************************************************/
		if(familymemberhistoryconditionnotei == 0) {f.addFmlyMmbrHisCndtnNtTime("[[");}
		if(familymemberhistoryconditionnote.hasTime()) {

			f.addFmlyMmbrHisCndtnNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(familymemberhistoryconditionnote.getTime())+"\"");
		} else {
			f.addFmlyMmbrHisCndtnNtTime("NULL");
		}

		if(familymemberhistoryconditionnotei == familymemberhistoryconditionnotelist.size()-1) {f.addFmlyMmbrHisCndtnNtTime("]]");}


		/******************** FmlyMmbrHis_Cndtn_Nt_AthrRfrnc ********************************************************************************/
		if(familymemberhistoryconditionnotei == 0) {f.addFmlyMmbrHisCndtnNtAthrRfrnc("[[");}
		if(familymemberhistoryconditionnote.hasAuthorReference()) {

			if(familymemberhistoryconditionnote.getAuthorReference().getReference() != null) {
			f.addFmlyMmbrHisCndtnNtAthrRfrnc(familymemberhistoryconditionnote.getAuthorReference().getReference());
			}
		} else {
			f.addFmlyMmbrHisCndtnNtAthrRfrnc("NULL");
		}

		if(familymemberhistoryconditionnotei == familymemberhistoryconditionnotelist.size()-1) {f.addFmlyMmbrHisCndtnNtAthrRfrnc("]]");}


		/******************** FmlyMmbrHis_Cndtn_Nt_Txt ********************************************************************************/
		if(familymemberhistoryconditionnotei == 0) {f.addFmlyMmbrHisCndtnNtTxt("[[");}
		if(familymemberhistoryconditionnote.hasText()) {

			f.addFmlyMmbrHisCndtnNtTxt(String.valueOf(familymemberhistoryconditionnote.getText()));
		} else {
			f.addFmlyMmbrHisCndtnNtTxt("NULL");
		}

		if(familymemberhistoryconditionnotei == familymemberhistoryconditionnotelist.size()-1) {f.addFmlyMmbrHisCndtnNtTxt("]]");}


		/******************** FmlyMmbrHis_Cndtn_Nt_AthrStrgTyp ********************************************************************************/
		if(familymemberhistoryconditionnotei == 0) {f.addFmlyMmbrHisCndtnNtAthrStrgTyp("[[");}
		if(familymemberhistoryconditionnote.hasAuthorStringType()) {

			f.addFmlyMmbrHisCndtnNtAthrStrgTyp("\""+familymemberhistoryconditionnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			f.addFmlyMmbrHisCndtnNtAthrStrgTyp("NULL");
		}

		if(familymemberhistoryconditionnotei == familymemberhistoryconditionnotelist.size()-1) {f.addFmlyMmbrHisCndtnNtAthrStrgTyp("]]");}


		 };
		/******************** familymemberhistoryconditionoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistoryconditionoutcome = familymemberhistorycondition.getOutcome();

		/******************** FmlyMmbrHis_Cndtn_Outcome_Txt ********************************************************************************/
		if(familymemberhistoryconditionoutcome.hasText()) {

			f.addFmlyMmbrHisCndtnOutcomeTxt(String.valueOf(familymemberhistoryconditionoutcome.getText()));
		} else {
			f.addFmlyMmbrHisCndtnOutcomeTxt("NULL");
		}


		/******************** familymemberhistoryconditionoutcomecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> familymemberhistoryconditionoutcomecodinglist = familymemberhistoryconditionoutcome.getCoding();
		for(int familymemberhistoryconditionoutcomecodingi = 0; familymemberhistoryconditionoutcomecodingi<familymemberhistoryconditionoutcomecodinglist.size();familymemberhistoryconditionoutcomecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  familymemberhistoryconditionoutcomecoding = familymemberhistoryconditionoutcomecodinglist.get(familymemberhistoryconditionoutcomecodingi);

		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_Dsply ********************************************************************************/
		if(familymemberhistoryconditionoutcomecodingi == 0) {f.addFmlyMmbrHisCndtnOutcomeCdgDsply("[[");}
		if(familymemberhistoryconditionoutcomecoding.hasDisplay()) {

			f.addFmlyMmbrHisCndtnOutcomeCdgDsply(String.valueOf(familymemberhistoryconditionoutcomecoding.getDisplay()));
		} else {
			f.addFmlyMmbrHisCndtnOutcomeCdgDsply("NULL");
		}

		if(familymemberhistoryconditionoutcomecodingi == familymemberhistoryconditionoutcomecodinglist.size()-1) {f.addFmlyMmbrHisCndtnOutcomeCdgDsply("]]");}


		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_Vrsn ********************************************************************************/
		if(familymemberhistoryconditionoutcomecodingi == 0) {f.addFmlyMmbrHisCndtnOutcomeCdgVrsn("[[");}
		if(familymemberhistoryconditionoutcomecoding.hasVersion()) {

			f.addFmlyMmbrHisCndtnOutcomeCdgVrsn(String.valueOf(familymemberhistoryconditionoutcomecoding.getVersion()));
		} else {
			f.addFmlyMmbrHisCndtnOutcomeCdgVrsn("NULL");
		}

		if(familymemberhistoryconditionoutcomecodingi == familymemberhistoryconditionoutcomecodinglist.size()-1) {f.addFmlyMmbrHisCndtnOutcomeCdgVrsn("]]");}


		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_Cd ********************************************************************************/
		if(familymemberhistoryconditionoutcomecodingi == 0) {f.addFmlyMmbrHisCndtnOutcomeCdgCd("[[");}
		if(familymemberhistoryconditionoutcomecoding.hasCode()) {

			f.addFmlyMmbrHisCndtnOutcomeCdgCd(String.valueOf(familymemberhistoryconditionoutcomecoding.getCode()));
		} else {
			f.addFmlyMmbrHisCndtnOutcomeCdgCd("NULL");
		}

		if(familymemberhistoryconditionoutcomecodingi == familymemberhistoryconditionoutcomecodinglist.size()-1) {f.addFmlyMmbrHisCndtnOutcomeCdgCd("]]");}


		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_UsrSltd ********************************************************************************/
		if(familymemberhistoryconditionoutcomecodingi == 0) {f.addFmlyMmbrHisCndtnOutcomeCdgUsrSltd("[[");}
		if(familymemberhistoryconditionoutcomecoding.hasUserSelected()) {

			f.addFmlyMmbrHisCndtnOutcomeCdgUsrSltd(String.valueOf(familymemberhistoryconditionoutcomecoding.getUserSelected()));
		} else {
			f.addFmlyMmbrHisCndtnOutcomeCdgUsrSltd("NULL");
		}

		if(familymemberhistoryconditionoutcomecodingi == familymemberhistoryconditionoutcomecodinglist.size()-1) {f.addFmlyMmbrHisCndtnOutcomeCdgUsrSltd("]]");}


		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_Sys ********************************************************************************/
		if(familymemberhistoryconditionoutcomecodingi == 0) {f.addFmlyMmbrHisCndtnOutcomeCdgSys("[[");}
		if(familymemberhistoryconditionoutcomecoding.hasSystem()) {

			f.addFmlyMmbrHisCndtnOutcomeCdgSys(String.valueOf(familymemberhistoryconditionoutcomecoding.getSystem()));
		} else {
			f.addFmlyMmbrHisCndtnOutcomeCdgSys("NULL");
		}

		if(familymemberhistoryconditionoutcomecodingi == familymemberhistoryconditionoutcomecodinglist.size()-1) {f.addFmlyMmbrHisCndtnOutcomeCdgSys("]]");}


		 };
		/******************** FmlyMmbrHis_Cndtn_OnStrgTyp ********************************************************************************/
		if(familymemberhistorycondition.hasOnsetStringType()) {

			f.addFmlyMmbrHisCndtnOnStrgTyp("\""+familymemberhistorycondition.getOnsetStringType().getValueAsString()+"\"");
		} else {
			f.addFmlyMmbrHisCndtnOnStrgTyp("NULL");
		}


		/******************** familymemberhistoryconditiononrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range familymemberhistoryconditiononrange = familymemberhistorycondition.getOnsetRange();

		/******************** familymemberhistoryconditiononrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity familymemberhistoryconditiononrangelow = familymemberhistoryconditiononrange.getLow();

		/******************** FmlyMmbrHis_Cndtn_OnRng_Lw_Vl ********************************************************************************/
		if(familymemberhistoryconditiononrangelow.hasValue()) {

			f.addFmlyMmbrHisCndtnOnRngLwVl(String.valueOf(familymemberhistoryconditiononrangelow.getValue()));
		} else {
			f.addFmlyMmbrHisCndtnOnRngLwVl("NULL");
		}


		/******************** familymemberhistoryconditiononrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator familymemberhistoryconditiononrangelowcomparator = familymemberhistoryconditiononrangelow.getComparator();
		if(familymemberhistoryconditiononrangelowcomparator!=null) {
			f.addFmlyMmbrHisCndtnOnRngLwCmprtr(familymemberhistoryconditiononrangelowcomparator.toCode());
		} else {
			f.addFmlyMmbrHisCndtnOnRngLwCmprtr("NULL");
		}

		/******************** FmlyMmbrHis_Cndtn_OnRng_Lw_Cd ********************************************************************************/
		if(familymemberhistoryconditiononrangelow.hasCode()) {

			f.addFmlyMmbrHisCndtnOnRngLwCd(String.valueOf(familymemberhistoryconditiononrangelow.getCode()));
		} else {
			f.addFmlyMmbrHisCndtnOnRngLwCd("NULL");
		}


		/******************** FmlyMmbrHis_Cndtn_OnRng_Lw_Unt ********************************************************************************/
		if(familymemberhistoryconditiononrangelow.hasUnit()) {

			f.addFmlyMmbrHisCndtnOnRngLwUnt(String.valueOf(familymemberhistoryconditiononrangelow.getUnit()));
		} else {
			f.addFmlyMmbrHisCndtnOnRngLwUnt("NULL");
		}


		/******************** FmlyMmbrHis_Cndtn_OnRng_Lw_Sys ********************************************************************************/
		if(familymemberhistoryconditiononrangelow.hasSystem()) {

			f.addFmlyMmbrHisCndtnOnRngLwSys(String.valueOf(familymemberhistoryconditiononrangelow.getSystem()));
		} else {
			f.addFmlyMmbrHisCndtnOnRngLwSys("NULL");
		}


		/******************** familymemberhistoryconditiononrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity familymemberhistoryconditiononrangehigh = familymemberhistoryconditiononrange.getHigh();

		/******************** FmlyMmbrHis_Cndtn_OnRng_Hi_Vl ********************************************************************************/
		if(familymemberhistoryconditiononrangehigh.hasValue()) {

			f.addFmlyMmbrHisCndtnOnRngHiVl(String.valueOf(familymemberhistoryconditiononrangehigh.getValue()));
		} else {
			f.addFmlyMmbrHisCndtnOnRngHiVl("NULL");
		}


		/******************** familymemberhistoryconditiononrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator familymemberhistoryconditiononrangehighcomparator = familymemberhistoryconditiononrangehigh.getComparator();
		if(familymemberhistoryconditiononrangehighcomparator!=null) {
			f.addFmlyMmbrHisCndtnOnRngHiCmprtr(familymemberhistoryconditiononrangehighcomparator.toCode());
		} else {
			f.addFmlyMmbrHisCndtnOnRngHiCmprtr("NULL");
		}

		/******************** FmlyMmbrHis_Cndtn_OnRng_Hi_Cd ********************************************************************************/
		if(familymemberhistoryconditiononrangehigh.hasCode()) {

			f.addFmlyMmbrHisCndtnOnRngHiCd(String.valueOf(familymemberhistoryconditiononrangehigh.getCode()));
		} else {
			f.addFmlyMmbrHisCndtnOnRngHiCd("NULL");
		}


		/******************** FmlyMmbrHis_Cndtn_OnRng_Hi_Unt ********************************************************************************/
		if(familymemberhistoryconditiononrangehigh.hasUnit()) {

			f.addFmlyMmbrHisCndtnOnRngHiUnt(String.valueOf(familymemberhistoryconditiononrangehigh.getUnit()));
		} else {
			f.addFmlyMmbrHisCndtnOnRngHiUnt("NULL");
		}


		/******************** FmlyMmbrHis_Cndtn_OnRng_Hi_Sys ********************************************************************************/
		if(familymemberhistoryconditiononrangehigh.hasSystem()) {

			f.addFmlyMmbrHisCndtnOnRngHiSys(String.valueOf(familymemberhistoryconditiononrangehigh.getSystem()));
		} else {
			f.addFmlyMmbrHisCndtnOnRngHiSys("NULL");
		}


		/******************** familymemberhistoryconditiononage ********************************************************************************/
		org.hl7.fhir.r4.model.Age familymemberhistoryconditiononage = familymemberhistorycondition.getOnsetAge();

		/******************** FmlyMmbrHis_Cndtn_OnAge_Vl ********************************************************************************/
		if(familymemberhistoryconditiononage.hasValue()) {

			f.addFmlyMmbrHisCndtnOnAgeVl(String.valueOf(familymemberhistoryconditiononage.getValue()));
		} else {
			f.addFmlyMmbrHisCndtnOnAgeVl("NULL");
		}


		/******************** familymemberhistoryconditiononagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator familymemberhistoryconditiononagecomparator = familymemberhistoryconditiononage.getComparator();
		if(familymemberhistoryconditiononagecomparator!=null) {
			f.addFmlyMmbrHisCndtnOnAgeCmprtr(familymemberhistoryconditiononagecomparator.toCode());
		} else {
			f.addFmlyMmbrHisCndtnOnAgeCmprtr("NULL");
		}

		/******************** FmlyMmbrHis_Cndtn_OnAge_Cd ********************************************************************************/
		if(familymemberhistoryconditiononage.hasCode()) {

			f.addFmlyMmbrHisCndtnOnAgeCd(String.valueOf(familymemberhistoryconditiononage.getCode()));
		} else {
			f.addFmlyMmbrHisCndtnOnAgeCd("NULL");
		}


		/******************** FmlyMmbrHis_Cndtn_OnAge_Unt ********************************************************************************/
		if(familymemberhistoryconditiononage.hasUnit()) {

			f.addFmlyMmbrHisCndtnOnAgeUnt(String.valueOf(familymemberhistoryconditiononage.getUnit()));
		} else {
			f.addFmlyMmbrHisCndtnOnAgeUnt("NULL");
		}


		/******************** FmlyMmbrHis_Cndtn_OnAge_Sys ********************************************************************************/
		if(familymemberhistoryconditiononage.hasSystem()) {

			f.addFmlyMmbrHisCndtnOnAgeSys(String.valueOf(familymemberhistoryconditiononage.getSystem()));
		} else {
			f.addFmlyMmbrHisCndtnOnAgeSys("NULL");
		}


		/******************** familymemberhistoryconditiononperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period familymemberhistoryconditiononperiod = familymemberhistorycondition.getOnsetPeriod();

		/******************** FmlyMmbrHis_Cndtn_OnPrd_Strt ********************************************************************************/
		if(familymemberhistoryconditiononperiod.hasStart()) {

			f.addFmlyMmbrHisCndtnOnPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(familymemberhistoryconditiononperiod.getStart())+"\"");
		} else {
			f.addFmlyMmbrHisCndtnOnPrdStrt("NULL");
		}


		/******************** FmlyMmbrHis_Cndtn_OnPrd_End ********************************************************************************/
		if(familymemberhistoryconditiononperiod.hasEnd()) {

			f.addFmlyMmbrHisCndtnOnPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(familymemberhistoryconditiononperiod.getEnd())+"\"");
		} else {
			f.addFmlyMmbrHisCndtnOnPrdEnd("NULL");
		}


		/******************** FmlyMmbrHis_Cndtn_ContributedToDeath ********************************************************************************/
		if(familymemberhistorycondition.hasContributedToDeath()) {

			f.addFmlyMmbrHisCndtnContributedToDeath(String.valueOf(familymemberhistorycondition.getContributedToDeath()));
		} else {
			f.addFmlyMmbrHisCndtnContributedToDeath("NULL");
		}


		 };
		/******************** FmlyMmbrHis_DeceasedStrgTyp ********************************************************************************/
		if(familymemberhistory.hasDeceasedStringType()) {

			f.addFmlyMmbrHisDeceasedStrgTyp("\""+familymemberhistory.getDeceasedStringType().getValueAsString()+"\"");
		} else {
			f.addFmlyMmbrHisDeceasedStrgTyp("NULL");
		}


		/******************** familymemberhistorydataabsentreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistorydataabsentreason = familymemberhistory.getDataAbsentReason();

		/******************** FmlyMmbrHis_DataAbsentRsn_Txt ********************************************************************************/
		if(familymemberhistorydataabsentreason.hasText()) {

			f.addFmlyMmbrHisDataAbsentRsnTxt(String.valueOf(familymemberhistorydataabsentreason.getText()));
		} else {
			f.addFmlyMmbrHisDataAbsentRsnTxt("NULL");
		}


		/******************** familymemberhistorydataabsentreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> familymemberhistorydataabsentreasoncodinglist = familymemberhistorydataabsentreason.getCoding();
		for(int familymemberhistorydataabsentreasoncodingi = 0; familymemberhistorydataabsentreasoncodingi<familymemberhistorydataabsentreasoncodinglist.size();familymemberhistorydataabsentreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  familymemberhistorydataabsentreasoncoding = familymemberhistorydataabsentreasoncodinglist.get(familymemberhistorydataabsentreasoncodingi);

		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_Dsply ********************************************************************************/
		if(familymemberhistorydataabsentreasoncodingi == 0) {f.addFmlyMmbrHisDataAbsentRsnCdgDsply("[");}
		if(familymemberhistorydataabsentreasoncoding.hasDisplay()) {

			f.addFmlyMmbrHisDataAbsentRsnCdgDsply(String.valueOf(familymemberhistorydataabsentreasoncoding.getDisplay()));
		} else {
			f.addFmlyMmbrHisDataAbsentRsnCdgDsply("NULL");
		}

		if(familymemberhistorydataabsentreasoncodingi == familymemberhistorydataabsentreasoncodinglist.size()-1) {f.addFmlyMmbrHisDataAbsentRsnCdgDsply("]");}


		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_Vrsn ********************************************************************************/
		if(familymemberhistorydataabsentreasoncodingi == 0) {f.addFmlyMmbrHisDataAbsentRsnCdgVrsn("[");}
		if(familymemberhistorydataabsentreasoncoding.hasVersion()) {

			f.addFmlyMmbrHisDataAbsentRsnCdgVrsn(String.valueOf(familymemberhistorydataabsentreasoncoding.getVersion()));
		} else {
			f.addFmlyMmbrHisDataAbsentRsnCdgVrsn("NULL");
		}

		if(familymemberhistorydataabsentreasoncodingi == familymemberhistorydataabsentreasoncodinglist.size()-1) {f.addFmlyMmbrHisDataAbsentRsnCdgVrsn("]");}


		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_Cd ********************************************************************************/
		if(familymemberhistorydataabsentreasoncodingi == 0) {f.addFmlyMmbrHisDataAbsentRsnCdgCd("[");}
		if(familymemberhistorydataabsentreasoncoding.hasCode()) {

			f.addFmlyMmbrHisDataAbsentRsnCdgCd(String.valueOf(familymemberhistorydataabsentreasoncoding.getCode()));
		} else {
			f.addFmlyMmbrHisDataAbsentRsnCdgCd("NULL");
		}

		if(familymemberhistorydataabsentreasoncodingi == familymemberhistorydataabsentreasoncodinglist.size()-1) {f.addFmlyMmbrHisDataAbsentRsnCdgCd("]");}


		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_UsrSltd ********************************************************************************/
		if(familymemberhistorydataabsentreasoncodingi == 0) {f.addFmlyMmbrHisDataAbsentRsnCdgUsrSltd("[");}
		if(familymemberhistorydataabsentreasoncoding.hasUserSelected()) {

			f.addFmlyMmbrHisDataAbsentRsnCdgUsrSltd(String.valueOf(familymemberhistorydataabsentreasoncoding.getUserSelected()));
		} else {
			f.addFmlyMmbrHisDataAbsentRsnCdgUsrSltd("NULL");
		}

		if(familymemberhistorydataabsentreasoncodingi == familymemberhistorydataabsentreasoncodinglist.size()-1) {f.addFmlyMmbrHisDataAbsentRsnCdgUsrSltd("]");}


		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_Sys ********************************************************************************/
		if(familymemberhistorydataabsentreasoncodingi == 0) {f.addFmlyMmbrHisDataAbsentRsnCdgSys("[");}
		if(familymemberhistorydataabsentreasoncoding.hasSystem()) {

			f.addFmlyMmbrHisDataAbsentRsnCdgSys(String.valueOf(familymemberhistorydataabsentreasoncoding.getSystem()));
		} else {
			f.addFmlyMmbrHisDataAbsentRsnCdgSys("NULL");
		}

		if(familymemberhistorydataabsentreasoncodingi == familymemberhistorydataabsentreasoncodinglist.size()-1) {f.addFmlyMmbrHisDataAbsentRsnCdgSys("]");}


		 };
		/******************** FmlyMmbrHis_DeceasedDtTyp ********************************************************************************/
		if(familymemberhistory.hasDeceasedDateType()) {

			f.addFmlyMmbrHisDeceasedDtTyp("\""+familymemberhistory.getDeceasedDateType().getValueAsString()+"\"");
		} else {
			f.addFmlyMmbrHisDeceasedDtTyp("NULL");
		}


		/******************** FmlyMmbrHis_DeceasedBooleanTyp ********************************************************************************/
		if(familymemberhistory.hasDeceasedBooleanType()) {

			f.addFmlyMmbrHisDeceasedBooleanTyp("\""+familymemberhistory.getDeceasedBooleanType().getValueAsString()+"\"");
		} else {
			f.addFmlyMmbrHisDeceasedBooleanTyp("NULL");
		}


		/******************** familymemberhistoryrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistoryrelationship = familymemberhistory.getRelationship();

		/******************** FmlyMmbrHis_Rltnship_Txt ********************************************************************************/
		if(familymemberhistoryrelationship.hasText()) {

			f.addFmlyMmbrHisRltnshipTxt(String.valueOf(familymemberhistoryrelationship.getText()));
		} else {
			f.addFmlyMmbrHisRltnshipTxt("NULL");
		}


		/******************** familymemberhistoryrelationshipcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> familymemberhistoryrelationshipcodinglist = familymemberhistoryrelationship.getCoding();
		for(int familymemberhistoryrelationshipcodingi = 0; familymemberhistoryrelationshipcodingi<familymemberhistoryrelationshipcodinglist.size();familymemberhistoryrelationshipcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  familymemberhistoryrelationshipcoding = familymemberhistoryrelationshipcodinglist.get(familymemberhistoryrelationshipcodingi);

		/******************** FmlyMmbrHis_Rltnship_Cdg_Dsply ********************************************************************************/
		if(familymemberhistoryrelationshipcodingi == 0) {f.addFmlyMmbrHisRltnshipCdgDsply("[");}
		if(familymemberhistoryrelationshipcoding.hasDisplay()) {

			f.addFmlyMmbrHisRltnshipCdgDsply(String.valueOf(familymemberhistoryrelationshipcoding.getDisplay()));
		} else {
			f.addFmlyMmbrHisRltnshipCdgDsply("NULL");
		}

		if(familymemberhistoryrelationshipcodingi == familymemberhistoryrelationshipcodinglist.size()-1) {f.addFmlyMmbrHisRltnshipCdgDsply("]");}


		/******************** FmlyMmbrHis_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(familymemberhistoryrelationshipcodingi == 0) {f.addFmlyMmbrHisRltnshipCdgVrsn("[");}
		if(familymemberhistoryrelationshipcoding.hasVersion()) {

			f.addFmlyMmbrHisRltnshipCdgVrsn(String.valueOf(familymemberhistoryrelationshipcoding.getVersion()));
		} else {
			f.addFmlyMmbrHisRltnshipCdgVrsn("NULL");
		}

		if(familymemberhistoryrelationshipcodingi == familymemberhistoryrelationshipcodinglist.size()-1) {f.addFmlyMmbrHisRltnshipCdgVrsn("]");}


		/******************** FmlyMmbrHis_Rltnship_Cdg_Cd ********************************************************************************/
		if(familymemberhistoryrelationshipcodingi == 0) {f.addFmlyMmbrHisRltnshipCdgCd("[");}
		if(familymemberhistoryrelationshipcoding.hasCode()) {

			f.addFmlyMmbrHisRltnshipCdgCd(String.valueOf(familymemberhistoryrelationshipcoding.getCode()));
		} else {
			f.addFmlyMmbrHisRltnshipCdgCd("NULL");
		}

		if(familymemberhistoryrelationshipcodingi == familymemberhistoryrelationshipcodinglist.size()-1) {f.addFmlyMmbrHisRltnshipCdgCd("]");}


		/******************** FmlyMmbrHis_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(familymemberhistoryrelationshipcodingi == 0) {f.addFmlyMmbrHisRltnshipCdgUsrSltd("[");}
		if(familymemberhistoryrelationshipcoding.hasUserSelected()) {

			f.addFmlyMmbrHisRltnshipCdgUsrSltd(String.valueOf(familymemberhistoryrelationshipcoding.getUserSelected()));
		} else {
			f.addFmlyMmbrHisRltnshipCdgUsrSltd("NULL");
		}

		if(familymemberhistoryrelationshipcodingi == familymemberhistoryrelationshipcodinglist.size()-1) {f.addFmlyMmbrHisRltnshipCdgUsrSltd("]");}


		/******************** FmlyMmbrHis_Rltnship_Cdg_Sys ********************************************************************************/
		if(familymemberhistoryrelationshipcodingi == 0) {f.addFmlyMmbrHisRltnshipCdgSys("[");}
		if(familymemberhistoryrelationshipcoding.hasSystem()) {

			f.addFmlyMmbrHisRltnshipCdgSys(String.valueOf(familymemberhistoryrelationshipcoding.getSystem()));
		} else {
			f.addFmlyMmbrHisRltnshipCdgSys("NULL");
		}

		if(familymemberhistoryrelationshipcodingi == familymemberhistoryrelationshipcodinglist.size()-1) {f.addFmlyMmbrHisRltnshipCdgSys("]");}


		 };
		/******************** FmlyMmbrHis_Pnt ********************************************************************************/
		if(familymemberhistory.hasPatient()) {

			if(familymemberhistory.getPatient().getReference() != null) {
			f.addFmlyMmbrHisPnt(familymemberhistory.getPatient().getReference());
			}
		} else {
			f.addFmlyMmbrHisPnt("NULL");
		}


		/******************** FmlyMmbrHis_InstantiatesCanonical ********************************************************************************/
		if(familymemberhistory.hasInstantiatesCanonical()) {

			String  array = "[";
			for(int incr=0; incr<familymemberhistory.getInstantiatesCanonical().size(); incr++) {
				array = array + familymemberhistory.getInstantiatesCanonical().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			f.addFmlyMmbrHisInstantiatesCanonical(array);

		} else {
			f.addFmlyMmbrHisInstantiatesCanonical("NULL");
		}


		/******************** FmlyMmbrHis_BornDtTyp ********************************************************************************/
		if(familymemberhistory.hasBornDateType()) {

			f.addFmlyMmbrHisBornDtTyp("\""+familymemberhistory.getBornDateType().getValueAsString()+"\"");
		} else {
			f.addFmlyMmbrHisBornDtTyp("NULL");
		}


		/******************** familymemberhistorybornperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period familymemberhistorybornperiod = familymemberhistory.getBornPeriod();

		/******************** FmlyMmbrHis_BornPrd_Strt ********************************************************************************/
		if(familymemberhistorybornperiod.hasStart()) {

			f.addFmlyMmbrHisBornPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(familymemberhistorybornperiod.getStart())+"\"");
		} else {
			f.addFmlyMmbrHisBornPrdStrt("NULL");
		}


		/******************** FmlyMmbrHis_BornPrd_End ********************************************************************************/
		if(familymemberhistorybornperiod.hasEnd()) {

			f.addFmlyMmbrHisBornPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(familymemberhistorybornperiod.getEnd())+"\"");
		} else {
			f.addFmlyMmbrHisBornPrdEnd("NULL");
		}


		/******************** familymemberhistorysex ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistorysex = familymemberhistory.getSex();

		/******************** FmlyMmbrHis_Sex_Txt ********************************************************************************/
		if(familymemberhistorysex.hasText()) {

			f.addFmlyMmbrHisSexTxt(String.valueOf(familymemberhistorysex.getText()));
		} else {
			f.addFmlyMmbrHisSexTxt("NULL");
		}


		/******************** familymemberhistorysexcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> familymemberhistorysexcodinglist = familymemberhistorysex.getCoding();
		for(int familymemberhistorysexcodingi = 0; familymemberhistorysexcodingi<familymemberhistorysexcodinglist.size();familymemberhistorysexcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  familymemberhistorysexcoding = familymemberhistorysexcodinglist.get(familymemberhistorysexcodingi);

		/******************** FmlyMmbrHis_Sex_Cdg_Dsply ********************************************************************************/
		if(familymemberhistorysexcodingi == 0) {f.addFmlyMmbrHisSexCdgDsply("[");}
		if(familymemberhistorysexcoding.hasDisplay()) {

			f.addFmlyMmbrHisSexCdgDsply(String.valueOf(familymemberhistorysexcoding.getDisplay()));
		} else {
			f.addFmlyMmbrHisSexCdgDsply("NULL");
		}

		if(familymemberhistorysexcodingi == familymemberhistorysexcodinglist.size()-1) {f.addFmlyMmbrHisSexCdgDsply("]");}


		/******************** FmlyMmbrHis_Sex_Cdg_Vrsn ********************************************************************************/
		if(familymemberhistorysexcodingi == 0) {f.addFmlyMmbrHisSexCdgVrsn("[");}
		if(familymemberhistorysexcoding.hasVersion()) {

			f.addFmlyMmbrHisSexCdgVrsn(String.valueOf(familymemberhistorysexcoding.getVersion()));
		} else {
			f.addFmlyMmbrHisSexCdgVrsn("NULL");
		}

		if(familymemberhistorysexcodingi == familymemberhistorysexcodinglist.size()-1) {f.addFmlyMmbrHisSexCdgVrsn("]");}


		/******************** FmlyMmbrHis_Sex_Cdg_Cd ********************************************************************************/
		if(familymemberhistorysexcodingi == 0) {f.addFmlyMmbrHisSexCdgCd("[");}
		if(familymemberhistorysexcoding.hasCode()) {

			f.addFmlyMmbrHisSexCdgCd(String.valueOf(familymemberhistorysexcoding.getCode()));
		} else {
			f.addFmlyMmbrHisSexCdgCd("NULL");
		}

		if(familymemberhistorysexcodingi == familymemberhistorysexcodinglist.size()-1) {f.addFmlyMmbrHisSexCdgCd("]");}


		/******************** FmlyMmbrHis_Sex_Cdg_UsrSltd ********************************************************************************/
		if(familymemberhistorysexcodingi == 0) {f.addFmlyMmbrHisSexCdgUsrSltd("[");}
		if(familymemberhistorysexcoding.hasUserSelected()) {

			f.addFmlyMmbrHisSexCdgUsrSltd(String.valueOf(familymemberhistorysexcoding.getUserSelected()));
		} else {
			f.addFmlyMmbrHisSexCdgUsrSltd("NULL");
		}

		if(familymemberhistorysexcodingi == familymemberhistorysexcodinglist.size()-1) {f.addFmlyMmbrHisSexCdgUsrSltd("]");}


		/******************** FmlyMmbrHis_Sex_Cdg_Sys ********************************************************************************/
		if(familymemberhistorysexcodingi == 0) {f.addFmlyMmbrHisSexCdgSys("[");}
		if(familymemberhistorysexcoding.hasSystem()) {

			f.addFmlyMmbrHisSexCdgSys(String.valueOf(familymemberhistorysexcoding.getSystem()));
		} else {
			f.addFmlyMmbrHisSexCdgSys("NULL");
		}

		if(familymemberhistorysexcodingi == familymemberhistorysexcodinglist.size()-1) {f.addFmlyMmbrHisSexCdgSys("]");}


		 };
		/******************** familymemberhistoryageage ********************************************************************************/
		org.hl7.fhir.r4.model.Age familymemberhistoryageage = familymemberhistory.getAgeAge();

		/******************** FmlyMmbrHis_AgeAge_Vl ********************************************************************************/
		if(familymemberhistoryageage.hasValue()) {

			f.addFmlyMmbrHisAgeAgeVl(String.valueOf(familymemberhistoryageage.getValue()));
		} else {
			f.addFmlyMmbrHisAgeAgeVl("NULL");
		}


		/******************** familymemberhistoryageagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator familymemberhistoryageagecomparator = familymemberhistoryageage.getComparator();
		if(familymemberhistoryageagecomparator!=null) {
			f.addFmlyMmbrHisAgeAgeCmprtr(familymemberhistoryageagecomparator.toCode());
		} else {
			f.addFmlyMmbrHisAgeAgeCmprtr("NULL");
		}

		/******************** FmlyMmbrHis_AgeAge_Cd ********************************************************************************/
		if(familymemberhistoryageage.hasCode()) {

			f.addFmlyMmbrHisAgeAgeCd(String.valueOf(familymemberhistoryageage.getCode()));
		} else {
			f.addFmlyMmbrHisAgeAgeCd("NULL");
		}


		/******************** FmlyMmbrHis_AgeAge_Unt ********************************************************************************/
		if(familymemberhistoryageage.hasUnit()) {

			f.addFmlyMmbrHisAgeAgeUnt(String.valueOf(familymemberhistoryageage.getUnit()));
		} else {
			f.addFmlyMmbrHisAgeAgeUnt("NULL");
		}


		/******************** FmlyMmbrHis_AgeAge_Sys ********************************************************************************/
		if(familymemberhistoryageage.hasSystem()) {

			f.addFmlyMmbrHisAgeAgeSys(String.valueOf(familymemberhistoryageage.getSystem()));
		} else {
			f.addFmlyMmbrHisAgeAgeSys("NULL");
		}


		/******************** FmlyMmbrHis_BornStrgTyp ********************************************************************************/
		if(familymemberhistory.hasBornStringType()) {

			f.addFmlyMmbrHisBornStrgTyp("\""+familymemberhistory.getBornStringType().getValueAsString()+"\"");
		} else {
			f.addFmlyMmbrHisBornStrgTyp("NULL");
		}


		/******************** familymemberhistorydeceasedrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range familymemberhistorydeceasedrange = familymemberhistory.getDeceasedRange();

		/******************** familymemberhistorydeceasedrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity familymemberhistorydeceasedrangelow = familymemberhistorydeceasedrange.getLow();

		/******************** FmlyMmbrHis_DeceasedRng_Lw_Vl ********************************************************************************/
		if(familymemberhistorydeceasedrangelow.hasValue()) {

			f.addFmlyMmbrHisDeceasedRngLwVl(String.valueOf(familymemberhistorydeceasedrangelow.getValue()));
		} else {
			f.addFmlyMmbrHisDeceasedRngLwVl("NULL");
		}


		/******************** familymemberhistorydeceasedrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator familymemberhistorydeceasedrangelowcomparator = familymemberhistorydeceasedrangelow.getComparator();
		if(familymemberhistorydeceasedrangelowcomparator!=null) {
			f.addFmlyMmbrHisDeceasedRngLwCmprtr(familymemberhistorydeceasedrangelowcomparator.toCode());
		} else {
			f.addFmlyMmbrHisDeceasedRngLwCmprtr("NULL");
		}

		/******************** FmlyMmbrHis_DeceasedRng_Lw_Cd ********************************************************************************/
		if(familymemberhistorydeceasedrangelow.hasCode()) {

			f.addFmlyMmbrHisDeceasedRngLwCd(String.valueOf(familymemberhistorydeceasedrangelow.getCode()));
		} else {
			f.addFmlyMmbrHisDeceasedRngLwCd("NULL");
		}


		/******************** FmlyMmbrHis_DeceasedRng_Lw_Unt ********************************************************************************/
		if(familymemberhistorydeceasedrangelow.hasUnit()) {

			f.addFmlyMmbrHisDeceasedRngLwUnt(String.valueOf(familymemberhistorydeceasedrangelow.getUnit()));
		} else {
			f.addFmlyMmbrHisDeceasedRngLwUnt("NULL");
		}


		/******************** FmlyMmbrHis_DeceasedRng_Lw_Sys ********************************************************************************/
		if(familymemberhistorydeceasedrangelow.hasSystem()) {

			f.addFmlyMmbrHisDeceasedRngLwSys(String.valueOf(familymemberhistorydeceasedrangelow.getSystem()));
		} else {
			f.addFmlyMmbrHisDeceasedRngLwSys("NULL");
		}


		/******************** familymemberhistorydeceasedrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity familymemberhistorydeceasedrangehigh = familymemberhistorydeceasedrange.getHigh();

		/******************** FmlyMmbrHis_DeceasedRng_Hi_Vl ********************************************************************************/
		if(familymemberhistorydeceasedrangehigh.hasValue()) {

			f.addFmlyMmbrHisDeceasedRngHiVl(String.valueOf(familymemberhistorydeceasedrangehigh.getValue()));
		} else {
			f.addFmlyMmbrHisDeceasedRngHiVl("NULL");
		}


		/******************** familymemberhistorydeceasedrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator familymemberhistorydeceasedrangehighcomparator = familymemberhistorydeceasedrangehigh.getComparator();
		if(familymemberhistorydeceasedrangehighcomparator!=null) {
			f.addFmlyMmbrHisDeceasedRngHiCmprtr(familymemberhistorydeceasedrangehighcomparator.toCode());
		} else {
			f.addFmlyMmbrHisDeceasedRngHiCmprtr("NULL");
		}

		/******************** FmlyMmbrHis_DeceasedRng_Hi_Cd ********************************************************************************/
		if(familymemberhistorydeceasedrangehigh.hasCode()) {

			f.addFmlyMmbrHisDeceasedRngHiCd(String.valueOf(familymemberhistorydeceasedrangehigh.getCode()));
		} else {
			f.addFmlyMmbrHisDeceasedRngHiCd("NULL");
		}


		/******************** FmlyMmbrHis_DeceasedRng_Hi_Unt ********************************************************************************/
		if(familymemberhistorydeceasedrangehigh.hasUnit()) {

			f.addFmlyMmbrHisDeceasedRngHiUnt(String.valueOf(familymemberhistorydeceasedrangehigh.getUnit()));
		} else {
			f.addFmlyMmbrHisDeceasedRngHiUnt("NULL");
		}


		/******************** FmlyMmbrHis_DeceasedRng_Hi_Sys ********************************************************************************/
		if(familymemberhistorydeceasedrangehigh.hasSystem()) {

			f.addFmlyMmbrHisDeceasedRngHiSys(String.valueOf(familymemberhistorydeceasedrangehigh.getSystem()));
		} else {
			f.addFmlyMmbrHisDeceasedRngHiSys("NULL");
		}


		/******************** familymemberhistoryagerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range familymemberhistoryagerange = familymemberhistory.getAgeRange();

		/******************** familymemberhistoryagerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity familymemberhistoryagerangelow = familymemberhistoryagerange.getLow();

		/******************** FmlyMmbrHis_AgeRng_Lw_Vl ********************************************************************************/
		if(familymemberhistoryagerangelow.hasValue()) {

			f.addFmlyMmbrHisAgeRngLwVl(String.valueOf(familymemberhistoryagerangelow.getValue()));
		} else {
			f.addFmlyMmbrHisAgeRngLwVl("NULL");
		}


		/******************** familymemberhistoryagerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator familymemberhistoryagerangelowcomparator = familymemberhistoryagerangelow.getComparator();
		if(familymemberhistoryagerangelowcomparator!=null) {
			f.addFmlyMmbrHisAgeRngLwCmprtr(familymemberhistoryagerangelowcomparator.toCode());
		} else {
			f.addFmlyMmbrHisAgeRngLwCmprtr("NULL");
		}

		/******************** FmlyMmbrHis_AgeRng_Lw_Cd ********************************************************************************/
		if(familymemberhistoryagerangelow.hasCode()) {

			f.addFmlyMmbrHisAgeRngLwCd(String.valueOf(familymemberhistoryagerangelow.getCode()));
		} else {
			f.addFmlyMmbrHisAgeRngLwCd("NULL");
		}


		/******************** FmlyMmbrHis_AgeRng_Lw_Unt ********************************************************************************/
		if(familymemberhistoryagerangelow.hasUnit()) {

			f.addFmlyMmbrHisAgeRngLwUnt(String.valueOf(familymemberhistoryagerangelow.getUnit()));
		} else {
			f.addFmlyMmbrHisAgeRngLwUnt("NULL");
		}


		/******************** FmlyMmbrHis_AgeRng_Lw_Sys ********************************************************************************/
		if(familymemberhistoryagerangelow.hasSystem()) {

			f.addFmlyMmbrHisAgeRngLwSys(String.valueOf(familymemberhistoryagerangelow.getSystem()));
		} else {
			f.addFmlyMmbrHisAgeRngLwSys("NULL");
		}


		/******************** familymemberhistoryagerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity familymemberhistoryagerangehigh = familymemberhistoryagerange.getHigh();

		/******************** FmlyMmbrHis_AgeRng_Hi_Vl ********************************************************************************/
		if(familymemberhistoryagerangehigh.hasValue()) {

			f.addFmlyMmbrHisAgeRngHiVl(String.valueOf(familymemberhistoryagerangehigh.getValue()));
		} else {
			f.addFmlyMmbrHisAgeRngHiVl("NULL");
		}


		/******************** familymemberhistoryagerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator familymemberhistoryagerangehighcomparator = familymemberhistoryagerangehigh.getComparator();
		if(familymemberhistoryagerangehighcomparator!=null) {
			f.addFmlyMmbrHisAgeRngHiCmprtr(familymemberhistoryagerangehighcomparator.toCode());
		} else {
			f.addFmlyMmbrHisAgeRngHiCmprtr("NULL");
		}

		/******************** FmlyMmbrHis_AgeRng_Hi_Cd ********************************************************************************/
		if(familymemberhistoryagerangehigh.hasCode()) {

			f.addFmlyMmbrHisAgeRngHiCd(String.valueOf(familymemberhistoryagerangehigh.getCode()));
		} else {
			f.addFmlyMmbrHisAgeRngHiCd("NULL");
		}


		/******************** FmlyMmbrHis_AgeRng_Hi_Unt ********************************************************************************/
		if(familymemberhistoryagerangehigh.hasUnit()) {

			f.addFmlyMmbrHisAgeRngHiUnt(String.valueOf(familymemberhistoryagerangehigh.getUnit()));
		} else {
			f.addFmlyMmbrHisAgeRngHiUnt("NULL");
		}


		/******************** FmlyMmbrHis_AgeRng_Hi_Sys ********************************************************************************/
		if(familymemberhistoryagerangehigh.hasSystem()) {

			f.addFmlyMmbrHisAgeRngHiSys(String.valueOf(familymemberhistoryagerangehigh.getSystem()));
		} else {
			f.addFmlyMmbrHisAgeRngHiSys("NULL");
		}


		/******************** familymemberhistorydeceasedage ********************************************************************************/
		org.hl7.fhir.r4.model.Age familymemberhistorydeceasedage = familymemberhistory.getDeceasedAge();

		/******************** FmlyMmbrHis_DeceasedAge_Vl ********************************************************************************/
		if(familymemberhistorydeceasedage.hasValue()) {

			f.addFmlyMmbrHisDeceasedAgeVl(String.valueOf(familymemberhistorydeceasedage.getValue()));
		} else {
			f.addFmlyMmbrHisDeceasedAgeVl("NULL");
		}


		/******************** familymemberhistorydeceasedagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator familymemberhistorydeceasedagecomparator = familymemberhistorydeceasedage.getComparator();
		if(familymemberhistorydeceasedagecomparator!=null) {
			f.addFmlyMmbrHisDeceasedAgeCmprtr(familymemberhistorydeceasedagecomparator.toCode());
		} else {
			f.addFmlyMmbrHisDeceasedAgeCmprtr("NULL");
		}

		/******************** FmlyMmbrHis_DeceasedAge_Cd ********************************************************************************/
		if(familymemberhistorydeceasedage.hasCode()) {

			f.addFmlyMmbrHisDeceasedAgeCd(String.valueOf(familymemberhistorydeceasedage.getCode()));
		} else {
			f.addFmlyMmbrHisDeceasedAgeCd("NULL");
		}


		/******************** FmlyMmbrHis_DeceasedAge_Unt ********************************************************************************/
		if(familymemberhistorydeceasedage.hasUnit()) {

			f.addFmlyMmbrHisDeceasedAgeUnt(String.valueOf(familymemberhistorydeceasedage.getUnit()));
		} else {
			f.addFmlyMmbrHisDeceasedAgeUnt("NULL");
		}


		/******************** FmlyMmbrHis_DeceasedAge_Sys ********************************************************************************/
		if(familymemberhistorydeceasedage.hasSystem()) {

			f.addFmlyMmbrHisDeceasedAgeSys(String.valueOf(familymemberhistorydeceasedage.getSystem()));
		} else {
			f.addFmlyMmbrHisDeceasedAgeSys("NULL");
		}


		/******************** FmlyMmbrHis_AgeStrgTyp ********************************************************************************/
		if(familymemberhistory.hasAgeStringType()) {

			f.addFmlyMmbrHisAgeStrgTyp("\""+familymemberhistory.getAgeStringType().getValueAsString()+"\"");
		} else {
			f.addFmlyMmbrHisAgeStrgTyp("NULL");
		}


		/******************** FmlyMmbrHis_EstmtdAge ********************************************************************************/
		if(familymemberhistory.hasEstimatedAge()) {

			f.addFmlyMmbrHisEstmtdAge(String.valueOf(familymemberhistory.getEstimatedAge()));
		} else {
			f.addFmlyMmbrHisEstmtdAge("NULL");
		}


		return f;
	}
}
