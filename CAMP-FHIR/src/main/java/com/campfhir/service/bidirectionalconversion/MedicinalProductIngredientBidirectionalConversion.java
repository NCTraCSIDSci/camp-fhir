package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductIngredient;
public class MedicinalProductIngredientBidirectionalConversion 
{
	public MedicinalProductIngredient MedicinalProductIngredients(org.hl7.fhir.r4.model.MedicinalProductIngredient medicinalproductingredient) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProductIngredient m = new  main.java.com.campfhir.model.MedicinalProductIngredient();

		/******************** id ********************************************************************************/
		medicinalproductingredient.setId(m.getId());

		/******************** medicinalproductingredientidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductingredientidentifier = medicinalproductingredient.getIdentifier();

		/******************** MdcnlPrdctIgrdnt_Id_Vl ********************************************************************************/
		if(medicinalproductingredientidentifier.hasValue()) {
			m.setMdcnlPrdctIgrdntIdVl(String.valueOf(medicinalproductingredientidentifier.getValue()));
		}
		/******************** medicinalproductingredientidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientidentifiertype = medicinalproductingredientidentifier.getType();

		/******************** MdcnlPrdctIgrdnt_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductingredientidentifiertype.hasText()) {
			m.setMdcnlPrdctIgrdntIdTypTxt(String.valueOf(medicinalproductingredientidentifiertype.getText()));
		}
		/******************** medicinalproductingredientidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientidentifiertypecoding = medicinalproductingredientidentifiertype.getCodingFirstRep();

		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientidentifiertypecoding.hasVersion()) {
			m.setMdcnlPrdctIgrdntIdTypCdgVrsn(String.valueOf(medicinalproductingredientidentifiertypecoding.getVersion()));
		}
		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientidentifiertypecoding.hasDisplay()) {
			m.setMdcnlPrdctIgrdntIdTypCdgDsply(String.valueOf(medicinalproductingredientidentifiertypecoding.getDisplay()));
		}
		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientidentifiertypecoding.hasCode()) {
			m.setMdcnlPrdctIgrdntIdTypCdgCd(String.valueOf(medicinalproductingredientidentifiertypecoding.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientidentifiertypecoding.hasUserSelected()) {
			m.setMdcnlPrdctIgrdntIdTypCdgUsrSltd(String.valueOf(medicinalproductingredientidentifiertypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientidentifiertypecoding.hasSystem()) {
			m.setMdcnlPrdctIgrdntIdTypCdgSys(String.valueOf(medicinalproductingredientidentifiertypecoding.getSystem()));
		}
		/******************** medicinalproductingredientidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductingredientidentifierperiod = medicinalproductingredientidentifier.getPeriod();

		/******************** MdcnlPrdctIgrdnt_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductingredientidentifierperiod.hasStart()) {
			m.setMdcnlPrdctIgrdntIdPrdStrt(String.valueOf(medicinalproductingredientidentifierperiod.getStart()));
		}
		/******************** MdcnlPrdctIgrdnt_Id_Prd_End ********************************************************************************/
		if(medicinalproductingredientidentifierperiod.hasEnd()) {
			m.setMdcnlPrdctIgrdntIdPrdEnd(String.valueOf(medicinalproductingredientidentifierperiod.getEnd()));
		}
		/******************** MdcnlPrdctIgrdnt_Id_Assigner ********************************************************************************/
		if(medicinalproductingredientidentifier.hasAssigner()) {
			m.setMdcnlPrdctIgrdntIdAssigner(String.valueOf(medicinalproductingredientidentifier.getAssigner()));
		}
		/******************** MdcnlPrdctIgrdnt_Id_Sys ********************************************************************************/
		if(medicinalproductingredientidentifier.hasSystem()) {
			m.setMdcnlPrdctIgrdntIdSys(String.valueOf(medicinalproductingredientidentifier.getSystem()));
		}
		/******************** medicinalproductingredientidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductingredientidentifieruse = medicinalproductingredientidentifier.getUse();
		m.setMdcnlPrdctIgrdntIdUse(medicinalproductingredientidentifieruse.toCode());

		/******************** medicinalproductingredientrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientrole = medicinalproductingredient.getRole();

		/******************** MdcnlPrdctIgrdnt_Role_Txt ********************************************************************************/
		if(medicinalproductingredientrole.hasText()) {
			m.setMdcnlPrdctIgrdntRoleTxt(String.valueOf(medicinalproductingredientrole.getText()));
		}
		/******************** medicinalproductingredientrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientrolecoding = medicinalproductingredientrole.getCodingFirstRep();

		/******************** MdcnlPrdctIgrdnt_Role_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientrolecoding.hasVersion()) {
			m.setMdcnlPrdctIgrdntRoleCdgVrsn(String.valueOf(medicinalproductingredientrolecoding.getVersion()));
		}
		/******************** MdcnlPrdctIgrdnt_Role_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientrolecoding.hasDisplay()) {
			m.setMdcnlPrdctIgrdntRoleCdgDsply(String.valueOf(medicinalproductingredientrolecoding.getDisplay()));
		}
		/******************** MdcnlPrdctIgrdnt_Role_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientrolecoding.hasCode()) {
			m.setMdcnlPrdctIgrdntRoleCdgCd(String.valueOf(medicinalproductingredientrolecoding.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientrolecoding.hasUserSelected()) {
			m.setMdcnlPrdctIgrdntRoleCdgUsrSltd(String.valueOf(medicinalproductingredientrolecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIgrdnt_Role_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientrolecoding.hasSystem()) {
			m.setMdcnlPrdctIgrdntRoleCdgSys(String.valueOf(medicinalproductingredientrolecoding.getSystem()));
		}
		/******************** medicinalproductingredientsubstance ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSubstanceComponent medicinalproductingredientsubstance = medicinalproductingredient.getSubstance();

		/******************** medicinalproductingredientsubstancecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientsubstancecode = medicinalproductingredientsubstance.getCode();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Txt ********************************************************************************/
		if(medicinalproductingredientsubstancecode.hasText()) {
			m.setMdcnlPrdctIgrdntSbstncCdTxt(String.valueOf(medicinalproductingredientsubstancecode.getText()));
		}
		/******************** medicinalproductingredientsubstancecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientsubstancecodecoding = medicinalproductingredientsubstancecode.getCodingFirstRep();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientsubstancecodecoding.hasVersion()) {
			m.setMdcnlPrdctIgrdntSbstncCdCdgVrsn(String.valueOf(medicinalproductingredientsubstancecodecoding.getVersion()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientsubstancecodecoding.hasDisplay()) {
			m.setMdcnlPrdctIgrdntSbstncCdCdgDsply(String.valueOf(medicinalproductingredientsubstancecodecoding.getDisplay()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancecodecoding.hasCode()) {
			m.setMdcnlPrdctIgrdntSbstncCdCdgCd(String.valueOf(medicinalproductingredientsubstancecodecoding.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientsubstancecodecoding.hasUserSelected()) {
			m.setMdcnlPrdctIgrdntSbstncCdCdgUsrSltd(String.valueOf(medicinalproductingredientsubstancecodecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancecodecoding.hasSystem()) {
			m.setMdcnlPrdctIgrdntSbstncCdCdgSys(String.valueOf(medicinalproductingredientsubstancecodecoding.getSystem()));
		}
		/******************** medicinalproductingredientsubstancestrength ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthComponent medicinalproductingredientsubstancestrength = medicinalproductingredientsubstance.getStrengthFirstRep();

		/******************** medicinalproductingredientsubstancestrengthcountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientsubstancestrengthcountry = medicinalproductingredientsubstancestrength.getCountryFirstRep();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Txt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthcountry.hasText()) {
			m.setMdcnlPrdctIgrdntSbstncStrCntryTxt(String.valueOf(medicinalproductingredientsubstancestrengthcountry.getText()));
		}
		/******************** medicinalproductingredientsubstancestrengthcountrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientsubstancestrengthcountrycoding = medicinalproductingredientsubstancestrengthcountry.getCodingFirstRep();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthcountrycoding.hasVersion()) {
			m.setMdcnlPrdctIgrdntSbstncStrCntryCdgVrsn(String.valueOf(medicinalproductingredientsubstancestrengthcountrycoding.getVersion()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthcountrycoding.hasDisplay()) {
			m.setMdcnlPrdctIgrdntSbstncStrCntryCdgDsply(String.valueOf(medicinalproductingredientsubstancestrengthcountrycoding.getDisplay()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthcountrycoding.hasCode()) {
			m.setMdcnlPrdctIgrdntSbstncStrCntryCdgCd(String.valueOf(medicinalproductingredientsubstancestrengthcountrycoding.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthcountrycoding.hasUserSelected()) {
			m.setMdcnlPrdctIgrdntSbstncStrCntryCdgUsrSltd(String.valueOf(medicinalproductingredientsubstancestrengthcountrycoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthcountrycoding.hasSystem()) {
			m.setMdcnlPrdctIgrdntSbstncStrCntryCdgSys(String.valueOf(medicinalproductingredientsubstancestrengthcountrycoding.getSystem()));
		}
		/******************** medicinalproductingredientsubstancestrengthpresentation ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientsubstancestrengthpresentation = medicinalproductingredientsubstancestrength.getPresentation();

		/******************** medicinalproductingredientsubstancestrengthpresentationdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthpresentationdenominator = medicinalproductingredientsubstancestrengthpresentation.getDenominator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationdenominator.hasValue()) {
			m.setMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrVl(String.valueOf(medicinalproductingredientsubstancestrengthpresentationdenominator.getValue()));
		}
		/******************** medicinalproductingredientsubstancestrengthpresentationdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthpresentationdenominatorcomparator = medicinalproductingredientsubstancestrengthpresentationdenominator.getComparator();
		m.setMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrCmprtr(medicinalproductingredientsubstancestrengthpresentationdenominatorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationdenominator.hasCode()) {
			m.setMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrCd(String.valueOf(medicinalproductingredientsubstancestrengthpresentationdenominator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationdenominator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrUnt(String.valueOf(medicinalproductingredientsubstancestrengthpresentationdenominator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationdenominator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrSys(String.valueOf(medicinalproductingredientsubstancestrengthpresentationdenominator.getSystem()));
		}
		/******************** medicinalproductingredientsubstancestrengthpresentationnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthpresentationnumerator = medicinalproductingredientsubstancestrengthpresentation.getNumerator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationnumerator.hasValue()) {
			m.setMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrVl(String.valueOf(medicinalproductingredientsubstancestrengthpresentationnumerator.getValue()));
		}
		/******************** medicinalproductingredientsubstancestrengthpresentationnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthpresentationnumeratorcomparator = medicinalproductingredientsubstancestrengthpresentationnumerator.getComparator();
		m.setMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrCmprtr(medicinalproductingredientsubstancestrengthpresentationnumeratorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationnumerator.hasCode()) {
			m.setMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrCd(String.valueOf(medicinalproductingredientsubstancestrengthpresentationnumerator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationnumerator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrUnt(String.valueOf(medicinalproductingredientsubstancestrengthpresentationnumerator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationnumerator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrSys(String.valueOf(medicinalproductingredientsubstancestrengthpresentationnumerator.getSystem()));
		}
		/******************** medicinalproductingredientsubstancestrengthconcentration ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientsubstancestrengthconcentration = medicinalproductingredientsubstancestrength.getConcentration();

		/******************** medicinalproductingredientsubstancestrengthconcentrationdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthconcentrationdenominator = medicinalproductingredientsubstancestrengthconcentration.getDenominator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationdenominator.hasValue()) {
			m.setMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrVl(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationdenominator.getValue()));
		}
		/******************** medicinalproductingredientsubstancestrengthconcentrationdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthconcentrationdenominatorcomparator = medicinalproductingredientsubstancestrengthconcentrationdenominator.getComparator();
		m.setMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrCmprtr(medicinalproductingredientsubstancestrengthconcentrationdenominatorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationdenominator.hasCode()) {
			m.setMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrCd(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationdenominator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationdenominator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrUnt(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationdenominator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationdenominator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrSys(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationdenominator.getSystem()));
		}
		/******************** medicinalproductingredientsubstancestrengthconcentrationnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthconcentrationnumerator = medicinalproductingredientsubstancestrengthconcentration.getNumerator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationnumerator.hasValue()) {
			m.setMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrVl(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationnumerator.getValue()));
		}
		/******************** medicinalproductingredientsubstancestrengthconcentrationnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthconcentrationnumeratorcomparator = medicinalproductingredientsubstancestrengthconcentrationnumerator.getComparator();
		m.setMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrCmprtr(medicinalproductingredientsubstancestrengthconcentrationnumeratorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationnumerator.hasCode()) {
			m.setMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrCd(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationnumerator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationnumerator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrUnt(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationnumerator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationnumerator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrSys(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationnumerator.getSystem()));
		}
		/******************** medicinalproductingredientsubstancestrengthpresentationlowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientsubstancestrengthpresentationlowlimit = medicinalproductingredientsubstancestrength.getPresentationLowLimit();

		/******************** medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator = medicinalproductingredientsubstancestrengthpresentationlowlimit.getDenominator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.hasValue()) {
			m.setMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrVl(String.valueOf(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.getValue()));
		}
		/******************** medicinalproductingredientsubstancestrengthpresentationlowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthpresentationlowlimitdenominatorcomparator = medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.getComparator();
		m.setMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrCmprtr(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominatorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.hasCode()) {
			m.setMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrCd(String.valueOf(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrUnt(String.valueOf(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrSys(String.valueOf(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.getSystem()));
		}
		/******************** medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator = medicinalproductingredientsubstancestrengthpresentationlowlimit.getNumerator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.hasValue()) {
			m.setMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrVl(String.valueOf(medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.getValue()));
		}
		/******************** medicinalproductingredientsubstancestrengthpresentationlowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthpresentationlowlimitnumeratorcomparator = medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.getComparator();
		m.setMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrCmprtr(medicinalproductingredientsubstancestrengthpresentationlowlimitnumeratorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.hasCode()) {
			m.setMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrCd(String.valueOf(medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrUnt(String.valueOf(medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrSys(String.valueOf(medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.getSystem()));
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrength ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthComponent medicinalproductingredientsubstancestrengthreferencestrength = medicinalproductingredientsubstancestrength.getReferenceStrengthFirstRep();

		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrength ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientsubstancestrengthreferencestrengthstrength = medicinalproductingredientsubstancestrengthreferencestrength.getStrength();

		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator = medicinalproductingredientsubstancestrengthreferencestrengthstrength.getDenominator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.hasValue()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrVl(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.getValue()));
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominatorcomparator = medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.getComparator();
		m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrCmprtr(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominatorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.hasCode()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrCd(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrUnt(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrSys(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.getSystem()));
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator = medicinalproductingredientsubstancestrengthreferencestrengthstrength.getNumerator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.hasValue()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrVl(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.getValue()));
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumeratorcomparator = medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.getComparator();
		m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrCmprtr(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumeratorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.hasCode()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrCd(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrUnt(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrSys(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.getSystem()));
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthcountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientsubstancestrengthreferencestrengthcountry = medicinalproductingredientsubstancestrengthreferencestrength.getCountryFirstRep();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Txt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthcountry.hasText()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrCntryTxt(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthcountry.getText()));
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding = medicinalproductingredientsubstancestrengthreferencestrengthcountry.getCodingFirstRep();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.hasVersion()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgVrsn(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.getVersion()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.hasDisplay()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgDsply(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.getDisplay()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.hasCode()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgCd(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.hasUserSelected()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgUsrSltd(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.hasSystem()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgSys(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.getSystem()));
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimit = medicinalproductingredientsubstancestrengthreferencestrength.getStrengthLowLimit();

		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator = medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimit.getDenominator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.hasValue()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrVl(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getValue()));
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator = medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getComparator();
		m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrCmprtr(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.hasCode()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrCd(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrUnt(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrSys(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getSystem()));
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator = medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimit.getNumerator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.hasValue()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrVl(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getValue()));
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator = medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getComparator();
		m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrCmprtr(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.hasCode()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrCd(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrUnt(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrSys(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getSystem()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_MsrmentPoint ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrength.hasMeasurementPoint()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrMsrmentPoint(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrength.getMeasurementPoint()));
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthsubstance ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientsubstancestrengthreferencestrengthsubstance = medicinalproductingredientsubstancestrengthreferencestrength.getSubstance();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Txt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstance.hasText()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncTxt(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthsubstance.getText()));
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding = medicinalproductingredientsubstancestrengthreferencestrengthsubstance.getCodingFirstRep();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.hasVersion()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgVrsn(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.getVersion()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.hasDisplay()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgDsply(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.getDisplay()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.hasCode()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgCd(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.hasUserSelected()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgUsrSltd(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.hasSystem()) {
			m.setMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgSys(String.valueOf(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.getSystem()));
		}
		/******************** medicinalproductingredientsubstancestrengthconcentrationlowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientsubstancestrengthconcentrationlowlimit = medicinalproductingredientsubstancestrength.getConcentrationLowLimit();

		/******************** medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator = medicinalproductingredientsubstancestrengthconcentrationlowlimit.getDenominator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.hasValue()) {
			m.setMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrVl(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.getValue()));
		}
		/******************** medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominatorcomparator = medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.getComparator();
		m.setMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrCmprtr(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominatorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.hasCode()) {
			m.setMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrCd(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrUnt(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrSys(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.getSystem()));
		}
		/******************** medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator = medicinalproductingredientsubstancestrengthconcentrationlowlimit.getNumerator();

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.hasValue()) {
			m.setMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrVl(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.getValue()));
		}
		/******************** medicinalproductingredientsubstancestrengthconcentrationlowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientsubstancestrengthconcentrationlowlimitnumeratorcomparator = medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.getComparator();
		m.setMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrCmprtr(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumeratorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.hasCode()) {
			m.setMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrCd(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrUnt(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrSys(String.valueOf(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.getSystem()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_MsrmentPoint ********************************************************************************/
		if(medicinalproductingredientsubstancestrength.hasMeasurementPoint()) {
			m.setMdcnlPrdctIgrdntSbstncStrMsrmentPoint(String.valueOf(medicinalproductingredientsubstancestrength.getMeasurementPoint()));
		}
		/******************** medicinalproductingredientspecifiedsubstance ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceComponent medicinalproductingredientspecifiedsubstance = medicinalproductingredient.getSpecifiedSubstanceFirstRep();

		/******************** medicinalproductingredientspecifiedsubstancegroup ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientspecifiedsubstancegroup = medicinalproductingredientspecifiedsubstance.getGroup();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Txt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancegroup.hasText()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncGrpTxt(String.valueOf(medicinalproductingredientspecifiedsubstancegroup.getText()));
		}
		/******************** medicinalproductingredientspecifiedsubstancegroupcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientspecifiedsubstancegroupcoding = medicinalproductingredientspecifiedsubstancegroup.getCodingFirstRep();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancegroupcoding.hasVersion()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncGrpCdgVrsn(String.valueOf(medicinalproductingredientspecifiedsubstancegroupcoding.getVersion()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancegroupcoding.hasDisplay()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncGrpCdgDsply(String.valueOf(medicinalproductingredientspecifiedsubstancegroupcoding.getDisplay()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancegroupcoding.hasCode()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncGrpCdgCd(String.valueOf(medicinalproductingredientspecifiedsubstancegroupcoding.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancegroupcoding.hasUserSelected()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncGrpCdgUsrSltd(String.valueOf(medicinalproductingredientspecifiedsubstancegroupcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancegroupcoding.hasSystem()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncGrpCdgSys(String.valueOf(medicinalproductingredientspecifiedsubstancegroupcoding.getSystem()));
		}
		/******************** medicinalproductingredientspecifiedsubstancecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientspecifiedsubstancecode = medicinalproductingredientspecifiedsubstance.getCode();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Txt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancecode.hasText()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncCdTxt(String.valueOf(medicinalproductingredientspecifiedsubstancecode.getText()));
		}
		/******************** medicinalproductingredientspecifiedsubstancecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientspecifiedsubstancecodecoding = medicinalproductingredientspecifiedsubstancecode.getCodingFirstRep();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancecodecoding.hasVersion()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncCdCdgVrsn(String.valueOf(medicinalproductingredientspecifiedsubstancecodecoding.getVersion()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancecodecoding.hasDisplay()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncCdCdgDsply(String.valueOf(medicinalproductingredientspecifiedsubstancecodecoding.getDisplay()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancecodecoding.hasCode()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncCdCdgCd(String.valueOf(medicinalproductingredientspecifiedsubstancecodecoding.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancecodecoding.hasUserSelected()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncCdCdgUsrSltd(String.valueOf(medicinalproductingredientspecifiedsubstancecodecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancecodecoding.hasSystem()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncCdCdgSys(String.valueOf(medicinalproductingredientspecifiedsubstancecodecoding.getSystem()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrength ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthComponent medicinalproductingredientspecifiedsubstancestrength = medicinalproductingredientspecifiedsubstance.getStrengthFirstRep();

		/******************** medicinalproductingredientspecifiedsubstancestrengthcountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientspecifiedsubstancestrengthcountry = medicinalproductingredientspecifiedsubstancestrength.getCountryFirstRep();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Txt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthcountry.hasText()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCntryTxt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthcountry.getText()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthcountrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientspecifiedsubstancestrengthcountrycoding = medicinalproductingredientspecifiedsubstancestrengthcountry.getCodingFirstRep();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.hasVersion()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgVrsn(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.getVersion()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.hasDisplay()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgDsply(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.getDisplay()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.hasCode()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.hasUserSelected()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgUsrSltd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.hasSystem()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthcountrycoding.getSystem()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentation ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientspecifiedsubstancestrengthpresentation = medicinalproductingredientspecifiedsubstancestrength.getPresentation();

		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator = medicinalproductingredientspecifiedsubstancestrengthpresentation.getDenominator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.hasValue()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.getValue()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthpresentationdenominatorcomparator = medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.getComparator();
		m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrCmprtr(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominatorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.hasCode()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.getSystem()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator = medicinalproductingredientspecifiedsubstancestrengthpresentation.getNumerator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.hasValue()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.getValue()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthpresentationnumeratorcomparator = medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.getComparator();
		m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrCmprtr(medicinalproductingredientspecifiedsubstancestrengthpresentationnumeratorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.hasCode()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.getSystem()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentration ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientspecifiedsubstancestrengthconcentration = medicinalproductingredientspecifiedsubstancestrength.getConcentration();

		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator = medicinalproductingredientspecifiedsubstancestrengthconcentration.getDenominator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.hasValue()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.getValue()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominatorcomparator = medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.getComparator();
		m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrCmprtr(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominatorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.hasCode()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.getSystem()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator = medicinalproductingredientspecifiedsubstancestrengthconcentration.getNumerator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.hasValue()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.getValue()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthconcentrationnumeratorcomparator = medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.getComparator();
		m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrCmprtr(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumeratorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.hasCode()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.getSystem()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimit = medicinalproductingredientspecifiedsubstancestrength.getPresentationLowLimit();

		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator = medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimit.getDenominator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.hasValue()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.getValue()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominatorcomparator = medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.getComparator();
		m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrCmprtr(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominatorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.hasCode()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.getSystem()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator = medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimit.getNumerator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.hasValue()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.getValue()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumeratorcomparator = medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.getComparator();
		m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrCmprtr(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumeratorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.hasCode()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.getSystem()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrength ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthComponent medicinalproductingredientspecifiedsubstancestrengthreferencestrength = medicinalproductingredientspecifiedsubstancestrength.getReferenceStrengthFirstRep();

		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrength ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrength = medicinalproductingredientspecifiedsubstancestrengthreferencestrength.getStrength();

		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrength.getDenominator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.hasValue()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.getValue()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominatorcomparator = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.getComparator();
		m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrCmprtr(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominatorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.hasCode()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.getSystem()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrength.getNumerator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.hasValue()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.getValue()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumeratorcomparator = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.getComparator();
		m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrCmprtr(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumeratorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.hasCode()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.getSystem()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountry = medicinalproductingredientspecifiedsubstancestrengthreferencestrength.getCountryFirstRep();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Txt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountry.hasText()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryTxt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountry.getText()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountry.getCodingFirstRep();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.hasVersion()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgVrsn(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.getVersion()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.hasDisplay()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgDsply(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.getDisplay()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.hasCode()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.hasUserSelected()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgUsrSltd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.hasSystem()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.getSystem()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimit = medicinalproductingredientspecifiedsubstancestrengthreferencestrength.getStrengthLowLimit();

		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimit.getDenominator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.hasValue()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getValue()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getComparator();
		m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrCmprtr(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.hasCode()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.getSystem()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimit.getNumerator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.hasValue()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getValue()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getComparator();
		m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrCmprtr(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.hasCode()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.getSystem()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_MsrmentPoint ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrength.hasMeasurementPoint()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrMsrmentPoint(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrength.getMeasurementPoint()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstance ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstance = medicinalproductingredientspecifiedsubstancestrengthreferencestrength.getSubstance();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Txt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstance.hasText()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncTxt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstance.getText()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding = medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstance.getCodingFirstRep();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.hasVersion()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgVrsn(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.getVersion()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.hasDisplay()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgDsply(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.getDisplay()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.hasCode()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.hasUserSelected()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgUsrSltd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.hasSystem()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.getSystem()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimit = medicinalproductingredientspecifiedsubstancestrength.getConcentrationLowLimit();

		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator = medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimit.getDenominator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.hasValue()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.getValue()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominatorcomparator = medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.getComparator();
		m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrCmprtr(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominatorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.hasCode()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.getSystem()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator = medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimit.getNumerator();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.hasValue()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrVl(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.getValue()));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumeratorcomparator = medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.getComparator();
		m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrCmprtr(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumeratorcomparator.toCode());

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.hasCode()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrCd(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.hasUnit()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrUnt(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.getUnit()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.hasSystem()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrSys(String.valueOf(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.getSystem()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_MsrmentPoint ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstancestrength.hasMeasurementPoint()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncStrMsrmentPoint(String.valueOf(medicinalproductingredientspecifiedsubstancestrength.getMeasurementPoint()));
		}
		/******************** medicinalproductingredientspecifiedsubstanceconfidentiality ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientspecifiedsubstanceconfidentiality = medicinalproductingredientspecifiedsubstance.getConfidentiality();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Txt ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstanceconfidentiality.hasText()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncConfidentialityTxt(String.valueOf(medicinalproductingredientspecifiedsubstanceconfidentiality.getText()));
		}
		/******************** medicinalproductingredientspecifiedsubstanceconfidentialitycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientspecifiedsubstanceconfidentialitycoding = medicinalproductingredientspecifiedsubstanceconfidentiality.getCodingFirstRep();

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.hasVersion()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgVrsn(String.valueOf(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.getVersion()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Dsply ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.hasDisplay()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgDsply(String.valueOf(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.getDisplay()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Cd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.hasCode()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgCd(String.valueOf(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.getCode()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.hasUserSelected()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgUsrSltd(String.valueOf(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.getUserSelected()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Sys ********************************************************************************/
		if(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.hasSystem()) {
			m.setMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgSys(String.valueOf(medicinalproductingredientspecifiedsubstanceconfidentialitycoding.getSystem()));
		}
		/******************** MdcnlPrdctIgrdnt_AllergenicIndicator ********************************************************************************/
		if(medicinalproductingredient.hasAllergenicIndicator()) {
			m.setMdcnlPrdctIgrdntAllergenicIndicator(String.valueOf(medicinalproductingredient.getAllergenicIndicator()));
		}
		/******************** MdcnlPrdctIgrdnt_Manufacturer ********************************************************************************/
		if(medicinalproductingredient.hasManufacturer()) {
			m.setMdcnlPrdctIgrdntManufacturer(String.valueOf(medicinalproductingredient.getManufacturerFirstRep()));
		}
		return m;
	}
}
