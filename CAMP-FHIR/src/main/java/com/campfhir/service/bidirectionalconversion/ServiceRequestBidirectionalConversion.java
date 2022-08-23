package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ServiceRequest;
public class ServiceRequestBidirectionalConversion 
{
	public ServiceRequest ServiceRequests(org.hl7.fhir.r4.model.ServiceRequest servicerequest) throws ParseException
	{
		 main.java.com.campfhir.model.ServiceRequest s = new  main.java.com.campfhir.model.ServiceRequest();

		/******************** id ********************************************************************************/
		s.setId(servicerequest.getIdElement().getIdPart());

		/******************** servicerequestpriority ********************************************************************************/
		org.hl7.fhir.r4.model.ServiceRequest.ServiceRequestPriority servicerequestpriority = servicerequest.getPriority();
		if(servicerequestpriority!=null) {
			s.addSrvRqstPriority(servicerequestpriority.toCode());
		} else {
			s.addSrvRqstPriority("NULL");
		}

		/******************** servicerequestcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestcode = servicerequest.getCode();

		/******************** SrvRqst_Cd_Txt ********************************************************************************/
		if(servicerequestcode.hasText()) {

			s.addSrvRqstCdTxt(String.valueOf(servicerequestcode.getText()));
		} else {
			s.addSrvRqstCdTxt("NULL");
		}


		/******************** servicerequestcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> servicerequestcodecodinglist = servicerequestcode.getCoding();
		for(int servicerequestcodecodingi = 0; servicerequestcodecodingi<servicerequestcodecodinglist.size();servicerequestcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  servicerequestcodecoding = servicerequestcodecodinglist.get(servicerequestcodecodingi);

		/******************** SrvRqst_Cd_Cdg_Dsply ********************************************************************************/
		if(servicerequestcodecodingi == 0) {s.addSrvRqstCdCdgDsply("[");}
		if(servicerequestcodecoding.hasDisplay()) {

			s.addSrvRqstCdCdgDsply(String.valueOf(servicerequestcodecoding.getDisplay()));
		} else {
			s.addSrvRqstCdCdgDsply("NULL");
		}

		if(servicerequestcodecodingi == servicerequestcodecodinglist.size()-1) {s.addSrvRqstCdCdgDsply("]");}


		/******************** SrvRqst_Cd_Cdg_Vrsn ********************************************************************************/
		if(servicerequestcodecodingi == 0) {s.addSrvRqstCdCdgVrsn("[");}
		if(servicerequestcodecoding.hasVersion()) {

			s.addSrvRqstCdCdgVrsn(String.valueOf(servicerequestcodecoding.getVersion()));
		} else {
			s.addSrvRqstCdCdgVrsn("NULL");
		}

		if(servicerequestcodecodingi == servicerequestcodecodinglist.size()-1) {s.addSrvRqstCdCdgVrsn("]");}


		/******************** SrvRqst_Cd_Cdg_Cd ********************************************************************************/
		if(servicerequestcodecodingi == 0) {s.addSrvRqstCdCdgCd("[");}
		if(servicerequestcodecoding.hasCode()) {

			s.addSrvRqstCdCdgCd(String.valueOf(servicerequestcodecoding.getCode()));
		} else {
			s.addSrvRqstCdCdgCd("NULL");
		}

		if(servicerequestcodecodingi == servicerequestcodecodinglist.size()-1) {s.addSrvRqstCdCdgCd("]");}


		/******************** SrvRqst_Cd_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestcodecodingi == 0) {s.addSrvRqstCdCdgUsrSltd("[");}
		if(servicerequestcodecoding.hasUserSelected()) {

			s.addSrvRqstCdCdgUsrSltd(String.valueOf(servicerequestcodecoding.getUserSelected()));
		} else {
			s.addSrvRqstCdCdgUsrSltd("NULL");
		}

		if(servicerequestcodecodingi == servicerequestcodecodinglist.size()-1) {s.addSrvRqstCdCdgUsrSltd("]");}


		/******************** SrvRqst_Cd_Cdg_Sys ********************************************************************************/
		if(servicerequestcodecodingi == 0) {s.addSrvRqstCdCdgSys("[");}
		if(servicerequestcodecoding.hasSystem()) {

			s.addSrvRqstCdCdgSys(String.valueOf(servicerequestcodecoding.getSystem()));
		} else {
			s.addSrvRqstCdCdgSys("NULL");
		}

		if(servicerequestcodecodingi == servicerequestcodecodinglist.size()-1) {s.addSrvRqstCdCdgSys("]");}


		 };
		/******************** SrvRqst_Sbjct ********************************************************************************/
		if(servicerequest.hasSubject()) {

			if(servicerequest.getSubject().getReference() != null) {
			s.addSrvRqstSbjct(servicerequest.getSubject().getReference());
			}
		} else {
			s.addSrvRqstSbjct("NULL");
		}


		/******************** servicerequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.ServiceRequest.ServiceRequestStatus servicerequeststatus = servicerequest.getStatus();
		if(servicerequeststatus!=null) {
			s.addSrvRqstSts(servicerequeststatus.toCode());
		} else {
			s.addSrvRqstSts("NULL");
		}

		/******************** SrvRqst_Enc ********************************************************************************/
		if(servicerequest.hasEncounter()) {

			if(servicerequest.getEncounter().getReference() != null) {
			s.addSrvRqstEnc(servicerequest.getEncounter().getReference());
			}
		} else {
			s.addSrvRqstEnc("NULL");
		}


		/******************** SrvRqst_BasedOn ********************************************************************************/
		if(servicerequest.hasBasedOn()) {

			String  array = "[";
			for(int incr=0; incr<servicerequest.getBasedOn().size(); incr++) {
				array = array + servicerequest.getBasedOn().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSrvRqstBasedOn(array);

		} else {
			s.addSrvRqstBasedOn("NULL");
		}


		/******************** servicerequestreasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> servicerequestreasoncodelist = servicerequest.getReasonCode();
		for(int servicerequestreasoncodei = 0; servicerequestreasoncodei<servicerequestreasoncodelist.size();servicerequestreasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  servicerequestreasoncode = servicerequestreasoncodelist.get(servicerequestreasoncodei);

		/******************** SrvRqst_RsnCd_Txt ********************************************************************************/
		if(servicerequestreasoncodei == 0) {s.addSrvRqstRsnCdTxt("[");}
		if(servicerequestreasoncode.hasText()) {

			s.addSrvRqstRsnCdTxt(String.valueOf(servicerequestreasoncode.getText()));
		} else {
			s.addSrvRqstRsnCdTxt("NULL");
		}

		if(servicerequestreasoncodei == servicerequestreasoncodelist.size()-1) {s.addSrvRqstRsnCdTxt("]");}


		/******************** servicerequestreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> servicerequestreasoncodecodinglist = servicerequestreasoncode.getCoding();
		for(int servicerequestreasoncodecodingi = 0; servicerequestreasoncodecodingi<servicerequestreasoncodecodinglist.size();servicerequestreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  servicerequestreasoncodecoding = servicerequestreasoncodecodinglist.get(servicerequestreasoncodecodingi);

		/******************** SrvRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(servicerequestreasoncodecodingi == 0) {s.addSrvRqstRsnCdCdgDsply("[[");}
		if(servicerequestreasoncodecoding.hasDisplay()) {

			s.addSrvRqstRsnCdCdgDsply(String.valueOf(servicerequestreasoncodecoding.getDisplay()));
		} else {
			s.addSrvRqstRsnCdCdgDsply("NULL");
		}

		if(servicerequestreasoncodecodingi == servicerequestreasoncodecodinglist.size()-1) {s.addSrvRqstRsnCdCdgDsply("]]");}


		/******************** SrvRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(servicerequestreasoncodecodingi == 0) {s.addSrvRqstRsnCdCdgVrsn("[[");}
		if(servicerequestreasoncodecoding.hasVersion()) {

			s.addSrvRqstRsnCdCdgVrsn(String.valueOf(servicerequestreasoncodecoding.getVersion()));
		} else {
			s.addSrvRqstRsnCdCdgVrsn("NULL");
		}

		if(servicerequestreasoncodecodingi == servicerequestreasoncodecodinglist.size()-1) {s.addSrvRqstRsnCdCdgVrsn("]]");}


		/******************** SrvRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(servicerequestreasoncodecodingi == 0) {s.addSrvRqstRsnCdCdgCd("[[");}
		if(servicerequestreasoncodecoding.hasCode()) {

			s.addSrvRqstRsnCdCdgCd(String.valueOf(servicerequestreasoncodecoding.getCode()));
		} else {
			s.addSrvRqstRsnCdCdgCd("NULL");
		}

		if(servicerequestreasoncodecodingi == servicerequestreasoncodecodinglist.size()-1) {s.addSrvRqstRsnCdCdgCd("]]");}


		/******************** SrvRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestreasoncodecodingi == 0) {s.addSrvRqstRsnCdCdgUsrSltd("[[");}
		if(servicerequestreasoncodecoding.hasUserSelected()) {

			s.addSrvRqstRsnCdCdgUsrSltd(String.valueOf(servicerequestreasoncodecoding.getUserSelected()));
		} else {
			s.addSrvRqstRsnCdCdgUsrSltd("NULL");
		}

		if(servicerequestreasoncodecodingi == servicerequestreasoncodecodinglist.size()-1) {s.addSrvRqstRsnCdCdgUsrSltd("]]");}


		/******************** SrvRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(servicerequestreasoncodecodingi == 0) {s.addSrvRqstRsnCdCdgSys("[[");}
		if(servicerequestreasoncodecoding.hasSystem()) {

			s.addSrvRqstRsnCdCdgSys(String.valueOf(servicerequestreasoncodecoding.getSystem()));
		} else {
			s.addSrvRqstRsnCdCdgSys("NULL");
		}

		if(servicerequestreasoncodecodingi == servicerequestreasoncodecodinglist.size()-1) {s.addSrvRqstRsnCdCdgSys("]]");}


		 };
		 };
		/******************** servicerequestnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> servicerequestnotelist = servicerequest.getNote();
		for(int servicerequestnotei = 0; servicerequestnotei<servicerequestnotelist.size();servicerequestnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  servicerequestnote = servicerequestnotelist.get(servicerequestnotei);

		/******************** SrvRqst_Nt_Time ********************************************************************************/
		if(servicerequestnotei == 0) {s.addSrvRqstNtTime("[");}
		if(servicerequestnote.hasTime()) {

			s.addSrvRqstNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(servicerequestnote.getTime())+"\"");
		} else {
			s.addSrvRqstNtTime("NULL");
		}

		if(servicerequestnotei == servicerequestnotelist.size()-1) {s.addSrvRqstNtTime("]");}


