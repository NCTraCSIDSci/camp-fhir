package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.RiskAssessment;
public class RiskAssessmentBidirectionalConversion 
{
	public RiskAssessment RiskAssessments(org.hl7.fhir.r4.model.RiskAssessment riskassessment) throws ParseException
	{
		 main.java.com.campfhir.model.RiskAssessment r = new  main.java.com.campfhir.model.RiskAssessment();

		/******************** id ********************************************************************************/
		r.setId(riskassessment.getIdElement().getIdPart());

		/******************** riskassessmentmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskassessmentmethod = riskassessment.getMethod();

		/******************** RskAssmnt_Mthd_Txt ********************************************************************************/
		if(riskassessmentmethod.hasText()) {

			r.addRskAssmntMthdTxt(String.valueOf(riskassessmentmethod.getText()));
		} else {
			r.addRskAssmntMthdTxt("NULL");
		}


		/******************** riskassessmentmethodcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> riskassessmentmethodcodinglist = riskassessmentmethod.getCoding();
		for(int riskassessmentmethodcodingi = 0; riskassessmentmethodcodingi<riskassessmentmethodcodinglist.size();riskassessmentmethodcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  riskassessmentmethodcoding = riskassessmentmethodcodinglist.get(riskassessmentmethodcodingi);

		/******************** RskAssmnt_Mthd_Cdg_Dsply ********************************************************************************/
		if(riskassessmentmethodcodingi == 0) {r.addRskAssmntMthdCdgDsply("[");}
		if(riskassessmentmethodcoding.hasDisplay()) {

			r.addRskAssmntMthdCdgDsply(String.valueOf(riskassessmentmethodcoding.getDisplay()));
		} else {
			r.addRskAssmntMthdCdgDsply("NULL");
		}

		if(riskassessmentmethodcodingi == riskassessmentmethodcodinglist.size()-1) {r.addRskAssmntMthdCdgDsply("]");}


		/******************** RskAssmnt_Mthd_Cdg_Vrsn ********************************************************************************/
		if(riskassessmentmethodcodingi == 0) {r.addRskAssmntMthdCdgVrsn("[");}
		if(riskassessmentmethodcoding.hasVersion()) {

			r.addRskAssmntMthdCdgVrsn(String.valueOf(riskassessmentmethodcoding.getVersion()));
		} else {
			r.addRskAssmntMthdCdgVrsn("NULL");
		}

		if(riskassessmentmethodcodingi == riskassessmentmethodcodinglist.size()-1) {r.addRskAssmntMthdCdgVrsn("]");}


		/******************** RskAssmnt_Mthd_Cdg_Cd ********************************************************************************/
		if(riskassessmentmethodcodingi == 0) {r.addRskAssmntMthdCdgCd("[");}
		if(riskassessmentmethodcoding.hasCode()) {

			r.addRskAssmntMthdCdgCd(String.valueOf(riskassessmentmethodcoding.getCode()));
		} else {
			r.addRskAssmntMthdCdgCd("NULL");
		}

		if(riskassessmentmethodcodingi == riskassessmentmethodcodinglist.size()-1) {r.addRskAssmntMthdCdgCd("]");}


		/******************** RskAssmnt_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(riskassessmentmethodcodingi == 0) {r.addRskAssmntMthdCdgUsrSltd("[");}
		if(riskassessmentmethodcoding.hasUserSelected()) {

			r.addRskAssmntMthdCdgUsrSltd(String.valueOf(riskassessmentmethodcoding.getUserSelected()));
		} else {
			r.addRskAssmntMthdCdgUsrSltd("NULL");
		}

		if(riskassessmentmethodcodingi == riskassessmentmethodcodinglist.size()-1) {r.addRskAssmntMthdCdgUsrSltd("]");}


		/******************** RskAssmnt_Mthd_Cdg_Sys ********************************************************************************/
		if(riskassessmentmethodcodingi == 0) {r.addRskAssmntMthdCdgSys("[");}
		if(riskassessmentmethodcoding.hasSystem()) {

			r.addRskAssmntMthdCdgSys(String.valueOf(riskassessmentmethodcoding.getSystem()));
		} else {
			r.addRskAssmntMthdCdgSys("NULL");
		}

		if(riskassessmentmethodcodingi == riskassessmentmethodcodinglist.size()-1) {r.addRskAssmntMthdCdgSys("]");}


		 };
		/******************** RskAssmnt_Parent ********************************************************************************/
		if(riskassessment.hasParent()) {

			if(riskassessment.getParent().getReference() != null) {
			r.addRskAssmntParent(riskassessment.getParent().getReference());
			}
		} else {
			r.addRskAssmntParent("NULL");
		}


		/******************** riskassessmentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskassessmentcode = riskassessment.getCode();

		/******************** RskAssmnt_Cd_Txt ********************************************************************************/
		if(riskassessmentcode.hasText()) {

			r.addRskAssmntCdTxt(String.valueOf(riskassessmentcode.getText()));
		} else {
			r.addRskAssmntCdTxt("NULL");
		}


		/******************** riskassessmentcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> riskassessmentcodecodinglist = riskassessmentcode.getCoding();
		for(int riskassessmentcodecodingi = 0; riskassessmentcodecodingi<riskassessmentcodecodinglist.size();riskassessmentcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  riskassessmentcodecoding = riskassessmentcodecodinglist.get(riskassessmentcodecodingi);

		/******************** RskAssmnt_Cd_Cdg_Dsply ********************************************************************************/
		if(riskassessmentcodecodingi == 0) {r.addRskAssmntCdCdgDsply("[");}
		if(riskassessmentcodecoding.hasDisplay()) {

			r.addRskAssmntCdCdgDsply(String.valueOf(riskassessmentcodecoding.getDisplay()));
		} else {
			r.addRskAssmntCdCdgDsply("NULL");
		}

		if(riskassessmentcodecodingi == riskassessmentcodecodinglist.size()-1) {r.addRskAssmntCdCdgDsply("]");}


		/******************** RskAssmnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(riskassessmentcodecodingi == 0) {r.addRskAssmntCdCdgVrsn("[");}
		if(riskassessmentcodecoding.hasVersion()) {

			r.addRskAssmntCdCdgVrsn(String.valueOf(riskassessmentcodecoding.getVersion()));
		} else {
			r.addRskAssmntCdCdgVrsn("NULL");
		}

		if(riskassessmentcodecodingi == riskassessmentcodecodinglist.size()-1) {r.addRskAssmntCdCdgVrsn("]");}


		/******************** RskAssmnt_Cd_Cdg_Cd ********************************************************************************/
		if(riskassessmentcodecodingi == 0) {r.addRskAssmntCdCdgCd("[");}
		if(riskassessmentcodecoding.hasCode()) {

			r.addRskAssmntCdCdgCd(String.valueOf(riskassessmentcodecoding.getCode()));
		} else {
			r.addRskAssmntCdCdgCd("NULL");
		}

