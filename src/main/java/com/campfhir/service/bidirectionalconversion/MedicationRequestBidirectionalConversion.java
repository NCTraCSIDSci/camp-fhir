package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationRequest;
public class MedicationRequestBidirectionalConversion 
{
	public MedicationRequest MedicationRequests(org.hl7.fhir.r4.model.MedicationRequest medicationrequest) throws ParseException
	{
		 main.java.com.campfhir.model.MedicationRequest m = new  main.java.com.campfhir.model.MedicationRequest();

		/******************** id ********************************************************************************/
		m.setId(medicationrequest.getIdElement().getIdPart());

		/******************** medicationrequestpriority ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestPriority medicationrequestpriority = medicationrequest.getPriority();
		if(medicationrequestpriority!=null) {
			m.addMdctnRqstPriority(medicationrequestpriority.toCode());
		} else {
			m.addMdctnRqstPriority("NULL");
		}

		/******************** MdctnRqst_Sbjct ********************************************************************************/
		if(medicationrequest.hasSubject()) {

			if(medicationrequest.getSubject().getReference() != null) {
			m.addMdctnRqstSbjct(medicationrequest.getSubject().getReference());
			}
		} else {
			m.addMdctnRqstSbjct("NULL");
		}


		/******************** medicationrequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestStatus medicationrequeststatus = medicationrequest.getStatus();
		if(medicationrequeststatus!=null) {
			m.addMdctnRqstSts(medicationrequeststatus.toCode());
		} else {
			m.addMdctnRqstSts("NULL");
		}

		/******************** MdctnRqst_Enc ********************************************************************************/
		if(medicationrequest.hasEncounter()) {

			if(medicationrequest.getEncounter().getReference() != null) {
			m.addMdctnRqstEnc(medicationrequest.getEncounter().getReference());
			}
		} else {
			m.addMdctnRqstEnc("NULL");
		}


		/******************** MdctnRqst_BasedOn ********************************************************************************/
		if(medicationrequest.hasBasedOn()) {

			String  array = "[";
			for(int incr=0; incr<medicationrequest.getBasedOn().size(); incr++) {
				array = array + medicationrequest.getBasedOn().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnRqstBasedOn(array);

		} else {
			m.addMdctnRqstBasedOn("NULL");
		}


		/******************** medicationrequestreasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicationrequestreasoncodelist = medicationrequest.getReasonCode();
		for(int medicationrequestreasoncodei = 0; medicationrequestreasoncodei<medicationrequestreasoncodelist.size();medicationrequestreasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicationrequestreasoncode = medicationrequestreasoncodelist.get(medicationrequestreasoncodei);

		/******************** MdctnRqst_RsnCd_Txt ********************************************************************************/
		if(medicationrequestreasoncodei == 0) {m.addMdctnRqstRsnCdTxt("[");}
		if(medicationrequestreasoncode.hasText()) {

			m.addMdctnRqstRsnCdTxt(String.valueOf(medicationrequestreasoncode.getText()));
		} else {
			m.addMdctnRqstRsnCdTxt("NULL");
		}

		if(medicationrequestreasoncodei == medicationrequestreasoncodelist.size()-1) {m.addMdctnRqstRsnCdTxt("]");}


		/******************** medicationrequestreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationrequestreasoncodecodinglist = medicationrequestreasoncode.getCoding();
		for(int medicationrequestreasoncodecodingi = 0; medicationrequestreasoncodecodingi<medicationrequestreasoncodecodinglist.size();medicationrequestreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationrequestreasoncodecoding = medicationrequestreasoncodecodinglist.get(medicationrequestreasoncodecodingi);

		/******************** MdctnRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(medicationrequestreasoncodecodingi == 0) {m.addMdctnRqstRsnCdCdgDsply("[[");}
		if(medicationrequestreasoncodecoding.hasDisplay()) {

			m.addMdctnRqstRsnCdCdgDsply(String.valueOf(medicationrequestreasoncodecoding.getDisplay()));
		} else {
			m.addMdctnRqstRsnCdCdgDsply("NULL");
		}

		if(medicationrequestreasoncodecodingi == medicationrequestreasoncodecodinglist.size()-1) {m.addMdctnRqstRsnCdCdgDsply("]]");}


		/******************** MdctnRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestreasoncodecodingi == 0) {m.addMdctnRqstRsnCdCdgVrsn("[[");}
		if(medicationrequestreasoncodecoding.hasVersion()) {

			m.addMdctnRqstRsnCdCdgVrsn(String.valueOf(medicationrequestreasoncodecoding.getVersion()));
		} else {
			m.addMdctnRqstRsnCdCdgVrsn("NULL");
		}

		if(medicationrequestreasoncodecodingi == medicationrequestreasoncodecodinglist.size()-1) {m.addMdctnRqstRsnCdCdgVrsn("]]");}


		/******************** MdctnRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(medicationrequestreasoncodecodingi == 0) {m.addMdctnRqstRsnCdCdgCd("[[");}
		if(medicationrequestreasoncodecoding.hasCode()) {

			m.addMdctnRqstRsnCdCdgCd(String.valueOf(medicationrequestreasoncodecoding.getCode()));
		} else {
			m.addMdctnRqstRsnCdCdgCd("NULL");
		}

		if(medicationrequestreasoncodecodingi == medicationrequestreasoncodecodinglist.size()-1) {m.addMdctnRqstRsnCdCdgCd("]]");}


		/******************** MdctnRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestreasoncodecodingi == 0) {m.addMdctnRqstRsnCdCdgUsrSltd("[[");}
		if(medicationrequestreasoncodecoding.hasUserSelected()) {

			m.addMdctnRqstRsnCdCdgUsrSltd(String.valueOf(medicationrequestreasoncodecoding.getUserSelected()));
		} else {
			m.addMdctnRqstRsnCdCdgUsrSltd("NULL");
		}

		if(medicationrequestreasoncodecodingi == medicationrequestreasoncodecodinglist.size()-1) {m.addMdctnRqstRsnCdCdgUsrSltd("]]");}


		/******************** MdctnRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(medicationrequestreasoncodecodingi == 0) {m.addMdctnRqstRsnCdCdgSys("[[");}
		if(medicationrequestreasoncodecoding.hasSystem()) {

			m.addMdctnRqstRsnCdCdgSys(String.valueOf(medicationrequestreasoncodecoding.getSystem()));
		} else {
			m.addMdctnRqstRsnCdCdgSys("NULL");
		}

		if(medicationrequestreasoncodecodingi == medicationrequestreasoncodecodinglist.size()-1) {m.addMdctnRqstRsnCdCdgSys("]]");}


		 };
		 };
		/******************** medicationrequestnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> medicationrequestnotelist = medicationrequest.getNote();
		for(int medicationrequestnotei = 0; medicationrequestnotei<medicationrequestnotelist.size();medicationrequestnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  medicationrequestnote = medicationrequestnotelist.get(medicationrequestnotei);

		/******************** MdctnRqst_Nt_Time ********************************************************************************/
		if(medicationrequestnotei == 0) {m.addMdctnRqstNtTime("[");}
		if(medicationrequestnote.hasTime()) {

			m.addMdctnRqstNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationrequestnote.getTime())+"\"");
		} else {
			m.addMdctnRqstNtTime("NULL");
		}

		if(medicationrequestnotei == medicationrequestnotelist.size()-1) {m.addMdctnRqstNtTime("]");}


		/******************** MdctnRqst_Nt_AthrRfrnc ********************************************************************************/
		if(medicationrequestnotei == 0) {m.addMdctnRqstNtAthrRfrnc("[");}
		if(medicationrequestnote.hasAuthorReference()) {

			if(medicationrequestnote.getAuthorReference().getReference() != null) {
			m.addMdctnRqstNtAthrRfrnc(medicationrequestnote.getAuthorReference().getReference());
			}
		} else {
			m.addMdctnRqstNtAthrRfrnc("NULL");
		}

		if(medicationrequestnotei == medicationrequestnotelist.size()-1) {m.addMdctnRqstNtAthrRfrnc("]");}


		/******************** MdctnRqst_Nt_Txt ********************************************************************************/
		if(medicationrequestnotei == 0) {m.addMdctnRqstNtTxt("[");}
		if(medicationrequestnote.hasText()) {

			m.addMdctnRqstNtTxt(String.valueOf(medicationrequestnote.getText()));
		} else {
			m.addMdctnRqstNtTxt("NULL");
		}

		if(medicationrequestnotei == medicationrequestnotelist.size()-1) {m.addMdctnRqstNtTxt("]");}


		/******************** MdctnRqst_Nt_AthrStrgTyp ********************************************************************************/
		if(medicationrequestnotei == 0) {m.addMdctnRqstNtAthrStrgTyp("[");}
		if(medicationrequestnote.hasAuthorStringType()) {

			m.addMdctnRqstNtAthrStrgTyp("\""+medicationrequestnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			m.addMdctnRqstNtAthrStrgTyp("NULL");
		}

		if(medicationrequestnotei == medicationrequestnotelist.size()-1) {m.addMdctnRqstNtAthrStrgTyp("]");}


		 };
		/******************** MdctnRqst_RsnRfrnc ********************************************************************************/
		if(medicationrequest.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<medicationrequest.getReasonReference().size(); incr++) {
				array = array + medicationrequest.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnRqstRsnRfrnc(array);

		} else {
			m.addMdctnRqstRsnRfrnc("NULL");
		}


		/******************** medicationrequestidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> medicationrequestidentifierlist = medicationrequest.getIdentifier();
		for(int medicationrequestidentifieri = 0; medicationrequestidentifieri<medicationrequestidentifierlist.size();medicationrequestidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  medicationrequestidentifier = medicationrequestidentifierlist.get(medicationrequestidentifieri);

		/******************** MdctnRqst_Id_Vl ********************************************************************************/
		if(medicationrequestidentifieri == 0) {m.addMdctnRqstIdVl("[");}
		if(medicationrequestidentifier.hasValue()) {

			m.addMdctnRqstIdVl(String.valueOf(medicationrequestidentifier.getValue()));
		} else {
			m.addMdctnRqstIdVl("NULL");
		}

		if(medicationrequestidentifieri == medicationrequestidentifierlist.size()-1) {m.addMdctnRqstIdVl("]");}


		/******************** medicationrequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestidentifiertype = medicationrequestidentifier.getType();

		/******************** MdctnRqst_Id_Typ_Txt ********************************************************************************/
		if(medicationrequestidentifieri == 0) {m.addMdctnRqstIdTypTxt("[");}
		if(medicationrequestidentifiertype.hasText()) {

			m.addMdctnRqstIdTypTxt(String.valueOf(medicationrequestidentifiertype.getText()));
		} else {
			m.addMdctnRqstIdTypTxt("NULL");
		}

		if(medicationrequestidentifieri == medicationrequestidentifierlist.size()-1) {m.addMdctnRqstIdTypTxt("]");}