		/******************** SrvRqst_Nt_AthrRfrnc ********************************************************************************/
		if(servicerequestnotei == 0) {s.addSrvRqstNtAthrRfrnc("[");}
		if(servicerequestnote.hasAuthorReference()) {

			if(servicerequestnote.getAuthorReference().getReference() != null) {
			s.addSrvRqstNtAthrRfrnc(servicerequestnote.getAuthorReference().getReference());
			}
		} else {
			s.addSrvRqstNtAthrRfrnc("NULL");
		}

		if(servicerequestnotei == servicerequestnotelist.size()-1) {s.addSrvRqstNtAthrRfrnc("]");}


		/******************** SrvRqst_Nt_Txt ********************************************************************************/
		if(servicerequestnotei == 0) {s.addSrvRqstNtTxt("[");}
		if(servicerequestnote.hasText()) {

			s.addSrvRqstNtTxt(String.valueOf(servicerequestnote.getText()));
		} else {
			s.addSrvRqstNtTxt("NULL");
		}

		if(servicerequestnotei == servicerequestnotelist.size()-1) {s.addSrvRqstNtTxt("]");}


		/******************** SrvRqst_Nt_AthrStrgTyp ********************************************************************************/
		if(servicerequestnotei == 0) {s.addSrvRqstNtAthrStrgTyp("[");}
		if(servicerequestnote.hasAuthorStringType()) {

			s.addSrvRqstNtAthrStrgTyp("\""+servicerequestnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			s.addSrvRqstNtAthrStrgTyp("NULL");
		}

		if(servicerequestnotei == servicerequestnotelist.size()-1) {s.addSrvRqstNtAthrStrgTyp("]");}


		 };
		/******************** SrvRqst_RsnRfrnc ********************************************************************************/
		if(servicerequest.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<servicerequest.getReasonReference().size(); incr++) {
				array = array + servicerequest.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSrvRqstRsnRfrnc(array);

		} else {
			s.addSrvRqstRsnRfrnc("NULL");
		}


		/******************** servicerequestidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> servicerequestidentifierlist = servicerequest.getIdentifier();
		for(int servicerequestidentifieri = 0; servicerequestidentifieri<servicerequestidentifierlist.size();servicerequestidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  servicerequestidentifier = servicerequestidentifierlist.get(servicerequestidentifieri);

		/******************** SrvRqst_Id_Vl ********************************************************************************/
		if(servicerequestidentifieri == 0) {s.addSrvRqstIdVl("[");}
		if(servicerequestidentifier.hasValue()) {

			s.addSrvRqstIdVl(String.valueOf(servicerequestidentifier.getValue()));
		} else {
			s.addSrvRqstIdVl("NULL");
		}

		if(servicerequestidentifieri == servicerequestidentifierlist.size()-1) {s.addSrvRqstIdVl("]");}


		/******************** servicerequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestidentifiertype = servicerequestidentifier.getType();

		/******************** SrvRqst_Id_Typ_Txt ********************************************************************************/
		if(servicerequestidentifieri == 0) {s.addSrvRqstIdTypTxt("[");}
		if(servicerequestidentifiertype.hasText()) {

			s.addSrvRqstIdTypTxt(String.valueOf(servicerequestidentifiertype.getText()));
		} else {
			s.addSrvRqstIdTypTxt("NULL");
		}

		if(servicerequestidentifieri == servicerequestidentifierlist.size()-1) {s.addSrvRqstIdTypTxt("]");}


