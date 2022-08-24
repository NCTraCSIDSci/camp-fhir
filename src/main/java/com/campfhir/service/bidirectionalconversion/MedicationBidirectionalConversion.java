package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Medication;
public class MedicationBidirectionalConversion 
{
	public Medication Medications(org.hl7.fhir.r4.model.Medication medication) throws ParseException
	{
		 main.java.com.campfhir.model.Medication m = new  main.java.com.campfhir.model.Medication();

		/******************** id ********************************************************************************/
		m.setId(medication.getIdElement().getIdPart());

		/******************** medicationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationcode = medication.getCode();

		/******************** Mdctn_Cd_Txt ********************************************************************************/
		if(medicationcode.hasText()) {

			m.addMdctnCdTxt(String.valueOf(medicationcode.getText()));
		} else {
			m.addMdctnCdTxt("NULL");
		}


		/******************** medicationcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationcodecodinglist = medicationcode.getCoding();
		for(int medicationcodecodingi = 0; medicationcodecodingi<medicationcodecodinglist.size();medicationcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationcodecoding = medicationcodecodinglist.get(medicationcodecodingi);

		/******************** Mdctn_Cd_Cdg_Dsply ********************************************************************************/
		if(medicationcodecodingi == 0) {m.addMdctnCdCdgDsply("[");}
		if(medicationcodecoding.hasDisplay()) {

			m.addMdctnCdCdgDsply(String.valueOf(medicationcodecoding.getDisplay()));
		} else {
			m.addMdctnCdCdgDsply("NULL");
		}

		if(medicationcodecodingi == medicationcodecodinglist.size()-1) {m.addMdctnCdCdgDsply("]");}


		/******************** Mdctn_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicationcodecodingi == 0) {m.addMdctnCdCdgVrsn("[");}
		if(medicationcodecoding.hasVersion()) {

			m.addMdctnCdCdgVrsn(String.valueOf(medicationcodecoding.getVersion()));
		} else {
			m.addMdctnCdCdgVrsn("NULL");
		}

		if(medicationcodecodingi == medicationcodecodinglist.size()-1) {m.addMdctnCdCdgVrsn("]");}


		/******************** Mdctn_Cd_Cdg_Cd ********************************************************************************/
		if(medicationcodecodingi == 0) {m.addMdctnCdCdgCd("[");}
		if(medicationcodecoding.hasCode()) {

			m.addMdctnCdCdgCd(String.valueOf(medicationcodecoding.getCode()));
		} else {
			m.addMdctnCdCdgCd("NULL");
		}

		if(medicationcodecodingi == medicationcodecodinglist.size()-1) {m.addMdctnCdCdgCd("]");}


		/******************** Mdctn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicationcodecodingi == 0) {m.addMdctnCdCdgUsrSltd("[");}
		if(medicationcodecoding.hasUserSelected()) {

			m.addMdctnCdCdgUsrSltd(String.valueOf(medicationcodecoding.getUserSelected()));
		} else {
			m.addMdctnCdCdgUsrSltd("NULL");
		}

		if(medicationcodecodingi == medicationcodecodinglist.size()-1) {m.addMdctnCdCdgUsrSltd("]");}


		/******************** Mdctn_Cd_Cdg_Sys ********************************************************************************/
		if(medicationcodecodingi == 0) {m.addMdctnCdCdgSys("[");}
		if(medicationcodecoding.hasSystem()) {

			m.addMdctnCdCdgSys(String.valueOf(medicationcodecoding.getSystem()));
		} else {
			m.addMdctnCdCdgSys("NULL");
		}

		if(medicationcodecodingi == medicationcodecodinglist.size()-1) {m.addMdctnCdCdgSys("]");}


		 };
		/******************** medicationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Medication.MedicationStatus medicationstatus = medication.getStatus();
		if(medicationstatus!=null) {
			m.addMdctnSts(medicationstatus.toCode());
		} else {
			m.addMdctnSts("NULL");
		}

		/******************** medicationidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> medicationidentifierlist = medication.getIdentifier();
		for(int medicationidentifieri = 0; medicationidentifieri<medicationidentifierlist.size();medicationidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  medicationidentifier = medicationidentifierlist.get(medicationidentifieri);

		/******************** Mdctn_Id_Vl ********************************************************************************/
		if(medicationidentifieri == 0) {m.addMdctnIdVl("[");}
		if(medicationidentifier.hasValue()) {

			m.addMdctnIdVl(String.valueOf(medicationidentifier.getValue()));
		} else {
			m.addMdctnIdVl("NULL");
		}

