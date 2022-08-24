package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationDispense;
public class MedicationDispenseBidirectionalConversion 
{
	public MedicationDispense MedicationDispenses(org.hl7.fhir.r4.model.MedicationDispense medicationdispense) throws ParseException
	{
		 main.java.com.campfhir.model.MedicationDispense m = new  main.java.com.campfhir.model.MedicationDispense();

		/******************** id ********************************************************************************/
		m.setId(medicationdispense.getIdElement().getIdPart());

		/******************** MdctnDispns_Lctn ********************************************************************************/
		if(medicationdispense.hasLocation()) {

			if(medicationdispense.getLocation().getReference() != null) {
			m.addMdctnDispnsLctn(medicationdispense.getLocation().getReference());
			}
		} else {
			m.addMdctnDispnsLctn("NULL");
		}


		/******************** MdctnDispns_Cntxt ********************************************************************************/
		if(medicationdispense.hasContext()) {

			if(medicationdispense.getContext().getReference() != null) {
			m.addMdctnDispnsCntxt(medicationdispense.getContext().getReference());
			}
		} else {
			m.addMdctnDispnsCntxt("NULL");
		}


		/******************** medicationdispensetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensetype = medicationdispense.getType();

		/******************** MdctnDispns_Typ_Txt ********************************************************************************/
		if(medicationdispensetype.hasText()) {

			m.addMdctnDispnsTypTxt(String.valueOf(medicationdispensetype.getText()));
		} else {
			m.addMdctnDispnsTypTxt("NULL");
		}


		/******************** medicationdispensetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationdispensetypecodinglist = medicationdispensetype.getCoding();
		for(int medicationdispensetypecodingi = 0; medicationdispensetypecodingi<medicationdispensetypecodinglist.size();medicationdispensetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationdispensetypecoding = medicationdispensetypecodinglist.get(medicationdispensetypecodingi);

		/******************** MdctnDispns_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationdispensetypecodingi == 0) {m.addMdctnDispnsTypCdgDsply("[");}
		if(medicationdispensetypecoding.hasDisplay()) {

			m.addMdctnDispnsTypCdgDsply(String.valueOf(medicationdispensetypecoding.getDisplay()));
		} else {
			m.addMdctnDispnsTypCdgDsply("NULL");
		}

		if(medicationdispensetypecodingi == medicationdispensetypecodinglist.size()-1) {m.addMdctnDispnsTypCdgDsply("]");}


		/******************** MdctnDispns_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensetypecodingi == 0) {m.addMdctnDispnsTypCdgVrsn("[");}
		if(medicationdispensetypecoding.hasVersion()) {

			m.addMdctnDispnsTypCdgVrsn(String.valueOf(medicationdispensetypecoding.getVersion()));
		} else {
			m.addMdctnDispnsTypCdgVrsn("NULL");
		}

		if(medicationdispensetypecodingi == medicationdispensetypecodinglist.size()-1) {m.addMdctnDispnsTypCdgVrsn("]");}


		/******************** MdctnDispns_Typ_Cdg_Cd ********************************************************************************/
		if(medicationdispensetypecodingi == 0) {m.addMdctnDispnsTypCdgCd("[");}
		if(medicationdispensetypecoding.hasCode()) {

			m.addMdctnDispnsTypCdgCd(String.valueOf(medicationdispensetypecoding.getCode()));
		} else {
			m.addMdctnDispnsTypCdgCd("NULL");
		}

		if(medicationdispensetypecodingi == medicationdispensetypecodinglist.size()-1) {m.addMdctnDispnsTypCdgCd("]");}


		/******************** MdctnDispns_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensetypecodingi == 0) {m.addMdctnDispnsTypCdgUsrSltd("[");}
		if(medicationdispensetypecoding.hasUserSelected()) {

			m.addMdctnDispnsTypCdgUsrSltd(String.valueOf(medicationdispensetypecoding.getUserSelected()));
		} else {
			m.addMdctnDispnsTypCdgUsrSltd("NULL");
		}

		if(medicationdispensetypecodingi == medicationdispensetypecodinglist.size()-1) {m.addMdctnDispnsTypCdgUsrSltd("]");}


		/******************** MdctnDispns_Typ_Cdg_Sys ********************************************************************************/
		if(medicationdispensetypecodingi == 0) {m.addMdctnDispnsTypCdgSys("[");}
		if(medicationdispensetypecoding.hasSystem()) {

			m.addMdctnDispnsTypCdgSys(String.valueOf(medicationdispensetypecoding.getSystem()));
		} else {
			m.addMdctnDispnsTypCdgSys("NULL");
		}

		if(medicationdispensetypecodingi == medicationdispensetypecodinglist.size()-1) {m.addMdctnDispnsTypCdgSys("]");}


		 };
		/******************** MdctnDispns_Sbjct ********************************************************************************/
		if(medicationdispense.hasSubject()) {

			if(medicationdispense.getSubject().getReference() != null) {
			m.addMdctnDispnsSbjct(medicationdispense.getSubject().getReference());
			}
		} else {
			m.addMdctnDispnsSbjct("NULL");
		}


