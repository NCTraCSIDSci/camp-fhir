package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductIngredient;
public class MedicinalProductIngredientBidirectionalConversion 
{
	public MedicinalProductIngredient MedicinalProductIngredients(org.hl7.fhir.r4.model.MedicinalProductIngredient medicinalproductingredient) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProductIngredient m = new  main.java.com.campfhir.model.MedicinalProductIngredient();

		/******************** id ********************************************************************************/
		m.setId(medicinalproductingredient.getIdElement().getIdPart());

		/******************** medicinalproductingredientidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductingredientidentifier = medicinalproductingredient.getIdentifier();

		/******************** MdcnlPrdctIgrdnt_Id_Vl ********************************************************************************/
		if(medicinalproductingredientidentifier.hasValue()) {

			m.addMdcnlPrdctIgrdntIdVl(String.valueOf(medicinalproductingredientidentifier.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntIdVl("NULL");
		}


		/******************** medicinalproductingredientidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientidentifiertype = medicinalproductingredientidentifier.getType();

		/******************** MdcnlPrdctIgrdnt_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductingredientidentifiertype.hasText()) {

			m.addMdcnlPrdctIgrdntIdTypTxt(String.valueOf(medicinalproductingredientidentifiertype.getText()));
		} else {
			m.addMdcnlPrdctIgrdntIdTypTxt("NULL");
		}


		/******************** medicinalproductingredientidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductingredientidentifiertypecodinglist = medicinalproductingredientidentifiertype.getCoding();
		for(int medicinalproductingredientidentifiertypecodingi = 0; medicinalproductingredientidentifiertypecodingi<medicinalproductingredientidentifiertypecodinglist.size();medicinalproductingredientidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductingredientidentifiertypecoding = medicinalproductingredientidentifiertypecodinglist.get(medicinalproductingredientidentifiertypecodingi);

		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientidentifiertypecodingi == 0) {m.addMdcnlPrdctIgrdntIdTypCdgDsply("[");}
		if(medicinalproductingredientidentifiertypecoding.hasDisplay()) {

			m.addMdcnlPrdctIgrdntIdTypCdgDsply(String.valueOf(medicinalproductingredientidentifiertypecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIgrdntIdTypCdgDsply("NULL");
		}

		if(medicinalproductingredientidentifiertypecodingi == medicinalproductingredientidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctIgrdntIdTypCdgDsply("]");}


		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientidentifiertypecodingi == 0) {m.addMdcnlPrdctIgrdntIdTypCdgVrsn("[");}
		if(medicinalproductingredientidentifiertypecoding.hasVersion()) {

			m.addMdcnlPrdctIgrdntIdTypCdgVrsn(String.valueOf(medicinalproductingredientidentifiertypecoding.getVersion()));
		} else {
			m.addMdcnlPrdctIgrdntIdTypCdgVrsn("NULL");
		}

		if(medicinalproductingredientidentifiertypecodingi == medicinalproductingredientidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctIgrdntIdTypCdgVrsn("]");}


		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientidentifiertypecodingi == 0) {m.addMdcnlPrdctIgrdntIdTypCdgCd("[");}
		if(medicinalproductingredientidentifiertypecoding.hasCode()) {

			m.addMdcnlPrdctIgrdntIdTypCdgCd(String.valueOf(medicinalproductingredientidentifiertypecoding.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntIdTypCdgCd("NULL");
		}

		if(medicinalproductingredientidentifiertypecodingi == medicinalproductingredientidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctIgrdntIdTypCdgCd("]");}


		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientidentifiertypecodingi == 0) {m.addMdcnlPrdctIgrdntIdTypCdgUsrSltd("[");}
		if(medicinalproductingredientidentifiertypecoding.hasUserSelected()) {

			m.addMdcnlPrdctIgrdntIdTypCdgUsrSltd(String.valueOf(medicinalproductingredientidentifiertypecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIgrdntIdTypCdgUsrSltd("NULL");
		}

		if(medicinalproductingredientidentifiertypecodingi == medicinalproductingredientidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctIgrdntIdTypCdgUsrSltd("]");}


		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientidentifiertypecodingi == 0) {m.addMdcnlPrdctIgrdntIdTypCdgSys("[");}
		if(medicinalproductingredientidentifiertypecoding.hasSystem()) {

			m.addMdcnlPrdctIgrdntIdTypCdgSys(String.valueOf(medicinalproductingredientidentifiertypecoding.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntIdTypCdgSys("NULL");
		}

		if(medicinalproductingredientidentifiertypecodingi == medicinalproductingredientidentifiertypecodinglist.size()-1) {m.addMdcnlPrdctIgrdntIdTypCdgSys("]");}


		 };
		/******************** medicinalproductingredientidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductingredientidentifierperiod = medicinalproductingredientidentifier.getPeriod();

		/******************** MdcnlPrdctIgrdnt_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductingredientidentifierperiod.hasStart()) {

			m.addMdcnlPrdctIgrdntIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductingredientidentifierperiod.getStart())+"\"");
		} else {
			m.addMdcnlPrdctIgrdntIdPrdStrt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Id_Prd_End ********************************************************************************/
		if(medicinalproductingredientidentifierperiod.hasEnd()) {

			m.addMdcnlPrdctIgrdntIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductingredientidentifierperiod.getEnd())+"\"");
		} else {
			m.addMdcnlPrdctIgrdntIdPrdEnd("NULL");
		}


