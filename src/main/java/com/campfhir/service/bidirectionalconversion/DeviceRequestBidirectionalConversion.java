package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DeviceRequest;
public class DeviceRequestBidirectionalConversion 
{
	public DeviceRequest DeviceRequests(org.hl7.fhir.r4.model.DeviceRequest devicerequest) throws ParseException
	{
		 main.java.com.campfhir.model.DeviceRequest d = new  main.java.com.campfhir.model.DeviceRequest();

		/******************** id ********************************************************************************/
		d.setId(devicerequest.getIdElement().getIdPart());

		/******************** devicerequestpriority ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceRequest.RequestPriority devicerequestpriority = devicerequest.getPriority();
		if(devicerequestpriority!=null) {
			d.addDvcRqstPriority(devicerequestpriority.toCode());
		} else {
			d.addDvcRqstPriority("NULL");
		}

		/******************** DvcRqst_Sbjct ********************************************************************************/
		if(devicerequest.hasSubject()) {

			if(devicerequest.getSubject().getReference() != null) {
			d.addDvcRqstSbjct(devicerequest.getSubject().getReference());
			}
		} else {
			d.addDvcRqstSbjct("NULL");
		}


		/******************** devicerequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceRequest.DeviceRequestStatus devicerequeststatus = devicerequest.getStatus();
		if(devicerequeststatus!=null) {
			d.addDvcRqstSts(devicerequeststatus.toCode());
		} else {
			d.addDvcRqstSts("NULL");
		}

		/******************** DvcRqst_Enc ********************************************************************************/
		if(devicerequest.hasEncounter()) {

			if(devicerequest.getEncounter().getReference() != null) {
			d.addDvcRqstEnc(devicerequest.getEncounter().getReference());
			}
		} else {
			d.addDvcRqstEnc("NULL");
		}


		/******************** DvcRqst_BasedOn ********************************************************************************/
		if(devicerequest.hasBasedOn()) {

			String  array = "[";
			for(int incr=0; incr<devicerequest.getBasedOn().size(); incr++) {
				array = array + devicerequest.getBasedOn().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcRqstBasedOn(array);

		} else {
			d.addDvcRqstBasedOn("NULL");
		}


		/******************** devicerequestreasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> devicerequestreasoncodelist = devicerequest.getReasonCode();
		for(int devicerequestreasoncodei = 0; devicerequestreasoncodei<devicerequestreasoncodelist.size();devicerequestreasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  devicerequestreasoncode = devicerequestreasoncodelist.get(devicerequestreasoncodei);

		/******************** DvcRqst_RsnCd_Txt ********************************************************************************/
		if(devicerequestreasoncodei == 0) {d.addDvcRqstRsnCdTxt("[");}
		if(devicerequestreasoncode.hasText()) {

			d.addDvcRqstRsnCdTxt(String.valueOf(devicerequestreasoncode.getText()));
		} else {
			d.addDvcRqstRsnCdTxt("NULL");
		}

		if(devicerequestreasoncodei == devicerequestreasoncodelist.size()-1) {d.addDvcRqstRsnCdTxt("]");}


		/******************** devicerequestreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicerequestreasoncodecodinglist = devicerequestreasoncode.getCoding();
		for(int devicerequestreasoncodecodingi = 0; devicerequestreasoncodecodingi<devicerequestreasoncodecodinglist.size();devicerequestreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicerequestreasoncodecoding = devicerequestreasoncodecodinglist.get(devicerequestreasoncodecodingi);

		/******************** DvcRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(devicerequestreasoncodecodingi == 0) {d.addDvcRqstRsnCdCdgDsply("[[");}
		if(devicerequestreasoncodecoding.hasDisplay()) {

			d.addDvcRqstRsnCdCdgDsply(String.valueOf(devicerequestreasoncodecoding.getDisplay()));
		} else {
			d.addDvcRqstRsnCdCdgDsply("NULL");
		}

		if(devicerequestreasoncodecodingi == devicerequestreasoncodecodinglist.size()-1) {d.addDvcRqstRsnCdCdgDsply("]]");}


		/******************** DvcRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(devicerequestreasoncodecodingi == 0) {d.addDvcRqstRsnCdCdgVrsn("[[");}
		if(devicerequestreasoncodecoding.hasVersion()) {

			d.addDvcRqstRsnCdCdgVrsn(String.valueOf(devicerequestreasoncodecoding.getVersion()));
		} else {
			d.addDvcRqstRsnCdCdgVrsn("NULL");
		}

		if(devicerequestreasoncodecodingi == devicerequestreasoncodecodinglist.size()-1) {d.addDvcRqstRsnCdCdgVrsn("]]");}


		/******************** DvcRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(devicerequestreasoncodecodingi == 0) {d.addDvcRqstRsnCdCdgCd("[[");}
		if(devicerequestreasoncodecoding.hasCode()) {

			d.addDvcRqstRsnCdCdgCd(String.valueOf(devicerequestreasoncodecoding.getCode()));
		} else {
			d.addDvcRqstRsnCdCdgCd("NULL");
		}

		if(devicerequestreasoncodecodingi == devicerequestreasoncodecodinglist.size()-1) {d.addDvcRqstRsnCdCdgCd("]]");}


		/******************** DvcRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(devicerequestreasoncodecodingi == 0) {d.addDvcRqstRsnCdCdgUsrSltd("[[");}
		if(devicerequestreasoncodecoding.hasUserSelected()) {

			d.addDvcRqstRsnCdCdgUsrSltd(String.valueOf(devicerequestreasoncodecoding.getUserSelected()));
		} else {
			d.addDvcRqstRsnCdCdgUsrSltd("NULL");
		}

		if(devicerequestreasoncodecodingi == devicerequestreasoncodecodinglist.size()-1) {d.addDvcRqstRsnCdCdgUsrSltd("]]");}


		/******************** DvcRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(devicerequestreasoncodecodingi == 0) {d.addDvcRqstRsnCdCdgSys("[[");}
		if(devicerequestreasoncodecoding.hasSystem()) {

			d.addDvcRqstRsnCdCdgSys(String.valueOf(devicerequestreasoncodecoding.getSystem()));
		} else {
			d.addDvcRqstRsnCdCdgSys("NULL");
		}

		if(devicerequestreasoncodecodingi == devicerequestreasoncodecodinglist.size()-1) {d.addDvcRqstRsnCdCdgSys("]]");}


		 };
		 };
		/******************** devicerequestnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> devicerequestnotelist = devicerequest.getNote();
		for(int devicerequestnotei = 0; devicerequestnotei<devicerequestnotelist.size();devicerequestnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  devicerequestnote = devicerequestnotelist.get(devicerequestnotei);

		/******************** DvcRqst_Nt_Time ********************************************************************************/
		if(devicerequestnotei == 0) {d.addDvcRqstNtTime("[");}
		if(devicerequestnote.hasTime()) {

			d.addDvcRqstNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicerequestnote.getTime())+"\"");
		} else {
			d.addDvcRqstNtTime("NULL");
		}

		if(devicerequestnotei == devicerequestnotelist.size()-1) {d.addDvcRqstNtTime("]");}


		/******************** DvcRqst_Nt_AthrRfrnc ********************************************************************************/
		if(devicerequestnotei == 0) {d.addDvcRqstNtAthrRfrnc("[");}
		if(devicerequestnote.hasAuthorReference()) {

			if(devicerequestnote.getAuthorReference().getReference() != null) {
			d.addDvcRqstNtAthrRfrnc(devicerequestnote.getAuthorReference().getReference());
			}
		} else {
			d.addDvcRqstNtAthrRfrnc("NULL");
		}

		if(devicerequestnotei == devicerequestnotelist.size()-1) {d.addDvcRqstNtAthrRfrnc("]");}


		/******************** DvcRqst_Nt_Txt ********************************************************************************/
		if(devicerequestnotei == 0) {d.addDvcRqstNtTxt("[");}
		if(devicerequestnote.hasText()) {

			d.addDvcRqstNtTxt(String.valueOf(devicerequestnote.getText()));
		} else {
			d.addDvcRqstNtTxt("NULL");
		}

		if(devicerequestnotei == devicerequestnotelist.size()-1) {d.addDvcRqstNtTxt("]");}


		/******************** DvcRqst_Nt_AthrStrgTyp ********************************************************************************/
		if(devicerequestnotei == 0) {d.addDvcRqstNtAthrStrgTyp("[");}
		if(devicerequestnote.hasAuthorStringType()) {

			d.addDvcRqstNtAthrStrgTyp("\""+devicerequestnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			d.addDvcRqstNtAthrStrgTyp("NULL");
		}

		if(devicerequestnotei == devicerequestnotelist.size()-1) {d.addDvcRqstNtAthrStrgTyp("]");}


		 };
		/******************** DvcRqst_RsnRfrnc ********************************************************************************/
		if(devicerequest.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<devicerequest.getReasonReference().size(); incr++) {
				array = array + devicerequest.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcRqstRsnRfrnc(array);

		} else {
			d.addDvcRqstRsnRfrnc("NULL");
		}