		/******************** servicerequestidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> servicerequestidentifiertypecodinglist = servicerequestidentifiertype.getCoding();
		for(int servicerequestidentifiertypecodingi = 0; servicerequestidentifiertypecodingi<servicerequestidentifiertypecodinglist.size();servicerequestidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  servicerequestidentifiertypecoding = servicerequestidentifiertypecodinglist.get(servicerequestidentifiertypecodingi);

		/******************** SrvRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(servicerequestidentifiertypecodingi == 0) {s.addSrvRqstIdTypCdgDsply("[[");}
		if(servicerequestidentifiertypecoding.hasDisplay()) {

			s.addSrvRqstIdTypCdgDsply(String.valueOf(servicerequestidentifiertypecoding.getDisplay()));
		} else {
			s.addSrvRqstIdTypCdgDsply("NULL");
		}

		if(servicerequestidentifiertypecodingi == servicerequestidentifiertypecodinglist.size()-1) {s.addSrvRqstIdTypCdgDsply("]]");}


		/******************** SrvRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(servicerequestidentifiertypecodingi == 0) {s.addSrvRqstIdTypCdgVrsn("[[");}
		if(servicerequestidentifiertypecoding.hasVersion()) {

			s.addSrvRqstIdTypCdgVrsn(String.valueOf(servicerequestidentifiertypecoding.getVersion()));
		} else {
			s.addSrvRqstIdTypCdgVrsn("NULL");
		}

		if(servicerequestidentifiertypecodingi == servicerequestidentifiertypecodinglist.size()-1) {s.addSrvRqstIdTypCdgVrsn("]]");}


		/******************** SrvRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(servicerequestidentifiertypecodingi == 0) {s.addSrvRqstIdTypCdgCd("[[");}
		if(servicerequestidentifiertypecoding.hasCode()) {

			s.addSrvRqstIdTypCdgCd(String.valueOf(servicerequestidentifiertypecoding.getCode()));
		} else {
			s.addSrvRqstIdTypCdgCd("NULL");
		}

		if(servicerequestidentifiertypecodingi == servicerequestidentifiertypecodinglist.size()-1) {s.addSrvRqstIdTypCdgCd("]]");}


		/******************** SrvRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestidentifiertypecodingi == 0) {s.addSrvRqstIdTypCdgUsrSltd("[[");}
		if(servicerequestidentifiertypecoding.hasUserSelected()) {

			s.addSrvRqstIdTypCdgUsrSltd(String.valueOf(servicerequestidentifiertypecoding.getUserSelected()));
		} else {
			s.addSrvRqstIdTypCdgUsrSltd("NULL");
		}

		if(servicerequestidentifiertypecodingi == servicerequestidentifiertypecodinglist.size()-1) {s.addSrvRqstIdTypCdgUsrSltd("]]");}


		/******************** SrvRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(servicerequestidentifiertypecodingi == 0) {s.addSrvRqstIdTypCdgSys("[[");}
		if(servicerequestidentifiertypecoding.hasSystem()) {

			s.addSrvRqstIdTypCdgSys(String.valueOf(servicerequestidentifiertypecoding.getSystem()));
		} else {
			s.addSrvRqstIdTypCdgSys("NULL");
		}

		if(servicerequestidentifiertypecodingi == servicerequestidentifiertypecodinglist.size()-1) {s.addSrvRqstIdTypCdgSys("]]");}


		 };
		/******************** servicerequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period servicerequestidentifierperiod = servicerequestidentifier.getPeriod();

		/******************** SrvRqst_Id_Prd_Strt ********************************************************************************/
		if(servicerequestidentifieri == 0) {s.addSrvRqstIdPrdStrt("[");}
		if(servicerequestidentifierperiod.hasStart()) {

			s.addSrvRqstIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(servicerequestidentifierperiod.getStart())+"\"");
		} else {
			s.addSrvRqstIdPrdStrt("NULL");
		}

		if(servicerequestidentifieri == servicerequestidentifierlist.size()-1) {s.addSrvRqstIdPrdStrt("]");}


		/******************** SrvRqst_Id_Prd_End ********************************************************************************/
		if(servicerequestidentifieri == 0) {s.addSrvRqstIdPrdEnd("[");}
		if(servicerequestidentifierperiod.hasEnd()) {

			s.addSrvRqstIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(servicerequestidentifierperiod.getEnd())+"\"");
		} else {
			s.addSrvRqstIdPrdEnd("NULL");
		}

		if(servicerequestidentifieri == servicerequestidentifierlist.size()-1) {s.addSrvRqstIdPrdEnd("]");}


		/******************** servicerequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse servicerequestidentifieruse = servicerequestidentifier.getUse();
		if(servicerequestidentifieruse!=null) {
		if(servicerequestidentifieri == 0) {

		s.addSrvRqstIdUse("[");		}
			s.addSrvRqstIdUse(servicerequestidentifieruse.toCode());
		if(servicerequestidentifieri == servicerequestidentifierlist.size()-1) {

		s.addSrvRqstIdUse("]");		}

		} else {
			s.addSrvRqstIdUse("NULL");
		}

		/******************** SrvRqst_Id_Assigner ********************************************************************************/
		if(servicerequestidentifieri == 0) {s.addSrvRqstIdAssigner("[");}
		if(servicerequestidentifier.hasAssigner()) {

			if(servicerequestidentifier.getAssigner().getReference() != null) {
			s.addSrvRqstIdAssigner(servicerequestidentifier.getAssigner().getReference());
			}
		} else {
			s.addSrvRqstIdAssigner("NULL");
		}

		if(servicerequestidentifieri == servicerequestidentifierlist.size()-1) {s.addSrvRqstIdAssigner("]");}


		/******************** SrvRqst_Id_Sys ********************************************************************************/
		if(servicerequestidentifieri == 0) {s.addSrvRqstIdSys("[");}
		if(servicerequestidentifier.hasSystem()) {

			s.addSrvRqstIdSys(String.valueOf(servicerequestidentifier.getSystem()));
		} else {
			s.addSrvRqstIdSys("NULL");
		}

		if(servicerequestidentifieri == servicerequestidentifierlist.size()-1) {s.addSrvRqstIdSys("]");}


		 };
		/******************** SrvRqst_Replaces ********************************************************************************/
		if(servicerequest.hasReplaces()) {

			String  array = "[";
			for(int incr=0; incr<servicerequest.getReplaces().size(); incr++) {
				array = array + servicerequest.getReplaces().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSrvRqstReplaces(array);

		} else {
			s.addSrvRqstReplaces("NULL");
		}


		/******************** SrvRqst_InstantiatesUri ********************************************************************************/
		if(servicerequest.hasInstantiatesUri()) {

			String  array = "[";
			for(int incr=0; incr<servicerequest.getInstantiatesUri().size(); incr++) {
				array = array + servicerequest.getInstantiatesUri().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSrvRqstInstantiatesUri(array);

		} else {
			s.addSrvRqstInstantiatesUri("NULL");
		}


		/******************** servicerequestcategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> servicerequestcategorylist = servicerequest.getCategory();
		for(int servicerequestcategoryi = 0; servicerequestcategoryi<servicerequestcategorylist.size();servicerequestcategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  servicerequestcategory = servicerequestcategorylist.get(servicerequestcategoryi);

		/******************** SrvRqst_Ctgry_Txt ********************************************************************************/
		if(servicerequestcategoryi == 0) {s.addSrvRqstCtgryTxt("[");}
		if(servicerequestcategory.hasText()) {

			s.addSrvRqstCtgryTxt(String.valueOf(servicerequestcategory.getText()));
		} else {
			s.addSrvRqstCtgryTxt("NULL");
		}

		if(servicerequestcategoryi == servicerequestcategorylist.size()-1) {s.addSrvRqstCtgryTxt("]");}


		/******************** servicerequestcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> servicerequestcategorycodinglist = servicerequestcategory.getCoding();
		for(int servicerequestcategorycodingi = 0; servicerequestcategorycodingi<servicerequestcategorycodinglist.size();servicerequestcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  servicerequestcategorycoding = servicerequestcategorycodinglist.get(servicerequestcategorycodingi);

		/******************** SrvRqst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(servicerequestcategorycodingi == 0) {s.addSrvRqstCtgryCdgDsply("[[");}
		if(servicerequestcategorycoding.hasDisplay()) {

			s.addSrvRqstCtgryCdgDsply(String.valueOf(servicerequestcategorycoding.getDisplay()));
		} else {
			s.addSrvRqstCtgryCdgDsply("NULL");
		}

		if(servicerequestcategorycodingi == servicerequestcategorycodinglist.size()-1) {s.addSrvRqstCtgryCdgDsply("]]");}


		/******************** SrvRqst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(servicerequestcategorycodingi == 0) {s.addSrvRqstCtgryCdgVrsn("[[");}
		if(servicerequestcategorycoding.hasVersion()) {

			s.addSrvRqstCtgryCdgVrsn(String.valueOf(servicerequestcategorycoding.getVersion()));
		} else {
			s.addSrvRqstCtgryCdgVrsn("NULL");
		}

		if(servicerequestcategorycodingi == servicerequestcategorycodinglist.size()-1) {s.addSrvRqstCtgryCdgVrsn("]]");}


		/******************** SrvRqst_Ctgry_Cdg_Cd ********************************************************************************/
		if(servicerequestcategorycodingi == 0) {s.addSrvRqstCtgryCdgCd("[[");}
		if(servicerequestcategorycoding.hasCode()) {

			s.addSrvRqstCtgryCdgCd(String.valueOf(servicerequestcategorycoding.getCode()));
		} else {
			s.addSrvRqstCtgryCdgCd("NULL");
		}

		if(servicerequestcategorycodingi == servicerequestcategorycodinglist.size()-1) {s.addSrvRqstCtgryCdgCd("]]");}


		/******************** SrvRqst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestcategorycodingi == 0) {s.addSrvRqstCtgryCdgUsrSltd("[[");}
		if(servicerequestcategorycoding.hasUserSelected()) {

			s.addSrvRqstCtgryCdgUsrSltd(String.valueOf(servicerequestcategorycoding.getUserSelected()));
		} else {
			s.addSrvRqstCtgryCdgUsrSltd("NULL");
		}

		if(servicerequestcategorycodingi == servicerequestcategorycodinglist.size()-1) {s.addSrvRqstCtgryCdgUsrSltd("]]");}


		/******************** SrvRqst_Ctgry_Cdg_Sys ********************************************************************************/
		if(servicerequestcategorycodingi == 0) {s.addSrvRqstCtgryCdgSys("[[");}
		if(servicerequestcategorycoding.hasSystem()) {

			s.addSrvRqstCtgryCdgSys(String.valueOf(servicerequestcategorycoding.getSystem()));
		} else {
			s.addSrvRqstCtgryCdgSys("NULL");
		}

		if(servicerequestcategorycodingi == servicerequestcategorycodinglist.size()-1) {s.addSrvRqstCtgryCdgSys("]]");}


		 };
		 };
		/******************** servicerequestbodysite ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> servicerequestbodysitelist = servicerequest.getBodySite();
		for(int servicerequestbodysitei = 0; servicerequestbodysitei<servicerequestbodysitelist.size();servicerequestbodysitei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  servicerequestbodysite = servicerequestbodysitelist.get(servicerequestbodysitei);

		/******************** SrvRqst_BodySite_Txt ********************************************************************************/
		if(servicerequestbodysitei == 0) {s.addSrvRqstBodySiteTxt("[");}
		if(servicerequestbodysite.hasText()) {

			s.addSrvRqstBodySiteTxt(String.valueOf(servicerequestbodysite.getText()));
		} else {
			s.addSrvRqstBodySiteTxt("NULL");
		}

		if(servicerequestbodysitei == servicerequestbodysitelist.size()-1) {s.addSrvRqstBodySiteTxt("]");}


		/******************** servicerequestbodysitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> servicerequestbodysitecodinglist = servicerequestbodysite.getCoding();
		for(int servicerequestbodysitecodingi = 0; servicerequestbodysitecodingi<servicerequestbodysitecodinglist.size();servicerequestbodysitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  servicerequestbodysitecoding = servicerequestbodysitecodinglist.get(servicerequestbodysitecodingi);

		/******************** SrvRqst_BodySite_Cdg_Dsply ********************************************************************************/
		if(servicerequestbodysitecodingi == 0) {s.addSrvRqstBodySiteCdgDsply("[[");}
		if(servicerequestbodysitecoding.hasDisplay()) {

			s.addSrvRqstBodySiteCdgDsply(String.valueOf(servicerequestbodysitecoding.getDisplay()));
		} else {
			s.addSrvRqstBodySiteCdgDsply("NULL");
		}

		if(servicerequestbodysitecodingi == servicerequestbodysitecodinglist.size()-1) {s.addSrvRqstBodySiteCdgDsply("]]");}


		/******************** SrvRqst_BodySite_Cdg_Vrsn ********************************************************************************/
		if(servicerequestbodysitecodingi == 0) {s.addSrvRqstBodySiteCdgVrsn("[[");}
		if(servicerequestbodysitecoding.hasVersion()) {

			s.addSrvRqstBodySiteCdgVrsn(String.valueOf(servicerequestbodysitecoding.getVersion()));
		} else {
			s.addSrvRqstBodySiteCdgVrsn("NULL");
		}

		if(servicerequestbodysitecodingi == servicerequestbodysitecodinglist.size()-1) {s.addSrvRqstBodySiteCdgVrsn("]]");}


		/******************** SrvRqst_BodySite_Cdg_Cd ********************************************************************************/
		if(servicerequestbodysitecodingi == 0) {s.addSrvRqstBodySiteCdgCd("[[");}
		if(servicerequestbodysitecoding.hasCode()) {

			s.addSrvRqstBodySiteCdgCd(String.valueOf(servicerequestbodysitecoding.getCode()));
		} else {
			s.addSrvRqstBodySiteCdgCd("NULL");
		}

		if(servicerequestbodysitecodingi == servicerequestbodysitecodinglist.size()-1) {s.addSrvRqstBodySiteCdgCd("]]");}


		/******************** SrvRqst_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestbodysitecodingi == 0) {s.addSrvRqstBodySiteCdgUsrSltd("[[");}
		if(servicerequestbodysitecoding.hasUserSelected()) {

			s.addSrvRqstBodySiteCdgUsrSltd(String.valueOf(servicerequestbodysitecoding.getUserSelected()));
		} else {
			s.addSrvRqstBodySiteCdgUsrSltd("NULL");
		}

		if(servicerequestbodysitecodingi == servicerequestbodysitecodinglist.size()-1) {s.addSrvRqstBodySiteCdgUsrSltd("]]");}


		/******************** SrvRqst_BodySite_Cdg_Sys ********************************************************************************/
		if(servicerequestbodysitecodingi == 0) {s.addSrvRqstBodySiteCdgSys("[[");}
		if(servicerequestbodysitecoding.hasSystem()) {

			s.addSrvRqstBodySiteCdgSys(String.valueOf(servicerequestbodysitecoding.getSystem()));
		} else {
			s.addSrvRqstBodySiteCdgSys("NULL");
		}

		if(servicerequestbodysitecodingi == servicerequestbodysitecodinglist.size()-1) {s.addSrvRqstBodySiteCdgSys("]]");}


		 };
		 };
		/******************** SrvRqst_OccrnceDtTimeTyp ********************************************************************************/
		if(servicerequest.hasOccurrenceDateTimeType()) {

			s.addSrvRqstOccrnceDtTimeTyp("\""+servicerequest.getOccurrenceDateTimeType().getValueAsString()+"\"");
		} else {
			s.addSrvRqstOccrnceDtTimeTyp("NULL");
		}


		/******************** servicerequestoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period servicerequestoccurrenceperiod = servicerequest.getOccurrencePeriod();

		/******************** SrvRqst_OccrncePrd_Strt ********************************************************************************/
		if(servicerequestoccurrenceperiod.hasStart()) {

			s.addSrvRqstOccrncePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(servicerequestoccurrenceperiod.getStart())+"\"");
		} else {
			s.addSrvRqstOccrncePrdStrt("NULL");
		}


		/******************** SrvRqst_OccrncePrd_End ********************************************************************************/
		if(servicerequestoccurrenceperiod.hasEnd()) {

			s.addSrvRqstOccrncePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(servicerequestoccurrenceperiod.getEnd())+"\"");
		} else {
			s.addSrvRqstOccrncePrdEnd("NULL");
		}


		/******************** SrvRqst_Rqster ********************************************************************************/
		if(servicerequest.hasRequester()) {

			if(servicerequest.getRequester().getReference() != null) {
			s.addSrvRqstRqster(servicerequest.getRequester().getReference());
			}
		} else {
			s.addSrvRqstRqster("NULL");
		}


		/******************** servicerequestperformertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestperformertype = servicerequest.getPerformerType();

		/******************** SrvRqst_PrfrmrTyp_Txt ********************************************************************************/
		if(servicerequestperformertype.hasText()) {

			s.addSrvRqstPrfrmrTypTxt(String.valueOf(servicerequestperformertype.getText()));
		} else {
			s.addSrvRqstPrfrmrTypTxt("NULL");
		}


		/******************** servicerequestperformertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> servicerequestperformertypecodinglist = servicerequestperformertype.getCoding();
		for(int servicerequestperformertypecodingi = 0; servicerequestperformertypecodingi<servicerequestperformertypecodinglist.size();servicerequestperformertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  servicerequestperformertypecoding = servicerequestperformertypecodinglist.get(servicerequestperformertypecodingi);

		/******************** SrvRqst_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(servicerequestperformertypecodingi == 0) {s.addSrvRqstPrfrmrTypCdgDsply("[");}
		if(servicerequestperformertypecoding.hasDisplay()) {

			s.addSrvRqstPrfrmrTypCdgDsply(String.valueOf(servicerequestperformertypecoding.getDisplay()));
		} else {
			s.addSrvRqstPrfrmrTypCdgDsply("NULL");
		}

		if(servicerequestperformertypecodingi == servicerequestperformertypecodinglist.size()-1) {s.addSrvRqstPrfrmrTypCdgDsply("]");}


		/******************** SrvRqst_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(servicerequestperformertypecodingi == 0) {s.addSrvRqstPrfrmrTypCdgVrsn("[");}
		if(servicerequestperformertypecoding.hasVersion()) {

			s.addSrvRqstPrfrmrTypCdgVrsn(String.valueOf(servicerequestperformertypecoding.getVersion()));
		} else {
			s.addSrvRqstPrfrmrTypCdgVrsn("NULL");
		}

		if(servicerequestperformertypecodingi == servicerequestperformertypecodinglist.size()-1) {s.addSrvRqstPrfrmrTypCdgVrsn("]");}


		/******************** SrvRqst_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(servicerequestperformertypecodingi == 0) {s.addSrvRqstPrfrmrTypCdgCd("[");}
		if(servicerequestperformertypecoding.hasCode()) {

			s.addSrvRqstPrfrmrTypCdgCd(String.valueOf(servicerequestperformertypecoding.getCode()));
		} else {
			s.addSrvRqstPrfrmrTypCdgCd("NULL");
		}

		if(servicerequestperformertypecodingi == servicerequestperformertypecodinglist.size()-1) {s.addSrvRqstPrfrmrTypCdgCd("]");}


		/******************** SrvRqst_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestperformertypecodingi == 0) {s.addSrvRqstPrfrmrTypCdgUsrSltd("[");}
		if(servicerequestperformertypecoding.hasUserSelected()) {

			s.addSrvRqstPrfrmrTypCdgUsrSltd(String.valueOf(servicerequestperformertypecoding.getUserSelected()));
		} else {
			s.addSrvRqstPrfrmrTypCdgUsrSltd("NULL");
		}

		if(servicerequestperformertypecodingi == servicerequestperformertypecodinglist.size()-1) {s.addSrvRqstPrfrmrTypCdgUsrSltd("]");}


		/******************** SrvRqst_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(servicerequestperformertypecodingi == 0) {s.addSrvRqstPrfrmrTypCdgSys("[");}
		if(servicerequestperformertypecoding.hasSystem()) {

			s.addSrvRqstPrfrmrTypCdgSys(String.valueOf(servicerequestperformertypecoding.getSystem()));
		} else {
			s.addSrvRqstPrfrmrTypCdgSys("NULL");
		}

		if(servicerequestperformertypecodingi == servicerequestperformertypecodinglist.size()-1) {s.addSrvRqstPrfrmrTypCdgSys("]");}


		 };
		/******************** servicerequestquantityrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range servicerequestquantityrange = servicerequest.getQuantityRange();

		/******************** servicerequestquantityrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestquantityrangelow = servicerequestquantityrange.getLow();

		/******************** SrvRqst_QntyRng_Lw_Vl ********************************************************************************/
		if(servicerequestquantityrangelow.hasValue()) {

			s.addSrvRqstQntyRngLwVl(String.valueOf(servicerequestquantityrangelow.getValue()));
		} else {
			s.addSrvRqstQntyRngLwVl("NULL");
		}


		/******************** servicerequestquantityrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator servicerequestquantityrangelowcomparator = servicerequestquantityrangelow.getComparator();
		if(servicerequestquantityrangelowcomparator!=null) {
			s.addSrvRqstQntyRngLwCmprtr(servicerequestquantityrangelowcomparator.toCode());
		} else {
			s.addSrvRqstQntyRngLwCmprtr("NULL");
		}

		/******************** SrvRqst_QntyRng_Lw_Cd ********************************************************************************/
		if(servicerequestquantityrangelow.hasCode()) {

			s.addSrvRqstQntyRngLwCd(String.valueOf(servicerequestquantityrangelow.getCode()));
		} else {
			s.addSrvRqstQntyRngLwCd("NULL");
		}


		/******************** SrvRqst_QntyRng_Lw_Unt ********************************************************************************/
		if(servicerequestquantityrangelow.hasUnit()) {

			s.addSrvRqstQntyRngLwUnt(String.valueOf(servicerequestquantityrangelow.getUnit()));
		} else {
			s.addSrvRqstQntyRngLwUnt("NULL");
		}


		/******************** SrvRqst_QntyRng_Lw_Sys ********************************************************************************/
		if(servicerequestquantityrangelow.hasSystem()) {

			s.addSrvRqstQntyRngLwSys(String.valueOf(servicerequestquantityrangelow.getSystem()));
		} else {
			s.addSrvRqstQntyRngLwSys("NULL");
		}


		/******************** servicerequestquantityrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestquantityrangehigh = servicerequestquantityrange.getHigh();

		/******************** SrvRqst_QntyRng_Hi_Vl ********************************************************************************/
		if(servicerequestquantityrangehigh.hasValue()) {

			s.addSrvRqstQntyRngHiVl(String.valueOf(servicerequestquantityrangehigh.getValue()));
		} else {
			s.addSrvRqstQntyRngHiVl("NULL");
		}


		/******************** servicerequestquantityrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator servicerequestquantityrangehighcomparator = servicerequestquantityrangehigh.getComparator();
		if(servicerequestquantityrangehighcomparator!=null) {
			s.addSrvRqstQntyRngHiCmprtr(servicerequestquantityrangehighcomparator.toCode());
		} else {
			s.addSrvRqstQntyRngHiCmprtr("NULL");
		}

		/******************** SrvRqst_QntyRng_Hi_Cd ********************************************************************************/
		if(servicerequestquantityrangehigh.hasCode()) {

			s.addSrvRqstQntyRngHiCd(String.valueOf(servicerequestquantityrangehigh.getCode()));
		} else {
			s.addSrvRqstQntyRngHiCd("NULL");
		}


		/******************** SrvRqst_QntyRng_Hi_Unt ********************************************************************************/
		if(servicerequestquantityrangehigh.hasUnit()) {

			s.addSrvRqstQntyRngHiUnt(String.valueOf(servicerequestquantityrangehigh.getUnit()));
		} else {
			s.addSrvRqstQntyRngHiUnt("NULL");
		}


		/******************** SrvRqst_QntyRng_Hi_Sys ********************************************************************************/
		if(servicerequestquantityrangehigh.hasSystem()) {

			s.addSrvRqstQntyRngHiSys(String.valueOf(servicerequestquantityrangehigh.getSystem()));
		} else {
			s.addSrvRqstQntyRngHiSys("NULL");
		}


		/******************** servicerequestorderdetail ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> servicerequestorderdetaillist = servicerequest.getOrderDetail();
		for(int servicerequestorderdetaili = 0; servicerequestorderdetaili<servicerequestorderdetaillist.size();servicerequestorderdetaili++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  servicerequestorderdetail = servicerequestorderdetaillist.get(servicerequestorderdetaili);

		/******************** SrvRqst_OrdrDtl_Txt ********************************************************************************/
		if(servicerequestorderdetaili == 0) {s.addSrvRqstOrdrDtlTxt("[");}
		if(servicerequestorderdetail.hasText()) {

			s.addSrvRqstOrdrDtlTxt(String.valueOf(servicerequestorderdetail.getText()));
		} else {
			s.addSrvRqstOrdrDtlTxt("NULL");
		}

		if(servicerequestorderdetaili == servicerequestorderdetaillist.size()-1) {s.addSrvRqstOrdrDtlTxt("]");}


		/******************** servicerequestorderdetailcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> servicerequestorderdetailcodinglist = servicerequestorderdetail.getCoding();
		for(int servicerequestorderdetailcodingi = 0; servicerequestorderdetailcodingi<servicerequestorderdetailcodinglist.size();servicerequestorderdetailcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  servicerequestorderdetailcoding = servicerequestorderdetailcodinglist.get(servicerequestorderdetailcodingi);

		/******************** SrvRqst_OrdrDtl_Cdg_Dsply ********************************************************************************/
		if(servicerequestorderdetailcodingi == 0) {s.addSrvRqstOrdrDtlCdgDsply("[[");}
		if(servicerequestorderdetailcoding.hasDisplay()) {

			s.addSrvRqstOrdrDtlCdgDsply(String.valueOf(servicerequestorderdetailcoding.getDisplay()));
		} else {
			s.addSrvRqstOrdrDtlCdgDsply("NULL");
		}

		if(servicerequestorderdetailcodingi == servicerequestorderdetailcodinglist.size()-1) {s.addSrvRqstOrdrDtlCdgDsply("]]");}


		/******************** SrvRqst_OrdrDtl_Cdg_Vrsn ********************************************************************************/
		if(servicerequestorderdetailcodingi == 0) {s.addSrvRqstOrdrDtlCdgVrsn("[[");}
		if(servicerequestorderdetailcoding.hasVersion()) {

			s.addSrvRqstOrdrDtlCdgVrsn(String.valueOf(servicerequestorderdetailcoding.getVersion()));
		} else {
			s.addSrvRqstOrdrDtlCdgVrsn("NULL");
		}

		if(servicerequestorderdetailcodingi == servicerequestorderdetailcodinglist.size()-1) {s.addSrvRqstOrdrDtlCdgVrsn("]]");}


		/******************** SrvRqst_OrdrDtl_Cdg_Cd ********************************************************************************/
		if(servicerequestorderdetailcodingi == 0) {s.addSrvRqstOrdrDtlCdgCd("[[");}
		if(servicerequestorderdetailcoding.hasCode()) {

			s.addSrvRqstOrdrDtlCdgCd(String.valueOf(servicerequestorderdetailcoding.getCode()));
		} else {
			s.addSrvRqstOrdrDtlCdgCd("NULL");
		}

		if(servicerequestorderdetailcodingi == servicerequestorderdetailcodinglist.size()-1) {s.addSrvRqstOrdrDtlCdgCd("]]");}


		/******************** SrvRqst_OrdrDtl_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestorderdetailcodingi == 0) {s.addSrvRqstOrdrDtlCdgUsrSltd("[[");}
		if(servicerequestorderdetailcoding.hasUserSelected()) {

			s.addSrvRqstOrdrDtlCdgUsrSltd(String.valueOf(servicerequestorderdetailcoding.getUserSelected()));
		} else {
			s.addSrvRqstOrdrDtlCdgUsrSltd("NULL");
		}

		if(servicerequestorderdetailcodingi == servicerequestorderdetailcodinglist.size()-1) {s.addSrvRqstOrdrDtlCdgUsrSltd("]]");}


		/******************** SrvRqst_OrdrDtl_Cdg_Sys ********************************************************************************/
		if(servicerequestorderdetailcodingi == 0) {s.addSrvRqstOrdrDtlCdgSys("[[");}
		if(servicerequestorderdetailcoding.hasSystem()) {

			s.addSrvRqstOrdrDtlCdgSys(String.valueOf(servicerequestorderdetailcoding.getSystem()));
		} else {
			s.addSrvRqstOrdrDtlCdgSys("NULL");
		}

		if(servicerequestorderdetailcodingi == servicerequestorderdetailcodinglist.size()-1) {s.addSrvRqstOrdrDtlCdgSys("]]");}


		 };
		 };
		/******************** servicerequestquantityratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio servicerequestquantityratio = servicerequest.getQuantityRatio();

		/******************** servicerequestquantityrationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestquantityrationumerator = servicerequestquantityratio.getNumerator();

		/******************** SrvRqst_QntyRtio_Nmrtr_Vl ********************************************************************************/
		if(servicerequestquantityrationumerator.hasValue()) {

			s.addSrvRqstQntyRtioNmrtrVl(String.valueOf(servicerequestquantityrationumerator.getValue()));
		} else {
			s.addSrvRqstQntyRtioNmrtrVl("NULL");
		}


		/******************** servicerequestquantityrationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator servicerequestquantityrationumeratorcomparator = servicerequestquantityrationumerator.getComparator();
		if(servicerequestquantityrationumeratorcomparator!=null) {
			s.addSrvRqstQntyRtioNmrtrCmprtr(servicerequestquantityrationumeratorcomparator.toCode());
		} else {
			s.addSrvRqstQntyRtioNmrtrCmprtr("NULL");
		}

		/******************** SrvRqst_QntyRtio_Nmrtr_Cd ********************************************************************************/
		if(servicerequestquantityrationumerator.hasCode()) {

			s.addSrvRqstQntyRtioNmrtrCd(String.valueOf(servicerequestquantityrationumerator.getCode()));
		} else {
			s.addSrvRqstQntyRtioNmrtrCd("NULL");
		}


		/******************** SrvRqst_QntyRtio_Nmrtr_Unt ********************************************************************************/
		if(servicerequestquantityrationumerator.hasUnit()) {

			s.addSrvRqstQntyRtioNmrtrUnt(String.valueOf(servicerequestquantityrationumerator.getUnit()));
		} else {
			s.addSrvRqstQntyRtioNmrtrUnt("NULL");
		}


		/******************** SrvRqst_QntyRtio_Nmrtr_Sys ********************************************************************************/
		if(servicerequestquantityrationumerator.hasSystem()) {

			s.addSrvRqstQntyRtioNmrtrSys(String.valueOf(servicerequestquantityrationumerator.getSystem()));
		} else {
			s.addSrvRqstQntyRtioNmrtrSys("NULL");
		}


		/******************** servicerequestquantityratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestquantityratiodenominator = servicerequestquantityratio.getDenominator();

		/******************** SrvRqst_QntyRtio_Dnmntr_Vl ********************************************************************************/
		if(servicerequestquantityratiodenominator.hasValue()) {

			s.addSrvRqstQntyRtioDnmntrVl(String.valueOf(servicerequestquantityratiodenominator.getValue()));
		} else {
			s.addSrvRqstQntyRtioDnmntrVl("NULL");
		}


		/******************** servicerequestquantityratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator servicerequestquantityratiodenominatorcomparator = servicerequestquantityratiodenominator.getComparator();
		if(servicerequestquantityratiodenominatorcomparator!=null) {
			s.addSrvRqstQntyRtioDnmntrCmprtr(servicerequestquantityratiodenominatorcomparator.toCode());
		} else {
			s.addSrvRqstQntyRtioDnmntrCmprtr("NULL");
		}

		/******************** SrvRqst_QntyRtio_Dnmntr_Cd ********************************************************************************/
		if(servicerequestquantityratiodenominator.hasCode()) {

			s.addSrvRqstQntyRtioDnmntrCd(String.valueOf(servicerequestquantityratiodenominator.getCode()));
		} else {
			s.addSrvRqstQntyRtioDnmntrCd("NULL");
		}


		/******************** SrvRqst_QntyRtio_Dnmntr_Unt ********************************************************************************/
		if(servicerequestquantityratiodenominator.hasUnit()) {

			s.addSrvRqstQntyRtioDnmntrUnt(String.valueOf(servicerequestquantityratiodenominator.getUnit()));
		} else {
			s.addSrvRqstQntyRtioDnmntrUnt("NULL");
		}


		/******************** SrvRqst_QntyRtio_Dnmntr_Sys ********************************************************************************/
		if(servicerequestquantityratiodenominator.hasSystem()) {

			s.addSrvRqstQntyRtioDnmntrSys(String.valueOf(servicerequestquantityratiodenominator.getSystem()));
		} else {
			s.addSrvRqstQntyRtioDnmntrSys("NULL");
		}


		/******************** servicerequestrequisition ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier servicerequestrequisition = servicerequest.getRequisition();

		/******************** SrvRqst_Requisition_Vl ********************************************************************************/
		if(servicerequestrequisition.hasValue()) {

			s.addSrvRqstRequisitionVl(String.valueOf(servicerequestrequisition.getValue()));
		} else {
			s.addSrvRqstRequisitionVl("NULL");
		}


		/******************** servicerequestrequisitiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestrequisitiontype = servicerequestrequisition.getType();

		/******************** SrvRqst_Requisition_Typ_Txt ********************************************************************************/
		if(servicerequestrequisitiontype.hasText()) {

			s.addSrvRqstRequisitionTypTxt(String.valueOf(servicerequestrequisitiontype.getText()));
		} else {
			s.addSrvRqstRequisitionTypTxt("NULL");
		}


		/******************** servicerequestrequisitiontypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> servicerequestrequisitiontypecodinglist = servicerequestrequisitiontype.getCoding();
		for(int servicerequestrequisitiontypecodingi = 0; servicerequestrequisitiontypecodingi<servicerequestrequisitiontypecodinglist.size();servicerequestrequisitiontypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  servicerequestrequisitiontypecoding = servicerequestrequisitiontypecodinglist.get(servicerequestrequisitiontypecodingi);

		/******************** SrvRqst_Requisition_Typ_Cdg_Dsply ********************************************************************************/
		if(servicerequestrequisitiontypecodingi == 0) {s.addSrvRqstRequisitionTypCdgDsply("[");}
		if(servicerequestrequisitiontypecoding.hasDisplay()) {

			s.addSrvRqstRequisitionTypCdgDsply(String.valueOf(servicerequestrequisitiontypecoding.getDisplay()));
		} else {
			s.addSrvRqstRequisitionTypCdgDsply("NULL");
		}

		if(servicerequestrequisitiontypecodingi == servicerequestrequisitiontypecodinglist.size()-1) {s.addSrvRqstRequisitionTypCdgDsply("]");}


		/******************** SrvRqst_Requisition_Typ_Cdg_Vrsn ********************************************************************************/
		if(servicerequestrequisitiontypecodingi == 0) {s.addSrvRqstRequisitionTypCdgVrsn("[");}
		if(servicerequestrequisitiontypecoding.hasVersion()) {

			s.addSrvRqstRequisitionTypCdgVrsn(String.valueOf(servicerequestrequisitiontypecoding.getVersion()));
		} else {
			s.addSrvRqstRequisitionTypCdgVrsn("NULL");
		}

		if(servicerequestrequisitiontypecodingi == servicerequestrequisitiontypecodinglist.size()-1) {s.addSrvRqstRequisitionTypCdgVrsn("]");}


		/******************** SrvRqst_Requisition_Typ_Cdg_Cd ********************************************************************************/
		if(servicerequestrequisitiontypecodingi == 0) {s.addSrvRqstRequisitionTypCdgCd("[");}
		if(servicerequestrequisitiontypecoding.hasCode()) {

			s.addSrvRqstRequisitionTypCdgCd(String.valueOf(servicerequestrequisitiontypecoding.getCode()));
		} else {
			s.addSrvRqstRequisitionTypCdgCd("NULL");
		}

		if(servicerequestrequisitiontypecodingi == servicerequestrequisitiontypecodinglist.size()-1) {s.addSrvRqstRequisitionTypCdgCd("]");}


		/******************** SrvRqst_Requisition_Typ_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestrequisitiontypecodingi == 0) {s.addSrvRqstRequisitionTypCdgUsrSltd("[");}
		if(servicerequestrequisitiontypecoding.hasUserSelected()) {

			s.addSrvRqstRequisitionTypCdgUsrSltd(String.valueOf(servicerequestrequisitiontypecoding.getUserSelected()));
		} else {
			s.addSrvRqstRequisitionTypCdgUsrSltd("NULL");
		}

		if(servicerequestrequisitiontypecodingi == servicerequestrequisitiontypecodinglist.size()-1) {s.addSrvRqstRequisitionTypCdgUsrSltd("]");}


		/******************** SrvRqst_Requisition_Typ_Cdg_Sys ********************************************************************************/
		if(servicerequestrequisitiontypecodingi == 0) {s.addSrvRqstRequisitionTypCdgSys("[");}
		if(servicerequestrequisitiontypecoding.hasSystem()) {

			s.addSrvRqstRequisitionTypCdgSys(String.valueOf(servicerequestrequisitiontypecoding.getSystem()));
		} else {
			s.addSrvRqstRequisitionTypCdgSys("NULL");
		}

		if(servicerequestrequisitiontypecodingi == servicerequestrequisitiontypecodinglist.size()-1) {s.addSrvRqstRequisitionTypCdgSys("]");}


		 };
		/******************** servicerequestrequisitionperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period servicerequestrequisitionperiod = servicerequestrequisition.getPeriod();

		/******************** SrvRqst_Requisition_Prd_Strt ********************************************************************************/
		if(servicerequestrequisitionperiod.hasStart()) {

			s.addSrvRqstRequisitionPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(servicerequestrequisitionperiod.getStart())+"\"");
		} else {
			s.addSrvRqstRequisitionPrdStrt("NULL");
		}


		/******************** SrvRqst_Requisition_Prd_End ********************************************************************************/
		if(servicerequestrequisitionperiod.hasEnd()) {

			s.addSrvRqstRequisitionPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(servicerequestrequisitionperiod.getEnd())+"\"");
		} else {
			s.addSrvRqstRequisitionPrdEnd("NULL");
		}


		/******************** servicerequestrequisitionuse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse servicerequestrequisitionuse = servicerequestrequisition.getUse();
		if(servicerequestrequisitionuse!=null) {
			s.addSrvRqstRequisitionUse(servicerequestrequisitionuse.toCode());
		} else {
			s.addSrvRqstRequisitionUse("NULL");
		}

		/******************** SrvRqst_Requisition_Assigner ********************************************************************************/
		if(servicerequestrequisition.hasAssigner()) {

			if(servicerequestrequisition.getAssigner().getReference() != null) {
			s.addSrvRqstRequisitionAssigner(servicerequestrequisition.getAssigner().getReference());
			}
		} else {
			s.addSrvRqstRequisitionAssigner("NULL");
		}


		/******************** SrvRqst_Requisition_Sys ********************************************************************************/
		if(servicerequestrequisition.hasSystem()) {

			s.addSrvRqstRequisitionSys(String.valueOf(servicerequestrequisition.getSystem()));
		} else {
			s.addSrvRqstRequisitionSys("NULL");
		}


		/******************** servicerequestlocationcode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> servicerequestlocationcodelist = servicerequest.getLocationCode();
		for(int servicerequestlocationcodei = 0; servicerequestlocationcodei<servicerequestlocationcodelist.size();servicerequestlocationcodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  servicerequestlocationcode = servicerequestlocationcodelist.get(servicerequestlocationcodei);

		/******************** SrvRqst_LctnCd_Txt ********************************************************************************/
		if(servicerequestlocationcodei == 0) {s.addSrvRqstLctnCdTxt("[");}
		if(servicerequestlocationcode.hasText()) {

			s.addSrvRqstLctnCdTxt(String.valueOf(servicerequestlocationcode.getText()));
		} else {
			s.addSrvRqstLctnCdTxt("NULL");
		}

		if(servicerequestlocationcodei == servicerequestlocationcodelist.size()-1) {s.addSrvRqstLctnCdTxt("]");}


		/******************** servicerequestlocationcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> servicerequestlocationcodecodinglist = servicerequestlocationcode.getCoding();
		for(int servicerequestlocationcodecodingi = 0; servicerequestlocationcodecodingi<servicerequestlocationcodecodinglist.size();servicerequestlocationcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  servicerequestlocationcodecoding = servicerequestlocationcodecodinglist.get(servicerequestlocationcodecodingi);

		/******************** SrvRqst_LctnCd_Cdg_Dsply ********************************************************************************/
		if(servicerequestlocationcodecodingi == 0) {s.addSrvRqstLctnCdCdgDsply("[[");}
		if(servicerequestlocationcodecoding.hasDisplay()) {

			s.addSrvRqstLctnCdCdgDsply(String.valueOf(servicerequestlocationcodecoding.getDisplay()));
		} else {
			s.addSrvRqstLctnCdCdgDsply("NULL");
		}

		if(servicerequestlocationcodecodingi == servicerequestlocationcodecodinglist.size()-1) {s.addSrvRqstLctnCdCdgDsply("]]");}


		/******************** SrvRqst_LctnCd_Cdg_Vrsn ********************************************************************************/
		if(servicerequestlocationcodecodingi == 0) {s.addSrvRqstLctnCdCdgVrsn("[[");}
		if(servicerequestlocationcodecoding.hasVersion()) {

			s.addSrvRqstLctnCdCdgVrsn(String.valueOf(servicerequestlocationcodecoding.getVersion()));
		} else {
			s.addSrvRqstLctnCdCdgVrsn("NULL");
		}

		if(servicerequestlocationcodecodingi == servicerequestlocationcodecodinglist.size()-1) {s.addSrvRqstLctnCdCdgVrsn("]]");}


		/******************** SrvRqst_LctnCd_Cdg_Cd ********************************************************************************/
		if(servicerequestlocationcodecodingi == 0) {s.addSrvRqstLctnCdCdgCd("[[");}
		if(servicerequestlocationcodecoding.hasCode()) {

			s.addSrvRqstLctnCdCdgCd(String.valueOf(servicerequestlocationcodecoding.getCode()));
		} else {
			s.addSrvRqstLctnCdCdgCd("NULL");
		}

		if(servicerequestlocationcodecodingi == servicerequestlocationcodecodinglist.size()-1) {s.addSrvRqstLctnCdCdgCd("]]");}


		/******************** SrvRqst_LctnCd_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestlocationcodecodingi == 0) {s.addSrvRqstLctnCdCdgUsrSltd("[[");}
		if(servicerequestlocationcodecoding.hasUserSelected()) {

			s.addSrvRqstLctnCdCdgUsrSltd(String.valueOf(servicerequestlocationcodecoding.getUserSelected()));
		} else {
			s.addSrvRqstLctnCdCdgUsrSltd("NULL");
		}

		if(servicerequestlocationcodecodingi == servicerequestlocationcodecodinglist.size()-1) {s.addSrvRqstLctnCdCdgUsrSltd("]]");}


		/******************** SrvRqst_LctnCd_Cdg_Sys ********************************************************************************/
		if(servicerequestlocationcodecodingi == 0) {s.addSrvRqstLctnCdCdgSys("[[");}
		if(servicerequestlocationcodecoding.hasSystem()) {

			s.addSrvRqstLctnCdCdgSys(String.valueOf(servicerequestlocationcodecoding.getSystem()));
		} else {
			s.addSrvRqstLctnCdCdgSys("NULL");
		}

		if(servicerequestlocationcodecodingi == servicerequestlocationcodecodinglist.size()-1) {s.addSrvRqstLctnCdCdgSys("]]");}


		 };
		 };
		/******************** servicerequestoccurrencetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing servicerequestoccurrencetiming = servicerequest.getOccurrenceTiming();

		/******************** servicerequestoccurrencetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestoccurrencetimingcode = servicerequestoccurrencetiming.getCode();

		/******************** SrvRqst_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(servicerequestoccurrencetimingcode.hasText()) {

			s.addSrvRqstOccrnceTmgCdTxt(String.valueOf(servicerequestoccurrencetimingcode.getText()));
		} else {
			s.addSrvRqstOccrnceTmgCdTxt("NULL");
		}


		/******************** servicerequestoccurrencetimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> servicerequestoccurrencetimingcodecodinglist = servicerequestoccurrencetimingcode.getCoding();
		for(int servicerequestoccurrencetimingcodecodingi = 0; servicerequestoccurrencetimingcodecodingi<servicerequestoccurrencetimingcodecodinglist.size();servicerequestoccurrencetimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  servicerequestoccurrencetimingcodecoding = servicerequestoccurrencetimingcodecodinglist.get(servicerequestoccurrencetimingcodecodingi);

		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(servicerequestoccurrencetimingcodecodingi == 0) {s.addSrvRqstOccrnceTmgCdCdgDsply("[");}
		if(servicerequestoccurrencetimingcodecoding.hasDisplay()) {

			s.addSrvRqstOccrnceTmgCdCdgDsply(String.valueOf(servicerequestoccurrencetimingcodecoding.getDisplay()));
		} else {
			s.addSrvRqstOccrnceTmgCdCdgDsply("NULL");
		}

		if(servicerequestoccurrencetimingcodecodingi == servicerequestoccurrencetimingcodecodinglist.size()-1) {s.addSrvRqstOccrnceTmgCdCdgDsply("]");}


		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(servicerequestoccurrencetimingcodecodingi == 0) {s.addSrvRqstOccrnceTmgCdCdgVrsn("[");}
		if(servicerequestoccurrencetimingcodecoding.hasVersion()) {

			s.addSrvRqstOccrnceTmgCdCdgVrsn(String.valueOf(servicerequestoccurrencetimingcodecoding.getVersion()));
		} else {
			s.addSrvRqstOccrnceTmgCdCdgVrsn("NULL");
		}

		if(servicerequestoccurrencetimingcodecodingi == servicerequestoccurrencetimingcodecodinglist.size()-1) {s.addSrvRqstOccrnceTmgCdCdgVrsn("]");}


		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(servicerequestoccurrencetimingcodecodingi == 0) {s.addSrvRqstOccrnceTmgCdCdgCd("[");}
		if(servicerequestoccurrencetimingcodecoding.hasCode()) {

			s.addSrvRqstOccrnceTmgCdCdgCd(String.valueOf(servicerequestoccurrencetimingcodecoding.getCode()));
		} else {
			s.addSrvRqstOccrnceTmgCdCdgCd("NULL");
		}

		if(servicerequestoccurrencetimingcodecodingi == servicerequestoccurrencetimingcodecodinglist.size()-1) {s.addSrvRqstOccrnceTmgCdCdgCd("]");}


		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestoccurrencetimingcodecodingi == 0) {s.addSrvRqstOccrnceTmgCdCdgUsrSltd("[");}
		if(servicerequestoccurrencetimingcodecoding.hasUserSelected()) {

			s.addSrvRqstOccrnceTmgCdCdgUsrSltd(String.valueOf(servicerequestoccurrencetimingcodecoding.getUserSelected()));
		} else {
			s.addSrvRqstOccrnceTmgCdCdgUsrSltd("NULL");
		}

		if(servicerequestoccurrencetimingcodecodingi == servicerequestoccurrencetimingcodecodinglist.size()-1) {s.addSrvRqstOccrnceTmgCdCdgUsrSltd("]");}


		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(servicerequestoccurrencetimingcodecodingi == 0) {s.addSrvRqstOccrnceTmgCdCdgSys("[");}
		if(servicerequestoccurrencetimingcodecoding.hasSystem()) {

			s.addSrvRqstOccrnceTmgCdCdgSys(String.valueOf(servicerequestoccurrencetimingcodecoding.getSystem()));
		} else {
			s.addSrvRqstOccrnceTmgCdCdgSys("NULL");
		}

		if(servicerequestoccurrencetimingcodecodingi == servicerequestoccurrencetimingcodecodinglist.size()-1) {s.addSrvRqstOccrnceTmgCdCdgSys("]");}


		 };
		/******************** SrvRqst_OccrnceTmg_Evnt ********************************************************************************/
		if(servicerequestoccurrencetiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<servicerequestoccurrencetiming.getEvent().size(); incr++) {
				array = array + servicerequestoccurrencetiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSrvRqstOccrnceTmgEvnt(array);

		} else {
			s.addSrvRqstOccrnceTmgEvnt("NULL");
		}


		/******************** servicerequestoccurrencetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent servicerequestoccurrencetimingrepeat = servicerequestoccurrencetiming.getRepeat();

		/******************** SrvRqst_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(servicerequestoccurrencetimingrepeat.hasOffset()) {

			s.addSrvRqstOccrnceTmgRptOff(String.valueOf(servicerequestoccurrencetimingrepeat.getOffset()));
		} else {
			s.addSrvRqstOccrnceTmgRptOff("NULL");
		}


		/******************** SrvRqst_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(servicerequestoccurrencetimingrepeat.hasCount()) {

			s.addSrvRqstOccrnceTmgRptCnt(String.valueOf(servicerequestoccurrencetimingrepeat.getCount()));
		} else {
			s.addSrvRqstOccrnceTmgRptCnt("NULL");
		}


		/******************** SrvRqst_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(servicerequestoccurrencetimingrepeat.hasPeriod()) {

			s.addSrvRqstOccrnceTmgRptPrd(String.valueOf(servicerequestoccurrencetimingrepeat.getPeriod()));
		} else {
			s.addSrvRqstOccrnceTmgRptPrd("NULL");
		}


		/******************** SrvRqst_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(servicerequestoccurrencetimingrepeat.hasCountMax()) {

			s.addSrvRqstOccrnceTmgRptCntMx(String.valueOf(servicerequestoccurrencetimingrepeat.getCountMax()));
		} else {
			s.addSrvRqstOccrnceTmgRptCntMx("NULL");
		}


		/******************** SrvRqst_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(servicerequestoccurrencetimingrepeat.hasDurationMax()) {

			s.addSrvRqstOccrnceTmgRptDurationMx(String.valueOf(servicerequestoccurrencetimingrepeat.getDurationMax()));
		} else {
			s.addSrvRqstOccrnceTmgRptDurationMx("NULL");
		}


		/******************** servicerequestoccurrencetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period servicerequestoccurrencetimingrepeatboundsperiod = servicerequestoccurrencetimingrepeat.getBoundsPeriod();

		/******************** SrvRqst_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsperiod.hasStart()) {

			s.addSrvRqstOccrnceTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(servicerequestoccurrencetimingrepeatboundsperiod.getStart())+"\"");
		} else {
			s.addSrvRqstOccrnceTmgRptBndsPrdStrt("NULL");
		}


		/******************** SrvRqst_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsperiod.hasEnd()) {

			s.addSrvRqstOccrnceTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(servicerequestoccurrencetimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			s.addSrvRqstOccrnceTmgRptBndsPrdEnd("NULL");
		}


		/******************** servicerequestoccurrencetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime servicerequestoccurrencetimingrepeatdurationunit = servicerequestoccurrencetimingrepeat.getDurationUnit();
		if(servicerequestoccurrencetimingrepeatdurationunit!=null) {
			s.addSrvRqstOccrnceTmgRptDurationUnt(servicerequestoccurrencetimingrepeatdurationunit.toCode());
		} else {
			s.addSrvRqstOccrnceTmgRptDurationUnt("NULL");
		}

		/******************** servicerequestoccurrencetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration servicerequestoccurrencetimingrepeatboundsduration = servicerequestoccurrencetimingrepeat.getBoundsDuration();

		/******************** SrvRqst_OccrnceTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsduration.hasValue()) {

			s.addSrvRqstOccrnceTmgRptBndsDurationVl(String.valueOf(servicerequestoccurrencetimingrepeatboundsduration.getValue()));
		} else {
			s.addSrvRqstOccrnceTmgRptBndsDurationVl("NULL");
		}


		/******************** servicerequestoccurrencetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator servicerequestoccurrencetimingrepeatboundsdurationcomparator = servicerequestoccurrencetimingrepeatboundsduration.getComparator();
		if(servicerequestoccurrencetimingrepeatboundsdurationcomparator!=null) {
			s.addSrvRqstOccrnceTmgRptBndsDurationCmprtr(servicerequestoccurrencetimingrepeatboundsdurationcomparator.toCode());
		} else {
			s.addSrvRqstOccrnceTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** SrvRqst_OccrnceTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsduration.hasCode()) {

			s.addSrvRqstOccrnceTmgRptBndsDurationCd(String.valueOf(servicerequestoccurrencetimingrepeatboundsduration.getCode()));
		} else {
			s.addSrvRqstOccrnceTmgRptBndsDurationCd("NULL");
		}


		/******************** SrvRqst_OccrnceTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsduration.hasUnit()) {

			s.addSrvRqstOccrnceTmgRptBndsDurationUnt(String.valueOf(servicerequestoccurrencetimingrepeatboundsduration.getUnit()));
		} else {
			s.addSrvRqstOccrnceTmgRptBndsDurationUnt("NULL");
		}


		/******************** SrvRqst_OccrnceTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsduration.hasSystem()) {

			s.addSrvRqstOccrnceTmgRptBndsDurationSys(String.valueOf(servicerequestoccurrencetimingrepeatboundsduration.getSystem()));
		} else {
			s.addSrvRqstOccrnceTmgRptBndsDurationSys("NULL");
		}


		/******************** servicerequestoccurrencetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range servicerequestoccurrencetimingrepeatboundsrange = servicerequestoccurrencetimingrepeat.getBoundsRange();

		/******************** servicerequestoccurrencetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestoccurrencetimingrepeatboundsrangelow = servicerequestoccurrencetimingrepeatboundsrange.getLow();

		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsrangelow.hasValue()) {

			s.addSrvRqstOccrnceTmgRptBndsRngLwVl(String.valueOf(servicerequestoccurrencetimingrepeatboundsrangelow.getValue()));
		} else {
			s.addSrvRqstOccrnceTmgRptBndsRngLwVl("NULL");
		}


		/******************** servicerequestoccurrencetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator servicerequestoccurrencetimingrepeatboundsrangelowcomparator = servicerequestoccurrencetimingrepeatboundsrangelow.getComparator();
		if(servicerequestoccurrencetimingrepeatboundsrangelowcomparator!=null) {
			s.addSrvRqstOccrnceTmgRptBndsRngLwCmprtr(servicerequestoccurrencetimingrepeatboundsrangelowcomparator.toCode());
		} else {
			s.addSrvRqstOccrnceTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsrangelow.hasCode()) {

			s.addSrvRqstOccrnceTmgRptBndsRngLwCd(String.valueOf(servicerequestoccurrencetimingrepeatboundsrangelow.getCode()));
		} else {
			s.addSrvRqstOccrnceTmgRptBndsRngLwCd("NULL");
		}


		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsrangelow.hasUnit()) {

			s.addSrvRqstOccrnceTmgRptBndsRngLwUnt(String.valueOf(servicerequestoccurrencetimingrepeatboundsrangelow.getUnit()));
		} else {
			s.addSrvRqstOccrnceTmgRptBndsRngLwUnt("NULL");
		}


		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsrangelow.hasSystem()) {

			s.addSrvRqstOccrnceTmgRptBndsRngLwSys(String.valueOf(servicerequestoccurrencetimingrepeatboundsrangelow.getSystem()));
		} else {
			s.addSrvRqstOccrnceTmgRptBndsRngLwSys("NULL");
		}


		/******************** servicerequestoccurrencetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestoccurrencetimingrepeatboundsrangehigh = servicerequestoccurrencetimingrepeatboundsrange.getHigh();

		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsrangehigh.hasValue()) {

			s.addSrvRqstOccrnceTmgRptBndsRngHiVl(String.valueOf(servicerequestoccurrencetimingrepeatboundsrangehigh.getValue()));
		} else {
			s.addSrvRqstOccrnceTmgRptBndsRngHiVl("NULL");
		}


		/******************** servicerequestoccurrencetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator servicerequestoccurrencetimingrepeatboundsrangehighcomparator = servicerequestoccurrencetimingrepeatboundsrangehigh.getComparator();
		if(servicerequestoccurrencetimingrepeatboundsrangehighcomparator!=null) {
			s.addSrvRqstOccrnceTmgRptBndsRngHiCmprtr(servicerequestoccurrencetimingrepeatboundsrangehighcomparator.toCode());
		} else {
			s.addSrvRqstOccrnceTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsrangehigh.hasCode()) {

			s.addSrvRqstOccrnceTmgRptBndsRngHiCd(String.valueOf(servicerequestoccurrencetimingrepeatboundsrangehigh.getCode()));
		} else {
			s.addSrvRqstOccrnceTmgRptBndsRngHiCd("NULL");
		}


		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsrangehigh.hasUnit()) {

			s.addSrvRqstOccrnceTmgRptBndsRngHiUnt(String.valueOf(servicerequestoccurrencetimingrepeatboundsrangehigh.getUnit()));
		} else {
			s.addSrvRqstOccrnceTmgRptBndsRngHiUnt("NULL");
		}


		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(servicerequestoccurrencetimingrepeatboundsrangehigh.hasSystem()) {

			s.addSrvRqstOccrnceTmgRptBndsRngHiSys(String.valueOf(servicerequestoccurrencetimingrepeatboundsrangehigh.getSystem()));
		} else {
			s.addSrvRqstOccrnceTmgRptBndsRngHiSys("NULL");
		}


		/******************** SrvRqst_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(servicerequestoccurrencetimingrepeat.hasFrequencyMax()) {

			s.addSrvRqstOccrnceTmgRptFrqncyMx(String.valueOf(servicerequestoccurrencetimingrepeat.getFrequencyMax()));
		} else {
			s.addSrvRqstOccrnceTmgRptFrqncyMx("NULL");
		}


		/******************** servicerequestoccurrencetimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> servicerequestoccurrencetimingrepeatwhenlist = servicerequestoccurrencetimingrepeat.getWhen();
		for(int servicerequestoccurrencetimingrepeatwheni = 0; servicerequestoccurrencetimingrepeatwheni<servicerequestoccurrencetimingrepeatwhenlist.size();servicerequestoccurrencetimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  servicerequestoccurrencetimingrepeatwhen = servicerequestoccurrencetimingrepeatwhenlist.get(servicerequestoccurrencetimingrepeatwheni);
		if(servicerequestoccurrencetimingrepeatwhen!=null) {
			s.addSrvRqstOccrnceTmgRptWhen(servicerequestoccurrencetimingrepeatwhen.getCode());
		} else {
			s.addSrvRqstOccrnceTmgRptWhen("NULL");
		}
		 };

		/******************** servicerequestoccurrencetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime servicerequestoccurrencetimingrepeatperiodunit = servicerequestoccurrencetimingrepeat.getPeriodUnit();
		if(servicerequestoccurrencetimingrepeatperiodunit!=null) {
			s.addSrvRqstOccrnceTmgRptPrdUnt(servicerequestoccurrencetimingrepeatperiodunit.toCode());
		} else {
			s.addSrvRqstOccrnceTmgRptPrdUnt("NULL");
		}

		/******************** SrvRqst_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(servicerequestoccurrencetimingrepeat.hasPeriodMax()) {

			s.addSrvRqstOccrnceTmgRptPrdMx(String.valueOf(servicerequestoccurrencetimingrepeat.getPeriodMax()));
		} else {
			s.addSrvRqstOccrnceTmgRptPrdMx("NULL");
		}


		/******************** servicerequestoccurrencetimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> servicerequestoccurrencetimingrepeatdayofweeklist = servicerequestoccurrencetimingrepeat.getDayOfWeek();
		for(int servicerequestoccurrencetimingrepeatdayofweeki = 0; servicerequestoccurrencetimingrepeatdayofweeki<servicerequestoccurrencetimingrepeatdayofweeklist.size();servicerequestoccurrencetimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  servicerequestoccurrencetimingrepeatdayofweek = servicerequestoccurrencetimingrepeatdayofweeklist.get(servicerequestoccurrencetimingrepeatdayofweeki);
		if(servicerequestoccurrencetimingrepeatdayofweek!=null) {
			s.addSrvRqstOccrnceTmgRptDayOfWeek(servicerequestoccurrencetimingrepeatdayofweek.getCode());
		} else {
			s.addSrvRqstOccrnceTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** SrvRqst_OccrnceTmg_Rpt_TimeOfDay ********************************************************************************/
		if(servicerequestoccurrencetimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<servicerequestoccurrencetimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + servicerequestoccurrencetimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSrvRqstOccrnceTmgRptTimeOfDay(array);

		} else {
			s.addSrvRqstOccrnceTmgRptTimeOfDay("NULL");
		}


		/******************** SrvRqst_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(servicerequestoccurrencetimingrepeat.hasDuration()) {

			s.addSrvRqstOccrnceTmgRptDuration(String.valueOf(servicerequestoccurrencetimingrepeat.getDuration()));
		} else {
			s.addSrvRqstOccrnceTmgRptDuration("NULL");
		}


		/******************** SrvRqst_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(servicerequestoccurrencetimingrepeat.hasFrequency()) {

			s.addSrvRqstOccrnceTmgRptFrqncy(String.valueOf(servicerequestoccurrencetimingrepeat.getFrequency()));
		} else {
			s.addSrvRqstOccrnceTmgRptFrqncy("NULL");
		}


		/******************** SrvRqst_Prfrmr ********************************************************************************/
		if(servicerequest.hasPerformer()) {

			String  array = "[";
			for(int incr=0; incr<servicerequest.getPerformer().size(); incr++) {
				array = array + servicerequest.getPerformer().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSrvRqstPrfrmr(array);

		} else {
			s.addSrvRqstPrfrmr("NULL");
		}


		/******************** SrvRqst_PntInstrctn ********************************************************************************/
		if(servicerequest.hasPatientInstruction()) {

			s.addSrvRqstPntInstrctn(String.valueOf(servicerequest.getPatientInstruction()));
		} else {
			s.addSrvRqstPntInstrctn("NULL");
		}


		/******************** SrvRqst_SprtingInfo ********************************************************************************/
		if(servicerequest.hasSupportingInfo()) {

			String  array = "[";
			for(int incr=0; incr<servicerequest.getSupportingInfo().size(); incr++) {
				array = array + servicerequest.getSupportingInfo().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSrvRqstSprtingInfo(array);

		} else {
			s.addSrvRqstSprtingInfo("NULL");
		}


		/******************** SrvRqst_Insrnc ********************************************************************************/
		if(servicerequest.hasInsurance()) {

			String  array = "[";
			for(int incr=0; incr<servicerequest.getInsurance().size(); incr++) {
				array = array + servicerequest.getInsurance().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSrvRqstInsrnc(array);

		} else {
			s.addSrvRqstInsrnc("NULL");
		}


		/******************** SrvRqst_RelevantHis ********************************************************************************/
		if(servicerequest.hasRelevantHistory()) {

			String  array = "[";
			for(int incr=0; incr<servicerequest.getRelevantHistory().size(); incr++) {
				array = array + servicerequest.getRelevantHistory().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSrvRqstRelevantHis(array);

		} else {
			s.addSrvRqstRelevantHis("NULL");
		}


		/******************** SrvRqst_Spcmn ********************************************************************************/
		if(servicerequest.hasSpecimen()) {

			String  array = "[";
			for(int incr=0; incr<servicerequest.getSpecimen().size(); incr++) {
				array = array + servicerequest.getSpecimen().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSrvRqstSpcmn(array);

		} else {
			s.addSrvRqstSpcmn("NULL");
		}


		/******************** SrvRqst_InstantiatesCanonical ********************************************************************************/
		if(servicerequest.hasInstantiatesCanonical()) {

			String  array = "[";
			for(int incr=0; incr<servicerequest.getInstantiatesCanonical().size(); incr++) {
				array = array + servicerequest.getInstantiatesCanonical().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSrvRqstInstantiatesCanonical(array);

		} else {
			s.addSrvRqstInstantiatesCanonical("NULL");
		}


		/******************** servicerequestasneededcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept servicerequestasneededcodeableconcept = servicerequest.getAsNeededCodeableConcept();

		/******************** SrvRqst_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(servicerequestasneededcodeableconcept.hasText()) {

			s.addSrvRqstAsNdCdbleCncptTxt(String.valueOf(servicerequestasneededcodeableconcept.getText()));
		} else {
			s.addSrvRqstAsNdCdbleCncptTxt("NULL");
		}


		/******************** servicerequestasneededcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> servicerequestasneededcodeableconceptcodinglist = servicerequestasneededcodeableconcept.getCoding();
		for(int servicerequestasneededcodeableconceptcodingi = 0; servicerequestasneededcodeableconceptcodingi<servicerequestasneededcodeableconceptcodinglist.size();servicerequestasneededcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  servicerequestasneededcodeableconceptcoding = servicerequestasneededcodeableconceptcodinglist.get(servicerequestasneededcodeableconceptcodingi);

		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(servicerequestasneededcodeableconceptcodingi == 0) {s.addSrvRqstAsNdCdbleCncptCdgDsply("[");}
		if(servicerequestasneededcodeableconceptcoding.hasDisplay()) {

			s.addSrvRqstAsNdCdbleCncptCdgDsply(String.valueOf(servicerequestasneededcodeableconceptcoding.getDisplay()));
		} else {
			s.addSrvRqstAsNdCdbleCncptCdgDsply("NULL");
		}

		if(servicerequestasneededcodeableconceptcodingi == servicerequestasneededcodeableconceptcodinglist.size()-1) {s.addSrvRqstAsNdCdbleCncptCdgDsply("]");}


		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(servicerequestasneededcodeableconceptcodingi == 0) {s.addSrvRqstAsNdCdbleCncptCdgVrsn("[");}
		if(servicerequestasneededcodeableconceptcoding.hasVersion()) {

			s.addSrvRqstAsNdCdbleCncptCdgVrsn(String.valueOf(servicerequestasneededcodeableconceptcoding.getVersion()));
		} else {
			s.addSrvRqstAsNdCdbleCncptCdgVrsn("NULL");
		}

		if(servicerequestasneededcodeableconceptcodingi == servicerequestasneededcodeableconceptcodinglist.size()-1) {s.addSrvRqstAsNdCdbleCncptCdgVrsn("]");}


		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(servicerequestasneededcodeableconceptcodingi == 0) {s.addSrvRqstAsNdCdbleCncptCdgCd("[");}
		if(servicerequestasneededcodeableconceptcoding.hasCode()) {

			s.addSrvRqstAsNdCdbleCncptCdgCd(String.valueOf(servicerequestasneededcodeableconceptcoding.getCode()));
		} else {
			s.addSrvRqstAsNdCdbleCncptCdgCd("NULL");
		}

		if(servicerequestasneededcodeableconceptcodingi == servicerequestasneededcodeableconceptcodinglist.size()-1) {s.addSrvRqstAsNdCdbleCncptCdgCd("]");}


		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(servicerequestasneededcodeableconceptcodingi == 0) {s.addSrvRqstAsNdCdbleCncptCdgUsrSltd("[");}
		if(servicerequestasneededcodeableconceptcoding.hasUserSelected()) {

			s.addSrvRqstAsNdCdbleCncptCdgUsrSltd(String.valueOf(servicerequestasneededcodeableconceptcoding.getUserSelected()));
		} else {
			s.addSrvRqstAsNdCdbleCncptCdgUsrSltd("NULL");
		}

		if(servicerequestasneededcodeableconceptcodingi == servicerequestasneededcodeableconceptcodinglist.size()-1) {s.addSrvRqstAsNdCdbleCncptCdgUsrSltd("]");}


		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(servicerequestasneededcodeableconceptcodingi == 0) {s.addSrvRqstAsNdCdbleCncptCdgSys("[");}
		if(servicerequestasneededcodeableconceptcoding.hasSystem()) {

			s.addSrvRqstAsNdCdbleCncptCdgSys(String.valueOf(servicerequestasneededcodeableconceptcoding.getSystem()));
		} else {
			s.addSrvRqstAsNdCdbleCncptCdgSys("NULL");
		}

		if(servicerequestasneededcodeableconceptcodingi == servicerequestasneededcodeableconceptcodinglist.size()-1) {s.addSrvRqstAsNdCdbleCncptCdgSys("]");}


		 };
		/******************** SrvRqst_AsNdBooleanTyp ********************************************************************************/
		if(servicerequest.hasAsNeededBooleanType()) {

			s.addSrvRqstAsNdBooleanTyp("\""+servicerequest.getAsNeededBooleanType().getValueAsString()+"\"");
		} else {
			s.addSrvRqstAsNdBooleanTyp("NULL");
		}


		/******************** SrvRqst_LctnRfrnc ********************************************************************************/
		if(servicerequest.hasLocationReference()) {

			String  array = "[";
			for(int incr=0; incr<servicerequest.getLocationReference().size(); incr++) {
				array = array + servicerequest.getLocationReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSrvRqstLctnRfrnc(array);

		} else {
			s.addSrvRqstLctnRfrnc("NULL");
		}


		/******************** servicerequestquantityquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity servicerequestquantityquantity = servicerequest.getQuantityQuantity();

		/******************** SrvRqst_QntyQnty_Vl ********************************************************************************/
		if(servicerequestquantityquantity.hasValue()) {

			s.addSrvRqstQntyQntyVl(String.valueOf(servicerequestquantityquantity.getValue()));
		} else {
			s.addSrvRqstQntyQntyVl("NULL");
		}


		/******************** servicerequestquantityquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator servicerequestquantityquantitycomparator = servicerequestquantityquantity.getComparator();
		if(servicerequestquantityquantitycomparator!=null) {
			s.addSrvRqstQntyQntyCmprtr(servicerequestquantityquantitycomparator.toCode());
		} else {
			s.addSrvRqstQntyQntyCmprtr("NULL");
		}

		/******************** SrvRqst_QntyQnty_Cd ********************************************************************************/
		if(servicerequestquantityquantity.hasCode()) {

			s.addSrvRqstQntyQntyCd(String.valueOf(servicerequestquantityquantity.getCode()));
		} else {
			s.addSrvRqstQntyQntyCd("NULL");
		}


		/******************** SrvRqst_QntyQnty_Unt ********************************************************************************/
		if(servicerequestquantityquantity.hasUnit()) {

			s.addSrvRqstQntyQntyUnt(String.valueOf(servicerequestquantityquantity.getUnit()));
		} else {
			s.addSrvRqstQntyQntyUnt("NULL");
		}


		/******************** SrvRqst_QntyQnty_Sys ********************************************************************************/
		if(servicerequestquantityquantity.hasSystem()) {

			s.addSrvRqstQntyQntySys(String.valueOf(servicerequestquantityquantity.getSystem()));
		} else {
			s.addSrvRqstQntyQntySys("NULL");
		}


		/******************** SrvRqst_AthredOn ********************************************************************************/
		if(servicerequest.hasAuthoredOn()) {

			s.addSrvRqstAthredOn("\""+ca.uhn.fhir.util.DateUtils.formatDate(servicerequest.getAuthoredOn())+"\"");
		} else {
			s.addSrvRqstAthredOn("NULL");
		}


		/******************** servicerequestintent ********************************************************************************/
		org.hl7.fhir.r4.model.ServiceRequest.ServiceRequestIntent servicerequestintent = servicerequest.getIntent();
		if(servicerequestintent!=null) {
			s.addSrvRqstIntent(servicerequestintent.toCode());
		} else {
			s.addSrvRqstIntent("NULL");
		}

		/******************** SrvRqst_DoNotPerform ********************************************************************************/
		if(servicerequest.hasDoNotPerform()) {

			s.addSrvRqstDoNotPerform(String.valueOf(servicerequest.getDoNotPerform()));
		} else {
			s.addSrvRqstDoNotPerform("NULL");
		}


		return s;
	}
}
