package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DeviceUseStatement;
public class DeviceUseStatementBidirectionalConversion 
{
	public DeviceUseStatement DeviceUseStatements(org.hl7.fhir.r4.model.DeviceUseStatement deviceusestatement) throws ParseException
	{
		 main.java.com.campfhir.model.DeviceUseStatement d = new  main.java.com.campfhir.model.DeviceUseStatement();

		/******************** id ********************************************************************************/
		d.setId(deviceusestatement.getIdElement().getIdPart());

		/******************** DvcUseStmnt_Src ********************************************************************************/
		if(deviceusestatement.hasSource()) {

			if(deviceusestatement.getSource().getReference() != null) {
			d.addDvcUseStmntSrc(deviceusestatement.getSource().getReference());
			}
		} else {
			d.addDvcUseStmntSrc("NULL");
		}


		/******************** DvcUseStmnt_Sbjct ********************************************************************************/
		if(deviceusestatement.hasSubject()) {

			if(deviceusestatement.getSubject().getReference() != null) {
			d.addDvcUseStmntSbjct(deviceusestatement.getSubject().getReference());
			}
		} else {
			d.addDvcUseStmntSbjct("NULL");
		}


		/******************** deviceusestatementstatus ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceUseStatement.DeviceUseStatementStatus deviceusestatementstatus = deviceusestatement.getStatus();
		if(deviceusestatementstatus!=null) {
			d.addDvcUseStmntSts(deviceusestatementstatus.toCode());
		} else {
			d.addDvcUseStmntSts("NULL");
		}

		/******************** DvcUseStmnt_BasedOn ********************************************************************************/
		if(deviceusestatement.hasBasedOn()) {

			String  array = "[";
			for(int incr=0; incr<deviceusestatement.getBasedOn().size(); incr++) {
				array = array + deviceusestatement.getBasedOn().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcUseStmntBasedOn(array);

		} else {
			d.addDvcUseStmntBasedOn("NULL");
		}


		/******************** deviceusestatementreasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> deviceusestatementreasoncodelist = deviceusestatement.getReasonCode();
		for(int deviceusestatementreasoncodei = 0; deviceusestatementreasoncodei<deviceusestatementreasoncodelist.size();deviceusestatementreasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  deviceusestatementreasoncode = deviceusestatementreasoncodelist.get(deviceusestatementreasoncodei);

		/******************** DvcUseStmnt_RsnCd_Txt ********************************************************************************/
		if(deviceusestatementreasoncodei == 0) {d.addDvcUseStmntRsnCdTxt("[");}
		if(deviceusestatementreasoncode.hasText()) {

			d.addDvcUseStmntRsnCdTxt(String.valueOf(deviceusestatementreasoncode.getText()));
		} else {
			d.addDvcUseStmntRsnCdTxt("NULL");
		}

		if(deviceusestatementreasoncodei == deviceusestatementreasoncodelist.size()-1) {d.addDvcUseStmntRsnCdTxt("]");}


		/******************** deviceusestatementreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> deviceusestatementreasoncodecodinglist = deviceusestatementreasoncode.getCoding();
		for(int deviceusestatementreasoncodecodingi = 0; deviceusestatementreasoncodecodingi<deviceusestatementreasoncodecodinglist.size();deviceusestatementreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  deviceusestatementreasoncodecoding = deviceusestatementreasoncodecodinglist.get(deviceusestatementreasoncodecodingi);

		/******************** DvcUseStmnt_RsnCd_Cdg_Dsply ********************************************************************************/
		if(deviceusestatementreasoncodecodingi == 0) {d.addDvcUseStmntRsnCdCdgDsply("[[");}
		if(deviceusestatementreasoncodecoding.hasDisplay()) {

			d.addDvcUseStmntRsnCdCdgDsply(String.valueOf(deviceusestatementreasoncodecoding.getDisplay()));
		} else {
			d.addDvcUseStmntRsnCdCdgDsply("NULL");
		}

		if(deviceusestatementreasoncodecodingi == deviceusestatementreasoncodecodinglist.size()-1) {d.addDvcUseStmntRsnCdCdgDsply("]]");}


		/******************** DvcUseStmnt_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(deviceusestatementreasoncodecodingi == 0) {d.addDvcUseStmntRsnCdCdgVrsn("[[");}
		if(deviceusestatementreasoncodecoding.hasVersion()) {

			d.addDvcUseStmntRsnCdCdgVrsn(String.valueOf(deviceusestatementreasoncodecoding.getVersion()));
		} else {
			d.addDvcUseStmntRsnCdCdgVrsn("NULL");
		}

		if(deviceusestatementreasoncodecodingi == deviceusestatementreasoncodecodinglist.size()-1) {d.addDvcUseStmntRsnCdCdgVrsn("]]");}


		/******************** DvcUseStmnt_RsnCd_Cdg_Cd ********************************************************************************/
		if(deviceusestatementreasoncodecodingi == 0) {d.addDvcUseStmntRsnCdCdgCd("[[");}
		if(deviceusestatementreasoncodecoding.hasCode()) {

			d.addDvcUseStmntRsnCdCdgCd(String.valueOf(deviceusestatementreasoncodecoding.getCode()));
		} else {
			d.addDvcUseStmntRsnCdCdgCd("NULL");
		}

		if(deviceusestatementreasoncodecodingi == deviceusestatementreasoncodecodinglist.size()-1) {d.addDvcUseStmntRsnCdCdgCd("]]");}


		/******************** DvcUseStmnt_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(deviceusestatementreasoncodecodingi == 0) {d.addDvcUseStmntRsnCdCdgUsrSltd("[[");}
		if(deviceusestatementreasoncodecoding.hasUserSelected()) {

			d.addDvcUseStmntRsnCdCdgUsrSltd(String.valueOf(deviceusestatementreasoncodecoding.getUserSelected()));
		} else {
			d.addDvcUseStmntRsnCdCdgUsrSltd("NULL");
		}

		if(deviceusestatementreasoncodecodingi == deviceusestatementreasoncodecodinglist.size()-1) {d.addDvcUseStmntRsnCdCdgUsrSltd("]]");}


		/******************** DvcUseStmnt_RsnCd_Cdg_Sys ********************************************************************************/
		if(deviceusestatementreasoncodecodingi == 0) {d.addDvcUseStmntRsnCdCdgSys("[[");}
		if(deviceusestatementreasoncodecoding.hasSystem()) {

			d.addDvcUseStmntRsnCdCdgSys(String.valueOf(deviceusestatementreasoncodecoding.getSystem()));
		} else {
			d.addDvcUseStmntRsnCdCdgSys("NULL");
		}

		if(deviceusestatementreasoncodecodingi == deviceusestatementreasoncodecodinglist.size()-1) {d.addDvcUseStmntRsnCdCdgSys("]]");}


		 };
		 };
		/******************** deviceusestatementnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> deviceusestatementnotelist = deviceusestatement.getNote();
		for(int deviceusestatementnotei = 0; deviceusestatementnotei<deviceusestatementnotelist.size();deviceusestatementnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  deviceusestatementnote = deviceusestatementnotelist.get(deviceusestatementnotei);

		/******************** DvcUseStmnt_Nt_Time ********************************************************************************/
		if(deviceusestatementnotei == 0) {d.addDvcUseStmntNtTime("[");}
		if(deviceusestatementnote.hasTime()) {

			d.addDvcUseStmntNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(deviceusestatementnote.getTime())+"\"");
		} else {
			d.addDvcUseStmntNtTime("NULL");
		}

		if(deviceusestatementnotei == deviceusestatementnotelist.size()-1) {d.addDvcUseStmntNtTime("]");}


		/******************** DvcUseStmnt_Nt_AthrRfrnc ********************************************************************************/
		if(deviceusestatementnotei == 0) {d.addDvcUseStmntNtAthrRfrnc("[");}
		if(deviceusestatementnote.hasAuthorReference()) {

			if(deviceusestatementnote.getAuthorReference().getReference() != null) {
			d.addDvcUseStmntNtAthrRfrnc(deviceusestatementnote.getAuthorReference().getReference());
			}
		} else {
			d.addDvcUseStmntNtAthrRfrnc("NULL");
		}

		if(deviceusestatementnotei == deviceusestatementnotelist.size()-1) {d.addDvcUseStmntNtAthrRfrnc("]");}


		/******************** DvcUseStmnt_Nt_Txt ********************************************************************************/
		if(deviceusestatementnotei == 0) {d.addDvcUseStmntNtTxt("[");}
		if(deviceusestatementnote.hasText()) {

			d.addDvcUseStmntNtTxt(String.valueOf(deviceusestatementnote.getText()));
		} else {
			d.addDvcUseStmntNtTxt("NULL");
		}

		if(deviceusestatementnotei == deviceusestatementnotelist.size()-1) {d.addDvcUseStmntNtTxt("]");}


		/******************** DvcUseStmnt_Nt_AthrStrgTyp ********************************************************************************/
		if(deviceusestatementnotei == 0) {d.addDvcUseStmntNtAthrStrgTyp("[");}
		if(deviceusestatementnote.hasAuthorStringType()) {

			d.addDvcUseStmntNtAthrStrgTyp("\""+deviceusestatementnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			d.addDvcUseStmntNtAthrStrgTyp("NULL");
		}

		if(deviceusestatementnotei == deviceusestatementnotelist.size()-1) {d.addDvcUseStmntNtAthrStrgTyp("]");}


		 };
		/******************** DvcUseStmnt_RsnRfrnc ********************************************************************************/
		if(deviceusestatement.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<deviceusestatement.getReasonReference().size(); incr++) {
				array = array + deviceusestatement.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcUseStmntRsnRfrnc(array);

		} else {
			d.addDvcUseStmntRsnRfrnc("NULL");
		}


		/******************** deviceusestatementidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> deviceusestatementidentifierlist = deviceusestatement.getIdentifier();
		for(int deviceusestatementidentifieri = 0; deviceusestatementidentifieri<deviceusestatementidentifierlist.size();deviceusestatementidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  deviceusestatementidentifier = deviceusestatementidentifierlist.get(deviceusestatementidentifieri);

		/******************** DvcUseStmnt_Id_Vl ********************************************************************************/
		if(deviceusestatementidentifieri == 0) {d.addDvcUseStmntIdVl("[");}
		if(deviceusestatementidentifier.hasValue()) {

			d.addDvcUseStmntIdVl(String.valueOf(deviceusestatementidentifier.getValue()));
		} else {
			d.addDvcUseStmntIdVl("NULL");
		}

		if(deviceusestatementidentifieri == deviceusestatementidentifierlist.size()-1) {d.addDvcUseStmntIdVl("]");}


		/******************** deviceusestatementidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceusestatementidentifiertype = deviceusestatementidentifier.getType();

		/******************** DvcUseStmnt_Id_Typ_Txt ********************************************************************************/
		if(deviceusestatementidentifieri == 0) {d.addDvcUseStmntIdTypTxt("[");}
		if(deviceusestatementidentifiertype.hasText()) {

			d.addDvcUseStmntIdTypTxt(String.valueOf(deviceusestatementidentifiertype.getText()));
		} else {
			d.addDvcUseStmntIdTypTxt("NULL");
		}

		if(deviceusestatementidentifieri == deviceusestatementidentifierlist.size()-1) {d.addDvcUseStmntIdTypTxt("]");}


		/******************** deviceusestatementidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> deviceusestatementidentifiertypecodinglist = deviceusestatementidentifiertype.getCoding();
		for(int deviceusestatementidentifiertypecodingi = 0; deviceusestatementidentifiertypecodingi<deviceusestatementidentifiertypecodinglist.size();deviceusestatementidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  deviceusestatementidentifiertypecoding = deviceusestatementidentifiertypecodinglist.get(deviceusestatementidentifiertypecodingi);

		/******************** DvcUseStmnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(deviceusestatementidentifiertypecodingi == 0) {d.addDvcUseStmntIdTypCdgDsply("[[");}
		if(deviceusestatementidentifiertypecoding.hasDisplay()) {

			d.addDvcUseStmntIdTypCdgDsply(String.valueOf(deviceusestatementidentifiertypecoding.getDisplay()));
		} else {
			d.addDvcUseStmntIdTypCdgDsply("NULL");
		}

		if(deviceusestatementidentifiertypecodingi == deviceusestatementidentifiertypecodinglist.size()-1) {d.addDvcUseStmntIdTypCdgDsply("]]");}


		/******************** DvcUseStmnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(deviceusestatementidentifiertypecodingi == 0) {d.addDvcUseStmntIdTypCdgVrsn("[[");}
		if(deviceusestatementidentifiertypecoding.hasVersion()) {

			d.addDvcUseStmntIdTypCdgVrsn(String.valueOf(deviceusestatementidentifiertypecoding.getVersion()));
		} else {
			d.addDvcUseStmntIdTypCdgVrsn("NULL");
		}

		if(deviceusestatementidentifiertypecodingi == deviceusestatementidentifiertypecodinglist.size()-1) {d.addDvcUseStmntIdTypCdgVrsn("]]");}


		/******************** DvcUseStmnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(deviceusestatementidentifiertypecodingi == 0) {d.addDvcUseStmntIdTypCdgCd("[[");}
		if(deviceusestatementidentifiertypecoding.hasCode()) {

			d.addDvcUseStmntIdTypCdgCd(String.valueOf(deviceusestatementidentifiertypecoding.getCode()));
		} else {
			d.addDvcUseStmntIdTypCdgCd("NULL");
		}

		if(deviceusestatementidentifiertypecodingi == deviceusestatementidentifiertypecodinglist.size()-1) {d.addDvcUseStmntIdTypCdgCd("]]");}


		/******************** DvcUseStmnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(deviceusestatementidentifiertypecodingi == 0) {d.addDvcUseStmntIdTypCdgUsrSltd("[[");}
		if(deviceusestatementidentifiertypecoding.hasUserSelected()) {

			d.addDvcUseStmntIdTypCdgUsrSltd(String.valueOf(deviceusestatementidentifiertypecoding.getUserSelected()));
		} else {
			d.addDvcUseStmntIdTypCdgUsrSltd("NULL");
		}

		if(deviceusestatementidentifiertypecodingi == deviceusestatementidentifiertypecodinglist.size()-1) {d.addDvcUseStmntIdTypCdgUsrSltd("]]");}


		/******************** DvcUseStmnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(deviceusestatementidentifiertypecodingi == 0) {d.addDvcUseStmntIdTypCdgSys("[[");}
		if(deviceusestatementidentifiertypecoding.hasSystem()) {

			d.addDvcUseStmntIdTypCdgSys(String.valueOf(deviceusestatementidentifiertypecoding.getSystem()));
		} else {
			d.addDvcUseStmntIdTypCdgSys("NULL");
		}

		if(deviceusestatementidentifiertypecodingi == deviceusestatementidentifiertypecodinglist.size()-1) {d.addDvcUseStmntIdTypCdgSys("]]");}


		 };
		/******************** deviceusestatementidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period deviceusestatementidentifierperiod = deviceusestatementidentifier.getPeriod();

		/******************** DvcUseStmnt_Id_Prd_Strt ********************************************************************************/
		if(deviceusestatementidentifieri == 0) {d.addDvcUseStmntIdPrdStrt("[");}
		if(deviceusestatementidentifierperiod.hasStart()) {

			d.addDvcUseStmntIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(deviceusestatementidentifierperiod.getStart())+"\"");
		} else {
			d.addDvcUseStmntIdPrdStrt("NULL");
		}

		if(deviceusestatementidentifieri == deviceusestatementidentifierlist.size()-1) {d.addDvcUseStmntIdPrdStrt("]");}


		/******************** DvcUseStmnt_Id_Prd_End ********************************************************************************/
		if(deviceusestatementidentifieri == 0) {d.addDvcUseStmntIdPrdEnd("[");}
		if(deviceusestatementidentifierperiod.hasEnd()) {

			d.addDvcUseStmntIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(deviceusestatementidentifierperiod.getEnd())+"\"");
		} else {
			d.addDvcUseStmntIdPrdEnd("NULL");
		}

		if(deviceusestatementidentifieri == deviceusestatementidentifierlist.size()-1) {d.addDvcUseStmntIdPrdEnd("]");}


		/******************** deviceusestatementidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse deviceusestatementidentifieruse = deviceusestatementidentifier.getUse();
		if(deviceusestatementidentifieruse!=null) {
		if(deviceusestatementidentifieri == 0) {

		d.addDvcUseStmntIdUse("[");		}
			d.addDvcUseStmntIdUse(deviceusestatementidentifieruse.toCode());
		if(deviceusestatementidentifieri == deviceusestatementidentifierlist.size()-1) {

		d.addDvcUseStmntIdUse("]");		}

		} else {
			d.addDvcUseStmntIdUse("NULL");
		}

		/******************** DvcUseStmnt_Id_Assigner ********************************************************************************/
		if(deviceusestatementidentifieri == 0) {d.addDvcUseStmntIdAssigner("[");}
		if(deviceusestatementidentifier.hasAssigner()) {

			if(deviceusestatementidentifier.getAssigner().getReference() != null) {
			d.addDvcUseStmntIdAssigner(deviceusestatementidentifier.getAssigner().getReference());
			}
		} else {
			d.addDvcUseStmntIdAssigner("NULL");
		}

		if(deviceusestatementidentifieri == deviceusestatementidentifierlist.size()-1) {d.addDvcUseStmntIdAssigner("]");}


		/******************** DvcUseStmnt_Id_Sys ********************************************************************************/
		if(deviceusestatementidentifieri == 0) {d.addDvcUseStmntIdSys("[");}
		if(deviceusestatementidentifier.hasSystem()) {

			d.addDvcUseStmntIdSys(String.valueOf(deviceusestatementidentifier.getSystem()));
		} else {
			d.addDvcUseStmntIdSys("NULL");
		}

		if(deviceusestatementidentifieri == deviceusestatementidentifierlist.size()-1) {d.addDvcUseStmntIdSys("]");}


		 };
		/******************** deviceusestatementbodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceusestatementbodysite = deviceusestatement.getBodySite();

		/******************** DvcUseStmnt_BodySite_Txt ********************************************************************************/
		if(deviceusestatementbodysite.hasText()) {

			d.addDvcUseStmntBodySiteTxt(String.valueOf(deviceusestatementbodysite.getText()));
		} else {
			d.addDvcUseStmntBodySiteTxt("NULL");
		}


		/******************** deviceusestatementbodysitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> deviceusestatementbodysitecodinglist = deviceusestatementbodysite.getCoding();
		for(int deviceusestatementbodysitecodingi = 0; deviceusestatementbodysitecodingi<deviceusestatementbodysitecodinglist.size();deviceusestatementbodysitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  deviceusestatementbodysitecoding = deviceusestatementbodysitecodinglist.get(deviceusestatementbodysitecodingi);

		/******************** DvcUseStmnt_BodySite_Cdg_Dsply ********************************************************************************/
		if(deviceusestatementbodysitecodingi == 0) {d.addDvcUseStmntBodySiteCdgDsply("[");}
		if(deviceusestatementbodysitecoding.hasDisplay()) {

			d.addDvcUseStmntBodySiteCdgDsply(String.valueOf(deviceusestatementbodysitecoding.getDisplay()));
		} else {
			d.addDvcUseStmntBodySiteCdgDsply("NULL");
		}

		if(deviceusestatementbodysitecodingi == deviceusestatementbodysitecodinglist.size()-1) {d.addDvcUseStmntBodySiteCdgDsply("]");}


		/******************** DvcUseStmnt_BodySite_Cdg_Vrsn ********************************************************************************/
		if(deviceusestatementbodysitecodingi == 0) {d.addDvcUseStmntBodySiteCdgVrsn("[");}
		if(deviceusestatementbodysitecoding.hasVersion()) {

			d.addDvcUseStmntBodySiteCdgVrsn(String.valueOf(deviceusestatementbodysitecoding.getVersion()));
		} else {
			d.addDvcUseStmntBodySiteCdgVrsn("NULL");
		}

		if(deviceusestatementbodysitecodingi == deviceusestatementbodysitecodinglist.size()-1) {d.addDvcUseStmntBodySiteCdgVrsn("]");}


		/******************** DvcUseStmnt_BodySite_Cdg_Cd ********************************************************************************/
		if(deviceusestatementbodysitecodingi == 0) {d.addDvcUseStmntBodySiteCdgCd("[");}
		if(deviceusestatementbodysitecoding.hasCode()) {

			d.addDvcUseStmntBodySiteCdgCd(String.valueOf(deviceusestatementbodysitecoding.getCode()));
		} else {
			d.addDvcUseStmntBodySiteCdgCd("NULL");
		}

		if(deviceusestatementbodysitecodingi == deviceusestatementbodysitecodinglist.size()-1) {d.addDvcUseStmntBodySiteCdgCd("]");}


		/******************** DvcUseStmnt_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(deviceusestatementbodysitecodingi == 0) {d.addDvcUseStmntBodySiteCdgUsrSltd("[");}
		if(deviceusestatementbodysitecoding.hasUserSelected()) {

			d.addDvcUseStmntBodySiteCdgUsrSltd(String.valueOf(deviceusestatementbodysitecoding.getUserSelected()));
		} else {
			d.addDvcUseStmntBodySiteCdgUsrSltd("NULL");
		}

		if(deviceusestatementbodysitecodingi == deviceusestatementbodysitecodinglist.size()-1) {d.addDvcUseStmntBodySiteCdgUsrSltd("]");}


		/******************** DvcUseStmnt_BodySite_Cdg_Sys ********************************************************************************/
		if(deviceusestatementbodysitecodingi == 0) {d.addDvcUseStmntBodySiteCdgSys("[");}
		if(deviceusestatementbodysitecoding.hasSystem()) {

			d.addDvcUseStmntBodySiteCdgSys(String.valueOf(deviceusestatementbodysitecoding.getSystem()));
		} else {
			d.addDvcUseStmntBodySiteCdgSys("NULL");
		}

		if(deviceusestatementbodysitecodingi == deviceusestatementbodysitecodinglist.size()-1) {d.addDvcUseStmntBodySiteCdgSys("]");}


		 };
		/******************** DvcUseStmnt_TmgDtTimeTyp ********************************************************************************/
		if(deviceusestatement.hasTimingDateTimeType()) {

			d.addDvcUseStmntTmgDtTimeTyp("\""+deviceusestatement.getTimingDateTimeType().getValueAsString()+"\"");
		} else {
			d.addDvcUseStmntTmgDtTimeTyp("NULL");
		}


		/******************** DvcUseStmnt_DerivedFrom ********************************************************************************/
		if(deviceusestatement.hasDerivedFrom()) {

			String  array = "[";
			for(int incr=0; incr<deviceusestatement.getDerivedFrom().size(); incr++) {
				array = array + deviceusestatement.getDerivedFrom().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcUseStmntDerivedFrom(array);

		} else {
			d.addDvcUseStmntDerivedFrom("NULL");
		}


		/******************** DvcUseStmnt_RecordedOn ********************************************************************************/
		if(deviceusestatement.hasRecordedOn()) {

			d.addDvcUseStmntRecordedOn("\""+ca.uhn.fhir.util.DateUtils.formatDate(deviceusestatement.getRecordedOn())+"\"");
		} else {
			d.addDvcUseStmntRecordedOn("NULL");
		}


		/******************** DvcUseStmnt_Dvc ********************************************************************************/
		if(deviceusestatement.hasDevice()) {

			if(deviceusestatement.getDevice().getReference() != null) {
			d.addDvcUseStmntDvc(deviceusestatement.getDevice().getReference());
			}
		} else {
			d.addDvcUseStmntDvc("NULL");
		}


		/******************** deviceusestatementtimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing deviceusestatementtimingtiming = deviceusestatement.getTimingTiming();

		/******************** deviceusestatementtimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceusestatementtimingtimingcode = deviceusestatementtimingtiming.getCode();

		/******************** DvcUseStmnt_TmgTmg_Cd_Txt ********************************************************************************/
		if(deviceusestatementtimingtimingcode.hasText()) {

			d.addDvcUseStmntTmgTmgCdTxt(String.valueOf(deviceusestatementtimingtimingcode.getText()));
		} else {
			d.addDvcUseStmntTmgTmgCdTxt("NULL");
		}


		/******************** deviceusestatementtimingtimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> deviceusestatementtimingtimingcodecodinglist = deviceusestatementtimingtimingcode.getCoding();
		for(int deviceusestatementtimingtimingcodecodingi = 0; deviceusestatementtimingtimingcodecodingi<deviceusestatementtimingtimingcodecodinglist.size();deviceusestatementtimingtimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  deviceusestatementtimingtimingcodecoding = deviceusestatementtimingtimingcodecodinglist.get(deviceusestatementtimingtimingcodecodingi);

		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(deviceusestatementtimingtimingcodecodingi == 0) {d.addDvcUseStmntTmgTmgCdCdgDsply("[");}
		if(deviceusestatementtimingtimingcodecoding.hasDisplay()) {

			d.addDvcUseStmntTmgTmgCdCdgDsply(String.valueOf(deviceusestatementtimingtimingcodecoding.getDisplay()));
		} else {
			d.addDvcUseStmntTmgTmgCdCdgDsply("NULL");
		}

		if(deviceusestatementtimingtimingcodecodingi == deviceusestatementtimingtimingcodecodinglist.size()-1) {d.addDvcUseStmntTmgTmgCdCdgDsply("]");}


		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(deviceusestatementtimingtimingcodecodingi == 0) {d.addDvcUseStmntTmgTmgCdCdgVrsn("[");}
		if(deviceusestatementtimingtimingcodecoding.hasVersion()) {

			d.addDvcUseStmntTmgTmgCdCdgVrsn(String.valueOf(deviceusestatementtimingtimingcodecoding.getVersion()));
		} else {
			d.addDvcUseStmntTmgTmgCdCdgVrsn("NULL");
		}

		if(deviceusestatementtimingtimingcodecodingi == deviceusestatementtimingtimingcodecodinglist.size()-1) {d.addDvcUseStmntTmgTmgCdCdgVrsn("]");}


		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(deviceusestatementtimingtimingcodecodingi == 0) {d.addDvcUseStmntTmgTmgCdCdgCd("[");}
		if(deviceusestatementtimingtimingcodecoding.hasCode()) {

			d.addDvcUseStmntTmgTmgCdCdgCd(String.valueOf(deviceusestatementtimingtimingcodecoding.getCode()));
		} else {
			d.addDvcUseStmntTmgTmgCdCdgCd("NULL");
		}

		if(deviceusestatementtimingtimingcodecodingi == deviceusestatementtimingtimingcodecodinglist.size()-1) {d.addDvcUseStmntTmgTmgCdCdgCd("]");}


		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(deviceusestatementtimingtimingcodecodingi == 0) {d.addDvcUseStmntTmgTmgCdCdgUsrSltd("[");}
		if(deviceusestatementtimingtimingcodecoding.hasUserSelected()) {

			d.addDvcUseStmntTmgTmgCdCdgUsrSltd(String.valueOf(deviceusestatementtimingtimingcodecoding.getUserSelected()));
		} else {
			d.addDvcUseStmntTmgTmgCdCdgUsrSltd("NULL");
		}

		if(deviceusestatementtimingtimingcodecodingi == deviceusestatementtimingtimingcodecodinglist.size()-1) {d.addDvcUseStmntTmgTmgCdCdgUsrSltd("]");}


		/******************** DvcUseStmnt_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(deviceusestatementtimingtimingcodecodingi == 0) {d.addDvcUseStmntTmgTmgCdCdgSys("[");}
		if(deviceusestatementtimingtimingcodecoding.hasSystem()) {

			d.addDvcUseStmntTmgTmgCdCdgSys(String.valueOf(deviceusestatementtimingtimingcodecoding.getSystem()));
		} else {
			d.addDvcUseStmntTmgTmgCdCdgSys("NULL");
		}

		if(deviceusestatementtimingtimingcodecodingi == deviceusestatementtimingtimingcodecodinglist.size()-1) {d.addDvcUseStmntTmgTmgCdCdgSys("]");}


		 };
		/******************** DvcUseStmnt_TmgTmg_Evnt ********************************************************************************/
		if(deviceusestatementtimingtiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<deviceusestatementtimingtiming.getEvent().size(); incr++) {
				array = array + deviceusestatementtimingtiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcUseStmntTmgTmgEvnt(array);

		} else {
			d.addDvcUseStmntTmgTmgEvnt("NULL");
		}


		/******************** deviceusestatementtimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent deviceusestatementtimingtimingrepeat = deviceusestatementtimingtiming.getRepeat();

		/******************** DvcUseStmnt_TmgTmg_Rpt_Off ********************************************************************************/
		if(deviceusestatementtimingtimingrepeat.hasOffset()) {

			d.addDvcUseStmntTmgTmgRptOff(String.valueOf(deviceusestatementtimingtimingrepeat.getOffset()));
		} else {
			d.addDvcUseStmntTmgTmgRptOff("NULL");
		}


		/******************** DvcUseStmnt_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(deviceusestatementtimingtimingrepeat.hasCount()) {

			d.addDvcUseStmntTmgTmgRptCnt(String.valueOf(deviceusestatementtimingtimingrepeat.getCount()));
		} else {
			d.addDvcUseStmntTmgTmgRptCnt("NULL");
		}


		/******************** DvcUseStmnt_TmgTmg_Rpt_Prd ********************************************************************************/
		if(deviceusestatementtimingtimingrepeat.hasPeriod()) {

			d.addDvcUseStmntTmgTmgRptPrd(String.valueOf(deviceusestatementtimingtimingrepeat.getPeriod()));
		} else {
			d.addDvcUseStmntTmgTmgRptPrd("NULL");
		}


		/******************** DvcUseStmnt_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(deviceusestatementtimingtimingrepeat.hasCountMax()) {

			d.addDvcUseStmntTmgTmgRptCntMx(String.valueOf(deviceusestatementtimingtimingrepeat.getCountMax()));
		} else {
			d.addDvcUseStmntTmgTmgRptCntMx("NULL");
		}


		/******************** DvcUseStmnt_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(deviceusestatementtimingtimingrepeat.hasDurationMax()) {

			d.addDvcUseStmntTmgTmgRptDurationMx(String.valueOf(deviceusestatementtimingtimingrepeat.getDurationMax()));
		} else {
			d.addDvcUseStmntTmgTmgRptDurationMx("NULL");
		}


		/******************** deviceusestatementtimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period deviceusestatementtimingtimingrepeatboundsperiod = deviceusestatementtimingtimingrepeat.getBoundsPeriod();

		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsperiod.hasStart()) {

			d.addDvcUseStmntTmgTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(deviceusestatementtimingtimingrepeatboundsperiod.getStart())+"\"");
		} else {
			d.addDvcUseStmntTmgTmgRptBndsPrdStrt("NULL");
		}


		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsperiod.hasEnd()) {

			d.addDvcUseStmntTmgTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(deviceusestatementtimingtimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			d.addDvcUseStmntTmgTmgRptBndsPrdEnd("NULL");
		}


		/******************** deviceusestatementtimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime deviceusestatementtimingtimingrepeatdurationunit = deviceusestatementtimingtimingrepeat.getDurationUnit();
		if(deviceusestatementtimingtimingrepeatdurationunit!=null) {
			d.addDvcUseStmntTmgTmgRptDurationUnt(deviceusestatementtimingtimingrepeatdurationunit.toCode());
		} else {
			d.addDvcUseStmntTmgTmgRptDurationUnt("NULL");
		}

		/******************** deviceusestatementtimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration deviceusestatementtimingtimingrepeatboundsduration = deviceusestatementtimingtimingrepeat.getBoundsDuration();

		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsduration.hasValue()) {

			d.addDvcUseStmntTmgTmgRptBndsDurationVl(String.valueOf(deviceusestatementtimingtimingrepeatboundsduration.getValue()));
		} else {
			d.addDvcUseStmntTmgTmgRptBndsDurationVl("NULL");
		}


		/******************** deviceusestatementtimingtimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator deviceusestatementtimingtimingrepeatboundsdurationcomparator = deviceusestatementtimingtimingrepeatboundsduration.getComparator();
		if(deviceusestatementtimingtimingrepeatboundsdurationcomparator!=null) {
			d.addDvcUseStmntTmgTmgRptBndsDurationCmprtr(deviceusestatementtimingtimingrepeatboundsdurationcomparator.toCode());
		} else {
			d.addDvcUseStmntTmgTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsduration.hasCode()) {

			d.addDvcUseStmntTmgTmgRptBndsDurationCd(String.valueOf(deviceusestatementtimingtimingrepeatboundsduration.getCode()));
		} else {
			d.addDvcUseStmntTmgTmgRptBndsDurationCd("NULL");
		}


		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsduration.hasUnit()) {

			d.addDvcUseStmntTmgTmgRptBndsDurationUnt(String.valueOf(deviceusestatementtimingtimingrepeatboundsduration.getUnit()));
		} else {
			d.addDvcUseStmntTmgTmgRptBndsDurationUnt("NULL");
		}


		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsduration.hasSystem()) {

			d.addDvcUseStmntTmgTmgRptBndsDurationSys(String.valueOf(deviceusestatementtimingtimingrepeatboundsduration.getSystem()));
		} else {
			d.addDvcUseStmntTmgTmgRptBndsDurationSys("NULL");
		}


		/******************** deviceusestatementtimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range deviceusestatementtimingtimingrepeatboundsrange = deviceusestatementtimingtimingrepeat.getBoundsRange();

		/******************** deviceusestatementtimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity deviceusestatementtimingtimingrepeatboundsrangelow = deviceusestatementtimingtimingrepeatboundsrange.getLow();

		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsrangelow.hasValue()) {

			d.addDvcUseStmntTmgTmgRptBndsRngLwVl(String.valueOf(deviceusestatementtimingtimingrepeatboundsrangelow.getValue()));
		} else {
			d.addDvcUseStmntTmgTmgRptBndsRngLwVl("NULL");
		}


		/******************** deviceusestatementtimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator deviceusestatementtimingtimingrepeatboundsrangelowcomparator = deviceusestatementtimingtimingrepeatboundsrangelow.getComparator();
		if(deviceusestatementtimingtimingrepeatboundsrangelowcomparator!=null) {
			d.addDvcUseStmntTmgTmgRptBndsRngLwCmprtr(deviceusestatementtimingtimingrepeatboundsrangelowcomparator.toCode());
		} else {
			d.addDvcUseStmntTmgTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsrangelow.hasCode()) {

			d.addDvcUseStmntTmgTmgRptBndsRngLwCd(String.valueOf(deviceusestatementtimingtimingrepeatboundsrangelow.getCode()));
		} else {
			d.addDvcUseStmntTmgTmgRptBndsRngLwCd("NULL");
		}


		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsrangelow.hasUnit()) {

			d.addDvcUseStmntTmgTmgRptBndsRngLwUnt(String.valueOf(deviceusestatementtimingtimingrepeatboundsrangelow.getUnit()));
		} else {
			d.addDvcUseStmntTmgTmgRptBndsRngLwUnt("NULL");
		}


		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsrangelow.hasSystem()) {

			d.addDvcUseStmntTmgTmgRptBndsRngLwSys(String.valueOf(deviceusestatementtimingtimingrepeatboundsrangelow.getSystem()));
		} else {
			d.addDvcUseStmntTmgTmgRptBndsRngLwSys("NULL");
		}


		/******************** deviceusestatementtimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity deviceusestatementtimingtimingrepeatboundsrangehigh = deviceusestatementtimingtimingrepeatboundsrange.getHigh();

		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsrangehigh.hasValue()) {

			d.addDvcUseStmntTmgTmgRptBndsRngHiVl(String.valueOf(deviceusestatementtimingtimingrepeatboundsrangehigh.getValue()));
		} else {
			d.addDvcUseStmntTmgTmgRptBndsRngHiVl("NULL");
		}


		/******************** deviceusestatementtimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator deviceusestatementtimingtimingrepeatboundsrangehighcomparator = deviceusestatementtimingtimingrepeatboundsrangehigh.getComparator();
		if(deviceusestatementtimingtimingrepeatboundsrangehighcomparator!=null) {
			d.addDvcUseStmntTmgTmgRptBndsRngHiCmprtr(deviceusestatementtimingtimingrepeatboundsrangehighcomparator.toCode());
		} else {
			d.addDvcUseStmntTmgTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsrangehigh.hasCode()) {

			d.addDvcUseStmntTmgTmgRptBndsRngHiCd(String.valueOf(deviceusestatementtimingtimingrepeatboundsrangehigh.getCode()));
		} else {
			d.addDvcUseStmntTmgTmgRptBndsRngHiCd("NULL");
		}


		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsrangehigh.hasUnit()) {

			d.addDvcUseStmntTmgTmgRptBndsRngHiUnt(String.valueOf(deviceusestatementtimingtimingrepeatboundsrangehigh.getUnit()));
		} else {
			d.addDvcUseStmntTmgTmgRptBndsRngHiUnt("NULL");
		}


		/******************** DvcUseStmnt_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(deviceusestatementtimingtimingrepeatboundsrangehigh.hasSystem()) {

			d.addDvcUseStmntTmgTmgRptBndsRngHiSys(String.valueOf(deviceusestatementtimingtimingrepeatboundsrangehigh.getSystem()));
		} else {
			d.addDvcUseStmntTmgTmgRptBndsRngHiSys("NULL");
		}


		/******************** DvcUseStmnt_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(deviceusestatementtimingtimingrepeat.hasFrequencyMax()) {

			d.addDvcUseStmntTmgTmgRptFrqncyMx(String.valueOf(deviceusestatementtimingtimingrepeat.getFrequencyMax()));
		} else {
			d.addDvcUseStmntTmgTmgRptFrqncyMx("NULL");
		}


		/******************** deviceusestatementtimingtimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> deviceusestatementtimingtimingrepeatwhenlist = deviceusestatementtimingtimingrepeat.getWhen();
		for(int deviceusestatementtimingtimingrepeatwheni = 0; deviceusestatementtimingtimingrepeatwheni<deviceusestatementtimingtimingrepeatwhenlist.size();deviceusestatementtimingtimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  deviceusestatementtimingtimingrepeatwhen = deviceusestatementtimingtimingrepeatwhenlist.get(deviceusestatementtimingtimingrepeatwheni);
		if(deviceusestatementtimingtimingrepeatwhen!=null) {
			d.addDvcUseStmntTmgTmgRptWhen(deviceusestatementtimingtimingrepeatwhen.getCode());
		} else {
			d.addDvcUseStmntTmgTmgRptWhen("NULL");
		}
		 };

		/******************** deviceusestatementtimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime deviceusestatementtimingtimingrepeatperiodunit = deviceusestatementtimingtimingrepeat.getPeriodUnit();
		if(deviceusestatementtimingtimingrepeatperiodunit!=null) {
			d.addDvcUseStmntTmgTmgRptPrdUnt(deviceusestatementtimingtimingrepeatperiodunit.toCode());
		} else {
			d.addDvcUseStmntTmgTmgRptPrdUnt("NULL");
		}

		/******************** DvcUseStmnt_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(deviceusestatementtimingtimingrepeat.hasPeriodMax()) {

			d.addDvcUseStmntTmgTmgRptPrdMx(String.valueOf(deviceusestatementtimingtimingrepeat.getPeriodMax()));
		} else {
			d.addDvcUseStmntTmgTmgRptPrdMx("NULL");
		}


		/******************** deviceusestatementtimingtimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> deviceusestatementtimingtimingrepeatdayofweeklist = deviceusestatementtimingtimingrepeat.getDayOfWeek();
		for(int deviceusestatementtimingtimingrepeatdayofweeki = 0; deviceusestatementtimingtimingrepeatdayofweeki<deviceusestatementtimingtimingrepeatdayofweeklist.size();deviceusestatementtimingtimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  deviceusestatementtimingtimingrepeatdayofweek = deviceusestatementtimingtimingrepeatdayofweeklist.get(deviceusestatementtimingtimingrepeatdayofweeki);
		if(deviceusestatementtimingtimingrepeatdayofweek!=null) {
			d.addDvcUseStmntTmgTmgRptDayOfWeek(deviceusestatementtimingtimingrepeatdayofweek.getCode());
		} else {
			d.addDvcUseStmntTmgTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** DvcUseStmnt_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(deviceusestatementtimingtimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<deviceusestatementtimingtimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + deviceusestatementtimingtimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcUseStmntTmgTmgRptTimeOfDay(array);

		} else {
			d.addDvcUseStmntTmgTmgRptTimeOfDay("NULL");
		}


		/******************** DvcUseStmnt_TmgTmg_Rpt_Duration ********************************************************************************/
		if(deviceusestatementtimingtimingrepeat.hasDuration()) {

			d.addDvcUseStmntTmgTmgRptDuration(String.valueOf(deviceusestatementtimingtimingrepeat.getDuration()));
		} else {
			d.addDvcUseStmntTmgTmgRptDuration("NULL");
		}


		/******************** DvcUseStmnt_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(deviceusestatementtimingtimingrepeat.hasFrequency()) {

			d.addDvcUseStmntTmgTmgRptFrqncy(String.valueOf(deviceusestatementtimingtimingrepeat.getFrequency()));
		} else {
			d.addDvcUseStmntTmgTmgRptFrqncy("NULL");
		}


		/******************** deviceusestatementtimingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period deviceusestatementtimingperiod = deviceusestatement.getTimingPeriod();

		/******************** DvcUseStmnt_TmgPrd_Strt ********************************************************************************/
		if(deviceusestatementtimingperiod.hasStart()) {

			d.addDvcUseStmntTmgPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(deviceusestatementtimingperiod.getStart())+"\"");
		} else {
			d.addDvcUseStmntTmgPrdStrt("NULL");
		}


		/******************** DvcUseStmnt_TmgPrd_End ********************************************************************************/
		if(deviceusestatementtimingperiod.hasEnd()) {

			d.addDvcUseStmntTmgPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(deviceusestatementtimingperiod.getEnd())+"\"");
		} else {
			d.addDvcUseStmntTmgPrdEnd("NULL");
		}


		return d;
	}
}