		if(riskassessmentcodecodingi == riskassessmentcodecodinglist.size()-1) {r.addRskAssmntCdCdgCd("]");}


		/******************** RskAssmnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(riskassessmentcodecodingi == 0) {r.addRskAssmntCdCdgUsrSltd("[");}
		if(riskassessmentcodecoding.hasUserSelected()) {

			r.addRskAssmntCdCdgUsrSltd(String.valueOf(riskassessmentcodecoding.getUserSelected()));
		} else {
			r.addRskAssmntCdCdgUsrSltd("NULL");
		}

		if(riskassessmentcodecodingi == riskassessmentcodecodinglist.size()-1) {r.addRskAssmntCdCdgUsrSltd("]");}


		/******************** RskAssmnt_Cd_Cdg_Sys ********************************************************************************/
		if(riskassessmentcodecodingi == 0) {r.addRskAssmntCdCdgSys("[");}
		if(riskassessmentcodecoding.hasSystem()) {

			r.addRskAssmntCdCdgSys(String.valueOf(riskassessmentcodecoding.getSystem()));
		} else {
			r.addRskAssmntCdCdgSys("NULL");
		}

		if(riskassessmentcodecodingi == riskassessmentcodecodinglist.size()-1) {r.addRskAssmntCdCdgSys("]");}


		 };
		/******************** RskAssmnt_Sbjct ********************************************************************************/
		if(riskassessment.hasSubject()) {

			if(riskassessment.getSubject().getReference() != null) {
			r.addRskAssmntSbjct(riskassessment.getSubject().getReference());
			}
		} else {
			r.addRskAssmntSbjct("NULL");
		}


		/******************** riskassessmentstatus ********************************************************************************/
		org.hl7.fhir.r4.model.RiskAssessment.RiskAssessmentStatus riskassessmentstatus = riskassessment.getStatus();
		if(riskassessmentstatus!=null) {
			r.addRskAssmntSts(riskassessmentstatus.toCode());
		} else {
			r.addRskAssmntSts("NULL");
		}

		/******************** RskAssmnt_Enc ********************************************************************************/
		if(riskassessment.hasEncounter()) {

			if(riskassessment.getEncounter().getReference() != null) {
			r.addRskAssmntEnc(riskassessment.getEncounter().getReference());
			}
		} else {
			r.addRskAssmntEnc("NULL");
		}


		/******************** RskAssmnt_BasedOn ********************************************************************************/
		if(riskassessment.hasBasedOn()) {

			if(riskassessment.getBasedOn().getReference() != null) {
			r.addRskAssmntBasedOn(riskassessment.getBasedOn().getReference());
			}
		} else {
			r.addRskAssmntBasedOn("NULL");
		}


		/******************** riskassessmentreasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> riskassessmentreasoncodelist = riskassessment.getReasonCode();
		for(int riskassessmentreasoncodei = 0; riskassessmentreasoncodei<riskassessmentreasoncodelist.size();riskassessmentreasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  riskassessmentreasoncode = riskassessmentreasoncodelist.get(riskassessmentreasoncodei);

		/******************** RskAssmnt_RsnCd_Txt ********************************************************************************/
		if(riskassessmentreasoncodei == 0) {r.addRskAssmntRsnCdTxt("[");}
		if(riskassessmentreasoncode.hasText()) {

			r.addRskAssmntRsnCdTxt(String.valueOf(riskassessmentreasoncode.getText()));
		} else {
			r.addRskAssmntRsnCdTxt("NULL");
		}

		if(riskassessmentreasoncodei == riskassessmentreasoncodelist.size()-1) {r.addRskAssmntRsnCdTxt("]");}


		/******************** riskassessmentreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> riskassessmentreasoncodecodinglist = riskassessmentreasoncode.getCoding();
		for(int riskassessmentreasoncodecodingi = 0; riskassessmentreasoncodecodingi<riskassessmentreasoncodecodinglist.size();riskassessmentreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  riskassessmentreasoncodecoding = riskassessmentreasoncodecodinglist.get(riskassessmentreasoncodecodingi);

		/******************** RskAssmnt_RsnCd_Cdg_Dsply ********************************************************************************/
		if(riskassessmentreasoncodecodingi == 0) {r.addRskAssmntRsnCdCdgDsply("[[");}
		if(riskassessmentreasoncodecoding.hasDisplay()) {

			r.addRskAssmntRsnCdCdgDsply(String.valueOf(riskassessmentreasoncodecoding.getDisplay()));
		} else {
			r.addRskAssmntRsnCdCdgDsply("NULL");
		}

		if(riskassessmentreasoncodecodingi == riskassessmentreasoncodecodinglist.size()-1) {r.addRskAssmntRsnCdCdgDsply("]]");}


		/******************** RskAssmnt_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(riskassessmentreasoncodecodingi == 0) {r.addRskAssmntRsnCdCdgVrsn("[[");}
		if(riskassessmentreasoncodecoding.hasVersion()) {

			r.addRskAssmntRsnCdCdgVrsn(String.valueOf(riskassessmentreasoncodecoding.getVersion()));
		} else {
			r.addRskAssmntRsnCdCdgVrsn("NULL");
		}

		if(riskassessmentreasoncodecodingi == riskassessmentreasoncodecodinglist.size()-1) {r.addRskAssmntRsnCdCdgVrsn("]]");}


		/******************** RskAssmnt_RsnCd_Cdg_Cd ********************************************************************************/
		if(riskassessmentreasoncodecodingi == 0) {r.addRskAssmntRsnCdCdgCd("[[");}
		if(riskassessmentreasoncodecoding.hasCode()) {

			r.addRskAssmntRsnCdCdgCd(String.valueOf(riskassessmentreasoncodecoding.getCode()));
		} else {
			r.addRskAssmntRsnCdCdgCd("NULL");
		}

		if(riskassessmentreasoncodecodingi == riskassessmentreasoncodecodinglist.size()-1) {r.addRskAssmntRsnCdCdgCd("]]");}


		/******************** RskAssmnt_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(riskassessmentreasoncodecodingi == 0) {r.addRskAssmntRsnCdCdgUsrSltd("[[");}
		if(riskassessmentreasoncodecoding.hasUserSelected()) {

			r.addRskAssmntRsnCdCdgUsrSltd(String.valueOf(riskassessmentreasoncodecoding.getUserSelected()));
		} else {
			r.addRskAssmntRsnCdCdgUsrSltd("NULL");
		}

		if(riskassessmentreasoncodecodingi == riskassessmentreasoncodecodinglist.size()-1) {r.addRskAssmntRsnCdCdgUsrSltd("]]");}


		/******************** RskAssmnt_RsnCd_Cdg_Sys ********************************************************************************/
		if(riskassessmentreasoncodecodingi == 0) {r.addRskAssmntRsnCdCdgSys("[[");}
		if(riskassessmentreasoncodecoding.hasSystem()) {

			r.addRskAssmntRsnCdCdgSys(String.valueOf(riskassessmentreasoncodecoding.getSystem()));
		} else {
			r.addRskAssmntRsnCdCdgSys("NULL");
		}

		if(riskassessmentreasoncodecodingi == riskassessmentreasoncodecodinglist.size()-1) {r.addRskAssmntRsnCdCdgSys("]]");}


		 };
		 };
		/******************** riskassessmentnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> riskassessmentnotelist = riskassessment.getNote();
		for(int riskassessmentnotei = 0; riskassessmentnotei<riskassessmentnotelist.size();riskassessmentnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  riskassessmentnote = riskassessmentnotelist.get(riskassessmentnotei);

		/******************** RskAssmnt_Nt_Time ********************************************************************************/
		if(riskassessmentnotei == 0) {r.addRskAssmntNtTime("[");}
		if(riskassessmentnote.hasTime()) {

			r.addRskAssmntNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskassessmentnote.getTime())+"\"");
		} else {
			r.addRskAssmntNtTime("NULL");
		}

		if(riskassessmentnotei == riskassessmentnotelist.size()-1) {r.addRskAssmntNtTime("]");}


		/******************** RskAssmnt_Nt_AthrRfrnc ********************************************************************************/
		if(riskassessmentnotei == 0) {r.addRskAssmntNtAthrRfrnc("[");}
		if(riskassessmentnote.hasAuthorReference()) {

			if(riskassessmentnote.getAuthorReference().getReference() != null) {
			r.addRskAssmntNtAthrRfrnc(riskassessmentnote.getAuthorReference().getReference());
			}
		} else {
			r.addRskAssmntNtAthrRfrnc("NULL");
		}

		if(riskassessmentnotei == riskassessmentnotelist.size()-1) {r.addRskAssmntNtAthrRfrnc("]");}


		/******************** RskAssmnt_Nt_Txt ********************************************************************************/
		if(riskassessmentnotei == 0) {r.addRskAssmntNtTxt("[");}
		if(riskassessmentnote.hasText()) {

			r.addRskAssmntNtTxt(String.valueOf(riskassessmentnote.getText()));
		} else {
			r.addRskAssmntNtTxt("NULL");
		}

		if(riskassessmentnotei == riskassessmentnotelist.size()-1) {r.addRskAssmntNtTxt("]");}


		/******************** RskAssmnt_Nt_AthrStrgTyp ********************************************************************************/
		if(riskassessmentnotei == 0) {r.addRskAssmntNtAthrStrgTyp("[");}
		if(riskassessmentnote.hasAuthorStringType()) {

			r.addRskAssmntNtAthrStrgTyp("\""+riskassessmentnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			r.addRskAssmntNtAthrStrgTyp("NULL");
		}

		if(riskassessmentnotei == riskassessmentnotelist.size()-1) {r.addRskAssmntNtAthrStrgTyp("]");}


		 };
		/******************** RskAssmnt_RsnRfrnc ********************************************************************************/
		if(riskassessment.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<riskassessment.getReasonReference().size(); incr++) {
				array = array + riskassessment.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRskAssmntRsnRfrnc(array);

		} else {
			r.addRskAssmntRsnRfrnc("NULL");
		}


		/******************** riskassessmentidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> riskassessmentidentifierlist = riskassessment.getIdentifier();
		for(int riskassessmentidentifieri = 0; riskassessmentidentifieri<riskassessmentidentifierlist.size();riskassessmentidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  riskassessmentidentifier = riskassessmentidentifierlist.get(riskassessmentidentifieri);

		/******************** RskAssmnt_Id_Vl ********************************************************************************/
		if(riskassessmentidentifieri == 0) {r.addRskAssmntIdVl("[");}
		if(riskassessmentidentifier.hasValue()) {

			r.addRskAssmntIdVl(String.valueOf(riskassessmentidentifier.getValue()));
		} else {
			r.addRskAssmntIdVl("NULL");
		}

		if(riskassessmentidentifieri == riskassessmentidentifierlist.size()-1) {r.addRskAssmntIdVl("]");}


		/******************** riskassessmentidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskassessmentidentifiertype = riskassessmentidentifier.getType();

		/******************** RskAssmnt_Id_Typ_Txt ********************************************************************************/
		if(riskassessmentidentifieri == 0) {r.addRskAssmntIdTypTxt("[");}
		if(riskassessmentidentifiertype.hasText()) {

			r.addRskAssmntIdTypTxt(String.valueOf(riskassessmentidentifiertype.getText()));
		} else {
			r.addRskAssmntIdTypTxt("NULL");
		}

		if(riskassessmentidentifieri == riskassessmentidentifierlist.size()-1) {r.addRskAssmntIdTypTxt("]");}


		/******************** riskassessmentidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> riskassessmentidentifiertypecodinglist = riskassessmentidentifiertype.getCoding();
		for(int riskassessmentidentifiertypecodingi = 0; riskassessmentidentifiertypecodingi<riskassessmentidentifiertypecodinglist.size();riskassessmentidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  riskassessmentidentifiertypecoding = riskassessmentidentifiertypecodinglist.get(riskassessmentidentifiertypecodingi);

		/******************** RskAssmnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(riskassessmentidentifiertypecodingi == 0) {r.addRskAssmntIdTypCdgDsply("[[");}
		if(riskassessmentidentifiertypecoding.hasDisplay()) {

			r.addRskAssmntIdTypCdgDsply(String.valueOf(riskassessmentidentifiertypecoding.getDisplay()));
		} else {
			r.addRskAssmntIdTypCdgDsply("NULL");
		}

		if(riskassessmentidentifiertypecodingi == riskassessmentidentifiertypecodinglist.size()-1) {r.addRskAssmntIdTypCdgDsply("]]");}


		/******************** RskAssmnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(riskassessmentidentifiertypecodingi == 0) {r.addRskAssmntIdTypCdgVrsn("[[");}
		if(riskassessmentidentifiertypecoding.hasVersion()) {

			r.addRskAssmntIdTypCdgVrsn(String.valueOf(riskassessmentidentifiertypecoding.getVersion()));
		} else {
			r.addRskAssmntIdTypCdgVrsn("NULL");
		}

		if(riskassessmentidentifiertypecodingi == riskassessmentidentifiertypecodinglist.size()-1) {r.addRskAssmntIdTypCdgVrsn("]]");}


		/******************** RskAssmnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(riskassessmentidentifiertypecodingi == 0) {r.addRskAssmntIdTypCdgCd("[[");}
		if(riskassessmentidentifiertypecoding.hasCode()) {

			r.addRskAssmntIdTypCdgCd(String.valueOf(riskassessmentidentifiertypecoding.getCode()));
		} else {
			r.addRskAssmntIdTypCdgCd("NULL");
		}

		if(riskassessmentidentifiertypecodingi == riskassessmentidentifiertypecodinglist.size()-1) {r.addRskAssmntIdTypCdgCd("]]");}


		/******************** RskAssmnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(riskassessmentidentifiertypecodingi == 0) {r.addRskAssmntIdTypCdgUsrSltd("[[");}
		if(riskassessmentidentifiertypecoding.hasUserSelected()) {

			r.addRskAssmntIdTypCdgUsrSltd(String.valueOf(riskassessmentidentifiertypecoding.getUserSelected()));
		} else {
			r.addRskAssmntIdTypCdgUsrSltd("NULL");
		}

		if(riskassessmentidentifiertypecodingi == riskassessmentidentifiertypecodinglist.size()-1) {r.addRskAssmntIdTypCdgUsrSltd("]]");}


		/******************** RskAssmnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(riskassessmentidentifiertypecodingi == 0) {r.addRskAssmntIdTypCdgSys("[[");}
		if(riskassessmentidentifiertypecoding.hasSystem()) {

			r.addRskAssmntIdTypCdgSys(String.valueOf(riskassessmentidentifiertypecoding.getSystem()));
		} else {
			r.addRskAssmntIdTypCdgSys("NULL");
		}

		if(riskassessmentidentifiertypecodingi == riskassessmentidentifiertypecodinglist.size()-1) {r.addRskAssmntIdTypCdgSys("]]");}


		 };
		/******************** riskassessmentidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskassessmentidentifierperiod = riskassessmentidentifier.getPeriod();

		/******************** RskAssmnt_Id_Prd_Strt ********************************************************************************/
		if(riskassessmentidentifieri == 0) {r.addRskAssmntIdPrdStrt("[");}
		if(riskassessmentidentifierperiod.hasStart()) {

			r.addRskAssmntIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskassessmentidentifierperiod.getStart())+"\"");
		} else {
			r.addRskAssmntIdPrdStrt("NULL");
		}

		if(riskassessmentidentifieri == riskassessmentidentifierlist.size()-1) {r.addRskAssmntIdPrdStrt("]");}


		/******************** RskAssmnt_Id_Prd_End ********************************************************************************/
		if(riskassessmentidentifieri == 0) {r.addRskAssmntIdPrdEnd("[");}
		if(riskassessmentidentifierperiod.hasEnd()) {

			r.addRskAssmntIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskassessmentidentifierperiod.getEnd())+"\"");
		} else {
			r.addRskAssmntIdPrdEnd("NULL");
		}

		if(riskassessmentidentifieri == riskassessmentidentifierlist.size()-1) {r.addRskAssmntIdPrdEnd("]");}


		/******************** riskassessmentidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse riskassessmentidentifieruse = riskassessmentidentifier.getUse();
		if(riskassessmentidentifieruse!=null) {
		if(riskassessmentidentifieri == 0) {

		r.addRskAssmntIdUse("[");		}
			r.addRskAssmntIdUse(riskassessmentidentifieruse.toCode());
		if(riskassessmentidentifieri == riskassessmentidentifierlist.size()-1) {

		r.addRskAssmntIdUse("]");		}

		} else {
			r.addRskAssmntIdUse("NULL");
		}

		/******************** RskAssmnt_Id_Assigner ********************************************************************************/
		if(riskassessmentidentifieri == 0) {r.addRskAssmntIdAssigner("[");}
		if(riskassessmentidentifier.hasAssigner()) {

			if(riskassessmentidentifier.getAssigner().getReference() != null) {
			r.addRskAssmntIdAssigner(riskassessmentidentifier.getAssigner().getReference());
			}
		} else {
			r.addRskAssmntIdAssigner("NULL");
		}

		if(riskassessmentidentifieri == riskassessmentidentifierlist.size()-1) {r.addRskAssmntIdAssigner("]");}


		/******************** RskAssmnt_Id_Sys ********************************************************************************/
		if(riskassessmentidentifieri == 0) {r.addRskAssmntIdSys("[");}
		if(riskassessmentidentifier.hasSystem()) {

			r.addRskAssmntIdSys(String.valueOf(riskassessmentidentifier.getSystem()));
		} else {
			r.addRskAssmntIdSys("NULL");
		}

		if(riskassessmentidentifieri == riskassessmentidentifierlist.size()-1) {r.addRskAssmntIdSys("]");}


		 };
		/******************** RskAssmnt_OccrnceDtTimeTyp ********************************************************************************/
		if(riskassessment.hasOccurrenceDateTimeType()) {

			r.addRskAssmntOccrnceDtTimeTyp("\""+riskassessment.getOccurrenceDateTimeType().getValueAsString()+"\"");
		} else {
			r.addRskAssmntOccrnceDtTimeTyp("NULL");
		}


		/******************** riskassessmentoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskassessmentoccurrenceperiod = riskassessment.getOccurrencePeriod();

		/******************** RskAssmnt_OccrncePrd_Strt ********************************************************************************/
		if(riskassessmentoccurrenceperiod.hasStart()) {

			r.addRskAssmntOccrncePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskassessmentoccurrenceperiod.getStart())+"\"");
		} else {
			r.addRskAssmntOccrncePrdStrt("NULL");
		}


		/******************** RskAssmnt_OccrncePrd_End ********************************************************************************/
		if(riskassessmentoccurrenceperiod.hasEnd()) {

			r.addRskAssmntOccrncePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskassessmentoccurrenceperiod.getEnd())+"\"");
		} else {
			r.addRskAssmntOccrncePrdEnd("NULL");
		}


		/******************** RskAssmnt_Cndtn ********************************************************************************/
		if(riskassessment.hasCondition()) {

			if(riskassessment.getCondition().getReference() != null) {
			r.addRskAssmntCndtn(riskassessment.getCondition().getReference());
			}
		} else {
			r.addRskAssmntCndtn("NULL");
		}


		/******************** RskAssmnt_Basis ********************************************************************************/
		if(riskassessment.hasBasis()) {

			String  array = "[";
			for(int incr=0; incr<riskassessment.getBasis().size(); incr++) {
				array = array + riskassessment.getBasis().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			r.addRskAssmntBasis(array);

		} else {
			r.addRskAssmntBasis("NULL");
		}


		/******************** RskAssmnt_Prfrmr ********************************************************************************/
		if(riskassessment.hasPerformer()) {

			if(riskassessment.getPerformer().getReference() != null) {
			r.addRskAssmntPrfrmr(riskassessment.getPerformer().getReference());
			}
		} else {
			r.addRskAssmntPrfrmr("NULL");
		}


		/******************** RskAssmnt_Mitigation ********************************************************************************/
		if(riskassessment.hasMitigation()) {

			r.addRskAssmntMitigation(String.valueOf(riskassessment.getMitigation()));
		} else {
			r.addRskAssmntMitigation("NULL");
		}


		/******************** riskassessmentprediction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RiskAssessment.RiskAssessmentPredictionComponent> riskassessmentpredictionlist = riskassessment.getPrediction();
		for(int riskassessmentpredictioni = 0; riskassessmentpredictioni<riskassessmentpredictionlist.size();riskassessmentpredictioni++ ) {
		org.hl7.fhir.r4.model.RiskAssessment.RiskAssessmentPredictionComponent  riskassessmentprediction = riskassessmentpredictionlist.get(riskassessmentpredictioni);

		/******************** riskassessmentpredictionoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskassessmentpredictionoutcome = riskassessmentprediction.getOutcome();

		/******************** RskAssmnt_Prediction_Outcome_Txt ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionOutcomeTxt("[");}
		if(riskassessmentpredictionoutcome.hasText()) {

			r.addRskAssmntPredictionOutcomeTxt(String.valueOf(riskassessmentpredictionoutcome.getText()));
		} else {
			r.addRskAssmntPredictionOutcomeTxt("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionOutcomeTxt("]");}


		/******************** riskassessmentpredictionoutcomecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> riskassessmentpredictionoutcomecodinglist = riskassessmentpredictionoutcome.getCoding();
		for(int riskassessmentpredictionoutcomecodingi = 0; riskassessmentpredictionoutcomecodingi<riskassessmentpredictionoutcomecodinglist.size();riskassessmentpredictionoutcomecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  riskassessmentpredictionoutcomecoding = riskassessmentpredictionoutcomecodinglist.get(riskassessmentpredictionoutcomecodingi);

		/******************** RskAssmnt_Prediction_Outcome_Cdg_Dsply ********************************************************************************/
		if(riskassessmentpredictionoutcomecodingi == 0) {r.addRskAssmntPredictionOutcomeCdgDsply("[[");}
		if(riskassessmentpredictionoutcomecoding.hasDisplay()) {

			r.addRskAssmntPredictionOutcomeCdgDsply(String.valueOf(riskassessmentpredictionoutcomecoding.getDisplay()));
		} else {
			r.addRskAssmntPredictionOutcomeCdgDsply("NULL");
		}

		if(riskassessmentpredictionoutcomecodingi == riskassessmentpredictionoutcomecodinglist.size()-1) {r.addRskAssmntPredictionOutcomeCdgDsply("]]");}


		/******************** RskAssmnt_Prediction_Outcome_Cdg_Vrsn ********************************************************************************/
		if(riskassessmentpredictionoutcomecodingi == 0) {r.addRskAssmntPredictionOutcomeCdgVrsn("[[");}
		if(riskassessmentpredictionoutcomecoding.hasVersion()) {

			r.addRskAssmntPredictionOutcomeCdgVrsn(String.valueOf(riskassessmentpredictionoutcomecoding.getVersion()));
		} else {
			r.addRskAssmntPredictionOutcomeCdgVrsn("NULL");
		}

		if(riskassessmentpredictionoutcomecodingi == riskassessmentpredictionoutcomecodinglist.size()-1) {r.addRskAssmntPredictionOutcomeCdgVrsn("]]");}


		/******************** RskAssmnt_Prediction_Outcome_Cdg_Cd ********************************************************************************/
		if(riskassessmentpredictionoutcomecodingi == 0) {r.addRskAssmntPredictionOutcomeCdgCd("[[");}
		if(riskassessmentpredictionoutcomecoding.hasCode()) {

			r.addRskAssmntPredictionOutcomeCdgCd(String.valueOf(riskassessmentpredictionoutcomecoding.getCode()));
		} else {
			r.addRskAssmntPredictionOutcomeCdgCd("NULL");
		}

		if(riskassessmentpredictionoutcomecodingi == riskassessmentpredictionoutcomecodinglist.size()-1) {r.addRskAssmntPredictionOutcomeCdgCd("]]");}


		/******************** RskAssmnt_Prediction_Outcome_Cdg_UsrSltd ********************************************************************************/
		if(riskassessmentpredictionoutcomecodingi == 0) {r.addRskAssmntPredictionOutcomeCdgUsrSltd("[[");}
		if(riskassessmentpredictionoutcomecoding.hasUserSelected()) {

			r.addRskAssmntPredictionOutcomeCdgUsrSltd(String.valueOf(riskassessmentpredictionoutcomecoding.getUserSelected()));
		} else {
			r.addRskAssmntPredictionOutcomeCdgUsrSltd("NULL");
		}

		if(riskassessmentpredictionoutcomecodingi == riskassessmentpredictionoutcomecodinglist.size()-1) {r.addRskAssmntPredictionOutcomeCdgUsrSltd("]]");}


		/******************** RskAssmnt_Prediction_Outcome_Cdg_Sys ********************************************************************************/
		if(riskassessmentpredictionoutcomecodingi == 0) {r.addRskAssmntPredictionOutcomeCdgSys("[[");}
		if(riskassessmentpredictionoutcomecoding.hasSystem()) {

			r.addRskAssmntPredictionOutcomeCdgSys(String.valueOf(riskassessmentpredictionoutcomecoding.getSystem()));
		} else {
			r.addRskAssmntPredictionOutcomeCdgSys("NULL");
		}

		if(riskassessmentpredictionoutcomecodingi == riskassessmentpredictionoutcomecodinglist.size()-1) {r.addRskAssmntPredictionOutcomeCdgSys("]]");}


		 };
		/******************** RskAssmnt_Prediction_Rtionale ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionRtionale("[");}
		if(riskassessmentprediction.hasRationale()) {

			r.addRskAssmntPredictionRtionale(String.valueOf(riskassessmentprediction.getRationale()));
		} else {
			r.addRskAssmntPredictionRtionale("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionRtionale("]");}


		/******************** riskassessmentpredictionqualitativerisk ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskassessmentpredictionqualitativerisk = riskassessmentprediction.getQualitativeRisk();

		/******************** RskAssmnt_Prediction_QualitativeRsk_Txt ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionQualitativeRskTxt("[");}
		if(riskassessmentpredictionqualitativerisk.hasText()) {

			r.addRskAssmntPredictionQualitativeRskTxt(String.valueOf(riskassessmentpredictionqualitativerisk.getText()));
		} else {
			r.addRskAssmntPredictionQualitativeRskTxt("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionQualitativeRskTxt("]");}


		/******************** riskassessmentpredictionqualitativeriskcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> riskassessmentpredictionqualitativeriskcodinglist = riskassessmentpredictionqualitativerisk.getCoding();
		for(int riskassessmentpredictionqualitativeriskcodingi = 0; riskassessmentpredictionqualitativeriskcodingi<riskassessmentpredictionqualitativeriskcodinglist.size();riskassessmentpredictionqualitativeriskcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  riskassessmentpredictionqualitativeriskcoding = riskassessmentpredictionqualitativeriskcodinglist.get(riskassessmentpredictionqualitativeriskcodingi);

		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_Dsply ********************************************************************************/
		if(riskassessmentpredictionqualitativeriskcodingi == 0) {r.addRskAssmntPredictionQualitativeRskCdgDsply("[[");}
		if(riskassessmentpredictionqualitativeriskcoding.hasDisplay()) {

			r.addRskAssmntPredictionQualitativeRskCdgDsply(String.valueOf(riskassessmentpredictionqualitativeriskcoding.getDisplay()));
		} else {
			r.addRskAssmntPredictionQualitativeRskCdgDsply("NULL");
		}

		if(riskassessmentpredictionqualitativeriskcodingi == riskassessmentpredictionqualitativeriskcodinglist.size()-1) {r.addRskAssmntPredictionQualitativeRskCdgDsply("]]");}


		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_Vrsn ********************************************************************************/
		if(riskassessmentpredictionqualitativeriskcodingi == 0) {r.addRskAssmntPredictionQualitativeRskCdgVrsn("[[");}
		if(riskassessmentpredictionqualitativeriskcoding.hasVersion()) {

			r.addRskAssmntPredictionQualitativeRskCdgVrsn(String.valueOf(riskassessmentpredictionqualitativeriskcoding.getVersion()));
		} else {
			r.addRskAssmntPredictionQualitativeRskCdgVrsn("NULL");
		}

		if(riskassessmentpredictionqualitativeriskcodingi == riskassessmentpredictionqualitativeriskcodinglist.size()-1) {r.addRskAssmntPredictionQualitativeRskCdgVrsn("]]");}


		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_Cd ********************************************************************************/
		if(riskassessmentpredictionqualitativeriskcodingi == 0) {r.addRskAssmntPredictionQualitativeRskCdgCd("[[");}
		if(riskassessmentpredictionqualitativeriskcoding.hasCode()) {

			r.addRskAssmntPredictionQualitativeRskCdgCd(String.valueOf(riskassessmentpredictionqualitativeriskcoding.getCode()));
		} else {
			r.addRskAssmntPredictionQualitativeRskCdgCd("NULL");
		}

		if(riskassessmentpredictionqualitativeriskcodingi == riskassessmentpredictionqualitativeriskcodinglist.size()-1) {r.addRskAssmntPredictionQualitativeRskCdgCd("]]");}


		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_UsrSltd ********************************************************************************/
		if(riskassessmentpredictionqualitativeriskcodingi == 0) {r.addRskAssmntPredictionQualitativeRskCdgUsrSltd("[[");}
		if(riskassessmentpredictionqualitativeriskcoding.hasUserSelected()) {

			r.addRskAssmntPredictionQualitativeRskCdgUsrSltd(String.valueOf(riskassessmentpredictionqualitativeriskcoding.getUserSelected()));
		} else {
			r.addRskAssmntPredictionQualitativeRskCdgUsrSltd("NULL");
		}

		if(riskassessmentpredictionqualitativeriskcodingi == riskassessmentpredictionqualitativeriskcodinglist.size()-1) {r.addRskAssmntPredictionQualitativeRskCdgUsrSltd("]]");}


		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_Sys ********************************************************************************/
		if(riskassessmentpredictionqualitativeriskcodingi == 0) {r.addRskAssmntPredictionQualitativeRskCdgSys("[[");}
		if(riskassessmentpredictionqualitativeriskcoding.hasSystem()) {

			r.addRskAssmntPredictionQualitativeRskCdgSys(String.valueOf(riskassessmentpredictionqualitativeriskcoding.getSystem()));
		} else {
			r.addRskAssmntPredictionQualitativeRskCdgSys("NULL");
		}

		if(riskassessmentpredictionqualitativeriskcodingi == riskassessmentpredictionqualitativeriskcodinglist.size()-1) {r.addRskAssmntPredictionQualitativeRskCdgSys("]]");}


		 };
		/******************** RskAssmnt_Prediction_RelativeRsk ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionRelativeRsk("[");}
		if(riskassessmentprediction.hasRelativeRisk()) {

			r.addRskAssmntPredictionRelativeRsk(String.valueOf(riskassessmentprediction.getRelativeRisk()));
		} else {
			r.addRskAssmntPredictionRelativeRsk("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionRelativeRsk("]");}


		/******************** riskassessmentpredictionwhenrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range riskassessmentpredictionwhenrange = riskassessmentprediction.getWhenRange();

		/******************** riskassessmentpredictionwhenrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskassessmentpredictionwhenrangelow = riskassessmentpredictionwhenrange.getLow();

		/******************** RskAssmnt_Prediction_WhenRng_Lw_Vl ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionWhenRngLwVl("[");}
		if(riskassessmentpredictionwhenrangelow.hasValue()) {

			r.addRskAssmntPredictionWhenRngLwVl(String.valueOf(riskassessmentpredictionwhenrangelow.getValue()));
		} else {
			r.addRskAssmntPredictionWhenRngLwVl("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionWhenRngLwVl("]");}


		/******************** riskassessmentpredictionwhenrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator riskassessmentpredictionwhenrangelowcomparator = riskassessmentpredictionwhenrangelow.getComparator();
		if(riskassessmentpredictionwhenrangelowcomparator!=null) {
		if(riskassessmentpredictioni == 0) {

		r.addRskAssmntPredictionWhenRngLwCmprtr("[");		}
			r.addRskAssmntPredictionWhenRngLwCmprtr(riskassessmentpredictionwhenrangelowcomparator.toCode());
		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {

		r.addRskAssmntPredictionWhenRngLwCmprtr("]");		}

		} else {
			r.addRskAssmntPredictionWhenRngLwCmprtr("NULL");
		}

		/******************** RskAssmnt_Prediction_WhenRng_Lw_Cd ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionWhenRngLwCd("[");}
		if(riskassessmentpredictionwhenrangelow.hasCode()) {

			r.addRskAssmntPredictionWhenRngLwCd(String.valueOf(riskassessmentpredictionwhenrangelow.getCode()));
		} else {
			r.addRskAssmntPredictionWhenRngLwCd("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionWhenRngLwCd("]");}


		/******************** RskAssmnt_Prediction_WhenRng_Lw_Unt ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionWhenRngLwUnt("[");}
		if(riskassessmentpredictionwhenrangelow.hasUnit()) {

			r.addRskAssmntPredictionWhenRngLwUnt(String.valueOf(riskassessmentpredictionwhenrangelow.getUnit()));
		} else {
			r.addRskAssmntPredictionWhenRngLwUnt("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionWhenRngLwUnt("]");}


		/******************** RskAssmnt_Prediction_WhenRng_Lw_Sys ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionWhenRngLwSys("[");}
		if(riskassessmentpredictionwhenrangelow.hasSystem()) {

			r.addRskAssmntPredictionWhenRngLwSys(String.valueOf(riskassessmentpredictionwhenrangelow.getSystem()));
		} else {
			r.addRskAssmntPredictionWhenRngLwSys("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionWhenRngLwSys("]");}


		/******************** riskassessmentpredictionwhenrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskassessmentpredictionwhenrangehigh = riskassessmentpredictionwhenrange.getHigh();

		/******************** RskAssmnt_Prediction_WhenRng_Hi_Vl ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionWhenRngHiVl("[");}
		if(riskassessmentpredictionwhenrangehigh.hasValue()) {

			r.addRskAssmntPredictionWhenRngHiVl(String.valueOf(riskassessmentpredictionwhenrangehigh.getValue()));
		} else {
			r.addRskAssmntPredictionWhenRngHiVl("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionWhenRngHiVl("]");}


		/******************** riskassessmentpredictionwhenrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator riskassessmentpredictionwhenrangehighcomparator = riskassessmentpredictionwhenrangehigh.getComparator();
		if(riskassessmentpredictionwhenrangehighcomparator!=null) {
		if(riskassessmentpredictioni == 0) {

		r.addRskAssmntPredictionWhenRngHiCmprtr("[");		}
			r.addRskAssmntPredictionWhenRngHiCmprtr(riskassessmentpredictionwhenrangehighcomparator.toCode());
		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {

		r.addRskAssmntPredictionWhenRngHiCmprtr("]");		}

		} else {
			r.addRskAssmntPredictionWhenRngHiCmprtr("NULL");
		}

		/******************** RskAssmnt_Prediction_WhenRng_Hi_Cd ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionWhenRngHiCd("[");}
		if(riskassessmentpredictionwhenrangehigh.hasCode()) {

			r.addRskAssmntPredictionWhenRngHiCd(String.valueOf(riskassessmentpredictionwhenrangehigh.getCode()));
		} else {
			r.addRskAssmntPredictionWhenRngHiCd("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionWhenRngHiCd("]");}


		/******************** RskAssmnt_Prediction_WhenRng_Hi_Unt ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionWhenRngHiUnt("[");}
		if(riskassessmentpredictionwhenrangehigh.hasUnit()) {

			r.addRskAssmntPredictionWhenRngHiUnt(String.valueOf(riskassessmentpredictionwhenrangehigh.getUnit()));
		} else {
			r.addRskAssmntPredictionWhenRngHiUnt("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionWhenRngHiUnt("]");}


		/******************** RskAssmnt_Prediction_WhenRng_Hi_Sys ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionWhenRngHiSys("[");}
		if(riskassessmentpredictionwhenrangehigh.hasSystem()) {

			r.addRskAssmntPredictionWhenRngHiSys(String.valueOf(riskassessmentpredictionwhenrangehigh.getSystem()));
		} else {
			r.addRskAssmntPredictionWhenRngHiSys("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionWhenRngHiSys("]");}


		/******************** riskassessmentpredictionwhenperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskassessmentpredictionwhenperiod = riskassessmentprediction.getWhenPeriod();

		/******************** RskAssmnt_Prediction_WhenPrd_Strt ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionWhenPrdStrt("[");}
		if(riskassessmentpredictionwhenperiod.hasStart()) {

			r.addRskAssmntPredictionWhenPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskassessmentpredictionwhenperiod.getStart())+"\"");
		} else {
			r.addRskAssmntPredictionWhenPrdStrt("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionWhenPrdStrt("]");}


		/******************** RskAssmnt_Prediction_WhenPrd_End ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionWhenPrdEnd("[");}
		if(riskassessmentpredictionwhenperiod.hasEnd()) {

			r.addRskAssmntPredictionWhenPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(riskassessmentpredictionwhenperiod.getEnd())+"\"");
		} else {
			r.addRskAssmntPredictionWhenPrdEnd("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionWhenPrdEnd("]");}


		/******************** riskassessmentpredictionprobabilityrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range riskassessmentpredictionprobabilityrange = riskassessmentprediction.getProbabilityRange();

		/******************** riskassessmentpredictionprobabilityrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskassessmentpredictionprobabilityrangelow = riskassessmentpredictionprobabilityrange.getLow();

		/******************** RskAssmnt_Prediction_ProbabilityRng_Lw_Vl ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionProbabilityRngLwVl("[");}
		if(riskassessmentpredictionprobabilityrangelow.hasValue()) {

			r.addRskAssmntPredictionProbabilityRngLwVl(String.valueOf(riskassessmentpredictionprobabilityrangelow.getValue()));
		} else {
			r.addRskAssmntPredictionProbabilityRngLwVl("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionProbabilityRngLwVl("]");}


		/******************** riskassessmentpredictionprobabilityrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator riskassessmentpredictionprobabilityrangelowcomparator = riskassessmentpredictionprobabilityrangelow.getComparator();
		if(riskassessmentpredictionprobabilityrangelowcomparator!=null) {
		if(riskassessmentpredictioni == 0) {

		r.addRskAssmntPredictionProbabilityRngLwCmprtr("[");		}
			r.addRskAssmntPredictionProbabilityRngLwCmprtr(riskassessmentpredictionprobabilityrangelowcomparator.toCode());
		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {

		r.addRskAssmntPredictionProbabilityRngLwCmprtr("]");		}

		} else {
			r.addRskAssmntPredictionProbabilityRngLwCmprtr("NULL");
		}

		/******************** RskAssmnt_Prediction_ProbabilityRng_Lw_Cd ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionProbabilityRngLwCd("[");}
		if(riskassessmentpredictionprobabilityrangelow.hasCode()) {

			r.addRskAssmntPredictionProbabilityRngLwCd(String.valueOf(riskassessmentpredictionprobabilityrangelow.getCode()));
		} else {
			r.addRskAssmntPredictionProbabilityRngLwCd("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionProbabilityRngLwCd("]");}


		/******************** RskAssmnt_Prediction_ProbabilityRng_Lw_Unt ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionProbabilityRngLwUnt("[");}
		if(riskassessmentpredictionprobabilityrangelow.hasUnit()) {

			r.addRskAssmntPredictionProbabilityRngLwUnt(String.valueOf(riskassessmentpredictionprobabilityrangelow.getUnit()));
		} else {
			r.addRskAssmntPredictionProbabilityRngLwUnt("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionProbabilityRngLwUnt("]");}


		/******************** RskAssmnt_Prediction_ProbabilityRng_Lw_Sys ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionProbabilityRngLwSys("[");}
		if(riskassessmentpredictionprobabilityrangelow.hasSystem()) {

			r.addRskAssmntPredictionProbabilityRngLwSys(String.valueOf(riskassessmentpredictionprobabilityrangelow.getSystem()));
		} else {
			r.addRskAssmntPredictionProbabilityRngLwSys("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionProbabilityRngLwSys("]");}


		/******************** riskassessmentpredictionprobabilityrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskassessmentpredictionprobabilityrangehigh = riskassessmentpredictionprobabilityrange.getHigh();

		/******************** RskAssmnt_Prediction_ProbabilityRng_Hi_Vl ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionProbabilityRngHiVl("[");}
		if(riskassessmentpredictionprobabilityrangehigh.hasValue()) {

			r.addRskAssmntPredictionProbabilityRngHiVl(String.valueOf(riskassessmentpredictionprobabilityrangehigh.getValue()));
		} else {
			r.addRskAssmntPredictionProbabilityRngHiVl("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionProbabilityRngHiVl("]");}


		/******************** riskassessmentpredictionprobabilityrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator riskassessmentpredictionprobabilityrangehighcomparator = riskassessmentpredictionprobabilityrangehigh.getComparator();
		if(riskassessmentpredictionprobabilityrangehighcomparator!=null) {
		if(riskassessmentpredictioni == 0) {

		r.addRskAssmntPredictionProbabilityRngHiCmprtr("[");		}
			r.addRskAssmntPredictionProbabilityRngHiCmprtr(riskassessmentpredictionprobabilityrangehighcomparator.toCode());
		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {

		r.addRskAssmntPredictionProbabilityRngHiCmprtr("]");		}

		} else {
			r.addRskAssmntPredictionProbabilityRngHiCmprtr("NULL");
		}

		/******************** RskAssmnt_Prediction_ProbabilityRng_Hi_Cd ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionProbabilityRngHiCd("[");}
		if(riskassessmentpredictionprobabilityrangehigh.hasCode()) {

			r.addRskAssmntPredictionProbabilityRngHiCd(String.valueOf(riskassessmentpredictionprobabilityrangehigh.getCode()));
		} else {
			r.addRskAssmntPredictionProbabilityRngHiCd("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionProbabilityRngHiCd("]");}


		/******************** RskAssmnt_Prediction_ProbabilityRng_Hi_Unt ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionProbabilityRngHiUnt("[");}
		if(riskassessmentpredictionprobabilityrangehigh.hasUnit()) {

			r.addRskAssmntPredictionProbabilityRngHiUnt(String.valueOf(riskassessmentpredictionprobabilityrangehigh.getUnit()));
		} else {
			r.addRskAssmntPredictionProbabilityRngHiUnt("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionProbabilityRngHiUnt("]");}


		/******************** RskAssmnt_Prediction_ProbabilityRng_Hi_Sys ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionProbabilityRngHiSys("[");}
		if(riskassessmentpredictionprobabilityrangehigh.hasSystem()) {

			r.addRskAssmntPredictionProbabilityRngHiSys(String.valueOf(riskassessmentpredictionprobabilityrangehigh.getSystem()));
		} else {
			r.addRskAssmntPredictionProbabilityRngHiSys("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionProbabilityRngHiSys("]");}


		/******************** RskAssmnt_Prediction_ProbabilityDecimalTyp ********************************************************************************/
		if(riskassessmentpredictioni == 0) {r.addRskAssmntPredictionProbabilityDecimalTyp("[");}
		if(riskassessmentprediction.hasProbabilityDecimalType()) {

			r.addRskAssmntPredictionProbabilityDecimalTyp("\""+riskassessmentprediction.getProbabilityDecimalType().getValueAsString()+"\"");
		} else {
			r.addRskAssmntPredictionProbabilityDecimalTyp("NULL");
		}

		if(riskassessmentpredictioni == riskassessmentpredictionlist.size()-1) {r.addRskAssmntPredictionProbabilityDecimalTyp("]");}


		 };
		return r;
	}
}