		/******************** devicerequestidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> devicerequestidentifierlist = devicerequest.getIdentifier();
		for(int devicerequestidentifieri = 0; devicerequestidentifieri<devicerequestidentifierlist.size();devicerequestidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  devicerequestidentifier = devicerequestidentifierlist.get(devicerequestidentifieri);

		/******************** DvcRqst_Id_Vl ********************************************************************************/
		if(devicerequestidentifieri == 0) {d.addDvcRqstIdVl("[");}
		if(devicerequestidentifier.hasValue()) {

			d.addDvcRqstIdVl(String.valueOf(devicerequestidentifier.getValue()));
		} else {
			d.addDvcRqstIdVl("NULL");
		}

		if(devicerequestidentifieri == devicerequestidentifierlist.size()-1) {d.addDvcRqstIdVl("]");}


		/******************** devicerequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestidentifiertype = devicerequestidentifier.getType();

		/******************** DvcRqst_Id_Typ_Txt ********************************************************************************/
		if(devicerequestidentifieri == 0) {d.addDvcRqstIdTypTxt("[");}
		if(devicerequestidentifiertype.hasText()) {

			d.addDvcRqstIdTypTxt(String.valueOf(devicerequestidentifiertype.getText()));
		} else {
			d.addDvcRqstIdTypTxt("NULL");
		}

		if(devicerequestidentifieri == devicerequestidentifierlist.size()-1) {d.addDvcRqstIdTypTxt("]");}