		/******************** medicationrequestidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationrequestidentifiertypecodinglist = medicationrequestidentifiertype.getCoding();
		for(int medicationrequestidentifiertypecodingi = 0; medicationrequestidentifiertypecodingi<medicationrequestidentifiertypecodinglist.size();medicationrequestidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationrequestidentifiertypecoding = medicationrequestidentifiertypecodinglist.get(medicationrequestidentifiertypecodingi);

		/******************** MdctnRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationrequestidentifiertypecodingi == 0) {m.addMdctnRqstIdTypCdgDsply("[[");}
		if(medicationrequestidentifiertypecoding.hasDisplay()) {

			m.addMdctnRqstIdTypCdgDsply(String.valueOf(medicationrequestidentifiertypecoding.getDisplay()));
		} else {
			m.addMdctnRqstIdTypCdgDsply("NULL");
		}

		if(medicationrequestidentifiertypecodingi == medicationrequestidentifiertypecodinglist.size()-1) {m.addMdctnRqstIdTypCdgDsply("]]");}


		/******************** MdctnRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestidentifiertypecodingi == 0) {m.addMdctnRqstIdTypCdgVrsn("[[");}
		if(medicationrequestidentifiertypecoding.hasVersion()) {

			m.addMdctnRqstIdTypCdgVrsn(String.valueOf(medicationrequestidentifiertypecoding.getVersion()));
		} else {
			m.addMdctnRqstIdTypCdgVrsn("NULL");
		}

		if(medicationrequestidentifiertypecodingi == medicationrequestidentifiertypecodinglist.size()-1) {m.addMdctnRqstIdTypCdgVrsn("]]");}


		/******************** MdctnRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicationrequestidentifiertypecodingi == 0) {m.addMdctnRqstIdTypCdgCd("[[");}
		if(medicationrequestidentifiertypecoding.hasCode()) {

			m.addMdctnRqstIdTypCdgCd(String.valueOf(medicationrequestidentifiertypecoding.getCode()));
		} else {
			m.addMdctnRqstIdTypCdgCd("NULL");
		}

		if(medicationrequestidentifiertypecodingi == medicationrequestidentifiertypecodinglist.size()-1) {m.addMdctnRqstIdTypCdgCd("]]");}


		/******************** MdctnRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestidentifiertypecodingi == 0) {m.addMdctnRqstIdTypCdgUsrSltd("[[");}
		if(medicationrequestidentifiertypecoding.hasUserSelected()) {

			m.addMdctnRqstIdTypCdgUsrSltd(String.valueOf(medicationrequestidentifiertypecoding.getUserSelected()));
		} else {
			m.addMdctnRqstIdTypCdgUsrSltd("NULL");
		}

		if(medicationrequestidentifiertypecodingi == medicationrequestidentifiertypecodinglist.size()-1) {m.addMdctnRqstIdTypCdgUsrSltd("]]");}


		/******************** MdctnRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicationrequestidentifiertypecodingi == 0) {m.addMdctnRqstIdTypCdgSys("[[");}
		if(medicationrequestidentifiertypecoding.hasSystem()) {

			m.addMdctnRqstIdTypCdgSys(String.valueOf(medicationrequestidentifiertypecoding.getSystem()));
		} else {
			m.addMdctnRqstIdTypCdgSys("NULL");
		}

		if(medicationrequestidentifiertypecodingi == medicationrequestidentifiertypecodinglist.size()-1) {m.addMdctnRqstIdTypCdgSys("]]");}


		 };
		/******************** medicationrequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationrequestidentifierperiod = medicationrequestidentifier.getPeriod();

		/******************** MdctnRqst_Id_Prd_Strt ********************************************************************************/
		if(medicationrequestidentifieri == 0) {m.addMdctnRqstIdPrdStrt("[");}
		if(medicationrequestidentifierperiod.hasStart()) {

			m.addMdctnRqstIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationrequestidentifierperiod.getStart())+"\"");
		} else {
			m.addMdctnRqstIdPrdStrt("NULL");
		}

		if(medicationrequestidentifieri == medicationrequestidentifierlist.size()-1) {m.addMdctnRqstIdPrdStrt("]");}


		/******************** MdctnRqst_Id_Prd_End ********************************************************************************/
		if(medicationrequestidentifieri == 0) {m.addMdctnRqstIdPrdEnd("[");}
		if(medicationrequestidentifierperiod.hasEnd()) {

			m.addMdctnRqstIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationrequestidentifierperiod.getEnd())+"\"");
		} else {
			m.addMdctnRqstIdPrdEnd("NULL");
		}

		if(medicationrequestidentifieri == medicationrequestidentifierlist.size()-1) {m.addMdctnRqstIdPrdEnd("]");}


		/******************** medicationrequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicationrequestidentifieruse = medicationrequestidentifier.getUse();
		if(medicationrequestidentifieruse!=null) {
		if(medicationrequestidentifieri == 0) {

		m.addMdctnRqstIdUse("[");		}
			m.addMdctnRqstIdUse(medicationrequestidentifieruse.toCode());
		if(medicationrequestidentifieri == medicationrequestidentifierlist.size()-1) {

		m.addMdctnRqstIdUse("]");		}

		} else {
			m.addMdctnRqstIdUse("NULL");
		}

		/******************** MdctnRqst_Id_Assigner ********************************************************************************/
		if(medicationrequestidentifieri == 0) {m.addMdctnRqstIdAssigner("[");}
		if(medicationrequestidentifier.hasAssigner()) {

			if(medicationrequestidentifier.getAssigner().getReference() != null) {
			m.addMdctnRqstIdAssigner(medicationrequestidentifier.getAssigner().getReference());
			}
		} else {
			m.addMdctnRqstIdAssigner("NULL");
		}

		if(medicationrequestidentifieri == medicationrequestidentifierlist.size()-1) {m.addMdctnRqstIdAssigner("]");}


		/******************** MdctnRqst_Id_Sys ********************************************************************************/
		if(medicationrequestidentifieri == 0) {m.addMdctnRqstIdSys("[");}
		if(medicationrequestidentifier.hasSystem()) {

			m.addMdctnRqstIdSys(String.valueOf(medicationrequestidentifier.getSystem()));
		} else {
			m.addMdctnRqstIdSys("NULL");
		}

		if(medicationrequestidentifieri == medicationrequestidentifierlist.size()-1) {m.addMdctnRqstIdSys("]");}


		 };
		/******************** medicationrequestgroupidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicationrequestgroupidentifier = medicationrequest.getGroupIdentifier();

		/******************** MdctnRqst_GrpId_Vl ********************************************************************************/
		if(medicationrequestgroupidentifier.hasValue()) {

			m.addMdctnRqstGrpIdVl(String.valueOf(medicationrequestgroupidentifier.getValue()));
		} else {
			m.addMdctnRqstGrpIdVl("NULL");
		}


		/******************** medicationrequestgroupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestgroupidentifiertype = medicationrequestgroupidentifier.getType();

		/******************** MdctnRqst_GrpId_Typ_Txt ********************************************************************************/
		if(medicationrequestgroupidentifiertype.hasText()) {

			m.addMdctnRqstGrpIdTypTxt(String.valueOf(medicationrequestgroupidentifiertype.getText()));
		} else {
			m.addMdctnRqstGrpIdTypTxt("NULL");
		}


		/******************** medicationrequestgroupidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationrequestgroupidentifiertypecodinglist = medicationrequestgroupidentifiertype.getCoding();
		for(int medicationrequestgroupidentifiertypecodingi = 0; medicationrequestgroupidentifiertypecodingi<medicationrequestgroupidentifiertypecodinglist.size();medicationrequestgroupidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationrequestgroupidentifiertypecoding = medicationrequestgroupidentifiertypecodinglist.get(medicationrequestgroupidentifiertypecodingi);

		/******************** MdctnRqst_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationrequestgroupidentifiertypecodingi == 0) {m.addMdctnRqstGrpIdTypCdgDsply("[");}
		if(medicationrequestgroupidentifiertypecoding.hasDisplay()) {

			m.addMdctnRqstGrpIdTypCdgDsply(String.valueOf(medicationrequestgroupidentifiertypecoding.getDisplay()));
		} else {
			m.addMdctnRqstGrpIdTypCdgDsply("NULL");
		}

		if(medicationrequestgroupidentifiertypecodingi == medicationrequestgroupidentifiertypecodinglist.size()-1) {m.addMdctnRqstGrpIdTypCdgDsply("]");}


		/******************** MdctnRqst_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestgroupidentifiertypecodingi == 0) {m.addMdctnRqstGrpIdTypCdgVrsn("[");}
		if(medicationrequestgroupidentifiertypecoding.hasVersion()) {

			m.addMdctnRqstGrpIdTypCdgVrsn(String.valueOf(medicationrequestgroupidentifiertypecoding.getVersion()));
		} else {
			m.addMdctnRqstGrpIdTypCdgVrsn("NULL");
		}

		if(medicationrequestgroupidentifiertypecodingi == medicationrequestgroupidentifiertypecodinglist.size()-1) {m.addMdctnRqstGrpIdTypCdgVrsn("]");}


		/******************** MdctnRqst_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(medicationrequestgroupidentifiertypecodingi == 0) {m.addMdctnRqstGrpIdTypCdgCd("[");}
		if(medicationrequestgroupidentifiertypecoding.hasCode()) {

			m.addMdctnRqstGrpIdTypCdgCd(String.valueOf(medicationrequestgroupidentifiertypecoding.getCode()));
		} else {
			m.addMdctnRqstGrpIdTypCdgCd("NULL");
		}

		if(medicationrequestgroupidentifiertypecodingi == medicationrequestgroupidentifiertypecodinglist.size()-1) {m.addMdctnRqstGrpIdTypCdgCd("]");}


		/******************** MdctnRqst_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestgroupidentifiertypecodingi == 0) {m.addMdctnRqstGrpIdTypCdgUsrSltd("[");}
		if(medicationrequestgroupidentifiertypecoding.hasUserSelected()) {

			m.addMdctnRqstGrpIdTypCdgUsrSltd(String.valueOf(medicationrequestgroupidentifiertypecoding.getUserSelected()));
		} else {
			m.addMdctnRqstGrpIdTypCdgUsrSltd("NULL");
		}

		if(medicationrequestgroupidentifiertypecodingi == medicationrequestgroupidentifiertypecodinglist.size()-1) {m.addMdctnRqstGrpIdTypCdgUsrSltd("]");}


		/******************** MdctnRqst_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(medicationrequestgroupidentifiertypecodingi == 0) {m.addMdctnRqstGrpIdTypCdgSys("[");}
		if(medicationrequestgroupidentifiertypecoding.hasSystem()) {

			m.addMdctnRqstGrpIdTypCdgSys(String.valueOf(medicationrequestgroupidentifiertypecoding.getSystem()));
		} else {
			m.addMdctnRqstGrpIdTypCdgSys("NULL");
		}

		if(medicationrequestgroupidentifiertypecodingi == medicationrequestgroupidentifiertypecodinglist.size()-1) {m.addMdctnRqstGrpIdTypCdgSys("]");}


		 };
		/******************** medicationrequestgroupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationrequestgroupidentifierperiod = medicationrequestgroupidentifier.getPeriod();

		/******************** MdctnRqst_GrpId_Prd_Strt ********************************************************************************/
		if(medicationrequestgroupidentifierperiod.hasStart()) {

			m.addMdctnRqstGrpIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationrequestgroupidentifierperiod.getStart())+"\"");
		} else {
			m.addMdctnRqstGrpIdPrdStrt("NULL");
		}


		/******************** MdctnRqst_GrpId_Prd_End ********************************************************************************/
		if(medicationrequestgroupidentifierperiod.hasEnd()) {

			m.addMdctnRqstGrpIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationrequestgroupidentifierperiod.getEnd())+"\"");
		} else {
			m.addMdctnRqstGrpIdPrdEnd("NULL");
		}


		/******************** medicationrequestgroupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicationrequestgroupidentifieruse = medicationrequestgroupidentifier.getUse();
		if(medicationrequestgroupidentifieruse!=null) {
			m.addMdctnRqstGrpIdUse(medicationrequestgroupidentifieruse.toCode());
		} else {
			m.addMdctnRqstGrpIdUse("NULL");
		}

		/******************** MdctnRqst_GrpId_Assigner ********************************************************************************/
		if(medicationrequestgroupidentifier.hasAssigner()) {

			if(medicationrequestgroupidentifier.getAssigner().getReference() != null) {
			m.addMdctnRqstGrpIdAssigner(medicationrequestgroupidentifier.getAssigner().getReference());
			}
		} else {
			m.addMdctnRqstGrpIdAssigner("NULL");
		}


		/******************** MdctnRqst_GrpId_Sys ********************************************************************************/
		if(medicationrequestgroupidentifier.hasSystem()) {

			m.addMdctnRqstGrpIdSys(String.valueOf(medicationrequestgroupidentifier.getSystem()));
		} else {
			m.addMdctnRqstGrpIdSys("NULL");
		}


		/******************** MdctnRqst_InstantiatesUri ********************************************************************************/
		if(medicationrequest.hasInstantiatesUri()) {

			String  array = "[";
			for(int incr=0; incr<medicationrequest.getInstantiatesUri().size(); incr++) {
				array = array + medicationrequest.getInstantiatesUri().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnRqstInstantiatesUri(array);

		} else {
			m.addMdctnRqstInstantiatesUri("NULL");
		}


		/******************** medicationrequestcategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicationrequestcategorylist = medicationrequest.getCategory();
		for(int medicationrequestcategoryi = 0; medicationrequestcategoryi<medicationrequestcategorylist.size();medicationrequestcategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicationrequestcategory = medicationrequestcategorylist.get(medicationrequestcategoryi);

		/******************** MdctnRqst_Ctgry_Txt ********************************************************************************/
		if(medicationrequestcategoryi == 0) {m.addMdctnRqstCtgryTxt("[");}
		if(medicationrequestcategory.hasText()) {

			m.addMdctnRqstCtgryTxt(String.valueOf(medicationrequestcategory.getText()));
		} else {
			m.addMdctnRqstCtgryTxt("NULL");
		}

		if(medicationrequestcategoryi == medicationrequestcategorylist.size()-1) {m.addMdctnRqstCtgryTxt("]");}


		/******************** medicationrequestcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationrequestcategorycodinglist = medicationrequestcategory.getCoding();
		for(int medicationrequestcategorycodingi = 0; medicationrequestcategorycodingi<medicationrequestcategorycodinglist.size();medicationrequestcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationrequestcategorycoding = medicationrequestcategorycodinglist.get(medicationrequestcategorycodingi);

		/******************** MdctnRqst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(medicationrequestcategorycodingi == 0) {m.addMdctnRqstCtgryCdgDsply("[[");}
		if(medicationrequestcategorycoding.hasDisplay()) {

			m.addMdctnRqstCtgryCdgDsply(String.valueOf(medicationrequestcategorycoding.getDisplay()));
		} else {
			m.addMdctnRqstCtgryCdgDsply("NULL");
		}

		if(medicationrequestcategorycodingi == medicationrequestcategorycodinglist.size()-1) {m.addMdctnRqstCtgryCdgDsply("]]");}


		/******************** MdctnRqst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestcategorycodingi == 0) {m.addMdctnRqstCtgryCdgVrsn("[[");}
		if(medicationrequestcategorycoding.hasVersion()) {

			m.addMdctnRqstCtgryCdgVrsn(String.valueOf(medicationrequestcategorycoding.getVersion()));
		} else {
			m.addMdctnRqstCtgryCdgVrsn("NULL");
		}

		if(medicationrequestcategorycodingi == medicationrequestcategorycodinglist.size()-1) {m.addMdctnRqstCtgryCdgVrsn("]]");}


		/******************** MdctnRqst_Ctgry_Cdg_Cd ********************************************************************************/
		if(medicationrequestcategorycodingi == 0) {m.addMdctnRqstCtgryCdgCd("[[");}
		if(medicationrequestcategorycoding.hasCode()) {

			m.addMdctnRqstCtgryCdgCd(String.valueOf(medicationrequestcategorycoding.getCode()));
		} else {
			m.addMdctnRqstCtgryCdgCd("NULL");
		}

		if(medicationrequestcategorycodingi == medicationrequestcategorycodinglist.size()-1) {m.addMdctnRqstCtgryCdgCd("]]");}


		/******************** MdctnRqst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestcategorycodingi == 0) {m.addMdctnRqstCtgryCdgUsrSltd("[[");}
		if(medicationrequestcategorycoding.hasUserSelected()) {

			m.addMdctnRqstCtgryCdgUsrSltd(String.valueOf(medicationrequestcategorycoding.getUserSelected()));
		} else {
			m.addMdctnRqstCtgryCdgUsrSltd("NULL");
		}

		if(medicationrequestcategorycodingi == medicationrequestcategorycodinglist.size()-1) {m.addMdctnRqstCtgryCdgUsrSltd("]]");}


		/******************** MdctnRqst_Ctgry_Cdg_Sys ********************************************************************************/
		if(medicationrequestcategorycodingi == 0) {m.addMdctnRqstCtgryCdgSys("[[");}
		if(medicationrequestcategorycoding.hasSystem()) {

			m.addMdctnRqstCtgryCdgSys(String.valueOf(medicationrequestcategorycoding.getSystem()));
		} else {
			m.addMdctnRqstCtgryCdgSys("NULL");
		}

		if(medicationrequestcategorycodingi == medicationrequestcategorycodinglist.size()-1) {m.addMdctnRqstCtgryCdgSys("]]");}


		 };
		 };
		/******************** MdctnRqst_Recorder ********************************************************************************/
		if(medicationrequest.hasRecorder()) {

			if(medicationrequest.getRecorder().getReference() != null) {
			m.addMdctnRqstRecorder(medicationrequest.getRecorder().getReference());
			}
		} else {
			m.addMdctnRqstRecorder("NULL");
		}


		/******************** MdctnRqst_Rqster ********************************************************************************/
		if(medicationrequest.hasRequester()) {

			if(medicationrequest.getRequester().getReference() != null) {
			m.addMdctnRqstRqster(medicationrequest.getRequester().getReference());
			}
		} else {
			m.addMdctnRqstRqster("NULL");
		}


		/******************** medicationrequestperformertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestperformertype = medicationrequest.getPerformerType();

		/******************** MdctnRqst_PrfrmrTyp_Txt ********************************************************************************/
		if(medicationrequestperformertype.hasText()) {

			m.addMdctnRqstPrfrmrTypTxt(String.valueOf(medicationrequestperformertype.getText()));
		} else {
			m.addMdctnRqstPrfrmrTypTxt("NULL");
		}


		/******************** medicationrequestperformertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationrequestperformertypecodinglist = medicationrequestperformertype.getCoding();
		for(int medicationrequestperformertypecodingi = 0; medicationrequestperformertypecodingi<medicationrequestperformertypecodinglist.size();medicationrequestperformertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationrequestperformertypecoding = medicationrequestperformertypecodinglist.get(medicationrequestperformertypecodingi);

		/******************** MdctnRqst_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(medicationrequestperformertypecodingi == 0) {m.addMdctnRqstPrfrmrTypCdgDsply("[");}
		if(medicationrequestperformertypecoding.hasDisplay()) {

			m.addMdctnRqstPrfrmrTypCdgDsply(String.valueOf(medicationrequestperformertypecoding.getDisplay()));
		} else {
			m.addMdctnRqstPrfrmrTypCdgDsply("NULL");
		}

		if(medicationrequestperformertypecodingi == medicationrequestperformertypecodinglist.size()-1) {m.addMdctnRqstPrfrmrTypCdgDsply("]");}


		/******************** MdctnRqst_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestperformertypecodingi == 0) {m.addMdctnRqstPrfrmrTypCdgVrsn("[");}
		if(medicationrequestperformertypecoding.hasVersion()) {

			m.addMdctnRqstPrfrmrTypCdgVrsn(String.valueOf(medicationrequestperformertypecoding.getVersion()));
		} else {
			m.addMdctnRqstPrfrmrTypCdgVrsn("NULL");
		}

		if(medicationrequestperformertypecodingi == medicationrequestperformertypecodinglist.size()-1) {m.addMdctnRqstPrfrmrTypCdgVrsn("]");}


		/******************** MdctnRqst_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(medicationrequestperformertypecodingi == 0) {m.addMdctnRqstPrfrmrTypCdgCd("[");}
		if(medicationrequestperformertypecoding.hasCode()) {

			m.addMdctnRqstPrfrmrTypCdgCd(String.valueOf(medicationrequestperformertypecoding.getCode()));
		} else {
			m.addMdctnRqstPrfrmrTypCdgCd("NULL");
		}

		if(medicationrequestperformertypecodingi == medicationrequestperformertypecodinglist.size()-1) {m.addMdctnRqstPrfrmrTypCdgCd("]");}


		/******************** MdctnRqst_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestperformertypecodingi == 0) {m.addMdctnRqstPrfrmrTypCdgUsrSltd("[");}
		if(medicationrequestperformertypecoding.hasUserSelected()) {

			m.addMdctnRqstPrfrmrTypCdgUsrSltd(String.valueOf(medicationrequestperformertypecoding.getUserSelected()));
		} else {
			m.addMdctnRqstPrfrmrTypCdgUsrSltd("NULL");
		}

		if(medicationrequestperformertypecodingi == medicationrequestperformertypecodinglist.size()-1) {m.addMdctnRqstPrfrmrTypCdgUsrSltd("]");}


		/******************** MdctnRqst_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(medicationrequestperformertypecodingi == 0) {m.addMdctnRqstPrfrmrTypCdgSys("[");}
		if(medicationrequestperformertypecoding.hasSystem()) {

			m.addMdctnRqstPrfrmrTypCdgSys(String.valueOf(medicationrequestperformertypecoding.getSystem()));
		} else {
			m.addMdctnRqstPrfrmrTypCdgSys("NULL");
		}

		if(medicationrequestperformertypecodingi == medicationrequestperformertypecodinglist.size()-1) {m.addMdctnRqstPrfrmrTypCdgSys("]");}


		 };
		/******************** MdctnRqst_MdctnRfrnc ********************************************************************************/
		if(medicationrequest.hasMedicationReference()) {

			if(medicationrequest.getMedicationReference().getReference() != null) {
			m.addMdctnRqstMdctnRfrnc(medicationrequest.getMedicationReference().getReference());
			}
		} else {
			m.addMdctnRqstMdctnRfrnc("NULL");
		}


		/******************** medicationrequestmedicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestmedicationcodeableconcept = medicationrequest.getMedicationCodeableConcept();

		/******************** MdctnRqst_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(medicationrequestmedicationcodeableconcept.hasText()) {

			m.addMdctnRqstMdctnCdbleCncptTxt(String.valueOf(medicationrequestmedicationcodeableconcept.getText()));
		} else {
			m.addMdctnRqstMdctnCdbleCncptTxt("NULL");
		}


		/******************** medicationrequestmedicationcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationrequestmedicationcodeableconceptcodinglist = medicationrequestmedicationcodeableconcept.getCoding();
		for(int medicationrequestmedicationcodeableconceptcodingi = 0; medicationrequestmedicationcodeableconceptcodingi<medicationrequestmedicationcodeableconceptcodinglist.size();medicationrequestmedicationcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationrequestmedicationcodeableconceptcoding = medicationrequestmedicationcodeableconceptcodinglist.get(medicationrequestmedicationcodeableconceptcodingi);

		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationrequestmedicationcodeableconceptcodingi == 0) {m.addMdctnRqstMdctnCdbleCncptCdgDsply("[");}
		if(medicationrequestmedicationcodeableconceptcoding.hasDisplay()) {

			m.addMdctnRqstMdctnCdbleCncptCdgDsply(String.valueOf(medicationrequestmedicationcodeableconceptcoding.getDisplay()));
		} else {
			m.addMdctnRqstMdctnCdbleCncptCdgDsply("NULL");
		}

		if(medicationrequestmedicationcodeableconceptcodingi == medicationrequestmedicationcodeableconceptcodinglist.size()-1) {m.addMdctnRqstMdctnCdbleCncptCdgDsply("]");}


		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestmedicationcodeableconceptcodingi == 0) {m.addMdctnRqstMdctnCdbleCncptCdgVrsn("[");}
		if(medicationrequestmedicationcodeableconceptcoding.hasVersion()) {

			m.addMdctnRqstMdctnCdbleCncptCdgVrsn(String.valueOf(medicationrequestmedicationcodeableconceptcoding.getVersion()));
		} else {
			m.addMdctnRqstMdctnCdbleCncptCdgVrsn("NULL");
		}

		if(medicationrequestmedicationcodeableconceptcodingi == medicationrequestmedicationcodeableconceptcodinglist.size()-1) {m.addMdctnRqstMdctnCdbleCncptCdgVrsn("]");}


		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationrequestmedicationcodeableconceptcodingi == 0) {m.addMdctnRqstMdctnCdbleCncptCdgCd("[");}
		if(medicationrequestmedicationcodeableconceptcoding.hasCode()) {

			m.addMdctnRqstMdctnCdbleCncptCdgCd(String.valueOf(medicationrequestmedicationcodeableconceptcoding.getCode()));
		} else {
			m.addMdctnRqstMdctnCdbleCncptCdgCd("NULL");
		}

		if(medicationrequestmedicationcodeableconceptcodingi == medicationrequestmedicationcodeableconceptcodinglist.size()-1) {m.addMdctnRqstMdctnCdbleCncptCdgCd("]");}


		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestmedicationcodeableconceptcodingi == 0) {m.addMdctnRqstMdctnCdbleCncptCdgUsrSltd("[");}
		if(medicationrequestmedicationcodeableconceptcoding.hasUserSelected()) {

			m.addMdctnRqstMdctnCdbleCncptCdgUsrSltd(String.valueOf(medicationrequestmedicationcodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdctnRqstMdctnCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicationrequestmedicationcodeableconceptcodingi == medicationrequestmedicationcodeableconceptcodinglist.size()-1) {m.addMdctnRqstMdctnCdbleCncptCdgUsrSltd("]");}


		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationrequestmedicationcodeableconceptcodingi == 0) {m.addMdctnRqstMdctnCdbleCncptCdgSys("[");}
		if(medicationrequestmedicationcodeableconceptcoding.hasSystem()) {

			m.addMdctnRqstMdctnCdbleCncptCdgSys(String.valueOf(medicationrequestmedicationcodeableconceptcoding.getSystem()));
		} else {
			m.addMdctnRqstMdctnCdbleCncptCdgSys("NULL");
		}

		if(medicationrequestmedicationcodeableconceptcodingi == medicationrequestmedicationcodeableconceptcodinglist.size()-1) {m.addMdctnRqstMdctnCdbleCncptCdgSys("]");}


		 };
		/******************** MdctnRqst_SprtingInfo ********************************************************************************/
		if(medicationrequest.hasSupportingInformation()) {

			String  array = "[";
			for(int incr=0; incr<medicationrequest.getSupportingInformation().size(); incr++) {
				array = array + medicationrequest.getSupportingInformation().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnRqstSprtingInfo(array);

		} else {
			m.addMdctnRqstSprtingInfo("NULL");
		}


		/******************** MdctnRqst_Prfrmr ********************************************************************************/
		if(medicationrequest.hasPerformer()) {

			if(medicationrequest.getPerformer().getReference() != null) {
			m.addMdctnRqstPrfrmr(medicationrequest.getPerformer().getReference());
			}
		} else {
			m.addMdctnRqstPrfrmr("NULL");
		}


		/******************** MdctnRqst_RptedBooleanTyp ********************************************************************************/
		if(medicationrequest.hasReportedBooleanType()) {

			m.addMdctnRqstRptedBooleanTyp("\""+medicationrequest.getReportedBooleanType().getValueAsString()+"\"");
		} else {
			m.addMdctnRqstRptedBooleanTyp("NULL");
		}


		/******************** MdctnRqst_RptedRfrnc ********************************************************************************/
		if(medicationrequest.hasReportedReference()) {

			if(medicationrequest.getReportedReference().getReference() != null) {
			m.addMdctnRqstRptedRfrnc(medicationrequest.getReportedReference().getReference());
			}
		} else {
			m.addMdctnRqstRptedRfrnc("NULL");
		}


		/******************** medicationrequestcourseoftherapytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestcourseoftherapytype = medicationrequest.getCourseOfTherapyType();

		/******************** MdctnRqst_CourseOfThrpyTyp_Txt ********************************************************************************/
		if(medicationrequestcourseoftherapytype.hasText()) {

			m.addMdctnRqstCourseOfThrpyTypTxt(String.valueOf(medicationrequestcourseoftherapytype.getText()));
		} else {
			m.addMdctnRqstCourseOfThrpyTypTxt("NULL");
		}


		/******************** medicationrequestcourseoftherapytypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationrequestcourseoftherapytypecodinglist = medicationrequestcourseoftherapytype.getCoding();
		for(int medicationrequestcourseoftherapytypecodingi = 0; medicationrequestcourseoftherapytypecodingi<medicationrequestcourseoftherapytypecodinglist.size();medicationrequestcourseoftherapytypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationrequestcourseoftherapytypecoding = medicationrequestcourseoftherapytypecodinglist.get(medicationrequestcourseoftherapytypecodingi);

		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_Dsply ********************************************************************************/
		if(medicationrequestcourseoftherapytypecodingi == 0) {m.addMdctnRqstCourseOfThrpyTypCdgDsply("[");}
		if(medicationrequestcourseoftherapytypecoding.hasDisplay()) {

			m.addMdctnRqstCourseOfThrpyTypCdgDsply(String.valueOf(medicationrequestcourseoftherapytypecoding.getDisplay()));
		} else {
			m.addMdctnRqstCourseOfThrpyTypCdgDsply("NULL");
		}

		if(medicationrequestcourseoftherapytypecodingi == medicationrequestcourseoftherapytypecodinglist.size()-1) {m.addMdctnRqstCourseOfThrpyTypCdgDsply("]");}


		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestcourseoftherapytypecodingi == 0) {m.addMdctnRqstCourseOfThrpyTypCdgVrsn("[");}
		if(medicationrequestcourseoftherapytypecoding.hasVersion()) {

			m.addMdctnRqstCourseOfThrpyTypCdgVrsn(String.valueOf(medicationrequestcourseoftherapytypecoding.getVersion()));
		} else {
			m.addMdctnRqstCourseOfThrpyTypCdgVrsn("NULL");
		}

		if(medicationrequestcourseoftherapytypecodingi == medicationrequestcourseoftherapytypecodinglist.size()-1) {m.addMdctnRqstCourseOfThrpyTypCdgVrsn("]");}


		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_Cd ********************************************************************************/
		if(medicationrequestcourseoftherapytypecodingi == 0) {m.addMdctnRqstCourseOfThrpyTypCdgCd("[");}
		if(medicationrequestcourseoftherapytypecoding.hasCode()) {

			m.addMdctnRqstCourseOfThrpyTypCdgCd(String.valueOf(medicationrequestcourseoftherapytypecoding.getCode()));
		} else {
			m.addMdctnRqstCourseOfThrpyTypCdgCd("NULL");
		}

		if(medicationrequestcourseoftherapytypecodingi == medicationrequestcourseoftherapytypecodinglist.size()-1) {m.addMdctnRqstCourseOfThrpyTypCdgCd("]");}


		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestcourseoftherapytypecodingi == 0) {m.addMdctnRqstCourseOfThrpyTypCdgUsrSltd("[");}
		if(medicationrequestcourseoftherapytypecoding.hasUserSelected()) {

			m.addMdctnRqstCourseOfThrpyTypCdgUsrSltd(String.valueOf(medicationrequestcourseoftherapytypecoding.getUserSelected()));
		} else {
			m.addMdctnRqstCourseOfThrpyTypCdgUsrSltd("NULL");
		}

		if(medicationrequestcourseoftherapytypecodingi == medicationrequestcourseoftherapytypecodinglist.size()-1) {m.addMdctnRqstCourseOfThrpyTypCdgUsrSltd("]");}


		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_Sys ********************************************************************************/
		if(medicationrequestcourseoftherapytypecodingi == 0) {m.addMdctnRqstCourseOfThrpyTypCdgSys("[");}
		if(medicationrequestcourseoftherapytypecoding.hasSystem()) {

			m.addMdctnRqstCourseOfThrpyTypCdgSys(String.valueOf(medicationrequestcourseoftherapytypecoding.getSystem()));
		} else {
			m.addMdctnRqstCourseOfThrpyTypCdgSys("NULL");
		}

		if(medicationrequestcourseoftherapytypecodingi == medicationrequestcourseoftherapytypecodinglist.size()-1) {m.addMdctnRqstCourseOfThrpyTypCdgSys("]");}


		 };
		/******************** medicationrequestdosageinstruction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Dosage> medicationrequestdosageinstructionlist = medicationrequest.getDosageInstruction();
		for(int medicationrequestdosageinstructioni = 0; medicationrequestdosageinstructioni<medicationrequestdosageinstructionlist.size();medicationrequestdosageinstructioni++ ) {
		org.hl7.fhir.r4.model.Dosage  medicationrequestdosageinstruction = medicationrequestdosageinstructionlist.get(medicationrequestdosageinstructioni);

		/******************** medicationrequestdosageinstructionmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructionmethod = medicationrequestdosageinstruction.getMethod();

		/******************** MdctnRqst_DsgInstrctn_Mthd_Txt ********************************************************************************/
		if(medicationrequestdosageinstructioni == 0) {m.addMdctnRqstDsgInstrctnMthdTxt("[");}
		if(medicationrequestdosageinstructionmethod.hasText()) {

			m.addMdctnRqstDsgInstrctnMthdTxt(String.valueOf(medicationrequestdosageinstructionmethod.getText()));
		} else {
			m.addMdctnRqstDsgInstrctnMthdTxt("NULL");
		}

		if(medicationrequestdosageinstructioni == medicationrequestdosageinstructionlist.size()-1) {m.addMdctnRqstDsgInstrctnMthdTxt("]");}


		/******************** medicationrequestdosageinstructionmethodcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationrequestdosageinstructionmethodcodinglist = medicationrequestdosageinstructionmethod.getCoding();
		for(int medicationrequestdosageinstructionmethodcodingi = 0; medicationrequestdosageinstructionmethodcodingi<medicationrequestdosageinstructionmethodcodinglist.size();medicationrequestdosageinstructionmethodcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationrequestdosageinstructionmethodcoding = medicationrequestdosageinstructionmethodcodinglist.get(medicationrequestdosageinstructionmethodcodingi);

		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_Dsply ********************************************************************************/
		if(medicationrequestdosageinstructionmethodcodingi == 0) {m.addMdctnRqstDsgInstrctnMthdCdgDsply("[[");}
		if(medicationrequestdosageinstructionmethodcoding.hasDisplay()) {

			m.addMdctnRqstDsgInstrctnMthdCdgDsply(String.valueOf(medicationrequestdosageinstructionmethodcoding.getDisplay()));
		} else {
			m.addMdctnRqstDsgInstrctnMthdCdgDsply("NULL");
		}

		if(medicationrequestdosageinstructionmethodcodingi == medicationrequestdosageinstructionmethodcodinglist.size()-1) {m.addMdctnRqstDsgInstrctnMthdCdgDsply("]]");}


		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestdosageinstructionmethodcodingi == 0) {m.addMdctnRqstDsgInstrctnMthdCdgVrsn("[[");}
		if(medicationrequestdosageinstructionmethodcoding.hasVersion()) {

			m.addMdctnRqstDsgInstrctnMthdCdgVrsn(String.valueOf(medicationrequestdosageinstructionmethodcoding.getVersion()));
		} else {
			m.addMdctnRqstDsgInstrctnMthdCdgVrsn("NULL");
		}

		if(medicationrequestdosageinstructionmethodcodingi == medicationrequestdosageinstructionmethodcodinglist.size()-1) {m.addMdctnRqstDsgInstrctnMthdCdgVrsn("]]");}


		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_Cd ********************************************************************************/
		if(medicationrequestdosageinstructionmethodcodingi == 0) {m.addMdctnRqstDsgInstrctnMthdCdgCd("[[");}
		if(medicationrequestdosageinstructionmethodcoding.hasCode()) {

			m.addMdctnRqstDsgInstrctnMthdCdgCd(String.valueOf(medicationrequestdosageinstructionmethodcoding.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnMthdCdgCd("NULL");
		}

		if(medicationrequestdosageinstructionmethodcodingi == medicationrequestdosageinstructionmethodcodinglist.size()-1) {m.addMdctnRqstDsgInstrctnMthdCdgCd("]]");}


		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestdosageinstructionmethodcodingi == 0) {m.addMdctnRqstDsgInstrctnMthdCdgUsrSltd("[[");}
		if(medicationrequestdosageinstructionmethodcoding.hasUserSelected()) {

			m.addMdctnRqstDsgInstrctnMthdCdgUsrSltd(String.valueOf(medicationrequestdosageinstructionmethodcoding.getUserSelected()));
		} else {
			m.addMdctnRqstDsgInstrctnMthdCdgUsrSltd("NULL");
		}

		if(medicationrequestdosageinstructionmethodcodingi == medicationrequestdosageinstructionmethodcodinglist.size()-1) {m.addMdctnRqstDsgInstrctnMthdCdgUsrSltd("]]");}


		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_Sys ********************************************************************************/
		if(medicationrequestdosageinstructionmethodcodingi == 0) {m.addMdctnRqstDsgInstrctnMthdCdgSys("[[");}
		if(medicationrequestdosageinstructionmethodcoding.hasSystem()) {

			m.addMdctnRqstDsgInstrctnMthdCdgSys(String.valueOf(medicationrequestdosageinstructionmethodcoding.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnMthdCdgSys("NULL");
		}

		if(medicationrequestdosageinstructionmethodcodingi == medicationrequestdosageinstructionmethodcodinglist.size()-1) {m.addMdctnRqstDsgInstrctnMthdCdgSys("]]");}


		 };
		/******************** medicationrequestdosageinstructiondoseandrate ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent> medicationrequestdosageinstructiondoseandratelist = medicationrequestdosageinstruction.getDoseAndRate();
		for(int medicationrequestdosageinstructiondoseandratei = 0; medicationrequestdosageinstructiondoseandratei<medicationrequestdosageinstructiondoseandratelist.size();medicationrequestdosageinstructiondoseandratei++ ) {
		org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent  medicationrequestdosageinstructiondoseandrate = medicationrequestdosageinstructiondoseandratelist.get(medicationrequestdosageinstructiondoseandratei);

		/******************** medicationrequestdosageinstructiondoseandratetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructiondoseandratetype = medicationrequestdosageinstructiondoseandrate.getType();

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Txt ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtTypTxt("[[");}
		if(medicationrequestdosageinstructiondoseandratetype.hasText()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtTypTxt(String.valueOf(medicationrequestdosageinstructiondoseandratetype.getText()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtTypTxt("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtTypTxt("]]");}


		/******************** medicationrequestdosageinstructiondoseandratetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationrequestdosageinstructiondoseandratetypecodinglist = medicationrequestdosageinstructiondoseandratetype.getCoding();
		for(int medicationrequestdosageinstructiondoseandratetypecodingi = 0; medicationrequestdosageinstructiondoseandratetypecodingi<medicationrequestdosageinstructiondoseandratetypecodinglist.size();medicationrequestdosageinstructiondoseandratetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationrequestdosageinstructiondoseandratetypecoding = medicationrequestdosageinstructiondoseandratetypecodinglist.get(medicationrequestdosageinstructiondoseandratetypecodingi);

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratetypecodingi == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgDsply("[[[");}
		if(medicationrequestdosageinstructiondoseandratetypecoding.hasDisplay()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgDsply(String.valueOf(medicationrequestdosageinstructiondoseandratetypecoding.getDisplay()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgDsply("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratetypecodingi == medicationrequestdosageinstructiondoseandratetypecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgDsply("]]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratetypecodingi == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgVrsn("[[[");}
		if(medicationrequestdosageinstructiondoseandratetypecoding.hasVersion()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgVrsn(String.valueOf(medicationrequestdosageinstructiondoseandratetypecoding.getVersion()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgVrsn("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratetypecodingi == medicationrequestdosageinstructiondoseandratetypecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgVrsn("]]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratetypecodingi == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgCd("[[[");}
		if(medicationrequestdosageinstructiondoseandratetypecoding.hasCode()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgCd(String.valueOf(medicationrequestdosageinstructiondoseandratetypecoding.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgCd("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratetypecodingi == medicationrequestdosageinstructiondoseandratetypecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgCd("]]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratetypecodingi == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgUsrSltd("[[[");}
		if(medicationrequestdosageinstructiondoseandratetypecoding.hasUserSelected()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgUsrSltd(String.valueOf(medicationrequestdosageinstructiondoseandratetypecoding.getUserSelected()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgUsrSltd("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratetypecodingi == medicationrequestdosageinstructiondoseandratetypecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgUsrSltd("]]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratetypecodingi == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgSys("[[[");}
		if(medicationrequestdosageinstructiondoseandratetypecoding.hasSystem()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgSys(String.valueOf(medicationrequestdosageinstructiondoseandratetypecoding.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgSys("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratetypecodingi == medicationrequestdosageinstructiondoseandratetypecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtTypCdgSys("]]]");}


		 };
		/******************** medicationrequestdosageinstructiondoseandratedoserange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationrequestdosageinstructiondoseandratedoserange = medicationrequestdosageinstructiondoseandrate.getDoseRange();

		/******************** medicationrequestdosageinstructiondoseandratedoserangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandratedoserangelow = medicationrequestdosageinstructiondoseandratedoserange.getLow();

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwVl("[[");}
		if(medicationrequestdosageinstructiondoseandratedoserangelow.hasValue()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwVl(String.valueOf(medicationrequestdosageinstructiondoseandratedoserangelow.getValue()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwVl("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwVl("]]");}


		/******************** medicationrequestdosageinstructiondoseandratedoserangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiondoseandratedoserangelowcomparator = medicationrequestdosageinstructiondoseandratedoserangelow.getComparator();
		if(medicationrequestdosageinstructiondoseandratedoserangelowcomparator!=null) {
		if(medicationrequestdosageinstructiondoseandratei == 0) {

		m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCmprtr("[[");		}
			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCmprtr(medicationrequestdosageinstructiondoseandratedoserangelowcomparator.toCode());
		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {

		m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCmprtr("]]");		}

		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCmprtr("NULL");
		}

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCd("[[");}
		if(medicationrequestdosageinstructiondoseandratedoserangelow.hasCode()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCd(String.valueOf(medicationrequestdosageinstructiondoseandratedoserangelow.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCd("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCd("]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwUnt("[[");}
		if(medicationrequestdosageinstructiondoseandratedoserangelow.hasUnit()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwUnt(String.valueOf(medicationrequestdosageinstructiondoseandratedoserangelow.getUnit()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwUnt("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwUnt("]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwSys("[[");}
		if(medicationrequestdosageinstructiondoseandratedoserangelow.hasSystem()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwSys(String.valueOf(medicationrequestdosageinstructiondoseandratedoserangelow.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwSys("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngLwSys("]]");}


		/******************** medicationrequestdosageinstructiondoseandratedoserangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandratedoserangehigh = medicationrequestdosageinstructiondoseandratedoserange.getHigh();

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiVl("[[");}
		if(medicationrequestdosageinstructiondoseandratedoserangehigh.hasValue()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiVl(String.valueOf(medicationrequestdosageinstructiondoseandratedoserangehigh.getValue()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiVl("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiVl("]]");}


		/******************** medicationrequestdosageinstructiondoseandratedoserangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiondoseandratedoserangehighcomparator = medicationrequestdosageinstructiondoseandratedoserangehigh.getComparator();
		if(medicationrequestdosageinstructiondoseandratedoserangehighcomparator!=null) {
		if(medicationrequestdosageinstructiondoseandratei == 0) {

		m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCmprtr("[[");		}
			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCmprtr(medicationrequestdosageinstructiondoseandratedoserangehighcomparator.toCode());
		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {

		m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCmprtr("]]");		}

		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCmprtr("NULL");
		}

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCd("[[");}
		if(medicationrequestdosageinstructiondoseandratedoserangehigh.hasCode()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCd(String.valueOf(medicationrequestdosageinstructiondoseandratedoserangehigh.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCd("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCd("]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiUnt("[[");}
		if(medicationrequestdosageinstructiondoseandratedoserangehigh.hasUnit()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiUnt(String.valueOf(medicationrequestdosageinstructiondoseandratedoserangehigh.getUnit()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiUnt("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiUnt("]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiSys("[[");}
		if(medicationrequestdosageinstructiondoseandratedoserangehigh.hasSystem()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiSys(String.valueOf(medicationrequestdosageinstructiondoseandratedoserangehigh.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiSys("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseRngHiSys("]]");}


		/******************** medicationrequestdosageinstructiondoseandrateratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandrateratequantity = medicationrequestdosageinstructiondoseandrate.getRateQuantity();

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtQntyVl("[[");}
		if(medicationrequestdosageinstructiondoseandrateratequantity.hasValue()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtQntyVl(String.valueOf(medicationrequestdosageinstructiondoseandrateratequantity.getValue()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtQntyVl("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtQntyVl("]]");}


		/******************** medicationrequestdosageinstructiondoseandrateratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiondoseandrateratequantitycomparator = medicationrequestdosageinstructiondoseandrateratequantity.getComparator();
		if(medicationrequestdosageinstructiondoseandrateratequantitycomparator!=null) {
		if(medicationrequestdosageinstructiondoseandratei == 0) {

		m.addMdctnRqstDsgInstrctnDoseAndRtRtQntyCmprtr("[[");		}
			m.addMdctnRqstDsgInstrctnDoseAndRtRtQntyCmprtr(medicationrequestdosageinstructiondoseandrateratequantitycomparator.toCode());
		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {

		m.addMdctnRqstDsgInstrctnDoseAndRtRtQntyCmprtr("]]");		}

		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtQntyCmprtr("NULL");
		}

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtQntyCd("[[");}
		if(medicationrequestdosageinstructiondoseandrateratequantity.hasCode()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtQntyCd(String.valueOf(medicationrequestdosageinstructiondoseandrateratequantity.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtQntyCd("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtQntyCd("]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtQntyUnt("[[");}
		if(medicationrequestdosageinstructiondoseandrateratequantity.hasUnit()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtQntyUnt(String.valueOf(medicationrequestdosageinstructiondoseandrateratequantity.getUnit()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtQntyUnt("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtQntyUnt("]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtQntySys("[[");}
		if(medicationrequestdosageinstructiondoseandrateratequantity.hasSystem()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtQntySys(String.valueOf(medicationrequestdosageinstructiondoseandrateratequantity.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtQntySys("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtQntySys("]]");}


		/******************** medicationrequestdosageinstructiondoseandraterateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationrequestdosageinstructiondoseandraterateratio = medicationrequestdosageinstructiondoseandrate.getRateRatio();

		/******************** medicationrequestdosageinstructiondoseandrateraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandrateraterationumerator = medicationrequestdosageinstructiondoseandraterateratio.getNumerator();

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrVl("[[");}
		if(medicationrequestdosageinstructiondoseandrateraterationumerator.hasValue()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrVl(String.valueOf(medicationrequestdosageinstructiondoseandrateraterationumerator.getValue()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrVl("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrVl("]]");}


		/******************** medicationrequestdosageinstructiondoseandrateraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiondoseandrateraterationumeratorcomparator = medicationrequestdosageinstructiondoseandrateraterationumerator.getComparator();
		if(medicationrequestdosageinstructiondoseandrateraterationumeratorcomparator!=null) {
		if(medicationrequestdosageinstructiondoseandratei == 0) {

		m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCmprtr("[[");		}
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCmprtr(medicationrequestdosageinstructiondoseandrateraterationumeratorcomparator.toCode());
		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {

		m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCmprtr("]]");		}

		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCmprtr("NULL");
		}

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCd("[[");}
		if(medicationrequestdosageinstructiondoseandrateraterationumerator.hasCode()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCd(String.valueOf(medicationrequestdosageinstructiondoseandrateraterationumerator.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCd("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCd("]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrUnt("[[");}
		if(medicationrequestdosageinstructiondoseandrateraterationumerator.hasUnit()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrUnt(String.valueOf(medicationrequestdosageinstructiondoseandrateraterationumerator.getUnit()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrUnt("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrUnt("]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrSys("[[");}
		if(medicationrequestdosageinstructiondoseandrateraterationumerator.hasSystem()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrSys(String.valueOf(medicationrequestdosageinstructiondoseandrateraterationumerator.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrSys("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrSys("]]");}


		/******************** medicationrequestdosageinstructiondoseandraterateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandraterateratiodenominator = medicationrequestdosageinstructiondoseandraterateratio.getDenominator();

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrVl("[[");}
		if(medicationrequestdosageinstructiondoseandraterateratiodenominator.hasValue()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrVl(String.valueOf(medicationrequestdosageinstructiondoseandraterateratiodenominator.getValue()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrVl("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrVl("]]");}


		/******************** medicationrequestdosageinstructiondoseandraterateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiondoseandraterateratiodenominatorcomparator = medicationrequestdosageinstructiondoseandraterateratiodenominator.getComparator();
		if(medicationrequestdosageinstructiondoseandraterateratiodenominatorcomparator!=null) {
		if(medicationrequestdosageinstructiondoseandratei == 0) {

		m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCmprtr("[[");		}
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCmprtr(medicationrequestdosageinstructiondoseandraterateratiodenominatorcomparator.toCode());
		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {

		m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCmprtr("]]");		}

		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCmprtr("NULL");
		}

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCd("[[");}
		if(medicationrequestdosageinstructiondoseandraterateratiodenominator.hasCode()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCd(String.valueOf(medicationrequestdosageinstructiondoseandraterateratiodenominator.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCd("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCd("]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrUnt("[[");}
		if(medicationrequestdosageinstructiondoseandraterateratiodenominator.hasUnit()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrUnt(String.valueOf(medicationrequestdosageinstructiondoseandraterateratiodenominator.getUnit()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrUnt("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrUnt("]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrSys("[[");}
		if(medicationrequestdosageinstructiondoseandraterateratiodenominator.hasSystem()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrSys(String.valueOf(medicationrequestdosageinstructiondoseandraterateratiodenominator.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrSys("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrSys("]]");}


		/******************** medicationrequestdosageinstructiondoseandrateraterange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationrequestdosageinstructiondoseandrateraterange = medicationrequestdosageinstructiondoseandrate.getRateRange();

		/******************** medicationrequestdosageinstructiondoseandrateraterangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandrateraterangelow = medicationrequestdosageinstructiondoseandrateraterange.getLow();

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwVl("[[");}
		if(medicationrequestdosageinstructiondoseandrateraterangelow.hasValue()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwVl(String.valueOf(medicationrequestdosageinstructiondoseandrateraterangelow.getValue()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwVl("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwVl("]]");}


		/******************** medicationrequestdosageinstructiondoseandrateraterangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiondoseandrateraterangelowcomparator = medicationrequestdosageinstructiondoseandrateraterangelow.getComparator();
		if(medicationrequestdosageinstructiondoseandrateraterangelowcomparator!=null) {
		if(medicationrequestdosageinstructiondoseandratei == 0) {

		m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwCmprtr("[[");		}
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwCmprtr(medicationrequestdosageinstructiondoseandrateraterangelowcomparator.toCode());
		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {

		m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwCmprtr("]]");		}

		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwCmprtr("NULL");
		}

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwCd("[[");}
		if(medicationrequestdosageinstructiondoseandrateraterangelow.hasCode()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwCd(String.valueOf(medicationrequestdosageinstructiondoseandrateraterangelow.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwCd("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwCd("]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwUnt("[[");}
		if(medicationrequestdosageinstructiondoseandrateraterangelow.hasUnit()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwUnt(String.valueOf(medicationrequestdosageinstructiondoseandrateraterangelow.getUnit()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwUnt("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwUnt("]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwSys("[[");}
		if(medicationrequestdosageinstructiondoseandrateraterangelow.hasSystem()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwSys(String.valueOf(medicationrequestdosageinstructiondoseandrateraterangelow.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwSys("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRngLwSys("]]");}


		/******************** medicationrequestdosageinstructiondoseandrateraterangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandrateraterangehigh = medicationrequestdosageinstructiondoseandrateraterange.getHigh();

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiVl("[[");}
		if(medicationrequestdosageinstructiondoseandrateraterangehigh.hasValue()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiVl(String.valueOf(medicationrequestdosageinstructiondoseandrateraterangehigh.getValue()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiVl("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiVl("]]");}


		/******************** medicationrequestdosageinstructiondoseandrateraterangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiondoseandrateraterangehighcomparator = medicationrequestdosageinstructiondoseandrateraterangehigh.getComparator();
		if(medicationrequestdosageinstructiondoseandrateraterangehighcomparator!=null) {
		if(medicationrequestdosageinstructiondoseandratei == 0) {

		m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiCmprtr("[[");		}
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiCmprtr(medicationrequestdosageinstructiondoseandrateraterangehighcomparator.toCode());
		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {

		m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiCmprtr("]]");		}

		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiCmprtr("NULL");
		}

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiCd("[[");}
		if(medicationrequestdosageinstructiondoseandrateraterangehigh.hasCode()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiCd(String.valueOf(medicationrequestdosageinstructiondoseandrateraterangehigh.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiCd("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiCd("]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiUnt("[[");}
		if(medicationrequestdosageinstructiondoseandrateraterangehigh.hasUnit()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiUnt(String.valueOf(medicationrequestdosageinstructiondoseandrateraterangehigh.getUnit()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiUnt("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiUnt("]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiSys("[[");}
		if(medicationrequestdosageinstructiondoseandrateraterangehigh.hasSystem()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiSys(String.valueOf(medicationrequestdosageinstructiondoseandrateraterangehigh.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiSys("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtRtRngHiSys("]]");}


		/******************** medicationrequestdosageinstructiondoseandratedosequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiondoseandratedosequantity = medicationrequestdosageinstructiondoseandrate.getDoseQuantity();

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntyVl("[[");}
		if(medicationrequestdosageinstructiondoseandratedosequantity.hasValue()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntyVl(String.valueOf(medicationrequestdosageinstructiondoseandratedosequantity.getValue()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntyVl("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntyVl("]]");}


		/******************** medicationrequestdosageinstructiondoseandratedosequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiondoseandratedosequantitycomparator = medicationrequestdosageinstructiondoseandratedosequantity.getComparator();
		if(medicationrequestdosageinstructiondoseandratedosequantitycomparator!=null) {
		if(medicationrequestdosageinstructiondoseandratei == 0) {

		m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntyCmprtr("[[");		}
			m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntyCmprtr(medicationrequestdosageinstructiondoseandratedosequantitycomparator.toCode());
		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {

		m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntyCmprtr("]]");		}

		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntyCmprtr("NULL");
		}

		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntyCd("[[");}
		if(medicationrequestdosageinstructiondoseandratedosequantity.hasCode()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntyCd(String.valueOf(medicationrequestdosageinstructiondoseandratedosequantity.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntyCd("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntyCd("]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntyUnt("[[");}
		if(medicationrequestdosageinstructiondoseandratedosequantity.hasUnit()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntyUnt(String.valueOf(medicationrequestdosageinstructiondoseandratedosequantity.getUnit()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntyUnt("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntyUnt("]]");}


		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiondoseandratei == 0) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntySys("[[");}
		if(medicationrequestdosageinstructiondoseandratedosequantity.hasSystem()) {

			m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntySys(String.valueOf(medicationrequestdosageinstructiondoseandratedosequantity.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntySys("NULL");
		}

		if(medicationrequestdosageinstructiondoseandratei == medicationrequestdosageinstructiondoseandratelist.size()-1) {m.addMdctnRqstDsgInstrctnDoseAndRtDoseQntySys("]]");}


		 };
		/******************** MdctnRqst_DsgInstrctn_Sqnc ********************************************************************************/
		if(medicationrequestdosageinstruction.hasSequence()) {

			m.addMdctnRqstDsgInstrctnSqnc(String.valueOf(medicationrequestdosageinstruction.getSequence()));
		} else {
			m.addMdctnRqstDsgInstrctnSqnc("NULL");
		}


		/******************** medicationrequestdosageinstructionsite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructionsite = medicationrequestdosageinstruction.getSite();

		/******************** MdctnRqst_DsgInstrctn_Site_Txt ********************************************************************************/
		if(medicationrequestdosageinstructionsite.hasText()) {

			m.addMdctnRqstDsgInstrctnSiteTxt(String.valueOf(medicationrequestdosageinstructionsite.getText()));
		} else {
			m.addMdctnRqstDsgInstrctnSiteTxt("NULL");
		}


		/******************** medicationrequestdosageinstructionsitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationrequestdosageinstructionsitecodinglist = medicationrequestdosageinstructionsite.getCoding();
		for(int medicationrequestdosageinstructionsitecodingi = 0; medicationrequestdosageinstructionsitecodingi<medicationrequestdosageinstructionsitecodinglist.size();medicationrequestdosageinstructionsitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationrequestdosageinstructionsitecoding = medicationrequestdosageinstructionsitecodinglist.get(medicationrequestdosageinstructionsitecodingi);

		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_Dsply ********************************************************************************/
		if(medicationrequestdosageinstructionsitecodingi == 0) {m.addMdctnRqstDsgInstrctnSiteCdgDsply("[[");}
		if(medicationrequestdosageinstructionsitecoding.hasDisplay()) {

			m.addMdctnRqstDsgInstrctnSiteCdgDsply(String.valueOf(medicationrequestdosageinstructionsitecoding.getDisplay()));
		} else {
			m.addMdctnRqstDsgInstrctnSiteCdgDsply("NULL");
		}

		if(medicationrequestdosageinstructionsitecodingi == medicationrequestdosageinstructionsitecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnSiteCdgDsply("]]");}


		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestdosageinstructionsitecodingi == 0) {m.addMdctnRqstDsgInstrctnSiteCdgVrsn("[[");}
		if(medicationrequestdosageinstructionsitecoding.hasVersion()) {

			m.addMdctnRqstDsgInstrctnSiteCdgVrsn(String.valueOf(medicationrequestdosageinstructionsitecoding.getVersion()));
		} else {
			m.addMdctnRqstDsgInstrctnSiteCdgVrsn("NULL");
		}

		if(medicationrequestdosageinstructionsitecodingi == medicationrequestdosageinstructionsitecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnSiteCdgVrsn("]]");}


		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_Cd ********************************************************************************/
		if(medicationrequestdosageinstructionsitecodingi == 0) {m.addMdctnRqstDsgInstrctnSiteCdgCd("[[");}
		if(medicationrequestdosageinstructionsitecoding.hasCode()) {

			m.addMdctnRqstDsgInstrctnSiteCdgCd(String.valueOf(medicationrequestdosageinstructionsitecoding.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnSiteCdgCd("NULL");
		}

		if(medicationrequestdosageinstructionsitecodingi == medicationrequestdosageinstructionsitecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnSiteCdgCd("]]");}


		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestdosageinstructionsitecodingi == 0) {m.addMdctnRqstDsgInstrctnSiteCdgUsrSltd("[[");}
		if(medicationrequestdosageinstructionsitecoding.hasUserSelected()) {

			m.addMdctnRqstDsgInstrctnSiteCdgUsrSltd(String.valueOf(medicationrequestdosageinstructionsitecoding.getUserSelected()));
		} else {
			m.addMdctnRqstDsgInstrctnSiteCdgUsrSltd("NULL");
		}

		if(medicationrequestdosageinstructionsitecodingi == medicationrequestdosageinstructionsitecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnSiteCdgUsrSltd("]]");}


		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_Sys ********************************************************************************/
		if(medicationrequestdosageinstructionsitecodingi == 0) {m.addMdctnRqstDsgInstrctnSiteCdgSys("[[");}
		if(medicationrequestdosageinstructionsitecoding.hasSystem()) {

			m.addMdctnRqstDsgInstrctnSiteCdgSys(String.valueOf(medicationrequestdosageinstructionsitecoding.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnSiteCdgSys("NULL");
		}

		if(medicationrequestdosageinstructionsitecodingi == medicationrequestdosageinstructionsitecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnSiteCdgSys("]]");}


		 };
		/******************** MdctnRqst_DsgInstrctn_PntInstrctn ********************************************************************************/
		if(medicationrequestdosageinstruction.hasPatientInstruction()) {

			m.addMdctnRqstDsgInstrctnPntInstrctn(String.valueOf(medicationrequestdosageinstruction.getPatientInstruction()));
		} else {
			m.addMdctnRqstDsgInstrctnPntInstrctn("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_Txt ********************************************************************************/
		if(medicationrequestdosageinstruction.hasText()) {

			m.addMdctnRqstDsgInstrctnTxt(String.valueOf(medicationrequestdosageinstruction.getText()));
		} else {
			m.addMdctnRqstDsgInstrctnTxt("NULL");
		}


		/******************** medicationrequestdosageinstructiontiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing medicationrequestdosageinstructiontiming = medicationrequestdosageinstruction.getTiming();

		/******************** medicationrequestdosageinstructiontimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructiontimingcode = medicationrequestdosageinstructiontiming.getCode();

		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Txt ********************************************************************************/
		if(medicationrequestdosageinstructiontimingcode.hasText()) {

			m.addMdctnRqstDsgInstrctnTmgCdTxt(String.valueOf(medicationrequestdosageinstructiontimingcode.getText()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgCdTxt("NULL");
		}


		/******************** medicationrequestdosageinstructiontimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationrequestdosageinstructiontimingcodecodinglist = medicationrequestdosageinstructiontimingcode.getCoding();
		for(int medicationrequestdosageinstructiontimingcodecodingi = 0; medicationrequestdosageinstructiontimingcodecodingi<medicationrequestdosageinstructiontimingcodecodinglist.size();medicationrequestdosageinstructiontimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationrequestdosageinstructiontimingcodecoding = medicationrequestdosageinstructiontimingcodecodinglist.get(medicationrequestdosageinstructiontimingcodecodingi);

		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(medicationrequestdosageinstructiontimingcodecodingi == 0) {m.addMdctnRqstDsgInstrctnTmgCdCdgDsply("[[");}
		if(medicationrequestdosageinstructiontimingcodecoding.hasDisplay()) {

			m.addMdctnRqstDsgInstrctnTmgCdCdgDsply(String.valueOf(medicationrequestdosageinstructiontimingcodecoding.getDisplay()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgCdCdgDsply("NULL");
		}

		if(medicationrequestdosageinstructiontimingcodecodingi == medicationrequestdosageinstructiontimingcodecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnTmgCdCdgDsply("]]");}


		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestdosageinstructiontimingcodecodingi == 0) {m.addMdctnRqstDsgInstrctnTmgCdCdgVrsn("[[");}
		if(medicationrequestdosageinstructiontimingcodecoding.hasVersion()) {

			m.addMdctnRqstDsgInstrctnTmgCdCdgVrsn(String.valueOf(medicationrequestdosageinstructiontimingcodecoding.getVersion()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgCdCdgVrsn("NULL");
		}

		if(medicationrequestdosageinstructiontimingcodecodingi == medicationrequestdosageinstructiontimingcodecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnTmgCdCdgVrsn("]]");}


		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiontimingcodecodingi == 0) {m.addMdctnRqstDsgInstrctnTmgCdCdgCd("[[");}
		if(medicationrequestdosageinstructiontimingcodecoding.hasCode()) {

			m.addMdctnRqstDsgInstrctnTmgCdCdgCd(String.valueOf(medicationrequestdosageinstructiontimingcodecoding.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgCdCdgCd("NULL");
		}

		if(medicationrequestdosageinstructiontimingcodecodingi == medicationrequestdosageinstructiontimingcodecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnTmgCdCdgCd("]]");}


		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestdosageinstructiontimingcodecodingi == 0) {m.addMdctnRqstDsgInstrctnTmgCdCdgUsrSltd("[[");}
		if(medicationrequestdosageinstructiontimingcodecoding.hasUserSelected()) {

			m.addMdctnRqstDsgInstrctnTmgCdCdgUsrSltd(String.valueOf(medicationrequestdosageinstructiontimingcodecoding.getUserSelected()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgCdCdgUsrSltd("NULL");
		}

		if(medicationrequestdosageinstructiontimingcodecodingi == medicationrequestdosageinstructiontimingcodecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnTmgCdCdgUsrSltd("]]");}


		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiontimingcodecodingi == 0) {m.addMdctnRqstDsgInstrctnTmgCdCdgSys("[[");}
		if(medicationrequestdosageinstructiontimingcodecoding.hasSystem()) {

			m.addMdctnRqstDsgInstrctnTmgCdCdgSys(String.valueOf(medicationrequestdosageinstructiontimingcodecoding.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgCdCdgSys("NULL");
		}

		if(medicationrequestdosageinstructiontimingcodecodingi == medicationrequestdosageinstructiontimingcodecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnTmgCdCdgSys("]]");}


		 };
		/******************** MdctnRqst_DsgInstrctn_Tmg_Evnt ********************************************************************************/
		if(medicationrequestdosageinstructiontiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<medicationrequestdosageinstructiontiming.getEvent().size(); incr++) {
				array = array + medicationrequestdosageinstructiontiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnRqstDsgInstrctnTmgEvnt(array);

		} else {
			m.addMdctnRqstDsgInstrctnTmgEvnt("NULL");
		}


		/******************** medicationrequestdosageinstructiontimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent medicationrequestdosageinstructiontimingrepeat = medicationrequestdosageinstructiontiming.getRepeat();

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Off ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeat.hasOffset()) {

			m.addMdctnRqstDsgInstrctnTmgRptOff(String.valueOf(medicationrequestdosageinstructiontimingrepeat.getOffset()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptOff("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Cnt ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeat.hasCount()) {

			m.addMdctnRqstDsgInstrctnTmgRptCnt(String.valueOf(medicationrequestdosageinstructiontimingrepeat.getCount()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptCnt("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Prd ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeat.hasPeriod()) {

			m.addMdctnRqstDsgInstrctnTmgRptPrd(String.valueOf(medicationrequestdosageinstructiontimingrepeat.getPeriod()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptPrd("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_CntMx ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeat.hasCountMax()) {

			m.addMdctnRqstDsgInstrctnTmgRptCntMx(String.valueOf(medicationrequestdosageinstructiontimingrepeat.getCountMax()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptCntMx("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_DurationMx ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeat.hasDurationMax()) {

			m.addMdctnRqstDsgInstrctnTmgRptDurationMx(String.valueOf(medicationrequestdosageinstructiontimingrepeat.getDurationMax()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptDurationMx("NULL");
		}


		/******************** medicationrequestdosageinstructiontimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationrequestdosageinstructiontimingrepeatboundsperiod = medicationrequestdosageinstructiontimingrepeat.getBoundsPeriod();

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsperiod.hasStart()) {

			m.addMdctnRqstDsgInstrctnTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationrequestdosageinstructiontimingrepeatboundsperiod.getStart())+"\"");
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptBndsPrdStrt("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsperiod.hasEnd()) {

			m.addMdctnRqstDsgInstrctnTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationrequestdosageinstructiontimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptBndsPrdEnd("NULL");
		}


		/******************** medicationrequestdosageinstructiontimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime medicationrequestdosageinstructiontimingrepeatdurationunit = medicationrequestdosageinstructiontimingrepeat.getDurationUnit();
		if(medicationrequestdosageinstructiontimingrepeatdurationunit!=null) {
			m.addMdctnRqstDsgInstrctnTmgRptDurationUnt(medicationrequestdosageinstructiontimingrepeatdurationunit.toCode());
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptDurationUnt("NULL");
		}

		/******************** medicationrequestdosageinstructiontimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationrequestdosageinstructiontimingrepeatboundsduration = medicationrequestdosageinstructiontimingrepeat.getBoundsDuration();

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsduration.hasValue()) {

			m.addMdctnRqstDsgInstrctnTmgRptBndsDurationVl(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsduration.getValue()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptBndsDurationVl("NULL");
		}


		/******************** medicationrequestdosageinstructiontimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiontimingrepeatboundsdurationcomparator = medicationrequestdosageinstructiontimingrepeatboundsduration.getComparator();
		if(medicationrequestdosageinstructiontimingrepeatboundsdurationcomparator!=null) {
			m.addMdctnRqstDsgInstrctnTmgRptBndsDurationCmprtr(medicationrequestdosageinstructiontimingrepeatboundsdurationcomparator.toCode());
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsduration.hasCode()) {

			m.addMdctnRqstDsgInstrctnTmgRptBndsDurationCd(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsduration.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptBndsDurationCd("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsduration.hasUnit()) {

			m.addMdctnRqstDsgInstrctnTmgRptBndsDurationUnt(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsduration.getUnit()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptBndsDurationUnt("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsduration.hasSystem()) {

			m.addMdctnRqstDsgInstrctnTmgRptBndsDurationSys(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsduration.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptBndsDurationSys("NULL");
		}


		/******************** medicationrequestdosageinstructiontimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationrequestdosageinstructiontimingrepeatboundsrange = medicationrequestdosageinstructiontimingrepeat.getBoundsRange();

		/******************** medicationrequestdosageinstructiontimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiontimingrepeatboundsrangelow = medicationrequestdosageinstructiontimingrepeatboundsrange.getLow();

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsrangelow.hasValue()) {

			m.addMdctnRqstDsgInstrctnTmgRptBndsRngLwVl(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsrangelow.getValue()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptBndsRngLwVl("NULL");
		}


		/******************** medicationrequestdosageinstructiontimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiontimingrepeatboundsrangelowcomparator = medicationrequestdosageinstructiontimingrepeatboundsrangelow.getComparator();
		if(medicationrequestdosageinstructiontimingrepeatboundsrangelowcomparator!=null) {
			m.addMdctnRqstDsgInstrctnTmgRptBndsRngLwCmprtr(medicationrequestdosageinstructiontimingrepeatboundsrangelowcomparator.toCode());
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsrangelow.hasCode()) {

			m.addMdctnRqstDsgInstrctnTmgRptBndsRngLwCd(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsrangelow.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptBndsRngLwCd("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsrangelow.hasUnit()) {

			m.addMdctnRqstDsgInstrctnTmgRptBndsRngLwUnt(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsrangelow.getUnit()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptBndsRngLwUnt("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsrangelow.hasSystem()) {

			m.addMdctnRqstDsgInstrctnTmgRptBndsRngLwSys(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsrangelow.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptBndsRngLwSys("NULL");
		}


		/******************** medicationrequestdosageinstructiontimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructiontimingrepeatboundsrangehigh = medicationrequestdosageinstructiontimingrepeatboundsrange.getHigh();

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsrangehigh.hasValue()) {

			m.addMdctnRqstDsgInstrctnTmgRptBndsRngHiVl(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsrangehigh.getValue()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptBndsRngHiVl("NULL");
		}


		/******************** medicationrequestdosageinstructiontimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructiontimingrepeatboundsrangehighcomparator = medicationrequestdosageinstructiontimingrepeatboundsrangehigh.getComparator();
		if(medicationrequestdosageinstructiontimingrepeatboundsrangehighcomparator!=null) {
			m.addMdctnRqstDsgInstrctnTmgRptBndsRngHiCmprtr(medicationrequestdosageinstructiontimingrepeatboundsrangehighcomparator.toCode());
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsrangehigh.hasCode()) {

			m.addMdctnRqstDsgInstrctnTmgRptBndsRngHiCd(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsrangehigh.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptBndsRngHiCd("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsrangehigh.hasUnit()) {

			m.addMdctnRqstDsgInstrctnTmgRptBndsRngHiUnt(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsrangehigh.getUnit()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptBndsRngHiUnt("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeatboundsrangehigh.hasSystem()) {

			m.addMdctnRqstDsgInstrctnTmgRptBndsRngHiSys(String.valueOf(medicationrequestdosageinstructiontimingrepeatboundsrangehigh.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptBndsRngHiSys("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeat.hasFrequencyMax()) {

			m.addMdctnRqstDsgInstrctnTmgRptFrqncyMx(String.valueOf(medicationrequestdosageinstructiontimingrepeat.getFrequencyMax()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptFrqncyMx("NULL");
		}


		/******************** medicationrequestdosageinstructiontimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> medicationrequestdosageinstructiontimingrepeatwhenlist = medicationrequestdosageinstructiontimingrepeat.getWhen();
		for(int medicationrequestdosageinstructiontimingrepeatwheni = 0; medicationrequestdosageinstructiontimingrepeatwheni<medicationrequestdosageinstructiontimingrepeatwhenlist.size();medicationrequestdosageinstructiontimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  medicationrequestdosageinstructiontimingrepeatwhen = medicationrequestdosageinstructiontimingrepeatwhenlist.get(medicationrequestdosageinstructiontimingrepeatwheni);
		if(medicationrequestdosageinstructiontimingrepeatwhen!=null) {
			m.addMdctnRqstDsgInstrctnTmgRptWhen(medicationrequestdosageinstructiontimingrepeatwhen.getCode());
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptWhen("NULL");
		}
		 };

		/******************** medicationrequestdosageinstructiontimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime medicationrequestdosageinstructiontimingrepeatperiodunit = medicationrequestdosageinstructiontimingrepeat.getPeriodUnit();
		if(medicationrequestdosageinstructiontimingrepeatperiodunit!=null) {
			m.addMdctnRqstDsgInstrctnTmgRptPrdUnt(medicationrequestdosageinstructiontimingrepeatperiodunit.toCode());
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptPrdUnt("NULL");
		}

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_PrdMx ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeat.hasPeriodMax()) {

			m.addMdctnRqstDsgInstrctnTmgRptPrdMx(String.valueOf(medicationrequestdosageinstructiontimingrepeat.getPeriodMax()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptPrdMx("NULL");
		}


		/******************** medicationrequestdosageinstructiontimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> medicationrequestdosageinstructiontimingrepeatdayofweeklist = medicationrequestdosageinstructiontimingrepeat.getDayOfWeek();
		for(int medicationrequestdosageinstructiontimingrepeatdayofweeki = 0; medicationrequestdosageinstructiontimingrepeatdayofweeki<medicationrequestdosageinstructiontimingrepeatdayofweeklist.size();medicationrequestdosageinstructiontimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  medicationrequestdosageinstructiontimingrepeatdayofweek = medicationrequestdosageinstructiontimingrepeatdayofweeklist.get(medicationrequestdosageinstructiontimingrepeatdayofweeki);
		if(medicationrequestdosageinstructiontimingrepeatdayofweek!=null) {
			m.addMdctnRqstDsgInstrctnTmgRptDayOfWeek(medicationrequestdosageinstructiontimingrepeatdayofweek.getCode());
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_TimeOfDay ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<medicationrequestdosageinstructiontimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + medicationrequestdosageinstructiontimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnRqstDsgInstrctnTmgRptTimeOfDay(array);

		} else {
			m.addMdctnRqstDsgInstrctnTmgRptTimeOfDay("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Duration ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeat.hasDuration()) {

			m.addMdctnRqstDsgInstrctnTmgRptDuration(String.valueOf(medicationrequestdosageinstructiontimingrepeat.getDuration()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptDuration("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Frqncy ********************************************************************************/
		if(medicationrequestdosageinstructiontimingrepeat.hasFrequency()) {

			m.addMdctnRqstDsgInstrctnTmgRptFrqncy(String.valueOf(medicationrequestdosageinstructiontimingrepeat.getFrequency()));
		} else {
			m.addMdctnRqstDsgInstrctnTmgRptFrqncy("NULL");
		}


		/******************** medicationrequestdosageinstructionmaxdoseperadministration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructionmaxdoseperadministration = medicationrequestdosageinstruction.getMaxDosePerAdministration();

		/******************** MdctnRqst_DsgInstrctn_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperadministration.hasValue()) {

			m.addMdctnRqstDsgInstrctnMxDosePerAdmnstnVl(String.valueOf(medicationrequestdosageinstructionmaxdoseperadministration.getValue()));
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerAdmnstnVl("NULL");
		}


		/******************** medicationrequestdosageinstructionmaxdoseperadministrationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructionmaxdoseperadministrationcomparator = medicationrequestdosageinstructionmaxdoseperadministration.getComparator();
		if(medicationrequestdosageinstructionmaxdoseperadministrationcomparator!=null) {
			m.addMdctnRqstDsgInstrctnMxDosePerAdmnstnCmprtr(medicationrequestdosageinstructionmaxdoseperadministrationcomparator.toCode());
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerAdmnstnCmprtr("NULL");
		}

		/******************** MdctnRqst_DsgInstrctn_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperadministration.hasCode()) {

			m.addMdctnRqstDsgInstrctnMxDosePerAdmnstnCd(String.valueOf(medicationrequestdosageinstructionmaxdoseperadministration.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerAdmnstnCd("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperadministration.hasUnit()) {

			m.addMdctnRqstDsgInstrctnMxDosePerAdmnstnUnt(String.valueOf(medicationrequestdosageinstructionmaxdoseperadministration.getUnit()));
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerAdmnstnUnt("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperadministration.hasSystem()) {

			m.addMdctnRqstDsgInstrctnMxDosePerAdmnstnSys(String.valueOf(medicationrequestdosageinstructionmaxdoseperadministration.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerAdmnstnSys("NULL");
		}


		/******************** medicationrequestdosageinstructionmaxdoseperperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationrequestdosageinstructionmaxdoseperperiod = medicationrequestdosageinstruction.getMaxDosePerPeriod();

		/******************** medicationrequestdosageinstructionmaxdoseperperiodnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructionmaxdoseperperiodnumerator = medicationrequestdosageinstructionmaxdoseperperiod.getNumerator();

		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperperiodnumerator.hasValue()) {

			m.addMdctnRqstDsgInstrctnMxDosePerPrdNmrtrVl(String.valueOf(medicationrequestdosageinstructionmaxdoseperperiodnumerator.getValue()));
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerPrdNmrtrVl("NULL");
		}


		/******************** medicationrequestdosageinstructionmaxdoseperperiodnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructionmaxdoseperperiodnumeratorcomparator = medicationrequestdosageinstructionmaxdoseperperiodnumerator.getComparator();
		if(medicationrequestdosageinstructionmaxdoseperperiodnumeratorcomparator!=null) {
			m.addMdctnRqstDsgInstrctnMxDosePerPrdNmrtrCmprtr(medicationrequestdosageinstructionmaxdoseperperiodnumeratorcomparator.toCode());
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerPrdNmrtrCmprtr("NULL");
		}

		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperperiodnumerator.hasCode()) {

			m.addMdctnRqstDsgInstrctnMxDosePerPrdNmrtrCd(String.valueOf(medicationrequestdosageinstructionmaxdoseperperiodnumerator.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerPrdNmrtrCd("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperperiodnumerator.hasUnit()) {

			m.addMdctnRqstDsgInstrctnMxDosePerPrdNmrtrUnt(String.valueOf(medicationrequestdosageinstructionmaxdoseperperiodnumerator.getUnit()));
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerPrdNmrtrUnt("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperperiodnumerator.hasSystem()) {

			m.addMdctnRqstDsgInstrctnMxDosePerPrdNmrtrSys(String.valueOf(medicationrequestdosageinstructionmaxdoseperperiodnumerator.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerPrdNmrtrSys("NULL");
		}


		/******************** medicationrequestdosageinstructionmaxdoseperperioddenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructionmaxdoseperperioddenominator = medicationrequestdosageinstructionmaxdoseperperiod.getDenominator();

		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperperioddenominator.hasValue()) {

			m.addMdctnRqstDsgInstrctnMxDosePerPrdDnmntrVl(String.valueOf(medicationrequestdosageinstructionmaxdoseperperioddenominator.getValue()));
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerPrdDnmntrVl("NULL");
		}


		/******************** medicationrequestdosageinstructionmaxdoseperperioddenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructionmaxdoseperperioddenominatorcomparator = medicationrequestdosageinstructionmaxdoseperperioddenominator.getComparator();
		if(medicationrequestdosageinstructionmaxdoseperperioddenominatorcomparator!=null) {
			m.addMdctnRqstDsgInstrctnMxDosePerPrdDnmntrCmprtr(medicationrequestdosageinstructionmaxdoseperperioddenominatorcomparator.toCode());
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerPrdDnmntrCmprtr("NULL");
		}

		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperperioddenominator.hasCode()) {

			m.addMdctnRqstDsgInstrctnMxDosePerPrdDnmntrCd(String.valueOf(medicationrequestdosageinstructionmaxdoseperperioddenominator.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerPrdDnmntrCd("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperperioddenominator.hasUnit()) {

			m.addMdctnRqstDsgInstrctnMxDosePerPrdDnmntrUnt(String.valueOf(medicationrequestdosageinstructionmaxdoseperperioddenominator.getUnit()));
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerPrdDnmntrUnt("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperperioddenominator.hasSystem()) {

			m.addMdctnRqstDsgInstrctnMxDosePerPrdDnmntrSys(String.valueOf(medicationrequestdosageinstructionmaxdoseperperioddenominator.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerPrdDnmntrSys("NULL");
		}


		/******************** medicationrequestdosageinstructionadditionalinstruction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicationrequestdosageinstructionadditionalinstructionlist = medicationrequestdosageinstruction.getAdditionalInstruction();
		for(int medicationrequestdosageinstructionadditionalinstructioni = 0; medicationrequestdosageinstructionadditionalinstructioni<medicationrequestdosageinstructionadditionalinstructionlist.size();medicationrequestdosageinstructionadditionalinstructioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicationrequestdosageinstructionadditionalinstruction = medicationrequestdosageinstructionadditionalinstructionlist.get(medicationrequestdosageinstructionadditionalinstructioni);

		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Txt ********************************************************************************/
		if(medicationrequestdosageinstructionadditionalinstructioni == 0) {m.addMdctnRqstDsgInstrctnAddtnlInstrctnTxt("[[");}
		if(medicationrequestdosageinstructionadditionalinstruction.hasText()) {

			m.addMdctnRqstDsgInstrctnAddtnlInstrctnTxt(String.valueOf(medicationrequestdosageinstructionadditionalinstruction.getText()));
		} else {
			m.addMdctnRqstDsgInstrctnAddtnlInstrctnTxt("NULL");
		}

		if(medicationrequestdosageinstructionadditionalinstructioni == medicationrequestdosageinstructionadditionalinstructionlist.size()-1) {m.addMdctnRqstDsgInstrctnAddtnlInstrctnTxt("]]");}


		/******************** medicationrequestdosageinstructionadditionalinstructioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationrequestdosageinstructionadditionalinstructioncodinglist = medicationrequestdosageinstructionadditionalinstruction.getCoding();
		for(int medicationrequestdosageinstructionadditionalinstructioncodingi = 0; medicationrequestdosageinstructionadditionalinstructioncodingi<medicationrequestdosageinstructionadditionalinstructioncodinglist.size();medicationrequestdosageinstructionadditionalinstructioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationrequestdosageinstructionadditionalinstructioncoding = medicationrequestdosageinstructionadditionalinstructioncodinglist.get(medicationrequestdosageinstructionadditionalinstructioncodingi);

		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(medicationrequestdosageinstructionadditionalinstructioncodingi == 0) {m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgDsply("[[[");}
		if(medicationrequestdosageinstructionadditionalinstructioncoding.hasDisplay()) {

			m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgDsply(String.valueOf(medicationrequestdosageinstructionadditionalinstructioncoding.getDisplay()));
		} else {
			m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgDsply("NULL");
		}

		if(medicationrequestdosageinstructionadditionalinstructioncodingi == medicationrequestdosageinstructionadditionalinstructioncodinglist.size()-1) {m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgDsply("]]]");}


		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestdosageinstructionadditionalinstructioncodingi == 0) {m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgVrsn("[[[");}
		if(medicationrequestdosageinstructionadditionalinstructioncoding.hasVersion()) {

			m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgVrsn(String.valueOf(medicationrequestdosageinstructionadditionalinstructioncoding.getVersion()));
		} else {
			m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgVrsn("NULL");
		}

		if(medicationrequestdosageinstructionadditionalinstructioncodingi == medicationrequestdosageinstructionadditionalinstructioncodinglist.size()-1) {m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgVrsn("]]]");}


		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(medicationrequestdosageinstructionadditionalinstructioncodingi == 0) {m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgCd("[[[");}
		if(medicationrequestdosageinstructionadditionalinstructioncoding.hasCode()) {

			m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgCd(String.valueOf(medicationrequestdosageinstructionadditionalinstructioncoding.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgCd("NULL");
		}

		if(medicationrequestdosageinstructionadditionalinstructioncodingi == medicationrequestdosageinstructionadditionalinstructioncodinglist.size()-1) {m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgCd("]]]");}


		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestdosageinstructionadditionalinstructioncodingi == 0) {m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgUsrSltd("[[[");}
		if(medicationrequestdosageinstructionadditionalinstructioncoding.hasUserSelected()) {

			m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgUsrSltd(String.valueOf(medicationrequestdosageinstructionadditionalinstructioncoding.getUserSelected()));
		} else {
			m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgUsrSltd("NULL");
		}

		if(medicationrequestdosageinstructionadditionalinstructioncodingi == medicationrequestdosageinstructionadditionalinstructioncodinglist.size()-1) {m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgUsrSltd("]]]");}


		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(medicationrequestdosageinstructionadditionalinstructioncodingi == 0) {m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgSys("[[[");}
		if(medicationrequestdosageinstructionadditionalinstructioncoding.hasSystem()) {

			m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgSys(String.valueOf(medicationrequestdosageinstructionadditionalinstructioncoding.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgSys("NULL");
		}

		if(medicationrequestdosageinstructionadditionalinstructioncodingi == medicationrequestdosageinstructionadditionalinstructioncodinglist.size()-1) {m.addMdctnRqstDsgInstrctnAddtnlInstrctnCdgSys("]]]");}


		 };
		 };
		/******************** medicationrequestdosageinstructionmaxdoseperlifetime ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdosageinstructionmaxdoseperlifetime = medicationrequestdosageinstruction.getMaxDosePerLifetime();

		/******************** MdctnRqst_DsgInstrctn_MxDosePerLifetime_Vl ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperlifetime.hasValue()) {

			m.addMdctnRqstDsgInstrctnMxDosePerLifetimeVl(String.valueOf(medicationrequestdosageinstructionmaxdoseperlifetime.getValue()));
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerLifetimeVl("NULL");
		}


		/******************** medicationrequestdosageinstructionmaxdoseperlifetimecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdosageinstructionmaxdoseperlifetimecomparator = medicationrequestdosageinstructionmaxdoseperlifetime.getComparator();
		if(medicationrequestdosageinstructionmaxdoseperlifetimecomparator!=null) {
			m.addMdctnRqstDsgInstrctnMxDosePerLifetimeCmprtr(medicationrequestdosageinstructionmaxdoseperlifetimecomparator.toCode());
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerLifetimeCmprtr("NULL");
		}

		/******************** MdctnRqst_DsgInstrctn_MxDosePerLifetime_Cd ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperlifetime.hasCode()) {

			m.addMdctnRqstDsgInstrctnMxDosePerLifetimeCd(String.valueOf(medicationrequestdosageinstructionmaxdoseperlifetime.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerLifetimeCd("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_MxDosePerLifetime_Unt ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperlifetime.hasUnit()) {

			m.addMdctnRqstDsgInstrctnMxDosePerLifetimeUnt(String.valueOf(medicationrequestdosageinstructionmaxdoseperlifetime.getUnit()));
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerLifetimeUnt("NULL");
		}


		/******************** MdctnRqst_DsgInstrctn_MxDosePerLifetime_Sys ********************************************************************************/
		if(medicationrequestdosageinstructionmaxdoseperlifetime.hasSystem()) {

			m.addMdctnRqstDsgInstrctnMxDosePerLifetimeSys(String.valueOf(medicationrequestdosageinstructionmaxdoseperlifetime.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnMxDosePerLifetimeSys("NULL");
		}


		/******************** medicationrequestdosageinstructionasneededcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructionasneededcodeableconcept = medicationrequestdosageinstruction.getAsNeededCodeableConcept();

		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(medicationrequestdosageinstructionasneededcodeableconcept.hasText()) {

			m.addMdctnRqstDsgInstrctnAsNdCdbleCncptTxt(String.valueOf(medicationrequestdosageinstructionasneededcodeableconcept.getText()));
		} else {
			m.addMdctnRqstDsgInstrctnAsNdCdbleCncptTxt("NULL");
		}


		/******************** medicationrequestdosageinstructionasneededcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationrequestdosageinstructionasneededcodeableconceptcodinglist = medicationrequestdosageinstructionasneededcodeableconcept.getCoding();
		for(int medicationrequestdosageinstructionasneededcodeableconceptcodingi = 0; medicationrequestdosageinstructionasneededcodeableconceptcodingi<medicationrequestdosageinstructionasneededcodeableconceptcodinglist.size();medicationrequestdosageinstructionasneededcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationrequestdosageinstructionasneededcodeableconceptcoding = medicationrequestdosageinstructionasneededcodeableconceptcodinglist.get(medicationrequestdosageinstructionasneededcodeableconceptcodingi);

		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationrequestdosageinstructionasneededcodeableconceptcodingi == 0) {m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgDsply("[[");}
		if(medicationrequestdosageinstructionasneededcodeableconceptcoding.hasDisplay()) {

			m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgDsply(String.valueOf(medicationrequestdosageinstructionasneededcodeableconceptcoding.getDisplay()));
		} else {
			m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgDsply("NULL");
		}

		if(medicationrequestdosageinstructionasneededcodeableconceptcodingi == medicationrequestdosageinstructionasneededcodeableconceptcodinglist.size()-1) {m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgDsply("]]");}


		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestdosageinstructionasneededcodeableconceptcodingi == 0) {m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgVrsn("[[");}
		if(medicationrequestdosageinstructionasneededcodeableconceptcoding.hasVersion()) {

			m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgVrsn(String.valueOf(medicationrequestdosageinstructionasneededcodeableconceptcoding.getVersion()));
		} else {
			m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgVrsn("NULL");
		}

		if(medicationrequestdosageinstructionasneededcodeableconceptcodingi == medicationrequestdosageinstructionasneededcodeableconceptcodinglist.size()-1) {m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgVrsn("]]");}


		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationrequestdosageinstructionasneededcodeableconceptcodingi == 0) {m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgCd("[[");}
		if(medicationrequestdosageinstructionasneededcodeableconceptcoding.hasCode()) {

			m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgCd(String.valueOf(medicationrequestdosageinstructionasneededcodeableconceptcoding.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgCd("NULL");
		}

		if(medicationrequestdosageinstructionasneededcodeableconceptcodingi == medicationrequestdosageinstructionasneededcodeableconceptcodinglist.size()-1) {m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgCd("]]");}


		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestdosageinstructionasneededcodeableconceptcodingi == 0) {m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgUsrSltd("[[");}
		if(medicationrequestdosageinstructionasneededcodeableconceptcoding.hasUserSelected()) {

			m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgUsrSltd(String.valueOf(medicationrequestdosageinstructionasneededcodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicationrequestdosageinstructionasneededcodeableconceptcodingi == medicationrequestdosageinstructionasneededcodeableconceptcodinglist.size()-1) {m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgUsrSltd("]]");}


		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationrequestdosageinstructionasneededcodeableconceptcodingi == 0) {m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgSys("[[");}
		if(medicationrequestdosageinstructionasneededcodeableconceptcoding.hasSystem()) {

			m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgSys(String.valueOf(medicationrequestdosageinstructionasneededcodeableconceptcoding.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgSys("NULL");
		}

		if(medicationrequestdosageinstructionasneededcodeableconceptcodingi == medicationrequestdosageinstructionasneededcodeableconceptcodinglist.size()-1) {m.addMdctnRqstDsgInstrctnAsNdCdbleCncptCdgSys("]]");}


		 };
		/******************** MdctnRqst_DsgInstrctn_AsNdBooleanTyp ********************************************************************************/
		if(medicationrequestdosageinstruction.hasAsNeededBooleanType()) {

			m.addMdctnRqstDsgInstrctnAsNdBooleanTyp("\""+medicationrequestdosageinstruction.getAsNeededBooleanType().getValueAsString()+"\"");
		} else {
			m.addMdctnRqstDsgInstrctnAsNdBooleanTyp("NULL");
		}


		/******************** medicationrequestdosageinstructionroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestdosageinstructionroute = medicationrequestdosageinstruction.getRoute();

		/******************** MdctnRqst_DsgInstrctn_Route_Txt ********************************************************************************/
		if(medicationrequestdosageinstructionroute.hasText()) {

			m.addMdctnRqstDsgInstrctnRouteTxt(String.valueOf(medicationrequestdosageinstructionroute.getText()));
		} else {
			m.addMdctnRqstDsgInstrctnRouteTxt("NULL");
		}


		/******************** medicationrequestdosageinstructionroutecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationrequestdosageinstructionroutecodinglist = medicationrequestdosageinstructionroute.getCoding();
		for(int medicationrequestdosageinstructionroutecodingi = 0; medicationrequestdosageinstructionroutecodingi<medicationrequestdosageinstructionroutecodinglist.size();medicationrequestdosageinstructionroutecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationrequestdosageinstructionroutecoding = medicationrequestdosageinstructionroutecodinglist.get(medicationrequestdosageinstructionroutecodingi);

		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_Dsply ********************************************************************************/
		if(medicationrequestdosageinstructionroutecodingi == 0) {m.addMdctnRqstDsgInstrctnRouteCdgDsply("[[");}
		if(medicationrequestdosageinstructionroutecoding.hasDisplay()) {

			m.addMdctnRqstDsgInstrctnRouteCdgDsply(String.valueOf(medicationrequestdosageinstructionroutecoding.getDisplay()));
		} else {
			m.addMdctnRqstDsgInstrctnRouteCdgDsply("NULL");
		}

		if(medicationrequestdosageinstructionroutecodingi == medicationrequestdosageinstructionroutecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnRouteCdgDsply("]]");}


		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestdosageinstructionroutecodingi == 0) {m.addMdctnRqstDsgInstrctnRouteCdgVrsn("[[");}
		if(medicationrequestdosageinstructionroutecoding.hasVersion()) {

			m.addMdctnRqstDsgInstrctnRouteCdgVrsn(String.valueOf(medicationrequestdosageinstructionroutecoding.getVersion()));
		} else {
			m.addMdctnRqstDsgInstrctnRouteCdgVrsn("NULL");
		}

		if(medicationrequestdosageinstructionroutecodingi == medicationrequestdosageinstructionroutecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnRouteCdgVrsn("]]");}


		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_Cd ********************************************************************************/
		if(medicationrequestdosageinstructionroutecodingi == 0) {m.addMdctnRqstDsgInstrctnRouteCdgCd("[[");}
		if(medicationrequestdosageinstructionroutecoding.hasCode()) {

			m.addMdctnRqstDsgInstrctnRouteCdgCd(String.valueOf(medicationrequestdosageinstructionroutecoding.getCode()));
		} else {
			m.addMdctnRqstDsgInstrctnRouteCdgCd("NULL");
		}

		if(medicationrequestdosageinstructionroutecodingi == medicationrequestdosageinstructionroutecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnRouteCdgCd("]]");}


		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestdosageinstructionroutecodingi == 0) {m.addMdctnRqstDsgInstrctnRouteCdgUsrSltd("[[");}
		if(medicationrequestdosageinstructionroutecoding.hasUserSelected()) {

			m.addMdctnRqstDsgInstrctnRouteCdgUsrSltd(String.valueOf(medicationrequestdosageinstructionroutecoding.getUserSelected()));
		} else {
			m.addMdctnRqstDsgInstrctnRouteCdgUsrSltd("NULL");
		}

		if(medicationrequestdosageinstructionroutecodingi == medicationrequestdosageinstructionroutecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnRouteCdgUsrSltd("]]");}


		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_Sys ********************************************************************************/
		if(medicationrequestdosageinstructionroutecodingi == 0) {m.addMdctnRqstDsgInstrctnRouteCdgSys("[[");}
		if(medicationrequestdosageinstructionroutecoding.hasSystem()) {

			m.addMdctnRqstDsgInstrctnRouteCdgSys(String.valueOf(medicationrequestdosageinstructionroutecoding.getSystem()));
		} else {
			m.addMdctnRqstDsgInstrctnRouteCdgSys("NULL");
		}

		if(medicationrequestdosageinstructionroutecodingi == medicationrequestdosageinstructionroutecodinglist.size()-1) {m.addMdctnRqstDsgInstrctnRouteCdgSys("]]");}


		 };
		 };
		/******************** MdctnRqst_PriorPrescription ********************************************************************************/
		if(medicationrequest.hasPriorPrescription()) {

			if(medicationrequest.getPriorPrescription().getReference() != null) {
			m.addMdctnRqstPriorPrescription(medicationrequest.getPriorPrescription().getReference());
			}
		} else {
			m.addMdctnRqstPriorPrescription("NULL");
		}


		/******************** MdctnRqst_Insrnc ********************************************************************************/
		if(medicationrequest.hasInsurance()) {

			String  array = "[";
			for(int incr=0; incr<medicationrequest.getInsurance().size(); incr++) {
				array = array + medicationrequest.getInsurance().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnRqstInsrnc(array);

		} else {
			m.addMdctnRqstInsrnc("NULL");
		}


		/******************** MdctnRqst_InstantiatesCanonical ********************************************************************************/
		if(medicationrequest.hasInstantiatesCanonical()) {

			String  array = "[";
			for(int incr=0; incr<medicationrequest.getInstantiatesCanonical().size(); incr++) {
				array = array + medicationrequest.getInstantiatesCanonical().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnRqstInstantiatesCanonical(array);

		} else {
			m.addMdctnRqstInstantiatesCanonical("NULL");
		}


		/******************** medicationrequestdispenserequest ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestComponent medicationrequestdispenserequest = medicationrequest.getDispenseRequest();

		/******************** medicationrequestdispenserequestvalidityperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationrequestdispenserequestvalidityperiod = medicationrequestdispenserequest.getValidityPeriod();

		/******************** MdctnRqst_DispnsRqst_ValidityPrd_Strt ********************************************************************************/
		if(medicationrequestdispenserequestvalidityperiod.hasStart()) {

			m.addMdctnRqstDispnsRqstValidityPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationrequestdispenserequestvalidityperiod.getStart())+"\"");
		} else {
			m.addMdctnRqstDispnsRqstValidityPrdStrt("NULL");
		}


		/******************** MdctnRqst_DispnsRqst_ValidityPrd_End ********************************************************************************/
		if(medicationrequestdispenserequestvalidityperiod.hasEnd()) {

			m.addMdctnRqstDispnsRqstValidityPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationrequestdispenserequestvalidityperiod.getEnd())+"\"");
		} else {
			m.addMdctnRqstDispnsRqstValidityPrdEnd("NULL");
		}


		/******************** medicationrequestdispenserequestexpectedsupplyduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationrequestdispenserequestexpectedsupplyduration = medicationrequestdispenserequest.getExpectedSupplyDuration();

		/******************** MdctnRqst_DispnsRqst_ExpectedSpplyDuration_Vl ********************************************************************************/
		if(medicationrequestdispenserequestexpectedsupplyduration.hasValue()) {

			m.addMdctnRqstDispnsRqstExpectedSpplyDurationVl(String.valueOf(medicationrequestdispenserequestexpectedsupplyduration.getValue()));
		} else {
			m.addMdctnRqstDispnsRqstExpectedSpplyDurationVl("NULL");
		}


		/******************** medicationrequestdispenserequestexpectedsupplydurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdispenserequestexpectedsupplydurationcomparator = medicationrequestdispenserequestexpectedsupplyduration.getComparator();
		if(medicationrequestdispenserequestexpectedsupplydurationcomparator!=null) {
			m.addMdctnRqstDispnsRqstExpectedSpplyDurationCmprtr(medicationrequestdispenserequestexpectedsupplydurationcomparator.toCode());
		} else {
			m.addMdctnRqstDispnsRqstExpectedSpplyDurationCmprtr("NULL");
		}

		/******************** MdctnRqst_DispnsRqst_ExpectedSpplyDuration_Cd ********************************************************************************/
		if(medicationrequestdispenserequestexpectedsupplyduration.hasCode()) {

			m.addMdctnRqstDispnsRqstExpectedSpplyDurationCd(String.valueOf(medicationrequestdispenserequestexpectedsupplyduration.getCode()));
		} else {
			m.addMdctnRqstDispnsRqstExpectedSpplyDurationCd("NULL");
		}


		/******************** MdctnRqst_DispnsRqst_ExpectedSpplyDuration_Unt ********************************************************************************/
		if(medicationrequestdispenserequestexpectedsupplyduration.hasUnit()) {

			m.addMdctnRqstDispnsRqstExpectedSpplyDurationUnt(String.valueOf(medicationrequestdispenserequestexpectedsupplyduration.getUnit()));
		} else {
			m.addMdctnRqstDispnsRqstExpectedSpplyDurationUnt("NULL");
		}


		/******************** MdctnRqst_DispnsRqst_ExpectedSpplyDuration_Sys ********************************************************************************/
		if(medicationrequestdispenserequestexpectedsupplyduration.hasSystem()) {

			m.addMdctnRqstDispnsRqstExpectedSpplyDurationSys(String.valueOf(medicationrequestdispenserequestexpectedsupplyduration.getSystem()));
		} else {
			m.addMdctnRqstDispnsRqstExpectedSpplyDurationSys("NULL");
		}


		/******************** medicationrequestdispenserequestdispenseinterval ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationrequestdispenserequestdispenseinterval = medicationrequestdispenserequest.getDispenseInterval();

		/******************** MdctnRqst_DispnsRqst_DispnsInterval_Vl ********************************************************************************/
		if(medicationrequestdispenserequestdispenseinterval.hasValue()) {

			m.addMdctnRqstDispnsRqstDispnsIntervalVl(String.valueOf(medicationrequestdispenserequestdispenseinterval.getValue()));
		} else {
			m.addMdctnRqstDispnsRqstDispnsIntervalVl("NULL");
		}


		/******************** medicationrequestdispenserequestdispenseintervalcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdispenserequestdispenseintervalcomparator = medicationrequestdispenserequestdispenseinterval.getComparator();
		if(medicationrequestdispenserequestdispenseintervalcomparator!=null) {
			m.addMdctnRqstDispnsRqstDispnsIntervalCmprtr(medicationrequestdispenserequestdispenseintervalcomparator.toCode());
		} else {
			m.addMdctnRqstDispnsRqstDispnsIntervalCmprtr("NULL");
		}

		/******************** MdctnRqst_DispnsRqst_DispnsInterval_Cd ********************************************************************************/
		if(medicationrequestdispenserequestdispenseinterval.hasCode()) {

			m.addMdctnRqstDispnsRqstDispnsIntervalCd(String.valueOf(medicationrequestdispenserequestdispenseinterval.getCode()));
		} else {
			m.addMdctnRqstDispnsRqstDispnsIntervalCd("NULL");
		}


		/******************** MdctnRqst_DispnsRqst_DispnsInterval_Unt ********************************************************************************/
		if(medicationrequestdispenserequestdispenseinterval.hasUnit()) {

			m.addMdctnRqstDispnsRqstDispnsIntervalUnt(String.valueOf(medicationrequestdispenserequestdispenseinterval.getUnit()));
		} else {
			m.addMdctnRqstDispnsRqstDispnsIntervalUnt("NULL");
		}


		/******************** MdctnRqst_DispnsRqst_DispnsInterval_Sys ********************************************************************************/
		if(medicationrequestdispenserequestdispenseinterval.hasSystem()) {

			m.addMdctnRqstDispnsRqstDispnsIntervalSys(String.valueOf(medicationrequestdispenserequestdispenseinterval.getSystem()));
		} else {
			m.addMdctnRqstDispnsRqstDispnsIntervalSys("NULL");
		}


		/******************** MdctnRqst_DispnsRqst_NmbrOfRptsAllowed ********************************************************************************/
		if(medicationrequestdispenserequest.hasNumberOfRepeatsAllowed()) {

			m.addMdctnRqstDispnsRqstNmbrOfRptsAllowed(String.valueOf(medicationrequestdispenserequest.getNumberOfRepeatsAllowed()));
		} else {
			m.addMdctnRqstDispnsRqstNmbrOfRptsAllowed("NULL");
		}


		/******************** MdctnRqst_DispnsRqst_Prfrmr ********************************************************************************/
		if(medicationrequestdispenserequest.hasPerformer()) {

			if(medicationrequestdispenserequest.getPerformer().getReference() != null) {
			m.addMdctnRqstDispnsRqstPrfrmr(medicationrequestdispenserequest.getPerformer().getReference());
			}
		} else {
			m.addMdctnRqstDispnsRqstPrfrmr("NULL");
		}


		/******************** medicationrequestdispenserequestinitialfill ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestInitialFillComponent medicationrequestdispenserequestinitialfill = medicationrequestdispenserequest.getInitialFill();

		/******************** medicationrequestdispenserequestinitialfillduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationrequestdispenserequestinitialfillduration = medicationrequestdispenserequestinitialfill.getDuration();

		/******************** MdctnRqst_DispnsRqst_InitialFill_Duration_Vl ********************************************************************************/
		if(medicationrequestdispenserequestinitialfillduration.hasValue()) {

			m.addMdctnRqstDispnsRqstInitialFillDurationVl(String.valueOf(medicationrequestdispenserequestinitialfillduration.getValue()));
		} else {
			m.addMdctnRqstDispnsRqstInitialFillDurationVl("NULL");
		}


		/******************** medicationrequestdispenserequestinitialfilldurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdispenserequestinitialfilldurationcomparator = medicationrequestdispenserequestinitialfillduration.getComparator();
		if(medicationrequestdispenserequestinitialfilldurationcomparator!=null) {
			m.addMdctnRqstDispnsRqstInitialFillDurationCmprtr(medicationrequestdispenserequestinitialfilldurationcomparator.toCode());
		} else {
			m.addMdctnRqstDispnsRqstInitialFillDurationCmprtr("NULL");
		}

		/******************** MdctnRqst_DispnsRqst_InitialFill_Duration_Cd ********************************************************************************/
		if(medicationrequestdispenserequestinitialfillduration.hasCode()) {

			m.addMdctnRqstDispnsRqstInitialFillDurationCd(String.valueOf(medicationrequestdispenserequestinitialfillduration.getCode()));
		} else {
			m.addMdctnRqstDispnsRqstInitialFillDurationCd("NULL");
		}


		/******************** MdctnRqst_DispnsRqst_InitialFill_Duration_Unt ********************************************************************************/
		if(medicationrequestdispenserequestinitialfillduration.hasUnit()) {

			m.addMdctnRqstDispnsRqstInitialFillDurationUnt(String.valueOf(medicationrequestdispenserequestinitialfillduration.getUnit()));
		} else {
			m.addMdctnRqstDispnsRqstInitialFillDurationUnt("NULL");
		}


		/******************** MdctnRqst_DispnsRqst_InitialFill_Duration_Sys ********************************************************************************/
		if(medicationrequestdispenserequestinitialfillduration.hasSystem()) {

			m.addMdctnRqstDispnsRqstInitialFillDurationSys(String.valueOf(medicationrequestdispenserequestinitialfillduration.getSystem()));
		} else {
			m.addMdctnRqstDispnsRqstInitialFillDurationSys("NULL");
		}


		/******************** medicationrequestdispenserequestinitialfillquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdispenserequestinitialfillquantity = medicationrequestdispenserequestinitialfill.getQuantity();

		/******************** MdctnRqst_DispnsRqst_InitialFill_Qnty_Vl ********************************************************************************/
		if(medicationrequestdispenserequestinitialfillquantity.hasValue()) {

			m.addMdctnRqstDispnsRqstInitialFillQntyVl(String.valueOf(medicationrequestdispenserequestinitialfillquantity.getValue()));
		} else {
			m.addMdctnRqstDispnsRqstInitialFillQntyVl("NULL");
		}


		/******************** medicationrequestdispenserequestinitialfillquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdispenserequestinitialfillquantitycomparator = medicationrequestdispenserequestinitialfillquantity.getComparator();
		if(medicationrequestdispenserequestinitialfillquantitycomparator!=null) {
			m.addMdctnRqstDispnsRqstInitialFillQntyCmprtr(medicationrequestdispenserequestinitialfillquantitycomparator.toCode());
		} else {
			m.addMdctnRqstDispnsRqstInitialFillQntyCmprtr("NULL");
		}

		/******************** MdctnRqst_DispnsRqst_InitialFill_Qnty_Cd ********************************************************************************/
		if(medicationrequestdispenserequestinitialfillquantity.hasCode()) {

			m.addMdctnRqstDispnsRqstInitialFillQntyCd(String.valueOf(medicationrequestdispenserequestinitialfillquantity.getCode()));
		} else {
			m.addMdctnRqstDispnsRqstInitialFillQntyCd("NULL");
		}


		/******************** MdctnRqst_DispnsRqst_InitialFill_Qnty_Unt ********************************************************************************/
		if(medicationrequestdispenserequestinitialfillquantity.hasUnit()) {

			m.addMdctnRqstDispnsRqstInitialFillQntyUnt(String.valueOf(medicationrequestdispenserequestinitialfillquantity.getUnit()));
		} else {
			m.addMdctnRqstDispnsRqstInitialFillQntyUnt("NULL");
		}


		/******************** MdctnRqst_DispnsRqst_InitialFill_Qnty_Sys ********************************************************************************/
		if(medicationrequestdispenserequestinitialfillquantity.hasSystem()) {

			m.addMdctnRqstDispnsRqstInitialFillQntySys(String.valueOf(medicationrequestdispenserequestinitialfillquantity.getSystem()));
		} else {
			m.addMdctnRqstDispnsRqstInitialFillQntySys("NULL");
		}


		/******************** medicationrequestdispenserequestquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationrequestdispenserequestquantity = medicationrequestdispenserequest.getQuantity();

		/******************** MdctnRqst_DispnsRqst_Qnty_Vl ********************************************************************************/
		if(medicationrequestdispenserequestquantity.hasValue()) {

			m.addMdctnRqstDispnsRqstQntyVl(String.valueOf(medicationrequestdispenserequestquantity.getValue()));
		} else {
			m.addMdctnRqstDispnsRqstQntyVl("NULL");
		}


		/******************** medicationrequestdispenserequestquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationrequestdispenserequestquantitycomparator = medicationrequestdispenserequestquantity.getComparator();
		if(medicationrequestdispenserequestquantitycomparator!=null) {
			m.addMdctnRqstDispnsRqstQntyCmprtr(medicationrequestdispenserequestquantitycomparator.toCode());
		} else {
			m.addMdctnRqstDispnsRqstQntyCmprtr("NULL");
		}

		/******************** MdctnRqst_DispnsRqst_Qnty_Cd ********************************************************************************/
		if(medicationrequestdispenserequestquantity.hasCode()) {

			m.addMdctnRqstDispnsRqstQntyCd(String.valueOf(medicationrequestdispenserequestquantity.getCode()));
		} else {
			m.addMdctnRqstDispnsRqstQntyCd("NULL");
		}


		/******************** MdctnRqst_DispnsRqst_Qnty_Unt ********************************************************************************/
		if(medicationrequestdispenserequestquantity.hasUnit()) {

			m.addMdctnRqstDispnsRqstQntyUnt(String.valueOf(medicationrequestdispenserequestquantity.getUnit()));
		} else {
			m.addMdctnRqstDispnsRqstQntyUnt("NULL");
		}


		/******************** MdctnRqst_DispnsRqst_Qnty_Sys ********************************************************************************/
		if(medicationrequestdispenserequestquantity.hasSystem()) {

			m.addMdctnRqstDispnsRqstQntySys(String.valueOf(medicationrequestdispenserequestquantity.getSystem()));
		} else {
			m.addMdctnRqstDispnsRqstQntySys("NULL");
		}


		/******************** MdctnRqst_DetectedIssue ********************************************************************************/
		if(medicationrequest.hasDetectedIssue()) {

			String  array = "[";
			for(int incr=0; incr<medicationrequest.getDetectedIssue().size(); incr++) {
				array = array + medicationrequest.getDetectedIssue().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnRqstDetectedIssue(array);

		} else {
			m.addMdctnRqstDetectedIssue("NULL");
		}


		/******************** medicationrequestsubstitution ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestSubstitutionComponent medicationrequestsubstitution = medicationrequest.getSubstitution();

		/******************** medicationrequestsubstitutionreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestsubstitutionreason = medicationrequestsubstitution.getReason();

		/******************** MdctnRqst_Substitution_Rsn_Txt ********************************************************************************/
		if(medicationrequestsubstitutionreason.hasText()) {

			m.addMdctnRqstSubstitutionRsnTxt(String.valueOf(medicationrequestsubstitutionreason.getText()));
		} else {
			m.addMdctnRqstSubstitutionRsnTxt("NULL");
		}


		/******************** medicationrequestsubstitutionreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationrequestsubstitutionreasoncodinglist = medicationrequestsubstitutionreason.getCoding();
		for(int medicationrequestsubstitutionreasoncodingi = 0; medicationrequestsubstitutionreasoncodingi<medicationrequestsubstitutionreasoncodinglist.size();medicationrequestsubstitutionreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationrequestsubstitutionreasoncoding = medicationrequestsubstitutionreasoncodinglist.get(medicationrequestsubstitutionreasoncodingi);

		/******************** MdctnRqst_Substitution_Rsn_Cdg_Dsply ********************************************************************************/
		if(medicationrequestsubstitutionreasoncodingi == 0) {m.addMdctnRqstSubstitutionRsnCdgDsply("[");}
		if(medicationrequestsubstitutionreasoncoding.hasDisplay()) {

			m.addMdctnRqstSubstitutionRsnCdgDsply(String.valueOf(medicationrequestsubstitutionreasoncoding.getDisplay()));
		} else {
			m.addMdctnRqstSubstitutionRsnCdgDsply("NULL");
		}

		if(medicationrequestsubstitutionreasoncodingi == medicationrequestsubstitutionreasoncodinglist.size()-1) {m.addMdctnRqstSubstitutionRsnCdgDsply("]");}


		/******************** MdctnRqst_Substitution_Rsn_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestsubstitutionreasoncodingi == 0) {m.addMdctnRqstSubstitutionRsnCdgVrsn("[");}
		if(medicationrequestsubstitutionreasoncoding.hasVersion()) {

			m.addMdctnRqstSubstitutionRsnCdgVrsn(String.valueOf(medicationrequestsubstitutionreasoncoding.getVersion()));
		} else {
			m.addMdctnRqstSubstitutionRsnCdgVrsn("NULL");
		}

		if(medicationrequestsubstitutionreasoncodingi == medicationrequestsubstitutionreasoncodinglist.size()-1) {m.addMdctnRqstSubstitutionRsnCdgVrsn("]");}


		/******************** MdctnRqst_Substitution_Rsn_Cdg_Cd ********************************************************************************/
		if(medicationrequestsubstitutionreasoncodingi == 0) {m.addMdctnRqstSubstitutionRsnCdgCd("[");}
		if(medicationrequestsubstitutionreasoncoding.hasCode()) {

			m.addMdctnRqstSubstitutionRsnCdgCd(String.valueOf(medicationrequestsubstitutionreasoncoding.getCode()));
		} else {
			m.addMdctnRqstSubstitutionRsnCdgCd("NULL");
		}

		if(medicationrequestsubstitutionreasoncodingi == medicationrequestsubstitutionreasoncodinglist.size()-1) {m.addMdctnRqstSubstitutionRsnCdgCd("]");}


		/******************** MdctnRqst_Substitution_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestsubstitutionreasoncodingi == 0) {m.addMdctnRqstSubstitutionRsnCdgUsrSltd("[");}
		if(medicationrequestsubstitutionreasoncoding.hasUserSelected()) {

			m.addMdctnRqstSubstitutionRsnCdgUsrSltd(String.valueOf(medicationrequestsubstitutionreasoncoding.getUserSelected()));
		} else {
			m.addMdctnRqstSubstitutionRsnCdgUsrSltd("NULL");
		}

		if(medicationrequestsubstitutionreasoncodingi == medicationrequestsubstitutionreasoncodinglist.size()-1) {m.addMdctnRqstSubstitutionRsnCdgUsrSltd("]");}


		/******************** MdctnRqst_Substitution_Rsn_Cdg_Sys ********************************************************************************/
		if(medicationrequestsubstitutionreasoncodingi == 0) {m.addMdctnRqstSubstitutionRsnCdgSys("[");}
		if(medicationrequestsubstitutionreasoncoding.hasSystem()) {

			m.addMdctnRqstSubstitutionRsnCdgSys(String.valueOf(medicationrequestsubstitutionreasoncoding.getSystem()));
		} else {
			m.addMdctnRqstSubstitutionRsnCdgSys("NULL");
		}

		if(medicationrequestsubstitutionreasoncodingi == medicationrequestsubstitutionreasoncodinglist.size()-1) {m.addMdctnRqstSubstitutionRsnCdgSys("]");}


		 };
		/******************** MdctnRqst_Substitution_AllowedBooleanTyp ********************************************************************************/
		if(medicationrequestsubstitution.hasAllowedBooleanType()) {

			m.addMdctnRqstSubstitutionAllowedBooleanTyp("\""+medicationrequestsubstitution.getAllowedBooleanType().getValueAsString()+"\"");
		} else {
			m.addMdctnRqstSubstitutionAllowedBooleanTyp("NULL");
		}


		/******************** medicationrequestsubstitutionallowedcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequestsubstitutionallowedcodeableconcept = medicationrequestsubstitution.getAllowedCodeableConcept();

		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Txt ********************************************************************************/
		if(medicationrequestsubstitutionallowedcodeableconcept.hasText()) {

			m.addMdctnRqstSubstitutionAllowedCdbleCncptTxt(String.valueOf(medicationrequestsubstitutionallowedcodeableconcept.getText()));
		} else {
			m.addMdctnRqstSubstitutionAllowedCdbleCncptTxt("NULL");
		}


		/******************** medicationrequestsubstitutionallowedcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationrequestsubstitutionallowedcodeableconceptcodinglist = medicationrequestsubstitutionallowedcodeableconcept.getCoding();
		for(int medicationrequestsubstitutionallowedcodeableconceptcodingi = 0; medicationrequestsubstitutionallowedcodeableconceptcodingi<medicationrequestsubstitutionallowedcodeableconceptcodinglist.size();medicationrequestsubstitutionallowedcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationrequestsubstitutionallowedcodeableconceptcoding = medicationrequestsubstitutionallowedcodeableconceptcodinglist.get(medicationrequestsubstitutionallowedcodeableconceptcodingi);

		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationrequestsubstitutionallowedcodeableconceptcodingi == 0) {m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgDsply("[");}
		if(medicationrequestsubstitutionallowedcodeableconceptcoding.hasDisplay()) {

			m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgDsply(String.valueOf(medicationrequestsubstitutionallowedcodeableconceptcoding.getDisplay()));
		} else {
			m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgDsply("NULL");
		}

		if(medicationrequestsubstitutionallowedcodeableconceptcodingi == medicationrequestsubstitutionallowedcodeableconceptcodinglist.size()-1) {m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgDsply("]");}


		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationrequestsubstitutionallowedcodeableconceptcodingi == 0) {m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgVrsn("[");}
		if(medicationrequestsubstitutionallowedcodeableconceptcoding.hasVersion()) {

			m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgVrsn(String.valueOf(medicationrequestsubstitutionallowedcodeableconceptcoding.getVersion()));
		} else {
			m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgVrsn("NULL");
		}

		if(medicationrequestsubstitutionallowedcodeableconceptcodingi == medicationrequestsubstitutionallowedcodeableconceptcodinglist.size()-1) {m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgVrsn("]");}


		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationrequestsubstitutionallowedcodeableconceptcodingi == 0) {m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgCd("[");}
		if(medicationrequestsubstitutionallowedcodeableconceptcoding.hasCode()) {

			m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgCd(String.valueOf(medicationrequestsubstitutionallowedcodeableconceptcoding.getCode()));
		} else {
			m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgCd("NULL");
		}

		if(medicationrequestsubstitutionallowedcodeableconceptcodingi == medicationrequestsubstitutionallowedcodeableconceptcodinglist.size()-1) {m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgCd("]");}


		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequestsubstitutionallowedcodeableconceptcodingi == 0) {m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgUsrSltd("[");}
		if(medicationrequestsubstitutionallowedcodeableconceptcoding.hasUserSelected()) {

			m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgUsrSltd(String.valueOf(medicationrequestsubstitutionallowedcodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicationrequestsubstitutionallowedcodeableconceptcodingi == medicationrequestsubstitutionallowedcodeableconceptcodinglist.size()-1) {m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgUsrSltd("]");}


		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationrequestsubstitutionallowedcodeableconceptcodingi == 0) {m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgSys("[");}
		if(medicationrequestsubstitutionallowedcodeableconceptcoding.hasSystem()) {

			m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgSys(String.valueOf(medicationrequestsubstitutionallowedcodeableconceptcoding.getSystem()));
		} else {
			m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgSys("NULL");
		}

		if(medicationrequestsubstitutionallowedcodeableconceptcodingi == medicationrequestsubstitutionallowedcodeableconceptcodinglist.size()-1) {m.addMdctnRqstSubstitutionAllowedCdbleCncptCdgSys("]");}


		 };
		/******************** MdctnRqst_AthredOn ********************************************************************************/
		if(medicationrequest.hasAuthoredOn()) {

			m.addMdctnRqstAthredOn("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationrequest.getAuthoredOn())+"\"");
		} else {
			m.addMdctnRqstAthredOn("NULL");
		}


		/******************** medicationrequestintent ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestIntent medicationrequestintent = medicationrequest.getIntent();
		if(medicationrequestintent!=null) {
			m.addMdctnRqstIntent(medicationrequestintent.toCode());
		} else {
			m.addMdctnRqstIntent("NULL");
		}

		/******************** medicationrequeststatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationrequeststatusreason = medicationrequest.getStatusReason();

		/******************** MdctnRqst_StsRsn_Txt ********************************************************************************/
		if(medicationrequeststatusreason.hasText()) {

			m.addMdctnRqstStsRsnTxt(String.valueOf(medicationrequeststatusreason.getText()));
		} else {
			m.addMdctnRqstStsRsnTxt("NULL");
		}


		/******************** medicationrequeststatusreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationrequeststatusreasoncodinglist = medicationrequeststatusreason.getCoding();
		for(int medicationrequeststatusreasoncodingi = 0; medicationrequeststatusreasoncodingi<medicationrequeststatusreasoncodinglist.size();medicationrequeststatusreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationrequeststatusreasoncoding = medicationrequeststatusreasoncodinglist.get(medicationrequeststatusreasoncodingi);

		/******************** MdctnRqst_StsRsn_Cdg_Dsply ********************************************************************************/
		if(medicationrequeststatusreasoncodingi == 0) {m.addMdctnRqstStsRsnCdgDsply("[");}
		if(medicationrequeststatusreasoncoding.hasDisplay()) {

			m.addMdctnRqstStsRsnCdgDsply(String.valueOf(medicationrequeststatusreasoncoding.getDisplay()));
		} else {
			m.addMdctnRqstStsRsnCdgDsply("NULL");
		}

		if(medicationrequeststatusreasoncodingi == medicationrequeststatusreasoncodinglist.size()-1) {m.addMdctnRqstStsRsnCdgDsply("]");}


		/******************** MdctnRqst_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(medicationrequeststatusreasoncodingi == 0) {m.addMdctnRqstStsRsnCdgVrsn("[");}
		if(medicationrequeststatusreasoncoding.hasVersion()) {

			m.addMdctnRqstStsRsnCdgVrsn(String.valueOf(medicationrequeststatusreasoncoding.getVersion()));
		} else {
			m.addMdctnRqstStsRsnCdgVrsn("NULL");
		}

		if(medicationrequeststatusreasoncodingi == medicationrequeststatusreasoncodinglist.size()-1) {m.addMdctnRqstStsRsnCdgVrsn("]");}


		/******************** MdctnRqst_StsRsn_Cdg_Cd ********************************************************************************/
		if(medicationrequeststatusreasoncodingi == 0) {m.addMdctnRqstStsRsnCdgCd("[");}
		if(medicationrequeststatusreasoncoding.hasCode()) {

			m.addMdctnRqstStsRsnCdgCd(String.valueOf(medicationrequeststatusreasoncoding.getCode()));
		} else {
			m.addMdctnRqstStsRsnCdgCd("NULL");
		}

		if(medicationrequeststatusreasoncodingi == medicationrequeststatusreasoncodinglist.size()-1) {m.addMdctnRqstStsRsnCdgCd("]");}


		/******************** MdctnRqst_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(medicationrequeststatusreasoncodingi == 0) {m.addMdctnRqstStsRsnCdgUsrSltd("[");}
		if(medicationrequeststatusreasoncoding.hasUserSelected()) {

			m.addMdctnRqstStsRsnCdgUsrSltd(String.valueOf(medicationrequeststatusreasoncoding.getUserSelected()));
		} else {
			m.addMdctnRqstStsRsnCdgUsrSltd("NULL");
		}

		if(medicationrequeststatusreasoncodingi == medicationrequeststatusreasoncodinglist.size()-1) {m.addMdctnRqstStsRsnCdgUsrSltd("]");}


		/******************** MdctnRqst_StsRsn_Cdg_Sys ********************************************************************************/
		if(medicationrequeststatusreasoncodingi == 0) {m.addMdctnRqstStsRsnCdgSys("[");}
		if(medicationrequeststatusreasoncoding.hasSystem()) {

			m.addMdctnRqstStsRsnCdgSys(String.valueOf(medicationrequeststatusreasoncoding.getSystem()));
		} else {
			m.addMdctnRqstStsRsnCdgSys("NULL");
		}

		if(medicationrequeststatusreasoncodingi == medicationrequeststatusreasoncodinglist.size()-1) {m.addMdctnRqstStsRsnCdgSys("]");}


		 };
		/******************** MdctnRqst_EvntHis ********************************************************************************/
		if(medicationrequest.hasEventHistory()) {

			String  array = "[";
			for(int incr=0; incr<medicationrequest.getEventHistory().size(); incr++) {
				array = array + medicationrequest.getEventHistory().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnRqstEvntHis(array);

		} else {
			m.addMdctnRqstEvntHis("NULL");
		}


		/******************** MdctnRqst_DoNotPerform ********************************************************************************/
		if(medicationrequest.hasDoNotPerform()) {

			m.addMdctnRqstDoNotPerform(String.valueOf(medicationrequest.getDoNotPerform()));
		} else {
			m.addMdctnRqstDoNotPerform("NULL");
		}


		return m;
	}
}
