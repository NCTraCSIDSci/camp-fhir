package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationAdministration;
public class MedicationAdministrationBidirectionalConversion 
{
	public MedicationAdministration MedicationAdministrations(org.hl7.fhir.r4.model.MedicationAdministration medicationadministration) throws ParseException
	{
		 main.java.com.campfhir.model.MedicationAdministration m = new  main.java.com.campfhir.model.MedicationAdministration();

		/******************** id ********************************************************************************/
		m.setId(medicationadministration.getIdElement().getIdPart());

		/******************** MdctnAdmnstn_Cntxt ********************************************************************************/
		if(medicationadministration.hasContext()) {

			if(medicationadministration.getContext().getReference() != null) {
			m.addMdctnAdmnstnCntxt(medicationadministration.getContext().getReference());
			}
		} else {
			m.addMdctnAdmnstnCntxt("NULL");
		}


		/******************** MdctnAdmnstn_Sbjct ********************************************************************************/
		if(medicationadministration.hasSubject()) {

			if(medicationadministration.getSubject().getReference() != null) {
			m.addMdctnAdmnstnSbjct(medicationadministration.getSubject().getReference());
			}
		} else {
			m.addMdctnAdmnstnSbjct("NULL");
		}


		/******************** medicationadministrationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationStatus medicationadministrationstatus = medicationadministration.getStatus();
		if(medicationadministrationstatus!=null) {
			m.addMdctnAdmnstnSts(medicationadministrationstatus.toCode());
		} else {
			m.addMdctnAdmnstnSts("NULL");
		}

		/******************** medicationadministrationreasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicationadministrationreasoncodelist = medicationadministration.getReasonCode();
		for(int medicationadministrationreasoncodei = 0; medicationadministrationreasoncodei<medicationadministrationreasoncodelist.size();medicationadministrationreasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicationadministrationreasoncode = medicationadministrationreasoncodelist.get(medicationadministrationreasoncodei);

		/******************** MdctnAdmnstn_RsnCd_Txt ********************************************************************************/
		if(medicationadministrationreasoncodei == 0) {m.addMdctnAdmnstnRsnCdTxt("[");}
		if(medicationadministrationreasoncode.hasText()) {

			m.addMdctnAdmnstnRsnCdTxt(String.valueOf(medicationadministrationreasoncode.getText()));
		} else {
			m.addMdctnAdmnstnRsnCdTxt("NULL");
		}

		if(medicationadministrationreasoncodei == medicationadministrationreasoncodelist.size()-1) {m.addMdctnAdmnstnRsnCdTxt("]");}


		/******************** medicationadministrationreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationadministrationreasoncodecodinglist = medicationadministrationreasoncode.getCoding();
		for(int medicationadministrationreasoncodecodingi = 0; medicationadministrationreasoncodecodingi<medicationadministrationreasoncodecodinglist.size();medicationadministrationreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationadministrationreasoncodecoding = medicationadministrationreasoncodecodinglist.get(medicationadministrationreasoncodecodingi);

		/******************** MdctnAdmnstn_RsnCd_Cdg_Dsply ********************************************************************************/
		if(medicationadministrationreasoncodecodingi == 0) {m.addMdctnAdmnstnRsnCdCdgDsply("[[");}
		if(medicationadministrationreasoncodecoding.hasDisplay()) {

			m.addMdctnAdmnstnRsnCdCdgDsply(String.valueOf(medicationadministrationreasoncodecoding.getDisplay()));
		} else {
			m.addMdctnAdmnstnRsnCdCdgDsply("NULL");
		}

		if(medicationadministrationreasoncodecodingi == medicationadministrationreasoncodecodinglist.size()-1) {m.addMdctnAdmnstnRsnCdCdgDsply("]]");}


		/******************** MdctnAdmnstn_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(medicationadministrationreasoncodecodingi == 0) {m.addMdctnAdmnstnRsnCdCdgVrsn("[[");}
		if(medicationadministrationreasoncodecoding.hasVersion()) {

			m.addMdctnAdmnstnRsnCdCdgVrsn(String.valueOf(medicationadministrationreasoncodecoding.getVersion()));
		} else {
			m.addMdctnAdmnstnRsnCdCdgVrsn("NULL");
		}

		if(medicationadministrationreasoncodecodingi == medicationadministrationreasoncodecodinglist.size()-1) {m.addMdctnAdmnstnRsnCdCdgVrsn("]]");}


		/******************** MdctnAdmnstn_RsnCd_Cdg_Cd ********************************************************************************/
		if(medicationadministrationreasoncodecodingi == 0) {m.addMdctnAdmnstnRsnCdCdgCd("[[");}
		if(medicationadministrationreasoncodecoding.hasCode()) {

			m.addMdctnAdmnstnRsnCdCdgCd(String.valueOf(medicationadministrationreasoncodecoding.getCode()));
		} else {
			m.addMdctnAdmnstnRsnCdCdgCd("NULL");
		}

		if(medicationadministrationreasoncodecodingi == medicationadministrationreasoncodecodinglist.size()-1) {m.addMdctnAdmnstnRsnCdCdgCd("]]");}


		/******************** MdctnAdmnstn_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(medicationadministrationreasoncodecodingi == 0) {m.addMdctnAdmnstnRsnCdCdgUsrSltd("[[");}
		if(medicationadministrationreasoncodecoding.hasUserSelected()) {

			m.addMdctnAdmnstnRsnCdCdgUsrSltd(String.valueOf(medicationadministrationreasoncodecoding.getUserSelected()));
		} else {
			m.addMdctnAdmnstnRsnCdCdgUsrSltd("NULL");
		}

		if(medicationadministrationreasoncodecodingi == medicationadministrationreasoncodecodinglist.size()-1) {m.addMdctnAdmnstnRsnCdCdgUsrSltd("]]");}


		/******************** MdctnAdmnstn_RsnCd_Cdg_Sys ********************************************************************************/
		if(medicationadministrationreasoncodecodingi == 0) {m.addMdctnAdmnstnRsnCdCdgSys("[[");}
		if(medicationadministrationreasoncodecoding.hasSystem()) {

			m.addMdctnAdmnstnRsnCdCdgSys(String.valueOf(medicationadministrationreasoncodecoding.getSystem()));
		} else {
			m.addMdctnAdmnstnRsnCdCdgSys("NULL");
		}

		if(medicationadministrationreasoncodecodingi == medicationadministrationreasoncodecodinglist.size()-1) {m.addMdctnAdmnstnRsnCdCdgSys("]]");}


		 };
		 };
		/******************** medicationadministrationnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> medicationadministrationnotelist = medicationadministration.getNote();
		for(int medicationadministrationnotei = 0; medicationadministrationnotei<medicationadministrationnotelist.size();medicationadministrationnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  medicationadministrationnote = medicationadministrationnotelist.get(medicationadministrationnotei);

		/******************** MdctnAdmnstn_Nt_Time ********************************************************************************/
		if(medicationadministrationnotei == 0) {m.addMdctnAdmnstnNtTime("[");}
		if(medicationadministrationnote.hasTime()) {

			m.addMdctnAdmnstnNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationadministrationnote.getTime())+"\"");
		} else {
			m.addMdctnAdmnstnNtTime("NULL");
		}

		if(medicationadministrationnotei == medicationadministrationnotelist.size()-1) {m.addMdctnAdmnstnNtTime("]");}


		/******************** MdctnAdmnstn_Nt_AthrRfrnc ********************************************************************************/
		if(medicationadministrationnotei == 0) {m.addMdctnAdmnstnNtAthrRfrnc("[");}
		if(medicationadministrationnote.hasAuthorReference()) {

			if(medicationadministrationnote.getAuthorReference().getReference() != null) {
			m.addMdctnAdmnstnNtAthrRfrnc(medicationadministrationnote.getAuthorReference().getReference());
			}
		} else {
			m.addMdctnAdmnstnNtAthrRfrnc("NULL");
		}

		if(medicationadministrationnotei == medicationadministrationnotelist.size()-1) {m.addMdctnAdmnstnNtAthrRfrnc("]");}


		/******************** MdctnAdmnstn_Nt_Txt ********************************************************************************/
		if(medicationadministrationnotei == 0) {m.addMdctnAdmnstnNtTxt("[");}
		if(medicationadministrationnote.hasText()) {

			m.addMdctnAdmnstnNtTxt(String.valueOf(medicationadministrationnote.getText()));
		} else {
			m.addMdctnAdmnstnNtTxt("NULL");
		}

		if(medicationadministrationnotei == medicationadministrationnotelist.size()-1) {m.addMdctnAdmnstnNtTxt("]");}


		/******************** MdctnAdmnstn_Nt_AthrStrgTyp ********************************************************************************/
		if(medicationadministrationnotei == 0) {m.addMdctnAdmnstnNtAthrStrgTyp("[");}
		if(medicationadministrationnote.hasAuthorStringType()) {

			m.addMdctnAdmnstnNtAthrStrgTyp("\""+medicationadministrationnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			m.addMdctnAdmnstnNtAthrStrgTyp("NULL");
		}

		if(medicationadministrationnotei == medicationadministrationnotelist.size()-1) {m.addMdctnAdmnstnNtAthrStrgTyp("]");}


		 };
		/******************** MdctnAdmnstn_RsnRfrnc ********************************************************************************/
		if(medicationadministration.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<medicationadministration.getReasonReference().size(); incr++) {
				array = array + medicationadministration.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnAdmnstnRsnRfrnc(array);

		} else {
			m.addMdctnAdmnstnRsnRfrnc("NULL");
		}


		/******************** MdctnAdmnstn_Rqst ********************************************************************************/
		if(medicationadministration.hasRequest()) {

			if(medicationadministration.getRequest().getReference() != null) {
			m.addMdctnAdmnstnRqst(medicationadministration.getRequest().getReference());
			}
		} else {
			m.addMdctnAdmnstnRqst("NULL");
		}


		/******************** medicationadministrationidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> medicationadministrationidentifierlist = medicationadministration.getIdentifier();
		for(int medicationadministrationidentifieri = 0; medicationadministrationidentifieri<medicationadministrationidentifierlist.size();medicationadministrationidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  medicationadministrationidentifier = medicationadministrationidentifierlist.get(medicationadministrationidentifieri);

		/******************** MdctnAdmnstn_Id_Vl ********************************************************************************/
		if(medicationadministrationidentifieri == 0) {m.addMdctnAdmnstnIdVl("[");}
		if(medicationadministrationidentifier.hasValue()) {

			m.addMdctnAdmnstnIdVl(String.valueOf(medicationadministrationidentifier.getValue()));
		} else {
			m.addMdctnAdmnstnIdVl("NULL");
		}

		if(medicationadministrationidentifieri == medicationadministrationidentifierlist.size()-1) {m.addMdctnAdmnstnIdVl("]");}


		/******************** medicationadministrationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationidentifiertype = medicationadministrationidentifier.getType();

		/******************** MdctnAdmnstn_Id_Typ_Txt ********************************************************************************/
		if(medicationadministrationidentifieri == 0) {m.addMdctnAdmnstnIdTypTxt("[");}
		if(medicationadministrationidentifiertype.hasText()) {

			m.addMdctnAdmnstnIdTypTxt(String.valueOf(medicationadministrationidentifiertype.getText()));
		} else {
			m.addMdctnAdmnstnIdTypTxt("NULL");
		}

		if(medicationadministrationidentifieri == medicationadministrationidentifierlist.size()-1) {m.addMdctnAdmnstnIdTypTxt("]");}


		/******************** medicationadministrationidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationadministrationidentifiertypecodinglist = medicationadministrationidentifiertype.getCoding();
		for(int medicationadministrationidentifiertypecodingi = 0; medicationadministrationidentifiertypecodingi<medicationadministrationidentifiertypecodinglist.size();medicationadministrationidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationadministrationidentifiertypecoding = medicationadministrationidentifiertypecodinglist.get(medicationadministrationidentifiertypecodingi);

		/******************** MdctnAdmnstn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationadministrationidentifiertypecodingi == 0) {m.addMdctnAdmnstnIdTypCdgDsply("[[");}
		if(medicationadministrationidentifiertypecoding.hasDisplay()) {

			m.addMdctnAdmnstnIdTypCdgDsply(String.valueOf(medicationadministrationidentifiertypecoding.getDisplay()));
		} else {
			m.addMdctnAdmnstnIdTypCdgDsply("NULL");
		}

		if(medicationadministrationidentifiertypecodingi == medicationadministrationidentifiertypecodinglist.size()-1) {m.addMdctnAdmnstnIdTypCdgDsply("]]");}


		/******************** MdctnAdmnstn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationadministrationidentifiertypecodingi == 0) {m.addMdctnAdmnstnIdTypCdgVrsn("[[");}
		if(medicationadministrationidentifiertypecoding.hasVersion()) {

			m.addMdctnAdmnstnIdTypCdgVrsn(String.valueOf(medicationadministrationidentifiertypecoding.getVersion()));
		} else {
			m.addMdctnAdmnstnIdTypCdgVrsn("NULL");
		}

		if(medicationadministrationidentifiertypecodingi == medicationadministrationidentifiertypecodinglist.size()-1) {m.addMdctnAdmnstnIdTypCdgVrsn("]]");}


		/******************** MdctnAdmnstn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicationadministrationidentifiertypecodingi == 0) {m.addMdctnAdmnstnIdTypCdgCd("[[");}
		if(medicationadministrationidentifiertypecoding.hasCode()) {

			m.addMdctnAdmnstnIdTypCdgCd(String.valueOf(medicationadministrationidentifiertypecoding.getCode()));
		} else {
			m.addMdctnAdmnstnIdTypCdgCd("NULL");
		}

		if(medicationadministrationidentifiertypecodingi == medicationadministrationidentifiertypecodinglist.size()-1) {m.addMdctnAdmnstnIdTypCdgCd("]]");}


		/******************** MdctnAdmnstn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationadministrationidentifiertypecodingi == 0) {m.addMdctnAdmnstnIdTypCdgUsrSltd("[[");}
		if(medicationadministrationidentifiertypecoding.hasUserSelected()) {

			m.addMdctnAdmnstnIdTypCdgUsrSltd(String.valueOf(medicationadministrationidentifiertypecoding.getUserSelected()));
		} else {
			m.addMdctnAdmnstnIdTypCdgUsrSltd("NULL");
		}

		if(medicationadministrationidentifiertypecodingi == medicationadministrationidentifiertypecodinglist.size()-1) {m.addMdctnAdmnstnIdTypCdgUsrSltd("]]");}


		/******************** MdctnAdmnstn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicationadministrationidentifiertypecodingi == 0) {m.addMdctnAdmnstnIdTypCdgSys("[[");}
		if(medicationadministrationidentifiertypecoding.hasSystem()) {

			m.addMdctnAdmnstnIdTypCdgSys(String.valueOf(medicationadministrationidentifiertypecoding.getSystem()));
		} else {
			m.addMdctnAdmnstnIdTypCdgSys("NULL");
		}

		if(medicationadministrationidentifiertypecodingi == medicationadministrationidentifiertypecodinglist.size()-1) {m.addMdctnAdmnstnIdTypCdgSys("]]");}


		 };
		/******************** medicationadministrationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationadministrationidentifierperiod = medicationadministrationidentifier.getPeriod();

		/******************** MdctnAdmnstn_Id_Prd_Strt ********************************************************************************/
		if(medicationadministrationidentifieri == 0) {m.addMdctnAdmnstnIdPrdStrt("[");}
		if(medicationadministrationidentifierperiod.hasStart()) {

			m.addMdctnAdmnstnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationadministrationidentifierperiod.getStart())+"\"");
		} else {
			m.addMdctnAdmnstnIdPrdStrt("NULL");
		}

		if(medicationadministrationidentifieri == medicationadministrationidentifierlist.size()-1) {m.addMdctnAdmnstnIdPrdStrt("]");}


		/******************** MdctnAdmnstn_Id_Prd_End ********************************************************************************/
		if(medicationadministrationidentifieri == 0) {m.addMdctnAdmnstnIdPrdEnd("[");}
		if(medicationadministrationidentifierperiod.hasEnd()) {

			m.addMdctnAdmnstnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationadministrationidentifierperiod.getEnd())+"\"");
		} else {
			m.addMdctnAdmnstnIdPrdEnd("NULL");
		}

		if(medicationadministrationidentifieri == medicationadministrationidentifierlist.size()-1) {m.addMdctnAdmnstnIdPrdEnd("]");}


		/******************** medicationadministrationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicationadministrationidentifieruse = medicationadministrationidentifier.getUse();
		if(medicationadministrationidentifieruse!=null) {
		if(medicationadministrationidentifieri == 0) {

		m.addMdctnAdmnstnIdUse("[");		}
			m.addMdctnAdmnstnIdUse(medicationadministrationidentifieruse.toCode());
		if(medicationadministrationidentifieri == medicationadministrationidentifierlist.size()-1) {

		m.addMdctnAdmnstnIdUse("]");		}

		} else {
			m.addMdctnAdmnstnIdUse("NULL");
		}

		/******************** MdctnAdmnstn_Id_Assigner ********************************************************************************/
		if(medicationadministrationidentifieri == 0) {m.addMdctnAdmnstnIdAssigner("[");}
		if(medicationadministrationidentifier.hasAssigner()) {

			if(medicationadministrationidentifier.getAssigner().getReference() != null) {
			m.addMdctnAdmnstnIdAssigner(medicationadministrationidentifier.getAssigner().getReference());
			}
		} else {
			m.addMdctnAdmnstnIdAssigner("NULL");
		}

		if(medicationadministrationidentifieri == medicationadministrationidentifierlist.size()-1) {m.addMdctnAdmnstnIdAssigner("]");}


		/******************** MdctnAdmnstn_Id_Sys ********************************************************************************/
		if(medicationadministrationidentifieri == 0) {m.addMdctnAdmnstnIdSys("[");}
		if(medicationadministrationidentifier.hasSystem()) {

			m.addMdctnAdmnstnIdSys(String.valueOf(medicationadministrationidentifier.getSystem()));
		} else {
			m.addMdctnAdmnstnIdSys("NULL");
		}

		if(medicationadministrationidentifieri == medicationadministrationidentifierlist.size()-1) {m.addMdctnAdmnstnIdSys("]");}


		 };
		/******************** medicationadministrationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationcategory = medicationadministration.getCategory();

		/******************** MdctnAdmnstn_Ctgry_Txt ********************************************************************************/
		if(medicationadministrationcategory.hasText()) {

			m.addMdctnAdmnstnCtgryTxt(String.valueOf(medicationadministrationcategory.getText()));
		} else {
			m.addMdctnAdmnstnCtgryTxt("NULL");
		}


		/******************** medicationadministrationcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationadministrationcategorycodinglist = medicationadministrationcategory.getCoding();
		for(int medicationadministrationcategorycodingi = 0; medicationadministrationcategorycodingi<medicationadministrationcategorycodinglist.size();medicationadministrationcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationadministrationcategorycoding = medicationadministrationcategorycodinglist.get(medicationadministrationcategorycodingi);

		/******************** MdctnAdmnstn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(medicationadministrationcategorycodingi == 0) {m.addMdctnAdmnstnCtgryCdgDsply("[");}
		if(medicationadministrationcategorycoding.hasDisplay()) {

			m.addMdctnAdmnstnCtgryCdgDsply(String.valueOf(medicationadministrationcategorycoding.getDisplay()));
		} else {
			m.addMdctnAdmnstnCtgryCdgDsply("NULL");
		}

		if(medicationadministrationcategorycodingi == medicationadministrationcategorycodinglist.size()-1) {m.addMdctnAdmnstnCtgryCdgDsply("]");}


		/******************** MdctnAdmnstn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(medicationadministrationcategorycodingi == 0) {m.addMdctnAdmnstnCtgryCdgVrsn("[");}
		if(medicationadministrationcategorycoding.hasVersion()) {

			m.addMdctnAdmnstnCtgryCdgVrsn(String.valueOf(medicationadministrationcategorycoding.getVersion()));
		} else {
			m.addMdctnAdmnstnCtgryCdgVrsn("NULL");
		}

		if(medicationadministrationcategorycodingi == medicationadministrationcategorycodinglist.size()-1) {m.addMdctnAdmnstnCtgryCdgVrsn("]");}


		/******************** MdctnAdmnstn_Ctgry_Cdg_Cd ********************************************************************************/
		if(medicationadministrationcategorycodingi == 0) {m.addMdctnAdmnstnCtgryCdgCd("[");}
		if(medicationadministrationcategorycoding.hasCode()) {

			m.addMdctnAdmnstnCtgryCdgCd(String.valueOf(medicationadministrationcategorycoding.getCode()));
		} else {
			m.addMdctnAdmnstnCtgryCdgCd("NULL");
		}

		if(medicationadministrationcategorycodingi == medicationadministrationcategorycodinglist.size()-1) {m.addMdctnAdmnstnCtgryCdgCd("]");}


		/******************** MdctnAdmnstn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(medicationadministrationcategorycodingi == 0) {m.addMdctnAdmnstnCtgryCdgUsrSltd("[");}
		if(medicationadministrationcategorycoding.hasUserSelected()) {

			m.addMdctnAdmnstnCtgryCdgUsrSltd(String.valueOf(medicationadministrationcategorycoding.getUserSelected()));
		} else {
			m.addMdctnAdmnstnCtgryCdgUsrSltd("NULL");
		}

		if(medicationadministrationcategorycodingi == medicationadministrationcategorycodinglist.size()-1) {m.addMdctnAdmnstnCtgryCdgUsrSltd("]");}


		/******************** MdctnAdmnstn_Ctgry_Cdg_Sys ********************************************************************************/
		if(medicationadministrationcategorycodingi == 0) {m.addMdctnAdmnstnCtgryCdgSys("[");}
		if(medicationadministrationcategorycoding.hasSystem()) {

			m.addMdctnAdmnstnCtgryCdgSys(String.valueOf(medicationadministrationcategorycoding.getSystem()));
		} else {
			m.addMdctnAdmnstnCtgryCdgSys("NULL");
		}

		if(medicationadministrationcategorycodingi == medicationadministrationcategorycodinglist.size()-1) {m.addMdctnAdmnstnCtgryCdgSys("]");}


		 };
		/******************** medicationadministrationdosage ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationDosageComponent medicationadministrationdosage = medicationadministration.getDosage();

		/******************** medicationadministrationdosagemethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationdosagemethod = medicationadministrationdosage.getMethod();

		/******************** MdctnAdmnstn_Dsg_Mthd_Txt ********************************************************************************/
		if(medicationadministrationdosagemethod.hasText()) {

			m.addMdctnAdmnstnDsgMthdTxt(String.valueOf(medicationadministrationdosagemethod.getText()));
		} else {
			m.addMdctnAdmnstnDsgMthdTxt("NULL");
		}


		/******************** medicationadministrationdosagemethodcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationadministrationdosagemethodcodinglist = medicationadministrationdosagemethod.getCoding();
		for(int medicationadministrationdosagemethodcodingi = 0; medicationadministrationdosagemethodcodingi<medicationadministrationdosagemethodcodinglist.size();medicationadministrationdosagemethodcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationadministrationdosagemethodcoding = medicationadministrationdosagemethodcodinglist.get(medicationadministrationdosagemethodcodingi);

		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_Dsply ********************************************************************************/
		if(medicationadministrationdosagemethodcodingi == 0) {m.addMdctnAdmnstnDsgMthdCdgDsply("[");}
		if(medicationadministrationdosagemethodcoding.hasDisplay()) {

			m.addMdctnAdmnstnDsgMthdCdgDsply(String.valueOf(medicationadministrationdosagemethodcoding.getDisplay()));
		} else {
			m.addMdctnAdmnstnDsgMthdCdgDsply("NULL");
		}

		if(medicationadministrationdosagemethodcodingi == medicationadministrationdosagemethodcodinglist.size()-1) {m.addMdctnAdmnstnDsgMthdCdgDsply("]");}


		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_Vrsn ********************************************************************************/
		if(medicationadministrationdosagemethodcodingi == 0) {m.addMdctnAdmnstnDsgMthdCdgVrsn("[");}
		if(medicationadministrationdosagemethodcoding.hasVersion()) {

			m.addMdctnAdmnstnDsgMthdCdgVrsn(String.valueOf(medicationadministrationdosagemethodcoding.getVersion()));
		} else {
			m.addMdctnAdmnstnDsgMthdCdgVrsn("NULL");
		}

		if(medicationadministrationdosagemethodcodingi == medicationadministrationdosagemethodcodinglist.size()-1) {m.addMdctnAdmnstnDsgMthdCdgVrsn("]");}


		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_Cd ********************************************************************************/
		if(medicationadministrationdosagemethodcodingi == 0) {m.addMdctnAdmnstnDsgMthdCdgCd("[");}
		if(medicationadministrationdosagemethodcoding.hasCode()) {

			m.addMdctnAdmnstnDsgMthdCdgCd(String.valueOf(medicationadministrationdosagemethodcoding.getCode()));
		} else {
			m.addMdctnAdmnstnDsgMthdCdgCd("NULL");
		}

		if(medicationadministrationdosagemethodcodingi == medicationadministrationdosagemethodcodinglist.size()-1) {m.addMdctnAdmnstnDsgMthdCdgCd("]");}


		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(medicationadministrationdosagemethodcodingi == 0) {m.addMdctnAdmnstnDsgMthdCdgUsrSltd("[");}
		if(medicationadministrationdosagemethodcoding.hasUserSelected()) {

			m.addMdctnAdmnstnDsgMthdCdgUsrSltd(String.valueOf(medicationadministrationdosagemethodcoding.getUserSelected()));
		} else {
			m.addMdctnAdmnstnDsgMthdCdgUsrSltd("NULL");
		}

		if(medicationadministrationdosagemethodcodingi == medicationadministrationdosagemethodcodinglist.size()-1) {m.addMdctnAdmnstnDsgMthdCdgUsrSltd("]");}


		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_Sys ********************************************************************************/
		if(medicationadministrationdosagemethodcodingi == 0) {m.addMdctnAdmnstnDsgMthdCdgSys("[");}
		if(medicationadministrationdosagemethodcoding.hasSystem()) {

			m.addMdctnAdmnstnDsgMthdCdgSys(String.valueOf(medicationadministrationdosagemethodcoding.getSystem()));
		} else {
			m.addMdctnAdmnstnDsgMthdCdgSys("NULL");
		}

		if(medicationadministrationdosagemethodcodingi == medicationadministrationdosagemethodcodinglist.size()-1) {m.addMdctnAdmnstnDsgMthdCdgSys("]");}


		 };
		/******************** medicationadministrationdosagedose ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationadministrationdosagedose = medicationadministrationdosage.getDose();

		/******************** MdctnAdmnstn_Dsg_Dose_Vl ********************************************************************************/
		if(medicationadministrationdosagedose.hasValue()) {

			m.addMdctnAdmnstnDsgDoseVl(String.valueOf(medicationadministrationdosagedose.getValue()));
		} else {
			m.addMdctnAdmnstnDsgDoseVl("NULL");
		}


		/******************** medicationadministrationdosagedosecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationadministrationdosagedosecomparator = medicationadministrationdosagedose.getComparator();
		if(medicationadministrationdosagedosecomparator!=null) {
			m.addMdctnAdmnstnDsgDoseCmprtr(medicationadministrationdosagedosecomparator.toCode());
		} else {
			m.addMdctnAdmnstnDsgDoseCmprtr("NULL");
		}

		/******************** MdctnAdmnstn_Dsg_Dose_Cd ********************************************************************************/
		if(medicationadministrationdosagedose.hasCode()) {

			m.addMdctnAdmnstnDsgDoseCd(String.valueOf(medicationadministrationdosagedose.getCode()));
		} else {
			m.addMdctnAdmnstnDsgDoseCd("NULL");
		}


		/******************** MdctnAdmnstn_Dsg_Dose_Unt ********************************************************************************/
		if(medicationadministrationdosagedose.hasUnit()) {

			m.addMdctnAdmnstnDsgDoseUnt(String.valueOf(medicationadministrationdosagedose.getUnit()));
		} else {
			m.addMdctnAdmnstnDsgDoseUnt("NULL");
		}


		/******************** MdctnAdmnstn_Dsg_Dose_Sys ********************************************************************************/
		if(medicationadministrationdosagedose.hasSystem()) {

			m.addMdctnAdmnstnDsgDoseSys(String.valueOf(medicationadministrationdosagedose.getSystem()));
		} else {
			m.addMdctnAdmnstnDsgDoseSys("NULL");
		}


		/******************** medicationadministrationdosageratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationadministrationdosageratequantity = medicationadministrationdosage.getRateQuantity();

		/******************** MdctnAdmnstn_Dsg_RtQnty_Vl ********************************************************************************/
		if(medicationadministrationdosageratequantity.hasValue()) {

			m.addMdctnAdmnstnDsgRtQntyVl(String.valueOf(medicationadministrationdosageratequantity.getValue()));
		} else {
			m.addMdctnAdmnstnDsgRtQntyVl("NULL");
		}


		/******************** medicationadministrationdosageratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationadministrationdosageratequantitycomparator = medicationadministrationdosageratequantity.getComparator();
		if(medicationadministrationdosageratequantitycomparator!=null) {
			m.addMdctnAdmnstnDsgRtQntyCmprtr(medicationadministrationdosageratequantitycomparator.toCode());
		} else {
			m.addMdctnAdmnstnDsgRtQntyCmprtr("NULL");
		}

		/******************** MdctnAdmnstn_Dsg_RtQnty_Cd ********************************************************************************/
		if(medicationadministrationdosageratequantity.hasCode()) {

			m.addMdctnAdmnstnDsgRtQntyCd(String.valueOf(medicationadministrationdosageratequantity.getCode()));
		} else {
			m.addMdctnAdmnstnDsgRtQntyCd("NULL");
		}


		/******************** MdctnAdmnstn_Dsg_RtQnty_Unt ********************************************************************************/
		if(medicationadministrationdosageratequantity.hasUnit()) {

			m.addMdctnAdmnstnDsgRtQntyUnt(String.valueOf(medicationadministrationdosageratequantity.getUnit()));
		} else {
			m.addMdctnAdmnstnDsgRtQntyUnt("NULL");
		}


		/******************** MdctnAdmnstn_Dsg_RtQnty_Sys ********************************************************************************/
		if(medicationadministrationdosageratequantity.hasSystem()) {

			m.addMdctnAdmnstnDsgRtQntySys(String.valueOf(medicationadministrationdosageratequantity.getSystem()));
		} else {
			m.addMdctnAdmnstnDsgRtQntySys("NULL");
		}


		/******************** medicationadministrationdosagerateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationadministrationdosagerateratio = medicationadministrationdosage.getRateRatio();

		/******************** medicationadministrationdosageraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationadministrationdosageraterationumerator = medicationadministrationdosagerateratio.getNumerator();

		/******************** MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(medicationadministrationdosageraterationumerator.hasValue()) {

			m.addMdctnAdmnstnDsgRtRtioNmrtrVl(String.valueOf(medicationadministrationdosageraterationumerator.getValue()));
		} else {
			m.addMdctnAdmnstnDsgRtRtioNmrtrVl("NULL");
		}


		/******************** medicationadministrationdosageraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationadministrationdosageraterationumeratorcomparator = medicationadministrationdosageraterationumerator.getComparator();
		if(medicationadministrationdosageraterationumeratorcomparator!=null) {
			m.addMdctnAdmnstnDsgRtRtioNmrtrCmprtr(medicationadministrationdosageraterationumeratorcomparator.toCode());
		} else {
			m.addMdctnAdmnstnDsgRtRtioNmrtrCmprtr("NULL");
		}

		/******************** MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(medicationadministrationdosageraterationumerator.hasCode()) {

			m.addMdctnAdmnstnDsgRtRtioNmrtrCd(String.valueOf(medicationadministrationdosageraterationumerator.getCode()));
		} else {
			m.addMdctnAdmnstnDsgRtRtioNmrtrCd("NULL");
		}


		/******************** MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(medicationadministrationdosageraterationumerator.hasUnit()) {

			m.addMdctnAdmnstnDsgRtRtioNmrtrUnt(String.valueOf(medicationadministrationdosageraterationumerator.getUnit()));
		} else {
			m.addMdctnAdmnstnDsgRtRtioNmrtrUnt("NULL");
		}


		/******************** MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(medicationadministrationdosageraterationumerator.hasSystem()) {

			m.addMdctnAdmnstnDsgRtRtioNmrtrSys(String.valueOf(medicationadministrationdosageraterationumerator.getSystem()));
		} else {
			m.addMdctnAdmnstnDsgRtRtioNmrtrSys("NULL");
		}


		/******************** medicationadministrationdosagerateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationadministrationdosagerateratiodenominator = medicationadministrationdosagerateratio.getDenominator();

		/******************** MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(medicationadministrationdosagerateratiodenominator.hasValue()) {

			m.addMdctnAdmnstnDsgRtRtioDnmntrVl(String.valueOf(medicationadministrationdosagerateratiodenominator.getValue()));
		} else {
			m.addMdctnAdmnstnDsgRtRtioDnmntrVl("NULL");
		}


		/******************** medicationadministrationdosagerateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationadministrationdosagerateratiodenominatorcomparator = medicationadministrationdosagerateratiodenominator.getComparator();
		if(medicationadministrationdosagerateratiodenominatorcomparator!=null) {
			m.addMdctnAdmnstnDsgRtRtioDnmntrCmprtr(medicationadministrationdosagerateratiodenominatorcomparator.toCode());
		} else {
			m.addMdctnAdmnstnDsgRtRtioDnmntrCmprtr("NULL");
		}

		/******************** MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(medicationadministrationdosagerateratiodenominator.hasCode()) {

			m.addMdctnAdmnstnDsgRtRtioDnmntrCd(String.valueOf(medicationadministrationdosagerateratiodenominator.getCode()));
		} else {
			m.addMdctnAdmnstnDsgRtRtioDnmntrCd("NULL");
		}


		/******************** MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(medicationadministrationdosagerateratiodenominator.hasUnit()) {

			m.addMdctnAdmnstnDsgRtRtioDnmntrUnt(String.valueOf(medicationadministrationdosagerateratiodenominator.getUnit()));
		} else {
			m.addMdctnAdmnstnDsgRtRtioDnmntrUnt("NULL");
		}


		/******************** MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(medicationadministrationdosagerateratiodenominator.hasSystem()) {

			m.addMdctnAdmnstnDsgRtRtioDnmntrSys(String.valueOf(medicationadministrationdosagerateratiodenominator.getSystem()));
		} else {
			m.addMdctnAdmnstnDsgRtRtioDnmntrSys("NULL");
		}


		/******************** medicationadministrationdosagesite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationdosagesite = medicationadministrationdosage.getSite();

		/******************** MdctnAdmnstn_Dsg_Site_Txt ********************************************************************************/
		if(medicationadministrationdosagesite.hasText()) {

			m.addMdctnAdmnstnDsgSiteTxt(String.valueOf(medicationadministrationdosagesite.getText()));
		} else {
			m.addMdctnAdmnstnDsgSiteTxt("NULL");
		}


		/******************** medicationadministrationdosagesitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationadministrationdosagesitecodinglist = medicationadministrationdosagesite.getCoding();
		for(int medicationadministrationdosagesitecodingi = 0; medicationadministrationdosagesitecodingi<medicationadministrationdosagesitecodinglist.size();medicationadministrationdosagesitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationadministrationdosagesitecoding = medicationadministrationdosagesitecodinglist.get(medicationadministrationdosagesitecodingi);

		/******************** MdctnAdmnstn_Dsg_Site_Cdg_Dsply ********************************************************************************/
		if(medicationadministrationdosagesitecodingi == 0) {m.addMdctnAdmnstnDsgSiteCdgDsply("[");}
		if(medicationadministrationdosagesitecoding.hasDisplay()) {

			m.addMdctnAdmnstnDsgSiteCdgDsply(String.valueOf(medicationadministrationdosagesitecoding.getDisplay()));
		} else {
			m.addMdctnAdmnstnDsgSiteCdgDsply("NULL");
		}

		if(medicationadministrationdosagesitecodingi == medicationadministrationdosagesitecodinglist.size()-1) {m.addMdctnAdmnstnDsgSiteCdgDsply("]");}


		/******************** MdctnAdmnstn_Dsg_Site_Cdg_Vrsn ********************************************************************************/
		if(medicationadministrationdosagesitecodingi == 0) {m.addMdctnAdmnstnDsgSiteCdgVrsn("[");}
		if(medicationadministrationdosagesitecoding.hasVersion()) {

			m.addMdctnAdmnstnDsgSiteCdgVrsn(String.valueOf(medicationadministrationdosagesitecoding.getVersion()));
		} else {
			m.addMdctnAdmnstnDsgSiteCdgVrsn("NULL");
		}

		if(medicationadministrationdosagesitecodingi == medicationadministrationdosagesitecodinglist.size()-1) {m.addMdctnAdmnstnDsgSiteCdgVrsn("]");}


		/******************** MdctnAdmnstn_Dsg_Site_Cdg_Cd ********************************************************************************/
		if(medicationadministrationdosagesitecodingi == 0) {m.addMdctnAdmnstnDsgSiteCdgCd("[");}
		if(medicationadministrationdosagesitecoding.hasCode()) {

			m.addMdctnAdmnstnDsgSiteCdgCd(String.valueOf(medicationadministrationdosagesitecoding.getCode()));
		} else {
			m.addMdctnAdmnstnDsgSiteCdgCd("NULL");
		}

		if(medicationadministrationdosagesitecodingi == medicationadministrationdosagesitecodinglist.size()-1) {m.addMdctnAdmnstnDsgSiteCdgCd("]");}


		/******************** MdctnAdmnstn_Dsg_Site_Cdg_UsrSltd ********************************************************************************/
		if(medicationadministrationdosagesitecodingi == 0) {m.addMdctnAdmnstnDsgSiteCdgUsrSltd("[");}
		if(medicationadministrationdosagesitecoding.hasUserSelected()) {

			m.addMdctnAdmnstnDsgSiteCdgUsrSltd(String.valueOf(medicationadministrationdosagesitecoding.getUserSelected()));
		} else {
			m.addMdctnAdmnstnDsgSiteCdgUsrSltd("NULL");
		}

		if(medicationadministrationdosagesitecodingi == medicationadministrationdosagesitecodinglist.size()-1) {m.addMdctnAdmnstnDsgSiteCdgUsrSltd("]");}


		/******************** MdctnAdmnstn_Dsg_Site_Cdg_Sys ********************************************************************************/
		if(medicationadministrationdosagesitecodingi == 0) {m.addMdctnAdmnstnDsgSiteCdgSys("[");}
		if(medicationadministrationdosagesitecoding.hasSystem()) {

			m.addMdctnAdmnstnDsgSiteCdgSys(String.valueOf(medicationadministrationdosagesitecoding.getSystem()));
		} else {
			m.addMdctnAdmnstnDsgSiteCdgSys("NULL");
		}

		if(medicationadministrationdosagesitecodingi == medicationadministrationdosagesitecodinglist.size()-1) {m.addMdctnAdmnstnDsgSiteCdgSys("]");}


		 };
		/******************** MdctnAdmnstn_Dsg_Txt ********************************************************************************/
		if(medicationadministrationdosage.hasText()) {

			m.addMdctnAdmnstnDsgTxt(String.valueOf(medicationadministrationdosage.getText()));
		} else {
			m.addMdctnAdmnstnDsgTxt("NULL");
		}


		/******************** medicationadministrationdosageroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationdosageroute = medicationadministrationdosage.getRoute();

		/******************** MdctnAdmnstn_Dsg_Route_Txt ********************************************************************************/
		if(medicationadministrationdosageroute.hasText()) {

			m.addMdctnAdmnstnDsgRouteTxt(String.valueOf(medicationadministrationdosageroute.getText()));
		} else {
			m.addMdctnAdmnstnDsgRouteTxt("NULL");
		}


		/******************** medicationadministrationdosageroutecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationadministrationdosageroutecodinglist = medicationadministrationdosageroute.getCoding();
		for(int medicationadministrationdosageroutecodingi = 0; medicationadministrationdosageroutecodingi<medicationadministrationdosageroutecodinglist.size();medicationadministrationdosageroutecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationadministrationdosageroutecoding = medicationadministrationdosageroutecodinglist.get(medicationadministrationdosageroutecodingi);

		/******************** MdctnAdmnstn_Dsg_Route_Cdg_Dsply ********************************************************************************/
		if(medicationadministrationdosageroutecodingi == 0) {m.addMdctnAdmnstnDsgRouteCdgDsply("[");}
		if(medicationadministrationdosageroutecoding.hasDisplay()) {

			m.addMdctnAdmnstnDsgRouteCdgDsply(String.valueOf(medicationadministrationdosageroutecoding.getDisplay()));
		} else {
			m.addMdctnAdmnstnDsgRouteCdgDsply("NULL");
		}

		if(medicationadministrationdosageroutecodingi == medicationadministrationdosageroutecodinglist.size()-1) {m.addMdctnAdmnstnDsgRouteCdgDsply("]");}


		/******************** MdctnAdmnstn_Dsg_Route_Cdg_Vrsn ********************************************************************************/
		if(medicationadministrationdosageroutecodingi == 0) {m.addMdctnAdmnstnDsgRouteCdgVrsn("[");}
		if(medicationadministrationdosageroutecoding.hasVersion()) {

			m.addMdctnAdmnstnDsgRouteCdgVrsn(String.valueOf(medicationadministrationdosageroutecoding.getVersion()));
		} else {
			m.addMdctnAdmnstnDsgRouteCdgVrsn("NULL");
		}

		if(medicationadministrationdosageroutecodingi == medicationadministrationdosageroutecodinglist.size()-1) {m.addMdctnAdmnstnDsgRouteCdgVrsn("]");}


		/******************** MdctnAdmnstn_Dsg_Route_Cdg_Cd ********************************************************************************/
		if(medicationadministrationdosageroutecodingi == 0) {m.addMdctnAdmnstnDsgRouteCdgCd("[");}
		if(medicationadministrationdosageroutecoding.hasCode()) {

			m.addMdctnAdmnstnDsgRouteCdgCd(String.valueOf(medicationadministrationdosageroutecoding.getCode()));
		} else {
			m.addMdctnAdmnstnDsgRouteCdgCd("NULL");
		}

		if(medicationadministrationdosageroutecodingi == medicationadministrationdosageroutecodinglist.size()-1) {m.addMdctnAdmnstnDsgRouteCdgCd("]");}


		/******************** MdctnAdmnstn_Dsg_Route_Cdg_UsrSltd ********************************************************************************/
		if(medicationadministrationdosageroutecodingi == 0) {m.addMdctnAdmnstnDsgRouteCdgUsrSltd("[");}
		if(medicationadministrationdosageroutecoding.hasUserSelected()) {

			m.addMdctnAdmnstnDsgRouteCdgUsrSltd(String.valueOf(medicationadministrationdosageroutecoding.getUserSelected()));
		} else {
			m.addMdctnAdmnstnDsgRouteCdgUsrSltd("NULL");
		}

		if(medicationadministrationdosageroutecodingi == medicationadministrationdosageroutecodinglist.size()-1) {m.addMdctnAdmnstnDsgRouteCdgUsrSltd("]");}


		/******************** MdctnAdmnstn_Dsg_Route_Cdg_Sys ********************************************************************************/
		if(medicationadministrationdosageroutecodingi == 0) {m.addMdctnAdmnstnDsgRouteCdgSys("[");}
		if(medicationadministrationdosageroutecoding.hasSystem()) {

			m.addMdctnAdmnstnDsgRouteCdgSys(String.valueOf(medicationadministrationdosageroutecoding.getSystem()));
		} else {
			m.addMdctnAdmnstnDsgRouteCdgSys("NULL");
		}

		if(medicationadministrationdosageroutecodingi == medicationadministrationdosageroutecodinglist.size()-1) {m.addMdctnAdmnstnDsgRouteCdgSys("]");}


		 };
		/******************** MdctnAdmnstn_Instantiates ********************************************************************************/
		if(medicationadministration.hasInstantiates()) {

			String  array = "[";
			for(int incr=0; incr<medicationadministration.getInstantiates().size(); incr++) {
				array = array + medicationadministration.getInstantiates().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnAdmnstnInstantiates(array);

		} else {
			m.addMdctnAdmnstnInstantiates("NULL");
		}


		/******************** MdctnAdmnstn_MdctnRfrnc ********************************************************************************/
		if(medicationadministration.hasMedicationReference()) {

			if(medicationadministration.getMedicationReference().getReference() != null) {
			m.addMdctnAdmnstnMdctnRfrnc(medicationadministration.getMedicationReference().getReference());
			}
		} else {
			m.addMdctnAdmnstnMdctnRfrnc("NULL");
		}


		/******************** medicationadministrationmedicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationmedicationcodeableconcept = medicationadministration.getMedicationCodeableConcept();

		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(medicationadministrationmedicationcodeableconcept.hasText()) {

			m.addMdctnAdmnstnMdctnCdbleCncptTxt(String.valueOf(medicationadministrationmedicationcodeableconcept.getText()));
		} else {
			m.addMdctnAdmnstnMdctnCdbleCncptTxt("NULL");
		}


		/******************** medicationadministrationmedicationcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationadministrationmedicationcodeableconceptcodinglist = medicationadministrationmedicationcodeableconcept.getCoding();
		for(int medicationadministrationmedicationcodeableconceptcodingi = 0; medicationadministrationmedicationcodeableconceptcodingi<medicationadministrationmedicationcodeableconceptcodinglist.size();medicationadministrationmedicationcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationadministrationmedicationcodeableconceptcoding = medicationadministrationmedicationcodeableconceptcodinglist.get(medicationadministrationmedicationcodeableconceptcodingi);

		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationadministrationmedicationcodeableconceptcodingi == 0) {m.addMdctnAdmnstnMdctnCdbleCncptCdgDsply("[");}
		if(medicationadministrationmedicationcodeableconceptcoding.hasDisplay()) {

			m.addMdctnAdmnstnMdctnCdbleCncptCdgDsply(String.valueOf(medicationadministrationmedicationcodeableconceptcoding.getDisplay()));
		} else {
			m.addMdctnAdmnstnMdctnCdbleCncptCdgDsply("NULL");
		}

		if(medicationadministrationmedicationcodeableconceptcodingi == medicationadministrationmedicationcodeableconceptcodinglist.size()-1) {m.addMdctnAdmnstnMdctnCdbleCncptCdgDsply("]");}


		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationadministrationmedicationcodeableconceptcodingi == 0) {m.addMdctnAdmnstnMdctnCdbleCncptCdgVrsn("[");}
		if(medicationadministrationmedicationcodeableconceptcoding.hasVersion()) {

			m.addMdctnAdmnstnMdctnCdbleCncptCdgVrsn(String.valueOf(medicationadministrationmedicationcodeableconceptcoding.getVersion()));
		} else {
			m.addMdctnAdmnstnMdctnCdbleCncptCdgVrsn("NULL");
		}

		if(medicationadministrationmedicationcodeableconceptcodingi == medicationadministrationmedicationcodeableconceptcodinglist.size()-1) {m.addMdctnAdmnstnMdctnCdbleCncptCdgVrsn("]");}


		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationadministrationmedicationcodeableconceptcodingi == 0) {m.addMdctnAdmnstnMdctnCdbleCncptCdgCd("[");}
		if(medicationadministrationmedicationcodeableconceptcoding.hasCode()) {

			m.addMdctnAdmnstnMdctnCdbleCncptCdgCd(String.valueOf(medicationadministrationmedicationcodeableconceptcoding.getCode()));
		} else {
			m.addMdctnAdmnstnMdctnCdbleCncptCdgCd("NULL");
		}

		if(medicationadministrationmedicationcodeableconceptcodingi == medicationadministrationmedicationcodeableconceptcodinglist.size()-1) {m.addMdctnAdmnstnMdctnCdbleCncptCdgCd("]");}


		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationadministrationmedicationcodeableconceptcodingi == 0) {m.addMdctnAdmnstnMdctnCdbleCncptCdgUsrSltd("[");}
		if(medicationadministrationmedicationcodeableconceptcoding.hasUserSelected()) {

			m.addMdctnAdmnstnMdctnCdbleCncptCdgUsrSltd(String.valueOf(medicationadministrationmedicationcodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdctnAdmnstnMdctnCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicationadministrationmedicationcodeableconceptcodingi == medicationadministrationmedicationcodeableconceptcodinglist.size()-1) {m.addMdctnAdmnstnMdctnCdbleCncptCdgUsrSltd("]");}


		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationadministrationmedicationcodeableconceptcodingi == 0) {m.addMdctnAdmnstnMdctnCdbleCncptCdgSys("[");}
		if(medicationadministrationmedicationcodeableconceptcoding.hasSystem()) {

			m.addMdctnAdmnstnMdctnCdbleCncptCdgSys(String.valueOf(medicationadministrationmedicationcodeableconceptcoding.getSystem()));
		} else {
			m.addMdctnAdmnstnMdctnCdbleCncptCdgSys("NULL");
		}

		if(medicationadministrationmedicationcodeableconceptcodingi == medicationadministrationmedicationcodeableconceptcodinglist.size()-1) {m.addMdctnAdmnstnMdctnCdbleCncptCdgSys("]");}


		 };
		/******************** MdctnAdmnstn_EfctiveDtTimeTyp ********************************************************************************/
		if(medicationadministration.hasEffectiveDateTimeType()) {

			m.addMdctnAdmnstnEfctiveDtTimeTyp("\""+medicationadministration.getEffectiveDateTimeType().getValueAsString()+"\"");
		} else {
			m.addMdctnAdmnstnEfctiveDtTimeTyp("NULL");
		}


		/******************** MdctnAdmnstn_SprtingInfo ********************************************************************************/
		if(medicationadministration.hasSupportingInformation()) {

			String  array = "[";
			for(int incr=0; incr<medicationadministration.getSupportingInformation().size(); incr++) {
				array = array + medicationadministration.getSupportingInformation().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnAdmnstnSprtingInfo(array);

		} else {
			m.addMdctnAdmnstnSprtingInfo("NULL");
		}


		/******************** medicationadministrationperformer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationPerformerComponent> medicationadministrationperformerlist = medicationadministration.getPerformer();
		for(int medicationadministrationperformeri = 0; medicationadministrationperformeri<medicationadministrationperformerlist.size();medicationadministrationperformeri++ ) {
		org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationPerformerComponent  medicationadministrationperformer = medicationadministrationperformerlist.get(medicationadministrationperformeri);

		/******************** medicationadministrationperformerfunction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationperformerfunction = medicationadministrationperformer.getFunction();

		/******************** MdctnAdmnstn_Prfrmr_Function_Txt ********************************************************************************/
		if(medicationadministrationperformeri == 0) {m.addMdctnAdmnstnPrfrmrFunctionTxt("[");}
		if(medicationadministrationperformerfunction.hasText()) {

			m.addMdctnAdmnstnPrfrmrFunctionTxt(String.valueOf(medicationadministrationperformerfunction.getText()));
		} else {
			m.addMdctnAdmnstnPrfrmrFunctionTxt("NULL");
		}

		if(medicationadministrationperformeri == medicationadministrationperformerlist.size()-1) {m.addMdctnAdmnstnPrfrmrFunctionTxt("]");}


		/******************** medicationadministrationperformerfunctioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationadministrationperformerfunctioncodinglist = medicationadministrationperformerfunction.getCoding();
		for(int medicationadministrationperformerfunctioncodingi = 0; medicationadministrationperformerfunctioncodingi<medicationadministrationperformerfunctioncodinglist.size();medicationadministrationperformerfunctioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationadministrationperformerfunctioncoding = medicationadministrationperformerfunctioncodinglist.get(medicationadministrationperformerfunctioncodingi);

		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(medicationadministrationperformerfunctioncodingi == 0) {m.addMdctnAdmnstnPrfrmrFunctionCdgDsply("[[");}
		if(medicationadministrationperformerfunctioncoding.hasDisplay()) {

			m.addMdctnAdmnstnPrfrmrFunctionCdgDsply(String.valueOf(medicationadministrationperformerfunctioncoding.getDisplay()));
		} else {
			m.addMdctnAdmnstnPrfrmrFunctionCdgDsply("NULL");
		}

		if(medicationadministrationperformerfunctioncodingi == medicationadministrationperformerfunctioncodinglist.size()-1) {m.addMdctnAdmnstnPrfrmrFunctionCdgDsply("]]");}


		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(medicationadministrationperformerfunctioncodingi == 0) {m.addMdctnAdmnstnPrfrmrFunctionCdgVrsn("[[");}
		if(medicationadministrationperformerfunctioncoding.hasVersion()) {

			m.addMdctnAdmnstnPrfrmrFunctionCdgVrsn(String.valueOf(medicationadministrationperformerfunctioncoding.getVersion()));
		} else {
			m.addMdctnAdmnstnPrfrmrFunctionCdgVrsn("NULL");
		}

		if(medicationadministrationperformerfunctioncodingi == medicationadministrationperformerfunctioncodinglist.size()-1) {m.addMdctnAdmnstnPrfrmrFunctionCdgVrsn("]]");}


		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(medicationadministrationperformerfunctioncodingi == 0) {m.addMdctnAdmnstnPrfrmrFunctionCdgCd("[[");}
		if(medicationadministrationperformerfunctioncoding.hasCode()) {

			m.addMdctnAdmnstnPrfrmrFunctionCdgCd(String.valueOf(medicationadministrationperformerfunctioncoding.getCode()));
		} else {
			m.addMdctnAdmnstnPrfrmrFunctionCdgCd("NULL");
		}

		if(medicationadministrationperformerfunctioncodingi == medicationadministrationperformerfunctioncodinglist.size()-1) {m.addMdctnAdmnstnPrfrmrFunctionCdgCd("]]");}


		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(medicationadministrationperformerfunctioncodingi == 0) {m.addMdctnAdmnstnPrfrmrFunctionCdgUsrSltd("[[");}
		if(medicationadministrationperformerfunctioncoding.hasUserSelected()) {

			m.addMdctnAdmnstnPrfrmrFunctionCdgUsrSltd(String.valueOf(medicationadministrationperformerfunctioncoding.getUserSelected()));
		} else {
			m.addMdctnAdmnstnPrfrmrFunctionCdgUsrSltd("NULL");
		}

		if(medicationadministrationperformerfunctioncodingi == medicationadministrationperformerfunctioncodinglist.size()-1) {m.addMdctnAdmnstnPrfrmrFunctionCdgUsrSltd("]]");}


		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(medicationadministrationperformerfunctioncodingi == 0) {m.addMdctnAdmnstnPrfrmrFunctionCdgSys("[[");}
		if(medicationadministrationperformerfunctioncoding.hasSystem()) {

			m.addMdctnAdmnstnPrfrmrFunctionCdgSys(String.valueOf(medicationadministrationperformerfunctioncoding.getSystem()));
		} else {
			m.addMdctnAdmnstnPrfrmrFunctionCdgSys("NULL");
		}

		if(medicationadministrationperformerfunctioncodingi == medicationadministrationperformerfunctioncodinglist.size()-1) {m.addMdctnAdmnstnPrfrmrFunctionCdgSys("]]");}


		 };
		/******************** MdctnAdmnstn_Prfrmr_Actor ********************************************************************************/
		if(medicationadministrationperformeri == 0) {m.addMdctnAdmnstnPrfrmrActor("[");}
		if(medicationadministrationperformer.hasActor()) {

			if(medicationadministrationperformer.getActor().getReference() != null) {
			m.addMdctnAdmnstnPrfrmrActor(medicationadministrationperformer.getActor().getReference());
			}
		} else {
			m.addMdctnAdmnstnPrfrmrActor("NULL");
		}

		if(medicationadministrationperformeri == medicationadministrationperformerlist.size()-1) {m.addMdctnAdmnstnPrfrmrActor("]");}


		 };
		/******************** MdctnAdmnstn_Dvc ********************************************************************************/
		if(medicationadministration.hasDevice()) {

			String  array = "[";
			for(int incr=0; incr<medicationadministration.getDevice().size(); incr++) {
				array = array + medicationadministration.getDevice().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnAdmnstnDvc(array);

		} else {
			m.addMdctnAdmnstnDvc("NULL");
		}


		/******************** medicationadministrationeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationadministrationeffectiveperiod = medicationadministration.getEffectivePeriod();

		/******************** MdctnAdmnstn_EfctivePrd_Strt ********************************************************************************/
		if(medicationadministrationeffectiveperiod.hasStart()) {

			m.addMdctnAdmnstnEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationadministrationeffectiveperiod.getStart())+"\"");
		} else {
			m.addMdctnAdmnstnEfctivePrdStrt("NULL");
		}


		/******************** MdctnAdmnstn_EfctivePrd_End ********************************************************************************/
		if(medicationadministrationeffectiveperiod.hasEnd()) {

			m.addMdctnAdmnstnEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationadministrationeffectiveperiod.getEnd())+"\"");
		} else {
			m.addMdctnAdmnstnEfctivePrdEnd("NULL");
		}


		/******************** MdctnAdmnstn_PartOf ********************************************************************************/
		if(medicationadministration.hasPartOf()) {

			String  array = "[";
			for(int incr=0; incr<medicationadministration.getPartOf().size(); incr++) {
				array = array + medicationadministration.getPartOf().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnAdmnstnPartOf(array);

		} else {
			m.addMdctnAdmnstnPartOf("NULL");
		}


		/******************** medicationadministrationstatusreason ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicationadministrationstatusreasonlist = medicationadministration.getStatusReason();
		for(int medicationadministrationstatusreasoni = 0; medicationadministrationstatusreasoni<medicationadministrationstatusreasonlist.size();medicationadministrationstatusreasoni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicationadministrationstatusreason = medicationadministrationstatusreasonlist.get(medicationadministrationstatusreasoni);

		/******************** MdctnAdmnstn_StsRsn_Txt ********************************************************************************/
		if(medicationadministrationstatusreasoni == 0) {m.addMdctnAdmnstnStsRsnTxt("[");}
		if(medicationadministrationstatusreason.hasText()) {

			m.addMdctnAdmnstnStsRsnTxt(String.valueOf(medicationadministrationstatusreason.getText()));
		} else {
			m.addMdctnAdmnstnStsRsnTxt("NULL");
		}

		if(medicationadministrationstatusreasoni == medicationadministrationstatusreasonlist.size()-1) {m.addMdctnAdmnstnStsRsnTxt("]");}


		/******************** medicationadministrationstatusreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationadministrationstatusreasoncodinglist = medicationadministrationstatusreason.getCoding();
		for(int medicationadministrationstatusreasoncodingi = 0; medicationadministrationstatusreasoncodingi<medicationadministrationstatusreasoncodinglist.size();medicationadministrationstatusreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationadministrationstatusreasoncoding = medicationadministrationstatusreasoncodinglist.get(medicationadministrationstatusreasoncodingi);

		/******************** MdctnAdmnstn_StsRsn_Cdg_Dsply ********************************************************************************/
		if(medicationadministrationstatusreasoncodingi == 0) {m.addMdctnAdmnstnStsRsnCdgDsply("[[");}
		if(medicationadministrationstatusreasoncoding.hasDisplay()) {

			m.addMdctnAdmnstnStsRsnCdgDsply(String.valueOf(medicationadministrationstatusreasoncoding.getDisplay()));
		} else {
			m.addMdctnAdmnstnStsRsnCdgDsply("NULL");
		}

		if(medicationadministrationstatusreasoncodingi == medicationadministrationstatusreasoncodinglist.size()-1) {m.addMdctnAdmnstnStsRsnCdgDsply("]]");}


		/******************** MdctnAdmnstn_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(medicationadministrationstatusreasoncodingi == 0) {m.addMdctnAdmnstnStsRsnCdgVrsn("[[");}
		if(medicationadministrationstatusreasoncoding.hasVersion()) {

			m.addMdctnAdmnstnStsRsnCdgVrsn(String.valueOf(medicationadministrationstatusreasoncoding.getVersion()));
		} else {
			m.addMdctnAdmnstnStsRsnCdgVrsn("NULL");
		}

		if(medicationadministrationstatusreasoncodingi == medicationadministrationstatusreasoncodinglist.size()-1) {m.addMdctnAdmnstnStsRsnCdgVrsn("]]");}


		/******************** MdctnAdmnstn_StsRsn_Cdg_Cd ********************************************************************************/
		if(medicationadministrationstatusreasoncodingi == 0) {m.addMdctnAdmnstnStsRsnCdgCd("[[");}
		if(medicationadministrationstatusreasoncoding.hasCode()) {

			m.addMdctnAdmnstnStsRsnCdgCd(String.valueOf(medicationadministrationstatusreasoncoding.getCode()));
		} else {
			m.addMdctnAdmnstnStsRsnCdgCd("NULL");
		}

		if(medicationadministrationstatusreasoncodingi == medicationadministrationstatusreasoncodinglist.size()-1) {m.addMdctnAdmnstnStsRsnCdgCd("]]");}


		/******************** MdctnAdmnstn_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(medicationadministrationstatusreasoncodingi == 0) {m.addMdctnAdmnstnStsRsnCdgUsrSltd("[[");}
		if(medicationadministrationstatusreasoncoding.hasUserSelected()) {

			m.addMdctnAdmnstnStsRsnCdgUsrSltd(String.valueOf(medicationadministrationstatusreasoncoding.getUserSelected()));
		} else {
			m.addMdctnAdmnstnStsRsnCdgUsrSltd("NULL");
		}

		if(medicationadministrationstatusreasoncodingi == medicationadministrationstatusreasoncodinglist.size()-1) {m.addMdctnAdmnstnStsRsnCdgUsrSltd("]]");}


		/******************** MdctnAdmnstn_StsRsn_Cdg_Sys ********************************************************************************/
		if(medicationadministrationstatusreasoncodingi == 0) {m.addMdctnAdmnstnStsRsnCdgSys("[[");}
		if(medicationadministrationstatusreasoncoding.hasSystem()) {

			m.addMdctnAdmnstnStsRsnCdgSys(String.valueOf(medicationadministrationstatusreasoncoding.getSystem()));
		} else {
			m.addMdctnAdmnstnStsRsnCdgSys("NULL");
		}

		if(medicationadministrationstatusreasoncodingi == medicationadministrationstatusreasoncodinglist.size()-1) {m.addMdctnAdmnstnStsRsnCdgSys("]]");}


		 };
		 };
		/******************** MdctnAdmnstn_EvntHis ********************************************************************************/
		if(medicationadministration.hasEventHistory()) {

			String  array = "[";
			for(int incr=0; incr<medicationadministration.getEventHistory().size(); incr++) {
				array = array + medicationadministration.getEventHistory().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnAdmnstnEvntHis(array);

		} else {
			m.addMdctnAdmnstnEvntHis("NULL");
		}


		return m;
	}
}