		/******************** medicationdispensestatus ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationDispense.MedicationDispenseStatus medicationdispensestatus = medicationdispense.getStatus();
		if(medicationdispensestatus!=null) {
			m.addMdctnDispnsSts(medicationdispensestatus.toCode());
		} else {
			m.addMdctnDispnsSts("NULL");
		}

		/******************** medicationdispensenote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> medicationdispensenotelist = medicationdispense.getNote();
		for(int medicationdispensenotei = 0; medicationdispensenotei<medicationdispensenotelist.size();medicationdispensenotei++ ) {
		org.hl7.fhir.r4.model.Annotation  medicationdispensenote = medicationdispensenotelist.get(medicationdispensenotei);

		/******************** MdctnDispns_Nt_Time ********************************************************************************/
		if(medicationdispensenotei == 0) {m.addMdctnDispnsNtTime("[");}
		if(medicationdispensenote.hasTime()) {

			m.addMdctnDispnsNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationdispensenote.getTime())+"\"");
		} else {
			m.addMdctnDispnsNtTime("NULL");
		}

		if(medicationdispensenotei == medicationdispensenotelist.size()-1) {m.addMdctnDispnsNtTime("]");}


		/******************** MdctnDispns_Nt_AthrRfrnc ********************************************************************************/
		if(medicationdispensenotei == 0) {m.addMdctnDispnsNtAthrRfrnc("[");}
		if(medicationdispensenote.hasAuthorReference()) {

			if(medicationdispensenote.getAuthorReference().getReference() != null) {
			m.addMdctnDispnsNtAthrRfrnc(medicationdispensenote.getAuthorReference().getReference());
			}
		} else {
			m.addMdctnDispnsNtAthrRfrnc("NULL");
		}

		if(medicationdispensenotei == medicationdispensenotelist.size()-1) {m.addMdctnDispnsNtAthrRfrnc("]");}


		/******************** MdctnDispns_Nt_Txt ********************************************************************************/
		if(medicationdispensenotei == 0) {m.addMdctnDispnsNtTxt("[");}
		if(medicationdispensenote.hasText()) {

			m.addMdctnDispnsNtTxt(String.valueOf(medicationdispensenote.getText()));
		} else {
			m.addMdctnDispnsNtTxt("NULL");
		}

		if(medicationdispensenotei == medicationdispensenotelist.size()-1) {m.addMdctnDispnsNtTxt("]");}


		/******************** MdctnDispns_Nt_AthrStrgTyp ********************************************************************************/
		if(medicationdispensenotei == 0) {m.addMdctnDispnsNtAthrStrgTyp("[");}
		if(medicationdispensenote.hasAuthorStringType()) {

			m.addMdctnDispnsNtAthrStrgTyp("\""+medicationdispensenote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			m.addMdctnDispnsNtAthrStrgTyp("NULL");
		}

		if(medicationdispensenotei == medicationdispensenotelist.size()-1) {m.addMdctnDispnsNtAthrStrgTyp("]");}


		 };
		/******************** medicationdispenseidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> medicationdispenseidentifierlist = medicationdispense.getIdentifier();
		for(int medicationdispenseidentifieri = 0; medicationdispenseidentifieri<medicationdispenseidentifierlist.size();medicationdispenseidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  medicationdispenseidentifier = medicationdispenseidentifierlist.get(medicationdispenseidentifieri);

		/******************** MdctnDispns_Id_Vl ********************************************************************************/
		if(medicationdispenseidentifieri == 0) {m.addMdctnDispnsIdVl("[");}
		if(medicationdispenseidentifier.hasValue()) {

			m.addMdctnDispnsIdVl(String.valueOf(medicationdispenseidentifier.getValue()));
		} else {
			m.addMdctnDispnsIdVl("NULL");
		}

		if(medicationdispenseidentifieri == medicationdispenseidentifierlist.size()-1) {m.addMdctnDispnsIdVl("]");}


		/******************** medicationdispenseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispenseidentifiertype = medicationdispenseidentifier.getType();

		/******************** MdctnDispns_Id_Typ_Txt ********************************************************************************/
		if(medicationdispenseidentifieri == 0) {m.addMdctnDispnsIdTypTxt("[");}
		if(medicationdispenseidentifiertype.hasText()) {

			m.addMdctnDispnsIdTypTxt(String.valueOf(medicationdispenseidentifiertype.getText()));
		} else {
			m.addMdctnDispnsIdTypTxt("NULL");
		}

		if(medicationdispenseidentifieri == medicationdispenseidentifierlist.size()-1) {m.addMdctnDispnsIdTypTxt("]");}


		/******************** medicationdispenseidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationdispenseidentifiertypecodinglist = medicationdispenseidentifiertype.getCoding();
		for(int medicationdispenseidentifiertypecodingi = 0; medicationdispenseidentifiertypecodingi<medicationdispenseidentifiertypecodinglist.size();medicationdispenseidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationdispenseidentifiertypecoding = medicationdispenseidentifiertypecodinglist.get(medicationdispenseidentifiertypecodingi);

		/******************** MdctnDispns_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationdispenseidentifiertypecodingi == 0) {m.addMdctnDispnsIdTypCdgDsply("[[");}
		if(medicationdispenseidentifiertypecoding.hasDisplay()) {

			m.addMdctnDispnsIdTypCdgDsply(String.valueOf(medicationdispenseidentifiertypecoding.getDisplay()));
		} else {
			m.addMdctnDispnsIdTypCdgDsply("NULL");
		}

		if(medicationdispenseidentifiertypecodingi == medicationdispenseidentifiertypecodinglist.size()-1) {m.addMdctnDispnsIdTypCdgDsply("]]");}


		/******************** MdctnDispns_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationdispenseidentifiertypecodingi == 0) {m.addMdctnDispnsIdTypCdgVrsn("[[");}
		if(medicationdispenseidentifiertypecoding.hasVersion()) {

			m.addMdctnDispnsIdTypCdgVrsn(String.valueOf(medicationdispenseidentifiertypecoding.getVersion()));
		} else {
			m.addMdctnDispnsIdTypCdgVrsn("NULL");
		}

		if(medicationdispenseidentifiertypecodingi == medicationdispenseidentifiertypecodinglist.size()-1) {m.addMdctnDispnsIdTypCdgVrsn("]]");}


		/******************** MdctnDispns_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicationdispenseidentifiertypecodingi == 0) {m.addMdctnDispnsIdTypCdgCd("[[");}
		if(medicationdispenseidentifiertypecoding.hasCode()) {

			m.addMdctnDispnsIdTypCdgCd(String.valueOf(medicationdispenseidentifiertypecoding.getCode()));
		} else {
			m.addMdctnDispnsIdTypCdgCd("NULL");
		}

		if(medicationdispenseidentifiertypecodingi == medicationdispenseidentifiertypecodinglist.size()-1) {m.addMdctnDispnsIdTypCdgCd("]]");}


		/******************** MdctnDispns_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispenseidentifiertypecodingi == 0) {m.addMdctnDispnsIdTypCdgUsrSltd("[[");}
		if(medicationdispenseidentifiertypecoding.hasUserSelected()) {

			m.addMdctnDispnsIdTypCdgUsrSltd(String.valueOf(medicationdispenseidentifiertypecoding.getUserSelected()));
		} else {
			m.addMdctnDispnsIdTypCdgUsrSltd("NULL");
		}

		if(medicationdispenseidentifiertypecodingi == medicationdispenseidentifiertypecodinglist.size()-1) {m.addMdctnDispnsIdTypCdgUsrSltd("]]");}


		/******************** MdctnDispns_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicationdispenseidentifiertypecodingi == 0) {m.addMdctnDispnsIdTypCdgSys("[[");}
		if(medicationdispenseidentifiertypecoding.hasSystem()) {

			m.addMdctnDispnsIdTypCdgSys(String.valueOf(medicationdispenseidentifiertypecoding.getSystem()));
		} else {
			m.addMdctnDispnsIdTypCdgSys("NULL");
		}

		if(medicationdispenseidentifiertypecodingi == medicationdispenseidentifiertypecodinglist.size()-1) {m.addMdctnDispnsIdTypCdgSys("]]");}


		 };
		/******************** medicationdispenseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationdispenseidentifierperiod = medicationdispenseidentifier.getPeriod();

		/******************** MdctnDispns_Id_Prd_Strt ********************************************************************************/
		if(medicationdispenseidentifieri == 0) {m.addMdctnDispnsIdPrdStrt("[");}
		if(medicationdispenseidentifierperiod.hasStart()) {

			m.addMdctnDispnsIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationdispenseidentifierperiod.getStart())+"\"");
		} else {
			m.addMdctnDispnsIdPrdStrt("NULL");
		}

		if(medicationdispenseidentifieri == medicationdispenseidentifierlist.size()-1) {m.addMdctnDispnsIdPrdStrt("]");}


		/******************** MdctnDispns_Id_Prd_End ********************************************************************************/
		if(medicationdispenseidentifieri == 0) {m.addMdctnDispnsIdPrdEnd("[");}
		if(medicationdispenseidentifierperiod.hasEnd()) {

			m.addMdctnDispnsIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationdispenseidentifierperiod.getEnd())+"\"");
		} else {
			m.addMdctnDispnsIdPrdEnd("NULL");
		}

		if(medicationdispenseidentifieri == medicationdispenseidentifierlist.size()-1) {m.addMdctnDispnsIdPrdEnd("]");}


		/******************** medicationdispenseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicationdispenseidentifieruse = medicationdispenseidentifier.getUse();
		if(medicationdispenseidentifieruse!=null) {
		if(medicationdispenseidentifieri == 0) {

		m.addMdctnDispnsIdUse("[");		}
			m.addMdctnDispnsIdUse(medicationdispenseidentifieruse.toCode());
		if(medicationdispenseidentifieri == medicationdispenseidentifierlist.size()-1) {

		m.addMdctnDispnsIdUse("]");		}

		} else {
			m.addMdctnDispnsIdUse("NULL");
		}

		/******************** MdctnDispns_Id_Assigner ********************************************************************************/
		if(medicationdispenseidentifieri == 0) {m.addMdctnDispnsIdAssigner("[");}
		if(medicationdispenseidentifier.hasAssigner()) {

			if(medicationdispenseidentifier.getAssigner().getReference() != null) {
			m.addMdctnDispnsIdAssigner(medicationdispenseidentifier.getAssigner().getReference());
			}
		} else {
			m.addMdctnDispnsIdAssigner("NULL");
		}

		if(medicationdispenseidentifieri == medicationdispenseidentifierlist.size()-1) {m.addMdctnDispnsIdAssigner("]");}


		/******************** MdctnDispns_Id_Sys ********************************************************************************/
		if(medicationdispenseidentifieri == 0) {m.addMdctnDispnsIdSys("[");}
		if(medicationdispenseidentifier.hasSystem()) {

			m.addMdctnDispnsIdSys(String.valueOf(medicationdispenseidentifier.getSystem()));
		} else {
			m.addMdctnDispnsIdSys("NULL");
		}

		if(medicationdispenseidentifieri == medicationdispenseidentifierlist.size()-1) {m.addMdctnDispnsIdSys("]");}


		 };
		/******************** medicationdispensecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensecategory = medicationdispense.getCategory();

		/******************** MdctnDispns_Ctgry_Txt ********************************************************************************/
		if(medicationdispensecategory.hasText()) {

			m.addMdctnDispnsCtgryTxt(String.valueOf(medicationdispensecategory.getText()));
		} else {
			m.addMdctnDispnsCtgryTxt("NULL");
		}


		/******************** medicationdispensecategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationdispensecategorycodinglist = medicationdispensecategory.getCoding();
		for(int medicationdispensecategorycodingi = 0; medicationdispensecategorycodingi<medicationdispensecategorycodinglist.size();medicationdispensecategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationdispensecategorycoding = medicationdispensecategorycodinglist.get(medicationdispensecategorycodingi);

		/******************** MdctnDispns_Ctgry_Cdg_Dsply ********************************************************************************/
		if(medicationdispensecategorycodingi == 0) {m.addMdctnDispnsCtgryCdgDsply("[");}
		if(medicationdispensecategorycoding.hasDisplay()) {

			m.addMdctnDispnsCtgryCdgDsply(String.valueOf(medicationdispensecategorycoding.getDisplay()));
		} else {
			m.addMdctnDispnsCtgryCdgDsply("NULL");
		}

		if(medicationdispensecategorycodingi == medicationdispensecategorycodinglist.size()-1) {m.addMdctnDispnsCtgryCdgDsply("]");}


		/******************** MdctnDispns_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensecategorycodingi == 0) {m.addMdctnDispnsCtgryCdgVrsn("[");}
		if(medicationdispensecategorycoding.hasVersion()) {

			m.addMdctnDispnsCtgryCdgVrsn(String.valueOf(medicationdispensecategorycoding.getVersion()));
		} else {
			m.addMdctnDispnsCtgryCdgVrsn("NULL");
		}

		if(medicationdispensecategorycodingi == medicationdispensecategorycodinglist.size()-1) {m.addMdctnDispnsCtgryCdgVrsn("]");}


		/******************** MdctnDispns_Ctgry_Cdg_Cd ********************************************************************************/
		if(medicationdispensecategorycodingi == 0) {m.addMdctnDispnsCtgryCdgCd("[");}
		if(medicationdispensecategorycoding.hasCode()) {

			m.addMdctnDispnsCtgryCdgCd(String.valueOf(medicationdispensecategorycoding.getCode()));
		} else {
			m.addMdctnDispnsCtgryCdgCd("NULL");
		}

		if(medicationdispensecategorycodingi == medicationdispensecategorycodinglist.size()-1) {m.addMdctnDispnsCtgryCdgCd("]");}


		/******************** MdctnDispns_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensecategorycodingi == 0) {m.addMdctnDispnsCtgryCdgUsrSltd("[");}
		if(medicationdispensecategorycoding.hasUserSelected()) {

			m.addMdctnDispnsCtgryCdgUsrSltd(String.valueOf(medicationdispensecategorycoding.getUserSelected()));
		} else {
			m.addMdctnDispnsCtgryCdgUsrSltd("NULL");
		}

		if(medicationdispensecategorycodingi == medicationdispensecategorycodinglist.size()-1) {m.addMdctnDispnsCtgryCdgUsrSltd("]");}


		/******************** MdctnDispns_Ctgry_Cdg_Sys ********************************************************************************/
		if(medicationdispensecategorycodingi == 0) {m.addMdctnDispnsCtgryCdgSys("[");}
		if(medicationdispensecategorycoding.hasSystem()) {

			m.addMdctnDispnsCtgryCdgSys(String.valueOf(medicationdispensecategorycoding.getSystem()));
		} else {
			m.addMdctnDispnsCtgryCdgSys("NULL");
		}

		if(medicationdispensecategorycodingi == medicationdispensecategorycodinglist.size()-1) {m.addMdctnDispnsCtgryCdgSys("]");}


		 };
		/******************** MdctnDispns_MdctnRfrnc ********************************************************************************/
		if(medicationdispense.hasMedicationReference()) {

			if(medicationdispense.getMedicationReference().getReference() != null) {
			m.addMdctnDispnsMdctnRfrnc(medicationdispense.getMedicationReference().getReference());
			}
		} else {
			m.addMdctnDispnsMdctnRfrnc("NULL");
		}


		/******************** medicationdispensemedicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensemedicationcodeableconcept = medicationdispense.getMedicationCodeableConcept();

		/******************** MdctnDispns_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(medicationdispensemedicationcodeableconcept.hasText()) {

			m.addMdctnDispnsMdctnCdbleCncptTxt(String.valueOf(medicationdispensemedicationcodeableconcept.getText()));
		} else {
			m.addMdctnDispnsMdctnCdbleCncptTxt("NULL");
		}


		/******************** medicationdispensemedicationcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationdispensemedicationcodeableconceptcodinglist = medicationdispensemedicationcodeableconcept.getCoding();
		for(int medicationdispensemedicationcodeableconceptcodingi = 0; medicationdispensemedicationcodeableconceptcodingi<medicationdispensemedicationcodeableconceptcodinglist.size();medicationdispensemedicationcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationdispensemedicationcodeableconceptcoding = medicationdispensemedicationcodeableconceptcodinglist.get(medicationdispensemedicationcodeableconceptcodingi);

		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationdispensemedicationcodeableconceptcodingi == 0) {m.addMdctnDispnsMdctnCdbleCncptCdgDsply("[");}
		if(medicationdispensemedicationcodeableconceptcoding.hasDisplay()) {

			m.addMdctnDispnsMdctnCdbleCncptCdgDsply(String.valueOf(medicationdispensemedicationcodeableconceptcoding.getDisplay()));
		} else {
			m.addMdctnDispnsMdctnCdbleCncptCdgDsply("NULL");
		}

		if(medicationdispensemedicationcodeableconceptcodingi == medicationdispensemedicationcodeableconceptcodinglist.size()-1) {m.addMdctnDispnsMdctnCdbleCncptCdgDsply("]");}


		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensemedicationcodeableconceptcodingi == 0) {m.addMdctnDispnsMdctnCdbleCncptCdgVrsn("[");}
		if(medicationdispensemedicationcodeableconceptcoding.hasVersion()) {

			m.addMdctnDispnsMdctnCdbleCncptCdgVrsn(String.valueOf(medicationdispensemedicationcodeableconceptcoding.getVersion()));
		} else {
			m.addMdctnDispnsMdctnCdbleCncptCdgVrsn("NULL");
		}

		if(medicationdispensemedicationcodeableconceptcodingi == medicationdispensemedicationcodeableconceptcodinglist.size()-1) {m.addMdctnDispnsMdctnCdbleCncptCdgVrsn("]");}


		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationdispensemedicationcodeableconceptcodingi == 0) {m.addMdctnDispnsMdctnCdbleCncptCdgCd("[");}
		if(medicationdispensemedicationcodeableconceptcoding.hasCode()) {

			m.addMdctnDispnsMdctnCdbleCncptCdgCd(String.valueOf(medicationdispensemedicationcodeableconceptcoding.getCode()));
		} else {
			m.addMdctnDispnsMdctnCdbleCncptCdgCd("NULL");
		}

		if(medicationdispensemedicationcodeableconceptcodingi == medicationdispensemedicationcodeableconceptcodinglist.size()-1) {m.addMdctnDispnsMdctnCdbleCncptCdgCd("]");}


		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensemedicationcodeableconceptcodingi == 0) {m.addMdctnDispnsMdctnCdbleCncptCdgUsrSltd("[");}
		if(medicationdispensemedicationcodeableconceptcoding.hasUserSelected()) {

			m.addMdctnDispnsMdctnCdbleCncptCdgUsrSltd(String.valueOf(medicationdispensemedicationcodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdctnDispnsMdctnCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicationdispensemedicationcodeableconceptcodingi == medicationdispensemedicationcodeableconceptcodinglist.size()-1) {m.addMdctnDispnsMdctnCdbleCncptCdgUsrSltd("]");}


		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationdispensemedicationcodeableconceptcodingi == 0) {m.addMdctnDispnsMdctnCdbleCncptCdgSys("[");}
		if(medicationdispensemedicationcodeableconceptcoding.hasSystem()) {

			m.addMdctnDispnsMdctnCdbleCncptCdgSys(String.valueOf(medicationdispensemedicationcodeableconceptcoding.getSystem()));
		} else {
			m.addMdctnDispnsMdctnCdbleCncptCdgSys("NULL");
		}

		if(medicationdispensemedicationcodeableconceptcodingi == medicationdispensemedicationcodeableconceptcodinglist.size()-1) {m.addMdctnDispnsMdctnCdbleCncptCdgSys("]");}


		 };
		/******************** MdctnDispns_SprtingInfo ********************************************************************************/
		if(medicationdispense.hasSupportingInformation()) {

			String  array = "[";
			for(int incr=0; incr<medicationdispense.getSupportingInformation().size(); incr++) {
				array = array + medicationdispense.getSupportingInformation().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnDispnsSprtingInfo(array);

		} else {
			m.addMdctnDispnsSprtingInfo("NULL");
		}


		/******************** medicationdispenseperformer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicationDispense.MedicationDispensePerformerComponent> medicationdispenseperformerlist = medicationdispense.getPerformer();
		for(int medicationdispenseperformeri = 0; medicationdispenseperformeri<medicationdispenseperformerlist.size();medicationdispenseperformeri++ ) {
		org.hl7.fhir.r4.model.MedicationDispense.MedicationDispensePerformerComponent  medicationdispenseperformer = medicationdispenseperformerlist.get(medicationdispenseperformeri);

		/******************** medicationdispenseperformerfunction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispenseperformerfunction = medicationdispenseperformer.getFunction();

		/******************** MdctnDispns_Prfrmr_Function_Txt ********************************************************************************/
		if(medicationdispenseperformeri == 0) {m.addMdctnDispnsPrfrmrFunctionTxt("[");}
		if(medicationdispenseperformerfunction.hasText()) {

			m.addMdctnDispnsPrfrmrFunctionTxt(String.valueOf(medicationdispenseperformerfunction.getText()));
		} else {
			m.addMdctnDispnsPrfrmrFunctionTxt("NULL");
		}

		if(medicationdispenseperformeri == medicationdispenseperformerlist.size()-1) {m.addMdctnDispnsPrfrmrFunctionTxt("]");}


		/******************** medicationdispenseperformerfunctioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationdispenseperformerfunctioncodinglist = medicationdispenseperformerfunction.getCoding();
		for(int medicationdispenseperformerfunctioncodingi = 0; medicationdispenseperformerfunctioncodingi<medicationdispenseperformerfunctioncodinglist.size();medicationdispenseperformerfunctioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationdispenseperformerfunctioncoding = medicationdispenseperformerfunctioncodinglist.get(medicationdispenseperformerfunctioncodingi);

		/******************** MdctnDispns_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(medicationdispenseperformerfunctioncodingi == 0) {m.addMdctnDispnsPrfrmrFunctionCdgDsply("[[");}
		if(medicationdispenseperformerfunctioncoding.hasDisplay()) {

			m.addMdctnDispnsPrfrmrFunctionCdgDsply(String.valueOf(medicationdispenseperformerfunctioncoding.getDisplay()));
		} else {
			m.addMdctnDispnsPrfrmrFunctionCdgDsply("NULL");
		}

		if(medicationdispenseperformerfunctioncodingi == medicationdispenseperformerfunctioncodinglist.size()-1) {m.addMdctnDispnsPrfrmrFunctionCdgDsply("]]");}


		/******************** MdctnDispns_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(medicationdispenseperformerfunctioncodingi == 0) {m.addMdctnDispnsPrfrmrFunctionCdgVrsn("[[");}
		if(medicationdispenseperformerfunctioncoding.hasVersion()) {

			m.addMdctnDispnsPrfrmrFunctionCdgVrsn(String.valueOf(medicationdispenseperformerfunctioncoding.getVersion()));
		} else {
			m.addMdctnDispnsPrfrmrFunctionCdgVrsn("NULL");
		}

		if(medicationdispenseperformerfunctioncodingi == medicationdispenseperformerfunctioncodinglist.size()-1) {m.addMdctnDispnsPrfrmrFunctionCdgVrsn("]]");}


		/******************** MdctnDispns_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(medicationdispenseperformerfunctioncodingi == 0) {m.addMdctnDispnsPrfrmrFunctionCdgCd("[[");}
		if(medicationdispenseperformerfunctioncoding.hasCode()) {

			m.addMdctnDispnsPrfrmrFunctionCdgCd(String.valueOf(medicationdispenseperformerfunctioncoding.getCode()));
		} else {
			m.addMdctnDispnsPrfrmrFunctionCdgCd("NULL");
		}

		if(medicationdispenseperformerfunctioncodingi == medicationdispenseperformerfunctioncodinglist.size()-1) {m.addMdctnDispnsPrfrmrFunctionCdgCd("]]");}


		/******************** MdctnDispns_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispenseperformerfunctioncodingi == 0) {m.addMdctnDispnsPrfrmrFunctionCdgUsrSltd("[[");}
		if(medicationdispenseperformerfunctioncoding.hasUserSelected()) {

			m.addMdctnDispnsPrfrmrFunctionCdgUsrSltd(String.valueOf(medicationdispenseperformerfunctioncoding.getUserSelected()));
		} else {
			m.addMdctnDispnsPrfrmrFunctionCdgUsrSltd("NULL");
		}

		if(medicationdispenseperformerfunctioncodingi == medicationdispenseperformerfunctioncodinglist.size()-1) {m.addMdctnDispnsPrfrmrFunctionCdgUsrSltd("]]");}


		/******************** MdctnDispns_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(medicationdispenseperformerfunctioncodingi == 0) {m.addMdctnDispnsPrfrmrFunctionCdgSys("[[");}
		if(medicationdispenseperformerfunctioncoding.hasSystem()) {

			m.addMdctnDispnsPrfrmrFunctionCdgSys(String.valueOf(medicationdispenseperformerfunctioncoding.getSystem()));
		} else {
			m.addMdctnDispnsPrfrmrFunctionCdgSys("NULL");
		}

		if(medicationdispenseperformerfunctioncodingi == medicationdispenseperformerfunctioncodinglist.size()-1) {m.addMdctnDispnsPrfrmrFunctionCdgSys("]]");}


		 };
		/******************** MdctnDispns_Prfrmr_Actor ********************************************************************************/
		if(medicationdispenseperformeri == 0) {m.addMdctnDispnsPrfrmrActor("[");}
		if(medicationdispenseperformer.hasActor()) {

			if(medicationdispenseperformer.getActor().getReference() != null) {
			m.addMdctnDispnsPrfrmrActor(medicationdispenseperformer.getActor().getReference());
			}
		} else {
			m.addMdctnDispnsPrfrmrActor("NULL");
		}

		if(medicationdispenseperformeri == medicationdispenseperformerlist.size()-1) {m.addMdctnDispnsPrfrmrActor("]");}


		 };
		/******************** medicationdispensedosageinstruction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Dosage> medicationdispensedosageinstructionlist = medicationdispense.getDosageInstruction();
		for(int medicationdispensedosageinstructioni = 0; medicationdispensedosageinstructioni<medicationdispensedosageinstructionlist.size();medicationdispensedosageinstructioni++ ) {
		org.hl7.fhir.r4.model.Dosage  medicationdispensedosageinstruction = medicationdispensedosageinstructionlist.get(medicationdispensedosageinstructioni);

		/******************** medicationdispensedosageinstructionmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructionmethod = medicationdispensedosageinstruction.getMethod();

		/******************** MdctnDispns_DsgInstrctn_Mthd_Txt ********************************************************************************/
		if(medicationdispensedosageinstructioni == 0) {m.addMdctnDispnsDsgInstrctnMthdTxt("[");}
		if(medicationdispensedosageinstructionmethod.hasText()) {

			m.addMdctnDispnsDsgInstrctnMthdTxt(String.valueOf(medicationdispensedosageinstructionmethod.getText()));
		} else {
			m.addMdctnDispnsDsgInstrctnMthdTxt("NULL");
		}

		if(medicationdispensedosageinstructioni == medicationdispensedosageinstructionlist.size()-1) {m.addMdctnDispnsDsgInstrctnMthdTxt("]");}


		/******************** medicationdispensedosageinstructionmethodcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationdispensedosageinstructionmethodcodinglist = medicationdispensedosageinstructionmethod.getCoding();
		for(int medicationdispensedosageinstructionmethodcodingi = 0; medicationdispensedosageinstructionmethodcodingi<medicationdispensedosageinstructionmethodcodinglist.size();medicationdispensedosageinstructionmethodcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationdispensedosageinstructionmethodcoding = medicationdispensedosageinstructionmethodcodinglist.get(medicationdispensedosageinstructionmethodcodingi);

		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_Dsply ********************************************************************************/
		if(medicationdispensedosageinstructionmethodcodingi == 0) {m.addMdctnDispnsDsgInstrctnMthdCdgDsply("[[");}
		if(medicationdispensedosageinstructionmethodcoding.hasDisplay()) {

			m.addMdctnDispnsDsgInstrctnMthdCdgDsply(String.valueOf(medicationdispensedosageinstructionmethodcoding.getDisplay()));
		} else {
			m.addMdctnDispnsDsgInstrctnMthdCdgDsply("NULL");
		}

		if(medicationdispensedosageinstructionmethodcodingi == medicationdispensedosageinstructionmethodcodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnMthdCdgDsply("]]");}


		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensedosageinstructionmethodcodingi == 0) {m.addMdctnDispnsDsgInstrctnMthdCdgVrsn("[[");}
		if(medicationdispensedosageinstructionmethodcoding.hasVersion()) {

			m.addMdctnDispnsDsgInstrctnMthdCdgVrsn(String.valueOf(medicationdispensedosageinstructionmethodcoding.getVersion()));
		} else {
			m.addMdctnDispnsDsgInstrctnMthdCdgVrsn("NULL");
		}

		if(medicationdispensedosageinstructionmethodcodingi == medicationdispensedosageinstructionmethodcodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnMthdCdgVrsn("]]");}


		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_Cd ********************************************************************************/
		if(medicationdispensedosageinstructionmethodcodingi == 0) {m.addMdctnDispnsDsgInstrctnMthdCdgCd("[[");}
		if(medicationdispensedosageinstructionmethodcoding.hasCode()) {

			m.addMdctnDispnsDsgInstrctnMthdCdgCd(String.valueOf(medicationdispensedosageinstructionmethodcoding.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnMthdCdgCd("NULL");
		}

		if(medicationdispensedosageinstructionmethodcodingi == medicationdispensedosageinstructionmethodcodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnMthdCdgCd("]]");}


		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensedosageinstructionmethodcodingi == 0) {m.addMdctnDispnsDsgInstrctnMthdCdgUsrSltd("[[");}
		if(medicationdispensedosageinstructionmethodcoding.hasUserSelected()) {

			m.addMdctnDispnsDsgInstrctnMthdCdgUsrSltd(String.valueOf(medicationdispensedosageinstructionmethodcoding.getUserSelected()));
		} else {
			m.addMdctnDispnsDsgInstrctnMthdCdgUsrSltd("NULL");
		}

		if(medicationdispensedosageinstructionmethodcodingi == medicationdispensedosageinstructionmethodcodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnMthdCdgUsrSltd("]]");}


		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_Sys ********************************************************************************/
		if(medicationdispensedosageinstructionmethodcodingi == 0) {m.addMdctnDispnsDsgInstrctnMthdCdgSys("[[");}
		if(medicationdispensedosageinstructionmethodcoding.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnMthdCdgSys(String.valueOf(medicationdispensedosageinstructionmethodcoding.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnMthdCdgSys("NULL");
		}

		if(medicationdispensedosageinstructionmethodcodingi == medicationdispensedosageinstructionmethodcodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnMthdCdgSys("]]");}


		 };
		/******************** medicationdispensedosageinstructiondoseandrate ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent> medicationdispensedosageinstructiondoseandratelist = medicationdispensedosageinstruction.getDoseAndRate();
		for(int medicationdispensedosageinstructiondoseandratei = 0; medicationdispensedosageinstructiondoseandratei<medicationdispensedosageinstructiondoseandratelist.size();medicationdispensedosageinstructiondoseandratei++ ) {
		org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent  medicationdispensedosageinstructiondoseandrate = medicationdispensedosageinstructiondoseandratelist.get(medicationdispensedosageinstructiondoseandratei);

		/******************** medicationdispensedosageinstructiondoseandratetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructiondoseandratetype = medicationdispensedosageinstructiondoseandrate.getType();

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Txt ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtTypTxt("[[");}
		if(medicationdispensedosageinstructiondoseandratetype.hasText()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtTypTxt(String.valueOf(medicationdispensedosageinstructiondoseandratetype.getText()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtTypTxt("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtTypTxt("]]");}


		/******************** medicationdispensedosageinstructiondoseandratetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationdispensedosageinstructiondoseandratetypecodinglist = medicationdispensedosageinstructiondoseandratetype.getCoding();
		for(int medicationdispensedosageinstructiondoseandratetypecodingi = 0; medicationdispensedosageinstructiondoseandratetypecodingi<medicationdispensedosageinstructiondoseandratetypecodinglist.size();medicationdispensedosageinstructiondoseandratetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationdispensedosageinstructiondoseandratetypecoding = medicationdispensedosageinstructiondoseandratetypecodinglist.get(medicationdispensedosageinstructiondoseandratetypecodingi);

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratetypecodingi == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgDsply("[[[");}
		if(medicationdispensedosageinstructiondoseandratetypecoding.hasDisplay()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgDsply(String.valueOf(medicationdispensedosageinstructiondoseandratetypecoding.getDisplay()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgDsply("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratetypecodingi == medicationdispensedosageinstructiondoseandratetypecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgDsply("]]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratetypecodingi == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgVrsn("[[[");}
		if(medicationdispensedosageinstructiondoseandratetypecoding.hasVersion()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgVrsn(String.valueOf(medicationdispensedosageinstructiondoseandratetypecoding.getVersion()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgVrsn("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratetypecodingi == medicationdispensedosageinstructiondoseandratetypecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgVrsn("]]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratetypecodingi == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgCd("[[[");}
		if(medicationdispensedosageinstructiondoseandratetypecoding.hasCode()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgCd(String.valueOf(medicationdispensedosageinstructiondoseandratetypecoding.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgCd("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratetypecodingi == medicationdispensedosageinstructiondoseandratetypecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgCd("]]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratetypecodingi == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgUsrSltd("[[[");}
		if(medicationdispensedosageinstructiondoseandratetypecoding.hasUserSelected()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgUsrSltd(String.valueOf(medicationdispensedosageinstructiondoseandratetypecoding.getUserSelected()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgUsrSltd("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratetypecodingi == medicationdispensedosageinstructiondoseandratetypecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgUsrSltd("]]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratetypecodingi == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgSys("[[[");}
		if(medicationdispensedosageinstructiondoseandratetypecoding.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgSys(String.valueOf(medicationdispensedosageinstructiondoseandratetypecoding.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgSys("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratetypecodingi == medicationdispensedosageinstructiondoseandratetypecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtTypCdgSys("]]]");}


		 };
		/******************** medicationdispensedosageinstructiondoseandratedoserange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationdispensedosageinstructiondoseandratedoserange = medicationdispensedosageinstructiondoseandrate.getDoseRange();

		/******************** medicationdispensedosageinstructiondoseandratedoserangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandratedoserangelow = medicationdispensedosageinstructiondoseandratedoserange.getLow();

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwVl("[[");}
		if(medicationdispensedosageinstructiondoseandratedoserangelow.hasValue()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwVl(String.valueOf(medicationdispensedosageinstructiondoseandratedoserangelow.getValue()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwVl("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwVl("]]");}


		/******************** medicationdispensedosageinstructiondoseandratedoserangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiondoseandratedoserangelowcomparator = medicationdispensedosageinstructiondoseandratedoserangelow.getComparator();
		if(medicationdispensedosageinstructiondoseandratedoserangelowcomparator!=null) {
		if(medicationdispensedosageinstructiondoseandratei == 0) {

		m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwCmprtr("[[");		}
			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwCmprtr(medicationdispensedosageinstructiondoseandratedoserangelowcomparator.toCode());
		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {

		m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwCmprtr("]]");		}

		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwCmprtr("NULL");
		}

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwCd("[[");}
		if(medicationdispensedosageinstructiondoseandratedoserangelow.hasCode()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwCd(String.valueOf(medicationdispensedosageinstructiondoseandratedoserangelow.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwCd("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwCd("]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwUnt("[[");}
		if(medicationdispensedosageinstructiondoseandratedoserangelow.hasUnit()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwUnt(String.valueOf(medicationdispensedosageinstructiondoseandratedoserangelow.getUnit()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwUnt("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwUnt("]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwSys("[[");}
		if(medicationdispensedosageinstructiondoseandratedoserangelow.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwSys(String.valueOf(medicationdispensedosageinstructiondoseandratedoserangelow.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwSys("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwSys("]]");}


		/******************** medicationdispensedosageinstructiondoseandratedoserangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandratedoserangehigh = medicationdispensedosageinstructiondoseandratedoserange.getHigh();

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiVl("[[");}
		if(medicationdispensedosageinstructiondoseandratedoserangehigh.hasValue()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiVl(String.valueOf(medicationdispensedosageinstructiondoseandratedoserangehigh.getValue()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiVl("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiVl("]]");}


		/******************** medicationdispensedosageinstructiondoseandratedoserangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiondoseandratedoserangehighcomparator = medicationdispensedosageinstructiondoseandratedoserangehigh.getComparator();
		if(medicationdispensedosageinstructiondoseandratedoserangehighcomparator!=null) {
		if(medicationdispensedosageinstructiondoseandratei == 0) {

		m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiCmprtr("[[");		}
			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiCmprtr(medicationdispensedosageinstructiondoseandratedoserangehighcomparator.toCode());
		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {

		m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiCmprtr("]]");		}

		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiCmprtr("NULL");
		}

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiCd("[[");}
		if(medicationdispensedosageinstructiondoseandratedoserangehigh.hasCode()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiCd(String.valueOf(medicationdispensedosageinstructiondoseandratedoserangehigh.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiCd("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiCd("]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiUnt("[[");}
		if(medicationdispensedosageinstructiondoseandratedoserangehigh.hasUnit()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiUnt(String.valueOf(medicationdispensedosageinstructiondoseandratedoserangehigh.getUnit()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiUnt("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiUnt("]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiSys("[[");}
		if(medicationdispensedosageinstructiondoseandratedoserangehigh.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiSys(String.valueOf(medicationdispensedosageinstructiondoseandratedoserangehigh.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiSys("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiSys("]]");}


		/******************** medicationdispensedosageinstructiondoseandrateratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandrateratequantity = medicationdispensedosageinstructiondoseandrate.getRateQuantity();

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntyVl("[[");}
		if(medicationdispensedosageinstructiondoseandrateratequantity.hasValue()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntyVl(String.valueOf(medicationdispensedosageinstructiondoseandrateratequantity.getValue()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntyVl("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntyVl("]]");}


		/******************** medicationdispensedosageinstructiondoseandrateratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiondoseandrateratequantitycomparator = medicationdispensedosageinstructiondoseandrateratequantity.getComparator();
		if(medicationdispensedosageinstructiondoseandrateratequantitycomparator!=null) {
		if(medicationdispensedosageinstructiondoseandratei == 0) {

		m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntyCmprtr("[[");		}
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntyCmprtr(medicationdispensedosageinstructiondoseandrateratequantitycomparator.toCode());
		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {

		m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntyCmprtr("]]");		}

		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntyCmprtr("NULL");
		}

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntyCd("[[");}
		if(medicationdispensedosageinstructiondoseandrateratequantity.hasCode()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntyCd(String.valueOf(medicationdispensedosageinstructiondoseandrateratequantity.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntyCd("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntyCd("]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntyUnt("[[");}
		if(medicationdispensedosageinstructiondoseandrateratequantity.hasUnit()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntyUnt(String.valueOf(medicationdispensedosageinstructiondoseandrateratequantity.getUnit()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntyUnt("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntyUnt("]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntySys("[[");}
		if(medicationdispensedosageinstructiondoseandrateratequantity.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntySys(String.valueOf(medicationdispensedosageinstructiondoseandrateratequantity.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntySys("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtQntySys("]]");}


		/******************** medicationdispensedosageinstructiondoseandraterateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationdispensedosageinstructiondoseandraterateratio = medicationdispensedosageinstructiondoseandrate.getRateRatio();

		/******************** medicationdispensedosageinstructiondoseandrateraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandrateraterationumerator = medicationdispensedosageinstructiondoseandraterateratio.getNumerator();

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrVl("[[");}
		if(medicationdispensedosageinstructiondoseandrateraterationumerator.hasValue()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrVl(String.valueOf(medicationdispensedosageinstructiondoseandrateraterationumerator.getValue()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrVl("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrVl("]]");}


		/******************** medicationdispensedosageinstructiondoseandrateraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiondoseandrateraterationumeratorcomparator = medicationdispensedosageinstructiondoseandrateraterationumerator.getComparator();
		if(medicationdispensedosageinstructiondoseandrateraterationumeratorcomparator!=null) {
		if(medicationdispensedosageinstructiondoseandratei == 0) {

		m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrCmprtr("[[");		}
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrCmprtr(medicationdispensedosageinstructiondoseandrateraterationumeratorcomparator.toCode());
		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {

		m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrCmprtr("]]");		}

		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrCmprtr("NULL");
		}

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrCd("[[");}
		if(medicationdispensedosageinstructiondoseandrateraterationumerator.hasCode()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrCd(String.valueOf(medicationdispensedosageinstructiondoseandrateraterationumerator.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrCd("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrCd("]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrUnt("[[");}
		if(medicationdispensedosageinstructiondoseandrateraterationumerator.hasUnit()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrUnt(String.valueOf(medicationdispensedosageinstructiondoseandrateraterationumerator.getUnit()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrUnt("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrUnt("]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrSys("[[");}
		if(medicationdispensedosageinstructiondoseandrateraterationumerator.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrSys(String.valueOf(medicationdispensedosageinstructiondoseandrateraterationumerator.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrSys("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrSys("]]");}


		/******************** medicationdispensedosageinstructiondoseandraterateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandraterateratiodenominator = medicationdispensedosageinstructiondoseandraterateratio.getDenominator();

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrVl("[[");}
		if(medicationdispensedosageinstructiondoseandraterateratiodenominator.hasValue()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrVl(String.valueOf(medicationdispensedosageinstructiondoseandraterateratiodenominator.getValue()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrVl("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrVl("]]");}


		/******************** medicationdispensedosageinstructiondoseandraterateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiondoseandraterateratiodenominatorcomparator = medicationdispensedosageinstructiondoseandraterateratiodenominator.getComparator();
		if(medicationdispensedosageinstructiondoseandraterateratiodenominatorcomparator!=null) {
		if(medicationdispensedosageinstructiondoseandratei == 0) {

		m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrCmprtr("[[");		}
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrCmprtr(medicationdispensedosageinstructiondoseandraterateratiodenominatorcomparator.toCode());
		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {

		m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrCmprtr("]]");		}

		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrCmprtr("NULL");
		}

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrCd("[[");}
		if(medicationdispensedosageinstructiondoseandraterateratiodenominator.hasCode()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrCd(String.valueOf(medicationdispensedosageinstructiondoseandraterateratiodenominator.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrCd("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrCd("]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrUnt("[[");}
		if(medicationdispensedosageinstructiondoseandraterateratiodenominator.hasUnit()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrUnt(String.valueOf(medicationdispensedosageinstructiondoseandraterateratiodenominator.getUnit()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrUnt("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrUnt("]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrSys("[[");}
		if(medicationdispensedosageinstructiondoseandraterateratiodenominator.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrSys(String.valueOf(medicationdispensedosageinstructiondoseandraterateratiodenominator.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrSys("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrSys("]]");}


		/******************** medicationdispensedosageinstructiondoseandrateraterange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationdispensedosageinstructiondoseandrateraterange = medicationdispensedosageinstructiondoseandrate.getRateRange();

		/******************** medicationdispensedosageinstructiondoseandrateraterangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandrateraterangelow = medicationdispensedosageinstructiondoseandrateraterange.getLow();

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwVl("[[");}
		if(medicationdispensedosageinstructiondoseandrateraterangelow.hasValue()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwVl(String.valueOf(medicationdispensedosageinstructiondoseandrateraterangelow.getValue()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwVl("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwVl("]]");}


		/******************** medicationdispensedosageinstructiondoseandrateraterangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiondoseandrateraterangelowcomparator = medicationdispensedosageinstructiondoseandrateraterangelow.getComparator();
		if(medicationdispensedosageinstructiondoseandrateraterangelowcomparator!=null) {
		if(medicationdispensedosageinstructiondoseandratei == 0) {

		m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwCmprtr("[[");		}
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwCmprtr(medicationdispensedosageinstructiondoseandrateraterangelowcomparator.toCode());
		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {

		m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwCmprtr("]]");		}

		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwCmprtr("NULL");
		}

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwCd("[[");}
		if(medicationdispensedosageinstructiondoseandrateraterangelow.hasCode()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwCd(String.valueOf(medicationdispensedosageinstructiondoseandrateraterangelow.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwCd("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwCd("]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwUnt("[[");}
		if(medicationdispensedosageinstructiondoseandrateraterangelow.hasUnit()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwUnt(String.valueOf(medicationdispensedosageinstructiondoseandrateraterangelow.getUnit()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwUnt("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwUnt("]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwSys("[[");}
		if(medicationdispensedosageinstructiondoseandrateraterangelow.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwSys(String.valueOf(medicationdispensedosageinstructiondoseandrateraterangelow.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwSys("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngLwSys("]]");}


		/******************** medicationdispensedosageinstructiondoseandrateraterangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandrateraterangehigh = medicationdispensedosageinstructiondoseandrateraterange.getHigh();

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiVl("[[");}
		if(medicationdispensedosageinstructiondoseandrateraterangehigh.hasValue()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiVl(String.valueOf(medicationdispensedosageinstructiondoseandrateraterangehigh.getValue()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiVl("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiVl("]]");}


		/******************** medicationdispensedosageinstructiondoseandrateraterangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiondoseandrateraterangehighcomparator = medicationdispensedosageinstructiondoseandrateraterangehigh.getComparator();
		if(medicationdispensedosageinstructiondoseandrateraterangehighcomparator!=null) {
		if(medicationdispensedosageinstructiondoseandratei == 0) {

		m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiCmprtr("[[");		}
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiCmprtr(medicationdispensedosageinstructiondoseandrateraterangehighcomparator.toCode());
		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {

		m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiCmprtr("]]");		}

		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiCmprtr("NULL");
		}

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiCd("[[");}
		if(medicationdispensedosageinstructiondoseandrateraterangehigh.hasCode()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiCd(String.valueOf(medicationdispensedosageinstructiondoseandrateraterangehigh.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiCd("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiCd("]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiUnt("[[");}
		if(medicationdispensedosageinstructiondoseandrateraterangehigh.hasUnit()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiUnt(String.valueOf(medicationdispensedosageinstructiondoseandrateraterangehigh.getUnit()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiUnt("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiUnt("]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiSys("[[");}
		if(medicationdispensedosageinstructiondoseandrateraterangehigh.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiSys(String.valueOf(medicationdispensedosageinstructiondoseandrateraterangehigh.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiSys("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtRtRngHiSys("]]");}


		/******************** medicationdispensedosageinstructiondoseandratedosequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiondoseandratedosequantity = medicationdispensedosageinstructiondoseandrate.getDoseQuantity();

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntyVl("[[");}
		if(medicationdispensedosageinstructiondoseandratedosequantity.hasValue()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntyVl(String.valueOf(medicationdispensedosageinstructiondoseandratedosequantity.getValue()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntyVl("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntyVl("]]");}


		/******************** medicationdispensedosageinstructiondoseandratedosequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiondoseandratedosequantitycomparator = medicationdispensedosageinstructiondoseandratedosequantity.getComparator();
		if(medicationdispensedosageinstructiondoseandratedosequantitycomparator!=null) {
		if(medicationdispensedosageinstructiondoseandratei == 0) {

		m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntyCmprtr("[[");		}
			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntyCmprtr(medicationdispensedosageinstructiondoseandratedosequantitycomparator.toCode());
		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {

		m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntyCmprtr("]]");		}

		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntyCmprtr("NULL");
		}

		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntyCd("[[");}
		if(medicationdispensedosageinstructiondoseandratedosequantity.hasCode()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntyCd(String.valueOf(medicationdispensedosageinstructiondoseandratedosequantity.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntyCd("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntyCd("]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntyUnt("[[");}
		if(medicationdispensedosageinstructiondoseandratedosequantity.hasUnit()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntyUnt(String.valueOf(medicationdispensedosageinstructiondoseandratedosequantity.getUnit()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntyUnt("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntyUnt("]]");}


		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiondoseandratei == 0) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntySys("[[");}
		if(medicationdispensedosageinstructiondoseandratedosequantity.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntySys(String.valueOf(medicationdispensedosageinstructiondoseandratedosequantity.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntySys("NULL");
		}

		if(medicationdispensedosageinstructiondoseandratei == medicationdispensedosageinstructiondoseandratelist.size()-1) {m.addMdctnDispnsDsgInstrctnDoseAndRtDoseQntySys("]]");}


		 };
		/******************** MdctnDispns_DsgInstrctn_Sqnc ********************************************************************************/
		if(medicationdispensedosageinstruction.hasSequence()) {

			m.addMdctnDispnsDsgInstrctnSqnc(String.valueOf(medicationdispensedosageinstruction.getSequence()));
		} else {
			m.addMdctnDispnsDsgInstrctnSqnc("NULL");
		}


		/******************** medicationdispensedosageinstructionsite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructionsite = medicationdispensedosageinstruction.getSite();

		/******************** MdctnDispns_DsgInstrctn_Site_Txt ********************************************************************************/
		if(medicationdispensedosageinstructionsite.hasText()) {

			m.addMdctnDispnsDsgInstrctnSiteTxt(String.valueOf(medicationdispensedosageinstructionsite.getText()));
		} else {
			m.addMdctnDispnsDsgInstrctnSiteTxt("NULL");
		}


		/******************** medicationdispensedosageinstructionsitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationdispensedosageinstructionsitecodinglist = medicationdispensedosageinstructionsite.getCoding();
		for(int medicationdispensedosageinstructionsitecodingi = 0; medicationdispensedosageinstructionsitecodingi<medicationdispensedosageinstructionsitecodinglist.size();medicationdispensedosageinstructionsitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationdispensedosageinstructionsitecoding = medicationdispensedosageinstructionsitecodinglist.get(medicationdispensedosageinstructionsitecodingi);

		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_Dsply ********************************************************************************/
		if(medicationdispensedosageinstructionsitecodingi == 0) {m.addMdctnDispnsDsgInstrctnSiteCdgDsply("[[");}
		if(medicationdispensedosageinstructionsitecoding.hasDisplay()) {

			m.addMdctnDispnsDsgInstrctnSiteCdgDsply(String.valueOf(medicationdispensedosageinstructionsitecoding.getDisplay()));
		} else {
			m.addMdctnDispnsDsgInstrctnSiteCdgDsply("NULL");
		}

		if(medicationdispensedosageinstructionsitecodingi == medicationdispensedosageinstructionsitecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnSiteCdgDsply("]]");}


		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensedosageinstructionsitecodingi == 0) {m.addMdctnDispnsDsgInstrctnSiteCdgVrsn("[[");}
		if(medicationdispensedosageinstructionsitecoding.hasVersion()) {

			m.addMdctnDispnsDsgInstrctnSiteCdgVrsn(String.valueOf(medicationdispensedosageinstructionsitecoding.getVersion()));
		} else {
			m.addMdctnDispnsDsgInstrctnSiteCdgVrsn("NULL");
		}

		if(medicationdispensedosageinstructionsitecodingi == medicationdispensedosageinstructionsitecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnSiteCdgVrsn("]]");}


		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_Cd ********************************************************************************/
		if(medicationdispensedosageinstructionsitecodingi == 0) {m.addMdctnDispnsDsgInstrctnSiteCdgCd("[[");}
		if(medicationdispensedosageinstructionsitecoding.hasCode()) {

			m.addMdctnDispnsDsgInstrctnSiteCdgCd(String.valueOf(medicationdispensedosageinstructionsitecoding.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnSiteCdgCd("NULL");
		}

		if(medicationdispensedosageinstructionsitecodingi == medicationdispensedosageinstructionsitecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnSiteCdgCd("]]");}


		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensedosageinstructionsitecodingi == 0) {m.addMdctnDispnsDsgInstrctnSiteCdgUsrSltd("[[");}
		if(medicationdispensedosageinstructionsitecoding.hasUserSelected()) {

			m.addMdctnDispnsDsgInstrctnSiteCdgUsrSltd(String.valueOf(medicationdispensedosageinstructionsitecoding.getUserSelected()));
		} else {
			m.addMdctnDispnsDsgInstrctnSiteCdgUsrSltd("NULL");
		}

		if(medicationdispensedosageinstructionsitecodingi == medicationdispensedosageinstructionsitecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnSiteCdgUsrSltd("]]");}


		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_Sys ********************************************************************************/
		if(medicationdispensedosageinstructionsitecodingi == 0) {m.addMdctnDispnsDsgInstrctnSiteCdgSys("[[");}
		if(medicationdispensedosageinstructionsitecoding.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnSiteCdgSys(String.valueOf(medicationdispensedosageinstructionsitecoding.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnSiteCdgSys("NULL");
		}

		if(medicationdispensedosageinstructionsitecodingi == medicationdispensedosageinstructionsitecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnSiteCdgSys("]]");}


		 };
		/******************** MdctnDispns_DsgInstrctn_PntInstrctn ********************************************************************************/
		if(medicationdispensedosageinstruction.hasPatientInstruction()) {

			m.addMdctnDispnsDsgInstrctnPntInstrctn(String.valueOf(medicationdispensedosageinstruction.getPatientInstruction()));
		} else {
			m.addMdctnDispnsDsgInstrctnPntInstrctn("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_Txt ********************************************************************************/
		if(medicationdispensedosageinstruction.hasText()) {

			m.addMdctnDispnsDsgInstrctnTxt(String.valueOf(medicationdispensedosageinstruction.getText()));
		} else {
			m.addMdctnDispnsDsgInstrctnTxt("NULL");
		}


		/******************** medicationdispensedosageinstructiontiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing medicationdispensedosageinstructiontiming = medicationdispensedosageinstruction.getTiming();

		/******************** medicationdispensedosageinstructiontimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructiontimingcode = medicationdispensedosageinstructiontiming.getCode();

		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Txt ********************************************************************************/
		if(medicationdispensedosageinstructiontimingcode.hasText()) {

			m.addMdctnDispnsDsgInstrctnTmgCdTxt(String.valueOf(medicationdispensedosageinstructiontimingcode.getText()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgCdTxt("NULL");
		}


		/******************** medicationdispensedosageinstructiontimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationdispensedosageinstructiontimingcodecodinglist = medicationdispensedosageinstructiontimingcode.getCoding();
		for(int medicationdispensedosageinstructiontimingcodecodingi = 0; medicationdispensedosageinstructiontimingcodecodingi<medicationdispensedosageinstructiontimingcodecodinglist.size();medicationdispensedosageinstructiontimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationdispensedosageinstructiontimingcodecoding = medicationdispensedosageinstructiontimingcodecodinglist.get(medicationdispensedosageinstructiontimingcodecodingi);

		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(medicationdispensedosageinstructiontimingcodecodingi == 0) {m.addMdctnDispnsDsgInstrctnTmgCdCdgDsply("[[");}
		if(medicationdispensedosageinstructiontimingcodecoding.hasDisplay()) {

			m.addMdctnDispnsDsgInstrctnTmgCdCdgDsply(String.valueOf(medicationdispensedosageinstructiontimingcodecoding.getDisplay()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgCdCdgDsply("NULL");
		}

		if(medicationdispensedosageinstructiontimingcodecodingi == medicationdispensedosageinstructiontimingcodecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnTmgCdCdgDsply("]]");}


		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensedosageinstructiontimingcodecodingi == 0) {m.addMdctnDispnsDsgInstrctnTmgCdCdgVrsn("[[");}
		if(medicationdispensedosageinstructiontimingcodecoding.hasVersion()) {

			m.addMdctnDispnsDsgInstrctnTmgCdCdgVrsn(String.valueOf(medicationdispensedosageinstructiontimingcodecoding.getVersion()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgCdCdgVrsn("NULL");
		}

		if(medicationdispensedosageinstructiontimingcodecodingi == medicationdispensedosageinstructiontimingcodecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnTmgCdCdgVrsn("]]");}


		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiontimingcodecodingi == 0) {m.addMdctnDispnsDsgInstrctnTmgCdCdgCd("[[");}
		if(medicationdispensedosageinstructiontimingcodecoding.hasCode()) {

			m.addMdctnDispnsDsgInstrctnTmgCdCdgCd(String.valueOf(medicationdispensedosageinstructiontimingcodecoding.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgCdCdgCd("NULL");
		}

		if(medicationdispensedosageinstructiontimingcodecodingi == medicationdispensedosageinstructiontimingcodecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnTmgCdCdgCd("]]");}


		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensedosageinstructiontimingcodecodingi == 0) {m.addMdctnDispnsDsgInstrctnTmgCdCdgUsrSltd("[[");}
		if(medicationdispensedosageinstructiontimingcodecoding.hasUserSelected()) {

			m.addMdctnDispnsDsgInstrctnTmgCdCdgUsrSltd(String.valueOf(medicationdispensedosageinstructiontimingcodecoding.getUserSelected()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgCdCdgUsrSltd("NULL");
		}

		if(medicationdispensedosageinstructiontimingcodecodingi == medicationdispensedosageinstructiontimingcodecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnTmgCdCdgUsrSltd("]]");}


		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiontimingcodecodingi == 0) {m.addMdctnDispnsDsgInstrctnTmgCdCdgSys("[[");}
		if(medicationdispensedosageinstructiontimingcodecoding.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnTmgCdCdgSys(String.valueOf(medicationdispensedosageinstructiontimingcodecoding.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgCdCdgSys("NULL");
		}

		if(medicationdispensedosageinstructiontimingcodecodingi == medicationdispensedosageinstructiontimingcodecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnTmgCdCdgSys("]]");}


		 };
		/******************** MdctnDispns_DsgInstrctn_Tmg_Evnt ********************************************************************************/
		if(medicationdispensedosageinstructiontiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<medicationdispensedosageinstructiontiming.getEvent().size(); incr++) {
				array = array + medicationdispensedosageinstructiontiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnDispnsDsgInstrctnTmgEvnt(array);

		} else {
			m.addMdctnDispnsDsgInstrctnTmgEvnt("NULL");
		}


		/******************** medicationdispensedosageinstructiontimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent medicationdispensedosageinstructiontimingrepeat = medicationdispensedosageinstructiontiming.getRepeat();

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Off ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeat.hasOffset()) {

			m.addMdctnDispnsDsgInstrctnTmgRptOff(String.valueOf(medicationdispensedosageinstructiontimingrepeat.getOffset()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptOff("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Cnt ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeat.hasCount()) {

			m.addMdctnDispnsDsgInstrctnTmgRptCnt(String.valueOf(medicationdispensedosageinstructiontimingrepeat.getCount()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptCnt("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Prd ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeat.hasPeriod()) {

			m.addMdctnDispnsDsgInstrctnTmgRptPrd(String.valueOf(medicationdispensedosageinstructiontimingrepeat.getPeriod()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptPrd("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_CntMx ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeat.hasCountMax()) {

			m.addMdctnDispnsDsgInstrctnTmgRptCntMx(String.valueOf(medicationdispensedosageinstructiontimingrepeat.getCountMax()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptCntMx("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_DurationMx ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeat.hasDurationMax()) {

			m.addMdctnDispnsDsgInstrctnTmgRptDurationMx(String.valueOf(medicationdispensedosageinstructiontimingrepeat.getDurationMax()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptDurationMx("NULL");
		}


		/******************** medicationdispensedosageinstructiontimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationdispensedosageinstructiontimingrepeatboundsperiod = medicationdispensedosageinstructiontimingrepeat.getBoundsPeriod();

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsperiod.hasStart()) {

			m.addMdctnDispnsDsgInstrctnTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationdispensedosageinstructiontimingrepeatboundsperiod.getStart())+"\"");
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsPrdStrt("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsperiod.hasEnd()) {

			m.addMdctnDispnsDsgInstrctnTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationdispensedosageinstructiontimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsPrdEnd("NULL");
		}


		/******************** medicationdispensedosageinstructiontimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime medicationdispensedosageinstructiontimingrepeatdurationunit = medicationdispensedosageinstructiontimingrepeat.getDurationUnit();
		if(medicationdispensedosageinstructiontimingrepeatdurationunit!=null) {
			m.addMdctnDispnsDsgInstrctnTmgRptDurationUnt(medicationdispensedosageinstructiontimingrepeatdurationunit.toCode());
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptDurationUnt("NULL");
		}

		/******************** medicationdispensedosageinstructiontimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicationdispensedosageinstructiontimingrepeatboundsduration = medicationdispensedosageinstructiontimingrepeat.getBoundsDuration();

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsduration.hasValue()) {

			m.addMdctnDispnsDsgInstrctnTmgRptBndsDurationVl(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsduration.getValue()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsDurationVl("NULL");
		}


		/******************** medicationdispensedosageinstructiontimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiontimingrepeatboundsdurationcomparator = medicationdispensedosageinstructiontimingrepeatboundsduration.getComparator();
		if(medicationdispensedosageinstructiontimingrepeatboundsdurationcomparator!=null) {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsDurationCmprtr(medicationdispensedosageinstructiontimingrepeatboundsdurationcomparator.toCode());
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsduration.hasCode()) {

			m.addMdctnDispnsDsgInstrctnTmgRptBndsDurationCd(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsduration.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsDurationCd("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsduration.hasUnit()) {

			m.addMdctnDispnsDsgInstrctnTmgRptBndsDurationUnt(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsduration.getUnit()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsDurationUnt("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsduration.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnTmgRptBndsDurationSys(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsduration.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsDurationSys("NULL");
		}


		/******************** medicationdispensedosageinstructiontimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range medicationdispensedosageinstructiontimingrepeatboundsrange = medicationdispensedosageinstructiontimingrepeat.getBoundsRange();

		/******************** medicationdispensedosageinstructiontimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiontimingrepeatboundsrangelow = medicationdispensedosageinstructiontimingrepeatboundsrange.getLow();

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsrangelow.hasValue()) {

			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngLwVl(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsrangelow.getValue()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngLwVl("NULL");
		}


		/******************** medicationdispensedosageinstructiontimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiontimingrepeatboundsrangelowcomparator = medicationdispensedosageinstructiontimingrepeatboundsrangelow.getComparator();
		if(medicationdispensedosageinstructiontimingrepeatboundsrangelowcomparator!=null) {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngLwCmprtr(medicationdispensedosageinstructiontimingrepeatboundsrangelowcomparator.toCode());
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsrangelow.hasCode()) {

			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngLwCd(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsrangelow.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngLwCd("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsrangelow.hasUnit()) {

			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngLwUnt(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsrangelow.getUnit()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngLwUnt("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsrangelow.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngLwSys(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsrangelow.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngLwSys("NULL");
		}


		/******************** medicationdispensedosageinstructiontimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructiontimingrepeatboundsrangehigh = medicationdispensedosageinstructiontimingrepeatboundsrange.getHigh();

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsrangehigh.hasValue()) {

			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngHiVl(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsrangehigh.getValue()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngHiVl("NULL");
		}


		/******************** medicationdispensedosageinstructiontimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructiontimingrepeatboundsrangehighcomparator = medicationdispensedosageinstructiontimingrepeatboundsrangehigh.getComparator();
		if(medicationdispensedosageinstructiontimingrepeatboundsrangehighcomparator!=null) {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngHiCmprtr(medicationdispensedosageinstructiontimingrepeatboundsrangehighcomparator.toCode());
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsrangehigh.hasCode()) {

			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngHiCd(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsrangehigh.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngHiCd("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsrangehigh.hasUnit()) {

			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngHiUnt(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsrangehigh.getUnit()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngHiUnt("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeatboundsrangehigh.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngHiSys(String.valueOf(medicationdispensedosageinstructiontimingrepeatboundsrangehigh.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptBndsRngHiSys("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeat.hasFrequencyMax()) {

			m.addMdctnDispnsDsgInstrctnTmgRptFrqncyMx(String.valueOf(medicationdispensedosageinstructiontimingrepeat.getFrequencyMax()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptFrqncyMx("NULL");
		}


		/******************** medicationdispensedosageinstructiontimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> medicationdispensedosageinstructiontimingrepeatwhenlist = medicationdispensedosageinstructiontimingrepeat.getWhen();
		for(int medicationdispensedosageinstructiontimingrepeatwheni = 0; medicationdispensedosageinstructiontimingrepeatwheni<medicationdispensedosageinstructiontimingrepeatwhenlist.size();medicationdispensedosageinstructiontimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  medicationdispensedosageinstructiontimingrepeatwhen = medicationdispensedosageinstructiontimingrepeatwhenlist.get(medicationdispensedosageinstructiontimingrepeatwheni);
		if(medicationdispensedosageinstructiontimingrepeatwhen!=null) {
			m.addMdctnDispnsDsgInstrctnTmgRptWhen(medicationdispensedosageinstructiontimingrepeatwhen.getCode());
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptWhen("NULL");
		}
		 };

		/******************** medicationdispensedosageinstructiontimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime medicationdispensedosageinstructiontimingrepeatperiodunit = medicationdispensedosageinstructiontimingrepeat.getPeriodUnit();
		if(medicationdispensedosageinstructiontimingrepeatperiodunit!=null) {
			m.addMdctnDispnsDsgInstrctnTmgRptPrdUnt(medicationdispensedosageinstructiontimingrepeatperiodunit.toCode());
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptPrdUnt("NULL");
		}

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_PrdMx ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeat.hasPeriodMax()) {

			m.addMdctnDispnsDsgInstrctnTmgRptPrdMx(String.valueOf(medicationdispensedosageinstructiontimingrepeat.getPeriodMax()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptPrdMx("NULL");
		}


		/******************** medicationdispensedosageinstructiontimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> medicationdispensedosageinstructiontimingrepeatdayofweeklist = medicationdispensedosageinstructiontimingrepeat.getDayOfWeek();
		for(int medicationdispensedosageinstructiontimingrepeatdayofweeki = 0; medicationdispensedosageinstructiontimingrepeatdayofweeki<medicationdispensedosageinstructiontimingrepeatdayofweeklist.size();medicationdispensedosageinstructiontimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  medicationdispensedosageinstructiontimingrepeatdayofweek = medicationdispensedosageinstructiontimingrepeatdayofweeklist.get(medicationdispensedosageinstructiontimingrepeatdayofweeki);
		if(medicationdispensedosageinstructiontimingrepeatdayofweek!=null) {
			m.addMdctnDispnsDsgInstrctnTmgRptDayOfWeek(medicationdispensedosageinstructiontimingrepeatdayofweek.getCode());
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_TimeOfDay ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<medicationdispensedosageinstructiontimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + medicationdispensedosageinstructiontimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnDispnsDsgInstrctnTmgRptTimeOfDay(array);

		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptTimeOfDay("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Duration ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeat.hasDuration()) {

			m.addMdctnDispnsDsgInstrctnTmgRptDuration(String.valueOf(medicationdispensedosageinstructiontimingrepeat.getDuration()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptDuration("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Frqncy ********************************************************************************/
		if(medicationdispensedosageinstructiontimingrepeat.hasFrequency()) {

			m.addMdctnDispnsDsgInstrctnTmgRptFrqncy(String.valueOf(medicationdispensedosageinstructiontimingrepeat.getFrequency()));
		} else {
			m.addMdctnDispnsDsgInstrctnTmgRptFrqncy("NULL");
		}


		/******************** medicationdispensedosageinstructionmaxdoseperadministration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructionmaxdoseperadministration = medicationdispensedosageinstruction.getMaxDosePerAdministration();

		/******************** MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperadministration.hasValue()) {

			m.addMdctnDispnsDsgInstrctnMxDosePerAdmnstnVl(String.valueOf(medicationdispensedosageinstructionmaxdoseperadministration.getValue()));
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerAdmnstnVl("NULL");
		}


		/******************** medicationdispensedosageinstructionmaxdoseperadministrationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructionmaxdoseperadministrationcomparator = medicationdispensedosageinstructionmaxdoseperadministration.getComparator();
		if(medicationdispensedosageinstructionmaxdoseperadministrationcomparator!=null) {
			m.addMdctnDispnsDsgInstrctnMxDosePerAdmnstnCmprtr(medicationdispensedosageinstructionmaxdoseperadministrationcomparator.toCode());
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerAdmnstnCmprtr("NULL");
		}

		/******************** MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperadministration.hasCode()) {

			m.addMdctnDispnsDsgInstrctnMxDosePerAdmnstnCd(String.valueOf(medicationdispensedosageinstructionmaxdoseperadministration.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerAdmnstnCd("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperadministration.hasUnit()) {

			m.addMdctnDispnsDsgInstrctnMxDosePerAdmnstnUnt(String.valueOf(medicationdispensedosageinstructionmaxdoseperadministration.getUnit()));
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerAdmnstnUnt("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperadministration.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnMxDosePerAdmnstnSys(String.valueOf(medicationdispensedosageinstructionmaxdoseperadministration.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerAdmnstnSys("NULL");
		}


		/******************** medicationdispensedosageinstructionmaxdoseperperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationdispensedosageinstructionmaxdoseperperiod = medicationdispensedosageinstruction.getMaxDosePerPeriod();

		/******************** medicationdispensedosageinstructionmaxdoseperperiodnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructionmaxdoseperperiodnumerator = medicationdispensedosageinstructionmaxdoseperperiod.getNumerator();

		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperperiodnumerator.hasValue()) {

			m.addMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrVl(String.valueOf(medicationdispensedosageinstructionmaxdoseperperiodnumerator.getValue()));
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrVl("NULL");
		}


		/******************** medicationdispensedosageinstructionmaxdoseperperiodnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructionmaxdoseperperiodnumeratorcomparator = medicationdispensedosageinstructionmaxdoseperperiodnumerator.getComparator();
		if(medicationdispensedosageinstructionmaxdoseperperiodnumeratorcomparator!=null) {
			m.addMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrCmprtr(medicationdispensedosageinstructionmaxdoseperperiodnumeratorcomparator.toCode());
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrCmprtr("NULL");
		}

		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperperiodnumerator.hasCode()) {

			m.addMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrCd(String.valueOf(medicationdispensedosageinstructionmaxdoseperperiodnumerator.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrCd("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperperiodnumerator.hasUnit()) {

			m.addMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrUnt(String.valueOf(medicationdispensedosageinstructionmaxdoseperperiodnumerator.getUnit()));
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrUnt("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperperiodnumerator.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrSys(String.valueOf(medicationdispensedosageinstructionmaxdoseperperiodnumerator.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrSys("NULL");
		}


		/******************** medicationdispensedosageinstructionmaxdoseperperioddenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructionmaxdoseperperioddenominator = medicationdispensedosageinstructionmaxdoseperperiod.getDenominator();

		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperperioddenominator.hasValue()) {

			m.addMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrVl(String.valueOf(medicationdispensedosageinstructionmaxdoseperperioddenominator.getValue()));
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrVl("NULL");
		}


		/******************** medicationdispensedosageinstructionmaxdoseperperioddenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructionmaxdoseperperioddenominatorcomparator = medicationdispensedosageinstructionmaxdoseperperioddenominator.getComparator();
		if(medicationdispensedosageinstructionmaxdoseperperioddenominatorcomparator!=null) {
			m.addMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrCmprtr(medicationdispensedosageinstructionmaxdoseperperioddenominatorcomparator.toCode());
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrCmprtr("NULL");
		}

		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperperioddenominator.hasCode()) {

			m.addMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrCd(String.valueOf(medicationdispensedosageinstructionmaxdoseperperioddenominator.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrCd("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperperioddenominator.hasUnit()) {

			m.addMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrUnt(String.valueOf(medicationdispensedosageinstructionmaxdoseperperioddenominator.getUnit()));
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrUnt("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperperioddenominator.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrSys(String.valueOf(medicationdispensedosageinstructionmaxdoseperperioddenominator.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrSys("NULL");
		}


		/******************** medicationdispensedosageinstructionadditionalinstruction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicationdispensedosageinstructionadditionalinstructionlist = medicationdispensedosageinstruction.getAdditionalInstruction();
		for(int medicationdispensedosageinstructionadditionalinstructioni = 0; medicationdispensedosageinstructionadditionalinstructioni<medicationdispensedosageinstructionadditionalinstructionlist.size();medicationdispensedosageinstructionadditionalinstructioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicationdispensedosageinstructionadditionalinstruction = medicationdispensedosageinstructionadditionalinstructionlist.get(medicationdispensedosageinstructionadditionalinstructioni);

		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Txt ********************************************************************************/
		if(medicationdispensedosageinstructionadditionalinstructioni == 0) {m.addMdctnDispnsDsgInstrctnAddtnlInstrctnTxt("[[");}
		if(medicationdispensedosageinstructionadditionalinstruction.hasText()) {

			m.addMdctnDispnsDsgInstrctnAddtnlInstrctnTxt(String.valueOf(medicationdispensedosageinstructionadditionalinstruction.getText()));
		} else {
			m.addMdctnDispnsDsgInstrctnAddtnlInstrctnTxt("NULL");
		}

		if(medicationdispensedosageinstructionadditionalinstructioni == medicationdispensedosageinstructionadditionalinstructionlist.size()-1) {m.addMdctnDispnsDsgInstrctnAddtnlInstrctnTxt("]]");}


		/******************** medicationdispensedosageinstructionadditionalinstructioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationdispensedosageinstructionadditionalinstructioncodinglist = medicationdispensedosageinstructionadditionalinstruction.getCoding();
		for(int medicationdispensedosageinstructionadditionalinstructioncodingi = 0; medicationdispensedosageinstructionadditionalinstructioncodingi<medicationdispensedosageinstructionadditionalinstructioncodinglist.size();medicationdispensedosageinstructionadditionalinstructioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationdispensedosageinstructionadditionalinstructioncoding = medicationdispensedosageinstructionadditionalinstructioncodinglist.get(medicationdispensedosageinstructionadditionalinstructioncodingi);

		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(medicationdispensedosageinstructionadditionalinstructioncodingi == 0) {m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgDsply("[[[");}
		if(medicationdispensedosageinstructionadditionalinstructioncoding.hasDisplay()) {

			m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgDsply(String.valueOf(medicationdispensedosageinstructionadditionalinstructioncoding.getDisplay()));
		} else {
			m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgDsply("NULL");
		}

		if(medicationdispensedosageinstructionadditionalinstructioncodingi == medicationdispensedosageinstructionadditionalinstructioncodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgDsply("]]]");}


		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensedosageinstructionadditionalinstructioncodingi == 0) {m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgVrsn("[[[");}
		if(medicationdispensedosageinstructionadditionalinstructioncoding.hasVersion()) {

			m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgVrsn(String.valueOf(medicationdispensedosageinstructionadditionalinstructioncoding.getVersion()));
		} else {
			m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgVrsn("NULL");
		}

		if(medicationdispensedosageinstructionadditionalinstructioncodingi == medicationdispensedosageinstructionadditionalinstructioncodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgVrsn("]]]");}


		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(medicationdispensedosageinstructionadditionalinstructioncodingi == 0) {m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgCd("[[[");}
		if(medicationdispensedosageinstructionadditionalinstructioncoding.hasCode()) {

			m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgCd(String.valueOf(medicationdispensedosageinstructionadditionalinstructioncoding.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgCd("NULL");
		}

		if(medicationdispensedosageinstructionadditionalinstructioncodingi == medicationdispensedosageinstructionadditionalinstructioncodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgCd("]]]");}


		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensedosageinstructionadditionalinstructioncodingi == 0) {m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgUsrSltd("[[[");}
		if(medicationdispensedosageinstructionadditionalinstructioncoding.hasUserSelected()) {

			m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgUsrSltd(String.valueOf(medicationdispensedosageinstructionadditionalinstructioncoding.getUserSelected()));
		} else {
			m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgUsrSltd("NULL");
		}

		if(medicationdispensedosageinstructionadditionalinstructioncodingi == medicationdispensedosageinstructionadditionalinstructioncodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgUsrSltd("]]]");}


		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(medicationdispensedosageinstructionadditionalinstructioncodingi == 0) {m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgSys("[[[");}
		if(medicationdispensedosageinstructionadditionalinstructioncoding.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgSys(String.valueOf(medicationdispensedosageinstructionadditionalinstructioncoding.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgSys("NULL");
		}

		if(medicationdispensedosageinstructionadditionalinstructioncodingi == medicationdispensedosageinstructionadditionalinstructioncodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnAddtnlInstrctnCdgSys("]]]");}


		 };
		 };
		/******************** medicationdispensedosageinstructionmaxdoseperlifetime ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedosageinstructionmaxdoseperlifetime = medicationdispensedosageinstruction.getMaxDosePerLifetime();

		/******************** MdctnDispns_DsgInstrctn_MxDosePerLifetime_Vl ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperlifetime.hasValue()) {

			m.addMdctnDispnsDsgInstrctnMxDosePerLifetimeVl(String.valueOf(medicationdispensedosageinstructionmaxdoseperlifetime.getValue()));
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerLifetimeVl("NULL");
		}


		/******************** medicationdispensedosageinstructionmaxdoseperlifetimecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedosageinstructionmaxdoseperlifetimecomparator = medicationdispensedosageinstructionmaxdoseperlifetime.getComparator();
		if(medicationdispensedosageinstructionmaxdoseperlifetimecomparator!=null) {
			m.addMdctnDispnsDsgInstrctnMxDosePerLifetimeCmprtr(medicationdispensedosageinstructionmaxdoseperlifetimecomparator.toCode());
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerLifetimeCmprtr("NULL");
		}

		/******************** MdctnDispns_DsgInstrctn_MxDosePerLifetime_Cd ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperlifetime.hasCode()) {

			m.addMdctnDispnsDsgInstrctnMxDosePerLifetimeCd(String.valueOf(medicationdispensedosageinstructionmaxdoseperlifetime.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerLifetimeCd("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_MxDosePerLifetime_Unt ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperlifetime.hasUnit()) {

			m.addMdctnDispnsDsgInstrctnMxDosePerLifetimeUnt(String.valueOf(medicationdispensedosageinstructionmaxdoseperlifetime.getUnit()));
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerLifetimeUnt("NULL");
		}


		/******************** MdctnDispns_DsgInstrctn_MxDosePerLifetime_Sys ********************************************************************************/
		if(medicationdispensedosageinstructionmaxdoseperlifetime.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnMxDosePerLifetimeSys(String.valueOf(medicationdispensedosageinstructionmaxdoseperlifetime.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnMxDosePerLifetimeSys("NULL");
		}


		/******************** medicationdispensedosageinstructionasneededcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructionasneededcodeableconcept = medicationdispensedosageinstruction.getAsNeededCodeableConcept();

		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(medicationdispensedosageinstructionasneededcodeableconcept.hasText()) {

			m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptTxt(String.valueOf(medicationdispensedosageinstructionasneededcodeableconcept.getText()));
		} else {
			m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptTxt("NULL");
		}


		/******************** medicationdispensedosageinstructionasneededcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationdispensedosageinstructionasneededcodeableconceptcodinglist = medicationdispensedosageinstructionasneededcodeableconcept.getCoding();
		for(int medicationdispensedosageinstructionasneededcodeableconceptcodingi = 0; medicationdispensedosageinstructionasneededcodeableconceptcodingi<medicationdispensedosageinstructionasneededcodeableconceptcodinglist.size();medicationdispensedosageinstructionasneededcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationdispensedosageinstructionasneededcodeableconceptcoding = medicationdispensedosageinstructionasneededcodeableconceptcodinglist.get(medicationdispensedosageinstructionasneededcodeableconceptcodingi);

		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationdispensedosageinstructionasneededcodeableconceptcodingi == 0) {m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgDsply("[[");}
		if(medicationdispensedosageinstructionasneededcodeableconceptcoding.hasDisplay()) {

			m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgDsply(String.valueOf(medicationdispensedosageinstructionasneededcodeableconceptcoding.getDisplay()));
		} else {
			m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgDsply("NULL");
		}

		if(medicationdispensedosageinstructionasneededcodeableconceptcodingi == medicationdispensedosageinstructionasneededcodeableconceptcodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgDsply("]]");}


		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensedosageinstructionasneededcodeableconceptcodingi == 0) {m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgVrsn("[[");}
		if(medicationdispensedosageinstructionasneededcodeableconceptcoding.hasVersion()) {

			m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgVrsn(String.valueOf(medicationdispensedosageinstructionasneededcodeableconceptcoding.getVersion()));
		} else {
			m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgVrsn("NULL");
		}

		if(medicationdispensedosageinstructionasneededcodeableconceptcodingi == medicationdispensedosageinstructionasneededcodeableconceptcodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgVrsn("]]");}


		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationdispensedosageinstructionasneededcodeableconceptcodingi == 0) {m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgCd("[[");}
		if(medicationdispensedosageinstructionasneededcodeableconceptcoding.hasCode()) {

			m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgCd(String.valueOf(medicationdispensedosageinstructionasneededcodeableconceptcoding.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgCd("NULL");
		}

		if(medicationdispensedosageinstructionasneededcodeableconceptcodingi == medicationdispensedosageinstructionasneededcodeableconceptcodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgCd("]]");}


		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensedosageinstructionasneededcodeableconceptcodingi == 0) {m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgUsrSltd("[[");}
		if(medicationdispensedosageinstructionasneededcodeableconceptcoding.hasUserSelected()) {

			m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgUsrSltd(String.valueOf(medicationdispensedosageinstructionasneededcodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicationdispensedosageinstructionasneededcodeableconceptcodingi == medicationdispensedosageinstructionasneededcodeableconceptcodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgUsrSltd("]]");}


		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationdispensedosageinstructionasneededcodeableconceptcodingi == 0) {m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgSys("[[");}
		if(medicationdispensedosageinstructionasneededcodeableconceptcoding.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgSys(String.valueOf(medicationdispensedosageinstructionasneededcodeableconceptcoding.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgSys("NULL");
		}

		if(medicationdispensedosageinstructionasneededcodeableconceptcodingi == medicationdispensedosageinstructionasneededcodeableconceptcodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgSys("]]");}


		 };
		/******************** MdctnDispns_DsgInstrctn_AsNdBooleanTyp ********************************************************************************/
		if(medicationdispensedosageinstruction.hasAsNeededBooleanType()) {

			m.addMdctnDispnsDsgInstrctnAsNdBooleanTyp("\""+medicationdispensedosageinstruction.getAsNeededBooleanType().getValueAsString()+"\"");
		} else {
			m.addMdctnDispnsDsgInstrctnAsNdBooleanTyp("NULL");
		}


		/******************** medicationdispensedosageinstructionroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensedosageinstructionroute = medicationdispensedosageinstruction.getRoute();

		/******************** MdctnDispns_DsgInstrctn_Route_Txt ********************************************************************************/
		if(medicationdispensedosageinstructionroute.hasText()) {

			m.addMdctnDispnsDsgInstrctnRouteTxt(String.valueOf(medicationdispensedosageinstructionroute.getText()));
		} else {
			m.addMdctnDispnsDsgInstrctnRouteTxt("NULL");
		}


		/******************** medicationdispensedosageinstructionroutecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationdispensedosageinstructionroutecodinglist = medicationdispensedosageinstructionroute.getCoding();
		for(int medicationdispensedosageinstructionroutecodingi = 0; medicationdispensedosageinstructionroutecodingi<medicationdispensedosageinstructionroutecodinglist.size();medicationdispensedosageinstructionroutecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationdispensedosageinstructionroutecoding = medicationdispensedosageinstructionroutecodinglist.get(medicationdispensedosageinstructionroutecodingi);

		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_Dsply ********************************************************************************/
		if(medicationdispensedosageinstructionroutecodingi == 0) {m.addMdctnDispnsDsgInstrctnRouteCdgDsply("[[");}
		if(medicationdispensedosageinstructionroutecoding.hasDisplay()) {

			m.addMdctnDispnsDsgInstrctnRouteCdgDsply(String.valueOf(medicationdispensedosageinstructionroutecoding.getDisplay()));
		} else {
			m.addMdctnDispnsDsgInstrctnRouteCdgDsply("NULL");
		}

		if(medicationdispensedosageinstructionroutecodingi == medicationdispensedosageinstructionroutecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnRouteCdgDsply("]]");}


		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensedosageinstructionroutecodingi == 0) {m.addMdctnDispnsDsgInstrctnRouteCdgVrsn("[[");}
		if(medicationdispensedosageinstructionroutecoding.hasVersion()) {

			m.addMdctnDispnsDsgInstrctnRouteCdgVrsn(String.valueOf(medicationdispensedosageinstructionroutecoding.getVersion()));
		} else {
			m.addMdctnDispnsDsgInstrctnRouteCdgVrsn("NULL");
		}

		if(medicationdispensedosageinstructionroutecodingi == medicationdispensedosageinstructionroutecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnRouteCdgVrsn("]]");}


		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_Cd ********************************************************************************/
		if(medicationdispensedosageinstructionroutecodingi == 0) {m.addMdctnDispnsDsgInstrctnRouteCdgCd("[[");}
		if(medicationdispensedosageinstructionroutecoding.hasCode()) {

			m.addMdctnDispnsDsgInstrctnRouteCdgCd(String.valueOf(medicationdispensedosageinstructionroutecoding.getCode()));
		} else {
			m.addMdctnDispnsDsgInstrctnRouteCdgCd("NULL");
		}

		if(medicationdispensedosageinstructionroutecodingi == medicationdispensedosageinstructionroutecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnRouteCdgCd("]]");}


		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensedosageinstructionroutecodingi == 0) {m.addMdctnDispnsDsgInstrctnRouteCdgUsrSltd("[[");}
		if(medicationdispensedosageinstructionroutecoding.hasUserSelected()) {

			m.addMdctnDispnsDsgInstrctnRouteCdgUsrSltd(String.valueOf(medicationdispensedosageinstructionroutecoding.getUserSelected()));
		} else {
			m.addMdctnDispnsDsgInstrctnRouteCdgUsrSltd("NULL");
		}

		if(medicationdispensedosageinstructionroutecodingi == medicationdispensedosageinstructionroutecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnRouteCdgUsrSltd("]]");}


		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_Sys ********************************************************************************/
		if(medicationdispensedosageinstructionroutecodingi == 0) {m.addMdctnDispnsDsgInstrctnRouteCdgSys("[[");}
		if(medicationdispensedosageinstructionroutecoding.hasSystem()) {

			m.addMdctnDispnsDsgInstrctnRouteCdgSys(String.valueOf(medicationdispensedosageinstructionroutecoding.getSystem()));
		} else {
			m.addMdctnDispnsDsgInstrctnRouteCdgSys("NULL");
		}

		if(medicationdispensedosageinstructionroutecodingi == medicationdispensedosageinstructionroutecodinglist.size()-1) {m.addMdctnDispnsDsgInstrctnRouteCdgSys("]]");}


		 };
		 };
		/******************** medicationdispensequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensequantity = medicationdispense.getQuantity();

		/******************** MdctnDispns_Qnty_Vl ********************************************************************************/
		if(medicationdispensequantity.hasValue()) {

			m.addMdctnDispnsQntyVl(String.valueOf(medicationdispensequantity.getValue()));
		} else {
			m.addMdctnDispnsQntyVl("NULL");
		}


		/******************** medicationdispensequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensequantitycomparator = medicationdispensequantity.getComparator();
		if(medicationdispensequantitycomparator!=null) {
			m.addMdctnDispnsQntyCmprtr(medicationdispensequantitycomparator.toCode());
		} else {
			m.addMdctnDispnsQntyCmprtr("NULL");
		}

		/******************** MdctnDispns_Qnty_Cd ********************************************************************************/
		if(medicationdispensequantity.hasCode()) {

			m.addMdctnDispnsQntyCd(String.valueOf(medicationdispensequantity.getCode()));
		} else {
			m.addMdctnDispnsQntyCd("NULL");
		}


		/******************** MdctnDispns_Qnty_Unt ********************************************************************************/
		if(medicationdispensequantity.hasUnit()) {

			m.addMdctnDispnsQntyUnt(String.valueOf(medicationdispensequantity.getUnit()));
		} else {
			m.addMdctnDispnsQntyUnt("NULL");
		}


		/******************** MdctnDispns_Qnty_Sys ********************************************************************************/
		if(medicationdispensequantity.hasSystem()) {

			m.addMdctnDispnsQntySys(String.valueOf(medicationdispensequantity.getSystem()));
		} else {
			m.addMdctnDispnsQntySys("NULL");
		}


		/******************** MdctnDispns_Destination ********************************************************************************/
		if(medicationdispense.hasDestination()) {

			if(medicationdispense.getDestination().getReference() != null) {
			m.addMdctnDispnsDestination(medicationdispense.getDestination().getReference());
			}
		} else {
			m.addMdctnDispnsDestination("NULL");
		}


		/******************** medicationdispensestatusreasoncodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensestatusreasoncodeableconcept = medicationdispense.getStatusReasonCodeableConcept();

		/******************** MdctnDispns_StsRsnCdbleCncpt_Txt ********************************************************************************/
		if(medicationdispensestatusreasoncodeableconcept.hasText()) {

			m.addMdctnDispnsStsRsnCdbleCncptTxt(String.valueOf(medicationdispensestatusreasoncodeableconcept.getText()));
		} else {
			m.addMdctnDispnsStsRsnCdbleCncptTxt("NULL");
		}


		/******************** medicationdispensestatusreasoncodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationdispensestatusreasoncodeableconceptcodinglist = medicationdispensestatusreasoncodeableconcept.getCoding();
		for(int medicationdispensestatusreasoncodeableconceptcodingi = 0; medicationdispensestatusreasoncodeableconceptcodingi<medicationdispensestatusreasoncodeableconceptcodinglist.size();medicationdispensestatusreasoncodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationdispensestatusreasoncodeableconceptcoding = medicationdispensestatusreasoncodeableconceptcodinglist.get(medicationdispensestatusreasoncodeableconceptcodingi);

		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationdispensestatusreasoncodeableconceptcodingi == 0) {m.addMdctnDispnsStsRsnCdbleCncptCdgDsply("[");}
		if(medicationdispensestatusreasoncodeableconceptcoding.hasDisplay()) {

			m.addMdctnDispnsStsRsnCdbleCncptCdgDsply(String.valueOf(medicationdispensestatusreasoncodeableconceptcoding.getDisplay()));
		} else {
			m.addMdctnDispnsStsRsnCdbleCncptCdgDsply("NULL");
		}

		if(medicationdispensestatusreasoncodeableconceptcodingi == medicationdispensestatusreasoncodeableconceptcodinglist.size()-1) {m.addMdctnDispnsStsRsnCdbleCncptCdgDsply("]");}


		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensestatusreasoncodeableconceptcodingi == 0) {m.addMdctnDispnsStsRsnCdbleCncptCdgVrsn("[");}
		if(medicationdispensestatusreasoncodeableconceptcoding.hasVersion()) {

			m.addMdctnDispnsStsRsnCdbleCncptCdgVrsn(String.valueOf(medicationdispensestatusreasoncodeableconceptcoding.getVersion()));
		} else {
			m.addMdctnDispnsStsRsnCdbleCncptCdgVrsn("NULL");
		}

		if(medicationdispensestatusreasoncodeableconceptcodingi == medicationdispensestatusreasoncodeableconceptcodinglist.size()-1) {m.addMdctnDispnsStsRsnCdbleCncptCdgVrsn("]");}


		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationdispensestatusreasoncodeableconceptcodingi == 0) {m.addMdctnDispnsStsRsnCdbleCncptCdgCd("[");}
		if(medicationdispensestatusreasoncodeableconceptcoding.hasCode()) {

			m.addMdctnDispnsStsRsnCdbleCncptCdgCd(String.valueOf(medicationdispensestatusreasoncodeableconceptcoding.getCode()));
		} else {
			m.addMdctnDispnsStsRsnCdbleCncptCdgCd("NULL");
		}

		if(medicationdispensestatusreasoncodeableconceptcodingi == medicationdispensestatusreasoncodeableconceptcodinglist.size()-1) {m.addMdctnDispnsStsRsnCdbleCncptCdgCd("]");}


		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensestatusreasoncodeableconceptcodingi == 0) {m.addMdctnDispnsStsRsnCdbleCncptCdgUsrSltd("[");}
		if(medicationdispensestatusreasoncodeableconceptcoding.hasUserSelected()) {

			m.addMdctnDispnsStsRsnCdbleCncptCdgUsrSltd(String.valueOf(medicationdispensestatusreasoncodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdctnDispnsStsRsnCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicationdispensestatusreasoncodeableconceptcodingi == medicationdispensestatusreasoncodeableconceptcodinglist.size()-1) {m.addMdctnDispnsStsRsnCdbleCncptCdgUsrSltd("]");}


		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationdispensestatusreasoncodeableconceptcodingi == 0) {m.addMdctnDispnsStsRsnCdbleCncptCdgSys("[");}
		if(medicationdispensestatusreasoncodeableconceptcoding.hasSystem()) {

			m.addMdctnDispnsStsRsnCdbleCncptCdgSys(String.valueOf(medicationdispensestatusreasoncodeableconceptcoding.getSystem()));
		} else {
			m.addMdctnDispnsStsRsnCdbleCncptCdgSys("NULL");
		}

		if(medicationdispensestatusreasoncodeableconceptcodingi == medicationdispensestatusreasoncodeableconceptcodinglist.size()-1) {m.addMdctnDispnsStsRsnCdbleCncptCdgSys("]");}


		 };
		/******************** MdctnDispns_AthrizingPrescription ********************************************************************************/
		if(medicationdispense.hasAuthorizingPrescription()) {

			String  array = "[";
			for(int incr=0; incr<medicationdispense.getAuthorizingPrescription().size(); incr++) {
				array = array + medicationdispense.getAuthorizingPrescription().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnDispnsAthrizingPrescription(array);

		} else {
			m.addMdctnDispnsAthrizingPrescription("NULL");
		}


		/******************** MdctnDispns_StsRsnRfrnc ********************************************************************************/
		if(medicationdispense.hasStatusReasonReference()) {

			if(medicationdispense.getStatusReasonReference().getReference() != null) {
			m.addMdctnDispnsStsRsnRfrnc(medicationdispense.getStatusReasonReference().getReference());
			}
		} else {
			m.addMdctnDispnsStsRsnRfrnc("NULL");
		}


		/******************** MdctnDispns_DetectedIssue ********************************************************************************/
		if(medicationdispense.hasDetectedIssue()) {

			String  array = "[";
			for(int incr=0; incr<medicationdispense.getDetectedIssue().size(); incr++) {
				array = array + medicationdispense.getDetectedIssue().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnDispnsDetectedIssue(array);

		} else {
			m.addMdctnDispnsDetectedIssue("NULL");
		}


		/******************** medicationdispensesubstitution ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationDispense.MedicationDispenseSubstitutionComponent medicationdispensesubstitution = medicationdispense.getSubstitution();

		/******************** medicationdispensesubstitutiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationdispensesubstitutiontype = medicationdispensesubstitution.getType();

		/******************** MdctnDispns_Substitution_Typ_Txt ********************************************************************************/
		if(medicationdispensesubstitutiontype.hasText()) {

			m.addMdctnDispnsSubstitutionTypTxt(String.valueOf(medicationdispensesubstitutiontype.getText()));
		} else {
			m.addMdctnDispnsSubstitutionTypTxt("NULL");
		}


		/******************** medicationdispensesubstitutiontypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationdispensesubstitutiontypecodinglist = medicationdispensesubstitutiontype.getCoding();
		for(int medicationdispensesubstitutiontypecodingi = 0; medicationdispensesubstitutiontypecodingi<medicationdispensesubstitutiontypecodinglist.size();medicationdispensesubstitutiontypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationdispensesubstitutiontypecoding = medicationdispensesubstitutiontypecodinglist.get(medicationdispensesubstitutiontypecodingi);

		/******************** MdctnDispns_Substitution_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationdispensesubstitutiontypecodingi == 0) {m.addMdctnDispnsSubstitutionTypCdgDsply("[");}
		if(medicationdispensesubstitutiontypecoding.hasDisplay()) {

			m.addMdctnDispnsSubstitutionTypCdgDsply(String.valueOf(medicationdispensesubstitutiontypecoding.getDisplay()));
		} else {
			m.addMdctnDispnsSubstitutionTypCdgDsply("NULL");
		}

		if(medicationdispensesubstitutiontypecodingi == medicationdispensesubstitutiontypecodinglist.size()-1) {m.addMdctnDispnsSubstitutionTypCdgDsply("]");}


		/******************** MdctnDispns_Substitution_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensesubstitutiontypecodingi == 0) {m.addMdctnDispnsSubstitutionTypCdgVrsn("[");}
		if(medicationdispensesubstitutiontypecoding.hasVersion()) {

			m.addMdctnDispnsSubstitutionTypCdgVrsn(String.valueOf(medicationdispensesubstitutiontypecoding.getVersion()));
		} else {
			m.addMdctnDispnsSubstitutionTypCdgVrsn("NULL");
		}

		if(medicationdispensesubstitutiontypecodingi == medicationdispensesubstitutiontypecodinglist.size()-1) {m.addMdctnDispnsSubstitutionTypCdgVrsn("]");}


		/******************** MdctnDispns_Substitution_Typ_Cdg_Cd ********************************************************************************/
		if(medicationdispensesubstitutiontypecodingi == 0) {m.addMdctnDispnsSubstitutionTypCdgCd("[");}
		if(medicationdispensesubstitutiontypecoding.hasCode()) {

			m.addMdctnDispnsSubstitutionTypCdgCd(String.valueOf(medicationdispensesubstitutiontypecoding.getCode()));
		} else {
			m.addMdctnDispnsSubstitutionTypCdgCd("NULL");
		}

		if(medicationdispensesubstitutiontypecodingi == medicationdispensesubstitutiontypecodinglist.size()-1) {m.addMdctnDispnsSubstitutionTypCdgCd("]");}


		/******************** MdctnDispns_Substitution_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensesubstitutiontypecodingi == 0) {m.addMdctnDispnsSubstitutionTypCdgUsrSltd("[");}
		if(medicationdispensesubstitutiontypecoding.hasUserSelected()) {

			m.addMdctnDispnsSubstitutionTypCdgUsrSltd(String.valueOf(medicationdispensesubstitutiontypecoding.getUserSelected()));
		} else {
			m.addMdctnDispnsSubstitutionTypCdgUsrSltd("NULL");
		}

		if(medicationdispensesubstitutiontypecodingi == medicationdispensesubstitutiontypecodinglist.size()-1) {m.addMdctnDispnsSubstitutionTypCdgUsrSltd("]");}


		/******************** MdctnDispns_Substitution_Typ_Cdg_Sys ********************************************************************************/
		if(medicationdispensesubstitutiontypecodingi == 0) {m.addMdctnDispnsSubstitutionTypCdgSys("[");}
		if(medicationdispensesubstitutiontypecoding.hasSystem()) {

			m.addMdctnDispnsSubstitutionTypCdgSys(String.valueOf(medicationdispensesubstitutiontypecoding.getSystem()));
		} else {
			m.addMdctnDispnsSubstitutionTypCdgSys("NULL");
		}

		if(medicationdispensesubstitutiontypecodingi == medicationdispensesubstitutiontypecodinglist.size()-1) {m.addMdctnDispnsSubstitutionTypCdgSys("]");}


		 };
		/******************** medicationdispensesubstitutionreason ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicationdispensesubstitutionreasonlist = medicationdispensesubstitution.getReason();
		for(int medicationdispensesubstitutionreasoni = 0; medicationdispensesubstitutionreasoni<medicationdispensesubstitutionreasonlist.size();medicationdispensesubstitutionreasoni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicationdispensesubstitutionreason = medicationdispensesubstitutionreasonlist.get(medicationdispensesubstitutionreasoni);

		/******************** MdctnDispns_Substitution_Rsn_Txt ********************************************************************************/
		if(medicationdispensesubstitutionreasoni == 0) {m.addMdctnDispnsSubstitutionRsnTxt("[");}
		if(medicationdispensesubstitutionreason.hasText()) {

			m.addMdctnDispnsSubstitutionRsnTxt(String.valueOf(medicationdispensesubstitutionreason.getText()));
		} else {
			m.addMdctnDispnsSubstitutionRsnTxt("NULL");
		}

		if(medicationdispensesubstitutionreasoni == medicationdispensesubstitutionreasonlist.size()-1) {m.addMdctnDispnsSubstitutionRsnTxt("]");}


		/******************** medicationdispensesubstitutionreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationdispensesubstitutionreasoncodinglist = medicationdispensesubstitutionreason.getCoding();
		for(int medicationdispensesubstitutionreasoncodingi = 0; medicationdispensesubstitutionreasoncodingi<medicationdispensesubstitutionreasoncodinglist.size();medicationdispensesubstitutionreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationdispensesubstitutionreasoncoding = medicationdispensesubstitutionreasoncodinglist.get(medicationdispensesubstitutionreasoncodingi);

		/******************** MdctnDispns_Substitution_Rsn_Cdg_Dsply ********************************************************************************/
		if(medicationdispensesubstitutionreasoncodingi == 0) {m.addMdctnDispnsSubstitutionRsnCdgDsply("[[");}
		if(medicationdispensesubstitutionreasoncoding.hasDisplay()) {

			m.addMdctnDispnsSubstitutionRsnCdgDsply(String.valueOf(medicationdispensesubstitutionreasoncoding.getDisplay()));
		} else {
			m.addMdctnDispnsSubstitutionRsnCdgDsply("NULL");
		}

		if(medicationdispensesubstitutionreasoncodingi == medicationdispensesubstitutionreasoncodinglist.size()-1) {m.addMdctnDispnsSubstitutionRsnCdgDsply("]]");}


		/******************** MdctnDispns_Substitution_Rsn_Cdg_Vrsn ********************************************************************************/
		if(medicationdispensesubstitutionreasoncodingi == 0) {m.addMdctnDispnsSubstitutionRsnCdgVrsn("[[");}
		if(medicationdispensesubstitutionreasoncoding.hasVersion()) {

			m.addMdctnDispnsSubstitutionRsnCdgVrsn(String.valueOf(medicationdispensesubstitutionreasoncoding.getVersion()));
		} else {
			m.addMdctnDispnsSubstitutionRsnCdgVrsn("NULL");
		}

		if(medicationdispensesubstitutionreasoncodingi == medicationdispensesubstitutionreasoncodinglist.size()-1) {m.addMdctnDispnsSubstitutionRsnCdgVrsn("]]");}


		/******************** MdctnDispns_Substitution_Rsn_Cdg_Cd ********************************************************************************/
		if(medicationdispensesubstitutionreasoncodingi == 0) {m.addMdctnDispnsSubstitutionRsnCdgCd("[[");}
		if(medicationdispensesubstitutionreasoncoding.hasCode()) {

			m.addMdctnDispnsSubstitutionRsnCdgCd(String.valueOf(medicationdispensesubstitutionreasoncoding.getCode()));
		} else {
			m.addMdctnDispnsSubstitutionRsnCdgCd("NULL");
		}

		if(medicationdispensesubstitutionreasoncodingi == medicationdispensesubstitutionreasoncodinglist.size()-1) {m.addMdctnDispnsSubstitutionRsnCdgCd("]]");}


		/******************** MdctnDispns_Substitution_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(medicationdispensesubstitutionreasoncodingi == 0) {m.addMdctnDispnsSubstitutionRsnCdgUsrSltd("[[");}
		if(medicationdispensesubstitutionreasoncoding.hasUserSelected()) {

			m.addMdctnDispnsSubstitutionRsnCdgUsrSltd(String.valueOf(medicationdispensesubstitutionreasoncoding.getUserSelected()));
		} else {
			m.addMdctnDispnsSubstitutionRsnCdgUsrSltd("NULL");
		}

		if(medicationdispensesubstitutionreasoncodingi == medicationdispensesubstitutionreasoncodinglist.size()-1) {m.addMdctnDispnsSubstitutionRsnCdgUsrSltd("]]");}


		/******************** MdctnDispns_Substitution_Rsn_Cdg_Sys ********************************************************************************/
		if(medicationdispensesubstitutionreasoncodingi == 0) {m.addMdctnDispnsSubstitutionRsnCdgSys("[[");}
		if(medicationdispensesubstitutionreasoncoding.hasSystem()) {

			m.addMdctnDispnsSubstitutionRsnCdgSys(String.valueOf(medicationdispensesubstitutionreasoncoding.getSystem()));
		} else {
			m.addMdctnDispnsSubstitutionRsnCdgSys("NULL");
		}

		if(medicationdispensesubstitutionreasoncodingi == medicationdispensesubstitutionreasoncodinglist.size()-1) {m.addMdctnDispnsSubstitutionRsnCdgSys("]]");}


		 };
		 };
		/******************** MdctnDispns_Substitution_ResponsibleParty ********************************************************************************/
		if(medicationdispensesubstitution.hasResponsibleParty()) {

			String  array = "[";
			for(int incr=0; incr<medicationdispensesubstitution.getResponsibleParty().size(); incr++) {
				array = array + medicationdispensesubstitution.getResponsibleParty().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnDispnsSubstitutionResponsibleParty(array);

		} else {
			m.addMdctnDispnsSubstitutionResponsibleParty("NULL");
		}


		/******************** MdctnDispns_Substitution_WasSubstituted ********************************************************************************/
		if(medicationdispensesubstitution.hasWasSubstituted()) {

			m.addMdctnDispnsSubstitutionWasSubstituted(String.valueOf(medicationdispensesubstitution.getWasSubstituted()));
		} else {
			m.addMdctnDispnsSubstitutionWasSubstituted("NULL");
		}


		/******************** MdctnDispns_PartOf ********************************************************************************/
		if(medicationdispense.hasPartOf()) {

			String  array = "[";
			for(int incr=0; incr<medicationdispense.getPartOf().size(); incr++) {
				array = array + medicationdispense.getPartOf().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnDispnsPartOf(array);

		} else {
			m.addMdctnDispnsPartOf("NULL");
		}


		/******************** medicationdispensedayssupply ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationdispensedayssupply = medicationdispense.getDaysSupply();

		/******************** MdctnDispns_DaysSpply_Vl ********************************************************************************/
		if(medicationdispensedayssupply.hasValue()) {

			m.addMdctnDispnsDaysSpplyVl(String.valueOf(medicationdispensedayssupply.getValue()));
		} else {
			m.addMdctnDispnsDaysSpplyVl("NULL");
		}


		/******************** medicationdispensedayssupplycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationdispensedayssupplycomparator = medicationdispensedayssupply.getComparator();
		if(medicationdispensedayssupplycomparator!=null) {
			m.addMdctnDispnsDaysSpplyCmprtr(medicationdispensedayssupplycomparator.toCode());
		} else {
			m.addMdctnDispnsDaysSpplyCmprtr("NULL");
		}

		/******************** MdctnDispns_DaysSpply_Cd ********************************************************************************/
		if(medicationdispensedayssupply.hasCode()) {

			m.addMdctnDispnsDaysSpplyCd(String.valueOf(medicationdispensedayssupply.getCode()));
		} else {
			m.addMdctnDispnsDaysSpplyCd("NULL");
		}


		/******************** MdctnDispns_DaysSpply_Unt ********************************************************************************/
		if(medicationdispensedayssupply.hasUnit()) {

			m.addMdctnDispnsDaysSpplyUnt(String.valueOf(medicationdispensedayssupply.getUnit()));
		} else {
			m.addMdctnDispnsDaysSpplyUnt("NULL");
		}


		/******************** MdctnDispns_DaysSpply_Sys ********************************************************************************/
		if(medicationdispensedayssupply.hasSystem()) {

			m.addMdctnDispnsDaysSpplySys(String.valueOf(medicationdispensedayssupply.getSystem()));
		} else {
			m.addMdctnDispnsDaysSpplySys("NULL");
		}


		/******************** MdctnDispns_WhenHandedOver ********************************************************************************/
		if(medicationdispense.hasWhenHandedOver()) {

			m.addMdctnDispnsWhenHandedOver("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationdispense.getWhenHandedOver())+"\"");
		} else {
			m.addMdctnDispnsWhenHandedOver("NULL");
		}


		/******************** MdctnDispns_WhenPrepared ********************************************************************************/
		if(medicationdispense.hasWhenPrepared()) {

			m.addMdctnDispnsWhenPrepared("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationdispense.getWhenPrepared())+"\"");
		} else {
			m.addMdctnDispnsWhenPrepared("NULL");
		}


		/******************** MdctnDispns_Receiver ********************************************************************************/
		if(medicationdispense.hasReceiver()) {

			String  array = "[";
			for(int incr=0; incr<medicationdispense.getReceiver().size(); incr++) {
				array = array + medicationdispense.getReceiver().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnDispnsReceiver(array);

		} else {
			m.addMdctnDispnsReceiver("NULL");
		}


		/******************** MdctnDispns_EvntHis ********************************************************************************/
		if(medicationdispense.hasEventHistory()) {

			String  array = "[";
			for(int incr=0; incr<medicationdispense.getEventHistory().size(); incr++) {
				array = array + medicationdispense.getEventHistory().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdctnDispnsEvntHis(array);

		} else {
			m.addMdctnDispnsEvntHis("NULL");
		}


		return m;
	}
}
