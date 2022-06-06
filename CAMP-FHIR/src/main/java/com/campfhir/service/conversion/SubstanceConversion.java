package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Substance;
public class SubstanceConversion 
{
	public org.hl7.fhir.r4.model.Substance Substances(Substance s) throws ParseException
	{
		org.hl7.fhir.r4.model.Substance substance = new org.hl7.fhir.r4.model.Substance();

		/******************** id ********************************************************************************/
		substance.setId(s.getId());

		/******************** substancecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancecategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		substance.addCategory(substancecategory);

		/******************** substancecategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancecategorycoding =  new org.hl7.fhir.r4.model.Coding();
		substancecategory.addCoding(substancecategorycoding);

		/******************** Sbstnc_Ctgry_Cdg_Cd ********************************************************************************/
		if(s.getSbstncCtgryCdgCd() != null) {
			substancecategorycoding.setCode(s.getSbstncCtgryCdgCd());
		}
		/******************** Sbstnc_Ctgry_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncCtgryCdgDsply() != null) {
			substancecategorycoding.setDisplay(s.getSbstncCtgryCdgDsply());
		}
		/******************** Sbstnc_Ctgry_Cdg_Sys ********************************************************************************/
		if(s.getSbstncCtgryCdgSys() != null) {
			substancecategorycoding.setSystem(s.getSbstncCtgryCdgSys());
		}
		/******************** Sbstnc_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncCtgryCdgUsrSltd() != null) {
			substancecategorycoding.setUserSelected(Boolean.parseBoolean(s.getSbstncCtgryCdgUsrSltd()));
		}
		/******************** Sbstnc_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncCtgryCdgVrsn() != null) {
			substancecategorycoding.setVersion(s.getSbstncCtgryCdgVrsn());
		}
		/******************** Sbstnc_Ctgry_Txt ********************************************************************************/
		if(s.getSbstncCtgryTxt() != null) {
			substancecategory.setText(s.getSbstncCtgryTxt());
		}
		/******************** substancecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		substance.setCode(substancecode);

		/******************** substancecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancecodecoding =  new org.hl7.fhir.r4.model.Coding();
		substancecode.addCoding(substancecodecoding);

		/******************** Sbstnc_Cd_Cdg_Cd ********************************************************************************/
		if(s.getSbstncCdCdgCd() != null) {
			substancecodecoding.setCode(s.getSbstncCdCdgCd());
		}
		/******************** Sbstnc_Cd_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncCdCdgDsply() != null) {
			substancecodecoding.setDisplay(s.getSbstncCdCdgDsply());
		}
		/******************** Sbstnc_Cd_Cdg_Sys ********************************************************************************/
		if(s.getSbstncCdCdgSys() != null) {
			substancecodecoding.setSystem(s.getSbstncCdCdgSys());
		}
		/******************** Sbstnc_Cd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncCdCdgUsrSltd() != null) {
			substancecodecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncCdCdgUsrSltd()));
		}
		/******************** Sbstnc_Cd_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncCdCdgVrsn() != null) {
			substancecodecoding.setVersion(s.getSbstncCdCdgVrsn());
		}
		/******************** Sbstnc_Cd_Txt ********************************************************************************/
		if(s.getSbstncCdTxt() != null) {
			substancecode.setText(s.getSbstncCdTxt());
		}
		/******************** Sbstnc_Dscrptn ********************************************************************************/
		if(s.getSbstncDscrptn() != null) {
			substance.setDescription(s.getSbstncDscrptn());
		}
		/******************** substanceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substanceidentifier =  new org.hl7.fhir.r4.model.Identifier();
		substance.addIdentifier(substanceidentifier);

		/******************** Sbstnc_Id_Assigner ********************************************************************************/
		if(s.getSbstncIdAssigner() != null) {
			substanceidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSbstncIdAssigner()));
		}
		/******************** substanceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substanceidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		substanceidentifier.setPeriod(substanceidentifierperiod);

		/******************** Sbstnc_Id_Prd_End ********************************************************************************/
		if(s.getSbstncIdPrdEnd() != null) {
			java.text.SimpleDateFormat Sbstnc_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Sbstnc_Id_Prd_Enddate = Sbstnc_Id_Prd_Endsdf.parse(s.getSbstncIdPrdEnd());
			substanceidentifierperiod.setEnd(Sbstnc_Id_Prd_Enddate);
		}
		/******************** Sbstnc_Id_Prd_Strt ********************************************************************************/
		if(s.getSbstncIdPrdStrt() != null) {
			java.text.SimpleDateFormat Sbstnc_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Sbstnc_Id_Prd_Strtdate = Sbstnc_Id_Prd_Strtsdf.parse(s.getSbstncIdPrdStrt());
			substanceidentifierperiod.setStart(Sbstnc_Id_Prd_Strtdate);
		}
		/******************** Sbstnc_Id_Sys ********************************************************************************/
		if(s.getSbstncIdSys() != null) {
			substanceidentifier.setSystem(s.getSbstncIdSys());
		}
		/******************** substanceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substanceidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substanceidentifier.setType(substanceidentifiertype);

		/******************** substanceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substanceidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		substanceidentifiertype.addCoding(substanceidentifiertypecoding);

		/******************** Sbstnc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncIdTypCdgCd() != null) {
			substanceidentifiertypecoding.setCode(s.getSbstncIdTypCdgCd());
		}
		/******************** Sbstnc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncIdTypCdgDsply() != null) {
			substanceidentifiertypecoding.setDisplay(s.getSbstncIdTypCdgDsply());
		}
		/******************** Sbstnc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncIdTypCdgSys() != null) {
			substanceidentifiertypecoding.setSystem(s.getSbstncIdTypCdgSys());
		}
		/******************** Sbstnc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncIdTypCdgUsrSltd() != null) {
			substanceidentifiertypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncIdTypCdgUsrSltd()));
		}
		/******************** Sbstnc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncIdTypCdgVrsn() != null) {
			substanceidentifiertypecoding.setVersion(s.getSbstncIdTypCdgVrsn());
		}
		/******************** Sbstnc_Id_Typ_Txt ********************************************************************************/
		if(s.getSbstncIdTypTxt() != null) {
			substanceidentifiertype.setText(s.getSbstncIdTypTxt());
		}
		/******************** substanceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory substanceidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		substanceidentifier.setUse(substanceidentifieruse.fromCode(s.getSbstncIdUse()));

		/******************** Sbstnc_Id_Vl ********************************************************************************/
		if(s.getSbstncIdVl() != null) {
			substanceidentifier.setValue(s.getSbstncIdVl());
		}
		/******************** substanceingredient ********************************************************************************/
		org.hl7.fhir.r4.model.Substance.SubstanceIngredientComponent substanceingredient =  new org.hl7.fhir.r4.model.Substance.SubstanceIngredientComponent();
		substance.addIngredient(substanceingredient);

		/******************** substanceingredientquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio substanceingredientquantity =  new org.hl7.fhir.r4.model.Ratio();
		substanceingredient.setQuantity(substanceingredientquantity);

		/******************** substanceingredientquantitydenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substanceingredientquantitydenominator =  new org.hl7.fhir.r4.model.Quantity();
		substanceingredientquantity.setDenominator(substanceingredientquantitydenominator);

		/******************** Sbstnc_Igrdnt_Qnty_Dnmntr_Cd ********************************************************************************/
		if(s.getSbstncIgrdntQntyDnmntrCd() != null) {
			substanceingredientquantitydenominator.setCode(s.getSbstncIgrdntQntyDnmntrCd());
		}
		/******************** substanceingredientquantitydenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substanceingredientquantitydenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substanceingredientquantitydenominator.setComparator(substanceingredientquantitydenominatorcomparator.fromCode(s.getSbstncIgrdntQntyDnmntrCmprtr()));

		/******************** Sbstnc_Igrdnt_Qnty_Dnmntr_Sys ********************************************************************************/
		if(s.getSbstncIgrdntQntyDnmntrSys() != null) {
			substanceingredientquantitydenominator.setSystem(s.getSbstncIgrdntQntyDnmntrSys());
		}
		/******************** Sbstnc_Igrdnt_Qnty_Dnmntr_Unt ********************************************************************************/
		if(s.getSbstncIgrdntQntyDnmntrUnt() != null) {
			substanceingredientquantitydenominator.setUnit(s.getSbstncIgrdntQntyDnmntrUnt());
		}
		/******************** Sbstnc_Igrdnt_Qnty_Dnmntr_Vl ********************************************************************************/
		if(s.getSbstncIgrdntQntyDnmntrVl() != null) {
			substanceingredientquantitydenominator.setValue(Double.parseDouble((s.getSbstncIgrdntQntyDnmntrVl())));
		}
		/******************** substanceingredientquantitynumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substanceingredientquantitynumerator =  new org.hl7.fhir.r4.model.Quantity();
		substanceingredientquantity.setNumerator(substanceingredientquantitynumerator);

		/******************** Sbstnc_Igrdnt_Qnty_Nmrtr_Cd ********************************************************************************/
		if(s.getSbstncIgrdntQntyNmrtrCd() != null) {
			substanceingredientquantitynumerator.setCode(s.getSbstncIgrdntQntyNmrtrCd());
		}
		/******************** substanceingredientquantitynumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substanceingredientquantitynumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substanceingredientquantitynumerator.setComparator(substanceingredientquantitynumeratorcomparator.fromCode(s.getSbstncIgrdntQntyNmrtrCmprtr()));

		/******************** Sbstnc_Igrdnt_Qnty_Nmrtr_Sys ********************************************************************************/
		if(s.getSbstncIgrdntQntyNmrtrSys() != null) {
			substanceingredientquantitynumerator.setSystem(s.getSbstncIgrdntQntyNmrtrSys());
		}
		/******************** Sbstnc_Igrdnt_Qnty_Nmrtr_Unt ********************************************************************************/
		if(s.getSbstncIgrdntQntyNmrtrUnt() != null) {
			substanceingredientquantitynumerator.setUnit(s.getSbstncIgrdntQntyNmrtrUnt());
		}
		/******************** Sbstnc_Igrdnt_Qnty_Nmrtr_Vl ********************************************************************************/
		if(s.getSbstncIgrdntQntyNmrtrVl() != null) {
			substanceingredientquantitynumerator.setValue(Double.parseDouble((s.getSbstncIgrdntQntyNmrtrVl())));
		}
		/******************** substanceingredientsubstancecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substanceingredientsubstancecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		substanceingredient.setSubstance(substanceingredientsubstancecodeableconcept);

		/******************** substanceingredientsubstancecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substanceingredientsubstancecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		substanceingredientsubstancecodeableconcept.addCoding(substanceingredientsubstancecodeableconceptcoding);

		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSbstncIgrdntSbstncCdbleCncptCdgCd() != null) {
			substanceingredientsubstancecodeableconceptcoding.setCode(s.getSbstncIgrdntSbstncCdbleCncptCdgCd());
		}
		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncIgrdntSbstncCdbleCncptCdgDsply() != null) {
			substanceingredientsubstancecodeableconceptcoding.setDisplay(s.getSbstncIgrdntSbstncCdbleCncptCdgDsply());
		}
		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSbstncIgrdntSbstncCdbleCncptCdgSys() != null) {
			substanceingredientsubstancecodeableconceptcoding.setSystem(s.getSbstncIgrdntSbstncCdbleCncptCdgSys());
		}
		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncIgrdntSbstncCdbleCncptCdgUsrSltd() != null) {
			substanceingredientsubstancecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(s.getSbstncIgrdntSbstncCdbleCncptCdgUsrSltd()));
		}
		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncIgrdntSbstncCdbleCncptCdgVrsn() != null) {
			substanceingredientsubstancecodeableconceptcoding.setVersion(s.getSbstncIgrdntSbstncCdbleCncptCdgVrsn());
		}
		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Txt ********************************************************************************/
		if(s.getSbstncIgrdntSbstncCdbleCncptTxt() != null) {
			substanceingredientsubstancecodeableconcept.setText(s.getSbstncIgrdntSbstncCdbleCncptTxt());
		}
		/******************** Sbstnc_Igrdnt_SbstncRfrnc ********************************************************************************/
		if(s.getSbstncIgrdntSbstncRfrnc() != null) {
			substanceingredient.setSubstance( new org.hl7.fhir.r4.model.Reference(s.getSbstncIgrdntSbstncRfrnc()));
		}
		/******************** substanceinstance ********************************************************************************/
		org.hl7.fhir.r4.model.Substance.SubstanceInstanceComponent substanceinstance =  new org.hl7.fhir.r4.model.Substance.SubstanceInstanceComponent();
		substance.addInstance(substanceinstance);

		/******************** Sbstnc_Instance_Expiry ********************************************************************************/
		if(s.getSbstncInstanceExpiry() != null) {
			java.text.SimpleDateFormat Sbstnc_Instance_Expirysdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Sbstnc_Instance_Expirydate = Sbstnc_Instance_Expirysdf.parse(s.getSbstncInstanceExpiry());
			substanceinstance.setExpiry(Sbstnc_Instance_Expirydate);
		}
		/******************** substanceinstanceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substanceinstanceidentifier =  new org.hl7.fhir.r4.model.Identifier();
		substanceinstance.setIdentifier(substanceinstanceidentifier);

		/******************** Sbstnc_Instance_Id_Assigner ********************************************************************************/
		if(s.getSbstncInstanceIdAssigner() != null) {
			substanceinstanceidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSbstncInstanceIdAssigner()));
		}
		/******************** substanceinstanceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substanceinstanceidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		substanceinstanceidentifier.setPeriod(substanceinstanceidentifierperiod);

		/******************** Sbstnc_Instance_Id_Prd_End ********************************************************************************/
		if(s.getSbstncInstanceIdPrdEnd() != null) {
			java.text.SimpleDateFormat Sbstnc_Instance_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Sbstnc_Instance_Id_Prd_Enddate = Sbstnc_Instance_Id_Prd_Endsdf.parse(s.getSbstncInstanceIdPrdEnd());
			substanceinstanceidentifierperiod.setEnd(Sbstnc_Instance_Id_Prd_Enddate);
		}
		/******************** Sbstnc_Instance_Id_Prd_Strt ********************************************************************************/
		if(s.getSbstncInstanceIdPrdStrt() != null) {
			java.text.SimpleDateFormat Sbstnc_Instance_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Sbstnc_Instance_Id_Prd_Strtdate = Sbstnc_Instance_Id_Prd_Strtsdf.parse(s.getSbstncInstanceIdPrdStrt());
			substanceinstanceidentifierperiod.setStart(Sbstnc_Instance_Id_Prd_Strtdate);
		}
		/******************** Sbstnc_Instance_Id_Sys ********************************************************************************/
		if(s.getSbstncInstanceIdSys() != null) {
			substanceinstanceidentifier.setSystem(s.getSbstncInstanceIdSys());
		}
		/******************** substanceinstanceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substanceinstanceidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substanceinstanceidentifier.setType(substanceinstanceidentifiertype);

		/******************** substanceinstanceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substanceinstanceidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		substanceinstanceidentifiertype.addCoding(substanceinstanceidentifiertypecoding);

		/******************** Sbstnc_Instance_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncInstanceIdTypCdgCd() != null) {
			substanceinstanceidentifiertypecoding.setCode(s.getSbstncInstanceIdTypCdgCd());
		}
		/******************** Sbstnc_Instance_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncInstanceIdTypCdgDsply() != null) {
			substanceinstanceidentifiertypecoding.setDisplay(s.getSbstncInstanceIdTypCdgDsply());
		}
		/******************** Sbstnc_Instance_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncInstanceIdTypCdgSys() != null) {
			substanceinstanceidentifiertypecoding.setSystem(s.getSbstncInstanceIdTypCdgSys());
		}
		/******************** Sbstnc_Instance_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncInstanceIdTypCdgUsrSltd() != null) {
			substanceinstanceidentifiertypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncInstanceIdTypCdgUsrSltd()));
		}
		/******************** Sbstnc_Instance_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncInstanceIdTypCdgVrsn() != null) {
			substanceinstanceidentifiertypecoding.setVersion(s.getSbstncInstanceIdTypCdgVrsn());
		}
		/******************** Sbstnc_Instance_Id_Typ_Txt ********************************************************************************/
		if(s.getSbstncInstanceIdTypTxt() != null) {
			substanceinstanceidentifiertype.setText(s.getSbstncInstanceIdTypTxt());
		}
		/******************** substanceinstanceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory substanceinstanceidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		substanceinstanceidentifier.setUse(substanceinstanceidentifieruse.fromCode(s.getSbstncInstanceIdUse()));

		/******************** Sbstnc_Instance_Id_Vl ********************************************************************************/
		if(s.getSbstncInstanceIdVl() != null) {
			substanceinstanceidentifier.setValue(s.getSbstncInstanceIdVl());
		}
		/******************** substanceinstancequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substanceinstancequantity =  new org.hl7.fhir.r4.model.Quantity();
		substanceinstance.setQuantity(substanceinstancequantity);

		/******************** Sbstnc_Instance_Qnty_Cd ********************************************************************************/
		if(s.getSbstncInstanceQntyCd() != null) {
			substanceinstancequantity.setCode(s.getSbstncInstanceQntyCd());
		}
		/******************** substanceinstancequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory substanceinstancequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		substanceinstancequantity.setComparator(substanceinstancequantitycomparator.fromCode(s.getSbstncInstanceQntyCmprtr()));

		/******************** Sbstnc_Instance_Qnty_Sys ********************************************************************************/
		if(s.getSbstncInstanceQntySys() != null) {
			substanceinstancequantity.setSystem(s.getSbstncInstanceQntySys());
		}
		/******************** Sbstnc_Instance_Qnty_Unt ********************************************************************************/
		if(s.getSbstncInstanceQntyUnt() != null) {
			substanceinstancequantity.setUnit(s.getSbstncInstanceQntyUnt());
		}
		/******************** Sbstnc_Instance_Qnty_Vl ********************************************************************************/
		if(s.getSbstncInstanceQntyVl() != null) {
			substanceinstancequantity.setValue(Double.parseDouble((s.getSbstncInstanceQntyVl())));
		}
		/******************** substancestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Substance.FHIRSubstanceStatusEnumFactory substancestatus =  new org.hl7.fhir.r4.model.Substance.FHIRSubstanceStatusEnumFactory();
		substance.setStatus(substancestatus.fromCode(s.getSbstncSts()));

		return substance;
	}
}