		/******************** medicinalproductingredientidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductingredientidentifieruse = medicinalproductingredientidentifier.getUse();
		if(medicinalproductingredientidentifieruse!=null) {
			m.addMdcnlPrdctIgrdntIdUse(medicinalproductingredientidentifieruse.toCode());
		} else {
			m.addMdcnlPrdctIgrdntIdUse("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_Id_Assigner ********************************************************************************/
		if(medicinalproductingredientidentifier.hasAssigner()) {

			if(medicinalproductingredientidentifier.getAssigner().getReference() != null) {
			m.addMdcnlPrdctIgrdntIdAssigner(medicinalproductingredientidentifier.getAssigner().getReference());
			}
		} else {
			m.addMdcnlPrdctIgrdntIdAssigner("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Id_Sys ********************************************************************************/
		if(medicinalproductingredientidentifier.hasSystem()) {

			m.addMdcnlPrdctIgrdntIdSys(String.valueOf(medicinalproductingredientidentifier.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntIdSys("NULL");
		}


		/******************** medicinalproductingredientrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientrole = medicinalproductingredient.getRole();

		/******************** MdcnlPrdctIgrdnt_Role_Txt ********************************************************************************/
		if(medicinalproductingredientrole.hasText()) {

			m.addMdcnlPrdctIgrdntRoleTxt(String.valueOf(medicinalproductingredientrole.getText()));
		} else {
			m.addMdcnlPrdctIgrdntRoleTxt("NULL");
		}


		/******************** medicinalproductingredientrolecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductingredientrolecodinglist = medicinalproductingredientrole.getCoding();
		for(int medicinalproductingredientrolecodingi = 0; medicinalproductingredientrolecodingi<medicinalproductingredientrolecodinglist.size();medicinalproductingredientrolecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductingredientrolecoding = medicinalproductingredientrolecodinglist.get(medicinalproductingredientrolecodingi);

		/******************** MdcnlPrdctIgrdnt_Role_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientrolecodingi == 0) {m.addMdcnlPrdctIgrdntRoleCdgDsply("[");}
		if(medicinalproductingredientrolecoding.hasDisplay()) {

			m.addMdcnlPrdctIgrdntRoleCdgDsply(String.valueOf(medicinalproductingredientrolecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIgrdntRoleCdgDsply("NULL");
		}

		if(medicinalproductingredientrolecodingi == medicinalproductingredientrolecodinglist.size()-1) {m.addMdcnlPrdctIgrdntRoleCdgDsply("]");}


		/******************** MdcnlPrdctIgrdnt_Role_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientrolecodingi == 0) {m.addMdcnlPrdctIgrdntRoleCdgVrsn("[");}
		if(medicinalproductingredientrolecoding.hasVersion()) {

			m.addMdcnlPrdctIgrdntRoleCdgVrsn(String.valueOf(medicinalproductingredientrolecoding.getVersion()));
		} else {
			m.addMdcnlPrdctIgrdntRoleCdgVrsn("NULL");
		}

		if(medicinalproductingredientrolecodingi == medicinalproductingredientrolecodinglist.size()-1) {m.addMdcnlPrdctIgrdntRoleCdgVrsn("]");}


		/******************** MdcnlPrdctIgrdnt_Role_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientrolecodingi == 0) {m.addMdcnlPrdctIgrdntRoleCdgCd("[");}
		if(medicinalproductingredientrolecoding.hasCode()) {

			m.addMdcnlPrdctIgrdntRoleCdgCd(String.valueOf(medicinalproductingredientrolecoding.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntRoleCdgCd("NULL");
		}

		if(medicinalproductingredientrolecodingi == medicinalproductingredientrolecodinglist.size()-1) {m.addMdcnlPrdctIgrdntRoleCdgCd("]");}


		/******************** MdcnlPrdctIgrdnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientrolecodingi == 0) {m.addMdcnlPrdctIgrdntRoleCdgUsrSltd("[");}
		if(medicinalproductingredientrolecoding.hasUserSelected()) {

			m.addMdcnlPrdctIgrdntRoleCdgUsrSltd(String.valueOf(medicinalproductingredientrolecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIgrdntRoleCdgUsrSltd("NULL");
		}

		if(medicinalproductingredientrolecodingi == medicinalproductingredientrolecodinglist.size()-1) {m.addMdcnlPrdctIgrdntRoleCdgUsrSltd("]");}


		/******************** MdcnlPrdctIgrdnt_Role_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientrolecodingi == 0) {m.addMdcnlPrdctIgrdntRoleCdgSys("[");}
		if(medicinalproductingredientrolecoding.hasSystem()) {

			m.addMdcnlPrdctIgrdntRoleCdgSys(String.valueOf(medicinalproductingredientrolecoding.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntRoleCdgSys("NULL");
		}

		if(medicinalproductingredientrolecodingi == medicinalproductingredientrolecodinglist.size()-1) {m.addMdcnlPrdctIgrdntRoleCdgSys("]");}


		 };
		/******************** medicinalproductingredientsubstance ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSubstanceComponent medicinalproductingredientsubstance = medicinalproductingredient.getSubstance();

		/******************** medicinalproductingredientsubstancecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientsubstancecode = medicinalproductingredientsubstance.getCode();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Txt ********************************************************************************/
		if(medicinalproductingredientsubstancecode.hasText()) {

			m.addMdcnlPrdctIgrdntSbstncCdTxt(String.valueOf(medicinalproductingredientsubstancecode.getText()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncCdTxt("NULL");
		}


		/******************** medicinalproductingredientsubstancecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductingredientsubstancecodecodinglist = medicinalproductingredientsubstancecode.getCoding();
		for(int medicinalproductingredientsubstancecodecodingi = 0; medicinalproductingredientsubstancecodecodingi<medicinalproductingredientsubstancecodecodinglist.size();medicinalproductingredientsubstancecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductingredientsubstancecodecoding = medicinalproductingredientsubstancecodecodinglist.get(medicinalproductingredientsubstancecodecodingi);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientsubstancecodecodingi == 0) {m.addMdcnlPrdctIgrdntSbstncCdCdgDsply("[");}
		if(medicinalproductingredientsubstancecodecoding.hasDisplay()) {

			m.addMdcnlPrdctIgrdntSbstncCdCdgDsply(String.valueOf(medicinalproductingredientsubstancecodecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncCdCdgDsply("NULL");
		}

		if(medicinalproductingredientsubstancecodecodingi == medicinalproductingredientsubstancecodecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncCdCdgDsply("]");}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientsubstancecodecodingi == 0) {m.addMdcnlPrdctIgrdntSbstncCdCdgVrsn("[");}
		if(medicinalproductingredientsubstancecodecoding.hasVersion()) {

			m.addMdcnlPrdctIgrdntSbstncCdCdgVrsn(String.valueOf(medicinalproductingredientsubstancecodecoding.getVersion()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncCdCdgVrsn("NULL");
		}

		if(medicinalproductingredientsubstancecodecodingi == medicinalproductingredientsubstancecodecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncCdCdgVrsn("]");}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancecodecodingi == 0) {m.addMdcnlPrdctIgrdntSbstncCdCdgCd("[");}
		if(medicinalproductingredientsubstancecodecoding.hasCode()) {

			m.addMdcnlPrdctIgrdntSbstncCdCdgCd(String.valueOf(medicinalproductingredientsubstancecodecoding.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncCdCdgCd("NULL");
		}

		if(medicinalproductingredientsubstancecodecodingi == medicinalproductingredientsubstancecodecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncCdCdgCd("]");}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientsubstancecodecodingi == 0) {m.addMdcnlPrdctIgrdntSbstncCdCdgUsrSltd("[");}
		if(medicinalproductingredientsubstancecodecoding.hasUserSelected()) {

			m.addMdcnlPrdctIgrdntSbstncCdCdgUsrSltd(String.valueOf(medicinalproductingredientsubstancecodecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncCdCdgUsrSltd("NULL");
		}

		if(medicinalproductingredientsubstancecodecodingi == medicinalproductingredientsubstancecodecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncCdCdgUsrSltd("]");}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancecodecodingi == 0) {m.addMdcnlPrdctIgrdntSbstncCdCdgSys("[");}
		if(medicinalproductingredientsubstancecodecoding.hasSystem()) {

			m.addMdcnlPrdctIgrdntSbstncCdCdgSys(String.valueOf(medicinalproductingredientsubstancecodecoding.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncCdCdgSys("NULL");
		}

		if(medicinalproductingredientsubstancecodecodingi == medicinalproductingredientsubstancecodecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncCdCdgSys("]");}


		 };
		/******************** medicinalproductingredientsubstancestrength ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthComponent> medicinalproductingredientsubstancestrengthlist = medicinalproductingredientsubstance.getStrength();
		for(int medicinalproductingredientsubstancestrengthi = 0; medicinalproductingredientsubstancestrengthi<medicinalproductingredientsubstancestrengthlist.size();medicinalproductingredientsubstancestrengthi++ ) {
		org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthComponent  medicinalproductingredientsubstancestrength = medicinalproductingredientsubstancestrengthlist.get(medicinalproductingredientsubstancestrengthi);

		/******************** medicinalproductingredientsubstancestrengthcountry ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicinalproductingredientsubstancestrengthcountrylist = medicinalproductingredientsubstancestrength.getCountry();
		for(int medicinalproductingredientsubstancestrengthcountryi = 0; medicinalproductingredientsubstancestrengthcountryi<medicinalproductingredientsubstancestrengthcountrylist.size();medicinalproductingredientsubstancestrengthcountryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicinalproductingredientsubstancestrengthcountry = medicinalproductingredientsubstancestrengthcountrylist.get(medicinalproductingredientsubstancestrengthcountryi);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Txt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthcountryi == 0) {m.addMdcnlPrdctIgrdntSbstncStrCntryTxt("[[");}
		if(medicinalproductingredientsubstancestrengthcountry.hasText()) {

			m.addMdcnlPrdctIgrdntSbstncStrCntryTxt(String.valueOf(medicinalproductingredientsubstancestrengthcountry.getText()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCntryTxt("NULL");
		}

		if(medicinalproductingredientsubstancestrengthcountryi == medicinalproductingredientsubstancestrengthcountrylist.size()-1) {m.addMdcnlPrdctIgrdntSbstncStrCntryTxt("]]");}


		/******************** medicinalproductingredientsubstancestrengthcountrycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductingredientsubstancestrengthcountrycodinglist = medicinalproductingredientsubstancestrengthcountry.getCoding();
		for(int medicinalproductingredientsubstancestrengthcountrycodingi = 0; medicinalproductingredientsubstancestrengthcountrycodingi<medicinalproductingredientsubstancestrengthcountrycodinglist.size();medicinalproductingredientsubstancestrengthcountrycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductingredientsubstancestrengthcountrycoding = medicinalproductingredientsubstancestrengthcountrycodinglist.get(medicinalproductingredientsubstancestrengthcountrycodingi);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSbstncStrCntryCdgDsply("[[[");}
		if(medicinalproductingredientsubstancestrengthcountrycoding.hasDisplay()) {

			m.addMdcnlPrdctIgrdntSbstncStrCntryCdgDsply(String.valueOf(medicinalproductingredientsubstancestrengthcountrycoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCntryCdgDsply("NULL");
		}

		if(medicinalproductingredientsubstancestrengthcountrycodingi == medicinalproductingredientsubstancestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncStrCntryCdgDsply("]]]");}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSbstncStrCntryCdgVrsn("[[[");}
		if(medicinalproductingredientsubstancestrengthcountrycoding.hasVersion()) {

			m.addMdcnlPrdctIgrdntSbstncStrCntryCdgVrsn(String.valueOf(medicinalproductingredientsubstancestrengthcountrycoding.getVersion()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCntryCdgVrsn("NULL");
		}

		if(medicinalproductingredientsubstancestrengthcountrycodingi == medicinalproductingredientsubstancestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncStrCntryCdgVrsn("]]]");}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSbstncStrCntryCdgCd("[[[");}
		if(medicinalproductingredientsubstancestrengthcountrycoding.hasCode()) {

			m.addMdcnlPrdctIgrdntSbstncStrCntryCdgCd(String.valueOf(medicinalproductingredientsubstancestrengthcountrycoding.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCntryCdgCd("NULL");
		}

		if(medicinalproductingredientsubstancestrengthcountrycodingi == medicinalproductingredientsubstancestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncStrCntryCdgCd("]]]");}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSbstncStrCntryCdgUsrSltd("[[[");}
		if(medicinalproductingredientsubstancestrengthcountrycoding.hasUserSelected()) {

			m.addMdcnlPrdctIgrdntSbstncStrCntryCdgUsrSltd(String.valueOf(medicinalproductingredientsubstancestrengthcountrycoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCntryCdgUsrSltd("NULL");
		}

		if(medicinalproductingredientsubstancestrengthcountrycodingi == medicinalproductingredientsubstancestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncStrCntryCdgUsrSltd("]]]");}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSbstncStrCntryCdgSys("[[[");}
		if(medicinalproductingredientsubstancestrengthcountrycoding.hasSystem()) {

			m.addMdcnlPrdctIgrdntSbstncStrCntryCdgSys(String.valueOf(medicinalproductingredientsubstancestrengthcountrycoding.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCntryCdgSys("NULL");
		}

		if(medicinalproductingredientsubstancestrengthcountrycodingi == medicinalproductingredientsubstancestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncStrCntryCdgSys("]]]");}


		 };
		 };
		/******************** medicinalproductingredientsubstancestrengthpresentationlowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientsubstancestrengthpresentationlowlimit = medicinalproductingredientsubstancestrength.getPresentationLowLimit();

		/******************** medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator = medicinalproductingredientsubstancestrengthpresentationlowlimit.getNumerator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.hasValue()) {

			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrVl(String.valueOf(medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrVl("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthpresentationlowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthpresentationlowlimitnumeratorcomparator = medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.getComparator();
		if(medicinalproductingredientsubstancestrengthpresentationlowlimitnumeratorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrCmprtr(medicinalproductingredientsubstancestrengthpresentationlowlimitnumeratorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.hasCode()) {

			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrCd(String.valueOf(medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrUnt(String.valueOf(medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrSys(String.valueOf(medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrSys("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator = medicinalproductingredientsubstancestrengthpresentationlowlimit.getDenominator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.hasValue()) {

			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrVl(String.valueOf(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrVl("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthpresentationlowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthpresentationlowlimitdenominatorcomparator = medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.getComparator();
		if(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominatorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrCmprtr(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominatorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.hasCode()) {

			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrCd(String.valueOf(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrUnt(String.valueOf(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrSys(String.valueOf(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrSys("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthconcentrationlowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientsubstancestrengthconcentrationlowlimit = medicinalproductingredientsubstancestrength.getConcentrationLowLimit();

		/******************** medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator = medicinalproductingredientsubstancestrengthconcentrationlowlimit.getNumerator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.hasValue()) {

			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrVl(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrVl("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthconcentrationlowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthconcentrationlowlimitnumeratorcomparator = medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.getComparator();
		if(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumeratorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrCmprtr(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumeratorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.hasCode()) {

			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrCd(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrUnt(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrSys(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrSys("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator = medicinalproductingredientsubstancestrengthconcentrationlowlimit.getDenominator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.hasValue()) {

			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrVl(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrVl("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominatorcomparator = medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.getComparator();
		if(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominatorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrCmprtr(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominatorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.hasCode()) {

			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrCd(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrUnt(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrSys(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrSys("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthreferencestrength ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthComponent> medicinalproductingredientsubstancestrengthreferencestrengthlist = medicinalproductingredientsubstancestrength.getReferenceStrength();
		for(int medicinalproductingredientsubstancestrengthreferencestrengthi = 0; medicinalproductingredientsubstancestrengthreferencestrengthi<medicinalproductingredientsubstancestrengthreferencestrengthlist.size();medicinalproductingredientsubstancestrengthreferencestrengthi++ ) {
		org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthComponent  medicinalproductingredientsubstancestrengthreferencestrength = medicinalproductingredientsubstancestrengthreferencestrengthlist.get(medicinalproductingredientsubstancestrengthreferencestrengthi);

		/******************** medicinalproductingredientsubstancestrengthreferencestrengthcountry ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicinalproductingredientsubstancestrengthreferencestrengthcountrylist = medicinalproductingredientsubstancestrengthreferencestrength.getCountry();
		for(int medicinalproductingredientsubstancestrengthreferencestrengthcountryi = 0; medicinalproductingredientsubstancestrengthreferencestrengthcountryi<medicinalproductingredientsubstancestrengthreferencestrengthcountrylist.size();medicinalproductingredientsubstancestrengthreferencestrengthcountryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicinalproductingredientsubstancestrengthreferencestrengthcountry = medicinalproductingredientsubstancestrengthreferencestrengthcountrylist.get(medicinalproductingredientsubstancestrengthreferencestrengthcountryi);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Txt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthcountryi == 0) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryTxt("[[[");}
		if(medicinalproductingredientsubstancestrengthreferencestrengthcountry.hasText()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryTxt(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthcountry.getText()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryTxt("NULL");
		}

		if(medicinalproductingredientsubstancestrengthreferencestrengthcountryi == medicinalproductingredientsubstancestrengthreferencestrengthcountrylist.size()-1) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryTxt("]]]");}


		/******************** medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductingredientsubstancestrengthreferencestrengthcountrycodinglist = medicinalproductingredientsubstancestrengthreferencestrengthcountry.getCoding();
		for(int medicinalproductingredientsubstancestrengthreferencestrengthcountrycodingi = 0; medicinalproductingredientsubstancestrengthreferencestrengthcountrycodingi<medicinalproductingredientsubstancestrengthreferencestrengthcountrycodinglist.size();medicinalproductingredientsubstancestrengthreferencestrengthcountrycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding = medicinalproductingredientsubstancestrengthreferencestrengthcountrycodinglist.get(medicinalproductingredientsubstancestrengthreferencestrengthcountrycodingi);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgDsply("[[[[");}
		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.hasDisplay()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgDsply(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgDsply("NULL");
		}

		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycodingi == medicinalproductingredientsubstancestrengthreferencestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgDsply("]]]]");}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgVrsn("[[[[");}
		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.hasVersion()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgVrsn(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.getVersion()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgVrsn("NULL");
		}

		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycodingi == medicinalproductingredientsubstancestrengthreferencestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgVrsn("]]]]");}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgCd("[[[[");}
		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.hasCode()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgCd(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgCd("NULL");
		}

		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycodingi == medicinalproductingredientsubstancestrengthreferencestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgCd("]]]]");}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgUsrSltd("[[[[");}
		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.hasUserSelected()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgUsrSltd(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgUsrSltd("NULL");
		}

		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycodingi == medicinalproductingredientsubstancestrengthreferencestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgUsrSltd("]]]]");}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgSys("[[[[");}
		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.hasSystem()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgSys(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgSys("NULL");
		}

		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycodingi == medicinalproductingredientsubstancestrengthreferencestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgSys("]]]]");}


		 };
		 };
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrength ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientsubstancestrengthreferencestrengthstrength = medicinalproductingredientsubstancestrengthreferencestrength.getStrength();

		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator = medicinalproductingredientsubstancestrengthreferencestrengthstrength.getNumerator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.hasValue()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrVl(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrVl("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumeratorcomparator = medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.getComparator();
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumeratorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrCmprtr(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumeratorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.hasCode()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrCd(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrUnt(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrSys(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrSys("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator = medicinalproductingredientsubstancestrengthreferencestrengthstrength.getDenominator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.hasValue()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrVl(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrVl("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominatorcomparator = medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.getComparator();
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominatorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrCmprtr(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominatorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.hasCode()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrCd(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrUnt(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrSys(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrSys("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthreferencestrengthsubstance ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientsubstancestrengthreferencestrengthsubstance = medicinalproductingredientsubstancestrengthreferencestrength.getSubstance();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Txt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstance.hasText()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncTxt(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthsubstance.getText()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncTxt("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodinglist = medicinalproductingredientsubstancestrengthreferencestrengthsubstance.getCoding();
		for(int medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodingi = 0; medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodingi<medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodinglist.size();medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding = medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodinglist.get(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodingi);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodingi == 0) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgDsply("[[[");}
		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.hasDisplay()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgDsply(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgDsply("NULL");
		}

		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodingi == medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgDsply("]]]");}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodingi == 0) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgVrsn("[[[");}
		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.hasVersion()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgVrsn(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.getVersion()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgVrsn("NULL");
		}

		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodingi == medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgVrsn("]]]");}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodingi == 0) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgCd("[[[");}
		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.hasCode()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgCd(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgCd("NULL");
		}

		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodingi == medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgCd("]]]");}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodingi == 0) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgUsrSltd("[[[");}
		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.hasUserSelected()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgUsrSltd(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgUsrSltd("NULL");
		}

		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodingi == medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgUsrSltd("]]]");}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodingi == 0) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgSys("[[[");}
		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.hasSystem()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgSys(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgSys("NULL");
		}

		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodingi == medicinalproductingredientsubstancestrengthreferencestrengthsubstancecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgSys("]]]");}


		 };
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_MsrmentPoint ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrength.hasMeasurementPoint()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrMsrmentPoint(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrength.getMeasurementPoint()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrMsrmentPoint("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimit = medicinalproductingredientsubstancestrengthreferencestrength.getStrengthLowLimit();

		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator = medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimit.getNumerator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.hasValue()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrVl(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrVl("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator = medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getComparator();
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrCmprtr(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.hasCode()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrCd(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrUnt(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrSys(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrSys("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator = medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimit.getDenominator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.hasValue()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrVl(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrVl("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator = medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getComparator();
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrCmprtr(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.hasCode()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrCd(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrUnt(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrSys(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrSys("NULL");
		}


		 };
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_MsrmentPoint ********************************************************************************/
		if(medicinalproductingredientsubstancestrength.hasMeasurementPoint()) {

			m.addMdcnlPrdctIgrdntSbstncStrMsrmentPoint(String.valueOf(medicinalproductingredientsubstancestrength.getMeasurementPoint()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrMsrmentPoint("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthconcentration ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientsubstancestrengthconcentration = medicinalproductingredientsubstancestrength.getConcentration();

		/******************** medicinalproductingredientsubstancestrengthconcentrationnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthconcentrationnumerator = medicinalproductingredientsubstancestrengthconcentration.getNumerator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationnumerator.hasValue()) {

			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrVl(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationnumerator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrVl("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthconcentrationnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthconcentrationnumeratorcomparator = medicinalproductingredientsubstancestrengthconcentrationnumerator.getComparator();
		if(medicinalproductingredientsubstancestrengthconcentrationnumeratorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrCmprtr(medicinalproductingredientsubstancestrengthconcentrationnumeratorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationnumerator.hasCode()) {

			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrCd(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationnumerator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationnumerator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrUnt(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationnumerator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationnumerator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrSys(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationnumerator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrSys("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthconcentrationdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthconcentrationdenominator = medicinalproductingredientsubstancestrengthconcentration.getDenominator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationdenominator.hasValue()) {

			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrVl(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationdenominator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrVl("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthconcentrationdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthconcentrationdenominatorcomparator = medicinalproductingredientsubstancestrengthconcentrationdenominator.getComparator();
		if(medicinalproductingredientsubstancestrengthconcentrationdenominatorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrCmprtr(medicinalproductingredientsubstancestrengthconcentrationdenominatorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationdenominator.hasCode()) {

			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrCd(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationdenominator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationdenominator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrUnt(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationdenominator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationdenominator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrSys(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationdenominator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrSys("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthpresentation ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientsubstancestrengthpresentation = medicinalproductingredientsubstancestrength.getPresentation();

		/******************** medicinalproductingredientsubstancestrengthpresentationnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthpresentationnumerator = medicinalproductingredientsubstancestrengthpresentation.getNumerator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationnumerator.hasValue()) {

			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrVl(String.valueOf(medicinalproductingredientsubstancestrengthpresentationnumerator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrVl("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthpresentationnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthpresentationnumeratorcomparator = medicinalproductingredientsubstancestrengthpresentationnumerator.getComparator();
		if(medicinalproductingredientsubstancestrengthpresentationnumeratorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrCmprtr(medicinalproductingredientsubstancestrengthpresentationnumeratorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationnumerator.hasCode()) {

			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrCd(String.valueOf(medicinalproductingredientsubstancestrengthpresentationnumerator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationnumerator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrUnt(String.valueOf(medicinalproductingredientsubstancestrengthpresentationnumerator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationnumerator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrSys(String.valueOf(medicinalproductingredientsubstancestrengthpresentationnumerator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrSys("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthpresentationdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthpresentationdenominator = medicinalproductingredientsubstancestrengthpresentation.getDenominator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationdenominator.hasValue()) {

			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrVl(String.valueOf(medicinalproductingredientsubstancestrengthpresentationdenominator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrVl("NULL");
		}


		/******************** medicinalproductingredientsubstancestrengthpresentationdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthpresentationdenominatorcomparator = medicinalproductingredientsubstancestrengthpresentationdenominator.getComparator();
		if(medicinalproductingredientsubstancestrengthpresentationdenominatorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrCmprtr(medicinalproductingredientsubstancestrengthpresentationdenominatorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationdenominator.hasCode()) {

			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrCd(String.valueOf(medicinalproductingredientsubstancestrengthpresentationdenominator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationdenominator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrUnt(String.valueOf(medicinalproductingredientsubstancestrengthpresentationdenominator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationdenominator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrSys(String.valueOf(medicinalproductingredientsubstancestrengthpresentationdenominator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrSys("NULL");
		}


		 };
		/******************** MdcnlPrdctIgrdnt_AllergenicIndicator ********************************************************************************/
		if(medicinalproductingredient.hasAllergenicIndicator()) {

			m.addMdcnlPrdctIgrdntAllergenicIndicator(String.valueOf(medicinalproductingredient.getAllergenicIndicator()));
		} else {
			m.addMdcnlPrdctIgrdntAllergenicIndicator("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstance ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceComponent> medicinalproductingredientspecifiedsubstancelist = medicinalproductingredient.getSpecifiedSubstance();
		for(int medicinalproductingredientspecifiedsubstancei = 0; medicinalproductingredientspecifiedsubstancei<medicinalproductingredientspecifiedsubstancelist.size();medicinalproductingredientspecifiedsubstancei++ ) {
		org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceComponent  medicinalproductingredientspecifiedsubstance = medicinalproductingredientspecifiedsubstancelist.get(medicinalproductingredientspecifiedsubstancei);

		/******************** medicinalproductingredientspecifiedsubstancegroup ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientspecifiedsubstancegroup = medicinalproductingredientspecifiedsubstance.getGroup();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Txt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancei == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncGrpTxt("[");}
		if(medicinalproductingredientspecifiedsubstancegroup.hasText()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncGrpTxt(String.valueOf(medicinalproductingredientspecifiedsubstancegroup.getText()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncGrpTxt("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancei == medicinalproductingredientspecifiedsubstancelist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncGrpTxt("]");}


		/******************** medicinalproductingredientspecifiedsubstancegroupcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductingredientspecifiedsubstancegroupcodinglist = medicinalproductingredientspecifiedsubstancegroup.getCoding();
		for(int medicinalproductingredientspecifiedsubstancegroupcodingi = 0; medicinalproductingredientspecifiedsubstancegroupcodingi<medicinalproductingredientspecifiedsubstancegroupcodinglist.size();medicinalproductingredientspecifiedsubstancegroupcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductingredientspecifiedsubstancegroupcoding = medicinalproductingredientspecifiedsubstancegroupcodinglist.get(medicinalproductingredientspecifiedsubstancegroupcodingi);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancegroupcodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgDsply("[[");}
		if(medicinalproductingredientspecifiedsubstancegroupcoding.hasDisplay()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgDsply(String.valueOf(medicinalproductingredientspecifiedsubstancegroupcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgDsply("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancegroupcodingi == medicinalproductingredientspecifiedsubstancegroupcodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgDsply("]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancegroupcodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgVrsn("[[");}
		if(medicinalproductingredientspecifiedsubstancegroupcoding.hasVersion()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgVrsn(String.valueOf(medicinalproductingredientspecifiedsubstancegroupcoding.getVersion()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgVrsn("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancegroupcodingi == medicinalproductingredientspecifiedsubstancegroupcodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgVrsn("]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancegroupcodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgCd("[[");}
		if(medicinalproductingredientspecifiedsubstancegroupcoding.hasCode()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgCd(String.valueOf(medicinalproductingredientspecifiedsubstancegroupcoding.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgCd("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancegroupcodingi == medicinalproductingredientspecifiedsubstancegroupcodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgCd("]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancegroupcodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgUsrSltd("[[");}
		if(medicinalproductingredientspecifiedsubstancegroupcoding.hasUserSelected()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgUsrSltd(String.valueOf(medicinalproductingredientspecifiedsubstancegroupcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgUsrSltd("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancegroupcodingi == medicinalproductingredientspecifiedsubstancegroupcodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgUsrSltd("]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancegroupcodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgSys("[[");}
		if(medicinalproductingredientspecifiedsubstancegroupcoding.hasSystem()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgSys(String.valueOf(medicinalproductingredientspecifiedsubstancegroupcoding.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgSys("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancegroupcodingi == medicinalproductingredientspecifiedsubstancegroupcodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncGrpCdgSys("]]");}


		 };
		/******************** medicinalproductingredientspecifiedsubstancecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientspecifiedsubstancecode = medicinalproductingredientspecifiedsubstance.getCode();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Txt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancei == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncCdTxt("[");}
		if(medicinalproductingredientspecifiedsubstancecode.hasText()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncCdTxt(String.valueOf(medicinalproductingredientspecifiedsubstancecode.getText()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncCdTxt("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancei == medicinalproductingredientspecifiedsubstancelist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncCdTxt("]");}


		/******************** medicinalproductingredientspecifiedsubstancecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductingredientspecifiedsubstancecodecodinglist = medicinalproductingredientspecifiedsubstancecode.getCoding();
		for(int medicinalproductingredientspecifiedsubstancecodecodingi = 0; medicinalproductingredientspecifiedsubstancecodecodingi<medicinalproductingredientspecifiedsubstancecodecodinglist.size();medicinalproductingredientspecifiedsubstancecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductingredientspecifiedsubstancecodecoding = medicinalproductingredientspecifiedsubstancecodecodinglist.get(medicinalproductingredientspecifiedsubstancecodecodingi);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancecodecodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgDsply("[[");}
		if(medicinalproductingredientspecifiedsubstancecodecoding.hasDisplay()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgDsply(String.valueOf(medicinalproductingredientspecifiedsubstancecodecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgDsply("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancecodecodingi == medicinalproductingredientspecifiedsubstancecodecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgDsply("]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancecodecodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgVrsn("[[");}
		if(medicinalproductingredientspecifiedsubstancecodecoding.hasVersion()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgVrsn(String.valueOf(medicinalproductingredientspecifiedsubstancecodecoding.getVersion()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgVrsn("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancecodecodingi == medicinalproductingredientspecifiedsubstancecodecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgVrsn("]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancecodecodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgCd("[[");}
		if(medicinalproductingredientspecifiedsubstancecodecoding.hasCode()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgCd(String.valueOf(medicinalproductingredientspecifiedsubstancecodecoding.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgCd("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancecodecodingi == medicinalproductingredientspecifiedsubstancecodecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgCd("]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancecodecodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgUsrSltd("[[");}
		if(medicinalproductingredientspecifiedsubstancecodecoding.hasUserSelected()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgUsrSltd(String.valueOf(medicinalproductingredientspecifiedsubstancecodecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgUsrSltd("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancecodecodingi == medicinalproductingredientspecifiedsubstancecodecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgUsrSltd("]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancecodecodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgSys("[[");}
		if(medicinalproductingredientspecifiedsubstancecodecoding.hasSystem()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgSys(String.valueOf(medicinalproductingredientspecifiedsubstancecodecoding.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgSys("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancecodecodingi == medicinalproductingredientspecifiedsubstancecodecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncCdCdgSys("]]");}


		 };
		/******************** medicinalproductingredientspecifiedsubstancestrength ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthComponent> medicinalproductingredientspecifiedsubstancestrengthlist = medicinalproductingredientspecifiedsubstance.getStrength();
		for(int medicinalproductingredientspecifiedsubstancestrengthi = 0; medicinalproductingredientspecifiedsubstancestrengthi<medicinalproductingredientspecifiedsubstancestrengthlist.size();medicinalproductingredientspecifiedsubstancestrengthi++ ) {
		org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthComponent  medicinalproductingredientspecifiedsubstancestrength = medicinalproductingredientspecifiedsubstancestrengthlist.get(medicinalproductingredientspecifiedsubstancestrengthi);

		/******************** medicinalproductingredientspecifiedsubstancestrengthcountry ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicinalproductingredientspecifiedsubstancestrengthcountrylist = medicinalproductingredientspecifiedsubstancestrength.getCountry();
		for(int medicinalproductingredientspecifiedsubstancestrengthcountryi = 0; medicinalproductingredientspecifiedsubstancestrengthcountryi<medicinalproductingredientspecifiedsubstancestrengthcountrylist.size();medicinalproductingredientspecifiedsubstancestrengthcountryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicinalproductingredientspecifiedsubstancestrengthcountry = medicinalproductingredientspecifiedsubstancestrengthcountrylist.get(medicinalproductingredientspecifiedsubstancestrengthcountryi);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Txt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthcountryi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryTxt("[[[");}
		if(medicinalproductingredientspecifiedsubstancestrengthcountry.hasText()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryTxt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthcountry.getText()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryTxt("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancestrengthcountryi == medicinalproductingredientspecifiedsubstancestrengthcountrylist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryTxt("]]]");}


		/******************** medicinalproductingredientspecifiedsubstancestrengthcountrycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductingredientspecifiedsubstancestrengthcountrycodinglist = medicinalproductingredientspecifiedsubstancestrengthcountry.getCoding();
		for(int medicinalproductingredientspecifiedsubstancestrengthcountrycodingi = 0; medicinalproductingredientspecifiedsubstancestrengthcountrycodingi<medicinalproductingredientspecifiedsubstancestrengthcountrycodinglist.size();medicinalproductingredientspecifiedsubstancestrengthcountrycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductingredientspecifiedsubstancestrengthcountrycoding = medicinalproductingredientspecifiedsubstancestrengthcountrycodinglist.get(medicinalproductingredientspecifiedsubstancestrengthcountrycodingi);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgDsply("[[[[");}
		if(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.hasDisplay()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgDsply(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgDsply("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancestrengthcountrycodingi == medicinalproductingredientspecifiedsubstancestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgDsply("]]]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgVrsn("[[[[");}
		if(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.hasVersion()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgVrsn(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.getVersion()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgVrsn("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancestrengthcountrycodingi == medicinalproductingredientspecifiedsubstancestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgVrsn("]]]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgCd("[[[[");}
		if(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.hasCode()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgCd("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancestrengthcountrycodingi == medicinalproductingredientspecifiedsubstancestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgCd("]]]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgUsrSltd("[[[[");}
		if(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.hasUserSelected()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgUsrSltd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgUsrSltd("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancestrengthcountrycodingi == medicinalproductingredientspecifiedsubstancestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgUsrSltd("]]]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgSys("[[[[");}
		if(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.hasSystem()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgSys("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancestrengthcountrycodingi == medicinalproductingredientspecifiedsubstancestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgSys("]]]]");}


		 };
		 };
		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimit = medicinalproductingredientspecifiedsubstancestrength.getPresentationLowLimit();

		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator = medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimit.getNumerator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.hasValue()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrVl("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumeratorcomparator = medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.getComparator();
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumeratorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrCmprtr(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumeratorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.hasCode()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrSys("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator = medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimit.getDenominator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.hasValue()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrVl("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominatorcomparator = medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.getComparator();
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominatorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrCmprtr(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominatorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.hasCode()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrSys("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimit = medicinalproductingredientspecifiedsubstancestrength.getConcentrationLowLimit();

		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator = medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimit.getNumerator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.hasValue()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrVl("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumeratorcomparator = medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.getComparator();
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumeratorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrCmprtr(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumeratorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.hasCode()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrSys("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator = medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimit.getDenominator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.hasValue()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrVl("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominatorcomparator = medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.getComparator();
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominatorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrCmprtr(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominatorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.hasCode()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrSys("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrength ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthComponent> medicinalproductingredientspecifiedsubstancestrengthreferencestrengthlist = medicinalproductingredientspecifiedsubstancestrength.getReferenceStrength();
		for(int medicinalproductingredientspecifiedsubstancestrengthreferencestrengthi = 0; medicinalproductingredientspecifiedsubstancestrengthreferencestrengthi<medicinalproductingredientspecifiedsubstancestrengthreferencestrengthlist.size();medicinalproductingredientspecifiedsubstancestrengthreferencestrengthi++ ) {
		org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthComponent  medicinalproductingredientspecifiedsubstancestrengthreferencestrength = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthlist.get(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthi);

		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountry ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrylist = medicinalproductingredientspecifiedsubstancestrengthreferencestrength.getCountry();
		for(int medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountryi = 0; medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountryi<medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrylist.size();medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountry = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrylist.get(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountryi);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Txt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountryi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryTxt("[[[[");}
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountry.hasText()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryTxt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountry.getText()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryTxt("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountryi == medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrylist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryTxt("]]]]");}


		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodinglist = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountry.getCoding();
		for(int medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodingi = 0; medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodingi<medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodinglist.size();medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodinglist.get(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodingi);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgDsply("[[[[[");}
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.hasDisplay()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgDsply(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgDsply("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodingi == medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgDsply("]]]]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgVrsn("[[[[[");}
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.hasVersion()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgVrsn(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.getVersion()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgVrsn("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodingi == medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgVrsn("]]]]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgCd("[[[[[");}
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.hasCode()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgCd("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodingi == medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgCd("]]]]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgUsrSltd("[[[[[");}
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.hasUserSelected()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgUsrSltd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgUsrSltd("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodingi == medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgUsrSltd("]]]]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgSys("[[[[[");}
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.hasSystem()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgSys("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodingi == medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgSys("]]]]]");}


		 };
		 };
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrength ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrength = medicinalproductingredientspecifiedsubstancestrengthreferencestrength.getStrength();

		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrength.getNumerator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.hasValue()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrVl("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumeratorcomparator = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.getComparator();
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumeratorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrCmprtr(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumeratorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.hasCode()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrSys("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrength.getDenominator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.hasValue()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrVl("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominatorcomparator = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.getComparator();
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominatorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrCmprtr(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominatorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.hasCode()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrSys("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstance ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstance = medicinalproductingredientspecifiedsubstancestrengthreferencestrength.getSubstance();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Txt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstance.hasText()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncTxt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstance.getText()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncTxt("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodinglist = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstance.getCoding();
		for(int medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodingi = 0; medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodingi<medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodinglist.size();medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodinglist.get(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodingi);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgDsply("[[[[");}
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.hasDisplay()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgDsply(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgDsply("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodingi == medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgDsply("]]]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgVrsn("[[[[");}
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.hasVersion()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgVrsn(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.getVersion()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgVrsn("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodingi == medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgVrsn("]]]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgCd("[[[[");}
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.hasCode()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgCd("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodingi == medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgCd("]]]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgUsrSltd("[[[[");}
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.hasUserSelected()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgUsrSltd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgUsrSltd("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodingi == medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgUsrSltd("]]]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgSys("[[[[");}
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.hasSystem()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgSys("NULL");
		}

		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodingi == medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgSys("]]]]");}


		 };
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_MsrmentPoint ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrength.hasMeasurementPoint()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrMsrmentPoint(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrength.getMeasurementPoint()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrMsrmentPoint("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimit = medicinalproductingredientspecifiedsubstancestrengthreferencestrength.getStrengthLowLimit();

		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimit.getNumerator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.hasValue()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrVl("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getComparator();
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrCmprtr(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.hasCode()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrSys("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimit.getDenominator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.hasValue()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrVl("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getComparator();
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrCmprtr(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.hasCode()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrSys("NULL");
		}


		 };
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_MsrmentPoint ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrength.hasMeasurementPoint()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrMsrmentPoint(String.valueOf(medicinalproductingredientspecifiedsubstancestrength.getMeasurementPoint()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrMsrmentPoint("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentration ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientspecifiedsubstancestrengthconcentration = medicinalproductingredientspecifiedsubstancestrength.getConcentration();

		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator = medicinalproductingredientspecifiedsubstancestrengthconcentration.getNumerator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.hasValue()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrVl("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthconcentrationnumeratorcomparator = medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.getComparator();
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumeratorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrCmprtr(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumeratorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.hasCode()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrSys("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator = medicinalproductingredientspecifiedsubstancestrengthconcentration.getDenominator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.hasValue()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrVl("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominatorcomparator = medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.getComparator();
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominatorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrCmprtr(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominatorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.hasCode()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrSys("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentation ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientspecifiedsubstancestrengthpresentation = medicinalproductingredientspecifiedsubstancestrength.getPresentation();

		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator = medicinalproductingredientspecifiedsubstancestrengthpresentation.getNumerator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.hasValue()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrVl("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthpresentationnumeratorcomparator = medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.getComparator();
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationnumeratorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrCmprtr(medicinalproductingredientspecifiedsubstancestrengthpresentationnumeratorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.hasCode()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrSys("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator = medicinalproductingredientspecifiedsubstancestrengthpresentation.getDenominator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.hasValue()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.getValue()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrVl("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthpresentationdenominatorcomparator = medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.getComparator();
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominatorcomparator!=null) {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrCmprtr(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominatorcomparator.toCode());
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrCmprtr("NULL");
		}

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.hasCode()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrCd("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.hasUnit()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.getUnit()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrUnt("NULL");
		}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.hasSystem()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrSys("NULL");
		}


		 };
		/******************** medicinalproductingredientspecifiedsubstanceconfidentiality ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientspecifiedsubstanceconfidentiality = medicinalproductingredientspecifiedsubstance.getConfidentiality();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Txt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstanceconfidentiality.hasText()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityTxt(String.valueOf(medicinalproductingredientspecifiedsubstanceconfidentiality.getText()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityTxt("NULL");
		}


		/******************** medicinalproductingredientspecifiedsubstanceconfidentialitycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductingredientspecifiedsubstanceconfidentialitycodinglist = medicinalproductingredientspecifiedsubstanceconfidentiality.getCoding();
		for(int medicinalproductingredientspecifiedsubstanceconfidentialitycodingi = 0; medicinalproductingredientspecifiedsubstanceconfidentialitycodingi<medicinalproductingredientspecifiedsubstanceconfidentialitycodinglist.size();medicinalproductingredientspecifiedsubstanceconfidentialitycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductingredientspecifiedsubstanceconfidentialitycoding = medicinalproductingredientspecifiedsubstanceconfidentialitycodinglist.get(medicinalproductingredientspecifiedsubstanceconfidentialitycodingi);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstanceconfidentialitycodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgDsply("[[");}
		if(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.hasDisplay()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgDsply(String.valueOf(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.getDisplay()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgDsply("NULL");
		}

		if(medicinalproductingredientspecifiedsubstanceconfidentialitycodingi == medicinalproductingredientspecifiedsubstanceconfidentialitycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgDsply("]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstanceconfidentialitycodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgVrsn("[[");}
		if(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.hasVersion()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgVrsn(String.valueOf(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.getVersion()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgVrsn("NULL");
		}

		if(medicinalproductingredientspecifiedsubstanceconfidentialitycodingi == medicinalproductingredientspecifiedsubstanceconfidentialitycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgVrsn("]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstanceconfidentialitycodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgCd("[[");}
		if(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.hasCode()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgCd(String.valueOf(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.getCode()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgCd("NULL");
		}

		if(medicinalproductingredientspecifiedsubstanceconfidentialitycodingi == medicinalproductingredientspecifiedsubstanceconfidentialitycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgCd("]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstanceconfidentialitycodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgUsrSltd("[[");}
		if(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.hasUserSelected()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgUsrSltd(String.valueOf(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgUsrSltd("NULL");
		}

		if(medicinalproductingredientspecifiedsubstanceconfidentialitycodingi == medicinalproductingredientspecifiedsubstanceconfidentialitycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgUsrSltd("]]");}


		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstanceconfidentialitycodingi == 0) {m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgSys("[[");}
		if(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.hasSystem()) {

			m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgSys(String.valueOf(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.getSystem()));
		} else {
			m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgSys("NULL");
		}

		if(medicinalproductingredientspecifiedsubstanceconfidentialitycodingi == medicinalproductingredientspecifiedsubstanceconfidentialitycodinglist.size()-1) {m.addMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgSys("]]");}


		 };
		 };
		/******************** MdcnlPrdctIgrdnt_Manufacturer ********************************************************************************/
		if(medicinalproductingredient.hasManufacturer()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductingredient.getManufacturer().size(); incr++) {
				array = array + medicinalproductingredient.getManufacturer().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctIgrdntManufacturer(array);

		} else {
			m.addMdcnlPrdctIgrdntManufacturer("NULL");
		}


		return m;
	}
}