		/******************** devicerequestidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicerequestidentifiertypecodinglist = devicerequestidentifiertype.getCoding();
		for(int devicerequestidentifiertypecodingi = 0; devicerequestidentifiertypecodingi<devicerequestidentifiertypecodinglist.size();devicerequestidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicerequestidentifiertypecoding = devicerequestidentifiertypecodinglist.get(devicerequestidentifiertypecodingi);

		/******************** DvcRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(devicerequestidentifiertypecodingi == 0) {d.addDvcRqstIdTypCdgDsply("[[");}
		if(devicerequestidentifiertypecoding.hasDisplay()) {

			d.addDvcRqstIdTypCdgDsply(String.valueOf(devicerequestidentifiertypecoding.getDisplay()));
		} else {
			d.addDvcRqstIdTypCdgDsply("NULL");
		}

		if(devicerequestidentifiertypecodingi == devicerequestidentifiertypecodinglist.size()-1) {d.addDvcRqstIdTypCdgDsply("]]");}


		/******************** DvcRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicerequestidentifiertypecodingi == 0) {d.addDvcRqstIdTypCdgVrsn("[[");}
		if(devicerequestidentifiertypecoding.hasVersion()) {

			d.addDvcRqstIdTypCdgVrsn(String.valueOf(devicerequestidentifiertypecoding.getVersion()));
		} else {
			d.addDvcRqstIdTypCdgVrsn("NULL");
		}

		if(devicerequestidentifiertypecodingi == devicerequestidentifiertypecodinglist.size()-1) {d.addDvcRqstIdTypCdgVrsn("]]");}


		/******************** DvcRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(devicerequestidentifiertypecodingi == 0) {d.addDvcRqstIdTypCdgCd("[[");}
		if(devicerequestidentifiertypecoding.hasCode()) {

			d.addDvcRqstIdTypCdgCd(String.valueOf(devicerequestidentifiertypecoding.getCode()));
		} else {
			d.addDvcRqstIdTypCdgCd("NULL");
		}

		if(devicerequestidentifiertypecodingi == devicerequestidentifiertypecodinglist.size()-1) {d.addDvcRqstIdTypCdgCd("]]");}


		/******************** DvcRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicerequestidentifiertypecodingi == 0) {d.addDvcRqstIdTypCdgUsrSltd("[[");}
		if(devicerequestidentifiertypecoding.hasUserSelected()) {

			d.addDvcRqstIdTypCdgUsrSltd(String.valueOf(devicerequestidentifiertypecoding.getUserSelected()));
		} else {
			d.addDvcRqstIdTypCdgUsrSltd("NULL");
		}

		if(devicerequestidentifiertypecodingi == devicerequestidentifiertypecodinglist.size()-1) {d.addDvcRqstIdTypCdgUsrSltd("]]");}


		/******************** DvcRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(devicerequestidentifiertypecodingi == 0) {d.addDvcRqstIdTypCdgSys("[[");}
		if(devicerequestidentifiertypecoding.hasSystem()) {

			d.addDvcRqstIdTypCdgSys(String.valueOf(devicerequestidentifiertypecoding.getSystem()));
		} else {
			d.addDvcRqstIdTypCdgSys("NULL");
		}

		if(devicerequestidentifiertypecodingi == devicerequestidentifiertypecodinglist.size()-1) {d.addDvcRqstIdTypCdgSys("]]");}


		 };
		/******************** devicerequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicerequestidentifierperiod = devicerequestidentifier.getPeriod();

		/******************** DvcRqst_Id_Prd_Strt ********************************************************************************/
		if(devicerequestidentifieri == 0) {d.addDvcRqstIdPrdStrt("[");}
		if(devicerequestidentifierperiod.hasStart()) {

			d.addDvcRqstIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicerequestidentifierperiod.getStart())+"\"");
		} else {
			d.addDvcRqstIdPrdStrt("NULL");
		}

		if(devicerequestidentifieri == devicerequestidentifierlist.size()-1) {d.addDvcRqstIdPrdStrt("]");}


		/******************** DvcRqst_Id_Prd_End ********************************************************************************/
		if(devicerequestidentifieri == 0) {d.addDvcRqstIdPrdEnd("[");}
		if(devicerequestidentifierperiod.hasEnd()) {

			d.addDvcRqstIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicerequestidentifierperiod.getEnd())+"\"");
		} else {
			d.addDvcRqstIdPrdEnd("NULL");
		}

		if(devicerequestidentifieri == devicerequestidentifierlist.size()-1) {d.addDvcRqstIdPrdEnd("]");}


		/******************** devicerequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse devicerequestidentifieruse = devicerequestidentifier.getUse();
		if(devicerequestidentifieruse!=null) {
		if(devicerequestidentifieri == 0) {

		d.addDvcRqstIdUse("[");		}
			d.addDvcRqstIdUse(devicerequestidentifieruse.toCode());
		if(devicerequestidentifieri == devicerequestidentifierlist.size()-1) {

		d.addDvcRqstIdUse("]");		}

		} else {
			d.addDvcRqstIdUse("NULL");
		}

		/******************** DvcRqst_Id_Assigner ********************************************************************************/
		if(devicerequestidentifieri == 0) {d.addDvcRqstIdAssigner("[");}
		if(devicerequestidentifier.hasAssigner()) {

			if(devicerequestidentifier.getAssigner().getReference() != null) {
			d.addDvcRqstIdAssigner(devicerequestidentifier.getAssigner().getReference());
			}
		} else {
			d.addDvcRqstIdAssigner("NULL");
		}

		if(devicerequestidentifieri == devicerequestidentifierlist.size()-1) {d.addDvcRqstIdAssigner("]");}


		/******************** DvcRqst_Id_Sys ********************************************************************************/
		if(devicerequestidentifieri == 0) {d.addDvcRqstIdSys("[");}
		if(devicerequestidentifier.hasSystem()) {

			d.addDvcRqstIdSys(String.valueOf(devicerequestidentifier.getSystem()));
		} else {
			d.addDvcRqstIdSys("NULL");
		}

		if(devicerequestidentifieri == devicerequestidentifierlist.size()-1) {d.addDvcRqstIdSys("]");}


		 };
		/******************** devicerequestgroupidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier devicerequestgroupidentifier = devicerequest.getGroupIdentifier();

		/******************** DvcRqst_GrpId_Vl ********************************************************************************/
		if(devicerequestgroupidentifier.hasValue()) {

			d.addDvcRqstGrpIdVl(String.valueOf(devicerequestgroupidentifier.getValue()));
		} else {
			d.addDvcRqstGrpIdVl("NULL");
		}


		/******************** devicerequestgroupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestgroupidentifiertype = devicerequestgroupidentifier.getType();

		/******************** DvcRqst_GrpId_Typ_Txt ********************************************************************************/
		if(devicerequestgroupidentifiertype.hasText()) {

			d.addDvcRqstGrpIdTypTxt(String.valueOf(devicerequestgroupidentifiertype.getText()));
		} else {
			d.addDvcRqstGrpIdTypTxt("NULL");
		}


		/******************** devicerequestgroupidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicerequestgroupidentifiertypecodinglist = devicerequestgroupidentifiertype.getCoding();
		for(int devicerequestgroupidentifiertypecodingi = 0; devicerequestgroupidentifiertypecodingi<devicerequestgroupidentifiertypecodinglist.size();devicerequestgroupidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicerequestgroupidentifiertypecoding = devicerequestgroupidentifiertypecodinglist.get(devicerequestgroupidentifiertypecodingi);

		/******************** DvcRqst_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(devicerequestgroupidentifiertypecodingi == 0) {d.addDvcRqstGrpIdTypCdgDsply("[");}
		if(devicerequestgroupidentifiertypecoding.hasDisplay()) {

			d.addDvcRqstGrpIdTypCdgDsply(String.valueOf(devicerequestgroupidentifiertypecoding.getDisplay()));
		} else {
			d.addDvcRqstGrpIdTypCdgDsply("NULL");
		}

		if(devicerequestgroupidentifiertypecodingi == devicerequestgroupidentifiertypecodinglist.size()-1) {d.addDvcRqstGrpIdTypCdgDsply("]");}


		/******************** DvcRqst_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicerequestgroupidentifiertypecodingi == 0) {d.addDvcRqstGrpIdTypCdgVrsn("[");}
		if(devicerequestgroupidentifiertypecoding.hasVersion()) {

			d.addDvcRqstGrpIdTypCdgVrsn(String.valueOf(devicerequestgroupidentifiertypecoding.getVersion()));
		} else {
			d.addDvcRqstGrpIdTypCdgVrsn("NULL");
		}

		if(devicerequestgroupidentifiertypecodingi == devicerequestgroupidentifiertypecodinglist.size()-1) {d.addDvcRqstGrpIdTypCdgVrsn("]");}


		/******************** DvcRqst_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(devicerequestgroupidentifiertypecodingi == 0) {d.addDvcRqstGrpIdTypCdgCd("[");}
		if(devicerequestgroupidentifiertypecoding.hasCode()) {

			d.addDvcRqstGrpIdTypCdgCd(String.valueOf(devicerequestgroupidentifiertypecoding.getCode()));
		} else {
			d.addDvcRqstGrpIdTypCdgCd("NULL");
		}

		if(devicerequestgroupidentifiertypecodingi == devicerequestgroupidentifiertypecodinglist.size()-1) {d.addDvcRqstGrpIdTypCdgCd("]");}


		/******************** DvcRqst_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicerequestgroupidentifiertypecodingi == 0) {d.addDvcRqstGrpIdTypCdgUsrSltd("[");}
		if(devicerequestgroupidentifiertypecoding.hasUserSelected()) {

			d.addDvcRqstGrpIdTypCdgUsrSltd(String.valueOf(devicerequestgroupidentifiertypecoding.getUserSelected()));
		} else {
			d.addDvcRqstGrpIdTypCdgUsrSltd("NULL");
		}

		if(devicerequestgroupidentifiertypecodingi == devicerequestgroupidentifiertypecodinglist.size()-1) {d.addDvcRqstGrpIdTypCdgUsrSltd("]");}


		/******************** DvcRqst_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(devicerequestgroupidentifiertypecodingi == 0) {d.addDvcRqstGrpIdTypCdgSys("[");}
		if(devicerequestgroupidentifiertypecoding.hasSystem()) {

			d.addDvcRqstGrpIdTypCdgSys(String.valueOf(devicerequestgroupidentifiertypecoding.getSystem()));
		} else {
			d.addDvcRqstGrpIdTypCdgSys("NULL");
		}

		if(devicerequestgroupidentifiertypecodingi == devicerequestgroupidentifiertypecodinglist.size()-1) {d.addDvcRqstGrpIdTypCdgSys("]");}


		 };
		/******************** devicerequestgroupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicerequestgroupidentifierperiod = devicerequestgroupidentifier.getPeriod();

		/******************** DvcRqst_GrpId_Prd_Strt ********************************************************************************/
		if(devicerequestgroupidentifierperiod.hasStart()) {

			d.addDvcRqstGrpIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicerequestgroupidentifierperiod.getStart())+"\"");
		} else {
			d.addDvcRqstGrpIdPrdStrt("NULL");
		}


		/******************** DvcRqst_GrpId_Prd_End ********************************************************************************/
		if(devicerequestgroupidentifierperiod.hasEnd()) {

			d.addDvcRqstGrpIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicerequestgroupidentifierperiod.getEnd())+"\"");
		} else {
			d.addDvcRqstGrpIdPrdEnd("NULL");
		}


		/******************** devicerequestgroupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse devicerequestgroupidentifieruse = devicerequestgroupidentifier.getUse();
		if(devicerequestgroupidentifieruse!=null) {
			d.addDvcRqstGrpIdUse(devicerequestgroupidentifieruse.toCode());
		} else {
			d.addDvcRqstGrpIdUse("NULL");
		}

		/******************** DvcRqst_GrpId_Assigner ********************************************************************************/
		if(devicerequestgroupidentifier.hasAssigner()) {

			if(devicerequestgroupidentifier.getAssigner().getReference() != null) {
			d.addDvcRqstGrpIdAssigner(devicerequestgroupidentifier.getAssigner().getReference());
			}
		} else {
			d.addDvcRqstGrpIdAssigner("NULL");
		}


		/******************** DvcRqst_GrpId_Sys ********************************************************************************/
		if(devicerequestgroupidentifier.hasSystem()) {

			d.addDvcRqstGrpIdSys(String.valueOf(devicerequestgroupidentifier.getSystem()));
		} else {
			d.addDvcRqstGrpIdSys("NULL");
		}


		/******************** DvcRqst_InstantiatesUri ********************************************************************************/
		if(devicerequest.hasInstantiatesUri()) {

			String  array = "[";
			for(int incr=0; incr<devicerequest.getInstantiatesUri().size(); incr++) {
				array = array + devicerequest.getInstantiatesUri().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcRqstInstantiatesUri(array);

		} else {
			d.addDvcRqstInstantiatesUri("NULL");
		}


		/******************** DvcRqst_OccrnceDtTimeTyp ********************************************************************************/
		if(devicerequest.hasOccurrenceDateTimeType()) {

			d.addDvcRqstOccrnceDtTimeTyp("\""+devicerequest.getOccurrenceDateTimeType().getValueAsString()+"\"");
		} else {
			d.addDvcRqstOccrnceDtTimeTyp("NULL");
		}


		/******************** devicerequestoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicerequestoccurrenceperiod = devicerequest.getOccurrencePeriod();

		/******************** DvcRqst_OccrncePrd_Strt ********************************************************************************/
		if(devicerequestoccurrenceperiod.hasStart()) {

			d.addDvcRqstOccrncePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicerequestoccurrenceperiod.getStart())+"\"");
		} else {
			d.addDvcRqstOccrncePrdStrt("NULL");
		}


		/******************** DvcRqst_OccrncePrd_End ********************************************************************************/
		if(devicerequestoccurrenceperiod.hasEnd()) {

			d.addDvcRqstOccrncePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicerequestoccurrenceperiod.getEnd())+"\"");
		} else {
			d.addDvcRqstOccrncePrdEnd("NULL");
		}


		/******************** DvcRqst_Rqster ********************************************************************************/
		if(devicerequest.hasRequester()) {

			if(devicerequest.getRequester().getReference() != null) {
			d.addDvcRqstRqster(devicerequest.getRequester().getReference());
			}
		} else {
			d.addDvcRqstRqster("NULL");
		}


		/******************** devicerequestperformertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestperformertype = devicerequest.getPerformerType();

		/******************** DvcRqst_PrfrmrTyp_Txt ********************************************************************************/
		if(devicerequestperformertype.hasText()) {

			d.addDvcRqstPrfrmrTypTxt(String.valueOf(devicerequestperformertype.getText()));
		} else {
			d.addDvcRqstPrfrmrTypTxt("NULL");
		}


		/******************** devicerequestperformertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicerequestperformertypecodinglist = devicerequestperformertype.getCoding();
		for(int devicerequestperformertypecodingi = 0; devicerequestperformertypecodingi<devicerequestperformertypecodinglist.size();devicerequestperformertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicerequestperformertypecoding = devicerequestperformertypecodinglist.get(devicerequestperformertypecodingi);

		/******************** DvcRqst_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(devicerequestperformertypecodingi == 0) {d.addDvcRqstPrfrmrTypCdgDsply("[");}
		if(devicerequestperformertypecoding.hasDisplay()) {

			d.addDvcRqstPrfrmrTypCdgDsply(String.valueOf(devicerequestperformertypecoding.getDisplay()));
		} else {
			d.addDvcRqstPrfrmrTypCdgDsply("NULL");
		}

		if(devicerequestperformertypecodingi == devicerequestperformertypecodinglist.size()-1) {d.addDvcRqstPrfrmrTypCdgDsply("]");}


		/******************** DvcRqst_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(devicerequestperformertypecodingi == 0) {d.addDvcRqstPrfrmrTypCdgVrsn("[");}
		if(devicerequestperformertypecoding.hasVersion()) {

			d.addDvcRqstPrfrmrTypCdgVrsn(String.valueOf(devicerequestperformertypecoding.getVersion()));
		} else {
			d.addDvcRqstPrfrmrTypCdgVrsn("NULL");
		}

		if(devicerequestperformertypecodingi == devicerequestperformertypecodinglist.size()-1) {d.addDvcRqstPrfrmrTypCdgVrsn("]");}


		/******************** DvcRqst_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(devicerequestperformertypecodingi == 0) {d.addDvcRqstPrfrmrTypCdgCd("[");}
		if(devicerequestperformertypecoding.hasCode()) {

			d.addDvcRqstPrfrmrTypCdgCd(String.valueOf(devicerequestperformertypecoding.getCode()));
		} else {
			d.addDvcRqstPrfrmrTypCdgCd("NULL");
		}

		if(devicerequestperformertypecodingi == devicerequestperformertypecodinglist.size()-1) {d.addDvcRqstPrfrmrTypCdgCd("]");}


		/******************** DvcRqst_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(devicerequestperformertypecodingi == 0) {d.addDvcRqstPrfrmrTypCdgUsrSltd("[");}
		if(devicerequestperformertypecoding.hasUserSelected()) {

			d.addDvcRqstPrfrmrTypCdgUsrSltd(String.valueOf(devicerequestperformertypecoding.getUserSelected()));
		} else {
			d.addDvcRqstPrfrmrTypCdgUsrSltd("NULL");
		}

		if(devicerequestperformertypecodingi == devicerequestperformertypecodinglist.size()-1) {d.addDvcRqstPrfrmrTypCdgUsrSltd("]");}


		/******************** DvcRqst_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(devicerequestperformertypecodingi == 0) {d.addDvcRqstPrfrmrTypCdgSys("[");}
		if(devicerequestperformertypecoding.hasSystem()) {

			d.addDvcRqstPrfrmrTypCdgSys(String.valueOf(devicerequestperformertypecoding.getSystem()));
		} else {
			d.addDvcRqstPrfrmrTypCdgSys("NULL");
		}

		if(devicerequestperformertypecodingi == devicerequestperformertypecodinglist.size()-1) {d.addDvcRqstPrfrmrTypCdgSys("]");}


		 };
		/******************** devicerequestparameter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DeviceRequest.DeviceRequestParameterComponent> devicerequestparameterlist = devicerequest.getParameter();
		for(int devicerequestparameteri = 0; devicerequestparameteri<devicerequestparameterlist.size();devicerequestparameteri++ ) {
		org.hl7.fhir.r4.model.DeviceRequest.DeviceRequestParameterComponent  devicerequestparameter = devicerequestparameterlist.get(devicerequestparameteri);

		/******************** devicerequestparametercode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestparametercode = devicerequestparameter.getCode();

		/******************** DvcRqst_Prmtr_Cd_Txt ********************************************************************************/
		if(devicerequestparameteri == 0) {d.addDvcRqstPrmtrCdTxt("[");}
		if(devicerequestparametercode.hasText()) {

			d.addDvcRqstPrmtrCdTxt(String.valueOf(devicerequestparametercode.getText()));
		} else {
			d.addDvcRqstPrmtrCdTxt("NULL");
		}

		if(devicerequestparameteri == devicerequestparameterlist.size()-1) {d.addDvcRqstPrmtrCdTxt("]");}


		/******************** devicerequestparametercodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicerequestparametercodecodinglist = devicerequestparametercode.getCoding();
		for(int devicerequestparametercodecodingi = 0; devicerequestparametercodecodingi<devicerequestparametercodecodinglist.size();devicerequestparametercodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicerequestparametercodecoding = devicerequestparametercodecodinglist.get(devicerequestparametercodecodingi);

		/******************** DvcRqst_Prmtr_Cd_Cdg_Dsply ********************************************************************************/
		if(devicerequestparametercodecodingi == 0) {d.addDvcRqstPrmtrCdCdgDsply("[[");}
		if(devicerequestparametercodecoding.hasDisplay()) {

			d.addDvcRqstPrmtrCdCdgDsply(String.valueOf(devicerequestparametercodecoding.getDisplay()));
		} else {
			d.addDvcRqstPrmtrCdCdgDsply("NULL");
		}

		if(devicerequestparametercodecodingi == devicerequestparametercodecodinglist.size()-1) {d.addDvcRqstPrmtrCdCdgDsply("]]");}


		/******************** DvcRqst_Prmtr_Cd_Cdg_Vrsn ********************************************************************************/
		if(devicerequestparametercodecodingi == 0) {d.addDvcRqstPrmtrCdCdgVrsn("[[");}
		if(devicerequestparametercodecoding.hasVersion()) {

			d.addDvcRqstPrmtrCdCdgVrsn(String.valueOf(devicerequestparametercodecoding.getVersion()));
		} else {
			d.addDvcRqstPrmtrCdCdgVrsn("NULL");
		}

		if(devicerequestparametercodecodingi == devicerequestparametercodecodinglist.size()-1) {d.addDvcRqstPrmtrCdCdgVrsn("]]");}


		/******************** DvcRqst_Prmtr_Cd_Cdg_Cd ********************************************************************************/
		if(devicerequestparametercodecodingi == 0) {d.addDvcRqstPrmtrCdCdgCd("[[");}
		if(devicerequestparametercodecoding.hasCode()) {

			d.addDvcRqstPrmtrCdCdgCd(String.valueOf(devicerequestparametercodecoding.getCode()));
		} else {
			d.addDvcRqstPrmtrCdCdgCd("NULL");
		}

		if(devicerequestparametercodecodingi == devicerequestparametercodecodinglist.size()-1) {d.addDvcRqstPrmtrCdCdgCd("]]");}


		/******************** DvcRqst_Prmtr_Cd_Cdg_UsrSltd ********************************************************************************/
		if(devicerequestparametercodecodingi == 0) {d.addDvcRqstPrmtrCdCdgUsrSltd("[[");}
		if(devicerequestparametercodecoding.hasUserSelected()) {

			d.addDvcRqstPrmtrCdCdgUsrSltd(String.valueOf(devicerequestparametercodecoding.getUserSelected()));
		} else {
			d.addDvcRqstPrmtrCdCdgUsrSltd("NULL");
		}

		if(devicerequestparametercodecodingi == devicerequestparametercodecodinglist.size()-1) {d.addDvcRqstPrmtrCdCdgUsrSltd("]]");}


		/******************** DvcRqst_Prmtr_Cd_Cdg_Sys ********************************************************************************/
		if(devicerequestparametercodecodingi == 0) {d.addDvcRqstPrmtrCdCdgSys("[[");}
		if(devicerequestparametercodecoding.hasSystem()) {

			d.addDvcRqstPrmtrCdCdgSys(String.valueOf(devicerequestparametercodecoding.getSystem()));
		} else {
			d.addDvcRqstPrmtrCdCdgSys("NULL");
		}

		if(devicerequestparametercodecodingi == devicerequestparametercodecodinglist.size()-1) {d.addDvcRqstPrmtrCdCdgSys("]]");}


		 };
		/******************** DvcRqst_Prmtr_VlBooleanTyp ********************************************************************************/
		if(devicerequestparameteri == 0) {d.addDvcRqstPrmtrVlBooleanTyp("[");}
		if(devicerequestparameter.hasValueBooleanType()) {

			d.addDvcRqstPrmtrVlBooleanTyp("\""+devicerequestparameter.getValueBooleanType().getValueAsString()+"\"");
		} else {
			d.addDvcRqstPrmtrVlBooleanTyp("NULL");
		}

		if(devicerequestparameteri == devicerequestparameterlist.size()-1) {d.addDvcRqstPrmtrVlBooleanTyp("]");}


		/******************** devicerequestparametervaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestparametervaluecodeableconcept = devicerequestparameter.getValueCodeableConcept();

		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Txt ********************************************************************************/
		if(devicerequestparameteri == 0) {d.addDvcRqstPrmtrVlCdbleCncptTxt("[");}
		if(devicerequestparametervaluecodeableconcept.hasText()) {

			d.addDvcRqstPrmtrVlCdbleCncptTxt(String.valueOf(devicerequestparametervaluecodeableconcept.getText()));
		} else {
			d.addDvcRqstPrmtrVlCdbleCncptTxt("NULL");
		}

		if(devicerequestparameteri == devicerequestparameterlist.size()-1) {d.addDvcRqstPrmtrVlCdbleCncptTxt("]");}


		/******************** devicerequestparametervaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicerequestparametervaluecodeableconceptcodinglist = devicerequestparametervaluecodeableconcept.getCoding();
		for(int devicerequestparametervaluecodeableconceptcodingi = 0; devicerequestparametervaluecodeableconceptcodingi<devicerequestparametervaluecodeableconceptcodinglist.size();devicerequestparametervaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicerequestparametervaluecodeableconceptcoding = devicerequestparametervaluecodeableconceptcodinglist.get(devicerequestparametervaluecodeableconceptcodingi);

		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(devicerequestparametervaluecodeableconceptcodingi == 0) {d.addDvcRqstPrmtrVlCdbleCncptCdgDsply("[[");}
		if(devicerequestparametervaluecodeableconceptcoding.hasDisplay()) {

			d.addDvcRqstPrmtrVlCdbleCncptCdgDsply(String.valueOf(devicerequestparametervaluecodeableconceptcoding.getDisplay()));
		} else {
			d.addDvcRqstPrmtrVlCdbleCncptCdgDsply("NULL");
		}

		if(devicerequestparametervaluecodeableconceptcodingi == devicerequestparametervaluecodeableconceptcodinglist.size()-1) {d.addDvcRqstPrmtrVlCdbleCncptCdgDsply("]]");}


		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(devicerequestparametervaluecodeableconceptcodingi == 0) {d.addDvcRqstPrmtrVlCdbleCncptCdgVrsn("[[");}
		if(devicerequestparametervaluecodeableconceptcoding.hasVersion()) {

			d.addDvcRqstPrmtrVlCdbleCncptCdgVrsn(String.valueOf(devicerequestparametervaluecodeableconceptcoding.getVersion()));
		} else {
			d.addDvcRqstPrmtrVlCdbleCncptCdgVrsn("NULL");
		}

		if(devicerequestparametervaluecodeableconceptcodingi == devicerequestparametervaluecodeableconceptcodinglist.size()-1) {d.addDvcRqstPrmtrVlCdbleCncptCdgVrsn("]]");}


		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(devicerequestparametervaluecodeableconceptcodingi == 0) {d.addDvcRqstPrmtrVlCdbleCncptCdgCd("[[");}
		if(devicerequestparametervaluecodeableconceptcoding.hasCode()) {

			d.addDvcRqstPrmtrVlCdbleCncptCdgCd(String.valueOf(devicerequestparametervaluecodeableconceptcoding.getCode()));
		} else {
			d.addDvcRqstPrmtrVlCdbleCncptCdgCd("NULL");
		}

		if(devicerequestparametervaluecodeableconceptcodingi == devicerequestparametervaluecodeableconceptcodinglist.size()-1) {d.addDvcRqstPrmtrVlCdbleCncptCdgCd("]]");}


		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(devicerequestparametervaluecodeableconceptcodingi == 0) {d.addDvcRqstPrmtrVlCdbleCncptCdgUsrSltd("[[");}
		if(devicerequestparametervaluecodeableconceptcoding.hasUserSelected()) {

			d.addDvcRqstPrmtrVlCdbleCncptCdgUsrSltd(String.valueOf(devicerequestparametervaluecodeableconceptcoding.getUserSelected()));
		} else {
			d.addDvcRqstPrmtrVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(devicerequestparametervaluecodeableconceptcodingi == devicerequestparametervaluecodeableconceptcodinglist.size()-1) {d.addDvcRqstPrmtrVlCdbleCncptCdgUsrSltd("]]");}


		/******************** DvcRqst_Prmtr_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(devicerequestparametervaluecodeableconceptcodingi == 0) {d.addDvcRqstPrmtrVlCdbleCncptCdgSys("[[");}
		if(devicerequestparametervaluecodeableconceptcoding.hasSystem()) {

			d.addDvcRqstPrmtrVlCdbleCncptCdgSys(String.valueOf(devicerequestparametervaluecodeableconceptcoding.getSystem()));
		} else {
			d.addDvcRqstPrmtrVlCdbleCncptCdgSys("NULL");
		}

		if(devicerequestparametervaluecodeableconceptcodingi == devicerequestparametervaluecodeableconceptcodinglist.size()-1) {d.addDvcRqstPrmtrVlCdbleCncptCdgSys("]]");}


		 };
		/******************** devicerequestparametervaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range devicerequestparametervaluerange = devicerequestparameter.getValueRange();

		/******************** devicerequestparametervaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicerequestparametervaluerangelow = devicerequestparametervaluerange.getLow();

		/******************** DvcRqst_Prmtr_VlRng_Lw_Vl ********************************************************************************/
		if(devicerequestparameteri == 0) {d.addDvcRqstPrmtrVlRngLwVl("[");}
		if(devicerequestparametervaluerangelow.hasValue()) {

			d.addDvcRqstPrmtrVlRngLwVl(String.valueOf(devicerequestparametervaluerangelow.getValue()));
		} else {
			d.addDvcRqstPrmtrVlRngLwVl("NULL");
		}

		if(devicerequestparameteri == devicerequestparameterlist.size()-1) {d.addDvcRqstPrmtrVlRngLwVl("]");}


		/******************** devicerequestparametervaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicerequestparametervaluerangelowcomparator = devicerequestparametervaluerangelow.getComparator();
		if(devicerequestparametervaluerangelowcomparator!=null) {
		if(devicerequestparameteri == 0) {

		d.addDvcRqstPrmtrVlRngLwCmprtr("[");		}
			d.addDvcRqstPrmtrVlRngLwCmprtr(devicerequestparametervaluerangelowcomparator.toCode());
		if(devicerequestparameteri == devicerequestparameterlist.size()-1) {

		d.addDvcRqstPrmtrVlRngLwCmprtr("]");		}

		} else {
			d.addDvcRqstPrmtrVlRngLwCmprtr("NULL");
		}

		/******************** DvcRqst_Prmtr_VlRng_Lw_Cd ********************************************************************************/
		if(devicerequestparameteri == 0) {d.addDvcRqstPrmtrVlRngLwCd("[");}
		if(devicerequestparametervaluerangelow.hasCode()) {

			d.addDvcRqstPrmtrVlRngLwCd(String.valueOf(devicerequestparametervaluerangelow.getCode()));
		} else {
			d.addDvcRqstPrmtrVlRngLwCd("NULL");
		}

		if(devicerequestparameteri == devicerequestparameterlist.size()-1) {d.addDvcRqstPrmtrVlRngLwCd("]");}


		/******************** DvcRqst_Prmtr_VlRng_Lw_Unt ********************************************************************************/
		if(devicerequestparameteri == 0) {d.addDvcRqstPrmtrVlRngLwUnt("[");}
		if(devicerequestparametervaluerangelow.hasUnit()) {

			d.addDvcRqstPrmtrVlRngLwUnt(String.valueOf(devicerequestparametervaluerangelow.getUnit()));
		} else {
			d.addDvcRqstPrmtrVlRngLwUnt("NULL");
		}

		if(devicerequestparameteri == devicerequestparameterlist.size()-1) {d.addDvcRqstPrmtrVlRngLwUnt("]");}


		/******************** DvcRqst_Prmtr_VlRng_Lw_Sys ********************************************************************************/
		if(devicerequestparameteri == 0) {d.addDvcRqstPrmtrVlRngLwSys("[");}
		if(devicerequestparametervaluerangelow.hasSystem()) {

			d.addDvcRqstPrmtrVlRngLwSys(String.valueOf(devicerequestparametervaluerangelow.getSystem()));
		} else {
			d.addDvcRqstPrmtrVlRngLwSys("NULL");
		}

		if(devicerequestparameteri == devicerequestparameterlist.size()-1) {d.addDvcRqstPrmtrVlRngLwSys("]");}


		/******************** devicerequestparametervaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicerequestparametervaluerangehigh = devicerequestparametervaluerange.getHigh();

		/******************** DvcRqst_Prmtr_VlRng_Hi_Vl ********************************************************************************/
		if(devicerequestparameteri == 0) {d.addDvcRqstPrmtrVlRngHiVl("[");}
		if(devicerequestparametervaluerangehigh.hasValue()) {

			d.addDvcRqstPrmtrVlRngHiVl(String.valueOf(devicerequestparametervaluerangehigh.getValue()));
		} else {
			d.addDvcRqstPrmtrVlRngHiVl("NULL");
		}

		if(devicerequestparameteri == devicerequestparameterlist.size()-1) {d.addDvcRqstPrmtrVlRngHiVl("]");}


		/******************** devicerequestparametervaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicerequestparametervaluerangehighcomparator = devicerequestparametervaluerangehigh.getComparator();
		if(devicerequestparametervaluerangehighcomparator!=null) {
		if(devicerequestparameteri == 0) {

		d.addDvcRqstPrmtrVlRngHiCmprtr("[");		}
			d.addDvcRqstPrmtrVlRngHiCmprtr(devicerequestparametervaluerangehighcomparator.toCode());
		if(devicerequestparameteri == devicerequestparameterlist.size()-1) {

		d.addDvcRqstPrmtrVlRngHiCmprtr("]");		}

		} else {
			d.addDvcRqstPrmtrVlRngHiCmprtr("NULL");
		}

		/******************** DvcRqst_Prmtr_VlRng_Hi_Cd ********************************************************************************/
		if(devicerequestparameteri == 0) {d.addDvcRqstPrmtrVlRngHiCd("[");}
		if(devicerequestparametervaluerangehigh.hasCode()) {

			d.addDvcRqstPrmtrVlRngHiCd(String.valueOf(devicerequestparametervaluerangehigh.getCode()));
		} else {
			d.addDvcRqstPrmtrVlRngHiCd("NULL");
		}

		if(devicerequestparameteri == devicerequestparameterlist.size()-1) {d.addDvcRqstPrmtrVlRngHiCd("]");}


		/******************** DvcRqst_Prmtr_VlRng_Hi_Unt ********************************************************************************/
		if(devicerequestparameteri == 0) {d.addDvcRqstPrmtrVlRngHiUnt("[");}
		if(devicerequestparametervaluerangehigh.hasUnit()) {

			d.addDvcRqstPrmtrVlRngHiUnt(String.valueOf(devicerequestparametervaluerangehigh.getUnit()));
		} else {
			d.addDvcRqstPrmtrVlRngHiUnt("NULL");
		}

		if(devicerequestparameteri == devicerequestparameterlist.size()-1) {d.addDvcRqstPrmtrVlRngHiUnt("]");}


		/******************** DvcRqst_Prmtr_VlRng_Hi_Sys ********************************************************************************/
		if(devicerequestparameteri == 0) {d.addDvcRqstPrmtrVlRngHiSys("[");}
		if(devicerequestparametervaluerangehigh.hasSystem()) {

			d.addDvcRqstPrmtrVlRngHiSys(String.valueOf(devicerequestparametervaluerangehigh.getSystem()));
		} else {
			d.addDvcRqstPrmtrVlRngHiSys("NULL");
		}

		if(devicerequestparameteri == devicerequestparameterlist.size()-1) {d.addDvcRqstPrmtrVlRngHiSys("]");}


		/******************** devicerequestparametervaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicerequestparametervaluequantity = devicerequestparameter.getValueQuantity();

		/******************** DvcRqst_Prmtr_VlQnty_Vl ********************************************************************************/
		if(devicerequestparameteri == 0) {d.addDvcRqstPrmtrVlQntyVl("[");}
		if(devicerequestparametervaluequantity.hasValue()) {

			d.addDvcRqstPrmtrVlQntyVl(String.valueOf(devicerequestparametervaluequantity.getValue()));
		} else {
			d.addDvcRqstPrmtrVlQntyVl("NULL");
		}

		if(devicerequestparameteri == devicerequestparameterlist.size()-1) {d.addDvcRqstPrmtrVlQntyVl("]");}


		/******************** devicerequestparametervaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicerequestparametervaluequantitycomparator = devicerequestparametervaluequantity.getComparator();
		if(devicerequestparametervaluequantitycomparator!=null) {
		if(devicerequestparameteri == 0) {

		d.addDvcRqstPrmtrVlQntyCmprtr("[");		}
			d.addDvcRqstPrmtrVlQntyCmprtr(devicerequestparametervaluequantitycomparator.toCode());
		if(devicerequestparameteri == devicerequestparameterlist.size()-1) {

		d.addDvcRqstPrmtrVlQntyCmprtr("]");		}

		} else {
			d.addDvcRqstPrmtrVlQntyCmprtr("NULL");
		}

		/******************** DvcRqst_Prmtr_VlQnty_Cd ********************************************************************************/
		if(devicerequestparameteri == 0) {d.addDvcRqstPrmtrVlQntyCd("[");}
		if(devicerequestparametervaluequantity.hasCode()) {

			d.addDvcRqstPrmtrVlQntyCd(String.valueOf(devicerequestparametervaluequantity.getCode()));
		} else {
			d.addDvcRqstPrmtrVlQntyCd("NULL");
		}

		if(devicerequestparameteri == devicerequestparameterlist.size()-1) {d.addDvcRqstPrmtrVlQntyCd("]");}


		/******************** DvcRqst_Prmtr_VlQnty_Unt ********************************************************************************/
		if(devicerequestparameteri == 0) {d.addDvcRqstPrmtrVlQntyUnt("[");}
		if(devicerequestparametervaluequantity.hasUnit()) {

			d.addDvcRqstPrmtrVlQntyUnt(String.valueOf(devicerequestparametervaluequantity.getUnit()));
		} else {
			d.addDvcRqstPrmtrVlQntyUnt("NULL");
		}

		if(devicerequestparameteri == devicerequestparameterlist.size()-1) {d.addDvcRqstPrmtrVlQntyUnt("]");}


		/******************** DvcRqst_Prmtr_VlQnty_Sys ********************************************************************************/
		if(devicerequestparameteri == 0) {d.addDvcRqstPrmtrVlQntySys("[");}
		if(devicerequestparametervaluequantity.hasSystem()) {

			d.addDvcRqstPrmtrVlQntySys(String.valueOf(devicerequestparametervaluequantity.getSystem()));
		} else {
			d.addDvcRqstPrmtrVlQntySys("NULL");
		}

		if(devicerequestparameteri == devicerequestparameterlist.size()-1) {d.addDvcRqstPrmtrVlQntySys("]");}


		 };
		/******************** devicerequestoccurrencetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing devicerequestoccurrencetiming = devicerequest.getOccurrenceTiming();

		/******************** devicerequestoccurrencetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestoccurrencetimingcode = devicerequestoccurrencetiming.getCode();

		/******************** DvcRqst_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(devicerequestoccurrencetimingcode.hasText()) {

			d.addDvcRqstOccrnceTmgCdTxt(String.valueOf(devicerequestoccurrencetimingcode.getText()));
		} else {
			d.addDvcRqstOccrnceTmgCdTxt("NULL");
		}


		/******************** devicerequestoccurrencetimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicerequestoccurrencetimingcodecodinglist = devicerequestoccurrencetimingcode.getCoding();
		for(int devicerequestoccurrencetimingcodecodingi = 0; devicerequestoccurrencetimingcodecodingi<devicerequestoccurrencetimingcodecodinglist.size();devicerequestoccurrencetimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicerequestoccurrencetimingcodecoding = devicerequestoccurrencetimingcodecodinglist.get(devicerequestoccurrencetimingcodecodingi);

		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(devicerequestoccurrencetimingcodecodingi == 0) {d.addDvcRqstOccrnceTmgCdCdgDsply("[");}
		if(devicerequestoccurrencetimingcodecoding.hasDisplay()) {

			d.addDvcRqstOccrnceTmgCdCdgDsply(String.valueOf(devicerequestoccurrencetimingcodecoding.getDisplay()));
		} else {
			d.addDvcRqstOccrnceTmgCdCdgDsply("NULL");
		}

		if(devicerequestoccurrencetimingcodecodingi == devicerequestoccurrencetimingcodecodinglist.size()-1) {d.addDvcRqstOccrnceTmgCdCdgDsply("]");}


		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(devicerequestoccurrencetimingcodecodingi == 0) {d.addDvcRqstOccrnceTmgCdCdgVrsn("[");}
		if(devicerequestoccurrencetimingcodecoding.hasVersion()) {

			d.addDvcRqstOccrnceTmgCdCdgVrsn(String.valueOf(devicerequestoccurrencetimingcodecoding.getVersion()));
		} else {
			d.addDvcRqstOccrnceTmgCdCdgVrsn("NULL");
		}

		if(devicerequestoccurrencetimingcodecodingi == devicerequestoccurrencetimingcodecodinglist.size()-1) {d.addDvcRqstOccrnceTmgCdCdgVrsn("]");}


		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(devicerequestoccurrencetimingcodecodingi == 0) {d.addDvcRqstOccrnceTmgCdCdgCd("[");}
		if(devicerequestoccurrencetimingcodecoding.hasCode()) {

			d.addDvcRqstOccrnceTmgCdCdgCd(String.valueOf(devicerequestoccurrencetimingcodecoding.getCode()));
		} else {
			d.addDvcRqstOccrnceTmgCdCdgCd("NULL");
		}

		if(devicerequestoccurrencetimingcodecodingi == devicerequestoccurrencetimingcodecodinglist.size()-1) {d.addDvcRqstOccrnceTmgCdCdgCd("]");}


		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(devicerequestoccurrencetimingcodecodingi == 0) {d.addDvcRqstOccrnceTmgCdCdgUsrSltd("[");}
		if(devicerequestoccurrencetimingcodecoding.hasUserSelected()) {

			d.addDvcRqstOccrnceTmgCdCdgUsrSltd(String.valueOf(devicerequestoccurrencetimingcodecoding.getUserSelected()));
		} else {
			d.addDvcRqstOccrnceTmgCdCdgUsrSltd("NULL");
		}

		if(devicerequestoccurrencetimingcodecodingi == devicerequestoccurrencetimingcodecodinglist.size()-1) {d.addDvcRqstOccrnceTmgCdCdgUsrSltd("]");}


		/******************** DvcRqst_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(devicerequestoccurrencetimingcodecodingi == 0) {d.addDvcRqstOccrnceTmgCdCdgSys("[");}
		if(devicerequestoccurrencetimingcodecoding.hasSystem()) {

			d.addDvcRqstOccrnceTmgCdCdgSys(String.valueOf(devicerequestoccurrencetimingcodecoding.getSystem()));
		} else {
			d.addDvcRqstOccrnceTmgCdCdgSys("NULL");
		}

		if(devicerequestoccurrencetimingcodecodingi == devicerequestoccurrencetimingcodecodinglist.size()-1) {d.addDvcRqstOccrnceTmgCdCdgSys("]");}


		 };
		/******************** DvcRqst_OccrnceTmg_Evnt ********************************************************************************/
		if(devicerequestoccurrencetiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<devicerequestoccurrencetiming.getEvent().size(); incr++) {
				array = array + devicerequestoccurrencetiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcRqstOccrnceTmgEvnt(array);

		} else {
			d.addDvcRqstOccrnceTmgEvnt("NULL");
		}


		/******************** devicerequestoccurrencetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent devicerequestoccurrencetimingrepeat = devicerequestoccurrencetiming.getRepeat();

		/******************** DvcRqst_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(devicerequestoccurrencetimingrepeat.hasOffset()) {

			d.addDvcRqstOccrnceTmgRptOff(String.valueOf(devicerequestoccurrencetimingrepeat.getOffset()));
		} else {
			d.addDvcRqstOccrnceTmgRptOff("NULL");
		}


		/******************** DvcRqst_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(devicerequestoccurrencetimingrepeat.hasCount()) {

			d.addDvcRqstOccrnceTmgRptCnt(String.valueOf(devicerequestoccurrencetimingrepeat.getCount()));
		} else {
			d.addDvcRqstOccrnceTmgRptCnt("NULL");
		}


		/******************** DvcRqst_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(devicerequestoccurrencetimingrepeat.hasPeriod()) {

			d.addDvcRqstOccrnceTmgRptPrd(String.valueOf(devicerequestoccurrencetimingrepeat.getPeriod()));
		} else {
			d.addDvcRqstOccrnceTmgRptPrd("NULL");
		}


		/******************** DvcRqst_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(devicerequestoccurrencetimingrepeat.hasCountMax()) {

			d.addDvcRqstOccrnceTmgRptCntMx(String.valueOf(devicerequestoccurrencetimingrepeat.getCountMax()));
		} else {
			d.addDvcRqstOccrnceTmgRptCntMx("NULL");
		}


		/******************** DvcRqst_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(devicerequestoccurrencetimingrepeat.hasDurationMax()) {

			d.addDvcRqstOccrnceTmgRptDurationMx(String.valueOf(devicerequestoccurrencetimingrepeat.getDurationMax()));
		} else {
			d.addDvcRqstOccrnceTmgRptDurationMx("NULL");
		}


		/******************** devicerequestoccurrencetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicerequestoccurrencetimingrepeatboundsperiod = devicerequestoccurrencetimingrepeat.getBoundsPeriod();

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsperiod.hasStart()) {

			d.addDvcRqstOccrnceTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicerequestoccurrencetimingrepeatboundsperiod.getStart())+"\"");
		} else {
			d.addDvcRqstOccrnceTmgRptBndsPrdStrt("NULL");
		}


		/******************** DvcRqst_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsperiod.hasEnd()) {

			d.addDvcRqstOccrnceTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicerequestoccurrencetimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			d.addDvcRqstOccrnceTmgRptBndsPrdEnd("NULL");
		}


		/******************** devicerequestoccurrencetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime devicerequestoccurrencetimingrepeatdurationunit = devicerequestoccurrencetimingrepeat.getDurationUnit();
		if(devicerequestoccurrencetimingrepeatdurationunit!=null) {
			d.addDvcRqstOccrnceTmgRptDurationUnt(devicerequestoccurrencetimingrepeatdurationunit.toCode());
		} else {
			d.addDvcRqstOccrnceTmgRptDurationUnt("NULL");
		}

		/******************** devicerequestoccurrencetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration devicerequestoccurrencetimingrepeatboundsduration = devicerequestoccurrencetimingrepeat.getBoundsDuration();

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsduration.hasValue()) {

			d.addDvcRqstOccrnceTmgRptBndsDurationVl(String.valueOf(devicerequestoccurrencetimingrepeatboundsduration.getValue()));
		} else {
			d.addDvcRqstOccrnceTmgRptBndsDurationVl("NULL");
		}


		/******************** devicerequestoccurrencetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicerequestoccurrencetimingrepeatboundsdurationcomparator = devicerequestoccurrencetimingrepeatboundsduration.getComparator();
		if(devicerequestoccurrencetimingrepeatboundsdurationcomparator!=null) {
			d.addDvcRqstOccrnceTmgRptBndsDurationCmprtr(devicerequestoccurrencetimingrepeatboundsdurationcomparator.toCode());
		} else {
			d.addDvcRqstOccrnceTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsduration.hasCode()) {

			d.addDvcRqstOccrnceTmgRptBndsDurationCd(String.valueOf(devicerequestoccurrencetimingrepeatboundsduration.getCode()));
		} else {
			d.addDvcRqstOccrnceTmgRptBndsDurationCd("NULL");
		}


		/******************** DvcRqst_OccrnceTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsduration.hasUnit()) {

			d.addDvcRqstOccrnceTmgRptBndsDurationUnt(String.valueOf(devicerequestoccurrencetimingrepeatboundsduration.getUnit()));
		} else {
			d.addDvcRqstOccrnceTmgRptBndsDurationUnt("NULL");
		}


		/******************** DvcRqst_OccrnceTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsduration.hasSystem()) {

			d.addDvcRqstOccrnceTmgRptBndsDurationSys(String.valueOf(devicerequestoccurrencetimingrepeatboundsduration.getSystem()));
		} else {
			d.addDvcRqstOccrnceTmgRptBndsDurationSys("NULL");
		}


		/******************** devicerequestoccurrencetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range devicerequestoccurrencetimingrepeatboundsrange = devicerequestoccurrencetimingrepeat.getBoundsRange();

		/******************** devicerequestoccurrencetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicerequestoccurrencetimingrepeatboundsrangelow = devicerequestoccurrencetimingrepeatboundsrange.getLow();

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsrangelow.hasValue()) {

			d.addDvcRqstOccrnceTmgRptBndsRngLwVl(String.valueOf(devicerequestoccurrencetimingrepeatboundsrangelow.getValue()));
		} else {
			d.addDvcRqstOccrnceTmgRptBndsRngLwVl("NULL");
		}


		/******************** devicerequestoccurrencetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicerequestoccurrencetimingrepeatboundsrangelowcomparator = devicerequestoccurrencetimingrepeatboundsrangelow.getComparator();
		if(devicerequestoccurrencetimingrepeatboundsrangelowcomparator!=null) {
			d.addDvcRqstOccrnceTmgRptBndsRngLwCmprtr(devicerequestoccurrencetimingrepeatboundsrangelowcomparator.toCode());
		} else {
			d.addDvcRqstOccrnceTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsrangelow.hasCode()) {

			d.addDvcRqstOccrnceTmgRptBndsRngLwCd(String.valueOf(devicerequestoccurrencetimingrepeatboundsrangelow.getCode()));
		} else {
			d.addDvcRqstOccrnceTmgRptBndsRngLwCd("NULL");
		}


		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsrangelow.hasUnit()) {

			d.addDvcRqstOccrnceTmgRptBndsRngLwUnt(String.valueOf(devicerequestoccurrencetimingrepeatboundsrangelow.getUnit()));
		} else {
			d.addDvcRqstOccrnceTmgRptBndsRngLwUnt("NULL");
		}


		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsrangelow.hasSystem()) {

			d.addDvcRqstOccrnceTmgRptBndsRngLwSys(String.valueOf(devicerequestoccurrencetimingrepeatboundsrangelow.getSystem()));
		} else {
			d.addDvcRqstOccrnceTmgRptBndsRngLwSys("NULL");
		}


		/******************** devicerequestoccurrencetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicerequestoccurrencetimingrepeatboundsrangehigh = devicerequestoccurrencetimingrepeatboundsrange.getHigh();

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsrangehigh.hasValue()) {

			d.addDvcRqstOccrnceTmgRptBndsRngHiVl(String.valueOf(devicerequestoccurrencetimingrepeatboundsrangehigh.getValue()));
		} else {
			d.addDvcRqstOccrnceTmgRptBndsRngHiVl("NULL");
		}


		/******************** devicerequestoccurrencetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicerequestoccurrencetimingrepeatboundsrangehighcomparator = devicerequestoccurrencetimingrepeatboundsrangehigh.getComparator();
		if(devicerequestoccurrencetimingrepeatboundsrangehighcomparator!=null) {
			d.addDvcRqstOccrnceTmgRptBndsRngHiCmprtr(devicerequestoccurrencetimingrepeatboundsrangehighcomparator.toCode());
		} else {
			d.addDvcRqstOccrnceTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsrangehigh.hasCode()) {

			d.addDvcRqstOccrnceTmgRptBndsRngHiCd(String.valueOf(devicerequestoccurrencetimingrepeatboundsrangehigh.getCode()));
		} else {
			d.addDvcRqstOccrnceTmgRptBndsRngHiCd("NULL");
		}


		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsrangehigh.hasUnit()) {

			d.addDvcRqstOccrnceTmgRptBndsRngHiUnt(String.valueOf(devicerequestoccurrencetimingrepeatboundsrangehigh.getUnit()));
		} else {
			d.addDvcRqstOccrnceTmgRptBndsRngHiUnt("NULL");
		}


		/******************** DvcRqst_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(devicerequestoccurrencetimingrepeatboundsrangehigh.hasSystem()) {

			d.addDvcRqstOccrnceTmgRptBndsRngHiSys(String.valueOf(devicerequestoccurrencetimingrepeatboundsrangehigh.getSystem()));
		} else {
			d.addDvcRqstOccrnceTmgRptBndsRngHiSys("NULL");
		}


		/******************** DvcRqst_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(devicerequestoccurrencetimingrepeat.hasFrequencyMax()) {

			d.addDvcRqstOccrnceTmgRptFrqncyMx(String.valueOf(devicerequestoccurrencetimingrepeat.getFrequencyMax()));
		} else {
			d.addDvcRqstOccrnceTmgRptFrqncyMx("NULL");
		}


		/******************** devicerequestoccurrencetimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> devicerequestoccurrencetimingrepeatwhenlist = devicerequestoccurrencetimingrepeat.getWhen();
		for(int devicerequestoccurrencetimingrepeatwheni = 0; devicerequestoccurrencetimingrepeatwheni<devicerequestoccurrencetimingrepeatwhenlist.size();devicerequestoccurrencetimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  devicerequestoccurrencetimingrepeatwhen = devicerequestoccurrencetimingrepeatwhenlist.get(devicerequestoccurrencetimingrepeatwheni);
		if(devicerequestoccurrencetimingrepeatwhen!=null) {
			d.addDvcRqstOccrnceTmgRptWhen(devicerequestoccurrencetimingrepeatwhen.getCode());
		} else {
			d.addDvcRqstOccrnceTmgRptWhen("NULL");
		}
		 };

		/******************** devicerequestoccurrencetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime devicerequestoccurrencetimingrepeatperiodunit = devicerequestoccurrencetimingrepeat.getPeriodUnit();
		if(devicerequestoccurrencetimingrepeatperiodunit!=null) {
			d.addDvcRqstOccrnceTmgRptPrdUnt(devicerequestoccurrencetimingrepeatperiodunit.toCode());
		} else {
			d.addDvcRqstOccrnceTmgRptPrdUnt("NULL");
		}

		/******************** DvcRqst_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(devicerequestoccurrencetimingrepeat.hasPeriodMax()) {

			d.addDvcRqstOccrnceTmgRptPrdMx(String.valueOf(devicerequestoccurrencetimingrepeat.getPeriodMax()));
		} else {
			d.addDvcRqstOccrnceTmgRptPrdMx("NULL");
		}


		/******************** devicerequestoccurrencetimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> devicerequestoccurrencetimingrepeatdayofweeklist = devicerequestoccurrencetimingrepeat.getDayOfWeek();
		for(int devicerequestoccurrencetimingrepeatdayofweeki = 0; devicerequestoccurrencetimingrepeatdayofweeki<devicerequestoccurrencetimingrepeatdayofweeklist.size();devicerequestoccurrencetimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  devicerequestoccurrencetimingrepeatdayofweek = devicerequestoccurrencetimingrepeatdayofweeklist.get(devicerequestoccurrencetimingrepeatdayofweeki);
		if(devicerequestoccurrencetimingrepeatdayofweek!=null) {
			d.addDvcRqstOccrnceTmgRptDayOfWeek(devicerequestoccurrencetimingrepeatdayofweek.getCode());
		} else {
			d.addDvcRqstOccrnceTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** DvcRqst_OccrnceTmg_Rpt_TimeOfDay ********************************************************************************/
		if(devicerequestoccurrencetimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<devicerequestoccurrencetimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + devicerequestoccurrencetimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcRqstOccrnceTmgRptTimeOfDay(array);

		} else {
			d.addDvcRqstOccrnceTmgRptTimeOfDay("NULL");
		}


		/******************** DvcRqst_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(devicerequestoccurrencetimingrepeat.hasDuration()) {

			d.addDvcRqstOccrnceTmgRptDuration(String.valueOf(devicerequestoccurrencetimingrepeat.getDuration()));
		} else {
			d.addDvcRqstOccrnceTmgRptDuration("NULL");
		}


		/******************** DvcRqst_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(devicerequestoccurrencetimingrepeat.hasFrequency()) {

			d.addDvcRqstOccrnceTmgRptFrqncy(String.valueOf(devicerequestoccurrencetimingrepeat.getFrequency()));
		} else {
			d.addDvcRqstOccrnceTmgRptFrqncy("NULL");
		}


		/******************** DvcRqst_Prfrmr ********************************************************************************/
		if(devicerequest.hasPerformer()) {

			if(devicerequest.getPerformer().getReference() != null) {
			d.addDvcRqstPrfrmr(devicerequest.getPerformer().getReference());
			}
		} else {
			d.addDvcRqstPrfrmr("NULL");
		}


		/******************** devicerequestcodecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicerequestcodecodeableconcept = devicerequest.getCodeCodeableConcept();

		/******************** DvcRqst_CdCdbleCncpt_Txt ********************************************************************************/
		if(devicerequestcodecodeableconcept.hasText()) {

			d.addDvcRqstCdCdbleCncptTxt(String.valueOf(devicerequestcodecodeableconcept.getText()));
		} else {
			d.addDvcRqstCdCdbleCncptTxt("NULL");
		}


		/******************** devicerequestcodecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicerequestcodecodeableconceptcodinglist = devicerequestcodecodeableconcept.getCoding();
		for(int devicerequestcodecodeableconceptcodingi = 0; devicerequestcodecodeableconceptcodingi<devicerequestcodecodeableconceptcodinglist.size();devicerequestcodecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicerequestcodecodeableconceptcoding = devicerequestcodecodeableconceptcodinglist.get(devicerequestcodecodeableconceptcodingi);

		/******************** DvcRqst_CdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(devicerequestcodecodeableconceptcodingi == 0) {d.addDvcRqstCdCdbleCncptCdgDsply("[");}
		if(devicerequestcodecodeableconceptcoding.hasDisplay()) {

			d.addDvcRqstCdCdbleCncptCdgDsply(String.valueOf(devicerequestcodecodeableconceptcoding.getDisplay()));
		} else {
			d.addDvcRqstCdCdbleCncptCdgDsply("NULL");
		}

		if(devicerequestcodecodeableconceptcodingi == devicerequestcodecodeableconceptcodinglist.size()-1) {d.addDvcRqstCdCdbleCncptCdgDsply("]");}


		/******************** DvcRqst_CdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(devicerequestcodecodeableconceptcodingi == 0) {d.addDvcRqstCdCdbleCncptCdgVrsn("[");}
		if(devicerequestcodecodeableconceptcoding.hasVersion()) {

			d.addDvcRqstCdCdbleCncptCdgVrsn(String.valueOf(devicerequestcodecodeableconceptcoding.getVersion()));
		} else {
			d.addDvcRqstCdCdbleCncptCdgVrsn("NULL");
		}

		if(devicerequestcodecodeableconceptcodingi == devicerequestcodecodeableconceptcodinglist.size()-1) {d.addDvcRqstCdCdbleCncptCdgVrsn("]");}


		/******************** DvcRqst_CdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(devicerequestcodecodeableconceptcodingi == 0) {d.addDvcRqstCdCdbleCncptCdgCd("[");}
		if(devicerequestcodecodeableconceptcoding.hasCode()) {

			d.addDvcRqstCdCdbleCncptCdgCd(String.valueOf(devicerequestcodecodeableconceptcoding.getCode()));
		} else {
			d.addDvcRqstCdCdbleCncptCdgCd("NULL");
		}

		if(devicerequestcodecodeableconceptcodingi == devicerequestcodecodeableconceptcodinglist.size()-1) {d.addDvcRqstCdCdbleCncptCdgCd("]");}


		/******************** DvcRqst_CdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(devicerequestcodecodeableconceptcodingi == 0) {d.addDvcRqstCdCdbleCncptCdgUsrSltd("[");}
		if(devicerequestcodecodeableconceptcoding.hasUserSelected()) {

			d.addDvcRqstCdCdbleCncptCdgUsrSltd(String.valueOf(devicerequestcodecodeableconceptcoding.getUserSelected()));
		} else {
			d.addDvcRqstCdCdbleCncptCdgUsrSltd("NULL");
		}

		if(devicerequestcodecodeableconceptcodingi == devicerequestcodecodeableconceptcodinglist.size()-1) {d.addDvcRqstCdCdbleCncptCdgUsrSltd("]");}


		/******************** DvcRqst_CdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(devicerequestcodecodeableconceptcodingi == 0) {d.addDvcRqstCdCdbleCncptCdgSys("[");}
		if(devicerequestcodecodeableconceptcoding.hasSystem()) {

			d.addDvcRqstCdCdbleCncptCdgSys(String.valueOf(devicerequestcodecodeableconceptcoding.getSystem()));
		} else {
			d.addDvcRqstCdCdbleCncptCdgSys("NULL");
		}

		if(devicerequestcodecodeableconceptcodingi == devicerequestcodecodeableconceptcodinglist.size()-1) {d.addDvcRqstCdCdbleCncptCdgSys("]");}


		 };
		/******************** DvcRqst_SprtingInfo ********************************************************************************/
		if(devicerequest.hasSupportingInfo()) {

			String  array = "[";
			for(int incr=0; incr<devicerequest.getSupportingInfo().size(); incr++) {
				array = array + devicerequest.getSupportingInfo().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcRqstSprtingInfo(array);

		} else {
			d.addDvcRqstSprtingInfo("NULL");
		}


		/******************** DvcRqst_Insrnc ********************************************************************************/
		if(devicerequest.hasInsurance()) {

			String  array = "[";
			for(int incr=0; incr<devicerequest.getInsurance().size(); incr++) {
				array = array + devicerequest.getInsurance().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcRqstInsrnc(array);

		} else {
			d.addDvcRqstInsrnc("NULL");
		}


		/******************** DvcRqst_RelevantHis ********************************************************************************/
		if(devicerequest.hasRelevantHistory()) {

			String  array = "[";
			for(int incr=0; incr<devicerequest.getRelevantHistory().size(); incr++) {
				array = array + devicerequest.getRelevantHistory().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcRqstRelevantHis(array);

		} else {
			d.addDvcRqstRelevantHis("NULL");
		}


		/******************** DvcRqst_InstantiatesCanonical ********************************************************************************/
		if(devicerequest.hasInstantiatesCanonical()) {

			String  array = "[";
			for(int incr=0; incr<devicerequest.getInstantiatesCanonical().size(); incr++) {
				array = array + devicerequest.getInstantiatesCanonical().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcRqstInstantiatesCanonical(array);

		} else {
			d.addDvcRqstInstantiatesCanonical("NULL");
		}


		/******************** DvcRqst_PriorRqst ********************************************************************************/
		if(devicerequest.hasPriorRequest()) {

			String  array = "[";
			for(int incr=0; incr<devicerequest.getPriorRequest().size(); incr++) {
				array = array + devicerequest.getPriorRequest().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcRqstPriorRqst(array);

		} else {
			d.addDvcRqstPriorRqst("NULL");
		}


		/******************** DvcRqst_CdRfrnc ********************************************************************************/
		if(devicerequest.hasCodeReference()) {

			if(devicerequest.getCodeReference().getReference() != null) {
			d.addDvcRqstCdRfrnc(devicerequest.getCodeReference().getReference());
			}
		} else {
			d.addDvcRqstCdRfrnc("NULL");
		}


		/******************** DvcRqst_AthredOn ********************************************************************************/
		if(devicerequest.hasAuthoredOn()) {

			d.addDvcRqstAthredOn("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicerequest.getAuthoredOn())+"\"");
		} else {
			d.addDvcRqstAthredOn("NULL");
		}


		/******************** devicerequestintent ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceRequest.RequestIntent devicerequestintent = devicerequest.getIntent();
		if(devicerequestintent!=null) {
			d.addDvcRqstIntent(devicerequestintent.toCode());
		} else {
			d.addDvcRqstIntent("NULL");
		}

		return d;
	}
}
