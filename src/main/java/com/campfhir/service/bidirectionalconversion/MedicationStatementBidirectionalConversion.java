package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationStatement;
public class MedicationStatementBidirectionalConversion 
{
	public MedicationStatement MedicationStatements(org.hl7.fhir.r4.model.MedicationStatement medicationstatement) throws ParseException
	{
		 main.java.com.campfhir.model.MedicationStatement m = new  main.java.com.campfhir.model.MedicationStatement();

		/******************** id ********************************************************************************/
		m.setId(medicationstatement.getIdElement().getIdPart());

		/******************** MdctnStmnt_Cntxt ********************************************************************************/
		if(medicationstatement.hasContext()) {

			if(medicationstatement.getContext().getReference() != null) {
			m.addMdctnStmntCntxt(medicationstatement.getContext().getReference());
			}
		} else {
			m.addMdctnStmntCntxt("NULL");
		}


		/******************** MdctnStmnt_Sbjct ********************************************************************************/
		if(medicationstatement.hasSubject()) {

			if(medicationstatement.getSubject().getReference() != null) {
			m.addMdctnStmntSbjct(medicationstatement.getSubject().getReference());
			}
		} else {
			m.addMdctnStmntSbjct("NULL");
		}


		/******************** medicationstatementstatus ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationStatement.MedicationStatementStatus medicationstatementstatus = medicationstatement.getStatus();
		if(medicationstatementstatus!=null) {
			m.addMdctnStmntSts(medicationstatementstatus.toCode());
		} else {
			m.addMdctnStmntSts("NULL");
		}

		/******************** MdctnStmnt_BasedOn ********************************************************************************/
		if(medicationstatement.hasBasedOn()) {

			String  array = "[";
			for(int incr=0; incr<medicationstatement.getBasedOn().size(); incr++) {
				array = array + medicationstatement.getBasedOn().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnStmntBasedOn(array);

		} else {
			m.addMdctnStmntBasedOn("NULL");
		}


		/******************** medicationstatementreasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicationstatementreasoncodelist = medicationstatement.getReasonCode();
		for(int medicationstatementreasoncodei = 0; medicationstatementreasoncodei<medicationstatementreasoncodelist.size();medicationstatementreasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicationstatementreasoncode = medicationstatementreasoncodelist.get(medicationstatementreasoncodei);

		/******************** MdctnStmnt_RsnCd_Txt ********************************************************************************/
		if(medicationstatementreasoncodei == 0) {m.addMdctnStmntRsnCdTxt("[");}
		if(medicationstatementreasoncode.hasText()) {

			m.addMdctnStmntRsnCdTxt(String.valueOf(medicationstatementreasoncode.getText()));
		} else {
			m.addMdctnStmntRsnCdTxt("NULL");
		}

		if(medicationstatementreasoncodei == medicationstatementreasoncodelist.size()-1) {m.addMdctnStmntRsnCdTxt("]");}


		/******************** medicationstatementreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationstatementreasoncodecodinglist = medicationstatementreasoncode.getCoding();
		for(int medicationstatementreasoncodecodingi = 0; medicationstatementreasoncodecodingi<medicationstatementreasoncodecodinglist.size();medicationstatementreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationstatementreasoncodecoding = medicationstatementreasoncodecodinglist.get(medicationstatementreasoncodecodingi);

		/******************** MdctnStmnt_RsnCd_Cdg_Dsply ********************************************************************************/
		if(medicationstatementreasoncodecodingi == 0) {m.addMdctnStmntRsnCdCdgDsply("[[");}
		if(medicationstatementreasoncodecoding.hasDisplay()) {

			m.addMdctnStmntRsnCdCdgDsply(String.valueOf(medicationstatementreasoncodecoding.getDisplay()));
		} else {
			m.addMdctnStmntRsnCdCdgDsply("NULL");
		}

		if(medicationstatementreasoncodecodingi == medicationstatementreasoncodecodinglist.size()-1) {m.addMdctnStmntRsnCdCdgDsply("]]");}


		/******************** MdctnStmnt_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementreasoncodecodingi == 0) {m.addMdctnStmntRsnCdCdgVrsn("[[");}
		if(medicationstatementreasoncodecoding.hasVersion()) {

			m.addMdctnStmntRsnCdCdgVrsn(String.valueOf(medicationstatementreasoncodecoding.getVersion()));
		} else {
			m.addMdctnStmntRsnCdCdgVrsn("NULL");
		}

		if(medicationstatementreasoncodecodingi == medicationstatementreasoncodecodinglist.size()-1) {m.addMdctnStmntRsnCdCdgVrsn("]]");}


		/******************** MdctnStmnt_RsnCd_Cdg_Cd ********************************************************************************/
		if(medicationstatementreasoncodecodingi == 0) {m.addMdctnStmntRsnCdCdgCd("[[");}
		if(medicationstatementreasoncodecoding.hasCode()) {

			m.addMdctnStmntRsnCdCdgCd(String.valueOf(medicationstatementreasoncodecoding.getCode()));
		} else {
			m.addMdctnStmntRsnCdCdgCd("NULL");
		}

		if(medicationstatementreasoncodecodingi == medicationstatementreasoncodecodinglist.size()-1) {m.addMdctnStmntRsnCdCdgCd("]]");}


		/******************** MdctnStmnt_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementreasoncodecodingi == 0) {m.addMdctnStmntRsnCdCdgUsrSltd("[[");}
		if(medicationstatementreasoncodecoding.hasUserSelected()) {

			m.addMdctnStmntRsnCdCdgUsrSltd(String.valueOf(medicationstatementreasoncodecoding.getUserSelected()));
		} else {
			m.addMdctnStmntRsnCdCdgUsrSltd("NULL");
		}

		if(medicationstatementreasoncodecodingi == medicationstatementreasoncodecodinglist.size()-1) {m.addMdctnStmntRsnCdCdgUsrSltd("]]");}


		/******************** MdctnStmnt_RsnCd_Cdg_Sys ********************************************************************************/
		if(medicationstatementreasoncodecodingi == 0) {m.addMdctnStmntRsnCdCdgSys("[[");}
		if(medicationstatementreasoncodecoding.hasSystem()) {

			m.addMdctnStmntRsnCdCdgSys(String.valueOf(medicationstatementreasoncodecoding.getSystem()));
		} else {
			m.addMdctnStmntRsnCdCdgSys("NULL");
		}

		if(medicationstatementreasoncodecodingi == medicationstatementreasoncodecodinglist.size()-1) {m.addMdctnStmntRsnCdCdgSys("]]");}


		 };
		 };
		/******************** medicationstatementnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> medicationstatementnotelist = medicationstatement.getNote();
		for(int medicationstatementnotei = 0; medicationstatementnotei<medicationstatementnotelist.size();medicationstatementnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  medicationstatementnote = medicationstatementnotelist.get(medicationstatementnotei);

		/******************** MdctnStmnt_Nt_Time ********************************************************************************/
		if(medicationstatementnotei == 0) {m.addMdctnStmntNtTime("[");}
		if(medicationstatementnote.hasTime()) {

			m.addMdctnStmntNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationstatementnote.getTime())+"\"");
		} else {
			m.addMdctnStmntNtTime("NULL");
		}

		if(medicationstatementnotei == medicationstatementnotelist.size()-1) {m.addMdctnStmntNtTime("]");}


		/******************** MdctnStmnt_Nt_AthrRfrnc ********************************************************************************/
		if(medicationstatementnotei == 0) {m.addMdctnStmntNtAthrRfrnc("[");}
		if(medicationstatementnote.hasAuthorReference()) {

			if(medicationstatementnote.getAuthorReference().getReference() != null) {
			m.addMdctnStmntNtAthrRfrnc(medicationstatementnote.getAuthorReference().getReference());
			}
		} else {
			m.addMdctnStmntNtAthrRfrnc("NULL");
		}

		if(medicationstatementnotei == medicationstatementnotelist.size()-1) {m.addMdctnStmntNtAthrRfrnc("]");}


		/******************** MdctnStmnt_Nt_Txt ********************************************************************************/
		if(medicationstatementnotei == 0) {m.addMdctnStmntNtTxt("[");}
		if(medicationstatementnote.hasText()) {

			m.addMdctnStmntNtTxt(String.valueOf(medicationstatementnote.getText()));
		} else {
			m.addMdctnStmntNtTxt("NULL");
		}

		if(medicationstatementnotei == medicationstatementnotelist.size()-1) {m.addMdctnStmntNtTxt("]");}


		/******************** MdctnStmnt_Nt_AthrStrgTyp ********************************************************************************/
		if(medicationstatementnotei == 0) {m.addMdctnStmntNtAthrStrgTyp("[");}
		if(medicationstatementnote.hasAuthorStringType()) {

			m.addMdctnStmntNtAthrStrgTyp("\""+medicationstatementnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			m.addMdctnStmntNtAthrStrgTyp("NULL");
		}

		if(medicationstatementnotei == medicationstatementnotelist.size()-1) {m.addMdctnStmntNtAthrStrgTyp("]");}


		 };
		/******************** MdctnStmnt_RsnRfrnc ********************************************************************************/
		if(medicationstatement.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<medicationstatement.getReasonReference().size(); incr++) {
				array = array + medicationstatement.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnStmntRsnRfrnc(array);

		} else {
			m.addMdctnStmntRsnRfrnc("NULL");
		}


		/******************** medicationstatementidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> medicationstatementidentifierlist = medicationstatement.getIdentifier();
		for(int medicationstatementidentifieri = 0; medicationstatementidentifieri<medicationstatementidentifierlist.size();medicationstatementidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  medicationstatementidentifier = medicationstatementidentifierlist.get(medicationstatementidentifieri);

		/******************** MdctnStmnt_Id_Vl ********************************************************************************/
		if(medicationstatementidentifieri == 0) {m.addMdctnStmntIdVl("[");}
		if(medicationstatementidentifier.hasValue()) {

			m.addMdctnStmntIdVl(String.valueOf(medicationstatementidentifier.getValue()));
		} else {
			m.addMdctnStmntIdVl("NULL");
		}

		if(medicationstatementidentifieri == medicationstatementidentifierlist.size()-1) {m.addMdctnStmntIdVl("]");}


		/******************** medicationstatementidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementidentifiertype = medicationstatementidentifier.getType();

		/******************** MdctnStmnt_Id_Typ_Txt ********************************************************************************/
		if(medicationstatementidentifieri == 0) {m.addMdctnStmntIdTypTxt("[");}
		if(medicationstatementidentifiertype.hasText()) {

			m.addMdctnStmntIdTypTxt(String.valueOf(medicationstatementidentifiertype.getText()));
		} else {
			m.addMdctnStmntIdTypTxt("NULL");
		}

		if(medicationstatementidentifieri == medicationstatementidentifierlist.size()-1) {m.addMdctnStmntIdTypTxt("]");}


		/******************** medicationstatementidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationstatementidentifiertypecodinglist = medicationstatementidentifiertype.getCoding();
		for(int medicationstatementidentifiertypecodingi = 0; medicationstatementidentifiertypecodingi<medicationstatementidentifiertypecodinglist.size();medicationstatementidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationstatementidentifiertypecoding = medicationstatementidentifiertypecodinglist.get(medicationstatementidentifiertypecodingi);

		/******************** MdctnStmnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationstatementidentifiertypecodingi == 0) {m.addMdctnStmntIdTypCdgDsply("[[");}
		if(medicationstatementidentifiertypecoding.hasDisplay()) {

			m.addMdctnStmntIdTypCdgDsply(String.valueOf(medicationstatementidentifiertypecoding.getDisplay()));
		} else {
			m.addMdctnStmntIdTypCdgDsply("NULL");
		}

		if(medicationstatementidentifiertypecodingi == medicationstatementidentifiertypecodinglist.size()-1) {m.addMdctnStmntIdTypCdgDsply("]]");}


		/******************** MdctnStmnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementidentifiertypecodingi == 0) {m.addMdctnStmntIdTypCdgVrsn("[[");}
		if(medicationstatementidentifiertypecoding.hasVersion()) {

			m.addMdctnStmntIdTypCdgVrsn(String.valueOf(medicationstatementidentifiertypecoding.getVersion()));
		} else {
			m.addMdctnStmntIdTypCdgVrsn("NULL");
		}

		if(medicationstatementidentifiertypecodingi == medicationstatementidentifiertypecodinglist.size()-1) {m.addMdctnStmntIdTypCdgVrsn("]]");}


		/******************** MdctnStmnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicationstatementidentifiertypecodingi == 0) {m.addMdctnStmntIdTypCdgCd("[[");}
		if(medicationstatementidentifiertypecoding.hasCode()) {

			m.addMdctnStmntIdTypCdgCd(String.valueOf(medicationstatementidentifiertypecoding.getCode()));
		} else {
			m.addMdctnStmntIdTypCdgCd("NULL");
		}

		if(medicationstatementidentifiertypecodingi == medicationstatementidentifiertypecodinglist.size()-1) {m.addMdctnStmntIdTypCdgCd("]]");}


		/******************** MdctnStmnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementidentifiertypecodingi == 0) {m.addMdctnStmntIdTypCdgUsrSltd("[[");}
		if(medicationstatementidentifiertypecoding.hasUserSelected()) {

			m.addMdctnStmntIdTypCdgUsrSltd(String.valueOf(medicationstatementidentifiertypecoding.getUserSelected()));
		} else {
			m.addMdctnStmntIdTypCdgUsrSltd("NULL");
		}

		if(medicationstatementidentifiertypecodingi == medicationstatementidentifiertypecodinglist.size()-1) {m.addMdctnStmntIdTypCdgUsrSltd("]]");}


		/******************** MdctnStmnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicationstatementidentifiertypecodingi == 0) {m.addMdctnStmntIdTypCdgSys("[[");}
		if(medicationstatementidentifiertypecoding.hasSystem()) {

			m.addMdctnStmntIdTypCdgSys(String.valueOf(medicationstatementidentifiertypecoding.getSystem()));
		} else {
			m.addMdctnStmntIdTypCdgSys("NULL");
		}

		if(medicationstatementidentifiertypecodingi == medicationstatementidentifiertypecodinglist.size()-1) {m.addMdctnStmntIdTypCdgSys("]]");}


		 };
		/******************** medicationstatementidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationstatementidentifierperiod = medicationstatementidentifier.getPeriod();

		/******************** MdctnStmnt_Id_Prd_Strt ********************************************************************************/
		if(medicationstatementidentifieri == 0) {m.addMdctnStmntIdPrdStrt("[");}
		if(medicationstatementidentifierperiod.hasStart()) {

			m.addMdctnStmntIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationstatementidentifierperiod.getStart())+"\"");
		} else {
			m.addMdctnStmntIdPrdStrt("NULL");
		}

		if(medicationstatementidentifieri == medicationstatementidentifierlist.size()-1) {m.addMdctnStmntIdPrdStrt("]");}


		/******************** MdctnStmnt_Id_Prd_End ********************************************************************************/
		if(medicationstatementidentifieri == 0) {m.addMdctnStmntIdPrdEnd("[");}
		if(medicationstatementidentifierperiod.hasEnd()) {

			m.addMdctnStmntIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationstatementidentifierperiod.getEnd())+"\"");
		} else {
			m.addMdctnStmntIdPrdEnd("NULL");
		}

		if(medicationstatementidentifieri == medicationstatementidentifierlist.size()-1) {m.addMdctnStmntIdPrdEnd("]");}


		/******************** medicationstatementidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicationstatementidentifieruse = medicationstatementidentifier.getUse();
		if(medicationstatementidentifieruse!=null) {
		if(medicationstatementidentifieri == 0) {

		m.addMdctnStmntIdUse("[");		}
			m.addMdctnStmntIdUse(medicationstatementidentifieruse.toCode());
		if(medicationstatementidentifieri == medicationstatementidentifierlist.size()-1) {

		m.addMdctnStmntIdUse("]");		}

		} else {
			m.addMdctnStmntIdUse("NULL");
		}

		/******************** MdctnStmnt_Id_Assigner ********************************************************************************/
		if(medicationstatementidentifieri == 0) {m.addMdctnStmntIdAssigner("[");}
		if(medicationstatementidentifier.hasAssigner()) {

			if(medicationstatementidentifier.getAssigner().getReference() != null) {
			m.addMdctnStmntIdAssigner(medicationstatementidentifier.getAssigner().getReference());
			}
		} else {
			m.addMdctnStmntIdAssigner("NULL");
		}

		if(medicationstatementidentifieri == medicationstatementidentifierlist.size()-1) {m.addMdctnStmntIdAssigner("]");}


		/******************** MdctnStmnt_Id_Sys ********************************************************************************/
		if(medicationstatementidentifieri == 0) {m.addMdctnStmntIdSys("[");}
		if(medicationstatementidentifier.hasSystem()) {

			m.addMdctnStmntIdSys(String.valueOf(medicationstatementidentifier.getSystem()));
		} else {
			m.addMdctnStmntIdSys("NULL");
		}

		if(medicationstatementidentifieri == medicationstatementidentifierlist.size()-1) {m.addMdctnStmntIdSys("]");}


		 };
		/******************** medicationstatementcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementcategory = medicationstatement.getCategory();

		/******************** MdctnStmnt_Ctgry_Txt ********************************************************************************/
		if(medicationstatementcategory.hasText()) {

			m.addMdctnStmntCtgryTxt(String.valueOf(medicationstatementcategory.getText()));
		} else {
			m.addMdctnStmntCtgryTxt("NULL");
		}


		/******************** medicationstatementcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationstatementcategorycodinglist = medicationstatementcategory.getCoding();
		for(int medicationstatementcategorycodingi = 0; medicationstatementcategorycodingi<medicationstatementcategorycodinglist.size();medicationstatementcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationstatementcategorycoding = medicationstatementcategorycodinglist.get(medicationstatementcategorycodingi);

		/******************** MdctnStmnt_Ctgry_Cdg_Dsply ********************************************************************************/
		if(medicationstatementcategorycodingi == 0) {m.addMdctnStmntCtgryCdgDsply("[");}
		if(medicationstatementcategorycoding.hasDisplay()) {

			m.addMdctnStmntCtgryCdgDsply(String.valueOf(medicationstatementcategorycoding.getDisplay()));
		} else {
			m.addMdctnStmntCtgryCdgDsply("NULL");
		}

		if(medicationstatementcategorycodingi == medicationstatementcategorycodinglist.size()-1) {m.addMdctnStmntCtgryCdgDsply("]");}


		/******************** MdctnStmnt_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementcategorycodingi == 0) {m.addMdctnStmntCtgryCdgVrsn("[");}
		if(medicationstatementcategorycoding.hasVersion()) {

			m.addMdctnStmntCtgryCdgVrsn(String.valueOf(medicationstatementcategorycoding.getVersion()));
		} else {
			m.addMdctnStmntCtgryCdgVrsn("NULL");
		}

		if(medicationstatementcategorycodingi == medicationstatementcategorycodinglist.size()-1) {m.addMdctnStmntCtgryCdgVrsn("]");}


		/******************** MdctnStmnt_Ctgry_Cdg_Cd ********************************************************************************/
		if(medicationstatementcategorycodingi == 0) {m.addMdctnStmntCtgryCdgCd("[");}
		if(medicationstatementcategorycoding.hasCode()) {

			m.addMdctnStmntCtgryCdgCd(String.valueOf(medicationstatementcategorycoding.getCode()));
		} else {
			m.addMdctnStmntCtgryCdgCd("NULL");
		}

		if(medicationstatementcategorycodingi == medicationstatementcategorycodinglist.size()-1) {m.addMdctnStmntCtgryCdgCd("]");}


		/******************** MdctnStmnt_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementcategorycodingi == 0) {m.addMdctnStmntCtgryCdgUsrSltd("[");}
		if(medicationstatementcategorycoding.hasUserSelected()) {

			m.addMdctnStmntCtgryCdgUsrSltd(String.valueOf(medicationstatementcategorycoding.getUserSelected()));
		} else {
			m.addMdctnStmntCtgryCdgUsrSltd("NULL");
		}

		if(medicationstatementcategorycodingi == medicationstatementcategorycodinglist.size()-1) {m.addMdctnStmntCtgryCdgUsrSltd("]");}


		/******************** MdctnStmnt_Ctgry_Cdg_Sys ********************************************************************************/
		if(medicationstatementcategorycodingi == 0) {m.addMdctnStmntCtgryCdgSys("[");}
		if(medicationstatementcategorycoding.hasSystem()) {

			m.addMdctnStmntCtgryCdgSys(String.valueOf(medicationstatementcategorycoding.getSystem()));
		} else {
			m.addMdctnStmntCtgryCdgSys("NULL");
		}

		if(medicationstatementcategorycodingi == medicationstatementcategorycodinglist.size()-1) {m.addMdctnStmntCtgryCdgSys("]");}


		 };
		/******************** MdctnStmnt_DtAsserted ********************************************************************************/
		if(medicationstatement.hasDateAsserted()) {

			m.addMdctnStmntDtAsserted("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationstatement.getDateAsserted())+"\"");
		} else {
			m.addMdctnStmntDtAsserted("NULL");
		}


		/******************** medicationstatementdosage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Dosage> medicationstatementdosagelist = medicationstatement.getDosage();
		for(int medicationstatementdosagei = 0; medicationstatementdosagei<medicationstatementdosagelist.size();medicationstatementdosagei++ ) {
		org.hl7.fhir.r4.model.Dosage  medicationstatementdosage = medicationstatementdosagelist.get(medicationstatementdosagei);

		/******************** medicationstatementdosagemethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosagemethod = medicationstatementdosage.getMethod();

		/******************** MdctnStmnt_Dsg_Mthd_Txt ********************************************************************************/
		if(medicationstatementdosagei == 0) {m.addMdctnStmntDsgMthdTxt("[");}
		if(medicationstatementdosagemethod.hasText()) {

			m.addMdctnStmntDsgMthdTxt(String.valueOf(medicationstatementdosagemethod.getText()));
		} else {
			m.addMdctnStmntDsgMthdTxt("NULL");
		}

		if(medicationstatementdosagei == medicationstatementdosagelist.size()-1) {m.addMdctnStmntDsgMthdTxt("]");}


		/******************** medicationstatementdosagemethodcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationstatementdosagemethodcodinglist = medicationstatementdosagemethod.getCoding();
		for(int medicationstatementdosagemethodcodingi = 0; medicationstatementdosagemethodcodingi<medicationstatementdosagemethodcodinglist.size();medicationstatementdosagemethodcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationstatementdosagemethodcoding = medicationstatementdosagemethodcodinglist.get(medicationstatementdosagemethodcodingi);

		/******************** MdctnStmnt_Dsg_Mthd_Cdg_Dsply ********************************************************************************/
		if(medicationstatementdosagemethodcodingi == 0) {m.addMdctnStmntDsgMthdCdgDsply("[[");}
		if(medicationstatementdosagemethodcoding.hasDisplay()) {

			m.addMdctnStmntDsgMthdCdgDsply(String.valueOf(medicationstatementdosagemethodcoding.getDisplay()));
		} else {
			m.addMdctnStmntDsgMthdCdgDsply("NULL");
		}

		if(medicationstatementdosagemethodcodingi == medicationstatementdosagemethodcodinglist.size()-1) {m.addMdctnStmntDsgMthdCdgDsply("]]");}


		/******************** MdctnStmnt_Dsg_Mthd_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementdosagemethodcodingi == 0) {m.addMdctnStmntDsgMthdCdgVrsn("[[");}
		if(medicationstatementdosagemethodcoding.hasVersion()) {

			m.addMdctnStmntDsgMthdCdgVrsn(String.valueOf(medicationstatementdosagemethodcoding.getVersion()));
		} else {
			m.addMdctnStmntDsgMthdCdgVrsn("NULL");
		}

		if(medicationstatementdosagemethodcodingi == medicationstatementdosagemethodcodinglist.size()-1) {m.addMdctnStmntDsgMthdCdgVrsn("]]");}


		/******************** MdctnStmnt_Dsg_Mthd_Cdg_Cd ********************************************************************************/
		if(medicationstatementdosagemethodcodingi == 0) {m.addMdctnStmntDsgMthdCdgCd("[[");}
		if(medicationstatementdosagemethodcoding.hasCode()) {

			m.addMdctnStmntDsgMthdCdgCd(String.valueOf(medicationstatementdosagemethodcoding.getCode()));
		} else {
			m.addMdctnStmntDsgMthdCdgCd("NULL");
		}

		if(medicationstatementdosagemethodcodingi == medicationstatementdosagemethodcodinglist.size()-1) {m.addMdctnStmntDsgMthdCdgCd("]]");}


		/******************** MdctnStmnt_Dsg_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementdosagemethodcodingi == 0) {m.addMdctnStmntDsgMthdCdgUsrSltd("[[");}
		if(medicationstatementdosagemethodcoding.hasUserSelected()) {

			m.addMdctnStmntDsgMthdCdgUsrSltd(String.valueOf(medicationstatementdosagemethodcoding.getUserSelected()));
		} else {
			m.addMdctnStmntDsgMthdCdgUsrSltd("NULL");
		}

		if(medicationstatementdosagemethodcodingi == medicationstatementdosagemethodcodinglist.size()-1) {m.addMdctnStmntDsgMthdCdgUsrSltd("]]");}


		/******************** MdctnStmnt_Dsg_Mthd_Cdg_Sys ********************************************************************************/
		if(medicationstatementdosagemethodcodingi == 0) {m.addMdctnStmntDsgMthdCdgSys("[[");}
		if(medicationstatementdosagemethodcoding.hasSystem()) {

			m.addMdctnStmntDsgMthdCdgSys(String.valueOf(medicationstatementdosagemethodcoding.getSystem()));
		} else {
			m.addMdctnStmntDsgMthdCdgSys("NULL");
		}

		if(medicationstatementdosagemethodcodingi == medicationstatementdosagemethodcodinglist.size()-1) {m.addMdctnStmntDsgMthdCdgSys("]]");}


		 };
		/******************** medicationstatementdosagedoseandrate ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent> medicationstatementdosagedoseandratelist = medicationstatementdosage.getDoseAndRate();
		for(int medicationstatementdosagedoseandratei = 0; medicationstatementdosagedoseandratei<medicationstatementdosagedoseandratelist.size();medicationstatementdosagedoseandratei++ ) {
		org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent  medicationstatementdosagedoseandrate = medicationstatementdosagedoseandratelist.get(medicationstatementdosagedoseandratei);

		/******************** medicationstatementdosagedoseandratetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosagedoseandratetype = medicationstatementdosagedoseandrate.getType();

		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Txt ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtTypTxt("[[");}
		if(medicationstatementdosagedoseandratetype.hasText()) {

			m.addMdctnStmntDsgDoseAndRtTypTxt(String.valueOf(medicationstatementdosagedoseandratetype.getText()));
		} else {
			m.addMdctnStmntDsgDoseAndRtTypTxt("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtTypTxt("]]");}


		/******************** medicationstatementdosagedoseandratetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationstatementdosagedoseandratetypecodinglist = medicationstatementdosagedoseandratetype.getCoding();
		for(int medicationstatementdosagedoseandratetypecodingi = 0; medicationstatementdosagedoseandratetypecodingi<medicationstatementdosagedoseandratetypecodinglist.size();medicationstatementdosagedoseandratetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationstatementdosagedoseandratetypecoding = medicationstatementdosagedoseandratetypecodinglist.get(medicationstatementdosagedoseandratetypecodingi);

		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationstatementdosagedoseandratetypecodingi == 0) {m.addMdctnStmntDsgDoseAndRtTypCdgDsply("[[[");}
		if(medicationstatementdosagedoseandratetypecoding.hasDisplay()) {

			m.addMdctnStmntDsgDoseAndRtTypCdgDsply(String.valueOf(medicationstatementdosagedoseandratetypecoding.getDisplay()));
		} else {
			m.addMdctnStmntDsgDoseAndRtTypCdgDsply("NULL");
		}

		if(medicationstatementdosagedoseandratetypecodingi == medicationstatementdosagedoseandratetypecodinglist.size()-1) {m.addMdctnStmntDsgDoseAndRtTypCdgDsply("]]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementdosagedoseandratetypecodingi == 0) {m.addMdctnStmntDsgDoseAndRtTypCdgVrsn("[[[");}
		if(medicationstatementdosagedoseandratetypecoding.hasVersion()) {

			m.addMdctnStmntDsgDoseAndRtTypCdgVrsn(String.valueOf(medicationstatementdosagedoseandratetypecoding.getVersion()));
		} else {
			m.addMdctnStmntDsgDoseAndRtTypCdgVrsn("NULL");
		}

		if(medicationstatementdosagedoseandratetypecodingi == medicationstatementdosagedoseandratetypecodinglist.size()-1) {m.addMdctnStmntDsgDoseAndRtTypCdgVrsn("]]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(medicationstatementdosagedoseandratetypecodingi == 0) {m.addMdctnStmntDsgDoseAndRtTypCdgCd("[[[");}
		if(medicationstatementdosagedoseandratetypecoding.hasCode()) {

			m.addMdctnStmntDsgDoseAndRtTypCdgCd(String.valueOf(medicationstatementdosagedoseandratetypecoding.getCode()));
		} else {
			m.addMdctnStmntDsgDoseAndRtTypCdgCd("NULL");
		}

		if(medicationstatementdosagedoseandratetypecodingi == medicationstatementdosagedoseandratetypecodinglist.size()-1) {m.addMdctnStmntDsgDoseAndRtTypCdgCd("]]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementdosagedoseandratetypecodingi == 0) {m.addMdctnStmntDsgDoseAndRtTypCdgUsrSltd("[[[");}
		if(medicationstatementdosagedoseandratetypecoding.hasUserSelected()) {

			m.addMdctnStmntDsgDoseAndRtTypCdgUsrSltd(String.valueOf(medicationstatementdosagedoseandratetypecoding.getUserSelected()));
		} else {
			m.addMdctnStmntDsgDoseAndRtTypCdgUsrSltd("NULL");
		}

		if(medicationstatementdosagedoseandratetypecodingi == medicationstatementdosagedoseandratetypecodinglist.size()-1) {m.addMdctnStmntDsgDoseAndRtTypCdgUsrSltd("]]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(medicationstatementdosagedoseandratetypecodingi == 0) {m.addMdctnStmntDsgDoseAndRtTypCdgSys("[[[");}
		if(medicationstatementdosagedoseandratetypecoding.hasSystem()) {

			m.addMdctnStmntDsgDoseAndRtTypCdgSys(String.valueOf(medicationstatementdosagedoseandratetypecoding.getSystem()));
		} else {
			m.addMdctnStmntDsgDoseAndRtTypCdgSys("NULL");
		}

		if(medicationstatementdosagedoseandratetypecodingi == medicationstatementdosagedoseandratetypecodinglist.size()-1) {m.addMdctnStmntDsgDoseAndRtTypCdgSys("]]]");}


		 };
		/******************** medicationstatementdosagedoseandratedoserange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationstatementdosagedoseandratedoserange = medicationstatementdosagedoseandrate.getDoseRange();

		/******************** medicationstatementdosagedoseandratedoserangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandratedoserangelow = medicationstatementdosagedoseandratedoserange.getLow();

		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtDoseRngLwVl("[[");}
		if(medicationstatementdosagedoseandratedoserangelow.hasValue()) {

			m.addMdctnStmntDsgDoseAndRtDoseRngLwVl(String.valueOf(medicationstatementdosagedoseandratedoserangelow.getValue()));
		} else {
			m.addMdctnStmntDsgDoseAndRtDoseRngLwVl("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtDoseRngLwVl("]]");}


		/******************** medicationstatementdosagedoseandratedoserangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagedoseandratedoserangelowcomparator = medicationstatementdosagedoseandratedoserangelow.getComparator();
		if(medicationstatementdosagedoseandratedoserangelowcomparator!=null) {
		if(medicationstatementdosagedoseandratei == 0) {

		m.addMdctnStmntDsgDoseAndRtDoseRngLwCmprtr("[[");		}
			m.addMdctnStmntDsgDoseAndRtDoseRngLwCmprtr(medicationstatementdosagedoseandratedoserangelowcomparator.toCode());
		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {

		m.addMdctnStmntDsgDoseAndRtDoseRngLwCmprtr("]]");		}

		} else {
			m.addMdctnStmntDsgDoseAndRtDoseRngLwCmprtr("NULL");
		}

		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtDoseRngLwCd("[[");}
		if(medicationstatementdosagedoseandratedoserangelow.hasCode()) {

			m.addMdctnStmntDsgDoseAndRtDoseRngLwCd(String.valueOf(medicationstatementdosagedoseandratedoserangelow.getCode()));
		} else {
			m.addMdctnStmntDsgDoseAndRtDoseRngLwCd("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtDoseRngLwCd("]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtDoseRngLwUnt("[[");}
		if(medicationstatementdosagedoseandratedoserangelow.hasUnit()) {

			m.addMdctnStmntDsgDoseAndRtDoseRngLwUnt(String.valueOf(medicationstatementdosagedoseandratedoserangelow.getUnit()));
		} else {
			m.addMdctnStmntDsgDoseAndRtDoseRngLwUnt("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtDoseRngLwUnt("]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtDoseRngLwSys("[[");}
		if(medicationstatementdosagedoseandratedoserangelow.hasSystem()) {

			m.addMdctnStmntDsgDoseAndRtDoseRngLwSys(String.valueOf(medicationstatementdosagedoseandratedoserangelow.getSystem()));
		} else {
			m.addMdctnStmntDsgDoseAndRtDoseRngLwSys("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtDoseRngLwSys("]]");}


		/******************** medicationstatementdosagedoseandratedoserangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandratedoserangehigh = medicationstatementdosagedoseandratedoserange.getHigh();

		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtDoseRngHiVl("[[");}
		if(medicationstatementdosagedoseandratedoserangehigh.hasValue()) {

			m.addMdctnStmntDsgDoseAndRtDoseRngHiVl(String.valueOf(medicationstatementdosagedoseandratedoserangehigh.getValue()));
		} else {
			m.addMdctnStmntDsgDoseAndRtDoseRngHiVl("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtDoseRngHiVl("]]");}


		/******************** medicationstatementdosagedoseandratedoserangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagedoseandratedoserangehighcomparator = medicationstatementdosagedoseandratedoserangehigh.getComparator();
		if(medicationstatementdosagedoseandratedoserangehighcomparator!=null) {
		if(medicationstatementdosagedoseandratei == 0) {

		m.addMdctnStmntDsgDoseAndRtDoseRngHiCmprtr("[[");		}
			m.addMdctnStmntDsgDoseAndRtDoseRngHiCmprtr(medicationstatementdosagedoseandratedoserangehighcomparator.toCode());
		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {

		m.addMdctnStmntDsgDoseAndRtDoseRngHiCmprtr("]]");		}

		} else {
			m.addMdctnStmntDsgDoseAndRtDoseRngHiCmprtr("NULL");
		}

		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtDoseRngHiCd("[[");}
		if(medicationstatementdosagedoseandratedoserangehigh.hasCode()) {

			m.addMdctnStmntDsgDoseAndRtDoseRngHiCd(String.valueOf(medicationstatementdosagedoseandratedoserangehigh.getCode()));
		} else {
			m.addMdctnStmntDsgDoseAndRtDoseRngHiCd("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtDoseRngHiCd("]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtDoseRngHiUnt("[[");}
		if(medicationstatementdosagedoseandratedoserangehigh.hasUnit()) {

			m.addMdctnStmntDsgDoseAndRtDoseRngHiUnt(String.valueOf(medicationstatementdosagedoseandratedoserangehigh.getUnit()));
		} else {
			m.addMdctnStmntDsgDoseAndRtDoseRngHiUnt("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtDoseRngHiUnt("]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtDoseRngHiSys("[[");}
		if(medicationstatementdosagedoseandratedoserangehigh.hasSystem()) {

			m.addMdctnStmntDsgDoseAndRtDoseRngHiSys(String.valueOf(medicationstatementdosagedoseandratedoserangehigh.getSystem()));
		} else {
			m.addMdctnStmntDsgDoseAndRtDoseRngHiSys("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtDoseRngHiSys("]]");}


		/******************** medicationstatementdosagedoseandrateratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandrateratequantity = medicationstatementdosagedoseandrate.getRateQuantity();

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtQntyVl("[[");}
		if(medicationstatementdosagedoseandrateratequantity.hasValue()) {

			m.addMdctnStmntDsgDoseAndRtRtQntyVl(String.valueOf(medicationstatementdosagedoseandrateratequantity.getValue()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtQntyVl("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtQntyVl("]]");}


		/******************** medicationstatementdosagedoseandrateratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagedoseandrateratequantitycomparator = medicationstatementdosagedoseandrateratequantity.getComparator();
		if(medicationstatementdosagedoseandrateratequantitycomparator!=null) {
		if(medicationstatementdosagedoseandratei == 0) {

		m.addMdctnStmntDsgDoseAndRtRtQntyCmprtr("[[");		}
			m.addMdctnStmntDsgDoseAndRtRtQntyCmprtr(medicationstatementdosagedoseandrateratequantitycomparator.toCode());
		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {

		m.addMdctnStmntDsgDoseAndRtRtQntyCmprtr("]]");		}

		} else {
			m.addMdctnStmntDsgDoseAndRtRtQntyCmprtr("NULL");
		}

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtQntyCd("[[");}
		if(medicationstatementdosagedoseandrateratequantity.hasCode()) {

			m.addMdctnStmntDsgDoseAndRtRtQntyCd(String.valueOf(medicationstatementdosagedoseandrateratequantity.getCode()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtQntyCd("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtQntyCd("]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtQntyUnt("[[");}
		if(medicationstatementdosagedoseandrateratequantity.hasUnit()) {

			m.addMdctnStmntDsgDoseAndRtRtQntyUnt(String.valueOf(medicationstatementdosagedoseandrateratequantity.getUnit()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtQntyUnt("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtQntyUnt("]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtQntySys("[[");}
		if(medicationstatementdosagedoseandrateratequantity.hasSystem()) {

			m.addMdctnStmntDsgDoseAndRtRtQntySys(String.valueOf(medicationstatementdosagedoseandrateratequantity.getSystem()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtQntySys("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtQntySys("]]");}


		/******************** medicationstatementdosagedoseandraterateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationstatementdosagedoseandraterateratio = medicationstatementdosagedoseandrate.getRateRatio();

		/******************** medicationstatementdosagedoseandrateraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandrateraterationumerator = medicationstatementdosagedoseandraterateratio.getNumerator();

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrVl("[[");}
		if(medicationstatementdosagedoseandrateraterationumerator.hasValue()) {

			m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrVl(String.valueOf(medicationstatementdosagedoseandrateraterationumerator.getValue()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrVl("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrVl("]]");}


		/******************** medicationstatementdosagedoseandrateraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagedoseandrateraterationumeratorcomparator = medicationstatementdosagedoseandrateraterationumerator.getComparator();
		if(medicationstatementdosagedoseandrateraterationumeratorcomparator!=null) {
		if(medicationstatementdosagedoseandratei == 0) {

		m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrCmprtr("[[");		}
			m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrCmprtr(medicationstatementdosagedoseandrateraterationumeratorcomparator.toCode());
		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {

		m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrCmprtr("]]");		}

		} else {
			m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrCmprtr("NULL");
		}

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrCd("[[");}
		if(medicationstatementdosagedoseandrateraterationumerator.hasCode()) {

			m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrCd(String.valueOf(medicationstatementdosagedoseandrateraterationumerator.getCode()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrCd("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrCd("]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrUnt("[[");}
		if(medicationstatementdosagedoseandrateraterationumerator.hasUnit()) {

			m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrUnt(String.valueOf(medicationstatementdosagedoseandrateraterationumerator.getUnit()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrUnt("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrUnt("]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrSys("[[");}
		if(medicationstatementdosagedoseandrateraterationumerator.hasSystem()) {

			m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrSys(String.valueOf(medicationstatementdosagedoseandrateraterationumerator.getSystem()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrSys("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtRtioNmrtrSys("]]");}


		/******************** medicationstatementdosagedoseandraterateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandraterateratiodenominator = medicationstatementdosagedoseandraterateratio.getDenominator();

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrVl("[[");}
		if(medicationstatementdosagedoseandraterateratiodenominator.hasValue()) {

			m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrVl(String.valueOf(medicationstatementdosagedoseandraterateratiodenominator.getValue()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrVl("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrVl("]]");}


		/******************** medicationstatementdosagedoseandraterateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagedoseandraterateratiodenominatorcomparator = medicationstatementdosagedoseandraterateratiodenominator.getComparator();
		if(medicationstatementdosagedoseandraterateratiodenominatorcomparator!=null) {
		if(medicationstatementdosagedoseandratei == 0) {

		m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrCmprtr("[[");		}
			m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrCmprtr(medicationstatementdosagedoseandraterateratiodenominatorcomparator.toCode());
		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {

		m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrCmprtr("]]");		}

		} else {
			m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrCmprtr("NULL");
		}

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrCd("[[");}
		if(medicationstatementdosagedoseandraterateratiodenominator.hasCode()) {

			m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrCd(String.valueOf(medicationstatementdosagedoseandraterateratiodenominator.getCode()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrCd("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrCd("]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrUnt("[[");}
		if(medicationstatementdosagedoseandraterateratiodenominator.hasUnit()) {

			m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrUnt(String.valueOf(medicationstatementdosagedoseandraterateratiodenominator.getUnit()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrUnt("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrUnt("]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrSys("[[");}
		if(medicationstatementdosagedoseandraterateratiodenominator.hasSystem()) {

			m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrSys(String.valueOf(medicationstatementdosagedoseandraterateratiodenominator.getSystem()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrSys("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtRtioDnmntrSys("]]");}


		/******************** medicationstatementdosagedoseandrateraterange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationstatementdosagedoseandrateraterange = medicationstatementdosagedoseandrate.getRateRange();

		/******************** medicationstatementdosagedoseandrateraterangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandrateraterangelow = medicationstatementdosagedoseandrateraterange.getLow();

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtRngLwVl("[[");}
		if(medicationstatementdosagedoseandrateraterangelow.hasValue()) {

			m.addMdctnStmntDsgDoseAndRtRtRngLwVl(String.valueOf(medicationstatementdosagedoseandrateraterangelow.getValue()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtRngLwVl("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtRngLwVl("]]");}


		/******************** medicationstatementdosagedoseandrateraterangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagedoseandrateraterangelowcomparator = medicationstatementdosagedoseandrateraterangelow.getComparator();
		if(medicationstatementdosagedoseandrateraterangelowcomparator!=null) {
		if(medicationstatementdosagedoseandratei == 0) {

		m.addMdctnStmntDsgDoseAndRtRtRngLwCmprtr("[[");		}
			m.addMdctnStmntDsgDoseAndRtRtRngLwCmprtr(medicationstatementdosagedoseandrateraterangelowcomparator.toCode());
		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {

		m.addMdctnStmntDsgDoseAndRtRtRngLwCmprtr("]]");		}

		} else {
			m.addMdctnStmntDsgDoseAndRtRtRngLwCmprtr("NULL");
		}

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtRngLwCd("[[");}
		if(medicationstatementdosagedoseandrateraterangelow.hasCode()) {

			m.addMdctnStmntDsgDoseAndRtRtRngLwCd(String.valueOf(medicationstatementdosagedoseandrateraterangelow.getCode()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtRngLwCd("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtRngLwCd("]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtRngLwUnt("[[");}
		if(medicationstatementdosagedoseandrateraterangelow.hasUnit()) {

			m.addMdctnStmntDsgDoseAndRtRtRngLwUnt(String.valueOf(medicationstatementdosagedoseandrateraterangelow.getUnit()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtRngLwUnt("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtRngLwUnt("]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtRngLwSys("[[");}
		if(medicationstatementdosagedoseandrateraterangelow.hasSystem()) {

			m.addMdctnStmntDsgDoseAndRtRtRngLwSys(String.valueOf(medicationstatementdosagedoseandrateraterangelow.getSystem()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtRngLwSys("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtRngLwSys("]]");}


		/******************** medicationstatementdosagedoseandrateraterangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandrateraterangehigh = medicationstatementdosagedoseandrateraterange.getHigh();

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtRngHiVl("[[");}
		if(medicationstatementdosagedoseandrateraterangehigh.hasValue()) {

			m.addMdctnStmntDsgDoseAndRtRtRngHiVl(String.valueOf(medicationstatementdosagedoseandrateraterangehigh.getValue()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtRngHiVl("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtRngHiVl("]]");}


		/******************** medicationstatementdosagedoseandrateraterangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagedoseandrateraterangehighcomparator = medicationstatementdosagedoseandrateraterangehigh.getComparator();
		if(medicationstatementdosagedoseandrateraterangehighcomparator!=null) {
		if(medicationstatementdosagedoseandratei == 0) {

		m.addMdctnStmntDsgDoseAndRtRtRngHiCmprtr("[[");		}
			m.addMdctnStmntDsgDoseAndRtRtRngHiCmprtr(medicationstatementdosagedoseandrateraterangehighcomparator.toCode());
		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {

		m.addMdctnStmntDsgDoseAndRtRtRngHiCmprtr("]]");		}

		} else {
			m.addMdctnStmntDsgDoseAndRtRtRngHiCmprtr("NULL");
		}

		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtRngHiCd("[[");}
		if(medicationstatementdosagedoseandrateraterangehigh.hasCode()) {

			m.addMdctnStmntDsgDoseAndRtRtRngHiCd(String.valueOf(medicationstatementdosagedoseandrateraterangehigh.getCode()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtRngHiCd("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtRngHiCd("]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtRngHiUnt("[[");}
		if(medicationstatementdosagedoseandrateraterangehigh.hasUnit()) {

			m.addMdctnStmntDsgDoseAndRtRtRngHiUnt(String.valueOf(medicationstatementdosagedoseandrateraterangehigh.getUnit()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtRngHiUnt("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtRngHiUnt("]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtRtRngHiSys("[[");}
		if(medicationstatementdosagedoseandrateraterangehigh.hasSystem()) {

			m.addMdctnStmntDsgDoseAndRtRtRngHiSys(String.valueOf(medicationstatementdosagedoseandrateraterangehigh.getSystem()));
		} else {
			m.addMdctnStmntDsgDoseAndRtRtRngHiSys("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtRtRngHiSys("]]");}


		/******************** medicationstatementdosagedoseandratedosequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagedoseandratedosequantity = medicationstatementdosagedoseandrate.getDoseQuantity();

		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtDoseQntyVl("[[");}
		if(medicationstatementdosagedoseandratedosequantity.hasValue()) {

			m.addMdctnStmntDsgDoseAndRtDoseQntyVl(String.valueOf(medicationstatementdosagedoseandratedosequantity.getValue()));
		} else {
			m.addMdctnStmntDsgDoseAndRtDoseQntyVl("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtDoseQntyVl("]]");}


		/******************** medicationstatementdosagedoseandratedosequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagedoseandratedosequantitycomparator = medicationstatementdosagedoseandratedosequantity.getComparator();
		if(medicationstatementdosagedoseandratedosequantitycomparator!=null) {
		if(medicationstatementdosagedoseandratei == 0) {

		m.addMdctnStmntDsgDoseAndRtDoseQntyCmprtr("[[");		}
			m.addMdctnStmntDsgDoseAndRtDoseQntyCmprtr(medicationstatementdosagedoseandratedosequantitycomparator.toCode());
		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {

		m.addMdctnStmntDsgDoseAndRtDoseQntyCmprtr("]]");		}

		} else {
			m.addMdctnStmntDsgDoseAndRtDoseQntyCmprtr("NULL");
		}

		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtDoseQntyCd("[[");}
		if(medicationstatementdosagedoseandratedosequantity.hasCode()) {

			m.addMdctnStmntDsgDoseAndRtDoseQntyCd(String.valueOf(medicationstatementdosagedoseandratedosequantity.getCode()));
		} else {
			m.addMdctnStmntDsgDoseAndRtDoseQntyCd("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtDoseQntyCd("]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtDoseQntyUnt("[[");}
		if(medicationstatementdosagedoseandratedosequantity.hasUnit()) {

			m.addMdctnStmntDsgDoseAndRtDoseQntyUnt(String.valueOf(medicationstatementdosagedoseandratedosequantity.getUnit()));
		} else {
			m.addMdctnStmntDsgDoseAndRtDoseQntyUnt("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtDoseQntyUnt("]]");}


		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(medicationstatementdosagedoseandratei == 0) {m.addMdctnStmntDsgDoseAndRtDoseQntySys("[[");}
		if(medicationstatementdosagedoseandratedosequantity.hasSystem()) {

			m.addMdctnStmntDsgDoseAndRtDoseQntySys(String.valueOf(medicationstatementdosagedoseandratedosequantity.getSystem()));
		} else {
			m.addMdctnStmntDsgDoseAndRtDoseQntySys("NULL");
		}

		if(medicationstatementdosagedoseandratei == medicationstatementdosagedoseandratelist.size()-1) {m.addMdctnStmntDsgDoseAndRtDoseQntySys("]]");}


		 };
		/******************** MdctnStmnt_Dsg_Sqnc ********************************************************************************/
		if(medicationstatementdosage.hasSequence()) {

			m.addMdctnStmntDsgSqnc(String.valueOf(medicationstatementdosage.getSequence()));
		} else {
			m.addMdctnStmntDsgSqnc("NULL");
		}


		/******************** medicationstatementdosagesite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosagesite = medicationstatementdosage.getSite();

		/******************** MdctnStmnt_Dsg_Site_Txt ********************************************************************************/
		if(medicationstatementdosagesite.hasText()) {

			m.addMdctnStmntDsgSiteTxt(String.valueOf(medicationstatementdosagesite.getText()));
		} else {
			m.addMdctnStmntDsgSiteTxt("NULL");
		}


		/******************** medicationstatementdosagesitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationstatementdosagesitecodinglist = medicationstatementdosagesite.getCoding();
		for(int medicationstatementdosagesitecodingi = 0; medicationstatementdosagesitecodingi<medicationstatementdosagesitecodinglist.size();medicationstatementdosagesitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationstatementdosagesitecoding = medicationstatementdosagesitecodinglist.get(medicationstatementdosagesitecodingi);

		/******************** MdctnStmnt_Dsg_Site_Cdg_Dsply ********************************************************************************/
		if(medicationstatementdosagesitecodingi == 0) {m.addMdctnStmntDsgSiteCdgDsply("[[");}
		if(medicationstatementdosagesitecoding.hasDisplay()) {

			m.addMdctnStmntDsgSiteCdgDsply(String.valueOf(medicationstatementdosagesitecoding.getDisplay()));
		} else {
			m.addMdctnStmntDsgSiteCdgDsply("NULL");
		}

		if(medicationstatementdosagesitecodingi == medicationstatementdosagesitecodinglist.size()-1) {m.addMdctnStmntDsgSiteCdgDsply("]]");}


		/******************** MdctnStmnt_Dsg_Site_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementdosagesitecodingi == 0) {m.addMdctnStmntDsgSiteCdgVrsn("[[");}
		if(medicationstatementdosagesitecoding.hasVersion()) {

			m.addMdctnStmntDsgSiteCdgVrsn(String.valueOf(medicationstatementdosagesitecoding.getVersion()));
		} else {
			m.addMdctnStmntDsgSiteCdgVrsn("NULL");
		}

		if(medicationstatementdosagesitecodingi == medicationstatementdosagesitecodinglist.size()-1) {m.addMdctnStmntDsgSiteCdgVrsn("]]");}


		/******************** MdctnStmnt_Dsg_Site_Cdg_Cd ********************************************************************************/
		if(medicationstatementdosagesitecodingi == 0) {m.addMdctnStmntDsgSiteCdgCd("[[");}
		if(medicationstatementdosagesitecoding.hasCode()) {

			m.addMdctnStmntDsgSiteCdgCd(String.valueOf(medicationstatementdosagesitecoding.getCode()));
		} else {
			m.addMdctnStmntDsgSiteCdgCd("NULL");
		}

		if(medicationstatementdosagesitecodingi == medicationstatementdosagesitecodinglist.size()-1) {m.addMdctnStmntDsgSiteCdgCd("]]");}


		/******************** MdctnStmnt_Dsg_Site_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementdosagesitecodingi == 0) {m.addMdctnStmntDsgSiteCdgUsrSltd("[[");}
		if(medicationstatementdosagesitecoding.hasUserSelected()) {

			m.addMdctnStmntDsgSiteCdgUsrSltd(String.valueOf(medicationstatementdosagesitecoding.getUserSelected()));
		} else {
			m.addMdctnStmntDsgSiteCdgUsrSltd("NULL");
		}

		if(medicationstatementdosagesitecodingi == medicationstatementdosagesitecodinglist.size()-1) {m.addMdctnStmntDsgSiteCdgUsrSltd("]]");}


		/******************** MdctnStmnt_Dsg_Site_Cdg_Sys ********************************************************************************/
		if(medicationstatementdosagesitecodingi == 0) {m.addMdctnStmntDsgSiteCdgSys("[[");}
		if(medicationstatementdosagesitecoding.hasSystem()) {

			m.addMdctnStmntDsgSiteCdgSys(String.valueOf(medicationstatementdosagesitecoding.getSystem()));
		} else {
			m.addMdctnStmntDsgSiteCdgSys("NULL");
		}

		if(medicationstatementdosagesitecodingi == medicationstatementdosagesitecodinglist.size()-1) {m.addMdctnStmntDsgSiteCdgSys("]]");}


		 };
		/******************** MdctnStmnt_Dsg_PntInstrctn ********************************************************************************/
		if(medicationstatementdosage.hasPatientInstruction()) {

			m.addMdctnStmntDsgPntInstrctn(String.valueOf(medicationstatementdosage.getPatientInstruction()));
		} else {
			m.addMdctnStmntDsgPntInstrctn("NULL");
		}


		/******************** MdctnStmnt_Dsg_Txt ********************************************************************************/
		if(medicationstatementdosage.hasText()) {

			m.addMdctnStmntDsgTxt(String.valueOf(medicationstatementdosage.getText()));
		} else {
			m.addMdctnStmntDsgTxt("NULL");
		}


		/******************** medicationstatementdosagetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing medicationstatementdosagetiming = medicationstatementdosage.getTiming();

		/******************** medicationstatementdosagetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosagetimingcode = medicationstatementdosagetiming.getCode();

		/******************** MdctnStmnt_Dsg_Tmg_Cd_Txt ********************************************************************************/
		if(medicationstatementdosagetimingcode.hasText()) {

			m.addMdctnStmntDsgTmgCdTxt(String.valueOf(medicationstatementdosagetimingcode.getText()));
		} else {
			m.addMdctnStmntDsgTmgCdTxt("NULL");
		}


		/******************** medicationstatementdosagetimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationstatementdosagetimingcodecodinglist = medicationstatementdosagetimingcode.getCoding();
		for(int medicationstatementdosagetimingcodecodingi = 0; medicationstatementdosagetimingcodecodingi<medicationstatementdosagetimingcodecodinglist.size();medicationstatementdosagetimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationstatementdosagetimingcodecoding = medicationstatementdosagetimingcodecodinglist.get(medicationstatementdosagetimingcodecodingi);

		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(medicationstatementdosagetimingcodecodingi == 0) {m.addMdctnStmntDsgTmgCdCdgDsply("[[");}
		if(medicationstatementdosagetimingcodecoding.hasDisplay()) {

			m.addMdctnStmntDsgTmgCdCdgDsply(String.valueOf(medicationstatementdosagetimingcodecoding.getDisplay()));
		} else {
			m.addMdctnStmntDsgTmgCdCdgDsply("NULL");
		}

		if(medicationstatementdosagetimingcodecodingi == medicationstatementdosagetimingcodecodinglist.size()-1) {m.addMdctnStmntDsgTmgCdCdgDsply("]]");}


		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementdosagetimingcodecodingi == 0) {m.addMdctnStmntDsgTmgCdCdgVrsn("[[");}
		if(medicationstatementdosagetimingcodecoding.hasVersion()) {

			m.addMdctnStmntDsgTmgCdCdgVrsn(String.valueOf(medicationstatementdosagetimingcodecoding.getVersion()));
		} else {
			m.addMdctnStmntDsgTmgCdCdgVrsn("NULL");
		}

		if(medicationstatementdosagetimingcodecodingi == medicationstatementdosagetimingcodecodinglist.size()-1) {m.addMdctnStmntDsgTmgCdCdgVrsn("]]");}


		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(medicationstatementdosagetimingcodecodingi == 0) {m.addMdctnStmntDsgTmgCdCdgCd("[[");}
		if(medicationstatementdosagetimingcodecoding.hasCode()) {

			m.addMdctnStmntDsgTmgCdCdgCd(String.valueOf(medicationstatementdosagetimingcodecoding.getCode()));
		} else {
			m.addMdctnStmntDsgTmgCdCdgCd("NULL");
		}

		if(medicationstatementdosagetimingcodecodingi == medicationstatementdosagetimingcodecodinglist.size()-1) {m.addMdctnStmntDsgTmgCdCdgCd("]]");}


		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementdosagetimingcodecodingi == 0) {m.addMdctnStmntDsgTmgCdCdgUsrSltd("[[");}
		if(medicationstatementdosagetimingcodecoding.hasUserSelected()) {

			m.addMdctnStmntDsgTmgCdCdgUsrSltd(String.valueOf(medicationstatementdosagetimingcodecoding.getUserSelected()));
		} else {
			m.addMdctnStmntDsgTmgCdCdgUsrSltd("NULL");
		}

		if(medicationstatementdosagetimingcodecodingi == medicationstatementdosagetimingcodecodinglist.size()-1) {m.addMdctnStmntDsgTmgCdCdgUsrSltd("]]");}


		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(medicationstatementdosagetimingcodecodingi == 0) {m.addMdctnStmntDsgTmgCdCdgSys("[[");}
		if(medicationstatementdosagetimingcodecoding.hasSystem()) {

			m.addMdctnStmntDsgTmgCdCdgSys(String.valueOf(medicationstatementdosagetimingcodecoding.getSystem()));
		} else {
			m.addMdctnStmntDsgTmgCdCdgSys("NULL");
		}

		if(medicationstatementdosagetimingcodecodingi == medicationstatementdosagetimingcodecodinglist.size()-1) {m.addMdctnStmntDsgTmgCdCdgSys("]]");}


		 };
		/******************** MdctnStmnt_Dsg_Tmg_Evnt ********************************************************************************/
		if(medicationstatementdosagetiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<medicationstatementdosagetiming.getEvent().size(); incr++) {
				array = array + medicationstatementdosagetiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnStmntDsgTmgEvnt(array);

		} else {
			m.addMdctnStmntDsgTmgEvnt("NULL");
		}


		/******************** medicationstatementdosagetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent medicationstatementdosagetimingrepeat = medicationstatementdosagetiming.getRepeat();

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Off ********************************************************************************/
		if(medicationstatementdosagetimingrepeat.hasOffset()) {

			m.addMdctnStmntDsgTmgRptOff(String.valueOf(medicationstatementdosagetimingrepeat.getOffset()));
		} else {
			m.addMdctnStmntDsgTmgRptOff("NULL");
		}


		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Cnt ********************************************************************************/
		if(medicationstatementdosagetimingrepeat.hasCount()) {

			m.addMdctnStmntDsgTmgRptCnt(String.valueOf(medicationstatementdosagetimingrepeat.getCount()));
		} else {
			m.addMdctnStmntDsgTmgRptCnt("NULL");
		}


		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Prd ********************************************************************************/
		if(medicationstatementdosagetimingrepeat.hasPeriod()) {

			m.addMdctnStmntDsgTmgRptPrd(String.valueOf(medicationstatementdosagetimingrepeat.getPeriod()));
		} else {
			m.addMdctnStmntDsgTmgRptPrd("NULL");
		}


		/******************** MdctnStmnt_Dsg_Tmg_Rpt_CntMx ********************************************************************************/
		if(medicationstatementdosagetimingrepeat.hasCountMax()) {

			m.addMdctnStmntDsgTmgRptCntMx(String.valueOf(medicationstatementdosagetimingrepeat.getCountMax()));
		} else {
			m.addMdctnStmntDsgTmgRptCntMx("NULL");
		}


		/******************** MdctnStmnt_Dsg_Tmg_Rpt_DurationMx ********************************************************************************/
		if(medicationstatementdosagetimingrepeat.hasDurationMax()) {

			m.addMdctnStmntDsgTmgRptDurationMx(String.valueOf(medicationstatementdosagetimingrepeat.getDurationMax()));
		} else {
			m.addMdctnStmntDsgTmgRptDurationMx("NULL");
		}


		/******************** medicationstatementdosagetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationstatementdosagetimingrepeatboundsperiod = medicationstatementdosagetimingrepeat.getBoundsPeriod();

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsperiod.hasStart()) {

			m.addMdctnStmntDsgTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationstatementdosagetimingrepeatboundsperiod.getStart())+"\"");
		} else {
			m.addMdctnStmntDsgTmgRptBndsPrdStrt("NULL");
		}


		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsperiod.hasEnd()) {

			m.addMdctnStmntDsgTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationstatementdosagetimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			m.addMdctnStmntDsgTmgRptBndsPrdEnd("NULL");
		}


		/******************** medicationstatementdosagetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime medicationstatementdosagetimingrepeatdurationunit = medicationstatementdosagetimingrepeat.getDurationUnit();
		if(medicationstatementdosagetimingrepeatdurationunit!=null) {
			m.addMdctnStmntDsgTmgRptDurationUnt(medicationstatementdosagetimingrepeatdurationunit.toCode());
		} else {
			m.addMdctnStmntDsgTmgRptDurationUnt("NULL");
		}

		/******************** medicationstatementdosagetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationstatementdosagetimingrepeatboundsduration = medicationstatementdosagetimingrepeat.getBoundsDuration();

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsduration.hasValue()) {

			m.addMdctnStmntDsgTmgRptBndsDurationVl(String.valueOf(medicationstatementdosagetimingrepeatboundsduration.getValue()));
		} else {
			m.addMdctnStmntDsgTmgRptBndsDurationVl("NULL");
		}


		/******************** medicationstatementdosagetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagetimingrepeatboundsdurationcomparator = medicationstatementdosagetimingrepeatboundsduration.getComparator();
		if(medicationstatementdosagetimingrepeatboundsdurationcomparator!=null) {
			m.addMdctnStmntDsgTmgRptBndsDurationCmprtr(medicationstatementdosagetimingrepeatboundsdurationcomparator.toCode());
		} else {
			m.addMdctnStmntDsgTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsduration.hasCode()) {

			m.addMdctnStmntDsgTmgRptBndsDurationCd(String.valueOf(medicationstatementdosagetimingrepeatboundsduration.getCode()));
		} else {
			m.addMdctnStmntDsgTmgRptBndsDurationCd("NULL");
		}


		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsduration.hasUnit()) {

			m.addMdctnStmntDsgTmgRptBndsDurationUnt(String.valueOf(medicationstatementdosagetimingrepeatboundsduration.getUnit()));
		} else {
			m.addMdctnStmntDsgTmgRptBndsDurationUnt("NULL");
		}


		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsduration.hasSystem()) {

			m.addMdctnStmntDsgTmgRptBndsDurationSys(String.valueOf(medicationstatementdosagetimingrepeatboundsduration.getSystem()));
		} else {
			m.addMdctnStmntDsgTmgRptBndsDurationSys("NULL");
		}


		/******************** medicationstatementdosagetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationstatementdosagetimingrepeatboundsrange = medicationstatementdosagetimingrepeat.getBoundsRange();

		/******************** medicationstatementdosagetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagetimingrepeatboundsrangelow = medicationstatementdosagetimingrepeatboundsrange.getLow();

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsrangelow.hasValue()) {

			m.addMdctnStmntDsgTmgRptBndsRngLwVl(String.valueOf(medicationstatementdosagetimingrepeatboundsrangelow.getValue()));
		} else {
			m.addMdctnStmntDsgTmgRptBndsRngLwVl("NULL");
		}


		/******************** medicationstatementdosagetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagetimingrepeatboundsrangelowcomparator = medicationstatementdosagetimingrepeatboundsrangelow.getComparator();
		if(medicationstatementdosagetimingrepeatboundsrangelowcomparator!=null) {
			m.addMdctnStmntDsgTmgRptBndsRngLwCmprtr(medicationstatementdosagetimingrepeatboundsrangelowcomparator.toCode());
		} else {
			m.addMdctnStmntDsgTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsrangelow.hasCode()) {

			m.addMdctnStmntDsgTmgRptBndsRngLwCd(String.valueOf(medicationstatementdosagetimingrepeatboundsrangelow.getCode()));
		} else {
			m.addMdctnStmntDsgTmgRptBndsRngLwCd("NULL");
		}


		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsrangelow.hasUnit()) {

			m.addMdctnStmntDsgTmgRptBndsRngLwUnt(String.valueOf(medicationstatementdosagetimingrepeatboundsrangelow.getUnit()));
		} else {
			m.addMdctnStmntDsgTmgRptBndsRngLwUnt("NULL");
		}


		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsrangelow.hasSystem()) {

			m.addMdctnStmntDsgTmgRptBndsRngLwSys(String.valueOf(medicationstatementdosagetimingrepeatboundsrangelow.getSystem()));
		} else {
			m.addMdctnStmntDsgTmgRptBndsRngLwSys("NULL");
		}


		/******************** medicationstatementdosagetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagetimingrepeatboundsrangehigh = medicationstatementdosagetimingrepeatboundsrange.getHigh();

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsrangehigh.hasValue()) {

			m.addMdctnStmntDsgTmgRptBndsRngHiVl(String.valueOf(medicationstatementdosagetimingrepeatboundsrangehigh.getValue()));
		} else {
			m.addMdctnStmntDsgTmgRptBndsRngHiVl("NULL");
		}


		/******************** medicationstatementdosagetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagetimingrepeatboundsrangehighcomparator = medicationstatementdosagetimingrepeatboundsrangehigh.getComparator();
		if(medicationstatementdosagetimingrepeatboundsrangehighcomparator!=null) {
			m.addMdctnStmntDsgTmgRptBndsRngHiCmprtr(medicationstatementdosagetimingrepeatboundsrangehighcomparator.toCode());
		} else {
			m.addMdctnStmntDsgTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsrangehigh.hasCode()) {

			m.addMdctnStmntDsgTmgRptBndsRngHiCd(String.valueOf(medicationstatementdosagetimingrepeatboundsrangehigh.getCode()));
		} else {
			m.addMdctnStmntDsgTmgRptBndsRngHiCd("NULL");
		}


		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsrangehigh.hasUnit()) {

			m.addMdctnStmntDsgTmgRptBndsRngHiUnt(String.valueOf(medicationstatementdosagetimingrepeatboundsrangehigh.getUnit()));
		} else {
			m.addMdctnStmntDsgTmgRptBndsRngHiUnt("NULL");
		}


		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(medicationstatementdosagetimingrepeatboundsrangehigh.hasSystem()) {

			m.addMdctnStmntDsgTmgRptBndsRngHiSys(String.valueOf(medicationstatementdosagetimingrepeatboundsrangehigh.getSystem()));
		} else {
			m.addMdctnStmntDsgTmgRptBndsRngHiSys("NULL");
		}


		/******************** MdctnStmnt_Dsg_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(medicationstatementdosagetimingrepeat.hasFrequencyMax()) {

			m.addMdctnStmntDsgTmgRptFrqncyMx(String.valueOf(medicationstatementdosagetimingrepeat.getFrequencyMax()));
		} else {
			m.addMdctnStmntDsgTmgRptFrqncyMx("NULL");
		}


		/******************** medicationstatementdosagetimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> medicationstatementdosagetimingrepeatwhenlist = medicationstatementdosagetimingrepeat.getWhen();
		for(int medicationstatementdosagetimingrepeatwheni = 0; medicationstatementdosagetimingrepeatwheni<medicationstatementdosagetimingrepeatwhenlist.size();medicationstatementdosagetimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  medicationstatementdosagetimingrepeatwhen = medicationstatementdosagetimingrepeatwhenlist.get(medicationstatementdosagetimingrepeatwheni);
		if(medicationstatementdosagetimingrepeatwhen!=null) {
			m.addMdctnStmntDsgTmgRptWhen(medicationstatementdosagetimingrepeatwhen.getCode());
		} else {
			m.addMdctnStmntDsgTmgRptWhen("NULL");
		}
		 };

		/******************** medicationstatementdosagetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime medicationstatementdosagetimingrepeatperiodunit = medicationstatementdosagetimingrepeat.getPeriodUnit();
		if(medicationstatementdosagetimingrepeatperiodunit!=null) {
			m.addMdctnStmntDsgTmgRptPrdUnt(medicationstatementdosagetimingrepeatperiodunit.toCode());
		} else {
			m.addMdctnStmntDsgTmgRptPrdUnt("NULL");
		}

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_PrdMx ********************************************************************************/
		if(medicationstatementdosagetimingrepeat.hasPeriodMax()) {

			m.addMdctnStmntDsgTmgRptPrdMx(String.valueOf(medicationstatementdosagetimingrepeat.getPeriodMax()));
		} else {
			m.addMdctnStmntDsgTmgRptPrdMx("NULL");
		}


		/******************** medicationstatementdosagetimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> medicationstatementdosagetimingrepeatdayofweeklist = medicationstatementdosagetimingrepeat.getDayOfWeek();
		for(int medicationstatementdosagetimingrepeatdayofweeki = 0; medicationstatementdosagetimingrepeatdayofweeki<medicationstatementdosagetimingrepeatdayofweeklist.size();medicationstatementdosagetimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  medicationstatementdosagetimingrepeatdayofweek = medicationstatementdosagetimingrepeatdayofweeklist.get(medicationstatementdosagetimingrepeatdayofweeki);
		if(medicationstatementdosagetimingrepeatdayofweek!=null) {
			m.addMdctnStmntDsgTmgRptDayOfWeek(medicationstatementdosagetimingrepeatdayofweek.getCode());
		} else {
			m.addMdctnStmntDsgTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** MdctnStmnt_Dsg_Tmg_Rpt_TimeOfDay ********************************************************************************/
		if(medicationstatementdosagetimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<medicationstatementdosagetimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + medicationstatementdosagetimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnStmntDsgTmgRptTimeOfDay(array);

		} else {
			m.addMdctnStmntDsgTmgRptTimeOfDay("NULL");
		}


		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Duration ********************************************************************************/
		if(medicationstatementdosagetimingrepeat.hasDuration()) {

			m.addMdctnStmntDsgTmgRptDuration(String.valueOf(medicationstatementdosagetimingrepeat.getDuration()));
		} else {
			m.addMdctnStmntDsgTmgRptDuration("NULL");
		}


		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Frqncy ********************************************************************************/
		if(medicationstatementdosagetimingrepeat.hasFrequency()) {

			m.addMdctnStmntDsgTmgRptFrqncy(String.valueOf(medicationstatementdosagetimingrepeat.getFrequency()));
		} else {
			m.addMdctnStmntDsgTmgRptFrqncy("NULL");
		}


		/******************** medicationstatementdosagemaxdoseperadministration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagemaxdoseperadministration = medicationstatementdosage.getMaxDosePerAdministration();

		/******************** MdctnStmnt_Dsg_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(medicationstatementdosagemaxdoseperadministration.hasValue()) {

			m.addMdctnStmntDsgMxDosePerAdmnstnVl(String.valueOf(medicationstatementdosagemaxdoseperadministration.getValue()));
		} else {
			m.addMdctnStmntDsgMxDosePerAdmnstnVl("NULL");
		}


		/******************** medicationstatementdosagemaxdoseperadministrationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagemaxdoseperadministrationcomparator = medicationstatementdosagemaxdoseperadministration.getComparator();
		if(medicationstatementdosagemaxdoseperadministrationcomparator!=null) {
			m.addMdctnStmntDsgMxDosePerAdmnstnCmprtr(medicationstatementdosagemaxdoseperadministrationcomparator.toCode());
		} else {
			m.addMdctnStmntDsgMxDosePerAdmnstnCmprtr("NULL");
		}

		/******************** MdctnStmnt_Dsg_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(medicationstatementdosagemaxdoseperadministration.hasCode()) {

			m.addMdctnStmntDsgMxDosePerAdmnstnCd(String.valueOf(medicationstatementdosagemaxdoseperadministration.getCode()));
		} else {
			m.addMdctnStmntDsgMxDosePerAdmnstnCd("NULL");
		}


		/******************** MdctnStmnt_Dsg_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(medicationstatementdosagemaxdoseperadministration.hasUnit()) {

			m.addMdctnStmntDsgMxDosePerAdmnstnUnt(String.valueOf(medicationstatementdosagemaxdoseperadministration.getUnit()));
		} else {
			m.addMdctnStmntDsgMxDosePerAdmnstnUnt("NULL");
		}


		/******************** MdctnStmnt_Dsg_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(medicationstatementdosagemaxdoseperadministration.hasSystem()) {

			m.addMdctnStmntDsgMxDosePerAdmnstnSys(String.valueOf(medicationstatementdosagemaxdoseperadministration.getSystem()));
		} else {
			m.addMdctnStmntDsgMxDosePerAdmnstnSys("NULL");
		}


		/******************** medicationstatementdosagemaxdoseperperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationstatementdosagemaxdoseperperiod = medicationstatementdosage.getMaxDosePerPeriod();

		/******************** medicationstatementdosagemaxdoseperperiodnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagemaxdoseperperiodnumerator = medicationstatementdosagemaxdoseperperiod.getNumerator();

		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(medicationstatementdosagemaxdoseperperiodnumerator.hasValue()) {

			m.addMdctnStmntDsgMxDosePerPrdNmrtrVl(String.valueOf(medicationstatementdosagemaxdoseperperiodnumerator.getValue()));
		} else {
			m.addMdctnStmntDsgMxDosePerPrdNmrtrVl("NULL");
		}


		/******************** medicationstatementdosagemaxdoseperperiodnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagemaxdoseperperiodnumeratorcomparator = medicationstatementdosagemaxdoseperperiodnumerator.getComparator();
		if(medicationstatementdosagemaxdoseperperiodnumeratorcomparator!=null) {
			m.addMdctnStmntDsgMxDosePerPrdNmrtrCmprtr(medicationstatementdosagemaxdoseperperiodnumeratorcomparator.toCode());
		} else {
			m.addMdctnStmntDsgMxDosePerPrdNmrtrCmprtr("NULL");
		}

		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(medicationstatementdosagemaxdoseperperiodnumerator.hasCode()) {

			m.addMdctnStmntDsgMxDosePerPrdNmrtrCd(String.valueOf(medicationstatementdosagemaxdoseperperiodnumerator.getCode()));
		} else {
			m.addMdctnStmntDsgMxDosePerPrdNmrtrCd("NULL");
		}


		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(medicationstatementdosagemaxdoseperperiodnumerator.hasUnit()) {

			m.addMdctnStmntDsgMxDosePerPrdNmrtrUnt(String.valueOf(medicationstatementdosagemaxdoseperperiodnumerator.getUnit()));
		} else {
			m.addMdctnStmntDsgMxDosePerPrdNmrtrUnt("NULL");
		}


		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(medicationstatementdosagemaxdoseperperiodnumerator.hasSystem()) {

			m.addMdctnStmntDsgMxDosePerPrdNmrtrSys(String.valueOf(medicationstatementdosagemaxdoseperperiodnumerator.getSystem()));
		} else {
			m.addMdctnStmntDsgMxDosePerPrdNmrtrSys("NULL");
		}


		/******************** medicationstatementdosagemaxdoseperperioddenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagemaxdoseperperioddenominator = medicationstatementdosagemaxdoseperperiod.getDenominator();

		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(medicationstatementdosagemaxdoseperperioddenominator.hasValue()) {

			m.addMdctnStmntDsgMxDosePerPrdDnmntrVl(String.valueOf(medicationstatementdosagemaxdoseperperioddenominator.getValue()));
		} else {
			m.addMdctnStmntDsgMxDosePerPrdDnmntrVl("NULL");
		}


		/******************** medicationstatementdosagemaxdoseperperioddenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagemaxdoseperperioddenominatorcomparator = medicationstatementdosagemaxdoseperperioddenominator.getComparator();
		if(medicationstatementdosagemaxdoseperperioddenominatorcomparator!=null) {
			m.addMdctnStmntDsgMxDosePerPrdDnmntrCmprtr(medicationstatementdosagemaxdoseperperioddenominatorcomparator.toCode());
		} else {
			m.addMdctnStmntDsgMxDosePerPrdDnmntrCmprtr("NULL");
		}

		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(medicationstatementdosagemaxdoseperperioddenominator.hasCode()) {

			m.addMdctnStmntDsgMxDosePerPrdDnmntrCd(String.valueOf(medicationstatementdosagemaxdoseperperioddenominator.getCode()));
		} else {
			m.addMdctnStmntDsgMxDosePerPrdDnmntrCd("NULL");
		}


		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(medicationstatementdosagemaxdoseperperioddenominator.hasUnit()) {

			m.addMdctnStmntDsgMxDosePerPrdDnmntrUnt(String.valueOf(medicationstatementdosagemaxdoseperperioddenominator.getUnit()));
		} else {
			m.addMdctnStmntDsgMxDosePerPrdDnmntrUnt("NULL");
		}


		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(medicationstatementdosagemaxdoseperperioddenominator.hasSystem()) {

			m.addMdctnStmntDsgMxDosePerPrdDnmntrSys(String.valueOf(medicationstatementdosagemaxdoseperperioddenominator.getSystem()));
		} else {
			m.addMdctnStmntDsgMxDosePerPrdDnmntrSys("NULL");
		}


		/******************** medicationstatementdosageadditionalinstruction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicationstatementdosageadditionalinstructionlist = medicationstatementdosage.getAdditionalInstruction();
		for(int medicationstatementdosageadditionalinstructioni = 0; medicationstatementdosageadditionalinstructioni<medicationstatementdosageadditionalinstructionlist.size();medicationstatementdosageadditionalinstructioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicationstatementdosageadditionalinstruction = medicationstatementdosageadditionalinstructionlist.get(medicationstatementdosageadditionalinstructioni);

		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Txt ********************************************************************************/
		if(medicationstatementdosageadditionalinstructioni == 0) {m.addMdctnStmntDsgAddtnlInstrctnTxt("[[");}
		if(medicationstatementdosageadditionalinstruction.hasText()) {

			m.addMdctnStmntDsgAddtnlInstrctnTxt(String.valueOf(medicationstatementdosageadditionalinstruction.getText()));
		} else {
			m.addMdctnStmntDsgAddtnlInstrctnTxt("NULL");
		}

		if(medicationstatementdosageadditionalinstructioni == medicationstatementdosageadditionalinstructionlist.size()-1) {m.addMdctnStmntDsgAddtnlInstrctnTxt("]]");}


		/******************** medicationstatementdosageadditionalinstructioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationstatementdosageadditionalinstructioncodinglist = medicationstatementdosageadditionalinstruction.getCoding();
		for(int medicationstatementdosageadditionalinstructioncodingi = 0; medicationstatementdosageadditionalinstructioncodingi<medicationstatementdosageadditionalinstructioncodinglist.size();medicationstatementdosageadditionalinstructioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationstatementdosageadditionalinstructioncoding = medicationstatementdosageadditionalinstructioncodinglist.get(medicationstatementdosageadditionalinstructioncodingi);

		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(medicationstatementdosageadditionalinstructioncodingi == 0) {m.addMdctnStmntDsgAddtnlInstrctnCdgDsply("[[[");}
		if(medicationstatementdosageadditionalinstructioncoding.hasDisplay()) {

			m.addMdctnStmntDsgAddtnlInstrctnCdgDsply(String.valueOf(medicationstatementdosageadditionalinstructioncoding.getDisplay()));
		} else {
			m.addMdctnStmntDsgAddtnlInstrctnCdgDsply("NULL");
		}

		if(medicationstatementdosageadditionalinstructioncodingi == medicationstatementdosageadditionalinstructioncodinglist.size()-1) {m.addMdctnStmntDsgAddtnlInstrctnCdgDsply("]]]");}


		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementdosageadditionalinstructioncodingi == 0) {m.addMdctnStmntDsgAddtnlInstrctnCdgVrsn("[[[");}
		if(medicationstatementdosageadditionalinstructioncoding.hasVersion()) {

			m.addMdctnStmntDsgAddtnlInstrctnCdgVrsn(String.valueOf(medicationstatementdosageadditionalinstructioncoding.getVersion()));
		} else {
			m.addMdctnStmntDsgAddtnlInstrctnCdgVrsn("NULL");
		}

		if(medicationstatementdosageadditionalinstructioncodingi == medicationstatementdosageadditionalinstructioncodinglist.size()-1) {m.addMdctnStmntDsgAddtnlInstrctnCdgVrsn("]]]");}


		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(medicationstatementdosageadditionalinstructioncodingi == 0) {m.addMdctnStmntDsgAddtnlInstrctnCdgCd("[[[");}
		if(medicationstatementdosageadditionalinstructioncoding.hasCode()) {

			m.addMdctnStmntDsgAddtnlInstrctnCdgCd(String.valueOf(medicationstatementdosageadditionalinstructioncoding.getCode()));
		} else {
			m.addMdctnStmntDsgAddtnlInstrctnCdgCd("NULL");
		}

		if(medicationstatementdosageadditionalinstructioncodingi == medicationstatementdosageadditionalinstructioncodinglist.size()-1) {m.addMdctnStmntDsgAddtnlInstrctnCdgCd("]]]");}


		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementdosageadditionalinstructioncodingi == 0) {m.addMdctnStmntDsgAddtnlInstrctnCdgUsrSltd("[[[");}
		if(medicationstatementdosageadditionalinstructioncoding.hasUserSelected()) {

			m.addMdctnStmntDsgAddtnlInstrctnCdgUsrSltd(String.valueOf(medicationstatementdosageadditionalinstructioncoding.getUserSelected()));
		} else {
			m.addMdctnStmntDsgAddtnlInstrctnCdgUsrSltd("NULL");
		}

		if(medicationstatementdosageadditionalinstructioncodingi == medicationstatementdosageadditionalinstructioncodinglist.size()-1) {m.addMdctnStmntDsgAddtnlInstrctnCdgUsrSltd("]]]");}


		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(medicationstatementdosageadditionalinstructioncodingi == 0) {m.addMdctnStmntDsgAddtnlInstrctnCdgSys("[[[");}
		if(medicationstatementdosageadditionalinstructioncoding.hasSystem()) {

			m.addMdctnStmntDsgAddtnlInstrctnCdgSys(String.valueOf(medicationstatementdosageadditionalinstructioncoding.getSystem()));
		} else {
			m.addMdctnStmntDsgAddtnlInstrctnCdgSys("NULL");
		}

		if(medicationstatementdosageadditionalinstructioncodingi == medicationstatementdosageadditionalinstructioncodinglist.size()-1) {m.addMdctnStmntDsgAddtnlInstrctnCdgSys("]]]");}


		 };
		 };
		/******************** medicationstatementdosagemaxdoseperlifetime ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationstatementdosagemaxdoseperlifetime = medicationstatementdosage.getMaxDosePerLifetime();

		/******************** MdctnStmnt_Dsg_MxDosePerLifetime_Vl ********************************************************************************/
		if(medicationstatementdosagemaxdoseperlifetime.hasValue()) {

			m.addMdctnStmntDsgMxDosePerLifetimeVl(String.valueOf(medicationstatementdosagemaxdoseperlifetime.getValue()));
		} else {
			m.addMdctnStmntDsgMxDosePerLifetimeVl("NULL");
		}


		/******************** medicationstatementdosagemaxdoseperlifetimecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationstatementdosagemaxdoseperlifetimecomparator = medicationstatementdosagemaxdoseperlifetime.getComparator();
		if(medicationstatementdosagemaxdoseperlifetimecomparator!=null) {
			m.addMdctnStmntDsgMxDosePerLifetimeCmprtr(medicationstatementdosagemaxdoseperlifetimecomparator.toCode());
		} else {
			m.addMdctnStmntDsgMxDosePerLifetimeCmprtr("NULL");
		}

		/******************** MdctnStmnt_Dsg_MxDosePerLifetime_Cd ********************************************************************************/
		if(medicationstatementdosagemaxdoseperlifetime.hasCode()) {

			m.addMdctnStmntDsgMxDosePerLifetimeCd(String.valueOf(medicationstatementdosagemaxdoseperlifetime.getCode()));
		} else {
			m.addMdctnStmntDsgMxDosePerLifetimeCd("NULL");
		}


		/******************** MdctnStmnt_Dsg_MxDosePerLifetime_Unt ********************************************************************************/
		if(medicationstatementdosagemaxdoseperlifetime.hasUnit()) {

			m.addMdctnStmntDsgMxDosePerLifetimeUnt(String.valueOf(medicationstatementdosagemaxdoseperlifetime.getUnit()));
		} else {
			m.addMdctnStmntDsgMxDosePerLifetimeUnt("NULL");
		}


		/******************** MdctnStmnt_Dsg_MxDosePerLifetime_Sys ********************************************************************************/
		if(medicationstatementdosagemaxdoseperlifetime.hasSystem()) {

			m.addMdctnStmntDsgMxDosePerLifetimeSys(String.valueOf(medicationstatementdosagemaxdoseperlifetime.getSystem()));
		} else {
			m.addMdctnStmntDsgMxDosePerLifetimeSys("NULL");
		}


		/******************** medicationstatementdosageasneededcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosageasneededcodeableconcept = medicationstatementdosage.getAsNeededCodeableConcept();

		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(medicationstatementdosageasneededcodeableconcept.hasText()) {

			m.addMdctnStmntDsgAsNdCdbleCncptTxt(String.valueOf(medicationstatementdosageasneededcodeableconcept.getText()));
		} else {
			m.addMdctnStmntDsgAsNdCdbleCncptTxt("NULL");
		}


		/******************** medicationstatementdosageasneededcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationstatementdosageasneededcodeableconceptcodinglist = medicationstatementdosageasneededcodeableconcept.getCoding();
		for(int medicationstatementdosageasneededcodeableconceptcodingi = 0; medicationstatementdosageasneededcodeableconceptcodingi<medicationstatementdosageasneededcodeableconceptcodinglist.size();medicationstatementdosageasneededcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationstatementdosageasneededcodeableconceptcoding = medicationstatementdosageasneededcodeableconceptcodinglist.get(medicationstatementdosageasneededcodeableconceptcodingi);

		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationstatementdosageasneededcodeableconceptcodingi == 0) {m.addMdctnStmntDsgAsNdCdbleCncptCdgDsply("[[");}
		if(medicationstatementdosageasneededcodeableconceptcoding.hasDisplay()) {

			m.addMdctnStmntDsgAsNdCdbleCncptCdgDsply(String.valueOf(medicationstatementdosageasneededcodeableconceptcoding.getDisplay()));
		} else {
			m.addMdctnStmntDsgAsNdCdbleCncptCdgDsply("NULL");
		}

		if(medicationstatementdosageasneededcodeableconceptcodingi == medicationstatementdosageasneededcodeableconceptcodinglist.size()-1) {m.addMdctnStmntDsgAsNdCdbleCncptCdgDsply("]]");}


		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementdosageasneededcodeableconceptcodingi == 0) {m.addMdctnStmntDsgAsNdCdbleCncptCdgVrsn("[[");}
		if(medicationstatementdosageasneededcodeableconceptcoding.hasVersion()) {

			m.addMdctnStmntDsgAsNdCdbleCncptCdgVrsn(String.valueOf(medicationstatementdosageasneededcodeableconceptcoding.getVersion()));
		} else {
			m.addMdctnStmntDsgAsNdCdbleCncptCdgVrsn("NULL");
		}

		if(medicationstatementdosageasneededcodeableconceptcodingi == medicationstatementdosageasneededcodeableconceptcodinglist.size()-1) {m.addMdctnStmntDsgAsNdCdbleCncptCdgVrsn("]]");}


		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationstatementdosageasneededcodeableconceptcodingi == 0) {m.addMdctnStmntDsgAsNdCdbleCncptCdgCd("[[");}
		if(medicationstatementdosageasneededcodeableconceptcoding.hasCode()) {

			m.addMdctnStmntDsgAsNdCdbleCncptCdgCd(String.valueOf(medicationstatementdosageasneededcodeableconceptcoding.getCode()));
		} else {
			m.addMdctnStmntDsgAsNdCdbleCncptCdgCd("NULL");
		}

		if(medicationstatementdosageasneededcodeableconceptcodingi == medicationstatementdosageasneededcodeableconceptcodinglist.size()-1) {m.addMdctnStmntDsgAsNdCdbleCncptCdgCd("]]");}


		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementdosageasneededcodeableconceptcodingi == 0) {m.addMdctnStmntDsgAsNdCdbleCncptCdgUsrSltd("[[");}
		if(medicationstatementdosageasneededcodeableconceptcoding.hasUserSelected()) {

			m.addMdctnStmntDsgAsNdCdbleCncptCdgUsrSltd(String.valueOf(medicationstatementdosageasneededcodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdctnStmntDsgAsNdCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicationstatementdosageasneededcodeableconceptcodingi == medicationstatementdosageasneededcodeableconceptcodinglist.size()-1) {m.addMdctnStmntDsgAsNdCdbleCncptCdgUsrSltd("]]");}


		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationstatementdosageasneededcodeableconceptcodingi == 0) {m.addMdctnStmntDsgAsNdCdbleCncptCdgSys("[[");}
		if(medicationstatementdosageasneededcodeableconceptcoding.hasSystem()) {

			m.addMdctnStmntDsgAsNdCdbleCncptCdgSys(String.valueOf(medicationstatementdosageasneededcodeableconceptcoding.getSystem()));
		} else {
			m.addMdctnStmntDsgAsNdCdbleCncptCdgSys("NULL");
		}

		if(medicationstatementdosageasneededcodeableconceptcodingi == medicationstatementdosageasneededcodeableconceptcodinglist.size()-1) {m.addMdctnStmntDsgAsNdCdbleCncptCdgSys("]]");}


		 };
		/******************** MdctnStmnt_Dsg_AsNdBooleanTyp ********************************************************************************/
		if(medicationstatementdosage.hasAsNeededBooleanType()) {

			m.addMdctnStmntDsgAsNdBooleanTyp("\""+medicationstatementdosage.getAsNeededBooleanType().getValueAsString()+"\"");
		} else {
			m.addMdctnStmntDsgAsNdBooleanTyp("NULL");
		}


		/******************** medicationstatementdosageroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementdosageroute = medicationstatementdosage.getRoute();

		/******************** MdctnStmnt_Dsg_Route_Txt ********************************************************************************/
		if(medicationstatementdosageroute.hasText()) {

			m.addMdctnStmntDsgRouteTxt(String.valueOf(medicationstatementdosageroute.getText()));
		} else {
			m.addMdctnStmntDsgRouteTxt("NULL");
		}


		/******************** medicationstatementdosageroutecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationstatementdosageroutecodinglist = medicationstatementdosageroute.getCoding();
		for(int medicationstatementdosageroutecodingi = 0; medicationstatementdosageroutecodingi<medicationstatementdosageroutecodinglist.size();medicationstatementdosageroutecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationstatementdosageroutecoding = medicationstatementdosageroutecodinglist.get(medicationstatementdosageroutecodingi);

		/******************** MdctnStmnt_Dsg_Route_Cdg_Dsply ********************************************************************************/
		if(medicationstatementdosageroutecodingi == 0) {m.addMdctnStmntDsgRouteCdgDsply("[[");}
		if(medicationstatementdosageroutecoding.hasDisplay()) {

			m.addMdctnStmntDsgRouteCdgDsply(String.valueOf(medicationstatementdosageroutecoding.getDisplay()));
		} else {
			m.addMdctnStmntDsgRouteCdgDsply("NULL");
		}

		if(medicationstatementdosageroutecodingi == medicationstatementdosageroutecodinglist.size()-1) {m.addMdctnStmntDsgRouteCdgDsply("]]");}


		/******************** MdctnStmnt_Dsg_Route_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementdosageroutecodingi == 0) {m.addMdctnStmntDsgRouteCdgVrsn("[[");}
		if(medicationstatementdosageroutecoding.hasVersion()) {

			m.addMdctnStmntDsgRouteCdgVrsn(String.valueOf(medicationstatementdosageroutecoding.getVersion()));
		} else {
			m.addMdctnStmntDsgRouteCdgVrsn("NULL");
		}

		if(medicationstatementdosageroutecodingi == medicationstatementdosageroutecodinglist.size()-1) {m.addMdctnStmntDsgRouteCdgVrsn("]]");}


		/******************** MdctnStmnt_Dsg_Route_Cdg_Cd ********************************************************************************/
		if(medicationstatementdosageroutecodingi == 0) {m.addMdctnStmntDsgRouteCdgCd("[[");}
		if(medicationstatementdosageroutecoding.hasCode()) {

			m.addMdctnStmntDsgRouteCdgCd(String.valueOf(medicationstatementdosageroutecoding.getCode()));
		} else {
			m.addMdctnStmntDsgRouteCdgCd("NULL");
		}

		if(medicationstatementdosageroutecodingi == medicationstatementdosageroutecodinglist.size()-1) {m.addMdctnStmntDsgRouteCdgCd("]]");}


		/******************** MdctnStmnt_Dsg_Route_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementdosageroutecodingi == 0) {m.addMdctnStmntDsgRouteCdgUsrSltd("[[");}
		if(medicationstatementdosageroutecoding.hasUserSelected()) {

			m.addMdctnStmntDsgRouteCdgUsrSltd(String.valueOf(medicationstatementdosageroutecoding.getUserSelected()));
		} else {
			m.addMdctnStmntDsgRouteCdgUsrSltd("NULL");
		}

		if(medicationstatementdosageroutecodingi == medicationstatementdosageroutecodinglist.size()-1) {m.addMdctnStmntDsgRouteCdgUsrSltd("]]");}


		/******************** MdctnStmnt_Dsg_Route_Cdg_Sys ********************************************************************************/
		if(medicationstatementdosageroutecodingi == 0) {m.addMdctnStmntDsgRouteCdgSys("[[");}
		if(medicationstatementdosageroutecoding.hasSystem()) {

			m.addMdctnStmntDsgRouteCdgSys(String.valueOf(medicationstatementdosageroutecoding.getSystem()));
		} else {
			m.addMdctnStmntDsgRouteCdgSys("NULL");
		}

		if(medicationstatementdosageroutecodingi == medicationstatementdosageroutecodinglist.size()-1) {m.addMdctnStmntDsgRouteCdgSys("]]");}


		 };
		 };
		/******************** MdctnStmnt_MdctnRfrnc ********************************************************************************/
		if(medicationstatement.hasMedicationReference()) {

			if(medicationstatement.getMedicationReference().getReference() != null) {
			m.addMdctnStmntMdctnRfrnc(medicationstatement.getMedicationReference().getReference());
			}
		} else {
			m.addMdctnStmntMdctnRfrnc("NULL");
		}


		/******************** medicationstatementmedicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationstatementmedicationcodeableconcept = medicationstatement.getMedicationCodeableConcept();

		/******************** MdctnStmnt_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(medicationstatementmedicationcodeableconcept.hasText()) {

			m.addMdctnStmntMdctnCdbleCncptTxt(String.valueOf(medicationstatementmedicationcodeableconcept.getText()));
		} else {
			m.addMdctnStmntMdctnCdbleCncptTxt("NULL");
		}


		/******************** medicationstatementmedicationcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationstatementmedicationcodeableconceptcodinglist = medicationstatementmedicationcodeableconcept.getCoding();
		for(int medicationstatementmedicationcodeableconceptcodingi = 0; medicationstatementmedicationcodeableconceptcodingi<medicationstatementmedicationcodeableconceptcodinglist.size();medicationstatementmedicationcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationstatementmedicationcodeableconceptcoding = medicationstatementmedicationcodeableconceptcodinglist.get(medicationstatementmedicationcodeableconceptcodingi);

		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationstatementmedicationcodeableconceptcodingi == 0) {m.addMdctnStmntMdctnCdbleCncptCdgDsply("[");}
		if(medicationstatementmedicationcodeableconceptcoding.hasDisplay()) {

			m.addMdctnStmntMdctnCdbleCncptCdgDsply(String.valueOf(medicationstatementmedicationcodeableconceptcoding.getDisplay()));
		} else {
			m.addMdctnStmntMdctnCdbleCncptCdgDsply("NULL");
		}

		if(medicationstatementmedicationcodeableconceptcodingi == medicationstatementmedicationcodeableconceptcodinglist.size()-1) {m.addMdctnStmntMdctnCdbleCncptCdgDsply("]");}


		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementmedicationcodeableconceptcodingi == 0) {m.addMdctnStmntMdctnCdbleCncptCdgVrsn("[");}
		if(medicationstatementmedicationcodeableconceptcoding.hasVersion()) {

			m.addMdctnStmntMdctnCdbleCncptCdgVrsn(String.valueOf(medicationstatementmedicationcodeableconceptcoding.getVersion()));
		} else {
			m.addMdctnStmntMdctnCdbleCncptCdgVrsn("NULL");
		}

		if(medicationstatementmedicationcodeableconceptcodingi == medicationstatementmedicationcodeableconceptcodinglist.size()-1) {m.addMdctnStmntMdctnCdbleCncptCdgVrsn("]");}


		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationstatementmedicationcodeableconceptcodingi == 0) {m.addMdctnStmntMdctnCdbleCncptCdgCd("[");}
		if(medicationstatementmedicationcodeableconceptcoding.hasCode()) {

			m.addMdctnStmntMdctnCdbleCncptCdgCd(String.valueOf(medicationstatementmedicationcodeableconceptcoding.getCode()));
		} else {
			m.addMdctnStmntMdctnCdbleCncptCdgCd("NULL");
		}

		if(medicationstatementmedicationcodeableconceptcodingi == medicationstatementmedicationcodeableconceptcodinglist.size()-1) {m.addMdctnStmntMdctnCdbleCncptCdgCd("]");}


		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementmedicationcodeableconceptcodingi == 0) {m.addMdctnStmntMdctnCdbleCncptCdgUsrSltd("[");}
		if(medicationstatementmedicationcodeableconceptcoding.hasUserSelected()) {

			m.addMdctnStmntMdctnCdbleCncptCdgUsrSltd(String.valueOf(medicationstatementmedicationcodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdctnStmntMdctnCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicationstatementmedicationcodeableconceptcodingi == medicationstatementmedicationcodeableconceptcodinglist.size()-1) {m.addMdctnStmntMdctnCdbleCncptCdgUsrSltd("]");}


		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationstatementmedicationcodeableconceptcodingi == 0) {m.addMdctnStmntMdctnCdbleCncptCdgSys("[");}
		if(medicationstatementmedicationcodeableconceptcoding.hasSystem()) {

			m.addMdctnStmntMdctnCdbleCncptCdgSys(String.valueOf(medicationstatementmedicationcodeableconceptcoding.getSystem()));
		} else {
			m.addMdctnStmntMdctnCdbleCncptCdgSys("NULL");
		}

		if(medicationstatementmedicationcodeableconceptcodingi == medicationstatementmedicationcodeableconceptcodinglist.size()-1) {m.addMdctnStmntMdctnCdbleCncptCdgSys("]");}


		 };
		/******************** MdctnStmnt_EfctiveDtTimeTyp ********************************************************************************/
		if(medicationstatement.hasEffectiveDateTimeType()) {

			m.addMdctnStmntEfctiveDtTimeTyp("\""+medicationstatement.getEffectiveDateTimeType().getValueAsString()+"\"");
		} else {
			m.addMdctnStmntEfctiveDtTimeTyp("NULL");
		}


		/******************** MdctnStmnt_InfoSrc ********************************************************************************/
		if(medicationstatement.hasInformationSource()) {

			if(medicationstatement.getInformationSource().getReference() != null) {
			m.addMdctnStmntInfoSrc(medicationstatement.getInformationSource().getReference());
			}
		} else {
			m.addMdctnStmntInfoSrc("NULL");
		}


		/******************** MdctnStmnt_DerivedFrom ********************************************************************************/
		if(medicationstatement.hasDerivedFrom()) {

			String  array = "[";
			for(int incr=0; incr<medicationstatement.getDerivedFrom().size(); incr++) {
				array = array + medicationstatement.getDerivedFrom().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnStmntDerivedFrom(array);

		} else {
			m.addMdctnStmntDerivedFrom("NULL");
		}


		/******************** medicationstatementeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationstatementeffectiveperiod = medicationstatement.getEffectivePeriod();

		/******************** MdctnStmnt_EfctivePrd_Strt ********************************************************************************/
		if(medicationstatementeffectiveperiod.hasStart()) {

			m.addMdctnStmntEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationstatementeffectiveperiod.getStart())+"\"");
		} else {
			m.addMdctnStmntEfctivePrdStrt("NULL");
		}


		/******************** MdctnStmnt_EfctivePrd_End ********************************************************************************/
		if(medicationstatementeffectiveperiod.hasEnd()) {

			m.addMdctnStmntEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationstatementeffectiveperiod.getEnd())+"\"");
		} else {
			m.addMdctnStmntEfctivePrdEnd("NULL");
		}


		/******************** MdctnStmnt_PartOf ********************************************************************************/
		if(medicationstatement.hasPartOf()) {

			String  array = "[";
			for(int incr=0; incr<medicationstatement.getPartOf().size(); incr++) {
				array = array + medicationstatement.getPartOf().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnStmntPartOf(array);

		} else {
			m.addMdctnStmntPartOf("NULL");
		}


		/******************** medicationstatementstatusreason ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicationstatementstatusreasonlist = medicationstatement.getStatusReason();
		for(int medicationstatementstatusreasoni = 0; medicationstatementstatusreasoni<medicationstatementstatusreasonlist.size();medicationstatementstatusreasoni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicationstatementstatusreason = medicationstatementstatusreasonlist.get(medicationstatementstatusreasoni);

		/******************** MdctnStmnt_StsRsn_Txt ********************************************************************************/
		if(medicationstatementstatusreasoni == 0) {m.addMdctnStmntStsRsnTxt("[");}
		if(medicationstatementstatusreason.hasText()) {

			m.addMdctnStmntStsRsnTxt(String.valueOf(medicationstatementstatusreason.getText()));
		} else {
			m.addMdctnStmntStsRsnTxt("NULL");
		}

		if(medicationstatementstatusreasoni == medicationstatementstatusreasonlist.size()-1) {m.addMdctnStmntStsRsnTxt("]");}


		/******************** medicationstatementstatusreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationstatementstatusreasoncodinglist = medicationstatementstatusreason.getCoding();
		for(int medicationstatementstatusreasoncodingi = 0; medicationstatementstatusreasoncodingi<medicationstatementstatusreasoncodinglist.size();medicationstatementstatusreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationstatementstatusreasoncoding = medicationstatementstatusreasoncodinglist.get(medicationstatementstatusreasoncodingi);

		/******************** MdctnStmnt_StsRsn_Cdg_Dsply ********************************************************************************/
		if(medicationstatementstatusreasoncodingi == 0) {m.addMdctnStmntStsRsnCdgDsply("[[");}
		if(medicationstatementstatusreasoncoding.hasDisplay()) {

			m.addMdctnStmntStsRsnCdgDsply(String.valueOf(medicationstatementstatusreasoncoding.getDisplay()));
		} else {
			m.addMdctnStmntStsRsnCdgDsply("NULL");
		}

		if(medicationstatementstatusreasoncodingi == medicationstatementstatusreasoncodinglist.size()-1) {m.addMdctnStmntStsRsnCdgDsply("]]");}


		/******************** MdctnStmnt_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(medicationstatementstatusreasoncodingi == 0) {m.addMdctnStmntStsRsnCdgVrsn("[[");}
		if(medicationstatementstatusreasoncoding.hasVersion()) {

			m.addMdctnStmntStsRsnCdgVrsn(String.valueOf(medicationstatementstatusreasoncoding.getVersion()));
		} else {
			m.addMdctnStmntStsRsnCdgVrsn("NULL");
		}

		if(medicationstatementstatusreasoncodingi == medicationstatementstatusreasoncodinglist.size()-1) {m.addMdctnStmntStsRsnCdgVrsn("]]");}


		/******************** MdctnStmnt_StsRsn_Cdg_Cd ********************************************************************************/
		if(medicationstatementstatusreasoncodingi == 0) {m.addMdctnStmntStsRsnCdgCd("[[");}
		if(medicationstatementstatusreasoncoding.hasCode()) {

			m.addMdctnStmntStsRsnCdgCd(String.valueOf(medicationstatementstatusreasoncoding.getCode()));
		} else {
			m.addMdctnStmntStsRsnCdgCd("NULL");
		}

		if(medicationstatementstatusreasoncodingi == medicationstatementstatusreasoncodinglist.size()-1) {m.addMdctnStmntStsRsnCdgCd("]]");}


		/******************** MdctnStmnt_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(medicationstatementstatusreasoncodingi == 0) {m.addMdctnStmntStsRsnCdgUsrSltd("[[");}
		if(medicationstatementstatusreasoncoding.hasUserSelected()) {

			m.addMdctnStmntStsRsnCdgUsrSltd(String.valueOf(medicationstatementstatusreasoncoding.getUserSelected()));
		} else {
			m.addMdctnStmntStsRsnCdgUsrSltd("NULL");
		}

		if(medicationstatementstatusreasoncodingi == medicationstatementstatusreasoncodinglist.size()-1) {m.addMdctnStmntStsRsnCdgUsrSltd("]]");}


		/******************** MdctnStmnt_StsRsn_Cdg_Sys ********************************************************************************/
		if(medicationstatementstatusreasoncodingi == 0) {m.addMdctnStmntStsRsnCdgSys("[[");}
		if(medicationstatementstatusreasoncoding.hasSystem()) {

			m.addMdctnStmntStsRsnCdgSys(String.valueOf(medicationstatementstatusreasoncoding.getSystem()));
		} else {
			m.addMdctnStmntStsRsnCdgSys("NULL");
		}

		if(medicationstatementstatusreasoncodingi == medicationstatementstatusreasoncodinglist.size()-1) {m.addMdctnStmntStsRsnCdgSys("]]");}


		 };
		 };
		return m;
	}
}
