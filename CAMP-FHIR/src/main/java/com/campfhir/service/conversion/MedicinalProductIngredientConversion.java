package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductIngredient;
public class MedicinalProductIngredientConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProductIngredient MedicinalProductIngredients(MedicinalProductIngredient m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProductIngredient medicinalproductingredient = new org.hl7.fhir.r4.model.MedicinalProductIngredient();

		/******************** id ********************************************************************************/
		medicinalproductingredient.setId(m.getId());

		/******************** MdcnlPrdctIgrdnt_AllergenicIndicator ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntAllergenicIndicator() != null) {
			medicinalproductingredient.setAllergenicIndicator(Boolean.parseBoolean(m.getMdcnlPrdctIgrdntAllergenicIndicator()));
		}
		/******************** medicinalproductingredientidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductingredientidentifier =  new org.hl7.fhir.r4.model.Identifier();
		medicinalproductingredient.setIdentifier(medicinalproductingredientidentifier);

		/******************** MdcnlPrdctIgrdnt_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdAssigner() != null) {
			medicinalproductingredientidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctIgrdntIdAssigner()));
		}
		/******************** medicinalproductingredientidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductingredientidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		medicinalproductingredientidentifier.setPeriod(medicinalproductingredientidentifierperiod);

		/******************** MdcnlPrdctIgrdnt_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdPrdEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdctIgrdnt_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctIgrdnt_Id_Prd_Enddate = MdcnlPrdctIgrdnt_Id_Prd_Endsdf.parse(m.getMdcnlPrdctIgrdntIdPrdEnd());
			medicinalproductingredientidentifierperiod.setEnd(MdcnlPrdctIgrdnt_Id_Prd_Enddate);
		}
		/******************** MdcnlPrdctIgrdnt_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdPrdStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdctIgrdnt_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctIgrdnt_Id_Prd_Strtdate = MdcnlPrdctIgrdnt_Id_Prd_Strtsdf.parse(m.getMdcnlPrdctIgrdntIdPrdStrt());
			medicinalproductingredientidentifierperiod.setStart(MdcnlPrdctIgrdnt_Id_Prd_Strtdate);
		}
		/******************** MdcnlPrdctIgrdnt_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdSys() != null) {
			medicinalproductingredientidentifier.setSystem(m.getMdcnlPrdctIgrdntIdSys());
		}
		/******************** medicinalproductingredientidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductingredientidentifier.setType(medicinalproductingredientidentifiertype);

		/******************** medicinalproductingredientidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductingredientidentifiertype.addCoding(medicinalproductingredientidentifiertypecoding);

		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdTypCdgCd() != null) {
			medicinalproductingredientidentifiertypecoding.setCode(m.getMdcnlPrdctIgrdntIdTypCdgCd());
		}
		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdTypCdgDsply() != null) {
			medicinalproductingredientidentifiertypecoding.setDisplay(m.getMdcnlPrdctIgrdntIdTypCdgDsply());
		}
		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdTypCdgSys() != null) {
			medicinalproductingredientidentifiertypecoding.setSystem(m.getMdcnlPrdctIgrdntIdTypCdgSys());
		}
		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdTypCdgUsrSltd() != null) {
			medicinalproductingredientidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIgrdntIdTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdTypCdgVrsn() != null) {
			medicinalproductingredientidentifiertypecoding.setVersion(m.getMdcnlPrdctIgrdntIdTypCdgVrsn());
		}
		/******************** MdcnlPrdctIgrdnt_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdTypTxt() != null) {
			medicinalproductingredientidentifiertype.setText(m.getMdcnlPrdctIgrdntIdTypTxt());
		}
		/******************** medicinalproductingredientidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicinalproductingredientidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicinalproductingredientidentifier.setUse(medicinalproductingredientidentifieruse.fromCode(m.getMdcnlPrdctIgrdntIdUse()));

		/******************** MdcnlPrdctIgrdnt_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdVl() != null) {
			medicinalproductingredientidentifier.setValue(m.getMdcnlPrdctIgrdntIdVl());
		}
		/******************** MdcnlPrdctIgrdnt_Manufacturer ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntManufacturer() != null) {
			medicinalproductingredient.addManufacturer( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctIgrdntManufacturer()));
		}
		/******************** medicinalproductingredientrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientrole =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductingredient.setRole(medicinalproductingredientrole);

		/******************** medicinalproductingredientrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientrolecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductingredientrole.addCoding(medicinalproductingredientrolecoding);

		/******************** MdcnlPrdctIgrdnt_Role_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntRoleCdgCd() != null) {
			medicinalproductingredientrolecoding.setCode(m.getMdcnlPrdctIgrdntRoleCdgCd());
		}
		/******************** MdcnlPrdctIgrdnt_Role_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntRoleCdgDsply() != null) {
			medicinalproductingredientrolecoding.setDisplay(m.getMdcnlPrdctIgrdntRoleCdgDsply());
		}
		/******************** MdcnlPrdctIgrdnt_Role_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntRoleCdgSys() != null) {
			medicinalproductingredientrolecoding.setSystem(m.getMdcnlPrdctIgrdntRoleCdgSys());
		}
		/******************** MdcnlPrdctIgrdnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntRoleCdgUsrSltd() != null) {
			medicinalproductingredientrolecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIgrdntRoleCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIgrdnt_Role_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntRoleCdgVrsn() != null) {
			medicinalproductingredientrolecoding.setVersion(m.getMdcnlPrdctIgrdntRoleCdgVrsn());
		}
		/******************** MdcnlPrdctIgrdnt_Role_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntRoleTxt() != null) {
			medicinalproductingredientrole.setText(m.getMdcnlPrdctIgrdntRoleTxt());
		}
		/******************** medicinalproductingredientspecifiedsubstance ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceComponent medicinalproductingredientspecifiedsubstance =  new org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceComponent();
		medicinalproductingredient.addSpecifiedSubstance(medicinalproductingredientspecifiedsubstance);

		/******************** medicinalproductingredientspecifiedsubstancecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientspecifiedsubstancecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductingredientspecifiedsubstance.setCode(medicinalproductingredientspecifiedsubstancecode);

		/******************** medicinalproductingredientspecifiedsubstancecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientspecifiedsubstancecodecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductingredientspecifiedsubstancecode.addCoding(medicinalproductingredientspecifiedsubstancecodecoding);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgCd() != null) {
			medicinalproductingredientspecifiedsubstancecodecoding.setCode(m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgCd());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgDsply() != null) {
			medicinalproductingredientspecifiedsubstancecodecoding.setDisplay(m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgDsply());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgSys() != null) {
			medicinalproductingredientspecifiedsubstancecodecoding.setSystem(m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgSys());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgUsrSltd() != null) {
			medicinalproductingredientspecifiedsubstancecodecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgVrsn() != null) {
			medicinalproductingredientspecifiedsubstancecodecoding.setVersion(m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgVrsn());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncCdTxt() != null) {
			medicinalproductingredientspecifiedsubstancecode.setText(m.getMdcnlPrdctIgrdntSpcfdSbstncCdTxt());
		}
		/******************** medicinalproductingredientspecifiedsubstanceconfidentiality ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientspecifiedsubstanceconfidentiality =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductingredientspecifiedsubstance.setConfidentiality(medicinalproductingredientspecifiedsubstanceconfidentiality);

		/******************** medicinalproductingredientspecifiedsubstanceconfidentialitycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientspecifiedsubstanceconfidentialitycoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductingredientspecifiedsubstanceconfidentiality.addCoding(medicinalproductingredientspecifiedsubstanceconfidentialitycoding);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgCd() != null) {
			medicinalproductingredientspecifiedsubstanceconfidentialitycoding.setCode(m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgCd());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgDsply() != null) {
			medicinalproductingredientspecifiedsubstanceconfidentialitycoding.setDisplay(m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgDsply());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgSys() != null) {
			medicinalproductingredientspecifiedsubstanceconfidentialitycoding.setSystem(m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgSys());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgUsrSltd() != null) {
			medicinalproductingredientspecifiedsubstanceconfidentialitycoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgVrsn() != null) {
			medicinalproductingredientspecifiedsubstanceconfidentialitycoding.setVersion(m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgVrsn());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityTxt() != null) {
			medicinalproductingredientspecifiedsubstanceconfidentiality.setText(m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityTxt());
		}
		/******************** medicinalproductingredientspecifiedsubstancegroup ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientspecifiedsubstancegroup =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductingredientspecifiedsubstance.setGroup(medicinalproductingredientspecifiedsubstancegroup);

		/******************** medicinalproductingredientspecifiedsubstancegroupcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientspecifiedsubstancegroupcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductingredientspecifiedsubstancegroup.addCoding(medicinalproductingredientspecifiedsubstancegroupcoding);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgCd() != null) {
			medicinalproductingredientspecifiedsubstancegroupcoding.setCode(m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgCd());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgDsply() != null) {
			medicinalproductingredientspecifiedsubstancegroupcoding.setDisplay(m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgDsply());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgSys() != null) {
			medicinalproductingredientspecifiedsubstancegroupcoding.setSystem(m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgSys());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgUsrSltd() != null) {
			medicinalproductingredientspecifiedsubstancegroupcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgVrsn() != null) {
			medicinalproductingredientspecifiedsubstancegroupcoding.setVersion(m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgVrsn());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncGrpTxt() != null) {
			medicinalproductingredientspecifiedsubstancegroup.setText(m.getMdcnlPrdctIgrdntSpcfdSbstncGrpTxt());
		}
		/******************** medicinalproductingredientspecifiedsubstancestrength ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthComponent medicinalproductingredientspecifiedsubstancestrength =  new org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthComponent();
		medicinalproductingredientspecifiedsubstance.addStrength(medicinalproductingredientspecifiedsubstancestrength);

		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentration ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientspecifiedsubstancestrengthconcentration =  new org.hl7.fhir.r4.model.Ratio();
		medicinalproductingredientspecifiedsubstancestrength.setConcentration(medicinalproductingredientspecifiedsubstancestrengthconcentration);

		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientspecifiedsubstancestrengthconcentration.setDenominator(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrCd() != null) {
			medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.setCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrCd());
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.setComparator(medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominatorcomparator.fromCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrSys() != null) {
			medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.setSystem(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrSys());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrUnt() != null) {
			medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.setUnit(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrVl() != null) {
			medicinalproductingredientspecifiedsubstancestrengthconcentrationdenominator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrVl())));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientspecifiedsubstancestrengthconcentration.setNumerator(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrCd() != null) {
			medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.setCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrCd());
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientspecifiedsubstancestrengthconcentrationnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.setComparator(medicinalproductingredientspecifiedsubstancestrengthconcentrationnumeratorcomparator.fromCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrSys() != null) {
			medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.setSystem(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrSys());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrUnt() != null) {
			medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.setUnit(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrVl() != null) {
			medicinalproductingredientspecifiedsubstancestrengthconcentrationnumerator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrVl())));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimit =  new org.hl7.fhir.r4.model.Ratio();
		medicinalproductingredientspecifiedsubstancestrength.setConcentrationLowLimit(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimit);

		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimit.setDenominator(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrCd() != null) {
			medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.setCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrCd());
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.setComparator(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominatorcomparator.fromCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrSys() != null) {
			medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.setSystem(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrSys());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrUnt() != null) {
			medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.setUnit(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrVl() != null) {
			medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitdenominator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrVl())));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimit.setNumerator(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrCd() != null) {
			medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.setCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrCd());
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.setComparator(medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumeratorcomparator.fromCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrSys() != null) {
			medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.setSystem(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrSys());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrUnt() != null) {
			medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.setUnit(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrVl() != null) {
			medicinalproductingredientspecifiedsubstancestrengthconcentrationlowlimitnumerator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrVl())));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthcountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientspecifiedsubstancestrengthcountry =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductingredientspecifiedsubstancestrength.addCountry(medicinalproductingredientspecifiedsubstancestrengthcountry);

		/******************** medicinalproductingredientspecifiedsubstancestrengthcountrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientspecifiedsubstancestrengthcountrycoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductingredientspecifiedsubstancestrengthcountry.addCoding(medicinalproductingredientspecifiedsubstancestrengthcountrycoding);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgCd() != null) {
			medicinalproductingredientspecifiedsubstancestrengthcountrycoding.setCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgCd());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgDsply() != null) {
			medicinalproductingredientspecifiedsubstancestrengthcountrycoding.setDisplay(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgDsply());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgSys() != null) {
			medicinalproductingredientspecifiedsubstancestrengthcountrycoding.setSystem(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgSys());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgUsrSltd() != null) {
			medicinalproductingredientspecifiedsubstancestrengthcountrycoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgVrsn() != null) {
			medicinalproductingredientspecifiedsubstancestrengthcountrycoding.setVersion(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgVrsn());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryTxt() != null) {
			medicinalproductingredientspecifiedsubstancestrengthcountry.setText(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryTxt());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_MsrmentPoint ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrMsrmentPoint() != null) {
			medicinalproductingredientspecifiedsubstancestrength.setMeasurementPoint(m.getMdcnlPrdctIgrdntSpcfdSbstncStrMsrmentPoint());
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentation ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientspecifiedsubstancestrengthpresentation =  new org.hl7.fhir.r4.model.Ratio();
		medicinalproductingredientspecifiedsubstancestrength.setPresentation(medicinalproductingredientspecifiedsubstancestrengthpresentation);

		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientspecifiedsubstancestrengthpresentation.setDenominator(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrCd() != null) {
			medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.setCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrCd());
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientspecifiedsubstancestrengthpresentationdenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.setComparator(medicinalproductingredientspecifiedsubstancestrengthpresentationdenominatorcomparator.fromCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrSys() != null) {
			medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.setSystem(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrSys());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrUnt() != null) {
			medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.setUnit(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrVl() != null) {
			medicinalproductingredientspecifiedsubstancestrengthpresentationdenominator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrVl())));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientspecifiedsubstancestrengthpresentation.setNumerator(medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrCd() != null) {
			medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.setCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrCd());
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientspecifiedsubstancestrengthpresentationnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.setComparator(medicinalproductingredientspecifiedsubstancestrengthpresentationnumeratorcomparator.fromCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrSys() != null) {
			medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.setSystem(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrSys());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrUnt() != null) {
			medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.setUnit(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrVl() != null) {
			medicinalproductingredientspecifiedsubstancestrengthpresentationnumerator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrVl())));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimit =  new org.hl7.fhir.r4.model.Ratio();
		medicinalproductingredientspecifiedsubstancestrength.setPresentationLowLimit(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimit);

		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimit.setDenominator(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrCd() != null) {
			medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.setCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrCd());
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.setComparator(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominatorcomparator.fromCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrSys() != null) {
			medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.setSystem(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrSys());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrUnt() != null) {
			medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.setUnit(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrVl() != null) {
			medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitdenominator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrVl())));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimit.setNumerator(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrCd() != null) {
			medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.setCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrCd());
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.setComparator(medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumeratorcomparator.fromCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrSys() != null) {
			medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.setSystem(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrSys());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrUnt() != null) {
			medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.setUnit(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrVl() != null) {
			medicinalproductingredientspecifiedsubstancestrengthpresentationlowlimitnumerator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrVl())));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrength ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthComponent medicinalproductingredientspecifiedsubstancestrengthreferencestrength =  new org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthComponent();
		medicinalproductingredientspecifiedsubstancestrength.addReferenceStrength(medicinalproductingredientspecifiedsubstancestrengthreferencestrength);

		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountry =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductingredientspecifiedsubstancestrengthreferencestrength.addCountry(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountry);

		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountry.addCoding(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgCd() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.setCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgCd());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgDsply() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.setDisplay(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgDsply());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgSys() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.setSystem(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgSys());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgUsrSltd() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgVrsn() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountrycoding.setVersion(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgVrsn());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryTxt() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthcountry.setText(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryTxt());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_MsrmentPoint ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrMsrmentPoint() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrength.setMeasurementPoint(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrMsrmentPoint());
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrength ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrength =  new org.hl7.fhir.r4.model.Ratio();
		medicinalproductingredientspecifiedsubstancestrengthreferencestrength.setStrength(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrength);

		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrength.setDenominator(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrCd() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.setCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrCd());
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.setComparator(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominatorcomparator.fromCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrSys() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.setSystem(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrSys());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrUnt() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.setUnit(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrVl() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthdenominator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrVl())));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrength.setNumerator(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrCd() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.setCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrCd());
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.setComparator(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumeratorcomparator.fromCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrSys() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.setSystem(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrSys());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrUnt() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.setUnit(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrVl() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthnumerator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrVl())));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimit =  new org.hl7.fhir.r4.model.Ratio();
		medicinalproductingredientspecifiedsubstancestrengthreferencestrength.setStrengthLowLimit(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimit);

		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimit.setDenominator(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrCd() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.setCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrCd());
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.setComparator(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator.fromCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrSys() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.setSystem(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrSys());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrUnt() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.setUnit(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrVl() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitdenominator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrVl())));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimit.setNumerator(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrCd() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.setCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrCd());
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.setComparator(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator.fromCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrSys() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.setSystem(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrSys());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrUnt() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.setUnit(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrVl() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthstrengthlowlimitnumerator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrVl())));
		}
		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstance ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstance =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductingredientspecifiedsubstancestrengthreferencestrength.setSubstance(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstance);

		/******************** medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstance.addCoding(medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding);

		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgCd() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.setCode(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgCd());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgDsply() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.setDisplay(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgDsply());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgSys() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.setSystem(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgSys());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgUsrSltd() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgVrsn() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstancecoding.setVersion(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgVrsn());
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncTxt() != null) {
			medicinalproductingredientspecifiedsubstancestrengthreferencestrengthsubstance.setText(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncTxt());
		}
		/******************** medicinalproductingredientsubstance ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSubstanceComponent medicinalproductingredientsubstance =  new org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSubstanceComponent();
		medicinalproductingredient.setSubstance(medicinalproductingredientsubstance);

		/******************** medicinalproductingredientsubstancecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientsubstancecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductingredientsubstance.setCode(medicinalproductingredientsubstancecode);

		/******************** medicinalproductingredientsubstancecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientsubstancecodecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductingredientsubstancecode.addCoding(medicinalproductingredientsubstancecodecoding);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncCdCdgCd() != null) {
			medicinalproductingredientsubstancecodecoding.setCode(m.getMdcnlPrdctIgrdntSbstncCdCdgCd());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncCdCdgDsply() != null) {
			medicinalproductingredientsubstancecodecoding.setDisplay(m.getMdcnlPrdctIgrdntSbstncCdCdgDsply());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncCdCdgSys() != null) {
			medicinalproductingredientsubstancecodecoding.setSystem(m.getMdcnlPrdctIgrdntSbstncCdCdgSys());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncCdCdgUsrSltd() != null) {
			medicinalproductingredientsubstancecodecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIgrdntSbstncCdCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncCdCdgVrsn() != null) {
			medicinalproductingredientsubstancecodecoding.setVersion(m.getMdcnlPrdctIgrdntSbstncCdCdgVrsn());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncCdTxt() != null) {
			medicinalproductingredientsubstancecode.setText(m.getMdcnlPrdctIgrdntSbstncCdTxt());
		}
		/******************** medicinalproductingredientsubstancestrength ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthComponent medicinalproductingredientsubstancestrength =  new org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthComponent();
		medicinalproductingredientsubstance.addStrength(medicinalproductingredientsubstancestrength);

		/******************** medicinalproductingredientsubstancestrengthconcentration ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientsubstancestrengthconcentration =  new org.hl7.fhir.r4.model.Ratio();
		medicinalproductingredientsubstancestrength.setConcentration(medicinalproductingredientsubstancestrengthconcentration);

		/******************** medicinalproductingredientsubstancestrengthconcentrationdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthconcentrationdenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientsubstancestrengthconcentration.setDenominator(medicinalproductingredientsubstancestrengthconcentrationdenominator);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrCd() != null) {
			medicinalproductingredientsubstancestrengthconcentrationdenominator.setCode(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrCd());
		}
		/******************** medicinalproductingredientsubstancestrengthconcentrationdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientsubstancestrengthconcentrationdenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientsubstancestrengthconcentrationdenominator.setComparator(medicinalproductingredientsubstancestrengthconcentrationdenominatorcomparator.fromCode(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrSys() != null) {
			medicinalproductingredientsubstancestrengthconcentrationdenominator.setSystem(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrSys());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrUnt() != null) {
			medicinalproductingredientsubstancestrengthconcentrationdenominator.setUnit(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrVl() != null) {
			medicinalproductingredientsubstancestrengthconcentrationdenominator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrVl())));
		}
		/******************** medicinalproductingredientsubstancestrengthconcentrationnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthconcentrationnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientsubstancestrengthconcentration.setNumerator(medicinalproductingredientsubstancestrengthconcentrationnumerator);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrCd() != null) {
			medicinalproductingredientsubstancestrengthconcentrationnumerator.setCode(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrCd());
		}
		/******************** medicinalproductingredientsubstancestrengthconcentrationnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientsubstancestrengthconcentrationnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientsubstancestrengthconcentrationnumerator.setComparator(medicinalproductingredientsubstancestrengthconcentrationnumeratorcomparator.fromCode(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrSys() != null) {
			medicinalproductingredientsubstancestrengthconcentrationnumerator.setSystem(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrSys());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrUnt() != null) {
			medicinalproductingredientsubstancestrengthconcentrationnumerator.setUnit(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrVl() != null) {
			medicinalproductingredientsubstancestrengthconcentrationnumerator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrVl())));
		}
		/******************** medicinalproductingredientsubstancestrengthconcentrationlowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientsubstancestrengthconcentrationlowlimit =  new org.hl7.fhir.r4.model.Ratio();
		medicinalproductingredientsubstancestrength.setConcentrationLowLimit(medicinalproductingredientsubstancestrengthconcentrationlowlimit);

		/******************** medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientsubstancestrengthconcentrationlowlimit.setDenominator(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrCd() != null) {
			medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.setCode(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrCd());
		}
		/******************** medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.setComparator(medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominatorcomparator.fromCode(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrSys() != null) {
			medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.setSystem(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrSys());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrUnt() != null) {
			medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.setUnit(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrVl() != null) {
			medicinalproductingredientsubstancestrengthconcentrationlowlimitdenominator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrVl())));
		}
		/******************** medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientsubstancestrengthconcentrationlowlimit.setNumerator(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrCd() != null) {
			medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.setCode(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrCd());
		}
		/******************** medicinalproductingredientsubstancestrengthconcentrationlowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientsubstancestrengthconcentrationlowlimitnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.setComparator(medicinalproductingredientsubstancestrengthconcentrationlowlimitnumeratorcomparator.fromCode(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrSys() != null) {
			medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.setSystem(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrSys());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrUnt() != null) {
			medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.setUnit(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrVl() != null) {
			medicinalproductingredientsubstancestrengthconcentrationlowlimitnumerator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrVl())));
		}
		/******************** medicinalproductingredientsubstancestrengthcountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientsubstancestrengthcountry =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductingredientsubstancestrength.addCountry(medicinalproductingredientsubstancestrengthcountry);

		/******************** medicinalproductingredientsubstancestrengthcountrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientsubstancestrengthcountrycoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductingredientsubstancestrengthcountry.addCoding(medicinalproductingredientsubstancestrengthcountrycoding);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCntryCdgCd() != null) {
			medicinalproductingredientsubstancestrengthcountrycoding.setCode(m.getMdcnlPrdctIgrdntSbstncStrCntryCdgCd());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCntryCdgDsply() != null) {
			medicinalproductingredientsubstancestrengthcountrycoding.setDisplay(m.getMdcnlPrdctIgrdntSbstncStrCntryCdgDsply());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCntryCdgSys() != null) {
			medicinalproductingredientsubstancestrengthcountrycoding.setSystem(m.getMdcnlPrdctIgrdntSbstncStrCntryCdgSys());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCntryCdgUsrSltd() != null) {
			medicinalproductingredientsubstancestrengthcountrycoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIgrdntSbstncStrCntryCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCntryCdgVrsn() != null) {
			medicinalproductingredientsubstancestrengthcountrycoding.setVersion(m.getMdcnlPrdctIgrdntSbstncStrCntryCdgVrsn());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCntryTxt() != null) {
			medicinalproductingredientsubstancestrengthcountry.setText(m.getMdcnlPrdctIgrdntSbstncStrCntryTxt());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_MsrmentPoint ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrMsrmentPoint() != null) {
			medicinalproductingredientsubstancestrength.setMeasurementPoint(m.getMdcnlPrdctIgrdntSbstncStrMsrmentPoint());
		}
		/******************** medicinalproductingredientsubstancestrengthpresentation ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientsubstancestrengthpresentation =  new org.hl7.fhir.r4.model.Ratio();
		medicinalproductingredientsubstancestrength.setPresentation(medicinalproductingredientsubstancestrengthpresentation);

		/******************** medicinalproductingredientsubstancestrengthpresentationdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthpresentationdenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientsubstancestrengthpresentation.setDenominator(medicinalproductingredientsubstancestrengthpresentationdenominator);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrCd() != null) {
			medicinalproductingredientsubstancestrengthpresentationdenominator.setCode(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrCd());
		}
		/******************** medicinalproductingredientsubstancestrengthpresentationdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientsubstancestrengthpresentationdenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientsubstancestrengthpresentationdenominator.setComparator(medicinalproductingredientsubstancestrengthpresentationdenominatorcomparator.fromCode(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrSys() != null) {
			medicinalproductingredientsubstancestrengthpresentationdenominator.setSystem(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrSys());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrUnt() != null) {
			medicinalproductingredientsubstancestrengthpresentationdenominator.setUnit(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrVl() != null) {
			medicinalproductingredientsubstancestrengthpresentationdenominator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrVl())));
		}
		/******************** medicinalproductingredientsubstancestrengthpresentationnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthpresentationnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientsubstancestrengthpresentation.setNumerator(medicinalproductingredientsubstancestrengthpresentationnumerator);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrCd() != null) {
			medicinalproductingredientsubstancestrengthpresentationnumerator.setCode(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrCd());
		}
		/******************** medicinalproductingredientsubstancestrengthpresentationnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientsubstancestrengthpresentationnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientsubstancestrengthpresentationnumerator.setComparator(medicinalproductingredientsubstancestrengthpresentationnumeratorcomparator.fromCode(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrSys() != null) {
			medicinalproductingredientsubstancestrengthpresentationnumerator.setSystem(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrSys());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrUnt() != null) {
			medicinalproductingredientsubstancestrengthpresentationnumerator.setUnit(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrVl() != null) {
			medicinalproductingredientsubstancestrengthpresentationnumerator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrVl())));
		}
		/******************** medicinalproductingredientsubstancestrengthpresentationlowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientsubstancestrengthpresentationlowlimit =  new org.hl7.fhir.r4.model.Ratio();
		medicinalproductingredientsubstancestrength.setPresentationLowLimit(medicinalproductingredientsubstancestrengthpresentationlowlimit);

		/******************** medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientsubstancestrengthpresentationlowlimit.setDenominator(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrCd() != null) {
			medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.setCode(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrCd());
		}
		/******************** medicinalproductingredientsubstancestrengthpresentationlowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientsubstancestrengthpresentationlowlimitdenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.setComparator(medicinalproductingredientsubstancestrengthpresentationlowlimitdenominatorcomparator.fromCode(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrSys() != null) {
			medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.setSystem(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrSys());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrUnt() != null) {
			medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.setUnit(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrVl() != null) {
			medicinalproductingredientsubstancestrengthpresentationlowlimitdenominator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrVl())));
		}
		/******************** medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientsubstancestrengthpresentationlowlimit.setNumerator(medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrCd() != null) {
			medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.setCode(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrCd());
		}
		/******************** medicinalproductingredientsubstancestrengthpresentationlowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientsubstancestrengthpresentationlowlimitnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.setComparator(medicinalproductingredientsubstancestrengthpresentationlowlimitnumeratorcomparator.fromCode(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrSys() != null) {
			medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.setSystem(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrSys());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrUnt() != null) {
			medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.setUnit(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrVl() != null) {
			medicinalproductingredientsubstancestrengthpresentationlowlimitnumerator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrVl())));
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrength ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthComponent medicinalproductingredientsubstancestrengthreferencestrength =  new org.hl7.fhir.r4.model.MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthComponent();
		medicinalproductingredientsubstancestrength.addReferenceStrength(medicinalproductingredientsubstancestrengthreferencestrength);

		/******************** medicinalproductingredientsubstancestrengthreferencestrengthcountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientsubstancestrengthreferencestrengthcountry =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductingredientsubstancestrengthreferencestrength.addCountry(medicinalproductingredientsubstancestrengthreferencestrengthcountry);

		/******************** medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductingredientsubstancestrengthreferencestrengthcountry.addCoding(medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgCd() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.setCode(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgCd());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgDsply() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.setDisplay(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgDsply());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgSys() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.setSystem(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgSys());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgUsrSltd() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgVrsn() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthcountrycoding.setVersion(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgVrsn());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryTxt() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthcountry.setText(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryTxt());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_MsrmentPoint ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrMsrmentPoint() != null) {
			medicinalproductingredientsubstancestrengthreferencestrength.setMeasurementPoint(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrMsrmentPoint());
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrength ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientsubstancestrengthreferencestrengthstrength =  new org.hl7.fhir.r4.model.Ratio();
		medicinalproductingredientsubstancestrengthreferencestrength.setStrength(medicinalproductingredientsubstancestrengthreferencestrengthstrength);

		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientsubstancestrengthreferencestrengthstrength.setDenominator(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrCd() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.setCode(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrCd());
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.setComparator(medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominatorcomparator.fromCode(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrSys() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.setSystem(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrSys());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrUnt() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.setUnit(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrVl() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthstrengthdenominator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrVl())));
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientsubstancestrengthreferencestrengthstrength.setNumerator(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrCd() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.setCode(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrCd());
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.setComparator(medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumeratorcomparator.fromCode(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrSys() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.setSystem(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrSys());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrUnt() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.setUnit(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrVl() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthstrengthnumerator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrVl())));
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimit ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimit =  new org.hl7.fhir.r4.model.Ratio();
		medicinalproductingredientsubstancestrengthreferencestrength.setStrengthLowLimit(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimit);

		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimit.setDenominator(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrCd() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.setCode(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrCd());
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.setComparator(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominatorcomparator.fromCode(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrSys() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.setSystem(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrSys());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrUnt() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.setUnit(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrVl() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitdenominator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrVl())));
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimit.setNumerator(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrCd() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.setCode(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrCd());
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.setComparator(medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumeratorcomparator.fromCode(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrCmprtr()));

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrSys() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.setSystem(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrSys());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrUnt() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.setUnit(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrUnt());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrVl() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthstrengthlowlimitnumerator.setValue(Double.parseDouble((m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrVl())));
		}
		/******************** medicinalproductingredientsubstancestrengthreferencestrengthsubstance ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductingredientsubstancestrengthreferencestrengthsubstance =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductingredientsubstancestrengthreferencestrength.setSubstance(medicinalproductingredientsubstancestrengthreferencestrengthsubstance);

		/******************** medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductingredientsubstancestrengthreferencestrengthsubstance.addCoding(medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding);

		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgCd() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.setCode(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgCd());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgDsply() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.setDisplay(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgDsply());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgSys() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.setSystem(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgSys());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgUsrSltd() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgUsrSltd()));
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgVrsn() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthsubstancecoding.setVersion(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgVrsn());
		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncTxt() != null) {
			medicinalproductingredientsubstancestrengthreferencestrengthsubstance.setText(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncTxt());
		}
		return medicinalproductingredient;
	}
}