		if(medicationidentifieri == medicationidentifierlist.size()-1) {m.addMdctnIdVl("]");}


		/******************** medicationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationidentifiertype = medicationidentifier.getType();

		/******************** Mdctn_Id_Typ_Txt ********************************************************************************/
		if(medicationidentifieri == 0) {m.addMdctnIdTypTxt("[");}
		if(medicationidentifiertype.hasText()) {

			m.addMdctnIdTypTxt(String.valueOf(medicationidentifiertype.getText()));
		} else {
			m.addMdctnIdTypTxt("NULL");
		}

		if(medicationidentifieri == medicationidentifierlist.size()-1) {m.addMdctnIdTypTxt("]");}


		/******************** medicationidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationidentifiertypecodinglist = medicationidentifiertype.getCoding();
		for(int medicationidentifiertypecodingi = 0; medicationidentifiertypecodingi<medicationidentifiertypecodinglist.size();medicationidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationidentifiertypecoding = medicationidentifiertypecodinglist.get(medicationidentifiertypecodingi);

		/******************** Mdctn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicationidentifiertypecodingi == 0) {m.addMdctnIdTypCdgDsply("[[");}
		if(medicationidentifiertypecoding.hasDisplay()) {

			m.addMdctnIdTypCdgDsply(String.valueOf(medicationidentifiertypecoding.getDisplay()));
		} else {
			m.addMdctnIdTypCdgDsply("NULL");
		}

		if(medicationidentifiertypecodingi == medicationidentifiertypecodinglist.size()-1) {m.addMdctnIdTypCdgDsply("]]");}


		/******************** Mdctn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicationidentifiertypecodingi == 0) {m.addMdctnIdTypCdgVrsn("[[");}
		if(medicationidentifiertypecoding.hasVersion()) {

			m.addMdctnIdTypCdgVrsn(String.valueOf(medicationidentifiertypecoding.getVersion()));
		} else {
			m.addMdctnIdTypCdgVrsn("NULL");
		}

		if(medicationidentifiertypecodingi == medicationidentifiertypecodinglist.size()-1) {m.addMdctnIdTypCdgVrsn("]]");}


		/******************** Mdctn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicationidentifiertypecodingi == 0) {m.addMdctnIdTypCdgCd("[[");}
		if(medicationidentifiertypecoding.hasCode()) {

			m.addMdctnIdTypCdgCd(String.valueOf(medicationidentifiertypecoding.getCode()));
		} else {
			m.addMdctnIdTypCdgCd("NULL");
		}

		if(medicationidentifiertypecodingi == medicationidentifiertypecodinglist.size()-1) {m.addMdctnIdTypCdgCd("]]");}


		/******************** Mdctn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicationidentifiertypecodingi == 0) {m.addMdctnIdTypCdgUsrSltd("[[");}
		if(medicationidentifiertypecoding.hasUserSelected()) {

			m.addMdctnIdTypCdgUsrSltd(String.valueOf(medicationidentifiertypecoding.getUserSelected()));
		} else {
			m.addMdctnIdTypCdgUsrSltd("NULL");
		}

		if(medicationidentifiertypecodingi == medicationidentifiertypecodinglist.size()-1) {m.addMdctnIdTypCdgUsrSltd("]]");}


		/******************** Mdctn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicationidentifiertypecodingi == 0) {m.addMdctnIdTypCdgSys("[[");}
		if(medicationidentifiertypecoding.hasSystem()) {

			m.addMdctnIdTypCdgSys(String.valueOf(medicationidentifiertypecoding.getSystem()));
		} else {
			m.addMdctnIdTypCdgSys("NULL");
		}

		if(medicationidentifiertypecodingi == medicationidentifiertypecodinglist.size()-1) {m.addMdctnIdTypCdgSys("]]");}


		 };
		/******************** medicationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationidentifierperiod = medicationidentifier.getPeriod();

		/******************** Mdctn_Id_Prd_Strt ********************************************************************************/
		if(medicationidentifieri == 0) {m.addMdctnIdPrdStrt("[");}
		if(medicationidentifierperiod.hasStart()) {

			m.addMdctnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationidentifierperiod.getStart())+"\"");
		} else {
			m.addMdctnIdPrdStrt("NULL");
		}

		if(medicationidentifieri == medicationidentifierlist.size()-1) {m.addMdctnIdPrdStrt("]");}


		/******************** Mdctn_Id_Prd_End ********************************************************************************/
		if(medicationidentifieri == 0) {m.addMdctnIdPrdEnd("[");}
		if(medicationidentifierperiod.hasEnd()) {

			m.addMdctnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationidentifierperiod.getEnd())+"\"");
		} else {
			m.addMdctnIdPrdEnd("NULL");
		}

		if(medicationidentifieri == medicationidentifierlist.size()-1) {m.addMdctnIdPrdEnd("]");}


		/******************** medicationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicationidentifieruse = medicationidentifier.getUse();
		if(medicationidentifieruse!=null) {
		if(medicationidentifieri == 0) {

		m.addMdctnIdUse("[");		}
			m.addMdctnIdUse(medicationidentifieruse.toCode());
		if(medicationidentifieri == medicationidentifierlist.size()-1) {

		m.addMdctnIdUse("]");		}

		} else {
			m.addMdctnIdUse("NULL");
		}

		/******************** Mdctn_Id_Assigner ********************************************************************************/
		if(medicationidentifieri == 0) {m.addMdctnIdAssigner("[");}
		if(medicationidentifier.hasAssigner()) {

			if(medicationidentifier.getAssigner().getReference() != null) {
			m.addMdctnIdAssigner(medicationidentifier.getAssigner().getReference());
			}
		} else {
			m.addMdctnIdAssigner("NULL");
		}

		if(medicationidentifieri == medicationidentifierlist.size()-1) {m.addMdctnIdAssigner("]");}


		/******************** Mdctn_Id_Sys ********************************************************************************/
		if(medicationidentifieri == 0) {m.addMdctnIdSys("[");}
		if(medicationidentifier.hasSystem()) {

			m.addMdctnIdSys(String.valueOf(medicationidentifier.getSystem()));
		} else {
			m.addMdctnIdSys("NULL");
		}

		if(medicationidentifieri == medicationidentifierlist.size()-1) {m.addMdctnIdSys("]");}


		 };
		/******************** medicationform ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationform = medication.getForm();

		/******************** Mdctn_Frm_Txt ********************************************************************************/
		if(medicationform.hasText()) {

			m.addMdctnFrmTxt(String.valueOf(medicationform.getText()));
		} else {
			m.addMdctnFrmTxt("NULL");
		}


		/******************** medicationformcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationformcodinglist = medicationform.getCoding();
		for(int medicationformcodingi = 0; medicationformcodingi<medicationformcodinglist.size();medicationformcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationformcoding = medicationformcodinglist.get(medicationformcodingi);

		/******************** Mdctn_Frm_Cdg_Dsply ********************************************************************************/
		if(medicationformcodingi == 0) {m.addMdctnFrmCdgDsply("[");}
		if(medicationformcoding.hasDisplay()) {

			m.addMdctnFrmCdgDsply(String.valueOf(medicationformcoding.getDisplay()));
		} else {
			m.addMdctnFrmCdgDsply("NULL");
		}

		if(medicationformcodingi == medicationformcodinglist.size()-1) {m.addMdctnFrmCdgDsply("]");}


		/******************** Mdctn_Frm_Cdg_Vrsn ********************************************************************************/
		if(medicationformcodingi == 0) {m.addMdctnFrmCdgVrsn("[");}
		if(medicationformcoding.hasVersion()) {

			m.addMdctnFrmCdgVrsn(String.valueOf(medicationformcoding.getVersion()));
		} else {
			m.addMdctnFrmCdgVrsn("NULL");
		}

		if(medicationformcodingi == medicationformcodinglist.size()-1) {m.addMdctnFrmCdgVrsn("]");}


		/******************** Mdctn_Frm_Cdg_Cd ********************************************************************************/
		if(medicationformcodingi == 0) {m.addMdctnFrmCdgCd("[");}
		if(medicationformcoding.hasCode()) {

			m.addMdctnFrmCdgCd(String.valueOf(medicationformcoding.getCode()));
		} else {
			m.addMdctnFrmCdgCd("NULL");
		}

		if(medicationformcodingi == medicationformcodinglist.size()-1) {m.addMdctnFrmCdgCd("]");}


		/******************** Mdctn_Frm_Cdg_UsrSltd ********************************************************************************/
		if(medicationformcodingi == 0) {m.addMdctnFrmCdgUsrSltd("[");}
		if(medicationformcoding.hasUserSelected()) {

			m.addMdctnFrmCdgUsrSltd(String.valueOf(medicationformcoding.getUserSelected()));
		} else {
			m.addMdctnFrmCdgUsrSltd("NULL");
		}

		if(medicationformcodingi == medicationformcodinglist.size()-1) {m.addMdctnFrmCdgUsrSltd("]");}


		/******************** Mdctn_Frm_Cdg_Sys ********************************************************************************/
		if(medicationformcodingi == 0) {m.addMdctnFrmCdgSys("[");}
		if(medicationformcoding.hasSystem()) {

			m.addMdctnFrmCdgSys(String.valueOf(medicationformcoding.getSystem()));
		} else {
			m.addMdctnFrmCdgSys("NULL");
		}

		if(medicationformcodingi == medicationformcodinglist.size()-1) {m.addMdctnFrmCdgSys("]");}


		 };
		/******************** medicationamount ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationamount = medication.getAmount();

		/******************** medicationamountnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationamountnumerator = medicationamount.getNumerator();

		/******************** Mdctn_Amnt_Nmrtr_Vl ********************************************************************************/
		if(medicationamountnumerator.hasValue()) {

			m.addMdctnAmntNmrtrVl(String.valueOf(medicationamountnumerator.getValue()));
		} else {
			m.addMdctnAmntNmrtrVl("NULL");
		}


		/******************** medicationamountnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationamountnumeratorcomparator = medicationamountnumerator.getComparator();
		if(medicationamountnumeratorcomparator!=null) {
			m.addMdctnAmntNmrtrCmprtr(medicationamountnumeratorcomparator.toCode());
		} else {
			m.addMdctnAmntNmrtrCmprtr("NULL");
		}

		/******************** Mdctn_Amnt_Nmrtr_Cd ********************************************************************************/
		if(medicationamountnumerator.hasCode()) {

			m.addMdctnAmntNmrtrCd(String.valueOf(medicationamountnumerator.getCode()));
		} else {
			m.addMdctnAmntNmrtrCd("NULL");
		}


		/******************** Mdctn_Amnt_Nmrtr_Unt ********************************************************************************/
		if(medicationamountnumerator.hasUnit()) {

			m.addMdctnAmntNmrtrUnt(String.valueOf(medicationamountnumerator.getUnit()));
		} else {
			m.addMdctnAmntNmrtrUnt("NULL");
		}


		/******************** Mdctn_Amnt_Nmrtr_Sys ********************************************************************************/
		if(medicationamountnumerator.hasSystem()) {

			m.addMdctnAmntNmrtrSys(String.valueOf(medicationamountnumerator.getSystem()));
		} else {
			m.addMdctnAmntNmrtrSys("NULL");
		}


		/******************** medicationamountdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationamountdenominator = medicationamount.getDenominator();

		/******************** Mdctn_Amnt_Dnmntr_Vl ********************************************************************************/
		if(medicationamountdenominator.hasValue()) {

			m.addMdctnAmntDnmntrVl(String.valueOf(medicationamountdenominator.getValue()));
		} else {
			m.addMdctnAmntDnmntrVl("NULL");
		}


		/******************** medicationamountdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationamountdenominatorcomparator = medicationamountdenominator.getComparator();
		if(medicationamountdenominatorcomparator!=null) {
			m.addMdctnAmntDnmntrCmprtr(medicationamountdenominatorcomparator.toCode());
		} else {
			m.addMdctnAmntDnmntrCmprtr("NULL");
		}

		/******************** Mdctn_Amnt_Dnmntr_Cd ********************************************************************************/
		if(medicationamountdenominator.hasCode()) {

			m.addMdctnAmntDnmntrCd(String.valueOf(medicationamountdenominator.getCode()));
		} else {
			m.addMdctnAmntDnmntrCd("NULL");
		}


		/******************** Mdctn_Amnt_Dnmntr_Unt ********************************************************************************/
		if(medicationamountdenominator.hasUnit()) {

			m.addMdctnAmntDnmntrUnt(String.valueOf(medicationamountdenominator.getUnit()));
		} else {
			m.addMdctnAmntDnmntrUnt("NULL");
		}


		/******************** Mdctn_Amnt_Dnmntr_Sys ********************************************************************************/
		if(medicationamountdenominator.hasSystem()) {

			m.addMdctnAmntDnmntrSys(String.valueOf(medicationamountdenominator.getSystem()));
		} else {
			m.addMdctnAmntDnmntrSys("NULL");
		}


		/******************** medicationingredient ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Medication.MedicationIngredientComponent> medicationingredientlist = medication.getIngredient();
		for(int medicationingredienti = 0; medicationingredienti<medicationingredientlist.size();medicationingredienti++ ) {
		org.hl7.fhir.r4.model.Medication.MedicationIngredientComponent  medicationingredient = medicationingredientlist.get(medicationingredienti);

		/******************** Mdctn_Igrdnt_IsActive ********************************************************************************/
		if(medicationingredienti == 0) {m.addMdctnIgrdntIsActive("[");}
		if(medicationingredient.hasIsActive()) {

			m.addMdctnIgrdntIsActive(String.valueOf(medicationingredient.getIsActive()));
		} else {
			m.addMdctnIgrdntIsActive("NULL");
		}

		if(medicationingredienti == medicationingredientlist.size()-1) {m.addMdctnIgrdntIsActive("]");}


		/******************** medicationingredientstrength ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationingredientstrength = medicationingredient.getStrength();

		/******************** medicationingredientstrengthnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationingredientstrengthnumerator = medicationingredientstrength.getNumerator();

		/******************** Mdctn_Igrdnt_Str_Nmrtr_Vl ********************************************************************************/
		if(medicationingredienti == 0) {m.addMdctnIgrdntStrNmrtrVl("[");}
		if(medicationingredientstrengthnumerator.hasValue()) {

			m.addMdctnIgrdntStrNmrtrVl(String.valueOf(medicationingredientstrengthnumerator.getValue()));
		} else {
			m.addMdctnIgrdntStrNmrtrVl("NULL");
		}

		if(medicationingredienti == medicationingredientlist.size()-1) {m.addMdctnIgrdntStrNmrtrVl("]");}


		/******************** medicationingredientstrengthnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationingredientstrengthnumeratorcomparator = medicationingredientstrengthnumerator.getComparator();
		if(medicationingredientstrengthnumeratorcomparator!=null) {
		if(medicationingredienti == 0) {

		m.addMdctnIgrdntStrNmrtrCmprtr("[");		}
			m.addMdctnIgrdntStrNmrtrCmprtr(medicationingredientstrengthnumeratorcomparator.toCode());
		if(medicationingredienti == medicationingredientlist.size()-1) {

		m.addMdctnIgrdntStrNmrtrCmprtr("]");		}

		} else {
			m.addMdctnIgrdntStrNmrtrCmprtr("NULL");
		}

		/******************** Mdctn_Igrdnt_Str_Nmrtr_Cd ********************************************************************************/
		if(medicationingredienti == 0) {m.addMdctnIgrdntStrNmrtrCd("[");}
		if(medicationingredientstrengthnumerator.hasCode()) {

			m.addMdctnIgrdntStrNmrtrCd(String.valueOf(medicationingredientstrengthnumerator.getCode()));
		} else {
			m.addMdctnIgrdntStrNmrtrCd("NULL");
		}

		if(medicationingredienti == medicationingredientlist.size()-1) {m.addMdctnIgrdntStrNmrtrCd("]");}


		/******************** Mdctn_Igrdnt_Str_Nmrtr_Unt ********************************************************************************/
		if(medicationingredienti == 0) {m.addMdctnIgrdntStrNmrtrUnt("[");}
		if(medicationingredientstrengthnumerator.hasUnit()) {

			m.addMdctnIgrdntStrNmrtrUnt(String.valueOf(medicationingredientstrengthnumerator.getUnit()));
		} else {
			m.addMdctnIgrdntStrNmrtrUnt("NULL");
		}

		if(medicationingredienti == medicationingredientlist.size()-1) {m.addMdctnIgrdntStrNmrtrUnt("]");}


		/******************** Mdctn_Igrdnt_Str_Nmrtr_Sys ********************************************************************************/
		if(medicationingredienti == 0) {m.addMdctnIgrdntStrNmrtrSys("[");}
		if(medicationingredientstrengthnumerator.hasSystem()) {

			m.addMdctnIgrdntStrNmrtrSys(String.valueOf(medicationingredientstrengthnumerator.getSystem()));
		} else {
			m.addMdctnIgrdntStrNmrtrSys("NULL");
		}

		if(medicationingredienti == medicationingredientlist.size()-1) {m.addMdctnIgrdntStrNmrtrSys("]");}


		/******************** medicationingredientstrengthdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationingredientstrengthdenominator = medicationingredientstrength.getDenominator();

		/******************** Mdctn_Igrdnt_Str_Dnmntr_Vl ********************************************************************************/
		if(medicationingredienti == 0) {m.addMdctnIgrdntStrDnmntrVl("[");}
		if(medicationingredientstrengthdenominator.hasValue()) {

			m.addMdctnIgrdntStrDnmntrVl(String.valueOf(medicationingredientstrengthdenominator.getValue()));
		} else {
			m.addMdctnIgrdntStrDnmntrVl("NULL");
		}

		if(medicationingredienti == medicationingredientlist.size()-1) {m.addMdctnIgrdntStrDnmntrVl("]");}


		/******************** medicationingredientstrengthdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicationingredientstrengthdenominatorcomparator = medicationingredientstrengthdenominator.getComparator();
		if(medicationingredientstrengthdenominatorcomparator!=null) {
		if(medicationingredienti == 0) {

		m.addMdctnIgrdntStrDnmntrCmprtr("[");		}
			m.addMdctnIgrdntStrDnmntrCmprtr(medicationingredientstrengthdenominatorcomparator.toCode());
		if(medicationingredienti == medicationingredientlist.size()-1) {

		m.addMdctnIgrdntStrDnmntrCmprtr("]");		}

		} else {
			m.addMdctnIgrdntStrDnmntrCmprtr("NULL");
		}

		/******************** Mdctn_Igrdnt_Str_Dnmntr_Cd ********************************************************************************/
		if(medicationingredienti == 0) {m.addMdctnIgrdntStrDnmntrCd("[");}
		if(medicationingredientstrengthdenominator.hasCode()) {

			m.addMdctnIgrdntStrDnmntrCd(String.valueOf(medicationingredientstrengthdenominator.getCode()));
		} else {
			m.addMdctnIgrdntStrDnmntrCd("NULL");
		}

		if(medicationingredienti == medicationingredientlist.size()-1) {m.addMdctnIgrdntStrDnmntrCd("]");}


		/******************** Mdctn_Igrdnt_Str_Dnmntr_Unt ********************************************************************************/
		if(medicationingredienti == 0) {m.addMdctnIgrdntStrDnmntrUnt("[");}
		if(medicationingredientstrengthdenominator.hasUnit()) {

			m.addMdctnIgrdntStrDnmntrUnt(String.valueOf(medicationingredientstrengthdenominator.getUnit()));
		} else {
			m.addMdctnIgrdntStrDnmntrUnt("NULL");
		}

		if(medicationingredienti == medicationingredientlist.size()-1) {m.addMdctnIgrdntStrDnmntrUnt("]");}


		/******************** Mdctn_Igrdnt_Str_Dnmntr_Sys ********************************************************************************/
		if(medicationingredienti == 0) {m.addMdctnIgrdntStrDnmntrSys("[");}
		if(medicationingredientstrengthdenominator.hasSystem()) {

			m.addMdctnIgrdntStrDnmntrSys(String.valueOf(medicationingredientstrengthdenominator.getSystem()));
		} else {
			m.addMdctnIgrdntStrDnmntrSys("NULL");
		}

		if(medicationingredienti == medicationingredientlist.size()-1) {m.addMdctnIgrdntStrDnmntrSys("]");}


		/******************** Mdctn_Igrdnt_ItmRfrnc ********************************************************************************/
		if(medicationingredienti == 0) {m.addMdctnIgrdntItmRfrnc("[");}
		if(medicationingredient.hasItemReference()) {

			if(medicationingredient.getItemReference().getReference() != null) {
			m.addMdctnIgrdntItmRfrnc(medicationingredient.getItemReference().getReference());
			}
		} else {
			m.addMdctnIgrdntItmRfrnc("NULL");
		}

		if(medicationingredienti == medicationingredientlist.size()-1) {m.addMdctnIgrdntItmRfrnc("]");}


		/******************** medicationingredientitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationingredientitemcodeableconcept = medicationingredient.getItemCodeableConcept();

		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Txt ********************************************************************************/
		if(medicationingredienti == 0) {m.addMdctnIgrdntItmCdbleCncptTxt("[");}
		if(medicationingredientitemcodeableconcept.hasText()) {

			m.addMdctnIgrdntItmCdbleCncptTxt(String.valueOf(medicationingredientitemcodeableconcept.getText()));
		} else {
			m.addMdctnIgrdntItmCdbleCncptTxt("NULL");
		}

		if(medicationingredienti == medicationingredientlist.size()-1) {m.addMdctnIgrdntItmCdbleCncptTxt("]");}


		/******************** medicationingredientitemcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicationingredientitemcodeableconceptcodinglist = medicationingredientitemcodeableconcept.getCoding();
		for(int medicationingredientitemcodeableconceptcodingi = 0; medicationingredientitemcodeableconceptcodingi<medicationingredientitemcodeableconceptcodinglist.size();medicationingredientitemcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicationingredientitemcodeableconceptcoding = medicationingredientitemcodeableconceptcodinglist.get(medicationingredientitemcodeableconceptcodingi);

		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicationingredientitemcodeableconceptcodingi == 0) {m.addMdctnIgrdntItmCdbleCncptCdgDsply("[[");}
		if(medicationingredientitemcodeableconceptcoding.hasDisplay()) {

			m.addMdctnIgrdntItmCdbleCncptCdgDsply(String.valueOf(medicationingredientitemcodeableconceptcoding.getDisplay()));
		} else {
			m.addMdctnIgrdntItmCdbleCncptCdgDsply("NULL");
		}

		if(medicationingredientitemcodeableconceptcodingi == medicationingredientitemcodeableconceptcodinglist.size()-1) {m.addMdctnIgrdntItmCdbleCncptCdgDsply("]]");}


		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicationingredientitemcodeableconceptcodingi == 0) {m.addMdctnIgrdntItmCdbleCncptCdgVrsn("[[");}
		if(medicationingredientitemcodeableconceptcoding.hasVersion()) {

			m.addMdctnIgrdntItmCdbleCncptCdgVrsn(String.valueOf(medicationingredientitemcodeableconceptcoding.getVersion()));
		} else {
			m.addMdctnIgrdntItmCdbleCncptCdgVrsn("NULL");
		}

		if(medicationingredientitemcodeableconceptcodingi == medicationingredientitemcodeableconceptcodinglist.size()-1) {m.addMdctnIgrdntItmCdbleCncptCdgVrsn("]]");}


		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicationingredientitemcodeableconceptcodingi == 0) {m.addMdctnIgrdntItmCdbleCncptCdgCd("[[");}
		if(medicationingredientitemcodeableconceptcoding.hasCode()) {

			m.addMdctnIgrdntItmCdbleCncptCdgCd(String.valueOf(medicationingredientitemcodeableconceptcoding.getCode()));
		} else {
			m.addMdctnIgrdntItmCdbleCncptCdgCd("NULL");
		}

		if(medicationingredientitemcodeableconceptcodingi == medicationingredientitemcodeableconceptcodinglist.size()-1) {m.addMdctnIgrdntItmCdbleCncptCdgCd("]]");}


		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicationingredientitemcodeableconceptcodingi == 0) {m.addMdctnIgrdntItmCdbleCncptCdgUsrSltd("[[");}
		if(medicationingredientitemcodeableconceptcoding.hasUserSelected()) {

			m.addMdctnIgrdntItmCdbleCncptCdgUsrSltd(String.valueOf(medicationingredientitemcodeableconceptcoding.getUserSelected()));
		} else {
			m.addMdctnIgrdntItmCdbleCncptCdgUsrSltd("NULL");
		}

		if(medicationingredientitemcodeableconceptcodingi == medicationingredientitemcodeableconceptcodinglist.size()-1) {m.addMdctnIgrdntItmCdbleCncptCdgUsrSltd("]]");}


		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicationingredientitemcodeableconceptcodingi == 0) {m.addMdctnIgrdntItmCdbleCncptCdgSys("[[");}
		if(medicationingredientitemcodeableconceptcoding.hasSystem()) {

			m.addMdctnIgrdntItmCdbleCncptCdgSys(String.valueOf(medicationingredientitemcodeableconceptcoding.getSystem()));
		} else {
			m.addMdctnIgrdntItmCdbleCncptCdgSys("NULL");
		}

		if(medicationingredientitemcodeableconceptcodingi == medicationingredientitemcodeableconceptcodinglist.size()-1) {m.addMdctnIgrdntItmCdbleCncptCdgSys("]]");}


		 };
		 };
		/******************** Mdctn_Manufacturer ********************************************************************************/
		if(medication.hasManufacturer()) {

			if(medication.getManufacturer().getReference() != null) {
			m.addMdctnManufacturer(medication.getManufacturer().getReference());
			}
		} else {
			m.addMdctnManufacturer("NULL");
		}


		/******************** medicationbatch ********************************************************************************/
		org.hl7.fhir.r4.model.Medication.MedicationBatchComponent medicationbatch = medication.getBatch();

		/******************** Mdctn_Batch_ExpirationDt ********************************************************************************/
		if(medicationbatch.hasExpirationDate()) {

			m.addMdctnBatchExpirationDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicationbatch.getExpirationDate())+"\"");
		} else {
			m.addMdctnBatchExpirationDt("NULL");
		}


		/******************** Mdctn_Batch_LotNmbr ********************************************************************************/
		if(medicationbatch.hasLotNumber()) {

			m.addMdctnBatchLotNmbr(String.valueOf(medicationbatch.getLotNumber()));
		} else {
			m.addMdctnBatchLotNmbr("NULL");
		}


		return m;
	}
}
