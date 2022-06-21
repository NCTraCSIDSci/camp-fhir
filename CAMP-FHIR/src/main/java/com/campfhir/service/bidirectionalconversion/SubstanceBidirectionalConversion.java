package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Substance;
public class SubstanceBidirectionalConversion 
{
	public Substance Substances(org.hl7.fhir.r4.model.Substance substance) throws ParseException
	{
		 main.java.com.campfhir.model.Substance s = new  main.java.com.campfhir.model.Substance();

		/******************** id ********************************************************************************/
		substance.setId(s.getId());

		/******************** substancecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancecode = substance.getCode();

		/******************** substancecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancecodecoding = substancecode.getCodingFirstRep();

		/******************** Sbstnc_Cd_Cdg_Dsply ********************************************************************************/
		if(substancecodecoding.hasDisplay()) {
			s.setSbstncCdCdgDsply(String.valueOf(substancecodecoding.getDisplay()));
		}
		/******************** Sbstnc_Cd_Cdg_Vrsn ********************************************************************************/
		if(substancecodecoding.hasVersion()) {
			s.setSbstncCdCdgVrsn(String.valueOf(substancecodecoding.getVersion()));
		}
		/******************** Sbstnc_Cd_Cdg_Cd ********************************************************************************/
		if(substancecodecoding.hasCode()) {
			s.setSbstncCdCdgCd(String.valueOf(substancecodecoding.getCode()));
		}
		/******************** Sbstnc_Cd_Cdg_Sys ********************************************************************************/
		if(substancecodecoding.hasSystem()) {
			s.setSbstncCdCdgSys(String.valueOf(substancecodecoding.getSystem()));
		}
		/******************** Sbstnc_Cd_Cdg_UsrSltd ********************************************************************************/
		if(substancecodecoding.hasUserSelected()) {
			s.setSbstncCdCdgUsrSltd(String.valueOf(substancecodecoding.getUserSelected()));
		}
		/******************** Sbstnc_Cd_Txt ********************************************************************************/
		if(substancecode.hasText()) {
			s.setSbstncCdTxt(String.valueOf(substancecode.getText()));
		}
		/******************** substanceinstance ********************************************************************************/
		org.hl7.fhir.r4.model.Substance.SubstanceInstanceComponent substanceinstance = substance.getInstanceFirstRep();

		/******************** substanceinstanceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substanceinstanceidentifier = substanceinstance.getIdentifier();

		/******************** Sbstnc_Instance_Id_Vl ********************************************************************************/
		if(substanceinstanceidentifier.hasValue()) {
			s.setSbstncInstanceIdVl(String.valueOf(substanceinstanceidentifier.getValue()));
		}
		/******************** substanceinstanceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substanceinstanceidentifiertype = substanceinstanceidentifier.getType();

		/******************** substanceinstanceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substanceinstanceidentifiertypecoding = substanceinstanceidentifiertype.getCodingFirstRep();

		/******************** Sbstnc_Instance_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(substanceinstanceidentifiertypecoding.hasDisplay()) {
			s.setSbstncInstanceIdTypCdgDsply(String.valueOf(substanceinstanceidentifiertypecoding.getDisplay()));
		}
		/******************** Sbstnc_Instance_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(substanceinstanceidentifiertypecoding.hasVersion()) {
			s.setSbstncInstanceIdTypCdgVrsn(String.valueOf(substanceinstanceidentifiertypecoding.getVersion()));
		}
		/******************** Sbstnc_Instance_Id_Typ_Cdg_Cd ********************************************************************************/
		if(substanceinstanceidentifiertypecoding.hasCode()) {
			s.setSbstncInstanceIdTypCdgCd(String.valueOf(substanceinstanceidentifiertypecoding.getCode()));
		}
		/******************** Sbstnc_Instance_Id_Typ_Cdg_Sys ********************************************************************************/
		if(substanceinstanceidentifiertypecoding.hasSystem()) {
			s.setSbstncInstanceIdTypCdgSys(String.valueOf(substanceinstanceidentifiertypecoding.getSystem()));
		}
		/******************** Sbstnc_Instance_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substanceinstanceidentifiertypecoding.hasUserSelected()) {
			s.setSbstncInstanceIdTypCdgUsrSltd(String.valueOf(substanceinstanceidentifiertypecoding.getUserSelected()));
		}
		/******************** Sbstnc_Instance_Id_Typ_Txt ********************************************************************************/
		if(substanceinstanceidentifiertype.hasText()) {
			s.setSbstncInstanceIdTypTxt(String.valueOf(substanceinstanceidentifiertype.getText()));
		}
		/******************** Sbstnc_Instance_Id_Sys ********************************************************************************/
		if(substanceinstanceidentifier.hasSystem()) {
			s.setSbstncInstanceIdSys(String.valueOf(substanceinstanceidentifier.getSystem()));
		}
		/******************** Sbstnc_Instance_Id_Assigner ********************************************************************************/
		if(substanceinstanceidentifier.hasAssigner()) {
			s.setSbstncInstanceIdAssigner(String.valueOf(substanceinstanceidentifier.getAssigner()));
		}
		/******************** substanceinstanceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substanceinstanceidentifierperiod = substanceinstanceidentifier.getPeriod();

		/******************** Sbstnc_Instance_Id_Prd_End ********************************************************************************/
		if(substanceinstanceidentifierperiod.hasEnd()) {
			s.setSbstncInstanceIdPrdEnd(String.valueOf(substanceinstanceidentifierperiod.getEnd()));
		}
		/******************** Sbstnc_Instance_Id_Prd_Strt ********************************************************************************/
		if(substanceinstanceidentifierperiod.hasStart()) {
			s.setSbstncInstanceIdPrdStrt(String.valueOf(substanceinstanceidentifierperiod.getStart()));
		}
		/******************** substanceinstanceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substanceinstanceidentifieruse = substanceinstanceidentifier.getUse();
		s.setSbstncInstanceIdUse(substanceinstanceidentifieruse.toCode());

		/******************** substanceinstancequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substanceinstancequantity = substanceinstance.getQuantity();

		/******************** Sbstnc_Instance_Qnty_Vl ********************************************************************************/
		if(substanceinstancequantity.hasValue()) {
			s.setSbstncInstanceQntyVl(String.valueOf(substanceinstancequantity.getValue()));
		}
		/******************** substanceinstancequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substanceinstancequantitycomparator = substanceinstancequantity.getComparator();
		s.setSbstncInstanceQntyCmprtr(substanceinstancequantitycomparator.toCode());

		/******************** Sbstnc_Instance_Qnty_Cd ********************************************************************************/
		if(substanceinstancequantity.hasCode()) {
			s.setSbstncInstanceQntyCd(String.valueOf(substanceinstancequantity.getCode()));
		}
		/******************** Sbstnc_Instance_Qnty_Sys ********************************************************************************/
		if(substanceinstancequantity.hasSystem()) {
			s.setSbstncInstanceQntySys(String.valueOf(substanceinstancequantity.getSystem()));
		}
		/******************** Sbstnc_Instance_Qnty_Unt ********************************************************************************/
		if(substanceinstancequantity.hasUnit()) {
			s.setSbstncInstanceQntyUnt(String.valueOf(substanceinstancequantity.getUnit()));
		}
		/******************** Sbstnc_Instance_Expiry ********************************************************************************/
		if(substanceinstance.hasExpiry()) {
			s.setSbstncInstanceExpiry(String.valueOf(substanceinstance.getExpiry()));
		}
		/******************** substancestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Substance.FHIRSubstanceStatus substancestatus = substance.getStatus();
		s.setSbstncSts(substancestatus.toCode());

		/******************** Sbstnc_Dscrptn ********************************************************************************/
		if(substance.hasDescription()) {
			s.setSbstncDscrptn(String.valueOf(substance.getDescription()));
		}
		/******************** substancecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substancecategory = substance.getCategoryFirstRep();

		/******************** substancecategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substancecategorycoding = substancecategory.getCodingFirstRep();

		/******************** Sbstnc_Ctgry_Cdg_Dsply ********************************************************************************/
		if(substancecategorycoding.hasDisplay()) {
			s.setSbstncCtgryCdgDsply(String.valueOf(substancecategorycoding.getDisplay()));
		}
		/******************** Sbstnc_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(substancecategorycoding.hasVersion()) {
			s.setSbstncCtgryCdgVrsn(String.valueOf(substancecategorycoding.getVersion()));
		}
		/******************** Sbstnc_Ctgry_Cdg_Cd ********************************************************************************/
		if(substancecategorycoding.hasCode()) {
			s.setSbstncCtgryCdgCd(String.valueOf(substancecategorycoding.getCode()));
		}
		/******************** Sbstnc_Ctgry_Cdg_Sys ********************************************************************************/
		if(substancecategorycoding.hasSystem()) {
			s.setSbstncCtgryCdgSys(String.valueOf(substancecategorycoding.getSystem()));
		}
		/******************** Sbstnc_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(substancecategorycoding.hasUserSelected()) {
			s.setSbstncCtgryCdgUsrSltd(String.valueOf(substancecategorycoding.getUserSelected()));
		}
		/******************** Sbstnc_Ctgry_Txt ********************************************************************************/
		if(substancecategory.hasText()) {
			s.setSbstncCtgryTxt(String.valueOf(substancecategory.getText()));
		}
		/******************** substanceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substanceidentifier = substance.getIdentifierFirstRep();

		/******************** Sbstnc_Id_Vl ********************************************************************************/
		if(substanceidentifier.hasValue()) {
			s.setSbstncIdVl(String.valueOf(substanceidentifier.getValue()));
		}
		/******************** substanceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substanceidentifiertype = substanceidentifier.getType();

		/******************** substanceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substanceidentifiertypecoding = substanceidentifiertype.getCodingFirstRep();

		/******************** Sbstnc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(substanceidentifiertypecoding.hasDisplay()) {
			s.setSbstncIdTypCdgDsply(String.valueOf(substanceidentifiertypecoding.getDisplay()));
		}
		/******************** Sbstnc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(substanceidentifiertypecoding.hasVersion()) {
			s.setSbstncIdTypCdgVrsn(String.valueOf(substanceidentifiertypecoding.getVersion()));
		}
		/******************** Sbstnc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(substanceidentifiertypecoding.hasCode()) {
			s.setSbstncIdTypCdgCd(String.valueOf(substanceidentifiertypecoding.getCode()));
		}
		/******************** Sbstnc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(substanceidentifiertypecoding.hasSystem()) {
			s.setSbstncIdTypCdgSys(String.valueOf(substanceidentifiertypecoding.getSystem()));
		}
		/******************** Sbstnc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substanceidentifiertypecoding.hasUserSelected()) {
			s.setSbstncIdTypCdgUsrSltd(String.valueOf(substanceidentifiertypecoding.getUserSelected()));
		}
		/******************** Sbstnc_Id_Typ_Txt ********************************************************************************/
		if(substanceidentifiertype.hasText()) {
			s.setSbstncIdTypTxt(String.valueOf(substanceidentifiertype.getText()));
		}
		/******************** Sbstnc_Id_Sys ********************************************************************************/
		if(substanceidentifier.hasSystem()) {
			s.setSbstncIdSys(String.valueOf(substanceidentifier.getSystem()));
		}
		/******************** Sbstnc_Id_Assigner ********************************************************************************/
		if(substanceidentifier.hasAssigner()) {
			s.setSbstncIdAssigner(String.valueOf(substanceidentifier.getAssigner()));
		}
		/******************** substanceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substanceidentifierperiod = substanceidentifier.getPeriod();

		/******************** Sbstnc_Id_Prd_End ********************************************************************************/
		if(substanceidentifierperiod.hasEnd()) {
			s.setSbstncIdPrdEnd(String.valueOf(substanceidentifierperiod.getEnd()));
		}
		/******************** Sbstnc_Id_Prd_Strt ********************************************************************************/
		if(substanceidentifierperiod.hasStart()) {
			s.setSbstncIdPrdStrt(String.valueOf(substanceidentifierperiod.getStart()));
		}
		/******************** substanceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substanceidentifieruse = substanceidentifier.getUse();
		s.setSbstncIdUse(substanceidentifieruse.toCode());

		/******************** substanceingredient ********************************************************************************/
		org.hl7.fhir.r4.model.Substance.SubstanceIngredientComponent substanceingredient = substance.getIngredientFirstRep();

		/******************** substanceingredientsubstancecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substanceingredientsubstancecodeableconcept = substanceingredient.getSubstanceCodeableConcept();

		/******************** substanceingredientsubstancecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substanceingredientsubstancecodeableconceptcoding = substanceingredientsubstancecodeableconcept.getCodingFirstRep();

		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(substanceingredientsubstancecodeableconceptcoding.hasDisplay()) {
			s.setSbstncIgrdntSbstncCdbleCncptCdgDsply(String.valueOf(substanceingredientsubstancecodeableconceptcoding.getDisplay()));
		}
		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(substanceingredientsubstancecodeableconceptcoding.hasVersion()) {
			s.setSbstncIgrdntSbstncCdbleCncptCdgVrsn(String.valueOf(substanceingredientsubstancecodeableconceptcoding.getVersion()));
		}
		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(substanceingredientsubstancecodeableconceptcoding.hasCode()) {
			s.setSbstncIgrdntSbstncCdbleCncptCdgCd(String.valueOf(substanceingredientsubstancecodeableconceptcoding.getCode()));
		}
		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(substanceingredientsubstancecodeableconceptcoding.hasSystem()) {
			s.setSbstncIgrdntSbstncCdbleCncptCdgSys(String.valueOf(substanceingredientsubstancecodeableconceptcoding.getSystem()));
		}
		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(substanceingredientsubstancecodeableconceptcoding.hasUserSelected()) {
			s.setSbstncIgrdntSbstncCdbleCncptCdgUsrSltd(String.valueOf(substanceingredientsubstancecodeableconceptcoding.getUserSelected()));
		}
		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Txt ********************************************************************************/
		if(substanceingredientsubstancecodeableconcept.hasText()) {
			s.setSbstncIgrdntSbstncCdbleCncptTxt(String.valueOf(substanceingredientsubstancecodeableconcept.getText()));
		}
		/******************** Sbstnc_Igrdnt_SbstncRfrnc ********************************************************************************/
		if(substanceingredient.hasSubstanceReference()) {
			s.setSbstncIgrdntSbstncRfrnc(String.valueOf(substanceingredient.getSubstanceReference()));
		}
		/******************** substanceingredientquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio substanceingredientquantity = substanceingredient.getQuantity();

		/******************** substanceingredientquantitynumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substanceingredientquantitynumerator = substanceingredientquantity.getNumerator();

		/******************** Sbstnc_Igrdnt_Qnty_Nmrtr_Vl ********************************************************************************/
		if(substanceingredientquantitynumerator.hasValue()) {
			s.setSbstncIgrdntQntyNmrtrVl(String.valueOf(substanceingredientquantitynumerator.getValue()));
		}
		/******************** substanceingredientquantitynumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substanceingredientquantitynumeratorcomparator = substanceingredientquantitynumerator.getComparator();
		s.setSbstncIgrdntQntyNmrtrCmprtr(substanceingredientquantitynumeratorcomparator.toCode());

		/******************** Sbstnc_Igrdnt_Qnty_Nmrtr_Cd ********************************************************************************/
		if(substanceingredientquantitynumerator.hasCode()) {
			s.setSbstncIgrdntQntyNmrtrCd(String.valueOf(substanceingredientquantitynumerator.getCode()));
		}
		/******************** Sbstnc_Igrdnt_Qnty_Nmrtr_Sys ********************************************************************************/
		if(substanceingredientquantitynumerator.hasSystem()) {
			s.setSbstncIgrdntQntyNmrtrSys(String.valueOf(substanceingredientquantitynumerator.getSystem()));
		}
		/******************** Sbstnc_Igrdnt_Qnty_Nmrtr_Unt ********************************************************************************/
		if(substanceingredientquantitynumerator.hasUnit()) {
			s.setSbstncIgrdntQntyNmrtrUnt(String.valueOf(substanceingredientquantitynumerator.getUnit()));
		}
		/******************** substanceingredientquantitydenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity substanceingredientquantitydenominator = substanceingredientquantity.getDenominator();

		/******************** Sbstnc_Igrdnt_Qnty_Dnmntr_Vl ********************************************************************************/
		if(substanceingredientquantitydenominator.hasValue()) {
			s.setSbstncIgrdntQntyDnmntrVl(String.valueOf(substanceingredientquantitydenominator.getValue()));
		}
		/******************** substanceingredientquantitydenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator substanceingredientquantitydenominatorcomparator = substanceingredientquantitydenominator.getComparator();
		s.setSbstncIgrdntQntyDnmntrCmprtr(substanceingredientquantitydenominatorcomparator.toCode());

		/******************** Sbstnc_Igrdnt_Qnty_Dnmntr_Cd ********************************************************************************/
		if(substanceingredientquantitydenominator.hasCode()) {
			s.setSbstncIgrdntQntyDnmntrCd(String.valueOf(substanceingredientquantitydenominator.getCode()));
		}
		/******************** Sbstnc_Igrdnt_Qnty_Dnmntr_Sys ********************************************************************************/
		if(substanceingredientquantitydenominator.hasSystem()) {
			s.setSbstncIgrdntQntyDnmntrSys(String.valueOf(substanceingredientquantitydenominator.getSystem()));
		}
		/******************** Sbstnc_Igrdnt_Qnty_Dnmntr_Unt ********************************************************************************/
		if(substanceingredientquantitydenominator.hasUnit()) {
			s.setSbstncIgrdntQntyDnmntrUnt(String.valueOf(substanceingredientquantitydenominator.getUnit()));
		}
		return s;
	}
}
